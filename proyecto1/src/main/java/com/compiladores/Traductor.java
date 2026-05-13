package com.compiladores;

import java.io.PrintWriter;

import com.compiladores.antlr.MiGramaticaBaseVisitor;
import com.compiladores.antlr.MiGramaticaParser;

public class Traductor extends MiGramaticaBaseVisitor<Void> {

    private PrintWriter writer;

    public Traductor(PrintWriter writer) {
        this.writer = writer;
    }

    private void imprimir(String texto) {
        writer.println(texto);
    }

    // -------- PROGRAMA --------
    @Override
    public Void visitPrograma(MiGramaticaParser.ProgramaContext ctx) {

        imprimir("public class Programa {");

        // funciones
        for (var f : ctx.funciones()) {
            visit(f);
        }

        // main
        visit(ctx.main());

        imprimir("}");

        return null;
    }

    @Override
    public Void visitMain(MiGramaticaParser.MainContext ctx) {

        imprimir("public static void main(String[] args)");

        visit(ctx.bloqueCodigo());

        return null;
    }

    // -------- FUNCIONES --------
    @Override
    public Void visitFunciones(MiGramaticaParser.FuncionesContext ctx) {

        String tipo = traducirTipo(ctx.tipo().getText());
        String nombre = ctx.ID().getText();

        String parametros = "";

        if (ctx.parametro() != null) {

            for (int i = 0; i < ctx.parametro().size(); i++) {

                var p = ctx.parametro(i);

                String tipoParam = traducirTipo(p.tipo().getText());
                String idParam = p.ID().getText();

                parametros += tipoParam + " " + idParam;

                if (i < ctx.parametro().size() - 1) {
                    parametros += ", ";
                }
            }
        }

        imprimir("public static " + tipo + " " + nombre + "(" + parametros + ")");

        visit(ctx.bloqueCodigo());

        return null;
    }

    // -------- VARIABLES --------
    @Override
    public Void visitVariables(MiGramaticaParser.VariablesContext ctx) {

        String tipo = traducirTipo(ctx.tipo().getText());
        String id = ctx.ID().getText();

        if (ctx.expresiones() != null) {
            imprimir(tipo + " " + id + " = " + ctx.expresiones().getText() + ";");
        } else {
            imprimir(tipo + " " + id + ";");
        }

        return null;
    }

    @Override
    public Void visitAsignacion(MiGramaticaParser.AsignacionContext ctx) {

        imprimir(ctx.ID().getText() + " = " + ctx.expresiones().getText() + ";");

        return null;
    }

    // -------- CONTROL --------
    @Override
    public Void visitCondicional(MiGramaticaParser.CondicionalContext ctx) {

        imprimir("if (" + ctx.expresiones().getText() + ")");

        visit(ctx.bloqueCodigo(0));

        if (ctx.ELSE() != null) {

            imprimir("else");

            visit(ctx.bloqueCodigo(1));
        }

        return null;
    }

    @Override
    public Void visitCicloWhile(MiGramaticaParser.CicloWhileContext ctx) {

        imprimir("while (" + ctx.expresiones().getText() + ")");

        visit(ctx.bloqueCodigo());

        return null;
    }

    @Override
    public Void visitCicloFor(MiGramaticaParser.CicloForContext ctx) {

        String init = ctx.getChild(2).getText();
        String cond = ctx.expresiones(0) != null ? ctx.expresiones(0).getText() : "";
        String update = ctx.expresiones(1) != null ? ctx.expresiones(1).getText() : "";

        imprimir("for (" + init + " " + cond + "; " + update + ")");

        visit(ctx.bloqueCodigo());

        return null;
    }

    // -------- FUNCIONES INTERNAS --------
    @Override
    public Void visitReturnDentro(MiGramaticaParser.ReturnDentroContext ctx) {

        if (ctx.expresiones() != null) {
            imprimir("return " + ctx.expresiones().getText() + ";");
        } else {
            imprimir("return;");
        }

        return null;
    }

    @Override
    public Void visitPrintDentro(MiGramaticaParser.PrintDentroContext ctx) {

        if (ctx.expresiones() != null) {
            imprimir("System.out.println(" + ctx.expresiones().getText() + ");");
        } else {
            imprimir("System.out.println();");
        }

        return null;
    }

    @Override
    public Void visitInputDentro(MiGramaticaParser.InputDentroContext ctx) {

        imprimir("// lectura no implementada directamente");

        return null;
    }

    // -------- BLOQUES --------
    @Override
    public Void visitBloqueCodigo(MiGramaticaParser.BloqueCodigoContext ctx) {

        imprimir("{");

        for (var s : ctx.sentencia()) {
            visit(s);
        }

        imprimir("}");

        return null;
    }

    // -------- TIPOS --------
    private String traducirTipo(String tipo) {

        switch (tipo) {

            case "intenso":
                return "int";

            case "fenix":
                return "float";

            case "dorado":
                return "double";

            case "chispa":
                return "char";

            case "bondad":
                return "boolean";

            case "Cancion":
                return "String";

            case "vasto":
                return "void";
        }

        return tipo;
    }
}