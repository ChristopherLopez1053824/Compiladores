// Generated from MiGramatica.g4 by ANTLR 4.13.1

package com.compiladores.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiGramaticaParser}.
 */
public interface MiGramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MiGramaticaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MiGramaticaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(MiGramaticaParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(MiGramaticaParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#binDecl}.
	 * @param ctx the parse tree
	 */
	void enterBinDecl(MiGramaticaParser.BinDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#binDecl}.
	 * @param ctx the parse tree
	 */
	void exitBinDecl(MiGramaticaParser.BinDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#b4Decl}.
	 * @param ctx the parse tree
	 */
	void enterB4Decl(MiGramaticaParser.B4DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#b4Decl}.
	 * @param ctx the parse tree
	 */
	void exitB4Decl(MiGramaticaParser.B4DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#hexDecl}.
	 * @param ctx the parse tree
	 */
	void enterHexDecl(MiGramaticaParser.HexDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#hexDecl}.
	 * @param ctx the parse tree
	 */
	void exitHexDecl(MiGramaticaParser.HexDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(MiGramaticaParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(MiGramaticaParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#expresionP}.
	 * @param ctx the parse tree
	 */
	void enterExpresionP(MiGramaticaParser.ExpresionPContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#expresionP}.
	 * @param ctx the parse tree
	 */
	void exitExpresionP(MiGramaticaParser.ExpresionPContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(MiGramaticaParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(MiGramaticaParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#terminoP}.
	 * @param ctx the parse tree
	 */
	void enterTerminoP(MiGramaticaParser.TerminoPContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#terminoP}.
	 * @param ctx the parse tree
	 */
	void exitTerminoP(MiGramaticaParser.TerminoPContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MiGramaticaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MiGramaticaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(MiGramaticaParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(MiGramaticaParser.NumeroContext ctx);
}