// Generated from C:/Users/Bryan/Documents/GitHub/analisisSintacticoParaPython/PrograCompiladores\ScannerProgra.g4 by ANTLR 4.6
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
public class ScannerProgra extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, NEWLINE=3, DEF=4, IF=5, ELSE=6, WHILE=7, RETURN=8, 
		PRINT=9, LEN=10, ID=11, INT=12, STR=13, CHAR=14, COMA=15, ASIGN=16, PCIRIZQ=17, 
		PCIRDER=18, SUMA=19, MUL=20, PCUAIZQ=21, PCUADER=22, MENQ=23, MAYQ=24, 
		MENIG=25, MAYIG=26, CMPIG=27, DP=28, DIV=29, RESTA=30, SPECIAL_COMMENT=31, 
		COMENTARIO_LINEA=32, WS=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NEWLINE", "DEF", "IF", "ELSE", "WHILE", "RETURN", "PRINT", "LEN", "ID", 
		"INT", "STR", "CHAR", "CharInicial", "CharContenido", "COMA", "ASIGN", 
		"PCIRIZQ", "PCIRDER", "SUMA", "MUL", "PCUAIZQ", "PCUADER", "MENQ", "MAYQ", 
		"MENIG", "MAYIG", "CMPIG", "DP", "DIV", "RESTA", "SPECIAL_COMMENT", "COMENTARIO_LINEA", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'def'", "'if'", "'else'", "'while'", "'return'", 
		"'print'", "'len'", null, null, null, null, "','", "'='", "'('", "')'", 
		"'+'", "'*'", "'['", "']'", "'<'", "'>'", "'<='", "'>='", "'=='", "':'", 
		"'/'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDENT", "DEDENT", "NEWLINE", "DEF", "IF", "ELSE", "WHILE", "RETURN", 
		"PRINT", "LEN", "ID", "INT", "STR", "CHAR", "COMA", "ASIGN", "PCIRIZQ", 
		"PCIRDER", "SUMA", "MUL", "PCUAIZQ", "PCUADER", "MENQ", "MAYQ", "MENIG", 
		"MAYIG", "CMPIG", "DP", "DIV", "RESTA", "SPECIAL_COMMENT", "COMENTARIO_LINEA", 
		"WS"
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


	  private final DenterHelper denter = DenterHelper.builder()
	    .nl(NEWLINE)
	    .indent(ParserProgra.INDENT)
	    .dedent(ParserProgra.DEDENT)
	    .pullToken(ScannerProgra.super::nextToken);

	  @Override
	  public Token nextToken() {
	    return denter.nextToken();
	  }


	public ScannerProgra(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ScannerProgra.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\5\2G\n\2\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\7\nu"+
		"\n\n\f\n\16\nx\13\n\3\13\3\13\3\13\7\13}\n\13\f\13\16\13\u0080\13\13\5"+
		"\13\u0082\n\13\3\f\3\f\3\f\3\f\7\f\u0088\n\f\f\f\16\f\u008b\13\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\5\17\u0097\n\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \7 \u00c2\n \f \16 \u00c5\13 \3"+
		" \3 \3 \3 \3 \3 \3!\3!\7!\u00cf\n!\f!\16!\u00d2\13!\3!\5!\u00d5\n!\3!"+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\4\u00c3\u00d0\2#\3\5\5\6\7\7\t\b\13\t\r\n\17"+
		"\13\21\f\23\r\25\16\27\17\31\20\33\2\35\2\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\7\4\2\13\13\""+
		"\"\3\2$$\17\2C\\c|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381"+
		"\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2"+
		"\uffff\7\2\62;aa\u00b9\u00b9\u0302\u0371\u2041\u2042\5\2\13\f\17\17\""+
		"\"\u00e7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3F\3\2\2\2\5O\3\2\2\2\7S\3\2\2\2\tV"+
		"\3\2\2\2\13[\3\2\2\2\ra\3\2\2\2\17h\3\2\2\2\21n\3\2\2\2\23r\3\2\2\2\25"+
		"\u0081\3\2\2\2\27\u0083\3\2\2\2\31\u008e\3\2\2\2\33\u0092\3\2\2\2\35\u0096"+
		"\3\2\2\2\37\u0098\3\2\2\2!\u009a\3\2\2\2#\u009c\3\2\2\2%\u009e\3\2\2\2"+
		"\'\u00a0\3\2\2\2)\u00a2\3\2\2\2+\u00a4\3\2\2\2-\u00a6\3\2\2\2/\u00a8\3"+
		"\2\2\2\61\u00aa\3\2\2\2\63\u00ac\3\2\2\2\65\u00af\3\2\2\2\67\u00b2\3\2"+
		"\2\29\u00b5\3\2\2\2;\u00b7\3\2\2\2=\u00b9\3\2\2\2?\u00bb\3\2\2\2A\u00cc"+
		"\3\2\2\2C\u00da\3\2\2\2EG\7\17\2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HL\7\f"+
		"\2\2IK\t\2\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\4\3\2\2\2NL\3"+
		"\2\2\2OP\7f\2\2PQ\7g\2\2QR\7h\2\2R\6\3\2\2\2ST\7k\2\2TU\7h\2\2U\b\3\2"+
		"\2\2VW\7g\2\2WX\7n\2\2XY\7u\2\2YZ\7g\2\2Z\n\3\2\2\2[\\\7y\2\2\\]\7j\2"+
		"\2]^\7k\2\2^_\7n\2\2_`\7g\2\2`\f\3\2\2\2ab\7t\2\2bc\7g\2\2cd\7v\2\2de"+
		"\7w\2\2ef\7t\2\2fg\7p\2\2g\16\3\2\2\2hi\7r\2\2ij\7t\2\2jk\7k\2\2kl\7p"+
		"\2\2lm\7v\2\2m\20\3\2\2\2no\7n\2\2op\7g\2\2pq\7p\2\2q\22\3\2\2\2rv\5\33"+
		"\16\2su\5\35\17\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\24\3\2\2\2"+
		"xv\3\2\2\2y\u0082\7\62\2\2z~\4\63;\2{}\4\62;\2|{\3\2\2\2}\u0080\3\2\2"+
		"\2~|\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0081y\3\2"+
		"\2\2\u0081z\3\2\2\2\u0082\26\3\2\2\2\u0083\u0089\7$\2\2\u0084\u0085\7"+
		"$\2\2\u0085\u0088\7$\2\2\u0086\u0088\n\3\2\2\u0087\u0084\3\2\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7$\2\2\u008d"+
		"\30\3\2\2\2\u008e\u008f\7)\2\2\u008f\u0090\5\35\17\2\u0090\u0091\7)\2"+
		"\2\u0091\32\3\2\2\2\u0092\u0093\t\4\2\2\u0093\34\3\2\2\2\u0094\u0097\5"+
		"\33\16\2\u0095\u0097\t\5\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\36\3\2\2\2\u0098\u0099\7.\2\2\u0099 \3\2\2\2\u009a\u009b\7?\2\2\u009b"+
		"\"\3\2\2\2\u009c\u009d\7*\2\2\u009d$\3\2\2\2\u009e\u009f\7+\2\2\u009f"+
		"&\3\2\2\2\u00a0\u00a1\7-\2\2\u00a1(\3\2\2\2\u00a2\u00a3\7,\2\2\u00a3*"+
		"\3\2\2\2\u00a4\u00a5\7]\2\2\u00a5,\3\2\2\2\u00a6\u00a7\7_\2\2\u00a7.\3"+
		"\2\2\2\u00a8\u00a9\7>\2\2\u00a9\60\3\2\2\2\u00aa\u00ab\7@\2\2\u00ab\62"+
		"\3\2\2\2\u00ac\u00ad\7>\2\2\u00ad\u00ae\7?\2\2\u00ae\64\3\2\2\2\u00af"+
		"\u00b0\7@\2\2\u00b0\u00b1\7?\2\2\u00b1\66\3\2\2\2\u00b2\u00b3\7?\2\2\u00b3"+
		"\u00b4\7?\2\2\u00b48\3\2\2\2\u00b5\u00b6\7<\2\2\u00b6:\3\2\2\2\u00b7\u00b8"+
		"\7\61\2\2\u00b8<\3\2\2\2\u00b9\u00ba\7/\2\2\u00ba>\3\2\2\2\u00bb\u00bc"+
		"\7$\2\2\u00bc\u00bd\7$\2\2\u00bd\u00be\7$\2\2\u00be\u00c3\3\2\2\2\u00bf"+
		"\u00c2\5? \2\u00c0\u00c2\13\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7$\2\2\u00c7\u00c8\7$\2"+
		"\2\u00c8\u00c9\7$\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b \2\2\u00cb@\3"+
		"\2\2\2\u00cc\u00d0\7%\2\2\u00cd\u00cf\13\2\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\7\17\2\2\u00d4\u00d3\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\f\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00d9\b!\2\2\u00d9B\3\2\2\2\u00da\u00db\t\6\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00dd\b\"\2\2\u00ddD\3\2\2\2\17\2FLv~\u0081\u0087\u0089"+
		"\u0096\u00c1\u00c3\u00d0\u00d4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}