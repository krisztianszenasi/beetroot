package com.krisztianszenasi.beetroot.ast.nodes.common.type_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.common.TypeNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class TypeAlwaysEquals extends TypeNode {
    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return null;
    }
}
