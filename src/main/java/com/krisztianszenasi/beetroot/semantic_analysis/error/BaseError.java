package com.krisztianszenasi.beetroot.semantic_analysis.error;

public abstract class BaseError {

    protected Integer line;
    protected Integer column;

    public BaseError(Integer line, Integer column) {
        this.line = line;
        this.column = column;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return String.format(
                "%s: %s.\nline: %d, column: %d\n",
                getErrorName(),
                buildMessage(),
                line,
                column
        );
    }

    public String getErrorName() {
        return getClass().getSimpleName();
    }

    public abstract String buildMessage();
}
