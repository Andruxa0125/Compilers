grammar Expr;

/** Parser rules */
prog:   stat+ ; 

stat:   if_statement NEWLINE
	|   expr SEMICOLON NEWLINE
	|   var_decl_statement NEWLINE
	|   func_decl_statement NEWLINE
    |   assignment_statement NEWLINE
    |   return_statement NEWLINE
    |   WHILE '(' expr ')' block NEWLINE
    |   NEWLINE
    ;

var_decl_statement : type variable SEMICOLON ;
func_decl_statement : FUNCTION (return_type)? function_name '(' params ')' block ;
assignment_statement : type variable '=' expr SEMICOLON
                     | variable '=' expr SEMICOLON
                     ;
if_statement: IF '(' expr ')' block (NEWLINE ELSE block)? ;
return_statement : RETURN expr SEMICOLON;

type : INT_TYPE
	 | STRING_TYPE
	 ;

return_type : type ;

function_name : IDENTIFIER ;

ref_type : INT_TYPE_REF
         | STRING_TYPE_REF
         ;



expr:   expr ('*'|'/'|'%') expr
    |   expr ('+'|'-') expr
    |   expr op=( '>' | '<' | '<=' | '>=' | '==' ) expr
    |   literal
    |   variable
    |   func_call
    |   '(' expr ')'
    ;

variable : IDENTIFIER ;
literal : INT_LITERAL
        | STRING_LITERAL
        ;
func_call : function_name '(' args ')' ;

params : ((type | ref_type) variable)? (',' (type | ref_type) variable)* ;

args : (variable | literal)? (',' (variable | literal))* ;

block : NEWLINE '{' NEWLINE stat* '}'                // full block
      | NEWLINE stat                                 // simple block
      ;

/** Lexer rules below */

INT_TYPE : 'int' ;
STRING_TYPE : 'string' ;
INT_TYPE_REF : 'int&' ;
STRING_TYPE_REF : 'string&' ;

/** Reserved words */
IF          : 'if' ;
ELSE		: 'else';
FUNCTION    : 'func' ;
WHILE       : 'while' ;
RETURN      : 'return' ;

/** Literals */
IDENTIFIER  : [a-zA-Z]+;             // match identifiers <label id="code.tour.expr.3"/>
INT_LITERAL :   [0-9]+ ;
STRING_LITERAL : '"'[a-zA-Z0-9]*'"';
NEWLINE     : '\r'? '\n' ;            // return newlines to parser (is end-statement signal)
WS          : [ \t]+ -> skip ;        // toss out whitespace


/** Symbols */
MUL         : '*' ;
DIV         : '/' ;
MOD         : '%' ;
ADD         : '+' ;
SUB         : '-' ;
GT          : '>' ;
LT          : '<' ;
ASSIGN      : '=' ;
GE          : '>=' ;
LE          : '<=' ;
EQ          : '==' ;
SEMICOLON   : ';' ;