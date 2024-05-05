package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.dict_element_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.DummyExpression;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.DictElementNode;

public class DictElementNeverEquals extends DictElementNode {

    public DictElementNeverEquals(ExpressionNode key, ExpressionNode value) {
        super(key, value);
    }

    public static DictElementNeverEquals getInstance() {
        return new DictElementNeverEquals(new DummyExpression(), new DummyExpression());
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }
}
