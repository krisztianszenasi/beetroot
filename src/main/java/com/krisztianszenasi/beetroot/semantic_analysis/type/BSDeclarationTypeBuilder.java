package com.krisztianszenasi.beetroot.semantic_analysis.type;

import com.krisztianszenasi.beetroot.ast.nodes.common.CompoundTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.PrimitiveTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.TypeNode;

public class BSDeclarationTypeBuilder {

    public BSType getTypeFor(TypeNode type, BSTypeSystem typeSystem) {
        return type.accept(this, typeSystem);
    }

    public BSSimpleType getTypeForPrimitiveTypeNode(PrimitiveTypeNode node, BSTypeSystem typeSystem) {
        return typeSystem.getType(node.getType());
    }

    public BSCompoundType getTypeForCompoundTypeNode(CompoundTypeNode node, BSTypeSystem typeSystem) {
        return new BSCompoundType(
                getTypeFor(node.getType(), typeSystem),
                getTypeFor(node.getInnerType(), typeSystem)
        );
    }
}
