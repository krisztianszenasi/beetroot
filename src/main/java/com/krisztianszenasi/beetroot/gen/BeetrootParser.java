// Generated from /Users/krisztianszenasi/git/bme/msc/semester1/Beetroot3/src/main/java/com/krisztianszenasi/beetroot/Beetroot.g4 by ANTLR 4.13.1
package com.krisztianszenasi.beetroot.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BeetrootParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPARAEN=2, LBRACKET=3, RBRACKET=4, LCURLY=5, RCURLY=6, COLON=7, 
		COMMA=8, DOT=9, EQ=10, NEQ=11, NEG=12, LT=13, GT=14, LTE=15, GTE=16, IN=17, 
		ASSIGN=18, PLUS=19, MINUS=20, MUL=21, DIV=22, REMINDER=23, ARROW=24, AND=25, 
		OR=26, FUN=27, IF=28, ELIF=29, ELSE=30, WHILE=31, FOR=32, END=33, VAR=34, 
		VAL=35, RETURN=36, BREAK=37, CONTINUE=38, INT_T=39, DEC_T=40, STR_T=41, 
		BOOL_T=42, ANY_T=43, NONE_LIT=44, INT_LIT=45, DEC_LIT=46, STR_LIT=47, 
		TRUE_LIT=48, FALSE_LIT=49, MAYBE_LIT=50, LIST_T=51, DICT_T=52, RANGE_T=53, 
		NEWLINE=54, WS=55, ID=56, LINE_COMMENT=57;
	public static final int
		RULE_file = 0, RULE_block = 1, RULE_statement = 2, RULE_simpleStatement = 3, 
		RULE_compoundStatement = 4, RULE_newline = 5, RULE_flowControl = 6, RULE_variableDeclaration = 7, 
		RULE_assignmentStatement = 8, RULE_expression = 9, RULE_returnStatement = 10, 
		RULE_mutability = 11, RULE_variableName = 12, RULE_declarationType = 13, 
		RULE_type = 14, RULE_assignment = 15, RULE_primary = 16, RULE_addSubOp = 17, 
		RULE_mulDivOp = 18, RULE_compairOp = 19, RULE_logicalOp = 20, RULE_rangeType = 21, 
		RULE_collectionType = 22, RULE_primitiveType = 23, RULE_listType = 24, 
		RULE_dictType = 25, RULE_keyType = 26, RULE_valueType = 27, RULE_parenthesizedExpression = 28, 
		RULE_unaryExpression = 29, RULE_functionCall = 30, RULE_literalExpression = 31, 
		RULE_stringLiteral = 32, RULE_numberLiteral = 33, RULE_collectionLiteral = 34, 
		RULE_noneLiteral = 35, RULE_variableReference = 36, RULE_boolLiteral = 37, 
		RULE_listLiteral = 38, RULE_dictLiteral = 39, RULE_dictElement = 40, RULE_key = 41, 
		RULE_value = 42, RULE_ifStatement = 43, RULE_whileStatement = 44, RULE_forStatement = 45, 
		RULE_functionDefinition = 46, RULE_functionName = 47, RULE_functionParameters = 48, 
		RULE_functionParameter = 49, RULE_functionReturnType = 50, RULE_forHeader = 51, 
		RULE_elifBlock = 52, RULE_elseBlock = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "block", "statement", "simpleStatement", "compoundStatement", 
			"newline", "flowControl", "variableDeclaration", "assignmentStatement", 
			"expression", "returnStatement", "mutability", "variableName", "declarationType", 
			"type", "assignment", "primary", "addSubOp", "mulDivOp", "compairOp", 
			"logicalOp", "rangeType", "collectionType", "primitiveType", "listType", 
			"dictType", "keyType", "valueType", "parenthesizedExpression", "unaryExpression", 
			"functionCall", "literalExpression", "stringLiteral", "numberLiteral", 
			"collectionLiteral", "noneLiteral", "variableReference", "boolLiteral", 
			"listLiteral", "dictLiteral", "dictElement", "key", "value", "ifStatement", 
			"whileStatement", "forStatement", "functionDefinition", "functionName", 
			"functionParameters", "functionParameter", "functionReturnType", "forHeader", 
			"elifBlock", "elseBlock"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", "','", "'.'", 
			"'=='", "'!='", "'not'", "'<'", "'>'", "'<='", "'>='", "'in'", "'='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'->'", "'and'", "'or'", "'fun'", 
			"'if'", "'elif'", "'else'", "'while'", "'for'", "'end'", "'var'", "'val'", 
			"'return'", "'break'", "'continue'", "'int'", "'dec'", "'str'", "'bool'", 
			"'any'", "'none'", null, null, null, "'true'", "'false'", "'maybe'", 
			"'list'", "'dict'", "'range'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPARAEN", "LBRACKET", "RBRACKET", "LCURLY", "RCURLY", 
			"COLON", "COMMA", "DOT", "EQ", "NEQ", "NEG", "LT", "GT", "LTE", "GTE", 
			"IN", "ASSIGN", "PLUS", "MINUS", "MUL", "DIV", "REMINDER", "ARROW", "AND", 
			"OR", "FUN", "IF", "ELIF", "ELSE", "WHILE", "FOR", "END", "VAR", "VAL", 
			"RETURN", "BREAK", "CONTINUE", "INT_T", "DEC_T", "STR_T", "BOOL_T", "ANY_T", 
			"NONE_LIT", "INT_LIT", "DEC_LIT", "STR_LIT", "TRUE_LIT", "FALSE_LIT", 
			"MAYBE_LIT", "LIST_T", "DICT_T", "RANGE_T", "NEWLINE", "WS", "ID", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Beetroot.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BeetrootParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BeetrootParser.EOF, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			block();
			setState(109);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(111);
				newline();
				}
				break;
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 73166441180827690L) != 0)) {
				{
				setState(114);
				statement();
				}
			}

			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(117);
					newline();
					setState(118);
					statement();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(125);
				newline();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case LBRACKET:
			case LCURLY:
			case NEG:
			case MINUS:
			case VAR:
			case VAL:
			case RETURN:
			case BREAK:
			case CONTINUE:
			case NONE_LIT:
			case INT_LIT:
			case DEC_LIT:
			case STR_LIT:
			case TRUE_LIT:
			case FALSE_LIT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				simpleStatement();
				}
				break;
			case FUN:
			case IF:
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				compoundStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FlowControlContext flowControl() {
			return getRuleContext(FlowControlContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simpleStatement);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				assignmentStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				flowControl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compoundStatement);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				forStatement();
				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				functionDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewlineContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(BeetrootParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BeetrootParser.NEWLINE, i);
		}
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_newline);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(145);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(148); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FlowControlContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(BeetrootParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(BeetrootParser.CONTINUE, 0); }
		public FlowControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flowControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterFlowControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitFlowControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitFlowControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlowControlContext flowControl() throws RecognitionException {
		FlowControlContext _localctx = new FlowControlContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_flowControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !(_la==BREAK || _la==CONTINUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public MutabilityContext mutability() {
			return getRuleContext(MutabilityContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public DeclarationTypeContext declarationType() {
			return getRuleContext(DeclarationTypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BeetrootParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			mutability();
			setState(153);
			variableName();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(154);
				declarationType();
				}
			}

			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(157);
				match(ASSIGN);
				setState(158);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			primary(0);
			setState(162);
			assignment();
			setState(163);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulDivOpContext mulDivOp() {
			return getRuleContext(MulDivOpContext.class,0);
		}
		public MulDivExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterMulDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitMulDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitMulDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubOpContext addSubOp() {
			return getRuleContext(AddSubOpContext.class,0);
		}
		public AddSubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompairExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompairOpContext compairOp() {
			return getRuleContext(CompairOpContext.class,0);
		}
		public CompairExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterCompairExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitCompairExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitCompairExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(BeetrootParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(BeetrootParser.DOT, i);
		}
		public RangeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitRangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicalOpContext logicalOp() {
			return getRuleContext(LogicalOpContext.class,0);
		}
		public LogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(166);
			primary(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(169);
						mulDivOp();
						setState(170);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(172);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(173);
						addSubOp();
						setState(174);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new CompairExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(176);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(177);
						compairOp();
						setState(178);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(181);
						logicalOp();
						setState(182);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(185);
						match(DOT);
						setState(186);
						match(DOT);
						setState(187);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(BeetrootParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(RETURN);
			setState(194);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MutabilityContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(BeetrootParser.VAR, 0); }
		public TerminalNode VAL() { return getToken(BeetrootParser.VAL, 0); }
		public MutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterMutability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitMutability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitMutability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MutabilityContext mutability() throws RecognitionException {
		MutabilityContext _localctx = new MutabilityContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==VAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BeetrootParser.ID, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationTypeContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(BeetrootParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarationTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterDeclarationType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitDeclarationType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitDeclarationType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationTypeContext declarationType() throws RecognitionException {
		DeclarationTypeContext _localctx = new DeclarationTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declarationType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(COLON);
			setState(201);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CollectionTypeContext collectionType() {
			return getRuleContext(CollectionTypeContext.class,0);
		}
		public RangeTypeContext rangeType() {
			return getRuleContext(RangeTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_T:
			case DEC_T:
			case STR_T:
			case BOOL_T:
			case ANY_T:
			case NONE_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				primitiveType();
				}
				break;
			case LIST_T:
			case DICT_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				collectionType();
				}
				break;
			case RANGE_T:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				rangeType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(BeetrootParser.ASSIGN, 0); }
		public TerminalNode PLUS() { return getToken(BeetrootParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BeetrootParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(BeetrootParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(BeetrootParser.DIV, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(ASSIGN);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(PLUS);
				setState(210);
				match(ASSIGN);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(MINUS);
				setState(212);
				match(ASSIGN);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(MUL);
				setState(214);
				match(ASSIGN);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				match(DIV);
				setState(216);
				match(ASSIGN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(BeetrootParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(BeetrootParser.RBRACKET, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		return primary(0);
	}

	private PrimaryContext primary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryContext _localctx = new PrimaryContext(_ctx, _parentState);
		PrimaryContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_primary, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(220);
				parenthesizedExpression();
				}
				break;
			case 2:
				{
				setState(221);
				unaryExpression();
				}
				break;
			case 3:
				{
				setState(222);
				functionCall();
				}
				break;
			case 4:
				{
				setState(223);
				literalExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primary);
					setState(226);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(227);
					match(LBRACKET);
					setState(228);
					expression(0);
					setState(229);
					match(RBRACKET);
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddSubOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(BeetrootParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BeetrootParser.MINUS, 0); }
		public AddSubOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterAddSubOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitAddSubOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitAddSubOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubOpContext addSubOp() throws RecognitionException {
		AddSubOpContext _localctx = new AddSubOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addSubOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulDivOpContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(BeetrootParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(BeetrootParser.DIV, 0); }
		public TerminalNode REMINDER() { return getToken(BeetrootParser.REMINDER, 0); }
		public MulDivOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterMulDivOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitMulDivOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitMulDivOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivOpContext mulDivOp() throws RecognitionException {
		MulDivOpContext _localctx = new MulDivOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mulDivOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompairOpContext extends ParserRuleContext {
		public TerminalNode GTE() { return getToken(BeetrootParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(BeetrootParser.LTE, 0); }
		public TerminalNode GT() { return getToken(BeetrootParser.GT, 0); }
		public TerminalNode LT() { return getToken(BeetrootParser.LT, 0); }
		public TerminalNode EQ() { return getToken(BeetrootParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(BeetrootParser.NEQ, 0); }
		public TerminalNode IN() { return getToken(BeetrootParser.IN, 0); }
		public CompairOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compairOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterCompairOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitCompairOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitCompairOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompairOpContext compairOp() throws RecognitionException {
		CompairOpContext _localctx = new CompairOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_compairOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 257024L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(BeetrootParser.AND, 0); }
		public TerminalNode OR() { return getToken(BeetrootParser.OR, 0); }
		public LogicalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterLogicalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitLogicalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitLogicalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOpContext logicalOp() throws RecognitionException {
		LogicalOpContext _localctx = new LogicalOpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangeTypeContext extends ParserRuleContext {
		public TerminalNode RANGE_T() { return getToken(BeetrootParser.RANGE_T, 0); }
		public TerminalNode LBRACKET() { return getToken(BeetrootParser.LBRACKET, 0); }
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(BeetrootParser.RBRACKET, 0); }
		public RangeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterRangeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitRangeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitRangeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeTypeContext rangeType() throws RecognitionException {
		RangeTypeContext _localctx = new RangeTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rangeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(RANGE_T);
			setState(245);
			match(LBRACKET);
			setState(246);
			valueType();
			setState(247);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CollectionTypeContext extends ParserRuleContext {
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public DictTypeContext dictType() {
			return getRuleContext(DictTypeContext.class,0);
		}
		public CollectionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterCollectionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitCollectionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitCollectionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionTypeContext collectionType() throws RecognitionException {
		CollectionTypeContext _localctx = new CollectionTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_collectionType);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				listType();
				}
				break;
			case DICT_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				dictType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode INT_T() { return getToken(BeetrootParser.INT_T, 0); }
		public TerminalNode DEC_T() { return getToken(BeetrootParser.DEC_T, 0); }
		public TerminalNode STR_T() { return getToken(BeetrootParser.STR_T, 0); }
		public TerminalNode BOOL_T() { return getToken(BeetrootParser.BOOL_T, 0); }
		public TerminalNode ANY_T() { return getToken(BeetrootParser.ANY_T, 0); }
		public TerminalNode NONE_LIT() { return getToken(BeetrootParser.NONE_LIT, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34634616274944L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListTypeContext extends ParserRuleContext {
		public TerminalNode LIST_T() { return getToken(BeetrootParser.LIST_T, 0); }
		public TerminalNode LBRACKET() { return getToken(BeetrootParser.LBRACKET, 0); }
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(BeetrootParser.RBRACKET, 0); }
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(LIST_T);
			setState(256);
			match(LBRACKET);
			setState(257);
			valueType();
			setState(258);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DictTypeContext extends ParserRuleContext {
		public TerminalNode DICT_T() { return getToken(BeetrootParser.DICT_T, 0); }
		public TerminalNode LBRACKET() { return getToken(BeetrootParser.LBRACKET, 0); }
		public KeyTypeContext keyType() {
			return getRuleContext(KeyTypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(BeetrootParser.COMMA, 0); }
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(BeetrootParser.RBRACKET, 0); }
		public DictTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterDictType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitDictType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitDictType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictTypeContext dictType() throws RecognitionException {
		DictTypeContext _localctx = new DictTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dictType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(DICT_T);
			setState(261);
			match(LBRACKET);
			setState(262);
			keyType();
			setState(263);
			match(COMMA);
			setState(264);
			valueType();
			setState(265);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public KeyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterKeyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitKeyType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitKeyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyTypeContext keyType() throws RecognitionException {
		KeyTypeContext _localctx = new KeyTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_keyType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValueTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterValueType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitValueType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitValueType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueTypeContext valueType() throws RecognitionException {
		ValueTypeContext _localctx = new ValueTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_valueType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BeetrootParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARAEN() { return getToken(BeetrootParser.RPARAEN, 0); }
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(LPAREN);
			setState(272);
			expression(0);
			setState(273);
			match(RPARAEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode NEG() { return getToken(BeetrootParser.NEG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(BeetrootParser.MINUS, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_unaryExpression);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEG:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(NEG);
				setState(276);
				expression(0);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(MINUS);
				setState(278);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BeetrootParser.LPAREN, 0); }
		public TerminalNode RPARAEN() { return getToken(BeetrootParser.RPARAEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BeetrootParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BeetrootParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			functionName();
			setState(282);
			match(LPAREN);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 73165901759778858L) != 0)) {
				{
				setState(283);
				expression(0);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(284);
					match(COMMA);
					setState(285);
					expression(0);
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(293);
			match(RPARAEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public CollectionLiteralContext collectionLiteral() {
			return getRuleContext(CollectionLiteralContext.class,0);
		}
		public NoneLiteralContext noneLiteral() {
			return getRuleContext(NoneLiteralContext.class,0);
		}
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public LiteralExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralExpressionContext literalExpression() throws RecognitionException {
		LiteralExpressionContext _localctx = new LiteralExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_literalExpression);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				stringLiteral();
				}
				break;
			case INT_LIT:
			case DEC_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				numberLiteral();
				}
				break;
			case LBRACKET:
			case LCURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				collectionLiteral();
				}
				break;
			case NONE_LIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				noneLiteral();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(299);
				variableReference();
				}
				break;
			case TRUE_LIT:
			case FALSE_LIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(300);
				boolLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STR_LIT() { return getToken(BeetrootParser.STR_LIT, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(STR_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DEC_LIT() { return getToken(BeetrootParser.DEC_LIT, 0); }
		public TerminalNode INT_LIT() { return getToken(BeetrootParser.INT_LIT, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !(_la==INT_LIT || _la==DEC_LIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CollectionLiteralContext extends ParserRuleContext {
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public DictLiteralContext dictLiteral() {
			return getRuleContext(DictLiteralContext.class,0);
		}
		public CollectionLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterCollectionLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitCollectionLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitCollectionLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionLiteralContext collectionLiteral() throws RecognitionException {
		CollectionLiteralContext _localctx = new CollectionLiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_collectionLiteral);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				listLiteral();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				dictLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoneLiteralContext extends ParserRuleContext {
		public TerminalNode NONE_LIT() { return getToken(BeetrootParser.NONE_LIT, 0); }
		public NoneLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noneLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterNoneLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitNoneLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitNoneLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoneLiteralContext noneLiteral() throws RecognitionException {
		NoneLiteralContext _localctx = new NoneLiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_noneLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(NONE_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableReferenceContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			variableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE_LIT() { return getToken(BeetrootParser.TRUE_LIT, 0); }
		public TerminalNode FALSE_LIT() { return getToken(BeetrootParser.FALSE_LIT, 0); }
		public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !(_la==TRUE_LIT || _la==FALSE_LIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(BeetrootParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BeetrootParser.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BeetrootParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BeetrootParser.COMMA, i);
		}
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_listLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(LBRACKET);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 73165901759778858L) != 0)) {
				{
				setState(318);
				expression(0);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(319);
					match(COMMA);
					setState(320);
					expression(0);
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(328);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DictLiteralContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(BeetrootParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(BeetrootParser.RCURLY, 0); }
		public List<DictElementContext> dictElement() {
			return getRuleContexts(DictElementContext.class);
		}
		public DictElementContext dictElement(int i) {
			return getRuleContext(DictElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BeetrootParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BeetrootParser.COMMA, i);
		}
		public DictLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterDictLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitDictLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitDictLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictLiteralContext dictLiteral() throws RecognitionException {
		DictLiteralContext _localctx = new DictLiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dictLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(LCURLY);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 73165901759778858L) != 0)) {
				{
				setState(331);
				dictElement();
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(332);
					match(COMMA);
					setState(333);
					dictElement();
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(341);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DictElementContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BeetrootParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DictElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterDictElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitDictElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitDictElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictElementContext dictElement() throws RecognitionException {
		DictElementContext _localctx = new DictElementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dictElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			key();
			setState(344);
			match(COLON);
			setState(345);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BeetrootParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BeetrootParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(BeetrootParser.END, 0); }
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public List<ElifBlockContext> elifBlock() {
			return getRuleContexts(ElifBlockContext.class);
		}
		public ElifBlockContext elifBlock(int i) {
			return getRuleContext(ElifBlockContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ifStatement);
		int _la;
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(IF);
				setState(352);
				expression(0);
				setState(353);
				match(COLON);
				setState(354);
				block();
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(355);
					elseBlock();
					}
				}

				setState(358);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(IF);
				setState(361);
				expression(0);
				setState(362);
				match(COLON);
				setState(363);
				block();
				setState(365); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(364);
					elifBlock();
					}
					}
					setState(367); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ELIF );
				setState(369);
				elseBlock();
				setState(370);
				match(END);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(BeetrootParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BeetrootParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(BeetrootParser.END, 0); }
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(WHILE);
			setState(375);
			expression(0);
			setState(376);
			match(COLON);
			setState(377);
			block();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(378);
				elseBlock();
				}
			}

			setState(381);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public ForHeaderContext forHeader() {
			return getRuleContext(ForHeaderContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(BeetrootParser.END, 0); }
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			forHeader();
			setState(384);
			block();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(385);
				elseBlock();
				}
			}

			setState(388);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(BeetrootParser.FUN, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BeetrootParser.LPAREN, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public TerminalNode RPARAEN() { return getToken(BeetrootParser.RPARAEN, 0); }
		public TerminalNode COLON() { return getToken(BeetrootParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(BeetrootParser.END, 0); }
		public FunctionReturnTypeContext functionReturnType() {
			return getRuleContext(FunctionReturnTypeContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(FUN);
			setState(391);
			functionName();
			setState(392);
			match(LPAREN);
			setState(393);
			functionParameters();
			setState(394);
			match(RPARAEN);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(395);
				functionReturnType();
				}
			}

			setState(398);
			match(COLON);
			setState(399);
			block();
			setState(400);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BeetrootParser.ID, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParametersContext extends ParserRuleContext {
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BeetrootParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BeetrootParser.COMMA, i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(404);
				functionParameter();
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(405);
					match(COMMA);
					setState(406);
					functionParameter();
					}
					}
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParameterContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BeetrootParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_functionParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			variableName();
			setState(415);
			match(COLON);
			setState(416);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionReturnTypeContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(BeetrootParser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterFunctionReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitFunctionReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitFunctionReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnTypeContext functionReturnType() throws RecognitionException {
		FunctionReturnTypeContext _localctx = new FunctionReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_functionReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(ARROW);
			setState(419);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForHeaderContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BeetrootParser.FOR, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode IN() { return getToken(BeetrootParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(BeetrootParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(BeetrootParser.COLON, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ForHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterForHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitForHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitForHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForHeaderContext forHeader() throws RecognitionException {
		ForHeaderContext _localctx = new ForHeaderContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_forHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(FOR);
			setState(422);
			variableName();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(423);
				match(COLON);
				setState(424);
				type();
				}
			}

			setState(427);
			match(IN);
			setState(428);
			expression(0);
			setState(429);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElifBlockContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(BeetrootParser.ELIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BeetrootParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterElifBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitElifBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitElifBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifBlockContext elifBlock() throws RecognitionException {
		ElifBlockContext _localctx = new ElifBlockContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_elifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(ELIF);
			setState(432);
			expression(0);
			setState(433);
			match(COLON);
			setState(434);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(BeetrootParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(BeetrootParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BeetrootVisitor ) return ((BeetrootVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(ELSE);
			setState(437);
			match(COLON);
			setState(438);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 16:
			return primary_sempred((PrimaryContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primary_sempred(PrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u01b9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0003\u0001q\b\u0001\u0001\u0001\u0003\u0001"+
		"t\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001y\b\u0001\n\u0001"+
		"\f\u0001|\t\u0001\u0001\u0001\u0003\u0001\u007f\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0083\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u008a\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0090\b\u0004\u0001\u0005\u0004\u0005\u0093"+
		"\b\u0005\u000b\u0005\f\u0005\u0094\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u009c\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00a0\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00bd\b\t\n\t\f\t\u00c0\t\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00cf\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00da\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e1\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00e8\b\u0010\n\u0010\f\u0010\u00eb\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u00fc\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0118"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u011f\b\u001e\n\u001e\f\u001e\u0122\t\u001e\u0003\u001e\u0124\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u012e\b\u001f\u0001 \u0001"+
		" \u0001!\u0001!\u0001\"\u0001\"\u0003\"\u0136\b\"\u0001#\u0001#\u0001"+
		"$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0005&\u0142\b&\n&"+
		"\f&\u0145\t&\u0003&\u0147\b&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0005\'\u014f\b\'\n\'\f\'\u0152\t\'\u0003\'\u0154\b\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u0165\b+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0004+\u016e\b+\u000b+\f+\u016f\u0001+\u0001+\u0001+\u0003"+
		"+\u0175\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u017c\b,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0003-\u0183\b-\u0001-\u0001-\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0003.\u018d\b.\u0001.\u0001.\u0001.\u0001.\u0001"+
		"/\u0001/\u00010\u00010\u00010\u00050\u0198\b0\n0\f0\u019b\t0\u00030\u019d"+
		"\b0\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u00013\u00013\u0001"+
		"3\u00013\u00033\u01aa\b3\u00013\u00013\u00013\u00013\u00014\u00014\u0001"+
		"4\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u0000\u0002\u0012 "+
		"6\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhj\u0000\t\u0001\u0000"+
		"%&\u0001\u0000\"#\u0001\u0000\u0013\u0014\u0001\u0000\u0015\u0017\u0002"+
		"\u0000\n\u000b\r\u0011\u0001\u0000\u0019\u001a\u0001\u0000\',\u0001\u0000"+
		"-.\u0001\u000001\u01b7\u0000l\u0001\u0000\u0000\u0000\u0002p\u0001\u0000"+
		"\u0000\u0000\u0004\u0082\u0001\u0000\u0000\u0000\u0006\u0089\u0001\u0000"+
		"\u0000\u0000\b\u008f\u0001\u0000\u0000\u0000\n\u0092\u0001\u0000\u0000"+
		"\u0000\f\u0096\u0001\u0000\u0000\u0000\u000e\u0098\u0001\u0000\u0000\u0000"+
		"\u0010\u00a1\u0001\u0000\u0000\u0000\u0012\u00a5\u0001\u0000\u0000\u0000"+
		"\u0014\u00c1\u0001\u0000\u0000\u0000\u0016\u00c4\u0001\u0000\u0000\u0000"+
		"\u0018\u00c6\u0001\u0000\u0000\u0000\u001a\u00c8\u0001\u0000\u0000\u0000"+
		"\u001c\u00ce\u0001\u0000\u0000\u0000\u001e\u00d9\u0001\u0000\u0000\u0000"+
		" \u00e0\u0001\u0000\u0000\u0000\"\u00ec\u0001\u0000\u0000\u0000$\u00ee"+
		"\u0001\u0000\u0000\u0000&\u00f0\u0001\u0000\u0000\u0000(\u00f2\u0001\u0000"+
		"\u0000\u0000*\u00f4\u0001\u0000\u0000\u0000,\u00fb\u0001\u0000\u0000\u0000"+
		".\u00fd\u0001\u0000\u0000\u00000\u00ff\u0001\u0000\u0000\u00002\u0104"+
		"\u0001\u0000\u0000\u00004\u010b\u0001\u0000\u0000\u00006\u010d\u0001\u0000"+
		"\u0000\u00008\u010f\u0001\u0000\u0000\u0000:\u0117\u0001\u0000\u0000\u0000"+
		"<\u0119\u0001\u0000\u0000\u0000>\u012d\u0001\u0000\u0000\u0000@\u012f"+
		"\u0001\u0000\u0000\u0000B\u0131\u0001\u0000\u0000\u0000D\u0135\u0001\u0000"+
		"\u0000\u0000F\u0137\u0001\u0000\u0000\u0000H\u0139\u0001\u0000\u0000\u0000"+
		"J\u013b\u0001\u0000\u0000\u0000L\u013d\u0001\u0000\u0000\u0000N\u014a"+
		"\u0001\u0000\u0000\u0000P\u0157\u0001\u0000\u0000\u0000R\u015b\u0001\u0000"+
		"\u0000\u0000T\u015d\u0001\u0000\u0000\u0000V\u0174\u0001\u0000\u0000\u0000"+
		"X\u0176\u0001\u0000\u0000\u0000Z\u017f\u0001\u0000\u0000\u0000\\\u0186"+
		"\u0001\u0000\u0000\u0000^\u0192\u0001\u0000\u0000\u0000`\u019c\u0001\u0000"+
		"\u0000\u0000b\u019e\u0001\u0000\u0000\u0000d\u01a2\u0001\u0000\u0000\u0000"+
		"f\u01a5\u0001\u0000\u0000\u0000h\u01af\u0001\u0000\u0000\u0000j\u01b4"+
		"\u0001\u0000\u0000\u0000lm\u0003\u0002\u0001\u0000mn\u0005\u0000\u0000"+
		"\u0001n\u0001\u0001\u0000\u0000\u0000oq\u0003\n\u0005\u0000po\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rt\u0003"+
		"\u0004\u0002\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tz\u0001\u0000\u0000\u0000uv\u0003\n\u0005\u0000vw\u0003\u0004\u0002\u0000"+
		"wy\u0001\u0000\u0000\u0000xu\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{~\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}\u007f\u0003\n\u0005\u0000~}\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0003\u0001\u0000"+
		"\u0000\u0000\u0080\u0083\u0003\u0006\u0003\u0000\u0081\u0083\u0003\b\u0004"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0005\u0001\u0000\u0000\u0000\u0084\u008a\u0003\u000e\u0007"+
		"\u0000\u0085\u008a\u0003\u0010\b\u0000\u0086\u008a\u0003\u0012\t\u0000"+
		"\u0087\u008a\u0003\u0014\n\u0000\u0088\u008a\u0003\f\u0006\u0000\u0089"+
		"\u0084\u0001\u0000\u0000\u0000\u0089\u0085\u0001\u0000\u0000\u0000\u0089"+
		"\u0086\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u0007\u0001\u0000\u0000\u0000\u008b"+
		"\u0090\u0003V+\u0000\u008c\u0090\u0003X,\u0000\u008d\u0090\u0003Z-\u0000"+
		"\u008e\u0090\u0003\\.\u0000\u008f\u008b\u0001\u0000\u0000\u0000\u008f"+
		"\u008c\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\t\u0001\u0000\u0000\u0000\u0091\u0093"+
		"\u00056\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u000b\u0001\u0000\u0000\u0000\u0096\u0097\u0007"+
		"\u0000\u0000\u0000\u0097\r\u0001\u0000\u0000\u0000\u0098\u0099\u0003\u0016"+
		"\u000b\u0000\u0099\u009b\u0003\u0018\f\u0000\u009a\u009c\u0003\u001a\r"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0012\u0000"+
		"\u0000\u009e\u00a0\u0003\u0012\t\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u000f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0003 \u0010\u0000\u00a2\u00a3\u0003\u001e\u000f\u0000\u00a3"+
		"\u00a4\u0003\u0012\t\u0000\u00a4\u0011\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0006\t\uffff\uffff\u0000\u00a6\u00a7\u0003 \u0010\u0000\u00a7\u00be"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\n\u0005\u0000\u0000\u00a9\u00aa\u0003"+
		"$\u0012\u0000\u00aa\u00ab\u0003\u0012\t\u0006\u00ab\u00bd\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\n\u0004\u0000\u0000\u00ad\u00ae\u0003\"\u0011"+
		"\u0000\u00ae\u00af\u0003\u0012\t\u0005\u00af\u00bd\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\n\u0003\u0000\u0000\u00b1\u00b2\u0003&\u0013\u0000\u00b2"+
		"\u00b3\u0003\u0012\t\u0004\u00b3\u00bd\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\n\u0002\u0000\u0000\u00b5\u00b6\u0003(\u0014\u0000\u00b6\u00b7\u0003"+
		"\u0012\t\u0003\u00b7\u00bd\u0001\u0000\u0000\u0000\u00b8\u00b9\n\u0001"+
		"\u0000\u0000\u00b9\u00ba\u0005\t\u0000\u0000\u00ba\u00bb\u0005\t\u0000"+
		"\u0000\u00bb\u00bd\u0003\u0012\t\u0002\u00bc\u00a8\u0001\u0000\u0000\u0000"+
		"\u00bc\u00ac\u0001\u0000\u0000\u0000\u00bc\u00b0\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b4\u0001\u0000\u0000\u0000\u00bc\u00b8\u0001\u0000\u0000\u0000"+
		"\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u0013\u0001\u0000\u0000\u0000"+
		"\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005$\u0000\u0000\u00c2"+
		"\u00c3\u0003\u0012\t\u0000\u00c3\u0015\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0007\u0001\u0000\u0000\u00c5\u0017\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u00058\u0000\u0000\u00c7\u0019\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"\u0007\u0000\u0000\u00c9\u00ca\u0003\u001c\u000e\u0000\u00ca\u001b\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cf\u0003.\u0017\u0000\u00cc\u00cf\u0003,\u0016"+
		"\u0000\u00cd\u00cf\u0003*\u0015\u0000\u00ce\u00cb\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cf\u001d\u0001\u0000\u0000\u0000\u00d0\u00da\u0005\u0012\u0000\u0000"+
		"\u00d1\u00d2\u0005\u0013\u0000\u0000\u00d2\u00da\u0005\u0012\u0000\u0000"+
		"\u00d3\u00d4\u0005\u0014\u0000\u0000\u00d4\u00da\u0005\u0012\u0000\u0000"+
		"\u00d5\u00d6\u0005\u0015\u0000\u0000\u00d6\u00da\u0005\u0012\u0000\u0000"+
		"\u00d7\u00d8\u0005\u0016\u0000\u0000\u00d8\u00da\u0005\u0012\u0000\u0000"+
		"\u00d9\u00d0\u0001\u0000\u0000\u0000\u00d9\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d9\u00d3\u0001\u0000\u0000\u0000\u00d9\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u001f\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0006\u0010\uffff\uffff\u0000\u00dc\u00e1\u00038\u001c\u0000"+
		"\u00dd\u00e1\u0003:\u001d\u0000\u00de\u00e1\u0003<\u001e\u0000\u00df\u00e1"+
		"\u0003>\u001f\u0000\u00e0\u00db\u0001\u0000\u0000\u0000\u00e0\u00dd\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00df\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e9\u0001\u0000\u0000\u0000\u00e2\u00e3\n\u0001"+
		"\u0000\u0000\u00e3\u00e4\u0005\u0003\u0000\u0000\u00e4\u00e5\u0003\u0012"+
		"\t\u0000\u00e5\u00e6\u0005\u0004\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e2\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea!\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0007\u0002\u0000\u0000\u00ed#\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0007\u0003\u0000\u0000\u00ef%\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0007\u0004\u0000\u0000\u00f1\'\u0001\u0000\u0000\u0000\u00f2\u00f3\u0007"+
		"\u0005\u0000\u0000\u00f3)\u0001\u0000\u0000\u0000\u00f4\u00f5\u00055\u0000"+
		"\u0000\u00f5\u00f6\u0005\u0003\u0000\u0000\u00f6\u00f7\u00036\u001b\u0000"+
		"\u00f7\u00f8\u0005\u0004\u0000\u0000\u00f8+\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fc\u00030\u0018\u0000\u00fa\u00fc\u00032\u0019\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc-\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0007\u0006\u0000\u0000\u00fe/\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u00053\u0000\u0000\u0100\u0101\u0005\u0003\u0000\u0000"+
		"\u0101\u0102\u00036\u001b\u0000\u0102\u0103\u0005\u0004\u0000\u0000\u0103"+
		"1\u0001\u0000\u0000\u0000\u0104\u0105\u00054\u0000\u0000\u0105\u0106\u0005"+
		"\u0003\u0000\u0000\u0106\u0107\u00034\u001a\u0000\u0107\u0108\u0005\b"+
		"\u0000\u0000\u0108\u0109\u00036\u001b\u0000\u0109\u010a\u0005\u0004\u0000"+
		"\u0000\u010a3\u0001\u0000\u0000\u0000\u010b\u010c\u0003\u001c\u000e\u0000"+
		"\u010c5\u0001\u0000\u0000\u0000\u010d\u010e\u0003\u001c\u000e\u0000\u010e"+
		"7\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u0001\u0000\u0000\u0110\u0111"+
		"\u0003\u0012\t\u0000\u0111\u0112\u0005\u0002\u0000\u0000\u01129\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0005\f\u0000\u0000\u0114\u0118\u0003\u0012"+
		"\t\u0000\u0115\u0116\u0005\u0014\u0000\u0000\u0116\u0118\u0003\u0012\t"+
		"\u0000\u0117\u0113\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000"+
		"\u0000\u0118;\u0001\u0000\u0000\u0000\u0119\u011a\u0003^/\u0000\u011a"+
		"\u0123\u0005\u0001\u0000\u0000\u011b\u0120\u0003\u0012\t\u0000\u011c\u011d"+
		"\u0005\b\u0000\u0000\u011d\u011f\u0003\u0012\t\u0000\u011e\u011c\u0001"+
		"\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0124\u0001"+
		"\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u011b\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0005\u0002\u0000\u0000\u0126=\u0001\u0000"+
		"\u0000\u0000\u0127\u012e\u0003@ \u0000\u0128\u012e\u0003B!\u0000\u0129"+
		"\u012e\u0003D\"\u0000\u012a\u012e\u0003F#\u0000\u012b\u012e\u0003H$\u0000"+
		"\u012c\u012e\u0003J%\u0000\u012d\u0127\u0001\u0000\u0000\u0000\u012d\u0128"+
		"\u0001\u0000\u0000\u0000\u012d\u0129\u0001\u0000\u0000\u0000\u012d\u012a"+
		"\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012c"+
		"\u0001\u0000\u0000\u0000\u012e?\u0001\u0000\u0000\u0000\u012f\u0130\u0005"+
		"/\u0000\u0000\u0130A\u0001\u0000\u0000\u0000\u0131\u0132\u0007\u0007\u0000"+
		"\u0000\u0132C\u0001\u0000\u0000\u0000\u0133\u0136\u0003L&\u0000\u0134"+
		"\u0136\u0003N\'\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0134"+
		"\u0001\u0000\u0000\u0000\u0136E\u0001\u0000\u0000\u0000\u0137\u0138\u0005"+
		",\u0000\u0000\u0138G\u0001\u0000\u0000\u0000\u0139\u013a\u0003\u0018\f"+
		"\u0000\u013aI\u0001\u0000\u0000\u0000\u013b\u013c\u0007\b\u0000\u0000"+
		"\u013cK\u0001\u0000\u0000\u0000\u013d\u0146\u0005\u0003\u0000\u0000\u013e"+
		"\u0143\u0003\u0012\t\u0000\u013f\u0140\u0005\b\u0000\u0000\u0140\u0142"+
		"\u0003\u0012\t\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0145\u0001"+
		"\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001"+
		"\u0000\u0000\u0000\u0146\u013e\u0001\u0000\u0000\u0000\u0146\u0147\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149\u0005"+
		"\u0004\u0000\u0000\u0149M\u0001\u0000\u0000\u0000\u014a\u0153\u0005\u0005"+
		"\u0000\u0000\u014b\u0150\u0003P(\u0000\u014c\u014d\u0005\b\u0000\u0000"+
		"\u014d\u014f\u0003P(\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0152"+
		"\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0150"+
		"\u0001\u0000\u0000\u0000\u0153\u014b\u0001\u0000\u0000\u0000\u0153\u0154"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0156"+
		"\u0005\u0006\u0000\u0000\u0156O\u0001\u0000\u0000\u0000\u0157\u0158\u0003"+
		"R)\u0000\u0158\u0159\u0005\u0007\u0000\u0000\u0159\u015a\u0003T*\u0000"+
		"\u015aQ\u0001\u0000\u0000\u0000\u015b\u015c\u0003\u0012\t\u0000\u015c"+
		"S\u0001\u0000\u0000\u0000\u015d\u015e\u0003\u0012\t\u0000\u015eU\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0005\u001c\u0000\u0000\u0160\u0161\u0003"+
		"\u0012\t\u0000\u0161\u0162\u0005\u0007\u0000\u0000\u0162\u0164\u0003\u0002"+
		"\u0001\u0000\u0163\u0165\u0003j5\u0000\u0164\u0163\u0001\u0000\u0000\u0000"+
		"\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000"+
		"\u0166\u0167\u0005!\u0000\u0000\u0167\u0175\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0005\u001c\u0000\u0000\u0169\u016a\u0003\u0012\t\u0000\u016a\u016b"+
		"\u0005\u0007\u0000\u0000\u016b\u016d\u0003\u0002\u0001\u0000\u016c\u016e"+
		"\u0003h4\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000"+
		"\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u0003j5\u0000"+
		"\u0172\u0173\u0005!\u0000\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174"+
		"\u015f\u0001\u0000\u0000\u0000\u0174\u0168\u0001\u0000\u0000\u0000\u0175"+
		"W\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u001f\u0000\u0000\u0177\u0178"+
		"\u0003\u0012\t\u0000\u0178\u0179\u0005\u0007\u0000\u0000\u0179\u017b\u0003"+
		"\u0002\u0001\u0000\u017a\u017c\u0003j5\u0000\u017b\u017a\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0005!\u0000\u0000\u017eY\u0001\u0000\u0000\u0000\u017f"+
		"\u0180\u0003f3\u0000\u0180\u0182\u0003\u0002\u0001\u0000\u0181\u0183\u0003"+
		"j5\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0185\u0005!\u0000\u0000"+
		"\u0185[\u0001\u0000\u0000\u0000\u0186\u0187\u0005\u001b\u0000\u0000\u0187"+
		"\u0188\u0003^/\u0000\u0188\u0189\u0005\u0001\u0000\u0000\u0189\u018a\u0003"+
		"`0\u0000\u018a\u018c\u0005\u0002\u0000\u0000\u018b\u018d\u0003d2\u0000"+
		"\u018c\u018b\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0005\u0007\u0000\u0000"+
		"\u018f\u0190\u0003\u0002\u0001\u0000\u0190\u0191\u0005!\u0000\u0000\u0191"+
		"]\u0001\u0000\u0000\u0000\u0192\u0193\u00058\u0000\u0000\u0193_\u0001"+
		"\u0000\u0000\u0000\u0194\u0199\u0003b1\u0000\u0195\u0196\u0005\b\u0000"+
		"\u0000\u0196\u0198\u0003b1\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198"+
		"\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199"+
		"\u019a\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000\u0000\u0000\u019b"+
		"\u0199\u0001\u0000\u0000\u0000\u019c\u0194\u0001\u0000\u0000\u0000\u019c"+
		"\u019d\u0001\u0000\u0000\u0000\u019da\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0003\u0018\f\u0000\u019f\u01a0\u0005\u0007\u0000\u0000\u01a0\u01a1\u0003"+
		"\u001c\u000e\u0000\u01a1c\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005\u0018"+
		"\u0000\u0000\u01a3\u01a4\u0003\u001c\u000e\u0000\u01a4e\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a6\u0005 \u0000\u0000\u01a6\u01a9\u0003\u0018\f\u0000"+
		"\u01a7\u01a8\u0005\u0007\u0000\u0000\u01a8\u01aa\u0003\u001c\u000e\u0000"+
		"\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005\u0011\u0000\u0000"+
		"\u01ac\u01ad\u0003\u0012\t\u0000\u01ad\u01ae\u0005\u0007\u0000\u0000\u01ae"+
		"g\u0001\u0000\u0000\u0000\u01af\u01b0\u0005\u001d\u0000\u0000\u01b0\u01b1"+
		"\u0003\u0012\t\u0000\u01b1\u01b2\u0005\u0007\u0000\u0000\u01b2\u01b3\u0003"+
		"\u0002\u0001\u0000\u01b3i\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005\u001e"+
		"\u0000\u0000\u01b5\u01b6\u0005\u0007\u0000\u0000\u01b6\u01b7\u0003\u0002"+
		"\u0001\u0000\u01b7k\u0001\u0000\u0000\u0000#psz~\u0082\u0089\u008f\u0094"+
		"\u009b\u009f\u00bc\u00be\u00ce\u00d9\u00e0\u00e9\u00fb\u0117\u0120\u0123"+
		"\u012d\u0135\u0143\u0146\u0150\u0153\u0164\u016f\u0174\u017b\u0182\u018c"+
		"\u0199\u019c\u01a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}