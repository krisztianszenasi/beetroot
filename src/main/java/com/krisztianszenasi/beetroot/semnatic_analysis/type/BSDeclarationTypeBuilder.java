package com.krisztianszenasi.beetroot.semnatic_analysis.type;

import com.krisztianszenasi.beetroot.ast.nodes.common.DictTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.ListTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.PrimitiveTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.TypeNode;

public class BSDeclarationTypeBuilder {

    public BSType getTypeFor(TypeNode type, BSTypeSystem typeSystem) {
        return type.accept(this, typeSystem);
    }

    public BSSimpleType getTypeForPrimitiveTypeNode(PrimitiveTypeNode node, BSTypeSystem typeSystem) {
        BSSimpleType typeFound;
        switch(node.getPrimitiveType()) {
            case DEC ->  typeFound = typeSystem.DEC;
            case INT -> typeFound = typeSystem.INT;
            case STR -> typeFound = typeSystem.STR;
            case BOOL -> typeFound = typeSystem.BOOL;
            case NONE -> typeFound = typeSystem.NONE;
            default -> typeFound = typeSystem.ANY;
        }
        return typeFound;
    }

    public BSCompoundType getTypeForListTypeNode(ListTypeNode node, BSTypeSystem typeSystem) {
        return new BSCompoundType(
                typeSystem.LIST,
                getTypeFor(node.getElementType(), typeSystem)
        );
    }

    public BSCompoundType getTypeForDictTypeNode(DictTypeNode node, BSTypeSystem typeSystem) {
        return new BSCompoundType(
                typeSystem.DICT,
                new BSCompoundType(
                        getTypeFor(node.getKeyType(), typeSystem),
                        getTypeFor(node.getValueType(), typeSystem)
                )
        );
    }
}
