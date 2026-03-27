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
		T__0=1, MAIN=2, HECHIZO=3, INT=4, FLOAT=5, DOUBLE=6, CHAR=7, BOOLEAN=8, 
		STRING=9, VOID=10, IF=11, ELSE=12, WHILE=13, FOR=14, RETURN=15, SYSTEM_OUT_PRINTLN=16, 
		LEER=17, INT_CONSTANTE=18, FLOAT_CONSTANTE=19, CHAR_CONSTANTE=20, STRING_CONSTANTE=21, 
		BOOLEAN_CONSTANTE=22, ID=23, IGUAL=24, SUMA=25, RESTA=26, MULTIPLICACION=27, 
		DIVISION=28, IGUALDAD=29, DIFERENCIA=30, MAYOR_MENOR_IGUALQUE=31, OPERADORES_LOGICOS=32, 
		PUNTO_Y_COMA=33, COMA=34, PARENTESIS_A=35, PARENTESIS_C=36, LLAVE_A=37, 
		LLAVE_C=38, WS=39, LINE_COMMENT=40, BLOCK_COMMENT=41, UNCLOSED_COMMENT=42, 
		INVALID_FLOAT=43, INVALID_ID=44, UNCLOSED_CHAR=45, UNCLOSED_STRING=46, 
		ERROR_CHAR=47, CONVOCA=48;
	public static final int
		RULE_programa = 0, RULE_importacion = 1, RULE_nombreCompleto = 2, RULE_main = 3, 
		RULE_funciones = 4, RULE_parametro = 5, RULE_bloqueCodigo = 6, RULE_sentencia = 7, 
		RULE_variables = 8, RULE_asignacion = 9, RULE_condicional = 10, RULE_cicloWhile = 11, 
		RULE_cicloFor = 12, RULE_returnDentro = 13, RULE_printDentro = 14, RULE_inputDentro = 15, 
		RULE_expresiones = 16, RULE_expresionLogica = 17, RULE_expresionIgualdad = 18, 
		RULE_expresionRelacional = 19, RULE_expresionSuma = 20, RULE_expresionMult = 21, 
		RULE_expresionUnaria = 22, RULE_llamadaFuncion = 23, RULE_constantes = 24, 
		RULE_tipo = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "importacion", "nombreCompleto", "main", "funciones", "parametro", 
			"bloqueCodigo", "sentencia", "variables", "asignacion", "condicional", 
			"cicloWhile", "cicloFor", "returnDentro", "printDentro", "inputDentro", 
			"expresiones", "expresionLogica", "expresionIgualdad", "expresionRelacional", 
			"expresionSuma", "expresionMult", "expresionUnaria", "llamadaFuncion", 
			"constantes", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'comienza'", "'hechizo'", "'intenso'", "'fenix'", "'dorado'", 
			"'chispa'", "'bondad'", "'Cancion'", "'vasto'", "'destino'", "'alterno'", 
			"'guardian'", "'viaje'", "'felices'", "'Divulga'", "'leer'", null, null, 
			null, null, null, null, "'='", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", 
			null, null, "';'", "','", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "MAIN", "HECHIZO", "INT", "FLOAT", "DOUBLE", "CHAR", "BOOLEAN", 
			"STRING", "VOID", "IF", "ELSE", "WHILE", "FOR", "RETURN", "SYSTEM_OUT_PRINTLN", 
			"LEER", "INT_CONSTANTE", "FLOAT_CONSTANTE", "CHAR_CONSTANTE", "STRING_CONSTANTE", 
			"BOOLEAN_CONSTANTE", "ID", "IGUAL", "SUMA", "RESTA", "MULTIPLICACION", 
			"DIVISION", "IGUALDAD", "DIFERENCIA", "MAYOR_MENOR_IGUALQUE", "OPERADORES_LOGICOS", 
			"PUNTO_Y_COMA", "COMA", "PARENTESIS_A", "PARENTESIS_C", "LLAVE_A", "LLAVE_C", 
			"WS", "LINE_COMMENT", "BLOCK_COMMENT", "UNCLOSED_COMMENT", "INVALID_FLOAT", 
			"INVALID_ID", "UNCLOSED_CHAR", "UNCLOSED_STRING", "ERROR_CHAR", "CONVOCA"
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONVOCA) {
				{
				{
				setState(52);
				importacion();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HECHIZO) {
				{
				{
				setState(58);
				funciones();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			main();
			setState(65);
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
		public NombreCompletoContext nombreCompleto() {
			return getRuleContext(NombreCompletoContext.class,0);
		}
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
			setState(67);
			match(CONVOCA);
			setState(68);
			nombreCompleto();
			setState(69);
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
	public static class NombreCompletoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiGramaticaParser.ID, i);
		}
		public NombreCompletoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombreCompleto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterNombreCompleto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitNombreCompleto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitNombreCompleto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombreCompletoContext nombreCompleto() throws RecognitionException {
		NombreCompletoContext _localctx = new NombreCompletoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nombreCompleto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ID);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(72);
				match(T__0);
				setState(73);
				match(ID);
				}
				}
				setState(78);
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
		enterRule(_localctx, 6, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(MAIN);
			setState(80);
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
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
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
		enterRule(_localctx, 8, RULE_funciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(HECHIZO);
			setState(83);
			tipo();
			setState(84);
			match(ID);
			setState(85);
			match(PARENTESIS_A);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2032L) != 0)) {
				{
				setState(86);
				parametro();
				}
			}

			setState(89);
			match(PARENTESIS_C);
			setState(90);
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
		enterRule(_localctx, 10, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			tipo();
			setState(93);
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
		enterRule(_localctx, 12, RULE_bloqueCodigo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(LLAVE_A);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8646640L) != 0)) {
				{
				{
				setState(96);
				sentencia();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
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
		enterRule(_localctx, 14, RULE_sentencia);
		try {
			setState(112);
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
				setState(104);
				variables();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				asignacion();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				condicional();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				cicloWhile();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				cicloFor();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				returnDentro();
				}
				break;
			case SYSTEM_OUT_PRINTLN:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				printDentro();
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 8);
				{
				setState(111);
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
		enterRule(_localctx, 16, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			tipo();
			setState(115);
			match(ID);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(116);
				match(IGUAL);
				setState(117);
				expresiones();
				}
			}

			setState(120);
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
		enterRule(_localctx, 18, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ID);
			setState(123);
			match(IGUAL);
			setState(124);
			expresiones();
			setState(125);
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
		enterRule(_localctx, 20, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(IF);
			setState(128);
			match(PARENTESIS_A);
			setState(129);
			expresiones();
			setState(130);
			match(PARENTESIS_C);
			setState(131);
			bloqueCodigo();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(132);
				match(ELSE);
				setState(133);
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
		enterRule(_localctx, 22, RULE_cicloWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(WHILE);
			setState(137);
			match(PARENTESIS_A);
			setState(138);
			expresiones();
			setState(139);
			match(PARENTESIS_C);
			setState(140);
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
		enterRule(_localctx, 24, RULE_cicloFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(FOR);
			setState(143);
			match(PARENTESIS_A);
			setState(147);
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
				setState(144);
				variables();
				}
				break;
			case ID:
				{
				setState(145);
				asignacion();
				}
				break;
			case PUNTO_Y_COMA:
				{
				setState(146);
				match(PUNTO_Y_COMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34376253440L) != 0)) {
				{
				setState(149);
				expresiones();
				}
			}

			setState(152);
			match(PUNTO_Y_COMA);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34376253440L) != 0)) {
				{
				setState(153);
				expresiones();
				}
			}

			setState(156);
			match(PARENTESIS_C);
			setState(157);
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
		enterRule(_localctx, 26, RULE_returnDentro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(RETURN);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34376253440L) != 0)) {
				{
				setState(160);
				expresiones();
				}
			}

			setState(163);
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
		enterRule(_localctx, 28, RULE_printDentro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(SYSTEM_OUT_PRINTLN);
			setState(166);
			match(PARENTESIS_A);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34376253440L) != 0)) {
				{
				setState(167);
				expresiones();
				}
			}

			setState(170);
			match(PARENTESIS_C);
			setState(171);
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
		enterRule(_localctx, 30, RULE_inputDentro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(LEER);
			setState(174);
			match(PARENTESIS_A);
			setState(175);
			match(ID);
			setState(176);
			match(PARENTESIS_C);
			setState(177);
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
		enterRule(_localctx, 32, RULE_expresiones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		enterRule(_localctx, 34, RULE_expresionLogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			expresionIgualdad();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERADORES_LOGICOS) {
				{
				{
				setState(182);
				match(OPERADORES_LOGICOS);
				setState(183);
				expresionIgualdad();
				}
				}
				setState(188);
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
		enterRule(_localctx, 36, RULE_expresionIgualdad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			expresionRelacional();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IGUALDAD || _la==DIFERENCIA) {
				{
				{
				setState(190);
				_la = _input.LA(1);
				if ( !(_la==IGUALDAD || _la==DIFERENCIA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(191);
				expresionRelacional();
				}
				}
				setState(196);
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
		enterRule(_localctx, 38, RULE_expresionRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			expresionSuma();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAYOR_MENOR_IGUALQUE) {
				{
				{
				setState(198);
				match(MAYOR_MENOR_IGUALQUE);
				setState(199);
				expresionSuma();
				}
				}
				setState(204);
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
		enterRule(_localctx, 40, RULE_expresionSuma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			expresionMult();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUMA || _la==RESTA) {
				{
				{
				setState(206);
				_la = _input.LA(1);
				if ( !(_la==SUMA || _la==RESTA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(207);
				expresionMult();
				}
				}
				setState(212);
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
		enterRule(_localctx, 42, RULE_expresionMult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			expresionUnaria();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICACION || _la==DIVISION) {
				{
				{
				setState(214);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLICACION || _la==DIVISION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(215);
				expresionUnaria();
				}
				}
				setState(220);
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
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
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
		enterRule(_localctx, 44, RULE_expresionUnaria);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(PARENTESIS_A);
				setState(222);
				expresiones();
				setState(223);
				match(PARENTESIS_C);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				constantes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				llamadaFuncion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
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
		public ExpresionesContext expresiones() {
			return getRuleContext(ExpresionesContext.class,0);
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
		enterRule(_localctx, 46, RULE_llamadaFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(ID);
			setState(231);
			match(PARENTESIS_A);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34376253440L) != 0)) {
				{
				setState(232);
				expresiones();
				}
			}

			setState(235);
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
		enterRule(_localctx, 48, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		enterRule(_localctx, 50, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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
		"\u0004\u00010\u00f2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0000\u0005\u0000<\b\u0000\n\u0000\f\u0000?\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002K\b\u0002\n\u0002"+
		"\f\u0002N\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004X\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0005\u0006b\b\u0006\n\u0006\f\u0006e\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007q\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\bw\b\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0087\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u0094\b\f\u0001\f\u0003\f\u0097\b\f\u0001\f\u0001\f\u0003\f\u009b"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u00a2\b\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a9\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u00b9\b\u0011\n\u0011\f\u0011\u00bc"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00c1\b\u0012"+
		"\n\u0012\f\u0012\u00c4\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u00c9\b\u0013\n\u0013\f\u0013\u00cc\t\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u00d1\b\u0014\n\u0014\f\u0014\u00d4\t\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00d9\b\u0015\n\u0015\f\u0015"+
		"\u00dc\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u00e5\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u00ea\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02\u0000\u0005\u0001\u0000\u001d\u001e\u0001\u0000\u0019"+
		"\u001a\u0001\u0000\u001b\u001c\u0001\u0000\u0012\u0016\u0001\u0000\u0004"+
		"\n\u00f4\u00007\u0001\u0000\u0000\u0000\u0002C\u0001\u0000\u0000\u0000"+
		"\u0004G\u0001\u0000\u0000\u0000\u0006O\u0001\u0000\u0000\u0000\bR\u0001"+
		"\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000\f_\u0001\u0000\u0000\u0000"+
		"\u000ep\u0001\u0000\u0000\u0000\u0010r\u0001\u0000\u0000\u0000\u0012z"+
		"\u0001\u0000\u0000\u0000\u0014\u007f\u0001\u0000\u0000\u0000\u0016\u0088"+
		"\u0001\u0000\u0000\u0000\u0018\u008e\u0001\u0000\u0000\u0000\u001a\u009f"+
		"\u0001\u0000\u0000\u0000\u001c\u00a5\u0001\u0000\u0000\u0000\u001e\u00ad"+
		"\u0001\u0000\u0000\u0000 \u00b3\u0001\u0000\u0000\u0000\"\u00b5\u0001"+
		"\u0000\u0000\u0000$\u00bd\u0001\u0000\u0000\u0000&\u00c5\u0001\u0000\u0000"+
		"\u0000(\u00cd\u0001\u0000\u0000\u0000*\u00d5\u0001\u0000\u0000\u0000,"+
		"\u00e4\u0001\u0000\u0000\u0000.\u00e6\u0001\u0000\u0000\u00000\u00ed\u0001"+
		"\u0000\u0000\u00002\u00ef\u0001\u0000\u0000\u000046\u0003\u0002\u0001"+
		"\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u00008=\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u0000:<\u0003\b\u0004\u0000;:\u0001\u0000\u0000\u0000<?\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0003\u0006\u0003"+
		"\u0000AB\u0005\u0000\u0000\u0001B\u0001\u0001\u0000\u0000\u0000CD\u0005"+
		"0\u0000\u0000DE\u0003\u0004\u0002\u0000EF\u0005!\u0000\u0000F\u0003\u0001"+
		"\u0000\u0000\u0000GL\u0005\u0017\u0000\u0000HI\u0005\u0001\u0000\u0000"+
		"IK\u0005\u0017\u0000\u0000JH\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0005\u0001"+
		"\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005\u0002\u0000\u0000"+
		"PQ\u0003\f\u0006\u0000Q\u0007\u0001\u0000\u0000\u0000RS\u0005\u0003\u0000"+
		"\u0000ST\u00032\u0019\u0000TU\u0005\u0017\u0000\u0000UW\u0005#\u0000\u0000"+
		"VX\u0003\n\u0005\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YZ\u0005$\u0000\u0000Z[\u0003\f\u0006\u0000"+
		"[\t\u0001\u0000\u0000\u0000\\]\u00032\u0019\u0000]^\u0005\u0017\u0000"+
		"\u0000^\u000b\u0001\u0000\u0000\u0000_c\u0005%\u0000\u0000`b\u0003\u000e"+
		"\u0007\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000fg\u0005&\u0000\u0000g\r\u0001\u0000\u0000\u0000"+
		"hq\u0003\u0010\b\u0000iq\u0003\u0012\t\u0000jq\u0003\u0014\n\u0000kq\u0003"+
		"\u0016\u000b\u0000lq\u0003\u0018\f\u0000mq\u0003\u001a\r\u0000nq\u0003"+
		"\u001c\u000e\u0000oq\u0003\u001e\u000f\u0000ph\u0001\u0000\u0000\u0000"+
		"pi\u0001\u0000\u0000\u0000pj\u0001\u0000\u0000\u0000pk\u0001\u0000\u0000"+
		"\u0000pl\u0001\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000q\u000f\u0001\u0000\u0000\u0000"+
		"rs\u00032\u0019\u0000sv\u0005\u0017\u0000\u0000tu\u0005\u0018\u0000\u0000"+
		"uw\u0003 \u0010\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xy\u0005!\u0000\u0000y\u0011\u0001\u0000\u0000"+
		"\u0000z{\u0005\u0017\u0000\u0000{|\u0005\u0018\u0000\u0000|}\u0003 \u0010"+
		"\u0000}~\u0005!\u0000\u0000~\u0013\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005\u000b\u0000\u0000\u0080\u0081\u0005#\u0000\u0000\u0081\u0082\u0003"+
		" \u0010\u0000\u0082\u0083\u0005$\u0000\u0000\u0083\u0086\u0003\f\u0006"+
		"\u0000\u0084\u0085\u0005\f\u0000\u0000\u0085\u0087\u0003\f\u0006\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0015\u0001\u0000\u0000\u0000\u0088\u0089\u0005\r\u0000\u0000\u0089"+
		"\u008a\u0005#\u0000\u0000\u008a\u008b\u0003 \u0010\u0000\u008b\u008c\u0005"+
		"$\u0000\u0000\u008c\u008d\u0003\f\u0006\u0000\u008d\u0017\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005\u000e\u0000\u0000\u008f\u0093\u0005#\u0000"+
		"\u0000\u0090\u0094\u0003\u0010\b\u0000\u0091\u0094\u0003\u0012\t\u0000"+
		"\u0092\u0094\u0005!\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0096\u0001\u0000\u0000\u0000\u0095\u0097\u0003 \u0010\u0000\u0096\u0095"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0001\u0000\u0000\u0000\u0098\u009a\u0005!\u0000\u0000\u0099\u009b\u0003"+
		" \u0010\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0005$\u0000"+
		"\u0000\u009d\u009e\u0003\f\u0006\u0000\u009e\u0019\u0001\u0000\u0000\u0000"+
		"\u009f\u00a1\u0005\u000f\u0000\u0000\u00a0\u00a2\u0003 \u0010\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005!\u0000\u0000\u00a4\u001b"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0010\u0000\u0000\u00a6\u00a8"+
		"\u0005#\u0000\u0000\u00a7\u00a9\u0003 \u0010\u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005$\u0000\u0000\u00ab\u00ac\u0005!\u0000\u0000"+
		"\u00ac\u001d\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0011\u0000\u0000"+
		"\u00ae\u00af\u0005#\u0000\u0000\u00af\u00b0\u0005\u0017\u0000\u0000\u00b0"+
		"\u00b1\u0005$\u0000\u0000\u00b1\u00b2\u0005!\u0000\u0000\u00b2\u001f\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0003\"\u0011\u0000\u00b4!\u0001\u0000"+
		"\u0000\u0000\u00b5\u00ba\u0003$\u0012\u0000\u00b6\u00b7\u0005 \u0000\u0000"+
		"\u00b7\u00b9\u0003$\u0012\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bb#\u0001\u0000\u0000\u0000\u00bc\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bd\u00c2\u0003&\u0013\u0000\u00be\u00bf\u0007"+
		"\u0000\u0000\u0000\u00bf\u00c1\u0003&\u0013\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3%\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00ca\u0003(\u0014\u0000"+
		"\u00c6\u00c7\u0005\u001f\u0000\u0000\u00c7\u00c9\u0003(\u0014\u0000\u00c8"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\'\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00d2"+
		"\u0003*\u0015\u0000\u00ce\u00cf\u0007\u0001\u0000\u0000\u00cf\u00d1\u0003"+
		"*\u0015\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3)\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d5\u00da\u0003,\u0016\u0000\u00d6\u00d7\u0007\u0002\u0000\u0000"+
		"\u00d7\u00d9\u0003,\u0016\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9"+
		"\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db+\u0001\u0000\u0000\u0000\u00dc\u00da"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0005#\u0000\u0000\u00de\u00df\u0003"+
		" \u0010\u0000\u00df\u00e0\u0005$\u0000\u0000\u00e0\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e5\u00030\u0018\u0000\u00e2\u00e5\u0003.\u0017\u0000\u00e3"+
		"\u00e5\u0005\u0017\u0000\u0000\u00e4\u00dd\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e5-\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0005\u0017\u0000\u0000\u00e7\u00e9\u0005#\u0000\u0000\u00e8\u00ea\u0003"+
		" \u0010\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005$\u0000"+
		"\u0000\u00ec/\u0001\u0000\u0000\u0000\u00ed\u00ee\u0007\u0003\u0000\u0000"+
		"\u00ee1\u0001\u0000\u0000\u0000\u00ef\u00f0\u0007\u0004\u0000\u0000\u00f0"+
		"3\u0001\u0000\u0000\u0000\u00147=LWcpv\u0086\u0093\u0096\u009a\u00a1\u00a8"+
		"\u00ba\u00c2\u00ca\u00d2\u00da\u00e4\u00e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}