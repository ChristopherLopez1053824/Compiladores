package com.compiladores;

import java.util.Scanner;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import com.compiladores.antlr.MiGramaticaLexer;
import com.compiladores.antlr.MiGramaticaParser;

import org.antlr.v4.gui.TreeViewer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Arrays;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
        final boolean[] errores = {false};
            try {
                String ruta = null;
                    if (ruta == null) {
                        System.out.println("\n¿Desea analizar un documento? (si/no)");
                        String respuesta = scanner.nextLine();
                        if (!respuesta.equalsIgnoreCase("si")) {
                            break;
                        }
                    }

                ruta = TxtManager.seleccionarArchivoTxt();
                CharStream input = CharStreams.fromFileName(ruta);
                System.out.println(
                        "--------------------------------------------------------------------------------------------");
                MiGramaticaLexer lexer = new MiGramaticaLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);

                tokens.fill();
                for (Token t : tokens.getTokens()) {
                    int tipo = t.getType();

                    if (tipo == MiGramaticaLexer.UNCLOSED_COMMENT) {
                        System.out.println("Error léxico en línea " + t.getLine() + ": comentario sin cerrar");
                        errores[0] = true;
                    }

                    else if (tipo == MiGramaticaLexer.INVALID_FLOAT) {
                        System.out.println("Error léxico en línea " + t.getLine() + ": número decimal mal formado -> "
                                + t.getText());
                        errores[0] = true;
                    }

                    else if (tipo == MiGramaticaLexer.INVALID_ID) {
                        System.out.println(
                                "Error léxico en línea " + t.getLine() + ": identificador inválido -> " + t.getText());
                        errores[0] = true;
                    }

                    else if (tipo == MiGramaticaLexer.UNCLOSED_CHAR) {
                        System.out.println(
                                "Error léxico en línea " + t.getLine() + ": carácter sin cerrar -> " + t.getText());
                        errores[0] = true;
                    }

                    else if (tipo == MiGramaticaLexer.UNCLOSED_STRING) {
                        System.out.println(
                                "Error léxico en línea " + t.getLine() + ": cadena sin cerrar -> " + t.getText());
                        errores[0] = true;
                    }

                    else if (tipo == MiGramaticaLexer.ERROR_CHAR) {
                        System.out.println(
                                "Error léxico en línea " + t.getLine() + ": carácter inválido -> " + t.getText());
                        errores[0] = true;
                    }

                    else {
                        String nombreToken = MiGramaticaLexer.VOCABULARY.getSymbolicName(tipo);
                        System.out.println("Token: " + nombreToken + " -> " + t.getText());
                    }
                }
                System.out.println(
                        "--------------------------------------------------------------------------------------------");
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
                        errores[0] = true;
                        mensaje = mensaje.replace("missing", "falta");
                        mensaje = mensaje.replace("at", "en");
                        mensaje = mensaje.replace("mismatched input", "entrada inesperada");
                        mensaje = mensaje.replace("mismenched input", "arreglo incorrecto");
                        mensaje = mensaje.replace("expecting", "se esperaba");

                        System.out.println("Error en línea " + line + ", columna " + charPositionInLine);
                        System.out.println(mensaje);
                    }
                });
                ParseTree tree = parser.programa();
                if (errores[0] == false) {
                    System.out.println("Creacion de arbol:");
                    System.out.println(tree.toStringTree(parser));

                    JFrame frame = new JFrame("Arbol visual");
                    JPanel panel = new JPanel();

                    TreeViewer viewer = new TreeViewer
                    (
                        Arrays.asList(parser.getRuleNames()),
                        tree
                    );

                    viewer.setScale(1.2);
                    panel.add(viewer);

                    frame.add(panel);
                    frame.setSize(1000, 700);
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.setVisible(true);

                    System.out.println(
                            "--------------------------------------------------------------------------------------------");

                    System.out.println("\nVisitando nodos:");
                    Traductor visitor = new Traductor();

                    visitor.visit(tree);
                }

            }

            catch (Exception e) {
                System.out.println("Error durante el análisis:");
                e.printStackTrace();

                
            }

        }
        System.out.println("Muchas gracias por usar el analizador.");
    }
}