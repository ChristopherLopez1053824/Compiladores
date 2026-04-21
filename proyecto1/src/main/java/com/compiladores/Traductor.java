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
            String tipoParam = traducirTipo(ctx.parametro().tipo().getText());
            String idParam = ctx.parametro().ID().getText();
            System.out.print(tipoParam + " " + idParam);
        }

        System.out.println(")");

        visit(ctx.bloqueCodigo());

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
            case "intenso": return "int";
            case "fenix": return "float";
            case "dorado": return "double";
            case "chispa": return "char";
            case "bondad": return "boolean";
            case "Cancion": return "String";
            case "vasto": return "void";
        }
        return tipo;
    }
    
}         