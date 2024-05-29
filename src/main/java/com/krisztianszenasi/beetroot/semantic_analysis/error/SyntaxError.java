package com.krisztianszenasi.beetroot.semantic_analysis.error;

public class SyntaxError extends BaseError {

    private final String message;

    public SyntaxError(Integer line, Integer column, String message) {
        super(line, column);
        this.message = message;
    }

    @Override
    public String buildMessage() {
        return message;
    }

    public static SyntaxError buildUnMutableWithOutInitialValue(String name, int line, int column) {
        String message = String.format(
                "Variable '%s' declared immutable (val) must be initialized",
                name
        );
        return new SyntaxError(line, column, message);
    }
}
