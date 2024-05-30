package com.krisztianszenasi.beetroot.ast.nodes.common.type.type_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.common.type.TypeNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.declaration_type.BSDeclarationTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

public class DummyType extends TypeNode {
    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return null;
    }

    @Override
    public BSType accept(BSDeclarationTypeBuilder typeBuilder) {
        return null;
    }
}
