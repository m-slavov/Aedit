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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'record'", "'error'", "'true'", "'false'", "'enum'", "'int'", "'double'", "'string'", "'long'", "'boolean'", "'float'", "'feature'", "'{'", "'}'", "':'", "'use'", "';'", "'ruleset'", "'rule'", "'add.annot'", "'=>'", "'add.name_annot'", "'remove.annot'", "'remove.name_annot'", "'change'", "'add.at'", "'('", "')'", "'.'", "','", "'remove'", "'rename'", "'set_val'", "'set_type'", "'remove.at'", "'='", "'array'", "'<'", "'>'", "'['", "']'", "'-'", "'@'", "'null'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
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
            alt2 = dfa2.predict(input);
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
            case 41:
                {
                alt3=1;
                }
                break;
            case 45:
                {
                alt3=2;
                }
                break;
            case 36:
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
                            case 12:
                                {
                                alt6=2;
                                }
                                break;
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


    // $ANTLR start "rule__Field__FieldTypeAlternatives_1_0"
    // InternalAedit.g:1750:1: rule__Field__FieldTypeAlternatives_1_0 : ( ( rulePrimitiveTypeField ) | ( ruleCustomTypeField ) | ( ruleComplexTypeField ) );
    public final void rule__Field__FieldTypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1754:1: ( ( rulePrimitiveTypeField ) | ( ruleCustomTypeField ) | ( ruleComplexTypeField ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case 47:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAedit.g:1755:2: ( rulePrimitiveTypeField )
                    {
                    // InternalAedit.g:1755:2: ( rulePrimitiveTypeField )
                    // InternalAedit.g:1756:3: rulePrimitiveTypeField
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
                    // InternalAedit.g:1761:2: ( ruleCustomTypeField )
                    {
                    // InternalAedit.g:1761:2: ( ruleCustomTypeField )
                    // InternalAedit.g:1762:3: ruleCustomTypeField
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
                    // InternalAedit.g:1767:2: ( ruleComplexTypeField )
                    {
                    // InternalAedit.g:1767:2: ( ruleComplexTypeField )
                    // InternalAedit.g:1768:3: ruleComplexTypeField
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
    // InternalAedit.g:1777:1: rule__Types__Alternatives : ( ( ruleCustomType ) | ( rulePrimitiveType ) | ( ruleArrayTypeField ) );
    public final void rule__Types__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1781:1: ( ( ruleCustomType ) | ( rulePrimitiveType ) | ( ruleArrayTypeField ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt8=2;
                }
                break;
            case 47:
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
                    // InternalAedit.g:1782:2: ( ruleCustomType )
                    {
                    // InternalAedit.g:1782:2: ( ruleCustomType )
                    // InternalAedit.g:1783:3: ruleCustomType
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
                    // InternalAedit.g:1788:2: ( rulePrimitiveType )
                    {
                    // InternalAedit.g:1788:2: ( rulePrimitiveType )
                    // InternalAedit.g:1789:3: rulePrimitiveType
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
                    // InternalAedit.g:1794:2: ( ruleArrayTypeField )
                    {
                    // InternalAedit.g:1794:2: ( ruleArrayTypeField )
                    // InternalAedit.g:1795:3: ruleArrayTypeField
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
    // InternalAedit.g:1804:1: rule__Values__Alternatives_1 : ( ( ( rule__Values__ValueAssignment_1_0 ) ) | ( ( rule__Values__Group_1_1__0 ) ) );
    public final void rule__Values__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1808:1: ( ( ( rule__Values__ValueAssignment_1_0 ) ) | ( ( rule__Values__Group_1_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==50) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_ID)||(LA9_0>=13 && LA9_0<=14)||LA9_0==52||LA9_0==54) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAedit.g:1809:2: ( ( rule__Values__ValueAssignment_1_0 ) )
                    {
                    // InternalAedit.g:1809:2: ( ( rule__Values__ValueAssignment_1_0 ) )
                    // InternalAedit.g:1810:3: ( rule__Values__ValueAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuesAccess().getValueAssignment_1_0()); 
                    }
                    // InternalAedit.g:1811:3: ( rule__Values__ValueAssignment_1_0 )
                    // InternalAedit.g:1811:4: rule__Values__ValueAssignment_1_0
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
                    // InternalAedit.g:1815:2: ( ( rule__Values__Group_1_1__0 ) )
                    {
                    // InternalAedit.g:1815:2: ( ( rule__Values__Group_1_1__0 ) )
                    // InternalAedit.g:1816:3: ( rule__Values__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValuesAccess().getGroup_1_1()); 
                    }
                    // InternalAedit.g:1817:3: ( rule__Values__Group_1_1__0 )
                    // InternalAedit.g:1817:4: rule__Values__Group_1_1__0
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
    // InternalAedit.g:1825:1: rule__Value__Alternatives : ( ( ruleFloatValue ) | ( ruleIntValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleNull ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1829:1: ( ( ruleFloatValue ) | ( ruleIntValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleNull ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_INT) ) {
                    int LA10_6 = input.LA(3);

                    if ( (LA10_6==EOF||(LA10_6>=RULE_INT && LA10_6<=RULE_ID)||(LA10_6>=13 && LA10_6<=14)||(LA10_6>=16 && LA10_6<=21)||LA10_6==24||LA10_6==27||LA10_6==30||(LA10_6>=32 && LA10_6<=34)||LA10_6==36||LA10_6==38||(LA10_6>=40 && LA10_6<=45)||LA10_6==47||(LA10_6>=50 && LA10_6<=54)) ) {
                        alt10=2;
                    }
                    else if ( (LA10_6==39) ) {
                        alt10=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==EOF||(LA10_2>=RULE_INT && LA10_2<=RULE_ID)||(LA10_2>=13 && LA10_2<=14)||(LA10_2>=16 && LA10_2<=21)||LA10_2==24||LA10_2==27||LA10_2==30||(LA10_2>=32 && LA10_2<=34)||LA10_2==36||LA10_2==38||(LA10_2>=40 && LA10_2<=45)||LA10_2==47||(LA10_2>=50 && LA10_2<=54)) ) {
                    alt10=2;
                }
                else if ( (LA10_2==39) ) {
                    alt10=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt10=3;
                }
                break;
            case 13:
            case 14:
                {
                alt10=4;
                }
                break;
            case 54:
                {
                alt10=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalAedit.g:1830:2: ( ruleFloatValue )
                    {
                    // InternalAedit.g:1830:2: ( ruleFloatValue )
                    // InternalAedit.g:1831:3: ruleFloatValue
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
                    // InternalAedit.g:1836:2: ( ruleIntValue )
                    {
                    // InternalAedit.g:1836:2: ( ruleIntValue )
                    // InternalAedit.g:1837:3: ruleIntValue
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
                    // InternalAedit.g:1842:2: ( ruleStringValue )
                    {
                    // InternalAedit.g:1842:2: ( ruleStringValue )
                    // InternalAedit.g:1843:3: ruleStringValue
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
                    // InternalAedit.g:1848:2: ( ruleBooleanValue )
                    {
                    // InternalAedit.g:1848:2: ( ruleBooleanValue )
                    // InternalAedit.g:1849:3: ruleBooleanValue
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
                    // InternalAedit.g:1854:2: ( ruleNull )
                    {
                    // InternalAedit.g:1854:2: ( ruleNull )
                    // InternalAedit.g:1855:3: ruleNull
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
    // InternalAedit.g:1864:1: rule__IntValue__ValAlternatives_0 : ( ( RULE_INT ) | ( ruleNegativeInt ) );
    public final void rule__IntValue__ValAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1868:1: ( ( RULE_INT ) | ( ruleNegativeInt ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            else if ( (LA11_0==52) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAedit.g:1869:2: ( RULE_INT )
                    {
                    // InternalAedit.g:1869:2: ( RULE_INT )
                    // InternalAedit.g:1870:3: RULE_INT
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
                    // InternalAedit.g:1875:2: ( ruleNegativeInt )
                    {
                    // InternalAedit.g:1875:2: ( ruleNegativeInt )
                    // InternalAedit.g:1876:3: ruleNegativeInt
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
    // InternalAedit.g:1885:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1889:1: ( ( 'true' ) | ( 'false' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            else if ( (LA12_0==14) ) {
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
                    // InternalAedit.g:1890:2: ( 'true' )
                    {
                    // InternalAedit.g:1890:2: ( 'true' )
                    // InternalAedit.g:1891:3: 'true'
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
                    // InternalAedit.g:1896:2: ( 'false' )
                    {
                    // InternalAedit.g:1896:2: ( 'false' )
                    // InternalAedit.g:1897:3: 'false'
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
    // InternalAedit.g:1906:1: rule__SCHEMA_TYPE__Alternatives : ( ( 'record' ) | ( 'error' ) | ( 'enum' ) );
    public final void rule__SCHEMA_TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1910:1: ( ( 'record' ) | ( 'error' ) | ( 'enum' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt13=1;
                }
                break;
            case 12:
                {
                alt13=2;
                }
                break;
            case 15:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAedit.g:1911:2: ( 'record' )
                    {
                    // InternalAedit.g:1911:2: ( 'record' )
                    // InternalAedit.g:1912:3: 'record'
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
                    // InternalAedit.g:1917:2: ( 'error' )
                    {
                    // InternalAedit.g:1917:2: ( 'error' )
                    // InternalAedit.g:1918:3: 'error'
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
                    // InternalAedit.g:1923:2: ( 'enum' )
                    {
                    // InternalAedit.g:1923:2: ( 'enum' )
                    // InternalAedit.g:1924:3: 'enum'
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
    // InternalAedit.g:1933:1: rule__VARIABLE_TYPE__Alternatives : ( ( 'int' ) | ( 'double' ) | ( 'string' ) | ( 'long' ) | ( 'boolean' ) | ( 'float' ) );
    public final void rule__VARIABLE_TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1937:1: ( ( 'int' ) | ( 'double' ) | ( 'string' ) | ( 'long' ) | ( 'boolean' ) | ( 'float' ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt14=1;
                }
                break;
            case 17:
                {
                alt14=2;
                }
                break;
            case 18:
                {
                alt14=3;
                }
                break;
            case 19:
                {
                alt14=4;
                }
                break;
            case 20:
                {
                alt14=5;
                }
                break;
            case 21:
                {
                alt14=6;
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
                    // InternalAedit.g:1938:2: ( 'int' )
                    {
                    // InternalAedit.g:1938:2: ( 'int' )
                    // InternalAedit.g:1939:3: 'int'
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
                    // InternalAedit.g:1944:2: ( 'double' )
                    {
                    // InternalAedit.g:1944:2: ( 'double' )
                    // InternalAedit.g:1945:3: 'double'
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
                    // InternalAedit.g:1950:2: ( 'string' )
                    {
                    // InternalAedit.g:1950:2: ( 'string' )
                    // InternalAedit.g:1951:3: 'string'
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
                    // InternalAedit.g:1956:2: ( 'long' )
                    {
                    // InternalAedit.g:1956:2: ( 'long' )
                    // InternalAedit.g:1957:3: 'long'
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
                    // InternalAedit.g:1962:2: ( 'boolean' )
                    {
                    // InternalAedit.g:1962:2: ( 'boolean' )
                    // InternalAedit.g:1963:3: 'boolean'
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
                    // InternalAedit.g:1968:2: ( 'float' )
                    {
                    // InternalAedit.g:1968:2: ( 'float' )
                    // InternalAedit.g:1969:3: 'float'
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
    // InternalAedit.g:1978:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1982:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAedit.g:1983:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalAedit.g:1990:1: rule__Model__Group__0__Impl : ( ( rule__Model__RuleDeclarationsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1994:1: ( ( ( rule__Model__RuleDeclarationsAssignment_0 )* ) )
            // InternalAedit.g:1995:1: ( ( rule__Model__RuleDeclarationsAssignment_0 )* )
            {
            // InternalAedit.g:1995:1: ( ( rule__Model__RuleDeclarationsAssignment_0 )* )
            // InternalAedit.g:1996:2: ( rule__Model__RuleDeclarationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRuleDeclarationsAssignment_0()); 
            }
            // InternalAedit.g:1997:2: ( rule__Model__RuleDeclarationsAssignment_0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAedit.g:1997:3: rule__Model__RuleDeclarationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__RuleDeclarationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalAedit.g:2005:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2009:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAedit.g:2010:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalAedit.g:2017:1: rule__Model__Group__1__Impl : ( ( rule__Model__RuleMapsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2021:1: ( ( ( rule__Model__RuleMapsAssignment_1 )* ) )
            // InternalAedit.g:2022:1: ( ( rule__Model__RuleMapsAssignment_1 )* )
            {
            // InternalAedit.g:2022:1: ( ( rule__Model__RuleMapsAssignment_1 )* )
            // InternalAedit.g:2023:2: ( rule__Model__RuleMapsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRuleMapsAssignment_1()); 
            }
            // InternalAedit.g:2024:2: ( rule__Model__RuleMapsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAedit.g:2024:3: rule__Model__RuleMapsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__RuleMapsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalAedit.g:2032:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2036:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalAedit.g:2037:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalAedit.g:2044:1: rule__Model__Group__2__Impl : ( ( rule__Model__FeaturesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2048:1: ( ( ( rule__Model__FeaturesAssignment_2 )* ) )
            // InternalAedit.g:2049:1: ( ( rule__Model__FeaturesAssignment_2 )* )
            {
            // InternalAedit.g:2049:1: ( ( rule__Model__FeaturesAssignment_2 )* )
            // InternalAedit.g:2050:2: ( rule__Model__FeaturesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFeaturesAssignment_2()); 
            }
            // InternalAedit.g:2051:2: ( rule__Model__FeaturesAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAedit.g:2051:3: rule__Model__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__FeaturesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalAedit.g:2059:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2063:1: ( rule__Model__Group__3__Impl )
            // InternalAedit.g:2064:2: rule__Model__Group__3__Impl
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
    // InternalAedit.g:2070:1: rule__Model__Group__3__Impl : ( ( rule__Model__FeatureMapsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2074:1: ( ( ( rule__Model__FeatureMapsAssignment_3 )* ) )
            // InternalAedit.g:2075:1: ( ( rule__Model__FeatureMapsAssignment_3 )* )
            {
            // InternalAedit.g:2075:1: ( ( rule__Model__FeatureMapsAssignment_3 )* )
            // InternalAedit.g:2076:2: ( rule__Model__FeatureMapsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFeatureMapsAssignment_3()); 
            }
            // InternalAedit.g:2077:2: ( rule__Model__FeatureMapsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAedit.g:2077:3: rule__Model__FeatureMapsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__FeatureMapsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalAedit.g:2086:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2090:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalAedit.g:2091:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
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
    // InternalAedit.g:2098:1: rule__Feature__Group__0__Impl : ( 'feature' ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2102:1: ( ( 'feature' ) )
            // InternalAedit.g:2103:1: ( 'feature' )
            {
            // InternalAedit.g:2103:1: ( 'feature' )
            // InternalAedit.g:2104:2: 'feature'
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
    // InternalAedit.g:2113:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2117:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalAedit.g:2118:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // InternalAedit.g:2125:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2129:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalAedit.g:2130:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalAedit.g:2130:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalAedit.g:2131:2: ( rule__Feature__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            }
            // InternalAedit.g:2132:2: ( rule__Feature__NameAssignment_1 )
            // InternalAedit.g:2132:3: rule__Feature__NameAssignment_1
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
    // InternalAedit.g:2140:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2144:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalAedit.g:2145:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
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
    // InternalAedit.g:2152:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__Group_2__0 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2156:1: ( ( ( rule__Feature__Group_2__0 )? ) )
            // InternalAedit.g:2157:1: ( ( rule__Feature__Group_2__0 )? )
            {
            // InternalAedit.g:2157:1: ( ( rule__Feature__Group_2__0 )? )
            // InternalAedit.g:2158:2: ( rule__Feature__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getGroup_2()); 
            }
            // InternalAedit.g:2159:2: ( rule__Feature__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAedit.g:2159:3: rule__Feature__Group_2__0
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
    // InternalAedit.g:2167:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2171:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalAedit.g:2172:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
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
    // InternalAedit.g:2179:1: rule__Feature__Group__3__Impl : ( '{' ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2183:1: ( ( '{' ) )
            // InternalAedit.g:2184:1: ( '{' )
            {
            // InternalAedit.g:2184:1: ( '{' )
            // InternalAedit.g:2185:2: '{'
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
    // InternalAedit.g:2194:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2198:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalAedit.g:2199:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
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
    // InternalAedit.g:2206:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__RuleMapsAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2210:1: ( ( ( rule__Feature__RuleMapsAssignment_4 )* ) )
            // InternalAedit.g:2211:1: ( ( rule__Feature__RuleMapsAssignment_4 )* )
            {
            // InternalAedit.g:2211:1: ( ( rule__Feature__RuleMapsAssignment_4 )* )
            // InternalAedit.g:2212:2: ( rule__Feature__RuleMapsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getRuleMapsAssignment_4()); 
            }
            // InternalAedit.g:2213:2: ( rule__Feature__RuleMapsAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAedit.g:2213:3: rule__Feature__RuleMapsAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Feature__RuleMapsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalAedit.g:2221:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2225:1: ( rule__Feature__Group__5__Impl )
            // InternalAedit.g:2226:2: rule__Feature__Group__5__Impl
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
    // InternalAedit.g:2232:1: rule__Feature__Group__5__Impl : ( '}' ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2236:1: ( ( '}' ) )
            // InternalAedit.g:2237:1: ( '}' )
            {
            // InternalAedit.g:2237:1: ( '}' )
            // InternalAedit.g:2238:2: '}'
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
    // InternalAedit.g:2248:1: rule__Feature__Group_2__0 : rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 ;
    public final void rule__Feature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2252:1: ( rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 )
            // InternalAedit.g:2253:2: rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1
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
    // InternalAedit.g:2260:1: rule__Feature__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Feature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2264:1: ( ( ':' ) )
            // InternalAedit.g:2265:1: ( ':' )
            {
            // InternalAedit.g:2265:1: ( ':' )
            // InternalAedit.g:2266:2: ':'
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
    // InternalAedit.g:2275:1: rule__Feature__Group_2__1 : rule__Feature__Group_2__1__Impl ;
    public final void rule__Feature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2279:1: ( rule__Feature__Group_2__1__Impl )
            // InternalAedit.g:2280:2: rule__Feature__Group_2__1__Impl
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
    // InternalAedit.g:2286:1: rule__Feature__Group_2__1__Impl : ( ( rule__Feature__ExtendAssignment_2_1 ) ) ;
    public final void rule__Feature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2290:1: ( ( ( rule__Feature__ExtendAssignment_2_1 ) ) )
            // InternalAedit.g:2291:1: ( ( rule__Feature__ExtendAssignment_2_1 ) )
            {
            // InternalAedit.g:2291:1: ( ( rule__Feature__ExtendAssignment_2_1 ) )
            // InternalAedit.g:2292:2: ( rule__Feature__ExtendAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getExtendAssignment_2_1()); 
            }
            // InternalAedit.g:2293:2: ( rule__Feature__ExtendAssignment_2_1 )
            // InternalAedit.g:2293:3: rule__Feature__ExtendAssignment_2_1
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
    // InternalAedit.g:2302:1: rule__FeatureMap__Group__0 : rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1 ;
    public final void rule__FeatureMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2306:1: ( rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1 )
            // InternalAedit.g:2307:2: rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1
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
    // InternalAedit.g:2314:1: rule__FeatureMap__Group__0__Impl : ( 'use' ) ;
    public final void rule__FeatureMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2318:1: ( ( 'use' ) )
            // InternalAedit.g:2319:1: ( 'use' )
            {
            // InternalAedit.g:2319:1: ( 'use' )
            // InternalAedit.g:2320:2: 'use'
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
    // InternalAedit.g:2329:1: rule__FeatureMap__Group__1 : rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2 ;
    public final void rule__FeatureMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2333:1: ( rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2 )
            // InternalAedit.g:2334:2: rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2
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
    // InternalAedit.g:2341:1: rule__FeatureMap__Group__1__Impl : ( ( rule__FeatureMap__NameAssignment_1 ) ) ;
    public final void rule__FeatureMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2345:1: ( ( ( rule__FeatureMap__NameAssignment_1 ) ) )
            // InternalAedit.g:2346:1: ( ( rule__FeatureMap__NameAssignment_1 ) )
            {
            // InternalAedit.g:2346:1: ( ( rule__FeatureMap__NameAssignment_1 ) )
            // InternalAedit.g:2347:2: ( rule__FeatureMap__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureMapAccess().getNameAssignment_1()); 
            }
            // InternalAedit.g:2348:2: ( rule__FeatureMap__NameAssignment_1 )
            // InternalAedit.g:2348:3: rule__FeatureMap__NameAssignment_1
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
    // InternalAedit.g:2356:1: rule__FeatureMap__Group__2 : rule__FeatureMap__Group__2__Impl ;
    public final void rule__FeatureMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2360:1: ( rule__FeatureMap__Group__2__Impl )
            // InternalAedit.g:2361:2: rule__FeatureMap__Group__2__Impl
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
    // InternalAedit.g:2367:1: rule__FeatureMap__Group__2__Impl : ( ';' ) ;
    public final void rule__FeatureMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2371:1: ( ( ';' ) )
            // InternalAedit.g:2372:1: ( ';' )
            {
            // InternalAedit.g:2372:1: ( ';' )
            // InternalAedit.g:2373:2: ';'
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
    // InternalAedit.g:2383:1: rule__RuleMap__Group__0 : rule__RuleMap__Group__0__Impl rule__RuleMap__Group__1 ;
    public final void rule__RuleMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2387:1: ( rule__RuleMap__Group__0__Impl rule__RuleMap__Group__1 )
            // InternalAedit.g:2388:2: rule__RuleMap__Group__0__Impl rule__RuleMap__Group__1
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
    // InternalAedit.g:2395:1: rule__RuleMap__Group__0__Impl : ( 'ruleset' ) ;
    public final void rule__RuleMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2399:1: ( ( 'ruleset' ) )
            // InternalAedit.g:2400:1: ( 'ruleset' )
            {
            // InternalAedit.g:2400:1: ( 'ruleset' )
            // InternalAedit.g:2401:2: 'ruleset'
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
    // InternalAedit.g:2410:1: rule__RuleMap__Group__1 : rule__RuleMap__Group__1__Impl rule__RuleMap__Group__2 ;
    public final void rule__RuleMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2414:1: ( rule__RuleMap__Group__1__Impl rule__RuleMap__Group__2 )
            // InternalAedit.g:2415:2: rule__RuleMap__Group__1__Impl rule__RuleMap__Group__2
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
    // InternalAedit.g:2422:1: rule__RuleMap__Group__1__Impl : ( ( rule__RuleMap__NameAssignment_1 ) ) ;
    public final void rule__RuleMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2426:1: ( ( ( rule__RuleMap__NameAssignment_1 ) ) )
            // InternalAedit.g:2427:1: ( ( rule__RuleMap__NameAssignment_1 ) )
            {
            // InternalAedit.g:2427:1: ( ( rule__RuleMap__NameAssignment_1 ) )
            // InternalAedit.g:2428:2: ( rule__RuleMap__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleMapAccess().getNameAssignment_1()); 
            }
            // InternalAedit.g:2429:2: ( rule__RuleMap__NameAssignment_1 )
            // InternalAedit.g:2429:3: rule__RuleMap__NameAssignment_1
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
    // InternalAedit.g:2437:1: rule__RuleMap__Group__2 : rule__RuleMap__Group__2__Impl rule__RuleMap__Group__3 ;
    public final void rule__RuleMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2441:1: ( rule__RuleMap__Group__2__Impl rule__RuleMap__Group__3 )
            // InternalAedit.g:2442:2: rule__RuleMap__Group__2__Impl rule__RuleMap__Group__3
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
    // InternalAedit.g:2449:1: rule__RuleMap__Group__2__Impl : ( '{' ) ;
    public final void rule__RuleMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2453:1: ( ( '{' ) )
            // InternalAedit.g:2454:1: ( '{' )
            {
            // InternalAedit.g:2454:1: ( '{' )
            // InternalAedit.g:2455:2: '{'
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
    // InternalAedit.g:2464:1: rule__RuleMap__Group__3 : rule__RuleMap__Group__3__Impl rule__RuleMap__Group__4 ;
    public final void rule__RuleMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2468:1: ( rule__RuleMap__Group__3__Impl rule__RuleMap__Group__4 )
            // InternalAedit.g:2469:2: rule__RuleMap__Group__3__Impl rule__RuleMap__Group__4
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
    // InternalAedit.g:2476:1: rule__RuleMap__Group__3__Impl : ( ( rule__RuleMap__RulesAssignment_3 )* ) ;
    public final void rule__RuleMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2480:1: ( ( ( rule__RuleMap__RulesAssignment_3 )* ) )
            // InternalAedit.g:2481:1: ( ( rule__RuleMap__RulesAssignment_3 )* )
            {
            // InternalAedit.g:2481:1: ( ( rule__RuleMap__RulesAssignment_3 )* )
            // InternalAedit.g:2482:2: ( rule__RuleMap__RulesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleMapAccess().getRulesAssignment_3()); 
            }
            // InternalAedit.g:2483:2: ( rule__RuleMap__RulesAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAedit.g:2483:3: rule__RuleMap__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RuleMap__RulesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalAedit.g:2491:1: rule__RuleMap__Group__4 : rule__RuleMap__Group__4__Impl ;
    public final void rule__RuleMap__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2495:1: ( rule__RuleMap__Group__4__Impl )
            // InternalAedit.g:2496:2: rule__RuleMap__Group__4__Impl
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
    // InternalAedit.g:2502:1: rule__RuleMap__Group__4__Impl : ( '}' ) ;
    public final void rule__RuleMap__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2506:1: ( ( '}' ) )
            // InternalAedit.g:2507:1: ( '}' )
            {
            // InternalAedit.g:2507:1: ( '}' )
            // InternalAedit.g:2508:2: '}'
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
    // InternalAedit.g:2518:1: rule__RuleDeclaration__Group__0 : rule__RuleDeclaration__Group__0__Impl rule__RuleDeclaration__Group__1 ;
    public final void rule__RuleDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2522:1: ( rule__RuleDeclaration__Group__0__Impl rule__RuleDeclaration__Group__1 )
            // InternalAedit.g:2523:2: rule__RuleDeclaration__Group__0__Impl rule__RuleDeclaration__Group__1
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
    // InternalAedit.g:2530:1: rule__RuleDeclaration__Group__0__Impl : ( 'rule' ) ;
    public final void rule__RuleDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2534:1: ( ( 'rule' ) )
            // InternalAedit.g:2535:1: ( 'rule' )
            {
            // InternalAedit.g:2535:1: ( 'rule' )
            // InternalAedit.g:2536:2: 'rule'
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
    // InternalAedit.g:2545:1: rule__RuleDeclaration__Group__1 : rule__RuleDeclaration__Group__1__Impl rule__RuleDeclaration__Group__2 ;
    public final void rule__RuleDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2549:1: ( rule__RuleDeclaration__Group__1__Impl rule__RuleDeclaration__Group__2 )
            // InternalAedit.g:2550:2: rule__RuleDeclaration__Group__1__Impl rule__RuleDeclaration__Group__2
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
    // InternalAedit.g:2557:1: rule__RuleDeclaration__Group__1__Impl : ( ( rule__RuleDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RuleDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2561:1: ( ( ( rule__RuleDeclaration__NameAssignment_1 ) ) )
            // InternalAedit.g:2562:1: ( ( rule__RuleDeclaration__NameAssignment_1 ) )
            {
            // InternalAedit.g:2562:1: ( ( rule__RuleDeclaration__NameAssignment_1 ) )
            // InternalAedit.g:2563:2: ( rule__RuleDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalAedit.g:2564:2: ( rule__RuleDeclaration__NameAssignment_1 )
            // InternalAedit.g:2564:3: rule__RuleDeclaration__NameAssignment_1
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
    // InternalAedit.g:2572:1: rule__RuleDeclaration__Group__2 : rule__RuleDeclaration__Group__2__Impl rule__RuleDeclaration__Group__3 ;
    public final void rule__RuleDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2576:1: ( rule__RuleDeclaration__Group__2__Impl rule__RuleDeclaration__Group__3 )
            // InternalAedit.g:2577:2: rule__RuleDeclaration__Group__2__Impl rule__RuleDeclaration__Group__3
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
    // InternalAedit.g:2584:1: rule__RuleDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__RuleDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2588:1: ( ( '{' ) )
            // InternalAedit.g:2589:1: ( '{' )
            {
            // InternalAedit.g:2589:1: ( '{' )
            // InternalAedit.g:2590:2: '{'
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
    // InternalAedit.g:2599:1: rule__RuleDeclaration__Group__3 : rule__RuleDeclaration__Group__3__Impl rule__RuleDeclaration__Group__4 ;
    public final void rule__RuleDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2603:1: ( rule__RuleDeclaration__Group__3__Impl rule__RuleDeclaration__Group__4 )
            // InternalAedit.g:2604:2: rule__RuleDeclaration__Group__3__Impl rule__RuleDeclaration__Group__4
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
    // InternalAedit.g:2611:1: rule__RuleDeclaration__Group__3__Impl : ( ( rule__RuleDeclaration__RulesAssignment_3 )* ) ;
    public final void rule__RuleDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2615:1: ( ( ( rule__RuleDeclaration__RulesAssignment_3 )* ) )
            // InternalAedit.g:2616:1: ( ( rule__RuleDeclaration__RulesAssignment_3 )* )
            {
            // InternalAedit.g:2616:1: ( ( rule__RuleDeclaration__RulesAssignment_3 )* )
            // InternalAedit.g:2617:2: ( rule__RuleDeclaration__RulesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleDeclarationAccess().getRulesAssignment_3()); 
            }
            // InternalAedit.g:2618:2: ( rule__RuleDeclaration__RulesAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30||LA22_0==33||(LA22_0>=35 && LA22_0<=36)||(LA22_0>=41 && LA22_0<=42)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAedit.g:2618:3: rule__RuleDeclaration__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__RuleDeclaration__RulesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalAedit.g:2626:1: rule__RuleDeclaration__Group__4 : rule__RuleDeclaration__Group__4__Impl ;
    public final void rule__RuleDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2630:1: ( rule__RuleDeclaration__Group__4__Impl )
            // InternalAedit.g:2631:2: rule__RuleDeclaration__Group__4__Impl
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
    // InternalAedit.g:2637:1: rule__RuleDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__RuleDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2641:1: ( ( '}' ) )
            // InternalAedit.g:2642:1: ( '}' )
            {
            // InternalAedit.g:2642:1: ( '}' )
            // InternalAedit.g:2643:2: '}'
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
    // InternalAedit.g:2653:1: rule__AddAnnotationToSchema__Group__0 : rule__AddAnnotationToSchema__Group__0__Impl rule__AddAnnotationToSchema__Group__1 ;
    public final void rule__AddAnnotationToSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2657:1: ( rule__AddAnnotationToSchema__Group__0__Impl rule__AddAnnotationToSchema__Group__1 )
            // InternalAedit.g:2658:2: rule__AddAnnotationToSchema__Group__0__Impl rule__AddAnnotationToSchema__Group__1
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
    // InternalAedit.g:2665:1: rule__AddAnnotationToSchema__Group__0__Impl : ( 'add.annot' ) ;
    public final void rule__AddAnnotationToSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2669:1: ( ( 'add.annot' ) )
            // InternalAedit.g:2670:1: ( 'add.annot' )
            {
            // InternalAedit.g:2670:1: ( 'add.annot' )
            // InternalAedit.g:2671:2: 'add.annot'
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
    // InternalAedit.g:2680:1: rule__AddAnnotationToSchema__Group__1 : rule__AddAnnotationToSchema__Group__1__Impl rule__AddAnnotationToSchema__Group__2 ;
    public final void rule__AddAnnotationToSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2684:1: ( rule__AddAnnotationToSchema__Group__1__Impl rule__AddAnnotationToSchema__Group__2 )
            // InternalAedit.g:2685:2: rule__AddAnnotationToSchema__Group__1__Impl rule__AddAnnotationToSchema__Group__2
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
    // InternalAedit.g:2692:1: rule__AddAnnotationToSchema__Group__1__Impl : ( ( rule__AddAnnotationToSchema__SchemaTypeAssignment_1 ) ) ;
    public final void rule__AddAnnotationToSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2696:1: ( ( ( rule__AddAnnotationToSchema__SchemaTypeAssignment_1 ) ) )
            // InternalAedit.g:2697:1: ( ( rule__AddAnnotationToSchema__SchemaTypeAssignment_1 ) )
            {
            // InternalAedit.g:2697:1: ( ( rule__AddAnnotationToSchema__SchemaTypeAssignment_1 ) )
            // InternalAedit.g:2698:2: ( rule__AddAnnotationToSchema__SchemaTypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToSchemaAccess().getSchemaTypeAssignment_1()); 
            }
            // InternalAedit.g:2699:2: ( rule__AddAnnotationToSchema__SchemaTypeAssignment_1 )
            // InternalAedit.g:2699:3: rule__AddAnnotationToSchema__SchemaTypeAssignment_1
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
    // InternalAedit.g:2707:1: rule__AddAnnotationToSchema__Group__2 : rule__AddAnnotationToSchema__Group__2__Impl rule__AddAnnotationToSchema__Group__3 ;
    public final void rule__AddAnnotationToSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2711:1: ( rule__AddAnnotationToSchema__Group__2__Impl rule__AddAnnotationToSchema__Group__3 )
            // InternalAedit.g:2712:2: rule__AddAnnotationToSchema__Group__2__Impl rule__AddAnnotationToSchema__Group__3
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
    // InternalAedit.g:2719:1: rule__AddAnnotationToSchema__Group__2__Impl : ( ( rule__AddAnnotationToSchema__SchemaAssignment_2 ) ) ;
    public final void rule__AddAnnotationToSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2723:1: ( ( ( rule__AddAnnotationToSchema__SchemaAssignment_2 ) ) )
            // InternalAedit.g:2724:1: ( ( rule__AddAnnotationToSchema__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:2724:1: ( ( rule__AddAnnotationToSchema__SchemaAssignment_2 ) )
            // InternalAedit.g:2725:2: ( rule__AddAnnotationToSchema__SchemaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToSchemaAccess().getSchemaAssignment_2()); 
            }
            // InternalAedit.g:2726:2: ( rule__AddAnnotationToSchema__SchemaAssignment_2 )
            // InternalAedit.g:2726:3: rule__AddAnnotationToSchema__SchemaAssignment_2
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
    // InternalAedit.g:2734:1: rule__AddAnnotationToSchema__Group__3 : rule__AddAnnotationToSchema__Group__3__Impl rule__AddAnnotationToSchema__Group__4 ;
    public final void rule__AddAnnotationToSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2738:1: ( rule__AddAnnotationToSchema__Group__3__Impl rule__AddAnnotationToSchema__Group__4 )
            // InternalAedit.g:2739:2: rule__AddAnnotationToSchema__Group__3__Impl rule__AddAnnotationToSchema__Group__4
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
    // InternalAedit.g:2746:1: rule__AddAnnotationToSchema__Group__3__Impl : ( '=>' ) ;
    public final void rule__AddAnnotationToSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2750:1: ( ( '=>' ) )
            // InternalAedit.g:2751:1: ( '=>' )
            {
            // InternalAedit.g:2751:1: ( '=>' )
            // InternalAedit.g:2752:2: '=>'
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
    // InternalAedit.g:2761:1: rule__AddAnnotationToSchema__Group__4 : rule__AddAnnotationToSchema__Group__4__Impl rule__AddAnnotationToSchema__Group__5 ;
    public final void rule__AddAnnotationToSchema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2765:1: ( rule__AddAnnotationToSchema__Group__4__Impl rule__AddAnnotationToSchema__Group__5 )
            // InternalAedit.g:2766:2: rule__AddAnnotationToSchema__Group__4__Impl rule__AddAnnotationToSchema__Group__5
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
    // InternalAedit.g:2773:1: rule__AddAnnotationToSchema__Group__4__Impl : ( ( rule__AddAnnotationToSchema__AnnotationAssignment_4 ) ) ;
    public final void rule__AddAnnotationToSchema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2777:1: ( ( ( rule__AddAnnotationToSchema__AnnotationAssignment_4 ) ) )
            // InternalAedit.g:2778:1: ( ( rule__AddAnnotationToSchema__AnnotationAssignment_4 ) )
            {
            // InternalAedit.g:2778:1: ( ( rule__AddAnnotationToSchema__AnnotationAssignment_4 ) )
            // InternalAedit.g:2779:2: ( rule__AddAnnotationToSchema__AnnotationAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToSchemaAccess().getAnnotationAssignment_4()); 
            }
            // InternalAedit.g:2780:2: ( rule__AddAnnotationToSchema__AnnotationAssignment_4 )
            // InternalAedit.g:2780:3: rule__AddAnnotationToSchema__AnnotationAssignment_4
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
    // InternalAedit.g:2788:1: rule__AddAnnotationToSchema__Group__5 : rule__AddAnnotationToSchema__Group__5__Impl ;
    public final void rule__AddAnnotationToSchema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2792:1: ( rule__AddAnnotationToSchema__Group__5__Impl )
            // InternalAedit.g:2793:2: rule__AddAnnotationToSchema__Group__5__Impl
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
    // InternalAedit.g:2799:1: rule__AddAnnotationToSchema__Group__5__Impl : ( ';' ) ;
    public final void rule__AddAnnotationToSchema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2803:1: ( ( ';' ) )
            // InternalAedit.g:2804:1: ( ';' )
            {
            // InternalAedit.g:2804:1: ( ';' )
            // InternalAedit.g:2805:2: ';'
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
    // InternalAedit.g:2815:1: rule__AddAnnotationToField__Group__0 : rule__AddAnnotationToField__Group__0__Impl rule__AddAnnotationToField__Group__1 ;
    public final void rule__AddAnnotationToField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2819:1: ( rule__AddAnnotationToField__Group__0__Impl rule__AddAnnotationToField__Group__1 )
            // InternalAedit.g:2820:2: rule__AddAnnotationToField__Group__0__Impl rule__AddAnnotationToField__Group__1
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
    // InternalAedit.g:2827:1: rule__AddAnnotationToField__Group__0__Impl : ( 'add.annot' ) ;
    public final void rule__AddAnnotationToField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2831:1: ( ( 'add.annot' ) )
            // InternalAedit.g:2832:1: ( 'add.annot' )
            {
            // InternalAedit.g:2832:1: ( 'add.annot' )
            // InternalAedit.g:2833:2: 'add.annot'
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
    // InternalAedit.g:2842:1: rule__AddAnnotationToField__Group__1 : rule__AddAnnotationToField__Group__1__Impl rule__AddAnnotationToField__Group__2 ;
    public final void rule__AddAnnotationToField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2846:1: ( rule__AddAnnotationToField__Group__1__Impl rule__AddAnnotationToField__Group__2 )
            // InternalAedit.g:2847:2: rule__AddAnnotationToField__Group__1__Impl rule__AddAnnotationToField__Group__2
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
    // InternalAedit.g:2854:1: rule__AddAnnotationToField__Group__1__Impl : ( ( rule__AddAnnotationToField__VariableAssignment_1 ) ) ;
    public final void rule__AddAnnotationToField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2858:1: ( ( ( rule__AddAnnotationToField__VariableAssignment_1 ) ) )
            // InternalAedit.g:2859:1: ( ( rule__AddAnnotationToField__VariableAssignment_1 ) )
            {
            // InternalAedit.g:2859:1: ( ( rule__AddAnnotationToField__VariableAssignment_1 ) )
            // InternalAedit.g:2860:2: ( rule__AddAnnotationToField__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToFieldAccess().getVariableAssignment_1()); 
            }
            // InternalAedit.g:2861:2: ( rule__AddAnnotationToField__VariableAssignment_1 )
            // InternalAedit.g:2861:3: rule__AddAnnotationToField__VariableAssignment_1
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
    // InternalAedit.g:2869:1: rule__AddAnnotationToField__Group__2 : rule__AddAnnotationToField__Group__2__Impl rule__AddAnnotationToField__Group__3 ;
    public final void rule__AddAnnotationToField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2873:1: ( rule__AddAnnotationToField__Group__2__Impl rule__AddAnnotationToField__Group__3 )
            // InternalAedit.g:2874:2: rule__AddAnnotationToField__Group__2__Impl rule__AddAnnotationToField__Group__3
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
    // InternalAedit.g:2881:1: rule__AddAnnotationToField__Group__2__Impl : ( '=>' ) ;
    public final void rule__AddAnnotationToField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2885:1: ( ( '=>' ) )
            // InternalAedit.g:2886:1: ( '=>' )
            {
            // InternalAedit.g:2886:1: ( '=>' )
            // InternalAedit.g:2887:2: '=>'
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
    // InternalAedit.g:2896:1: rule__AddAnnotationToField__Group__3 : rule__AddAnnotationToField__Group__3__Impl rule__AddAnnotationToField__Group__4 ;
    public final void rule__AddAnnotationToField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2900:1: ( rule__AddAnnotationToField__Group__3__Impl rule__AddAnnotationToField__Group__4 )
            // InternalAedit.g:2901:2: rule__AddAnnotationToField__Group__3__Impl rule__AddAnnotationToField__Group__4
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
    // InternalAedit.g:2908:1: rule__AddAnnotationToField__Group__3__Impl : ( ( rule__AddAnnotationToField__AnnotationAssignment_3 ) ) ;
    public final void rule__AddAnnotationToField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2912:1: ( ( ( rule__AddAnnotationToField__AnnotationAssignment_3 ) ) )
            // InternalAedit.g:2913:1: ( ( rule__AddAnnotationToField__AnnotationAssignment_3 ) )
            {
            // InternalAedit.g:2913:1: ( ( rule__AddAnnotationToField__AnnotationAssignment_3 ) )
            // InternalAedit.g:2914:2: ( rule__AddAnnotationToField__AnnotationAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToFieldAccess().getAnnotationAssignment_3()); 
            }
            // InternalAedit.g:2915:2: ( rule__AddAnnotationToField__AnnotationAssignment_3 )
            // InternalAedit.g:2915:3: rule__AddAnnotationToField__AnnotationAssignment_3
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
    // InternalAedit.g:2923:1: rule__AddAnnotationToField__Group__4 : rule__AddAnnotationToField__Group__4__Impl ;
    public final void rule__AddAnnotationToField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2927:1: ( rule__AddAnnotationToField__Group__4__Impl )
            // InternalAedit.g:2928:2: rule__AddAnnotationToField__Group__4__Impl
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
    // InternalAedit.g:2934:1: rule__AddAnnotationToField__Group__4__Impl : ( ';' ) ;
    public final void rule__AddAnnotationToField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2938:1: ( ( ';' ) )
            // InternalAedit.g:2939:1: ( ';' )
            {
            // InternalAedit.g:2939:1: ( ';' )
            // InternalAedit.g:2940:2: ';'
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
    // InternalAedit.g:2950:1: rule__AddNameAnnotationToField__Group__0 : rule__AddNameAnnotationToField__Group__0__Impl rule__AddNameAnnotationToField__Group__1 ;
    public final void rule__AddNameAnnotationToField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2954:1: ( rule__AddNameAnnotationToField__Group__0__Impl rule__AddNameAnnotationToField__Group__1 )
            // InternalAedit.g:2955:2: rule__AddNameAnnotationToField__Group__0__Impl rule__AddNameAnnotationToField__Group__1
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
    // InternalAedit.g:2962:1: rule__AddNameAnnotationToField__Group__0__Impl : ( 'add.name_annot' ) ;
    public final void rule__AddNameAnnotationToField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2966:1: ( ( 'add.name_annot' ) )
            // InternalAedit.g:2967:1: ( 'add.name_annot' )
            {
            // InternalAedit.g:2967:1: ( 'add.name_annot' )
            // InternalAedit.g:2968:2: 'add.name_annot'
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
    // InternalAedit.g:2977:1: rule__AddNameAnnotationToField__Group__1 : rule__AddNameAnnotationToField__Group__1__Impl rule__AddNameAnnotationToField__Group__2 ;
    public final void rule__AddNameAnnotationToField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2981:1: ( rule__AddNameAnnotationToField__Group__1__Impl rule__AddNameAnnotationToField__Group__2 )
            // InternalAedit.g:2982:2: rule__AddNameAnnotationToField__Group__1__Impl rule__AddNameAnnotationToField__Group__2
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
    // InternalAedit.g:2989:1: rule__AddNameAnnotationToField__Group__1__Impl : ( ( rule__AddNameAnnotationToField__VariableAssignment_1 ) ) ;
    public final void rule__AddNameAnnotationToField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2993:1: ( ( ( rule__AddNameAnnotationToField__VariableAssignment_1 ) ) )
            // InternalAedit.g:2994:1: ( ( rule__AddNameAnnotationToField__VariableAssignment_1 ) )
            {
            // InternalAedit.g:2994:1: ( ( rule__AddNameAnnotationToField__VariableAssignment_1 ) )
            // InternalAedit.g:2995:2: ( rule__AddNameAnnotationToField__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddNameAnnotationToFieldAccess().getVariableAssignment_1()); 
            }
            // InternalAedit.g:2996:2: ( rule__AddNameAnnotationToField__VariableAssignment_1 )
            // InternalAedit.g:2996:3: rule__AddNameAnnotationToField__VariableAssignment_1
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
    // InternalAedit.g:3004:1: rule__AddNameAnnotationToField__Group__2 : rule__AddNameAnnotationToField__Group__2__Impl rule__AddNameAnnotationToField__Group__3 ;
    public final void rule__AddNameAnnotationToField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3008:1: ( rule__AddNameAnnotationToField__Group__2__Impl rule__AddNameAnnotationToField__Group__3 )
            // InternalAedit.g:3009:2: rule__AddNameAnnotationToField__Group__2__Impl rule__AddNameAnnotationToField__Group__3
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
    // InternalAedit.g:3016:1: rule__AddNameAnnotationToField__Group__2__Impl : ( '=>' ) ;
    public final void rule__AddNameAnnotationToField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3020:1: ( ( '=>' ) )
            // InternalAedit.g:3021:1: ( '=>' )
            {
            // InternalAedit.g:3021:1: ( '=>' )
            // InternalAedit.g:3022:2: '=>'
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
    // InternalAedit.g:3031:1: rule__AddNameAnnotationToField__Group__3 : rule__AddNameAnnotationToField__Group__3__Impl rule__AddNameAnnotationToField__Group__4 ;
    public final void rule__AddNameAnnotationToField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3035:1: ( rule__AddNameAnnotationToField__Group__3__Impl rule__AddNameAnnotationToField__Group__4 )
            // InternalAedit.g:3036:2: rule__AddNameAnnotationToField__Group__3__Impl rule__AddNameAnnotationToField__Group__4
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
    // InternalAedit.g:3043:1: rule__AddNameAnnotationToField__Group__3__Impl : ( ( rule__AddNameAnnotationToField__AnnotationAssignment_3 ) ) ;
    public final void rule__AddNameAnnotationToField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3047:1: ( ( ( rule__AddNameAnnotationToField__AnnotationAssignment_3 ) ) )
            // InternalAedit.g:3048:1: ( ( rule__AddNameAnnotationToField__AnnotationAssignment_3 ) )
            {
            // InternalAedit.g:3048:1: ( ( rule__AddNameAnnotationToField__AnnotationAssignment_3 ) )
            // InternalAedit.g:3049:2: ( rule__AddNameAnnotationToField__AnnotationAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddNameAnnotationToFieldAccess().getAnnotationAssignment_3()); 
            }
            // InternalAedit.g:3050:2: ( rule__AddNameAnnotationToField__AnnotationAssignment_3 )
            // InternalAedit.g:3050:3: rule__AddNameAnnotationToField__AnnotationAssignment_3
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
    // InternalAedit.g:3058:1: rule__AddNameAnnotationToField__Group__4 : rule__AddNameAnnotationToField__Group__4__Impl ;
    public final void rule__AddNameAnnotationToField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3062:1: ( rule__AddNameAnnotationToField__Group__4__Impl )
            // InternalAedit.g:3063:2: rule__AddNameAnnotationToField__Group__4__Impl
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
    // InternalAedit.g:3069:1: rule__AddNameAnnotationToField__Group__4__Impl : ( ';' ) ;
    public final void rule__AddNameAnnotationToField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3073:1: ( ( ';' ) )
            // InternalAedit.g:3074:1: ( ';' )
            {
            // InternalAedit.g:3074:1: ( ';' )
            // InternalAedit.g:3075:2: ';'
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
    // InternalAedit.g:3085:1: rule__RemoveAnnotationFromSchema__Group__0 : rule__RemoveAnnotationFromSchema__Group__0__Impl rule__RemoveAnnotationFromSchema__Group__1 ;
    public final void rule__RemoveAnnotationFromSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3089:1: ( rule__RemoveAnnotationFromSchema__Group__0__Impl rule__RemoveAnnotationFromSchema__Group__1 )
            // InternalAedit.g:3090:2: rule__RemoveAnnotationFromSchema__Group__0__Impl rule__RemoveAnnotationFromSchema__Group__1
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
    // InternalAedit.g:3097:1: rule__RemoveAnnotationFromSchema__Group__0__Impl : ( 'remove.annot' ) ;
    public final void rule__RemoveAnnotationFromSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3101:1: ( ( 'remove.annot' ) )
            // InternalAedit.g:3102:1: ( 'remove.annot' )
            {
            // InternalAedit.g:3102:1: ( 'remove.annot' )
            // InternalAedit.g:3103:2: 'remove.annot'
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
    // InternalAedit.g:3112:1: rule__RemoveAnnotationFromSchema__Group__1 : rule__RemoveAnnotationFromSchema__Group__1__Impl rule__RemoveAnnotationFromSchema__Group__2 ;
    public final void rule__RemoveAnnotationFromSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3116:1: ( rule__RemoveAnnotationFromSchema__Group__1__Impl rule__RemoveAnnotationFromSchema__Group__2 )
            // InternalAedit.g:3117:2: rule__RemoveAnnotationFromSchema__Group__1__Impl rule__RemoveAnnotationFromSchema__Group__2
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
    // InternalAedit.g:3124:1: rule__RemoveAnnotationFromSchema__Group__1__Impl : ( ( rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1 ) ) ;
    public final void rule__RemoveAnnotationFromSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3128:1: ( ( ( rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1 ) ) )
            // InternalAedit.g:3129:1: ( ( rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1 ) )
            {
            // InternalAedit.g:3129:1: ( ( rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1 ) )
            // InternalAedit.g:3130:2: ( rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaAccess().getSchemaTypeAssignment_1()); 
            }
            // InternalAedit.g:3131:2: ( rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1 )
            // InternalAedit.g:3131:3: rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1
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
    // InternalAedit.g:3139:1: rule__RemoveAnnotationFromSchema__Group__2 : rule__RemoveAnnotationFromSchema__Group__2__Impl rule__RemoveAnnotationFromSchema__Group__3 ;
    public final void rule__RemoveAnnotationFromSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3143:1: ( rule__RemoveAnnotationFromSchema__Group__2__Impl rule__RemoveAnnotationFromSchema__Group__3 )
            // InternalAedit.g:3144:2: rule__RemoveAnnotationFromSchema__Group__2__Impl rule__RemoveAnnotationFromSchema__Group__3
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
    // InternalAedit.g:3151:1: rule__RemoveAnnotationFromSchema__Group__2__Impl : ( ( rule__RemoveAnnotationFromSchema__SchemaAssignment_2 ) ) ;
    public final void rule__RemoveAnnotationFromSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3155:1: ( ( ( rule__RemoveAnnotationFromSchema__SchemaAssignment_2 ) ) )
            // InternalAedit.g:3156:1: ( ( rule__RemoveAnnotationFromSchema__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:3156:1: ( ( rule__RemoveAnnotationFromSchema__SchemaAssignment_2 ) )
            // InternalAedit.g:3157:2: ( rule__RemoveAnnotationFromSchema__SchemaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaAccess().getSchemaAssignment_2()); 
            }
            // InternalAedit.g:3158:2: ( rule__RemoveAnnotationFromSchema__SchemaAssignment_2 )
            // InternalAedit.g:3158:3: rule__RemoveAnnotationFromSchema__SchemaAssignment_2
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
    // InternalAedit.g:3166:1: rule__RemoveAnnotationFromSchema__Group__3 : rule__RemoveAnnotationFromSchema__Group__3__Impl rule__RemoveAnnotationFromSchema__Group__4 ;
    public final void rule__RemoveAnnotationFromSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3170:1: ( rule__RemoveAnnotationFromSchema__Group__3__Impl rule__RemoveAnnotationFromSchema__Group__4 )
            // InternalAedit.g:3171:2: rule__RemoveAnnotationFromSchema__Group__3__Impl rule__RemoveAnnotationFromSchema__Group__4
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
    // InternalAedit.g:3178:1: rule__RemoveAnnotationFromSchema__Group__3__Impl : ( '=>' ) ;
    public final void rule__RemoveAnnotationFromSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3182:1: ( ( '=>' ) )
            // InternalAedit.g:3183:1: ( '=>' )
            {
            // InternalAedit.g:3183:1: ( '=>' )
            // InternalAedit.g:3184:2: '=>'
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
    // InternalAedit.g:3193:1: rule__RemoveAnnotationFromSchema__Group__4 : rule__RemoveAnnotationFromSchema__Group__4__Impl rule__RemoveAnnotationFromSchema__Group__5 ;
    public final void rule__RemoveAnnotationFromSchema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3197:1: ( rule__RemoveAnnotationFromSchema__Group__4__Impl rule__RemoveAnnotationFromSchema__Group__5 )
            // InternalAedit.g:3198:2: rule__RemoveAnnotationFromSchema__Group__4__Impl rule__RemoveAnnotationFromSchema__Group__5
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
    // InternalAedit.g:3205:1: rule__RemoveAnnotationFromSchema__Group__4__Impl : ( ( rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4 ) ) ;
    public final void rule__RemoveAnnotationFromSchema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3209:1: ( ( ( rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4 ) ) )
            // InternalAedit.g:3210:1: ( ( rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4 ) )
            {
            // InternalAedit.g:3210:1: ( ( rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4 ) )
            // InternalAedit.g:3211:2: ( rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaAccess().getAnnotationToRemoveAssignment_4()); 
            }
            // InternalAedit.g:3212:2: ( rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4 )
            // InternalAedit.g:3212:3: rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4
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
    // InternalAedit.g:3220:1: rule__RemoveAnnotationFromSchema__Group__5 : rule__RemoveAnnotationFromSchema__Group__5__Impl ;
    public final void rule__RemoveAnnotationFromSchema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3224:1: ( rule__RemoveAnnotationFromSchema__Group__5__Impl )
            // InternalAedit.g:3225:2: rule__RemoveAnnotationFromSchema__Group__5__Impl
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
    // InternalAedit.g:3231:1: rule__RemoveAnnotationFromSchema__Group__5__Impl : ( ';' ) ;
    public final void rule__RemoveAnnotationFromSchema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3235:1: ( ( ';' ) )
            // InternalAedit.g:3236:1: ( ';' )
            {
            // InternalAedit.g:3236:1: ( ';' )
            // InternalAedit.g:3237:2: ';'
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
    // InternalAedit.g:3247:1: rule__RemoveAnnotationFromField__Group__0 : rule__RemoveAnnotationFromField__Group__0__Impl rule__RemoveAnnotationFromField__Group__1 ;
    public final void rule__RemoveAnnotationFromField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3251:1: ( rule__RemoveAnnotationFromField__Group__0__Impl rule__RemoveAnnotationFromField__Group__1 )
            // InternalAedit.g:3252:2: rule__RemoveAnnotationFromField__Group__0__Impl rule__RemoveAnnotationFromField__Group__1
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
    // InternalAedit.g:3259:1: rule__RemoveAnnotationFromField__Group__0__Impl : ( 'remove.annot' ) ;
    public final void rule__RemoveAnnotationFromField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3263:1: ( ( 'remove.annot' ) )
            // InternalAedit.g:3264:1: ( 'remove.annot' )
            {
            // InternalAedit.g:3264:1: ( 'remove.annot' )
            // InternalAedit.g:3265:2: 'remove.annot'
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
    // InternalAedit.g:3274:1: rule__RemoveAnnotationFromField__Group__1 : rule__RemoveAnnotationFromField__Group__1__Impl rule__RemoveAnnotationFromField__Group__2 ;
    public final void rule__RemoveAnnotationFromField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3278:1: ( rule__RemoveAnnotationFromField__Group__1__Impl rule__RemoveAnnotationFromField__Group__2 )
            // InternalAedit.g:3279:2: rule__RemoveAnnotationFromField__Group__1__Impl rule__RemoveAnnotationFromField__Group__2
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
    // InternalAedit.g:3286:1: rule__RemoveAnnotationFromField__Group__1__Impl : ( ( rule__RemoveAnnotationFromField__VariableAssignment_1 ) ) ;
    public final void rule__RemoveAnnotationFromField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3290:1: ( ( ( rule__RemoveAnnotationFromField__VariableAssignment_1 ) ) )
            // InternalAedit.g:3291:1: ( ( rule__RemoveAnnotationFromField__VariableAssignment_1 ) )
            {
            // InternalAedit.g:3291:1: ( ( rule__RemoveAnnotationFromField__VariableAssignment_1 ) )
            // InternalAedit.g:3292:2: ( rule__RemoveAnnotationFromField__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromFieldAccess().getVariableAssignment_1()); 
            }
            // InternalAedit.g:3293:2: ( rule__RemoveAnnotationFromField__VariableAssignment_1 )
            // InternalAedit.g:3293:3: rule__RemoveAnnotationFromField__VariableAssignment_1
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
    // InternalAedit.g:3301:1: rule__RemoveAnnotationFromField__Group__2 : rule__RemoveAnnotationFromField__Group__2__Impl rule__RemoveAnnotationFromField__Group__3 ;
    public final void rule__RemoveAnnotationFromField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3305:1: ( rule__RemoveAnnotationFromField__Group__2__Impl rule__RemoveAnnotationFromField__Group__3 )
            // InternalAedit.g:3306:2: rule__RemoveAnnotationFromField__Group__2__Impl rule__RemoveAnnotationFromField__Group__3
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
    // InternalAedit.g:3313:1: rule__RemoveAnnotationFromField__Group__2__Impl : ( '=>' ) ;
    public final void rule__RemoveAnnotationFromField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3317:1: ( ( '=>' ) )
            // InternalAedit.g:3318:1: ( '=>' )
            {
            // InternalAedit.g:3318:1: ( '=>' )
            // InternalAedit.g:3319:2: '=>'
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
    // InternalAedit.g:3328:1: rule__RemoveAnnotationFromField__Group__3 : rule__RemoveAnnotationFromField__Group__3__Impl rule__RemoveAnnotationFromField__Group__4 ;
    public final void rule__RemoveAnnotationFromField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3332:1: ( rule__RemoveAnnotationFromField__Group__3__Impl rule__RemoveAnnotationFromField__Group__4 )
            // InternalAedit.g:3333:2: rule__RemoveAnnotationFromField__Group__3__Impl rule__RemoveAnnotationFromField__Group__4
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
    // InternalAedit.g:3340:1: rule__RemoveAnnotationFromField__Group__3__Impl : ( ( rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3 ) ) ;
    public final void rule__RemoveAnnotationFromField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3344:1: ( ( ( rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3 ) ) )
            // InternalAedit.g:3345:1: ( ( rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3 ) )
            {
            // InternalAedit.g:3345:1: ( ( rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3 ) )
            // InternalAedit.g:3346:2: ( rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromFieldAccess().getAnnotationToRemoveAssignment_3()); 
            }
            // InternalAedit.g:3347:2: ( rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3 )
            // InternalAedit.g:3347:3: rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3
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
    // InternalAedit.g:3355:1: rule__RemoveAnnotationFromField__Group__4 : rule__RemoveAnnotationFromField__Group__4__Impl ;
    public final void rule__RemoveAnnotationFromField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3359:1: ( rule__RemoveAnnotationFromField__Group__4__Impl )
            // InternalAedit.g:3360:2: rule__RemoveAnnotationFromField__Group__4__Impl
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
    // InternalAedit.g:3366:1: rule__RemoveAnnotationFromField__Group__4__Impl : ( ';' ) ;
    public final void rule__RemoveAnnotationFromField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3370:1: ( ( ';' ) )
            // InternalAedit.g:3371:1: ( ';' )
            {
            // InternalAedit.g:3371:1: ( ';' )
            // InternalAedit.g:3372:2: ';'
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
    // InternalAedit.g:3382:1: rule__RemoveNameAnnotationFromField__Group__0 : rule__RemoveNameAnnotationFromField__Group__0__Impl rule__RemoveNameAnnotationFromField__Group__1 ;
    public final void rule__RemoveNameAnnotationFromField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3386:1: ( rule__RemoveNameAnnotationFromField__Group__0__Impl rule__RemoveNameAnnotationFromField__Group__1 )
            // InternalAedit.g:3387:2: rule__RemoveNameAnnotationFromField__Group__0__Impl rule__RemoveNameAnnotationFromField__Group__1
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
    // InternalAedit.g:3394:1: rule__RemoveNameAnnotationFromField__Group__0__Impl : ( 'remove.name_annot' ) ;
    public final void rule__RemoveNameAnnotationFromField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3398:1: ( ( 'remove.name_annot' ) )
            // InternalAedit.g:3399:1: ( 'remove.name_annot' )
            {
            // InternalAedit.g:3399:1: ( 'remove.name_annot' )
            // InternalAedit.g:3400:2: 'remove.name_annot'
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
    // InternalAedit.g:3409:1: rule__RemoveNameAnnotationFromField__Group__1 : rule__RemoveNameAnnotationFromField__Group__1__Impl rule__RemoveNameAnnotationFromField__Group__2 ;
    public final void rule__RemoveNameAnnotationFromField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3413:1: ( rule__RemoveNameAnnotationFromField__Group__1__Impl rule__RemoveNameAnnotationFromField__Group__2 )
            // InternalAedit.g:3414:2: rule__RemoveNameAnnotationFromField__Group__1__Impl rule__RemoveNameAnnotationFromField__Group__2
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
    // InternalAedit.g:3421:1: rule__RemoveNameAnnotationFromField__Group__1__Impl : ( ( rule__RemoveNameAnnotationFromField__VariableAssignment_1 ) ) ;
    public final void rule__RemoveNameAnnotationFromField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3425:1: ( ( ( rule__RemoveNameAnnotationFromField__VariableAssignment_1 ) ) )
            // InternalAedit.g:3426:1: ( ( rule__RemoveNameAnnotationFromField__VariableAssignment_1 ) )
            {
            // InternalAedit.g:3426:1: ( ( rule__RemoveNameAnnotationFromField__VariableAssignment_1 ) )
            // InternalAedit.g:3427:2: ( rule__RemoveNameAnnotationFromField__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getVariableAssignment_1()); 
            }
            // InternalAedit.g:3428:2: ( rule__RemoveNameAnnotationFromField__VariableAssignment_1 )
            // InternalAedit.g:3428:3: rule__RemoveNameAnnotationFromField__VariableAssignment_1
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
    // InternalAedit.g:3436:1: rule__RemoveNameAnnotationFromField__Group__2 : rule__RemoveNameAnnotationFromField__Group__2__Impl rule__RemoveNameAnnotationFromField__Group__3 ;
    public final void rule__RemoveNameAnnotationFromField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3440:1: ( rule__RemoveNameAnnotationFromField__Group__2__Impl rule__RemoveNameAnnotationFromField__Group__3 )
            // InternalAedit.g:3441:2: rule__RemoveNameAnnotationFromField__Group__2__Impl rule__RemoveNameAnnotationFromField__Group__3
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
    // InternalAedit.g:3448:1: rule__RemoveNameAnnotationFromField__Group__2__Impl : ( '=>' ) ;
    public final void rule__RemoveNameAnnotationFromField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3452:1: ( ( '=>' ) )
            // InternalAedit.g:3453:1: ( '=>' )
            {
            // InternalAedit.g:3453:1: ( '=>' )
            // InternalAedit.g:3454:2: '=>'
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
    // InternalAedit.g:3463:1: rule__RemoveNameAnnotationFromField__Group__3 : rule__RemoveNameAnnotationFromField__Group__3__Impl rule__RemoveNameAnnotationFromField__Group__4 ;
    public final void rule__RemoveNameAnnotationFromField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3467:1: ( rule__RemoveNameAnnotationFromField__Group__3__Impl rule__RemoveNameAnnotationFromField__Group__4 )
            // InternalAedit.g:3468:2: rule__RemoveNameAnnotationFromField__Group__3__Impl rule__RemoveNameAnnotationFromField__Group__4
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
    // InternalAedit.g:3475:1: rule__RemoveNameAnnotationFromField__Group__3__Impl : ( ( rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3 ) ) ;
    public final void rule__RemoveNameAnnotationFromField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3479:1: ( ( ( rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3 ) ) )
            // InternalAedit.g:3480:1: ( ( rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3 ) )
            {
            // InternalAedit.g:3480:1: ( ( rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3 ) )
            // InternalAedit.g:3481:2: ( rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getAnnotationToRemoveAssignment_3()); 
            }
            // InternalAedit.g:3482:2: ( rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3 )
            // InternalAedit.g:3482:3: rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3
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
    // InternalAedit.g:3490:1: rule__RemoveNameAnnotationFromField__Group__4 : rule__RemoveNameAnnotationFromField__Group__4__Impl ;
    public final void rule__RemoveNameAnnotationFromField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3494:1: ( rule__RemoveNameAnnotationFromField__Group__4__Impl )
            // InternalAedit.g:3495:2: rule__RemoveNameAnnotationFromField__Group__4__Impl
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
    // InternalAedit.g:3501:1: rule__RemoveNameAnnotationFromField__Group__4__Impl : ( ';' ) ;
    public final void rule__RemoveNameAnnotationFromField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3505:1: ( ( ';' ) )
            // InternalAedit.g:3506:1: ( ';' )
            {
            // InternalAedit.g:3506:1: ( ';' )
            // InternalAedit.g:3507:2: ';'
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
    // InternalAedit.g:3517:1: rule__ChangeSchema__Group__0 : rule__ChangeSchema__Group__0__Impl rule__ChangeSchema__Group__1 ;
    public final void rule__ChangeSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3521:1: ( rule__ChangeSchema__Group__0__Impl rule__ChangeSchema__Group__1 )
            // InternalAedit.g:3522:2: rule__ChangeSchema__Group__0__Impl rule__ChangeSchema__Group__1
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
    // InternalAedit.g:3529:1: rule__ChangeSchema__Group__0__Impl : ( 'change' ) ;
    public final void rule__ChangeSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3533:1: ( ( 'change' ) )
            // InternalAedit.g:3534:1: ( 'change' )
            {
            // InternalAedit.g:3534:1: ( 'change' )
            // InternalAedit.g:3535:2: 'change'
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
    // InternalAedit.g:3544:1: rule__ChangeSchema__Group__1 : rule__ChangeSchema__Group__1__Impl rule__ChangeSchema__Group__2 ;
    public final void rule__ChangeSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3548:1: ( rule__ChangeSchema__Group__1__Impl rule__ChangeSchema__Group__2 )
            // InternalAedit.g:3549:2: rule__ChangeSchema__Group__1__Impl rule__ChangeSchema__Group__2
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
    // InternalAedit.g:3556:1: rule__ChangeSchema__Group__1__Impl : ( ( rule__ChangeSchema__SchemaTypeAssignment_1 ) ) ;
    public final void rule__ChangeSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3560:1: ( ( ( rule__ChangeSchema__SchemaTypeAssignment_1 ) ) )
            // InternalAedit.g:3561:1: ( ( rule__ChangeSchema__SchemaTypeAssignment_1 ) )
            {
            // InternalAedit.g:3561:1: ( ( rule__ChangeSchema__SchemaTypeAssignment_1 ) )
            // InternalAedit.g:3562:2: ( rule__ChangeSchema__SchemaTypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeSchemaAccess().getSchemaTypeAssignment_1()); 
            }
            // InternalAedit.g:3563:2: ( rule__ChangeSchema__SchemaTypeAssignment_1 )
            // InternalAedit.g:3563:3: rule__ChangeSchema__SchemaTypeAssignment_1
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
    // InternalAedit.g:3571:1: rule__ChangeSchema__Group__2 : rule__ChangeSchema__Group__2__Impl rule__ChangeSchema__Group__3 ;
    public final void rule__ChangeSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3575:1: ( rule__ChangeSchema__Group__2__Impl rule__ChangeSchema__Group__3 )
            // InternalAedit.g:3576:2: rule__ChangeSchema__Group__2__Impl rule__ChangeSchema__Group__3
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
    // InternalAedit.g:3583:1: rule__ChangeSchema__Group__2__Impl : ( ( rule__ChangeSchema__SchemaAssignment_2 ) ) ;
    public final void rule__ChangeSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3587:1: ( ( ( rule__ChangeSchema__SchemaAssignment_2 ) ) )
            // InternalAedit.g:3588:1: ( ( rule__ChangeSchema__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:3588:1: ( ( rule__ChangeSchema__SchemaAssignment_2 ) )
            // InternalAedit.g:3589:2: ( rule__ChangeSchema__SchemaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeSchemaAccess().getSchemaAssignment_2()); 
            }
            // InternalAedit.g:3590:2: ( rule__ChangeSchema__SchemaAssignment_2 )
            // InternalAedit.g:3590:3: rule__ChangeSchema__SchemaAssignment_2
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
    // InternalAedit.g:3598:1: rule__ChangeSchema__Group__3 : rule__ChangeSchema__Group__3__Impl rule__ChangeSchema__Group__4 ;
    public final void rule__ChangeSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3602:1: ( rule__ChangeSchema__Group__3__Impl rule__ChangeSchema__Group__4 )
            // InternalAedit.g:3603:2: rule__ChangeSchema__Group__3__Impl rule__ChangeSchema__Group__4
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
    // InternalAedit.g:3610:1: rule__ChangeSchema__Group__3__Impl : ( '{' ) ;
    public final void rule__ChangeSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3614:1: ( ( '{' ) )
            // InternalAedit.g:3615:1: ( '{' )
            {
            // InternalAedit.g:3615:1: ( '{' )
            // InternalAedit.g:3616:2: '{'
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
    // InternalAedit.g:3625:1: rule__ChangeSchema__Group__4 : rule__ChangeSchema__Group__4__Impl rule__ChangeSchema__Group__5 ;
    public final void rule__ChangeSchema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3629:1: ( rule__ChangeSchema__Group__4__Impl rule__ChangeSchema__Group__5 )
            // InternalAedit.g:3630:2: rule__ChangeSchema__Group__4__Impl rule__ChangeSchema__Group__5
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
    // InternalAedit.g:3637:1: rule__ChangeSchema__Group__4__Impl : ( ( rule__ChangeSchema__RulesAssignment_4 )* ) ;
    public final void rule__ChangeSchema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3641:1: ( ( ( rule__ChangeSchema__RulesAssignment_4 )* ) )
            // InternalAedit.g:3642:1: ( ( rule__ChangeSchema__RulesAssignment_4 )* )
            {
            // InternalAedit.g:3642:1: ( ( rule__ChangeSchema__RulesAssignment_4 )* )
            // InternalAedit.g:3643:2: ( rule__ChangeSchema__RulesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeSchemaAccess().getRulesAssignment_4()); 
            }
            // InternalAedit.g:3644:2: ( rule__ChangeSchema__RulesAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==30||(LA23_0>=32 && LA23_0<=34)||LA23_0==36||(LA23_0>=41 && LA23_0<=45)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAedit.g:3644:3: rule__ChangeSchema__RulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ChangeSchema__RulesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalAedit.g:3652:1: rule__ChangeSchema__Group__5 : rule__ChangeSchema__Group__5__Impl ;
    public final void rule__ChangeSchema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3656:1: ( rule__ChangeSchema__Group__5__Impl )
            // InternalAedit.g:3657:2: rule__ChangeSchema__Group__5__Impl
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
    // InternalAedit.g:3663:1: rule__ChangeSchema__Group__5__Impl : ( '}' ) ;
    public final void rule__ChangeSchema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3667:1: ( ( '}' ) )
            // InternalAedit.g:3668:1: ( '}' )
            {
            // InternalAedit.g:3668:1: ( '}' )
            // InternalAedit.g:3669:2: '}'
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
    // InternalAedit.g:3679:1: rule__ChangeEnum__Group__0 : rule__ChangeEnum__Group__0__Impl rule__ChangeEnum__Group__1 ;
    public final void rule__ChangeEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3683:1: ( rule__ChangeEnum__Group__0__Impl rule__ChangeEnum__Group__1 )
            // InternalAedit.g:3684:2: rule__ChangeEnum__Group__0__Impl rule__ChangeEnum__Group__1
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
    // InternalAedit.g:3691:1: rule__ChangeEnum__Group__0__Impl : ( 'change' ) ;
    public final void rule__ChangeEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3695:1: ( ( 'change' ) )
            // InternalAedit.g:3696:1: ( 'change' )
            {
            // InternalAedit.g:3696:1: ( 'change' )
            // InternalAedit.g:3697:2: 'change'
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
    // InternalAedit.g:3706:1: rule__ChangeEnum__Group__1 : rule__ChangeEnum__Group__1__Impl rule__ChangeEnum__Group__2 ;
    public final void rule__ChangeEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3710:1: ( rule__ChangeEnum__Group__1__Impl rule__ChangeEnum__Group__2 )
            // InternalAedit.g:3711:2: rule__ChangeEnum__Group__1__Impl rule__ChangeEnum__Group__2
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
    // InternalAedit.g:3718:1: rule__ChangeEnum__Group__1__Impl : ( 'enum' ) ;
    public final void rule__ChangeEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3722:1: ( ( 'enum' ) )
            // InternalAedit.g:3723:1: ( 'enum' )
            {
            // InternalAedit.g:3723:1: ( 'enum' )
            // InternalAedit.g:3724:2: 'enum'
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
    // InternalAedit.g:3733:1: rule__ChangeEnum__Group__2 : rule__ChangeEnum__Group__2__Impl rule__ChangeEnum__Group__3 ;
    public final void rule__ChangeEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3737:1: ( rule__ChangeEnum__Group__2__Impl rule__ChangeEnum__Group__3 )
            // InternalAedit.g:3738:2: rule__ChangeEnum__Group__2__Impl rule__ChangeEnum__Group__3
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
    // InternalAedit.g:3745:1: rule__ChangeEnum__Group__2__Impl : ( ( rule__ChangeEnum__SchemaAssignment_2 ) ) ;
    public final void rule__ChangeEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3749:1: ( ( ( rule__ChangeEnum__SchemaAssignment_2 ) ) )
            // InternalAedit.g:3750:1: ( ( rule__ChangeEnum__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:3750:1: ( ( rule__ChangeEnum__SchemaAssignment_2 ) )
            // InternalAedit.g:3751:2: ( rule__ChangeEnum__SchemaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeEnumAccess().getSchemaAssignment_2()); 
            }
            // InternalAedit.g:3752:2: ( rule__ChangeEnum__SchemaAssignment_2 )
            // InternalAedit.g:3752:3: rule__ChangeEnum__SchemaAssignment_2
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
    // InternalAedit.g:3760:1: rule__ChangeEnum__Group__3 : rule__ChangeEnum__Group__3__Impl rule__ChangeEnum__Group__4 ;
    public final void rule__ChangeEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3764:1: ( rule__ChangeEnum__Group__3__Impl rule__ChangeEnum__Group__4 )
            // InternalAedit.g:3765:2: rule__ChangeEnum__Group__3__Impl rule__ChangeEnum__Group__4
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
    // InternalAedit.g:3772:1: rule__ChangeEnum__Group__3__Impl : ( '{' ) ;
    public final void rule__ChangeEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3776:1: ( ( '{' ) )
            // InternalAedit.g:3777:1: ( '{' )
            {
            // InternalAedit.g:3777:1: ( '{' )
            // InternalAedit.g:3778:2: '{'
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
    // InternalAedit.g:3787:1: rule__ChangeEnum__Group__4 : rule__ChangeEnum__Group__4__Impl rule__ChangeEnum__Group__5 ;
    public final void rule__ChangeEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3791:1: ( rule__ChangeEnum__Group__4__Impl rule__ChangeEnum__Group__5 )
            // InternalAedit.g:3792:2: rule__ChangeEnum__Group__4__Impl rule__ChangeEnum__Group__5
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
    // InternalAedit.g:3799:1: rule__ChangeEnum__Group__4__Impl : ( ( rule__ChangeEnum__RulesAssignment_4 )* ) ;
    public final void rule__ChangeEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3803:1: ( ( ( rule__ChangeEnum__RulesAssignment_4 )* ) )
            // InternalAedit.g:3804:1: ( ( rule__ChangeEnum__RulesAssignment_4 )* )
            {
            // InternalAedit.g:3804:1: ( ( rule__ChangeEnum__RulesAssignment_4 )* )
            // InternalAedit.g:3805:2: ( rule__ChangeEnum__RulesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeEnumAccess().getRulesAssignment_4()); 
            }
            // InternalAedit.g:3806:2: ( rule__ChangeEnum__RulesAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==36||(LA24_0>=41 && LA24_0<=42)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAedit.g:3806:3: rule__ChangeEnum__RulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ChangeEnum__RulesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalAedit.g:3814:1: rule__ChangeEnum__Group__5 : rule__ChangeEnum__Group__5__Impl ;
    public final void rule__ChangeEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3818:1: ( rule__ChangeEnum__Group__5__Impl )
            // InternalAedit.g:3819:2: rule__ChangeEnum__Group__5__Impl
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
    // InternalAedit.g:3825:1: rule__ChangeEnum__Group__5__Impl : ( '}' ) ;
    public final void rule__ChangeEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3829:1: ( ( '}' ) )
            // InternalAedit.g:3830:1: ( '}' )
            {
            // InternalAedit.g:3830:1: ( '}' )
            // InternalAedit.g:3831:2: '}'
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
    // InternalAedit.g:3841:1: rule__AddRecord__Group__0 : rule__AddRecord__Group__0__Impl rule__AddRecord__Group__1 ;
    public final void rule__AddRecord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3845:1: ( rule__AddRecord__Group__0__Impl rule__AddRecord__Group__1 )
            // InternalAedit.g:3846:2: rule__AddRecord__Group__0__Impl rule__AddRecord__Group__1
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
    // InternalAedit.g:3853:1: rule__AddRecord__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddRecord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3857:1: ( ( 'add.at' ) )
            // InternalAedit.g:3858:1: ( 'add.at' )
            {
            // InternalAedit.g:3858:1: ( 'add.at' )
            // InternalAedit.g:3859:2: 'add.at'
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
    // InternalAedit.g:3868:1: rule__AddRecord__Group__1 : rule__AddRecord__Group__1__Impl rule__AddRecord__Group__2 ;
    public final void rule__AddRecord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3872:1: ( rule__AddRecord__Group__1__Impl rule__AddRecord__Group__2 )
            // InternalAedit.g:3873:2: rule__AddRecord__Group__1__Impl rule__AddRecord__Group__2
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
    // InternalAedit.g:3880:1: rule__AddRecord__Group__1__Impl : ( '(' ) ;
    public final void rule__AddRecord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3884:1: ( ( '(' ) )
            // InternalAedit.g:3885:1: ( '(' )
            {
            // InternalAedit.g:3885:1: ( '(' )
            // InternalAedit.g:3886:2: '('
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
    // InternalAedit.g:3895:1: rule__AddRecord__Group__2 : rule__AddRecord__Group__2__Impl rule__AddRecord__Group__3 ;
    public final void rule__AddRecord__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3899:1: ( rule__AddRecord__Group__2__Impl rule__AddRecord__Group__3 )
            // InternalAedit.g:3900:2: rule__AddRecord__Group__2__Impl rule__AddRecord__Group__3
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
    // InternalAedit.g:3907:1: rule__AddRecord__Group__2__Impl : ( ( rule__AddRecord__IndexAssignment_2 ) ) ;
    public final void rule__AddRecord__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3911:1: ( ( ( rule__AddRecord__IndexAssignment_2 ) ) )
            // InternalAedit.g:3912:1: ( ( rule__AddRecord__IndexAssignment_2 ) )
            {
            // InternalAedit.g:3912:1: ( ( rule__AddRecord__IndexAssignment_2 ) )
            // InternalAedit.g:3913:2: ( rule__AddRecord__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getIndexAssignment_2()); 
            }
            // InternalAedit.g:3914:2: ( rule__AddRecord__IndexAssignment_2 )
            // InternalAedit.g:3914:3: rule__AddRecord__IndexAssignment_2
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
    // InternalAedit.g:3922:1: rule__AddRecord__Group__3 : rule__AddRecord__Group__3__Impl rule__AddRecord__Group__4 ;
    public final void rule__AddRecord__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3926:1: ( rule__AddRecord__Group__3__Impl rule__AddRecord__Group__4 )
            // InternalAedit.g:3927:2: rule__AddRecord__Group__3__Impl rule__AddRecord__Group__4
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
    // InternalAedit.g:3934:1: rule__AddRecord__Group__3__Impl : ( ')' ) ;
    public final void rule__AddRecord__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3938:1: ( ( ')' ) )
            // InternalAedit.g:3939:1: ( ')' )
            {
            // InternalAedit.g:3939:1: ( ')' )
            // InternalAedit.g:3940:2: ')'
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
    // InternalAedit.g:3949:1: rule__AddRecord__Group__4 : rule__AddRecord__Group__4__Impl rule__AddRecord__Group__5 ;
    public final void rule__AddRecord__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3953:1: ( rule__AddRecord__Group__4__Impl rule__AddRecord__Group__5 )
            // InternalAedit.g:3954:2: rule__AddRecord__Group__4__Impl rule__AddRecord__Group__5
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
    // InternalAedit.g:3961:1: rule__AddRecord__Group__4__Impl : ( 'record' ) ;
    public final void rule__AddRecord__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3965:1: ( ( 'record' ) )
            // InternalAedit.g:3966:1: ( 'record' )
            {
            // InternalAedit.g:3966:1: ( 'record' )
            // InternalAedit.g:3967:2: 'record'
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
    // InternalAedit.g:3976:1: rule__AddRecord__Group__5 : rule__AddRecord__Group__5__Impl rule__AddRecord__Group__6 ;
    public final void rule__AddRecord__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3980:1: ( rule__AddRecord__Group__5__Impl rule__AddRecord__Group__6 )
            // InternalAedit.g:3981:2: rule__AddRecord__Group__5__Impl rule__AddRecord__Group__6
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
    // InternalAedit.g:3988:1: rule__AddRecord__Group__5__Impl : ( ( rule__AddRecord__NamespaceAssignment_5 ) ) ;
    public final void rule__AddRecord__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3992:1: ( ( ( rule__AddRecord__NamespaceAssignment_5 ) ) )
            // InternalAedit.g:3993:1: ( ( rule__AddRecord__NamespaceAssignment_5 ) )
            {
            // InternalAedit.g:3993:1: ( ( rule__AddRecord__NamespaceAssignment_5 ) )
            // InternalAedit.g:3994:2: ( rule__AddRecord__NamespaceAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getNamespaceAssignment_5()); 
            }
            // InternalAedit.g:3995:2: ( rule__AddRecord__NamespaceAssignment_5 )
            // InternalAedit.g:3995:3: rule__AddRecord__NamespaceAssignment_5
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
    // InternalAedit.g:4003:1: rule__AddRecord__Group__6 : rule__AddRecord__Group__6__Impl rule__AddRecord__Group__7 ;
    public final void rule__AddRecord__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4007:1: ( rule__AddRecord__Group__6__Impl rule__AddRecord__Group__7 )
            // InternalAedit.g:4008:2: rule__AddRecord__Group__6__Impl rule__AddRecord__Group__7
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
    // InternalAedit.g:4015:1: rule__AddRecord__Group__6__Impl : ( '.' ) ;
    public final void rule__AddRecord__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4019:1: ( ( '.' ) )
            // InternalAedit.g:4020:1: ( '.' )
            {
            // InternalAedit.g:4020:1: ( '.' )
            // InternalAedit.g:4021:2: '.'
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
    // InternalAedit.g:4030:1: rule__AddRecord__Group__7 : rule__AddRecord__Group__7__Impl rule__AddRecord__Group__8 ;
    public final void rule__AddRecord__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4034:1: ( rule__AddRecord__Group__7__Impl rule__AddRecord__Group__8 )
            // InternalAedit.g:4035:2: rule__AddRecord__Group__7__Impl rule__AddRecord__Group__8
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
    // InternalAedit.g:4042:1: rule__AddRecord__Group__7__Impl : ( ( rule__AddRecord__RecordNameAssignment_7 ) ) ;
    public final void rule__AddRecord__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4046:1: ( ( ( rule__AddRecord__RecordNameAssignment_7 ) ) )
            // InternalAedit.g:4047:1: ( ( rule__AddRecord__RecordNameAssignment_7 ) )
            {
            // InternalAedit.g:4047:1: ( ( rule__AddRecord__RecordNameAssignment_7 ) )
            // InternalAedit.g:4048:2: ( rule__AddRecord__RecordNameAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getRecordNameAssignment_7()); 
            }
            // InternalAedit.g:4049:2: ( rule__AddRecord__RecordNameAssignment_7 )
            // InternalAedit.g:4049:3: rule__AddRecord__RecordNameAssignment_7
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
    // InternalAedit.g:4057:1: rule__AddRecord__Group__8 : rule__AddRecord__Group__8__Impl rule__AddRecord__Group__9 ;
    public final void rule__AddRecord__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4061:1: ( rule__AddRecord__Group__8__Impl rule__AddRecord__Group__9 )
            // InternalAedit.g:4062:2: rule__AddRecord__Group__8__Impl rule__AddRecord__Group__9
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
    // InternalAedit.g:4069:1: rule__AddRecord__Group__8__Impl : ( '{' ) ;
    public final void rule__AddRecord__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4073:1: ( ( '{' ) )
            // InternalAedit.g:4074:1: ( '{' )
            {
            // InternalAedit.g:4074:1: ( '{' )
            // InternalAedit.g:4075:2: '{'
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
    // InternalAedit.g:4084:1: rule__AddRecord__Group__9 : rule__AddRecord__Group__9__Impl rule__AddRecord__Group__10 ;
    public final void rule__AddRecord__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4088:1: ( rule__AddRecord__Group__9__Impl rule__AddRecord__Group__10 )
            // InternalAedit.g:4089:2: rule__AddRecord__Group__9__Impl rule__AddRecord__Group__10
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
    // InternalAedit.g:4096:1: rule__AddRecord__Group__9__Impl : ( ( rule__AddRecord__FieldsAssignment_9 )* ) ;
    public final void rule__AddRecord__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4100:1: ( ( ( rule__AddRecord__FieldsAssignment_9 )* ) )
            // InternalAedit.g:4101:1: ( ( rule__AddRecord__FieldsAssignment_9 )* )
            {
            // InternalAedit.g:4101:1: ( ( rule__AddRecord__FieldsAssignment_9 )* )
            // InternalAedit.g:4102:2: ( rule__AddRecord__FieldsAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getFieldsAssignment_9()); 
            }
            // InternalAedit.g:4103:2: ( rule__AddRecord__FieldsAssignment_9 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||(LA25_0>=16 && LA25_0<=21)||LA25_0==47||LA25_0==53) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAedit.g:4103:3: rule__AddRecord__FieldsAssignment_9
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__AddRecord__FieldsAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalAedit.g:4111:1: rule__AddRecord__Group__10 : rule__AddRecord__Group__10__Impl ;
    public final void rule__AddRecord__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4115:1: ( rule__AddRecord__Group__10__Impl )
            // InternalAedit.g:4116:2: rule__AddRecord__Group__10__Impl
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
    // InternalAedit.g:4122:1: rule__AddRecord__Group__10__Impl : ( '}' ) ;
    public final void rule__AddRecord__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4126:1: ( ( '}' ) )
            // InternalAedit.g:4127:1: ( '}' )
            {
            // InternalAedit.g:4127:1: ( '}' )
            // InternalAedit.g:4128:2: '}'
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
    // InternalAedit.g:4138:1: rule__AddError__Group__0 : rule__AddError__Group__0__Impl rule__AddError__Group__1 ;
    public final void rule__AddError__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4142:1: ( rule__AddError__Group__0__Impl rule__AddError__Group__1 )
            // InternalAedit.g:4143:2: rule__AddError__Group__0__Impl rule__AddError__Group__1
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
    // InternalAedit.g:4150:1: rule__AddError__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddError__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4154:1: ( ( 'add.at' ) )
            // InternalAedit.g:4155:1: ( 'add.at' )
            {
            // InternalAedit.g:4155:1: ( 'add.at' )
            // InternalAedit.g:4156:2: 'add.at'
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
    // InternalAedit.g:4165:1: rule__AddError__Group__1 : rule__AddError__Group__1__Impl rule__AddError__Group__2 ;
    public final void rule__AddError__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4169:1: ( rule__AddError__Group__1__Impl rule__AddError__Group__2 )
            // InternalAedit.g:4170:2: rule__AddError__Group__1__Impl rule__AddError__Group__2
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
    // InternalAedit.g:4177:1: rule__AddError__Group__1__Impl : ( '(' ) ;
    public final void rule__AddError__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4181:1: ( ( '(' ) )
            // InternalAedit.g:4182:1: ( '(' )
            {
            // InternalAedit.g:4182:1: ( '(' )
            // InternalAedit.g:4183:2: '('
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
    // InternalAedit.g:4192:1: rule__AddError__Group__2 : rule__AddError__Group__2__Impl rule__AddError__Group__3 ;
    public final void rule__AddError__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4196:1: ( rule__AddError__Group__2__Impl rule__AddError__Group__3 )
            // InternalAedit.g:4197:2: rule__AddError__Group__2__Impl rule__AddError__Group__3
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
    // InternalAedit.g:4204:1: rule__AddError__Group__2__Impl : ( ( rule__AddError__IndexAssignment_2 ) ) ;
    public final void rule__AddError__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4208:1: ( ( ( rule__AddError__IndexAssignment_2 ) ) )
            // InternalAedit.g:4209:1: ( ( rule__AddError__IndexAssignment_2 ) )
            {
            // InternalAedit.g:4209:1: ( ( rule__AddError__IndexAssignment_2 ) )
            // InternalAedit.g:4210:2: ( rule__AddError__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getIndexAssignment_2()); 
            }
            // InternalAedit.g:4211:2: ( rule__AddError__IndexAssignment_2 )
            // InternalAedit.g:4211:3: rule__AddError__IndexAssignment_2
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
    // InternalAedit.g:4219:1: rule__AddError__Group__3 : rule__AddError__Group__3__Impl rule__AddError__Group__4 ;
    public final void rule__AddError__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4223:1: ( rule__AddError__Group__3__Impl rule__AddError__Group__4 )
            // InternalAedit.g:4224:2: rule__AddError__Group__3__Impl rule__AddError__Group__4
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
    // InternalAedit.g:4231:1: rule__AddError__Group__3__Impl : ( ')' ) ;
    public final void rule__AddError__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4235:1: ( ( ')' ) )
            // InternalAedit.g:4236:1: ( ')' )
            {
            // InternalAedit.g:4236:1: ( ')' )
            // InternalAedit.g:4237:2: ')'
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
    // InternalAedit.g:4246:1: rule__AddError__Group__4 : rule__AddError__Group__4__Impl rule__AddError__Group__5 ;
    public final void rule__AddError__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4250:1: ( rule__AddError__Group__4__Impl rule__AddError__Group__5 )
            // InternalAedit.g:4251:2: rule__AddError__Group__4__Impl rule__AddError__Group__5
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
    // InternalAedit.g:4258:1: rule__AddError__Group__4__Impl : ( 'error' ) ;
    public final void rule__AddError__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4262:1: ( ( 'error' ) )
            // InternalAedit.g:4263:1: ( 'error' )
            {
            // InternalAedit.g:4263:1: ( 'error' )
            // InternalAedit.g:4264:2: 'error'
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
    // InternalAedit.g:4273:1: rule__AddError__Group__5 : rule__AddError__Group__5__Impl rule__AddError__Group__6 ;
    public final void rule__AddError__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4277:1: ( rule__AddError__Group__5__Impl rule__AddError__Group__6 )
            // InternalAedit.g:4278:2: rule__AddError__Group__5__Impl rule__AddError__Group__6
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
    // InternalAedit.g:4285:1: rule__AddError__Group__5__Impl : ( ( rule__AddError__NamespaceAssignment_5 ) ) ;
    public final void rule__AddError__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4289:1: ( ( ( rule__AddError__NamespaceAssignment_5 ) ) )
            // InternalAedit.g:4290:1: ( ( rule__AddError__NamespaceAssignment_5 ) )
            {
            // InternalAedit.g:4290:1: ( ( rule__AddError__NamespaceAssignment_5 ) )
            // InternalAedit.g:4291:2: ( rule__AddError__NamespaceAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getNamespaceAssignment_5()); 
            }
            // InternalAedit.g:4292:2: ( rule__AddError__NamespaceAssignment_5 )
            // InternalAedit.g:4292:3: rule__AddError__NamespaceAssignment_5
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
    // InternalAedit.g:4300:1: rule__AddError__Group__6 : rule__AddError__Group__6__Impl rule__AddError__Group__7 ;
    public final void rule__AddError__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4304:1: ( rule__AddError__Group__6__Impl rule__AddError__Group__7 )
            // InternalAedit.g:4305:2: rule__AddError__Group__6__Impl rule__AddError__Group__7
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
    // InternalAedit.g:4312:1: rule__AddError__Group__6__Impl : ( '.' ) ;
    public final void rule__AddError__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4316:1: ( ( '.' ) )
            // InternalAedit.g:4317:1: ( '.' )
            {
            // InternalAedit.g:4317:1: ( '.' )
            // InternalAedit.g:4318:2: '.'
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
    // InternalAedit.g:4327:1: rule__AddError__Group__7 : rule__AddError__Group__7__Impl rule__AddError__Group__8 ;
    public final void rule__AddError__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4331:1: ( rule__AddError__Group__7__Impl rule__AddError__Group__8 )
            // InternalAedit.g:4332:2: rule__AddError__Group__7__Impl rule__AddError__Group__8
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
    // InternalAedit.g:4339:1: rule__AddError__Group__7__Impl : ( ( rule__AddError__ErrorNameAssignment_7 ) ) ;
    public final void rule__AddError__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4343:1: ( ( ( rule__AddError__ErrorNameAssignment_7 ) ) )
            // InternalAedit.g:4344:1: ( ( rule__AddError__ErrorNameAssignment_7 ) )
            {
            // InternalAedit.g:4344:1: ( ( rule__AddError__ErrorNameAssignment_7 ) )
            // InternalAedit.g:4345:2: ( rule__AddError__ErrorNameAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getErrorNameAssignment_7()); 
            }
            // InternalAedit.g:4346:2: ( rule__AddError__ErrorNameAssignment_7 )
            // InternalAedit.g:4346:3: rule__AddError__ErrorNameAssignment_7
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
    // InternalAedit.g:4354:1: rule__AddError__Group__8 : rule__AddError__Group__8__Impl rule__AddError__Group__9 ;
    public final void rule__AddError__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4358:1: ( rule__AddError__Group__8__Impl rule__AddError__Group__9 )
            // InternalAedit.g:4359:2: rule__AddError__Group__8__Impl rule__AddError__Group__9
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
    // InternalAedit.g:4366:1: rule__AddError__Group__8__Impl : ( '{' ) ;
    public final void rule__AddError__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4370:1: ( ( '{' ) )
            // InternalAedit.g:4371:1: ( '{' )
            {
            // InternalAedit.g:4371:1: ( '{' )
            // InternalAedit.g:4372:2: '{'
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
    // InternalAedit.g:4381:1: rule__AddError__Group__9 : rule__AddError__Group__9__Impl rule__AddError__Group__10 ;
    public final void rule__AddError__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4385:1: ( rule__AddError__Group__9__Impl rule__AddError__Group__10 )
            // InternalAedit.g:4386:2: rule__AddError__Group__9__Impl rule__AddError__Group__10
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
    // InternalAedit.g:4393:1: rule__AddError__Group__9__Impl : ( ( rule__AddError__FieldsAssignment_9 )* ) ;
    public final void rule__AddError__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4397:1: ( ( ( rule__AddError__FieldsAssignment_9 )* ) )
            // InternalAedit.g:4398:1: ( ( rule__AddError__FieldsAssignment_9 )* )
            {
            // InternalAedit.g:4398:1: ( ( rule__AddError__FieldsAssignment_9 )* )
            // InternalAedit.g:4399:2: ( rule__AddError__FieldsAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getFieldsAssignment_9()); 
            }
            // InternalAedit.g:4400:2: ( rule__AddError__FieldsAssignment_9 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||(LA26_0>=16 && LA26_0<=21)||LA26_0==47||LA26_0==53) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAedit.g:4400:3: rule__AddError__FieldsAssignment_9
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__AddError__FieldsAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalAedit.g:4408:1: rule__AddError__Group__10 : rule__AddError__Group__10__Impl ;
    public final void rule__AddError__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4412:1: ( rule__AddError__Group__10__Impl )
            // InternalAedit.g:4413:2: rule__AddError__Group__10__Impl
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
    // InternalAedit.g:4419:1: rule__AddError__Group__10__Impl : ( '}' ) ;
    public final void rule__AddError__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4423:1: ( ( '}' ) )
            // InternalAedit.g:4424:1: ( '}' )
            {
            // InternalAedit.g:4424:1: ( '}' )
            // InternalAedit.g:4425:2: '}'
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
    // InternalAedit.g:4435:1: rule__AddEnumeration__Group__0 : rule__AddEnumeration__Group__0__Impl rule__AddEnumeration__Group__1 ;
    public final void rule__AddEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4439:1: ( rule__AddEnumeration__Group__0__Impl rule__AddEnumeration__Group__1 )
            // InternalAedit.g:4440:2: rule__AddEnumeration__Group__0__Impl rule__AddEnumeration__Group__1
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
    // InternalAedit.g:4447:1: rule__AddEnumeration__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4451:1: ( ( 'add.at' ) )
            // InternalAedit.g:4452:1: ( 'add.at' )
            {
            // InternalAedit.g:4452:1: ( 'add.at' )
            // InternalAedit.g:4453:2: 'add.at'
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
    // InternalAedit.g:4462:1: rule__AddEnumeration__Group__1 : rule__AddEnumeration__Group__1__Impl rule__AddEnumeration__Group__2 ;
    public final void rule__AddEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4466:1: ( rule__AddEnumeration__Group__1__Impl rule__AddEnumeration__Group__2 )
            // InternalAedit.g:4467:2: rule__AddEnumeration__Group__1__Impl rule__AddEnumeration__Group__2
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
    // InternalAedit.g:4474:1: rule__AddEnumeration__Group__1__Impl : ( '(' ) ;
    public final void rule__AddEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4478:1: ( ( '(' ) )
            // InternalAedit.g:4479:1: ( '(' )
            {
            // InternalAedit.g:4479:1: ( '(' )
            // InternalAedit.g:4480:2: '('
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
    // InternalAedit.g:4489:1: rule__AddEnumeration__Group__2 : rule__AddEnumeration__Group__2__Impl rule__AddEnumeration__Group__3 ;
    public final void rule__AddEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4493:1: ( rule__AddEnumeration__Group__2__Impl rule__AddEnumeration__Group__3 )
            // InternalAedit.g:4494:2: rule__AddEnumeration__Group__2__Impl rule__AddEnumeration__Group__3
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
    // InternalAedit.g:4501:1: rule__AddEnumeration__Group__2__Impl : ( ( rule__AddEnumeration__IndexAssignment_2 ) ) ;
    public final void rule__AddEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4505:1: ( ( ( rule__AddEnumeration__IndexAssignment_2 ) ) )
            // InternalAedit.g:4506:1: ( ( rule__AddEnumeration__IndexAssignment_2 ) )
            {
            // InternalAedit.g:4506:1: ( ( rule__AddEnumeration__IndexAssignment_2 ) )
            // InternalAedit.g:4507:2: ( rule__AddEnumeration__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getIndexAssignment_2()); 
            }
            // InternalAedit.g:4508:2: ( rule__AddEnumeration__IndexAssignment_2 )
            // InternalAedit.g:4508:3: rule__AddEnumeration__IndexAssignment_2
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
    // InternalAedit.g:4516:1: rule__AddEnumeration__Group__3 : rule__AddEnumeration__Group__3__Impl rule__AddEnumeration__Group__4 ;
    public final void rule__AddEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4520:1: ( rule__AddEnumeration__Group__3__Impl rule__AddEnumeration__Group__4 )
            // InternalAedit.g:4521:2: rule__AddEnumeration__Group__3__Impl rule__AddEnumeration__Group__4
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
    // InternalAedit.g:4528:1: rule__AddEnumeration__Group__3__Impl : ( ')' ) ;
    public final void rule__AddEnumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4532:1: ( ( ')' ) )
            // InternalAedit.g:4533:1: ( ')' )
            {
            // InternalAedit.g:4533:1: ( ')' )
            // InternalAedit.g:4534:2: ')'
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
    // InternalAedit.g:4543:1: rule__AddEnumeration__Group__4 : rule__AddEnumeration__Group__4__Impl rule__AddEnumeration__Group__5 ;
    public final void rule__AddEnumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4547:1: ( rule__AddEnumeration__Group__4__Impl rule__AddEnumeration__Group__5 )
            // InternalAedit.g:4548:2: rule__AddEnumeration__Group__4__Impl rule__AddEnumeration__Group__5
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
    // InternalAedit.g:4555:1: rule__AddEnumeration__Group__4__Impl : ( 'enum' ) ;
    public final void rule__AddEnumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4559:1: ( ( 'enum' ) )
            // InternalAedit.g:4560:1: ( 'enum' )
            {
            // InternalAedit.g:4560:1: ( 'enum' )
            // InternalAedit.g:4561:2: 'enum'
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
    // InternalAedit.g:4570:1: rule__AddEnumeration__Group__5 : rule__AddEnumeration__Group__5__Impl rule__AddEnumeration__Group__6 ;
    public final void rule__AddEnumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4574:1: ( rule__AddEnumeration__Group__5__Impl rule__AddEnumeration__Group__6 )
            // InternalAedit.g:4575:2: rule__AddEnumeration__Group__5__Impl rule__AddEnumeration__Group__6
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
    // InternalAedit.g:4582:1: rule__AddEnumeration__Group__5__Impl : ( ( rule__AddEnumeration__NamespaceAssignment_5 ) ) ;
    public final void rule__AddEnumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4586:1: ( ( ( rule__AddEnumeration__NamespaceAssignment_5 ) ) )
            // InternalAedit.g:4587:1: ( ( rule__AddEnumeration__NamespaceAssignment_5 ) )
            {
            // InternalAedit.g:4587:1: ( ( rule__AddEnumeration__NamespaceAssignment_5 ) )
            // InternalAedit.g:4588:2: ( rule__AddEnumeration__NamespaceAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getNamespaceAssignment_5()); 
            }
            // InternalAedit.g:4589:2: ( rule__AddEnumeration__NamespaceAssignment_5 )
            // InternalAedit.g:4589:3: rule__AddEnumeration__NamespaceAssignment_5
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
    // InternalAedit.g:4597:1: rule__AddEnumeration__Group__6 : rule__AddEnumeration__Group__6__Impl rule__AddEnumeration__Group__7 ;
    public final void rule__AddEnumeration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4601:1: ( rule__AddEnumeration__Group__6__Impl rule__AddEnumeration__Group__7 )
            // InternalAedit.g:4602:2: rule__AddEnumeration__Group__6__Impl rule__AddEnumeration__Group__7
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
    // InternalAedit.g:4609:1: rule__AddEnumeration__Group__6__Impl : ( '.' ) ;
    public final void rule__AddEnumeration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4613:1: ( ( '.' ) )
            // InternalAedit.g:4614:1: ( '.' )
            {
            // InternalAedit.g:4614:1: ( '.' )
            // InternalAedit.g:4615:2: '.'
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
    // InternalAedit.g:4624:1: rule__AddEnumeration__Group__7 : rule__AddEnumeration__Group__7__Impl rule__AddEnumeration__Group__8 ;
    public final void rule__AddEnumeration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4628:1: ( rule__AddEnumeration__Group__7__Impl rule__AddEnumeration__Group__8 )
            // InternalAedit.g:4629:2: rule__AddEnumeration__Group__7__Impl rule__AddEnumeration__Group__8
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
    // InternalAedit.g:4636:1: rule__AddEnumeration__Group__7__Impl : ( ( rule__AddEnumeration__EnumNameAssignment_7 ) ) ;
    public final void rule__AddEnumeration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4640:1: ( ( ( rule__AddEnumeration__EnumNameAssignment_7 ) ) )
            // InternalAedit.g:4641:1: ( ( rule__AddEnumeration__EnumNameAssignment_7 ) )
            {
            // InternalAedit.g:4641:1: ( ( rule__AddEnumeration__EnumNameAssignment_7 ) )
            // InternalAedit.g:4642:2: ( rule__AddEnumeration__EnumNameAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getEnumNameAssignment_7()); 
            }
            // InternalAedit.g:4643:2: ( rule__AddEnumeration__EnumNameAssignment_7 )
            // InternalAedit.g:4643:3: rule__AddEnumeration__EnumNameAssignment_7
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
    // InternalAedit.g:4651:1: rule__AddEnumeration__Group__8 : rule__AddEnumeration__Group__8__Impl rule__AddEnumeration__Group__9 ;
    public final void rule__AddEnumeration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4655:1: ( rule__AddEnumeration__Group__8__Impl rule__AddEnumeration__Group__9 )
            // InternalAedit.g:4656:2: rule__AddEnumeration__Group__8__Impl rule__AddEnumeration__Group__9
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
    // InternalAedit.g:4663:1: rule__AddEnumeration__Group__8__Impl : ( '{' ) ;
    public final void rule__AddEnumeration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4667:1: ( ( '{' ) )
            // InternalAedit.g:4668:1: ( '{' )
            {
            // InternalAedit.g:4668:1: ( '{' )
            // InternalAedit.g:4669:2: '{'
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
    // InternalAedit.g:4678:1: rule__AddEnumeration__Group__9 : rule__AddEnumeration__Group__9__Impl rule__AddEnumeration__Group__10 ;
    public final void rule__AddEnumeration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4682:1: ( rule__AddEnumeration__Group__9__Impl rule__AddEnumeration__Group__10 )
            // InternalAedit.g:4683:2: rule__AddEnumeration__Group__9__Impl rule__AddEnumeration__Group__10
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
    // InternalAedit.g:4690:1: rule__AddEnumeration__Group__9__Impl : ( ( rule__AddEnumeration__SymbolsAssignment_9 ) ) ;
    public final void rule__AddEnumeration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4694:1: ( ( ( rule__AddEnumeration__SymbolsAssignment_9 ) ) )
            // InternalAedit.g:4695:1: ( ( rule__AddEnumeration__SymbolsAssignment_9 ) )
            {
            // InternalAedit.g:4695:1: ( ( rule__AddEnumeration__SymbolsAssignment_9 ) )
            // InternalAedit.g:4696:2: ( rule__AddEnumeration__SymbolsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getSymbolsAssignment_9()); 
            }
            // InternalAedit.g:4697:2: ( rule__AddEnumeration__SymbolsAssignment_9 )
            // InternalAedit.g:4697:3: rule__AddEnumeration__SymbolsAssignment_9
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
    // InternalAedit.g:4705:1: rule__AddEnumeration__Group__10 : rule__AddEnumeration__Group__10__Impl rule__AddEnumeration__Group__11 ;
    public final void rule__AddEnumeration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4709:1: ( rule__AddEnumeration__Group__10__Impl rule__AddEnumeration__Group__11 )
            // InternalAedit.g:4710:2: rule__AddEnumeration__Group__10__Impl rule__AddEnumeration__Group__11
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
    // InternalAedit.g:4717:1: rule__AddEnumeration__Group__10__Impl : ( ( rule__AddEnumeration__Group_10__0 )* ) ;
    public final void rule__AddEnumeration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4721:1: ( ( ( rule__AddEnumeration__Group_10__0 )* ) )
            // InternalAedit.g:4722:1: ( ( rule__AddEnumeration__Group_10__0 )* )
            {
            // InternalAedit.g:4722:1: ( ( rule__AddEnumeration__Group_10__0 )* )
            // InternalAedit.g:4723:2: ( rule__AddEnumeration__Group_10__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getGroup_10()); 
            }
            // InternalAedit.g:4724:2: ( rule__AddEnumeration__Group_10__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==40) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAedit.g:4724:3: rule__AddEnumeration__Group_10__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__AddEnumeration__Group_10__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalAedit.g:4732:1: rule__AddEnumeration__Group__11 : rule__AddEnumeration__Group__11__Impl ;
    public final void rule__AddEnumeration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4736:1: ( rule__AddEnumeration__Group__11__Impl )
            // InternalAedit.g:4737:2: rule__AddEnumeration__Group__11__Impl
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
    // InternalAedit.g:4743:1: rule__AddEnumeration__Group__11__Impl : ( '}' ) ;
    public final void rule__AddEnumeration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4747:1: ( ( '}' ) )
            // InternalAedit.g:4748:1: ( '}' )
            {
            // InternalAedit.g:4748:1: ( '}' )
            // InternalAedit.g:4749:2: '}'
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
    // InternalAedit.g:4759:1: rule__AddEnumeration__Group_10__0 : rule__AddEnumeration__Group_10__0__Impl rule__AddEnumeration__Group_10__1 ;
    public final void rule__AddEnumeration__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4763:1: ( rule__AddEnumeration__Group_10__0__Impl rule__AddEnumeration__Group_10__1 )
            // InternalAedit.g:4764:2: rule__AddEnumeration__Group_10__0__Impl rule__AddEnumeration__Group_10__1
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
    // InternalAedit.g:4771:1: rule__AddEnumeration__Group_10__0__Impl : ( ',' ) ;
    public final void rule__AddEnumeration__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4775:1: ( ( ',' ) )
            // InternalAedit.g:4776:1: ( ',' )
            {
            // InternalAedit.g:4776:1: ( ',' )
            // InternalAedit.g:4777:2: ','
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
    // InternalAedit.g:4786:1: rule__AddEnumeration__Group_10__1 : rule__AddEnumeration__Group_10__1__Impl ;
    public final void rule__AddEnumeration__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4790:1: ( rule__AddEnumeration__Group_10__1__Impl )
            // InternalAedit.g:4791:2: rule__AddEnumeration__Group_10__1__Impl
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
    // InternalAedit.g:4797:1: rule__AddEnumeration__Group_10__1__Impl : ( ( rule__AddEnumeration__SymbolsAssignment_10_1 ) ) ;
    public final void rule__AddEnumeration__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4801:1: ( ( ( rule__AddEnumeration__SymbolsAssignment_10_1 ) ) )
            // InternalAedit.g:4802:1: ( ( rule__AddEnumeration__SymbolsAssignment_10_1 ) )
            {
            // InternalAedit.g:4802:1: ( ( rule__AddEnumeration__SymbolsAssignment_10_1 ) )
            // InternalAedit.g:4803:2: ( rule__AddEnumeration__SymbolsAssignment_10_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getSymbolsAssignment_10_1()); 
            }
            // InternalAedit.g:4804:2: ( rule__AddEnumeration__SymbolsAssignment_10_1 )
            // InternalAedit.g:4804:3: rule__AddEnumeration__SymbolsAssignment_10_1
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
    // InternalAedit.g:4813:1: rule__AddVariable__Group__0 : rule__AddVariable__Group__0__Impl rule__AddVariable__Group__1 ;
    public final void rule__AddVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4817:1: ( rule__AddVariable__Group__0__Impl rule__AddVariable__Group__1 )
            // InternalAedit.g:4818:2: rule__AddVariable__Group__0__Impl rule__AddVariable__Group__1
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
    // InternalAedit.g:4825:1: rule__AddVariable__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4829:1: ( ( 'add.at' ) )
            // InternalAedit.g:4830:1: ( 'add.at' )
            {
            // InternalAedit.g:4830:1: ( 'add.at' )
            // InternalAedit.g:4831:2: 'add.at'
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
    // InternalAedit.g:4840:1: rule__AddVariable__Group__1 : rule__AddVariable__Group__1__Impl rule__AddVariable__Group__2 ;
    public final void rule__AddVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4844:1: ( rule__AddVariable__Group__1__Impl rule__AddVariable__Group__2 )
            // InternalAedit.g:4845:2: rule__AddVariable__Group__1__Impl rule__AddVariable__Group__2
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
    // InternalAedit.g:4852:1: rule__AddVariable__Group__1__Impl : ( '(' ) ;
    public final void rule__AddVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4856:1: ( ( '(' ) )
            // InternalAedit.g:4857:1: ( '(' )
            {
            // InternalAedit.g:4857:1: ( '(' )
            // InternalAedit.g:4858:2: '('
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
    // InternalAedit.g:4867:1: rule__AddVariable__Group__2 : rule__AddVariable__Group__2__Impl rule__AddVariable__Group__3 ;
    public final void rule__AddVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4871:1: ( rule__AddVariable__Group__2__Impl rule__AddVariable__Group__3 )
            // InternalAedit.g:4872:2: rule__AddVariable__Group__2__Impl rule__AddVariable__Group__3
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
    // InternalAedit.g:4879:1: rule__AddVariable__Group__2__Impl : ( ( rule__AddVariable__IndexAssignment_2 ) ) ;
    public final void rule__AddVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4883:1: ( ( ( rule__AddVariable__IndexAssignment_2 ) ) )
            // InternalAedit.g:4884:1: ( ( rule__AddVariable__IndexAssignment_2 ) )
            {
            // InternalAedit.g:4884:1: ( ( rule__AddVariable__IndexAssignment_2 ) )
            // InternalAedit.g:4885:2: ( rule__AddVariable__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddVariableAccess().getIndexAssignment_2()); 
            }
            // InternalAedit.g:4886:2: ( rule__AddVariable__IndexAssignment_2 )
            // InternalAedit.g:4886:3: rule__AddVariable__IndexAssignment_2
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
    // InternalAedit.g:4894:1: rule__AddVariable__Group__3 : rule__AddVariable__Group__3__Impl rule__AddVariable__Group__4 ;
    public final void rule__AddVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4898:1: ( rule__AddVariable__Group__3__Impl rule__AddVariable__Group__4 )
            // InternalAedit.g:4899:2: rule__AddVariable__Group__3__Impl rule__AddVariable__Group__4
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
    // InternalAedit.g:4906:1: rule__AddVariable__Group__3__Impl : ( ')' ) ;
    public final void rule__AddVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4910:1: ( ( ')' ) )
            // InternalAedit.g:4911:1: ( ')' )
            {
            // InternalAedit.g:4911:1: ( ')' )
            // InternalAedit.g:4912:2: ')'
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
    // InternalAedit.g:4921:1: rule__AddVariable__Group__4 : rule__AddVariable__Group__4__Impl rule__AddVariable__Group__5 ;
    public final void rule__AddVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4925:1: ( rule__AddVariable__Group__4__Impl rule__AddVariable__Group__5 )
            // InternalAedit.g:4926:2: rule__AddVariable__Group__4__Impl rule__AddVariable__Group__5
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
    // InternalAedit.g:4933:1: rule__AddVariable__Group__4__Impl : ( ( rule__AddVariable__NewVarAssignment_4 ) ) ;
    public final void rule__AddVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4937:1: ( ( ( rule__AddVariable__NewVarAssignment_4 ) ) )
            // InternalAedit.g:4938:1: ( ( rule__AddVariable__NewVarAssignment_4 ) )
            {
            // InternalAedit.g:4938:1: ( ( rule__AddVariable__NewVarAssignment_4 ) )
            // InternalAedit.g:4939:2: ( rule__AddVariable__NewVarAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddVariableAccess().getNewVarAssignment_4()); 
            }
            // InternalAedit.g:4940:2: ( rule__AddVariable__NewVarAssignment_4 )
            // InternalAedit.g:4940:3: rule__AddVariable__NewVarAssignment_4
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
    // InternalAedit.g:4948:1: rule__AddVariable__Group__5 : rule__AddVariable__Group__5__Impl ;
    public final void rule__AddVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4952:1: ( rule__AddVariable__Group__5__Impl )
            // InternalAedit.g:4953:2: rule__AddVariable__Group__5__Impl
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
    // InternalAedit.g:4959:1: rule__AddVariable__Group__5__Impl : ( ';' ) ;
    public final void rule__AddVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4963:1: ( ( ';' ) )
            // InternalAedit.g:4964:1: ( ';' )
            {
            // InternalAedit.g:4964:1: ( ';' )
            // InternalAedit.g:4965:2: ';'
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
    // InternalAedit.g:4975:1: rule__AddEnum__Group__0 : rule__AddEnum__Group__0__Impl rule__AddEnum__Group__1 ;
    public final void rule__AddEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4979:1: ( rule__AddEnum__Group__0__Impl rule__AddEnum__Group__1 )
            // InternalAedit.g:4980:2: rule__AddEnum__Group__0__Impl rule__AddEnum__Group__1
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
    // InternalAedit.g:4987:1: rule__AddEnum__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4991:1: ( ( 'add.at' ) )
            // InternalAedit.g:4992:1: ( 'add.at' )
            {
            // InternalAedit.g:4992:1: ( 'add.at' )
            // InternalAedit.g:4993:2: 'add.at'
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
    // InternalAedit.g:5002:1: rule__AddEnum__Group__1 : rule__AddEnum__Group__1__Impl rule__AddEnum__Group__2 ;
    public final void rule__AddEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5006:1: ( rule__AddEnum__Group__1__Impl rule__AddEnum__Group__2 )
            // InternalAedit.g:5007:2: rule__AddEnum__Group__1__Impl rule__AddEnum__Group__2
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
    // InternalAedit.g:5014:1: rule__AddEnum__Group__1__Impl : ( '(' ) ;
    public final void rule__AddEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5018:1: ( ( '(' ) )
            // InternalAedit.g:5019:1: ( '(' )
            {
            // InternalAedit.g:5019:1: ( '(' )
            // InternalAedit.g:5020:2: '('
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
    // InternalAedit.g:5029:1: rule__AddEnum__Group__2 : rule__AddEnum__Group__2__Impl rule__AddEnum__Group__3 ;
    public final void rule__AddEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5033:1: ( rule__AddEnum__Group__2__Impl rule__AddEnum__Group__3 )
            // InternalAedit.g:5034:2: rule__AddEnum__Group__2__Impl rule__AddEnum__Group__3
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
    // InternalAedit.g:5041:1: rule__AddEnum__Group__2__Impl : ( ( rule__AddEnum__IndexAssignment_2 ) ) ;
    public final void rule__AddEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5045:1: ( ( ( rule__AddEnum__IndexAssignment_2 ) ) )
            // InternalAedit.g:5046:1: ( ( rule__AddEnum__IndexAssignment_2 ) )
            {
            // InternalAedit.g:5046:1: ( ( rule__AddEnum__IndexAssignment_2 ) )
            // InternalAedit.g:5047:2: ( rule__AddEnum__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumAccess().getIndexAssignment_2()); 
            }
            // InternalAedit.g:5048:2: ( rule__AddEnum__IndexAssignment_2 )
            // InternalAedit.g:5048:3: rule__AddEnum__IndexAssignment_2
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
    // InternalAedit.g:5056:1: rule__AddEnum__Group__3 : rule__AddEnum__Group__3__Impl rule__AddEnum__Group__4 ;
    public final void rule__AddEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5060:1: ( rule__AddEnum__Group__3__Impl rule__AddEnum__Group__4 )
            // InternalAedit.g:5061:2: rule__AddEnum__Group__3__Impl rule__AddEnum__Group__4
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
    // InternalAedit.g:5068:1: rule__AddEnum__Group__3__Impl : ( ')' ) ;
    public final void rule__AddEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5072:1: ( ( ')' ) )
            // InternalAedit.g:5073:1: ( ')' )
            {
            // InternalAedit.g:5073:1: ( ')' )
            // InternalAedit.g:5074:2: ')'
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
    // InternalAedit.g:5083:1: rule__AddEnum__Group__4 : rule__AddEnum__Group__4__Impl rule__AddEnum__Group__5 ;
    public final void rule__AddEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5087:1: ( rule__AddEnum__Group__4__Impl rule__AddEnum__Group__5 )
            // InternalAedit.g:5088:2: rule__AddEnum__Group__4__Impl rule__AddEnum__Group__5
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
    // InternalAedit.g:5095:1: rule__AddEnum__Group__4__Impl : ( ( rule__AddEnum__VarNameAssignment_4 ) ) ;
    public final void rule__AddEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5099:1: ( ( ( rule__AddEnum__VarNameAssignment_4 ) ) )
            // InternalAedit.g:5100:1: ( ( rule__AddEnum__VarNameAssignment_4 ) )
            {
            // InternalAedit.g:5100:1: ( ( rule__AddEnum__VarNameAssignment_4 ) )
            // InternalAedit.g:5101:2: ( rule__AddEnum__VarNameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumAccess().getVarNameAssignment_4()); 
            }
            // InternalAedit.g:5102:2: ( rule__AddEnum__VarNameAssignment_4 )
            // InternalAedit.g:5102:3: rule__AddEnum__VarNameAssignment_4
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
    // InternalAedit.g:5110:1: rule__AddEnum__Group__5 : rule__AddEnum__Group__5__Impl ;
    public final void rule__AddEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5114:1: ( rule__AddEnum__Group__5__Impl )
            // InternalAedit.g:5115:2: rule__AddEnum__Group__5__Impl
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
    // InternalAedit.g:5121:1: rule__AddEnum__Group__5__Impl : ( ';' ) ;
    public final void rule__AddEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5125:1: ( ( ';' ) )
            // InternalAedit.g:5126:1: ( ';' )
            {
            // InternalAedit.g:5126:1: ( ';' )
            // InternalAedit.g:5127:2: ';'
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
    // InternalAedit.g:5137:1: rule__RemoveSchema__Group__0 : rule__RemoveSchema__Group__0__Impl rule__RemoveSchema__Group__1 ;
    public final void rule__RemoveSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5141:1: ( rule__RemoveSchema__Group__0__Impl rule__RemoveSchema__Group__1 )
            // InternalAedit.g:5142:2: rule__RemoveSchema__Group__0__Impl rule__RemoveSchema__Group__1
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
    // InternalAedit.g:5149:1: rule__RemoveSchema__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5153:1: ( ( 'remove' ) )
            // InternalAedit.g:5154:1: ( 'remove' )
            {
            // InternalAedit.g:5154:1: ( 'remove' )
            // InternalAedit.g:5155:2: 'remove'
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
    // InternalAedit.g:5164:1: rule__RemoveSchema__Group__1 : rule__RemoveSchema__Group__1__Impl rule__RemoveSchema__Group__2 ;
    public final void rule__RemoveSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5168:1: ( rule__RemoveSchema__Group__1__Impl rule__RemoveSchema__Group__2 )
            // InternalAedit.g:5169:2: rule__RemoveSchema__Group__1__Impl rule__RemoveSchema__Group__2
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
    // InternalAedit.g:5176:1: rule__RemoveSchema__Group__1__Impl : ( ( rule__RemoveSchema__SchemaTypeAssignment_1 ) ) ;
    public final void rule__RemoveSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5180:1: ( ( ( rule__RemoveSchema__SchemaTypeAssignment_1 ) ) )
            // InternalAedit.g:5181:1: ( ( rule__RemoveSchema__SchemaTypeAssignment_1 ) )
            {
            // InternalAedit.g:5181:1: ( ( rule__RemoveSchema__SchemaTypeAssignment_1 ) )
            // InternalAedit.g:5182:2: ( rule__RemoveSchema__SchemaTypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveSchemaAccess().getSchemaTypeAssignment_1()); 
            }
            // InternalAedit.g:5183:2: ( rule__RemoveSchema__SchemaTypeAssignment_1 )
            // InternalAedit.g:5183:3: rule__RemoveSchema__SchemaTypeAssignment_1
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
    // InternalAedit.g:5191:1: rule__RemoveSchema__Group__2 : rule__RemoveSchema__Group__2__Impl rule__RemoveSchema__Group__3 ;
    public final void rule__RemoveSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5195:1: ( rule__RemoveSchema__Group__2__Impl rule__RemoveSchema__Group__3 )
            // InternalAedit.g:5196:2: rule__RemoveSchema__Group__2__Impl rule__RemoveSchema__Group__3
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
    // InternalAedit.g:5203:1: rule__RemoveSchema__Group__2__Impl : ( ( rule__RemoveSchema__SchemaAssignment_2 ) ) ;
    public final void rule__RemoveSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5207:1: ( ( ( rule__RemoveSchema__SchemaAssignment_2 ) ) )
            // InternalAedit.g:5208:1: ( ( rule__RemoveSchema__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:5208:1: ( ( rule__RemoveSchema__SchemaAssignment_2 ) )
            // InternalAedit.g:5209:2: ( rule__RemoveSchema__SchemaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveSchemaAccess().getSchemaAssignment_2()); 
            }
            // InternalAedit.g:5210:2: ( rule__RemoveSchema__SchemaAssignment_2 )
            // InternalAedit.g:5210:3: rule__RemoveSchema__SchemaAssignment_2
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
    // InternalAedit.g:5218:1: rule__RemoveSchema__Group__3 : rule__RemoveSchema__Group__3__Impl ;
    public final void rule__RemoveSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5222:1: ( rule__RemoveSchema__Group__3__Impl )
            // InternalAedit.g:5223:2: rule__RemoveSchema__Group__3__Impl
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
    // InternalAedit.g:5229:1: rule__RemoveSchema__Group__3__Impl : ( ';' ) ;
    public final void rule__RemoveSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5233:1: ( ( ';' ) )
            // InternalAedit.g:5234:1: ( ';' )
            {
            // InternalAedit.g:5234:1: ( ';' )
            // InternalAedit.g:5235:2: ';'
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
    // InternalAedit.g:5245:1: rule__RemoveVariable__Group__0 : rule__RemoveVariable__Group__0__Impl rule__RemoveVariable__Group__1 ;
    public final void rule__RemoveVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5249:1: ( rule__RemoveVariable__Group__0__Impl rule__RemoveVariable__Group__1 )
            // InternalAedit.g:5250:2: rule__RemoveVariable__Group__0__Impl rule__RemoveVariable__Group__1
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
    // InternalAedit.g:5257:1: rule__RemoveVariable__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5261:1: ( ( 'remove' ) )
            // InternalAedit.g:5262:1: ( 'remove' )
            {
            // InternalAedit.g:5262:1: ( 'remove' )
            // InternalAedit.g:5263:2: 'remove'
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
    // InternalAedit.g:5272:1: rule__RemoveVariable__Group__1 : rule__RemoveVariable__Group__1__Impl rule__RemoveVariable__Group__2 ;
    public final void rule__RemoveVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5276:1: ( rule__RemoveVariable__Group__1__Impl rule__RemoveVariable__Group__2 )
            // InternalAedit.g:5277:2: rule__RemoveVariable__Group__1__Impl rule__RemoveVariable__Group__2
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
    // InternalAedit.g:5284:1: rule__RemoveVariable__Group__1__Impl : ( ( rule__RemoveVariable__VariableAssignment_1 ) ) ;
    public final void rule__RemoveVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5288:1: ( ( ( rule__RemoveVariable__VariableAssignment_1 ) ) )
            // InternalAedit.g:5289:1: ( ( rule__RemoveVariable__VariableAssignment_1 ) )
            {
            // InternalAedit.g:5289:1: ( ( rule__RemoveVariable__VariableAssignment_1 ) )
            // InternalAedit.g:5290:2: ( rule__RemoveVariable__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveVariableAccess().getVariableAssignment_1()); 
            }
            // InternalAedit.g:5291:2: ( rule__RemoveVariable__VariableAssignment_1 )
            // InternalAedit.g:5291:3: rule__RemoveVariable__VariableAssignment_1
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
    // InternalAedit.g:5299:1: rule__RemoveVariable__Group__2 : rule__RemoveVariable__Group__2__Impl ;
    public final void rule__RemoveVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5303:1: ( rule__RemoveVariable__Group__2__Impl )
            // InternalAedit.g:5304:2: rule__RemoveVariable__Group__2__Impl
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
    // InternalAedit.g:5310:1: rule__RemoveVariable__Group__2__Impl : ( ';' ) ;
    public final void rule__RemoveVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5314:1: ( ( ';' ) )
            // InternalAedit.g:5315:1: ( ';' )
            {
            // InternalAedit.g:5315:1: ( ';' )
            // InternalAedit.g:5316:2: ';'
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
    // InternalAedit.g:5326:1: rule__RemoveEnum__Group__0 : rule__RemoveEnum__Group__0__Impl rule__RemoveEnum__Group__1 ;
    public final void rule__RemoveEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5330:1: ( rule__RemoveEnum__Group__0__Impl rule__RemoveEnum__Group__1 )
            // InternalAedit.g:5331:2: rule__RemoveEnum__Group__0__Impl rule__RemoveEnum__Group__1
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
    // InternalAedit.g:5338:1: rule__RemoveEnum__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5342:1: ( ( 'remove' ) )
            // InternalAedit.g:5343:1: ( 'remove' )
            {
            // InternalAedit.g:5343:1: ( 'remove' )
            // InternalAedit.g:5344:2: 'remove'
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
    // InternalAedit.g:5353:1: rule__RemoveEnum__Group__1 : rule__RemoveEnum__Group__1__Impl rule__RemoveEnum__Group__2 ;
    public final void rule__RemoveEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5357:1: ( rule__RemoveEnum__Group__1__Impl rule__RemoveEnum__Group__2 )
            // InternalAedit.g:5358:2: rule__RemoveEnum__Group__1__Impl rule__RemoveEnum__Group__2
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
    // InternalAedit.g:5365:1: rule__RemoveEnum__Group__1__Impl : ( ( rule__RemoveEnum__VarNameAssignment_1 ) ) ;
    public final void rule__RemoveEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5369:1: ( ( ( rule__RemoveEnum__VarNameAssignment_1 ) ) )
            // InternalAedit.g:5370:1: ( ( rule__RemoveEnum__VarNameAssignment_1 ) )
            {
            // InternalAedit.g:5370:1: ( ( rule__RemoveEnum__VarNameAssignment_1 ) )
            // InternalAedit.g:5371:2: ( rule__RemoveEnum__VarNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveEnumAccess().getVarNameAssignment_1()); 
            }
            // InternalAedit.g:5372:2: ( rule__RemoveEnum__VarNameAssignment_1 )
            // InternalAedit.g:5372:3: rule__RemoveEnum__VarNameAssignment_1
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
    // InternalAedit.g:5380:1: rule__RemoveEnum__Group__2 : rule__RemoveEnum__Group__2__Impl ;
    public final void rule__RemoveEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5384:1: ( rule__RemoveEnum__Group__2__Impl )
            // InternalAedit.g:5385:2: rule__RemoveEnum__Group__2__Impl
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
    // InternalAedit.g:5391:1: rule__RemoveEnum__Group__2__Impl : ( ';' ) ;
    public final void rule__RemoveEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5395:1: ( ( ';' ) )
            // InternalAedit.g:5396:1: ( ';' )
            {
            // InternalAedit.g:5396:1: ( ';' )
            // InternalAedit.g:5397:2: ';'
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
    // InternalAedit.g:5407:1: rule__RenameSchema__Group__0 : rule__RenameSchema__Group__0__Impl rule__RenameSchema__Group__1 ;
    public final void rule__RenameSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5411:1: ( rule__RenameSchema__Group__0__Impl rule__RenameSchema__Group__1 )
            // InternalAedit.g:5412:2: rule__RenameSchema__Group__0__Impl rule__RenameSchema__Group__1
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
    // InternalAedit.g:5419:1: rule__RenameSchema__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5423:1: ( ( 'rename' ) )
            // InternalAedit.g:5424:1: ( 'rename' )
            {
            // InternalAedit.g:5424:1: ( 'rename' )
            // InternalAedit.g:5425:2: 'rename'
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
    // InternalAedit.g:5434:1: rule__RenameSchema__Group__1 : rule__RenameSchema__Group__1__Impl rule__RenameSchema__Group__2 ;
    public final void rule__RenameSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5438:1: ( rule__RenameSchema__Group__1__Impl rule__RenameSchema__Group__2 )
            // InternalAedit.g:5439:2: rule__RenameSchema__Group__1__Impl rule__RenameSchema__Group__2
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
    // InternalAedit.g:5446:1: rule__RenameSchema__Group__1__Impl : ( ( rule__RenameSchema__SchemaTypeAssignment_1 ) ) ;
    public final void rule__RenameSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5450:1: ( ( ( rule__RenameSchema__SchemaTypeAssignment_1 ) ) )
            // InternalAedit.g:5451:1: ( ( rule__RenameSchema__SchemaTypeAssignment_1 ) )
            {
            // InternalAedit.g:5451:1: ( ( rule__RenameSchema__SchemaTypeAssignment_1 ) )
            // InternalAedit.g:5452:2: ( rule__RenameSchema__SchemaTypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameSchemaAccess().getSchemaTypeAssignment_1()); 
            }
            // InternalAedit.g:5453:2: ( rule__RenameSchema__SchemaTypeAssignment_1 )
            // InternalAedit.g:5453:3: rule__RenameSchema__SchemaTypeAssignment_1
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
    // InternalAedit.g:5461:1: rule__RenameSchema__Group__2 : rule__RenameSchema__Group__2__Impl rule__RenameSchema__Group__3 ;
    public final void rule__RenameSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5465:1: ( rule__RenameSchema__Group__2__Impl rule__RenameSchema__Group__3 )
            // InternalAedit.g:5466:2: rule__RenameSchema__Group__2__Impl rule__RenameSchema__Group__3
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
    // InternalAedit.g:5473:1: rule__RenameSchema__Group__2__Impl : ( ( rule__RenameSchema__SchemaAssignment_2 ) ) ;
    public final void rule__RenameSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5477:1: ( ( ( rule__RenameSchema__SchemaAssignment_2 ) ) )
            // InternalAedit.g:5478:1: ( ( rule__RenameSchema__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:5478:1: ( ( rule__RenameSchema__SchemaAssignment_2 ) )
            // InternalAedit.g:5479:2: ( rule__RenameSchema__SchemaAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameSchemaAccess().getSchemaAssignment_2()); 
            }
            // InternalAedit.g:5480:2: ( rule__RenameSchema__SchemaAssignment_2 )
            // InternalAedit.g:5480:3: rule__RenameSchema__SchemaAssignment_2
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
    // InternalAedit.g:5488:1: rule__RenameSchema__Group__3 : rule__RenameSchema__Group__3__Impl rule__RenameSchema__Group__4 ;
    public final void rule__RenameSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5492:1: ( rule__RenameSchema__Group__3__Impl rule__RenameSchema__Group__4 )
            // InternalAedit.g:5493:2: rule__RenameSchema__Group__3__Impl rule__RenameSchema__Group__4
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
    // InternalAedit.g:5500:1: rule__RenameSchema__Group__3__Impl : ( '=>' ) ;
    public final void rule__RenameSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5504:1: ( ( '=>' ) )
            // InternalAedit.g:5505:1: ( '=>' )
            {
            // InternalAedit.g:5505:1: ( '=>' )
            // InternalAedit.g:5506:2: '=>'
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
    // InternalAedit.g:5515:1: rule__RenameSchema__Group__4 : rule__RenameSchema__Group__4__Impl rule__RenameSchema__Group__5 ;
    public final void rule__RenameSchema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5519:1: ( rule__RenameSchema__Group__4__Impl rule__RenameSchema__Group__5 )
            // InternalAedit.g:5520:2: rule__RenameSchema__Group__4__Impl rule__RenameSchema__Group__5
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
    // InternalAedit.g:5527:1: rule__RenameSchema__Group__4__Impl : ( ( rule__RenameSchema__NewSchNameAssignment_4 ) ) ;
    public final void rule__RenameSchema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5531:1: ( ( ( rule__RenameSchema__NewSchNameAssignment_4 ) ) )
            // InternalAedit.g:5532:1: ( ( rule__RenameSchema__NewSchNameAssignment_4 ) )
            {
            // InternalAedit.g:5532:1: ( ( rule__RenameSchema__NewSchNameAssignment_4 ) )
            // InternalAedit.g:5533:2: ( rule__RenameSchema__NewSchNameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameSchemaAccess().getNewSchNameAssignment_4()); 
            }
            // InternalAedit.g:5534:2: ( rule__RenameSchema__NewSchNameAssignment_4 )
            // InternalAedit.g:5534:3: rule__RenameSchema__NewSchNameAssignment_4
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
    // InternalAedit.g:5542:1: rule__RenameSchema__Group__5 : rule__RenameSchema__Group__5__Impl ;
    public final void rule__RenameSchema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5546:1: ( rule__RenameSchema__Group__5__Impl )
            // InternalAedit.g:5547:2: rule__RenameSchema__Group__5__Impl
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
    // InternalAedit.g:5553:1: rule__RenameSchema__Group__5__Impl : ( ';' ) ;
    public final void rule__RenameSchema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5557:1: ( ( ';' ) )
            // InternalAedit.g:5558:1: ( ';' )
            {
            // InternalAedit.g:5558:1: ( ';' )
            // InternalAedit.g:5559:2: ';'
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
    // InternalAedit.g:5569:1: rule__RenameVariable__Group__0 : rule__RenameVariable__Group__0__Impl rule__RenameVariable__Group__1 ;
    public final void rule__RenameVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5573:1: ( rule__RenameVariable__Group__0__Impl rule__RenameVariable__Group__1 )
            // InternalAedit.g:5574:2: rule__RenameVariable__Group__0__Impl rule__RenameVariable__Group__1
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
    // InternalAedit.g:5581:1: rule__RenameVariable__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5585:1: ( ( 'rename' ) )
            // InternalAedit.g:5586:1: ( 'rename' )
            {
            // InternalAedit.g:5586:1: ( 'rename' )
            // InternalAedit.g:5587:2: 'rename'
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
    // InternalAedit.g:5596:1: rule__RenameVariable__Group__1 : rule__RenameVariable__Group__1__Impl rule__RenameVariable__Group__2 ;
    public final void rule__RenameVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5600:1: ( rule__RenameVariable__Group__1__Impl rule__RenameVariable__Group__2 )
            // InternalAedit.g:5601:2: rule__RenameVariable__Group__1__Impl rule__RenameVariable__Group__2
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
    // InternalAedit.g:5608:1: rule__RenameVariable__Group__1__Impl : ( ( rule__RenameVariable__VariableAssignment_1 ) ) ;
    public final void rule__RenameVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5612:1: ( ( ( rule__RenameVariable__VariableAssignment_1 ) ) )
            // InternalAedit.g:5613:1: ( ( rule__RenameVariable__VariableAssignment_1 ) )
            {
            // InternalAedit.g:5613:1: ( ( rule__RenameVariable__VariableAssignment_1 ) )
            // InternalAedit.g:5614:2: ( rule__RenameVariable__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameVariableAccess().getVariableAssignment_1()); 
            }
            // InternalAedit.g:5615:2: ( rule__RenameVariable__VariableAssignment_1 )
            // InternalAedit.g:5615:3: rule__RenameVariable__VariableAssignment_1
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
    // InternalAedit.g:5623:1: rule__RenameVariable__Group__2 : rule__RenameVariable__Group__2__Impl rule__RenameVariable__Group__3 ;
    public final void rule__RenameVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5627:1: ( rule__RenameVariable__Group__2__Impl rule__RenameVariable__Group__3 )
            // InternalAedit.g:5628:2: rule__RenameVariable__Group__2__Impl rule__RenameVariable__Group__3
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
    // InternalAedit.g:5635:1: rule__RenameVariable__Group__2__Impl : ( '=>' ) ;
    public final void rule__RenameVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5639:1: ( ( '=>' ) )
            // InternalAedit.g:5640:1: ( '=>' )
            {
            // InternalAedit.g:5640:1: ( '=>' )
            // InternalAedit.g:5641:2: '=>'
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
    // InternalAedit.g:5650:1: rule__RenameVariable__Group__3 : rule__RenameVariable__Group__3__Impl rule__RenameVariable__Group__4 ;
    public final void rule__RenameVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5654:1: ( rule__RenameVariable__Group__3__Impl rule__RenameVariable__Group__4 )
            // InternalAedit.g:5655:2: rule__RenameVariable__Group__3__Impl rule__RenameVariable__Group__4
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
    // InternalAedit.g:5662:1: rule__RenameVariable__Group__3__Impl : ( ( rule__RenameVariable__NewVarNameAssignment_3 ) ) ;
    public final void rule__RenameVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5666:1: ( ( ( rule__RenameVariable__NewVarNameAssignment_3 ) ) )
            // InternalAedit.g:5667:1: ( ( rule__RenameVariable__NewVarNameAssignment_3 ) )
            {
            // InternalAedit.g:5667:1: ( ( rule__RenameVariable__NewVarNameAssignment_3 ) )
            // InternalAedit.g:5668:2: ( rule__RenameVariable__NewVarNameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameVariableAccess().getNewVarNameAssignment_3()); 
            }
            // InternalAedit.g:5669:2: ( rule__RenameVariable__NewVarNameAssignment_3 )
            // InternalAedit.g:5669:3: rule__RenameVariable__NewVarNameAssignment_3
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
    // InternalAedit.g:5677:1: rule__RenameVariable__Group__4 : rule__RenameVariable__Group__4__Impl ;
    public final void rule__RenameVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5681:1: ( rule__RenameVariable__Group__4__Impl )
            // InternalAedit.g:5682:2: rule__RenameVariable__Group__4__Impl
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
    // InternalAedit.g:5688:1: rule__RenameVariable__Group__4__Impl : ( ';' ) ;
    public final void rule__RenameVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5692:1: ( ( ';' ) )
            // InternalAedit.g:5693:1: ( ';' )
            {
            // InternalAedit.g:5693:1: ( ';' )
            // InternalAedit.g:5694:2: ';'
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
    // InternalAedit.g:5704:1: rule__RenameEnum__Group__0 : rule__RenameEnum__Group__0__Impl rule__RenameEnum__Group__1 ;
    public final void rule__RenameEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5708:1: ( rule__RenameEnum__Group__0__Impl rule__RenameEnum__Group__1 )
            // InternalAedit.g:5709:2: rule__RenameEnum__Group__0__Impl rule__RenameEnum__Group__1
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
    // InternalAedit.g:5716:1: rule__RenameEnum__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5720:1: ( ( 'rename' ) )
            // InternalAedit.g:5721:1: ( 'rename' )
            {
            // InternalAedit.g:5721:1: ( 'rename' )
            // InternalAedit.g:5722:2: 'rename'
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
    // InternalAedit.g:5731:1: rule__RenameEnum__Group__1 : rule__RenameEnum__Group__1__Impl rule__RenameEnum__Group__2 ;
    public final void rule__RenameEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5735:1: ( rule__RenameEnum__Group__1__Impl rule__RenameEnum__Group__2 )
            // InternalAedit.g:5736:2: rule__RenameEnum__Group__1__Impl rule__RenameEnum__Group__2
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
    // InternalAedit.g:5743:1: rule__RenameEnum__Group__1__Impl : ( ( rule__RenameEnum__OldNameAssignment_1 ) ) ;
    public final void rule__RenameEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5747:1: ( ( ( rule__RenameEnum__OldNameAssignment_1 ) ) )
            // InternalAedit.g:5748:1: ( ( rule__RenameEnum__OldNameAssignment_1 ) )
            {
            // InternalAedit.g:5748:1: ( ( rule__RenameEnum__OldNameAssignment_1 ) )
            // InternalAedit.g:5749:2: ( rule__RenameEnum__OldNameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameEnumAccess().getOldNameAssignment_1()); 
            }
            // InternalAedit.g:5750:2: ( rule__RenameEnum__OldNameAssignment_1 )
            // InternalAedit.g:5750:3: rule__RenameEnum__OldNameAssignment_1
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
    // InternalAedit.g:5758:1: rule__RenameEnum__Group__2 : rule__RenameEnum__Group__2__Impl rule__RenameEnum__Group__3 ;
    public final void rule__RenameEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5762:1: ( rule__RenameEnum__Group__2__Impl rule__RenameEnum__Group__3 )
            // InternalAedit.g:5763:2: rule__RenameEnum__Group__2__Impl rule__RenameEnum__Group__3
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
    // InternalAedit.g:5770:1: rule__RenameEnum__Group__2__Impl : ( '=>' ) ;
    public final void rule__RenameEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5774:1: ( ( '=>' ) )
            // InternalAedit.g:5775:1: ( '=>' )
            {
            // InternalAedit.g:5775:1: ( '=>' )
            // InternalAedit.g:5776:2: '=>'
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
    // InternalAedit.g:5785:1: rule__RenameEnum__Group__3 : rule__RenameEnum__Group__3__Impl rule__RenameEnum__Group__4 ;
    public final void rule__RenameEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5789:1: ( rule__RenameEnum__Group__3__Impl rule__RenameEnum__Group__4 )
            // InternalAedit.g:5790:2: rule__RenameEnum__Group__3__Impl rule__RenameEnum__Group__4
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
    // InternalAedit.g:5797:1: rule__RenameEnum__Group__3__Impl : ( ( rule__RenameEnum__NewEnumNameAssignment_3 ) ) ;
    public final void rule__RenameEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5801:1: ( ( ( rule__RenameEnum__NewEnumNameAssignment_3 ) ) )
            // InternalAedit.g:5802:1: ( ( rule__RenameEnum__NewEnumNameAssignment_3 ) )
            {
            // InternalAedit.g:5802:1: ( ( rule__RenameEnum__NewEnumNameAssignment_3 ) )
            // InternalAedit.g:5803:2: ( rule__RenameEnum__NewEnumNameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameEnumAccess().getNewEnumNameAssignment_3()); 
            }
            // InternalAedit.g:5804:2: ( rule__RenameEnum__NewEnumNameAssignment_3 )
            // InternalAedit.g:5804:3: rule__RenameEnum__NewEnumNameAssignment_3
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
    // InternalAedit.g:5812:1: rule__RenameEnum__Group__4 : rule__RenameEnum__Group__4__Impl ;
    public final void rule__RenameEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5816:1: ( rule__RenameEnum__Group__4__Impl )
            // InternalAedit.g:5817:2: rule__RenameEnum__Group__4__Impl
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
    // InternalAedit.g:5823:1: rule__RenameEnum__Group__4__Impl : ( ';' ) ;
    public final void rule__RenameEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5827:1: ( ( ';' ) )
            // InternalAedit.g:5828:1: ( ';' )
            {
            // InternalAedit.g:5828:1: ( ';' )
            // InternalAedit.g:5829:2: ';'
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
    // InternalAedit.g:5839:1: rule__ChangeDefValue__Group__0 : rule__ChangeDefValue__Group__0__Impl rule__ChangeDefValue__Group__1 ;
    public final void rule__ChangeDefValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5843:1: ( rule__ChangeDefValue__Group__0__Impl rule__ChangeDefValue__Group__1 )
            // InternalAedit.g:5844:2: rule__ChangeDefValue__Group__0__Impl rule__ChangeDefValue__Group__1
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
    // InternalAedit.g:5851:1: rule__ChangeDefValue__Group__0__Impl : ( 'set_val' ) ;
    public final void rule__ChangeDefValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5855:1: ( ( 'set_val' ) )
            // InternalAedit.g:5856:1: ( 'set_val' )
            {
            // InternalAedit.g:5856:1: ( 'set_val' )
            // InternalAedit.g:5857:2: 'set_val'
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
    // InternalAedit.g:5866:1: rule__ChangeDefValue__Group__1 : rule__ChangeDefValue__Group__1__Impl rule__ChangeDefValue__Group__2 ;
    public final void rule__ChangeDefValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5870:1: ( rule__ChangeDefValue__Group__1__Impl rule__ChangeDefValue__Group__2 )
            // InternalAedit.g:5871:2: rule__ChangeDefValue__Group__1__Impl rule__ChangeDefValue__Group__2
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
    // InternalAedit.g:5878:1: rule__ChangeDefValue__Group__1__Impl : ( ( rule__ChangeDefValue__FieldAssignment_1 ) ) ;
    public final void rule__ChangeDefValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5882:1: ( ( ( rule__ChangeDefValue__FieldAssignment_1 ) ) )
            // InternalAedit.g:5883:1: ( ( rule__ChangeDefValue__FieldAssignment_1 ) )
            {
            // InternalAedit.g:5883:1: ( ( rule__ChangeDefValue__FieldAssignment_1 ) )
            // InternalAedit.g:5884:2: ( rule__ChangeDefValue__FieldAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeDefValueAccess().getFieldAssignment_1()); 
            }
            // InternalAedit.g:5885:2: ( rule__ChangeDefValue__FieldAssignment_1 )
            // InternalAedit.g:5885:3: rule__ChangeDefValue__FieldAssignment_1
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
    // InternalAedit.g:5893:1: rule__ChangeDefValue__Group__2 : rule__ChangeDefValue__Group__2__Impl rule__ChangeDefValue__Group__3 ;
    public final void rule__ChangeDefValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5897:1: ( rule__ChangeDefValue__Group__2__Impl rule__ChangeDefValue__Group__3 )
            // InternalAedit.g:5898:2: rule__ChangeDefValue__Group__2__Impl rule__ChangeDefValue__Group__3
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
    // InternalAedit.g:5905:1: rule__ChangeDefValue__Group__2__Impl : ( '=>' ) ;
    public final void rule__ChangeDefValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5909:1: ( ( '=>' ) )
            // InternalAedit.g:5910:1: ( '=>' )
            {
            // InternalAedit.g:5910:1: ( '=>' )
            // InternalAedit.g:5911:2: '=>'
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
    // InternalAedit.g:5920:1: rule__ChangeDefValue__Group__3 : rule__ChangeDefValue__Group__3__Impl rule__ChangeDefValue__Group__4 ;
    public final void rule__ChangeDefValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5924:1: ( rule__ChangeDefValue__Group__3__Impl rule__ChangeDefValue__Group__4 )
            // InternalAedit.g:5925:2: rule__ChangeDefValue__Group__3__Impl rule__ChangeDefValue__Group__4
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
    // InternalAedit.g:5932:1: rule__ChangeDefValue__Group__3__Impl : ( ( rule__ChangeDefValue__NewValAssignment_3 ) ) ;
    public final void rule__ChangeDefValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5936:1: ( ( ( rule__ChangeDefValue__NewValAssignment_3 ) ) )
            // InternalAedit.g:5937:1: ( ( rule__ChangeDefValue__NewValAssignment_3 ) )
            {
            // InternalAedit.g:5937:1: ( ( rule__ChangeDefValue__NewValAssignment_3 ) )
            // InternalAedit.g:5938:2: ( rule__ChangeDefValue__NewValAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeDefValueAccess().getNewValAssignment_3()); 
            }
            // InternalAedit.g:5939:2: ( rule__ChangeDefValue__NewValAssignment_3 )
            // InternalAedit.g:5939:3: rule__ChangeDefValue__NewValAssignment_3
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
    // InternalAedit.g:5947:1: rule__ChangeDefValue__Group__4 : rule__ChangeDefValue__Group__4__Impl ;
    public final void rule__ChangeDefValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5951:1: ( rule__ChangeDefValue__Group__4__Impl )
            // InternalAedit.g:5952:2: rule__ChangeDefValue__Group__4__Impl
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
    // InternalAedit.g:5958:1: rule__ChangeDefValue__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeDefValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5962:1: ( ( ';' ) )
            // InternalAedit.g:5963:1: ( ';' )
            {
            // InternalAedit.g:5963:1: ( ';' )
            // InternalAedit.g:5964:2: ';'
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
    // InternalAedit.g:5974:1: rule__ChangeType__Group__0 : rule__ChangeType__Group__0__Impl rule__ChangeType__Group__1 ;
    public final void rule__ChangeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5978:1: ( rule__ChangeType__Group__0__Impl rule__ChangeType__Group__1 )
            // InternalAedit.g:5979:2: rule__ChangeType__Group__0__Impl rule__ChangeType__Group__1
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
    // InternalAedit.g:5986:1: rule__ChangeType__Group__0__Impl : ( 'set_type' ) ;
    public final void rule__ChangeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5990:1: ( ( 'set_type' ) )
            // InternalAedit.g:5991:1: ( 'set_type' )
            {
            // InternalAedit.g:5991:1: ( 'set_type' )
            // InternalAedit.g:5992:2: 'set_type'
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
    // InternalAedit.g:6001:1: rule__ChangeType__Group__1 : rule__ChangeType__Group__1__Impl rule__ChangeType__Group__2 ;
    public final void rule__ChangeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6005:1: ( rule__ChangeType__Group__1__Impl rule__ChangeType__Group__2 )
            // InternalAedit.g:6006:2: rule__ChangeType__Group__1__Impl rule__ChangeType__Group__2
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
    // InternalAedit.g:6013:1: rule__ChangeType__Group__1__Impl : ( ( rule__ChangeType__FieldAssignment_1 ) ) ;
    public final void rule__ChangeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6017:1: ( ( ( rule__ChangeType__FieldAssignment_1 ) ) )
            // InternalAedit.g:6018:1: ( ( rule__ChangeType__FieldAssignment_1 ) )
            {
            // InternalAedit.g:6018:1: ( ( rule__ChangeType__FieldAssignment_1 ) )
            // InternalAedit.g:6019:2: ( rule__ChangeType__FieldAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeTypeAccess().getFieldAssignment_1()); 
            }
            // InternalAedit.g:6020:2: ( rule__ChangeType__FieldAssignment_1 )
            // InternalAedit.g:6020:3: rule__ChangeType__FieldAssignment_1
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
    // InternalAedit.g:6028:1: rule__ChangeType__Group__2 : rule__ChangeType__Group__2__Impl rule__ChangeType__Group__3 ;
    public final void rule__ChangeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6032:1: ( rule__ChangeType__Group__2__Impl rule__ChangeType__Group__3 )
            // InternalAedit.g:6033:2: rule__ChangeType__Group__2__Impl rule__ChangeType__Group__3
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
    // InternalAedit.g:6040:1: rule__ChangeType__Group__2__Impl : ( '=>' ) ;
    public final void rule__ChangeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6044:1: ( ( '=>' ) )
            // InternalAedit.g:6045:1: ( '=>' )
            {
            // InternalAedit.g:6045:1: ( '=>' )
            // InternalAedit.g:6046:2: '=>'
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
    // InternalAedit.g:6055:1: rule__ChangeType__Group__3 : rule__ChangeType__Group__3__Impl rule__ChangeType__Group__4 ;
    public final void rule__ChangeType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6059:1: ( rule__ChangeType__Group__3__Impl rule__ChangeType__Group__4 )
            // InternalAedit.g:6060:2: rule__ChangeType__Group__3__Impl rule__ChangeType__Group__4
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
    // InternalAedit.g:6067:1: rule__ChangeType__Group__3__Impl : ( ( rule__ChangeType__NewTypeAssignment_3 ) ) ;
    public final void rule__ChangeType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6071:1: ( ( ( rule__ChangeType__NewTypeAssignment_3 ) ) )
            // InternalAedit.g:6072:1: ( ( rule__ChangeType__NewTypeAssignment_3 ) )
            {
            // InternalAedit.g:6072:1: ( ( rule__ChangeType__NewTypeAssignment_3 ) )
            // InternalAedit.g:6073:2: ( rule__ChangeType__NewTypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeTypeAccess().getNewTypeAssignment_3()); 
            }
            // InternalAedit.g:6074:2: ( rule__ChangeType__NewTypeAssignment_3 )
            // InternalAedit.g:6074:3: rule__ChangeType__NewTypeAssignment_3
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
    // InternalAedit.g:6082:1: rule__ChangeType__Group__4 : rule__ChangeType__Group__4__Impl ;
    public final void rule__ChangeType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6086:1: ( rule__ChangeType__Group__4__Impl )
            // InternalAedit.g:6087:2: rule__ChangeType__Group__4__Impl
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
    // InternalAedit.g:6093:1: rule__ChangeType__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6097:1: ( ( ';' ) )
            // InternalAedit.g:6098:1: ( ';' )
            {
            // InternalAedit.g:6098:1: ( ';' )
            // InternalAedit.g:6099:2: ';'
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
    // InternalAedit.g:6109:1: rule__RemoveArrayValue__Group__0 : rule__RemoveArrayValue__Group__0__Impl rule__RemoveArrayValue__Group__1 ;
    public final void rule__RemoveArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6113:1: ( rule__RemoveArrayValue__Group__0__Impl rule__RemoveArrayValue__Group__1 )
            // InternalAedit.g:6114:2: rule__RemoveArrayValue__Group__0__Impl rule__RemoveArrayValue__Group__1
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
    // InternalAedit.g:6121:1: rule__RemoveArrayValue__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6125:1: ( ( 'remove' ) )
            // InternalAedit.g:6126:1: ( 'remove' )
            {
            // InternalAedit.g:6126:1: ( 'remove' )
            // InternalAedit.g:6127:2: 'remove'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAccess().getRemoveKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAccess().getRemoveKeyword_0()); 
            }

            }


            }

        }
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
    // InternalAedit.g:6136:1: rule__RemoveArrayValue__Group__1 : rule__RemoveArrayValue__Group__1__Impl rule__RemoveArrayValue__Group__2 ;
    public final void rule__RemoveArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6140:1: ( rule__RemoveArrayValue__Group__1__Impl rule__RemoveArrayValue__Group__2 )
            // InternalAedit.g:6141:2: rule__RemoveArrayValue__Group__1__Impl rule__RemoveArrayValue__Group__2
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
    // InternalAedit.g:6148:1: rule__RemoveArrayValue__Group__1__Impl : ( ( rule__RemoveArrayValue__ArrayAssignment_1 ) ) ;
    public final void rule__RemoveArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6152:1: ( ( ( rule__RemoveArrayValue__ArrayAssignment_1 ) ) )
            // InternalAedit.g:6153:1: ( ( rule__RemoveArrayValue__ArrayAssignment_1 ) )
            {
            // InternalAedit.g:6153:1: ( ( rule__RemoveArrayValue__ArrayAssignment_1 ) )
            // InternalAedit.g:6154:2: ( rule__RemoveArrayValue__ArrayAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAccess().getArrayAssignment_1()); 
            }
            // InternalAedit.g:6155:2: ( rule__RemoveArrayValue__ArrayAssignment_1 )
            // InternalAedit.g:6155:3: rule__RemoveArrayValue__ArrayAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValue__ArrayAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAccess().getArrayAssignment_1()); 
            }

            }


            }

        }
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
    // InternalAedit.g:6163:1: rule__RemoveArrayValue__Group__2 : rule__RemoveArrayValue__Group__2__Impl rule__RemoveArrayValue__Group__3 ;
    public final void rule__RemoveArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6167:1: ( rule__RemoveArrayValue__Group__2__Impl rule__RemoveArrayValue__Group__3 )
            // InternalAedit.g:6168:2: rule__RemoveArrayValue__Group__2__Impl rule__RemoveArrayValue__Group__3
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
    // InternalAedit.g:6175:1: rule__RemoveArrayValue__Group__2__Impl : ( '=>' ) ;
    public final void rule__RemoveArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6179:1: ( ( '=>' ) )
            // InternalAedit.g:6180:1: ( '=>' )
            {
            // InternalAedit.g:6180:1: ( '=>' )
            // InternalAedit.g:6181:2: '=>'
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
    // InternalAedit.g:6190:1: rule__RemoveArrayValue__Group__3 : rule__RemoveArrayValue__Group__3__Impl ;
    public final void rule__RemoveArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6194:1: ( rule__RemoveArrayValue__Group__3__Impl )
            // InternalAedit.g:6195:2: rule__RemoveArrayValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveArrayValue__Group__3__Impl();

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
    // InternalAedit.g:6201:1: rule__RemoveArrayValue__Group__3__Impl : ( ( rule__RemoveArrayValue__ValueToRemoveAssignment_3 ) ) ;
    public final void rule__RemoveArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6205:1: ( ( ( rule__RemoveArrayValue__ValueToRemoveAssignment_3 ) ) )
            // InternalAedit.g:6206:1: ( ( rule__RemoveArrayValue__ValueToRemoveAssignment_3 ) )
            {
            // InternalAedit.g:6206:1: ( ( rule__RemoveArrayValue__ValueToRemoveAssignment_3 ) )
            // InternalAedit.g:6207:2: ( rule__RemoveArrayValue__ValueToRemoveAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAccess().getValueToRemoveAssignment_3()); 
            }
            // InternalAedit.g:6208:2: ( rule__RemoveArrayValue__ValueToRemoveAssignment_3 )
            // InternalAedit.g:6208:3: rule__RemoveArrayValue__ValueToRemoveAssignment_3
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


    // $ANTLR start "rule__RemoveArrayValueAtIndex__Group__0"
    // InternalAedit.g:6217:1: rule__RemoveArrayValueAtIndex__Group__0 : rule__RemoveArrayValueAtIndex__Group__0__Impl rule__RemoveArrayValueAtIndex__Group__1 ;
    public final void rule__RemoveArrayValueAtIndex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6221:1: ( rule__RemoveArrayValueAtIndex__Group__0__Impl rule__RemoveArrayValueAtIndex__Group__1 )
            // InternalAedit.g:6222:2: rule__RemoveArrayValueAtIndex__Group__0__Impl rule__RemoveArrayValueAtIndex__Group__1
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
    // InternalAedit.g:6229:1: rule__RemoveArrayValueAtIndex__Group__0__Impl : ( 'remove.at' ) ;
    public final void rule__RemoveArrayValueAtIndex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6233:1: ( ( 'remove.at' ) )
            // InternalAedit.g:6234:1: ( 'remove.at' )
            {
            // InternalAedit.g:6234:1: ( 'remove.at' )
            // InternalAedit.g:6235:2: 'remove.at'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAtIndexAccess().getRemoveAtKeyword_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAtIndexAccess().getRemoveAtKeyword_0()); 
            }

            }


            }

        }
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
    // InternalAedit.g:6244:1: rule__RemoveArrayValueAtIndex__Group__1 : rule__RemoveArrayValueAtIndex__Group__1__Impl rule__RemoveArrayValueAtIndex__Group__2 ;
    public final void rule__RemoveArrayValueAtIndex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6248:1: ( rule__RemoveArrayValueAtIndex__Group__1__Impl rule__RemoveArrayValueAtIndex__Group__2 )
            // InternalAedit.g:6249:2: rule__RemoveArrayValueAtIndex__Group__1__Impl rule__RemoveArrayValueAtIndex__Group__2
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
    // InternalAedit.g:6256:1: rule__RemoveArrayValueAtIndex__Group__1__Impl : ( '(' ) ;
    public final void rule__RemoveArrayValueAtIndex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6260:1: ( ( '(' ) )
            // InternalAedit.g:6261:1: ( '(' )
            {
            // InternalAedit.g:6261:1: ( '(' )
            // InternalAedit.g:6262:2: '('
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
    // InternalAedit.g:6271:1: rule__RemoveArrayValueAtIndex__Group__2 : rule__RemoveArrayValueAtIndex__Group__2__Impl rule__RemoveArrayValueAtIndex__Group__3 ;
    public final void rule__RemoveArrayValueAtIndex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6275:1: ( rule__RemoveArrayValueAtIndex__Group__2__Impl rule__RemoveArrayValueAtIndex__Group__3 )
            // InternalAedit.g:6276:2: rule__RemoveArrayValueAtIndex__Group__2__Impl rule__RemoveArrayValueAtIndex__Group__3
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
    // InternalAedit.g:6283:1: rule__RemoveArrayValueAtIndex__Group__2__Impl : ( ( rule__RemoveArrayValueAtIndex__IndexAssignment_2 ) ) ;
    public final void rule__RemoveArrayValueAtIndex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6287:1: ( ( ( rule__RemoveArrayValueAtIndex__IndexAssignment_2 ) ) )
            // InternalAedit.g:6288:1: ( ( rule__RemoveArrayValueAtIndex__IndexAssignment_2 ) )
            {
            // InternalAedit.g:6288:1: ( ( rule__RemoveArrayValueAtIndex__IndexAssignment_2 ) )
            // InternalAedit.g:6289:2: ( rule__RemoveArrayValueAtIndex__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAtIndexAccess().getIndexAssignment_2()); 
            }
            // InternalAedit.g:6290:2: ( rule__RemoveArrayValueAtIndex__IndexAssignment_2 )
            // InternalAedit.g:6290:3: rule__RemoveArrayValueAtIndex__IndexAssignment_2
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
    // InternalAedit.g:6298:1: rule__RemoveArrayValueAtIndex__Group__3 : rule__RemoveArrayValueAtIndex__Group__3__Impl rule__RemoveArrayValueAtIndex__Group__4 ;
    public final void rule__RemoveArrayValueAtIndex__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6302:1: ( rule__RemoveArrayValueAtIndex__Group__3__Impl rule__RemoveArrayValueAtIndex__Group__4 )
            // InternalAedit.g:6303:2: rule__RemoveArrayValueAtIndex__Group__3__Impl rule__RemoveArrayValueAtIndex__Group__4
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
    // InternalAedit.g:6310:1: rule__RemoveArrayValueAtIndex__Group__3__Impl : ( ')' ) ;
    public final void rule__RemoveArrayValueAtIndex__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6314:1: ( ( ')' ) )
            // InternalAedit.g:6315:1: ( ')' )
            {
            // InternalAedit.g:6315:1: ( ')' )
            // InternalAedit.g:6316:2: ')'
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
    // InternalAedit.g:6325:1: rule__RemoveArrayValueAtIndex__Group__4 : rule__RemoveArrayValueAtIndex__Group__4__Impl rule__RemoveArrayValueAtIndex__Group__5 ;
    public final void rule__RemoveArrayValueAtIndex__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6329:1: ( rule__RemoveArrayValueAtIndex__Group__4__Impl rule__RemoveArrayValueAtIndex__Group__5 )
            // InternalAedit.g:6330:2: rule__RemoveArrayValueAtIndex__Group__4__Impl rule__RemoveArrayValueAtIndex__Group__5
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
    // InternalAedit.g:6337:1: rule__RemoveArrayValueAtIndex__Group__4__Impl : ( ( rule__RemoveArrayValueAtIndex__ArrayAssignment_4 ) ) ;
    public final void rule__RemoveArrayValueAtIndex__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6341:1: ( ( ( rule__RemoveArrayValueAtIndex__ArrayAssignment_4 ) ) )
            // InternalAedit.g:6342:1: ( ( rule__RemoveArrayValueAtIndex__ArrayAssignment_4 ) )
            {
            // InternalAedit.g:6342:1: ( ( rule__RemoveArrayValueAtIndex__ArrayAssignment_4 ) )
            // InternalAedit.g:6343:2: ( rule__RemoveArrayValueAtIndex__ArrayAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAtIndexAccess().getArrayAssignment_4()); 
            }
            // InternalAedit.g:6344:2: ( rule__RemoveArrayValueAtIndex__ArrayAssignment_4 )
            // InternalAedit.g:6344:3: rule__RemoveArrayValueAtIndex__ArrayAssignment_4
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
    // InternalAedit.g:6352:1: rule__RemoveArrayValueAtIndex__Group__5 : rule__RemoveArrayValueAtIndex__Group__5__Impl ;
    public final void rule__RemoveArrayValueAtIndex__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6356:1: ( rule__RemoveArrayValueAtIndex__Group__5__Impl )
            // InternalAedit.g:6357:2: rule__RemoveArrayValueAtIndex__Group__5__Impl
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
    // InternalAedit.g:6363:1: rule__RemoveArrayValueAtIndex__Group__5__Impl : ( ';' ) ;
    public final void rule__RemoveArrayValueAtIndex__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6367:1: ( ( ';' ) )
            // InternalAedit.g:6368:1: ( ';' )
            {
            // InternalAedit.g:6368:1: ( ';' )
            // InternalAedit.g:6369:2: ';'
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
    // InternalAedit.g:6379:1: rule__AddValueToArray__Group__0 : rule__AddValueToArray__Group__0__Impl rule__AddValueToArray__Group__1 ;
    public final void rule__AddValueToArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6383:1: ( rule__AddValueToArray__Group__0__Impl rule__AddValueToArray__Group__1 )
            // InternalAedit.g:6384:2: rule__AddValueToArray__Group__0__Impl rule__AddValueToArray__Group__1
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
    // InternalAedit.g:6391:1: rule__AddValueToArray__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddValueToArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6395:1: ( ( 'add.at' ) )
            // InternalAedit.g:6396:1: ( 'add.at' )
            {
            // InternalAedit.g:6396:1: ( 'add.at' )
            // InternalAedit.g:6397:2: 'add.at'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getAddAtKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddValueToArrayAccess().getAddAtKeyword_0()); 
            }

            }


            }

        }
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
    // InternalAedit.g:6406:1: rule__AddValueToArray__Group__1 : rule__AddValueToArray__Group__1__Impl rule__AddValueToArray__Group__2 ;
    public final void rule__AddValueToArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6410:1: ( rule__AddValueToArray__Group__1__Impl rule__AddValueToArray__Group__2 )
            // InternalAedit.g:6411:2: rule__AddValueToArray__Group__1__Impl rule__AddValueToArray__Group__2
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
    // InternalAedit.g:6418:1: rule__AddValueToArray__Group__1__Impl : ( '(' ) ;
    public final void rule__AddValueToArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6422:1: ( ( '(' ) )
            // InternalAedit.g:6423:1: ( '(' )
            {
            // InternalAedit.g:6423:1: ( '(' )
            // InternalAedit.g:6424:2: '('
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
    // InternalAedit.g:6433:1: rule__AddValueToArray__Group__2 : rule__AddValueToArray__Group__2__Impl rule__AddValueToArray__Group__3 ;
    public final void rule__AddValueToArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6437:1: ( rule__AddValueToArray__Group__2__Impl rule__AddValueToArray__Group__3 )
            // InternalAedit.g:6438:2: rule__AddValueToArray__Group__2__Impl rule__AddValueToArray__Group__3
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
    // InternalAedit.g:6445:1: rule__AddValueToArray__Group__2__Impl : ( ( rule__AddValueToArray__IndexAssignment_2 ) ) ;
    public final void rule__AddValueToArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6449:1: ( ( ( rule__AddValueToArray__IndexAssignment_2 ) ) )
            // InternalAedit.g:6450:1: ( ( rule__AddValueToArray__IndexAssignment_2 ) )
            {
            // InternalAedit.g:6450:1: ( ( rule__AddValueToArray__IndexAssignment_2 ) )
            // InternalAedit.g:6451:2: ( rule__AddValueToArray__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getIndexAssignment_2()); 
            }
            // InternalAedit.g:6452:2: ( rule__AddValueToArray__IndexAssignment_2 )
            // InternalAedit.g:6452:3: rule__AddValueToArray__IndexAssignment_2
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
    // InternalAedit.g:6460:1: rule__AddValueToArray__Group__3 : rule__AddValueToArray__Group__3__Impl rule__AddValueToArray__Group__4 ;
    public final void rule__AddValueToArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6464:1: ( rule__AddValueToArray__Group__3__Impl rule__AddValueToArray__Group__4 )
            // InternalAedit.g:6465:2: rule__AddValueToArray__Group__3__Impl rule__AddValueToArray__Group__4
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
    // InternalAedit.g:6472:1: rule__AddValueToArray__Group__3__Impl : ( ')' ) ;
    public final void rule__AddValueToArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6476:1: ( ( ')' ) )
            // InternalAedit.g:6477:1: ( ')' )
            {
            // InternalAedit.g:6477:1: ( ')' )
            // InternalAedit.g:6478:2: ')'
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
    // InternalAedit.g:6487:1: rule__AddValueToArray__Group__4 : rule__AddValueToArray__Group__4__Impl rule__AddValueToArray__Group__5 ;
    public final void rule__AddValueToArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6491:1: ( rule__AddValueToArray__Group__4__Impl rule__AddValueToArray__Group__5 )
            // InternalAedit.g:6492:2: rule__AddValueToArray__Group__4__Impl rule__AddValueToArray__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalAedit.g:6499:1: rule__AddValueToArray__Group__4__Impl : ( ( rule__AddValueToArray__ArrayAssignment_4 ) ) ;
    public final void rule__AddValueToArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6503:1: ( ( ( rule__AddValueToArray__ArrayAssignment_4 ) ) )
            // InternalAedit.g:6504:1: ( ( rule__AddValueToArray__ArrayAssignment_4 ) )
            {
            // InternalAedit.g:6504:1: ( ( rule__AddValueToArray__ArrayAssignment_4 ) )
            // InternalAedit.g:6505:2: ( rule__AddValueToArray__ArrayAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getArrayAssignment_4()); 
            }
            // InternalAedit.g:6506:2: ( rule__AddValueToArray__ArrayAssignment_4 )
            // InternalAedit.g:6506:3: rule__AddValueToArray__ArrayAssignment_4
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
    // InternalAedit.g:6514:1: rule__AddValueToArray__Group__5 : rule__AddValueToArray__Group__5__Impl ;
    public final void rule__AddValueToArray__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6518:1: ( rule__AddValueToArray__Group__5__Impl )
            // InternalAedit.g:6519:2: rule__AddValueToArray__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddValueToArray__Group__5__Impl();

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
    // InternalAedit.g:6525:1: rule__AddValueToArray__Group__5__Impl : ( ';' ) ;
    public final void rule__AddValueToArray__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6529:1: ( ( ';' ) )
            // InternalAedit.g:6530:1: ( ';' )
            {
            // InternalAedit.g:6530:1: ( ';' )
            // InternalAedit.g:6531:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getSemicolonKeyword_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddValueToArrayAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Field__Group__0"
    // InternalAedit.g:6541:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6545:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalAedit.g:6546:2: rule__Field__Group__0__Impl rule__Field__Group__1
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
    // InternalAedit.g:6553:1: rule__Field__Group__0__Impl : ( ( rule__Field__AnnotationsAssignment_0 )* ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6557:1: ( ( ( rule__Field__AnnotationsAssignment_0 )* ) )
            // InternalAedit.g:6558:1: ( ( rule__Field__AnnotationsAssignment_0 )* )
            {
            // InternalAedit.g:6558:1: ( ( rule__Field__AnnotationsAssignment_0 )* )
            // InternalAedit.g:6559:2: ( rule__Field__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAnnotationsAssignment_0()); 
            }
            // InternalAedit.g:6560:2: ( rule__Field__AnnotationsAssignment_0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==53) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAedit.g:6560:3: rule__Field__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Field__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalAedit.g:6568:1: rule__Field__Group__1 : rule__Field__Group__1__Impl ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6572:1: ( rule__Field__Group__1__Impl )
            // InternalAedit.g:6573:2: rule__Field__Group__1__Impl
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
    // InternalAedit.g:6579:1: rule__Field__Group__1__Impl : ( ( rule__Field__FieldTypeAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6583:1: ( ( ( rule__Field__FieldTypeAssignment_1 ) ) )
            // InternalAedit.g:6584:1: ( ( rule__Field__FieldTypeAssignment_1 ) )
            {
            // InternalAedit.g:6584:1: ( ( rule__Field__FieldTypeAssignment_1 ) )
            // InternalAedit.g:6585:2: ( rule__Field__FieldTypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getFieldTypeAssignment_1()); 
            }
            // InternalAedit.g:6586:2: ( rule__Field__FieldTypeAssignment_1 )
            // InternalAedit.g:6586:3: rule__Field__FieldTypeAssignment_1
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
    // InternalAedit.g:6595:1: rule__CustomTypeField__Group__0 : rule__CustomTypeField__Group__0__Impl rule__CustomTypeField__Group__1 ;
    public final void rule__CustomTypeField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6599:1: ( rule__CustomTypeField__Group__0__Impl rule__CustomTypeField__Group__1 )
            // InternalAedit.g:6600:2: rule__CustomTypeField__Group__0__Impl rule__CustomTypeField__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalAedit.g:6607:1: rule__CustomTypeField__Group__0__Impl : ( ( rule__CustomTypeField__TypeAssignment_0 ) ) ;
    public final void rule__CustomTypeField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6611:1: ( ( ( rule__CustomTypeField__TypeAssignment_0 ) ) )
            // InternalAedit.g:6612:1: ( ( rule__CustomTypeField__TypeAssignment_0 ) )
            {
            // InternalAedit.g:6612:1: ( ( rule__CustomTypeField__TypeAssignment_0 ) )
            // InternalAedit.g:6613:2: ( rule__CustomTypeField__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeFieldAccess().getTypeAssignment_0()); 
            }
            // InternalAedit.g:6614:2: ( rule__CustomTypeField__TypeAssignment_0 )
            // InternalAedit.g:6614:3: rule__CustomTypeField__TypeAssignment_0
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
    // InternalAedit.g:6622:1: rule__CustomTypeField__Group__1 : rule__CustomTypeField__Group__1__Impl rule__CustomTypeField__Group__2 ;
    public final void rule__CustomTypeField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6626:1: ( rule__CustomTypeField__Group__1__Impl rule__CustomTypeField__Group__2 )
            // InternalAedit.g:6627:2: rule__CustomTypeField__Group__1__Impl rule__CustomTypeField__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalAedit.g:6634:1: rule__CustomTypeField__Group__1__Impl : ( ( rule__CustomTypeField__NameAnnotationsAssignment_1 )* ) ;
    public final void rule__CustomTypeField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6638:1: ( ( ( rule__CustomTypeField__NameAnnotationsAssignment_1 )* ) )
            // InternalAedit.g:6639:1: ( ( rule__CustomTypeField__NameAnnotationsAssignment_1 )* )
            {
            // InternalAedit.g:6639:1: ( ( rule__CustomTypeField__NameAnnotationsAssignment_1 )* )
            // InternalAedit.g:6640:2: ( rule__CustomTypeField__NameAnnotationsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeFieldAccess().getNameAnnotationsAssignment_1()); 
            }
            // InternalAedit.g:6641:2: ( rule__CustomTypeField__NameAnnotationsAssignment_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==53) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAedit.g:6641:3: rule__CustomTypeField__NameAnnotationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__CustomTypeField__NameAnnotationsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalAedit.g:6649:1: rule__CustomTypeField__Group__2 : rule__CustomTypeField__Group__2__Impl rule__CustomTypeField__Group__3 ;
    public final void rule__CustomTypeField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6653:1: ( rule__CustomTypeField__Group__2__Impl rule__CustomTypeField__Group__3 )
            // InternalAedit.g:6654:2: rule__CustomTypeField__Group__2__Impl rule__CustomTypeField__Group__3
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
    // InternalAedit.g:6661:1: rule__CustomTypeField__Group__2__Impl : ( ( rule__CustomTypeField__VarNameAssignment_2 ) ) ;
    public final void rule__CustomTypeField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6665:1: ( ( ( rule__CustomTypeField__VarNameAssignment_2 ) ) )
            // InternalAedit.g:6666:1: ( ( rule__CustomTypeField__VarNameAssignment_2 ) )
            {
            // InternalAedit.g:6666:1: ( ( rule__CustomTypeField__VarNameAssignment_2 ) )
            // InternalAedit.g:6667:2: ( rule__CustomTypeField__VarNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeFieldAccess().getVarNameAssignment_2()); 
            }
            // InternalAedit.g:6668:2: ( rule__CustomTypeField__VarNameAssignment_2 )
            // InternalAedit.g:6668:3: rule__CustomTypeField__VarNameAssignment_2
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
    // InternalAedit.g:6676:1: rule__CustomTypeField__Group__3 : rule__CustomTypeField__Group__3__Impl ;
    public final void rule__CustomTypeField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6680:1: ( rule__CustomTypeField__Group__3__Impl )
            // InternalAedit.g:6681:2: rule__CustomTypeField__Group__3__Impl
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
    // InternalAedit.g:6687:1: rule__CustomTypeField__Group__3__Impl : ( ';' ) ;
    public final void rule__CustomTypeField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6691:1: ( ( ';' ) )
            // InternalAedit.g:6692:1: ( ';' )
            {
            // InternalAedit.g:6692:1: ( ';' )
            // InternalAedit.g:6693:2: ';'
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
    // InternalAedit.g:6703:1: rule__PrimitiveTypeField__Group__0 : rule__PrimitiveTypeField__Group__0__Impl rule__PrimitiveTypeField__Group__1 ;
    public final void rule__PrimitiveTypeField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6707:1: ( rule__PrimitiveTypeField__Group__0__Impl rule__PrimitiveTypeField__Group__1 )
            // InternalAedit.g:6708:2: rule__PrimitiveTypeField__Group__0__Impl rule__PrimitiveTypeField__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalAedit.g:6715:1: rule__PrimitiveTypeField__Group__0__Impl : ( ( rule__PrimitiveTypeField__TypeAssignment_0 ) ) ;
    public final void rule__PrimitiveTypeField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6719:1: ( ( ( rule__PrimitiveTypeField__TypeAssignment_0 ) ) )
            // InternalAedit.g:6720:1: ( ( rule__PrimitiveTypeField__TypeAssignment_0 ) )
            {
            // InternalAedit.g:6720:1: ( ( rule__PrimitiveTypeField__TypeAssignment_0 ) )
            // InternalAedit.g:6721:2: ( rule__PrimitiveTypeField__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldAccess().getTypeAssignment_0()); 
            }
            // InternalAedit.g:6722:2: ( rule__PrimitiveTypeField__TypeAssignment_0 )
            // InternalAedit.g:6722:3: rule__PrimitiveTypeField__TypeAssignment_0
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
    // InternalAedit.g:6730:1: rule__PrimitiveTypeField__Group__1 : rule__PrimitiveTypeField__Group__1__Impl rule__PrimitiveTypeField__Group__2 ;
    public final void rule__PrimitiveTypeField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6734:1: ( rule__PrimitiveTypeField__Group__1__Impl rule__PrimitiveTypeField__Group__2 )
            // InternalAedit.g:6735:2: rule__PrimitiveTypeField__Group__1__Impl rule__PrimitiveTypeField__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalAedit.g:6742:1: rule__PrimitiveTypeField__Group__1__Impl : ( ( rule__PrimitiveTypeField__NameAnnotationsAssignment_1 )* ) ;
    public final void rule__PrimitiveTypeField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6746:1: ( ( ( rule__PrimitiveTypeField__NameAnnotationsAssignment_1 )* ) )
            // InternalAedit.g:6747:1: ( ( rule__PrimitiveTypeField__NameAnnotationsAssignment_1 )* )
            {
            // InternalAedit.g:6747:1: ( ( rule__PrimitiveTypeField__NameAnnotationsAssignment_1 )* )
            // InternalAedit.g:6748:2: ( rule__PrimitiveTypeField__NameAnnotationsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldAccess().getNameAnnotationsAssignment_1()); 
            }
            // InternalAedit.g:6749:2: ( rule__PrimitiveTypeField__NameAnnotationsAssignment_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==53) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAedit.g:6749:3: rule__PrimitiveTypeField__NameAnnotationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__PrimitiveTypeField__NameAnnotationsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalAedit.g:6757:1: rule__PrimitiveTypeField__Group__2 : rule__PrimitiveTypeField__Group__2__Impl rule__PrimitiveTypeField__Group__3 ;
    public final void rule__PrimitiveTypeField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6761:1: ( rule__PrimitiveTypeField__Group__2__Impl rule__PrimitiveTypeField__Group__3 )
            // InternalAedit.g:6762:2: rule__PrimitiveTypeField__Group__2__Impl rule__PrimitiveTypeField__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalAedit.g:6769:1: rule__PrimitiveTypeField__Group__2__Impl : ( ( rule__PrimitiveTypeField__VarNameAssignment_2 ) ) ;
    public final void rule__PrimitiveTypeField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6773:1: ( ( ( rule__PrimitiveTypeField__VarNameAssignment_2 ) ) )
            // InternalAedit.g:6774:1: ( ( rule__PrimitiveTypeField__VarNameAssignment_2 ) )
            {
            // InternalAedit.g:6774:1: ( ( rule__PrimitiveTypeField__VarNameAssignment_2 ) )
            // InternalAedit.g:6775:2: ( rule__PrimitiveTypeField__VarNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldAccess().getVarNameAssignment_2()); 
            }
            // InternalAedit.g:6776:2: ( rule__PrimitiveTypeField__VarNameAssignment_2 )
            // InternalAedit.g:6776:3: rule__PrimitiveTypeField__VarNameAssignment_2
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
    // InternalAedit.g:6784:1: rule__PrimitiveTypeField__Group__3 : rule__PrimitiveTypeField__Group__3__Impl ;
    public final void rule__PrimitiveTypeField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6788:1: ( rule__PrimitiveTypeField__Group__3__Impl )
            // InternalAedit.g:6789:2: rule__PrimitiveTypeField__Group__3__Impl
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
    // InternalAedit.g:6795:1: rule__PrimitiveTypeField__Group__3__Impl : ( ( rule__PrimitiveTypeField__Group_3__0 )? ) ;
    public final void rule__PrimitiveTypeField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6799:1: ( ( ( rule__PrimitiveTypeField__Group_3__0 )? ) )
            // InternalAedit.g:6800:1: ( ( rule__PrimitiveTypeField__Group_3__0 )? )
            {
            // InternalAedit.g:6800:1: ( ( rule__PrimitiveTypeField__Group_3__0 )? )
            // InternalAedit.g:6801:2: ( rule__PrimitiveTypeField__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldAccess().getGroup_3()); 
            }
            // InternalAedit.g:6802:2: ( rule__PrimitiveTypeField__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAedit.g:6802:3: rule__PrimitiveTypeField__Group_3__0
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
    // InternalAedit.g:6811:1: rule__PrimitiveTypeField__Group_3__0 : rule__PrimitiveTypeField__Group_3__0__Impl rule__PrimitiveTypeField__Group_3__1 ;
    public final void rule__PrimitiveTypeField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6815:1: ( rule__PrimitiveTypeField__Group_3__0__Impl rule__PrimitiveTypeField__Group_3__1 )
            // InternalAedit.g:6816:2: rule__PrimitiveTypeField__Group_3__0__Impl rule__PrimitiveTypeField__Group_3__1
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
    // InternalAedit.g:6823:1: rule__PrimitiveTypeField__Group_3__0__Impl : ( '=' ) ;
    public final void rule__PrimitiveTypeField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6827:1: ( ( '=' ) )
            // InternalAedit.g:6828:1: ( '=' )
            {
            // InternalAedit.g:6828:1: ( '=' )
            // InternalAedit.g:6829:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldAccess().getEqualsSignKeyword_3_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalAedit.g:6838:1: rule__PrimitiveTypeField__Group_3__1 : rule__PrimitiveTypeField__Group_3__1__Impl ;
    public final void rule__PrimitiveTypeField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6842:1: ( rule__PrimitiveTypeField__Group_3__1__Impl )
            // InternalAedit.g:6843:2: rule__PrimitiveTypeField__Group_3__1__Impl
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
    // InternalAedit.g:6849:1: rule__PrimitiveTypeField__Group_3__1__Impl : ( ( rule__PrimitiveTypeField__ValueAssignment_3_1 ) ) ;
    public final void rule__PrimitiveTypeField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6853:1: ( ( ( rule__PrimitiveTypeField__ValueAssignment_3_1 ) ) )
            // InternalAedit.g:6854:1: ( ( rule__PrimitiveTypeField__ValueAssignment_3_1 ) )
            {
            // InternalAedit.g:6854:1: ( ( rule__PrimitiveTypeField__ValueAssignment_3_1 ) )
            // InternalAedit.g:6855:2: ( rule__PrimitiveTypeField__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeFieldAccess().getValueAssignment_3_1()); 
            }
            // InternalAedit.g:6856:2: ( rule__PrimitiveTypeField__ValueAssignment_3_1 )
            // InternalAedit.g:6856:3: rule__PrimitiveTypeField__ValueAssignment_3_1
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
    // InternalAedit.g:6865:1: rule__ComplexTypeField__Group__0 : rule__ComplexTypeField__Group__0__Impl rule__ComplexTypeField__Group__1 ;
    public final void rule__ComplexTypeField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6869:1: ( rule__ComplexTypeField__Group__0__Impl rule__ComplexTypeField__Group__1 )
            // InternalAedit.g:6870:2: rule__ComplexTypeField__Group__0__Impl rule__ComplexTypeField__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalAedit.g:6877:1: rule__ComplexTypeField__Group__0__Impl : ( ( rule__ComplexTypeField__TypeAssignment_0 ) ) ;
    public final void rule__ComplexTypeField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6881:1: ( ( ( rule__ComplexTypeField__TypeAssignment_0 ) ) )
            // InternalAedit.g:6882:1: ( ( rule__ComplexTypeField__TypeAssignment_0 ) )
            {
            // InternalAedit.g:6882:1: ( ( rule__ComplexTypeField__TypeAssignment_0 ) )
            // InternalAedit.g:6883:2: ( rule__ComplexTypeField__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldAccess().getTypeAssignment_0()); 
            }
            // InternalAedit.g:6884:2: ( rule__ComplexTypeField__TypeAssignment_0 )
            // InternalAedit.g:6884:3: rule__ComplexTypeField__TypeAssignment_0
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
    // InternalAedit.g:6892:1: rule__ComplexTypeField__Group__1 : rule__ComplexTypeField__Group__1__Impl rule__ComplexTypeField__Group__2 ;
    public final void rule__ComplexTypeField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6896:1: ( rule__ComplexTypeField__Group__1__Impl rule__ComplexTypeField__Group__2 )
            // InternalAedit.g:6897:2: rule__ComplexTypeField__Group__1__Impl rule__ComplexTypeField__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalAedit.g:6904:1: rule__ComplexTypeField__Group__1__Impl : ( ( rule__ComplexTypeField__NameAnnotationsAssignment_1 )* ) ;
    public final void rule__ComplexTypeField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6908:1: ( ( ( rule__ComplexTypeField__NameAnnotationsAssignment_1 )* ) )
            // InternalAedit.g:6909:1: ( ( rule__ComplexTypeField__NameAnnotationsAssignment_1 )* )
            {
            // InternalAedit.g:6909:1: ( ( rule__ComplexTypeField__NameAnnotationsAssignment_1 )* )
            // InternalAedit.g:6910:2: ( rule__ComplexTypeField__NameAnnotationsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldAccess().getNameAnnotationsAssignment_1()); 
            }
            // InternalAedit.g:6911:2: ( rule__ComplexTypeField__NameAnnotationsAssignment_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==53) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAedit.g:6911:3: rule__ComplexTypeField__NameAnnotationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__ComplexTypeField__NameAnnotationsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalAedit.g:6919:1: rule__ComplexTypeField__Group__2 : rule__ComplexTypeField__Group__2__Impl rule__ComplexTypeField__Group__3 ;
    public final void rule__ComplexTypeField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6923:1: ( rule__ComplexTypeField__Group__2__Impl rule__ComplexTypeField__Group__3 )
            // InternalAedit.g:6924:2: rule__ComplexTypeField__Group__2__Impl rule__ComplexTypeField__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalAedit.g:6931:1: rule__ComplexTypeField__Group__2__Impl : ( ( rule__ComplexTypeField__VarNameAssignment_2 ) ) ;
    public final void rule__ComplexTypeField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6935:1: ( ( ( rule__ComplexTypeField__VarNameAssignment_2 ) ) )
            // InternalAedit.g:6936:1: ( ( rule__ComplexTypeField__VarNameAssignment_2 ) )
            {
            // InternalAedit.g:6936:1: ( ( rule__ComplexTypeField__VarNameAssignment_2 ) )
            // InternalAedit.g:6937:2: ( rule__ComplexTypeField__VarNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldAccess().getVarNameAssignment_2()); 
            }
            // InternalAedit.g:6938:2: ( rule__ComplexTypeField__VarNameAssignment_2 )
            // InternalAedit.g:6938:3: rule__ComplexTypeField__VarNameAssignment_2
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
    // InternalAedit.g:6946:1: rule__ComplexTypeField__Group__3 : rule__ComplexTypeField__Group__3__Impl ;
    public final void rule__ComplexTypeField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6950:1: ( rule__ComplexTypeField__Group__3__Impl )
            // InternalAedit.g:6951:2: rule__ComplexTypeField__Group__3__Impl
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
    // InternalAedit.g:6957:1: rule__ComplexTypeField__Group__3__Impl : ( ( rule__ComplexTypeField__Group_3__0 )? ) ;
    public final void rule__ComplexTypeField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6961:1: ( ( ( rule__ComplexTypeField__Group_3__0 )? ) )
            // InternalAedit.g:6962:1: ( ( rule__ComplexTypeField__Group_3__0 )? )
            {
            // InternalAedit.g:6962:1: ( ( rule__ComplexTypeField__Group_3__0 )? )
            // InternalAedit.g:6963:2: ( rule__ComplexTypeField__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldAccess().getGroup_3()); 
            }
            // InternalAedit.g:6964:2: ( rule__ComplexTypeField__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAedit.g:6964:3: rule__ComplexTypeField__Group_3__0
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
    // InternalAedit.g:6973:1: rule__ComplexTypeField__Group_3__0 : rule__ComplexTypeField__Group_3__0__Impl rule__ComplexTypeField__Group_3__1 ;
    public final void rule__ComplexTypeField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6977:1: ( rule__ComplexTypeField__Group_3__0__Impl rule__ComplexTypeField__Group_3__1 )
            // InternalAedit.g:6978:2: rule__ComplexTypeField__Group_3__0__Impl rule__ComplexTypeField__Group_3__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalAedit.g:6985:1: rule__ComplexTypeField__Group_3__0__Impl : ( '=' ) ;
    public final void rule__ComplexTypeField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:6989:1: ( ( '=' ) )
            // InternalAedit.g:6990:1: ( '=' )
            {
            // InternalAedit.g:6990:1: ( '=' )
            // InternalAedit.g:6991:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldAccess().getEqualsSignKeyword_3_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalAedit.g:7000:1: rule__ComplexTypeField__Group_3__1 : rule__ComplexTypeField__Group_3__1__Impl ;
    public final void rule__ComplexTypeField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7004:1: ( rule__ComplexTypeField__Group_3__1__Impl )
            // InternalAedit.g:7005:2: rule__ComplexTypeField__Group_3__1__Impl
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
    // InternalAedit.g:7011:1: rule__ComplexTypeField__Group_3__1__Impl : ( ( rule__ComplexTypeField__ValueAssignment_3_1 ) ) ;
    public final void rule__ComplexTypeField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7015:1: ( ( ( rule__ComplexTypeField__ValueAssignment_3_1 ) ) )
            // InternalAedit.g:7016:1: ( ( rule__ComplexTypeField__ValueAssignment_3_1 ) )
            {
            // InternalAedit.g:7016:1: ( ( rule__ComplexTypeField__ValueAssignment_3_1 ) )
            // InternalAedit.g:7017:2: ( rule__ComplexTypeField__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeFieldAccess().getValueAssignment_3_1()); 
            }
            // InternalAedit.g:7018:2: ( rule__ComplexTypeField__ValueAssignment_3_1 )
            // InternalAedit.g:7018:3: rule__ComplexTypeField__ValueAssignment_3_1
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
    // InternalAedit.g:7027:1: rule__ArrayTypeField__Group__0 : rule__ArrayTypeField__Group__0__Impl rule__ArrayTypeField__Group__1 ;
    public final void rule__ArrayTypeField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7031:1: ( rule__ArrayTypeField__Group__0__Impl rule__ArrayTypeField__Group__1 )
            // InternalAedit.g:7032:2: rule__ArrayTypeField__Group__0__Impl rule__ArrayTypeField__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalAedit.g:7039:1: rule__ArrayTypeField__Group__0__Impl : ( 'array' ) ;
    public final void rule__ArrayTypeField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7043:1: ( ( 'array' ) )
            // InternalAedit.g:7044:1: ( 'array' )
            {
            // InternalAedit.g:7044:1: ( 'array' )
            // InternalAedit.g:7045:2: 'array'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeFieldAccess().getArrayKeyword_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalAedit.g:7054:1: rule__ArrayTypeField__Group__1 : rule__ArrayTypeField__Group__1__Impl rule__ArrayTypeField__Group__2 ;
    public final void rule__ArrayTypeField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7058:1: ( rule__ArrayTypeField__Group__1__Impl rule__ArrayTypeField__Group__2 )
            // InternalAedit.g:7059:2: rule__ArrayTypeField__Group__1__Impl rule__ArrayTypeField__Group__2
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
    // InternalAedit.g:7066:1: rule__ArrayTypeField__Group__1__Impl : ( '<' ) ;
    public final void rule__ArrayTypeField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7070:1: ( ( '<' ) )
            // InternalAedit.g:7071:1: ( '<' )
            {
            // InternalAedit.g:7071:1: ( '<' )
            // InternalAedit.g:7072:2: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeFieldAccess().getLessThanSignKeyword_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalAedit.g:7081:1: rule__ArrayTypeField__Group__2 : rule__ArrayTypeField__Group__2__Impl rule__ArrayTypeField__Group__3 ;
    public final void rule__ArrayTypeField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7085:1: ( rule__ArrayTypeField__Group__2__Impl rule__ArrayTypeField__Group__3 )
            // InternalAedit.g:7086:2: rule__ArrayTypeField__Group__2__Impl rule__ArrayTypeField__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalAedit.g:7093:1: rule__ArrayTypeField__Group__2__Impl : ( ( rule__ArrayTypeField__TypeAssignment_2 ) ) ;
    public final void rule__ArrayTypeField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7097:1: ( ( ( rule__ArrayTypeField__TypeAssignment_2 ) ) )
            // InternalAedit.g:7098:1: ( ( rule__ArrayTypeField__TypeAssignment_2 ) )
            {
            // InternalAedit.g:7098:1: ( ( rule__ArrayTypeField__TypeAssignment_2 ) )
            // InternalAedit.g:7099:2: ( rule__ArrayTypeField__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeFieldAccess().getTypeAssignment_2()); 
            }
            // InternalAedit.g:7100:2: ( rule__ArrayTypeField__TypeAssignment_2 )
            // InternalAedit.g:7100:3: rule__ArrayTypeField__TypeAssignment_2
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
    // InternalAedit.g:7108:1: rule__ArrayTypeField__Group__3 : rule__ArrayTypeField__Group__3__Impl ;
    public final void rule__ArrayTypeField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7112:1: ( rule__ArrayTypeField__Group__3__Impl )
            // InternalAedit.g:7113:2: rule__ArrayTypeField__Group__3__Impl
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
    // InternalAedit.g:7119:1: rule__ArrayTypeField__Group__3__Impl : ( '>' ) ;
    public final void rule__ArrayTypeField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7123:1: ( ( '>' ) )
            // InternalAedit.g:7124:1: ( '>' )
            {
            // InternalAedit.g:7124:1: ( '>' )
            // InternalAedit.g:7125:2: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayTypeFieldAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalAedit.g:7135:1: rule__AnnotatedTypes__Group__0 : rule__AnnotatedTypes__Group__0__Impl rule__AnnotatedTypes__Group__1 ;
    public final void rule__AnnotatedTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7139:1: ( rule__AnnotatedTypes__Group__0__Impl rule__AnnotatedTypes__Group__1 )
            // InternalAedit.g:7140:2: rule__AnnotatedTypes__Group__0__Impl rule__AnnotatedTypes__Group__1
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
    // InternalAedit.g:7147:1: rule__AnnotatedTypes__Group__0__Impl : ( ( rule__AnnotatedTypes__AnnotataionsAssignment_0 )* ) ;
    public final void rule__AnnotatedTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7151:1: ( ( ( rule__AnnotatedTypes__AnnotataionsAssignment_0 )* ) )
            // InternalAedit.g:7152:1: ( ( rule__AnnotatedTypes__AnnotataionsAssignment_0 )* )
            {
            // InternalAedit.g:7152:1: ( ( rule__AnnotatedTypes__AnnotataionsAssignment_0 )* )
            // InternalAedit.g:7153:2: ( rule__AnnotatedTypes__AnnotataionsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotatedTypesAccess().getAnnotataionsAssignment_0()); 
            }
            // InternalAedit.g:7154:2: ( rule__AnnotatedTypes__AnnotataionsAssignment_0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==53) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAedit.g:7154:3: rule__AnnotatedTypes__AnnotataionsAssignment_0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__AnnotatedTypes__AnnotataionsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalAedit.g:7162:1: rule__AnnotatedTypes__Group__1 : rule__AnnotatedTypes__Group__1__Impl ;
    public final void rule__AnnotatedTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7166:1: ( rule__AnnotatedTypes__Group__1__Impl )
            // InternalAedit.g:7167:2: rule__AnnotatedTypes__Group__1__Impl
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
    // InternalAedit.g:7173:1: rule__AnnotatedTypes__Group__1__Impl : ( ( rule__AnnotatedTypes__TypeAssignment_1 ) ) ;
    public final void rule__AnnotatedTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7177:1: ( ( ( rule__AnnotatedTypes__TypeAssignment_1 ) ) )
            // InternalAedit.g:7178:1: ( ( rule__AnnotatedTypes__TypeAssignment_1 ) )
            {
            // InternalAedit.g:7178:1: ( ( rule__AnnotatedTypes__TypeAssignment_1 ) )
            // InternalAedit.g:7179:2: ( rule__AnnotatedTypes__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotatedTypesAccess().getTypeAssignment_1()); 
            }
            // InternalAedit.g:7180:2: ( rule__AnnotatedTypes__TypeAssignment_1 )
            // InternalAedit.g:7180:3: rule__AnnotatedTypes__TypeAssignment_1
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
    // InternalAedit.g:7189:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7193:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalAedit.g:7194:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
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
    // InternalAedit.g:7201:1: rule__Annotation__Group__0__Impl : ( ( rule__Annotation__NameAssignment_0 ) ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7205:1: ( ( ( rule__Annotation__NameAssignment_0 ) ) )
            // InternalAedit.g:7206:1: ( ( rule__Annotation__NameAssignment_0 ) )
            {
            // InternalAedit.g:7206:1: ( ( rule__Annotation__NameAssignment_0 ) )
            // InternalAedit.g:7207:2: ( rule__Annotation__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameAssignment_0()); 
            }
            // InternalAedit.g:7208:2: ( rule__Annotation__NameAssignment_0 )
            // InternalAedit.g:7208:3: rule__Annotation__NameAssignment_0
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
    // InternalAedit.g:7216:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7220:1: ( rule__Annotation__Group__1__Impl )
            // InternalAedit.g:7221:2: rule__Annotation__Group__1__Impl
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
    // InternalAedit.g:7227:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__Group_1__0 )? ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7231:1: ( ( ( rule__Annotation__Group_1__0 )? ) )
            // InternalAedit.g:7232:1: ( ( rule__Annotation__Group_1__0 )? )
            {
            // InternalAedit.g:7232:1: ( ( rule__Annotation__Group_1__0 )? )
            // InternalAedit.g:7233:2: ( rule__Annotation__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_1()); 
            }
            // InternalAedit.g:7234:2: ( rule__Annotation__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAedit.g:7234:3: rule__Annotation__Group_1__0
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
    // InternalAedit.g:7243:1: rule__Annotation__Group_1__0 : rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1 ;
    public final void rule__Annotation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7247:1: ( rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1 )
            // InternalAedit.g:7248:2: rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalAedit.g:7255:1: rule__Annotation__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Annotation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7259:1: ( ( '(' ) )
            // InternalAedit.g:7260:1: ( '(' )
            {
            // InternalAedit.g:7260:1: ( '(' )
            // InternalAedit.g:7261:2: '('
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
    // InternalAedit.g:7270:1: rule__Annotation__Group_1__1 : rule__Annotation__Group_1__1__Impl rule__Annotation__Group_1__2 ;
    public final void rule__Annotation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7274:1: ( rule__Annotation__Group_1__1__Impl rule__Annotation__Group_1__2 )
            // InternalAedit.g:7275:2: rule__Annotation__Group_1__1__Impl rule__Annotation__Group_1__2
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
    // InternalAedit.g:7282:1: rule__Annotation__Group_1__1__Impl : ( ( rule__Annotation__ValuesAssignment_1_1 ) ) ;
    public final void rule__Annotation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7286:1: ( ( ( rule__Annotation__ValuesAssignment_1_1 ) ) )
            // InternalAedit.g:7287:1: ( ( rule__Annotation__ValuesAssignment_1_1 ) )
            {
            // InternalAedit.g:7287:1: ( ( rule__Annotation__ValuesAssignment_1_1 ) )
            // InternalAedit.g:7288:2: ( rule__Annotation__ValuesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getValuesAssignment_1_1()); 
            }
            // InternalAedit.g:7289:2: ( rule__Annotation__ValuesAssignment_1_1 )
            // InternalAedit.g:7289:3: rule__Annotation__ValuesAssignment_1_1
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
    // InternalAedit.g:7297:1: rule__Annotation__Group_1__2 : rule__Annotation__Group_1__2__Impl ;
    public final void rule__Annotation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7301:1: ( rule__Annotation__Group_1__2__Impl )
            // InternalAedit.g:7302:2: rule__Annotation__Group_1__2__Impl
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
    // InternalAedit.g:7308:1: rule__Annotation__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Annotation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7312:1: ( ( ')' ) )
            // InternalAedit.g:7313:1: ( ')' )
            {
            // InternalAedit.g:7313:1: ( ')' )
            // InternalAedit.g:7314:2: ')'
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
    // InternalAedit.g:7324:1: rule__Values__Group__0 : rule__Values__Group__0__Impl rule__Values__Group__1 ;
    public final void rule__Values__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7328:1: ( rule__Values__Group__0__Impl rule__Values__Group__1 )
            // InternalAedit.g:7329:2: rule__Values__Group__0__Impl rule__Values__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalAedit.g:7336:1: rule__Values__Group__0__Impl : ( () ) ;
    public final void rule__Values__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7340:1: ( ( () ) )
            // InternalAedit.g:7341:1: ( () )
            {
            // InternalAedit.g:7341:1: ( () )
            // InternalAedit.g:7342:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValuesAction_0()); 
            }
            // InternalAedit.g:7343:2: ()
            // InternalAedit.g:7343:3: 
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
    // InternalAedit.g:7351:1: rule__Values__Group__1 : rule__Values__Group__1__Impl ;
    public final void rule__Values__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7355:1: ( rule__Values__Group__1__Impl )
            // InternalAedit.g:7356:2: rule__Values__Group__1__Impl
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
    // InternalAedit.g:7362:1: rule__Values__Group__1__Impl : ( ( rule__Values__Alternatives_1 )* ) ;
    public final void rule__Values__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7366:1: ( ( ( rule__Values__Alternatives_1 )* ) )
            // InternalAedit.g:7367:1: ( ( rule__Values__Alternatives_1 )* )
            {
            // InternalAedit.g:7367:1: ( ( rule__Values__Alternatives_1 )* )
            // InternalAedit.g:7368:2: ( rule__Values__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getAlternatives_1()); 
            }
            // InternalAedit.g:7369:2: ( rule__Values__Alternatives_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_INT && LA36_0<=RULE_ID)||(LA36_0>=13 && LA36_0<=14)||LA36_0==50||LA36_0==52||LA36_0==54) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAedit.g:7369:3: rule__Values__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__Values__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalAedit.g:7378:1: rule__Values__Group_1_1__0 : rule__Values__Group_1_1__0__Impl rule__Values__Group_1_1__1 ;
    public final void rule__Values__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7382:1: ( rule__Values__Group_1_1__0__Impl rule__Values__Group_1_1__1 )
            // InternalAedit.g:7383:2: rule__Values__Group_1_1__0__Impl rule__Values__Group_1_1__1
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
    // InternalAedit.g:7390:1: rule__Values__Group_1_1__0__Impl : ( ( rule__Values__ValueAssignment_1_1_0 ) ) ;
    public final void rule__Values__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7394:1: ( ( ( rule__Values__ValueAssignment_1_1_0 ) ) )
            // InternalAedit.g:7395:1: ( ( rule__Values__ValueAssignment_1_1_0 ) )
            {
            // InternalAedit.g:7395:1: ( ( rule__Values__ValueAssignment_1_1_0 ) )
            // InternalAedit.g:7396:2: ( rule__Values__ValueAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValueAssignment_1_1_0()); 
            }
            // InternalAedit.g:7397:2: ( rule__Values__ValueAssignment_1_1_0 )
            // InternalAedit.g:7397:3: rule__Values__ValueAssignment_1_1_0
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
    // InternalAedit.g:7405:1: rule__Values__Group_1_1__1 : rule__Values__Group_1_1__1__Impl ;
    public final void rule__Values__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7409:1: ( rule__Values__Group_1_1__1__Impl )
            // InternalAedit.g:7410:2: rule__Values__Group_1_1__1__Impl
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
    // InternalAedit.g:7416:1: rule__Values__Group_1_1__1__Impl : ( ( rule__Values__Group_1_1_1__0 )* ) ;
    public final void rule__Values__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7420:1: ( ( ( rule__Values__Group_1_1_1__0 )* ) )
            // InternalAedit.g:7421:1: ( ( rule__Values__Group_1_1_1__0 )* )
            {
            // InternalAedit.g:7421:1: ( ( rule__Values__Group_1_1_1__0 )* )
            // InternalAedit.g:7422:2: ( rule__Values__Group_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getGroup_1_1_1()); 
            }
            // InternalAedit.g:7423:2: ( rule__Values__Group_1_1_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==40) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAedit.g:7423:3: rule__Values__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Values__Group_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalAedit.g:7432:1: rule__Values__Group_1_1_1__0 : rule__Values__Group_1_1_1__0__Impl rule__Values__Group_1_1_1__1 ;
    public final void rule__Values__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7436:1: ( rule__Values__Group_1_1_1__0__Impl rule__Values__Group_1_1_1__1 )
            // InternalAedit.g:7437:2: rule__Values__Group_1_1_1__0__Impl rule__Values__Group_1_1_1__1
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
    // InternalAedit.g:7444:1: rule__Values__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__Values__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7448:1: ( ( ',' ) )
            // InternalAedit.g:7449:1: ( ',' )
            {
            // InternalAedit.g:7449:1: ( ',' )
            // InternalAedit.g:7450:2: ','
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
    // InternalAedit.g:7459:1: rule__Values__Group_1_1_1__1 : rule__Values__Group_1_1_1__1__Impl ;
    public final void rule__Values__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7463:1: ( rule__Values__Group_1_1_1__1__Impl )
            // InternalAedit.g:7464:2: rule__Values__Group_1_1_1__1__Impl
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
    // InternalAedit.g:7470:1: rule__Values__Group_1_1_1__1__Impl : ( ( rule__Values__ValueAssignment_1_1_1_1 ) ) ;
    public final void rule__Values__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7474:1: ( ( ( rule__Values__ValueAssignment_1_1_1_1 ) ) )
            // InternalAedit.g:7475:1: ( ( rule__Values__ValueAssignment_1_1_1_1 ) )
            {
            // InternalAedit.g:7475:1: ( ( rule__Values__ValueAssignment_1_1_1_1 ) )
            // InternalAedit.g:7476:2: ( rule__Values__ValueAssignment_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValuesAccess().getValueAssignment_1_1_1_1()); 
            }
            // InternalAedit.g:7477:2: ( rule__Values__ValueAssignment_1_1_1_1 )
            // InternalAedit.g:7477:3: rule__Values__ValueAssignment_1_1_1_1
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
    // InternalAedit.g:7486:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7490:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // InternalAedit.g:7491:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalAedit.g:7498:1: rule__Array__Group__0__Impl : ( ( '[' ) ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7502:1: ( ( ( '[' ) ) )
            // InternalAedit.g:7503:1: ( ( '[' ) )
            {
            // InternalAedit.g:7503:1: ( ( '[' ) )
            // InternalAedit.g:7504:2: ( '[' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_0()); 
            }
            // InternalAedit.g:7505:2: ( '[' )
            // InternalAedit.g:7505:3: '['
            {
            match(input,50,FOLLOW_2); if (state.failed) return ;

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
    // InternalAedit.g:7513:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7517:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // InternalAedit.g:7518:2: rule__Array__Group__1__Impl rule__Array__Group__2
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
    // InternalAedit.g:7525:1: rule__Array__Group__1__Impl : ( ( rule__Array__ValuesAssignment_1 ) ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7529:1: ( ( ( rule__Array__ValuesAssignment_1 ) ) )
            // InternalAedit.g:7530:1: ( ( rule__Array__ValuesAssignment_1 ) )
            {
            // InternalAedit.g:7530:1: ( ( rule__Array__ValuesAssignment_1 ) )
            // InternalAedit.g:7531:2: ( rule__Array__ValuesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getValuesAssignment_1()); 
            }
            // InternalAedit.g:7532:2: ( rule__Array__ValuesAssignment_1 )
            // InternalAedit.g:7532:3: rule__Array__ValuesAssignment_1
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
    // InternalAedit.g:7540:1: rule__Array__Group__2 : rule__Array__Group__2__Impl ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7544:1: ( rule__Array__Group__2__Impl )
            // InternalAedit.g:7545:2: rule__Array__Group__2__Impl
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
    // InternalAedit.g:7551:1: rule__Array__Group__2__Impl : ( ']' ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7555:1: ( ( ']' ) )
            // InternalAedit.g:7556:1: ( ']' )
            {
            // InternalAedit.g:7556:1: ( ']' )
            // InternalAedit.g:7557:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
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
    // InternalAedit.g:7567:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7571:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // InternalAedit.g:7572:2: rule__Real__Group__0__Impl rule__Real__Group__1
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
    // InternalAedit.g:7579:1: rule__Real__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7583:1: ( ( ( '-' )? ) )
            // InternalAedit.g:7584:1: ( ( '-' )? )
            {
            // InternalAedit.g:7584:1: ( ( '-' )? )
            // InternalAedit.g:7585:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalAedit.g:7586:2: ( '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==52) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAedit.g:7586:3: '-'
                    {
                    match(input,52,FOLLOW_2); if (state.failed) return ;

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
    // InternalAedit.g:7594:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7598:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // InternalAedit.g:7599:2: rule__Real__Group__1__Impl rule__Real__Group__2
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
    // InternalAedit.g:7606:1: rule__Real__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7610:1: ( ( RULE_INT ) )
            // InternalAedit.g:7611:1: ( RULE_INT )
            {
            // InternalAedit.g:7611:1: ( RULE_INT )
            // InternalAedit.g:7612:2: RULE_INT
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
    // InternalAedit.g:7621:1: rule__Real__Group__2 : rule__Real__Group__2__Impl rule__Real__Group__3 ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7625:1: ( rule__Real__Group__2__Impl rule__Real__Group__3 )
            // InternalAedit.g:7626:2: rule__Real__Group__2__Impl rule__Real__Group__3
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
    // InternalAedit.g:7633:1: rule__Real__Group__2__Impl : ( '.' ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7637:1: ( ( '.' ) )
            // InternalAedit.g:7638:1: ( '.' )
            {
            // InternalAedit.g:7638:1: ( '.' )
            // InternalAedit.g:7639:2: '.'
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
    // InternalAedit.g:7648:1: rule__Real__Group__3 : rule__Real__Group__3__Impl ;
    public final void rule__Real__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7652:1: ( rule__Real__Group__3__Impl )
            // InternalAedit.g:7653:2: rule__Real__Group__3__Impl
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
    // InternalAedit.g:7659:1: rule__Real__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7663:1: ( ( RULE_INT ) )
            // InternalAedit.g:7664:1: ( RULE_INT )
            {
            // InternalAedit.g:7664:1: ( RULE_INT )
            // InternalAedit.g:7665:2: RULE_INT
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
    // InternalAedit.g:7675:1: rule__NegativeInt__Group__0 : rule__NegativeInt__Group__0__Impl rule__NegativeInt__Group__1 ;
    public final void rule__NegativeInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7679:1: ( rule__NegativeInt__Group__0__Impl rule__NegativeInt__Group__1 )
            // InternalAedit.g:7680:2: rule__NegativeInt__Group__0__Impl rule__NegativeInt__Group__1
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
    // InternalAedit.g:7687:1: rule__NegativeInt__Group__0__Impl : ( '-' ) ;
    public final void rule__NegativeInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7691:1: ( ( '-' ) )
            // InternalAedit.g:7692:1: ( '-' )
            {
            // InternalAedit.g:7692:1: ( '-' )
            // InternalAedit.g:7693:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegativeIntAccess().getHyphenMinusKeyword_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalAedit.g:7702:1: rule__NegativeInt__Group__1 : rule__NegativeInt__Group__1__Impl ;
    public final void rule__NegativeInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7706:1: ( rule__NegativeInt__Group__1__Impl )
            // InternalAedit.g:7707:2: rule__NegativeInt__Group__1__Impl
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
    // InternalAedit.g:7713:1: rule__NegativeInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__NegativeInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7717:1: ( ( RULE_INT ) )
            // InternalAedit.g:7718:1: ( RULE_INT )
            {
            // InternalAedit.g:7718:1: ( RULE_INT )
            // InternalAedit.g:7719:2: RULE_INT
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
    // InternalAedit.g:7729:1: rule__QN__Group__0 : rule__QN__Group__0__Impl rule__QN__Group__1 ;
    public final void rule__QN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7733:1: ( rule__QN__Group__0__Impl rule__QN__Group__1 )
            // InternalAedit.g:7734:2: rule__QN__Group__0__Impl rule__QN__Group__1
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
    // InternalAedit.g:7741:1: rule__QN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7745:1: ( ( RULE_ID ) )
            // InternalAedit.g:7746:1: ( RULE_ID )
            {
            // InternalAedit.g:7746:1: ( RULE_ID )
            // InternalAedit.g:7747:2: RULE_ID
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
    // InternalAedit.g:7756:1: rule__QN__Group__1 : rule__QN__Group__1__Impl ;
    public final void rule__QN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7760:1: ( rule__QN__Group__1__Impl )
            // InternalAedit.g:7761:2: rule__QN__Group__1__Impl
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
    // InternalAedit.g:7767:1: rule__QN__Group__1__Impl : ( ( rule__QN__Group_1__0 )* ) ;
    public final void rule__QN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7771:1: ( ( ( rule__QN__Group_1__0 )* ) )
            // InternalAedit.g:7772:1: ( ( rule__QN__Group_1__0 )* )
            {
            // InternalAedit.g:7772:1: ( ( rule__QN__Group_1__0 )* )
            // InternalAedit.g:7773:2: ( rule__QN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQNAccess().getGroup_1()); 
            }
            // InternalAedit.g:7774:2: ( rule__QN__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==39) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAedit.g:7774:3: rule__QN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__QN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalAedit.g:7783:1: rule__QN__Group_1__0 : rule__QN__Group_1__0__Impl rule__QN__Group_1__1 ;
    public final void rule__QN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7787:1: ( rule__QN__Group_1__0__Impl rule__QN__Group_1__1 )
            // InternalAedit.g:7788:2: rule__QN__Group_1__0__Impl rule__QN__Group_1__1
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
    // InternalAedit.g:7795:1: rule__QN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7799:1: ( ( '.' ) )
            // InternalAedit.g:7800:1: ( '.' )
            {
            // InternalAedit.g:7800:1: ( '.' )
            // InternalAedit.g:7801:2: '.'
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
    // InternalAedit.g:7810:1: rule__QN__Group_1__1 : rule__QN__Group_1__1__Impl ;
    public final void rule__QN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7814:1: ( rule__QN__Group_1__1__Impl )
            // InternalAedit.g:7815:2: rule__QN__Group_1__1__Impl
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
    // InternalAedit.g:7821:1: rule__QN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7825:1: ( ( RULE_ID ) )
            // InternalAedit.g:7826:1: ( RULE_ID )
            {
            // InternalAedit.g:7826:1: ( RULE_ID )
            // InternalAedit.g:7827:2: RULE_ID
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
    // InternalAedit.g:7837:1: rule__AN__Group__0 : rule__AN__Group__0__Impl rule__AN__Group__1 ;
    public final void rule__AN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7841:1: ( rule__AN__Group__0__Impl rule__AN__Group__1 )
            // InternalAedit.g:7842:2: rule__AN__Group__0__Impl rule__AN__Group__1
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
    // InternalAedit.g:7849:1: rule__AN__Group__0__Impl : ( '@' ) ;
    public final void rule__AN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7853:1: ( ( '@' ) )
            // InternalAedit.g:7854:1: ( '@' )
            {
            // InternalAedit.g:7854:1: ( '@' )
            // InternalAedit.g:7855:2: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getCommercialAtKeyword_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
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
    // InternalAedit.g:7864:1: rule__AN__Group__1 : rule__AN__Group__1__Impl rule__AN__Group__2 ;
    public final void rule__AN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7868:1: ( rule__AN__Group__1__Impl rule__AN__Group__2 )
            // InternalAedit.g:7869:2: rule__AN__Group__1__Impl rule__AN__Group__2
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
    // InternalAedit.g:7876:1: rule__AN__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__AN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7880:1: ( ( RULE_ID ) )
            // InternalAedit.g:7881:1: ( RULE_ID )
            {
            // InternalAedit.g:7881:1: ( RULE_ID )
            // InternalAedit.g:7882:2: RULE_ID
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
    // InternalAedit.g:7891:1: rule__AN__Group__2 : rule__AN__Group__2__Impl ;
    public final void rule__AN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7895:1: ( rule__AN__Group__2__Impl )
            // InternalAedit.g:7896:2: rule__AN__Group__2__Impl
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
    // InternalAedit.g:7902:1: rule__AN__Group__2__Impl : ( ( rule__AN__Group_2__0 )* ) ;
    public final void rule__AN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7906:1: ( ( ( rule__AN__Group_2__0 )* ) )
            // InternalAedit.g:7907:1: ( ( rule__AN__Group_2__0 )* )
            {
            // InternalAedit.g:7907:1: ( ( rule__AN__Group_2__0 )* )
            // InternalAedit.g:7908:2: ( rule__AN__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getGroup_2()); 
            }
            // InternalAedit.g:7909:2: ( rule__AN__Group_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==52) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAedit.g:7909:3: rule__AN__Group_2__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__AN__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalAedit.g:7918:1: rule__AN__Group_2__0 : rule__AN__Group_2__0__Impl rule__AN__Group_2__1 ;
    public final void rule__AN__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7922:1: ( rule__AN__Group_2__0__Impl rule__AN__Group_2__1 )
            // InternalAedit.g:7923:2: rule__AN__Group_2__0__Impl rule__AN__Group_2__1
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
    // InternalAedit.g:7930:1: rule__AN__Group_2__0__Impl : ( '-' ) ;
    public final void rule__AN__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7934:1: ( ( '-' ) )
            // InternalAedit.g:7935:1: ( '-' )
            {
            // InternalAedit.g:7935:1: ( '-' )
            // InternalAedit.g:7936:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getANAccess().getHyphenMinusKeyword_2_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalAedit.g:7945:1: rule__AN__Group_2__1 : rule__AN__Group_2__1__Impl ;
    public final void rule__AN__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7949:1: ( rule__AN__Group_2__1__Impl )
            // InternalAedit.g:7950:2: rule__AN__Group_2__1__Impl
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
    // InternalAedit.g:7956:1: rule__AN__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__AN__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7960:1: ( ( RULE_ID ) )
            // InternalAedit.g:7961:1: ( RULE_ID )
            {
            // InternalAedit.g:7961:1: ( RULE_ID )
            // InternalAedit.g:7962:2: RULE_ID
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
    // InternalAedit.g:7972:1: rule__Model__RuleDeclarationsAssignment_0 : ( ruleRuleDeclaration ) ;
    public final void rule__Model__RuleDeclarationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7976:1: ( ( ruleRuleDeclaration ) )
            // InternalAedit.g:7977:2: ( ruleRuleDeclaration )
            {
            // InternalAedit.g:7977:2: ( ruleRuleDeclaration )
            // InternalAedit.g:7978:3: ruleRuleDeclaration
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
    // InternalAedit.g:7987:1: rule__Model__RuleMapsAssignment_1 : ( ruleRuleMap ) ;
    public final void rule__Model__RuleMapsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:7991:1: ( ( ruleRuleMap ) )
            // InternalAedit.g:7992:2: ( ruleRuleMap )
            {
            // InternalAedit.g:7992:2: ( ruleRuleMap )
            // InternalAedit.g:7993:3: ruleRuleMap
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
    // InternalAedit.g:8002:1: rule__Model__FeaturesAssignment_2 : ( ruleFeature ) ;
    public final void rule__Model__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8006:1: ( ( ruleFeature ) )
            // InternalAedit.g:8007:2: ( ruleFeature )
            {
            // InternalAedit.g:8007:2: ( ruleFeature )
            // InternalAedit.g:8008:3: ruleFeature
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
    // InternalAedit.g:8017:1: rule__Model__FeatureMapsAssignment_3 : ( ruleFeatureMap ) ;
    public final void rule__Model__FeatureMapsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8021:1: ( ( ruleFeatureMap ) )
            // InternalAedit.g:8022:2: ( ruleFeatureMap )
            {
            // InternalAedit.g:8022:2: ( ruleFeatureMap )
            // InternalAedit.g:8023:3: ruleFeatureMap
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
    // InternalAedit.g:8032:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8036:1: ( ( RULE_ID ) )
            // InternalAedit.g:8037:2: ( RULE_ID )
            {
            // InternalAedit.g:8037:2: ( RULE_ID )
            // InternalAedit.g:8038:3: RULE_ID
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
    // InternalAedit.g:8047:1: rule__Feature__ExtendAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__ExtendAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8051:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:8052:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:8052:2: ( ( RULE_ID ) )
            // InternalAedit.g:8053:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getExtendFeatureCrossReference_2_1_0()); 
            }
            // InternalAedit.g:8054:3: ( RULE_ID )
            // InternalAedit.g:8055:4: RULE_ID
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
    // InternalAedit.g:8066:1: rule__Feature__RuleMapsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__RuleMapsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8070:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:8071:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:8071:2: ( ( RULE_ID ) )
            // InternalAedit.g:8072:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getRuleMapsRuleMapCrossReference_4_0()); 
            }
            // InternalAedit.g:8073:3: ( RULE_ID )
            // InternalAedit.g:8074:4: RULE_ID
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
    // InternalAedit.g:8085:1: rule__FeatureMap__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8089:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:8090:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:8090:2: ( ( RULE_ID ) )
            // InternalAedit.g:8091:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureMapAccess().getNameFeatureCrossReference_1_0()); 
            }
            // InternalAedit.g:8092:3: ( RULE_ID )
            // InternalAedit.g:8093:4: RULE_ID
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
    // InternalAedit.g:8104:1: rule__RuleMap__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuleMap__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8108:1: ( ( RULE_ID ) )
            // InternalAedit.g:8109:2: ( RULE_ID )
            {
            // InternalAedit.g:8109:2: ( RULE_ID )
            // InternalAedit.g:8110:3: RULE_ID
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
    // InternalAedit.g:8119:1: rule__RuleMap__RulesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RuleMap__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8123:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:8124:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:8124:2: ( ( RULE_ID ) )
            // InternalAedit.g:8125:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleMapAccess().getRulesRuleDeclarationCrossReference_3_0()); 
            }
            // InternalAedit.g:8126:3: ( RULE_ID )
            // InternalAedit.g:8127:4: RULE_ID
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
    // InternalAedit.g:8138:1: rule__RuleDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuleDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8142:1: ( ( RULE_ID ) )
            // InternalAedit.g:8143:2: ( RULE_ID )
            {
            // InternalAedit.g:8143:2: ( RULE_ID )
            // InternalAedit.g:8144:3: RULE_ID
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
    // InternalAedit.g:8153:1: rule__RuleDeclaration__RulesAssignment_3 : ( ruleGenericRule ) ;
    public final void rule__RuleDeclaration__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8157:1: ( ( ruleGenericRule ) )
            // InternalAedit.g:8158:2: ( ruleGenericRule )
            {
            // InternalAedit.g:8158:2: ( ruleGenericRule )
            // InternalAedit.g:8159:3: ruleGenericRule
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
    // InternalAedit.g:8168:1: rule__AddAnnotationToSchema__SchemaTypeAssignment_1 : ( ruleSCHEMA_TYPE ) ;
    public final void rule__AddAnnotationToSchema__SchemaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8172:1: ( ( ruleSCHEMA_TYPE ) )
            // InternalAedit.g:8173:2: ( ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:8173:2: ( ruleSCHEMA_TYPE )
            // InternalAedit.g:8174:3: ruleSCHEMA_TYPE
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
    // InternalAedit.g:8183:1: rule__AddAnnotationToSchema__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__AddAnnotationToSchema__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8187:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8188:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8188:2: ( ( ruleQN ) )
            // InternalAedit.g:8189:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            }
            // InternalAedit.g:8190:3: ( ruleQN )
            // InternalAedit.g:8191:4: ruleQN
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
    // InternalAedit.g:8202:1: rule__AddAnnotationToSchema__AnnotationAssignment_4 : ( ruleAnnotation ) ;
    public final void rule__AddAnnotationToSchema__AnnotationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8206:1: ( ( ruleAnnotation ) )
            // InternalAedit.g:8207:2: ( ruleAnnotation )
            {
            // InternalAedit.g:8207:2: ( ruleAnnotation )
            // InternalAedit.g:8208:3: ruleAnnotation
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
    // InternalAedit.g:8217:1: rule__AddAnnotationToField__VariableAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__AddAnnotationToField__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8221:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8222:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8222:2: ( ( ruleQN ) )
            // InternalAedit.g:8223:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddAnnotationToFieldAccess().getVariableFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:8224:3: ( ruleQN )
            // InternalAedit.g:8225:4: ruleQN
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
    // InternalAedit.g:8236:1: rule__AddAnnotationToField__AnnotationAssignment_3 : ( ruleAnnotation ) ;
    public final void rule__AddAnnotationToField__AnnotationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8240:1: ( ( ruleAnnotation ) )
            // InternalAedit.g:8241:2: ( ruleAnnotation )
            {
            // InternalAedit.g:8241:2: ( ruleAnnotation )
            // InternalAedit.g:8242:3: ruleAnnotation
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
    // InternalAedit.g:8251:1: rule__AddNameAnnotationToField__VariableAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__AddNameAnnotationToField__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8255:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8256:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8256:2: ( ( ruleQN ) )
            // InternalAedit.g:8257:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddNameAnnotationToFieldAccess().getVariableFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:8258:3: ( ruleQN )
            // InternalAedit.g:8259:4: ruleQN
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
    // InternalAedit.g:8270:1: rule__AddNameAnnotationToField__AnnotationAssignment_3 : ( ruleAnnotation ) ;
    public final void rule__AddNameAnnotationToField__AnnotationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8274:1: ( ( ruleAnnotation ) )
            // InternalAedit.g:8275:2: ( ruleAnnotation )
            {
            // InternalAedit.g:8275:2: ( ruleAnnotation )
            // InternalAedit.g:8276:3: ruleAnnotation
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
    // InternalAedit.g:8285:1: rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1 : ( ruleSCHEMA_TYPE ) ;
    public final void rule__RemoveAnnotationFromSchema__SchemaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8289:1: ( ( ruleSCHEMA_TYPE ) )
            // InternalAedit.g:8290:2: ( ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:8290:2: ( ruleSCHEMA_TYPE )
            // InternalAedit.g:8291:3: ruleSCHEMA_TYPE
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
    // InternalAedit.g:8300:1: rule__RemoveAnnotationFromSchema__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__RemoveAnnotationFromSchema__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8304:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8305:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8305:2: ( ( ruleQN ) )
            // InternalAedit.g:8306:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            }
            // InternalAedit.g:8307:3: ( ruleQN )
            // InternalAedit.g:8308:4: ruleQN
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
    // InternalAedit.g:8319:1: rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4 : ( ( ruleQN ) ) ;
    public final void rule__RemoveAnnotationFromSchema__AnnotationToRemoveAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8323:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8324:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8324:2: ( ( ruleQN ) )
            // InternalAedit.g:8325:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromSchemaAccess().getAnnotationToRemoveAnnotationCrossReference_4_0()); 
            }
            // InternalAedit.g:8326:3: ( ruleQN )
            // InternalAedit.g:8327:4: ruleQN
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
    // InternalAedit.g:8338:1: rule__RemoveAnnotationFromField__VariableAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__RemoveAnnotationFromField__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8342:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8343:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8343:2: ( ( ruleQN ) )
            // InternalAedit.g:8344:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromFieldAccess().getVariableFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:8345:3: ( ruleQN )
            // InternalAedit.g:8346:4: ruleQN
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
    // InternalAedit.g:8357:1: rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3 : ( ( ruleQN ) ) ;
    public final void rule__RemoveAnnotationFromField__AnnotationToRemoveAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8361:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8362:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8362:2: ( ( ruleQN ) )
            // InternalAedit.g:8363:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveAnnotationFromFieldAccess().getAnnotationToRemoveAnnotationCrossReference_3_0()); 
            }
            // InternalAedit.g:8364:3: ( ruleQN )
            // InternalAedit.g:8365:4: ruleQN
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
    // InternalAedit.g:8376:1: rule__RemoveNameAnnotationFromField__VariableAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__RemoveNameAnnotationFromField__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8380:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8381:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8381:2: ( ( ruleQN ) )
            // InternalAedit.g:8382:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getVariableFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:8383:3: ( ruleQN )
            // InternalAedit.g:8384:4: ruleQN
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
    // InternalAedit.g:8395:1: rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3 : ( ( ruleQN ) ) ;
    public final void rule__RemoveNameAnnotationFromField__AnnotationToRemoveAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8399:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8400:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8400:2: ( ( ruleQN ) )
            // InternalAedit.g:8401:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveNameAnnotationFromFieldAccess().getAnnotationToRemoveAnnotationCrossReference_3_0()); 
            }
            // InternalAedit.g:8402:3: ( ruleQN )
            // InternalAedit.g:8403:4: ruleQN
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
    // InternalAedit.g:8414:1: rule__ChangeSchema__SchemaTypeAssignment_1 : ( ( rule__ChangeSchema__SchemaTypeAlternatives_1_0 ) ) ;
    public final void rule__ChangeSchema__SchemaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8418:1: ( ( ( rule__ChangeSchema__SchemaTypeAlternatives_1_0 ) ) )
            // InternalAedit.g:8419:2: ( ( rule__ChangeSchema__SchemaTypeAlternatives_1_0 ) )
            {
            // InternalAedit.g:8419:2: ( ( rule__ChangeSchema__SchemaTypeAlternatives_1_0 ) )
            // InternalAedit.g:8420:3: ( rule__ChangeSchema__SchemaTypeAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeSchemaAccess().getSchemaTypeAlternatives_1_0()); 
            }
            // InternalAedit.g:8421:3: ( rule__ChangeSchema__SchemaTypeAlternatives_1_0 )
            // InternalAedit.g:8421:4: rule__ChangeSchema__SchemaTypeAlternatives_1_0
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
    // InternalAedit.g:8429:1: rule__ChangeSchema__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__ChangeSchema__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8433:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8434:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8434:2: ( ( ruleQN ) )
            // InternalAedit.g:8435:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            }
            // InternalAedit.g:8436:3: ( ruleQN )
            // InternalAedit.g:8437:4: ruleQN
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
    // InternalAedit.g:8448:1: rule__ChangeSchema__RulesAssignment_4 : ( ruleSchemaRule ) ;
    public final void rule__ChangeSchema__RulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8452:1: ( ( ruleSchemaRule ) )
            // InternalAedit.g:8453:2: ( ruleSchemaRule )
            {
            // InternalAedit.g:8453:2: ( ruleSchemaRule )
            // InternalAedit.g:8454:3: ruleSchemaRule
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
    // InternalAedit.g:8463:1: rule__ChangeEnum__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__ChangeEnum__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8467:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8468:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8468:2: ( ( ruleQN ) )
            // InternalAedit.g:8469:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeEnumAccess().getSchemaEnumTypeCrossReference_2_0()); 
            }
            // InternalAedit.g:8470:3: ( ruleQN )
            // InternalAedit.g:8471:4: ruleQN
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
    // InternalAedit.g:8482:1: rule__ChangeEnum__RulesAssignment_4 : ( ruleEnumRule ) ;
    public final void rule__ChangeEnum__RulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8486:1: ( ( ruleEnumRule ) )
            // InternalAedit.g:8487:2: ( ruleEnumRule )
            {
            // InternalAedit.g:8487:2: ( ruleEnumRule )
            // InternalAedit.g:8488:3: ruleEnumRule
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
    // InternalAedit.g:8497:1: rule__AddRecord__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddRecord__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8501:1: ( ( RULE_INT ) )
            // InternalAedit.g:8502:2: ( RULE_INT )
            {
            // InternalAedit.g:8502:2: ( RULE_INT )
            // InternalAedit.g:8503:3: RULE_INT
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
    // InternalAedit.g:8512:1: rule__AddRecord__NamespaceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__AddRecord__NamespaceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8516:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:8517:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:8517:2: ( ( RULE_ID ) )
            // InternalAedit.g:8518:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddRecordAccess().getNamespaceAvroIDLFileCrossReference_5_0()); 
            }
            // InternalAedit.g:8519:3: ( RULE_ID )
            // InternalAedit.g:8520:4: RULE_ID
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
    // InternalAedit.g:8531:1: rule__AddRecord__RecordNameAssignment_7 : ( RULE_ID ) ;
    public final void rule__AddRecord__RecordNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8535:1: ( ( RULE_ID ) )
            // InternalAedit.g:8536:2: ( RULE_ID )
            {
            // InternalAedit.g:8536:2: ( RULE_ID )
            // InternalAedit.g:8537:3: RULE_ID
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
    // InternalAedit.g:8546:1: rule__AddRecord__FieldsAssignment_9 : ( ruleField ) ;
    public final void rule__AddRecord__FieldsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8550:1: ( ( ruleField ) )
            // InternalAedit.g:8551:2: ( ruleField )
            {
            // InternalAedit.g:8551:2: ( ruleField )
            // InternalAedit.g:8552:3: ruleField
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
    // InternalAedit.g:8561:1: rule__AddError__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddError__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8565:1: ( ( RULE_INT ) )
            // InternalAedit.g:8566:2: ( RULE_INT )
            {
            // InternalAedit.g:8566:2: ( RULE_INT )
            // InternalAedit.g:8567:3: RULE_INT
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
    // InternalAedit.g:8576:1: rule__AddError__NamespaceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__AddError__NamespaceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8580:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:8581:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:8581:2: ( ( RULE_ID ) )
            // InternalAedit.g:8582:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddErrorAccess().getNamespaceAvroIDLFileCrossReference_5_0()); 
            }
            // InternalAedit.g:8583:3: ( RULE_ID )
            // InternalAedit.g:8584:4: RULE_ID
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
    // InternalAedit.g:8595:1: rule__AddError__ErrorNameAssignment_7 : ( RULE_ID ) ;
    public final void rule__AddError__ErrorNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8599:1: ( ( RULE_ID ) )
            // InternalAedit.g:8600:2: ( RULE_ID )
            {
            // InternalAedit.g:8600:2: ( RULE_ID )
            // InternalAedit.g:8601:3: RULE_ID
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
    // InternalAedit.g:8610:1: rule__AddError__FieldsAssignment_9 : ( ruleField ) ;
    public final void rule__AddError__FieldsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8614:1: ( ( ruleField ) )
            // InternalAedit.g:8615:2: ( ruleField )
            {
            // InternalAedit.g:8615:2: ( ruleField )
            // InternalAedit.g:8616:3: ruleField
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
    // InternalAedit.g:8625:1: rule__AddEnumeration__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddEnumeration__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8629:1: ( ( RULE_INT ) )
            // InternalAedit.g:8630:2: ( RULE_INT )
            {
            // InternalAedit.g:8630:2: ( RULE_INT )
            // InternalAedit.g:8631:3: RULE_INT
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
    // InternalAedit.g:8640:1: rule__AddEnumeration__NamespaceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__AddEnumeration__NamespaceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8644:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:8645:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:8645:2: ( ( RULE_ID ) )
            // InternalAedit.g:8646:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddEnumerationAccess().getNamespaceAvroIDLFileCrossReference_5_0()); 
            }
            // InternalAedit.g:8647:3: ( RULE_ID )
            // InternalAedit.g:8648:4: RULE_ID
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
    // InternalAedit.g:8659:1: rule__AddEnumeration__EnumNameAssignment_7 : ( RULE_ID ) ;
    public final void rule__AddEnumeration__EnumNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8663:1: ( ( RULE_ID ) )
            // InternalAedit.g:8664:2: ( RULE_ID )
            {
            // InternalAedit.g:8664:2: ( RULE_ID )
            // InternalAedit.g:8665:3: RULE_ID
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
    // InternalAedit.g:8674:1: rule__AddEnumeration__SymbolsAssignment_9 : ( RULE_ID ) ;
    public final void rule__AddEnumeration__SymbolsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8678:1: ( ( RULE_ID ) )
            // InternalAedit.g:8679:2: ( RULE_ID )
            {
            // InternalAedit.g:8679:2: ( RULE_ID )
            // InternalAedit.g:8680:3: RULE_ID
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
    // InternalAedit.g:8689:1: rule__AddEnumeration__SymbolsAssignment_10_1 : ( RULE_ID ) ;
    public final void rule__AddEnumeration__SymbolsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8693:1: ( ( RULE_ID ) )
            // InternalAedit.g:8694:2: ( RULE_ID )
            {
            // InternalAedit.g:8694:2: ( RULE_ID )
            // InternalAedit.g:8695:3: RULE_ID
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
    // InternalAedit.g:8704:1: rule__AddVariable__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddVariable__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8708:1: ( ( RULE_INT ) )
            // InternalAedit.g:8709:2: ( RULE_INT )
            {
            // InternalAedit.g:8709:2: ( RULE_INT )
            // InternalAedit.g:8710:3: RULE_INT
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
    // InternalAedit.g:8719:1: rule__AddVariable__NewVarAssignment_4 : ( ruleField ) ;
    public final void rule__AddVariable__NewVarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8723:1: ( ( ruleField ) )
            // InternalAedit.g:8724:2: ( ruleField )
            {
            // InternalAedit.g:8724:2: ( ruleField )
            // InternalAedit.g:8725:3: ruleField
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
    // InternalAedit.g:8734:1: rule__AddEnum__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddEnum__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8738:1: ( ( RULE_INT ) )
            // InternalAedit.g:8739:2: ( RULE_INT )
            {
            // InternalAedit.g:8739:2: ( RULE_INT )
            // InternalAedit.g:8740:3: RULE_INT
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
    // InternalAedit.g:8749:1: rule__AddEnum__VarNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__AddEnum__VarNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8753:1: ( ( RULE_ID ) )
            // InternalAedit.g:8754:2: ( RULE_ID )
            {
            // InternalAedit.g:8754:2: ( RULE_ID )
            // InternalAedit.g:8755:3: RULE_ID
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
    // InternalAedit.g:8764:1: rule__RemoveSchema__SchemaTypeAssignment_1 : ( ruleSCHEMA_TYPE ) ;
    public final void rule__RemoveSchema__SchemaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8768:1: ( ( ruleSCHEMA_TYPE ) )
            // InternalAedit.g:8769:2: ( ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:8769:2: ( ruleSCHEMA_TYPE )
            // InternalAedit.g:8770:3: ruleSCHEMA_TYPE
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
    // InternalAedit.g:8779:1: rule__RemoveSchema__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__RemoveSchema__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8783:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8784:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8784:2: ( ( ruleQN ) )
            // InternalAedit.g:8785:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            }
            // InternalAedit.g:8786:3: ( ruleQN )
            // InternalAedit.g:8787:4: ruleQN
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
    // InternalAedit.g:8798:1: rule__RemoveVariable__VariableAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__RemoveVariable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8802:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8803:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8803:2: ( ( ruleQN ) )
            // InternalAedit.g:8804:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveVariableAccess().getVariableFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:8805:3: ( ruleQN )
            // InternalAedit.g:8806:4: ruleQN
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
    // InternalAedit.g:8817:1: rule__RemoveEnum__VarNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RemoveEnum__VarNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8821:1: ( ( RULE_ID ) )
            // InternalAedit.g:8822:2: ( RULE_ID )
            {
            // InternalAedit.g:8822:2: ( RULE_ID )
            // InternalAedit.g:8823:3: RULE_ID
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
    // InternalAedit.g:8832:1: rule__RenameSchema__SchemaTypeAssignment_1 : ( ruleSCHEMA_TYPE ) ;
    public final void rule__RenameSchema__SchemaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8836:1: ( ( ruleSCHEMA_TYPE ) )
            // InternalAedit.g:8837:2: ( ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:8837:2: ( ruleSCHEMA_TYPE )
            // InternalAedit.g:8838:3: ruleSCHEMA_TYPE
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
    // InternalAedit.g:8847:1: rule__RenameSchema__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__RenameSchema__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8851:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8852:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8852:2: ( ( ruleQN ) )
            // InternalAedit.g:8853:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            }
            // InternalAedit.g:8854:3: ( ruleQN )
            // InternalAedit.g:8855:4: ruleQN
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
    // InternalAedit.g:8866:1: rule__RenameSchema__NewSchNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__RenameSchema__NewSchNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8870:1: ( ( RULE_ID ) )
            // InternalAedit.g:8871:2: ( RULE_ID )
            {
            // InternalAedit.g:8871:2: ( RULE_ID )
            // InternalAedit.g:8872:3: RULE_ID
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
    // InternalAedit.g:8881:1: rule__RenameVariable__VariableAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__RenameVariable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8885:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8886:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8886:2: ( ( ruleQN ) )
            // InternalAedit.g:8887:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRenameVariableAccess().getVariableFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:8888:3: ( ruleQN )
            // InternalAedit.g:8889:4: ruleQN
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
    // InternalAedit.g:8900:1: rule__RenameVariable__NewVarNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__RenameVariable__NewVarNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8904:1: ( ( RULE_ID ) )
            // InternalAedit.g:8905:2: ( RULE_ID )
            {
            // InternalAedit.g:8905:2: ( RULE_ID )
            // InternalAedit.g:8906:3: RULE_ID
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
    // InternalAedit.g:8915:1: rule__RenameEnum__OldNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RenameEnum__OldNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8919:1: ( ( RULE_ID ) )
            // InternalAedit.g:8920:2: ( RULE_ID )
            {
            // InternalAedit.g:8920:2: ( RULE_ID )
            // InternalAedit.g:8921:3: RULE_ID
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
    // InternalAedit.g:8930:1: rule__RenameEnum__NewEnumNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__RenameEnum__NewEnumNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8934:1: ( ( RULE_ID ) )
            // InternalAedit.g:8935:2: ( RULE_ID )
            {
            // InternalAedit.g:8935:2: ( RULE_ID )
            // InternalAedit.g:8936:3: RULE_ID
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
    // InternalAedit.g:8945:1: rule__ChangeDefValue__FieldAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__ChangeDefValue__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8949:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8950:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8950:2: ( ( ruleQN ) )
            // InternalAedit.g:8951:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeDefValueAccess().getFieldFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:8952:3: ( ruleQN )
            // InternalAedit.g:8953:4: ruleQN
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
    // InternalAedit.g:8964:1: rule__ChangeDefValue__NewValAssignment_3 : ( ruleValue ) ;
    public final void rule__ChangeDefValue__NewValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8968:1: ( ( ruleValue ) )
            // InternalAedit.g:8969:2: ( ruleValue )
            {
            // InternalAedit.g:8969:2: ( ruleValue )
            // InternalAedit.g:8970:3: ruleValue
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
    // InternalAedit.g:8979:1: rule__ChangeType__FieldAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__ChangeType__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:8983:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:8984:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:8984:2: ( ( ruleQN ) )
            // InternalAedit.g:8985:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChangeTypeAccess().getFieldFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:8986:3: ( ruleQN )
            // InternalAedit.g:8987:4: ruleQN
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
    // InternalAedit.g:8998:1: rule__ChangeType__NewTypeAssignment_3 : ( ruleVARIABLE_TYPE ) ;
    public final void rule__ChangeType__NewTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9002:1: ( ( ruleVARIABLE_TYPE ) )
            // InternalAedit.g:9003:2: ( ruleVARIABLE_TYPE )
            {
            // InternalAedit.g:9003:2: ( ruleVARIABLE_TYPE )
            // InternalAedit.g:9004:3: ruleVARIABLE_TYPE
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


    // $ANTLR start "rule__RemoveArrayValue__ArrayAssignment_1"
    // InternalAedit.g:9013:1: rule__RemoveArrayValue__ArrayAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RemoveArrayValue__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9017:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:9018:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:9018:2: ( ( RULE_ID ) )
            // InternalAedit.g:9019:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAccess().getArrayFieldCrossReference_1_0()); 
            }
            // InternalAedit.g:9020:3: ( RULE_ID )
            // InternalAedit.g:9021:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAccess().getArrayFieldIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAccess().getArrayFieldIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAccess().getArrayFieldCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RemoveArrayValue__ArrayAssignment_1"


    // $ANTLR start "rule__RemoveArrayValue__ValueToRemoveAssignment_3"
    // InternalAedit.g:9032:1: rule__RemoveArrayValue__ValueToRemoveAssignment_3 : ( ruleValue ) ;
    public final void rule__RemoveArrayValue__ValueToRemoveAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9036:1: ( ( ruleValue ) )
            // InternalAedit.g:9037:2: ( ruleValue )
            {
            // InternalAedit.g:9037:2: ( ruleValue )
            // InternalAedit.g:9038:3: ruleValue
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
    // InternalAedit.g:9047:1: rule__RemoveArrayValueAtIndex__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__RemoveArrayValueAtIndex__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9051:1: ( ( RULE_INT ) )
            // InternalAedit.g:9052:2: ( RULE_INT )
            {
            // InternalAedit.g:9052:2: ( RULE_INT )
            // InternalAedit.g:9053:3: RULE_INT
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
    // InternalAedit.g:9062:1: rule__RemoveArrayValueAtIndex__ArrayAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__RemoveArrayValueAtIndex__ArrayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9066:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:9067:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:9067:2: ( ( RULE_ID ) )
            // InternalAedit.g:9068:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAtIndexAccess().getArrayFieldCrossReference_4_0()); 
            }
            // InternalAedit.g:9069:3: ( RULE_ID )
            // InternalAedit.g:9070:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRemoveArrayValueAtIndexAccess().getArrayFieldIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRemoveArrayValueAtIndexAccess().getArrayFieldIDTerminalRuleCall_4_0_1()); 
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
    // InternalAedit.g:9081:1: rule__AddValueToArray__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddValueToArray__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9085:1: ( ( RULE_INT ) )
            // InternalAedit.g:9086:2: ( RULE_INT )
            {
            // InternalAedit.g:9086:2: ( RULE_INT )
            // InternalAedit.g:9087:3: RULE_INT
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
    // InternalAedit.g:9096:1: rule__AddValueToArray__ArrayAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__AddValueToArray__ArrayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9100:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:9101:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:9101:2: ( ( RULE_ID ) )
            // InternalAedit.g:9102:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getArrayFieldCrossReference_4_0()); 
            }
            // InternalAedit.g:9103:3: ( RULE_ID )
            // InternalAedit.g:9104:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddValueToArrayAccess().getArrayFieldIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddValueToArrayAccess().getArrayFieldIDTerminalRuleCall_4_0_1()); 
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


    // $ANTLR start "rule__Field__AnnotationsAssignment_0"
    // InternalAedit.g:9115:1: rule__Field__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Field__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9119:1: ( ( ruleAnnotation ) )
            // InternalAedit.g:9120:2: ( ruleAnnotation )
            {
            // InternalAedit.g:9120:2: ( ruleAnnotation )
            // InternalAedit.g:9121:3: ruleAnnotation
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
    // InternalAedit.g:9130:1: rule__Field__FieldTypeAssignment_1 : ( ( rule__Field__FieldTypeAlternatives_1_0 ) ) ;
    public final void rule__Field__FieldTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9134:1: ( ( ( rule__Field__FieldTypeAlternatives_1_0 ) ) )
            // InternalAedit.g:9135:2: ( ( rule__Field__FieldTypeAlternatives_1_0 ) )
            {
            // InternalAedit.g:9135:2: ( ( rule__Field__FieldTypeAlternatives_1_0 ) )
            // InternalAedit.g:9136:3: ( rule__Field__FieldTypeAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getFieldTypeAlternatives_1_0()); 
            }
            // InternalAedit.g:9137:3: ( rule__Field__FieldTypeAlternatives_1_0 )
            // InternalAedit.g:9137:4: rule__Field__FieldTypeAlternatives_1_0
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
    // InternalAedit.g:9145:1: rule__CustomTypeField__TypeAssignment_0 : ( ruleCustomType ) ;
    public final void rule__CustomTypeField__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9149:1: ( ( ruleCustomType ) )
            // InternalAedit.g:9150:2: ( ruleCustomType )
            {
            // InternalAedit.g:9150:2: ( ruleCustomType )
            // InternalAedit.g:9151:3: ruleCustomType
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
    // InternalAedit.g:9160:1: rule__CustomTypeField__NameAnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__CustomTypeField__NameAnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9164:1: ( ( ruleAnnotation ) )
            // InternalAedit.g:9165:2: ( ruleAnnotation )
            {
            // InternalAedit.g:9165:2: ( ruleAnnotation )
            // InternalAedit.g:9166:3: ruleAnnotation
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
    // InternalAedit.g:9175:1: rule__CustomTypeField__VarNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CustomTypeField__VarNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9179:1: ( ( RULE_ID ) )
            // InternalAedit.g:9180:2: ( RULE_ID )
            {
            // InternalAedit.g:9180:2: ( RULE_ID )
            // InternalAedit.g:9181:3: RULE_ID
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
    // InternalAedit.g:9190:1: rule__PrimitiveTypeField__TypeAssignment_0 : ( rulePrimitiveType ) ;
    public final void rule__PrimitiveTypeField__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9194:1: ( ( rulePrimitiveType ) )
            // InternalAedit.g:9195:2: ( rulePrimitiveType )
            {
            // InternalAedit.g:9195:2: ( rulePrimitiveType )
            // InternalAedit.g:9196:3: rulePrimitiveType
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
    // InternalAedit.g:9205:1: rule__PrimitiveTypeField__NameAnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__PrimitiveTypeField__NameAnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9209:1: ( ( ruleAnnotation ) )
            // InternalAedit.g:9210:2: ( ruleAnnotation )
            {
            // InternalAedit.g:9210:2: ( ruleAnnotation )
            // InternalAedit.g:9211:3: ruleAnnotation
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
    // InternalAedit.g:9220:1: rule__PrimitiveTypeField__VarNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PrimitiveTypeField__VarNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9224:1: ( ( RULE_ID ) )
            // InternalAedit.g:9225:2: ( RULE_ID )
            {
            // InternalAedit.g:9225:2: ( RULE_ID )
            // InternalAedit.g:9226:3: RULE_ID
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
    // InternalAedit.g:9235:1: rule__PrimitiveTypeField__ValueAssignment_3_1 : ( ruleValue ) ;
    public final void rule__PrimitiveTypeField__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9239:1: ( ( ruleValue ) )
            // InternalAedit.g:9240:2: ( ruleValue )
            {
            // InternalAedit.g:9240:2: ( ruleValue )
            // InternalAedit.g:9241:3: ruleValue
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
    // InternalAedit.g:9250:1: rule__ComplexTypeField__TypeAssignment_0 : ( ruleArrayTypeField ) ;
    public final void rule__ComplexTypeField__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9254:1: ( ( ruleArrayTypeField ) )
            // InternalAedit.g:9255:2: ( ruleArrayTypeField )
            {
            // InternalAedit.g:9255:2: ( ruleArrayTypeField )
            // InternalAedit.g:9256:3: ruleArrayTypeField
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
    // InternalAedit.g:9265:1: rule__ComplexTypeField__NameAnnotationsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__ComplexTypeField__NameAnnotationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9269:1: ( ( ruleAnnotation ) )
            // InternalAedit.g:9270:2: ( ruleAnnotation )
            {
            // InternalAedit.g:9270:2: ( ruleAnnotation )
            // InternalAedit.g:9271:3: ruleAnnotation
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
    // InternalAedit.g:9280:1: rule__ComplexTypeField__VarNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComplexTypeField__VarNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9284:1: ( ( RULE_ID ) )
            // InternalAedit.g:9285:2: ( RULE_ID )
            {
            // InternalAedit.g:9285:2: ( RULE_ID )
            // InternalAedit.g:9286:3: RULE_ID
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
    // InternalAedit.g:9295:1: rule__ComplexTypeField__ValueAssignment_3_1 : ( ruleArray ) ;
    public final void rule__ComplexTypeField__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9299:1: ( ( ruleArray ) )
            // InternalAedit.g:9300:2: ( ruleArray )
            {
            // InternalAedit.g:9300:2: ( ruleArray )
            // InternalAedit.g:9301:3: ruleArray
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
    // InternalAedit.g:9310:1: rule__ArrayTypeField__TypeAssignment_2 : ( ruleAnnotatedTypes ) ;
    public final void rule__ArrayTypeField__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9314:1: ( ( ruleAnnotatedTypes ) )
            // InternalAedit.g:9315:2: ( ruleAnnotatedTypes )
            {
            // InternalAedit.g:9315:2: ( ruleAnnotatedTypes )
            // InternalAedit.g:9316:3: ruleAnnotatedTypes
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
    // InternalAedit.g:9325:1: rule__AnnotatedTypes__AnnotataionsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__AnnotatedTypes__AnnotataionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9329:1: ( ( ruleAnnotation ) )
            // InternalAedit.g:9330:2: ( ruleAnnotation )
            {
            // InternalAedit.g:9330:2: ( ruleAnnotation )
            // InternalAedit.g:9331:3: ruleAnnotation
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
    // InternalAedit.g:9340:1: rule__AnnotatedTypes__TypeAssignment_1 : ( ruleTypes ) ;
    public final void rule__AnnotatedTypes__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9344:1: ( ( ruleTypes ) )
            // InternalAedit.g:9345:2: ( ruleTypes )
            {
            // InternalAedit.g:9345:2: ( ruleTypes )
            // InternalAedit.g:9346:3: ruleTypes
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
    // InternalAedit.g:9355:1: rule__CustomType__TargetAssignment : ( ( ruleQN ) ) ;
    public final void rule__CustomType__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9359:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:9360:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:9360:2: ( ( ruleQN ) )
            // InternalAedit.g:9361:3: ( ruleQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCustomTypeAccess().getTargetTypeCrossReference_0()); 
            }
            // InternalAedit.g:9362:3: ( ruleQN )
            // InternalAedit.g:9363:4: ruleQN
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
    // InternalAedit.g:9374:1: rule__PrimitiveType__TargetAssignment : ( ruleVARIABLE_TYPE ) ;
    public final void rule__PrimitiveType__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9378:1: ( ( ruleVARIABLE_TYPE ) )
            // InternalAedit.g:9379:2: ( ruleVARIABLE_TYPE )
            {
            // InternalAedit.g:9379:2: ( ruleVARIABLE_TYPE )
            // InternalAedit.g:9380:3: ruleVARIABLE_TYPE
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
    // InternalAedit.g:9389:1: rule__Annotation__NameAssignment_0 : ( ruleAN ) ;
    public final void rule__Annotation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9393:1: ( ( ruleAN ) )
            // InternalAedit.g:9394:2: ( ruleAN )
            {
            // InternalAedit.g:9394:2: ( ruleAN )
            // InternalAedit.g:9395:3: ruleAN
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
    // InternalAedit.g:9404:1: rule__Annotation__ValuesAssignment_1_1 : ( ruleValues ) ;
    public final void rule__Annotation__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9408:1: ( ( ruleValues ) )
            // InternalAedit.g:9409:2: ( ruleValues )
            {
            // InternalAedit.g:9409:2: ( ruleValues )
            // InternalAedit.g:9410:3: ruleValues
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
    // InternalAedit.g:9419:1: rule__Values__ValueAssignment_1_0 : ( ruleArray ) ;
    public final void rule__Values__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9423:1: ( ( ruleArray ) )
            // InternalAedit.g:9424:2: ( ruleArray )
            {
            // InternalAedit.g:9424:2: ( ruleArray )
            // InternalAedit.g:9425:3: ruleArray
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
    // InternalAedit.g:9434:1: rule__Values__ValueAssignment_1_1_0 : ( ruleValue ) ;
    public final void rule__Values__ValueAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9438:1: ( ( ruleValue ) )
            // InternalAedit.g:9439:2: ( ruleValue )
            {
            // InternalAedit.g:9439:2: ( ruleValue )
            // InternalAedit.g:9440:3: ruleValue
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
    // InternalAedit.g:9449:1: rule__Values__ValueAssignment_1_1_1_1 : ( ruleValue ) ;
    public final void rule__Values__ValueAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9453:1: ( ( ruleValue ) )
            // InternalAedit.g:9454:2: ( ruleValue )
            {
            // InternalAedit.g:9454:2: ( ruleValue )
            // InternalAedit.g:9455:3: ruleValue
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
    // InternalAedit.g:9464:1: rule__Array__ValuesAssignment_1 : ( ruleValues ) ;
    public final void rule__Array__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9468:1: ( ( ruleValues ) )
            // InternalAedit.g:9469:2: ( ruleValues )
            {
            // InternalAedit.g:9469:2: ( ruleValues )
            // InternalAedit.g:9470:3: ruleValues
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
    // InternalAedit.g:9479:1: rule__FloatValue__ValAssignment : ( ruleReal ) ;
    public final void rule__FloatValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9483:1: ( ( ruleReal ) )
            // InternalAedit.g:9484:2: ( ruleReal )
            {
            // InternalAedit.g:9484:2: ( ruleReal )
            // InternalAedit.g:9485:3: ruleReal
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
    // InternalAedit.g:9494:1: rule__StringValue__ValAssignment : ( RULE_ID ) ;
    public final void rule__StringValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9498:1: ( ( RULE_ID ) )
            // InternalAedit.g:9499:2: ( RULE_ID )
            {
            // InternalAedit.g:9499:2: ( RULE_ID )
            // InternalAedit.g:9500:3: RULE_ID
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
    // InternalAedit.g:9509:1: rule__IntValue__ValAssignment : ( ( rule__IntValue__ValAlternatives_0 ) ) ;
    public final void rule__IntValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9513:1: ( ( ( rule__IntValue__ValAlternatives_0 ) ) )
            // InternalAedit.g:9514:2: ( ( rule__IntValue__ValAlternatives_0 ) )
            {
            // InternalAedit.g:9514:2: ( ( rule__IntValue__ValAlternatives_0 ) )
            // InternalAedit.g:9515:3: ( rule__IntValue__ValAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValAlternatives_0()); 
            }
            // InternalAedit.g:9516:3: ( rule__IntValue__ValAlternatives_0 )
            // InternalAedit.g:9516:4: rule__IntValue__ValAlternatives_0
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
    // InternalAedit.g:9524:1: rule__Null__ValAssignment : ( ( 'null' ) ) ;
    public final void rule__Null__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9528:1: ( ( ( 'null' ) ) )
            // InternalAedit.g:9529:2: ( ( 'null' ) )
            {
            // InternalAedit.g:9529:2: ( ( 'null' ) )
            // InternalAedit.g:9530:3: ( 'null' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            }
            // InternalAedit.g:9531:3: ( 'null' )
            // InternalAedit.g:9532:4: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
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
    // InternalAedit.g:9543:1: rule__BooleanValue__ValAssignment : ( ruleBoolean ) ;
    public final void rule__BooleanValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:9547:1: ( ( ruleBoolean ) )
            // InternalAedit.g:9548:2: ( ruleBoolean )
            {
            // InternalAedit.g:9548:2: ( ruleBoolean )
            // InternalAedit.g:9549:3: ruleBoolean
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


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\36\1\5\1\uffff\1\45\7\uffff\1\33\1\4\1\uffff\1\46\1\5\1\uffff\1\5";
    static final String dfa_3s = "\1\55\1\5\1\uffff\1\45\7\uffff\1\47\1\4\1\uffff\1\46\1\65\1\uffff\1\65";
    static final String dfa_4s = "\2\uffff\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff\1\1\2\uffff\1\3\1\uffff";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\1\uffff\1\7\1\10\1\11\1\uffff\1\3\4\uffff\1\1\1\2\1\4\1\5\1\12",
            "\1\13",
            "",
            "\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\3\uffff\1\12\7\uffff\1\15",
            "\1\16",
            "",
            "\1\17",
            "\1\21\12\uffff\6\20\31\uffff\1\20\5\uffff\1\20",
            "",
            "\1\20\25\uffff\1\12\13\uffff\1\20\15\uffff\1\20"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1579:1: rule__SchemaRule__Alternatives : ( ( ruleRemoveVariable ) | ( ruleRenameVariable ) | ( ruleAddVariable ) | ( ruleChangeDefValue ) | ( ruleChangeType ) | ( ruleAddAnnotationToField ) | ( ruleAddNameAnnotationToField ) | ( ruleRemoveAnnotationFromField ) | ( ruleRemoveNameAnnotationFromField ) | ( ruleArrayEditRules ) );";
        }
    }
 

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
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00003E1741000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00003E1740000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000061001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000061000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00208000013F0020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00208000003F0022L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010001000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00208000003F0020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0050000000006030L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000003F0000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0054000000006030L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0054000000006032L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000000000002L});

}