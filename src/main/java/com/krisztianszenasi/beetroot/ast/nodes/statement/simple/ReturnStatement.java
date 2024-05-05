package com.krisztianszenasi.beetroot.ast.nodes.statement.simple;


import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.Objects;

public class ReturnStatement extends SimpleStatementNode{
    ExpressionNode expressionNode;

    public ReturnStatement(ExpressionNode expressionNode) {
        this.expressionNode = expressionNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReturnStatement that = (ReturnStatement) o;
        return Objects.equals(expressionNode, that.expressionNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expressionNode);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitReturnStatement(this);
    }
}
