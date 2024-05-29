package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection;


import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.PrimaryExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.ArrayList;
import java.util.List;

abstract public class CollectionLiteralNode extends PrimaryExpressionNode {
    List<ExpressionNode> elements = new ArrayList<>();

    public List<ExpressionNode> getElements() {
        return elements;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitCollectionLiteralNode(this);
    }
}
