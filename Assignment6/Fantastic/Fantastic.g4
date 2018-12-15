grammar Fantastic;

@header {
    import wci.intermediate.TypeSpec;
    //import wci.intermediate.symtabimpl.*;
}

/** Parser rules */
prog:   stat+ ; 

local_var_declarations: (var_decl_statement NEWLINE)*; // for local declaratiobs in every scope.

stat:   if_statement NEWLINE 				 # ifStat
	|   expr SEMICOLON NEWLINE				 # exprStat
	|   var_decl_statement NEWLINE			 # varDeclStat
	|   func_decl_statement NEWLINE			 # funcDeclStat
    |   assignment_statement NEWLINE		 # assignStat
    |   return_statement NEWLINE			 # returnStat
    |   WHILE '(' expr ')' block NEWLINE	 # whileStat
    |   PRINT '(' expr ')' SEMICOLON NEWLINE # printStat
    |   add_sub_short NEWLINE				 # shortAddSub
    |	add_sub_short_scalar NEWLINE		 # shortAddSubMulDivScalar
    |   NEWLINE								 # newLineStat
    ;

var_decl_statement : type variable SEMICOLON ;
func_decl_statement : FUNCTION (return_type)? function_name '(' params ')' block ;
assignment_statement : type variable '=' expr SEMICOLON # declarationOver
                     | variable '=' expr SEMICOLON		# assignmentOver
                     ;
if_statement: IF '(' expr ')' block (NEWLINE ELSE IF '(' expr ')' block)* (NEWLINE ELSE block)? ;
return_statement : RETURN expr SEMICOLON 				# returnOver;

type : INT_TYPE
	 | STRING_TYPE
	 ;

return_type : type ;

function_name : IDENTIFIER ;

ref_type : INT_TYPE_REF
         | STRING_TYPE_REF
         ;

add_sub_short: variable op=('++'|'--') SEMICOLON;
add_sub_short_scalar: variable op=('+='|'-='|'*='|'/=') expr SEMICOLON;

expr locals [ TypeSpec typeSpec = null ]
    :   expr op=('*'|'/'|'%') expr				# MulDivPercOver
    |   expr op=('+'|'-') expr					# AddSubOver
    |   expr op=( '>' | '<' | '<=' | '>=' | '==' ) expr # CompOpeOver
    |   literal								# Lit
    |   variable							# Var
    |   func_call							# FuncCall
    |   '(' expr ')'						# Parens
    |  expr '?' expr ':' expr				# TernaryOpeOver
    ;


variable : IDENTIFIER ;						
literal locals [ TypeSpec typeSpec = null ]
        : INT_LITERAL						#IntLitOver
        | STRING_LITERAL					#StrLitOver
        ;
func_call : function_name '(' args ')' ;

params : (parameter)? (',' parameter)* ;
parameter: type variable;
args : (variable | literal)? (',' (variable | literal))* ;

block : NEWLINE '{' NEWLINE local_var_declarations stat* '}' ;               // full block

/** Lexer rules below */

INT_TYPE : 'int' ;
STRING_TYPE : 'string' ;
INT_TYPE_REF : 'int&' ;
STRING_TYPE_REF : 'string&' ;

IF          : 'if' ;
ELIF		: 'else[ \t]+if';
ELSE		: 'else';
FUNCTION    : 'func' ;
WHILE       : 'while' ;
RETURN      : 'return' ;
PRINT       : 'print' ;
ADDADD		: '++';
SUBSUB		: '--';
MUL			: '*';
ADD			: '+';
SUB			: '-';
DIV			: '/';
PERC		: '%';
GT			: '>';
LT			: '<';
LET			: '<=';
GET			: '>=';
EQ			: '==';
IDENTIFIER  : [a-zA-Z]+;             // match identifiers <label id="code.tour.expr.3"/>
INT_LITERAL :   [0-9]+ ;
STRING_LITERAL : '"' ~('\r' | '\n' | '"')* '"' ;
NEWLINE     : '\r'? '\n' ;            // return newlines to parser (is end-statement signal)
WS          : [ \t]+ -> skip ;        // toss out whitespace
SEMICOLON   : ';' ;
COMMENT     : '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;