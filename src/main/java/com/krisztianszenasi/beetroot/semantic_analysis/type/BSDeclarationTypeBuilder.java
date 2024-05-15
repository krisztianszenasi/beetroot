package com.krisztianszenasi.beetroot.semantic_analysis.type;

import com.krisztianszenasi.beetroot.ast.nodes.common.DictTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.ListTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.PrimitiveTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.TypeNode;

public class BSDeclarationTypeBuilder {

    public BSType getTypeFor(TypeNode type, BSTypeSystem typeSystem) {
        return type.accept(this, typeSystem);
    }

    public BSSimpleType getTypeForPrimitiveTypeNode(PrimitiveTypeNode node, BSTypeSystem typeSystem) {
        return typeSystem.getType(node.getType());
    }

    public BSCompoundType getTypeForListTypeNode(ListTypeNode node, BSTypeSystem typeSystem) {
        return new BSCompoundType(
                typeSystem.getType("list"),
                getTypeFor(node.getElementType(), typeSystem)
        );
    }

    public BSCompoundType getTypeForDictTypeNode(DictTypeNode node, BSTypeSystem typeSystem) {
        return new BSCompoundType(
                typeSystem.getType("dict"),
                new BSCompoundType(
                        getTypeFor(node.getKeyType(), typeSystem),
                        getTypeFor(node.getValueType(), typeSystem)
                )
        );
    }
}
