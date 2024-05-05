package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal;

import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class NoneLiteralNode extends LiteralExpressionNode{

    @Override
    public boolean equals(Object obj) {
        return getClass() == obj.getClass();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitNoneLiteralNode(this);
    }
}
