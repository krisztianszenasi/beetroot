package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal;

public class NoneLiteralNode extends LiteralExpressionNode{

    @Override
    public boolean equals(Object obj) {
        return getClass() == obj.getClass();
    }
}
