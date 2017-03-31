parser grammar ParserProgra;

options{
    tokenVocab = ScannerProgra;
}

program
    : statement (statement)* EOF                                                #programStatement
    ;

statement
    : defStatement                                                              #statementDefStatement
    | ifStatement                                                               #statementIfStatement
    | returnStatement                                                           #statementReturnStatement
    | printStatement                                                            #statementPrintStatement
    | whileStatement                                                            #statementWhileStatement
    | assignStatement                                                           #statementAssignStatement
    | functionCallStatement                                                     #statementFunctionCallStatement
    ;

defStatement
    : DEF ID PCIRIZQ argList PCIRDER DP sequence                                #defStatementRule
    ;

argList
    : ID moreArgs                                                               #argListId
    |                                                                           #argListEmpty
    ;

moreArgs
    : (COMA ID)*                                                                #moreArgsRule
    ;

ifStatement
    : IF expression DP sequence ELSE DP sequence                                #ifStatementRule
    ;

whileStatement
    : WHILE expression DP sequence                                              #whileStatementRule
    ;

returnStatement
    : RETURN expression NEWLINE                                                 #returnStatementRule
    ;

printStatement
    : PRINT PCIRIZQ expression PCIRDER NEWLINE                                  #printStatementRule
    ;

assignStatement
    : ID ASIGN expression NEWLINE                                               #assignStatementRule
    ;

functionCallStatement
    : primitiveExpression PCIRIZQ expressionList PCIRDER NEWLINE                #functionCallStatementRule
    ;

sequence
    : INDENT moreStatement DEDENT                                               #sequenceRule
    ;

moreStatement
    : statement (statement)*                                                    #moreStatementRule
    ;

expression
    : additionExpression comparison                                             #expressionRule
    ;

comparison
    : ((MENQ|MAYQ|MENIG|MAYIG|CMPIG) additionExpression)*                       #comparisonRule
    ;

additionExpression
    : multiplicationExpression additionFactor                                   #additionExpressionRule
    ;

additionFactor
    : ((SUMA|RESTA) multiplicationExpression)*                                  #additionFactorRule
    ;

multiplicationExpression
    : elementExpression multiplicationFactor                                    #multiplicationExpressionRule
    ;

multiplicationFactor
    : ((MUL|DIV) elementExpression)*                                            #multiplicationFactorRule
    ;


elementExpression
    : primitiveExpression elementAccess                                         #elementExpressionRule
    ;

elementAccess
    : (PCUAIZQ expression PCUADER)*                                             #elementAccessRule
    ;

functionCallExpression
    : ID PCIRIZQ expressionList PCIRDER                                         #functionCallExpressionRule
    ;

expressionList
    : expression moreExpressions                                                #expressionListRule
    |                                                                           #expressionListEmpty
    ;

moreExpressions
    : (COMA expression)*                                                        #moreExpressionsRule
    ;

primitiveExpression
    : INT                                                                       #primitiveExpressionInt
    | STR                                                                       #primitiveExpressionString
    | ID                                                                        #primitiveExpressionId
    | CHAR                                                                      #primitiveExpressionChar
    | PCIRIZQ expression PCIRDER                                                #primitiveExpressionParenthesis
    | listExpression                                                            #primitiveExpressionList
    | LEN PCIRIZQ expression PCIRDER                                            #primitiveExpressionLen
    | functionCallExpression                                                    #primitiveExpressionFunction
    ;

listExpression
    : PCUAIZQ expressionList PCUADER                                            #listExpressionRule
    ;