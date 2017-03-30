lexer grammar ScannerProgra;


tokens { INDENT, DEDENT }

@lexer::header {
  import com.yuvalshavit.antlr4.DenterHelper;
}

@lexer::members {
  private final com.yuvalshavit.antlr4.DenterHelper denter = com.yuvalshavit.antlr4.DenterHelper.builder()
    .nl(NEWLINE)
    .indent(ParserProgra.INDENT)
    .dedent(ParserProgra.DEDENT)
    .pullToken(ScannerProgra.super::nextToken);

  @Override
  public Token nextToken() {
    return denter.nextToken();
  }
}

//Tokens para palabras reservadas
INT	: 'int';
STRING : 'string';
CHAR : 'char';
IF : 'if';
ELSE : 'else';
WHILE :	'while';
DEF	: 'def';
RETURN : 'return';
LEN : 'len';
PRINT :	'print';

NEWLINE : ('\r'? '\n' (' ' | '\t')*);

//Tokens para simbolos
DP              :	':' ;
PyCOMA	        :	';' ;
COMA	        :	',' ;
ASIGN	        :	'=' ;
PCIRIZQ	        :	'(' ;
PCIRDER	        :	')' ;
PCUAIZQ	        :	'[' ;
PCUADER	        :	']' ;
SUMA	        :	'+' ;
RESTA	        :	'-' ;
MUL		        :	'*' ;
DIV		        :	'/' ;
MAYQ	        :	'>' ;
MENQ	        :	'<' ;
MAYIG           :	'>=' ;
MENIG           :	'<=' ;
CMPIG           :	'==' ;
CMPDIF          :	'!=' ;

//Tokens para expresiones regulares
NUM
	:	'0'
	| '1'..'9' ('0'..'9')*
	;

ID
	:	CharInicial CharContenido*
	;

STR : '"' ('""'|~'"')* '"' ;

//char inicial y char contenido.


//el modificador fragment determina que la regla en particular no será reconocida como regla léxica
//y solo podrá ser utilizada como parte de una existente
//
//Aquí por ejemplo, CharContenido se crea no para que se reconozca como tal sino para ser parte de la regla anterior ID


fragment
CharContenido
   : CharInicial
   | '0'..'9'
   | '_'
   | '\u00B7'
   | '\u0300'..'\u036F'
   | '\u203F'..'\u2040'
   ;
fragment
CharInicial
   : 'A'..'Z' | 'a'..'z'  //va de la a a la Z en mayuscula y en minúscula.
   | '\u00C0'..'\u00D6'     //frgment cuando se necesita modular lo que se está haciendo
   | '\u00D8'..'\u00F6'     //fragmen es para que me devuelva token ID y no char contenido o inicial. NO SEA UN TOKEN
   | '\u00F8'..'\u02FF'     //id= char inicial mas char contenido
   | '\u0370'..'\u037D'
   | '\u037F'..'\u1FFF'
   | '\u200C'..'\u200D'
   | '\u2070'..'\u218F'
   | '\u2C00'..'\u2FEF'
   | '\u3001'..'\uD7FF'
   | '\uF900'..'\uFDCF'
   | '\uFDF0'..'\uFFFD'
   ;

//elementos omitidos
LINE_COMMENT:   '#'.*?'\r'?'\n' -> skip ;  //tiene que empezar oon // el punto solito (.) significa cualquier caracter cero o más veces(*)
                                            //en algunos editores el enter esta presedido de '\r' o puede ser que no lo traiga ?
                                            // puede venir lo que sea cero o más veces
                                            //? = opcional.

SPECIAL_COMMENT
 : '"""'( SPECIAL_COMMENT | . )*?'"""' -> skip
 ;

WS:   [ \t\n\r]+ -> skip ; //El espacio en blanco es equivalente a ' '+...


//salto de linea

