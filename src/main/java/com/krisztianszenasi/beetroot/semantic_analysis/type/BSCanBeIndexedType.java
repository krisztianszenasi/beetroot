package com.krisztianszenasi.beetroot.semantic_analysis.type;

import com.krisztianszenasi.beetroot.semantic_analysis.error.TypeError;

public class BSCanBeIndexedType extends BSWrapperType{

    BSType indexType;

    public BSCanBeIndexedType(String name, BSType parent, BSType indexType, BSType inner) {
        super(name, parent, inner);
        this.indexType = indexType;
    }

    public BSCanBeIndexedType(String name, BSType parent, BSType indexType) {
        super(name, parent, null);
        this.indexType = indexType;
        this.inner = this;
    }

    @Override
    public TypeBuildResult buildFromSimpleType(BSNamedType type) {
        TypeBuildResult buildResult = new TypeBuildResult();
        if(validateInnerType(type, buildResult)) {
            buildResult.setType(new BSCanBeIndexedType(name, parent, indexType, type));
        }
        return buildResult;
    }

    @Override
    public TypeBuildResult buildFromCompoundType(BSCompoundType type) {
        TypeBuildResult buildResult = new TypeBuildResult();
        if(validateKeyAndIndex(type, buildResult)) {
            buildResult.setType(new BSCanBeIndexedType(name, parent, type.getLeft(), type.getRight()));
        }
        return buildResult;
    }

    private boolean validateKeyAndIndex(BSCompoundType type, TypeBuildResult buildResult) {
        boolean indexValid = validateIndexType(type.getLeft(), buildResult);
        boolean innerValid = validateInnerType(type.getRight(), buildResult);
        return indexValid && innerValid;
    }

    private boolean validateIndexType(BSType type, TypeBuildResult buildResult) {
        if(!type.isCompatibleWith(indexType)) {
            buildResult.addError(TypeError.buildIndexedWithWrongTypeError(
                    name,
                    indexType.toString(),
                    type.toString(),
                    -1,
                    -1
            ));
            return false;
        }
        return true;
    }

    private boolean validateInnerType(BSType type, TypeBuildResult buildResult) {
        if(!type.isCompatibleWith(inner)) {
            buildResult.addError(TypeError.buildIncompatibleElementTypeError(
                    name,
                    inner.toString(),
                    type.toString(),
                    -1,
                    -1
            ));
            return false;
        }
        return true;
    }

    public BSType getIndexType() {
        return indexType;
    }
}
