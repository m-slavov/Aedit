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

@SuppressWarnings("all")
public class InternalAeditParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'record'", "'error'", "'true'", "'false'", "'enum'", "'int'", "'double'", "'string'", "'long'", "'boolean'", "'float'", "'feature'", "'{'", "'}'", "':'", "'use'", "';'", "'ruleset'", "'rule'", "'change'", "'add.at'", "'('", "')'", "'.'", "','", "'remove'", "'rename'", "'=>'", "'set_val'", "'set_type'", "'='", "'-'", "'null'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    // InternalAedit.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAedit.g:54:1: ( ruleModel EOF )
            // InternalAedit.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalAedit.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalAedit.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalAedit.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalAedit.g:69:3: ( rule__Model__Group__0 )
            // InternalAedit.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:78:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalAedit.g:79:1: ( ruleFeature EOF )
            // InternalAedit.g:80:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:87:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:91:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalAedit.g:92:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalAedit.g:92:2: ( ( rule__Feature__Group__0 ) )
            // InternalAedit.g:93:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalAedit.g:94:3: ( rule__Feature__Group__0 )
            // InternalAedit.g:94:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:103:1: entryRuleFeatureMap : ruleFeatureMap EOF ;
    public final void entryRuleFeatureMap() throws RecognitionException {
        try {
            // InternalAedit.g:104:1: ( ruleFeatureMap EOF )
            // InternalAedit.g:105:1: ruleFeatureMap EOF
            {
             before(grammarAccess.getFeatureMapRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureMap();

            state._fsp--;

             after(grammarAccess.getFeatureMapRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:112:1: ruleFeatureMap : ( ( rule__FeatureMap__Group__0 ) ) ;
    public final void ruleFeatureMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:116:2: ( ( ( rule__FeatureMap__Group__0 ) ) )
            // InternalAedit.g:117:2: ( ( rule__FeatureMap__Group__0 ) )
            {
            // InternalAedit.g:117:2: ( ( rule__FeatureMap__Group__0 ) )
            // InternalAedit.g:118:3: ( rule__FeatureMap__Group__0 )
            {
             before(grammarAccess.getFeatureMapAccess().getGroup()); 
            // InternalAedit.g:119:3: ( rule__FeatureMap__Group__0 )
            // InternalAedit.g:119:4: rule__FeatureMap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureMap__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:128:1: entryRuleRuleMap : ruleRuleMap EOF ;
    public final void entryRuleRuleMap() throws RecognitionException {
        try {
            // InternalAedit.g:129:1: ( ruleRuleMap EOF )
            // InternalAedit.g:130:1: ruleRuleMap EOF
            {
             before(grammarAccess.getRuleMapRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleMap();

            state._fsp--;

             after(grammarAccess.getRuleMapRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:137:1: ruleRuleMap : ( ( rule__RuleMap__Group__0 ) ) ;
    public final void ruleRuleMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:141:2: ( ( ( rule__RuleMap__Group__0 ) ) )
            // InternalAedit.g:142:2: ( ( rule__RuleMap__Group__0 ) )
            {
            // InternalAedit.g:142:2: ( ( rule__RuleMap__Group__0 ) )
            // InternalAedit.g:143:3: ( rule__RuleMap__Group__0 )
            {
             before(grammarAccess.getRuleMapAccess().getGroup()); 
            // InternalAedit.g:144:3: ( rule__RuleMap__Group__0 )
            // InternalAedit.g:144:4: rule__RuleMap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleMap__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleMapAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:153:1: entryRuleRuleDeclaration : ruleRuleDeclaration EOF ;
    public final void entryRuleRuleDeclaration() throws RecognitionException {
        try {
            // InternalAedit.g:154:1: ( ruleRuleDeclaration EOF )
            // InternalAedit.g:155:1: ruleRuleDeclaration EOF
            {
             before(grammarAccess.getRuleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleDeclaration();

            state._fsp--;

             after(grammarAccess.getRuleDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:162:1: ruleRuleDeclaration : ( ( rule__RuleDeclaration__Group__0 ) ) ;
    public final void ruleRuleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:166:2: ( ( ( rule__RuleDeclaration__Group__0 ) ) )
            // InternalAedit.g:167:2: ( ( rule__RuleDeclaration__Group__0 ) )
            {
            // InternalAedit.g:167:2: ( ( rule__RuleDeclaration__Group__0 ) )
            // InternalAedit.g:168:3: ( rule__RuleDeclaration__Group__0 )
            {
             before(grammarAccess.getRuleDeclarationAccess().getGroup()); 
            // InternalAedit.g:169:3: ( rule__RuleDeclaration__Group__0 )
            // InternalAedit.g:169:4: rule__RuleDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleDeclarationAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:178:1: entryRuleGenericRule : ruleGenericRule EOF ;
    public final void entryRuleGenericRule() throws RecognitionException {
        try {
            // InternalAedit.g:179:1: ( ruleGenericRule EOF )
            // InternalAedit.g:180:1: ruleGenericRule EOF
            {
             before(grammarAccess.getGenericRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleGenericRule();

            state._fsp--;

             after(grammarAccess.getGenericRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:187:1: ruleGenericRule : ( ( rule__GenericRule__Alternatives ) ) ;
    public final void ruleGenericRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:191:2: ( ( ( rule__GenericRule__Alternatives ) ) )
            // InternalAedit.g:192:2: ( ( rule__GenericRule__Alternatives ) )
            {
            // InternalAedit.g:192:2: ( ( rule__GenericRule__Alternatives ) )
            // InternalAedit.g:193:3: ( rule__GenericRule__Alternatives )
            {
             before(grammarAccess.getGenericRuleAccess().getAlternatives()); 
            // InternalAedit.g:194:3: ( rule__GenericRule__Alternatives )
            // InternalAedit.g:194:4: rule__GenericRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GenericRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGenericRuleAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalAedit.g:203:1: entryRuleSchemaRule : ruleSchemaRule EOF ;
    public final void entryRuleSchemaRule() throws RecognitionException {
        try {
            // InternalAedit.g:204:1: ( ruleSchemaRule EOF )
            // InternalAedit.g:205:1: ruleSchemaRule EOF
            {
             before(grammarAccess.getSchemaRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSchemaRule();

            state._fsp--;

             after(grammarAccess.getSchemaRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:212:1: ruleSchemaRule : ( ( rule__SchemaRule__Alternatives ) ) ;
    public final void ruleSchemaRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:216:2: ( ( ( rule__SchemaRule__Alternatives ) ) )
            // InternalAedit.g:217:2: ( ( rule__SchemaRule__Alternatives ) )
            {
            // InternalAedit.g:217:2: ( ( rule__SchemaRule__Alternatives ) )
            // InternalAedit.g:218:3: ( rule__SchemaRule__Alternatives )
            {
             before(grammarAccess.getSchemaRuleAccess().getAlternatives()); 
            // InternalAedit.g:219:3: ( rule__SchemaRule__Alternatives )
            // InternalAedit.g:219:4: rule__SchemaRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SchemaRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSchemaRuleAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEnumRule"
    // InternalAedit.g:228:1: entryRuleEnumRule : ruleEnumRule EOF ;
    public final void entryRuleEnumRule() throws RecognitionException {
        try {
            // InternalAedit.g:229:1: ( ruleEnumRule EOF )
            // InternalAedit.g:230:1: ruleEnumRule EOF
            {
             before(grammarAccess.getEnumRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumRule();

            state._fsp--;

             after(grammarAccess.getEnumRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:237:1: ruleEnumRule : ( ( rule__EnumRule__Alternatives ) ) ;
    public final void ruleEnumRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:241:2: ( ( ( rule__EnumRule__Alternatives ) ) )
            // InternalAedit.g:242:2: ( ( rule__EnumRule__Alternatives ) )
            {
            // InternalAedit.g:242:2: ( ( rule__EnumRule__Alternatives ) )
            // InternalAedit.g:243:3: ( rule__EnumRule__Alternatives )
            {
             before(grammarAccess.getEnumRuleAccess().getAlternatives()); 
            // InternalAedit.g:244:3: ( rule__EnumRule__Alternatives )
            // InternalAedit.g:244:4: rule__EnumRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EnumRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnumRuleAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleChangeSchema"
    // InternalAedit.g:253:1: entryRuleChangeSchema : ruleChangeSchema EOF ;
    public final void entryRuleChangeSchema() throws RecognitionException {
        try {
            // InternalAedit.g:254:1: ( ruleChangeSchema EOF )
            // InternalAedit.g:255:1: ruleChangeSchema EOF
            {
             before(grammarAccess.getChangeSchemaRule()); 
            pushFollow(FOLLOW_1);
            ruleChangeSchema();

            state._fsp--;

             after(grammarAccess.getChangeSchemaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:262:1: ruleChangeSchema : ( ( rule__ChangeSchema__Group__0 ) ) ;
    public final void ruleChangeSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:266:2: ( ( ( rule__ChangeSchema__Group__0 ) ) )
            // InternalAedit.g:267:2: ( ( rule__ChangeSchema__Group__0 ) )
            {
            // InternalAedit.g:267:2: ( ( rule__ChangeSchema__Group__0 ) )
            // InternalAedit.g:268:3: ( rule__ChangeSchema__Group__0 )
            {
             before(grammarAccess.getChangeSchemaAccess().getGroup()); 
            // InternalAedit.g:269:3: ( rule__ChangeSchema__Group__0 )
            // InternalAedit.g:269:4: rule__ChangeSchema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeSchema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangeSchemaAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:278:1: entryRuleChangeEnum : ruleChangeEnum EOF ;
    public final void entryRuleChangeEnum() throws RecognitionException {
        try {
            // InternalAedit.g:279:1: ( ruleChangeEnum EOF )
            // InternalAedit.g:280:1: ruleChangeEnum EOF
            {
             before(grammarAccess.getChangeEnumRule()); 
            pushFollow(FOLLOW_1);
            ruleChangeEnum();

            state._fsp--;

             after(grammarAccess.getChangeEnumRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:287:1: ruleChangeEnum : ( ( rule__ChangeEnum__Group__0 ) ) ;
    public final void ruleChangeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:291:2: ( ( ( rule__ChangeEnum__Group__0 ) ) )
            // InternalAedit.g:292:2: ( ( rule__ChangeEnum__Group__0 ) )
            {
            // InternalAedit.g:292:2: ( ( rule__ChangeEnum__Group__0 ) )
            // InternalAedit.g:293:3: ( rule__ChangeEnum__Group__0 )
            {
             before(grammarAccess.getChangeEnumAccess().getGroup()); 
            // InternalAedit.g:294:3: ( rule__ChangeEnum__Group__0 )
            // InternalAedit.g:294:4: rule__ChangeEnum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeEnum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangeEnumAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:303:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalAedit.g:304:1: ( ruleAdd EOF )
            // InternalAedit.g:305:1: ruleAdd EOF
            {
             before(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getAddRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:312:1: ruleAdd : ( ( rule__Add__Alternatives ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:316:2: ( ( ( rule__Add__Alternatives ) ) )
            // InternalAedit.g:317:2: ( ( rule__Add__Alternatives ) )
            {
            // InternalAedit.g:317:2: ( ( rule__Add__Alternatives ) )
            // InternalAedit.g:318:3: ( rule__Add__Alternatives )
            {
             before(grammarAccess.getAddAccess().getAlternatives()); 
            // InternalAedit.g:319:3: ( rule__Add__Alternatives )
            // InternalAedit.g:319:4: rule__Add__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Add__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalAedit.g:328:1: entryRuleAddRecord : ruleAddRecord EOF ;
    public final void entryRuleAddRecord() throws RecognitionException {
        try {
            // InternalAedit.g:329:1: ( ruleAddRecord EOF )
            // InternalAedit.g:330:1: ruleAddRecord EOF
            {
             before(grammarAccess.getAddRecordRule()); 
            pushFollow(FOLLOW_1);
            ruleAddRecord();

            state._fsp--;

             after(grammarAccess.getAddRecordRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:337:1: ruleAddRecord : ( ( rule__AddRecord__Group__0 ) ) ;
    public final void ruleAddRecord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:341:2: ( ( ( rule__AddRecord__Group__0 ) ) )
            // InternalAedit.g:342:2: ( ( rule__AddRecord__Group__0 ) )
            {
            // InternalAedit.g:342:2: ( ( rule__AddRecord__Group__0 ) )
            // InternalAedit.g:343:3: ( rule__AddRecord__Group__0 )
            {
             before(grammarAccess.getAddRecordAccess().getGroup()); 
            // InternalAedit.g:344:3: ( rule__AddRecord__Group__0 )
            // InternalAedit.g:344:4: rule__AddRecord__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddRecordAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleAddEnumeration"
    // InternalAedit.g:353:1: entryRuleAddEnumeration : ruleAddEnumeration EOF ;
    public final void entryRuleAddEnumeration() throws RecognitionException {
        try {
            // InternalAedit.g:354:1: ( ruleAddEnumeration EOF )
            // InternalAedit.g:355:1: ruleAddEnumeration EOF
            {
             before(grammarAccess.getAddEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleAddEnumeration();

            state._fsp--;

             after(grammarAccess.getAddEnumerationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:362:1: ruleAddEnumeration : ( ( rule__AddEnumeration__Group__0 ) ) ;
    public final void ruleAddEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:366:2: ( ( ( rule__AddEnumeration__Group__0 ) ) )
            // InternalAedit.g:367:2: ( ( rule__AddEnumeration__Group__0 ) )
            {
            // InternalAedit.g:367:2: ( ( rule__AddEnumeration__Group__0 ) )
            // InternalAedit.g:368:3: ( rule__AddEnumeration__Group__0 )
            {
             before(grammarAccess.getAddEnumerationAccess().getGroup()); 
            // InternalAedit.g:369:3: ( rule__AddEnumeration__Group__0 )
            // InternalAedit.g:369:4: rule__AddEnumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddEnumerationAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:378:1: entryRuleAddVariable : ruleAddVariable EOF ;
    public final void entryRuleAddVariable() throws RecognitionException {
        try {
            // InternalAedit.g:379:1: ( ruleAddVariable EOF )
            // InternalAedit.g:380:1: ruleAddVariable EOF
            {
             before(grammarAccess.getAddVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleAddVariable();

            state._fsp--;

             after(grammarAccess.getAddVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:387:1: ruleAddVariable : ( ( rule__AddVariable__Group__0 ) ) ;
    public final void ruleAddVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:391:2: ( ( ( rule__AddVariable__Group__0 ) ) )
            // InternalAedit.g:392:2: ( ( rule__AddVariable__Group__0 ) )
            {
            // InternalAedit.g:392:2: ( ( rule__AddVariable__Group__0 ) )
            // InternalAedit.g:393:3: ( rule__AddVariable__Group__0 )
            {
             before(grammarAccess.getAddVariableAccess().getGroup()); 
            // InternalAedit.g:394:3: ( rule__AddVariable__Group__0 )
            // InternalAedit.g:394:4: rule__AddVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddVariableAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:403:1: entryRuleAddEnum : ruleAddEnum EOF ;
    public final void entryRuleAddEnum() throws RecognitionException {
        try {
            // InternalAedit.g:404:1: ( ruleAddEnum EOF )
            // InternalAedit.g:405:1: ruleAddEnum EOF
            {
             before(grammarAccess.getAddEnumRule()); 
            pushFollow(FOLLOW_1);
            ruleAddEnum();

            state._fsp--;

             after(grammarAccess.getAddEnumRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:412:1: ruleAddEnum : ( ( rule__AddEnum__Group__0 ) ) ;
    public final void ruleAddEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:416:2: ( ( ( rule__AddEnum__Group__0 ) ) )
            // InternalAedit.g:417:2: ( ( rule__AddEnum__Group__0 ) )
            {
            // InternalAedit.g:417:2: ( ( rule__AddEnum__Group__0 ) )
            // InternalAedit.g:418:3: ( rule__AddEnum__Group__0 )
            {
             before(grammarAccess.getAddEnumAccess().getGroup()); 
            // InternalAedit.g:419:3: ( rule__AddEnum__Group__0 )
            // InternalAedit.g:419:4: rule__AddEnum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddEnum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddEnumAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:428:1: entryRuleRemoveSchema : ruleRemoveSchema EOF ;
    public final void entryRuleRemoveSchema() throws RecognitionException {
        try {
            // InternalAedit.g:429:1: ( ruleRemoveSchema EOF )
            // InternalAedit.g:430:1: ruleRemoveSchema EOF
            {
             before(grammarAccess.getRemoveSchemaRule()); 
            pushFollow(FOLLOW_1);
            ruleRemoveSchema();

            state._fsp--;

             after(grammarAccess.getRemoveSchemaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:437:1: ruleRemoveSchema : ( ( rule__RemoveSchema__Group__0 ) ) ;
    public final void ruleRemoveSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:441:2: ( ( ( rule__RemoveSchema__Group__0 ) ) )
            // InternalAedit.g:442:2: ( ( rule__RemoveSchema__Group__0 ) )
            {
            // InternalAedit.g:442:2: ( ( rule__RemoveSchema__Group__0 ) )
            // InternalAedit.g:443:3: ( rule__RemoveSchema__Group__0 )
            {
             before(grammarAccess.getRemoveSchemaAccess().getGroup()); 
            // InternalAedit.g:444:3: ( rule__RemoveSchema__Group__0 )
            // InternalAedit.g:444:4: rule__RemoveSchema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RemoveSchema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRemoveSchemaAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:453:1: entryRuleRemoveVariable : ruleRemoveVariable EOF ;
    public final void entryRuleRemoveVariable() throws RecognitionException {
        try {
            // InternalAedit.g:454:1: ( ruleRemoveVariable EOF )
            // InternalAedit.g:455:1: ruleRemoveVariable EOF
            {
             before(grammarAccess.getRemoveVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleRemoveVariable();

            state._fsp--;

             after(grammarAccess.getRemoveVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:462:1: ruleRemoveVariable : ( ( rule__RemoveVariable__Group__0 ) ) ;
    public final void ruleRemoveVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:466:2: ( ( ( rule__RemoveVariable__Group__0 ) ) )
            // InternalAedit.g:467:2: ( ( rule__RemoveVariable__Group__0 ) )
            {
            // InternalAedit.g:467:2: ( ( rule__RemoveVariable__Group__0 ) )
            // InternalAedit.g:468:3: ( rule__RemoveVariable__Group__0 )
            {
             before(grammarAccess.getRemoveVariableAccess().getGroup()); 
            // InternalAedit.g:469:3: ( rule__RemoveVariable__Group__0 )
            // InternalAedit.g:469:4: rule__RemoveVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RemoveVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRemoveVariableAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:478:1: entryRuleRemoveEnum : ruleRemoveEnum EOF ;
    public final void entryRuleRemoveEnum() throws RecognitionException {
        try {
            // InternalAedit.g:479:1: ( ruleRemoveEnum EOF )
            // InternalAedit.g:480:1: ruleRemoveEnum EOF
            {
             before(grammarAccess.getRemoveEnumRule()); 
            pushFollow(FOLLOW_1);
            ruleRemoveEnum();

            state._fsp--;

             after(grammarAccess.getRemoveEnumRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:487:1: ruleRemoveEnum : ( ( rule__RemoveEnum__Group__0 ) ) ;
    public final void ruleRemoveEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:491:2: ( ( ( rule__RemoveEnum__Group__0 ) ) )
            // InternalAedit.g:492:2: ( ( rule__RemoveEnum__Group__0 ) )
            {
            // InternalAedit.g:492:2: ( ( rule__RemoveEnum__Group__0 ) )
            // InternalAedit.g:493:3: ( rule__RemoveEnum__Group__0 )
            {
             before(grammarAccess.getRemoveEnumAccess().getGroup()); 
            // InternalAedit.g:494:3: ( rule__RemoveEnum__Group__0 )
            // InternalAedit.g:494:4: rule__RemoveEnum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RemoveEnum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRemoveEnumAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:503:1: entryRuleRenameSchema : ruleRenameSchema EOF ;
    public final void entryRuleRenameSchema() throws RecognitionException {
        try {
            // InternalAedit.g:504:1: ( ruleRenameSchema EOF )
            // InternalAedit.g:505:1: ruleRenameSchema EOF
            {
             before(grammarAccess.getRenameSchemaRule()); 
            pushFollow(FOLLOW_1);
            ruleRenameSchema();

            state._fsp--;

             after(grammarAccess.getRenameSchemaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:512:1: ruleRenameSchema : ( ( rule__RenameSchema__Group__0 ) ) ;
    public final void ruleRenameSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:516:2: ( ( ( rule__RenameSchema__Group__0 ) ) )
            // InternalAedit.g:517:2: ( ( rule__RenameSchema__Group__0 ) )
            {
            // InternalAedit.g:517:2: ( ( rule__RenameSchema__Group__0 ) )
            // InternalAedit.g:518:3: ( rule__RenameSchema__Group__0 )
            {
             before(grammarAccess.getRenameSchemaAccess().getGroup()); 
            // InternalAedit.g:519:3: ( rule__RenameSchema__Group__0 )
            // InternalAedit.g:519:4: rule__RenameSchema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenameSchema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameSchemaAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:528:1: entryRuleRenameVariable : ruleRenameVariable EOF ;
    public final void entryRuleRenameVariable() throws RecognitionException {
        try {
            // InternalAedit.g:529:1: ( ruleRenameVariable EOF )
            // InternalAedit.g:530:1: ruleRenameVariable EOF
            {
             before(grammarAccess.getRenameVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleRenameVariable();

            state._fsp--;

             after(grammarAccess.getRenameVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:537:1: ruleRenameVariable : ( ( rule__RenameVariable__Group__0 ) ) ;
    public final void ruleRenameVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:541:2: ( ( ( rule__RenameVariable__Group__0 ) ) )
            // InternalAedit.g:542:2: ( ( rule__RenameVariable__Group__0 ) )
            {
            // InternalAedit.g:542:2: ( ( rule__RenameVariable__Group__0 ) )
            // InternalAedit.g:543:3: ( rule__RenameVariable__Group__0 )
            {
             before(grammarAccess.getRenameVariableAccess().getGroup()); 
            // InternalAedit.g:544:3: ( rule__RenameVariable__Group__0 )
            // InternalAedit.g:544:4: rule__RenameVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenameVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameVariableAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:553:1: entryRuleRenameEnum : ruleRenameEnum EOF ;
    public final void entryRuleRenameEnum() throws RecognitionException {
        try {
            // InternalAedit.g:554:1: ( ruleRenameEnum EOF )
            // InternalAedit.g:555:1: ruleRenameEnum EOF
            {
             before(grammarAccess.getRenameEnumRule()); 
            pushFollow(FOLLOW_1);
            ruleRenameEnum();

            state._fsp--;

             after(grammarAccess.getRenameEnumRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:562:1: ruleRenameEnum : ( ( rule__RenameEnum__Group__0 ) ) ;
    public final void ruleRenameEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:566:2: ( ( ( rule__RenameEnum__Group__0 ) ) )
            // InternalAedit.g:567:2: ( ( rule__RenameEnum__Group__0 ) )
            {
            // InternalAedit.g:567:2: ( ( rule__RenameEnum__Group__0 ) )
            // InternalAedit.g:568:3: ( rule__RenameEnum__Group__0 )
            {
             before(grammarAccess.getRenameEnumAccess().getGroup()); 
            // InternalAedit.g:569:3: ( rule__RenameEnum__Group__0 )
            // InternalAedit.g:569:4: rule__RenameEnum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RenameEnum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameEnumAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:578:1: entryRuleChangeDefValue : ruleChangeDefValue EOF ;
    public final void entryRuleChangeDefValue() throws RecognitionException {
        try {
            // InternalAedit.g:579:1: ( ruleChangeDefValue EOF )
            // InternalAedit.g:580:1: ruleChangeDefValue EOF
            {
             before(grammarAccess.getChangeDefValueRule()); 
            pushFollow(FOLLOW_1);
            ruleChangeDefValue();

            state._fsp--;

             after(grammarAccess.getChangeDefValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:587:1: ruleChangeDefValue : ( ( rule__ChangeDefValue__Group__0 ) ) ;
    public final void ruleChangeDefValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:591:2: ( ( ( rule__ChangeDefValue__Group__0 ) ) )
            // InternalAedit.g:592:2: ( ( rule__ChangeDefValue__Group__0 ) )
            {
            // InternalAedit.g:592:2: ( ( rule__ChangeDefValue__Group__0 ) )
            // InternalAedit.g:593:3: ( rule__ChangeDefValue__Group__0 )
            {
             before(grammarAccess.getChangeDefValueAccess().getGroup()); 
            // InternalAedit.g:594:3: ( rule__ChangeDefValue__Group__0 )
            // InternalAedit.g:594:4: rule__ChangeDefValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeDefValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangeDefValueAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:603:1: entryRuleChangeType : ruleChangeType EOF ;
    public final void entryRuleChangeType() throws RecognitionException {
        try {
            // InternalAedit.g:604:1: ( ruleChangeType EOF )
            // InternalAedit.g:605:1: ruleChangeType EOF
            {
             before(grammarAccess.getChangeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleChangeType();

            state._fsp--;

             after(grammarAccess.getChangeTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:612:1: ruleChangeType : ( ( rule__ChangeType__Group__0 ) ) ;
    public final void ruleChangeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:616:2: ( ( ( rule__ChangeType__Group__0 ) ) )
            // InternalAedit.g:617:2: ( ( rule__ChangeType__Group__0 ) )
            {
            // InternalAedit.g:617:2: ( ( rule__ChangeType__Group__0 ) )
            // InternalAedit.g:618:3: ( rule__ChangeType__Group__0 )
            {
             before(grammarAccess.getChangeTypeAccess().getGroup()); 
            // InternalAedit.g:619:3: ( rule__ChangeType__Group__0 )
            // InternalAedit.g:619:4: rule__ChangeType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangeTypeAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleField"
    // InternalAedit.g:628:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalAedit.g:629:1: ( ruleField EOF )
            // InternalAedit.g:630:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:637:1: ruleField : ( ( rule__Field__Alternatives ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:641:2: ( ( ( rule__Field__Alternatives ) ) )
            // InternalAedit.g:642:2: ( ( rule__Field__Alternatives ) )
            {
            // InternalAedit.g:642:2: ( ( rule__Field__Alternatives ) )
            // InternalAedit.g:643:3: ( rule__Field__Alternatives )
            {
             before(grammarAccess.getFieldAccess().getAlternatives()); 
            // InternalAedit.g:644:3: ( rule__Field__Alternatives )
            // InternalAedit.g:644:4: rule__Field__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Field__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalAedit.g:653:1: entryRuleCustomTypeField : ruleCustomTypeField EOF ;
    public final void entryRuleCustomTypeField() throws RecognitionException {
        try {
            // InternalAedit.g:654:1: ( ruleCustomTypeField EOF )
            // InternalAedit.g:655:1: ruleCustomTypeField EOF
            {
             before(grammarAccess.getCustomTypeFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomTypeField();

            state._fsp--;

             after(grammarAccess.getCustomTypeFieldRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:662:1: ruleCustomTypeField : ( ( rule__CustomTypeField__Group__0 ) ) ;
    public final void ruleCustomTypeField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:666:2: ( ( ( rule__CustomTypeField__Group__0 ) ) )
            // InternalAedit.g:667:2: ( ( rule__CustomTypeField__Group__0 ) )
            {
            // InternalAedit.g:667:2: ( ( rule__CustomTypeField__Group__0 ) )
            // InternalAedit.g:668:3: ( rule__CustomTypeField__Group__0 )
            {
             before(grammarAccess.getCustomTypeFieldAccess().getGroup()); 
            // InternalAedit.g:669:3: ( rule__CustomTypeField__Group__0 )
            // InternalAedit.g:669:4: rule__CustomTypeField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomTypeField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomTypeFieldAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:678:1: entryRulePrimitiveTypeField : rulePrimitiveTypeField EOF ;
    public final void entryRulePrimitiveTypeField() throws RecognitionException {
        try {
            // InternalAedit.g:679:1: ( rulePrimitiveTypeField EOF )
            // InternalAedit.g:680:1: rulePrimitiveTypeField EOF
            {
             before(grammarAccess.getPrimitiveTypeFieldRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveTypeField();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeFieldRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:687:1: rulePrimitiveTypeField : ( ( rule__PrimitiveTypeField__Group__0 ) ) ;
    public final void rulePrimitiveTypeField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:691:2: ( ( ( rule__PrimitiveTypeField__Group__0 ) ) )
            // InternalAedit.g:692:2: ( ( rule__PrimitiveTypeField__Group__0 ) )
            {
            // InternalAedit.g:692:2: ( ( rule__PrimitiveTypeField__Group__0 ) )
            // InternalAedit.g:693:3: ( rule__PrimitiveTypeField__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeFieldAccess().getGroup()); 
            // InternalAedit.g:694:3: ( rule__PrimitiveTypeField__Group__0 )
            // InternalAedit.g:694:4: rule__PrimitiveTypeField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeFieldAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleValue"
    // InternalAedit.g:703:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalAedit.g:704:1: ( ruleValue EOF )
            // InternalAedit.g:705:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:712:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:716:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalAedit.g:717:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalAedit.g:717:2: ( ( rule__Value__Alternatives ) )
            // InternalAedit.g:718:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalAedit.g:719:3: ( rule__Value__Alternatives )
            // InternalAedit.g:719:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalAedit.g:728:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // InternalAedit.g:729:1: ( ruleFloatValue EOF )
            // InternalAedit.g:730:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:737:1: ruleFloatValue : ( ( rule__FloatValue__ValAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:741:2: ( ( ( rule__FloatValue__ValAssignment ) ) )
            // InternalAedit.g:742:2: ( ( rule__FloatValue__ValAssignment ) )
            {
            // InternalAedit.g:742:2: ( ( rule__FloatValue__ValAssignment ) )
            // InternalAedit.g:743:3: ( rule__FloatValue__ValAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValAssignment()); 
            // InternalAedit.g:744:3: ( rule__FloatValue__ValAssignment )
            // InternalAedit.g:744:4: rule__FloatValue__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FloatValue__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFloatValueAccess().getValAssignment()); 

            }


            }

        }
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
    // InternalAedit.g:753:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalAedit.g:754:1: ( ruleStringValue EOF )
            // InternalAedit.g:755:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:762:1: ruleStringValue : ( ( rule__StringValue__ValAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:766:2: ( ( ( rule__StringValue__ValAssignment ) ) )
            // InternalAedit.g:767:2: ( ( rule__StringValue__ValAssignment ) )
            {
            // InternalAedit.g:767:2: ( ( rule__StringValue__ValAssignment ) )
            // InternalAedit.g:768:3: ( rule__StringValue__ValAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValAssignment()); 
            // InternalAedit.g:769:3: ( rule__StringValue__ValAssignment )
            // InternalAedit.g:769:4: rule__StringValue__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValAssignment()); 

            }


            }

        }
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
    // InternalAedit.g:778:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalAedit.g:779:1: ( ruleIntValue EOF )
            // InternalAedit.g:780:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:787:1: ruleIntValue : ( ( rule__IntValue__ValAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:791:2: ( ( ( rule__IntValue__ValAssignment ) ) )
            // InternalAedit.g:792:2: ( ( rule__IntValue__ValAssignment ) )
            {
            // InternalAedit.g:792:2: ( ( rule__IntValue__ValAssignment ) )
            // InternalAedit.g:793:3: ( rule__IntValue__ValAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValAssignment()); 
            // InternalAedit.g:794:3: ( rule__IntValue__ValAssignment )
            // InternalAedit.g:794:4: rule__IntValue__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntValueAccess().getValAssignment()); 

            }


            }

        }
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
    // InternalAedit.g:803:1: entryRuleNull : ruleNull EOF ;
    public final void entryRuleNull() throws RecognitionException {
        try {
            // InternalAedit.g:804:1: ( ruleNull EOF )
            // InternalAedit.g:805:1: ruleNull EOF
            {
             before(grammarAccess.getNullRule()); 
            pushFollow(FOLLOW_1);
            ruleNull();

            state._fsp--;

             after(grammarAccess.getNullRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:812:1: ruleNull : ( ( rule__Null__ValAssignment ) ) ;
    public final void ruleNull() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:816:2: ( ( ( rule__Null__ValAssignment ) ) )
            // InternalAedit.g:817:2: ( ( rule__Null__ValAssignment ) )
            {
            // InternalAedit.g:817:2: ( ( rule__Null__ValAssignment ) )
            // InternalAedit.g:818:3: ( rule__Null__ValAssignment )
            {
             before(grammarAccess.getNullAccess().getValAssignment()); 
            // InternalAedit.g:819:3: ( rule__Null__ValAssignment )
            // InternalAedit.g:819:4: rule__Null__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Null__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNullAccess().getValAssignment()); 

            }


            }

        }
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
    // InternalAedit.g:828:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalAedit.g:829:1: ( ruleBooleanValue EOF )
            // InternalAedit.g:830:1: ruleBooleanValue EOF
            {
             before(grammarAccess.getBooleanValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getBooleanValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:837:1: ruleBooleanValue : ( ( rule__BooleanValue__ValAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:841:2: ( ( ( rule__BooleanValue__ValAssignment ) ) )
            // InternalAedit.g:842:2: ( ( rule__BooleanValue__ValAssignment ) )
            {
            // InternalAedit.g:842:2: ( ( rule__BooleanValue__ValAssignment ) )
            // InternalAedit.g:843:3: ( rule__BooleanValue__ValAssignment )
            {
             before(grammarAccess.getBooleanValueAccess().getValAssignment()); 
            // InternalAedit.g:844:3: ( rule__BooleanValue__ValAssignment )
            // InternalAedit.g:844:4: rule__BooleanValue__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getValAssignment()); 

            }


            }

        }
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
    // InternalAedit.g:853:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // InternalAedit.g:854:1: ( ruleReal EOF )
            // InternalAedit.g:855:1: ruleReal EOF
            {
             before(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_1);
            ruleReal();

            state._fsp--;

             after(grammarAccess.getRealRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:862:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:866:2: ( ( ( rule__Real__Group__0 ) ) )
            // InternalAedit.g:867:2: ( ( rule__Real__Group__0 ) )
            {
            // InternalAedit.g:867:2: ( ( rule__Real__Group__0 ) )
            // InternalAedit.g:868:3: ( rule__Real__Group__0 )
            {
             before(grammarAccess.getRealAccess().getGroup()); 
            // InternalAedit.g:869:3: ( rule__Real__Group__0 )
            // InternalAedit.g:869:4: rule__Real__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getGroup()); 

            }


            }

        }
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
    // InternalAedit.g:878:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalAedit.g:879:1: ( ruleBoolean EOF )
            // InternalAedit.g:880:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:887:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:891:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalAedit.g:892:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalAedit.g:892:2: ( ( rule__Boolean__Alternatives ) )
            // InternalAedit.g:893:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalAedit.g:894:3: ( rule__Boolean__Alternatives )
            // InternalAedit.g:894:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSCHEMA_TYPE"
    // InternalAedit.g:903:1: entryRuleSCHEMA_TYPE : ruleSCHEMA_TYPE EOF ;
    public final void entryRuleSCHEMA_TYPE() throws RecognitionException {
        try {
            // InternalAedit.g:904:1: ( ruleSCHEMA_TYPE EOF )
            // InternalAedit.g:905:1: ruleSCHEMA_TYPE EOF
            {
             before(grammarAccess.getSCHEMA_TYPERule()); 
            pushFollow(FOLLOW_1);
            ruleSCHEMA_TYPE();

            state._fsp--;

             after(grammarAccess.getSCHEMA_TYPERule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:912:1: ruleSCHEMA_TYPE : ( ( rule__SCHEMA_TYPE__Alternatives ) ) ;
    public final void ruleSCHEMA_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:916:2: ( ( ( rule__SCHEMA_TYPE__Alternatives ) ) )
            // InternalAedit.g:917:2: ( ( rule__SCHEMA_TYPE__Alternatives ) )
            {
            // InternalAedit.g:917:2: ( ( rule__SCHEMA_TYPE__Alternatives ) )
            // InternalAedit.g:918:3: ( rule__SCHEMA_TYPE__Alternatives )
            {
             before(grammarAccess.getSCHEMA_TYPEAccess().getAlternatives()); 
            // InternalAedit.g:919:3: ( rule__SCHEMA_TYPE__Alternatives )
            // InternalAedit.g:919:4: rule__SCHEMA_TYPE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SCHEMA_TYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSCHEMA_TYPEAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalAedit.g:928:1: entryRuleVARIABLE_TYPE : ruleVARIABLE_TYPE EOF ;
    public final void entryRuleVARIABLE_TYPE() throws RecognitionException {
        try {
            // InternalAedit.g:929:1: ( ruleVARIABLE_TYPE EOF )
            // InternalAedit.g:930:1: ruleVARIABLE_TYPE EOF
            {
             before(grammarAccess.getVARIABLE_TYPERule()); 
            pushFollow(FOLLOW_1);
            ruleVARIABLE_TYPE();

            state._fsp--;

             after(grammarAccess.getVARIABLE_TYPERule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:937:1: ruleVARIABLE_TYPE : ( ( rule__VARIABLE_TYPE__Alternatives ) ) ;
    public final void ruleVARIABLE_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:941:2: ( ( ( rule__VARIABLE_TYPE__Alternatives ) ) )
            // InternalAedit.g:942:2: ( ( rule__VARIABLE_TYPE__Alternatives ) )
            {
            // InternalAedit.g:942:2: ( ( rule__VARIABLE_TYPE__Alternatives ) )
            // InternalAedit.g:943:3: ( rule__VARIABLE_TYPE__Alternatives )
            {
             before(grammarAccess.getVARIABLE_TYPEAccess().getAlternatives()); 
            // InternalAedit.g:944:3: ( rule__VARIABLE_TYPE__Alternatives )
            // InternalAedit.g:944:4: rule__VARIABLE_TYPE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VARIABLE_TYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVARIABLE_TYPEAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalAedit.g:953:1: entryRuleQN : ruleQN EOF ;
    public final void entryRuleQN() throws RecognitionException {
        try {
            // InternalAedit.g:954:1: ( ruleQN EOF )
            // InternalAedit.g:955:1: ruleQN EOF
            {
             before(grammarAccess.getQNRule()); 
            pushFollow(FOLLOW_1);
            ruleQN();

            state._fsp--;

             after(grammarAccess.getQNRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAedit.g:962:1: ruleQN : ( ( rule__QN__Group__0 ) ) ;
    public final void ruleQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:966:2: ( ( ( rule__QN__Group__0 ) ) )
            // InternalAedit.g:967:2: ( ( rule__QN__Group__0 ) )
            {
            // InternalAedit.g:967:2: ( ( rule__QN__Group__0 ) )
            // InternalAedit.g:968:3: ( rule__QN__Group__0 )
            {
             before(grammarAccess.getQNAccess().getGroup()); 
            // InternalAedit.g:969:3: ( rule__QN__Group__0 )
            // InternalAedit.g:969:4: rule__QN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQNAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "rule__GenericRule__Alternatives"
    // InternalAedit.g:977:1: rule__GenericRule__Alternatives : ( ( ruleRenameSchema ) | ( ruleRemoveSchema ) | ( ruleAdd ) | ( ruleChangeSchema ) | ( ruleChangeEnum ) );
    public final void rule__GenericRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:981:1: ( ( ruleRenameSchema ) | ( ruleRemoveSchema ) | ( ruleAdd ) | ( ruleChangeSchema ) | ( ruleChangeEnum ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt1=1;
                }
                break;
            case 36:
                {
                alt1=2;
                }
                break;
            case 31:
                {
                alt1=3;
                }
                break;
            case 30:
                {
                int LA1_4 = input.LA(2);

                if ( (LA1_4==15) ) {
                    alt1=5;
                }
                else if ( ((LA1_4>=11 && LA1_4<=12)) ) {
                    alt1=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalAedit.g:982:2: ( ruleRenameSchema )
                    {
                    // InternalAedit.g:982:2: ( ruleRenameSchema )
                    // InternalAedit.g:983:3: ruleRenameSchema
                    {
                     before(grammarAccess.getGenericRuleAccess().getRenameSchemaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRenameSchema();

                    state._fsp--;

                     after(grammarAccess.getGenericRuleAccess().getRenameSchemaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:988:2: ( ruleRemoveSchema )
                    {
                    // InternalAedit.g:988:2: ( ruleRemoveSchema )
                    // InternalAedit.g:989:3: ruleRemoveSchema
                    {
                     before(grammarAccess.getGenericRuleAccess().getRemoveSchemaParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRemoveSchema();

                    state._fsp--;

                     after(grammarAccess.getGenericRuleAccess().getRemoveSchemaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAedit.g:994:2: ( ruleAdd )
                    {
                    // InternalAedit.g:994:2: ( ruleAdd )
                    // InternalAedit.g:995:3: ruleAdd
                    {
                     before(grammarAccess.getGenericRuleAccess().getAddParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAdd();

                    state._fsp--;

                     after(grammarAccess.getGenericRuleAccess().getAddParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAedit.g:1000:2: ( ruleChangeSchema )
                    {
                    // InternalAedit.g:1000:2: ( ruleChangeSchema )
                    // InternalAedit.g:1001:3: ruleChangeSchema
                    {
                     before(grammarAccess.getGenericRuleAccess().getChangeSchemaParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleChangeSchema();

                    state._fsp--;

                     after(grammarAccess.getGenericRuleAccess().getChangeSchemaParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAedit.g:1006:2: ( ruleChangeEnum )
                    {
                    // InternalAedit.g:1006:2: ( ruleChangeEnum )
                    // InternalAedit.g:1007:3: ruleChangeEnum
                    {
                     before(grammarAccess.getGenericRuleAccess().getChangeEnumParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleChangeEnum();

                    state._fsp--;

                     after(grammarAccess.getGenericRuleAccess().getChangeEnumParserRuleCall_4()); 

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
    // InternalAedit.g:1016:1: rule__SchemaRule__Alternatives : ( ( ruleRemoveVariable ) | ( ruleRenameVariable ) | ( ruleAddVariable ) | ( ruleChangeDefValue ) | ( ruleChangeType ) );
    public final void rule__SchemaRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1020:1: ( ( ruleRemoveVariable ) | ( ruleRenameVariable ) | ( ruleAddVariable ) | ( ruleChangeDefValue ) | ( ruleChangeType ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt2=1;
                }
                break;
            case 37:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            case 39:
                {
                alt2=4;
                }
                break;
            case 40:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAedit.g:1021:2: ( ruleRemoveVariable )
                    {
                    // InternalAedit.g:1021:2: ( ruleRemoveVariable )
                    // InternalAedit.g:1022:3: ruleRemoveVariable
                    {
                     before(grammarAccess.getSchemaRuleAccess().getRemoveVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRemoveVariable();

                    state._fsp--;

                     after(grammarAccess.getSchemaRuleAccess().getRemoveVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1027:2: ( ruleRenameVariable )
                    {
                    // InternalAedit.g:1027:2: ( ruleRenameVariable )
                    // InternalAedit.g:1028:3: ruleRenameVariable
                    {
                     before(grammarAccess.getSchemaRuleAccess().getRenameVariableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRenameVariable();

                    state._fsp--;

                     after(grammarAccess.getSchemaRuleAccess().getRenameVariableParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAedit.g:1033:2: ( ruleAddVariable )
                    {
                    // InternalAedit.g:1033:2: ( ruleAddVariable )
                    // InternalAedit.g:1034:3: ruleAddVariable
                    {
                     before(grammarAccess.getSchemaRuleAccess().getAddVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAddVariable();

                    state._fsp--;

                     after(grammarAccess.getSchemaRuleAccess().getAddVariableParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAedit.g:1039:2: ( ruleChangeDefValue )
                    {
                    // InternalAedit.g:1039:2: ( ruleChangeDefValue )
                    // InternalAedit.g:1040:3: ruleChangeDefValue
                    {
                     before(grammarAccess.getSchemaRuleAccess().getChangeDefValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleChangeDefValue();

                    state._fsp--;

                     after(grammarAccess.getSchemaRuleAccess().getChangeDefValueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAedit.g:1045:2: ( ruleChangeType )
                    {
                    // InternalAedit.g:1045:2: ( ruleChangeType )
                    // InternalAedit.g:1046:3: ruleChangeType
                    {
                     before(grammarAccess.getSchemaRuleAccess().getChangeTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleChangeType();

                    state._fsp--;

                     after(grammarAccess.getSchemaRuleAccess().getChangeTypeParserRuleCall_4()); 

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


    // $ANTLR start "rule__EnumRule__Alternatives"
    // InternalAedit.g:1055:1: rule__EnumRule__Alternatives : ( ( ruleRemoveEnum ) | ( ruleRenameEnum ) | ( ruleAddEnum ) );
    public final void rule__EnumRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1059:1: ( ( ruleRemoveEnum ) | ( ruleRenameEnum ) | ( ruleAddEnum ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case 31:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAedit.g:1060:2: ( ruleRemoveEnum )
                    {
                    // InternalAedit.g:1060:2: ( ruleRemoveEnum )
                    // InternalAedit.g:1061:3: ruleRemoveEnum
                    {
                     before(grammarAccess.getEnumRuleAccess().getRemoveEnumParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRemoveEnum();

                    state._fsp--;

                     after(grammarAccess.getEnumRuleAccess().getRemoveEnumParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1066:2: ( ruleRenameEnum )
                    {
                    // InternalAedit.g:1066:2: ( ruleRenameEnum )
                    // InternalAedit.g:1067:3: ruleRenameEnum
                    {
                     before(grammarAccess.getEnumRuleAccess().getRenameEnumParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRenameEnum();

                    state._fsp--;

                     after(grammarAccess.getEnumRuleAccess().getRenameEnumParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAedit.g:1072:2: ( ruleAddEnum )
                    {
                    // InternalAedit.g:1072:2: ( ruleAddEnum )
                    // InternalAedit.g:1073:3: ruleAddEnum
                    {
                     before(grammarAccess.getEnumRuleAccess().getAddEnumParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAddEnum();

                    state._fsp--;

                     after(grammarAccess.getEnumRuleAccess().getAddEnumParserRuleCall_2()); 

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


    // $ANTLR start "rule__ChangeSchema__Alternatives_1"
    // InternalAedit.g:1082:1: rule__ChangeSchema__Alternatives_1 : ( ( 'record' ) | ( 'error' ) );
    public final void rule__ChangeSchema__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1086:1: ( ( 'record' ) | ( 'error' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAedit.g:1087:2: ( 'record' )
                    {
                    // InternalAedit.g:1087:2: ( 'record' )
                    // InternalAedit.g:1088:3: 'record'
                    {
                     before(grammarAccess.getChangeSchemaAccess().getRecordKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getChangeSchemaAccess().getRecordKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1093:2: ( 'error' )
                    {
                    // InternalAedit.g:1093:2: ( 'error' )
                    // InternalAedit.g:1094:3: 'error'
                    {
                     before(grammarAccess.getChangeSchemaAccess().getErrorKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getChangeSchemaAccess().getErrorKeyword_1_1()); 

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
    // $ANTLR end "rule__ChangeSchema__Alternatives_1"


    // $ANTLR start "rule__Add__Alternatives"
    // InternalAedit.g:1103:1: rule__Add__Alternatives : ( ( ruleAddRecord ) | ( ruleAddEnumeration ) );
    public final void rule__Add__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1107:1: ( ( ruleAddRecord ) | ( ruleAddEnumeration ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==32) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==RULE_INT) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==33) ) {
                            int LA5_4 = input.LA(5);

                            if ( (LA5_4==15) ) {
                                alt5=2;
                            }
                            else if ( (LA5_4==11) ) {
                                alt5=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAedit.g:1108:2: ( ruleAddRecord )
                    {
                    // InternalAedit.g:1108:2: ( ruleAddRecord )
                    // InternalAedit.g:1109:3: ruleAddRecord
                    {
                     before(grammarAccess.getAddAccess().getAddRecordParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAddRecord();

                    state._fsp--;

                     after(grammarAccess.getAddAccess().getAddRecordParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1114:2: ( ruleAddEnumeration )
                    {
                    // InternalAedit.g:1114:2: ( ruleAddEnumeration )
                    // InternalAedit.g:1115:3: ruleAddEnumeration
                    {
                     before(grammarAccess.getAddAccess().getAddEnumerationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAddEnumeration();

                    state._fsp--;

                     after(grammarAccess.getAddAccess().getAddEnumerationParserRuleCall_1()); 

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


    // $ANTLR start "rule__Field__Alternatives"
    // InternalAedit.g:1124:1: rule__Field__Alternatives : ( ( rulePrimitiveTypeField ) | ( ruleCustomTypeField ) );
    public final void rule__Field__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1128:1: ( ( rulePrimitiveTypeField ) | ( ruleCustomTypeField ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=16 && LA6_0<=21)) ) {
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
                    // InternalAedit.g:1129:2: ( rulePrimitiveTypeField )
                    {
                    // InternalAedit.g:1129:2: ( rulePrimitiveTypeField )
                    // InternalAedit.g:1130:3: rulePrimitiveTypeField
                    {
                     before(grammarAccess.getFieldAccess().getPrimitiveTypeFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveTypeField();

                    state._fsp--;

                     after(grammarAccess.getFieldAccess().getPrimitiveTypeFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1135:2: ( ruleCustomTypeField )
                    {
                    // InternalAedit.g:1135:2: ( ruleCustomTypeField )
                    // InternalAedit.g:1136:3: ruleCustomTypeField
                    {
                     before(grammarAccess.getFieldAccess().getCustomTypeFieldParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomTypeField();

                    state._fsp--;

                     after(grammarAccess.getFieldAccess().getCustomTypeFieldParserRuleCall_1()); 

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
    // $ANTLR end "rule__Field__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalAedit.g:1145:1: rule__Value__Alternatives : ( ( ruleFloatValue ) | ( ruleIntValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleNull ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1149:1: ( ( ruleFloatValue ) | ( ruleIntValue ) | ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleNull ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==EOF||LA7_2==RULE_ID||(LA7_2>=16 && LA7_2<=21)||LA7_2==24||LA7_2==27) ) {
                    alt7=2;
                }
                else if ( (LA7_2==34) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            case 13:
            case 14:
                {
                alt7=4;
                }
                break;
            case 43:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAedit.g:1150:2: ( ruleFloatValue )
                    {
                    // InternalAedit.g:1150:2: ( ruleFloatValue )
                    // InternalAedit.g:1151:3: ruleFloatValue
                    {
                     before(grammarAccess.getValueAccess().getFloatValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFloatValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getFloatValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1156:2: ( ruleIntValue )
                    {
                    // InternalAedit.g:1156:2: ( ruleIntValue )
                    // InternalAedit.g:1157:3: ruleIntValue
                    {
                     before(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAedit.g:1162:2: ( ruleStringValue )
                    {
                    // InternalAedit.g:1162:2: ( ruleStringValue )
                    // InternalAedit.g:1163:3: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getStringValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStringValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAedit.g:1168:2: ( ruleBooleanValue )
                    {
                    // InternalAedit.g:1168:2: ( ruleBooleanValue )
                    // InternalAedit.g:1169:3: ruleBooleanValue
                    {
                     before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAedit.g:1174:2: ( ruleNull )
                    {
                    // InternalAedit.g:1174:2: ( ruleNull )
                    // InternalAedit.g:1175:3: ruleNull
                    {
                     before(grammarAccess.getValueAccess().getNullParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNull();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNullParserRuleCall_4()); 

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


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalAedit.g:1184:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1188:1: ( ( 'true' ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAedit.g:1189:2: ( 'true' )
                    {
                    // InternalAedit.g:1189:2: ( 'true' )
                    // InternalAedit.g:1190:3: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1195:2: ( 'false' )
                    {
                    // InternalAedit.g:1195:2: ( 'false' )
                    // InternalAedit.g:1196:3: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 

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
    // InternalAedit.g:1205:1: rule__SCHEMA_TYPE__Alternatives : ( ( 'record' ) | ( 'enum' ) );
    public final void rule__SCHEMA_TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1209:1: ( ( 'record' ) | ( 'enum' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAedit.g:1210:2: ( 'record' )
                    {
                    // InternalAedit.g:1210:2: ( 'record' )
                    // InternalAedit.g:1211:3: 'record'
                    {
                     before(grammarAccess.getSCHEMA_TYPEAccess().getRecordKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSCHEMA_TYPEAccess().getRecordKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1216:2: ( 'enum' )
                    {
                    // InternalAedit.g:1216:2: ( 'enum' )
                    // InternalAedit.g:1217:3: 'enum'
                    {
                     before(grammarAccess.getSCHEMA_TYPEAccess().getEnumKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSCHEMA_TYPEAccess().getEnumKeyword_1()); 

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
    // InternalAedit.g:1226:1: rule__VARIABLE_TYPE__Alternatives : ( ( 'int' ) | ( 'double' ) | ( 'string' ) | ( 'long' ) | ( 'boolean' ) | ( 'float' ) );
    public final void rule__VARIABLE_TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1230:1: ( ( 'int' ) | ( 'double' ) | ( 'string' ) | ( 'long' ) | ( 'boolean' ) | ( 'float' ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 18:
                {
                alt10=3;
                }
                break;
            case 19:
                {
                alt10=4;
                }
                break;
            case 20:
                {
                alt10=5;
                }
                break;
            case 21:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalAedit.g:1231:2: ( 'int' )
                    {
                    // InternalAedit.g:1231:2: ( 'int' )
                    // InternalAedit.g:1232:3: 'int'
                    {
                     before(grammarAccess.getVARIABLE_TYPEAccess().getIntKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getVARIABLE_TYPEAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1237:2: ( 'double' )
                    {
                    // InternalAedit.g:1237:2: ( 'double' )
                    // InternalAedit.g:1238:3: 'double'
                    {
                     before(grammarAccess.getVARIABLE_TYPEAccess().getDoubleKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVARIABLE_TYPEAccess().getDoubleKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAedit.g:1243:2: ( 'string' )
                    {
                    // InternalAedit.g:1243:2: ( 'string' )
                    // InternalAedit.g:1244:3: 'string'
                    {
                     before(grammarAccess.getVARIABLE_TYPEAccess().getStringKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getVARIABLE_TYPEAccess().getStringKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAedit.g:1249:2: ( 'long' )
                    {
                    // InternalAedit.g:1249:2: ( 'long' )
                    // InternalAedit.g:1250:3: 'long'
                    {
                     before(grammarAccess.getVARIABLE_TYPEAccess().getLongKeyword_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getVARIABLE_TYPEAccess().getLongKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAedit.g:1255:2: ( 'boolean' )
                    {
                    // InternalAedit.g:1255:2: ( 'boolean' )
                    // InternalAedit.g:1256:3: 'boolean'
                    {
                     before(grammarAccess.getVARIABLE_TYPEAccess().getBooleanKeyword_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getVARIABLE_TYPEAccess().getBooleanKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAedit.g:1261:2: ( 'float' )
                    {
                    // InternalAedit.g:1261:2: ( 'float' )
                    // InternalAedit.g:1262:3: 'float'
                    {
                     before(grammarAccess.getVARIABLE_TYPEAccess().getFloatKeyword_5()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getVARIABLE_TYPEAccess().getFloatKeyword_5()); 

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
    // InternalAedit.g:1271:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1275:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAedit.g:1276:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1283:1: rule__Model__Group__0__Impl : ( ( rule__Model__RuleDeclarationsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1287:1: ( ( ( rule__Model__RuleDeclarationsAssignment_0 )* ) )
            // InternalAedit.g:1288:1: ( ( rule__Model__RuleDeclarationsAssignment_0 )* )
            {
            // InternalAedit.g:1288:1: ( ( rule__Model__RuleDeclarationsAssignment_0 )* )
            // InternalAedit.g:1289:2: ( rule__Model__RuleDeclarationsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getRuleDeclarationsAssignment_0()); 
            // InternalAedit.g:1290:2: ( rule__Model__RuleDeclarationsAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAedit.g:1290:3: rule__Model__RuleDeclarationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__RuleDeclarationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRuleDeclarationsAssignment_0()); 

            }


            }

        }
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
    // InternalAedit.g:1298:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1302:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAedit.g:1303:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1310:1: rule__Model__Group__1__Impl : ( ( rule__Model__RuleMapsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1314:1: ( ( ( rule__Model__RuleMapsAssignment_1 )* ) )
            // InternalAedit.g:1315:1: ( ( rule__Model__RuleMapsAssignment_1 )* )
            {
            // InternalAedit.g:1315:1: ( ( rule__Model__RuleMapsAssignment_1 )* )
            // InternalAedit.g:1316:2: ( rule__Model__RuleMapsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getRuleMapsAssignment_1()); 
            // InternalAedit.g:1317:2: ( rule__Model__RuleMapsAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAedit.g:1317:3: rule__Model__RuleMapsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__RuleMapsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRuleMapsAssignment_1()); 

            }


            }

        }
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
    // InternalAedit.g:1325:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1329:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalAedit.g:1330:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1337:1: rule__Model__Group__2__Impl : ( ( rule__Model__FeaturesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1341:1: ( ( ( rule__Model__FeaturesAssignment_2 )* ) )
            // InternalAedit.g:1342:1: ( ( rule__Model__FeaturesAssignment_2 )* )
            {
            // InternalAedit.g:1342:1: ( ( rule__Model__FeaturesAssignment_2 )* )
            // InternalAedit.g:1343:2: ( rule__Model__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getFeaturesAssignment_2()); 
            // InternalAedit.g:1344:2: ( rule__Model__FeaturesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAedit.g:1344:3: rule__Model__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFeaturesAssignment_2()); 

            }


            }

        }
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
    // InternalAedit.g:1352:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1356:1: ( rule__Model__Group__3__Impl )
            // InternalAedit.g:1357:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1363:1: rule__Model__Group__3__Impl : ( ( rule__Model__FeatureMapsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1367:1: ( ( ( rule__Model__FeatureMapsAssignment_3 )* ) )
            // InternalAedit.g:1368:1: ( ( rule__Model__FeatureMapsAssignment_3 )* )
            {
            // InternalAedit.g:1368:1: ( ( rule__Model__FeatureMapsAssignment_3 )* )
            // InternalAedit.g:1369:2: ( rule__Model__FeatureMapsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getFeatureMapsAssignment_3()); 
            // InternalAedit.g:1370:2: ( rule__Model__FeatureMapsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAedit.g:1370:3: rule__Model__FeatureMapsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__FeatureMapsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFeatureMapsAssignment_3()); 

            }


            }

        }
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
    // InternalAedit.g:1379:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1383:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalAedit.g:1384:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1391:1: rule__Feature__Group__0__Impl : ( 'feature' ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1395:1: ( ( 'feature' ) )
            // InternalAedit.g:1396:1: ( 'feature' )
            {
            // InternalAedit.g:1396:1: ( 'feature' )
            // InternalAedit.g:1397:2: 'feature'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:1406:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1410:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalAedit.g:1411:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1418:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1422:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalAedit.g:1423:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalAedit.g:1423:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalAedit.g:1424:2: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalAedit.g:1425:2: ( rule__Feature__NameAssignment_1 )
            // InternalAedit.g:1425:3: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalAedit.g:1433:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1437:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalAedit.g:1438:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1445:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__Group_2__0 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1449:1: ( ( ( rule__Feature__Group_2__0 )? ) )
            // InternalAedit.g:1450:1: ( ( rule__Feature__Group_2__0 )? )
            {
            // InternalAedit.g:1450:1: ( ( rule__Feature__Group_2__0 )? )
            // InternalAedit.g:1451:2: ( rule__Feature__Group_2__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_2()); 
            // InternalAedit.g:1452:2: ( rule__Feature__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAedit.g:1452:3: rule__Feature__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalAedit.g:1460:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1464:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalAedit.g:1465:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1472:1: rule__Feature__Group__3__Impl : ( '{' ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1476:1: ( ( '{' ) )
            // InternalAedit.g:1477:1: ( '{' )
            {
            // InternalAedit.g:1477:1: ( '{' )
            // InternalAedit.g:1478:2: '{'
            {
             before(grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalAedit.g:1487:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1491:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalAedit.g:1492:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Feature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__5();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1499:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__RuleMapsAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1503:1: ( ( ( rule__Feature__RuleMapsAssignment_4 )* ) )
            // InternalAedit.g:1504:1: ( ( rule__Feature__RuleMapsAssignment_4 )* )
            {
            // InternalAedit.g:1504:1: ( ( rule__Feature__RuleMapsAssignment_4 )* )
            // InternalAedit.g:1505:2: ( rule__Feature__RuleMapsAssignment_4 )*
            {
             before(grammarAccess.getFeatureAccess().getRuleMapsAssignment_4()); 
            // InternalAedit.g:1506:2: ( rule__Feature__RuleMapsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAedit.g:1506:3: rule__Feature__RuleMapsAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Feature__RuleMapsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getRuleMapsAssignment_4()); 

            }


            }

        }
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
    // InternalAedit.g:1514:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1518:1: ( rule__Feature__Group__5__Impl )
            // InternalAedit.g:1519:2: rule__Feature__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1525:1: rule__Feature__Group__5__Impl : ( '}' ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1529:1: ( ( '}' ) )
            // InternalAedit.g:1530:1: ( '}' )
            {
            // InternalAedit.g:1530:1: ( '}' )
            // InternalAedit.g:1531:2: '}'
            {
             before(grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalAedit.g:1541:1: rule__Feature__Group_2__0 : rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 ;
    public final void rule__Feature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1545:1: ( rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 )
            // InternalAedit.g:1546:2: rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Feature__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1553:1: rule__Feature__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Feature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1557:1: ( ( ':' ) )
            // InternalAedit.g:1558:1: ( ':' )
            {
            // InternalAedit.g:1558:1: ( ':' )
            // InternalAedit.g:1559:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_2_0()); 

            }


            }

        }
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
    // InternalAedit.g:1568:1: rule__Feature__Group_2__1 : rule__Feature__Group_2__1__Impl ;
    public final void rule__Feature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1572:1: ( rule__Feature__Group_2__1__Impl )
            // InternalAedit.g:1573:2: rule__Feature__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1579:1: rule__Feature__Group_2__1__Impl : ( ( rule__Feature__ExtendAssignment_2_1 ) ) ;
    public final void rule__Feature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1583:1: ( ( ( rule__Feature__ExtendAssignment_2_1 ) ) )
            // InternalAedit.g:1584:1: ( ( rule__Feature__ExtendAssignment_2_1 ) )
            {
            // InternalAedit.g:1584:1: ( ( rule__Feature__ExtendAssignment_2_1 ) )
            // InternalAedit.g:1585:2: ( rule__Feature__ExtendAssignment_2_1 )
            {
             before(grammarAccess.getFeatureAccess().getExtendAssignment_2_1()); 
            // InternalAedit.g:1586:2: ( rule__Feature__ExtendAssignment_2_1 )
            // InternalAedit.g:1586:3: rule__Feature__ExtendAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__ExtendAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getExtendAssignment_2_1()); 

            }


            }

        }
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
    // InternalAedit.g:1595:1: rule__FeatureMap__Group__0 : rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1 ;
    public final void rule__FeatureMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1599:1: ( rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1 )
            // InternalAedit.g:1600:2: rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FeatureMap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureMap__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1607:1: rule__FeatureMap__Group__0__Impl : ( 'use' ) ;
    public final void rule__FeatureMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1611:1: ( ( 'use' ) )
            // InternalAedit.g:1612:1: ( 'use' )
            {
            // InternalAedit.g:1612:1: ( 'use' )
            // InternalAedit.g:1613:2: 'use'
            {
             before(grammarAccess.getFeatureMapAccess().getUseKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFeatureMapAccess().getUseKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:1622:1: rule__FeatureMap__Group__1 : rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2 ;
    public final void rule__FeatureMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1626:1: ( rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2 )
            // InternalAedit.g:1627:2: rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__FeatureMap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureMap__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1634:1: rule__FeatureMap__Group__1__Impl : ( ( rule__FeatureMap__NameAssignment_1 ) ) ;
    public final void rule__FeatureMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1638:1: ( ( ( rule__FeatureMap__NameAssignment_1 ) ) )
            // InternalAedit.g:1639:1: ( ( rule__FeatureMap__NameAssignment_1 ) )
            {
            // InternalAedit.g:1639:1: ( ( rule__FeatureMap__NameAssignment_1 ) )
            // InternalAedit.g:1640:2: ( rule__FeatureMap__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getNameAssignment_1()); 
            // InternalAedit.g:1641:2: ( rule__FeatureMap__NameAssignment_1 )
            // InternalAedit.g:1641:3: rule__FeatureMap__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureMap__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMapAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalAedit.g:1649:1: rule__FeatureMap__Group__2 : rule__FeatureMap__Group__2__Impl ;
    public final void rule__FeatureMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1653:1: ( rule__FeatureMap__Group__2__Impl )
            // InternalAedit.g:1654:2: rule__FeatureMap__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureMap__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1660:1: rule__FeatureMap__Group__2__Impl : ( ';' ) ;
    public final void rule__FeatureMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1664:1: ( ( ';' ) )
            // InternalAedit.g:1665:1: ( ';' )
            {
            // InternalAedit.g:1665:1: ( ';' )
            // InternalAedit.g:1666:2: ';'
            {
             before(grammarAccess.getFeatureMapAccess().getSemicolonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFeatureMapAccess().getSemicolonKeyword_2()); 

            }


            }

        }
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
    // InternalAedit.g:1676:1: rule__RuleMap__Group__0 : rule__RuleMap__Group__0__Impl rule__RuleMap__Group__1 ;
    public final void rule__RuleMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1680:1: ( rule__RuleMap__Group__0__Impl rule__RuleMap__Group__1 )
            // InternalAedit.g:1681:2: rule__RuleMap__Group__0__Impl rule__RuleMap__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RuleMap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleMap__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1688:1: rule__RuleMap__Group__0__Impl : ( 'ruleset' ) ;
    public final void rule__RuleMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1692:1: ( ( 'ruleset' ) )
            // InternalAedit.g:1693:1: ( 'ruleset' )
            {
            // InternalAedit.g:1693:1: ( 'ruleset' )
            // InternalAedit.g:1694:2: 'ruleset'
            {
             before(grammarAccess.getRuleMapAccess().getRulesetKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRuleMapAccess().getRulesetKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:1703:1: rule__RuleMap__Group__1 : rule__RuleMap__Group__1__Impl rule__RuleMap__Group__2 ;
    public final void rule__RuleMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1707:1: ( rule__RuleMap__Group__1__Impl rule__RuleMap__Group__2 )
            // InternalAedit.g:1708:2: rule__RuleMap__Group__1__Impl rule__RuleMap__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RuleMap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleMap__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1715:1: rule__RuleMap__Group__1__Impl : ( ( rule__RuleMap__NameAssignment_1 ) ) ;
    public final void rule__RuleMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1719:1: ( ( ( rule__RuleMap__NameAssignment_1 ) ) )
            // InternalAedit.g:1720:1: ( ( rule__RuleMap__NameAssignment_1 ) )
            {
            // InternalAedit.g:1720:1: ( ( rule__RuleMap__NameAssignment_1 ) )
            // InternalAedit.g:1721:2: ( rule__RuleMap__NameAssignment_1 )
            {
             before(grammarAccess.getRuleMapAccess().getNameAssignment_1()); 
            // InternalAedit.g:1722:2: ( rule__RuleMap__NameAssignment_1 )
            // InternalAedit.g:1722:3: rule__RuleMap__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleMap__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleMapAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalAedit.g:1730:1: rule__RuleMap__Group__2 : rule__RuleMap__Group__2__Impl rule__RuleMap__Group__3 ;
    public final void rule__RuleMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1734:1: ( rule__RuleMap__Group__2__Impl rule__RuleMap__Group__3 )
            // InternalAedit.g:1735:2: rule__RuleMap__Group__2__Impl rule__RuleMap__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__RuleMap__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleMap__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1742:1: rule__RuleMap__Group__2__Impl : ( '{' ) ;
    public final void rule__RuleMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1746:1: ( ( '{' ) )
            // InternalAedit.g:1747:1: ( '{' )
            {
            // InternalAedit.g:1747:1: ( '{' )
            // InternalAedit.g:1748:2: '{'
            {
             before(grammarAccess.getRuleMapAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleMapAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalAedit.g:1757:1: rule__RuleMap__Group__3 : rule__RuleMap__Group__3__Impl rule__RuleMap__Group__4 ;
    public final void rule__RuleMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1761:1: ( rule__RuleMap__Group__3__Impl rule__RuleMap__Group__4 )
            // InternalAedit.g:1762:2: rule__RuleMap__Group__3__Impl rule__RuleMap__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__RuleMap__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleMap__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1769:1: rule__RuleMap__Group__3__Impl : ( ( rule__RuleMap__RulesAssignment_3 )* ) ;
    public final void rule__RuleMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1773:1: ( ( ( rule__RuleMap__RulesAssignment_3 )* ) )
            // InternalAedit.g:1774:1: ( ( rule__RuleMap__RulesAssignment_3 )* )
            {
            // InternalAedit.g:1774:1: ( ( rule__RuleMap__RulesAssignment_3 )* )
            // InternalAedit.g:1775:2: ( rule__RuleMap__RulesAssignment_3 )*
            {
             before(grammarAccess.getRuleMapAccess().getRulesAssignment_3()); 
            // InternalAedit.g:1776:2: ( rule__RuleMap__RulesAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAedit.g:1776:3: rule__RuleMap__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RuleMap__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getRuleMapAccess().getRulesAssignment_3()); 

            }


            }

        }
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
    // InternalAedit.g:1784:1: rule__RuleMap__Group__4 : rule__RuleMap__Group__4__Impl ;
    public final void rule__RuleMap__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1788:1: ( rule__RuleMap__Group__4__Impl )
            // InternalAedit.g:1789:2: rule__RuleMap__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleMap__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1795:1: rule__RuleMap__Group__4__Impl : ( '}' ) ;
    public final void rule__RuleMap__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1799:1: ( ( '}' ) )
            // InternalAedit.g:1800:1: ( '}' )
            {
            // InternalAedit.g:1800:1: ( '}' )
            // InternalAedit.g:1801:2: '}'
            {
             before(grammarAccess.getRuleMapAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleMapAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalAedit.g:1811:1: rule__RuleDeclaration__Group__0 : rule__RuleDeclaration__Group__0__Impl rule__RuleDeclaration__Group__1 ;
    public final void rule__RuleDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1815:1: ( rule__RuleDeclaration__Group__0__Impl rule__RuleDeclaration__Group__1 )
            // InternalAedit.g:1816:2: rule__RuleDeclaration__Group__0__Impl rule__RuleDeclaration__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RuleDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1823:1: rule__RuleDeclaration__Group__0__Impl : ( 'rule' ) ;
    public final void rule__RuleDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1827:1: ( ( 'rule' ) )
            // InternalAedit.g:1828:1: ( 'rule' )
            {
            // InternalAedit.g:1828:1: ( 'rule' )
            // InternalAedit.g:1829:2: 'rule'
            {
             before(grammarAccess.getRuleDeclarationAccess().getRuleKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRuleDeclarationAccess().getRuleKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:1838:1: rule__RuleDeclaration__Group__1 : rule__RuleDeclaration__Group__1__Impl rule__RuleDeclaration__Group__2 ;
    public final void rule__RuleDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1842:1: ( rule__RuleDeclaration__Group__1__Impl rule__RuleDeclaration__Group__2 )
            // InternalAedit.g:1843:2: rule__RuleDeclaration__Group__1__Impl rule__RuleDeclaration__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RuleDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1850:1: rule__RuleDeclaration__Group__1__Impl : ( ( rule__RuleDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RuleDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1854:1: ( ( ( rule__RuleDeclaration__NameAssignment_1 ) ) )
            // InternalAedit.g:1855:1: ( ( rule__RuleDeclaration__NameAssignment_1 ) )
            {
            // InternalAedit.g:1855:1: ( ( rule__RuleDeclaration__NameAssignment_1 ) )
            // InternalAedit.g:1856:2: ( rule__RuleDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getRuleDeclarationAccess().getNameAssignment_1()); 
            // InternalAedit.g:1857:2: ( rule__RuleDeclaration__NameAssignment_1 )
            // InternalAedit.g:1857:3: rule__RuleDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalAedit.g:1865:1: rule__RuleDeclaration__Group__2 : rule__RuleDeclaration__Group__2__Impl rule__RuleDeclaration__Group__3 ;
    public final void rule__RuleDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1869:1: ( rule__RuleDeclaration__Group__2__Impl rule__RuleDeclaration__Group__3 )
            // InternalAedit.g:1870:2: rule__RuleDeclaration__Group__2__Impl rule__RuleDeclaration__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__RuleDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1877:1: rule__RuleDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__RuleDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1881:1: ( ( '{' ) )
            // InternalAedit.g:1882:1: ( '{' )
            {
            // InternalAedit.g:1882:1: ( '{' )
            // InternalAedit.g:1883:2: '{'
            {
             before(grammarAccess.getRuleDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalAedit.g:1892:1: rule__RuleDeclaration__Group__3 : rule__RuleDeclaration__Group__3__Impl rule__RuleDeclaration__Group__4 ;
    public final void rule__RuleDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1896:1: ( rule__RuleDeclaration__Group__3__Impl rule__RuleDeclaration__Group__4 )
            // InternalAedit.g:1897:2: rule__RuleDeclaration__Group__3__Impl rule__RuleDeclaration__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__RuleDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1904:1: rule__RuleDeclaration__Group__3__Impl : ( ( rule__RuleDeclaration__RulesAssignment_3 )* ) ;
    public final void rule__RuleDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1908:1: ( ( ( rule__RuleDeclaration__RulesAssignment_3 )* ) )
            // InternalAedit.g:1909:1: ( ( rule__RuleDeclaration__RulesAssignment_3 )* )
            {
            // InternalAedit.g:1909:1: ( ( rule__RuleDeclaration__RulesAssignment_3 )* )
            // InternalAedit.g:1910:2: ( rule__RuleDeclaration__RulesAssignment_3 )*
            {
             before(grammarAccess.getRuleDeclarationAccess().getRulesAssignment_3()); 
            // InternalAedit.g:1911:2: ( rule__RuleDeclaration__RulesAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=30 && LA18_0<=31)||(LA18_0>=36 && LA18_0<=37)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAedit.g:1911:3: rule__RuleDeclaration__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__RuleDeclaration__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getRuleDeclarationAccess().getRulesAssignment_3()); 

            }


            }

        }
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
    // InternalAedit.g:1919:1: rule__RuleDeclaration__Group__4 : rule__RuleDeclaration__Group__4__Impl ;
    public final void rule__RuleDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1923:1: ( rule__RuleDeclaration__Group__4__Impl )
            // InternalAedit.g:1924:2: rule__RuleDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1930:1: rule__RuleDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__RuleDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1934:1: ( ( '}' ) )
            // InternalAedit.g:1935:1: ( '}' )
            {
            // InternalAedit.g:1935:1: ( '}' )
            // InternalAedit.g:1936:2: '}'
            {
             before(grammarAccess.getRuleDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleDeclarationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ChangeSchema__Group__0"
    // InternalAedit.g:1946:1: rule__ChangeSchema__Group__0 : rule__ChangeSchema__Group__0__Impl rule__ChangeSchema__Group__1 ;
    public final void rule__ChangeSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1950:1: ( rule__ChangeSchema__Group__0__Impl rule__ChangeSchema__Group__1 )
            // InternalAedit.g:1951:2: rule__ChangeSchema__Group__0__Impl rule__ChangeSchema__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ChangeSchema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeSchema__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1958:1: rule__ChangeSchema__Group__0__Impl : ( 'change' ) ;
    public final void rule__ChangeSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1962:1: ( ( 'change' ) )
            // InternalAedit.g:1963:1: ( 'change' )
            {
            // InternalAedit.g:1963:1: ( 'change' )
            // InternalAedit.g:1964:2: 'change'
            {
             before(grammarAccess.getChangeSchemaAccess().getChangeKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getChangeSchemaAccess().getChangeKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:1973:1: rule__ChangeSchema__Group__1 : rule__ChangeSchema__Group__1__Impl rule__ChangeSchema__Group__2 ;
    public final void rule__ChangeSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1977:1: ( rule__ChangeSchema__Group__1__Impl rule__ChangeSchema__Group__2 )
            // InternalAedit.g:1978:2: rule__ChangeSchema__Group__1__Impl rule__ChangeSchema__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ChangeSchema__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeSchema__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:1985:1: rule__ChangeSchema__Group__1__Impl : ( ( rule__ChangeSchema__Alternatives_1 ) ) ;
    public final void rule__ChangeSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1989:1: ( ( ( rule__ChangeSchema__Alternatives_1 ) ) )
            // InternalAedit.g:1990:1: ( ( rule__ChangeSchema__Alternatives_1 ) )
            {
            // InternalAedit.g:1990:1: ( ( rule__ChangeSchema__Alternatives_1 ) )
            // InternalAedit.g:1991:2: ( rule__ChangeSchema__Alternatives_1 )
            {
             before(grammarAccess.getChangeSchemaAccess().getAlternatives_1()); 
            // InternalAedit.g:1992:2: ( rule__ChangeSchema__Alternatives_1 )
            // InternalAedit.g:1992:3: rule__ChangeSchema__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ChangeSchema__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getChangeSchemaAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalAedit.g:2000:1: rule__ChangeSchema__Group__2 : rule__ChangeSchema__Group__2__Impl rule__ChangeSchema__Group__3 ;
    public final void rule__ChangeSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2004:1: ( rule__ChangeSchema__Group__2__Impl rule__ChangeSchema__Group__3 )
            // InternalAedit.g:2005:2: rule__ChangeSchema__Group__2__Impl rule__ChangeSchema__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ChangeSchema__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeSchema__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2012:1: rule__ChangeSchema__Group__2__Impl : ( ( rule__ChangeSchema__SchemaAssignment_2 ) ) ;
    public final void rule__ChangeSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2016:1: ( ( ( rule__ChangeSchema__SchemaAssignment_2 ) ) )
            // InternalAedit.g:2017:1: ( ( rule__ChangeSchema__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:2017:1: ( ( rule__ChangeSchema__SchemaAssignment_2 ) )
            // InternalAedit.g:2018:2: ( rule__ChangeSchema__SchemaAssignment_2 )
            {
             before(grammarAccess.getChangeSchemaAccess().getSchemaAssignment_2()); 
            // InternalAedit.g:2019:2: ( rule__ChangeSchema__SchemaAssignment_2 )
            // InternalAedit.g:2019:3: rule__ChangeSchema__SchemaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ChangeSchema__SchemaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChangeSchemaAccess().getSchemaAssignment_2()); 

            }


            }

        }
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
    // InternalAedit.g:2027:1: rule__ChangeSchema__Group__3 : rule__ChangeSchema__Group__3__Impl rule__ChangeSchema__Group__4 ;
    public final void rule__ChangeSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2031:1: ( rule__ChangeSchema__Group__3__Impl rule__ChangeSchema__Group__4 )
            // InternalAedit.g:2032:2: rule__ChangeSchema__Group__3__Impl rule__ChangeSchema__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ChangeSchema__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeSchema__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2039:1: rule__ChangeSchema__Group__3__Impl : ( '{' ) ;
    public final void rule__ChangeSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2043:1: ( ( '{' ) )
            // InternalAedit.g:2044:1: ( '{' )
            {
            // InternalAedit.g:2044:1: ( '{' )
            // InternalAedit.g:2045:2: '{'
            {
             before(grammarAccess.getChangeSchemaAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getChangeSchemaAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalAedit.g:2054:1: rule__ChangeSchema__Group__4 : rule__ChangeSchema__Group__4__Impl rule__ChangeSchema__Group__5 ;
    public final void rule__ChangeSchema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2058:1: ( rule__ChangeSchema__Group__4__Impl rule__ChangeSchema__Group__5 )
            // InternalAedit.g:2059:2: rule__ChangeSchema__Group__4__Impl rule__ChangeSchema__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__ChangeSchema__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeSchema__Group__5();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2066:1: rule__ChangeSchema__Group__4__Impl : ( ( rule__ChangeSchema__RulesAssignment_4 )* ) ;
    public final void rule__ChangeSchema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2070:1: ( ( ( rule__ChangeSchema__RulesAssignment_4 )* ) )
            // InternalAedit.g:2071:1: ( ( rule__ChangeSchema__RulesAssignment_4 )* )
            {
            // InternalAedit.g:2071:1: ( ( rule__ChangeSchema__RulesAssignment_4 )* )
            // InternalAedit.g:2072:2: ( rule__ChangeSchema__RulesAssignment_4 )*
            {
             before(grammarAccess.getChangeSchemaAccess().getRulesAssignment_4()); 
            // InternalAedit.g:2073:2: ( rule__ChangeSchema__RulesAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31||(LA19_0>=36 && LA19_0<=37)||(LA19_0>=39 && LA19_0<=40)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAedit.g:2073:3: rule__ChangeSchema__RulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ChangeSchema__RulesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getChangeSchemaAccess().getRulesAssignment_4()); 

            }


            }

        }
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
    // InternalAedit.g:2081:1: rule__ChangeSchema__Group__5 : rule__ChangeSchema__Group__5__Impl ;
    public final void rule__ChangeSchema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2085:1: ( rule__ChangeSchema__Group__5__Impl )
            // InternalAedit.g:2086:2: rule__ChangeSchema__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeSchema__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2092:1: rule__ChangeSchema__Group__5__Impl : ( '}' ) ;
    public final void rule__ChangeSchema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2096:1: ( ( '}' ) )
            // InternalAedit.g:2097:1: ( '}' )
            {
            // InternalAedit.g:2097:1: ( '}' )
            // InternalAedit.g:2098:2: '}'
            {
             before(grammarAccess.getChangeSchemaAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getChangeSchemaAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalAedit.g:2108:1: rule__ChangeEnum__Group__0 : rule__ChangeEnum__Group__0__Impl rule__ChangeEnum__Group__1 ;
    public final void rule__ChangeEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2112:1: ( rule__ChangeEnum__Group__0__Impl rule__ChangeEnum__Group__1 )
            // InternalAedit.g:2113:2: rule__ChangeEnum__Group__0__Impl rule__ChangeEnum__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ChangeEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeEnum__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2120:1: rule__ChangeEnum__Group__0__Impl : ( 'change' ) ;
    public final void rule__ChangeEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2124:1: ( ( 'change' ) )
            // InternalAedit.g:2125:1: ( 'change' )
            {
            // InternalAedit.g:2125:1: ( 'change' )
            // InternalAedit.g:2126:2: 'change'
            {
             before(grammarAccess.getChangeEnumAccess().getChangeKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getChangeEnumAccess().getChangeKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:2135:1: rule__ChangeEnum__Group__1 : rule__ChangeEnum__Group__1__Impl rule__ChangeEnum__Group__2 ;
    public final void rule__ChangeEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2139:1: ( rule__ChangeEnum__Group__1__Impl rule__ChangeEnum__Group__2 )
            // InternalAedit.g:2140:2: rule__ChangeEnum__Group__1__Impl rule__ChangeEnum__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ChangeEnum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeEnum__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2147:1: rule__ChangeEnum__Group__1__Impl : ( 'enum' ) ;
    public final void rule__ChangeEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2151:1: ( ( 'enum' ) )
            // InternalAedit.g:2152:1: ( 'enum' )
            {
            // InternalAedit.g:2152:1: ( 'enum' )
            // InternalAedit.g:2153:2: 'enum'
            {
             before(grammarAccess.getChangeEnumAccess().getEnumKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChangeEnumAccess().getEnumKeyword_1()); 

            }


            }

        }
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
    // InternalAedit.g:2162:1: rule__ChangeEnum__Group__2 : rule__ChangeEnum__Group__2__Impl rule__ChangeEnum__Group__3 ;
    public final void rule__ChangeEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2166:1: ( rule__ChangeEnum__Group__2__Impl rule__ChangeEnum__Group__3 )
            // InternalAedit.g:2167:2: rule__ChangeEnum__Group__2__Impl rule__ChangeEnum__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ChangeEnum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeEnum__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2174:1: rule__ChangeEnum__Group__2__Impl : ( ( rule__ChangeEnum__SchemaAssignment_2 ) ) ;
    public final void rule__ChangeEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2178:1: ( ( ( rule__ChangeEnum__SchemaAssignment_2 ) ) )
            // InternalAedit.g:2179:1: ( ( rule__ChangeEnum__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:2179:1: ( ( rule__ChangeEnum__SchemaAssignment_2 ) )
            // InternalAedit.g:2180:2: ( rule__ChangeEnum__SchemaAssignment_2 )
            {
             before(grammarAccess.getChangeEnumAccess().getSchemaAssignment_2()); 
            // InternalAedit.g:2181:2: ( rule__ChangeEnum__SchemaAssignment_2 )
            // InternalAedit.g:2181:3: rule__ChangeEnum__SchemaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ChangeEnum__SchemaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChangeEnumAccess().getSchemaAssignment_2()); 

            }


            }

        }
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
    // InternalAedit.g:2189:1: rule__ChangeEnum__Group__3 : rule__ChangeEnum__Group__3__Impl rule__ChangeEnum__Group__4 ;
    public final void rule__ChangeEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2193:1: ( rule__ChangeEnum__Group__3__Impl rule__ChangeEnum__Group__4 )
            // InternalAedit.g:2194:2: rule__ChangeEnum__Group__3__Impl rule__ChangeEnum__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ChangeEnum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeEnum__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2201:1: rule__ChangeEnum__Group__3__Impl : ( '{' ) ;
    public final void rule__ChangeEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2205:1: ( ( '{' ) )
            // InternalAedit.g:2206:1: ( '{' )
            {
            // InternalAedit.g:2206:1: ( '{' )
            // InternalAedit.g:2207:2: '{'
            {
             before(grammarAccess.getChangeEnumAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getChangeEnumAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalAedit.g:2216:1: rule__ChangeEnum__Group__4 : rule__ChangeEnum__Group__4__Impl rule__ChangeEnum__Group__5 ;
    public final void rule__ChangeEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2220:1: ( rule__ChangeEnum__Group__4__Impl rule__ChangeEnum__Group__5 )
            // InternalAedit.g:2221:2: rule__ChangeEnum__Group__4__Impl rule__ChangeEnum__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__ChangeEnum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeEnum__Group__5();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2228:1: rule__ChangeEnum__Group__4__Impl : ( ( rule__ChangeEnum__RulesAssignment_4 )* ) ;
    public final void rule__ChangeEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2232:1: ( ( ( rule__ChangeEnum__RulesAssignment_4 )* ) )
            // InternalAedit.g:2233:1: ( ( rule__ChangeEnum__RulesAssignment_4 )* )
            {
            // InternalAedit.g:2233:1: ( ( rule__ChangeEnum__RulesAssignment_4 )* )
            // InternalAedit.g:2234:2: ( rule__ChangeEnum__RulesAssignment_4 )*
            {
             before(grammarAccess.getChangeEnumAccess().getRulesAssignment_4()); 
            // InternalAedit.g:2235:2: ( rule__ChangeEnum__RulesAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31||(LA20_0>=36 && LA20_0<=37)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAedit.g:2235:3: rule__ChangeEnum__RulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ChangeEnum__RulesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getChangeEnumAccess().getRulesAssignment_4()); 

            }


            }

        }
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
    // InternalAedit.g:2243:1: rule__ChangeEnum__Group__5 : rule__ChangeEnum__Group__5__Impl ;
    public final void rule__ChangeEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2247:1: ( rule__ChangeEnum__Group__5__Impl )
            // InternalAedit.g:2248:2: rule__ChangeEnum__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeEnum__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2254:1: rule__ChangeEnum__Group__5__Impl : ( '}' ) ;
    public final void rule__ChangeEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2258:1: ( ( '}' ) )
            // InternalAedit.g:2259:1: ( '}' )
            {
            // InternalAedit.g:2259:1: ( '}' )
            // InternalAedit.g:2260:2: '}'
            {
             before(grammarAccess.getChangeEnumAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getChangeEnumAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalAedit.g:2270:1: rule__AddRecord__Group__0 : rule__AddRecord__Group__0__Impl rule__AddRecord__Group__1 ;
    public final void rule__AddRecord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2274:1: ( rule__AddRecord__Group__0__Impl rule__AddRecord__Group__1 )
            // InternalAedit.g:2275:2: rule__AddRecord__Group__0__Impl rule__AddRecord__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__AddRecord__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2282:1: rule__AddRecord__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddRecord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2286:1: ( ( 'add.at' ) )
            // InternalAedit.g:2287:1: ( 'add.at' )
            {
            // InternalAedit.g:2287:1: ( 'add.at' )
            // InternalAedit.g:2288:2: 'add.at'
            {
             before(grammarAccess.getAddRecordAccess().getAddAtKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAddRecordAccess().getAddAtKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:2297:1: rule__AddRecord__Group__1 : rule__AddRecord__Group__1__Impl rule__AddRecord__Group__2 ;
    public final void rule__AddRecord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2301:1: ( rule__AddRecord__Group__1__Impl rule__AddRecord__Group__2 )
            // InternalAedit.g:2302:2: rule__AddRecord__Group__1__Impl rule__AddRecord__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__AddRecord__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2309:1: rule__AddRecord__Group__1__Impl : ( '(' ) ;
    public final void rule__AddRecord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2313:1: ( ( '(' ) )
            // InternalAedit.g:2314:1: ( '(' )
            {
            // InternalAedit.g:2314:1: ( '(' )
            // InternalAedit.g:2315:2: '('
            {
             before(grammarAccess.getAddRecordAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAddRecordAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalAedit.g:2324:1: rule__AddRecord__Group__2 : rule__AddRecord__Group__2__Impl rule__AddRecord__Group__3 ;
    public final void rule__AddRecord__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2328:1: ( rule__AddRecord__Group__2__Impl rule__AddRecord__Group__3 )
            // InternalAedit.g:2329:2: rule__AddRecord__Group__2__Impl rule__AddRecord__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__AddRecord__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2336:1: rule__AddRecord__Group__2__Impl : ( ( rule__AddRecord__IndexAssignment_2 ) ) ;
    public final void rule__AddRecord__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2340:1: ( ( ( rule__AddRecord__IndexAssignment_2 ) ) )
            // InternalAedit.g:2341:1: ( ( rule__AddRecord__IndexAssignment_2 ) )
            {
            // InternalAedit.g:2341:1: ( ( rule__AddRecord__IndexAssignment_2 ) )
            // InternalAedit.g:2342:2: ( rule__AddRecord__IndexAssignment_2 )
            {
             before(grammarAccess.getAddRecordAccess().getIndexAssignment_2()); 
            // InternalAedit.g:2343:2: ( rule__AddRecord__IndexAssignment_2 )
            // InternalAedit.g:2343:3: rule__AddRecord__IndexAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddRecord__IndexAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddRecordAccess().getIndexAssignment_2()); 

            }


            }

        }
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
    // InternalAedit.g:2351:1: rule__AddRecord__Group__3 : rule__AddRecord__Group__3__Impl rule__AddRecord__Group__4 ;
    public final void rule__AddRecord__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2355:1: ( rule__AddRecord__Group__3__Impl rule__AddRecord__Group__4 )
            // InternalAedit.g:2356:2: rule__AddRecord__Group__3__Impl rule__AddRecord__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__AddRecord__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2363:1: rule__AddRecord__Group__3__Impl : ( ')' ) ;
    public final void rule__AddRecord__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2367:1: ( ( ')' ) )
            // InternalAedit.g:2368:1: ( ')' )
            {
            // InternalAedit.g:2368:1: ( ')' )
            // InternalAedit.g:2369:2: ')'
            {
             before(grammarAccess.getAddRecordAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAddRecordAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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
    // InternalAedit.g:2378:1: rule__AddRecord__Group__4 : rule__AddRecord__Group__4__Impl rule__AddRecord__Group__5 ;
    public final void rule__AddRecord__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2382:1: ( rule__AddRecord__Group__4__Impl rule__AddRecord__Group__5 )
            // InternalAedit.g:2383:2: rule__AddRecord__Group__4__Impl rule__AddRecord__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__AddRecord__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__5();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2390:1: rule__AddRecord__Group__4__Impl : ( 'record' ) ;
    public final void rule__AddRecord__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2394:1: ( ( 'record' ) )
            // InternalAedit.g:2395:1: ( 'record' )
            {
            // InternalAedit.g:2395:1: ( 'record' )
            // InternalAedit.g:2396:2: 'record'
            {
             before(grammarAccess.getAddRecordAccess().getRecordKeyword_4()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAddRecordAccess().getRecordKeyword_4()); 

            }


            }

        }
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
    // InternalAedit.g:2405:1: rule__AddRecord__Group__5 : rule__AddRecord__Group__5__Impl rule__AddRecord__Group__6 ;
    public final void rule__AddRecord__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2409:1: ( rule__AddRecord__Group__5__Impl rule__AddRecord__Group__6 )
            // InternalAedit.g:2410:2: rule__AddRecord__Group__5__Impl rule__AddRecord__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__AddRecord__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__6();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2417:1: rule__AddRecord__Group__5__Impl : ( ( rule__AddRecord__NamespaceAssignment_5 ) ) ;
    public final void rule__AddRecord__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2421:1: ( ( ( rule__AddRecord__NamespaceAssignment_5 ) ) )
            // InternalAedit.g:2422:1: ( ( rule__AddRecord__NamespaceAssignment_5 ) )
            {
            // InternalAedit.g:2422:1: ( ( rule__AddRecord__NamespaceAssignment_5 ) )
            // InternalAedit.g:2423:2: ( rule__AddRecord__NamespaceAssignment_5 )
            {
             before(grammarAccess.getAddRecordAccess().getNamespaceAssignment_5()); 
            // InternalAedit.g:2424:2: ( rule__AddRecord__NamespaceAssignment_5 )
            // InternalAedit.g:2424:3: rule__AddRecord__NamespaceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AddRecord__NamespaceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAddRecordAccess().getNamespaceAssignment_5()); 

            }


            }

        }
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
    // InternalAedit.g:2432:1: rule__AddRecord__Group__6 : rule__AddRecord__Group__6__Impl rule__AddRecord__Group__7 ;
    public final void rule__AddRecord__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2436:1: ( rule__AddRecord__Group__6__Impl rule__AddRecord__Group__7 )
            // InternalAedit.g:2437:2: rule__AddRecord__Group__6__Impl rule__AddRecord__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__AddRecord__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__7();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2444:1: rule__AddRecord__Group__6__Impl : ( '.' ) ;
    public final void rule__AddRecord__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2448:1: ( ( '.' ) )
            // InternalAedit.g:2449:1: ( '.' )
            {
            // InternalAedit.g:2449:1: ( '.' )
            // InternalAedit.g:2450:2: '.'
            {
             before(grammarAccess.getAddRecordAccess().getFullStopKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAddRecordAccess().getFullStopKeyword_6()); 

            }


            }

        }
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
    // InternalAedit.g:2459:1: rule__AddRecord__Group__7 : rule__AddRecord__Group__7__Impl rule__AddRecord__Group__8 ;
    public final void rule__AddRecord__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2463:1: ( rule__AddRecord__Group__7__Impl rule__AddRecord__Group__8 )
            // InternalAedit.g:2464:2: rule__AddRecord__Group__7__Impl rule__AddRecord__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__AddRecord__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__8();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2471:1: rule__AddRecord__Group__7__Impl : ( ( rule__AddRecord__RecordNameAssignment_7 ) ) ;
    public final void rule__AddRecord__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2475:1: ( ( ( rule__AddRecord__RecordNameAssignment_7 ) ) )
            // InternalAedit.g:2476:1: ( ( rule__AddRecord__RecordNameAssignment_7 ) )
            {
            // InternalAedit.g:2476:1: ( ( rule__AddRecord__RecordNameAssignment_7 ) )
            // InternalAedit.g:2477:2: ( rule__AddRecord__RecordNameAssignment_7 )
            {
             before(grammarAccess.getAddRecordAccess().getRecordNameAssignment_7()); 
            // InternalAedit.g:2478:2: ( rule__AddRecord__RecordNameAssignment_7 )
            // InternalAedit.g:2478:3: rule__AddRecord__RecordNameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__AddRecord__RecordNameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAddRecordAccess().getRecordNameAssignment_7()); 

            }


            }

        }
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
    // InternalAedit.g:2486:1: rule__AddRecord__Group__8 : rule__AddRecord__Group__8__Impl rule__AddRecord__Group__9 ;
    public final void rule__AddRecord__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2490:1: ( rule__AddRecord__Group__8__Impl rule__AddRecord__Group__9 )
            // InternalAedit.g:2491:2: rule__AddRecord__Group__8__Impl rule__AddRecord__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__AddRecord__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__9();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2498:1: rule__AddRecord__Group__8__Impl : ( '{' ) ;
    public final void rule__AddRecord__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2502:1: ( ( '{' ) )
            // InternalAedit.g:2503:1: ( '{' )
            {
            // InternalAedit.g:2503:1: ( '{' )
            // InternalAedit.g:2504:2: '{'
            {
             before(grammarAccess.getAddRecordAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAddRecordAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
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
    // InternalAedit.g:2513:1: rule__AddRecord__Group__9 : rule__AddRecord__Group__9__Impl rule__AddRecord__Group__10 ;
    public final void rule__AddRecord__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2517:1: ( rule__AddRecord__Group__9__Impl rule__AddRecord__Group__10 )
            // InternalAedit.g:2518:2: rule__AddRecord__Group__9__Impl rule__AddRecord__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__AddRecord__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__10();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2525:1: rule__AddRecord__Group__9__Impl : ( ( rule__AddRecord__FieldsAssignment_9 )* ) ;
    public final void rule__AddRecord__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2529:1: ( ( ( rule__AddRecord__FieldsAssignment_9 )* ) )
            // InternalAedit.g:2530:1: ( ( rule__AddRecord__FieldsAssignment_9 )* )
            {
            // InternalAedit.g:2530:1: ( ( rule__AddRecord__FieldsAssignment_9 )* )
            // InternalAedit.g:2531:2: ( rule__AddRecord__FieldsAssignment_9 )*
            {
             before(grammarAccess.getAddRecordAccess().getFieldsAssignment_9()); 
            // InternalAedit.g:2532:2: ( rule__AddRecord__FieldsAssignment_9 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=16 && LA21_0<=21)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAedit.g:2532:3: rule__AddRecord__FieldsAssignment_9
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__AddRecord__FieldsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getAddRecordAccess().getFieldsAssignment_9()); 

            }


            }

        }
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
    // InternalAedit.g:2540:1: rule__AddRecord__Group__10 : rule__AddRecord__Group__10__Impl ;
    public final void rule__AddRecord__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2544:1: ( rule__AddRecord__Group__10__Impl )
            // InternalAedit.g:2545:2: rule__AddRecord__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddRecord__Group__10__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2551:1: rule__AddRecord__Group__10__Impl : ( '}' ) ;
    public final void rule__AddRecord__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2555:1: ( ( '}' ) )
            // InternalAedit.g:2556:1: ( '}' )
            {
            // InternalAedit.g:2556:1: ( '}' )
            // InternalAedit.g:2557:2: '}'
            {
             before(grammarAccess.getAddRecordAccess().getRightCurlyBracketKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAddRecordAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__AddEnumeration__Group__0"
    // InternalAedit.g:2567:1: rule__AddEnumeration__Group__0 : rule__AddEnumeration__Group__0__Impl rule__AddEnumeration__Group__1 ;
    public final void rule__AddEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2571:1: ( rule__AddEnumeration__Group__0__Impl rule__AddEnumeration__Group__1 )
            // InternalAedit.g:2572:2: rule__AddEnumeration__Group__0__Impl rule__AddEnumeration__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__AddEnumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2579:1: rule__AddEnumeration__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2583:1: ( ( 'add.at' ) )
            // InternalAedit.g:2584:1: ( 'add.at' )
            {
            // InternalAedit.g:2584:1: ( 'add.at' )
            // InternalAedit.g:2585:2: 'add.at'
            {
             before(grammarAccess.getAddEnumerationAccess().getAddAtKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAddEnumerationAccess().getAddAtKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:2594:1: rule__AddEnumeration__Group__1 : rule__AddEnumeration__Group__1__Impl rule__AddEnumeration__Group__2 ;
    public final void rule__AddEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2598:1: ( rule__AddEnumeration__Group__1__Impl rule__AddEnumeration__Group__2 )
            // InternalAedit.g:2599:2: rule__AddEnumeration__Group__1__Impl rule__AddEnumeration__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__AddEnumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2606:1: rule__AddEnumeration__Group__1__Impl : ( '(' ) ;
    public final void rule__AddEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2610:1: ( ( '(' ) )
            // InternalAedit.g:2611:1: ( '(' )
            {
            // InternalAedit.g:2611:1: ( '(' )
            // InternalAedit.g:2612:2: '('
            {
             before(grammarAccess.getAddEnumerationAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAddEnumerationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalAedit.g:2621:1: rule__AddEnumeration__Group__2 : rule__AddEnumeration__Group__2__Impl rule__AddEnumeration__Group__3 ;
    public final void rule__AddEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2625:1: ( rule__AddEnumeration__Group__2__Impl rule__AddEnumeration__Group__3 )
            // InternalAedit.g:2626:2: rule__AddEnumeration__Group__2__Impl rule__AddEnumeration__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__AddEnumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2633:1: rule__AddEnumeration__Group__2__Impl : ( ( rule__AddEnumeration__IndexAssignment_2 ) ) ;
    public final void rule__AddEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2637:1: ( ( ( rule__AddEnumeration__IndexAssignment_2 ) ) )
            // InternalAedit.g:2638:1: ( ( rule__AddEnumeration__IndexAssignment_2 ) )
            {
            // InternalAedit.g:2638:1: ( ( rule__AddEnumeration__IndexAssignment_2 ) )
            // InternalAedit.g:2639:2: ( rule__AddEnumeration__IndexAssignment_2 )
            {
             before(grammarAccess.getAddEnumerationAccess().getIndexAssignment_2()); 
            // InternalAedit.g:2640:2: ( rule__AddEnumeration__IndexAssignment_2 )
            // InternalAedit.g:2640:3: rule__AddEnumeration__IndexAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__IndexAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddEnumerationAccess().getIndexAssignment_2()); 

            }


            }

        }
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
    // InternalAedit.g:2648:1: rule__AddEnumeration__Group__3 : rule__AddEnumeration__Group__3__Impl rule__AddEnumeration__Group__4 ;
    public final void rule__AddEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2652:1: ( rule__AddEnumeration__Group__3__Impl rule__AddEnumeration__Group__4 )
            // InternalAedit.g:2653:2: rule__AddEnumeration__Group__3__Impl rule__AddEnumeration__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__AddEnumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2660:1: rule__AddEnumeration__Group__3__Impl : ( ')' ) ;
    public final void rule__AddEnumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2664:1: ( ( ')' ) )
            // InternalAedit.g:2665:1: ( ')' )
            {
            // InternalAedit.g:2665:1: ( ')' )
            // InternalAedit.g:2666:2: ')'
            {
             before(grammarAccess.getAddEnumerationAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAddEnumerationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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
    // InternalAedit.g:2675:1: rule__AddEnumeration__Group__4 : rule__AddEnumeration__Group__4__Impl rule__AddEnumeration__Group__5 ;
    public final void rule__AddEnumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2679:1: ( rule__AddEnumeration__Group__4__Impl rule__AddEnumeration__Group__5 )
            // InternalAedit.g:2680:2: rule__AddEnumeration__Group__4__Impl rule__AddEnumeration__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__AddEnumeration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__5();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2687:1: rule__AddEnumeration__Group__4__Impl : ( 'enum' ) ;
    public final void rule__AddEnumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2691:1: ( ( 'enum' ) )
            // InternalAedit.g:2692:1: ( 'enum' )
            {
            // InternalAedit.g:2692:1: ( 'enum' )
            // InternalAedit.g:2693:2: 'enum'
            {
             before(grammarAccess.getAddEnumerationAccess().getEnumKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAddEnumerationAccess().getEnumKeyword_4()); 

            }


            }

        }
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
    // InternalAedit.g:2702:1: rule__AddEnumeration__Group__5 : rule__AddEnumeration__Group__5__Impl rule__AddEnumeration__Group__6 ;
    public final void rule__AddEnumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2706:1: ( rule__AddEnumeration__Group__5__Impl rule__AddEnumeration__Group__6 )
            // InternalAedit.g:2707:2: rule__AddEnumeration__Group__5__Impl rule__AddEnumeration__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__AddEnumeration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__6();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2714:1: rule__AddEnumeration__Group__5__Impl : ( ( rule__AddEnumeration__NamespaceAssignment_5 ) ) ;
    public final void rule__AddEnumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2718:1: ( ( ( rule__AddEnumeration__NamespaceAssignment_5 ) ) )
            // InternalAedit.g:2719:1: ( ( rule__AddEnumeration__NamespaceAssignment_5 ) )
            {
            // InternalAedit.g:2719:1: ( ( rule__AddEnumeration__NamespaceAssignment_5 ) )
            // InternalAedit.g:2720:2: ( rule__AddEnumeration__NamespaceAssignment_5 )
            {
             before(grammarAccess.getAddEnumerationAccess().getNamespaceAssignment_5()); 
            // InternalAedit.g:2721:2: ( rule__AddEnumeration__NamespaceAssignment_5 )
            // InternalAedit.g:2721:3: rule__AddEnumeration__NamespaceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__NamespaceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAddEnumerationAccess().getNamespaceAssignment_5()); 

            }


            }

        }
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
    // InternalAedit.g:2729:1: rule__AddEnumeration__Group__6 : rule__AddEnumeration__Group__6__Impl rule__AddEnumeration__Group__7 ;
    public final void rule__AddEnumeration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2733:1: ( rule__AddEnumeration__Group__6__Impl rule__AddEnumeration__Group__7 )
            // InternalAedit.g:2734:2: rule__AddEnumeration__Group__6__Impl rule__AddEnumeration__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__AddEnumeration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__7();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2741:1: rule__AddEnumeration__Group__6__Impl : ( '.' ) ;
    public final void rule__AddEnumeration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2745:1: ( ( '.' ) )
            // InternalAedit.g:2746:1: ( '.' )
            {
            // InternalAedit.g:2746:1: ( '.' )
            // InternalAedit.g:2747:2: '.'
            {
             before(grammarAccess.getAddEnumerationAccess().getFullStopKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAddEnumerationAccess().getFullStopKeyword_6()); 

            }


            }

        }
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
    // InternalAedit.g:2756:1: rule__AddEnumeration__Group__7 : rule__AddEnumeration__Group__7__Impl rule__AddEnumeration__Group__8 ;
    public final void rule__AddEnumeration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2760:1: ( rule__AddEnumeration__Group__7__Impl rule__AddEnumeration__Group__8 )
            // InternalAedit.g:2761:2: rule__AddEnumeration__Group__7__Impl rule__AddEnumeration__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__AddEnumeration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__8();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2768:1: rule__AddEnumeration__Group__7__Impl : ( ( rule__AddEnumeration__EnumNameAssignment_7 ) ) ;
    public final void rule__AddEnumeration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2772:1: ( ( ( rule__AddEnumeration__EnumNameAssignment_7 ) ) )
            // InternalAedit.g:2773:1: ( ( rule__AddEnumeration__EnumNameAssignment_7 ) )
            {
            // InternalAedit.g:2773:1: ( ( rule__AddEnumeration__EnumNameAssignment_7 ) )
            // InternalAedit.g:2774:2: ( rule__AddEnumeration__EnumNameAssignment_7 )
            {
             before(grammarAccess.getAddEnumerationAccess().getEnumNameAssignment_7()); 
            // InternalAedit.g:2775:2: ( rule__AddEnumeration__EnumNameAssignment_7 )
            // InternalAedit.g:2775:3: rule__AddEnumeration__EnumNameAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__EnumNameAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAddEnumerationAccess().getEnumNameAssignment_7()); 

            }


            }

        }
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
    // InternalAedit.g:2783:1: rule__AddEnumeration__Group__8 : rule__AddEnumeration__Group__8__Impl rule__AddEnumeration__Group__9 ;
    public final void rule__AddEnumeration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2787:1: ( rule__AddEnumeration__Group__8__Impl rule__AddEnumeration__Group__9 )
            // InternalAedit.g:2788:2: rule__AddEnumeration__Group__8__Impl rule__AddEnumeration__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__AddEnumeration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__9();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2795:1: rule__AddEnumeration__Group__8__Impl : ( '{' ) ;
    public final void rule__AddEnumeration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2799:1: ( ( '{' ) )
            // InternalAedit.g:2800:1: ( '{' )
            {
            // InternalAedit.g:2800:1: ( '{' )
            // InternalAedit.g:2801:2: '{'
            {
             before(grammarAccess.getAddEnumerationAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAddEnumerationAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
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
    // InternalAedit.g:2810:1: rule__AddEnumeration__Group__9 : rule__AddEnumeration__Group__9__Impl rule__AddEnumeration__Group__10 ;
    public final void rule__AddEnumeration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2814:1: ( rule__AddEnumeration__Group__9__Impl rule__AddEnumeration__Group__10 )
            // InternalAedit.g:2815:2: rule__AddEnumeration__Group__9__Impl rule__AddEnumeration__Group__10
            {
            pushFollow(FOLLOW_29);
            rule__AddEnumeration__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__10();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2822:1: rule__AddEnumeration__Group__9__Impl : ( ( rule__AddEnumeration__SymbolsAssignment_9 ) ) ;
    public final void rule__AddEnumeration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2826:1: ( ( ( rule__AddEnumeration__SymbolsAssignment_9 ) ) )
            // InternalAedit.g:2827:1: ( ( rule__AddEnumeration__SymbolsAssignment_9 ) )
            {
            // InternalAedit.g:2827:1: ( ( rule__AddEnumeration__SymbolsAssignment_9 ) )
            // InternalAedit.g:2828:2: ( rule__AddEnumeration__SymbolsAssignment_9 )
            {
             before(grammarAccess.getAddEnumerationAccess().getSymbolsAssignment_9()); 
            // InternalAedit.g:2829:2: ( rule__AddEnumeration__SymbolsAssignment_9 )
            // InternalAedit.g:2829:3: rule__AddEnumeration__SymbolsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__SymbolsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAddEnumerationAccess().getSymbolsAssignment_9()); 

            }


            }

        }
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
    // InternalAedit.g:2837:1: rule__AddEnumeration__Group__10 : rule__AddEnumeration__Group__10__Impl rule__AddEnumeration__Group__11 ;
    public final void rule__AddEnumeration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2841:1: ( rule__AddEnumeration__Group__10__Impl rule__AddEnumeration__Group__11 )
            // InternalAedit.g:2842:2: rule__AddEnumeration__Group__10__Impl rule__AddEnumeration__Group__11
            {
            pushFollow(FOLLOW_29);
            rule__AddEnumeration__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__11();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2849:1: rule__AddEnumeration__Group__10__Impl : ( ( rule__AddEnumeration__Group_10__0 )* ) ;
    public final void rule__AddEnumeration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2853:1: ( ( ( rule__AddEnumeration__Group_10__0 )* ) )
            // InternalAedit.g:2854:1: ( ( rule__AddEnumeration__Group_10__0 )* )
            {
            // InternalAedit.g:2854:1: ( ( rule__AddEnumeration__Group_10__0 )* )
            // InternalAedit.g:2855:2: ( rule__AddEnumeration__Group_10__0 )*
            {
             before(grammarAccess.getAddEnumerationAccess().getGroup_10()); 
            // InternalAedit.g:2856:2: ( rule__AddEnumeration__Group_10__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAedit.g:2856:3: rule__AddEnumeration__Group_10__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__AddEnumeration__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAddEnumerationAccess().getGroup_10()); 

            }


            }

        }
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
    // InternalAedit.g:2864:1: rule__AddEnumeration__Group__11 : rule__AddEnumeration__Group__11__Impl ;
    public final void rule__AddEnumeration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2868:1: ( rule__AddEnumeration__Group__11__Impl )
            // InternalAedit.g:2869:2: rule__AddEnumeration__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__11__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2875:1: rule__AddEnumeration__Group__11__Impl : ( '}' ) ;
    public final void rule__AddEnumeration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2879:1: ( ( '}' ) )
            // InternalAedit.g:2880:1: ( '}' )
            {
            // InternalAedit.g:2880:1: ( '}' )
            // InternalAedit.g:2881:2: '}'
            {
             before(grammarAccess.getAddEnumerationAccess().getRightCurlyBracketKeyword_11()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAddEnumerationAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
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
    // InternalAedit.g:2891:1: rule__AddEnumeration__Group_10__0 : rule__AddEnumeration__Group_10__0__Impl rule__AddEnumeration__Group_10__1 ;
    public final void rule__AddEnumeration__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2895:1: ( rule__AddEnumeration__Group_10__0__Impl rule__AddEnumeration__Group_10__1 )
            // InternalAedit.g:2896:2: rule__AddEnumeration__Group_10__0__Impl rule__AddEnumeration__Group_10__1
            {
            pushFollow(FOLLOW_8);
            rule__AddEnumeration__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group_10__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2903:1: rule__AddEnumeration__Group_10__0__Impl : ( ',' ) ;
    public final void rule__AddEnumeration__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2907:1: ( ( ',' ) )
            // InternalAedit.g:2908:1: ( ',' )
            {
            // InternalAedit.g:2908:1: ( ',' )
            // InternalAedit.g:2909:2: ','
            {
             before(grammarAccess.getAddEnumerationAccess().getCommaKeyword_10_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAddEnumerationAccess().getCommaKeyword_10_0()); 

            }


            }

        }
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
    // InternalAedit.g:2918:1: rule__AddEnumeration__Group_10__1 : rule__AddEnumeration__Group_10__1__Impl ;
    public final void rule__AddEnumeration__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2922:1: ( rule__AddEnumeration__Group_10__1__Impl )
            // InternalAedit.g:2923:2: rule__AddEnumeration__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group_10__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2929:1: rule__AddEnumeration__Group_10__1__Impl : ( ( rule__AddEnumeration__SymbolsAssignment_10_1 ) ) ;
    public final void rule__AddEnumeration__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2933:1: ( ( ( rule__AddEnumeration__SymbolsAssignment_10_1 ) ) )
            // InternalAedit.g:2934:1: ( ( rule__AddEnumeration__SymbolsAssignment_10_1 ) )
            {
            // InternalAedit.g:2934:1: ( ( rule__AddEnumeration__SymbolsAssignment_10_1 ) )
            // InternalAedit.g:2935:2: ( rule__AddEnumeration__SymbolsAssignment_10_1 )
            {
             before(grammarAccess.getAddEnumerationAccess().getSymbolsAssignment_10_1()); 
            // InternalAedit.g:2936:2: ( rule__AddEnumeration__SymbolsAssignment_10_1 )
            // InternalAedit.g:2936:3: rule__AddEnumeration__SymbolsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__SymbolsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getAddEnumerationAccess().getSymbolsAssignment_10_1()); 

            }


            }

        }
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
    // InternalAedit.g:2945:1: rule__AddVariable__Group__0 : rule__AddVariable__Group__0__Impl rule__AddVariable__Group__1 ;
    public final void rule__AddVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2949:1: ( rule__AddVariable__Group__0__Impl rule__AddVariable__Group__1 )
            // InternalAedit.g:2950:2: rule__AddVariable__Group__0__Impl rule__AddVariable__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__AddVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddVariable__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2957:1: rule__AddVariable__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2961:1: ( ( 'add.at' ) )
            // InternalAedit.g:2962:1: ( 'add.at' )
            {
            // InternalAedit.g:2962:1: ( 'add.at' )
            // InternalAedit.g:2963:2: 'add.at'
            {
             before(grammarAccess.getAddVariableAccess().getAddAtKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAddVariableAccess().getAddAtKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:2972:1: rule__AddVariable__Group__1 : rule__AddVariable__Group__1__Impl rule__AddVariable__Group__2 ;
    public final void rule__AddVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2976:1: ( rule__AddVariable__Group__1__Impl rule__AddVariable__Group__2 )
            // InternalAedit.g:2977:2: rule__AddVariable__Group__1__Impl rule__AddVariable__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__AddVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddVariable__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:2984:1: rule__AddVariable__Group__1__Impl : ( '(' ) ;
    public final void rule__AddVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2988:1: ( ( '(' ) )
            // InternalAedit.g:2989:1: ( '(' )
            {
            // InternalAedit.g:2989:1: ( '(' )
            // InternalAedit.g:2990:2: '('
            {
             before(grammarAccess.getAddVariableAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAddVariableAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalAedit.g:2999:1: rule__AddVariable__Group__2 : rule__AddVariable__Group__2__Impl rule__AddVariable__Group__3 ;
    public final void rule__AddVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3003:1: ( rule__AddVariable__Group__2__Impl rule__AddVariable__Group__3 )
            // InternalAedit.g:3004:2: rule__AddVariable__Group__2__Impl rule__AddVariable__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__AddVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddVariable__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3011:1: rule__AddVariable__Group__2__Impl : ( ( rule__AddVariable__IndexAssignment_2 ) ) ;
    public final void rule__AddVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3015:1: ( ( ( rule__AddVariable__IndexAssignment_2 ) ) )
            // InternalAedit.g:3016:1: ( ( rule__AddVariable__IndexAssignment_2 ) )
            {
            // InternalAedit.g:3016:1: ( ( rule__AddVariable__IndexAssignment_2 ) )
            // InternalAedit.g:3017:2: ( rule__AddVariable__IndexAssignment_2 )
            {
             before(grammarAccess.getAddVariableAccess().getIndexAssignment_2()); 
            // InternalAedit.g:3018:2: ( rule__AddVariable__IndexAssignment_2 )
            // InternalAedit.g:3018:3: rule__AddVariable__IndexAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddVariable__IndexAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddVariableAccess().getIndexAssignment_2()); 

            }


            }

        }
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
    // InternalAedit.g:3026:1: rule__AddVariable__Group__3 : rule__AddVariable__Group__3__Impl rule__AddVariable__Group__4 ;
    public final void rule__AddVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3030:1: ( rule__AddVariable__Group__3__Impl rule__AddVariable__Group__4 )
            // InternalAedit.g:3031:2: rule__AddVariable__Group__3__Impl rule__AddVariable__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__AddVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddVariable__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3038:1: rule__AddVariable__Group__3__Impl : ( ')' ) ;
    public final void rule__AddVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3042:1: ( ( ')' ) )
            // InternalAedit.g:3043:1: ( ')' )
            {
            // InternalAedit.g:3043:1: ( ')' )
            // InternalAedit.g:3044:2: ')'
            {
             before(grammarAccess.getAddVariableAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAddVariableAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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
    // InternalAedit.g:3053:1: rule__AddVariable__Group__4 : rule__AddVariable__Group__4__Impl rule__AddVariable__Group__5 ;
    public final void rule__AddVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3057:1: ( rule__AddVariable__Group__4__Impl rule__AddVariable__Group__5 )
            // InternalAedit.g:3058:2: rule__AddVariable__Group__4__Impl rule__AddVariable__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__AddVariable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddVariable__Group__5();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3065:1: rule__AddVariable__Group__4__Impl : ( ( rule__AddVariable__NewVarAssignment_4 ) ) ;
    public final void rule__AddVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3069:1: ( ( ( rule__AddVariable__NewVarAssignment_4 ) ) )
            // InternalAedit.g:3070:1: ( ( rule__AddVariable__NewVarAssignment_4 ) )
            {
            // InternalAedit.g:3070:1: ( ( rule__AddVariable__NewVarAssignment_4 ) )
            // InternalAedit.g:3071:2: ( rule__AddVariable__NewVarAssignment_4 )
            {
             before(grammarAccess.getAddVariableAccess().getNewVarAssignment_4()); 
            // InternalAedit.g:3072:2: ( rule__AddVariable__NewVarAssignment_4 )
            // InternalAedit.g:3072:3: rule__AddVariable__NewVarAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AddVariable__NewVarAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAddVariableAccess().getNewVarAssignment_4()); 

            }


            }

        }
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
    // InternalAedit.g:3080:1: rule__AddVariable__Group__5 : rule__AddVariable__Group__5__Impl ;
    public final void rule__AddVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3084:1: ( rule__AddVariable__Group__5__Impl )
            // InternalAedit.g:3085:2: rule__AddVariable__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddVariable__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3091:1: rule__AddVariable__Group__5__Impl : ( ';' ) ;
    public final void rule__AddVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3095:1: ( ( ';' ) )
            // InternalAedit.g:3096:1: ( ';' )
            {
            // InternalAedit.g:3096:1: ( ';' )
            // InternalAedit.g:3097:2: ';'
            {
             before(grammarAccess.getAddVariableAccess().getSemicolonKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAddVariableAccess().getSemicolonKeyword_5()); 

            }


            }

        }
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
    // InternalAedit.g:3107:1: rule__AddEnum__Group__0 : rule__AddEnum__Group__0__Impl rule__AddEnum__Group__1 ;
    public final void rule__AddEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3111:1: ( rule__AddEnum__Group__0__Impl rule__AddEnum__Group__1 )
            // InternalAedit.g:3112:2: rule__AddEnum__Group__0__Impl rule__AddEnum__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__AddEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddEnum__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3119:1: rule__AddEnum__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3123:1: ( ( 'add.at' ) )
            // InternalAedit.g:3124:1: ( 'add.at' )
            {
            // InternalAedit.g:3124:1: ( 'add.at' )
            // InternalAedit.g:3125:2: 'add.at'
            {
             before(grammarAccess.getAddEnumAccess().getAddAtKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAddEnumAccess().getAddAtKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:3134:1: rule__AddEnum__Group__1 : rule__AddEnum__Group__1__Impl rule__AddEnum__Group__2 ;
    public final void rule__AddEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3138:1: ( rule__AddEnum__Group__1__Impl rule__AddEnum__Group__2 )
            // InternalAedit.g:3139:2: rule__AddEnum__Group__1__Impl rule__AddEnum__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__AddEnum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddEnum__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3146:1: rule__AddEnum__Group__1__Impl : ( '(' ) ;
    public final void rule__AddEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3150:1: ( ( '(' ) )
            // InternalAedit.g:3151:1: ( '(' )
            {
            // InternalAedit.g:3151:1: ( '(' )
            // InternalAedit.g:3152:2: '('
            {
             before(grammarAccess.getAddEnumAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAddEnumAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalAedit.g:3161:1: rule__AddEnum__Group__2 : rule__AddEnum__Group__2__Impl rule__AddEnum__Group__3 ;
    public final void rule__AddEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3165:1: ( rule__AddEnum__Group__2__Impl rule__AddEnum__Group__3 )
            // InternalAedit.g:3166:2: rule__AddEnum__Group__2__Impl rule__AddEnum__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__AddEnum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddEnum__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3173:1: rule__AddEnum__Group__2__Impl : ( ( rule__AddEnum__IndexAssignment_2 ) ) ;
    public final void rule__AddEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3177:1: ( ( ( rule__AddEnum__IndexAssignment_2 ) ) )
            // InternalAedit.g:3178:1: ( ( rule__AddEnum__IndexAssignment_2 ) )
            {
            // InternalAedit.g:3178:1: ( ( rule__AddEnum__IndexAssignment_2 ) )
            // InternalAedit.g:3179:2: ( rule__AddEnum__IndexAssignment_2 )
            {
             before(grammarAccess.getAddEnumAccess().getIndexAssignment_2()); 
            // InternalAedit.g:3180:2: ( rule__AddEnum__IndexAssignment_2 )
            // InternalAedit.g:3180:3: rule__AddEnum__IndexAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddEnum__IndexAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddEnumAccess().getIndexAssignment_2()); 

            }


            }

        }
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
    // InternalAedit.g:3188:1: rule__AddEnum__Group__3 : rule__AddEnum__Group__3__Impl rule__AddEnum__Group__4 ;
    public final void rule__AddEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3192:1: ( rule__AddEnum__Group__3__Impl rule__AddEnum__Group__4 )
            // InternalAedit.g:3193:2: rule__AddEnum__Group__3__Impl rule__AddEnum__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__AddEnum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddEnum__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3200:1: rule__AddEnum__Group__3__Impl : ( ')' ) ;
    public final void rule__AddEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3204:1: ( ( ')' ) )
            // InternalAedit.g:3205:1: ( ')' )
            {
            // InternalAedit.g:3205:1: ( ')' )
            // InternalAedit.g:3206:2: ')'
            {
             before(grammarAccess.getAddEnumAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAddEnumAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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
    // InternalAedit.g:3215:1: rule__AddEnum__Group__4 : rule__AddEnum__Group__4__Impl rule__AddEnum__Group__5 ;
    public final void rule__AddEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3219:1: ( rule__AddEnum__Group__4__Impl rule__AddEnum__Group__5 )
            // InternalAedit.g:3220:2: rule__AddEnum__Group__4__Impl rule__AddEnum__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__AddEnum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddEnum__Group__5();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3227:1: rule__AddEnum__Group__4__Impl : ( ( rule__AddEnum__VarNameAssignment_4 ) ) ;
    public final void rule__AddEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3231:1: ( ( ( rule__AddEnum__VarNameAssignment_4 ) ) )
            // InternalAedit.g:3232:1: ( ( rule__AddEnum__VarNameAssignment_4 ) )
            {
            // InternalAedit.g:3232:1: ( ( rule__AddEnum__VarNameAssignment_4 ) )
            // InternalAedit.g:3233:2: ( rule__AddEnum__VarNameAssignment_4 )
            {
             before(grammarAccess.getAddEnumAccess().getVarNameAssignment_4()); 
            // InternalAedit.g:3234:2: ( rule__AddEnum__VarNameAssignment_4 )
            // InternalAedit.g:3234:3: rule__AddEnum__VarNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AddEnum__VarNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAddEnumAccess().getVarNameAssignment_4()); 

            }


            }

        }
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
    // InternalAedit.g:3242:1: rule__AddEnum__Group__5 : rule__AddEnum__Group__5__Impl ;
    public final void rule__AddEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3246:1: ( rule__AddEnum__Group__5__Impl )
            // InternalAedit.g:3247:2: rule__AddEnum__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddEnum__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3253:1: rule__AddEnum__Group__5__Impl : ( ';' ) ;
    public final void rule__AddEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3257:1: ( ( ';' ) )
            // InternalAedit.g:3258:1: ( ';' )
            {
            // InternalAedit.g:3258:1: ( ';' )
            // InternalAedit.g:3259:2: ';'
            {
             before(grammarAccess.getAddEnumAccess().getSemicolonKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAddEnumAccess().getSemicolonKeyword_5()); 

            }


            }

        }
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
    // InternalAedit.g:3269:1: rule__RemoveSchema__Group__0 : rule__RemoveSchema__Group__0__Impl rule__RemoveSchema__Group__1 ;
    public final void rule__RemoveSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3273:1: ( rule__RemoveSchema__Group__0__Impl rule__RemoveSchema__Group__1 )
            // InternalAedit.g:3274:2: rule__RemoveSchema__Group__0__Impl rule__RemoveSchema__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__RemoveSchema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveSchema__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3281:1: rule__RemoveSchema__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3285:1: ( ( 'remove' ) )
            // InternalAedit.g:3286:1: ( 'remove' )
            {
            // InternalAedit.g:3286:1: ( 'remove' )
            // InternalAedit.g:3287:2: 'remove'
            {
             before(grammarAccess.getRemoveSchemaAccess().getRemoveKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRemoveSchemaAccess().getRemoveKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:3296:1: rule__RemoveSchema__Group__1 : rule__RemoveSchema__Group__1__Impl rule__RemoveSchema__Group__2 ;
    public final void rule__RemoveSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3300:1: ( rule__RemoveSchema__Group__1__Impl rule__RemoveSchema__Group__2 )
            // InternalAedit.g:3301:2: rule__RemoveSchema__Group__1__Impl rule__RemoveSchema__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__RemoveSchema__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveSchema__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3308:1: rule__RemoveSchema__Group__1__Impl : ( ( rule__RemoveSchema__SchemaTypeAssignment_1 ) ) ;
    public final void rule__RemoveSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3312:1: ( ( ( rule__RemoveSchema__SchemaTypeAssignment_1 ) ) )
            // InternalAedit.g:3313:1: ( ( rule__RemoveSchema__SchemaTypeAssignment_1 ) )
            {
            // InternalAedit.g:3313:1: ( ( rule__RemoveSchema__SchemaTypeAssignment_1 ) )
            // InternalAedit.g:3314:2: ( rule__RemoveSchema__SchemaTypeAssignment_1 )
            {
             before(grammarAccess.getRemoveSchemaAccess().getSchemaTypeAssignment_1()); 
            // InternalAedit.g:3315:2: ( rule__RemoveSchema__SchemaTypeAssignment_1 )
            // InternalAedit.g:3315:3: rule__RemoveSchema__SchemaTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RemoveSchema__SchemaTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRemoveSchemaAccess().getSchemaTypeAssignment_1()); 

            }


            }

        }
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
    // InternalAedit.g:3323:1: rule__RemoveSchema__Group__2 : rule__RemoveSchema__Group__2__Impl rule__RemoveSchema__Group__3 ;
    public final void rule__RemoveSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3327:1: ( rule__RemoveSchema__Group__2__Impl rule__RemoveSchema__Group__3 )
            // InternalAedit.g:3328:2: rule__RemoveSchema__Group__2__Impl rule__RemoveSchema__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__RemoveSchema__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveSchema__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3335:1: rule__RemoveSchema__Group__2__Impl : ( ( rule__RemoveSchema__SchemaAssignment_2 ) ) ;
    public final void rule__RemoveSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3339:1: ( ( ( rule__RemoveSchema__SchemaAssignment_2 ) ) )
            // InternalAedit.g:3340:1: ( ( rule__RemoveSchema__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:3340:1: ( ( rule__RemoveSchema__SchemaAssignment_2 ) )
            // InternalAedit.g:3341:2: ( rule__RemoveSchema__SchemaAssignment_2 )
            {
             before(grammarAccess.getRemoveSchemaAccess().getSchemaAssignment_2()); 
            // InternalAedit.g:3342:2: ( rule__RemoveSchema__SchemaAssignment_2 )
            // InternalAedit.g:3342:3: rule__RemoveSchema__SchemaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RemoveSchema__SchemaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRemoveSchemaAccess().getSchemaAssignment_2()); 

            }


            }

        }
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
    // InternalAedit.g:3350:1: rule__RemoveSchema__Group__3 : rule__RemoveSchema__Group__3__Impl ;
    public final void rule__RemoveSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3354:1: ( rule__RemoveSchema__Group__3__Impl )
            // InternalAedit.g:3355:2: rule__RemoveSchema__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveSchema__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3361:1: rule__RemoveSchema__Group__3__Impl : ( ';' ) ;
    public final void rule__RemoveSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3365:1: ( ( ';' ) )
            // InternalAedit.g:3366:1: ( ';' )
            {
            // InternalAedit.g:3366:1: ( ';' )
            // InternalAedit.g:3367:2: ';'
            {
             before(grammarAccess.getRemoveSchemaAccess().getSemicolonKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRemoveSchemaAccess().getSemicolonKeyword_3()); 

            }


            }

        }
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
    // InternalAedit.g:3377:1: rule__RemoveVariable__Group__0 : rule__RemoveVariable__Group__0__Impl rule__RemoveVariable__Group__1 ;
    public final void rule__RemoveVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3381:1: ( rule__RemoveVariable__Group__0__Impl rule__RemoveVariable__Group__1 )
            // InternalAedit.g:3382:2: rule__RemoveVariable__Group__0__Impl rule__RemoveVariable__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RemoveVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveVariable__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3389:1: rule__RemoveVariable__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3393:1: ( ( 'remove' ) )
            // InternalAedit.g:3394:1: ( 'remove' )
            {
            // InternalAedit.g:3394:1: ( 'remove' )
            // InternalAedit.g:3395:2: 'remove'
            {
             before(grammarAccess.getRemoveVariableAccess().getRemoveKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRemoveVariableAccess().getRemoveKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:3404:1: rule__RemoveVariable__Group__1 : rule__RemoveVariable__Group__1__Impl rule__RemoveVariable__Group__2 ;
    public final void rule__RemoveVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3408:1: ( rule__RemoveVariable__Group__1__Impl rule__RemoveVariable__Group__2 )
            // InternalAedit.g:3409:2: rule__RemoveVariable__Group__1__Impl rule__RemoveVariable__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__RemoveVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveVariable__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3416:1: rule__RemoveVariable__Group__1__Impl : ( ( rule__RemoveVariable__VariableAssignment_1 ) ) ;
    public final void rule__RemoveVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3420:1: ( ( ( rule__RemoveVariable__VariableAssignment_1 ) ) )
            // InternalAedit.g:3421:1: ( ( rule__RemoveVariable__VariableAssignment_1 ) )
            {
            // InternalAedit.g:3421:1: ( ( rule__RemoveVariable__VariableAssignment_1 ) )
            // InternalAedit.g:3422:2: ( rule__RemoveVariable__VariableAssignment_1 )
            {
             before(grammarAccess.getRemoveVariableAccess().getVariableAssignment_1()); 
            // InternalAedit.g:3423:2: ( rule__RemoveVariable__VariableAssignment_1 )
            // InternalAedit.g:3423:3: rule__RemoveVariable__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RemoveVariable__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRemoveVariableAccess().getVariableAssignment_1()); 

            }


            }

        }
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
    // InternalAedit.g:3431:1: rule__RemoveVariable__Group__2 : rule__RemoveVariable__Group__2__Impl ;
    public final void rule__RemoveVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3435:1: ( rule__RemoveVariable__Group__2__Impl )
            // InternalAedit.g:3436:2: rule__RemoveVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveVariable__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3442:1: rule__RemoveVariable__Group__2__Impl : ( ';' ) ;
    public final void rule__RemoveVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3446:1: ( ( ';' ) )
            // InternalAedit.g:3447:1: ( ';' )
            {
            // InternalAedit.g:3447:1: ( ';' )
            // InternalAedit.g:3448:2: ';'
            {
             before(grammarAccess.getRemoveVariableAccess().getSemicolonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRemoveVariableAccess().getSemicolonKeyword_2()); 

            }


            }

        }
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
    // InternalAedit.g:3458:1: rule__RemoveEnum__Group__0 : rule__RemoveEnum__Group__0__Impl rule__RemoveEnum__Group__1 ;
    public final void rule__RemoveEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3462:1: ( rule__RemoveEnum__Group__0__Impl rule__RemoveEnum__Group__1 )
            // InternalAedit.g:3463:2: rule__RemoveEnum__Group__0__Impl rule__RemoveEnum__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RemoveEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveEnum__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3470:1: rule__RemoveEnum__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3474:1: ( ( 'remove' ) )
            // InternalAedit.g:3475:1: ( 'remove' )
            {
            // InternalAedit.g:3475:1: ( 'remove' )
            // InternalAedit.g:3476:2: 'remove'
            {
             before(grammarAccess.getRemoveEnumAccess().getRemoveKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRemoveEnumAccess().getRemoveKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:3485:1: rule__RemoveEnum__Group__1 : rule__RemoveEnum__Group__1__Impl rule__RemoveEnum__Group__2 ;
    public final void rule__RemoveEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3489:1: ( rule__RemoveEnum__Group__1__Impl rule__RemoveEnum__Group__2 )
            // InternalAedit.g:3490:2: rule__RemoveEnum__Group__1__Impl rule__RemoveEnum__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__RemoveEnum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RemoveEnum__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3497:1: rule__RemoveEnum__Group__1__Impl : ( ( rule__RemoveEnum__VarNameAssignment_1 ) ) ;
    public final void rule__RemoveEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3501:1: ( ( ( rule__RemoveEnum__VarNameAssignment_1 ) ) )
            // InternalAedit.g:3502:1: ( ( rule__RemoveEnum__VarNameAssignment_1 ) )
            {
            // InternalAedit.g:3502:1: ( ( rule__RemoveEnum__VarNameAssignment_1 ) )
            // InternalAedit.g:3503:2: ( rule__RemoveEnum__VarNameAssignment_1 )
            {
             before(grammarAccess.getRemoveEnumAccess().getVarNameAssignment_1()); 
            // InternalAedit.g:3504:2: ( rule__RemoveEnum__VarNameAssignment_1 )
            // InternalAedit.g:3504:3: rule__RemoveEnum__VarNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RemoveEnum__VarNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRemoveEnumAccess().getVarNameAssignment_1()); 

            }


            }

        }
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
    // InternalAedit.g:3512:1: rule__RemoveEnum__Group__2 : rule__RemoveEnum__Group__2__Impl ;
    public final void rule__RemoveEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3516:1: ( rule__RemoveEnum__Group__2__Impl )
            // InternalAedit.g:3517:2: rule__RemoveEnum__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RemoveEnum__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3523:1: rule__RemoveEnum__Group__2__Impl : ( ';' ) ;
    public final void rule__RemoveEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3527:1: ( ( ';' ) )
            // InternalAedit.g:3528:1: ( ';' )
            {
            // InternalAedit.g:3528:1: ( ';' )
            // InternalAedit.g:3529:2: ';'
            {
             before(grammarAccess.getRemoveEnumAccess().getSemicolonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRemoveEnumAccess().getSemicolonKeyword_2()); 

            }


            }

        }
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
    // InternalAedit.g:3539:1: rule__RenameSchema__Group__0 : rule__RenameSchema__Group__0__Impl rule__RenameSchema__Group__1 ;
    public final void rule__RenameSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3543:1: ( rule__RenameSchema__Group__0__Impl rule__RenameSchema__Group__1 )
            // InternalAedit.g:3544:2: rule__RenameSchema__Group__0__Impl rule__RenameSchema__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__RenameSchema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameSchema__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3551:1: rule__RenameSchema__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3555:1: ( ( 'rename' ) )
            // InternalAedit.g:3556:1: ( 'rename' )
            {
            // InternalAedit.g:3556:1: ( 'rename' )
            // InternalAedit.g:3557:2: 'rename'
            {
             before(grammarAccess.getRenameSchemaAccess().getRenameKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRenameSchemaAccess().getRenameKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:3566:1: rule__RenameSchema__Group__1 : rule__RenameSchema__Group__1__Impl rule__RenameSchema__Group__2 ;
    public final void rule__RenameSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3570:1: ( rule__RenameSchema__Group__1__Impl rule__RenameSchema__Group__2 )
            // InternalAedit.g:3571:2: rule__RenameSchema__Group__1__Impl rule__RenameSchema__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__RenameSchema__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameSchema__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3578:1: rule__RenameSchema__Group__1__Impl : ( ( rule__RenameSchema__SchemaTypeAssignment_1 ) ) ;
    public final void rule__RenameSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3582:1: ( ( ( rule__RenameSchema__SchemaTypeAssignment_1 ) ) )
            // InternalAedit.g:3583:1: ( ( rule__RenameSchema__SchemaTypeAssignment_1 ) )
            {
            // InternalAedit.g:3583:1: ( ( rule__RenameSchema__SchemaTypeAssignment_1 ) )
            // InternalAedit.g:3584:2: ( rule__RenameSchema__SchemaTypeAssignment_1 )
            {
             before(grammarAccess.getRenameSchemaAccess().getSchemaTypeAssignment_1()); 
            // InternalAedit.g:3585:2: ( rule__RenameSchema__SchemaTypeAssignment_1 )
            // InternalAedit.g:3585:3: rule__RenameSchema__SchemaTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RenameSchema__SchemaTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRenameSchemaAccess().getSchemaTypeAssignment_1()); 

            }


            }

        }
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
    // InternalAedit.g:3593:1: rule__RenameSchema__Group__2 : rule__RenameSchema__Group__2__Impl rule__RenameSchema__Group__3 ;
    public final void rule__RenameSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3597:1: ( rule__RenameSchema__Group__2__Impl rule__RenameSchema__Group__3 )
            // InternalAedit.g:3598:2: rule__RenameSchema__Group__2__Impl rule__RenameSchema__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__RenameSchema__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameSchema__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3605:1: rule__RenameSchema__Group__2__Impl : ( ( rule__RenameSchema__SchemaAssignment_2 ) ) ;
    public final void rule__RenameSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3609:1: ( ( ( rule__RenameSchema__SchemaAssignment_2 ) ) )
            // InternalAedit.g:3610:1: ( ( rule__RenameSchema__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:3610:1: ( ( rule__RenameSchema__SchemaAssignment_2 ) )
            // InternalAedit.g:3611:2: ( rule__RenameSchema__SchemaAssignment_2 )
            {
             before(grammarAccess.getRenameSchemaAccess().getSchemaAssignment_2()); 
            // InternalAedit.g:3612:2: ( rule__RenameSchema__SchemaAssignment_2 )
            // InternalAedit.g:3612:3: rule__RenameSchema__SchemaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RenameSchema__SchemaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRenameSchemaAccess().getSchemaAssignment_2()); 

            }


            }

        }
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
    // InternalAedit.g:3620:1: rule__RenameSchema__Group__3 : rule__RenameSchema__Group__3__Impl rule__RenameSchema__Group__4 ;
    public final void rule__RenameSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3624:1: ( rule__RenameSchema__Group__3__Impl rule__RenameSchema__Group__4 )
            // InternalAedit.g:3625:2: rule__RenameSchema__Group__3__Impl rule__RenameSchema__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__RenameSchema__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameSchema__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3632:1: rule__RenameSchema__Group__3__Impl : ( '=>' ) ;
    public final void rule__RenameSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3636:1: ( ( '=>' ) )
            // InternalAedit.g:3637:1: ( '=>' )
            {
            // InternalAedit.g:3637:1: ( '=>' )
            // InternalAedit.g:3638:2: '=>'
            {
             before(grammarAccess.getRenameSchemaAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRenameSchemaAccess().getEqualsSignGreaterThanSignKeyword_3()); 

            }


            }

        }
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
    // InternalAedit.g:3647:1: rule__RenameSchema__Group__4 : rule__RenameSchema__Group__4__Impl rule__RenameSchema__Group__5 ;
    public final void rule__RenameSchema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3651:1: ( rule__RenameSchema__Group__4__Impl rule__RenameSchema__Group__5 )
            // InternalAedit.g:3652:2: rule__RenameSchema__Group__4__Impl rule__RenameSchema__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__RenameSchema__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameSchema__Group__5();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3659:1: rule__RenameSchema__Group__4__Impl : ( ( rule__RenameSchema__NewSchNameAssignment_4 ) ) ;
    public final void rule__RenameSchema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3663:1: ( ( ( rule__RenameSchema__NewSchNameAssignment_4 ) ) )
            // InternalAedit.g:3664:1: ( ( rule__RenameSchema__NewSchNameAssignment_4 ) )
            {
            // InternalAedit.g:3664:1: ( ( rule__RenameSchema__NewSchNameAssignment_4 ) )
            // InternalAedit.g:3665:2: ( rule__RenameSchema__NewSchNameAssignment_4 )
            {
             before(grammarAccess.getRenameSchemaAccess().getNewSchNameAssignment_4()); 
            // InternalAedit.g:3666:2: ( rule__RenameSchema__NewSchNameAssignment_4 )
            // InternalAedit.g:3666:3: rule__RenameSchema__NewSchNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RenameSchema__NewSchNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRenameSchemaAccess().getNewSchNameAssignment_4()); 

            }


            }

        }
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
    // InternalAedit.g:3674:1: rule__RenameSchema__Group__5 : rule__RenameSchema__Group__5__Impl ;
    public final void rule__RenameSchema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3678:1: ( rule__RenameSchema__Group__5__Impl )
            // InternalAedit.g:3679:2: rule__RenameSchema__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameSchema__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3685:1: rule__RenameSchema__Group__5__Impl : ( ';' ) ;
    public final void rule__RenameSchema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3689:1: ( ( ';' ) )
            // InternalAedit.g:3690:1: ( ';' )
            {
            // InternalAedit.g:3690:1: ( ';' )
            // InternalAedit.g:3691:2: ';'
            {
             before(grammarAccess.getRenameSchemaAccess().getSemicolonKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRenameSchemaAccess().getSemicolonKeyword_5()); 

            }


            }

        }
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
    // InternalAedit.g:3701:1: rule__RenameVariable__Group__0 : rule__RenameVariable__Group__0__Impl rule__RenameVariable__Group__1 ;
    public final void rule__RenameVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3705:1: ( rule__RenameVariable__Group__0__Impl rule__RenameVariable__Group__1 )
            // InternalAedit.g:3706:2: rule__RenameVariable__Group__0__Impl rule__RenameVariable__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RenameVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameVariable__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3713:1: rule__RenameVariable__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3717:1: ( ( 'rename' ) )
            // InternalAedit.g:3718:1: ( 'rename' )
            {
            // InternalAedit.g:3718:1: ( 'rename' )
            // InternalAedit.g:3719:2: 'rename'
            {
             before(grammarAccess.getRenameVariableAccess().getRenameKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRenameVariableAccess().getRenameKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:3728:1: rule__RenameVariable__Group__1 : rule__RenameVariable__Group__1__Impl rule__RenameVariable__Group__2 ;
    public final void rule__RenameVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3732:1: ( rule__RenameVariable__Group__1__Impl rule__RenameVariable__Group__2 )
            // InternalAedit.g:3733:2: rule__RenameVariable__Group__1__Impl rule__RenameVariable__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__RenameVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameVariable__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3740:1: rule__RenameVariable__Group__1__Impl : ( ( rule__RenameVariable__VariableAssignment_1 ) ) ;
    public final void rule__RenameVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3744:1: ( ( ( rule__RenameVariable__VariableAssignment_1 ) ) )
            // InternalAedit.g:3745:1: ( ( rule__RenameVariable__VariableAssignment_1 ) )
            {
            // InternalAedit.g:3745:1: ( ( rule__RenameVariable__VariableAssignment_1 ) )
            // InternalAedit.g:3746:2: ( rule__RenameVariable__VariableAssignment_1 )
            {
             before(grammarAccess.getRenameVariableAccess().getVariableAssignment_1()); 
            // InternalAedit.g:3747:2: ( rule__RenameVariable__VariableAssignment_1 )
            // InternalAedit.g:3747:3: rule__RenameVariable__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RenameVariable__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRenameVariableAccess().getVariableAssignment_1()); 

            }


            }

        }
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
    // InternalAedit.g:3755:1: rule__RenameVariable__Group__2 : rule__RenameVariable__Group__2__Impl rule__RenameVariable__Group__3 ;
    public final void rule__RenameVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3759:1: ( rule__RenameVariable__Group__2__Impl rule__RenameVariable__Group__3 )
            // InternalAedit.g:3760:2: rule__RenameVariable__Group__2__Impl rule__RenameVariable__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__RenameVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameVariable__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3767:1: rule__RenameVariable__Group__2__Impl : ( '=>' ) ;
    public final void rule__RenameVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3771:1: ( ( '=>' ) )
            // InternalAedit.g:3772:1: ( '=>' )
            {
            // InternalAedit.g:3772:1: ( '=>' )
            // InternalAedit.g:3773:2: '=>'
            {
             before(grammarAccess.getRenameVariableAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRenameVariableAccess().getEqualsSignGreaterThanSignKeyword_2()); 

            }


            }

        }
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
    // InternalAedit.g:3782:1: rule__RenameVariable__Group__3 : rule__RenameVariable__Group__3__Impl rule__RenameVariable__Group__4 ;
    public final void rule__RenameVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3786:1: ( rule__RenameVariable__Group__3__Impl rule__RenameVariable__Group__4 )
            // InternalAedit.g:3787:2: rule__RenameVariable__Group__3__Impl rule__RenameVariable__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__RenameVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameVariable__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3794:1: rule__RenameVariable__Group__3__Impl : ( ( rule__RenameVariable__NewVarNameAssignment_3 ) ) ;
    public final void rule__RenameVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3798:1: ( ( ( rule__RenameVariable__NewVarNameAssignment_3 ) ) )
            // InternalAedit.g:3799:1: ( ( rule__RenameVariable__NewVarNameAssignment_3 ) )
            {
            // InternalAedit.g:3799:1: ( ( rule__RenameVariable__NewVarNameAssignment_3 ) )
            // InternalAedit.g:3800:2: ( rule__RenameVariable__NewVarNameAssignment_3 )
            {
             before(grammarAccess.getRenameVariableAccess().getNewVarNameAssignment_3()); 
            // InternalAedit.g:3801:2: ( rule__RenameVariable__NewVarNameAssignment_3 )
            // InternalAedit.g:3801:3: rule__RenameVariable__NewVarNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RenameVariable__NewVarNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRenameVariableAccess().getNewVarNameAssignment_3()); 

            }


            }

        }
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
    // InternalAedit.g:3809:1: rule__RenameVariable__Group__4 : rule__RenameVariable__Group__4__Impl ;
    public final void rule__RenameVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3813:1: ( rule__RenameVariable__Group__4__Impl )
            // InternalAedit.g:3814:2: rule__RenameVariable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameVariable__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3820:1: rule__RenameVariable__Group__4__Impl : ( ';' ) ;
    public final void rule__RenameVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3824:1: ( ( ';' ) )
            // InternalAedit.g:3825:1: ( ';' )
            {
            // InternalAedit.g:3825:1: ( ';' )
            // InternalAedit.g:3826:2: ';'
            {
             before(grammarAccess.getRenameVariableAccess().getSemicolonKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRenameVariableAccess().getSemicolonKeyword_4()); 

            }


            }

        }
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
    // InternalAedit.g:3836:1: rule__RenameEnum__Group__0 : rule__RenameEnum__Group__0__Impl rule__RenameEnum__Group__1 ;
    public final void rule__RenameEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3840:1: ( rule__RenameEnum__Group__0__Impl rule__RenameEnum__Group__1 )
            // InternalAedit.g:3841:2: rule__RenameEnum__Group__0__Impl rule__RenameEnum__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RenameEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameEnum__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3848:1: rule__RenameEnum__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3852:1: ( ( 'rename' ) )
            // InternalAedit.g:3853:1: ( 'rename' )
            {
            // InternalAedit.g:3853:1: ( 'rename' )
            // InternalAedit.g:3854:2: 'rename'
            {
             before(grammarAccess.getRenameEnumAccess().getRenameKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRenameEnumAccess().getRenameKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:3863:1: rule__RenameEnum__Group__1 : rule__RenameEnum__Group__1__Impl rule__RenameEnum__Group__2 ;
    public final void rule__RenameEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3867:1: ( rule__RenameEnum__Group__1__Impl rule__RenameEnum__Group__2 )
            // InternalAedit.g:3868:2: rule__RenameEnum__Group__1__Impl rule__RenameEnum__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__RenameEnum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameEnum__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3875:1: rule__RenameEnum__Group__1__Impl : ( ( rule__RenameEnum__OldNameAssignment_1 ) ) ;
    public final void rule__RenameEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3879:1: ( ( ( rule__RenameEnum__OldNameAssignment_1 ) ) )
            // InternalAedit.g:3880:1: ( ( rule__RenameEnum__OldNameAssignment_1 ) )
            {
            // InternalAedit.g:3880:1: ( ( rule__RenameEnum__OldNameAssignment_1 ) )
            // InternalAedit.g:3881:2: ( rule__RenameEnum__OldNameAssignment_1 )
            {
             before(grammarAccess.getRenameEnumAccess().getOldNameAssignment_1()); 
            // InternalAedit.g:3882:2: ( rule__RenameEnum__OldNameAssignment_1 )
            // InternalAedit.g:3882:3: rule__RenameEnum__OldNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RenameEnum__OldNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRenameEnumAccess().getOldNameAssignment_1()); 

            }


            }

        }
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
    // InternalAedit.g:3890:1: rule__RenameEnum__Group__2 : rule__RenameEnum__Group__2__Impl rule__RenameEnum__Group__3 ;
    public final void rule__RenameEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3894:1: ( rule__RenameEnum__Group__2__Impl rule__RenameEnum__Group__3 )
            // InternalAedit.g:3895:2: rule__RenameEnum__Group__2__Impl rule__RenameEnum__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__RenameEnum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameEnum__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3902:1: rule__RenameEnum__Group__2__Impl : ( '=>' ) ;
    public final void rule__RenameEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3906:1: ( ( '=>' ) )
            // InternalAedit.g:3907:1: ( '=>' )
            {
            // InternalAedit.g:3907:1: ( '=>' )
            // InternalAedit.g:3908:2: '=>'
            {
             before(grammarAccess.getRenameEnumAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRenameEnumAccess().getEqualsSignGreaterThanSignKeyword_2()); 

            }


            }

        }
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
    // InternalAedit.g:3917:1: rule__RenameEnum__Group__3 : rule__RenameEnum__Group__3__Impl rule__RenameEnum__Group__4 ;
    public final void rule__RenameEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3921:1: ( rule__RenameEnum__Group__3__Impl rule__RenameEnum__Group__4 )
            // InternalAedit.g:3922:2: rule__RenameEnum__Group__3__Impl rule__RenameEnum__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__RenameEnum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RenameEnum__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3929:1: rule__RenameEnum__Group__3__Impl : ( ( rule__RenameEnum__NewEnumNameAssignment_3 ) ) ;
    public final void rule__RenameEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3933:1: ( ( ( rule__RenameEnum__NewEnumNameAssignment_3 ) ) )
            // InternalAedit.g:3934:1: ( ( rule__RenameEnum__NewEnumNameAssignment_3 ) )
            {
            // InternalAedit.g:3934:1: ( ( rule__RenameEnum__NewEnumNameAssignment_3 ) )
            // InternalAedit.g:3935:2: ( rule__RenameEnum__NewEnumNameAssignment_3 )
            {
             before(grammarAccess.getRenameEnumAccess().getNewEnumNameAssignment_3()); 
            // InternalAedit.g:3936:2: ( rule__RenameEnum__NewEnumNameAssignment_3 )
            // InternalAedit.g:3936:3: rule__RenameEnum__NewEnumNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RenameEnum__NewEnumNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRenameEnumAccess().getNewEnumNameAssignment_3()); 

            }


            }

        }
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
    // InternalAedit.g:3944:1: rule__RenameEnum__Group__4 : rule__RenameEnum__Group__4__Impl ;
    public final void rule__RenameEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3948:1: ( rule__RenameEnum__Group__4__Impl )
            // InternalAedit.g:3949:2: rule__RenameEnum__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RenameEnum__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3955:1: rule__RenameEnum__Group__4__Impl : ( ';' ) ;
    public final void rule__RenameEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3959:1: ( ( ';' ) )
            // InternalAedit.g:3960:1: ( ';' )
            {
            // InternalAedit.g:3960:1: ( ';' )
            // InternalAedit.g:3961:2: ';'
            {
             before(grammarAccess.getRenameEnumAccess().getSemicolonKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRenameEnumAccess().getSemicolonKeyword_4()); 

            }


            }

        }
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
    // InternalAedit.g:3971:1: rule__ChangeDefValue__Group__0 : rule__ChangeDefValue__Group__0__Impl rule__ChangeDefValue__Group__1 ;
    public final void rule__ChangeDefValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3975:1: ( rule__ChangeDefValue__Group__0__Impl rule__ChangeDefValue__Group__1 )
            // InternalAedit.g:3976:2: rule__ChangeDefValue__Group__0__Impl rule__ChangeDefValue__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ChangeDefValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeDefValue__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:3983:1: rule__ChangeDefValue__Group__0__Impl : ( 'set_val' ) ;
    public final void rule__ChangeDefValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3987:1: ( ( 'set_val' ) )
            // InternalAedit.g:3988:1: ( 'set_val' )
            {
            // InternalAedit.g:3988:1: ( 'set_val' )
            // InternalAedit.g:3989:2: 'set_val'
            {
             before(grammarAccess.getChangeDefValueAccess().getSet_valKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getChangeDefValueAccess().getSet_valKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:3998:1: rule__ChangeDefValue__Group__1 : rule__ChangeDefValue__Group__1__Impl rule__ChangeDefValue__Group__2 ;
    public final void rule__ChangeDefValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4002:1: ( rule__ChangeDefValue__Group__1__Impl rule__ChangeDefValue__Group__2 )
            // InternalAedit.g:4003:2: rule__ChangeDefValue__Group__1__Impl rule__ChangeDefValue__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__ChangeDefValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeDefValue__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4010:1: rule__ChangeDefValue__Group__1__Impl : ( ( rule__ChangeDefValue__FieldAssignment_1 ) ) ;
    public final void rule__ChangeDefValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4014:1: ( ( ( rule__ChangeDefValue__FieldAssignment_1 ) ) )
            // InternalAedit.g:4015:1: ( ( rule__ChangeDefValue__FieldAssignment_1 ) )
            {
            // InternalAedit.g:4015:1: ( ( rule__ChangeDefValue__FieldAssignment_1 ) )
            // InternalAedit.g:4016:2: ( rule__ChangeDefValue__FieldAssignment_1 )
            {
             before(grammarAccess.getChangeDefValueAccess().getFieldAssignment_1()); 
            // InternalAedit.g:4017:2: ( rule__ChangeDefValue__FieldAssignment_1 )
            // InternalAedit.g:4017:3: rule__ChangeDefValue__FieldAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ChangeDefValue__FieldAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChangeDefValueAccess().getFieldAssignment_1()); 

            }


            }

        }
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
    // InternalAedit.g:4025:1: rule__ChangeDefValue__Group__2 : rule__ChangeDefValue__Group__2__Impl rule__ChangeDefValue__Group__3 ;
    public final void rule__ChangeDefValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4029:1: ( rule__ChangeDefValue__Group__2__Impl rule__ChangeDefValue__Group__3 )
            // InternalAedit.g:4030:2: rule__ChangeDefValue__Group__2__Impl rule__ChangeDefValue__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__ChangeDefValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeDefValue__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4037:1: rule__ChangeDefValue__Group__2__Impl : ( '=>' ) ;
    public final void rule__ChangeDefValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4041:1: ( ( '=>' ) )
            // InternalAedit.g:4042:1: ( '=>' )
            {
            // InternalAedit.g:4042:1: ( '=>' )
            // InternalAedit.g:4043:2: '=>'
            {
             before(grammarAccess.getChangeDefValueAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getChangeDefValueAccess().getEqualsSignGreaterThanSignKeyword_2()); 

            }


            }

        }
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
    // InternalAedit.g:4052:1: rule__ChangeDefValue__Group__3 : rule__ChangeDefValue__Group__3__Impl rule__ChangeDefValue__Group__4 ;
    public final void rule__ChangeDefValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4056:1: ( rule__ChangeDefValue__Group__3__Impl rule__ChangeDefValue__Group__4 )
            // InternalAedit.g:4057:2: rule__ChangeDefValue__Group__3__Impl rule__ChangeDefValue__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ChangeDefValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeDefValue__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4064:1: rule__ChangeDefValue__Group__3__Impl : ( ( rule__ChangeDefValue__NewValAssignment_3 ) ) ;
    public final void rule__ChangeDefValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4068:1: ( ( ( rule__ChangeDefValue__NewValAssignment_3 ) ) )
            // InternalAedit.g:4069:1: ( ( rule__ChangeDefValue__NewValAssignment_3 ) )
            {
            // InternalAedit.g:4069:1: ( ( rule__ChangeDefValue__NewValAssignment_3 ) )
            // InternalAedit.g:4070:2: ( rule__ChangeDefValue__NewValAssignment_3 )
            {
             before(grammarAccess.getChangeDefValueAccess().getNewValAssignment_3()); 
            // InternalAedit.g:4071:2: ( rule__ChangeDefValue__NewValAssignment_3 )
            // InternalAedit.g:4071:3: rule__ChangeDefValue__NewValAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ChangeDefValue__NewValAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChangeDefValueAccess().getNewValAssignment_3()); 

            }


            }

        }
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
    // InternalAedit.g:4079:1: rule__ChangeDefValue__Group__4 : rule__ChangeDefValue__Group__4__Impl ;
    public final void rule__ChangeDefValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4083:1: ( rule__ChangeDefValue__Group__4__Impl )
            // InternalAedit.g:4084:2: rule__ChangeDefValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeDefValue__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4090:1: rule__ChangeDefValue__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeDefValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4094:1: ( ( ';' ) )
            // InternalAedit.g:4095:1: ( ';' )
            {
            // InternalAedit.g:4095:1: ( ';' )
            // InternalAedit.g:4096:2: ';'
            {
             before(grammarAccess.getChangeDefValueAccess().getSemicolonKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChangeDefValueAccess().getSemicolonKeyword_4()); 

            }


            }

        }
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
    // InternalAedit.g:4106:1: rule__ChangeType__Group__0 : rule__ChangeType__Group__0__Impl rule__ChangeType__Group__1 ;
    public final void rule__ChangeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4110:1: ( rule__ChangeType__Group__0__Impl rule__ChangeType__Group__1 )
            // InternalAedit.g:4111:2: rule__ChangeType__Group__0__Impl rule__ChangeType__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ChangeType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeType__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4118:1: rule__ChangeType__Group__0__Impl : ( 'set_type' ) ;
    public final void rule__ChangeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4122:1: ( ( 'set_type' ) )
            // InternalAedit.g:4123:1: ( 'set_type' )
            {
            // InternalAedit.g:4123:1: ( 'set_type' )
            // InternalAedit.g:4124:2: 'set_type'
            {
             before(grammarAccess.getChangeTypeAccess().getSet_typeKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getChangeTypeAccess().getSet_typeKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:4133:1: rule__ChangeType__Group__1 : rule__ChangeType__Group__1__Impl rule__ChangeType__Group__2 ;
    public final void rule__ChangeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4137:1: ( rule__ChangeType__Group__1__Impl rule__ChangeType__Group__2 )
            // InternalAedit.g:4138:2: rule__ChangeType__Group__1__Impl rule__ChangeType__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__ChangeType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeType__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4145:1: rule__ChangeType__Group__1__Impl : ( ( rule__ChangeType__FieldAssignment_1 ) ) ;
    public final void rule__ChangeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4149:1: ( ( ( rule__ChangeType__FieldAssignment_1 ) ) )
            // InternalAedit.g:4150:1: ( ( rule__ChangeType__FieldAssignment_1 ) )
            {
            // InternalAedit.g:4150:1: ( ( rule__ChangeType__FieldAssignment_1 ) )
            // InternalAedit.g:4151:2: ( rule__ChangeType__FieldAssignment_1 )
            {
             before(grammarAccess.getChangeTypeAccess().getFieldAssignment_1()); 
            // InternalAedit.g:4152:2: ( rule__ChangeType__FieldAssignment_1 )
            // InternalAedit.g:4152:3: rule__ChangeType__FieldAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ChangeType__FieldAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChangeTypeAccess().getFieldAssignment_1()); 

            }


            }

        }
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
    // InternalAedit.g:4160:1: rule__ChangeType__Group__2 : rule__ChangeType__Group__2__Impl rule__ChangeType__Group__3 ;
    public final void rule__ChangeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4164:1: ( rule__ChangeType__Group__2__Impl rule__ChangeType__Group__3 )
            // InternalAedit.g:4165:2: rule__ChangeType__Group__2__Impl rule__ChangeType__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__ChangeType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeType__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4172:1: rule__ChangeType__Group__2__Impl : ( '=>' ) ;
    public final void rule__ChangeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4176:1: ( ( '=>' ) )
            // InternalAedit.g:4177:1: ( '=>' )
            {
            // InternalAedit.g:4177:1: ( '=>' )
            // InternalAedit.g:4178:2: '=>'
            {
             before(grammarAccess.getChangeTypeAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getChangeTypeAccess().getEqualsSignGreaterThanSignKeyword_2()); 

            }


            }

        }
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
    // InternalAedit.g:4187:1: rule__ChangeType__Group__3 : rule__ChangeType__Group__3__Impl rule__ChangeType__Group__4 ;
    public final void rule__ChangeType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4191:1: ( rule__ChangeType__Group__3__Impl rule__ChangeType__Group__4 )
            // InternalAedit.g:4192:2: rule__ChangeType__Group__3__Impl rule__ChangeType__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ChangeType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeType__Group__4();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4199:1: rule__ChangeType__Group__3__Impl : ( ( rule__ChangeType__NewTypeAssignment_3 ) ) ;
    public final void rule__ChangeType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4203:1: ( ( ( rule__ChangeType__NewTypeAssignment_3 ) ) )
            // InternalAedit.g:4204:1: ( ( rule__ChangeType__NewTypeAssignment_3 ) )
            {
            // InternalAedit.g:4204:1: ( ( rule__ChangeType__NewTypeAssignment_3 ) )
            // InternalAedit.g:4205:2: ( rule__ChangeType__NewTypeAssignment_3 )
            {
             before(grammarAccess.getChangeTypeAccess().getNewTypeAssignment_3()); 
            // InternalAedit.g:4206:2: ( rule__ChangeType__NewTypeAssignment_3 )
            // InternalAedit.g:4206:3: rule__ChangeType__NewTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ChangeType__NewTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChangeTypeAccess().getNewTypeAssignment_3()); 

            }


            }

        }
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
    // InternalAedit.g:4214:1: rule__ChangeType__Group__4 : rule__ChangeType__Group__4__Impl ;
    public final void rule__ChangeType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4218:1: ( rule__ChangeType__Group__4__Impl )
            // InternalAedit.g:4219:2: rule__ChangeType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeType__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4225:1: rule__ChangeType__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4229:1: ( ( ';' ) )
            // InternalAedit.g:4230:1: ( ';' )
            {
            // InternalAedit.g:4230:1: ( ';' )
            // InternalAedit.g:4231:2: ';'
            {
             before(grammarAccess.getChangeTypeAccess().getSemicolonKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChangeTypeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__CustomTypeField__Group__0"
    // InternalAedit.g:4241:1: rule__CustomTypeField__Group__0 : rule__CustomTypeField__Group__0__Impl rule__CustomTypeField__Group__1 ;
    public final void rule__CustomTypeField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4245:1: ( rule__CustomTypeField__Group__0__Impl rule__CustomTypeField__Group__1 )
            // InternalAedit.g:4246:2: rule__CustomTypeField__Group__0__Impl rule__CustomTypeField__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__CustomTypeField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTypeField__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4253:1: rule__CustomTypeField__Group__0__Impl : ( ( rule__CustomTypeField__TypeAssignment_0 ) ) ;
    public final void rule__CustomTypeField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4257:1: ( ( ( rule__CustomTypeField__TypeAssignment_0 ) ) )
            // InternalAedit.g:4258:1: ( ( rule__CustomTypeField__TypeAssignment_0 ) )
            {
            // InternalAedit.g:4258:1: ( ( rule__CustomTypeField__TypeAssignment_0 ) )
            // InternalAedit.g:4259:2: ( rule__CustomTypeField__TypeAssignment_0 )
            {
             before(grammarAccess.getCustomTypeFieldAccess().getTypeAssignment_0()); 
            // InternalAedit.g:4260:2: ( rule__CustomTypeField__TypeAssignment_0 )
            // InternalAedit.g:4260:3: rule__CustomTypeField__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CustomTypeField__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCustomTypeFieldAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // InternalAedit.g:4268:1: rule__CustomTypeField__Group__1 : rule__CustomTypeField__Group__1__Impl rule__CustomTypeField__Group__2 ;
    public final void rule__CustomTypeField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4272:1: ( rule__CustomTypeField__Group__1__Impl rule__CustomTypeField__Group__2 )
            // InternalAedit.g:4273:2: rule__CustomTypeField__Group__1__Impl rule__CustomTypeField__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__CustomTypeField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTypeField__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4280:1: rule__CustomTypeField__Group__1__Impl : ( ( rule__CustomTypeField__VarNameAssignment_1 ) ) ;
    public final void rule__CustomTypeField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4284:1: ( ( ( rule__CustomTypeField__VarNameAssignment_1 ) ) )
            // InternalAedit.g:4285:1: ( ( rule__CustomTypeField__VarNameAssignment_1 ) )
            {
            // InternalAedit.g:4285:1: ( ( rule__CustomTypeField__VarNameAssignment_1 ) )
            // InternalAedit.g:4286:2: ( rule__CustomTypeField__VarNameAssignment_1 )
            {
             before(grammarAccess.getCustomTypeFieldAccess().getVarNameAssignment_1()); 
            // InternalAedit.g:4287:2: ( rule__CustomTypeField__VarNameAssignment_1 )
            // InternalAedit.g:4287:3: rule__CustomTypeField__VarNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomTypeField__VarNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomTypeFieldAccess().getVarNameAssignment_1()); 

            }


            }

        }
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
    // InternalAedit.g:4295:1: rule__CustomTypeField__Group__2 : rule__CustomTypeField__Group__2__Impl ;
    public final void rule__CustomTypeField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4299:1: ( rule__CustomTypeField__Group__2__Impl )
            // InternalAedit.g:4300:2: rule__CustomTypeField__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomTypeField__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4306:1: rule__CustomTypeField__Group__2__Impl : ( ';' ) ;
    public final void rule__CustomTypeField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4310:1: ( ( ';' ) )
            // InternalAedit.g:4311:1: ( ';' )
            {
            // InternalAedit.g:4311:1: ( ';' )
            // InternalAedit.g:4312:2: ';'
            {
             before(grammarAccess.getCustomTypeFieldAccess().getSemicolonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCustomTypeFieldAccess().getSemicolonKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__PrimitiveTypeField__Group__0"
    // InternalAedit.g:4322:1: rule__PrimitiveTypeField__Group__0 : rule__PrimitiveTypeField__Group__0__Impl rule__PrimitiveTypeField__Group__1 ;
    public final void rule__PrimitiveTypeField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4326:1: ( rule__PrimitiveTypeField__Group__0__Impl rule__PrimitiveTypeField__Group__1 )
            // InternalAedit.g:4327:2: rule__PrimitiveTypeField__Group__0__Impl rule__PrimitiveTypeField__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__PrimitiveTypeField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4334:1: rule__PrimitiveTypeField__Group__0__Impl : ( ( rule__PrimitiveTypeField__TypeAssignment_0 ) ) ;
    public final void rule__PrimitiveTypeField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4338:1: ( ( ( rule__PrimitiveTypeField__TypeAssignment_0 ) ) )
            // InternalAedit.g:4339:1: ( ( rule__PrimitiveTypeField__TypeAssignment_0 ) )
            {
            // InternalAedit.g:4339:1: ( ( rule__PrimitiveTypeField__TypeAssignment_0 ) )
            // InternalAedit.g:4340:2: ( rule__PrimitiveTypeField__TypeAssignment_0 )
            {
             before(grammarAccess.getPrimitiveTypeFieldAccess().getTypeAssignment_0()); 
            // InternalAedit.g:4341:2: ( rule__PrimitiveTypeField__TypeAssignment_0 )
            // InternalAedit.g:4341:3: rule__PrimitiveTypeField__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeFieldAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // InternalAedit.g:4349:1: rule__PrimitiveTypeField__Group__1 : rule__PrimitiveTypeField__Group__1__Impl rule__PrimitiveTypeField__Group__2 ;
    public final void rule__PrimitiveTypeField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4353:1: ( rule__PrimitiveTypeField__Group__1__Impl rule__PrimitiveTypeField__Group__2 )
            // InternalAedit.g:4354:2: rule__PrimitiveTypeField__Group__1__Impl rule__PrimitiveTypeField__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__PrimitiveTypeField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4361:1: rule__PrimitiveTypeField__Group__1__Impl : ( ( rule__PrimitiveTypeField__VarNameAssignment_1 ) ) ;
    public final void rule__PrimitiveTypeField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4365:1: ( ( ( rule__PrimitiveTypeField__VarNameAssignment_1 ) ) )
            // InternalAedit.g:4366:1: ( ( rule__PrimitiveTypeField__VarNameAssignment_1 ) )
            {
            // InternalAedit.g:4366:1: ( ( rule__PrimitiveTypeField__VarNameAssignment_1 ) )
            // InternalAedit.g:4367:2: ( rule__PrimitiveTypeField__VarNameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveTypeFieldAccess().getVarNameAssignment_1()); 
            // InternalAedit.g:4368:2: ( rule__PrimitiveTypeField__VarNameAssignment_1 )
            // InternalAedit.g:4368:3: rule__PrimitiveTypeField__VarNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__VarNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeFieldAccess().getVarNameAssignment_1()); 

            }


            }

        }
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
    // InternalAedit.g:4376:1: rule__PrimitiveTypeField__Group__2 : rule__PrimitiveTypeField__Group__2__Impl ;
    public final void rule__PrimitiveTypeField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4380:1: ( rule__PrimitiveTypeField__Group__2__Impl )
            // InternalAedit.g:4381:2: rule__PrimitiveTypeField__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4387:1: rule__PrimitiveTypeField__Group__2__Impl : ( ( rule__PrimitiveTypeField__Group_2__0 )? ) ;
    public final void rule__PrimitiveTypeField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4391:1: ( ( ( rule__PrimitiveTypeField__Group_2__0 )? ) )
            // InternalAedit.g:4392:1: ( ( rule__PrimitiveTypeField__Group_2__0 )? )
            {
            // InternalAedit.g:4392:1: ( ( rule__PrimitiveTypeField__Group_2__0 )? )
            // InternalAedit.g:4393:2: ( rule__PrimitiveTypeField__Group_2__0 )?
            {
             before(grammarAccess.getPrimitiveTypeFieldAccess().getGroup_2()); 
            // InternalAedit.g:4394:2: ( rule__PrimitiveTypeField__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAedit.g:4394:3: rule__PrimitiveTypeField__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveTypeField__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitiveTypeFieldAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__PrimitiveTypeField__Group_2__0"
    // InternalAedit.g:4403:1: rule__PrimitiveTypeField__Group_2__0 : rule__PrimitiveTypeField__Group_2__0__Impl rule__PrimitiveTypeField__Group_2__1 ;
    public final void rule__PrimitiveTypeField__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4407:1: ( rule__PrimitiveTypeField__Group_2__0__Impl rule__PrimitiveTypeField__Group_2__1 )
            // InternalAedit.g:4408:2: rule__PrimitiveTypeField__Group_2__0__Impl rule__PrimitiveTypeField__Group_2__1
            {
            pushFollow(FOLLOW_34);
            rule__PrimitiveTypeField__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__Group_2__0"


    // $ANTLR start "rule__PrimitiveTypeField__Group_2__0__Impl"
    // InternalAedit.g:4415:1: rule__PrimitiveTypeField__Group_2__0__Impl : ( '=' ) ;
    public final void rule__PrimitiveTypeField__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4419:1: ( ( '=' ) )
            // InternalAedit.g:4420:1: ( '=' )
            {
            // InternalAedit.g:4420:1: ( '=' )
            // InternalAedit.g:4421:2: '='
            {
             before(grammarAccess.getPrimitiveTypeFieldAccess().getEqualsSignKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeFieldAccess().getEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__Group_2__0__Impl"


    // $ANTLR start "rule__PrimitiveTypeField__Group_2__1"
    // InternalAedit.g:4430:1: rule__PrimitiveTypeField__Group_2__1 : rule__PrimitiveTypeField__Group_2__1__Impl ;
    public final void rule__PrimitiveTypeField__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4434:1: ( rule__PrimitiveTypeField__Group_2__1__Impl )
            // InternalAedit.g:4435:2: rule__PrimitiveTypeField__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__Group_2__1"


    // $ANTLR start "rule__PrimitiveTypeField__Group_2__1__Impl"
    // InternalAedit.g:4441:1: rule__PrimitiveTypeField__Group_2__1__Impl : ( ( rule__PrimitiveTypeField__ValueAssignment_2_1 ) ) ;
    public final void rule__PrimitiveTypeField__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4445:1: ( ( ( rule__PrimitiveTypeField__ValueAssignment_2_1 ) ) )
            // InternalAedit.g:4446:1: ( ( rule__PrimitiveTypeField__ValueAssignment_2_1 ) )
            {
            // InternalAedit.g:4446:1: ( ( rule__PrimitiveTypeField__ValueAssignment_2_1 ) )
            // InternalAedit.g:4447:2: ( rule__PrimitiveTypeField__ValueAssignment_2_1 )
            {
             before(grammarAccess.getPrimitiveTypeFieldAccess().getValueAssignment_2_1()); 
            // InternalAedit.g:4448:2: ( rule__PrimitiveTypeField__ValueAssignment_2_1 )
            // InternalAedit.g:4448:3: rule__PrimitiveTypeField__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeField__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeFieldAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__Group_2__1__Impl"


    // $ANTLR start "rule__Real__Group__0"
    // InternalAedit.g:4457:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4461:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // InternalAedit.g:4462:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Real__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4469:1: rule__Real__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4473:1: ( ( ( '-' )? ) )
            // InternalAedit.g:4474:1: ( ( '-' )? )
            {
            // InternalAedit.g:4474:1: ( ( '-' )? )
            // InternalAedit.g:4475:2: ( '-' )?
            {
             before(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
            // InternalAedit.g:4476:2: ( '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAedit.g:4476:3: '-'
                    {
                    match(input,42,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:4484:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4488:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // InternalAedit.g:4489:2: rule__Real__Group__1__Impl rule__Real__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Real__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group__2();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4496:1: rule__Real__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4500:1: ( ( RULE_INT ) )
            // InternalAedit.g:4501:1: ( RULE_INT )
            {
            // InternalAedit.g:4501:1: ( RULE_INT )
            // InternalAedit.g:4502:2: RULE_INT
            {
             before(grammarAccess.getRealAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
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
    // InternalAedit.g:4511:1: rule__Real__Group__2 : rule__Real__Group__2__Impl rule__Real__Group__3 ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4515:1: ( rule__Real__Group__2__Impl rule__Real__Group__3 )
            // InternalAedit.g:4516:2: rule__Real__Group__2__Impl rule__Real__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Real__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4523:1: rule__Real__Group__2__Impl : ( '.' ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4527:1: ( ( '.' ) )
            // InternalAedit.g:4528:1: ( '.' )
            {
            // InternalAedit.g:4528:1: ( '.' )
            // InternalAedit.g:4529:2: '.'
            {
             before(grammarAccess.getRealAccess().getFullStopKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getFullStopKeyword_2()); 

            }


            }

        }
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
    // InternalAedit.g:4538:1: rule__Real__Group__3 : rule__Real__Group__3__Impl ;
    public final void rule__Real__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4542:1: ( rule__Real__Group__3__Impl )
            // InternalAedit.g:4543:2: rule__Real__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4549:1: rule__Real__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4553:1: ( ( RULE_INT ) )
            // InternalAedit.g:4554:1: ( RULE_INT )
            {
            // InternalAedit.g:4554:1: ( RULE_INT )
            // InternalAedit.g:4555:2: RULE_INT
            {
             before(grammarAccess.getRealAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__QN__Group__0"
    // InternalAedit.g:4565:1: rule__QN__Group__0 : rule__QN__Group__0__Impl rule__QN__Group__1 ;
    public final void rule__QN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4569:1: ( rule__QN__Group__0__Impl rule__QN__Group__1 )
            // InternalAedit.g:4570:2: rule__QN__Group__0__Impl rule__QN__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__QN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QN__Group__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4577:1: rule__QN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4581:1: ( ( RULE_ID ) )
            // InternalAedit.g:4582:1: ( RULE_ID )
            {
            // InternalAedit.g:4582:1: ( RULE_ID )
            // InternalAedit.g:4583:2: RULE_ID
            {
             before(grammarAccess.getQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalAedit.g:4592:1: rule__QN__Group__1 : rule__QN__Group__1__Impl ;
    public final void rule__QN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4596:1: ( rule__QN__Group__1__Impl )
            // InternalAedit.g:4597:2: rule__QN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QN__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4603:1: rule__QN__Group__1__Impl : ( ( rule__QN__Group_1__0 )* ) ;
    public final void rule__QN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4607:1: ( ( ( rule__QN__Group_1__0 )* ) )
            // InternalAedit.g:4608:1: ( ( rule__QN__Group_1__0 )* )
            {
            // InternalAedit.g:4608:1: ( ( rule__QN__Group_1__0 )* )
            // InternalAedit.g:4609:2: ( rule__QN__Group_1__0 )*
            {
             before(grammarAccess.getQNAccess().getGroup_1()); 
            // InternalAedit.g:4610:2: ( rule__QN__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==34) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAedit.g:4610:3: rule__QN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__QN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getQNAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalAedit.g:4619:1: rule__QN__Group_1__0 : rule__QN__Group_1__0__Impl rule__QN__Group_1__1 ;
    public final void rule__QN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4623:1: ( rule__QN__Group_1__0__Impl rule__QN__Group_1__1 )
            // InternalAedit.g:4624:2: rule__QN__Group_1__0__Impl rule__QN__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__QN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QN__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4631:1: rule__QN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4635:1: ( ( '.' ) )
            // InternalAedit.g:4636:1: ( '.' )
            {
            // InternalAedit.g:4636:1: ( '.' )
            // InternalAedit.g:4637:2: '.'
            {
             before(grammarAccess.getQNAccess().getFullStopKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
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
    // InternalAedit.g:4646:1: rule__QN__Group_1__1 : rule__QN__Group_1__1__Impl ;
    public final void rule__QN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4650:1: ( rule__QN__Group_1__1__Impl )
            // InternalAedit.g:4651:2: rule__QN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QN__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAedit.g:4657:1: rule__QN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4661:1: ( ( RULE_ID ) )
            // InternalAedit.g:4662:1: ( RULE_ID )
            {
            // InternalAedit.g:4662:1: ( RULE_ID )
            // InternalAedit.g:4663:2: RULE_ID
            {
             before(grammarAccess.getQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__RuleDeclarationsAssignment_0"
    // InternalAedit.g:4673:1: rule__Model__RuleDeclarationsAssignment_0 : ( ruleRuleDeclaration ) ;
    public final void rule__Model__RuleDeclarationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4677:1: ( ( ruleRuleDeclaration ) )
            // InternalAedit.g:4678:2: ( ruleRuleDeclaration )
            {
            // InternalAedit.g:4678:2: ( ruleRuleDeclaration )
            // InternalAedit.g:4679:3: ruleRuleDeclaration
            {
             before(grammarAccess.getModelAccess().getRuleDeclarationsRuleDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRuleDeclarationsRuleDeclarationParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalAedit.g:4688:1: rule__Model__RuleMapsAssignment_1 : ( ruleRuleMap ) ;
    public final void rule__Model__RuleMapsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4692:1: ( ( ruleRuleMap ) )
            // InternalAedit.g:4693:2: ( ruleRuleMap )
            {
            // InternalAedit.g:4693:2: ( ruleRuleMap )
            // InternalAedit.g:4694:3: ruleRuleMap
            {
             before(grammarAccess.getModelAccess().getRuleMapsRuleMapParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleMap();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRuleMapsRuleMapParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAedit.g:4703:1: rule__Model__FeaturesAssignment_2 : ( ruleFeature ) ;
    public final void rule__Model__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4707:1: ( ( ruleFeature ) )
            // InternalAedit.g:4708:2: ( ruleFeature )
            {
            // InternalAedit.g:4708:2: ( ruleFeature )
            // InternalAedit.g:4709:3: ruleFeature
            {
             before(grammarAccess.getModelAccess().getFeaturesFeatureParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFeaturesFeatureParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalAedit.g:4718:1: rule__Model__FeatureMapsAssignment_3 : ( ruleFeatureMap ) ;
    public final void rule__Model__FeatureMapsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4722:1: ( ( ruleFeatureMap ) )
            // InternalAedit.g:4723:2: ( ruleFeatureMap )
            {
            // InternalAedit.g:4723:2: ( ruleFeatureMap )
            // InternalAedit.g:4724:3: ruleFeatureMap
            {
             before(grammarAccess.getModelAccess().getFeatureMapsFeatureMapParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureMap();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFeatureMapsFeatureMapParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalAedit.g:4733:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4737:1: ( ( RULE_ID ) )
            // InternalAedit.g:4738:2: ( RULE_ID )
            {
            // InternalAedit.g:4738:2: ( RULE_ID )
            // InternalAedit.g:4739:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAedit.g:4748:1: rule__Feature__ExtendAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__ExtendAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4752:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:4753:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:4753:2: ( ( RULE_ID ) )
            // InternalAedit.g:4754:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getExtendFeatureCrossReference_2_1_0()); 
            // InternalAedit.g:4755:3: ( RULE_ID )
            // InternalAedit.g:4756:4: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getExtendFeatureIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getExtendFeatureIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getExtendFeatureCrossReference_2_1_0()); 

            }


            }

        }
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
    // InternalAedit.g:4767:1: rule__Feature__RuleMapsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__RuleMapsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4771:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:4772:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:4772:2: ( ( RULE_ID ) )
            // InternalAedit.g:4773:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getRuleMapsRuleMapCrossReference_4_0()); 
            // InternalAedit.g:4774:3: ( RULE_ID )
            // InternalAedit.g:4775:4: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getRuleMapsRuleMapIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getRuleMapsRuleMapIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getRuleMapsRuleMapCrossReference_4_0()); 

            }


            }

        }
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
    // InternalAedit.g:4786:1: rule__FeatureMap__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4790:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:4791:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:4791:2: ( ( RULE_ID ) )
            // InternalAedit.g:4792:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getNameFeatureCrossReference_1_0()); 
            // InternalAedit.g:4793:3: ( RULE_ID )
            // InternalAedit.g:4794:4: RULE_ID
            {
             before(grammarAccess.getFeatureMapAccess().getNameFeatureIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureMapAccess().getNameFeatureIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFeatureMapAccess().getNameFeatureCrossReference_1_0()); 

            }


            }

        }
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
    // InternalAedit.g:4805:1: rule__RuleMap__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuleMap__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4809:1: ( ( RULE_ID ) )
            // InternalAedit.g:4810:2: ( RULE_ID )
            {
            // InternalAedit.g:4810:2: ( RULE_ID )
            // InternalAedit.g:4811:3: RULE_ID
            {
             before(grammarAccess.getRuleMapAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleMapAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAedit.g:4820:1: rule__RuleMap__RulesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RuleMap__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4824:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:4825:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:4825:2: ( ( RULE_ID ) )
            // InternalAedit.g:4826:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleMapAccess().getRulesRuleDeclarationCrossReference_3_0()); 
            // InternalAedit.g:4827:3: ( RULE_ID )
            // InternalAedit.g:4828:4: RULE_ID
            {
             before(grammarAccess.getRuleMapAccess().getRulesRuleDeclarationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleMapAccess().getRulesRuleDeclarationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRuleMapAccess().getRulesRuleDeclarationCrossReference_3_0()); 

            }


            }

        }
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
    // InternalAedit.g:4839:1: rule__RuleDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuleDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4843:1: ( ( RULE_ID ) )
            // InternalAedit.g:4844:2: ( RULE_ID )
            {
            // InternalAedit.g:4844:2: ( RULE_ID )
            // InternalAedit.g:4845:3: RULE_ID
            {
             before(grammarAccess.getRuleDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAedit.g:4854:1: rule__RuleDeclaration__RulesAssignment_3 : ( ruleGenericRule ) ;
    public final void rule__RuleDeclaration__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4858:1: ( ( ruleGenericRule ) )
            // InternalAedit.g:4859:2: ( ruleGenericRule )
            {
            // InternalAedit.g:4859:2: ( ruleGenericRule )
            // InternalAedit.g:4860:3: ruleGenericRule
            {
             before(grammarAccess.getRuleDeclarationAccess().getRulesGenericRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGenericRule();

            state._fsp--;

             after(grammarAccess.getRuleDeclarationAccess().getRulesGenericRuleParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ChangeSchema__SchemaAssignment_2"
    // InternalAedit.g:4869:1: rule__ChangeSchema__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__ChangeSchema__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4873:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:4874:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:4874:2: ( ( ruleQN ) )
            // InternalAedit.g:4875:3: ( ruleQN )
            {
             before(grammarAccess.getChangeSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            // InternalAedit.g:4876:3: ( ruleQN )
            // InternalAedit.g:4877:4: ruleQN
            {
             before(grammarAccess.getChangeSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;

             after(grammarAccess.getChangeSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getChangeSchemaAccess().getSchemaTypeCrossReference_2_0()); 

            }


            }

        }
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
    // InternalAedit.g:4888:1: rule__ChangeSchema__RulesAssignment_4 : ( ruleSchemaRule ) ;
    public final void rule__ChangeSchema__RulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4892:1: ( ( ruleSchemaRule ) )
            // InternalAedit.g:4893:2: ( ruleSchemaRule )
            {
            // InternalAedit.g:4893:2: ( ruleSchemaRule )
            // InternalAedit.g:4894:3: ruleSchemaRule
            {
             before(grammarAccess.getChangeSchemaAccess().getRulesSchemaRuleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSchemaRule();

            state._fsp--;

             after(grammarAccess.getChangeSchemaAccess().getRulesSchemaRuleParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalAedit.g:4903:1: rule__ChangeEnum__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__ChangeEnum__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4907:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:4908:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:4908:2: ( ( ruleQN ) )
            // InternalAedit.g:4909:3: ( ruleQN )
            {
             before(grammarAccess.getChangeEnumAccess().getSchemaEnumTypeCrossReference_2_0()); 
            // InternalAedit.g:4910:3: ( ruleQN )
            // InternalAedit.g:4911:4: ruleQN
            {
             before(grammarAccess.getChangeEnumAccess().getSchemaEnumTypeQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;

             after(grammarAccess.getChangeEnumAccess().getSchemaEnumTypeQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getChangeEnumAccess().getSchemaEnumTypeCrossReference_2_0()); 

            }


            }

        }
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
    // InternalAedit.g:4922:1: rule__ChangeEnum__RulesAssignment_4 : ( ruleEnumRule ) ;
    public final void rule__ChangeEnum__RulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4926:1: ( ( ruleEnumRule ) )
            // InternalAedit.g:4927:2: ( ruleEnumRule )
            {
            // InternalAedit.g:4927:2: ( ruleEnumRule )
            // InternalAedit.g:4928:3: ruleEnumRule
            {
             before(grammarAccess.getChangeEnumAccess().getRulesEnumRuleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumRule();

            state._fsp--;

             after(grammarAccess.getChangeEnumAccess().getRulesEnumRuleParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalAedit.g:4937:1: rule__AddRecord__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddRecord__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4941:1: ( ( RULE_INT ) )
            // InternalAedit.g:4942:2: ( RULE_INT )
            {
            // InternalAedit.g:4942:2: ( RULE_INT )
            // InternalAedit.g:4943:3: RULE_INT
            {
             before(grammarAccess.getAddRecordAccess().getIndexINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAddRecordAccess().getIndexINTTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalAedit.g:4952:1: rule__AddRecord__NamespaceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__AddRecord__NamespaceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4956:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:4957:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:4957:2: ( ( RULE_ID ) )
            // InternalAedit.g:4958:3: ( RULE_ID )
            {
             before(grammarAccess.getAddRecordAccess().getNamespaceAvroIDLFileCrossReference_5_0()); 
            // InternalAedit.g:4959:3: ( RULE_ID )
            // InternalAedit.g:4960:4: RULE_ID
            {
             before(grammarAccess.getAddRecordAccess().getNamespaceAvroIDLFileIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddRecordAccess().getNamespaceAvroIDLFileIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAddRecordAccess().getNamespaceAvroIDLFileCrossReference_5_0()); 

            }


            }

        }
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
    // InternalAedit.g:4971:1: rule__AddRecord__RecordNameAssignment_7 : ( RULE_ID ) ;
    public final void rule__AddRecord__RecordNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4975:1: ( ( RULE_ID ) )
            // InternalAedit.g:4976:2: ( RULE_ID )
            {
            // InternalAedit.g:4976:2: ( RULE_ID )
            // InternalAedit.g:4977:3: RULE_ID
            {
             before(grammarAccess.getAddRecordAccess().getRecordNameIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddRecordAccess().getRecordNameIDTerminalRuleCall_7_0()); 

            }


            }

        }
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
    // InternalAedit.g:4986:1: rule__AddRecord__FieldsAssignment_9 : ( ruleField ) ;
    public final void rule__AddRecord__FieldsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4990:1: ( ( ruleField ) )
            // InternalAedit.g:4991:2: ( ruleField )
            {
            // InternalAedit.g:4991:2: ( ruleField )
            // InternalAedit.g:4992:3: ruleField
            {
             before(grammarAccess.getAddRecordAccess().getFieldsFieldParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getAddRecordAccess().getFieldsFieldParserRuleCall_9_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__AddEnumeration__IndexAssignment_2"
    // InternalAedit.g:5001:1: rule__AddEnumeration__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddEnumeration__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5005:1: ( ( RULE_INT ) )
            // InternalAedit.g:5006:2: ( RULE_INT )
            {
            // InternalAedit.g:5006:2: ( RULE_INT )
            // InternalAedit.g:5007:3: RULE_INT
            {
             before(grammarAccess.getAddEnumerationAccess().getIndexINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAddEnumerationAccess().getIndexINTTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalAedit.g:5016:1: rule__AddEnumeration__NamespaceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__AddEnumeration__NamespaceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5020:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:5021:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:5021:2: ( ( RULE_ID ) )
            // InternalAedit.g:5022:3: ( RULE_ID )
            {
             before(grammarAccess.getAddEnumerationAccess().getNamespaceAvroIDLFileCrossReference_5_0()); 
            // InternalAedit.g:5023:3: ( RULE_ID )
            // InternalAedit.g:5024:4: RULE_ID
            {
             before(grammarAccess.getAddEnumerationAccess().getNamespaceAvroIDLFileIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddEnumerationAccess().getNamespaceAvroIDLFileIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAddEnumerationAccess().getNamespaceAvroIDLFileCrossReference_5_0()); 

            }


            }

        }
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
    // InternalAedit.g:5035:1: rule__AddEnumeration__EnumNameAssignment_7 : ( RULE_ID ) ;
    public final void rule__AddEnumeration__EnumNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5039:1: ( ( RULE_ID ) )
            // InternalAedit.g:5040:2: ( RULE_ID )
            {
            // InternalAedit.g:5040:2: ( RULE_ID )
            // InternalAedit.g:5041:3: RULE_ID
            {
             before(grammarAccess.getAddEnumerationAccess().getEnumNameIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddEnumerationAccess().getEnumNameIDTerminalRuleCall_7_0()); 

            }


            }

        }
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
    // InternalAedit.g:5050:1: rule__AddEnumeration__SymbolsAssignment_9 : ( RULE_ID ) ;
    public final void rule__AddEnumeration__SymbolsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5054:1: ( ( RULE_ID ) )
            // InternalAedit.g:5055:2: ( RULE_ID )
            {
            // InternalAedit.g:5055:2: ( RULE_ID )
            // InternalAedit.g:5056:3: RULE_ID
            {
             before(grammarAccess.getAddEnumerationAccess().getSymbolsIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddEnumerationAccess().getSymbolsIDTerminalRuleCall_9_0()); 

            }


            }

        }
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
    // InternalAedit.g:5065:1: rule__AddEnumeration__SymbolsAssignment_10_1 : ( RULE_ID ) ;
    public final void rule__AddEnumeration__SymbolsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5069:1: ( ( RULE_ID ) )
            // InternalAedit.g:5070:2: ( RULE_ID )
            {
            // InternalAedit.g:5070:2: ( RULE_ID )
            // InternalAedit.g:5071:3: RULE_ID
            {
             before(grammarAccess.getAddEnumerationAccess().getSymbolsIDTerminalRuleCall_10_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddEnumerationAccess().getSymbolsIDTerminalRuleCall_10_1_0()); 

            }


            }

        }
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
    // InternalAedit.g:5080:1: rule__AddVariable__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddVariable__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5084:1: ( ( RULE_INT ) )
            // InternalAedit.g:5085:2: ( RULE_INT )
            {
            // InternalAedit.g:5085:2: ( RULE_INT )
            // InternalAedit.g:5086:3: RULE_INT
            {
             before(grammarAccess.getAddVariableAccess().getIndexINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAddVariableAccess().getIndexINTTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalAedit.g:5095:1: rule__AddVariable__NewVarAssignment_4 : ( ruleField ) ;
    public final void rule__AddVariable__NewVarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5099:1: ( ( ruleField ) )
            // InternalAedit.g:5100:2: ( ruleField )
            {
            // InternalAedit.g:5100:2: ( ruleField )
            // InternalAedit.g:5101:3: ruleField
            {
             before(grammarAccess.getAddVariableAccess().getNewVarFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getAddVariableAccess().getNewVarFieldParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalAedit.g:5110:1: rule__AddEnum__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddEnum__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5114:1: ( ( RULE_INT ) )
            // InternalAedit.g:5115:2: ( RULE_INT )
            {
            // InternalAedit.g:5115:2: ( RULE_INT )
            // InternalAedit.g:5116:3: RULE_INT
            {
             before(grammarAccess.getAddEnumAccess().getIndexINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAddEnumAccess().getIndexINTTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalAedit.g:5125:1: rule__AddEnum__VarNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__AddEnum__VarNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5129:1: ( ( RULE_ID ) )
            // InternalAedit.g:5130:2: ( RULE_ID )
            {
            // InternalAedit.g:5130:2: ( RULE_ID )
            // InternalAedit.g:5131:3: RULE_ID
            {
             before(grammarAccess.getAddEnumAccess().getVarNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddEnumAccess().getVarNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
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
    // InternalAedit.g:5140:1: rule__RemoveSchema__SchemaTypeAssignment_1 : ( ruleSCHEMA_TYPE ) ;
    public final void rule__RemoveSchema__SchemaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5144:1: ( ( ruleSCHEMA_TYPE ) )
            // InternalAedit.g:5145:2: ( ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:5145:2: ( ruleSCHEMA_TYPE )
            // InternalAedit.g:5146:3: ruleSCHEMA_TYPE
            {
             before(grammarAccess.getRemoveSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSCHEMA_TYPE();

            state._fsp--;

             after(grammarAccess.getRemoveSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAedit.g:5155:1: rule__RemoveSchema__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__RemoveSchema__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5159:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:5160:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:5160:2: ( ( ruleQN ) )
            // InternalAedit.g:5161:3: ( ruleQN )
            {
             before(grammarAccess.getRemoveSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            // InternalAedit.g:5162:3: ( ruleQN )
            // InternalAedit.g:5163:4: ruleQN
            {
             before(grammarAccess.getRemoveSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;

             after(grammarAccess.getRemoveSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRemoveSchemaAccess().getSchemaTypeCrossReference_2_0()); 

            }


            }

        }
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
    // InternalAedit.g:5174:1: rule__RemoveVariable__VariableAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__RemoveVariable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5178:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:5179:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:5179:2: ( ( ruleQN ) )
            // InternalAedit.g:5180:3: ( ruleQN )
            {
             before(grammarAccess.getRemoveVariableAccess().getVariableFieldCrossReference_1_0()); 
            // InternalAedit.g:5181:3: ( ruleQN )
            // InternalAedit.g:5182:4: ruleQN
            {
             before(grammarAccess.getRemoveVariableAccess().getVariableFieldQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;

             after(grammarAccess.getRemoveVariableAccess().getVariableFieldQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRemoveVariableAccess().getVariableFieldCrossReference_1_0()); 

            }


            }

        }
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
    // InternalAedit.g:5193:1: rule__RemoveEnum__VarNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RemoveEnum__VarNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5197:1: ( ( RULE_ID ) )
            // InternalAedit.g:5198:2: ( RULE_ID )
            {
            // InternalAedit.g:5198:2: ( RULE_ID )
            // InternalAedit.g:5199:3: RULE_ID
            {
             before(grammarAccess.getRemoveEnumAccess().getVarNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRemoveEnumAccess().getVarNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAedit.g:5208:1: rule__RenameSchema__SchemaTypeAssignment_1 : ( ruleSCHEMA_TYPE ) ;
    public final void rule__RenameSchema__SchemaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5212:1: ( ( ruleSCHEMA_TYPE ) )
            // InternalAedit.g:5213:2: ( ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:5213:2: ( ruleSCHEMA_TYPE )
            // InternalAedit.g:5214:3: ruleSCHEMA_TYPE
            {
             before(grammarAccess.getRenameSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSCHEMA_TYPE();

            state._fsp--;

             after(grammarAccess.getRenameSchemaAccess().getSchemaTypeSCHEMA_TYPEParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAedit.g:5223:1: rule__RenameSchema__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__RenameSchema__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5227:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:5228:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:5228:2: ( ( ruleQN ) )
            // InternalAedit.g:5229:3: ( ruleQN )
            {
             before(grammarAccess.getRenameSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            // InternalAedit.g:5230:3: ( ruleQN )
            // InternalAedit.g:5231:4: ruleQN
            {
             before(grammarAccess.getRenameSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;

             after(grammarAccess.getRenameSchemaAccess().getSchemaTypeQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRenameSchemaAccess().getSchemaTypeCrossReference_2_0()); 

            }


            }

        }
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
    // InternalAedit.g:5242:1: rule__RenameSchema__NewSchNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__RenameSchema__NewSchNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5246:1: ( ( RULE_ID ) )
            // InternalAedit.g:5247:2: ( RULE_ID )
            {
            // InternalAedit.g:5247:2: ( RULE_ID )
            // InternalAedit.g:5248:3: RULE_ID
            {
             before(grammarAccess.getRenameSchemaAccess().getNewSchNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRenameSchemaAccess().getNewSchNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
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
    // InternalAedit.g:5257:1: rule__RenameVariable__VariableAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__RenameVariable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5261:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:5262:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:5262:2: ( ( ruleQN ) )
            // InternalAedit.g:5263:3: ( ruleQN )
            {
             before(grammarAccess.getRenameVariableAccess().getVariableFieldCrossReference_1_0()); 
            // InternalAedit.g:5264:3: ( ruleQN )
            // InternalAedit.g:5265:4: ruleQN
            {
             before(grammarAccess.getRenameVariableAccess().getVariableFieldQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;

             after(grammarAccess.getRenameVariableAccess().getVariableFieldQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRenameVariableAccess().getVariableFieldCrossReference_1_0()); 

            }


            }

        }
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
    // InternalAedit.g:5276:1: rule__RenameVariable__NewVarNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__RenameVariable__NewVarNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5280:1: ( ( RULE_ID ) )
            // InternalAedit.g:5281:2: ( RULE_ID )
            {
            // InternalAedit.g:5281:2: ( RULE_ID )
            // InternalAedit.g:5282:3: RULE_ID
            {
             before(grammarAccess.getRenameVariableAccess().getNewVarNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRenameVariableAccess().getNewVarNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
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
    // InternalAedit.g:5291:1: rule__RenameEnum__OldNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RenameEnum__OldNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5295:1: ( ( RULE_ID ) )
            // InternalAedit.g:5296:2: ( RULE_ID )
            {
            // InternalAedit.g:5296:2: ( RULE_ID )
            // InternalAedit.g:5297:3: RULE_ID
            {
             before(grammarAccess.getRenameEnumAccess().getOldNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRenameEnumAccess().getOldNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalAedit.g:5306:1: rule__RenameEnum__NewEnumNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__RenameEnum__NewEnumNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5310:1: ( ( RULE_ID ) )
            // InternalAedit.g:5311:2: ( RULE_ID )
            {
            // InternalAedit.g:5311:2: ( RULE_ID )
            // InternalAedit.g:5312:3: RULE_ID
            {
             before(grammarAccess.getRenameEnumAccess().getNewEnumNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRenameEnumAccess().getNewEnumNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
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
    // InternalAedit.g:5321:1: rule__ChangeDefValue__FieldAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__ChangeDefValue__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5325:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:5326:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:5326:2: ( ( ruleQN ) )
            // InternalAedit.g:5327:3: ( ruleQN )
            {
             before(grammarAccess.getChangeDefValueAccess().getFieldFieldCrossReference_1_0()); 
            // InternalAedit.g:5328:3: ( ruleQN )
            // InternalAedit.g:5329:4: ruleQN
            {
             before(grammarAccess.getChangeDefValueAccess().getFieldFieldQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;

             after(grammarAccess.getChangeDefValueAccess().getFieldFieldQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getChangeDefValueAccess().getFieldFieldCrossReference_1_0()); 

            }


            }

        }
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
    // InternalAedit.g:5340:1: rule__ChangeDefValue__NewValAssignment_3 : ( ruleValue ) ;
    public final void rule__ChangeDefValue__NewValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5344:1: ( ( ruleValue ) )
            // InternalAedit.g:5345:2: ( ruleValue )
            {
            // InternalAedit.g:5345:2: ( ruleValue )
            // InternalAedit.g:5346:3: ruleValue
            {
             before(grammarAccess.getChangeDefValueAccess().getNewValValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getChangeDefValueAccess().getNewValValueParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalAedit.g:5355:1: rule__ChangeType__FieldAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__ChangeType__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5359:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:5360:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:5360:2: ( ( ruleQN ) )
            // InternalAedit.g:5361:3: ( ruleQN )
            {
             before(grammarAccess.getChangeTypeAccess().getFieldFieldCrossReference_1_0()); 
            // InternalAedit.g:5362:3: ( ruleQN )
            // InternalAedit.g:5363:4: ruleQN
            {
             before(grammarAccess.getChangeTypeAccess().getFieldFieldQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;

             after(grammarAccess.getChangeTypeAccess().getFieldFieldQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getChangeTypeAccess().getFieldFieldCrossReference_1_0()); 

            }


            }

        }
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
    // InternalAedit.g:5374:1: rule__ChangeType__NewTypeAssignment_3 : ( ruleVARIABLE_TYPE ) ;
    public final void rule__ChangeType__NewTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5378:1: ( ( ruleVARIABLE_TYPE ) )
            // InternalAedit.g:5379:2: ( ruleVARIABLE_TYPE )
            {
            // InternalAedit.g:5379:2: ( ruleVARIABLE_TYPE )
            // InternalAedit.g:5380:3: ruleVARIABLE_TYPE
            {
             before(grammarAccess.getChangeTypeAccess().getNewTypeVARIABLE_TYPEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVARIABLE_TYPE();

            state._fsp--;

             after(grammarAccess.getChangeTypeAccess().getNewTypeVARIABLE_TYPEParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__CustomTypeField__TypeAssignment_0"
    // InternalAedit.g:5389:1: rule__CustomTypeField__TypeAssignment_0 : ( ( ruleQN ) ) ;
    public final void rule__CustomTypeField__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5393:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:5394:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:5394:2: ( ( ruleQN ) )
            // InternalAedit.g:5395:3: ( ruleQN )
            {
             before(grammarAccess.getCustomTypeFieldAccess().getTypeTypeCrossReference_0_0()); 
            // InternalAedit.g:5396:3: ( ruleQN )
            // InternalAedit.g:5397:4: ruleQN
            {
             before(grammarAccess.getCustomTypeFieldAccess().getTypeTypeQNParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQN();

            state._fsp--;

             after(grammarAccess.getCustomTypeFieldAccess().getTypeTypeQNParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCustomTypeFieldAccess().getTypeTypeCrossReference_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__CustomTypeField__VarNameAssignment_1"
    // InternalAedit.g:5408:1: rule__CustomTypeField__VarNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CustomTypeField__VarNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5412:1: ( ( RULE_ID ) )
            // InternalAedit.g:5413:2: ( RULE_ID )
            {
            // InternalAedit.g:5413:2: ( RULE_ID )
            // InternalAedit.g:5414:3: RULE_ID
            {
             before(grammarAccess.getCustomTypeFieldAccess().getVarNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomTypeFieldAccess().getVarNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTypeField__VarNameAssignment_1"


    // $ANTLR start "rule__PrimitiveTypeField__TypeAssignment_0"
    // InternalAedit.g:5423:1: rule__PrimitiveTypeField__TypeAssignment_0 : ( ruleVARIABLE_TYPE ) ;
    public final void rule__PrimitiveTypeField__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5427:1: ( ( ruleVARIABLE_TYPE ) )
            // InternalAedit.g:5428:2: ( ruleVARIABLE_TYPE )
            {
            // InternalAedit.g:5428:2: ( ruleVARIABLE_TYPE )
            // InternalAedit.g:5429:3: ruleVARIABLE_TYPE
            {
             before(grammarAccess.getPrimitiveTypeFieldAccess().getTypeVARIABLE_TYPEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVARIABLE_TYPE();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeFieldAccess().getTypeVARIABLE_TYPEParserRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__PrimitiveTypeField__VarNameAssignment_1"
    // InternalAedit.g:5438:1: rule__PrimitiveTypeField__VarNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PrimitiveTypeField__VarNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5442:1: ( ( RULE_ID ) )
            // InternalAedit.g:5443:2: ( RULE_ID )
            {
            // InternalAedit.g:5443:2: ( RULE_ID )
            // InternalAedit.g:5444:3: RULE_ID
            {
             before(grammarAccess.getPrimitiveTypeFieldAccess().getVarNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeFieldAccess().getVarNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__VarNameAssignment_1"


    // $ANTLR start "rule__PrimitiveTypeField__ValueAssignment_2_1"
    // InternalAedit.g:5453:1: rule__PrimitiveTypeField__ValueAssignment_2_1 : ( ruleValue ) ;
    public final void rule__PrimitiveTypeField__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5457:1: ( ( ruleValue ) )
            // InternalAedit.g:5458:2: ( ruleValue )
            {
            // InternalAedit.g:5458:2: ( ruleValue )
            // InternalAedit.g:5459:3: ruleValue
            {
             before(grammarAccess.getPrimitiveTypeFieldAccess().getValueValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeFieldAccess().getValueValueParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeField__ValueAssignment_2_1"


    // $ANTLR start "rule__FloatValue__ValAssignment"
    // InternalAedit.g:5468:1: rule__FloatValue__ValAssignment : ( ruleReal ) ;
    public final void rule__FloatValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5472:1: ( ( ruleReal ) )
            // InternalAedit.g:5473:2: ( ruleReal )
            {
            // InternalAedit.g:5473:2: ( ruleReal )
            // InternalAedit.g:5474:3: ruleReal
            {
             before(grammarAccess.getFloatValueAccess().getValRealParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleReal();

            state._fsp--;

             after(grammarAccess.getFloatValueAccess().getValRealParserRuleCall_0()); 

            }


            }

        }
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
    // InternalAedit.g:5483:1: rule__StringValue__ValAssignment : ( RULE_ID ) ;
    public final void rule__StringValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5487:1: ( ( RULE_ID ) )
            // InternalAedit.g:5488:2: ( RULE_ID )
            {
            // InternalAedit.g:5488:2: ( RULE_ID )
            // InternalAedit.g:5489:3: RULE_ID
            {
             before(grammarAccess.getStringValueAccess().getValIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getValIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalAedit.g:5498:1: rule__IntValue__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5502:1: ( ( RULE_INT ) )
            // InternalAedit.g:5503:2: ( RULE_INT )
            {
            // InternalAedit.g:5503:2: ( RULE_INT )
            // InternalAedit.g:5504:3: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntValueAccess().getValINTTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalAedit.g:5513:1: rule__Null__ValAssignment : ( ( 'null' ) ) ;
    public final void rule__Null__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5517:1: ( ( ( 'null' ) ) )
            // InternalAedit.g:5518:2: ( ( 'null' ) )
            {
            // InternalAedit.g:5518:2: ( ( 'null' ) )
            // InternalAedit.g:5519:3: ( 'null' )
            {
             before(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            // InternalAedit.g:5520:3: ( 'null' )
            // InternalAedit.g:5521:4: 'null'
            {
             before(grammarAccess.getNullAccess().getValNullKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getNullAccess().getValNullKeyword_0()); 

            }

             after(grammarAccess.getNullAccess().getValNullKeyword_0()); 

            }


            }

        }
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
    // InternalAedit.g:5532:1: rule__BooleanValue__ValAssignment : ( ruleBoolean ) ;
    public final void rule__BooleanValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5536:1: ( ( ruleBoolean ) )
            // InternalAedit.g:5537:2: ( ruleBoolean )
            {
            // InternalAedit.g:5537:2: ( ruleBoolean )
            // InternalAedit.g:5538:3: ruleBoolean
            {
             before(grammarAccess.getBooleanValueAccess().getValBooleanParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanValueAccess().getValBooleanParserRuleCall_0()); 

            }


            }

        }
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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000030C1000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000030C0000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000001B081000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000001B080000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000003081000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003080000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000013F0020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000003F0022L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000003F0020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000C0000006030L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000003F0000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000400000002L});

}