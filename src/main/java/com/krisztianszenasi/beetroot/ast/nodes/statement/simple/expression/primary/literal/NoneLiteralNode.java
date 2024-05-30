package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal;

import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.Scope;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.expression_type.BSExpressionTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

public class NoneLiteralNode extends LiteralExpressionNode{

    @Override
    public boolean equals(Object obj) {
        return getClass() == obj.getClass();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitNoneLiteralNode(this);
    }

    @Override
    public BSType accept(BSExpressionTypeBuilder builder, Scope scope) {
        return builder.getTypeForNoneLiteralNode(this, scope);
    }
}
