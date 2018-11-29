grammar Fantastic;

@header {
    import wci.intermediate.TypeSpec;
    //import wci.intermediate.symtabimpl.*;
}

/** Parser rules */
prog:   stat+ ; 

stat:   if_statement NEWLINE 				# ifStat
	|   expr SEMICOLON NEWLINE				# printStat
	|   var_decl_statement NEWLINE			# varDeclStat
	|   func_decl_statement NEWLINE			# funcDeclStat
    |   assignment_statement NEWLINE		# assignStat
    |   return_statement NEWLINE			# returnStat
    |   WHILE '(' expr ')' block NEWLINE	# whileStat
    |   NEWLINE								# newLineStat
    ;

var_decl_statement : type variable SEMICOLON ;
func_decl_statement : FUNCTION (return_type)? function_name '(' params ')' block ;
assignment_statement : type variable '=' expr SEMICOLON # declarationOver
                     | variable '=' expr SEMICOLON		# assignmentOver
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



expr locals [ TypeSpec typeSpec = null ]
    :   expr op=('*'|'/'|'%') expr				# MulDivPercOver
    |   expr op=('+'|'-') expr					# AddSubOver
    |   expr op=( '>' | '<' | '<=' | '>=' | '==' ) expr # CompOpeOver
    |   literal								# Lit
    |   variable							# Var
    |   func_call							# FuncCall
    |   '(' expr ')'						# Parens
    ;

variable : IDENTIFIER ;						
literal locals [ TypeSpec typeSpec = null ]
        : INT_LITERAL						#IntLitOver
        | STRING_LITERAL					#StrLitOver
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

IF          : 'if' ;
ELSE		: 'else';
FUNCTION    : 'func' ;
WHILE       : 'while' ;
RETURN      : 'return' ;

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
STRING_LITERAL : '"'[a-zA-Z0-9]*'"';
NEWLINE     : '\r'? '\n' ;            // return newlines to parser (is end-statement signal)
WS          : [ \t]+ -> skip ;        // toss out whitespace
SEMICOLON   : ';' ;