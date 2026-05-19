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
	 * Enter a parse tree produced by {@link MiGramaticaParser#importacion}.
	 * @param ctx the parse tree
	 */
	void enterImportacion(MiGramaticaParser.ImportacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#importacion}.
	 * @param ctx the parse tree
	 */
	void exitImportacion(MiGramaticaParser.ImportacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(MiGramaticaParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(MiGramaticaParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#funciones}.
	 * @param ctx the parse tree
	 */
	void enterFunciones(MiGramaticaParser.FuncionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#funciones}.
	 * @param ctx the parse tree
	 */
	void exitFunciones(MiGramaticaParser.FuncionesContext ctx);
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
	 * Enter a parse tree produced by {@link MiGramaticaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(MiGramaticaParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(MiGramaticaParser.SentenciaContext ctx);
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
	 * Enter a parse tree produced by {@link MiGramaticaParser#inicioFor}.
	 * @param ctx the parse tree
	 */
	void enterInicioFor(MiGramaticaParser.InicioForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#inicioFor}.
	 * @param ctx the parse tree
	 */
	void exitInicioFor(MiGramaticaParser.InicioForContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#actualizacionFor}.
	 * @param ctx the parse tree
	 */
	void enterActualizacionFor(MiGramaticaParser.ActualizacionForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#actualizacionFor}.
	 * @param ctx the parse tree
	 */
	void exitActualizacionFor(MiGramaticaParser.ActualizacionForContext ctx);
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
	 * Enter a parse tree produced by {@link MiGramaticaParser#inputDentro}.
	 * @param ctx the parse tree
	 */
	void enterInputDentro(MiGramaticaParser.InputDentroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#inputDentro}.
	 * @param ctx the parse tree
	 */
	void exitInputDentro(MiGramaticaParser.InputDentroContext ctx);
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
	 * Enter a parse tree produced by {@link MiGramaticaParser#expresionLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpresionLogica(MiGramaticaParser.ExpresionLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#expresionLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpresionLogica(MiGramaticaParser.ExpresionLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#expresionIgualdad}.
	 * @param ctx the parse tree
	 */
	void enterExpresionIgualdad(MiGramaticaParser.ExpresionIgualdadContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#expresionIgualdad}.
	 * @param ctx the parse tree
	 */
	void exitExpresionIgualdad(MiGramaticaParser.ExpresionIgualdadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#expresionRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpresionRelacional(MiGramaticaParser.ExpresionRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#expresionRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpresionRelacional(MiGramaticaParser.ExpresionRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#expresionSuma}.
	 * @param ctx the parse tree
	 */
	void enterExpresionSuma(MiGramaticaParser.ExpresionSumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#expresionSuma}.
	 * @param ctx the parse tree
	 */
	void exitExpresionSuma(MiGramaticaParser.ExpresionSumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#expresionMult}.
	 * @param ctx the parse tree
	 */
	void enterExpresionMult(MiGramaticaParser.ExpresionMultContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#expresionMult}.
	 * @param ctx the parse tree
	 */
	void exitExpresionMult(MiGramaticaParser.ExpresionMultContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#expresionUnaria}.
	 * @param ctx the parse tree
	 */
	void enterExpresionUnaria(MiGramaticaParser.ExpresionUnariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#expresionUnaria}.
	 * @param ctx the parse tree
	 */
	void exitExpresionUnaria(MiGramaticaParser.ExpresionUnariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(MiGramaticaParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(MiGramaticaParser.LlamadaFuncionContext ctx);
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
}