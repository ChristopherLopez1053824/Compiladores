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
	 * Visit a parse tree produced by {@link MiGramaticaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MiGramaticaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(MiGramaticaParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#binDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinDecl(MiGramaticaParser.BinDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#b4Decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB4Decl(MiGramaticaParser.B4DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#hexDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexDecl(MiGramaticaParser.HexDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(MiGramaticaParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#expresionP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionP(MiGramaticaParser.ExpresionPContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(MiGramaticaParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#terminoP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminoP(MiGramaticaParser.TerminoPContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MiGramaticaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiGramaticaParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(MiGramaticaParser.NumeroContext ctx);
}