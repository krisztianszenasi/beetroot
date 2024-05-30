package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary;


import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.Scope;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.expression_type.BSExpressionTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

import java.util.Objects;

public class IndexedExpressionNode extends PrimaryExpressionNode{
    private final PrimaryExpressionNode indexed;
    private final ExpressionNode indexPosition;

    public IndexedExpressionNode(PrimaryExpressionNode indexed, ExpressionNode indexPosition) {
        this.indexed = indexed;
        this.indexPosition = indexPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IndexedExpressionNode that = (IndexedExpressionNode) o;
        return Objects.equals(indexed, that.indexed) && Objects.equals(indexPosition, that.indexPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexed, indexPosition);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitIndexedExpressionNode(this);
    }

    public PrimaryExpressionNode getIndexed() {
        return indexed;
    }
    public ExpressionNode getIndexPosition() { return indexPosition; }


    @Override
    public BSType accept(BSExpressionTypeBuilder builder, Scope scope) {
        return builder.getTypeForIndexedExpressionNode(this, scope);
    }
}
