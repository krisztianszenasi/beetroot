package com.krisztianszenasi.beetroot.semantic_analysis.builders.expression_type;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.BinaryExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.FunctionCallExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.IndexedExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.BoolLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.NoneLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.StringLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.VariableReferenceLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.CollectionLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.DictElementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.DictionaryLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.collection.ListLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.number.DecimalLiteralNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.number.IntegerLiteralNode;
import com.krisztianszenasi.beetroot.semantic_analysis.Scope;
import com.krisztianszenasi.beetroot.semantic_analysis.error.*;
import com.krisztianszenasi.beetroot.semantic_analysis.operator.BSOperator;
import com.krisztianszenasi.beetroot.semantic_analysis.symbol.FunctionSymbol;
import com.krisztianszenasi.beetroot.semantic_analysis.symbol.VariableSymbol;
import com.krisztianszenasi.beetroot.semantic_analysis.type.*;
import com.krisztianszenasi.beetroot.semantic_analysis.type.names.TypeName;
import com.krisztianszenasi.beetroot.semantic_analysis.type_system.TypeSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class BSExpressionTypeBuilder {

    protected final TypeSystem typeSystem;
    protected final ErrorHandler errorHandler;


    public BSExpressionTypeBuilder(TypeSystem typeSystem, ErrorHandler errorHandler) {
        this.typeSystem = typeSystem;
        this.errorHandler = errorHandler;
    }


    public BSType getTypeFor(
            ExpressionNode node,
            Scope scope
    ) {
        return  node != null ? node.accept(this, scope) : null;
    }

    public BSType getTypeForDictElementNode(DictElementNode node, Scope scope) {
        return new BSCompoundType(
                getTypeFor(node.getKey(), scope),
                getTypeFor(node.getValue(), scope)
        );
    }


    public BSType getTypeForDictionaryLiteralNode(DictionaryLiteralNode node, Scope scope) {
        return handleCollectionLiterals(TypeName.DICT, node, scope);
    }

    public BSType getTypeForListLiteralNode(ListLiteralNode node, Scope scope) {
        return handleCollectionLiterals(TypeName.LIST, node, scope);
    }

    public BSType getTypeForDecimalLiteralNode(DecimalLiteralNode node, Scope scope) {
        return retrieveType(TypeName.DEC, node);
    }

    public BSType getTypeForIntegerLiteralNode(IntegerLiteralNode node, Scope scope) {
        return retrieveType(TypeName.INT, node);
    }

    public BSType getTypeForBoolLiteralNode(BoolLiteralNode node, Scope scope) {
        return retrieveType(TypeName.BOOL, node);
    }

    public BSType getTypeForNoneLiteralNode(NoneLiteralNode node, Scope scope) {
        return retrieveType(TypeName.NONE, node);
    }

    public BSType getTypeForStringLiteralNode(StringLiteralNode node, Scope scope) {
        return retrieveType(TypeName.STR, node);
    }

    public BSType getTypeForVariableReferenceLiteralNode(VariableReferenceLiteralNode node, Scope scope) {
        VariableSymbol variable = scope.findVariable(node.getName());
        if(variable == null) {
            errorHandler.add(NameError.buildNameNotDefinedError(node.getName(), node.getLine(), node.getColumn()));
            return typeSystem.getErrorType();
        }
        if(!variable.hasValue()) {
            errorHandler.add(NameError.buildNameNotInitialized(node.getName(), node.getLine(), node.getColumn()));
        }
        return variable.getType();
    }

    public BSType getTypeForFunctionCallExpressionNode(FunctionCallExpressionNode node, Scope scope) {
        FunctionSymbol functionFound = scope.findFunction(node.getFunctionName());
        if(functionFound != null) {
            functionFound.validateArguments(
                    convertExpressionListToTypeList(node.getArguments(), scope),
                    errorHandler,
                    node
            );
            return functionFound.getReturnType();
        }
        errorHandler.add(NameError.buildNameNotDefinedError(node.getFunctionName(), node.getLine(), node.getColumn()));
        return typeSystem.getErrorType();
    }

    public BSType getTypeForIndexedExpressionNode(IndexedExpressionNode node, Scope scope) {
        BSType indexedType = getTypeFor(node.getIndexed(), scope);
        BSType indexPositionType = getTypeFor(node.getIndexPosition(), scope);

        if(!(indexedType instanceof BSCanBeIndexedType canBeIndexedPrimary)) {
            errorHandler.add(new TypeError(
                    node.getLine(),
                    node.getColumn(),
                    String.format("Type '%s' cannot be indexed", indexedType.toString())
            ));
            return typeSystem.getErrorType();
        }
        if(!indexPositionType.isCompatibleWith(canBeIndexedPrimary.getIndexType())) {
            errorHandler.add(new TypeError(
                    node.getLine(),
                    node.getColumn(),
                    String.format(
                            "Type '%s' expects indexes of type '%s', but got '%s'",
                            indexedType,
                            canBeIndexedPrimary.getIndexType(),
                            indexPositionType
                    )
            ));
        }
        return canBeIndexedPrimary.getInner();
    }

    public BSType getTypeForBinaryExpressionNode(BinaryExpressionNode node, Scope scope) {
        BSType leftType = getTypeFor(node.getLeft(), scope);
        BSType rightType = getTypeFor(node.getRight(), scope);
        BSOperator operatorFound = typeSystem.getBinaryFor(node.getOperator(), leftType, rightType);
        if(operatorFound == null) {
            errorHandler.add(TypeError.buildBinaryOperatorDoesNotExistError(
                    node.getOperator(),
                    leftType.toString(),
                    rightType.toString(),
                    node.getLine(),
                    node.getColumn()
            ));
            return typeSystem.getErrorType();
        }
        return operatorFound.getResultType();
    }

    // helpers
    private BSType handleCollectionLiterals(String collectionTypeName, CollectionLiteralNode node, Scope scope) {
        BSType typeFound = retrieveType(collectionTypeName, node);
        BSType innerType = getCommonTypeForExpressionList(node.getElements(), scope);

        TypeBuildResult buildResult = typeFound.buildFrom(innerType);
        processErrors(buildResult.getErrors(), node);
        typeSystem.register(buildResult.getType());

        return Objects.requireNonNullElse(
                buildResult.getType(),
                typeSystem.getErrorType()
        );
    }

    private BSType getCommonTypeForExpressionList(List<ExpressionNode> expressionList, Scope scope) {
        BSType typeDetermined = null;
        for(ExpressionNode expression : expressionList) {
            BSType currentType = getTypeFor(expression, scope);
            typeDetermined = (typeDetermined == null) ? currentType : typeDetermined.getCommonTypeWith(currentType);
        }
        return Objects.requireNonNullElse(typeDetermined, typeSystem.getErrorType());
    }

    private List<BSType> convertExpressionListToTypeList(List<ExpressionNode> expressionList, Scope scope) {
        List<BSType> convertedList = new ArrayList<>();
        for(ExpressionNode expression : expressionList) {
            convertedList.add(getTypeFor(expression, scope));
        }
        return convertedList;
    }

    private BSType retrieveType(String name, Node node) {
        BSType typeFound = typeSystem.getType(name);
        if(typeFound == null) {
            errorHandler.add(new TypeDoesNotExistError(node.getLine(), node.getColumn(), name));
            return typeSystem.getErrorType();
        }
        return typeFound;
    }

    private void processErrors(List<BaseError> errors, Node node) {
        for(BaseError error : errors) {
            error.setLine(node.getLine());
            error.setColumn(node.getColumn());
            errorHandler.add(error);
        }
    }
}
