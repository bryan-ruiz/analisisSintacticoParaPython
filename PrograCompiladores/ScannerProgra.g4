lexer grammar ScannerProgra;
tokens { INDENT, DEDENT }

@lexer::header {
  import com.yuvalshavit.antlr4.DenterHelper;
}

@lexer::members {
  private final DenterHelper denter = DenterHelper.builder()
    .nl(NEWLINE)
    .indent(ParserProgra.INDENT)
    .dedent(ParserProgra.DEDENT)
    .pullToken(ScannerProgra.super::nextToken);

  @Override
  public Token nextToken() {
    return denter.nextToken();
  }
}
NEWLINE: ('\r'? '\n' (' ' | '\t')*);
//Las palabras reservadas que tiene Python
DEF     : 'def';
IF      : 'if';
ELSE    : 'else';
WHILE   : 'while';
RETURN  : 'return';
PRINT   : 'print';
LEN     : 'len';



//Tokens para expresiones regulares
ID  :
    CharInicial CharContenido*;

INT
	:	'0'
	| '1'..'9' ('0'..'9')*
	;

STR : '"' ('""'|~'"')* '"' ;

CHAR : '\'' CharContenido'\'';

fragment
CharInicial
    : 'A'..'Z' | 'a'..'z'
    | '\u00C0'..'\u00D6'
    | '\u00D8'..'\u00F6'
    | '\u00F8'..'\u02FF'
    | '\u0370'..'\u037D'
    | '\u037F'..'\u1FFF'
    | '\u200C'..'\u200D'
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;
fragment
CharContenido
   : CharInicial
   | '0'..'9'
   | '_'
   | '\u00B7'
   | '\u0300'..'\u036F'
   | '\u203F'..'\u2040'
   ;

//Tokens para simbolos
COMA	:	',' ;
ASIGN	:	'=' ;
PCIRIZQ	:	'(' ;
PCIRDER	:	')' ;
SUMA	:	'+' ;
MUL		:	'*' ;
PCUAIZQ	:	'[' ;
PCUADER	:	']' ;
MENQ    :   '<' ;
MAYQ    :   '>' ;
MENIG   :   '<=';
MAYIG   :   '>=';
CMPIG   :   '==';
DP      :   ':' ;
DIV     :   '/' ;
RESTA   :   '-' ;


//elementos omitidos

SPECIAL_COMMENT
 : '"""'( SPECIAL_COMMENT | . )*?'"""' -> skip
 ;


COMENTARIO_LINEA: '#'.*?'\r'?'\n' -> skip;

WS:   [ \t\n\r] -> skip ;