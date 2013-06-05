// $ANTLR 3.5 C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g 2013-04-25 13:42:13

	import java.util.Map;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.ArrayList;
	import java.util.Collections;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LittleNicBodyWalker extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators

	protected static class Scope_scope {
		HashMap<String, String> scopeMap;
	}
	protected Stack<Scope_scope> Scope_stack = new Stack<Scope_scope>();


	public LittleNicBodyWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public LittleNicBodyWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return LittleNicBodyWalker.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g"; }


		
	    public ErrorReporter err;
	    
		public HashMap<String, String> globals = new HashMap<String, String>();
		public HashMap<String, HashMap<String, String>> methods
					= new HashMap<String, HashMap<String, String>>();
		
		public boolean inMethod = false;
		public String currentMethod = "";
			
	    // if variable in scope
	    public boolean inScope(String id) {
	   		if (globals.containsKey(id)) {
	   			return true;
	   		}
	    	return false;
	    }
	    
	    public boolean inDynamicScope(String id) {
	   		for (int s = Scope_stack.size() - 1; s >= 0; s--) {
	    		if (Scope_stack.elementAt(s).scopeMap.containsKey(id)) {
	    			return true;
	    		}
	    	}
	    	return false;
	    }
	    
	    // if two entities have the same type
	    public boolean sameType(String type1, String type2) {
	    	return type1.equals(type2);
	    }
	    
	    // if two entities have the same type (only for COUNTs)
	    public void checkTypes(int line, String name1, String type1,
	    						String name2, String type2) {
	    	if (!(type1.equals("COUNT") && type2.equals("COUNT"))) {
	    		err.reportTypeError(line, name1, type1, name2, type2);
				throw new RuntimeException();
	    	}
	    }
	    



	// $ANTLR start "prog"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:65:1: prog : ^( ID ( declList )? ( stmtList )? ) ;
	public final void prog() throws RecognitionException {
		Scope_stack.push(new Scope_scope());


			Scope_stack.peek().scopeMap = globals;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:70:2: ( ^( ID ( declList )? ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:70:4: ^( ID ( declList )? ( stmtList )? )
			{
			match(input,ID,FOLLOW_ID_in_prog75); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:70:9: ( declList )?
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FUNC||LA1_0==PROC||LA1_0==VARDECL) ) {
					alt1=1;
				}
				switch (alt1) {
					case 1 :
						// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:70:9: declList
						{
						pushFollow(FOLLOW_declList_in_prog77);
						declList();
						state._fsp--;

						}
						break;

				}

				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:70:19: ( stmtList )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==BLOCK||LA2_0==CALL||LA2_0==30||(LA2_0 >= 42 && LA2_0 <= 43)||LA2_0==48) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:70:19: stmtList
						{
						pushFollow(FOLLOW_stmtList_in_prog80);
						stmtList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			Scope_stack.pop();

		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "declList"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:73:1: declList : ( decl )+ ;
	public final void declList() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:74:2: ( ( decl )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:74:4: ( decl )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:74:4: ( decl )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==FUNC||LA3_0==PROC||LA3_0==VARDECL) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:74:4: decl
					{
					pushFollow(FOLLOW_decl_in_declList94);
					decl();
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declList"



	// $ANTLR start "decl"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:77:1: decl : ( varDecl | procDecl | funcDecl );
	public final void decl() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:78:2: ( varDecl | procDecl | funcDecl )
			int alt4=3;
			switch ( input.LA(1) ) {
			case VARDECL:
				{
				alt4=1;
				}
				break;
			case PROC:
				{
				alt4=2;
				}
				break;
			case FUNC:
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:78:4: varDecl
					{
					pushFollow(FOLLOW_varDecl_in_decl107);
					varDecl();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:79:4: procDecl
					{
					pushFollow(FOLLOW_procDecl_in_decl112);
					procDecl();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:80:4: funcDecl
					{
					pushFollow(FOLLOW_funcDecl_in_decl117);
					funcDecl();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decl"



	// $ANTLR start "varDeclList"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:83:1: varDeclList : ( varDecl )+ ;
	public final void varDeclList() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:84:2: ( ( varDecl )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:84:4: ( varDecl )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:84:4: ( varDecl )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==VARDECL) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:84:4: varDecl
					{
					pushFollow(FOLLOW_varDecl_in_varDeclList128);
					varDecl();
					state._fsp--;

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varDeclList"



	// $ANTLR start "varDecl"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:87:1: varDecl : ^( VARDECL TYPE ID ) ;
	public final void varDecl() throws RecognitionException {
		CommonTree ID1=null;
		CommonTree TYPE2=null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:88:2: ( ^( VARDECL TYPE ID ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:88:4: ^( VARDECL TYPE ID )
			{
			match(input,VARDECL,FOLLOW_VARDECL_in_varDecl141); 
			match(input, Token.DOWN, null); 
			TYPE2=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_varDecl143); 
			ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_varDecl145); 
			match(input, Token.UP, null); 


						if (!Scope_stack.peek().scopeMap.containsKey((ID1!=null?ID1.getText():null))) {
							Scope_stack.peek().scopeMap.put((ID1!=null?ID1.getText():null), (TYPE2!=null?TYPE2.getText():null));
						}
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varDecl"



	// $ANTLR start "procDecl"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:96:1: procDecl : ^( PROC ID ( paramList )? ( varDeclList )? ( stmtList )? ) ;
	public final void procDecl() throws RecognitionException {
		Scope_stack.push(new Scope_scope());

		CommonTree ID3=null;


			inMethod = true;
			Scope_stack.peek().scopeMap = new HashMap<String, String>();

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:106:2: ( ^( PROC ID ( paramList )? ( varDeclList )? ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:106:4: ^( PROC ID ( paramList )? ( varDeclList )? ( stmtList )? )
			{
			match(input,PROC,FOLLOW_PROC_in_procDecl177); 
			match(input, Token.DOWN, null); 
			ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_procDecl179); 
			currentMethod = (ID3!=null?ID3.getText():null);
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:106:42: ( paramList )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==PARAM) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:106:42: paramList
					{
					pushFollow(FOLLOW_paramList_in_procDecl183);
					paramList();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:106:53: ( varDeclList )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==VARDECL) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:106:53: varDeclList
					{
					pushFollow(FOLLOW_varDeclList_in_procDecl186);
					varDeclList();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:106:66: ( stmtList )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==BLOCK||LA8_0==CALL||LA8_0==30||(LA8_0 >= 42 && LA8_0 <= 43)||LA8_0==48) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:106:66: stmtList
					{
					pushFollow(FOLLOW_stmtList_in_procDecl189);
					stmtList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			}


				inMethod = false;
				Scope_stack.peek().scopeMap.clear();

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			Scope_stack.pop();

		}
	}
	// $ANTLR end "procDecl"



	// $ANTLR start "funcDecl"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:109:1: funcDecl : ^( FUNC TYPE ID ( paramList )? ( varDeclList )? ( stmtList )? ) ;
	public final void funcDecl() throws RecognitionException {
		Scope_stack.push(new Scope_scope());

		CommonTree ID4=null;


			inMethod = true;
			Scope_stack.peek().scopeMap = new HashMap<String, String>();

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:119:2: ( ^( FUNC TYPE ID ( paramList )? ( varDeclList )? ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:119:4: ^( FUNC TYPE ID ( paramList )? ( varDeclList )? ( stmtList )? )
			{
			match(input,FUNC,FOLLOW_FUNC_in_funcDecl219); 
			match(input, Token.DOWN, null); 
			match(input,TYPE,FOLLOW_TYPE_in_funcDecl221); 
			ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_funcDecl223); 
			currentMethod = (ID4!=null?ID4.getText():null);
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:119:47: ( paramList )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==PARAM) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:119:47: paramList
					{
					pushFollow(FOLLOW_paramList_in_funcDecl227);
					paramList();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:119:58: ( varDeclList )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==VARDECL) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:119:58: varDeclList
					{
					pushFollow(FOLLOW_varDeclList_in_funcDecl230);
					varDeclList();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:119:71: ( stmtList )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==BLOCK||LA11_0==CALL||LA11_0==30||(LA11_0 >= 42 && LA11_0 <= 43)||LA11_0==48) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:119:71: stmtList
					{
					pushFollow(FOLLOW_stmtList_in_funcDecl233);
					stmtList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			}


				inMethod = false;
				Scope_stack.peek().scopeMap.clear();

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			Scope_stack.pop();

		}
	}
	// $ANTLR end "funcDecl"



	// $ANTLR start "paramList"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:122:1: paramList : ( param )+ ;
	public final void paramList() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:123:2: ( ( param )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:123:4: ( param )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:123:4: ( param )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==PARAM) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:123:4: param
					{
					pushFollow(FOLLOW_param_in_paramList246);
					param();
					state._fsp--;

					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "paramList"



	// $ANTLR start "param"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:126:1: param : ^( PARAM TYPE ID ) ;
	public final void param() throws RecognitionException {
		CommonTree ID5=null;
		CommonTree TYPE6=null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:127:2: ( ^( PARAM TYPE ID ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:127:4: ^( PARAM TYPE ID )
			{
			match(input,PARAM,FOLLOW_PARAM_in_param260); 
			match(input, Token.DOWN, null); 
			TYPE6=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_param262); 
			ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_param264); 
			match(input, Token.UP, null); 


						Scope_stack.peek().scopeMap.put((ID5!=null?ID5.getText():null), (TYPE6!=null?TYPE6.getText():null));
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "param"



	// $ANTLR start "stmtList"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:133:1: stmtList : ( stmt )+ ;
	public final void stmtList() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:134:2: ( ( stmt )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:134:4: ( stmt )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:134:4: ( stmt )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==BLOCK||LA13_0==CALL||LA13_0==30||(LA13_0 >= 42 && LA13_0 <= 43)||LA13_0==48) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:134:4: stmt
					{
					pushFollow(FOLLOW_stmt_in_stmtList280);
					stmt();
					state._fsp--;

					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stmtList"



	// $ANTLR start "stmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:137:1: stmt : ( blockStmt | assignStmt | condStmt | whileStmt | callStmt[false] | outStmt );
	public final void stmt() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:138:2: ( blockStmt | assignStmt | condStmt | whileStmt | callStmt[false] | outStmt )
			int alt14=6;
			switch ( input.LA(1) ) {
			case BLOCK:
				{
				alt14=1;
				}
				break;
			case 30:
				{
				alt14=2;
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
			case CALL:
				{
				alt14=5;
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:138:4: blockStmt
					{
					pushFollow(FOLLOW_blockStmt_in_stmt292);
					blockStmt();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:139:4: assignStmt
					{
					pushFollow(FOLLOW_assignStmt_in_stmt297);
					assignStmt();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:140:4: condStmt
					{
					pushFollow(FOLLOW_condStmt_in_stmt302);
					condStmt();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:141:4: whileStmt
					{
					pushFollow(FOLLOW_whileStmt_in_stmt307);
					whileStmt();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:142:4: callStmt[false]
					{
					pushFollow(FOLLOW_callStmt_in_stmt312);
					callStmt(false);
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:143:4: outStmt
					{
					pushFollow(FOLLOW_outStmt_in_stmt318);
					outStmt();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stmt"



	// $ANTLR start "blockStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:146:1: blockStmt : ^( BLOCK ( stmtList )? ) ;
	public final void blockStmt() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:147:2: ( ^( BLOCK ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:147:4: ^( BLOCK ( stmtList )? )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_blockStmt331); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:147:12: ( stmtList )?
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==BLOCK||LA15_0==CALL||LA15_0==30||(LA15_0 >= 42 && LA15_0 <= 43)||LA15_0==48) ) {
					alt15=1;
				}
				switch (alt15) {
					case 1 :
						// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:147:12: stmtList
						{
						pushFollow(FOLLOW_stmtList_in_blockStmt333);
						stmtList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "blockStmt"



	// $ANTLR start "assignStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:150:1: assignStmt : ^(op= ':=' ID expr[false, null] ) ;
	public final void assignStmt() throws RecognitionException {
		CommonTree op=null;
		CommonTree ID8=null;
		TreeRuleReturnScope expr7 =null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:151:2: ( ^(op= ':=' ID expr[false, null] ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:151:4: ^(op= ':=' ID expr[false, null] )
			{
			op=(CommonTree)match(input,30,FOLLOW_30_in_assignStmt350); 
			match(input, Token.DOWN, null); 
			ID8=(CommonTree)match(input,ID,FOLLOW_ID_in_assignStmt352); 
			pushFollow(FOLLOW_expr_in_assignStmt354);
			expr7=expr(false, null);
			state._fsp--;

			match(input, Token.UP, null); 


						if ((expr7!=null?((LittleNicBodyWalker.expr_return)expr7).type:null) == null) { // error if procedure
							err.reportUndeclaredError((ID8!=null?ID8.getLine():0), (op!=null?op.getCharPositionInLine():0), (expr7!=null?((LittleNicBodyWalker.expr_return)expr7).text:null));
							throw new RuntimeException();
						}
						
						if (!inMethod) {
							if (inScope((ID8!=null?ID8.getText():null)) && !methods.containsKey((ID8!=null?ID8.getText():null))) { // if defined
								
								String type = globals.get((ID8!=null?ID8.getText():null));
								
								if (!sameType(type , (expr7!=null?((LittleNicBodyWalker.expr_return)expr7).type:null))) {
									err.reportTypeError((ID8!=null?ID8.getLine():0), (ID8!=null?ID8.getText():null),
										type, (expr7!=null?((LittleNicBodyWalker.expr_return)expr7).text:null), (expr7!=null?((LittleNicBodyWalker.expr_return)expr7).type:null));
									throw new RuntimeException();
								} else if (type == null) { // no return type
									// correct types so procedure then error
									err.reportUndeclaredError((ID8!=null?ID8.getLine():0), (ID8!=null?ID8.getCharPositionInLine():0), (ID8!=null?ID8.getText():null));
									throw new RuntimeException();
								}
								
							} else {
								err.reportUndeclaredError((ID8!=null?ID8.getLine():0), (ID8!=null?ID8.getCharPositionInLine():0), (ID8!=null?ID8.getText():null));
								throw new RuntimeException();
							}
						}
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignStmt"



	// $ANTLR start "condStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:181:1: condStmt : ^(op= 'IF' expr[false, null] s1= stmt s2= stmt ) ;
	public final void condStmt() throws RecognitionException {
		CommonTree op=null;
		TreeRuleReturnScope expr9 =null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:182:2: ( ^(op= 'IF' expr[false, null] s1= stmt s2= stmt ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:182:4: ^(op= 'IF' expr[false, null] s1= stmt s2= stmt )
			{
			op=(CommonTree)match(input,42,FOLLOW_42_in_condStmt375); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expr_in_condStmt377);
			expr9=expr(false, null);
			state._fsp--;

			pushFollow(FOLLOW_stmt_in_condStmt382);
			stmt();
			state._fsp--;

			pushFollow(FOLLOW_stmt_in_condStmt386);
			stmt();
			state._fsp--;

			match(input, Token.UP, null); 


						if (!(expr9!=null?((LittleNicBodyWalker.expr_return)expr9).type:null).equals("TRUTH")) {
							err.reportTypeError((op!=null?op.getLine():0), (expr9!=null?((LittleNicBodyWalker.expr_return)expr9).text:null),
								(expr9!=null?((LittleNicBodyWalker.expr_return)expr9).type:null), "Expected", "TRUTH");
							throw new RuntimeException();
						}
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "condStmt"



	// $ANTLR start "whileStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:192:1: whileStmt : ^(op= 'WHILE' expr[false, null] stmt ) ;
	public final void whileStmt() throws RecognitionException {
		CommonTree op=null;
		TreeRuleReturnScope expr10 =null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:193:2: ( ^(op= 'WHILE' expr[false, null] stmt ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:193:4: ^(op= 'WHILE' expr[false, null] stmt )
			{
			op=(CommonTree)match(input,48,FOLLOW_48_in_whileStmt406); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expr_in_whileStmt408);
			expr10=expr(false, null);
			state._fsp--;

			pushFollow(FOLLOW_stmt_in_whileStmt411);
			stmt();
			state._fsp--;

			match(input, Token.UP, null); 


						if (!(expr10!=null?((LittleNicBodyWalker.expr_return)expr10).type:null).equals("TRUTH")) {
							err.reportTypeError((op!=null?op.getLine():0), (expr10!=null?((LittleNicBodyWalker.expr_return)expr10).text:null),
								(expr10!=null?((LittleNicBodyWalker.expr_return)expr10).type:null), "Expected", "TRUTH");
							throw new RuntimeException();
						}
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "whileStmt"


	public static class callStmt_return extends TreeRuleReturnScope {
		public String type;
		public String text;
	};


	// $ANTLR start "callStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:203:1: callStmt[boolean isAssign] returns [String type, String text] : ^( CALL ID ( argList[args] )? ) ;
	public final LittleNicBodyWalker.callStmt_return callStmt(boolean isAssign) throws RecognitionException {
		LittleNicBodyWalker.callStmt_return retval = new LittleNicBodyWalker.callStmt_return();
		retval.start = input.LT(1);

		CommonTree ID11=null;
		CommonTree CALL12=null;


			ArrayList<Pair> args = new ArrayList<Pair>();

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:207:2: ( ^( CALL ID ( argList[args] )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:207:4: ^( CALL ID ( argList[args] )? )
			{
			CALL12=(CommonTree)match(input,CALL,FOLLOW_CALL_in_callStmt439); 
			match(input, Token.DOWN, null); 
			ID11=(CommonTree)match(input,ID,FOLLOW_ID_in_callStmt441); 
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:207:14: ( argList[args] )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( ((LA16_0 >= BOOLEAN && LA16_0 <= CALL)||(LA16_0 >= ID && LA16_0 <= INTEGER)||LA16_0==NEGATION||LA16_0==22||(LA16_0 >= 25 && LA16_0 <= 26)||LA16_0==28||(LA16_0 >= 32 && LA16_0 <= 36)) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:207:14: argList[args]
					{
					pushFollow(FOLLOW_argList_in_callStmt443);
					argList(args);
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 


						Collections.reverse(args);
						
						if (methods.containsKey((ID11!=null?ID11.getText():null))) { // if method exists
						
							if (!isAssign && (globals.get((ID11!=null?ID11.getText():null)) != null)) {
								err.reportUndeclaredError((ID11!=null?ID11.getLine():0), (ID11!=null?ID11.getCharPositionInLine():0), (ID11!=null?ID11.getText():null));
								throw new RuntimeException();
							}
						
							retval.text = (ID11!=null?ID11.getText():null);
							retval.type = globals.get(retval.text);
						
							// check argument types
							int count = 0;
							Iterator itr = methods.get(retval.text).entrySet().iterator();
							
							// for each method parameter
						    while (itr.hasNext() && count < args.size()) {
						        Map.Entry pair = (Map.Entry) itr.next();
						        String callArgType = args.get(count).getType();
						        
						        if (!callArgType.equals(pair.getValue())) {
									err.reportTypeError((CALL12!=null?CALL12.getLine():0),
										(String) pair.getKey(),
										(String) pair.getValue(),
										args.get(count).getName(),
										callArgType);
									throw new RuntimeException();
								}
						        
						        count++;
						    }
						    
						    // check if number of arguments match
							if (count != args.size() || count < methods.get(retval.text).size()) {
							
								// print parameter types
								String params = "[";
								Iterator itr2 = methods.get(retval.text).entrySet().iterator();
								int c = 0;
								while (itr2.hasNext()) {
									if (c > 0) {
										params = params.concat(", ");
									}
									Map.Entry pair = (Map.Entry) itr2.next();
									params = params.concat((String) pair.getValue());
									c++;
								}
								params += "]";
								
								// print argument types
								String argmts = "[";
								for (c = 0; c < args.size(); c++) {
									if (c > 0) {
										argmts = argmts.concat(", ");
									}
									argmts = argmts.concat(args.get(c).getType());
								}
								argmts += "]";
								
								err.reportTypeError((CALL12!=null?CALL12.getLine():0), "Expected",
									params,	"Given", argmts);
								throw new RuntimeException();
							}
							
						} else {
							err.reportUndeclaredError((ID11!=null?ID11.getLine():0), (ID11!=null?ID11.getCharPositionInLine():0), (ID11!=null?ID11.getText():null));
							throw new RuntimeException();
						}
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "callStmt"



	// $ANTLR start "argList"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:281:1: argList[ArrayList<Pair> args] : ( expr[true, args] )+ ;
	public final void argList(ArrayList<Pair> args) throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:282:2: ( ( expr[true, args] )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:282:4: ( expr[true, args] )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:282:4: ( expr[true, args] )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= BOOLEAN && LA17_0 <= CALL)||(LA17_0 >= ID && LA17_0 <= INTEGER)||LA17_0==NEGATION||LA17_0==22||(LA17_0 >= 25 && LA17_0 <= 26)||LA17_0==28||(LA17_0 >= 32 && LA17_0 <= 36)) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:282:4: expr[true, args]
					{
					pushFollow(FOLLOW_expr_in_argList463);
					expr(true, args);
					state._fsp--;

					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "argList"



	// $ANTLR start "outStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:285:1: outStmt : ( ^( 'OUTPUT' STRING ) | ^( 'OUTPUT' ID ) );
	public final void outStmt() throws RecognitionException {
		CommonTree ID13=null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:286:2: ( ^( 'OUTPUT' STRING ) | ^( 'OUTPUT' ID ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==43) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==DOWN) ) {
					int LA18_2 = input.LA(3);
					if ( (LA18_2==STRING) ) {
						alt18=1;
					}
					else if ( (LA18_2==ID) ) {
						alt18=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 18, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:286:4: ^( 'OUTPUT' STRING )
					{
					match(input,43,FOLLOW_43_in_outStmt477); 
					match(input, Token.DOWN, null); 
					match(input,STRING,FOLLOW_STRING_in_outStmt479); 
					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:287:4: ^( 'OUTPUT' ID )
					{
					match(input,43,FOLLOW_43_in_outStmt486); 
					match(input, Token.DOWN, null); 
					ID13=(CommonTree)match(input,ID,FOLLOW_ID_in_outStmt488); 
					match(input, Token.UP, null); 


								if (!inDynamicScope((ID13!=null?ID13.getText():null))) {
									err.reportUndeclaredError((ID13!=null?ID13.getLine():0), (ID13!=null?ID13.getCharPositionInLine():0), (ID13!=null?ID13.getText():null));
									throw new RuntimeException();
								}
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "outStmt"


	public static class expr_return extends TreeRuleReturnScope {
		public String text;
		public String type;
	};


	// $ANTLR start "expr"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:296:1: expr[boolean isArg, ArrayList<Pair> args] returns [String text, String type] : ( ^(op= '==' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '!=' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '<' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '<=' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '>=' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '>' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '+' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '-' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '*' e1= expr[false, null] e2= expr[false, null] ) | ^( NEGATION e1= expr[false, null] ) | ID | INTEGER | BOOLEAN | callStmt[true] );
	public final LittleNicBodyWalker.expr_return expr(boolean isArg, ArrayList<Pair> args) throws RecognitionException {
		LittleNicBodyWalker.expr_return retval = new LittleNicBodyWalker.expr_return();
		retval.start = input.LT(1);

		CommonTree op=null;
		CommonTree ID14=null;
		CommonTree INTEGER15=null;
		CommonTree BOOLEAN16=null;
		TreeRuleReturnScope e1 =null;
		TreeRuleReturnScope e2 =null;
		TreeRuleReturnScope callStmt17 =null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:298:2: ( ^(op= '==' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '!=' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '<' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '<=' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '>=' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '>' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '+' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '-' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '*' e1= expr[false, null] e2= expr[false, null] ) | ^( NEGATION e1= expr[false, null] ) | ID | INTEGER | BOOLEAN | callStmt[true] )
			int alt19=14;
			switch ( input.LA(1) ) {
			case 34:
				{
				alt19=1;
				}
				break;
			case 22:
				{
				alt19=2;
				}
				break;
			case 32:
				{
				alt19=3;
				}
				break;
			case 33:
				{
				alt19=4;
				}
				break;
			case 36:
				{
				alt19=5;
				}
				break;
			case 35:
				{
				alt19=6;
				}
				break;
			case 26:
				{
				alt19=7;
				}
				break;
			case 28:
				{
				alt19=8;
				}
				break;
			case 25:
				{
				alt19=9;
				}
				break;
			case NEGATION:
				{
				alt19=10;
				}
				break;
			case ID:
				{
				alt19=11;
				}
				break;
			case INTEGER:
				{
				alt19=12;
				}
				break;
			case BOOLEAN:
				{
				alt19=13;
				}
				break;
			case CALL:
				{
				alt19=14;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:298:4: ^(op= '==' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,34,FOLLOW_34_in_expr514); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr518);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr523);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "TRUTH";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null), (e1!=null?((LittleNicBodyWalker.expr_return)e1).type:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null) + " == " + (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:309:4: ^(op= '!=' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,22,FOLLOW_22_in_expr537); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr541);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr546);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "TRUTH";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null), (e1!=null?((LittleNicBodyWalker.expr_return)e1).type:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null) + " != " + (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 3 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:320:4: ^(op= '<' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,32,FOLLOW_32_in_expr560); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr564);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr569);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "TRUTH";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null), (e1!=null?((LittleNicBodyWalker.expr_return)e1).type:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null) + " < " + (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 4 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:331:4: ^(op= '<=' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,33,FOLLOW_33_in_expr583); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr587);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr592);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "TRUTH";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null), (e1!=null?((LittleNicBodyWalker.expr_return)e1).type:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null) + " <= " + (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 5 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:342:4: ^(op= '>=' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,36,FOLLOW_36_in_expr606); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr610);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr615);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "TRUTH";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null), (e1!=null?((LittleNicBodyWalker.expr_return)e1).type:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null) + " >= " + (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 6 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:353:4: ^(op= '>' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,35,FOLLOW_35_in_expr629); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr633);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr638);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "TRUTH";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null), (e1!=null?((LittleNicBodyWalker.expr_return)e1).type:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null) + " > " + (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 7 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:364:4: ^(op= '+' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,26,FOLLOW_26_in_expr652); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr656);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr661);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "COUNT";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null), (e1!=null?((LittleNicBodyWalker.expr_return)e1).type:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null) + " + " + (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 8 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:375:4: ^(op= '-' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,28,FOLLOW_28_in_expr675); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr679);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr684);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "COUNT";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null), (e1!=null?((LittleNicBodyWalker.expr_return)e1).type:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null) + " - " + (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 9 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:386:4: ^(op= '*' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,25,FOLLOW_25_in_expr698); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr702);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr707);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "COUNT";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null), (e1!=null?((LittleNicBodyWalker.expr_return)e1).type:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null), (e2!=null?((LittleNicBodyWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null) + " * " + (e2!=null?((LittleNicBodyWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 10 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:397:4: ^( NEGATION e1= expr[false, null] )
					{
					match(input,NEGATION,FOLLOW_NEGATION_in_expr719); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr723);
					e1=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								String eType = (e1!=null?((LittleNicBodyWalker.expr_return)e1).type:null);
								if (eType.equals("COUNT")) {
									retval.type = "COUNT";
								}
								retval.text = "-" + (e1!=null?((LittleNicBodyWalker.expr_return)e1).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 11 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:410:4: ID
					{
					ID14=(CommonTree)match(input,ID,FOLLOW_ID_in_expr734); 

								String id = (ID14!=null?ID14.getText():null);
								retval.text = id;
								if (!inMethod) {
									if (inScope(id)) {
										retval.type = globals.get(id);
									} else {
										err.reportUndeclaredError((ID14!=null?ID14.getLine():0), (ID14!=null?ID14.getCharPositionInLine():0), (ID14!=null?ID14.getText():null));
										throw new RuntimeException();
									}
								} else { // in method
									if (inDynamicScope(id)) {
										retval.type = Scope_stack.peek().scopeMap.get(id);
									} else {
										err.reportUndeclaredError((ID14!=null?ID14.getLine():0), (ID14!=null?ID14.getCharPositionInLine():0), (ID14!=null?ID14.getText():null));
										throw new RuntimeException();
									}
								}
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 12 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:435:4: INTEGER
					{
					INTEGER15=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_expr743); 

								retval.type = "COUNT";
								retval.text = (INTEGER15!=null?INTEGER15.getText():null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 13 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:445:4: BOOLEAN
					{
					BOOLEAN16=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_expr752); 

								retval.type = "TRUTH";
								retval.text = (BOOLEAN16!=null?BOOLEAN16.getText():null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 14 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicBodyWalker.g:455:4: callStmt[true]
					{
					pushFollow(FOLLOW_callStmt_in_expr761);
					callStmt17=callStmt(true);
					state._fsp--;


								retval.type = (callStmt17!=null?((LittleNicBodyWalker.callStmt_return)callStmt17).type:null);
								retval.text = (callStmt17!=null?((LittleNicBodyWalker.callStmt_return)callStmt17).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"

	// Delegated rules



	public static final BitSet FOLLOW_ID_in_prog75 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declList_in_prog77 = new BitSet(new long[]{0x00010C0040000058L});
	public static final BitSet FOLLOW_stmtList_in_prog80 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_decl_in_declList94 = new BitSet(new long[]{0x0000000000110402L});
	public static final BitSet FOLLOW_varDecl_in_decl107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procDecl_in_decl112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcDecl_in_decl117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varDecl_in_varDeclList128 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_VARDECL_in_varDecl141 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_varDecl143 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_varDecl145 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PROC_in_procDecl177 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_procDecl179 = new BitSet(new long[]{0x00010C0040108058L});
	public static final BitSet FOLLOW_paramList_in_procDecl183 = new BitSet(new long[]{0x00010C0040100058L});
	public static final BitSet FOLLOW_varDeclList_in_procDecl186 = new BitSet(new long[]{0x00010C0040000058L});
	public static final BitSet FOLLOW_stmtList_in_procDecl189 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_in_funcDecl219 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_funcDecl221 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_funcDecl223 = new BitSet(new long[]{0x00010C0040108058L});
	public static final BitSet FOLLOW_paramList_in_funcDecl227 = new BitSet(new long[]{0x00010C0040100058L});
	public static final BitSet FOLLOW_varDeclList_in_funcDecl230 = new BitSet(new long[]{0x00010C0040000058L});
	public static final BitSet FOLLOW_stmtList_in_funcDecl233 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_param_in_paramList246 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_PARAM_in_param260 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_param262 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_param264 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_stmt_in_stmtList280 = new BitSet(new long[]{0x00010C0040000052L});
	public static final BitSet FOLLOW_blockStmt_in_stmt292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignStmt_in_stmt297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condStmt_in_stmt302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStmt_in_stmt307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callStmt_in_stmt312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outStmt_in_stmt318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_blockStmt331 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stmtList_in_blockStmt333 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_30_in_assignStmt350 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignStmt352 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_assignStmt354 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_42_in_condStmt375 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_condStmt377 = new BitSet(new long[]{0x00010C0040000050L});
	public static final BitSet FOLLOW_stmt_in_condStmt382 = new BitSet(new long[]{0x00010C0040000050L});
	public static final BitSet FOLLOW_stmt_in_condStmt386 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_48_in_whileStmt406 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_whileStmt408 = new BitSet(new long[]{0x00010C0040000050L});
	public static final BitSet FOLLOW_stmt_in_whileStmt411 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CALL_in_callStmt439 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_callStmt441 = new BitSet(new long[]{0x0000001F16405868L});
	public static final BitSet FOLLOW_argList_in_callStmt443 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_argList463 = new BitSet(new long[]{0x0000001F16405862L});
	public static final BitSet FOLLOW_43_in_outStmt477 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_outStmt479 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_43_in_outStmt486 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_outStmt488 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_34_in_expr514 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr518 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr523 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_expr537 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr541 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr546 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_32_in_expr560 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr564 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr569 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_33_in_expr583 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr587 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr592 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_36_in_expr606 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr610 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr615 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_35_in_expr629 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr633 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr638 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_26_in_expr652 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr656 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr661 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_28_in_expr675 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr679 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr684 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_25_in_expr698 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr702 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr707 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATION_in_expr719 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr723 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_expr734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_expr743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_expr752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callStmt_in_expr761 = new BitSet(new long[]{0x0000000000000002L});
}
