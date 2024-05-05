package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.binary.add_sub;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.binary.BinaryExpression;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class SubtractionExpression extends BinaryExpression {
    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitSubtractionExpression(this);
    }
}
