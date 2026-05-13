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
	 * Visit a parse tree produced by {@link MiGramaticaParser#importacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportacion(MiGramaticaParser.ImportacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#nombreCompleto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombreCompleto(MiGramaticaParser.NombreCompletoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(MiGramaticaParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#funciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunciones(MiGramaticaParser.FuncionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(MiGramaticaParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#bloqueCodigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueCodigo(MiGramaticaParser.BloqueCodigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(MiGramaticaParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(MiGramaticaParser.VariablesContext ctx);
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
	 * Visit a parse tree produced by {@link MiGramaticaParser#inputDentro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDentro(MiGramaticaParser.InputDentroContext ctx);
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
	 * Visit a parse tree produced by {@link MiGramaticaParser#expresionIgualdad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionIgualdad(MiGramaticaParser.ExpresionIgualdadContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#expresionRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionRelacional(MiGramaticaParser.ExpresionRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#expresionSuma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionSuma(MiGramaticaParser.ExpresionSumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#expresionMult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionMult(MiGramaticaParser.ExpresionMultContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#expresionUnaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionUnaria(MiGramaticaParser.ExpresionUnariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(MiGramaticaParser.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(MiGramaticaParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(MiGramaticaParser.TipoContext ctx);
}