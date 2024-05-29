package com.krisztianszenasi.beetroot.semantic_analysis.validators;

import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.ForStatementNode;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.declaration_type.BSDeclarationTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.error.ErrorHandler;
import com.krisztianszenasi.beetroot.semantic_analysis.error.TypeError;
import com.krisztianszenasi.beetroot.semantic_analysis.symbol.VariableSymbol;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSCanBeIndexedType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

import java.util.Objects;

public class ForStatementValidator {
    private ForStatementNode node;
    private BSType typeDetermined = null;

    public ForStatementValidator(ForStatementNode node) {
        this.node = node;
    }
    public boolean expressionCanBeIndexed(BSType expression) {
        return expression instanceof BSCanBeIndexedType;
    }

    public void validateVariableType(BSType explicitType, BSType expression, ErrorHandler errorHandler) {
        typeDetermined = explicitType;
        if(expression instanceof BSCanBeIndexedType rangeType) {
            if(hasExplicitType()) {
                TypeValidator.validateCompatibility(rangeType.getInner(), explicitType, errorHandler, node);
            } else {
                typeDetermined = rangeType.getInner();
            }
        } else {
            addExpressionCannotBeIndexedError(expression, errorHandler);
        }
    }

    public VariableSymbol buildSymbol(BSType errorType) {
        return new VariableSymbol(
                node.getVarDeclaration().getVariableName(),
                Objects.requireNonNullElse(typeDetermined, errorType),
                true,
                true
        );
    }

    private void addExpressionCannotBeIndexedError(BSType expression, ErrorHandler errorHandler) {
        errorHandler.add(new TypeError(
                node.getLine(),
                node.getColumn(),
                String.format("Type '%s' cannot be indexed", expression)
        ));
    }

    private boolean hasExplicitType() {
        return node.getVarDeclaration().getDeclarationType() != null;
    }
}
