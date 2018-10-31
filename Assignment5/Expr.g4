grammar Expr;

/** The start rule; begin parsing here. */
prog:   stat+ ; 

stat:   expr NEWLINE                    # expr and Newline
    |   ID '=' expr NEWLINE             # assignment
    |   WHILE '(' expr ')' block        # While
    |   NEWLINE                         # Newline
    ;

expr:   expr ('*'|'/'|'%') expr                           # Multiplication, Division, Module
    |   expr ('+'|'-') expr                               # Additiona and subtraction
    |   expr op=( '>' | '<' | '<=' | '>=' | '==' ) expr   # ComparingExpr
    |   FUNCTION '(' param ')' block                      # FunctionDeclaration
    |   expr '(' arguments ')'                            # FunctionCall
	|   ID ASSIGN expr                                    # Assign     //you want to use this Izzy?
    |   INT                                               # Integer value
    |   ID                                                # Id
    |   '(' expr ')'                                      # expr in brackets
    ;

/** Literals */
ID          : [a-zA-Z]+ ;             # match identifiers <label id="code.tour.expr.3"/>
INT         : [0-9]+ ;                # match integers            
NEWLINE     : '\r'? '\n' ;            # return newlines to parser (is end-statement signal)
WS          : [ \t]+ -> skip ;        # toss out whitespace

/** Reserved words */
IF          : 'if' ;
FUNCTION    : 'function' ;
WHILE       : 'while' ; 

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
SEPARATOR   : ';' ;                 # We agreed on using semicolon at the end right?
                                    # if no, get rid of this line.
                                
param: (ID)? (',' ID)*              # function parameters
    ;

arguments: (expr)? (',' expr)*      # function arguments
    ;

block: '{' stat* '}'                # full block
        | stat                      # simple block
        ;