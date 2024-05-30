package com.krisztianszenasi.beetroot.ast.nodes;

import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

abstract public class Node {
    Integer line = null;
    Integer column = null;


    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitNode(this);
    }

    public void setPosition(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public Integer getLine() {
        return line;
    }

    public Integer getColumn() {
        return column;
    }
}
