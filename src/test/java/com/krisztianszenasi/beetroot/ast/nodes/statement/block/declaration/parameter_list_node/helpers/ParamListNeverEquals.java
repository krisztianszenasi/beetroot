package com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.parameter_list_node.helpers;

public class ParamListNeverEquals extends ParamListAlwaysEquals {

    @Override
    public boolean equals(Object o) {
        return false;
    }
}
