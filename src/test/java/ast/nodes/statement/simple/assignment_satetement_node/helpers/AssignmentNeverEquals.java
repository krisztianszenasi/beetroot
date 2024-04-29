package ast.nodes.statement.simple.assignment_satetement_node.helpers;

import ast.nodes.statement.simple.expression.expression_node.helpers.DummyExpression;
import ast.nodes.statement.simple.expression.primary.primary_node.helpers.DummyPrimary;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.PrimaryExpressionNode;

public class AssignmentNeverEquals extends DummyAssignment {
    public AssignmentNeverEquals(PrimaryExpressionNode primary, ExpressionNode expression) {
        super(primary, expression);
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    public static AssignmentNeverEquals getInstance() {
        return new AssignmentNeverEquals(new DummyPrimary(), new DummyExpression());
    }
}
