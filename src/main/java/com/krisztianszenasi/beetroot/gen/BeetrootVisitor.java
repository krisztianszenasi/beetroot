// Generated from /Users/krisztianszenasi/git/bme/msc/semester1/Beetroot3/src/main/java/com/krisztianszenasi/beetroot/Beetroot.g4 by ANTLR 4.13.1
package com.krisztianszenasi.beetroot.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BeetrootParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BeetrootVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(BeetrootParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BeetrootParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BeetrootParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(BeetrootParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(BeetrootParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(BeetrootParser.NewlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#flowControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowControl(BeetrootParser.FlowControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(BeetrootParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(BeetrootParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(BeetrootParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpression(BeetrootParser.MulDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpression(BeetrootParser.AddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compairExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompairExpression(BeetrootParser.CompairExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rangeExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(BeetrootParser.RangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(BeetrootParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(BeetrootParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#mutability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutability(BeetrootParser.MutabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(BeetrootParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#declarationType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationType(BeetrootParser.DeclarationTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(BeetrootParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(BeetrootParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(BeetrootParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#addSubOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubOp(BeetrootParser.AddSubOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#mulDivOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivOp(BeetrootParser.MulDivOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#compairOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompairOp(BeetrootParser.CompairOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#logicalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOp(BeetrootParser.LogicalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#rangeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeType(BeetrootParser.RangeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#collectionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionType(BeetrootParser.CollectionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(BeetrootParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#dictElementType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictElementType(BeetrootParser.DictElementTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#keyType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyType(BeetrootParser.KeyTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#valueType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueType(BeetrootParser.ValueTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(BeetrootParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(BeetrootParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(BeetrootParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#literalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(BeetrootParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(BeetrootParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#numberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(BeetrootParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#collectionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionLiteral(BeetrootParser.CollectionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#noneLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneLiteral(BeetrootParser.NoneLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(BeetrootParser.VariableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#boolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(BeetrootParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(BeetrootParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#dictLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictLiteral(BeetrootParser.DictLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#dictElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictElement(BeetrootParser.DictElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(BeetrootParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(BeetrootParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(BeetrootParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(BeetrootParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(BeetrootParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(BeetrootParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(BeetrootParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(BeetrootParser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(BeetrootParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#functionReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturnType(BeetrootParser.FunctionReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#forHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForHeader(BeetrootParser.ForHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#elifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifBlock(BeetrootParser.ElifBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BeetrootParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(BeetrootParser.ElseBlockContext ctx);
}