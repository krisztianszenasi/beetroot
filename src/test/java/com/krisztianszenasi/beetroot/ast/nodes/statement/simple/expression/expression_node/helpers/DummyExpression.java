package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.Scope;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.expression_type.BSExpressionTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

public class DummyExpression extends ExpressionNode {
    @Override
    public BSType accept(BSExpressionTypeBuilder builder, Scope scope) {
        return null;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return null;
    }
}
