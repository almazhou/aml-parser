package org.zhouxuan.example.myaml.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.zhouxuan.example.myaml.services.AmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAmlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Red'", "'Black'", "'White'", "'Grey'", "'Green'", "'puid'", "'{'", "'}'", "'extends'", "'='", "'.'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAmlParser.tokenNames; }
    public String getGrammarFileName() { return "../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g"; }


     
     	private AmlGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AmlGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleAml"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:60:1: entryRuleAml : ruleAml EOF ;
    public final void entryRuleAml() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:64:1: ( ruleAml EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:65:1: ruleAml EOF
            {
             before(grammarAccess.getAmlRule()); 
            pushFollow(FOLLOW_ruleAml_in_entryRuleAml66);
            ruleAml();

            state._fsp--;

             after(grammarAccess.getAmlRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAml73); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleAml"


    // $ANTLR start "ruleAml"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:75:1: ruleAml : ( ( rule__Aml__ElementsAssignment )* ) ;
    public final void ruleAml() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:80:2: ( ( ( rule__Aml__ElementsAssignment )* ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:81:1: ( ( rule__Aml__ElementsAssignment )* )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:81:1: ( ( rule__Aml__ElementsAssignment )* )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:82:1: ( rule__Aml__ElementsAssignment )*
            {
             before(grammarAccess.getAmlAccess().getElementsAssignment()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:83:1: ( rule__Aml__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:83:2: rule__Aml__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Aml__ElementsAssignment_in_ruleAml103);
            	    rule__Aml__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getAmlAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleAml"


    // $ANTLR start "entryRuleEntity"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:96:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:97:1: ( ruleEntity EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:98:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity131);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity138); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:105:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:109:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:110:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:110:1: ( ( rule__Entity__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:111:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:112:1: ( rule__Entity__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:112:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity164);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:124:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:125:1: ( ruleFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:126:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature191);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature198); 

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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:133:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:137:2: ( ( ( rule__Feature__Alternatives ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:138:1: ( ( rule__Feature__Alternatives ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:138:1: ( ( rule__Feature__Alternatives ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:139:1: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:140:1: ( rule__Feature__Alternatives )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:140:2: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_rule__Feature__Alternatives_in_ruleFeature224);
            rule__Feature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleLenghtFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:152:1: entryRuleLenghtFeature : ruleLenghtFeature EOF ;
    public final void entryRuleLenghtFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:153:1: ( ruleLenghtFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:154:1: ruleLenghtFeature EOF
            {
             before(grammarAccess.getLenghtFeatureRule()); 
            pushFollow(FOLLOW_ruleLenghtFeature_in_entryRuleLenghtFeature251);
            ruleLenghtFeature();

            state._fsp--;

             after(grammarAccess.getLenghtFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLenghtFeature258); 

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
    // $ANTLR end "entryRuleLenghtFeature"


    // $ANTLR start "ruleLenghtFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:161:1: ruleLenghtFeature : ( ( rule__LenghtFeature__Group__0 ) ) ;
    public final void ruleLenghtFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:165:2: ( ( ( rule__LenghtFeature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:166:1: ( ( rule__LenghtFeature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:166:1: ( ( rule__LenghtFeature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:167:1: ( rule__LenghtFeature__Group__0 )
            {
             before(grammarAccess.getLenghtFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:168:1: ( rule__LenghtFeature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:168:2: rule__LenghtFeature__Group__0
            {
            pushFollow(FOLLOW_rule__LenghtFeature__Group__0_in_ruleLenghtFeature284);
            rule__LenghtFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLenghtFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLenghtFeature"


    // $ANTLR start "entryRuleDOUBLE"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:180:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:181:1: ( ruleDOUBLE EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:182:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE311);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE318); 

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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:189:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:193:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:194:1: ( ( rule__DOUBLE__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:194:1: ( ( rule__DOUBLE__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:195:1: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:196:1: ( rule__DOUBLE__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:196:2: rule__DOUBLE__Group__0
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE344);
            rule__DOUBLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDOUBLEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleNetWorkFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:208:1: entryRuleNetWorkFeature : ruleNetWorkFeature EOF ;
    public final void entryRuleNetWorkFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:209:1: ( ruleNetWorkFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:210:1: ruleNetWorkFeature EOF
            {
             before(grammarAccess.getNetWorkFeatureRule()); 
            pushFollow(FOLLOW_ruleNetWorkFeature_in_entryRuleNetWorkFeature371);
            ruleNetWorkFeature();

            state._fsp--;

             after(grammarAccess.getNetWorkFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNetWorkFeature378); 

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
    // $ANTLR end "entryRuleNetWorkFeature"


    // $ANTLR start "ruleNetWorkFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:217:1: ruleNetWorkFeature : ( ( rule__NetWorkFeature__Group__0 ) ) ;
    public final void ruleNetWorkFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:221:2: ( ( ( rule__NetWorkFeature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:222:1: ( ( rule__NetWorkFeature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:222:1: ( ( rule__NetWorkFeature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:223:1: ( rule__NetWorkFeature__Group__0 )
            {
             before(grammarAccess.getNetWorkFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:224:1: ( rule__NetWorkFeature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:224:2: rule__NetWorkFeature__Group__0
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__0_in_ruleNetWorkFeature404);
            rule__NetWorkFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNetWorkFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNetWorkFeature"


    // $ANTLR start "entryRuleColorFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:236:1: entryRuleColorFeature : ruleColorFeature EOF ;
    public final void entryRuleColorFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:237:1: ( ruleColorFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:238:1: ruleColorFeature EOF
            {
             before(grammarAccess.getColorFeatureRule()); 
            pushFollow(FOLLOW_ruleColorFeature_in_entryRuleColorFeature431);
            ruleColorFeature();

            state._fsp--;

             after(grammarAccess.getColorFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorFeature438); 

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
    // $ANTLR end "entryRuleColorFeature"


    // $ANTLR start "ruleColorFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:245:1: ruleColorFeature : ( ( rule__ColorFeature__Group__0 ) ) ;
    public final void ruleColorFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:249:2: ( ( ( rule__ColorFeature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:250:1: ( ( rule__ColorFeature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:250:1: ( ( rule__ColorFeature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:251:1: ( rule__ColorFeature__Group__0 )
            {
             before(grammarAccess.getColorFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:252:1: ( rule__ColorFeature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:252:2: rule__ColorFeature__Group__0
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__0_in_ruleColorFeature464);
            rule__ColorFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColorFeature"


    // $ANTLR start "ruleColor"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:265:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:269:1: ( ( ( rule__Color__Alternatives ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:270:1: ( ( rule__Color__Alternatives ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:270:1: ( ( rule__Color__Alternatives ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:271:1: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:272:1: ( rule__Color__Alternatives )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:272:2: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_rule__Color__Alternatives_in_ruleColor501);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "rule__Feature__Alternatives"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:283:1: rule__Feature__Alternatives : ( ( ruleColorFeature ) | ( ruleNetWorkFeature ) | ( ruleLenghtFeature ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:287:1: ( ( ruleColorFeature ) | ( ruleNetWorkFeature ) | ( ruleLenghtFeature ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==20) ) {
                    switch ( input.LA(3) ) {
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        {
                        alt2=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt2=2;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt2=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:288:1: ( ruleColorFeature )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:288:1: ( ruleColorFeature )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:289:1: ruleColorFeature
                    {
                     before(grammarAccess.getFeatureAccess().getColorFeatureParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleColorFeature_in_rule__Feature__Alternatives536);
                    ruleColorFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getColorFeatureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:294:6: ( ruleNetWorkFeature )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:294:6: ( ruleNetWorkFeature )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:295:1: ruleNetWorkFeature
                    {
                     before(grammarAccess.getFeatureAccess().getNetWorkFeatureParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNetWorkFeature_in_rule__Feature__Alternatives553);
                    ruleNetWorkFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getNetWorkFeatureParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:300:6: ( ruleLenghtFeature )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:300:6: ( ruleLenghtFeature )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:301:1: ruleLenghtFeature
                    {
                     before(grammarAccess.getFeatureAccess().getLenghtFeatureParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleLenghtFeature_in_rule__Feature__Alternatives570);
                    ruleLenghtFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getLenghtFeatureParserRuleCall_2()); 

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
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:311:1: rule__Color__Alternatives : ( ( ( 'Red' ) ) | ( ( 'Black' ) ) | ( ( 'White' ) ) | ( ( 'Grey' ) ) | ( ( 'Green' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:315:1: ( ( ( 'Red' ) ) | ( ( 'Black' ) ) | ( ( 'White' ) ) | ( ( 'Grey' ) ) | ( ( 'Green' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
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
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:316:1: ( ( 'Red' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:316:1: ( ( 'Red' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:317:1: ( 'Red' )
                    {
                     before(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:318:1: ( 'Red' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:318:3: 'Red'
                    {
                    match(input,11,FOLLOW_11_in_rule__Color__Alternatives603); 

                    }

                     after(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:323:6: ( ( 'Black' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:323:6: ( ( 'Black' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:324:1: ( 'Black' )
                    {
                     before(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:325:1: ( 'Black' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:325:3: 'Black'
                    {
                    match(input,12,FOLLOW_12_in_rule__Color__Alternatives624); 

                    }

                     after(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:330:6: ( ( 'White' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:330:6: ( ( 'White' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:331:1: ( 'White' )
                    {
                     before(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:332:1: ( 'White' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:332:3: 'White'
                    {
                    match(input,13,FOLLOW_13_in_rule__Color__Alternatives645); 

                    }

                     after(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:337:6: ( ( 'Grey' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:337:6: ( ( 'Grey' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:338:1: ( 'Grey' )
                    {
                     before(grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:339:1: ( 'Grey' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:339:3: 'Grey'
                    {
                    match(input,14,FOLLOW_14_in_rule__Color__Alternatives666); 

                    }

                     after(grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:344:6: ( ( 'Green' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:344:6: ( ( 'Green' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:345:1: ( 'Green' )
                    {
                     before(grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_4()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:346:1: ( 'Green' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:346:3: 'Green'
                    {
                    match(input,15,FOLLOW_15_in_rule__Color__Alternatives687); 

                    }

                     after(grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:358:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:362:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:363:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0720);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0723);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:370:1: rule__Entity__Group__0__Impl : ( 'puid' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:374:1: ( ( 'puid' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:375:1: ( 'puid' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:375:1: ( 'puid' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:376:1: 'puid'
            {
             before(grammarAccess.getEntityAccess().getPuidKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group__0__Impl751); 
             after(grammarAccess.getEntityAccess().getPuidKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:389:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:393:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:394:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1782);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1785);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:401:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:405:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:406:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:406:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:407:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:408:1: ( rule__Entity__NameAssignment_1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:408:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl812);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:418:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:422:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:423:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2842);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2845);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:430:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:434:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:435:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:435:1: ( ( rule__Entity__Group_2__0 )? )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:436:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:437:1: ( rule__Entity__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:437:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl872);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:447:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:451:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:452:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__3903);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3906);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:459:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:463:1: ( ( '{' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:464:1: ( '{' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:464:1: ( '{' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:465:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__3__Impl934); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:478:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:482:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:483:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__4965);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__4968);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:490:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FeaturesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:494:1: ( ( ( rule__Entity__FeaturesAssignment_4 )* ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:495:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:495:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:496:1: ( rule__Entity__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:497:1: ( rule__Entity__FeaturesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:497:2: rule__Entity__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_4_in_rule__Entity__Group__4__Impl995);
            	    rule__Entity__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:507:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:511:1: ( rule__Entity__Group__5__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:512:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51026);
            rule__Entity__Group__5__Impl();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:518:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:522:1: ( ( '}' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:523:1: ( '}' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:523:1: ( '}' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:524:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Entity__Group__5__Impl1054); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:549:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:553:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:554:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__01097);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01100);
            rule__Entity__Group_2__1();

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
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:561:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:565:1: ( ( 'extends' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:566:1: ( 'extends' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:566:1: ( 'extends' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:567:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group_2__0__Impl1128); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:580:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:584:1: ( rule__Entity__Group_2__1__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:585:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11159);
            rule__Entity__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:591:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:595:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:596:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:596:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:597:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:598:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:598:2: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl1186);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__LenghtFeature__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:612:1: rule__LenghtFeature__Group__0 : rule__LenghtFeature__Group__0__Impl rule__LenghtFeature__Group__1 ;
    public final void rule__LenghtFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:616:1: ( rule__LenghtFeature__Group__0__Impl rule__LenghtFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:617:2: rule__LenghtFeature__Group__0__Impl rule__LenghtFeature__Group__1
            {
            pushFollow(FOLLOW_rule__LenghtFeature__Group__0__Impl_in_rule__LenghtFeature__Group__01220);
            rule__LenghtFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LenghtFeature__Group__1_in_rule__LenghtFeature__Group__01223);
            rule__LenghtFeature__Group__1();

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
    // $ANTLR end "rule__LenghtFeature__Group__0"


    // $ANTLR start "rule__LenghtFeature__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:624:1: rule__LenghtFeature__Group__0__Impl : ( ( rule__LenghtFeature__NameAssignment_0 ) ) ;
    public final void rule__LenghtFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:628:1: ( ( ( rule__LenghtFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:629:1: ( ( rule__LenghtFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:629:1: ( ( rule__LenghtFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:630:1: ( rule__LenghtFeature__NameAssignment_0 )
            {
             before(grammarAccess.getLenghtFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:631:1: ( rule__LenghtFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:631:2: rule__LenghtFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__LenghtFeature__NameAssignment_0_in_rule__LenghtFeature__Group__0__Impl1250);
            rule__LenghtFeature__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLenghtFeatureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LenghtFeature__Group__0__Impl"


    // $ANTLR start "rule__LenghtFeature__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:641:1: rule__LenghtFeature__Group__1 : rule__LenghtFeature__Group__1__Impl rule__LenghtFeature__Group__2 ;
    public final void rule__LenghtFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:645:1: ( rule__LenghtFeature__Group__1__Impl rule__LenghtFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:646:2: rule__LenghtFeature__Group__1__Impl rule__LenghtFeature__Group__2
            {
            pushFollow(FOLLOW_rule__LenghtFeature__Group__1__Impl_in_rule__LenghtFeature__Group__11280);
            rule__LenghtFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LenghtFeature__Group__2_in_rule__LenghtFeature__Group__11283);
            rule__LenghtFeature__Group__2();

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
    // $ANTLR end "rule__LenghtFeature__Group__1"


    // $ANTLR start "rule__LenghtFeature__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:653:1: rule__LenghtFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__LenghtFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:657:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:658:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:658:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:659:1: '='
            {
             before(grammarAccess.getLenghtFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__LenghtFeature__Group__1__Impl1311); 
             after(grammarAccess.getLenghtFeatureAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LenghtFeature__Group__1__Impl"


    // $ANTLR start "rule__LenghtFeature__Group__2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:672:1: rule__LenghtFeature__Group__2 : rule__LenghtFeature__Group__2__Impl ;
    public final void rule__LenghtFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:676:1: ( rule__LenghtFeature__Group__2__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:677:2: rule__LenghtFeature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LenghtFeature__Group__2__Impl_in_rule__LenghtFeature__Group__21342);
            rule__LenghtFeature__Group__2__Impl();

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
    // $ANTLR end "rule__LenghtFeature__Group__2"


    // $ANTLR start "rule__LenghtFeature__Group__2__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:683:1: rule__LenghtFeature__Group__2__Impl : ( ( rule__LenghtFeature__ValueAssignment_2 ) ) ;
    public final void rule__LenghtFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:687:1: ( ( ( rule__LenghtFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:688:1: ( ( rule__LenghtFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:688:1: ( ( rule__LenghtFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:689:1: ( rule__LenghtFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getLenghtFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:690:1: ( rule__LenghtFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:690:2: rule__LenghtFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__LenghtFeature__ValueAssignment_2_in_rule__LenghtFeature__Group__2__Impl1369);
            rule__LenghtFeature__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLenghtFeatureAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LenghtFeature__Group__2__Impl"


    // $ANTLR start "rule__DOUBLE__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:706:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:710:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:711:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__01405);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__01408);
            rule__DOUBLE__Group__1();

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
    // $ANTLR end "rule__DOUBLE__Group__0"


    // $ANTLR start "rule__DOUBLE__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:718:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:722:1: ( ( RULE_INT ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:723:1: ( RULE_INT )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:723:1: ( RULE_INT )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:724:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl1435); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:735:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:739:1: ( rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:740:2: rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__11464);
            rule__DOUBLE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group__2_in_rule__DOUBLE__Group__11467);
            rule__DOUBLE__Group__2();

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
    // $ANTLR end "rule__DOUBLE__Group__1"


    // $ANTLR start "rule__DOUBLE__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:747:1: rule__DOUBLE__Group__1__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:751:1: ( ( '.' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:752:1: ( '.' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:752:1: ( '.' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:753:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__DOUBLE__Group__1__Impl1495); 
             after(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__1__Impl"


    // $ANTLR start "rule__DOUBLE__Group__2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:766:1: rule__DOUBLE__Group__2 : rule__DOUBLE__Group__2__Impl ;
    public final void rule__DOUBLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:770:1: ( rule__DOUBLE__Group__2__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:771:2: rule__DOUBLE__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__2__Impl_in_rule__DOUBLE__Group__21526);
            rule__DOUBLE__Group__2__Impl();

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
    // $ANTLR end "rule__DOUBLE__Group__2"


    // $ANTLR start "rule__DOUBLE__Group__2__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:777:1: rule__DOUBLE__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:781:1: ( ( RULE_INT ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:782:1: ( RULE_INT )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:782:1: ( RULE_INT )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:783:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group__2__Impl1553); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__2__Impl"


    // $ANTLR start "rule__NetWorkFeature__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:800:1: rule__NetWorkFeature__Group__0 : rule__NetWorkFeature__Group__0__Impl rule__NetWorkFeature__Group__1 ;
    public final void rule__NetWorkFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:804:1: ( rule__NetWorkFeature__Group__0__Impl rule__NetWorkFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:805:2: rule__NetWorkFeature__Group__0__Impl rule__NetWorkFeature__Group__1
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__0__Impl_in_rule__NetWorkFeature__Group__01588);
            rule__NetWorkFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NetWorkFeature__Group__1_in_rule__NetWorkFeature__Group__01591);
            rule__NetWorkFeature__Group__1();

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
    // $ANTLR end "rule__NetWorkFeature__Group__0"


    // $ANTLR start "rule__NetWorkFeature__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:812:1: rule__NetWorkFeature__Group__0__Impl : ( ( rule__NetWorkFeature__NameAssignment_0 ) ) ;
    public final void rule__NetWorkFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:816:1: ( ( ( rule__NetWorkFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:817:1: ( ( rule__NetWorkFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:817:1: ( ( rule__NetWorkFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:818:1: ( rule__NetWorkFeature__NameAssignment_0 )
            {
             before(grammarAccess.getNetWorkFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:819:1: ( rule__NetWorkFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:819:2: rule__NetWorkFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__NameAssignment_0_in_rule__NetWorkFeature__Group__0__Impl1618);
            rule__NetWorkFeature__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNetWorkFeatureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetWorkFeature__Group__0__Impl"


    // $ANTLR start "rule__NetWorkFeature__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:829:1: rule__NetWorkFeature__Group__1 : rule__NetWorkFeature__Group__1__Impl rule__NetWorkFeature__Group__2 ;
    public final void rule__NetWorkFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:833:1: ( rule__NetWorkFeature__Group__1__Impl rule__NetWorkFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:834:2: rule__NetWorkFeature__Group__1__Impl rule__NetWorkFeature__Group__2
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__1__Impl_in_rule__NetWorkFeature__Group__11648);
            rule__NetWorkFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NetWorkFeature__Group__2_in_rule__NetWorkFeature__Group__11651);
            rule__NetWorkFeature__Group__2();

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
    // $ANTLR end "rule__NetWorkFeature__Group__1"


    // $ANTLR start "rule__NetWorkFeature__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:841:1: rule__NetWorkFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__NetWorkFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:845:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:846:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:846:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:847:1: '='
            {
             before(grammarAccess.getNetWorkFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__NetWorkFeature__Group__1__Impl1679); 
             after(grammarAccess.getNetWorkFeatureAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetWorkFeature__Group__1__Impl"


    // $ANTLR start "rule__NetWorkFeature__Group__2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:860:1: rule__NetWorkFeature__Group__2 : rule__NetWorkFeature__Group__2__Impl ;
    public final void rule__NetWorkFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:864:1: ( rule__NetWorkFeature__Group__2__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:865:2: rule__NetWorkFeature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__2__Impl_in_rule__NetWorkFeature__Group__21710);
            rule__NetWorkFeature__Group__2__Impl();

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
    // $ANTLR end "rule__NetWorkFeature__Group__2"


    // $ANTLR start "rule__NetWorkFeature__Group__2__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:871:1: rule__NetWorkFeature__Group__2__Impl : ( ( rule__NetWorkFeature__ValueAssignment_2 ) ) ;
    public final void rule__NetWorkFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:875:1: ( ( ( rule__NetWorkFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:876:1: ( ( rule__NetWorkFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:876:1: ( ( rule__NetWorkFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:877:1: ( rule__NetWorkFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getNetWorkFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:878:1: ( rule__NetWorkFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:878:2: rule__NetWorkFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__ValueAssignment_2_in_rule__NetWorkFeature__Group__2__Impl1737);
            rule__NetWorkFeature__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNetWorkFeatureAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetWorkFeature__Group__2__Impl"


    // $ANTLR start "rule__ColorFeature__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:894:1: rule__ColorFeature__Group__0 : rule__ColorFeature__Group__0__Impl rule__ColorFeature__Group__1 ;
    public final void rule__ColorFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:898:1: ( rule__ColorFeature__Group__0__Impl rule__ColorFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:899:2: rule__ColorFeature__Group__0__Impl rule__ColorFeature__Group__1
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__0__Impl_in_rule__ColorFeature__Group__01773);
            rule__ColorFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColorFeature__Group__1_in_rule__ColorFeature__Group__01776);
            rule__ColorFeature__Group__1();

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
    // $ANTLR end "rule__ColorFeature__Group__0"


    // $ANTLR start "rule__ColorFeature__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:906:1: rule__ColorFeature__Group__0__Impl : ( ( rule__ColorFeature__NameAssignment_0 ) ) ;
    public final void rule__ColorFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:910:1: ( ( ( rule__ColorFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:911:1: ( ( rule__ColorFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:911:1: ( ( rule__ColorFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:912:1: ( rule__ColorFeature__NameAssignment_0 )
            {
             before(grammarAccess.getColorFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:913:1: ( rule__ColorFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:913:2: rule__ColorFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ColorFeature__NameAssignment_0_in_rule__ColorFeature__Group__0__Impl1803);
            rule__ColorFeature__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColorFeatureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorFeature__Group__0__Impl"


    // $ANTLR start "rule__ColorFeature__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:923:1: rule__ColorFeature__Group__1 : rule__ColorFeature__Group__1__Impl rule__ColorFeature__Group__2 ;
    public final void rule__ColorFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:927:1: ( rule__ColorFeature__Group__1__Impl rule__ColorFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:928:2: rule__ColorFeature__Group__1__Impl rule__ColorFeature__Group__2
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__1__Impl_in_rule__ColorFeature__Group__11833);
            rule__ColorFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColorFeature__Group__2_in_rule__ColorFeature__Group__11836);
            rule__ColorFeature__Group__2();

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
    // $ANTLR end "rule__ColorFeature__Group__1"


    // $ANTLR start "rule__ColorFeature__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:935:1: rule__ColorFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__ColorFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:939:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:940:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:940:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:941:1: '='
            {
             before(grammarAccess.getColorFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__ColorFeature__Group__1__Impl1864); 
             after(grammarAccess.getColorFeatureAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorFeature__Group__1__Impl"


    // $ANTLR start "rule__ColorFeature__Group__2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:954:1: rule__ColorFeature__Group__2 : rule__ColorFeature__Group__2__Impl ;
    public final void rule__ColorFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:958:1: ( rule__ColorFeature__Group__2__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:959:2: rule__ColorFeature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__2__Impl_in_rule__ColorFeature__Group__21895);
            rule__ColorFeature__Group__2__Impl();

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
    // $ANTLR end "rule__ColorFeature__Group__2"


    // $ANTLR start "rule__ColorFeature__Group__2__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:965:1: rule__ColorFeature__Group__2__Impl : ( ( rule__ColorFeature__ValueAssignment_2 ) ) ;
    public final void rule__ColorFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:969:1: ( ( ( rule__ColorFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:970:1: ( ( rule__ColorFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:970:1: ( ( rule__ColorFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:971:1: ( rule__ColorFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getColorFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:972:1: ( rule__ColorFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:972:2: rule__ColorFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ColorFeature__ValueAssignment_2_in_rule__ColorFeature__Group__2__Impl1922);
            rule__ColorFeature__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColorFeatureAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorFeature__Group__2__Impl"


    // $ANTLR start "rule__Aml__ElementsAssignment"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:989:1: rule__Aml__ElementsAssignment : ( ruleEntity ) ;
    public final void rule__Aml__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:993:1: ( ( ruleEntity ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:994:1: ( ruleEntity )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:994:1: ( ruleEntity )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:995:1: ruleEntity
            {
             before(grammarAccess.getAmlAccess().getElementsEntityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Aml__ElementsAssignment1963);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getAmlAccess().getElementsEntityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aml__ElementsAssignment"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1004:1: rule__Entity__NameAssignment_1 : ( RULE_INT ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1008:1: ( ( RULE_INT ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1009:1: ( RULE_INT )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1009:1: ( RULE_INT )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1010:1: RULE_INT
            {
             before(grammarAccess.getEntityAccess().getNameINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Entity__NameAssignment_11994); 
             after(grammarAccess.getEntityAccess().getNameINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1019:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1023:1: ( ( ( RULE_ID ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1024:1: ( ( RULE_ID ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1024:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1025:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1026:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1027:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_12029); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_4"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1038:1: rule__Entity__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1042:1: ( ( ruleFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1043:1: ( ruleFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1043:1: ( ruleFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1044:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_42064);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_4"


    // $ANTLR start "rule__LenghtFeature__NameAssignment_0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1053:1: rule__LenghtFeature__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__LenghtFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1057:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1058:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1058:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1059:1: RULE_ID
            {
             before(grammarAccess.getLenghtFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LenghtFeature__NameAssignment_02095); 
             after(grammarAccess.getLenghtFeatureAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LenghtFeature__NameAssignment_0"


    // $ANTLR start "rule__LenghtFeature__ValueAssignment_2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1068:1: rule__LenghtFeature__ValueAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__LenghtFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1072:1: ( ( ruleDOUBLE ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1073:1: ( ruleDOUBLE )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1073:1: ( ruleDOUBLE )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1074:1: ruleDOUBLE
            {
             before(grammarAccess.getLenghtFeatureAccess().getValueDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__LenghtFeature__ValueAssignment_22126);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getLenghtFeatureAccess().getValueDOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LenghtFeature__ValueAssignment_2"


    // $ANTLR start "rule__NetWorkFeature__NameAssignment_0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1083:1: rule__NetWorkFeature__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NetWorkFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1087:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1088:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1088:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1089:1: RULE_ID
            {
             before(grammarAccess.getNetWorkFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NetWorkFeature__NameAssignment_02157); 
             after(grammarAccess.getNetWorkFeatureAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetWorkFeature__NameAssignment_0"


    // $ANTLR start "rule__NetWorkFeature__ValueAssignment_2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1098:1: rule__NetWorkFeature__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__NetWorkFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1102:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1103:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1103:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1104:1: RULE_ID
            {
             before(grammarAccess.getNetWorkFeatureAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NetWorkFeature__ValueAssignment_22188); 
             after(grammarAccess.getNetWorkFeatureAccess().getValueIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetWorkFeature__ValueAssignment_2"


    // $ANTLR start "rule__ColorFeature__NameAssignment_0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1113:1: rule__ColorFeature__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ColorFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1117:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1118:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1118:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1119:1: RULE_ID
            {
             before(grammarAccess.getColorFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ColorFeature__NameAssignment_02219); 
             after(grammarAccess.getColorFeatureAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorFeature__NameAssignment_0"


    // $ANTLR start "rule__ColorFeature__ValueAssignment_2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1128:1: rule__ColorFeature__ValueAssignment_2 : ( ruleColor ) ;
    public final void rule__ColorFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1132:1: ( ( ruleColor ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1133:1: ( ruleColor )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1133:1: ( ruleColor )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1134:1: ruleColor
            {
             before(grammarAccess.getColorFeatureAccess().getValueColorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__ColorFeature__ValueAssignment_22250);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorFeatureAccess().getValueColorEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorFeature__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAml_in_entryRuleAml66 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAml73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aml__ElementsAssignment_in_ruleAml103 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLenghtFeature_in_entryRuleLenghtFeature251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLenghtFeature258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LenghtFeature__Group__0_in_ruleLenghtFeature284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNetWorkFeature_in_entryRuleNetWorkFeature371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNetWorkFeature378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__0_in_ruleNetWorkFeature404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_entryRuleColorFeature431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorFeature438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__0_in_ruleColorFeature464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Alternatives_in_ruleColor501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_rule__Feature__Alternatives536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNetWorkFeature_in_rule__Feature__Alternatives553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLenghtFeature_in_rule__Feature__Alternatives570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Color__Alternatives603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Color__Alternatives624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Color__Alternatives645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Color__Alternatives666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Color__Alternatives687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group__0__Impl751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1782 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2842 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__3903 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__3__Impl934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__4965 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_4_in_rule__Entity__Group__4__Impl995 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Entity__Group__5__Impl1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__01097 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group_2__0__Impl1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LenghtFeature__Group__0__Impl_in_rule__LenghtFeature__Group__01220 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__LenghtFeature__Group__1_in_rule__LenghtFeature__Group__01223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LenghtFeature__NameAssignment_0_in_rule__LenghtFeature__Group__0__Impl1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LenghtFeature__Group__1__Impl_in_rule__LenghtFeature__Group__11280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LenghtFeature__Group__2_in_rule__LenghtFeature__Group__11283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__LenghtFeature__Group__1__Impl1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LenghtFeature__Group__2__Impl_in_rule__LenghtFeature__Group__21342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LenghtFeature__ValueAssignment_2_in_rule__LenghtFeature__Group__2__Impl1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__01405 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__01408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__11464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__2_in_rule__DOUBLE__Group__11467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DOUBLE__Group__1__Impl1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__2__Impl_in_rule__DOUBLE__Group__21526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group__2__Impl1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__0__Impl_in_rule__NetWorkFeature__Group__01588 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__1_in_rule__NetWorkFeature__Group__01591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__NameAssignment_0_in_rule__NetWorkFeature__Group__0__Impl1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__1__Impl_in_rule__NetWorkFeature__Group__11648 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__2_in_rule__NetWorkFeature__Group__11651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NetWorkFeature__Group__1__Impl1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__2__Impl_in_rule__NetWorkFeature__Group__21710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__ValueAssignment_2_in_rule__NetWorkFeature__Group__2__Impl1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__0__Impl_in_rule__ColorFeature__Group__01773 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__1_in_rule__ColorFeature__Group__01776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__NameAssignment_0_in_rule__ColorFeature__Group__0__Impl1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__1__Impl_in_rule__ColorFeature__Group__11833 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__2_in_rule__ColorFeature__Group__11836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ColorFeature__Group__1__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__2__Impl_in_rule__ColorFeature__Group__21895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__ValueAssignment_2_in_rule__ColorFeature__Group__2__Impl1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Aml__ElementsAssignment1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Entity__NameAssignment_11994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_12029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_42064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LenghtFeature__NameAssignment_02095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__LenghtFeature__ValueAssignment_22126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NetWorkFeature__NameAssignment_02157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NetWorkFeature__ValueAssignment_22188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ColorFeature__NameAssignment_02219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__ColorFeature__ValueAssignment_22250 = new BitSet(new long[]{0x0000000000000002L});

}