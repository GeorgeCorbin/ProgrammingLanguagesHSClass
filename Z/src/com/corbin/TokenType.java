package com.corbin;

public enum TokenType {

    IDENTIFIER, INT, FLOAT, STRING,

    // Keywords
    KW_INT, KW_FLOAT, KW_STRING, TRUE, FALSE, FUNC, VOID, VAR, CONST, FOR, IN, WHILE, IF,
    ELSE, SWITCH, CASE, DEFAULT, INPUT, OUTPUT, RETURN,

    // Operators
    NOT, PLUS, MINUS, TIMES, DIVIDE, EXP, MOD, INCREMENT, DECREMENT, GREATER, GREATEREQUAL,
    EQUAL, NOTEQUAL, LESS, LESSEQUAL, RETURNS, ASSIGN, PLUSASSIGN, MINUSASSIGN, TIMESASSIGN,
    DIVIDEASSIGN, MODASSIGN, EXPASSIGN, AND, OR, ELLIPSIS,

    // Punctuation
    OPENPAREN, CLOSEPAREN, OPENBRACE, CLOSEBRACE, COMMA, COLON, SEMICOLON,
    OPENBRACKET, CLOSEBRACKET,

    // Comments
    LINECOMMENT,

    // Non-terminals
    PROGRAM, STATEMENT, STATEMENT_LIST, EXPRESSION, EXPRESSION_LIST,
    OR_TERM, EQUALITY_TERM, RELATIONAL_TERM, POWER_TERM, TERM, FACTOR, UNARY_TERM, SIMPLE_TERM,
    VARIABLE, ARRAY_REFERENCE, DATA_TYPE, ARRAY_TYPE,
    LITERAL, BOOLEAN_LITERAL, INCREMENT_EXPRESSION, PREFIX_UNARY_OPERATORS, INCREMENT_OPERATORS,
    BINARY, BINARY_OPERATOR, COMPARATOR, MATHEMATICAL_OPERATOR,
    FUNCTION_DEFINITION, FUNCTION_PARAMETER_LIST, FUNCTION_PARAMETER, FUNCTION_CALL,
    ARGUMENT_LIST, GROUPING, INITIALIZATION, VARIABLE_INITIALIZER, CONSTANT_INITIALIZER,
    INITIALIZER_EXPRESSION, ARRAY_INITIALIZER, ASSIGNMENT, ASSIGNMENT_OPERATOR,
    LOOP, FOR_LOOP, LOOP_INCREMENT, BOOLEAN_EXPRESSION, UNARY_BOOLEAN, SIMPLE_BOOLEAN,
    BINARY_BOOLEAN, CONJUNCTION, FOR_IN, ITERABLE, RANGE,
    WHILE_LOOP, CONDITIONAL, IF_ELSE_STATEMENTS, IF_STATEMENT, ELSE_STATEMENT, ELSE_IF_STATEMENT,
    SWITCH_CASE_STATEMENTS, SWITCH_STATEMENT, CASE_STATEMENT, 
    INPUT_STATEMENT, OUTPUT_STATEMENT, FUNCTION_BODY,
    
    // Helper
    GLUE,

    // End of file
    EOF
}
