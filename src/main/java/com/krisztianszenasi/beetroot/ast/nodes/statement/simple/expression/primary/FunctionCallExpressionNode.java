package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FunctionCallExpressionNode extends PrimaryExpressionNode{
    private final String functionName;
    private final List<ExpressionNode> arguments = new ArrayList<>();

    public FunctionCallExpressionNode(String functionName) {
        this.functionName = functionName;
    }

    public void addArgument(ExpressionNode argument) {
        arguments.add(argument);
    }

    public ExpressionNode getArgument(int idx) {
        return arguments.get(idx);
    }

    public String getFunctionName() {
        return functionName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FunctionCallExpressionNode that = (FunctionCallExpressionNode) o;
        return Objects.equals(functionName, that.functionName) && Objects.equals(arguments, that.arguments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionName, arguments);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitFunctionCallExpressionNode(this);
    }
}
