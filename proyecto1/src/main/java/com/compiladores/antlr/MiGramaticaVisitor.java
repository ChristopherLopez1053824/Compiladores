// Generated from MiGramatica.g4 by ANTLR 4.13.1

package com.compiladores.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiGramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiGramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(MiGramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#clase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClase(MiGramaticaParser.ClaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#cuerpoClase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpoClase(MiGramaticaParser.CuerpoClaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(MiGramaticaParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#metodos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodos(MiGramaticaParser.MetodosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(MiGramaticaParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(MiGramaticaParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(MiGramaticaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#bloqueCodigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueCodigo(MiGramaticaParser.BloqueCodigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#dentro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDentro(MiGramaticaParser.DentroContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#accesoArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesoArreglo(MiGramaticaParser.AccesoArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#asignacionSinPuntoYComa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionSinPuntoYComa(MiGramaticaParser.AsignacionSinPuntoYComaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(MiGramaticaParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(MiGramaticaParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#cicloWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloWhile(MiGramaticaParser.CicloWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#cicloFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloFor(MiGramaticaParser.CicloForContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#returnDentro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnDentro(MiGramaticaParser.ReturnDentroContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#printDentro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintDentro(MiGramaticaParser.PrintDentroContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#expresiones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresiones(MiGramaticaParser.ExpresionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#expresionLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionLogica(MiGramaticaParser.ExpresionLogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#expresionIgualdad_diferencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionIgualdad_diferencia(MiGramaticaParser.ExpresionIgualdad_diferenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#expresionRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionRelacional(MiGramaticaParser.ExpresionRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#expresionSum_Rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionSum_Rest(MiGramaticaParser.ExpresionSum_RestContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#expresionMult_Div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionMult_Div(MiGramaticaParser.ExpresionMult_DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#expresionUnaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionUnaria(MiGramaticaParser.ExpresionUnariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(MiGramaticaParser.ConstantesContext ctx);
}