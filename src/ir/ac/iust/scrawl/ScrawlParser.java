// $ANTLR 3.5.1 /home/bardia/scrawl/Scrawl.g 2016-01-22 21:49:34

	package ir.ac.iust.scrawl;
	import org.antlr.runtime.*;

import java.util.HashMap;
import java.util.Stack;

@SuppressWarnings("all")
public class ScrawlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "COMMENT", "DELETE", "DIGIT", 
		"DIV", "EQL", "ESC", "EXP", "FLOAT", "GET", "GRQ", "GRT", "ID", "INTEGER", 
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
	public static final int EQL=9;
	public static final int ESC=10;
	public static final int EXP=11;
	public static final int FLOAT=12;
	public static final int GET=13;
	public static final int GRQ=14;
	public static final int GRT=15;
	public static final int ID=16;
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


	public ScrawlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ScrawlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ScrawlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/bardia/scrawl/Scrawl.g"; }


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
	// /home/bardia/scrawl/Scrawl.g:112:1: root returns [String code] : mainRoutine ( procedure )* ;
	public final String root() throws RecognitionException {
		String code = null;


		String mainRoutine1 =null;
		String procedure2 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:112:28: ( mainRoutine ( procedure )* )
			// /home/bardia/scrawl/Scrawl.g:113:5: mainRoutine ( procedure )*
			{

			        id2Info = new HashMap<>();
			        local2Info = new HashMap<>();
			        block.push(0);
			    
			pushFollow(FOLLOW_mainRoutine_in_root49);
			mainRoutine1=mainRoutine();
			state._fsp--;

			code = mainRoutine1; 
			// /home/bardia/scrawl/Scrawl.g:118:46: ( procedure )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==49) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:118:47: procedure
					{
					pushFollow(FOLLOW_procedure_in_root53);
					procedure2=procedure();
					state._fsp--;

					code += procedure2;
					}
					break;

				default :
					break loop1;
				}
			}

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
		return code;
	}
	// $ANTLR end "root"



	// $ANTLR start "procedure"
	// /home/bardia/scrawl/Scrawl.g:120:1: procedure returns [String code] : 'procedure' ID block ;
	public final String procedure() throws RecognitionException {
		String code = null;


		Token ID3=null;
		String block4 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:120:32: ( 'procedure' ID block )
			// /home/bardia/scrawl/Scrawl.g:121:5: 'procedure' ID block
			{
			match(input,49,FOLLOW_49_in_procedure74); 
			ID3=(Token)match(input,ID,FOLLOW_ID_in_procedure76); 
			pushFollow(FOLLOW_block_in_procedure78);
			block4=block();
			state._fsp--;

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
		return code;
	}
	// $ANTLR end "procedure"



	// $ANTLR start "mainRoutine"
	// /home/bardia/scrawl/Scrawl.g:129:1: mainRoutine returns [String code] : 'main' block ;
	public final String mainRoutine() throws RecognitionException {
		String code = null;


		String block5 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:129:34: ( 'main' block )
			// /home/bardia/scrawl/Scrawl.g:130:5: 'main' block
			{
			match(input,46,FOLLOW_46_in_mainRoutine95); 
			pushFollow(FOLLOW_block_in_mainRoutine97);
			block5=block();
			state._fsp--;

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
		return code;
	}
	// $ANTLR end "mainRoutine"



	// $ANTLR start "block"
	// /home/bardia/scrawl/Scrawl.g:147:1: block returns [String code] : '{' ( statement )* '}' ;
	public final String block() throws RecognitionException {
		String code = null;


		String statement6 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:147:28: ( '{' ( statement )* '}' )
			// /home/bardia/scrawl/Scrawl.g:148:5: '{' ( statement )* '}'
			{
			match(input,50,FOLLOW_50_in_block114); 

			    		code = "";
			    		block.push(0);
			    	
			// /home/bardia/scrawl/Scrawl.g:152:14: ( statement )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==GET||LA2_0==ID||LA2_0==POST||LA2_0==44||(LA2_0 >= 47 && LA2_0 <= 48)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:152:15: statement
					{
					pushFollow(FOLLOW_statement_in_block132);
					statement6=statement();
					state._fsp--;

					code += statement6;
					}
					break;

				default :
					break loop2;
				}
			}

			match(input,51,FOLLOW_51_in_block142); 
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
		return code;
	}
	// $ANTLR end "block"



	// $ANTLR start "statement"
	// /home/bardia/scrawl/Scrawl.g:155:1: statement returns [String code] : ( reqSt | assSt | foreachSt | parseSt | printSt );
	public final String statement() throws RecognitionException {
		String code = null;


		String reqSt7 =null;
		String assSt8 =null;
		String foreachSt9 =null;
		String printSt10 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:155:32: ( reqSt | assSt | foreachSt | parseSt | printSt )
			int alt3=5;
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:156:5: reqSt
					{
					pushFollow(FOLLOW_reqSt_in_statement159);
					reqSt7=reqSt();
					state._fsp--;

					 code = reqSt7; 
					}
					break;
				case 2 :
					// /home/bardia/scrawl/Scrawl.g:157:6: assSt
					{
					pushFollow(FOLLOW_assSt_in_statement168);
					assSt8=assSt();
					state._fsp--;

					 code = assSt8; 
					}
					break;
				case 3 :
					// /home/bardia/scrawl/Scrawl.g:158:6: foreachSt
					{
					pushFollow(FOLLOW_foreachSt_in_statement176);
					foreachSt9=foreachSt();
					state._fsp--;

					 code = foreachSt9; 
					}
					break;
				case 4 :
					// /home/bardia/scrawl/Scrawl.g:159:6: parseSt
					{
					pushFollow(FOLLOW_parseSt_in_statement185);
					parseSt();
					state._fsp--;

					}
					break;
				case 5 :
					// /home/bardia/scrawl/Scrawl.g:160:6: printSt
					{
					pushFollow(FOLLOW_printSt_in_statement192);
					printSt10=printSt();
					state._fsp--;

					 code = printSt10; 
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
		return code;
	}
	// $ANTLR end "statement"



	// $ANTLR start "reqSt"
	// /home/bardia/scrawl/Scrawl.g:162:1: reqSt returns [String code] : ( getReqSt | postReqSt );
	public final String reqSt() throws RecognitionException {
		String code = null;


		String getReqSt11 =null;
		String postReqSt12 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:162:29: ( getReqSt | postReqSt )
			int alt4=2;
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
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:163:2: getReqSt
					{
					pushFollow(FOLLOW_getReqSt_in_reqSt208);
					getReqSt11=getReqSt();
					state._fsp--;

					 code = getReqSt11; 
					}
					break;
				case 2 :
					// /home/bardia/scrawl/Scrawl.g:164:3: postReqSt
					{
					pushFollow(FOLLOW_postReqSt_in_reqSt214);
					postReqSt12=postReqSt();
					state._fsp--;

					 code = postReqSt12; 
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
		return code;
	}
	// $ANTLR end "reqSt"



	// $ANTLR start "getReqSt"
	// /home/bardia/scrawl/Scrawl.g:166:1: getReqSt returns [String code] : GET exp block ;
	public final String getReqSt() throws RecognitionException {
		String code = null;


		ParserRuleReturnScope exp13 =null;
		String block14 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:166:31: ( GET exp block )
			// /home/bardia/scrawl/Scrawl.g:167:2: GET exp block
			{
			match(input,GET,FOLLOW_GET_in_getReqSt228); 
			pushFollow(FOLLOW_exp_in_getReqSt230);
			exp13=exp();
			state._fsp--;


						int t = block.pop()+1;
						block.push(t);
						put(whatIsThis1(),(exp13!=null?((exp_return)exp13).type:null));
						code = (exp13!=null?((exp_return)exp13).code:null)
							+ "invokestatic ir/ac/iust/scrawl/scrawlib/Helper/Get(Ljava/lang/String;)Lorg/jsoup/nodes/Document; \n"
							+ "astore_"+getLocalIndex(whatIsThis1())+" \n";
					
			pushFollow(FOLLOW_block_in_getReqSt238);
			block14=block();
			state._fsp--;

			code += block14;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "getReqSt"



	// $ANTLR start "postReqSt"
	// /home/bardia/scrawl/Scrawl.g:178:1: postReqSt returns [String code] : POST STRING block ;
	public final String postReqSt() throws RecognitionException {
		String code = null;


		try {
			// /home/bardia/scrawl/Scrawl.g:178:32: ( POST STRING block )
			// /home/bardia/scrawl/Scrawl.g:179:2: POST STRING block
			{
			match(input,POST,FOLLOW_POST_in_postReqSt251); 
			match(input,STRING,FOLLOW_STRING_in_postReqSt253); 

					
			pushFollow(FOLLOW_block_in_postReqSt259);
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
		return code;
	}
	// $ANTLR end "postReqSt"



	// $ANTLR start "assSt"
	// /home/bardia/scrawl/Scrawl.g:183:1: assSt returns [String code] : ID '=' exp ';' ;
	public final String assSt() throws RecognitionException {
		String code = null;


		Token ID15=null;
		ParserRuleReturnScope exp16 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:183:27: ( ID '=' exp ';' )
			// /home/bardia/scrawl/Scrawl.g:184:2: ID '=' exp ';'
			{
			ID15=(Token)match(input,ID,FOLLOW_ID_in_assSt270); 
			match(input,38,FOLLOW_38_in_assSt272); 
			pushFollow(FOLLOW_exp_in_assSt274);
			exp16=exp();
			state._fsp--;

			match(input,37,FOLLOW_37_in_assSt276); 

					put((ID15!=null?ID15.getText():null),(exp16!=null?((exp_return)exp16).type:null));
					code = (exp16!=null?((exp_return)exp16).code:null);
					
					switch((exp16!=null?((exp_return)exp16).type:null)){
			    	    case INTEGER:
			    	        code += "istore_"+getLocalIndex((ID15!=null?ID15.getText():null))+"\n";
			    	        break;
			    	    default:
			    	        code += "astore_"+getLocalIndex((ID15!=null?ID15.getText():null))+"\n";
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
		return code;
	}
	// $ANTLR end "assSt"



	// $ANTLR start "foreachSt"
	// /home/bardia/scrawl/Scrawl.g:199:1: foreachSt returns [String code] : 'foreach' exp block ;
	public final String foreachSt() throws RecognitionException {
		String code = null;


		ParserRuleReturnScope exp17 =null;
		String block18 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:199:31: ( 'foreach' exp block )
			// /home/bardia/scrawl/Scrawl.g:200:5: 'foreach' exp block
			{
			match(input,44,FOLLOW_44_in_foreachSt293); 
			pushFollow(FOLLOW_exp_in_foreachSt295);
			exp17=exp();
			state._fsp--;


						int t = block.pop()+1;
						block.push(t);
						String temp = newTemp();
						put(whatIsThis1(),Type.ELEMENT);
						put(temp,Type.ELEMENTS);
			    		String startLable = newLable();
			    		String endLable = newLable();
			    		code ="aload_"+getLocalIndex(whatIsThis())+"\n"
						+ (exp17!=null?((exp_return)exp17).code:null)
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
					
			pushFollow(FOLLOW_block_in_foreachSt309);
			block18=block();
			state._fsp--;


			     		code += block18
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
		return code;
	}
	// $ANTLR end "foreachSt"



	// $ANTLR start "parseSt"
	// /home/bardia/scrawl/Scrawl.g:229:1: parseSt : ( 'parse' 'first' exp 'by' ID ';' | 'parse' 'last' exp 'by' ID ';' );
	public final void parseSt() throws RecognitionException {
		Token ID19=null;
		Token ID21=null;
		ParserRuleReturnScope exp20 =null;
		ParserRuleReturnScope exp22 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:229:9: ( 'parse' 'first' exp 'by' ID ';' | 'parse' 'last' exp 'by' ID ';' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==47) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==43) ) {
					alt5=1;
				}
				else if ( (LA5_1==45) ) {
					alt5=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:229:11: 'parse' 'first' exp 'by' ID ';'
					{
					match(input,47,FOLLOW_47_in_parseSt326); 
					match(input,43,FOLLOW_43_in_parseSt328); 
					pushFollow(FOLLOW_exp_in_parseSt330);
					exp20=exp();
					state._fsp--;

					match(input,42,FOLLOW_42_in_parseSt332); 
					ID19=(Token)match(input,ID,FOLLOW_ID_in_parseSt334); 
					match(input,37,FOLLOW_37_in_parseSt336); 
					 System.out.println((ID19!=null?ID19.getText():null)+"("+(exp20!=null?((exp_return)exp20).code:null)+")");
					}
					break;
				case 2 :
					// /home/bardia/scrawl/Scrawl.g:231:4: 'parse' 'last' exp 'by' ID ';'
					{
					match(input,47,FOLLOW_47_in_parseSt347); 
					match(input,45,FOLLOW_45_in_parseSt349); 
					pushFollow(FOLLOW_exp_in_parseSt351);
					exp22=exp();
					state._fsp--;

					match(input,42,FOLLOW_42_in_parseSt353); 
					ID21=(Token)match(input,ID,FOLLOW_ID_in_parseSt355); 
					match(input,37,FOLLOW_37_in_parseSt357); 
					 System.out.println((ID21!=null?ID21.getText():null)+"("+(exp22!=null?((exp_return)exp22).code:null)+")");
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
	// $ANTLR end "parseSt"



	// $ANTLR start "printSt"
	// /home/bardia/scrawl/Scrawl.g:234:1: printSt returns [String code] : 'print' exp ';' ;
	public final String printSt() throws RecognitionException {
		String code = null;


		ParserRuleReturnScope exp23 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:234:30: ( 'print' exp ';' )
			// /home/bardia/scrawl/Scrawl.g:235:5: 'print' exp ';'
			{
			match(input,48,FOLLOW_48_in_printSt377); 
			pushFollow(FOLLOW_exp_in_printSt379);
			exp23=exp();
			state._fsp--;

			match(input,37,FOLLOW_37_in_printSt381); 

			    	String type = "";
			    	switch ((exp23!=null?((exp_return)exp23).type:null)){
			    	    case INTEGER:
			    	        type = "I";
			    	        break;
			    	    case STRING:
			    	        type = "Ljava/lang/String;";
			    	        break;
			    	}
			 
			        code = "getstatic java/lang/System/out Ljava/io/PrintStream; \n"
			            + (exp23!=null?((exp_return)exp23).code:null)
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
		return code;
	}
	// $ANTLR end "printSt"


	public static class exp_return extends ParserRuleReturnScope {
		public String code;
		public Type type;
	};


	// $ANTLR start "exp"
	// /home/bardia/scrawl/Scrawl.g:252:1: exp returns [String code, Type type] : ( STRING | variable ( selector ( element ( attribute )? )? )? | integer | selector ( element ( attribute )? )? );
	public final exp_return exp() throws RecognitionException {
		exp_return retval = new exp_return();
		retval.start = input.LT(1);

		Token STRING24=null;
		ParserRuleReturnScope variable25 =null;
		String selector26 =null;
		String element27 =null;
		String attribute28 =null;
		Integer integer29 =null;
		String selector30 =null;
		String element31 =null;
		String attribute32 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:252:37: ( STRING | variable ( selector ( element ( attribute )? )? )? | integer | selector ( element ( attribute )? )? )
			int alt11=4;
			switch ( input.LA(1) ) {
			case STRING:
				{
				alt11=1;
				}
				break;
			case ID:
			case THIS:
				{
				alt11=2;
				}
				break;
			case INTEGER:
				{
				alt11=3;
				}
				break;
			case LBR:
				{
				alt11=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:253:5: STRING
					{
					STRING24=(Token)match(input,STRING,FOLLOW_STRING_in_exp404); 

					            retval.code = "ldc "+ (STRING24!=null?STRING24.getText():null)  + " \n";
					            retval.type = Type.STRING;
					        
					}
					break;
				case 2 :
					// /home/bardia/scrawl/Scrawl.g:258:7: variable ( selector ( element ( attribute )? )? )?
					{
					pushFollow(FOLLOW_variable_in_exp422);
					variable25=variable();
					state._fsp--;

					 retval.code = (variable25!=null?((variable_return)variable25).code:null); retval.type = (variable25!=null?((variable_return)variable25).type:null);
					// /home/bardia/scrawl/Scrawl.g:259:10: ( selector ( element ( attribute )? )? )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==LBR) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /home/bardia/scrawl/Scrawl.g:259:11: selector ( element ( attribute )? )?
							{
							pushFollow(FOLLOW_selector_in_exp436);
							selector26=selector();
							state._fsp--;

							 retval.code += selector26; retval.type = Type.ELEMENTS;
							// /home/bardia/scrawl/Scrawl.g:260:6: ( element ( attribute )? )?
							int alt7=2;
							int LA7_0 = input.LA(1);
							if ( (LA7_0==40) ) {
								alt7=1;
							}
							switch (alt7) {
								case 1 :
									// /home/bardia/scrawl/Scrawl.g:260:7: element ( attribute )?
									{
									pushFollow(FOLLOW_element_in_exp446);
									element27=element();
									state._fsp--;

									 retval.code += element27; retval.type = Type.ELEMENT;
									// /home/bardia/scrawl/Scrawl.g:261:6: ( attribute )?
									int alt6=2;
									int LA6_0 = input.LA(1);
									if ( (LA6_0==39) ) {
										alt6=1;
									}
									switch (alt6) {
										case 1 :
											// /home/bardia/scrawl/Scrawl.g:261:7: attribute
											{
											pushFollow(FOLLOW_attribute_in_exp456);
											attribute28=attribute();
											state._fsp--;

											 retval.code += attribute28; retval.type = Type.STRING;
											}
											break;

									}

									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 3 :
					// /home/bardia/scrawl/Scrawl.g:263:7: integer
					{
					pushFollow(FOLLOW_integer_in_exp479);
					integer29=integer();
					state._fsp--;


					            if ( -128 < integer29 && integer29 < 128){
					            	retval.code = "bipush "+ integer29  + " \n";
					            } else if ( -32768 < integer29 && integer29 < 32767){
					            	retval.code = "sipush "+ integer29  + " \n";
					            } else {
					            	retval.code = "ldc "+ integer29  + " \n";
					            }
					            
					            retval.type = Type.INTEGER;
					        
					}
					break;
				case 4 :
					// /home/bardia/scrawl/Scrawl.g:275:6: selector ( element ( attribute )? )?
					{
					pushFollow(FOLLOW_selector_in_exp496);
					selector30=selector();
					state._fsp--;

					retval.code = selector30; retval.type = Type.ELEMENTS;
					// /home/bardia/scrawl/Scrawl.g:276:10: ( element ( attribute )? )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==40) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /home/bardia/scrawl/Scrawl.g:276:11: element ( attribute )?
							{
							pushFollow(FOLLOW_element_in_exp509);
							element31=element();
							state._fsp--;

							 retval.code += element31; retval.type = Type.ELEMENT;
							// /home/bardia/scrawl/Scrawl.g:277:6: ( attribute )?
							int alt9=2;
							int LA9_0 = input.LA(1);
							if ( (LA9_0==39) ) {
								alt9=1;
							}
							switch (alt9) {
								case 1 :
									// /home/bardia/scrawl/Scrawl.g:277:7: attribute
									{
									pushFollow(FOLLOW_attribute_in_exp519);
									attribute32=attribute();
									state._fsp--;

									 retval.code += attribute32; retval.type = Type.STRING;
									}
									break;

							}

							}
							break;

					}

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
		return retval;
	}
	// $ANTLR end "exp"



	// $ANTLR start "element"
	// /home/bardia/scrawl/Scrawl.g:280:1: element returns [String code] : index ;
	public final String element() throws RecognitionException {
		String code = null;


		String index33 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:280:29: ( index )
			// /home/bardia/scrawl/Scrawl.g:281:2: index
			{
			pushFollow(FOLLOW_index_in_element547);
			index33=index();
			state._fsp--;

			     	
					code = "iconst_"+Integer.valueOf(index33) +"\n"
			    			+ "invokevirtual org/jsoup/select/Elements/get(I)Ljava/lang/Object;\n";
			    		
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "element"



	// $ANTLR start "attribute"
	// /home/bardia/scrawl/Scrawl.g:286:1: attribute returns [String code] : '@' ( TEXT | ID ) ;
	public final String attribute() throws RecognitionException {
		String code = null;


		Token ID34=null;

		try {
			// /home/bardia/scrawl/Scrawl.g:286:31: ( '@' ( TEXT | ID ) )
			// /home/bardia/scrawl/Scrawl.g:287:2: '@' ( TEXT | ID )
			{
			match(input,39,FOLLOW_39_in_attribute566); 
			// /home/bardia/scrawl/Scrawl.g:287:5: ( TEXT | ID )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==TEXT) ) {
				alt12=1;
			}
			else if ( (LA12_0==ID) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:287:6: TEXT
					{
					match(input,TEXT,FOLLOW_TEXT_in_attribute568); 

					    		code = "checkcast org/jsoup/nodes/Element \n"
								+ "invokevirtual org/jsoup/nodes/Element/text()Ljava/lang/String; \n";
					    	
					}
					break;
				case 2 :
					// /home/bardia/scrawl/Scrawl.g:291:8: ID
					{
					ID34=(Token)match(input,ID,FOLLOW_ID_in_attribute577); 
					 
							code = "checkcast org/jsoup/nodes/Element \n"
								+ "ldc \""+(ID34!=null?ID34.getText():null)+"\"\n"
								+ "invokevirtual org/jsoup/nodes/Element/attr(Ljava/lang/String;)Ljava/lang/String\n";
					    	
					}
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
		return code;
	}
	// $ANTLR end "attribute"


	public static class variable_return extends ParserRuleReturnScope {
		public String code;
		public Type type;
	};


	// $ANTLR start "variable"
	// /home/bardia/scrawl/Scrawl.g:297:1: variable returns [String code, Type type] : ( ID | THIS );
	public final variable_return variable() throws RecognitionException {
		variable_return retval = new variable_return();
		retval.start = input.LT(1);

		Token ID35=null;

		try {
			// /home/bardia/scrawl/Scrawl.g:297:43: ( ID | THIS )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ID) ) {
				alt13=1;
			}
			else if ( (LA13_0==THIS) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:298:2: ID
					{
					ID35=(Token)match(input,ID,FOLLOW_ID_in_variable597); 

					            Info info = get((ID35!=null?ID35.getText():null));
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
					// /home/bardia/scrawl/Scrawl.g:312:6: THIS
					{
					match(input,THIS,FOLLOW_THIS_in_variable614); 

					    		retval.code ="aload_"+getLocalIndex(whatIsThis())+"\n";
					    		retval.type =Type.DOCUMENT;
					    	
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
		return retval;
	}
	// $ANTLR end "variable"



	// $ANTLR start "index"
	// /home/bardia/scrawl/Scrawl.g:318:1: index returns [String value] : '[' INTEGER ']' ;
	public final String index() throws RecognitionException {
		String value = null;


		Token INTEGER36=null;

		try {
			// /home/bardia/scrawl/Scrawl.g:318:28: ( '[' INTEGER ']' )
			// /home/bardia/scrawl/Scrawl.g:319:2: '[' INTEGER ']'
			{
			match(input,40,FOLLOW_40_in_index638); 
			INTEGER36=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_index640); 
			match(input,41,FOLLOW_41_in_index642); 
			value = (INTEGER36!=null?INTEGER36.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "index"



	// $ANTLR start "selector"
	// /home/bardia/scrawl/Scrawl.g:320:1: selector returns [String code] : '(' STRING ')' ;
	public final String selector() throws RecognitionException {
		String code = null;


		Token STRING37=null;

		try {
			// /home/bardia/scrawl/Scrawl.g:320:31: ( '(' STRING ')' )
			// /home/bardia/scrawl/Scrawl.g:321:3: '(' STRING ')'
			{
			match(input,LBR,FOLLOW_LBR_in_selector657); 
			STRING37=(Token)match(input,STRING,FOLLOW_STRING_in_selector659); 
			match(input,RBR,FOLLOW_RBR_in_selector661); 

							code =  "ldc " + (STRING37!=null?STRING37.getText():null) + "\n"
								+ "invokevirtual org/jsoup/nodes/Document/select(Ljava/lang/String;)Lorg/jsoup/select/Elements; \n";
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "selector"



	// $ANTLR start "integer"
	// /home/bardia/scrawl/Scrawl.g:330:1: integer returns [Integer value] : INTEGER ;
	public final Integer integer() throws RecognitionException {
		Integer value = null;


		Token INTEGER38=null;

		try {
			// /home/bardia/scrawl/Scrawl.g:330:31: ( INTEGER )
			// /home/bardia/scrawl/Scrawl.g:331:2: INTEGER
			{
			INTEGER38=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_integer682); 
			value = Integer.valueOf((INTEGER38!=null?INTEGER38.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "integer"

	// Delegated rules



	public static final BitSet FOLLOW_mainRoutine_in_root49 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_procedure_in_root53 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_49_in_procedure74 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_procedure76 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_procedure78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_mainRoutine95 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_mainRoutine97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_block114 = new BitSet(new long[]{0x0009900010012000L});
	public static final BitSet FOLLOW_statement_in_block132 = new BitSet(new long[]{0x0009900010012000L});
	public static final BitSet FOLLOW_51_in_block142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reqSt_in_statement159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assSt_in_statement168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachSt_in_statement176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parseSt_in_statement185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printSt_in_statement192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getReqSt_in_reqSt208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postReqSt_in_reqSt214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getReqSt228 = new BitSet(new long[]{0x0000000A00070000L});
	public static final BitSet FOLLOW_exp_in_getReqSt230 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_getReqSt238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POST_in_postReqSt251 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_STRING_in_postReqSt253 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_postReqSt259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assSt270 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_assSt272 = new BitSet(new long[]{0x0000000A00070000L});
	public static final BitSet FOLLOW_exp_in_assSt274 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_assSt276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_foreachSt293 = new BitSet(new long[]{0x0000000A00070000L});
	public static final BitSet FOLLOW_exp_in_foreachSt295 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_block_in_foreachSt309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_parseSt326 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_parseSt328 = new BitSet(new long[]{0x0000000A00070000L});
	public static final BitSet FOLLOW_exp_in_parseSt330 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_parseSt332 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_parseSt334 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_parseSt336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_parseSt347 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_parseSt349 = new BitSet(new long[]{0x0000000A00070000L});
	public static final BitSet FOLLOW_exp_in_parseSt351 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_parseSt353 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_parseSt355 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_parseSt357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_printSt377 = new BitSet(new long[]{0x0000000A00070000L});
	public static final BitSet FOLLOW_exp_in_printSt379 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_printSt381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_exp404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_exp422 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_selector_in_exp436 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_element_in_exp446 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_attribute_in_exp456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_exp479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selector_in_exp496 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_element_in_exp509 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_attribute_in_exp519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_index_in_element547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_attribute566 = new BitSet(new long[]{0x0000000400010000L});
	public static final BitSet FOLLOW_TEXT_in_attribute568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attribute577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_variable597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIS_in_variable614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_index638 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_INTEGER_in_index640 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_index642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBR_in_selector657 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_STRING_in_selector659 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_RBR_in_selector661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_integer682 = new BitSet(new long[]{0x0000000000000002L});
}
