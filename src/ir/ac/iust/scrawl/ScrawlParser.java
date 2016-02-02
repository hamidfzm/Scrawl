// $ANTLR 3.5.1 /Users/hamidfzm/Projects/Scrawl/Scrawl.g 2016-01-25 10:56:07

	package ir.ac.iust.scrawl;
	import java.util.HashMap;
	import java.util.Stack;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class ScrawlParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "COMMENT", "DELETE", "DIGIT", 
		"DIV", "ELSE", "EQL", "ESC", "GET", "GRQ", "GRT", "ID", "IF", "INTEGER", 
		"LBR", "LINE_COMMENT", "LSQ", "LSS", "MLP", "MNS", "NEQ", "NOT", "OR", 
		"PLS", "POST", "PUT", "PWR", "RBR", "SS", "STRING", "TEXT", "THIS", "WS", 
		"';'", "'='", "'@'", "'['", "']'", "'by'", "'first'", "'foreach'", "'last'", 
		"'main'", "'parse'", "'print'", "'procedure'", "'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int AND=4;
	public static final int COMMENT=5;
	public static final int DELETE=6;
	public static final int DIGIT=7;
	public static final int DIV=8;
	public static final int ELSE=9;
	public static final int EQL=10;
	public static final int ESC=11;
	public static final int GET=12;
	public static final int GRQ=13;
	public static final int GRT=14;
	public static final int ID=15;
	public static final int IF=16;
	public static final int INTEGER=17;
	public static final int LBR=18;
	public static final int LINE_COMMENT=19;
	public static final int LSQ=20;
	public static final int LSS=21;
	public static final int MLP=22;
	public static final int MNS=23;
	public static final int NEQ=24;
	public static final int NOT=25;
	public static final int OR=26;
	public static final int PLS=27;
	public static final int POST=28;
	public static final int PUT=29;
	public static final int PWR=30;
	public static final int RBR=31;
	public static final int SS=32;
	public static final int STRING=33;
	public static final int TEXT=34;
	public static final int THIS=35;
	public static final int WS=36;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "parseSt", "integer", "mainRoutine", "printSt", "atom", 
		"selector", "reqSt", "assSt", "getReqSt", "root", "conditionSt", "procedure", 
		"foreachSt", "postReqSt", "block", "ifSt", "multExpr", "statement", "exp", 
		"index"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public ScrawlParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public ScrawlParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public ScrawlParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return ScrawlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/hamidfzm/Projects/Scrawl/Scrawl.g"; }


		Stack<Integer> block = new Stack<>();
		String thisDoc;

		// ****************
	public enum Type{
	        STRING,
	        DOCUMENT,
	        ELEMENT,
	        ELEMENTS,
	        INTEGER,
	        FLOAT,
	        BOOLEAN,
	    }

	    public class Info {
	        private String name;
	        private int local;
	        private Type type;
	        private int block;

	        public Info(String name, Type type){
	            this.name = name;
	            this.type = type;
	        }

	        public Type getType() {
	            return type;
	        }

	        public int getLocal(){return local;}
	    }

	    private HashMap<String, Info> id2Info;
	    private HashMap<Integer, Info> local2Info;
	    private static final int MAX_LOCAL_VAR = 200;
	    private int max_local = 0;

	    public int put(String id,Type type){
	        Info info;
	        for(int i=0;i<MAX_LOCAL_VAR;i++) {
	            if(max_local < i+1)
	                max_local = i+1;
	            if(!local2Info.containsKey(i)){
	                info = new Info(id,type);
	                info.local = i;
	                local2Info.put(i,info);
	                id2Info.put(id,info);
	                return i;
	            }
	        }
	        return -1;
	    }

	    public Info get(String id){
	        return id2Info.get(id);
	    }

	    public void remove(String id){
	        if(id2Info.containsKey(id))
	            id2Info.remove(id);
	    }

	    public int getLocalIndex(String id){
	        return id2Info.get(id).local;
	    }


	    public void __debug__printKeys(){
	        for(String s: id2Info.keySet())
	            System.out.println(s);
	    }
	    //*********

	    String whatIsThis(){
	    	return "doc"+block.size()+"_"+block.elementAt(block.size()-2);
	    }

	    String whatIsThis1(){
	    	return "doc"+(block.size()+1)+"_"+block.peek();
	    }

	    int lableCount = 0;

	    String newLable(){
	    	lableCount++;
	    	return "Lable"+lableCount;
	    }
	    int tempCount = 0;

	    String newTemp(){
	    	tempCount++;
	    	return "T"+tempCount;
	    }




	// $ANTLR start "root"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:112:1: root returns [String code] : mainRoutine ( procedure )* ;
	public final String root() throws RecognitionException {
		String code = null;


		String mainRoutine1 =null;
		String procedure2 =null;

		try { dbg.enterRule(getGrammarFileName(), "root");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(112, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:112:28: ( mainRoutine ( procedure )* )
			dbg.enterAlt(1);

			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:113:5: mainRoutine ( procedure )*
			{
			dbg.location(113,5);

			        id2Info = new HashMap<>();
			        local2Info = new HashMap<>();
			        block.push(0);
			    dbg.location(118,5);
			pushFollow(FOLLOW_mainRoutine_in_root49);
			mainRoutine1=mainRoutine();
			state._fsp--;
			dbg.location(118,16);
			code = mainRoutine1; dbg.location(118,46);
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:118:46: ( procedure )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==49) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:118:47: procedure
					{
					dbg.location(118,47);
					pushFollow(FOLLOW_procedure_in_root53);
					procedure2=procedure();
					state._fsp--;
					dbg.location(118,56);
					code += procedure2;
					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(118,87);
			System.out.print(code);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(118, 112);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "root");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return code;
	}
	// $ANTLR end "root"



	// $ANTLR start "procedure"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:120:1: procedure returns [String code] : 'procedure' ID block ;
	public final String procedure() throws RecognitionException {
		String code = null;


		Token ID3=null;
		String block4 =null;

		try { dbg.enterRule(getGrammarFileName(), "procedure");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(120, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:120:32: ( 'procedure' ID block )
			dbg.enterAlt(1);

			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:121:5: 'procedure' ID block
			{
			dbg.location(121,5);
			match(input,49,FOLLOW_49_in_procedure74); dbg.location(121,17);
			ID3=(Token)match(input,ID,FOLLOW_ID_in_procedure76); dbg.location(121,20);
			pushFollow(FOLLOW_block_in_procedure78);
			block4=block();
			state._fsp--;
			dbg.location(121,26);
			 code = ".method private static " + (ID3!=null?ID3.getText():null) + "()V \n"
				                     + ".limit stack 2 \n"
				                     + ".limit locals "+max_local+" \n"
			    			+ block4
				                     + "return \n"
				                     + ".end method \n\n";
			    		     
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(127, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "procedure");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return code;
	}
	// $ANTLR end "procedure"



	// $ANTLR start "mainRoutine"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:129:1: mainRoutine returns [String code] : 'main' block ;
	public final String mainRoutine() throws RecognitionException {
		String code = null;


		String block5 =null;

		try { dbg.enterRule(getGrammarFileName(), "mainRoutine");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(129, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:129:34: ( 'main' block )
			dbg.enterAlt(1);

			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:130:5: 'main' block
			{
			dbg.location(130,5);
			match(input,46,FOLLOW_46_in_mainRoutine95); dbg.location(130,12);
			pushFollow(FOLLOW_block_in_mainRoutine97);
			block5=block();
			state._fsp--;
			dbg.location(130,18);
			 code = ".class public Scrawlout \n"
			                     + ".super java/lang/Object \n"
			                     + ".method public <init>()V \n"
			                     + "aload_0 \n"
			                     + "invokenonvirtual java/lang/Object/<init>()V \n"
			                     + "return \n"
			                     + ".end method \n"

			                     + ".method public static main([Ljava/lang/String;)V \n"
			                     + block5
			                      + ".limit stack 20 \n"
			                     + ".limit locals "+max_local+" \n"
			                     + "return \n"
			                     + ".end method \n\n";
			                     
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(144, 22);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mainRoutine");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return code;
	}
	// $ANTLR end "mainRoutine"



	// $ANTLR start "block"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:146:1: block returns [String code] : '{' ( statement )* '}' ;
	public final String block() throws RecognitionException {
		String code = null;


		String statement6 =null;

		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(146, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:146:28: ( '{' ( statement )* '}' )
			dbg.enterAlt(1);

			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:147:5: '{' ( statement )* '}'
			{
			dbg.location(147,5);
			match(input,50,FOLLOW_50_in_block114); dbg.location(147,9);

			    		code = "";
			    		block.push(0);
			    	dbg.location(151,14);
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:151:14: ( statement )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==GET||(LA2_0 >= ID && LA2_0 <= IF)||LA2_0==POST||LA2_0==44||(LA2_0 >= 47 && LA2_0 <= 48)) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:151:15: statement
					{
					dbg.location(151,15);
					pushFollow(FOLLOW_statement_in_block132);
					statement6=statement();
					state._fsp--;
					dbg.location(151,25);
					code += statement6;
					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(152,5);
			match(input,51,FOLLOW_51_in_block142); dbg.location(152,9);
			 remove(whatIsThis()); block.pop();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(152, 45);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return code;
	}
	// $ANTLR end "block"



	// $ANTLR start "statement"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:154:1: statement returns [String code] : ( reqSt | assSt | foreachSt | parseSt | printSt | ifSt );
	public final String statement() throws RecognitionException {
		String code = null;


		String reqSt7 =null;
		String assSt8 =null;
		String foreachSt9 =null;
		String printSt10 =null;
		String ifSt11 =null;

		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(154, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:154:32: ( reqSt | assSt | foreachSt | parseSt | printSt | ifSt )
			int alt3=6;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			switch ( input.LA(1) ) {
			case GET:
			case POST:
				{
				alt3=1;
				}
				break;
			case ID:
				{
				alt3=2;
				}
				break;
			case 44:
				{
				alt3=3;
				}
				break;
			case 47:
				{
				alt3=4;
				}
				break;
			case 48:
				{
				alt3=5;
				}
				break;
			case IF:
				{
				alt3=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:155:5: reqSt
					{
					dbg.location(155,5);
					pushFollow(FOLLOW_reqSt_in_statement159);
					reqSt7=reqSt();
					state._fsp--;
					dbg.location(155,11);
					 code = reqSt7; 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:156:6: assSt
					{
					dbg.location(156,6);
					pushFollow(FOLLOW_assSt_in_statement168);
					assSt8=assSt();
					state._fsp--;
					dbg.location(156,11);
					 code = assSt8; 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:157:6: foreachSt
					{
					dbg.location(157,6);
					pushFollow(FOLLOW_foreachSt_in_statement176);
					foreachSt9=foreachSt();
					state._fsp--;
					dbg.location(157,16);
					 code = foreachSt9; 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:158:6: parseSt
					{
					dbg.location(158,6);
					pushFollow(FOLLOW_parseSt_in_statement185);
					parseSt();
					state._fsp--;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:159:6: printSt
					{
					dbg.location(159,6);
					pushFollow(FOLLOW_printSt_in_statement192);
					printSt10=printSt();
					state._fsp--;
					dbg.location(159,14);
					 code = printSt10; 
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:160:6: ifSt
					{
					dbg.location(160,6);
					pushFollow(FOLLOW_ifSt_in_statement201);
					ifSt11=ifSt();
					state._fsp--;
					dbg.location(160,11);
					 code = ifSt11; 
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
		dbg.location(160, 33);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return code;
	}
	// $ANTLR end "statement"



	// $ANTLR start "reqSt"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:162:1: reqSt returns [String code] : ( getReqSt | postReqSt );
	public final String reqSt() throws RecognitionException {
		String code = null;


		String getReqSt12 =null;
		String postReqSt13 =null;

		try { dbg.enterRule(getGrammarFileName(), "reqSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(162, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:162:29: ( getReqSt | postReqSt )
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==GET) ) {
				alt4=1;
			}
			else if ( (LA4_0==POST) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:163:2: getReqSt
					{
					dbg.location(163,2);
					pushFollow(FOLLOW_getReqSt_in_reqSt217);
					getReqSt12=getReqSt();
					state._fsp--;
					dbg.location(163,11);
					 code = getReqSt12; 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:164:3: postReqSt
					{
					dbg.location(164,3);
					pushFollow(FOLLOW_postReqSt_in_reqSt223);
					postReqSt13=postReqSt();
					state._fsp--;
					dbg.location(164,13);
					 code = postReqSt13; 
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
		dbg.location(164, 40);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "reqSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return code;
	}
	// $ANTLR end "reqSt"



	// $ANTLR start "getReqSt"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:166:1: getReqSt returns [String code] : GET exp block ;
	public final String getReqSt() throws RecognitionException {
		String code = null;


		ParserRuleReturnScope exp14 =null;
		String block15 =null;

		try { dbg.enterRule(getGrammarFileName(), "getReqSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(166, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:166:31: ( GET exp block )
			dbg.enterAlt(1);

			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:167:2: GET exp block
			{
			dbg.location(167,2);
			match(input,GET,FOLLOW_GET_in_getReqSt237); dbg.location(167,6);
			pushFollow(FOLLOW_exp_in_getReqSt239);
			exp14=exp();
			state._fsp--;
			dbg.location(168,3);

						int t = block.pop()+1;
						block.push(t);
						put(whatIsThis1(),(exp14!=null?((exp_return)exp14).type:null));
						code = (exp14!=null?((exp_return)exp14).code:null)
							+ "invokestatic ir/ac/iust/scrawl/scrawlib/Helper/Get(Ljava/lang/String;)Lorg/jsoup/nodes/Document; \n"
							+ "astore_"+getLocalIndex(whatIsThis1())+" \n";
					dbg.location(176,2);
			pushFollow(FOLLOW_block_in_getReqSt247);
			block15=block();
			state._fsp--;
			dbg.location(176,7);
			code += block15;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(176, 29);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "getReqSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return code;
	}
	// $ANTLR end "getReqSt"



	// $ANTLR start "postReqSt"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:178:1: postReqSt returns [String code] : POST exp block ;
	public final String postReqSt() throws RecognitionException {
		String code = null;


		try { dbg.enterRule(getGrammarFileName(), "postReqSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(178, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:178:32: ( POST exp block )
			dbg.enterAlt(1);

			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:179:2: POST exp block
			{
			dbg.location(179,2);
			match(input,POST,FOLLOW_POST_in_postReqSt260); dbg.location(179,7);
			pushFollow(FOLLOW_exp_in_postReqSt262);
			exp();
			state._fsp--;
			dbg.location(179,11);

					dbg.location(181,3);
			pushFollow(FOLLOW_block_in_postReqSt268);
			block();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(181, 7);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "postReqSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return code;
	}
	// $ANTLR end "postReqSt"



	// $ANTLR start "ifSt"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:183:1: ifSt returns [String code] : ( IF conditionSt a= block ) ( ELSE b= block )? ;
	public final String ifSt() throws RecognitionException {
		String code = null;


		String a =null;
		String b =null;
		String conditionSt16 =null;

		try { dbg.enterRule(getGrammarFileName(), "ifSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(183, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:183:27: ( ( IF conditionSt a= block ) ( ELSE b= block )? )
			dbg.enterAlt(1);

			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:184:2: ( IF conditionSt a= block ) ( ELSE b= block )?
			{
			dbg.location(184,2);
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:184:2: ( IF conditionSt a= block )
			dbg.enterAlt(1);

			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:184:3: IF conditionSt a= block
			{
			dbg.location(184,3);
			match(input,IF,FOLLOW_IF_in_ifSt281); dbg.location(184,6);
			pushFollow(FOLLOW_conditionSt_in_ifSt283);
			conditionSt16=conditionSt();
			state._fsp--;
			dbg.location(184,19);
			pushFollow(FOLLOW_block_in_ifSt287);
			a=block();
			state._fsp--;

			}
			dbg.location(185,2);

					String end_if = newLable();
					String if_else = newLable();
					
					code = conditionSt16 
					+ if_else + "\n" 
					+ a 
					+ "goto " + end_if + "\n"
					+ if_else + ":\n";
				dbg.location(195,2);
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:195:2: ( ELSE b= block )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:195:3: ELSE b= block
					{
					dbg.location(195,3);
					match(input,ELSE,FOLLOW_ELSE_in_ifSt295); dbg.location(195,9);
					pushFollow(FOLLOW_block_in_ifSt299);
					b=block();
					state._fsp--;
					dbg.location(196,2);

							code += b;
						
					}
					break;

			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(199,2);

					code += end_if + ":\n";
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(201, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return code;
	}
	// $ANTLR end "ifSt"



	// $ANTLR start "conditionSt"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:203:1: conditionSt returns [String code] : a= exp EQL b= exp ;
	public final String conditionSt() throws RecognitionException {
		String code = null;


		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		try { dbg.enterRule(getGrammarFileName(), "conditionSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(203, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:203:34: (a= exp EQL b= exp )
			dbg.enterAlt(1);

			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:204:2: a= exp EQL b= exp
			{
			dbg.location(204,3);
			pushFollow(FOLLOW_exp_in_conditionSt323);
			a=exp();
			state._fsp--;
			dbg.location(204,8);
			match(input,EQL,FOLLOW_EQL_in_conditionSt325); dbg.location(204,13);
			pushFollow(FOLLOW_exp_in_conditionSt329);
			b=exp();
			state._fsp--;
			dbg.location(205,2);

					if ((a!=null?((exp_return)a).type:null) == (b!=null?((exp_return)b).type:null)){
						switch((a!=null?((exp_return)a).type:null)){
							case STRING:
								code = (a!=null?((exp_return)a).code:null) + (b!=null?((exp_return)b).code:null) + "if_acmpne ";
								break;
							case INTEGER:
								code = (a!=null?((exp_return)a).code:null) + (b!=null?((exp_return)b).code:null) + "if_icmpne ";
								break;
							default:
								System.err.println("Not supported condition");
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
		dbg.location(218, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "conditionSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return code;
	}
	// $ANTLR end "conditionSt"



	// $ANTLR start "assSt"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:219:1: assSt returns [String code] : ID '=' exp ';' ;
	public final String assSt() throws RecognitionException {
		String code = null;


		Token ID17=null;
		ParserRuleReturnScope exp18 =null;

		try { dbg.enterRule(getGrammarFileName(), "assSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(219, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:219:27: ( ID '=' exp ';' )
			dbg.enterAlt(1);

			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:220:2: ID '=' exp ';'
			{
			dbg.location(220,2);
			ID17=(Token)match(input,ID,FOLLOW_ID_in_assSt343); dbg.location(220,5);
			match(input,38,FOLLOW_38_in_assSt345); dbg.location(220,9);
			pushFollow(FOLLOW_exp_in_assSt347);
			exp18=exp();
			state._fsp--;
			dbg.location(220,13);
			match(input,37,FOLLOW_37_in_assSt349); dbg.location(221,2);

					put((ID17!=null?ID17.getText():null),(exp18!=null?((exp_return)exp18).type:null));
					code = (exp18!=null?((exp_return)exp18).code:null);
					
					switch((exp18!=null?((exp_return)exp18).type:null)){
			    	    case INTEGER:
			    	        code += "istore_"+getLocalIndex((ID17!=null?ID17.getText():null))+"\n";
			    	        break;
			    	    default:
			    	        code += "astore_"+getLocalIndex((ID17!=null?ID17.getText():null))+"\n";
			    	        break;
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
		dbg.location(233, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return code;
	}
	// $ANTLR end "assSt"



	// $ANTLR start "foreachSt"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:235:1: foreachSt returns [String code] : 'foreach' exp block ;
	public final String foreachSt() throws RecognitionException {
		String code = null;


		ParserRuleReturnScope exp19 =null;
		String block20 =null;

		try { dbg.enterRule(getGrammarFileName(), "foreachSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(235, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:235:31: ( 'foreach' exp block )
			dbg.enterAlt(1);

			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:236:5: 'foreach' exp block
			{
			dbg.location(236,5);
			match(input,44,FOLLOW_44_in_foreachSt366); dbg.location(236,15);
			pushFollow(FOLLOW_exp_in_foreachSt368);
			exp19=exp();
			state._fsp--;
			dbg.location(237,6);

						int t = block.pop()+1;
						block.push(t);
						String temp = newTemp();
						put(whatIsThis1(),Type.ELEMENT);
						put(temp,Type.ELEMENTS);
			    		String startLable = newLable();
			    		String endLable = newLable();
			    		code = (exp19!=null?((exp_return)exp19).code:null)
			    			+ "invokevirtual org/jsoup/select/Elements/iterator()Ljava/util/Iterator; \n"
			    			+ "astore_"+getLocalIndex(temp)+"\n"
			    			+ startLable+":\n"
			    			+ "aload_"+getLocalIndex(temp)+"\n"
			    			+ "invokeinterface java/util/Iterator/hasNext()Z 1\n"
			    			+ "ifeq "+endLable+"\n"
			    			+ "aload_"+getLocalIndex(temp)+"\n"
			                + "invokeinterface java/util/Iterator/next()Ljava/lang/Object; 1\n"
			                + "checkcast org/jsoup/nodes/Element\n"
			                + "astore_"+getLocalIndex(whatIsThis1())+"\n";
					dbg.location(257,6);
			pushFollow(FOLLOW_block_in_foreachSt382);
			block20=block();
			state._fsp--;
			dbg.location(258,7);

			     		code += block20
			     			+ "goto "+startLable+"\n"
			     			+ endLable+":\n";
			     	
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(262, 7);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "foreachSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return code;
	}
	// $ANTLR end "foreachSt"



	// $ANTLR start "parseSt"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:264:1: parseSt : ( 'parse' 'first' exp 'by' ID ';' | 'parse' 'last' exp 'by' ID ';' );
	public final void parseSt() throws RecognitionException {
		Token ID21=null;
		Token ID23=null;
		ParserRuleReturnScope exp22 =null;
		ParserRuleReturnScope exp24 =null;

		try { dbg.enterRule(getGrammarFileName(), "parseSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(264, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:264:9: ( 'parse' 'first' exp 'by' ID ';' | 'parse' 'last' exp 'by' ID ';' )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==47) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==43) ) {
					alt6=1;
				}
				else if ( (LA6_1==45) ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:264:11: 'parse' 'first' exp 'by' ID ';'
					{
					dbg.location(264,11);
					match(input,47,FOLLOW_47_in_parseSt399); dbg.location(264,19);
					match(input,43,FOLLOW_43_in_parseSt401); dbg.location(264,27);
					pushFollow(FOLLOW_exp_in_parseSt403);
					exp22=exp();
					state._fsp--;
					dbg.location(264,31);
					match(input,42,FOLLOW_42_in_parseSt405); dbg.location(264,36);
					ID21=(Token)match(input,ID,FOLLOW_ID_in_parseSt407); dbg.location(264,39);
					match(input,37,FOLLOW_37_in_parseSt409); dbg.location(265,4);
					 System.out.println((ID21!=null?ID21.getText():null)+"("+(exp22!=null?((exp_return)exp22).code:null)+")");
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:266:4: 'parse' 'last' exp 'by' ID ';'
					{
					dbg.location(266,4);
					match(input,47,FOLLOW_47_in_parseSt420); dbg.location(266,12);
					match(input,45,FOLLOW_45_in_parseSt422); dbg.location(266,19);
					pushFollow(FOLLOW_exp_in_parseSt424);
					exp24=exp();
					state._fsp--;
					dbg.location(266,23);
					match(input,42,FOLLOW_42_in_parseSt426); dbg.location(266,28);
					ID23=(Token)match(input,ID,FOLLOW_ID_in_parseSt428); dbg.location(266,31);
					match(input,37,FOLLOW_37_in_parseSt430); dbg.location(267,4);
					 System.out.println((ID23!=null?ID23.getText():null)+"("+(exp24!=null?((exp_return)exp24).code:null)+")");
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
		dbg.location(267, 53);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parseSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parseSt"



	// $ANTLR start "printSt"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:269:1: printSt returns [String code] : 'print' exp ';' ;
	public final String printSt() throws RecognitionException {
		String code = null;


		ParserRuleReturnScope exp25 =null;

		try { dbg.enterRule(getGrammarFileName(), "printSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(269, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:269:30: ( 'print' exp ';' )
			dbg.enterAlt(1);

			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:270:5: 'print' exp ';'
			{
			dbg.location(270,5);
			match(input,48,FOLLOW_48_in_printSt450); dbg.location(270,13);
			pushFollow(FOLLOW_exp_in_printSt452);
			exp25=exp();
			state._fsp--;
			dbg.location(270,17);
			match(input,37,FOLLOW_37_in_printSt454); dbg.location(271,5);

			    	String type = "";
			    	switch ((exp25!=null?((exp_return)exp25).type:null)){
			    	    case INTEGER:
			    	        type = "I";
			    	        break;
			    	    case STRING:
			    	        type = "Ljava/lang/String;";
			    	        break;
			    	}
			 
			        code = "getstatic java/lang/System/out Ljava/io/PrintStream; \n"
			            + (exp25!=null?((exp_return)exp25).code:null)
			            + "invokevirtual  java/io/PrintStream/println(" + type + ")V \n";
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(285, 6);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "printSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return code;
	}
	// $ANTLR end "printSt"


	public static class exp_return extends ParserRuleReturnScope {
		public String code;
		public Type type;
	};


	// $ANTLR start "exp"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:287:1: exp returns [String code, Type type] : x= multExpr ( PLS x= multExpr | MNS x= multExpr )* ;
	public final exp_return exp() throws RecognitionException {
		exp_return retval = new exp_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope x =null;

		try { dbg.enterRule(getGrammarFileName(), "exp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(287, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:287:37: (x= multExpr ( PLS x= multExpr | MNS x= multExpr )* )
			dbg.enterAlt(1);

			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:288:2: x= multExpr ( PLS x= multExpr | MNS x= multExpr )*
			{
			dbg.location(288,3);
			pushFollow(FOLLOW_multExpr_in_exp476);
			x=multExpr();
			state._fsp--;
			dbg.location(288,13);
			retval.code = (x!=null?((multExpr_return)x).code:null); retval.type = (x!=null?((multExpr_return)x).type:null);dbg.location(289,2);
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:289:2: ( PLS x= multExpr | MNS x= multExpr )*
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=3;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==PLS) ) {
					alt7=1;
				}
				else if ( (LA7_0==MNS) ) {
					alt7=2;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:289:3: PLS x= multExpr
					{
					dbg.location(289,3);
					match(input,PLS,FOLLOW_PLS_in_exp483); dbg.location(289,8);
					pushFollow(FOLLOW_multExpr_in_exp487);
					x=multExpr();
					state._fsp--;
					dbg.location(290,2);

						 	if (retval.type != Type.INTEGER || (x!=null?((multExpr_return)x).type:null) != Type.INTEGER){
					    		System.err.println("Not supported addition");
					    	} else {
					    		retval.code += (x!=null?((multExpr_return)x).code:null) + "iadd\n";
					    	}
						
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:297:3: MNS x= multExpr
					{
					dbg.location(297,3);
					match(input,MNS,FOLLOW_MNS_in_exp495); dbg.location(297,8);
					pushFollow(FOLLOW_multExpr_in_exp499);
					x=multExpr();
					state._fsp--;
					dbg.location(298,2);

							if (retval.type != Type.INTEGER || (x!=null?((multExpr_return)x).type:null) != Type.INTEGER){
					    		System.err.println("Not supported multiplication");
					    	} else {
					    		retval.code += (x!=null?((multExpr_return)x).code:null) + "isub\n";
					    	}
						
					}
					break;

				default :
					break loop7;
				}
			}
			} finally {dbg.exitSubRule(7);}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(304, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exp"


	public static class multExpr_return extends ParserRuleReturnScope {
		public String code;
		public Type type;
	};


	// $ANTLR start "multExpr"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:307:1: multExpr returns [String code, Type type] : x= atom ( MLP x= atom )* ;
	public final multExpr_return multExpr() throws RecognitionException {
		multExpr_return retval = new multExpr_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope x =null;

		try { dbg.enterRule(getGrammarFileName(), "multExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(307, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:308:5: (x= atom ( MLP x= atom )* )
			dbg.enterAlt(1);

			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:308:9: x= atom ( MLP x= atom )*
			{
			dbg.location(308,10);
			pushFollow(FOLLOW_atom_in_multExpr526);
			x=atom();
			state._fsp--;
			dbg.location(308,16);
			retval.code = (x!=null?((atom_return)x).code:null); retval.type = (x!=null?((atom_return)x).type:null);dbg.location(309,5);
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:309:5: ( MLP x= atom )*
			try { dbg.enterSubRule(8);

			loop8:
			while (true) {
				int alt8=2;
				try { dbg.enterDecision(8, decisionCanBacktrack[8]);

				int LA8_0 = input.LA(1);
				if ( (LA8_0==MLP) ) {
					alt8=1;
				}

				} finally {dbg.exitDecision(8);}

				switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:309:6: MLP x= atom
					{
					dbg.location(309,6);
					match(input,MLP,FOLLOW_MLP_in_multExpr536); dbg.location(309,11);
					pushFollow(FOLLOW_atom_in_multExpr540);
					x=atom();
					state._fsp--;
					dbg.location(310,5);

					    	if (retval.type != Type.INTEGER || (x!=null?((atom_return)x).type:null) != Type.INTEGER){
					    		System.err.println("Not supported multiplication");
					    	} else {
					    		retval.code += (x!=null?((atom_return)x).code:null) + "imul\n";
					    	}
					    	
					    
					}
					break;

				default :
					break loop8;
				}
			}
			} finally {dbg.exitSubRule(8);}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(317, 7);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "multExpr"


	public static class atom_return extends ParserRuleReturnScope {
		public String code;
		public Type type;
	};


	// $ANTLR start "atom"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:319:1: atom returns [String code, Type type] : ( ID | STRING | THIS ( '@' ( TEXT ) )? | integer | selector ( index ( '@' ( TEXT | ID ) )? )? );
	public final atom_return atom() throws RecognitionException {
		atom_return retval = new atom_return();
		retval.start = input.LT(1);

		Token ID26=null;
		Token STRING27=null;
		Token ID31=null;
		Integer integer28 =null;
		ParserRuleReturnScope selector29 =null;
		Integer index30 =null;

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(319, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:319:38: ( ID | STRING | THIS ( '@' ( TEXT ) )? | integer | selector ( index ( '@' ( TEXT | ID ) )? )? )
			int alt13=5;
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			switch ( input.LA(1) ) {
			case ID:
				{
				alt13=1;
				}
				break;
			case STRING:
				{
				alt13=2;
				}
				break;
			case THIS:
				{
				alt13=3;
				}
				break;
			case INTEGER:
				{
				alt13=4;
				}
				break;
			case LBR:
				{
				alt13=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:320:5: ID
					{
					dbg.location(320,5);
					ID26=(Token)match(input,ID,FOLLOW_ID_in_atom564); dbg.location(321,9);

					            Info info = get((ID26!=null?ID26.getText():null));
					            retval.type = info.getType();
					            
					            switch(retval.type){
					    	    case INTEGER:
					    	        retval.code = "iload_"+info.getLocal()+"\n";
					    	        break;
					    	    default:
					    	        retval.code = "aload_"+info.getLocal()+"\n";
					    	        break;
					            }
					        
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:334:6: STRING
					{
					dbg.location(334,6);
					STRING27=(Token)match(input,STRING,FOLLOW_STRING_in_atom581); dbg.location(335,9);

					            retval.code = "ldc "+ (STRING27!=null?STRING27.getText():null)  + " \n";
					            retval.type = Type.STRING;
					        
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:339:6: THIS ( '@' ( TEXT ) )?
					{
					dbg.location(339,6);
					match(input,THIS,FOLLOW_THIS_in_atom598); dbg.location(340,5);

					   		retval.code ="aload_"+getLocalIndex(whatIsThis())+"\n";
					   		retval.type =Type.DOCUMENT;
					    dbg.location(344,5);
					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:344:5: ( '@' ( TEXT ) )?
					int alt9=2;
					try { dbg.enterSubRule(9);
					try { dbg.enterDecision(9, decisionCanBacktrack[9]);

					int LA9_0 = input.LA(1);
					if ( (LA9_0==39) ) {
						alt9=1;
					}
					} finally {dbg.exitDecision(9);}

					switch (alt9) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:344:6: '@' ( TEXT )
							{
							dbg.location(344,6);
							match(input,39,FOLLOW_39_in_atom611); dbg.location(344,9);
							// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:344:9: ( TEXT )
							dbg.enterAlt(1);

							// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:344:10: TEXT
							{
							dbg.location(344,10);
							match(input,TEXT,FOLLOW_TEXT_in_atom613); 
							}
							dbg.location(345,6);

							   			retval.code += "checkcast org/jsoup/nodes/Element \n"
										+ "invokevirtual org/jsoup/nodes/Element/text()Ljava/lang/String; \n";
							   			retval.type = Type.STRING;
							    	
							}
							break;

					}
					} finally {dbg.exitSubRule(9);}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:350:6: integer
					{
					dbg.location(350,6);
					pushFollow(FOLLOW_integer_in_atom630);
					integer28=integer();
					state._fsp--;
					dbg.location(351,9);

					            if ( -128 < integer28 && integer28 < 128){
					            	retval.code = "bipush "+ integer28  + " \n";
					            } else if ( -32768 < integer28 && integer28 < 32767){
					            	retval.code = "sipush "+ integer28  + " \n";
					            } else {
					            	retval.code = "ldc "+ integer28  + " \n";
					            }
					            
					            retval.type = Type.INTEGER;
					        
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:362:6: selector ( index ( '@' ( TEXT | ID ) )? )?
					{
					dbg.location(362,6);
					pushFollow(FOLLOW_selector_in_atom647);
					selector29=selector();
					state._fsp--;
					dbg.location(362,14);
					retval.code = (selector29!=null?((selector_return)selector29).code:null); retval.type = (selector29!=null?((selector_return)selector29).type:null);dbg.location(363,6);
					// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:363:6: ( index ( '@' ( TEXT | ID ) )? )?
					int alt12=2;
					try { dbg.enterSubRule(12);
					try { dbg.enterDecision(12, decisionCanBacktrack[12]);

					int LA12_0 = input.LA(1);
					if ( (LA12_0==40) ) {
						alt12=1;
					}
					} finally {dbg.exitDecision(12);}

					switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:363:8: index ( '@' ( TEXT | ID ) )?
							{
							dbg.location(363,8);
							pushFollow(FOLLOW_index_in_atom657);
							index30=index();
							state._fsp--;
							dbg.location(364,7);

							    			retval.code += "iconst_" + index30 + "\n"
							    				+ "invokevirtual org/jsoup/select/Elements/get(I)Ljava/lang/Object;\n";
							    			retval.type = Type.ELEMENT;
							    		dbg.location(369,6);
							// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:369:6: ( '@' ( TEXT | ID ) )?
							int alt11=2;
							try { dbg.enterSubRule(11);
							try { dbg.enterDecision(11, decisionCanBacktrack[11]);

							int LA11_0 = input.LA(1);
							if ( (LA11_0==39) ) {
								alt11=1;
							}
							} finally {dbg.exitDecision(11);}

							switch (alt11) {
								case 1 :
									dbg.enterAlt(1);

									// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:369:7: '@' ( TEXT | ID )
									{
									dbg.location(369,7);
									match(input,39,FOLLOW_39_in_atom673); dbg.location(369,10);
									// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:369:10: ( TEXT | ID )
									int alt10=2;
									try { dbg.enterSubRule(10);
									try { dbg.enterDecision(10, decisionCanBacktrack[10]);

									int LA10_0 = input.LA(1);
									if ( (LA10_0==TEXT) ) {
										alt10=1;
									}
									else if ( (LA10_0==ID) ) {
										alt10=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 10, 0, input);
										dbg.recognitionException(nvae);
										throw nvae;
									}

									} finally {dbg.exitDecision(10);}

									switch (alt10) {
										case 1 :
											dbg.enterAlt(1);

											// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:369:11: TEXT
											{
											dbg.location(369,11);
											match(input,TEXT,FOLLOW_TEXT_in_atom675); dbg.location(370,7);

											    			retval.code += "checkcast org/jsoup/nodes/Element \n"
															+ "invokevirtual org/jsoup/nodes/Element/text()Ljava/lang/String; \n";
											    			retval.type = Type.STRING;
											    		
											}
											break;
										case 2 :
											dbg.enterAlt(2);

											// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:374:9: ID
											{
											dbg.location(374,9);
											ID31=(Token)match(input,ID,FOLLOW_ID_in_atom685); dbg.location(374,11);

											    			retval.code += "checkcast org/jsoup/nodes/Element \n"
											    				+ "ldc \""+(ID31!=null?ID31.getText():null)+"\"\n"
															+ "invokevirtual org/jsoup/nodes/Element/attr(Ljava/lang/String;)Ljava/lang/String\n";
											    			retval.type = Type.STRING;	
											    		
											}
											break;

									}
									} finally {dbg.exitSubRule(10);}

									}
									break;

							}
							} finally {dbg.exitSubRule(11);}

							}
							break;

					}
					} finally {dbg.exitSubRule(12);}

					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(380, 9);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "atom"



	// $ANTLR start "index"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:382:1: index returns [Integer value] : '[' integer ']' ;
	public final Integer index() throws RecognitionException {
		Integer value = null;


		Integer integer32 =null;

		try { dbg.enterRule(getGrammarFileName(), "index");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(382, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:382:29: ( '[' integer ']' )
			dbg.enterAlt(1);

			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:383:2: '[' integer ']'
			{
			dbg.location(383,2);
			match(input,40,FOLLOW_40_in_index714); dbg.location(383,6);
			pushFollow(FOLLOW_integer_in_index716);
			integer32=integer();
			state._fsp--;
			dbg.location(383,14);
			match(input,41,FOLLOW_41_in_index718); dbg.location(383,18);
			value = integer32;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(383, 44);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "index");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return value;
	}
	// $ANTLR end "index"


	public static class selector_return extends ParserRuleReturnScope {
		public String code;
		public Type type;
	};


	// $ANTLR start "selector"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:385:1: selector returns [String code, Type type] : LBR exp RBR ;
	public final selector_return selector() throws RecognitionException {
		selector_return retval = new selector_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope exp33 =null;

		try { dbg.enterRule(getGrammarFileName(), "selector");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(385, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:385:42: ( LBR exp RBR )
			dbg.enterAlt(1);

			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:386:3: LBR exp RBR
			{
			dbg.location(386,3);
			match(input,LBR,FOLLOW_LBR_in_selector734); dbg.location(386,7);
			pushFollow(FOLLOW_exp_in_selector736);
			exp33=exp();
			state._fsp--;
			dbg.location(386,11);
			match(input,RBR,FOLLOW_RBR_in_selector738); dbg.location(387,4);

							retval.type = (exp33!=null?((exp_return)exp33).type:null);
							switch((exp33!=null?((exp_return)exp33).type:null)){
								case STRING:
									retval.code = "aload_"+getLocalIndex(whatIsThis())+"\n"
									+ (exp33!=null?((exp_return)exp33).code:null)
									+ "invokevirtual org/jsoup/nodes/Document/select(Ljava/lang/String;)Lorg/jsoup/select/Elements; \n";
									break;
								case INTEGER:
									retval.code = (exp33!=null?((exp_return)exp33).code:null);
									break;
								default:
									System.err.println("Not supported parrentisses");
							}
						
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(401, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "selector");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "selector"



	// $ANTLR start "integer"
	// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:406:1: integer returns [Integer value] : INTEGER ;
	public final Integer integer() throws RecognitionException {
		Integer value = null;


		Token INTEGER34=null;

		try { dbg.enterRule(getGrammarFileName(), "integer");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(406, 0);

		try {
			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:406:31: ( INTEGER )
			dbg.enterAlt(1);

			// /Users/hamidfzm/Projects/Scrawl/Scrawl.g:407:2: INTEGER
			{
			dbg.location(407,2);
			INTEGER34=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_integer759); dbg.location(407,10);
			value = Integer.valueOf((INTEGER34!=null?INTEGER34.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(407, 51);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "integer");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return value;
	}
	// $ANTLR end "integer"

	// Delegated rules



	public static final BitSet FOLLOW_mainRoutine_in_root49 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_procedure_in_root53 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_49_in_procedure74 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_procedure76 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_procedure78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_mainRoutine95 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_mainRoutine97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_block114 = new BitSet(new long[]{0x0009900010019000L});
	public static final BitSet FOLLOW_statement_in_block132 = new BitSet(new long[]{0x0009900010019000L});
	public static final BitSet FOLLOW_51_in_block142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reqSt_in_statement159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assSt_in_statement168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachSt_in_statement176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parseSt_in_statement185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printSt_in_statement192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifSt_in_statement201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getReqSt_in_reqSt217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postReqSt_in_reqSt223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getReqSt237 = new BitSet(new long[]{0x0000000A00068000L});
	public static final BitSet FOLLOW_exp_in_getReqSt239 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_getReqSt247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POST_in_postReqSt260 = new BitSet(new long[]{0x0000000A00068000L});
	public static final BitSet FOLLOW_exp_in_postReqSt262 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_postReqSt268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifSt281 = new BitSet(new long[]{0x0000000A00068000L});
	public static final BitSet FOLLOW_conditionSt_in_ifSt283 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_ifSt287 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_ELSE_in_ifSt295 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_ifSt299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_conditionSt323 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQL_in_conditionSt325 = new BitSet(new long[]{0x0000000A00068000L});
	public static final BitSet FOLLOW_exp_in_conditionSt329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assSt343 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_assSt345 = new BitSet(new long[]{0x0000000A00068000L});
	public static final BitSet FOLLOW_exp_in_assSt347 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_assSt349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_foreachSt366 = new BitSet(new long[]{0x0000000A00068000L});
	public static final BitSet FOLLOW_exp_in_foreachSt368 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_foreachSt382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_parseSt399 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_parseSt401 = new BitSet(new long[]{0x0000000A00068000L});
	public static final BitSet FOLLOW_exp_in_parseSt403 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_parseSt405 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_parseSt407 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_parseSt409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_parseSt420 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_parseSt422 = new BitSet(new long[]{0x0000000A00068000L});
	public static final BitSet FOLLOW_exp_in_parseSt424 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_parseSt426 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_parseSt428 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_parseSt430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_printSt450 = new BitSet(new long[]{0x0000000A00068000L});
	public static final BitSet FOLLOW_exp_in_printSt452 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_printSt454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_exp476 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_PLS_in_exp483 = new BitSet(new long[]{0x0000000A00068000L});
	public static final BitSet FOLLOW_multExpr_in_exp487 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_MNS_in_exp495 = new BitSet(new long[]{0x0000000A00068000L});
	public static final BitSet FOLLOW_multExpr_in_exp499 = new BitSet(new long[]{0x0000000008800002L});
	public static final BitSet FOLLOW_atom_in_multExpr526 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_MLP_in_multExpr536 = new BitSet(new long[]{0x0000000A00068000L});
	public static final BitSet FOLLOW_atom_in_multExpr540 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_ID_in_atom564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIS_in_atom598 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_atom611 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_TEXT_in_atom613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_atom630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selector_in_atom647 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_index_in_atom657 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_atom673 = new BitSet(new long[]{0x0000000400008000L});
	public static final BitSet FOLLOW_TEXT_in_atom675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_index714 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_integer_in_index716 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_index718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_selector734 = new BitSet(new long[]{0x0000000A00068000L});
	public static final BitSet FOLLOW_exp_in_selector736 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RBR_in_selector738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_integer759 = new BitSet(new long[]{0x0000000000000002L});
}
