package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.Scope;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.expression_type.BSExpressionTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

import java.util.Objects;

public class DictElementNode extends CollectionLiteralNode {
    ExpressionNode key;
    ExpressionNode value;

    public DictElementNode(ExpressionNode key, ExpressionNode value) {
        this.key = key;
        this.value = value;
    }

    public ExpressionNode getKey() {
        return key;
    }

    public ExpressionNode getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictElementNode that = (DictElementNode) o;
        return Objects.equals(key, that.key) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitDictElementNode(this);
    }

    @Override
    public BSType accept(BSExpressionTypeBuilder builder, Scope scope) {
        return builder.getTypeForDictElementNode(this, scope);
    }
}
