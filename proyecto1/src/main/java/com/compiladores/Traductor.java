package com.compiladores;

import com.compiladores.antlr.MiGramaticaBaseVisitor;
import com.compiladores.antlr.MiGramaticaParser;

public class Traductor extends MiGramaticaBaseVisitor<Void> {

    // -------- PROGRAMA --------
    @Override
    public Void visitPrograma(MiGramaticaParser.ProgramaContext ctx) {

        System.out.println("public class Programa {");

        // funciones
        for (var f : ctx.funciones()) {
            visit(f);
        }

        // main
        visit(ctx.main());

        System.out.println("}");

        return null;
    }

    @Override
    public Void visitMain(MiGramaticaParser.MainContext ctx) {
        System.out.println("public static void main(String[] args)");
        visit(ctx.bloqueCodigo());
        return null;
    }

    // -------- FUNCIONES --------
    @Override
    public Void visitFunciones(MiGramaticaParser.FuncionesContext ctx) {

        String tipo = traducirTipo(ctx.tipo().getText());
        String nombre = ctx.ID().getText();

        System.out.print("public static " + tipo + " " + nombre + "(");

        if (ctx.parametro() != null) {
            for (int i = 0; i < ctx.parametro().size(); i++) {
                var p = ctx.parametro(i);
                String tipoParam = traducirTipo(p.tipo().getText());
                String idParam = p.ID().getText();

                System.out.print(tipoParam + " " + idParam);

                if (i < ctx.parametro().size() - 1) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println(")");

        visit(ctx.bloqueCodigo());

        return null;
    }

    // -------- VARIABLES --------
    @Override
    public Void visitVariables(MiGramaticaParser.VariablesContext ctx) {

        String tipo = traducirTipo(ctx.tipo().getText());
        String id = ctx.ID().getText();

        if (ctx.expresiones() != null) {
            System.out.println(tipo + " " + id + " = " + ctx.expresiones().getText() + ";");
        } else {
            System.out.println(tipo + " " + id + ";");
        }

        return null;
    }

    @Override
    public Void visitAsignacion(MiGramaticaParser.AsignacionContext ctx) {
        System.out.println(ctx.ID().getText() + " = " + ctx.expresiones().getText() + ";");
        return null;
    }

    // -------- CONTROL --------
    @Override
    public Void visitCondicional(MiGramaticaParser.CondicionalContext ctx) {

        System.out.println("if (" + ctx.expresiones().getText() + ")");
        visit(ctx.bloqueCodigo(0));

        if (ctx.ELSE() != null) {
            System.out.println("else");
            visit(ctx.bloqueCodigo(1));
        }

        return null;
    }

    @Override
    public Void visitCicloWhile(MiGramaticaParser.CicloWhileContext ctx) {

        System.out.println("while (" + ctx.expresiones().getText() + ")");
        visit(ctx.bloqueCodigo());

        return null;
    }

    @Override
    public Void visitCicloFor(MiGramaticaParser.CicloForContext ctx) {

        String init = ctx.getChild(2).getText();
        String cond = ctx.expresiones(0) != null ? ctx.expresiones(0).getText() : "";
        String update = ctx.expresiones(1) != null ? ctx.expresiones(1).getText() : "";

        System.out.println("for (" + init + " " + cond + "; " + update + ")");
        visit(ctx.bloqueCodigo());

        return null;
    }

    // -------- FUNCIONES INTERNAS --------
    @Override
    public Void visitReturnDentro(MiGramaticaParser.ReturnDentroContext ctx) {

        if (ctx.expresiones() != null) {
            System.out.println("return " + ctx.expresiones().getText() + ";");
        } else {
            System.out.println("return;");
        }

        return null;
    }

    @Override
    public Void visitPrintDentro(MiGramaticaParser.PrintDentroContext ctx) {

        if (ctx.expresiones() != null) {
            System.out.println("System.out.println(" + ctx.expresiones().getText() + ");");
        } else {
            System.out.println("System.out.println();");
        }

        return null;
    }

    @Override
    public Void visitInputDentro(MiGramaticaParser.InputDentroContext ctx) {
        System.out.println("// lectura no implementada directamente");
        return null;
    }

    // -------- BLOQUES --------
    @Override
    public Void visitBloqueCodigo(MiGramaticaParser.BloqueCodigoContext ctx) {
        System.out.println("{");

        for (var s : ctx.sentencia()) {
            visit(s);
        }

        System.out.println("}");
        return null;
    }

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