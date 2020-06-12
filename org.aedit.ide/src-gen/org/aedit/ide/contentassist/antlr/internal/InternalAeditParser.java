package org.aedit.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.aedit.services.AeditGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAeditParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'record'", "'error'", "'true'", "'false'", "'enum'", "'int'", "'double'", "'string'", "'long'", "'boolean'", "'float'", "'feature'", "'{'", "'}'", "':'", "'use'", "';'", "'ruleset'", "'rule'", "'add.annot'", "'=>'", "'add.name_annot'", "'remove.annot'", "'remove.name_annot'", "'change'", "'add.at'", "'('", "')'", "'.'", "','", "'remove'", "'rename'", "'set_val'", "'set_type'", "'remove_value'", "'remove_value.at'", "'add_value.at'", "'='", "'array'", "'<'", "'>'", "'['", "']'", "'-'", "'@'", "'null'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(AeditGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalAedit.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAedit.g:55:1: ( ruleModel EOF )
            // InternalAedit.g:56:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAedit.g:63:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:67:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalAedit.g:68:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalAedit.g:68:2: ( ( rule__Model__Group__0 ) )
            // InternalAedit.g:69:3: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // InternalAedit.g:70:3: ( rule__Model__Group__0 )
            // InternalAedit.g:70:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFeature"
    // InternalAedit.g:79:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalAedit.g:80:1: ( ruleFeature EOF )
            // InternalAedit.g:81:1: ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalAedit.g:88:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:92:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalAedit.g:93:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalAedit.g:93:2: ( ( rule__Feature__Group__0 ) )
            // InternalAedit.g:94:3: ( rule__Feature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getGroup()); 
            }
            // InternalAedit.g:95:3: ( rule__Feature__Group__0 )
            // InternalAedit.g:95:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleFeatureMap"
    // InternalAedit.g:104:1: entryRuleFeatureMap : ruleFeatureMap EOF ;
    public final void entryRuleFeatureMap() throws RecognitionException {
        try {
            // InternalAedit.g:105:1: ( ruleFeatureMap EOF )
            // InternalAedit.g:106:1: ruleFeatureMap EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureMapRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFeatureMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureMapRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureMap"


    // $ANTLR start "ruleFeatureMap"
    // InternalAedit.g:113:1: ruleFeatureMap : ( ( rule__FeatureMap__Group__0 ) ) ;
    public final void ruleFeatureMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:117:2: ( ( ( rule__FeatureMap__Group__0 ) ) )
            // InternalAedit.g:118:2: ( ( rule__FeatureMap__Group__0 ) )
            {
            // InternalAedit.g:118:2: ( ( rule__FeatureMap__Group__0 ) )
            // InternalAedit.g:119:3: ( rule__FeatureMap__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureMapAccess().getGroup()); 
            }
            // InternalAedit.g:120:3: ( rule__FeatureMap__Group__0 )
            // InternalAedit.g:120:4: rule__FeatureMap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureMap__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureMapAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureMap"


    // $ANTLR start "entryRuleRuleMap"
    // InternalAedit.g:129:1: entryRuleRuleMap : ruleRuleMap EOF ;
    public final void entryRuleRuleMap() throws RecognitionException {
        try {
            // InternalAedit.g:130:1: ( ruleRuleMap EOF )
            // InternalAedit.g:131:1: ruleRuleMap EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleMapRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRuleMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleMapRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleMap"


    // $ANTLR start "ruleRuleMap"
    // InternalAedit.g:138:1: ruleRuleMap : ( ( rule__RuleMap__Group__0 ) ) ;
    public final void ruleRuleMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:142:2: ( ( ( rule__RuleMap__Group__0 ) ) )
            // InternalAedit.g:143:2: ( ( rule__RuleMap__Group__0 ) )
            {
            // InternalAedit.g:143:2: ( ( rule__RuleMap__Group__0 ) )
            // InternalAedit.g:144:3: ( rule__RuleMap__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleMapAccess().getGroup()); 
            }
            // InternalAedit.g:145:3: ( rule__RuleMap__Group__0 )
            // InternalAedit.g:145:4: rule__RuleMap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleMap__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleMapAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleMap"


    // $ANTLR start "entryRuleRuleDeclaration"
    // InternalAedit.g:154:1: entryRuleRuleDeclaration : ruleRuleDeclaration EOF ;
    public final void entryRuleRuleDeclaration() throws RecognitionException {
        try {
            // InternalAedit.g:155:1: ( ruleRuleDeclaration EOF )
            // InternalAedit.g:156:1: ruleRuleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRuleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleDeclaration"


    // $ANTLR start "ruleRuleDeclaration"
    // InternalAedit.g:163:1: ruleRuleDeclaration : ( ( rule__RuleDeclaration__Group__0 ) ) ;
    public final void ruleRuleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:167:2: ( ( ( rule__RuleDeclaration__Group__0 ) ) )
            // InternalAedit.g:168:2: ( ( rule__RuleDeclaration__Group__0 ) )
            {
            // InternalAedit.g:168:2: ( ( rule__RuleDeclaration__Group__0 ) )
            // InternalAedit.g:169:3: ( rule__RuleDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleDeclarationAccess().getGroup()); 
            }
            // InternalAedit.g:170:3: ( rule__RuleDeclaration__Group__0 )
            // InternalAedit.g:170:4: rule__RuleDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleDeclaration"


    // $ANTLR start "entryRuleGenericRule"
    // InternalAedit.g:179:1: entryRuleGenericRule : ruleGenericRule EOF ;
    public final void entryRuleGenericRule() throws RecognitionException {
        try {
            // InternalAedit.g:180:1: ( ruleGenericRule EOF )
            // InternalAedit.g:181:1: ruleGenericRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGenericRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGenericRule"


    // $ANTLR start "ruleGenericRule"
    // InternalAedit.g:188:1: ruleGenericRule : ( ( rule__GenericRule__Alternatives ) ) ;
    public final void ruleGenericRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:192:2: ( ( ( rule__GenericRule__Alternatives ) ) )
            // InternalAedit.g:193:2: ( ( rule__GenericRule__Alternatives ) )
            {
            // InternalAedit.g:193:2: ( ( rule__GenericRule__Alternatives ) )
            // InternalAedit.g:194:3: ( rule__GenericRule__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGenericRuleAccess().getAlternatives()); 
            }
            // InternalAedit.g:195:3: ( rule__GenericRule__Alternatives )
            // InternalAedit.g:195:4: rule__GenericRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GenericRule__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGenericRuleAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenericRule"


    // $ANTLR start "entryRuleSchemaRule"
    // InternalAedit.g:204:1: entryRuleSchemaRule : ruleSchemaRule EOF ;
    public final void entryRuleSchemaRule() throws RecognitionException {
        try {
            // InternalAedit.g:205:1: ( ruleSchemaRule EOF )
            // InternalAedit.g:206:1: ruleSchemaRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSchemaRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSchemaRule"


    // $ANTLR start "ruleSchemaRule"
    // InternalAedit.g:213:1: ruleSchemaRule : ( ( rule__SchemaRule__Alternatives ) ) ;
    public final void ruleSchemaRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:217:2: ( ( ( rule__SchemaRule__Alternatives ) ) )
            // InternalAedit.g:218:2: ( ( rule__SchemaRule__Alternatives ) )
            {
            // InternalAedit.g:218:2: ( ( rule__SchemaRule__Alternatives ) )
            // InternalAedit.g:219:3: ( rule__SchemaRule__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaRuleAccess().getAlternatives()); 
            }
            // InternalAedit.g:220:3: ( rule__SchemaRule__Alternatives )
            // InternalAedit.g:220:4: rule__SchemaRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SchemaRule__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaRuleAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchemaRule"


    // $ANTLR start "entryRuleArrayEditRules"
    // InternalAedit.g:229:1: entryRuleArrayEditRules : ruleArrayEditRules EOF ;
    public final void entryRuleArrayEditRules() throws RecognitionException {
        try {
            // InternalAedit.g:230:1: ( ruleArrayEditRules EOF )
            // InternalAedit.g:231:1: ruleArrayEditRules EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayEditRulesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArrayEditRules();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayEditRulesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayEditRules"


    // $ANTLR start "ruleArrayEditRules"
    // InternalAedit.g:238:1: ruleArrayEditRules : ( ( rule__ArrayEditRules__Alternatives ) ) ;
    public final void ruleArrayEditRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:242:2: ( ( ( rule__ArrayEditRules__Alternatives ) ) )
            // InternalAedit.g:243:2: ( ( rule__ArrayEditRules__Alternatives ) )
            {
            // InternalAedit.g:243:2: ( ( rule__ArrayEditRules__Alternatives ) )
            // InternalAedit.g:244:3: ( rule__ArrayEditRules__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayEditRulesAccess().getAlternatives()); 
            }
            // InternalAedit.g:245:3: ( rule__ArrayEditRules__Alternatives )
            // InternalAedit.g:245:4: rule__ArrayEditRules__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArrayEditRules__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayEditRulesAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayEditRules"


    // $ANTLR start "entryRuleEnumRule"
    // InternalAedit.g:254:1: entryRuleEnumRule : ruleEnumRule EOF ;
    public final void entryRuleEnumRule() throws RecognitionException {
        try {
            // InternalAedit.g:255:1: ( ruleEnumRule EOF )
            // InternalAedit.g:256:1: ruleEnumRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnumRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumRuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumRule"


    // $ANTLR start "ruleEnumRule"
    // InternalAedit.g:263:1: ruleEnumRule : ( ( rule__EnumRule__Alternatives ) ) ;
    public final void ruleEnumRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:267:2: ( ( ( rule__EnumRule__Alternatives ) ) )
            // InternalAedit.g:268:2: ( ( rule__EnumRule__Alternatives ) )
            {
            // InternalAedit.g:268:2: ( ( rule__EnumRule__Alternatives ) )
            // InternalAedit.g:269:3: ( rule__EnumRule__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumRuleAccess().getAlternatives()); 
            }
            // InternalAedit.g:270:3: ( rule__EnumRule__Alternatives )
            // InternalAedit.g:270:4: rule__EnumRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EnumRule__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumRuleAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumRule"


    // $ANTLR start "entryRuleAddAnnotationToSchema"
    // InternalAedit.g:279:1: entryRuleAddAnnotationToSchema : ruleAddAnnotationToSchema EOF ;
    public final void entryRuleAddAnnotationToSchema() throws RecognitionException {
        try {
            // InternalAedit.g:280:1: ( ruleAddAnnotationToSchema EOF )
            // InternalAedit.g:281:1: ruleAddAnnotationToSchema EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToSchemaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddAnnotationToSchema();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToSchemaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddAnnotationToSchema"


    // $ANTLR start "ruleAddAnnotationToSchema"
    // InternalAedit.g:288:1: ruleAddAnnotationToSchema : ( ( rule__AddAnnotationToSchema__Group__0 ) ) ;
    public final void ruleAddAnnotationToSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:292:2: ( ( ( rule__AddAnnotationToSchema__Group__0 ) ) )
            // InternalAedit.g:293:2: ( ( rule__AddAnnotationToSchema__Group__0 ) )
            {
            // InternalAedit.g:293:2: ( ( rule__AddAnnotationToSchema__Group__0 ) )
            // InternalAedit.g:294:3: ( rule__AddAnnotationToSchema__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToSchemaAccess().getGroup()); 
            }
            // InternalAedit.g:295:3: ( rule__AddAnnotationToSchema__Group__0 )
            // InternalAedit.g:295:4: rule__AddAnnotationToSchema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToSchema__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToSchemaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddAnnotationToSchema"


    // $ANTLR start "entryRuleAddAnnotationToField"
    // InternalAedit.g:304:1: entryRuleAddAnnotationToField : ruleAddAnnotationToField EOF ;
    public final void entryRuleAddAnnotationToField() throws RecognitionException {
        try {
            // InternalAedit.g:305:1: ( ruleAddAnnotationToField EOF )
            // InternalAedit.g:306:1: ruleAddAnnotationToField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddAnnotationToField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddAnnotationToField"


    // $ANTLR start "ruleAddAnnotationToField"
    // InternalAedit.g:313:1: ruleAddAnnotationToField : ( ( rule__AddAnnotationToField__Group__0 ) ) ;
    public final void ruleAddAnnotationToField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:317:2: ( ( ( rule__AddAnnotationToField__Group__0 ) ) )
            // InternalAedit.g:318:2: ( ( rule__AddAnnotationToField__Group__0 ) )
            {
            // InternalAedit.g:318:2: ( ( rule__AddAnnotationToField__Group__0 ) )
            // InternalAedit.g:319:3: ( rule__AddAnnotationToField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToFieldAccess().getGroup()); 
            }
            // InternalAedit.g:320:3: ( rule__AddAnnotationToField__Group__0 )
            // InternalAedit.g:320:4: rule__AddAnnotationToField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddAnnotationToField"


    // $ANTLR start "entryRuleAddNameAnnotationToField"
    // InternalAedit.g:329:1: entryRuleAddNameAnnotationToField : ruleAddNameAnnotationToField EOF ;
    public final void entryRuleAddNameAnnotationToField() throws RecognitionException {
        try {
            // InternalAedit.g:330:1: ( ruleAddNameAnnotationToField EOF )
            // InternalAedit.g:331:1: ruleAddNameAnnotationToField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddNameAnnotationToFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddNameAnnotationToField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddNameAnnotationToFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddNameAnnotationToField"


    // $ANTLR start "ruleAddNameAnnotationToField"
    // InternalAedit.g:338:1: ruleAddNameAnnotationToField : ( ( rule__AddNameAnnotationToField__Group__0 ) ) ;
    public final void ruleAddNameAnnotationToField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:342:2: ( ( ( rule__AddNameAnnotationToField__Group__0 ) ) )
            // InternalAedit.g:343:2: ( ( rule__AddNameAnnotationToField__Group__0 ) )
            {
            // InternalAedit.g:343:2: ( ( rule__AddNameAnnotationToField__Group__0 ) )
            // InternalAedit.g:344:3: ( rule__AddNameAnnotationToField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddNameAnnotationToFieldAccess().getGroup()); 
            }
            // InternalAedit.g:345:3: ( rule__AddNameAnnotationToField__Group__0 )
            // InternalAedit.g:345:4: rule__AddNameAnnotationToField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddNameAnnotationToField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddNameAnnotationToFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddNameAnnotationToField"


    // $ANTLR start "entryRuleRemoveAnnotationFromSchema"
    // InternalAedit.g:354:1: entryRuleRemoveAnnotationFromSchema : ruleRemoveAnnotationFromSchema EOF ;
    public final void entryRuleRemoveAnnotationFromSchema() throws RecognitionException {
        try {
            // InternalAedit.g:355:1: ( ruleRemoveAnnotationFromSchema EOF )
            // InternalAedit.g:356:1: ruleRemoveAnnotationFromSchema EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRemoveAnnotationFromSchema();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromSchemaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRemoveAnnotationFromSchema"


    // $ANTLR start "ruleRemoveAnnotationFromSchema"
    // InternalAedit.g:363:1: ruleRemoveAnnotationFromSchema : ( ( rule__RemoveAnnotationFromSchema__Group__0 ) ) ;
    public final void ruleRemoveAnnotationFromSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:367:2: ( ( ( rule__RemoveAnnotationFromSchema__Group__0 ) ) )
            // InternalAedit.g:368:2: ( ( rule__RemoveAnnotationFromSchema__Group__0 ) )
            {
            // InternalAedit.g:368:2: ( ( rule__RemoveAnnotationFromSchema__Group__0 ) )
            // InternalAedit.g:369:3: ( rule__RemoveAnnotationFromSchema__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaAccess().getGroup()); 
            }
            // InternalAedit.g:370:3: ( rule__RemoveAnnotationFromSchema__Group__0 )
            // InternalAedit.g:370:4: rule__RemoveAnnotationFromSchema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromSchema__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromSchemaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRemoveAnnotationFromSchema"


    // $ANTLR start "entryRuleRemoveAnnotationFromField"
    // InternalAedit.g:379:1: entryRuleRemoveAnnotationFromField : ruleRemoveAnnotationFromField EOF ;
    public final void entryRuleRemoveAnnotationFromField() throws RecognitionException {
        try {
            // InternalAedit.g:380:1: ( ruleRemoveAnnotationFromField EOF )
            // InternalAedit.g:381:1: ruleRemoveAnnotationFromField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRemoveAnnotationFromField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRemoveAnnotationFromField"


    // $ANTLR start "ruleRemoveAnnotationFromField"
    // InternalAedit.g:388:1: ruleRemoveAnnotationFromField : ( ( rule__RemoveAnnotationFromField__Group__0 ) ) ;
    public final void ruleRemoveAnnotationFromField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:392:2: ( ( ( rule__RemoveAnnotationFromField__Group__0 ) ) )
            // InternalAedit.g:393:2: ( ( rule__RemoveAnnotationFromField__Group__0 ) )
            {
            // InternalAedit.g:393:2: ( ( rule__RemoveAnnotationFromField__Group__0 ) )
            // InternalAedit.g:394:3: ( rule__RemoveAnnotationFromField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromFieldAccess().getGroup()); 
            }
            // InternalAedit.g:395:3: ( rule__RemoveAnnotationFromField__Group__0 )
            // InternalAedit.g:395:4: rule__RemoveAnnotationFromField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRemoveAnnotationFromField"


    // $ANTLR start "entryRuleRemoveNameAnnotationFromField"
    // InternalAedit.g:404:1: entryRuleRemoveNameAnnotationFromField : ruleRemoveNameAnnotationFromField EOF ;
    public final void entryRuleRemoveNameAnnotationFromField() throws RecognitionException {
        try {
            // InternalAedit.g:405:1: ( ruleRemoveNameAnnotationFromField EOF )
            // InternalAedit.g:406:1: ruleRemoveNameAnnotationFromField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveNameAnnotationFromFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRemoveNameAnnotationFromField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveNameAnnotationFromFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRemoveNameAnnotationFromField"


    // $ANTLR start "ruleRemoveNameAnnotationFromField"
    // InternalAedit.g:413:1: ruleRemoveNameAnnotationFromField : ( ( rule__RemoveNameAnnotationFromField__Group__0 ) ) ;
    public final void ruleRemoveNameAnnotationFromField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:417:2: ( ( ( rule__RemoveNameAnnotationFromField__Group__0 ) ) )
            // InternalAedit.g:418:2: ( ( rule__RemoveNameAnnotationFromField__Group__0 ) )
            {
            // InternalAedit.g:418:2: ( ( rule__RemoveNameAnnotationFromField__Group__0 ) )
            // InternalAedit.g:419:3: ( rule__RemoveNameAnnotationFromField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getGroup()); 
            }
            // InternalAedit.g:420:3: ( rule__RemoveNameAnnotationFromField__Group__0 )
            // InternalAedit.g:420:4: rule__RemoveNameAnnotationFromField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RemoveNameAnnotationFromField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRemoveNameAnnotationFromField"


    // $ANTLR start "entryRuleChangeSchema"
    // InternalAedit.g:429:1: entryRuleChangeSchema : ruleChangeSchema EOF ;
    public final void entryRuleChangeSchema() throws RecognitionException {
        try {
            // InternalAedit.g:430:1: ( ruleChangeSchema EOF )
            // InternalAedit.g:431:1: ruleChangeSchema EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeSchemaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleChangeSchema();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeSchemaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChangeSchema"


    // $ANTLR start "ruleChangeSchema"
    // InternalAedit.g:438:1: ruleChangeSchema : ( ( rule__ChangeSchema__Group__0 ) ) ;
    public final void ruleChangeSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:442:2: ( ( ( rule__ChangeSchema__Group__0 ) ) )
            // InternalAedit.g:443:2: ( ( rule__ChangeSchema__Group__0 ) )
            {
            // InternalAedit.g:443:2: ( ( rule__ChangeSchema__Group__0 ) )
            // InternalAedit.g:444:3: ( rule__ChangeSchema__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeSchemaAccess().getGroup()); 
            }
            // InternalAedit.g:445:3: ( rule__ChangeSchema__Group__0 )
            // InternalAedit.g:445:4: rule__ChangeSchema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeSchema__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeSchemaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChangeSchema"


    // $ANTLR start "entryRuleChangeEnum"
    // InternalAedit.g:454:1: entryRuleChangeEnum : ruleChangeEnum EOF ;
    public final void entryRuleChangeEnum() throws RecognitionException {
        try {
            // InternalAedit.g:455:1: ( ruleChangeEnum EOF )
            // InternalAedit.g:456:1: ruleChangeEnum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleChangeEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeEnumRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChangeEnum"


    // $ANTLR start "ruleChangeEnum"
    // InternalAedit.g:463:1: ruleChangeEnum : ( ( rule__ChangeEnum__Group__0 ) ) ;
    public final void ruleChangeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:467:2: ( ( ( rule__ChangeEnum__Group__0 ) ) )
            // InternalAedit.g:468:2: ( ( rule__ChangeEnum__Group__0 ) )
            {
            // InternalAedit.g:468:2: ( ( rule__ChangeEnum__Group__0 ) )
            // InternalAedit.g:469:3: ( rule__ChangeEnum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeEnumAccess().getGroup()); 
            }
            // InternalAedit.g:470:3: ( rule__ChangeEnum__Group__0 )
            // InternalAedit.g:470:4: rule__ChangeEnum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeEnum__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeEnumAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChangeEnum"


    // $ANTLR start "entryRuleAdd"
    // InternalAedit.g:479:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalAedit.g:480:1: ( ruleAdd EOF )
            // InternalAedit.g:481:1: ruleAdd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAdd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalAedit.g:488:1: ruleAdd : ( ( rule__Add__Alternatives ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:492:2: ( ( ( rule__Add__Alternatives ) ) )
            // InternalAedit.g:493:2: ( ( rule__Add__Alternatives ) )
            {
            // InternalAedit.g:493:2: ( ( rule__Add__Alternatives ) )
            // InternalAedit.g:494:3: ( rule__Add__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAccess().getAlternatives()); 
            }
            // InternalAedit.g:495:3: ( rule__Add__Alternatives )
            // InternalAedit.g:495:4: rule__Add__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Add__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleAddRecord"
    // InternalAedit.g:504:1: entryRuleAddRecord : ruleAddRecord EOF ;
    public final void entryRuleAddRecord() throws RecognitionException {
        try {
            // InternalAedit.g:505:1: ( ruleAddRecord EOF )
            // InternalAedit.g:506:1: ruleAddRecord EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddRecord();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddRecord"


    // $ANTLR start "ruleAddRecord"
    // InternalAedit.g:513:1: ruleAddRecord : ( ( rule__AddRecord__Group__0 ) ) ;
    public final void ruleAddRecord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:517:2: ( ( ( rule__AddRecord__Group__0 ) ) )
            // InternalAedit.g:518:2: ( ( rule__AddRecord__Group__0 ) )
            {
            // InternalAedit.g:518:2: ( ( rule__AddRecord__Group__0 ) )
            // InternalAedit.g:519:3: ( rule__AddRecord__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getGroup()); 
            }
            // InternalAedit.g:520:3: ( rule__AddRecord__Group__0 )
            // InternalAedit.g:520:4: rule__AddRecord__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddRecord"


    // $ANTLR start "entryRuleAddError"
    // InternalAedit.g:529:1: entryRuleAddError : ruleAddError EOF ;
    public final void entryRuleAddError() throws RecognitionException {
        try {
            // InternalAedit.g:530:1: ( ruleAddError EOF )
            // InternalAedit.g:531:1: ruleAddError EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddError();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddError"


    // $ANTLR start "ruleAddError"
    // InternalAedit.g:538:1: ruleAddError : ( ( rule__AddError__Group__0 ) ) ;
    public final void ruleAddError() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:542:2: ( ( ( rule__AddError__Group__0 ) ) )
            // InternalAedit.g:543:2: ( ( rule__AddError__Group__0 ) )
            {
            // InternalAedit.g:543:2: ( ( rule__AddError__Group__0 ) )
            // InternalAedit.g:544:3: ( rule__AddError__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getGroup()); 
            }
            // InternalAedit.g:545:3: ( rule__AddError__Group__0 )
            // InternalAedit.g:545:4: rule__AddError__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddError__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddError"


    // $ANTLR start "entryRuleAddEnumeration"
    // InternalAedit.g:554:1: entryRuleAddEnumeration : ruleAddEnumeration EOF ;
    public final void entryRuleAddEnumeration() throws RecognitionException {
        try {
            // InternalAedit.g:555:1: ( ruleAddEnumeration EOF )
            // InternalAedit.g:556:1: ruleAddEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddEnumeration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddEnumeration"


    // $ANTLR start "ruleAddEnumeration"
    // InternalAedit.g:563:1: ruleAddEnumeration : ( ( rule__AddEnumeration__Group__0 ) ) ;
    public final void ruleAddEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:567:2: ( ( ( rule__AddEnumeration__Group__0 ) ) )
            // InternalAedit.g:568:2: ( ( rule__AddEnumeration__Group__0 ) )
            {
            // InternalAedit.g:568:2: ( ( rule__AddEnumeration__Group__0 ) )
            // InternalAedit.g:569:3: ( rule__AddEnumeration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getGroup()); 
            }
            // InternalAedit.g:570:3: ( rule__AddEnumeration__Group__0 )
            // InternalAedit.g:570:4: rule__AddEnumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddEnumeration"


    // $ANTLR start "entryRuleAddVariable"
    // InternalAedit.g:579:1: entryRuleAddVariable : ruleAddVariable EOF ;
    public final void entryRuleAddVariable() throws RecognitionException {
        try {
            // InternalAedit.g:580:1: ( ruleAddVariable EOF )
            // InternalAedit.g:581:1: ruleAddVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddVariable"


    // $ANTLR start "ruleAddVariable"
    // InternalAedit.g:588:1: ruleAddVariable : ( ( rule__AddVariable__Group__0 ) ) ;
    public final void ruleAddVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:592:2: ( ( ( rule__AddVariable__Group__0 ) ) )
            // InternalAedit.g:593:2: ( ( rule__AddVariable__Group__0 ) )
            {
            // InternalAedit.g:593:2: ( ( rule__AddVariable__Group__0 ) )
            // InternalAedit.g:594:3: ( rule__AddVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddVariableAccess().getGroup()); 
            }
            // InternalAedit.g:595:3: ( rule__AddVariable__Group__0 )
            // InternalAedit.g:595:4: rule__AddVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddVariable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddVariable"


    // $ANTLR start "entryRuleAddEnum"
    // InternalAedit.g:604:1: entryRuleAddEnum : ruleAddEnum EOF ;
    public final void entryRuleAddEnum() throws RecognitionException {
        try {
            // InternalAedit.g:605:1: ( ruleAddEnum EOF )
            // InternalAedit.g:606:1: ruleAddEnum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddEnum"


    // $ANTLR start "ruleAddEnum"
    // InternalAedit.g:613:1: ruleAddEnum : ( ( rule__AddEnum__Group__0 ) ) ;
    public final void ruleAddEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:617:2: ( ( ( rule__AddEnum__Group__0 ) ) )
            // InternalAedit.g:618:2: ( ( rule__AddEnum__Group__0 ) )
            {
            // InternalAedit.g:618:2: ( ( rule__AddEnum__Group__0 ) )
            // InternalAedit.g:619:3: ( rule__AddEnum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumAccess().getGroup()); 
            }
            // InternalAedit.g:620:3: ( rule__AddEnum__Group__0 )
            // InternalAedit.g:620:4: rule__AddEnum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddEnum__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddEnum"


    // $ANTLR start "entryRuleRemoveSchema"
    // InternalAedit.g:629:1: entryRuleRemoveSchema : ruleRemoveSchema EOF ;
    public final void entryRuleRemoveSchema() throws RecognitionException {
        try {
            // InternalAedit.g:630:1: ( ruleRemoveSchema EOF )
            // InternalAedit.g:631:1: ruleRemoveSchema EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveSchemaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRemoveSchema();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveSchemaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRemoveSchema"


    // $ANTLR start "ruleRemoveSchema"
    // InternalAedit.g:638:1: ruleRemoveSchema : ( ( rule__RemoveSchema__Group__0 ) ) ;
    public final void ruleRemoveSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:642:2: ( ( ( rule__RemoveSchema__Group__0 ) ) )
            // InternalAedit.g:643:2: ( ( rule__RemoveSchema__Group__0 ) )
            {
            // InternalAedit.g:643:2: ( ( rule__RemoveSchema__Group__0 ) )
            // InternalAedit.g:644:3: ( rule__RemoveSchema__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveSchemaAccess().getGroup()); 
            }
            // InternalAedit.g:645:3: ( rule__RemoveSchema__Group__0 )
            // InternalAedit.g:645:4: rule__RemoveSchema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RemoveSchema__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveSchemaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRemoveSchema"


    // $ANTLR start "entryRuleRemoveVariable"
    // InternalAedit.g:654:1: entryRuleRemoveVariable : ruleRemoveVariable EOF ;
    public final void entryRuleRemoveVariable() throws RecognitionException {
        try {
            // InternalAedit.g:655:1: ( ruleRemoveVariable EOF )
            // InternalAedit.g:656:1: ruleRemoveVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRemoveVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRemoveVariable"


    // $ANTLR start "ruleRemoveVariable"
    // InternalAedit.g:663:1: ruleRemoveVariable : ( ( rule__RemoveVariable__Group__0 ) ) ;
    public final void ruleRemoveVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:667:2: ( ( ( rule__RemoveVariable__Group__0 ) ) )
            // InternalAedit.g:668:2: ( ( rule__RemoveVariable__Group__0 ) )
            {
            // InternalAedit.g:668:2: ( ( rule__RemoveVariable__Group__0 ) )
            // InternalAedit.g:669:3: ( rule__RemoveVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveVariableAccess().getGroup()); 
            }
            // InternalAedit.g:670:3: ( rule__RemoveVariable__Group__0 )
            // InternalAedit.g:670:4: rule__RemoveVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RemoveVariable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRemoveVariable"


    // $ANTLR start "entryRuleRemoveEnum"
    // InternalAedit.g:679:1: entryRuleRemoveEnum : ruleRemoveEnum EOF ;
    public final void entryRuleRemoveEnum() throws RecognitionException {
        try {
            // InternalAedit.g:680:1: ( ruleRemoveEnum EOF )
            // InternalAedit.g:681:1: ruleRemoveEnum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRemoveEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveEnumRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRemoveEnum"


    // $ANTLR start "ruleRemoveEnum"
    // InternalAedit.g:688:1: ruleRemoveEnum : ( ( rule__RemoveEnum__Group__0 ) ) ;
    public final void ruleRemoveEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:692:2: ( ( ( rule__RemoveEnum__Group__0 ) ) )
            // InternalAedit.g:693:2: ( ( rule__RemoveEnum__Group__0 ) )
            {
            // InternalAedit.g:693:2: ( ( rule__RemoveEnum__Group__0 ) )
            // InternalAedit.g:694:3: ( rule__RemoveEnum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveEnumAccess().getGroup()); 
            }
            // InternalAedit.g:695:3: ( rule__RemoveEnum__Group__0 )
            // InternalAedit.g:695:4: rule__RemoveEnum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RemoveEnum__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveEnumAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRemoveEnum"


    // $ANTLR start "entryRuleRenameSchema"
    // InternalAedit.g:704:1: entryRuleRenameSchema : ruleRenameSchema EOF ;
    public final void entryRuleRenameSchema() throws RecognitionException {
        try {
            // InternalAedit.g:705:1: ( ruleRenameSchema EOF )
            // InternalAedit.g:706:1: ruleRenameSchema EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameSchemaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRenameSchema();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameSchemaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameSchema"


    // $ANTLR start "ruleRenameSchema"
    // InternalAedit.g:713:1: ruleRenameSchema : ( ( rule__RenameSchema__Group__0 ) ) ;
    public final void ruleRenameSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:717:2: ( ( ( rule__RenameSchema__Group__0 ) ) )
            // InternalAedit.g:718:2: ( ( rule__RenameSchema__Group__0 ) )
            {
            // InternalAedit.g:718:2: ( ( rule__RenameSchema__Group__0 ) )
            // InternalAedit.g:719:3: ( rule__RenameSchema__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameSchemaAccess().getGroup()); 
            }
            // InternalAedit.g:720:3: ( rule__RenameSchema__Group__0 )
            // InternalAedit.g:720:4: rule__RenameSchema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenameSchema__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameSchemaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameSchema"


    // $ANTLR start "entryRuleRenameVariable"
    // InternalAedit.g:729:1: entryRuleRenameVariable : ruleRenameVariable EOF ;
    public final void entryRuleRenameVariable() throws RecognitionException {
        try {
            // InternalAedit.g:730:1: ( ruleRenameVariable EOF )
            // InternalAedit.g:731:1: ruleRenameVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRenameVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameVariable"


    // $ANTLR start "ruleRenameVariable"
    // InternalAedit.g:738:1: ruleRenameVariable : ( ( rule__RenameVariable__Group__0 ) ) ;
    public final void ruleRenameVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:742:2: ( ( ( rule__RenameVariable__Group__0 ) ) )
            // InternalAedit.g:743:2: ( ( rule__RenameVariable__Group__0 ) )
            {
            // InternalAedit.g:743:2: ( ( rule__RenameVariable__Group__0 ) )
            // InternalAedit.g:744:3: ( rule__RenameVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameVariableAccess().getGroup()); 
            }
            // InternalAedit.g:745:3: ( rule__RenameVariable__Group__0 )
            // InternalAedit.g:745:4: rule__RenameVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenameVariable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameVariable"


    // $ANTLR start "entryRuleRenameEnum"
    // InternalAedit.g:754:1: entryRuleRenameEnum : ruleRenameEnum EOF ;
    public final void entryRuleRenameEnum() throws RecognitionException {
        try {
            // InternalAedit.g:755:1: ( ruleRenameEnum EOF )
            // InternalAedit.g:756:1: ruleRenameEnum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRenameEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameEnumRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRenameEnum"


    // $ANTLR start "ruleRenameEnum"
    // InternalAedit.g:763:1: ruleRenameEnum : ( ( rule__RenameEnum__Group__0 ) ) ;
    public final void ruleRenameEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:767:2: ( ( ( rule__RenameEnum__Group__0 ) ) )
            // InternalAedit.g:768:2: ( ( rule__RenameEnum__Group__0 ) )
            {
            // InternalAedit.g:768:2: ( ( rule__RenameEnum__Group__0 ) )
            // InternalAedit.g:769:3: ( rule__RenameEnum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameEnumAccess().getGroup()); 
            }
            // InternalAedit.g:770:3: ( rule__RenameEnum__Group__0 )
            // InternalAedit.g:770:4: rule__RenameEnum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenameEnum__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameEnumAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRenameEnum"


    // $ANTLR start "entryRuleChangeDefValue"
    // InternalAedit.g:779:1: entryRuleChangeDefValue : ruleChangeDefValue EOF ;
    public final void entryRuleChangeDefValue() throws RecognitionException {
        try {
            // InternalAedit.g:780:1: ( ruleChangeDefValue EOF )
            // InternalAedit.g:781:1: ruleChangeDefValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeDefValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleChangeDefValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeDefValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChangeDefValue"


    // $ANTLR start "ruleChangeDefValue"
    // InternalAedit.g:788:1: ruleChangeDefValue : ( ( rule__ChangeDefValue__Group__0 ) ) ;
    public final void ruleChangeDefValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:792:2: ( ( ( rule__ChangeDefValue__Group__0 ) ) )
            // InternalAedit.g:793:2: ( ( rule__ChangeDefValue__Group__0 ) )
            {
            // InternalAedit.g:793:2: ( ( rule__ChangeDefValue__Group__0 ) )
            // InternalAedit.g:794:3: ( rule__ChangeDefValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeDefValueAccess().getGroup()); 
            }
            // InternalAedit.g:795:3: ( rule__ChangeDefValue__Group__0 )
            // InternalAedit.g:795:4: rule__ChangeDefValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeDefValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeDefValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChangeDefValue"


    // $ANTLR start "entryRuleChangeType"
    // InternalAedit.g:804:1: entryRuleChangeType : ruleChangeType EOF ;
    public final void entryRuleChangeType() throws RecognitionException {
        try {
            // InternalAedit.g:805:1: ( ruleChangeType EOF )
            // InternalAedit.g:806:1: ruleChangeType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleChangeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChangeType"


    // $ANTLR start "ruleChangeType"
    // InternalAedit.g:813:1: ruleChangeType : ( ( rule__ChangeType__Group__0 ) ) ;
    public final void ruleChangeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:817:2: ( ( ( rule__ChangeType__Group__0 ) ) )
            // InternalAedit.g:818:2: ( ( rule__ChangeType__Group__0 ) )
            {
            // InternalAedit.g:818:2: ( ( rule__ChangeType__Group__0 ) )
            // InternalAedit.g:819:3: ( rule__ChangeType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeTypeAccess().getGroup()); 
            }
            // InternalAedit.g:820:3: ( rule__ChangeType__Group__0 )
            // InternalAedit.g:820:4: rule__ChangeType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChangeType"


    // $ANTLR start "entryRuleRemoveArrayValue"
    // InternalAedit.g:829:1: entryRuleRemoveArrayValue : ruleRemoveArrayValue EOF ;
    public final void entryRuleRemoveArrayValue() throws RecognitionException {
        try {
            // InternalAedit.g:830:1: ( ruleRemoveArrayValue EOF )
            // InternalAedit.g:831:1: ruleRemoveArrayValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRemoveArrayValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRemoveArrayValue"


    // $ANTLR start "ruleRemoveArrayValue"
    // InternalAedit.g:838:1: ruleRemoveArrayValue : ( ( rule__RemoveArrayValue__Group__0 ) ) ;
    public final void ruleRemoveArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:842:2: ( ( ( rule__RemoveArrayValue__Group__0 ) ) )
            // InternalAedit.g:843:2: ( ( rule__RemoveArrayValue__Group__0 ) )
            {
            // InternalAedit.g:843:2: ( ( rule__RemoveArrayValue__Group__0 ) )
            // InternalAedit.g:844:3: ( rule__RemoveArrayValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAccess().getGroup()); 
            }
            // InternalAedit.g:845:3: ( rule__RemoveArrayValue__Group__0 )
            // InternalAedit.g:845:4: rule__RemoveArrayValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRemoveArrayValue"


    // $ANTLR start "entryRuleRemoveArrayValueAtIndex"
    // InternalAedit.g:854:1: entryRuleRemoveArrayValueAtIndex : ruleRemoveArrayValueAtIndex EOF ;
    public final void entryRuleRemoveArrayValueAtIndex() throws RecognitionException {
        try {
            // InternalAedit.g:855:1: ( ruleRemoveArrayValueAtIndex EOF )
            // InternalAedit.g:856:1: ruleRemoveArrayValueAtIndex EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAtIndexRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRemoveArrayValueAtIndex();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAtIndexRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRemoveArrayValueAtIndex"


    // $ANTLR start "ruleRemoveArrayValueAtIndex"
    // InternalAedit.g:863:1: ruleRemoveArrayValueAtIndex : ( ( rule__RemoveArrayValueAtIndex__Group__0 ) ) ;
    public final void ruleRemoveArrayValueAtIndex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:867:2: ( ( ( rule__RemoveArrayValueAtIndex__Group__0 ) ) )
            // InternalAedit.g:868:2: ( ( rule__RemoveArrayValueAtIndex__Group__0 ) )
            {
            // InternalAedit.g:868:2: ( ( rule__RemoveArrayValueAtIndex__Group__0 ) )
            // InternalAedit.g:869:3: ( rule__RemoveArrayValueAtIndex__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAtIndexAccess().getGroup()); 
            }
            // InternalAedit.g:870:3: ( rule__RemoveArrayValueAtIndex__Group__0 )
            // InternalAedit.g:870:4: rule__RemoveArrayValueAtIndex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValueAtIndex__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAtIndexAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRemoveArrayValueAtIndex"


    // $ANTLR start "entryRuleAddValueToArray"
    // InternalAedit.g:879:1: entryRuleAddValueToArray : ruleAddValueToArray EOF ;
    public final void entryRuleAddValueToArray() throws RecognitionException {
        try {
            // InternalAedit.g:880:1: ( ruleAddValueToArray EOF )
            // InternalAedit.g:881:1: ruleAddValueToArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddValueToArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddValueToArrayRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddValueToArray"


    // $ANTLR start "ruleAddValueToArray"
    // InternalAedit.g:888:1: ruleAddValueToArray : ( ( rule__AddValueToArray__Group__0 ) ) ;
    public final void ruleAddValueToArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:892:2: ( ( ( rule__AddValueToArray__Group__0 ) ) )
            // InternalAedit.g:893:2: ( ( rule__AddValueToArray__Group__0 ) )
            {
            // InternalAedit.g:893:2: ( ( rule__AddValueToArray__Group__0 ) )
            // InternalAedit.g:894:3: ( rule__AddValueToArray__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getGroup()); 
            }
            // InternalAedit.g:895:3: ( rule__AddValueToArray__Group__0 )
            // InternalAedit.g:895:4: rule__AddValueToArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddValueToArray__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddValueToArrayAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddValueToArray"


    // $ANTLR start "entryRuleField"
    // InternalAedit.g:904:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalAedit.g:905:1: ( ruleField EOF )
            // InternalAedit.g:906:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalAedit.g:913:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:917:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalAedit.g:918:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalAedit.g:918:2: ( ( rule__Field__Group__0 ) )
            // InternalAedit.g:919:3: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // InternalAedit.g:920:3: ( rule__Field__Group__0 )
            // InternalAedit.g:920:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleCustomTypeField"
    // InternalAedit.g:929:1: entryRuleCustomTypeField : ruleCustomTypeField EOF ;
    public final void entryRuleCustomTypeField() throws RecognitionException {
        try {
            // InternalAedit.g:930:1: ( ruleCustomTypeField EOF )
            // InternalAedit.g:931:1: ruleCustomTypeField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCustomTypeField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomTypeField"


    // $ANTLR start "ruleCustomTypeField"
    // InternalAedit.g:938:1: ruleCustomTypeField : ( ( rule__CustomTypeField__Group__0 ) ) ;
    public final void ruleCustomTypeField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:942:2: ( ( ( rule__CustomTypeField__Group__0 ) ) )
            // InternalAedit.g:943:2: ( ( rule__CustomTypeField__Group__0 ) )
            {
            // InternalAedit.g:943:2: ( ( rule__CustomTypeField__Group__0 ) )
            // InternalAedit.g:944:3: ( rule__CustomTypeField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeFieldAccess().getGroup()); 
            }
            // InternalAedit.g:945:3: ( rule__CustomTypeField__Group__0 )
            // InternalAedit.g:945:4: rule__CustomTypeField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomTypeField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomTypeField"


    // $ANTLR start "entryRulePrimitiveTypeField"
    // InternalAedit.g:954:1: entryRulePrimitiveTypeField : rulePrimitiveTypeField EOF ;
    public final void entryRulePrimitiveTypeField() throws RecognitionException {
        try {
            // InternalAedit.g:955:1: ( rulePrimitiveTypeField EOF )
            // InternalAedit.g:956:1: rulePrimitiveTypeField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimitiveTypeField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveTypeField"


    // $ANTLR start "rulePrimitiveTypeField"
    // InternalAedit.g:963:1: rulePrimitiveTypeField : ( ( rule__PrimitiveTypeField__Group__0 ) ) ;
    public final void rulePrimitiveTypeField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:967:2: ( ( ( rule__PrimitiveTypeField__Group__0 ) ) )
            // InternalAedit.g:968:2: ( ( rule__PrimitiveTypeField__Group__0 ) )
            {
            // InternalAedit.g:968:2: ( ( rule__PrimitiveTypeField__Group__0 ) )
            // InternalAedit.g:969:3: ( rule__PrimitiveTypeField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldAccess().getGroup()); 
            }
            // InternalAedit.g:970:3: ( rule__PrimitiveTypeField__Group__0 )
            // InternalAedit.g:970:4: rule__PrimitiveTypeField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveTypeField"


    // $ANTLR start "entryRuleComplexTypeField"
    // InternalAedit.g:979:1: entryRuleComplexTypeField : ruleComplexTypeField EOF ;
    public final void entryRuleComplexTypeField() throws RecognitionException {
        try {
            // InternalAedit.g:980:1: ( ruleComplexTypeField EOF )
            // InternalAedit.g:981:1: ruleComplexTypeField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComplexTypeField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexTypeField"


    // $ANTLR start "ruleComplexTypeField"
    // InternalAedit.g:988:1: ruleComplexTypeField : ( ( rule__ComplexTypeField__Group__0 ) ) ;
    public final void ruleComplexTypeField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:992:2: ( ( ( rule__ComplexTypeField__Group__0 ) ) )
            // InternalAedit.g:993:2: ( ( rule__ComplexTypeField__Group__0 ) )
            {
            // InternalAedit.g:993:2: ( ( rule__ComplexTypeField__Group__0 ) )
            // InternalAedit.g:994:3: ( rule__ComplexTypeField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldAccess().getGroup()); 
            }
            // InternalAedit.g:995:3: ( rule__ComplexTypeField__Group__0 )
            // InternalAedit.g:995:4: rule__ComplexTypeField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTypeField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexTypeField"


    // $ANTLR start "entryRuleArrayTypeField"
    // InternalAedit.g:1004:1: entryRuleArrayTypeField : ruleArrayTypeField EOF ;
    public final void entryRuleArrayTypeField() throws RecognitionException {
        try {
            // InternalAedit.g:1005:1: ( ruleArrayTypeField EOF )
            // InternalAedit.g:1006:1: ruleArrayTypeField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArrayTypeField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayTypeFieldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayTypeField"


    // $ANTLR start "ruleArrayTypeField"
    // InternalAedit.g:1013:1: ruleArrayTypeField : ( ( rule__ArrayTypeField__Group__0 ) ) ;
    public final void ruleArrayTypeField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1017:2: ( ( ( rule__ArrayTypeField__Group__0 ) ) )
            // InternalAedit.g:1018:2: ( ( rule__ArrayTypeField__Group__0 ) )
            {
            // InternalAedit.g:1018:2: ( ( rule__ArrayTypeField__Group__0 ) )
            // InternalAedit.g:1019:3: ( rule__ArrayTypeField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeFieldAccess().getGroup()); 
            }
            // InternalAedit.g:1020:3: ( rule__ArrayTypeField__Group__0 )
            // InternalAedit.g:1020:4: rule__ArrayTypeField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayTypeField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayTypeFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayTypeField"


    // $ANTLR start "entryRuleAnnotatedTypes"
    // InternalAedit.g:1029:1: entryRuleAnnotatedTypes : ruleAnnotatedTypes EOF ;
    public final void entryRuleAnnotatedTypes() throws RecognitionException {
        try {
            // InternalAedit.g:1030:1: ( ruleAnnotatedTypes EOF )
            // InternalAedit.g:1031:1: ruleAnnotatedTypes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotatedTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnnotatedTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotatedTypesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnnotatedTypes"


    // $ANTLR start "ruleAnnotatedTypes"
    // InternalAedit.g:1038:1: ruleAnnotatedTypes : ( ( rule__AnnotatedTypes__Group__0 ) ) ;
    public final void ruleAnnotatedTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1042:2: ( ( ( rule__AnnotatedTypes__Group__0 ) ) )
            // InternalAedit.g:1043:2: ( ( rule__AnnotatedTypes__Group__0 ) )
            {
            // InternalAedit.g:1043:2: ( ( rule__AnnotatedTypes__Group__0 ) )
            // InternalAedit.g:1044:3: ( rule__AnnotatedTypes__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotatedTypesAccess().getGroup()); 
            }
            // InternalAedit.g:1045:3: ( rule__AnnotatedTypes__Group__0 )
            // InternalAedit.g:1045:4: rule__AnnotatedTypes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnnotatedTypes__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotatedTypesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotatedTypes"


    // $ANTLR start "entryRuleTypes"
    // InternalAedit.g:1054:1: entryRuleTypes : ruleTypes EOF ;
    public final void entryRuleTypes() throws RecognitionException {
        try {
            // InternalAedit.g:1055:1: ( ruleTypes EOF )
            // InternalAedit.g:1056:1: ruleTypes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // InternalAedit.g:1063:1: ruleTypes : ( ( rule__Types__Alternatives ) ) ;
    public final void ruleTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1067:2: ( ( ( rule__Types__Alternatives ) ) )
            // InternalAedit.g:1068:2: ( ( rule__Types__Alternatives ) )
            {
            // InternalAedit.g:1068:2: ( ( rule__Types__Alternatives ) )
            // InternalAedit.g:1069:3: ( rule__Types__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypesAccess().getAlternatives()); 
            }
            // InternalAedit.g:1070:3: ( rule__Types__Alternatives )
            // InternalAedit.g:1070:4: rule__Types__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Types__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypesAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleCustomType"
    // InternalAedit.g:1079:1: entryRuleCustomType : ruleCustomType EOF ;
    public final void entryRuleCustomType() throws RecognitionException {
        try {
            // InternalAedit.g:1080:1: ( ruleCustomType EOF )
            // InternalAedit.g:1081:1: ruleCustomType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCustomType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomType"


    // $ANTLR start "ruleCustomType"
    // InternalAedit.g:1088:1: ruleCustomType : ( ( rule__CustomType__TargetAssignment ) ) ;
    public final void ruleCustomType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1092:2: ( ( ( rule__CustomType__TargetAssignment ) ) )
            // InternalAedit.g:1093:2: ( ( rule__CustomType__TargetAssignment ) )
            {
            // InternalAedit.g:1093:2: ( ( rule__CustomType__TargetAssignment ) )
            // InternalAedit.g:1094:3: ( rule__CustomType__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeAccess().getTargetAssignment()); 
            }
            // InternalAedit.g:1095:3: ( rule__CustomType__TargetAssignment )
            // InternalAedit.g:1095:4: rule__CustomType__TargetAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CustomType__TargetAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeAccess().getTargetAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalAedit.g:1104:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalAedit.g:1105:1: ( rulePrimitiveType EOF )
            // InternalAedit.g:1106:1: rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalAedit.g:1113:1: rulePrimitiveType : ( ( rule__PrimitiveType__TargetAssignment ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1117:2: ( ( ( rule__PrimitiveType__TargetAssignment ) ) )
            // InternalAedit.g:1118:2: ( ( rule__PrimitiveType__TargetAssignment ) )
            {
            // InternalAedit.g:1118:2: ( ( rule__PrimitiveType__TargetAssignment ) )
            // InternalAedit.g:1119:3: ( rule__PrimitiveType__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeAccess().getTargetAssignment()); 
            }
            // InternalAedit.g:1120:3: ( rule__PrimitiveType__TargetAssignment )
            // InternalAedit.g:1120:4: rule__PrimitiveType__TargetAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__TargetAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeAccess().getTargetAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleAnnotation"
    // InternalAedit.g:1129:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalAedit.g:1130:1: ( ruleAnnotation EOF )
            // InternalAedit.g:1131:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalAedit.g:1138:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1142:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // InternalAedit.g:1143:2: ( ( rule__Annotation__Group__0 ) )
            {
            // InternalAedit.g:1143:2: ( ( rule__Annotation__Group__0 ) )
            // InternalAedit.g:1144:3: ( rule__Annotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup()); 
            }
            // InternalAedit.g:1145:3: ( rule__Annotation__Group__0 )
            // InternalAedit.g:1145:4: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleValues"
    // InternalAedit.g:1154:1: entryRuleValues : ruleValues EOF ;
    public final void entryRuleValues() throws RecognitionException {
        try {
            // InternalAedit.g:1155:1: ( ruleValues EOF )
            // InternalAedit.g:1156:1: ruleValues EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValues();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValues"


    // $ANTLR start "ruleValues"
    // InternalAedit.g:1163:1: ruleValues : ( ( rule__Values__Group__0 ) ) ;
    public final void ruleValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1167:2: ( ( ( rule__Values__Group__0 ) ) )
            // InternalAedit.g:1168:2: ( ( rule__Values__Group__0 ) )
            {
            // InternalAedit.g:1168:2: ( ( rule__Values__Group__0 ) )
            // InternalAedit.g:1169:3: ( rule__Values__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getGroup()); 
            }
            // InternalAedit.g:1170:3: ( rule__Values__Group__0 )
            // InternalAedit.g:1170:4: rule__Values__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValues"


    // $ANTLR start "entryRuleArray"
    // InternalAedit.g:1179:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // InternalAedit.g:1180:1: ( ruleArray EOF )
            // InternalAedit.g:1181:1: ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalAedit.g:1188:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1192:2: ( ( ( rule__Array__Group__0 ) ) )
            // InternalAedit.g:1193:2: ( ( rule__Array__Group__0 ) )
            {
            // InternalAedit.g:1193:2: ( ( rule__Array__Group__0 ) )
            // InternalAedit.g:1194:3: ( rule__Array__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getGroup()); 
            }
            // InternalAedit.g:1195:3: ( rule__Array__Group__0 )
            // InternalAedit.g:1195:4: rule__Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleValue"
    // InternalAedit.g:1204:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalAedit.g:1205:1: ( ruleValue EOF )
            // InternalAedit.g:1206:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalAedit.g:1213:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1217:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalAedit.g:1218:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalAedit.g:1218:2: ( ( rule__Value__Alternatives ) )
            // InternalAedit.g:1219:3: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // InternalAedit.g:1220:3: ( rule__Value__Alternatives )
            // InternalAedit.g:1220:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalAedit.g:1229:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // InternalAedit.g:1230:1: ( ruleFloatValue EOF )
            // InternalAedit.g:1231:1: ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFloatValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalAedit.g:1238:1: ruleFloatValue : ( ( rule__FloatValue__ValAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1242:2: ( ( ( rule__FloatValue__ValAssignment ) ) )
            // InternalAedit.g:1243:2: ( ( rule__FloatValue__ValAssignment ) )
            {
            // InternalAedit.g:1243:2: ( ( rule__FloatValue__ValAssignment ) )
            // InternalAedit.g:1244:3: ( rule__FloatValue__ValAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValAssignment()); 
            }
            // InternalAedit.g:1245:3: ( rule__FloatValue__ValAssignment )
            // InternalAedit.g:1245:4: rule__FloatValue__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FloatValue__ValAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getValAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalAedit.g:1254:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalAedit.g:1255:1: ( ruleStringValue EOF )
            // InternalAedit.g:1256:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalAedit.g:1263:1: ruleStringValue : ( ( rule__StringValue__ValAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1267:2: ( ( ( rule__StringValue__ValAssignment ) ) )
            // InternalAedit.g:1268:2: ( ( rule__StringValue__ValAssignment ) )
            {
            // InternalAedit.g:1268:2: ( ( rule__StringValue__ValAssignment ) )
            // InternalAedit.g:1269:3: ( rule__StringValue__ValAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValAssignment()); 
            }
            // InternalAedit.g:1270:3: ( rule__StringValue__ValAssignment )
            // InternalAedit.g:1270:4: rule__StringValue__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalAedit.g:1279:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalAedit.g:1280:1: ( ruleIntValue EOF )
            // InternalAedit.g:1281:1: ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalAedit.g:1288:1: ruleIntValue : ( ( rule__IntValue__ValAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1292:2: ( ( ( rule__IntValue__ValAssignment ) ) )
            // InternalAedit.g:1293:2: ( ( rule__IntValue__ValAssignment ) )
            {
            // InternalAedit.g:1293:2: ( ( rule__IntValue__ValAssignment ) )
            // InternalAedit.g:1294:3: ( rule__IntValue__ValAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValAssignment()); 
            }
            // InternalAedit.g:1295:3: ( rule__IntValue__ValAssignment )
            // InternalAedit.g:1295:4: rule__IntValue__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__ValAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueAccess().getValAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleNull"
    // InternalAedit.g:1304:1: entryRuleNull : ruleNull EOF ;
    public final void entryRuleNull() throws RecognitionException {
        try {
            // InternalAedit.g:1305:1: ( ruleNull EOF )
            // InternalAedit.g:1306:1: ruleNull EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNull();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNull"


    // $ANTLR start "ruleNull"
    // InternalAedit.g:1313:1: ruleNull : ( ( rule__Null__ValAssignment ) ) ;
    public final void ruleNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1317:2: ( ( ( rule__Null__ValAssignment ) ) )
            // InternalAedit.g:1318:2: ( ( rule__Null__ValAssignment ) )
            {
            // InternalAedit.g:1318:2: ( ( rule__Null__ValAssignment ) )
            // InternalAedit.g:1319:3: ( rule__Null__ValAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAccess().getValAssignment()); 
            }
            // InternalAedit.g:1320:3: ( rule__Null__ValAssignment )
            // InternalAedit.g:1320:4: rule__Null__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Null__ValAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullAccess().getValAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNull"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalAedit.g:1329:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalAedit.g:1330:1: ( ruleBooleanValue EOF )
            // InternalAedit.g:1331:1: ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalAedit.g:1338:1: ruleBooleanValue : ( ( rule__BooleanValue__ValAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1342:2: ( ( ( rule__BooleanValue__ValAssignment ) ) )
            // InternalAedit.g:1343:2: ( ( rule__BooleanValue__ValAssignment ) )
            {
            // InternalAedit.g:1343:2: ( ( rule__BooleanValue__ValAssignment ) )
            // InternalAedit.g:1344:3: ( rule__BooleanValue__ValAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValAssignment()); 
            }
            // InternalAedit.g:1345:3: ( rule__BooleanValue__ValAssignment )
            // InternalAedit.g:1345:4: rule__BooleanValue__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__ValAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleReal"
    // InternalAedit.g:1354:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // InternalAedit.g:1355:1: ( ruleReal EOF )
            // InternalAedit.g:1356:1: ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalAedit.g:1363:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1367:2: ( ( ( rule__Real__Group__0 ) ) )
            // InternalAedit.g:1368:2: ( ( rule__Real__Group__0 ) )
            {
            // InternalAedit.g:1368:2: ( ( rule__Real__Group__0 ) )
            // InternalAedit.g:1369:3: ( rule__Real__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getGroup()); 
            }
            // InternalAedit.g:1370:3: ( rule__Real__Group__0 )
            // InternalAedit.g:1370:4: rule__Real__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleBoolean"
    // InternalAedit.g:1379:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalAedit.g:1380:1: ( ruleBoolean EOF )
            // InternalAedit.g:1381:1: ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalAedit.g:1388:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1392:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalAedit.g:1393:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalAedit.g:1393:2: ( ( rule__Boolean__Alternatives ) )
            // InternalAedit.g:1394:3: ( rule__Boolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAccess().getAlternatives()); 
            }
            // InternalAedit.g:1395:3: ( rule__Boolean__Alternatives )
            // InternalAedit.g:1395:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleNegativeInt"
    // InternalAedit.g:1404:1: entryRuleNegativeInt : ruleNegativeInt EOF ;
    public final void entryRuleNegativeInt() throws RecognitionException {
        try {
            // InternalAedit.g:1405:1: ( ruleNegativeInt EOF )
            // InternalAedit.g:1406:1: ruleNegativeInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeIntRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNegativeInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeIntRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegativeInt"


    // $ANTLR start "ruleNegativeInt"
    // InternalAedit.g:1413:1: ruleNegativeInt : ( ( rule__NegativeInt__Group__0 ) ) ;
    public final void ruleNegativeInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1417:2: ( ( ( rule__NegativeInt__Group__0 ) ) )
            // InternalAedit.g:1418:2: ( ( rule__NegativeInt__Group__0 ) )
            {
            // InternalAedit.g:1418:2: ( ( rule__NegativeInt__Group__0 ) )
            // InternalAedit.g:1419:3: ( rule__NegativeInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeIntAccess().getGroup()); 
            }
            // InternalAedit.g:1420:3: ( rule__NegativeInt__Group__0 )
            // InternalAedit.g:1420:4: rule__NegativeInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NegativeInt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeIntAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegativeInt"


    // $ANTLR start "entryRuleSCHEMA_TYPE"
    // InternalAedit.g:1429:1: entryRuleSCHEMA_TYPE : ruleSCHEMA_TYPE EOF ;
    public final void entryRuleSCHEMA_TYPE() throws RecognitionException {
        try {
            // InternalAedit.g:1430:1: ( ruleSCHEMA_TYPE EOF )
            // InternalAedit.g:1431:1: ruleSCHEMA_TYPE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSCHEMA_TYPERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSCHEMA_TYPE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSCHEMA_TYPERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSCHEMA_TYPE"


    // $ANTLR start "ruleSCHEMA_TYPE"
    // InternalAedit.g:1438:1: ruleSCHEMA_TYPE : ( ( rule__SCHEMA_TYPE__Alternatives ) ) ;
    public final void ruleSCHEMA_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1442:2: ( ( ( rule__SCHEMA_TYPE__Alternatives ) ) )
            // InternalAedit.g:1443:2: ( ( rule__SCHEMA_TYPE__Alternatives ) )
            {
            // InternalAedit.g:1443:2: ( ( rule__SCHEMA_TYPE__Alternatives ) )
            // InternalAedit.g:1444:3: ( rule__SCHEMA_TYPE__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSCHEMA_TYPEAccess().getAlternatives()); 
            }
            // InternalAedit.g:1445:3: ( rule__SCHEMA_TYPE__Alternatives )
            // InternalAedit.g:1445:4: rule__SCHEMA_TYPE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SCHEMA_TYPE__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSCHEMA_TYPEAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSCHEMA_TYPE"


    // $ANTLR start "entryRuleVARIABLE_TYPE"
    // InternalAedit.g:1454:1: entryRuleVARIABLE_TYPE : ruleVARIABLE_TYPE EOF ;
    public final void entryRuleVARIABLE_TYPE() throws RecognitionException {
        try {
            // InternalAedit.g:1455:1: ( ruleVARIABLE_TYPE EOF )
            // InternalAedit.g:1456:1: ruleVARIABLE_TYPE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARIABLE_TYPERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVARIABLE_TYPE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARIABLE_TYPERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVARIABLE_TYPE"


    // $ANTLR start "ruleVARIABLE_TYPE"
    // InternalAedit.g:1463:1: ruleVARIABLE_TYPE : ( ( rule__VARIABLE_TYPE__Alternatives ) ) ;
    public final void ruleVARIABLE_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1467:2: ( ( ( rule__VARIABLE_TYPE__Alternatives ) ) )
            // InternalAedit.g:1468:2: ( ( rule__VARIABLE_TYPE__Alternatives ) )
            {
            // InternalAedit.g:1468:2: ( ( rule__VARIABLE_TYPE__Alternatives ) )
            // InternalAedit.g:1469:3: ( rule__VARIABLE_TYPE__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARIABLE_TYPEAccess().getAlternatives()); 
            }
            // InternalAedit.g:1470:3: ( rule__VARIABLE_TYPE__Alternatives )
            // InternalAedit.g:1470:4: rule__VARIABLE_TYPE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VARIABLE_TYPE__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARIABLE_TYPEAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVARIABLE_TYPE"


    // $ANTLR start "entryRuleQN"
    // InternalAedit.g:1479:1: entryRuleQN : ruleQN EOF ;
    public final void entryRuleQN() throws RecognitionException {
        try {
            // InternalAedit.g:1480:1: ( ruleQN EOF )
            // InternalAedit.g:1481:1: ruleQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQNRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQNRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQN"


    // $ANTLR start "ruleQN"
    // InternalAedit.g:1488:1: ruleQN : ( ( rule__QN__Group__0 ) ) ;
    public final void ruleQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1492:2: ( ( ( rule__QN__Group__0 ) ) )
            // InternalAedit.g:1493:2: ( ( rule__QN__Group__0 ) )
            {
            // InternalAedit.g:1493:2: ( ( rule__QN__Group__0 ) )
            // InternalAedit.g:1494:3: ( rule__QN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQNAccess().getGroup()); 
            }
            // InternalAedit.g:1495:3: ( rule__QN__Group__0 )
            // InternalAedit.g:1495:4: rule__QN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QN__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQNAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQN"


    // $ANTLR start "entryRuleAN"
    // InternalAedit.g:1504:1: entryRuleAN : ruleAN EOF ;
    public final void entryRuleAN() throws RecognitionException {
        try {
            // InternalAedit.g:1505:1: ( ruleAN EOF )
            // InternalAedit.g:1506:1: ruleAN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAN"


    // $ANTLR start "ruleAN"
    // InternalAedit.g:1513:1: ruleAN : ( ( rule__AN__Group__0 ) ) ;
    public final void ruleAN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1517:2: ( ( ( rule__AN__Group__0 ) ) )
            // InternalAedit.g:1518:2: ( ( rule__AN__Group__0 ) )
            {
            // InternalAedit.g:1518:2: ( ( rule__AN__Group__0 ) )
            // InternalAedit.g:1519:3: ( rule__AN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getGroup()); 
            }
            // InternalAedit.g:1520:3: ( rule__AN__Group__0 )
            // InternalAedit.g:1520:4: rule__AN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AN__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getANAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAN"


    // $ANTLR start "rule__GenericRule__Alternatives"
    // InternalAedit.g:1528:1: rule__GenericRule__Alternatives : ( ( ruleRenameSchema ) | ( ruleRemoveSchema ) | ( ruleAdd ) | ( ruleChangeSchema ) | ( ruleChangeEnum ) | ( ruleAddAnnotationToSchema ) | ( ruleRemoveAnnotationFromSchema ) );
    public final void rule__GenericRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1532:1: ( ( ruleRenameSchema ) | ( ruleRemoveSchema ) | ( ruleAdd ) | ( ruleChangeSchema ) | ( ruleChangeEnum ) | ( ruleAddAnnotationToSchema ) | ( ruleRemoveAnnotationFromSchema ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt1=1;
                }
                break;
            case 41:
                {
                alt1=2;
                }
                break;
            case 36:
                {
                alt1=3;
                }
                break;
            case 35:
                {
                int LA1_4 = input.LA(2);

                if ( ((LA1_4>=11 && LA1_4<=12)) ) {
                    alt1=4;
                }
                else if ( (LA1_4==15) ) {
                    alt1=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                alt1=6;
                }
                break;
            case 33:
                {
                alt1=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalAedit.g:1533:2: ( ruleRenameSchema )
                    {
                    // InternalAedit.g:1533:2: ( ruleRenameSchema )
                    // InternalAedit.g:1534:3: ruleRenameSchema
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGenericRuleAccess().getRenameSchemaParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRenameSchema();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGenericRuleAccess().getRenameSchemaParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1539:2: ( ruleRemoveSchema )
                    {
                    // InternalAedit.g:1539:2: ( ruleRemoveSchema )
                    // InternalAedit.g:1540:3: ruleRemoveSchema
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGenericRuleAccess().getRemoveSchemaParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRemoveSchema();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGenericRuleAccess().getRemoveSchemaParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAedit.g:1545:2: ( ruleAdd )
                    {
                    // InternalAedit.g:1545:2: ( ruleAdd )
                    // InternalAedit.g:1546:3: ruleAdd
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGenericRuleAccess().getAddParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAdd();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGenericRuleAccess().getAddParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAedit.g:1551:2: ( ruleChangeSchema )
                    {
                    // InternalAedit.g:1551:2: ( ruleChangeSchema )
                    // InternalAedit.g:1552:3: ruleChangeSchema
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGenericRuleAccess().getChangeSchemaParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleChangeSchema();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGenericRuleAccess().getChangeSchemaParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAedit.g:1557:2: ( ruleChangeEnum )
                    {
                    // InternalAedit.g:1557:2: ( ruleChangeEnum )
                    // InternalAedit.g:1558:3: ruleChangeEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGenericRuleAccess().getChangeEnumParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleChangeEnum();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGenericRuleAccess().getChangeEnumParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAedit.g:1563:2: ( ruleAddAnnotationToSchema )
                    {
                    // InternalAedit.g:1563:2: ( ruleAddAnnotationToSchema )
                    // InternalAedit.g:1564:3: ruleAddAnnotationToSchema
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGenericRuleAccess().getAddAnnotationToSchemaParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAddAnnotationToSchema();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGenericRuleAccess().getAddAnnotationToSchemaParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAedit.g:1569:2: ( ruleRemoveAnnotationFromSchema )
                    {
                    // InternalAedit.g:1569:2: ( ruleRemoveAnnotationFromSchema )
                    // InternalAedit.g:1570:3: ruleRemoveAnnotationFromSchema
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGenericRuleAccess().getRemoveAnnotationFromSchemaParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRemoveAnnotationFromSchema();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGenericRuleAccess().getRemoveAnnotationFromSchemaParserRuleCall_6()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GenericRule__Alternatives"


    // $ANTLR start "rule__SchemaRule__Alternatives"
    // InternalAedit.g:1579:1: rule__SchemaRule__Alternatives : ( ( ruleRemoveVariable ) | ( ruleRenameVariable ) | ( ruleAddVariable ) | ( ruleChangeDefValue ) | ( ruleChangeType ) | ( ruleAddAnnotationToField ) | ( ruleAddNameAnnotationToField ) | ( ruleRemoveAnnotationFromField ) | ( ruleRemoveNameAnnotationFromField ) | ( ruleArrayEditRules ) );
    public final void rule__SchemaRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1583:1: ( ( ruleRemoveVariable ) | ( ruleRenameVariable ) | ( ruleAddVariable ) | ( ruleChangeDefValue ) | ( ruleChangeType ) | ( ruleAddAnnotationToField ) | ( ruleAddNameAnnotationToField ) | ( ruleRemoveAnnotationFromField ) | ( ruleRemoveNameAnnotationFromField ) | ( ruleArrayEditRules ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt2=1;
                }
                break;
            case 42:
                {
                alt2=2;
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            case 43:
                {
                alt2=4;
                }
                break;
            case 44:
                {
                alt2=5;
                }
                break;
            case 30:
                {
                alt2=6;
                }
                break;
            case 32:
                {
                alt2=7;
                }
                break;
            case 33:
                {
                alt2=8;
                }
                break;
            case 34:
                {
                alt2=9;
                }
                break;
            case 45:
            case 46:
            case 47:
                {
                alt2=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAedit.g:1584:2: ( ruleRemoveVariable )
                    {
                    // InternalAedit.g:1584:2: ( ruleRemoveVariable )
                    // InternalAedit.g:1585:3: ruleRemoveVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaRuleAccess().getRemoveVariableParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRemoveVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaRuleAccess().getRemoveVariableParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1590:2: ( ruleRenameVariable )
                    {
                    // InternalAedit.g:1590:2: ( ruleRenameVariable )
                    // InternalAedit.g:1591:3: ruleRenameVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaRuleAccess().getRenameVariableParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRenameVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaRuleAccess().getRenameVariableParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAedit.g:1596:2: ( ruleAddVariable )
                    {
                    // InternalAedit.g:1596:2: ( ruleAddVariable )
                    // InternalAedit.g:1597:3: ruleAddVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaRuleAccess().getAddVariableParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAddVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaRuleAccess().getAddVariableParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAedit.g:1602:2: ( ruleChangeDefValue )
                    {
                    // InternalAedit.g:1602:2: ( ruleChangeDefValue )
                    // InternalAedit.g:1603:3: ruleChangeDefValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaRuleAccess().getChangeDefValueParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleChangeDefValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaRuleAccess().getChangeDefValueParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAedit.g:1608:2: ( ruleChangeType )
                    {
                    // InternalAedit.g:1608:2: ( ruleChangeType )
                    // InternalAedit.g:1609:3: ruleChangeType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaRuleAccess().getChangeTypeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleChangeType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaRuleAccess().getChangeTypeParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAedit.g:1614:2: ( ruleAddAnnotationToField )
                    {
                    // InternalAedit.g:1614:2: ( ruleAddAnnotationToField )
                    // InternalAedit.g:1615:3: ruleAddAnnotationToField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaRuleAccess().getAddAnnotationToFieldParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAddAnnotationToField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaRuleAccess().getAddAnnotationToFieldParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAedit.g:1620:2: ( ruleAddNameAnnotationToField )
                    {
                    // InternalAedit.g:1620:2: ( ruleAddNameAnnotationToField )
                    // InternalAedit.g:1621:3: ruleAddNameAnnotationToField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaRuleAccess().getAddNameAnnotationToFieldParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAddNameAnnotationToField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaRuleAccess().getAddNameAnnotationToFieldParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalAedit.g:1626:2: ( ruleRemoveAnnotationFromField )
                    {
                    // InternalAedit.g:1626:2: ( ruleRemoveAnnotationFromField )
                    // InternalAedit.g:1627:3: ruleRemoveAnnotationFromField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaRuleAccess().getRemoveAnnotationFromFieldParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRemoveAnnotationFromField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaRuleAccess().getRemoveAnnotationFromFieldParserRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalAedit.g:1632:2: ( ruleRemoveNameAnnotationFromField )
                    {
                    // InternalAedit.g:1632:2: ( ruleRemoveNameAnnotationFromField )
                    // InternalAedit.g:1633:3: ruleRemoveNameAnnotationFromField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaRuleAccess().getRemoveNameAnnotationFromFieldParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRemoveNameAnnotationFromField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaRuleAccess().getRemoveNameAnnotationFromFieldParserRuleCall_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalAedit.g:1638:2: ( ruleArrayEditRules )
                    {
                    // InternalAedit.g:1638:2: ( ruleArrayEditRules )
                    // InternalAedit.g:1639:3: ruleArrayEditRules
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaRuleAccess().getArrayEditRulesParserRuleCall_9()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleArrayEditRules();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaRuleAccess().getArrayEditRulesParserRuleCall_9()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SchemaRule__Alternatives"


    // $ANTLR start "rule__ArrayEditRules__Alternatives"
    // InternalAedit.g:1648:1: rule__ArrayEditRules__Alternatives : ( ( ruleRemoveArrayValue ) | ( ruleRemoveArrayValueAtIndex ) | ( ruleAddValueToArray ) );
    public final void rule__ArrayEditRules__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1652:1: ( ( ruleRemoveArrayValue ) | ( ruleRemoveArrayValueAtIndex ) | ( ruleAddValueToArray ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt3=1;
                }
                break;
            case 46:
                {
                alt3=2;
                }
                break;
            case 47:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAedit.g:1653:2: ( ruleRemoveArrayValue )
                    {
                    // InternalAedit.g:1653:2: ( ruleRemoveArrayValue )
                    // InternalAedit.g:1654:3: ruleRemoveArrayValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArrayEditRulesAccess().getRemoveArrayValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRemoveArrayValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArrayEditRulesAccess().getRemoveArrayValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1659:2: ( ruleRemoveArrayValueAtIndex )
                    {
                    // InternalAedit.g:1659:2: ( ruleRemoveArrayValueAtIndex )
                    // InternalAedit.g:1660:3: ruleRemoveArrayValueAtIndex
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArrayEditRulesAccess().getRemoveArrayValueAtIndexParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRemoveArrayValueAtIndex();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArrayEditRulesAccess().getRemoveArrayValueAtIndexParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAedit.g:1665:2: ( ruleAddValueToArray )
                    {
                    // InternalAedit.g:1665:2: ( ruleAddValueToArray )
                    // InternalAedit.g:1666:3: ruleAddValueToArray
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArrayEditRulesAccess().getAddValueToArrayParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAddValueToArray();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArrayEditRulesAccess().getAddValueToArrayParserRuleCall_2()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayEditRules__Alternatives"


    // $ANTLR start "rule__EnumRule__Alternatives"
    // InternalAedit.g:1675:1: rule__EnumRule__Alternatives : ( ( ruleRemoveEnum ) | ( ruleRenameEnum ) | ( ruleAddEnum ) );
    public final void rule__EnumRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1679:1: ( ( ruleRemoveEnum ) | ( ruleRenameEnum ) | ( ruleAddEnum ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt4=1;
                }
                break;
            case 42:
                {
                alt4=2;
                }
                break;
            case 36:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAedit.g:1680:2: ( ruleRemoveEnum )
                    {
                    // InternalAedit.g:1680:2: ( ruleRemoveEnum )
                    // InternalAedit.g:1681:3: ruleRemoveEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumRuleAccess().getRemoveEnumParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRemoveEnum();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnumRuleAccess().getRemoveEnumParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1686:2: ( ruleRenameEnum )
                    {
                    // InternalAedit.g:1686:2: ( ruleRenameEnum )
                    // InternalAedit.g:1687:3: ruleRenameEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumRuleAccess().getRenameEnumParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRenameEnum();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnumRuleAccess().getRenameEnumParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAedit.g:1692:2: ( ruleAddEnum )
                    {
                    // InternalAedit.g:1692:2: ( ruleAddEnum )
                    // InternalAedit.g:1693:3: ruleAddEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumRuleAccess().getAddEnumParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAddEnum();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnumRuleAccess().getAddEnumParserRuleCall_2()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumRule__Alternatives"


    // $ANTLR start "rule__ChangeSchema__SchemaTypeAlternatives_1_0"
    // InternalAedit.g:1702:1: rule__ChangeSchema__SchemaTypeAlternatives_1_0 : ( ( 'record' ) | ( 'error' ) );
    public final void rule__ChangeSchema__SchemaTypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1706:1: ( ( 'record' ) | ( 'error' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAedit.g:1707:2: ( 'record' )
                    {
                    // InternalAedit.g:1707:2: ( 'record' )
                    // InternalAedit.g:1708:3: 'record'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChangeSchemaAccess().getSchemaTypeRecordKeyword_1_0_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getChangeSchemaAccess().getSchemaTypeRecordKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1713:2: ( 'error' )
                    {
                    // InternalAedit.g:1713:2: ( 'error' )
                    // InternalAedit.g:1714:3: 'error'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getChangeSchemaAccess().getSchemaTypeErrorKeyword_1_0_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getChangeSchemaAccess().getSchemaTypeErrorKeyword_1_0_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSchema__SchemaTypeAlternatives_1_0"


    // $ANTLR start "rule__Add__Alternatives"
    // InternalAedit.g:1723:1: rule__Add__Alternatives : ( ( ruleAddRecord ) | ( ruleAddError ) | ( ruleAddEnumeration ) );
    public final void rule__Add__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1727:1: ( ( ruleAddRecord ) | ( ruleAddError ) | ( ruleAddEnumeration ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==36) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==37) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==RULE_INT) ) {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3==38) ) {
                            switch ( input.LA(5) ) {
                            case 11:
                                {
                                alt6=1;
                                }
                                break;
                            case 15:
                                {
                                alt6=3;
                                }
                                break;
                            case 12:
                                {
                                alt6=2;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 4, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAedit.g:1728:2: ( ruleAddRecord )
                    {
                    // InternalAedit.g:1728:2: ( ruleAddRecord )
                    // InternalAedit.g:1729:3: ruleAddRecord
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddAccess().getAddRecordParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAddRecord();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddAccess().getAddRecordParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1734:2: ( ruleAddError )
                    {
                    // InternalAedit.g:1734:2: ( ruleAddError )
                    // InternalAedit.g:1735:3: ruleAddError
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddAccess().getAddErrorParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAddError();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddAccess().getAddErrorParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAedit.g:1740:2: ( ruleAddEnumeration )
                    {
                    // InternalAedit.g:1740:2: ( ruleAddEnumeration )
                    // InternalAedit.g:1741:3: ruleAddEnumeration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddAccess().getAddEnumerationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAddEnumeration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddAccess().getAddEnumerationParserRuleCall_2()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Alternatives"


    // $ANTLR start "rule__AddValueToArray__ValueToAddAlternatives_6_0"
    // InternalAedit.g:1750:1: rule__AddValueToArray__ValueToAddAlternatives_6_0 : ( ( ( ruleArray ) ) | ( ruleValue ) );
    public final void rule__AddValueToArray__ValueToAddAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1754:1: ( ( ( ruleArray ) ) | ( ruleValue ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==52) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_ID)||(LA7_0>=13 && LA7_0<=14)||LA7_0==54||LA7_0==56) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAedit.g:1755:2: ( ( ruleArray ) )
                    {
                    // InternalAedit.g:1755:2: ( ( ruleArray ) )
                    // InternalAedit.g:1756:3: ( ruleArray )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddValueToArrayAccess().getValueToAddArrayParserRuleCall_6_0_0()); 
                    }
                    // InternalAedit.g:1757:3: ( ruleArray )
                    // InternalAedit.g:1757:4: ruleArray
                    {
                    pushFollow(FOLLOW_2);
                    ruleArray();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddValueToArrayAccess().getValueToAddArrayParserRuleCall_6_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1761:2: ( ruleValue )
                    {
                    // InternalAedit.g:1761:2: ( ruleValue )
                    // InternalAedit.g:1762:3: ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAddValueToArrayAccess().getValueToAddValueParserRuleCall_6_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAddValueToArrayAccess().getValueToAddValueParserRuleCall_6_0_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__ValueToAddAlternatives_6_0"


    // $ANTLR start "rule__Field__FieldTypeAlternatives_1_0"
    // InternalAedit.g:1771:1: rule__Field__FieldTypeAlternatives_1_0 : ( ( rulePrimitiveTypeField ) | ( ruleCustomTypeField ) | ( ruleComplexTypeField ) );
    public final void rule__Field__FieldTypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1775:1: ( ( rulePrimitiveTypeField ) | ( ruleCustomTypeField ) | ( ruleComplexTypeField ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 49:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAedit.g:1776:2: ( rulePrimitiveTypeField )
                    {
                    // InternalAedit.g:1776:2: ( rulePrimitiveTypeField )
                    // InternalAedit.g:1777:3: rulePrimitiveTypeField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldAccess().getFieldTypePrimitiveTypeFieldParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrimitiveTypeField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldAccess().getFieldTypePrimitiveTypeFieldParserRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1782:2: ( ruleCustomTypeField )
                    {
                    // InternalAedit.g:1782:2: ( ruleCustomTypeField )
                    // InternalAedit.g:1783:3: ruleCustomTypeField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldAccess().getFieldTypeCustomTypeFieldParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCustomTypeField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldAccess().getFieldTypeCustomTypeFieldParserRuleCall_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAedit.g:1788:2: ( ruleComplexTypeField )
                    {
                    // InternalAedit.g:1788:2: ( ruleComplexTypeField )
                    // InternalAedit.g:1789:3: ruleComplexTypeField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldAccess().getFieldTypeComplexTypeFieldParserRuleCall_1_0_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleComplexTypeField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldAccess().getFieldTypeComplexTypeFieldParserRuleCall_1_0_2()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__FieldTypeAlternatives_1_0"


    // $ANTLR start "rule__Types__Alternatives"
    // InternalAedit.g:1798:1: rule__Types__Alternatives : ( ( ruleCustomType ) | ( rulePrimitiveType ) | ( ruleArrayTypeField ) );
    public final void rule__Types__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1802:1: ( ( ruleCustomType ) | ( rulePrimitiveType ) | ( ruleArrayTypeField ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt9=2;
                }
                break;
            case 49:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAedit.g:1803:2: ( ruleCustomType )
                    {
                    // InternalAedit.g:1803:2: ( ruleCustomType )
                    // InternalAedit.g:1804:3: ruleCustomType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypesAccess().getCustomTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCustomType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypesAccess().getCustomTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1809:2: ( rulePrimitiveType )
                    {
                    // InternalAedit.g:1809:2: ( rulePrimitiveType )
                    // InternalAedit.g:1810:3: rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypesAccess().getPrimitiveTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePrimitiveType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypesAccess().getPrimitiveTypeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAedit.g:1815:2: ( ruleArrayTypeField )
                    {
                    // InternalAedit.g:1815:2: ( ruleArrayTypeField )
                    // InternalAedit.g:1816:3: ruleArrayTypeField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypesAccess().getArrayTypeFieldParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleArrayTypeField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypesAccess().getArrayTypeFieldParserRuleCall_2()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Types__Alternatives"


    // $ANTLR start "rule__Values__Alternatives_1"
    // InternalAedit.g:1825:1: rule__Values__Alternatives_1 : ( ( ( rule__Values__ValueAssignment_1_0 ) ) | ( ( rule__Values__Group_1_1__0 ) ) );
    public final void rule__Values__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1829:1: ( ( ( rule__Values__ValueAssignment_1_0 ) ) | ( ( rule__Values__Group_1_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==52) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_ID)||(LA10_0>=13 && LA10_0<=14)||LA10_0==54||LA10_0==56) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAedit.g:1830:2: ( ( rule__Values__ValueAssignment_1_0 ) )
                    {
                    // InternalAedit.g:1830:2: ( ( rule__Values__ValueAssignment_1_0 ) )
                    // InternalAedit.g:1831:3: ( rule__Values__ValueAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuesAccess().getValueAssignment_1_0()); 
                    }
                    // InternalAedit.g:1832:3: ( rule__Values__ValueAssignment_1_0 )
                    // InternalAedit.g:1832:4: rule__Values__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Values__ValueAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValuesAccess().getValueAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1836:2: ( ( rule__Values__Group_1_1__0 ) )
                    {
                    // InternalAedit.g:1836:2: ( ( rule__Values__Group_1_1__0 ) )
                    // InternalAedit.g:1837:3: ( rule__Values__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuesAccess().getGroup_1_1()); 
                    }
                    // InternalAedit.g:1838:3: ( rule__Values__Group_1_1__0 )
                    // InternalAedit.g:1838:4: rule__Values__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Values__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValuesAccess().getGroup_1_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Alternatives_1"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalAedit.g:1846:1: rule__Value__Alternatives : ( ( ruleFloatValue ) | ( ruleIntValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleNull ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1850:1: ( ( ruleFloatValue ) | ( ruleIntValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleNull ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 54:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_INT) ) {
                    int LA11_6 = input.LA(3);

                    if ( (LA11_6==39) ) {
                        alt11=1;
                    }
                    else if ( (LA11_6==EOF||(LA11_6>=RULE_INT && LA11_6<=RULE_ID)||(LA11_6>=13 && LA11_6<=14)||(LA11_6>=16 && LA11_6<=21)||LA11_6==24||LA11_6==27||LA11_6==38||LA11_6==40||LA11_6==49||(LA11_6>=52 && LA11_6<=56)) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==EOF||(LA11_2>=RULE_INT && LA11_2<=RULE_ID)||(LA11_2>=13 && LA11_2<=14)||(LA11_2>=16 && LA11_2<=21)||LA11_2==24||LA11_2==27||LA11_2==38||LA11_2==40||LA11_2==49||(LA11_2>=52 && LA11_2<=56)) ) {
                    alt11=2;
                }
                else if ( (LA11_2==39) ) {
                    alt11=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt11=3;
                }
                break;
            case 13:
            case 14:
                {
                alt11=4;
                }
                break;
            case 56:
                {
                alt11=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAedit.g:1851:2: ( ruleFloatValue )
                    {
                    // InternalAedit.g:1851:2: ( ruleFloatValue )
                    // InternalAedit.g:1852:3: ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getFloatValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFloatValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getFloatValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1857:2: ( ruleIntValue )
                    {
                    // InternalAedit.g:1857:2: ( ruleIntValue )
                    // InternalAedit.g:1858:3: ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIntValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAedit.g:1863:2: ( ruleStringValue )
                    {
                    // InternalAedit.g:1863:2: ( ruleStringValue )
                    // InternalAedit.g:1864:3: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getStringValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getStringValueParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAedit.g:1869:2: ( ruleBooleanValue )
                    {
                    // InternalAedit.g:1869:2: ( ruleBooleanValue )
                    // InternalAedit.g:1870:3: ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAedit.g:1875:2: ( ruleNull )
                    {
                    // InternalAedit.g:1875:2: ( ruleNull )
                    // InternalAedit.g:1876:3: ruleNull
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getNullParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNull();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getNullParserRuleCall_4()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__IntValue__ValAlternatives_0"
    // InternalAedit.g:1885:1: rule__IntValue__ValAlternatives_0 : ( ( RULE_INT ) | ( ruleNegativeInt ) );
    public final void rule__IntValue__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1889:1: ( ( RULE_INT ) | ( ruleNegativeInt ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==54) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalAedit.g:1890:2: ( RULE_INT )
                    {
                    // InternalAedit.g:1890:2: ( RULE_INT )
                    // InternalAedit.g:1891:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1896:2: ( ruleNegativeInt )
                    {
                    // InternalAedit.g:1896:2: ( ruleNegativeInt )
                    // InternalAedit.g:1897:3: ruleNegativeInt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIntValueAccess().getValNegativeIntParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNegativeInt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIntValueAccess().getValNegativeIntParserRuleCall_0_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__ValAlternatives_0"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalAedit.g:1906:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1910:1: ( ( 'true' ) | ( 'false' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            else if ( (LA13_0==14) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalAedit.g:1911:2: ( 'true' )
                    {
                    // InternalAedit.g:1911:2: ( 'true' )
                    // InternalAedit.g:1912:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1917:2: ( 'false' )
                    {
                    // InternalAedit.g:1917:2: ( 'false' )
                    // InternalAedit.g:1918:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__SCHEMA_TYPE__Alternatives"
    // InternalAedit.g:1927:1: rule__SCHEMA_TYPE__Alternatives : ( ( 'record' ) | ( 'error' ) | ( 'enum' ) );
    public final void rule__SCHEMA_TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1931:1: ( ( 'record' ) | ( 'error' ) | ( 'enum' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt14=1;
                }
                break;
            case 12:
                {
                alt14=2;
                }
                break;
            case 15:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalAedit.g:1932:2: ( 'record' )
                    {
                    // InternalAedit.g:1932:2: ( 'record' )
                    // InternalAedit.g:1933:3: 'record'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSCHEMA_TYPEAccess().getRecordKeyword_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSCHEMA_TYPEAccess().getRecordKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1938:2: ( 'error' )
                    {
                    // InternalAedit.g:1938:2: ( 'error' )
                    // InternalAedit.g:1939:3: 'error'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSCHEMA_TYPEAccess().getErrorKeyword_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSCHEMA_TYPEAccess().getErrorKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAedit.g:1944:2: ( 'enum' )
                    {
                    // InternalAedit.g:1944:2: ( 'enum' )
                    // InternalAedit.g:1945:3: 'enum'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSCHEMA_TYPEAccess().getEnumKeyword_2()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSCHEMA_TYPEAccess().getEnumKeyword_2()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCHEMA_TYPE__Alternatives"


    // $ANTLR start "rule__VARIABLE_TYPE__Alternatives"
    // InternalAedit.g:1954:1: rule__VARIABLE_TYPE__Alternatives : ( ( 'int' ) | ( 'double' ) | ( 'string' ) | ( 'long' ) | ( 'boolean' ) | ( 'float' ) );
    public final void rule__VARIABLE_TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1958:1: ( ( 'int' ) | ( 'double' ) | ( 'string' ) | ( 'long' ) | ( 'boolean' ) | ( 'float' ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt15=1;
                }
                break;
            case 17:
                {
                alt15=2;
                }
                break;
            case 18:
                {
                alt15=3;
                }
                break;
            case 19:
                {
                alt15=4;
                }
                break;
            case 20:
                {
                alt15=5;
                }
                break;
            case 21:
                {
                alt15=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalAedit.g:1959:2: ( 'int' )
                    {
                    // InternalAedit.g:1959:2: ( 'int' )
                    // InternalAedit.g:1960:3: 'int'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVARIABLE_TYPEAccess().getIntKeyword_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVARIABLE_TYPEAccess().getIntKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1965:2: ( 'double' )
                    {
                    // InternalAedit.g:1965:2: ( 'double' )
                    // InternalAedit.g:1966:3: 'double'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVARIABLE_TYPEAccess().getDoubleKeyword_1()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVARIABLE_TYPEAccess().getDoubleKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAedit.g:1971:2: ( 'string' )
                    {
                    // InternalAedit.g:1971:2: ( 'string' )
                    // InternalAedit.g:1972:3: 'string'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVARIABLE_TYPEAccess().getStringKeyword_2()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVARIABLE_TYPEAccess().getStringKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAedit.g:1977:2: ( 'long' )
                    {
                    // InternalAedit.g:1977:2: ( 'long' )
                    // InternalAedit.g:1978:3: 'long'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVARIABLE_TYPEAccess().getLongKeyword_3()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVARIABLE_TYPEAccess().getLongKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAedit.g:1983:2: ( 'boolean' )
                    {
                    // InternalAedit.g:1983:2: ( 'boolean' )
                    // InternalAedit.g:1984:3: 'boolean'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVARIABLE_TYPEAccess().getBooleanKeyword_4()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVARIABLE_TYPEAccess().getBooleanKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAedit.g:1989:2: ( 'float' )
                    {
                    // InternalAedit.g:1989:2: ( 'float' )
                    // InternalAedit.g:1990:3: 'float'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVARIABLE_TYPEAccess().getFloatKeyword_5()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVARIABLE_TYPEAccess().getFloatKeyword_5()); 
                    }

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_TYPE__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalAedit.g:1999:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2003:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAedit.g:2004:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalAedit.g:2011:1: rule__Model__Group__0__Impl : ( ( rule__Model__RuleDeclarationsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2015:1: ( ( ( rule__Model__RuleDeclarationsAssignment_0 )* ) )
            // InternalAedit.g:2016:1: ( ( rule__Model__RuleDeclarationsAssignment_0 )* )
            {
            // InternalAedit.g:2016:1: ( ( rule__Model__RuleDeclarationsAssignment_0 )* )
            // InternalAedit.g:2017:2: ( rule__Model__RuleDeclarationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRuleDeclarationsAssignment_0()); 
            }
            // InternalAedit.g:2018:2: ( rule__Model__RuleDeclarationsAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAedit.g:2018:3: rule__Model__RuleDeclarationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__RuleDeclarationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRuleDeclarationsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalAedit.g:2026:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2030:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAedit.g:2031:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalAedit.g:2038:1: rule__Model__Group__1__Impl : ( ( rule__Model__RuleMapsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2042:1: ( ( ( rule__Model__RuleMapsAssignment_1 )* ) )
            // InternalAedit.g:2043:1: ( ( rule__Model__RuleMapsAssignment_1 )* )
            {
            // InternalAedit.g:2043:1: ( ( rule__Model__RuleMapsAssignment_1 )* )
            // InternalAedit.g:2044:2: ( rule__Model__RuleMapsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRuleMapsAssignment_1()); 
            }
            // InternalAedit.g:2045:2: ( rule__Model__RuleMapsAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAedit.g:2045:3: rule__Model__RuleMapsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__RuleMapsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRuleMapsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalAedit.g:2053:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2057:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalAedit.g:2058:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalAedit.g:2065:1: rule__Model__Group__2__Impl : ( ( rule__Model__FeaturesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2069:1: ( ( ( rule__Model__FeaturesAssignment_2 )* ) )
            // InternalAedit.g:2070:1: ( ( rule__Model__FeaturesAssignment_2 )* )
            {
            // InternalAedit.g:2070:1: ( ( rule__Model__FeaturesAssignment_2 )* )
            // InternalAedit.g:2071:2: ( rule__Model__FeaturesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFeaturesAssignment_2()); 
            }
            // InternalAedit.g:2072:2: ( rule__Model__FeaturesAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==22) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAedit.g:2072:3: rule__Model__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__FeaturesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getFeaturesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalAedit.g:2080:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2084:1: ( rule__Model__Group__3__Impl )
            // InternalAedit.g:2085:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalAedit.g:2091:1: rule__Model__Group__3__Impl : ( ( rule__Model__FeatureMapsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2095:1: ( ( ( rule__Model__FeatureMapsAssignment_3 )* ) )
            // InternalAedit.g:2096:1: ( ( rule__Model__FeatureMapsAssignment_3 )* )
            {
            // InternalAedit.g:2096:1: ( ( rule__Model__FeatureMapsAssignment_3 )* )
            // InternalAedit.g:2097:2: ( rule__Model__FeatureMapsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFeatureMapsAssignment_3()); 
            }
            // InternalAedit.g:2098:2: ( rule__Model__FeatureMapsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAedit.g:2098:3: rule__Model__FeatureMapsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__FeatureMapsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getFeatureMapsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalAedit.g:2107:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2111:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalAedit.g:2112:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Feature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalAedit.g:2119:1: rule__Feature__Group__0__Impl : ( 'feature' ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2123:1: ( ( 'feature' ) )
            // InternalAedit.g:2124:1: ( 'feature' )
            {
            // InternalAedit.g:2124:1: ( 'feature' )
            // InternalAedit.g:2125:2: 'feature'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalAedit.g:2134:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2138:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalAedit.g:2139:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Feature__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalAedit.g:2146:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2150:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalAedit.g:2151:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalAedit.g:2151:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalAedit.g:2152:2: ( rule__Feature__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            }
            // InternalAedit.g:2153:2: ( rule__Feature__NameAssignment_1 )
            // InternalAedit.g:2153:3: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalAedit.g:2161:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2165:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalAedit.g:2166:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Feature__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalAedit.g:2173:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__Group_2__0 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2177:1: ( ( ( rule__Feature__Group_2__0 )? ) )
            // InternalAedit.g:2178:1: ( ( rule__Feature__Group_2__0 )? )
            {
            // InternalAedit.g:2178:1: ( ( rule__Feature__Group_2__0 )? )
            // InternalAedit.g:2179:2: ( rule__Feature__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getGroup_2()); 
            }
            // InternalAedit.g:2180:2: ( rule__Feature__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAedit.g:2180:3: rule__Feature__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalAedit.g:2188:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2192:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalAedit.g:2193:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Feature__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalAedit.g:2200:1: rule__Feature__Group__3__Impl : ( '{' ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2204:1: ( ( '{' ) )
            // InternalAedit.g:2205:1: ( '{' )
            {
            // InternalAedit.g:2205:1: ( '{' )
            // InternalAedit.g:2206:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // InternalAedit.g:2215:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2219:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalAedit.g:2220:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Feature__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // InternalAedit.g:2227:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__RuleMapsAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2231:1: ( ( ( rule__Feature__RuleMapsAssignment_4 )* ) )
            // InternalAedit.g:2232:1: ( ( rule__Feature__RuleMapsAssignment_4 )* )
            {
            // InternalAedit.g:2232:1: ( ( rule__Feature__RuleMapsAssignment_4 )* )
            // InternalAedit.g:2233:2: ( rule__Feature__RuleMapsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getRuleMapsAssignment_4()); 
            }
            // InternalAedit.g:2234:2: ( rule__Feature__RuleMapsAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAedit.g:2234:3: rule__Feature__RuleMapsAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Feature__RuleMapsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getRuleMapsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group__5"
    // InternalAedit.g:2242:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2246:1: ( rule__Feature__Group__5__Impl )
            // InternalAedit.g:2247:2: rule__Feature__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__5"


    // $ANTLR start "rule__Feature__Group__5__Impl"
    // InternalAedit.g:2253:1: rule__Feature__Group__5__Impl : ( '}' ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2257:1: ( ( '}' ) )
            // InternalAedit.g:2258:1: ( '}' )
            {
            // InternalAedit.g:2258:1: ( '}' )
            // InternalAedit.g:2259:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__5__Impl"


    // $ANTLR start "rule__Feature__Group_2__0"
    // InternalAedit.g:2269:1: rule__Feature__Group_2__0 : rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 ;
    public final void rule__Feature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2273:1: ( rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 )
            // InternalAedit.g:2274:2: rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Feature__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__0"


    // $ANTLR start "rule__Feature__Group_2__0__Impl"
    // InternalAedit.g:2281:1: rule__Feature__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Feature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2285:1: ( ( ':' ) )
            // InternalAedit.g:2286:1: ( ':' )
            {
            // InternalAedit.g:2286:1: ( ':' )
            // InternalAedit.g:2287:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getColonKeyword_2_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getColonKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__0__Impl"


    // $ANTLR start "rule__Feature__Group_2__1"
    // InternalAedit.g:2296:1: rule__Feature__Group_2__1 : rule__Feature__Group_2__1__Impl ;
    public final void rule__Feature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2300:1: ( rule__Feature__Group_2__1__Impl )
            // InternalAedit.g:2301:2: rule__Feature__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__1"


    // $ANTLR start "rule__Feature__Group_2__1__Impl"
    // InternalAedit.g:2307:1: rule__Feature__Group_2__1__Impl : ( ( rule__Feature__ExtendAssignment_2_1 ) ) ;
    public final void rule__Feature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2311:1: ( ( ( rule__Feature__ExtendAssignment_2_1 ) ) )
            // InternalAedit.g:2312:1: ( ( rule__Feature__ExtendAssignment_2_1 ) )
            {
            // InternalAedit.g:2312:1: ( ( rule__Feature__ExtendAssignment_2_1 ) )
            // InternalAedit.g:2313:2: ( rule__Feature__ExtendAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getExtendAssignment_2_1()); 
            }
            // InternalAedit.g:2314:2: ( rule__Feature__ExtendAssignment_2_1 )
            // InternalAedit.g:2314:3: rule__Feature__ExtendAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__ExtendAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getExtendAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__1__Impl"


    // $ANTLR start "rule__FeatureMap__Group__0"
    // InternalAedit.g:2323:1: rule__FeatureMap__Group__0 : rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1 ;
    public final void rule__FeatureMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2327:1: ( rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1 )
            // InternalAedit.g:2328:2: rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FeatureMap__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureMap__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group__0"


    // $ANTLR start "rule__FeatureMap__Group__0__Impl"
    // InternalAedit.g:2335:1: rule__FeatureMap__Group__0__Impl : ( 'use' ) ;
    public final void rule__FeatureMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2339:1: ( ( 'use' ) )
            // InternalAedit.g:2340:1: ( 'use' )
            {
            // InternalAedit.g:2340:1: ( 'use' )
            // InternalAedit.g:2341:2: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureMapAccess().getUseKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureMapAccess().getUseKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group__0__Impl"


    // $ANTLR start "rule__FeatureMap__Group__1"
    // InternalAedit.g:2350:1: rule__FeatureMap__Group__1 : rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2 ;
    public final void rule__FeatureMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2354:1: ( rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2 )
            // InternalAedit.g:2355:2: rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__FeatureMap__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureMap__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group__1"


    // $ANTLR start "rule__FeatureMap__Group__1__Impl"
    // InternalAedit.g:2362:1: rule__FeatureMap__Group__1__Impl : ( ( rule__FeatureMap__NameAssignment_1 ) ) ;
    public final void rule__FeatureMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2366:1: ( ( ( rule__FeatureMap__NameAssignment_1 ) ) )
            // InternalAedit.g:2367:1: ( ( rule__FeatureMap__NameAssignment_1 ) )
            {
            // InternalAedit.g:2367:1: ( ( rule__FeatureMap__NameAssignment_1 ) )
            // InternalAedit.g:2368:2: ( rule__FeatureMap__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureMapAccess().getNameAssignment_1()); 
            }
            // InternalAedit.g:2369:2: ( rule__FeatureMap__NameAssignment_1 )
            // InternalAedit.g:2369:3: rule__FeatureMap__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureMap__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureMapAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group__1__Impl"


    // $ANTLR start "rule__FeatureMap__Group__2"
    // InternalAedit.g:2377:1: rule__FeatureMap__Group__2 : rule__FeatureMap__Group__2__Impl ;
    public final void rule__FeatureMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2381:1: ( rule__FeatureMap__Group__2__Impl )
            // InternalAedit.g:2382:2: rule__FeatureMap__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureMap__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group__2"


    // $ANTLR start "rule__FeatureMap__Group__2__Impl"
    // InternalAedit.g:2388:1: rule__FeatureMap__Group__2__Impl : ( ';' ) ;
    public final void rule__FeatureMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2392:1: ( ( ';' ) )
            // InternalAedit.g:2393:1: ( ';' )
            {
            // InternalAedit.g:2393:1: ( ';' )
            // InternalAedit.g:2394:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureMapAccess().getSemicolonKeyword_2()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureMapAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__Group__2__Impl"


    // $ANTLR start "rule__RuleMap__Group__0"
    // InternalAedit.g:2404:1: rule__RuleMap__Group__0 : rule__RuleMap__Group__0__Impl rule__RuleMap__Group__1 ;
    public final void rule__RuleMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2408:1: ( rule__RuleMap__Group__0__Impl rule__RuleMap__Group__1 )
            // InternalAedit.g:2409:2: rule__RuleMap__Group__0__Impl rule__RuleMap__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RuleMap__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleMap__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleMap__Group__0"


    // $ANTLR start "rule__RuleMap__Group__0__Impl"
    // InternalAedit.g:2416:1: rule__RuleMap__Group__0__Impl : ( 'ruleset' ) ;
    public final void rule__RuleMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2420:1: ( ( 'ruleset' ) )
            // InternalAedit.g:2421:1: ( 'ruleset' )
            {
            // InternalAedit.g:2421:1: ( 'ruleset' )
            // InternalAedit.g:2422:2: 'ruleset'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleMapAccess().getRulesetKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleMapAccess().getRulesetKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleMap__Group__0__Impl"


    // $ANTLR start "rule__RuleMap__Group__1"
    // InternalAedit.g:2431:1: rule__RuleMap__Group__1 : rule__RuleMap__Group__1__Impl rule__RuleMap__Group__2 ;
    public final void rule__RuleMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2435:1: ( rule__RuleMap__Group__1__Impl rule__RuleMap__Group__2 )
            // InternalAedit.g:2436:2: rule__RuleMap__Group__1__Impl rule__RuleMap__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RuleMap__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleMap__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleMap__Group__1"


    // $ANTLR start "rule__RuleMap__Group__1__Impl"
    // InternalAedit.g:2443:1: rule__RuleMap__Group__1__Impl : ( ( rule__RuleMap__NameAssignment_1 ) ) ;
    public final void rule__RuleMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2447:1: ( ( ( rule__RuleMap__NameAssignment_1 ) ) )
            // InternalAedit.g:2448:1: ( ( rule__RuleMap__NameAssignment_1 ) )
            {
            // InternalAedit.g:2448:1: ( ( rule__RuleMap__NameAssignment_1 ) )
            // InternalAedit.g:2449:2: ( rule__RuleMap__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleMapAccess().getNameAssignment_1()); 
            }
            // InternalAedit.g:2450:2: ( rule__RuleMap__NameAssignment_1 )
            // InternalAedit.g:2450:3: rule__RuleMap__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleMap__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleMapAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleMap__Group__1__Impl"


    // $ANTLR start "rule__RuleMap__Group__2"
    // InternalAedit.g:2458:1: rule__RuleMap__Group__2 : rule__RuleMap__Group__2__Impl rule__RuleMap__Group__3 ;
    public final void rule__RuleMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2462:1: ( rule__RuleMap__Group__2__Impl rule__RuleMap__Group__3 )
            // InternalAedit.g:2463:2: rule__RuleMap__Group__2__Impl rule__RuleMap__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__RuleMap__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleMap__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleMap__Group__2"


    // $ANTLR start "rule__RuleMap__Group__2__Impl"
    // InternalAedit.g:2470:1: rule__RuleMap__Group__2__Impl : ( '{' ) ;
    public final void rule__RuleMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2474:1: ( ( '{' ) )
            // InternalAedit.g:2475:1: ( '{' )
            {
            // InternalAedit.g:2475:1: ( '{' )
            // InternalAedit.g:2476:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleMapAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleMapAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleMap__Group__2__Impl"


    // $ANTLR start "rule__RuleMap__Group__3"
    // InternalAedit.g:2485:1: rule__RuleMap__Group__3 : rule__RuleMap__Group__3__Impl rule__RuleMap__Group__4 ;
    public final void rule__RuleMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2489:1: ( rule__RuleMap__Group__3__Impl rule__RuleMap__Group__4 )
            // InternalAedit.g:2490:2: rule__RuleMap__Group__3__Impl rule__RuleMap__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__RuleMap__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleMap__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleMap__Group__3"


    // $ANTLR start "rule__RuleMap__Group__3__Impl"
    // InternalAedit.g:2497:1: rule__RuleMap__Group__3__Impl : ( ( rule__RuleMap__RulesAssignment_3 )* ) ;
    public final void rule__RuleMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2501:1: ( ( ( rule__RuleMap__RulesAssignment_3 )* ) )
            // InternalAedit.g:2502:1: ( ( rule__RuleMap__RulesAssignment_3 )* )
            {
            // InternalAedit.g:2502:1: ( ( rule__RuleMap__RulesAssignment_3 )* )
            // InternalAedit.g:2503:2: ( rule__RuleMap__RulesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleMapAccess().getRulesAssignment_3()); 
            }
            // InternalAedit.g:2504:2: ( rule__RuleMap__RulesAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAedit.g:2504:3: rule__RuleMap__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RuleMap__RulesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleMapAccess().getRulesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleMap__Group__3__Impl"


    // $ANTLR start "rule__RuleMap__Group__4"
    // InternalAedit.g:2512:1: rule__RuleMap__Group__4 : rule__RuleMap__Group__4__Impl ;
    public final void rule__RuleMap__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2516:1: ( rule__RuleMap__Group__4__Impl )
            // InternalAedit.g:2517:2: rule__RuleMap__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleMap__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleMap__Group__4"


    // $ANTLR start "rule__RuleMap__Group__4__Impl"
    // InternalAedit.g:2523:1: rule__RuleMap__Group__4__Impl : ( '}' ) ;
    public final void rule__RuleMap__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2527:1: ( ( '}' ) )
            // InternalAedit.g:2528:1: ( '}' )
            {
            // InternalAedit.g:2528:1: ( '}' )
            // InternalAedit.g:2529:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleMapAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleMapAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleMap__Group__4__Impl"


    // $ANTLR start "rule__RuleDeclaration__Group__0"
    // InternalAedit.g:2539:1: rule__RuleDeclaration__Group__0 : rule__RuleDeclaration__Group__0__Impl rule__RuleDeclaration__Group__1 ;
    public final void rule__RuleDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2543:1: ( rule__RuleDeclaration__Group__0__Impl rule__RuleDeclaration__Group__1 )
            // InternalAedit.g:2544:2: rule__RuleDeclaration__Group__0__Impl rule__RuleDeclaration__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RuleDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__Group__0"


    // $ANTLR start "rule__RuleDeclaration__Group__0__Impl"
    // InternalAedit.g:2551:1: rule__RuleDeclaration__Group__0__Impl : ( 'rule' ) ;
    public final void rule__RuleDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2555:1: ( ( 'rule' ) )
            // InternalAedit.g:2556:1: ( 'rule' )
            {
            // InternalAedit.g:2556:1: ( 'rule' )
            // InternalAedit.g:2557:2: 'rule'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleDeclarationAccess().getRuleKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleDeclarationAccess().getRuleKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__Group__0__Impl"


    // $ANTLR start "rule__RuleDeclaration__Group__1"
    // InternalAedit.g:2566:1: rule__RuleDeclaration__Group__1 : rule__RuleDeclaration__Group__1__Impl rule__RuleDeclaration__Group__2 ;
    public final void rule__RuleDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2570:1: ( rule__RuleDeclaration__Group__1__Impl rule__RuleDeclaration__Group__2 )
            // InternalAedit.g:2571:2: rule__RuleDeclaration__Group__1__Impl rule__RuleDeclaration__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RuleDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__Group__1"


    // $ANTLR start "rule__RuleDeclaration__Group__1__Impl"
    // InternalAedit.g:2578:1: rule__RuleDeclaration__Group__1__Impl : ( ( rule__RuleDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RuleDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2582:1: ( ( ( rule__RuleDeclaration__NameAssignment_1 ) ) )
            // InternalAedit.g:2583:1: ( ( rule__RuleDeclaration__NameAssignment_1 ) )
            {
            // InternalAedit.g:2583:1: ( ( rule__RuleDeclaration__NameAssignment_1 ) )
            // InternalAedit.g:2584:2: ( rule__RuleDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalAedit.g:2585:2: ( rule__RuleDeclaration__NameAssignment_1 )
            // InternalAedit.g:2585:3: rule__RuleDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleDeclarationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__Group__1__Impl"


    // $ANTLR start "rule__RuleDeclaration__Group__2"
    // InternalAedit.g:2593:1: rule__RuleDeclaration__Group__2 : rule__RuleDeclaration__Group__2__Impl rule__RuleDeclaration__Group__3 ;
    public final void rule__RuleDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2597:1: ( rule__RuleDeclaration__Group__2__Impl rule__RuleDeclaration__Group__3 )
            // InternalAedit.g:2598:2: rule__RuleDeclaration__Group__2__Impl rule__RuleDeclaration__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__RuleDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__Group__2"


    // $ANTLR start "rule__RuleDeclaration__Group__2__Impl"
    // InternalAedit.g:2605:1: rule__RuleDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__RuleDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2609:1: ( ( '{' ) )
            // InternalAedit.g:2610:1: ( '{' )
            {
            // InternalAedit.g:2610:1: ( '{' )
            // InternalAedit.g:2611:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__Group__2__Impl"


    // $ANTLR start "rule__RuleDeclaration__Group__3"
    // InternalAedit.g:2620:1: rule__RuleDeclaration__Group__3 : rule__RuleDeclaration__Group__3__Impl rule__RuleDeclaration__Group__4 ;
    public final void rule__RuleDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2624:1: ( rule__RuleDeclaration__Group__3__Impl rule__RuleDeclaration__Group__4 )
            // InternalAedit.g:2625:2: rule__RuleDeclaration__Group__3__Impl rule__RuleDeclaration__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__RuleDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__Group__3"


    // $ANTLR start "rule__RuleDeclaration__Group__3__Impl"
    // InternalAedit.g:2632:1: rule__RuleDeclaration__Group__3__Impl : ( ( rule__RuleDeclaration__RulesAssignment_3 )* ) ;
    public final void rule__RuleDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2636:1: ( ( ( rule__RuleDeclaration__RulesAssignment_3 )* ) )
            // InternalAedit.g:2637:1: ( ( rule__RuleDeclaration__RulesAssignment_3 )* )
            {
            // InternalAedit.g:2637:1: ( ( rule__RuleDeclaration__RulesAssignment_3 )* )
            // InternalAedit.g:2638:2: ( rule__RuleDeclaration__RulesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleDeclarationAccess().getRulesAssignment_3()); 
            }
            // InternalAedit.g:2639:2: ( rule__RuleDeclaration__RulesAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==30||LA23_0==33||(LA23_0>=35 && LA23_0<=36)||(LA23_0>=41 && LA23_0<=42)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAedit.g:2639:3: rule__RuleDeclaration__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__RuleDeclaration__RulesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleDeclarationAccess().getRulesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__Group__3__Impl"


    // $ANTLR start "rule__RuleDeclaration__Group__4"
    // InternalAedit.g:2647:1: rule__RuleDeclaration__Group__4 : rule__RuleDeclaration__Group__4__Impl ;
    public final void rule__RuleDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2651:1: ( rule__RuleDeclaration__Group__4__Impl )
            // InternalAedit.g:2652:2: rule__RuleDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__Group__4"


    // $ANTLR start "rule__RuleDeclaration__Group__4__Impl"
    // InternalAedit.g:2658:1: rule__RuleDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__RuleDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2662:1: ( ( '}' ) )
            // InternalAedit.g:2663:1: ( '}' )
            {
            // InternalAedit.g:2663:1: ( '}' )
            // InternalAedit.g:2664:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__Group__4__Impl"


    // $ANTLR start "rule__AddAnnotationToSchema__Group__0"
    // InternalAedit.g:2674:1: rule__AddAnnotationToSchema__Group__0 : rule__AddAnnotationToSchema__Group__0__Impl rule__AddAnnotationToSchema__Group__1 ;
    public final void rule__AddAnnotationToSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2678:1: ( rule__AddAnnotationToSchema__Group__0__Impl rule__AddAnnotationToSchema__Group__1 )
            // InternalAedit.g:2679:2: rule__AddAnnotationToSchema__Group__0__Impl rule__AddAnnotationToSchema__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__AddAnnotationToSchema__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToSchema__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToSchema__Group__0"


    // $ANTLR start "rule__AddAnnotationToSchema__Group__0__Impl"
    // InternalAedit.g:2686:1: rule__AddAnnotationToSchema__Group__0__Impl : ( 'add.annot' ) ;
    public final void rule__AddAnnotationToSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2690:1: ( ( 'add.annot' ) )
            // InternalAedit.g:2691:1: ( 'add.annot' )
            {
            // InternalAedit.g:2691:1: ( 'add.annot' )
            // InternalAedit.g:2692:2: 'add.annot'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToSchemaAccess().getAddAnnotKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToSchemaAccess().getAddAnnotKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToSchema__Group__0__Impl"


    // $ANTLR start "rule__AddAnnotationToSchema__Group__1"
    // InternalAedit.g:2701:1: rule__AddAnnotationToSchema__Group__1 : rule__AddAnnotationToSchema__Group__1__Impl rule__AddAnnotationToSchema__Group__2 ;
    public final void rule__AddAnnotationToSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2705:1: ( rule__AddAnnotationToSchema__Group__1__Impl rule__AddAnnotationToSchema__Group__2 )
            // InternalAedit.g:2706:2: rule__AddAnnotationToSchema__Group__1__Impl rule__AddAnnotationToSchema__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AddAnnotationToSchema__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToSchema__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToSchema__Group__1"


    // $ANTLR start "rule__AddAnnotationToSchema__Group__1__Impl"
    // InternalAedit.g:2713:1: rule__AddAnnotationToSchema__Group__1__Impl : ( ( rule__AddAnnotationToSchema__SchemaTypeAssignment_1 ) ) ;
    public final void rule__AddAnnotationToSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2717:1: ( ( ( rule__AddAnnotationToSchema__SchemaTypeAssignment_1 ) ) )
            // InternalAedit.g:2718:1: ( ( rule__AddAnnotationToSchema__SchemaTypeAssignment_1 ) )
            {
            // InternalAedit.g:2718:1: ( ( rule__AddAnnotationToSchema__SchemaTypeAssignment_1 ) )
            // InternalAedit.g:2719:2: ( rule__AddAnnotationToSchema__SchemaTypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToSchemaAccess().getSchemaTypeAssignment_1()); 
            }
            // InternalAedit.g:2720:2: ( rule__AddAnnotationToSchema__SchemaTypeAssignment_1 )
            // InternalAedit.g:2720:3: rule__AddAnnotationToSchema__SchemaTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToSchema__SchemaTypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToSchemaAccess().getSchemaTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToSchema__Group__1__Impl"


    // $ANTLR start "rule__AddAnnotationToSchema__Group__2"
    // InternalAedit.g:2728:1: rule__AddAnnotationToSchema__Group__2 : rule__AddAnnotationToSchema__Group__2__Impl rule__AddAnnotationToSchema__Group__3 ;
    public final void rule__AddAnnotationToSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2732:1: ( rule__AddAnnotationToSchema__Group__2__Impl rule__AddAnnotationToSchema__Group__3 )
            // InternalAedit.g:2733:2: rule__AddAnnotationToSchema__Group__2__Impl rule__AddAnnotationToSchema__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__AddAnnotationToSchema__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToSchema__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToSchema__Group__2"


    // $ANTLR start "rule__AddAnnotationToSchema__Group__2__Impl"
    // InternalAedit.g:2740:1: rule__AddAnnotationToSchema__Group__2__Impl : ( ( rule__AddAnnotationToSchema__SchemaAssignment_2 ) ) ;
    public final void rule__AddAnnotationToSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2744:1: ( ( ( rule__AddAnnotationToSchema__SchemaAssignment_2 ) ) )
            // InternalAedit.g:2745:1: ( ( rule__AddAnnotationToSchema__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:2745:1: ( ( rule__AddAnnotationToSchema__SchemaAssignment_2 ) )
            // InternalAedit.g:2746:2: ( rule__AddAnnotationToSchema__SchemaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToSchemaAccess().getSchemaAssignment_2()); 
            }
            // InternalAedit.g:2747:2: ( rule__AddAnnotationToSchema__SchemaAssignment_2 )
            // InternalAedit.g:2747:3: rule__AddAnnotationToSchema__SchemaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToSchema__SchemaAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToSchemaAccess().getSchemaAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToSchema__Group__2__Impl"


    // $ANTLR start "rule__AddAnnotationToSchema__Group__3"
    // InternalAedit.g:2755:1: rule__AddAnnotationToSchema__Group__3 : rule__AddAnnotationToSchema__Group__3__Impl rule__AddAnnotationToSchema__Group__4 ;
    public final void rule__AddAnnotationToSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2759:1: ( rule__AddAnnotationToSchema__Group__3__Impl rule__AddAnnotationToSchema__Group__4 )
            // InternalAedit.g:2760:2: rule__AddAnnotationToSchema__Group__3__Impl rule__AddAnnotationToSchema__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__AddAnnotationToSchema__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToSchema__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToSchema__Group__3"


    // $ANTLR start "rule__AddAnnotationToSchema__Group__3__Impl"
    // InternalAedit.g:2767:1: rule__AddAnnotationToSchema__Group__3__Impl : ( '=>' ) ;
    public final void rule__AddAnnotationToSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2771:1: ( ( '=>' ) )
            // InternalAedit.g:2772:1: ( '=>' )
            {
            // InternalAedit.g:2772:1: ( '=>' )
            // InternalAedit.g:2773:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToSchemaAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToSchemaAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToSchema__Group__3__Impl"


    // $ANTLR start "rule__AddAnnotationToSchema__Group__4"
    // InternalAedit.g:2782:1: rule__AddAnnotationToSchema__Group__4 : rule__AddAnnotationToSchema__Group__4__Impl rule__AddAnnotationToSchema__Group__5 ;
    public final void rule__AddAnnotationToSchema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2786:1: ( rule__AddAnnotationToSchema__Group__4__Impl rule__AddAnnotationToSchema__Group__5 )
            // InternalAedit.g:2787:2: rule__AddAnnotationToSchema__Group__4__Impl rule__AddAnnotationToSchema__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__AddAnnotationToSchema__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToSchema__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToSchema__Group__4"


    // $ANTLR start "rule__AddAnnotationToSchema__Group__4__Impl"
    // InternalAedit.g:2794:1: rule__AddAnnotationToSchema__Group__4__Impl : ( ( rule__AddAnnotationToSchema__AnnotationAssignment_4 ) ) ;
    public final void rule__AddAnnotationToSchema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2798:1: ( ( ( rule__AddAnnotationToSchema__AnnotationAssignment_4 ) ) )
            // InternalAedit.g:2799:1: ( ( rule__AddAnnotationToSchema__AnnotationAssignment_4 ) )
            {
            // InternalAedit.g:2799:1: ( ( rule__AddAnnotationToSchema__AnnotationAssignment_4 ) )
            // InternalAedit.g:2800:2: ( rule__AddAnnotationToSchema__AnnotationAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToSchemaAccess().getAnnotationAssignment_4()); 
            }
            // InternalAedit.g:2801:2: ( rule__AddAnnotationToSchema__AnnotationAssignment_4 )
            // InternalAedit.g:2801:3: rule__AddAnnotationToSchema__AnnotationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToSchema__AnnotationAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToSchemaAccess().getAnnotationAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToSchema__Group__4__Impl"


    // $ANTLR start "rule__AddAnnotationToSchema__Group__5"
    // InternalAedit.g:2809:1: rule__AddAnnotationToSchema__Group__5 : rule__AddAnnotationToSchema__Group__5__Impl ;
    public final void rule__AddAnnotationToSchema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2813:1: ( rule__AddAnnotationToSchema__Group__5__Impl )
            // InternalAedit.g:2814:2: rule__AddAnnotationToSchema__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToSchema__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToSchema__Group__5"


    // $ANTLR start "rule__AddAnnotationToSchema__Group__5__Impl"
    // InternalAedit.g:2820:1: rule__AddAnnotationToSchema__Group__5__Impl : ( ';' ) ;
    public final void rule__AddAnnotationToSchema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2824:1: ( ( ';' ) )
            // InternalAedit.g:2825:1: ( ';' )
            {
            // InternalAedit.g:2825:1: ( ';' )
            // InternalAedit.g:2826:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToSchemaAccess().getSemicolonKeyword_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToSchemaAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToSchema__Group__5__Impl"


    // $ANTLR start "rule__AddAnnotationToField__Group__0"
    // InternalAedit.g:2836:1: rule__AddAnnotationToField__Group__0 : rule__AddAnnotationToField__Group__0__Impl rule__AddAnnotationToField__Group__1 ;
    public final void rule__AddAnnotationToField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2840:1: ( rule__AddAnnotationToField__Group__0__Impl rule__AddAnnotationToField__Group__1 )
            // InternalAedit.g:2841:2: rule__AddAnnotationToField__Group__0__Impl rule__AddAnnotationToField__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AddAnnotationToField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToField__Group__0"


    // $ANTLR start "rule__AddAnnotationToField__Group__0__Impl"
    // InternalAedit.g:2848:1: rule__AddAnnotationToField__Group__0__Impl : ( 'add.annot' ) ;
    public final void rule__AddAnnotationToField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2852:1: ( ( 'add.annot' ) )
            // InternalAedit.g:2853:1: ( 'add.annot' )
            {
            // InternalAedit.g:2853:1: ( 'add.annot' )
            // InternalAedit.g:2854:2: 'add.annot'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToFieldAccess().getAddAnnotKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToFieldAccess().getAddAnnotKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToField__Group__0__Impl"


    // $ANTLR start "rule__AddAnnotationToField__Group__1"
    // InternalAedit.g:2863:1: rule__AddAnnotationToField__Group__1 : rule__AddAnnotationToField__Group__1__Impl rule__AddAnnotationToField__Group__2 ;
    public final void rule__AddAnnotationToField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2867:1: ( rule__AddAnnotationToField__Group__1__Impl rule__AddAnnotationToField__Group__2 )
            // InternalAedit.g:2868:2: rule__AddAnnotationToField__Group__1__Impl rule__AddAnnotationToField__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__AddAnnotationToField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToField__Group__1"


    // $ANTLR start "rule__AddAnnotationToField__Group__1__Impl"
    // InternalAedit.g:2875:1: rule__AddAnnotationToField__Group__1__Impl : ( ( rule__AddAnnotationToField__VariableAssignment_1 ) ) ;
    public final void rule__AddAnnotationToField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2879:1: ( ( ( rule__AddAnnotationToField__VariableAssignment_1 ) ) )
            // InternalAedit.g:2880:1: ( ( rule__AddAnnotationToField__VariableAssignment_1 ) )
            {
            // InternalAedit.g:2880:1: ( ( rule__AddAnnotationToField__VariableAssignment_1 ) )
            // InternalAedit.g:2881:2: ( rule__AddAnnotationToField__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToFieldAccess().getVariableAssignment_1()); 
            }
            // InternalAedit.g:2882:2: ( rule__AddAnnotationToField__VariableAssignment_1 )
            // InternalAedit.g:2882:3: rule__AddAnnotationToField__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToField__VariableAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToFieldAccess().getVariableAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToField__Group__1__Impl"


    // $ANTLR start "rule__AddAnnotationToField__Group__2"
    // InternalAedit.g:2890:1: rule__AddAnnotationToField__Group__2 : rule__AddAnnotationToField__Group__2__Impl rule__AddAnnotationToField__Group__3 ;
    public final void rule__AddAnnotationToField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2894:1: ( rule__AddAnnotationToField__Group__2__Impl rule__AddAnnotationToField__Group__3 )
            // InternalAedit.g:2895:2: rule__AddAnnotationToField__Group__2__Impl rule__AddAnnotationToField__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__AddAnnotationToField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToField__Group__2"


    // $ANTLR start "rule__AddAnnotationToField__Group__2__Impl"
    // InternalAedit.g:2902:1: rule__AddAnnotationToField__Group__2__Impl : ( '=>' ) ;
    public final void rule__AddAnnotationToField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2906:1: ( ( '=>' ) )
            // InternalAedit.g:2907:1: ( '=>' )
            {
            // InternalAedit.g:2907:1: ( '=>' )
            // InternalAedit.g:2908:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToFieldAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToFieldAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToField__Group__2__Impl"


    // $ANTLR start "rule__AddAnnotationToField__Group__3"
    // InternalAedit.g:2917:1: rule__AddAnnotationToField__Group__3 : rule__AddAnnotationToField__Group__3__Impl rule__AddAnnotationToField__Group__4 ;
    public final void rule__AddAnnotationToField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2921:1: ( rule__AddAnnotationToField__Group__3__Impl rule__AddAnnotationToField__Group__4 )
            // InternalAedit.g:2922:2: rule__AddAnnotationToField__Group__3__Impl rule__AddAnnotationToField__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__AddAnnotationToField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToField__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToField__Group__3"


    // $ANTLR start "rule__AddAnnotationToField__Group__3__Impl"
    // InternalAedit.g:2929:1: rule__AddAnnotationToField__Group__3__Impl : ( ( rule__AddAnnotationToField__AnnotationAssignment_3 ) ) ;
    public final void rule__AddAnnotationToField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2933:1: ( ( ( rule__AddAnnotationToField__AnnotationAssignment_3 ) ) )
            // InternalAedit.g:2934:1: ( ( rule__AddAnnotationToField__AnnotationAssignment_3 ) )
            {
            // InternalAedit.g:2934:1: ( ( rule__AddAnnotationToField__AnnotationAssignment_3 ) )
            // InternalAedit.g:2935:2: ( rule__AddAnnotationToField__AnnotationAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToFieldAccess().getAnnotationAssignment_3()); 
            }
            // InternalAedit.g:2936:2: ( rule__AddAnnotationToField__AnnotationAssignment_3 )
            // InternalAedit.g:2936:3: rule__AddAnnotationToField__AnnotationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToField__AnnotationAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToFieldAccess().getAnnotationAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToField__Group__3__Impl"


    // $ANTLR start "rule__AddAnnotationToField__Group__4"
    // InternalAedit.g:2944:1: rule__AddAnnotationToField__Group__4 : rule__AddAnnotationToField__Group__4__Impl ;
    public final void rule__AddAnnotationToField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2948:1: ( rule__AddAnnotationToField__Group__4__Impl )
            // InternalAedit.g:2949:2: rule__AddAnnotationToField__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddAnnotationToField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToField__Group__4"


    // $ANTLR start "rule__AddAnnotationToField__Group__4__Impl"
    // InternalAedit.g:2955:1: rule__AddAnnotationToField__Group__4__Impl : ( ';' ) ;
    public final void rule__AddAnnotationToField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2959:1: ( ( ';' ) )
            // InternalAedit.g:2960:1: ( ';' )
            {
            // InternalAedit.g:2960:1: ( ';' )
            // InternalAedit.g:2961:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToFieldAccess().getSemicolonKeyword_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToFieldAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToField__Group__4__Impl"


    // $ANTLR start "rule__AddNameAnnotationToField__Group__0"
    // InternalAedit.g:2971:1: rule__AddNameAnnotationToField__Group__0 : rule__AddNameAnnotationToField__Group__0__Impl rule__AddNameAnnotationToField__Group__1 ;
    public final void rule__AddNameAnnotationToField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2975:1: ( rule__AddNameAnnotationToField__Group__0__Impl rule__AddNameAnnotationToField__Group__1 )
            // InternalAedit.g:2976:2: rule__AddNameAnnotationToField__Group__0__Impl rule__AddNameAnnotationToField__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AddNameAnnotationToField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddNameAnnotationToField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddNameAnnotationToField__Group__0"


    // $ANTLR start "rule__AddNameAnnotationToField__Group__0__Impl"
    // InternalAedit.g:2983:1: rule__AddNameAnnotationToField__Group__0__Impl : ( 'add.name_annot' ) ;
    public final void rule__AddNameAnnotationToField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2987:1: ( ( 'add.name_annot' ) )
            // InternalAedit.g:2988:1: ( 'add.name_annot' )
            {
            // InternalAedit.g:2988:1: ( 'add.name_annot' )
            // InternalAedit.g:2989:2: 'add.name_annot'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddNameAnnotationToFieldAccess().getAddName_annotKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddNameAnnotationToFieldAccess().getAddName_annotKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddNameAnnotationToField__Group__0__Impl"


    // $ANTLR start "rule__AddNameAnnotationToField__Group__1"
    // InternalAedit.g:2998:1: rule__AddNameAnnotationToField__Group__1 : rule__AddNameAnnotationToField__Group__1__Impl rule__AddNameAnnotationToField__Group__2 ;
    public final void rule__AddNameAnnotationToField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3002:1: ( rule__AddNameAnnotationToField__Group__1__Impl rule__AddNameAnnotationToField__Group__2 )
            // InternalAedit.g:3003:2: rule__AddNameAnnotationToField__Group__1__Impl rule__AddNameAnnotationToField__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__AddNameAnnotationToField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddNameAnnotationToField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddNameAnnotationToField__Group__1"


    // $ANTLR start "rule__AddNameAnnotationToField__Group__1__Impl"
    // InternalAedit.g:3010:1: rule__AddNameAnnotationToField__Group__1__Impl : ( ( rule__AddNameAnnotationToField__VariableAssignment_1 ) ) ;
    public final void rule__AddNameAnnotationToField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3014:1: ( ( ( rule__AddNameAnnotationToField__VariableAssignment_1 ) ) )
            // InternalAedit.g:3015:1: ( ( rule__AddNameAnnotationToField__VariableAssignment_1 ) )
            {
            // InternalAedit.g:3015:1: ( ( rule__AddNameAnnotationToField__VariableAssignment_1 ) )
            // InternalAedit.g:3016:2: ( rule__AddNameAnnotationToField__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddNameAnnotationToFieldAccess().getVariableAssignment_1()); 
            }
            // InternalAedit.g:3017:2: ( rule__AddNameAnnotationToField__VariableAssignment_1 )
            // InternalAedit.g:3017:3: rule__AddNameAnnotationToField__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddNameAnnotationToField__VariableAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddNameAnnotationToFieldAccess().getVariableAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddNameAnnotationToField__Group__1__Impl"


    // $ANTLR start "rule__AddNameAnnotationToField__Group__2"
    // InternalAedit.g:3025:1: rule__AddNameAnnotationToField__Group__2 : rule__AddNameAnnotationToField__Group__2__Impl rule__AddNameAnnotationToField__Group__3 ;
    public final void rule__AddNameAnnotationToField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3029:1: ( rule__AddNameAnnotationToField__Group__2__Impl rule__AddNameAnnotationToField__Group__3 )
            // InternalAedit.g:3030:2: rule__AddNameAnnotationToField__Group__2__Impl rule__AddNameAnnotationToField__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__AddNameAnnotationToField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddNameAnnotationToField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddNameAnnotationToField__Group__2"


    // $ANTLR start "rule__AddNameAnnotationToField__Group__2__Impl"
    // InternalAedit.g:3037:1: rule__AddNameAnnotationToField__Group__2__Impl : ( '=>' ) ;
    public final void rule__AddNameAnnotationToField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3041:1: ( ( '=>' ) )
            // InternalAedit.g:3042:1: ( '=>' )
            {
            // InternalAedit.g:3042:1: ( '=>' )
            // InternalAedit.g:3043:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddNameAnnotationToFieldAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddNameAnnotationToFieldAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddNameAnnotationToField__Group__2__Impl"


    // $ANTLR start "rule__AddNameAnnotationToField__Group__3"
    // InternalAedit.g:3052:1: rule__AddNameAnnotationToField__Group__3 : rule__AddNameAnnotationToField__Group__3__Impl rule__AddNameAnnotationToField__Group__4 ;
    public final void rule__AddNameAnnotationToField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3056:1: ( rule__AddNameAnnotationToField__Group__3__Impl rule__AddNameAnnotationToField__Group__4 )
            // InternalAedit.g:3057:2: rule__AddNameAnnotationToField__Group__3__Impl rule__AddNameAnnotationToField__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__AddNameAnnotationToField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddNameAnnotationToField__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddNameAnnotationToField__Group__3"


    // $ANTLR start "rule__AddNameAnnotationToField__Group__3__Impl"
    // InternalAedit.g:3064:1: rule__AddNameAnnotationToField__Group__3__Impl : ( ( rule__AddNameAnnotationToField__AnnotationAssignment_3 ) ) ;
    public final void rule__AddNameAnnotationToField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3068:1: ( ( ( rule__AddNameAnnotationToField__AnnotationAssignment_3 ) ) )
            // InternalAedit.g:3069:1: ( ( rule__AddNameAnnotationToField__AnnotationAssignment_3 ) )
            {
            // InternalAedit.g:3069:1: ( ( rule__AddNameAnnotationToField__AnnotationAssignment_3 ) )
            // InternalAedit.g:3070:2: ( rule__AddNameAnnotationToField__AnnotationAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddNameAnnotationToFieldAccess().getAnnotationAssignment_3()); 
            }
            // InternalAedit.g:3071:2: ( rule__AddNameAnnotationToField__AnnotationAssignment_3 )
            // InternalAedit.g:3071:3: rule__AddNameAnnotationToField__AnnotationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AddNameAnnotationToField__AnnotationAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddNameAnnotationToFieldAccess().getAnnotationAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddNameAnnotationToField__Group__3__Impl"


    // $ANTLR start "rule__AddNameAnnotationToField__Group__4"
    // InternalAedit.g:3079:1: rule__AddNameAnnotationToField__Group__4 : rule__AddNameAnnotationToField__Group__4__Impl ;
    public final void rule__AddNameAnnotationToField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3083:1: ( rule__AddNameAnnotationToField__Group__4__Impl )
            // InternalAedit.g:3084:2: rule__AddNameAnnotationToField__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddNameAnnotationToField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddNameAnnotationToField__Group__4"


    // $ANTLR start "rule__AddNameAnnotationToField__Group__4__Impl"
    // InternalAedit.g:3090:1: rule__AddNameAnnotationToField__Group__4__Impl : ( ';' ) ;
    public final void rule__AddNameAnnotationToField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3094:1: ( ( ';' ) )
            // InternalAedit.g:3095:1: ( ';' )
            {
            // InternalAedit.g:3095:1: ( ';' )
            // InternalAedit.g:3096:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddNameAnnotationToFieldAccess().getSemicolonKeyword_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddNameAnnotationToFieldAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddNameAnnotationToField__Group__4__Impl"


    // $ANTLR start "rule__RemoveAnnotationFromSchema__Group__0"
    // InternalAedit.g:3106:1: rule__RemoveAnnotationFromSchema__Group__0 : rule__RemoveAnnotationFromSchema__Group__0__Impl rule__RemoveAnnotationFromSchema__Group__1 ;
    public final void rule__RemoveAnnotationFromSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3110:1: ( rule__RemoveAnnotationFromSchema__Group__0__Impl rule__RemoveAnnotationFromSchema__Group__1 )
            // InternalAedit.g:3111:2: rule__RemoveAnnotationFromSchema__Group__0__Impl rule__RemoveAnnotationFromSchema__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__RemoveAnnotationFromSchema__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromSchema__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromSchema__Group__0"


    // $ANTLR start "rule__RemoveAnnotationFromSchema__Group__0__Impl"
    // InternalAedit.g:3118:1: rule__RemoveAnnotationFromSchema__Group__0__Impl : ( 'remove.annot' ) ;
    public final void rule__RemoveAnnotationFromSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3122:1: ( ( 'remove.annot' ) )
            // InternalAedit.g:3123:1: ( 'remove.annot' )
            {
            // InternalAedit.g:3123:1: ( 'remove.annot' )
            // InternalAedit.g:3124:2: 'remove.annot'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaAccess().getRemoveAnnotKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromSchemaAccess().getRemoveAnnotKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromSchema__Group__0__Impl"


    // $ANTLR start "rule__RemoveAnnotationFromSchema__Group__1"
    // InternalAedit.g:3133:1: rule__RemoveAnnotationFromSchema__Group__1 : rule__RemoveAnnotationFromSchema__Group__1__Impl rule__RemoveAnnotationFromSchema__Group__2 ;
    public final void rule__RemoveAnnotationFromSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3137:1: ( rule__RemoveAnnotationFromSchema__Group__1__Impl rule__RemoveAnnotationFromSchema__Group__2 )
            // InternalAedit.g:3138:2: rule__RemoveAnnotationFromSchema__Group__1__Impl rule__RemoveAnnotationFromSchema__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__RemoveAnnotationFromSchema__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromSchema__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromSchema__Group__1"


    // $ANTLR start "rule__RemoveAnnotationFromSchema__Group__1__Impl"
    // InternalAedit.g:3145:1: rule__RemoveAnnotationFromSchema__Group__1__Impl : ( ( rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1 ) ) ;
    public final void rule__RemoveAnnotationFromSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3149:1: ( ( ( rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1 ) ) )
            // InternalAedit.g:3150:1: ( ( rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1 ) )
            {
            // InternalAedit.g:3150:1: ( ( rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1 ) )
            // InternalAedit.g:3151:2: ( rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaAccess().getSchemaTypeAssignment_1()); 
            }
            // InternalAedit.g:3152:2: ( rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1 )
            // InternalAedit.g:3152:3: rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromSchemaAccess().getSchemaTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromSchema__Group__1__Impl"


    // $ANTLR start "rule__RemoveAnnotationFromSchema__Group__2"
    // InternalAedit.g:3160:1: rule__RemoveAnnotationFromSchema__Group__2 : rule__RemoveAnnotationFromSchema__Group__2__Impl rule__RemoveAnnotationFromSchema__Group__3 ;
    public final void rule__RemoveAnnotationFromSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3164:1: ( rule__RemoveAnnotationFromSchema__Group__2__Impl rule__RemoveAnnotationFromSchema__Group__3 )
            // InternalAedit.g:3165:2: rule__RemoveAnnotationFromSchema__Group__2__Impl rule__RemoveAnnotationFromSchema__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__RemoveAnnotationFromSchema__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromSchema__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromSchema__Group__2"


    // $ANTLR start "rule__RemoveAnnotationFromSchema__Group__2__Impl"
    // InternalAedit.g:3172:1: rule__RemoveAnnotationFromSchema__Group__2__Impl : ( ( rule__RemoveAnnotationFromSchema__SchemaAssignment_2 ) ) ;
    public final void rule__RemoveAnnotationFromSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3176:1: ( ( ( rule__RemoveAnnotationFromSchema__SchemaAssignment_2 ) ) )
            // InternalAedit.g:3177:1: ( ( rule__RemoveAnnotationFromSchema__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:3177:1: ( ( rule__RemoveAnnotationFromSchema__SchemaAssignment_2 ) )
            // InternalAedit.g:3178:2: ( rule__RemoveAnnotationFromSchema__SchemaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaAccess().getSchemaAssignment_2()); 
            }
            // InternalAedit.g:3179:2: ( rule__RemoveAnnotationFromSchema__SchemaAssignment_2 )
            // InternalAedit.g:3179:3: rule__RemoveAnnotationFromSchema__SchemaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromSchema__SchemaAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromSchemaAccess().getSchemaAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromSchema__Group__2__Impl"


    // $ANTLR start "rule__RemoveAnnotationFromSchema__Group__3"
    // InternalAedit.g:3187:1: rule__RemoveAnnotationFromSchema__Group__3 : rule__RemoveAnnotationFromSchema__Group__3__Impl rule__RemoveAnnotationFromSchema__Group__4 ;
    public final void rule__RemoveAnnotationFromSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3191:1: ( rule__RemoveAnnotationFromSchema__Group__3__Impl rule__RemoveAnnotationFromSchema__Group__4 )
            // InternalAedit.g:3192:2: rule__RemoveAnnotationFromSchema__Group__3__Impl rule__RemoveAnnotationFromSchema__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__RemoveAnnotationFromSchema__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromSchema__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromSchema__Group__3"


    // $ANTLR start "rule__RemoveAnnotationFromSchema__Group__3__Impl"
    // InternalAedit.g:3199:1: rule__RemoveAnnotationFromSchema__Group__3__Impl : ( '=>' ) ;
    public final void rule__RemoveAnnotationFromSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3203:1: ( ( '=>' ) )
            // InternalAedit.g:3204:1: ( '=>' )
            {
            // InternalAedit.g:3204:1: ( '=>' )
            // InternalAedit.g:3205:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromSchemaAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromSchema__Group__3__Impl"


    // $ANTLR start "rule__RemoveAnnotationFromSchema__Group__4"
    // InternalAedit.g:3214:1: rule__RemoveAnnotationFromSchema__Group__4 : rule__RemoveAnnotationFromSchema__Group__4__Impl rule__RemoveAnnotationFromSchema__Group__5 ;
    public final void rule__RemoveAnnotationFromSchema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3218:1: ( rule__RemoveAnnotationFromSchema__Group__4__Impl rule__RemoveAnnotationFromSchema__Group__5 )
            // InternalAedit.g:3219:2: rule__RemoveAnnotationFromSchema__Group__4__Impl rule__RemoveAnnotationFromSchema__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__RemoveAnnotationFromSchema__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromSchema__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromSchema__Group__4"


    // $ANTLR start "rule__RemoveAnnotationFromSchema__Group__4__Impl"
    // InternalAedit.g:3226:1: rule__RemoveAnnotationFromSchema__Group__4__Impl : ( ( rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4 ) ) ;
    public final void rule__RemoveAnnotationFromSchema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3230:1: ( ( ( rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4 ) ) )
            // InternalAedit.g:3231:1: ( ( rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4 ) )
            {
            // InternalAedit.g:3231:1: ( ( rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4 ) )
            // InternalAedit.g:3232:2: ( rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaAccess().getAnnotationToRemoveAssignment_4()); 
            }
            // InternalAedit.g:3233:2: ( rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4 )
            // InternalAedit.g:3233:3: rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromSchemaAccess().getAnnotationToRemoveAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromSchema__Group__4__Impl"


    // $ANTLR start "rule__RemoveAnnotationFromSchema__Group__5"
    // InternalAedit.g:3241:1: rule__RemoveAnnotationFromSchema__Group__5 : rule__RemoveAnnotationFromSchema__Group__5__Impl ;
    public final void rule__RemoveAnnotationFromSchema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3245:1: ( rule__RemoveAnnotationFromSchema__Group__5__Impl )
            // InternalAedit.g:3246:2: rule__RemoveAnnotationFromSchema__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromSchema__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromSchema__Group__5"


    // $ANTLR start "rule__RemoveAnnotationFromSchema__Group__5__Impl"
    // InternalAedit.g:3252:1: rule__RemoveAnnotationFromSchema__Group__5__Impl : ( ';' ) ;
    public final void rule__RemoveAnnotationFromSchema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3256:1: ( ( ';' ) )
            // InternalAedit.g:3257:1: ( ';' )
            {
            // InternalAedit.g:3257:1: ( ';' )
            // InternalAedit.g:3258:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaAccess().getSemicolonKeyword_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromSchemaAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromSchema__Group__5__Impl"


    // $ANTLR start "rule__RemoveAnnotationFromField__Group__0"
    // InternalAedit.g:3268:1: rule__RemoveAnnotationFromField__Group__0 : rule__RemoveAnnotationFromField__Group__0__Impl rule__RemoveAnnotationFromField__Group__1 ;
    public final void rule__RemoveAnnotationFromField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3272:1: ( rule__RemoveAnnotationFromField__Group__0__Impl rule__RemoveAnnotationFromField__Group__1 )
            // InternalAedit.g:3273:2: rule__RemoveAnnotationFromField__Group__0__Impl rule__RemoveAnnotationFromField__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RemoveAnnotationFromField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromField__Group__0"


    // $ANTLR start "rule__RemoveAnnotationFromField__Group__0__Impl"
    // InternalAedit.g:3280:1: rule__RemoveAnnotationFromField__Group__0__Impl : ( 'remove.annot' ) ;
    public final void rule__RemoveAnnotationFromField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3284:1: ( ( 'remove.annot' ) )
            // InternalAedit.g:3285:1: ( 'remove.annot' )
            {
            // InternalAedit.g:3285:1: ( 'remove.annot' )
            // InternalAedit.g:3286:2: 'remove.annot'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromFieldAccess().getRemoveAnnotKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromFieldAccess().getRemoveAnnotKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromField__Group__0__Impl"


    // $ANTLR start "rule__RemoveAnnotationFromField__Group__1"
    // InternalAedit.g:3295:1: rule__RemoveAnnotationFromField__Group__1 : rule__RemoveAnnotationFromField__Group__1__Impl rule__RemoveAnnotationFromField__Group__2 ;
    public final void rule__RemoveAnnotationFromField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3299:1: ( rule__RemoveAnnotationFromField__Group__1__Impl rule__RemoveAnnotationFromField__Group__2 )
            // InternalAedit.g:3300:2: rule__RemoveAnnotationFromField__Group__1__Impl rule__RemoveAnnotationFromField__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__RemoveAnnotationFromField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromField__Group__1"


    // $ANTLR start "rule__RemoveAnnotationFromField__Group__1__Impl"
    // InternalAedit.g:3307:1: rule__RemoveAnnotationFromField__Group__1__Impl : ( ( rule__RemoveAnnotationFromField__VariableAssignment_1 ) ) ;
    public final void rule__RemoveAnnotationFromField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3311:1: ( ( ( rule__RemoveAnnotationFromField__VariableAssignment_1 ) ) )
            // InternalAedit.g:3312:1: ( ( rule__RemoveAnnotationFromField__VariableAssignment_1 ) )
            {
            // InternalAedit.g:3312:1: ( ( rule__RemoveAnnotationFromField__VariableAssignment_1 ) )
            // InternalAedit.g:3313:2: ( rule__RemoveAnnotationFromField__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromFieldAccess().getVariableAssignment_1()); 
            }
            // InternalAedit.g:3314:2: ( rule__RemoveAnnotationFromField__VariableAssignment_1 )
            // InternalAedit.g:3314:3: rule__RemoveAnnotationFromField__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromField__VariableAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromFieldAccess().getVariableAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromField__Group__1__Impl"


    // $ANTLR start "rule__RemoveAnnotationFromField__Group__2"
    // InternalAedit.g:3322:1: rule__RemoveAnnotationFromField__Group__2 : rule__RemoveAnnotationFromField__Group__2__Impl rule__RemoveAnnotationFromField__Group__3 ;
    public final void rule__RemoveAnnotationFromField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3326:1: ( rule__RemoveAnnotationFromField__Group__2__Impl rule__RemoveAnnotationFromField__Group__3 )
            // InternalAedit.g:3327:2: rule__RemoveAnnotationFromField__Group__2__Impl rule__RemoveAnnotationFromField__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__RemoveAnnotationFromField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromField__Group__2"


    // $ANTLR start "rule__RemoveAnnotationFromField__Group__2__Impl"
    // InternalAedit.g:3334:1: rule__RemoveAnnotationFromField__Group__2__Impl : ( '=>' ) ;
    public final void rule__RemoveAnnotationFromField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3338:1: ( ( '=>' ) )
            // InternalAedit.g:3339:1: ( '=>' )
            {
            // InternalAedit.g:3339:1: ( '=>' )
            // InternalAedit.g:3340:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromFieldAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromFieldAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromField__Group__2__Impl"


    // $ANTLR start "rule__RemoveAnnotationFromField__Group__3"
    // InternalAedit.g:3349:1: rule__RemoveAnnotationFromField__Group__3 : rule__RemoveAnnotationFromField__Group__3__Impl rule__RemoveAnnotationFromField__Group__4 ;
    public final void rule__RemoveAnnotationFromField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3353:1: ( rule__RemoveAnnotationFromField__Group__3__Impl rule__RemoveAnnotationFromField__Group__4 )
            // InternalAedit.g:3354:2: rule__RemoveAnnotationFromField__Group__3__Impl rule__RemoveAnnotationFromField__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__RemoveAnnotationFromField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromField__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromField__Group__3"


    // $ANTLR start "rule__RemoveAnnotationFromField__Group__3__Impl"
    // InternalAedit.g:3361:1: rule__RemoveAnnotationFromField__Group__3__Impl : ( ( rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3 ) ) ;
    public final void rule__RemoveAnnotationFromField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3365:1: ( ( ( rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3 ) ) )
            // InternalAedit.g:3366:1: ( ( rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3 ) )
            {
            // InternalAedit.g:3366:1: ( ( rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3 ) )
            // InternalAedit.g:3367:2: ( rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromFieldAccess().getAnnotationToRemoveAssignment_3()); 
            }
            // InternalAedit.g:3368:2: ( rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3 )
            // InternalAedit.g:3368:3: rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromFieldAccess().getAnnotationToRemoveAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromField__Group__3__Impl"


    // $ANTLR start "rule__RemoveAnnotationFromField__Group__4"
    // InternalAedit.g:3376:1: rule__RemoveAnnotationFromField__Group__4 : rule__RemoveAnnotationFromField__Group__4__Impl ;
    public final void rule__RemoveAnnotationFromField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3380:1: ( rule__RemoveAnnotationFromField__Group__4__Impl )
            // InternalAedit.g:3381:2: rule__RemoveAnnotationFromField__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveAnnotationFromField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromField__Group__4"


    // $ANTLR start "rule__RemoveAnnotationFromField__Group__4__Impl"
    // InternalAedit.g:3387:1: rule__RemoveAnnotationFromField__Group__4__Impl : ( ';' ) ;
    public final void rule__RemoveAnnotationFromField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3391:1: ( ( ';' ) )
            // InternalAedit.g:3392:1: ( ';' )
            {
            // InternalAedit.g:3392:1: ( ';' )
            // InternalAedit.g:3393:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromFieldAccess().getSemicolonKeyword_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromFieldAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromField__Group__4__Impl"


    // $ANTLR start "rule__RemoveNameAnnotationFromField__Group__0"
    // InternalAedit.g:3403:1: rule__RemoveNameAnnotationFromField__Group__0 : rule__RemoveNameAnnotationFromField__Group__0__Impl rule__RemoveNameAnnotationFromField__Group__1 ;
    public final void rule__RemoveNameAnnotationFromField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3407:1: ( rule__RemoveNameAnnotationFromField__Group__0__Impl rule__RemoveNameAnnotationFromField__Group__1 )
            // InternalAedit.g:3408:2: rule__RemoveNameAnnotationFromField__Group__0__Impl rule__RemoveNameAnnotationFromField__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RemoveNameAnnotationFromField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveNameAnnotationFromField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveNameAnnotationFromField__Group__0"


    // $ANTLR start "rule__RemoveNameAnnotationFromField__Group__0__Impl"
    // InternalAedit.g:3415:1: rule__RemoveNameAnnotationFromField__Group__0__Impl : ( 'remove.name_annot' ) ;
    public final void rule__RemoveNameAnnotationFromField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3419:1: ( ( 'remove.name_annot' ) )
            // InternalAedit.g:3420:1: ( 'remove.name_annot' )
            {
            // InternalAedit.g:3420:1: ( 'remove.name_annot' )
            // InternalAedit.g:3421:2: 'remove.name_annot'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getRemoveName_annotKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getRemoveName_annotKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveNameAnnotationFromField__Group__0__Impl"


    // $ANTLR start "rule__RemoveNameAnnotationFromField__Group__1"
    // InternalAedit.g:3430:1: rule__RemoveNameAnnotationFromField__Group__1 : rule__RemoveNameAnnotationFromField__Group__1__Impl rule__RemoveNameAnnotationFromField__Group__2 ;
    public final void rule__RemoveNameAnnotationFromField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3434:1: ( rule__RemoveNameAnnotationFromField__Group__1__Impl rule__RemoveNameAnnotationFromField__Group__2 )
            // InternalAedit.g:3435:2: rule__RemoveNameAnnotationFromField__Group__1__Impl rule__RemoveNameAnnotationFromField__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__RemoveNameAnnotationFromField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveNameAnnotationFromField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveNameAnnotationFromField__Group__1"


    // $ANTLR start "rule__RemoveNameAnnotationFromField__Group__1__Impl"
    // InternalAedit.g:3442:1: rule__RemoveNameAnnotationFromField__Group__1__Impl : ( ( rule__RemoveNameAnnotationFromField__VariableAssignment_1 ) ) ;
    public final void rule__RemoveNameAnnotationFromField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3446:1: ( ( ( rule__RemoveNameAnnotationFromField__VariableAssignment_1 ) ) )
            // InternalAedit.g:3447:1: ( ( rule__RemoveNameAnnotationFromField__VariableAssignment_1 ) )
            {
            // InternalAedit.g:3447:1: ( ( rule__RemoveNameAnnotationFromField__VariableAssignment_1 ) )
            // InternalAedit.g:3448:2: ( rule__RemoveNameAnnotationFromField__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getVariableAssignment_1()); 
            }
            // InternalAedit.g:3449:2: ( rule__RemoveNameAnnotationFromField__VariableAssignment_1 )
            // InternalAedit.g:3449:3: rule__RemoveNameAnnotationFromField__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RemoveNameAnnotationFromField__VariableAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getVariableAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveNameAnnotationFromField__Group__1__Impl"


    // $ANTLR start "rule__RemoveNameAnnotationFromField__Group__2"
    // InternalAedit.g:3457:1: rule__RemoveNameAnnotationFromField__Group__2 : rule__RemoveNameAnnotationFromField__Group__2__Impl rule__RemoveNameAnnotationFromField__Group__3 ;
    public final void rule__RemoveNameAnnotationFromField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3461:1: ( rule__RemoveNameAnnotationFromField__Group__2__Impl rule__RemoveNameAnnotationFromField__Group__3 )
            // InternalAedit.g:3462:2: rule__RemoveNameAnnotationFromField__Group__2__Impl rule__RemoveNameAnnotationFromField__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__RemoveNameAnnotationFromField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveNameAnnotationFromField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveNameAnnotationFromField__Group__2"


    // $ANTLR start "rule__RemoveNameAnnotationFromField__Group__2__Impl"
    // InternalAedit.g:3469:1: rule__RemoveNameAnnotationFromField__Group__2__Impl : ( '=>' ) ;
    public final void rule__RemoveNameAnnotationFromField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3473:1: ( ( '=>' ) )
            // InternalAedit.g:3474:1: ( '=>' )
            {
            // InternalAedit.g:3474:1: ( '=>' )
            // InternalAedit.g:3475:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveNameAnnotationFromField__Group__2__Impl"


    // $ANTLR start "rule__RemoveNameAnnotationFromField__Group__3"
    // InternalAedit.g:3484:1: rule__RemoveNameAnnotationFromField__Group__3 : rule__RemoveNameAnnotationFromField__Group__3__Impl rule__RemoveNameAnnotationFromField__Group__4 ;
    public final void rule__RemoveNameAnnotationFromField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3488:1: ( rule__RemoveNameAnnotationFromField__Group__3__Impl rule__RemoveNameAnnotationFromField__Group__4 )
            // InternalAedit.g:3489:2: rule__RemoveNameAnnotationFromField__Group__3__Impl rule__RemoveNameAnnotationFromField__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__RemoveNameAnnotationFromField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveNameAnnotationFromField__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveNameAnnotationFromField__Group__3"


    // $ANTLR start "rule__RemoveNameAnnotationFromField__Group__3__Impl"
    // InternalAedit.g:3496:1: rule__RemoveNameAnnotationFromField__Group__3__Impl : ( ( rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3 ) ) ;
    public final void rule__RemoveNameAnnotationFromField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3500:1: ( ( ( rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3 ) ) )
            // InternalAedit.g:3501:1: ( ( rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3 ) )
            {
            // InternalAedit.g:3501:1: ( ( rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3 ) )
            // InternalAedit.g:3502:2: ( rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getAnnotationToRemoveAssignment_3()); 
            }
            // InternalAedit.g:3503:2: ( rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3 )
            // InternalAedit.g:3503:3: rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getAnnotationToRemoveAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveNameAnnotationFromField__Group__3__Impl"


    // $ANTLR start "rule__RemoveNameAnnotationFromField__Group__4"
    // InternalAedit.g:3511:1: rule__RemoveNameAnnotationFromField__Group__4 : rule__RemoveNameAnnotationFromField__Group__4__Impl ;
    public final void rule__RemoveNameAnnotationFromField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3515:1: ( rule__RemoveNameAnnotationFromField__Group__4__Impl )
            // InternalAedit.g:3516:2: rule__RemoveNameAnnotationFromField__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveNameAnnotationFromField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveNameAnnotationFromField__Group__4"


    // $ANTLR start "rule__RemoveNameAnnotationFromField__Group__4__Impl"
    // InternalAedit.g:3522:1: rule__RemoveNameAnnotationFromField__Group__4__Impl : ( ';' ) ;
    public final void rule__RemoveNameAnnotationFromField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3526:1: ( ( ';' ) )
            // InternalAedit.g:3527:1: ( ';' )
            {
            // InternalAedit.g:3527:1: ( ';' )
            // InternalAedit.g:3528:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getSemicolonKeyword_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveNameAnnotationFromField__Group__4__Impl"


    // $ANTLR start "rule__ChangeSchema__Group__0"
    // InternalAedit.g:3538:1: rule__ChangeSchema__Group__0 : rule__ChangeSchema__Group__0__Impl rule__ChangeSchema__Group__1 ;
    public final void rule__ChangeSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3542:1: ( rule__ChangeSchema__Group__0__Impl rule__ChangeSchema__Group__1 )
            // InternalAedit.g:3543:2: rule__ChangeSchema__Group__0__Impl rule__ChangeSchema__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ChangeSchema__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeSchema__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSchema__Group__0"


    // $ANTLR start "rule__ChangeSchema__Group__0__Impl"
    // InternalAedit.g:3550:1: rule__ChangeSchema__Group__0__Impl : ( 'change' ) ;
    public final void rule__ChangeSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3554:1: ( ( 'change' ) )
            // InternalAedit.g:3555:1: ( 'change' )
            {
            // InternalAedit.g:3555:1: ( 'change' )
            // InternalAedit.g:3556:2: 'change'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeSchemaAccess().getChangeKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeSchemaAccess().getChangeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSchema__Group__0__Impl"


    // $ANTLR start "rule__ChangeSchema__Group__1"
    // InternalAedit.g:3565:1: rule__ChangeSchema__Group__1 : rule__ChangeSchema__Group__1__Impl rule__ChangeSchema__Group__2 ;
    public final void rule__ChangeSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3569:1: ( rule__ChangeSchema__Group__1__Impl rule__ChangeSchema__Group__2 )
            // InternalAedit.g:3570:2: rule__ChangeSchema__Group__1__Impl rule__ChangeSchema__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ChangeSchema__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeSchema__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSchema__Group__1"


    // $ANTLR start "rule__ChangeSchema__Group__1__Impl"
    // InternalAedit.g:3577:1: rule__ChangeSchema__Group__1__Impl : ( ( rule__ChangeSchema__SchemaTypeAssignment_1 ) ) ;
    public final void rule__ChangeSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3581:1: ( ( ( rule__ChangeSchema__SchemaTypeAssignment_1 ) ) )
            // InternalAedit.g:3582:1: ( ( rule__ChangeSchema__SchemaTypeAssignment_1 ) )
            {
            // InternalAedit.g:3582:1: ( ( rule__ChangeSchema__SchemaTypeAssignment_1 ) )
            // InternalAedit.g:3583:2: ( rule__ChangeSchema__SchemaTypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeSchemaAccess().getSchemaTypeAssignment_1()); 
            }
            // InternalAedit.g:3584:2: ( rule__ChangeSchema__SchemaTypeAssignment_1 )
            // InternalAedit.g:3584:3: rule__ChangeSchema__SchemaTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ChangeSchema__SchemaTypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeSchemaAccess().getSchemaTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSchema__Group__1__Impl"


    // $ANTLR start "rule__ChangeSchema__Group__2"
    // InternalAedit.g:3592:1: rule__ChangeSchema__Group__2 : rule__ChangeSchema__Group__2__Impl rule__ChangeSchema__Group__3 ;
    public final void rule__ChangeSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3596:1: ( rule__ChangeSchema__Group__2__Impl rule__ChangeSchema__Group__3 )
            // InternalAedit.g:3597:2: rule__ChangeSchema__Group__2__Impl rule__ChangeSchema__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ChangeSchema__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeSchema__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSchema__Group__2"


    // $ANTLR start "rule__ChangeSchema__Group__2__Impl"
    // InternalAedit.g:3604:1: rule__ChangeSchema__Group__2__Impl : ( ( rule__ChangeSchema__SchemaAssignment_2 ) ) ;
    public final void rule__ChangeSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3608:1: ( ( ( rule__ChangeSchema__SchemaAssignment_2 ) ) )
            // InternalAedit.g:3609:1: ( ( rule__ChangeSchema__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:3609:1: ( ( rule__ChangeSchema__SchemaAssignment_2 ) )
            // InternalAedit.g:3610:2: ( rule__ChangeSchema__SchemaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeSchemaAccess().getSchemaAssignment_2()); 
            }
            // InternalAedit.g:3611:2: ( rule__ChangeSchema__SchemaAssignment_2 )
            // InternalAedit.g:3611:3: rule__ChangeSchema__SchemaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ChangeSchema__SchemaAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeSchemaAccess().getSchemaAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSchema__Group__2__Impl"


    // $ANTLR start "rule__ChangeSchema__Group__3"
    // InternalAedit.g:3619:1: rule__ChangeSchema__Group__3 : rule__ChangeSchema__Group__3__Impl rule__ChangeSchema__Group__4 ;
    public final void rule__ChangeSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3623:1: ( rule__ChangeSchema__Group__3__Impl rule__ChangeSchema__Group__4 )
            // InternalAedit.g:3624:2: rule__ChangeSchema__Group__3__Impl rule__ChangeSchema__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ChangeSchema__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeSchema__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSchema__Group__3"


    // $ANTLR start "rule__ChangeSchema__Group__3__Impl"
    // InternalAedit.g:3631:1: rule__ChangeSchema__Group__3__Impl : ( '{' ) ;
    public final void rule__ChangeSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3635:1: ( ( '{' ) )
            // InternalAedit.g:3636:1: ( '{' )
            {
            // InternalAedit.g:3636:1: ( '{' )
            // InternalAedit.g:3637:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeSchemaAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeSchemaAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSchema__Group__3__Impl"


    // $ANTLR start "rule__ChangeSchema__Group__4"
    // InternalAedit.g:3646:1: rule__ChangeSchema__Group__4 : rule__ChangeSchema__Group__4__Impl rule__ChangeSchema__Group__5 ;
    public final void rule__ChangeSchema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3650:1: ( rule__ChangeSchema__Group__4__Impl rule__ChangeSchema__Group__5 )
            // InternalAedit.g:3651:2: rule__ChangeSchema__Group__4__Impl rule__ChangeSchema__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__ChangeSchema__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeSchema__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSchema__Group__4"


    // $ANTLR start "rule__ChangeSchema__Group__4__Impl"
    // InternalAedit.g:3658:1: rule__ChangeSchema__Group__4__Impl : ( ( rule__ChangeSchema__RulesAssignment_4 )* ) ;
    public final void rule__ChangeSchema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3662:1: ( ( ( rule__ChangeSchema__RulesAssignment_4 )* ) )
            // InternalAedit.g:3663:1: ( ( rule__ChangeSchema__RulesAssignment_4 )* )
            {
            // InternalAedit.g:3663:1: ( ( rule__ChangeSchema__RulesAssignment_4 )* )
            // InternalAedit.g:3664:2: ( rule__ChangeSchema__RulesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeSchemaAccess().getRulesAssignment_4()); 
            }
            // InternalAedit.g:3665:2: ( rule__ChangeSchema__RulesAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==30||(LA24_0>=32 && LA24_0<=34)||LA24_0==36||(LA24_0>=41 && LA24_0<=47)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAedit.g:3665:3: rule__ChangeSchema__RulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ChangeSchema__RulesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeSchemaAccess().getRulesAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSchema__Group__4__Impl"


    // $ANTLR start "rule__ChangeSchema__Group__5"
    // InternalAedit.g:3673:1: rule__ChangeSchema__Group__5 : rule__ChangeSchema__Group__5__Impl ;
    public final void rule__ChangeSchema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3677:1: ( rule__ChangeSchema__Group__5__Impl )
            // InternalAedit.g:3678:2: rule__ChangeSchema__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeSchema__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSchema__Group__5"


    // $ANTLR start "rule__ChangeSchema__Group__5__Impl"
    // InternalAedit.g:3684:1: rule__ChangeSchema__Group__5__Impl : ( '}' ) ;
    public final void rule__ChangeSchema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3688:1: ( ( '}' ) )
            // InternalAedit.g:3689:1: ( '}' )
            {
            // InternalAedit.g:3689:1: ( '}' )
            // InternalAedit.g:3690:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeSchemaAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeSchemaAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSchema__Group__5__Impl"


    // $ANTLR start "rule__ChangeEnum__Group__0"
    // InternalAedit.g:3700:1: rule__ChangeEnum__Group__0 : rule__ChangeEnum__Group__0__Impl rule__ChangeEnum__Group__1 ;
    public final void rule__ChangeEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3704:1: ( rule__ChangeEnum__Group__0__Impl rule__ChangeEnum__Group__1 )
            // InternalAedit.g:3705:2: rule__ChangeEnum__Group__0__Impl rule__ChangeEnum__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ChangeEnum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeEnum__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeEnum__Group__0"


    // $ANTLR start "rule__ChangeEnum__Group__0__Impl"
    // InternalAedit.g:3712:1: rule__ChangeEnum__Group__0__Impl : ( 'change' ) ;
    public final void rule__ChangeEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3716:1: ( ( 'change' ) )
            // InternalAedit.g:3717:1: ( 'change' )
            {
            // InternalAedit.g:3717:1: ( 'change' )
            // InternalAedit.g:3718:2: 'change'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeEnumAccess().getChangeKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeEnumAccess().getChangeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeEnum__Group__0__Impl"


    // $ANTLR start "rule__ChangeEnum__Group__1"
    // InternalAedit.g:3727:1: rule__ChangeEnum__Group__1 : rule__ChangeEnum__Group__1__Impl rule__ChangeEnum__Group__2 ;
    public final void rule__ChangeEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3731:1: ( rule__ChangeEnum__Group__1__Impl rule__ChangeEnum__Group__2 )
            // InternalAedit.g:3732:2: rule__ChangeEnum__Group__1__Impl rule__ChangeEnum__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ChangeEnum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeEnum__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeEnum__Group__1"


    // $ANTLR start "rule__ChangeEnum__Group__1__Impl"
    // InternalAedit.g:3739:1: rule__ChangeEnum__Group__1__Impl : ( 'enum' ) ;
    public final void rule__ChangeEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3743:1: ( ( 'enum' ) )
            // InternalAedit.g:3744:1: ( 'enum' )
            {
            // InternalAedit.g:3744:1: ( 'enum' )
            // InternalAedit.g:3745:2: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeEnumAccess().getEnumKeyword_1()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeEnumAccess().getEnumKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeEnum__Group__1__Impl"


    // $ANTLR start "rule__ChangeEnum__Group__2"
    // InternalAedit.g:3754:1: rule__ChangeEnum__Group__2 : rule__ChangeEnum__Group__2__Impl rule__ChangeEnum__Group__3 ;
    public final void rule__ChangeEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3758:1: ( rule__ChangeEnum__Group__2__Impl rule__ChangeEnum__Group__3 )
            // InternalAedit.g:3759:2: rule__ChangeEnum__Group__2__Impl rule__ChangeEnum__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ChangeEnum__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeEnum__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeEnum__Group__2"


    // $ANTLR start "rule__ChangeEnum__Group__2__Impl"
    // InternalAedit.g:3766:1: rule__ChangeEnum__Group__2__Impl : ( ( rule__ChangeEnum__SchemaAssignment_2 ) ) ;
    public final void rule__ChangeEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3770:1: ( ( ( rule__ChangeEnum__SchemaAssignment_2 ) ) )
            // InternalAedit.g:3771:1: ( ( rule__ChangeEnum__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:3771:1: ( ( rule__ChangeEnum__SchemaAssignment_2 ) )
            // InternalAedit.g:3772:2: ( rule__ChangeEnum__SchemaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeEnumAccess().getSchemaAssignment_2()); 
            }
            // InternalAedit.g:3773:2: ( rule__ChangeEnum__SchemaAssignment_2 )
            // InternalAedit.g:3773:3: rule__ChangeEnum__SchemaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ChangeEnum__SchemaAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeEnumAccess().getSchemaAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeEnum__Group__2__Impl"


    // $ANTLR start "rule__ChangeEnum__Group__3"
    // InternalAedit.g:3781:1: rule__ChangeEnum__Group__3 : rule__ChangeEnum__Group__3__Impl rule__ChangeEnum__Group__4 ;
    public final void rule__ChangeEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3785:1: ( rule__ChangeEnum__Group__3__Impl rule__ChangeEnum__Group__4 )
            // InternalAedit.g:3786:2: rule__ChangeEnum__Group__3__Impl rule__ChangeEnum__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__ChangeEnum__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeEnum__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeEnum__Group__3"


    // $ANTLR start "rule__ChangeEnum__Group__3__Impl"
    // InternalAedit.g:3793:1: rule__ChangeEnum__Group__3__Impl : ( '{' ) ;
    public final void rule__ChangeEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3797:1: ( ( '{' ) )
            // InternalAedit.g:3798:1: ( '{' )
            {
            // InternalAedit.g:3798:1: ( '{' )
            // InternalAedit.g:3799:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeEnumAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeEnumAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeEnum__Group__3__Impl"


    // $ANTLR start "rule__ChangeEnum__Group__4"
    // InternalAedit.g:3808:1: rule__ChangeEnum__Group__4 : rule__ChangeEnum__Group__4__Impl rule__ChangeEnum__Group__5 ;
    public final void rule__ChangeEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3812:1: ( rule__ChangeEnum__Group__4__Impl rule__ChangeEnum__Group__5 )
            // InternalAedit.g:3813:2: rule__ChangeEnum__Group__4__Impl rule__ChangeEnum__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ChangeEnum__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeEnum__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeEnum__Group__4"


    // $ANTLR start "rule__ChangeEnum__Group__4__Impl"
    // InternalAedit.g:3820:1: rule__ChangeEnum__Group__4__Impl : ( ( rule__ChangeEnum__RulesAssignment_4 )* ) ;
    public final void rule__ChangeEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3824:1: ( ( ( rule__ChangeEnum__RulesAssignment_4 )* ) )
            // InternalAedit.g:3825:1: ( ( rule__ChangeEnum__RulesAssignment_4 )* )
            {
            // InternalAedit.g:3825:1: ( ( rule__ChangeEnum__RulesAssignment_4 )* )
            // InternalAedit.g:3826:2: ( rule__ChangeEnum__RulesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeEnumAccess().getRulesAssignment_4()); 
            }
            // InternalAedit.g:3827:2: ( rule__ChangeEnum__RulesAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==36||(LA25_0>=41 && LA25_0<=42)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAedit.g:3827:3: rule__ChangeEnum__RulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ChangeEnum__RulesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeEnumAccess().getRulesAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeEnum__Group__4__Impl"


    // $ANTLR start "rule__ChangeEnum__Group__5"
    // InternalAedit.g:3835:1: rule__ChangeEnum__Group__5 : rule__ChangeEnum__Group__5__Impl ;
    public final void rule__ChangeEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3839:1: ( rule__ChangeEnum__Group__5__Impl )
            // InternalAedit.g:3840:2: rule__ChangeEnum__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeEnum__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeEnum__Group__5"


    // $ANTLR start "rule__ChangeEnum__Group__5__Impl"
    // InternalAedit.g:3846:1: rule__ChangeEnum__Group__5__Impl : ( '}' ) ;
    public final void rule__ChangeEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3850:1: ( ( '}' ) )
            // InternalAedit.g:3851:1: ( '}' )
            {
            // InternalAedit.g:3851:1: ( '}' )
            // InternalAedit.g:3852:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeEnumAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeEnumAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeEnum__Group__5__Impl"


    // $ANTLR start "rule__AddRecord__Group__0"
    // InternalAedit.g:3862:1: rule__AddRecord__Group__0 : rule__AddRecord__Group__0__Impl rule__AddRecord__Group__1 ;
    public final void rule__AddRecord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3866:1: ( rule__AddRecord__Group__0__Impl rule__AddRecord__Group__1 )
            // InternalAedit.g:3867:2: rule__AddRecord__Group__0__Impl rule__AddRecord__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__AddRecord__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__0"


    // $ANTLR start "rule__AddRecord__Group__0__Impl"
    // InternalAedit.g:3874:1: rule__AddRecord__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddRecord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3878:1: ( ( 'add.at' ) )
            // InternalAedit.g:3879:1: ( 'add.at' )
            {
            // InternalAedit.g:3879:1: ( 'add.at' )
            // InternalAedit.g:3880:2: 'add.at'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getAddAtKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordAccess().getAddAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__0__Impl"


    // $ANTLR start "rule__AddRecord__Group__1"
    // InternalAedit.g:3889:1: rule__AddRecord__Group__1 : rule__AddRecord__Group__1__Impl rule__AddRecord__Group__2 ;
    public final void rule__AddRecord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3893:1: ( rule__AddRecord__Group__1__Impl rule__AddRecord__Group__2 )
            // InternalAedit.g:3894:2: rule__AddRecord__Group__1__Impl rule__AddRecord__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__AddRecord__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__1"


    // $ANTLR start "rule__AddRecord__Group__1__Impl"
    // InternalAedit.g:3901:1: rule__AddRecord__Group__1__Impl : ( '(' ) ;
    public final void rule__AddRecord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3905:1: ( ( '(' ) )
            // InternalAedit.g:3906:1: ( '(' )
            {
            // InternalAedit.g:3906:1: ( '(' )
            // InternalAedit.g:3907:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__1__Impl"


    // $ANTLR start "rule__AddRecord__Group__2"
    // InternalAedit.g:3916:1: rule__AddRecord__Group__2 : rule__AddRecord__Group__2__Impl rule__AddRecord__Group__3 ;
    public final void rule__AddRecord__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3920:1: ( rule__AddRecord__Group__2__Impl rule__AddRecord__Group__3 )
            // InternalAedit.g:3921:2: rule__AddRecord__Group__2__Impl rule__AddRecord__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__AddRecord__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__2"


    // $ANTLR start "rule__AddRecord__Group__2__Impl"
    // InternalAedit.g:3928:1: rule__AddRecord__Group__2__Impl : ( ( rule__AddRecord__IndexAssignment_2 ) ) ;
    public final void rule__AddRecord__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3932:1: ( ( ( rule__AddRecord__IndexAssignment_2 ) ) )
            // InternalAedit.g:3933:1: ( ( rule__AddRecord__IndexAssignment_2 ) )
            {
            // InternalAedit.g:3933:1: ( ( rule__AddRecord__IndexAssignment_2 ) )
            // InternalAedit.g:3934:2: ( rule__AddRecord__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getIndexAssignment_2()); 
            }
            // InternalAedit.g:3935:2: ( rule__AddRecord__IndexAssignment_2 )
            // InternalAedit.g:3935:3: rule__AddRecord__IndexAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddRecord__IndexAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordAccess().getIndexAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__2__Impl"


    // $ANTLR start "rule__AddRecord__Group__3"
    // InternalAedit.g:3943:1: rule__AddRecord__Group__3 : rule__AddRecord__Group__3__Impl rule__AddRecord__Group__4 ;
    public final void rule__AddRecord__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3947:1: ( rule__AddRecord__Group__3__Impl rule__AddRecord__Group__4 )
            // InternalAedit.g:3948:2: rule__AddRecord__Group__3__Impl rule__AddRecord__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__AddRecord__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__3"


    // $ANTLR start "rule__AddRecord__Group__3__Impl"
    // InternalAedit.g:3955:1: rule__AddRecord__Group__3__Impl : ( ')' ) ;
    public final void rule__AddRecord__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3959:1: ( ( ')' ) )
            // InternalAedit.g:3960:1: ( ')' )
            {
            // InternalAedit.g:3960:1: ( ')' )
            // InternalAedit.g:3961:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__3__Impl"


    // $ANTLR start "rule__AddRecord__Group__4"
    // InternalAedit.g:3970:1: rule__AddRecord__Group__4 : rule__AddRecord__Group__4__Impl rule__AddRecord__Group__5 ;
    public final void rule__AddRecord__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3974:1: ( rule__AddRecord__Group__4__Impl rule__AddRecord__Group__5 )
            // InternalAedit.g:3975:2: rule__AddRecord__Group__4__Impl rule__AddRecord__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__AddRecord__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__4"


    // $ANTLR start "rule__AddRecord__Group__4__Impl"
    // InternalAedit.g:3982:1: rule__AddRecord__Group__4__Impl : ( 'record' ) ;
    public final void rule__AddRecord__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3986:1: ( ( 'record' ) )
            // InternalAedit.g:3987:1: ( 'record' )
            {
            // InternalAedit.g:3987:1: ( 'record' )
            // InternalAedit.g:3988:2: 'record'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getRecordKeyword_4()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordAccess().getRecordKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__4__Impl"


    // $ANTLR start "rule__AddRecord__Group__5"
    // InternalAedit.g:3997:1: rule__AddRecord__Group__5 : rule__AddRecord__Group__5__Impl rule__AddRecord__Group__6 ;
    public final void rule__AddRecord__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4001:1: ( rule__AddRecord__Group__5__Impl rule__AddRecord__Group__6 )
            // InternalAedit.g:4002:2: rule__AddRecord__Group__5__Impl rule__AddRecord__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__AddRecord__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__5"


    // $ANTLR start "rule__AddRecord__Group__5__Impl"
    // InternalAedit.g:4009:1: rule__AddRecord__Group__5__Impl : ( ( rule__AddRecord__NamespaceAssignment_5 ) ) ;
    public final void rule__AddRecord__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4013:1: ( ( ( rule__AddRecord__NamespaceAssignment_5 ) ) )
            // InternalAedit.g:4014:1: ( ( rule__AddRecord__NamespaceAssignment_5 ) )
            {
            // InternalAedit.g:4014:1: ( ( rule__AddRecord__NamespaceAssignment_5 ) )
            // InternalAedit.g:4015:2: ( rule__AddRecord__NamespaceAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getNamespaceAssignment_5()); 
            }
            // InternalAedit.g:4016:2: ( rule__AddRecord__NamespaceAssignment_5 )
            // InternalAedit.g:4016:3: rule__AddRecord__NamespaceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AddRecord__NamespaceAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordAccess().getNamespaceAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__5__Impl"


    // $ANTLR start "rule__AddRecord__Group__6"
    // InternalAedit.g:4024:1: rule__AddRecord__Group__6 : rule__AddRecord__Group__6__Impl rule__AddRecord__Group__7 ;
    public final void rule__AddRecord__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4028:1: ( rule__AddRecord__Group__6__Impl rule__AddRecord__Group__7 )
            // InternalAedit.g:4029:2: rule__AddRecord__Group__6__Impl rule__AddRecord__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__AddRecord__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__6"


    // $ANTLR start "rule__AddRecord__Group__6__Impl"
    // InternalAedit.g:4036:1: rule__AddRecord__Group__6__Impl : ( '.' ) ;
    public final void rule__AddRecord__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4040:1: ( ( '.' ) )
            // InternalAedit.g:4041:1: ( '.' )
            {
            // InternalAedit.g:4041:1: ( '.' )
            // InternalAedit.g:4042:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getFullStopKeyword_6()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordAccess().getFullStopKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__6__Impl"


    // $ANTLR start "rule__AddRecord__Group__7"
    // InternalAedit.g:4051:1: rule__AddRecord__Group__7 : rule__AddRecord__Group__7__Impl rule__AddRecord__Group__8 ;
    public final void rule__AddRecord__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4055:1: ( rule__AddRecord__Group__7__Impl rule__AddRecord__Group__8 )
            // InternalAedit.g:4056:2: rule__AddRecord__Group__7__Impl rule__AddRecord__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__AddRecord__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__7"


    // $ANTLR start "rule__AddRecord__Group__7__Impl"
    // InternalAedit.g:4063:1: rule__AddRecord__Group__7__Impl : ( ( rule__AddRecord__RecordNameAssignment_7 ) ) ;
    public final void rule__AddRecord__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4067:1: ( ( ( rule__AddRecord__RecordNameAssignment_7 ) ) )
            // InternalAedit.g:4068:1: ( ( rule__AddRecord__RecordNameAssignment_7 ) )
            {
            // InternalAedit.g:4068:1: ( ( rule__AddRecord__RecordNameAssignment_7 ) )
            // InternalAedit.g:4069:2: ( rule__AddRecord__RecordNameAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getRecordNameAssignment_7()); 
            }
            // InternalAedit.g:4070:2: ( rule__AddRecord__RecordNameAssignment_7 )
            // InternalAedit.g:4070:3: rule__AddRecord__RecordNameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__AddRecord__RecordNameAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordAccess().getRecordNameAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__7__Impl"


    // $ANTLR start "rule__AddRecord__Group__8"
    // InternalAedit.g:4078:1: rule__AddRecord__Group__8 : rule__AddRecord__Group__8__Impl rule__AddRecord__Group__9 ;
    public final void rule__AddRecord__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4082:1: ( rule__AddRecord__Group__8__Impl rule__AddRecord__Group__9 )
            // InternalAedit.g:4083:2: rule__AddRecord__Group__8__Impl rule__AddRecord__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__AddRecord__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__8"


    // $ANTLR start "rule__AddRecord__Group__8__Impl"
    // InternalAedit.g:4090:1: rule__AddRecord__Group__8__Impl : ( '{' ) ;
    public final void rule__AddRecord__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4094:1: ( ( '{' ) )
            // InternalAedit.g:4095:1: ( '{' )
            {
            // InternalAedit.g:4095:1: ( '{' )
            // InternalAedit.g:4096:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getLeftCurlyBracketKeyword_8()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordAccess().getLeftCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__8__Impl"


    // $ANTLR start "rule__AddRecord__Group__9"
    // InternalAedit.g:4105:1: rule__AddRecord__Group__9 : rule__AddRecord__Group__9__Impl rule__AddRecord__Group__10 ;
    public final void rule__AddRecord__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4109:1: ( rule__AddRecord__Group__9__Impl rule__AddRecord__Group__10 )
            // InternalAedit.g:4110:2: rule__AddRecord__Group__9__Impl rule__AddRecord__Group__10
            {
            pushFollow(FOLLOW_30);
            rule__AddRecord__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__9"


    // $ANTLR start "rule__AddRecord__Group__9__Impl"
    // InternalAedit.g:4117:1: rule__AddRecord__Group__9__Impl : ( ( rule__AddRecord__FieldsAssignment_9 )* ) ;
    public final void rule__AddRecord__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4121:1: ( ( ( rule__AddRecord__FieldsAssignment_9 )* ) )
            // InternalAedit.g:4122:1: ( ( rule__AddRecord__FieldsAssignment_9 )* )
            {
            // InternalAedit.g:4122:1: ( ( rule__AddRecord__FieldsAssignment_9 )* )
            // InternalAedit.g:4123:2: ( rule__AddRecord__FieldsAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getFieldsAssignment_9()); 
            }
            // InternalAedit.g:4124:2: ( rule__AddRecord__FieldsAssignment_9 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||(LA26_0>=16 && LA26_0<=21)||LA26_0==49||LA26_0==55) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAedit.g:4124:3: rule__AddRecord__FieldsAssignment_9
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__AddRecord__FieldsAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordAccess().getFieldsAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__9__Impl"


    // $ANTLR start "rule__AddRecord__Group__10"
    // InternalAedit.g:4132:1: rule__AddRecord__Group__10 : rule__AddRecord__Group__10__Impl ;
    public final void rule__AddRecord__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4136:1: ( rule__AddRecord__Group__10__Impl )
            // InternalAedit.g:4137:2: rule__AddRecord__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__10"


    // $ANTLR start "rule__AddRecord__Group__10__Impl"
    // InternalAedit.g:4143:1: rule__AddRecord__Group__10__Impl : ( '}' ) ;
    public final void rule__AddRecord__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4147:1: ( ( '}' ) )
            // InternalAedit.g:4148:1: ( '}' )
            {
            // InternalAedit.g:4148:1: ( '}' )
            // InternalAedit.g:4149:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordAccess().getRightCurlyBracketKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__Group__10__Impl"


    // $ANTLR start "rule__AddError__Group__0"
    // InternalAedit.g:4159:1: rule__AddError__Group__0 : rule__AddError__Group__0__Impl rule__AddError__Group__1 ;
    public final void rule__AddError__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4163:1: ( rule__AddError__Group__0__Impl rule__AddError__Group__1 )
            // InternalAedit.g:4164:2: rule__AddError__Group__0__Impl rule__AddError__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__AddError__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddError__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__0"


    // $ANTLR start "rule__AddError__Group__0__Impl"
    // InternalAedit.g:4171:1: rule__AddError__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddError__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4175:1: ( ( 'add.at' ) )
            // InternalAedit.g:4176:1: ( 'add.at' )
            {
            // InternalAedit.g:4176:1: ( 'add.at' )
            // InternalAedit.g:4177:2: 'add.at'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getAddAtKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorAccess().getAddAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__0__Impl"


    // $ANTLR start "rule__AddError__Group__1"
    // InternalAedit.g:4186:1: rule__AddError__Group__1 : rule__AddError__Group__1__Impl rule__AddError__Group__2 ;
    public final void rule__AddError__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4190:1: ( rule__AddError__Group__1__Impl rule__AddError__Group__2 )
            // InternalAedit.g:4191:2: rule__AddError__Group__1__Impl rule__AddError__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__AddError__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddError__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__1"


    // $ANTLR start "rule__AddError__Group__1__Impl"
    // InternalAedit.g:4198:1: rule__AddError__Group__1__Impl : ( '(' ) ;
    public final void rule__AddError__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4202:1: ( ( '(' ) )
            // InternalAedit.g:4203:1: ( '(' )
            {
            // InternalAedit.g:4203:1: ( '(' )
            // InternalAedit.g:4204:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__1__Impl"


    // $ANTLR start "rule__AddError__Group__2"
    // InternalAedit.g:4213:1: rule__AddError__Group__2 : rule__AddError__Group__2__Impl rule__AddError__Group__3 ;
    public final void rule__AddError__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4217:1: ( rule__AddError__Group__2__Impl rule__AddError__Group__3 )
            // InternalAedit.g:4218:2: rule__AddError__Group__2__Impl rule__AddError__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__AddError__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddError__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__2"


    // $ANTLR start "rule__AddError__Group__2__Impl"
    // InternalAedit.g:4225:1: rule__AddError__Group__2__Impl : ( ( rule__AddError__IndexAssignment_2 ) ) ;
    public final void rule__AddError__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4229:1: ( ( ( rule__AddError__IndexAssignment_2 ) ) )
            // InternalAedit.g:4230:1: ( ( rule__AddError__IndexAssignment_2 ) )
            {
            // InternalAedit.g:4230:1: ( ( rule__AddError__IndexAssignment_2 ) )
            // InternalAedit.g:4231:2: ( rule__AddError__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getIndexAssignment_2()); 
            }
            // InternalAedit.g:4232:2: ( rule__AddError__IndexAssignment_2 )
            // InternalAedit.g:4232:3: rule__AddError__IndexAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddError__IndexAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorAccess().getIndexAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__2__Impl"


    // $ANTLR start "rule__AddError__Group__3"
    // InternalAedit.g:4240:1: rule__AddError__Group__3 : rule__AddError__Group__3__Impl rule__AddError__Group__4 ;
    public final void rule__AddError__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4244:1: ( rule__AddError__Group__3__Impl rule__AddError__Group__4 )
            // InternalAedit.g:4245:2: rule__AddError__Group__3__Impl rule__AddError__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__AddError__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddError__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__3"


    // $ANTLR start "rule__AddError__Group__3__Impl"
    // InternalAedit.g:4252:1: rule__AddError__Group__3__Impl : ( ')' ) ;
    public final void rule__AddError__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4256:1: ( ( ')' ) )
            // InternalAedit.g:4257:1: ( ')' )
            {
            // InternalAedit.g:4257:1: ( ')' )
            // InternalAedit.g:4258:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__3__Impl"


    // $ANTLR start "rule__AddError__Group__4"
    // InternalAedit.g:4267:1: rule__AddError__Group__4 : rule__AddError__Group__4__Impl rule__AddError__Group__5 ;
    public final void rule__AddError__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4271:1: ( rule__AddError__Group__4__Impl rule__AddError__Group__5 )
            // InternalAedit.g:4272:2: rule__AddError__Group__4__Impl rule__AddError__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__AddError__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddError__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__4"


    // $ANTLR start "rule__AddError__Group__4__Impl"
    // InternalAedit.g:4279:1: rule__AddError__Group__4__Impl : ( 'error' ) ;
    public final void rule__AddError__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4283:1: ( ( 'error' ) )
            // InternalAedit.g:4284:1: ( 'error' )
            {
            // InternalAedit.g:4284:1: ( 'error' )
            // InternalAedit.g:4285:2: 'error'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getErrorKeyword_4()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorAccess().getErrorKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__4__Impl"


    // $ANTLR start "rule__AddError__Group__5"
    // InternalAedit.g:4294:1: rule__AddError__Group__5 : rule__AddError__Group__5__Impl rule__AddError__Group__6 ;
    public final void rule__AddError__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4298:1: ( rule__AddError__Group__5__Impl rule__AddError__Group__6 )
            // InternalAedit.g:4299:2: rule__AddError__Group__5__Impl rule__AddError__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__AddError__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddError__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__5"


    // $ANTLR start "rule__AddError__Group__5__Impl"
    // InternalAedit.g:4306:1: rule__AddError__Group__5__Impl : ( ( rule__AddError__NamespaceAssignment_5 ) ) ;
    public final void rule__AddError__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4310:1: ( ( ( rule__AddError__NamespaceAssignment_5 ) ) )
            // InternalAedit.g:4311:1: ( ( rule__AddError__NamespaceAssignment_5 ) )
            {
            // InternalAedit.g:4311:1: ( ( rule__AddError__NamespaceAssignment_5 ) )
            // InternalAedit.g:4312:2: ( rule__AddError__NamespaceAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getNamespaceAssignment_5()); 
            }
            // InternalAedit.g:4313:2: ( rule__AddError__NamespaceAssignment_5 )
            // InternalAedit.g:4313:3: rule__AddError__NamespaceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AddError__NamespaceAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorAccess().getNamespaceAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__5__Impl"


    // $ANTLR start "rule__AddError__Group__6"
    // InternalAedit.g:4321:1: rule__AddError__Group__6 : rule__AddError__Group__6__Impl rule__AddError__Group__7 ;
    public final void rule__AddError__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4325:1: ( rule__AddError__Group__6__Impl rule__AddError__Group__7 )
            // InternalAedit.g:4326:2: rule__AddError__Group__6__Impl rule__AddError__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__AddError__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddError__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__6"


    // $ANTLR start "rule__AddError__Group__6__Impl"
    // InternalAedit.g:4333:1: rule__AddError__Group__6__Impl : ( '.' ) ;
    public final void rule__AddError__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4337:1: ( ( '.' ) )
            // InternalAedit.g:4338:1: ( '.' )
            {
            // InternalAedit.g:4338:1: ( '.' )
            // InternalAedit.g:4339:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getFullStopKeyword_6()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorAccess().getFullStopKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__6__Impl"


    // $ANTLR start "rule__AddError__Group__7"
    // InternalAedit.g:4348:1: rule__AddError__Group__7 : rule__AddError__Group__7__Impl rule__AddError__Group__8 ;
    public final void rule__AddError__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4352:1: ( rule__AddError__Group__7__Impl rule__AddError__Group__8 )
            // InternalAedit.g:4353:2: rule__AddError__Group__7__Impl rule__AddError__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__AddError__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddError__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__7"


    // $ANTLR start "rule__AddError__Group__7__Impl"
    // InternalAedit.g:4360:1: rule__AddError__Group__7__Impl : ( ( rule__AddError__ErrorNameAssignment_7 ) ) ;
    public final void rule__AddError__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4364:1: ( ( ( rule__AddError__ErrorNameAssignment_7 ) ) )
            // InternalAedit.g:4365:1: ( ( rule__AddError__ErrorNameAssignment_7 ) )
            {
            // InternalAedit.g:4365:1: ( ( rule__AddError__ErrorNameAssignment_7 ) )
            // InternalAedit.g:4366:2: ( rule__AddError__ErrorNameAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getErrorNameAssignment_7()); 
            }
            // InternalAedit.g:4367:2: ( rule__AddError__ErrorNameAssignment_7 )
            // InternalAedit.g:4367:3: rule__AddError__ErrorNameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__AddError__ErrorNameAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorAccess().getErrorNameAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__7__Impl"


    // $ANTLR start "rule__AddError__Group__8"
    // InternalAedit.g:4375:1: rule__AddError__Group__8 : rule__AddError__Group__8__Impl rule__AddError__Group__9 ;
    public final void rule__AddError__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4379:1: ( rule__AddError__Group__8__Impl rule__AddError__Group__9 )
            // InternalAedit.g:4380:2: rule__AddError__Group__8__Impl rule__AddError__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__AddError__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddError__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__8"


    // $ANTLR start "rule__AddError__Group__8__Impl"
    // InternalAedit.g:4387:1: rule__AddError__Group__8__Impl : ( '{' ) ;
    public final void rule__AddError__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4391:1: ( ( '{' ) )
            // InternalAedit.g:4392:1: ( '{' )
            {
            // InternalAedit.g:4392:1: ( '{' )
            // InternalAedit.g:4393:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getLeftCurlyBracketKeyword_8()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorAccess().getLeftCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__8__Impl"


    // $ANTLR start "rule__AddError__Group__9"
    // InternalAedit.g:4402:1: rule__AddError__Group__9 : rule__AddError__Group__9__Impl rule__AddError__Group__10 ;
    public final void rule__AddError__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4406:1: ( rule__AddError__Group__9__Impl rule__AddError__Group__10 )
            // InternalAedit.g:4407:2: rule__AddError__Group__9__Impl rule__AddError__Group__10
            {
            pushFollow(FOLLOW_30);
            rule__AddError__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddError__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__9"


    // $ANTLR start "rule__AddError__Group__9__Impl"
    // InternalAedit.g:4414:1: rule__AddError__Group__9__Impl : ( ( rule__AddError__FieldsAssignment_9 )* ) ;
    public final void rule__AddError__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4418:1: ( ( ( rule__AddError__FieldsAssignment_9 )* ) )
            // InternalAedit.g:4419:1: ( ( rule__AddError__FieldsAssignment_9 )* )
            {
            // InternalAedit.g:4419:1: ( ( rule__AddError__FieldsAssignment_9 )* )
            // InternalAedit.g:4420:2: ( rule__AddError__FieldsAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getFieldsAssignment_9()); 
            }
            // InternalAedit.g:4421:2: ( rule__AddError__FieldsAssignment_9 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||(LA27_0>=16 && LA27_0<=21)||LA27_0==49||LA27_0==55) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAedit.g:4421:3: rule__AddError__FieldsAssignment_9
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__AddError__FieldsAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorAccess().getFieldsAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__9__Impl"


    // $ANTLR start "rule__AddError__Group__10"
    // InternalAedit.g:4429:1: rule__AddError__Group__10 : rule__AddError__Group__10__Impl ;
    public final void rule__AddError__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4433:1: ( rule__AddError__Group__10__Impl )
            // InternalAedit.g:4434:2: rule__AddError__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddError__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__10"


    // $ANTLR start "rule__AddError__Group__10__Impl"
    // InternalAedit.g:4440:1: rule__AddError__Group__10__Impl : ( '}' ) ;
    public final void rule__AddError__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4444:1: ( ( '}' ) )
            // InternalAedit.g:4445:1: ( '}' )
            {
            // InternalAedit.g:4445:1: ( '}' )
            // InternalAedit.g:4446:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorAccess().getRightCurlyBracketKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__Group__10__Impl"


    // $ANTLR start "rule__AddEnumeration__Group__0"
    // InternalAedit.g:4456:1: rule__AddEnumeration__Group__0 : rule__AddEnumeration__Group__0__Impl rule__AddEnumeration__Group__1 ;
    public final void rule__AddEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4460:1: ( rule__AddEnumeration__Group__0__Impl rule__AddEnumeration__Group__1 )
            // InternalAedit.g:4461:2: rule__AddEnumeration__Group__0__Impl rule__AddEnumeration__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__AddEnumeration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__0"


    // $ANTLR start "rule__AddEnumeration__Group__0__Impl"
    // InternalAedit.g:4468:1: rule__AddEnumeration__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4472:1: ( ( 'add.at' ) )
            // InternalAedit.g:4473:1: ( 'add.at' )
            {
            // InternalAedit.g:4473:1: ( 'add.at' )
            // InternalAedit.g:4474:2: 'add.at'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getAddAtKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getAddAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__0__Impl"


    // $ANTLR start "rule__AddEnumeration__Group__1"
    // InternalAedit.g:4483:1: rule__AddEnumeration__Group__1 : rule__AddEnumeration__Group__1__Impl rule__AddEnumeration__Group__2 ;
    public final void rule__AddEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4487:1: ( rule__AddEnumeration__Group__1__Impl rule__AddEnumeration__Group__2 )
            // InternalAedit.g:4488:2: rule__AddEnumeration__Group__1__Impl rule__AddEnumeration__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__AddEnumeration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__1"


    // $ANTLR start "rule__AddEnumeration__Group__1__Impl"
    // InternalAedit.g:4495:1: rule__AddEnumeration__Group__1__Impl : ( '(' ) ;
    public final void rule__AddEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4499:1: ( ( '(' ) )
            // InternalAedit.g:4500:1: ( '(' )
            {
            // InternalAedit.g:4500:1: ( '(' )
            // InternalAedit.g:4501:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__1__Impl"


    // $ANTLR start "rule__AddEnumeration__Group__2"
    // InternalAedit.g:4510:1: rule__AddEnumeration__Group__2 : rule__AddEnumeration__Group__2__Impl rule__AddEnumeration__Group__3 ;
    public final void rule__AddEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4514:1: ( rule__AddEnumeration__Group__2__Impl rule__AddEnumeration__Group__3 )
            // InternalAedit.g:4515:2: rule__AddEnumeration__Group__2__Impl rule__AddEnumeration__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__AddEnumeration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__2"


    // $ANTLR start "rule__AddEnumeration__Group__2__Impl"
    // InternalAedit.g:4522:1: rule__AddEnumeration__Group__2__Impl : ( ( rule__AddEnumeration__IndexAssignment_2 ) ) ;
    public final void rule__AddEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4526:1: ( ( ( rule__AddEnumeration__IndexAssignment_2 ) ) )
            // InternalAedit.g:4527:1: ( ( rule__AddEnumeration__IndexAssignment_2 ) )
            {
            // InternalAedit.g:4527:1: ( ( rule__AddEnumeration__IndexAssignment_2 ) )
            // InternalAedit.g:4528:2: ( rule__AddEnumeration__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getIndexAssignment_2()); 
            }
            // InternalAedit.g:4529:2: ( rule__AddEnumeration__IndexAssignment_2 )
            // InternalAedit.g:4529:3: rule__AddEnumeration__IndexAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__IndexAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getIndexAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__2__Impl"


    // $ANTLR start "rule__AddEnumeration__Group__3"
    // InternalAedit.g:4537:1: rule__AddEnumeration__Group__3 : rule__AddEnumeration__Group__3__Impl rule__AddEnumeration__Group__4 ;
    public final void rule__AddEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4541:1: ( rule__AddEnumeration__Group__3__Impl rule__AddEnumeration__Group__4 )
            // InternalAedit.g:4542:2: rule__AddEnumeration__Group__3__Impl rule__AddEnumeration__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__AddEnumeration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__3"


    // $ANTLR start "rule__AddEnumeration__Group__3__Impl"
    // InternalAedit.g:4549:1: rule__AddEnumeration__Group__3__Impl : ( ')' ) ;
    public final void rule__AddEnumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4553:1: ( ( ')' ) )
            // InternalAedit.g:4554:1: ( ')' )
            {
            // InternalAedit.g:4554:1: ( ')' )
            // InternalAedit.g:4555:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__3__Impl"


    // $ANTLR start "rule__AddEnumeration__Group__4"
    // InternalAedit.g:4564:1: rule__AddEnumeration__Group__4 : rule__AddEnumeration__Group__4__Impl rule__AddEnumeration__Group__5 ;
    public final void rule__AddEnumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4568:1: ( rule__AddEnumeration__Group__4__Impl rule__AddEnumeration__Group__5 )
            // InternalAedit.g:4569:2: rule__AddEnumeration__Group__4__Impl rule__AddEnumeration__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__AddEnumeration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__4"


    // $ANTLR start "rule__AddEnumeration__Group__4__Impl"
    // InternalAedit.g:4576:1: rule__AddEnumeration__Group__4__Impl : ( 'enum' ) ;
    public final void rule__AddEnumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4580:1: ( ( 'enum' ) )
            // InternalAedit.g:4581:1: ( 'enum' )
            {
            // InternalAedit.g:4581:1: ( 'enum' )
            // InternalAedit.g:4582:2: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getEnumKeyword_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getEnumKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__4__Impl"


    // $ANTLR start "rule__AddEnumeration__Group__5"
    // InternalAedit.g:4591:1: rule__AddEnumeration__Group__5 : rule__AddEnumeration__Group__5__Impl rule__AddEnumeration__Group__6 ;
    public final void rule__AddEnumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4595:1: ( rule__AddEnumeration__Group__5__Impl rule__AddEnumeration__Group__6 )
            // InternalAedit.g:4596:2: rule__AddEnumeration__Group__5__Impl rule__AddEnumeration__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__AddEnumeration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__5"


    // $ANTLR start "rule__AddEnumeration__Group__5__Impl"
    // InternalAedit.g:4603:1: rule__AddEnumeration__Group__5__Impl : ( ( rule__AddEnumeration__NamespaceAssignment_5 ) ) ;
    public final void rule__AddEnumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4607:1: ( ( ( rule__AddEnumeration__NamespaceAssignment_5 ) ) )
            // InternalAedit.g:4608:1: ( ( rule__AddEnumeration__NamespaceAssignment_5 ) )
            {
            // InternalAedit.g:4608:1: ( ( rule__AddEnumeration__NamespaceAssignment_5 ) )
            // InternalAedit.g:4609:2: ( rule__AddEnumeration__NamespaceAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getNamespaceAssignment_5()); 
            }
            // InternalAedit.g:4610:2: ( rule__AddEnumeration__NamespaceAssignment_5 )
            // InternalAedit.g:4610:3: rule__AddEnumeration__NamespaceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__NamespaceAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getNamespaceAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__5__Impl"


    // $ANTLR start "rule__AddEnumeration__Group__6"
    // InternalAedit.g:4618:1: rule__AddEnumeration__Group__6 : rule__AddEnumeration__Group__6__Impl rule__AddEnumeration__Group__7 ;
    public final void rule__AddEnumeration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4622:1: ( rule__AddEnumeration__Group__6__Impl rule__AddEnumeration__Group__7 )
            // InternalAedit.g:4623:2: rule__AddEnumeration__Group__6__Impl rule__AddEnumeration__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__AddEnumeration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__6"


    // $ANTLR start "rule__AddEnumeration__Group__6__Impl"
    // InternalAedit.g:4630:1: rule__AddEnumeration__Group__6__Impl : ( '.' ) ;
    public final void rule__AddEnumeration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4634:1: ( ( '.' ) )
            // InternalAedit.g:4635:1: ( '.' )
            {
            // InternalAedit.g:4635:1: ( '.' )
            // InternalAedit.g:4636:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getFullStopKeyword_6()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getFullStopKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__6__Impl"


    // $ANTLR start "rule__AddEnumeration__Group__7"
    // InternalAedit.g:4645:1: rule__AddEnumeration__Group__7 : rule__AddEnumeration__Group__7__Impl rule__AddEnumeration__Group__8 ;
    public final void rule__AddEnumeration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4649:1: ( rule__AddEnumeration__Group__7__Impl rule__AddEnumeration__Group__8 )
            // InternalAedit.g:4650:2: rule__AddEnumeration__Group__7__Impl rule__AddEnumeration__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__AddEnumeration__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__7"


    // $ANTLR start "rule__AddEnumeration__Group__7__Impl"
    // InternalAedit.g:4657:1: rule__AddEnumeration__Group__7__Impl : ( ( rule__AddEnumeration__EnumNameAssignment_7 ) ) ;
    public final void rule__AddEnumeration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4661:1: ( ( ( rule__AddEnumeration__EnumNameAssignment_7 ) ) )
            // InternalAedit.g:4662:1: ( ( rule__AddEnumeration__EnumNameAssignment_7 ) )
            {
            // InternalAedit.g:4662:1: ( ( rule__AddEnumeration__EnumNameAssignment_7 ) )
            // InternalAedit.g:4663:2: ( rule__AddEnumeration__EnumNameAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getEnumNameAssignment_7()); 
            }
            // InternalAedit.g:4664:2: ( rule__AddEnumeration__EnumNameAssignment_7 )
            // InternalAedit.g:4664:3: rule__AddEnumeration__EnumNameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__EnumNameAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getEnumNameAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__7__Impl"


    // $ANTLR start "rule__AddEnumeration__Group__8"
    // InternalAedit.g:4672:1: rule__AddEnumeration__Group__8 : rule__AddEnumeration__Group__8__Impl rule__AddEnumeration__Group__9 ;
    public final void rule__AddEnumeration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4676:1: ( rule__AddEnumeration__Group__8__Impl rule__AddEnumeration__Group__9 )
            // InternalAedit.g:4677:2: rule__AddEnumeration__Group__8__Impl rule__AddEnumeration__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__AddEnumeration__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__8"


    // $ANTLR start "rule__AddEnumeration__Group__8__Impl"
    // InternalAedit.g:4684:1: rule__AddEnumeration__Group__8__Impl : ( '{' ) ;
    public final void rule__AddEnumeration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4688:1: ( ( '{' ) )
            // InternalAedit.g:4689:1: ( '{' )
            {
            // InternalAedit.g:4689:1: ( '{' )
            // InternalAedit.g:4690:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getLeftCurlyBracketKeyword_8()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getLeftCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__8__Impl"


    // $ANTLR start "rule__AddEnumeration__Group__9"
    // InternalAedit.g:4699:1: rule__AddEnumeration__Group__9 : rule__AddEnumeration__Group__9__Impl rule__AddEnumeration__Group__10 ;
    public final void rule__AddEnumeration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4703:1: ( rule__AddEnumeration__Group__9__Impl rule__AddEnumeration__Group__10 )
            // InternalAedit.g:4704:2: rule__AddEnumeration__Group__9__Impl rule__AddEnumeration__Group__10
            {
            pushFollow(FOLLOW_33);
            rule__AddEnumeration__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__9"


    // $ANTLR start "rule__AddEnumeration__Group__9__Impl"
    // InternalAedit.g:4711:1: rule__AddEnumeration__Group__9__Impl : ( ( rule__AddEnumeration__SymbolsAssignment_9 ) ) ;
    public final void rule__AddEnumeration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4715:1: ( ( ( rule__AddEnumeration__SymbolsAssignment_9 ) ) )
            // InternalAedit.g:4716:1: ( ( rule__AddEnumeration__SymbolsAssignment_9 ) )
            {
            // InternalAedit.g:4716:1: ( ( rule__AddEnumeration__SymbolsAssignment_9 ) )
            // InternalAedit.g:4717:2: ( rule__AddEnumeration__SymbolsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getSymbolsAssignment_9()); 
            }
            // InternalAedit.g:4718:2: ( rule__AddEnumeration__SymbolsAssignment_9 )
            // InternalAedit.g:4718:3: rule__AddEnumeration__SymbolsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__SymbolsAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getSymbolsAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__9__Impl"


    // $ANTLR start "rule__AddEnumeration__Group__10"
    // InternalAedit.g:4726:1: rule__AddEnumeration__Group__10 : rule__AddEnumeration__Group__10__Impl rule__AddEnumeration__Group__11 ;
    public final void rule__AddEnumeration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4730:1: ( rule__AddEnumeration__Group__10__Impl rule__AddEnumeration__Group__11 )
            // InternalAedit.g:4731:2: rule__AddEnumeration__Group__10__Impl rule__AddEnumeration__Group__11
            {
            pushFollow(FOLLOW_33);
            rule__AddEnumeration__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__10"


    // $ANTLR start "rule__AddEnumeration__Group__10__Impl"
    // InternalAedit.g:4738:1: rule__AddEnumeration__Group__10__Impl : ( ( rule__AddEnumeration__Group_10__0 )* ) ;
    public final void rule__AddEnumeration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4742:1: ( ( ( rule__AddEnumeration__Group_10__0 )* ) )
            // InternalAedit.g:4743:1: ( ( rule__AddEnumeration__Group_10__0 )* )
            {
            // InternalAedit.g:4743:1: ( ( rule__AddEnumeration__Group_10__0 )* )
            // InternalAedit.g:4744:2: ( rule__AddEnumeration__Group_10__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getGroup_10()); 
            }
            // InternalAedit.g:4745:2: ( rule__AddEnumeration__Group_10__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==40) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAedit.g:4745:3: rule__AddEnumeration__Group_10__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__AddEnumeration__Group_10__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__10__Impl"


    // $ANTLR start "rule__AddEnumeration__Group__11"
    // InternalAedit.g:4753:1: rule__AddEnumeration__Group__11 : rule__AddEnumeration__Group__11__Impl ;
    public final void rule__AddEnumeration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4757:1: ( rule__AddEnumeration__Group__11__Impl )
            // InternalAedit.g:4758:2: rule__AddEnumeration__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__11"


    // $ANTLR start "rule__AddEnumeration__Group__11__Impl"
    // InternalAedit.g:4764:1: rule__AddEnumeration__Group__11__Impl : ( '}' ) ;
    public final void rule__AddEnumeration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4768:1: ( ( '}' ) )
            // InternalAedit.g:4769:1: ( '}' )
            {
            // InternalAedit.g:4769:1: ( '}' )
            // InternalAedit.g:4770:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getRightCurlyBracketKeyword_11()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getRightCurlyBracketKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group__11__Impl"


    // $ANTLR start "rule__AddEnumeration__Group_10__0"
    // InternalAedit.g:4780:1: rule__AddEnumeration__Group_10__0 : rule__AddEnumeration__Group_10__0__Impl rule__AddEnumeration__Group_10__1 ;
    public final void rule__AddEnumeration__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4784:1: ( rule__AddEnumeration__Group_10__0__Impl rule__AddEnumeration__Group_10__1 )
            // InternalAedit.g:4785:2: rule__AddEnumeration__Group_10__0__Impl rule__AddEnumeration__Group_10__1
            {
            pushFollow(FOLLOW_8);
            rule__AddEnumeration__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group_10__0"


    // $ANTLR start "rule__AddEnumeration__Group_10__0__Impl"
    // InternalAedit.g:4792:1: rule__AddEnumeration__Group_10__0__Impl : ( ',' ) ;
    public final void rule__AddEnumeration__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4796:1: ( ( ',' ) )
            // InternalAedit.g:4797:1: ( ',' )
            {
            // InternalAedit.g:4797:1: ( ',' )
            // InternalAedit.g:4798:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getCommaKeyword_10_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getCommaKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group_10__0__Impl"


    // $ANTLR start "rule__AddEnumeration__Group_10__1"
    // InternalAedit.g:4807:1: rule__AddEnumeration__Group_10__1 : rule__AddEnumeration__Group_10__1__Impl ;
    public final void rule__AddEnumeration__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4811:1: ( rule__AddEnumeration__Group_10__1__Impl )
            // InternalAedit.g:4812:2: rule__AddEnumeration__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group_10__1"


    // $ANTLR start "rule__AddEnumeration__Group_10__1__Impl"
    // InternalAedit.g:4818:1: rule__AddEnumeration__Group_10__1__Impl : ( ( rule__AddEnumeration__SymbolsAssignment_10_1 ) ) ;
    public final void rule__AddEnumeration__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4822:1: ( ( ( rule__AddEnumeration__SymbolsAssignment_10_1 ) ) )
            // InternalAedit.g:4823:1: ( ( rule__AddEnumeration__SymbolsAssignment_10_1 ) )
            {
            // InternalAedit.g:4823:1: ( ( rule__AddEnumeration__SymbolsAssignment_10_1 ) )
            // InternalAedit.g:4824:2: ( rule__AddEnumeration__SymbolsAssignment_10_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getSymbolsAssignment_10_1()); 
            }
            // InternalAedit.g:4825:2: ( rule__AddEnumeration__SymbolsAssignment_10_1 )
            // InternalAedit.g:4825:3: rule__AddEnumeration__SymbolsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__SymbolsAssignment_10_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getSymbolsAssignment_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__Group_10__1__Impl"


    // $ANTLR start "rule__AddVariable__Group__0"
    // InternalAedit.g:4834:1: rule__AddVariable__Group__0 : rule__AddVariable__Group__0__Impl rule__AddVariable__Group__1 ;
    public final void rule__AddVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4838:1: ( rule__AddVariable__Group__0__Impl rule__AddVariable__Group__1 )
            // InternalAedit.g:4839:2: rule__AddVariable__Group__0__Impl rule__AddVariable__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__AddVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddVariable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddVariable__Group__0"


    // $ANTLR start "rule__AddVariable__Group__0__Impl"
    // InternalAedit.g:4846:1: rule__AddVariable__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4850:1: ( ( 'add.at' ) )
            // InternalAedit.g:4851:1: ( 'add.at' )
            {
            // InternalAedit.g:4851:1: ( 'add.at' )
            // InternalAedit.g:4852:2: 'add.at'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddVariableAccess().getAddAtKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddVariableAccess().getAddAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddVariable__Group__0__Impl"


    // $ANTLR start "rule__AddVariable__Group__1"
    // InternalAedit.g:4861:1: rule__AddVariable__Group__1 : rule__AddVariable__Group__1__Impl rule__AddVariable__Group__2 ;
    public final void rule__AddVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4865:1: ( rule__AddVariable__Group__1__Impl rule__AddVariable__Group__2 )
            // InternalAedit.g:4866:2: rule__AddVariable__Group__1__Impl rule__AddVariable__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__AddVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddVariable__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddVariable__Group__1"


    // $ANTLR start "rule__AddVariable__Group__1__Impl"
    // InternalAedit.g:4873:1: rule__AddVariable__Group__1__Impl : ( '(' ) ;
    public final void rule__AddVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4877:1: ( ( '(' ) )
            // InternalAedit.g:4878:1: ( '(' )
            {
            // InternalAedit.g:4878:1: ( '(' )
            // InternalAedit.g:4879:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddVariableAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddVariableAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddVariable__Group__1__Impl"


    // $ANTLR start "rule__AddVariable__Group__2"
    // InternalAedit.g:4888:1: rule__AddVariable__Group__2 : rule__AddVariable__Group__2__Impl rule__AddVariable__Group__3 ;
    public final void rule__AddVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4892:1: ( rule__AddVariable__Group__2__Impl rule__AddVariable__Group__3 )
            // InternalAedit.g:4893:2: rule__AddVariable__Group__2__Impl rule__AddVariable__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__AddVariable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddVariable__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddVariable__Group__2"


    // $ANTLR start "rule__AddVariable__Group__2__Impl"
    // InternalAedit.g:4900:1: rule__AddVariable__Group__2__Impl : ( ( rule__AddVariable__IndexAssignment_2 ) ) ;
    public final void rule__AddVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4904:1: ( ( ( rule__AddVariable__IndexAssignment_2 ) ) )
            // InternalAedit.g:4905:1: ( ( rule__AddVariable__IndexAssignment_2 ) )
            {
            // InternalAedit.g:4905:1: ( ( rule__AddVariable__IndexAssignment_2 ) )
            // InternalAedit.g:4906:2: ( rule__AddVariable__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddVariableAccess().getIndexAssignment_2()); 
            }
            // InternalAedit.g:4907:2: ( rule__AddVariable__IndexAssignment_2 )
            // InternalAedit.g:4907:3: rule__AddVariable__IndexAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddVariable__IndexAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddVariableAccess().getIndexAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddVariable__Group__2__Impl"


    // $ANTLR start "rule__AddVariable__Group__3"
    // InternalAedit.g:4915:1: rule__AddVariable__Group__3 : rule__AddVariable__Group__3__Impl rule__AddVariable__Group__4 ;
    public final void rule__AddVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4919:1: ( rule__AddVariable__Group__3__Impl rule__AddVariable__Group__4 )
            // InternalAedit.g:4920:2: rule__AddVariable__Group__3__Impl rule__AddVariable__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__AddVariable__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddVariable__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddVariable__Group__3"


    // $ANTLR start "rule__AddVariable__Group__3__Impl"
    // InternalAedit.g:4927:1: rule__AddVariable__Group__3__Impl : ( ')' ) ;
    public final void rule__AddVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4931:1: ( ( ')' ) )
            // InternalAedit.g:4932:1: ( ')' )
            {
            // InternalAedit.g:4932:1: ( ')' )
            // InternalAedit.g:4933:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddVariableAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddVariableAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddVariable__Group__3__Impl"


    // $ANTLR start "rule__AddVariable__Group__4"
    // InternalAedit.g:4942:1: rule__AddVariable__Group__4 : rule__AddVariable__Group__4__Impl rule__AddVariable__Group__5 ;
    public final void rule__AddVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4946:1: ( rule__AddVariable__Group__4__Impl rule__AddVariable__Group__5 )
            // InternalAedit.g:4947:2: rule__AddVariable__Group__4__Impl rule__AddVariable__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__AddVariable__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddVariable__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddVariable__Group__4"


    // $ANTLR start "rule__AddVariable__Group__4__Impl"
    // InternalAedit.g:4954:1: rule__AddVariable__Group__4__Impl : ( ( rule__AddVariable__NewVarAssignment_4 ) ) ;
    public final void rule__AddVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4958:1: ( ( ( rule__AddVariable__NewVarAssignment_4 ) ) )
            // InternalAedit.g:4959:1: ( ( rule__AddVariable__NewVarAssignment_4 ) )
            {
            // InternalAedit.g:4959:1: ( ( rule__AddVariable__NewVarAssignment_4 ) )
            // InternalAedit.g:4960:2: ( rule__AddVariable__NewVarAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddVariableAccess().getNewVarAssignment_4()); 
            }
            // InternalAedit.g:4961:2: ( rule__AddVariable__NewVarAssignment_4 )
            // InternalAedit.g:4961:3: rule__AddVariable__NewVarAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AddVariable__NewVarAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddVariableAccess().getNewVarAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddVariable__Group__4__Impl"


    // $ANTLR start "rule__AddVariable__Group__5"
    // InternalAedit.g:4969:1: rule__AddVariable__Group__5 : rule__AddVariable__Group__5__Impl ;
    public final void rule__AddVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4973:1: ( rule__AddVariable__Group__5__Impl )
            // InternalAedit.g:4974:2: rule__AddVariable__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddVariable__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddVariable__Group__5"


    // $ANTLR start "rule__AddVariable__Group__5__Impl"
    // InternalAedit.g:4980:1: rule__AddVariable__Group__5__Impl : ( ';' ) ;
    public final void rule__AddVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4984:1: ( ( ';' ) )
            // InternalAedit.g:4985:1: ( ';' )
            {
            // InternalAedit.g:4985:1: ( ';' )
            // InternalAedit.g:4986:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddVariableAccess().getSemicolonKeyword_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddVariableAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddVariable__Group__5__Impl"


    // $ANTLR start "rule__AddEnum__Group__0"
    // InternalAedit.g:4996:1: rule__AddEnum__Group__0 : rule__AddEnum__Group__0__Impl rule__AddEnum__Group__1 ;
    public final void rule__AddEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5000:1: ( rule__AddEnum__Group__0__Impl rule__AddEnum__Group__1 )
            // InternalAedit.g:5001:2: rule__AddEnum__Group__0__Impl rule__AddEnum__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__AddEnum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddEnum__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnum__Group__0"


    // $ANTLR start "rule__AddEnum__Group__0__Impl"
    // InternalAedit.g:5008:1: rule__AddEnum__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5012:1: ( ( 'add.at' ) )
            // InternalAedit.g:5013:1: ( 'add.at' )
            {
            // InternalAedit.g:5013:1: ( 'add.at' )
            // InternalAedit.g:5014:2: 'add.at'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumAccess().getAddAtKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumAccess().getAddAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnum__Group__0__Impl"


    // $ANTLR start "rule__AddEnum__Group__1"
    // InternalAedit.g:5023:1: rule__AddEnum__Group__1 : rule__AddEnum__Group__1__Impl rule__AddEnum__Group__2 ;
    public final void rule__AddEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5027:1: ( rule__AddEnum__Group__1__Impl rule__AddEnum__Group__2 )
            // InternalAedit.g:5028:2: rule__AddEnum__Group__1__Impl rule__AddEnum__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__AddEnum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddEnum__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnum__Group__1"


    // $ANTLR start "rule__AddEnum__Group__1__Impl"
    // InternalAedit.g:5035:1: rule__AddEnum__Group__1__Impl : ( '(' ) ;
    public final void rule__AddEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5039:1: ( ( '(' ) )
            // InternalAedit.g:5040:1: ( '(' )
            {
            // InternalAedit.g:5040:1: ( '(' )
            // InternalAedit.g:5041:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnum__Group__1__Impl"


    // $ANTLR start "rule__AddEnum__Group__2"
    // InternalAedit.g:5050:1: rule__AddEnum__Group__2 : rule__AddEnum__Group__2__Impl rule__AddEnum__Group__3 ;
    public final void rule__AddEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5054:1: ( rule__AddEnum__Group__2__Impl rule__AddEnum__Group__3 )
            // InternalAedit.g:5055:2: rule__AddEnum__Group__2__Impl rule__AddEnum__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__AddEnum__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddEnum__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnum__Group__2"


    // $ANTLR start "rule__AddEnum__Group__2__Impl"
    // InternalAedit.g:5062:1: rule__AddEnum__Group__2__Impl : ( ( rule__AddEnum__IndexAssignment_2 ) ) ;
    public final void rule__AddEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5066:1: ( ( ( rule__AddEnum__IndexAssignment_2 ) ) )
            // InternalAedit.g:5067:1: ( ( rule__AddEnum__IndexAssignment_2 ) )
            {
            // InternalAedit.g:5067:1: ( ( rule__AddEnum__IndexAssignment_2 ) )
            // InternalAedit.g:5068:2: ( rule__AddEnum__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumAccess().getIndexAssignment_2()); 
            }
            // InternalAedit.g:5069:2: ( rule__AddEnum__IndexAssignment_2 )
            // InternalAedit.g:5069:3: rule__AddEnum__IndexAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddEnum__IndexAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumAccess().getIndexAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnum__Group__2__Impl"


    // $ANTLR start "rule__AddEnum__Group__3"
    // InternalAedit.g:5077:1: rule__AddEnum__Group__3 : rule__AddEnum__Group__3__Impl rule__AddEnum__Group__4 ;
    public final void rule__AddEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5081:1: ( rule__AddEnum__Group__3__Impl rule__AddEnum__Group__4 )
            // InternalAedit.g:5082:2: rule__AddEnum__Group__3__Impl rule__AddEnum__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__AddEnum__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddEnum__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnum__Group__3"


    // $ANTLR start "rule__AddEnum__Group__3__Impl"
    // InternalAedit.g:5089:1: rule__AddEnum__Group__3__Impl : ( ')' ) ;
    public final void rule__AddEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5093:1: ( ( ')' ) )
            // InternalAedit.g:5094:1: ( ')' )
            {
            // InternalAedit.g:5094:1: ( ')' )
            // InternalAedit.g:5095:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnum__Group__3__Impl"


    // $ANTLR start "rule__AddEnum__Group__4"
    // InternalAedit.g:5104:1: rule__AddEnum__Group__4 : rule__AddEnum__Group__4__Impl rule__AddEnum__Group__5 ;
    public final void rule__AddEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5108:1: ( rule__AddEnum__Group__4__Impl rule__AddEnum__Group__5 )
            // InternalAedit.g:5109:2: rule__AddEnum__Group__4__Impl rule__AddEnum__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__AddEnum__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddEnum__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnum__Group__4"


    // $ANTLR start "rule__AddEnum__Group__4__Impl"
    // InternalAedit.g:5116:1: rule__AddEnum__Group__4__Impl : ( ( rule__AddEnum__VarNameAssignment_4 ) ) ;
    public final void rule__AddEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5120:1: ( ( ( rule__AddEnum__VarNameAssignment_4 ) ) )
            // InternalAedit.g:5121:1: ( ( rule__AddEnum__VarNameAssignment_4 ) )
            {
            // InternalAedit.g:5121:1: ( ( rule__AddEnum__VarNameAssignment_4 ) )
            // InternalAedit.g:5122:2: ( rule__AddEnum__VarNameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumAccess().getVarNameAssignment_4()); 
            }
            // InternalAedit.g:5123:2: ( rule__AddEnum__VarNameAssignment_4 )
            // InternalAedit.g:5123:3: rule__AddEnum__VarNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AddEnum__VarNameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumAccess().getVarNameAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnum__Group__4__Impl"


    // $ANTLR start "rule__AddEnum__Group__5"
    // InternalAedit.g:5131:1: rule__AddEnum__Group__5 : rule__AddEnum__Group__5__Impl ;
    public final void rule__AddEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5135:1: ( rule__AddEnum__Group__5__Impl )
            // InternalAedit.g:5136:2: rule__AddEnum__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddEnum__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnum__Group__5"


    // $ANTLR start "rule__AddEnum__Group__5__Impl"
    // InternalAedit.g:5142:1: rule__AddEnum__Group__5__Impl : ( ';' ) ;
    public final void rule__AddEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5146:1: ( ( ';' ) )
            // InternalAedit.g:5147:1: ( ';' )
            {
            // InternalAedit.g:5147:1: ( ';' )
            // InternalAedit.g:5148:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumAccess().getSemicolonKeyword_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnum__Group__5__Impl"


    // $ANTLR start "rule__RemoveSchema__Group__0"
    // InternalAedit.g:5158:1: rule__RemoveSchema__Group__0 : rule__RemoveSchema__Group__0__Impl rule__RemoveSchema__Group__1 ;
    public final void rule__RemoveSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5162:1: ( rule__RemoveSchema__Group__0__Impl rule__RemoveSchema__Group__1 )
            // InternalAedit.g:5163:2: rule__RemoveSchema__Group__0__Impl rule__RemoveSchema__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__RemoveSchema__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveSchema__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveSchema__Group__0"


    // $ANTLR start "rule__RemoveSchema__Group__0__Impl"
    // InternalAedit.g:5170:1: rule__RemoveSchema__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5174:1: ( ( 'remove' ) )
            // InternalAedit.g:5175:1: ( 'remove' )
            {
            // InternalAedit.g:5175:1: ( 'remove' )
            // InternalAedit.g:5176:2: 'remove'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveSchemaAccess().getRemoveKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveSchemaAccess().getRemoveKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveSchema__Group__0__Impl"


    // $ANTLR start "rule__RemoveSchema__Group__1"
    // InternalAedit.g:5185:1: rule__RemoveSchema__Group__1 : rule__RemoveSchema__Group__1__Impl rule__RemoveSchema__Group__2 ;
    public final void rule__RemoveSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5189:1: ( rule__RemoveSchema__Group__1__Impl rule__RemoveSchema__Group__2 )
            // InternalAedit.g:5190:2: rule__RemoveSchema__Group__1__Impl rule__RemoveSchema__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__RemoveSchema__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveSchema__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveSchema__Group__1"


    // $ANTLR start "rule__RemoveSchema__Group__1__Impl"
    // InternalAedit.g:5197:1: rule__RemoveSchema__Group__1__Impl : ( ( rule__RemoveSchema__SchemaTypeAssignment_1 ) ) ;
    public final void rule__RemoveSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5201:1: ( ( ( rule__RemoveSchema__SchemaTypeAssignment_1 ) ) )
            // InternalAedit.g:5202:1: ( ( rule__RemoveSchema__SchemaTypeAssignment_1 ) )
            {
            // InternalAedit.g:5202:1: ( ( rule__RemoveSchema__SchemaTypeAssignment_1 ) )
            // InternalAedit.g:5203:2: ( rule__RemoveSchema__SchemaTypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveSchemaAccess().getSchemaTypeAssignment_1()); 
            }
            // InternalAedit.g:5204:2: ( rule__RemoveSchema__SchemaTypeAssignment_1 )
            // InternalAedit.g:5204:3: rule__RemoveSchema__SchemaTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RemoveSchema__SchemaTypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveSchemaAccess().getSchemaTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveSchema__Group__1__Impl"


    // $ANTLR start "rule__RemoveSchema__Group__2"
    // InternalAedit.g:5212:1: rule__RemoveSchema__Group__2 : rule__RemoveSchema__Group__2__Impl rule__RemoveSchema__Group__3 ;
    public final void rule__RemoveSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5216:1: ( rule__RemoveSchema__Group__2__Impl rule__RemoveSchema__Group__3 )
            // InternalAedit.g:5217:2: rule__RemoveSchema__Group__2__Impl rule__RemoveSchema__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__RemoveSchema__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveSchema__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveSchema__Group__2"


    // $ANTLR start "rule__RemoveSchema__Group__2__Impl"
    // InternalAedit.g:5224:1: rule__RemoveSchema__Group__2__Impl : ( ( rule__RemoveSchema__SchemaAssignment_2 ) ) ;
    public final void rule__RemoveSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5228:1: ( ( ( rule__RemoveSchema__SchemaAssignment_2 ) ) )
            // InternalAedit.g:5229:1: ( ( rule__RemoveSchema__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:5229:1: ( ( rule__RemoveSchema__SchemaAssignment_2 ) )
            // InternalAedit.g:5230:2: ( rule__RemoveSchema__SchemaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveSchemaAccess().getSchemaAssignment_2()); 
            }
            // InternalAedit.g:5231:2: ( rule__RemoveSchema__SchemaAssignment_2 )
            // InternalAedit.g:5231:3: rule__RemoveSchema__SchemaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RemoveSchema__SchemaAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveSchemaAccess().getSchemaAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveSchema__Group__2__Impl"


    // $ANTLR start "rule__RemoveSchema__Group__3"
    // InternalAedit.g:5239:1: rule__RemoveSchema__Group__3 : rule__RemoveSchema__Group__3__Impl ;
    public final void rule__RemoveSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5243:1: ( rule__RemoveSchema__Group__3__Impl )
            // InternalAedit.g:5244:2: rule__RemoveSchema__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveSchema__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveSchema__Group__3"


    // $ANTLR start "rule__RemoveSchema__Group__3__Impl"
    // InternalAedit.g:5250:1: rule__RemoveSchema__Group__3__Impl : ( ';' ) ;
    public final void rule__RemoveSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5254:1: ( ( ';' ) )
            // InternalAedit.g:5255:1: ( ';' )
            {
            // InternalAedit.g:5255:1: ( ';' )
            // InternalAedit.g:5256:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveSchemaAccess().getSemicolonKeyword_3()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveSchemaAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveSchema__Group__3__Impl"


    // $ANTLR start "rule__RemoveVariable__Group__0"
    // InternalAedit.g:5266:1: rule__RemoveVariable__Group__0 : rule__RemoveVariable__Group__0__Impl rule__RemoveVariable__Group__1 ;
    public final void rule__RemoveVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5270:1: ( rule__RemoveVariable__Group__0__Impl rule__RemoveVariable__Group__1 )
            // InternalAedit.g:5271:2: rule__RemoveVariable__Group__0__Impl rule__RemoveVariable__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RemoveVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveVariable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveVariable__Group__0"


    // $ANTLR start "rule__RemoveVariable__Group__0__Impl"
    // InternalAedit.g:5278:1: rule__RemoveVariable__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5282:1: ( ( 'remove' ) )
            // InternalAedit.g:5283:1: ( 'remove' )
            {
            // InternalAedit.g:5283:1: ( 'remove' )
            // InternalAedit.g:5284:2: 'remove'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveVariableAccess().getRemoveKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveVariableAccess().getRemoveKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveVariable__Group__0__Impl"


    // $ANTLR start "rule__RemoveVariable__Group__1"
    // InternalAedit.g:5293:1: rule__RemoveVariable__Group__1 : rule__RemoveVariable__Group__1__Impl rule__RemoveVariable__Group__2 ;
    public final void rule__RemoveVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5297:1: ( rule__RemoveVariable__Group__1__Impl rule__RemoveVariable__Group__2 )
            // InternalAedit.g:5298:2: rule__RemoveVariable__Group__1__Impl rule__RemoveVariable__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__RemoveVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveVariable__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveVariable__Group__1"


    // $ANTLR start "rule__RemoveVariable__Group__1__Impl"
    // InternalAedit.g:5305:1: rule__RemoveVariable__Group__1__Impl : ( ( rule__RemoveVariable__VariableAssignment_1 ) ) ;
    public final void rule__RemoveVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5309:1: ( ( ( rule__RemoveVariable__VariableAssignment_1 ) ) )
            // InternalAedit.g:5310:1: ( ( rule__RemoveVariable__VariableAssignment_1 ) )
            {
            // InternalAedit.g:5310:1: ( ( rule__RemoveVariable__VariableAssignment_1 ) )
            // InternalAedit.g:5311:2: ( rule__RemoveVariable__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveVariableAccess().getVariableAssignment_1()); 
            }
            // InternalAedit.g:5312:2: ( rule__RemoveVariable__VariableAssignment_1 )
            // InternalAedit.g:5312:3: rule__RemoveVariable__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RemoveVariable__VariableAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveVariableAccess().getVariableAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveVariable__Group__1__Impl"


    // $ANTLR start "rule__RemoveVariable__Group__2"
    // InternalAedit.g:5320:1: rule__RemoveVariable__Group__2 : rule__RemoveVariable__Group__2__Impl ;
    public final void rule__RemoveVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5324:1: ( rule__RemoveVariable__Group__2__Impl )
            // InternalAedit.g:5325:2: rule__RemoveVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveVariable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveVariable__Group__2"


    // $ANTLR start "rule__RemoveVariable__Group__2__Impl"
    // InternalAedit.g:5331:1: rule__RemoveVariable__Group__2__Impl : ( ';' ) ;
    public final void rule__RemoveVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5335:1: ( ( ';' ) )
            // InternalAedit.g:5336:1: ( ';' )
            {
            // InternalAedit.g:5336:1: ( ';' )
            // InternalAedit.g:5337:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveVariableAccess().getSemicolonKeyword_2()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveVariableAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveVariable__Group__2__Impl"


    // $ANTLR start "rule__RemoveEnum__Group__0"
    // InternalAedit.g:5347:1: rule__RemoveEnum__Group__0 : rule__RemoveEnum__Group__0__Impl rule__RemoveEnum__Group__1 ;
    public final void rule__RemoveEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5351:1: ( rule__RemoveEnum__Group__0__Impl rule__RemoveEnum__Group__1 )
            // InternalAedit.g:5352:2: rule__RemoveEnum__Group__0__Impl rule__RemoveEnum__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RemoveEnum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveEnum__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveEnum__Group__0"


    // $ANTLR start "rule__RemoveEnum__Group__0__Impl"
    // InternalAedit.g:5359:1: rule__RemoveEnum__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5363:1: ( ( 'remove' ) )
            // InternalAedit.g:5364:1: ( 'remove' )
            {
            // InternalAedit.g:5364:1: ( 'remove' )
            // InternalAedit.g:5365:2: 'remove'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveEnumAccess().getRemoveKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveEnumAccess().getRemoveKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveEnum__Group__0__Impl"


    // $ANTLR start "rule__RemoveEnum__Group__1"
    // InternalAedit.g:5374:1: rule__RemoveEnum__Group__1 : rule__RemoveEnum__Group__1__Impl rule__RemoveEnum__Group__2 ;
    public final void rule__RemoveEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5378:1: ( rule__RemoveEnum__Group__1__Impl rule__RemoveEnum__Group__2 )
            // InternalAedit.g:5379:2: rule__RemoveEnum__Group__1__Impl rule__RemoveEnum__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__RemoveEnum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveEnum__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveEnum__Group__1"


    // $ANTLR start "rule__RemoveEnum__Group__1__Impl"
    // InternalAedit.g:5386:1: rule__RemoveEnum__Group__1__Impl : ( ( rule__RemoveEnum__VarNameAssignment_1 ) ) ;
    public final void rule__RemoveEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5390:1: ( ( ( rule__RemoveEnum__VarNameAssignment_1 ) ) )
            // InternalAedit.g:5391:1: ( ( rule__RemoveEnum__VarNameAssignment_1 ) )
            {
            // InternalAedit.g:5391:1: ( ( rule__RemoveEnum__VarNameAssignment_1 ) )
            // InternalAedit.g:5392:2: ( rule__RemoveEnum__VarNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveEnumAccess().getVarNameAssignment_1()); 
            }
            // InternalAedit.g:5393:2: ( rule__RemoveEnum__VarNameAssignment_1 )
            // InternalAedit.g:5393:3: rule__RemoveEnum__VarNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RemoveEnum__VarNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveEnumAccess().getVarNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveEnum__Group__1__Impl"


    // $ANTLR start "rule__RemoveEnum__Group__2"
    // InternalAedit.g:5401:1: rule__RemoveEnum__Group__2 : rule__RemoveEnum__Group__2__Impl ;
    public final void rule__RemoveEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5405:1: ( rule__RemoveEnum__Group__2__Impl )
            // InternalAedit.g:5406:2: rule__RemoveEnum__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveEnum__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveEnum__Group__2"


    // $ANTLR start "rule__RemoveEnum__Group__2__Impl"
    // InternalAedit.g:5412:1: rule__RemoveEnum__Group__2__Impl : ( ';' ) ;
    public final void rule__RemoveEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5416:1: ( ( ';' ) )
            // InternalAedit.g:5417:1: ( ';' )
            {
            // InternalAedit.g:5417:1: ( ';' )
            // InternalAedit.g:5418:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveEnumAccess().getSemicolonKeyword_2()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveEnumAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveEnum__Group__2__Impl"


    // $ANTLR start "rule__RenameSchema__Group__0"
    // InternalAedit.g:5428:1: rule__RenameSchema__Group__0 : rule__RenameSchema__Group__0__Impl rule__RenameSchema__Group__1 ;
    public final void rule__RenameSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5432:1: ( rule__RenameSchema__Group__0__Impl rule__RenameSchema__Group__1 )
            // InternalAedit.g:5433:2: rule__RenameSchema__Group__0__Impl rule__RenameSchema__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__RenameSchema__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RenameSchema__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameSchema__Group__0"


    // $ANTLR start "rule__RenameSchema__Group__0__Impl"
    // InternalAedit.g:5440:1: rule__RenameSchema__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5444:1: ( ( 'rename' ) )
            // InternalAedit.g:5445:1: ( 'rename' )
            {
            // InternalAedit.g:5445:1: ( 'rename' )
            // InternalAedit.g:5446:2: 'rename'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameSchemaAccess().getRenameKeyword_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameSchemaAccess().getRenameKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameSchema__Group__0__Impl"


    // $ANTLR start "rule__RenameSchema__Group__1"
    // InternalAedit.g:5455:1: rule__RenameSchema__Group__1 : rule__RenameSchema__Group__1__Impl rule__RenameSchema__Group__2 ;
    public final void rule__RenameSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5459:1: ( rule__RenameSchema__Group__1__Impl rule__RenameSchema__Group__2 )
            // InternalAedit.g:5460:2: rule__RenameSchema__Group__1__Impl rule__RenameSchema__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__RenameSchema__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RenameSchema__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameSchema__Group__1"


    // $ANTLR start "rule__RenameSchema__Group__1__Impl"
    // InternalAedit.g:5467:1: rule__RenameSchema__Group__1__Impl : ( ( rule__RenameSchema__SchemaTypeAssignment_1 ) ) ;
    public final void rule__RenameSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5471:1: ( ( ( rule__RenameSchema__SchemaTypeAssignment_1 ) ) )
            // InternalAedit.g:5472:1: ( ( rule__RenameSchema__SchemaTypeAssignment_1 ) )
            {
            // InternalAedit.g:5472:1: ( ( rule__RenameSchema__SchemaTypeAssignment_1 ) )
            // InternalAedit.g:5473:2: ( rule__RenameSchema__SchemaTypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameSchemaAccess().getSchemaTypeAssignment_1()); 
            }
            // InternalAedit.g:5474:2: ( rule__RenameSchema__SchemaTypeAssignment_1 )
            // InternalAedit.g:5474:3: rule__RenameSchema__SchemaTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RenameSchema__SchemaTypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameSchemaAccess().getSchemaTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameSchema__Group__1__Impl"


    // $ANTLR start "rule__RenameSchema__Group__2"
    // InternalAedit.g:5482:1: rule__RenameSchema__Group__2 : rule__RenameSchema__Group__2__Impl rule__RenameSchema__Group__3 ;
    public final void rule__RenameSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5486:1: ( rule__RenameSchema__Group__2__Impl rule__RenameSchema__Group__3 )
            // InternalAedit.g:5487:2: rule__RenameSchema__Group__2__Impl rule__RenameSchema__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__RenameSchema__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RenameSchema__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameSchema__Group__2"


    // $ANTLR start "rule__RenameSchema__Group__2__Impl"
    // InternalAedit.g:5494:1: rule__RenameSchema__Group__2__Impl : ( ( rule__RenameSchema__SchemaAssignment_2 ) ) ;
    public final void rule__RenameSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5498:1: ( ( ( rule__RenameSchema__SchemaAssignment_2 ) ) )
            // InternalAedit.g:5499:1: ( ( rule__RenameSchema__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:5499:1: ( ( rule__RenameSchema__SchemaAssignment_2 ) )
            // InternalAedit.g:5500:2: ( rule__RenameSchema__SchemaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameSchemaAccess().getSchemaAssignment_2()); 
            }
            // InternalAedit.g:5501:2: ( rule__RenameSchema__SchemaAssignment_2 )
            // InternalAedit.g:5501:3: rule__RenameSchema__SchemaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RenameSchema__SchemaAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameSchemaAccess().getSchemaAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameSchema__Group__2__Impl"


    // $ANTLR start "rule__RenameSchema__Group__3"
    // InternalAedit.g:5509:1: rule__RenameSchema__Group__3 : rule__RenameSchema__Group__3__Impl rule__RenameSchema__Group__4 ;
    public final void rule__RenameSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5513:1: ( rule__RenameSchema__Group__3__Impl rule__RenameSchema__Group__4 )
            // InternalAedit.g:5514:2: rule__RenameSchema__Group__3__Impl rule__RenameSchema__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__RenameSchema__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RenameSchema__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameSchema__Group__3"


    // $ANTLR start "rule__RenameSchema__Group__3__Impl"
    // InternalAedit.g:5521:1: rule__RenameSchema__Group__3__Impl : ( '=>' ) ;
    public final void rule__RenameSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5525:1: ( ( '=>' ) )
            // InternalAedit.g:5526:1: ( '=>' )
            {
            // InternalAedit.g:5526:1: ( '=>' )
            // InternalAedit.g:5527:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameSchemaAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameSchemaAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameSchema__Group__3__Impl"


    // $ANTLR start "rule__RenameSchema__Group__4"
    // InternalAedit.g:5536:1: rule__RenameSchema__Group__4 : rule__RenameSchema__Group__4__Impl rule__RenameSchema__Group__5 ;
    public final void rule__RenameSchema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5540:1: ( rule__RenameSchema__Group__4__Impl rule__RenameSchema__Group__5 )
            // InternalAedit.g:5541:2: rule__RenameSchema__Group__4__Impl rule__RenameSchema__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__RenameSchema__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RenameSchema__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameSchema__Group__4"


    // $ANTLR start "rule__RenameSchema__Group__4__Impl"
    // InternalAedit.g:5548:1: rule__RenameSchema__Group__4__Impl : ( ( rule__RenameSchema__NewSchNameAssignment_4 ) ) ;
    public final void rule__RenameSchema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5552:1: ( ( ( rule__RenameSchema__NewSchNameAssignment_4 ) ) )
            // InternalAedit.g:5553:1: ( ( rule__RenameSchema__NewSchNameAssignment_4 ) )
            {
            // InternalAedit.g:5553:1: ( ( rule__RenameSchema__NewSchNameAssignment_4 ) )
            // InternalAedit.g:5554:2: ( rule__RenameSchema__NewSchNameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameSchemaAccess().getNewSchNameAssignment_4()); 
            }
            // InternalAedit.g:5555:2: ( rule__RenameSchema__NewSchNameAssignment_4 )
            // InternalAedit.g:5555:3: rule__RenameSchema__NewSchNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RenameSchema__NewSchNameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameSchemaAccess().getNewSchNameAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameSchema__Group__4__Impl"


    // $ANTLR start "rule__RenameSchema__Group__5"
    // InternalAedit.g:5563:1: rule__RenameSchema__Group__5 : rule__RenameSchema__Group__5__Impl ;
    public final void rule__RenameSchema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5567:1: ( rule__RenameSchema__Group__5__Impl )
            // InternalAedit.g:5568:2: rule__RenameSchema__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameSchema__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameSchema__Group__5"


    // $ANTLR start "rule__RenameSchema__Group__5__Impl"
    // InternalAedit.g:5574:1: rule__RenameSchema__Group__5__Impl : ( ';' ) ;
    public final void rule__RenameSchema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5578:1: ( ( ';' ) )
            // InternalAedit.g:5579:1: ( ';' )
            {
            // InternalAedit.g:5579:1: ( ';' )
            // InternalAedit.g:5580:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameSchemaAccess().getSemicolonKeyword_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameSchemaAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameSchema__Group__5__Impl"


    // $ANTLR start "rule__RenameVariable__Group__0"
    // InternalAedit.g:5590:1: rule__RenameVariable__Group__0 : rule__RenameVariable__Group__0__Impl rule__RenameVariable__Group__1 ;
    public final void rule__RenameVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5594:1: ( rule__RenameVariable__Group__0__Impl rule__RenameVariable__Group__1 )
            // InternalAedit.g:5595:2: rule__RenameVariable__Group__0__Impl rule__RenameVariable__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RenameVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RenameVariable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameVariable__Group__0"


    // $ANTLR start "rule__RenameVariable__Group__0__Impl"
    // InternalAedit.g:5602:1: rule__RenameVariable__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5606:1: ( ( 'rename' ) )
            // InternalAedit.g:5607:1: ( 'rename' )
            {
            // InternalAedit.g:5607:1: ( 'rename' )
            // InternalAedit.g:5608:2: 'rename'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameVariableAccess().getRenameKeyword_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameVariableAccess().getRenameKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameVariable__Group__0__Impl"


    // $ANTLR start "rule__RenameVariable__Group__1"
    // InternalAedit.g:5617:1: rule__RenameVariable__Group__1 : rule__RenameVariable__Group__1__Impl rule__RenameVariable__Group__2 ;
    public final void rule__RenameVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5621:1: ( rule__RenameVariable__Group__1__Impl rule__RenameVariable__Group__2 )
            // InternalAedit.g:5622:2: rule__RenameVariable__Group__1__Impl rule__RenameVariable__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__RenameVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RenameVariable__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameVariable__Group__1"


    // $ANTLR start "rule__RenameVariable__Group__1__Impl"
    // InternalAedit.g:5629:1: rule__RenameVariable__Group__1__Impl : ( ( rule__RenameVariable__VariableAssignment_1 ) ) ;
    public final void rule__RenameVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5633:1: ( ( ( rule__RenameVariable__VariableAssignment_1 ) ) )
            // InternalAedit.g:5634:1: ( ( rule__RenameVariable__VariableAssignment_1 ) )
            {
            // InternalAedit.g:5634:1: ( ( rule__RenameVariable__VariableAssignment_1 ) )
            // InternalAedit.g:5635:2: ( rule__RenameVariable__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameVariableAccess().getVariableAssignment_1()); 
            }
            // InternalAedit.g:5636:2: ( rule__RenameVariable__VariableAssignment_1 )
            // InternalAedit.g:5636:3: rule__RenameVariable__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RenameVariable__VariableAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameVariableAccess().getVariableAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameVariable__Group__1__Impl"


    // $ANTLR start "rule__RenameVariable__Group__2"
    // InternalAedit.g:5644:1: rule__RenameVariable__Group__2 : rule__RenameVariable__Group__2__Impl rule__RenameVariable__Group__3 ;
    public final void rule__RenameVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5648:1: ( rule__RenameVariable__Group__2__Impl rule__RenameVariable__Group__3 )
            // InternalAedit.g:5649:2: rule__RenameVariable__Group__2__Impl rule__RenameVariable__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__RenameVariable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RenameVariable__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameVariable__Group__2"


    // $ANTLR start "rule__RenameVariable__Group__2__Impl"
    // InternalAedit.g:5656:1: rule__RenameVariable__Group__2__Impl : ( '=>' ) ;
    public final void rule__RenameVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5660:1: ( ( '=>' ) )
            // InternalAedit.g:5661:1: ( '=>' )
            {
            // InternalAedit.g:5661:1: ( '=>' )
            // InternalAedit.g:5662:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameVariableAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameVariableAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameVariable__Group__2__Impl"


    // $ANTLR start "rule__RenameVariable__Group__3"
    // InternalAedit.g:5671:1: rule__RenameVariable__Group__3 : rule__RenameVariable__Group__3__Impl rule__RenameVariable__Group__4 ;
    public final void rule__RenameVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5675:1: ( rule__RenameVariable__Group__3__Impl rule__RenameVariable__Group__4 )
            // InternalAedit.g:5676:2: rule__RenameVariable__Group__3__Impl rule__RenameVariable__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__RenameVariable__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RenameVariable__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameVariable__Group__3"


    // $ANTLR start "rule__RenameVariable__Group__3__Impl"
    // InternalAedit.g:5683:1: rule__RenameVariable__Group__3__Impl : ( ( rule__RenameVariable__NewVarNameAssignment_3 ) ) ;
    public final void rule__RenameVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5687:1: ( ( ( rule__RenameVariable__NewVarNameAssignment_3 ) ) )
            // InternalAedit.g:5688:1: ( ( rule__RenameVariable__NewVarNameAssignment_3 ) )
            {
            // InternalAedit.g:5688:1: ( ( rule__RenameVariable__NewVarNameAssignment_3 ) )
            // InternalAedit.g:5689:2: ( rule__RenameVariable__NewVarNameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameVariableAccess().getNewVarNameAssignment_3()); 
            }
            // InternalAedit.g:5690:2: ( rule__RenameVariable__NewVarNameAssignment_3 )
            // InternalAedit.g:5690:3: rule__RenameVariable__NewVarNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RenameVariable__NewVarNameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameVariableAccess().getNewVarNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameVariable__Group__3__Impl"


    // $ANTLR start "rule__RenameVariable__Group__4"
    // InternalAedit.g:5698:1: rule__RenameVariable__Group__4 : rule__RenameVariable__Group__4__Impl ;
    public final void rule__RenameVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5702:1: ( rule__RenameVariable__Group__4__Impl )
            // InternalAedit.g:5703:2: rule__RenameVariable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameVariable__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameVariable__Group__4"


    // $ANTLR start "rule__RenameVariable__Group__4__Impl"
    // InternalAedit.g:5709:1: rule__RenameVariable__Group__4__Impl : ( ';' ) ;
    public final void rule__RenameVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5713:1: ( ( ';' ) )
            // InternalAedit.g:5714:1: ( ';' )
            {
            // InternalAedit.g:5714:1: ( ';' )
            // InternalAedit.g:5715:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameVariableAccess().getSemicolonKeyword_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameVariableAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameVariable__Group__4__Impl"


    // $ANTLR start "rule__RenameEnum__Group__0"
    // InternalAedit.g:5725:1: rule__RenameEnum__Group__0 : rule__RenameEnum__Group__0__Impl rule__RenameEnum__Group__1 ;
    public final void rule__RenameEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5729:1: ( rule__RenameEnum__Group__0__Impl rule__RenameEnum__Group__1 )
            // InternalAedit.g:5730:2: rule__RenameEnum__Group__0__Impl rule__RenameEnum__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RenameEnum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RenameEnum__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEnum__Group__0"


    // $ANTLR start "rule__RenameEnum__Group__0__Impl"
    // InternalAedit.g:5737:1: rule__RenameEnum__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5741:1: ( ( 'rename' ) )
            // InternalAedit.g:5742:1: ( 'rename' )
            {
            // InternalAedit.g:5742:1: ( 'rename' )
            // InternalAedit.g:5743:2: 'rename'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameEnumAccess().getRenameKeyword_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameEnumAccess().getRenameKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEnum__Group__0__Impl"


    // $ANTLR start "rule__RenameEnum__Group__1"
    // InternalAedit.g:5752:1: rule__RenameEnum__Group__1 : rule__RenameEnum__Group__1__Impl rule__RenameEnum__Group__2 ;
    public final void rule__RenameEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5756:1: ( rule__RenameEnum__Group__1__Impl rule__RenameEnum__Group__2 )
            // InternalAedit.g:5757:2: rule__RenameEnum__Group__1__Impl rule__RenameEnum__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__RenameEnum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RenameEnum__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEnum__Group__1"


    // $ANTLR start "rule__RenameEnum__Group__1__Impl"
    // InternalAedit.g:5764:1: rule__RenameEnum__Group__1__Impl : ( ( rule__RenameEnum__OldNameAssignment_1 ) ) ;
    public final void rule__RenameEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5768:1: ( ( ( rule__RenameEnum__OldNameAssignment_1 ) ) )
            // InternalAedit.g:5769:1: ( ( rule__RenameEnum__OldNameAssignment_1 ) )
            {
            // InternalAedit.g:5769:1: ( ( rule__RenameEnum__OldNameAssignment_1 ) )
            // InternalAedit.g:5770:2: ( rule__RenameEnum__OldNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameEnumAccess().getOldNameAssignment_1()); 
            }
            // InternalAedit.g:5771:2: ( rule__RenameEnum__OldNameAssignment_1 )
            // InternalAedit.g:5771:3: rule__RenameEnum__OldNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RenameEnum__OldNameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameEnumAccess().getOldNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEnum__Group__1__Impl"


    // $ANTLR start "rule__RenameEnum__Group__2"
    // InternalAedit.g:5779:1: rule__RenameEnum__Group__2 : rule__RenameEnum__Group__2__Impl rule__RenameEnum__Group__3 ;
    public final void rule__RenameEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5783:1: ( rule__RenameEnum__Group__2__Impl rule__RenameEnum__Group__3 )
            // InternalAedit.g:5784:2: rule__RenameEnum__Group__2__Impl rule__RenameEnum__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__RenameEnum__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RenameEnum__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEnum__Group__2"


    // $ANTLR start "rule__RenameEnum__Group__2__Impl"
    // InternalAedit.g:5791:1: rule__RenameEnum__Group__2__Impl : ( '=>' ) ;
    public final void rule__RenameEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5795:1: ( ( '=>' ) )
            // InternalAedit.g:5796:1: ( '=>' )
            {
            // InternalAedit.g:5796:1: ( '=>' )
            // InternalAedit.g:5797:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameEnumAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameEnumAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEnum__Group__2__Impl"


    // $ANTLR start "rule__RenameEnum__Group__3"
    // InternalAedit.g:5806:1: rule__RenameEnum__Group__3 : rule__RenameEnum__Group__3__Impl rule__RenameEnum__Group__4 ;
    public final void rule__RenameEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5810:1: ( rule__RenameEnum__Group__3__Impl rule__RenameEnum__Group__4 )
            // InternalAedit.g:5811:2: rule__RenameEnum__Group__3__Impl rule__RenameEnum__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__RenameEnum__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RenameEnum__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEnum__Group__3"


    // $ANTLR start "rule__RenameEnum__Group__3__Impl"
    // InternalAedit.g:5818:1: rule__RenameEnum__Group__3__Impl : ( ( rule__RenameEnum__NewEnumNameAssignment_3 ) ) ;
    public final void rule__RenameEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5822:1: ( ( ( rule__RenameEnum__NewEnumNameAssignment_3 ) ) )
            // InternalAedit.g:5823:1: ( ( rule__RenameEnum__NewEnumNameAssignment_3 ) )
            {
            // InternalAedit.g:5823:1: ( ( rule__RenameEnum__NewEnumNameAssignment_3 ) )
            // InternalAedit.g:5824:2: ( rule__RenameEnum__NewEnumNameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameEnumAccess().getNewEnumNameAssignment_3()); 
            }
            // InternalAedit.g:5825:2: ( rule__RenameEnum__NewEnumNameAssignment_3 )
            // InternalAedit.g:5825:3: rule__RenameEnum__NewEnumNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RenameEnum__NewEnumNameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameEnumAccess().getNewEnumNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEnum__Group__3__Impl"


    // $ANTLR start "rule__RenameEnum__Group__4"
    // InternalAedit.g:5833:1: rule__RenameEnum__Group__4 : rule__RenameEnum__Group__4__Impl ;
    public final void rule__RenameEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5837:1: ( rule__RenameEnum__Group__4__Impl )
            // InternalAedit.g:5838:2: rule__RenameEnum__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameEnum__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEnum__Group__4"


    // $ANTLR start "rule__RenameEnum__Group__4__Impl"
    // InternalAedit.g:5844:1: rule__RenameEnum__Group__4__Impl : ( ';' ) ;
    public final void rule__RenameEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5848:1: ( ( ';' ) )
            // InternalAedit.g:5849:1: ( ';' )
            {
            // InternalAedit.g:5849:1: ( ';' )
            // InternalAedit.g:5850:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameEnumAccess().getSemicolonKeyword_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameEnumAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEnum__Group__4__Impl"


    // $ANTLR start "rule__ChangeDefValue__Group__0"
    // InternalAedit.g:5860:1: rule__ChangeDefValue__Group__0 : rule__ChangeDefValue__Group__0__Impl rule__ChangeDefValue__Group__1 ;
    public final void rule__ChangeDefValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5864:1: ( rule__ChangeDefValue__Group__0__Impl rule__ChangeDefValue__Group__1 )
            // InternalAedit.g:5865:2: rule__ChangeDefValue__Group__0__Impl rule__ChangeDefValue__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ChangeDefValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeDefValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeDefValue__Group__0"


    // $ANTLR start "rule__ChangeDefValue__Group__0__Impl"
    // InternalAedit.g:5872:1: rule__ChangeDefValue__Group__0__Impl : ( 'set_val' ) ;
    public final void rule__ChangeDefValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5876:1: ( ( 'set_val' ) )
            // InternalAedit.g:5877:1: ( 'set_val' )
            {
            // InternalAedit.g:5877:1: ( 'set_val' )
            // InternalAedit.g:5878:2: 'set_val'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeDefValueAccess().getSet_valKeyword_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeDefValueAccess().getSet_valKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeDefValue__Group__0__Impl"


    // $ANTLR start "rule__ChangeDefValue__Group__1"
    // InternalAedit.g:5887:1: rule__ChangeDefValue__Group__1 : rule__ChangeDefValue__Group__1__Impl rule__ChangeDefValue__Group__2 ;
    public final void rule__ChangeDefValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5891:1: ( rule__ChangeDefValue__Group__1__Impl rule__ChangeDefValue__Group__2 )
            // InternalAedit.g:5892:2: rule__ChangeDefValue__Group__1__Impl rule__ChangeDefValue__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ChangeDefValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeDefValue__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeDefValue__Group__1"


    // $ANTLR start "rule__ChangeDefValue__Group__1__Impl"
    // InternalAedit.g:5899:1: rule__ChangeDefValue__Group__1__Impl : ( ( rule__ChangeDefValue__FieldAssignment_1 ) ) ;
    public final void rule__ChangeDefValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5903:1: ( ( ( rule__ChangeDefValue__FieldAssignment_1 ) ) )
            // InternalAedit.g:5904:1: ( ( rule__ChangeDefValue__FieldAssignment_1 ) )
            {
            // InternalAedit.g:5904:1: ( ( rule__ChangeDefValue__FieldAssignment_1 ) )
            // InternalAedit.g:5905:2: ( rule__ChangeDefValue__FieldAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeDefValueAccess().getFieldAssignment_1()); 
            }
            // InternalAedit.g:5906:2: ( rule__ChangeDefValue__FieldAssignment_1 )
            // InternalAedit.g:5906:3: rule__ChangeDefValue__FieldAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ChangeDefValue__FieldAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeDefValueAccess().getFieldAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeDefValue__Group__1__Impl"


    // $ANTLR start "rule__ChangeDefValue__Group__2"
    // InternalAedit.g:5914:1: rule__ChangeDefValue__Group__2 : rule__ChangeDefValue__Group__2__Impl rule__ChangeDefValue__Group__3 ;
    public final void rule__ChangeDefValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5918:1: ( rule__ChangeDefValue__Group__2__Impl rule__ChangeDefValue__Group__3 )
            // InternalAedit.g:5919:2: rule__ChangeDefValue__Group__2__Impl rule__ChangeDefValue__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__ChangeDefValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeDefValue__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeDefValue__Group__2"


    // $ANTLR start "rule__ChangeDefValue__Group__2__Impl"
    // InternalAedit.g:5926:1: rule__ChangeDefValue__Group__2__Impl : ( '=>' ) ;
    public final void rule__ChangeDefValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5930:1: ( ( '=>' ) )
            // InternalAedit.g:5931:1: ( '=>' )
            {
            // InternalAedit.g:5931:1: ( '=>' )
            // InternalAedit.g:5932:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeDefValueAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeDefValueAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeDefValue__Group__2__Impl"


    // $ANTLR start "rule__ChangeDefValue__Group__3"
    // InternalAedit.g:5941:1: rule__ChangeDefValue__Group__3 : rule__ChangeDefValue__Group__3__Impl rule__ChangeDefValue__Group__4 ;
    public final void rule__ChangeDefValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5945:1: ( rule__ChangeDefValue__Group__3__Impl rule__ChangeDefValue__Group__4 )
            // InternalAedit.g:5946:2: rule__ChangeDefValue__Group__3__Impl rule__ChangeDefValue__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ChangeDefValue__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeDefValue__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeDefValue__Group__3"


    // $ANTLR start "rule__ChangeDefValue__Group__3__Impl"
    // InternalAedit.g:5953:1: rule__ChangeDefValue__Group__3__Impl : ( ( rule__ChangeDefValue__NewValAssignment_3 ) ) ;
    public final void rule__ChangeDefValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5957:1: ( ( ( rule__ChangeDefValue__NewValAssignment_3 ) ) )
            // InternalAedit.g:5958:1: ( ( rule__ChangeDefValue__NewValAssignment_3 ) )
            {
            // InternalAedit.g:5958:1: ( ( rule__ChangeDefValue__NewValAssignment_3 ) )
            // InternalAedit.g:5959:2: ( rule__ChangeDefValue__NewValAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeDefValueAccess().getNewValAssignment_3()); 
            }
            // InternalAedit.g:5960:2: ( rule__ChangeDefValue__NewValAssignment_3 )
            // InternalAedit.g:5960:3: rule__ChangeDefValue__NewValAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ChangeDefValue__NewValAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeDefValueAccess().getNewValAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeDefValue__Group__3__Impl"


    // $ANTLR start "rule__ChangeDefValue__Group__4"
    // InternalAedit.g:5968:1: rule__ChangeDefValue__Group__4 : rule__ChangeDefValue__Group__4__Impl ;
    public final void rule__ChangeDefValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5972:1: ( rule__ChangeDefValue__Group__4__Impl )
            // InternalAedit.g:5973:2: rule__ChangeDefValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeDefValue__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeDefValue__Group__4"


    // $ANTLR start "rule__ChangeDefValue__Group__4__Impl"
    // InternalAedit.g:5979:1: rule__ChangeDefValue__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeDefValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5983:1: ( ( ';' ) )
            // InternalAedit.g:5984:1: ( ';' )
            {
            // InternalAedit.g:5984:1: ( ';' )
            // InternalAedit.g:5985:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeDefValueAccess().getSemicolonKeyword_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeDefValueAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeDefValue__Group__4__Impl"


    // $ANTLR start "rule__ChangeType__Group__0"
    // InternalAedit.g:5995:1: rule__ChangeType__Group__0 : rule__ChangeType__Group__0__Impl rule__ChangeType__Group__1 ;
    public final void rule__ChangeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5999:1: ( rule__ChangeType__Group__0__Impl rule__ChangeType__Group__1 )
            // InternalAedit.g:6000:2: rule__ChangeType__Group__0__Impl rule__ChangeType__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ChangeType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeType__Group__0"


    // $ANTLR start "rule__ChangeType__Group__0__Impl"
    // InternalAedit.g:6007:1: rule__ChangeType__Group__0__Impl : ( 'set_type' ) ;
    public final void rule__ChangeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6011:1: ( ( 'set_type' ) )
            // InternalAedit.g:6012:1: ( 'set_type' )
            {
            // InternalAedit.g:6012:1: ( 'set_type' )
            // InternalAedit.g:6013:2: 'set_type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeTypeAccess().getSet_typeKeyword_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeTypeAccess().getSet_typeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeType__Group__0__Impl"


    // $ANTLR start "rule__ChangeType__Group__1"
    // InternalAedit.g:6022:1: rule__ChangeType__Group__1 : rule__ChangeType__Group__1__Impl rule__ChangeType__Group__2 ;
    public final void rule__ChangeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6026:1: ( rule__ChangeType__Group__1__Impl rule__ChangeType__Group__2 )
            // InternalAedit.g:6027:2: rule__ChangeType__Group__1__Impl rule__ChangeType__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ChangeType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeType__Group__1"


    // $ANTLR start "rule__ChangeType__Group__1__Impl"
    // InternalAedit.g:6034:1: rule__ChangeType__Group__1__Impl : ( ( rule__ChangeType__FieldAssignment_1 ) ) ;
    public final void rule__ChangeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6038:1: ( ( ( rule__ChangeType__FieldAssignment_1 ) ) )
            // InternalAedit.g:6039:1: ( ( rule__ChangeType__FieldAssignment_1 ) )
            {
            // InternalAedit.g:6039:1: ( ( rule__ChangeType__FieldAssignment_1 ) )
            // InternalAedit.g:6040:2: ( rule__ChangeType__FieldAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeTypeAccess().getFieldAssignment_1()); 
            }
            // InternalAedit.g:6041:2: ( rule__ChangeType__FieldAssignment_1 )
            // InternalAedit.g:6041:3: rule__ChangeType__FieldAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ChangeType__FieldAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeTypeAccess().getFieldAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeType__Group__1__Impl"


    // $ANTLR start "rule__ChangeType__Group__2"
    // InternalAedit.g:6049:1: rule__ChangeType__Group__2 : rule__ChangeType__Group__2__Impl rule__ChangeType__Group__3 ;
    public final void rule__ChangeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6053:1: ( rule__ChangeType__Group__2__Impl rule__ChangeType__Group__3 )
            // InternalAedit.g:6054:2: rule__ChangeType__Group__2__Impl rule__ChangeType__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__ChangeType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeType__Group__2"


    // $ANTLR start "rule__ChangeType__Group__2__Impl"
    // InternalAedit.g:6061:1: rule__ChangeType__Group__2__Impl : ( '=>' ) ;
    public final void rule__ChangeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6065:1: ( ( '=>' ) )
            // InternalAedit.g:6066:1: ( '=>' )
            {
            // InternalAedit.g:6066:1: ( '=>' )
            // InternalAedit.g:6067:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeTypeAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeTypeAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeType__Group__2__Impl"


    // $ANTLR start "rule__ChangeType__Group__3"
    // InternalAedit.g:6076:1: rule__ChangeType__Group__3 : rule__ChangeType__Group__3__Impl rule__ChangeType__Group__4 ;
    public final void rule__ChangeType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6080:1: ( rule__ChangeType__Group__3__Impl rule__ChangeType__Group__4 )
            // InternalAedit.g:6081:2: rule__ChangeType__Group__3__Impl rule__ChangeType__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ChangeType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ChangeType__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeType__Group__3"


    // $ANTLR start "rule__ChangeType__Group__3__Impl"
    // InternalAedit.g:6088:1: rule__ChangeType__Group__3__Impl : ( ( rule__ChangeType__NewTypeAssignment_3 ) ) ;
    public final void rule__ChangeType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6092:1: ( ( ( rule__ChangeType__NewTypeAssignment_3 ) ) )
            // InternalAedit.g:6093:1: ( ( rule__ChangeType__NewTypeAssignment_3 ) )
            {
            // InternalAedit.g:6093:1: ( ( rule__ChangeType__NewTypeAssignment_3 ) )
            // InternalAedit.g:6094:2: ( rule__ChangeType__NewTypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeTypeAccess().getNewTypeAssignment_3()); 
            }
            // InternalAedit.g:6095:2: ( rule__ChangeType__NewTypeAssignment_3 )
            // InternalAedit.g:6095:3: rule__ChangeType__NewTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ChangeType__NewTypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeTypeAccess().getNewTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeType__Group__3__Impl"


    // $ANTLR start "rule__ChangeType__Group__4"
    // InternalAedit.g:6103:1: rule__ChangeType__Group__4 : rule__ChangeType__Group__4__Impl ;
    public final void rule__ChangeType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6107:1: ( rule__ChangeType__Group__4__Impl )
            // InternalAedit.g:6108:2: rule__ChangeType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeType__Group__4"


    // $ANTLR start "rule__ChangeType__Group__4__Impl"
    // InternalAedit.g:6114:1: rule__ChangeType__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6118:1: ( ( ';' ) )
            // InternalAedit.g:6119:1: ( ';' )
            {
            // InternalAedit.g:6119:1: ( ';' )
            // InternalAedit.g:6120:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeTypeAccess().getSemicolonKeyword_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeTypeAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeType__Group__4__Impl"


    // $ANTLR start "rule__RemoveArrayValue__Group__0"
    // InternalAedit.g:6130:1: rule__RemoveArrayValue__Group__0 : rule__RemoveArrayValue__Group__0__Impl rule__RemoveArrayValue__Group__1 ;
    public final void rule__RemoveArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6134:1: ( rule__RemoveArrayValue__Group__0__Impl rule__RemoveArrayValue__Group__1 )
            // InternalAedit.g:6135:2: rule__RemoveArrayValue__Group__0__Impl rule__RemoveArrayValue__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RemoveArrayValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValue__Group__0"


    // $ANTLR start "rule__RemoveArrayValue__Group__0__Impl"
    // InternalAedit.g:6142:1: rule__RemoveArrayValue__Group__0__Impl : ( 'remove_value' ) ;
    public final void rule__RemoveArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6146:1: ( ( 'remove_value' ) )
            // InternalAedit.g:6147:1: ( 'remove_value' )
            {
            // InternalAedit.g:6147:1: ( 'remove_value' )
            // InternalAedit.g:6148:2: 'remove_value'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAccess().getRemove_valueKeyword_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAccess().getRemove_valueKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValue__Group__0__Impl"


    // $ANTLR start "rule__RemoveArrayValue__Group__1"
    // InternalAedit.g:6157:1: rule__RemoveArrayValue__Group__1 : rule__RemoveArrayValue__Group__1__Impl rule__RemoveArrayValue__Group__2 ;
    public final void rule__RemoveArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6161:1: ( rule__RemoveArrayValue__Group__1__Impl rule__RemoveArrayValue__Group__2 )
            // InternalAedit.g:6162:2: rule__RemoveArrayValue__Group__1__Impl rule__RemoveArrayValue__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__RemoveArrayValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValue__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValue__Group__1"


    // $ANTLR start "rule__RemoveArrayValue__Group__1__Impl"
    // InternalAedit.g:6169:1: rule__RemoveArrayValue__Group__1__Impl : ( ( rule__RemoveArrayValue__VariableAssignment_1 ) ) ;
    public final void rule__RemoveArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6173:1: ( ( ( rule__RemoveArrayValue__VariableAssignment_1 ) ) )
            // InternalAedit.g:6174:1: ( ( rule__RemoveArrayValue__VariableAssignment_1 ) )
            {
            // InternalAedit.g:6174:1: ( ( rule__RemoveArrayValue__VariableAssignment_1 ) )
            // InternalAedit.g:6175:2: ( rule__RemoveArrayValue__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAccess().getVariableAssignment_1()); 
            }
            // InternalAedit.g:6176:2: ( rule__RemoveArrayValue__VariableAssignment_1 )
            // InternalAedit.g:6176:3: rule__RemoveArrayValue__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValue__VariableAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAccess().getVariableAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValue__Group__1__Impl"


    // $ANTLR start "rule__RemoveArrayValue__Group__2"
    // InternalAedit.g:6184:1: rule__RemoveArrayValue__Group__2 : rule__RemoveArrayValue__Group__2__Impl rule__RemoveArrayValue__Group__3 ;
    public final void rule__RemoveArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6188:1: ( rule__RemoveArrayValue__Group__2__Impl rule__RemoveArrayValue__Group__3 )
            // InternalAedit.g:6189:2: rule__RemoveArrayValue__Group__2__Impl rule__RemoveArrayValue__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__RemoveArrayValue__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValue__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValue__Group__2"


    // $ANTLR start "rule__RemoveArrayValue__Group__2__Impl"
    // InternalAedit.g:6196:1: rule__RemoveArrayValue__Group__2__Impl : ( '=>' ) ;
    public final void rule__RemoveArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6200:1: ( ( '=>' ) )
            // InternalAedit.g:6201:1: ( '=>' )
            {
            // InternalAedit.g:6201:1: ( '=>' )
            // InternalAedit.g:6202:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValue__Group__2__Impl"


    // $ANTLR start "rule__RemoveArrayValue__Group__3"
    // InternalAedit.g:6211:1: rule__RemoveArrayValue__Group__3 : rule__RemoveArrayValue__Group__3__Impl rule__RemoveArrayValue__Group__4 ;
    public final void rule__RemoveArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6215:1: ( rule__RemoveArrayValue__Group__3__Impl rule__RemoveArrayValue__Group__4 )
            // InternalAedit.g:6216:2: rule__RemoveArrayValue__Group__3__Impl rule__RemoveArrayValue__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__RemoveArrayValue__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValue__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValue__Group__3"


    // $ANTLR start "rule__RemoveArrayValue__Group__3__Impl"
    // InternalAedit.g:6223:1: rule__RemoveArrayValue__Group__3__Impl : ( ( rule__RemoveArrayValue__ValueToRemoveAssignment_3 ) ) ;
    public final void rule__RemoveArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6227:1: ( ( ( rule__RemoveArrayValue__ValueToRemoveAssignment_3 ) ) )
            // InternalAedit.g:6228:1: ( ( rule__RemoveArrayValue__ValueToRemoveAssignment_3 ) )
            {
            // InternalAedit.g:6228:1: ( ( rule__RemoveArrayValue__ValueToRemoveAssignment_3 ) )
            // InternalAedit.g:6229:2: ( rule__RemoveArrayValue__ValueToRemoveAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAccess().getValueToRemoveAssignment_3()); 
            }
            // InternalAedit.g:6230:2: ( rule__RemoveArrayValue__ValueToRemoveAssignment_3 )
            // InternalAedit.g:6230:3: rule__RemoveArrayValue__ValueToRemoveAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValue__ValueToRemoveAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAccess().getValueToRemoveAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValue__Group__3__Impl"


    // $ANTLR start "rule__RemoveArrayValue__Group__4"
    // InternalAedit.g:6238:1: rule__RemoveArrayValue__Group__4 : rule__RemoveArrayValue__Group__4__Impl ;
    public final void rule__RemoveArrayValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6242:1: ( rule__RemoveArrayValue__Group__4__Impl )
            // InternalAedit.g:6243:2: rule__RemoveArrayValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValue__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValue__Group__4"


    // $ANTLR start "rule__RemoveArrayValue__Group__4__Impl"
    // InternalAedit.g:6249:1: rule__RemoveArrayValue__Group__4__Impl : ( ';' ) ;
    public final void rule__RemoveArrayValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6253:1: ( ( ';' ) )
            // InternalAedit.g:6254:1: ( ';' )
            {
            // InternalAedit.g:6254:1: ( ';' )
            // InternalAedit.g:6255:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAccess().getSemicolonKeyword_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValue__Group__4__Impl"


    // $ANTLR start "rule__RemoveArrayValueAtIndex__Group__0"
    // InternalAedit.g:6265:1: rule__RemoveArrayValueAtIndex__Group__0 : rule__RemoveArrayValueAtIndex__Group__0__Impl rule__RemoveArrayValueAtIndex__Group__1 ;
    public final void rule__RemoveArrayValueAtIndex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6269:1: ( rule__RemoveArrayValueAtIndex__Group__0__Impl rule__RemoveArrayValueAtIndex__Group__1 )
            // InternalAedit.g:6270:2: rule__RemoveArrayValueAtIndex__Group__0__Impl rule__RemoveArrayValueAtIndex__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__RemoveArrayValueAtIndex__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValueAtIndex__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValueAtIndex__Group__0"


    // $ANTLR start "rule__RemoveArrayValueAtIndex__Group__0__Impl"
    // InternalAedit.g:6277:1: rule__RemoveArrayValueAtIndex__Group__0__Impl : ( 'remove_value.at' ) ;
    public final void rule__RemoveArrayValueAtIndex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6281:1: ( ( 'remove_value.at' ) )
            // InternalAedit.g:6282:1: ( 'remove_value.at' )
            {
            // InternalAedit.g:6282:1: ( 'remove_value.at' )
            // InternalAedit.g:6283:2: 'remove_value.at'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAtIndexAccess().getRemove_valueAtKeyword_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAtIndexAccess().getRemove_valueAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValueAtIndex__Group__0__Impl"


    // $ANTLR start "rule__RemoveArrayValueAtIndex__Group__1"
    // InternalAedit.g:6292:1: rule__RemoveArrayValueAtIndex__Group__1 : rule__RemoveArrayValueAtIndex__Group__1__Impl rule__RemoveArrayValueAtIndex__Group__2 ;
    public final void rule__RemoveArrayValueAtIndex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6296:1: ( rule__RemoveArrayValueAtIndex__Group__1__Impl rule__RemoveArrayValueAtIndex__Group__2 )
            // InternalAedit.g:6297:2: rule__RemoveArrayValueAtIndex__Group__1__Impl rule__RemoveArrayValueAtIndex__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__RemoveArrayValueAtIndex__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValueAtIndex__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValueAtIndex__Group__1"


    // $ANTLR start "rule__RemoveArrayValueAtIndex__Group__1__Impl"
    // InternalAedit.g:6304:1: rule__RemoveArrayValueAtIndex__Group__1__Impl : ( '(' ) ;
    public final void rule__RemoveArrayValueAtIndex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6308:1: ( ( '(' ) )
            // InternalAedit.g:6309:1: ( '(' )
            {
            // InternalAedit.g:6309:1: ( '(' )
            // InternalAedit.g:6310:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAtIndexAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAtIndexAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValueAtIndex__Group__1__Impl"


    // $ANTLR start "rule__RemoveArrayValueAtIndex__Group__2"
    // InternalAedit.g:6319:1: rule__RemoveArrayValueAtIndex__Group__2 : rule__RemoveArrayValueAtIndex__Group__2__Impl rule__RemoveArrayValueAtIndex__Group__3 ;
    public final void rule__RemoveArrayValueAtIndex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6323:1: ( rule__RemoveArrayValueAtIndex__Group__2__Impl rule__RemoveArrayValueAtIndex__Group__3 )
            // InternalAedit.g:6324:2: rule__RemoveArrayValueAtIndex__Group__2__Impl rule__RemoveArrayValueAtIndex__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__RemoveArrayValueAtIndex__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValueAtIndex__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValueAtIndex__Group__2"


    // $ANTLR start "rule__RemoveArrayValueAtIndex__Group__2__Impl"
    // InternalAedit.g:6331:1: rule__RemoveArrayValueAtIndex__Group__2__Impl : ( ( rule__RemoveArrayValueAtIndex__IndexAssignment_2 ) ) ;
    public final void rule__RemoveArrayValueAtIndex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6335:1: ( ( ( rule__RemoveArrayValueAtIndex__IndexAssignment_2 ) ) )
            // InternalAedit.g:6336:1: ( ( rule__RemoveArrayValueAtIndex__IndexAssignment_2 ) )
            {
            // InternalAedit.g:6336:1: ( ( rule__RemoveArrayValueAtIndex__IndexAssignment_2 ) )
            // InternalAedit.g:6337:2: ( rule__RemoveArrayValueAtIndex__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAtIndexAccess().getIndexAssignment_2()); 
            }
            // InternalAedit.g:6338:2: ( rule__RemoveArrayValueAtIndex__IndexAssignment_2 )
            // InternalAedit.g:6338:3: rule__RemoveArrayValueAtIndex__IndexAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValueAtIndex__IndexAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAtIndexAccess().getIndexAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValueAtIndex__Group__2__Impl"


    // $ANTLR start "rule__RemoveArrayValueAtIndex__Group__3"
    // InternalAedit.g:6346:1: rule__RemoveArrayValueAtIndex__Group__3 : rule__RemoveArrayValueAtIndex__Group__3__Impl rule__RemoveArrayValueAtIndex__Group__4 ;
    public final void rule__RemoveArrayValueAtIndex__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6350:1: ( rule__RemoveArrayValueAtIndex__Group__3__Impl rule__RemoveArrayValueAtIndex__Group__4 )
            // InternalAedit.g:6351:2: rule__RemoveArrayValueAtIndex__Group__3__Impl rule__RemoveArrayValueAtIndex__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__RemoveArrayValueAtIndex__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValueAtIndex__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValueAtIndex__Group__3"


    // $ANTLR start "rule__RemoveArrayValueAtIndex__Group__3__Impl"
    // InternalAedit.g:6358:1: rule__RemoveArrayValueAtIndex__Group__3__Impl : ( ')' ) ;
    public final void rule__RemoveArrayValueAtIndex__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6362:1: ( ( ')' ) )
            // InternalAedit.g:6363:1: ( ')' )
            {
            // InternalAedit.g:6363:1: ( ')' )
            // InternalAedit.g:6364:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAtIndexAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAtIndexAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValueAtIndex__Group__3__Impl"


    // $ANTLR start "rule__RemoveArrayValueAtIndex__Group__4"
    // InternalAedit.g:6373:1: rule__RemoveArrayValueAtIndex__Group__4 : rule__RemoveArrayValueAtIndex__Group__4__Impl rule__RemoveArrayValueAtIndex__Group__5 ;
    public final void rule__RemoveArrayValueAtIndex__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6377:1: ( rule__RemoveArrayValueAtIndex__Group__4__Impl rule__RemoveArrayValueAtIndex__Group__5 )
            // InternalAedit.g:6378:2: rule__RemoveArrayValueAtIndex__Group__4__Impl rule__RemoveArrayValueAtIndex__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__RemoveArrayValueAtIndex__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValueAtIndex__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValueAtIndex__Group__4"


    // $ANTLR start "rule__RemoveArrayValueAtIndex__Group__4__Impl"
    // InternalAedit.g:6385:1: rule__RemoveArrayValueAtIndex__Group__4__Impl : ( ( rule__RemoveArrayValueAtIndex__ArrayAssignment_4 ) ) ;
    public final void rule__RemoveArrayValueAtIndex__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6389:1: ( ( ( rule__RemoveArrayValueAtIndex__ArrayAssignment_4 ) ) )
            // InternalAedit.g:6390:1: ( ( rule__RemoveArrayValueAtIndex__ArrayAssignment_4 ) )
            {
            // InternalAedit.g:6390:1: ( ( rule__RemoveArrayValueAtIndex__ArrayAssignment_4 ) )
            // InternalAedit.g:6391:2: ( rule__RemoveArrayValueAtIndex__ArrayAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAtIndexAccess().getArrayAssignment_4()); 
            }
            // InternalAedit.g:6392:2: ( rule__RemoveArrayValueAtIndex__ArrayAssignment_4 )
            // InternalAedit.g:6392:3: rule__RemoveArrayValueAtIndex__ArrayAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValueAtIndex__ArrayAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAtIndexAccess().getArrayAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValueAtIndex__Group__4__Impl"


    // $ANTLR start "rule__RemoveArrayValueAtIndex__Group__5"
    // InternalAedit.g:6400:1: rule__RemoveArrayValueAtIndex__Group__5 : rule__RemoveArrayValueAtIndex__Group__5__Impl ;
    public final void rule__RemoveArrayValueAtIndex__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6404:1: ( rule__RemoveArrayValueAtIndex__Group__5__Impl )
            // InternalAedit.g:6405:2: rule__RemoveArrayValueAtIndex__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValueAtIndex__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValueAtIndex__Group__5"


    // $ANTLR start "rule__RemoveArrayValueAtIndex__Group__5__Impl"
    // InternalAedit.g:6411:1: rule__RemoveArrayValueAtIndex__Group__5__Impl : ( ';' ) ;
    public final void rule__RemoveArrayValueAtIndex__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6415:1: ( ( ';' ) )
            // InternalAedit.g:6416:1: ( ';' )
            {
            // InternalAedit.g:6416:1: ( ';' )
            // InternalAedit.g:6417:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAtIndexAccess().getSemicolonKeyword_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAtIndexAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValueAtIndex__Group__5__Impl"


    // $ANTLR start "rule__AddValueToArray__Group__0"
    // InternalAedit.g:6427:1: rule__AddValueToArray__Group__0 : rule__AddValueToArray__Group__0__Impl rule__AddValueToArray__Group__1 ;
    public final void rule__AddValueToArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6431:1: ( rule__AddValueToArray__Group__0__Impl rule__AddValueToArray__Group__1 )
            // InternalAedit.g:6432:2: rule__AddValueToArray__Group__0__Impl rule__AddValueToArray__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__AddValueToArray__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddValueToArray__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__Group__0"


    // $ANTLR start "rule__AddValueToArray__Group__0__Impl"
    // InternalAedit.g:6439:1: rule__AddValueToArray__Group__0__Impl : ( 'add_value.at' ) ;
    public final void rule__AddValueToArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6443:1: ( ( 'add_value.at' ) )
            // InternalAedit.g:6444:1: ( 'add_value.at' )
            {
            // InternalAedit.g:6444:1: ( 'add_value.at' )
            // InternalAedit.g:6445:2: 'add_value.at'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getAdd_valueAtKeyword_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddValueToArrayAccess().getAdd_valueAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__Group__0__Impl"


    // $ANTLR start "rule__AddValueToArray__Group__1"
    // InternalAedit.g:6454:1: rule__AddValueToArray__Group__1 : rule__AddValueToArray__Group__1__Impl rule__AddValueToArray__Group__2 ;
    public final void rule__AddValueToArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6458:1: ( rule__AddValueToArray__Group__1__Impl rule__AddValueToArray__Group__2 )
            // InternalAedit.g:6459:2: rule__AddValueToArray__Group__1__Impl rule__AddValueToArray__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__AddValueToArray__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddValueToArray__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__Group__1"


    // $ANTLR start "rule__AddValueToArray__Group__1__Impl"
    // InternalAedit.g:6466:1: rule__AddValueToArray__Group__1__Impl : ( '(' ) ;
    public final void rule__AddValueToArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6470:1: ( ( '(' ) )
            // InternalAedit.g:6471:1: ( '(' )
            {
            // InternalAedit.g:6471:1: ( '(' )
            // InternalAedit.g:6472:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddValueToArrayAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__Group__1__Impl"


    // $ANTLR start "rule__AddValueToArray__Group__2"
    // InternalAedit.g:6481:1: rule__AddValueToArray__Group__2 : rule__AddValueToArray__Group__2__Impl rule__AddValueToArray__Group__3 ;
    public final void rule__AddValueToArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6485:1: ( rule__AddValueToArray__Group__2__Impl rule__AddValueToArray__Group__3 )
            // InternalAedit.g:6486:2: rule__AddValueToArray__Group__2__Impl rule__AddValueToArray__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__AddValueToArray__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddValueToArray__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__Group__2"


    // $ANTLR start "rule__AddValueToArray__Group__2__Impl"
    // InternalAedit.g:6493:1: rule__AddValueToArray__Group__2__Impl : ( ( rule__AddValueToArray__IndexAssignment_2 ) ) ;
    public final void rule__AddValueToArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6497:1: ( ( ( rule__AddValueToArray__IndexAssignment_2 ) ) )
            // InternalAedit.g:6498:1: ( ( rule__AddValueToArray__IndexAssignment_2 ) )
            {
            // InternalAedit.g:6498:1: ( ( rule__AddValueToArray__IndexAssignment_2 ) )
            // InternalAedit.g:6499:2: ( rule__AddValueToArray__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getIndexAssignment_2()); 
            }
            // InternalAedit.g:6500:2: ( rule__AddValueToArray__IndexAssignment_2 )
            // InternalAedit.g:6500:3: rule__AddValueToArray__IndexAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddValueToArray__IndexAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddValueToArrayAccess().getIndexAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__Group__2__Impl"


    // $ANTLR start "rule__AddValueToArray__Group__3"
    // InternalAedit.g:6508:1: rule__AddValueToArray__Group__3 : rule__AddValueToArray__Group__3__Impl rule__AddValueToArray__Group__4 ;
    public final void rule__AddValueToArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6512:1: ( rule__AddValueToArray__Group__3__Impl rule__AddValueToArray__Group__4 )
            // InternalAedit.g:6513:2: rule__AddValueToArray__Group__3__Impl rule__AddValueToArray__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__AddValueToArray__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddValueToArray__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__Group__3"


    // $ANTLR start "rule__AddValueToArray__Group__3__Impl"
    // InternalAedit.g:6520:1: rule__AddValueToArray__Group__3__Impl : ( ')' ) ;
    public final void rule__AddValueToArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6524:1: ( ( ')' ) )
            // InternalAedit.g:6525:1: ( ')' )
            {
            // InternalAedit.g:6525:1: ( ')' )
            // InternalAedit.g:6526:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddValueToArrayAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__Group__3__Impl"


    // $ANTLR start "rule__AddValueToArray__Group__4"
    // InternalAedit.g:6535:1: rule__AddValueToArray__Group__4 : rule__AddValueToArray__Group__4__Impl rule__AddValueToArray__Group__5 ;
    public final void rule__AddValueToArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6539:1: ( rule__AddValueToArray__Group__4__Impl rule__AddValueToArray__Group__5 )
            // InternalAedit.g:6540:2: rule__AddValueToArray__Group__4__Impl rule__AddValueToArray__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__AddValueToArray__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddValueToArray__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__Group__4"


    // $ANTLR start "rule__AddValueToArray__Group__4__Impl"
    // InternalAedit.g:6547:1: rule__AddValueToArray__Group__4__Impl : ( ( rule__AddValueToArray__ArrayAssignment_4 ) ) ;
    public final void rule__AddValueToArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6551:1: ( ( ( rule__AddValueToArray__ArrayAssignment_4 ) ) )
            // InternalAedit.g:6552:1: ( ( rule__AddValueToArray__ArrayAssignment_4 ) )
            {
            // InternalAedit.g:6552:1: ( ( rule__AddValueToArray__ArrayAssignment_4 ) )
            // InternalAedit.g:6553:2: ( rule__AddValueToArray__ArrayAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getArrayAssignment_4()); 
            }
            // InternalAedit.g:6554:2: ( rule__AddValueToArray__ArrayAssignment_4 )
            // InternalAedit.g:6554:3: rule__AddValueToArray__ArrayAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AddValueToArray__ArrayAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddValueToArrayAccess().getArrayAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__Group__4__Impl"


    // $ANTLR start "rule__AddValueToArray__Group__5"
    // InternalAedit.g:6562:1: rule__AddValueToArray__Group__5 : rule__AddValueToArray__Group__5__Impl rule__AddValueToArray__Group__6 ;
    public final void rule__AddValueToArray__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6566:1: ( rule__AddValueToArray__Group__5__Impl rule__AddValueToArray__Group__6 )
            // InternalAedit.g:6567:2: rule__AddValueToArray__Group__5__Impl rule__AddValueToArray__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__AddValueToArray__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddValueToArray__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__Group__5"


    // $ANTLR start "rule__AddValueToArray__Group__5__Impl"
    // InternalAedit.g:6574:1: rule__AddValueToArray__Group__5__Impl : ( '=>' ) ;
    public final void rule__AddValueToArray__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6578:1: ( ( '=>' ) )
            // InternalAedit.g:6579:1: ( '=>' )
            {
            // InternalAedit.g:6579:1: ( '=>' )
            // InternalAedit.g:6580:2: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getEqualsSignGreaterThanSignKeyword_5()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddValueToArrayAccess().getEqualsSignGreaterThanSignKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__Group__5__Impl"


    // $ANTLR start "rule__AddValueToArray__Group__6"
    // InternalAedit.g:6589:1: rule__AddValueToArray__Group__6 : rule__AddValueToArray__Group__6__Impl rule__AddValueToArray__Group__7 ;
    public final void rule__AddValueToArray__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6593:1: ( rule__AddValueToArray__Group__6__Impl rule__AddValueToArray__Group__7 )
            // InternalAedit.g:6594:2: rule__AddValueToArray__Group__6__Impl rule__AddValueToArray__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__AddValueToArray__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AddValueToArray__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__Group__6"


    // $ANTLR start "rule__AddValueToArray__Group__6__Impl"
    // InternalAedit.g:6601:1: rule__AddValueToArray__Group__6__Impl : ( ( rule__AddValueToArray__ValueToAddAssignment_6 ) ) ;
    public final void rule__AddValueToArray__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6605:1: ( ( ( rule__AddValueToArray__ValueToAddAssignment_6 ) ) )
            // InternalAedit.g:6606:1: ( ( rule__AddValueToArray__ValueToAddAssignment_6 ) )
            {
            // InternalAedit.g:6606:1: ( ( rule__AddValueToArray__ValueToAddAssignment_6 ) )
            // InternalAedit.g:6607:2: ( rule__AddValueToArray__ValueToAddAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getValueToAddAssignment_6()); 
            }
            // InternalAedit.g:6608:2: ( rule__AddValueToArray__ValueToAddAssignment_6 )
            // InternalAedit.g:6608:3: rule__AddValueToArray__ValueToAddAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__AddValueToArray__ValueToAddAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddValueToArrayAccess().getValueToAddAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__Group__6__Impl"


    // $ANTLR start "rule__AddValueToArray__Group__7"
    // InternalAedit.g:6616:1: rule__AddValueToArray__Group__7 : rule__AddValueToArray__Group__7__Impl ;
    public final void rule__AddValueToArray__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6620:1: ( rule__AddValueToArray__Group__7__Impl )
            // InternalAedit.g:6621:2: rule__AddValueToArray__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddValueToArray__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__Group__7"


    // $ANTLR start "rule__AddValueToArray__Group__7__Impl"
    // InternalAedit.g:6627:1: rule__AddValueToArray__Group__7__Impl : ( ';' ) ;
    public final void rule__AddValueToArray__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6631:1: ( ( ';' ) )
            // InternalAedit.g:6632:1: ( ';' )
            {
            // InternalAedit.g:6632:1: ( ';' )
            // InternalAedit.g:6633:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getSemicolonKeyword_7()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddValueToArrayAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__Group__7__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalAedit.g:6643:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6647:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalAedit.g:6648:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalAedit.g:6655:1: rule__Field__Group__0__Impl : ( ( rule__Field__AnnotationsAssignment_0 )* ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6659:1: ( ( ( rule__Field__AnnotationsAssignment_0 )* ) )
            // InternalAedit.g:6660:1: ( ( rule__Field__AnnotationsAssignment_0 )* )
            {
            // InternalAedit.g:6660:1: ( ( rule__Field__AnnotationsAssignment_0 )* )
            // InternalAedit.g:6661:2: ( rule__Field__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAnnotationsAssignment_0()); 
            }
            // InternalAedit.g:6662:2: ( rule__Field__AnnotationsAssignment_0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==55) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAedit.g:6662:3: rule__Field__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Field__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getAnnotationsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalAedit.g:6670:1: rule__Field__Group__1 : rule__Field__Group__1__Impl ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6674:1: ( rule__Field__Group__1__Impl )
            // InternalAedit.g:6675:2: rule__Field__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalAedit.g:6681:1: rule__Field__Group__1__Impl : ( ( rule__Field__FieldTypeAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6685:1: ( ( ( rule__Field__FieldTypeAssignment_1 ) ) )
            // InternalAedit.g:6686:1: ( ( rule__Field__FieldTypeAssignment_1 ) )
            {
            // InternalAedit.g:6686:1: ( ( rule__Field__FieldTypeAssignment_1 ) )
            // InternalAedit.g:6687:2: ( rule__Field__FieldTypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getFieldTypeAssignment_1()); 
            }
            // InternalAedit.g:6688:2: ( rule__Field__FieldTypeAssignment_1 )
            // InternalAedit.g:6688:3: rule__Field__FieldTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__FieldTypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getFieldTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__CustomTypeField__Group__0"
    // InternalAedit.g:6697:1: rule__CustomTypeField__Group__0 : rule__CustomTypeField__Group__0__Impl rule__CustomTypeField__Group__1 ;
    public final void rule__CustomTypeField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6701:1: ( rule__CustomTypeField__Group__0__Impl rule__CustomTypeField__Group__1 )
            // InternalAedit.g:6702:2: rule__CustomTypeField__Group__0__Impl rule__CustomTypeField__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__CustomTypeField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CustomTypeField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTypeField__Group__0"


    // $ANTLR start "rule__CustomTypeField__Group__0__Impl"
    // InternalAedit.g:6709:1: rule__CustomTypeField__Group__0__Impl : ( ( rule__CustomTypeField__TypeAssignment_0 ) ) ;
    public final void rule__CustomTypeField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6713:1: ( ( ( rule__CustomTypeField__TypeAssignment_0 ) ) )
            // InternalAedit.g:6714:1: ( ( rule__CustomTypeField__TypeAssignment_0 ) )
            {
            // InternalAedit.g:6714:1: ( ( rule__CustomTypeField__TypeAssignment_0 ) )
            // InternalAedit.g:6715:2: ( rule__CustomTypeField__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeFieldAccess().getTypeAssignment_0()); 
            }
            // InternalAedit.g:6716:2: ( rule__CustomTypeField__TypeAssignment_0 )
            // InternalAedit.g:6716:3: rule__CustomTypeField__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CustomTypeField__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeFieldAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTypeField__Group__0__Impl"


    // $ANTLR start "rule__CustomTypeField__Group__1"
    // InternalAedit.g:6724:1: rule__CustomTypeField__Group__1 : rule__CustomTypeField__Group__1__Impl rule__CustomTypeField__Group__2 ;
    public final void rule__CustomTypeField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6728:1: ( rule__CustomTypeField__Group__1__Impl rule__CustomTypeField__Group__2 )
            // InternalAedit.g:6729:2: rule__CustomTypeField__Group__1__Impl rule__CustomTypeField__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__CustomTypeField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CustomTypeField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTypeField__Group__1"


    // $ANTLR start "rule__CustomTypeField__Group__1__Impl"
    // InternalAedit.g:6736:1: rule__CustomTypeField__Group__1__Impl : ( ( rule__CustomTypeField__NameAnnotationsAssignment_1 )* ) ;
    public final void rule__CustomTypeField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6740:1: ( ( ( rule__CustomTypeField__NameAnnotationsAssignment_1 )* ) )
            // InternalAedit.g:6741:1: ( ( rule__CustomTypeField__NameAnnotationsAssignment_1 )* )
            {
            // InternalAedit.g:6741:1: ( ( rule__CustomTypeField__NameAnnotationsAssignment_1 )* )
            // InternalAedit.g:6742:2: ( rule__CustomTypeField__NameAnnotationsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeFieldAccess().getNameAnnotationsAssignment_1()); 
            }
            // InternalAedit.g:6743:2: ( rule__CustomTypeField__NameAnnotationsAssignment_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==55) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAedit.g:6743:3: rule__CustomTypeField__NameAnnotationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__CustomTypeField__NameAnnotationsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeFieldAccess().getNameAnnotationsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTypeField__Group__1__Impl"


    // $ANTLR start "rule__CustomTypeField__Group__2"
    // InternalAedit.g:6751:1: rule__CustomTypeField__Group__2 : rule__CustomTypeField__Group__2__Impl rule__CustomTypeField__Group__3 ;
    public final void rule__CustomTypeField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6755:1: ( rule__CustomTypeField__Group__2__Impl rule__CustomTypeField__Group__3 )
            // InternalAedit.g:6756:2: rule__CustomTypeField__Group__2__Impl rule__CustomTypeField__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__CustomTypeField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CustomTypeField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTypeField__Group__2"


    // $ANTLR start "rule__CustomTypeField__Group__2__Impl"
    // InternalAedit.g:6763:1: rule__CustomTypeField__Group__2__Impl : ( ( rule__CustomTypeField__VarNameAssignment_2 ) ) ;
    public final void rule__CustomTypeField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6767:1: ( ( ( rule__CustomTypeField__VarNameAssignment_2 ) ) )
            // InternalAedit.g:6768:1: ( ( rule__CustomTypeField__VarNameAssignment_2 ) )
            {
            // InternalAedit.g:6768:1: ( ( rule__CustomTypeField__VarNameAssignment_2 ) )
            // InternalAedit.g:6769:2: ( rule__CustomTypeField__VarNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeFieldAccess().getVarNameAssignment_2()); 
            }
            // InternalAedit.g:6770:2: ( rule__CustomTypeField__VarNameAssignment_2 )
            // InternalAedit.g:6770:3: rule__CustomTypeField__VarNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CustomTypeField__VarNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeFieldAccess().getVarNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTypeField__Group__2__Impl"


    // $ANTLR start "rule__CustomTypeField__Group__3"
    // InternalAedit.g:6778:1: rule__CustomTypeField__Group__3 : rule__CustomTypeField__Group__3__Impl ;
    public final void rule__CustomTypeField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6782:1: ( rule__CustomTypeField__Group__3__Impl )
            // InternalAedit.g:6783:2: rule__CustomTypeField__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomTypeField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTypeField__Group__3"


    // $ANTLR start "rule__CustomTypeField__Group__3__Impl"
    // InternalAedit.g:6789:1: rule__CustomTypeField__Group__3__Impl : ( ';' ) ;
    public final void rule__CustomTypeField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6793:1: ( ( ';' ) )
            // InternalAedit.g:6794:1: ( ';' )
            {
            // InternalAedit.g:6794:1: ( ';' )
            // InternalAedit.g:6795:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeFieldAccess().getSemicolonKeyword_3()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeFieldAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTypeField__Group__3__Impl"


    // $ANTLR start "rule__PrimitiveTypeField__Group__0"
    // InternalAedit.g:6805:1: rule__PrimitiveTypeField__Group__0 : rule__PrimitiveTypeField__Group__0__Impl rule__PrimitiveTypeField__Group__1 ;
    public final void rule__PrimitiveTypeField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6809:1: ( rule__PrimitiveTypeField__Group__0__Impl rule__PrimitiveTypeField__Group__1 )
            // InternalAedit.g:6810:2: rule__PrimitiveTypeField__Group__0__Impl rule__PrimitiveTypeField__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__PrimitiveTypeField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__Group__0"


    // $ANTLR start "rule__PrimitiveTypeField__Group__0__Impl"
    // InternalAedit.g:6817:1: rule__PrimitiveTypeField__Group__0__Impl : ( ( rule__PrimitiveTypeField__TypeAssignment_0 ) ) ;
    public final void rule__PrimitiveTypeField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6821:1: ( ( ( rule__PrimitiveTypeField__TypeAssignment_0 ) ) )
            // InternalAedit.g:6822:1: ( ( rule__PrimitiveTypeField__TypeAssignment_0 ) )
            {
            // InternalAedit.g:6822:1: ( ( rule__PrimitiveTypeField__TypeAssignment_0 ) )
            // InternalAedit.g:6823:2: ( rule__PrimitiveTypeField__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldAccess().getTypeAssignment_0()); 
            }
            // InternalAedit.g:6824:2: ( rule__PrimitiveTypeField__TypeAssignment_0 )
            // InternalAedit.g:6824:3: rule__PrimitiveTypeField__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeFieldAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveTypeField__Group__1"
    // InternalAedit.g:6832:1: rule__PrimitiveTypeField__Group__1 : rule__PrimitiveTypeField__Group__1__Impl rule__PrimitiveTypeField__Group__2 ;
    public final void rule__PrimitiveTypeField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6836:1: ( rule__PrimitiveTypeField__Group__1__Impl rule__PrimitiveTypeField__Group__2 )
            // InternalAedit.g:6837:2: rule__PrimitiveTypeField__Group__1__Impl rule__PrimitiveTypeField__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__PrimitiveTypeField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__Group__1"


    // $ANTLR start "rule__PrimitiveTypeField__Group__1__Impl"
    // InternalAedit.g:6844:1: rule__PrimitiveTypeField__Group__1__Impl : ( ( rule__PrimitiveTypeField__NameAnnotationsAssignment_1 )* ) ;
    public final void rule__PrimitiveTypeField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6848:1: ( ( ( rule__PrimitiveTypeField__NameAnnotationsAssignment_1 )* ) )
            // InternalAedit.g:6849:1: ( ( rule__PrimitiveTypeField__NameAnnotationsAssignment_1 )* )
            {
            // InternalAedit.g:6849:1: ( ( rule__PrimitiveTypeField__NameAnnotationsAssignment_1 )* )
            // InternalAedit.g:6850:2: ( rule__PrimitiveTypeField__NameAnnotationsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldAccess().getNameAnnotationsAssignment_1()); 
            }
            // InternalAedit.g:6851:2: ( rule__PrimitiveTypeField__NameAnnotationsAssignment_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==55) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAedit.g:6851:3: rule__PrimitiveTypeField__NameAnnotationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__PrimitiveTypeField__NameAnnotationsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeFieldAccess().getNameAnnotationsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveTypeField__Group__2"
    // InternalAedit.g:6859:1: rule__PrimitiveTypeField__Group__2 : rule__PrimitiveTypeField__Group__2__Impl rule__PrimitiveTypeField__Group__3 ;
    public final void rule__PrimitiveTypeField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6863:1: ( rule__PrimitiveTypeField__Group__2__Impl rule__PrimitiveTypeField__Group__3 )
            // InternalAedit.g:6864:2: rule__PrimitiveTypeField__Group__2__Impl rule__PrimitiveTypeField__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__PrimitiveTypeField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__Group__2"


    // $ANTLR start "rule__PrimitiveTypeField__Group__2__Impl"
    // InternalAedit.g:6871:1: rule__PrimitiveTypeField__Group__2__Impl : ( ( rule__PrimitiveTypeField__VarNameAssignment_2 ) ) ;
    public final void rule__PrimitiveTypeField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6875:1: ( ( ( rule__PrimitiveTypeField__VarNameAssignment_2 ) ) )
            // InternalAedit.g:6876:1: ( ( rule__PrimitiveTypeField__VarNameAssignment_2 ) )
            {
            // InternalAedit.g:6876:1: ( ( rule__PrimitiveTypeField__VarNameAssignment_2 ) )
            // InternalAedit.g:6877:2: ( rule__PrimitiveTypeField__VarNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldAccess().getVarNameAssignment_2()); 
            }
            // InternalAedit.g:6878:2: ( rule__PrimitiveTypeField__VarNameAssignment_2 )
            // InternalAedit.g:6878:3: rule__PrimitiveTypeField__VarNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__VarNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeFieldAccess().getVarNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__Group__2__Impl"


    // $ANTLR start "rule__PrimitiveTypeField__Group__3"
    // InternalAedit.g:6886:1: rule__PrimitiveTypeField__Group__3 : rule__PrimitiveTypeField__Group__3__Impl ;
    public final void rule__PrimitiveTypeField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6890:1: ( rule__PrimitiveTypeField__Group__3__Impl )
            // InternalAedit.g:6891:2: rule__PrimitiveTypeField__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__Group__3"


    // $ANTLR start "rule__PrimitiveTypeField__Group__3__Impl"
    // InternalAedit.g:6897:1: rule__PrimitiveTypeField__Group__3__Impl : ( ( rule__PrimitiveTypeField__Group_3__0 )? ) ;
    public final void rule__PrimitiveTypeField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6901:1: ( ( ( rule__PrimitiveTypeField__Group_3__0 )? ) )
            // InternalAedit.g:6902:1: ( ( rule__PrimitiveTypeField__Group_3__0 )? )
            {
            // InternalAedit.g:6902:1: ( ( rule__PrimitiveTypeField__Group_3__0 )? )
            // InternalAedit.g:6903:2: ( rule__PrimitiveTypeField__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldAccess().getGroup_3()); 
            }
            // InternalAedit.g:6904:2: ( rule__PrimitiveTypeField__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAedit.g:6904:3: rule__PrimitiveTypeField__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveTypeField__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeFieldAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__Group__3__Impl"


    // $ANTLR start "rule__PrimitiveTypeField__Group_3__0"
    // InternalAedit.g:6913:1: rule__PrimitiveTypeField__Group_3__0 : rule__PrimitiveTypeField__Group_3__0__Impl rule__PrimitiveTypeField__Group_3__1 ;
    public final void rule__PrimitiveTypeField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6917:1: ( rule__PrimitiveTypeField__Group_3__0__Impl rule__PrimitiveTypeField__Group_3__1 )
            // InternalAedit.g:6918:2: rule__PrimitiveTypeField__Group_3__0__Impl rule__PrimitiveTypeField__Group_3__1
            {
            pushFollow(FOLLOW_36);
            rule__PrimitiveTypeField__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__Group_3__0"


    // $ANTLR start "rule__PrimitiveTypeField__Group_3__0__Impl"
    // InternalAedit.g:6925:1: rule__PrimitiveTypeField__Group_3__0__Impl : ( '=' ) ;
    public final void rule__PrimitiveTypeField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6929:1: ( ( '=' ) )
            // InternalAedit.g:6930:1: ( '=' )
            {
            // InternalAedit.g:6930:1: ( '=' )
            // InternalAedit.g:6931:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldAccess().getEqualsSignKeyword_3_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeFieldAccess().getEqualsSignKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__Group_3__0__Impl"


    // $ANTLR start "rule__PrimitiveTypeField__Group_3__1"
    // InternalAedit.g:6940:1: rule__PrimitiveTypeField__Group_3__1 : rule__PrimitiveTypeField__Group_3__1__Impl ;
    public final void rule__PrimitiveTypeField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6944:1: ( rule__PrimitiveTypeField__Group_3__1__Impl )
            // InternalAedit.g:6945:2: rule__PrimitiveTypeField__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__Group_3__1"


    // $ANTLR start "rule__PrimitiveTypeField__Group_3__1__Impl"
    // InternalAedit.g:6951:1: rule__PrimitiveTypeField__Group_3__1__Impl : ( ( rule__PrimitiveTypeField__ValueAssignment_3_1 ) ) ;
    public final void rule__PrimitiveTypeField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6955:1: ( ( ( rule__PrimitiveTypeField__ValueAssignment_3_1 ) ) )
            // InternalAedit.g:6956:1: ( ( rule__PrimitiveTypeField__ValueAssignment_3_1 ) )
            {
            // InternalAedit.g:6956:1: ( ( rule__PrimitiveTypeField__ValueAssignment_3_1 ) )
            // InternalAedit.g:6957:2: ( rule__PrimitiveTypeField__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldAccess().getValueAssignment_3_1()); 
            }
            // InternalAedit.g:6958:2: ( rule__PrimitiveTypeField__ValueAssignment_3_1 )
            // InternalAedit.g:6958:3: rule__PrimitiveTypeField__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeFieldAccess().getValueAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__Group_3__1__Impl"


    // $ANTLR start "rule__ComplexTypeField__Group__0"
    // InternalAedit.g:6967:1: rule__ComplexTypeField__Group__0 : rule__ComplexTypeField__Group__0__Impl rule__ComplexTypeField__Group__1 ;
    public final void rule__ComplexTypeField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6971:1: ( rule__ComplexTypeField__Group__0__Impl rule__ComplexTypeField__Group__1 )
            // InternalAedit.g:6972:2: rule__ComplexTypeField__Group__0__Impl rule__ComplexTypeField__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__ComplexTypeField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComplexTypeField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeField__Group__0"


    // $ANTLR start "rule__ComplexTypeField__Group__0__Impl"
    // InternalAedit.g:6979:1: rule__ComplexTypeField__Group__0__Impl : ( ( rule__ComplexTypeField__TypeAssignment_0 ) ) ;
    public final void rule__ComplexTypeField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6983:1: ( ( ( rule__ComplexTypeField__TypeAssignment_0 ) ) )
            // InternalAedit.g:6984:1: ( ( rule__ComplexTypeField__TypeAssignment_0 ) )
            {
            // InternalAedit.g:6984:1: ( ( rule__ComplexTypeField__TypeAssignment_0 ) )
            // InternalAedit.g:6985:2: ( rule__ComplexTypeField__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldAccess().getTypeAssignment_0()); 
            }
            // InternalAedit.g:6986:2: ( rule__ComplexTypeField__TypeAssignment_0 )
            // InternalAedit.g:6986:3: rule__ComplexTypeField__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTypeField__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeFieldAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeField__Group__0__Impl"


    // $ANTLR start "rule__ComplexTypeField__Group__1"
    // InternalAedit.g:6994:1: rule__ComplexTypeField__Group__1 : rule__ComplexTypeField__Group__1__Impl rule__ComplexTypeField__Group__2 ;
    public final void rule__ComplexTypeField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6998:1: ( rule__ComplexTypeField__Group__1__Impl rule__ComplexTypeField__Group__2 )
            // InternalAedit.g:6999:2: rule__ComplexTypeField__Group__1__Impl rule__ComplexTypeField__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__ComplexTypeField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComplexTypeField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeField__Group__1"


    // $ANTLR start "rule__ComplexTypeField__Group__1__Impl"
    // InternalAedit.g:7006:1: rule__ComplexTypeField__Group__1__Impl : ( ( rule__ComplexTypeField__NameAnnotationsAssignment_1 )* ) ;
    public final void rule__ComplexTypeField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7010:1: ( ( ( rule__ComplexTypeField__NameAnnotationsAssignment_1 )* ) )
            // InternalAedit.g:7011:1: ( ( rule__ComplexTypeField__NameAnnotationsAssignment_1 )* )
            {
            // InternalAedit.g:7011:1: ( ( rule__ComplexTypeField__NameAnnotationsAssignment_1 )* )
            // InternalAedit.g:7012:2: ( rule__ComplexTypeField__NameAnnotationsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldAccess().getNameAnnotationsAssignment_1()); 
            }
            // InternalAedit.g:7013:2: ( rule__ComplexTypeField__NameAnnotationsAssignment_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==55) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAedit.g:7013:3: rule__ComplexTypeField__NameAnnotationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__ComplexTypeField__NameAnnotationsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeFieldAccess().getNameAnnotationsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeField__Group__1__Impl"


    // $ANTLR start "rule__ComplexTypeField__Group__2"
    // InternalAedit.g:7021:1: rule__ComplexTypeField__Group__2 : rule__ComplexTypeField__Group__2__Impl rule__ComplexTypeField__Group__3 ;
    public final void rule__ComplexTypeField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7025:1: ( rule__ComplexTypeField__Group__2__Impl rule__ComplexTypeField__Group__3 )
            // InternalAedit.g:7026:2: rule__ComplexTypeField__Group__2__Impl rule__ComplexTypeField__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__ComplexTypeField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComplexTypeField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeField__Group__2"


    // $ANTLR start "rule__ComplexTypeField__Group__2__Impl"
    // InternalAedit.g:7033:1: rule__ComplexTypeField__Group__2__Impl : ( ( rule__ComplexTypeField__VarNameAssignment_2 ) ) ;
    public final void rule__ComplexTypeField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7037:1: ( ( ( rule__ComplexTypeField__VarNameAssignment_2 ) ) )
            // InternalAedit.g:7038:1: ( ( rule__ComplexTypeField__VarNameAssignment_2 ) )
            {
            // InternalAedit.g:7038:1: ( ( rule__ComplexTypeField__VarNameAssignment_2 ) )
            // InternalAedit.g:7039:2: ( rule__ComplexTypeField__VarNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldAccess().getVarNameAssignment_2()); 
            }
            // InternalAedit.g:7040:2: ( rule__ComplexTypeField__VarNameAssignment_2 )
            // InternalAedit.g:7040:3: rule__ComplexTypeField__VarNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTypeField__VarNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeFieldAccess().getVarNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeField__Group__2__Impl"


    // $ANTLR start "rule__ComplexTypeField__Group__3"
    // InternalAedit.g:7048:1: rule__ComplexTypeField__Group__3 : rule__ComplexTypeField__Group__3__Impl ;
    public final void rule__ComplexTypeField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7052:1: ( rule__ComplexTypeField__Group__3__Impl )
            // InternalAedit.g:7053:2: rule__ComplexTypeField__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTypeField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeField__Group__3"


    // $ANTLR start "rule__ComplexTypeField__Group__3__Impl"
    // InternalAedit.g:7059:1: rule__ComplexTypeField__Group__3__Impl : ( ( rule__ComplexTypeField__Group_3__0 )? ) ;
    public final void rule__ComplexTypeField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7063:1: ( ( ( rule__ComplexTypeField__Group_3__0 )? ) )
            // InternalAedit.g:7064:1: ( ( rule__ComplexTypeField__Group_3__0 )? )
            {
            // InternalAedit.g:7064:1: ( ( rule__ComplexTypeField__Group_3__0 )? )
            // InternalAedit.g:7065:2: ( rule__ComplexTypeField__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldAccess().getGroup_3()); 
            }
            // InternalAedit.g:7066:2: ( rule__ComplexTypeField__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==48) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAedit.g:7066:3: rule__ComplexTypeField__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexTypeField__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeFieldAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeField__Group__3__Impl"


    // $ANTLR start "rule__ComplexTypeField__Group_3__0"
    // InternalAedit.g:7075:1: rule__ComplexTypeField__Group_3__0 : rule__ComplexTypeField__Group_3__0__Impl rule__ComplexTypeField__Group_3__1 ;
    public final void rule__ComplexTypeField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7079:1: ( rule__ComplexTypeField__Group_3__0__Impl rule__ComplexTypeField__Group_3__1 )
            // InternalAedit.g:7080:2: rule__ComplexTypeField__Group_3__0__Impl rule__ComplexTypeField__Group_3__1
            {
            pushFollow(FOLLOW_42);
            rule__ComplexTypeField__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComplexTypeField__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeField__Group_3__0"


    // $ANTLR start "rule__ComplexTypeField__Group_3__0__Impl"
    // InternalAedit.g:7087:1: rule__ComplexTypeField__Group_3__0__Impl : ( '=' ) ;
    public final void rule__ComplexTypeField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7091:1: ( ( '=' ) )
            // InternalAedit.g:7092:1: ( '=' )
            {
            // InternalAedit.g:7092:1: ( '=' )
            // InternalAedit.g:7093:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldAccess().getEqualsSignKeyword_3_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeFieldAccess().getEqualsSignKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeField__Group_3__0__Impl"


    // $ANTLR start "rule__ComplexTypeField__Group_3__1"
    // InternalAedit.g:7102:1: rule__ComplexTypeField__Group_3__1 : rule__ComplexTypeField__Group_3__1__Impl ;
    public final void rule__ComplexTypeField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7106:1: ( rule__ComplexTypeField__Group_3__1__Impl )
            // InternalAedit.g:7107:2: rule__ComplexTypeField__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTypeField__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeField__Group_3__1"


    // $ANTLR start "rule__ComplexTypeField__Group_3__1__Impl"
    // InternalAedit.g:7113:1: rule__ComplexTypeField__Group_3__1__Impl : ( ( rule__ComplexTypeField__ValueAssignment_3_1 ) ) ;
    public final void rule__ComplexTypeField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7117:1: ( ( ( rule__ComplexTypeField__ValueAssignment_3_1 ) ) )
            // InternalAedit.g:7118:1: ( ( rule__ComplexTypeField__ValueAssignment_3_1 ) )
            {
            // InternalAedit.g:7118:1: ( ( rule__ComplexTypeField__ValueAssignment_3_1 ) )
            // InternalAedit.g:7119:2: ( rule__ComplexTypeField__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldAccess().getValueAssignment_3_1()); 
            }
            // InternalAedit.g:7120:2: ( rule__ComplexTypeField__ValueAssignment_3_1 )
            // InternalAedit.g:7120:3: rule__ComplexTypeField__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTypeField__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeFieldAccess().getValueAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeField__Group_3__1__Impl"


    // $ANTLR start "rule__ArrayTypeField__Group__0"
    // InternalAedit.g:7129:1: rule__ArrayTypeField__Group__0 : rule__ArrayTypeField__Group__0__Impl rule__ArrayTypeField__Group__1 ;
    public final void rule__ArrayTypeField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7133:1: ( rule__ArrayTypeField__Group__0__Impl rule__ArrayTypeField__Group__1 )
            // InternalAedit.g:7134:2: rule__ArrayTypeField__Group__0__Impl rule__ArrayTypeField__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__ArrayTypeField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayTypeField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTypeField__Group__0"


    // $ANTLR start "rule__ArrayTypeField__Group__0__Impl"
    // InternalAedit.g:7141:1: rule__ArrayTypeField__Group__0__Impl : ( 'array' ) ;
    public final void rule__ArrayTypeField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7145:1: ( ( 'array' ) )
            // InternalAedit.g:7146:1: ( 'array' )
            {
            // InternalAedit.g:7146:1: ( 'array' )
            // InternalAedit.g:7147:2: 'array'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeFieldAccess().getArrayKeyword_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayTypeFieldAccess().getArrayKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTypeField__Group__0__Impl"


    // $ANTLR start "rule__ArrayTypeField__Group__1"
    // InternalAedit.g:7156:1: rule__ArrayTypeField__Group__1 : rule__ArrayTypeField__Group__1__Impl rule__ArrayTypeField__Group__2 ;
    public final void rule__ArrayTypeField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7160:1: ( rule__ArrayTypeField__Group__1__Impl rule__ArrayTypeField__Group__2 )
            // InternalAedit.g:7161:2: rule__ArrayTypeField__Group__1__Impl rule__ArrayTypeField__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__ArrayTypeField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayTypeField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTypeField__Group__1"


    // $ANTLR start "rule__ArrayTypeField__Group__1__Impl"
    // InternalAedit.g:7168:1: rule__ArrayTypeField__Group__1__Impl : ( '<' ) ;
    public final void rule__ArrayTypeField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7172:1: ( ( '<' ) )
            // InternalAedit.g:7173:1: ( '<' )
            {
            // InternalAedit.g:7173:1: ( '<' )
            // InternalAedit.g:7174:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeFieldAccess().getLessThanSignKeyword_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayTypeFieldAccess().getLessThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTypeField__Group__1__Impl"


    // $ANTLR start "rule__ArrayTypeField__Group__2"
    // InternalAedit.g:7183:1: rule__ArrayTypeField__Group__2 : rule__ArrayTypeField__Group__2__Impl rule__ArrayTypeField__Group__3 ;
    public final void rule__ArrayTypeField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7187:1: ( rule__ArrayTypeField__Group__2__Impl rule__ArrayTypeField__Group__3 )
            // InternalAedit.g:7188:2: rule__ArrayTypeField__Group__2__Impl rule__ArrayTypeField__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__ArrayTypeField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayTypeField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTypeField__Group__2"


    // $ANTLR start "rule__ArrayTypeField__Group__2__Impl"
    // InternalAedit.g:7195:1: rule__ArrayTypeField__Group__2__Impl : ( ( rule__ArrayTypeField__TypeAssignment_2 ) ) ;
    public final void rule__ArrayTypeField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7199:1: ( ( ( rule__ArrayTypeField__TypeAssignment_2 ) ) )
            // InternalAedit.g:7200:1: ( ( rule__ArrayTypeField__TypeAssignment_2 ) )
            {
            // InternalAedit.g:7200:1: ( ( rule__ArrayTypeField__TypeAssignment_2 ) )
            // InternalAedit.g:7201:2: ( rule__ArrayTypeField__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeFieldAccess().getTypeAssignment_2()); 
            }
            // InternalAedit.g:7202:2: ( rule__ArrayTypeField__TypeAssignment_2 )
            // InternalAedit.g:7202:3: rule__ArrayTypeField__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ArrayTypeField__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayTypeFieldAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTypeField__Group__2__Impl"


    // $ANTLR start "rule__ArrayTypeField__Group__3"
    // InternalAedit.g:7210:1: rule__ArrayTypeField__Group__3 : rule__ArrayTypeField__Group__3__Impl ;
    public final void rule__ArrayTypeField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7214:1: ( rule__ArrayTypeField__Group__3__Impl )
            // InternalAedit.g:7215:2: rule__ArrayTypeField__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayTypeField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTypeField__Group__3"


    // $ANTLR start "rule__ArrayTypeField__Group__3__Impl"
    // InternalAedit.g:7221:1: rule__ArrayTypeField__Group__3__Impl : ( '>' ) ;
    public final void rule__ArrayTypeField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7225:1: ( ( '>' ) )
            // InternalAedit.g:7226:1: ( '>' )
            {
            // InternalAedit.g:7226:1: ( '>' )
            // InternalAedit.g:7227:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeFieldAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayTypeFieldAccess().getGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTypeField__Group__3__Impl"


    // $ANTLR start "rule__AnnotatedTypes__Group__0"
    // InternalAedit.g:7237:1: rule__AnnotatedTypes__Group__0 : rule__AnnotatedTypes__Group__0__Impl rule__AnnotatedTypes__Group__1 ;
    public final void rule__AnnotatedTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7241:1: ( rule__AnnotatedTypes__Group__0__Impl rule__AnnotatedTypes__Group__1 )
            // InternalAedit.g:7242:2: rule__AnnotatedTypes__Group__0__Impl rule__AnnotatedTypes__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__AnnotatedTypes__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AnnotatedTypes__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotatedTypes__Group__0"


    // $ANTLR start "rule__AnnotatedTypes__Group__0__Impl"
    // InternalAedit.g:7249:1: rule__AnnotatedTypes__Group__0__Impl : ( ( rule__AnnotatedTypes__AnnotataionsAssignment_0 )* ) ;
    public final void rule__AnnotatedTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7253:1: ( ( ( rule__AnnotatedTypes__AnnotataionsAssignment_0 )* ) )
            // InternalAedit.g:7254:1: ( ( rule__AnnotatedTypes__AnnotataionsAssignment_0 )* )
            {
            // InternalAedit.g:7254:1: ( ( rule__AnnotatedTypes__AnnotataionsAssignment_0 )* )
            // InternalAedit.g:7255:2: ( rule__AnnotatedTypes__AnnotataionsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotatedTypesAccess().getAnnotataionsAssignment_0()); 
            }
            // InternalAedit.g:7256:2: ( rule__AnnotatedTypes__AnnotataionsAssignment_0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==55) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAedit.g:7256:3: rule__AnnotatedTypes__AnnotataionsAssignment_0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__AnnotatedTypes__AnnotataionsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotatedTypesAccess().getAnnotataionsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotatedTypes__Group__0__Impl"


    // $ANTLR start "rule__AnnotatedTypes__Group__1"
    // InternalAedit.g:7264:1: rule__AnnotatedTypes__Group__1 : rule__AnnotatedTypes__Group__1__Impl ;
    public final void rule__AnnotatedTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7268:1: ( rule__AnnotatedTypes__Group__1__Impl )
            // InternalAedit.g:7269:2: rule__AnnotatedTypes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnnotatedTypes__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotatedTypes__Group__1"


    // $ANTLR start "rule__AnnotatedTypes__Group__1__Impl"
    // InternalAedit.g:7275:1: rule__AnnotatedTypes__Group__1__Impl : ( ( rule__AnnotatedTypes__TypeAssignment_1 ) ) ;
    public final void rule__AnnotatedTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7279:1: ( ( ( rule__AnnotatedTypes__TypeAssignment_1 ) ) )
            // InternalAedit.g:7280:1: ( ( rule__AnnotatedTypes__TypeAssignment_1 ) )
            {
            // InternalAedit.g:7280:1: ( ( rule__AnnotatedTypes__TypeAssignment_1 ) )
            // InternalAedit.g:7281:2: ( rule__AnnotatedTypes__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotatedTypesAccess().getTypeAssignment_1()); 
            }
            // InternalAedit.g:7282:2: ( rule__AnnotatedTypes__TypeAssignment_1 )
            // InternalAedit.g:7282:3: rule__AnnotatedTypes__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AnnotatedTypes__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotatedTypesAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotatedTypes__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // InternalAedit.g:7291:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7295:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalAedit.g:7296:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Annotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // InternalAedit.g:7303:1: rule__Annotation__Group__0__Impl : ( ( rule__Annotation__NameAssignment_0 ) ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7307:1: ( ( ( rule__Annotation__NameAssignment_0 ) ) )
            // InternalAedit.g:7308:1: ( ( rule__Annotation__NameAssignment_0 ) )
            {
            // InternalAedit.g:7308:1: ( ( rule__Annotation__NameAssignment_0 ) )
            // InternalAedit.g:7309:2: ( rule__Annotation__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameAssignment_0()); 
            }
            // InternalAedit.g:7310:2: ( rule__Annotation__NameAssignment_0 )
            // InternalAedit.g:7310:3: rule__Annotation__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // InternalAedit.g:7318:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7322:1: ( rule__Annotation__Group__1__Impl )
            // InternalAedit.g:7323:2: rule__Annotation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // InternalAedit.g:7329:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__Group_1__0 )? ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7333:1: ( ( ( rule__Annotation__Group_1__0 )? ) )
            // InternalAedit.g:7334:1: ( ( rule__Annotation__Group_1__0 )? )
            {
            // InternalAedit.g:7334:1: ( ( rule__Annotation__Group_1__0 )? )
            // InternalAedit.g:7335:2: ( rule__Annotation__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_1()); 
            }
            // InternalAedit.g:7336:2: ( rule__Annotation__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==37) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAedit.g:7336:3: rule__Annotation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Annotation__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group_1__0"
    // InternalAedit.g:7345:1: rule__Annotation__Group_1__0 : rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1 ;
    public final void rule__Annotation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7349:1: ( rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1 )
            // InternalAedit.g:7350:2: rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Annotation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Annotation__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_1__0"


    // $ANTLR start "rule__Annotation__Group_1__0__Impl"
    // InternalAedit.g:7357:1: rule__Annotation__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Annotation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7361:1: ( ( '(' ) )
            // InternalAedit.g:7362:1: ( '(' )
            {
            // InternalAedit.g:7362:1: ( '(' )
            // InternalAedit.g:7363:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_1__0__Impl"


    // $ANTLR start "rule__Annotation__Group_1__1"
    // InternalAedit.g:7372:1: rule__Annotation__Group_1__1 : rule__Annotation__Group_1__1__Impl rule__Annotation__Group_1__2 ;
    public final void rule__Annotation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7376:1: ( rule__Annotation__Group_1__1__Impl rule__Annotation__Group_1__2 )
            // InternalAedit.g:7377:2: rule__Annotation__Group_1__1__Impl rule__Annotation__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__Annotation__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Annotation__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_1__1"


    // $ANTLR start "rule__Annotation__Group_1__1__Impl"
    // InternalAedit.g:7384:1: rule__Annotation__Group_1__1__Impl : ( ( rule__Annotation__ValuesAssignment_1_1 ) ) ;
    public final void rule__Annotation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7388:1: ( ( ( rule__Annotation__ValuesAssignment_1_1 ) ) )
            // InternalAedit.g:7389:1: ( ( rule__Annotation__ValuesAssignment_1_1 ) )
            {
            // InternalAedit.g:7389:1: ( ( rule__Annotation__ValuesAssignment_1_1 ) )
            // InternalAedit.g:7390:2: ( rule__Annotation__ValuesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getValuesAssignment_1_1()); 
            }
            // InternalAedit.g:7391:2: ( rule__Annotation__ValuesAssignment_1_1 )
            // InternalAedit.g:7391:3: rule__Annotation__ValuesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__ValuesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getValuesAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_1__1__Impl"


    // $ANTLR start "rule__Annotation__Group_1__2"
    // InternalAedit.g:7399:1: rule__Annotation__Group_1__2 : rule__Annotation__Group_1__2__Impl ;
    public final void rule__Annotation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7403:1: ( rule__Annotation__Group_1__2__Impl )
            // InternalAedit.g:7404:2: rule__Annotation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_1__2"


    // $ANTLR start "rule__Annotation__Group_1__2__Impl"
    // InternalAedit.g:7410:1: rule__Annotation__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Annotation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7414:1: ( ( ')' ) )
            // InternalAedit.g:7415:1: ( ')' )
            {
            // InternalAedit.g:7415:1: ( ')' )
            // InternalAedit.g:7416:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_1__2__Impl"


    // $ANTLR start "rule__Values__Group__0"
    // InternalAedit.g:7426:1: rule__Values__Group__0 : rule__Values__Group__0__Impl rule__Values__Group__1 ;
    public final void rule__Values__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7430:1: ( rule__Values__Group__0__Impl rule__Values__Group__1 )
            // InternalAedit.g:7431:2: rule__Values__Group__0__Impl rule__Values__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Values__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Values__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__0"


    // $ANTLR start "rule__Values__Group__0__Impl"
    // InternalAedit.g:7438:1: rule__Values__Group__0__Impl : ( () ) ;
    public final void rule__Values__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7442:1: ( ( () ) )
            // InternalAedit.g:7443:1: ( () )
            {
            // InternalAedit.g:7443:1: ( () )
            // InternalAedit.g:7444:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValuesAction_0()); 
            }
            // InternalAedit.g:7445:2: ()
            // InternalAedit.g:7445:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getValuesAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__0__Impl"


    // $ANTLR start "rule__Values__Group__1"
    // InternalAedit.g:7453:1: rule__Values__Group__1 : rule__Values__Group__1__Impl ;
    public final void rule__Values__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7457:1: ( rule__Values__Group__1__Impl )
            // InternalAedit.g:7458:2: rule__Values__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__1"


    // $ANTLR start "rule__Values__Group__1__Impl"
    // InternalAedit.g:7464:1: rule__Values__Group__1__Impl : ( ( rule__Values__Alternatives_1 )* ) ;
    public final void rule__Values__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7468:1: ( ( ( rule__Values__Alternatives_1 )* ) )
            // InternalAedit.g:7469:1: ( ( rule__Values__Alternatives_1 )* )
            {
            // InternalAedit.g:7469:1: ( ( rule__Values__Alternatives_1 )* )
            // InternalAedit.g:7470:2: ( rule__Values__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getAlternatives_1()); 
            }
            // InternalAedit.g:7471:2: ( rule__Values__Alternatives_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_INT && LA37_0<=RULE_ID)||(LA37_0>=13 && LA37_0<=14)||LA37_0==52||LA37_0==54||LA37_0==56) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAedit.g:7471:3: rule__Values__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__Values__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group__1__Impl"


    // $ANTLR start "rule__Values__Group_1_1__0"
    // InternalAedit.g:7480:1: rule__Values__Group_1_1__0 : rule__Values__Group_1_1__0__Impl rule__Values__Group_1_1__1 ;
    public final void rule__Values__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7484:1: ( rule__Values__Group_1_1__0__Impl rule__Values__Group_1_1__1 )
            // InternalAedit.g:7485:2: rule__Values__Group_1_1__0__Impl rule__Values__Group_1_1__1
            {
            pushFollow(FOLLOW_46);
            rule__Values__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Values__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_1_1__0"


    // $ANTLR start "rule__Values__Group_1_1__0__Impl"
    // InternalAedit.g:7492:1: rule__Values__Group_1_1__0__Impl : ( ( rule__Values__ValueAssignment_1_1_0 ) ) ;
    public final void rule__Values__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7496:1: ( ( ( rule__Values__ValueAssignment_1_1_0 ) ) )
            // InternalAedit.g:7497:1: ( ( rule__Values__ValueAssignment_1_1_0 ) )
            {
            // InternalAedit.g:7497:1: ( ( rule__Values__ValueAssignment_1_1_0 ) )
            // InternalAedit.g:7498:2: ( rule__Values__ValueAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValueAssignment_1_1_0()); 
            }
            // InternalAedit.g:7499:2: ( rule__Values__ValueAssignment_1_1_0 )
            // InternalAedit.g:7499:3: rule__Values__ValueAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Values__ValueAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getValueAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_1_1__0__Impl"


    // $ANTLR start "rule__Values__Group_1_1__1"
    // InternalAedit.g:7507:1: rule__Values__Group_1_1__1 : rule__Values__Group_1_1__1__Impl ;
    public final void rule__Values__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7511:1: ( rule__Values__Group_1_1__1__Impl )
            // InternalAedit.g:7512:2: rule__Values__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_1_1__1"


    // $ANTLR start "rule__Values__Group_1_1__1__Impl"
    // InternalAedit.g:7518:1: rule__Values__Group_1_1__1__Impl : ( ( rule__Values__Group_1_1_1__0 )* ) ;
    public final void rule__Values__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7522:1: ( ( ( rule__Values__Group_1_1_1__0 )* ) )
            // InternalAedit.g:7523:1: ( ( rule__Values__Group_1_1_1__0 )* )
            {
            // InternalAedit.g:7523:1: ( ( rule__Values__Group_1_1_1__0 )* )
            // InternalAedit.g:7524:2: ( rule__Values__Group_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getGroup_1_1_1()); 
            }
            // InternalAedit.g:7525:2: ( rule__Values__Group_1_1_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==40) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAedit.g:7525:3: rule__Values__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Values__Group_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getGroup_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_1_1__1__Impl"


    // $ANTLR start "rule__Values__Group_1_1_1__0"
    // InternalAedit.g:7534:1: rule__Values__Group_1_1_1__0 : rule__Values__Group_1_1_1__0__Impl rule__Values__Group_1_1_1__1 ;
    public final void rule__Values__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7538:1: ( rule__Values__Group_1_1_1__0__Impl rule__Values__Group_1_1_1__1 )
            // InternalAedit.g:7539:2: rule__Values__Group_1_1_1__0__Impl rule__Values__Group_1_1_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Values__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Values__Group_1_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_1_1_1__0"


    // $ANTLR start "rule__Values__Group_1_1_1__0__Impl"
    // InternalAedit.g:7546:1: rule__Values__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__Values__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7550:1: ( ( ',' ) )
            // InternalAedit.g:7551:1: ( ',' )
            {
            // InternalAedit.g:7551:1: ( ',' )
            // InternalAedit.g:7552:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getCommaKeyword_1_1_1_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getCommaKeyword_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Values__Group_1_1_1__1"
    // InternalAedit.g:7561:1: rule__Values__Group_1_1_1__1 : rule__Values__Group_1_1_1__1__Impl ;
    public final void rule__Values__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7565:1: ( rule__Values__Group_1_1_1__1__Impl )
            // InternalAedit.g:7566:2: rule__Values__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Values__Group_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_1_1_1__1"


    // $ANTLR start "rule__Values__Group_1_1_1__1__Impl"
    // InternalAedit.g:7572:1: rule__Values__Group_1_1_1__1__Impl : ( ( rule__Values__ValueAssignment_1_1_1_1 ) ) ;
    public final void rule__Values__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7576:1: ( ( ( rule__Values__ValueAssignment_1_1_1_1 ) ) )
            // InternalAedit.g:7577:1: ( ( rule__Values__ValueAssignment_1_1_1_1 ) )
            {
            // InternalAedit.g:7577:1: ( ( rule__Values__ValueAssignment_1_1_1_1 ) )
            // InternalAedit.g:7578:2: ( rule__Values__ValueAssignment_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValueAssignment_1_1_1_1()); 
            }
            // InternalAedit.g:7579:2: ( rule__Values__ValueAssignment_1_1_1_1 )
            // InternalAedit.g:7579:3: rule__Values__ValueAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Values__ValueAssignment_1_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getValueAssignment_1_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Array__Group__0"
    // InternalAedit.g:7588:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7592:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // InternalAedit.g:7593:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Array__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Array__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__0"


    // $ANTLR start "rule__Array__Group__0__Impl"
    // InternalAedit.g:7600:1: rule__Array__Group__0__Impl : ( ( '[' ) ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7604:1: ( ( ( '[' ) ) )
            // InternalAedit.g:7605:1: ( ( '[' ) )
            {
            // InternalAedit.g:7605:1: ( ( '[' ) )
            // InternalAedit.g:7606:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0()); 
            }
            // InternalAedit.g:7607:2: ( '[' )
            // InternalAedit.g:7607:3: '['
            {
            match(input,52,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__0__Impl"


    // $ANTLR start "rule__Array__Group__1"
    // InternalAedit.g:7615:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7619:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // InternalAedit.g:7620:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__Array__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Array__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__1"


    // $ANTLR start "rule__Array__Group__1__Impl"
    // InternalAedit.g:7627:1: rule__Array__Group__1__Impl : ( ( rule__Array__ValuesAssignment_1 ) ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7631:1: ( ( ( rule__Array__ValuesAssignment_1 ) ) )
            // InternalAedit.g:7632:1: ( ( rule__Array__ValuesAssignment_1 ) )
            {
            // InternalAedit.g:7632:1: ( ( rule__Array__ValuesAssignment_1 ) )
            // InternalAedit.g:7633:2: ( rule__Array__ValuesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getValuesAssignment_1()); 
            }
            // InternalAedit.g:7634:2: ( rule__Array__ValuesAssignment_1 )
            // InternalAedit.g:7634:3: rule__Array__ValuesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Array__ValuesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getValuesAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__1__Impl"


    // $ANTLR start "rule__Array__Group__2"
    // InternalAedit.g:7642:1: rule__Array__Group__2 : rule__Array__Group__2__Impl ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7646:1: ( rule__Array__Group__2__Impl )
            // InternalAedit.g:7647:2: rule__Array__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__2"


    // $ANTLR start "rule__Array__Group__2__Impl"
    // InternalAedit.g:7653:1: rule__Array__Group__2__Impl : ( ']' ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7657:1: ( ( ']' ) )
            // InternalAedit.g:7658:1: ( ']' )
            {
            // InternalAedit.g:7658:1: ( ']' )
            // InternalAedit.g:7659:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__2__Impl"


    // $ANTLR start "rule__Real__Group__0"
    // InternalAedit.g:7669:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7673:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // InternalAedit.g:7674:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Real__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Real__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__0"


    // $ANTLR start "rule__Real__Group__0__Impl"
    // InternalAedit.g:7681:1: rule__Real__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7685:1: ( ( ( '-' )? ) )
            // InternalAedit.g:7686:1: ( ( '-' )? )
            {
            // InternalAedit.g:7686:1: ( ( '-' )? )
            // InternalAedit.g:7687:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalAedit.g:7688:2: ( '-' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==54) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAedit.g:7688:3: '-'
                    {
                    match(input,54,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__0__Impl"


    // $ANTLR start "rule__Real__Group__1"
    // InternalAedit.g:7696:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7700:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // InternalAedit.g:7701:2: rule__Real__Group__1__Impl rule__Real__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Real__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Real__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__1"


    // $ANTLR start "rule__Real__Group__1__Impl"
    // InternalAedit.g:7708:1: rule__Real__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7712:1: ( ( RULE_INT ) )
            // InternalAedit.g:7713:1: ( RULE_INT )
            {
            // InternalAedit.g:7713:1: ( RULE_INT )
            // InternalAedit.g:7714:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__1__Impl"


    // $ANTLR start "rule__Real__Group__2"
    // InternalAedit.g:7723:1: rule__Real__Group__2 : rule__Real__Group__2__Impl rule__Real__Group__3 ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7727:1: ( rule__Real__Group__2__Impl rule__Real__Group__3 )
            // InternalAedit.g:7728:2: rule__Real__Group__2__Impl rule__Real__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Real__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Real__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__2"


    // $ANTLR start "rule__Real__Group__2__Impl"
    // InternalAedit.g:7735:1: rule__Real__Group__2__Impl : ( '.' ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7739:1: ( ( '.' ) )
            // InternalAedit.g:7740:1: ( '.' )
            {
            // InternalAedit.g:7740:1: ( '.' )
            // InternalAedit.g:7741:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getFullStopKeyword_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealAccess().getFullStopKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__2__Impl"


    // $ANTLR start "rule__Real__Group__3"
    // InternalAedit.g:7750:1: rule__Real__Group__3 : rule__Real__Group__3__Impl ;
    public final void rule__Real__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7754:1: ( rule__Real__Group__3__Impl )
            // InternalAedit.g:7755:2: rule__Real__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__3"


    // $ANTLR start "rule__Real__Group__3__Impl"
    // InternalAedit.g:7761:1: rule__Real__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7765:1: ( ( RULE_INT ) )
            // InternalAedit.g:7766:1: ( RULE_INT )
            {
            // InternalAedit.g:7766:1: ( RULE_INT )
            // InternalAedit.g:7767:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getINTTerminalRuleCall_3()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealAccess().getINTTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__3__Impl"


    // $ANTLR start "rule__NegativeInt__Group__0"
    // InternalAedit.g:7777:1: rule__NegativeInt__Group__0 : rule__NegativeInt__Group__0__Impl rule__NegativeInt__Group__1 ;
    public final void rule__NegativeInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7781:1: ( rule__NegativeInt__Group__0__Impl rule__NegativeInt__Group__1 )
            // InternalAedit.g:7782:2: rule__NegativeInt__Group__0__Impl rule__NegativeInt__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__NegativeInt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NegativeInt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeInt__Group__0"


    // $ANTLR start "rule__NegativeInt__Group__0__Impl"
    // InternalAedit.g:7789:1: rule__NegativeInt__Group__0__Impl : ( '-' ) ;
    public final void rule__NegativeInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7793:1: ( ( '-' ) )
            // InternalAedit.g:7794:1: ( '-' )
            {
            // InternalAedit.g:7794:1: ( '-' )
            // InternalAedit.g:7795:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeIntAccess().getHyphenMinusKeyword_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeIntAccess().getHyphenMinusKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeInt__Group__0__Impl"


    // $ANTLR start "rule__NegativeInt__Group__1"
    // InternalAedit.g:7804:1: rule__NegativeInt__Group__1 : rule__NegativeInt__Group__1__Impl ;
    public final void rule__NegativeInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7808:1: ( rule__NegativeInt__Group__1__Impl )
            // InternalAedit.g:7809:2: rule__NegativeInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NegativeInt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeInt__Group__1"


    // $ANTLR start "rule__NegativeInt__Group__1__Impl"
    // InternalAedit.g:7815:1: rule__NegativeInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__NegativeInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7819:1: ( ( RULE_INT ) )
            // InternalAedit.g:7820:1: ( RULE_INT )
            {
            // InternalAedit.g:7820:1: ( RULE_INT )
            // InternalAedit.g:7821:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeIntAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegativeIntAccess().getINTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegativeInt__Group__1__Impl"


    // $ANTLR start "rule__QN__Group__0"
    // InternalAedit.g:7831:1: rule__QN__Group__0 : rule__QN__Group__0__Impl rule__QN__Group__1 ;
    public final void rule__QN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7835:1: ( rule__QN__Group__0__Impl rule__QN__Group__1 )
            // InternalAedit.g:7836:2: rule__QN__Group__0__Impl rule__QN__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__QN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QN__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QN__Group__0"


    // $ANTLR start "rule__QN__Group__0__Impl"
    // InternalAedit.g:7843:1: rule__QN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7847:1: ( ( RULE_ID ) )
            // InternalAedit.g:7848:1: ( RULE_ID )
            {
            // InternalAedit.g:7848:1: ( RULE_ID )
            // InternalAedit.g:7849:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQNAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QN__Group__0__Impl"


    // $ANTLR start "rule__QN__Group__1"
    // InternalAedit.g:7858:1: rule__QN__Group__1 : rule__QN__Group__1__Impl ;
    public final void rule__QN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7862:1: ( rule__QN__Group__1__Impl )
            // InternalAedit.g:7863:2: rule__QN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QN__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QN__Group__1"


    // $ANTLR start "rule__QN__Group__1__Impl"
    // InternalAedit.g:7869:1: rule__QN__Group__1__Impl : ( ( rule__QN__Group_1__0 )* ) ;
    public final void rule__QN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7873:1: ( ( ( rule__QN__Group_1__0 )* ) )
            // InternalAedit.g:7874:1: ( ( rule__QN__Group_1__0 )* )
            {
            // InternalAedit.g:7874:1: ( ( rule__QN__Group_1__0 )* )
            // InternalAedit.g:7875:2: ( rule__QN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQNAccess().getGroup_1()); 
            }
            // InternalAedit.g:7876:2: ( rule__QN__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==39) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAedit.g:7876:3: rule__QN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__QN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQNAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QN__Group__1__Impl"


    // $ANTLR start "rule__QN__Group_1__0"
    // InternalAedit.g:7885:1: rule__QN__Group_1__0 : rule__QN__Group_1__0__Impl rule__QN__Group_1__1 ;
    public final void rule__QN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7889:1: ( rule__QN__Group_1__0__Impl rule__QN__Group_1__1 )
            // InternalAedit.g:7890:2: rule__QN__Group_1__0__Impl rule__QN__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__QN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QN__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QN__Group_1__0"


    // $ANTLR start "rule__QN__Group_1__0__Impl"
    // InternalAedit.g:7897:1: rule__QN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7901:1: ( ( '.' ) )
            // InternalAedit.g:7902:1: ( '.' )
            {
            // InternalAedit.g:7902:1: ( '.' )
            // InternalAedit.g:7903:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQNAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QN__Group_1__0__Impl"


    // $ANTLR start "rule__QN__Group_1__1"
    // InternalAedit.g:7912:1: rule__QN__Group_1__1 : rule__QN__Group_1__1__Impl ;
    public final void rule__QN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7916:1: ( rule__QN__Group_1__1__Impl )
            // InternalAedit.g:7917:2: rule__QN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QN__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QN__Group_1__1"


    // $ANTLR start "rule__QN__Group_1__1__Impl"
    // InternalAedit.g:7923:1: rule__QN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7927:1: ( ( RULE_ID ) )
            // InternalAedit.g:7928:1: ( RULE_ID )
            {
            // InternalAedit.g:7928:1: ( RULE_ID )
            // InternalAedit.g:7929:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQNAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QN__Group_1__1__Impl"


    // $ANTLR start "rule__AN__Group__0"
    // InternalAedit.g:7939:1: rule__AN__Group__0 : rule__AN__Group__0__Impl rule__AN__Group__1 ;
    public final void rule__AN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7943:1: ( rule__AN__Group__0__Impl rule__AN__Group__1 )
            // InternalAedit.g:7944:2: rule__AN__Group__0__Impl rule__AN__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AN__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group__0"


    // $ANTLR start "rule__AN__Group__0__Impl"
    // InternalAedit.g:7951:1: rule__AN__Group__0__Impl : ( '@' ) ;
    public final void rule__AN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7955:1: ( ( '@' ) )
            // InternalAedit.g:7956:1: ( '@' )
            {
            // InternalAedit.g:7956:1: ( '@' )
            // InternalAedit.g:7957:2: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getCommercialAtKeyword_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group__0__Impl"


    // $ANTLR start "rule__AN__Group__1"
    // InternalAedit.g:7966:1: rule__AN__Group__1 : rule__AN__Group__1__Impl rule__AN__Group__2 ;
    public final void rule__AN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7970:1: ( rule__AN__Group__1__Impl rule__AN__Group__2 )
            // InternalAedit.g:7971:2: rule__AN__Group__1__Impl rule__AN__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__AN__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AN__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group__1"


    // $ANTLR start "rule__AN__Group__1__Impl"
    // InternalAedit.g:7978:1: rule__AN__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__AN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7982:1: ( ( RULE_ID ) )
            // InternalAedit.g:7983:1: ( RULE_ID )
            {
            // InternalAedit.g:7983:1: ( RULE_ID )
            // InternalAedit.g:7984:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANAccess().getIDTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group__1__Impl"


    // $ANTLR start "rule__AN__Group__2"
    // InternalAedit.g:7993:1: rule__AN__Group__2 : rule__AN__Group__2__Impl ;
    public final void rule__AN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7997:1: ( rule__AN__Group__2__Impl )
            // InternalAedit.g:7998:2: rule__AN__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AN__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group__2"


    // $ANTLR start "rule__AN__Group__2__Impl"
    // InternalAedit.g:8004:1: rule__AN__Group__2__Impl : ( ( rule__AN__Group_2__0 )* ) ;
    public final void rule__AN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8008:1: ( ( ( rule__AN__Group_2__0 )* ) )
            // InternalAedit.g:8009:1: ( ( rule__AN__Group_2__0 )* )
            {
            // InternalAedit.g:8009:1: ( ( rule__AN__Group_2__0 )* )
            // InternalAedit.g:8010:2: ( rule__AN__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getGroup_2()); 
            }
            // InternalAedit.g:8011:2: ( rule__AN__Group_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==54) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAedit.g:8011:3: rule__AN__Group_2__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__AN__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getANAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group__2__Impl"


    // $ANTLR start "rule__AN__Group_2__0"
    // InternalAedit.g:8020:1: rule__AN__Group_2__0 : rule__AN__Group_2__0__Impl rule__AN__Group_2__1 ;
    public final void rule__AN__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8024:1: ( rule__AN__Group_2__0__Impl rule__AN__Group_2__1 )
            // InternalAedit.g:8025:2: rule__AN__Group_2__0__Impl rule__AN__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__AN__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AN__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group_2__0"


    // $ANTLR start "rule__AN__Group_2__0__Impl"
    // InternalAedit.g:8032:1: rule__AN__Group_2__0__Impl : ( '-' ) ;
    public final void rule__AN__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8036:1: ( ( '-' ) )
            // InternalAedit.g:8037:1: ( '-' )
            {
            // InternalAedit.g:8037:1: ( '-' )
            // InternalAedit.g:8038:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getHyphenMinusKeyword_2_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANAccess().getHyphenMinusKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group_2__0__Impl"


    // $ANTLR start "rule__AN__Group_2__1"
    // InternalAedit.g:8047:1: rule__AN__Group_2__1 : rule__AN__Group_2__1__Impl ;
    public final void rule__AN__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8051:1: ( rule__AN__Group_2__1__Impl )
            // InternalAedit.g:8052:2: rule__AN__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AN__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group_2__1"


    // $ANTLR start "rule__AN__Group_2__1__Impl"
    // InternalAedit.g:8058:1: rule__AN__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__AN__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8062:1: ( ( RULE_ID ) )
            // InternalAedit.g:8063:1: ( RULE_ID )
            {
            // InternalAedit.g:8063:1: ( RULE_ID )
            // InternalAedit.g:8064:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getIDTerminalRuleCall_2_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getANAccess().getIDTerminalRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AN__Group_2__1__Impl"


    // $ANTLR start "rule__Model__RuleDeclarationsAssignment_0"
    // InternalAedit.g:8074:1: rule__Model__RuleDeclarationsAssignment_0 : ( ruleRuleDeclaration ) ;
    public final void rule__Model__RuleDeclarationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8078:1: ( ( ruleRuleDeclaration ) )
            // InternalAedit.g:8079:2: ( ruleRuleDeclaration )
            {
            // InternalAedit.g:8079:2: ( ruleRuleDeclaration )
            // InternalAedit.g:8080:3: ruleRuleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRuleDeclarationsRuleDeclarationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRuleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRuleDeclarationsRuleDeclarationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RuleDeclarationsAssignment_0"


    // $ANTLR start "rule__Model__RuleMapsAssignment_1"
    // InternalAedit.g:8089:1: rule__Model__RuleMapsAssignment_1 : ( ruleRuleMap ) ;
    public final void rule__Model__RuleMapsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8093:1: ( ( ruleRuleMap ) )
            // InternalAedit.g:8094:2: ( ruleRuleMap )
            {
            // InternalAedit.g:8094:2: ( ruleRuleMap )
            // InternalAedit.g:8095:3: ruleRuleMap
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRuleMapsRuleMapParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRuleMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRuleMapsRuleMapParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RuleMapsAssignment_1"


    // $ANTLR start "rule__Model__FeaturesAssignment_2"
    // InternalAedit.g:8104:1: rule__Model__FeaturesAssignment_2 : ( ruleFeature ) ;
    public final void rule__Model__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8108:1: ( ( ruleFeature ) )
            // InternalAedit.g:8109:2: ( ruleFeature )
            {
            // InternalAedit.g:8109:2: ( ruleFeature )
            // InternalAedit.g:8110:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFeaturesFeatureParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getFeaturesFeatureParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FeaturesAssignment_2"


    // $ANTLR start "rule__Model__FeatureMapsAssignment_3"
    // InternalAedit.g:8119:1: rule__Model__FeatureMapsAssignment_3 : ( ruleFeatureMap ) ;
    public final void rule__Model__FeatureMapsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8123:1: ( ( ruleFeatureMap ) )
            // InternalAedit.g:8124:2: ( ruleFeatureMap )
            {
            // InternalAedit.g:8124:2: ( ruleFeatureMap )
            // InternalAedit.g:8125:3: ruleFeatureMap
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFeatureMapsFeatureMapParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureMap();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getFeatureMapsFeatureMapParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FeatureMapsAssignment_3"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // InternalAedit.g:8134:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8138:1: ( ( RULE_ID ) )
            // InternalAedit.g:8139:2: ( RULE_ID )
            {
            // InternalAedit.g:8139:2: ( RULE_ID )
            // InternalAedit.g:8140:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__ExtendAssignment_2_1"
    // InternalAedit.g:8149:1: rule__Feature__ExtendAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__ExtendAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8153:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:8154:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:8154:2: ( ( RULE_ID ) )
            // InternalAedit.g:8155:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getExtendFeatureCrossReference_2_1_0()); 
            }
            // InternalAedit.g:8156:3: ( RULE_ID )
            // InternalAedit.g:8157:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getExtendFeatureIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getExtendFeatureIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getExtendFeatureCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ExtendAssignment_2_1"


    // $ANTLR start "rule__Feature__RuleMapsAssignment_4"
    // InternalAedit.g:8168:1: rule__Feature__RuleMapsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__RuleMapsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8172:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:8173:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:8173:2: ( ( RULE_ID ) )
            // InternalAedit.g:8174:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getRuleMapsRuleMapCrossReference_4_0()); 
            }
            // InternalAedit.g:8175:3: ( RULE_ID )
            // InternalAedit.g:8176:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getRuleMapsRuleMapIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getRuleMapsRuleMapIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getRuleMapsRuleMapCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__RuleMapsAssignment_4"


    // $ANTLR start "rule__FeatureMap__NameAssignment_1"
    // InternalAedit.g:8187:1: rule__FeatureMap__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8191:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:8192:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:8192:2: ( ( RULE_ID ) )
            // InternalAedit.g:8193:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureMapAccess().getNameFeatureCrossReference_1_0()); 
            }
            // InternalAedit.g:8194:3: ( RULE_ID )
            // InternalAedit.g:8195:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureMapAccess().getNameFeatureIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureMapAccess().getNameFeatureIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureMapAccess().getNameFeatureCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureMap__NameAssignment_1"


    // $ANTLR start "rule__RuleMap__NameAssignment_1"
    // InternalAedit.g:8206:1: rule__RuleMap__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuleMap__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8210:1: ( ( RULE_ID ) )
            // InternalAedit.g:8211:2: ( RULE_ID )
            {
            // InternalAedit.g:8211:2: ( RULE_ID )
            // InternalAedit.g:8212:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleMapAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleMapAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleMap__NameAssignment_1"


    // $ANTLR start "rule__RuleMap__RulesAssignment_3"
    // InternalAedit.g:8221:1: rule__RuleMap__RulesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RuleMap__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8225:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:8226:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:8226:2: ( ( RULE_ID ) )
            // InternalAedit.g:8227:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleMapAccess().getRulesRuleDeclarationCrossReference_3_0()); 
            }
            // InternalAedit.g:8228:3: ( RULE_ID )
            // InternalAedit.g:8229:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleMapAccess().getRulesRuleDeclarationIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleMapAccess().getRulesRuleDeclarationIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleMapAccess().getRulesRuleDeclarationCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleMap__RulesAssignment_3"


    // $ANTLR start "rule__RuleDeclaration__NameAssignment_1"
    // InternalAedit.g:8240:1: rule__RuleDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuleDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8244:1: ( ( RULE_ID ) )
            // InternalAedit.g:8245:2: ( RULE_ID )
            {
            // InternalAedit.g:8245:2: ( RULE_ID )
            // InternalAedit.g:8246:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__NameAssignment_1"


    // $ANTLR start "rule__RuleDeclaration__RulesAssignment_3"
    // InternalAedit.g:8255:1: rule__RuleDeclaration__RulesAssignment_3 : ( ruleGenericRule ) ;
    public final void rule__RuleDeclaration__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8259:1: ( ( ruleGenericRule ) )
            // InternalAedit.g:8260:2: ( ruleGenericRule )
            {
            // InternalAedit.g:8260:2: ( ruleGenericRule )
            // InternalAedit.g:8261:3: ruleGenericRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleDeclarationAccess().getRulesGenericRuleParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleGenericRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleDeclarationAccess().getRulesGenericRuleParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleDeclaration__RulesAssignment_3"


    // $ANTLR start "rule__AddAnnotationToSchema__SchemaTypeAssignment_1"
    // InternalAedit.g:8270:1: rule__AddAnnotationToSchema__SchemaTypeAssignment_1 : ( ruleSCHEMA_TYPE ) ;
    public final void rule__AddAnnotationToSchema__SchemaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8274:1: ( ( ruleSCHEMA_TYPE ) )
            // InternalAedit.g:8275:2: ( ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:8275:2: ( ruleSCHEMA_TYPE )
            // InternalAedit.g:8276:3: ruleSCHEMA_TYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSCHEMA_TYPE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToSchema__SchemaTypeAssignment_1"


    // $ANTLR start "rule__AddAnnotationToSchema__SchemaAssignment_2"
    // InternalAedit.g:8285:1: rule__AddAnnotationToSchema__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__AddAnnotationToSchema__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8289:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8290:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8290:2: ( ( ruleQN ) )
            // InternalAedit.g:8291:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            }
            // InternalAedit.g:8292:3: ( ruleQN )
            // InternalAedit.g:8293:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToSchema__SchemaAssignment_2"


    // $ANTLR start "rule__AddAnnotationToSchema__AnnotationAssignment_4"
    // InternalAedit.g:8304:1: rule__AddAnnotationToSchema__AnnotationAssignment_4 : ( ruleAnnotation ) ;
    public final void rule__AddAnnotationToSchema__AnnotationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8308:1: ( ( ruleAnnotation ) )
            // InternalAedit.g:8309:2: ( ruleAnnotation )
            {
            // InternalAedit.g:8309:2: ( ruleAnnotation )
            // InternalAedit.g:8310:3: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToSchemaAccess().getAnnotationAnnotationParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToSchemaAccess().getAnnotationAnnotationParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToSchema__AnnotationAssignment_4"


    // $ANTLR start "rule__AddAnnotationToField__VariableAssignment_1"
    // InternalAedit.g:8319:1: rule__AddAnnotationToField__VariableAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__AddAnnotationToField__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8323:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8324:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8324:2: ( ( ruleQN ) )
            // InternalAedit.g:8325:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToFieldAccess().getVariableFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:8326:3: ( ruleQN )
            // InternalAedit.g:8327:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToFieldAccess().getVariableFieldQNParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToFieldAccess().getVariableFieldQNParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToFieldAccess().getVariableFieldCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToField__VariableAssignment_1"


    // $ANTLR start "rule__AddAnnotationToField__AnnotationAssignment_3"
    // InternalAedit.g:8338:1: rule__AddAnnotationToField__AnnotationAssignment_3 : ( ruleAnnotation ) ;
    public final void rule__AddAnnotationToField__AnnotationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8342:1: ( ( ruleAnnotation ) )
            // InternalAedit.g:8343:2: ( ruleAnnotation )
            {
            // InternalAedit.g:8343:2: ( ruleAnnotation )
            // InternalAedit.g:8344:3: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToFieldAccess().getAnnotationAnnotationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddAnnotationToFieldAccess().getAnnotationAnnotationParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddAnnotationToField__AnnotationAssignment_3"


    // $ANTLR start "rule__AddNameAnnotationToField__VariableAssignment_1"
    // InternalAedit.g:8353:1: rule__AddNameAnnotationToField__VariableAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__AddNameAnnotationToField__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8357:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8358:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8358:2: ( ( ruleQN ) )
            // InternalAedit.g:8359:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddNameAnnotationToFieldAccess().getVariableFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:8360:3: ( ruleQN )
            // InternalAedit.g:8361:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddNameAnnotationToFieldAccess().getVariableFieldQNParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddNameAnnotationToFieldAccess().getVariableFieldQNParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddNameAnnotationToFieldAccess().getVariableFieldCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddNameAnnotationToField__VariableAssignment_1"


    // $ANTLR start "rule__AddNameAnnotationToField__AnnotationAssignment_3"
    // InternalAedit.g:8372:1: rule__AddNameAnnotationToField__AnnotationAssignment_3 : ( ruleAnnotation ) ;
    public final void rule__AddNameAnnotationToField__AnnotationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8376:1: ( ( ruleAnnotation ) )
            // InternalAedit.g:8377:2: ( ruleAnnotation )
            {
            // InternalAedit.g:8377:2: ( ruleAnnotation )
            // InternalAedit.g:8378:3: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddNameAnnotationToFieldAccess().getAnnotationAnnotationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddNameAnnotationToFieldAccess().getAnnotationAnnotationParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddNameAnnotationToField__AnnotationAssignment_3"


    // $ANTLR start "rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1"
    // InternalAedit.g:8387:1: rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1 : ( ruleSCHEMA_TYPE ) ;
    public final void rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8391:1: ( ( ruleSCHEMA_TYPE ) )
            // InternalAedit.g:8392:2: ( ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:8392:2: ( ruleSCHEMA_TYPE )
            // InternalAedit.g:8393:3: ruleSCHEMA_TYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSCHEMA_TYPE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1"


    // $ANTLR start "rule__RemoveAnnotationFromSchema__SchemaAssignment_2"
    // InternalAedit.g:8402:1: rule__RemoveAnnotationFromSchema__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__RemoveAnnotationFromSchema__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8406:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8407:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8407:2: ( ( ruleQN ) )
            // InternalAedit.g:8408:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            }
            // InternalAedit.g:8409:3: ( ruleQN )
            // InternalAedit.g:8410:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromSchema__SchemaAssignment_2"


    // $ANTLR start "rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4"
    // InternalAedit.g:8421:1: rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4 : ( ( ruleQN ) ) ;
    public final void rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8425:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8426:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8426:2: ( ( ruleQN ) )
            // InternalAedit.g:8427:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaAccess().getAnnotationToRemoveAnnotationCrossReference_4_0()); 
            }
            // InternalAedit.g:8428:3: ( ruleQN )
            // InternalAedit.g:8429:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaAccess().getAnnotationToRemoveAnnotationQNParserRuleCall_4_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromSchemaAccess().getAnnotationToRemoveAnnotationQNParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromSchemaAccess().getAnnotationToRemoveAnnotationCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4"


    // $ANTLR start "rule__RemoveAnnotationFromField__VariableAssignment_1"
    // InternalAedit.g:8440:1: rule__RemoveAnnotationFromField__VariableAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__RemoveAnnotationFromField__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8444:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8445:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8445:2: ( ( ruleQN ) )
            // InternalAedit.g:8446:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromFieldAccess().getVariableFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:8447:3: ( ruleQN )
            // InternalAedit.g:8448:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromFieldAccess().getVariableFieldQNParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromFieldAccess().getVariableFieldQNParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromFieldAccess().getVariableFieldCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromField__VariableAssignment_1"


    // $ANTLR start "rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3"
    // InternalAedit.g:8459:1: rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3 : ( ( ruleQN ) ) ;
    public final void rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8463:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8464:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8464:2: ( ( ruleQN ) )
            // InternalAedit.g:8465:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromFieldAccess().getAnnotationToRemoveAnnotationCrossReference_3_0()); 
            }
            // InternalAedit.g:8466:3: ( ruleQN )
            // InternalAedit.g:8467:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromFieldAccess().getAnnotationToRemoveAnnotationQNParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromFieldAccess().getAnnotationToRemoveAnnotationQNParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveAnnotationFromFieldAccess().getAnnotationToRemoveAnnotationCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3"


    // $ANTLR start "rule__RemoveNameAnnotationFromField__VariableAssignment_1"
    // InternalAedit.g:8478:1: rule__RemoveNameAnnotationFromField__VariableAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__RemoveNameAnnotationFromField__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8482:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8483:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8483:2: ( ( ruleQN ) )
            // InternalAedit.g:8484:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getVariableFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:8485:3: ( ruleQN )
            // InternalAedit.g:8486:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getVariableFieldQNParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getVariableFieldQNParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getVariableFieldCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveNameAnnotationFromField__VariableAssignment_1"


    // $ANTLR start "rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3"
    // InternalAedit.g:8497:1: rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3 : ( ( ruleQN ) ) ;
    public final void rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8501:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8502:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8502:2: ( ( ruleQN ) )
            // InternalAedit.g:8503:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getAnnotationToRemoveAnnotationCrossReference_3_0()); 
            }
            // InternalAedit.g:8504:3: ( ruleQN )
            // InternalAedit.g:8505:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getAnnotationToRemoveAnnotationQNParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getAnnotationToRemoveAnnotationQNParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getAnnotationToRemoveAnnotationCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3"


    // $ANTLR start "rule__ChangeSchema__SchemaTypeAssignment_1"
    // InternalAedit.g:8516:1: rule__ChangeSchema__SchemaTypeAssignment_1 : ( ( rule__ChangeSchema__SchemaTypeAlternatives_1_0 ) ) ;
    public final void rule__ChangeSchema__SchemaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8520:1: ( ( ( rule__ChangeSchema__SchemaTypeAlternatives_1_0 ) ) )
            // InternalAedit.g:8521:2: ( ( rule__ChangeSchema__SchemaTypeAlternatives_1_0 ) )
            {
            // InternalAedit.g:8521:2: ( ( rule__ChangeSchema__SchemaTypeAlternatives_1_0 ) )
            // InternalAedit.g:8522:3: ( rule__ChangeSchema__SchemaTypeAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeSchemaAccess().getSchemaTypeAlternatives_1_0()); 
            }
            // InternalAedit.g:8523:3: ( rule__ChangeSchema__SchemaTypeAlternatives_1_0 )
            // InternalAedit.g:8523:4: rule__ChangeSchema__SchemaTypeAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeSchema__SchemaTypeAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeSchemaAccess().getSchemaTypeAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSchema__SchemaTypeAssignment_1"


    // $ANTLR start "rule__ChangeSchema__SchemaAssignment_2"
    // InternalAedit.g:8531:1: rule__ChangeSchema__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__ChangeSchema__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8535:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8536:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8536:2: ( ( ruleQN ) )
            // InternalAedit.g:8537:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            }
            // InternalAedit.g:8538:3: ( ruleQN )
            // InternalAedit.g:8539:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSchema__SchemaAssignment_2"


    // $ANTLR start "rule__ChangeSchema__RulesAssignment_4"
    // InternalAedit.g:8550:1: rule__ChangeSchema__RulesAssignment_4 : ( ruleSchemaRule ) ;
    public final void rule__ChangeSchema__RulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8554:1: ( ( ruleSchemaRule ) )
            // InternalAedit.g:8555:2: ( ruleSchemaRule )
            {
            // InternalAedit.g:8555:2: ( ruleSchemaRule )
            // InternalAedit.g:8556:3: ruleSchemaRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeSchemaAccess().getRulesSchemaRuleParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSchemaRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeSchemaAccess().getRulesSchemaRuleParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSchema__RulesAssignment_4"


    // $ANTLR start "rule__ChangeEnum__SchemaAssignment_2"
    // InternalAedit.g:8565:1: rule__ChangeEnum__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__ChangeEnum__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8569:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8570:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8570:2: ( ( ruleQN ) )
            // InternalAedit.g:8571:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeEnumAccess().getSchemaEnumTypeCrossReference_2_0()); 
            }
            // InternalAedit.g:8572:3: ( ruleQN )
            // InternalAedit.g:8573:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeEnumAccess().getSchemaEnumTypeQNParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeEnumAccess().getSchemaEnumTypeQNParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeEnumAccess().getSchemaEnumTypeCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeEnum__SchemaAssignment_2"


    // $ANTLR start "rule__ChangeEnum__RulesAssignment_4"
    // InternalAedit.g:8584:1: rule__ChangeEnum__RulesAssignment_4 : ( ruleEnumRule ) ;
    public final void rule__ChangeEnum__RulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8588:1: ( ( ruleEnumRule ) )
            // InternalAedit.g:8589:2: ( ruleEnumRule )
            {
            // InternalAedit.g:8589:2: ( ruleEnumRule )
            // InternalAedit.g:8590:3: ruleEnumRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeEnumAccess().getRulesEnumRuleParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEnumRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeEnumAccess().getRulesEnumRuleParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeEnum__RulesAssignment_4"


    // $ANTLR start "rule__AddRecord__IndexAssignment_2"
    // InternalAedit.g:8599:1: rule__AddRecord__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddRecord__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8603:1: ( ( RULE_INT ) )
            // InternalAedit.g:8604:2: ( RULE_INT )
            {
            // InternalAedit.g:8604:2: ( RULE_INT )
            // InternalAedit.g:8605:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getIndexINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordAccess().getIndexINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__IndexAssignment_2"


    // $ANTLR start "rule__AddRecord__NamespaceAssignment_5"
    // InternalAedit.g:8614:1: rule__AddRecord__NamespaceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__AddRecord__NamespaceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8618:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:8619:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:8619:2: ( ( RULE_ID ) )
            // InternalAedit.g:8620:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getNamespaceAvroIDLFileCrossReference_5_0()); 
            }
            // InternalAedit.g:8621:3: ( RULE_ID )
            // InternalAedit.g:8622:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getNamespaceAvroIDLFileIDTerminalRuleCall_5_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordAccess().getNamespaceAvroIDLFileIDTerminalRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordAccess().getNamespaceAvroIDLFileCrossReference_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__NamespaceAssignment_5"


    // $ANTLR start "rule__AddRecord__RecordNameAssignment_7"
    // InternalAedit.g:8633:1: rule__AddRecord__RecordNameAssignment_7 : ( RULE_ID ) ;
    public final void rule__AddRecord__RecordNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8637:1: ( ( RULE_ID ) )
            // InternalAedit.g:8638:2: ( RULE_ID )
            {
            // InternalAedit.g:8638:2: ( RULE_ID )
            // InternalAedit.g:8639:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getRecordNameIDTerminalRuleCall_7_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordAccess().getRecordNameIDTerminalRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__RecordNameAssignment_7"


    // $ANTLR start "rule__AddRecord__FieldsAssignment_9"
    // InternalAedit.g:8648:1: rule__AddRecord__FieldsAssignment_9 : ( ruleField ) ;
    public final void rule__AddRecord__FieldsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8652:1: ( ( ruleField ) )
            // InternalAedit.g:8653:2: ( ruleField )
            {
            // InternalAedit.g:8653:2: ( ruleField )
            // InternalAedit.g:8654:3: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getFieldsFieldParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddRecordAccess().getFieldsFieldParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddRecord__FieldsAssignment_9"


    // $ANTLR start "rule__AddError__IndexAssignment_2"
    // InternalAedit.g:8663:1: rule__AddError__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddError__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8667:1: ( ( RULE_INT ) )
            // InternalAedit.g:8668:2: ( RULE_INT )
            {
            // InternalAedit.g:8668:2: ( RULE_INT )
            // InternalAedit.g:8669:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getIndexINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorAccess().getIndexINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__IndexAssignment_2"


    // $ANTLR start "rule__AddError__NamespaceAssignment_5"
    // InternalAedit.g:8678:1: rule__AddError__NamespaceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__AddError__NamespaceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8682:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:8683:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:8683:2: ( ( RULE_ID ) )
            // InternalAedit.g:8684:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getNamespaceAvroIDLFileCrossReference_5_0()); 
            }
            // InternalAedit.g:8685:3: ( RULE_ID )
            // InternalAedit.g:8686:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getNamespaceAvroIDLFileIDTerminalRuleCall_5_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorAccess().getNamespaceAvroIDLFileIDTerminalRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorAccess().getNamespaceAvroIDLFileCrossReference_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__NamespaceAssignment_5"


    // $ANTLR start "rule__AddError__ErrorNameAssignment_7"
    // InternalAedit.g:8697:1: rule__AddError__ErrorNameAssignment_7 : ( RULE_ID ) ;
    public final void rule__AddError__ErrorNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8701:1: ( ( RULE_ID ) )
            // InternalAedit.g:8702:2: ( RULE_ID )
            {
            // InternalAedit.g:8702:2: ( RULE_ID )
            // InternalAedit.g:8703:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getErrorNameIDTerminalRuleCall_7_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorAccess().getErrorNameIDTerminalRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__ErrorNameAssignment_7"


    // $ANTLR start "rule__AddError__FieldsAssignment_9"
    // InternalAedit.g:8712:1: rule__AddError__FieldsAssignment_9 : ( ruleField ) ;
    public final void rule__AddError__FieldsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8716:1: ( ( ruleField ) )
            // InternalAedit.g:8717:2: ( ruleField )
            {
            // InternalAedit.g:8717:2: ( ruleField )
            // InternalAedit.g:8718:3: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getFieldsFieldParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddErrorAccess().getFieldsFieldParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddError__FieldsAssignment_9"


    // $ANTLR start "rule__AddEnumeration__IndexAssignment_2"
    // InternalAedit.g:8727:1: rule__AddEnumeration__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddEnumeration__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8731:1: ( ( RULE_INT ) )
            // InternalAedit.g:8732:2: ( RULE_INT )
            {
            // InternalAedit.g:8732:2: ( RULE_INT )
            // InternalAedit.g:8733:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getIndexINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getIndexINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__IndexAssignment_2"


    // $ANTLR start "rule__AddEnumeration__NamespaceAssignment_5"
    // InternalAedit.g:8742:1: rule__AddEnumeration__NamespaceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__AddEnumeration__NamespaceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8746:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:8747:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:8747:2: ( ( RULE_ID ) )
            // InternalAedit.g:8748:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getNamespaceAvroIDLFileCrossReference_5_0()); 
            }
            // InternalAedit.g:8749:3: ( RULE_ID )
            // InternalAedit.g:8750:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getNamespaceAvroIDLFileIDTerminalRuleCall_5_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getNamespaceAvroIDLFileIDTerminalRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getNamespaceAvroIDLFileCrossReference_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__NamespaceAssignment_5"


    // $ANTLR start "rule__AddEnumeration__EnumNameAssignment_7"
    // InternalAedit.g:8761:1: rule__AddEnumeration__EnumNameAssignment_7 : ( RULE_ID ) ;
    public final void rule__AddEnumeration__EnumNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8765:1: ( ( RULE_ID ) )
            // InternalAedit.g:8766:2: ( RULE_ID )
            {
            // InternalAedit.g:8766:2: ( RULE_ID )
            // InternalAedit.g:8767:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getEnumNameIDTerminalRuleCall_7_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getEnumNameIDTerminalRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__EnumNameAssignment_7"


    // $ANTLR start "rule__AddEnumeration__SymbolsAssignment_9"
    // InternalAedit.g:8776:1: rule__AddEnumeration__SymbolsAssignment_9 : ( RULE_ID ) ;
    public final void rule__AddEnumeration__SymbolsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8780:1: ( ( RULE_ID ) )
            // InternalAedit.g:8781:2: ( RULE_ID )
            {
            // InternalAedit.g:8781:2: ( RULE_ID )
            // InternalAedit.g:8782:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getSymbolsIDTerminalRuleCall_9_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getSymbolsIDTerminalRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__SymbolsAssignment_9"


    // $ANTLR start "rule__AddEnumeration__SymbolsAssignment_10_1"
    // InternalAedit.g:8791:1: rule__AddEnumeration__SymbolsAssignment_10_1 : ( RULE_ID ) ;
    public final void rule__AddEnumeration__SymbolsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8795:1: ( ( RULE_ID ) )
            // InternalAedit.g:8796:2: ( RULE_ID )
            {
            // InternalAedit.g:8796:2: ( RULE_ID )
            // InternalAedit.g:8797:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getSymbolsIDTerminalRuleCall_10_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumerationAccess().getSymbolsIDTerminalRuleCall_10_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnumeration__SymbolsAssignment_10_1"


    // $ANTLR start "rule__AddVariable__IndexAssignment_2"
    // InternalAedit.g:8806:1: rule__AddVariable__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddVariable__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8810:1: ( ( RULE_INT ) )
            // InternalAedit.g:8811:2: ( RULE_INT )
            {
            // InternalAedit.g:8811:2: ( RULE_INT )
            // InternalAedit.g:8812:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddVariableAccess().getIndexINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddVariableAccess().getIndexINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddVariable__IndexAssignment_2"


    // $ANTLR start "rule__AddVariable__NewVarAssignment_4"
    // InternalAedit.g:8821:1: rule__AddVariable__NewVarAssignment_4 : ( ruleField ) ;
    public final void rule__AddVariable__NewVarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8825:1: ( ( ruleField ) )
            // InternalAedit.g:8826:2: ( ruleField )
            {
            // InternalAedit.g:8826:2: ( ruleField )
            // InternalAedit.g:8827:3: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddVariableAccess().getNewVarFieldParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddVariableAccess().getNewVarFieldParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddVariable__NewVarAssignment_4"


    // $ANTLR start "rule__AddEnum__IndexAssignment_2"
    // InternalAedit.g:8836:1: rule__AddEnum__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddEnum__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8840:1: ( ( RULE_INT ) )
            // InternalAedit.g:8841:2: ( RULE_INT )
            {
            // InternalAedit.g:8841:2: ( RULE_INT )
            // InternalAedit.g:8842:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumAccess().getIndexINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumAccess().getIndexINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnum__IndexAssignment_2"


    // $ANTLR start "rule__AddEnum__VarNameAssignment_4"
    // InternalAedit.g:8851:1: rule__AddEnum__VarNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__AddEnum__VarNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8855:1: ( ( RULE_ID ) )
            // InternalAedit.g:8856:2: ( RULE_ID )
            {
            // InternalAedit.g:8856:2: ( RULE_ID )
            // InternalAedit.g:8857:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumAccess().getVarNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddEnumAccess().getVarNameIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddEnum__VarNameAssignment_4"


    // $ANTLR start "rule__RemoveSchema__SchemaTypeAssignment_1"
    // InternalAedit.g:8866:1: rule__RemoveSchema__SchemaTypeAssignment_1 : ( ruleSCHEMA_TYPE ) ;
    public final void rule__RemoveSchema__SchemaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8870:1: ( ( ruleSCHEMA_TYPE ) )
            // InternalAedit.g:8871:2: ( ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:8871:2: ( ruleSCHEMA_TYPE )
            // InternalAedit.g:8872:3: ruleSCHEMA_TYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSCHEMA_TYPE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveSchema__SchemaTypeAssignment_1"


    // $ANTLR start "rule__RemoveSchema__SchemaAssignment_2"
    // InternalAedit.g:8881:1: rule__RemoveSchema__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__RemoveSchema__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8885:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8886:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8886:2: ( ( ruleQN ) )
            // InternalAedit.g:8887:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            }
            // InternalAedit.g:8888:3: ( ruleQN )
            // InternalAedit.g:8889:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveSchema__SchemaAssignment_2"


    // $ANTLR start "rule__RemoveVariable__VariableAssignment_1"
    // InternalAedit.g:8900:1: rule__RemoveVariable__VariableAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__RemoveVariable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8904:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8905:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8905:2: ( ( ruleQN ) )
            // InternalAedit.g:8906:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveVariableAccess().getVariableFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:8907:3: ( ruleQN )
            // InternalAedit.g:8908:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveVariableAccess().getVariableFieldQNParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveVariableAccess().getVariableFieldQNParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveVariableAccess().getVariableFieldCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveVariable__VariableAssignment_1"


    // $ANTLR start "rule__RemoveEnum__VarNameAssignment_1"
    // InternalAedit.g:8919:1: rule__RemoveEnum__VarNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RemoveEnum__VarNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8923:1: ( ( RULE_ID ) )
            // InternalAedit.g:8924:2: ( RULE_ID )
            {
            // InternalAedit.g:8924:2: ( RULE_ID )
            // InternalAedit.g:8925:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveEnumAccess().getVarNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveEnumAccess().getVarNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveEnum__VarNameAssignment_1"


    // $ANTLR start "rule__RenameSchema__SchemaTypeAssignment_1"
    // InternalAedit.g:8934:1: rule__RenameSchema__SchemaTypeAssignment_1 : ( ruleSCHEMA_TYPE ) ;
    public final void rule__RenameSchema__SchemaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8938:1: ( ( ruleSCHEMA_TYPE ) )
            // InternalAedit.g:8939:2: ( ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:8939:2: ( ruleSCHEMA_TYPE )
            // InternalAedit.g:8940:3: ruleSCHEMA_TYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSCHEMA_TYPE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameSchema__SchemaTypeAssignment_1"


    // $ANTLR start "rule__RenameSchema__SchemaAssignment_2"
    // InternalAedit.g:8949:1: rule__RenameSchema__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__RenameSchema__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8953:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8954:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8954:2: ( ( ruleQN ) )
            // InternalAedit.g:8955:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            }
            // InternalAedit.g:8956:3: ( ruleQN )
            // InternalAedit.g:8957:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameSchema__SchemaAssignment_2"


    // $ANTLR start "rule__RenameSchema__NewSchNameAssignment_4"
    // InternalAedit.g:8968:1: rule__RenameSchema__NewSchNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__RenameSchema__NewSchNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8972:1: ( ( RULE_ID ) )
            // InternalAedit.g:8973:2: ( RULE_ID )
            {
            // InternalAedit.g:8973:2: ( RULE_ID )
            // InternalAedit.g:8974:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameSchemaAccess().getNewSchNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameSchemaAccess().getNewSchNameIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameSchema__NewSchNameAssignment_4"


    // $ANTLR start "rule__RenameVariable__VariableAssignment_1"
    // InternalAedit.g:8983:1: rule__RenameVariable__VariableAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__RenameVariable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8987:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8988:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8988:2: ( ( ruleQN ) )
            // InternalAedit.g:8989:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameVariableAccess().getVariableFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:8990:3: ( ruleQN )
            // InternalAedit.g:8991:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameVariableAccess().getVariableFieldQNParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameVariableAccess().getVariableFieldQNParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameVariableAccess().getVariableFieldCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameVariable__VariableAssignment_1"


    // $ANTLR start "rule__RenameVariable__NewVarNameAssignment_3"
    // InternalAedit.g:9002:1: rule__RenameVariable__NewVarNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__RenameVariable__NewVarNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9006:1: ( ( RULE_ID ) )
            // InternalAedit.g:9007:2: ( RULE_ID )
            {
            // InternalAedit.g:9007:2: ( RULE_ID )
            // InternalAedit.g:9008:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameVariableAccess().getNewVarNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameVariableAccess().getNewVarNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameVariable__NewVarNameAssignment_3"


    // $ANTLR start "rule__RenameEnum__OldNameAssignment_1"
    // InternalAedit.g:9017:1: rule__RenameEnum__OldNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RenameEnum__OldNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9021:1: ( ( RULE_ID ) )
            // InternalAedit.g:9022:2: ( RULE_ID )
            {
            // InternalAedit.g:9022:2: ( RULE_ID )
            // InternalAedit.g:9023:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameEnumAccess().getOldNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameEnumAccess().getOldNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEnum__OldNameAssignment_1"


    // $ANTLR start "rule__RenameEnum__NewEnumNameAssignment_3"
    // InternalAedit.g:9032:1: rule__RenameEnum__NewEnumNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__RenameEnum__NewEnumNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9036:1: ( ( RULE_ID ) )
            // InternalAedit.g:9037:2: ( RULE_ID )
            {
            // InternalAedit.g:9037:2: ( RULE_ID )
            // InternalAedit.g:9038:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameEnumAccess().getNewEnumNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRenameEnumAccess().getNewEnumNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RenameEnum__NewEnumNameAssignment_3"


    // $ANTLR start "rule__ChangeDefValue__FieldAssignment_1"
    // InternalAedit.g:9047:1: rule__ChangeDefValue__FieldAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__ChangeDefValue__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9051:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:9052:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:9052:2: ( ( ruleQN ) )
            // InternalAedit.g:9053:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeDefValueAccess().getFieldFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:9054:3: ( ruleQN )
            // InternalAedit.g:9055:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeDefValueAccess().getFieldFieldQNParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeDefValueAccess().getFieldFieldQNParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeDefValueAccess().getFieldFieldCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeDefValue__FieldAssignment_1"


    // $ANTLR start "rule__ChangeDefValue__NewValAssignment_3"
    // InternalAedit.g:9066:1: rule__ChangeDefValue__NewValAssignment_3 : ( ruleValue ) ;
    public final void rule__ChangeDefValue__NewValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9070:1: ( ( ruleValue ) )
            // InternalAedit.g:9071:2: ( ruleValue )
            {
            // InternalAedit.g:9071:2: ( ruleValue )
            // InternalAedit.g:9072:3: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeDefValueAccess().getNewValValueParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeDefValueAccess().getNewValValueParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeDefValue__NewValAssignment_3"


    // $ANTLR start "rule__ChangeType__FieldAssignment_1"
    // InternalAedit.g:9081:1: rule__ChangeType__FieldAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__ChangeType__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9085:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:9086:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:9086:2: ( ( ruleQN ) )
            // InternalAedit.g:9087:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeTypeAccess().getFieldFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:9088:3: ( ruleQN )
            // InternalAedit.g:9089:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeTypeAccess().getFieldFieldQNParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeTypeAccess().getFieldFieldQNParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeTypeAccess().getFieldFieldCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeType__FieldAssignment_1"


    // $ANTLR start "rule__ChangeType__NewTypeAssignment_3"
    // InternalAedit.g:9100:1: rule__ChangeType__NewTypeAssignment_3 : ( ruleVARIABLE_TYPE ) ;
    public final void rule__ChangeType__NewTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9104:1: ( ( ruleVARIABLE_TYPE ) )
            // InternalAedit.g:9105:2: ( ruleVARIABLE_TYPE )
            {
            // InternalAedit.g:9105:2: ( ruleVARIABLE_TYPE )
            // InternalAedit.g:9106:3: ruleVARIABLE_TYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeTypeAccess().getNewTypeVARIABLE_TYPEParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVARIABLE_TYPE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChangeTypeAccess().getNewTypeVARIABLE_TYPEParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeType__NewTypeAssignment_3"


    // $ANTLR start "rule__RemoveArrayValue__VariableAssignment_1"
    // InternalAedit.g:9115:1: rule__RemoveArrayValue__VariableAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__RemoveArrayValue__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9119:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:9120:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:9120:2: ( ( ruleQN ) )
            // InternalAedit.g:9121:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAccess().getVariableFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:9122:3: ( ruleQN )
            // InternalAedit.g:9123:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAccess().getVariableFieldQNParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAccess().getVariableFieldQNParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAccess().getVariableFieldCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValue__VariableAssignment_1"


    // $ANTLR start "rule__RemoveArrayValue__ValueToRemoveAssignment_3"
    // InternalAedit.g:9134:1: rule__RemoveArrayValue__ValueToRemoveAssignment_3 : ( ruleValue ) ;
    public final void rule__RemoveArrayValue__ValueToRemoveAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9138:1: ( ( ruleValue ) )
            // InternalAedit.g:9139:2: ( ruleValue )
            {
            // InternalAedit.g:9139:2: ( ruleValue )
            // InternalAedit.g:9140:3: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAccess().getValueToRemoveValueParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAccess().getValueToRemoveValueParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValue__ValueToRemoveAssignment_3"


    // $ANTLR start "rule__RemoveArrayValueAtIndex__IndexAssignment_2"
    // InternalAedit.g:9149:1: rule__RemoveArrayValueAtIndex__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__RemoveArrayValueAtIndex__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9153:1: ( ( RULE_INT ) )
            // InternalAedit.g:9154:2: ( RULE_INT )
            {
            // InternalAedit.g:9154:2: ( RULE_INT )
            // InternalAedit.g:9155:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAtIndexAccess().getIndexINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAtIndexAccess().getIndexINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValueAtIndex__IndexAssignment_2"


    // $ANTLR start "rule__RemoveArrayValueAtIndex__ArrayAssignment_4"
    // InternalAedit.g:9164:1: rule__RemoveArrayValueAtIndex__ArrayAssignment_4 : ( ( ruleQN ) ) ;
    public final void rule__RemoveArrayValueAtIndex__ArrayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9168:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:9169:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:9169:2: ( ( ruleQN ) )
            // InternalAedit.g:9170:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAtIndexAccess().getArrayFieldCrossReference_4_0()); 
            }
            // InternalAedit.g:9171:3: ( ruleQN )
            // InternalAedit.g:9172:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAtIndexAccess().getArrayFieldQNParserRuleCall_4_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAtIndexAccess().getArrayFieldQNParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAtIndexAccess().getArrayFieldCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValueAtIndex__ArrayAssignment_4"


    // $ANTLR start "rule__AddValueToArray__IndexAssignment_2"
    // InternalAedit.g:9183:1: rule__AddValueToArray__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddValueToArray__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9187:1: ( ( RULE_INT ) )
            // InternalAedit.g:9188:2: ( RULE_INT )
            {
            // InternalAedit.g:9188:2: ( RULE_INT )
            // InternalAedit.g:9189:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getIndexINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddValueToArrayAccess().getIndexINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__IndexAssignment_2"


    // $ANTLR start "rule__AddValueToArray__ArrayAssignment_4"
    // InternalAedit.g:9198:1: rule__AddValueToArray__ArrayAssignment_4 : ( ( ruleQN ) ) ;
    public final void rule__AddValueToArray__ArrayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9202:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:9203:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:9203:2: ( ( ruleQN ) )
            // InternalAedit.g:9204:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getArrayFieldCrossReference_4_0()); 
            }
            // InternalAedit.g:9205:3: ( ruleQN )
            // InternalAedit.g:9206:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getArrayFieldQNParserRuleCall_4_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddValueToArrayAccess().getArrayFieldQNParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddValueToArrayAccess().getArrayFieldCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__ArrayAssignment_4"


    // $ANTLR start "rule__AddValueToArray__ValueToAddAssignment_6"
    // InternalAedit.g:9217:1: rule__AddValueToArray__ValueToAddAssignment_6 : ( ( rule__AddValueToArray__ValueToAddAlternatives_6_0 ) ) ;
    public final void rule__AddValueToArray__ValueToAddAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9221:1: ( ( ( rule__AddValueToArray__ValueToAddAlternatives_6_0 ) ) )
            // InternalAedit.g:9222:2: ( ( rule__AddValueToArray__ValueToAddAlternatives_6_0 ) )
            {
            // InternalAedit.g:9222:2: ( ( rule__AddValueToArray__ValueToAddAlternatives_6_0 ) )
            // InternalAedit.g:9223:3: ( rule__AddValueToArray__ValueToAddAlternatives_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getValueToAddAlternatives_6_0()); 
            }
            // InternalAedit.g:9224:3: ( rule__AddValueToArray__ValueToAddAlternatives_6_0 )
            // InternalAedit.g:9224:4: rule__AddValueToArray__ValueToAddAlternatives_6_0
            {
            pushFollow(FOLLOW_2);
            rule__AddValueToArray__ValueToAddAlternatives_6_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddValueToArrayAccess().getValueToAddAlternatives_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddValueToArray__ValueToAddAssignment_6"


    // $ANTLR start "rule__Field__AnnotationsAssignment_0"
    // InternalAedit.g:9232:1: rule__Field__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Field__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9236:1: ( ( ruleAnnotation ) )
            // InternalAedit.g:9237:2: ( ruleAnnotation )
            {
            // InternalAedit.g:9237:2: ( ruleAnnotation )
            // InternalAedit.g:9238:3: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__AnnotationsAssignment_0"


    // $ANTLR start "rule__Field__FieldTypeAssignment_1"
    // InternalAedit.g:9247:1: rule__Field__FieldTypeAssignment_1 : ( ( rule__Field__FieldTypeAlternatives_1_0 ) ) ;
    public final void rule__Field__FieldTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9251:1: ( ( ( rule__Field__FieldTypeAlternatives_1_0 ) ) )
            // InternalAedit.g:9252:2: ( ( rule__Field__FieldTypeAlternatives_1_0 ) )
            {
            // InternalAedit.g:9252:2: ( ( rule__Field__FieldTypeAlternatives_1_0 ) )
            // InternalAedit.g:9253:3: ( rule__Field__FieldTypeAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getFieldTypeAlternatives_1_0()); 
            }
            // InternalAedit.g:9254:3: ( rule__Field__FieldTypeAlternatives_1_0 )
            // InternalAedit.g:9254:4: rule__Field__FieldTypeAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__FieldTypeAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getFieldTypeAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__FieldTypeAssignment_1"


    // $ANTLR start "rule__CustomTypeField__TypeAssignment_0"
    // InternalAedit.g:9262:1: rule__CustomTypeField__TypeAssignment_0 : ( ruleCustomType ) ;
    public final void rule__CustomTypeField__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9266:1: ( ( ruleCustomType ) )
            // InternalAedit.g:9267:2: ( ruleCustomType )
            {
            // InternalAedit.g:9267:2: ( ruleCustomType )
            // InternalAedit.g:9268:3: ruleCustomType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeFieldAccess().getTypeCustomTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCustomType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeFieldAccess().getTypeCustomTypeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTypeField__TypeAssignment_0"


    // $ANTLR start "rule__CustomTypeField__NameAnnotationsAssignment_1"
    // InternalAedit.g:9277:1: rule__CustomTypeField__NameAnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__CustomTypeField__NameAnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9281:1: ( ( ruleAnnotation ) )
            // InternalAedit.g:9282:2: ( ruleAnnotation )
            {
            // InternalAedit.g:9282:2: ( ruleAnnotation )
            // InternalAedit.g:9283:3: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeFieldAccess().getNameAnnotationsAnnotationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeFieldAccess().getNameAnnotationsAnnotationParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTypeField__NameAnnotationsAssignment_1"


    // $ANTLR start "rule__CustomTypeField__VarNameAssignment_2"
    // InternalAedit.g:9292:1: rule__CustomTypeField__VarNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CustomTypeField__VarNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9296:1: ( ( RULE_ID ) )
            // InternalAedit.g:9297:2: ( RULE_ID )
            {
            // InternalAedit.g:9297:2: ( RULE_ID )
            // InternalAedit.g:9298:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeFieldAccess().getVarNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeFieldAccess().getVarNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTypeField__VarNameAssignment_2"


    // $ANTLR start "rule__PrimitiveTypeField__TypeAssignment_0"
    // InternalAedit.g:9307:1: rule__PrimitiveTypeField__TypeAssignment_0 : ( rulePrimitiveType ) ;
    public final void rule__PrimitiveTypeField__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9311:1: ( ( rulePrimitiveType ) )
            // InternalAedit.g:9312:2: ( rulePrimitiveType )
            {
            // InternalAedit.g:9312:2: ( rulePrimitiveType )
            // InternalAedit.g:9313:3: rulePrimitiveType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldAccess().getTypePrimitiveTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeFieldAccess().getTypePrimitiveTypeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__TypeAssignment_0"


    // $ANTLR start "rule__PrimitiveTypeField__NameAnnotationsAssignment_1"
    // InternalAedit.g:9322:1: rule__PrimitiveTypeField__NameAnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__PrimitiveTypeField__NameAnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9326:1: ( ( ruleAnnotation ) )
            // InternalAedit.g:9327:2: ( ruleAnnotation )
            {
            // InternalAedit.g:9327:2: ( ruleAnnotation )
            // InternalAedit.g:9328:3: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldAccess().getNameAnnotationsAnnotationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeFieldAccess().getNameAnnotationsAnnotationParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__NameAnnotationsAssignment_1"


    // $ANTLR start "rule__PrimitiveTypeField__VarNameAssignment_2"
    // InternalAedit.g:9337:1: rule__PrimitiveTypeField__VarNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PrimitiveTypeField__VarNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9341:1: ( ( RULE_ID ) )
            // InternalAedit.g:9342:2: ( RULE_ID )
            {
            // InternalAedit.g:9342:2: ( RULE_ID )
            // InternalAedit.g:9343:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldAccess().getVarNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeFieldAccess().getVarNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__VarNameAssignment_2"


    // $ANTLR start "rule__PrimitiveTypeField__ValueAssignment_3_1"
    // InternalAedit.g:9352:1: rule__PrimitiveTypeField__ValueAssignment_3_1 : ( ruleValue ) ;
    public final void rule__PrimitiveTypeField__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9356:1: ( ( ruleValue ) )
            // InternalAedit.g:9357:2: ( ruleValue )
            {
            // InternalAedit.g:9357:2: ( ruleValue )
            // InternalAedit.g:9358:3: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldAccess().getValueValueParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeFieldAccess().getValueValueParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__ValueAssignment_3_1"


    // $ANTLR start "rule__ComplexTypeField__TypeAssignment_0"
    // InternalAedit.g:9367:1: rule__ComplexTypeField__TypeAssignment_0 : ( ruleArrayTypeField ) ;
    public final void rule__ComplexTypeField__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9371:1: ( ( ruleArrayTypeField ) )
            // InternalAedit.g:9372:2: ( ruleArrayTypeField )
            {
            // InternalAedit.g:9372:2: ( ruleArrayTypeField )
            // InternalAedit.g:9373:3: ruleArrayTypeField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldAccess().getTypeArrayTypeFieldParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArrayTypeField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeFieldAccess().getTypeArrayTypeFieldParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeField__TypeAssignment_0"


    // $ANTLR start "rule__ComplexTypeField__NameAnnotationsAssignment_1"
    // InternalAedit.g:9382:1: rule__ComplexTypeField__NameAnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__ComplexTypeField__NameAnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9386:1: ( ( ruleAnnotation ) )
            // InternalAedit.g:9387:2: ( ruleAnnotation )
            {
            // InternalAedit.g:9387:2: ( ruleAnnotation )
            // InternalAedit.g:9388:3: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldAccess().getNameAnnotationsAnnotationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeFieldAccess().getNameAnnotationsAnnotationParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeField__NameAnnotationsAssignment_1"


    // $ANTLR start "rule__ComplexTypeField__VarNameAssignment_2"
    // InternalAedit.g:9397:1: rule__ComplexTypeField__VarNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComplexTypeField__VarNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9401:1: ( ( RULE_ID ) )
            // InternalAedit.g:9402:2: ( RULE_ID )
            {
            // InternalAedit.g:9402:2: ( RULE_ID )
            // InternalAedit.g:9403:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldAccess().getVarNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeFieldAccess().getVarNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeField__VarNameAssignment_2"


    // $ANTLR start "rule__ComplexTypeField__ValueAssignment_3_1"
    // InternalAedit.g:9412:1: rule__ComplexTypeField__ValueAssignment_3_1 : ( ruleArray ) ;
    public final void rule__ComplexTypeField__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9416:1: ( ( ruleArray ) )
            // InternalAedit.g:9417:2: ( ruleArray )
            {
            // InternalAedit.g:9417:2: ( ruleArray )
            // InternalAedit.g:9418:3: ruleArray
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldAccess().getValueArrayParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeFieldAccess().getValueArrayParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeField__ValueAssignment_3_1"


    // $ANTLR start "rule__ArrayTypeField__TypeAssignment_2"
    // InternalAedit.g:9427:1: rule__ArrayTypeField__TypeAssignment_2 : ( ruleAnnotatedTypes ) ;
    public final void rule__ArrayTypeField__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9431:1: ( ( ruleAnnotatedTypes ) )
            // InternalAedit.g:9432:2: ( ruleAnnotatedTypes )
            {
            // InternalAedit.g:9432:2: ( ruleAnnotatedTypes )
            // InternalAedit.g:9433:3: ruleAnnotatedTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeFieldAccess().getTypeAnnotatedTypesParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnnotatedTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayTypeFieldAccess().getTypeAnnotatedTypesParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTypeField__TypeAssignment_2"


    // $ANTLR start "rule__AnnotatedTypes__AnnotataionsAssignment_0"
    // InternalAedit.g:9442:1: rule__AnnotatedTypes__AnnotataionsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__AnnotatedTypes__AnnotataionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9446:1: ( ( ruleAnnotation ) )
            // InternalAedit.g:9447:2: ( ruleAnnotation )
            {
            // InternalAedit.g:9447:2: ( ruleAnnotation )
            // InternalAedit.g:9448:3: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotatedTypesAccess().getAnnotataionsAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotatedTypesAccess().getAnnotataionsAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotatedTypes__AnnotataionsAssignment_0"


    // $ANTLR start "rule__AnnotatedTypes__TypeAssignment_1"
    // InternalAedit.g:9457:1: rule__AnnotatedTypes__TypeAssignment_1 : ( ruleTypes ) ;
    public final void rule__AnnotatedTypes__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9461:1: ( ( ruleTypes ) )
            // InternalAedit.g:9462:2: ( ruleTypes )
            {
            // InternalAedit.g:9462:2: ( ruleTypes )
            // InternalAedit.g:9463:3: ruleTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotatedTypesAccess().getTypeTypesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotatedTypesAccess().getTypeTypesParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotatedTypes__TypeAssignment_1"


    // $ANTLR start "rule__CustomType__TargetAssignment"
    // InternalAedit.g:9472:1: rule__CustomType__TargetAssignment : ( ( ruleQN ) ) ;
    public final void rule__CustomType__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9476:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:9477:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:9477:2: ( ( ruleQN ) )
            // InternalAedit.g:9478:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeAccess().getTargetTypeCrossReference_0()); 
            }
            // InternalAedit.g:9479:3: ( ruleQN )
            // InternalAedit.g:9480:4: ruleQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeAccess().getTargetTypeQNParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeAccess().getTargetTypeQNParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCustomTypeAccess().getTargetTypeCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomType__TargetAssignment"


    // $ANTLR start "rule__PrimitiveType__TargetAssignment"
    // InternalAedit.g:9491:1: rule__PrimitiveType__TargetAssignment : ( ruleVARIABLE_TYPE ) ;
    public final void rule__PrimitiveType__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9495:1: ( ( ruleVARIABLE_TYPE ) )
            // InternalAedit.g:9496:2: ( ruleVARIABLE_TYPE )
            {
            // InternalAedit.g:9496:2: ( ruleVARIABLE_TYPE )
            // InternalAedit.g:9497:3: ruleVARIABLE_TYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeAccess().getTargetVARIABLE_TYPEParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVARIABLE_TYPE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeAccess().getTargetVARIABLE_TYPEParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__TargetAssignment"


    // $ANTLR start "rule__Annotation__NameAssignment_0"
    // InternalAedit.g:9506:1: rule__Annotation__NameAssignment_0 : ( ruleAN ) ;
    public final void rule__Annotation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9510:1: ( ( ruleAN ) )
            // InternalAedit.g:9511:2: ( ruleAN )
            {
            // InternalAedit.g:9511:2: ( ruleAN )
            // InternalAedit.g:9512:3: ruleAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameANParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getNameANParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__NameAssignment_0"


    // $ANTLR start "rule__Annotation__ValuesAssignment_1_1"
    // InternalAedit.g:9521:1: rule__Annotation__ValuesAssignment_1_1 : ( ruleValues ) ;
    public final void rule__Annotation__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9525:1: ( ( ruleValues ) )
            // InternalAedit.g:9526:2: ( ruleValues )
            {
            // InternalAedit.g:9526:2: ( ruleValues )
            // InternalAedit.g:9527:3: ruleValues
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getValuesValuesParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValues();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getValuesValuesParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__ValuesAssignment_1_1"


    // $ANTLR start "rule__Values__ValueAssignment_1_0"
    // InternalAedit.g:9536:1: rule__Values__ValueAssignment_1_0 : ( ruleArray ) ;
    public final void rule__Values__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9540:1: ( ( ruleArray ) )
            // InternalAedit.g:9541:2: ( ruleArray )
            {
            // InternalAedit.g:9541:2: ( ruleArray )
            // InternalAedit.g:9542:3: ruleArray
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValueArrayParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getValueArrayParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__ValueAssignment_1_0"


    // $ANTLR start "rule__Values__ValueAssignment_1_1_0"
    // InternalAedit.g:9551:1: rule__Values__ValueAssignment_1_1_0 : ( ruleValue ) ;
    public final void rule__Values__ValueAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9555:1: ( ( ruleValue ) )
            // InternalAedit.g:9556:2: ( ruleValue )
            {
            // InternalAedit.g:9556:2: ( ruleValue )
            // InternalAedit.g:9557:3: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__ValueAssignment_1_1_0"


    // $ANTLR start "rule__Values__ValueAssignment_1_1_1_1"
    // InternalAedit.g:9566:1: rule__Values__ValueAssignment_1_1_1_1 : ( ruleValue ) ;
    public final void rule__Values__ValueAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9570:1: ( ( ruleValue ) )
            // InternalAedit.g:9571:2: ( ruleValue )
            {
            // InternalAedit.g:9571:2: ( ruleValue )
            // InternalAedit.g:9572:3: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValuesAccess().getValueValueParserRuleCall_1_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Values__ValueAssignment_1_1_1_1"


    // $ANTLR start "rule__Array__ValuesAssignment_1"
    // InternalAedit.g:9581:1: rule__Array__ValuesAssignment_1 : ( ruleValues ) ;
    public final void rule__Array__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9585:1: ( ( ruleValues ) )
            // InternalAedit.g:9586:2: ( ruleValues )
            {
            // InternalAedit.g:9586:2: ( ruleValues )
            // InternalAedit.g:9587:3: ruleValues
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getValuesValuesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValues();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getValuesValuesParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__ValuesAssignment_1"


    // $ANTLR start "rule__FloatValue__ValAssignment"
    // InternalAedit.g:9596:1: rule__FloatValue__ValAssignment : ( ruleReal ) ;
    public final void rule__FloatValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9600:1: ( ( ruleReal ) )
            // InternalAedit.g:9601:2: ( ruleReal )
            {
            // InternalAedit.g:9601:2: ( ruleReal )
            // InternalAedit.g:9602:3: ruleReal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValRealParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleReal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getValRealParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__ValAssignment"


    // $ANTLR start "rule__StringValue__ValAssignment"
    // InternalAedit.g:9611:1: rule__StringValue__ValAssignment : ( RULE_ID ) ;
    public final void rule__StringValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9615:1: ( ( RULE_ID ) )
            // InternalAedit.g:9616:2: ( RULE_ID )
            {
            // InternalAedit.g:9616:2: ( RULE_ID )
            // InternalAedit.g:9617:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValAssignment"


    // $ANTLR start "rule__IntValue__ValAssignment"
    // InternalAedit.g:9626:1: rule__IntValue__ValAssignment : ( ( rule__IntValue__ValAlternatives_0 ) ) ;
    public final void rule__IntValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9630:1: ( ( ( rule__IntValue__ValAlternatives_0 ) ) )
            // InternalAedit.g:9631:2: ( ( rule__IntValue__ValAlternatives_0 ) )
            {
            // InternalAedit.g:9631:2: ( ( rule__IntValue__ValAlternatives_0 ) )
            // InternalAedit.g:9632:3: ( rule__IntValue__ValAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValAlternatives_0()); 
            }
            // InternalAedit.g:9633:3: ( rule__IntValue__ValAlternatives_0 )
            // InternalAedit.g:9633:4: rule__IntValue__ValAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__ValAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueAccess().getValAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__ValAssignment"


    // $ANTLR start "rule__Null__ValAssignment"
    // InternalAedit.g:9641:1: rule__Null__ValAssignment : ( ( 'null' ) ) ;
    public final void rule__Null__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9645:1: ( ( ( 'null' ) ) )
            // InternalAedit.g:9646:2: ( ( 'null' ) )
            {
            // InternalAedit.g:9646:2: ( ( 'null' ) )
            // InternalAedit.g:9647:3: ( 'null' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            }
            // InternalAedit.g:9648:3: ( 'null' )
            // InternalAedit.g:9649:4: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Null__ValAssignment"


    // $ANTLR start "rule__BooleanValue__ValAssignment"
    // InternalAedit.g:9660:1: rule__BooleanValue__ValAssignment : ( ruleBoolean ) ;
    public final void rule__BooleanValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9664:1: ( ( ruleBoolean ) )
            // InternalAedit.g:9665:2: ( ruleBoolean )
            {
            // InternalAedit.g:9665:2: ( ruleBoolean )
            // InternalAedit.g:9666:3: ruleBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValBooleanParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValBooleanParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000014400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000061A41000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000061A40000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000009800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000FE1741000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000FE1740000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000061001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000061000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00820000013F0020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00820000003F0022L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010001000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00820000003F0020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0140000000006030L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000003F0000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0150000000006030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0150000000006032L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0040000000000002L});

}