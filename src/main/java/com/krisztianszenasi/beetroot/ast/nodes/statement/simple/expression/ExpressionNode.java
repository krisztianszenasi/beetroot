package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression;


import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.SimpleStatementNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.Scope;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.expression_type.BSExpressionTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

abstract public class ExpressionNode extends SimpleStatementNode {
    abstract public BSType accept(BSExpressionTypeBuilder builder, Scope scope);

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitExpressionNode(this);
    }
}
