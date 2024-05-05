package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.binary.add_sub;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.binary.BinaryExpression;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class AdditionExpression extends BinaryExpression {
    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitAdditionExpression(this);
    }
}
