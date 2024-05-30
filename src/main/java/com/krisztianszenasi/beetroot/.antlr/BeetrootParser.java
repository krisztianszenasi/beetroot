// Generated from /Users/krisztianszenasi/git/bme/msc/semester1/Beetroot3/src/main/java/com/krisztianszenasi/beetroot/Beetroot.g4 by ANTLR 4.13.1
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
		RULE_unaryOperator = 32, RULE_stringLiteral = 33, RULE_numberLiteral = 34, 
		RULE_collectionLiteral = 35, RULE_noneLiteral = 36, RULE_variableReference = 37, 
		RULE_boolLiteral = 38, RULE_listLiteral = 39, RULE_dictLiteral = 40, RULE_dictElement = 41, 
		RULE_key = 42, RULE_value = 43, RULE_ifStatement = 44, RULE_whileStatement = 45, 
		RULE_forStatement = 46, RULE_functionDefinition = 47, RULE_functionName = 48, 
		RULE_functionParameters = 49, RULE_functionParameter = 50, RULE_functionReturnType = 51, 
		RULE_forHeader = 52, RULE_elifBlock = 53, RULE_elseBlock = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "block", "statement", "simpleStatement", "compoundStatement", 
			"newline", "flowControl", "variableDeclaration", "assignmentStatement", 
			"expression", "returnStatement", "mutability", "variableName", "declarationType", 
			"type", "assignment", "primary", "addSubOp", "mulDivOp", "compairOp", 
			"logicalOp", "rangeType", "collectionType", "primitiveType", "listType", 
			"dictType", "keyType", "valueType", "parenthesizedExpression", "unaryExpression", 
			"functionCall", "literalExpression", "unaryOperator", "stringLiteral", 
			"numberLiteral", "collectionLiteral", "noneLiteral", "variableReference", 
			"boolLiteral", "listLiteral", "dictLiteral", "dictElement", "key", "value", 
			"ifStatement", "whileStatement", "forStatement", "functionDefinition", 
			"functionName", "functionParameters", "functionParameter", "functionReturnType", 
			"forHeader", "elifBlock", "elseBlock"
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
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			block();
			setState(111);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(113);
				newline();
				}
				break;
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 73166441181351978L) != 0)) {
				{
				setState(116);
				statement();
				}
			}

			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					newline();
					setState(120);
					statement();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(127);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case LBRACKET:
			case LCURLY:
			case NEG:
			case PLUS:
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
				setState(130);
				simpleStatement();
				}
				break;
			case FUN:
			case IF:
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
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
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simpleStatement);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				assignmentStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
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
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compoundStatement);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				forStatement();
				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
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
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_newline);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(147);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(150); 
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
	}

	public final FlowControlContext flowControl() throws RecognitionException {
		FlowControlContext _localctx = new FlowControlContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_flowControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
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
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			mutability();
			setState(155);
			variableName();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(156);
				declarationType();
				}
			}

			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(159);
				match(ASSIGN);
				setState(160);
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
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			primary(0);
			setState(164);
			assignment();
			setState(165);
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

			setState(168);
			primary(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(171);
						mulDivOp();
						setState(172);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(175);
						addSubOp();
						setState(176);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new CompairExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(179);
						compairOp();
						setState(180);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(182);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(183);
						logicalOp();
						setState(184);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(187);
						match(DOT);
						setState(188);
						match(DOT);
						setState(189);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(194);
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
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(RETURN);
			setState(196);
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
	}

	public final MutabilityContext mutability() throws RecognitionException {
		MutabilityContext _localctx = new MutabilityContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
	}

	public final DeclarationTypeContext declarationType() throws RecognitionException {
		DeclarationTypeContext _localctx = new DeclarationTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declarationType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(COLON);
			setState(203);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		try {
			setState(208);
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
				setState(205);
				primitiveType();
				}
				break;
			case LIST_T:
			case DICT_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				collectionType();
				}
				break;
			case RANGE_T:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(ASSIGN);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(PLUS);
				setState(212);
				match(ASSIGN);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(MINUS);
				setState(214);
				match(ASSIGN);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(MUL);
				setState(216);
				match(ASSIGN);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				match(DIV);
				setState(218);
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
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(222);
				parenthesizedExpression();
				}
				break;
			case 2:
				{
				setState(223);
				unaryExpression();
				}
				break;
			case 3:
				{
				setState(224);
				functionCall();
				}
				break;
			case 4:
				{
				setState(225);
				literalExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
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
					setState(228);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(229);
					match(LBRACKET);
					setState(230);
					expression(0);
					setState(231);
					match(RBRACKET);
					}
					} 
				}
				setState(237);
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
	}

	public final AddSubOpContext addSubOp() throws RecognitionException {
		AddSubOpContext _localctx = new AddSubOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addSubOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
	}

	public final MulDivOpContext mulDivOp() throws RecognitionException {
		MulDivOpContext _localctx = new MulDivOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mulDivOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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
	}

	public final CompairOpContext compairOp() throws RecognitionException {
		CompairOpContext _localctx = new CompairOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_compairOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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
	}

	public final LogicalOpContext logicalOp() throws RecognitionException {
		LogicalOpContext _localctx = new LogicalOpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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
	}

	public final RangeTypeContext rangeType() throws RecognitionException {
		RangeTypeContext _localctx = new RangeTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rangeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(RANGE_T);
			setState(247);
			match(LBRACKET);
			setState(248);
			valueType();
			setState(249);
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
	}

	public final CollectionTypeContext collectionType() throws RecognitionException {
		CollectionTypeContext _localctx = new CollectionTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_collectionType);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST_T:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				listType();
				}
				break;
			case DICT_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
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
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(LIST_T);
			setState(258);
			match(LBRACKET);
			setState(259);
			valueType();
			setState(260);
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
	}

	public final DictTypeContext dictType() throws RecognitionException {
		DictTypeContext _localctx = new DictTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dictType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(DICT_T);
			setState(263);
			match(LBRACKET);
			setState(264);
			keyType();
			setState(265);
			match(COMMA);
			setState(266);
			valueType();
			setState(267);
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
	}

	public final KeyTypeContext keyType() throws RecognitionException {
		KeyTypeContext _localctx = new KeyTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_keyType);
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
	}

	public final ValueTypeContext valueType() throws RecognitionException {
		ValueTypeContext _localctx = new ValueTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_valueType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(LPAREN);
			setState(274);
			expression(0);
			setState(275);
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
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_unaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			unaryOperator();
			setState(278);
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
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			functionName();
			setState(281);
			match(LPAREN);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 73165901760303146L) != 0)) {
				{
				setState(282);
				expression(0);
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(283);
					match(COMMA);
					setState(284);
					expression(0);
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(292);
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
	}

	public final LiteralExpressionContext literalExpression() throws RecognitionException {
		LiteralExpressionContext _localctx = new LiteralExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_literalExpression);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				stringLiteral();
				}
				break;
			case INT_LIT:
			case DEC_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				numberLiteral();
				}
				break;
			case LBRACKET:
			case LCURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				collectionLiteral();
				}
				break;
			case NONE_LIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				noneLiteral();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(298);
				variableReference();
				}
				break;
			case TRUE_LIT:
			case FALSE_LIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(299);
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
	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode NEG() { return getToken(BeetrootParser.NEG, 0); }
		public TerminalNode MINUS() { return getToken(BeetrootParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(BeetrootParser.PLUS, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BeetrootListener ) ((BeetrootListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1576960L) != 0)) ) {
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
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
	}

	public final CollectionLiteralContext collectionLiteral() throws RecognitionException {
		CollectionLiteralContext _localctx = new CollectionLiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_collectionLiteral);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				listLiteral();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
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
	}

	public final NoneLiteralContext noneLiteral() throws RecognitionException {
		NoneLiteralContext _localctx = new NoneLiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_noneLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
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
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
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
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
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
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
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
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_listLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(LBRACKET);
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(319);
				newline();
				}
				break;
			}
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 73165901760303146L) != 0)) {
				{
				setState(322);
				expression(0);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(323);
					match(COMMA);
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(324);
						newline();
						}
					}

					setState(327);
					expression(0);
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(335);
				newline();
				}
			}

			setState(338);
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
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
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
	}

	public final DictLiteralContext dictLiteral() throws RecognitionException {
		DictLiteralContext _localctx = new DictLiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dictLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(LCURLY);
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(341);
				newline();
				}
				break;
			}
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 73165901760303146L) != 0)) {
				{
				setState(344);
				dictElement();
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(345);
					match(COMMA);
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(346);
						newline();
						}
					}

					setState(349);
					dictElement();
					}
					}
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(357);
				newline();
				}
			}

			setState(360);
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
	}

	public final DictElementContext dictElement() throws RecognitionException {
		DictElementContext _localctx = new DictElementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dictElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			key();
			setState(363);
			match(COLON);
			setState(364);
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
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ifStatement);
		int _la;
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(IF);
				setState(371);
				expression(0);
				setState(372);
				match(COLON);
				setState(373);
				block();
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(374);
					elseBlock();
					}
				}

				setState(377);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(IF);
				setState(380);
				expression(0);
				setState(381);
				match(COLON);
				setState(382);
				block();
				setState(384); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(383);
					elifBlock();
					}
					}
					setState(386); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ELIF );
				setState(388);
				elseBlock();
				setState(389);
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
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(WHILE);
			setState(394);
			expression(0);
			setState(395);
			match(COLON);
			setState(396);
			block();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(397);
				elseBlock();
				}
			}

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
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			forHeader();
			setState(403);
			block();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(404);
				elseBlock();
				}
			}

			setState(407);
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
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(FUN);
			setState(410);
			functionName();
			setState(411);
			match(LPAREN);
			setState(412);
			functionParameters();
			setState(413);
			match(RPARAEN);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(414);
				functionReturnType();
				}
			}

			setState(417);
			match(COLON);
			setState(418);
			block();
			setState(419);
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
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
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
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(423);
				functionParameter();
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(424);
					match(COMMA);
					setState(425);
					functionParameter();
					}
					}
					setState(430);
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
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_functionParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			variableName();
			setState(434);
			match(COLON);
			setState(435);
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
	}

	public final FunctionReturnTypeContext functionReturnType() throws RecognitionException {
		FunctionReturnTypeContext _localctx = new FunctionReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_functionReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(ARROW);
			setState(438);
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
	}

	public final ForHeaderContext forHeader() throws RecognitionException {
		ForHeaderContext _localctx = new ForHeaderContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_forHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(FOR);
			setState(441);
			variableName();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(442);
				match(COLON);
				setState(443);
				type();
				}
			}

			setState(446);
			match(IN);
			setState(447);
			expression(0);
			setState(448);
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
	}

	public final ElifBlockContext elifBlock() throws RecognitionException {
		ElifBlockContext _localctx = new ElifBlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_elifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(ELIF);
			setState(451);
			expression(0);
			setState(452);
			match(COLON);
			setState(453);
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
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(ELSE);
			setState(456);
			match(COLON);
			setState(457);
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
		"\u0004\u00019\u01cc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001s\b\u0001\u0001"+
		"\u0001\u0003\u0001v\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001{\b\u0001\n\u0001\f\u0001~\t\u0001\u0001\u0001\u0003\u0001\u0081"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u0085\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008c\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0092\b\u0004"+
		"\u0001\u0005\u0004\u0005\u0095\b\u0005\u000b\u0005\f\u0005\u0096\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009e"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a2\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00bf"+
		"\b\t\n\t\f\t\u00c2\t\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00d1\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00dc\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00e3\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u00ea\b\u0010\n\u0010\f\u0010\u00ed\t\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u00fe\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u011e\b\u001e\n\u001e\f\u001e\u0121\t\u001e\u0003\u001e\u0123\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u012d\b\u001f\u0001 \u0001 \u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0003#\u0137\b#\u0001$\u0001$\u0001"+
		"%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0003\'\u0141\b\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u0146\b\'\u0001\'\u0005\'\u0149\b\'\n\'\f\'\u014c\t"+
		"\'\u0003\'\u014e\b\'\u0001\'\u0003\'\u0151\b\'\u0001\'\u0001\'\u0001("+
		"\u0001(\u0003(\u0157\b(\u0001(\u0001(\u0001(\u0003(\u015c\b(\u0001(\u0005"+
		"(\u015f\b(\n(\f(\u0162\t(\u0003(\u0164\b(\u0001(\u0003(\u0167\b(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0003,\u0178\b,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0004,\u0181\b,\u000b,\f,\u0182\u0001,\u0001,\u0001"+
		",\u0003,\u0188\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u018f\b-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0003.\u0196\b.\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0003/\u01a0\b/\u0001/\u0001/\u0001/\u0001"+
		"/\u00010\u00010\u00011\u00011\u00011\u00051\u01ab\b1\n1\f1\u01ae\t1\u0003"+
		"1\u01b0\b1\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00014\u0001"+
		"4\u00014\u00014\u00034\u01bd\b4\u00014\u00014\u00014\u00014\u00015\u0001"+
		"5\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u0000\u0002"+
		"\u0012 7\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjl\u0000\n\u0001"+
		"\u0000%&\u0001\u0000\"#\u0001\u0000\u0013\u0014\u0001\u0000\u0015\u0017"+
		"\u0002\u0000\n\u000b\r\u0011\u0001\u0000\u0019\u001a\u0001\u0000\',\u0002"+
		"\u0000\f\f\u0013\u0014\u0001\u0000-.\u0001\u000001\u01ce\u0000n\u0001"+
		"\u0000\u0000\u0000\u0002r\u0001\u0000\u0000\u0000\u0004\u0084\u0001\u0000"+
		"\u0000\u0000\u0006\u008b\u0001\u0000\u0000\u0000\b\u0091\u0001\u0000\u0000"+
		"\u0000\n\u0094\u0001\u0000\u0000\u0000\f\u0098\u0001\u0000\u0000\u0000"+
		"\u000e\u009a\u0001\u0000\u0000\u0000\u0010\u00a3\u0001\u0000\u0000\u0000"+
		"\u0012\u00a7\u0001\u0000\u0000\u0000\u0014\u00c3\u0001\u0000\u0000\u0000"+
		"\u0016\u00c6\u0001\u0000\u0000\u0000\u0018\u00c8\u0001\u0000\u0000\u0000"+
		"\u001a\u00ca\u0001\u0000\u0000\u0000\u001c\u00d0\u0001\u0000\u0000\u0000"+
		"\u001e\u00db\u0001\u0000\u0000\u0000 \u00e2\u0001\u0000\u0000\u0000\""+
		"\u00ee\u0001\u0000\u0000\u0000$\u00f0\u0001\u0000\u0000\u0000&\u00f2\u0001"+
		"\u0000\u0000\u0000(\u00f4\u0001\u0000\u0000\u0000*\u00f6\u0001\u0000\u0000"+
		"\u0000,\u00fd\u0001\u0000\u0000\u0000.\u00ff\u0001\u0000\u0000\u00000"+
		"\u0101\u0001\u0000\u0000\u00002\u0106\u0001\u0000\u0000\u00004\u010d\u0001"+
		"\u0000\u0000\u00006\u010f\u0001\u0000\u0000\u00008\u0111\u0001\u0000\u0000"+
		"\u0000:\u0115\u0001\u0000\u0000\u0000<\u0118\u0001\u0000\u0000\u0000>"+
		"\u012c\u0001\u0000\u0000\u0000@\u012e\u0001\u0000\u0000\u0000B\u0130\u0001"+
		"\u0000\u0000\u0000D\u0132\u0001\u0000\u0000\u0000F\u0136\u0001\u0000\u0000"+
		"\u0000H\u0138\u0001\u0000\u0000\u0000J\u013a\u0001\u0000\u0000\u0000L"+
		"\u013c\u0001\u0000\u0000\u0000N\u013e\u0001\u0000\u0000\u0000P\u0154\u0001"+
		"\u0000\u0000\u0000R\u016a\u0001\u0000\u0000\u0000T\u016e\u0001\u0000\u0000"+
		"\u0000V\u0170\u0001\u0000\u0000\u0000X\u0187\u0001\u0000\u0000\u0000Z"+
		"\u0189\u0001\u0000\u0000\u0000\\\u0192\u0001\u0000\u0000\u0000^\u0199"+
		"\u0001\u0000\u0000\u0000`\u01a5\u0001\u0000\u0000\u0000b\u01af\u0001\u0000"+
		"\u0000\u0000d\u01b1\u0001\u0000\u0000\u0000f\u01b5\u0001\u0000\u0000\u0000"+
		"h\u01b8\u0001\u0000\u0000\u0000j\u01c2\u0001\u0000\u0000\u0000l\u01c7"+
		"\u0001\u0000\u0000\u0000no\u0003\u0002\u0001\u0000op\u0005\u0000\u0000"+
		"\u0001p\u0001\u0001\u0000\u0000\u0000qs\u0003\n\u0005\u0000rq\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tv\u0003"+
		"\u0004\u0002\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"v|\u0001\u0000\u0000\u0000wx\u0003\n\u0005\u0000xy\u0003\u0004\u0002\u0000"+
		"y{\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000"+
		"\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0081\u0003\n\u0005"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0003\u0001\u0000\u0000\u0000\u0082\u0085\u0003\u0006\u0003"+
		"\u0000\u0083\u0085\u0003\b\u0004\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0005\u0001\u0000\u0000\u0000"+
		"\u0086\u008c\u0003\u000e\u0007\u0000\u0087\u008c\u0003\u0010\b\u0000\u0088"+
		"\u008c\u0003\u0012\t\u0000\u0089\u008c\u0003\u0014\n\u0000\u008a\u008c"+
		"\u0003\f\u0006\u0000\u008b\u0086\u0001\u0000\u0000\u0000\u008b\u0087\u0001"+
		"\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u0007\u0001"+
		"\u0000\u0000\u0000\u008d\u0092\u0003X,\u0000\u008e\u0092\u0003Z-\u0000"+
		"\u008f\u0092\u0003\\.\u0000\u0090\u0092\u0003^/\u0000\u0091\u008d\u0001"+
		"\u0000\u0000\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\t\u0001\u0000"+
		"\u0000\u0000\u0093\u0095\u00056\u0000\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u000b\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0007\u0000\u0000\u0000\u0099\r\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0003\u0016\u000b\u0000\u009b\u009d\u0003\u0018\f\u0000\u009c"+
		"\u009e\u0003\u001a\r\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0005\u0012\u0000\u0000\u00a0\u00a2\u0003\u0012\t\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u000f\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0003 \u0010\u0000\u00a4\u00a5\u0003\u001e"+
		"\u000f\u0000\u00a5\u00a6\u0003\u0012\t\u0000\u00a6\u0011\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0006\t\uffff\uffff\u0000\u00a8\u00a9\u0003 \u0010"+
		"\u0000\u00a9\u00c0\u0001\u0000\u0000\u0000\u00aa\u00ab\n\u0005\u0000\u0000"+
		"\u00ab\u00ac\u0003$\u0012\u0000\u00ac\u00ad\u0003\u0012\t\u0006\u00ad"+
		"\u00bf\u0001\u0000\u0000\u0000\u00ae\u00af\n\u0004\u0000\u0000\u00af\u00b0"+
		"\u0003\"\u0011\u0000\u00b0\u00b1\u0003\u0012\t\u0005\u00b1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\n\u0003\u0000\u0000\u00b3\u00b4\u0003&"+
		"\u0013\u0000\u00b4\u00b5\u0003\u0012\t\u0004\u00b5\u00bf\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\n\u0002\u0000\u0000\u00b7\u00b8\u0003(\u0014\u0000"+
		"\u00b8\u00b9\u0003\u0012\t\u0003\u00b9\u00bf\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\n\u0001\u0000\u0000\u00bb\u00bc\u0005\t\u0000\u0000\u00bc\u00bd"+
		"\u0005\t\u0000\u0000\u00bd\u00bf\u0003\u0012\t\u0002\u00be\u00aa\u0001"+
		"\u0000\u0000\u0000\u00be\u00ae\u0001\u0000\u0000\u0000\u00be\u00b2\u0001"+
		"\u0000\u0000\u0000\u00be\u00b6\u0001\u0000\u0000\u0000\u00be\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u0013\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005"+
		"$\u0000\u0000\u00c4\u00c5\u0003\u0012\t\u0000\u00c5\u0015\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0007\u0001\u0000\u0000\u00c7\u0017\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u00058\u0000\u0000\u00c9\u0019\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0005\u0007\u0000\u0000\u00cb\u00cc\u0003\u001c\u000e"+
		"\u0000\u00cc\u001b\u0001\u0000\u0000\u0000\u00cd\u00d1\u0003.\u0017\u0000"+
		"\u00ce\u00d1\u0003,\u0016\u0000\u00cf\u00d1\u0003*\u0015\u0000\u00d0\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d1\u001d\u0001\u0000\u0000\u0000\u00d2\u00dc"+
		"\u0005\u0012\u0000\u0000\u00d3\u00d4\u0005\u0013\u0000\u0000\u00d4\u00dc"+
		"\u0005\u0012\u0000\u0000\u00d5\u00d6\u0005\u0014\u0000\u0000\u00d6\u00dc"+
		"\u0005\u0012\u0000\u0000\u00d7\u00d8\u0005\u0015\u0000\u0000\u00d8\u00dc"+
		"\u0005\u0012\u0000\u0000\u00d9\u00da\u0005\u0016\u0000\u0000\u00da\u00dc"+
		"\u0005\u0012\u0000\u0000\u00db\u00d2\u0001\u0000\u0000\u0000\u00db\u00d3"+
		"\u0001\u0000\u0000\u0000\u00db\u00d5\u0001\u0000\u0000\u0000\u00db\u00d7"+
		"\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u001f"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0006\u0010\uffff\uffff\u0000\u00de"+
		"\u00e3\u00038\u001c\u0000\u00df\u00e3\u0003:\u001d\u0000\u00e0\u00e3\u0003"+
		"<\u001e\u0000\u00e1\u00e3\u0003>\u001f\u0000\u00e2\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e2\u00df\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00eb\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\n\u0001\u0000\u0000\u00e5\u00e6\u0005\u0003\u0000\u0000"+
		"\u00e6\u00e7\u0003\u0012\t\u0000\u00e7\u00e8\u0005\u0004\u0000\u0000\u00e8"+
		"\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e4\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ec!\u0001\u0000\u0000\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0007\u0002\u0000\u0000\u00ef#\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0007\u0003\u0000\u0000\u00f1%\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0007\u0004\u0000\u0000\u00f3\'\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0007\u0005\u0000\u0000\u00f5)\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u00055\u0000\u0000\u00f7\u00f8\u0005\u0003\u0000\u0000\u00f8"+
		"\u00f9\u00036\u001b\u0000\u00f9\u00fa\u0005\u0004\u0000\u0000\u00fa+\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fe\u00030\u0018\u0000\u00fc\u00fe\u00032\u0019"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fe-\u0001\u0000\u0000\u0000\u00ff\u0100\u0007\u0006\u0000\u0000"+
		"\u0100/\u0001\u0000\u0000\u0000\u0101\u0102\u00053\u0000\u0000\u0102\u0103"+
		"\u0005\u0003\u0000\u0000\u0103\u0104\u00036\u001b\u0000\u0104\u0105\u0005"+
		"\u0004\u0000\u0000\u01051\u0001\u0000\u0000\u0000\u0106\u0107\u00054\u0000"+
		"\u0000\u0107\u0108\u0005\u0003\u0000\u0000\u0108\u0109\u00034\u001a\u0000"+
		"\u0109\u010a\u0005\b\u0000\u0000\u010a\u010b\u00036\u001b\u0000\u010b"+
		"\u010c\u0005\u0004\u0000\u0000\u010c3\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0003\u001c\u000e\u0000\u010e5\u0001\u0000\u0000\u0000\u010f\u0110\u0003"+
		"\u001c\u000e\u0000\u01107\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0001"+
		"\u0000\u0000\u0112\u0113\u0003\u0012\t\u0000\u0113\u0114\u0005\u0002\u0000"+
		"\u0000\u01149\u0001\u0000\u0000\u0000\u0115\u0116\u0003@ \u0000\u0116"+
		"\u0117\u0003\u0012\t\u0000\u0117;\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0003`0\u0000\u0119\u0122\u0005\u0001\u0000\u0000\u011a\u011f\u0003\u0012"+
		"\t\u0000\u011b\u011c\u0005\b\u0000\u0000\u011c\u011e\u0003\u0012\t\u0000"+
		"\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000"+
		"\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000"+
		"\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000"+
		"\u0122\u011a\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u0002\u0000\u0000"+
		"\u0125=\u0001\u0000\u0000\u0000\u0126\u012d\u0003B!\u0000\u0127\u012d"+
		"\u0003D\"\u0000\u0128\u012d\u0003F#\u0000\u0129\u012d\u0003H$\u0000\u012a"+
		"\u012d\u0003J%\u0000\u012b\u012d\u0003L&\u0000\u012c\u0126\u0001\u0000"+
		"\u0000\u0000\u012c\u0127\u0001\u0000\u0000\u0000\u012c\u0128\u0001\u0000"+
		"\u0000\u0000\u012c\u0129\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000"+
		"\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012d?\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0007\u0007\u0000\u0000\u012fA\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0005/\u0000\u0000\u0131C\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0007\b\u0000\u0000\u0133E\u0001\u0000\u0000\u0000\u0134\u0137\u0003"+
		"N\'\u0000\u0135\u0137\u0003P(\u0000\u0136\u0134\u0001\u0000\u0000\u0000"+
		"\u0136\u0135\u0001\u0000\u0000\u0000\u0137G\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0005,\u0000\u0000\u0139I\u0001\u0000\u0000\u0000\u013a\u013b\u0003"+
		"\u0018\f\u0000\u013bK\u0001\u0000\u0000\u0000\u013c\u013d\u0007\t\u0000"+
		"\u0000\u013dM\u0001\u0000\u0000\u0000\u013e\u0140\u0005\u0003\u0000\u0000"+
		"\u013f\u0141\u0003\n\u0005\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0001\u0000\u0000\u0000\u0141\u014d\u0001\u0000\u0000\u0000\u0142"+
		"\u014a\u0003\u0012\t\u0000\u0143\u0145\u0005\b\u0000\u0000\u0144\u0146"+
		"\u0003\n\u0005\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0149\u0003"+
		"\u0012\t\u0000\u0148\u0143\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000"+
		"\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000"+
		"\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000"+
		"\u0000\u0000\u014d\u0142\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000"+
		"\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f\u0151\u0003\n\u0005"+
		"\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0005\u0004\u0000"+
		"\u0000\u0153O\u0001\u0000\u0000\u0000\u0154\u0156\u0005\u0005\u0000\u0000"+
		"\u0155\u0157\u0003\n\u0005\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0001\u0000\u0000\u0000\u0157\u0163\u0001\u0000\u0000\u0000\u0158"+
		"\u0160\u0003R)\u0000\u0159\u015b\u0005\b\u0000\u0000\u015a\u015c\u0003"+
		"\n\u0005\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015f\u0003R)\u0000"+
		"\u015e\u0159\u0001\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000"+
		"\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000"+
		"\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000"+
		"\u0163\u0158\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000"+
		"\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0167\u0003\n\u0005\u0000\u0166"+
		"\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u0006\u0000\u0000\u0169"+
		"Q\u0001\u0000\u0000\u0000\u016a\u016b\u0003T*\u0000\u016b\u016c\u0005"+
		"\u0007\u0000\u0000\u016c\u016d\u0003V+\u0000\u016dS\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0003\u0012\t\u0000\u016fU\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0003\u0012\t\u0000\u0171W\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0005\u001c\u0000\u0000\u0173\u0174\u0003\u0012\t\u0000\u0174\u0175"+
		"\u0005\u0007\u0000\u0000\u0175\u0177\u0003\u0002\u0001\u0000\u0176\u0178"+
		"\u0003l6\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017a\u0005!\u0000"+
		"\u0000\u017a\u0188\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u001c\u0000"+
		"\u0000\u017c\u017d\u0003\u0012\t\u0000\u017d\u017e\u0005\u0007\u0000\u0000"+
		"\u017e\u0180\u0003\u0002\u0001\u0000\u017f\u0181\u0003j5\u0000\u0180\u017f"+
		"\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0180"+
		"\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0184"+
		"\u0001\u0000\u0000\u0000\u0184\u0185\u0003l6\u0000\u0185\u0186\u0005!"+
		"\u0000\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u0172\u0001\u0000"+
		"\u0000\u0000\u0187\u017b\u0001\u0000\u0000\u0000\u0188Y\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0005\u001f\u0000\u0000\u018a\u018b\u0003\u0012\t\u0000"+
		"\u018b\u018c\u0005\u0007\u0000\u0000\u018c\u018e\u0003\u0002\u0001\u0000"+
		"\u018d\u018f\u0003l6\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\u0005!\u0000\u0000\u0191[\u0001\u0000\u0000\u0000\u0192\u0193\u0003h"+
		"4\u0000\u0193\u0195\u0003\u0002\u0001\u0000\u0194\u0196\u0003l6\u0000"+
		"\u0195\u0194\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0005!\u0000\u0000\u0198"+
		"]\u0001\u0000\u0000\u0000\u0199\u019a\u0005\u001b\u0000\u0000\u019a\u019b"+
		"\u0003`0\u0000\u019b\u019c\u0005\u0001\u0000\u0000\u019c\u019d\u0003b"+
		"1\u0000\u019d\u019f\u0005\u0002\u0000\u0000\u019e\u01a0\u0003f3\u0000"+
		"\u019f\u019e\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\u0007\u0000\u0000"+
		"\u01a2\u01a3\u0003\u0002\u0001\u0000\u01a3\u01a4\u0005!\u0000\u0000\u01a4"+
		"_\u0001\u0000\u0000\u0000\u01a5\u01a6\u00058\u0000\u0000\u01a6a\u0001"+
		"\u0000\u0000\u0000\u01a7\u01ac\u0003d2\u0000\u01a8\u01a9\u0005\b\u0000"+
		"\u0000\u01a9\u01ab\u0003d2\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ae\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000\u0000\u01ae"+
		"\u01ac\u0001\u0000\u0000\u0000\u01af\u01a7\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b0c\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0003\u0018\f\u0000\u01b2\u01b3\u0005\u0007\u0000\u0000\u01b3\u01b4\u0003"+
		"\u001c\u000e\u0000\u01b4e\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005\u0018"+
		"\u0000\u0000\u01b6\u01b7\u0003\u001c\u000e\u0000\u01b7g\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b9\u0005 \u0000\u0000\u01b9\u01bc\u0003\u0018\f\u0000"+
		"\u01ba\u01bb\u0005\u0007\u0000\u0000\u01bb\u01bd\u0003\u001c\u000e\u0000"+
		"\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000"+
		"\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01bf\u0005\u0011\u0000\u0000"+
		"\u01bf\u01c0\u0003\u0012\t\u0000\u01c0\u01c1\u0005\u0007\u0000\u0000\u01c1"+
		"i\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005\u001d\u0000\u0000\u01c3\u01c4"+
		"\u0003\u0012\t\u0000\u01c4\u01c5\u0005\u0007\u0000\u0000\u01c5\u01c6\u0003"+
		"\u0002\u0001\u0000\u01c6k\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005\u001e"+
		"\u0000\u0000\u01c8\u01c9\u0005\u0007\u0000\u0000\u01c9\u01ca\u0003\u0002"+
		"\u0001\u0000\u01cam\u0001\u0000\u0000\u0000(ru|\u0080\u0084\u008b\u0091"+
		"\u0096\u009d\u00a1\u00be\u00c0\u00d0\u00db\u00e2\u00eb\u00fd\u011f\u0122"+
		"\u012c\u0136\u0140\u0145\u014a\u014d\u0150\u0156\u015b\u0160\u0163\u0166"+
		"\u0177\u0182\u0187\u018e\u0195\u019f\u01ac\u01af\u01bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}