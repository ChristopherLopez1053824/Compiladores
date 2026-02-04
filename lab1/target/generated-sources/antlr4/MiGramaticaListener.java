// Generated from MiGramatica.g4 by ANTLR 4.13.1
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