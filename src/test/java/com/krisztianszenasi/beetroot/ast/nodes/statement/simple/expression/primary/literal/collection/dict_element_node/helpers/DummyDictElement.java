package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.dict_element_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.DummyExpression;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.DictElementNode;

public class DummyDictElement  {

    public static DictElementNode getInstance() {
        return new DictElementNode(new DummyExpression(), new DummyExpression());
    }
}
