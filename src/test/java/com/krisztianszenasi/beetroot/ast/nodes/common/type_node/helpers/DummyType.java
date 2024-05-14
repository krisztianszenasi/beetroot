package com.krisztianszenasi.beetroot.ast.nodes.common.type_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.common.TypeNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class DummyType extends TypeNode {
    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return null;
    }
}
