package com.compiladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.compiladores.antlr.MiGramaticaBaseVisitor;
import com.compiladores.antlr.MiGramaticaParser;

public class TablaVisitor extends MiGramaticaBaseVisitor<Void> {

    private TablaSimbolos tabla = new TablaSimbolos();
    private boolean error = false;
    private StringBuilder erroresSemanticos = new StringBuilder();
    Map<String, List<String>> funciones = new HashMap<>();
    Map<String, String> tiposFunciones = new HashMap<>();
    private String tipoFuncionActual = null;

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

        if (tabla.getScopes().peek().containsKey(nombre)) {

            marcarError(
                    "Error semántico: variable '" +
                            nombre +
                            "' ya declarada en este scope\n");

            return null;
        }

        if (ctx.expresiones() != null) {

            valor = ctx.expresiones().getText();

            String tipoValor = obtenerTipo(ctx.expresiones());

            if (!tipo.equals(tipoValor)) {
                marcarError(
                        "Error semántico: no se puede asignar " +
                                tipoValor +
                                " a variable de tipo " +
                                tipo +
                                " -> " +
                                nombre +
                                "\n");
            }
        }

        tabla.declarar(nombre, tipo, valor);

        return null;
    }

    // ================= ASIGNACIÓN =================

    @Override
    public Void visitAsignacion(MiGramaticaParser.AsignacionContext ctx) {

        String nombre = ctx.ID().getText();

        if (!tabla.existe(nombre)) {

            marcarError(
                    "Error semántico: variable '" +
                            nombre +
                            "' no declarada\n");

            return null;
        }

        String tipoVariable = tabla.obtener(nombre).tipo;
        String tipoValor = obtenerTipo(ctx.expresiones());

        if (!tipoVariable.equals(tipoValor)) {

            marcarError(
                    "Error semántico: no se puede asignar " +
                            tipoValor +
                            " a variable de tipo " +
                            tipoVariable +
                            " -> " +
                            nombre +
                            "\n");
        }

        return null;
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
                                "' no declarada\n");
            }
        }

        return visitChildren(ctx);
    }

    // ================= FUNCIONES =================

    @Override
public Void visitFunciones(MiGramaticaParser.FuncionesContext ctx) {

    String nombreFuncion = ctx.ID().getText();
    String tipoRetorno = ctx.tipo().getText();

    List<String> tiposParametros = new ArrayList<>();

    for (MiGramaticaParser.ParametroContext p : ctx.parametro()) {
        tiposParametros.add(p.tipo().getText());
    }

    funciones.put(nombreFuncion, tiposParametros);

    String tipoAnterior = tipoFuncionActual;
    tipoFuncionActual = tipoRetorno;

    tabla.entrarScope();

    for (MiGramaticaParser.ParametroContext p : ctx.parametro()) {

        String tipo = p.tipo().getText();
        String nombre = p.ID().getText();

        tabla.declarar(nombre, tipo, "param");
    }

    visit(ctx.bloqueCodigo());

    tabla.salirScope();

    tipoFuncionActual = tipoAnterior;

    return null;
}

