package ast.nodes.statement.simple.expression.primary.primary_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.PrimaryExpressionNode;

public class PrimaryNeverEquals extends DummyPrimary {
    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
