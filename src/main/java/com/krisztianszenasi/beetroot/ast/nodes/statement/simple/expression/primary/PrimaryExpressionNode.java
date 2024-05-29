package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

abstract public class PrimaryExpressionNode extends ExpressionNode {

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitPrimaryExpressionNode(this);
    }
}
