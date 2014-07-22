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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cable'", "'Driver'", "'MaxMin'", "'Red'", "'Black'", "'White'", "'Grey'", "'Green'", "'puid'", "'{'", "'}'", "'extends'", "'='", "';'", "'.'", "'length'", "'network'", "'color'"
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
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

                if ( ((LA1_0>=11 && LA1_0<=13)||LA1_0==19) ) {
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


    // $ANTLR start "entryRuleAbstractElements"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:96:1: entryRuleAbstractElements : ruleAbstractElements EOF ;
    public final void entryRuleAbstractElements() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:97:1: ( ruleAbstractElements EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:98:1: ruleAbstractElements EOF
            {
             before(grammarAccess.getAbstractElementsRule()); 
            pushFollow(FOLLOW_ruleAbstractElements_in_entryRuleAbstractElements131);
            ruleAbstractElements();

            state._fsp--;

             after(grammarAccess.getAbstractElementsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElements138); 

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
    // $ANTLR end "entryRuleAbstractElements"


    // $ANTLR start "ruleAbstractElements"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:105:1: ruleAbstractElements : ( ( rule__AbstractElements__Alternatives ) ) ;
    public final void ruleAbstractElements() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:109:2: ( ( ( rule__AbstractElements__Alternatives ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:110:1: ( ( rule__AbstractElements__Alternatives ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:110:1: ( ( rule__AbstractElements__Alternatives ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:111:1: ( rule__AbstractElements__Alternatives )
            {
             before(grammarAccess.getAbstractElementsAccess().getAlternatives()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:112:1: ( rule__AbstractElements__Alternatives )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:112:2: rule__AbstractElements__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElements__Alternatives_in_ruleAbstractElements164);
            rule__AbstractElements__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElements"


    // $ANTLR start "entryRuleSuperEntity"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:124:1: entryRuleSuperEntity : ruleSuperEntity EOF ;
    public final void entryRuleSuperEntity() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:125:1: ( ruleSuperEntity EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:126:1: ruleSuperEntity EOF
            {
             before(grammarAccess.getSuperEntityRule()); 
            pushFollow(FOLLOW_ruleSuperEntity_in_entryRuleSuperEntity191);
            ruleSuperEntity();

            state._fsp--;

             after(grammarAccess.getSuperEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuperEntity198); 

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
    // $ANTLR end "entryRuleSuperEntity"


    // $ANTLR start "ruleSuperEntity"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:133:1: ruleSuperEntity : ( ( rule__SuperEntity__NameAssignment ) ) ;
    public final void ruleSuperEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:137:2: ( ( ( rule__SuperEntity__NameAssignment ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:138:1: ( ( rule__SuperEntity__NameAssignment ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:138:1: ( ( rule__SuperEntity__NameAssignment ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:139:1: ( rule__SuperEntity__NameAssignment )
            {
             before(grammarAccess.getSuperEntityAccess().getNameAssignment()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:140:1: ( rule__SuperEntity__NameAssignment )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:140:2: rule__SuperEntity__NameAssignment
            {
            pushFollow(FOLLOW_rule__SuperEntity__NameAssignment_in_ruleSuperEntity224);
            rule__SuperEntity__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSuperEntityAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSuperEntity"


    // $ANTLR start "entryRuleEntity"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:152:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:153:1: ( ruleEntity EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:154:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity251);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity258); 

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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:161:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:165:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:166:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:166:1: ( ( rule__Entity__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:167:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:168:1: ( rule__Entity__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:168:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity284);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:180:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:181:1: ( ruleFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:182:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature311);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature318); 

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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:189:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:193:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:194:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:194:1: ( ( rule__Feature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:195:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:196:1: ( rule__Feature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:196:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature344);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:208:1: entryRuleLengthFeature : ruleLengthFeature EOF ;
    public final void entryRuleLengthFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:209:1: ( ruleLengthFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:210:1: ruleLengthFeature EOF
            {
             before(grammarAccess.getLengthFeatureRule()); 
            pushFollow(FOLLOW_ruleLengthFeature_in_entryRuleLengthFeature371);
            ruleLengthFeature();

            state._fsp--;

             after(grammarAccess.getLengthFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLengthFeature378); 

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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:217:1: ruleLengthFeature : ( ( rule__LengthFeature__Group__0 ) ) ;
    public final void ruleLengthFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:221:2: ( ( ( rule__LengthFeature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:222:1: ( ( rule__LengthFeature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:222:1: ( ( rule__LengthFeature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:223:1: ( rule__LengthFeature__Group__0 )
            {
             before(grammarAccess.getLengthFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:224:1: ( rule__LengthFeature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:224:2: rule__LengthFeature__Group__0
            {
            pushFollow(FOLLOW_rule__LengthFeature__Group__0_in_ruleLengthFeature404);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:236:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:237:1: ( ruleDOUBLE EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:238:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE431);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE438); 

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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:245:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:249:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:250:1: ( ( rule__DOUBLE__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:250:1: ( ( rule__DOUBLE__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:251:1: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:252:1: ( rule__DOUBLE__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:252:2: rule__DOUBLE__Group__0
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE464);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:264:1: entryRuleNetWorkFeature : ruleNetWorkFeature EOF ;
    public final void entryRuleNetWorkFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:265:1: ( ruleNetWorkFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:266:1: ruleNetWorkFeature EOF
            {
             before(grammarAccess.getNetWorkFeatureRule()); 
            pushFollow(FOLLOW_ruleNetWorkFeature_in_entryRuleNetWorkFeature491);
            ruleNetWorkFeature();

            state._fsp--;

             after(grammarAccess.getNetWorkFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNetWorkFeature498); 

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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:273:1: ruleNetWorkFeature : ( ( rule__NetWorkFeature__Group__0 ) ) ;
    public final void ruleNetWorkFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:277:2: ( ( ( rule__NetWorkFeature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:278:1: ( ( rule__NetWorkFeature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:278:1: ( ( rule__NetWorkFeature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:279:1: ( rule__NetWorkFeature__Group__0 )
            {
             before(grammarAccess.getNetWorkFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:280:1: ( rule__NetWorkFeature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:280:2: rule__NetWorkFeature__Group__0
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__0_in_ruleNetWorkFeature524);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:292:1: entryRuleColorFeature : ruleColorFeature EOF ;
    public final void entryRuleColorFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:293:1: ( ruleColorFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:294:1: ruleColorFeature EOF
            {
             before(grammarAccess.getColorFeatureRule()); 
            pushFollow(FOLLOW_ruleColorFeature_in_entryRuleColorFeature551);
            ruleColorFeature();

            state._fsp--;

             after(grammarAccess.getColorFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorFeature558); 

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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:301:1: ruleColorFeature : ( ( rule__ColorFeature__Group__0 ) ) ;
    public final void ruleColorFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:305:2: ( ( ( rule__ColorFeature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:306:1: ( ( rule__ColorFeature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:306:1: ( ( rule__ColorFeature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:307:1: ( rule__ColorFeature__Group__0 )
            {
             before(grammarAccess.getColorFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:308:1: ( rule__ColorFeature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:308:2: rule__ColorFeature__Group__0
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__0_in_ruleColorFeature584);
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


    // $ANTLR start "ruleSuperNames"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:321:1: ruleSuperNames : ( ( rule__SuperNames__Alternatives ) ) ;
    public final void ruleSuperNames() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:325:1: ( ( ( rule__SuperNames__Alternatives ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:326:1: ( ( rule__SuperNames__Alternatives ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:326:1: ( ( rule__SuperNames__Alternatives ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:327:1: ( rule__SuperNames__Alternatives )
            {
             before(grammarAccess.getSuperNamesAccess().getAlternatives()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:328:1: ( rule__SuperNames__Alternatives )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:328:2: rule__SuperNames__Alternatives
            {
            pushFollow(FOLLOW_rule__SuperNames__Alternatives_in_ruleSuperNames621);
            rule__SuperNames__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSuperNamesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSuperNames"


    // $ANTLR start "ruleColor"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:340:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:344:1: ( ( ( rule__Color__Alternatives ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:345:1: ( ( rule__Color__Alternatives ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:345:1: ( ( rule__Color__Alternatives ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:346:1: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:347:1: ( rule__Color__Alternatives )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:347:2: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_rule__Color__Alternatives_in_ruleColor657);
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


    // $ANTLR start "rule__AbstractElements__Alternatives"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:358:1: rule__AbstractElements__Alternatives : ( ( ruleEntity ) | ( ruleSuperEntity ) );
    public final void rule__AbstractElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:362:1: ( ( ruleEntity ) | ( ruleSuperEntity ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=11 && LA2_0<=13)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:363:1: ( ruleEntity )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:363:1: ( ruleEntity )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:364:1: ruleEntity
                    {
                     before(grammarAccess.getAbstractElementsAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__AbstractElements__Alternatives692);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementsAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:369:6: ( ruleSuperEntity )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:369:6: ( ruleSuperEntity )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:370:1: ruleSuperEntity
                    {
                     before(grammarAccess.getAbstractElementsAccess().getSuperEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSuperEntity_in_rule__AbstractElements__Alternatives709);
                    ruleSuperEntity();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementsAccess().getSuperEntityParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractElements__Alternatives"


    // $ANTLR start "rule__SuperNames__Alternatives"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:380:1: rule__SuperNames__Alternatives : ( ( ( 'Cable' ) ) | ( ( 'Driver' ) ) | ( ( 'MaxMin' ) ) );
    public final void rule__SuperNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:384:1: ( ( ( 'Cable' ) ) | ( ( 'Driver' ) ) | ( ( 'MaxMin' ) ) )
            int alt3=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:385:1: ( ( 'Cable' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:385:1: ( ( 'Cable' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:386:1: ( 'Cable' )
                    {
                     before(grammarAccess.getSuperNamesAccess().getCableEnumLiteralDeclaration_0()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:387:1: ( 'Cable' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:387:3: 'Cable'
                    {
                    match(input,11,FOLLOW_11_in_rule__SuperNames__Alternatives742); 

                    }

                     after(grammarAccess.getSuperNamesAccess().getCableEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:392:6: ( ( 'Driver' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:392:6: ( ( 'Driver' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:393:1: ( 'Driver' )
                    {
                     before(grammarAccess.getSuperNamesAccess().getDriverEnumLiteralDeclaration_1()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:394:1: ( 'Driver' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:394:3: 'Driver'
                    {
                    match(input,12,FOLLOW_12_in_rule__SuperNames__Alternatives763); 

                    }

                     after(grammarAccess.getSuperNamesAccess().getDriverEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:399:6: ( ( 'MaxMin' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:399:6: ( ( 'MaxMin' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:400:1: ( 'MaxMin' )
                    {
                     before(grammarAccess.getSuperNamesAccess().getMaxMinEnumLiteralDeclaration_2()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:401:1: ( 'MaxMin' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:401:3: 'MaxMin'
                    {
                    match(input,13,FOLLOW_13_in_rule__SuperNames__Alternatives784); 

                    }

                     after(grammarAccess.getSuperNamesAccess().getMaxMinEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__SuperNames__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:411:1: rule__Color__Alternatives : ( ( ( 'Red' ) ) | ( ( 'Black' ) ) | ( ( 'White' ) ) | ( ( 'Grey' ) ) | ( ( 'Green' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:415:1: ( ( ( 'Red' ) ) | ( ( 'Black' ) ) | ( ( 'White' ) ) | ( ( 'Grey' ) ) | ( ( 'Green' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            case 18:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:416:1: ( ( 'Red' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:416:1: ( ( 'Red' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:417:1: ( 'Red' )
                    {
                     before(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:418:1: ( 'Red' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:418:3: 'Red'
                    {
                    match(input,14,FOLLOW_14_in_rule__Color__Alternatives820); 

                    }

                     after(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:423:6: ( ( 'Black' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:423:6: ( ( 'Black' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:424:1: ( 'Black' )
                    {
                     before(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:425:1: ( 'Black' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:425:3: 'Black'
                    {
                    match(input,15,FOLLOW_15_in_rule__Color__Alternatives841); 

                    }

                     after(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:430:6: ( ( 'White' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:430:6: ( ( 'White' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:431:1: ( 'White' )
                    {
                     before(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:432:1: ( 'White' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:432:3: 'White'
                    {
                    match(input,16,FOLLOW_16_in_rule__Color__Alternatives862); 

                    }

                     after(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:437:6: ( ( 'Grey' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:437:6: ( ( 'Grey' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:438:1: ( 'Grey' )
                    {
                     before(grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:439:1: ( 'Grey' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:439:3: 'Grey'
                    {
                    match(input,17,FOLLOW_17_in_rule__Color__Alternatives883); 

                    }

                     after(grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:444:6: ( ( 'Green' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:444:6: ( ( 'Green' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:445:1: ( 'Green' )
                    {
                     before(grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_4()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:446:1: ( 'Green' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:446:3: 'Green'
                    {
                    match(input,18,FOLLOW_18_in_rule__Color__Alternatives904); 

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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:458:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:462:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:463:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0937);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0940);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:470:1: rule__Entity__Group__0__Impl : ( 'puid' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:474:1: ( ( 'puid' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:475:1: ( 'puid' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:475:1: ( 'puid' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:476:1: 'puid'
            {
             before(grammarAccess.getEntityAccess().getPuidKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Entity__Group__0__Impl968); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:489:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:493:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:494:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1999);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11002);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:501:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:505:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:506:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:506:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:507:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:508:1: ( rule__Entity__NameAssignment_1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:508:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1029);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:518:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:522:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:523:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21059);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21062);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:530:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:534:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:535:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:535:1: ( ( rule__Entity__Group_2__0 )? )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:536:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:537:1: ( rule__Entity__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:537:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl1089);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:547:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:551:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:552:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31120);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31123);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:559:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:563:1: ( ( '{' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:564:1: ( '{' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:564:1: ( '{' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:565:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Entity__Group__3__Impl1151); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:578:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:582:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:583:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41182);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41185);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:590:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__ColorFeatureAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:594:1: ( ( ( rule__Entity__ColorFeatureAssignment_4 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:595:1: ( ( rule__Entity__ColorFeatureAssignment_4 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:595:1: ( ( rule__Entity__ColorFeatureAssignment_4 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:596:1: ( rule__Entity__ColorFeatureAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getColorFeatureAssignment_4()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:597:1: ( rule__Entity__ColorFeatureAssignment_4 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:597:2: rule__Entity__ColorFeatureAssignment_4
            {
            pushFollow(FOLLOW_rule__Entity__ColorFeatureAssignment_4_in_rule__Entity__Group__4__Impl1212);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:607:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:611:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:612:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51242);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51245);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:619:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__NetworkFeatureAssignment_5 ) ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:623:1: ( ( ( rule__Entity__NetworkFeatureAssignment_5 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:624:1: ( ( rule__Entity__NetworkFeatureAssignment_5 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:624:1: ( ( rule__Entity__NetworkFeatureAssignment_5 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:625:1: ( rule__Entity__NetworkFeatureAssignment_5 )
            {
             before(grammarAccess.getEntityAccess().getNetworkFeatureAssignment_5()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:626:1: ( rule__Entity__NetworkFeatureAssignment_5 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:626:2: rule__Entity__NetworkFeatureAssignment_5
            {
            pushFollow(FOLLOW_rule__Entity__NetworkFeatureAssignment_5_in_rule__Entity__Group__5__Impl1272);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:636:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:640:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:641:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61302);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61305);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:648:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__LengthFeatureAssignment_6 ) ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:652:1: ( ( ( rule__Entity__LengthFeatureAssignment_6 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:653:1: ( ( rule__Entity__LengthFeatureAssignment_6 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:653:1: ( ( rule__Entity__LengthFeatureAssignment_6 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:654:1: ( rule__Entity__LengthFeatureAssignment_6 )
            {
             before(grammarAccess.getEntityAccess().getLengthFeatureAssignment_6()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:655:1: ( rule__Entity__LengthFeatureAssignment_6 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:655:2: rule__Entity__LengthFeatureAssignment_6
            {
            pushFollow(FOLLOW_rule__Entity__LengthFeatureAssignment_6_in_rule__Entity__Group__6__Impl1332);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:665:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:669:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:670:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71362);
            rule__Entity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__71365);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:677:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__FeaturesAssignment_7 )* ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:681:1: ( ( ( rule__Entity__FeaturesAssignment_7 )* ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:682:1: ( ( rule__Entity__FeaturesAssignment_7 )* )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:682:1: ( ( rule__Entity__FeaturesAssignment_7 )* )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:683:1: ( rule__Entity__FeaturesAssignment_7 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_7()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:684:1: ( rule__Entity__FeaturesAssignment_7 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:684:2: rule__Entity__FeaturesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_7_in_rule__Entity__Group__7__Impl1392);
            	    rule__Entity__FeaturesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:694:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:698:1: ( rule__Entity__Group__8__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:699:2: rule__Entity__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__81423);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:705:1: rule__Entity__Group__8__Impl : ( '}' ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:709:1: ( ( '}' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:710:1: ( '}' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:710:1: ( '}' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:711:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group__8__Impl1451); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:742:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:746:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:747:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__01500);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01503);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:754:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:758:1: ( ( 'extends' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:759:1: ( 'extends' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:759:1: ( 'extends' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:760:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Entity__Group_2__0__Impl1531); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:773:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:777:1: ( rule__Entity__Group_2__1__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:778:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11562);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:784:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:788:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:789:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:789:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:790:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:791:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:791:2: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl1589);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:805:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:809:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:810:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01623);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01626);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:817:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__NameAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:821:1: ( ( ( rule__Feature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:822:1: ( ( rule__Feature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:822:1: ( ( rule__Feature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:823:1: ( rule__Feature__NameAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:824:1: ( rule__Feature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:824:2: rule__Feature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_0_in_rule__Feature__Group__0__Impl1653);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:834:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:838:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:839:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11683);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11686);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:846:1: rule__Feature__Group__1__Impl : ( '=' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:850:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:851:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:851:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:852:1: '='
            {
             before(grammarAccess.getFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Feature__Group__1__Impl1714); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:865:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:869:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:870:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21745);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21748);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:877:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__ValueAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:881:1: ( ( ( rule__Feature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:882:1: ( ( rule__Feature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:882:1: ( ( rule__Feature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:883:1: ( rule__Feature__ValueAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:884:1: ( rule__Feature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:884:2: rule__Feature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Feature__ValueAssignment_2_in_rule__Feature__Group__2__Impl1775);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:894:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:898:1: ( rule__Feature__Group__3__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:899:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31805);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:905:1: rule__Feature__Group__3__Impl : ( ';' ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:909:1: ( ( ';' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:910:1: ( ';' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:910:1: ( ';' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:911:1: ';'
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Feature__Group__3__Impl1833); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:932:1: rule__LengthFeature__Group__0 : rule__LengthFeature__Group__0__Impl rule__LengthFeature__Group__1 ;
    public final void rule__LengthFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:936:1: ( rule__LengthFeature__Group__0__Impl rule__LengthFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:937:2: rule__LengthFeature__Group__0__Impl rule__LengthFeature__Group__1
            {
            pushFollow(FOLLOW_rule__LengthFeature__Group__0__Impl_in_rule__LengthFeature__Group__01872);
            rule__LengthFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LengthFeature__Group__1_in_rule__LengthFeature__Group__01875);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:944:1: rule__LengthFeature__Group__0__Impl : ( ( rule__LengthFeature__NameAssignment_0 ) ) ;
    public final void rule__LengthFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:948:1: ( ( ( rule__LengthFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:949:1: ( ( rule__LengthFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:949:1: ( ( rule__LengthFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:950:1: ( rule__LengthFeature__NameAssignment_0 )
            {
             before(grammarAccess.getLengthFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:951:1: ( rule__LengthFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:951:2: rule__LengthFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__LengthFeature__NameAssignment_0_in_rule__LengthFeature__Group__0__Impl1902);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:961:1: rule__LengthFeature__Group__1 : rule__LengthFeature__Group__1__Impl rule__LengthFeature__Group__2 ;
    public final void rule__LengthFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:965:1: ( rule__LengthFeature__Group__1__Impl rule__LengthFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:966:2: rule__LengthFeature__Group__1__Impl rule__LengthFeature__Group__2
            {
            pushFollow(FOLLOW_rule__LengthFeature__Group__1__Impl_in_rule__LengthFeature__Group__11932);
            rule__LengthFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LengthFeature__Group__2_in_rule__LengthFeature__Group__11935);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:973:1: rule__LengthFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__LengthFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:977:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:978:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:978:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:979:1: '='
            {
             before(grammarAccess.getLengthFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__LengthFeature__Group__1__Impl1963); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:992:1: rule__LengthFeature__Group__2 : rule__LengthFeature__Group__2__Impl rule__LengthFeature__Group__3 ;
    public final void rule__LengthFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:996:1: ( rule__LengthFeature__Group__2__Impl rule__LengthFeature__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:997:2: rule__LengthFeature__Group__2__Impl rule__LengthFeature__Group__3
            {
            pushFollow(FOLLOW_rule__LengthFeature__Group__2__Impl_in_rule__LengthFeature__Group__21994);
            rule__LengthFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LengthFeature__Group__3_in_rule__LengthFeature__Group__21997);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1004:1: rule__LengthFeature__Group__2__Impl : ( ( rule__LengthFeature__ValueAssignment_2 ) ) ;
    public final void rule__LengthFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1008:1: ( ( ( rule__LengthFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1009:1: ( ( rule__LengthFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1009:1: ( ( rule__LengthFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1010:1: ( rule__LengthFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getLengthFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1011:1: ( rule__LengthFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1011:2: rule__LengthFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__LengthFeature__ValueAssignment_2_in_rule__LengthFeature__Group__2__Impl2024);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1021:1: rule__LengthFeature__Group__3 : rule__LengthFeature__Group__3__Impl ;
    public final void rule__LengthFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1025:1: ( rule__LengthFeature__Group__3__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1026:2: rule__LengthFeature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LengthFeature__Group__3__Impl_in_rule__LengthFeature__Group__32054);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1032:1: rule__LengthFeature__Group__3__Impl : ( ';' ) ;
    public final void rule__LengthFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1036:1: ( ( ';' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1037:1: ( ';' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1037:1: ( ';' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1038:1: ';'
            {
             before(grammarAccess.getLengthFeatureAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__LengthFeature__Group__3__Impl2082); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1059:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1063:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1064:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__02121);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__02124);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1071:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1075:1: ( ( RULE_INT ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1076:1: ( RULE_INT )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1076:1: ( RULE_INT )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1077:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl2151); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1088:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1092:1: ( rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1093:2: rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__12180);
            rule__DOUBLE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group__2_in_rule__DOUBLE__Group__12183);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1100:1: rule__DOUBLE__Group__1__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1104:1: ( ( '.' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1105:1: ( '.' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1105:1: ( '.' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1106:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__DOUBLE__Group__1__Impl2211); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1119:1: rule__DOUBLE__Group__2 : rule__DOUBLE__Group__2__Impl ;
    public final void rule__DOUBLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1123:1: ( rule__DOUBLE__Group__2__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1124:2: rule__DOUBLE__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__2__Impl_in_rule__DOUBLE__Group__22242);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1130:1: rule__DOUBLE__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1134:1: ( ( RULE_INT ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1135:1: ( RULE_INT )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1135:1: ( RULE_INT )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1136:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group__2__Impl2269); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1153:1: rule__NetWorkFeature__Group__0 : rule__NetWorkFeature__Group__0__Impl rule__NetWorkFeature__Group__1 ;
    public final void rule__NetWorkFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1157:1: ( rule__NetWorkFeature__Group__0__Impl rule__NetWorkFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1158:2: rule__NetWorkFeature__Group__0__Impl rule__NetWorkFeature__Group__1
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__0__Impl_in_rule__NetWorkFeature__Group__02304);
            rule__NetWorkFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NetWorkFeature__Group__1_in_rule__NetWorkFeature__Group__02307);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1165:1: rule__NetWorkFeature__Group__0__Impl : ( ( rule__NetWorkFeature__NameAssignment_0 ) ) ;
    public final void rule__NetWorkFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1169:1: ( ( ( rule__NetWorkFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1170:1: ( ( rule__NetWorkFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1170:1: ( ( rule__NetWorkFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1171:1: ( rule__NetWorkFeature__NameAssignment_0 )
            {
             before(grammarAccess.getNetWorkFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1172:1: ( rule__NetWorkFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1172:2: rule__NetWorkFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__NameAssignment_0_in_rule__NetWorkFeature__Group__0__Impl2334);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1182:1: rule__NetWorkFeature__Group__1 : rule__NetWorkFeature__Group__1__Impl rule__NetWorkFeature__Group__2 ;
    public final void rule__NetWorkFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1186:1: ( rule__NetWorkFeature__Group__1__Impl rule__NetWorkFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1187:2: rule__NetWorkFeature__Group__1__Impl rule__NetWorkFeature__Group__2
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__1__Impl_in_rule__NetWorkFeature__Group__12364);
            rule__NetWorkFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NetWorkFeature__Group__2_in_rule__NetWorkFeature__Group__12367);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1194:1: rule__NetWorkFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__NetWorkFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1198:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1199:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1199:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1200:1: '='
            {
             before(grammarAccess.getNetWorkFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__NetWorkFeature__Group__1__Impl2395); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1213:1: rule__NetWorkFeature__Group__2 : rule__NetWorkFeature__Group__2__Impl rule__NetWorkFeature__Group__3 ;
    public final void rule__NetWorkFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1217:1: ( rule__NetWorkFeature__Group__2__Impl rule__NetWorkFeature__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1218:2: rule__NetWorkFeature__Group__2__Impl rule__NetWorkFeature__Group__3
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__2__Impl_in_rule__NetWorkFeature__Group__22426);
            rule__NetWorkFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NetWorkFeature__Group__3_in_rule__NetWorkFeature__Group__22429);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1225:1: rule__NetWorkFeature__Group__2__Impl : ( ( rule__NetWorkFeature__ValueAssignment_2 ) ) ;
    public final void rule__NetWorkFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1229:1: ( ( ( rule__NetWorkFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1230:1: ( ( rule__NetWorkFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1230:1: ( ( rule__NetWorkFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1231:1: ( rule__NetWorkFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getNetWorkFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1232:1: ( rule__NetWorkFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1232:2: rule__NetWorkFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__ValueAssignment_2_in_rule__NetWorkFeature__Group__2__Impl2456);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1242:1: rule__NetWorkFeature__Group__3 : rule__NetWorkFeature__Group__3__Impl ;
    public final void rule__NetWorkFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1246:1: ( rule__NetWorkFeature__Group__3__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1247:2: rule__NetWorkFeature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__3__Impl_in_rule__NetWorkFeature__Group__32486);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1253:1: rule__NetWorkFeature__Group__3__Impl : ( ';' ) ;
    public final void rule__NetWorkFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1257:1: ( ( ';' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1258:1: ( ';' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1258:1: ( ';' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1259:1: ';'
            {
             before(grammarAccess.getNetWorkFeatureAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__NetWorkFeature__Group__3__Impl2514); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1280:1: rule__ColorFeature__Group__0 : rule__ColorFeature__Group__0__Impl rule__ColorFeature__Group__1 ;
    public final void rule__ColorFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1284:1: ( rule__ColorFeature__Group__0__Impl rule__ColorFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1285:2: rule__ColorFeature__Group__0__Impl rule__ColorFeature__Group__1
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__0__Impl_in_rule__ColorFeature__Group__02553);
            rule__ColorFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColorFeature__Group__1_in_rule__ColorFeature__Group__02556);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1292:1: rule__ColorFeature__Group__0__Impl : ( ( rule__ColorFeature__NameAssignment_0 ) ) ;
    public final void rule__ColorFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1296:1: ( ( ( rule__ColorFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1297:1: ( ( rule__ColorFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1297:1: ( ( rule__ColorFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1298:1: ( rule__ColorFeature__NameAssignment_0 )
            {
             before(grammarAccess.getColorFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1299:1: ( rule__ColorFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1299:2: rule__ColorFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ColorFeature__NameAssignment_0_in_rule__ColorFeature__Group__0__Impl2583);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1309:1: rule__ColorFeature__Group__1 : rule__ColorFeature__Group__1__Impl rule__ColorFeature__Group__2 ;
    public final void rule__ColorFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1313:1: ( rule__ColorFeature__Group__1__Impl rule__ColorFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1314:2: rule__ColorFeature__Group__1__Impl rule__ColorFeature__Group__2
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__1__Impl_in_rule__ColorFeature__Group__12613);
            rule__ColorFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColorFeature__Group__2_in_rule__ColorFeature__Group__12616);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1321:1: rule__ColorFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__ColorFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1325:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1326:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1326:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1327:1: '='
            {
             before(grammarAccess.getColorFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ColorFeature__Group__1__Impl2644); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1340:1: rule__ColorFeature__Group__2 : rule__ColorFeature__Group__2__Impl rule__ColorFeature__Group__3 ;
    public final void rule__ColorFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1344:1: ( rule__ColorFeature__Group__2__Impl rule__ColorFeature__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1345:2: rule__ColorFeature__Group__2__Impl rule__ColorFeature__Group__3
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__2__Impl_in_rule__ColorFeature__Group__22675);
            rule__ColorFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColorFeature__Group__3_in_rule__ColorFeature__Group__22678);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1352:1: rule__ColorFeature__Group__2__Impl : ( ( rule__ColorFeature__ValueAssignment_2 ) ) ;
    public final void rule__ColorFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1356:1: ( ( ( rule__ColorFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1357:1: ( ( rule__ColorFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1357:1: ( ( rule__ColorFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1358:1: ( rule__ColorFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getColorFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1359:1: ( rule__ColorFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1359:2: rule__ColorFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ColorFeature__ValueAssignment_2_in_rule__ColorFeature__Group__2__Impl2705);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1369:1: rule__ColorFeature__Group__3 : rule__ColorFeature__Group__3__Impl ;
    public final void rule__ColorFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1373:1: ( rule__ColorFeature__Group__3__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1374:2: rule__ColorFeature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__3__Impl_in_rule__ColorFeature__Group__32735);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1380:1: rule__ColorFeature__Group__3__Impl : ( ';' ) ;
    public final void rule__ColorFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1384:1: ( ( ';' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1385:1: ( ';' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1385:1: ( ';' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1386:1: ';'
            {
             before(grammarAccess.getColorFeatureAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__ColorFeature__Group__3__Impl2763); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1408:1: rule__Aml__ElementsAssignment : ( ruleAbstractElements ) ;
    public final void rule__Aml__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1412:1: ( ( ruleAbstractElements ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1413:1: ( ruleAbstractElements )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1413:1: ( ruleAbstractElements )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1414:1: ruleAbstractElements
            {
             before(grammarAccess.getAmlAccess().getElementsAbstractElementsParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElements_in_rule__Aml__ElementsAssignment2807);
            ruleAbstractElements();

            state._fsp--;

             after(grammarAccess.getAmlAccess().getElementsAbstractElementsParserRuleCall_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SuperEntity__NameAssignment"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1423:1: rule__SuperEntity__NameAssignment : ( ruleSuperNames ) ;
    public final void rule__SuperEntity__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1427:1: ( ( ruleSuperNames ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1428:1: ( ruleSuperNames )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1428:1: ( ruleSuperNames )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1429:1: ruleSuperNames
            {
             before(grammarAccess.getSuperEntityAccess().getNameSuperNamesEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleSuperNames_in_rule__SuperEntity__NameAssignment2838);
            ruleSuperNames();

            state._fsp--;

             after(grammarAccess.getSuperEntityAccess().getNameSuperNamesEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperEntity__NameAssignment"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1438:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1442:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1443:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1443:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1444:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12869); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1453:1: rule__Entity__SuperTypeAssignment_2_1 : ( ruleSuperEntity ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1457:1: ( ( ruleSuperEntity ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1458:1: ( ruleSuperEntity )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1458:1: ( ruleSuperEntity )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1459:1: ruleSuperEntity
            {
             before(grammarAccess.getEntityAccess().getSuperTypeSuperEntityParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSuperEntity_in_rule__Entity__SuperTypeAssignment_2_12900);
            ruleSuperEntity();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getSuperTypeSuperEntityParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1468:1: rule__Entity__ColorFeatureAssignment_4 : ( ruleColorFeature ) ;
    public final void rule__Entity__ColorFeatureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1472:1: ( ( ruleColorFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1473:1: ( ruleColorFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1473:1: ( ruleColorFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1474:1: ruleColorFeature
            {
             before(grammarAccess.getEntityAccess().getColorFeatureColorFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleColorFeature_in_rule__Entity__ColorFeatureAssignment_42931);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1483:1: rule__Entity__NetworkFeatureAssignment_5 : ( ruleNetWorkFeature ) ;
    public final void rule__Entity__NetworkFeatureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1487:1: ( ( ruleNetWorkFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1488:1: ( ruleNetWorkFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1488:1: ( ruleNetWorkFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1489:1: ruleNetWorkFeature
            {
             before(grammarAccess.getEntityAccess().getNetworkFeatureNetWorkFeatureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleNetWorkFeature_in_rule__Entity__NetworkFeatureAssignment_52962);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1498:1: rule__Entity__LengthFeatureAssignment_6 : ( ruleLengthFeature ) ;
    public final void rule__Entity__LengthFeatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1502:1: ( ( ruleLengthFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1503:1: ( ruleLengthFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1503:1: ( ruleLengthFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1504:1: ruleLengthFeature
            {
             before(grammarAccess.getEntityAccess().getLengthFeatureLengthFeatureParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleLengthFeature_in_rule__Entity__LengthFeatureAssignment_62993);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1513:1: rule__Entity__FeaturesAssignment_7 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1517:1: ( ( ruleFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1518:1: ( ruleFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1518:1: ( ruleFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1519:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_73024);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1528:1: rule__Feature__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1532:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1533:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1533:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1534:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_03055); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1543:1: rule__Feature__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__Feature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1547:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1548:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1548:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1549:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__ValueAssignment_23086); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1558:1: rule__LengthFeature__NameAssignment_0 : ( ( 'length' ) ) ;
    public final void rule__LengthFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1562:1: ( ( ( 'length' ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1563:1: ( ( 'length' ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1563:1: ( ( 'length' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1564:1: ( 'length' )
            {
             before(grammarAccess.getLengthFeatureAccess().getNameLengthKeyword_0_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1565:1: ( 'length' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1566:1: 'length'
            {
             before(grammarAccess.getLengthFeatureAccess().getNameLengthKeyword_0_0()); 
            match(input,26,FOLLOW_26_in_rule__LengthFeature__NameAssignment_03122); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1581:1: rule__LengthFeature__ValueAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__LengthFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1585:1: ( ( ruleDOUBLE ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1586:1: ( ruleDOUBLE )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1586:1: ( ruleDOUBLE )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1587:1: ruleDOUBLE
            {
             before(grammarAccess.getLengthFeatureAccess().getValueDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__LengthFeature__ValueAssignment_23161);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1596:1: rule__NetWorkFeature__NameAssignment_0 : ( ( 'network' ) ) ;
    public final void rule__NetWorkFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1600:1: ( ( ( 'network' ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1601:1: ( ( 'network' ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1601:1: ( ( 'network' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1602:1: ( 'network' )
            {
             before(grammarAccess.getNetWorkFeatureAccess().getNameNetworkKeyword_0_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1603:1: ( 'network' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1604:1: 'network'
            {
             before(grammarAccess.getNetWorkFeatureAccess().getNameNetworkKeyword_0_0()); 
            match(input,27,FOLLOW_27_in_rule__NetWorkFeature__NameAssignment_03197); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1619:1: rule__NetWorkFeature__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__NetWorkFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1623:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1624:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1624:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1625:1: RULE_ID
            {
             before(grammarAccess.getNetWorkFeatureAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NetWorkFeature__ValueAssignment_23236); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1634:1: rule__ColorFeature__NameAssignment_0 : ( ( 'color' ) ) ;
    public final void rule__ColorFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1638:1: ( ( ( 'color' ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1639:1: ( ( 'color' ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1639:1: ( ( 'color' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1640:1: ( 'color' )
            {
             before(grammarAccess.getColorFeatureAccess().getNameColorKeyword_0_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1641:1: ( 'color' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1642:1: 'color'
            {
             before(grammarAccess.getColorFeatureAccess().getNameColorKeyword_0_0()); 
            match(input,28,FOLLOW_28_in_rule__ColorFeature__NameAssignment_03272); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1657:1: rule__ColorFeature__ValueAssignment_2 : ( ruleColor ) ;
    public final void rule__ColorFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1661:1: ( ( ruleColor ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1662:1: ( ruleColor )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1662:1: ( ruleColor )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1663:1: ruleColor
            {
             before(grammarAccess.getColorFeatureAccess().getValueColorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__ColorFeature__ValueAssignment_23311);
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
    public static final BitSet FOLLOW_rule__Aml__ElementsAssignment_in_ruleAml103 = new BitSet(new long[]{0x0000000000083802L});
    public static final BitSet FOLLOW_ruleAbstractElements_in_entryRuleAbstractElements131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElements138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElements__Alternatives_in_ruleAbstractElements164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperEntity_in_entryRuleSuperEntity191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuperEntity198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SuperEntity__NameAssignment_in_ruleSuperEntity224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLengthFeature_in_entryRuleLengthFeature371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLengthFeature378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__0_in_ruleLengthFeature404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNetWorkFeature_in_entryRuleNetWorkFeature491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNetWorkFeature498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__0_in_ruleNetWorkFeature524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_entryRuleColorFeature551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorFeature558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__0_in_ruleColorFeature584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SuperNames__Alternatives_in_ruleSuperNames621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Alternatives_in_ruleColor657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__AbstractElements__Alternatives692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperEntity_in_rule__AbstractElements__Alternatives709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SuperNames__Alternatives742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SuperNames__Alternatives763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SuperNames__Alternatives784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Color__Alternatives820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Color__Alternatives841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Color__Alternatives862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Color__Alternatives883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Color__Alternatives904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0937 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Entity__Group__0__Impl968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1999 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21059 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31120 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Entity__Group__3__Impl1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41182 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__ColorFeatureAssignment_4_in_rule__Entity__Group__4__Impl1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51242 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NetworkFeatureAssignment_5_in_rule__Entity__Group__5__Impl1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61302 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__LengthFeatureAssignment_6_in_rule__Entity__Group__6__Impl1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71362 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__71365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_7_in_rule__Entity__Group__7__Impl1392 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__81423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group__8__Impl1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__01500 = new BitSet(new long[]{0x0000000000083800L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Entity__Group_2__0__Impl1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01623 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_0_in_rule__Feature__Group__0__Impl1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11683 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Feature__Group__1__Impl1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21745 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ValueAssignment_2_in_rule__Feature__Group__2__Impl1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Feature__Group__3__Impl1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__0__Impl_in_rule__LengthFeature__Group__01872 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__1_in_rule__LengthFeature__Group__01875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__NameAssignment_0_in_rule__LengthFeature__Group__0__Impl1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__1__Impl_in_rule__LengthFeature__Group__11932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__2_in_rule__LengthFeature__Group__11935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LengthFeature__Group__1__Impl1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__2__Impl_in_rule__LengthFeature__Group__21994 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__3_in_rule__LengthFeature__Group__21997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__ValueAssignment_2_in_rule__LengthFeature__Group__2__Impl2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__3__Impl_in_rule__LengthFeature__Group__32054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LengthFeature__Group__3__Impl2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__02121 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__02124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__12180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__2_in_rule__DOUBLE__Group__12183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DOUBLE__Group__1__Impl2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__2__Impl_in_rule__DOUBLE__Group__22242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group__2__Impl2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__0__Impl_in_rule__NetWorkFeature__Group__02304 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__1_in_rule__NetWorkFeature__Group__02307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__NameAssignment_0_in_rule__NetWorkFeature__Group__0__Impl2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__1__Impl_in_rule__NetWorkFeature__Group__12364 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__2_in_rule__NetWorkFeature__Group__12367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__NetWorkFeature__Group__1__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__2__Impl_in_rule__NetWorkFeature__Group__22426 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__3_in_rule__NetWorkFeature__Group__22429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__ValueAssignment_2_in_rule__NetWorkFeature__Group__2__Impl2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__3__Impl_in_rule__NetWorkFeature__Group__32486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__NetWorkFeature__Group__3__Impl2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__0__Impl_in_rule__ColorFeature__Group__02553 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__1_in_rule__ColorFeature__Group__02556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__NameAssignment_0_in_rule__ColorFeature__Group__0__Impl2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__1__Impl_in_rule__ColorFeature__Group__12613 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__2_in_rule__ColorFeature__Group__12616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ColorFeature__Group__1__Impl2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__2__Impl_in_rule__ColorFeature__Group__22675 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__3_in_rule__ColorFeature__Group__22678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__ValueAssignment_2_in_rule__ColorFeature__Group__2__Impl2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__3__Impl_in_rule__ColorFeature__Group__32735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ColorFeature__Group__3__Impl2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElements_in_rule__Aml__ElementsAssignment2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperNames_in_rule__SuperEntity__NameAssignment2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperEntity_in_rule__Entity__SuperTypeAssignment_2_12900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_rule__Entity__ColorFeatureAssignment_42931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNetWorkFeature_in_rule__Entity__NetworkFeatureAssignment_52962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLengthFeature_in_rule__Entity__LengthFeatureAssignment_62993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_73024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_03055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__ValueAssignment_23086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LengthFeature__NameAssignment_03122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__LengthFeature__ValueAssignment_23161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__NetWorkFeature__NameAssignment_03197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NetWorkFeature__ValueAssignment_23236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ColorFeature__NameAssignment_03272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__ColorFeature__ValueAssignment_23311 = new BitSet(new long[]{0x0000000000000002L});

}