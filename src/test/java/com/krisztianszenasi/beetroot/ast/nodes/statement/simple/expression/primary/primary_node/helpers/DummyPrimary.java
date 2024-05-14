package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.primary_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.PrimaryExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class DummyPrimary extends PrimaryExpressionNode {
    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return null;
    }
}
