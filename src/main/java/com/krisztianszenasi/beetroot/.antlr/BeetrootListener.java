// Generated from /Users/krisztianszenasi/git/bme/msc/semester1/Beetroot3/src/main/java/com/krisztianszenasi/beetroot/Beetroot.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BeetrootParser}.
 */
public interface BeetrootListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(BeetrootParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(BeetrootParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(BeetrootParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(BeetrootParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BeetrootParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BeetrootParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(BeetrootParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(BeetrootParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(BeetrootParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(BeetrootParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(BeetrootParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(BeetrootParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#flowControl}.
	 * @param ctx the parse tree
	 */
	void enterFlowControl(BeetrootParser.FlowControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#flowControl}.
	 * @param ctx the parse tree
	 */
	void exitFlowControl(BeetrootParser.FlowControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(BeetrootParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(BeetrootParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(BeetrootParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(BeetrootParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(BeetrootParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(BeetrootParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpression(BeetrootParser.MulDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpression(BeetrootParser.MulDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpression(BeetrootParser.AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpression(BeetrootParser.AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compairExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompairExpression(BeetrootParser.CompairExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compairExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompairExpression(BeetrootParser.CompairExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(BeetrootParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(BeetrootParser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(BeetrootParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link BeetrootParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(BeetrootParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(BeetrootParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(BeetrootParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#mutability}.
	 * @param ctx the parse tree
	 */
	void enterMutability(BeetrootParser.MutabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#mutability}.
	 * @param ctx the parse tree
	 */
	void exitMutability(BeetrootParser.MutabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(BeetrootParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(BeetrootParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#declarationType}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationType(BeetrootParser.DeclarationTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#declarationType}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationType(BeetrootParser.DeclarationTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(BeetrootParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(BeetrootParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(BeetrootParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(BeetrootParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(BeetrootParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(BeetrootParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#addSubOp}.
	 * @param ctx the parse tree
	 */
	void enterAddSubOp(BeetrootParser.AddSubOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#addSubOp}.
	 * @param ctx the parse tree
	 */
	void exitAddSubOp(BeetrootParser.AddSubOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#mulDivOp}.
	 * @param ctx the parse tree
	 */
	void enterMulDivOp(BeetrootParser.MulDivOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#mulDivOp}.
	 * @param ctx the parse tree
	 */
	void exitMulDivOp(BeetrootParser.MulDivOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#compairOp}.
	 * @param ctx the parse tree
	 */
	void enterCompairOp(BeetrootParser.CompairOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#compairOp}.
	 * @param ctx the parse tree
	 */
	void exitCompairOp(BeetrootParser.CompairOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOp(BeetrootParser.LogicalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOp(BeetrootParser.LogicalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#rangeType}.
	 * @param ctx the parse tree
	 */
	void enterRangeType(BeetrootParser.RangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#rangeType}.
	 * @param ctx the parse tree
	 */
	void exitRangeType(BeetrootParser.RangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#collectionType}.
	 * @param ctx the parse tree
	 */
	void enterCollectionType(BeetrootParser.CollectionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#collectionType}.
	 * @param ctx the parse tree
	 */
	void exitCollectionType(BeetrootParser.CollectionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(BeetrootParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(BeetrootParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(BeetrootParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(BeetrootParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#dictType}.
	 * @param ctx the parse tree
	 */
	void enterDictType(BeetrootParser.DictTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#dictType}.
	 * @param ctx the parse tree
	 */
	void exitDictType(BeetrootParser.DictTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#keyType}.
	 * @param ctx the parse tree
	 */
	void enterKeyType(BeetrootParser.KeyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#keyType}.
	 * @param ctx the parse tree
	 */
	void exitKeyType(BeetrootParser.KeyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#valueType}.
	 * @param ctx the parse tree
	 */
	void enterValueType(BeetrootParser.ValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#valueType}.
	 * @param ctx the parse tree
	 */
	void exitValueType(BeetrootParser.ValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(BeetrootParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(BeetrootParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(BeetrootParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(BeetrootParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(BeetrootParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(BeetrootParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(BeetrootParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(BeetrootParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(BeetrootParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(BeetrootParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(BeetrootParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(BeetrootParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(BeetrootParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(BeetrootParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#collectionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCollectionLiteral(BeetrootParser.CollectionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#collectionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCollectionLiteral(BeetrootParser.CollectionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#noneLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNoneLiteral(BeetrootParser.NoneLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#noneLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNoneLiteral(BeetrootParser.NoneLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(BeetrootParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(BeetrootParser.VariableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(BeetrootParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(BeetrootParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(BeetrootParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(BeetrootParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDictLiteral(BeetrootParser.DictLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#dictLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDictLiteral(BeetrootParser.DictLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#dictElement}.
	 * @param ctx the parse tree
	 */
	void enterDictElement(BeetrootParser.DictElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#dictElement}.
	 * @param ctx the parse tree
	 */
	void exitDictElement(BeetrootParser.DictElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(BeetrootParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(BeetrootParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(BeetrootParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(BeetrootParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(BeetrootParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(BeetrootParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(BeetrootParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(BeetrootParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(BeetrootParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(BeetrootParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(BeetrootParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(BeetrootParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(BeetrootParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(BeetrootParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(BeetrootParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(BeetrootParser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(BeetrootParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(BeetrootParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#functionReturnType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturnType(BeetrootParser.FunctionReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#functionReturnType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturnType(BeetrootParser.FunctionReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#forHeader}.
	 * @param ctx the parse tree
	 */
	void enterForHeader(BeetrootParser.ForHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#forHeader}.
	 * @param ctx the parse tree
	 */
	void exitForHeader(BeetrootParser.ForHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void enterElifBlock(BeetrootParser.ElifBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#elifBlock}.
	 * @param ctx the parse tree
	 */
	void exitElifBlock(BeetrootParser.ElifBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BeetrootParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(BeetrootParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BeetrootParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(BeetrootParser.ElseBlockContext ctx);
}