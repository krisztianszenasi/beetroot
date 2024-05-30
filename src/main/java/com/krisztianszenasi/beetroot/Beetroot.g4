grammar Beetroot;

// A file is built up from a number of "statements".
file: block EOF;

// They are preceded and followed by any number of NEWLINE tokens.
// Single "statements" are separated by atleast one NEWLINE token.
block
    :   newline?
        statement? (newline statement)*
        newline?
    ;
statement: simpleStatement | compoundStatement;
simpleStatement
    :   variableDeclaration
    |   assignmentStatement
    |   expression
    |   returnStatement
    |   flowControl
    ;
compoundStatement
   :    ifStatement
   |    whileStatement
   |    forStatement
   |    functionDefinition
   ;


// statement helpers
newline: NEWLINE+;
flowControl: BREAK | CONTINUE;

// ---------------------------------------------------------------------------------------------------------------------
// Simple statements
// ---------------------------------------------------------------------------------------------------------------------
variableDeclaration
    :   mutability variableName declarationType? (ASSIGN expression)?
    ;
assignmentStatement: primary assignment expression;
expression
    :   primary                                 #primaryExpression
    |   expression mulDivOp expression          #mulDivExpression
    |   expression addSubOp expression          #addSubExpression
    |   expression compairOp expression         #compairExpression
    |   expression logicalOp expression         #logicalExpression
    |   expression DOT DOT expression           #rangeExpression
    ;
returnStatement: RETURN expression;

// variable declaration helpers
mutability: VAR | VAL;
variableName: ID;
declarationType: COLON type;
type: primitiveType | collectionType | rangeType;
assignment
    :   ASSIGN
    |   PLUS ASSIGN
    |   MINUS ASSIGN
    |   MUL ASSIGN
    |   DIV ASSIGN
    ;

// primary expression subrules
primary
    :   parenthesizedExpression
    |   unaryExpression
    |   functionCall
    |   literalExpression
    |   primary LBRACKET expression RBRACKET
    ;

// expression helpers
addSubOp: PLUS | MINUS;
mulDivOp: MUL | DIV | REMINDER;
compairOp: GTE | LTE | GT | LT | EQ | NEQ | IN;
logicalOp: AND | OR;

// ---------------------------------------------------------------------------------------------------------------------
// Types
// ---------------------------------------------------------------------------------------------------------------------
rangeType
    : RANGE_T LBRACKET valueType RBRACKET
    ;
collectionType
    :   listType
    |   dictType
    ;
primitiveType
    :   INT_T
    |   DEC_T
    |   STR_T
    |   BOOL_T
    |   ANY_T
    |   NONE_LIT
    ;

// CollectionType helpers
listType: LIST_T LBRACKET valueType RBRACKET;
dictType: DICT_T LBRACKET keyType COMMA valueType RBRACKET;
keyType: type;
valueType: type;

// ---------------------------------------------------------------------------------------------------------------------
// Primary expressions
// ---------------------------------------------------------------------------------------------------------------------
parenthesizedExpression: LPAREN expression RPARAEN;
unaryExpression: unaryOperator expression;
functionCall
    :   functionName LPAREN (expression (COMMA expression)*)? RPARAEN;
literalExpression
    :   stringLiteral
    |   numberLiteral
    |   collectionLiteral
    |   noneLiteral
    |   variableReference
    |   boolLiteral
    ;

// unary helpers
unaryOperator: NEG | MINUS | PLUS;

// ---------------------------------------------------------------------------------------------------------------------
// Literal expressions
// ---------------------------------------------------------------------------------------------------------------------
stringLiteral: STR_LIT;
numberLiteral: DEC_LIT | INT_LIT;
collectionLiteral: listLiteral | dictLiteral;
noneLiteral: NONE_LIT;
variableReference: variableName;
boolLiteral: TRUE_LIT | FALSE_LIT;

// ---------------------------------------------------------------------------------------------------------------------
// Collection literals
// ---------------------------------------------------------------------------------------------------------------------
listLiteral: LBRACKET NEWLINE* (expression (NEWLINE* COMMA NEWLINE* expression)*)? NEWLINE* RBRACKET;
dictLiteral: LCURLY NEWLINE* (dictElement (NEWLINE* COMMA NEWLINE* dictElement)*)? NEWLINE* RCURLY;

// dict literal helpers
dictElement: key COLON value;
key: expression;
value: expression;

// ---------------------------------------------------------------------------------------------------------------------
// Compound statements
// ---------------------------------------------------------------------------------------------------------------------
ifStatement
    : IF expression COLON block elseBlock? END
    | IF expression COLON block elifBlock+ elseBlock END
    ;

whileStatement
    : WHILE expression COLON block elseBlock? END
    ;

forStatement
    : forHeader block elseBlock? END
    ;

functionDefinition
    :   FUN functionName LPAREN functionParameters RPARAEN functionReturnType? COLON
        block
        END
    ;


// function definition helpers
functionName: ID;
functionParameters
    :   (functionParameter (COMMA functionParameter)*)?
    ;
functionParameter
    :   variableName COLON type
    ;
functionReturnType: ARROW type;

forHeader: FOR variableName (COLON type)? IN expression COLON;
elifBlock: ELIF expression COLON block;
elseBlock: ELSE COLON block;


LPAREN: '(';
RPARAEN: ')';
LBRACKET: '[';
RBRACKET: ']';
LCURLY: '{';
RCURLY: '}';
COLON: ':';
COMMA: ',';
DOT: '.';

EQ: '==';
NEQ: '!=';
NEG: 'not';
LT: '<';
GT: '>';
LTE: '<=';
GTE: '>=';
IN: 'in';

ASSIGN: '=';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
REMINDER: '%';

ARROW: '->';

AND: 'and';
OR: 'or';

FUN: 'fun';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
END: 'end';

VAR: 'var';
VAL: 'val';

RETURN: 'return';
BREAK: 'break';
CONTINUE: 'continue';

INT_T: 'int';
DEC_T: 'dec';
STR_T: 'str';
BOOL_T: 'bool';
ANY_T: 'any';

NONE_LIT: 'none';
INT_LIT: [0-9][0-9]*;
DEC_LIT: INT_LIT '.' INT_LIT;
STR_LIT: '"' (~[\r\n"])* '"';
TRUE_LIT: 'true';
FALSE_LIT: 'false';
MAYBE_LIT: 'maybe';

LIST_T: 'list';
DICT_T: 'dict';
RANGE_T: 'range';

NEWLINE: '\r'? '\n' | '\r';
WS: [ \t]+ -> skip;
ID: [a-zA-Z_][a-zA-Z0-9_]*;
LINE_COMMENT: '#' ~[\r\n]* -> skip;

