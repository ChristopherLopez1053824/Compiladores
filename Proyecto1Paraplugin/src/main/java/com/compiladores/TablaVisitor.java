package com.compiladores;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.compiladores.antlr.*;

public class TablaVisitor extends MiGramaticaBaseVisitor<Void> {

    private TablaSimbolos tabla = new TablaSimbolos();
    private boolean error = false;
    private StringBuilder erroresSemanticos = new StringBuilder();
    Map<String, List<String>> funciones  = new HashMap<>();

    public TablaSimbolos getTabla() {
        return tabla;
    }

    public boolean hasError() {
        return error;
    }

    public String getErroresSemanticos() {
        return erroresSemanticos.toString();
    }

    // ================= PROGRAMA =================

    @Override
    public Void visitPrograma(MiGramaticaParser.ProgramaContext ctx) {
        return visitChildren(ctx);
    }

    // ================= BLOQUES =================

    @Override
    public Void visitBloqueCodigo(MiGramaticaParser.BloqueCodigoContext ctx) {

        for (MiGramaticaParser.SentenciaContext st : ctx.sentencia()) {
            visit(st);
        }

        return null;
    }

    // ================= DECLARACIÓN =================

    @Override
    public Void visitVariables(MiGramaticaParser.VariablesContext ctx) {

        String tipo = ctx.tipo().getText();
        String nombre = ctx.ID().getText();

        String valor = "null";

        // Si tiene asignación
        if (ctx.expresiones() != null) {
            valor = ctx.expresiones().getText();
        }

        // Verificar redeclaración
        if (tabla.getScopes().peek().containsKey(nombre)) {

            error = true;

            erroresSemanticos.append(
                "Error semántico: variable '"
                + nombre +
            "' ya declarada en este scope\n"
            );

            return null;
        }

        tabla.declarar(nombre, tipo, valor);

        if (ctx.expresiones() != null) {
            visit(ctx.expresiones());
        }

        return null;
    }

    // ================= ASIGNACIÓN =================

    @Override
    public Void visitAsignacion(MiGramaticaParser.AsignacionContext ctx) {

        String nombre = ctx.ID().getText();

        // Verificar existencia
        if (!tabla.existe(nombre)) {

            error = true;

            erroresSemanticos.append(
                "Error semántico: variable '"
                + nombre +
                "' no declarada"
            );

            return null;
        }

        return visitChildren(ctx);
    }

    // ================= USO DE IDS =================

    @Override
    public Void visitExpresionUnaria(MiGramaticaParser.ExpresionUnariaContext ctx) {

        // Verificar uso de variable
        if (ctx.ID() != null) {

            String nombre = ctx.ID().getText();

            if (!tabla.existe(nombre)) {

                error = true;

                erroresSemanticos.append(
                    "Error semántico: variable '" +
                    nombre +
                    "' no declarada\n"
                );
            }
        }

        return visitChildren(ctx);
    }

    // ================= FUNCIONES =================

    @Override
    public Void visitFunciones(MiGramaticaParser.FuncionesContext ctx) {
    String nombreFuncion = ctx.ID().getText();

    List<String> tiposParametros = new ArrayList<>();

    for (MiGramaticaParser.ParametroContext p : ctx.parametro()) {
        tiposParametros.add(p.tipo().getText());
    }

    funciones.put(nombreFuncion, tiposParametros);
    
    tabla.entrarScope();

        // Parámetros
        for (MiGramaticaParser.ParametroContext p : ctx.parametro()) {

            String tipo = p.tipo().getText();
            String nombre = p.ID().getText();

            tabla.declarar(nombre, tipo, "param");
        }

        visit(ctx.bloqueCodigo());

        tabla.salirScope();

        return null;
    }

    // ================= INPUT =================

    @Override
    public Void visitInputDentro(MiGramaticaParser.InputDentroContext ctx) {

        String nombre = ctx.ID().getText();

        if (!tabla.existe(nombre)) {

            error = true;

            erroresSemanticos.append(
                "Error semántico: variable '" +
                nombre +
                "' no declarada para leer\n"
            );
        }

        return null;
    }


    private String obtenerTipo(MiGramaticaParser.ExpresionesContext ctx) {
    String texto = ctx.getText();

        // Enteros
        if (texto.matches("[0-9]+")) {
            return "intenso";
        }

        // Float
        if (texto.matches("[0-9]+\\.[0-9]+")) {
            return "fenix";
        }

        // Strings
        if (texto.startsWith("\"") && texto.endsWith("\"")) {
            return "Cancion";
        }

        // Booleanos
        if (texto.equals("true") || texto.equals("false")) {
            return "bondad";
        }

        // Variables
        if (tabla.existe(texto)) {

            Simbolo s = tabla.obtener(texto);
            return s.tipo;
        }

        return "desconocido";
    }

    @Override
    public Void visitLlamadaFuncion(MiGramaticaParser.LlamadaFuncionContext ctx) {

    String nombreFuncion = ctx.ID().getText();

    int parametrosRecibidos = ctx.expresiones().size();

    // Verificar existencia
    if (!funciones.containsKey(nombreFuncion)) {

        error = true;

        erroresSemanticos.append(
            "Error semántico: la función '"
            + nombreFuncion +
            "' no existe\n"
        );

        return null;
    }

    List<String> tiposEsperados = funciones.get(nombreFuncion);

    int parametrosEsperados = tiposEsperados.size();

    // Verificar cantidad
    if (parametrosRecibidos != parametrosEsperados) {

        error = true;

        erroresSemanticos.append(
            "Error semántico: la función '"
            + nombreFuncion +
            "' esperaba "
            + parametrosEsperados +
            " parámetro(s) y recibió "
            + parametrosRecibidos +
            "\n"
        );

        return null;
    }

    // Verificar tipos
    for (int i = 0; i < parametrosRecibidos; i++) {

        String tipoEsperado = tiposEsperados.get(i);
        String tipoRecibido = obtenerTipo(ctx.expresiones(i));
        boolean compatibles = false;

        // mismos tipos
    if (tipoEsperado.equals(tipoRecibido)) {
        compatibles = true;
    }

    // compatibilidad numérica
    else if ((tipoEsperado.equals("intenso") || tipoEsperado.equals("fenix") || tipoEsperado.equals("dorado"))
        && (tipoRecibido.equals("intenso") || tipoRecibido.equals("fenix") || tipoRecibido.equals("dorado")))
    {
        compatibles = true;
    }

    if (!compatibles) {

        error = true;
        erroresSemanticos.append(
        "Error semántico: los parámetros de la función '" + nombreFuncion + "' no coinciden\n");
        break;
    }
        }

        return visitChildren(ctx);
    }
}