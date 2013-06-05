// $ANTLR 3.5 C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g 2013-04-25 14:26:45

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
public class LittleNicMethodWalker extends TreeParser {
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


	public LittleNicMethodWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public LittleNicMethodWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return LittleNicMethodWalker.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g"; }


		
	    public ErrorReporter err;
	    
		public HashMap<String, String> globals = new HashMap<String, String>();
		public HashMap<String, HashMap<String, String>> methods
					= new HashMap<String, HashMap<String, String>>();
		
		public boolean inMethod = false;
			
	    // if variable in scope
	    public boolean inScope(String id) {
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:57:1: prog : ^( ID ( declList )? ( stmtList )? ) ;
	public final void prog() throws RecognitionException {
		Scope_stack.push(new Scope_scope());


			Scope_stack.peek().scopeMap = globals;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:62:2: ( ^( ID ( declList )? ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:62:4: ^( ID ( declList )? ( stmtList )? )
			{
			match(input,ID,FOLLOW_ID_in_prog75); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:62:9: ( declList )?
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FUNC||LA1_0==PROC||LA1_0==VARDECL) ) {
					alt1=1;
				}
				switch (alt1) {
					case 1 :
						// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:62:9: declList
						{
						pushFollow(FOLLOW_declList_in_prog77);
						declList();
						state._fsp--;

						}
						break;

				}

				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:62:19: ( stmtList )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==BLOCK||LA2_0==CALL||LA2_0==30||(LA2_0 >= 42 && LA2_0 <= 43)||LA2_0==48) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:62:19: stmtList
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:65:1: declList : ( decl )+ ;
	public final void declList() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:66:2: ( ( decl )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:66:4: ( decl )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:66:4: ( decl )+
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:66:4: decl
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:69:1: decl : ( varDecl | procDecl | funcDecl );
	public final void decl() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:70:2: ( varDecl | procDecl | funcDecl )
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:70:4: varDecl
					{
					pushFollow(FOLLOW_varDecl_in_decl107);
					varDecl();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:71:4: procDecl
					{
					pushFollow(FOLLOW_procDecl_in_decl112);
					procDecl();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:72:4: funcDecl
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:75:1: varDeclList : ( varDecl )+ ;
	public final void varDeclList() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:76:2: ( ( varDecl )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:76:4: ( varDecl )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:76:4: ( varDecl )+
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:76:4: varDecl
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:79:1: varDecl : ^( VARDECL TYPE ID ) ;
	public final void varDecl() throws RecognitionException {
		Scope_stack.push(new Scope_scope());

		CommonTree ID1=null;
		CommonTree TYPE2=null;


			Scope_stack.peek().scopeMap = new HashMap<String, String>();

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:87:2: ( ^( VARDECL TYPE ID ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:87:4: ^( VARDECL TYPE ID )
			{
			match(input,VARDECL,FOLLOW_VARDECL_in_varDecl156); 
			match(input, Token.DOWN, null); 
			TYPE2=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_varDecl158); 
			ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_varDecl160); 
			match(input, Token.UP, null); 


						if (inMethod) {
							if (!globals.containsKey((ID1!=null?ID1.getText():null))) {
								Scope_stack.peek().scopeMap.put((ID1!=null?ID1.getText():null), (TYPE2!=null?TYPE2.getText():null));
								Scope_stack.elementAt(Scope_stack.size()-1-1).scopeMap.put((ID1!=null?ID1.getText():null), (TYPE2!=null?TYPE2.getText():null));
							} else {
								err.reportNameError((ID1!=null?ID1.getLine():0), (ID1!=null?ID1.getCharPositionInLine():0), (ID1!=null?ID1.getText():null));
								throw new RuntimeException();
							}
						}
					
			}


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
	// $ANTLR end "varDecl"



	// $ANTLR start "procDecl"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:101:1: procDecl : ^( PROC ID ( paramList )? ( varDeclList )? ( stmtList )? ) ;
	public final void procDecl() throws RecognitionException {
		Scope_stack.push(new Scope_scope());


			Scope_stack.peek().scopeMap = new HashMap<String, String>();
			inMethod = true;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:111:2: ( ^( PROC ID ( paramList )? ( varDeclList )? ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:111:4: ^( PROC ID ( paramList )? ( varDeclList )? ( stmtList )? )
			{
			match(input,PROC,FOLLOW_PROC_in_procDecl192); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_procDecl194); 
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:111:14: ( paramList )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==PARAM) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:111:14: paramList
					{
					pushFollow(FOLLOW_paramList_in_procDecl196);
					paramList();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:111:25: ( varDeclList )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==VARDECL) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:111:25: varDeclList
					{
					pushFollow(FOLLOW_varDeclList_in_procDecl199);
					varDeclList();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:111:38: ( stmtList )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==BLOCK||LA8_0==CALL||LA8_0==30||(LA8_0 >= 42 && LA8_0 <= 43)||LA8_0==48) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:111:38: stmtList
					{
					pushFollow(FOLLOW_stmtList_in_procDecl202);
					stmtList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			}


				Scope_stack.peek().scopeMap.clear();
				inMethod = false;

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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:114:1: funcDecl : ^( FUNC TYPE ID ( paramList )? ( varDeclList )? ( stmtList )? ) ;
	public final void funcDecl() throws RecognitionException {
		Scope_stack.push(new Scope_scope());


			Scope_stack.peek().scopeMap = new HashMap<String, String>();
			inMethod = true;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:124:2: ( ^( FUNC TYPE ID ( paramList )? ( varDeclList )? ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:124:4: ^( FUNC TYPE ID ( paramList )? ( varDeclList )? ( stmtList )? )
			{
			match(input,FUNC,FOLLOW_FUNC_in_funcDecl232); 
			match(input, Token.DOWN, null); 
			match(input,TYPE,FOLLOW_TYPE_in_funcDecl234); 
			match(input,ID,FOLLOW_ID_in_funcDecl236); 
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:124:19: ( paramList )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==PARAM) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:124:19: paramList
					{
					pushFollow(FOLLOW_paramList_in_funcDecl238);
					paramList();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:124:30: ( varDeclList )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==VARDECL) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:124:30: varDeclList
					{
					pushFollow(FOLLOW_varDeclList_in_funcDecl241);
					varDeclList();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:124:43: ( stmtList )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==BLOCK||LA11_0==CALL||LA11_0==30||(LA11_0 >= 42 && LA11_0 <= 43)||LA11_0==48) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:124:43: stmtList
					{
					pushFollow(FOLLOW_stmtList_in_funcDecl244);
					stmtList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			}


				Scope_stack.peek().scopeMap.clear();
				inMethod = false;

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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:127:1: paramList : ( param )+ ;
	public final void paramList() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:128:2: ( ( param )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:128:4: ( param )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:128:4: ( param )+
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:128:4: param
					{
					pushFollow(FOLLOW_param_in_paramList257);
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:131:1: param : ^( PARAM TYPE ID ) ;
	public final void param() throws RecognitionException {
		CommonTree ID3=null;
		CommonTree TYPE4=null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:132:2: ( ^( PARAM TYPE ID ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:132:4: ^( PARAM TYPE ID )
			{
			match(input,PARAM,FOLLOW_PARAM_in_param271); 
			match(input, Token.DOWN, null); 
			TYPE4=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_param273); 
			ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_param275); 
			match(input, Token.UP, null); 


						Scope_stack.peek().scopeMap.put((ID3!=null?ID3.getText():null), (TYPE4!=null?TYPE4.getText():null));
					
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:138:1: stmtList : ( stmt )+ ;
	public final void stmtList() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:139:2: ( ( stmt )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:139:4: ( stmt )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:139:4: ( stmt )+
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:139:4: stmt
					{
					pushFollow(FOLLOW_stmt_in_stmtList291);
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:142:1: stmt : ( blockStmt | assignStmt | condStmt | whileStmt | callStmt[false] | outStmt );
	public final void stmt() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:143:2: ( blockStmt | assignStmt | condStmt | whileStmt | callStmt[false] | outStmt )
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:143:4: blockStmt
					{
					pushFollow(FOLLOW_blockStmt_in_stmt303);
					blockStmt();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:144:4: assignStmt
					{
					pushFollow(FOLLOW_assignStmt_in_stmt308);
					assignStmt();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:145:4: condStmt
					{
					pushFollow(FOLLOW_condStmt_in_stmt313);
					condStmt();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:146:4: whileStmt
					{
					pushFollow(FOLLOW_whileStmt_in_stmt318);
					whileStmt();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:147:4: callStmt[false]
					{
					pushFollow(FOLLOW_callStmt_in_stmt323);
					callStmt(false);
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:148:4: outStmt
					{
					pushFollow(FOLLOW_outStmt_in_stmt329);
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:151:1: blockStmt : ^( BLOCK ( stmtList )? ) ;
	public final void blockStmt() throws RecognitionException {
		Scope_stack.push(new Scope_scope());


			Scope_stack.peek().scopeMap = new HashMap<String, String>();
			

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:160:2: ( ^( BLOCK ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:160:4: ^( BLOCK ( stmtList )? )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_blockStmt357); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:160:12: ( stmtList )?
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==BLOCK||LA15_0==CALL||LA15_0==30||(LA15_0 >= 42 && LA15_0 <= 43)||LA15_0==48) ) {
					alt15=1;
				}
				switch (alt15) {
					case 1 :
						// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:160:12: stmtList
						{
						pushFollow(FOLLOW_stmtList_in_blockStmt359);
						stmtList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			}


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
	// $ANTLR end "blockStmt"



	// $ANTLR start "assignStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:163:1: assignStmt : ^(op= ':=' ID expr[false, null] ) ;
	public final void assignStmt() throws RecognitionException {
		CommonTree op=null;
		CommonTree ID6=null;
		TreeRuleReturnScope expr5 =null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:164:2: ( ^(op= ':=' ID expr[false, null] ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:164:4: ^(op= ':=' ID expr[false, null] )
			{
			op=(CommonTree)match(input,30,FOLLOW_30_in_assignStmt376); 
			match(input, Token.DOWN, null); 
			ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_assignStmt378); 
			pushFollow(FOLLOW_expr_in_assignStmt380);
			expr5=expr(false, null);
			state._fsp--;

			match(input, Token.UP, null); 


						if ((expr5!=null?((LittleNicMethodWalker.expr_return)expr5).type:null) == null) { // error if procedure
							err.reportUndeclaredError((ID6!=null?ID6.getLine():0), (op!=null?op.getCharPositionInLine():0), (expr5!=null?((LittleNicMethodWalker.expr_return)expr5).text:null));
							throw new RuntimeException();
						}
						
						if (inScope((ID6!=null?ID6.getText():null))) { // if defined
							
							String type = globals.get((ID6!=null?ID6.getText():null));
							
							if (type != null) {
								if (!sameType(type , (expr5!=null?((LittleNicMethodWalker.expr_return)expr5).type:null))) {
									err.reportTypeError((ID6!=null?ID6.getLine():0), (ID6!=null?ID6.getText():null),
										type, (expr5!=null?((LittleNicMethodWalker.expr_return)expr5).text:null), (expr5!=null?((LittleNicMethodWalker.expr_return)expr5).type:null));
									throw new RuntimeException();
								} else if (type == null) { // no return type
									// correct types so procedure then error
									err.reportUndeclaredError((ID6!=null?ID6.getLine():0), (ID6!=null?ID6.getCharPositionInLine():0), (ID6!=null?ID6.getText():null));
									throw new RuntimeException();
								}
							}
							
						} else {
							err.reportUndeclaredError((ID6!=null?ID6.getLine():0), (ID6!=null?ID6.getCharPositionInLine():0), (ID6!=null?ID6.getText():null));
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
	// $ANTLR end "assignStmt"



	// $ANTLR start "condStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:194:1: condStmt : ^(op= 'IF' expr[false, null] s1= stmt s2= stmt ) ;
	public final void condStmt() throws RecognitionException {
		CommonTree op=null;
		TreeRuleReturnScope expr7 =null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:195:2: ( ^(op= 'IF' expr[false, null] s1= stmt s2= stmt ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:195:4: ^(op= 'IF' expr[false, null] s1= stmt s2= stmt )
			{
			op=(CommonTree)match(input,42,FOLLOW_42_in_condStmt401); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expr_in_condStmt403);
			expr7=expr(false, null);
			state._fsp--;

			pushFollow(FOLLOW_stmt_in_condStmt408);
			stmt();
			state._fsp--;

			pushFollow(FOLLOW_stmt_in_condStmt412);
			stmt();
			state._fsp--;

			match(input, Token.UP, null); 


						if (!(expr7!=null?((LittleNicMethodWalker.expr_return)expr7).type:null).equals("TRUTH")) {
							err.reportTypeError((op!=null?op.getLine():0), (expr7!=null?((LittleNicMethodWalker.expr_return)expr7).text:null),
								(expr7!=null?((LittleNicMethodWalker.expr_return)expr7).type:null), "Expected", "TRUTH");
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:205:1: whileStmt : ^(op= 'WHILE' expr[false, null] stmt ) ;
	public final void whileStmt() throws RecognitionException {
		CommonTree op=null;
		TreeRuleReturnScope expr8 =null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:206:2: ( ^(op= 'WHILE' expr[false, null] stmt ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:206:4: ^(op= 'WHILE' expr[false, null] stmt )
			{
			op=(CommonTree)match(input,48,FOLLOW_48_in_whileStmt432); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expr_in_whileStmt434);
			expr8=expr(false, null);
			state._fsp--;

			pushFollow(FOLLOW_stmt_in_whileStmt437);
			stmt();
			state._fsp--;

			match(input, Token.UP, null); 


						if (!(expr8!=null?((LittleNicMethodWalker.expr_return)expr8).type:null).equals("TRUTH")) {
							err.reportTypeError((op!=null?op.getLine():0), (expr8!=null?((LittleNicMethodWalker.expr_return)expr8).text:null),
								(expr8!=null?((LittleNicMethodWalker.expr_return)expr8).type:null), "Expected", "TRUTH");
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:216:1: callStmt[boolean isAssign] returns [String type, String text] : ^( CALL ID ( argList[args] )? ) ;
	public final LittleNicMethodWalker.callStmt_return callStmt(boolean isAssign) throws RecognitionException {
		LittleNicMethodWalker.callStmt_return retval = new LittleNicMethodWalker.callStmt_return();
		retval.start = input.LT(1);

		CommonTree ID9=null;
		CommonTree CALL10=null;


			ArrayList<Pair> args = new ArrayList<Pair>();

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:220:2: ( ^( CALL ID ( argList[args] )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:220:4: ^( CALL ID ( argList[args] )? )
			{
			CALL10=(CommonTree)match(input,CALL,FOLLOW_CALL_in_callStmt465); 
			match(input, Token.DOWN, null); 
			ID9=(CommonTree)match(input,ID,FOLLOW_ID_in_callStmt467); 
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:220:14: ( argList[args] )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( ((LA16_0 >= BOOLEAN && LA16_0 <= CALL)||(LA16_0 >= ID && LA16_0 <= INTEGER)||LA16_0==NEGATION||LA16_0==22||(LA16_0 >= 25 && LA16_0 <= 26)||LA16_0==28||(LA16_0 >= 32 && LA16_0 <= 36)) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:220:14: argList[args]
					{
					pushFollow(FOLLOW_argList_in_callStmt469);
					argList(args);
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 


						Collections.reverse(args);
						
						if (methods.containsKey((ID9!=null?ID9.getText():null))) {
						
							// if it is a function call with no assignment
							if (!isAssign && (globals.get((ID9!=null?ID9.getText():null)) != null)) {
								err.reportUndeclaredError((ID9!=null?ID9.getLine():0), (ID9!=null?ID9.getCharPositionInLine():0), (ID9!=null?ID9.getText():null));
								throw new RuntimeException();
							}
							
							retval.text = (ID9!=null?ID9.getText():null);
							retval.type = globals.get(retval.text);
							
							// check argument types
							int count = 0;
							Iterator itr = methods.get(retval.text).entrySet().iterator();
							
							// for each method parameter
						    while (itr.hasNext() && count < args.size()) {
						        Map.Entry pair = (Map.Entry) itr.next();
						        String callArgType = args.get(count).getType();
						        
						        if (callArgType == null
						        	&& globals.containsKey(args.get(count).getName())) {
						        	callArgType = globals.get(args.get(count).getName());
						        }
						        
						        // if the arguments are not valid
						        if (!callArgType.equals(pair.getValue())) {
									err.reportTypeError((CALL10!=null?CALL10.getLine():0),
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
								
								err.reportTypeError((CALL10!=null?CALL10.getLine():0), "Expected",
									params,	"Given", argmts);
								throw new RuntimeException();
							}
							
						} else {
							err.reportUndeclaredError((ID9!=null?ID9.getLine():0), (ID9!=null?ID9.getCharPositionInLine():0), (ID9!=null?ID9.getText():null));
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:301:1: argList[ArrayList<Pair> args] : ( expr[true, args] )+ ;
	public final void argList(ArrayList<Pair> args) throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:302:2: ( ( expr[true, args] )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:302:4: ( expr[true, args] )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:302:4: ( expr[true, args] )+
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:302:4: expr[true, args]
					{
					pushFollow(FOLLOW_expr_in_argList489);
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:305:1: outStmt : ( ^( 'OUTPUT' STRING ) | ^( 'OUTPUT' ID ) );
	public final void outStmt() throws RecognitionException {
		CommonTree ID11=null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:306:2: ( ^( 'OUTPUT' STRING ) | ^( 'OUTPUT' ID ) )
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:306:4: ^( 'OUTPUT' STRING )
					{
					match(input,43,FOLLOW_43_in_outStmt503); 
					match(input, Token.DOWN, null); 
					match(input,STRING,FOLLOW_STRING_in_outStmt505); 
					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:307:4: ^( 'OUTPUT' ID )
					{
					match(input,43,FOLLOW_43_in_outStmt512); 
					match(input, Token.DOWN, null); 
					ID11=(CommonTree)match(input,ID,FOLLOW_ID_in_outStmt514); 
					match(input, Token.UP, null); 


								if (!inScope((ID11!=null?ID11.getText():null))) {
									err.reportUndeclaredError((ID11!=null?ID11.getLine():0), (ID11!=null?ID11.getCharPositionInLine():0), (ID11!=null?ID11.getText():null));
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:316:1: expr[boolean isArg, ArrayList<Pair> args] returns [String text, String type] : ( ^(op= '==' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '!=' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '<' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '<=' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '>=' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '>' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '+' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '-' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '*' e1= expr[false, null] e2= expr[false, null] ) | ^( NEGATION e1= expr[false, null] ) | ID | INTEGER | BOOLEAN | callStmt[true] );
	public final LittleNicMethodWalker.expr_return expr(boolean isArg, ArrayList<Pair> args) throws RecognitionException {
		LittleNicMethodWalker.expr_return retval = new LittleNicMethodWalker.expr_return();
		retval.start = input.LT(1);

		CommonTree op=null;
		CommonTree ID12=null;
		CommonTree INTEGER13=null;
		CommonTree BOOLEAN14=null;
		TreeRuleReturnScope e1 =null;
		TreeRuleReturnScope e2 =null;
		TreeRuleReturnScope callStmt15 =null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:318:2: ( ^(op= '==' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '!=' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '<' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '<=' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '>=' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '>' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '+' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '-' e1= expr[false, null] e2= expr[false, null] ) | ^(op= '*' e1= expr[false, null] e2= expr[false, null] ) | ^( NEGATION e1= expr[false, null] ) | ID | INTEGER | BOOLEAN | callStmt[true] )
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:318:4: ^(op= '==' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,34,FOLLOW_34_in_expr540); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr544);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr549);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "TRUTH";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null), (e1!=null?((LittleNicMethodWalker.expr_return)e1).type:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null) + " == " + (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:329:4: ^(op= '!=' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,22,FOLLOW_22_in_expr563); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr567);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr572);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "TRUTH";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null), (e1!=null?((LittleNicMethodWalker.expr_return)e1).type:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null) + " != " + (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 3 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:340:4: ^(op= '<' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,32,FOLLOW_32_in_expr586); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr590);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr595);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "TRUTH";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null), (e1!=null?((LittleNicMethodWalker.expr_return)e1).type:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null) + " < " + (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 4 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:351:4: ^(op= '<=' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,33,FOLLOW_33_in_expr609); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr613);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr618);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "TRUTH";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null), (e1!=null?((LittleNicMethodWalker.expr_return)e1).type:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null) + " <= " + (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 5 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:362:4: ^(op= '>=' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,36,FOLLOW_36_in_expr632); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr636);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr641);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "TRUTH";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null), (e1!=null?((LittleNicMethodWalker.expr_return)e1).type:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null) + " >= " + (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 6 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:373:4: ^(op= '>' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,35,FOLLOW_35_in_expr655); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr659);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr664);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "TRUTH";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null), (e1!=null?((LittleNicMethodWalker.expr_return)e1).type:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null) + " > " + (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 7 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:384:4: ^(op= '+' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,26,FOLLOW_26_in_expr678); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr682);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr687);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "COUNT";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null), (e1!=null?((LittleNicMethodWalker.expr_return)e1).type:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null) + " + " + (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 8 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:395:4: ^(op= '-' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,28,FOLLOW_28_in_expr701); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr705);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr710);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "COUNT";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null), (e1!=null?((LittleNicMethodWalker.expr_return)e1).type:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null) + " - " + (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 9 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:406:4: ^(op= '*' e1= expr[false, null] e2= expr[false, null] )
					{
					op=(CommonTree)match(input,25,FOLLOW_25_in_expr724); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr728);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr733);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								retval.type = "COUNT";
								checkTypes((op!=null?op.getLine():0), (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null), (e1!=null?((LittleNicMethodWalker.expr_return)e1).type:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null), (e2!=null?((LittleNicMethodWalker.expr_return)e2).type:null));
								retval.text = (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null) + " * " + (e2!=null?((LittleNicMethodWalker.expr_return)e2).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 10 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:417:4: ^( NEGATION e1= expr[false, null] )
					{
					match(input,NEGATION,FOLLOW_NEGATION_in_expr745); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr749);
					e1=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								String eType = (e1!=null?((LittleNicMethodWalker.expr_return)e1).type:null);
								if (eType.equals("COUNT")) {
									retval.type = "COUNT";
								}
								retval.text = "-" + (e1!=null?((LittleNicMethodWalker.expr_return)e1).text:null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 11 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:430:4: ID
					{
					ID12=(CommonTree)match(input,ID,FOLLOW_ID_in_expr760); 

								String id = (ID12!=null?ID12.getText():null);
								retval.text = id;
								if (inScope(id)) {
									retval.type = Scope_stack.peek().scopeMap.get(id);
								} else {
									err.reportUndeclaredError((ID12!=null?ID12.getLine():0), (ID12!=null?ID12.getCharPositionInLine():0), (ID12!=null?ID12.getText():null));
									throw new RuntimeException();
								}
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
								if (retval.type == null && globals.containsKey(id)) {
						        	retval.type = globals.get(id);
						        }
							
					}
					break;
				case 12 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:449:4: INTEGER
					{
					INTEGER13=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_expr769); 

								retval.type = "COUNT";
								retval.text = (INTEGER13!=null?INTEGER13.getText():null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 13 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:459:4: BOOLEAN
					{
					BOOLEAN14=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_expr778); 

								retval.type = "TRUTH";
								retval.text = (BOOLEAN14!=null?BOOLEAN14.getText():null);
								if (isArg) {
									Pair p = new Pair();
									p.put(retval.text, retval.type);
									args.add(p);
								}
							
					}
					break;
				case 14 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicMethodWalker.g:469:4: callStmt[true]
					{
					pushFollow(FOLLOW_callStmt_in_expr787);
					callStmt15=callStmt(true);
					state._fsp--;


								retval.type = (callStmt15!=null?((LittleNicMethodWalker.callStmt_return)callStmt15).type:null);
								retval.text = (callStmt15!=null?((LittleNicMethodWalker.callStmt_return)callStmt15).text:null);
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
	public static final BitSet FOLLOW_VARDECL_in_varDecl156 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_varDecl158 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_varDecl160 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PROC_in_procDecl192 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_procDecl194 = new BitSet(new long[]{0x00010C0040108058L});
	public static final BitSet FOLLOW_paramList_in_procDecl196 = new BitSet(new long[]{0x00010C0040100058L});
	public static final BitSet FOLLOW_varDeclList_in_procDecl199 = new BitSet(new long[]{0x00010C0040000058L});
	public static final BitSet FOLLOW_stmtList_in_procDecl202 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_in_funcDecl232 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_funcDecl234 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_funcDecl236 = new BitSet(new long[]{0x00010C0040108058L});
	public static final BitSet FOLLOW_paramList_in_funcDecl238 = new BitSet(new long[]{0x00010C0040100058L});
	public static final BitSet FOLLOW_varDeclList_in_funcDecl241 = new BitSet(new long[]{0x00010C0040000058L});
	public static final BitSet FOLLOW_stmtList_in_funcDecl244 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_param_in_paramList257 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_PARAM_in_param271 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_param273 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_param275 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_stmt_in_stmtList291 = new BitSet(new long[]{0x00010C0040000052L});
	public static final BitSet FOLLOW_blockStmt_in_stmt303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignStmt_in_stmt308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condStmt_in_stmt313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStmt_in_stmt318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callStmt_in_stmt323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outStmt_in_stmt329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_blockStmt357 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stmtList_in_blockStmt359 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_30_in_assignStmt376 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignStmt378 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_assignStmt380 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_42_in_condStmt401 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_condStmt403 = new BitSet(new long[]{0x00010C0040000050L});
	public static final BitSet FOLLOW_stmt_in_condStmt408 = new BitSet(new long[]{0x00010C0040000050L});
	public static final BitSet FOLLOW_stmt_in_condStmt412 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_48_in_whileStmt432 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_whileStmt434 = new BitSet(new long[]{0x00010C0040000050L});
	public static final BitSet FOLLOW_stmt_in_whileStmt437 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CALL_in_callStmt465 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_callStmt467 = new BitSet(new long[]{0x0000001F16405868L});
	public static final BitSet FOLLOW_argList_in_callStmt469 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_argList489 = new BitSet(new long[]{0x0000001F16405862L});
	public static final BitSet FOLLOW_43_in_outStmt503 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_outStmt505 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_43_in_outStmt512 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_outStmt514 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_34_in_expr540 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr544 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr549 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_expr563 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr567 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr572 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_32_in_expr586 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr590 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr595 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_33_in_expr609 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr613 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr618 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_36_in_expr632 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr636 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr641 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_35_in_expr655 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr659 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr664 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_26_in_expr678 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr682 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr687 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_28_in_expr701 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr705 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr710 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_25_in_expr724 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr728 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr733 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATION_in_expr745 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr749 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_expr760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_expr769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_expr778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callStmt_in_expr787 = new BitSet(new long[]{0x0000000000000002L});
}
