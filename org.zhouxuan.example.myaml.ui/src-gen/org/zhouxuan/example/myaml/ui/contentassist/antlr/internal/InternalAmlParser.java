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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Red'", "'Black'", "'White'", "'Grey'", "'Green'", "'puid'", "'{'", "'}'", "'extends'", "'='", "';'", "'.'", "'length'", "'network'", "'color'"
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
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:133:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:137:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:138:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:138:1: ( ( rule__Feature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:139:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:140:1: ( rule__Feature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:140:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature224);
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


    // $ANTLR start "entryRuleLengthFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:152:1: entryRuleLengthFeature : ruleLengthFeature EOF ;
    public final void entryRuleLengthFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:153:1: ( ruleLengthFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:154:1: ruleLengthFeature EOF
            {
             before(grammarAccess.getLengthFeatureRule()); 
            pushFollow(FOLLOW_ruleLengthFeature_in_entryRuleLengthFeature251);
            ruleLengthFeature();

            state._fsp--;

             after(grammarAccess.getLengthFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLengthFeature258); 

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
    // $ANTLR end "entryRuleLengthFeature"


    // $ANTLR start "ruleLengthFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:161:1: ruleLengthFeature : ( ( rule__LengthFeature__Group__0 ) ) ;
    public final void ruleLengthFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:165:2: ( ( ( rule__LengthFeature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:166:1: ( ( rule__LengthFeature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:166:1: ( ( rule__LengthFeature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:167:1: ( rule__LengthFeature__Group__0 )
            {
             before(grammarAccess.getLengthFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:168:1: ( rule__LengthFeature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:168:2: rule__LengthFeature__Group__0
            {
            pushFollow(FOLLOW_rule__LengthFeature__Group__0_in_ruleLengthFeature284);
            rule__LengthFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLengthFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLengthFeature"


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


    // $ANTLR start "rule__Color__Alternatives"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:283:1: rule__Color__Alternatives : ( ( ( 'Red' ) ) | ( ( 'Black' ) ) | ( ( 'White' ) ) | ( ( 'Grey' ) ) | ( ( 'Green' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:287:1: ( ( ( 'Red' ) ) | ( ( 'Black' ) ) | ( ( 'White' ) ) | ( ( 'Grey' ) ) | ( ( 'Green' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
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
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:288:1: ( ( 'Red' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:288:1: ( ( 'Red' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:289:1: ( 'Red' )
                    {
                     before(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:290:1: ( 'Red' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:290:3: 'Red'
                    {
                    match(input,11,FOLLOW_11_in_rule__Color__Alternatives537); 

                    }

                     after(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:295:6: ( ( 'Black' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:295:6: ( ( 'Black' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:296:1: ( 'Black' )
                    {
                     before(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:297:1: ( 'Black' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:297:3: 'Black'
                    {
                    match(input,12,FOLLOW_12_in_rule__Color__Alternatives558); 

                    }

                     after(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:302:6: ( ( 'White' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:302:6: ( ( 'White' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:303:1: ( 'White' )
                    {
                     before(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:304:1: ( 'White' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:304:3: 'White'
                    {
                    match(input,13,FOLLOW_13_in_rule__Color__Alternatives579); 

                    }

                     after(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:309:6: ( ( 'Grey' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:309:6: ( ( 'Grey' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:310:1: ( 'Grey' )
                    {
                     before(grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:311:1: ( 'Grey' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:311:3: 'Grey'
                    {
                    match(input,14,FOLLOW_14_in_rule__Color__Alternatives600); 

                    }

                     after(grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:316:6: ( ( 'Green' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:316:6: ( ( 'Green' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:317:1: ( 'Green' )
                    {
                     before(grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_4()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:318:1: ( 'Green' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:318:3: 'Green'
                    {
                    match(input,15,FOLLOW_15_in_rule__Color__Alternatives621); 

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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:330:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:334:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:335:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0654);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0657);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:342:1: rule__Entity__Group__0__Impl : ( 'puid' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:346:1: ( ( 'puid' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:347:1: ( 'puid' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:347:1: ( 'puid' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:348:1: 'puid'
            {
             before(grammarAccess.getEntityAccess().getPuidKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group__0__Impl685); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:361:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:365:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:366:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1716);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1719);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:373:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:377:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:378:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:378:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:379:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:380:1: ( rule__Entity__NameAssignment_1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:380:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl746);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:390:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:394:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:395:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2776);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2779);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:402:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:406:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:407:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:407:1: ( ( rule__Entity__Group_2__0 )? )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:408:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:409:1: ( rule__Entity__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:409:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl806);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:419:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:423:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:424:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__3837);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3840);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:431:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:435:1: ( ( '{' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:436:1: ( '{' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:436:1: ( '{' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:437:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__3__Impl868); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:450:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:454:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:455:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__4899);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__4902);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:462:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__ColorFeatureAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:466:1: ( ( ( rule__Entity__ColorFeatureAssignment_4 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:467:1: ( ( rule__Entity__ColorFeatureAssignment_4 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:467:1: ( ( rule__Entity__ColorFeatureAssignment_4 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:468:1: ( rule__Entity__ColorFeatureAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getColorFeatureAssignment_4()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:469:1: ( rule__Entity__ColorFeatureAssignment_4 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:469:2: rule__Entity__ColorFeatureAssignment_4
            {
            pushFollow(FOLLOW_rule__Entity__ColorFeatureAssignment_4_in_rule__Entity__Group__4__Impl929);
            rule__Entity__ColorFeatureAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getColorFeatureAssignment_4()); 

            }


            }

        }
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:479:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:483:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:484:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__5959);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__5962);
            rule__Entity__Group__6();

            state._fsp--;


            }

        }
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:491:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__NetworkFeatureAssignment_5 ) ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:495:1: ( ( ( rule__Entity__NetworkFeatureAssignment_5 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:496:1: ( ( rule__Entity__NetworkFeatureAssignment_5 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:496:1: ( ( rule__Entity__NetworkFeatureAssignment_5 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:497:1: ( rule__Entity__NetworkFeatureAssignment_5 )
            {
             before(grammarAccess.getEntityAccess().getNetworkFeatureAssignment_5()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:498:1: ( rule__Entity__NetworkFeatureAssignment_5 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:498:2: rule__Entity__NetworkFeatureAssignment_5
            {
            pushFollow(FOLLOW_rule__Entity__NetworkFeatureAssignment_5_in_rule__Entity__Group__5__Impl989);
            rule__Entity__NetworkFeatureAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNetworkFeatureAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Entity__Group__6"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:508:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:512:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:513:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61019);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61022);
            rule__Entity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:520:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__LengthFeatureAssignment_6 ) ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:524:1: ( ( ( rule__Entity__LengthFeatureAssignment_6 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:525:1: ( ( rule__Entity__LengthFeatureAssignment_6 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:525:1: ( ( rule__Entity__LengthFeatureAssignment_6 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:526:1: ( rule__Entity__LengthFeatureAssignment_6 )
            {
             before(grammarAccess.getEntityAccess().getLengthFeatureAssignment_6()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:527:1: ( rule__Entity__LengthFeatureAssignment_6 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:527:2: rule__Entity__LengthFeatureAssignment_6
            {
            pushFollow(FOLLOW_rule__Entity__LengthFeatureAssignment_6_in_rule__Entity__Group__6__Impl1049);
            rule__Entity__LengthFeatureAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getLengthFeatureAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:537:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:541:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:542:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71079);
            rule__Entity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__71082);
            rule__Entity__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:549:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__FeaturesAssignment_7 )* ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:553:1: ( ( ( rule__Entity__FeaturesAssignment_7 )* ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:554:1: ( ( rule__Entity__FeaturesAssignment_7 )* )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:554:1: ( ( rule__Entity__FeaturesAssignment_7 )* )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:555:1: ( rule__Entity__FeaturesAssignment_7 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_7()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:556:1: ( rule__Entity__FeaturesAssignment_7 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:556:2: rule__Entity__FeaturesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_7_in_rule__Entity__Group__7__Impl1109);
            	    rule__Entity__FeaturesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group__8"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:566:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:570:1: ( rule__Entity__Group__8__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:571:2: rule__Entity__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__81140);
            rule__Entity__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8"


    // $ANTLR start "rule__Entity__Group__8__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:577:1: rule__Entity__Group__8__Impl : ( '}' ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:581:1: ( ( '}' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:582:1: ( '}' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:582:1: ( '}' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:583:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_18_in_rule__Entity__Group__8__Impl1168); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__8__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:614:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:618:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:619:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__01217);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01220);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:626:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:630:1: ( ( 'extends' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:631:1: ( 'extends' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:631:1: ( 'extends' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:632:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group_2__0__Impl1248); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:645:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:649:1: ( rule__Entity__Group_2__1__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:650:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11279);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:656:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:660:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:661:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:661:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:662:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:663:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:663:2: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl1306);
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


    // $ANTLR start "rule__Feature__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:677:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:681:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:682:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01340);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01343);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:689:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__NameAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:693:1: ( ( ( rule__Feature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:694:1: ( ( rule__Feature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:694:1: ( ( rule__Feature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:695:1: ( rule__Feature__NameAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:696:1: ( rule__Feature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:696:2: rule__Feature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_0_in_rule__Feature__Group__0__Impl1370);
            rule__Feature__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:706:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:710:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:711:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11400);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11403);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:718:1: rule__Feature__Group__1__Impl : ( '=' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:722:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:723:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:723:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:724:1: '='
            {
             before(grammarAccess.getFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Feature__Group__1__Impl1431); 
             after(grammarAccess.getFeatureAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:737:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:741:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:742:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21462);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21465);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:749:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__ValueAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:753:1: ( ( ( rule__Feature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:754:1: ( ( rule__Feature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:754:1: ( ( rule__Feature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:755:1: ( rule__Feature__ValueAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:756:1: ( rule__Feature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:756:2: rule__Feature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Feature__ValueAssignment_2_in_rule__Feature__Group__2__Impl1492);
            rule__Feature__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getValueAssignment_2()); 

            }


            }

        }
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:766:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:770:1: ( rule__Feature__Group__3__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:771:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31522);
            rule__Feature__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:777:1: rule__Feature__Group__3__Impl : ( ';' ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:781:1: ( ( ';' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:782:1: ( ';' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:782:1: ( ';' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:783:1: ';'
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Feature__Group__3__Impl1550); 
             after(grammarAccess.getFeatureAccess().getSemicolonKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__LengthFeature__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:804:1: rule__LengthFeature__Group__0 : rule__LengthFeature__Group__0__Impl rule__LengthFeature__Group__1 ;
    public final void rule__LengthFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:808:1: ( rule__LengthFeature__Group__0__Impl rule__LengthFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:809:2: rule__LengthFeature__Group__0__Impl rule__LengthFeature__Group__1
            {
            pushFollow(FOLLOW_rule__LengthFeature__Group__0__Impl_in_rule__LengthFeature__Group__01589);
            rule__LengthFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LengthFeature__Group__1_in_rule__LengthFeature__Group__01592);
            rule__LengthFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthFeature__Group__0"


    // $ANTLR start "rule__LengthFeature__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:816:1: rule__LengthFeature__Group__0__Impl : ( ( rule__LengthFeature__NameAssignment_0 ) ) ;
    public final void rule__LengthFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:820:1: ( ( ( rule__LengthFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:821:1: ( ( rule__LengthFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:821:1: ( ( rule__LengthFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:822:1: ( rule__LengthFeature__NameAssignment_0 )
            {
             before(grammarAccess.getLengthFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:823:1: ( rule__LengthFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:823:2: rule__LengthFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__LengthFeature__NameAssignment_0_in_rule__LengthFeature__Group__0__Impl1619);
            rule__LengthFeature__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLengthFeatureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthFeature__Group__0__Impl"


    // $ANTLR start "rule__LengthFeature__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:833:1: rule__LengthFeature__Group__1 : rule__LengthFeature__Group__1__Impl rule__LengthFeature__Group__2 ;
    public final void rule__LengthFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:837:1: ( rule__LengthFeature__Group__1__Impl rule__LengthFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:838:2: rule__LengthFeature__Group__1__Impl rule__LengthFeature__Group__2
            {
            pushFollow(FOLLOW_rule__LengthFeature__Group__1__Impl_in_rule__LengthFeature__Group__11649);
            rule__LengthFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LengthFeature__Group__2_in_rule__LengthFeature__Group__11652);
            rule__LengthFeature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthFeature__Group__1"


    // $ANTLR start "rule__LengthFeature__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:845:1: rule__LengthFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__LengthFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:849:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:850:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:850:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:851:1: '='
            {
             before(grammarAccess.getLengthFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__LengthFeature__Group__1__Impl1680); 
             after(grammarAccess.getLengthFeatureAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthFeature__Group__1__Impl"


    // $ANTLR start "rule__LengthFeature__Group__2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:864:1: rule__LengthFeature__Group__2 : rule__LengthFeature__Group__2__Impl rule__LengthFeature__Group__3 ;
    public final void rule__LengthFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:868:1: ( rule__LengthFeature__Group__2__Impl rule__LengthFeature__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:869:2: rule__LengthFeature__Group__2__Impl rule__LengthFeature__Group__3
            {
            pushFollow(FOLLOW_rule__LengthFeature__Group__2__Impl_in_rule__LengthFeature__Group__21711);
            rule__LengthFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LengthFeature__Group__3_in_rule__LengthFeature__Group__21714);
            rule__LengthFeature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthFeature__Group__2"


    // $ANTLR start "rule__LengthFeature__Group__2__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:876:1: rule__LengthFeature__Group__2__Impl : ( ( rule__LengthFeature__ValueAssignment_2 ) ) ;
    public final void rule__LengthFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:880:1: ( ( ( rule__LengthFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:881:1: ( ( rule__LengthFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:881:1: ( ( rule__LengthFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:882:1: ( rule__LengthFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getLengthFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:883:1: ( rule__LengthFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:883:2: rule__LengthFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__LengthFeature__ValueAssignment_2_in_rule__LengthFeature__Group__2__Impl1741);
            rule__LengthFeature__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLengthFeatureAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthFeature__Group__2__Impl"


    // $ANTLR start "rule__LengthFeature__Group__3"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:893:1: rule__LengthFeature__Group__3 : rule__LengthFeature__Group__3__Impl ;
    public final void rule__LengthFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:897:1: ( rule__LengthFeature__Group__3__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:898:2: rule__LengthFeature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LengthFeature__Group__3__Impl_in_rule__LengthFeature__Group__31771);
            rule__LengthFeature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthFeature__Group__3"


    // $ANTLR start "rule__LengthFeature__Group__3__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:904:1: rule__LengthFeature__Group__3__Impl : ( ';' ) ;
    public final void rule__LengthFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:908:1: ( ( ';' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:909:1: ( ';' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:909:1: ( ';' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:910:1: ';'
            {
             before(grammarAccess.getLengthFeatureAccess().getSemicolonKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__LengthFeature__Group__3__Impl1799); 
             after(grammarAccess.getLengthFeatureAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthFeature__Group__3__Impl"


    // $ANTLR start "rule__DOUBLE__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:931:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:935:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:936:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__01838);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__01841);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:943:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:947:1: ( ( RULE_INT ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:948:1: ( RULE_INT )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:948:1: ( RULE_INT )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:949:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl1868); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:960:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:964:1: ( rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:965:2: rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__11897);
            rule__DOUBLE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group__2_in_rule__DOUBLE__Group__11900);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:972:1: rule__DOUBLE__Group__1__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:976:1: ( ( '.' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:977:1: ( '.' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:977:1: ( '.' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:978:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__DOUBLE__Group__1__Impl1928); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:991:1: rule__DOUBLE__Group__2 : rule__DOUBLE__Group__2__Impl ;
    public final void rule__DOUBLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:995:1: ( rule__DOUBLE__Group__2__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:996:2: rule__DOUBLE__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__2__Impl_in_rule__DOUBLE__Group__21959);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1002:1: rule__DOUBLE__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1006:1: ( ( RULE_INT ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1007:1: ( RULE_INT )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1007:1: ( RULE_INT )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1008:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group__2__Impl1986); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1025:1: rule__NetWorkFeature__Group__0 : rule__NetWorkFeature__Group__0__Impl rule__NetWorkFeature__Group__1 ;
    public final void rule__NetWorkFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1029:1: ( rule__NetWorkFeature__Group__0__Impl rule__NetWorkFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1030:2: rule__NetWorkFeature__Group__0__Impl rule__NetWorkFeature__Group__1
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__0__Impl_in_rule__NetWorkFeature__Group__02021);
            rule__NetWorkFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NetWorkFeature__Group__1_in_rule__NetWorkFeature__Group__02024);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1037:1: rule__NetWorkFeature__Group__0__Impl : ( ( rule__NetWorkFeature__NameAssignment_0 ) ) ;
    public final void rule__NetWorkFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1041:1: ( ( ( rule__NetWorkFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1042:1: ( ( rule__NetWorkFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1042:1: ( ( rule__NetWorkFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1043:1: ( rule__NetWorkFeature__NameAssignment_0 )
            {
             before(grammarAccess.getNetWorkFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1044:1: ( rule__NetWorkFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1044:2: rule__NetWorkFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__NameAssignment_0_in_rule__NetWorkFeature__Group__0__Impl2051);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1054:1: rule__NetWorkFeature__Group__1 : rule__NetWorkFeature__Group__1__Impl rule__NetWorkFeature__Group__2 ;
    public final void rule__NetWorkFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1058:1: ( rule__NetWorkFeature__Group__1__Impl rule__NetWorkFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1059:2: rule__NetWorkFeature__Group__1__Impl rule__NetWorkFeature__Group__2
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__1__Impl_in_rule__NetWorkFeature__Group__12081);
            rule__NetWorkFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NetWorkFeature__Group__2_in_rule__NetWorkFeature__Group__12084);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1066:1: rule__NetWorkFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__NetWorkFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1070:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1071:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1071:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1072:1: '='
            {
             before(grammarAccess.getNetWorkFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__NetWorkFeature__Group__1__Impl2112); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1085:1: rule__NetWorkFeature__Group__2 : rule__NetWorkFeature__Group__2__Impl rule__NetWorkFeature__Group__3 ;
    public final void rule__NetWorkFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1089:1: ( rule__NetWorkFeature__Group__2__Impl rule__NetWorkFeature__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1090:2: rule__NetWorkFeature__Group__2__Impl rule__NetWorkFeature__Group__3
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__2__Impl_in_rule__NetWorkFeature__Group__22143);
            rule__NetWorkFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NetWorkFeature__Group__3_in_rule__NetWorkFeature__Group__22146);
            rule__NetWorkFeature__Group__3();

            state._fsp--;


            }

        }
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1097:1: rule__NetWorkFeature__Group__2__Impl : ( ( rule__NetWorkFeature__ValueAssignment_2 ) ) ;
    public final void rule__NetWorkFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1101:1: ( ( ( rule__NetWorkFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1102:1: ( ( rule__NetWorkFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1102:1: ( ( rule__NetWorkFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1103:1: ( rule__NetWorkFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getNetWorkFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1104:1: ( rule__NetWorkFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1104:2: rule__NetWorkFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__ValueAssignment_2_in_rule__NetWorkFeature__Group__2__Impl2173);
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


    // $ANTLR start "rule__NetWorkFeature__Group__3"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1114:1: rule__NetWorkFeature__Group__3 : rule__NetWorkFeature__Group__3__Impl ;
    public final void rule__NetWorkFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1118:1: ( rule__NetWorkFeature__Group__3__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1119:2: rule__NetWorkFeature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__3__Impl_in_rule__NetWorkFeature__Group__32203);
            rule__NetWorkFeature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetWorkFeature__Group__3"


    // $ANTLR start "rule__NetWorkFeature__Group__3__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1125:1: rule__NetWorkFeature__Group__3__Impl : ( ';' ) ;
    public final void rule__NetWorkFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1129:1: ( ( ';' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1130:1: ( ';' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1130:1: ( ';' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1131:1: ';'
            {
             before(grammarAccess.getNetWorkFeatureAccess().getSemicolonKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__NetWorkFeature__Group__3__Impl2231); 
             after(grammarAccess.getNetWorkFeatureAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetWorkFeature__Group__3__Impl"


    // $ANTLR start "rule__ColorFeature__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1152:1: rule__ColorFeature__Group__0 : rule__ColorFeature__Group__0__Impl rule__ColorFeature__Group__1 ;
    public final void rule__ColorFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1156:1: ( rule__ColorFeature__Group__0__Impl rule__ColorFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1157:2: rule__ColorFeature__Group__0__Impl rule__ColorFeature__Group__1
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__0__Impl_in_rule__ColorFeature__Group__02270);
            rule__ColorFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColorFeature__Group__1_in_rule__ColorFeature__Group__02273);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1164:1: rule__ColorFeature__Group__0__Impl : ( ( rule__ColorFeature__NameAssignment_0 ) ) ;
    public final void rule__ColorFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1168:1: ( ( ( rule__ColorFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1169:1: ( ( rule__ColorFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1169:1: ( ( rule__ColorFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1170:1: ( rule__ColorFeature__NameAssignment_0 )
            {
             before(grammarAccess.getColorFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1171:1: ( rule__ColorFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1171:2: rule__ColorFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ColorFeature__NameAssignment_0_in_rule__ColorFeature__Group__0__Impl2300);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1181:1: rule__ColorFeature__Group__1 : rule__ColorFeature__Group__1__Impl rule__ColorFeature__Group__2 ;
    public final void rule__ColorFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1185:1: ( rule__ColorFeature__Group__1__Impl rule__ColorFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1186:2: rule__ColorFeature__Group__1__Impl rule__ColorFeature__Group__2
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__1__Impl_in_rule__ColorFeature__Group__12330);
            rule__ColorFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColorFeature__Group__2_in_rule__ColorFeature__Group__12333);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1193:1: rule__ColorFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__ColorFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1197:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1198:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1198:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1199:1: '='
            {
             before(grammarAccess.getColorFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__ColorFeature__Group__1__Impl2361); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1212:1: rule__ColorFeature__Group__2 : rule__ColorFeature__Group__2__Impl rule__ColorFeature__Group__3 ;
    public final void rule__ColorFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1216:1: ( rule__ColorFeature__Group__2__Impl rule__ColorFeature__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1217:2: rule__ColorFeature__Group__2__Impl rule__ColorFeature__Group__3
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__2__Impl_in_rule__ColorFeature__Group__22392);
            rule__ColorFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColorFeature__Group__3_in_rule__ColorFeature__Group__22395);
            rule__ColorFeature__Group__3();

            state._fsp--;


            }

        }
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1224:1: rule__ColorFeature__Group__2__Impl : ( ( rule__ColorFeature__ValueAssignment_2 ) ) ;
    public final void rule__ColorFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1228:1: ( ( ( rule__ColorFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1229:1: ( ( rule__ColorFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1229:1: ( ( rule__ColorFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1230:1: ( rule__ColorFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getColorFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1231:1: ( rule__ColorFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1231:2: rule__ColorFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ColorFeature__ValueAssignment_2_in_rule__ColorFeature__Group__2__Impl2422);
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


    // $ANTLR start "rule__ColorFeature__Group__3"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1241:1: rule__ColorFeature__Group__3 : rule__ColorFeature__Group__3__Impl ;
    public final void rule__ColorFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1245:1: ( rule__ColorFeature__Group__3__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1246:2: rule__ColorFeature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__3__Impl_in_rule__ColorFeature__Group__32452);
            rule__ColorFeature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorFeature__Group__3"


    // $ANTLR start "rule__ColorFeature__Group__3__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1252:1: rule__ColorFeature__Group__3__Impl : ( ';' ) ;
    public final void rule__ColorFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1256:1: ( ( ';' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1257:1: ( ';' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1257:1: ( ';' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1258:1: ';'
            {
             before(grammarAccess.getColorFeatureAccess().getSemicolonKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__ColorFeature__Group__3__Impl2480); 
             after(grammarAccess.getColorFeatureAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorFeature__Group__3__Impl"


    // $ANTLR start "rule__Aml__ElementsAssignment"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1280:1: rule__Aml__ElementsAssignment : ( ruleEntity ) ;
    public final void rule__Aml__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1284:1: ( ( ruleEntity ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1285:1: ( ruleEntity )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1285:1: ( ruleEntity )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1286:1: ruleEntity
            {
             before(grammarAccess.getAmlAccess().getElementsEntityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Aml__ElementsAssignment2524);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1295:1: rule__Entity__NameAssignment_1 : ( RULE_INT ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1299:1: ( ( RULE_INT ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1300:1: ( RULE_INT )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1300:1: ( RULE_INT )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1301:1: RULE_INT
            {
             before(grammarAccess.getEntityAccess().getNameINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Entity__NameAssignment_12555); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1310:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1314:1: ( ( ( RULE_ID ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1315:1: ( ( RULE_ID ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1315:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1316:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1317:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1318:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_12590); 
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


    // $ANTLR start "rule__Entity__ColorFeatureAssignment_4"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1329:1: rule__Entity__ColorFeatureAssignment_4 : ( ruleColorFeature ) ;
    public final void rule__Entity__ColorFeatureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1333:1: ( ( ruleColorFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1334:1: ( ruleColorFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1334:1: ( ruleColorFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1335:1: ruleColorFeature
            {
             before(grammarAccess.getEntityAccess().getColorFeatureColorFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleColorFeature_in_rule__Entity__ColorFeatureAssignment_42625);
            ruleColorFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getColorFeatureColorFeatureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ColorFeatureAssignment_4"


    // $ANTLR start "rule__Entity__NetworkFeatureAssignment_5"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1344:1: rule__Entity__NetworkFeatureAssignment_5 : ( ruleNetWorkFeature ) ;
    public final void rule__Entity__NetworkFeatureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1348:1: ( ( ruleNetWorkFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1349:1: ( ruleNetWorkFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1349:1: ( ruleNetWorkFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1350:1: ruleNetWorkFeature
            {
             before(grammarAccess.getEntityAccess().getNetworkFeatureNetWorkFeatureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleNetWorkFeature_in_rule__Entity__NetworkFeatureAssignment_52656);
            ruleNetWorkFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getNetworkFeatureNetWorkFeatureParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NetworkFeatureAssignment_5"


    // $ANTLR start "rule__Entity__LengthFeatureAssignment_6"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1359:1: rule__Entity__LengthFeatureAssignment_6 : ( ruleLengthFeature ) ;
    public final void rule__Entity__LengthFeatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1363:1: ( ( ruleLengthFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1364:1: ( ruleLengthFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1364:1: ( ruleLengthFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1365:1: ruleLengthFeature
            {
             before(grammarAccess.getEntityAccess().getLengthFeatureLengthFeatureParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleLengthFeature_in_rule__Entity__LengthFeatureAssignment_62687);
            ruleLengthFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getLengthFeatureLengthFeatureParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__LengthFeatureAssignment_6"


    // $ANTLR start "rule__Entity__FeaturesAssignment_7"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1374:1: rule__Entity__FeaturesAssignment_7 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1378:1: ( ( ruleFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1379:1: ( ruleFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1379:1: ( ruleFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1380:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_72718);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_7"


    // $ANTLR start "rule__Feature__NameAssignment_0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1389:1: rule__Feature__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1393:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1394:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1394:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1395:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_02749); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_0"


    // $ANTLR start "rule__Feature__ValueAssignment_2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1404:1: rule__Feature__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__Feature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1408:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1409:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1409:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1410:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__ValueAssignment_22780); 
             after(grammarAccess.getFeatureAccess().getValueIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ValueAssignment_2"


    // $ANTLR start "rule__LengthFeature__NameAssignment_0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1419:1: rule__LengthFeature__NameAssignment_0 : ( ( 'length' ) ) ;
    public final void rule__LengthFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1423:1: ( ( ( 'length' ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1424:1: ( ( 'length' ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1424:1: ( ( 'length' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1425:1: ( 'length' )
            {
             before(grammarAccess.getLengthFeatureAccess().getNameLengthKeyword_0_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1426:1: ( 'length' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1427:1: 'length'
            {
             before(grammarAccess.getLengthFeatureAccess().getNameLengthKeyword_0_0()); 
            match(input,23,FOLLOW_23_in_rule__LengthFeature__NameAssignment_02816); 
             after(grammarAccess.getLengthFeatureAccess().getNameLengthKeyword_0_0()); 

            }

             after(grammarAccess.getLengthFeatureAccess().getNameLengthKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthFeature__NameAssignment_0"


    // $ANTLR start "rule__LengthFeature__ValueAssignment_2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1442:1: rule__LengthFeature__ValueAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__LengthFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1446:1: ( ( ruleDOUBLE ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1447:1: ( ruleDOUBLE )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1447:1: ( ruleDOUBLE )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1448:1: ruleDOUBLE
            {
             before(grammarAccess.getLengthFeatureAccess().getValueDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__LengthFeature__ValueAssignment_22855);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getLengthFeatureAccess().getValueDOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthFeature__ValueAssignment_2"


    // $ANTLR start "rule__NetWorkFeature__NameAssignment_0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1457:1: rule__NetWorkFeature__NameAssignment_0 : ( ( 'network' ) ) ;
    public final void rule__NetWorkFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1461:1: ( ( ( 'network' ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1462:1: ( ( 'network' ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1462:1: ( ( 'network' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1463:1: ( 'network' )
            {
             before(grammarAccess.getNetWorkFeatureAccess().getNameNetworkKeyword_0_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1464:1: ( 'network' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1465:1: 'network'
            {
             before(grammarAccess.getNetWorkFeatureAccess().getNameNetworkKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__NetWorkFeature__NameAssignment_02891); 
             after(grammarAccess.getNetWorkFeatureAccess().getNameNetworkKeyword_0_0()); 

            }

             after(grammarAccess.getNetWorkFeatureAccess().getNameNetworkKeyword_0_0()); 

            }


            }

        }
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1480:1: rule__NetWorkFeature__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__NetWorkFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1484:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1485:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1485:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1486:1: RULE_ID
            {
             before(grammarAccess.getNetWorkFeatureAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NetWorkFeature__ValueAssignment_22930); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1495:1: rule__ColorFeature__NameAssignment_0 : ( ( 'color' ) ) ;
    public final void rule__ColorFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1499:1: ( ( ( 'color' ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1500:1: ( ( 'color' ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1500:1: ( ( 'color' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1501:1: ( 'color' )
            {
             before(grammarAccess.getColorFeatureAccess().getNameColorKeyword_0_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1502:1: ( 'color' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1503:1: 'color'
            {
             before(grammarAccess.getColorFeatureAccess().getNameColorKeyword_0_0()); 
            match(input,25,FOLLOW_25_in_rule__ColorFeature__NameAssignment_02966); 
             after(grammarAccess.getColorFeatureAccess().getNameColorKeyword_0_0()); 

            }

             after(grammarAccess.getColorFeatureAccess().getNameColorKeyword_0_0()); 

            }


            }

        }
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1518:1: rule__ColorFeature__ValueAssignment_2 : ( ruleColor ) ;
    public final void rule__ColorFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1522:1: ( ( ruleColor ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1523:1: ( ruleColor )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1523:1: ( ruleColor )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1524:1: ruleColor
            {
             before(grammarAccess.getColorFeatureAccess().getValueColorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__ColorFeature__ValueAssignment_23005);
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
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLengthFeature_in_entryRuleLengthFeature251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLengthFeature258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__0_in_ruleLengthFeature284 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_11_in_rule__Color__Alternatives537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Color__Alternatives558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Color__Alternatives579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Color__Alternatives600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Color__Alternatives621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group__0__Impl685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1716 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2776 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__3837 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__3__Impl868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__4899 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__4902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ColorFeatureAssignment_4_in_rule__Entity__Group__4__Impl929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__5959 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__5962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NetworkFeatureAssignment_5_in_rule__Entity__Group__5__Impl989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61019 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__LengthFeatureAssignment_6_in_rule__Entity__Group__6__Impl1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71079 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__71082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_7_in_rule__Entity__Group__7__Impl1109 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__81140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Entity__Group__8__Impl1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__01217 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group_2__0__Impl1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01340 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_0_in_rule__Feature__Group__0__Impl1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Feature__Group__1__Impl1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21462 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ValueAssignment_2_in_rule__Feature__Group__2__Impl1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Feature__Group__3__Impl1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__0__Impl_in_rule__LengthFeature__Group__01589 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__1_in_rule__LengthFeature__Group__01592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__NameAssignment_0_in_rule__LengthFeature__Group__0__Impl1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__1__Impl_in_rule__LengthFeature__Group__11649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__2_in_rule__LengthFeature__Group__11652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__LengthFeature__Group__1__Impl1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__2__Impl_in_rule__LengthFeature__Group__21711 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__3_in_rule__LengthFeature__Group__21714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__ValueAssignment_2_in_rule__LengthFeature__Group__2__Impl1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__3__Impl_in_rule__LengthFeature__Group__31771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LengthFeature__Group__3__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__01838 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__01841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__11897 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__2_in_rule__DOUBLE__Group__11900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DOUBLE__Group__1__Impl1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__2__Impl_in_rule__DOUBLE__Group__21959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group__2__Impl1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__0__Impl_in_rule__NetWorkFeature__Group__02021 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__1_in_rule__NetWorkFeature__Group__02024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__NameAssignment_0_in_rule__NetWorkFeature__Group__0__Impl2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__1__Impl_in_rule__NetWorkFeature__Group__12081 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__2_in_rule__NetWorkFeature__Group__12084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NetWorkFeature__Group__1__Impl2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__2__Impl_in_rule__NetWorkFeature__Group__22143 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__3_in_rule__NetWorkFeature__Group__22146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__ValueAssignment_2_in_rule__NetWorkFeature__Group__2__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__3__Impl_in_rule__NetWorkFeature__Group__32203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__NetWorkFeature__Group__3__Impl2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__0__Impl_in_rule__ColorFeature__Group__02270 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__1_in_rule__ColorFeature__Group__02273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__NameAssignment_0_in_rule__ColorFeature__Group__0__Impl2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__1__Impl_in_rule__ColorFeature__Group__12330 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__2_in_rule__ColorFeature__Group__12333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ColorFeature__Group__1__Impl2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__2__Impl_in_rule__ColorFeature__Group__22392 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__3_in_rule__ColorFeature__Group__22395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__ValueAssignment_2_in_rule__ColorFeature__Group__2__Impl2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__3__Impl_in_rule__ColorFeature__Group__32452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ColorFeature__Group__3__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Aml__ElementsAssignment2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Entity__NameAssignment_12555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_12590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_rule__Entity__ColorFeatureAssignment_42625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNetWorkFeature_in_rule__Entity__NetworkFeatureAssignment_52656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLengthFeature_in_rule__Entity__LengthFeatureAssignment_62687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_72718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_02749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__ValueAssignment_22780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LengthFeature__NameAssignment_02816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__LengthFeature__ValueAssignment_22855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__NetWorkFeature__NameAssignment_02891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NetWorkFeature__ValueAssignment_22930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ColorFeature__NameAssignment_02966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__ColorFeature__ValueAssignment_23005 = new BitSet(new long[]{0x0000000000000002L});

}