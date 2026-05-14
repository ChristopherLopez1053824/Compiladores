package com.compiladores;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;

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

public class App {

        public static void main(String[] args) {

                if (args.length == 0) {

                        System.err.println(
                                        "Error: debes enviar un archivo .encantia");

                        System.exit(1);
                }

                String ruta = args[0];

                final boolean[] errores = { false };

                try {

                        String codigoCompleto = procesarImports(ruta);

                        CharStream input = CharStreams.fromString(codigoCompleto);

                        MiGramaticaLexer lexer = new MiGramaticaLexer(input);

                        CommonTokenStream tokens = new CommonTokenStream(lexer);

                        tokens.fill();

                        for (Token t : tokens.getTokens()) {

                                int tipo = t.getType();

                                if (tipo == Token.EOF) {
                                        continue;
                                }

                                if (tipo == MiGramaticaLexer.UNCLOSED_COMMENT) {

                                        System.err.println(
                                                        "Error léxico en línea " +
                                                                        t.getLine() +
                                                                        ": comentario sin cerrar");

                                        errores[0] = true;
                                }

                                else if (tipo == MiGramaticaLexer.INVALID_FLOAT) {

                                        System.err.println(
                                                        "Error léxico en línea " +
                                                                        t.getLine() +
                                                                        ": número decimal mal formado -> " +
                                                                        t.getText());

                                        errores[0] = true;
                                }

                                else if (tipo == MiGramaticaLexer.INVALID_ID) {

                                        System.err.println(
                                                        "Error léxico en línea " +
                                                                        t.getLine() +
                                                                        ": identificador inválido -> " +
                                                                        t.getText());

                                        errores[0] = true;
                                }

                                else if (tipo == MiGramaticaLexer.UNCLOSED_CHAR) {

                                        System.err.println(
                                                        "Error léxico en línea " +
                                                                        t.getLine() +
                                                                        ": carácter sin cerrar -> " +
                                                                        t.getText());

                                        errores[0] = true;
                                }

                                else if (tipo == MiGramaticaLexer.UNCLOSED_STRING) {

                                        System.err.println(
                                                        "Error léxico en línea " +
                                                                        t.getLine() +
                                                                        ": cadena sin cerrar -> " +
                                                                        t.getText());

                                        errores[0] = true;
                                }

                                else if (tipo == MiGramaticaLexer.ERROR_CHAR) {

                                        System.err.println(
                                                        "Error léxico en línea " +
                                                                        t.getLine() +
                                                                        ": carácter inválido -> " +
                                                                        t.getText());

                                        errores[0] = true;
                                }
                        }

                        if (errores[0]) {
                                System.exit(1);
                        }

                        tokens.seek(0);

                        MiGramaticaParser parser = new MiGramaticaParser(tokens);

                        parser.removeErrorListeners();

                        parser.addErrorListener(
                                        new BaseErrorListener() {

                                                @Override
                                                public void syntaxError(
                                                                Recognizer<?, ?> recognizer,
                                                                Object offendingSymbol,
                                                                int line,
                                                                int charPositionInLine,
                                                                String msg,
                                                                RecognitionException e) {

                                                        errores[0] = true;

                                                        String mensaje = msg;

                                                        mensaje = mensaje.replace(
                                                                        "missing",
                                                                        "falta");

                                                        mensaje = mensaje.replace(
                                                                        "at",
                                                                        "en");

                                                        mensaje = mensaje.replace(
                                                                        "mismatched input",
                                                                        "entrada inesperada");

                                                        mensaje = mensaje.replace(
                                                                        "expecting",
                                                                        "se esperaba");

                                                        System.err.println(
                                                                        "Error sintáctico en línea " +
                                                                                        line +
                                                                                        ", columna " +
                                                                                        charPositionInLine);

                                                        System.err.println(mensaje);
                                                }
                                        });

                        ParseTree tree = parser.programa();

                        if (errores[0]) {
                                System.exit(1);
                        }

                        TablaVisitor tablaVisitor = new TablaVisitor();

                        tablaVisitor.visit(tree);

                        if (tablaVisitor.hasError()) {

                                System.err.println(
                                                "Errores semánticos:");

                                System.err.println(
                                                tablaVisitor.getErroresSemanticos());

                                System.exit(1);
                        }

                        File archivoEntrada = new File(ruta);

                        File carpetaSalida = archivoEntrada.getParentFile();

                        if (carpetaSalida == null) {
                                carpetaSalida = new File(".");
                        }

                        File archivoJava = new File(
                                        carpetaSalida,
                                        "Programa.java");

                        PrintWriter writer = new PrintWriter(archivoJava);

                        Traductor traductor = new Traductor(writer);

                        traductor.visit(tree);

                        writer.close();

                        System.out.println(
                                        "Java generado correctamente.");

                        Process compileProcess = Runtime.getRuntime().exec(
                                        "javac " +
                                                        archivoJava.getAbsolutePath());

                        compileProcess.waitFor();

                        File classFile = new File(
                                        carpetaSalida,
                                        "Programa.class");

                        if (!classFile.exists()) {

                                BufferedReader errorReader = new BufferedReader(
                                                new InputStreamReader(
                                                                compileProcess.getErrorStream()));

                                String lineaError;

                                while ((lineaError = errorReader.readLine()) != null) {

                                        System.err.println(lineaError);
                                }

                                System.exit(1);
                        }

                        System.out.println(
                                        "Compilación Java correcta.");

                        Process runProcess = Runtime.getRuntime().exec(
                                        "java -cp " +
                                                        carpetaSalida.getAbsolutePath() +
                                                        " Programa");

                        BufferedReader reader = new BufferedReader(
                                        new InputStreamReader(
                                                        runProcess.getInputStream()));

                        String linea;

                        while ((linea = reader.readLine()) != null) {

                                System.out.println(linea);
                        }

                        runProcess.waitFor();

                        System.out.println(
                                        "Programa ejecutado correctamente.");

                        System.exit(0);

                }

                catch (Exception e) {

                        System.err.println(
                                        "Error durante el análisis:");

                        System.err.println(
                                        e.getMessage());

                        e.printStackTrace();

                        System.exit(1);
                }
        }

