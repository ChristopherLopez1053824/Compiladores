// Generated from MiGramatica.g4 by ANTLR 4.13.1

package com.compiladores.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiGramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BIN_ID=2, B4_ID=3, HEX_ID=4, PLUS=5, MINUS=6, MUL=7, DIV=8, LPAREN=9, 
		RPAREN=10, BINARIO=11, BASE4=12, HEX=13, ID=14, NEWLINE=15, WS=16, COMMENT=17;
	public static final int
		RULE_prog = 0, RULE_declaracion = 1, RULE_binDecl = 2, RULE_b4Decl = 3, 
		RULE_hexDecl = 4, RULE_expresion = 5, RULE_expresionP = 6, RULE_termino = 7, 
		RULE_terminoP = 8, RULE_factor = 9, RULE_numero = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaracion", "binDecl", "b4Decl", "hexDecl", "expresion", "expresionP", 
			"termino", "terminoP", "factor", "numero"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'BIN'", "'B4'", "'HEX'", "'+'", "'-'", "'*'", "'/'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BIN_ID", "B4_ID", "HEX_ID", "PLUS", "MINUS", "MUL", "DIV", 
			"LPAREN", "RPAREN", "BINARIO", "BASE4", "HEX", "ID", "NEWLINE", "WS", 
			"COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiGramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiGramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiGramaticaParser.EOF, 0); }
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MiGramaticaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MiGramaticaParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 64028L) != 0)) {
				{
				{
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(22);
					match(NEWLINE);
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BIN_ID:
				case B4_ID:
				case HEX_ID:
					{
					setState(28);
					declaracion();
					}
					break;
				case LPAREN:
				case BINARIO:
				case BASE4:
				case HEX:
				case ID:
					{
					setState(29);
					expresion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(32);
						match(NEWLINE);
						}
						} 
					}
					setState(37);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public BinDeclContext binDecl() {
			return getRuleContext(BinDeclContext.class,0);
		}
		public B4DeclContext b4Decl() {
			return getRuleContext(B4DeclContext.class,0);
		}
		public HexDeclContext hexDecl() {
			return getRuleContext(HexDeclContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracion);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BIN_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				binDecl();
				}
				break;
			case B4_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				b4Decl();
				}
				break;
			case HEX_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				hexDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinDeclContext extends ParserRuleContext {
		public TerminalNode BIN_ID() { return getToken(MiGramaticaParser.BIN_ID, 0); }
		public TerminalNode ID() { return getToken(MiGramaticaParser.ID, 0); }
		public TerminalNode BINARIO() { return getToken(MiGramaticaParser.BINARIO, 0); }
		public BinDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterBinDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitBinDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitBinDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinDeclContext binDecl() throws RecognitionException {
		BinDeclContext _localctx = new BinDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_binDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(BIN_ID);
			setState(51);
			match(ID);
			setState(52);
			match(T__0);
			setState(53);
			match(BINARIO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class B4DeclContext extends ParserRuleContext {
		public TerminalNode B4_ID() { return getToken(MiGramaticaParser.B4_ID, 0); }
		public TerminalNode ID() { return getToken(MiGramaticaParser.ID, 0); }
		public TerminalNode BASE4() { return getToken(MiGramaticaParser.BASE4, 0); }
		public B4DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b4Decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterB4Decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitB4Decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitB4Decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B4DeclContext b4Decl() throws RecognitionException {
		B4DeclContext _localctx = new B4DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_b4Decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(B4_ID);
			setState(56);
			match(ID);
			setState(57);
			match(T__0);
			setState(58);
			match(BASE4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HexDeclContext extends ParserRuleContext {
		public TerminalNode HEX_ID() { return getToken(MiGramaticaParser.HEX_ID, 0); }
		public TerminalNode ID() { return getToken(MiGramaticaParser.ID, 0); }
		public TerminalNode HEX() { return getToken(MiGramaticaParser.HEX, 0); }
		public HexDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterHexDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitHexDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitHexDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexDeclContext hexDecl() throws RecognitionException {
		HexDeclContext _localctx = new HexDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_hexDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(HEX_ID);
			setState(61);
			match(ID);
			setState(62);
			match(T__0);
			setState(63);
			match(HEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExpresionPContext expresionP() {
			return getRuleContext(ExpresionPContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			termino();
			setState(66);
			expresionP();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionPContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExpresionPContext expresionP() {
			return getRuleContext(ExpresionPContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(MiGramaticaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiGramaticaParser.MINUS, 0); }
		public ExpresionPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterExpresionP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitExpresionP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitExpresionP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionPContext expresionP() throws RecognitionException {
		ExpresionPContext _localctx = new ExpresionPContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expresionP);
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(69);
				termino();
				setState(70);
				expresionP();
				}
				break;
			case EOF:
			case BIN_ID:
			case B4_ID:
			case HEX_ID:
			case LPAREN:
			case RPAREN:
			case BINARIO:
			case BASE4:
			case HEX:
			case ID:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminoPContext terminoP() {
			return getRuleContext(TerminoPContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			factor();
			setState(76);
			terminoP();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoPContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminoPContext terminoP() {
			return getRuleContext(TerminoPContext.class,0);
		}
		public TerminalNode MUL() { return getToken(MiGramaticaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MiGramaticaParser.DIV, 0); }
		public TerminoPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminoP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterTerminoP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitTerminoP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitTerminoP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoPContext terminoP() throws RecognitionException {
		TerminoPContext _localctx = new TerminoPContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_terminoP);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(79);
				factor();
				setState(80);
				terminoP();
				}
				break;
			case EOF:
			case BIN_ID:
			case B4_ID:
			case HEX_ID:
			case PLUS:
			case MINUS:
			case LPAREN:
			case RPAREN:
			case BINARIO:
			case BASE4:
			case HEX:
			case ID:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiGramaticaParser.ID, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MiGramaticaParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiGramaticaParser.RPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factor);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(ID);
				}
				break;
			case BINARIO:
			case BASE4:
			case HEX:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				numero();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(LPAREN);
				setState(88);
				expresion();
				setState(89);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode BINARIO() { return getToken(MiGramaticaParser.BINARIO, 0); }
		public TerminalNode BASE4() { return getToken(MiGramaticaParser.BASE4, 0); }
		public TerminalNode HEX() { return getToken(MiGramaticaParser.HEX, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0011`\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u001f\b\u0000\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000"+
		"\u0005\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006J\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bT\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\\\b\t\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0000\u0003\u0001\u0000\u0005\u0006\u0001"+
		"\u0000\u0007\b\u0001\u0000\u000b\r^\u0000(\u0001\u0000\u0000\u0000\u0002"+
		"0\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u00067\u0001"+
		"\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000\nA\u0001\u0000\u0000\u0000"+
		"\fI\u0001\u0000\u0000\u0000\u000eK\u0001\u0000\u0000\u0000\u0010S\u0001"+
		"\u0000\u0000\u0000\u0012[\u0001\u0000\u0000\u0000\u0014]\u0001\u0000\u0000"+
		"\u0000\u0016\u0018\u0005\u000f\u0000\u0000\u0017\u0016\u0001\u0000\u0000"+
		"\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001e\u0001\u0000\u0000"+
		"\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001f\u0003\u0002\u0001"+
		"\u0000\u001d\u001f\u0003\n\u0005\u0000\u001e\u001c\u0001\u0000\u0000\u0000"+
		"\u001e\u001d\u0001\u0000\u0000\u0000\u001f#\u0001\u0000\u0000\u0000 \""+
		"\u0005\u000f\u0000\u0000! \u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\'\u0001\u0000"+
		"\u0000\u0000%#\u0001\u0000\u0000\u0000&\u0019\u0001\u0000\u0000\u0000"+
		"\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)+\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+,\u0005\u0000"+
		"\u0000\u0001,\u0001\u0001\u0000\u0000\u0000-1\u0003\u0004\u0002\u0000"+
		".1\u0003\u0006\u0003\u0000/1\u0003\b\u0004\u00000-\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u00001\u0003\u0001\u0000"+
		"\u0000\u000023\u0005\u0002\u0000\u000034\u0005\u000e\u0000\u000045\u0005"+
		"\u0001\u0000\u000056\u0005\u000b\u0000\u00006\u0005\u0001\u0000\u0000"+
		"\u000078\u0005\u0003\u0000\u000089\u0005\u000e\u0000\u00009:\u0005\u0001"+
		"\u0000\u0000:;\u0005\f\u0000\u0000;\u0007\u0001\u0000\u0000\u0000<=\u0005"+
		"\u0004\u0000\u0000=>\u0005\u000e\u0000\u0000>?\u0005\u0001\u0000\u0000"+
		"?@\u0005\r\u0000\u0000@\t\u0001\u0000\u0000\u0000AB\u0003\u000e\u0007"+
		"\u0000BC\u0003\f\u0006\u0000C\u000b\u0001\u0000\u0000\u0000DE\u0007\u0000"+
		"\u0000\u0000EF\u0003\u000e\u0007\u0000FG\u0003\f\u0006\u0000GJ\u0001\u0000"+
		"\u0000\u0000HJ\u0001\u0000\u0000\u0000ID\u0001\u0000\u0000\u0000IH\u0001"+
		"\u0000\u0000\u0000J\r\u0001\u0000\u0000\u0000KL\u0003\u0012\t\u0000LM"+
		"\u0003\u0010\b\u0000M\u000f\u0001\u0000\u0000\u0000NO\u0007\u0001\u0000"+
		"\u0000OP\u0003\u0012\t\u0000PQ\u0003\u0010\b\u0000QT\u0001\u0000\u0000"+
		"\u0000RT\u0001\u0000\u0000\u0000SN\u0001\u0000\u0000\u0000SR\u0001\u0000"+
		"\u0000\u0000T\u0011\u0001\u0000\u0000\u0000U\\\u0005\u000e\u0000\u0000"+
		"V\\\u0003\u0014\n\u0000WX\u0005\t\u0000\u0000XY\u0003\n\u0005\u0000YZ"+
		"\u0005\n\u0000\u0000Z\\\u0001\u0000\u0000\u0000[U\u0001\u0000\u0000\u0000"+
		"[V\u0001\u0000\u0000\u0000[W\u0001\u0000\u0000\u0000\\\u0013\u0001\u0000"+
		"\u0000\u0000]^\u0007\u0002\u0000\u0000^\u0015\u0001\u0000\u0000\u0000"+
		"\b\u0019\u001e#(0IS[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}