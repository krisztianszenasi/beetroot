package com.krisztianszenasi.beetroot.ast.nodes.common.type_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.common.TypeNode;

public class TypeAlwaysEquals extends TypeNode {
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
