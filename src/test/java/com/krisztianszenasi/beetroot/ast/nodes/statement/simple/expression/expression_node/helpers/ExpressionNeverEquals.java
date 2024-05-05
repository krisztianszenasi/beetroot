package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers;

public class ExpressionNeverEquals extends DummyExpression {
    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
