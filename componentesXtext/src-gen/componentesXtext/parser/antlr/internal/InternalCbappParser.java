package componentesXtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import componentesXtext.services.CbappGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCbappParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CBAPP'", "'{'", "'conectores'", "','", "'}'", "'componentes'", "'Conector'", "'nombre'", "'endA'", "'endB'", "'Componente'", "'Name'", "'provides'", "'requires'", "'ProvidedInterface'", "'RequiredInterface'"
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
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCbappParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCbappParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCbappParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCbapp.g"; }



     	private CbappGrammarAccess grammarAccess;

        public InternalCbappParser(TokenStream input, CbappGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CBAPP";
       	}

       	@Override
       	protected CbappGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCBAPP"
    // InternalCbapp.g:64:1: entryRuleCBAPP returns [EObject current=null] : iv_ruleCBAPP= ruleCBAPP EOF ;
    public final EObject entryRuleCBAPP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCBAPP = null;


        try {
            // InternalCbapp.g:64:46: (iv_ruleCBAPP= ruleCBAPP EOF )
            // InternalCbapp.g:65:2: iv_ruleCBAPP= ruleCBAPP EOF
            {
             newCompositeNode(grammarAccess.getCBAPPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCBAPP=ruleCBAPP();

            state._fsp--;

             current =iv_ruleCBAPP; 
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
    // $ANTLR end "entryRuleCBAPP"


    // $ANTLR start "ruleCBAPP"
    // InternalCbapp.g:71:1: ruleCBAPP returns [EObject current=null] : (otherlv_0= 'CBAPP' otherlv_1= '{' (otherlv_2= 'conectores' otherlv_3= '{' ( (lv_conectores_4_0= ruleConector ) ) (otherlv_5= ',' ( (lv_conectores_6_0= ruleConector ) ) )* otherlv_7= '}' )? otherlv_8= 'componentes' otherlv_9= '{' ( (lv_componentes_10_0= ruleComponente ) ) (otherlv_11= ',' ( (lv_componentes_12_0= ruleComponente ) ) )* otherlv_13= '}' otherlv_14= '}' ) ;
    public final EObject ruleCBAPP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_conectores_4_0 = null;

        EObject lv_conectores_6_0 = null;

        EObject lv_componentes_10_0 = null;

        EObject lv_componentes_12_0 = null;



        	enterRule();

        try {
            // InternalCbapp.g:77:2: ( (otherlv_0= 'CBAPP' otherlv_1= '{' (otherlv_2= 'conectores' otherlv_3= '{' ( (lv_conectores_4_0= ruleConector ) ) (otherlv_5= ',' ( (lv_conectores_6_0= ruleConector ) ) )* otherlv_7= '}' )? otherlv_8= 'componentes' otherlv_9= '{' ( (lv_componentes_10_0= ruleComponente ) ) (otherlv_11= ',' ( (lv_componentes_12_0= ruleComponente ) ) )* otherlv_13= '}' otherlv_14= '}' ) )
            // InternalCbapp.g:78:2: (otherlv_0= 'CBAPP' otherlv_1= '{' (otherlv_2= 'conectores' otherlv_3= '{' ( (lv_conectores_4_0= ruleConector ) ) (otherlv_5= ',' ( (lv_conectores_6_0= ruleConector ) ) )* otherlv_7= '}' )? otherlv_8= 'componentes' otherlv_9= '{' ( (lv_componentes_10_0= ruleComponente ) ) (otherlv_11= ',' ( (lv_componentes_12_0= ruleComponente ) ) )* otherlv_13= '}' otherlv_14= '}' )
            {
            // InternalCbapp.g:78:2: (otherlv_0= 'CBAPP' otherlv_1= '{' (otherlv_2= 'conectores' otherlv_3= '{' ( (lv_conectores_4_0= ruleConector ) ) (otherlv_5= ',' ( (lv_conectores_6_0= ruleConector ) ) )* otherlv_7= '}' )? otherlv_8= 'componentes' otherlv_9= '{' ( (lv_componentes_10_0= ruleComponente ) ) (otherlv_11= ',' ( (lv_componentes_12_0= ruleComponente ) ) )* otherlv_13= '}' otherlv_14= '}' )
            // InternalCbapp.g:79:3: otherlv_0= 'CBAPP' otherlv_1= '{' (otherlv_2= 'conectores' otherlv_3= '{' ( (lv_conectores_4_0= ruleConector ) ) (otherlv_5= ',' ( (lv_conectores_6_0= ruleConector ) ) )* otherlv_7= '}' )? otherlv_8= 'componentes' otherlv_9= '{' ( (lv_componentes_10_0= ruleComponente ) ) (otherlv_11= ',' ( (lv_componentes_12_0= ruleComponente ) ) )* otherlv_13= '}' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCBAPPAccess().getCBAPPKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCBAPPAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCbapp.g:87:3: (otherlv_2= 'conectores' otherlv_3= '{' ( (lv_conectores_4_0= ruleConector ) ) (otherlv_5= ',' ( (lv_conectores_6_0= ruleConector ) ) )* otherlv_7= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCbapp.g:88:4: otherlv_2= 'conectores' otherlv_3= '{' ( (lv_conectores_4_0= ruleConector ) ) (otherlv_5= ',' ( (lv_conectores_6_0= ruleConector ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getCBAPPAccess().getConectoresKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getCBAPPAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalCbapp.g:96:4: ( (lv_conectores_4_0= ruleConector ) )
                    // InternalCbapp.g:97:5: (lv_conectores_4_0= ruleConector )
                    {
                    // InternalCbapp.g:97:5: (lv_conectores_4_0= ruleConector )
                    // InternalCbapp.g:98:6: lv_conectores_4_0= ruleConector
                    {

                    						newCompositeNode(grammarAccess.getCBAPPAccess().getConectoresConectorParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_conectores_4_0=ruleConector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCBAPPRule());
                    						}
                    						add(
                    							current,
                    							"conectores",
                    							lv_conectores_4_0,
                    							"componentesXtext.Cbapp.Conector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbapp.g:115:4: (otherlv_5= ',' ( (lv_conectores_6_0= ruleConector ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalCbapp.g:116:5: otherlv_5= ',' ( (lv_conectores_6_0= ruleConector ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getCBAPPAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalCbapp.g:120:5: ( (lv_conectores_6_0= ruleConector ) )
                    	    // InternalCbapp.g:121:6: (lv_conectores_6_0= ruleConector )
                    	    {
                    	    // InternalCbapp.g:121:6: (lv_conectores_6_0= ruleConector )
                    	    // InternalCbapp.g:122:7: lv_conectores_6_0= ruleConector
                    	    {

                    	    							newCompositeNode(grammarAccess.getCBAPPAccess().getConectoresConectorParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_conectores_6_0=ruleConector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCBAPPRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"conectores",
                    	    								lv_conectores_6_0,
                    	    								"componentesXtext.Cbapp.Conector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getCBAPPAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getCBAPPAccess().getComponentesKeyword_3());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getCBAPPAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalCbapp.g:153:3: ( (lv_componentes_10_0= ruleComponente ) )
            // InternalCbapp.g:154:4: (lv_componentes_10_0= ruleComponente )
            {
            // InternalCbapp.g:154:4: (lv_componentes_10_0= ruleComponente )
            // InternalCbapp.g:155:5: lv_componentes_10_0= ruleComponente
            {

            					newCompositeNode(grammarAccess.getCBAPPAccess().getComponentesComponenteParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_componentes_10_0=ruleComponente();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCBAPPRule());
            					}
            					add(
            						current,
            						"componentes",
            						lv_componentes_10_0,
            						"componentesXtext.Cbapp.Componente");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCbapp.g:172:3: (otherlv_11= ',' ( (lv_componentes_12_0= ruleComponente ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCbapp.g:173:4: otherlv_11= ',' ( (lv_componentes_12_0= ruleComponente ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_11, grammarAccess.getCBAPPAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCbapp.g:177:4: ( (lv_componentes_12_0= ruleComponente ) )
            	    // InternalCbapp.g:178:5: (lv_componentes_12_0= ruleComponente )
            	    {
            	    // InternalCbapp.g:178:5: (lv_componentes_12_0= ruleComponente )
            	    // InternalCbapp.g:179:6: lv_componentes_12_0= ruleComponente
            	    {

            	    						newCompositeNode(grammarAccess.getCBAPPAccess().getComponentesComponenteParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_componentes_12_0=ruleComponente();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCBAPPRule());
            	    						}
            	    						add(
            	    							current,
            	    							"componentes",
            	    							lv_componentes_12_0,
            	    							"componentesXtext.Cbapp.Componente");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getCBAPPAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getCBAPPAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleCBAPP"


    // $ANTLR start "entryRuleConector"
    // InternalCbapp.g:209:1: entryRuleConector returns [EObject current=null] : iv_ruleConector= ruleConector EOF ;
    public final EObject entryRuleConector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConector = null;


        try {
            // InternalCbapp.g:209:49: (iv_ruleConector= ruleConector EOF )
            // InternalCbapp.g:210:2: iv_ruleConector= ruleConector EOF
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
    // InternalCbapp.g:216:1: ruleConector returns [EObject current=null] : (otherlv_0= 'Conector' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'endA' ( ( ruleEString ) ) otherlv_6= 'endB' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleConector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_nombre_3_0 = null;



        	enterRule();

        try {
            // InternalCbapp.g:222:2: ( (otherlv_0= 'Conector' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'endA' ( ( ruleEString ) ) otherlv_6= 'endB' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalCbapp.g:223:2: (otherlv_0= 'Conector' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'endA' ( ( ruleEString ) ) otherlv_6= 'endB' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalCbapp.g:223:2: (otherlv_0= 'Conector' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'endA' ( ( ruleEString ) ) otherlv_6= 'endB' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalCbapp.g:224:3: otherlv_0= 'Conector' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? otherlv_4= 'endA' ( ( ruleEString ) ) otherlv_6= 'endB' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConectorAccess().getConectorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getConectorAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCbapp.g:232:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCbapp.g:233:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getConectorAccess().getNombreKeyword_2_0());
                    			
                    // InternalCbapp.g:237:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalCbapp.g:238:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalCbapp.g:238:5: (lv_nombre_3_0= ruleEString )
                    // InternalCbapp.g:239:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConectorAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_nombre_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConectorRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_3_0,
                    							"componentesXtext.Cbapp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getConectorAccess().getEndAKeyword_3());
            		
            // InternalCbapp.g:261:3: ( ( ruleEString ) )
            // InternalCbapp.g:262:4: ( ruleEString )
            {
            // InternalCbapp.g:262:4: ( ruleEString )
            // InternalCbapp.g:263:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConectorAccess().getEndAProvidedInterfaceCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getConectorAccess().getEndBKeyword_5());
            		
            // InternalCbapp.g:281:3: ( ( ruleEString ) )
            // InternalCbapp.g:282:4: ( ruleEString )
            {
            // InternalCbapp.g:282:4: ( ruleEString )
            // InternalCbapp.g:283:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConectorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConectorAccess().getEndBRequiredInterfaceCrossReference_6_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConectorAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalCbapp.g:305:1: entryRuleComponente returns [EObject current=null] : iv_ruleComponente= ruleComponente EOF ;
    public final EObject entryRuleComponente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponente = null;


        try {
            // InternalCbapp.g:305:51: (iv_ruleComponente= ruleComponente EOF )
            // InternalCbapp.g:306:2: iv_ruleComponente= ruleComponente EOF
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
    // InternalCbapp.g:312:1: ruleComponente returns [EObject current=null] : ( () otherlv_1= 'Componente' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'provides' otherlv_6= '{' ( (lv_provides_7_0= ruleProvidedInterface ) ) (otherlv_8= ',' ( (lv_provides_9_0= ruleProvidedInterface ) ) )* otherlv_10= '}' )? (otherlv_11= 'requires' otherlv_12= '{' ( (lv_requires_13_0= ruleRequiredInterface ) ) (otherlv_14= ',' ( (lv_requires_15_0= ruleRequiredInterface ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleComponente() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_Name_4_0 = null;

        EObject lv_provides_7_0 = null;

        EObject lv_provides_9_0 = null;

        EObject lv_requires_13_0 = null;

        EObject lv_requires_15_0 = null;



        	enterRule();

        try {
            // InternalCbapp.g:318:2: ( ( () otherlv_1= 'Componente' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'provides' otherlv_6= '{' ( (lv_provides_7_0= ruleProvidedInterface ) ) (otherlv_8= ',' ( (lv_provides_9_0= ruleProvidedInterface ) ) )* otherlv_10= '}' )? (otherlv_11= 'requires' otherlv_12= '{' ( (lv_requires_13_0= ruleRequiredInterface ) ) (otherlv_14= ',' ( (lv_requires_15_0= ruleRequiredInterface ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalCbapp.g:319:2: ( () otherlv_1= 'Componente' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'provides' otherlv_6= '{' ( (lv_provides_7_0= ruleProvidedInterface ) ) (otherlv_8= ',' ( (lv_provides_9_0= ruleProvidedInterface ) ) )* otherlv_10= '}' )? (otherlv_11= 'requires' otherlv_12= '{' ( (lv_requires_13_0= ruleRequiredInterface ) ) (otherlv_14= ',' ( (lv_requires_15_0= ruleRequiredInterface ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalCbapp.g:319:2: ( () otherlv_1= 'Componente' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'provides' otherlv_6= '{' ( (lv_provides_7_0= ruleProvidedInterface ) ) (otherlv_8= ',' ( (lv_provides_9_0= ruleProvidedInterface ) ) )* otherlv_10= '}' )? (otherlv_11= 'requires' otherlv_12= '{' ( (lv_requires_13_0= ruleRequiredInterface ) ) (otherlv_14= ',' ( (lv_requires_15_0= ruleRequiredInterface ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalCbapp.g:320:3: () otherlv_1= 'Componente' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'provides' otherlv_6= '{' ( (lv_provides_7_0= ruleProvidedInterface ) ) (otherlv_8= ',' ( (lv_provides_9_0= ruleProvidedInterface ) ) )* otherlv_10= '}' )? (otherlv_11= 'requires' otherlv_12= '{' ( (lv_requires_13_0= ruleRequiredInterface ) ) (otherlv_14= ',' ( (lv_requires_15_0= ruleRequiredInterface ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // InternalCbapp.g:320:3: ()
            // InternalCbapp.g:321:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponenteAccess().getComponenteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComponenteAccess().getComponenteKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getComponenteAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCbapp.g:335:3: (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCbapp.g:336:4: otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponenteAccess().getNameKeyword_3_0());
                    			
                    // InternalCbapp.g:340:4: ( (lv_Name_4_0= ruleEString ) )
                    // InternalCbapp.g:341:5: (lv_Name_4_0= ruleEString )
                    {
                    // InternalCbapp.g:341:5: (lv_Name_4_0= ruleEString )
                    // InternalCbapp.g:342:6: lv_Name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getComponenteAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_Name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponenteRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_4_0,
                    							"componentesXtext.Cbapp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCbapp.g:360:3: (otherlv_5= 'provides' otherlv_6= '{' ( (lv_provides_7_0= ruleProvidedInterface ) ) (otherlv_8= ',' ( (lv_provides_9_0= ruleProvidedInterface ) ) )* otherlv_10= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCbapp.g:361:4: otherlv_5= 'provides' otherlv_6= '{' ( (lv_provides_7_0= ruleProvidedInterface ) ) (otherlv_8= ',' ( (lv_provides_9_0= ruleProvidedInterface ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getComponenteAccess().getProvidesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getComponenteAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalCbapp.g:369:4: ( (lv_provides_7_0= ruleProvidedInterface ) )
                    // InternalCbapp.g:370:5: (lv_provides_7_0= ruleProvidedInterface )
                    {
                    // InternalCbapp.g:370:5: (lv_provides_7_0= ruleProvidedInterface )
                    // InternalCbapp.g:371:6: lv_provides_7_0= ruleProvidedInterface
                    {

                    						newCompositeNode(grammarAccess.getComponenteAccess().getProvidesProvidedInterfaceParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_provides_7_0=ruleProvidedInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponenteRule());
                    						}
                    						add(
                    							current,
                    							"provides",
                    							lv_provides_7_0,
                    							"componentesXtext.Cbapp.ProvidedInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbapp.g:388:4: (otherlv_8= ',' ( (lv_provides_9_0= ruleProvidedInterface ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCbapp.g:389:5: otherlv_8= ',' ( (lv_provides_9_0= ruleProvidedInterface ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getComponenteAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCbapp.g:393:5: ( (lv_provides_9_0= ruleProvidedInterface ) )
                    	    // InternalCbapp.g:394:6: (lv_provides_9_0= ruleProvidedInterface )
                    	    {
                    	    // InternalCbapp.g:394:6: (lv_provides_9_0= ruleProvidedInterface )
                    	    // InternalCbapp.g:395:7: lv_provides_9_0= ruleProvidedInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponenteAccess().getProvidesProvidedInterfaceParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_provides_9_0=ruleProvidedInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponenteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"provides",
                    	    								lv_provides_9_0,
                    	    								"componentesXtext.Cbapp.ProvidedInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getComponenteAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalCbapp.g:418:3: (otherlv_11= 'requires' otherlv_12= '{' ( (lv_requires_13_0= ruleRequiredInterface ) ) (otherlv_14= ',' ( (lv_requires_15_0= ruleRequiredInterface ) ) )* otherlv_16= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCbapp.g:419:4: otherlv_11= 'requires' otherlv_12= '{' ( (lv_requires_13_0= ruleRequiredInterface ) ) (otherlv_14= ',' ( (lv_requires_15_0= ruleRequiredInterface ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponenteAccess().getRequiresKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_12, grammarAccess.getComponenteAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCbapp.g:427:4: ( (lv_requires_13_0= ruleRequiredInterface ) )
                    // InternalCbapp.g:428:5: (lv_requires_13_0= ruleRequiredInterface )
                    {
                    // InternalCbapp.g:428:5: (lv_requires_13_0= ruleRequiredInterface )
                    // InternalCbapp.g:429:6: lv_requires_13_0= ruleRequiredInterface
                    {

                    						newCompositeNode(grammarAccess.getComponenteAccess().getRequiresRequiredInterfaceParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_requires_13_0=ruleRequiredInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponenteRule());
                    						}
                    						add(
                    							current,
                    							"requires",
                    							lv_requires_13_0,
                    							"componentesXtext.Cbapp.RequiredInterface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCbapp.g:446:4: (otherlv_14= ',' ( (lv_requires_15_0= ruleRequiredInterface ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalCbapp.g:447:5: otherlv_14= ',' ( (lv_requires_15_0= ruleRequiredInterface ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getComponenteAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCbapp.g:451:5: ( (lv_requires_15_0= ruleRequiredInterface ) )
                    	    // InternalCbapp.g:452:6: (lv_requires_15_0= ruleRequiredInterface )
                    	    {
                    	    // InternalCbapp.g:452:6: (lv_requires_15_0= ruleRequiredInterface )
                    	    // InternalCbapp.g:453:7: lv_requires_15_0= ruleRequiredInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponenteAccess().getRequiresRequiredInterfaceParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_requires_15_0=ruleRequiredInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponenteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requires",
                    	    								lv_requires_15_0,
                    	    								"componentesXtext.Cbapp.RequiredInterface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getComponenteAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getComponenteAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalCbapp.g:484:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCbapp.g:484:47: (iv_ruleEString= ruleEString EOF )
            // InternalCbapp.g:485:2: iv_ruleEString= ruleEString EOF
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
    // InternalCbapp.g:491:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCbapp.g:497:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCbapp.g:498:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCbapp.g:498:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCbapp.g:499:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCbapp.g:507:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleProvidedInterface"
    // InternalCbapp.g:518:1: entryRuleProvidedInterface returns [EObject current=null] : iv_ruleProvidedInterface= ruleProvidedInterface EOF ;
    public final EObject entryRuleProvidedInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedInterface = null;


        try {
            // InternalCbapp.g:518:58: (iv_ruleProvidedInterface= ruleProvidedInterface EOF )
            // InternalCbapp.g:519:2: iv_ruleProvidedInterface= ruleProvidedInterface EOF
            {
             newCompositeNode(grammarAccess.getProvidedInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvidedInterface=ruleProvidedInterface();

            state._fsp--;

             current =iv_ruleProvidedInterface; 
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
    // $ANTLR end "entryRuleProvidedInterface"


    // $ANTLR start "ruleProvidedInterface"
    // InternalCbapp.g:525:1: ruleProvidedInterface returns [EObject current=null] : ( () otherlv_1= 'ProvidedInterface' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleProvidedInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_Name_4_0 = null;



        	enterRule();

        try {
            // InternalCbapp.g:531:2: ( ( () otherlv_1= 'ProvidedInterface' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalCbapp.g:532:2: ( () otherlv_1= 'ProvidedInterface' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalCbapp.g:532:2: ( () otherlv_1= 'ProvidedInterface' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalCbapp.g:533:3: () otherlv_1= 'ProvidedInterface' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalCbapp.g:533:3: ()
            // InternalCbapp.g:534:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProvidedInterfaceAccess().getProvidedInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProvidedInterfaceAccess().getProvidedInterfaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getProvidedInterfaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCbapp.g:548:3: (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCbapp.g:549:4: otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getProvidedInterfaceAccess().getNameKeyword_3_0());
                    			
                    // InternalCbapp.g:553:4: ( (lv_Name_4_0= ruleEString ) )
                    // InternalCbapp.g:554:5: (lv_Name_4_0= ruleEString )
                    {
                    // InternalCbapp.g:554:5: (lv_Name_4_0= ruleEString )
                    // InternalCbapp.g:555:6: lv_Name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProvidedInterfaceAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_Name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProvidedInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_4_0,
                    							"componentesXtext.Cbapp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProvidedInterfaceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProvidedInterface"


    // $ANTLR start "entryRuleRequiredInterface"
    // InternalCbapp.g:581:1: entryRuleRequiredInterface returns [EObject current=null] : iv_ruleRequiredInterface= ruleRequiredInterface EOF ;
    public final EObject entryRuleRequiredInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredInterface = null;


        try {
            // InternalCbapp.g:581:58: (iv_ruleRequiredInterface= ruleRequiredInterface EOF )
            // InternalCbapp.g:582:2: iv_ruleRequiredInterface= ruleRequiredInterface EOF
            {
             newCompositeNode(grammarAccess.getRequiredInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredInterface=ruleRequiredInterface();

            state._fsp--;

             current =iv_ruleRequiredInterface; 
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
    // $ANTLR end "entryRuleRequiredInterface"


    // $ANTLR start "ruleRequiredInterface"
    // InternalCbapp.g:588:1: ruleRequiredInterface returns [EObject current=null] : ( () otherlv_1= 'RequiredInterface' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleRequiredInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_Name_4_0 = null;



        	enterRule();

        try {
            // InternalCbapp.g:594:2: ( ( () otherlv_1= 'RequiredInterface' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalCbapp.g:595:2: ( () otherlv_1= 'RequiredInterface' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalCbapp.g:595:2: ( () otherlv_1= 'RequiredInterface' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalCbapp.g:596:3: () otherlv_1= 'RequiredInterface' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalCbapp.g:596:3: ()
            // InternalCbapp.g:597:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequiredInterfaceAccess().getRequiredInterfaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequiredInterfaceAccess().getRequiredInterfaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getRequiredInterfaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCbapp.g:611:3: (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCbapp.g:612:4: otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getRequiredInterfaceAccess().getNameKeyword_3_0());
                    			
                    // InternalCbapp.g:616:4: ( (lv_Name_4_0= ruleEString ) )
                    // InternalCbapp.g:617:5: (lv_Name_4_0= ruleEString )
                    {
                    // InternalCbapp.g:617:5: (lv_Name_4_0= ruleEString )
                    // InternalCbapp.g:618:6: lv_Name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequiredInterfaceAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_Name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequiredInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"Name",
                    							lv_Name_4_0,
                    							"componentesXtext.Cbapp.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRequiredInterfaceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRequiredInterface"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001C08000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000408000L});

}