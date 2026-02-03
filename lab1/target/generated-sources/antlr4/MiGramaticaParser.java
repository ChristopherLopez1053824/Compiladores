// Generated from MiGramatica.g4 by ANTLR 4.13.1
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
		T__0=1, BIN_ID=2, B4_ID=3, HEX_ID=4, BINARIO=5, BASE4=6, HEX=7, NEWLINE=8, 
		WS=9;
	public static final int
		RULE_prog = 0, RULE_declaracion = 1, RULE_binDecl = 2, RULE_b4Decl = 3, 
		RULE_hexDecl = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaracion", "binDecl", "b4Decl", "hexDecl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'BIN'", "'B4'", "'HEX'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BIN_ID", "B4_ID", "HEX_ID", "BINARIO", "BASE4", "HEX", "NEWLINE", 
			"WS"
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) {
				{
				{
				setState(10);
				declaracion();
				setState(11);
				match(NEWLINE);
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
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
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracion);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BIN_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				binDecl();
				}
				break;
			case B4_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				b4Decl();
				}
				break;
			case HEX_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
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
	}

	public final BinDeclContext binDecl() throws RecognitionException {
		BinDeclContext _localctx = new BinDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_binDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(BIN_ID);
			setState(26);
			match(T__0);
			setState(27);
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
	}

	public final B4DeclContext b4Decl() throws RecognitionException {
		B4DeclContext _localctx = new B4DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_b4Decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(B4_ID);
			setState(30);
			match(T__0);
			setState(31);
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
	}

	public final HexDeclContext hexDecl() throws RecognitionException {
		HexDeclContext _localctx = new HexDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_hexDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(HEX_ID);
			setState(34);
			match(T__0);
			setState(35);
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

	public static final String _serializedATN =
		"\u0004\u0001\t&\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000"+
		"\u0011\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004"+
		"\u0006\b\u0000\u0000#\u0000\u000f\u0001\u0000\u0000\u0000\u0002\u0017"+
		"\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000\u0000\u0000\u0006\u001d"+
		"\u0001\u0000\u0000\u0000\b!\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002"+
		"\u0001\u0000\u000b\f\u0005\b\u0000\u0000\f\u000e\u0001\u0000\u0000\u0000"+
		"\r\n\u0001\u0000\u0000\u0000\u000e\u0011\u0001\u0000\u0000\u0000\u000f"+
		"\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0012"+
		"\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0005\u0000\u0000\u0001\u0013\u0001\u0001\u0000\u0000\u0000\u0014\u0018"+
		"\u0003\u0004\u0002\u0000\u0015\u0018\u0003\u0006\u0003\u0000\u0016\u0018"+
		"\u0003\b\u0004\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0003\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0005\u0002\u0000\u0000\u001a\u001b\u0005"+
		"\u0001\u0000\u0000\u001b\u001c\u0005\u0005\u0000\u0000\u001c\u0005\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005\u0003\u0000\u0000\u001e\u001f\u0005"+
		"\u0001\u0000\u0000\u001f \u0005\u0006\u0000\u0000 \u0007\u0001\u0000\u0000"+
		"\u0000!\"\u0005\u0004\u0000\u0000\"#\u0005\u0001\u0000\u0000#$\u0005\u0007"+
		"\u0000\u0000$\t\u0001\u0000\u0000\u0000\u0002\u000f\u0017";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}