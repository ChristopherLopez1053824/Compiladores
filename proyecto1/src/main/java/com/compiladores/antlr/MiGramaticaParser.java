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
		CLASS=1, PUBLIC=2, STATIC=3, VOID=4, ARGS=5, NEW=6, MAIN=7, INT=8, FLOAT=9, 
		DOUBLE=10, LONG=11, SHORT=12, BYTE=13, CHAR=14, BOOLEAN=15, STRING=16, 
		NULL=17, IF=18, ELSE=19, DO=20, WHILE=21, FOR=22, RETURN=23, SWITCH=24, 
		CASE=25, SYSTEM_OUT_PRINTLN=26, INT_CONSTANTE=27, FLOAT_CONSTANTE=28, 
		CHAR_CONSTANTE=29, STRING_CONSTANTE=30, BOOLEAN_CONSTANTE=31, ID=32, IGUAL=33, 
		SUMA=34, RESTA=35, MULTIPLICACION=36, DIVISION=37, IGUALDAD=38, DIFERENCIA=39, 
		MAYOR_MENOR_IGUALQUE=40, OPERADORES_LOGICOS=41, PUNTO_Y_COMA=42, COMA=43, 
		PARENTESIS_A=44, PARENTESIS_C=45, LLAVE_A=46, LLAVE_C=47, CORCHETE_A=48, 
		CORCHETE_C=49, ESPECIALES=50, WS=51, LINE_COMMENT=52, BLOCK_COMMENT=53;
	public static final int
		RULE_programa = 0, RULE_clase = 1, RULE_cuerpoClase = 2, RULE_variables = 3, 
		RULE_metodos = 4, RULE_parametros = 5, RULE_parametro = 6, RULE_tipo = 7, 
		RULE_bloqueCodigo = 8, RULE_dentro = 9, RULE_asignacion = 10, RULE_condicional = 11, 
		RULE_cicloWhile = 12, RULE_cicloFor = 13, RULE_returnDentro = 14, RULE_printDentro = 15, 
		RULE_expresiones = 16, RULE_constantes = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "clase", "cuerpoClase", "variables", "metodos", "parametros", 
			"parametro", "tipo", "bloqueCodigo", "dentro", "asignacion", "condicional", 
			"cicloWhile", "cicloFor", "returnDentro", "printDentro", "expresiones", 
			"constantes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Celestial'", "'Pueblo'", "'Magico'", "'Vasto'", "'Alegre'", "'Novedad'", 
			"'Comienza'", "'Intenso'", "'Fenix'", "'Dorado'", "'Dragon'", "'Sapo'", 
			"'Boo'", "'Chispa'", "'Bondad'", "'Cancion'", "'Invisible'", "'Destino'", 
			"'Alterno'", "'Domina'", "'Guardian'", "'Viaje'", "'VivieronFelicesParaSiempre'", 
			"'Cambio'", "'Perspectiva'", "'Divulga'", null, null, null, null, null, 
			null, "'='", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", null, null, 
			"';'", "','", "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "PUBLIC", "STATIC", "VOID", "ARGS", "NEW", "MAIN", "INT", 
			"FLOAT", "DOUBLE", "LONG", "SHORT", "BYTE", "CHAR", "BOOLEAN", "STRING", 
			"NULL", "IF", "ELSE", "DO", "WHILE", "FOR", "RETURN", "SWITCH", "CASE", 
			"SYSTEM_OUT_PRINTLN", "INT_CONSTANTE", "FLOAT_CONSTANTE", "CHAR_CONSTANTE", 
			"STRING_CONSTANTE", "BOOLEAN_CONSTANTE", "ID", "IGUAL", "SUMA", "RESTA", 
			"MULTIPLICACION", "DIVISION", "IGUALDAD", "DIFERENCIA", "MAYOR_MENOR_IGUALQUE", 
			"OPERADORES_LOGICOS", "PUNTO_Y_COMA", "COMA", "PARENTESIS_A", "PARENTESIS_C", 
			"LLAVE_A", "LLAVE_C", "CORCHETE_A", "CORCHETE_C", "ESPECIALES", "WS", 
			"LINE_COMMENT", "BLOCK_COMMENT"
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
		public TerminalNode EOF() { return getToken(MiGramaticaParser.EOF, 0); }
		public List<ClaseContext> clase() {
			return getRuleContexts(ClaseContext.class);
		}
		public ClaseContext clase(int i) {
			return getRuleContext(ClaseContext.class,i);
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
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				clase();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			setState(41);
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
	public static class ClaseContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MiGramaticaParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(MiGramaticaParser.ID, 0); }
		public TerminalNode LLAVE_A() { return getToken(MiGramaticaParser.LLAVE_A, 0); }
		public CuerpoClaseContext cuerpoClase() {
			return getRuleContext(CuerpoClaseContext.class,0);
		}
		public TerminalNode LLAVE_C() { return getToken(MiGramaticaParser.LLAVE_C, 0); }
		public ClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterClase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitClase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitClase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClaseContext clase() throws RecognitionException {
		ClaseContext _localctx = new ClaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_clase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(CLASS);
			setState(44);
			match(ID);
			setState(45);
			match(LLAVE_A);
			setState(46);
			cuerpoClase();
			setState(47);
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
	public static class CuerpoClaseContext extends ParserRuleContext {
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public List<MetodosContext> metodos() {
			return getRuleContexts(MetodosContext.class);
		}
		public MetodosContext metodos(int i) {
			return getRuleContext(MetodosContext.class,i);
		}
		public CuerpoClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpoClase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterCuerpoClase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitCuerpoClase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitCuerpoClase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoClaseContext cuerpoClase() throws RecognitionException {
		CuerpoClaseContext _localctx = new CuerpoClaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cuerpoClase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 130836L) != 0)) {
				{
				setState(51);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
				case INT:
				case FLOAT:
				case DOUBLE:
				case LONG:
				case SHORT:
				case BYTE:
				case CHAR:
				case BOOLEAN:
				case STRING:
					{
					setState(49);
					variables();
					}
					break;
				case PUBLIC:
					{
					setState(50);
					metodos();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(55);
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
		enterRule(_localctx, 6, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			tipo();
			setState(57);
			match(ID);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGUAL) {
				{
				setState(58);
				match(IGUAL);
				setState(59);
				expresiones(0);
				}
			}

			setState(62);
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
	public static class MetodosContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(MiGramaticaParser.PUBLIC, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiGramaticaParser.ID, 0); }
		public TerminalNode PARENTESIS_A() { return getToken(MiGramaticaParser.PARENTESIS_A, 0); }
		public TerminalNode PARENTESIS_C() { return getToken(MiGramaticaParser.PARENTESIS_C, 0); }
		public BloqueCodigoContext bloqueCodigo() {
			return getRuleContext(BloqueCodigoContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(MiGramaticaParser.STATIC, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public MetodosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterMetodos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitMetodos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitMetodos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodosContext metodos() throws RecognitionException {
		MetodosContext _localctx = new MetodosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_metodos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(PUBLIC);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(65);
				match(STATIC);
				}
			}

			setState(68);
			tipo();
			setState(69);
			match(ID);
			setState(70);
			match(PARENTESIS_A);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 130832L) != 0)) {
				{
				setState(71);
				parametros();
				}
			}

			setState(74);
			match(PARENTESIS_C);
			setState(75);
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
	public static class ParametrosContext extends ParserRuleContext {
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
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			parametro();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(78);
				match(COMA);
				setState(79);
				parametro();
				}
				}
				setState(84);
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
		enterRule(_localctx, 12, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			tipo();
			setState(86);
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MiGramaticaParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MiGramaticaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(MiGramaticaParser.DOUBLE, 0); }
		public TerminalNode LONG() { return getToken(MiGramaticaParser.LONG, 0); }
		public TerminalNode SHORT() { return getToken(MiGramaticaParser.SHORT, 0); }
		public TerminalNode BYTE() { return getToken(MiGramaticaParser.BYTE, 0); }
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
		enterRule(_localctx, 14, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 130832L) != 0)) ) {
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
	public static class BloqueCodigoContext extends ParserRuleContext {
		public TerminalNode LLAVE_A() { return getToken(MiGramaticaParser.LLAVE_A, 0); }
		public TerminalNode LLAVE_C() { return getToken(MiGramaticaParser.LLAVE_C, 0); }
		public List<DentroContext> dentro() {
			return getRuleContexts(DentroContext.class);
		}
		public DentroContext dentro(int i) {
			return getRuleContext(DentroContext.class,i);
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
		enterRule(_localctx, 16, RULE_bloqueCodigo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(LLAVE_A);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70373121326864L) != 0)) {
				{
				{
				setState(91);
				dentro();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
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
	public static class DentroContext extends ParserRuleContext {
		public BloqueCodigoContext bloqueCodigo() {
			return getRuleContext(BloqueCodigoContext.class,0);
		}
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
		public DentroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dentro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).enterDentro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiGramaticaListener ) ((MiGramaticaListener)listener).exitDentro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiGramaticaVisitor ) return ((MiGramaticaVisitor<? extends T>)visitor).visitDentro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DentroContext dentro() throws RecognitionException {
		DentroContext _localctx = new DentroContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dentro);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLAVE_A:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				bloqueCodigo();
				}
				break;
			case VOID:
			case INT:
			case FLOAT:
			case DOUBLE:
			case LONG:
			case SHORT:
			case BYTE:
			case CHAR:
			case BOOLEAN:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				variables();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				asignacion();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				condicional();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				cicloWhile();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				cicloFor();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(105);
				returnDentro();
				}
				break;
			case SYSTEM_OUT_PRINTLN:
				enterOuterAlt(_localctx, 8);
				{
				setState(106);
				printDentro();
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
		enterRule(_localctx, 20, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ID);
			setState(110);
			match(IGUAL);
			setState(111);
			expresiones(0);
			setState(112);
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
		public List<DentroContext> dentro() {
			return getRuleContexts(DentroContext.class);
		}
		public DentroContext dentro(int i) {
			return getRuleContext(DentroContext.class,i);
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
		enterRule(_localctx, 22, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IF);
			setState(115);
			match(PARENTESIS_A);
			setState(116);
			expresiones(0);
			setState(117);
			match(PARENTESIS_C);
			setState(118);
			dentro();
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(119);
				match(ELSE);
				setState(120);
				dentro();
				}
				break;
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
		public DentroContext dentro() {
			return getRuleContext(DentroContext.class,0);
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
		enterRule(_localctx, 24, RULE_cicloWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(WHILE);
			setState(124);
			match(PARENTESIS_A);
			setState(125);
			expresiones(0);
			setState(126);
			match(PARENTESIS_C);
			setState(127);
			dentro();
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
		public DentroContext dentro() {
			return getRuleContext(DentroContext.class,0);
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
		enterRule(_localctx, 26, RULE_cicloFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(FOR);
			setState(130);
			match(PARENTESIS_A);
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case INT:
			case FLOAT:
			case DOUBLE:
			case LONG:
			case SHORT:
			case BYTE:
			case CHAR:
			case BOOLEAN:
			case STRING:
				{
				setState(131);
				variables();
				}
				break;
			case ID:
				{
				setState(132);
				asignacion();
				}
				break;
			case PUNTO_Y_COMA:
				{
				setState(133);
				match(PUNTO_Y_COMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17600641761280L) != 0)) {
				{
				setState(136);
				expresiones(0);
				}
			}

			setState(139);
			match(PUNTO_Y_COMA);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17600641761280L) != 0)) {
				{
				setState(140);
				expresiones(0);
				}
			}

			setState(143);
			match(PARENTESIS_C);
			setState(144);
			dentro();
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
		enterRule(_localctx, 28, RULE_returnDentro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(RETURN);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17600641761280L) != 0)) {
				{
				setState(147);
				expresiones(0);
				}
			}

			setState(150);
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
		enterRule(_localctx, 30, RULE_printDentro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(SYSTEM_OUT_PRINTLN);
			setState(153);
			match(PARENTESIS_A);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17600641761280L) != 0)) {
				{
				setState(154);
				expresiones(0);
				}
			}

			setState(157);
			match(PARENTESIS_C);
			setState(158);
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
		public TerminalNode PARENTESIS_A() { return getToken(MiGramaticaParser.PARENTESIS_A, 0); }
		public List<ExpresionesContext> expresiones() {
			return getRuleContexts(ExpresionesContext.class);
		}
		public ExpresionesContext expresiones(int i) {
			return getRuleContext(ExpresionesContext.class,i);
		}
		public TerminalNode PARENTESIS_C() { return getToken(MiGramaticaParser.PARENTESIS_C, 0); }
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiGramaticaParser.ID, 0); }
		public TerminalNode MULTIPLICACION() { return getToken(MiGramaticaParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(MiGramaticaParser.DIVISION, 0); }
		public TerminalNode SUMA() { return getToken(MiGramaticaParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(MiGramaticaParser.RESTA, 0); }
		public TerminalNode IGUALDAD() { return getToken(MiGramaticaParser.IGUALDAD, 0); }
		public TerminalNode DIFERENCIA() { return getToken(MiGramaticaParser.DIFERENCIA, 0); }
		public TerminalNode MAYOR_MENOR_IGUALQUE() { return getToken(MiGramaticaParser.MAYOR_MENOR_IGUALQUE, 0); }
		public TerminalNode OPERADORES_LOGICOS() { return getToken(MiGramaticaParser.OPERADORES_LOGICOS, 0); }
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
		return expresiones(0);
	}

	private ExpresionesContext expresiones(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionesContext _localctx = new ExpresionesContext(_ctx, _parentState);
		ExpresionesContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expresiones, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTESIS_A:
				{
				setState(161);
				match(PARENTESIS_A);
				setState(162);
				expresiones(0);
				setState(163);
				match(PARENTESIS_C);
				}
				break;
			case INT_CONSTANTE:
			case FLOAT_CONSTANTE:
			case CHAR_CONSTANTE:
			case STRING_CONSTANTE:
			case BOOLEAN_CONSTANTE:
				{
				setState(165);
				constantes();
				}
				break;
			case ID:
				{
				setState(166);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresiones);
						setState(169);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(170);
						match(MULTIPLICACION);
						setState(171);
						expresiones(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresiones);
						setState(172);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(173);
						match(DIVISION);
						setState(174);
						expresiones(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresiones);
						setState(175);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(176);
						match(SUMA);
						setState(177);
						expresiones(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpresionesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresiones);
						setState(178);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(179);
						match(RESTA);
						setState(180);
						expresiones(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpresionesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresiones);
						setState(181);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(182);
						match(IGUALDAD);
						setState(183);
						expresiones(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpresionesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresiones);
						setState(184);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(185);
						match(DIFERENCIA);
						setState(186);
						expresiones(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpresionesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresiones);
						setState(187);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(188);
						match(MAYOR_MENOR_IGUALQUE);
						setState(189);
						expresiones(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpresionesContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresiones);
						setState(190);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(191);
						match(OPERADORES_LOGICOS);
						setState(192);
						expresiones(5);
						}
						break;
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 34, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160749568L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expresiones_sempred((ExpresionesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresiones_sempred(ExpresionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u00c9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0004\u0000"+
		"&\b\u0000\u000b\u0000\f\u0000\'\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0005\u00024\b\u0002\n\u0002\f\u00027\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003=\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0003\u0004C\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004I\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005Q\b"+
		"\u0005\n\u0005\f\u0005T\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b]\b\b\n\b\f\b`\t\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tl\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"z\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u0087\b\r\u0001\r\u0003\r\u008a\b\r"+
		"\u0001\r\u0001\r\u0003\r\u008e\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0095\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u009c\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00a8\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00c2\b\u0010"+
		"\n\u0010\f\u0010\u00c5\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0000"+
		"\u0001 \u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"\u0000\u0002\u0002\u0000\u0004\u0004\b\u0010"+
		"\u0001\u0000\u001b\u001f\u00d6\u0000%\u0001\u0000\u0000\u0000\u0002+\u0001"+
		"\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000"+
		"\u0000\b@\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000\fU\u0001"+
		"\u0000\u0000\u0000\u000eX\u0001\u0000\u0000\u0000\u0010Z\u0001\u0000\u0000"+
		"\u0000\u0012k\u0001\u0000\u0000\u0000\u0014m\u0001\u0000\u0000\u0000\u0016"+
		"r\u0001\u0000\u0000\u0000\u0018{\u0001\u0000\u0000\u0000\u001a\u0081\u0001"+
		"\u0000\u0000\u0000\u001c\u0092\u0001\u0000\u0000\u0000\u001e\u0098\u0001"+
		"\u0000\u0000\u0000 \u00a7\u0001\u0000\u0000\u0000\"\u00c6\u0001\u0000"+
		"\u0000\u0000$&\u0003\u0002\u0001\u0000%$\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"()\u0001\u0000\u0000\u0000)*\u0005\u0000\u0000\u0001*\u0001\u0001\u0000"+
		"\u0000\u0000+,\u0005\u0001\u0000\u0000,-\u0005 \u0000\u0000-.\u0005.\u0000"+
		"\u0000./\u0003\u0004\u0002\u0000/0\u0005/\u0000\u00000\u0003\u0001\u0000"+
		"\u0000\u000014\u0003\u0006\u0003\u000024\u0003\b\u0004\u000031\u0001\u0000"+
		"\u0000\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u00006\u0005\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u000089\u0003\u000e\u0007\u00009<\u0005 \u0000"+
		"\u0000:;\u0005!\u0000\u0000;=\u0003 \u0010\u0000<:\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0005*\u0000\u0000"+
		"?\u0007\u0001\u0000\u0000\u0000@B\u0005\u0002\u0000\u0000AC\u0005\u0003"+
		"\u0000\u0000BA\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DE\u0003\u000e\u0007\u0000EF\u0005 \u0000\u0000FH\u0005"+
		",\u0000\u0000GI\u0003\n\u0005\u0000HG\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0005-\u0000\u0000KL\u0003"+
		"\u0010\b\u0000L\t\u0001\u0000\u0000\u0000MR\u0003\f\u0006\u0000NO\u0005"+
		"+\u0000\u0000OQ\u0003\f\u0006\u0000PN\u0001\u0000\u0000\u0000QT\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"S\u000b\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UV\u0003\u000e"+
		"\u0007\u0000VW\u0005 \u0000\u0000W\r\u0001\u0000\u0000\u0000XY\u0007\u0000"+
		"\u0000\u0000Y\u000f\u0001\u0000\u0000\u0000Z^\u0005.\u0000\u0000[]\u0003"+
		"\u0012\t\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\"+
		"\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000ab\u0005/\u0000\u0000b\u0011\u0001\u0000"+
		"\u0000\u0000cl\u0003\u0010\b\u0000dl\u0003\u0006\u0003\u0000el\u0003\u0014"+
		"\n\u0000fl\u0003\u0016\u000b\u0000gl\u0003\u0018\f\u0000hl\u0003\u001a"+
		"\r\u0000il\u0003\u001c\u000e\u0000jl\u0003\u001e\u000f\u0000kc\u0001\u0000"+
		"\u0000\u0000kd\u0001\u0000\u0000\u0000ke\u0001\u0000\u0000\u0000kf\u0001"+
		"\u0000\u0000\u0000kg\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000l\u0013\u0001\u0000"+
		"\u0000\u0000mn\u0005 \u0000\u0000no\u0005!\u0000\u0000op\u0003 \u0010"+
		"\u0000pq\u0005*\u0000\u0000q\u0015\u0001\u0000\u0000\u0000rs\u0005\u0012"+
		"\u0000\u0000st\u0005,\u0000\u0000tu\u0003 \u0010\u0000uv\u0005-\u0000"+
		"\u0000vy\u0003\u0012\t\u0000wx\u0005\u0013\u0000\u0000xz\u0003\u0012\t"+
		"\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0017\u0001"+
		"\u0000\u0000\u0000{|\u0005\u0015\u0000\u0000|}\u0005,\u0000\u0000}~\u0003"+
		" \u0010\u0000~\u007f\u0005-\u0000\u0000\u007f\u0080\u0003\u0012\t\u0000"+
		"\u0080\u0019\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0016\u0000\u0000"+
		"\u0082\u0086\u0005,\u0000\u0000\u0083\u0087\u0003\u0006\u0003\u0000\u0084"+
		"\u0087\u0003\u0014\n\u0000\u0085\u0087\u0005*\u0000\u0000\u0086\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u008a"+
		"\u0003 \u0010\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0005"+
		"*\u0000\u0000\u008c\u008e\u0003 \u0010\u0000\u008d\u008c\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005-\u0000\u0000\u0090\u0091\u0003\u0012\t\u0000"+
		"\u0091\u001b\u0001\u0000\u0000\u0000\u0092\u0094\u0005\u0017\u0000\u0000"+
		"\u0093\u0095\u0003 \u0010\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005*\u0000\u0000\u0097\u001d\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0005\u001a\u0000\u0000\u0099\u009b\u0005,\u0000\u0000\u009a\u009c\u0003"+
		" \u0010\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0005-\u0000"+
		"\u0000\u009e\u009f\u0005*\u0000\u0000\u009f\u001f\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0006\u0010\uffff\uffff\u0000\u00a1\u00a2\u0005,\u0000\u0000"+
		"\u00a2\u00a3\u0003 \u0010\u0000\u00a3\u00a4\u0005-\u0000\u0000\u00a4\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a8\u0003\"\u0011\u0000\u00a6\u00a8\u0005"+
		" \u0000\u0000\u00a7\u00a0\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00c3\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\n\u000b\u0000\u0000\u00aa\u00ab\u0005$\u0000"+
		"\u0000\u00ab\u00c2\u0003 \u0010\f\u00ac\u00ad\n\n\u0000\u0000\u00ad\u00ae"+
		"\u0005%\u0000\u0000\u00ae\u00c2\u0003 \u0010\u000b\u00af\u00b0\n\t\u0000"+
		"\u0000\u00b0\u00b1\u0005\"\u0000\u0000\u00b1\u00c2\u0003 \u0010\n\u00b2"+
		"\u00b3\n\b\u0000\u0000\u00b3\u00b4\u0005#\u0000\u0000\u00b4\u00c2\u0003"+
		" \u0010\t\u00b5\u00b6\n\u0007\u0000\u0000\u00b6\u00b7\u0005&\u0000\u0000"+
		"\u00b7\u00c2\u0003 \u0010\b\u00b8\u00b9\n\u0006\u0000\u0000\u00b9\u00ba"+
		"\u0005\'\u0000\u0000\u00ba\u00c2\u0003 \u0010\u0007\u00bb\u00bc\n\u0005"+
		"\u0000\u0000\u00bc\u00bd\u0005(\u0000\u0000\u00bd\u00c2\u0003 \u0010\u0006"+
		"\u00be\u00bf\n\u0004\u0000\u0000\u00bf\u00c0\u0005)\u0000\u0000\u00c0"+
		"\u00c2\u0003 \u0010\u0005\u00c1\u00a9\u0001\u0000\u0000\u0000\u00c1\u00ac"+
		"\u0001\u0000\u0000\u0000\u00c1\u00af\u0001\u0000\u0000\u0000\u00c1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00c1\u00b5\u0001\u0000\u0000\u0000\u00c1\u00b8"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bb\u0001\u0000\u0000\u0000\u00c1\u00be"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4!\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c7\u0007"+
		"\u0001\u0000\u0000\u00c7#\u0001\u0000\u0000\u0000\u0012\'35<BHR^ky\u0086"+
		"\u0089\u008d\u0094\u009b\u00a7\u00c1\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}