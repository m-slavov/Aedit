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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAeditParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'feature'", "':'", "'{'", "'}'", "'use'", "';'", "'ruleset'", "'rule'", "'add.annot'", "'=>'", "'add.name_annot'", "'remove.annot'", "'remove.name_annot'", "'change'", "'record'", "'error'", "'enum'", "'add.at'", "'('", "')'", "'.'", "','", "'remove'", "'rename'", "'set_val'", "'set_type'", "'remove_value'", "'remove_value.at'", "'add_value.at'", "'='", "'array'", "'<'", "'>'", "'['", "']'", "'null'", "'-'", "'true'", "'false'", "'int'", "'double'", "'string'", "'long'", "'boolean'", "'float'", "'@'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getRuleDeclarationsRuleDeclarationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_ruleDeclarations_0_0=ruleRuleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getRuleMapsRuleMapParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_ruleMaps_1_0=ruleRuleMap();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getFeaturesFeatureParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_features_2_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getFeatureMapsFeatureMapParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_featureMaps_3_0=ruleFeatureMap();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
            otherlv_0=(Token)match(input,11,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getFeatureKeyword_0());
              		
            }
            // InternalAedit.g:178:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAedit.g:179:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAedit.g:179:4: (lv_name_1_0= RULE_ID )
            // InternalAedit.g:180:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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
                    otherlv_2=(Token)match(input,12,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalAedit.g:201:4: ( (otherlv_3= RULE_ID ) )
                    // InternalAedit.g:202:5: (otherlv_3= RULE_ID )
                    {
                    // InternalAedit.g:202:5: (otherlv_3= RULE_ID )
                    // InternalAedit.g:203:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFeatureRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getExtendFeatureCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_3());
              		
            }
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
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getFeatureRule());
            	      					}
            	      				
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getFeatureAccess().getRuleMapsRuleMapCrossReference_4_0());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureMapRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureMap=ruleFeatureMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureMap; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
            otherlv_0=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFeatureMapAccess().getUseKeyword_0());
              		
            }
            // InternalAedit.g:259:3: ( (otherlv_1= RULE_ID ) )
            // InternalAedit.g:260:4: (otherlv_1= RULE_ID )
            {
            // InternalAedit.g:260:4: (otherlv_1= RULE_ID )
            // InternalAedit.g:261:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFeatureMapRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getFeatureMapAccess().getNameFeatureCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFeatureMapAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleMapRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuleMap=ruleRuleMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleMap; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
            otherlv_0=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRuleMapAccess().getRulesetKeyword_0());
              		
            }
            // InternalAedit.g:299:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAedit.g:300:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAedit.g:300:4: (lv_name_1_0= RULE_ID )
            // InternalAedit.g:301:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getRuleMapAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,13,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRuleMapAccess().getLeftCurlyBracketKeyword_2());
              		
            }
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
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getRuleMapRule());
            	      					}
            	      				
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_3, grammarAccess.getRuleMapAccess().getRulesRuleDeclarationCrossReference_3_0());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRuleMapAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuleDeclaration=ruleRuleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
            otherlv_0=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRuleDeclarationAccess().getRuleKeyword_0());
              		
            }
            // InternalAedit.g:361:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAedit.g:362:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAedit.g:362:4: (lv_name_1_0= RULE_ID )
            // InternalAedit.g:363:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getRuleDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRuleDeclarationAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalAedit.g:383:3: ( (lv_rules_3_0= ruleGenericRule ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19||LA8_0==22||LA8_0==24||LA8_0==28||(LA8_0>=33 && LA8_0<=34)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAedit.g:384:4: (lv_rules_3_0= ruleGenericRule )
            	    {
            	    // InternalAedit.g:384:4: (lv_rules_3_0= ruleGenericRule )
            	    // InternalAedit.g:385:5: lv_rules_3_0= ruleGenericRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getRuleDeclarationAccess().getRulesGenericRuleParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_rules_3_0=ruleGenericRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRuleDeclarationAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenericRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGenericRule=ruleGenericRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenericRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:417:1: ruleGenericRule returns [EObject current=null] : (this_RenameSchema_0= ruleRenameSchema | this_RemoveSchema_1= ruleRemoveSchema | this_Add_2= ruleAdd | this_ChangeSchema_3= ruleChangeSchema | this_ChangeEnum_4= ruleChangeEnum | this_AddAnnotationToSchema_5= ruleAddAnnotationToSchema | this_RemoveAnnotationFromSchema_6= ruleRemoveAnnotationFromSchema ) ;
    public final EObject ruleGenericRule() throws RecognitionException {
        EObject current = null;

        EObject this_RenameSchema_0 = null;

        EObject this_RemoveSchema_1 = null;

        EObject this_Add_2 = null;

        EObject this_ChangeSchema_3 = null;

        EObject this_ChangeEnum_4 = null;

        EObject this_AddAnnotationToSchema_5 = null;

        EObject this_RemoveAnnotationFromSchema_6 = null;



        	enterRule();

        try {
            // InternalAedit.g:423:2: ( (this_RenameSchema_0= ruleRenameSchema | this_RemoveSchema_1= ruleRemoveSchema | this_Add_2= ruleAdd | this_ChangeSchema_3= ruleChangeSchema | this_ChangeEnum_4= ruleChangeEnum | this_AddAnnotationToSchema_5= ruleAddAnnotationToSchema | this_RemoveAnnotationFromSchema_6= ruleRemoveAnnotationFromSchema ) )
            // InternalAedit.g:424:2: (this_RenameSchema_0= ruleRenameSchema | this_RemoveSchema_1= ruleRemoveSchema | this_Add_2= ruleAdd | this_ChangeSchema_3= ruleChangeSchema | this_ChangeEnum_4= ruleChangeEnum | this_AddAnnotationToSchema_5= ruleAddAnnotationToSchema | this_RemoveAnnotationFromSchema_6= ruleRemoveAnnotationFromSchema )
            {
            // InternalAedit.g:424:2: (this_RenameSchema_0= ruleRenameSchema | this_RemoveSchema_1= ruleRemoveSchema | this_Add_2= ruleAdd | this_ChangeSchema_3= ruleChangeSchema | this_ChangeEnum_4= ruleChangeEnum | this_AddAnnotationToSchema_5= ruleAddAnnotationToSchema | this_RemoveAnnotationFromSchema_6= ruleRemoveAnnotationFromSchema )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                alt9=2;
                }
                break;
            case 28:
                {
                alt9=3;
                }
                break;
            case 24:
                {
                int LA9_4 = input.LA(2);

                if ( ((LA9_4>=25 && LA9_4<=26)) ) {
                    alt9=4;
                }
                else if ( (LA9_4==27) ) {
                    alt9=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt9=6;
                }
                break;
            case 22:
                {
                alt9=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAedit.g:425:3: this_RenameSchema_0= ruleRenameSchema
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGenericRuleAccess().getRenameSchemaParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RenameSchema_0=ruleRenameSchema();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RenameSchema_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAedit.g:434:3: this_RemoveSchema_1= ruleRemoveSchema
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGenericRuleAccess().getRemoveSchemaParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RemoveSchema_1=ruleRemoveSchema();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RemoveSchema_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAedit.g:443:3: this_Add_2= ruleAdd
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGenericRuleAccess().getAddParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Add_2=ruleAdd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Add_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAedit.g:452:3: this_ChangeSchema_3= ruleChangeSchema
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGenericRuleAccess().getChangeSchemaParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ChangeSchema_3=ruleChangeSchema();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ChangeSchema_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAedit.g:461:3: this_ChangeEnum_4= ruleChangeEnum
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGenericRuleAccess().getChangeEnumParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ChangeEnum_4=ruleChangeEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ChangeEnum_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAedit.g:470:3: this_AddAnnotationToSchema_5= ruleAddAnnotationToSchema
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGenericRuleAccess().getAddAnnotationToSchemaParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AddAnnotationToSchema_5=ruleAddAnnotationToSchema();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AddAnnotationToSchema_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAedit.g:479:3: this_RemoveAnnotationFromSchema_6= ruleRemoveAnnotationFromSchema
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGenericRuleAccess().getRemoveAnnotationFromSchemaParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RemoveAnnotationFromSchema_6=ruleRemoveAnnotationFromSchema();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RemoveAnnotationFromSchema_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGenericRule"


    // $ANTLR start "entryRuleSchemaRule"
    // InternalAedit.g:491:1: entryRuleSchemaRule returns [EObject current=null] : iv_ruleSchemaRule= ruleSchemaRule EOF ;
    public final EObject entryRuleSchemaRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaRule = null;


        try {
            // InternalAedit.g:491:51: (iv_ruleSchemaRule= ruleSchemaRule EOF )
            // InternalAedit.g:492:2: iv_ruleSchemaRule= ruleSchemaRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSchemaRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSchemaRule=ruleSchemaRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSchemaRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:498:1: ruleSchemaRule returns [EObject current=null] : (this_RemoveVariable_0= ruleRemoveVariable | this_RenameVariable_1= ruleRenameVariable | this_AddVariable_2= ruleAddVariable | this_ChangeDefValue_3= ruleChangeDefValue | this_ChangeType_4= ruleChangeType | this_AddAnnotationToField_5= ruleAddAnnotationToField | this_AddNameAnnotationToField_6= ruleAddNameAnnotationToField | this_RemoveAnnotationFromField_7= ruleRemoveAnnotationFromField | this_RemoveNameAnnotationFromField_8= ruleRemoveNameAnnotationFromField | this_ArrayEditRules_9= ruleArrayEditRules ) ;
    public final EObject ruleSchemaRule() throws RecognitionException {
        EObject current = null;

        EObject this_RemoveVariable_0 = null;

        EObject this_RenameVariable_1 = null;

        EObject this_AddVariable_2 = null;

        EObject this_ChangeDefValue_3 = null;

        EObject this_ChangeType_4 = null;

        EObject this_AddAnnotationToField_5 = null;

        EObject this_AddNameAnnotationToField_6 = null;

        EObject this_RemoveAnnotationFromField_7 = null;

        EObject this_RemoveNameAnnotationFromField_8 = null;

        EObject this_ArrayEditRules_9 = null;



        	enterRule();

        try {
            // InternalAedit.g:504:2: ( (this_RemoveVariable_0= ruleRemoveVariable | this_RenameVariable_1= ruleRenameVariable | this_AddVariable_2= ruleAddVariable | this_ChangeDefValue_3= ruleChangeDefValue | this_ChangeType_4= ruleChangeType | this_AddAnnotationToField_5= ruleAddAnnotationToField | this_AddNameAnnotationToField_6= ruleAddNameAnnotationToField | this_RemoveAnnotationFromField_7= ruleRemoveAnnotationFromField | this_RemoveNameAnnotationFromField_8= ruleRemoveNameAnnotationFromField | this_ArrayEditRules_9= ruleArrayEditRules ) )
            // InternalAedit.g:505:2: (this_RemoveVariable_0= ruleRemoveVariable | this_RenameVariable_1= ruleRenameVariable | this_AddVariable_2= ruleAddVariable | this_ChangeDefValue_3= ruleChangeDefValue | this_ChangeType_4= ruleChangeType | this_AddAnnotationToField_5= ruleAddAnnotationToField | this_AddNameAnnotationToField_6= ruleAddNameAnnotationToField | this_RemoveAnnotationFromField_7= ruleRemoveAnnotationFromField | this_RemoveNameAnnotationFromField_8= ruleRemoveNameAnnotationFromField | this_ArrayEditRules_9= ruleArrayEditRules )
            {
            // InternalAedit.g:505:2: (this_RemoveVariable_0= ruleRemoveVariable | this_RenameVariable_1= ruleRenameVariable | this_AddVariable_2= ruleAddVariable | this_ChangeDefValue_3= ruleChangeDefValue | this_ChangeType_4= ruleChangeType | this_AddAnnotationToField_5= ruleAddAnnotationToField | this_AddNameAnnotationToField_6= ruleAddNameAnnotationToField | this_RemoveAnnotationFromField_7= ruleRemoveAnnotationFromField | this_RemoveNameAnnotationFromField_8= ruleRemoveNameAnnotationFromField | this_ArrayEditRules_9= ruleArrayEditRules )
            int alt10=10;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt10=1;
                }
                break;
            case 34:
                {
                alt10=2;
                }
                break;
            case 28:
                {
                alt10=3;
                }
                break;
            case 35:
                {
                alt10=4;
                }
                break;
            case 36:
                {
                alt10=5;
                }
                break;
            case 19:
                {
                alt10=6;
                }
                break;
            case 21:
                {
                alt10=7;
                }
                break;
            case 22:
                {
                alt10=8;
                }
                break;
            case 23:
                {
                alt10=9;
                }
                break;
            case 37:
            case 38:
            case 39:
                {
                alt10=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalAedit.g:506:3: this_RemoveVariable_0= ruleRemoveVariable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSchemaRuleAccess().getRemoveVariableParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RemoveVariable_0=ruleRemoveVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RemoveVariable_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAedit.g:515:3: this_RenameVariable_1= ruleRenameVariable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSchemaRuleAccess().getRenameVariableParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RenameVariable_1=ruleRenameVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RenameVariable_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAedit.g:524:3: this_AddVariable_2= ruleAddVariable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSchemaRuleAccess().getAddVariableParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AddVariable_2=ruleAddVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AddVariable_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAedit.g:533:3: this_ChangeDefValue_3= ruleChangeDefValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSchemaRuleAccess().getChangeDefValueParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ChangeDefValue_3=ruleChangeDefValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ChangeDefValue_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAedit.g:542:3: this_ChangeType_4= ruleChangeType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSchemaRuleAccess().getChangeTypeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ChangeType_4=ruleChangeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ChangeType_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAedit.g:551:3: this_AddAnnotationToField_5= ruleAddAnnotationToField
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSchemaRuleAccess().getAddAnnotationToFieldParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AddAnnotationToField_5=ruleAddAnnotationToField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AddAnnotationToField_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalAedit.g:560:3: this_AddNameAnnotationToField_6= ruleAddNameAnnotationToField
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSchemaRuleAccess().getAddNameAnnotationToFieldParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AddNameAnnotationToField_6=ruleAddNameAnnotationToField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AddNameAnnotationToField_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalAedit.g:569:3: this_RemoveAnnotationFromField_7= ruleRemoveAnnotationFromField
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSchemaRuleAccess().getRemoveAnnotationFromFieldParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RemoveAnnotationFromField_7=ruleRemoveAnnotationFromField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RemoveAnnotationFromField_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalAedit.g:578:3: this_RemoveNameAnnotationFromField_8= ruleRemoveNameAnnotationFromField
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSchemaRuleAccess().getRemoveNameAnnotationFromFieldParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RemoveNameAnnotationFromField_8=ruleRemoveNameAnnotationFromField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RemoveNameAnnotationFromField_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalAedit.g:587:3: this_ArrayEditRules_9= ruleArrayEditRules
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSchemaRuleAccess().getArrayEditRulesParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayEditRules_9=ruleArrayEditRules();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArrayEditRules_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSchemaRule"


    // $ANTLR start "entryRuleArrayEditRules"
    // InternalAedit.g:599:1: entryRuleArrayEditRules returns [EObject current=null] : iv_ruleArrayEditRules= ruleArrayEditRules EOF ;
    public final EObject entryRuleArrayEditRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayEditRules = null;


        try {
            // InternalAedit.g:599:55: (iv_ruleArrayEditRules= ruleArrayEditRules EOF )
            // InternalAedit.g:600:2: iv_ruleArrayEditRules= ruleArrayEditRules EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayEditRulesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayEditRules=ruleArrayEditRules();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayEditRules; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayEditRules"


    // $ANTLR start "ruleArrayEditRules"
    // InternalAedit.g:606:1: ruleArrayEditRules returns [EObject current=null] : (this_RemoveArrayValue_0= ruleRemoveArrayValue | this_RemoveArrayValueAtIndex_1= ruleRemoveArrayValueAtIndex | this_AddValueToArray_2= ruleAddValueToArray ) ;
    public final EObject ruleArrayEditRules() throws RecognitionException {
        EObject current = null;

        EObject this_RemoveArrayValue_0 = null;

        EObject this_RemoveArrayValueAtIndex_1 = null;

        EObject this_AddValueToArray_2 = null;



        	enterRule();

        try {
            // InternalAedit.g:612:2: ( (this_RemoveArrayValue_0= ruleRemoveArrayValue | this_RemoveArrayValueAtIndex_1= ruleRemoveArrayValueAtIndex | this_AddValueToArray_2= ruleAddValueToArray ) )
            // InternalAedit.g:613:2: (this_RemoveArrayValue_0= ruleRemoveArrayValue | this_RemoveArrayValueAtIndex_1= ruleRemoveArrayValueAtIndex | this_AddValueToArray_2= ruleAddValueToArray )
            {
            // InternalAedit.g:613:2: (this_RemoveArrayValue_0= ruleRemoveArrayValue | this_RemoveArrayValueAtIndex_1= ruleRemoveArrayValueAtIndex | this_AddValueToArray_2= ruleAddValueToArray )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt11=1;
                }
                break;
            case 38:
                {
                alt11=2;
                }
                break;
            case 39:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAedit.g:614:3: this_RemoveArrayValue_0= ruleRemoveArrayValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArrayEditRulesAccess().getRemoveArrayValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RemoveArrayValue_0=ruleRemoveArrayValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RemoveArrayValue_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAedit.g:623:3: this_RemoveArrayValueAtIndex_1= ruleRemoveArrayValueAtIndex
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArrayEditRulesAccess().getRemoveArrayValueAtIndexParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RemoveArrayValueAtIndex_1=ruleRemoveArrayValueAtIndex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RemoveArrayValueAtIndex_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAedit.g:632:3: this_AddValueToArray_2= ruleAddValueToArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getArrayEditRulesAccess().getAddValueToArrayParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AddValueToArray_2=ruleAddValueToArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AddValueToArray_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArrayEditRules"


    // $ANTLR start "entryRuleEnumRule"
    // InternalAedit.g:644:1: entryRuleEnumRule returns [EObject current=null] : iv_ruleEnumRule= ruleEnumRule EOF ;
    public final EObject entryRuleEnumRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumRule = null;


        try {
            // InternalAedit.g:644:49: (iv_ruleEnumRule= ruleEnumRule EOF )
            // InternalAedit.g:645:2: iv_ruleEnumRule= ruleEnumRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumRule=ruleEnumRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:651:1: ruleEnumRule returns [EObject current=null] : (this_RemoveEnum_0= ruleRemoveEnum | this_RenameEnum_1= ruleRenameEnum | this_AddEnum_2= ruleAddEnum ) ;
    public final EObject ruleEnumRule() throws RecognitionException {
        EObject current = null;

        EObject this_RemoveEnum_0 = null;

        EObject this_RenameEnum_1 = null;

        EObject this_AddEnum_2 = null;



        	enterRule();

        try {
            // InternalAedit.g:657:2: ( (this_RemoveEnum_0= ruleRemoveEnum | this_RenameEnum_1= ruleRenameEnum | this_AddEnum_2= ruleAddEnum ) )
            // InternalAedit.g:658:2: (this_RemoveEnum_0= ruleRemoveEnum | this_RenameEnum_1= ruleRenameEnum | this_AddEnum_2= ruleAddEnum )
            {
            // InternalAedit.g:658:2: (this_RemoveEnum_0= ruleRemoveEnum | this_RenameEnum_1= ruleRenameEnum | this_AddEnum_2= ruleAddEnum )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt12=1;
                }
                break;
            case 34:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAedit.g:659:3: this_RemoveEnum_0= ruleRemoveEnum
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnumRuleAccess().getRemoveEnumParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RemoveEnum_0=ruleRemoveEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RemoveEnum_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAedit.g:668:3: this_RenameEnum_1= ruleRenameEnum
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnumRuleAccess().getRenameEnumParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RenameEnum_1=ruleRenameEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RenameEnum_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAedit.g:677:3: this_AddEnum_2= ruleAddEnum
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEnumRuleAccess().getAddEnumParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AddEnum_2=ruleAddEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AddEnum_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumRule"


    // $ANTLR start "entryRuleAddAnnotationToSchema"
    // InternalAedit.g:689:1: entryRuleAddAnnotationToSchema returns [EObject current=null] : iv_ruleAddAnnotationToSchema= ruleAddAnnotationToSchema EOF ;
    public final EObject entryRuleAddAnnotationToSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddAnnotationToSchema = null;


        try {
            // InternalAedit.g:689:62: (iv_ruleAddAnnotationToSchema= ruleAddAnnotationToSchema EOF )
            // InternalAedit.g:690:2: iv_ruleAddAnnotationToSchema= ruleAddAnnotationToSchema EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddAnnotationToSchemaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddAnnotationToSchema=ruleAddAnnotationToSchema();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddAnnotationToSchema; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddAnnotationToSchema"


    // $ANTLR start "ruleAddAnnotationToSchema"
    // InternalAedit.g:696:1: ruleAddAnnotationToSchema returns [EObject current=null] : (otherlv_0= 'add.annot' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( (lv_annotation_4_0= ruleAnnotation ) ) otherlv_5= ';' ) ;
    public final EObject ruleAddAnnotationToSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_schemaType_1_0 = null;

        EObject lv_annotation_4_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:702:2: ( (otherlv_0= 'add.annot' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( (lv_annotation_4_0= ruleAnnotation ) ) otherlv_5= ';' ) )
            // InternalAedit.g:703:2: (otherlv_0= 'add.annot' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( (lv_annotation_4_0= ruleAnnotation ) ) otherlv_5= ';' )
            {
            // InternalAedit.g:703:2: (otherlv_0= 'add.annot' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( (lv_annotation_4_0= ruleAnnotation ) ) otherlv_5= ';' )
            // InternalAedit.g:704:3: otherlv_0= 'add.annot' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( (lv_annotation_4_0= ruleAnnotation ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAddAnnotationToSchemaAccess().getAddAnnotKeyword_0());
              		
            }
            // InternalAedit.g:708:3: ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) )
            // InternalAedit.g:709:4: (lv_schemaType_1_0= ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:709:4: (lv_schemaType_1_0= ruleSCHEMA_TYPE )
            // InternalAedit.g:710:5: lv_schemaType_1_0= ruleSCHEMA_TYPE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddAnnotationToSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_schemaType_1_0=ruleSCHEMA_TYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAddAnnotationToSchemaRule());
              					}
              					set(
              						current,
              						"schemaType",
              						lv_schemaType_1_0,
              						"org.aedit.Aedit.SCHEMA_TYPE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAedit.g:727:3: ( ( ruleQN ) )
            // InternalAedit.g:728:4: ( ruleQN )
            {
            // InternalAedit.g:728:4: ( ruleQN )
            // InternalAedit.g:729:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAddAnnotationToSchemaRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddAnnotationToSchemaAccess().getSchemaTypeCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAddAnnotationToSchemaAccess().getEqualsSignGreaterThanSignKeyword_3());
              		
            }
            // InternalAedit.g:747:3: ( (lv_annotation_4_0= ruleAnnotation ) )
            // InternalAedit.g:748:4: (lv_annotation_4_0= ruleAnnotation )
            {
            // InternalAedit.g:748:4: (lv_annotation_4_0= ruleAnnotation )
            // InternalAedit.g:749:5: lv_annotation_4_0= ruleAnnotation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddAnnotationToSchemaAccess().getAnnotationAnnotationParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_annotation_4_0=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAddAnnotationToSchemaRule());
              					}
              					set(
              						current,
              						"annotation",
              						lv_annotation_4_0,
              						"org.aedit.Aedit.Annotation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAddAnnotationToSchemaAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAddAnnotationToSchema"


    // $ANTLR start "entryRuleAddAnnotationToField"
    // InternalAedit.g:774:1: entryRuleAddAnnotationToField returns [EObject current=null] : iv_ruleAddAnnotationToField= ruleAddAnnotationToField EOF ;
    public final EObject entryRuleAddAnnotationToField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddAnnotationToField = null;


        try {
            // InternalAedit.g:774:61: (iv_ruleAddAnnotationToField= ruleAddAnnotationToField EOF )
            // InternalAedit.g:775:2: iv_ruleAddAnnotationToField= ruleAddAnnotationToField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddAnnotationToFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddAnnotationToField=ruleAddAnnotationToField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddAnnotationToField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddAnnotationToField"


    // $ANTLR start "ruleAddAnnotationToField"
    // InternalAedit.g:781:1: ruleAddAnnotationToField returns [EObject current=null] : (otherlv_0= 'add.annot' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_annotation_3_0= ruleAnnotation ) ) otherlv_4= ';' ) ;
    public final EObject ruleAddAnnotationToField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotation_3_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:787:2: ( (otherlv_0= 'add.annot' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_annotation_3_0= ruleAnnotation ) ) otherlv_4= ';' ) )
            // InternalAedit.g:788:2: (otherlv_0= 'add.annot' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_annotation_3_0= ruleAnnotation ) ) otherlv_4= ';' )
            {
            // InternalAedit.g:788:2: (otherlv_0= 'add.annot' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_annotation_3_0= ruleAnnotation ) ) otherlv_4= ';' )
            // InternalAedit.g:789:3: otherlv_0= 'add.annot' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_annotation_3_0= ruleAnnotation ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAddAnnotationToFieldAccess().getAddAnnotKeyword_0());
              		
            }
            // InternalAedit.g:793:3: ( ( ruleQN ) )
            // InternalAedit.g:794:4: ( ruleQN )
            {
            // InternalAedit.g:794:4: ( ruleQN )
            // InternalAedit.g:795:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAddAnnotationToFieldRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddAnnotationToFieldAccess().getVariableFieldCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAddAnnotationToFieldAccess().getEqualsSignGreaterThanSignKeyword_2());
              		
            }
            // InternalAedit.g:813:3: ( (lv_annotation_3_0= ruleAnnotation ) )
            // InternalAedit.g:814:4: (lv_annotation_3_0= ruleAnnotation )
            {
            // InternalAedit.g:814:4: (lv_annotation_3_0= ruleAnnotation )
            // InternalAedit.g:815:5: lv_annotation_3_0= ruleAnnotation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddAnnotationToFieldAccess().getAnnotationAnnotationParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_annotation_3_0=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAddAnnotationToFieldRule());
              					}
              					set(
              						current,
              						"annotation",
              						lv_annotation_3_0,
              						"org.aedit.Aedit.Annotation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAddAnnotationToFieldAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAddAnnotationToField"


    // $ANTLR start "entryRuleAddNameAnnotationToField"
    // InternalAedit.g:840:1: entryRuleAddNameAnnotationToField returns [EObject current=null] : iv_ruleAddNameAnnotationToField= ruleAddNameAnnotationToField EOF ;
    public final EObject entryRuleAddNameAnnotationToField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddNameAnnotationToField = null;


        try {
            // InternalAedit.g:840:65: (iv_ruleAddNameAnnotationToField= ruleAddNameAnnotationToField EOF )
            // InternalAedit.g:841:2: iv_ruleAddNameAnnotationToField= ruleAddNameAnnotationToField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddNameAnnotationToFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddNameAnnotationToField=ruleAddNameAnnotationToField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddNameAnnotationToField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddNameAnnotationToField"


    // $ANTLR start "ruleAddNameAnnotationToField"
    // InternalAedit.g:847:1: ruleAddNameAnnotationToField returns [EObject current=null] : (otherlv_0= 'add.name_annot' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_annotation_3_0= ruleAnnotation ) ) otherlv_4= ';' ) ;
    public final EObject ruleAddNameAnnotationToField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_annotation_3_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:853:2: ( (otherlv_0= 'add.name_annot' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_annotation_3_0= ruleAnnotation ) ) otherlv_4= ';' ) )
            // InternalAedit.g:854:2: (otherlv_0= 'add.name_annot' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_annotation_3_0= ruleAnnotation ) ) otherlv_4= ';' )
            {
            // InternalAedit.g:854:2: (otherlv_0= 'add.name_annot' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_annotation_3_0= ruleAnnotation ) ) otherlv_4= ';' )
            // InternalAedit.g:855:3: otherlv_0= 'add.name_annot' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_annotation_3_0= ruleAnnotation ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAddNameAnnotationToFieldAccess().getAddName_annotKeyword_0());
              		
            }
            // InternalAedit.g:859:3: ( ( ruleQN ) )
            // InternalAedit.g:860:4: ( ruleQN )
            {
            // InternalAedit.g:860:4: ( ruleQN )
            // InternalAedit.g:861:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAddNameAnnotationToFieldRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddNameAnnotationToFieldAccess().getVariableFieldCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAddNameAnnotationToFieldAccess().getEqualsSignGreaterThanSignKeyword_2());
              		
            }
            // InternalAedit.g:879:3: ( (lv_annotation_3_0= ruleAnnotation ) )
            // InternalAedit.g:880:4: (lv_annotation_3_0= ruleAnnotation )
            {
            // InternalAedit.g:880:4: (lv_annotation_3_0= ruleAnnotation )
            // InternalAedit.g:881:5: lv_annotation_3_0= ruleAnnotation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddNameAnnotationToFieldAccess().getAnnotationAnnotationParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_annotation_3_0=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAddNameAnnotationToFieldRule());
              					}
              					set(
              						current,
              						"annotation",
              						lv_annotation_3_0,
              						"org.aedit.Aedit.Annotation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAddNameAnnotationToFieldAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAddNameAnnotationToField"


    // $ANTLR start "entryRuleRemoveAnnotationFromSchema"
    // InternalAedit.g:906:1: entryRuleRemoveAnnotationFromSchema returns [EObject current=null] : iv_ruleRemoveAnnotationFromSchema= ruleRemoveAnnotationFromSchema EOF ;
    public final EObject entryRuleRemoveAnnotationFromSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveAnnotationFromSchema = null;


        try {
            // InternalAedit.g:906:67: (iv_ruleRemoveAnnotationFromSchema= ruleRemoveAnnotationFromSchema EOF )
            // InternalAedit.g:907:2: iv_ruleRemoveAnnotationFromSchema= ruleRemoveAnnotationFromSchema EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRemoveAnnotationFromSchemaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRemoveAnnotationFromSchema=ruleRemoveAnnotationFromSchema();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRemoveAnnotationFromSchema; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRemoveAnnotationFromSchema"


    // $ANTLR start "ruleRemoveAnnotationFromSchema"
    // InternalAedit.g:913:1: ruleRemoveAnnotationFromSchema returns [EObject current=null] : (otherlv_0= 'remove.annot' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject ruleRemoveAnnotationFromSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_schemaType_1_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:919:2: ( (otherlv_0= 'remove.annot' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalAedit.g:920:2: (otherlv_0= 'remove.annot' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalAedit.g:920:2: (otherlv_0= 'remove.annot' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalAedit.g:921:3: otherlv_0= 'remove.annot' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRemoveAnnotationFromSchemaAccess().getRemoveAnnotKeyword_0());
              		
            }
            // InternalAedit.g:925:3: ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) )
            // InternalAedit.g:926:4: (lv_schemaType_1_0= ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:926:4: (lv_schemaType_1_0= ruleSCHEMA_TYPE )
            // InternalAedit.g:927:5: lv_schemaType_1_0= ruleSCHEMA_TYPE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRemoveAnnotationFromSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_schemaType_1_0=ruleSCHEMA_TYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRemoveAnnotationFromSchemaRule());
              					}
              					set(
              						current,
              						"schemaType",
              						lv_schemaType_1_0,
              						"org.aedit.Aedit.SCHEMA_TYPE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAedit.g:944:3: ( ( ruleQN ) )
            // InternalAedit.g:945:4: ( ruleQN )
            {
            // InternalAedit.g:945:4: ( ruleQN )
            // InternalAedit.g:946:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRemoveAnnotationFromSchemaRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRemoveAnnotationFromSchemaAccess().getSchemaTypeCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRemoveAnnotationFromSchemaAccess().getEqualsSignGreaterThanSignKeyword_3());
              		
            }
            // InternalAedit.g:964:3: ( ( ruleQN ) )
            // InternalAedit.g:965:4: ( ruleQN )
            {
            // InternalAedit.g:965:4: ( ruleQN )
            // InternalAedit.g:966:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRemoveAnnotationFromSchemaRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRemoveAnnotationFromSchemaAccess().getAnnotationToRemoveAnnotationCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_11);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRemoveAnnotationFromSchemaAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRemoveAnnotationFromSchema"


    // $ANTLR start "entryRuleRemoveAnnotationFromField"
    // InternalAedit.g:988:1: entryRuleRemoveAnnotationFromField returns [EObject current=null] : iv_ruleRemoveAnnotationFromField= ruleRemoveAnnotationFromField EOF ;
    public final EObject entryRuleRemoveAnnotationFromField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveAnnotationFromField = null;


        try {
            // InternalAedit.g:988:66: (iv_ruleRemoveAnnotationFromField= ruleRemoveAnnotationFromField EOF )
            // InternalAedit.g:989:2: iv_ruleRemoveAnnotationFromField= ruleRemoveAnnotationFromField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRemoveAnnotationFromFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRemoveAnnotationFromField=ruleRemoveAnnotationFromField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRemoveAnnotationFromField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRemoveAnnotationFromField"


    // $ANTLR start "ruleRemoveAnnotationFromField"
    // InternalAedit.g:995:1: ruleRemoveAnnotationFromField returns [EObject current=null] : (otherlv_0= 'remove.annot' ( ( ruleQN ) ) otherlv_2= '=>' ( ( ruleQN ) ) otherlv_4= ';' ) ;
    public final EObject ruleRemoveAnnotationFromField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAedit.g:1001:2: ( (otherlv_0= 'remove.annot' ( ( ruleQN ) ) otherlv_2= '=>' ( ( ruleQN ) ) otherlv_4= ';' ) )
            // InternalAedit.g:1002:2: (otherlv_0= 'remove.annot' ( ( ruleQN ) ) otherlv_2= '=>' ( ( ruleQN ) ) otherlv_4= ';' )
            {
            // InternalAedit.g:1002:2: (otherlv_0= 'remove.annot' ( ( ruleQN ) ) otherlv_2= '=>' ( ( ruleQN ) ) otherlv_4= ';' )
            // InternalAedit.g:1003:3: otherlv_0= 'remove.annot' ( ( ruleQN ) ) otherlv_2= '=>' ( ( ruleQN ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRemoveAnnotationFromFieldAccess().getRemoveAnnotKeyword_0());
              		
            }
            // InternalAedit.g:1007:3: ( ( ruleQN ) )
            // InternalAedit.g:1008:4: ( ruleQN )
            {
            // InternalAedit.g:1008:4: ( ruleQN )
            // InternalAedit.g:1009:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRemoveAnnotationFromFieldRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRemoveAnnotationFromFieldAccess().getVariableFieldCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRemoveAnnotationFromFieldAccess().getEqualsSignGreaterThanSignKeyword_2());
              		
            }
            // InternalAedit.g:1027:3: ( ( ruleQN ) )
            // InternalAedit.g:1028:4: ( ruleQN )
            {
            // InternalAedit.g:1028:4: ( ruleQN )
            // InternalAedit.g:1029:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRemoveAnnotationFromFieldRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRemoveAnnotationFromFieldAccess().getAnnotationToRemoveAnnotationCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRemoveAnnotationFromFieldAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRemoveAnnotationFromField"


    // $ANTLR start "entryRuleRemoveNameAnnotationFromField"
    // InternalAedit.g:1051:1: entryRuleRemoveNameAnnotationFromField returns [EObject current=null] : iv_ruleRemoveNameAnnotationFromField= ruleRemoveNameAnnotationFromField EOF ;
    public final EObject entryRuleRemoveNameAnnotationFromField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveNameAnnotationFromField = null;


        try {
            // InternalAedit.g:1051:70: (iv_ruleRemoveNameAnnotationFromField= ruleRemoveNameAnnotationFromField EOF )
            // InternalAedit.g:1052:2: iv_ruleRemoveNameAnnotationFromField= ruleRemoveNameAnnotationFromField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRemoveNameAnnotationFromFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRemoveNameAnnotationFromField=ruleRemoveNameAnnotationFromField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRemoveNameAnnotationFromField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRemoveNameAnnotationFromField"


    // $ANTLR start "ruleRemoveNameAnnotationFromField"
    // InternalAedit.g:1058:1: ruleRemoveNameAnnotationFromField returns [EObject current=null] : (otherlv_0= 'remove.name_annot' ( ( ruleQN ) ) otherlv_2= '=>' ( ( ruleQN ) ) otherlv_4= ';' ) ;
    public final EObject ruleRemoveNameAnnotationFromField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAedit.g:1064:2: ( (otherlv_0= 'remove.name_annot' ( ( ruleQN ) ) otherlv_2= '=>' ( ( ruleQN ) ) otherlv_4= ';' ) )
            // InternalAedit.g:1065:2: (otherlv_0= 'remove.name_annot' ( ( ruleQN ) ) otherlv_2= '=>' ( ( ruleQN ) ) otherlv_4= ';' )
            {
            // InternalAedit.g:1065:2: (otherlv_0= 'remove.name_annot' ( ( ruleQN ) ) otherlv_2= '=>' ( ( ruleQN ) ) otherlv_4= ';' )
            // InternalAedit.g:1066:3: otherlv_0= 'remove.name_annot' ( ( ruleQN ) ) otherlv_2= '=>' ( ( ruleQN ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRemoveNameAnnotationFromFieldAccess().getRemoveName_annotKeyword_0());
              		
            }
            // InternalAedit.g:1070:3: ( ( ruleQN ) )
            // InternalAedit.g:1071:4: ( ruleQN )
            {
            // InternalAedit.g:1071:4: ( ruleQN )
            // InternalAedit.g:1072:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRemoveNameAnnotationFromFieldRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getVariableFieldCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRemoveNameAnnotationFromFieldAccess().getEqualsSignGreaterThanSignKeyword_2());
              		
            }
            // InternalAedit.g:1090:3: ( ( ruleQN ) )
            // InternalAedit.g:1091:4: ( ruleQN )
            {
            // InternalAedit.g:1091:4: ( ruleQN )
            // InternalAedit.g:1092:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRemoveNameAnnotationFromFieldRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getAnnotationToRemoveAnnotationCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRemoveNameAnnotationFromFieldAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRemoveNameAnnotationFromField"


    // $ANTLR start "entryRuleChangeSchema"
    // InternalAedit.g:1114:1: entryRuleChangeSchema returns [EObject current=null] : iv_ruleChangeSchema= ruleChangeSchema EOF ;
    public final EObject entryRuleChangeSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeSchema = null;


        try {
            // InternalAedit.g:1114:53: (iv_ruleChangeSchema= ruleChangeSchema EOF )
            // InternalAedit.g:1115:2: iv_ruleChangeSchema= ruleChangeSchema EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChangeSchemaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChangeSchema=ruleChangeSchema();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChangeSchema; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:1121:1: ruleChangeSchema returns [EObject current=null] : (otherlv_0= 'change' ( ( (lv_schemaType_1_1= 'record' | lv_schemaType_1_2= 'error' ) ) ) ( ( ruleQN ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleSchemaRule ) )* otherlv_5= '}' ) ;
    public final EObject ruleChangeSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_schemaType_1_1=null;
        Token lv_schemaType_1_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_rules_4_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:1127:2: ( (otherlv_0= 'change' ( ( (lv_schemaType_1_1= 'record' | lv_schemaType_1_2= 'error' ) ) ) ( ( ruleQN ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleSchemaRule ) )* otherlv_5= '}' ) )
            // InternalAedit.g:1128:2: (otherlv_0= 'change' ( ( (lv_schemaType_1_1= 'record' | lv_schemaType_1_2= 'error' ) ) ) ( ( ruleQN ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleSchemaRule ) )* otherlv_5= '}' )
            {
            // InternalAedit.g:1128:2: (otherlv_0= 'change' ( ( (lv_schemaType_1_1= 'record' | lv_schemaType_1_2= 'error' ) ) ) ( ( ruleQN ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleSchemaRule ) )* otherlv_5= '}' )
            // InternalAedit.g:1129:3: otherlv_0= 'change' ( ( (lv_schemaType_1_1= 'record' | lv_schemaType_1_2= 'error' ) ) ) ( ( ruleQN ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleSchemaRule ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getChangeSchemaAccess().getChangeKeyword_0());
              		
            }
            // InternalAedit.g:1133:3: ( ( (lv_schemaType_1_1= 'record' | lv_schemaType_1_2= 'error' ) ) )
            // InternalAedit.g:1134:4: ( (lv_schemaType_1_1= 'record' | lv_schemaType_1_2= 'error' ) )
            {
            // InternalAedit.g:1134:4: ( (lv_schemaType_1_1= 'record' | lv_schemaType_1_2= 'error' ) )
            // InternalAedit.g:1135:5: (lv_schemaType_1_1= 'record' | lv_schemaType_1_2= 'error' )
            {
            // InternalAedit.g:1135:5: (lv_schemaType_1_1= 'record' | lv_schemaType_1_2= 'error' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            else if ( (LA13_0==26) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalAedit.g:1136:6: lv_schemaType_1_1= 'record'
                    {
                    lv_schemaType_1_1=(Token)match(input,25,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_schemaType_1_1, grammarAccess.getChangeSchemaAccess().getSchemaTypeRecordKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getChangeSchemaRule());
                      						}
                      						setWithLastConsumed(current, "schemaType", lv_schemaType_1_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalAedit.g:1147:6: lv_schemaType_1_2= 'error'
                    {
                    lv_schemaType_1_2=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_schemaType_1_2, grammarAccess.getChangeSchemaAccess().getSchemaTypeErrorKeyword_1_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getChangeSchemaRule());
                      						}
                      						setWithLastConsumed(current, "schemaType", lv_schemaType_1_2, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalAedit.g:1160:3: ( ( ruleQN ) )
            // InternalAedit.g:1161:4: ( ruleQN )
            {
            // InternalAedit.g:1161:4: ( ruleQN )
            // InternalAedit.g:1162:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getChangeSchemaRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChangeSchemaAccess().getSchemaTypeCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getChangeSchemaAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalAedit.g:1180:3: ( (lv_rules_4_0= ruleSchemaRule ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19||(LA14_0>=21 && LA14_0<=23)||LA14_0==28||(LA14_0>=33 && LA14_0<=39)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAedit.g:1181:4: (lv_rules_4_0= ruleSchemaRule )
            	    {
            	    // InternalAedit.g:1181:4: (lv_rules_4_0= ruleSchemaRule )
            	    // InternalAedit.g:1182:5: lv_rules_4_0= ruleSchemaRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getChangeSchemaAccess().getRulesSchemaRuleParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_rules_4_0=ruleSchemaRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getChangeSchemaRule());
            	      					}
            	      					add(
            	      						current,
            	      						"rules",
            	      						lv_rules_4_0,
            	      						"org.aedit.Aedit.SchemaRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getChangeSchemaAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleChangeSchema"


    // $ANTLR start "entryRuleChangeEnum"
    // InternalAedit.g:1207:1: entryRuleChangeEnum returns [EObject current=null] : iv_ruleChangeEnum= ruleChangeEnum EOF ;
    public final EObject entryRuleChangeEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeEnum = null;


        try {
            // InternalAedit.g:1207:51: (iv_ruleChangeEnum= ruleChangeEnum EOF )
            // InternalAedit.g:1208:2: iv_ruleChangeEnum= ruleChangeEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChangeEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChangeEnum=ruleChangeEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChangeEnum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:1214:1: ruleChangeEnum returns [EObject current=null] : (otherlv_0= 'change' otherlv_1= 'enum' ( ( ruleQN ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleEnumRule ) )* otherlv_5= '}' ) ;
    public final EObject ruleChangeEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_rules_4_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:1220:2: ( (otherlv_0= 'change' otherlv_1= 'enum' ( ( ruleQN ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleEnumRule ) )* otherlv_5= '}' ) )
            // InternalAedit.g:1221:2: (otherlv_0= 'change' otherlv_1= 'enum' ( ( ruleQN ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleEnumRule ) )* otherlv_5= '}' )
            {
            // InternalAedit.g:1221:2: (otherlv_0= 'change' otherlv_1= 'enum' ( ( ruleQN ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleEnumRule ) )* otherlv_5= '}' )
            // InternalAedit.g:1222:3: otherlv_0= 'change' otherlv_1= 'enum' ( ( ruleQN ) ) otherlv_3= '{' ( (lv_rules_4_0= ruleEnumRule ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getChangeEnumAccess().getChangeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,27,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getChangeEnumAccess().getEnumKeyword_1());
              		
            }
            // InternalAedit.g:1230:3: ( ( ruleQN ) )
            // InternalAedit.g:1231:4: ( ruleQN )
            {
            // InternalAedit.g:1231:4: ( ruleQN )
            // InternalAedit.g:1232:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getChangeEnumRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChangeEnumAccess().getSchemaEnumTypeCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_9);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getChangeEnumAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalAedit.g:1250:3: ( (lv_rules_4_0= ruleEnumRule ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28||(LA15_0>=33 && LA15_0<=34)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAedit.g:1251:4: (lv_rules_4_0= ruleEnumRule )
            	    {
            	    // InternalAedit.g:1251:4: (lv_rules_4_0= ruleEnumRule )
            	    // InternalAedit.g:1252:5: lv_rules_4_0= ruleEnumRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getChangeEnumAccess().getRulesEnumRuleParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_rules_4_0=ruleEnumRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getChangeEnumAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleChangeEnum"


    // $ANTLR start "entryRuleAdd"
    // InternalAedit.g:1277:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalAedit.g:1277:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalAedit.g:1278:2: iv_ruleAdd= ruleAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:1284:1: ruleAdd returns [EObject current=null] : (this_AddRecord_0= ruleAddRecord | this_AddError_1= ruleAddError | this_AddEnumeration_2= ruleAddEnumeration ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        EObject this_AddRecord_0 = null;

        EObject this_AddError_1 = null;

        EObject this_AddEnumeration_2 = null;



        	enterRule();

        try {
            // InternalAedit.g:1290:2: ( (this_AddRecord_0= ruleAddRecord | this_AddError_1= ruleAddError | this_AddEnumeration_2= ruleAddEnumeration ) )
            // InternalAedit.g:1291:2: (this_AddRecord_0= ruleAddRecord | this_AddError_1= ruleAddError | this_AddEnumeration_2= ruleAddEnumeration )
            {
            // InternalAedit.g:1291:2: (this_AddRecord_0= ruleAddRecord | this_AddError_1= ruleAddError | this_AddEnumeration_2= ruleAddEnumeration )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==29) ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2==RULE_INT) ) {
                        int LA16_3 = input.LA(4);

                        if ( (LA16_3==30) ) {
                            switch ( input.LA(5) ) {
                            case 25:
                                {
                                alt16=1;
                                }
                                break;
                            case 26:
                                {
                                alt16=2;
                                }
                                break;
                            case 27:
                                {
                                alt16=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 16, 4, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAedit.g:1292:3: this_AddRecord_0= ruleAddRecord
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAddAccess().getAddRecordParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AddRecord_0=ruleAddRecord();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AddRecord_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAedit.g:1301:3: this_AddError_1= ruleAddError
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAddAccess().getAddErrorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AddError_1=ruleAddError();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AddError_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAedit.g:1310:3: this_AddEnumeration_2= ruleAddEnumeration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAddAccess().getAddEnumerationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AddEnumeration_2=ruleAddEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AddEnumeration_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleAddRecord"
    // InternalAedit.g:1322:1: entryRuleAddRecord returns [EObject current=null] : iv_ruleAddRecord= ruleAddRecord EOF ;
    public final EObject entryRuleAddRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddRecord = null;


        try {
            // InternalAedit.g:1322:50: (iv_ruleAddRecord= ruleAddRecord EOF )
            // InternalAedit.g:1323:2: iv_ruleAddRecord= ruleAddRecord EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddRecordRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddRecord=ruleAddRecord();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddRecord; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:1329:1: ruleAddRecord returns [EObject current=null] : (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'record' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_recordName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}' ) ;
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
            // InternalAedit.g:1335:2: ( (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'record' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_recordName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}' ) )
            // InternalAedit.g:1336:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'record' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_recordName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}' )
            {
            // InternalAedit.g:1336:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'record' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_recordName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}' )
            // InternalAedit.g:1337:3: otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'record' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_recordName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAddRecordAccess().getAddAtKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAddRecordAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAedit.g:1345:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalAedit.g:1346:4: (lv_index_2_0= RULE_INT )
            {
            // InternalAedit.g:1346:4: (lv_index_2_0= RULE_INT )
            // InternalAedit.g:1347:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_index_2_0, grammarAccess.getAddRecordAccess().getIndexINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,30,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAddRecordAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,25,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAddRecordAccess().getRecordKeyword_4());
              		
            }
            // InternalAedit.g:1371:3: ( (otherlv_5= RULE_ID ) )
            // InternalAedit.g:1372:4: (otherlv_5= RULE_ID )
            {
            // InternalAedit.g:1372:4: (otherlv_5= RULE_ID )
            // InternalAedit.g:1373:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAddRecordRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getAddRecordAccess().getNamespaceAvroIDLFileCrossReference_5_0());
              				
            }

            }


            }

            otherlv_6=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getAddRecordAccess().getFullStopKeyword_6());
              		
            }
            // InternalAedit.g:1388:3: ( (lv_recordName_7_0= RULE_ID ) )
            // InternalAedit.g:1389:4: (lv_recordName_7_0= RULE_ID )
            {
            // InternalAedit.g:1389:4: (lv_recordName_7_0= RULE_ID )
            // InternalAedit.g:1390:5: lv_recordName_7_0= RULE_ID
            {
            lv_recordName_7_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_recordName_7_0, grammarAccess.getAddRecordAccess().getRecordNameIDTerminalRuleCall_7_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_8=(Token)match(input,13,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getAddRecordAccess().getLeftCurlyBracketKeyword_8());
              		
            }
            // InternalAedit.g:1410:3: ( (lv_fields_9_0= ruleField ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==41||(LA17_0>=50 && LA17_0<=56)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAedit.g:1411:4: (lv_fields_9_0= ruleField )
            	    {
            	    // InternalAedit.g:1411:4: (lv_fields_9_0= ruleField )
            	    // InternalAedit.g:1412:5: lv_fields_9_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAddRecordAccess().getFieldsFieldParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_fields_9_0=ruleField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getAddRecordAccess().getRightCurlyBracketKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAddRecord"


    // $ANTLR start "entryRuleAddError"
    // InternalAedit.g:1437:1: entryRuleAddError returns [EObject current=null] : iv_ruleAddError= ruleAddError EOF ;
    public final EObject entryRuleAddError() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddError = null;


        try {
            // InternalAedit.g:1437:49: (iv_ruleAddError= ruleAddError EOF )
            // InternalAedit.g:1438:2: iv_ruleAddError= ruleAddError EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddErrorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddError=ruleAddError();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddError; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddError"


    // $ANTLR start "ruleAddError"
    // InternalAedit.g:1444:1: ruleAddError returns [EObject current=null] : (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'error' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_errorName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}' ) ;
    public final EObject ruleAddError() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_errorName_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_fields_9_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:1450:2: ( (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'error' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_errorName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}' ) )
            // InternalAedit.g:1451:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'error' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_errorName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}' )
            {
            // InternalAedit.g:1451:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'error' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_errorName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}' )
            // InternalAedit.g:1452:3: otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'error' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_errorName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_fields_9_0= ruleField ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAddErrorAccess().getAddAtKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAddErrorAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAedit.g:1460:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalAedit.g:1461:4: (lv_index_2_0= RULE_INT )
            {
            // InternalAedit.g:1461:4: (lv_index_2_0= RULE_INT )
            // InternalAedit.g:1462:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_index_2_0, grammarAccess.getAddErrorAccess().getIndexINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAddErrorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"index",
              						lv_index_2_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAddErrorAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAddErrorAccess().getErrorKeyword_4());
              		
            }
            // InternalAedit.g:1486:3: ( (otherlv_5= RULE_ID ) )
            // InternalAedit.g:1487:4: (otherlv_5= RULE_ID )
            {
            // InternalAedit.g:1487:4: (otherlv_5= RULE_ID )
            // InternalAedit.g:1488:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAddErrorRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getAddErrorAccess().getNamespaceAvroIDLFileCrossReference_5_0());
              				
            }

            }


            }

            otherlv_6=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getAddErrorAccess().getFullStopKeyword_6());
              		
            }
            // InternalAedit.g:1503:3: ( (lv_errorName_7_0= RULE_ID ) )
            // InternalAedit.g:1504:4: (lv_errorName_7_0= RULE_ID )
            {
            // InternalAedit.g:1504:4: (lv_errorName_7_0= RULE_ID )
            // InternalAedit.g:1505:5: lv_errorName_7_0= RULE_ID
            {
            lv_errorName_7_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_errorName_7_0, grammarAccess.getAddErrorAccess().getErrorNameIDTerminalRuleCall_7_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAddErrorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"errorName",
              						lv_errorName_7_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getAddErrorAccess().getLeftCurlyBracketKeyword_8());
              		
            }
            // InternalAedit.g:1525:3: ( (lv_fields_9_0= ruleField ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==41||(LA18_0>=50 && LA18_0<=56)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAedit.g:1526:4: (lv_fields_9_0= ruleField )
            	    {
            	    // InternalAedit.g:1526:4: (lv_fields_9_0= ruleField )
            	    // InternalAedit.g:1527:5: lv_fields_9_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAddErrorAccess().getFieldsFieldParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_fields_9_0=ruleField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAddErrorRule());
            	      					}
            	      					add(
            	      						current,
            	      						"fields",
            	      						lv_fields_9_0,
            	      						"org.aedit.Aedit.Field");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getAddErrorAccess().getRightCurlyBracketKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAddError"


    // $ANTLR start "entryRuleAddEnumeration"
    // InternalAedit.g:1552:1: entryRuleAddEnumeration returns [EObject current=null] : iv_ruleAddEnumeration= ruleAddEnumeration EOF ;
    public final EObject entryRuleAddEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddEnumeration = null;


        try {
            // InternalAedit.g:1552:55: (iv_ruleAddEnumeration= ruleAddEnumeration EOF )
            // InternalAedit.g:1553:2: iv_ruleAddEnumeration= ruleAddEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddEnumerationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddEnumeration=ruleAddEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddEnumeration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:1559:1: ruleAddEnumeration returns [EObject current=null] : (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'enum' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_enumName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_symbols_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_symbols_11_0= RULE_ID ) ) )* otherlv_12= '}' ) ;
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
        Token lv_symbols_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalAedit.g:1565:2: ( (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'enum' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_enumName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_symbols_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_symbols_11_0= RULE_ID ) ) )* otherlv_12= '}' ) )
            // InternalAedit.g:1566:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'enum' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_enumName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_symbols_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_symbols_11_0= RULE_ID ) ) )* otherlv_12= '}' )
            {
            // InternalAedit.g:1566:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'enum' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_enumName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_symbols_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_symbols_11_0= RULE_ID ) ) )* otherlv_12= '}' )
            // InternalAedit.g:1567:3: otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' otherlv_4= 'enum' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (lv_enumName_7_0= RULE_ID ) ) otherlv_8= '{' ( (lv_symbols_9_0= RULE_ID ) ) (otherlv_10= ',' ( (lv_symbols_11_0= RULE_ID ) ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAddEnumerationAccess().getAddAtKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAddEnumerationAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAedit.g:1575:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalAedit.g:1576:4: (lv_index_2_0= RULE_INT )
            {
            // InternalAedit.g:1576:4: (lv_index_2_0= RULE_INT )
            // InternalAedit.g:1577:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_index_2_0, grammarAccess.getAddEnumerationAccess().getIndexINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,30,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAddEnumerationAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,27,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAddEnumerationAccess().getEnumKeyword_4());
              		
            }
            // InternalAedit.g:1601:3: ( (otherlv_5= RULE_ID ) )
            // InternalAedit.g:1602:4: (otherlv_5= RULE_ID )
            {
            // InternalAedit.g:1602:4: (otherlv_5= RULE_ID )
            // InternalAedit.g:1603:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAddEnumerationRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getAddEnumerationAccess().getNamespaceAvroIDLFileCrossReference_5_0());
              				
            }

            }


            }

            otherlv_6=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getAddEnumerationAccess().getFullStopKeyword_6());
              		
            }
            // InternalAedit.g:1618:3: ( (lv_enumName_7_0= RULE_ID ) )
            // InternalAedit.g:1619:4: (lv_enumName_7_0= RULE_ID )
            {
            // InternalAedit.g:1619:4: (lv_enumName_7_0= RULE_ID )
            // InternalAedit.g:1620:5: lv_enumName_7_0= RULE_ID
            {
            lv_enumName_7_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_enumName_7_0, grammarAccess.getAddEnumerationAccess().getEnumNameIDTerminalRuleCall_7_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_8=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getAddEnumerationAccess().getLeftCurlyBracketKeyword_8());
              		
            }
            // InternalAedit.g:1640:3: ( (lv_symbols_9_0= RULE_ID ) )
            // InternalAedit.g:1641:4: (lv_symbols_9_0= RULE_ID )
            {
            // InternalAedit.g:1641:4: (lv_symbols_9_0= RULE_ID )
            // InternalAedit.g:1642:5: lv_symbols_9_0= RULE_ID
            {
            lv_symbols_9_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_symbols_9_0, grammarAccess.getAddEnumerationAccess().getSymbolsIDTerminalRuleCall_9_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalAedit.g:1658:3: (otherlv_10= ',' ( (lv_symbols_11_0= RULE_ID ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==32) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAedit.g:1659:4: otherlv_10= ',' ( (lv_symbols_11_0= RULE_ID ) )
            	    {
            	    otherlv_10=(Token)match(input,32,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_10, grammarAccess.getAddEnumerationAccess().getCommaKeyword_10_0());
            	      			
            	    }
            	    // InternalAedit.g:1663:4: ( (lv_symbols_11_0= RULE_ID ) )
            	    // InternalAedit.g:1664:5: (lv_symbols_11_0= RULE_ID )
            	    {
            	    // InternalAedit.g:1664:5: (lv_symbols_11_0= RULE_ID )
            	    // InternalAedit.g:1665:6: lv_symbols_11_0= RULE_ID
            	    {
            	    lv_symbols_11_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_symbols_11_0, grammarAccess.getAddEnumerationAccess().getSymbolsIDTerminalRuleCall_10_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getAddEnumerationRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"symbols",
            	      							lv_symbols_11_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_12=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getAddEnumerationAccess().getRightCurlyBracketKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAddEnumeration"


    // $ANTLR start "entryRuleAddVariable"
    // InternalAedit.g:1690:1: entryRuleAddVariable returns [EObject current=null] : iv_ruleAddVariable= ruleAddVariable EOF ;
    public final EObject entryRuleAddVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddVariable = null;


        try {
            // InternalAedit.g:1690:52: (iv_ruleAddVariable= ruleAddVariable EOF )
            // InternalAedit.g:1691:2: iv_ruleAddVariable= ruleAddVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddVariable=ruleAddVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:1697:1: ruleAddVariable returns [EObject current=null] : (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_newVar_4_0= ruleField ) ) otherlv_5= ';' ) ;
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
            // InternalAedit.g:1703:2: ( (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_newVar_4_0= ruleField ) ) otherlv_5= ';' ) )
            // InternalAedit.g:1704:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_newVar_4_0= ruleField ) ) otherlv_5= ';' )
            {
            // InternalAedit.g:1704:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_newVar_4_0= ruleField ) ) otherlv_5= ';' )
            // InternalAedit.g:1705:3: otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_newVar_4_0= ruleField ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAddVariableAccess().getAddAtKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAddVariableAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAedit.g:1713:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalAedit.g:1714:4: (lv_index_2_0= RULE_INT )
            {
            // InternalAedit.g:1714:4: (lv_index_2_0= RULE_INT )
            // InternalAedit.g:1715:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_index_2_0, grammarAccess.getAddVariableAccess().getIndexINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,30,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAddVariableAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalAedit.g:1735:3: ( (lv_newVar_4_0= ruleField ) )
            // InternalAedit.g:1736:4: (lv_newVar_4_0= ruleField )
            {
            // InternalAedit.g:1736:4: (lv_newVar_4_0= ruleField )
            // InternalAedit.g:1737:5: lv_newVar_4_0= ruleField
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddVariableAccess().getNewVarFieldParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_newVar_4_0=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAddVariableAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAddVariable"


    // $ANTLR start "entryRuleAddEnum"
    // InternalAedit.g:1762:1: entryRuleAddEnum returns [EObject current=null] : iv_ruleAddEnum= ruleAddEnum EOF ;
    public final EObject entryRuleAddEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddEnum = null;


        try {
            // InternalAedit.g:1762:48: (iv_ruleAddEnum= ruleAddEnum EOF )
            // InternalAedit.g:1763:2: iv_ruleAddEnum= ruleAddEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddEnum=ruleAddEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddEnum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:1769:1: ruleAddEnum returns [EObject current=null] : (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_varName_4_0= RULE_ID ) ) otherlv_5= ';' ) ;
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
            // InternalAedit.g:1775:2: ( (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_varName_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalAedit.g:1776:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_varName_4_0= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalAedit.g:1776:2: (otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_varName_4_0= RULE_ID ) ) otherlv_5= ';' )
            // InternalAedit.g:1777:3: otherlv_0= 'add.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( (lv_varName_4_0= RULE_ID ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAddEnumAccess().getAddAtKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAddEnumAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAedit.g:1785:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalAedit.g:1786:4: (lv_index_2_0= RULE_INT )
            {
            // InternalAedit.g:1786:4: (lv_index_2_0= RULE_INT )
            // InternalAedit.g:1787:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_index_2_0, grammarAccess.getAddEnumAccess().getIndexINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,30,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAddEnumAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalAedit.g:1807:3: ( (lv_varName_4_0= RULE_ID ) )
            // InternalAedit.g:1808:4: (lv_varName_4_0= RULE_ID )
            {
            // InternalAedit.g:1808:4: (lv_varName_4_0= RULE_ID )
            // InternalAedit.g:1809:5: lv_varName_4_0= RULE_ID
            {
            lv_varName_4_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_varName_4_0, grammarAccess.getAddEnumAccess().getVarNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAddEnumAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAddEnum"


    // $ANTLR start "entryRuleRemoveSchema"
    // InternalAedit.g:1833:1: entryRuleRemoveSchema returns [EObject current=null] : iv_ruleRemoveSchema= ruleRemoveSchema EOF ;
    public final EObject entryRuleRemoveSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveSchema = null;


        try {
            // InternalAedit.g:1833:53: (iv_ruleRemoveSchema= ruleRemoveSchema EOF )
            // InternalAedit.g:1834:2: iv_ruleRemoveSchema= ruleRemoveSchema EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRemoveSchemaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRemoveSchema=ruleRemoveSchema();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRemoveSchema; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:1840:1: ruleRemoveSchema returns [EObject current=null] : (otherlv_0= 'remove' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= ';' ) ;
    public final EObject ruleRemoveSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_schemaType_1_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:1846:2: ( (otherlv_0= 'remove' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= ';' ) )
            // InternalAedit.g:1847:2: (otherlv_0= 'remove' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= ';' )
            {
            // InternalAedit.g:1847:2: (otherlv_0= 'remove' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= ';' )
            // InternalAedit.g:1848:3: otherlv_0= 'remove' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRemoveSchemaAccess().getRemoveKeyword_0());
              		
            }
            // InternalAedit.g:1852:3: ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) )
            // InternalAedit.g:1853:4: (lv_schemaType_1_0= ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:1853:4: (lv_schemaType_1_0= ruleSCHEMA_TYPE )
            // InternalAedit.g:1854:5: lv_schemaType_1_0= ruleSCHEMA_TYPE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRemoveSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_schemaType_1_0=ruleSCHEMA_TYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalAedit.g:1871:3: ( ( ruleQN ) )
            // InternalAedit.g:1872:4: ( ruleQN )
            {
            // InternalAedit.g:1872:4: ( ruleQN )
            // InternalAedit.g:1873:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRemoveSchemaRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRemoveSchemaAccess().getSchemaTypeCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRemoveSchemaAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRemoveSchema"


    // $ANTLR start "entryRuleRemoveVariable"
    // InternalAedit.g:1895:1: entryRuleRemoveVariable returns [EObject current=null] : iv_ruleRemoveVariable= ruleRemoveVariable EOF ;
    public final EObject entryRuleRemoveVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveVariable = null;


        try {
            // InternalAedit.g:1895:55: (iv_ruleRemoveVariable= ruleRemoveVariable EOF )
            // InternalAedit.g:1896:2: iv_ruleRemoveVariable= ruleRemoveVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRemoveVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRemoveVariable=ruleRemoveVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRemoveVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:1902:1: ruleRemoveVariable returns [EObject current=null] : (otherlv_0= 'remove' ( ( ruleQN ) ) otherlv_2= ';' ) ;
    public final EObject ruleRemoveVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalAedit.g:1908:2: ( (otherlv_0= 'remove' ( ( ruleQN ) ) otherlv_2= ';' ) )
            // InternalAedit.g:1909:2: (otherlv_0= 'remove' ( ( ruleQN ) ) otherlv_2= ';' )
            {
            // InternalAedit.g:1909:2: (otherlv_0= 'remove' ( ( ruleQN ) ) otherlv_2= ';' )
            // InternalAedit.g:1910:3: otherlv_0= 'remove' ( ( ruleQN ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRemoveVariableAccess().getRemoveKeyword_0());
              		
            }
            // InternalAedit.g:1914:3: ( ( ruleQN ) )
            // InternalAedit.g:1915:4: ( ruleQN )
            {
            // InternalAedit.g:1915:4: ( ruleQN )
            // InternalAedit.g:1916:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRemoveVariableRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRemoveVariableAccess().getVariableFieldCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_11);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRemoveVariableAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRemoveVariable"


    // $ANTLR start "entryRuleRemoveEnum"
    // InternalAedit.g:1938:1: entryRuleRemoveEnum returns [EObject current=null] : iv_ruleRemoveEnum= ruleRemoveEnum EOF ;
    public final EObject entryRuleRemoveEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveEnum = null;


        try {
            // InternalAedit.g:1938:51: (iv_ruleRemoveEnum= ruleRemoveEnum EOF )
            // InternalAedit.g:1939:2: iv_ruleRemoveEnum= ruleRemoveEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRemoveEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRemoveEnum=ruleRemoveEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRemoveEnum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:1945:1: ruleRemoveEnum returns [EObject current=null] : (otherlv_0= 'remove' ( (lv_varName_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleRemoveEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalAedit.g:1951:2: ( (otherlv_0= 'remove' ( (lv_varName_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalAedit.g:1952:2: (otherlv_0= 'remove' ( (lv_varName_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalAedit.g:1952:2: (otherlv_0= 'remove' ( (lv_varName_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalAedit.g:1953:3: otherlv_0= 'remove' ( (lv_varName_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRemoveEnumAccess().getRemoveKeyword_0());
              		
            }
            // InternalAedit.g:1957:3: ( (lv_varName_1_0= RULE_ID ) )
            // InternalAedit.g:1958:4: (lv_varName_1_0= RULE_ID )
            {
            // InternalAedit.g:1958:4: (lv_varName_1_0= RULE_ID )
            // InternalAedit.g:1959:5: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_varName_1_0, grammarAccess.getRemoveEnumAccess().getVarNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRemoveEnumAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRemoveEnum"


    // $ANTLR start "entryRuleRenameSchema"
    // InternalAedit.g:1983:1: entryRuleRenameSchema returns [EObject current=null] : iv_ruleRenameSchema= ruleRenameSchema EOF ;
    public final EObject entryRuleRenameSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameSchema = null;


        try {
            // InternalAedit.g:1983:53: (iv_ruleRenameSchema= ruleRenameSchema EOF )
            // InternalAedit.g:1984:2: iv_ruleRenameSchema= ruleRenameSchema EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRenameSchemaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRenameSchema=ruleRenameSchema();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRenameSchema; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:1990:1: ruleRenameSchema returns [EObject current=null] : (otherlv_0= 'rename' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( (lv_newSchName_4_0= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleRenameSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_newSchName_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_schemaType_1_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:1996:2: ( (otherlv_0= 'rename' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( (lv_newSchName_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalAedit.g:1997:2: (otherlv_0= 'rename' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( (lv_newSchName_4_0= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalAedit.g:1997:2: (otherlv_0= 'rename' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( (lv_newSchName_4_0= RULE_ID ) ) otherlv_5= ';' )
            // InternalAedit.g:1998:3: otherlv_0= 'rename' ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) ) ( ( ruleQN ) ) otherlv_3= '=>' ( (lv_newSchName_4_0= RULE_ID ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRenameSchemaAccess().getRenameKeyword_0());
              		
            }
            // InternalAedit.g:2002:3: ( (lv_schemaType_1_0= ruleSCHEMA_TYPE ) )
            // InternalAedit.g:2003:4: (lv_schemaType_1_0= ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:2003:4: (lv_schemaType_1_0= ruleSCHEMA_TYPE )
            // InternalAedit.g:2004:5: lv_schemaType_1_0= ruleSCHEMA_TYPE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRenameSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_schemaType_1_0=ruleSCHEMA_TYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalAedit.g:2021:3: ( ( ruleQN ) )
            // InternalAedit.g:2022:4: ( ruleQN )
            {
            // InternalAedit.g:2022:4: ( ruleQN )
            // InternalAedit.g:2023:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRenameSchemaRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRenameSchemaAccess().getSchemaTypeCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRenameSchemaAccess().getEqualsSignGreaterThanSignKeyword_3());
              		
            }
            // InternalAedit.g:2041:3: ( (lv_newSchName_4_0= RULE_ID ) )
            // InternalAedit.g:2042:4: (lv_newSchName_4_0= RULE_ID )
            {
            // InternalAedit.g:2042:4: (lv_newSchName_4_0= RULE_ID )
            // InternalAedit.g:2043:5: lv_newSchName_4_0= RULE_ID
            {
            lv_newSchName_4_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_newSchName_4_0, grammarAccess.getRenameSchemaAccess().getNewSchNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRenameSchemaAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRenameSchema"


    // $ANTLR start "entryRuleRenameVariable"
    // InternalAedit.g:2067:1: entryRuleRenameVariable returns [EObject current=null] : iv_ruleRenameVariable= ruleRenameVariable EOF ;
    public final EObject entryRuleRenameVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameVariable = null;


        try {
            // InternalAedit.g:2067:55: (iv_ruleRenameVariable= ruleRenameVariable EOF )
            // InternalAedit.g:2068:2: iv_ruleRenameVariable= ruleRenameVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRenameVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRenameVariable=ruleRenameVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRenameVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:2074:1: ruleRenameVariable returns [EObject current=null] : (otherlv_0= 'rename' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVarName_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleRenameVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_newVarName_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAedit.g:2080:2: ( (otherlv_0= 'rename' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVarName_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalAedit.g:2081:2: (otherlv_0= 'rename' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVarName_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalAedit.g:2081:2: (otherlv_0= 'rename' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVarName_3_0= RULE_ID ) ) otherlv_4= ';' )
            // InternalAedit.g:2082:3: otherlv_0= 'rename' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVarName_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRenameVariableAccess().getRenameKeyword_0());
              		
            }
            // InternalAedit.g:2086:3: ( ( ruleQN ) )
            // InternalAedit.g:2087:4: ( ruleQN )
            {
            // InternalAedit.g:2087:4: ( ruleQN )
            // InternalAedit.g:2088:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRenameVariableRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRenameVariableAccess().getVariableFieldCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRenameVariableAccess().getEqualsSignGreaterThanSignKeyword_2());
              		
            }
            // InternalAedit.g:2106:3: ( (lv_newVarName_3_0= RULE_ID ) )
            // InternalAedit.g:2107:4: (lv_newVarName_3_0= RULE_ID )
            {
            // InternalAedit.g:2107:4: (lv_newVarName_3_0= RULE_ID )
            // InternalAedit.g:2108:5: lv_newVarName_3_0= RULE_ID
            {
            lv_newVarName_3_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_newVarName_3_0, grammarAccess.getRenameVariableAccess().getNewVarNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRenameVariableAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRenameVariable"


    // $ANTLR start "entryRuleRenameEnum"
    // InternalAedit.g:2132:1: entryRuleRenameEnum returns [EObject current=null] : iv_ruleRenameEnum= ruleRenameEnum EOF ;
    public final EObject entryRuleRenameEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenameEnum = null;


        try {
            // InternalAedit.g:2132:51: (iv_ruleRenameEnum= ruleRenameEnum EOF )
            // InternalAedit.g:2133:2: iv_ruleRenameEnum= ruleRenameEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRenameEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRenameEnum=ruleRenameEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRenameEnum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:2139:1: ruleRenameEnum returns [EObject current=null] : (otherlv_0= 'rename' ( (lv_oldName_1_0= RULE_ID ) ) otherlv_2= '=>' ( (lv_newEnumName_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleRenameEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_oldName_1_0=null;
        Token otherlv_2=null;
        Token lv_newEnumName_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAedit.g:2145:2: ( (otherlv_0= 'rename' ( (lv_oldName_1_0= RULE_ID ) ) otherlv_2= '=>' ( (lv_newEnumName_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalAedit.g:2146:2: (otherlv_0= 'rename' ( (lv_oldName_1_0= RULE_ID ) ) otherlv_2= '=>' ( (lv_newEnumName_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalAedit.g:2146:2: (otherlv_0= 'rename' ( (lv_oldName_1_0= RULE_ID ) ) otherlv_2= '=>' ( (lv_newEnumName_3_0= RULE_ID ) ) otherlv_4= ';' )
            // InternalAedit.g:2147:3: otherlv_0= 'rename' ( (lv_oldName_1_0= RULE_ID ) ) otherlv_2= '=>' ( (lv_newEnumName_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRenameEnumAccess().getRenameKeyword_0());
              		
            }
            // InternalAedit.g:2151:3: ( (lv_oldName_1_0= RULE_ID ) )
            // InternalAedit.g:2152:4: (lv_oldName_1_0= RULE_ID )
            {
            // InternalAedit.g:2152:4: (lv_oldName_1_0= RULE_ID )
            // InternalAedit.g:2153:5: lv_oldName_1_0= RULE_ID
            {
            lv_oldName_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_oldName_1_0, grammarAccess.getRenameEnumAccess().getOldNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,20,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRenameEnumAccess().getEqualsSignGreaterThanSignKeyword_2());
              		
            }
            // InternalAedit.g:2173:3: ( (lv_newEnumName_3_0= RULE_ID ) )
            // InternalAedit.g:2174:4: (lv_newEnumName_3_0= RULE_ID )
            {
            // InternalAedit.g:2174:4: (lv_newEnumName_3_0= RULE_ID )
            // InternalAedit.g:2175:5: lv_newEnumName_3_0= RULE_ID
            {
            lv_newEnumName_3_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_newEnumName_3_0, grammarAccess.getRenameEnumAccess().getNewEnumNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRenameEnumAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRenameEnum"


    // $ANTLR start "entryRuleChangeDefValue"
    // InternalAedit.g:2199:1: entryRuleChangeDefValue returns [EObject current=null] : iv_ruleChangeDefValue= ruleChangeDefValue EOF ;
    public final EObject entryRuleChangeDefValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeDefValue = null;


        try {
            // InternalAedit.g:2199:55: (iv_ruleChangeDefValue= ruleChangeDefValue EOF )
            // InternalAedit.g:2200:2: iv_ruleChangeDefValue= ruleChangeDefValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChangeDefValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChangeDefValue=ruleChangeDefValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChangeDefValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:2206:1: ruleChangeDefValue returns [EObject current=null] : (otherlv_0= 'set_val' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVal_3_0= ruleValue ) ) otherlv_4= ';' ) ;
    public final EObject ruleChangeDefValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_newVal_3_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:2212:2: ( (otherlv_0= 'set_val' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVal_3_0= ruleValue ) ) otherlv_4= ';' ) )
            // InternalAedit.g:2213:2: (otherlv_0= 'set_val' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVal_3_0= ruleValue ) ) otherlv_4= ';' )
            {
            // InternalAedit.g:2213:2: (otherlv_0= 'set_val' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVal_3_0= ruleValue ) ) otherlv_4= ';' )
            // InternalAedit.g:2214:3: otherlv_0= 'set_val' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newVal_3_0= ruleValue ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getChangeDefValueAccess().getSet_valKeyword_0());
              		
            }
            // InternalAedit.g:2218:3: ( ( ruleQN ) )
            // InternalAedit.g:2219:4: ( ruleQN )
            {
            // InternalAedit.g:2219:4: ( ruleQN )
            // InternalAedit.g:2220:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getChangeDefValueRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChangeDefValueAccess().getFieldFieldCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getChangeDefValueAccess().getEqualsSignGreaterThanSignKeyword_2());
              		
            }
            // InternalAedit.g:2238:3: ( (lv_newVal_3_0= ruleValue ) )
            // InternalAedit.g:2239:4: (lv_newVal_3_0= ruleValue )
            {
            // InternalAedit.g:2239:4: (lv_newVal_3_0= ruleValue )
            // InternalAedit.g:2240:5: lv_newVal_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChangeDefValueAccess().getNewValValueParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_newVal_3_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getChangeDefValueAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleChangeDefValue"


    // $ANTLR start "entryRuleChangeType"
    // InternalAedit.g:2265:1: entryRuleChangeType returns [EObject current=null] : iv_ruleChangeType= ruleChangeType EOF ;
    public final EObject entryRuleChangeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeType = null;


        try {
            // InternalAedit.g:2265:51: (iv_ruleChangeType= ruleChangeType EOF )
            // InternalAedit.g:2266:2: iv_ruleChangeType= ruleChangeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChangeTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChangeType=ruleChangeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChangeType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:2272:1: ruleChangeType returns [EObject current=null] : (otherlv_0= 'set_type' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newType_3_0= ruleVARIABLE_TYPE ) ) otherlv_4= ';' ) ;
    public final EObject ruleChangeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_newType_3_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:2278:2: ( (otherlv_0= 'set_type' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newType_3_0= ruleVARIABLE_TYPE ) ) otherlv_4= ';' ) )
            // InternalAedit.g:2279:2: (otherlv_0= 'set_type' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newType_3_0= ruleVARIABLE_TYPE ) ) otherlv_4= ';' )
            {
            // InternalAedit.g:2279:2: (otherlv_0= 'set_type' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newType_3_0= ruleVARIABLE_TYPE ) ) otherlv_4= ';' )
            // InternalAedit.g:2280:3: otherlv_0= 'set_type' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_newType_3_0= ruleVARIABLE_TYPE ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getChangeTypeAccess().getSet_typeKeyword_0());
              		
            }
            // InternalAedit.g:2284:3: ( ( ruleQN ) )
            // InternalAedit.g:2285:4: ( ruleQN )
            {
            // InternalAedit.g:2285:4: ( ruleQN )
            // InternalAedit.g:2286:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getChangeTypeRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChangeTypeAccess().getFieldFieldCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getChangeTypeAccess().getEqualsSignGreaterThanSignKeyword_2());
              		
            }
            // InternalAedit.g:2304:3: ( (lv_newType_3_0= ruleVARIABLE_TYPE ) )
            // InternalAedit.g:2305:4: (lv_newType_3_0= ruleVARIABLE_TYPE )
            {
            // InternalAedit.g:2305:4: (lv_newType_3_0= ruleVARIABLE_TYPE )
            // InternalAedit.g:2306:5: lv_newType_3_0= ruleVARIABLE_TYPE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChangeTypeAccess().getNewTypeVARIABLE_TYPEParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_newType_3_0=ruleVARIABLE_TYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getChangeTypeAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleChangeType"


    // $ANTLR start "entryRuleRemoveArrayValue"
    // InternalAedit.g:2331:1: entryRuleRemoveArrayValue returns [EObject current=null] : iv_ruleRemoveArrayValue= ruleRemoveArrayValue EOF ;
    public final EObject entryRuleRemoveArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveArrayValue = null;


        try {
            // InternalAedit.g:2331:57: (iv_ruleRemoveArrayValue= ruleRemoveArrayValue EOF )
            // InternalAedit.g:2332:2: iv_ruleRemoveArrayValue= ruleRemoveArrayValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRemoveArrayValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRemoveArrayValue=ruleRemoveArrayValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRemoveArrayValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRemoveArrayValue"


    // $ANTLR start "ruleRemoveArrayValue"
    // InternalAedit.g:2338:1: ruleRemoveArrayValue returns [EObject current=null] : (otherlv_0= 'remove_value' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_valueToRemove_3_0= ruleValue ) ) otherlv_4= ';' ) ;
    public final EObject ruleRemoveArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_valueToRemove_3_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:2344:2: ( (otherlv_0= 'remove_value' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_valueToRemove_3_0= ruleValue ) ) otherlv_4= ';' ) )
            // InternalAedit.g:2345:2: (otherlv_0= 'remove_value' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_valueToRemove_3_0= ruleValue ) ) otherlv_4= ';' )
            {
            // InternalAedit.g:2345:2: (otherlv_0= 'remove_value' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_valueToRemove_3_0= ruleValue ) ) otherlv_4= ';' )
            // InternalAedit.g:2346:3: otherlv_0= 'remove_value' ( ( ruleQN ) ) otherlv_2= '=>' ( (lv_valueToRemove_3_0= ruleValue ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRemoveArrayValueAccess().getRemove_valueKeyword_0());
              		
            }
            // InternalAedit.g:2350:3: ( ( ruleQN ) )
            // InternalAedit.g:2351:4: ( ruleQN )
            {
            // InternalAedit.g:2351:4: ( ruleQN )
            // InternalAedit.g:2352:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRemoveArrayValueRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRemoveArrayValueAccess().getVariableFieldCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRemoveArrayValueAccess().getEqualsSignGreaterThanSignKeyword_2());
              		
            }
            // InternalAedit.g:2370:3: ( (lv_valueToRemove_3_0= ruleValue ) )
            // InternalAedit.g:2371:4: (lv_valueToRemove_3_0= ruleValue )
            {
            // InternalAedit.g:2371:4: (lv_valueToRemove_3_0= ruleValue )
            // InternalAedit.g:2372:5: lv_valueToRemove_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRemoveArrayValueAccess().getValueToRemoveValueParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_valueToRemove_3_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRemoveArrayValueRule());
              					}
              					set(
              						current,
              						"valueToRemove",
              						lv_valueToRemove_3_0,
              						"org.aedit.Aedit.Value");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRemoveArrayValueAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRemoveArrayValue"


    // $ANTLR start "entryRuleRemoveArrayValueAtIndex"
    // InternalAedit.g:2397:1: entryRuleRemoveArrayValueAtIndex returns [EObject current=null] : iv_ruleRemoveArrayValueAtIndex= ruleRemoveArrayValueAtIndex EOF ;
    public final EObject entryRuleRemoveArrayValueAtIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveArrayValueAtIndex = null;


        try {
            // InternalAedit.g:2397:64: (iv_ruleRemoveArrayValueAtIndex= ruleRemoveArrayValueAtIndex EOF )
            // InternalAedit.g:2398:2: iv_ruleRemoveArrayValueAtIndex= ruleRemoveArrayValueAtIndex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRemoveArrayValueAtIndexRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRemoveArrayValueAtIndex=ruleRemoveArrayValueAtIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRemoveArrayValueAtIndex; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRemoveArrayValueAtIndex"


    // $ANTLR start "ruleRemoveArrayValueAtIndex"
    // InternalAedit.g:2404:1: ruleRemoveArrayValueAtIndex returns [EObject current=null] : (otherlv_0= 'remove_value.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( ( ruleQN ) ) otherlv_5= ';' ) ;
    public final EObject ruleRemoveArrayValueAtIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAedit.g:2410:2: ( (otherlv_0= 'remove_value.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( ( ruleQN ) ) otherlv_5= ';' ) )
            // InternalAedit.g:2411:2: (otherlv_0= 'remove_value.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( ( ruleQN ) ) otherlv_5= ';' )
            {
            // InternalAedit.g:2411:2: (otherlv_0= 'remove_value.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( ( ruleQN ) ) otherlv_5= ';' )
            // InternalAedit.g:2412:3: otherlv_0= 'remove_value.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( ( ruleQN ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRemoveArrayValueAtIndexAccess().getRemove_valueAtKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRemoveArrayValueAtIndexAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAedit.g:2420:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalAedit.g:2421:4: (lv_index_2_0= RULE_INT )
            {
            // InternalAedit.g:2421:4: (lv_index_2_0= RULE_INT )
            // InternalAedit.g:2422:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_index_2_0, grammarAccess.getRemoveArrayValueAtIndexAccess().getIndexINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRemoveArrayValueAtIndexRule());
              					}
              					setWithLastConsumed(
              						current,
              						"index",
              						lv_index_2_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRemoveArrayValueAtIndexAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalAedit.g:2442:3: ( ( ruleQN ) )
            // InternalAedit.g:2443:4: ( ruleQN )
            {
            // InternalAedit.g:2443:4: ( ruleQN )
            // InternalAedit.g:2444:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRemoveArrayValueAtIndexRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRemoveArrayValueAtIndexAccess().getArrayFieldCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_11);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRemoveArrayValueAtIndexAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRemoveArrayValueAtIndex"


    // $ANTLR start "entryRuleAddValueToArray"
    // InternalAedit.g:2466:1: entryRuleAddValueToArray returns [EObject current=null] : iv_ruleAddValueToArray= ruleAddValueToArray EOF ;
    public final EObject entryRuleAddValueToArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddValueToArray = null;


        try {
            // InternalAedit.g:2466:56: (iv_ruleAddValueToArray= ruleAddValueToArray EOF )
            // InternalAedit.g:2467:2: iv_ruleAddValueToArray= ruleAddValueToArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddValueToArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddValueToArray=ruleAddValueToArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddValueToArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAddValueToArray"


    // $ANTLR start "ruleAddValueToArray"
    // InternalAedit.g:2473:1: ruleAddValueToArray returns [EObject current=null] : (otherlv_0= 'add_value.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( ( ruleQN ) ) otherlv_5= '=>' ( ( (lv_valueToAdd_6_1= ruleArray | lv_valueToAdd_6_2= ruleValue ) ) ) otherlv_7= ';' ) ;
    public final EObject ruleAddValueToArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_valueToAdd_6_1 = null;

        EObject lv_valueToAdd_6_2 = null;



        	enterRule();

        try {
            // InternalAedit.g:2479:2: ( (otherlv_0= 'add_value.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( ( ruleQN ) ) otherlv_5= '=>' ( ( (lv_valueToAdd_6_1= ruleArray | lv_valueToAdd_6_2= ruleValue ) ) ) otherlv_7= ';' ) )
            // InternalAedit.g:2480:2: (otherlv_0= 'add_value.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( ( ruleQN ) ) otherlv_5= '=>' ( ( (lv_valueToAdd_6_1= ruleArray | lv_valueToAdd_6_2= ruleValue ) ) ) otherlv_7= ';' )
            {
            // InternalAedit.g:2480:2: (otherlv_0= 'add_value.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( ( ruleQN ) ) otherlv_5= '=>' ( ( (lv_valueToAdd_6_1= ruleArray | lv_valueToAdd_6_2= ruleValue ) ) ) otherlv_7= ';' )
            // InternalAedit.g:2481:3: otherlv_0= 'add_value.at' otherlv_1= '(' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ')' ( ( ruleQN ) ) otherlv_5= '=>' ( ( (lv_valueToAdd_6_1= ruleArray | lv_valueToAdd_6_2= ruleValue ) ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAddValueToArrayAccess().getAdd_valueAtKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAddValueToArrayAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAedit.g:2489:3: ( (lv_index_2_0= RULE_INT ) )
            // InternalAedit.g:2490:4: (lv_index_2_0= RULE_INT )
            {
            // InternalAedit.g:2490:4: (lv_index_2_0= RULE_INT )
            // InternalAedit.g:2491:5: lv_index_2_0= RULE_INT
            {
            lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_index_2_0, grammarAccess.getAddValueToArrayAccess().getIndexINTTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAddValueToArrayRule());
              					}
              					setWithLastConsumed(
              						current,
              						"index",
              						lv_index_2_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAddValueToArrayAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalAedit.g:2511:3: ( ( ruleQN ) )
            // InternalAedit.g:2512:4: ( ruleQN )
            {
            // InternalAedit.g:2512:4: ( ruleQN )
            // InternalAedit.g:2513:5: ruleQN
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAddValueToArrayRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAddValueToArrayAccess().getArrayFieldCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAddValueToArrayAccess().getEqualsSignGreaterThanSignKeyword_5());
              		
            }
            // InternalAedit.g:2531:3: ( ( (lv_valueToAdd_6_1= ruleArray | lv_valueToAdd_6_2= ruleValue ) ) )
            // InternalAedit.g:2532:4: ( (lv_valueToAdd_6_1= ruleArray | lv_valueToAdd_6_2= ruleValue ) )
            {
            // InternalAedit.g:2532:4: ( (lv_valueToAdd_6_1= ruleArray | lv_valueToAdd_6_2= ruleValue ) )
            // InternalAedit.g:2533:5: (lv_valueToAdd_6_1= ruleArray | lv_valueToAdd_6_2= ruleValue )
            {
            // InternalAedit.g:2533:5: (lv_valueToAdd_6_1= ruleArray | lv_valueToAdd_6_2= ruleValue )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_INT)||(LA20_0>=46 && LA20_0<=49)) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalAedit.g:2534:6: lv_valueToAdd_6_1= ruleArray
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAddValueToArrayAccess().getValueToAddArrayParserRuleCall_6_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_valueToAdd_6_1=ruleArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAddValueToArrayRule());
                      						}
                      						set(
                      							current,
                      							"valueToAdd",
                      							lv_valueToAdd_6_1,
                      							"org.aedit.Aedit.Array");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalAedit.g:2550:6: lv_valueToAdd_6_2= ruleValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAddValueToArrayAccess().getValueToAddValueParserRuleCall_6_0_1());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_valueToAdd_6_2=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAddValueToArrayRule());
                      						}
                      						set(
                      							current,
                      							"valueToAdd",
                      							lv_valueToAdd_6_2,
                      							"org.aedit.Aedit.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getAddValueToArrayAccess().getSemicolonKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAddValueToArray"


    // $ANTLR start "entryRuleField"
    // InternalAedit.g:2576:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalAedit.g:2576:46: (iv_ruleField= ruleField EOF )
            // InternalAedit.g:2577:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:2583:1: ruleField returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_fieldType_1_1= rulePrimitiveTypeField | lv_fieldType_1_2= ruleCustomTypeField | lv_fieldType_1_3= ruleComplexTypeField ) ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_fieldType_1_1 = null;

        EObject lv_fieldType_1_2 = null;

        EObject lv_fieldType_1_3 = null;



        	enterRule();

        try {
            // InternalAedit.g:2589:2: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_fieldType_1_1= rulePrimitiveTypeField | lv_fieldType_1_2= ruleCustomTypeField | lv_fieldType_1_3= ruleComplexTypeField ) ) ) ) )
            // InternalAedit.g:2590:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_fieldType_1_1= rulePrimitiveTypeField | lv_fieldType_1_2= ruleCustomTypeField | lv_fieldType_1_3= ruleComplexTypeField ) ) ) )
            {
            // InternalAedit.g:2590:2: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_fieldType_1_1= rulePrimitiveTypeField | lv_fieldType_1_2= ruleCustomTypeField | lv_fieldType_1_3= ruleComplexTypeField ) ) ) )
            // InternalAedit.g:2591:3: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_fieldType_1_1= rulePrimitiveTypeField | lv_fieldType_1_2= ruleCustomTypeField | lv_fieldType_1_3= ruleComplexTypeField ) ) )
            {
            // InternalAedit.g:2591:3: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==56) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAedit.g:2592:4: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // InternalAedit.g:2592:4: (lv_annotations_0_0= ruleAnnotation )
            	    // InternalAedit.g:2593:5: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFieldAccess().getAnnotationsAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_annotations_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFieldRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_0_0,
            	      						"org.aedit.Aedit.Annotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalAedit.g:2610:3: ( ( (lv_fieldType_1_1= rulePrimitiveTypeField | lv_fieldType_1_2= ruleCustomTypeField | lv_fieldType_1_3= ruleComplexTypeField ) ) )
            // InternalAedit.g:2611:4: ( (lv_fieldType_1_1= rulePrimitiveTypeField | lv_fieldType_1_2= ruleCustomTypeField | lv_fieldType_1_3= ruleComplexTypeField ) )
            {
            // InternalAedit.g:2611:4: ( (lv_fieldType_1_1= rulePrimitiveTypeField | lv_fieldType_1_2= ruleCustomTypeField | lv_fieldType_1_3= ruleComplexTypeField ) )
            // InternalAedit.g:2612:5: (lv_fieldType_1_1= rulePrimitiveTypeField | lv_fieldType_1_2= ruleCustomTypeField | lv_fieldType_1_3= ruleComplexTypeField )
            {
            // InternalAedit.g:2612:5: (lv_fieldType_1_1= rulePrimitiveTypeField | lv_fieldType_1_2= ruleCustomTypeField | lv_fieldType_1_3= ruleComplexTypeField )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt22=1;
                }
                break;
            case RULE_ID:
                {
                alt22=2;
                }
                break;
            case 41:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalAedit.g:2613:6: lv_fieldType_1_1= rulePrimitiveTypeField
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFieldAccess().getFieldTypePrimitiveTypeFieldParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_fieldType_1_1=rulePrimitiveTypeField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFieldRule());
                      						}
                      						set(
                      							current,
                      							"fieldType",
                      							lv_fieldType_1_1,
                      							"org.aedit.Aedit.PrimitiveTypeField");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalAedit.g:2629:6: lv_fieldType_1_2= ruleCustomTypeField
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFieldAccess().getFieldTypeCustomTypeFieldParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_fieldType_1_2=ruleCustomTypeField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFieldRule());
                      						}
                      						set(
                      							current,
                      							"fieldType",
                      							lv_fieldType_1_2,
                      							"org.aedit.Aedit.CustomTypeField");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalAedit.g:2645:6: lv_fieldType_1_3= ruleComplexTypeField
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFieldAccess().getFieldTypeComplexTypeFieldParserRuleCall_1_0_2());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_fieldType_1_3=ruleComplexTypeField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFieldRule());
                      						}
                      						set(
                      							current,
                      							"fieldType",
                      							lv_fieldType_1_3,
                      							"org.aedit.Aedit.ComplexTypeField");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleCustomTypeField"
    // InternalAedit.g:2667:1: entryRuleCustomTypeField returns [EObject current=null] : iv_ruleCustomTypeField= ruleCustomTypeField EOF ;
    public final EObject entryRuleCustomTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomTypeField = null;


        try {
            // InternalAedit.g:2667:56: (iv_ruleCustomTypeField= ruleCustomTypeField EOF )
            // InternalAedit.g:2668:2: iv_ruleCustomTypeField= ruleCustomTypeField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCustomTypeFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCustomTypeField=ruleCustomTypeField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCustomTypeField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCustomTypeField"


    // $ANTLR start "ruleCustomTypeField"
    // InternalAedit.g:2674:1: ruleCustomTypeField returns [EObject current=null] : ( ( (lv_type_0_0= ruleCustomType ) ) ( (lv_nameAnnotations_1_0= ruleAnnotation ) )* ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleCustomTypeField() throws RecognitionException {
        EObject current = null;

        Token lv_varName_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_0_0 = null;

        EObject lv_nameAnnotations_1_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:2680:2: ( ( ( (lv_type_0_0= ruleCustomType ) ) ( (lv_nameAnnotations_1_0= ruleAnnotation ) )* ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalAedit.g:2681:2: ( ( (lv_type_0_0= ruleCustomType ) ) ( (lv_nameAnnotations_1_0= ruleAnnotation ) )* ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalAedit.g:2681:2: ( ( (lv_type_0_0= ruleCustomType ) ) ( (lv_nameAnnotations_1_0= ruleAnnotation ) )* ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalAedit.g:2682:3: ( (lv_type_0_0= ruleCustomType ) ) ( (lv_nameAnnotations_1_0= ruleAnnotation ) )* ( (lv_varName_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // InternalAedit.g:2682:3: ( (lv_type_0_0= ruleCustomType ) )
            // InternalAedit.g:2683:4: (lv_type_0_0= ruleCustomType )
            {
            // InternalAedit.g:2683:4: (lv_type_0_0= ruleCustomType )
            // InternalAedit.g:2684:5: lv_type_0_0= ruleCustomType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCustomTypeFieldAccess().getTypeCustomTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_type_0_0=ruleCustomType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCustomTypeFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.aedit.Aedit.CustomType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAedit.g:2701:3: ( (lv_nameAnnotations_1_0= ruleAnnotation ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==56) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAedit.g:2702:4: (lv_nameAnnotations_1_0= ruleAnnotation )
            	    {
            	    // InternalAedit.g:2702:4: (lv_nameAnnotations_1_0= ruleAnnotation )
            	    // InternalAedit.g:2703:5: lv_nameAnnotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getCustomTypeFieldAccess().getNameAnnotationsAnnotationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_nameAnnotations_1_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getCustomTypeFieldRule());
            	      					}
            	      					add(
            	      						current,
            	      						"nameAnnotations",
            	      						lv_nameAnnotations_1_0,
            	      						"org.aedit.Aedit.Annotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalAedit.g:2720:3: ( (lv_varName_2_0= RULE_ID ) )
            // InternalAedit.g:2721:4: (lv_varName_2_0= RULE_ID )
            {
            // InternalAedit.g:2721:4: (lv_varName_2_0= RULE_ID )
            // InternalAedit.g:2722:5: lv_varName_2_0= RULE_ID
            {
            lv_varName_2_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_varName_2_0, grammarAccess.getCustomTypeFieldAccess().getVarNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCustomTypeFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"varName",
              						lv_varName_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCustomTypeFieldAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCustomTypeField"


    // $ANTLR start "entryRulePrimitiveTypeField"
    // InternalAedit.g:2746:1: entryRulePrimitiveTypeField returns [EObject current=null] : iv_rulePrimitiveTypeField= rulePrimitiveTypeField EOF ;
    public final EObject entryRulePrimitiveTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeField = null;


        try {
            // InternalAedit.g:2746:59: (iv_rulePrimitiveTypeField= rulePrimitiveTypeField EOF )
            // InternalAedit.g:2747:2: iv_rulePrimitiveTypeField= rulePrimitiveTypeField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTypeField=rulePrimitiveTypeField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveTypeField"


    // $ANTLR start "rulePrimitiveTypeField"
    // InternalAedit.g:2753:1: rulePrimitiveTypeField returns [EObject current=null] : ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_nameAnnotations_1_0= ruleAnnotation ) )* ( (lv_varName_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) )? ) ;
    public final EObject rulePrimitiveTypeField() throws RecognitionException {
        EObject current = null;

        Token lv_varName_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_0_0 = null;

        EObject lv_nameAnnotations_1_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:2759:2: ( ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_nameAnnotations_1_0= ruleAnnotation ) )* ( (lv_varName_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) )? ) )
            // InternalAedit.g:2760:2: ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_nameAnnotations_1_0= ruleAnnotation ) )* ( (lv_varName_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) )? )
            {
            // InternalAedit.g:2760:2: ( ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_nameAnnotations_1_0= ruleAnnotation ) )* ( (lv_varName_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) )? )
            // InternalAedit.g:2761:3: ( (lv_type_0_0= rulePrimitiveType ) ) ( (lv_nameAnnotations_1_0= ruleAnnotation ) )* ( (lv_varName_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) )?
            {
            // InternalAedit.g:2761:3: ( (lv_type_0_0= rulePrimitiveType ) )
            // InternalAedit.g:2762:4: (lv_type_0_0= rulePrimitiveType )
            {
            // InternalAedit.g:2762:4: (lv_type_0_0= rulePrimitiveType )
            // InternalAedit.g:2763:5: lv_type_0_0= rulePrimitiveType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPrimitiveTypeFieldAccess().getTypePrimitiveTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_type_0_0=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPrimitiveTypeFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.aedit.Aedit.PrimitiveType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAedit.g:2780:3: ( (lv_nameAnnotations_1_0= ruleAnnotation ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==56) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAedit.g:2781:4: (lv_nameAnnotations_1_0= ruleAnnotation )
            	    {
            	    // InternalAedit.g:2781:4: (lv_nameAnnotations_1_0= ruleAnnotation )
            	    // InternalAedit.g:2782:5: lv_nameAnnotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPrimitiveTypeFieldAccess().getNameAnnotationsAnnotationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_nameAnnotations_1_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPrimitiveTypeFieldRule());
            	      					}
            	      					add(
            	      						current,
            	      						"nameAnnotations",
            	      						lv_nameAnnotations_1_0,
            	      						"org.aedit.Aedit.Annotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // InternalAedit.g:2799:3: ( (lv_varName_2_0= RULE_ID ) )
            // InternalAedit.g:2800:4: (lv_varName_2_0= RULE_ID )
            {
            // InternalAedit.g:2800:4: (lv_varName_2_0= RULE_ID )
            // InternalAedit.g:2801:5: lv_varName_2_0= RULE_ID
            {
            lv_varName_2_0=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_varName_2_0, grammarAccess.getPrimitiveTypeFieldAccess().getVarNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPrimitiveTypeFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"varName",
              						lv_varName_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAedit.g:2817:3: (otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAedit.g:2818:4: otherlv_3= '=' ( (lv_value_4_0= ruleValue ) )
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPrimitiveTypeFieldAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalAedit.g:2822:4: ( (lv_value_4_0= ruleValue ) )
                    // InternalAedit.g:2823:5: (lv_value_4_0= ruleValue )
                    {
                    // InternalAedit.g:2823:5: (lv_value_4_0= ruleValue )
                    // InternalAedit.g:2824:6: lv_value_4_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimitiveTypeFieldAccess().getValueValueParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimitiveTypeFieldRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_4_0,
                      							"org.aedit.Aedit.Value");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveTypeField"


    // $ANTLR start "entryRuleComplexTypeField"
    // InternalAedit.g:2846:1: entryRuleComplexTypeField returns [EObject current=null] : iv_ruleComplexTypeField= ruleComplexTypeField EOF ;
    public final EObject entryRuleComplexTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexTypeField = null;


        try {
            // InternalAedit.g:2846:57: (iv_ruleComplexTypeField= ruleComplexTypeField EOF )
            // InternalAedit.g:2847:2: iv_ruleComplexTypeField= ruleComplexTypeField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexTypeFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComplexTypeField=ruleComplexTypeField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexTypeField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComplexTypeField"


    // $ANTLR start "ruleComplexTypeField"
    // InternalAedit.g:2853:1: ruleComplexTypeField returns [EObject current=null] : ( ( (lv_type_0_0= ruleArrayTypeField ) ) ( (lv_nameAnnotations_1_0= ruleAnnotation ) )* ( (lv_varName_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( '[' )=> (lv_value_4_0= ruleArray ) ) )? ) ;
    public final EObject ruleComplexTypeField() throws RecognitionException {
        EObject current = null;

        Token lv_varName_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_0_0 = null;

        EObject lv_nameAnnotations_1_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:2859:2: ( ( ( (lv_type_0_0= ruleArrayTypeField ) ) ( (lv_nameAnnotations_1_0= ruleAnnotation ) )* ( (lv_varName_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( '[' )=> (lv_value_4_0= ruleArray ) ) )? ) )
            // InternalAedit.g:2860:2: ( ( (lv_type_0_0= ruleArrayTypeField ) ) ( (lv_nameAnnotations_1_0= ruleAnnotation ) )* ( (lv_varName_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( '[' )=> (lv_value_4_0= ruleArray ) ) )? )
            {
            // InternalAedit.g:2860:2: ( ( (lv_type_0_0= ruleArrayTypeField ) ) ( (lv_nameAnnotations_1_0= ruleAnnotation ) )* ( (lv_varName_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( '[' )=> (lv_value_4_0= ruleArray ) ) )? )
            // InternalAedit.g:2861:3: ( (lv_type_0_0= ruleArrayTypeField ) ) ( (lv_nameAnnotations_1_0= ruleAnnotation ) )* ( (lv_varName_2_0= RULE_ID ) ) (otherlv_3= '=' ( ( '[' )=> (lv_value_4_0= ruleArray ) ) )?
            {
            // InternalAedit.g:2861:3: ( (lv_type_0_0= ruleArrayTypeField ) )
            // InternalAedit.g:2862:4: (lv_type_0_0= ruleArrayTypeField )
            {
            // InternalAedit.g:2862:4: (lv_type_0_0= ruleArrayTypeField )
            // InternalAedit.g:2863:5: lv_type_0_0= ruleArrayTypeField
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComplexTypeFieldAccess().getTypeArrayTypeFieldParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_type_0_0=ruleArrayTypeField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComplexTypeFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.aedit.Aedit.ArrayTypeField");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAedit.g:2880:3: ( (lv_nameAnnotations_1_0= ruleAnnotation ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==56) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAedit.g:2881:4: (lv_nameAnnotations_1_0= ruleAnnotation )
            	    {
            	    // InternalAedit.g:2881:4: (lv_nameAnnotations_1_0= ruleAnnotation )
            	    // InternalAedit.g:2882:5: lv_nameAnnotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComplexTypeFieldAccess().getNameAnnotationsAnnotationParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_32);
            	    lv_nameAnnotations_1_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getComplexTypeFieldRule());
            	      					}
            	      					add(
            	      						current,
            	      						"nameAnnotations",
            	      						lv_nameAnnotations_1_0,
            	      						"org.aedit.Aedit.Annotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalAedit.g:2899:3: ( (lv_varName_2_0= RULE_ID ) )
            // InternalAedit.g:2900:4: (lv_varName_2_0= RULE_ID )
            {
            // InternalAedit.g:2900:4: (lv_varName_2_0= RULE_ID )
            // InternalAedit.g:2901:5: lv_varName_2_0= RULE_ID
            {
            lv_varName_2_0=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_varName_2_0, grammarAccess.getComplexTypeFieldAccess().getVarNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComplexTypeFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"varName",
              						lv_varName_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAedit.g:2917:3: (otherlv_3= '=' ( ( '[' )=> (lv_value_4_0= ruleArray ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAedit.g:2918:4: otherlv_3= '=' ( ( '[' )=> (lv_value_4_0= ruleArray ) )
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getComplexTypeFieldAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalAedit.g:2922:4: ( ( '[' )=> (lv_value_4_0= ruleArray ) )
                    // InternalAedit.g:2923:5: ( '[' )=> (lv_value_4_0= ruleArray )
                    {
                    // InternalAedit.g:2924:5: (lv_value_4_0= ruleArray )
                    // InternalAedit.g:2925:6: lv_value_4_0= ruleArray
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComplexTypeFieldAccess().getValueArrayParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComplexTypeFieldRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_4_0,
                      							"org.aedit.Aedit.Array");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComplexTypeField"


    // $ANTLR start "entryRuleArrayTypeField"
    // InternalAedit.g:2947:1: entryRuleArrayTypeField returns [EObject current=null] : iv_ruleArrayTypeField= ruleArrayTypeField EOF ;
    public final EObject entryRuleArrayTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayTypeField = null;


        try {
            // InternalAedit.g:2947:55: (iv_ruleArrayTypeField= ruleArrayTypeField EOF )
            // InternalAedit.g:2948:2: iv_ruleArrayTypeField= ruleArrayTypeField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayTypeFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayTypeField=ruleArrayTypeField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayTypeField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayTypeField"


    // $ANTLR start "ruleArrayTypeField"
    // InternalAedit.g:2954:1: ruleArrayTypeField returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '<' ( (lv_type_2_0= ruleAnnotatedTypes ) ) otherlv_3= '>' ) ;
    public final EObject ruleArrayTypeField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:2960:2: ( (otherlv_0= 'array' otherlv_1= '<' ( (lv_type_2_0= ruleAnnotatedTypes ) ) otherlv_3= '>' ) )
            // InternalAedit.g:2961:2: (otherlv_0= 'array' otherlv_1= '<' ( (lv_type_2_0= ruleAnnotatedTypes ) ) otherlv_3= '>' )
            {
            // InternalAedit.g:2961:2: (otherlv_0= 'array' otherlv_1= '<' ( (lv_type_2_0= ruleAnnotatedTypes ) ) otherlv_3= '>' )
            // InternalAedit.g:2962:3: otherlv_0= 'array' otherlv_1= '<' ( (lv_type_2_0= ruleAnnotatedTypes ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayTypeFieldAccess().getArrayKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,42,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayTypeFieldAccess().getLessThanSignKeyword_1());
              		
            }
            // InternalAedit.g:2970:3: ( (lv_type_2_0= ruleAnnotatedTypes ) )
            // InternalAedit.g:2971:4: (lv_type_2_0= ruleAnnotatedTypes )
            {
            // InternalAedit.g:2971:4: (lv_type_2_0= ruleAnnotatedTypes )
            // InternalAedit.g:2972:5: lv_type_2_0= ruleAnnotatedTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayTypeFieldAccess().getTypeAnnotatedTypesParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_type_2_0=ruleAnnotatedTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayTypeFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.aedit.Aedit.AnnotatedTypes");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getArrayTypeFieldAccess().getGreaterThanSignKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArrayTypeField"


    // $ANTLR start "entryRuleAnnotatedTypes"
    // InternalAedit.g:2997:1: entryRuleAnnotatedTypes returns [EObject current=null] : iv_ruleAnnotatedTypes= ruleAnnotatedTypes EOF ;
    public final EObject entryRuleAnnotatedTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotatedTypes = null;


        try {
            // InternalAedit.g:2997:55: (iv_ruleAnnotatedTypes= ruleAnnotatedTypes EOF )
            // InternalAedit.g:2998:2: iv_ruleAnnotatedTypes= ruleAnnotatedTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotatedTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnnotatedTypes=ruleAnnotatedTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotatedTypes; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotatedTypes"


    // $ANTLR start "ruleAnnotatedTypes"
    // InternalAedit.g:3004:1: ruleAnnotatedTypes returns [EObject current=null] : ( ( (lv_annotataions_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTypes ) ) ) ;
    public final EObject ruleAnnotatedTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_annotataions_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:3010:2: ( ( ( (lv_annotataions_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTypes ) ) ) )
            // InternalAedit.g:3011:2: ( ( (lv_annotataions_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTypes ) ) )
            {
            // InternalAedit.g:3011:2: ( ( (lv_annotataions_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTypes ) ) )
            // InternalAedit.g:3012:3: ( (lv_annotataions_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTypes ) )
            {
            // InternalAedit.g:3012:3: ( (lv_annotataions_0_0= ruleAnnotation ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==56) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAedit.g:3013:4: (lv_annotataions_0_0= ruleAnnotation )
            	    {
            	    // InternalAedit.g:3013:4: (lv_annotataions_0_0= ruleAnnotation )
            	    // InternalAedit.g:3014:5: lv_annotataions_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAnnotatedTypesAccess().getAnnotataionsAnnotationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_annotataions_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAnnotatedTypesRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotataions",
            	      						lv_annotataions_0_0,
            	      						"org.aedit.Aedit.Annotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalAedit.g:3031:3: ( (lv_type_1_0= ruleTypes ) )
            // InternalAedit.g:3032:4: (lv_type_1_0= ruleTypes )
            {
            // InternalAedit.g:3032:4: (lv_type_1_0= ruleTypes )
            // InternalAedit.g:3033:5: lv_type_1_0= ruleTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAnnotatedTypesAccess().getTypeTypesParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAnnotatedTypesRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"org.aedit.Aedit.Types");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAnnotatedTypes"


    // $ANTLR start "entryRuleTypes"
    // InternalAedit.g:3054:1: entryRuleTypes returns [EObject current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final EObject entryRuleTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypes = null;


        try {
            // InternalAedit.g:3054:46: (iv_ruleTypes= ruleTypes EOF )
            // InternalAedit.g:3055:2: iv_ruleTypes= ruleTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypes=ruleTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypes; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // InternalAedit.g:3061:1: ruleTypes returns [EObject current=null] : (this_CustomType_0= ruleCustomType | this_PrimitiveType_1= rulePrimitiveType | this_ArrayTypeField_2= ruleArrayTypeField ) ;
    public final EObject ruleTypes() throws RecognitionException {
        EObject current = null;

        EObject this_CustomType_0 = null;

        EObject this_PrimitiveType_1 = null;

        EObject this_ArrayTypeField_2 = null;



        	enterRule();

        try {
            // InternalAedit.g:3067:2: ( (this_CustomType_0= ruleCustomType | this_PrimitiveType_1= rulePrimitiveType | this_ArrayTypeField_2= ruleArrayTypeField ) )
            // InternalAedit.g:3068:2: (this_CustomType_0= ruleCustomType | this_PrimitiveType_1= rulePrimitiveType | this_ArrayTypeField_2= ruleArrayTypeField )
            {
            // InternalAedit.g:3068:2: (this_CustomType_0= ruleCustomType | this_PrimitiveType_1= rulePrimitiveType | this_ArrayTypeField_2= ruleArrayTypeField )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt29=1;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt29=2;
                }
                break;
            case 41:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalAedit.g:3069:3: this_CustomType_0= ruleCustomType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypesAccess().getCustomTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CustomType_0=ruleCustomType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CustomType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAedit.g:3078:3: this_PrimitiveType_1= rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypesAccess().getPrimitiveTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_1=rulePrimitiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveType_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAedit.g:3087:3: this_ArrayTypeField_2= ruleArrayTypeField
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypesAccess().getArrayTypeFieldParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayTypeField_2=ruleArrayTypeField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArrayTypeField_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleCustomType"
    // InternalAedit.g:3099:1: entryRuleCustomType returns [EObject current=null] : iv_ruleCustomType= ruleCustomType EOF ;
    public final EObject entryRuleCustomType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomType = null;


        try {
            // InternalAedit.g:3099:51: (iv_ruleCustomType= ruleCustomType EOF )
            // InternalAedit.g:3100:2: iv_ruleCustomType= ruleCustomType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCustomTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCustomType=ruleCustomType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCustomType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCustomType"


    // $ANTLR start "ruleCustomType"
    // InternalAedit.g:3106:1: ruleCustomType returns [EObject current=null] : ( ( ruleQN ) ) ;
    public final EObject ruleCustomType() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAedit.g:3112:2: ( ( ( ruleQN ) ) )
            // InternalAedit.g:3113:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:3113:2: ( ( ruleQN ) )
            // InternalAedit.g:3114:3: ( ruleQN )
            {
            // InternalAedit.g:3114:3: ( ruleQN )
            // InternalAedit.g:3115:4: ruleQN
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getCustomTypeRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getCustomTypeAccess().getTargetTypeCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCustomType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalAedit.g:3132:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalAedit.g:3132:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalAedit.g:3133:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalAedit.g:3139:1: rulePrimitiveType returns [EObject current=null] : ( (lv_target_0_0= ruleVARIABLE_TYPE ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_target_0_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:3145:2: ( ( (lv_target_0_0= ruleVARIABLE_TYPE ) ) )
            // InternalAedit.g:3146:2: ( (lv_target_0_0= ruleVARIABLE_TYPE ) )
            {
            // InternalAedit.g:3146:2: ( (lv_target_0_0= ruleVARIABLE_TYPE ) )
            // InternalAedit.g:3147:3: (lv_target_0_0= ruleVARIABLE_TYPE )
            {
            // InternalAedit.g:3147:3: (lv_target_0_0= ruleVARIABLE_TYPE )
            // InternalAedit.g:3148:4: lv_target_0_0= ruleVARIABLE_TYPE
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getTargetVARIABLE_TYPEParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_target_0_0=ruleVARIABLE_TYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
              				}
              				set(
              					current,
              					"target",
              					lv_target_0_0,
              					"org.aedit.Aedit.VARIABLE_TYPE");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleAnnotation"
    // InternalAedit.g:3168:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalAedit.g:3168:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalAedit.g:3169:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalAedit.g:3175:1: ruleAnnotation returns [EObject current=null] : ( ( (lv_name_0_0= ruleAN ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:3181:2: ( ( ( (lv_name_0_0= ruleAN ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ')' )? ) )
            // InternalAedit.g:3182:2: ( ( (lv_name_0_0= ruleAN ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ')' )? )
            {
            // InternalAedit.g:3182:2: ( ( (lv_name_0_0= ruleAN ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ')' )? )
            // InternalAedit.g:3183:3: ( (lv_name_0_0= ruleAN ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ')' )?
            {
            // InternalAedit.g:3183:3: ( (lv_name_0_0= ruleAN ) )
            // InternalAedit.g:3184:4: (lv_name_0_0= ruleAN )
            {
            // InternalAedit.g:3184:4: (lv_name_0_0= ruleAN )
            // InternalAedit.g:3185:5: lv_name_0_0= ruleAN
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAnnotationAccess().getNameANParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_37);
            lv_name_0_0=ruleAN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAnnotationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.aedit.Aedit.AN");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAedit.g:3202:3: (otherlv_1= '(' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAedit.g:3203:4: otherlv_1= '(' ( (lv_values_2_0= ruleValues ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalAedit.g:3207:4: ( (lv_values_2_0= ruleValues ) )
                    // InternalAedit.g:3208:5: (lv_values_2_0= ruleValues )
                    {
                    // InternalAedit.g:3208:5: (lv_values_2_0= ruleValues )
                    // InternalAedit.g:3209:6: lv_values_2_0= ruleValues
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAnnotationAccess().getValuesValuesParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_values_2_0=ruleValues();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAnnotationRule());
                      						}
                      						set(
                      							current,
                      							"values",
                      							lv_values_2_0,
                      							"org.aedit.Aedit.Values");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleValues"
    // InternalAedit.g:3235:1: entryRuleValues returns [EObject current=null] : iv_ruleValues= ruleValues EOF ;
    public final EObject entryRuleValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValues = null;


        try {
            // InternalAedit.g:3235:47: (iv_ruleValues= ruleValues EOF )
            // InternalAedit.g:3236:2: iv_ruleValues= ruleValues EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValues=ruleValues();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValues; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValues"


    // $ANTLR start "ruleValues"
    // InternalAedit.g:3242:1: ruleValues returns [EObject current=null] : ( () ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )* ) ;
    public final EObject ruleValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:3248:2: ( ( () ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )* ) )
            // InternalAedit.g:3249:2: ( () ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )* )
            {
            // InternalAedit.g:3249:2: ( () ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )* )
            // InternalAedit.g:3250:3: () ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )*
            {
            // InternalAedit.g:3250:3: ()
            // InternalAedit.g:3251:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getValuesAccess().getValuesAction_0(),
              					current);
              			
            }

            }

            // InternalAedit.g:3257:3: ( ( ( '[' )=> (lv_value_1_0= ruleArray ) ) | ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* ) )*
            loop32:
            do {
                int alt32=3;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==44) && (synpred2_InternalAedit())) {
                    alt32=1;
                }
                else if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_INT)||(LA32_0>=46 && LA32_0<=49)) ) {
                    alt32=2;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAedit.g:3258:4: ( ( '[' )=> (lv_value_1_0= ruleArray ) )
            	    {
            	    // InternalAedit.g:3258:4: ( ( '[' )=> (lv_value_1_0= ruleArray ) )
            	    // InternalAedit.g:3259:5: ( '[' )=> (lv_value_1_0= ruleArray )
            	    {
            	    // InternalAedit.g:3260:5: (lv_value_1_0= ruleArray )
            	    // InternalAedit.g:3261:6: lv_value_1_0= ruleArray
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getValuesAccess().getValueArrayParserRuleCall_1_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_value_1_0=ruleArray();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getValuesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"value",
            	      							lv_value_1_0,
            	      							"org.aedit.Aedit.Array");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAedit.g:3279:4: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )
            	    {
            	    // InternalAedit.g:3279:4: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )* )
            	    // InternalAedit.g:3280:5: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )*
            	    {
            	    // InternalAedit.g:3280:5: ( (lv_value_2_0= ruleValue ) )
            	    // InternalAedit.g:3281:6: (lv_value_2_0= ruleValue )
            	    {
            	    // InternalAedit.g:3281:6: (lv_value_2_0= ruleValue )
            	    // InternalAedit.g:3282:7: lv_value_2_0= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_0_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_value_2_0=ruleValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getValuesRule());
            	      							}
            	      							add(
            	      								current,
            	      								"value",
            	      								lv_value_2_0,
            	      								"org.aedit.Aedit.Value");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalAedit.g:3299:5: (otherlv_3= ',' ( (lv_value_4_0= ruleValue ) ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==32) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalAedit.g:3300:6: otherlv_3= ',' ( (lv_value_4_0= ruleValue ) )
            	    	    {
            	    	    otherlv_3=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_3, grammarAccess.getValuesAccess().getCommaKeyword_1_1_1_0());
            	    	      					
            	    	    }
            	    	    // InternalAedit.g:3304:6: ( (lv_value_4_0= ruleValue ) )
            	    	    // InternalAedit.g:3305:7: (lv_value_4_0= ruleValue )
            	    	    {
            	    	    // InternalAedit.g:3305:7: (lv_value_4_0= ruleValue )
            	    	    // InternalAedit.g:3306:8: lv_value_4_0= ruleValue
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_1_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FOLLOW_40);
            	    	    lv_value_4_0=ruleValue();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElementForParent(grammarAccess.getValuesRule());
            	    	      								}
            	    	      								add(
            	    	      									current,
            	    	      									"value",
            	    	      									lv_value_4_0,
            	    	      									"org.aedit.Aedit.Value");
            	    	      								afterParserOrEnumRuleCall();
            	    	      							
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleValues"


    // $ANTLR start "entryRuleArray"
    // InternalAedit.g:3330:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalAedit.g:3330:46: (iv_ruleArray= ruleArray EOF )
            // InternalAedit.g:3331:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalAedit.g:3337:1: ruleArray returns [EObject current=null] : ( ( ( '[' )=>otherlv_0= '[' ) ( (lv_values_1_0= ruleValues ) ) otherlv_2= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_values_1_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:3343:2: ( ( ( ( '[' )=>otherlv_0= '[' ) ( (lv_values_1_0= ruleValues ) ) otherlv_2= ']' ) )
            // InternalAedit.g:3344:2: ( ( ( '[' )=>otherlv_0= '[' ) ( (lv_values_1_0= ruleValues ) ) otherlv_2= ']' )
            {
            // InternalAedit.g:3344:2: ( ( ( '[' )=>otherlv_0= '[' ) ( (lv_values_1_0= ruleValues ) ) otherlv_2= ']' )
            // InternalAedit.g:3345:3: ( ( '[' )=>otherlv_0= '[' ) ( (lv_values_1_0= ruleValues ) ) otherlv_2= ']'
            {
            // InternalAedit.g:3345:3: ( ( '[' )=>otherlv_0= '[' )
            // InternalAedit.g:3346:4: ( '[' )=>otherlv_0= '['
            {
            otherlv_0=(Token)match(input,44,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0());
              			
            }

            }

            // InternalAedit.g:3352:3: ( (lv_values_1_0= ruleValues ) )
            // InternalAedit.g:3353:4: (lv_values_1_0= ruleValues )
            {
            // InternalAedit.g:3353:4: (lv_values_1_0= ruleValues )
            // InternalAedit.g:3354:5: lv_values_1_0= ruleValues
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayAccess().getValuesValuesParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_values_1_0=ruleValues();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayRule());
              					}
              					set(
              						current,
              						"values",
              						lv_values_1_0,
              						"org.aedit.Aedit.Values");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleValue"
    // InternalAedit.g:3379:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalAedit.g:3379:46: (iv_ruleValue= ruleValue EOF )
            // InternalAedit.g:3380:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:3386:1: ruleValue returns [EObject current=null] : (this_FloatValue_0= ruleFloatValue | this_IntValue_1= ruleIntValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_Null_4= ruleNull ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_FloatValue_0 = null;

        EObject this_IntValue_1 = null;

        EObject this_StringValue_2 = null;

        EObject this_BooleanValue_3 = null;

        EObject this_Null_4 = null;



        	enterRule();

        try {
            // InternalAedit.g:3392:2: ( (this_FloatValue_0= ruleFloatValue | this_IntValue_1= ruleIntValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_Null_4= ruleNull ) )
            // InternalAedit.g:3393:2: (this_FloatValue_0= ruleFloatValue | this_IntValue_1= ruleIntValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_Null_4= ruleNull )
            {
            // InternalAedit.g:3393:2: (this_FloatValue_0= ruleFloatValue | this_IntValue_1= ruleIntValue | this_StringValue_2= ruleStringValue | this_BooleanValue_3= ruleBooleanValue | this_Null_4= ruleNull )
            int alt33=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==RULE_INT) ) {
                    int LA33_6 = input.LA(3);

                    if ( (LA33_6==31) ) {
                        alt33=1;
                    }
                    else if ( (LA33_6==EOF||(LA33_6>=RULE_ID && LA33_6<=RULE_INT)||LA33_6==14||LA33_6==16||LA33_6==30||LA33_6==32||LA33_6==41||(LA33_6>=44 && LA33_6<=56)) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==31) ) {
                    alt33=1;
                }
                else if ( (LA33_2==EOF||(LA33_2>=RULE_ID && LA33_2<=RULE_INT)||LA33_2==14||LA33_2==16||LA33_2==30||LA33_2==32||LA33_2==41||(LA33_2>=44 && LA33_2<=56)) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt33=3;
                }
                break;
            case 48:
            case 49:
                {
                alt33=4;
                }
                break;
            case 46:
                {
                alt33=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalAedit.g:3394:3: this_FloatValue_0= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getFloatValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FloatValue_0=ruleFloatValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FloatValue_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAedit.g:3403:3: this_IntValue_1= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntValue_1=ruleIntValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntValue_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAedit.g:3412:3: this_StringValue_2= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getStringValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringValue_2=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringValue_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAedit.g:3421:3: this_BooleanValue_3= ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanValue_3=ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanValue_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAedit.g:3430:3: this_Null_4= ruleNull
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getValueAccess().getNullParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Null_4=ruleNull();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Null_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalAedit.g:3442:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // InternalAedit.g:3442:51: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalAedit.g:3443:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:3449:1: ruleFloatValue returns [EObject current=null] : ( (lv_val_0_0= ruleReal ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:3455:2: ( ( (lv_val_0_0= ruleReal ) ) )
            // InternalAedit.g:3456:2: ( (lv_val_0_0= ruleReal ) )
            {
            // InternalAedit.g:3456:2: ( (lv_val_0_0= ruleReal ) )
            // InternalAedit.g:3457:3: (lv_val_0_0= ruleReal )
            {
            // InternalAedit.g:3457:3: (lv_val_0_0= ruleReal )
            // InternalAedit.g:3458:4: lv_val_0_0= ruleReal
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFloatValueAccess().getValRealParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_val_0_0=ruleReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalAedit.g:3478:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalAedit.g:3478:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalAedit.g:3479:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:3485:1: ruleStringValue returns [EObject current=null] : ( (lv_val_0_0= RULE_ID ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalAedit.g:3491:2: ( ( (lv_val_0_0= RULE_ID ) ) )
            // InternalAedit.g:3492:2: ( (lv_val_0_0= RULE_ID ) )
            {
            // InternalAedit.g:3492:2: ( (lv_val_0_0= RULE_ID ) )
            // InternalAedit.g:3493:3: (lv_val_0_0= RULE_ID )
            {
            // InternalAedit.g:3493:3: (lv_val_0_0= RULE_ID )
            // InternalAedit.g:3494:4: lv_val_0_0= RULE_ID
            {
            lv_val_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_val_0_0, grammarAccess.getStringValueAccess().getValIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalAedit.g:3513:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalAedit.g:3513:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalAedit.g:3514:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:3520:1: ruleIntValue returns [EObject current=null] : ( ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_1=null;
        AntlrDatatypeRuleToken lv_val_0_2 = null;



        	enterRule();

        try {
            // InternalAedit.g:3526:2: ( ( ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) ) ) )
            // InternalAedit.g:3527:2: ( ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) ) )
            {
            // InternalAedit.g:3527:2: ( ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) ) )
            // InternalAedit.g:3528:3: ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) )
            {
            // InternalAedit.g:3528:3: ( (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt ) )
            // InternalAedit.g:3529:4: (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt )
            {
            // InternalAedit.g:3529:4: (lv_val_0_1= RULE_INT | lv_val_0_2= ruleNegativeInt )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT) ) {
                alt34=1;
            }
            else if ( (LA34_0==47) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalAedit.g:3530:5: lv_val_0_1= RULE_INT
                    {
                    lv_val_0_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_val_0_1, grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getIntValueRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"val",
                      						lv_val_0_1,
                      						"org.eclipse.xtext.common.Terminals.INT");
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalAedit.g:3545:5: lv_val_0_2= ruleNegativeInt
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getIntValueAccess().getValNegativeIntParserRuleCall_0_1());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_val_0_2=ruleNegativeInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getIntValueRule());
                      					}
                      					set(
                      						current,
                      						"val",
                      						lv_val_0_2,
                      						"org.aedit.Aedit.NegativeInt");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleNull"
    // InternalAedit.g:3566:1: entryRuleNull returns [EObject current=null] : iv_ruleNull= ruleNull EOF ;
    public final EObject entryRuleNull() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNull = null;


        try {
            // InternalAedit.g:3566:45: (iv_ruleNull= ruleNull EOF )
            // InternalAedit.g:3567:2: iv_ruleNull= ruleNull EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNull=ruleNull();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNull; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNull"


    // $ANTLR start "ruleNull"
    // InternalAedit.g:3573:1: ruleNull returns [EObject current=null] : ( (lv_val_0_0= 'null' ) ) ;
    public final EObject ruleNull() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalAedit.g:3579:2: ( ( (lv_val_0_0= 'null' ) ) )
            // InternalAedit.g:3580:2: ( (lv_val_0_0= 'null' ) )
            {
            // InternalAedit.g:3580:2: ( (lv_val_0_0= 'null' ) )
            // InternalAedit.g:3581:3: (lv_val_0_0= 'null' )
            {
            // InternalAedit.g:3581:3: (lv_val_0_0= 'null' )
            // InternalAedit.g:3582:4: lv_val_0_0= 'null'
            {
            lv_val_0_0=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_val_0_0, grammarAccess.getNullAccess().getValNullKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNullRule());
              				}
              				setWithLastConsumed(current, "val", lv_val_0_0, "null");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNull"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalAedit.g:3597:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // InternalAedit.g:3597:53: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // InternalAedit.g:3598:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalAedit.g:3604:1: ruleBooleanValue returns [EObject current=null] : ( (lv_val_0_0= ruleBoolean ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalAedit.g:3610:2: ( ( (lv_val_0_0= ruleBoolean ) ) )
            // InternalAedit.g:3611:2: ( (lv_val_0_0= ruleBoolean ) )
            {
            // InternalAedit.g:3611:2: ( (lv_val_0_0= ruleBoolean ) )
            // InternalAedit.g:3612:3: (lv_val_0_0= ruleBoolean )
            {
            // InternalAedit.g:3612:3: (lv_val_0_0= ruleBoolean )
            // InternalAedit.g:3613:4: lv_val_0_0= ruleBoolean
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getBooleanValueAccess().getValBooleanParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_val_0_0=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getBooleanValueRule());
              				}
              				set(
              					current,
              					"val",
              					lv_val_0_0,
              					"org.aedit.Aedit.Boolean");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleReal"
    // InternalAedit.g:3633:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;


        try {
            // InternalAedit.g:3633:44: (iv_ruleReal= ruleReal EOF )
            // InternalAedit.g:3634:2: iv_ruleReal= ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReal=ruleReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReal.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:3640:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalAedit.g:3646:2: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ) )
            // InternalAedit.g:3647:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            {
            // InternalAedit.g:3647:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT )
            // InternalAedit.g:3648:3: (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT
            {
            // InternalAedit.g:3648:3: (kw= '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==47) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAedit.g:3649:4: kw= '-'
                    {
                    kw=(Token)match(input,47,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getRealAccess().getINTTerminalRuleCall_1());
              		
            }
            kw=(Token)match(input,31,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_2());
              		
            }
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_3, grammarAccess.getRealAccess().getINTTerminalRuleCall_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleBoolean"
    // InternalAedit.g:3678:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalAedit.g:3678:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalAedit.g:3679:2: iv_ruleBoolean= ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalAedit.g:3685:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAedit.g:3691:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalAedit.g:3692:2: (kw= 'true' | kw= 'false' )
            {
            // InternalAedit.g:3692:2: (kw= 'true' | kw= 'false' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==48) ) {
                alt36=1;
            }
            else if ( (LA36_0==49) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalAedit.g:3693:3: kw= 'true'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAedit.g:3699:3: kw= 'false'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleNegativeInt"
    // InternalAedit.g:3708:1: entryRuleNegativeInt returns [String current=null] : iv_ruleNegativeInt= ruleNegativeInt EOF ;
    public final String entryRuleNegativeInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNegativeInt = null;


        try {
            // InternalAedit.g:3708:51: (iv_ruleNegativeInt= ruleNegativeInt EOF )
            // InternalAedit.g:3709:2: iv_ruleNegativeInt= ruleNegativeInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegativeIntRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNegativeInt=ruleNegativeInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegativeInt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNegativeInt"


    // $ANTLR start "ruleNegativeInt"
    // InternalAedit.g:3715:1: ruleNegativeInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleNegativeInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAedit.g:3721:2: ( (kw= '-' this_INT_1= RULE_INT ) )
            // InternalAedit.g:3722:2: (kw= '-' this_INT_1= RULE_INT )
            {
            // InternalAedit.g:3722:2: (kw= '-' this_INT_1= RULE_INT )
            // InternalAedit.g:3723:3: kw= '-' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,47,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getNegativeIntAccess().getHyphenMinusKeyword_0());
              		
            }
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getNegativeIntAccess().getINTTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNegativeInt"


    // $ANTLR start "entryRuleSCHEMA_TYPE"
    // InternalAedit.g:3739:1: entryRuleSCHEMA_TYPE returns [String current=null] : iv_ruleSCHEMA_TYPE= ruleSCHEMA_TYPE EOF ;
    public final String entryRuleSCHEMA_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSCHEMA_TYPE = null;


        try {
            // InternalAedit.g:3739:51: (iv_ruleSCHEMA_TYPE= ruleSCHEMA_TYPE EOF )
            // InternalAedit.g:3740:2: iv_ruleSCHEMA_TYPE= ruleSCHEMA_TYPE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSCHEMA_TYPERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSCHEMA_TYPE=ruleSCHEMA_TYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSCHEMA_TYPE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:3746:1: ruleSCHEMA_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'record' | kw= 'error' | kw= 'enum' ) ;
    public final AntlrDatatypeRuleToken ruleSCHEMA_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAedit.g:3752:2: ( (kw= 'record' | kw= 'error' | kw= 'enum' ) )
            // InternalAedit.g:3753:2: (kw= 'record' | kw= 'error' | kw= 'enum' )
            {
            // InternalAedit.g:3753:2: (kw= 'record' | kw= 'error' | kw= 'enum' )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt37=1;
                }
                break;
            case 26:
                {
                alt37=2;
                }
                break;
            case 27:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalAedit.g:3754:3: kw= 'record'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSCHEMA_TYPEAccess().getRecordKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAedit.g:3760:3: kw= 'error'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSCHEMA_TYPEAccess().getErrorKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAedit.g:3766:3: kw= 'enum'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getSCHEMA_TYPEAccess().getEnumKeyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSCHEMA_TYPE"


    // $ANTLR start "entryRuleVARIABLE_TYPE"
    // InternalAedit.g:3775:1: entryRuleVARIABLE_TYPE returns [String current=null] : iv_ruleVARIABLE_TYPE= ruleVARIABLE_TYPE EOF ;
    public final String entryRuleVARIABLE_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVARIABLE_TYPE = null;


        try {
            // InternalAedit.g:3775:53: (iv_ruleVARIABLE_TYPE= ruleVARIABLE_TYPE EOF )
            // InternalAedit.g:3776:2: iv_ruleVARIABLE_TYPE= ruleVARIABLE_TYPE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVARIABLE_TYPERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVARIABLE_TYPE=ruleVARIABLE_TYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVARIABLE_TYPE.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:3782:1: ruleVARIABLE_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'double' | kw= 'string' | kw= 'long' | kw= 'boolean' | kw= 'float' ) ;
    public final AntlrDatatypeRuleToken ruleVARIABLE_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAedit.g:3788:2: ( (kw= 'int' | kw= 'double' | kw= 'string' | kw= 'long' | kw= 'boolean' | kw= 'float' ) )
            // InternalAedit.g:3789:2: (kw= 'int' | kw= 'double' | kw= 'string' | kw= 'long' | kw= 'boolean' | kw= 'float' )
            {
            // InternalAedit.g:3789:2: (kw= 'int' | kw= 'double' | kw= 'string' | kw= 'long' | kw= 'boolean' | kw= 'float' )
            int alt38=6;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt38=1;
                }
                break;
            case 51:
                {
                alt38=2;
                }
                break;
            case 52:
                {
                alt38=3;
                }
                break;
            case 53:
                {
                alt38=4;
                }
                break;
            case 54:
                {
                alt38=5;
                }
                break;
            case 55:
                {
                alt38=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalAedit.g:3790:3: kw= 'int'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getVARIABLE_TYPEAccess().getIntKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAedit.g:3796:3: kw= 'double'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getVARIABLE_TYPEAccess().getDoubleKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAedit.g:3802:3: kw= 'string'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getVARIABLE_TYPEAccess().getStringKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAedit.g:3808:3: kw= 'long'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getVARIABLE_TYPEAccess().getLongKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAedit.g:3814:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getVARIABLE_TYPEAccess().getBooleanKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalAedit.g:3820:3: kw= 'float'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getVARIABLE_TYPEAccess().getFloatKeyword_5());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVARIABLE_TYPE"


    // $ANTLR start "entryRuleQN"
    // InternalAedit.g:3829:1: entryRuleQN returns [String current=null] : iv_ruleQN= ruleQN EOF ;
    public final String entryRuleQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQN = null;


        try {
            // InternalAedit.g:3829:42: (iv_ruleQN= ruleQN EOF )
            // InternalAedit.g:3830:2: iv_ruleQN= ruleQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQNRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQN=ruleQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAedit.g:3836:1: ruleQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalAedit.g:3842:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalAedit.g:3843:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalAedit.g:3843:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalAedit.g:3844:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQNAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalAedit.g:3851:3: (kw= '.' this_ID_2= RULE_ID )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==31) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAedit.g:3852:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQNAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQNAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQN"


    // $ANTLR start "entryRuleAN"
    // InternalAedit.g:3869:1: entryRuleAN returns [String current=null] : iv_ruleAN= ruleAN EOF ;
    public final String entryRuleAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAN = null;


        try {
            // InternalAedit.g:3869:42: (iv_ruleAN= ruleAN EOF )
            // InternalAedit.g:3870:2: iv_ruleAN= ruleAN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getANRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAN=ruleAN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAN"


    // $ANTLR start "ruleAN"
    // InternalAedit.g:3876:1: ruleAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '@' this_ID_1= RULE_ID (kw= '-' this_ID_3= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalAedit.g:3882:2: ( (kw= '@' this_ID_1= RULE_ID (kw= '-' this_ID_3= RULE_ID )* ) )
            // InternalAedit.g:3883:2: (kw= '@' this_ID_1= RULE_ID (kw= '-' this_ID_3= RULE_ID )* )
            {
            // InternalAedit.g:3883:2: (kw= '@' this_ID_1= RULE_ID (kw= '-' this_ID_3= RULE_ID )* )
            // InternalAedit.g:3884:3: kw= '@' this_ID_1= RULE_ID (kw= '-' this_ID_3= RULE_ID )*
            {
            kw=(Token)match(input,56,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getANAccess().getCommercialAtKeyword_0());
              		
            }
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_1, grammarAccess.getANAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalAedit.g:3896:3: (kw= '-' this_ID_3= RULE_ID )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==47) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAedit.g:3897:4: kw= '-' this_ID_3= RULE_ID
            	    {
            	    kw=(Token)match(input,47,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getANAccess().getHyphenMinusKeyword_2_0());
            	      			
            	    }
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_3, grammarAccess.getANAccess().getIDTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAN"

    // $ANTLR start synpred2_InternalAedit
    public final void synpred2_InternalAedit_fragment() throws RecognitionException {   
        // InternalAedit.g:3259:5: ( '[' )
        // InternalAedit.g:3259:6: '['
        {
        match(input,44,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalAedit

    // Delegated rules

    public final boolean synpred2_InternalAedit() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalAedit_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000611484000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000FE10E84000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000610004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x01FC020000004010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x01FC020000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0003C00000000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00FC000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0003D00000000030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0003D00040000030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0003D00000000032L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0003D00100000032L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0003F00000000030L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000002L});

}