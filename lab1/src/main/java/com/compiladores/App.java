package com.compiladores;

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

import com.compiladores.antlr.MiGramaticaLexer;


public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        // Mapas para almacenar tipos y valores de variables
        Map<String, String> tiposVariables = new HashMap<>();
        Map<String, Integer> valoresVariables = new HashMap<>();

        while (continuar) {
            try {
                // Selección de archivo
                String ruta = TxtManager.seleccionarArchivoTxt();
                if (ruta == null) {
                    System.out.println("No se seleccionó ningún archivo.");
                    continue;
                }

                List<String> lineas = Files.readAllLines(Paths.get(ruta));
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

                    boolean errorLinea = false;

                    // Procesar declaraciones y mostrar tokens
                    for (Token t : tokens.getTokens()) {
                        if (t.getType() == Token.EOF || t.getType() == MiGramaticaLexer.WS
                                || t.getType() == MiGramaticaLexer.COMMENT)
                            continue;

                        String tipo = MiGramaticaLexer.VOCABULARY.getSymbolicName(t.getType());
                        String texto = t.getText();
                        String estado = "válido";

                        // Declaración de variables
                        if ("BIN_ID".equals(tipo) || "B4_ID".equals(tipo) || "HEX_ID".equals(tipo)) {
                            int index = tokens.getTokens().indexOf(t);
                            if (tokens.getTokens().size() > index + 3) {
                                Token idToken = tokens.getTokens().get(index + 1);
                                Token valorToken = tokens.getTokens().get(index + 3);
                                tiposVariables.put(idToken.getText(), tipo);

                                int valorDecimal = ShuntingYard.convertirValor(tipo, valorToken.getText());
                                if (valorDecimal == -1) {
                                    estado = "¡Error: valor no coincide con tipo!";
                                    errorLinea = true;
                                } else {
                                    valoresVariables.put(idToken.getText(), valorDecimal);
                                }
                            }
                        }

                        // Variables en expresiones
                        if ("ID".equals(tipo) && !tiposVariables.containsKey(texto)) {
                            estado = "¡Error: variable no declarada!";
                            errorLinea = true;
                        }

                        System.out.println("Token: " + tipo + " | Texto: " + texto + " | " + estado);
                    }

                    // Preparar tokens para Shunting Yard
                    List<Token> exprTokens = ShuntingYard.prepararTokens(tokens.getTokens(), valoresVariables);

                    // Evaluar la expresión
                    if (!exprTokens.isEmpty()) {
                        List<Token> rpn = ShuntingYard.convertir(exprTokens);
                        System.out.print("RPN: ");
                        for (Token t : rpn) System.out.print(t.getText() + " ");
                        System.out.println();

                        try {
                            int resultado = ShuntingYard.evaluarRPN(rpn);
                            System.out.println("Resultado: " + resultado);
                        } catch (Exception e) {
                            System.out.println("¡Error al evaluar la expresión!");
                            errorLinea = true;
                        }
                    }

                    if (!errorLinea && !exprTokens.isEmpty()) {
                        System.out.println("Línea " + numLinea + " válida");
                    } else if (!exprTokens.isEmpty()) {
                        System.out.println("Línea " + numLinea + " con errores");
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
}
