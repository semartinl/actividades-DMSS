package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Root'", "'{'", "'conectores'", "','", "'}'", "'componentes'", "'Conector'", "'origen'", "'destino'", "'Componente'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalMyDsl.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalMyDsl.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalMyDsl.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalMyDsl.g:71:1: ruleRoot returns [EObject current=null] : ( () otherlv_1= 'Root' otherlv_2= '{' (otherlv_3= 'conectores' otherlv_4= '{' ( (lv_conectores_5_0= ruleConector ) ) (otherlv_6= ',' ( (lv_conectores_7_0= ruleConector ) ) )* otherlv_8= '}' )? (otherlv_9= 'componentes' otherlv_10= '{' ( (lv_componentes_11_0= ruleComponente ) ) (otherlv_12= ',' ( (lv_componentes_13_0= ruleComponente ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_conectores_5_0 = null;

        EObject lv_conectores_7_0 = null;

        EObject lv_componentes_11_0 = null;

        EObject lv_componentes_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'Root' otherlv_2= '{' (otherlv_3= 'conectores' otherlv_4= '{' ( (lv_conectores_5_0= ruleConector ) ) (otherlv_6= ',' ( (lv_conectores_7_0= ruleConector ) ) )* otherlv_8= '}' )? (otherlv_9= 'componentes' otherlv_10= '{' ( (lv_componentes_11_0= ruleComponente ) ) (otherlv_12= ',' ( (lv_componentes_13_0= ruleComponente ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'Root' otherlv_2= '{' (otherlv_3= 'conectores' otherlv_4= '{' ( (lv_conectores_5_0= ruleConector ) ) (otherlv_6= ',' ( (lv_conectores_7_0= ruleConector ) ) )* otherlv_8= '}' )? (otherlv_9= 'componentes' otherlv_10= '{' ( (lv_componentes_11_0= ruleComponente ) ) (otherlv_12= ',' ( (lv_componentes_13_0= ruleComponente ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'Root' otherlv_2= '{' (otherlv_3= 'conectores' otherlv_4= '{' ( (lv_conectores_5_0= ruleConector ) ) (otherlv_6= ',' ( (lv_conectores_7_0= ruleConector ) ) )* otherlv_8= '}' )? (otherlv_9= 'componentes' otherlv_10= '{' ( (lv_componentes_11_0= ruleComponente ) ) (otherlv_12= ',' ( (lv_componentes_13_0= ruleComponente ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalMyDsl.g:79:3: () otherlv_1= 'Root' otherlv_2= '{' (otherlv_3= 'conectores' otherlv_4= '{' ( (lv_conectores_5_0= ruleConector ) ) (otherlv_6= ',' ( (lv_conectores_7_0= ruleConector ) ) )* otherlv_8= '}' )? (otherlv_9= 'componentes' otherlv_10= '{' ( (lv_componentes_11_0= ruleComponente ) ) (otherlv_12= ',' ( (lv_componentes_13_0= ruleComponente ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRootAccess().getRootAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRootAccess().getRootKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:94:3: (otherlv_3= 'conectores' otherlv_4= '{' ( (lv_conectores_5_0= ruleConector ) ) (otherlv_6= ',' ( (lv_conectores_7_0= ruleConector ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:95:4: otherlv_3= 'conectores' otherlv_4= '{' ( (lv_conectores_5_0= ruleConector ) ) (otherlv_6= ',' ( (lv_conectores_7_0= ruleConector ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRootAccess().getConectoresKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:103:4: ( (lv_conectores_5_0= ruleConector ) )
                    // InternalMyDsl.g:104:5: (lv_conectores_5_0= ruleConector )
                    {
                    // InternalMyDsl.g:104:5: (lv_conectores_5_0= ruleConector )
                    // InternalMyDsl.g:105:6: lv_conectores_5_0= ruleConector
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getConectoresConectorParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_conectores_5_0=ruleConector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						add(
                    							current,
                    							"conectores",
                    							lv_conectores_5_0,
                    							"org.xtext.example.mydsl.MyDsl.Conector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:122:4: (otherlv_6= ',' ( (lv_conectores_7_0= ruleConector ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:123:5: otherlv_6= ',' ( (lv_conectores_7_0= ruleConector ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRootAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:127:5: ( (lv_conectores_7_0= ruleConector ) )
                    	    // InternalMyDsl.g:128:6: (lv_conectores_7_0= ruleConector )
                    	    {
                    	    // InternalMyDsl.g:128:6: (lv_conectores_7_0= ruleConector )
                    	    // InternalMyDsl.g:129:7: lv_conectores_7_0= ruleConector
                    	    {

                    	    							newCompositeNode(grammarAccess.getRootAccess().getConectoresConectorParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_conectores_7_0=ruleConector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"conectores",
                    	    								lv_conectores_7_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Conector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:152:3: (otherlv_9= 'componentes' otherlv_10= '{' ( (lv_componentes_11_0= ruleComponente ) ) (otherlv_12= ',' ( (lv_componentes_13_0= ruleComponente ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:153:4: otherlv_9= 'componentes' otherlv_10= '{' ( (lv_componentes_11_0= ruleComponente ) ) (otherlv_12= ',' ( (lv_componentes_13_0= ruleComponente ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getRootAccess().getComponentesKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:161:4: ( (lv_componentes_11_0= ruleComponente ) )
                    // InternalMyDsl.g:162:5: (lv_componentes_11_0= ruleComponente )
                    {
                    // InternalMyDsl.g:162:5: (lv_componentes_11_0= ruleComponente )
                    // InternalMyDsl.g:163:6: lv_componentes_11_0= ruleComponente
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getComponentesComponenteParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_componentes_11_0=ruleComponente();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						add(
                    							current,
                    							"componentes",
                    							lv_componentes_11_0,
                    							"org.xtext.example.mydsl.MyDsl.Componente");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:180:4: (otherlv_12= ',' ( (lv_componentes_13_0= ruleComponente ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:181:5: otherlv_12= ',' ( (lv_componentes_13_0= ruleComponente ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRootAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:185:5: ( (lv_componentes_13_0= ruleComponente ) )
                    	    // InternalMyDsl.g:186:6: (lv_componentes_13_0= ruleComponente )
                    	    {
                    	    // InternalMyDsl.g:186:6: (lv_componentes_13_0= ruleComponente )
                    	    // InternalMyDsl.g:187:7: lv_componentes_13_0= ruleComponente
                    	    {

                    	    							newCompositeNode(grammarAccess.getRootAccess().getComponentesComponenteParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_componentes_13_0=ruleComponente();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"componentes",
                    	    								lv_componentes_13_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Componente");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleConector"
    // InternalMyDsl.g:218:1: entryRuleConector returns [EObject current=null] : iv_ruleConector= ruleConector EOF ;
    public final EObject entryRuleConector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConector = null;


        try {
            // InternalMyDsl.g:218:49: (iv_ruleConector= ruleConector EOF )
            // InternalMyDsl.g:219:2: iv_ruleConector= ruleConector EOF
            {
             newCompositeNode(grammarAccess.getConectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConector=ruleConector();

            state._fsp--;

             current =iv_ruleConector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConector"


    // $ANTLR start "ruleConector"
    // InternalMyDsl.g:225:1: ruleConector returns [EObject current=null] : (otherlv_0= 'Conector' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'origen' ( ( ruleEString ) ) otherlv_5= 'destino' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleConector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:231:2: ( (otherlv_0= 'Conector' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'origen' ( ( ruleEString ) ) otherlv_5= 'destino' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:232:2: (otherlv_0= 'Conector' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'origen' ( ( ruleEString ) ) otherlv_5= 'destino' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:232:2: (otherlv_0= 'Conector' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'origen' ( ( ruleEString ) ) otherlv_5= 'destino' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalMyDsl.g:233:3: otherlv_0= 'Conector' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'origen' ( ( ruleEString ) ) otherlv_5= 'destino' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getConectorAccess().getConectorKeyword_0());
            		
            // InternalMyDsl.g:237:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:238:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:238:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:239:5: lv_nombre_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConectorAccess().getNombreEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConectorRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getConectorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getConectorAccess().getOrigenKeyword_3());
            		
            // InternalMyDsl.g:264:3: ( ( ruleEString ) )
            // InternalMyDsl.g:265:4: ( ruleEString )
            {
            // InternalMyDsl.g:265:4: ( ruleEString )
            // InternalMyDsl.g:266:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConectorAccess().getOrigenComponenteCrossReference_4_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getConectorAccess().getDestinoKeyword_5());
            		
            // InternalMyDsl.g:284:3: ( ( ruleEString ) )
            // InternalMyDsl.g:285:4: ( ruleEString )
            {
            // InternalMyDsl.g:285:4: ( ruleEString )
            // InternalMyDsl.g:286:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConectorAccess().getDestinoComponenteCrossReference_6_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConectorAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConector"


    // $ANTLR start "entryRuleComponente"
    // InternalMyDsl.g:308:1: entryRuleComponente returns [EObject current=null] : iv_ruleComponente= ruleComponente EOF ;
    public final EObject entryRuleComponente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponente = null;


        try {
            // InternalMyDsl.g:308:51: (iv_ruleComponente= ruleComponente EOF )
            // InternalMyDsl.g:309:2: iv_ruleComponente= ruleComponente EOF
            {
             newCompositeNode(grammarAccess.getComponenteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponente=ruleComponente();

            state._fsp--;

             current =iv_ruleComponente; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponente"


    // $ANTLR start "ruleComponente"
    // InternalMyDsl.g:315:1: ruleComponente returns [EObject current=null] : ( () otherlv_1= 'Componente' ( (lv_Name_2_0= ruleEString ) )? ) ;
    public final EObject ruleComponente() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_Name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:321:2: ( ( () otherlv_1= 'Componente' ( (lv_Name_2_0= ruleEString ) )? ) )
            // InternalMyDsl.g:322:2: ( () otherlv_1= 'Componente' ( (lv_Name_2_0= ruleEString ) )? )
            {
            // InternalMyDsl.g:322:2: ( () otherlv_1= 'Componente' ( (lv_Name_2_0= ruleEString ) )? )
            // InternalMyDsl.g:323:3: () otherlv_1= 'Componente' ( (lv_Name_2_0= ruleEString ) )?
            {
            // InternalMyDsl.g:323:3: ()
            // InternalMyDsl.g:324:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponenteAccess().getComponenteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getComponenteAccess().getComponenteKeyword_1());
            		
            // InternalMyDsl.g:334:3: ( (lv_Name_2_0= ruleEString ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:335:4: (lv_Name_2_0= ruleEString )
                    {
                    // InternalMyDsl.g:335:4: (lv_Name_2_0= ruleEString )
                    // InternalMyDsl.g:336:5: lv_Name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getComponenteAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_Name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponenteRule());
                    					}
                    					set(
                    						current,
                    						"Name",
                    						lv_Name_2_0,
                    						"org.xtext.example.mydsl.MyDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponente"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:357:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:357:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:358:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:364:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:370:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:371:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:371:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:372:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:380:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000032L});

}