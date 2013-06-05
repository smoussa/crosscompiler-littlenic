// $ANTLR 3.5 C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g 2013-04-25 13:33:32

	import java.util.ArrayList;
	import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LittleNicGlobalWalker extends TreeParser {
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


	public LittleNicGlobalWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public LittleNicGlobalWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return LittleNicGlobalWalker.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g"; }


		
	    public ErrorReporter err;
	    
	    public ArrayList<String> names = new ArrayList<String>();
	    
		public HashMap<String, String> globals = new HashMap<String, String>();
		public HashMap<String, HashMap<String, String>> methods
					= new HashMap<String, HashMap<String, String>>();
					
		public boolean inMethod = false;
		
		public boolean isDefined(String id) {
			for (String name : names) {
				if (name.equals(id)) {
					return true;
				}
			}
			return false;
		}
		



	// $ANTLR start "prog"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:37:1: prog : ^( ID ( declList )? ( stmtList )? ) ;
	public final void prog() throws RecognitionException {
		CommonTree ID1=null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:38:2: ( ^( ID ( declList )? ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:38:4: ^( ID ( declList )? ( stmtList )? )
			{
			ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_prog58); 
			names.add((ID1!=null?ID1.getText():null)); globals.put((ID1!=null?ID1.getText():null), null);
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:38:61: ( declList )?
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FUNC||LA1_0==PROC||LA1_0==VARDECL) ) {
					alt1=1;
				}
				switch (alt1) {
					case 1 :
						// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:38:61: declList
						{
						pushFollow(FOLLOW_declList_in_prog62);
						declList();
						state._fsp--;

						}
						break;

				}

				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:38:71: ( stmtList )?
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==BLOCK||LA2_0==CALL||LA2_0==30||(LA2_0 >= 42 && LA2_0 <= 43)||LA2_0==48) ) {
					alt2=1;
				}
				switch (alt2) {
					case 1 :
						// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:38:71: stmtList
						{
						pushFollow(FOLLOW_stmtList_in_prog65);
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
	// $ANTLR end "prog"



	// $ANTLR start "declList"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:41:1: declList : ( decl )+ ;
	public final void declList() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:42:2: ( ( decl )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:42:4: ( decl )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:42:4: ( decl )+
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:42:4: decl
					{
					pushFollow(FOLLOW_decl_in_declList79);
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:45:1: decl : ( varDecl | procDecl | funcDecl );
	public final void decl() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:46:2: ( varDecl | procDecl | funcDecl )
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:46:4: varDecl
					{
					pushFollow(FOLLOW_varDecl_in_decl92);
					varDecl();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:47:4: procDecl
					{
					pushFollow(FOLLOW_procDecl_in_decl97);
					procDecl();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:48:4: funcDecl
					{
					pushFollow(FOLLOW_funcDecl_in_decl102);
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:51:1: varDeclList : ( varDecl )+ ;
	public final void varDeclList() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:52:2: ( ( varDecl )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:52:4: ( varDecl )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:52:4: ( varDecl )+
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:52:4: varDecl
					{
					pushFollow(FOLLOW_varDecl_in_varDeclList113);
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:55:1: varDecl : ^( VARDECL TYPE ID ) ;
	public final void varDecl() throws RecognitionException {
		CommonTree ID2=null;
		CommonTree TYPE3=null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:56:2: ( ^( VARDECL TYPE ID ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:56:4: ^( VARDECL TYPE ID )
			{
			match(input,VARDECL,FOLLOW_VARDECL_in_varDecl126); 
			match(input, Token.DOWN, null); 
			TYPE3=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_varDecl128); 
			ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_varDecl130); 
			match(input, Token.UP, null); 


						if (!inMethod) {
							if (!isDefined((ID2!=null?ID2.getText():null))) {
								names.add((ID2!=null?ID2.getText():null));
								globals.put((ID2!=null?ID2.getText():null), (TYPE3!=null?TYPE3.getText():null));
							} else {
								err.reportNameError((ID2!=null?ID2.getLine():0), (ID2!=null?ID2.getCharPositionInLine():0), (ID2!=null?ID2.getText():null));
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
	// $ANTLR end "varDecl"



	// $ANTLR start "procDecl"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:70:1: procDecl : ^( PROC ID ( paramList[params] )? ( varDeclList )? ( stmtList )? ) ;
	public final void procDecl() throws RecognitionException {
		CommonTree ID4=null;


			HashMap<String, String> params = new HashMap<String, String>();
			inMethod = true;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:78:2: ( ^( PROC ID ( paramList[params] )? ( varDeclList )? ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:78:4: ^( PROC ID ( paramList[params] )? ( varDeclList )? ( stmtList )? )
			{
			match(input,PROC,FOLLOW_PROC_in_procDecl157); 
			match(input, Token.DOWN, null); 
			ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_procDecl159); 
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:78:14: ( paramList[params] )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==PARAM) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:78:14: paramList[params]
					{
					pushFollow(FOLLOW_paramList_in_procDecl161);
					paramList(params);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:78:33: ( varDeclList )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==VARDECL) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:78:33: varDeclList
					{
					pushFollow(FOLLOW_varDeclList_in_procDecl165);
					varDeclList();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:78:46: ( stmtList )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==BLOCK||LA8_0==CALL||LA8_0==30||(LA8_0 >= 42 && LA8_0 <= 43)||LA8_0==48) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:78:46: stmtList
					{
					pushFollow(FOLLOW_stmtList_in_procDecl168);
					stmtList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 


						if (!isDefined((ID4!=null?ID4.getText():null))) {
							names.add((ID4!=null?ID4.getText():null));
							globals.put((ID4!=null?ID4.getText():null), null);
							methods.put((ID4!=null?ID4.getText():null), params);
						} else {
							err.reportNameError((ID4!=null?ID4.getLine():0), (ID4!=null?ID4.getCharPositionInLine():0), (ID4!=null?ID4.getText():null));
							throw new RuntimeException();
						}
					
			}


				inMethod = false;

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "procDecl"



	// $ANTLR start "funcDecl"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:91:1: funcDecl : ^( FUNC TYPE ID ( paramList[params] )? ( varDeclList )? ( stmtList )? ) ;
	public final void funcDecl() throws RecognitionException {
		CommonTree ID5=null;
		CommonTree TYPE6=null;


			HashMap<String, String> params = new HashMap<String, String>();
			inMethod = true;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:99:2: ( ^( FUNC TYPE ID ( paramList[params] )? ( varDeclList )? ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:99:4: ^( FUNC TYPE ID ( paramList[params] )? ( varDeclList )? ( stmtList )? )
			{
			match(input,FUNC,FOLLOW_FUNC_in_funcDecl197); 
			match(input, Token.DOWN, null); 
			TYPE6=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_funcDecl199); 
			ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_funcDecl201); 
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:99:19: ( paramList[params] )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==PARAM) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:99:19: paramList[params]
					{
					pushFollow(FOLLOW_paramList_in_funcDecl203);
					paramList(params);
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:99:38: ( varDeclList )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==VARDECL) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:99:38: varDeclList
					{
					pushFollow(FOLLOW_varDeclList_in_funcDecl207);
					varDeclList();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:99:51: ( stmtList )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==BLOCK||LA11_0==CALL||LA11_0==30||(LA11_0 >= 42 && LA11_0 <= 43)||LA11_0==48) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:99:51: stmtList
					{
					pushFollow(FOLLOW_stmtList_in_funcDecl210);
					stmtList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 


						if (!isDefined((ID5!=null?ID5.getText():null))) {
							names.add((ID5!=null?ID5.getText():null));
							globals.put((ID5!=null?ID5.getText():null), (TYPE6!=null?TYPE6.getText():null));
							methods.put((ID5!=null?ID5.getText():null), params);
						} else {
							err.reportNameError((ID5!=null?ID5.getLine():0), (ID5!=null?ID5.getCharPositionInLine():0), (ID5!=null?ID5.getText():null));
							throw new RuntimeException();
						}
					
			}


				inMethod = false;

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "funcDecl"



	// $ANTLR start "paramList"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:112:1: paramList[HashMap<String, String> params] : ( param[params] )+ ;
	public final void paramList(HashMap<String, String> params) throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:113:2: ( ( param[params] )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:113:4: ( param[params] )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:113:4: ( param[params] )+
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:113:4: param[params]
					{
					pushFollow(FOLLOW_param_in_paramList229);
					param(params);
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:116:1: param[HashMap<String, String> params] : ^( PARAM TYPE ID ) ;
	public final void param(HashMap<String, String> params) throws RecognitionException {
		CommonTree ID7=null;
		CommonTree TYPE8=null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:117:2: ( ^( PARAM TYPE ID ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:117:4: ^( PARAM TYPE ID )
			{
			match(input,PARAM,FOLLOW_PARAM_in_param246); 
			match(input, Token.DOWN, null); 
			TYPE8=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_param248); 
			ID7=(CommonTree)match(input,ID,FOLLOW_ID_in_param250); 
			match(input, Token.UP, null); 


						if (!params.containsKey((ID7!=null?ID7.getText():null))) {
							params.put((ID7!=null?ID7.getText():null), (TYPE8!=null?TYPE8.getText():null));
						} else {
							err.reportNameError((ID7!=null?ID7.getLine():0), (ID7!=null?ID7.getCharPositionInLine():0), (ID7!=null?ID7.getText():null));
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
	// $ANTLR end "param"



	// $ANTLR start "stmtList"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:128:1: stmtList : ( stmt )+ ;
	public final void stmtList() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:129:2: ( ( stmt )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:129:4: ( stmt )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:129:4: ( stmt )+
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:129:4: stmt
					{
					pushFollow(FOLLOW_stmt_in_stmtList266);
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:132:1: stmt : ( blockStmt | assignStmt | condStmt | whileStmt | callStmt | outStmt );
	public final void stmt() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:133:2: ( blockStmt | assignStmt | condStmt | whileStmt | callStmt | outStmt )
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:133:4: blockStmt
					{
					pushFollow(FOLLOW_blockStmt_in_stmt278);
					blockStmt();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:134:4: assignStmt
					{
					pushFollow(FOLLOW_assignStmt_in_stmt283);
					assignStmt();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:135:4: condStmt
					{
					pushFollow(FOLLOW_condStmt_in_stmt288);
					condStmt();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:136:4: whileStmt
					{
					pushFollow(FOLLOW_whileStmt_in_stmt293);
					whileStmt();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:137:4: callStmt
					{
					pushFollow(FOLLOW_callStmt_in_stmt298);
					callStmt();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:138:4: outStmt
					{
					pushFollow(FOLLOW_outStmt_in_stmt303);
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:141:1: blockStmt : ^( BLOCK ( stmtList )? ) ;
	public final void blockStmt() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:142:2: ( ^( BLOCK ( stmtList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:142:4: ^( BLOCK ( stmtList )? )
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_blockStmt316); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:142:12: ( stmtList )?
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==BLOCK||LA15_0==CALL||LA15_0==30||(LA15_0 >= 42 && LA15_0 <= 43)||LA15_0==48) ) {
					alt15=1;
				}
				switch (alt15) {
					case 1 :
						// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:142:12: stmtList
						{
						pushFollow(FOLLOW_stmtList_in_blockStmt318);
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:145:1: assignStmt : ^( ':=' ID expr ) ;
	public final void assignStmt() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:146:2: ( ^( ':=' ID expr ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:146:4: ^( ':=' ID expr )
			{
			match(input,30,FOLLOW_30_in_assignStmt333); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_assignStmt335); 
			pushFollow(FOLLOW_expr_in_assignStmt337);
			expr();
			state._fsp--;

			match(input, Token.UP, null); 

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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:149:1: condStmt : ^(op= 'IF' expr s1= stmt s2= stmt ) ;
	public final void condStmt() throws RecognitionException {
		CommonTree op=null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:150:2: ( ^(op= 'IF' expr s1= stmt s2= stmt ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:150:4: ^(op= 'IF' expr s1= stmt s2= stmt )
			{
			op=(CommonTree)match(input,42,FOLLOW_42_in_condStmt353); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expr_in_condStmt355);
			expr();
			state._fsp--;

			pushFollow(FOLLOW_stmt_in_condStmt359);
			stmt();
			state._fsp--;

			pushFollow(FOLLOW_stmt_in_condStmt363);
			stmt();
			state._fsp--;

			match(input, Token.UP, null); 

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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:153:1: whileStmt : ^(op= 'WHILE' expr stmt ) ;
	public final void whileStmt() throws RecognitionException {
		CommonTree op=null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:154:2: ( ^(op= 'WHILE' expr stmt ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:154:4: ^(op= 'WHILE' expr stmt )
			{
			op=(CommonTree)match(input,48,FOLLOW_48_in_whileStmt379); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expr_in_whileStmt381);
			expr();
			state._fsp--;

			pushFollow(FOLLOW_stmt_in_whileStmt383);
			stmt();
			state._fsp--;

			match(input, Token.UP, null); 

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



	// $ANTLR start "callStmt"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:157:1: callStmt : ^( CALL ID ( argList )? ) ;
	public final void callStmt() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:158:2: ( ^( CALL ID ( argList )? ) )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:158:4: ^( CALL ID ( argList )? )
			{
			match(input,CALL,FOLLOW_CALL_in_callStmt396); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_callStmt398); 
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:158:14: ( argList )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( ((LA16_0 >= BOOLEAN && LA16_0 <= CALL)||(LA16_0 >= ID && LA16_0 <= INTEGER)||LA16_0==NEGATION||LA16_0==22||(LA16_0 >= 25 && LA16_0 <= 26)||LA16_0==28||(LA16_0 >= 32 && LA16_0 <= 36)) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:158:14: argList
					{
					pushFollow(FOLLOW_argList_in_callStmt400);
					argList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

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
	// $ANTLR end "callStmt"



	// $ANTLR start "argList"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:161:1: argList : ( expr )+ ;
	public final void argList() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:162:2: ( ( expr )+ )
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:162:4: ( expr )+
			{
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:162:4: ( expr )+
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:162:4: expr
					{
					pushFollow(FOLLOW_expr_in_argList413);
					expr();
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
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:165:1: outStmt : ( ^( 'OUTPUT' STRING ) | ^( 'OUTPUT' ID ) );
	public final void outStmt() throws RecognitionException {
		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:166:2: ( ^( 'OUTPUT' STRING ) | ^( 'OUTPUT' ID ) )
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:166:4: ^( 'OUTPUT' STRING )
					{
					match(input,43,FOLLOW_43_in_outStmt426); 
					match(input, Token.DOWN, null); 
					match(input,STRING,FOLLOW_STRING_in_outStmt428); 
					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:167:4: ^( 'OUTPUT' ID )
					{
					match(input,43,FOLLOW_43_in_outStmt435); 
					match(input, Token.DOWN, null); 
					match(input,ID,FOLLOW_ID_in_outStmt437); 
					match(input, Token.UP, null); 

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



	// $ANTLR start "expr"
	// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:170:1: expr : ( ^(op= '==' e1= expr e2= expr ) | ^(op= '!=' e1= expr e2= expr ) | ^(op= '<' e1= expr e2= expr ) | ^(op= '<=' e1= expr e2= expr ) | ^(op= '>=' e1= expr e2= expr ) | ^(op= '>' e1= expr e2= expr ) | ^(op= '+' e1= expr e2= expr ) | ^(op= '-' e1= expr e2= expr ) | ^(op= '*' e1= expr e2= expr ) | ^( NEGATION e1= expr ) | ID | INTEGER | BOOLEAN | callStmt );
	public final void expr() throws RecognitionException {
		CommonTree op=null;

		try {
			// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:171:2: ( ^(op= '==' e1= expr e2= expr ) | ^(op= '!=' e1= expr e2= expr ) | ^(op= '<' e1= expr e2= expr ) | ^(op= '<=' e1= expr e2= expr ) | ^(op= '>=' e1= expr e2= expr ) | ^(op= '>' e1= expr e2= expr ) | ^(op= '+' e1= expr e2= expr ) | ^(op= '-' e1= expr e2= expr ) | ^(op= '*' e1= expr e2= expr ) | ^( NEGATION e1= expr ) | ID | INTEGER | BOOLEAN | callStmt )
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
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:171:4: ^(op= '==' e1= expr e2= expr )
					{
					op=(CommonTree)match(input,34,FOLLOW_34_in_expr452); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr456);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr460);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:172:4: ^(op= '!=' e1= expr e2= expr )
					{
					op=(CommonTree)match(input,22,FOLLOW_22_in_expr469); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr473);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr477);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:173:4: ^(op= '<' e1= expr e2= expr )
					{
					op=(CommonTree)match(input,32,FOLLOW_32_in_expr486); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr490);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr494);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:174:4: ^(op= '<=' e1= expr e2= expr )
					{
					op=(CommonTree)match(input,33,FOLLOW_33_in_expr503); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr507);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr511);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:175:4: ^(op= '>=' e1= expr e2= expr )
					{
					op=(CommonTree)match(input,36,FOLLOW_36_in_expr520); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr524);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr528);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:176:4: ^(op= '>' e1= expr e2= expr )
					{
					op=(CommonTree)match(input,35,FOLLOW_35_in_expr537); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr541);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr545);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:177:4: ^(op= '+' e1= expr e2= expr )
					{
					op=(CommonTree)match(input,26,FOLLOW_26_in_expr554); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr558);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr562);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:178:4: ^(op= '-' e1= expr e2= expr )
					{
					op=(CommonTree)match(input,28,FOLLOW_28_in_expr571); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr575);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr579);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 9 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:179:4: ^(op= '*' e1= expr e2= expr )
					{
					op=(CommonTree)match(input,25,FOLLOW_25_in_expr588); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr592);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr596);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:180:4: ^( NEGATION e1= expr )
					{
					match(input,NEGATION,FOLLOW_NEGATION_in_expr603); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr607);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 11 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:181:4: ID
					{
					match(input,ID,FOLLOW_ID_in_expr613); 
					}
					break;
				case 12 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:182:4: INTEGER
					{
					match(input,INTEGER,FOLLOW_INTEGER_in_expr618); 
					}
					break;
				case 13 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:183:4: BOOLEAN
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_expr623); 
					}
					break;
				case 14 :
					// C:\\Users\\Samir\\Documents\\University\\Y2S2\\COMP2010\\LittleNic\\src\\LittleNicGlobalWalker.g:184:4: callStmt
					{
					pushFollow(FOLLOW_callStmt_in_expr628);
					callStmt();
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
	// $ANTLR end "expr"

	// Delegated rules



	public static final BitSet FOLLOW_ID_in_prog58 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declList_in_prog62 = new BitSet(new long[]{0x00010C0040000058L});
	public static final BitSet FOLLOW_stmtList_in_prog65 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_decl_in_declList79 = new BitSet(new long[]{0x0000000000110402L});
	public static final BitSet FOLLOW_varDecl_in_decl92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procDecl_in_decl97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcDecl_in_decl102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varDecl_in_varDeclList113 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_VARDECL_in_varDecl126 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_varDecl128 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_varDecl130 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PROC_in_procDecl157 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_procDecl159 = new BitSet(new long[]{0x00010C0040108058L});
	public static final BitSet FOLLOW_paramList_in_procDecl161 = new BitSet(new long[]{0x00010C0040100058L});
	public static final BitSet FOLLOW_varDeclList_in_procDecl165 = new BitSet(new long[]{0x00010C0040000058L});
	public static final BitSet FOLLOW_stmtList_in_procDecl168 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNC_in_funcDecl197 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_funcDecl199 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_funcDecl201 = new BitSet(new long[]{0x00010C0040108058L});
	public static final BitSet FOLLOW_paramList_in_funcDecl203 = new BitSet(new long[]{0x00010C0040100058L});
	public static final BitSet FOLLOW_varDeclList_in_funcDecl207 = new BitSet(new long[]{0x00010C0040000058L});
	public static final BitSet FOLLOW_stmtList_in_funcDecl210 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_param_in_paramList229 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_PARAM_in_param246 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_param248 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_param250 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_stmt_in_stmtList266 = new BitSet(new long[]{0x00010C0040000052L});
	public static final BitSet FOLLOW_blockStmt_in_stmt278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignStmt_in_stmt283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condStmt_in_stmt288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStmt_in_stmt293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callStmt_in_stmt298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_outStmt_in_stmt303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_blockStmt316 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_stmtList_in_blockStmt318 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_30_in_assignStmt333 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignStmt335 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_assignStmt337 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_42_in_condStmt353 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_condStmt355 = new BitSet(new long[]{0x00010C0040000050L});
	public static final BitSet FOLLOW_stmt_in_condStmt359 = new BitSet(new long[]{0x00010C0040000050L});
	public static final BitSet FOLLOW_stmt_in_condStmt363 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_48_in_whileStmt379 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_whileStmt381 = new BitSet(new long[]{0x00010C0040000050L});
	public static final BitSet FOLLOW_stmt_in_whileStmt383 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CALL_in_callStmt396 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_callStmt398 = new BitSet(new long[]{0x0000001F16405868L});
	public static final BitSet FOLLOW_argList_in_callStmt400 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_argList413 = new BitSet(new long[]{0x0000001F16405862L});
	public static final BitSet FOLLOW_43_in_outStmt426 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_outStmt428 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_43_in_outStmt435 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_outStmt437 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_34_in_expr452 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr456 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr460 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_expr469 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr473 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr477 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_32_in_expr486 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr490 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr494 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_33_in_expr503 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr507 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr511 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_36_in_expr520 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr524 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr528 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_35_in_expr537 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr541 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr545 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_26_in_expr554 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr558 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr562 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_28_in_expr571 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr575 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr579 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_25_in_expr588 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr592 = new BitSet(new long[]{0x0000001F16405860L});
	public static final BitSet FOLLOW_expr_in_expr596 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEGATION_in_expr603 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr607 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_expr613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_expr618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_expr623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callStmt_in_expr628 = new BitSet(new long[]{0x0000000000000002L});
}
