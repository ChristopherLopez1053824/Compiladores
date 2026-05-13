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
		CONVOCA=1, MAIN=2, HECHIZO=3, INT=4, FLOAT=5, DOUBLE=6, CHAR=7, BOOLEAN=8, 
		STRING=9, VOID=10, IF=11, ELSE=12, WHILE=13, FOR=14, RETURN=15, SYSTEM_OUT_PRINTLN=16, 
		LEER=17, INT_CONSTANTE=18, FLOAT_CONSTANTE=19, CHAR_CONSTANTE=20, STRING_CONSTANTE=21, 
		BOOLEAN_CONSTANTE=22, ID=23, IGUAL=24, SUMA=25, RESTA=26, MULTIPLICACION=27, 
		DIVISION=28, IGUALDAD=29, DIFERENCIA=30, MAYOR_MENOR_IGUALQUE=31, OPERADORES_LOGICOS=32, 
		PUNTO_Y_COMA=33, COMA=34, PARENTESIS_A=35, PARENTESIS_C=36, LLAVE_A=37, 
		LLAVE_C=38, WS=39, LINE_COMMENT=40, BLOCK_COMMENT=41, UNCLOSED_COMMENT=42, 
		INVALID_FLOAT=43, INVALID_ID=44, UNCLOSED_CHAR=45, UNCLOSED_STRING=46, 
		ERROR_CHAR=47;
	public static final int
		RULE_programa = 0, RULE_importacion = 1, RULE_main = 2, RULE_funciones = 3, 
		RULE_parametro = 4, RULE_bloqueCodigo = 5, RULE_sentencia = 6, RULE_variables = 7, 
		RULE_asignacion = 8, RULE_condicional = 9, RULE_cicloWhile = 10, RULE_cicloFor = 11, 
		RULE_returnDentro = 12, RULE_printDentro = 13, RULE_inputDentro = 14, 
		RULE_expresiones = 15, RULE_expresionLogica = 16, RULE_expresionIgualdad = 17, 
		RULE_expresionRelacional = 18, RULE_expresionSuma = 19, RULE_expresionMult = 20, 
		RULE_expresionUnaria = 21, RULE_llamadaFuncion = 22, RULE_constantes = 23, 
		RULE_tipo = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "importacion", "main", "funciones", "parametro", "bloqueCodigo", 
			"sentencia", "variables", "asignacion", "condicional", "cicloWhile", 
			"cicloFor", "returnDentro", "printDentro", "inputDentro", "expresiones", 
			"expresionLogica", "expresionIgualdad", "expresionRelacional", "expresionSuma", 
			"expresionMult", "expresionUnaria", "llamadaFuncion", "constantes", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'convoca'", "'comienza'", "'hechizo'", "'intenso'", "'fenix'", 
			"'dorado'", "'chispa'", "'bondad'", "'Cancion'", "'vasto'", "'destino'", 
			"'alterno'", "'guardian'", "'viaje'", "'felices'", "'Divulga'", "'escuchar'", 
			null, null, null, null, null, null, "'='", "'+'", "'-'", "'*'", "'/'", 
			"'=='", "'!='", null, null, "';'", "','", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CONVOCA", "MAIN", "HECHIZO", "INT", "FLOAT", "DOUBLE", "CHAR", 
			"BOOLEAN", "STRING", "VOID", "IF", "ELSE", "WHILE", "FOR", "RETURN", 
			"SYSTEM_OUT_PRINTLN", "LEER", "INT_CONSTANTE", "FLOAT_CONSTANTE", "CHAR_CONSTANTE", 
			"STRING_CONSTANTE", "BOOLEAN_CONSTANTE", "ID", "IGUAL", "SUMA", "RESTA", 
			"MULTIPLICACION", "DIVISION", "IGUALDAD", "DIFERENCIA", "MAYOR_MENOR_IGUALQUE", 
			"OPERADORES_LOGICOS", "PUNTO_Y_COMA", "COMA", "PARENTESIS_A", "PARENTESIS_C", 
			"LLAVE_A", "LLAVE_C", "WS", "LINE_COMMENT", "BLOCK_COMMENT", "UNCLOSED_COMMENT", 
			"INVALID_FLOAT", "INVALID_ID", "UNCLOSED_CHAR", "UNCLOSED_STRING", "ERROR_CHAR"
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
	public static class ProgramaContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiGramaticaParser.EOF, 0); }
		public List<ImportacionContext> importacion() {
			return getRuleContexts(ImportacionContext.class);
		}
		public ImportacionContext importacion(int i) {
			return getRuleContext(ImportacionContext.class,i);
		}
		public List<FuncionesContext> funciones() {
			return getRuleContexts(FuncionesContext.class);
		}
		public FuncionesContext funciones(int i) {
			return getRuleContext(FuncionesContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONVOCA) {
				{
				{
				setState(50);
				importacion();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HECHIZO) {
				{
				{
				setState(56);
				funciones();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			main();
			setState(63);
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
	public static class ImportacionContext extends ParserRuleContext {
		public TerminalNode CONVOCA() { return getToken(MiGramaticaParser.CONVOCA, 0); }
		public TerminalNode STRING_CONSTANTE() { return getToken(MiGramaticaParser.STRING_CONSTANTE, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(MiGramaticaParser.PUNTO_Y_COMA, 0); }
		public ImportacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterImportacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitImportacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitImportacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportacionContext importacion() throws RecognitionException {
		ImportacionContext _localctx = new ImportacionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(CONVOCA);
			setState(66);
			match(STRING_CONSTANTE);
			setState(67);
			match(PUNTO_Y_COMA);
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
	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(MiGramaticaParser.MAIN, 0); }
		public BloqueCodigoContext bloqueCodigo() {
			return getRuleContext(BloqueCodigoContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(MAIN);
			setState(70);
			bloqueCodigo();
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
	public static class FuncionesContext extends ParserRuleContext {
		public TerminalNode HECHIZO() { return getToken(MiGramaticaParser.HECHIZO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiGramaticaParser.ID, 0); }
		public TerminalNode PARENTESIS_A() { return getToken(MiGramaticaParser.PARENTESIS_A, 0); }
		public TerminalNode PARENTESIS_C() { return getToken(MiGramaticaParser.PARENTESIS_C, 0); }
		public BloqueCodigoContext bloqueCodigo() {
			return getRuleContext(BloqueCodigoContext.class,0);
		}
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(MiGramaticaParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MiGramaticaParser.COMA, i);
		}
		public FuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterFunciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitFunciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitFunciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionesContext funciones() throws RecognitionException {
		FuncionesContext _localctx = new FuncionesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(HECHIZO);
			setState(73);
			tipo();
			setState(74);
			match(ID);
			setState(75);
			match(PARENTESIS_A);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2032L) != 0)) {
				{
				setState(76);
				parametro();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(77);
					match(COMA);
					setState(78);
					parametro();
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(86);
			match(PARENTESIS_C);
			setState(87);
			bloqueCodigo();
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
	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiGramaticaParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			tipo();
			setState(90);
			match(ID);
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
	public static class BloqueCodigoContext extends ParserRuleContext {
		public TerminalNode LLAVE_A() { return getToken(MiGramaticaParser.LLAVE_A, 0); }
		public TerminalNode LLAVE_C() { return getToken(MiGramaticaParser.LLAVE_C, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueCodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueCodigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterBloqueCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitBloqueCodigo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitBloqueCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueCodigoContext bloqueCodigo() throws RecognitionException {
		BloqueCodigoContext _localctx = new BloqueCodigoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloqueCodigo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(LLAVE_A);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8646640L) != 0)) {
				{
				{
				setState(93);
				sentencia();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(LLAVE_C);
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
	public static class SentenciaContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CicloWhileContext cicloWhile() {
			return getRuleContext(CicloWhileContext.class,0);
		}
		public CicloForContext cicloFor() {
			return getRuleContext(CicloForContext.class,0);
		}
		public ReturnDentroContext returnDentro() {
			return getRuleContext(ReturnDentroContext.class,0);
		}
		public PrintDentroContext printDentro() {
			return getRuleContext(PrintDentroContext.class,0);
		}
		public InputDentroContext inputDentro() {
			return getRuleContext(InputDentroContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentencia);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case DOUBLE:
			case CHAR:
			case BOOLEAN:
			case STRING:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				variables();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				asignacion();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				condicional();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				cicloWhile();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				cicloFor();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				returnDentro();
				}
				break;
			case SYSTEM_OUT_PRINTLN:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				printDentro();
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				inputDentro();
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
	public static class VariablesContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiGramaticaParser.ID, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(MiGramaticaParser.PUNTO_Y_COMA, 0); }
		public TerminalNode IGUAL() { return getToken(MiGramaticaParser.IGUAL, 0); }
		public ExpresionesContext expresiones() {
			return getRuleContext(ExpresionesContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			tipo();
			setState(112);
			match(ID);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(113);
				match(IGUAL);
				setState(114);
				expresiones();
				}
			}

			setState(117);
			match(PUNTO_Y_COMA);
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiGramaticaParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(MiGramaticaParser.IGUAL, 0); }
		public ExpresionesContext expresiones() {
			return getRuleContext(ExpresionesContext.class,0);
		}
		public TerminalNode PUNTO_Y_COMA() { return getToken(MiGramaticaParser.PUNTO_Y_COMA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(120);
			match(IGUAL);
			setState(121);
			expresiones();
			setState(122);
			match(PUNTO_Y_COMA);
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
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiGramaticaParser.IF, 0); }
		public TerminalNode PARENTESIS_A() { return getToken(MiGramaticaParser.PARENTESIS_A, 0); }
		public ExpresionesContext expresiones() {
			return getRuleContext(ExpresionesContext.class,0);
		}
		public TerminalNode PARENTESIS_C() { return getToken(MiGramaticaParser.PARENTESIS_C, 0); }
		public List<BloqueCodigoContext> bloqueCodigo() {
			return getRuleContexts(BloqueCodigoContext.class);
		}
		public BloqueCodigoContext bloqueCodigo(int i) {
			return getRuleContext(BloqueCodigoContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiGramaticaParser.ELSE, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IF);
			setState(125);
			match(PARENTESIS_A);
			setState(126);
			expresiones();
			setState(127);
			match(PARENTESIS_C);
			setState(128);
			bloqueCodigo();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(129);
				match(ELSE);
				setState(130);
				bloqueCodigo();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CicloWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiGramaticaParser.WHILE, 0); }
		public TerminalNode PARENTESIS_A() { return getToken(MiGramaticaParser.PARENTESIS_A, 0); }
		public ExpresionesContext expresiones() {
			return getRuleContext(ExpresionesContext.class,0);
		}
		public TerminalNode PARENTESIS_C() { return getToken(MiGramaticaParser.PARENTESIS_C, 0); }
		public BloqueCodigoContext bloqueCodigo() {
			return getRuleContext(BloqueCodigoContext.class,0);
		}
		public CicloWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterCicloWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitCicloWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitCicloWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloWhileContext cicloWhile() throws RecognitionException {
		CicloWhileContext _localctx = new CicloWhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cicloWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(WHILE);
			setState(134);
			match(PARENTESIS_A);
			setState(135);
			expresiones();
			setState(136);
			match(PARENTESIS_C);
			setState(137);
			bloqueCodigo();
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
	public static class CicloForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MiGramaticaParser.FOR, 0); }
		public TerminalNode PARENTESIS_A() { return getToken(MiGramaticaParser.PARENTESIS_A, 0); }
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(MiGramaticaParser.PUNTO_Y_COMA); }
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(MiGramaticaParser.PUNTO_Y_COMA, i);
		}
		public TerminalNode PARENTESIS_C() { return getToken(MiGramaticaParser.PARENTESIS_C, 0); }
		public BloqueCodigoContext bloqueCodigo() {
			return getRuleContext(BloqueCodigoContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public List<ExpresionesContext> expresiones() {
			return getRuleContexts(ExpresionesContext.class);
		}
		public ExpresionesContext expresiones(int i) {
			return getRuleContext(ExpresionesContext.class,i);
		}
		public CicloForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterCicloFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitCicloFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitCicloFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloForContext cicloFor() throws RecognitionException {
		CicloForContext _localctx = new CicloForContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cicloFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(FOR);
			setState(140);
			match(PARENTESIS_A);
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case DOUBLE:
			case CHAR:
			case BOOLEAN:
			case STRING:
			case VOID:
				{
				setState(141);
				variables();
				}
				break;
			case ID:
				{
				setState(142);
				asignacion();
				}
				break;
			case PUNTO_Y_COMA:
				{
				setState(143);
				match(PUNTO_Y_COMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34376253440L) != 0)) {
				{
				setState(146);
				expresiones();
				}
			}

			setState(149);
			match(PUNTO_Y_COMA);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34376253440L) != 0)) {
				{
				setState(150);
				expresiones();
				}
			}

			setState(153);
			match(PARENTESIS_C);
			setState(154);
			bloqueCodigo();
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
	public static class ReturnDentroContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiGramaticaParser.RETURN, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(MiGramaticaParser.PUNTO_Y_COMA, 0); }
		public ExpresionesContext expresiones() {
			return getRuleContext(ExpresionesContext.class,0);
		}
		public ReturnDentroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnDentro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterReturnDentro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitReturnDentro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitReturnDentro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnDentroContext returnDentro() throws RecognitionException {
		ReturnDentroContext _localctx = new ReturnDentroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnDentro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(RETURN);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34376253440L) != 0)) {
				{
				setState(157);
				expresiones();
				}
			}

			setState(160);
			match(PUNTO_Y_COMA);
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
	public static class PrintDentroContext extends ParserRuleContext {
		public TerminalNode SYSTEM_OUT_PRINTLN() { return getToken(MiGramaticaParser.SYSTEM_OUT_PRINTLN, 0); }
		public TerminalNode PARENTESIS_A() { return getToken(MiGramaticaParser.PARENTESIS_A, 0); }
		public TerminalNode PARENTESIS_C() { return getToken(MiGramaticaParser.PARENTESIS_C, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(MiGramaticaParser.PUNTO_Y_COMA, 0); }
		public ExpresionesContext expresiones() {
			return getRuleContext(ExpresionesContext.class,0);
		}
		public PrintDentroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printDentro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterPrintDentro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitPrintDentro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitPrintDentro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintDentroContext printDentro() throws RecognitionException {
		PrintDentroContext _localctx = new PrintDentroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printDentro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(SYSTEM_OUT_PRINTLN);
			setState(163);
			match(PARENTESIS_A);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34376253440L) != 0)) {
				{
				setState(164);
				expresiones();
				}
			}

			setState(167);
			match(PARENTESIS_C);
			setState(168);
			match(PUNTO_Y_COMA);
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
	public static class InputDentroContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(MiGramaticaParser.LEER, 0); }
		public TerminalNode PARENTESIS_A() { return getToken(MiGramaticaParser.PARENTESIS_A, 0); }
		public TerminalNode ID() { return getToken(MiGramaticaParser.ID, 0); }
		public TerminalNode PARENTESIS_C() { return getToken(MiGramaticaParser.PARENTESIS_C, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(MiGramaticaParser.PUNTO_Y_COMA, 0); }
		public InputDentroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDentro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterInputDentro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitInputDentro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitInputDentro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputDentroContext inputDentro() throws RecognitionException {
		InputDentroContext _localctx = new InputDentroContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inputDentro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(LEER);
			setState(171);
			match(PARENTESIS_A);
			setState(172);
			match(ID);
			setState(173);
			match(PARENTESIS_C);
			setState(174);
			match(PUNTO_Y_COMA);
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
	public static class ExpresionesContext extends ParserRuleContext {
		public ExpresionLogicaContext expresionLogica() {
			return getRuleContext(ExpresionLogicaContext.class,0);
		}
		public ExpresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresiones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterExpresiones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitExpresiones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitExpresiones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionesContext expresiones() throws RecognitionException {
		ExpresionesContext _localctx = new ExpresionesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expresiones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			expresionLogica();
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
	public static class ExpresionLogicaContext extends ParserRuleContext {
		public List<ExpresionIgualdadContext> expresionIgualdad() {
			return getRuleContexts(ExpresionIgualdadContext.class);
		}
		public ExpresionIgualdadContext expresionIgualdad(int i) {
			return getRuleContext(ExpresionIgualdadContext.class,i);
		}
		public List<TerminalNode> OPERADORES_LOGICOS() { return getTokens(MiGramaticaParser.OPERADORES_LOGICOS); }
		public TerminalNode OPERADORES_LOGICOS(int i) {
			return getToken(MiGramaticaParser.OPERADORES_LOGICOS, i);
		}
		public ExpresionLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterExpresionLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitExpresionLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitExpresionLogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionLogicaContext expresionLogica() throws RecognitionException {
		ExpresionLogicaContext _localctx = new ExpresionLogicaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expresionLogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			expresionIgualdad();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERADORES_LOGICOS) {
				{
				{
				setState(179);
				match(OPERADORES_LOGICOS);
				setState(180);
				expresionIgualdad();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionIgualdadContext extends ParserRuleContext {
		public List<ExpresionRelacionalContext> expresionRelacional() {
			return getRuleContexts(ExpresionRelacionalContext.class);
		}
		public ExpresionRelacionalContext expresionRelacional(int i) {
			return getRuleContext(ExpresionRelacionalContext.class,i);
		}
		public List<TerminalNode> IGUALDAD() { return getTokens(MiGramaticaParser.IGUALDAD); }
		public TerminalNode IGUALDAD(int i) {
			return getToken(MiGramaticaParser.IGUALDAD, i);
		}
		public List<TerminalNode> DIFERENCIA() { return getTokens(MiGramaticaParser.DIFERENCIA); }
		public TerminalNode DIFERENCIA(int i) {
			return getToken(MiGramaticaParser.DIFERENCIA, i);
		}
		public ExpresionIgualdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionIgualdad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterExpresionIgualdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitExpresionIgualdad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitExpresionIgualdad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionIgualdadContext expresionIgualdad() throws RecognitionException {
		ExpresionIgualdadContext _localctx = new ExpresionIgualdadContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expresionIgualdad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			expresionRelacional();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IGUALDAD || _la==DIFERENCIA) {
				{
				{
				setState(187);
				_la = _input.LA(1);
				if ( !(_la==IGUALDAD || _la==DIFERENCIA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(188);
				expresionRelacional();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionRelacionalContext extends ParserRuleContext {
		public List<ExpresionSumaContext> expresionSuma() {
			return getRuleContexts(ExpresionSumaContext.class);
		}
		public ExpresionSumaContext expresionSuma(int i) {
			return getRuleContext(ExpresionSumaContext.class,i);
		}
		public List<TerminalNode> MAYOR_MENOR_IGUALQUE() { return getTokens(MiGramaticaParser.MAYOR_MENOR_IGUALQUE); }
		public TerminalNode MAYOR_MENOR_IGUALQUE(int i) {
			return getToken(MiGramaticaParser.MAYOR_MENOR_IGUALQUE, i);
		}
		public ExpresionRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterExpresionRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitExpresionRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitExpresionRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionRelacionalContext expresionRelacional() throws RecognitionException {
		ExpresionRelacionalContext _localctx = new ExpresionRelacionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expresionRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			expresionSuma();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAYOR_MENOR_IGUALQUE) {
				{
				{
				setState(195);
				match(MAYOR_MENOR_IGUALQUE);
				setState(196);
				expresionSuma();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionSumaContext extends ParserRuleContext {
		public List<ExpresionMultContext> expresionMult() {
			return getRuleContexts(ExpresionMultContext.class);
		}
		public ExpresionMultContext expresionMult(int i) {
			return getRuleContext(ExpresionMultContext.class,i);
		}
		public List<TerminalNode> SUMA() { return getTokens(MiGramaticaParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(MiGramaticaParser.SUMA, i);
		}
		public List<TerminalNode> RESTA() { return getTokens(MiGramaticaParser.RESTA); }
		public TerminalNode RESTA(int i) {
			return getToken(MiGramaticaParser.RESTA, i);
		}
		public ExpresionSumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionSuma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterExpresionSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitExpresionSuma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitExpresionSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionSumaContext expresionSuma() throws RecognitionException {
		ExpresionSumaContext _localctx = new ExpresionSumaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expresionSuma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			expresionMult();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUMA || _la==RESTA) {
				{
				{
				setState(203);
				_la = _input.LA(1);
				if ( !(_la==SUMA || _la==RESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(204);
				expresionMult();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionMultContext extends ParserRuleContext {
		public List<ExpresionUnariaContext> expresionUnaria() {
			return getRuleContexts(ExpresionUnariaContext.class);
		}
		public ExpresionUnariaContext expresionUnaria(int i) {
			return getRuleContext(ExpresionUnariaContext.class,i);
		}
		public List<TerminalNode> MULTIPLICACION() { return getTokens(MiGramaticaParser.MULTIPLICACION); }
		public TerminalNode MULTIPLICACION(int i) {
			return getToken(MiGramaticaParser.MULTIPLICACION, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(MiGramaticaParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(MiGramaticaParser.DIVISION, i);
		}
		public ExpresionMultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionMult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterExpresionMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitExpresionMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitExpresionMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionMultContext expresionMult() throws RecognitionException {
		ExpresionMultContext _localctx = new ExpresionMultContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expresionMult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			expresionUnaria();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICACION || _la==DIVISION) {
				{
				{
				setState(211);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLICACION || _la==DIVISION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(212);
				expresionUnaria();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionUnariaContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_A() { return getToken(MiGramaticaParser.PARENTESIS_A, 0); }
		public ExpresionesContext expresiones() {
			return getRuleContext(ExpresionesContext.class,0);
		}
		public TerminalNode PARENTESIS_C() { return getToken(MiGramaticaParser.PARENTESIS_C, 0); }
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
		}
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiGramaticaParser.ID, 0); }
		public ExpresionUnariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionUnaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterExpresionUnaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitExpresionUnaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitExpresionUnaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionUnariaContext expresionUnaria() throws RecognitionException {
		ExpresionUnariaContext _localctx = new ExpresionUnariaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expresionUnaria);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(PARENTESIS_A);
				setState(219);
				expresiones();
				setState(220);
				match(PARENTESIS_C);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				llamadaFuncion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				constantes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(ID);
				}
				break;
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
	public static class LlamadaFuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiGramaticaParser.ID, 0); }
		public TerminalNode PARENTESIS_A() { return getToken(MiGramaticaParser.PARENTESIS_A, 0); }
		public TerminalNode PARENTESIS_C() { return getToken(MiGramaticaParser.PARENTESIS_C, 0); }
		public List<ExpresionesContext> expresiones() {
			return getRuleContexts(ExpresionesContext.class);
		}
		public ExpresionesContext expresiones(int i) {
			return getRuleContext(ExpresionesContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(MiGramaticaParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MiGramaticaParser.COMA, i);
		}
		public LlamadaFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterLlamadaFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitLlamadaFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitLlamadaFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaFuncionContext llamadaFuncion() throws RecognitionException {
		LlamadaFuncionContext _localctx = new LlamadaFuncionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_llamadaFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ID);
			setState(228);
			match(PARENTESIS_A);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34376253440L) != 0)) {
				{
				setState(229);
				expresiones();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(230);
					match(COMA);
					setState(231);
					expresiones();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(239);
			match(PARENTESIS_C);
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
	public static class ConstantesContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANTE() { return getToken(MiGramaticaParser.INT_CONSTANTE, 0); }
		public TerminalNode FLOAT_CONSTANTE() { return getToken(MiGramaticaParser.FLOAT_CONSTANTE, 0); }
		public TerminalNode CHAR_CONSTANTE() { return getToken(MiGramaticaParser.CHAR_CONSTANTE, 0); }
		public TerminalNode STRING_CONSTANTE() { return getToken(MiGramaticaParser.STRING_CONSTANTE, 0); }
		public TerminalNode BOOLEAN_CONSTANTE() { return getToken(MiGramaticaParser.BOOLEAN_CONSTANTE, 0); }
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MiGramaticaParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MiGramaticaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(MiGramaticaParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(MiGramaticaParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiGramaticaParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(MiGramaticaParser.STRING, 0); }
		public TerminalNode VOID() { return getToken(MiGramaticaParser.VOID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2032L) != 0)) ) {
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
		"\u0004\u0001/\u00f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0000"+
		"\u0005\u0000:\b\u0000\n\u0000\f\u0000=\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003P\b\u0003\n\u0003\f\u0003"+
		"S\t\u0003\u0003\u0003U\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005_\b"+
		"\u0005\n\u0005\f\u0005b\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006n\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007t\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0084\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0091"+
		"\b\u000b\u0001\u000b\u0003\u000b\u0094\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0098\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0003\f\u009f\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00a6\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00b6\b\u0010\n\u0010\f\u0010\u00b9"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00be\b\u0011"+
		"\n\u0011\f\u0011\u00c1\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u00c6\b\u0012\n\u0012\f\u0012\u00c9\t\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u00ce\b\u0013\n\u0013\f\u0013\u00d1\t\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00d6\b\u0014\n\u0014\f\u0014"+
		"\u00d9\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00e2\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00e9\b\u0016\n\u0016"+
		"\f\u0016\u00ec\t\u0016\u0003\u0016\u00ee\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000"+
		"\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.0\u0000\u0005\u0001\u0000\u001d\u001e\u0001"+
		"\u0000\u0019\u001a\u0001\u0000\u001b\u001c\u0001\u0000\u0012\u0016\u0001"+
		"\u0000\u0004\n\u00fa\u00005\u0001\u0000\u0000\u0000\u0002A\u0001\u0000"+
		"\u0000\u0000\u0004E\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000"+
		"\bY\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000\fm\u0001\u0000"+
		"\u0000\u0000\u000eo\u0001\u0000\u0000\u0000\u0010w\u0001\u0000\u0000\u0000"+
		"\u0012|\u0001\u0000\u0000\u0000\u0014\u0085\u0001\u0000\u0000\u0000\u0016"+
		"\u008b\u0001\u0000\u0000\u0000\u0018\u009c\u0001\u0000\u0000\u0000\u001a"+
		"\u00a2\u0001\u0000\u0000\u0000\u001c\u00aa\u0001\u0000\u0000\u0000\u001e"+
		"\u00b0\u0001\u0000\u0000\u0000 \u00b2\u0001\u0000\u0000\u0000\"\u00ba"+
		"\u0001\u0000\u0000\u0000$\u00c2\u0001\u0000\u0000\u0000&\u00ca\u0001\u0000"+
		"\u0000\u0000(\u00d2\u0001\u0000\u0000\u0000*\u00e1\u0001\u0000\u0000\u0000"+
		",\u00e3\u0001\u0000\u0000\u0000.\u00f1\u0001\u0000\u0000\u00000\u00f3"+
		"\u0001\u0000\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000\u0000"+
		"\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u00006;\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u00008:\u0003"+
		"\u0006\u0003\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000>?\u0003\u0004\u0002\u0000?@\u0005\u0000"+
		"\u0000\u0001@\u0001\u0001\u0000\u0000\u0000AB\u0005\u0001\u0000\u0000"+
		"BC\u0005\u0015\u0000\u0000CD\u0005!\u0000\u0000D\u0003\u0001\u0000\u0000"+
		"\u0000EF\u0005\u0002\u0000\u0000FG\u0003\n\u0005\u0000G\u0005\u0001\u0000"+
		"\u0000\u0000HI\u0005\u0003\u0000\u0000IJ\u00030\u0018\u0000JK\u0005\u0017"+
		"\u0000\u0000KT\u0005#\u0000\u0000LQ\u0003\b\u0004\u0000MN\u0005\"\u0000"+
		"\u0000NP\u0003\b\u0004\u0000OM\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RU\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000TL\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0005$\u0000\u0000WX\u0003"+
		"\n\u0005\u0000X\u0007\u0001\u0000\u0000\u0000YZ\u00030\u0018\u0000Z[\u0005"+
		"\u0017\u0000\u0000[\t\u0001\u0000\u0000\u0000\\`\u0005%\u0000\u0000]_"+
		"\u0003\f\u0006\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000cd\u0005&\u0000\u0000d\u000b\u0001\u0000"+
		"\u0000\u0000en\u0003\u000e\u0007\u0000fn\u0003\u0010\b\u0000gn\u0003\u0012"+
		"\t\u0000hn\u0003\u0014\n\u0000in\u0003\u0016\u000b\u0000jn\u0003\u0018"+
		"\f\u0000kn\u0003\u001a\r\u0000ln\u0003\u001c\u000e\u0000me\u0001\u0000"+
		"\u0000\u0000mf\u0001\u0000\u0000\u0000mg\u0001\u0000\u0000\u0000mh\u0001"+
		"\u0000\u0000\u0000mi\u0001\u0000\u0000\u0000mj\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000n\r\u0001\u0000\u0000"+
		"\u0000op\u00030\u0018\u0000ps\u0005\u0017\u0000\u0000qr\u0005\u0018\u0000"+
		"\u0000rt\u0003\u001e\u000f\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005!\u0000\u0000v\u000f\u0001"+
		"\u0000\u0000\u0000wx\u0005\u0017\u0000\u0000xy\u0005\u0018\u0000\u0000"+
		"yz\u0003\u001e\u000f\u0000z{\u0005!\u0000\u0000{\u0011\u0001\u0000\u0000"+
		"\u0000|}\u0005\u000b\u0000\u0000}~\u0005#\u0000\u0000~\u007f\u0003\u001e"+
		"\u000f\u0000\u007f\u0080\u0005$\u0000\u0000\u0080\u0083\u0003\n\u0005"+
		"\u0000\u0081\u0082\u0005\f\u0000\u0000\u0082\u0084\u0003\n\u0005\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0013\u0001\u0000\u0000\u0000\u0085\u0086\u0005\r\u0000\u0000\u0086"+
		"\u0087\u0005#\u0000\u0000\u0087\u0088\u0003\u001e\u000f\u0000\u0088\u0089"+
		"\u0005$\u0000\u0000\u0089\u008a\u0003\n\u0005\u0000\u008a\u0015\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005\u000e\u0000\u0000\u008c\u0090\u0005"+
		"#\u0000\u0000\u008d\u0091\u0003\u000e\u0007\u0000\u008e\u0091\u0003\u0010"+
		"\b\u0000\u008f\u0091\u0005!\u0000\u0000\u0090\u008d\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u0094\u0003\u001e\u000f"+
		"\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0005!\u0000\u0000"+
		"\u0096\u0098\u0003\u001e\u000f\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0005$\u0000\u0000\u009a\u009b\u0003\n\u0005\u0000\u009b"+
		"\u0017\u0001\u0000\u0000\u0000\u009c\u009e\u0005\u000f\u0000\u0000\u009d"+
		"\u009f\u0003\u001e\u000f\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0005!\u0000\u0000\u00a1\u0019\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0005\u0010\u0000\u0000\u00a3\u00a5\u0005#\u0000\u0000\u00a4\u00a6\u0003"+
		"\u001e\u000f\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		"$\u0000\u0000\u00a8\u00a9\u0005!\u0000\u0000\u00a9\u001b\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0005\u0011\u0000\u0000\u00ab\u00ac\u0005#\u0000\u0000"+
		"\u00ac\u00ad\u0005\u0017\u0000\u0000\u00ad\u00ae\u0005$\u0000\u0000\u00ae"+
		"\u00af\u0005!\u0000\u0000\u00af\u001d\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0003 \u0010\u0000\u00b1\u001f\u0001\u0000\u0000\u0000\u00b2\u00b7\u0003"+
		"\"\u0011\u0000\u00b3\u00b4\u0005 \u0000\u0000\u00b4\u00b6\u0003\"\u0011"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8!\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bf\u0003$\u0012\u0000\u00bb\u00bc\u0007\u0000\u0000\u0000\u00bc"+
		"\u00be\u0003$\u0012\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c1"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0#\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c7\u0003&\u0013\u0000\u00c3\u00c4\u0005\u001f"+
		"\u0000\u0000\u00c4\u00c6\u0003&\u0013\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8%\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cf\u0003(\u0014\u0000\u00cb"+
		"\u00cc\u0007\u0001\u0000\u0000\u00cc\u00ce\u0003(\u0014\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\'\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d7\u0003"+
		"*\u0015\u0000\u00d3\u00d4\u0007\u0002\u0000\u0000\u00d4\u00d6\u0003*\u0015"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d8)\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0005#\u0000\u0000\u00db\u00dc\u0003\u001e\u000f\u0000\u00dc"+
		"\u00dd\u0005$\u0000\u0000\u00dd\u00e2\u0001\u0000\u0000\u0000\u00de\u00e2"+
		"\u0003,\u0016\u0000\u00df\u00e2\u0003.\u0017\u0000\u00e0\u00e2\u0005\u0017"+
		"\u0000\u0000\u00e1\u00da\u0001\u0000\u0000\u0000\u00e1\u00de\u0001\u0000"+
		"\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e2+\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0017\u0000"+
		"\u0000\u00e4\u00ed\u0005#\u0000\u0000\u00e5\u00ea\u0003\u001e\u000f\u0000"+
		"\u00e6\u00e7\u0005\"\u0000\u0000\u00e7\u00e9\u0003\u001e\u000f\u0000\u00e8"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed"+
		"\u00e5\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005$\u0000\u0000\u00f0-\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0007\u0003\u0000\u0000\u00f2/\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0007\u0004\u0000\u0000\u00f41\u0001\u0000\u0000"+
		"\u0000\u00155;QT`ms\u0083\u0090\u0093\u0097\u009e\u00a5\u00b7\u00bf\u00c7"+
		"\u00cf\u00d7\u00e1\u00ea\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}