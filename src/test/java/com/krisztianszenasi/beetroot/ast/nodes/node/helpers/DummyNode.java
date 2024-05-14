package com.krisztianszenasi.beetroot.ast.nodes.node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class DummyNode extends Node {
    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return null;
    }
}
