package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.binary.mul_div_rem;


import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.binary.BinaryExpression;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class DivideExpression extends BinaryExpression {
    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitDivideExpression(this);
    }
}
