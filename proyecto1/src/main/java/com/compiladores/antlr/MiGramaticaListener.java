// Generated from MiGramatica.g4 by ANTLR 4.13.1

package com.compiladores.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiGramaticaParser}.
 */
public interface MiGramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MiGramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MiGramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#clase}.
	 * @param ctx the parse tree
	 */
	void enterClase(MiGramaticaParser.ClaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#clase}.
	 * @param ctx the parse tree
	 */
	void exitClase(MiGramaticaParser.ClaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#cuerpoClase}.
	 * @param ctx the parse tree
	 */
	void enterCuerpoClase(MiGramaticaParser.CuerpoClaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#cuerpoClase}.
	 * @param ctx the parse tree
	 */
	void exitCuerpoClase(MiGramaticaParser.CuerpoClaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(MiGramaticaParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(MiGramaticaParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#metodos}.
	 * @param ctx the parse tree
	 */
	void enterMetodos(MiGramaticaParser.MetodosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#metodos}.
	 * @param ctx the parse tree
	 */
	void exitMetodos(MiGramaticaParser.MetodosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(MiGramaticaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(MiGramaticaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(MiGramaticaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(MiGramaticaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(MiGramaticaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(MiGramaticaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#bloqueCodigo}.
	 * @param ctx the parse tree
	 */
	void enterBloqueCodigo(MiGramaticaParser.BloqueCodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#bloqueCodigo}.
	 * @param ctx the parse tree
	 */
	void exitBloqueCodigo(MiGramaticaParser.BloqueCodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#dentro}.
	 * @param ctx the parse tree
	 */
	void enterDentro(MiGramaticaParser.DentroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#dentro}.
	 * @param ctx the parse tree
	 */
	void exitDentro(MiGramaticaParser.DentroContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(MiGramaticaParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(MiGramaticaParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(MiGramaticaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(MiGramaticaParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#cicloWhile}.
	 * @param ctx the parse tree
	 */
	void enterCicloWhile(MiGramaticaParser.CicloWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#cicloWhile}.
	 * @param ctx the parse tree
	 */
	void exitCicloWhile(MiGramaticaParser.CicloWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#cicloFor}.
	 * @param ctx the parse tree
	 */
	void enterCicloFor(MiGramaticaParser.CicloForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#cicloFor}.
	 * @param ctx the parse tree
	 */
	void exitCicloFor(MiGramaticaParser.CicloForContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#returnDentro}.
	 * @param ctx the parse tree
	 */
	void enterReturnDentro(MiGramaticaParser.ReturnDentroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#returnDentro}.
	 * @param ctx the parse tree
	 */
	void exitReturnDentro(MiGramaticaParser.ReturnDentroContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#printDentro}.
	 * @param ctx the parse tree
	 */
	void enterPrintDentro(MiGramaticaParser.PrintDentroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#printDentro}.
	 * @param ctx the parse tree
	 */
	void exitPrintDentro(MiGramaticaParser.PrintDentroContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#expresiones}.
	 * @param ctx the parse tree
	 */
	void enterExpresiones(MiGramaticaParser.ExpresionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#expresiones}.
	 * @param ctx the parse tree
	 */
	void exitExpresiones(MiGramaticaParser.ExpresionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(MiGramaticaParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(MiGramaticaParser.ConstantesContext ctx);
}