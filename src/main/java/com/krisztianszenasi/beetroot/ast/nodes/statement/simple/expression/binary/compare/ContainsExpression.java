package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.binary.compare;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.binary.BinaryExpression;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class ContainsExpression extends BinaryExpression {
    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitContainsExpression(this);
    }
}
