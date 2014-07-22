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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Red'", "'Black'", "'White'", "'Grey'", "'Green'", "'{'", "'}'", "'='", "','", "'rule'", "'extends'", "'puid'", "'.'", "';'", "'Max'", "'ProductPUIDs'", "'TargetGroup'", "'formFactor'", "'speed'", "'size'", "'type'", "'length'", "'network'", "'color'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
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

                if ( (LA1_0==RULE_ID||LA1_0==20||LA1_0==22) ) {
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


    // $ANTLR start "entryRuleMinMax"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:124:1: entryRuleMinMax : ruleMinMax EOF ;
    public final void entryRuleMinMax() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:125:1: ( ruleMinMax EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:126:1: ruleMinMax EOF
            {
             before(grammarAccess.getMinMaxRule()); 
            pushFollow(FOLLOW_ruleMinMax_in_entryRuleMinMax191);
            ruleMinMax();

            state._fsp--;

             after(grammarAccess.getMinMaxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinMax198); 

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
    // $ANTLR end "entryRuleMinMax"


    // $ANTLR start "ruleMinMax"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:133:1: ruleMinMax : ( ( rule__MinMax__Group__0 ) ) ;
    public final void ruleMinMax() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:137:2: ( ( ( rule__MinMax__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:138:1: ( ( rule__MinMax__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:138:1: ( ( rule__MinMax__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:139:1: ( rule__MinMax__Group__0 )
            {
             before(grammarAccess.getMinMaxAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:140:1: ( rule__MinMax__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:140:2: rule__MinMax__Group__0
            {
            pushFollow(FOLLOW_rule__MinMax__Group__0_in_ruleMinMax224);
            rule__MinMax__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinMax"


    // $ANTLR start "entryRuleMaxFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:152:1: entryRuleMaxFeature : ruleMaxFeature EOF ;
    public final void entryRuleMaxFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:153:1: ( ruleMaxFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:154:1: ruleMaxFeature EOF
            {
             before(grammarAccess.getMaxFeatureRule()); 
            pushFollow(FOLLOW_ruleMaxFeature_in_entryRuleMaxFeature251);
            ruleMaxFeature();

            state._fsp--;

             after(grammarAccess.getMaxFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxFeature258); 

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
    // $ANTLR end "entryRuleMaxFeature"


    // $ANTLR start "ruleMaxFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:161:1: ruleMaxFeature : ( ( rule__MaxFeature__Group__0 ) ) ;
    public final void ruleMaxFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:165:2: ( ( ( rule__MaxFeature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:166:1: ( ( rule__MaxFeature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:166:1: ( ( rule__MaxFeature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:167:1: ( rule__MaxFeature__Group__0 )
            {
             before(grammarAccess.getMaxFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:168:1: ( rule__MaxFeature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:168:2: rule__MaxFeature__Group__0
            {
            pushFollow(FOLLOW_rule__MaxFeature__Group__0_in_ruleMaxFeature284);
            rule__MaxFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaxFeature"


    // $ANTLR start "entryRuleProductPUIDFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:180:1: entryRuleProductPUIDFeature : ruleProductPUIDFeature EOF ;
    public final void entryRuleProductPUIDFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:181:1: ( ruleProductPUIDFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:182:1: ruleProductPUIDFeature EOF
            {
             before(grammarAccess.getProductPUIDFeatureRule()); 
            pushFollow(FOLLOW_ruleProductPUIDFeature_in_entryRuleProductPUIDFeature311);
            ruleProductPUIDFeature();

            state._fsp--;

             after(grammarAccess.getProductPUIDFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProductPUIDFeature318); 

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
    // $ANTLR end "entryRuleProductPUIDFeature"


    // $ANTLR start "ruleProductPUIDFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:189:1: ruleProductPUIDFeature : ( ( rule__ProductPUIDFeature__Group__0 ) ) ;
    public final void ruleProductPUIDFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:193:2: ( ( ( rule__ProductPUIDFeature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:194:1: ( ( rule__ProductPUIDFeature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:194:1: ( ( rule__ProductPUIDFeature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:195:1: ( rule__ProductPUIDFeature__Group__0 )
            {
             before(grammarAccess.getProductPUIDFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:196:1: ( rule__ProductPUIDFeature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:196:2: rule__ProductPUIDFeature__Group__0
            {
            pushFollow(FOLLOW_rule__ProductPUIDFeature__Group__0_in_ruleProductPUIDFeature344);
            rule__ProductPUIDFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductPUIDFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProductPUIDFeature"


    // $ANTLR start "entryRuleTargetGroupFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:208:1: entryRuleTargetGroupFeature : ruleTargetGroupFeature EOF ;
    public final void entryRuleTargetGroupFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:209:1: ( ruleTargetGroupFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:210:1: ruleTargetGroupFeature EOF
            {
             before(grammarAccess.getTargetGroupFeatureRule()); 
            pushFollow(FOLLOW_ruleTargetGroupFeature_in_entryRuleTargetGroupFeature371);
            ruleTargetGroupFeature();

            state._fsp--;

             after(grammarAccess.getTargetGroupFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetGroupFeature378); 

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
    // $ANTLR end "entryRuleTargetGroupFeature"


    // $ANTLR start "ruleTargetGroupFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:217:1: ruleTargetGroupFeature : ( ( rule__TargetGroupFeature__Group__0 ) ) ;
    public final void ruleTargetGroupFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:221:2: ( ( ( rule__TargetGroupFeature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:222:1: ( ( rule__TargetGroupFeature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:222:1: ( ( rule__TargetGroupFeature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:223:1: ( rule__TargetGroupFeature__Group__0 )
            {
             before(grammarAccess.getTargetGroupFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:224:1: ( rule__TargetGroupFeature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:224:2: rule__TargetGroupFeature__Group__0
            {
            pushFollow(FOLLOW_rule__TargetGroupFeature__Group__0_in_ruleTargetGroupFeature404);
            rule__TargetGroupFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetGroupFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetGroupFeature"


    // $ANTLR start "entryRuleDrive"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:236:1: entryRuleDrive : ruleDrive EOF ;
    public final void entryRuleDrive() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:237:1: ( ruleDrive EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:238:1: ruleDrive EOF
            {
             before(grammarAccess.getDriveRule()); 
            pushFollow(FOLLOW_ruleDrive_in_entryRuleDrive431);
            ruleDrive();

            state._fsp--;

             after(grammarAccess.getDriveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDrive438); 

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
    // $ANTLR end "entryRuleDrive"


    // $ANTLR start "ruleDrive"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:245:1: ruleDrive : ( ( rule__Drive__Group__0 ) ) ;
    public final void ruleDrive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:249:2: ( ( ( rule__Drive__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:250:1: ( ( rule__Drive__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:250:1: ( ( rule__Drive__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:251:1: ( rule__Drive__Group__0 )
            {
             before(grammarAccess.getDriveAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:252:1: ( rule__Drive__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:252:2: rule__Drive__Group__0
            {
            pushFollow(FOLLOW_rule__Drive__Group__0_in_ruleDrive464);
            rule__Drive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDriveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDrive"


    // $ANTLR start "entryRuleFormFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:264:1: entryRuleFormFeature : ruleFormFeature EOF ;
    public final void entryRuleFormFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:265:1: ( ruleFormFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:266:1: ruleFormFeature EOF
            {
             before(grammarAccess.getFormFeatureRule()); 
            pushFollow(FOLLOW_ruleFormFeature_in_entryRuleFormFeature491);
            ruleFormFeature();

            state._fsp--;

             after(grammarAccess.getFormFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormFeature498); 

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
    // $ANTLR end "entryRuleFormFeature"


    // $ANTLR start "ruleFormFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:273:1: ruleFormFeature : ( ( rule__FormFeature__Group__0 ) ) ;
    public final void ruleFormFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:277:2: ( ( ( rule__FormFeature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:278:1: ( ( rule__FormFeature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:278:1: ( ( rule__FormFeature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:279:1: ( rule__FormFeature__Group__0 )
            {
             before(grammarAccess.getFormFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:280:1: ( rule__FormFeature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:280:2: rule__FormFeature__Group__0
            {
            pushFollow(FOLLOW_rule__FormFeature__Group__0_in_ruleFormFeature524);
            rule__FormFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormFeature"


    // $ANTLR start "entryRuleSpeedFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:292:1: entryRuleSpeedFeature : ruleSpeedFeature EOF ;
    public final void entryRuleSpeedFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:293:1: ( ruleSpeedFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:294:1: ruleSpeedFeature EOF
            {
             before(grammarAccess.getSpeedFeatureRule()); 
            pushFollow(FOLLOW_ruleSpeedFeature_in_entryRuleSpeedFeature551);
            ruleSpeedFeature();

            state._fsp--;

             after(grammarAccess.getSpeedFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpeedFeature558); 

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
    // $ANTLR end "entryRuleSpeedFeature"


    // $ANTLR start "ruleSpeedFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:301:1: ruleSpeedFeature : ( ( rule__SpeedFeature__Group__0 ) ) ;
    public final void ruleSpeedFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:305:2: ( ( ( rule__SpeedFeature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:306:1: ( ( rule__SpeedFeature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:306:1: ( ( rule__SpeedFeature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:307:1: ( rule__SpeedFeature__Group__0 )
            {
             before(grammarAccess.getSpeedFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:308:1: ( rule__SpeedFeature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:308:2: rule__SpeedFeature__Group__0
            {
            pushFollow(FOLLOW_rule__SpeedFeature__Group__0_in_ruleSpeedFeature584);
            rule__SpeedFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpeedFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpeedFeature"


    // $ANTLR start "entryRuleSizeFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:320:1: entryRuleSizeFeature : ruleSizeFeature EOF ;
    public final void entryRuleSizeFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:321:1: ( ruleSizeFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:322:1: ruleSizeFeature EOF
            {
             before(grammarAccess.getSizeFeatureRule()); 
            pushFollow(FOLLOW_ruleSizeFeature_in_entryRuleSizeFeature611);
            ruleSizeFeature();

            state._fsp--;

             after(grammarAccess.getSizeFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSizeFeature618); 

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
    // $ANTLR end "entryRuleSizeFeature"


    // $ANTLR start "ruleSizeFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:329:1: ruleSizeFeature : ( ( rule__SizeFeature__Group__0 ) ) ;
    public final void ruleSizeFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:333:2: ( ( ( rule__SizeFeature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:334:1: ( ( rule__SizeFeature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:334:1: ( ( rule__SizeFeature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:335:1: ( rule__SizeFeature__Group__0 )
            {
             before(grammarAccess.getSizeFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:336:1: ( rule__SizeFeature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:336:2: rule__SizeFeature__Group__0
            {
            pushFollow(FOLLOW_rule__SizeFeature__Group__0_in_ruleSizeFeature644);
            rule__SizeFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSizeFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSizeFeature"


    // $ANTLR start "entryRuleTypeFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:348:1: entryRuleTypeFeature : ruleTypeFeature EOF ;
    public final void entryRuleTypeFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:349:1: ( ruleTypeFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:350:1: ruleTypeFeature EOF
            {
             before(grammarAccess.getTypeFeatureRule()); 
            pushFollow(FOLLOW_ruleTypeFeature_in_entryRuleTypeFeature671);
            ruleTypeFeature();

            state._fsp--;

             after(grammarAccess.getTypeFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeFeature678); 

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
    // $ANTLR end "entryRuleTypeFeature"


    // $ANTLR start "ruleTypeFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:357:1: ruleTypeFeature : ( ( rule__TypeFeature__Group__0 ) ) ;
    public final void ruleTypeFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:361:2: ( ( ( rule__TypeFeature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:362:1: ( ( rule__TypeFeature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:362:1: ( ( rule__TypeFeature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:363:1: ( rule__TypeFeature__Group__0 )
            {
             before(grammarAccess.getTypeFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:364:1: ( rule__TypeFeature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:364:2: rule__TypeFeature__Group__0
            {
            pushFollow(FOLLOW_rule__TypeFeature__Group__0_in_ruleTypeFeature704);
            rule__TypeFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeFeature"


    // $ANTLR start "entryRuleCable"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:376:1: entryRuleCable : ruleCable EOF ;
    public final void entryRuleCable() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:377:1: ( ruleCable EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:378:1: ruleCable EOF
            {
             before(grammarAccess.getCableRule()); 
            pushFollow(FOLLOW_ruleCable_in_entryRuleCable731);
            ruleCable();

            state._fsp--;

             after(grammarAccess.getCableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCable738); 

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
    // $ANTLR end "entryRuleCable"


    // $ANTLR start "ruleCable"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:385:1: ruleCable : ( ( rule__Cable__Group__0 ) ) ;
    public final void ruleCable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:389:2: ( ( ( rule__Cable__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:390:1: ( ( rule__Cable__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:390:1: ( ( rule__Cable__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:391:1: ( rule__Cable__Group__0 )
            {
             before(grammarAccess.getCableAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:392:1: ( rule__Cable__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:392:2: rule__Cable__Group__0
            {
            pushFollow(FOLLOW_rule__Cable__Group__0_in_ruleCable764);
            rule__Cable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCable"


    // $ANTLR start "entryRulePriceRule"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:404:1: entryRulePriceRule : rulePriceRule EOF ;
    public final void entryRulePriceRule() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:405:1: ( rulePriceRule EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:406:1: rulePriceRule EOF
            {
             before(grammarAccess.getPriceRuleRule()); 
            pushFollow(FOLLOW_rulePriceRule_in_entryRulePriceRule791);
            rulePriceRule();

            state._fsp--;

             after(grammarAccess.getPriceRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePriceRule798); 

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
    // $ANTLR end "entryRulePriceRule"


    // $ANTLR start "rulePriceRule"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:413:1: rulePriceRule : ( ( rule__PriceRule__Group__0 ) ) ;
    public final void rulePriceRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:417:2: ( ( ( rule__PriceRule__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:418:1: ( ( rule__PriceRule__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:418:1: ( ( rule__PriceRule__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:419:1: ( rule__PriceRule__Group__0 )
            {
             before(grammarAccess.getPriceRuleAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:420:1: ( rule__PriceRule__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:420:2: rule__PriceRule__Group__0
            {
            pushFollow(FOLLOW_rule__PriceRule__Group__0_in_rulePriceRule824);
            rule__PriceRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPriceRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePriceRule"


    // $ANTLR start "entryRuleEntity"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:432:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:433:1: ( ruleEntity EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:434:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity851);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity858); 

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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:441:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:445:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:446:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:446:1: ( ( rule__Entity__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:447:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:448:1: ( rule__Entity__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:448:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity884);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:460:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:461:1: ( ruleQualifiedName EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:462:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName911);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName918); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:469:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:473:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:474:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:474:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:475:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:476:1: ( rule__QualifiedName__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:476:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName944);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleFeature"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:488:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:489:1: ( ruleFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:490:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature971);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature978); 

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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:497:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:501:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:502:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:502:1: ( ( rule__Feature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:503:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:504:1: ( rule__Feature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:504:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature1004);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:516:1: entryRuleLengthFeature : ruleLengthFeature EOF ;
    public final void entryRuleLengthFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:517:1: ( ruleLengthFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:518:1: ruleLengthFeature EOF
            {
             before(grammarAccess.getLengthFeatureRule()); 
            pushFollow(FOLLOW_ruleLengthFeature_in_entryRuleLengthFeature1031);
            ruleLengthFeature();

            state._fsp--;

             after(grammarAccess.getLengthFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLengthFeature1038); 

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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:525:1: ruleLengthFeature : ( ( rule__LengthFeature__Group__0 ) ) ;
    public final void ruleLengthFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:529:2: ( ( ( rule__LengthFeature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:530:1: ( ( rule__LengthFeature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:530:1: ( ( rule__LengthFeature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:531:1: ( rule__LengthFeature__Group__0 )
            {
             before(grammarAccess.getLengthFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:532:1: ( rule__LengthFeature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:532:2: rule__LengthFeature__Group__0
            {
            pushFollow(FOLLOW_rule__LengthFeature__Group__0_in_ruleLengthFeature1064);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:544:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:545:1: ( ruleDOUBLE EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:546:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE1091);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE1098); 

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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:553:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:557:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:558:1: ( ( rule__DOUBLE__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:558:1: ( ( rule__DOUBLE__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:559:1: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:560:1: ( rule__DOUBLE__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:560:2: rule__DOUBLE__Group__0
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE1124);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:572:1: entryRuleNetWorkFeature : ruleNetWorkFeature EOF ;
    public final void entryRuleNetWorkFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:573:1: ( ruleNetWorkFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:574:1: ruleNetWorkFeature EOF
            {
             before(grammarAccess.getNetWorkFeatureRule()); 
            pushFollow(FOLLOW_ruleNetWorkFeature_in_entryRuleNetWorkFeature1151);
            ruleNetWorkFeature();

            state._fsp--;

             after(grammarAccess.getNetWorkFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNetWorkFeature1158); 

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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:581:1: ruleNetWorkFeature : ( ( rule__NetWorkFeature__Group__0 ) ) ;
    public final void ruleNetWorkFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:585:2: ( ( ( rule__NetWorkFeature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:586:1: ( ( rule__NetWorkFeature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:586:1: ( ( rule__NetWorkFeature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:587:1: ( rule__NetWorkFeature__Group__0 )
            {
             before(grammarAccess.getNetWorkFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:588:1: ( rule__NetWorkFeature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:588:2: rule__NetWorkFeature__Group__0
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__0_in_ruleNetWorkFeature1184);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:600:1: entryRuleColorFeature : ruleColorFeature EOF ;
    public final void entryRuleColorFeature() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:601:1: ( ruleColorFeature EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:602:1: ruleColorFeature EOF
            {
             before(grammarAccess.getColorFeatureRule()); 
            pushFollow(FOLLOW_ruleColorFeature_in_entryRuleColorFeature1211);
            ruleColorFeature();

            state._fsp--;

             after(grammarAccess.getColorFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorFeature1218); 

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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:609:1: ruleColorFeature : ( ( rule__ColorFeature__Group__0 ) ) ;
    public final void ruleColorFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:613:2: ( ( ( rule__ColorFeature__Group__0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:614:1: ( ( rule__ColorFeature__Group__0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:614:1: ( ( rule__ColorFeature__Group__0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:615:1: ( rule__ColorFeature__Group__0 )
            {
             before(grammarAccess.getColorFeatureAccess().getGroup()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:616:1: ( rule__ColorFeature__Group__0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:616:2: rule__ColorFeature__Group__0
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__0_in_ruleColorFeature1244);
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


    // $ANTLR start "entryRuleSuperEntity"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:628:1: entryRuleSuperEntity : ruleSuperEntity EOF ;
    public final void entryRuleSuperEntity() throws RecognitionException {
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:629:1: ( ruleSuperEntity EOF )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:630:1: ruleSuperEntity EOF
            {
             before(grammarAccess.getSuperEntityRule()); 
            pushFollow(FOLLOW_ruleSuperEntity_in_entryRuleSuperEntity1271);
            ruleSuperEntity();

            state._fsp--;

             after(grammarAccess.getSuperEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuperEntity1278); 

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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:637:1: ruleSuperEntity : ( ( rule__SuperEntity__Alternatives ) ) ;
    public final void ruleSuperEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:641:2: ( ( ( rule__SuperEntity__Alternatives ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:642:1: ( ( rule__SuperEntity__Alternatives ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:642:1: ( ( rule__SuperEntity__Alternatives ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:643:1: ( rule__SuperEntity__Alternatives )
            {
             before(grammarAccess.getSuperEntityAccess().getAlternatives()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:644:1: ( rule__SuperEntity__Alternatives )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:644:2: rule__SuperEntity__Alternatives
            {
            pushFollow(FOLLOW_rule__SuperEntity__Alternatives_in_ruleSuperEntity1304);
            rule__SuperEntity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSuperEntityAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "ruleColor"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:657:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:661:1: ( ( ( rule__Color__Alternatives ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:662:1: ( ( rule__Color__Alternatives ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:662:1: ( ( rule__Color__Alternatives ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:663:1: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:664:1: ( rule__Color__Alternatives )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:664:2: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_rule__Color__Alternatives_in_ruleColor1341);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:675:1: rule__AbstractElements__Alternatives : ( ( ruleEntity ) | ( rulePriceRule ) | ( ruleSuperEntity ) | ( ruleMinMax ) );
    public final void rule__AbstractElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:679:1: ( ( ruleEntity ) | ( rulePriceRule ) | ( ruleSuperEntity ) | ( ruleMinMax ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==16) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==31||LA2_4==34) ) {
                        alt2=3;
                    }
                    else if ( (LA2_4==27) ) {
                        alt2=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:680:1: ( ruleEntity )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:680:1: ( ruleEntity )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:681:1: ruleEntity
                    {
                     before(grammarAccess.getAbstractElementsAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__AbstractElements__Alternatives1376);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementsAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:686:6: ( rulePriceRule )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:686:6: ( rulePriceRule )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:687:1: rulePriceRule
                    {
                     before(grammarAccess.getAbstractElementsAccess().getPriceRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePriceRule_in_rule__AbstractElements__Alternatives1393);
                    rulePriceRule();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementsAccess().getPriceRuleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:692:6: ( ruleSuperEntity )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:692:6: ( ruleSuperEntity )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:693:1: ruleSuperEntity
                    {
                     before(grammarAccess.getAbstractElementsAccess().getSuperEntityParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSuperEntity_in_rule__AbstractElements__Alternatives1410);
                    ruleSuperEntity();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementsAccess().getSuperEntityParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:698:6: ( ruleMinMax )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:698:6: ( ruleMinMax )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:699:1: ruleMinMax
                    {
                     before(grammarAccess.getAbstractElementsAccess().getMinMaxParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleMinMax_in_rule__AbstractElements__Alternatives1427);
                    ruleMinMax();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementsAccess().getMinMaxParserRuleCall_3()); 

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


    // $ANTLR start "rule__SuperEntity__Alternatives"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:709:1: rule__SuperEntity__Alternatives : ( ( ruleCable ) | ( ruleDrive ) );
    public final void rule__SuperEntity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:713:1: ( ( ruleCable ) | ( ruleDrive ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==16) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==34) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==31) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:714:1: ( ruleCable )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:714:1: ( ruleCable )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:715:1: ruleCable
                    {
                     before(grammarAccess.getSuperEntityAccess().getCableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCable_in_rule__SuperEntity__Alternatives1459);
                    ruleCable();

                    state._fsp--;

                     after(grammarAccess.getSuperEntityAccess().getCableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:720:6: ( ruleDrive )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:720:6: ( ruleDrive )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:721:1: ruleDrive
                    {
                     before(grammarAccess.getSuperEntityAccess().getDriveParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDrive_in_rule__SuperEntity__Alternatives1476);
                    ruleDrive();

                    state._fsp--;

                     after(grammarAccess.getSuperEntityAccess().getDriveParserRuleCall_1()); 

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
    // $ANTLR end "rule__SuperEntity__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:731:1: rule__Color__Alternatives : ( ( ( 'Red' ) ) | ( ( 'Black' ) ) | ( ( 'White' ) ) | ( ( 'Grey' ) ) | ( ( 'Green' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:735:1: ( ( ( 'Red' ) ) | ( ( 'Black' ) ) | ( ( 'White' ) ) | ( ( 'Grey' ) ) | ( ( 'Green' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
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
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:736:1: ( ( 'Red' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:736:1: ( ( 'Red' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:737:1: ( 'Red' )
                    {
                     before(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:738:1: ( 'Red' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:738:3: 'Red'
                    {
                    match(input,11,FOLLOW_11_in_rule__Color__Alternatives1509); 

                    }

                     after(grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:743:6: ( ( 'Black' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:743:6: ( ( 'Black' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:744:1: ( 'Black' )
                    {
                     before(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:745:1: ( 'Black' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:745:3: 'Black'
                    {
                    match(input,12,FOLLOW_12_in_rule__Color__Alternatives1530); 

                    }

                     after(grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:750:6: ( ( 'White' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:750:6: ( ( 'White' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:751:1: ( 'White' )
                    {
                     before(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:752:1: ( 'White' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:752:3: 'White'
                    {
                    match(input,13,FOLLOW_13_in_rule__Color__Alternatives1551); 

                    }

                     after(grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:757:6: ( ( 'Grey' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:757:6: ( ( 'Grey' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:758:1: ( 'Grey' )
                    {
                     before(grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:759:1: ( 'Grey' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:759:3: 'Grey'
                    {
                    match(input,14,FOLLOW_14_in_rule__Color__Alternatives1572); 

                    }

                     after(grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:764:6: ( ( 'Green' ) )
                    {
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:764:6: ( ( 'Green' ) )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:765:1: ( 'Green' )
                    {
                     before(grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_4()); 
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:766:1: ( 'Green' )
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:766:3: 'Green'
                    {
                    match(input,15,FOLLOW_15_in_rule__Color__Alternatives1593); 

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


    // $ANTLR start "rule__MinMax__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:778:1: rule__MinMax__Group__0 : rule__MinMax__Group__0__Impl rule__MinMax__Group__1 ;
    public final void rule__MinMax__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:782:1: ( rule__MinMax__Group__0__Impl rule__MinMax__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:783:2: rule__MinMax__Group__0__Impl rule__MinMax__Group__1
            {
            pushFollow(FOLLOW_rule__MinMax__Group__0__Impl_in_rule__MinMax__Group__01626);
            rule__MinMax__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MinMax__Group__1_in_rule__MinMax__Group__01629);
            rule__MinMax__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMax__Group__0"


    // $ANTLR start "rule__MinMax__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:790:1: rule__MinMax__Group__0__Impl : ( ( rule__MinMax__NameAssignment_0 ) ) ;
    public final void rule__MinMax__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:794:1: ( ( ( rule__MinMax__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:795:1: ( ( rule__MinMax__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:795:1: ( ( rule__MinMax__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:796:1: ( rule__MinMax__NameAssignment_0 )
            {
             before(grammarAccess.getMinMaxAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:797:1: ( rule__MinMax__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:797:2: rule__MinMax__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MinMax__NameAssignment_0_in_rule__MinMax__Group__0__Impl1656);
            rule__MinMax__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMax__Group__0__Impl"


    // $ANTLR start "rule__MinMax__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:807:1: rule__MinMax__Group__1 : rule__MinMax__Group__1__Impl rule__MinMax__Group__2 ;
    public final void rule__MinMax__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:811:1: ( rule__MinMax__Group__1__Impl rule__MinMax__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:812:2: rule__MinMax__Group__1__Impl rule__MinMax__Group__2
            {
            pushFollow(FOLLOW_rule__MinMax__Group__1__Impl_in_rule__MinMax__Group__11686);
            rule__MinMax__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MinMax__Group__2_in_rule__MinMax__Group__11689);
            rule__MinMax__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMax__Group__1"


    // $ANTLR start "rule__MinMax__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:819:1: rule__MinMax__Group__1__Impl : ( '{' ) ;
    public final void rule__MinMax__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:823:1: ( ( '{' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:824:1: ( '{' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:824:1: ( '{' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:825:1: '{'
            {
             before(grammarAccess.getMinMaxAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__MinMax__Group__1__Impl1717); 
             after(grammarAccess.getMinMaxAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMax__Group__1__Impl"


    // $ANTLR start "rule__MinMax__Group__2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:838:1: rule__MinMax__Group__2 : rule__MinMax__Group__2__Impl rule__MinMax__Group__3 ;
    public final void rule__MinMax__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:842:1: ( rule__MinMax__Group__2__Impl rule__MinMax__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:843:2: rule__MinMax__Group__2__Impl rule__MinMax__Group__3
            {
            pushFollow(FOLLOW_rule__MinMax__Group__2__Impl_in_rule__MinMax__Group__21748);
            rule__MinMax__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MinMax__Group__3_in_rule__MinMax__Group__21751);
            rule__MinMax__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMax__Group__2"


    // $ANTLR start "rule__MinMax__Group__2__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:850:1: rule__MinMax__Group__2__Impl : ( ( rule__MinMax__TargetGroupFeatureAssignment_2 ) ) ;
    public final void rule__MinMax__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:854:1: ( ( ( rule__MinMax__TargetGroupFeatureAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:855:1: ( ( rule__MinMax__TargetGroupFeatureAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:855:1: ( ( rule__MinMax__TargetGroupFeatureAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:856:1: ( rule__MinMax__TargetGroupFeatureAssignment_2 )
            {
             before(grammarAccess.getMinMaxAccess().getTargetGroupFeatureAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:857:1: ( rule__MinMax__TargetGroupFeatureAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:857:2: rule__MinMax__TargetGroupFeatureAssignment_2
            {
            pushFollow(FOLLOW_rule__MinMax__TargetGroupFeatureAssignment_2_in_rule__MinMax__Group__2__Impl1778);
            rule__MinMax__TargetGroupFeatureAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxAccess().getTargetGroupFeatureAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMax__Group__2__Impl"


    // $ANTLR start "rule__MinMax__Group__3"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:867:1: rule__MinMax__Group__3 : rule__MinMax__Group__3__Impl rule__MinMax__Group__4 ;
    public final void rule__MinMax__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:871:1: ( rule__MinMax__Group__3__Impl rule__MinMax__Group__4 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:872:2: rule__MinMax__Group__3__Impl rule__MinMax__Group__4
            {
            pushFollow(FOLLOW_rule__MinMax__Group__3__Impl_in_rule__MinMax__Group__31808);
            rule__MinMax__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MinMax__Group__4_in_rule__MinMax__Group__31811);
            rule__MinMax__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMax__Group__3"


    // $ANTLR start "rule__MinMax__Group__3__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:879:1: rule__MinMax__Group__3__Impl : ( ( rule__MinMax__ProductPuidsFeatureAssignment_3 ) ) ;
    public final void rule__MinMax__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:883:1: ( ( ( rule__MinMax__ProductPuidsFeatureAssignment_3 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:884:1: ( ( rule__MinMax__ProductPuidsFeatureAssignment_3 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:884:1: ( ( rule__MinMax__ProductPuidsFeatureAssignment_3 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:885:1: ( rule__MinMax__ProductPuidsFeatureAssignment_3 )
            {
             before(grammarAccess.getMinMaxAccess().getProductPuidsFeatureAssignment_3()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:886:1: ( rule__MinMax__ProductPuidsFeatureAssignment_3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:886:2: rule__MinMax__ProductPuidsFeatureAssignment_3
            {
            pushFollow(FOLLOW_rule__MinMax__ProductPuidsFeatureAssignment_3_in_rule__MinMax__Group__3__Impl1838);
            rule__MinMax__ProductPuidsFeatureAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxAccess().getProductPuidsFeatureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMax__Group__3__Impl"


    // $ANTLR start "rule__MinMax__Group__4"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:896:1: rule__MinMax__Group__4 : rule__MinMax__Group__4__Impl rule__MinMax__Group__5 ;
    public final void rule__MinMax__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:900:1: ( rule__MinMax__Group__4__Impl rule__MinMax__Group__5 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:901:2: rule__MinMax__Group__4__Impl rule__MinMax__Group__5
            {
            pushFollow(FOLLOW_rule__MinMax__Group__4__Impl_in_rule__MinMax__Group__41868);
            rule__MinMax__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MinMax__Group__5_in_rule__MinMax__Group__41871);
            rule__MinMax__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMax__Group__4"


    // $ANTLR start "rule__MinMax__Group__4__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:908:1: rule__MinMax__Group__4__Impl : ( ( rule__MinMax__MaxFeatureAssignment_4 ) ) ;
    public final void rule__MinMax__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:912:1: ( ( ( rule__MinMax__MaxFeatureAssignment_4 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:913:1: ( ( rule__MinMax__MaxFeatureAssignment_4 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:913:1: ( ( rule__MinMax__MaxFeatureAssignment_4 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:914:1: ( rule__MinMax__MaxFeatureAssignment_4 )
            {
             before(grammarAccess.getMinMaxAccess().getMaxFeatureAssignment_4()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:915:1: ( rule__MinMax__MaxFeatureAssignment_4 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:915:2: rule__MinMax__MaxFeatureAssignment_4
            {
            pushFollow(FOLLOW_rule__MinMax__MaxFeatureAssignment_4_in_rule__MinMax__Group__4__Impl1898);
            rule__MinMax__MaxFeatureAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxAccess().getMaxFeatureAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMax__Group__4__Impl"


    // $ANTLR start "rule__MinMax__Group__5"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:925:1: rule__MinMax__Group__5 : rule__MinMax__Group__5__Impl ;
    public final void rule__MinMax__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:929:1: ( rule__MinMax__Group__5__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:930:2: rule__MinMax__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__MinMax__Group__5__Impl_in_rule__MinMax__Group__51928);
            rule__MinMax__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMax__Group__5"


    // $ANTLR start "rule__MinMax__Group__5__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:936:1: rule__MinMax__Group__5__Impl : ( '}' ) ;
    public final void rule__MinMax__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:940:1: ( ( '}' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:941:1: ( '}' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:941:1: ( '}' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:942:1: '}'
            {
             before(grammarAccess.getMinMaxAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__MinMax__Group__5__Impl1956); 
             after(grammarAccess.getMinMaxAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMax__Group__5__Impl"


    // $ANTLR start "rule__MaxFeature__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:967:1: rule__MaxFeature__Group__0 : rule__MaxFeature__Group__0__Impl rule__MaxFeature__Group__1 ;
    public final void rule__MaxFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:971:1: ( rule__MaxFeature__Group__0__Impl rule__MaxFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:972:2: rule__MaxFeature__Group__0__Impl rule__MaxFeature__Group__1
            {
            pushFollow(FOLLOW_rule__MaxFeature__Group__0__Impl_in_rule__MaxFeature__Group__01999);
            rule__MaxFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaxFeature__Group__1_in_rule__MaxFeature__Group__02002);
            rule__MaxFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFeature__Group__0"


    // $ANTLR start "rule__MaxFeature__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:979:1: rule__MaxFeature__Group__0__Impl : ( ( rule__MaxFeature__NameAssignment_0 ) ) ;
    public final void rule__MaxFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:983:1: ( ( ( rule__MaxFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:984:1: ( ( rule__MaxFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:984:1: ( ( rule__MaxFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:985:1: ( rule__MaxFeature__NameAssignment_0 )
            {
             before(grammarAccess.getMaxFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:986:1: ( rule__MaxFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:986:2: rule__MaxFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__MaxFeature__NameAssignment_0_in_rule__MaxFeature__Group__0__Impl2029);
            rule__MaxFeature__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMaxFeatureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFeature__Group__0__Impl"


    // $ANTLR start "rule__MaxFeature__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:996:1: rule__MaxFeature__Group__1 : rule__MaxFeature__Group__1__Impl rule__MaxFeature__Group__2 ;
    public final void rule__MaxFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1000:1: ( rule__MaxFeature__Group__1__Impl rule__MaxFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1001:2: rule__MaxFeature__Group__1__Impl rule__MaxFeature__Group__2
            {
            pushFollow(FOLLOW_rule__MaxFeature__Group__1__Impl_in_rule__MaxFeature__Group__12059);
            rule__MaxFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MaxFeature__Group__2_in_rule__MaxFeature__Group__12062);
            rule__MaxFeature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFeature__Group__1"


    // $ANTLR start "rule__MaxFeature__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1008:1: rule__MaxFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__MaxFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1012:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1013:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1013:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1014:1: '='
            {
             before(grammarAccess.getMaxFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__MaxFeature__Group__1__Impl2090); 
             after(grammarAccess.getMaxFeatureAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFeature__Group__1__Impl"


    // $ANTLR start "rule__MaxFeature__Group__2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1027:1: rule__MaxFeature__Group__2 : rule__MaxFeature__Group__2__Impl ;
    public final void rule__MaxFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1031:1: ( rule__MaxFeature__Group__2__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1032:2: rule__MaxFeature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MaxFeature__Group__2__Impl_in_rule__MaxFeature__Group__22121);
            rule__MaxFeature__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFeature__Group__2"


    // $ANTLR start "rule__MaxFeature__Group__2__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1038:1: rule__MaxFeature__Group__2__Impl : ( ( rule__MaxFeature__ValueAssignment_2 ) ) ;
    public final void rule__MaxFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1042:1: ( ( ( rule__MaxFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1043:1: ( ( rule__MaxFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1043:1: ( ( rule__MaxFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1044:1: ( rule__MaxFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getMaxFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1045:1: ( rule__MaxFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1045:2: rule__MaxFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__MaxFeature__ValueAssignment_2_in_rule__MaxFeature__Group__2__Impl2148);
            rule__MaxFeature__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMaxFeatureAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFeature__Group__2__Impl"


    // $ANTLR start "rule__ProductPUIDFeature__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1061:1: rule__ProductPUIDFeature__Group__0 : rule__ProductPUIDFeature__Group__0__Impl rule__ProductPUIDFeature__Group__1 ;
    public final void rule__ProductPUIDFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1065:1: ( rule__ProductPUIDFeature__Group__0__Impl rule__ProductPUIDFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1066:2: rule__ProductPUIDFeature__Group__0__Impl rule__ProductPUIDFeature__Group__1
            {
            pushFollow(FOLLOW_rule__ProductPUIDFeature__Group__0__Impl_in_rule__ProductPUIDFeature__Group__02184);
            rule__ProductPUIDFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProductPUIDFeature__Group__1_in_rule__ProductPUIDFeature__Group__02187);
            rule__ProductPUIDFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductPUIDFeature__Group__0"


    // $ANTLR start "rule__ProductPUIDFeature__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1073:1: rule__ProductPUIDFeature__Group__0__Impl : ( ( rule__ProductPUIDFeature__NameAssignment_0 ) ) ;
    public final void rule__ProductPUIDFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1077:1: ( ( ( rule__ProductPUIDFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1078:1: ( ( rule__ProductPUIDFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1078:1: ( ( rule__ProductPUIDFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1079:1: ( rule__ProductPUIDFeature__NameAssignment_0 )
            {
             before(grammarAccess.getProductPUIDFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1080:1: ( rule__ProductPUIDFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1080:2: rule__ProductPUIDFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ProductPUIDFeature__NameAssignment_0_in_rule__ProductPUIDFeature__Group__0__Impl2214);
            rule__ProductPUIDFeature__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProductPUIDFeatureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductPUIDFeature__Group__0__Impl"


    // $ANTLR start "rule__ProductPUIDFeature__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1090:1: rule__ProductPUIDFeature__Group__1 : rule__ProductPUIDFeature__Group__1__Impl rule__ProductPUIDFeature__Group__2 ;
    public final void rule__ProductPUIDFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1094:1: ( rule__ProductPUIDFeature__Group__1__Impl rule__ProductPUIDFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1095:2: rule__ProductPUIDFeature__Group__1__Impl rule__ProductPUIDFeature__Group__2
            {
            pushFollow(FOLLOW_rule__ProductPUIDFeature__Group__1__Impl_in_rule__ProductPUIDFeature__Group__12244);
            rule__ProductPUIDFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProductPUIDFeature__Group__2_in_rule__ProductPUIDFeature__Group__12247);
            rule__ProductPUIDFeature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductPUIDFeature__Group__1"


    // $ANTLR start "rule__ProductPUIDFeature__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1102:1: rule__ProductPUIDFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__ProductPUIDFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1106:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1107:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1107:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1108:1: '='
            {
             before(grammarAccess.getProductPUIDFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__ProductPUIDFeature__Group__1__Impl2275); 
             after(grammarAccess.getProductPUIDFeatureAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductPUIDFeature__Group__1__Impl"


    // $ANTLR start "rule__ProductPUIDFeature__Group__2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1121:1: rule__ProductPUIDFeature__Group__2 : rule__ProductPUIDFeature__Group__2__Impl rule__ProductPUIDFeature__Group__3 ;
    public final void rule__ProductPUIDFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1125:1: ( rule__ProductPUIDFeature__Group__2__Impl rule__ProductPUIDFeature__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1126:2: rule__ProductPUIDFeature__Group__2__Impl rule__ProductPUIDFeature__Group__3
            {
            pushFollow(FOLLOW_rule__ProductPUIDFeature__Group__2__Impl_in_rule__ProductPUIDFeature__Group__22306);
            rule__ProductPUIDFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProductPUIDFeature__Group__3_in_rule__ProductPUIDFeature__Group__22309);
            rule__ProductPUIDFeature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductPUIDFeature__Group__2"


    // $ANTLR start "rule__ProductPUIDFeature__Group__2__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1133:1: rule__ProductPUIDFeature__Group__2__Impl : ( ( rule__ProductPUIDFeature__ValuesAssignment_2 ) ) ;
    public final void rule__ProductPUIDFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1137:1: ( ( ( rule__ProductPUIDFeature__ValuesAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1138:1: ( ( rule__ProductPUIDFeature__ValuesAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1138:1: ( ( rule__ProductPUIDFeature__ValuesAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1139:1: ( rule__ProductPUIDFeature__ValuesAssignment_2 )
            {
             before(grammarAccess.getProductPUIDFeatureAccess().getValuesAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1140:1: ( rule__ProductPUIDFeature__ValuesAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1140:2: rule__ProductPUIDFeature__ValuesAssignment_2
            {
            pushFollow(FOLLOW_rule__ProductPUIDFeature__ValuesAssignment_2_in_rule__ProductPUIDFeature__Group__2__Impl2336);
            rule__ProductPUIDFeature__ValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProductPUIDFeatureAccess().getValuesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductPUIDFeature__Group__2__Impl"


    // $ANTLR start "rule__ProductPUIDFeature__Group__3"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1150:1: rule__ProductPUIDFeature__Group__3 : rule__ProductPUIDFeature__Group__3__Impl ;
    public final void rule__ProductPUIDFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1154:1: ( rule__ProductPUIDFeature__Group__3__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1155:2: rule__ProductPUIDFeature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ProductPUIDFeature__Group__3__Impl_in_rule__ProductPUIDFeature__Group__32366);
            rule__ProductPUIDFeature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductPUIDFeature__Group__3"


    // $ANTLR start "rule__ProductPUIDFeature__Group__3__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1161:1: rule__ProductPUIDFeature__Group__3__Impl : ( ( rule__ProductPUIDFeature__Group_3__0 )* ) ;
    public final void rule__ProductPUIDFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1165:1: ( ( ( rule__ProductPUIDFeature__Group_3__0 )* ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1166:1: ( ( rule__ProductPUIDFeature__Group_3__0 )* )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1166:1: ( ( rule__ProductPUIDFeature__Group_3__0 )* )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1167:1: ( rule__ProductPUIDFeature__Group_3__0 )*
            {
             before(grammarAccess.getProductPUIDFeatureAccess().getGroup_3()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1168:1: ( rule__ProductPUIDFeature__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1168:2: rule__ProductPUIDFeature__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ProductPUIDFeature__Group_3__0_in_rule__ProductPUIDFeature__Group__3__Impl2393);
            	    rule__ProductPUIDFeature__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProductPUIDFeatureAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductPUIDFeature__Group__3__Impl"


    // $ANTLR start "rule__ProductPUIDFeature__Group_3__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1186:1: rule__ProductPUIDFeature__Group_3__0 : rule__ProductPUIDFeature__Group_3__0__Impl rule__ProductPUIDFeature__Group_3__1 ;
    public final void rule__ProductPUIDFeature__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1190:1: ( rule__ProductPUIDFeature__Group_3__0__Impl rule__ProductPUIDFeature__Group_3__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1191:2: rule__ProductPUIDFeature__Group_3__0__Impl rule__ProductPUIDFeature__Group_3__1
            {
            pushFollow(FOLLOW_rule__ProductPUIDFeature__Group_3__0__Impl_in_rule__ProductPUIDFeature__Group_3__02432);
            rule__ProductPUIDFeature__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProductPUIDFeature__Group_3__1_in_rule__ProductPUIDFeature__Group_3__02435);
            rule__ProductPUIDFeature__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductPUIDFeature__Group_3__0"


    // $ANTLR start "rule__ProductPUIDFeature__Group_3__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1198:1: rule__ProductPUIDFeature__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ProductPUIDFeature__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1202:1: ( ( ',' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1203:1: ( ',' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1203:1: ( ',' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1204:1: ','
            {
             before(grammarAccess.getProductPUIDFeatureAccess().getCommaKeyword_3_0()); 
            match(input,19,FOLLOW_19_in_rule__ProductPUIDFeature__Group_3__0__Impl2463); 
             after(grammarAccess.getProductPUIDFeatureAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductPUIDFeature__Group_3__0__Impl"


    // $ANTLR start "rule__ProductPUIDFeature__Group_3__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1217:1: rule__ProductPUIDFeature__Group_3__1 : rule__ProductPUIDFeature__Group_3__1__Impl ;
    public final void rule__ProductPUIDFeature__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1221:1: ( rule__ProductPUIDFeature__Group_3__1__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1222:2: rule__ProductPUIDFeature__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ProductPUIDFeature__Group_3__1__Impl_in_rule__ProductPUIDFeature__Group_3__12494);
            rule__ProductPUIDFeature__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductPUIDFeature__Group_3__1"


    // $ANTLR start "rule__ProductPUIDFeature__Group_3__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1228:1: rule__ProductPUIDFeature__Group_3__1__Impl : ( ( rule__ProductPUIDFeature__ValuesAssignment_3_1 ) ) ;
    public final void rule__ProductPUIDFeature__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1232:1: ( ( ( rule__ProductPUIDFeature__ValuesAssignment_3_1 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1233:1: ( ( rule__ProductPUIDFeature__ValuesAssignment_3_1 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1233:1: ( ( rule__ProductPUIDFeature__ValuesAssignment_3_1 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1234:1: ( rule__ProductPUIDFeature__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getProductPUIDFeatureAccess().getValuesAssignment_3_1()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1235:1: ( rule__ProductPUIDFeature__ValuesAssignment_3_1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1235:2: rule__ProductPUIDFeature__ValuesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ProductPUIDFeature__ValuesAssignment_3_1_in_rule__ProductPUIDFeature__Group_3__1__Impl2521);
            rule__ProductPUIDFeature__ValuesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProductPUIDFeatureAccess().getValuesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductPUIDFeature__Group_3__1__Impl"


    // $ANTLR start "rule__TargetGroupFeature__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1249:1: rule__TargetGroupFeature__Group__0 : rule__TargetGroupFeature__Group__0__Impl rule__TargetGroupFeature__Group__1 ;
    public final void rule__TargetGroupFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1253:1: ( rule__TargetGroupFeature__Group__0__Impl rule__TargetGroupFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1254:2: rule__TargetGroupFeature__Group__0__Impl rule__TargetGroupFeature__Group__1
            {
            pushFollow(FOLLOW_rule__TargetGroupFeature__Group__0__Impl_in_rule__TargetGroupFeature__Group__02555);
            rule__TargetGroupFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetGroupFeature__Group__1_in_rule__TargetGroupFeature__Group__02558);
            rule__TargetGroupFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetGroupFeature__Group__0"


    // $ANTLR start "rule__TargetGroupFeature__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1261:1: rule__TargetGroupFeature__Group__0__Impl : ( ( rule__TargetGroupFeature__NameAssignment_0 ) ) ;
    public final void rule__TargetGroupFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1265:1: ( ( ( rule__TargetGroupFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1266:1: ( ( rule__TargetGroupFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1266:1: ( ( rule__TargetGroupFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1267:1: ( rule__TargetGroupFeature__NameAssignment_0 )
            {
             before(grammarAccess.getTargetGroupFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1268:1: ( rule__TargetGroupFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1268:2: rule__TargetGroupFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TargetGroupFeature__NameAssignment_0_in_rule__TargetGroupFeature__Group__0__Impl2585);
            rule__TargetGroupFeature__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTargetGroupFeatureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetGroupFeature__Group__0__Impl"


    // $ANTLR start "rule__TargetGroupFeature__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1278:1: rule__TargetGroupFeature__Group__1 : rule__TargetGroupFeature__Group__1__Impl rule__TargetGroupFeature__Group__2 ;
    public final void rule__TargetGroupFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1282:1: ( rule__TargetGroupFeature__Group__1__Impl rule__TargetGroupFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1283:2: rule__TargetGroupFeature__Group__1__Impl rule__TargetGroupFeature__Group__2
            {
            pushFollow(FOLLOW_rule__TargetGroupFeature__Group__1__Impl_in_rule__TargetGroupFeature__Group__12615);
            rule__TargetGroupFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TargetGroupFeature__Group__2_in_rule__TargetGroupFeature__Group__12618);
            rule__TargetGroupFeature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetGroupFeature__Group__1"


    // $ANTLR start "rule__TargetGroupFeature__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1290:1: rule__TargetGroupFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__TargetGroupFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1294:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1295:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1295:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1296:1: '='
            {
             before(grammarAccess.getTargetGroupFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__TargetGroupFeature__Group__1__Impl2646); 
             after(grammarAccess.getTargetGroupFeatureAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetGroupFeature__Group__1__Impl"


    // $ANTLR start "rule__TargetGroupFeature__Group__2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1309:1: rule__TargetGroupFeature__Group__2 : rule__TargetGroupFeature__Group__2__Impl ;
    public final void rule__TargetGroupFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1313:1: ( rule__TargetGroupFeature__Group__2__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1314:2: rule__TargetGroupFeature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TargetGroupFeature__Group__2__Impl_in_rule__TargetGroupFeature__Group__22677);
            rule__TargetGroupFeature__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetGroupFeature__Group__2"


    // $ANTLR start "rule__TargetGroupFeature__Group__2__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1320:1: rule__TargetGroupFeature__Group__2__Impl : ( ( rule__TargetGroupFeature__ValueAssignment_2 ) ) ;
    public final void rule__TargetGroupFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1324:1: ( ( ( rule__TargetGroupFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1325:1: ( ( rule__TargetGroupFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1325:1: ( ( rule__TargetGroupFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1326:1: ( rule__TargetGroupFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getTargetGroupFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1327:1: ( rule__TargetGroupFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1327:2: rule__TargetGroupFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__TargetGroupFeature__ValueAssignment_2_in_rule__TargetGroupFeature__Group__2__Impl2704);
            rule__TargetGroupFeature__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetGroupFeatureAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetGroupFeature__Group__2__Impl"


    // $ANTLR start "rule__Drive__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1343:1: rule__Drive__Group__0 : rule__Drive__Group__0__Impl rule__Drive__Group__1 ;
    public final void rule__Drive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1347:1: ( rule__Drive__Group__0__Impl rule__Drive__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1348:2: rule__Drive__Group__0__Impl rule__Drive__Group__1
            {
            pushFollow(FOLLOW_rule__Drive__Group__0__Impl_in_rule__Drive__Group__02740);
            rule__Drive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Drive__Group__1_in_rule__Drive__Group__02743);
            rule__Drive__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__Group__0"


    // $ANTLR start "rule__Drive__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1355:1: rule__Drive__Group__0__Impl : ( ( rule__Drive__NameAssignment_0 ) ) ;
    public final void rule__Drive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1359:1: ( ( ( rule__Drive__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1360:1: ( ( rule__Drive__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1360:1: ( ( rule__Drive__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1361:1: ( rule__Drive__NameAssignment_0 )
            {
             before(grammarAccess.getDriveAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1362:1: ( rule__Drive__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1362:2: rule__Drive__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Drive__NameAssignment_0_in_rule__Drive__Group__0__Impl2770);
            rule__Drive__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDriveAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__Group__0__Impl"


    // $ANTLR start "rule__Drive__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1372:1: rule__Drive__Group__1 : rule__Drive__Group__1__Impl rule__Drive__Group__2 ;
    public final void rule__Drive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1376:1: ( rule__Drive__Group__1__Impl rule__Drive__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1377:2: rule__Drive__Group__1__Impl rule__Drive__Group__2
            {
            pushFollow(FOLLOW_rule__Drive__Group__1__Impl_in_rule__Drive__Group__12800);
            rule__Drive__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Drive__Group__2_in_rule__Drive__Group__12803);
            rule__Drive__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__Group__1"


    // $ANTLR start "rule__Drive__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1384:1: rule__Drive__Group__1__Impl : ( '{' ) ;
    public final void rule__Drive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1388:1: ( ( '{' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1389:1: ( '{' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1389:1: ( '{' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1390:1: '{'
            {
             before(grammarAccess.getDriveAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Drive__Group__1__Impl2831); 
             after(grammarAccess.getDriveAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__Group__1__Impl"


    // $ANTLR start "rule__Drive__Group__2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1403:1: rule__Drive__Group__2 : rule__Drive__Group__2__Impl rule__Drive__Group__3 ;
    public final void rule__Drive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1407:1: ( rule__Drive__Group__2__Impl rule__Drive__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1408:2: rule__Drive__Group__2__Impl rule__Drive__Group__3
            {
            pushFollow(FOLLOW_rule__Drive__Group__2__Impl_in_rule__Drive__Group__22862);
            rule__Drive__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Drive__Group__3_in_rule__Drive__Group__22865);
            rule__Drive__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__Group__2"


    // $ANTLR start "rule__Drive__Group__2__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1415:1: rule__Drive__Group__2__Impl : ( ( rule__Drive__TypeFeatureAssignment_2 ) ) ;
    public final void rule__Drive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1419:1: ( ( ( rule__Drive__TypeFeatureAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1420:1: ( ( rule__Drive__TypeFeatureAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1420:1: ( ( rule__Drive__TypeFeatureAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1421:1: ( rule__Drive__TypeFeatureAssignment_2 )
            {
             before(grammarAccess.getDriveAccess().getTypeFeatureAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1422:1: ( rule__Drive__TypeFeatureAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1422:2: rule__Drive__TypeFeatureAssignment_2
            {
            pushFollow(FOLLOW_rule__Drive__TypeFeatureAssignment_2_in_rule__Drive__Group__2__Impl2892);
            rule__Drive__TypeFeatureAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDriveAccess().getTypeFeatureAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__Group__2__Impl"


    // $ANTLR start "rule__Drive__Group__3"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1432:1: rule__Drive__Group__3 : rule__Drive__Group__3__Impl rule__Drive__Group__4 ;
    public final void rule__Drive__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1436:1: ( rule__Drive__Group__3__Impl rule__Drive__Group__4 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1437:2: rule__Drive__Group__3__Impl rule__Drive__Group__4
            {
            pushFollow(FOLLOW_rule__Drive__Group__3__Impl_in_rule__Drive__Group__32922);
            rule__Drive__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Drive__Group__4_in_rule__Drive__Group__32925);
            rule__Drive__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__Group__3"


    // $ANTLR start "rule__Drive__Group__3__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1444:1: rule__Drive__Group__3__Impl : ( ( rule__Drive__SizeFeatureAssignment_3 ) ) ;
    public final void rule__Drive__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1448:1: ( ( ( rule__Drive__SizeFeatureAssignment_3 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1449:1: ( ( rule__Drive__SizeFeatureAssignment_3 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1449:1: ( ( rule__Drive__SizeFeatureAssignment_3 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1450:1: ( rule__Drive__SizeFeatureAssignment_3 )
            {
             before(grammarAccess.getDriveAccess().getSizeFeatureAssignment_3()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1451:1: ( rule__Drive__SizeFeatureAssignment_3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1451:2: rule__Drive__SizeFeatureAssignment_3
            {
            pushFollow(FOLLOW_rule__Drive__SizeFeatureAssignment_3_in_rule__Drive__Group__3__Impl2952);
            rule__Drive__SizeFeatureAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDriveAccess().getSizeFeatureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__Group__3__Impl"


    // $ANTLR start "rule__Drive__Group__4"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1461:1: rule__Drive__Group__4 : rule__Drive__Group__4__Impl rule__Drive__Group__5 ;
    public final void rule__Drive__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1465:1: ( rule__Drive__Group__4__Impl rule__Drive__Group__5 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1466:2: rule__Drive__Group__4__Impl rule__Drive__Group__5
            {
            pushFollow(FOLLOW_rule__Drive__Group__4__Impl_in_rule__Drive__Group__42982);
            rule__Drive__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Drive__Group__5_in_rule__Drive__Group__42985);
            rule__Drive__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__Group__4"


    // $ANTLR start "rule__Drive__Group__4__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1473:1: rule__Drive__Group__4__Impl : ( ( rule__Drive__SpeedFeatureAssignment_4 ) ) ;
    public final void rule__Drive__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1477:1: ( ( ( rule__Drive__SpeedFeatureAssignment_4 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1478:1: ( ( rule__Drive__SpeedFeatureAssignment_4 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1478:1: ( ( rule__Drive__SpeedFeatureAssignment_4 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1479:1: ( rule__Drive__SpeedFeatureAssignment_4 )
            {
             before(grammarAccess.getDriveAccess().getSpeedFeatureAssignment_4()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1480:1: ( rule__Drive__SpeedFeatureAssignment_4 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1480:2: rule__Drive__SpeedFeatureAssignment_4
            {
            pushFollow(FOLLOW_rule__Drive__SpeedFeatureAssignment_4_in_rule__Drive__Group__4__Impl3012);
            rule__Drive__SpeedFeatureAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDriveAccess().getSpeedFeatureAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__Group__4__Impl"


    // $ANTLR start "rule__Drive__Group__5"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1490:1: rule__Drive__Group__5 : rule__Drive__Group__5__Impl rule__Drive__Group__6 ;
    public final void rule__Drive__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1494:1: ( rule__Drive__Group__5__Impl rule__Drive__Group__6 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1495:2: rule__Drive__Group__5__Impl rule__Drive__Group__6
            {
            pushFollow(FOLLOW_rule__Drive__Group__5__Impl_in_rule__Drive__Group__53042);
            rule__Drive__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Drive__Group__6_in_rule__Drive__Group__53045);
            rule__Drive__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__Group__5"


    // $ANTLR start "rule__Drive__Group__5__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1502:1: rule__Drive__Group__5__Impl : ( ( rule__Drive__FormFeatureAssignment_5 ) ) ;
    public final void rule__Drive__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1506:1: ( ( ( rule__Drive__FormFeatureAssignment_5 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1507:1: ( ( rule__Drive__FormFeatureAssignment_5 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1507:1: ( ( rule__Drive__FormFeatureAssignment_5 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1508:1: ( rule__Drive__FormFeatureAssignment_5 )
            {
             before(grammarAccess.getDriveAccess().getFormFeatureAssignment_5()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1509:1: ( rule__Drive__FormFeatureAssignment_5 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1509:2: rule__Drive__FormFeatureAssignment_5
            {
            pushFollow(FOLLOW_rule__Drive__FormFeatureAssignment_5_in_rule__Drive__Group__5__Impl3072);
            rule__Drive__FormFeatureAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDriveAccess().getFormFeatureAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__Group__5__Impl"


    // $ANTLR start "rule__Drive__Group__6"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1519:1: rule__Drive__Group__6 : rule__Drive__Group__6__Impl ;
    public final void rule__Drive__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1523:1: ( rule__Drive__Group__6__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1524:2: rule__Drive__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Drive__Group__6__Impl_in_rule__Drive__Group__63102);
            rule__Drive__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__Group__6"


    // $ANTLR start "rule__Drive__Group__6__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1530:1: rule__Drive__Group__6__Impl : ( '}' ) ;
    public final void rule__Drive__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1534:1: ( ( '}' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1535:1: ( '}' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1535:1: ( '}' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1536:1: '}'
            {
             before(grammarAccess.getDriveAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Drive__Group__6__Impl3130); 
             after(grammarAccess.getDriveAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__Group__6__Impl"


    // $ANTLR start "rule__FormFeature__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1563:1: rule__FormFeature__Group__0 : rule__FormFeature__Group__0__Impl rule__FormFeature__Group__1 ;
    public final void rule__FormFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1567:1: ( rule__FormFeature__Group__0__Impl rule__FormFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1568:2: rule__FormFeature__Group__0__Impl rule__FormFeature__Group__1
            {
            pushFollow(FOLLOW_rule__FormFeature__Group__0__Impl_in_rule__FormFeature__Group__03175);
            rule__FormFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormFeature__Group__1_in_rule__FormFeature__Group__03178);
            rule__FormFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFeature__Group__0"


    // $ANTLR start "rule__FormFeature__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1575:1: rule__FormFeature__Group__0__Impl : ( ( rule__FormFeature__NameAssignment_0 ) ) ;
    public final void rule__FormFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1579:1: ( ( ( rule__FormFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1580:1: ( ( rule__FormFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1580:1: ( ( rule__FormFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1581:1: ( rule__FormFeature__NameAssignment_0 )
            {
             before(grammarAccess.getFormFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1582:1: ( rule__FormFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1582:2: rule__FormFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__FormFeature__NameAssignment_0_in_rule__FormFeature__Group__0__Impl3205);
            rule__FormFeature__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFormFeatureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFeature__Group__0__Impl"


    // $ANTLR start "rule__FormFeature__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1592:1: rule__FormFeature__Group__1 : rule__FormFeature__Group__1__Impl rule__FormFeature__Group__2 ;
    public final void rule__FormFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1596:1: ( rule__FormFeature__Group__1__Impl rule__FormFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1597:2: rule__FormFeature__Group__1__Impl rule__FormFeature__Group__2
            {
            pushFollow(FOLLOW_rule__FormFeature__Group__1__Impl_in_rule__FormFeature__Group__13235);
            rule__FormFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormFeature__Group__2_in_rule__FormFeature__Group__13238);
            rule__FormFeature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFeature__Group__1"


    // $ANTLR start "rule__FormFeature__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1604:1: rule__FormFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__FormFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1608:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1609:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1609:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1610:1: '='
            {
             before(grammarAccess.getFormFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__FormFeature__Group__1__Impl3266); 
             after(grammarAccess.getFormFeatureAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFeature__Group__1__Impl"


    // $ANTLR start "rule__FormFeature__Group__2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1623:1: rule__FormFeature__Group__2 : rule__FormFeature__Group__2__Impl ;
    public final void rule__FormFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1627:1: ( rule__FormFeature__Group__2__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1628:2: rule__FormFeature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FormFeature__Group__2__Impl_in_rule__FormFeature__Group__23297);
            rule__FormFeature__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFeature__Group__2"


    // $ANTLR start "rule__FormFeature__Group__2__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1634:1: rule__FormFeature__Group__2__Impl : ( ( rule__FormFeature__ValueAssignment_2 ) ) ;
    public final void rule__FormFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1638:1: ( ( ( rule__FormFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1639:1: ( ( rule__FormFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1639:1: ( ( rule__FormFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1640:1: ( rule__FormFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getFormFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1641:1: ( rule__FormFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1641:2: rule__FormFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__FormFeature__ValueAssignment_2_in_rule__FormFeature__Group__2__Impl3324);
            rule__FormFeature__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFormFeatureAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFeature__Group__2__Impl"


    // $ANTLR start "rule__SpeedFeature__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1657:1: rule__SpeedFeature__Group__0 : rule__SpeedFeature__Group__0__Impl rule__SpeedFeature__Group__1 ;
    public final void rule__SpeedFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1661:1: ( rule__SpeedFeature__Group__0__Impl rule__SpeedFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1662:2: rule__SpeedFeature__Group__0__Impl rule__SpeedFeature__Group__1
            {
            pushFollow(FOLLOW_rule__SpeedFeature__Group__0__Impl_in_rule__SpeedFeature__Group__03360);
            rule__SpeedFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpeedFeature__Group__1_in_rule__SpeedFeature__Group__03363);
            rule__SpeedFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedFeature__Group__0"


    // $ANTLR start "rule__SpeedFeature__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1669:1: rule__SpeedFeature__Group__0__Impl : ( ( rule__SpeedFeature__NameAssignment_0 ) ) ;
    public final void rule__SpeedFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1673:1: ( ( ( rule__SpeedFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1674:1: ( ( rule__SpeedFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1674:1: ( ( rule__SpeedFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1675:1: ( rule__SpeedFeature__NameAssignment_0 )
            {
             before(grammarAccess.getSpeedFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1676:1: ( rule__SpeedFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1676:2: rule__SpeedFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SpeedFeature__NameAssignment_0_in_rule__SpeedFeature__Group__0__Impl3390);
            rule__SpeedFeature__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSpeedFeatureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedFeature__Group__0__Impl"


    // $ANTLR start "rule__SpeedFeature__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1686:1: rule__SpeedFeature__Group__1 : rule__SpeedFeature__Group__1__Impl rule__SpeedFeature__Group__2 ;
    public final void rule__SpeedFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1690:1: ( rule__SpeedFeature__Group__1__Impl rule__SpeedFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1691:2: rule__SpeedFeature__Group__1__Impl rule__SpeedFeature__Group__2
            {
            pushFollow(FOLLOW_rule__SpeedFeature__Group__1__Impl_in_rule__SpeedFeature__Group__13420);
            rule__SpeedFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SpeedFeature__Group__2_in_rule__SpeedFeature__Group__13423);
            rule__SpeedFeature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedFeature__Group__1"


    // $ANTLR start "rule__SpeedFeature__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1698:1: rule__SpeedFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__SpeedFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1702:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1703:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1703:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1704:1: '='
            {
             before(grammarAccess.getSpeedFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__SpeedFeature__Group__1__Impl3451); 
             after(grammarAccess.getSpeedFeatureAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedFeature__Group__1__Impl"


    // $ANTLR start "rule__SpeedFeature__Group__2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1717:1: rule__SpeedFeature__Group__2 : rule__SpeedFeature__Group__2__Impl ;
    public final void rule__SpeedFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1721:1: ( rule__SpeedFeature__Group__2__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1722:2: rule__SpeedFeature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SpeedFeature__Group__2__Impl_in_rule__SpeedFeature__Group__23482);
            rule__SpeedFeature__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedFeature__Group__2"


    // $ANTLR start "rule__SpeedFeature__Group__2__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1728:1: rule__SpeedFeature__Group__2__Impl : ( ( rule__SpeedFeature__ValueAssignment_2 ) ) ;
    public final void rule__SpeedFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1732:1: ( ( ( rule__SpeedFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1733:1: ( ( rule__SpeedFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1733:1: ( ( rule__SpeedFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1734:1: ( rule__SpeedFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getSpeedFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1735:1: ( rule__SpeedFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1735:2: rule__SpeedFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__SpeedFeature__ValueAssignment_2_in_rule__SpeedFeature__Group__2__Impl3509);
            rule__SpeedFeature__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpeedFeatureAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedFeature__Group__2__Impl"


    // $ANTLR start "rule__SizeFeature__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1751:1: rule__SizeFeature__Group__0 : rule__SizeFeature__Group__0__Impl rule__SizeFeature__Group__1 ;
    public final void rule__SizeFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1755:1: ( rule__SizeFeature__Group__0__Impl rule__SizeFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1756:2: rule__SizeFeature__Group__0__Impl rule__SizeFeature__Group__1
            {
            pushFollow(FOLLOW_rule__SizeFeature__Group__0__Impl_in_rule__SizeFeature__Group__03545);
            rule__SizeFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SizeFeature__Group__1_in_rule__SizeFeature__Group__03548);
            rule__SizeFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeFeature__Group__0"


    // $ANTLR start "rule__SizeFeature__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1763:1: rule__SizeFeature__Group__0__Impl : ( ( rule__SizeFeature__NameAssignment_0 ) ) ;
    public final void rule__SizeFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1767:1: ( ( ( rule__SizeFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1768:1: ( ( rule__SizeFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1768:1: ( ( rule__SizeFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1769:1: ( rule__SizeFeature__NameAssignment_0 )
            {
             before(grammarAccess.getSizeFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1770:1: ( rule__SizeFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1770:2: rule__SizeFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SizeFeature__NameAssignment_0_in_rule__SizeFeature__Group__0__Impl3575);
            rule__SizeFeature__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSizeFeatureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeFeature__Group__0__Impl"


    // $ANTLR start "rule__SizeFeature__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1780:1: rule__SizeFeature__Group__1 : rule__SizeFeature__Group__1__Impl rule__SizeFeature__Group__2 ;
    public final void rule__SizeFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1784:1: ( rule__SizeFeature__Group__1__Impl rule__SizeFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1785:2: rule__SizeFeature__Group__1__Impl rule__SizeFeature__Group__2
            {
            pushFollow(FOLLOW_rule__SizeFeature__Group__1__Impl_in_rule__SizeFeature__Group__13605);
            rule__SizeFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SizeFeature__Group__2_in_rule__SizeFeature__Group__13608);
            rule__SizeFeature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeFeature__Group__1"


    // $ANTLR start "rule__SizeFeature__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1792:1: rule__SizeFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__SizeFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1796:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1797:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1797:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1798:1: '='
            {
             before(grammarAccess.getSizeFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__SizeFeature__Group__1__Impl3636); 
             after(grammarAccess.getSizeFeatureAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeFeature__Group__1__Impl"


    // $ANTLR start "rule__SizeFeature__Group__2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1811:1: rule__SizeFeature__Group__2 : rule__SizeFeature__Group__2__Impl ;
    public final void rule__SizeFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1815:1: ( rule__SizeFeature__Group__2__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1816:2: rule__SizeFeature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SizeFeature__Group__2__Impl_in_rule__SizeFeature__Group__23667);
            rule__SizeFeature__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeFeature__Group__2"


    // $ANTLR start "rule__SizeFeature__Group__2__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1822:1: rule__SizeFeature__Group__2__Impl : ( ( rule__SizeFeature__ValueAssignment_2 ) ) ;
    public final void rule__SizeFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1826:1: ( ( ( rule__SizeFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1827:1: ( ( rule__SizeFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1827:1: ( ( rule__SizeFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1828:1: ( rule__SizeFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getSizeFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1829:1: ( rule__SizeFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1829:2: rule__SizeFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__SizeFeature__ValueAssignment_2_in_rule__SizeFeature__Group__2__Impl3694);
            rule__SizeFeature__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSizeFeatureAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeFeature__Group__2__Impl"


    // $ANTLR start "rule__TypeFeature__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1845:1: rule__TypeFeature__Group__0 : rule__TypeFeature__Group__0__Impl rule__TypeFeature__Group__1 ;
    public final void rule__TypeFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1849:1: ( rule__TypeFeature__Group__0__Impl rule__TypeFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1850:2: rule__TypeFeature__Group__0__Impl rule__TypeFeature__Group__1
            {
            pushFollow(FOLLOW_rule__TypeFeature__Group__0__Impl_in_rule__TypeFeature__Group__03730);
            rule__TypeFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeFeature__Group__1_in_rule__TypeFeature__Group__03733);
            rule__TypeFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFeature__Group__0"


    // $ANTLR start "rule__TypeFeature__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1857:1: rule__TypeFeature__Group__0__Impl : ( ( rule__TypeFeature__NameAssignment_0 ) ) ;
    public final void rule__TypeFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1861:1: ( ( ( rule__TypeFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1862:1: ( ( rule__TypeFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1862:1: ( ( rule__TypeFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1863:1: ( rule__TypeFeature__NameAssignment_0 )
            {
             before(grammarAccess.getTypeFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1864:1: ( rule__TypeFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1864:2: rule__TypeFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeFeature__NameAssignment_0_in_rule__TypeFeature__Group__0__Impl3760);
            rule__TypeFeature__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeFeatureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFeature__Group__0__Impl"


    // $ANTLR start "rule__TypeFeature__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1874:1: rule__TypeFeature__Group__1 : rule__TypeFeature__Group__1__Impl rule__TypeFeature__Group__2 ;
    public final void rule__TypeFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1878:1: ( rule__TypeFeature__Group__1__Impl rule__TypeFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1879:2: rule__TypeFeature__Group__1__Impl rule__TypeFeature__Group__2
            {
            pushFollow(FOLLOW_rule__TypeFeature__Group__1__Impl_in_rule__TypeFeature__Group__13790);
            rule__TypeFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeFeature__Group__2_in_rule__TypeFeature__Group__13793);
            rule__TypeFeature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFeature__Group__1"


    // $ANTLR start "rule__TypeFeature__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1886:1: rule__TypeFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__TypeFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1890:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1891:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1891:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1892:1: '='
            {
             before(grammarAccess.getTypeFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__TypeFeature__Group__1__Impl3821); 
             after(grammarAccess.getTypeFeatureAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFeature__Group__1__Impl"


    // $ANTLR start "rule__TypeFeature__Group__2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1905:1: rule__TypeFeature__Group__2 : rule__TypeFeature__Group__2__Impl ;
    public final void rule__TypeFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1909:1: ( rule__TypeFeature__Group__2__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1910:2: rule__TypeFeature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeFeature__Group__2__Impl_in_rule__TypeFeature__Group__23852);
            rule__TypeFeature__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFeature__Group__2"


    // $ANTLR start "rule__TypeFeature__Group__2__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1916:1: rule__TypeFeature__Group__2__Impl : ( ( rule__TypeFeature__ValueAssignment_2 ) ) ;
    public final void rule__TypeFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1920:1: ( ( ( rule__TypeFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1921:1: ( ( rule__TypeFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1921:1: ( ( rule__TypeFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1922:1: ( rule__TypeFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getTypeFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1923:1: ( rule__TypeFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1923:2: rule__TypeFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__TypeFeature__ValueAssignment_2_in_rule__TypeFeature__Group__2__Impl3879);
            rule__TypeFeature__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeFeatureAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFeature__Group__2__Impl"


    // $ANTLR start "rule__Cable__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1939:1: rule__Cable__Group__0 : rule__Cable__Group__0__Impl rule__Cable__Group__1 ;
    public final void rule__Cable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1943:1: ( rule__Cable__Group__0__Impl rule__Cable__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1944:2: rule__Cable__Group__0__Impl rule__Cable__Group__1
            {
            pushFollow(FOLLOW_rule__Cable__Group__0__Impl_in_rule__Cable__Group__03915);
            rule__Cable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cable__Group__1_in_rule__Cable__Group__03918);
            rule__Cable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cable__Group__0"


    // $ANTLR start "rule__Cable__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1951:1: rule__Cable__Group__0__Impl : ( ( rule__Cable__NameAssignment_0 ) ) ;
    public final void rule__Cable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1955:1: ( ( ( rule__Cable__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1956:1: ( ( rule__Cable__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1956:1: ( ( rule__Cable__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1957:1: ( rule__Cable__NameAssignment_0 )
            {
             before(grammarAccess.getCableAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1958:1: ( rule__Cable__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1958:2: rule__Cable__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Cable__NameAssignment_0_in_rule__Cable__Group__0__Impl3945);
            rule__Cable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cable__Group__0__Impl"


    // $ANTLR start "rule__Cable__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1968:1: rule__Cable__Group__1 : rule__Cable__Group__1__Impl rule__Cable__Group__2 ;
    public final void rule__Cable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1972:1: ( rule__Cable__Group__1__Impl rule__Cable__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1973:2: rule__Cable__Group__1__Impl rule__Cable__Group__2
            {
            pushFollow(FOLLOW_rule__Cable__Group__1__Impl_in_rule__Cable__Group__13975);
            rule__Cable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cable__Group__2_in_rule__Cable__Group__13978);
            rule__Cable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cable__Group__1"


    // $ANTLR start "rule__Cable__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1980:1: rule__Cable__Group__1__Impl : ( '{' ) ;
    public final void rule__Cable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1984:1: ( ( '{' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1985:1: ( '{' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1985:1: ( '{' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1986:1: '{'
            {
             before(grammarAccess.getCableAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Cable__Group__1__Impl4006); 
             after(grammarAccess.getCableAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cable__Group__1__Impl"


    // $ANTLR start "rule__Cable__Group__2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:1999:1: rule__Cable__Group__2 : rule__Cable__Group__2__Impl rule__Cable__Group__3 ;
    public final void rule__Cable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2003:1: ( rule__Cable__Group__2__Impl rule__Cable__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2004:2: rule__Cable__Group__2__Impl rule__Cable__Group__3
            {
            pushFollow(FOLLOW_rule__Cable__Group__2__Impl_in_rule__Cable__Group__24037);
            rule__Cable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cable__Group__3_in_rule__Cable__Group__24040);
            rule__Cable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cable__Group__2"


    // $ANTLR start "rule__Cable__Group__2__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2011:1: rule__Cable__Group__2__Impl : ( ( rule__Cable__ColorFeatureAssignment_2 ) ) ;
    public final void rule__Cable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2015:1: ( ( ( rule__Cable__ColorFeatureAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2016:1: ( ( rule__Cable__ColorFeatureAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2016:1: ( ( rule__Cable__ColorFeatureAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2017:1: ( rule__Cable__ColorFeatureAssignment_2 )
            {
             before(grammarAccess.getCableAccess().getColorFeatureAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2018:1: ( rule__Cable__ColorFeatureAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2018:2: rule__Cable__ColorFeatureAssignment_2
            {
            pushFollow(FOLLOW_rule__Cable__ColorFeatureAssignment_2_in_rule__Cable__Group__2__Impl4067);
            rule__Cable__ColorFeatureAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCableAccess().getColorFeatureAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cable__Group__2__Impl"


    // $ANTLR start "rule__Cable__Group__3"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2028:1: rule__Cable__Group__3 : rule__Cable__Group__3__Impl rule__Cable__Group__4 ;
    public final void rule__Cable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2032:1: ( rule__Cable__Group__3__Impl rule__Cable__Group__4 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2033:2: rule__Cable__Group__3__Impl rule__Cable__Group__4
            {
            pushFollow(FOLLOW_rule__Cable__Group__3__Impl_in_rule__Cable__Group__34097);
            rule__Cable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cable__Group__4_in_rule__Cable__Group__34100);
            rule__Cable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cable__Group__3"


    // $ANTLR start "rule__Cable__Group__3__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2040:1: rule__Cable__Group__3__Impl : ( ( rule__Cable__NetworkFeatureAssignment_3 ) ) ;
    public final void rule__Cable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2044:1: ( ( ( rule__Cable__NetworkFeatureAssignment_3 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2045:1: ( ( rule__Cable__NetworkFeatureAssignment_3 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2045:1: ( ( rule__Cable__NetworkFeatureAssignment_3 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2046:1: ( rule__Cable__NetworkFeatureAssignment_3 )
            {
             before(grammarAccess.getCableAccess().getNetworkFeatureAssignment_3()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2047:1: ( rule__Cable__NetworkFeatureAssignment_3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2047:2: rule__Cable__NetworkFeatureAssignment_3
            {
            pushFollow(FOLLOW_rule__Cable__NetworkFeatureAssignment_3_in_rule__Cable__Group__3__Impl4127);
            rule__Cable__NetworkFeatureAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCableAccess().getNetworkFeatureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cable__Group__3__Impl"


    // $ANTLR start "rule__Cable__Group__4"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2057:1: rule__Cable__Group__4 : rule__Cable__Group__4__Impl rule__Cable__Group__5 ;
    public final void rule__Cable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2061:1: ( rule__Cable__Group__4__Impl rule__Cable__Group__5 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2062:2: rule__Cable__Group__4__Impl rule__Cable__Group__5
            {
            pushFollow(FOLLOW_rule__Cable__Group__4__Impl_in_rule__Cable__Group__44157);
            rule__Cable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cable__Group__5_in_rule__Cable__Group__44160);
            rule__Cable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cable__Group__4"


    // $ANTLR start "rule__Cable__Group__4__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2069:1: rule__Cable__Group__4__Impl : ( ( rule__Cable__LengthFeatureAssignment_4 ) ) ;
    public final void rule__Cable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2073:1: ( ( ( rule__Cable__LengthFeatureAssignment_4 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2074:1: ( ( rule__Cable__LengthFeatureAssignment_4 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2074:1: ( ( rule__Cable__LengthFeatureAssignment_4 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2075:1: ( rule__Cable__LengthFeatureAssignment_4 )
            {
             before(grammarAccess.getCableAccess().getLengthFeatureAssignment_4()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2076:1: ( rule__Cable__LengthFeatureAssignment_4 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2076:2: rule__Cable__LengthFeatureAssignment_4
            {
            pushFollow(FOLLOW_rule__Cable__LengthFeatureAssignment_4_in_rule__Cable__Group__4__Impl4187);
            rule__Cable__LengthFeatureAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCableAccess().getLengthFeatureAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cable__Group__4__Impl"


    // $ANTLR start "rule__Cable__Group__5"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2086:1: rule__Cable__Group__5 : rule__Cable__Group__5__Impl ;
    public final void rule__Cable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2090:1: ( rule__Cable__Group__5__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2091:2: rule__Cable__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Cable__Group__5__Impl_in_rule__Cable__Group__54217);
            rule__Cable__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cable__Group__5"


    // $ANTLR start "rule__Cable__Group__5__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2097:1: rule__Cable__Group__5__Impl : ( '}' ) ;
    public final void rule__Cable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2101:1: ( ( '}' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2102:1: ( '}' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2102:1: ( '}' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2103:1: '}'
            {
             before(grammarAccess.getCableAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Cable__Group__5__Impl4245); 
             after(grammarAccess.getCableAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cable__Group__5__Impl"


    // $ANTLR start "rule__PriceRule__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2128:1: rule__PriceRule__Group__0 : rule__PriceRule__Group__0__Impl rule__PriceRule__Group__1 ;
    public final void rule__PriceRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2132:1: ( rule__PriceRule__Group__0__Impl rule__PriceRule__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2133:2: rule__PriceRule__Group__0__Impl rule__PriceRule__Group__1
            {
            pushFollow(FOLLOW_rule__PriceRule__Group__0__Impl_in_rule__PriceRule__Group__04288);
            rule__PriceRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PriceRule__Group__1_in_rule__PriceRule__Group__04291);
            rule__PriceRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__Group__0"


    // $ANTLR start "rule__PriceRule__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2140:1: rule__PriceRule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__PriceRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2144:1: ( ( 'rule' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2145:1: ( 'rule' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2145:1: ( 'rule' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2146:1: 'rule'
            {
             before(grammarAccess.getPriceRuleAccess().getRuleKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__PriceRule__Group__0__Impl4319); 
             after(grammarAccess.getPriceRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__Group__0__Impl"


    // $ANTLR start "rule__PriceRule__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2159:1: rule__PriceRule__Group__1 : rule__PriceRule__Group__1__Impl rule__PriceRule__Group__2 ;
    public final void rule__PriceRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2163:1: ( rule__PriceRule__Group__1__Impl rule__PriceRule__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2164:2: rule__PriceRule__Group__1__Impl rule__PriceRule__Group__2
            {
            pushFollow(FOLLOW_rule__PriceRule__Group__1__Impl_in_rule__PriceRule__Group__14350);
            rule__PriceRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PriceRule__Group__2_in_rule__PriceRule__Group__14353);
            rule__PriceRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__Group__1"


    // $ANTLR start "rule__PriceRule__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2171:1: rule__PriceRule__Group__1__Impl : ( ( rule__PriceRule__NameAssignment_1 ) ) ;
    public final void rule__PriceRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2175:1: ( ( ( rule__PriceRule__NameAssignment_1 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2176:1: ( ( rule__PriceRule__NameAssignment_1 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2176:1: ( ( rule__PriceRule__NameAssignment_1 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2177:1: ( rule__PriceRule__NameAssignment_1 )
            {
             before(grammarAccess.getPriceRuleAccess().getNameAssignment_1()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2178:1: ( rule__PriceRule__NameAssignment_1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2178:2: rule__PriceRule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PriceRule__NameAssignment_1_in_rule__PriceRule__Group__1__Impl4380);
            rule__PriceRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPriceRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__Group__1__Impl"


    // $ANTLR start "rule__PriceRule__Group__2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2188:1: rule__PriceRule__Group__2 : rule__PriceRule__Group__2__Impl rule__PriceRule__Group__3 ;
    public final void rule__PriceRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2192:1: ( rule__PriceRule__Group__2__Impl rule__PriceRule__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2193:2: rule__PriceRule__Group__2__Impl rule__PriceRule__Group__3
            {
            pushFollow(FOLLOW_rule__PriceRule__Group__2__Impl_in_rule__PriceRule__Group__24410);
            rule__PriceRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PriceRule__Group__3_in_rule__PriceRule__Group__24413);
            rule__PriceRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__Group__2"


    // $ANTLR start "rule__PriceRule__Group__2__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2200:1: rule__PriceRule__Group__2__Impl : ( ( rule__PriceRule__Group_2__0 )? ) ;
    public final void rule__PriceRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2204:1: ( ( ( rule__PriceRule__Group_2__0 )? ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2205:1: ( ( rule__PriceRule__Group_2__0 )? )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2205:1: ( ( rule__PriceRule__Group_2__0 )? )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2206:1: ( rule__PriceRule__Group_2__0 )?
            {
             before(grammarAccess.getPriceRuleAccess().getGroup_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2207:1: ( rule__PriceRule__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2207:2: rule__PriceRule__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PriceRule__Group_2__0_in_rule__PriceRule__Group__2__Impl4440);
                    rule__PriceRule__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPriceRuleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__Group__2__Impl"


    // $ANTLR start "rule__PriceRule__Group__3"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2217:1: rule__PriceRule__Group__3 : rule__PriceRule__Group__3__Impl rule__PriceRule__Group__4 ;
    public final void rule__PriceRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2221:1: ( rule__PriceRule__Group__3__Impl rule__PriceRule__Group__4 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2222:2: rule__PriceRule__Group__3__Impl rule__PriceRule__Group__4
            {
            pushFollow(FOLLOW_rule__PriceRule__Group__3__Impl_in_rule__PriceRule__Group__34471);
            rule__PriceRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PriceRule__Group__4_in_rule__PriceRule__Group__34474);
            rule__PriceRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__Group__3"


    // $ANTLR start "rule__PriceRule__Group__3__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2229:1: rule__PriceRule__Group__3__Impl : ( '{' ) ;
    public final void rule__PriceRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2233:1: ( ( '{' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2234:1: ( '{' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2234:1: ( '{' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2235:1: '{'
            {
             before(grammarAccess.getPriceRuleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__PriceRule__Group__3__Impl4502); 
             after(grammarAccess.getPriceRuleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__Group__3__Impl"


    // $ANTLR start "rule__PriceRule__Group__4"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2248:1: rule__PriceRule__Group__4 : rule__PriceRule__Group__4__Impl rule__PriceRule__Group__5 ;
    public final void rule__PriceRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2252:1: ( rule__PriceRule__Group__4__Impl rule__PriceRule__Group__5 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2253:2: rule__PriceRule__Group__4__Impl rule__PriceRule__Group__5
            {
            pushFollow(FOLLOW_rule__PriceRule__Group__4__Impl_in_rule__PriceRule__Group__44533);
            rule__PriceRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PriceRule__Group__5_in_rule__PriceRule__Group__44536);
            rule__PriceRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__Group__4"


    // $ANTLR start "rule__PriceRule__Group__4__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2260:1: rule__PriceRule__Group__4__Impl : ( ( rule__PriceRule__FeaturesAssignment_4 )* ) ;
    public final void rule__PriceRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2264:1: ( ( ( rule__PriceRule__FeaturesAssignment_4 )* ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2265:1: ( ( rule__PriceRule__FeaturesAssignment_4 )* )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2265:1: ( ( rule__PriceRule__FeaturesAssignment_4 )* )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2266:1: ( rule__PriceRule__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getPriceRuleAccess().getFeaturesAssignment_4()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2267:1: ( rule__PriceRule__FeaturesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2267:2: rule__PriceRule__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__PriceRule__FeaturesAssignment_4_in_rule__PriceRule__Group__4__Impl4563);
            	    rule__PriceRule__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPriceRuleAccess().getFeaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__Group__4__Impl"


    // $ANTLR start "rule__PriceRule__Group__5"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2277:1: rule__PriceRule__Group__5 : rule__PriceRule__Group__5__Impl ;
    public final void rule__PriceRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2281:1: ( rule__PriceRule__Group__5__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2282:2: rule__PriceRule__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PriceRule__Group__5__Impl_in_rule__PriceRule__Group__54594);
            rule__PriceRule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__Group__5"


    // $ANTLR start "rule__PriceRule__Group__5__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2288:1: rule__PriceRule__Group__5__Impl : ( '}' ) ;
    public final void rule__PriceRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2292:1: ( ( '}' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2293:1: ( '}' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2293:1: ( '}' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2294:1: '}'
            {
             before(grammarAccess.getPriceRuleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__PriceRule__Group__5__Impl4622); 
             after(grammarAccess.getPriceRuleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__Group__5__Impl"


    // $ANTLR start "rule__PriceRule__Group_2__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2319:1: rule__PriceRule__Group_2__0 : rule__PriceRule__Group_2__0__Impl rule__PriceRule__Group_2__1 ;
    public final void rule__PriceRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2323:1: ( rule__PriceRule__Group_2__0__Impl rule__PriceRule__Group_2__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2324:2: rule__PriceRule__Group_2__0__Impl rule__PriceRule__Group_2__1
            {
            pushFollow(FOLLOW_rule__PriceRule__Group_2__0__Impl_in_rule__PriceRule__Group_2__04665);
            rule__PriceRule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PriceRule__Group_2__1_in_rule__PriceRule__Group_2__04668);
            rule__PriceRule__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__Group_2__0"


    // $ANTLR start "rule__PriceRule__Group_2__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2331:1: rule__PriceRule__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__PriceRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2335:1: ( ( 'extends' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2336:1: ( 'extends' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2336:1: ( 'extends' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2337:1: 'extends'
            {
             before(grammarAccess.getPriceRuleAccess().getExtendsKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__PriceRule__Group_2__0__Impl4696); 
             after(grammarAccess.getPriceRuleAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__Group_2__0__Impl"


    // $ANTLR start "rule__PriceRule__Group_2__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2350:1: rule__PriceRule__Group_2__1 : rule__PriceRule__Group_2__1__Impl ;
    public final void rule__PriceRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2354:1: ( rule__PriceRule__Group_2__1__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2355:2: rule__PriceRule__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PriceRule__Group_2__1__Impl_in_rule__PriceRule__Group_2__14727);
            rule__PriceRule__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__Group_2__1"


    // $ANTLR start "rule__PriceRule__Group_2__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2361:1: rule__PriceRule__Group_2__1__Impl : ( ( rule__PriceRule__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__PriceRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2365:1: ( ( ( rule__PriceRule__SuperTypeAssignment_2_1 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2366:1: ( ( rule__PriceRule__SuperTypeAssignment_2_1 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2366:1: ( ( rule__PriceRule__SuperTypeAssignment_2_1 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2367:1: ( rule__PriceRule__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getPriceRuleAccess().getSuperTypeAssignment_2_1()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2368:1: ( rule__PriceRule__SuperTypeAssignment_2_1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2368:2: rule__PriceRule__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PriceRule__SuperTypeAssignment_2_1_in_rule__PriceRule__Group_2__1__Impl4754);
            rule__PriceRule__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPriceRuleAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__Group_2__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2382:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2386:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2387:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__04788);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__04791);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2394:1: rule__Entity__Group__0__Impl : ( 'puid' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2398:1: ( ( 'puid' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2399:1: ( 'puid' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2399:1: ( 'puid' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2400:1: 'puid'
            {
             before(grammarAccess.getEntityAccess().getPuidKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Entity__Group__0__Impl4819); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2413:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2417:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2418:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__14850);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__14853);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2425:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2429:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2430:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2430:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2431:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2432:1: ( rule__Entity__NameAssignment_1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2432:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl4880);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2442:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2446:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2447:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24910);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24913);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2454:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2458:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2459:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2459:1: ( ( rule__Entity__Group_2__0 )? )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2460:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2461:1: ( rule__Entity__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2461:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl4940);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2471:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2475:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2476:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34971);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__34974);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2483:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2487:1: ( ( '{' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2488:1: ( '{' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2488:1: ( '{' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2489:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group__3__Impl5002); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2502:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2506:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2507:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__45033);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__45036);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2514:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FeaturesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2518:1: ( ( ( rule__Entity__FeaturesAssignment_4 )* ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2519:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2519:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2520:1: ( rule__Entity__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2521:1: ( rule__Entity__FeaturesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2521:2: rule__Entity__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_4_in_rule__Entity__Group__4__Impl5063);
            	    rule__Entity__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2531:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2535:1: ( rule__Entity__Group__5__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2536:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__55094);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2542:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2546:1: ( ( '}' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2547:1: ( '}' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2547:1: ( '}' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2548:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group__5__Impl5122); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2573:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2577:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2578:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__05165);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__05168);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2585:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2589:1: ( ( 'extends' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2590:1: ( 'extends' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2590:1: ( 'extends' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2591:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group_2__0__Impl5196); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2604:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2608:1: ( rule__Entity__Group_2__1__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2609:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__15227);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2615:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2619:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2620:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2620:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2621:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2622:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2622:2: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl5254);
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2636:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2640:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2641:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05288);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05291);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2648:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2652:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2653:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2653:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2654:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5318); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2665:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2669:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2670:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15347);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2676:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2680:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2681:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2681:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2682:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2683:1: ( rule__QualifiedName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2683:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5374);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2697:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2701:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2702:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05409);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05412);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2709:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2713:1: ( ( '.' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2714:1: ( '.' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2714:1: ( '.' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2715:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__QualifiedName__Group_1__0__Impl5440); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2728:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2732:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2733:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15471);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2739:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2743:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2744:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2744:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2745:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5498); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2760:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2764:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2765:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__05531);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__05534);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2772:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__NameAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2776:1: ( ( ( rule__Feature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2777:1: ( ( rule__Feature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2777:1: ( ( rule__Feature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2778:1: ( rule__Feature__NameAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2779:1: ( rule__Feature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2779:2: rule__Feature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_0_in_rule__Feature__Group__0__Impl5561);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2789:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2793:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2794:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__15591);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__15594);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2801:1: rule__Feature__Group__1__Impl : ( '=' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2805:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2806:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2806:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2807:1: '='
            {
             before(grammarAccess.getFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Feature__Group__1__Impl5622); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2820:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2824:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2825:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__25653);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__25656);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2832:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__ValueAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2836:1: ( ( ( rule__Feature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2837:1: ( ( rule__Feature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2837:1: ( ( rule__Feature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2838:1: ( rule__Feature__ValueAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2839:1: ( rule__Feature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2839:2: rule__Feature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Feature__ValueAssignment_2_in_rule__Feature__Group__2__Impl5683);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2849:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2853:1: ( rule__Feature__Group__3__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2854:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__35713);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2860:1: rule__Feature__Group__3__Impl : ( ';' ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2864:1: ( ( ';' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2865:1: ( ';' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2865:1: ( ';' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2866:1: ';'
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Feature__Group__3__Impl5741); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2887:1: rule__LengthFeature__Group__0 : rule__LengthFeature__Group__0__Impl rule__LengthFeature__Group__1 ;
    public final void rule__LengthFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2891:1: ( rule__LengthFeature__Group__0__Impl rule__LengthFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2892:2: rule__LengthFeature__Group__0__Impl rule__LengthFeature__Group__1
            {
            pushFollow(FOLLOW_rule__LengthFeature__Group__0__Impl_in_rule__LengthFeature__Group__05780);
            rule__LengthFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LengthFeature__Group__1_in_rule__LengthFeature__Group__05783);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2899:1: rule__LengthFeature__Group__0__Impl : ( ( rule__LengthFeature__NameAssignment_0 ) ) ;
    public final void rule__LengthFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2903:1: ( ( ( rule__LengthFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2904:1: ( ( rule__LengthFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2904:1: ( ( rule__LengthFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2905:1: ( rule__LengthFeature__NameAssignment_0 )
            {
             before(grammarAccess.getLengthFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2906:1: ( rule__LengthFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2906:2: rule__LengthFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__LengthFeature__NameAssignment_0_in_rule__LengthFeature__Group__0__Impl5810);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2916:1: rule__LengthFeature__Group__1 : rule__LengthFeature__Group__1__Impl rule__LengthFeature__Group__2 ;
    public final void rule__LengthFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2920:1: ( rule__LengthFeature__Group__1__Impl rule__LengthFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2921:2: rule__LengthFeature__Group__1__Impl rule__LengthFeature__Group__2
            {
            pushFollow(FOLLOW_rule__LengthFeature__Group__1__Impl_in_rule__LengthFeature__Group__15840);
            rule__LengthFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LengthFeature__Group__2_in_rule__LengthFeature__Group__15843);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2928:1: rule__LengthFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__LengthFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2932:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2933:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2933:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2934:1: '='
            {
             before(grammarAccess.getLengthFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__LengthFeature__Group__1__Impl5871); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2947:1: rule__LengthFeature__Group__2 : rule__LengthFeature__Group__2__Impl rule__LengthFeature__Group__3 ;
    public final void rule__LengthFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2951:1: ( rule__LengthFeature__Group__2__Impl rule__LengthFeature__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2952:2: rule__LengthFeature__Group__2__Impl rule__LengthFeature__Group__3
            {
            pushFollow(FOLLOW_rule__LengthFeature__Group__2__Impl_in_rule__LengthFeature__Group__25902);
            rule__LengthFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LengthFeature__Group__3_in_rule__LengthFeature__Group__25905);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2959:1: rule__LengthFeature__Group__2__Impl : ( ( rule__LengthFeature__ValueAssignment_2 ) ) ;
    public final void rule__LengthFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2963:1: ( ( ( rule__LengthFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2964:1: ( ( rule__LengthFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2964:1: ( ( rule__LengthFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2965:1: ( rule__LengthFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getLengthFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2966:1: ( rule__LengthFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2966:2: rule__LengthFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__LengthFeature__ValueAssignment_2_in_rule__LengthFeature__Group__2__Impl5932);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2976:1: rule__LengthFeature__Group__3 : rule__LengthFeature__Group__3__Impl ;
    public final void rule__LengthFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2980:1: ( rule__LengthFeature__Group__3__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2981:2: rule__LengthFeature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LengthFeature__Group__3__Impl_in_rule__LengthFeature__Group__35962);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2987:1: rule__LengthFeature__Group__3__Impl : ( ';' ) ;
    public final void rule__LengthFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2991:1: ( ( ';' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2992:1: ( ';' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2992:1: ( ';' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:2993:1: ';'
            {
             before(grammarAccess.getLengthFeatureAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__LengthFeature__Group__3__Impl5990); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3014:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3018:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3019:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__06029);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__06032);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3026:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3030:1: ( ( RULE_INT ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3031:1: ( RULE_INT )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3031:1: ( RULE_INT )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3032:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl6059); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3043:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3047:1: ( rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3048:2: rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__16088);
            rule__DOUBLE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DOUBLE__Group__2_in_rule__DOUBLE__Group__16091);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3055:1: rule__DOUBLE__Group__1__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3059:1: ( ( '.' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3060:1: ( '.' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3060:1: ( '.' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3061:1: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__DOUBLE__Group__1__Impl6119); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3074:1: rule__DOUBLE__Group__2 : rule__DOUBLE__Group__2__Impl ;
    public final void rule__DOUBLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3078:1: ( rule__DOUBLE__Group__2__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3079:2: rule__DOUBLE__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DOUBLE__Group__2__Impl_in_rule__DOUBLE__Group__26150);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3085:1: rule__DOUBLE__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3089:1: ( ( RULE_INT ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3090:1: ( RULE_INT )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3090:1: ( RULE_INT )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3091:1: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DOUBLE__Group__2__Impl6177); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3108:1: rule__NetWorkFeature__Group__0 : rule__NetWorkFeature__Group__0__Impl rule__NetWorkFeature__Group__1 ;
    public final void rule__NetWorkFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3112:1: ( rule__NetWorkFeature__Group__0__Impl rule__NetWorkFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3113:2: rule__NetWorkFeature__Group__0__Impl rule__NetWorkFeature__Group__1
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__0__Impl_in_rule__NetWorkFeature__Group__06212);
            rule__NetWorkFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NetWorkFeature__Group__1_in_rule__NetWorkFeature__Group__06215);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3120:1: rule__NetWorkFeature__Group__0__Impl : ( ( rule__NetWorkFeature__NameAssignment_0 ) ) ;
    public final void rule__NetWorkFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3124:1: ( ( ( rule__NetWorkFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3125:1: ( ( rule__NetWorkFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3125:1: ( ( rule__NetWorkFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3126:1: ( rule__NetWorkFeature__NameAssignment_0 )
            {
             before(grammarAccess.getNetWorkFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3127:1: ( rule__NetWorkFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3127:2: rule__NetWorkFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__NameAssignment_0_in_rule__NetWorkFeature__Group__0__Impl6242);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3137:1: rule__NetWorkFeature__Group__1 : rule__NetWorkFeature__Group__1__Impl rule__NetWorkFeature__Group__2 ;
    public final void rule__NetWorkFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3141:1: ( rule__NetWorkFeature__Group__1__Impl rule__NetWorkFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3142:2: rule__NetWorkFeature__Group__1__Impl rule__NetWorkFeature__Group__2
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__1__Impl_in_rule__NetWorkFeature__Group__16272);
            rule__NetWorkFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NetWorkFeature__Group__2_in_rule__NetWorkFeature__Group__16275);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3149:1: rule__NetWorkFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__NetWorkFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3153:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3154:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3154:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3155:1: '='
            {
             before(grammarAccess.getNetWorkFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__NetWorkFeature__Group__1__Impl6303); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3168:1: rule__NetWorkFeature__Group__2 : rule__NetWorkFeature__Group__2__Impl rule__NetWorkFeature__Group__3 ;
    public final void rule__NetWorkFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3172:1: ( rule__NetWorkFeature__Group__2__Impl rule__NetWorkFeature__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3173:2: rule__NetWorkFeature__Group__2__Impl rule__NetWorkFeature__Group__3
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__2__Impl_in_rule__NetWorkFeature__Group__26334);
            rule__NetWorkFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NetWorkFeature__Group__3_in_rule__NetWorkFeature__Group__26337);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3180:1: rule__NetWorkFeature__Group__2__Impl : ( ( rule__NetWorkFeature__ValueAssignment_2 ) ) ;
    public final void rule__NetWorkFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3184:1: ( ( ( rule__NetWorkFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3185:1: ( ( rule__NetWorkFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3185:1: ( ( rule__NetWorkFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3186:1: ( rule__NetWorkFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getNetWorkFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3187:1: ( rule__NetWorkFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3187:2: rule__NetWorkFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__ValueAssignment_2_in_rule__NetWorkFeature__Group__2__Impl6364);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3197:1: rule__NetWorkFeature__Group__3 : rule__NetWorkFeature__Group__3__Impl ;
    public final void rule__NetWorkFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3201:1: ( rule__NetWorkFeature__Group__3__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3202:2: rule__NetWorkFeature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NetWorkFeature__Group__3__Impl_in_rule__NetWorkFeature__Group__36394);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3208:1: rule__NetWorkFeature__Group__3__Impl : ( ';' ) ;
    public final void rule__NetWorkFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3212:1: ( ( ';' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3213:1: ( ';' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3213:1: ( ';' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3214:1: ';'
            {
             before(grammarAccess.getNetWorkFeatureAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__NetWorkFeature__Group__3__Impl6422); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3235:1: rule__ColorFeature__Group__0 : rule__ColorFeature__Group__0__Impl rule__ColorFeature__Group__1 ;
    public final void rule__ColorFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3239:1: ( rule__ColorFeature__Group__0__Impl rule__ColorFeature__Group__1 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3240:2: rule__ColorFeature__Group__0__Impl rule__ColorFeature__Group__1
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__0__Impl_in_rule__ColorFeature__Group__06461);
            rule__ColorFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColorFeature__Group__1_in_rule__ColorFeature__Group__06464);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3247:1: rule__ColorFeature__Group__0__Impl : ( ( rule__ColorFeature__NameAssignment_0 ) ) ;
    public final void rule__ColorFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3251:1: ( ( ( rule__ColorFeature__NameAssignment_0 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3252:1: ( ( rule__ColorFeature__NameAssignment_0 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3252:1: ( ( rule__ColorFeature__NameAssignment_0 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3253:1: ( rule__ColorFeature__NameAssignment_0 )
            {
             before(grammarAccess.getColorFeatureAccess().getNameAssignment_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3254:1: ( rule__ColorFeature__NameAssignment_0 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3254:2: rule__ColorFeature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ColorFeature__NameAssignment_0_in_rule__ColorFeature__Group__0__Impl6491);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3264:1: rule__ColorFeature__Group__1 : rule__ColorFeature__Group__1__Impl rule__ColorFeature__Group__2 ;
    public final void rule__ColorFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3268:1: ( rule__ColorFeature__Group__1__Impl rule__ColorFeature__Group__2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3269:2: rule__ColorFeature__Group__1__Impl rule__ColorFeature__Group__2
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__1__Impl_in_rule__ColorFeature__Group__16521);
            rule__ColorFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColorFeature__Group__2_in_rule__ColorFeature__Group__16524);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3276:1: rule__ColorFeature__Group__1__Impl : ( '=' ) ;
    public final void rule__ColorFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3280:1: ( ( '=' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3281:1: ( '=' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3281:1: ( '=' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3282:1: '='
            {
             before(grammarAccess.getColorFeatureAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__ColorFeature__Group__1__Impl6552); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3295:1: rule__ColorFeature__Group__2 : rule__ColorFeature__Group__2__Impl rule__ColorFeature__Group__3 ;
    public final void rule__ColorFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3299:1: ( rule__ColorFeature__Group__2__Impl rule__ColorFeature__Group__3 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3300:2: rule__ColorFeature__Group__2__Impl rule__ColorFeature__Group__3
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__2__Impl_in_rule__ColorFeature__Group__26583);
            rule__ColorFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ColorFeature__Group__3_in_rule__ColorFeature__Group__26586);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3307:1: rule__ColorFeature__Group__2__Impl : ( ( rule__ColorFeature__ValueAssignment_2 ) ) ;
    public final void rule__ColorFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3311:1: ( ( ( rule__ColorFeature__ValueAssignment_2 ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3312:1: ( ( rule__ColorFeature__ValueAssignment_2 ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3312:1: ( ( rule__ColorFeature__ValueAssignment_2 ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3313:1: ( rule__ColorFeature__ValueAssignment_2 )
            {
             before(grammarAccess.getColorFeatureAccess().getValueAssignment_2()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3314:1: ( rule__ColorFeature__ValueAssignment_2 )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3314:2: rule__ColorFeature__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ColorFeature__ValueAssignment_2_in_rule__ColorFeature__Group__2__Impl6613);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3324:1: rule__ColorFeature__Group__3 : rule__ColorFeature__Group__3__Impl ;
    public final void rule__ColorFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3328:1: ( rule__ColorFeature__Group__3__Impl )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3329:2: rule__ColorFeature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ColorFeature__Group__3__Impl_in_rule__ColorFeature__Group__36643);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3335:1: rule__ColorFeature__Group__3__Impl : ( ';' ) ;
    public final void rule__ColorFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3339:1: ( ( ';' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3340:1: ( ';' )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3340:1: ( ';' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3341:1: ';'
            {
             before(grammarAccess.getColorFeatureAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__ColorFeature__Group__3__Impl6671); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3363:1: rule__Aml__ElementsAssignment : ( ruleAbstractElements ) ;
    public final void rule__Aml__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3367:1: ( ( ruleAbstractElements ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3368:1: ( ruleAbstractElements )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3368:1: ( ruleAbstractElements )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3369:1: ruleAbstractElements
            {
             before(grammarAccess.getAmlAccess().getElementsAbstractElementsParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElements_in_rule__Aml__ElementsAssignment6715);
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


    // $ANTLR start "rule__MinMax__NameAssignment_0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3378:1: rule__MinMax__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MinMax__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3382:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3383:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3383:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3384:1: RULE_ID
            {
             before(grammarAccess.getMinMaxAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MinMax__NameAssignment_06746); 
             after(grammarAccess.getMinMaxAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMax__NameAssignment_0"


    // $ANTLR start "rule__MinMax__TargetGroupFeatureAssignment_2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3393:1: rule__MinMax__TargetGroupFeatureAssignment_2 : ( ruleTargetGroupFeature ) ;
    public final void rule__MinMax__TargetGroupFeatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3397:1: ( ( ruleTargetGroupFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3398:1: ( ruleTargetGroupFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3398:1: ( ruleTargetGroupFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3399:1: ruleTargetGroupFeature
            {
             before(grammarAccess.getMinMaxAccess().getTargetGroupFeatureTargetGroupFeatureParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTargetGroupFeature_in_rule__MinMax__TargetGroupFeatureAssignment_26777);
            ruleTargetGroupFeature();

            state._fsp--;

             after(grammarAccess.getMinMaxAccess().getTargetGroupFeatureTargetGroupFeatureParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMax__TargetGroupFeatureAssignment_2"


    // $ANTLR start "rule__MinMax__ProductPuidsFeatureAssignment_3"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3408:1: rule__MinMax__ProductPuidsFeatureAssignment_3 : ( ruleProductPUIDFeature ) ;
    public final void rule__MinMax__ProductPuidsFeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3412:1: ( ( ruleProductPUIDFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3413:1: ( ruleProductPUIDFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3413:1: ( ruleProductPUIDFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3414:1: ruleProductPUIDFeature
            {
             before(grammarAccess.getMinMaxAccess().getProductPuidsFeatureProductPUIDFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProductPUIDFeature_in_rule__MinMax__ProductPuidsFeatureAssignment_36808);
            ruleProductPUIDFeature();

            state._fsp--;

             after(grammarAccess.getMinMaxAccess().getProductPuidsFeatureProductPUIDFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMax__ProductPuidsFeatureAssignment_3"


    // $ANTLR start "rule__MinMax__MaxFeatureAssignment_4"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3423:1: rule__MinMax__MaxFeatureAssignment_4 : ( ruleMaxFeature ) ;
    public final void rule__MinMax__MaxFeatureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3427:1: ( ( ruleMaxFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3428:1: ( ruleMaxFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3428:1: ( ruleMaxFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3429:1: ruleMaxFeature
            {
             before(grammarAccess.getMinMaxAccess().getMaxFeatureMaxFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMaxFeature_in_rule__MinMax__MaxFeatureAssignment_46839);
            ruleMaxFeature();

            state._fsp--;

             after(grammarAccess.getMinMaxAccess().getMaxFeatureMaxFeatureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinMax__MaxFeatureAssignment_4"


    // $ANTLR start "rule__MaxFeature__NameAssignment_0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3438:1: rule__MaxFeature__NameAssignment_0 : ( ( 'Max' ) ) ;
    public final void rule__MaxFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3442:1: ( ( ( 'Max' ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3443:1: ( ( 'Max' ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3443:1: ( ( 'Max' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3444:1: ( 'Max' )
            {
             before(grammarAccess.getMaxFeatureAccess().getNameMaxKeyword_0_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3445:1: ( 'Max' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3446:1: 'Max'
            {
             before(grammarAccess.getMaxFeatureAccess().getNameMaxKeyword_0_0()); 
            match(input,25,FOLLOW_25_in_rule__MaxFeature__NameAssignment_06875); 
             after(grammarAccess.getMaxFeatureAccess().getNameMaxKeyword_0_0()); 

            }

             after(grammarAccess.getMaxFeatureAccess().getNameMaxKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFeature__NameAssignment_0"


    // $ANTLR start "rule__MaxFeature__ValueAssignment_2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3461:1: rule__MaxFeature__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__MaxFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3465:1: ( ( RULE_INT ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3466:1: ( RULE_INT )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3466:1: ( RULE_INT )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3467:1: RULE_INT
            {
             before(grammarAccess.getMaxFeatureAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__MaxFeature__ValueAssignment_26914); 
             after(grammarAccess.getMaxFeatureAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxFeature__ValueAssignment_2"


    // $ANTLR start "rule__ProductPUIDFeature__NameAssignment_0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3476:1: rule__ProductPUIDFeature__NameAssignment_0 : ( ( 'ProductPUIDs' ) ) ;
    public final void rule__ProductPUIDFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3480:1: ( ( ( 'ProductPUIDs' ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3481:1: ( ( 'ProductPUIDs' ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3481:1: ( ( 'ProductPUIDs' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3482:1: ( 'ProductPUIDs' )
            {
             before(grammarAccess.getProductPUIDFeatureAccess().getNameProductPUIDsKeyword_0_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3483:1: ( 'ProductPUIDs' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3484:1: 'ProductPUIDs'
            {
             before(grammarAccess.getProductPUIDFeatureAccess().getNameProductPUIDsKeyword_0_0()); 
            match(input,26,FOLLOW_26_in_rule__ProductPUIDFeature__NameAssignment_06950); 
             after(grammarAccess.getProductPUIDFeatureAccess().getNameProductPUIDsKeyword_0_0()); 

            }

             after(grammarAccess.getProductPUIDFeatureAccess().getNameProductPUIDsKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductPUIDFeature__NameAssignment_0"


    // $ANTLR start "rule__ProductPUIDFeature__ValuesAssignment_2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3499:1: rule__ProductPUIDFeature__ValuesAssignment_2 : ( RULE_INT ) ;
    public final void rule__ProductPUIDFeature__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3503:1: ( ( RULE_INT ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3504:1: ( RULE_INT )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3504:1: ( RULE_INT )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3505:1: RULE_INT
            {
             before(grammarAccess.getProductPUIDFeatureAccess().getValuesINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ProductPUIDFeature__ValuesAssignment_26989); 
             after(grammarAccess.getProductPUIDFeatureAccess().getValuesINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductPUIDFeature__ValuesAssignment_2"


    // $ANTLR start "rule__ProductPUIDFeature__ValuesAssignment_3_1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3514:1: rule__ProductPUIDFeature__ValuesAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__ProductPUIDFeature__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3518:1: ( ( RULE_INT ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3519:1: ( RULE_INT )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3519:1: ( RULE_INT )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3520:1: RULE_INT
            {
             before(grammarAccess.getProductPUIDFeatureAccess().getValuesINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ProductPUIDFeature__ValuesAssignment_3_17020); 
             after(grammarAccess.getProductPUIDFeatureAccess().getValuesINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductPUIDFeature__ValuesAssignment_3_1"


    // $ANTLR start "rule__TargetGroupFeature__NameAssignment_0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3529:1: rule__TargetGroupFeature__NameAssignment_0 : ( ( 'TargetGroup' ) ) ;
    public final void rule__TargetGroupFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3533:1: ( ( ( 'TargetGroup' ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3534:1: ( ( 'TargetGroup' ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3534:1: ( ( 'TargetGroup' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3535:1: ( 'TargetGroup' )
            {
             before(grammarAccess.getTargetGroupFeatureAccess().getNameTargetGroupKeyword_0_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3536:1: ( 'TargetGroup' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3537:1: 'TargetGroup'
            {
             before(grammarAccess.getTargetGroupFeatureAccess().getNameTargetGroupKeyword_0_0()); 
            match(input,27,FOLLOW_27_in_rule__TargetGroupFeature__NameAssignment_07056); 
             after(grammarAccess.getTargetGroupFeatureAccess().getNameTargetGroupKeyword_0_0()); 

            }

             after(grammarAccess.getTargetGroupFeatureAccess().getNameTargetGroupKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetGroupFeature__NameAssignment_0"


    // $ANTLR start "rule__TargetGroupFeature__ValueAssignment_2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3552:1: rule__TargetGroupFeature__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__TargetGroupFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3556:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3557:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3557:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3558:1: RULE_ID
            {
             before(grammarAccess.getTargetGroupFeatureAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TargetGroupFeature__ValueAssignment_27095); 
             after(grammarAccess.getTargetGroupFeatureAccess().getValueIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetGroupFeature__ValueAssignment_2"


    // $ANTLR start "rule__Drive__NameAssignment_0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3567:1: rule__Drive__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Drive__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3571:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3572:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3572:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3573:1: RULE_ID
            {
             before(grammarAccess.getDriveAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Drive__NameAssignment_07126); 
             after(grammarAccess.getDriveAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__NameAssignment_0"


    // $ANTLR start "rule__Drive__TypeFeatureAssignment_2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3582:1: rule__Drive__TypeFeatureAssignment_2 : ( ruleTypeFeature ) ;
    public final void rule__Drive__TypeFeatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3586:1: ( ( ruleTypeFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3587:1: ( ruleTypeFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3587:1: ( ruleTypeFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3588:1: ruleTypeFeature
            {
             before(grammarAccess.getDriveAccess().getTypeFeatureTypeFeatureParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeFeature_in_rule__Drive__TypeFeatureAssignment_27157);
            ruleTypeFeature();

            state._fsp--;

             after(grammarAccess.getDriveAccess().getTypeFeatureTypeFeatureParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__TypeFeatureAssignment_2"


    // $ANTLR start "rule__Drive__SizeFeatureAssignment_3"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3597:1: rule__Drive__SizeFeatureAssignment_3 : ( ruleSizeFeature ) ;
    public final void rule__Drive__SizeFeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3601:1: ( ( ruleSizeFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3602:1: ( ruleSizeFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3602:1: ( ruleSizeFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3603:1: ruleSizeFeature
            {
             before(grammarAccess.getDriveAccess().getSizeFeatureSizeFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSizeFeature_in_rule__Drive__SizeFeatureAssignment_37188);
            ruleSizeFeature();

            state._fsp--;

             after(grammarAccess.getDriveAccess().getSizeFeatureSizeFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__SizeFeatureAssignment_3"


    // $ANTLR start "rule__Drive__SpeedFeatureAssignment_4"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3612:1: rule__Drive__SpeedFeatureAssignment_4 : ( ruleSpeedFeature ) ;
    public final void rule__Drive__SpeedFeatureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3616:1: ( ( ruleSpeedFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3617:1: ( ruleSpeedFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3617:1: ( ruleSpeedFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3618:1: ruleSpeedFeature
            {
             before(grammarAccess.getDriveAccess().getSpeedFeatureSpeedFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSpeedFeature_in_rule__Drive__SpeedFeatureAssignment_47219);
            ruleSpeedFeature();

            state._fsp--;

             after(grammarAccess.getDriveAccess().getSpeedFeatureSpeedFeatureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__SpeedFeatureAssignment_4"


    // $ANTLR start "rule__Drive__FormFeatureAssignment_5"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3627:1: rule__Drive__FormFeatureAssignment_5 : ( ruleFormFeature ) ;
    public final void rule__Drive__FormFeatureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3631:1: ( ( ruleFormFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3632:1: ( ruleFormFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3632:1: ( ruleFormFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3633:1: ruleFormFeature
            {
             before(grammarAccess.getDriveAccess().getFormFeatureFormFeatureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFormFeature_in_rule__Drive__FormFeatureAssignment_57250);
            ruleFormFeature();

            state._fsp--;

             after(grammarAccess.getDriveAccess().getFormFeatureFormFeatureParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drive__FormFeatureAssignment_5"


    // $ANTLR start "rule__FormFeature__NameAssignment_0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3642:1: rule__FormFeature__NameAssignment_0 : ( ( 'formFactor' ) ) ;
    public final void rule__FormFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3646:1: ( ( ( 'formFactor' ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3647:1: ( ( 'formFactor' ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3647:1: ( ( 'formFactor' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3648:1: ( 'formFactor' )
            {
             before(grammarAccess.getFormFeatureAccess().getNameFormFactorKeyword_0_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3649:1: ( 'formFactor' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3650:1: 'formFactor'
            {
             before(grammarAccess.getFormFeatureAccess().getNameFormFactorKeyword_0_0()); 
            match(input,28,FOLLOW_28_in_rule__FormFeature__NameAssignment_07286); 
             after(grammarAccess.getFormFeatureAccess().getNameFormFactorKeyword_0_0()); 

            }

             after(grammarAccess.getFormFeatureAccess().getNameFormFactorKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFeature__NameAssignment_0"


    // $ANTLR start "rule__FormFeature__ValueAssignment_2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3665:1: rule__FormFeature__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__FormFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3669:1: ( ( RULE_INT ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3670:1: ( RULE_INT )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3670:1: ( RULE_INT )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3671:1: RULE_INT
            {
             before(grammarAccess.getFormFeatureAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FormFeature__ValueAssignment_27325); 
             after(grammarAccess.getFormFeatureAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormFeature__ValueAssignment_2"


    // $ANTLR start "rule__SpeedFeature__NameAssignment_0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3680:1: rule__SpeedFeature__NameAssignment_0 : ( ( 'speed' ) ) ;
    public final void rule__SpeedFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3684:1: ( ( ( 'speed' ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3685:1: ( ( 'speed' ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3685:1: ( ( 'speed' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3686:1: ( 'speed' )
            {
             before(grammarAccess.getSpeedFeatureAccess().getNameSpeedKeyword_0_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3687:1: ( 'speed' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3688:1: 'speed'
            {
             before(grammarAccess.getSpeedFeatureAccess().getNameSpeedKeyword_0_0()); 
            match(input,29,FOLLOW_29_in_rule__SpeedFeature__NameAssignment_07361); 
             after(grammarAccess.getSpeedFeatureAccess().getNameSpeedKeyword_0_0()); 

            }

             after(grammarAccess.getSpeedFeatureAccess().getNameSpeedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedFeature__NameAssignment_0"


    // $ANTLR start "rule__SpeedFeature__ValueAssignment_2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3703:1: rule__SpeedFeature__ValueAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__SpeedFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3707:1: ( ( ruleDOUBLE ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3708:1: ( ruleDOUBLE )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3708:1: ( ruleDOUBLE )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3709:1: ruleDOUBLE
            {
             before(grammarAccess.getSpeedFeatureAccess().getValueDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__SpeedFeature__ValueAssignment_27400);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getSpeedFeatureAccess().getValueDOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpeedFeature__ValueAssignment_2"


    // $ANTLR start "rule__SizeFeature__NameAssignment_0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3718:1: rule__SizeFeature__NameAssignment_0 : ( ( 'size' ) ) ;
    public final void rule__SizeFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3722:1: ( ( ( 'size' ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3723:1: ( ( 'size' ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3723:1: ( ( 'size' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3724:1: ( 'size' )
            {
             before(grammarAccess.getSizeFeatureAccess().getNameSizeKeyword_0_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3725:1: ( 'size' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3726:1: 'size'
            {
             before(grammarAccess.getSizeFeatureAccess().getNameSizeKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__SizeFeature__NameAssignment_07436); 
             after(grammarAccess.getSizeFeatureAccess().getNameSizeKeyword_0_0()); 

            }

             after(grammarAccess.getSizeFeatureAccess().getNameSizeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeFeature__NameAssignment_0"


    // $ANTLR start "rule__SizeFeature__ValueAssignment_2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3741:1: rule__SizeFeature__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__SizeFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3745:1: ( ( RULE_INT ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3746:1: ( RULE_INT )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3746:1: ( RULE_INT )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3747:1: RULE_INT
            {
             before(grammarAccess.getSizeFeatureAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SizeFeature__ValueAssignment_27475); 
             after(grammarAccess.getSizeFeatureAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SizeFeature__ValueAssignment_2"


    // $ANTLR start "rule__TypeFeature__NameAssignment_0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3756:1: rule__TypeFeature__NameAssignment_0 : ( ( 'type' ) ) ;
    public final void rule__TypeFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3760:1: ( ( ( 'type' ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3761:1: ( ( 'type' ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3761:1: ( ( 'type' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3762:1: ( 'type' )
            {
             before(grammarAccess.getTypeFeatureAccess().getNameTypeKeyword_0_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3763:1: ( 'type' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3764:1: 'type'
            {
             before(grammarAccess.getTypeFeatureAccess().getNameTypeKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__TypeFeature__NameAssignment_07511); 
             after(grammarAccess.getTypeFeatureAccess().getNameTypeKeyword_0_0()); 

            }

             after(grammarAccess.getTypeFeatureAccess().getNameTypeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFeature__NameAssignment_0"


    // $ANTLR start "rule__TypeFeature__ValueAssignment_2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3779:1: rule__TypeFeature__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TypeFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3783:1: ( ( RULE_STRING ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3784:1: ( RULE_STRING )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3784:1: ( RULE_STRING )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3785:1: RULE_STRING
            {
             before(grammarAccess.getTypeFeatureAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypeFeature__ValueAssignment_27550); 
             after(grammarAccess.getTypeFeatureAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeFeature__ValueAssignment_2"


    // $ANTLR start "rule__Cable__NameAssignment_0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3794:1: rule__Cable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Cable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3798:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3799:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3799:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3800:1: RULE_ID
            {
             before(grammarAccess.getCableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Cable__NameAssignment_07581); 
             after(grammarAccess.getCableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cable__NameAssignment_0"


    // $ANTLR start "rule__Cable__ColorFeatureAssignment_2"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3809:1: rule__Cable__ColorFeatureAssignment_2 : ( ruleColorFeature ) ;
    public final void rule__Cable__ColorFeatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3813:1: ( ( ruleColorFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3814:1: ( ruleColorFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3814:1: ( ruleColorFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3815:1: ruleColorFeature
            {
             before(grammarAccess.getCableAccess().getColorFeatureColorFeatureParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleColorFeature_in_rule__Cable__ColorFeatureAssignment_27612);
            ruleColorFeature();

            state._fsp--;

             after(grammarAccess.getCableAccess().getColorFeatureColorFeatureParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cable__ColorFeatureAssignment_2"


    // $ANTLR start "rule__Cable__NetworkFeatureAssignment_3"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3824:1: rule__Cable__NetworkFeatureAssignment_3 : ( ruleNetWorkFeature ) ;
    public final void rule__Cable__NetworkFeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3828:1: ( ( ruleNetWorkFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3829:1: ( ruleNetWorkFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3829:1: ( ruleNetWorkFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3830:1: ruleNetWorkFeature
            {
             before(grammarAccess.getCableAccess().getNetworkFeatureNetWorkFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNetWorkFeature_in_rule__Cable__NetworkFeatureAssignment_37643);
            ruleNetWorkFeature();

            state._fsp--;

             after(grammarAccess.getCableAccess().getNetworkFeatureNetWorkFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cable__NetworkFeatureAssignment_3"


    // $ANTLR start "rule__Cable__LengthFeatureAssignment_4"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3839:1: rule__Cable__LengthFeatureAssignment_4 : ( ruleLengthFeature ) ;
    public final void rule__Cable__LengthFeatureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3843:1: ( ( ruleLengthFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3844:1: ( ruleLengthFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3844:1: ( ruleLengthFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3845:1: ruleLengthFeature
            {
             before(grammarAccess.getCableAccess().getLengthFeatureLengthFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleLengthFeature_in_rule__Cable__LengthFeatureAssignment_47674);
            ruleLengthFeature();

            state._fsp--;

             after(grammarAccess.getCableAccess().getLengthFeatureLengthFeatureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cable__LengthFeatureAssignment_4"


    // $ANTLR start "rule__PriceRule__NameAssignment_1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3854:1: rule__PriceRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PriceRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3858:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3859:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3859:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3860:1: RULE_ID
            {
             before(grammarAccess.getPriceRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PriceRule__NameAssignment_17705); 
             after(grammarAccess.getPriceRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__NameAssignment_1"


    // $ANTLR start "rule__PriceRule__SuperTypeAssignment_2_1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3869:1: rule__PriceRule__SuperTypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PriceRule__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3873:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3874:1: ( ( ruleQualifiedName ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3874:1: ( ( ruleQualifiedName ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3875:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getPriceRuleAccess().getSuperTypeMinMaxCrossReference_2_1_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3876:1: ( ruleQualifiedName )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3877:1: ruleQualifiedName
            {
             before(grammarAccess.getPriceRuleAccess().getSuperTypeMinMaxQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PriceRule__SuperTypeAssignment_2_17740);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPriceRuleAccess().getSuperTypeMinMaxQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getPriceRuleAccess().getSuperTypeMinMaxCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__PriceRule__FeaturesAssignment_4"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3888:1: rule__PriceRule__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__PriceRule__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3892:1: ( ( ruleFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3893:1: ( ruleFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3893:1: ( ruleFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3894:1: ruleFeature
            {
             before(grammarAccess.getPriceRuleAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__PriceRule__FeaturesAssignment_47775);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getPriceRuleAccess().getFeaturesFeatureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PriceRule__FeaturesAssignment_4"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3903:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3907:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3908:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3908:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3909:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_17806); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3918:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3922:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3923:1: ( ( ruleQualifiedName ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3923:1: ( ( ruleQualifiedName ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3924:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeSuperEntityCrossReference_2_1_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3925:1: ( ruleQualifiedName )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3926:1: ruleQualifiedName
            {
             before(grammarAccess.getEntityAccess().getSuperTypeSuperEntityQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Entity__SuperTypeAssignment_2_17841);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getSuperTypeSuperEntityQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeSuperEntityCrossReference_2_1_0()); 

            }


            }

        }
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3937:1: rule__Entity__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3941:1: ( ( ruleFeature ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3942:1: ( ruleFeature )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3942:1: ( ruleFeature )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3943:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_47876);
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


    // $ANTLR start "rule__Feature__NameAssignment_0"
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3952:1: rule__Feature__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3956:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3957:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3957:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3958:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_07907); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3967:1: rule__Feature__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__Feature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3971:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3972:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3972:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3973:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__ValueAssignment_27938); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3982:1: rule__LengthFeature__NameAssignment_0 : ( ( 'length' ) ) ;
    public final void rule__LengthFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3986:1: ( ( ( 'length' ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3987:1: ( ( 'length' ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3987:1: ( ( 'length' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3988:1: ( 'length' )
            {
             before(grammarAccess.getLengthFeatureAccess().getNameLengthKeyword_0_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3989:1: ( 'length' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:3990:1: 'length'
            {
             before(grammarAccess.getLengthFeatureAccess().getNameLengthKeyword_0_0()); 
            match(input,32,FOLLOW_32_in_rule__LengthFeature__NameAssignment_07974); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4005:1: rule__LengthFeature__ValueAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__LengthFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4009:1: ( ( ruleDOUBLE ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4010:1: ( ruleDOUBLE )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4010:1: ( ruleDOUBLE )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4011:1: ruleDOUBLE
            {
             before(grammarAccess.getLengthFeatureAccess().getValueDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_rule__LengthFeature__ValueAssignment_28013);
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4020:1: rule__NetWorkFeature__NameAssignment_0 : ( ( 'network' ) ) ;
    public final void rule__NetWorkFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4024:1: ( ( ( 'network' ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4025:1: ( ( 'network' ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4025:1: ( ( 'network' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4026:1: ( 'network' )
            {
             before(grammarAccess.getNetWorkFeatureAccess().getNameNetworkKeyword_0_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4027:1: ( 'network' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4028:1: 'network'
            {
             before(grammarAccess.getNetWorkFeatureAccess().getNameNetworkKeyword_0_0()); 
            match(input,33,FOLLOW_33_in_rule__NetWorkFeature__NameAssignment_08049); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4043:1: rule__NetWorkFeature__ValueAssignment_2 : ( RULE_ID ) ;
    public final void rule__NetWorkFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4047:1: ( ( RULE_ID ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4048:1: ( RULE_ID )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4048:1: ( RULE_ID )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4049:1: RULE_ID
            {
             before(grammarAccess.getNetWorkFeatureAccess().getValueIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NetWorkFeature__ValueAssignment_28088); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4058:1: rule__ColorFeature__NameAssignment_0 : ( ( 'color' ) ) ;
    public final void rule__ColorFeature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4062:1: ( ( ( 'color' ) ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4063:1: ( ( 'color' ) )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4063:1: ( ( 'color' ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4064:1: ( 'color' )
            {
             before(grammarAccess.getColorFeatureAccess().getNameColorKeyword_0_0()); 
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4065:1: ( 'color' )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4066:1: 'color'
            {
             before(grammarAccess.getColorFeatureAccess().getNameColorKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__ColorFeature__NameAssignment_08124); 
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
    // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4081:1: rule__ColorFeature__ValueAssignment_2 : ( ruleColor ) ;
    public final void rule__ColorFeature__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4085:1: ( ( ruleColor ) )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4086:1: ( ruleColor )
            {
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4086:1: ( ruleColor )
            // ../org.zhouxuan.example.myaml.ui/src-gen/org/zhouxuan/example/myaml/ui/contentassist/antlr/internal/InternalAml.g:4087:1: ruleColor
            {
             before(grammarAccess.getColorFeatureAccess().getValueColorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleColor_in_rule__ColorFeature__ValueAssignment_28163);
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
    public static final BitSet FOLLOW_rule__Aml__ElementsAssignment_in_ruleAml103 = new BitSet(new long[]{0x0000000000500012L});
    public static final BitSet FOLLOW_ruleAbstractElements_in_entryRuleAbstractElements131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElements138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElements__Alternatives_in_ruleAbstractElements164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinMax_in_entryRuleMinMax191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinMax198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinMax__Group__0_in_ruleMinMax224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxFeature_in_entryRuleMaxFeature251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxFeature258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaxFeature__Group__0_in_ruleMaxFeature284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProductPUIDFeature_in_entryRuleProductPUIDFeature311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProductPUIDFeature318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductPUIDFeature__Group__0_in_ruleProductPUIDFeature344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetGroupFeature_in_entryRuleTargetGroupFeature371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetGroupFeature378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetGroupFeature__Group__0_in_ruleTargetGroupFeature404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDrive_in_entryRuleDrive431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDrive438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Drive__Group__0_in_ruleDrive464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormFeature_in_entryRuleFormFeature491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormFeature498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormFeature__Group__0_in_ruleFormFeature524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpeedFeature_in_entryRuleSpeedFeature551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpeedFeature558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpeedFeature__Group__0_in_ruleSpeedFeature584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSizeFeature_in_entryRuleSizeFeature611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSizeFeature618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SizeFeature__Group__0_in_ruleSizeFeature644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFeature_in_entryRuleTypeFeature671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeFeature678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFeature__Group__0_in_ruleTypeFeature704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCable_in_entryRuleCable731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCable738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cable__Group__0_in_ruleCable764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePriceRule_in_entryRulePriceRule791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePriceRule798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PriceRule__Group__0_in_rulePriceRule824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLengthFeature_in_entryRuleLengthFeature1031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLengthFeature1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__0_in_ruleLengthFeature1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE1091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0_in_ruleDOUBLE1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNetWorkFeature_in_entryRuleNetWorkFeature1151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNetWorkFeature1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__0_in_ruleNetWorkFeature1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_entryRuleColorFeature1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorFeature1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__0_in_ruleColorFeature1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperEntity_in_entryRuleSuperEntity1271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuperEntity1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SuperEntity__Alternatives_in_ruleSuperEntity1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Alternatives_in_ruleColor1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__AbstractElements__Alternatives1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePriceRule_in_rule__AbstractElements__Alternatives1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperEntity_in_rule__AbstractElements__Alternatives1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinMax_in_rule__AbstractElements__Alternatives1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCable_in_rule__SuperEntity__Alternatives1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDrive_in_rule__SuperEntity__Alternatives1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Color__Alternatives1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Color__Alternatives1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Color__Alternatives1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Color__Alternatives1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Color__Alternatives1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinMax__Group__0__Impl_in_rule__MinMax__Group__01626 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__MinMax__Group__1_in_rule__MinMax__Group__01629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinMax__NameAssignment_0_in_rule__MinMax__Group__0__Impl1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinMax__Group__1__Impl_in_rule__MinMax__Group__11686 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__MinMax__Group__2_in_rule__MinMax__Group__11689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MinMax__Group__1__Impl1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinMax__Group__2__Impl_in_rule__MinMax__Group__21748 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__MinMax__Group__3_in_rule__MinMax__Group__21751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinMax__TargetGroupFeatureAssignment_2_in_rule__MinMax__Group__2__Impl1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinMax__Group__3__Impl_in_rule__MinMax__Group__31808 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MinMax__Group__4_in_rule__MinMax__Group__31811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinMax__ProductPuidsFeatureAssignment_3_in_rule__MinMax__Group__3__Impl1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinMax__Group__4__Impl_in_rule__MinMax__Group__41868 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__MinMax__Group__5_in_rule__MinMax__Group__41871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinMax__MaxFeatureAssignment_4_in_rule__MinMax__Group__4__Impl1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MinMax__Group__5__Impl_in_rule__MinMax__Group__51928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MinMax__Group__5__Impl1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaxFeature__Group__0__Impl_in_rule__MaxFeature__Group__01999 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__MaxFeature__Group__1_in_rule__MaxFeature__Group__02002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaxFeature__NameAssignment_0_in_rule__MaxFeature__Group__0__Impl2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaxFeature__Group__1__Impl_in_rule__MaxFeature__Group__12059 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MaxFeature__Group__2_in_rule__MaxFeature__Group__12062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MaxFeature__Group__1__Impl2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaxFeature__Group__2__Impl_in_rule__MaxFeature__Group__22121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MaxFeature__ValueAssignment_2_in_rule__MaxFeature__Group__2__Impl2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductPUIDFeature__Group__0__Impl_in_rule__ProductPUIDFeature__Group__02184 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ProductPUIDFeature__Group__1_in_rule__ProductPUIDFeature__Group__02187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductPUIDFeature__NameAssignment_0_in_rule__ProductPUIDFeature__Group__0__Impl2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductPUIDFeature__Group__1__Impl_in_rule__ProductPUIDFeature__Group__12244 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProductPUIDFeature__Group__2_in_rule__ProductPUIDFeature__Group__12247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ProductPUIDFeature__Group__1__Impl2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductPUIDFeature__Group__2__Impl_in_rule__ProductPUIDFeature__Group__22306 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ProductPUIDFeature__Group__3_in_rule__ProductPUIDFeature__Group__22309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductPUIDFeature__ValuesAssignment_2_in_rule__ProductPUIDFeature__Group__2__Impl2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductPUIDFeature__Group__3__Impl_in_rule__ProductPUIDFeature__Group__32366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductPUIDFeature__Group_3__0_in_rule__ProductPUIDFeature__Group__3__Impl2393 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__ProductPUIDFeature__Group_3__0__Impl_in_rule__ProductPUIDFeature__Group_3__02432 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProductPUIDFeature__Group_3__1_in_rule__ProductPUIDFeature__Group_3__02435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ProductPUIDFeature__Group_3__0__Impl2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductPUIDFeature__Group_3__1__Impl_in_rule__ProductPUIDFeature__Group_3__12494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductPUIDFeature__ValuesAssignment_3_1_in_rule__ProductPUIDFeature__Group_3__1__Impl2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetGroupFeature__Group__0__Impl_in_rule__TargetGroupFeature__Group__02555 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__TargetGroupFeature__Group__1_in_rule__TargetGroupFeature__Group__02558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetGroupFeature__NameAssignment_0_in_rule__TargetGroupFeature__Group__0__Impl2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetGroupFeature__Group__1__Impl_in_rule__TargetGroupFeature__Group__12615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TargetGroupFeature__Group__2_in_rule__TargetGroupFeature__Group__12618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TargetGroupFeature__Group__1__Impl2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetGroupFeature__Group__2__Impl_in_rule__TargetGroupFeature__Group__22677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetGroupFeature__ValueAssignment_2_in_rule__TargetGroupFeature__Group__2__Impl2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Drive__Group__0__Impl_in_rule__Drive__Group__02740 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Drive__Group__1_in_rule__Drive__Group__02743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Drive__NameAssignment_0_in_rule__Drive__Group__0__Impl2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Drive__Group__1__Impl_in_rule__Drive__Group__12800 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Drive__Group__2_in_rule__Drive__Group__12803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Drive__Group__1__Impl2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Drive__Group__2__Impl_in_rule__Drive__Group__22862 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Drive__Group__3_in_rule__Drive__Group__22865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Drive__TypeFeatureAssignment_2_in_rule__Drive__Group__2__Impl2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Drive__Group__3__Impl_in_rule__Drive__Group__32922 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Drive__Group__4_in_rule__Drive__Group__32925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Drive__SizeFeatureAssignment_3_in_rule__Drive__Group__3__Impl2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Drive__Group__4__Impl_in_rule__Drive__Group__42982 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Drive__Group__5_in_rule__Drive__Group__42985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Drive__SpeedFeatureAssignment_4_in_rule__Drive__Group__4__Impl3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Drive__Group__5__Impl_in_rule__Drive__Group__53042 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Drive__Group__6_in_rule__Drive__Group__53045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Drive__FormFeatureAssignment_5_in_rule__Drive__Group__5__Impl3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Drive__Group__6__Impl_in_rule__Drive__Group__63102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Drive__Group__6__Impl3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormFeature__Group__0__Impl_in_rule__FormFeature__Group__03175 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FormFeature__Group__1_in_rule__FormFeature__Group__03178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormFeature__NameAssignment_0_in_rule__FormFeature__Group__0__Impl3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormFeature__Group__1__Impl_in_rule__FormFeature__Group__13235 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FormFeature__Group__2_in_rule__FormFeature__Group__13238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FormFeature__Group__1__Impl3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormFeature__Group__2__Impl_in_rule__FormFeature__Group__23297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormFeature__ValueAssignment_2_in_rule__FormFeature__Group__2__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpeedFeature__Group__0__Impl_in_rule__SpeedFeature__Group__03360 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SpeedFeature__Group__1_in_rule__SpeedFeature__Group__03363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpeedFeature__NameAssignment_0_in_rule__SpeedFeature__Group__0__Impl3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpeedFeature__Group__1__Impl_in_rule__SpeedFeature__Group__13420 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SpeedFeature__Group__2_in_rule__SpeedFeature__Group__13423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SpeedFeature__Group__1__Impl3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpeedFeature__Group__2__Impl_in_rule__SpeedFeature__Group__23482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpeedFeature__ValueAssignment_2_in_rule__SpeedFeature__Group__2__Impl3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SizeFeature__Group__0__Impl_in_rule__SizeFeature__Group__03545 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SizeFeature__Group__1_in_rule__SizeFeature__Group__03548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SizeFeature__NameAssignment_0_in_rule__SizeFeature__Group__0__Impl3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SizeFeature__Group__1__Impl_in_rule__SizeFeature__Group__13605 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SizeFeature__Group__2_in_rule__SizeFeature__Group__13608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SizeFeature__Group__1__Impl3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SizeFeature__Group__2__Impl_in_rule__SizeFeature__Group__23667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SizeFeature__ValueAssignment_2_in_rule__SizeFeature__Group__2__Impl3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFeature__Group__0__Impl_in_rule__TypeFeature__Group__03730 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__TypeFeature__Group__1_in_rule__TypeFeature__Group__03733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFeature__NameAssignment_0_in_rule__TypeFeature__Group__0__Impl3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFeature__Group__1__Impl_in_rule__TypeFeature__Group__13790 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TypeFeature__Group__2_in_rule__TypeFeature__Group__13793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TypeFeature__Group__1__Impl3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFeature__Group__2__Impl_in_rule__TypeFeature__Group__23852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeFeature__ValueAssignment_2_in_rule__TypeFeature__Group__2__Impl3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cable__Group__0__Impl_in_rule__Cable__Group__03915 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Cable__Group__1_in_rule__Cable__Group__03918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cable__NameAssignment_0_in_rule__Cable__Group__0__Impl3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cable__Group__1__Impl_in_rule__Cable__Group__13975 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Cable__Group__2_in_rule__Cable__Group__13978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Cable__Group__1__Impl4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cable__Group__2__Impl_in_rule__Cable__Group__24037 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Cable__Group__3_in_rule__Cable__Group__24040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cable__ColorFeatureAssignment_2_in_rule__Cable__Group__2__Impl4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cable__Group__3__Impl_in_rule__Cable__Group__34097 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Cable__Group__4_in_rule__Cable__Group__34100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cable__NetworkFeatureAssignment_3_in_rule__Cable__Group__3__Impl4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cable__Group__4__Impl_in_rule__Cable__Group__44157 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Cable__Group__5_in_rule__Cable__Group__44160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cable__LengthFeatureAssignment_4_in_rule__Cable__Group__4__Impl4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cable__Group__5__Impl_in_rule__Cable__Group__54217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Cable__Group__5__Impl4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PriceRule__Group__0__Impl_in_rule__PriceRule__Group__04288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PriceRule__Group__1_in_rule__PriceRule__Group__04291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PriceRule__Group__0__Impl4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PriceRule__Group__1__Impl_in_rule__PriceRule__Group__14350 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_rule__PriceRule__Group__2_in_rule__PriceRule__Group__14353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PriceRule__NameAssignment_1_in_rule__PriceRule__Group__1__Impl4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PriceRule__Group__2__Impl_in_rule__PriceRule__Group__24410 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_rule__PriceRule__Group__3_in_rule__PriceRule__Group__24413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PriceRule__Group_2__0_in_rule__PriceRule__Group__2__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PriceRule__Group__3__Impl_in_rule__PriceRule__Group__34471 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__PriceRule__Group__4_in_rule__PriceRule__Group__34474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PriceRule__Group__3__Impl4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PriceRule__Group__4__Impl_in_rule__PriceRule__Group__44533 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__PriceRule__Group__5_in_rule__PriceRule__Group__44536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PriceRule__FeaturesAssignment_4_in_rule__PriceRule__Group__4__Impl4563 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__PriceRule__Group__5__Impl_in_rule__PriceRule__Group__54594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PriceRule__Group__5__Impl4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PriceRule__Group_2__0__Impl_in_rule__PriceRule__Group_2__04665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PriceRule__Group_2__1_in_rule__PriceRule__Group_2__04668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PriceRule__Group_2__0__Impl4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PriceRule__Group_2__1__Impl_in_rule__PriceRule__Group_2__14727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PriceRule__SuperTypeAssignment_2_1_in_rule__PriceRule__Group_2__1__Impl4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__04788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__04791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Entity__Group__0__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__14850 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__14853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__24910 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__24913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__34971 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__34974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group__3__Impl5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__45033 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__45036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_4_in_rule__Entity__Group__4__Impl5063 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__55094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group__5__Impl5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__05165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__05168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group_2__0__Impl5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__15227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__05288 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__05291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5374 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__QualifiedName__Group_1__0__Impl5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__05531 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__05534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_0_in_rule__Feature__Group__0__Impl5561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__15591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__15594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Feature__Group__1__Impl5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__25653 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__25656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ValueAssignment_2_in_rule__Feature__Group__2__Impl5683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__35713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Feature__Group__3__Impl5741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__0__Impl_in_rule__LengthFeature__Group__05780 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__1_in_rule__LengthFeature__Group__05783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__NameAssignment_0_in_rule__LengthFeature__Group__0__Impl5810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__1__Impl_in_rule__LengthFeature__Group__15840 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__2_in_rule__LengthFeature__Group__15843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__LengthFeature__Group__1__Impl5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__2__Impl_in_rule__LengthFeature__Group__25902 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__3_in_rule__LengthFeature__Group__25905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__ValueAssignment_2_in_rule__LengthFeature__Group__2__Impl5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LengthFeature__Group__3__Impl_in_rule__LengthFeature__Group__35962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LengthFeature__Group__3__Impl5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__0__Impl_in_rule__DOUBLE__Group__06029 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1_in_rule__DOUBLE__Group__06032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group__0__Impl6059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__1__Impl_in_rule__DOUBLE__Group__16088 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__2_in_rule__DOUBLE__Group__16091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DOUBLE__Group__1__Impl6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DOUBLE__Group__2__Impl_in_rule__DOUBLE__Group__26150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DOUBLE__Group__2__Impl6177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__0__Impl_in_rule__NetWorkFeature__Group__06212 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__1_in_rule__NetWorkFeature__Group__06215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__NameAssignment_0_in_rule__NetWorkFeature__Group__0__Impl6242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__1__Impl_in_rule__NetWorkFeature__Group__16272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__2_in_rule__NetWorkFeature__Group__16275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NetWorkFeature__Group__1__Impl6303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__2__Impl_in_rule__NetWorkFeature__Group__26334 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__3_in_rule__NetWorkFeature__Group__26337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__ValueAssignment_2_in_rule__NetWorkFeature__Group__2__Impl6364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NetWorkFeature__Group__3__Impl_in_rule__NetWorkFeature__Group__36394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__NetWorkFeature__Group__3__Impl6422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__0__Impl_in_rule__ColorFeature__Group__06461 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__1_in_rule__ColorFeature__Group__06464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__NameAssignment_0_in_rule__ColorFeature__Group__0__Impl6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__1__Impl_in_rule__ColorFeature__Group__16521 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__2_in_rule__ColorFeature__Group__16524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ColorFeature__Group__1__Impl6552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__2__Impl_in_rule__ColorFeature__Group__26583 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__3_in_rule__ColorFeature__Group__26586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__ValueAssignment_2_in_rule__ColorFeature__Group__2__Impl6613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColorFeature__Group__3__Impl_in_rule__ColorFeature__Group__36643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ColorFeature__Group__3__Impl6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElements_in_rule__Aml__ElementsAssignment6715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MinMax__NameAssignment_06746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetGroupFeature_in_rule__MinMax__TargetGroupFeatureAssignment_26777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProductPUIDFeature_in_rule__MinMax__ProductPuidsFeatureAssignment_36808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxFeature_in_rule__MinMax__MaxFeatureAssignment_46839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MaxFeature__NameAssignment_06875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__MaxFeature__ValueAssignment_26914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ProductPUIDFeature__NameAssignment_06950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ProductPUIDFeature__ValuesAssignment_26989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ProductPUIDFeature__ValuesAssignment_3_17020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TargetGroupFeature__NameAssignment_07056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TargetGroupFeature__ValueAssignment_27095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Drive__NameAssignment_07126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFeature_in_rule__Drive__TypeFeatureAssignment_27157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSizeFeature_in_rule__Drive__SizeFeatureAssignment_37188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpeedFeature_in_rule__Drive__SpeedFeatureAssignment_47219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormFeature_in_rule__Drive__FormFeatureAssignment_57250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FormFeature__NameAssignment_07286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FormFeature__ValueAssignment_27325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SpeedFeature__NameAssignment_07361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__SpeedFeature__ValueAssignment_27400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SizeFeature__NameAssignment_07436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SizeFeature__ValueAssignment_27475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TypeFeature__NameAssignment_07511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypeFeature__ValueAssignment_27550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Cable__NameAssignment_07581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_rule__Cable__ColorFeatureAssignment_27612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNetWorkFeature_in_rule__Cable__NetworkFeatureAssignment_37643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLengthFeature_in_rule__Cable__LengthFeatureAssignment_47674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PriceRule__NameAssignment_17705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PriceRule__SuperTypeAssignment_2_17740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__PriceRule__FeaturesAssignment_47775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_17806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Entity__SuperTypeAssignment_2_17841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_47876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_07907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__ValueAssignment_27938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__LengthFeature__NameAssignment_07974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_rule__LengthFeature__ValueAssignment_28013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__NetWorkFeature__NameAssignment_08049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NetWorkFeature__ValueAssignment_28088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ColorFeature__NameAssignment_08124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColor_in_rule__ColorFeature__ValueAssignment_28163 = new BitSet(new long[]{0x0000000000000002L});

}