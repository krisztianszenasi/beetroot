package com.krisztianszenasi.beetroot.semantic_analysis.builders.declaration_type;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.CompoundTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.SimpleTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.TypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.WrapperTypeNode;
import com.krisztianszenasi.beetroot.semantic_analysis.error.ErrorHandler;
import com.krisztianszenasi.beetroot.semantic_analysis.error.BaseError;
import com.krisztianszenasi.beetroot.semantic_analysis.error.TypeDoesNotExistError;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSCompoundType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.TypeBuildResult;
import com.krisztianszenasi.beetroot.semantic_analysis.type_system.TypeSystem;

import java.util.List;
import java.util.Objects;

public class BSDeclarationTypeBuilder {

    protected final TypeSystem typeSystem;
    protected final ErrorHandler errorHandler;

    public BSDeclarationTypeBuilder(TypeSystem typeSystem, ErrorHandler errorHandler) {
        this.typeSystem = typeSystem;
        this.errorHandler = errorHandler;
    }

    public BSType getTypeFor(TypeNode type) {
        return type != null ? type.accept(this) : null;
    }

    public BSType getTypeForSimpleTypeNode(SimpleTypeNode node) {
        BSType typeFound = typeSystem.getType(node.getType());
        if(typeFound == null) {
            errorHandler.add(new TypeDoesNotExistError(node.getLine(), node.getColumn(), node.getType()));
            return typeSystem.getErrorType();
        }
        return typeFound;
    }

    public BSType getTypeForWrapperTypeNode(WrapperTypeNode node) {
        BSType outerType = getTypeForSimpleTypeNode(node);
        BSType innerType = getTypeFor(node.getInner());

        TypeBuildResult buildResult = outerType.buildFrom(innerType);
        processErrors(buildResult.getErrors(), node);
        typeSystem.register(buildResult.getType());

        return Objects.requireNonNullElse(
                buildResult.getType(),
                typeSystem.getErrorType()
        );
    }

    public BSType getTypeForCompoundTypeNode(CompoundTypeNode node) {
        return new BSCompoundType(
                getTypeFor(node.getLeft()),
                getTypeFor(node.getRight())
        );
    }

    private void processErrors(List<BaseError> errors, Node node) {
        for(BaseError error : errors) {
            error.setLine(node.getLine());
            error.setColumn(node.getColumn());
            errorHandler.add(error);
        }
    }
}
