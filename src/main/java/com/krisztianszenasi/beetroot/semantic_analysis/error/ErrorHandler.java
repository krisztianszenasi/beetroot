package com.krisztianszenasi.beetroot.semantic_analysis.error;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.ReturnStatement;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.VariableDeclarationNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.flow_control.FlowControlStatement;

import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {
    private final List<BaseError> errors;

    public ErrorHandler() {
        errors = new ArrayList<>();
    }

    public void add(BaseError error) {
        errors.add(error);
    }

    public void printErrors() {
        for(BaseError error : errors) {
            System.out.println(error);
        }
    }

    public void addOutsideOfLoopError(FlowControlStatement node, String name) {
        add(new SyntaxError(node.getLine(), node.getColumn(), String.format("'%s' outside of loop", name)));
    }

    public void addReturnOutsideOfFunction(ReturnStatement node) {
        add(new SyntaxError(node.getLine(), node.getColumn(), "'return' outside of function"));
    }

    public void addIncompatibleReturnType(
            String funcName,
            String expectedType,
            String actualType,
            ReturnStatement node
    ) {
        add(TypeError.buildIncompatibleReturnTypeError(
                funcName,
                expectedType,
                actualType,
                node.getLine(),
                node.getColumn()
        ));
    }

    public void addVariableAlreadyExists(VariableDeclarationNode node) {
        add(NameError.buildNameAlreadyExistsError(
                node.getVariableName(),
                "Variable",
                node.getLine(),
                node.getColumn()
        ));
    }
    public boolean wereAnyErrors() {
        return !errors.isEmpty();
    }
}
