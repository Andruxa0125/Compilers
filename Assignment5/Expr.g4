grammar Expr;

/** The start rule; begin parsing here. */
prog:   stat+ ; 

stat:   if_statement NEWLINE
	|   expr NEWLINE                    // expr and Newline
    |   assignment_statement NEWLINE    // assignment statement
    |   WHILE '(' expr ')' block NEWLINE // While
    |   NEWLINE                         // Newline
    ;

assignment_statement : type variable '=' expr SEMICOLON;
if_statement: IF '(' expr ')' block (NEWLINE ELSE block)?;

type : INT_TYPE
	 | STRING_TYPE ;

variable : IDENTIFIER ;

expr:   expr ('*'|'/'|'%') expr                           // Multiplication, Division, Module
    |   expr ('+'|'-') expr                               // Additiona and subtraction
    |   expr op=( '>' | '<' | '<=' | '>=' | '==' ) expr   // ComparingExpr
    |   FUNCTION '(' param ')' block                      // FunctionDeclaration
    |   expr '(' arguments ')'                            // FunctionCall
    |   INT                                               // Integer value
    |   IDENTIFIER                                                // Id
    |   '(' expr ')'                                      // expr in brackets
    ;

/** Type */
INT_TYPE : 'int' ;
STRING_TYPE : 'string' ;

/** Reserved words */
IF          : 'if' ;
ELSE		: 'else';
FUNCTION    : 'function' ;
WHILE       : 'while' ; 

/** Literals */
IDENTIFIER          : [a-zA-Z]+;             // match identifiers <label id="code.tour.expr.3"/>
INT         : [0-9]+ ;                // match integers
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
SEMICOLON   : ';' ;                 // We agreed on using semicolon at the end right?
                                    // if no, get rid of this line.
                                
param: (IDENTIFIER)? (',' IDENTIFIER)*              // function parameters
    ;

arguments: (expr)? (',' expr)*      // function arguments
    ;

block: NEWLINE '{' NEWLINE stat* '}'                // full block
     | NEWLINE stat                      // simple block
        ;