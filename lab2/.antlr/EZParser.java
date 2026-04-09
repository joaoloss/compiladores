// Generated from /Users/joaoloss/Documents/UFES/compiladores/lab2/EZParser.g by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EZParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, BEGIN=2, BOOL=3, ELSE=4, END=5, FALSE=6, IF=7, INT=8, PROGRAM=9, 
		READ=10, REAL=11, REPEAT=12, STRING=13, THEN=14, TRUE=15, UNTIL=16, VAR=17, 
		WRITE=18, ASSING=19, EQ=20, LT=21, PLUS=22, MINUS=23, MULT=24, DIV=25, 
		LPAREN=26, RPAREN=27, SEMI=28, COMMENT=29, ID=30, INT_VAL=31, REAL_VAL=32, 
		STRING_VAL=33;
	public static final int
		RULE_program = 0, RULE_vars_sect = 1, RULE_var_decl = 2, RULE_type_spec = 3, 
		RULE_stmt_sect = 4, RULE_stmt = 5, RULE_assign_stmt = 6, RULE_if_else_stmt = 7, 
		RULE_if_stmt = 8, RULE_repeat_stmt = 9, RULE_read_stmt = 10, RULE_write_stmt = 11, 
		RULE_expr = 12, RULE_high_op = 13, RULE_op = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "vars_sect", "var_decl", "type_spec", "stmt_sect", "stmt", 
			"assign_stmt", "if_else_stmt", "if_stmt", "repeat_stmt", "read_stmt", 
			"write_stmt", "expr", "high_op", "op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'begin'", "'bool'", "'else'", "'end'", "'false'", "'if'", 
			"'int'", "'program'", "'read'", "'real'", "'repeat'", "'string'", "'then'", 
			"'true'", "'until'", "'var'", "'write'", "':='", "'='", "'<'", "'+'", 
			"'-'", "'*'", "'/ '", "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "BEGIN", "BOOL", "ELSE", "END", "FALSE", "IF", "INT", "PROGRAM", 
			"READ", "REAL", "REPEAT", "STRING", "THEN", "TRUE", "UNTIL", "VAR", "WRITE", 
			"ASSING", "EQ", "LT", "PLUS", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", 
			"SEMI", "COMMENT", "ID", "INT_VAL", "REAL_VAL", "STRING_VAL"
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
	public String getGrammarFileName() { return "EZParser.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EZParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(EZParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(EZParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(EZParser.SEMI, 0); }
		public Vars_sectContext vars_sect() {
			return getRuleContext(Vars_sectContext.class,0);
		}
		public Stmt_sectContext stmt_sect() {
			return getRuleContext(Stmt_sectContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(PROGRAM);
			setState(31);
			match(ID);
			setState(32);
			match(SEMI);
			setState(33);
			vars_sect();
			setState(34);
			stmt_sect();
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
	public static class Vars_sectContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(EZParser.VAR, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public Vars_sectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars_sect; }
	}

	public final Vars_sectContext vars_sect() throws RecognitionException {
		Vars_sectContext _localctx = new Vars_sectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vars_sect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(VAR);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10504L) != 0)) {
				{
				{
				setState(37);
				var_decl();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class Var_declContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode ID() { return getToken(EZParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(EZParser.SEMI, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			type_spec();
			setState(44);
			match(ID);
			setState(45);
			match(SEMI);
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
	public static class Type_specContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(EZParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(EZParser.INT, 0); }
		public TerminalNode REAL() { return getToken(EZParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(EZParser.STRING, 0); }
		public Type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_spec; }
	}

	public final Type_specContext type_spec() throws RecognitionException {
		Type_specContext _localctx = new Type_specContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 10504L) != 0)) ) {
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
	public static class Stmt_sectContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(EZParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(EZParser.END, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_sectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_sect; }
	}

	public final Stmt_sectContext stmt_sect() throws RecognitionException {
		Stmt_sectContext _localctx = new Stmt_sectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt_sect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(BEGIN);
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				stmt();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1074009216L) != 0) );
			setState(55);
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
	public static class StmtContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public If_else_stmtContext if_else_stmt() {
			return getRuleContext(If_else_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Repeat_stmtContext repeat_stmt() {
			return getRuleContext(Repeat_stmtContext.class,0);
		}
		public Read_stmtContext read_stmt() {
			return getRuleContext(Read_stmtContext.class,0);
		}
		public Write_stmtContext write_stmt() {
			return getRuleContext(Write_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				assign_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				if_else_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				if_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				repeat_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				read_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				write_stmt();
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
	public static class Assign_stmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EZParser.ID, 0); }
		public TerminalNode ASSING() { return getToken(EZParser.ASSING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(EZParser.SEMI, 0); }
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ID);
			setState(66);
			match(ASSING);
			setState(67);
			expr(0);
			setState(68);
			match(SEMI);
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
	public static class If_else_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EZParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(EZParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(EZParser.ELSE, 0); }
		public TerminalNode END() { return getToken(EZParser.END, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public If_else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_stmt; }
	}

	public final If_else_stmtContext if_else_stmt() throws RecognitionException {
		If_else_stmtContext _localctx = new If_else_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_else_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IF);
			setState(71);
			expr(0);
			setState(72);
			match(THEN);
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				stmt();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1074009216L) != 0) );
			setState(78);
			match(ELSE);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				stmt();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1074009216L) != 0) );
			setState(84);
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
	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EZParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(EZParser.THEN, 0); }
		public TerminalNode END() { return getToken(EZParser.END, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(IF);
			setState(87);
			expr(0);
			setState(88);
			match(THEN);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				stmt();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1074009216L) != 0) );
			setState(94);
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
	public static class Repeat_stmtContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(EZParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(EZParser.UNTIL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Repeat_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_stmt; }
	}

	public final Repeat_stmtContext repeat_stmt() throws RecognitionException {
		Repeat_stmtContext _localctx = new Repeat_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_repeat_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(REPEAT);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				stmt();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1074009216L) != 0) );
			setState(102);
			match(UNTIL);
			setState(103);
			expr(0);
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
	public static class Read_stmtContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(EZParser.READ, 0); }
		public TerminalNode ID() { return getToken(EZParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(EZParser.SEMI, 0); }
		public Read_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stmt; }
	}

	public final Read_stmtContext read_stmt() throws RecognitionException {
		Read_stmtContext _localctx = new Read_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_read_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(READ);
			setState(106);
			match(ID);
			setState(107);
			match(SEMI);
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
	public static class Write_stmtContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(EZParser.WRITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(EZParser.SEMI, 0); }
		public Write_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stmt; }
	}

	public final Write_stmtContext write_stmt() throws RecognitionException {
		Write_stmtContext _localctx = new Write_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_write_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(WRITE);
			setState(110);
			expr(0);
			setState(111);
			match(SEMI);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EZParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(EZParser.RPAREN, 0); }
		public TerminalNode TRUE() { return getToken(EZParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(EZParser.FALSE, 0); }
		public TerminalNode INT_VAL() { return getToken(EZParser.INT_VAL, 0); }
		public TerminalNode REAL_VAL() { return getToken(EZParser.REAL_VAL, 0); }
		public TerminalNode STRING_VAL() { return getToken(EZParser.STRING_VAL, 0); }
		public TerminalNode ID() { return getToken(EZParser.ID, 0); }
		public High_opContext high_op() {
			return getRuleContext(High_opContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(114);
				match(LPAREN);
				setState(115);
				expr(0);
				setState(116);
				match(RPAREN);
				}
				break;
			case TRUE:
				{
				setState(118);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(119);
				match(FALSE);
				}
				break;
			case INT_VAL:
				{
				setState(120);
				match(INT_VAL);
				}
				break;
			case REAL_VAL:
				{
				setState(121);
				match(REAL_VAL);
				}
				break;
			case STRING_VAL:
				{
				setState(122);
				match(STRING_VAL);
				}
				break;
			case ID:
				{
				setState(123);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(127);
						high_op();
						setState(128);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(130);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(131);
						op();
						setState(132);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class High_opContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(EZParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(EZParser.DIV, 0); }
		public High_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_high_op; }
	}

	public final High_opContext high_op() throws RecognitionException {
		High_opContext _localctx = new High_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_high_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !(_la==MULT || _la==DIV) ) {
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
	public static class OpContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(EZParser.LT, 0); }
		public TerminalNode EQ() { return getToken(EZParser.EQ, 0); }
		public TerminalNode PLUS() { return getToken(EZParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(EZParser.MINUS, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001!\u0090\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\'\b\u0001\n\u0001\f\u0001*\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0004\u00044\b\u0004\u000b\u0004\f\u00045\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005@\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007K\b"+
		"\u0007\u000b\u0007\f\u0007L\u0001\u0007\u0001\u0007\u0004\u0007Q\b\u0007"+
		"\u000b\u0007\f\u0007R\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0004\b[\b\b\u000b\b\f\b\\\u0001\b\u0001\b\u0001\t\u0001\t\u0004"+
		"\tc\b\t\u000b\t\f\td\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f}\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u0087\b\f\n\f\f\f\u008a\t\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0000\u0001\u0018\u000f\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0003\u0004\u0000"+
		"\u0003\u0003\b\b\u000b\u000b\r\r\u0001\u0000\u0018\u0019\u0001\u0000\u0014"+
		"\u0017\u0093\u0000\u001e\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000"+
		"\u0000\u0004+\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000\b"+
		"1\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000\u0000\fA\u0001\u0000\u0000"+
		"\u0000\u000eF\u0001\u0000\u0000\u0000\u0010V\u0001\u0000\u0000\u0000\u0012"+
		"`\u0001\u0000\u0000\u0000\u0014i\u0001\u0000\u0000\u0000\u0016m\u0001"+
		"\u0000\u0000\u0000\u0018|\u0001\u0000\u0000\u0000\u001a\u008b\u0001\u0000"+
		"\u0000\u0000\u001c\u008d\u0001\u0000\u0000\u0000\u001e\u001f\u0005\t\u0000"+
		"\u0000\u001f \u0005\u001e\u0000\u0000 !\u0005\u001c\u0000\u0000!\"\u0003"+
		"\u0002\u0001\u0000\"#\u0003\b\u0004\u0000#\u0001\u0001\u0000\u0000\u0000"+
		"$(\u0005\u0011\u0000\u0000%\'\u0003\u0004\u0002\u0000&%\u0001\u0000\u0000"+
		"\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000"+
		"\u0000\u0000)\u0003\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"+,\u0003\u0006\u0003\u0000,-\u0005\u001e\u0000\u0000-.\u0005\u001c\u0000"+
		"\u0000.\u0005\u0001\u0000\u0000\u0000/0\u0007\u0000\u0000\u00000\u0007"+
		"\u0001\u0000\u0000\u000013\u0005\u0002\u0000\u000024\u0003\n\u0005\u0000"+
		"32\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0005\u0005"+
		"\u0000\u00008\t\u0001\u0000\u0000\u00009@\u0003\f\u0006\u0000:@\u0003"+
		"\u000e\u0007\u0000;@\u0003\u0010\b\u0000<@\u0003\u0012\t\u0000=@\u0003"+
		"\u0014\n\u0000>@\u0003\u0016\u000b\u0000?9\u0001\u0000\u0000\u0000?:\u0001"+
		"\u0000\u0000\u0000?;\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@\u000b\u0001\u0000"+
		"\u0000\u0000AB\u0005\u001e\u0000\u0000BC\u0005\u0013\u0000\u0000CD\u0003"+
		"\u0018\f\u0000DE\u0005\u001c\u0000\u0000E\r\u0001\u0000\u0000\u0000FG"+
		"\u0005\u0007\u0000\u0000GH\u0003\u0018\f\u0000HJ\u0005\u000e\u0000\u0000"+
		"IK\u0003\n\u0005\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NP\u0005\u0004\u0000\u0000OQ\u0003\n\u0005\u0000PO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0005\u0005\u0000\u0000U\u000f"+
		"\u0001\u0000\u0000\u0000VW\u0005\u0007\u0000\u0000WX\u0003\u0018\f\u0000"+
		"XZ\u0005\u000e\u0000\u0000Y[\u0003\n\u0005\u0000ZY\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0005\u0005\u0000\u0000_\u0011"+
		"\u0001\u0000\u0000\u0000`b\u0005\f\u0000\u0000ac\u0003\n\u0005\u0000b"+
		"a\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005\u0010"+
		"\u0000\u0000gh\u0003\u0018\f\u0000h\u0013\u0001\u0000\u0000\u0000ij\u0005"+
		"\n\u0000\u0000jk\u0005\u001e\u0000\u0000kl\u0005\u001c\u0000\u0000l\u0015"+
		"\u0001\u0000\u0000\u0000mn\u0005\u0012\u0000\u0000no\u0003\u0018\f\u0000"+
		"op\u0005\u001c\u0000\u0000p\u0017\u0001\u0000\u0000\u0000qr\u0006\f\uffff"+
		"\uffff\u0000rs\u0005\u001a\u0000\u0000st\u0003\u0018\f\u0000tu\u0005\u001b"+
		"\u0000\u0000u}\u0001\u0000\u0000\u0000v}\u0005\u000f\u0000\u0000w}\u0005"+
		"\u0006\u0000\u0000x}\u0005\u001f\u0000\u0000y}\u0005 \u0000\u0000z}\u0005"+
		"!\u0000\u0000{}\u0005\u001e\u0000\u0000|q\u0001\u0000\u0000\u0000|v\u0001"+
		"\u0000\u0000\u0000|w\u0001\u0000\u0000\u0000|x\u0001\u0000\u0000\u0000"+
		"|y\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000"+
		"\u0000}\u0088\u0001\u0000\u0000\u0000~\u007f\n\t\u0000\u0000\u007f\u0080"+
		"\u0003\u001a\r\u0000\u0080\u0081\u0003\u0018\f\n\u0081\u0087\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\n\b\u0000\u0000\u0083\u0084\u0003\u001c\u000e"+
		"\u0000\u0084\u0085\u0003\u0018\f\t\u0085\u0087\u0001\u0000\u0000\u0000"+
		"\u0086~\u0001\u0000\u0000\u0000\u0086\u0082\u0001\u0000\u0000\u0000\u0087"+
		"\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u0019\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0007\u0001\u0000\u0000\u008c"+
		"\u001b\u0001\u0000\u0000\u0000\u008d\u008e\u0007\u0002\u0000\u0000\u008e"+
		"\u001d\u0001\u0000\u0000\u0000\n(5?LR\\d|\u0086\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}