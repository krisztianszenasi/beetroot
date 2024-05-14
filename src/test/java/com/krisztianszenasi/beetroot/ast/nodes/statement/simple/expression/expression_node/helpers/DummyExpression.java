package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class DummyExpression extends ExpressionNode {
    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return null;
    }
}
