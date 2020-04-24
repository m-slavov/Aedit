package org.aedit.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.aedit.services.AeditGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAeditParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'feature'", "':'", "'{'", "'}'", "'use'", "';'", "'ruleset'", "'rule'", "'change'", "'record'", "'error'", "'enum'", "'add.at'", "'('", "')'", "'.'", "'remove'", "'rename'", "'=>'", "'set_val'", "'set_type'", "'='", "'-'", "'void'", "'int'", "'double'", "'string'", "'long'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAeditParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAeditParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAeditParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAedit.g"; }



     	private AeditGrammarAccess grammarAccess;

        public InternalAeditParser(TokenStream input, AeditGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected AeditGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalAedit.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAedit.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalAedit.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAedit.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_ruleDeclarations_0_0= ruleRuleDeclaration ) )* ( (lv_ruleMaps_1_0= ruleRuleMap ) )* ( (lv_features_2_0= ruleFeature ) )* ( (lv_featureMaps_3_0= ruleFeatureMap ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_ruleDeclarations_0_0 = null;

        EObject lv_ruleMaps_1_0 = null;

        EObject lv_features_2_0 = null;

        EObject lv_featureMaps_3_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:77:2: ( ( ( (lv_ruleDeclarations_0_0= ruleRuleDeclaration ) )* ( (lv_ruleMaps_1_0= ruleRuleMap ) )* ( (lv_features_2_0= ruleFeature ) )* ( (lv_featureMaps_3_0= ruleFeatureMap ) )* ) )
            // InternalAedit.g:78:2: ( ( (lv_ruleDeclarations_0_0= ruleRuleDeclaration ) )* ( (lv_ruleMaps_1_0= ruleRuleMap ) )* ( (lv_features_2_0= ruleFeature ) )* ( (lv_featureMaps_3_0= ruleFeatureMap ) )* )
            {
            // InternalAedit.g:78:2: ( ( (lv_ruleDeclarations_0_0= ruleRuleDeclaration ) )* ( (lv_ruleMaps_1_0= ruleRuleMap ) )* ( (lv_features_2_0= ruleFeature ) )* ( (lv_featureMaps_3_0= ruleFeatureMap ) )* )
            // InternalAedit.g:79:3: ( (lv_ruleDeclarations_0_0= ruleRuleDeclaration ) )* ( (lv_ruleMaps_1_0= ruleRuleMap ) )* ( (lv_features_2_0= ruleFeature ) )* ( (lv_featureMaps_3_0= ruleFeatureMap ) )*
            {
            // InternalAedit.g:79:3: ( (lv_ruleDeclarations_0_0= ruleRuleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAedit.g:80:4: (lv_ruleDeclarations_0_0= ruleRuleDeclaration )
            	    {
            	    // InternalAedit.g:80:4: (lv_ruleDeclarations_0_0= ruleRuleDeclaration )
            	    // InternalAedit.g:81:5: lv_ruleDeclarations_0_0= ruleRuleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getRuleDeclarationsRuleDeclarationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_ruleDeclarations_0_0=ruleRuleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ruleDeclarations",
            	    						lv_ruleDeclarations_0_0,
            	    						"org.aedit.Aedit.RuleDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalAedit.g:98:3: ( (lv_ruleMaps_1_0= ruleRuleMap ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAedit.g:99:4: (lv_ruleMaps_1_0= ruleRuleMap )
            	    {
            	    // InternalAedit.g:99:4: (lv_ruleMaps_1_0= ruleRuleMap )
            	    // InternalAedit.g:100:5: lv_ruleMaps_1_0= ruleRuleMap
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getRuleMapsRuleMapParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_ruleMaps_1_0=ruleRuleMap();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ruleMaps",
            	    						lv_ruleMaps_1_0,
            	    						"org.aedit.Aedit.RuleMap");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalAedit.g:117:3: ( (lv_features_2_0= ruleFeature ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAedit.g:118:4: (lv_features_2_0= ruleFeature )
            	    {
            	    // InternalAedit.g:118:4: (lv_features_2_0= ruleFeature )
            	    // InternalAedit.g:119:5: lv_features_2_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFeaturesFeatureParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_features_2_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_2_0,
            	    						"org.aedit.Aedit.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalAedit.g:136:3: ( (lv_featureMaps_3_0= ruleFeatureMap ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAedit.g:137:4: (lv_featureMaps_3_0= ruleFeatureMap )
            	    {
            	    // InternalAedit.g:137:4: (lv_featureMaps_3_0= ruleFeatureMap )
            	    // InternalAedit.g:138:5: lv_featureMaps_3_0= ruleFeatureMap
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFeatureMapsFeatureMapParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_featureMaps_3_0=ruleFeatureMap();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"featureMaps",
            	    						lv_featureMaps_3_0,
            	    						"org.aedit.Aedit.FeatureMap");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFeature"
    // InternalAedit.g:159:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalAedit.g:159:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalAedit.g:160:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalAedit.g:166:1: ruleFeature returns [EObject current=null] : (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalAedit.g:172:2: ( (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' ) )
            // InternalAedit.g:173:2: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )
            {
            // InternalAedit.g:173:2: (otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )
            // InternalAedit.g:174:3: otherlv_0= 'feature' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getFeatureKeyword_0());
            		
            // InternalAedit.g:178:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAedit.g:179:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAedit.g:179:4: (lv_name_1_0= RULE_ID )
            // InternalAedit.g:180:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAedit.g:196:3: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAedit.g:197:4: otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2_0());
                    			
                    // InternalAedit.g:201:4: ( (otherlv_3= RULE_ID ) )
                    // InternalAedit.g:202:5: (otherlv_3= RULE_ID )
                    {
                    // InternalAedit.g:202:5: (otherlv_3= RULE_ID )
                    // InternalAedit.g:203:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getExtendFeatureCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAedit.g:219:3: ( (otherlv_5= RULE_ID ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAedit.g:220:4: (otherlv_5= RULE_ID )
            	    {
            	    // InternalAedit.g:220:4: (otherlv_5= RULE_ID )
            	    // InternalAedit.g:221:5: otherlv_5= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getFeatureRule());
            	    					}
            	    				
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_5, grammarAccess.getFeatureAccess().getRuleMapsRuleMapCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleFeatureMap"
    // InternalAedit.g:240:1: entryRuleFeatureMap returns [EObject current=null] : iv_ruleFeatureMap= ruleFeatureMap EOF ;
    public final EObject entryRuleFeatureMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureMap = null;


        try {
            // InternalAedit.g:240:51: (iv_ruleFeatureMap= ruleFeatureMap EOF )
            // InternalAedit.g:241:2: iv_ruleFeatureMap= ruleFeatureMap EOF
            {
             newCompositeNode(grammarAccess.getFeatureMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureMap=ruleFeatureMap();

            state._fsp--;

             current =iv_ruleFeatureMap; 
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
    // $ANTLR end "entryRuleFeatureMap"


    // $ANTLR start "ruleFeatureMap"
    // InternalAedit.g:247:1: ruleFeatureMap returns [EObject current=null] : (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleFeatureMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalAedit.g:253:2: ( (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalAedit.g:254:2: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalAedit.g:254:2: (otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // InternalAedit.g:255:3: otherlv_0= 'use' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureMapAccess().getUseKeyword_0());
            		
            // InternalAedit.g:259:3: ( (otherlv_1= RULE_ID ) )
            // InternalAedit.g:260:4: (otherlv_1= RULE_ID )
            {
            // InternalAedit.g:260:4: (otherlv_1= RULE_ID )
            // InternalAedit.g:261:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureMapRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_1, grammarAccess.getFeatureMapAccess().getNameFeatureCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFeatureMapAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleFeatureMap"


    // $ANTLR start "entryRuleRuleMap"
    // InternalAedit.g:280:1: entryRuleRuleMap returns [EObject current=null] : iv_ruleRuleMap= ruleRuleMap EOF ;
    public final EObject entryRuleRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleMap = null;


        try {
            // InternalAedit.g:280:48: (iv_ruleRuleMap= ruleRuleMap EOF )
            // InternalAedit.g:281:2: iv_ruleRuleMap= ruleRuleMap EOF
            {
             newCompositeNode(grammarAccess.getRuleMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleMap=ruleRuleMap();

            state._fsp--;

             current =iv_ruleRuleMap; 
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
    // $ANTLR end "entryRuleRuleMap"


    // $ANTLR start "ruleRuleMap"
    // InternalAedit.g:287:1: ruleRuleMap returns [EObject current=null] : (otherlv_0= 'ruleset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) ;
    public final EObject ruleRuleMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAedit.g:293:2: ( (otherlv_0= 'ruleset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) )
            // InternalAedit.g:294:2: (otherlv_0= 'ruleset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            {
            // InternalAedit.g:294:2: (otherlv_0= 'ruleset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            // InternalAedit.g:295:3: otherlv_0= 'ruleset' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleMapAccess().getRulesetKeyword_0());
            		
            // InternalAedit.g:299:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAedit.g:300:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAedit.g:300:4: (lv_name_1_0= RULE_ID )
            // InternalAedit.g:301:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleMapAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleMapRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleMapAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAedit.g:321:3: ( (otherlv_3= RULE_ID ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAedit.g:322:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAedit.g:322:4: (otherlv_3= RULE_ID )
            	    // InternalAedit.g:323:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getRuleMapRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_3, grammarAccess.getRuleMapAccess().getRulesRuleDeclarationCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleMapAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRuleMap"


    // $ANTLR start "entryRuleRuleDeclaration"
    // InternalAedit.g:342:1: entryRuleRuleDeclaration returns [EObject current=null] : iv_ruleRuleDeclaration= ruleRuleDeclaration EOF ;
    public final EObject entryRuleRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDeclaration = null;


        try {
            // InternalAedit.g:342:56: (iv_ruleRuleDeclaration= ruleRuleDeclaration EOF )
            // InternalAedit.g:343:2: iv_ruleRuleDeclaration= ruleRuleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getRuleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleDeclaration=ruleRuleDeclaration();

            state._fsp--;

             current =iv_ruleRuleDeclaration; 
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
    // $ANTLR end "entryRuleRuleDeclaration"


    // $ANTLR start "ruleRuleDeclaration"
    // InternalAedit.g:349:1: ruleRuleDeclaration returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleGenericRule ) )* otherlv_4= '}' ) ;
    public final EObject ruleRuleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:355:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleGenericRule ) )* otherlv_4= '}' ) )
            // InternalAedit.g:356:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleGenericRule ) )* otherlv_4= '}' )
            {
            // InternalAedit.g:356:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleGenericRule ) )* otherlv_4= '}' )
            // InternalAedit.g:357:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= ruleGenericRule ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleDeclarationAccess().getRuleKeyword_0());
            		
            // InternalAedit.g:361:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAedit.g:362:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAedit.g:362:4: (lv_name_1_0= RULE_ID )
            // InternalAedit.g:363:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAedit.g:383:3: ( (lv_rules_3_0= ruleGenericRule ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19||LA8_0==23||(LA8_0>=27 && LA8_0<=28)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAedit.g:384:4: (lv_rules_3_0= ruleGenericRule )
            	    {
            	    // InternalAedit.g:384:4: (lv_rules_3_0= ruleGenericRule )
            	    // InternalAedit.g:385:5: lv_rules_3_0= ruleGenericRule
            	    {

            	    					newCompositeNode(grammarAccess.getRuleDeclarationAccess().getRulesGenericRuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_rules_3_0=ruleGenericRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_3_0,
            	    						"org.aedit.Aedit.GenericRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleDeclarationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRuleDeclaration"


    // $ANTLR start "entryRuleGenericRule"
    // InternalAedit.g:410:1: entryRuleGenericRule returns [EObject current=null] : iv_ruleGenericRule= ruleGenericRule EOF ;
    public final EObject entryRuleGenericRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericRule = null;


        try {
            // InternalAedit.g:410:52: (iv_ruleGenericRule= ruleGenericRule EOF )
            // InternalAedit.g:411:2: iv_ruleGenericRule= ruleGenericRule EOF
            {
             newCompositeNode(grammarAccess.getGenericRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenericRule=ruleGenericRule();

            state._fsp--;

             current =iv_ruleGenericRule; 
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
    // $ANTLR end "entryRuleGenericRule"


    // $ANTLR start "ruleGenericRule"
    // InternalAedit.g:417:1: ruleGenericRule returns [EObject current=null] : (this_RenameSchema_0= ruleRenameSchema | this_RemoveSchema_1= ruleRemoveSchema | this_Add_2= ruleAdd | this_ChangeSchema_3= ruleChangeSchema | this_ChangeEnum_4= ruleChangeEnum ) ;
    public final EObject ruleGenericRule() throws RecognitionException {
        EObject current = null;

        EObject this_RenameSchema_0 = null;

        EObject this_RemoveSchema_1 = null;

        EObject this_Add_2 = null;

        EObject this_ChangeSchema_3 = null;

        EObject this_ChangeEnum_4 = null;



        	enterRule();

        try {
            // InternalAedit.g:423:2: ( (this_RenameSchema_0= ruleRenameSchema | this_RemoveSchema_1= ruleRemoveSchema | this_Add_2= ruleAdd | this_ChangeSchema_3= ruleChangeSchema | this_ChangeEnum_4= ruleChangeEnum ) )
            // InternalAedit.g:424:2: (this_RenameSchema_0= ruleRenameSchema | this_RemoveSchema_1= ruleRemoveSchema | this_Add_2= ruleAdd | this_ChangeSchema_3= ruleChangeSchema | this_ChangeEnum_4= ruleChangeEnum )
            {
            // InternalAedit.g:424:2: (this_RenameSchema_0= ruleRenameSchema | this_RemoveSchema_1= ruleRemoveSchema | this_Add_2= ruleAdd | this_ChangeSchema_3= ruleChangeSchema | this_ChangeEnum_4= ruleChangeEnum )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            case 19:
                {
                int LA9_4 = input.LA(2);

                if ( ((LA9_4>=20 && LA9_4<=21)) ) {
                    alt9=4;
                }
                else if ( (LA9_4==22) ) {
                    alt9=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAedit.g:425:3: this_RenameSchema_0= ruleRenameSchema
                    {

                    			newCompositeNode(grammarAccess.getGenericRuleAccess().getRenameSchemaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameSchema_0=ruleRenameSchema();

                    state._fsp--;


                    			current = this_RenameSchema_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAedit.g:434:3: this_RemoveSchema_1= ruleRemoveSchema
                    {

                    			newCompositeNode(grammarAccess.getGenericRuleAccess().getRemoveSchemaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveSchema_1=ruleRemoveSchema();

                    state._fsp--;


                    			current = this_RemoveSchema_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAedit.g:443:3: this_Add_2= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getGenericRuleAccess().getAddParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_2=ruleAdd();

                    state._fsp--;


                    			current = this_Add_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAedit.g:452:3: this_ChangeSchema_3= ruleChangeSchema
                    {

                    			newCompositeNode(grammarAccess.getGenericRuleAccess().getChangeSchemaParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeSchema_3=ruleChangeSchema();

                    state._fsp--;


                    			current = this_ChangeSchema_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAedit.g:461:3: this_ChangeEnum_4= ruleChangeEnum
                    {

                    			newCompositeNode(grammarAccess.getGenericRuleAccess().getChangeEnumParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeEnum_4=ruleChangeEnum();

                    state._fsp--;


                    			current = this_ChangeEnum_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleGenericRule"


    // $ANTLR start "entryRuleSchemaRule"
    // InternalAedit.g:473:1: entryRuleSchemaRule returns [EObject current=null] : iv_ruleSchemaRule= ruleSchemaRule EOF ;
    public final EObject entryRuleSchemaRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaRule = null;


        try {
            // InternalAedit.g:473:51: (iv_ruleSchemaRule= ruleSchemaRule EOF )
            // InternalAedit.g:474:2: iv_ruleSchemaRule= ruleSchemaRule EOF
            {
             newCompositeNode(grammarAccess.getSchemaRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchemaRule=ruleSchemaRule();

            state._fsp--;

             current =iv_ruleSchemaRule; 
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
    // $ANTLR end "entryRuleSchemaRule"


    // $ANTLR start "ruleSchemaRule"
    // InternalAedit.g:480:1: ruleSchemaRule returns [EObject current=null] : (this_RemoveVariable_0= ruleRemoveVariable | this_RenameVariable_1= ruleRenameVariable | this_AddVariable_2= ruleAddVariable | this_ChangeDefValue_3= ruleChangeDefValue | this_ChangeType_4= ruleChangeType ) ;
    public final EObject ruleSchemaRule() throws RecognitionException {
        EObject current = null;

        EObject this_RemoveVariable_0 = null;

        EObject this_RenameVariable_1 = null;

        EObject this_AddVariable_2 = null;

        EObject this_ChangeDefValue_3 = null;

        EObject this_ChangeType_4 = null;



        	enterRule();

        try {
            // InternalAedit.g:486:2: ( (this_RemoveVariable_0= ruleRemoveVariable | this_RenameVariable_1= ruleRenameVariable | this_AddVariable_2= ruleAddVariable | this_ChangeDefValue_3= ruleChangeDefValue | this_ChangeType_4= ruleChangeType ) )
            // InternalAedit.g:487:2: (this_RemoveVariable_0= ruleRemoveVariable | this_RenameVariable_1= ruleRenameVariable | this_AddVariable_2= ruleAddVariable | this_ChangeDefValue_3= ruleChangeDefValue | this_ChangeType_4= ruleChangeType )
            {
            // InternalAedit.g:487:2: (this_RemoveVariable_0= ruleRemoveVariable | this_RenameVariable_1= ruleRenameVariable | this_AddVariable_2= ruleAddVariable | this_ChangeDefValue_3= ruleChangeDefValue | this_ChangeType_4= ruleChangeType )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt10=1;
                }
                break;
            case 28:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            case 30:
                {
                alt10=4;
                }
                break;
            case 31:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalAedit.g:488:3: this_RemoveVariable_0= ruleRemoveVariable
                    {

                    			newCompositeNode(grammarAccess.getSchemaRuleAccess().getRemoveVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveVariable_0=ruleRemoveVariable();

                    state._fsp--;


                    			current = this_RemoveVariable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAedit.g:497:3: this_RenameVariable_1= ruleRenameVariable
                    {

                    			newCompositeNode(grammarAccess.getSchemaRuleAccess().getRenameVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameVariable_1=ruleRenameVariable();

                    state._fsp--;


                    			current = this_RenameVariable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAedit.g:506:3: this_AddVariable_2= ruleAddVariable
                    {

                    			newCompositeNode(grammarAccess.getSchemaRuleAccess().getAddVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddVariable_2=ruleAddVariable();

                    state._fsp--;


                    			current = this_AddVariable_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAedit.g:515:3: this_ChangeDefValue_3= ruleChangeDefValue
                    {

                    			newCompositeNode(grammarAccess.getSchemaRuleAccess().getChangeDefValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeDefValue_3=ruleChangeDefValue();

                    state._fsp--;


                    			current = this_ChangeDefValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAedit.g:524:3: this_ChangeType_4= ruleChangeType
                    {

                    			newCompositeNode(grammarAccess.getSchemaRuleAccess().getChangeTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeType_4=ruleChangeType();

                    state._fsp--;


                    			current = this_ChangeType_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleSchemaRule"


    // $ANTLR start "entryRuleEnumRule"
    // InternalAedit.g:536:1: entryRuleEnumRule returns [EObject current=null] : iv_ruleEnumRule= ruleEnumRule EOF ;
    public final EObject entryRuleEnumRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumRule = null;


        try {
            // InternalAedit.g:536:49: (iv_ruleEnumRule= ruleEnumRule EOF )
            // InternalAedit.g:537:2: iv_ruleEnumRule= ruleEnumRule EOF
            {
             newCompositeNode(grammarAccess.getEnumRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumRule=ruleEnumRule();

            state._fsp--;

             current =iv_ruleEnumRule; 
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
    // $ANTLR end "entryRuleEnumRule"


    // $ANTLR start "ruleEnumRule"
    // InternalAedit.g:543:1: ruleEnumRule returns [EObject current=null] : (this_RemoveEnum_0= ruleRemoveEnum | this_RenameEnum_1= ruleRenameEnum | this_AddEnum_2= ruleAddEnum ) ;
    public final EObject ruleEnumRule() throws RecognitionException {
        EObject current = null;

        EObject this_RemoveEnum_0 = null;

        EObject this_RenameEnum_1 = null;

        EObject this_AddEnum_2 = null;



        	enterRule();

        try {
            // InternalAedit.g:549:2: ( (this_RemoveEnum_0= ruleRemoveEnum | this_RenameEnum_1= ruleRenameEnum | this_AddEnum_2= ruleAddEnum ) )
            // InternalAedit.g:550:2: (this_RemoveEnum_0= ruleRemoveEnum | this_RenameEnum_1= ruleRenameEnum | this_AddEnum_2= ruleAddEnum )
            {
            // InternalAedit.g:550:2: (this_RemoveEnum_0= ruleRemoveEnum | this_RenameEnum_1= ruleRenameEnum | this_AddEnum_2= ruleAddEnum )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                alt11=2;
                }
                break;
            case 23:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAedit.g:551:3: this_RemoveEnum_0= ruleRemoveEnum
                    {

                    			newCompositeNode(grammarAccess.getEnumRuleAccess().getRemoveEnumParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveEnum_0=ruleRemoveEnum();

                    state._fsp--;


                    			current = this_RemoveEnum_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAedit.g:560:3: this_RenameEnum_1= ruleRenameEnum
                    {

                    			newCompositeNode(grammarAccess.getEnumRuleAccess().getRenameEnumParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RenameEnum_1=ruleRenameEnum();

                    state._fsp--;


                    			current = this_RenameEnum_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAedit.g:569:3: this_AddEnum_2= ruleAddEnum
                    {

                    			newCompositeNode(grammarAccess.getEnumRuleAccess().getAddEnumParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddEnum_2=ruleAddEnum();

                    state._fsp--;


                    			current = this_AddEnum_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleEnumRule"


    // $ANTLR start "entryRuleChangeSchema"
    // InternalAedit.g:581:1: entryRuleChangeSchema returns [EObject current=null] : iv_ruleChangeSchema= ruleChangeSchema EOF ;
    public final EObject entryRuleChangeSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeSchema = null;


        try {
            // InternalAedit.g:581:53: (iv_ruleChangeSchema= ruleChangeSchema EOF )
            // InternalAedit.g:582:2: iv_ruleChangeSchema= ruleChangeSchema EOF
            {
             newCompositeNode(grammarAccess.getChangeSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeSchema=ruleChangeSchema();

            state._fsp--;

             current =iv_ruleChangeSchema; 
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
    // $ANTLR end "entryRuleChangeSchema"


    // $ANTLR start "ruleChangeSchema"
    // InternalAedit.g:588:1: ruleChangeSchema returns [EObject current=null] : (otherlv_0= 'change' (otherlv_1= 'record' | otherlv_2= 'error' ) ( ( ruleQN ) ) otherlv_4= '{' ( (lv_rules_5_0= ruleSchemaRule ) )* otherlv_6= '}' ) ;
    public final EObject ruleChangeSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rules_5_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:594:2: ( (otherlv_0= 'change' (otherlv_1= 'record' | otherlv_2= 'error' ) ( ( ruleQN ) ) otherlv_4= '{' ( (lv_rules_5_0= ruleSchemaRule ) )* otherlv_6= '}' ) )
            // InternalAedit.g:595:2: (otherlv_0= 'change' (otherlv_1= 'record' | otherlv_2= 'error' ) ( ( ruleQN ) ) otherlv_4= '{' ( (lv_rules_5_0= ruleSchemaRule ) )* otherlv_6= '}' )
            {
            // InternalAedit.g:595:2: (otherlv_0= 'change' (otherlv_1= 'record' | otherlv_2= 'error' ) ( ( ruleQN ) ) otherlv_4= '{' ( (lv_rules_5_0= ruleSchemaRule ) )* otherlv_6= '}' )
            // InternalAedit.g:596:3: otherlv_0= 'change' (otherlv_1= 'record' | otherlv_2= 'error' ) ( ( ruleQN ) ) otherlv_4= '{' ( (lv_rules_5_0= ruleSchemaRule ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeSchemaAccess().getChangeKeyword_0());
            		
            // InternalAedit.g:600:3: (otherlv_1= 'record' | otherlv_2= 'error' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            else if ( (LA12_0==21) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalAedit.g:601:4: otherlv_1= 'record'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getChangeSchemaAccess().getRecordKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalAedit.g:606:4: otherlv_2= 'error'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getChangeSchemaAccess().getErrorKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalAedit.g:611:3: ( ( ruleQN ) )
            // InternalAedit.g:612:4: ( ruleQN )
            {
            // InternalAedit.g:612:4: ( ruleQN )
            // InternalAedit.g:613:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeSchemaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChangeSchemaAccess().getSchemaTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getChangeSchemaAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAedit.g:631:3: ( (lv_rules_5_0= ruleSchemaRule ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23||(LA13_0>=27 && LA13_0<=28)||(LA13_0>=30 && LA13_0<=31)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAedit.g:632:4: (lv_rules_5_0= ruleSchemaRule )
            	    {
            	    // InternalAedit.g:632:4: (lv_rules_5_0= ruleSchemaRule )
            	    // InternalAedit.g:633:5: lv_rules_5_0= ruleSchemaRule
            	    {

            	    					newCompositeNode(grammarAccess.getChangeSchemaAccess().getRulesSchemaRuleParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_rules_5_0=ruleSchemaRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChangeSchemaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_5_0,
            	    						"org.aedit.Aedit.SchemaRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChangeSchemaAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleChangeSchema"


    // $ANTLR start "entryRuleChangeEnum"
    // InternalAedit.g:658:1: entryRuleChangeEnum returns [EObject current=null] : iv_ruleChangeEnum= ruleChangeEnum EOF ;
    public final EObject entryRuleChangeEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeEnum = null;


        try {
            // InternalAedit.g:658:51: (iv_ruleChangeEnum= ruleChangeEnum EOF )
            // InternalAedit.g:659:2: iv_ruleChangeEnum= ruleChangeEnum EOF
            {
             newCompositeNode(grammarAccess.getChangeEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeEnum=ruleChangeEnum();

            state._fsp--;

             current =iv_ruleChangeEnum; 
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
    // $ANTLR end "entryRuleChangeEnum"


    // $ANTLR start "ruleChangeEnum"
    // InternalAedit.g:665:1: ruleChangeEnum returns [EObject current=null] : (otherlv_0= 'change' otherlv_1= 'enum' ( ( ruleQN ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleEnumRule ) )* otherlv_5= '}' ) ;
    public final EObject ruleChangeEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_rules_4_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:671:2: ( (otherlv_0= 'change' otherlv_1= 'enum' ( ( ruleQN ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleEnumRule ) )* otherlv_5= '}' ) )
            // InternalAedit.g:672:2: (otherlv_0= 'change' otherlv_1= 'enum' ( ( ruleQN ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleEnumRule ) )* otherlv_5= '}' )
            {
            // InternalAedit.g:672:2: (otherlv_0= 'change' otherlv_1= 'enum' ( ( ruleQN ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleEnumRule ) )* otherlv_5= '}' )
            // InternalAedit.g:673:3: otherlv_0= 'change' otherlv_1= 'enum' ( ( ruleQN ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleEnumRule ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeEnumAccess().getChangeKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeEnumAccess().getEnumKeyword_1());
            		
            // InternalAedit.g:681:3: ( ( ruleQN ) )
            // InternalAedit.g:682:4: ( ruleQN )
            {
            // InternalAedit.g:682:4: ( ruleQN )
            // InternalAedit.g:683:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeEnumRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChangeEnumAccess().getSchemaEnumTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeEnumAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAedit.g:701:3: ( (lv_rules_4_0= ruleEnumRule ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23||(LA14_0>=27 && LA14_0<=28)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAedit.g:702:4: (lv_rules_4_0= ruleEnumRule )
            	    {
            	    // InternalAedit.g:702:4: (lv_rules_4_0= ruleEnumRule )
            	    // InternalAedit.g:703:5: lv_rules_4_0= ruleEnumRule
            	    {

            	    					newCompositeNode(grammarAccess.getChangeEnumAccess().getRulesEnumRuleParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_rules_4_0=ruleEnumRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChangeEnumRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_4_0,
            	    						"org.aedit.Aedit.EnumRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getChangeEnumAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleChangeEnum"


    // $ANTLR start "entryRuleAdd"
    // InternalAedit.g:728:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalAedit.g:728:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalAedit.g:729:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalAedit.g:735:1: ruleAdd returns [EObject current=null] : (this_AddRecord_0= ruleAddRecord | this_AddEnumeration_1= ruleAddEnumeration ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        EObject this_AddRecord_0 = null;

        EObject this_AddEnumeration_1 = null;



        	enterRule();

        try {
            // InternalAedit.g:741:2: ( (this_AddRecord_0= ruleAddRecord | this_AddEnumeration_1= ruleAddEnumeration ) )
            // InternalAedit.g:742:2: (this_AddRecord_0= ruleAddRecord | this_AddEnumeration_1= ruleAddEnumeration )
            {
            // InternalAedit.g:742:2: (this_AddRecord_0= ruleAddRecord | this_AddEnumeration_1= ruleAddEnumeration )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==24) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==RULE_INT) ) {
                        int LA15_3 = input.LA(4);

                        if ( (LA15_3==25) ) {
                            int LA15_4 = input.LA(5);

                            if ( (LA15_4==20) ) {
                                alt15=1;
                            }
                            else if ( (LA15_4==22) ) {
                                alt15=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAedit.g:743:3: this_AddRecord_0= ruleAddRecord
                    {

                    			newCompositeNode(grammarAccess.getAddAccess().getAddRecordParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddRecord_0=ruleAddRecord();

                    state._fsp--;


                    			current = this_AddRecord_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAedit.g:752:3: this_AddEnumeration_1= ruleAddEnumeration
                    {

                    			newCompositeNode(grammarAccess.getAddAccess().getAddEnumerationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddEnumeration_1=ruleAddEnumeration();

                    state._fsp--;


                    			current = this_AddEnumeration_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleAddRecord"
    // InternalAedit.g:764:1: entryRuleAddRecord returns [EObject current=null] : iv_ruleAddRecord= ruleAddRecord EOF ;
    public final EObject entryRuleAddRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddRecord = null;


        try {
            // InternalAedit.g:764:50: (iv_ruleAddRecord= ruleAddRecord EOF )
            // InternalAedit.g:765:2: iv_ruleAddRecord= ruleAddRecord EOF
            {
             newCompositeNode(grammarAccess.getAddRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddRecord=ruleAddRecord();

            state._fsp--;

             current =iv_ruleAddRecord; 
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
    // $ANTLR end "entryRuleAddRecord"


    // $ANTLR start "ruleAddRecord"
    // InternalAedit.g:771:1: ruleAddRecord returns [EObject current=null] : (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'record' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_recordName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}' ) ;
    public final EObject ruleAddRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_recordName_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_fields_9_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:777:2: ( (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'record' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_recordName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}' ) )
            // InternalAedit.g:778:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'record' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_recordName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}' )
            {
            // InternalAedit.g:778:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'record' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_recordName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}' )
            // InternalAedit.g:779:3: otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'record' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_recordName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAddRecordAccess().getAddAtKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAddRecordAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAedit.g:787:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalAedit.g:788:4: (lv_index_2_0= RULE_INT )
            {
            // InternalAedit.g:788:4: (lv_index_2_0= RULE_INT )
            // InternalAedit.g:789:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_index_2_0, grammarAccess.getAddRecordAccess().getIndexINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRecordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"index",
            						lv_index_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getAddRecordAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getAddRecordAccess().getRecordKeyword_4());
            		
            // InternalAedit.g:813:3: ( (otherlv_5= RULE_ID ) )
            // InternalAedit.g:814:4: (otherlv_5= RULE_ID )
            {
            // InternalAedit.g:814:4: (otherlv_5= RULE_ID )
            // InternalAedit.g:815:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRecordRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_5, grammarAccess.getAddRecordAccess().getNamespaceAvroIDLFileCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getAddRecordAccess().getFullStopKeyword_6());
            		
            // InternalAedit.g:830:3: ( (lv_recordName_7_0= RULE_ID ) )
            // InternalAedit.g:831:4: (lv_recordName_7_0= RULE_ID )
            {
            // InternalAedit.g:831:4: (lv_recordName_7_0= RULE_ID )
            // InternalAedit.g:832:5: lv_recordName_7_0= RULE_ID
            {
            lv_recordName_7_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_recordName_7_0, grammarAccess.getAddRecordAccess().getRecordNameIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRecordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"recordName",
            						lv_recordName_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getAddRecordAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalAedit.g:852:3: ( (lv_fields_9_0= ruleField ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=34 && LA16_0<=38)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAedit.g:853:4: (lv_fields_9_0= ruleField )
            	    {
            	    // InternalAedit.g:853:4: (lv_fields_9_0= ruleField )
            	    // InternalAedit.g:854:5: lv_fields_9_0= ruleField
            	    {

            	    					newCompositeNode(grammarAccess.getAddRecordAccess().getFieldsFieldParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_fields_9_0=ruleField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAddRecordRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fields",
            	    						lv_fields_9_0,
            	    						"org.aedit.Aedit.Field");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAddRecordAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleAddRecord"


    // $ANTLR start "entryRuleAddEnumeration"
    // InternalAedit.g:879:1: entryRuleAddEnumeration returns [EObject current=null] : iv_ruleAddEnumeration= ruleAddEnumeration EOF ;
    public final EObject entryRuleAddEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddEnumeration = null;


        try {
            // InternalAedit.g:879:55: (iv_ruleAddEnumeration= ruleAddEnumeration EOF )
            // InternalAedit.g:880:2: iv_ruleAddEnumeration= ruleAddEnumeration EOF
            {
             newCompositeNode(grammarAccess.getAddEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddEnumeration=ruleAddEnumeration();

            state._fsp--;

             current =iv_ruleAddEnumeration; 
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
    // $ANTLR end "entryRuleAddEnumeration"


    // $ANTLR start "ruleAddEnumeration"
    // InternalAedit.g:886:1: ruleAddEnumeration returns [EObject current=null] : (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'enum' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_enumName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_symbols_9_0= RULE_ID ) )* otherlv_10= '}' ) ;
    public final EObject ruleAddEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_enumName_7_0=null;
        Token otherlv_8=null;
        Token lv_symbols_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalAedit.g:892:2: ( (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'enum' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_enumName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_symbols_9_0= RULE_ID ) )* otherlv_10= '}' ) )
            // InternalAedit.g:893:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'enum' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_enumName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_symbols_9_0= RULE_ID ) )* otherlv_10= '}' )
            {
            // InternalAedit.g:893:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'enum' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_enumName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_symbols_9_0= RULE_ID ) )* otherlv_10= '}' )
            // InternalAedit.g:894:3: otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'enum' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_enumName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_symbols_9_0= RULE_ID ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAddEnumerationAccess().getAddAtKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAddEnumerationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAedit.g:902:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalAedit.g:903:4: (lv_index_2_0= RULE_INT )
            {
            // InternalAedit.g:903:4: (lv_index_2_0= RULE_INT )
            // InternalAedit.g:904:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_index_2_0, grammarAccess.getAddEnumerationAccess().getIndexINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddEnumerationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"index",
            						lv_index_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getAddEnumerationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getAddEnumerationAccess().getEnumKeyword_4());
            		
            // InternalAedit.g:928:3: ( (otherlv_5= RULE_ID ) )
            // InternalAedit.g:929:4: (otherlv_5= RULE_ID )
            {
            // InternalAedit.g:929:4: (otherlv_5= RULE_ID )
            // InternalAedit.g:930:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddEnumerationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_5, grammarAccess.getAddEnumerationAccess().getNamespaceAvroIDLFileCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getAddEnumerationAccess().getFullStopKeyword_6());
            		
            // InternalAedit.g:945:3: ( (lv_enumName_7_0= RULE_ID ) )
            // InternalAedit.g:946:4: (lv_enumName_7_0= RULE_ID )
            {
            // InternalAedit.g:946:4: (lv_enumName_7_0= RULE_ID )
            // InternalAedit.g:947:5: lv_enumName_7_0= RULE_ID
            {
            lv_enumName_7_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_enumName_7_0, grammarAccess.getAddEnumerationAccess().getEnumNameIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddEnumerationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"enumName",
            						lv_enumName_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getAddEnumerationAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalAedit.g:967:3: ( (lv_symbols_9_0= RULE_ID ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAedit.g:968:4: (lv_symbols_9_0= RULE_ID )
            	    {
            	    // InternalAedit.g:968:4: (lv_symbols_9_0= RULE_ID )
            	    // InternalAedit.g:969:5: lv_symbols_9_0= RULE_ID
            	    {
            	    lv_symbols_9_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(lv_symbols_9_0, grammarAccess.getAddEnumerationAccess().getSymbolsIDTerminalRuleCall_9_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getAddEnumerationRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"symbols",
            	    						lv_symbols_9_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAddEnumerationAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleAddEnumeration"


    // $ANTLR start "entryRuleAddVariable"
    // InternalAedit.g:993:1: entryRuleAddVariable returns [EObject current=null] : iv_ruleAddVariable= ruleAddVariable EOF ;
    public final EObject entryRuleAddVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddVariable = null;


        try {
            // InternalAedit.g:993:52: (iv_ruleAddVariable= ruleAddVariable EOF )
            // InternalAedit.g:994:2: iv_ruleAddVariable= ruleAddVariable EOF
            {
             newCompositeNode(grammarAccess.getAddVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddVariable=ruleAddVariable();

            state._fsp--;

             current =iv_ruleAddVariable; 
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
    // $ANTLR end "entryRuleAddVariable"


    // $ANTLR start "ruleAddVariable"
    // InternalAedit.g:1000:1: ruleAddVariable returns [EObject current=null] : (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_newVar_4_0= ruleField ) ) otherlv_5= ';' ) ;
    public final EObject ruleAddVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_newVar_4_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:1006:2: ( (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_newVar_4_0= ruleField ) ) otherlv_5= ';' ) )
            // InternalAedit.g:1007:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_newVar_4_0= ruleField ) ) otherlv_5= ';' )
            {
            // InternalAedit.g:1007:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_newVar_4_0= ruleField ) ) otherlv_5= ';' )
            // InternalAedit.g:1008:3: otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_newVar_4_0= ruleField ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAddVariableAccess().getAddAtKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAddVariableAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAedit.g:1016:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalAedit.g:1017:4: (lv_index_2_0= RULE_INT )
            {
            // InternalAedit.g:1017:4: (lv_index_2_0= RULE_INT )
            // InternalAedit.g:1018:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_index_2_0, grammarAccess.getAddVariableAccess().getIndexINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"index",
            						lv_index_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getAddVariableAccess().getRightParenthesisKeyword_3());
            		
            // InternalAedit.g:1038:3: ( (lv_newVar_4_0= ruleField ) )
            // InternalAedit.g:1039:4: (lv_newVar_4_0= ruleField )
            {
            // InternalAedit.g:1039:4: (lv_newVar_4_0= ruleField )
            // InternalAedit.g:1040:5: lv_newVar_4_0= ruleField
            {

            					newCompositeNode(grammarAccess.getAddVariableAccess().getNewVarFieldParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_newVar_4_0=ruleField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddVariableRule());
            					}
            					set(
            						current,
            						"newVar",
            						lv_newVar_4_0,
            						"org.aedit.Aedit.Field");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAddVariableAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleAddVariable"


    // $ANTLR start "entryRuleAddEnum"
    // InternalAedit.g:1065:1: entryRuleAddEnum returns [EObject current=null] : iv_ruleAddEnum= ruleAddEnum EOF ;
    public final EObject entryRuleAddEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddEnum = null;


        try {
            // InternalAedit.g:1065:48: (iv_ruleAddEnum= ruleAddEnum EOF )
            // InternalAedit.g:1066:2: iv_ruleAddEnum= ruleAddEnum EOF
            {
             newCompositeNode(grammarAccess.getAddEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddEnum=ruleAddEnum();

            state._fsp--;

             current =iv_ruleAddEnum; 
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
    // $ANTLR end "entryRuleAddEnum"


    // $ANTLR start "ruleAddEnum"
    // InternalAedit.g:1072:1: ruleAddEnum returns [EObject current=null] : (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_varName_4_0= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleAddEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;
        Token lv_varName_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAedit.g:1078:2: ( (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_varName_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalAedit.g:1079:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_varName_4_0= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalAedit.g:1079:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_varName_4_0= RULE_ID ) ) otherlv_5= ';' )
            // InternalAedit.g:1080:3: otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_varName_4_0= RULE_ID ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAddEnumAccess().getAddAtKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAddEnumAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAedit.g:1088:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalAedit.g:1089:4: (lv_index_2_0= RULE_INT )
            {
            // InternalAedit.g:1089:4: (lv_index_2_0= RULE_INT )
            // InternalAedit.g:1090:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_index_2_0, grammarAccess.getAddEnumAccess().getIndexINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddEnumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"index",
            						lv_index_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getAddEnumAccess().getRightParenthesisKeyword_3());
            		
            // InternalAedit.g:1110:3: ( (lv_varName_4_0= RULE_ID ) )
            // InternalAedit.g:1111:4: (lv_varName_4_0= RULE_ID )
            {
            // InternalAedit.g:1111:4: (lv_varName_4_0= RULE_ID )
            // InternalAedit.g:1112:5: lv_varName_4_0= RULE_ID
            {
            lv_varName_4_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_varName_4_0, grammarAccess.getAddEnumAccess().getVarNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddEnumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAddEnumAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleAddEnum"


    // $ANTLR start "entryRuleRemoveSchema"
    // InternalAedit.g:1136:1: entryRuleRemoveSchema returns [EObject current=null] : iv_ruleRemoveSchema= ruleRemoveSchema EOF ;
    public final EObject entryRuleRemoveSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveSchema = null;


        try {
            // InternalAedit.g:1136:53: (iv_ruleRemoveSchema= ruleRemoveSchema EOF )
            // InternalAedit.g:1137:2: iv_ruleRemoveSchema= ruleRemoveSchema EOF
            {
             newCompositeNode(grammarAccess.getRemoveSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoveSchema=ruleRemoveSchema();

            state._fsp--;

             current =iv_ruleRemoveSchema; 
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
    // $ANTLR end "entryRuleRemoveSchema"


    // $ANTLR start "ruleRemoveSchema"
    // InternalAedit.g:1143:1: ruleRemoveSchema returns [EObject current=null] : (otherlv_0= 'remove' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= ';' ) ;
    public final EObject ruleRemoveSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_schemaType_1_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:1149:2: ( (otherlv_0= 'remove' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= ';' ) )
            // InternalAedit.g:1150:2: (otherlv_0= 'remove' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= ';' )
            {
            // InternalAedit.g:1150:2: (otherlv_0= 'remove' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= ';' )
            // InternalAedit.g:1151:3: otherlv_0= 'remove' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveSchemaAccess().getRemoveKeyword_0());
            		
            // InternalAedit.g:1155:3: ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) )
            // InternalAedit.g:1156:4: (lv_schemaType_1_0= ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:1156:4: (lv_schemaType_1_0= ruleSCHEMA_TYPE )
            // InternalAedit.g:1157:5: lv_schemaType_1_0= ruleSCHEMA_TYPE
            {

            					newCompositeNode(grammarAccess.getRemoveSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_schemaType_1_0=ruleSCHEMA_TYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRemoveSchemaRule());
            					}
            					set(
            						current,
            						"schemaType",
            						lv_schemaType_1_0,
            						"org.aedit.Aedit.SCHEMA_TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAedit.g:1174:3: ( ( ruleQN ) )
            // InternalAedit.g:1175:4: ( ruleQN )
            {
            // InternalAedit.g:1175:4: ( ruleQN )
            // InternalAedit.g:1176:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveSchemaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRemoveSchemaAccess().getSchemaTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_11);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRemoveSchemaAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleRemoveSchema"


    // $ANTLR start "entryRuleRemoveVariable"
    // InternalAedit.g:1198:1: entryRuleRemoveVariable returns [EObject current=null] : iv_ruleRemoveVariable= ruleRemoveVariable EOF ;
    public final EObject entryRuleRemoveVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveVariable = null;


        try {
            // InternalAedit.g:1198:55: (iv_ruleRemoveVariable= ruleRemoveVariable EOF )
            // InternalAedit.g:1199:2: iv_ruleRemoveVariable= ruleRemoveVariable EOF
            {
             newCompositeNode(grammarAccess.getRemoveVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoveVariable=ruleRemoveVariable();

            state._fsp--;

             current =iv_ruleRemoveVariable; 
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
    // $ANTLR end "entryRuleRemoveVariable"


    // $ANTLR start "ruleRemoveVariable"
    // InternalAedit.g:1205:1: ruleRemoveVariable returns [EObject current=null] : (otherlv_0= 'remove' ( ( ruleQN ) ) otherlv_2= ';' ) ;
    public final EObject ruleRemoveVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalAedit.g:1211:2: ( (otherlv_0= 'remove' ( ( ruleQN ) ) otherlv_2= ';' ) )
            // InternalAedit.g:1212:2: (otherlv_0= 'remove' ( ( ruleQN ) ) otherlv_2= ';' )
            {
            // InternalAedit.g:1212:2: (otherlv_0= 'remove' ( ( ruleQN ) ) otherlv_2= ';' )
            // InternalAedit.g:1213:3: otherlv_0= 'remove' ( ( ruleQN ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveVariableAccess().getRemoveKeyword_0());
            		
            // InternalAedit.g:1217:3: ( ( ruleQN ) )
            // InternalAedit.g:1218:4: ( ruleQN )
            {
            // InternalAedit.g:1218:4: ( ruleQN )
            // InternalAedit.g:1219:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveVariableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRemoveVariableAccess().getVariableFieldCrossReference_1_0());
            				
            pushFollow(FOLLOW_11);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRemoveVariableAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleRemoveVariable"


    // $ANTLR start "entryRuleRemoveEnum"
    // InternalAedit.g:1241:1: entryRuleRemoveEnum returns [EObject current=null] : iv_ruleRemoveEnum= ruleRemoveEnum EOF ;
    public final EObject entryRuleRemoveEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveEnum = null;


        try {
            // InternalAedit.g:1241:51: (iv_ruleRemoveEnum= ruleRemoveEnum EOF )
            // InternalAedit.g:1242:2: iv_ruleRemoveEnum= ruleRemoveEnum EOF
            {
             newCompositeNode(grammarAccess.getRemoveEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoveEnum=ruleRemoveEnum();

            state._fsp--;

             current =iv_ruleRemoveEnum; 
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
    // $ANTLR end "entryRuleRemoveEnum"


    // $ANTLR start "ruleRemoveEnum"
    // InternalAedit.g:1248:1: ruleRemoveEnum returns [EObject current=null] : (otherlv_0= 'remove' ( (lv_varName_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleRemoveEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalAedit.g:1254:2: ( (otherlv_0= 'remove' ( (lv_varName_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalAedit.g:1255:2: (otherlv_0= 'remove' ( (lv_varName_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalAedit.g:1255:2: (otherlv_0= 'remove' ( (lv_varName_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalAedit.g:1256:3: otherlv_0= 'remove' ( (lv_varName_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveEnumAccess().getRemoveKeyword_0());
            		
            // InternalAedit.g:1260:3: ( (lv_varName_1_0= RULE_ID ) )
            // InternalAedit.g:1261:4: (lv_varName_1_0= RULE_ID )
            {
            // InternalAedit.g:1261:4: (lv_varName_1_0= RULE_ID )
            // InternalAedit.g:1262:5: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_varName_1_0, grammarAccess.getRemoveEnumAccess().getVarNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveEnumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRemoveEnumAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleRemoveEnum"


    // $ANTLR start "entryRuleRenameSchema"
    // InternalAedit.g:1286:1: entryRuleRenameSchema returns [EObject current=null] : iv_ruleRenameSchema= ruleRenameSchema EOF ;
    public final EObject entryRuleRenameSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameSchema = null;


        try {
            // InternalAedit.g:1286:53: (iv_ruleRenameSchema= ruleRenameSchema EOF )
            // InternalAedit.g:1287:2: iv_ruleRenameSchema= ruleRenameSchema EOF
            {
             newCompositeNode(grammarAccess.getRenameSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameSchema=ruleRenameSchema();

            state._fsp--;

             current =iv_ruleRenameSchema; 
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
    // $ANTLR end "entryRuleRenameSchema"


    // $ANTLR start "ruleRenameSchema"
    // InternalAedit.g:1293:1: ruleRenameSchema returns [EObject current=null] : (otherlv_0= 'rename' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( (lv_newSchName_4_0= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleRenameSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_newSchName_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_schemaType_1_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:1299:2: ( (otherlv_0= 'rename' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( (lv_newSchName_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalAedit.g:1300:2: (otherlv_0= 'rename' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( (lv_newSchName_4_0= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalAedit.g:1300:2: (otherlv_0= 'rename' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( (lv_newSchName_4_0= RULE_ID ) ) otherlv_5= ';' )
            // InternalAedit.g:1301:3: otherlv_0= 'rename' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( (lv_newSchName_4_0= RULE_ID ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameSchemaAccess().getRenameKeyword_0());
            		
            // InternalAedit.g:1305:3: ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) )
            // InternalAedit.g:1306:4: (lv_schemaType_1_0= ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:1306:4: (lv_schemaType_1_0= ruleSCHEMA_TYPE )
            // InternalAedit.g:1307:5: lv_schemaType_1_0= ruleSCHEMA_TYPE
            {

            					newCompositeNode(grammarAccess.getRenameSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_schemaType_1_0=ruleSCHEMA_TYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRenameSchemaRule());
            					}
            					set(
            						current,
            						"schemaType",
            						lv_schemaType_1_0,
            						"org.aedit.Aedit.SCHEMA_TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAedit.g:1324:3: ( ( ruleQN ) )
            // InternalAedit.g:1325:4: ( ruleQN )
            {
            // InternalAedit.g:1325:4: ( ruleQN )
            // InternalAedit.g:1326:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameSchemaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRenameSchemaAccess().getSchemaTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_25);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRenameSchemaAccess().getEqualsSignGreaterThanSignKeyword_3());
            		
            // InternalAedit.g:1344:3: ( (lv_newSchName_4_0= RULE_ID ) )
            // InternalAedit.g:1345:4: (lv_newSchName_4_0= RULE_ID )
            {
            // InternalAedit.g:1345:4: (lv_newSchName_4_0= RULE_ID )
            // InternalAedit.g:1346:5: lv_newSchName_4_0= RULE_ID
            {
            lv_newSchName_4_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_newSchName_4_0, grammarAccess.getRenameSchemaAccess().getNewSchNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameSchemaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"newSchName",
            						lv_newSchName_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRenameSchemaAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleRenameSchema"


    // $ANTLR start "entryRuleRenameVariable"
    // InternalAedit.g:1370:1: entryRuleRenameVariable returns [EObject current=null] : iv_ruleRenameVariable= ruleRenameVariable EOF ;
    public final EObject entryRuleRenameVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameVariable = null;


        try {
            // InternalAedit.g:1370:55: (iv_ruleRenameVariable= ruleRenameVariable EOF )
            // InternalAedit.g:1371:2: iv_ruleRenameVariable= ruleRenameVariable EOF
            {
             newCompositeNode(grammarAccess.getRenameVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameVariable=ruleRenameVariable();

            state._fsp--;

             current =iv_ruleRenameVariable; 
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
    // $ANTLR end "entryRuleRenameVariable"


    // $ANTLR start "ruleRenameVariable"
    // InternalAedit.g:1377:1: ruleRenameVariable returns [EObject current=null] : (otherlv_0= 'rename' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVarName_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleRenameVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_newVarName_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAedit.g:1383:2: ( (otherlv_0= 'rename' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVarName_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalAedit.g:1384:2: (otherlv_0= 'rename' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVarName_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalAedit.g:1384:2: (otherlv_0= 'rename' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVarName_3_0= RULE_ID ) ) otherlv_4= ';' )
            // InternalAedit.g:1385:3: otherlv_0= 'rename' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVarName_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameVariableAccess().getRenameKeyword_0());
            		
            // InternalAedit.g:1389:3: ( ( ruleQN ) )
            // InternalAedit.g:1390:4: ( ruleQN )
            {
            // InternalAedit.g:1390:4: ( ruleQN )
            // InternalAedit.g:1391:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameVariableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRenameVariableAccess().getVariableFieldCrossReference_1_0());
            				
            pushFollow(FOLLOW_25);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRenameVariableAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalAedit.g:1409:3: ( (lv_newVarName_3_0= RULE_ID ) )
            // InternalAedit.g:1410:4: (lv_newVarName_3_0= RULE_ID )
            {
            // InternalAedit.g:1410:4: (lv_newVarName_3_0= RULE_ID )
            // InternalAedit.g:1411:5: lv_newVarName_3_0= RULE_ID
            {
            lv_newVarName_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_newVarName_3_0, grammarAccess.getRenameVariableAccess().getNewVarNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"newVarName",
            						lv_newVarName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRenameVariableAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleRenameVariable"


    // $ANTLR start "entryRuleRenameEnum"
    // InternalAedit.g:1435:1: entryRuleRenameEnum returns [EObject current=null] : iv_ruleRenameEnum= ruleRenameEnum EOF ;
    public final EObject entryRuleRenameEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameEnum = null;


        try {
            // InternalAedit.g:1435:51: (iv_ruleRenameEnum= ruleRenameEnum EOF )
            // InternalAedit.g:1436:2: iv_ruleRenameEnum= ruleRenameEnum EOF
            {
             newCompositeNode(grammarAccess.getRenameEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRenameEnum=ruleRenameEnum();

            state._fsp--;

             current =iv_ruleRenameEnum; 
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
    // $ANTLR end "entryRuleRenameEnum"


    // $ANTLR start "ruleRenameEnum"
    // InternalAedit.g:1442:1: ruleRenameEnum returns [EObject current=null] : (otherlv_0= 'rename' ( (lv_oldName_1_0= RULE_ID ) ) otherlv_2= '=>' ( (lv_newEnumName_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleRenameEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_oldName_1_0=null;
        Token otherlv_2=null;
        Token lv_newEnumName_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAedit.g:1448:2: ( (otherlv_0= 'rename' ( (lv_oldName_1_0= RULE_ID ) ) otherlv_2= '=>' ( (lv_newEnumName_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalAedit.g:1449:2: (otherlv_0= 'rename' ( (lv_oldName_1_0= RULE_ID ) ) otherlv_2= '=>' ( (lv_newEnumName_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalAedit.g:1449:2: (otherlv_0= 'rename' ( (lv_oldName_1_0= RULE_ID ) ) otherlv_2= '=>' ( (lv_newEnumName_3_0= RULE_ID ) ) otherlv_4= ';' )
            // InternalAedit.g:1450:3: otherlv_0= 'rename' ( (lv_oldName_1_0= RULE_ID ) ) otherlv_2= '=>' ( (lv_newEnumName_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRenameEnumAccess().getRenameKeyword_0());
            		
            // InternalAedit.g:1454:3: ( (lv_oldName_1_0= RULE_ID ) )
            // InternalAedit.g:1455:4: (lv_oldName_1_0= RULE_ID )
            {
            // InternalAedit.g:1455:4: (lv_oldName_1_0= RULE_ID )
            // InternalAedit.g:1456:5: lv_oldName_1_0= RULE_ID
            {
            lv_oldName_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_oldName_1_0, grammarAccess.getRenameEnumAccess().getOldNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameEnumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"oldName",
            						lv_oldName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRenameEnumAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalAedit.g:1476:3: ( (lv_newEnumName_3_0= RULE_ID ) )
            // InternalAedit.g:1477:4: (lv_newEnumName_3_0= RULE_ID )
            {
            // InternalAedit.g:1477:4: (lv_newEnumName_3_0= RULE_ID )
            // InternalAedit.g:1478:5: lv_newEnumName_3_0= RULE_ID
            {
            lv_newEnumName_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_newEnumName_3_0, grammarAccess.getRenameEnumAccess().getNewEnumNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRenameEnumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"newEnumName",
            						lv_newEnumName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRenameEnumAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleRenameEnum"


    // $ANTLR start "entryRuleChangeDefValue"
    // InternalAedit.g:1502:1: entryRuleChangeDefValue returns [EObject current=null] : iv_ruleChangeDefValue= ruleChangeDefValue EOF ;
    public final EObject entryRuleChangeDefValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeDefValue = null;


        try {
            // InternalAedit.g:1502:55: (iv_ruleChangeDefValue= ruleChangeDefValue EOF )
            // InternalAedit.g:1503:2: iv_ruleChangeDefValue= ruleChangeDefValue EOF
            {
             newCompositeNode(grammarAccess.getChangeDefValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeDefValue=ruleChangeDefValue();

            state._fsp--;

             current =iv_ruleChangeDefValue; 
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
    // $ANTLR end "entryRuleChangeDefValue"


    // $ANTLR start "ruleChangeDefValue"
    // InternalAedit.g:1509:1: ruleChangeDefValue returns [EObject current=null] : (otherlv_0= 'set_val' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVal_3_0= ruleValue ) ) otherlv_4= ';' ) ;
    public final EObject ruleChangeDefValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_newVal_3_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:1515:2: ( (otherlv_0= 'set_val' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVal_3_0= ruleValue ) ) otherlv_4= ';' ) )
            // InternalAedit.g:1516:2: (otherlv_0= 'set_val' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVal_3_0= ruleValue ) ) otherlv_4= ';' )
            {
            // InternalAedit.g:1516:2: (otherlv_0= 'set_val' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVal_3_0= ruleValue ) ) otherlv_4= ';' )
            // InternalAedit.g:1517:3: otherlv_0= 'set_val' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVal_3_0= ruleValue ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeDefValueAccess().getSet_valKeyword_0());
            		
            // InternalAedit.g:1521:3: ( ( ruleQN ) )
            // InternalAedit.g:1522:4: ( ruleQN )
            {
            // InternalAedit.g:1522:4: ( ruleQN )
            // InternalAedit.g:1523:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeDefValueRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChangeDefValueAccess().getFieldFieldCrossReference_1_0());
            				
            pushFollow(FOLLOW_25);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getChangeDefValueAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalAedit.g:1541:3: ( (lv_newVal_3_0= ruleValue ) )
            // InternalAedit.g:1542:4: (lv_newVal_3_0= ruleValue )
            {
            // InternalAedit.g:1542:4: (lv_newVal_3_0= ruleValue )
            // InternalAedit.g:1543:5: lv_newVal_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getChangeDefValueAccess().getNewValValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_newVal_3_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeDefValueRule());
            					}
            					set(
            						current,
            						"newVal",
            						lv_newVal_3_0,
            						"org.aedit.Aedit.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getChangeDefValueAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleChangeDefValue"


    // $ANTLR start "entryRuleChangeType"
    // InternalAedit.g:1568:1: entryRuleChangeType returns [EObject current=null] : iv_ruleChangeType= ruleChangeType EOF ;
    public final EObject entryRuleChangeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeType = null;


        try {
            // InternalAedit.g:1568:51: (iv_ruleChangeType= ruleChangeType EOF )
            // InternalAedit.g:1569:2: iv_ruleChangeType= ruleChangeType EOF
            {
             newCompositeNode(grammarAccess.getChangeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeType=ruleChangeType();

            state._fsp--;

             current =iv_ruleChangeType; 
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
    // $ANTLR end "entryRuleChangeType"


    // $ANTLR start "ruleChangeType"
    // InternalAedit.g:1575:1: ruleChangeType returns [EObject current=null] : (otherlv_0= 'set_type' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newType_3_0= ruleVARIABLE_TYPE ) ) otherlv_4= ';' ) ;
    public final EObject ruleChangeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_newType_3_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:1581:2: ( (otherlv_0= 'set_type' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newType_3_0= ruleVARIABLE_TYPE ) ) otherlv_4= ';' ) )
            // InternalAedit.g:1582:2: (otherlv_0= 'set_type' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newType_3_0= ruleVARIABLE_TYPE ) ) otherlv_4= ';' )
            {
            // InternalAedit.g:1582:2: (otherlv_0= 'set_type' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newType_3_0= ruleVARIABLE_TYPE ) ) otherlv_4= ';' )
            // InternalAedit.g:1583:3: otherlv_0= 'set_type' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newType_3_0= ruleVARIABLE_TYPE ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeTypeAccess().getSet_typeKeyword_0());
            		
            // InternalAedit.g:1587:3: ( ( ruleQN ) )
            // InternalAedit.g:1588:4: ( ruleQN )
            {
            // InternalAedit.g:1588:4: ( ruleQN )
            // InternalAedit.g:1589:5: ruleQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChangeTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChangeTypeAccess().getFieldFieldCrossReference_1_0());
            				
            pushFollow(FOLLOW_25);
            ruleQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getChangeTypeAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalAedit.g:1607:3: ( (lv_newType_3_0= ruleVARIABLE_TYPE ) )
            // InternalAedit.g:1608:4: (lv_newType_3_0= ruleVARIABLE_TYPE )
            {
            // InternalAedit.g:1608:4: (lv_newType_3_0= ruleVARIABLE_TYPE )
            // InternalAedit.g:1609:5: lv_newType_3_0= ruleVARIABLE_TYPE
            {

            					newCompositeNode(grammarAccess.getChangeTypeAccess().getNewTypeVARIABLE_TYPEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_newType_3_0=ruleVARIABLE_TYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeTypeRule());
            					}
            					set(
            						current,
            						"newType",
            						lv_newType_3_0,
            						"org.aedit.Aedit.VARIABLE_TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getChangeTypeAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleChangeType"


    // $ANTLR start "entryRuleField"
    // InternalAedit.g:1634:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalAedit.g:1634:46: (iv_ruleField= ruleField EOF )
            // InternalAedit.g:1635:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalAedit.g:1641:1: ruleField returns [EObject current=null] : ( ( (lv_type_0_0= ruleVARIABLE_TYPE ) ) ( (lv_varName_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_varName_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:1647:2: ( ( ( (lv_type_0_0= ruleVARIABLE_TYPE ) ) ( (lv_varName_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )? ) )
            // InternalAedit.g:1648:2: ( ( (lv_type_0_0= ruleVARIABLE_TYPE ) ) ( (lv_varName_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )? )
            {
            // InternalAedit.g:1648:2: ( ( (lv_type_0_0= ruleVARIABLE_TYPE ) ) ( (lv_varName_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )? )
            // InternalAedit.g:1649:3: ( (lv_type_0_0= ruleVARIABLE_TYPE ) ) ( (lv_varName_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )?
            {
            // InternalAedit.g:1649:3: ( (lv_type_0_0= ruleVARIABLE_TYPE ) )
            // InternalAedit.g:1650:4: (lv_type_0_0= ruleVARIABLE_TYPE )
            {
            // InternalAedit.g:1650:4: (lv_type_0_0= ruleVARIABLE_TYPE )
            // InternalAedit.g:1651:5: lv_type_0_0= ruleVARIABLE_TYPE
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getTypeVARIABLE_TYPEParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_0_0=ruleVARIABLE_TYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.aedit.Aedit.VARIABLE_TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAedit.g:1668:3: ( (lv_varName_1_0= RULE_ID ) )
            // InternalAedit.g:1669:4: (lv_varName_1_0= RULE_ID )
            {
            // InternalAedit.g:1669:4: (lv_varName_1_0= RULE_ID )
            // InternalAedit.g:1670:5: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_varName_1_0, grammarAccess.getFieldAccess().getVarNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAedit.g:1686:3: (otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAedit.g:1687:4: otherlv_2= '=' ( (lv_value_3_0= ruleValue ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalAedit.g:1691:4: ( (lv_value_3_0= ruleValue ) )
                    // InternalAedit.g:1692:5: (lv_value_3_0= ruleValue )
                    {
                    // InternalAedit.g:1692:5: (lv_value_3_0= ruleValue )
                    // InternalAedit.g:1693:6: lv_value_3_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getValueValueParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.aedit.Aedit.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleValue"
    // InternalAedit.g:1715:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalAedit.g:1715:46: (iv_ruleValue= ruleValue EOF )
            // InternalAedit.g:1716:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalAedit.g:1722:1: ruleValue returns [EObject current=null] : (this_FloatValue_0= ruleFloatValue | this_IntValue_1= ruleIntValue | this_StringValue_2= ruleStringValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_FloatValue_0 = null;

        EObject this_IntValue_1 = null;

        EObject this_StringValue_2 = null;



        	enterRule();

        try {
            // InternalAedit.g:1728:2: ( (this_FloatValue_0= ruleFloatValue | this_IntValue_1= ruleIntValue | this_StringValue_2= ruleStringValue ) )
            // InternalAedit.g:1729:2: (this_FloatValue_0= ruleFloatValue | this_IntValue_1= ruleIntValue | this_StringValue_2= ruleStringValue )
            {
            // InternalAedit.g:1729:2: (this_FloatValue_0= ruleFloatValue | this_IntValue_1= ruleIntValue | this_StringValue_2= ruleStringValue )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt19=1;
                }
                break;
            case RULE_INT:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==26) ) {
                    alt19=1;
                }
                else if ( (LA19_2==EOF||LA19_2==14||LA19_2==16||(LA19_2>=34 && LA19_2<=38)) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalAedit.g:1730:3: this_FloatValue_0= ruleFloatValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getFloatValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatValue_0=ruleFloatValue();

                    state._fsp--;


                    			current = this_FloatValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAedit.g:1739:3: this_IntValue_1= ruleIntValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntValue_1=ruleIntValue();

                    state._fsp--;


                    			current = this_IntValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAedit.g:1748:3: this_StringValue_2= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalAedit.g:1760:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalAedit.g:1760:51: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalAedit.g:1761:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue; 
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
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalAedit.g:1767:1: ruleFloatValue returns [EObject current=null] : ( (lv_val_0_0= ruleReal ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:1773:2: ( ( (lv_val_0_0= ruleReal ) ) )
            // InternalAedit.g:1774:2: ( (lv_val_0_0= ruleReal ) )
            {
            // InternalAedit.g:1774:2: ( (lv_val_0_0= ruleReal ) )
            // InternalAedit.g:1775:3: (lv_val_0_0= ruleReal )
            {
            // InternalAedit.g:1775:3: (lv_val_0_0= ruleReal )
            // InternalAedit.g:1776:4: lv_val_0_0= ruleReal
            {

            				newCompositeNode(grammarAccess.getFloatValueAccess().getValRealParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_val_0_0=ruleReal();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFloatValueRule());
            				}
            				set(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.aedit.Aedit.Real");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalAedit.g:1796:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalAedit.g:1796:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalAedit.g:1797:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalAedit.g:1803:1: ruleStringValue returns [EObject current=null] : ( (lv_val_0_0= RULE_ID ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalAedit.g:1809:2: ( ( (lv_val_0_0= RULE_ID ) ) )
            // InternalAedit.g:1810:2: ( (lv_val_0_0= RULE_ID ) )
            {
            // InternalAedit.g:1810:2: ( (lv_val_0_0= RULE_ID ) )
            // InternalAedit.g:1811:3: (lv_val_0_0= RULE_ID )
            {
            // InternalAedit.g:1811:3: (lv_val_0_0= RULE_ID )
            // InternalAedit.g:1812:4: lv_val_0_0= RULE_ID
            {
            lv_val_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getStringValueAccess().getValIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalAedit.g:1831:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalAedit.g:1831:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalAedit.g:1832:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalAedit.g:1838:1: ruleIntValue returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalAedit.g:1844:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalAedit.g:1845:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalAedit.g:1845:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalAedit.g:1846:3: (lv_val_0_0= RULE_INT )
            {
            // InternalAedit.g:1846:3: (lv_val_0_0= RULE_INT )
            // InternalAedit.g:1847:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleReal"
    // InternalAedit.g:1866:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;


        try {
            // InternalAedit.g:1866:44: (iv_ruleReal= ruleReal EOF )
            // InternalAedit.g:1867:2: iv_ruleReal= ruleReal EOF
            {
             newCompositeNode(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReal=ruleReal();

            state._fsp--;

             current =iv_ruleReal.getText(); 
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
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalAedit.g:1873:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalAedit.g:1879:2: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            // InternalAedit.g:1880:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            {
            // InternalAedit.g:1880:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // InternalAedit.g:1881:3: (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            // InternalAedit.g:1881:3: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAedit.g:1882:4: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_21); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getRealAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,26,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getRealAccess().getINTTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleSCHEMA_TYPE"
    // InternalAedit.g:1911:1: entryRuleSCHEMA_TYPE returns [String current=null] : iv_ruleSCHEMA_TYPE= ruleSCHEMA_TYPE EOF ;
    public final String entryRuleSCHEMA_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSCHEMA_TYPE = null;


        try {
            // InternalAedit.g:1911:51: (iv_ruleSCHEMA_TYPE= ruleSCHEMA_TYPE EOF )
            // InternalAedit.g:1912:2: iv_ruleSCHEMA_TYPE= ruleSCHEMA_TYPE EOF
            {
             newCompositeNode(grammarAccess.getSCHEMA_TYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSCHEMA_TYPE=ruleSCHEMA_TYPE();

            state._fsp--;

             current =iv_ruleSCHEMA_TYPE.getText(); 
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
    // $ANTLR end "entryRuleSCHEMA_TYPE"


    // $ANTLR start "ruleSCHEMA_TYPE"
    // InternalAedit.g:1918:1: ruleSCHEMA_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'record' | kw= 'enum' ) ;
    public final AntlrDatatypeRuleToken ruleSCHEMA_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAedit.g:1924:2: ( (kw= 'record' | kw= 'enum' ) )
            // InternalAedit.g:1925:2: (kw= 'record' | kw= 'enum' )
            {
            // InternalAedit.g:1925:2: (kw= 'record' | kw= 'enum' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            else if ( (LA21_0==22) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalAedit.g:1926:3: kw= 'record'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSCHEMA_TYPEAccess().getRecordKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAedit.g:1932:3: kw= 'enum'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSCHEMA_TYPEAccess().getEnumKeyword_1());
                    		

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
    // $ANTLR end "ruleSCHEMA_TYPE"


    // $ANTLR start "entryRuleVARIABLE_TYPE"
    // InternalAedit.g:1941:1: entryRuleVARIABLE_TYPE returns [String current=null] : iv_ruleVARIABLE_TYPE= ruleVARIABLE_TYPE EOF ;
    public final String entryRuleVARIABLE_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVARIABLE_TYPE = null;


        try {
            // InternalAedit.g:1941:53: (iv_ruleVARIABLE_TYPE= ruleVARIABLE_TYPE EOF )
            // InternalAedit.g:1942:2: iv_ruleVARIABLE_TYPE= ruleVARIABLE_TYPE EOF
            {
             newCompositeNode(grammarAccess.getVARIABLE_TYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVARIABLE_TYPE=ruleVARIABLE_TYPE();

            state._fsp--;

             current =iv_ruleVARIABLE_TYPE.getText(); 
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
    // $ANTLR end "entryRuleVARIABLE_TYPE"


    // $ANTLR start "ruleVARIABLE_TYPE"
    // InternalAedit.g:1948:1: ruleVARIABLE_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | kw= 'int' | kw= 'double' | kw= 'string' | kw= 'long' ) ;
    public final AntlrDatatypeRuleToken ruleVARIABLE_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAedit.g:1954:2: ( (kw= 'void' | kw= 'int' | kw= 'double' | kw= 'string' | kw= 'long' ) )
            // InternalAedit.g:1955:2: (kw= 'void' | kw= 'int' | kw= 'double' | kw= 'string' | kw= 'long' )
            {
            // InternalAedit.g:1955:2: (kw= 'void' | kw= 'int' | kw= 'double' | kw= 'string' | kw= 'long' )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt22=1;
                }
                break;
            case 35:
                {
                alt22=2;
                }
                break;
            case 36:
                {
                alt22=3;
                }
                break;
            case 37:
                {
                alt22=4;
                }
                break;
            case 38:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalAedit.g:1956:3: kw= 'void'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVARIABLE_TYPEAccess().getVoidKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAedit.g:1962:3: kw= 'int'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVARIABLE_TYPEAccess().getIntKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAedit.g:1968:3: kw= 'double'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVARIABLE_TYPEAccess().getDoubleKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAedit.g:1974:3: kw= 'string'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVARIABLE_TYPEAccess().getStringKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAedit.g:1980:3: kw= 'long'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVARIABLE_TYPEAccess().getLongKeyword_4());
                    		

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
    // $ANTLR end "ruleVARIABLE_TYPE"


    // $ANTLR start "entryRuleQN"
    // InternalAedit.g:1989:1: entryRuleQN returns [String current=null] : iv_ruleQN= ruleQN EOF ;
    public final String entryRuleQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQN = null;


        try {
            // InternalAedit.g:1989:42: (iv_ruleQN= ruleQN EOF )
            // InternalAedit.g:1990:2: iv_ruleQN= ruleQN EOF
            {
             newCompositeNode(grammarAccess.getQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQN=ruleQN();

            state._fsp--;

             current =iv_ruleQN.getText(); 
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
    // $ANTLR end "entryRuleQN"


    // $ANTLR start "ruleQN"
    // InternalAedit.g:1996:1: ruleQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAedit.g:2002:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAedit.g:2003:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAedit.g:2003:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAedit.g:2004:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalAedit.g:2011:3: (kw= '.' this_ID_2= RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAedit.g:2012:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_7); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_28); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


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
    // $ANTLR end "ruleQN"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000068802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000028802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000018884000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000D8804000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018804000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000007C00004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000002L});

}