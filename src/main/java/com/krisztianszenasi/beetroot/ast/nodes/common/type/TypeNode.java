package com.krisztianszenasi.beetroot.ast.nodes.common.type;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.declaration_type.BSDeclarationTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

abstract public class TypeNode extends Node {
    public abstract BSType accept(BSDeclarationTypeBuilder typeBuilder);

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitTypeNode(this);
    }
}
