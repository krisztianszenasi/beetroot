package com.krisztianszenasi.beetroot.semantic_analysis.validators;

import com.krisztianszenasi.beetroot.ast.nodes.common.enums.Mutability;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.VariableDeclarationNode;
import com.krisztianszenasi.beetroot.semantic_analysis.Scope;
import com.krisztianszenasi.beetroot.semantic_analysis.error.ErrorHandler;
import com.krisztianszenasi.beetroot.semantic_analysis.error.SyntaxError;
import com.krisztianszenasi.beetroot.semantic_analysis.error.TypeError;
import com.krisztianszenasi.beetroot.semantic_analysis.symbol.VariableSymbol;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

import java.util.Objects;

public class VarDecValidator {

    private VariableDeclarationNode node;
    private BSType typeDetermined = null;

    public VarDecValidator(VariableDeclarationNode node) {
        this.node = node;
    }

    public boolean variableNotYetDefined(Scope scope) {
        return scope.findVariable(node.getVariableName()) == null;
    }

    public void validateMutability(ErrorHandler errorHandler) {
        if(unMutableWithoutInitialValue(node)) {
            addUnMutableWithoutInitialValueError(node, errorHandler);
        }
    }

    public void validateTypeDeclarationAndInitialValue(
            BSType explicitType,
            BSType initialValueType,
            ErrorHandler errorHandler
    ) {
        typeDetermined = explicitType;
        if(missingTypeDeclarationAndInitialValue()) {
            addTypeCannotBeDeterminedError(errorHandler);
        } else if(hasExplicitTypeAndInitialValue() && !initialValueType.isCompatibleWith(explicitType)) {
            addWrongInitialValueTypeError(explicitType, initialValueType, errorHandler);
        } else {
            typeDetermined = initialValueType;
        }
    }

    public VariableSymbol buildVarSymbol(BSType errorType) {
        return new VariableSymbol(
                node.getVariableName(),
                Objects.requireNonNullElse(typeDetermined, errorType),
                node.getMutability() == Mutability.MUTABLE,
                node.getInitialValue() != null
        );
    }
    private boolean unMutableWithoutInitialValue(VariableDeclarationNode node) {
        return node.getMutability() == Mutability.UN_MUTABLE && node.getInitialValue() == null;
    }
    private void addUnMutableWithoutInitialValueError(VariableDeclarationNode node, ErrorHandler errorHandler) {
        errorHandler.add(SyntaxError.buildUnMutableWithOutInitialValue(
                node.getVariableName(), node.getLine(), node.getColumn())
        );
    }

    private boolean missingTypeDeclarationAndInitialValue() {
        return node.getDeclarationType() == null && node.getInitialValue() == null;
    }

    private void addTypeCannotBeDeterminedError(ErrorHandler errorHandler) {
        errorHandler.add(TypeError.buildMissingTypeAndInitialValue(
                node.getVariableName(),
                node.getLine(),
                node.getColumn()
        ));
    }

    private boolean hasExplicitTypeAndInitialValue() {
        return node.getDeclarationType() != null && node.getInitialValue() != null;
    }

    private void addWrongInitialValueTypeError(BSType explicitType, BSType initialValueType, ErrorHandler errorHandler) {
        errorHandler.add(TypeError.buildTypeAreIncompatibleError(
                explicitType.toString(),
                initialValueType.toString(),
                node.getLine(),
                node.getColumn()
        ));
    }
}
