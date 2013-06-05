// $ANTLR 3.5 C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g 2013-04-25 16:13:18

	import java.util.ArrayList;
	import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LittleNicCodeGen extends TreeParser {
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


	public LittleNicCodeGen(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public LittleNicCodeGen(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return LittleNicCodeGen.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g"; }



		private int i = 0;
		
		public HashMap<String, String> globals;
		public boolean inMethod = false;
		
		public boolean inDynamicScope(String id) {
	   		for (int s = Scope_stack.size() - 1; s >= 0; s--) {
	    		if (Scope_stack.elementAt(s).scopeMap.containsKey(id)) {
	    			return true;
	    		}
	    	}
	    	return false;
	    }
		
		private String indent() {
			String indentation = "";
			for (int m = 0; m < i; m++) {
				indentation = indentation.concat("\t");
			}
			return indentation;
		}
		



	// $ANTLR start "prog"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:44:1: prog[String className] returns [String out] : ^( ID ( declList )? ( stmtList )? ) ;
	public final String prog(String className) throws RecognitionException {
		Scope_stack.push(new Scope_scope());

		String out = null;


		String declList1 =null;
		String stmtList2 =null;


			Scope_stack.peek().scopeMap = globals;
			out = "";

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:53:2: ( ^( ID ( declList )? ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:53:4: ^( ID ( declList )? ( stmtList )? )
			{
			match(input,ID,FOLLOW_ID_in_prog86); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:53:9: ( declList )?
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FUNC||LA1_0==PROC||LA1_0==VARDECL) ) {
					alt1=1;
				}
				switch (alt1) {
					case 1 :
						// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:53:9: declList
						{
						pushFollow(FOLLOW_declList_in_prog88);
						declList1=declList();
						state._fsp--;

						}
						break;

				}

				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:53:19: ( stmtList )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==BLOCK||LA2_0==CALL||LA2_0==30||(LA2_0 >= 42 && LA2_0 <= 43)||LA2_0==48) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:53:19: stmtList
						{
						pushFollow(FOLLOW_stmtList_in_prog91);
						stmtList2=stmtList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}


					
						String decls = "";
						if (declList1 != null) {
							decls = declList1;
						}
					
						i++;
						out =
							"\npublic class " + className + " {\n\n" +
							indent() + decls + "\n" +
							indent() + "public static void main(String[] args) {\n";
						i++;
						out =
							out.concat(
								indent() + stmtList2
							);
						i--;
						out =
							out.concat(
								"\n\n" + indent() + "}"
							);
						i--;
						out =
							out.concat(
								"\n\n}"
							);
					
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
		return out;
	}
	// $ANTLR end "prog"



	// $ANTLR start "declList"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:84:1: declList returns [String out] : ( decl[list] )+ ;
	public final String declList() throws RecognitionException {
		String out = null;



			ArrayList<String> list = new ArrayList<String>();
			out = "";

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:89:2: ( ( decl[list] )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:89:4: ( decl[list] )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:89:4: ( decl[list] )+
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:89:4: decl[list]
					{
					pushFollow(FOLLOW_decl_in_declList118);
					decl(list);
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


						i++;
						out = list.get(0);
						for (int i = 1; i < list.size(); i++) {
							out = out.concat("\n" + indent() + list.get(i));
						}
						i--;
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return out;
	}
	// $ANTLR end "declList"



	// $ANTLR start "decl"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:100:1: decl[ArrayList<String> list] : ( varDecl[list] | procDecl | funcDecl );
	public final void decl(ArrayList<String> list) throws RecognitionException {
		String varDecl3 =null;
		String procDecl4 =null;
		String funcDecl5 =null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:101:2: ( varDecl[list] | procDecl | funcDecl )
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:101:4: varDecl[list]
					{
					pushFollow(FOLLOW_varDecl_in_decl138);
					varDecl3=varDecl(list);
					state._fsp--;

					list.add(varDecl3);
					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:103:4: procDecl
					{
					pushFollow(FOLLOW_procDecl_in_decl148);
					procDecl4=procDecl();
					state._fsp--;

					list.add(procDecl4);
					}
					break;
				case 3 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:105:4: funcDecl
					{
					pushFollow(FOLLOW_funcDecl_in_decl157);
					funcDecl5=funcDecl();
					state._fsp--;

					list.add(funcDecl5);
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:109:1: varDeclList returns [String out] : ( varDecl[list] )+ ;
	public final String varDeclList() throws RecognitionException {
		String out = null;



			ArrayList<String> list = new ArrayList<String>();
			out = "";

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:114:2: ( ( varDecl[list] )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:114:4: ( varDecl[list] )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:114:4: ( varDecl[list] )+
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:114:4: varDecl[list]
					{
					pushFollow(FOLLOW_varDecl_in_varDeclList181);
					varDecl(list);
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


						if (!list.isEmpty()) {
							i++;
							out = list.get(0);
							for (int i = 1; i < list.size(); i++) {
								out = out.concat("\n" + indent() + indent() + list.get(i));
							}
							i--;
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
		return out;
	}
	// $ANTLR end "varDeclList"



	// $ANTLR start "varDecl"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:127:1: varDecl[ArrayList<String> list] returns [String out] : ^( VARDECL TYPE ID ) ;
	public final String varDecl(ArrayList<String> list) throws RecognitionException {
		String out = null;


		CommonTree TYPE6=null;
		CommonTree ID7=null;


			out = "";

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:131:2: ( ^( VARDECL TYPE ID ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:131:4: ^( VARDECL TYPE ID )
			{
			match(input,VARDECL,FOLLOW_VARDECL_in_varDecl210); 
			match(input, Token.DOWN, null); 
			TYPE6=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_varDecl212); 
			ID7=(CommonTree)match(input,ID,FOLLOW_ID_in_varDecl214); 
			match(input, Token.UP, null); 


						String type = "";
						if ((TYPE6!=null?TYPE6.getText():null).equals("COUNT")) {
							type = "int";
						} else if ((TYPE6!=null?TYPE6.getText():null).equals("TRUTH")) {
							type = "boolean";
						}
						
						if (inMethod) {
							if (inDynamicScope((ID7!=null?ID7.getText():null))) { // if already defined
								// if local
								if (Scope_stack.peek().scopeMap.containsKey((ID7!=null?ID7.getText():null))) {
									// and not same type
									if (!Scope_stack.peek().scopeMap.get((ID7!=null?ID7.getText():null)).equals((TYPE6!=null?TYPE6.getText():null))) {
										list.add(type + " _" + (ID7!=null?ID7.getText():null) + ";");
									} else {
									
									}
								} else { // global
									list.add(type + " local_" + (ID7!=null?ID7.getText():null) + ";");
								}
							} else {
								list.add(type + " _" + (ID7!=null?ID7.getText():null) + ";");
							}
						} else {
							out = "static " + type + " _" + (ID7!=null?ID7.getText():null) + ";";
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
		return out;
	}
	// $ANTLR end "varDecl"



	// $ANTLR start "procDecl"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:163:1: procDecl returns [String out] : ^( PROC ID ( paramList )? ( varDeclList )? ( stmtList )? ) ;
	public final String procDecl() throws RecognitionException {
		Scope_stack.push(new Scope_scope());

		String out = null;


		CommonTree ID11=null;
		String paramList8 =null;
		String varDeclList9 =null;
		String stmtList10 =null;


			inMethod = true;
			Scope_stack.peek().scopeMap = new HashMap<String, String>();
			out = "";

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:174:2: ( ^( PROC ID ( paramList )? ( varDeclList )? ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:174:4: ^( PROC ID ( paramList )? ( varDeclList )? ( stmtList )? )
			{
			match(input,PROC,FOLLOW_PROC_in_procDecl250); 
			match(input, Token.DOWN, null); 
			ID11=(CommonTree)match(input,ID,FOLLOW_ID_in_procDecl252); 
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:174:14: ( paramList )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==PARAM) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:174:14: paramList
					{
					pushFollow(FOLLOW_paramList_in_procDecl254);
					paramList8=paramList();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:174:25: ( varDeclList )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==VARDECL) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:174:25: varDeclList
					{
					pushFollow(FOLLOW_varDeclList_in_procDecl257);
					varDeclList9=varDeclList();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:174:38: ( stmtList )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==BLOCK||LA8_0==CALL||LA8_0==30||(LA8_0 >= 42 && LA8_0 <= 43)||LA8_0==48) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:174:38: stmtList
					{
					pushFollow(FOLLOW_stmtList_in_procDecl260);
					stmtList10=stmtList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 


					
						String params = "";
						if (paramList8 != null) {
							params = paramList8;
						}
						
						String varDecls = "";
						if (varDeclList9 != null) {
							varDecls = varDeclList9;
						}
						
						String stmts = "";
						if (stmtList10 != null) {
							stmts = stmtList10;
						}
					
						i++;
						out =
							"\n" + indent() + "static void _" + (ID11!=null?ID11.getText():null) +
							"(" + params + ") {\n\n";
						i++;
						out =
							out.concat(
								indent() + varDecls + "\n\n" +
								indent() + stmts + "\n\n"
							);
						i--;
						out =
							out.concat(
								indent() + "}\n"
							);
						i--;
					
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
		return out;
	}
	// $ANTLR end "procDecl"



	// $ANTLR start "funcDecl"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:211:1: funcDecl returns [String out] : ^( FUNC TYPE ID ( paramList )? ( varDeclList )? ( stmtList )? ) ;
	public final String funcDecl() throws RecognitionException {
		Scope_stack.push(new Scope_scope());

		String out = null;


		CommonTree TYPE12=null;
		CommonTree ID16=null;
		String paramList13 =null;
		String varDeclList14 =null;
		String stmtList15 =null;


			inMethod = true;
			Scope_stack.peek().scopeMap = new HashMap<String, String>();
			out = "";

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:222:2: ( ^( FUNC TYPE ID ( paramList )? ( varDeclList )? ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:222:4: ^( FUNC TYPE ID ( paramList )? ( varDeclList )? ( stmtList )? )
			{
			match(input,FUNC,FOLLOW_FUNC_in_funcDecl298); 
			match(input, Token.DOWN, null); 
			TYPE12=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_funcDecl300); 
			ID16=(CommonTree)match(input,ID,FOLLOW_ID_in_funcDecl302); 
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:222:19: ( paramList )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==PARAM) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:222:19: paramList
					{
					pushFollow(FOLLOW_paramList_in_funcDecl304);
					paramList13=paramList();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:222:30: ( varDeclList )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==VARDECL) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:222:30: varDeclList
					{
					pushFollow(FOLLOW_varDeclList_in_funcDecl307);
					varDeclList14=varDeclList();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:222:43: ( stmtList )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==BLOCK||LA11_0==CALL||LA11_0==30||(LA11_0 >= 42 && LA11_0 <= 43)||LA11_0==48) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:222:43: stmtList
					{
					pushFollow(FOLLOW_stmtList_in_funcDecl310);
					stmtList15=stmtList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 


					
						String type = "";
						if ((TYPE12!=null?TYPE12.getText():null).equals("COUNT")) {
							type = "int";
						} else if ((TYPE12!=null?TYPE12.getText():null).equals("TRUTH")) {
							type = "boolean";
						}
						
						String params = "";
						if (paramList13 != null) {
							params = paramList13;
						}
						
						String varDecls = "";
						if (varDeclList14 != null) {
							varDecls = varDeclList14;
						}
						
						String stmts = "";
						if (stmtList15 != null) {
							stmts = stmtList15;
						}
						
						i++;
						out =
							"\n" + indent() + "static " +  type + " _" + (ID16!=null?ID16.getText():null) +
							"(" + params + ") {\n\n";
						i++;
						out =
							out.concat(
								indent() + varDecls + "\n" +
								indent() + type + " _" + (ID16!=null?ID16.getText():null) + ";\n" +
								indent() + stmts + "\n\n" +
								indent() + "return _" + (ID16!=null?ID16.getText():null) + ";\n"
							);
						i--;
						out =
							out.concat(
								indent() + "}\n"
							);
						i--;
					
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
		return out;
	}
	// $ANTLR end "funcDecl"



	// $ANTLR start "paramList"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:268:1: paramList returns [String out] : ( param[list] )+ ;
	public final String paramList() throws RecognitionException {
		String out = null;



			ArrayList<String> list = new ArrayList<String>();
			out = "";

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:273:2: ( ( param[list] )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:273:4: ( param[list] )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:273:4: ( param[list] )+
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:273:4: param[list]
					{
					pushFollow(FOLLOW_param_in_paramList336);
					param(list);
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


						if (!list.isEmpty()) {
							out = list.get(0);
							for (int i = 1; i < list.size(); i++) {
								out = out.concat(", " + list.get(i));
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
		return out;
	}
	// $ANTLR end "paramList"



	// $ANTLR start "param"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:284:1: param[ArrayList<String> list] : ^( PARAM TYPE ID ) ;
	public final void param(ArrayList<String> list) throws RecognitionException {
		CommonTree TYPE17=null;
		CommonTree ID18=null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:285:2: ( ^( PARAM TYPE ID ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:285:4: ^( PARAM TYPE ID )
			{
			match(input,PARAM,FOLLOW_PARAM_in_param357); 
			match(input, Token.DOWN, null); 
			TYPE17=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_param359); 
			ID18=(CommonTree)match(input,ID,FOLLOW_ID_in_param361); 
			match(input, Token.UP, null); 


						String type = "";
						if ((TYPE17!=null?TYPE17.getText():null).equals("COUNT")) {
							type = "int";
						} else if ((TYPE17!=null?TYPE17.getText():null).equals("TRUTH")) {
							type = "boolean";
						}
						Scope_stack.peek().scopeMap.put((ID18!=null?ID18.getText():null), (TYPE17!=null?TYPE17.getText():null));
						list.add(type + " _" + (ID18!=null?ID18.getText():null));
					
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:298:1: stmtList returns [String out] : ( stmt[true, list] )+ ;
	public final String stmtList() throws RecognitionException {
		String out = null;



			ArrayList<String> list = new ArrayList<String>();
			out = "";

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:303:2: ( ( stmt[true, list] )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:303:4: ( stmt[true, list] )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:303:4: ( stmt[true, list] )+
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:303:4: stmt[true, list]
					{
					pushFollow(FOLLOW_stmt_in_stmtList386);
					stmt(true, list);
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


						if (!list.isEmpty()) {
							i+=3;
							out = list.get(0);
							for (int i = 1; i < list.size(); i++) {
								out = out.concat("\n" + indent() + list.get(i));
							}
							i-=3;
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
		return out;
	}
	// $ANTLR end "stmtList"



	// $ANTLR start "stmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:316:1: stmt[boolean inList, ArrayList<String> list] returns [String out] : ( blockStmt | assignStmt | condStmt | whileStmt | callStmt | outStmt );
	public final String stmt(boolean inList, ArrayList<String> list) throws RecognitionException {
		String out = null;


		String blockStmt19 =null;
		String assignStmt20 =null;
		String condStmt21 =null;
		String whileStmt22 =null;
		String callStmt23 =null;
		String outStmt24 =null;


			out = "";

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:320:2: ( blockStmt | assignStmt | condStmt | whileStmt | callStmt | outStmt )
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:320:4: blockStmt
					{
					pushFollow(FOLLOW_blockStmt_in_stmt414);
					blockStmt19=blockStmt();
					state._fsp--;

						
								out = blockStmt19;
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:327:4: assignStmt
					{
					pushFollow(FOLLOW_assignStmt_in_stmt423);
					assignStmt20=assignStmt();
					state._fsp--;


								out = assignStmt20;
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 3 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:334:4: condStmt
					{
					pushFollow(FOLLOW_condStmt_in_stmt432);
					condStmt21=condStmt();
					state._fsp--;


								out = condStmt21;
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 4 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:341:4: whileStmt
					{
					pushFollow(FOLLOW_whileStmt_in_stmt441);
					whileStmt22=whileStmt();
					state._fsp--;


								out = whileStmt22;
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 5 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:348:4: callStmt
					{
					pushFollow(FOLLOW_callStmt_in_stmt450);
					callStmt23=callStmt();
					state._fsp--;


								out = callStmt23 + ";";
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 6 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:355:4: outStmt
					{
					pushFollow(FOLLOW_outStmt_in_stmt459);
					outStmt24=outStmt();
					state._fsp--;


								out = outStmt24;
								if (inList) {
									list.add(out);
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
		return out;
	}
	// $ANTLR end "stmt"



	// $ANTLR start "blockStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:364:1: blockStmt returns [String out] : ^( BLOCK ( stmtList )? ) ;
	public final String blockStmt() throws RecognitionException {
		String out = null;


		String stmtList25 =null;


			out = "";

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:368:2: ( ^( BLOCK ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:368:4: ^( BLOCK ( stmtList )? )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_blockStmt485); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:368:12: ( stmtList )?
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==BLOCK||LA15_0==CALL||LA15_0==30||(LA15_0 >= 42 && LA15_0 <= 43)||LA15_0==48) ) {
					alt15=1;
				}
				switch (alt15) {
					case 1 :
						// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:368:12: stmtList
						{
						pushFollow(FOLLOW_stmtList_in_blockStmt487);
						stmtList25=stmtList();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			out = stmtList25;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return out;
	}
	// $ANTLR end "blockStmt"



	// $ANTLR start "assignStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:372:1: assignStmt returns [String out] : ^( ':=' ID expr[false, null] ) ;
	public final String assignStmt() throws RecognitionException {
		String out = null;


		CommonTree ID26=null;
		String expr27 =null;


			out = "";

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:376:2: ( ^( ':=' ID expr[false, null] ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:376:4: ^( ':=' ID expr[false, null] )
			{
			match(input,30,FOLLOW_30_in_assignStmt515); 
			match(input, Token.DOWN, null); 
			ID26=(CommonTree)match(input,ID,FOLLOW_ID_in_assignStmt517); 
			pushFollow(FOLLOW_expr_in_assignStmt519);
			expr27=expr(false, null);
			state._fsp--;

			match(input, Token.UP, null); 

			out = "_" + (ID26!=null?ID26.getText():null) + " = " + expr27 + ";";
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return out;
	}
	// $ANTLR end "assignStmt"



	// $ANTLR start "condStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:380:1: condStmt returns [String out] : ^( 'IF' expr[false, null] s1= stmt[false, null] s2= stmt[false, null] ) ;
	public final String condStmt() throws RecognitionException {
		String out = null;


		String s1 =null;
		String s2 =null;
		String expr28 =null;


			out = "";

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:384:2: ( ^( 'IF' expr[false, null] s1= stmt[false, null] s2= stmt[false, null] ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:384:4: ^( 'IF' expr[false, null] s1= stmt[false, null] s2= stmt[false, null] )
			{
			match(input,42,FOLLOW_42_in_condStmt547); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expr_in_condStmt549);
			expr28=expr(false, null);
			state._fsp--;

			pushFollow(FOLLOW_stmt_in_condStmt554);
			s1=stmt(false, null);
			state._fsp--;

			pushFollow(FOLLOW_stmt_in_condStmt559);
			s2=stmt(false, null);
			state._fsp--;

			match(input, Token.UP, null); 


					
						String statement1 = "";
						if (s1 != null) {
							statement1 = s1;
						}
						
						String statement2 = "";
						if (s2 != null) {
							//System.out.println(s2);
							statement2 = s2;
						}
						
						i+=2;
						out = "\n" + indent() + "if (" + expr28 + ") {\n";
						i++;
						out = out.concat(indent() + statement1 + "\n");
						i--;
						out = out.concat(indent() + "} else {\n");
						i++;
						out = out.concat(indent() + statement2 + "\n");
						i--;
						out = out.concat(indent() +"}");
						i-=2;
						
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return out;
	}
	// $ANTLR end "condStmt"



	// $ANTLR start "whileStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:413:1: whileStmt returns [String out] : ^( 'WHILE' expr[false, null] stmt[false, null] ) ;
	public final String whileStmt() throws RecognitionException {
		String out = null;


		String stmt29 =null;
		String expr30 =null;


			out = "";

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:417:2: ( ^( 'WHILE' expr[false, null] stmt[false, null] ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:417:4: ^( 'WHILE' expr[false, null] stmt[false, null] )
			{
			match(input,48,FOLLOW_48_in_whileStmt587); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expr_in_whileStmt589);
			expr30=expr(false, null);
			state._fsp--;

			pushFollow(FOLLOW_stmt_in_whileStmt592);
			stmt29=stmt(false, null);
			state._fsp--;

			match(input, Token.UP, null); 


					
						String statement = "";
						if (stmt29 != null) {
							statement = stmt29;
						}
						
						i+=2;
						out = "\n" + indent() + "while (" + expr30 + ") {\n";
						i++;
						out = out.concat(indent() + statement + "\n");
						i--;
						out = out.concat(indent() +"}");
						i-=2;
						
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return out;
	}
	// $ANTLR end "whileStmt"



	// $ANTLR start "callStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:436:1: callStmt returns [String out] : ^( CALL ID ( argList )? ) ;
	public final String callStmt() throws RecognitionException {
		String out = null;


		CommonTree ID32=null;
		String argList31 =null;


			out = "";

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:440:2: ( ^( CALL ID ( argList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:440:4: ^( CALL ID ( argList )? )
			{
			match(input,CALL,FOLLOW_CALL_in_callStmt620); 
			match(input, Token.DOWN, null); 
			ID32=(CommonTree)match(input,ID,FOLLOW_ID_in_callStmt622); 
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:440:14: ( argList )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( ((LA16_0 >= BOOLEAN && LA16_0 <= CALL)||(LA16_0 >= ID && LA16_0 <= INTEGER)||LA16_0==NEGATION||LA16_0==22||(LA16_0 >= 25 && LA16_0 <= 26)||LA16_0==28||(LA16_0 >= 32 && LA16_0 <= 36)) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:440:14: argList
					{
					pushFollow(FOLLOW_argList_in_callStmt624);
					argList31=argList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 


						String args = "";
						if (argList31 != null) {
							args = argList31;
						}
						
						out = "_" + (ID32!=null?ID32.getText():null) + "(" + args + ")";
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return out;
	}
	// $ANTLR end "callStmt"



	// $ANTLR start "argList"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:451:1: argList returns [String out] : ( expr[true, list] )+ ;
	public final String argList() throws RecognitionException {
		String out = null;



			ArrayList<String> list = new ArrayList<String>();
			out = "";

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:456:2: ( ( expr[true, list] )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:456:4: ( expr[true, list] )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:456:4: ( expr[true, list] )+
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:456:4: expr[true, list]
					{
					pushFollow(FOLLOW_expr_in_argList651);
					expr(true, list);
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


						if (!list.isEmpty()) {
							out = list.get(0);
							for (int i = 1; i < list.size(); i++) {
								out = out.concat(", " + list.get(i));
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
		return out;
	}
	// $ANTLR end "argList"



	// $ANTLR start "outStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:467:1: outStmt returns [String out] : ( ^( 'OUTPUT' STRING ) | ^( 'OUTPUT' ID ) );
	public final String outStmt() throws RecognitionException {
		String out = null;


		CommonTree STRING33=null;
		CommonTree ID34=null;


			out = "";

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:471:2: ( ^( 'OUTPUT' STRING ) | ^( 'OUTPUT' ID ) )
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:471:4: ^( 'OUTPUT' STRING )
					{
					match(input,43,FOLLOW_43_in_outStmt678); 
					match(input, Token.DOWN, null); 
					STRING33=(CommonTree)match(input,STRING,FOLLOW_STRING_in_outStmt680); 
					match(input, Token.UP, null); 


								i+=2;
								out =
									"\n" + indent() +
									"System.out.print(\"" + (STRING33!=null?STRING33.getText():null) + "\");";
								i-=2;
							
					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:479:4: ^( 'OUTPUT' ID )
					{
					match(input,43,FOLLOW_43_in_outStmt691); 
					match(input, Token.DOWN, null); 
					ID34=(CommonTree)match(input,ID,FOLLOW_ID_in_outStmt693); 
					match(input, Token.UP, null); 


								i+=2;
								out =
									"\n" + indent() +
									"System.out.print(_" + (ID34!=null?ID34.getText():null) + ");";
								i-=2;
							
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
		return out;
	}
	// $ANTLR end "outStmt"



	// $ANTLR start "expr"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:489:1: expr[boolean inList, ArrayList<String> list] returns [String out] : ( ^( '==' e1= expr[false, null] e2= expr[false, null] ) | ^( '!=' e1= expr[false, null] e2= expr[false, null] ) | ^( '<' e1= expr[false, null] e2= expr[false, null] ) | ^( '<=' e1= expr[false, null] e2= expr[false, null] ) | ^( '>=' e1= expr[false, null] e2= expr[false, null] ) | ^( '>' e1= expr[false, null] e2= expr[false, null] ) | ^( '+' e1= expr[false, null] e2= expr[false, null] ) | ^( '-' e1= expr[false, null] e2= expr[false, null] ) | ^( '*' e1= expr[false, null] e2= expr[false, null] ) | ^( NEGATION e1= expr[false, null] ) | ID | INTEGER | BOOLEAN | callStmt );
	public final String expr(boolean inList, ArrayList<String> list) throws RecognitionException {
		String out = null;


		CommonTree ID35=null;
		CommonTree INTEGER36=null;
		CommonTree BOOLEAN37=null;
		String e1 =null;
		String e2 =null;
		String callStmt38 =null;


			out = "";

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:493:2: ( ^( '==' e1= expr[false, null] e2= expr[false, null] ) | ^( '!=' e1= expr[false, null] e2= expr[false, null] ) | ^( '<' e1= expr[false, null] e2= expr[false, null] ) | ^( '<=' e1= expr[false, null] e2= expr[false, null] ) | ^( '>=' e1= expr[false, null] e2= expr[false, null] ) | ^( '>' e1= expr[false, null] e2= expr[false, null] ) | ^( '+' e1= expr[false, null] e2= expr[false, null] ) | ^( '-' e1= expr[false, null] e2= expr[false, null] ) | ^( '*' e1= expr[false, null] e2= expr[false, null] ) | ^( NEGATION e1= expr[false, null] ) | ID | INTEGER | BOOLEAN | callStmt )
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:493:4: ^( '==' e1= expr[false, null] e2= expr[false, null] )
					{
					match(input,34,FOLLOW_34_in_expr721); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr725);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr730);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								out = "(" + e1 + " == " + e2 + ")";
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:500:4: ^( '!=' e1= expr[false, null] e2= expr[false, null] )
					{
					match(input,22,FOLLOW_22_in_expr742); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr746);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr751);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								out = "(" + e1 + " != " + e2 + ")";
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 3 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:507:4: ^( '<' e1= expr[false, null] e2= expr[false, null] )
					{
					match(input,32,FOLLOW_32_in_expr763); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr767);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr772);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								out = "(" + e1 + " < " + e2 + ")";
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 4 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:514:4: ^( '<=' e1= expr[false, null] e2= expr[false, null] )
					{
					match(input,33,FOLLOW_33_in_expr784); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr788);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr793);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								out = "(" + e1 + " <= " + e2 + ")";
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 5 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:521:4: ^( '>=' e1= expr[false, null] e2= expr[false, null] )
					{
					match(input,36,FOLLOW_36_in_expr805); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr809);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr814);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								out = "(" + e1 + " >= " + e2 + ")";
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 6 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:528:4: ^( '>' e1= expr[false, null] e2= expr[false, null] )
					{
					match(input,35,FOLLOW_35_in_expr826); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr830);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr835);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								out = "(" + e1 + " > " + e2 + ")";
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 7 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:535:4: ^( '+' e1= expr[false, null] e2= expr[false, null] )
					{
					match(input,26,FOLLOW_26_in_expr847); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr851);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr856);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								out = "(" + e1 + " + " + e2 + ")";
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 8 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:542:4: ^( '-' e1= expr[false, null] e2= expr[false, null] )
					{
					match(input,28,FOLLOW_28_in_expr868); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr872);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr877);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								out = "(" + e1 + " - " + e2 + ")";
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 9 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:549:4: ^( '*' e1= expr[false, null] e2= expr[false, null] )
					{
					match(input,25,FOLLOW_25_in_expr889); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr893);
					e1=expr(false, null);
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr898);
					e2=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								out = "(" + e1 + " * " + e2 + ")";
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 10 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:556:4: ^( NEGATION e1= expr[false, null] )
					{
					match(input,NEGATION,FOLLOW_NEGATION_in_expr910); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr914);
					e1=expr(false, null);
					state._fsp--;

					match(input, Token.UP, null); 


								out = "(-" + e1 + ")";
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 11 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:563:4: ID
					{
					ID35=(CommonTree)match(input,ID,FOLLOW_ID_in_expr925); 

								out = "_" + (ID35!=null?ID35.getText():null);
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 12 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:570:4: INTEGER
					{
					INTEGER36=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_expr934); 

								out = (INTEGER36!=null?INTEGER36.getText():null);
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 13 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:577:4: BOOLEAN
					{
					BOOLEAN37=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_expr943); 

								String truth = "";
								if ((BOOLEAN37!=null?BOOLEAN37.getText():null).equals("T")) {
									truth = "true";
								} else if ((BOOLEAN37!=null?BOOLEAN37.getText():null).equals("F")) {
									truth = "false";
								}
								
								out = truth;
								if (inList) {
									list.add(out);
								}
							
					}
					break;
				case 14 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicCodeGen.g:591:4: callStmt
					{
					pushFollow(FOLLOW_callStmt_in_expr952);
					callStmt38=callStmt();
					state._fsp--;


								out = callStmt38;
								if (inList) {
									list.add(out);
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
		return out;
	}
	// $ANTLR end "expr"

	// Delegated rules



	public static final BitSet FOLLOW_ID_in_prog86 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declList_in_prog88 = new BitSet(new long[]{0x00010C0040000058L});
	public static final BitSet FOLLOW_stmtList_in_prog91 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_decl_in_declList118 = new BitSet(new long[]{0x0000000000110402L});
	public static final BitSet FOLLOW_varDecl_in_decl138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procDecl_in_decl148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcDecl_in_decl157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varDecl_in_varDeclList181 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_VARDECL_in_varDecl210 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_varDecl212 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_varDecl214 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PROC_in_procDecl250 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_procDecl252 = new BitSet(new long[]{0x00010C0040108058L});
	public static final BitSet FOLLOW_paramList_in_procDecl254 = new BitSet(new long[]{0x00010C0040100058L});
	public static final BitSet FOLLOW_varDeclList_in_procDecl257 = new BitSet(new long[]{0x00010C0040000058L});
	public static final BitSet FOLLOW_stmtList_in_procDecl260 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_in_funcDecl298 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_funcDecl300 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_funcDecl302 = new BitSet(new long[]{0x00010C0040108058L});
	public static final BitSet FOLLOW_paramList_in_funcDecl304 = new BitSet(new long[]{0x00010C0040100058L});
	public static final BitSet FOLLOW_varDeclList_in_funcDecl307 = new BitSet(new long[]{0x00010C0040000058L});
	public static final BitSet FOLLOW_stmtList_in_funcDecl310 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_param_in_paramList336 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_PARAM_in_param357 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_param359 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_param361 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_stmt_in_stmtList386 = new BitSet(new long[]{0x00010C0040000052L});
	public static final BitSet FOLLOW_blockStmt_in_stmt414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignStmt_in_stmt423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condStmt_in_stmt432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStmt_in_stmt441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callStmt_in_stmt450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outStmt_in_stmt459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_blockStmt485 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stmtList_in_blockStmt487 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_30_in_assignStmt515 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignStmt517 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_assignStmt519 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_42_in_condStmt547 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_condStmt549 = new BitSet(new long[]{0x00010C0040000050L});
	public static final BitSet FOLLOW_stmt_in_condStmt554 = new BitSet(new long[]{0x00010C0040000050L});
	public static final BitSet FOLLOW_stmt_in_condStmt559 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_48_in_whileStmt587 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_whileStmt589 = new BitSet(new long[]{0x00010C0040000050L});
	public static final BitSet FOLLOW_stmt_in_whileStmt592 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CALL_in_callStmt620 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_callStmt622 = new BitSet(new long[]{0x0000001F16405868L});
	public static final BitSet FOLLOW_argList_in_callStmt624 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_argList651 = new BitSet(new long[]{0x0000001F16405862L});
	public static final BitSet FOLLOW_43_in_outStmt678 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_outStmt680 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_43_in_outStmt691 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_outStmt693 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_34_in_expr721 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr725 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr730 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_expr742 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr746 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr751 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_32_in_expr763 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr767 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr772 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_33_in_expr784 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr788 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr793 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_36_in_expr805 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr809 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr814 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_35_in_expr826 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr830 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr835 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_26_in_expr847 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr851 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr856 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_28_in_expr868 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr872 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr877 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_25_in_expr889 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr893 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr898 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATION_in_expr910 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr914 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_expr925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_expr934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_expr943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callStmt_in_expr952 = new BitSet(new long[]{0x0000000000000002L});
}
