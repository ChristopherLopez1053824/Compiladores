// Generated from MiGramatica.g4 by ANTLR 4.13.1

package com.lab1compiladores;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiGramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BIN_ID=2, B4_ID=3, HEX_ID=4, PLUS=5, MINUS=6, MUL=7, DIV=8, LPAREN=9, 
		RPAREN=10, BINARIO=11, BASE4=12, HEX=13, ID=14, NEWLINE=15, WS=16, COMMENT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "BIN_ID", "B4_ID", "HEX_ID", "PLUS", "MINUS", "MUL", "DIV", "LPAREN", 
			"RPAREN", "BINARIO", "BASE4", "HEX", "ID", "NEWLINE", "WS", "COMMENT"
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


	public MiGramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiGramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0011g\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0004\n>\b\n\u000b\n\f"+
		"\n?\u0001\u000b\u0004\u000bC\b\u000b\u000b\u000b\f\u000bD\u0001\f\u0004"+
		"\fH\b\f\u000b\f\f\fI\u0001\r\u0001\r\u0005\rN\b\r\n\r\f\rQ\t\r\u0001\u000e"+
		"\u0004\u000eT\b\u000e\u000b\u000e\f\u000eU\u0001\u000f\u0004\u000fY\b"+
		"\u000f\u000b\u000f\f\u000fZ\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0005\u0010a\b\u0010\n\u0010\f\u0010d\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0000\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0007"+
		"\u0001\u000001\u0001\u000003\u0003\u000009AFaf\u0002\u0000AZaz\u0003\u0000"+
		"09AZaz\u0002\u0000\n\n\r\r\u0002\u0000\t\t  m\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001"+
		"#\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005)\u0001"+
		"\u0000\u0000\u0000\u0007,\u0001\u0000\u0000\u0000\t0\u0001\u0000\u0000"+
		"\u0000\u000b2\u0001\u0000\u0000\u0000\r4\u0001\u0000\u0000\u0000\u000f"+
		"6\u0001\u0000\u0000\u0000\u00118\u0001\u0000\u0000\u0000\u0013:\u0001"+
		"\u0000\u0000\u0000\u0015=\u0001\u0000\u0000\u0000\u0017B\u0001\u0000\u0000"+
		"\u0000\u0019G\u0001\u0000\u0000\u0000\u001bK\u0001\u0000\u0000\u0000\u001d"+
		"S\u0001\u0000\u0000\u0000\u001fX\u0001\u0000\u0000\u0000!^\u0001\u0000"+
		"\u0000\u0000#$\u0005=\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005"+
		"B\u0000\u0000&\'\u0005I\u0000\u0000\'(\u0005N\u0000\u0000(\u0004\u0001"+
		"\u0000\u0000\u0000)*\u0005B\u0000\u0000*+\u00054\u0000\u0000+\u0006\u0001"+
		"\u0000\u0000\u0000,-\u0005H\u0000\u0000-.\u0005E\u0000\u0000./\u0005X"+
		"\u0000\u0000/\b\u0001\u0000\u0000\u000001\u0005+\u0000\u00001\n\u0001"+
		"\u0000\u0000\u000023\u0005-\u0000\u00003\f\u0001\u0000\u0000\u000045\u0005"+
		"*\u0000\u00005\u000e\u0001\u0000\u0000\u000067\u0005/\u0000\u00007\u0010"+
		"\u0001\u0000\u0000\u000089\u0005(\u0000\u00009\u0012\u0001\u0000\u0000"+
		"\u0000:;\u0005)\u0000\u0000;\u0014\u0001\u0000\u0000\u0000<>\u0007\u0000"+
		"\u0000\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0016\u0001\u0000\u0000"+
		"\u0000AC\u0007\u0001\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\u0018"+
		"\u0001\u0000\u0000\u0000FH\u0007\u0002\u0000\u0000GF\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000J\u001a\u0001\u0000\u0000\u0000KO\u0007\u0003\u0000\u0000"+
		"LN\u0007\u0004\u0000\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u001c\u0001"+
		"\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RT\u0007\u0005\u0000\u0000"+
		"SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000V\u001e\u0001\u0000\u0000\u0000WY\u0007"+
		"\u0006\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\]\u0006\u000f\u0000\u0000] \u0001\u0000\u0000\u0000^b\u0005#\u0000"+
		"\u0000_a\b\u0005\u0000\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0006\u0010\u0000\u0000f\"\u0001"+
		"\u0000\u0000\u0000\b\u0000?DIOUZb\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}