        private static String procesarImports(String rutaPrincipal) {

                try {

                        String contenidoPrincipal = java.nio.file.Files.readString(
                                        java.nio.file.Paths.get(rutaPrincipal));

                        File archivoPrincipal = new File(rutaPrincipal);

                        File carpetaBase = archivoPrincipal.getParentFile();

                        if (carpetaBase == null) {
                                carpetaBase = new File(".");
                        }

                        StringBuilder resultado = new StringBuilder();

                        String[] lineas = contenidoPrincipal.split("\\R");

                        for (String linea : lineas) {

                                String lineaTrim = linea.trim();

                                // convoca "archivo.encantia";

                                if (lineaTrim.startsWith("convoca")
                                                && lineaTrim.contains("\"")) {

                                        String archivoImportado = lineaTrim
                                                        .replace("convoca", "")
                                                        .replace(";", "")
                                                        .replace("\"", "")
                                                        .trim();

                                        String rutaImportada = new File(
                                                        carpetaBase,
                                                        archivoImportado).getAbsolutePath();

                                        String contenidoImportado = "";

                                        try {

                                                contenidoImportado = java.nio.file.Files.readString(
                                                                java.nio.file.Paths.get(
                                                                                rutaImportada));

                                        }

                                        catch (Exception e) {

                                                System.out.println(
                                                                "Error: no se encontró el archivo importado -> "
                                                                                + archivoImportado);

                                                return "";
                                        }

                                        resultado.append("\n");

                                        resultado.append(contenidoImportado);

                                        resultado.append("\n");
                                }

                                else {

                                        resultado.append(linea);

                                        resultado.append("\n");
                                }
                        }

                        return resultado.toString();

                }

                catch (Exception e) {

                        e.printStackTrace();

                        return "";
                }
        }
}