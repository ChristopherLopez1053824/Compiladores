package com.lab1compiladores;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                String ruta = TxtManager.seleccionarArchivoTxt();
                if (ruta == null) {
                    System.out.println("No se seleccionó ningún archivo.");
                    continue;
                }

                // Leer todo el archivo
                List<String> lineas = Files.readAllLines(Paths.get(ruta));
                Map<String, String> variables = new HashMap<>();
                int numLinea = 1;

                for (String linea : lineas) {
                    if (linea.trim().isEmpty() || linea.trim().startsWith("#")) {
                        numLinea++;
                        continue;
                    }

                    System.out.println("\n--- Línea " + numLinea + " ---");
                    CharStream input = CharStreams.fromString(linea + "\n");
                    MiGramaticaLexer lexer = new MiGramaticaLexer(input);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    tokens.fill();

                    // Mostrar tokens y validarlos
                    for (Token t : tokens.getTokens()) {
                        if (t.getType() == Token.EOF) continue;

                        String tipo = MiGramaticaLexer.VOCABULARY.getSymbolicName(t.getType());
                        if (tipo == null) tipo = "DESCONOCIDO";
                        String texto = t.getText();
                        String estado = "válido";

                        // Validar declaraciones
                        if ("BIN_ID".equals(tipo) || "B4_ID".equals(tipo) || "HEX_ID".equals(tipo)) {
                            int index = tokens.getTokens().indexOf(t);
                            if (tokens.getTokens().size() > index + 3) {
                                Token idToken = tokens.getTokens().get(index + 1);
                                Token valorToken = tokens.getTokens().get(index + 3);
                                variables.put(idToken.getText(), tipo);

                                if (!validarBase(tipo, valorToken.getText())) {
                                    estado = "¡ERROR: valor no coincide con tipo!";
                                }
                            }
                        }

                        // Validar IDs en expresiones
                        if ("ID".equals(tipo) && !variables.containsKey(texto)) {
                            estado = "¡ERROR: variable no declarada!";
                        }

                        System.out.println("Token: " + tipo + " | Texto: " + texto + " | " + estado);
                    }

                    // Convertir expresión a RPN si hay tokens de expresión
                    List<Token> exprTokens = tokens.getTokens().stream()
                            .filter(t -> t.getType() != Token.EOF &&
                                    (t.getType() == MiGramaticaLexer.ID ||
                                     t.getType() == MiGramaticaLexer.BINARIO ||
                                     t.getType() == MiGramaticaLexer.BASE4 ||
                                     t.getType() == MiGramaticaLexer.HEX ||
                                     t.getType() == MiGramaticaLexer.PLUS ||
                                     t.getType() == MiGramaticaLexer.MINUS ||
                                     t.getType() == MiGramaticaLexer.MUL ||
                                     t.getType() == MiGramaticaLexer.DIV ||
                                     t.getType() == MiGramaticaLexer.LPAREN ||
                                     t.getType() == MiGramaticaLexer.RPAREN))
                            .toList();

                    if (!exprTokens.isEmpty()) {
                        List<Token> rpn = ShuntingYard.convertir(exprTokens);
                        System.out.print("RPN: ");
                        for (Token t : rpn) System.out.print(t.getText() + " ");
                        System.out.println();
                    }

                    numLinea++;
                }

            } catch (Exception e) {
                System.out.println("Error durante el análisis:");
                e.printStackTrace();
            }

            System.out.println("\n¿Desea analizar otro documento? (si/no)");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }

        System.out.println("Muchas gracias por usar el analizador.");
        scanner.close();
    }

    // Validar que el número concuerde con la base
    private static boolean validarBase(String tipo, String valor) {
        switch (tipo) {
            case "BIN_ID": return valor.matches("[01]+");
            case "B4_ID":  return valor.matches("[0-3]+");
            case "HEX_ID": return valor.matches("[0-9A-Fa-f]+");
            default: return false;
        }
    }
}
