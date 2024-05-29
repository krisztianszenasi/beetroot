package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.number;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.PrimaryExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

abstract public class NumberLiteralNode extends PrimaryExpressionNode {

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitNumberLiteralNode(this);
    }
}
