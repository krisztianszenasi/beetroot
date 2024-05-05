package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.binary.logical;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.binary.BinaryExpression;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class OrExpression extends BinaryExpression {
    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitOrExpression(this);
    }
}
