package com.krisztianszenasi.beetroot.semantic_analysis.type;

import com.krisztianszenasi.beetroot.ast.nodes.common.CompoundTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.PrimitiveTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.TypeNode;

public class BSDeclarationTypeBuilder {

    public BSType getTypeFor(TypeNode type, TypeSystem typeSystem) {
        return type.accept(this, typeSystem);
    }

    public BSSimpleType getTypeForPrimitiveTypeNode(PrimitiveTypeNode node, TypeSystem typeSystem) {
        return typeSystem.getType(node.getType());
    }

    public BSCompoundType getTypeForCompoundTypeNode(CompoundTypeNode node, TypeSystem typeSystem) {
        return new BSCompoundType(
                getTypeFor(node.getType(), typeSystem),
                getTypeFor(node.getInnerType(), typeSystem)
        );
    }
}
