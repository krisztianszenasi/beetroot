package ast.nodes.statement.simple.expression.expression_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;

public class ExpressionAlwaysEquals extends DummyExpression {
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
