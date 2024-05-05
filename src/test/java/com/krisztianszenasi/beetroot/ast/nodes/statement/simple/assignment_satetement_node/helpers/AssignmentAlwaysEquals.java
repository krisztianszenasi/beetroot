package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.assignment_satetement_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.AssignmentStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.DummyExpression;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.PrimaryExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.primary_node.helpers.DummyPrimary;

public class AssignmentAlwaysEquals extends AssignmentStatementNode {
    public AssignmentAlwaysEquals(PrimaryExpressionNode primary, ExpressionNode expression) {
        super(primary, expression);
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    public static AssignmentAlwaysEquals getInstance() {
        return new AssignmentAlwaysEquals(new DummyPrimary(), new DummyExpression());
    }
}
