package com.krisztianszenasi.beetroot.semantic_analysis.validators;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.IndexedExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.PrimaryExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.VariableReferenceLiteralNode;
import com.krisztianszenasi.beetroot.semantic_analysis.Scope;
import com.krisztianszenasi.beetroot.semantic_analysis.error.ErrorHandler;
import com.krisztianszenasi.beetroot.semantic_analysis.error.TypeError;
import com.krisztianszenasi.beetroot.semantic_analysis.symbol.VariableSymbol;

public class AssignmentValidator {

    public static boolean cannotBeAssigned(PrimaryExpressionNode node) {
        return !(isVariableReference(node) || isIndexedVariableReference(node));
    }

    public static void addCannotBeAssignedError(ErrorHandler errorHandler, Node node) {
        errorHandler.add(new TypeError(
                node.getLine(),
                node.getColumn(),
                "Only variables and indexed variables are allowed on the left side of assignments"
        ));
    }

    public static void validateUnMutableVariables(PrimaryExpressionNode node, Scope scope, ErrorHandler errorHandler) {
        VariableReferenceLiteralNode varRef = null;
        if(isVariableReference(node)) {
            varRef = (VariableReferenceLiteralNode) node;
        } else {
            IndexedExpressionNode indexedVarRef = (IndexedExpressionNode) node;
            varRef = (VariableReferenceLiteralNode) indexedVarRef.getIndexed();
        }
        VariableSymbol symbol = scope.findVariable(varRef.getName());
        if(symbol != null && !symbol.canBeChanged()) {
            errorHandler.add(new TypeError(
                    node.getLine(),
                    node.getColumn(),
                    String.format(
                            "Variable '%s' cannot be changed because it was declared as immutable (val)",
                            varRef.getName()
                    )
            ));
        }
    }

    private static boolean isVariableReference(PrimaryExpressionNode node) {
        return node instanceof VariableReferenceLiteralNode;
    }

    private static boolean isIndexedVariableReference(PrimaryExpressionNode node) {
       if(node instanceof IndexedExpressionNode indexedExpression) {
           return isVariableReference(indexedExpression.getIndexed());
       }
        return false;
    }
}
