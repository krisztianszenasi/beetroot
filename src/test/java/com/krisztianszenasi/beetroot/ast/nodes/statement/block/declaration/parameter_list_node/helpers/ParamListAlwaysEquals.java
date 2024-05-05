package com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.parameter_list_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.ParameterListNode;

public class ParamListAlwaysEquals extends ParameterListNode {

    @Override
    public boolean equals(Object o) {
        return true;
    }
}
