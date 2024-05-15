package com.krisztianszenasi.beetroot.ast.nodes.common.type_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.common.TypeNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSDeclarationTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSTypeSystem;
import com.krisztianszenasi.beetroot.semantic_analysis.type.TypeSystem;

public class TypeNeverEquals extends TypeNode {
    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return null;
    }

    @Override
    public BSType accept(BSDeclarationTypeBuilder typeBuilder, TypeSystem typeSystem) {
        return null;
    }
}
