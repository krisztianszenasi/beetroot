package com.krisztianszenasi.beetroot.semantic_analysis.error;

public class TypeError extends BaseError {

    private final String message;

    public TypeError(Integer line, Integer column, String message) {
        super(line, column);
        this.message = message;
    }

    @Override
    public String buildMessage() {
        return message;
    }

    static public TypeError buildFunctionArgumentCountError(
            String funcName,
            int expectedArgCount,
            int actualArgCount,
            int line,
            int column
    ) {
        String msg = expectedArgCount < actualArgCount ?
                buildTooManyFuncArgsMessage(funcName, expectedArgCount, actualArgCount) :
                buildNotEnoughFuncArgsMessage(funcName, expectedArgCount, actualArgCount);
        return new TypeError(line, column, msg);
    }

    static public TypeError buildUnxepectedArguentTypeError(
            String funcName,
            int argIndex,
            String actualType,
            String expectedType,
            int line,
            int column
    ) {
        String message = String.format(
                "Function '%s' received argument with type '%s' at position %d but it should be of type '%s'",
                funcName,
                actualType,
                argIndex,
                expectedType
        );
        return new TypeError(line, column, message);
    }

    static public TypeError buildBinaryOperatorDoesNotExistError(
        String operator,
        String leftType,
        String rightType,
        int line,
        int column
    ) {
        String msg = String.format(
                "Binary operator '%s' does not exist for types '%s' and '%s'",
                operator,
                leftType,
                rightType
        );
        return new TypeError(line, column, msg);
    }

    static public TypeError buildUnaryOperatorDoesNotExistError(
            String operator,
            String expressionType,
            int line,
            int column
    ) {
        String msg = String.format(
                "Unary operator '%s' does not exist for type '%s'",
                operator,
                expressionType
        );
        return new TypeError(line, column, msg);
    }

    static public TypeError buildIndexedWithWrongTypeError(
            String collectionType,
            String expectedIndexType,
            String actualIndexType,
            int line,
            int column
    ) {
        String msg = String.format(
                "%s indexes must be of type '%s', not %s",
                collectionType,
                expectedIndexType,
                actualIndexType
        );
        return new TypeError(line, column, msg);
    }

    static public TypeError buildIncompatibleElementTypeError(
            String collectionType,
            String expectedElementType,
            String actualElementType,
            int line,
            int column
    ) {
        String msg = String.format(
                "%s elements must be of type '%s', not %s",
                collectionType,
                expectedElementType,
                actualElementType
        );
        return new TypeError(line, column, msg);
    }

    private static String buildTooManyFuncArgsMessage(String funcName, int expectedArgCount, int actualArgCount) {
        return String.format(
                "Function '%s' takes %d positional arguments but %d were given",
                funcName,
                expectedArgCount,
                actualArgCount
        );
    }

    private static String buildNotEnoughFuncArgsMessage(String funcName, int expectedArgCount, int actualArgCount) {
        return String.format(
                "Function '%s' missing %d required positional arguments.",
                funcName,
                expectedArgCount-actualArgCount
        );
    }

    public static TypeError buildMissingTypeAndInitialValue(String name, int line, int column) {
        String message = String.format(
                "Type for variable '%s' cannot be determined.\nConsider setting the type explicitly or initializing it",
                name
        );
        return new TypeError(line, column, message);
    }

    public static TypeError buildTypeAreIncompatibleError(
            String expectedType,
            String actualType,
            int line,
            int column
    ) {
        String message = String.format(
                "Expected '%s' but got '%s'",
                expectedType,
                actualType
        );
        return new TypeError(line, column, message);
    }

    public static TypeError buildIncompatibleReturnTypeError(
            String funcName,
            String expectedType,
            String actualType,
            int line,
            int column
    ) {
        String message = String.format(
                "Function '%s' is declared with return type '%s' but got '%s",
                funcName,
                expectedType,
                actualType
        );
        return new TypeError(line, column, message);
    }
}
