// $ANTLR 3.5 C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g 2013-04-25 16:13:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class LittleNicParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "BOOLEAN", "CALL", "COMMENT", 
		"DECL", "DIGIT", "FUNC", "ID", "INTEGER", "LETTER", "NEGATION", "PARAM", 
		"PROC", "STMT", "STRING", "TYPE", "VARDECL", "WS", "'!='", "'('", "')'", 
		"'*'", "'+'", "','", "'-'", "':'", "':='", "';'", "'<'", "'<='", "'=='", 
		"'>'", "'>='", "'BEGIN'", "'DO'", "'ELSE'", "'END'", "'FUNCTION'", "'IF'", 
		"'OUTPUT'", "'PROCEDURE'", "'PROGRAM'", "'THEN'", "'VAR'", "'WHILE'"
	};
	public static final int EOF=-1;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int BLOCK=4;
	public static final int BOOLEAN=5;
	public static final int CALL=6;
	public static final int COMMENT=7;
	public static final int DECL=8;
	public static final int DIGIT=9;
	public static final int FUNC=10;
	public static final int ID=11;
	public static final int INTEGER=12;
	public static final int LETTER=13;
	public static final int NEGATION=14;
	public static final int PARAM=15;
	public static final int PROC=16;
	public static final int STMT=17;
	public static final int STRING=18;
	public static final int TYPE=19;
	public static final int VARDECL=20;
	public static final int WS=21;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public LittleNicParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public LittleNicParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return LittleNicParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g"; }


	    public ErrorReporter err;
	    public void displayRecognitionError(String[] tokenNames,
	                                        RecognitionException e) {
	      String msg = getErrorMessage(e, tokenNames);
		  err.reportSyntaxError(e.line, e.charPositionInLine, msg);
	    }


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:40:1: prog : 'PROGRAM' ID ';' ( declList )? 'BEGIN' ( stmtList )? 'END' ';' EOF -> ^( ID ( declList )? ( stmtList )? ) ;
	public final LittleNicParser.prog_return prog() throws RecognitionException {
		LittleNicParser.prog_return retval = new LittleNicParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal1=null;
		Token ID2=null;
		Token char_literal3=null;
		Token string_literal5=null;
		Token string_literal7=null;
		Token char_literal8=null;
		Token EOF9=null;
		ParserRuleReturnScope declList4 =null;
		ParserRuleReturnScope stmtList6 =null;

		CommonTree string_literal1_tree=null;
		CommonTree ID2_tree=null;
		CommonTree char_literal3_tree=null;
		CommonTree string_literal5_tree=null;
		CommonTree string_literal7_tree=null;
		CommonTree char_literal8_tree=null;
		CommonTree EOF9_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_stmtList=new RewriteRuleSubtreeStream(adaptor,"rule stmtList");
		RewriteRuleSubtreeStream stream_declList=new RewriteRuleSubtreeStream(adaptor,"rule declList");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:41:2: ( 'PROGRAM' ID ';' ( declList )? 'BEGIN' ( stmtList )? 'END' ';' EOF -> ^( ID ( declList )? ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:41:4: 'PROGRAM' ID ';' ( declList )? 'BEGIN' ( stmtList )? 'END' ';' EOF
			{
			string_literal1=(Token)match(input,45,FOLLOW_45_in_prog100);  
			stream_45.add(string_literal1);

			ID2=(Token)match(input,ID,FOLLOW_ID_in_prog102);  
			stream_ID.add(ID2);

			char_literal3=(Token)match(input,31,FOLLOW_31_in_prog104);  
			stream_31.add(char_literal3);

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:42:3: ( declList )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==41||LA1_0==44||LA1_0==47) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:42:3: declList
					{
					pushFollow(FOLLOW_declList_in_prog108);
					declList4=declList();
					state._fsp--;

					stream_declList.add(declList4.getTree());
					}
					break;

			}

			string_literal5=(Token)match(input,37,FOLLOW_37_in_prog113);  
			stream_37.add(string_literal5);

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:44:3: ( stmtList )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ID||LA2_0==37||(LA2_0 >= 42 && LA2_0 <= 43)||LA2_0==48) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:44:3: stmtList
					{
					pushFollow(FOLLOW_stmtList_in_prog117);
					stmtList6=stmtList();
					state._fsp--;

					stream_stmtList.add(stmtList6.getTree());
					}
					break;

			}

			string_literal7=(Token)match(input,40,FOLLOW_40_in_prog122);  
			stream_40.add(string_literal7);

			char_literal8=(Token)match(input,31,FOLLOW_31_in_prog124);  
			stream_31.add(char_literal8);

			EOF9=(Token)match(input,EOF,FOLLOW_EOF_in_prog128);  
			stream_EOF.add(EOF9);

			// AST REWRITE
			// elements: declList, ID, stmtList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 47:3: -> ^( ID ( declList )? ( stmtList )? )
			{
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:47:6: ^( ID ( declList )? ( stmtList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:47:11: ( declList )?
				if ( stream_declList.hasNext() ) {
					adaptor.addChild(root_1, stream_declList.nextTree());
				}
				stream_declList.reset();

				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:47:21: ( stmtList )?
				if ( stream_stmtList.hasNext() ) {
					adaptor.addChild(root_1, stream_stmtList.nextTree());
				}
				stream_stmtList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class declList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declList"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:51:1: declList : decl ( ';' decl )* -> ( decl )+ ;
	public final LittleNicParser.declList_return declList() throws RecognitionException {
		LittleNicParser.declList_return retval = new LittleNicParser.declList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal11=null;
		ParserRuleReturnScope decl10 =null;
		ParserRuleReturnScope decl12 =null;

		CommonTree char_literal11_tree=null;
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:52:2: ( decl ( ';' decl )* -> ( decl )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:52:4: decl ( ';' decl )*
			{
			pushFollow(FOLLOW_decl_in_declList154);
			decl10=decl();
			state._fsp--;

			stream_decl.add(decl10.getTree());
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:52:9: ( ';' decl )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==31) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:52:10: ';' decl
					{
					char_literal11=(Token)match(input,31,FOLLOW_31_in_declList157);  
					stream_31.add(char_literal11);

					pushFollow(FOLLOW_decl_in_declList159);
					decl12=decl();
					state._fsp--;

					stream_decl.add(decl12.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			// AST REWRITE
			// elements: decl
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 53:3: -> ( decl )+
			{
				if ( !(stream_decl.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_decl.hasNext() ) {
					adaptor.addChild(root_0, stream_decl.nextTree());
				}
				stream_decl.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declList"


	public static class decl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:56:1: decl : ( varDecl | procDecl | funcDecl );
	public final LittleNicParser.decl_return decl() throws RecognitionException {
		LittleNicParser.decl_return retval = new LittleNicParser.decl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope varDecl13 =null;
		ParserRuleReturnScope procDecl14 =null;
		ParserRuleReturnScope funcDecl15 =null;


		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:57:2: ( varDecl | procDecl | funcDecl )
			int alt4=3;
			switch ( input.LA(1) ) {
			case 47:
				{
				alt4=1;
				}
				break;
			case 44:
				{
				alt4=2;
				}
				break;
			case 41:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:57:4: varDecl
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_varDecl_in_decl180);
					varDecl13=varDecl();
					state._fsp--;

					adaptor.addChild(root_0, varDecl13.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:58:4: procDecl
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_procDecl_in_decl185);
					procDecl14=procDecl();
					state._fsp--;

					adaptor.addChild(root_0, procDecl14.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:59:4: funcDecl
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_funcDecl_in_decl190);
					funcDecl15=funcDecl();
					state._fsp--;

					adaptor.addChild(root_0, funcDecl15.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decl"


	public static class varDeclList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "varDeclList"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:62:1: varDeclList : varDecl ( ';' varDecl )* -> ( varDecl )+ ;
	public final LittleNicParser.varDeclList_return varDeclList() throws RecognitionException {
		LittleNicParser.varDeclList_return retval = new LittleNicParser.varDeclList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal17=null;
		ParserRuleReturnScope varDecl16 =null;
		ParserRuleReturnScope varDecl18 =null;

		CommonTree char_literal17_tree=null;
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_varDecl=new RewriteRuleSubtreeStream(adaptor,"rule varDecl");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:63:2: ( varDecl ( ';' varDecl )* -> ( varDecl )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:63:4: varDecl ( ';' varDecl )*
			{
			pushFollow(FOLLOW_varDecl_in_varDeclList201);
			varDecl16=varDecl();
			state._fsp--;

			stream_varDecl.add(varDecl16.getTree());
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:63:12: ( ';' varDecl )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==31) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:63:13: ';' varDecl
					{
					char_literal17=(Token)match(input,31,FOLLOW_31_in_varDeclList204);  
					stream_31.add(char_literal17);

					pushFollow(FOLLOW_varDecl_in_varDeclList206);
					varDecl18=varDecl();
					state._fsp--;

					stream_varDecl.add(varDecl18.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: varDecl
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 64:3: -> ( varDecl )+
			{
				if ( !(stream_varDecl.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_varDecl.hasNext() ) {
					adaptor.addChild(root_0, stream_varDecl.nextTree());
				}
				stream_varDecl.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "varDeclList"


	public static class varDecl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "varDecl"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:67:1: varDecl : 'VAR' ID ':' TYPE -> ^( VARDECL TYPE ID ) ;
	public final LittleNicParser.varDecl_return varDecl() throws RecognitionException {
		LittleNicParser.varDecl_return retval = new LittleNicParser.varDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal19=null;
		Token ID20=null;
		Token char_literal21=null;
		Token TYPE22=null;

		CommonTree string_literal19_tree=null;
		CommonTree ID20_tree=null;
		CommonTree char_literal21_tree=null;
		CommonTree TYPE22_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:68:2: ( 'VAR' ID ':' TYPE -> ^( VARDECL TYPE ID ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:68:4: 'VAR' ID ':' TYPE
			{
			string_literal19=(Token)match(input,47,FOLLOW_47_in_varDecl226);  
			stream_47.add(string_literal19);

			ID20=(Token)match(input,ID,FOLLOW_ID_in_varDecl228);  
			stream_ID.add(ID20);

			char_literal21=(Token)match(input,29,FOLLOW_29_in_varDecl230);  
			stream_29.add(char_literal21);

			TYPE22=(Token)match(input,TYPE,FOLLOW_TYPE_in_varDecl232);  
			stream_TYPE.add(TYPE22);

			// AST REWRITE
			// elements: ID, TYPE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 69:3: -> ^( VARDECL TYPE ID )
			{
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:69:6: ^( VARDECL TYPE ID )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARDECL, "VARDECL"), root_1);
				adaptor.addChild(root_1, stream_TYPE.nextNode());
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "varDecl"


	public static class procDecl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "procDecl"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:72:1: procDecl : 'PROCEDURE' ID '(' ( paramList )? ')' ':=' ( varDeclList )? 'BEGIN' ( stmtList )? 'END' -> ^( PROC ID ( paramList )? ( varDeclList )? ( stmtList )? ) ;
	public final LittleNicParser.procDecl_return procDecl() throws RecognitionException {
		LittleNicParser.procDecl_return retval = new LittleNicParser.procDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal23=null;
		Token ID24=null;
		Token char_literal25=null;
		Token char_literal27=null;
		Token string_literal28=null;
		Token string_literal30=null;
		Token string_literal32=null;
		ParserRuleReturnScope paramList26 =null;
		ParserRuleReturnScope varDeclList29 =null;
		ParserRuleReturnScope stmtList31 =null;

		CommonTree string_literal23_tree=null;
		CommonTree ID24_tree=null;
		CommonTree char_literal25_tree=null;
		CommonTree char_literal27_tree=null;
		CommonTree string_literal28_tree=null;
		CommonTree string_literal30_tree=null;
		CommonTree string_literal32_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_stmtList=new RewriteRuleSubtreeStream(adaptor,"rule stmtList");
		RewriteRuleSubtreeStream stream_varDeclList=new RewriteRuleSubtreeStream(adaptor,"rule varDeclList");
		RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:73:2: ( 'PROCEDURE' ID '(' ( paramList )? ')' ':=' ( varDeclList )? 'BEGIN' ( stmtList )? 'END' -> ^( PROC ID ( paramList )? ( varDeclList )? ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:73:4: 'PROCEDURE' ID '(' ( paramList )? ')' ':=' ( varDeclList )? 'BEGIN' ( stmtList )? 'END'
			{
			string_literal23=(Token)match(input,44,FOLLOW_44_in_procDecl255);  
			stream_44.add(string_literal23);

			ID24=(Token)match(input,ID,FOLLOW_ID_in_procDecl257);  
			stream_ID.add(ID24);

			char_literal25=(Token)match(input,23,FOLLOW_23_in_procDecl259);  
			stream_23.add(char_literal25);

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:73:23: ( paramList )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:73:23: paramList
					{
					pushFollow(FOLLOW_paramList_in_procDecl261);
					paramList26=paramList();
					state._fsp--;

					stream_paramList.add(paramList26.getTree());
					}
					break;

			}

			char_literal27=(Token)match(input,24,FOLLOW_24_in_procDecl264);  
			stream_24.add(char_literal27);

			string_literal28=(Token)match(input,30,FOLLOW_30_in_procDecl266);  
			stream_30.add(string_literal28);

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:74:3: ( varDeclList )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==47) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:74:3: varDeclList
					{
					pushFollow(FOLLOW_varDeclList_in_procDecl270);
					varDeclList29=varDeclList();
					state._fsp--;

					stream_varDeclList.add(varDeclList29.getTree());
					}
					break;

			}

			string_literal30=(Token)match(input,37,FOLLOW_37_in_procDecl275);  
			stream_37.add(string_literal30);

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:76:3: ( stmtList )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ID||LA8_0==37||(LA8_0 >= 42 && LA8_0 <= 43)||LA8_0==48) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:76:3: stmtList
					{
					pushFollow(FOLLOW_stmtList_in_procDecl279);
					stmtList31=stmtList();
					state._fsp--;

					stream_stmtList.add(stmtList31.getTree());
					}
					break;

			}

			string_literal32=(Token)match(input,40,FOLLOW_40_in_procDecl284);  
			stream_40.add(string_literal32);

			// AST REWRITE
			// elements: stmtList, ID, varDeclList, paramList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 78:3: -> ^( PROC ID ( paramList )? ( varDeclList )? ( stmtList )? )
			{
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:78:6: ^( PROC ID ( paramList )? ( varDeclList )? ( stmtList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROC, "PROC"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:78:16: ( paramList )?
				if ( stream_paramList.hasNext() ) {
					adaptor.addChild(root_1, stream_paramList.nextTree());
				}
				stream_paramList.reset();

				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:78:27: ( varDeclList )?
				if ( stream_varDeclList.hasNext() ) {
					adaptor.addChild(root_1, stream_varDeclList.nextTree());
				}
				stream_varDeclList.reset();

				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:78:40: ( stmtList )?
				if ( stream_stmtList.hasNext() ) {
					adaptor.addChild(root_1, stream_stmtList.nextTree());
				}
				stream_stmtList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "procDecl"


	public static class funcDecl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "funcDecl"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:81:1: funcDecl : 'FUNCTION' ID '(' ( paramList )? ')' ':' TYPE ':=' ( varDeclList )? 'BEGIN' ( stmtList )? 'END' -> ^( FUNC TYPE ID ( paramList )? ( varDeclList )? ( stmtList )? ) ;
	public final LittleNicParser.funcDecl_return funcDecl() throws RecognitionException {
		LittleNicParser.funcDecl_return retval = new LittleNicParser.funcDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal33=null;
		Token ID34=null;
		Token char_literal35=null;
		Token char_literal37=null;
		Token char_literal38=null;
		Token TYPE39=null;
		Token string_literal40=null;
		Token string_literal42=null;
		Token string_literal44=null;
		ParserRuleReturnScope paramList36 =null;
		ParserRuleReturnScope varDeclList41 =null;
		ParserRuleReturnScope stmtList43 =null;

		CommonTree string_literal33_tree=null;
		CommonTree ID34_tree=null;
		CommonTree char_literal35_tree=null;
		CommonTree char_literal37_tree=null;
		CommonTree char_literal38_tree=null;
		CommonTree TYPE39_tree=null;
		CommonTree string_literal40_tree=null;
		CommonTree string_literal42_tree=null;
		CommonTree string_literal44_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_stmtList=new RewriteRuleSubtreeStream(adaptor,"rule stmtList");
		RewriteRuleSubtreeStream stream_varDeclList=new RewriteRuleSubtreeStream(adaptor,"rule varDeclList");
		RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:82:2: ( 'FUNCTION' ID '(' ( paramList )? ')' ':' TYPE ':=' ( varDeclList )? 'BEGIN' ( stmtList )? 'END' -> ^( FUNC TYPE ID ( paramList )? ( varDeclList )? ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:82:4: 'FUNCTION' ID '(' ( paramList )? ')' ':' TYPE ':=' ( varDeclList )? 'BEGIN' ( stmtList )? 'END'
			{
			string_literal33=(Token)match(input,41,FOLLOW_41_in_funcDecl315);  
			stream_41.add(string_literal33);

			ID34=(Token)match(input,ID,FOLLOW_ID_in_funcDecl317);  
			stream_ID.add(ID34);

			char_literal35=(Token)match(input,23,FOLLOW_23_in_funcDecl319);  
			stream_23.add(char_literal35);

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:82:22: ( paramList )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:82:22: paramList
					{
					pushFollow(FOLLOW_paramList_in_funcDecl321);
					paramList36=paramList();
					state._fsp--;

					stream_paramList.add(paramList36.getTree());
					}
					break;

			}

			char_literal37=(Token)match(input,24,FOLLOW_24_in_funcDecl324);  
			stream_24.add(char_literal37);

			char_literal38=(Token)match(input,29,FOLLOW_29_in_funcDecl326);  
			stream_29.add(char_literal38);

			TYPE39=(Token)match(input,TYPE,FOLLOW_TYPE_in_funcDecl328);  
			stream_TYPE.add(TYPE39);

			string_literal40=(Token)match(input,30,FOLLOW_30_in_funcDecl330);  
			stream_30.add(string_literal40);

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:83:3: ( varDeclList )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==47) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:83:3: varDeclList
					{
					pushFollow(FOLLOW_varDeclList_in_funcDecl334);
					varDeclList41=varDeclList();
					state._fsp--;

					stream_varDeclList.add(varDeclList41.getTree());
					}
					break;

			}

			string_literal42=(Token)match(input,37,FOLLOW_37_in_funcDecl339);  
			stream_37.add(string_literal42);

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:85:3: ( stmtList )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ID||LA11_0==37||(LA11_0 >= 42 && LA11_0 <= 43)||LA11_0==48) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:85:3: stmtList
					{
					pushFollow(FOLLOW_stmtList_in_funcDecl343);
					stmtList43=stmtList();
					state._fsp--;

					stream_stmtList.add(stmtList43.getTree());
					}
					break;

			}

			string_literal44=(Token)match(input,40,FOLLOW_40_in_funcDecl348);  
			stream_40.add(string_literal44);

			// AST REWRITE
			// elements: ID, varDeclList, paramList, TYPE, stmtList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 87:3: -> ^( FUNC TYPE ID ( paramList )? ( varDeclList )? ( stmtList )? )
			{
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:87:6: ^( FUNC TYPE ID ( paramList )? ( varDeclList )? ( stmtList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC, "FUNC"), root_1);
				adaptor.addChild(root_1, stream_TYPE.nextNode());
				adaptor.addChild(root_1, stream_ID.nextNode());
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:87:21: ( paramList )?
				if ( stream_paramList.hasNext() ) {
					adaptor.addChild(root_1, stream_paramList.nextTree());
				}
				stream_paramList.reset();

				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:87:32: ( varDeclList )?
				if ( stream_varDeclList.hasNext() ) {
					adaptor.addChild(root_1, stream_varDeclList.nextTree());
				}
				stream_varDeclList.reset();

				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:87:45: ( stmtList )?
				if ( stream_stmtList.hasNext() ) {
					adaptor.addChild(root_1, stream_stmtList.nextTree());
				}
				stream_stmtList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "funcDecl"


	public static class paramList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "paramList"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:91:1: paramList : param ( ',' param )* -> ( param )+ ;
	public final LittleNicParser.paramList_return paramList() throws RecognitionException {
		LittleNicParser.paramList_return retval = new LittleNicParser.paramList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal46=null;
		ParserRuleReturnScope param45 =null;
		ParserRuleReturnScope param47 =null;

		CommonTree char_literal46_tree=null;
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:92:2: ( param ( ',' param )* -> ( param )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:92:4: param ( ',' param )*
			{
			pushFollow(FOLLOW_param_in_paramList381);
			param45=param();
			state._fsp--;

			stream_param.add(param45.getTree());
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:92:10: ( ',' param )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==27) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:92:11: ',' param
					{
					char_literal46=(Token)match(input,27,FOLLOW_27_in_paramList384);  
					stream_27.add(char_literal46);

					pushFollow(FOLLOW_param_in_paramList386);
					param47=param();
					state._fsp--;

					stream_param.add(param47.getTree());
					}
					break;

				default :
					break loop12;
				}
			}

			// AST REWRITE
			// elements: param
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 93:3: -> ( param )+
			{
				if ( !(stream_param.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_param.hasNext() ) {
					adaptor.addChild(root_0, stream_param.nextTree());
				}
				stream_param.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramList"


	public static class param_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "param"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:96:1: param : ID ':' TYPE -> ^( PARAM TYPE ID ) ;
	public final LittleNicParser.param_return param() throws RecognitionException {
		LittleNicParser.param_return retval = new LittleNicParser.param_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID48=null;
		Token char_literal49=null;
		Token TYPE50=null;

		CommonTree ID48_tree=null;
		CommonTree char_literal49_tree=null;
		CommonTree TYPE50_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:97:2: ( ID ':' TYPE -> ^( PARAM TYPE ID ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:97:4: ID ':' TYPE
			{
			ID48=(Token)match(input,ID,FOLLOW_ID_in_param407);  
			stream_ID.add(ID48);

			char_literal49=(Token)match(input,29,FOLLOW_29_in_param409);  
			stream_29.add(char_literal49);

			TYPE50=(Token)match(input,TYPE,FOLLOW_TYPE_in_param411);  
			stream_TYPE.add(TYPE50);

			// AST REWRITE
			// elements: TYPE, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 98:3: -> ^( PARAM TYPE ID )
			{
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:98:6: ^( PARAM TYPE ID )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);
				adaptor.addChild(root_1, stream_TYPE.nextNode());
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param"


	public static class stmtList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stmtList"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:102:1: stmtList : stmt ( ';' stmt )* -> ( stmt )+ ;
	public final LittleNicParser.stmtList_return stmtList() throws RecognitionException {
		LittleNicParser.stmtList_return retval = new LittleNicParser.stmtList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal52=null;
		ParserRuleReturnScope stmt51 =null;
		ParserRuleReturnScope stmt53 =null;

		CommonTree char_literal52_tree=null;
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:103:2: ( stmt ( ';' stmt )* -> ( stmt )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:103:4: stmt ( ';' stmt )*
			{
			pushFollow(FOLLOW_stmt_in_stmtList435);
			stmt51=stmt();
			state._fsp--;

			stream_stmt.add(stmt51.getTree());
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:103:9: ( ';' stmt )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==31) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:103:10: ';' stmt
					{
					char_literal52=(Token)match(input,31,FOLLOW_31_in_stmtList438);  
					stream_31.add(char_literal52);

					pushFollow(FOLLOW_stmt_in_stmtList440);
					stmt53=stmt();
					state._fsp--;

					stream_stmt.add(stmt53.getTree());
					}
					break;

				default :
					break loop13;
				}
			}

			// AST REWRITE
			// elements: stmt
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 104:3: -> ( stmt )+
			{
				if ( !(stream_stmt.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_stmt.hasNext() ) {
					adaptor.addChild(root_0, stream_stmt.nextTree());
				}
				stream_stmt.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stmtList"


	public static class stmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:107:1: stmt : ( blockStmt | assignStmt | condStmt | whileStmt | callStmt | outStmt );
	public final LittleNicParser.stmt_return stmt() throws RecognitionException {
		LittleNicParser.stmt_return retval = new LittleNicParser.stmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope blockStmt54 =null;
		ParserRuleReturnScope assignStmt55 =null;
		ParserRuleReturnScope condStmt56 =null;
		ParserRuleReturnScope whileStmt57 =null;
		ParserRuleReturnScope callStmt58 =null;
		ParserRuleReturnScope outStmt59 =null;


		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:108:2: ( blockStmt | assignStmt | condStmt | whileStmt | callStmt | outStmt )
			int alt14=6;
			switch ( input.LA(1) ) {
			case 37:
				{
				alt14=1;
				}
				break;
			case ID:
				{
				int LA14_2 = input.LA(2);
				if ( (LA14_2==30) ) {
					alt14=2;
				}
				else if ( (LA14_2==23) ) {
					alt14=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 42:
				{
				alt14=3;
				}
				break;
			case 48:
				{
				alt14=4;
				}
				break;
			case 43:
				{
				alt14=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:108:4: blockStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_blockStmt_in_stmt460);
					blockStmt54=blockStmt();
					state._fsp--;

					adaptor.addChild(root_0, blockStmt54.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:109:4: assignStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_assignStmt_in_stmt465);
					assignStmt55=assignStmt();
					state._fsp--;

					adaptor.addChild(root_0, assignStmt55.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:110:4: condStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_condStmt_in_stmt470);
					condStmt56=condStmt();
					state._fsp--;

					adaptor.addChild(root_0, condStmt56.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:111:4: whileStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_whileStmt_in_stmt475);
					whileStmt57=whileStmt();
					state._fsp--;

					adaptor.addChild(root_0, whileStmt57.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:112:4: callStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_callStmt_in_stmt480);
					callStmt58=callStmt();
					state._fsp--;

					adaptor.addChild(root_0, callStmt58.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:113:4: outStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_outStmt_in_stmt485);
					outStmt59=outStmt();
					state._fsp--;

					adaptor.addChild(root_0, outStmt59.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stmt"


	public static class blockStmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "blockStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:116:1: blockStmt : 'BEGIN' ( stmtList )? 'END' -> ^( BLOCK ( stmtList )? ) ;
	public final LittleNicParser.blockStmt_return blockStmt() throws RecognitionException {
		LittleNicParser.blockStmt_return retval = new LittleNicParser.blockStmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal60=null;
		Token string_literal62=null;
		ParserRuleReturnScope stmtList61 =null;

		CommonTree string_literal60_tree=null;
		CommonTree string_literal62_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_stmtList=new RewriteRuleSubtreeStream(adaptor,"rule stmtList");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:117:2: ( 'BEGIN' ( stmtList )? 'END' -> ^( BLOCK ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:117:4: 'BEGIN' ( stmtList )? 'END'
			{
			string_literal60=(Token)match(input,37,FOLLOW_37_in_blockStmt497);  
			stream_37.add(string_literal60);

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:117:12: ( stmtList )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ID||LA15_0==37||(LA15_0 >= 42 && LA15_0 <= 43)||LA15_0==48) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:117:12: stmtList
					{
					pushFollow(FOLLOW_stmtList_in_blockStmt499);
					stmtList61=stmtList();
					state._fsp--;

					stream_stmtList.add(stmtList61.getTree());
					}
					break;

			}

			string_literal62=(Token)match(input,40,FOLLOW_40_in_blockStmt502);  
			stream_40.add(string_literal62);

			// AST REWRITE
			// elements: stmtList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 118:3: -> ^( BLOCK ( stmtList )? )
			{
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:118:6: ^( BLOCK ( stmtList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:118:14: ( stmtList )?
				if ( stream_stmtList.hasNext() ) {
					adaptor.addChild(root_1, stream_stmtList.nextTree());
				}
				stream_stmtList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "blockStmt"


	public static class assignStmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:121:1: assignStmt : ID ':=' expr -> ^( ':=' ID expr ) ;
	public final LittleNicParser.assignStmt_return assignStmt() throws RecognitionException {
		LittleNicParser.assignStmt_return retval = new LittleNicParser.assignStmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID63=null;
		Token string_literal64=null;
		ParserRuleReturnScope expr65 =null;

		CommonTree ID63_tree=null;
		CommonTree string_literal64_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:122:2: ( ID ':=' expr -> ^( ':=' ID expr ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:122:4: ID ':=' expr
			{
			ID63=(Token)match(input,ID,FOLLOW_ID_in_assignStmt525);  
			stream_ID.add(ID63);

			string_literal64=(Token)match(input,30,FOLLOW_30_in_assignStmt527);  
			stream_30.add(string_literal64);

			pushFollow(FOLLOW_expr_in_assignStmt529);
			expr65=expr();
			state._fsp--;

			stream_expr.add(expr65.getTree());
			// AST REWRITE
			// elements: 30, expr, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 123:3: -> ^( ':=' ID expr )
			{
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:123:6: ^( ':=' ID expr )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_30.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignStmt"


	public static class condStmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "condStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:126:1: condStmt : 'IF' expr 'THEN' s1= stmt 'ELSE' s2= stmt -> ^( 'IF' expr $s1 $s2) ;
	public final LittleNicParser.condStmt_return condStmt() throws RecognitionException {
		LittleNicParser.condStmt_return retval = new LittleNicParser.condStmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal66=null;
		Token string_literal68=null;
		Token string_literal69=null;
		ParserRuleReturnScope s1 =null;
		ParserRuleReturnScope s2 =null;
		ParserRuleReturnScope expr67 =null;

		CommonTree string_literal66_tree=null;
		CommonTree string_literal68_tree=null;
		CommonTree string_literal69_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:127:2: ( 'IF' expr 'THEN' s1= stmt 'ELSE' s2= stmt -> ^( 'IF' expr $s1 $s2) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:127:4: 'IF' expr 'THEN' s1= stmt 'ELSE' s2= stmt
			{
			string_literal66=(Token)match(input,42,FOLLOW_42_in_condStmt553);  
			stream_42.add(string_literal66);

			pushFollow(FOLLOW_expr_in_condStmt555);
			expr67=expr();
			state._fsp--;

			stream_expr.add(expr67.getTree());
			string_literal68=(Token)match(input,46,FOLLOW_46_in_condStmt557);  
			stream_46.add(string_literal68);

			pushFollow(FOLLOW_stmt_in_condStmt561);
			s1=stmt();
			state._fsp--;

			stream_stmt.add(s1.getTree());
			string_literal69=(Token)match(input,39,FOLLOW_39_in_condStmt563);  
			stream_39.add(string_literal69);

			pushFollow(FOLLOW_stmt_in_condStmt567);
			s2=stmt();
			state._fsp--;

			stream_stmt.add(s2.getTree());
			// AST REWRITE
			// elements: s1, 42, s2, expr
			// token labels: 
			// rule labels: retval, s2, s1
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.getTree():null);
			RewriteRuleSubtreeStream stream_s1=new RewriteRuleSubtreeStream(adaptor,"rule s1",s1!=null?s1.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 128:3: -> ^( 'IF' expr $s1 $s2)
			{
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:128:6: ^( 'IF' expr $s1 $s2)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_42.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_1, stream_s1.nextTree());
				adaptor.addChild(root_1, stream_s2.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condStmt"


	public static class whileStmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "whileStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:131:1: whileStmt : 'WHILE' expr 'DO' stmt -> ^( 'WHILE' expr stmt ) ;
	public final LittleNicParser.whileStmt_return whileStmt() throws RecognitionException {
		LittleNicParser.whileStmt_return retval = new LittleNicParser.whileStmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal70=null;
		Token string_literal72=null;
		ParserRuleReturnScope expr71 =null;
		ParserRuleReturnScope stmt73 =null;

		CommonTree string_literal70_tree=null;
		CommonTree string_literal72_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:132:2: ( 'WHILE' expr 'DO' stmt -> ^( 'WHILE' expr stmt ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:132:4: 'WHILE' expr 'DO' stmt
			{
			string_literal70=(Token)match(input,48,FOLLOW_48_in_whileStmt595);  
			stream_48.add(string_literal70);

			pushFollow(FOLLOW_expr_in_whileStmt597);
			expr71=expr();
			state._fsp--;

			stream_expr.add(expr71.getTree());
			string_literal72=(Token)match(input,38,FOLLOW_38_in_whileStmt599);  
			stream_38.add(string_literal72);

			pushFollow(FOLLOW_stmt_in_whileStmt601);
			stmt73=stmt();
			state._fsp--;

			stream_stmt.add(stmt73.getTree());
			// AST REWRITE
			// elements: 48, expr, stmt
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 133:3: -> ^( 'WHILE' expr stmt )
			{
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:133:6: ^( 'WHILE' expr stmt )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_48.nextNode(), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_1, stream_stmt.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileStmt"


	public static class callStmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "callStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:136:1: callStmt : ID '(' ( argList )? ')' -> ^( CALL ID ( argList )? ) ;
	public final LittleNicParser.callStmt_return callStmt() throws RecognitionException {
		LittleNicParser.callStmt_return retval = new LittleNicParser.callStmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID74=null;
		Token char_literal75=null;
		Token char_literal77=null;
		ParserRuleReturnScope argList76 =null;

		CommonTree ID74_tree=null;
		CommonTree char_literal75_tree=null;
		CommonTree char_literal77_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleSubtreeStream stream_argList=new RewriteRuleSubtreeStream(adaptor,"rule argList");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:137:2: ( ID '(' ( argList )? ')' -> ^( CALL ID ( argList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:137:4: ID '(' ( argList )? ')'
			{
			ID74=(Token)match(input,ID,FOLLOW_ID_in_callStmt625);  
			stream_ID.add(ID74);

			char_literal75=(Token)match(input,23,FOLLOW_23_in_callStmt627);  
			stream_23.add(char_literal75);

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:137:11: ( argList )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==BOOLEAN||(LA16_0 >= ID && LA16_0 <= INTEGER)||LA16_0==23||LA16_0==26||LA16_0==28) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:137:11: argList
					{
					pushFollow(FOLLOW_argList_in_callStmt629);
					argList76=argList();
					state._fsp--;

					stream_argList.add(argList76.getTree());
					}
					break;

			}

			char_literal77=(Token)match(input,24,FOLLOW_24_in_callStmt632);  
			stream_24.add(char_literal77);

			// AST REWRITE
			// elements: argList, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 138:3: -> ^( CALL ID ( argList )? )
			{
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:138:6: ^( CALL ID ( argList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, "CALL"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:138:16: ( argList )?
				if ( stream_argList.hasNext() ) {
					adaptor.addChild(root_1, stream_argList.nextTree());
				}
				stream_argList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "callStmt"


	public static class argList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "argList"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:141:1: argList : expr ( ',' expr )* -> ( expr )+ ;
	public final LittleNicParser.argList_return argList() throws RecognitionException {
		LittleNicParser.argList_return retval = new LittleNicParser.argList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal79=null;
		ParserRuleReturnScope expr78 =null;
		ParserRuleReturnScope expr80 =null;

		CommonTree char_literal79_tree=null;
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:142:2: ( expr ( ',' expr )* -> ( expr )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:142:4: expr ( ',' expr )*
			{
			pushFollow(FOLLOW_expr_in_argList657);
			expr78=expr();
			state._fsp--;

			stream_expr.add(expr78.getTree());
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:142:9: ( ',' expr )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==27) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:142:10: ',' expr
					{
					char_literal79=(Token)match(input,27,FOLLOW_27_in_argList660);  
					stream_27.add(char_literal79);

					pushFollow(FOLLOW_expr_in_argList662);
					expr80=expr();
					state._fsp--;

					stream_expr.add(expr80.getTree());
					}
					break;

				default :
					break loop17;
				}
			}

			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 143:3: -> ( expr )+
			{
				if ( !(stream_expr.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expr.hasNext() ) {
					adaptor.addChild(root_0, stream_expr.nextTree());
				}
				stream_expr.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "argList"


	public static class outStmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "outStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:146:1: outStmt : ( 'OUTPUT' STRING -> ^( 'OUTPUT' STRING ) | 'OUTPUT' ID -> ^( 'OUTPUT' ID ) );
	public final LittleNicParser.outStmt_return outStmt() throws RecognitionException {
		LittleNicParser.outStmt_return retval = new LittleNicParser.outStmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal81=null;
		Token STRING82=null;
		Token string_literal83=null;
		Token ID84=null;

		CommonTree string_literal81_tree=null;
		CommonTree STRING82_tree=null;
		CommonTree string_literal83_tree=null;
		CommonTree ID84_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:147:2: ( 'OUTPUT' STRING -> ^( 'OUTPUT' STRING ) | 'OUTPUT' ID -> ^( 'OUTPUT' ID ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==43) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==STRING) ) {
					alt18=1;
				}
				else if ( (LA18_1==ID) ) {
					alt18=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:147:4: 'OUTPUT' STRING
					{
					string_literal81=(Token)match(input,43,FOLLOW_43_in_outStmt682);  
					stream_43.add(string_literal81);

					STRING82=(Token)match(input,STRING,FOLLOW_STRING_in_outStmt684);  
					stream_STRING.add(STRING82);

					// AST REWRITE
					// elements: 43, STRING
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 147:20: -> ^( 'OUTPUT' STRING )
					{
						// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:147:23: ^( 'OUTPUT' STRING )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_43.nextNode(), root_1);
						adaptor.addChild(root_1, stream_STRING.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:148:4: 'OUTPUT' ID
					{
					string_literal83=(Token)match(input,43,FOLLOW_43_in_outStmt697);  
					stream_43.add(string_literal83);

					ID84=(Token)match(input,ID,FOLLOW_ID_in_outStmt699);  
					stream_ID.add(ID84);

					// AST REWRITE
					// elements: 43, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 148:16: -> ^( 'OUTPUT' ID )
					{
						// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:148:19: ^( 'OUTPUT' ID )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_43.nextNode(), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "outStmt"


	public static class term_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "term"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:153:1: term : ( '+' !| negation ^)* INTEGER ;
	public final LittleNicParser.term_return term() throws RecognitionException {
		LittleNicParser.term_return retval = new LittleNicParser.term_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal85=null;
		Token INTEGER87=null;
		ParserRuleReturnScope negation86 =null;

		CommonTree char_literal85_tree=null;
		CommonTree INTEGER87_tree=null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:154:2: ( ( '+' !| negation ^)* INTEGER )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:154:4: ( '+' !| negation ^)* INTEGER
			{
			root_0 = (CommonTree)adaptor.nil();


			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:154:4: ( '+' !| negation ^)*
			loop19:
			while (true) {
				int alt19=3;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==26) ) {
					alt19=1;
				}
				else if ( (LA19_0==28) ) {
					alt19=2;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:154:5: '+' !
					{
					char_literal85=(Token)match(input,26,FOLLOW_26_in_term722); 
					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:154:12: negation ^
					{
					pushFollow(FOLLOW_negation_in_term727);
					negation86=negation();
					state._fsp--;

					root_0 = (CommonTree)adaptor.becomeRoot(negation86.getTree(), root_0);
					}
					break;

				default :
					break loop19;
				}
			}

			INTEGER87=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_term732); 
			INTEGER87_tree = (CommonTree)adaptor.create(INTEGER87);
			adaptor.addChild(root_0, INTEGER87_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class negation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "negation"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:157:1: negation : '-' -> NEGATION ;
	public final LittleNicParser.negation_return negation() throws RecognitionException {
		LittleNicParser.negation_return retval = new LittleNicParser.negation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal88=null;

		CommonTree char_literal88_tree=null;
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:158:2: ( '-' -> NEGATION )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:158:4: '-'
			{
			char_literal88=(Token)match(input,28,FOLLOW_28_in_negation744);  
			stream_28.add(char_literal88);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 158:8: -> NEGATION
			{
				adaptor.addChild(root_0, (CommonTree)adaptor.create(NEGATION, "NEGATION"));
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "negation"


	public static class unary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unary"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:161:1: unary : ( '(' expr ')' -> expr | callStmt | ID | term );
	public final LittleNicParser.unary_return unary() throws RecognitionException {
		LittleNicParser.unary_return retval = new LittleNicParser.unary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal89=null;
		Token char_literal91=null;
		Token ID93=null;
		ParserRuleReturnScope expr90 =null;
		ParserRuleReturnScope callStmt92 =null;
		ParserRuleReturnScope term94 =null;

		CommonTree char_literal89_tree=null;
		CommonTree char_literal91_tree=null;
		CommonTree ID93_tree=null;
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:162:2: ( '(' expr ')' -> expr | callStmt | ID | term )
			int alt20=4;
			switch ( input.LA(1) ) {
			case 23:
				{
				alt20=1;
				}
				break;
			case ID:
				{
				int LA20_2 = input.LA(2);
				if ( (LA20_2==23) ) {
					alt20=2;
				}
				else if ( (LA20_2==22||(LA20_2 >= 24 && LA20_2 <= 28)||(LA20_2 >= 31 && LA20_2 <= 36)||(LA20_2 >= 38 && LA20_2 <= 40)||LA20_2==46) ) {
					alt20=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INTEGER:
			case 26:
			case 28:
				{
				alt20=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:162:4: '(' expr ')'
					{
					char_literal89=(Token)match(input,23,FOLLOW_23_in_unary760);  
					stream_23.add(char_literal89);

					pushFollow(FOLLOW_expr_in_unary762);
					expr90=expr();
					state._fsp--;

					stream_expr.add(expr90.getTree());
					char_literal91=(Token)match(input,24,FOLLOW_24_in_unary764);  
					stream_24.add(char_literal91);

					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 162:17: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:163:4: callStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_callStmt_in_unary773);
					callStmt92=callStmt();
					state._fsp--;

					adaptor.addChild(root_0, callStmt92.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:164:4: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					ID93=(Token)match(input,ID,FOLLOW_ID_in_unary778); 
					ID93_tree = (CommonTree)adaptor.create(ID93);
					adaptor.addChild(root_0, ID93_tree);

					}
					break;
				case 4 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:165:4: term
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_term_in_unary783);
					term94=term();
					state._fsp--;

					adaptor.addChild(root_0, term94.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary"


	public static class mult_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mult"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:168:1: mult : unary ( '*' ^ unary )* ;
	public final LittleNicParser.mult_return mult() throws RecognitionException {
		LittleNicParser.mult_return retval = new LittleNicParser.mult_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal96=null;
		ParserRuleReturnScope unary95 =null;
		ParserRuleReturnScope unary97 =null;

		CommonTree char_literal96_tree=null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:169:2: ( unary ( '*' ^ unary )* )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:169:4: unary ( '*' ^ unary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unary_in_mult794);
			unary95=unary();
			state._fsp--;

			adaptor.addChild(root_0, unary95.getTree());

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:169:10: ( '*' ^ unary )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==25) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:169:11: '*' ^ unary
					{
					char_literal96=(Token)match(input,25,FOLLOW_25_in_mult797); 
					char_literal96_tree = (CommonTree)adaptor.create(char_literal96);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal96_tree, root_0);

					pushFollow(FOLLOW_unary_in_mult800);
					unary97=unary();
					state._fsp--;

					adaptor.addChild(root_0, unary97.getTree());

					}
					break;

				default :
					break loop21;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mult"


	public static class add_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "add"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:172:1: add : mult ( ( '+' ^| '-' ^) mult )* ;
	public final LittleNicParser.add_return add() throws RecognitionException {
		LittleNicParser.add_return retval = new LittleNicParser.add_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal99=null;
		Token char_literal100=null;
		ParserRuleReturnScope mult98 =null;
		ParserRuleReturnScope mult101 =null;

		CommonTree char_literal99_tree=null;
		CommonTree char_literal100_tree=null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:173:2: ( mult ( ( '+' ^| '-' ^) mult )* )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:173:4: mult ( ( '+' ^| '-' ^) mult )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_mult_in_add814);
			mult98=mult();
			state._fsp--;

			adaptor.addChild(root_0, mult98.getTree());

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:173:9: ( ( '+' ^| '-' ^) mult )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==26||LA23_0==28) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:173:10: ( '+' ^| '-' ^) mult
					{
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:173:10: ( '+' ^| '-' ^)
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==26) ) {
						alt22=1;
					}
					else if ( (LA22_0==28) ) {
						alt22=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						throw nvae;
					}

					switch (alt22) {
						case 1 :
							// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:173:11: '+' ^
							{
							char_literal99=(Token)match(input,26,FOLLOW_26_in_add818); 
							char_literal99_tree = (CommonTree)adaptor.create(char_literal99);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal99_tree, root_0);

							}
							break;
						case 2 :
							// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:173:18: '-' ^
							{
							char_literal100=(Token)match(input,28,FOLLOW_28_in_add823); 
							char_literal100_tree = (CommonTree)adaptor.create(char_literal100);
							root_0 = (CommonTree)adaptor.becomeRoot(char_literal100_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_mult_in_add827);
					mult101=mult();
					state._fsp--;

					adaptor.addChild(root_0, mult101.getTree());

					}
					break;

				default :
					break loop23;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "add"


	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:176:1: expr : ( add ( ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>=' ^| '>' ^) add )* | BOOLEAN );
	public final LittleNicParser.expr_return expr() throws RecognitionException {
		LittleNicParser.expr_return retval = new LittleNicParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal103=null;
		Token string_literal104=null;
		Token char_literal105=null;
		Token string_literal106=null;
		Token string_literal107=null;
		Token char_literal108=null;
		Token BOOLEAN110=null;
		ParserRuleReturnScope add102 =null;
		ParserRuleReturnScope add109 =null;

		CommonTree string_literal103_tree=null;
		CommonTree string_literal104_tree=null;
		CommonTree char_literal105_tree=null;
		CommonTree string_literal106_tree=null;
		CommonTree string_literal107_tree=null;
		CommonTree char_literal108_tree=null;
		CommonTree BOOLEAN110_tree=null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:177:2: ( add ( ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>=' ^| '>' ^) add )* | BOOLEAN )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( ((LA26_0 >= ID && LA26_0 <= INTEGER)||LA26_0==23||LA26_0==26||LA26_0==28) ) {
				alt26=1;
			}
			else if ( (LA26_0==BOOLEAN) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:177:4: add ( ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>=' ^| '>' ^) add )*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_add_in_expr841);
					add102=add();
					state._fsp--;

					adaptor.addChild(root_0, add102.getTree());

					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:177:8: ( ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>=' ^| '>' ^) add )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==22||(LA25_0 >= 32 && LA25_0 <= 36)) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:177:9: ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>=' ^| '>' ^) add
							{
							// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:177:9: ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>=' ^| '>' ^)
							int alt24=6;
							switch ( input.LA(1) ) {
							case 34:
								{
								alt24=1;
								}
								break;
							case 22:
								{
								alt24=2;
								}
								break;
							case 32:
								{
								alt24=3;
								}
								break;
							case 33:
								{
								alt24=4;
								}
								break;
							case 36:
								{
								alt24=5;
								}
								break;
							case 35:
								{
								alt24=6;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 24, 0, input);
								throw nvae;
							}
							switch (alt24) {
								case 1 :
									// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:177:10: '==' ^
									{
									string_literal103=(Token)match(input,34,FOLLOW_34_in_expr845); 
									string_literal103_tree = (CommonTree)adaptor.create(string_literal103);
									root_0 = (CommonTree)adaptor.becomeRoot(string_literal103_tree, root_0);

									}
									break;
								case 2 :
									// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:177:18: '!=' ^
									{
									string_literal104=(Token)match(input,22,FOLLOW_22_in_expr850); 
									string_literal104_tree = (CommonTree)adaptor.create(string_literal104);
									root_0 = (CommonTree)adaptor.becomeRoot(string_literal104_tree, root_0);

									}
									break;
								case 3 :
									// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:177:26: '<' ^
									{
									char_literal105=(Token)match(input,32,FOLLOW_32_in_expr855); 
									char_literal105_tree = (CommonTree)adaptor.create(char_literal105);
									root_0 = (CommonTree)adaptor.becomeRoot(char_literal105_tree, root_0);

									}
									break;
								case 4 :
									// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:177:33: '<=' ^
									{
									string_literal106=(Token)match(input,33,FOLLOW_33_in_expr860); 
									string_literal106_tree = (CommonTree)adaptor.create(string_literal106);
									root_0 = (CommonTree)adaptor.becomeRoot(string_literal106_tree, root_0);

									}
									break;
								case 5 :
									// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:177:41: '>=' ^
									{
									string_literal107=(Token)match(input,36,FOLLOW_36_in_expr865); 
									string_literal107_tree = (CommonTree)adaptor.create(string_literal107);
									root_0 = (CommonTree)adaptor.becomeRoot(string_literal107_tree, root_0);

									}
									break;
								case 6 :
									// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:177:49: '>' ^
									{
									char_literal108=(Token)match(input,35,FOLLOW_35_in_expr870); 
									char_literal108_tree = (CommonTree)adaptor.create(char_literal108);
									root_0 = (CommonTree)adaptor.becomeRoot(char_literal108_tree, root_0);

									}
									break;

							}

							pushFollow(FOLLOW_add_in_expr874);
							add109=add();
							state._fsp--;

							adaptor.addChild(root_0, add109.getTree());

							}
							break;

						default :
							break loop25;
						}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNic.g:178:4: BOOLEAN
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOLEAN110=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_expr881); 
					BOOLEAN110_tree = (CommonTree)adaptor.create(BOOLEAN110);
					adaptor.addChild(root_0, BOOLEAN110_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"

	// Delegated rules



	public static final BitSet FOLLOW_45_in_prog100 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_prog102 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_prog104 = new BitSet(new long[]{0x0000922000000000L});
	public static final BitSet FOLLOW_declList_in_prog108 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_prog113 = new BitSet(new long[]{0x00010D2000000800L});
	public static final BitSet FOLLOW_stmtList_in_prog117 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_prog122 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_prog124 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_declList154 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_declList157 = new BitSet(new long[]{0x0000920000000000L});
	public static final BitSet FOLLOW_decl_in_declList159 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_varDecl_in_decl180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procDecl_in_decl185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcDecl_in_decl190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varDecl_in_varDeclList201 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_varDeclList204 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_varDecl_in_varDeclList206 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_47_in_varDecl226 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_varDecl228 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_varDecl230 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TYPE_in_varDecl232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_procDecl255 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_procDecl257 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_procDecl259 = new BitSet(new long[]{0x0000000001000800L});
	public static final BitSet FOLLOW_paramList_in_procDecl261 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_procDecl264 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_procDecl266 = new BitSet(new long[]{0x0000802000000000L});
	public static final BitSet FOLLOW_varDeclList_in_procDecl270 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_procDecl275 = new BitSet(new long[]{0x00010D2000000800L});
	public static final BitSet FOLLOW_stmtList_in_procDecl279 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_procDecl284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_funcDecl315 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_funcDecl317 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_funcDecl319 = new BitSet(new long[]{0x0000000001000800L});
	public static final BitSet FOLLOW_paramList_in_funcDecl321 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_funcDecl324 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_funcDecl326 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TYPE_in_funcDecl328 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_funcDecl330 = new BitSet(new long[]{0x0000802000000000L});
	public static final BitSet FOLLOW_varDeclList_in_funcDecl334 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_funcDecl339 = new BitSet(new long[]{0x00010D2000000800L});
	public static final BitSet FOLLOW_stmtList_in_funcDecl343 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_funcDecl348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_paramList381 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_paramList384 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_param_in_paramList386 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_ID_in_param407 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_param409 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TYPE_in_param411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stmt_in_stmtList435 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_stmtList438 = new BitSet(new long[]{0x00010C2000000800L});
	public static final BitSet FOLLOW_stmt_in_stmtList440 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_blockStmt_in_stmt460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignStmt_in_stmt465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condStmt_in_stmt470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStmt_in_stmt475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callStmt_in_stmt480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outStmt_in_stmt485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_blockStmt497 = new BitSet(new long[]{0x00010D2000000800L});
	public static final BitSet FOLLOW_stmtList_in_blockStmt499 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_blockStmt502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignStmt525 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_assignStmt527 = new BitSet(new long[]{0x0000000014801820L});
	public static final BitSet FOLLOW_expr_in_assignStmt529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_condStmt553 = new BitSet(new long[]{0x0000000014801820L});
	public static final BitSet FOLLOW_expr_in_condStmt555 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_condStmt557 = new BitSet(new long[]{0x00010C2000000800L});
	public static final BitSet FOLLOW_stmt_in_condStmt561 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_condStmt563 = new BitSet(new long[]{0x00010C2000000800L});
	public static final BitSet FOLLOW_stmt_in_condStmt567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_whileStmt595 = new BitSet(new long[]{0x0000000014801820L});
	public static final BitSet FOLLOW_expr_in_whileStmt597 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_whileStmt599 = new BitSet(new long[]{0x00010C2000000800L});
	public static final BitSet FOLLOW_stmt_in_whileStmt601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_callStmt625 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_callStmt627 = new BitSet(new long[]{0x0000000015801820L});
	public static final BitSet FOLLOW_argList_in_callStmt629 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_callStmt632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_argList657 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_argList660 = new BitSet(new long[]{0x0000000014801820L});
	public static final BitSet FOLLOW_expr_in_argList662 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_43_in_outStmt682 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_STRING_in_outStmt684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_outStmt697 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_outStmt699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_term722 = new BitSet(new long[]{0x0000000014001000L});
	public static final BitSet FOLLOW_negation_in_term727 = new BitSet(new long[]{0x0000000014001000L});
	public static final BitSet FOLLOW_INTEGER_in_term732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_negation744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_unary760 = new BitSet(new long[]{0x0000000014801820L});
	public static final BitSet FOLLOW_expr_in_unary762 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_unary764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callStmt_in_unary773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_unary778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_unary783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_mult794 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_mult797 = new BitSet(new long[]{0x0000000014801800L});
	public static final BitSet FOLLOW_unary_in_mult800 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_mult_in_add814 = new BitSet(new long[]{0x0000000014000002L});
	public static final BitSet FOLLOW_26_in_add818 = new BitSet(new long[]{0x0000000014801800L});
	public static final BitSet FOLLOW_28_in_add823 = new BitSet(new long[]{0x0000000014801800L});
	public static final BitSet FOLLOW_mult_in_add827 = new BitSet(new long[]{0x0000000014000002L});
	public static final BitSet FOLLOW_add_in_expr841 = new BitSet(new long[]{0x0000001F00400002L});
	public static final BitSet FOLLOW_34_in_expr845 = new BitSet(new long[]{0x0000000014801800L});
	public static final BitSet FOLLOW_22_in_expr850 = new BitSet(new long[]{0x0000000014801800L});
	public static final BitSet FOLLOW_32_in_expr855 = new BitSet(new long[]{0x0000000014801800L});
	public static final BitSet FOLLOW_33_in_expr860 = new BitSet(new long[]{0x0000000014801800L});
	public static final BitSet FOLLOW_36_in_expr865 = new BitSet(new long[]{0x0000000014801800L});
	public static final BitSet FOLLOW_35_in_expr870 = new BitSet(new long[]{0x0000000014801800L});
	public static final BitSet FOLLOW_add_in_expr874 = new BitSet(new long[]{0x0000001F00400002L});
	public static final BitSet FOLLOW_BOOLEAN_in_expr881 = new BitSet(new long[]{0x0000000000000002L});
}
