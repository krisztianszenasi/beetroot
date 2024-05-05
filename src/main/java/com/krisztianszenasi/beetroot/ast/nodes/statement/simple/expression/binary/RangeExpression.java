package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.binary;

import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class RangeExpression extends BinaryExpression{
    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitRangeExpression(this);
    }
}
