package com.compiladores;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import com.compiladores.antlr.MiGramaticaLexer;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar)
        {
            try {
                String ruta = TxtManager.seleccionarArchivoTxt();
                if (ruta == null)
                {
                    if (ruta == null) {
                        System.out.println("\n¿Desea analizar un documento? (si/no)");
                        String respuesta = scanner.nextLine();
                        if (!respuesta.equalsIgnoreCase("si")) {
                            break;
                        }
                        continue;
                    }
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

                    for (Token t : tokens.getTokens()) {
                        if (t.getType() == Token.EOF || t.getType() == MiGramaticaLexer.WS
                                || t.getType() == MiGramaticaLexer.BLOCK_COMMENT || t.getType() == MiGramaticaLexer.LINE_COMMENT)
                            continue;

                        String tipo = MiGramaticaLexer.VOCABULARY.getSymbolicName(t.getType());
                        String valor = t.getText();
                        String estado = "válido";
                        // Si no existe nombre simbólico conocido, considerarlo error
                        if (t.getType() == MiGramaticaLexer.ERROR_CHAR) {
                            estado = "inválido";
                        }
                        System.out.println("Token: " + valor + " | Tipo: " + tipo);
                        System.out.println("Estado: " + estado);
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
