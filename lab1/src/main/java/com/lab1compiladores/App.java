package com.lab1compiladores;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
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
                } else {
                    CharStream input = CharStreams.fromFileName(ruta);
                    MiGramaticaLexer lexer = new MiGramaticaLexer(input);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);

                    tokens.fill();
                    System.out.println("\n---- Tokens ----");
                    for (Token token : tokens.getTokens()) {
                        String nombreToken = MiGramaticaLexer.VOCABULARY
                                .getSymbolicName(token.getType());

                        System.out.println(
                                "Token: " + nombreToken +
                                " | Texto: " + token.getText()
                        );
                    }
                    List<String> lineas = Files.readAllLines(Paths.get(ruta));
                    int numLinea = 1;

                    for (String linea : lineas) {

                        if (linea.trim().isEmpty()) {
                            numLinea++;
                            continue;
                        }

                        CharStream inputLinea = CharStreams.fromString(linea + "\n");
                        MiGramaticaLexer lexerLinea = new MiGramaticaLexer(inputLinea);
                        CommonTokenStream tokensLinea = new CommonTokenStream(lexerLinea);
                        MiGramaticaParser parserLinea = new MiGramaticaParser(tokensLinea);
                        parserLinea.removeErrorListeners();
                        parserLinea.addErrorListener(new BaseErrorListener() {
                            @Override
                            public void syntaxError(
                                    Recognizer<?, ?> recognizer,
                                    Object offendingSymbol,
                                    int line,
                                    int charPositionInLine,
                                    String msg,
                                    RecognitionException e) {
                                throw new RuntimeException("Error sintáctico");
                            }
                        });

                        try {
                            parserLinea.prog();
                            System.out.println("Línea " + numLinea + " correcta");
                        } catch (Exception e) {
                            System.out.println("Error en línea " + numLinea);
                        }

                        numLinea++;
                    }
                }

            } catch (Exception e) {
                System.out.println("Error durante el análisis:");
                e.printStackTrace();
            }

            // Repetir análisis
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
