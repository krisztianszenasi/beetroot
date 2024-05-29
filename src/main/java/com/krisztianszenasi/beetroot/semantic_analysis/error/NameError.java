package com.krisztianszenasi.beetroot.semantic_analysis.error;

public class NameError extends BaseError {

    private final String message;

    public NameError(Integer line, Integer column, String message) {
        super(line, column);
        this.message = message;
    }

    @Override
    public String buildMessage() {
        return message;
    }

    public static NameError buildNameAlreadyExistsError(String name, String objectKind, int line, int column) {
        String message = String.format(
                "%s '%s' already exists",
                objectKind,
                name
        );
        return new NameError(line, column, message);
    }

    public static NameError buildNameNotDefinedError(String name, int line, int column) {
        String message = String.format(
                "Name '%s' is not defined",
                name
        );
        return new NameError(line, column, message);
    }

    public static NameError buildNameNotInitialized(String name, int line, int column) {
        String message = String.format(
                "Variable '%s' is not initialized",
                name
        );
        return new NameError(line, column, message);
    }
}
