package com.compiladores;

import java.util.Scanner;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

import com.compiladores.antlr.MiGramaticaLexer;
import com.compiladores.antlr.MiGramaticaParser;


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

                CharStream input = CharStreams.fromFileName(ruta);
                System.out.println("--------------------------------------------------------------------------------------------");
                MiGramaticaLexer lexer = new MiGramaticaLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
               
                tokens.fill();
                for (Token t : tokens.getTokens()) {
                        int tipo = t.getType();

                        if (tipo == MiGramaticaLexer.UNCLOSED_COMMENT) {
                            System.out.println("Error léxico en línea " + t.getLine() +": comentario sin cerrar");
                        }

                        else if (tipo == MiGramaticaLexer.INVALID_FLOAT) {
                            System.out.println("Error léxico en línea " + t.getLine() +": número decimal mal formado -> " + t.getText());
                        }

                        else if (tipo == MiGramaticaLexer.INVALID_ID) {
                            System.out.println("Error léxico en línea " + t.getLine() +": identificador inválido -> " + t.getText());
                        }

                        else if (tipo == MiGramaticaLexer.UNCLOSED_CHAR) {
                            System.out.println("Error léxico en línea " + t.getLine() +": carácter sin cerrar -> " + t.getText());
                        }

                        else if (tipo == MiGramaticaLexer.UNCLOSED_STRING) {
                            System.out.println("Error léxico en línea " + t.getLine() +": cadena sin cerrar -> " + t.getText());
                        }

                        else if (tipo == MiGramaticaLexer.ERROR_CHAR) {
                            System.out.println("Error léxico en línea " + t.getLine() +": carácter inválido -> " + t.getText());
                        }

                        else{
                            String nombreToken = MiGramaticaLexer.VOCABULARY.getSymbolicName(tipo);
                            System.out.println("Token: " + nombreToken + " -> " + t.getText());
                        }
                    }
                System.out.println("--------------------------------------------------------------------------------------------");
                tokens.seek(0);
                MiGramaticaParser parser = new MiGramaticaParser(tokens);
                parser.removeErrorListeners();
                parser.addErrorListener(new BaseErrorListener() {
                    @Override
                    public void syntaxError(Recognizer<?, ?> recognizer,
                                            Object offendingSymbol,
                                            int line, int charPositionInLine,
                                            String msg,
                                            RecognitionException e) {

                        String mensaje = msg;
                        mensaje = mensaje.replace("missing", "falta");
                        mensaje = mensaje.replace("at", "en");
                        mensaje = mensaje.replace("mismatched input", "entrada inesperada");
                        mensaje = mensaje.replace("mismenched input", "arreglo incorrecto");
                        mensaje = mensaje.replace("expecting", "se esperaba");

                        System.out.println("Error en línea " + line +", columna " + charPositionInLine);
                        System.out.println(mensaje);
                    }
                });
                parser.programa();
        }

        catch (Exception e) {
                System.out.println("Error durante el análisis:");
                e.printStackTrace();
        
        System.out.println("Muchas gracias por usar el analizador.");
        scanner.close();
    }

        }}}