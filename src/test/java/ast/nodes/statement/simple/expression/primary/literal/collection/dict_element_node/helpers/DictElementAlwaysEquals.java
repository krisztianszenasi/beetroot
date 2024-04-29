package ast.nodes.statement.simple.expression.primary.literal.collection.dict_element_node.helpers;

import ast.nodes.statement.simple.expression.expression_node.helpers.DummyExpression;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.DictElementNode;

public class DictElementAlwaysEquals extends DictElementNode {
    public DictElementAlwaysEquals(ExpressionNode key, ExpressionNode value) {
        super(key, value);
    }

    public static DictElementAlwaysEquals getInstance() {
        return new DictElementAlwaysEquals(new DummyExpression(), new DummyExpression());
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }
}