@Override
public Void visitReturnDentro(MiGramaticaParser.ReturnDentroContext ctx) {

    if (tipoFuncionActual == null) {
        return null;
    }

    if (ctx.expresiones() == null) {

        if (!tipoFuncionActual.equals("vasto")) {

            error = true;

            erroresSemanticos.append(
                "Error semántico: la función debe retornar "
                + tipoFuncionActual
                + "\n"
            );
        }

        return null;
    }

    String tipoRetornado = obtenerTipo(ctx.expresiones());

    if (!tipoFuncionActual.equals(tipoRetornado)) {

        error = true;

        erroresSemanticos.append(
            "Error semántico: la función retorna "
            + tipoRetornado
            + " pero debe retornar "
            + tipoFuncionActual
            + "\n"
        );
    }

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
                            "' no declarada para leer\n");
        }

        return null;
    }

    private String obtenerTipo(MiGramaticaParser.ExpresionesContext ctx) {
        return tipoLogica(ctx.expresionLogica());
    }

    private String tipoLogica(MiGramaticaParser.ExpresionLogicaContext ctx) {

        String tipo = tipoIgualdad(ctx.expresionIgualdad(0));

        for (int i = 1; i < ctx.expresionIgualdad().size(); i++) {

            String tipoDer = tipoIgualdad(ctx.expresionIgualdad(i));

            if (!tipo.equals("bondad") || !tipoDer.equals("bondad")) {
                marcarError("Error semántico: operadores lógicos solo aceptan bondad\n");
                return "error";
            }

            tipo = "bondad";
        }

        return tipo;
    }

    private String tipoIgualdad(MiGramaticaParser.ExpresionIgualdadContext ctx) {

        String tipo = tipoRelacional(ctx.expresionRelacional(0));

        for (int i = 1; i < ctx.expresionRelacional().size(); i++) {

            String tipoDer = tipoRelacional(ctx.expresionRelacional(i));

            if (!tipo.equals(tipoDer)) {
                marcarError("Error semántico: comparación entre tipos distintos: "
                        + tipo + " y " + tipoDer + "\n");
                return "error";
            }

            tipo = "bondad";
        }

        return tipo;
    }

    private String tipoRelacional(MiGramaticaParser.ExpresionRelacionalContext ctx) {

        String tipo = tipoSuma(ctx.expresionSuma(0));

        for (int i = 1; i < ctx.expresionSuma().size(); i++) {

            String tipoDer = tipoSuma(ctx.expresionSuma(i));

            if (!esNumerico(tipo) || !esNumerico(tipoDer)) {
                marcarError("Error semántico: operadores relacionales solo aceptan números\n");
                return "error";
            }

            if (!tipo.equals(tipoDer)) {
                marcarError("Error semántico: comparación numérica con tipos distintos: "
                        + tipo + " y " + tipoDer + "\n");
                return "error";
            }

            tipo = "bondad";
        }

        return tipo;
    }

    private String tipoSuma(MiGramaticaParser.ExpresionSumaContext ctx) {

        String tipo = tipoMult(ctx.expresionMult(0));

        for (int i = 1; i < ctx.expresionMult().size(); i++) {

            String tipoDer = tipoMult(ctx.expresionMult(i));

            if (!esNumerico(tipo) || !esNumerico(tipoDer)) {
                marcarError("Error semántico: suma/resta solo acepta tipos numéricos\n");
                return "error";
            }

            if (!tipo.equals(tipoDer)) {
                marcarError("Error semántico: no se pueden operar tipos distintos: "
                        + tipo + " y " + tipoDer + "\n");
                return "error";
            }
        }

        return tipo;
    }

    private String tipoMult(MiGramaticaParser.ExpresionMultContext ctx) {

        String tipo = tipoUnaria(ctx.expresionUnaria(0));

        for (int i = 1; i < ctx.expresionUnaria().size(); i++) {

            String tipoDer = tipoUnaria(ctx.expresionUnaria(i));

            if (!esNumerico(tipo) || !esNumerico(tipoDer)) {
                marcarError("Error semántico: multiplicación/división solo acepta tipos numéricos\n");
                return "error";
            }

            if (!tipo.equals(tipoDer)) {
                marcarError("Error semántico: no se pueden operar tipos distintos: "
                        + tipo + " y " + tipoDer + "\n");
                return "error";
            }
        }

        return tipo;
    }

    private String tipoUnaria(MiGramaticaParser.ExpresionUnariaContext ctx) {

        if (ctx.expresiones() != null) {
            return obtenerTipo(ctx.expresiones());
        }

        if (ctx.constantes() != null) {
            return tipoConstante(ctx.constantes());
        }

        if (ctx.ID() != null) {

            String nombre = ctx.ID().getText();

            if (!tabla.existe(nombre)) {
                marcarError("Error semántico: variable '" + nombre + "' no declarada\n");
                return "error";
            }

            return tabla.obtener(nombre).tipo;
        }

        if (ctx.llamadaFuncion() != null) {
            return tipoLlamadaFuncion(ctx.llamadaFuncion());
        }

        return "error";
    }

    private String tipoLlamadaFuncion(MiGramaticaParser.LlamadaFuncionContext ctx) {

        String nombreFuncion = ctx.ID().getText();

        if (!funciones.containsKey(nombreFuncion)) {

            marcarError(
                    "Error semántico: la función '" +
                            nombreFuncion +
                            "' no existe\n");

            return "error";
        }

        List<String> tiposEsperados = funciones.get(nombreFuncion);

        int parametrosEsperados = tiposEsperados.size();
        int parametrosRecibidos = ctx.expresiones().size();

        if (parametrosRecibidos != parametrosEsperados) {

            marcarError(
                    "Error semántico: la función '" +
                            nombreFuncion +
                            "' esperaba " +
                            parametrosEsperados +
                            " parámetro(s) y recibió " +
                            parametrosRecibidos +
                            "\n");

            return "error";
        }

        for (int i = 0; i < parametrosRecibidos; i++) {

            String tipoEsperado = tiposEsperados.get(i);
            String tipoRecibido = obtenerTipo(ctx.expresiones(i));

            if (!tipoEsperado.equals(tipoRecibido)) {

                marcarError(
                        "Error semántico: parámetro " +
                                (i + 1) +
                                " de la función '" +
                                nombreFuncion +
                                "' esperaba " +
                                tipoEsperado +
                                " pero recibió " +
                                tipoRecibido +
                                "\n");

                return "error";
            }
        }

        return tiposFunciones.get(nombreFuncion);
    }

    private String tipoConstante(MiGramaticaParser.ConstantesContext ctx) {

        if (ctx.INT_CONSTANTE() != null)
            return "intenso";
        if (ctx.FLOAT_CONSTANTE() != null)
            return "fenix";
        if (ctx.CHAR_CONSTANTE() != null)
            return "chispa";
        if (ctx.STRING_CONSTANTE() != null)
            return "Cancion";
        if (ctx.BOOLEAN_CONSTANTE() != null)
            return "bondad";

        return "error";
    }

    private boolean esNumerico(String tipo) {
        return tipo.equals("intenso")
                || tipo.equals("fenix")
                || tipo.equals("dorado");
    }

    private void marcarError(String mensaje) {
        error = true;
        erroresSemanticos.append(mensaje);
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
                            "' no existe\n");

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
                            "\n");

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
                    && (tipoRecibido.equals("intenso") || tipoRecibido.equals("fenix")
                            || tipoRecibido.equals("dorado"))) {
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