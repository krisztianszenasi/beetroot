package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.assignment_satetement_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.DummyExpression;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.PrimaryExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.primary_node.helpers.DummyPrimary;

public class AssignmentNeverEquals extends DummyAssignment {


    public AssignmentNeverEquals(PrimaryExpressionNode primary, String operator, ExpressionNode expression) {
        super(primary, operator, expression);
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    public static AssignmentNeverEquals getInstance() {
        return new AssignmentNeverEquals(new DummyPrimary(), "=", new DummyExpression());
    }
}
