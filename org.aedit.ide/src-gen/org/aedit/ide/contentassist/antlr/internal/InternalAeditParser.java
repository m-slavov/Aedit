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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'record'", "'error'", "'enum'", "'void'", "'int'", "'double'", "'string'", "'long'", "'feature'", "'{'", "'}'", "':'", "'use'", "';'", "'ruleset'", "'rule'", "'change'", "'add.at'", "'('", "')'", "'.'", "'remove'", "'rename'", "'=>'", "'set_val'", "'set_type'", "'='", "'-'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalAedit.g:637:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:641:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalAedit.g:642:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalAedit.g:642:2: ( ( rule__Field__Group__0 ) )
            // InternalAedit.g:643:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalAedit.g:644:3: ( rule__Field__Group__0 )
            // InternalAedit.g:644:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleValue"
    // InternalAedit.g:653:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalAedit.g:654:1: ( ruleValue EOF )
            // InternalAedit.g:655:1: ruleValue EOF
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
    // InternalAedit.g:662:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:666:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalAedit.g:667:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalAedit.g:667:2: ( ( rule__Value__Alternatives ) )
            // InternalAedit.g:668:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalAedit.g:669:3: ( rule__Value__Alternatives )
            // InternalAedit.g:669:4: rule__Value__Alternatives
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
    // InternalAedit.g:678:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // InternalAedit.g:679:1: ( ruleFloatValue EOF )
            // InternalAedit.g:680:1: ruleFloatValue EOF
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
    // InternalAedit.g:687:1: ruleFloatValue : ( ( rule__FloatValue__ValAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:691:2: ( ( ( rule__FloatValue__ValAssignment ) ) )
            // InternalAedit.g:692:2: ( ( rule__FloatValue__ValAssignment ) )
            {
            // InternalAedit.g:692:2: ( ( rule__FloatValue__ValAssignment ) )
            // InternalAedit.g:693:3: ( rule__FloatValue__ValAssignment )
            {
             before(grammarAccess.getFloatValueAccess().getValAssignment()); 
            // InternalAedit.g:694:3: ( rule__FloatValue__ValAssignment )
            // InternalAedit.g:694:4: rule__FloatValue__ValAssignment
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
    // InternalAedit.g:703:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalAedit.g:704:1: ( ruleStringValue EOF )
            // InternalAedit.g:705:1: ruleStringValue EOF
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
    // InternalAedit.g:712:1: ruleStringValue : ( ( rule__StringValue__ValAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:716:2: ( ( ( rule__StringValue__ValAssignment ) ) )
            // InternalAedit.g:717:2: ( ( rule__StringValue__ValAssignment ) )
            {
            // InternalAedit.g:717:2: ( ( rule__StringValue__ValAssignment ) )
            // InternalAedit.g:718:3: ( rule__StringValue__ValAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValAssignment()); 
            // InternalAedit.g:719:3: ( rule__StringValue__ValAssignment )
            // InternalAedit.g:719:4: rule__StringValue__ValAssignment
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
    // InternalAedit.g:728:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalAedit.g:729:1: ( ruleIntValue EOF )
            // InternalAedit.g:730:1: ruleIntValue EOF
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
    // InternalAedit.g:737:1: ruleIntValue : ( ( rule__IntValue__ValAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:741:2: ( ( ( rule__IntValue__ValAssignment ) ) )
            // InternalAedit.g:742:2: ( ( rule__IntValue__ValAssignment ) )
            {
            // InternalAedit.g:742:2: ( ( rule__IntValue__ValAssignment ) )
            // InternalAedit.g:743:3: ( rule__IntValue__ValAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValAssignment()); 
            // InternalAedit.g:744:3: ( rule__IntValue__ValAssignment )
            // InternalAedit.g:744:4: rule__IntValue__ValAssignment
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


    // $ANTLR start "entryRuleReal"
    // InternalAedit.g:753:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // InternalAedit.g:754:1: ( ruleReal EOF )
            // InternalAedit.g:755:1: ruleReal EOF
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
    // InternalAedit.g:762:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:766:2: ( ( ( rule__Real__Group__0 ) ) )
            // InternalAedit.g:767:2: ( ( rule__Real__Group__0 ) )
            {
            // InternalAedit.g:767:2: ( ( rule__Real__Group__0 ) )
            // InternalAedit.g:768:3: ( rule__Real__Group__0 )
            {
             before(grammarAccess.getRealAccess().getGroup()); 
            // InternalAedit.g:769:3: ( rule__Real__Group__0 )
            // InternalAedit.g:769:4: rule__Real__Group__0
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


    // $ANTLR start "entryRuleSCHEMA_TYPE"
    // InternalAedit.g:778:1: entryRuleSCHEMA_TYPE : ruleSCHEMA_TYPE EOF ;
    public final void entryRuleSCHEMA_TYPE() throws RecognitionException {
        try {
            // InternalAedit.g:779:1: ( ruleSCHEMA_TYPE EOF )
            // InternalAedit.g:780:1: ruleSCHEMA_TYPE EOF
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
    // InternalAedit.g:787:1: ruleSCHEMA_TYPE : ( ( rule__SCHEMA_TYPE__Alternatives ) ) ;
    public final void ruleSCHEMA_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:791:2: ( ( ( rule__SCHEMA_TYPE__Alternatives ) ) )
            // InternalAedit.g:792:2: ( ( rule__SCHEMA_TYPE__Alternatives ) )
            {
            // InternalAedit.g:792:2: ( ( rule__SCHEMA_TYPE__Alternatives ) )
            // InternalAedit.g:793:3: ( rule__SCHEMA_TYPE__Alternatives )
            {
             before(grammarAccess.getSCHEMA_TYPEAccess().getAlternatives()); 
            // InternalAedit.g:794:3: ( rule__SCHEMA_TYPE__Alternatives )
            // InternalAedit.g:794:4: rule__SCHEMA_TYPE__Alternatives
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
    // InternalAedit.g:803:1: entryRuleVARIABLE_TYPE : ruleVARIABLE_TYPE EOF ;
    public final void entryRuleVARIABLE_TYPE() throws RecognitionException {
        try {
            // InternalAedit.g:804:1: ( ruleVARIABLE_TYPE EOF )
            // InternalAedit.g:805:1: ruleVARIABLE_TYPE EOF
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
    // InternalAedit.g:812:1: ruleVARIABLE_TYPE : ( ( rule__VARIABLE_TYPE__Alternatives ) ) ;
    public final void ruleVARIABLE_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:816:2: ( ( ( rule__VARIABLE_TYPE__Alternatives ) ) )
            // InternalAedit.g:817:2: ( ( rule__VARIABLE_TYPE__Alternatives ) )
            {
            // InternalAedit.g:817:2: ( ( rule__VARIABLE_TYPE__Alternatives ) )
            // InternalAedit.g:818:3: ( rule__VARIABLE_TYPE__Alternatives )
            {
             before(grammarAccess.getVARIABLE_TYPEAccess().getAlternatives()); 
            // InternalAedit.g:819:3: ( rule__VARIABLE_TYPE__Alternatives )
            // InternalAedit.g:819:4: rule__VARIABLE_TYPE__Alternatives
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
    // InternalAedit.g:828:1: entryRuleQN : ruleQN EOF ;
    public final void entryRuleQN() throws RecognitionException {
        try {
            // InternalAedit.g:829:1: ( ruleQN EOF )
            // InternalAedit.g:830:1: ruleQN EOF
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
    // InternalAedit.g:837:1: ruleQN : ( ( rule__QN__Group__0 ) ) ;
    public final void ruleQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:841:2: ( ( ( rule__QN__Group__0 ) ) )
            // InternalAedit.g:842:2: ( ( rule__QN__Group__0 ) )
            {
            // InternalAedit.g:842:2: ( ( rule__QN__Group__0 ) )
            // InternalAedit.g:843:3: ( rule__QN__Group__0 )
            {
             before(grammarAccess.getQNAccess().getGroup()); 
            // InternalAedit.g:844:3: ( rule__QN__Group__0 )
            // InternalAedit.g:844:4: rule__QN__Group__0
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
    // InternalAedit.g:852:1: rule__GenericRule__Alternatives : ( ( ruleRenameSchema ) | ( ruleRemoveSchema ) | ( ruleAdd ) | ( ruleChangeSchema ) | ( ruleChangeEnum ) );
    public final void rule__GenericRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:856:1: ( ( ruleRenameSchema ) | ( ruleRemoveSchema ) | ( ruleAdd ) | ( ruleChangeSchema ) | ( ruleChangeEnum ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt1=1;
                }
                break;
            case 32:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 27:
                {
                int LA1_4 = input.LA(2);

                if ( (LA1_4==13) ) {
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
                    // InternalAedit.g:857:2: ( ruleRenameSchema )
                    {
                    // InternalAedit.g:857:2: ( ruleRenameSchema )
                    // InternalAedit.g:858:3: ruleRenameSchema
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
                    // InternalAedit.g:863:2: ( ruleRemoveSchema )
                    {
                    // InternalAedit.g:863:2: ( ruleRemoveSchema )
                    // InternalAedit.g:864:3: ruleRemoveSchema
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
                    // InternalAedit.g:869:2: ( ruleAdd )
                    {
                    // InternalAedit.g:869:2: ( ruleAdd )
                    // InternalAedit.g:870:3: ruleAdd
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
                    // InternalAedit.g:875:2: ( ruleChangeSchema )
                    {
                    // InternalAedit.g:875:2: ( ruleChangeSchema )
                    // InternalAedit.g:876:3: ruleChangeSchema
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
                    // InternalAedit.g:881:2: ( ruleChangeEnum )
                    {
                    // InternalAedit.g:881:2: ( ruleChangeEnum )
                    // InternalAedit.g:882:3: ruleChangeEnum
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
    // InternalAedit.g:891:1: rule__SchemaRule__Alternatives : ( ( ruleRemoveVariable ) | ( ruleRenameVariable ) | ( ruleAddVariable ) | ( ruleChangeDefValue ) | ( ruleChangeType ) );
    public final void rule__SchemaRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:895:1: ( ( ruleRemoveVariable ) | ( ruleRenameVariable ) | ( ruleAddVariable ) | ( ruleChangeDefValue ) | ( ruleChangeType ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 35:
                {
                alt2=4;
                }
                break;
            case 36:
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
                    // InternalAedit.g:896:2: ( ruleRemoveVariable )
                    {
                    // InternalAedit.g:896:2: ( ruleRemoveVariable )
                    // InternalAedit.g:897:3: ruleRemoveVariable
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
                    // InternalAedit.g:902:2: ( ruleRenameVariable )
                    {
                    // InternalAedit.g:902:2: ( ruleRenameVariable )
                    // InternalAedit.g:903:3: ruleRenameVariable
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
                    // InternalAedit.g:908:2: ( ruleAddVariable )
                    {
                    // InternalAedit.g:908:2: ( ruleAddVariable )
                    // InternalAedit.g:909:3: ruleAddVariable
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
                    // InternalAedit.g:914:2: ( ruleChangeDefValue )
                    {
                    // InternalAedit.g:914:2: ( ruleChangeDefValue )
                    // InternalAedit.g:915:3: ruleChangeDefValue
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
                    // InternalAedit.g:920:2: ( ruleChangeType )
                    {
                    // InternalAedit.g:920:2: ( ruleChangeType )
                    // InternalAedit.g:921:3: ruleChangeType
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
    // InternalAedit.g:930:1: rule__EnumRule__Alternatives : ( ( ruleRemoveEnum ) | ( ruleRenameEnum ) | ( ruleAddEnum ) );
    public final void rule__EnumRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:934:1: ( ( ruleRemoveEnum ) | ( ruleRenameEnum ) | ( ruleAddEnum ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt3=1;
                }
                break;
            case 33:
                {
                alt3=2;
                }
                break;
            case 28:
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
                    // InternalAedit.g:935:2: ( ruleRemoveEnum )
                    {
                    // InternalAedit.g:935:2: ( ruleRemoveEnum )
                    // InternalAedit.g:936:3: ruleRemoveEnum
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
                    // InternalAedit.g:941:2: ( ruleRenameEnum )
                    {
                    // InternalAedit.g:941:2: ( ruleRenameEnum )
                    // InternalAedit.g:942:3: ruleRenameEnum
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
                    // InternalAedit.g:947:2: ( ruleAddEnum )
                    {
                    // InternalAedit.g:947:2: ( ruleAddEnum )
                    // InternalAedit.g:948:3: ruleAddEnum
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
    // InternalAedit.g:957:1: rule__ChangeSchema__Alternatives_1 : ( ( 'record' ) | ( 'error' ) );
    public final void rule__ChangeSchema__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:961:1: ( ( 'record' ) | ( 'error' ) )
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
                    // InternalAedit.g:962:2: ( 'record' )
                    {
                    // InternalAedit.g:962:2: ( 'record' )
                    // InternalAedit.g:963:3: 'record'
                    {
                     before(grammarAccess.getChangeSchemaAccess().getRecordKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getChangeSchemaAccess().getRecordKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:968:2: ( 'error' )
                    {
                    // InternalAedit.g:968:2: ( 'error' )
                    // InternalAedit.g:969:3: 'error'
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
    // InternalAedit.g:978:1: rule__Add__Alternatives : ( ( ruleAddRecord ) | ( ruleAddEnumeration ) );
    public final void rule__Add__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:982:1: ( ( ruleAddRecord ) | ( ruleAddEnumeration ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==29) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==RULE_INT) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==30) ) {
                            int LA5_4 = input.LA(5);

                            if ( (LA5_4==13) ) {
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
                    // InternalAedit.g:983:2: ( ruleAddRecord )
                    {
                    // InternalAedit.g:983:2: ( ruleAddRecord )
                    // InternalAedit.g:984:3: ruleAddRecord
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
                    // InternalAedit.g:989:2: ( ruleAddEnumeration )
                    {
                    // InternalAedit.g:989:2: ( ruleAddEnumeration )
                    // InternalAedit.g:990:3: ruleAddEnumeration
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


    // $ANTLR start "rule__Value__Alternatives"
    // InternalAedit.g:999:1: rule__Value__Alternatives : ( ( ruleFloatValue ) | ( ruleIntValue ) | ( ruleStringValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1003:1: ( ( ruleFloatValue ) | ( ruleIntValue ) | ( ruleStringValue ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==EOF||(LA6_2>=14 && LA6_2<=18)||LA6_2==21||LA6_2==24) ) {
                    alt6=2;
                }
                else if ( (LA6_2==31) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAedit.g:1004:2: ( ruleFloatValue )
                    {
                    // InternalAedit.g:1004:2: ( ruleFloatValue )
                    // InternalAedit.g:1005:3: ruleFloatValue
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
                    // InternalAedit.g:1010:2: ( ruleIntValue )
                    {
                    // InternalAedit.g:1010:2: ( ruleIntValue )
                    // InternalAedit.g:1011:3: ruleIntValue
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
                    // InternalAedit.g:1016:2: ( ruleStringValue )
                    {
                    // InternalAedit.g:1016:2: ( ruleStringValue )
                    // InternalAedit.g:1017:3: ruleStringValue
                    {
                     before(grammarAccess.getValueAccess().getStringValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStringValueParserRuleCall_2()); 

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


    // $ANTLR start "rule__SCHEMA_TYPE__Alternatives"
    // InternalAedit.g:1026:1: rule__SCHEMA_TYPE__Alternatives : ( ( 'record' ) | ( 'enum' ) );
    public final void rule__SCHEMA_TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1030:1: ( ( 'record' ) | ( 'enum' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAedit.g:1031:2: ( 'record' )
                    {
                    // InternalAedit.g:1031:2: ( 'record' )
                    // InternalAedit.g:1032:3: 'record'
                    {
                     before(grammarAccess.getSCHEMA_TYPEAccess().getRecordKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSCHEMA_TYPEAccess().getRecordKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1037:2: ( 'enum' )
                    {
                    // InternalAedit.g:1037:2: ( 'enum' )
                    // InternalAedit.g:1038:3: 'enum'
                    {
                     before(grammarAccess.getSCHEMA_TYPEAccess().getEnumKeyword_1()); 
                    match(input,13,FOLLOW_2); 
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
    // InternalAedit.g:1047:1: rule__VARIABLE_TYPE__Alternatives : ( ( 'void' ) | ( 'int' ) | ( 'double' ) | ( 'string' ) | ( 'long' ) );
    public final void rule__VARIABLE_TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1051:1: ( ( 'void' ) | ( 'int' ) | ( 'double' ) | ( 'string' ) | ( 'long' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
                {
                alt8=3;
                }
                break;
            case 17:
                {
                alt8=4;
                }
                break;
            case 18:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAedit.g:1052:2: ( 'void' )
                    {
                    // InternalAedit.g:1052:2: ( 'void' )
                    // InternalAedit.g:1053:3: 'void'
                    {
                     before(grammarAccess.getVARIABLE_TYPEAccess().getVoidKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVARIABLE_TYPEAccess().getVoidKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAedit.g:1058:2: ( 'int' )
                    {
                    // InternalAedit.g:1058:2: ( 'int' )
                    // InternalAedit.g:1059:3: 'int'
                    {
                     before(grammarAccess.getVARIABLE_TYPEAccess().getIntKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getVARIABLE_TYPEAccess().getIntKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAedit.g:1064:2: ( 'double' )
                    {
                    // InternalAedit.g:1064:2: ( 'double' )
                    // InternalAedit.g:1065:3: 'double'
                    {
                     before(grammarAccess.getVARIABLE_TYPEAccess().getDoubleKeyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getVARIABLE_TYPEAccess().getDoubleKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAedit.g:1070:2: ( 'string' )
                    {
                    // InternalAedit.g:1070:2: ( 'string' )
                    // InternalAedit.g:1071:3: 'string'
                    {
                     before(grammarAccess.getVARIABLE_TYPEAccess().getStringKeyword_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVARIABLE_TYPEAccess().getStringKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAedit.g:1076:2: ( 'long' )
                    {
                    // InternalAedit.g:1076:2: ( 'long' )
                    // InternalAedit.g:1077:3: 'long'
                    {
                     before(grammarAccess.getVARIABLE_TYPEAccess().getLongKeyword_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getVARIABLE_TYPEAccess().getLongKeyword_4()); 

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
    // InternalAedit.g:1086:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1090:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAedit.g:1091:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalAedit.g:1098:1: rule__Model__Group__0__Impl : ( ( rule__Model__RuleDeclarationsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1102:1: ( ( ( rule__Model__RuleDeclarationsAssignment_0 )* ) )
            // InternalAedit.g:1103:1: ( ( rule__Model__RuleDeclarationsAssignment_0 )* )
            {
            // InternalAedit.g:1103:1: ( ( rule__Model__RuleDeclarationsAssignment_0 )* )
            // InternalAedit.g:1104:2: ( rule__Model__RuleDeclarationsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getRuleDeclarationsAssignment_0()); 
            // InternalAedit.g:1105:2: ( rule__Model__RuleDeclarationsAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAedit.g:1105:3: rule__Model__RuleDeclarationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__RuleDeclarationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalAedit.g:1113:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1117:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAedit.g:1118:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalAedit.g:1125:1: rule__Model__Group__1__Impl : ( ( rule__Model__RuleMapsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1129:1: ( ( ( rule__Model__RuleMapsAssignment_1 )* ) )
            // InternalAedit.g:1130:1: ( ( rule__Model__RuleMapsAssignment_1 )* )
            {
            // InternalAedit.g:1130:1: ( ( rule__Model__RuleMapsAssignment_1 )* )
            // InternalAedit.g:1131:2: ( rule__Model__RuleMapsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getRuleMapsAssignment_1()); 
            // InternalAedit.g:1132:2: ( rule__Model__RuleMapsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAedit.g:1132:3: rule__Model__RuleMapsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__RuleMapsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalAedit.g:1140:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1144:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalAedit.g:1145:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalAedit.g:1152:1: rule__Model__Group__2__Impl : ( ( rule__Model__FeaturesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1156:1: ( ( ( rule__Model__FeaturesAssignment_2 )* ) )
            // InternalAedit.g:1157:1: ( ( rule__Model__FeaturesAssignment_2 )* )
            {
            // InternalAedit.g:1157:1: ( ( rule__Model__FeaturesAssignment_2 )* )
            // InternalAedit.g:1158:2: ( rule__Model__FeaturesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getFeaturesAssignment_2()); 
            // InternalAedit.g:1159:2: ( rule__Model__FeaturesAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAedit.g:1159:3: rule__Model__FeaturesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__FeaturesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalAedit.g:1167:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1171:1: ( rule__Model__Group__3__Impl )
            // InternalAedit.g:1172:2: rule__Model__Group__3__Impl
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
    // InternalAedit.g:1178:1: rule__Model__Group__3__Impl : ( ( rule__Model__FeatureMapsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1182:1: ( ( ( rule__Model__FeatureMapsAssignment_3 )* ) )
            // InternalAedit.g:1183:1: ( ( rule__Model__FeatureMapsAssignment_3 )* )
            {
            // InternalAedit.g:1183:1: ( ( rule__Model__FeatureMapsAssignment_3 )* )
            // InternalAedit.g:1184:2: ( rule__Model__FeatureMapsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getFeatureMapsAssignment_3()); 
            // InternalAedit.g:1185:2: ( rule__Model__FeatureMapsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAedit.g:1185:3: rule__Model__FeatureMapsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__FeatureMapsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalAedit.g:1194:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1198:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalAedit.g:1199:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
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
    // InternalAedit.g:1206:1: rule__Feature__Group__0__Impl : ( 'feature' ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1210:1: ( ( 'feature' ) )
            // InternalAedit.g:1211:1: ( 'feature' )
            {
            // InternalAedit.g:1211:1: ( 'feature' )
            // InternalAedit.g:1212:2: 'feature'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalAedit.g:1221:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1225:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalAedit.g:1226:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
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
    // InternalAedit.g:1233:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1237:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalAedit.g:1238:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalAedit.g:1238:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalAedit.g:1239:2: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalAedit.g:1240:2: ( rule__Feature__NameAssignment_1 )
            // InternalAedit.g:1240:3: rule__Feature__NameAssignment_1
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
    // InternalAedit.g:1248:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1252:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalAedit.g:1253:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
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
    // InternalAedit.g:1260:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__Group_2__0 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1264:1: ( ( ( rule__Feature__Group_2__0 )? ) )
            // InternalAedit.g:1265:1: ( ( rule__Feature__Group_2__0 )? )
            {
            // InternalAedit.g:1265:1: ( ( rule__Feature__Group_2__0 )? )
            // InternalAedit.g:1266:2: ( rule__Feature__Group_2__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_2()); 
            // InternalAedit.g:1267:2: ( rule__Feature__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAedit.g:1267:3: rule__Feature__Group_2__0
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
    // InternalAedit.g:1275:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1279:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalAedit.g:1280:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
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
    // InternalAedit.g:1287:1: rule__Feature__Group__3__Impl : ( '{' ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1291:1: ( ( '{' ) )
            // InternalAedit.g:1292:1: ( '{' )
            {
            // InternalAedit.g:1292:1: ( '{' )
            // InternalAedit.g:1293:2: '{'
            {
             before(grammarAccess.getFeatureAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAedit.g:1302:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1306:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalAedit.g:1307:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
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
    // InternalAedit.g:1314:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__RuleMapsAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1318:1: ( ( ( rule__Feature__RuleMapsAssignment_4 )* ) )
            // InternalAedit.g:1319:1: ( ( rule__Feature__RuleMapsAssignment_4 )* )
            {
            // InternalAedit.g:1319:1: ( ( rule__Feature__RuleMapsAssignment_4 )* )
            // InternalAedit.g:1320:2: ( rule__Feature__RuleMapsAssignment_4 )*
            {
             before(grammarAccess.getFeatureAccess().getRuleMapsAssignment_4()); 
            // InternalAedit.g:1321:2: ( rule__Feature__RuleMapsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAedit.g:1321:3: rule__Feature__RuleMapsAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Feature__RuleMapsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalAedit.g:1329:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1333:1: ( rule__Feature__Group__5__Impl )
            // InternalAedit.g:1334:2: rule__Feature__Group__5__Impl
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
    // InternalAedit.g:1340:1: rule__Feature__Group__5__Impl : ( '}' ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1344:1: ( ( '}' ) )
            // InternalAedit.g:1345:1: ( '}' )
            {
            // InternalAedit.g:1345:1: ( '}' )
            // InternalAedit.g:1346:2: '}'
            {
             before(grammarAccess.getFeatureAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAedit.g:1356:1: rule__Feature__Group_2__0 : rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 ;
    public final void rule__Feature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1360:1: ( rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 )
            // InternalAedit.g:1361:2: rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1
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
    // InternalAedit.g:1368:1: rule__Feature__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Feature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1372:1: ( ( ':' ) )
            // InternalAedit.g:1373:1: ( ':' )
            {
            // InternalAedit.g:1373:1: ( ':' )
            // InternalAedit.g:1374:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAedit.g:1383:1: rule__Feature__Group_2__1 : rule__Feature__Group_2__1__Impl ;
    public final void rule__Feature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1387:1: ( rule__Feature__Group_2__1__Impl )
            // InternalAedit.g:1388:2: rule__Feature__Group_2__1__Impl
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
    // InternalAedit.g:1394:1: rule__Feature__Group_2__1__Impl : ( ( rule__Feature__ExtendAssignment_2_1 ) ) ;
    public final void rule__Feature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1398:1: ( ( ( rule__Feature__ExtendAssignment_2_1 ) ) )
            // InternalAedit.g:1399:1: ( ( rule__Feature__ExtendAssignment_2_1 ) )
            {
            // InternalAedit.g:1399:1: ( ( rule__Feature__ExtendAssignment_2_1 ) )
            // InternalAedit.g:1400:2: ( rule__Feature__ExtendAssignment_2_1 )
            {
             before(grammarAccess.getFeatureAccess().getExtendAssignment_2_1()); 
            // InternalAedit.g:1401:2: ( rule__Feature__ExtendAssignment_2_1 )
            // InternalAedit.g:1401:3: rule__Feature__ExtendAssignment_2_1
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
    // InternalAedit.g:1410:1: rule__FeatureMap__Group__0 : rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1 ;
    public final void rule__FeatureMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1414:1: ( rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1 )
            // InternalAedit.g:1415:2: rule__FeatureMap__Group__0__Impl rule__FeatureMap__Group__1
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
    // InternalAedit.g:1422:1: rule__FeatureMap__Group__0__Impl : ( 'use' ) ;
    public final void rule__FeatureMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1426:1: ( ( 'use' ) )
            // InternalAedit.g:1427:1: ( 'use' )
            {
            // InternalAedit.g:1427:1: ( 'use' )
            // InternalAedit.g:1428:2: 'use'
            {
             before(grammarAccess.getFeatureMapAccess().getUseKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAedit.g:1437:1: rule__FeatureMap__Group__1 : rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2 ;
    public final void rule__FeatureMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1441:1: ( rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2 )
            // InternalAedit.g:1442:2: rule__FeatureMap__Group__1__Impl rule__FeatureMap__Group__2
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
    // InternalAedit.g:1449:1: rule__FeatureMap__Group__1__Impl : ( ( rule__FeatureMap__NameAssignment_1 ) ) ;
    public final void rule__FeatureMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1453:1: ( ( ( rule__FeatureMap__NameAssignment_1 ) ) )
            // InternalAedit.g:1454:1: ( ( rule__FeatureMap__NameAssignment_1 ) )
            {
            // InternalAedit.g:1454:1: ( ( rule__FeatureMap__NameAssignment_1 ) )
            // InternalAedit.g:1455:2: ( rule__FeatureMap__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureMapAccess().getNameAssignment_1()); 
            // InternalAedit.g:1456:2: ( rule__FeatureMap__NameAssignment_1 )
            // InternalAedit.g:1456:3: rule__FeatureMap__NameAssignment_1
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
    // InternalAedit.g:1464:1: rule__FeatureMap__Group__2 : rule__FeatureMap__Group__2__Impl ;
    public final void rule__FeatureMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1468:1: ( rule__FeatureMap__Group__2__Impl )
            // InternalAedit.g:1469:2: rule__FeatureMap__Group__2__Impl
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
    // InternalAedit.g:1475:1: rule__FeatureMap__Group__2__Impl : ( ';' ) ;
    public final void rule__FeatureMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1479:1: ( ( ';' ) )
            // InternalAedit.g:1480:1: ( ';' )
            {
            // InternalAedit.g:1480:1: ( ';' )
            // InternalAedit.g:1481:2: ';'
            {
             before(grammarAccess.getFeatureMapAccess().getSemicolonKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAedit.g:1491:1: rule__RuleMap__Group__0 : rule__RuleMap__Group__0__Impl rule__RuleMap__Group__1 ;
    public final void rule__RuleMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1495:1: ( rule__RuleMap__Group__0__Impl rule__RuleMap__Group__1 )
            // InternalAedit.g:1496:2: rule__RuleMap__Group__0__Impl rule__RuleMap__Group__1
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
    // InternalAedit.g:1503:1: rule__RuleMap__Group__0__Impl : ( 'ruleset' ) ;
    public final void rule__RuleMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1507:1: ( ( 'ruleset' ) )
            // InternalAedit.g:1508:1: ( 'ruleset' )
            {
            // InternalAedit.g:1508:1: ( 'ruleset' )
            // InternalAedit.g:1509:2: 'ruleset'
            {
             before(grammarAccess.getRuleMapAccess().getRulesetKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAedit.g:1518:1: rule__RuleMap__Group__1 : rule__RuleMap__Group__1__Impl rule__RuleMap__Group__2 ;
    public final void rule__RuleMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1522:1: ( rule__RuleMap__Group__1__Impl rule__RuleMap__Group__2 )
            // InternalAedit.g:1523:2: rule__RuleMap__Group__1__Impl rule__RuleMap__Group__2
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
    // InternalAedit.g:1530:1: rule__RuleMap__Group__1__Impl : ( ( rule__RuleMap__NameAssignment_1 ) ) ;
    public final void rule__RuleMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1534:1: ( ( ( rule__RuleMap__NameAssignment_1 ) ) )
            // InternalAedit.g:1535:1: ( ( rule__RuleMap__NameAssignment_1 ) )
            {
            // InternalAedit.g:1535:1: ( ( rule__RuleMap__NameAssignment_1 ) )
            // InternalAedit.g:1536:2: ( rule__RuleMap__NameAssignment_1 )
            {
             before(grammarAccess.getRuleMapAccess().getNameAssignment_1()); 
            // InternalAedit.g:1537:2: ( rule__RuleMap__NameAssignment_1 )
            // InternalAedit.g:1537:3: rule__RuleMap__NameAssignment_1
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
    // InternalAedit.g:1545:1: rule__RuleMap__Group__2 : rule__RuleMap__Group__2__Impl rule__RuleMap__Group__3 ;
    public final void rule__RuleMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1549:1: ( rule__RuleMap__Group__2__Impl rule__RuleMap__Group__3 )
            // InternalAedit.g:1550:2: rule__RuleMap__Group__2__Impl rule__RuleMap__Group__3
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
    // InternalAedit.g:1557:1: rule__RuleMap__Group__2__Impl : ( '{' ) ;
    public final void rule__RuleMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1561:1: ( ( '{' ) )
            // InternalAedit.g:1562:1: ( '{' )
            {
            // InternalAedit.g:1562:1: ( '{' )
            // InternalAedit.g:1563:2: '{'
            {
             before(grammarAccess.getRuleMapAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAedit.g:1572:1: rule__RuleMap__Group__3 : rule__RuleMap__Group__3__Impl rule__RuleMap__Group__4 ;
    public final void rule__RuleMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1576:1: ( rule__RuleMap__Group__3__Impl rule__RuleMap__Group__4 )
            // InternalAedit.g:1577:2: rule__RuleMap__Group__3__Impl rule__RuleMap__Group__4
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
    // InternalAedit.g:1584:1: rule__RuleMap__Group__3__Impl : ( ( rule__RuleMap__RulesAssignment_3 )* ) ;
    public final void rule__RuleMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1588:1: ( ( ( rule__RuleMap__RulesAssignment_3 )* ) )
            // InternalAedit.g:1589:1: ( ( rule__RuleMap__RulesAssignment_3 )* )
            {
            // InternalAedit.g:1589:1: ( ( rule__RuleMap__RulesAssignment_3 )* )
            // InternalAedit.g:1590:2: ( rule__RuleMap__RulesAssignment_3 )*
            {
             before(grammarAccess.getRuleMapAccess().getRulesAssignment_3()); 
            // InternalAedit.g:1591:2: ( rule__RuleMap__RulesAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAedit.g:1591:3: rule__RuleMap__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RuleMap__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalAedit.g:1599:1: rule__RuleMap__Group__4 : rule__RuleMap__Group__4__Impl ;
    public final void rule__RuleMap__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1603:1: ( rule__RuleMap__Group__4__Impl )
            // InternalAedit.g:1604:2: rule__RuleMap__Group__4__Impl
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
    // InternalAedit.g:1610:1: rule__RuleMap__Group__4__Impl : ( '}' ) ;
    public final void rule__RuleMap__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1614:1: ( ( '}' ) )
            // InternalAedit.g:1615:1: ( '}' )
            {
            // InternalAedit.g:1615:1: ( '}' )
            // InternalAedit.g:1616:2: '}'
            {
             before(grammarAccess.getRuleMapAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAedit.g:1626:1: rule__RuleDeclaration__Group__0 : rule__RuleDeclaration__Group__0__Impl rule__RuleDeclaration__Group__1 ;
    public final void rule__RuleDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1630:1: ( rule__RuleDeclaration__Group__0__Impl rule__RuleDeclaration__Group__1 )
            // InternalAedit.g:1631:2: rule__RuleDeclaration__Group__0__Impl rule__RuleDeclaration__Group__1
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
    // InternalAedit.g:1638:1: rule__RuleDeclaration__Group__0__Impl : ( 'rule' ) ;
    public final void rule__RuleDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1642:1: ( ( 'rule' ) )
            // InternalAedit.g:1643:1: ( 'rule' )
            {
            // InternalAedit.g:1643:1: ( 'rule' )
            // InternalAedit.g:1644:2: 'rule'
            {
             before(grammarAccess.getRuleDeclarationAccess().getRuleKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAedit.g:1653:1: rule__RuleDeclaration__Group__1 : rule__RuleDeclaration__Group__1__Impl rule__RuleDeclaration__Group__2 ;
    public final void rule__RuleDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1657:1: ( rule__RuleDeclaration__Group__1__Impl rule__RuleDeclaration__Group__2 )
            // InternalAedit.g:1658:2: rule__RuleDeclaration__Group__1__Impl rule__RuleDeclaration__Group__2
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
    // InternalAedit.g:1665:1: rule__RuleDeclaration__Group__1__Impl : ( ( rule__RuleDeclaration__NameAssignment_1 ) ) ;
    public final void rule__RuleDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1669:1: ( ( ( rule__RuleDeclaration__NameAssignment_1 ) ) )
            // InternalAedit.g:1670:1: ( ( rule__RuleDeclaration__NameAssignment_1 ) )
            {
            // InternalAedit.g:1670:1: ( ( rule__RuleDeclaration__NameAssignment_1 ) )
            // InternalAedit.g:1671:2: ( rule__RuleDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getRuleDeclarationAccess().getNameAssignment_1()); 
            // InternalAedit.g:1672:2: ( rule__RuleDeclaration__NameAssignment_1 )
            // InternalAedit.g:1672:3: rule__RuleDeclaration__NameAssignment_1
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
    // InternalAedit.g:1680:1: rule__RuleDeclaration__Group__2 : rule__RuleDeclaration__Group__2__Impl rule__RuleDeclaration__Group__3 ;
    public final void rule__RuleDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1684:1: ( rule__RuleDeclaration__Group__2__Impl rule__RuleDeclaration__Group__3 )
            // InternalAedit.g:1685:2: rule__RuleDeclaration__Group__2__Impl rule__RuleDeclaration__Group__3
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
    // InternalAedit.g:1692:1: rule__RuleDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__RuleDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1696:1: ( ( '{' ) )
            // InternalAedit.g:1697:1: ( '{' )
            {
            // InternalAedit.g:1697:1: ( '{' )
            // InternalAedit.g:1698:2: '{'
            {
             before(grammarAccess.getRuleDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAedit.g:1707:1: rule__RuleDeclaration__Group__3 : rule__RuleDeclaration__Group__3__Impl rule__RuleDeclaration__Group__4 ;
    public final void rule__RuleDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1711:1: ( rule__RuleDeclaration__Group__3__Impl rule__RuleDeclaration__Group__4 )
            // InternalAedit.g:1712:2: rule__RuleDeclaration__Group__3__Impl rule__RuleDeclaration__Group__4
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
    // InternalAedit.g:1719:1: rule__RuleDeclaration__Group__3__Impl : ( ( rule__RuleDeclaration__RulesAssignment_3 )* ) ;
    public final void rule__RuleDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1723:1: ( ( ( rule__RuleDeclaration__RulesAssignment_3 )* ) )
            // InternalAedit.g:1724:1: ( ( rule__RuleDeclaration__RulesAssignment_3 )* )
            {
            // InternalAedit.g:1724:1: ( ( rule__RuleDeclaration__RulesAssignment_3 )* )
            // InternalAedit.g:1725:2: ( rule__RuleDeclaration__RulesAssignment_3 )*
            {
             before(grammarAccess.getRuleDeclarationAccess().getRulesAssignment_3()); 
            // InternalAedit.g:1726:2: ( rule__RuleDeclaration__RulesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=27 && LA16_0<=28)||(LA16_0>=32 && LA16_0<=33)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAedit.g:1726:3: rule__RuleDeclaration__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__RuleDeclaration__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalAedit.g:1734:1: rule__RuleDeclaration__Group__4 : rule__RuleDeclaration__Group__4__Impl ;
    public final void rule__RuleDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1738:1: ( rule__RuleDeclaration__Group__4__Impl )
            // InternalAedit.g:1739:2: rule__RuleDeclaration__Group__4__Impl
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
    // InternalAedit.g:1745:1: rule__RuleDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__RuleDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1749:1: ( ( '}' ) )
            // InternalAedit.g:1750:1: ( '}' )
            {
            // InternalAedit.g:1750:1: ( '}' )
            // InternalAedit.g:1751:2: '}'
            {
             before(grammarAccess.getRuleDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAedit.g:1761:1: rule__ChangeSchema__Group__0 : rule__ChangeSchema__Group__0__Impl rule__ChangeSchema__Group__1 ;
    public final void rule__ChangeSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1765:1: ( rule__ChangeSchema__Group__0__Impl rule__ChangeSchema__Group__1 )
            // InternalAedit.g:1766:2: rule__ChangeSchema__Group__0__Impl rule__ChangeSchema__Group__1
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
    // InternalAedit.g:1773:1: rule__ChangeSchema__Group__0__Impl : ( 'change' ) ;
    public final void rule__ChangeSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1777:1: ( ( 'change' ) )
            // InternalAedit.g:1778:1: ( 'change' )
            {
            // InternalAedit.g:1778:1: ( 'change' )
            // InternalAedit.g:1779:2: 'change'
            {
             before(grammarAccess.getChangeSchemaAccess().getChangeKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAedit.g:1788:1: rule__ChangeSchema__Group__1 : rule__ChangeSchema__Group__1__Impl rule__ChangeSchema__Group__2 ;
    public final void rule__ChangeSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1792:1: ( rule__ChangeSchema__Group__1__Impl rule__ChangeSchema__Group__2 )
            // InternalAedit.g:1793:2: rule__ChangeSchema__Group__1__Impl rule__ChangeSchema__Group__2
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
    // InternalAedit.g:1800:1: rule__ChangeSchema__Group__1__Impl : ( ( rule__ChangeSchema__Alternatives_1 ) ) ;
    public final void rule__ChangeSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1804:1: ( ( ( rule__ChangeSchema__Alternatives_1 ) ) )
            // InternalAedit.g:1805:1: ( ( rule__ChangeSchema__Alternatives_1 ) )
            {
            // InternalAedit.g:1805:1: ( ( rule__ChangeSchema__Alternatives_1 ) )
            // InternalAedit.g:1806:2: ( rule__ChangeSchema__Alternatives_1 )
            {
             before(grammarAccess.getChangeSchemaAccess().getAlternatives_1()); 
            // InternalAedit.g:1807:2: ( rule__ChangeSchema__Alternatives_1 )
            // InternalAedit.g:1807:3: rule__ChangeSchema__Alternatives_1
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
    // InternalAedit.g:1815:1: rule__ChangeSchema__Group__2 : rule__ChangeSchema__Group__2__Impl rule__ChangeSchema__Group__3 ;
    public final void rule__ChangeSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1819:1: ( rule__ChangeSchema__Group__2__Impl rule__ChangeSchema__Group__3 )
            // InternalAedit.g:1820:2: rule__ChangeSchema__Group__2__Impl rule__ChangeSchema__Group__3
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
    // InternalAedit.g:1827:1: rule__ChangeSchema__Group__2__Impl : ( ( rule__ChangeSchema__SchemaAssignment_2 ) ) ;
    public final void rule__ChangeSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1831:1: ( ( ( rule__ChangeSchema__SchemaAssignment_2 ) ) )
            // InternalAedit.g:1832:1: ( ( rule__ChangeSchema__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:1832:1: ( ( rule__ChangeSchema__SchemaAssignment_2 ) )
            // InternalAedit.g:1833:2: ( rule__ChangeSchema__SchemaAssignment_2 )
            {
             before(grammarAccess.getChangeSchemaAccess().getSchemaAssignment_2()); 
            // InternalAedit.g:1834:2: ( rule__ChangeSchema__SchemaAssignment_2 )
            // InternalAedit.g:1834:3: rule__ChangeSchema__SchemaAssignment_2
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
    // InternalAedit.g:1842:1: rule__ChangeSchema__Group__3 : rule__ChangeSchema__Group__3__Impl rule__ChangeSchema__Group__4 ;
    public final void rule__ChangeSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1846:1: ( rule__ChangeSchema__Group__3__Impl rule__ChangeSchema__Group__4 )
            // InternalAedit.g:1847:2: rule__ChangeSchema__Group__3__Impl rule__ChangeSchema__Group__4
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
    // InternalAedit.g:1854:1: rule__ChangeSchema__Group__3__Impl : ( '{' ) ;
    public final void rule__ChangeSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1858:1: ( ( '{' ) )
            // InternalAedit.g:1859:1: ( '{' )
            {
            // InternalAedit.g:1859:1: ( '{' )
            // InternalAedit.g:1860:2: '{'
            {
             before(grammarAccess.getChangeSchemaAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAedit.g:1869:1: rule__ChangeSchema__Group__4 : rule__ChangeSchema__Group__4__Impl rule__ChangeSchema__Group__5 ;
    public final void rule__ChangeSchema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1873:1: ( rule__ChangeSchema__Group__4__Impl rule__ChangeSchema__Group__5 )
            // InternalAedit.g:1874:2: rule__ChangeSchema__Group__4__Impl rule__ChangeSchema__Group__5
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
    // InternalAedit.g:1881:1: rule__ChangeSchema__Group__4__Impl : ( ( rule__ChangeSchema__RulesAssignment_4 )* ) ;
    public final void rule__ChangeSchema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1885:1: ( ( ( rule__ChangeSchema__RulesAssignment_4 )* ) )
            // InternalAedit.g:1886:1: ( ( rule__ChangeSchema__RulesAssignment_4 )* )
            {
            // InternalAedit.g:1886:1: ( ( rule__ChangeSchema__RulesAssignment_4 )* )
            // InternalAedit.g:1887:2: ( rule__ChangeSchema__RulesAssignment_4 )*
            {
             before(grammarAccess.getChangeSchemaAccess().getRulesAssignment_4()); 
            // InternalAedit.g:1888:2: ( rule__ChangeSchema__RulesAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28||(LA17_0>=32 && LA17_0<=33)||(LA17_0>=35 && LA17_0<=36)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAedit.g:1888:3: rule__ChangeSchema__RulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ChangeSchema__RulesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalAedit.g:1896:1: rule__ChangeSchema__Group__5 : rule__ChangeSchema__Group__5__Impl ;
    public final void rule__ChangeSchema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1900:1: ( rule__ChangeSchema__Group__5__Impl )
            // InternalAedit.g:1901:2: rule__ChangeSchema__Group__5__Impl
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
    // InternalAedit.g:1907:1: rule__ChangeSchema__Group__5__Impl : ( '}' ) ;
    public final void rule__ChangeSchema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1911:1: ( ( '}' ) )
            // InternalAedit.g:1912:1: ( '}' )
            {
            // InternalAedit.g:1912:1: ( '}' )
            // InternalAedit.g:1913:2: '}'
            {
             before(grammarAccess.getChangeSchemaAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAedit.g:1923:1: rule__ChangeEnum__Group__0 : rule__ChangeEnum__Group__0__Impl rule__ChangeEnum__Group__1 ;
    public final void rule__ChangeEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1927:1: ( rule__ChangeEnum__Group__0__Impl rule__ChangeEnum__Group__1 )
            // InternalAedit.g:1928:2: rule__ChangeEnum__Group__0__Impl rule__ChangeEnum__Group__1
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
    // InternalAedit.g:1935:1: rule__ChangeEnum__Group__0__Impl : ( 'change' ) ;
    public final void rule__ChangeEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1939:1: ( ( 'change' ) )
            // InternalAedit.g:1940:1: ( 'change' )
            {
            // InternalAedit.g:1940:1: ( 'change' )
            // InternalAedit.g:1941:2: 'change'
            {
             before(grammarAccess.getChangeEnumAccess().getChangeKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAedit.g:1950:1: rule__ChangeEnum__Group__1 : rule__ChangeEnum__Group__1__Impl rule__ChangeEnum__Group__2 ;
    public final void rule__ChangeEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1954:1: ( rule__ChangeEnum__Group__1__Impl rule__ChangeEnum__Group__2 )
            // InternalAedit.g:1955:2: rule__ChangeEnum__Group__1__Impl rule__ChangeEnum__Group__2
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
    // InternalAedit.g:1962:1: rule__ChangeEnum__Group__1__Impl : ( 'enum' ) ;
    public final void rule__ChangeEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1966:1: ( ( 'enum' ) )
            // InternalAedit.g:1967:1: ( 'enum' )
            {
            // InternalAedit.g:1967:1: ( 'enum' )
            // InternalAedit.g:1968:2: 'enum'
            {
             before(grammarAccess.getChangeEnumAccess().getEnumKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalAedit.g:1977:1: rule__ChangeEnum__Group__2 : rule__ChangeEnum__Group__2__Impl rule__ChangeEnum__Group__3 ;
    public final void rule__ChangeEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1981:1: ( rule__ChangeEnum__Group__2__Impl rule__ChangeEnum__Group__3 )
            // InternalAedit.g:1982:2: rule__ChangeEnum__Group__2__Impl rule__ChangeEnum__Group__3
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
    // InternalAedit.g:1989:1: rule__ChangeEnum__Group__2__Impl : ( ( rule__ChangeEnum__SchemaAssignment_2 ) ) ;
    public final void rule__ChangeEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:1993:1: ( ( ( rule__ChangeEnum__SchemaAssignment_2 ) ) )
            // InternalAedit.g:1994:1: ( ( rule__ChangeEnum__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:1994:1: ( ( rule__ChangeEnum__SchemaAssignment_2 ) )
            // InternalAedit.g:1995:2: ( rule__ChangeEnum__SchemaAssignment_2 )
            {
             before(grammarAccess.getChangeEnumAccess().getSchemaAssignment_2()); 
            // InternalAedit.g:1996:2: ( rule__ChangeEnum__SchemaAssignment_2 )
            // InternalAedit.g:1996:3: rule__ChangeEnum__SchemaAssignment_2
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
    // InternalAedit.g:2004:1: rule__ChangeEnum__Group__3 : rule__ChangeEnum__Group__3__Impl rule__ChangeEnum__Group__4 ;
    public final void rule__ChangeEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2008:1: ( rule__ChangeEnum__Group__3__Impl rule__ChangeEnum__Group__4 )
            // InternalAedit.g:2009:2: rule__ChangeEnum__Group__3__Impl rule__ChangeEnum__Group__4
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
    // InternalAedit.g:2016:1: rule__ChangeEnum__Group__3__Impl : ( '{' ) ;
    public final void rule__ChangeEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2020:1: ( ( '{' ) )
            // InternalAedit.g:2021:1: ( '{' )
            {
            // InternalAedit.g:2021:1: ( '{' )
            // InternalAedit.g:2022:2: '{'
            {
             before(grammarAccess.getChangeEnumAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAedit.g:2031:1: rule__ChangeEnum__Group__4 : rule__ChangeEnum__Group__4__Impl rule__ChangeEnum__Group__5 ;
    public final void rule__ChangeEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2035:1: ( rule__ChangeEnum__Group__4__Impl rule__ChangeEnum__Group__5 )
            // InternalAedit.g:2036:2: rule__ChangeEnum__Group__4__Impl rule__ChangeEnum__Group__5
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
    // InternalAedit.g:2043:1: rule__ChangeEnum__Group__4__Impl : ( ( rule__ChangeEnum__RulesAssignment_4 )* ) ;
    public final void rule__ChangeEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2047:1: ( ( ( rule__ChangeEnum__RulesAssignment_4 )* ) )
            // InternalAedit.g:2048:1: ( ( rule__ChangeEnum__RulesAssignment_4 )* )
            {
            // InternalAedit.g:2048:1: ( ( rule__ChangeEnum__RulesAssignment_4 )* )
            // InternalAedit.g:2049:2: ( rule__ChangeEnum__RulesAssignment_4 )*
            {
             before(grammarAccess.getChangeEnumAccess().getRulesAssignment_4()); 
            // InternalAedit.g:2050:2: ( rule__ChangeEnum__RulesAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28||(LA18_0>=32 && LA18_0<=33)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAedit.g:2050:3: rule__ChangeEnum__RulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ChangeEnum__RulesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalAedit.g:2058:1: rule__ChangeEnum__Group__5 : rule__ChangeEnum__Group__5__Impl ;
    public final void rule__ChangeEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2062:1: ( rule__ChangeEnum__Group__5__Impl )
            // InternalAedit.g:2063:2: rule__ChangeEnum__Group__5__Impl
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
    // InternalAedit.g:2069:1: rule__ChangeEnum__Group__5__Impl : ( '}' ) ;
    public final void rule__ChangeEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2073:1: ( ( '}' ) )
            // InternalAedit.g:2074:1: ( '}' )
            {
            // InternalAedit.g:2074:1: ( '}' )
            // InternalAedit.g:2075:2: '}'
            {
             before(grammarAccess.getChangeEnumAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAedit.g:2085:1: rule__AddRecord__Group__0 : rule__AddRecord__Group__0__Impl rule__AddRecord__Group__1 ;
    public final void rule__AddRecord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2089:1: ( rule__AddRecord__Group__0__Impl rule__AddRecord__Group__1 )
            // InternalAedit.g:2090:2: rule__AddRecord__Group__0__Impl rule__AddRecord__Group__1
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
    // InternalAedit.g:2097:1: rule__AddRecord__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddRecord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2101:1: ( ( 'add.at' ) )
            // InternalAedit.g:2102:1: ( 'add.at' )
            {
            // InternalAedit.g:2102:1: ( 'add.at' )
            // InternalAedit.g:2103:2: 'add.at'
            {
             before(grammarAccess.getAddRecordAccess().getAddAtKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAedit.g:2112:1: rule__AddRecord__Group__1 : rule__AddRecord__Group__1__Impl rule__AddRecord__Group__2 ;
    public final void rule__AddRecord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2116:1: ( rule__AddRecord__Group__1__Impl rule__AddRecord__Group__2 )
            // InternalAedit.g:2117:2: rule__AddRecord__Group__1__Impl rule__AddRecord__Group__2
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
    // InternalAedit.g:2124:1: rule__AddRecord__Group__1__Impl : ( '(' ) ;
    public final void rule__AddRecord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2128:1: ( ( '(' ) )
            // InternalAedit.g:2129:1: ( '(' )
            {
            // InternalAedit.g:2129:1: ( '(' )
            // InternalAedit.g:2130:2: '('
            {
             before(grammarAccess.getAddRecordAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAedit.g:2139:1: rule__AddRecord__Group__2 : rule__AddRecord__Group__2__Impl rule__AddRecord__Group__3 ;
    public final void rule__AddRecord__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2143:1: ( rule__AddRecord__Group__2__Impl rule__AddRecord__Group__3 )
            // InternalAedit.g:2144:2: rule__AddRecord__Group__2__Impl rule__AddRecord__Group__3
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
    // InternalAedit.g:2151:1: rule__AddRecord__Group__2__Impl : ( ( rule__AddRecord__IndexAssignment_2 ) ) ;
    public final void rule__AddRecord__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2155:1: ( ( ( rule__AddRecord__IndexAssignment_2 ) ) )
            // InternalAedit.g:2156:1: ( ( rule__AddRecord__IndexAssignment_2 ) )
            {
            // InternalAedit.g:2156:1: ( ( rule__AddRecord__IndexAssignment_2 ) )
            // InternalAedit.g:2157:2: ( rule__AddRecord__IndexAssignment_2 )
            {
             before(grammarAccess.getAddRecordAccess().getIndexAssignment_2()); 
            // InternalAedit.g:2158:2: ( rule__AddRecord__IndexAssignment_2 )
            // InternalAedit.g:2158:3: rule__AddRecord__IndexAssignment_2
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
    // InternalAedit.g:2166:1: rule__AddRecord__Group__3 : rule__AddRecord__Group__3__Impl rule__AddRecord__Group__4 ;
    public final void rule__AddRecord__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2170:1: ( rule__AddRecord__Group__3__Impl rule__AddRecord__Group__4 )
            // InternalAedit.g:2171:2: rule__AddRecord__Group__3__Impl rule__AddRecord__Group__4
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
    // InternalAedit.g:2178:1: rule__AddRecord__Group__3__Impl : ( ')' ) ;
    public final void rule__AddRecord__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2182:1: ( ( ')' ) )
            // InternalAedit.g:2183:1: ( ')' )
            {
            // InternalAedit.g:2183:1: ( ')' )
            // InternalAedit.g:2184:2: ')'
            {
             before(grammarAccess.getAddRecordAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAedit.g:2193:1: rule__AddRecord__Group__4 : rule__AddRecord__Group__4__Impl rule__AddRecord__Group__5 ;
    public final void rule__AddRecord__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2197:1: ( rule__AddRecord__Group__4__Impl rule__AddRecord__Group__5 )
            // InternalAedit.g:2198:2: rule__AddRecord__Group__4__Impl rule__AddRecord__Group__5
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
    // InternalAedit.g:2205:1: rule__AddRecord__Group__4__Impl : ( 'record' ) ;
    public final void rule__AddRecord__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2209:1: ( ( 'record' ) )
            // InternalAedit.g:2210:1: ( 'record' )
            {
            // InternalAedit.g:2210:1: ( 'record' )
            // InternalAedit.g:2211:2: 'record'
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
    // InternalAedit.g:2220:1: rule__AddRecord__Group__5 : rule__AddRecord__Group__5__Impl rule__AddRecord__Group__6 ;
    public final void rule__AddRecord__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2224:1: ( rule__AddRecord__Group__5__Impl rule__AddRecord__Group__6 )
            // InternalAedit.g:2225:2: rule__AddRecord__Group__5__Impl rule__AddRecord__Group__6
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
    // InternalAedit.g:2232:1: rule__AddRecord__Group__5__Impl : ( ( rule__AddRecord__NamespaceAssignment_5 ) ) ;
    public final void rule__AddRecord__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2236:1: ( ( ( rule__AddRecord__NamespaceAssignment_5 ) ) )
            // InternalAedit.g:2237:1: ( ( rule__AddRecord__NamespaceAssignment_5 ) )
            {
            // InternalAedit.g:2237:1: ( ( rule__AddRecord__NamespaceAssignment_5 ) )
            // InternalAedit.g:2238:2: ( rule__AddRecord__NamespaceAssignment_5 )
            {
             before(grammarAccess.getAddRecordAccess().getNamespaceAssignment_5()); 
            // InternalAedit.g:2239:2: ( rule__AddRecord__NamespaceAssignment_5 )
            // InternalAedit.g:2239:3: rule__AddRecord__NamespaceAssignment_5
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
    // InternalAedit.g:2247:1: rule__AddRecord__Group__6 : rule__AddRecord__Group__6__Impl rule__AddRecord__Group__7 ;
    public final void rule__AddRecord__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2251:1: ( rule__AddRecord__Group__6__Impl rule__AddRecord__Group__7 )
            // InternalAedit.g:2252:2: rule__AddRecord__Group__6__Impl rule__AddRecord__Group__7
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
    // InternalAedit.g:2259:1: rule__AddRecord__Group__6__Impl : ( '.' ) ;
    public final void rule__AddRecord__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2263:1: ( ( '.' ) )
            // InternalAedit.g:2264:1: ( '.' )
            {
            // InternalAedit.g:2264:1: ( '.' )
            // InternalAedit.g:2265:2: '.'
            {
             before(grammarAccess.getAddRecordAccess().getFullStopKeyword_6()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAedit.g:2274:1: rule__AddRecord__Group__7 : rule__AddRecord__Group__7__Impl rule__AddRecord__Group__8 ;
    public final void rule__AddRecord__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2278:1: ( rule__AddRecord__Group__7__Impl rule__AddRecord__Group__8 )
            // InternalAedit.g:2279:2: rule__AddRecord__Group__7__Impl rule__AddRecord__Group__8
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
    // InternalAedit.g:2286:1: rule__AddRecord__Group__7__Impl : ( ( rule__AddRecord__RecordNameAssignment_7 ) ) ;
    public final void rule__AddRecord__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2290:1: ( ( ( rule__AddRecord__RecordNameAssignment_7 ) ) )
            // InternalAedit.g:2291:1: ( ( rule__AddRecord__RecordNameAssignment_7 ) )
            {
            // InternalAedit.g:2291:1: ( ( rule__AddRecord__RecordNameAssignment_7 ) )
            // InternalAedit.g:2292:2: ( rule__AddRecord__RecordNameAssignment_7 )
            {
             before(grammarAccess.getAddRecordAccess().getRecordNameAssignment_7()); 
            // InternalAedit.g:2293:2: ( rule__AddRecord__RecordNameAssignment_7 )
            // InternalAedit.g:2293:3: rule__AddRecord__RecordNameAssignment_7
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
    // InternalAedit.g:2301:1: rule__AddRecord__Group__8 : rule__AddRecord__Group__8__Impl rule__AddRecord__Group__9 ;
    public final void rule__AddRecord__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2305:1: ( rule__AddRecord__Group__8__Impl rule__AddRecord__Group__9 )
            // InternalAedit.g:2306:2: rule__AddRecord__Group__8__Impl rule__AddRecord__Group__9
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
    // InternalAedit.g:2313:1: rule__AddRecord__Group__8__Impl : ( '{' ) ;
    public final void rule__AddRecord__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2317:1: ( ( '{' ) )
            // InternalAedit.g:2318:1: ( '{' )
            {
            // InternalAedit.g:2318:1: ( '{' )
            // InternalAedit.g:2319:2: '{'
            {
             before(grammarAccess.getAddRecordAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAedit.g:2328:1: rule__AddRecord__Group__9 : rule__AddRecord__Group__9__Impl rule__AddRecord__Group__10 ;
    public final void rule__AddRecord__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2332:1: ( rule__AddRecord__Group__9__Impl rule__AddRecord__Group__10 )
            // InternalAedit.g:2333:2: rule__AddRecord__Group__9__Impl rule__AddRecord__Group__10
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
    // InternalAedit.g:2340:1: rule__AddRecord__Group__9__Impl : ( ( rule__AddRecord__FieldsAssignment_9 )* ) ;
    public final void rule__AddRecord__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2344:1: ( ( ( rule__AddRecord__FieldsAssignment_9 )* ) )
            // InternalAedit.g:2345:1: ( ( rule__AddRecord__FieldsAssignment_9 )* )
            {
            // InternalAedit.g:2345:1: ( ( rule__AddRecord__FieldsAssignment_9 )* )
            // InternalAedit.g:2346:2: ( rule__AddRecord__FieldsAssignment_9 )*
            {
             before(grammarAccess.getAddRecordAccess().getFieldsAssignment_9()); 
            // InternalAedit.g:2347:2: ( rule__AddRecord__FieldsAssignment_9 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=14 && LA19_0<=18)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAedit.g:2347:3: rule__AddRecord__FieldsAssignment_9
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__AddRecord__FieldsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalAedit.g:2355:1: rule__AddRecord__Group__10 : rule__AddRecord__Group__10__Impl ;
    public final void rule__AddRecord__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2359:1: ( rule__AddRecord__Group__10__Impl )
            // InternalAedit.g:2360:2: rule__AddRecord__Group__10__Impl
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
    // InternalAedit.g:2366:1: rule__AddRecord__Group__10__Impl : ( '}' ) ;
    public final void rule__AddRecord__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2370:1: ( ( '}' ) )
            // InternalAedit.g:2371:1: ( '}' )
            {
            // InternalAedit.g:2371:1: ( '}' )
            // InternalAedit.g:2372:2: '}'
            {
             before(grammarAccess.getAddRecordAccess().getRightCurlyBracketKeyword_10()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAedit.g:2382:1: rule__AddEnumeration__Group__0 : rule__AddEnumeration__Group__0__Impl rule__AddEnumeration__Group__1 ;
    public final void rule__AddEnumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2386:1: ( rule__AddEnumeration__Group__0__Impl rule__AddEnumeration__Group__1 )
            // InternalAedit.g:2387:2: rule__AddEnumeration__Group__0__Impl rule__AddEnumeration__Group__1
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
    // InternalAedit.g:2394:1: rule__AddEnumeration__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddEnumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2398:1: ( ( 'add.at' ) )
            // InternalAedit.g:2399:1: ( 'add.at' )
            {
            // InternalAedit.g:2399:1: ( 'add.at' )
            // InternalAedit.g:2400:2: 'add.at'
            {
             before(grammarAccess.getAddEnumerationAccess().getAddAtKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAedit.g:2409:1: rule__AddEnumeration__Group__1 : rule__AddEnumeration__Group__1__Impl rule__AddEnumeration__Group__2 ;
    public final void rule__AddEnumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2413:1: ( rule__AddEnumeration__Group__1__Impl rule__AddEnumeration__Group__2 )
            // InternalAedit.g:2414:2: rule__AddEnumeration__Group__1__Impl rule__AddEnumeration__Group__2
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
    // InternalAedit.g:2421:1: rule__AddEnumeration__Group__1__Impl : ( '(' ) ;
    public final void rule__AddEnumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2425:1: ( ( '(' ) )
            // InternalAedit.g:2426:1: ( '(' )
            {
            // InternalAedit.g:2426:1: ( '(' )
            // InternalAedit.g:2427:2: '('
            {
             before(grammarAccess.getAddEnumerationAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAedit.g:2436:1: rule__AddEnumeration__Group__2 : rule__AddEnumeration__Group__2__Impl rule__AddEnumeration__Group__3 ;
    public final void rule__AddEnumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2440:1: ( rule__AddEnumeration__Group__2__Impl rule__AddEnumeration__Group__3 )
            // InternalAedit.g:2441:2: rule__AddEnumeration__Group__2__Impl rule__AddEnumeration__Group__3
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
    // InternalAedit.g:2448:1: rule__AddEnumeration__Group__2__Impl : ( ( rule__AddEnumeration__IndexAssignment_2 ) ) ;
    public final void rule__AddEnumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2452:1: ( ( ( rule__AddEnumeration__IndexAssignment_2 ) ) )
            // InternalAedit.g:2453:1: ( ( rule__AddEnumeration__IndexAssignment_2 ) )
            {
            // InternalAedit.g:2453:1: ( ( rule__AddEnumeration__IndexAssignment_2 ) )
            // InternalAedit.g:2454:2: ( rule__AddEnumeration__IndexAssignment_2 )
            {
             before(grammarAccess.getAddEnumerationAccess().getIndexAssignment_2()); 
            // InternalAedit.g:2455:2: ( rule__AddEnumeration__IndexAssignment_2 )
            // InternalAedit.g:2455:3: rule__AddEnumeration__IndexAssignment_2
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
    // InternalAedit.g:2463:1: rule__AddEnumeration__Group__3 : rule__AddEnumeration__Group__3__Impl rule__AddEnumeration__Group__4 ;
    public final void rule__AddEnumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2467:1: ( rule__AddEnumeration__Group__3__Impl rule__AddEnumeration__Group__4 )
            // InternalAedit.g:2468:2: rule__AddEnumeration__Group__3__Impl rule__AddEnumeration__Group__4
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
    // InternalAedit.g:2475:1: rule__AddEnumeration__Group__3__Impl : ( ')' ) ;
    public final void rule__AddEnumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2479:1: ( ( ')' ) )
            // InternalAedit.g:2480:1: ( ')' )
            {
            // InternalAedit.g:2480:1: ( ')' )
            // InternalAedit.g:2481:2: ')'
            {
             before(grammarAccess.getAddEnumerationAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAedit.g:2490:1: rule__AddEnumeration__Group__4 : rule__AddEnumeration__Group__4__Impl rule__AddEnumeration__Group__5 ;
    public final void rule__AddEnumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2494:1: ( rule__AddEnumeration__Group__4__Impl rule__AddEnumeration__Group__5 )
            // InternalAedit.g:2495:2: rule__AddEnumeration__Group__4__Impl rule__AddEnumeration__Group__5
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
    // InternalAedit.g:2502:1: rule__AddEnumeration__Group__4__Impl : ( 'enum' ) ;
    public final void rule__AddEnumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2506:1: ( ( 'enum' ) )
            // InternalAedit.g:2507:1: ( 'enum' )
            {
            // InternalAedit.g:2507:1: ( 'enum' )
            // InternalAedit.g:2508:2: 'enum'
            {
             before(grammarAccess.getAddEnumerationAccess().getEnumKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalAedit.g:2517:1: rule__AddEnumeration__Group__5 : rule__AddEnumeration__Group__5__Impl rule__AddEnumeration__Group__6 ;
    public final void rule__AddEnumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2521:1: ( rule__AddEnumeration__Group__5__Impl rule__AddEnumeration__Group__6 )
            // InternalAedit.g:2522:2: rule__AddEnumeration__Group__5__Impl rule__AddEnumeration__Group__6
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
    // InternalAedit.g:2529:1: rule__AddEnumeration__Group__5__Impl : ( ( rule__AddEnumeration__NamespaceAssignment_5 ) ) ;
    public final void rule__AddEnumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2533:1: ( ( ( rule__AddEnumeration__NamespaceAssignment_5 ) ) )
            // InternalAedit.g:2534:1: ( ( rule__AddEnumeration__NamespaceAssignment_5 ) )
            {
            // InternalAedit.g:2534:1: ( ( rule__AddEnumeration__NamespaceAssignment_5 ) )
            // InternalAedit.g:2535:2: ( rule__AddEnumeration__NamespaceAssignment_5 )
            {
             before(grammarAccess.getAddEnumerationAccess().getNamespaceAssignment_5()); 
            // InternalAedit.g:2536:2: ( rule__AddEnumeration__NamespaceAssignment_5 )
            // InternalAedit.g:2536:3: rule__AddEnumeration__NamespaceAssignment_5
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
    // InternalAedit.g:2544:1: rule__AddEnumeration__Group__6 : rule__AddEnumeration__Group__6__Impl rule__AddEnumeration__Group__7 ;
    public final void rule__AddEnumeration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2548:1: ( rule__AddEnumeration__Group__6__Impl rule__AddEnumeration__Group__7 )
            // InternalAedit.g:2549:2: rule__AddEnumeration__Group__6__Impl rule__AddEnumeration__Group__7
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
    // InternalAedit.g:2556:1: rule__AddEnumeration__Group__6__Impl : ( '.' ) ;
    public final void rule__AddEnumeration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2560:1: ( ( '.' ) )
            // InternalAedit.g:2561:1: ( '.' )
            {
            // InternalAedit.g:2561:1: ( '.' )
            // InternalAedit.g:2562:2: '.'
            {
             before(grammarAccess.getAddEnumerationAccess().getFullStopKeyword_6()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAedit.g:2571:1: rule__AddEnumeration__Group__7 : rule__AddEnumeration__Group__7__Impl rule__AddEnumeration__Group__8 ;
    public final void rule__AddEnumeration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2575:1: ( rule__AddEnumeration__Group__7__Impl rule__AddEnumeration__Group__8 )
            // InternalAedit.g:2576:2: rule__AddEnumeration__Group__7__Impl rule__AddEnumeration__Group__8
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
    // InternalAedit.g:2583:1: rule__AddEnumeration__Group__7__Impl : ( ( rule__AddEnumeration__EnumNameAssignment_7 ) ) ;
    public final void rule__AddEnumeration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2587:1: ( ( ( rule__AddEnumeration__EnumNameAssignment_7 ) ) )
            // InternalAedit.g:2588:1: ( ( rule__AddEnumeration__EnumNameAssignment_7 ) )
            {
            // InternalAedit.g:2588:1: ( ( rule__AddEnumeration__EnumNameAssignment_7 ) )
            // InternalAedit.g:2589:2: ( rule__AddEnumeration__EnumNameAssignment_7 )
            {
             before(grammarAccess.getAddEnumerationAccess().getEnumNameAssignment_7()); 
            // InternalAedit.g:2590:2: ( rule__AddEnumeration__EnumNameAssignment_7 )
            // InternalAedit.g:2590:3: rule__AddEnumeration__EnumNameAssignment_7
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
    // InternalAedit.g:2598:1: rule__AddEnumeration__Group__8 : rule__AddEnumeration__Group__8__Impl rule__AddEnumeration__Group__9 ;
    public final void rule__AddEnumeration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2602:1: ( rule__AddEnumeration__Group__8__Impl rule__AddEnumeration__Group__9 )
            // InternalAedit.g:2603:2: rule__AddEnumeration__Group__8__Impl rule__AddEnumeration__Group__9
            {
            pushFollow(FOLLOW_10);
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
    // InternalAedit.g:2610:1: rule__AddEnumeration__Group__8__Impl : ( '{' ) ;
    public final void rule__AddEnumeration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2614:1: ( ( '{' ) )
            // InternalAedit.g:2615:1: ( '{' )
            {
            // InternalAedit.g:2615:1: ( '{' )
            // InternalAedit.g:2616:2: '{'
            {
             before(grammarAccess.getAddEnumerationAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAedit.g:2625:1: rule__AddEnumeration__Group__9 : rule__AddEnumeration__Group__9__Impl rule__AddEnumeration__Group__10 ;
    public final void rule__AddEnumeration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2629:1: ( rule__AddEnumeration__Group__9__Impl rule__AddEnumeration__Group__10 )
            // InternalAedit.g:2630:2: rule__AddEnumeration__Group__9__Impl rule__AddEnumeration__Group__10
            {
            pushFollow(FOLLOW_10);
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
    // InternalAedit.g:2637:1: rule__AddEnumeration__Group__9__Impl : ( ( rule__AddEnumeration__SymbolsAssignment_9 )* ) ;
    public final void rule__AddEnumeration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2641:1: ( ( ( rule__AddEnumeration__SymbolsAssignment_9 )* ) )
            // InternalAedit.g:2642:1: ( ( rule__AddEnumeration__SymbolsAssignment_9 )* )
            {
            // InternalAedit.g:2642:1: ( ( rule__AddEnumeration__SymbolsAssignment_9 )* )
            // InternalAedit.g:2643:2: ( rule__AddEnumeration__SymbolsAssignment_9 )*
            {
             before(grammarAccess.getAddEnumerationAccess().getSymbolsAssignment_9()); 
            // InternalAedit.g:2644:2: ( rule__AddEnumeration__SymbolsAssignment_9 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAedit.g:2644:3: rule__AddEnumeration__SymbolsAssignment_9
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AddEnumeration__SymbolsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

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
    // InternalAedit.g:2652:1: rule__AddEnumeration__Group__10 : rule__AddEnumeration__Group__10__Impl ;
    public final void rule__AddEnumeration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2656:1: ( rule__AddEnumeration__Group__10__Impl )
            // InternalAedit.g:2657:2: rule__AddEnumeration__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddEnumeration__Group__10__Impl();

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
    // InternalAedit.g:2663:1: rule__AddEnumeration__Group__10__Impl : ( '}' ) ;
    public final void rule__AddEnumeration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2667:1: ( ( '}' ) )
            // InternalAedit.g:2668:1: ( '}' )
            {
            // InternalAedit.g:2668:1: ( '}' )
            // InternalAedit.g:2669:2: '}'
            {
             before(grammarAccess.getAddEnumerationAccess().getRightCurlyBracketKeyword_10()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAddEnumerationAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__AddVariable__Group__0"
    // InternalAedit.g:2679:1: rule__AddVariable__Group__0 : rule__AddVariable__Group__0__Impl rule__AddVariable__Group__1 ;
    public final void rule__AddVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2683:1: ( rule__AddVariable__Group__0__Impl rule__AddVariable__Group__1 )
            // InternalAedit.g:2684:2: rule__AddVariable__Group__0__Impl rule__AddVariable__Group__1
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
    // InternalAedit.g:2691:1: rule__AddVariable__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2695:1: ( ( 'add.at' ) )
            // InternalAedit.g:2696:1: ( 'add.at' )
            {
            // InternalAedit.g:2696:1: ( 'add.at' )
            // InternalAedit.g:2697:2: 'add.at'
            {
             before(grammarAccess.getAddVariableAccess().getAddAtKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAedit.g:2706:1: rule__AddVariable__Group__1 : rule__AddVariable__Group__1__Impl rule__AddVariable__Group__2 ;
    public final void rule__AddVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2710:1: ( rule__AddVariable__Group__1__Impl rule__AddVariable__Group__2 )
            // InternalAedit.g:2711:2: rule__AddVariable__Group__1__Impl rule__AddVariable__Group__2
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
    // InternalAedit.g:2718:1: rule__AddVariable__Group__1__Impl : ( '(' ) ;
    public final void rule__AddVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2722:1: ( ( '(' ) )
            // InternalAedit.g:2723:1: ( '(' )
            {
            // InternalAedit.g:2723:1: ( '(' )
            // InternalAedit.g:2724:2: '('
            {
             before(grammarAccess.getAddVariableAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAedit.g:2733:1: rule__AddVariable__Group__2 : rule__AddVariable__Group__2__Impl rule__AddVariable__Group__3 ;
    public final void rule__AddVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2737:1: ( rule__AddVariable__Group__2__Impl rule__AddVariable__Group__3 )
            // InternalAedit.g:2738:2: rule__AddVariable__Group__2__Impl rule__AddVariable__Group__3
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
    // InternalAedit.g:2745:1: rule__AddVariable__Group__2__Impl : ( ( rule__AddVariable__IndexAssignment_2 ) ) ;
    public final void rule__AddVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2749:1: ( ( ( rule__AddVariable__IndexAssignment_2 ) ) )
            // InternalAedit.g:2750:1: ( ( rule__AddVariable__IndexAssignment_2 ) )
            {
            // InternalAedit.g:2750:1: ( ( rule__AddVariable__IndexAssignment_2 ) )
            // InternalAedit.g:2751:2: ( rule__AddVariable__IndexAssignment_2 )
            {
             before(grammarAccess.getAddVariableAccess().getIndexAssignment_2()); 
            // InternalAedit.g:2752:2: ( rule__AddVariable__IndexAssignment_2 )
            // InternalAedit.g:2752:3: rule__AddVariable__IndexAssignment_2
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
    // InternalAedit.g:2760:1: rule__AddVariable__Group__3 : rule__AddVariable__Group__3__Impl rule__AddVariable__Group__4 ;
    public final void rule__AddVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2764:1: ( rule__AddVariable__Group__3__Impl rule__AddVariable__Group__4 )
            // InternalAedit.g:2765:2: rule__AddVariable__Group__3__Impl rule__AddVariable__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalAedit.g:2772:1: rule__AddVariable__Group__3__Impl : ( ')' ) ;
    public final void rule__AddVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2776:1: ( ( ')' ) )
            // InternalAedit.g:2777:1: ( ')' )
            {
            // InternalAedit.g:2777:1: ( ')' )
            // InternalAedit.g:2778:2: ')'
            {
             before(grammarAccess.getAddVariableAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAedit.g:2787:1: rule__AddVariable__Group__4 : rule__AddVariable__Group__4__Impl rule__AddVariable__Group__5 ;
    public final void rule__AddVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2791:1: ( rule__AddVariable__Group__4__Impl rule__AddVariable__Group__5 )
            // InternalAedit.g:2792:2: rule__AddVariable__Group__4__Impl rule__AddVariable__Group__5
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
    // InternalAedit.g:2799:1: rule__AddVariable__Group__4__Impl : ( ( rule__AddVariable__NewVarAssignment_4 ) ) ;
    public final void rule__AddVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2803:1: ( ( ( rule__AddVariable__NewVarAssignment_4 ) ) )
            // InternalAedit.g:2804:1: ( ( rule__AddVariable__NewVarAssignment_4 ) )
            {
            // InternalAedit.g:2804:1: ( ( rule__AddVariable__NewVarAssignment_4 ) )
            // InternalAedit.g:2805:2: ( rule__AddVariable__NewVarAssignment_4 )
            {
             before(grammarAccess.getAddVariableAccess().getNewVarAssignment_4()); 
            // InternalAedit.g:2806:2: ( rule__AddVariable__NewVarAssignment_4 )
            // InternalAedit.g:2806:3: rule__AddVariable__NewVarAssignment_4
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
    // InternalAedit.g:2814:1: rule__AddVariable__Group__5 : rule__AddVariable__Group__5__Impl ;
    public final void rule__AddVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2818:1: ( rule__AddVariable__Group__5__Impl )
            // InternalAedit.g:2819:2: rule__AddVariable__Group__5__Impl
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
    // InternalAedit.g:2825:1: rule__AddVariable__Group__5__Impl : ( ';' ) ;
    public final void rule__AddVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2829:1: ( ( ';' ) )
            // InternalAedit.g:2830:1: ( ';' )
            {
            // InternalAedit.g:2830:1: ( ';' )
            // InternalAedit.g:2831:2: ';'
            {
             before(grammarAccess.getAddVariableAccess().getSemicolonKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAedit.g:2841:1: rule__AddEnum__Group__0 : rule__AddEnum__Group__0__Impl rule__AddEnum__Group__1 ;
    public final void rule__AddEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2845:1: ( rule__AddEnum__Group__0__Impl rule__AddEnum__Group__1 )
            // InternalAedit.g:2846:2: rule__AddEnum__Group__0__Impl rule__AddEnum__Group__1
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
    // InternalAedit.g:2853:1: rule__AddEnum__Group__0__Impl : ( 'add.at' ) ;
    public final void rule__AddEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2857:1: ( ( 'add.at' ) )
            // InternalAedit.g:2858:1: ( 'add.at' )
            {
            // InternalAedit.g:2858:1: ( 'add.at' )
            // InternalAedit.g:2859:2: 'add.at'
            {
             before(grammarAccess.getAddEnumAccess().getAddAtKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAedit.g:2868:1: rule__AddEnum__Group__1 : rule__AddEnum__Group__1__Impl rule__AddEnum__Group__2 ;
    public final void rule__AddEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2872:1: ( rule__AddEnum__Group__1__Impl rule__AddEnum__Group__2 )
            // InternalAedit.g:2873:2: rule__AddEnum__Group__1__Impl rule__AddEnum__Group__2
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
    // InternalAedit.g:2880:1: rule__AddEnum__Group__1__Impl : ( '(' ) ;
    public final void rule__AddEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2884:1: ( ( '(' ) )
            // InternalAedit.g:2885:1: ( '(' )
            {
            // InternalAedit.g:2885:1: ( '(' )
            // InternalAedit.g:2886:2: '('
            {
             before(grammarAccess.getAddEnumAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAedit.g:2895:1: rule__AddEnum__Group__2 : rule__AddEnum__Group__2__Impl rule__AddEnum__Group__3 ;
    public final void rule__AddEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2899:1: ( rule__AddEnum__Group__2__Impl rule__AddEnum__Group__3 )
            // InternalAedit.g:2900:2: rule__AddEnum__Group__2__Impl rule__AddEnum__Group__3
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
    // InternalAedit.g:2907:1: rule__AddEnum__Group__2__Impl : ( ( rule__AddEnum__IndexAssignment_2 ) ) ;
    public final void rule__AddEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2911:1: ( ( ( rule__AddEnum__IndexAssignment_2 ) ) )
            // InternalAedit.g:2912:1: ( ( rule__AddEnum__IndexAssignment_2 ) )
            {
            // InternalAedit.g:2912:1: ( ( rule__AddEnum__IndexAssignment_2 ) )
            // InternalAedit.g:2913:2: ( rule__AddEnum__IndexAssignment_2 )
            {
             before(grammarAccess.getAddEnumAccess().getIndexAssignment_2()); 
            // InternalAedit.g:2914:2: ( rule__AddEnum__IndexAssignment_2 )
            // InternalAedit.g:2914:3: rule__AddEnum__IndexAssignment_2
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
    // InternalAedit.g:2922:1: rule__AddEnum__Group__3 : rule__AddEnum__Group__3__Impl rule__AddEnum__Group__4 ;
    public final void rule__AddEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2926:1: ( rule__AddEnum__Group__3__Impl rule__AddEnum__Group__4 )
            // InternalAedit.g:2927:2: rule__AddEnum__Group__3__Impl rule__AddEnum__Group__4
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
    // InternalAedit.g:2934:1: rule__AddEnum__Group__3__Impl : ( ')' ) ;
    public final void rule__AddEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2938:1: ( ( ')' ) )
            // InternalAedit.g:2939:1: ( ')' )
            {
            // InternalAedit.g:2939:1: ( ')' )
            // InternalAedit.g:2940:2: ')'
            {
             before(grammarAccess.getAddEnumAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAedit.g:2949:1: rule__AddEnum__Group__4 : rule__AddEnum__Group__4__Impl rule__AddEnum__Group__5 ;
    public final void rule__AddEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2953:1: ( rule__AddEnum__Group__4__Impl rule__AddEnum__Group__5 )
            // InternalAedit.g:2954:2: rule__AddEnum__Group__4__Impl rule__AddEnum__Group__5
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
    // InternalAedit.g:2961:1: rule__AddEnum__Group__4__Impl : ( ( rule__AddEnum__VarNameAssignment_4 ) ) ;
    public final void rule__AddEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2965:1: ( ( ( rule__AddEnum__VarNameAssignment_4 ) ) )
            // InternalAedit.g:2966:1: ( ( rule__AddEnum__VarNameAssignment_4 ) )
            {
            // InternalAedit.g:2966:1: ( ( rule__AddEnum__VarNameAssignment_4 ) )
            // InternalAedit.g:2967:2: ( rule__AddEnum__VarNameAssignment_4 )
            {
             before(grammarAccess.getAddEnumAccess().getVarNameAssignment_4()); 
            // InternalAedit.g:2968:2: ( rule__AddEnum__VarNameAssignment_4 )
            // InternalAedit.g:2968:3: rule__AddEnum__VarNameAssignment_4
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
    // InternalAedit.g:2976:1: rule__AddEnum__Group__5 : rule__AddEnum__Group__5__Impl ;
    public final void rule__AddEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2980:1: ( rule__AddEnum__Group__5__Impl )
            // InternalAedit.g:2981:2: rule__AddEnum__Group__5__Impl
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
    // InternalAedit.g:2987:1: rule__AddEnum__Group__5__Impl : ( ';' ) ;
    public final void rule__AddEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:2991:1: ( ( ';' ) )
            // InternalAedit.g:2992:1: ( ';' )
            {
            // InternalAedit.g:2992:1: ( ';' )
            // InternalAedit.g:2993:2: ';'
            {
             before(grammarAccess.getAddEnumAccess().getSemicolonKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAedit.g:3003:1: rule__RemoveSchema__Group__0 : rule__RemoveSchema__Group__0__Impl rule__RemoveSchema__Group__1 ;
    public final void rule__RemoveSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3007:1: ( rule__RemoveSchema__Group__0__Impl rule__RemoveSchema__Group__1 )
            // InternalAedit.g:3008:2: rule__RemoveSchema__Group__0__Impl rule__RemoveSchema__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAedit.g:3015:1: rule__RemoveSchema__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3019:1: ( ( 'remove' ) )
            // InternalAedit.g:3020:1: ( 'remove' )
            {
            // InternalAedit.g:3020:1: ( 'remove' )
            // InternalAedit.g:3021:2: 'remove'
            {
             before(grammarAccess.getRemoveSchemaAccess().getRemoveKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalAedit.g:3030:1: rule__RemoveSchema__Group__1 : rule__RemoveSchema__Group__1__Impl rule__RemoveSchema__Group__2 ;
    public final void rule__RemoveSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3034:1: ( rule__RemoveSchema__Group__1__Impl rule__RemoveSchema__Group__2 )
            // InternalAedit.g:3035:2: rule__RemoveSchema__Group__1__Impl rule__RemoveSchema__Group__2
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
    // InternalAedit.g:3042:1: rule__RemoveSchema__Group__1__Impl : ( ( rule__RemoveSchema__SchemaTypeAssignment_1 ) ) ;
    public final void rule__RemoveSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3046:1: ( ( ( rule__RemoveSchema__SchemaTypeAssignment_1 ) ) )
            // InternalAedit.g:3047:1: ( ( rule__RemoveSchema__SchemaTypeAssignment_1 ) )
            {
            // InternalAedit.g:3047:1: ( ( rule__RemoveSchema__SchemaTypeAssignment_1 ) )
            // InternalAedit.g:3048:2: ( rule__RemoveSchema__SchemaTypeAssignment_1 )
            {
             before(grammarAccess.getRemoveSchemaAccess().getSchemaTypeAssignment_1()); 
            // InternalAedit.g:3049:2: ( rule__RemoveSchema__SchemaTypeAssignment_1 )
            // InternalAedit.g:3049:3: rule__RemoveSchema__SchemaTypeAssignment_1
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
    // InternalAedit.g:3057:1: rule__RemoveSchema__Group__2 : rule__RemoveSchema__Group__2__Impl rule__RemoveSchema__Group__3 ;
    public final void rule__RemoveSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3061:1: ( rule__RemoveSchema__Group__2__Impl rule__RemoveSchema__Group__3 )
            // InternalAedit.g:3062:2: rule__RemoveSchema__Group__2__Impl rule__RemoveSchema__Group__3
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
    // InternalAedit.g:3069:1: rule__RemoveSchema__Group__2__Impl : ( ( rule__RemoveSchema__SchemaAssignment_2 ) ) ;
    public final void rule__RemoveSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3073:1: ( ( ( rule__RemoveSchema__SchemaAssignment_2 ) ) )
            // InternalAedit.g:3074:1: ( ( rule__RemoveSchema__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:3074:1: ( ( rule__RemoveSchema__SchemaAssignment_2 ) )
            // InternalAedit.g:3075:2: ( rule__RemoveSchema__SchemaAssignment_2 )
            {
             before(grammarAccess.getRemoveSchemaAccess().getSchemaAssignment_2()); 
            // InternalAedit.g:3076:2: ( rule__RemoveSchema__SchemaAssignment_2 )
            // InternalAedit.g:3076:3: rule__RemoveSchema__SchemaAssignment_2
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
    // InternalAedit.g:3084:1: rule__RemoveSchema__Group__3 : rule__RemoveSchema__Group__3__Impl ;
    public final void rule__RemoveSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3088:1: ( rule__RemoveSchema__Group__3__Impl )
            // InternalAedit.g:3089:2: rule__RemoveSchema__Group__3__Impl
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
    // InternalAedit.g:3095:1: rule__RemoveSchema__Group__3__Impl : ( ';' ) ;
    public final void rule__RemoveSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3099:1: ( ( ';' ) )
            // InternalAedit.g:3100:1: ( ';' )
            {
            // InternalAedit.g:3100:1: ( ';' )
            // InternalAedit.g:3101:2: ';'
            {
             before(grammarAccess.getRemoveSchemaAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAedit.g:3111:1: rule__RemoveVariable__Group__0 : rule__RemoveVariable__Group__0__Impl rule__RemoveVariable__Group__1 ;
    public final void rule__RemoveVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3115:1: ( rule__RemoveVariable__Group__0__Impl rule__RemoveVariable__Group__1 )
            // InternalAedit.g:3116:2: rule__RemoveVariable__Group__0__Impl rule__RemoveVariable__Group__1
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
    // InternalAedit.g:3123:1: rule__RemoveVariable__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3127:1: ( ( 'remove' ) )
            // InternalAedit.g:3128:1: ( 'remove' )
            {
            // InternalAedit.g:3128:1: ( 'remove' )
            // InternalAedit.g:3129:2: 'remove'
            {
             before(grammarAccess.getRemoveVariableAccess().getRemoveKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalAedit.g:3138:1: rule__RemoveVariable__Group__1 : rule__RemoveVariable__Group__1__Impl rule__RemoveVariable__Group__2 ;
    public final void rule__RemoveVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3142:1: ( rule__RemoveVariable__Group__1__Impl rule__RemoveVariable__Group__2 )
            // InternalAedit.g:3143:2: rule__RemoveVariable__Group__1__Impl rule__RemoveVariable__Group__2
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
    // InternalAedit.g:3150:1: rule__RemoveVariable__Group__1__Impl : ( ( rule__RemoveVariable__VariableAssignment_1 ) ) ;
    public final void rule__RemoveVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3154:1: ( ( ( rule__RemoveVariable__VariableAssignment_1 ) ) )
            // InternalAedit.g:3155:1: ( ( rule__RemoveVariable__VariableAssignment_1 ) )
            {
            // InternalAedit.g:3155:1: ( ( rule__RemoveVariable__VariableAssignment_1 ) )
            // InternalAedit.g:3156:2: ( rule__RemoveVariable__VariableAssignment_1 )
            {
             before(grammarAccess.getRemoveVariableAccess().getVariableAssignment_1()); 
            // InternalAedit.g:3157:2: ( rule__RemoveVariable__VariableAssignment_1 )
            // InternalAedit.g:3157:3: rule__RemoveVariable__VariableAssignment_1
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
    // InternalAedit.g:3165:1: rule__RemoveVariable__Group__2 : rule__RemoveVariable__Group__2__Impl ;
    public final void rule__RemoveVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3169:1: ( rule__RemoveVariable__Group__2__Impl )
            // InternalAedit.g:3170:2: rule__RemoveVariable__Group__2__Impl
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
    // InternalAedit.g:3176:1: rule__RemoveVariable__Group__2__Impl : ( ';' ) ;
    public final void rule__RemoveVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3180:1: ( ( ';' ) )
            // InternalAedit.g:3181:1: ( ';' )
            {
            // InternalAedit.g:3181:1: ( ';' )
            // InternalAedit.g:3182:2: ';'
            {
             before(grammarAccess.getRemoveVariableAccess().getSemicolonKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAedit.g:3192:1: rule__RemoveEnum__Group__0 : rule__RemoveEnum__Group__0__Impl rule__RemoveEnum__Group__1 ;
    public final void rule__RemoveEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3196:1: ( rule__RemoveEnum__Group__0__Impl rule__RemoveEnum__Group__1 )
            // InternalAedit.g:3197:2: rule__RemoveEnum__Group__0__Impl rule__RemoveEnum__Group__1
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
    // InternalAedit.g:3204:1: rule__RemoveEnum__Group__0__Impl : ( 'remove' ) ;
    public final void rule__RemoveEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3208:1: ( ( 'remove' ) )
            // InternalAedit.g:3209:1: ( 'remove' )
            {
            // InternalAedit.g:3209:1: ( 'remove' )
            // InternalAedit.g:3210:2: 'remove'
            {
             before(grammarAccess.getRemoveEnumAccess().getRemoveKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalAedit.g:3219:1: rule__RemoveEnum__Group__1 : rule__RemoveEnum__Group__1__Impl rule__RemoveEnum__Group__2 ;
    public final void rule__RemoveEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3223:1: ( rule__RemoveEnum__Group__1__Impl rule__RemoveEnum__Group__2 )
            // InternalAedit.g:3224:2: rule__RemoveEnum__Group__1__Impl rule__RemoveEnum__Group__2
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
    // InternalAedit.g:3231:1: rule__RemoveEnum__Group__1__Impl : ( ( rule__RemoveEnum__VarNameAssignment_1 ) ) ;
    public final void rule__RemoveEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3235:1: ( ( ( rule__RemoveEnum__VarNameAssignment_1 ) ) )
            // InternalAedit.g:3236:1: ( ( rule__RemoveEnum__VarNameAssignment_1 ) )
            {
            // InternalAedit.g:3236:1: ( ( rule__RemoveEnum__VarNameAssignment_1 ) )
            // InternalAedit.g:3237:2: ( rule__RemoveEnum__VarNameAssignment_1 )
            {
             before(grammarAccess.getRemoveEnumAccess().getVarNameAssignment_1()); 
            // InternalAedit.g:3238:2: ( rule__RemoveEnum__VarNameAssignment_1 )
            // InternalAedit.g:3238:3: rule__RemoveEnum__VarNameAssignment_1
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
    // InternalAedit.g:3246:1: rule__RemoveEnum__Group__2 : rule__RemoveEnum__Group__2__Impl ;
    public final void rule__RemoveEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3250:1: ( rule__RemoveEnum__Group__2__Impl )
            // InternalAedit.g:3251:2: rule__RemoveEnum__Group__2__Impl
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
    // InternalAedit.g:3257:1: rule__RemoveEnum__Group__2__Impl : ( ';' ) ;
    public final void rule__RemoveEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3261:1: ( ( ';' ) )
            // InternalAedit.g:3262:1: ( ';' )
            {
            // InternalAedit.g:3262:1: ( ';' )
            // InternalAedit.g:3263:2: ';'
            {
             before(grammarAccess.getRemoveEnumAccess().getSemicolonKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAedit.g:3273:1: rule__RenameSchema__Group__0 : rule__RenameSchema__Group__0__Impl rule__RenameSchema__Group__1 ;
    public final void rule__RenameSchema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3277:1: ( rule__RenameSchema__Group__0__Impl rule__RenameSchema__Group__1 )
            // InternalAedit.g:3278:2: rule__RenameSchema__Group__0__Impl rule__RenameSchema__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAedit.g:3285:1: rule__RenameSchema__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameSchema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3289:1: ( ( 'rename' ) )
            // InternalAedit.g:3290:1: ( 'rename' )
            {
            // InternalAedit.g:3290:1: ( 'rename' )
            // InternalAedit.g:3291:2: 'rename'
            {
             before(grammarAccess.getRenameSchemaAccess().getRenameKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAedit.g:3300:1: rule__RenameSchema__Group__1 : rule__RenameSchema__Group__1__Impl rule__RenameSchema__Group__2 ;
    public final void rule__RenameSchema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3304:1: ( rule__RenameSchema__Group__1__Impl rule__RenameSchema__Group__2 )
            // InternalAedit.g:3305:2: rule__RenameSchema__Group__1__Impl rule__RenameSchema__Group__2
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
    // InternalAedit.g:3312:1: rule__RenameSchema__Group__1__Impl : ( ( rule__RenameSchema__SchemaTypeAssignment_1 ) ) ;
    public final void rule__RenameSchema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3316:1: ( ( ( rule__RenameSchema__SchemaTypeAssignment_1 ) ) )
            // InternalAedit.g:3317:1: ( ( rule__RenameSchema__SchemaTypeAssignment_1 ) )
            {
            // InternalAedit.g:3317:1: ( ( rule__RenameSchema__SchemaTypeAssignment_1 ) )
            // InternalAedit.g:3318:2: ( rule__RenameSchema__SchemaTypeAssignment_1 )
            {
             before(grammarAccess.getRenameSchemaAccess().getSchemaTypeAssignment_1()); 
            // InternalAedit.g:3319:2: ( rule__RenameSchema__SchemaTypeAssignment_1 )
            // InternalAedit.g:3319:3: rule__RenameSchema__SchemaTypeAssignment_1
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
    // InternalAedit.g:3327:1: rule__RenameSchema__Group__2 : rule__RenameSchema__Group__2__Impl rule__RenameSchema__Group__3 ;
    public final void rule__RenameSchema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3331:1: ( rule__RenameSchema__Group__2__Impl rule__RenameSchema__Group__3 )
            // InternalAedit.g:3332:2: rule__RenameSchema__Group__2__Impl rule__RenameSchema__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalAedit.g:3339:1: rule__RenameSchema__Group__2__Impl : ( ( rule__RenameSchema__SchemaAssignment_2 ) ) ;
    public final void rule__RenameSchema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3343:1: ( ( ( rule__RenameSchema__SchemaAssignment_2 ) ) )
            // InternalAedit.g:3344:1: ( ( rule__RenameSchema__SchemaAssignment_2 ) )
            {
            // InternalAedit.g:3344:1: ( ( rule__RenameSchema__SchemaAssignment_2 ) )
            // InternalAedit.g:3345:2: ( rule__RenameSchema__SchemaAssignment_2 )
            {
             before(grammarAccess.getRenameSchemaAccess().getSchemaAssignment_2()); 
            // InternalAedit.g:3346:2: ( rule__RenameSchema__SchemaAssignment_2 )
            // InternalAedit.g:3346:3: rule__RenameSchema__SchemaAssignment_2
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
    // InternalAedit.g:3354:1: rule__RenameSchema__Group__3 : rule__RenameSchema__Group__3__Impl rule__RenameSchema__Group__4 ;
    public final void rule__RenameSchema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3358:1: ( rule__RenameSchema__Group__3__Impl rule__RenameSchema__Group__4 )
            // InternalAedit.g:3359:2: rule__RenameSchema__Group__3__Impl rule__RenameSchema__Group__4
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
    // InternalAedit.g:3366:1: rule__RenameSchema__Group__3__Impl : ( '=>' ) ;
    public final void rule__RenameSchema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3370:1: ( ( '=>' ) )
            // InternalAedit.g:3371:1: ( '=>' )
            {
            // InternalAedit.g:3371:1: ( '=>' )
            // InternalAedit.g:3372:2: '=>'
            {
             before(grammarAccess.getRenameSchemaAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAedit.g:3381:1: rule__RenameSchema__Group__4 : rule__RenameSchema__Group__4__Impl rule__RenameSchema__Group__5 ;
    public final void rule__RenameSchema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3385:1: ( rule__RenameSchema__Group__4__Impl rule__RenameSchema__Group__5 )
            // InternalAedit.g:3386:2: rule__RenameSchema__Group__4__Impl rule__RenameSchema__Group__5
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
    // InternalAedit.g:3393:1: rule__RenameSchema__Group__4__Impl : ( ( rule__RenameSchema__NewSchNameAssignment_4 ) ) ;
    public final void rule__RenameSchema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3397:1: ( ( ( rule__RenameSchema__NewSchNameAssignment_4 ) ) )
            // InternalAedit.g:3398:1: ( ( rule__RenameSchema__NewSchNameAssignment_4 ) )
            {
            // InternalAedit.g:3398:1: ( ( rule__RenameSchema__NewSchNameAssignment_4 ) )
            // InternalAedit.g:3399:2: ( rule__RenameSchema__NewSchNameAssignment_4 )
            {
             before(grammarAccess.getRenameSchemaAccess().getNewSchNameAssignment_4()); 
            // InternalAedit.g:3400:2: ( rule__RenameSchema__NewSchNameAssignment_4 )
            // InternalAedit.g:3400:3: rule__RenameSchema__NewSchNameAssignment_4
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
    // InternalAedit.g:3408:1: rule__RenameSchema__Group__5 : rule__RenameSchema__Group__5__Impl ;
    public final void rule__RenameSchema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3412:1: ( rule__RenameSchema__Group__5__Impl )
            // InternalAedit.g:3413:2: rule__RenameSchema__Group__5__Impl
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
    // InternalAedit.g:3419:1: rule__RenameSchema__Group__5__Impl : ( ';' ) ;
    public final void rule__RenameSchema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3423:1: ( ( ';' ) )
            // InternalAedit.g:3424:1: ( ';' )
            {
            // InternalAedit.g:3424:1: ( ';' )
            // InternalAedit.g:3425:2: ';'
            {
             before(grammarAccess.getRenameSchemaAccess().getSemicolonKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAedit.g:3435:1: rule__RenameVariable__Group__0 : rule__RenameVariable__Group__0__Impl rule__RenameVariable__Group__1 ;
    public final void rule__RenameVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3439:1: ( rule__RenameVariable__Group__0__Impl rule__RenameVariable__Group__1 )
            // InternalAedit.g:3440:2: rule__RenameVariable__Group__0__Impl rule__RenameVariable__Group__1
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
    // InternalAedit.g:3447:1: rule__RenameVariable__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3451:1: ( ( 'rename' ) )
            // InternalAedit.g:3452:1: ( 'rename' )
            {
            // InternalAedit.g:3452:1: ( 'rename' )
            // InternalAedit.g:3453:2: 'rename'
            {
             before(grammarAccess.getRenameVariableAccess().getRenameKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAedit.g:3462:1: rule__RenameVariable__Group__1 : rule__RenameVariable__Group__1__Impl rule__RenameVariable__Group__2 ;
    public final void rule__RenameVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3466:1: ( rule__RenameVariable__Group__1__Impl rule__RenameVariable__Group__2 )
            // InternalAedit.g:3467:2: rule__RenameVariable__Group__1__Impl rule__RenameVariable__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalAedit.g:3474:1: rule__RenameVariable__Group__1__Impl : ( ( rule__RenameVariable__VariableAssignment_1 ) ) ;
    public final void rule__RenameVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3478:1: ( ( ( rule__RenameVariable__VariableAssignment_1 ) ) )
            // InternalAedit.g:3479:1: ( ( rule__RenameVariable__VariableAssignment_1 ) )
            {
            // InternalAedit.g:3479:1: ( ( rule__RenameVariable__VariableAssignment_1 ) )
            // InternalAedit.g:3480:2: ( rule__RenameVariable__VariableAssignment_1 )
            {
             before(grammarAccess.getRenameVariableAccess().getVariableAssignment_1()); 
            // InternalAedit.g:3481:2: ( rule__RenameVariable__VariableAssignment_1 )
            // InternalAedit.g:3481:3: rule__RenameVariable__VariableAssignment_1
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
    // InternalAedit.g:3489:1: rule__RenameVariable__Group__2 : rule__RenameVariable__Group__2__Impl rule__RenameVariable__Group__3 ;
    public final void rule__RenameVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3493:1: ( rule__RenameVariable__Group__2__Impl rule__RenameVariable__Group__3 )
            // InternalAedit.g:3494:2: rule__RenameVariable__Group__2__Impl rule__RenameVariable__Group__3
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
    // InternalAedit.g:3501:1: rule__RenameVariable__Group__2__Impl : ( '=>' ) ;
    public final void rule__RenameVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3505:1: ( ( '=>' ) )
            // InternalAedit.g:3506:1: ( '=>' )
            {
            // InternalAedit.g:3506:1: ( '=>' )
            // InternalAedit.g:3507:2: '=>'
            {
             before(grammarAccess.getRenameVariableAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAedit.g:3516:1: rule__RenameVariable__Group__3 : rule__RenameVariable__Group__3__Impl rule__RenameVariable__Group__4 ;
    public final void rule__RenameVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3520:1: ( rule__RenameVariable__Group__3__Impl rule__RenameVariable__Group__4 )
            // InternalAedit.g:3521:2: rule__RenameVariable__Group__3__Impl rule__RenameVariable__Group__4
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
    // InternalAedit.g:3528:1: rule__RenameVariable__Group__3__Impl : ( ( rule__RenameVariable__NewVarNameAssignment_3 ) ) ;
    public final void rule__RenameVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3532:1: ( ( ( rule__RenameVariable__NewVarNameAssignment_3 ) ) )
            // InternalAedit.g:3533:1: ( ( rule__RenameVariable__NewVarNameAssignment_3 ) )
            {
            // InternalAedit.g:3533:1: ( ( rule__RenameVariable__NewVarNameAssignment_3 ) )
            // InternalAedit.g:3534:2: ( rule__RenameVariable__NewVarNameAssignment_3 )
            {
             before(grammarAccess.getRenameVariableAccess().getNewVarNameAssignment_3()); 
            // InternalAedit.g:3535:2: ( rule__RenameVariable__NewVarNameAssignment_3 )
            // InternalAedit.g:3535:3: rule__RenameVariable__NewVarNameAssignment_3
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
    // InternalAedit.g:3543:1: rule__RenameVariable__Group__4 : rule__RenameVariable__Group__4__Impl ;
    public final void rule__RenameVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3547:1: ( rule__RenameVariable__Group__4__Impl )
            // InternalAedit.g:3548:2: rule__RenameVariable__Group__4__Impl
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
    // InternalAedit.g:3554:1: rule__RenameVariable__Group__4__Impl : ( ';' ) ;
    public final void rule__RenameVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3558:1: ( ( ';' ) )
            // InternalAedit.g:3559:1: ( ';' )
            {
            // InternalAedit.g:3559:1: ( ';' )
            // InternalAedit.g:3560:2: ';'
            {
             before(grammarAccess.getRenameVariableAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAedit.g:3570:1: rule__RenameEnum__Group__0 : rule__RenameEnum__Group__0__Impl rule__RenameEnum__Group__1 ;
    public final void rule__RenameEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3574:1: ( rule__RenameEnum__Group__0__Impl rule__RenameEnum__Group__1 )
            // InternalAedit.g:3575:2: rule__RenameEnum__Group__0__Impl rule__RenameEnum__Group__1
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
    // InternalAedit.g:3582:1: rule__RenameEnum__Group__0__Impl : ( 'rename' ) ;
    public final void rule__RenameEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3586:1: ( ( 'rename' ) )
            // InternalAedit.g:3587:1: ( 'rename' )
            {
            // InternalAedit.g:3587:1: ( 'rename' )
            // InternalAedit.g:3588:2: 'rename'
            {
             before(grammarAccess.getRenameEnumAccess().getRenameKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAedit.g:3597:1: rule__RenameEnum__Group__1 : rule__RenameEnum__Group__1__Impl rule__RenameEnum__Group__2 ;
    public final void rule__RenameEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3601:1: ( rule__RenameEnum__Group__1__Impl rule__RenameEnum__Group__2 )
            // InternalAedit.g:3602:2: rule__RenameEnum__Group__1__Impl rule__RenameEnum__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalAedit.g:3609:1: rule__RenameEnum__Group__1__Impl : ( ( rule__RenameEnum__OldNameAssignment_1 ) ) ;
    public final void rule__RenameEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3613:1: ( ( ( rule__RenameEnum__OldNameAssignment_1 ) ) )
            // InternalAedit.g:3614:1: ( ( rule__RenameEnum__OldNameAssignment_1 ) )
            {
            // InternalAedit.g:3614:1: ( ( rule__RenameEnum__OldNameAssignment_1 ) )
            // InternalAedit.g:3615:2: ( rule__RenameEnum__OldNameAssignment_1 )
            {
             before(grammarAccess.getRenameEnumAccess().getOldNameAssignment_1()); 
            // InternalAedit.g:3616:2: ( rule__RenameEnum__OldNameAssignment_1 )
            // InternalAedit.g:3616:3: rule__RenameEnum__OldNameAssignment_1
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
    // InternalAedit.g:3624:1: rule__RenameEnum__Group__2 : rule__RenameEnum__Group__2__Impl rule__RenameEnum__Group__3 ;
    public final void rule__RenameEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3628:1: ( rule__RenameEnum__Group__2__Impl rule__RenameEnum__Group__3 )
            // InternalAedit.g:3629:2: rule__RenameEnum__Group__2__Impl rule__RenameEnum__Group__3
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
    // InternalAedit.g:3636:1: rule__RenameEnum__Group__2__Impl : ( '=>' ) ;
    public final void rule__RenameEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3640:1: ( ( '=>' ) )
            // InternalAedit.g:3641:1: ( '=>' )
            {
            // InternalAedit.g:3641:1: ( '=>' )
            // InternalAedit.g:3642:2: '=>'
            {
             before(grammarAccess.getRenameEnumAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAedit.g:3651:1: rule__RenameEnum__Group__3 : rule__RenameEnum__Group__3__Impl rule__RenameEnum__Group__4 ;
    public final void rule__RenameEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3655:1: ( rule__RenameEnum__Group__3__Impl rule__RenameEnum__Group__4 )
            // InternalAedit.g:3656:2: rule__RenameEnum__Group__3__Impl rule__RenameEnum__Group__4
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
    // InternalAedit.g:3663:1: rule__RenameEnum__Group__3__Impl : ( ( rule__RenameEnum__NewEnumNameAssignment_3 ) ) ;
    public final void rule__RenameEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3667:1: ( ( ( rule__RenameEnum__NewEnumNameAssignment_3 ) ) )
            // InternalAedit.g:3668:1: ( ( rule__RenameEnum__NewEnumNameAssignment_3 ) )
            {
            // InternalAedit.g:3668:1: ( ( rule__RenameEnum__NewEnumNameAssignment_3 ) )
            // InternalAedit.g:3669:2: ( rule__RenameEnum__NewEnumNameAssignment_3 )
            {
             before(grammarAccess.getRenameEnumAccess().getNewEnumNameAssignment_3()); 
            // InternalAedit.g:3670:2: ( rule__RenameEnum__NewEnumNameAssignment_3 )
            // InternalAedit.g:3670:3: rule__RenameEnum__NewEnumNameAssignment_3
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
    // InternalAedit.g:3678:1: rule__RenameEnum__Group__4 : rule__RenameEnum__Group__4__Impl ;
    public final void rule__RenameEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3682:1: ( rule__RenameEnum__Group__4__Impl )
            // InternalAedit.g:3683:2: rule__RenameEnum__Group__4__Impl
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
    // InternalAedit.g:3689:1: rule__RenameEnum__Group__4__Impl : ( ';' ) ;
    public final void rule__RenameEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3693:1: ( ( ';' ) )
            // InternalAedit.g:3694:1: ( ';' )
            {
            // InternalAedit.g:3694:1: ( ';' )
            // InternalAedit.g:3695:2: ';'
            {
             before(grammarAccess.getRenameEnumAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAedit.g:3705:1: rule__ChangeDefValue__Group__0 : rule__ChangeDefValue__Group__0__Impl rule__ChangeDefValue__Group__1 ;
    public final void rule__ChangeDefValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3709:1: ( rule__ChangeDefValue__Group__0__Impl rule__ChangeDefValue__Group__1 )
            // InternalAedit.g:3710:2: rule__ChangeDefValue__Group__0__Impl rule__ChangeDefValue__Group__1
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
    // InternalAedit.g:3717:1: rule__ChangeDefValue__Group__0__Impl : ( 'set_val' ) ;
    public final void rule__ChangeDefValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3721:1: ( ( 'set_val' ) )
            // InternalAedit.g:3722:1: ( 'set_val' )
            {
            // InternalAedit.g:3722:1: ( 'set_val' )
            // InternalAedit.g:3723:2: 'set_val'
            {
             before(grammarAccess.getChangeDefValueAccess().getSet_valKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAedit.g:3732:1: rule__ChangeDefValue__Group__1 : rule__ChangeDefValue__Group__1__Impl rule__ChangeDefValue__Group__2 ;
    public final void rule__ChangeDefValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3736:1: ( rule__ChangeDefValue__Group__1__Impl rule__ChangeDefValue__Group__2 )
            // InternalAedit.g:3737:2: rule__ChangeDefValue__Group__1__Impl rule__ChangeDefValue__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalAedit.g:3744:1: rule__ChangeDefValue__Group__1__Impl : ( ( rule__ChangeDefValue__FieldAssignment_1 ) ) ;
    public final void rule__ChangeDefValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3748:1: ( ( ( rule__ChangeDefValue__FieldAssignment_1 ) ) )
            // InternalAedit.g:3749:1: ( ( rule__ChangeDefValue__FieldAssignment_1 ) )
            {
            // InternalAedit.g:3749:1: ( ( rule__ChangeDefValue__FieldAssignment_1 ) )
            // InternalAedit.g:3750:2: ( rule__ChangeDefValue__FieldAssignment_1 )
            {
             before(grammarAccess.getChangeDefValueAccess().getFieldAssignment_1()); 
            // InternalAedit.g:3751:2: ( rule__ChangeDefValue__FieldAssignment_1 )
            // InternalAedit.g:3751:3: rule__ChangeDefValue__FieldAssignment_1
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
    // InternalAedit.g:3759:1: rule__ChangeDefValue__Group__2 : rule__ChangeDefValue__Group__2__Impl rule__ChangeDefValue__Group__3 ;
    public final void rule__ChangeDefValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3763:1: ( rule__ChangeDefValue__Group__2__Impl rule__ChangeDefValue__Group__3 )
            // InternalAedit.g:3764:2: rule__ChangeDefValue__Group__2__Impl rule__ChangeDefValue__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalAedit.g:3771:1: rule__ChangeDefValue__Group__2__Impl : ( '=>' ) ;
    public final void rule__ChangeDefValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3775:1: ( ( '=>' ) )
            // InternalAedit.g:3776:1: ( '=>' )
            {
            // InternalAedit.g:3776:1: ( '=>' )
            // InternalAedit.g:3777:2: '=>'
            {
             before(grammarAccess.getChangeDefValueAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAedit.g:3786:1: rule__ChangeDefValue__Group__3 : rule__ChangeDefValue__Group__3__Impl rule__ChangeDefValue__Group__4 ;
    public final void rule__ChangeDefValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3790:1: ( rule__ChangeDefValue__Group__3__Impl rule__ChangeDefValue__Group__4 )
            // InternalAedit.g:3791:2: rule__ChangeDefValue__Group__3__Impl rule__ChangeDefValue__Group__4
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
    // InternalAedit.g:3798:1: rule__ChangeDefValue__Group__3__Impl : ( ( rule__ChangeDefValue__NewValAssignment_3 ) ) ;
    public final void rule__ChangeDefValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3802:1: ( ( ( rule__ChangeDefValue__NewValAssignment_3 ) ) )
            // InternalAedit.g:3803:1: ( ( rule__ChangeDefValue__NewValAssignment_3 ) )
            {
            // InternalAedit.g:3803:1: ( ( rule__ChangeDefValue__NewValAssignment_3 ) )
            // InternalAedit.g:3804:2: ( rule__ChangeDefValue__NewValAssignment_3 )
            {
             before(grammarAccess.getChangeDefValueAccess().getNewValAssignment_3()); 
            // InternalAedit.g:3805:2: ( rule__ChangeDefValue__NewValAssignment_3 )
            // InternalAedit.g:3805:3: rule__ChangeDefValue__NewValAssignment_3
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
    // InternalAedit.g:3813:1: rule__ChangeDefValue__Group__4 : rule__ChangeDefValue__Group__4__Impl ;
    public final void rule__ChangeDefValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3817:1: ( rule__ChangeDefValue__Group__4__Impl )
            // InternalAedit.g:3818:2: rule__ChangeDefValue__Group__4__Impl
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
    // InternalAedit.g:3824:1: rule__ChangeDefValue__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeDefValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3828:1: ( ( ';' ) )
            // InternalAedit.g:3829:1: ( ';' )
            {
            // InternalAedit.g:3829:1: ( ';' )
            // InternalAedit.g:3830:2: ';'
            {
             before(grammarAccess.getChangeDefValueAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAedit.g:3840:1: rule__ChangeType__Group__0 : rule__ChangeType__Group__0__Impl rule__ChangeType__Group__1 ;
    public final void rule__ChangeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3844:1: ( rule__ChangeType__Group__0__Impl rule__ChangeType__Group__1 )
            // InternalAedit.g:3845:2: rule__ChangeType__Group__0__Impl rule__ChangeType__Group__1
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
    // InternalAedit.g:3852:1: rule__ChangeType__Group__0__Impl : ( 'set_type' ) ;
    public final void rule__ChangeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3856:1: ( ( 'set_type' ) )
            // InternalAedit.g:3857:1: ( 'set_type' )
            {
            // InternalAedit.g:3857:1: ( 'set_type' )
            // InternalAedit.g:3858:2: 'set_type'
            {
             before(grammarAccess.getChangeTypeAccess().getSet_typeKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAedit.g:3867:1: rule__ChangeType__Group__1 : rule__ChangeType__Group__1__Impl rule__ChangeType__Group__2 ;
    public final void rule__ChangeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3871:1: ( rule__ChangeType__Group__1__Impl rule__ChangeType__Group__2 )
            // InternalAedit.g:3872:2: rule__ChangeType__Group__1__Impl rule__ChangeType__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalAedit.g:3879:1: rule__ChangeType__Group__1__Impl : ( ( rule__ChangeType__FieldAssignment_1 ) ) ;
    public final void rule__ChangeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3883:1: ( ( ( rule__ChangeType__FieldAssignment_1 ) ) )
            // InternalAedit.g:3884:1: ( ( rule__ChangeType__FieldAssignment_1 ) )
            {
            // InternalAedit.g:3884:1: ( ( rule__ChangeType__FieldAssignment_1 ) )
            // InternalAedit.g:3885:2: ( rule__ChangeType__FieldAssignment_1 )
            {
             before(grammarAccess.getChangeTypeAccess().getFieldAssignment_1()); 
            // InternalAedit.g:3886:2: ( rule__ChangeType__FieldAssignment_1 )
            // InternalAedit.g:3886:3: rule__ChangeType__FieldAssignment_1
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
    // InternalAedit.g:3894:1: rule__ChangeType__Group__2 : rule__ChangeType__Group__2__Impl rule__ChangeType__Group__3 ;
    public final void rule__ChangeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3898:1: ( rule__ChangeType__Group__2__Impl rule__ChangeType__Group__3 )
            // InternalAedit.g:3899:2: rule__ChangeType__Group__2__Impl rule__ChangeType__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalAedit.g:3906:1: rule__ChangeType__Group__2__Impl : ( '=>' ) ;
    public final void rule__ChangeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3910:1: ( ( '=>' ) )
            // InternalAedit.g:3911:1: ( '=>' )
            {
            // InternalAedit.g:3911:1: ( '=>' )
            // InternalAedit.g:3912:2: '=>'
            {
             before(grammarAccess.getChangeTypeAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAedit.g:3921:1: rule__ChangeType__Group__3 : rule__ChangeType__Group__3__Impl rule__ChangeType__Group__4 ;
    public final void rule__ChangeType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3925:1: ( rule__ChangeType__Group__3__Impl rule__ChangeType__Group__4 )
            // InternalAedit.g:3926:2: rule__ChangeType__Group__3__Impl rule__ChangeType__Group__4
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
    // InternalAedit.g:3933:1: rule__ChangeType__Group__3__Impl : ( ( rule__ChangeType__NewTypeAssignment_3 ) ) ;
    public final void rule__ChangeType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3937:1: ( ( ( rule__ChangeType__NewTypeAssignment_3 ) ) )
            // InternalAedit.g:3938:1: ( ( rule__ChangeType__NewTypeAssignment_3 ) )
            {
            // InternalAedit.g:3938:1: ( ( rule__ChangeType__NewTypeAssignment_3 ) )
            // InternalAedit.g:3939:2: ( rule__ChangeType__NewTypeAssignment_3 )
            {
             before(grammarAccess.getChangeTypeAccess().getNewTypeAssignment_3()); 
            // InternalAedit.g:3940:2: ( rule__ChangeType__NewTypeAssignment_3 )
            // InternalAedit.g:3940:3: rule__ChangeType__NewTypeAssignment_3
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
    // InternalAedit.g:3948:1: rule__ChangeType__Group__4 : rule__ChangeType__Group__4__Impl ;
    public final void rule__ChangeType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3952:1: ( rule__ChangeType__Group__4__Impl )
            // InternalAedit.g:3953:2: rule__ChangeType__Group__4__Impl
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
    // InternalAedit.g:3959:1: rule__ChangeType__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3963:1: ( ( ';' ) )
            // InternalAedit.g:3964:1: ( ';' )
            {
            // InternalAedit.g:3964:1: ( ';' )
            // InternalAedit.g:3965:2: ';'
            {
             before(grammarAccess.getChangeTypeAccess().getSemicolonKeyword_4()); 
            match(input,24,FOLLOW_2); 
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


    // $ANTLR start "rule__Field__Group__0"
    // InternalAedit.g:3975:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3979:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalAedit.g:3980:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalAedit.g:3987:1: rule__Field__Group__0__Impl : ( ( rule__Field__TypeAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:3991:1: ( ( ( rule__Field__TypeAssignment_0 ) ) )
            // InternalAedit.g:3992:1: ( ( rule__Field__TypeAssignment_0 ) )
            {
            // InternalAedit.g:3992:1: ( ( rule__Field__TypeAssignment_0 ) )
            // InternalAedit.g:3993:2: ( rule__Field__TypeAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_0()); 
            // InternalAedit.g:3994:2: ( rule__Field__TypeAssignment_0 )
            // InternalAedit.g:3994:3: rule__Field__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // InternalAedit.g:4002:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4006:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalAedit.g:4007:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalAedit.g:4014:1: rule__Field__Group__1__Impl : ( ( rule__Field__VarNameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4018:1: ( ( ( rule__Field__VarNameAssignment_1 ) ) )
            // InternalAedit.g:4019:1: ( ( rule__Field__VarNameAssignment_1 ) )
            {
            // InternalAedit.g:4019:1: ( ( rule__Field__VarNameAssignment_1 ) )
            // InternalAedit.g:4020:2: ( rule__Field__VarNameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getVarNameAssignment_1()); 
            // InternalAedit.g:4021:2: ( rule__Field__VarNameAssignment_1 )
            // InternalAedit.g:4021:3: rule__Field__VarNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__VarNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getVarNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Field__Group__2"
    // InternalAedit.g:4029:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4033:1: ( rule__Field__Group__2__Impl )
            // InternalAedit.g:4034:2: rule__Field__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__2__Impl();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalAedit.g:4040:1: rule__Field__Group__2__Impl : ( ( rule__Field__Group_2__0 )? ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4044:1: ( ( ( rule__Field__Group_2__0 )? ) )
            // InternalAedit.g:4045:1: ( ( rule__Field__Group_2__0 )? )
            {
            // InternalAedit.g:4045:1: ( ( rule__Field__Group_2__0 )? )
            // InternalAedit.g:4046:2: ( rule__Field__Group_2__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_2()); 
            // InternalAedit.g:4047:2: ( rule__Field__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAedit.g:4047:3: rule__Field__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group_2__0"
    // InternalAedit.g:4056:1: rule__Field__Group_2__0 : rule__Field__Group_2__0__Impl rule__Field__Group_2__1 ;
    public final void rule__Field__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4060:1: ( rule__Field__Group_2__0__Impl rule__Field__Group_2__1 )
            // InternalAedit.g:4061:2: rule__Field__Group_2__0__Impl rule__Field__Group_2__1
            {
            pushFollow(FOLLOW_32);
            rule__Field__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_2__1();

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
    // $ANTLR end "rule__Field__Group_2__0"


    // $ANTLR start "rule__Field__Group_2__0__Impl"
    // InternalAedit.g:4068:1: rule__Field__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Field__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4072:1: ( ( '=' ) )
            // InternalAedit.g:4073:1: ( '=' )
            {
            // InternalAedit.g:4073:1: ( '=' )
            // InternalAedit.g:4074:2: '='
            {
             before(grammarAccess.getFieldAccess().getEqualsSignKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_2__0__Impl"


    // $ANTLR start "rule__Field__Group_2__1"
    // InternalAedit.g:4083:1: rule__Field__Group_2__1 : rule__Field__Group_2__1__Impl ;
    public final void rule__Field__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4087:1: ( rule__Field__Group_2__1__Impl )
            // InternalAedit.g:4088:2: rule__Field__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_2__1__Impl();

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
    // $ANTLR end "rule__Field__Group_2__1"


    // $ANTLR start "rule__Field__Group_2__1__Impl"
    // InternalAedit.g:4094:1: rule__Field__Group_2__1__Impl : ( ( rule__Field__ValueAssignment_2_1 ) ) ;
    public final void rule__Field__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4098:1: ( ( ( rule__Field__ValueAssignment_2_1 ) ) )
            // InternalAedit.g:4099:1: ( ( rule__Field__ValueAssignment_2_1 ) )
            {
            // InternalAedit.g:4099:1: ( ( rule__Field__ValueAssignment_2_1 ) )
            // InternalAedit.g:4100:2: ( rule__Field__ValueAssignment_2_1 )
            {
             before(grammarAccess.getFieldAccess().getValueAssignment_2_1()); 
            // InternalAedit.g:4101:2: ( rule__Field__ValueAssignment_2_1 )
            // InternalAedit.g:4101:3: rule__Field__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_2__1__Impl"


    // $ANTLR start "rule__Real__Group__0"
    // InternalAedit.g:4110:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4114:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // InternalAedit.g:4115:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalAedit.g:4122:1: rule__Real__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4126:1: ( ( ( '-' )? ) )
            // InternalAedit.g:4127:1: ( ( '-' )? )
            {
            // InternalAedit.g:4127:1: ( ( '-' )? )
            // InternalAedit.g:4128:2: ( '-' )?
            {
             before(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
            // InternalAedit.g:4129:2: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAedit.g:4129:3: '-'
                    {
                    match(input,38,FOLLOW_2); 

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
    // InternalAedit.g:4137:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4141:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // InternalAedit.g:4142:2: rule__Real__Group__1__Impl rule__Real__Group__2
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
    // InternalAedit.g:4149:1: rule__Real__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4153:1: ( ( RULE_INT ) )
            // InternalAedit.g:4154:1: ( RULE_INT )
            {
            // InternalAedit.g:4154:1: ( RULE_INT )
            // InternalAedit.g:4155:2: RULE_INT
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
    // InternalAedit.g:4164:1: rule__Real__Group__2 : rule__Real__Group__2__Impl rule__Real__Group__3 ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4168:1: ( rule__Real__Group__2__Impl rule__Real__Group__3 )
            // InternalAedit.g:4169:2: rule__Real__Group__2__Impl rule__Real__Group__3
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
    // InternalAedit.g:4176:1: rule__Real__Group__2__Impl : ( '.' ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4180:1: ( ( '.' ) )
            // InternalAedit.g:4181:1: ( '.' )
            {
            // InternalAedit.g:4181:1: ( '.' )
            // InternalAedit.g:4182:2: '.'
            {
             before(grammarAccess.getRealAccess().getFullStopKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAedit.g:4191:1: rule__Real__Group__3 : rule__Real__Group__3__Impl ;
    public final void rule__Real__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4195:1: ( rule__Real__Group__3__Impl )
            // InternalAedit.g:4196:2: rule__Real__Group__3__Impl
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
    // InternalAedit.g:4202:1: rule__Real__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4206:1: ( ( RULE_INT ) )
            // InternalAedit.g:4207:1: ( RULE_INT )
            {
            // InternalAedit.g:4207:1: ( RULE_INT )
            // InternalAedit.g:4208:2: RULE_INT
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
    // InternalAedit.g:4218:1: rule__QN__Group__0 : rule__QN__Group__0__Impl rule__QN__Group__1 ;
    public final void rule__QN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4222:1: ( rule__QN__Group__0__Impl rule__QN__Group__1 )
            // InternalAedit.g:4223:2: rule__QN__Group__0__Impl rule__QN__Group__1
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
    // InternalAedit.g:4230:1: rule__QN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4234:1: ( ( RULE_ID ) )
            // InternalAedit.g:4235:1: ( RULE_ID )
            {
            // InternalAedit.g:4235:1: ( RULE_ID )
            // InternalAedit.g:4236:2: RULE_ID
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
    // InternalAedit.g:4245:1: rule__QN__Group__1 : rule__QN__Group__1__Impl ;
    public final void rule__QN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4249:1: ( rule__QN__Group__1__Impl )
            // InternalAedit.g:4250:2: rule__QN__Group__1__Impl
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
    // InternalAedit.g:4256:1: rule__QN__Group__1__Impl : ( ( rule__QN__Group_1__0 )* ) ;
    public final void rule__QN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4260:1: ( ( ( rule__QN__Group_1__0 )* ) )
            // InternalAedit.g:4261:1: ( ( rule__QN__Group_1__0 )* )
            {
            // InternalAedit.g:4261:1: ( ( rule__QN__Group_1__0 )* )
            // InternalAedit.g:4262:2: ( rule__QN__Group_1__0 )*
            {
             before(grammarAccess.getQNAccess().getGroup_1()); 
            // InternalAedit.g:4263:2: ( rule__QN__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==31) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAedit.g:4263:3: rule__QN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__QN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalAedit.g:4272:1: rule__QN__Group_1__0 : rule__QN__Group_1__0__Impl rule__QN__Group_1__1 ;
    public final void rule__QN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4276:1: ( rule__QN__Group_1__0__Impl rule__QN__Group_1__1 )
            // InternalAedit.g:4277:2: rule__QN__Group_1__0__Impl rule__QN__Group_1__1
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
    // InternalAedit.g:4284:1: rule__QN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4288:1: ( ( '.' ) )
            // InternalAedit.g:4289:1: ( '.' )
            {
            // InternalAedit.g:4289:1: ( '.' )
            // InternalAedit.g:4290:2: '.'
            {
             before(grammarAccess.getQNAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAedit.g:4299:1: rule__QN__Group_1__1 : rule__QN__Group_1__1__Impl ;
    public final void rule__QN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4303:1: ( rule__QN__Group_1__1__Impl )
            // InternalAedit.g:4304:2: rule__QN__Group_1__1__Impl
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
    // InternalAedit.g:4310:1: rule__QN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4314:1: ( ( RULE_ID ) )
            // InternalAedit.g:4315:1: ( RULE_ID )
            {
            // InternalAedit.g:4315:1: ( RULE_ID )
            // InternalAedit.g:4316:2: RULE_ID
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
    // InternalAedit.g:4326:1: rule__Model__RuleDeclarationsAssignment_0 : ( ruleRuleDeclaration ) ;
    public final void rule__Model__RuleDeclarationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4330:1: ( ( ruleRuleDeclaration ) )
            // InternalAedit.g:4331:2: ( ruleRuleDeclaration )
            {
            // InternalAedit.g:4331:2: ( ruleRuleDeclaration )
            // InternalAedit.g:4332:3: ruleRuleDeclaration
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
    // InternalAedit.g:4341:1: rule__Model__RuleMapsAssignment_1 : ( ruleRuleMap ) ;
    public final void rule__Model__RuleMapsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4345:1: ( ( ruleRuleMap ) )
            // InternalAedit.g:4346:2: ( ruleRuleMap )
            {
            // InternalAedit.g:4346:2: ( ruleRuleMap )
            // InternalAedit.g:4347:3: ruleRuleMap
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
    // InternalAedit.g:4356:1: rule__Model__FeaturesAssignment_2 : ( ruleFeature ) ;
    public final void rule__Model__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4360:1: ( ( ruleFeature ) )
            // InternalAedit.g:4361:2: ( ruleFeature )
            {
            // InternalAedit.g:4361:2: ( ruleFeature )
            // InternalAedit.g:4362:3: ruleFeature
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
    // InternalAedit.g:4371:1: rule__Model__FeatureMapsAssignment_3 : ( ruleFeatureMap ) ;
    public final void rule__Model__FeatureMapsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4375:1: ( ( ruleFeatureMap ) )
            // InternalAedit.g:4376:2: ( ruleFeatureMap )
            {
            // InternalAedit.g:4376:2: ( ruleFeatureMap )
            // InternalAedit.g:4377:3: ruleFeatureMap
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
    // InternalAedit.g:4386:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4390:1: ( ( RULE_ID ) )
            // InternalAedit.g:4391:2: ( RULE_ID )
            {
            // InternalAedit.g:4391:2: ( RULE_ID )
            // InternalAedit.g:4392:3: RULE_ID
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
    // InternalAedit.g:4401:1: rule__Feature__ExtendAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__ExtendAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4405:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:4406:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:4406:2: ( ( RULE_ID ) )
            // InternalAedit.g:4407:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getExtendFeatureCrossReference_2_1_0()); 
            // InternalAedit.g:4408:3: ( RULE_ID )
            // InternalAedit.g:4409:4: RULE_ID
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
    // InternalAedit.g:4420:1: rule__Feature__RuleMapsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__RuleMapsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4424:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:4425:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:4425:2: ( ( RULE_ID ) )
            // InternalAedit.g:4426:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getRuleMapsRuleMapCrossReference_4_0()); 
            // InternalAedit.g:4427:3: ( RULE_ID )
            // InternalAedit.g:4428:4: RULE_ID
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
    // InternalAedit.g:4439:1: rule__FeatureMap__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureMap__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4443:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:4444:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:4444:2: ( ( RULE_ID ) )
            // InternalAedit.g:4445:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureMapAccess().getNameFeatureCrossReference_1_0()); 
            // InternalAedit.g:4446:3: ( RULE_ID )
            // InternalAedit.g:4447:4: RULE_ID
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
    // InternalAedit.g:4458:1: rule__RuleMap__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuleMap__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4462:1: ( ( RULE_ID ) )
            // InternalAedit.g:4463:2: ( RULE_ID )
            {
            // InternalAedit.g:4463:2: ( RULE_ID )
            // InternalAedit.g:4464:3: RULE_ID
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
    // InternalAedit.g:4473:1: rule__RuleMap__RulesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RuleMap__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4477:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:4478:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:4478:2: ( ( RULE_ID ) )
            // InternalAedit.g:4479:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleMapAccess().getRulesRuleDeclarationCrossReference_3_0()); 
            // InternalAedit.g:4480:3: ( RULE_ID )
            // InternalAedit.g:4481:4: RULE_ID
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
    // InternalAedit.g:4492:1: rule__RuleDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuleDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4496:1: ( ( RULE_ID ) )
            // InternalAedit.g:4497:2: ( RULE_ID )
            {
            // InternalAedit.g:4497:2: ( RULE_ID )
            // InternalAedit.g:4498:3: RULE_ID
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
    // InternalAedit.g:4507:1: rule__RuleDeclaration__RulesAssignment_3 : ( ruleGenericRule ) ;
    public final void rule__RuleDeclaration__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4511:1: ( ( ruleGenericRule ) )
            // InternalAedit.g:4512:2: ( ruleGenericRule )
            {
            // InternalAedit.g:4512:2: ( ruleGenericRule )
            // InternalAedit.g:4513:3: ruleGenericRule
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
    // InternalAedit.g:4522:1: rule__ChangeSchema__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__ChangeSchema__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4526:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:4527:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:4527:2: ( ( ruleQN ) )
            // InternalAedit.g:4528:3: ( ruleQN )
            {
             before(grammarAccess.getChangeSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            // InternalAedit.g:4529:3: ( ruleQN )
            // InternalAedit.g:4530:4: ruleQN
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
    // InternalAedit.g:4541:1: rule__ChangeSchema__RulesAssignment_4 : ( ruleSchemaRule ) ;
    public final void rule__ChangeSchema__RulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4545:1: ( ( ruleSchemaRule ) )
            // InternalAedit.g:4546:2: ( ruleSchemaRule )
            {
            // InternalAedit.g:4546:2: ( ruleSchemaRule )
            // InternalAedit.g:4547:3: ruleSchemaRule
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
    // InternalAedit.g:4556:1: rule__ChangeEnum__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__ChangeEnum__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4560:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:4561:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:4561:2: ( ( ruleQN ) )
            // InternalAedit.g:4562:3: ( ruleQN )
            {
             before(grammarAccess.getChangeEnumAccess().getSchemaEnumTypeCrossReference_2_0()); 
            // InternalAedit.g:4563:3: ( ruleQN )
            // InternalAedit.g:4564:4: ruleQN
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
    // InternalAedit.g:4575:1: rule__ChangeEnum__RulesAssignment_4 : ( ruleEnumRule ) ;
    public final void rule__ChangeEnum__RulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4579:1: ( ( ruleEnumRule ) )
            // InternalAedit.g:4580:2: ( ruleEnumRule )
            {
            // InternalAedit.g:4580:2: ( ruleEnumRule )
            // InternalAedit.g:4581:3: ruleEnumRule
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
    // InternalAedit.g:4590:1: rule__AddRecord__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddRecord__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4594:1: ( ( RULE_INT ) )
            // InternalAedit.g:4595:2: ( RULE_INT )
            {
            // InternalAedit.g:4595:2: ( RULE_INT )
            // InternalAedit.g:4596:3: RULE_INT
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
    // InternalAedit.g:4605:1: rule__AddRecord__NamespaceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__AddRecord__NamespaceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4609:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:4610:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:4610:2: ( ( RULE_ID ) )
            // InternalAedit.g:4611:3: ( RULE_ID )
            {
             before(grammarAccess.getAddRecordAccess().getNamespaceAvroIDLFileCrossReference_5_0()); 
            // InternalAedit.g:4612:3: ( RULE_ID )
            // InternalAedit.g:4613:4: RULE_ID
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
    // InternalAedit.g:4624:1: rule__AddRecord__RecordNameAssignment_7 : ( RULE_ID ) ;
    public final void rule__AddRecord__RecordNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4628:1: ( ( RULE_ID ) )
            // InternalAedit.g:4629:2: ( RULE_ID )
            {
            // InternalAedit.g:4629:2: ( RULE_ID )
            // InternalAedit.g:4630:3: RULE_ID
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
    // InternalAedit.g:4639:1: rule__AddRecord__FieldsAssignment_9 : ( ruleField ) ;
    public final void rule__AddRecord__FieldsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4643:1: ( ( ruleField ) )
            // InternalAedit.g:4644:2: ( ruleField )
            {
            // InternalAedit.g:4644:2: ( ruleField )
            // InternalAedit.g:4645:3: ruleField
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
    // InternalAedit.g:4654:1: rule__AddEnumeration__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddEnumeration__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4658:1: ( ( RULE_INT ) )
            // InternalAedit.g:4659:2: ( RULE_INT )
            {
            // InternalAedit.g:4659:2: ( RULE_INT )
            // InternalAedit.g:4660:3: RULE_INT
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
    // InternalAedit.g:4669:1: rule__AddEnumeration__NamespaceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__AddEnumeration__NamespaceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4673:1: ( ( ( RULE_ID ) ) )
            // InternalAedit.g:4674:2: ( ( RULE_ID ) )
            {
            // InternalAedit.g:4674:2: ( ( RULE_ID ) )
            // InternalAedit.g:4675:3: ( RULE_ID )
            {
             before(grammarAccess.getAddEnumerationAccess().getNamespaceAvroIDLFileCrossReference_5_0()); 
            // InternalAedit.g:4676:3: ( RULE_ID )
            // InternalAedit.g:4677:4: RULE_ID
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
    // InternalAedit.g:4688:1: rule__AddEnumeration__EnumNameAssignment_7 : ( RULE_ID ) ;
    public final void rule__AddEnumeration__EnumNameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4692:1: ( ( RULE_ID ) )
            // InternalAedit.g:4693:2: ( RULE_ID )
            {
            // InternalAedit.g:4693:2: ( RULE_ID )
            // InternalAedit.g:4694:3: RULE_ID
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
    // InternalAedit.g:4703:1: rule__AddEnumeration__SymbolsAssignment_9 : ( RULE_ID ) ;
    public final void rule__AddEnumeration__SymbolsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4707:1: ( ( RULE_ID ) )
            // InternalAedit.g:4708:2: ( RULE_ID )
            {
            // InternalAedit.g:4708:2: ( RULE_ID )
            // InternalAedit.g:4709:3: RULE_ID
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


    // $ANTLR start "rule__AddVariable__IndexAssignment_2"
    // InternalAedit.g:4718:1: rule__AddVariable__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddVariable__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4722:1: ( ( RULE_INT ) )
            // InternalAedit.g:4723:2: ( RULE_INT )
            {
            // InternalAedit.g:4723:2: ( RULE_INT )
            // InternalAedit.g:4724:3: RULE_INT
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
    // InternalAedit.g:4733:1: rule__AddVariable__NewVarAssignment_4 : ( ruleField ) ;
    public final void rule__AddVariable__NewVarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4737:1: ( ( ruleField ) )
            // InternalAedit.g:4738:2: ( ruleField )
            {
            // InternalAedit.g:4738:2: ( ruleField )
            // InternalAedit.g:4739:3: ruleField
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
    // InternalAedit.g:4748:1: rule__AddEnum__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__AddEnum__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4752:1: ( ( RULE_INT ) )
            // InternalAedit.g:4753:2: ( RULE_INT )
            {
            // InternalAedit.g:4753:2: ( RULE_INT )
            // InternalAedit.g:4754:3: RULE_INT
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
    // InternalAedit.g:4763:1: rule__AddEnum__VarNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__AddEnum__VarNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4767:1: ( ( RULE_ID ) )
            // InternalAedit.g:4768:2: ( RULE_ID )
            {
            // InternalAedit.g:4768:2: ( RULE_ID )
            // InternalAedit.g:4769:3: RULE_ID
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
    // InternalAedit.g:4778:1: rule__RemoveSchema__SchemaTypeAssignment_1 : ( ruleSCHEMA_TYPE ) ;
    public final void rule__RemoveSchema__SchemaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4782:1: ( ( ruleSCHEMA_TYPE ) )
            // InternalAedit.g:4783:2: ( ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:4783:2: ( ruleSCHEMA_TYPE )
            // InternalAedit.g:4784:3: ruleSCHEMA_TYPE
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
    // InternalAedit.g:4793:1: rule__RemoveSchema__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__RemoveSchema__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4797:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:4798:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:4798:2: ( ( ruleQN ) )
            // InternalAedit.g:4799:3: ( ruleQN )
            {
             before(grammarAccess.getRemoveSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            // InternalAedit.g:4800:3: ( ruleQN )
            // InternalAedit.g:4801:4: ruleQN
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
    // InternalAedit.g:4812:1: rule__RemoveVariable__VariableAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__RemoveVariable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4816:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:4817:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:4817:2: ( ( ruleQN ) )
            // InternalAedit.g:4818:3: ( ruleQN )
            {
             before(grammarAccess.getRemoveVariableAccess().getVariableFieldCrossReference_1_0()); 
            // InternalAedit.g:4819:3: ( ruleQN )
            // InternalAedit.g:4820:4: ruleQN
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
    // InternalAedit.g:4831:1: rule__RemoveEnum__VarNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RemoveEnum__VarNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4835:1: ( ( RULE_ID ) )
            // InternalAedit.g:4836:2: ( RULE_ID )
            {
            // InternalAedit.g:4836:2: ( RULE_ID )
            // InternalAedit.g:4837:3: RULE_ID
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
    // InternalAedit.g:4846:1: rule__RenameSchema__SchemaTypeAssignment_1 : ( ruleSCHEMA_TYPE ) ;
    public final void rule__RenameSchema__SchemaTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4850:1: ( ( ruleSCHEMA_TYPE ) )
            // InternalAedit.g:4851:2: ( ruleSCHEMA_TYPE )
            {
            // InternalAedit.g:4851:2: ( ruleSCHEMA_TYPE )
            // InternalAedit.g:4852:3: ruleSCHEMA_TYPE
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
    // InternalAedit.g:4861:1: rule__RenameSchema__SchemaAssignment_2 : ( ( ruleQN ) ) ;
    public final void rule__RenameSchema__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4865:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:4866:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:4866:2: ( ( ruleQN ) )
            // InternalAedit.g:4867:3: ( ruleQN )
            {
             before(grammarAccess.getRenameSchemaAccess().getSchemaTypeCrossReference_2_0()); 
            // InternalAedit.g:4868:3: ( ruleQN )
            // InternalAedit.g:4869:4: ruleQN
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
    // InternalAedit.g:4880:1: rule__RenameSchema__NewSchNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__RenameSchema__NewSchNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4884:1: ( ( RULE_ID ) )
            // InternalAedit.g:4885:2: ( RULE_ID )
            {
            // InternalAedit.g:4885:2: ( RULE_ID )
            // InternalAedit.g:4886:3: RULE_ID
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
    // InternalAedit.g:4895:1: rule__RenameVariable__VariableAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__RenameVariable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4899:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:4900:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:4900:2: ( ( ruleQN ) )
            // InternalAedit.g:4901:3: ( ruleQN )
            {
             before(grammarAccess.getRenameVariableAccess().getVariableFieldCrossReference_1_0()); 
            // InternalAedit.g:4902:3: ( ruleQN )
            // InternalAedit.g:4903:4: ruleQN
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
    // InternalAedit.g:4914:1: rule__RenameVariable__NewVarNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__RenameVariable__NewVarNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4918:1: ( ( RULE_ID ) )
            // InternalAedit.g:4919:2: ( RULE_ID )
            {
            // InternalAedit.g:4919:2: ( RULE_ID )
            // InternalAedit.g:4920:3: RULE_ID
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
    // InternalAedit.g:4929:1: rule__RenameEnum__OldNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RenameEnum__OldNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4933:1: ( ( RULE_ID ) )
            // InternalAedit.g:4934:2: ( RULE_ID )
            {
            // InternalAedit.g:4934:2: ( RULE_ID )
            // InternalAedit.g:4935:3: RULE_ID
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
    // InternalAedit.g:4944:1: rule__RenameEnum__NewEnumNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__RenameEnum__NewEnumNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4948:1: ( ( RULE_ID ) )
            // InternalAedit.g:4949:2: ( RULE_ID )
            {
            // InternalAedit.g:4949:2: ( RULE_ID )
            // InternalAedit.g:4950:3: RULE_ID
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
    // InternalAedit.g:4959:1: rule__ChangeDefValue__FieldAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__ChangeDefValue__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4963:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:4964:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:4964:2: ( ( ruleQN ) )
            // InternalAedit.g:4965:3: ( ruleQN )
            {
             before(grammarAccess.getChangeDefValueAccess().getFieldFieldCrossReference_1_0()); 
            // InternalAedit.g:4966:3: ( ruleQN )
            // InternalAedit.g:4967:4: ruleQN
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
    // InternalAedit.g:4978:1: rule__ChangeDefValue__NewValAssignment_3 : ( ruleValue ) ;
    public final void rule__ChangeDefValue__NewValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4982:1: ( ( ruleValue ) )
            // InternalAedit.g:4983:2: ( ruleValue )
            {
            // InternalAedit.g:4983:2: ( ruleValue )
            // InternalAedit.g:4984:3: ruleValue
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
    // InternalAedit.g:4993:1: rule__ChangeType__FieldAssignment_1 : ( ( ruleQN ) ) ;
    public final void rule__ChangeType__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:4997:1: ( ( ( ruleQN ) ) )
            // InternalAedit.g:4998:2: ( ( ruleQN ) )
            {
            // InternalAedit.g:4998:2: ( ( ruleQN ) )
            // InternalAedit.g:4999:3: ( ruleQN )
            {
             before(grammarAccess.getChangeTypeAccess().getFieldFieldCrossReference_1_0()); 
            // InternalAedit.g:5000:3: ( ruleQN )
            // InternalAedit.g:5001:4: ruleQN
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
    // InternalAedit.g:5012:1: rule__ChangeType__NewTypeAssignment_3 : ( ruleVARIABLE_TYPE ) ;
    public final void rule__ChangeType__NewTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5016:1: ( ( ruleVARIABLE_TYPE ) )
            // InternalAedit.g:5017:2: ( ruleVARIABLE_TYPE )
            {
            // InternalAedit.g:5017:2: ( ruleVARIABLE_TYPE )
            // InternalAedit.g:5018:3: ruleVARIABLE_TYPE
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


    // $ANTLR start "rule__Field__TypeAssignment_0"
    // InternalAedit.g:5027:1: rule__Field__TypeAssignment_0 : ( ruleVARIABLE_TYPE ) ;
    public final void rule__Field__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5031:1: ( ( ruleVARIABLE_TYPE ) )
            // InternalAedit.g:5032:2: ( ruleVARIABLE_TYPE )
            {
            // InternalAedit.g:5032:2: ( ruleVARIABLE_TYPE )
            // InternalAedit.g:5033:3: ruleVARIABLE_TYPE
            {
             before(grammarAccess.getFieldAccess().getTypeVARIABLE_TYPEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVARIABLE_TYPE();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeVARIABLE_TYPEParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeAssignment_0"


    // $ANTLR start "rule__Field__VarNameAssignment_1"
    // InternalAedit.g:5042:1: rule__Field__VarNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__VarNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5046:1: ( ( RULE_ID ) )
            // InternalAedit.g:5047:2: ( RULE_ID )
            {
            // InternalAedit.g:5047:2: ( RULE_ID )
            // InternalAedit.g:5048:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getVarNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getVarNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__VarNameAssignment_1"


    // $ANTLR start "rule__Field__ValueAssignment_2_1"
    // InternalAedit.g:5057:1: rule__Field__ValueAssignment_2_1 : ( ruleValue ) ;
    public final void rule__Field__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5061:1: ( ( ruleValue ) )
            // InternalAedit.g:5062:2: ( ruleValue )
            {
            // InternalAedit.g:5062:2: ( ruleValue )
            // InternalAedit.g:5063:3: ruleValue
            {
             before(grammarAccess.getFieldAccess().getValueValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getValueValueParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__ValueAssignment_2_1"


    // $ANTLR start "rule__FloatValue__ValAssignment"
    // InternalAedit.g:5072:1: rule__FloatValue__ValAssignment : ( ruleReal ) ;
    public final void rule__FloatValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5076:1: ( ( ruleReal ) )
            // InternalAedit.g:5077:2: ( ruleReal )
            {
            // InternalAedit.g:5077:2: ( ruleReal )
            // InternalAedit.g:5078:3: ruleReal
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
    // InternalAedit.g:5087:1: rule__StringValue__ValAssignment : ( RULE_ID ) ;
    public final void rule__StringValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5091:1: ( ( RULE_ID ) )
            // InternalAedit.g:5092:2: ( RULE_ID )
            {
            // InternalAedit.g:5092:2: ( RULE_ID )
            // InternalAedit.g:5093:3: RULE_ID
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
    // InternalAedit.g:5102:1: rule__IntValue__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAedit.g:5106:1: ( ( RULE_INT ) )
            // InternalAedit.g:5107:2: ( RULE_INT )
            {
            // InternalAedit.g:5107:2: ( RULE_INT )
            // InternalAedit.g:5108:3: RULE_INT
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002880000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000318200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000318000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001B10200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001B10000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000310200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000310000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000027C000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000007C002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000002L});

}