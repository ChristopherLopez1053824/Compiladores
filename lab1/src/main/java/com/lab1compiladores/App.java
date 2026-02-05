package com.lab1compiladores;

import java.util.Scanner;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;


public class App 
{
    public static void main( String[] args )
    {
      Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            try {

                //Se selecciona el archivo que se desea analizar
                String ruta = TxtManager.seleccionarArchivoTxt();

                if (ruta == null) {
                    System.out.println("No se selecciono ningun archivo");
                } else {

                    //Es lo que usa el ANTRL para poder leer los caracteres 
                    CharStream input = CharStreams.fromFileName(ruta);

                    //Es creada por ANTRL para hacer convertir en tokens
                    MiGramaticaLexer lexer = new MiGramaticaLexer(input);

                    //Guarda los tokens en el orden que el parser necesite
                    CommonTokenStream tokens = new CommonTokenStream(lexer);

                    //Genere y recorre token para obtener su tipo e imprimirlo
                    tokens.fill();
                    System.out.println("\n----Tokens----");
                    for (Token token : tokens.getTokens()) {
                        String nombreToken = MiGramaticaLexer.VOCABULARY
                                .getSymbolicName(token.getType());

                        System.out.println(
                                "Token: " + nombreToken +
                                " | Texto: " + token.getText()
                        );
                    }

                    //Trabaja con los tokens que se generaron para el parser 
                    MiGramaticaParser parser = new MiGramaticaParser(tokens);

                    //Va analizando desde el inicio y verifica que cumpla la estructura 
                    parser.prog();

                    System.out.println("\nLa estructura si cumple\n");
                }

            } catch (Exception e) {
                System.out.println("Error del analisis:");
                e.printStackTrace();
            }

            //Se le pregunta al usuario si quiere analizar otro documento
            System.out.println("¿Desea analizar otro documento? (si/no)");
            String respuesta = scanner.nextLine();

            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }

        System.out.println("Muchas gracias por analizar sus documentos con nosotros");
        scanner.close();
    }
}
