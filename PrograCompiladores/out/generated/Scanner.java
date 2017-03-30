// Generated from C:/Users/Bryan/Desktop/PrograCompiladores/PrograCompiladores\Scanner.g4 by ANTLR 4.6
package generated;

  import com.yuvalshavit.antlr4.DenterHelper;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Scanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, INT=3, STRING=4, CHAR=5, IF=6, ELSE=7, WHILE=8, DEF=9, 
		RETURN=10, LEN=11, PRINT=12, DP=13, PyCOMA=14, COMA=15, ASIGN=16, PCIRIZQ=17, 
		PCIRDER=18, PCUAIZQ=19, PCUADER=20, SUMA=21, RESTA=22, MUL=23, DIV=24, 
		MAYQ=25, MENQ=26, MAYIG=27, MENIG=28, CMPIG=29, CMPDIF=30, NUM=31, ID=32, 
		STR=33, LINE_COMMENT=34, SPECIAL_COMMENT=35, WS=36, NEWLINE=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "STRING", "CHAR", "IF", "ELSE", "WHILE", "DEF", "RETURN", "LEN", 
		"PRINT", "DP", "PyCOMA", "COMA", "ASIGN", "PCIRIZQ", "PCIRDER", "PCUAIZQ", 
		"PCUADER", "SUMA", "RESTA", "MUL", "DIV", "MAYQ", "MENQ", "MAYIG", "MENIG", 
		"CMPIG", "CMPDIF", "NUM", "ID", "STR", "CharContenido", "CharInicial", 
		"LINE_COMMENT", "SPECIAL_COMMENT", "WS", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'int'", "'string'", "'char'", "'if'", "'else'", "'while'", 
		"'def'", "'return'", "'len'", "'print'", "':'", "';'", "','", "'='", "'('", 
		"')'", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", 
		"'<='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDENT", "DEDENT", "INT", "STRING", "CHAR", "IF", "ELSE", "WHILE", 
		"DEF", "RETURN", "LEN", "PRINT", "DP", "PyCOMA", "COMA", "ASIGN", "PCIRIZQ", 
		"PCIRDER", "PCUAIZQ", "PCUADER", "SUMA", "RESTA", "MUL", "DIV", "MAYQ", 
		"MENQ", "MAYIG", "MENIG", "CMPIG", "CMPDIF", "NUM", "ID", "STR", "LINE_COMMENT", 
		"SPECIAL_COMMENT", "WS", "NEWLINE"
	};
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


	  private final com.yuvalshavit.antlr4.DenterHelper denter = com.yuvalshavit.antlr4.DenterHelper.builder()
	    .nl(NEWLINE)
	    .indent(ParserProgra.INDENT)
	    .dedent(ParserProgra.DEDENT)
	    .pullToken(Scanner.super::nextToken);

	  @Override
	  public Token nextToken() {
	    return denter.nextToken();
	  }


	public Scanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scanner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u00fc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u00ac\n\36\f\36\16\36\u00af"+
		"\13\36\5\36\u00b1\n\36\3\37\3\37\7\37\u00b5\n\37\f\37\16\37\u00b8\13\37"+
		"\3 \3 \3 \3 \7 \u00be\n \f \16 \u00c1\13 \3 \3 \3!\3!\5!\u00c7\n!\3\""+
		"\3\"\3#\3#\3#\3#\7#\u00cf\n#\f#\16#\u00d2\13#\3#\5#\u00d5\n#\3#\3#\3#"+
		"\3#\3$\3$\3$\3$\3$\3$\7$\u00e1\n$\f$\16$\u00e4\13$\3$\3$\3$\3$\3$\3$\3"+
		"%\6%\u00ed\n%\r%\16%\u00ee\3%\3%\3&\5&\u00f4\n&\3&\3&\7&\u00f8\n&\f&\16"+
		"&\u00fb\13&\4\u00d0\u00e2\2\'\3\5\5\6\7\7\t\b\13\t\r\n\17\13\21\f\23\r"+
		"\25\16\27\17\31\20\33\21\35\22\37\23!\24#\25%\26\'\27)\30+\31-\32/\33"+
		"\61\34\63\35\65\36\67\379 ;!=\"?#A\2C\2E$G%I&K\'\3\2\7\3\2$$\7\2\62;a"+
		"a\u00b9\u00b9\u0302\u0371\u2041\u2042\17\2C\\c|\u00c2\u00d8\u00da\u00f8"+
		"\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1"+
		"\u3003\ud801\uf902\ufdd1\ufdf2\uffff\5\2\13\f\17\17\"\"\4\2\13\13\"\""+
		"\u0106\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\3M\3\2\2\2\5Q\3\2\2\2\7X\3\2\2\2\t]\3\2\2\2\13`\3\2\2\2\re\3"+
		"\2\2\2\17k\3\2\2\2\21o\3\2\2\2\23v\3\2\2\2\25z\3\2\2\2\27\u0080\3\2\2"+
		"\2\31\u0082\3\2\2\2\33\u0084\3\2\2\2\35\u0086\3\2\2\2\37\u0088\3\2\2\2"+
		"!\u008a\3\2\2\2#\u008c\3\2\2\2%\u008e\3\2\2\2\'\u0090\3\2\2\2)\u0092\3"+
		"\2\2\2+\u0094\3\2\2\2-\u0096\3\2\2\2/\u0098\3\2\2\2\61\u009a\3\2\2\2\63"+
		"\u009c\3\2\2\2\65\u009f\3\2\2\2\67\u00a2\3\2\2\29\u00a5\3\2\2\2;\u00b0"+
		"\3\2\2\2=\u00b2\3\2\2\2?\u00b9\3\2\2\2A\u00c6\3\2\2\2C\u00c8\3\2\2\2E"+
		"\u00ca\3\2\2\2G\u00da\3\2\2\2I\u00ec\3\2\2\2K\u00f3\3\2\2\2MN\7k\2\2N"+
		"O\7p\2\2OP\7v\2\2P\4\3\2\2\2QR\7u\2\2RS\7v\2\2ST\7t\2\2TU\7k\2\2UV\7p"+
		"\2\2VW\7i\2\2W\6\3\2\2\2XY\7e\2\2YZ\7j\2\2Z[\7c\2\2[\\\7t\2\2\\\b\3\2"+
		"\2\2]^\7k\2\2^_\7h\2\2_\n\3\2\2\2`a\7g\2\2ab\7n\2\2bc\7u\2\2cd\7g\2\2"+
		"d\f\3\2\2\2ef\7y\2\2fg\7j\2\2gh\7k\2\2hi\7n\2\2ij\7g\2\2j\16\3\2\2\2k"+
		"l\7f\2\2lm\7g\2\2mn\7h\2\2n\20\3\2\2\2op\7t\2\2pq\7g\2\2qr\7v\2\2rs\7"+
		"w\2\2st\7t\2\2tu\7p\2\2u\22\3\2\2\2vw\7n\2\2wx\7g\2\2xy\7p\2\2y\24\3\2"+
		"\2\2z{\7r\2\2{|\7t\2\2|}\7k\2\2}~\7p\2\2~\177\7v\2\2\177\26\3\2\2\2\u0080"+
		"\u0081\7<\2\2\u0081\30\3\2\2\2\u0082\u0083\7=\2\2\u0083\32\3\2\2\2\u0084"+
		"\u0085\7.\2\2\u0085\34\3\2\2\2\u0086\u0087\7?\2\2\u0087\36\3\2\2\2\u0088"+
		"\u0089\7*\2\2\u0089 \3\2\2\2\u008a\u008b\7+\2\2\u008b\"\3\2\2\2\u008c"+
		"\u008d\7]\2\2\u008d$\3\2\2\2\u008e\u008f\7_\2\2\u008f&\3\2\2\2\u0090\u0091"+
		"\7-\2\2\u0091(\3\2\2\2\u0092\u0093\7/\2\2\u0093*\3\2\2\2\u0094\u0095\7"+
		",\2\2\u0095,\3\2\2\2\u0096\u0097\7\61\2\2\u0097.\3\2\2\2\u0098\u0099\7"+
		"@\2\2\u0099\60\3\2\2\2\u009a\u009b\7>\2\2\u009b\62\3\2\2\2\u009c\u009d"+
		"\7@\2\2\u009d\u009e\7?\2\2\u009e\64\3\2\2\2\u009f\u00a0\7>\2\2\u00a0\u00a1"+
		"\7?\2\2\u00a1\66\3\2\2\2\u00a2\u00a3\7?\2\2\u00a3\u00a4\7?\2\2\u00a48"+
		"\3\2\2\2\u00a5\u00a6\7#\2\2\u00a6\u00a7\7?\2\2\u00a7:\3\2\2\2\u00a8\u00b1"+
		"\7\62\2\2\u00a9\u00ad\4\63;\2\u00aa\u00ac\4\62;\2\u00ab\u00aa\3\2\2\2"+
		"\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b1"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b1"+
		"<\3\2\2\2\u00b2\u00b6\5C\"\2\u00b3\u00b5\5A!\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7>\3\2\2\2"+
		"\u00b8\u00b6\3\2\2\2\u00b9\u00bf\7$\2\2\u00ba\u00bb\7$\2\2\u00bb\u00be"+
		"\7$\2\2\u00bc\u00be\n\2\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7$\2\2\u00c3@\3\2\2\2\u00c4\u00c7"+
		"\5C\"\2\u00c5\u00c7\t\3\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"B\3\2\2\2\u00c8\u00c9\t\4\2\2\u00c9D\3\2\2\2\u00ca\u00cb\7\61\2\2\u00cb"+
		"\u00cc\7\61\2\2\u00cc\u00d0\3\2\2\2\u00cd\u00cf\13\2\2\2\u00ce\u00cd\3"+
		"\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\7\17\2\2\u00d4\u00d3\3"+
		"\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\f\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\b#\2\2\u00d9F\3\2\2\2\u00da\u00db\7$\2\2\u00db"+
		"\u00dc\7$\2\2\u00dc\u00dd\7$\2\2\u00dd\u00e2\3\2\2\2\u00de\u00e1\5G$\2"+
		"\u00df\u00e1\13\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\7$\2\2\u00e6\u00e7\7$\2\2\u00e7\u00e8\7$\2"+
		"\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\b$\2\2\u00eaH\3\2\2\2\u00eb\u00ed\t"+
		"\5\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\b%\2\2\u00f1J\3\2\2\2\u00f2"+
		"\u00f4\7\17\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3"+
		"\2\2\2\u00f5\u00f9\7\f\2\2\u00f6\u00f8\t\6\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00faL\3\2\2\2"+
		"\u00fb\u00f9\3\2\2\2\20\2\u00ad\u00b0\u00b6\u00bd\u00bf\u00c6\u00d0\u00d4"+
		"\u00e0\u00e2\u00ee\u00f3\u00f9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}