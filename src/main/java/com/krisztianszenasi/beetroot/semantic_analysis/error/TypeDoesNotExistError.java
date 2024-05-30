package com.krisztianszenasi.beetroot.semantic_analysis.error;

public class TypeDoesNotExistError extends BaseError {

    private final String typeName;

    public TypeDoesNotExistError(Integer line, Integer column, String typeName) {
        super(line, column);
        this.typeName = typeName;
    }

    @Override
    public String buildMessage() {
        return String.format("Type '%s' does not exist.", typeName);
    }
}
