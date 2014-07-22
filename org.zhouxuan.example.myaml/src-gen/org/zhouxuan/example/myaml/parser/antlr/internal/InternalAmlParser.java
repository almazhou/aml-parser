package org.zhouxuan.example.myaml.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.zhouxuan.example.myaml.services.AmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAmlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'Max'", "'='", "'ProductPUIDs'", "','", "'TargetGroup'", "'formFactor'", "'speed'", "'size'", "'type'", "'rule'", "'extends'", "'puid'", "'.'", "';'", "'length'", "'network'", "'color'", "'Red'", "'Black'", "'White'", "'Grey'", "'Green'"
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
    public String getGrammarFileName() { return "../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g"; }



     	private AmlGrammarAccess grammarAccess;
     	
        public InternalAmlParser(TokenStream input, AmlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Aml";	
       	}
       	
       	@Override
       	protected AmlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAml"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:68:1: entryRuleAml returns [EObject current=null] : iv_ruleAml= ruleAml EOF ;
    public final EObject entryRuleAml() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAml = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        	
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:72:2: (iv_ruleAml= ruleAml EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:73:2: iv_ruleAml= ruleAml EOF
            {
             newCompositeNode(grammarAccess.getAmlRule()); 
            pushFollow(FOLLOW_ruleAml_in_entryRuleAml81);
            iv_ruleAml=ruleAml();

            state._fsp--;

             current =iv_ruleAml; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAml91); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleAml"


    // $ANTLR start "ruleAml"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:83:1: ruleAml returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElements ) )* ;
    public final EObject ruleAml() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:87:28: ( ( (lv_elements_0_0= ruleAbstractElements ) )* )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:88:1: ( (lv_elements_0_0= ruleAbstractElements ) )*
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:88:1: ( (lv_elements_0_0= ruleAbstractElements ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==22||LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:89:1: (lv_elements_0_0= ruleAbstractElements )
            	    {
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:89:1: (lv_elements_0_0= ruleAbstractElements )
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:90:3: lv_elements_0_0= ruleAbstractElements
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAmlAccess().getElementsAbstractElementsParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElements_in_ruleAml140);
            	    lv_elements_0_0=ruleAbstractElements();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAmlRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"AbstractElements");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleAml"


    // $ANTLR start "entryRuleAbstractElements"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:117:1: entryRuleAbstractElements returns [EObject current=null] : iv_ruleAbstractElements= ruleAbstractElements EOF ;
    public final EObject entryRuleAbstractElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElements = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:118:2: (iv_ruleAbstractElements= ruleAbstractElements EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:119:2: iv_ruleAbstractElements= ruleAbstractElements EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementsRule()); 
            pushFollow(FOLLOW_ruleAbstractElements_in_entryRuleAbstractElements180);
            iv_ruleAbstractElements=ruleAbstractElements();

            state._fsp--;

             current =iv_ruleAbstractElements; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElements190); 

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
    // $ANTLR end "entryRuleAbstractElements"


    // $ANTLR start "ruleAbstractElements"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:126:1: ruleAbstractElements returns [EObject current=null] : (this_Entity_0= ruleEntity | this_PriceRule_1= rulePriceRule | this_SuperEntity_2= ruleSuperEntity | this_MinMax_3= ruleMinMax ) ;
    public final EObject ruleAbstractElements() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_PriceRule_1 = null;

        EObject this_SuperEntity_2 = null;

        EObject this_MinMax_3 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:129:28: ( (this_Entity_0= ruleEntity | this_PriceRule_1= rulePriceRule | this_SuperEntity_2= ruleSuperEntity | this_MinMax_3= ruleMinMax ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:130:1: (this_Entity_0= ruleEntity | this_PriceRule_1= rulePriceRule | this_SuperEntity_2= ruleSuperEntity | this_MinMax_3= ruleMinMax )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:130:1: (this_Entity_0= ruleEntity | this_PriceRule_1= rulePriceRule | this_SuperEntity_2= ruleSuperEntity | this_MinMax_3= ruleMinMax )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==11) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==21||LA2_4==29) ) {
                        alt2=3;
                    }
                    else if ( (LA2_4==17) ) {
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
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:131:5: this_Entity_0= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementsAccess().getEntityParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleAbstractElements237);
                    this_Entity_0=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:141:5: this_PriceRule_1= rulePriceRule
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementsAccess().getPriceRuleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePriceRule_in_ruleAbstractElements264);
                    this_PriceRule_1=rulePriceRule();

                    state._fsp--;

                     
                            current = this_PriceRule_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:151:5: this_SuperEntity_2= ruleSuperEntity
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementsAccess().getSuperEntityParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSuperEntity_in_ruleAbstractElements291);
                    this_SuperEntity_2=ruleSuperEntity();

                    state._fsp--;

                     
                            current = this_SuperEntity_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:161:5: this_MinMax_3= ruleMinMax
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementsAccess().getMinMaxParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMinMax_in_ruleAbstractElements318);
                    this_MinMax_3=ruleMinMax();

                    state._fsp--;

                     
                            current = this_MinMax_3; 
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
    // $ANTLR end "ruleAbstractElements"


    // $ANTLR start "entryRuleMinMax"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:177:1: entryRuleMinMax returns [EObject current=null] : iv_ruleMinMax= ruleMinMax EOF ;
    public final EObject entryRuleMinMax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinMax = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:178:2: (iv_ruleMinMax= ruleMinMax EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:179:2: iv_ruleMinMax= ruleMinMax EOF
            {
             newCompositeNode(grammarAccess.getMinMaxRule()); 
            pushFollow(FOLLOW_ruleMinMax_in_entryRuleMinMax353);
            iv_ruleMinMax=ruleMinMax();

            state._fsp--;

             current =iv_ruleMinMax; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinMax363); 

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
    // $ANTLR end "entryRuleMinMax"


    // $ANTLR start "ruleMinMax"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:186:1: ruleMinMax returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_targetGroupFeature_2_0= ruleTargetGroupFeature ) ) ( (lv_productPuidsFeature_3_0= ruleProductPUIDFeature ) ) ( (lv_maxFeature_4_0= ruleMaxFeature ) ) otherlv_5= '}' ) ;
    public final EObject ruleMinMax() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_targetGroupFeature_2_0 = null;

        EObject lv_productPuidsFeature_3_0 = null;

        EObject lv_maxFeature_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:189:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_targetGroupFeature_2_0= ruleTargetGroupFeature ) ) ( (lv_productPuidsFeature_3_0= ruleProductPUIDFeature ) ) ( (lv_maxFeature_4_0= ruleMaxFeature ) ) otherlv_5= '}' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:190:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_targetGroupFeature_2_0= ruleTargetGroupFeature ) ) ( (lv_productPuidsFeature_3_0= ruleProductPUIDFeature ) ) ( (lv_maxFeature_4_0= ruleMaxFeature ) ) otherlv_5= '}' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:190:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_targetGroupFeature_2_0= ruleTargetGroupFeature ) ) ( (lv_productPuidsFeature_3_0= ruleProductPUIDFeature ) ) ( (lv_maxFeature_4_0= ruleMaxFeature ) ) otherlv_5= '}' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:190:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_targetGroupFeature_2_0= ruleTargetGroupFeature ) ) ( (lv_productPuidsFeature_3_0= ruleProductPUIDFeature ) ) ( (lv_maxFeature_4_0= ruleMaxFeature ) ) otherlv_5= '}'
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:190:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:191:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:191:1: (lv_name_0_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:192:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMinMax405); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMinMaxAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMinMaxRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleMinMax422); 

                	newLeafNode(otherlv_1, grammarAccess.getMinMaxAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:212:1: ( (lv_targetGroupFeature_2_0= ruleTargetGroupFeature ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:213:1: (lv_targetGroupFeature_2_0= ruleTargetGroupFeature )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:213:1: (lv_targetGroupFeature_2_0= ruleTargetGroupFeature )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:214:3: lv_targetGroupFeature_2_0= ruleTargetGroupFeature
            {
             
            	        newCompositeNode(grammarAccess.getMinMaxAccess().getTargetGroupFeatureTargetGroupFeatureParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTargetGroupFeature_in_ruleMinMax443);
            lv_targetGroupFeature_2_0=ruleTargetGroupFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMinMaxRule());
            	        }
                   		set(
                   			current, 
                   			"targetGroupFeature",
                    		lv_targetGroupFeature_2_0, 
                    		"TargetGroupFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:230:2: ( (lv_productPuidsFeature_3_0= ruleProductPUIDFeature ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:231:1: (lv_productPuidsFeature_3_0= ruleProductPUIDFeature )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:231:1: (lv_productPuidsFeature_3_0= ruleProductPUIDFeature )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:232:3: lv_productPuidsFeature_3_0= ruleProductPUIDFeature
            {
             
            	        newCompositeNode(grammarAccess.getMinMaxAccess().getProductPuidsFeatureProductPUIDFeatureParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleProductPUIDFeature_in_ruleMinMax464);
            lv_productPuidsFeature_3_0=ruleProductPUIDFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMinMaxRule());
            	        }
                   		set(
                   			current, 
                   			"productPuidsFeature",
                    		lv_productPuidsFeature_3_0, 
                    		"ProductPUIDFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:248:2: ( (lv_maxFeature_4_0= ruleMaxFeature ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:249:1: (lv_maxFeature_4_0= ruleMaxFeature )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:249:1: (lv_maxFeature_4_0= ruleMaxFeature )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:250:3: lv_maxFeature_4_0= ruleMaxFeature
            {
             
            	        newCompositeNode(grammarAccess.getMinMaxAccess().getMaxFeatureMaxFeatureParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleMaxFeature_in_ruleMinMax485);
            lv_maxFeature_4_0=ruleMaxFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMinMaxRule());
            	        }
                   		set(
                   			current, 
                   			"maxFeature",
                    		lv_maxFeature_4_0, 
                    		"MaxFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleMinMax497); 

                	newLeafNode(otherlv_5, grammarAccess.getMinMaxAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleMinMax"


    // $ANTLR start "entryRuleMaxFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:278:1: entryRuleMaxFeature returns [EObject current=null] : iv_ruleMaxFeature= ruleMaxFeature EOF ;
    public final EObject entryRuleMaxFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:279:2: (iv_ruleMaxFeature= ruleMaxFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:280:2: iv_ruleMaxFeature= ruleMaxFeature EOF
            {
             newCompositeNode(grammarAccess.getMaxFeatureRule()); 
            pushFollow(FOLLOW_ruleMaxFeature_in_entryRuleMaxFeature533);
            iv_ruleMaxFeature=ruleMaxFeature();

            state._fsp--;

             current =iv_ruleMaxFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxFeature543); 

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
    // $ANTLR end "entryRuleMaxFeature"


    // $ANTLR start "ruleMaxFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:287:1: ruleMaxFeature returns [EObject current=null] : ( ( (lv_name_0_0= 'Max' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMaxFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:290:28: ( ( ( (lv_name_0_0= 'Max' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:291:1: ( ( (lv_name_0_0= 'Max' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:291:1: ( ( (lv_name_0_0= 'Max' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:291:2: ( (lv_name_0_0= 'Max' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:291:2: ( (lv_name_0_0= 'Max' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:292:1: (lv_name_0_0= 'Max' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:292:1: (lv_name_0_0= 'Max' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:293:3: lv_name_0_0= 'Max'
            {
            lv_name_0_0=(Token)match(input,13,FOLLOW_13_in_ruleMaxFeature586); 

                    newLeafNode(lv_name_0_0, grammarAccess.getMaxFeatureAccess().getNameMaxKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMaxFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "Max");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleMaxFeature611); 

                	newLeafNode(otherlv_1, grammarAccess.getMaxFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:310:1: ( (lv_value_2_0= RULE_INT ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:311:1: (lv_value_2_0= RULE_INT )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:311:1: (lv_value_2_0= RULE_INT )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:312:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMaxFeature628); 

            			newLeafNode(lv_value_2_0, grammarAccess.getMaxFeatureAccess().getValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMaxFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"INT");
            	    

            }


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
    // $ANTLR end "ruleMaxFeature"


    // $ANTLR start "entryRuleProductPUIDFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:336:1: entryRuleProductPUIDFeature returns [EObject current=null] : iv_ruleProductPUIDFeature= ruleProductPUIDFeature EOF ;
    public final EObject entryRuleProductPUIDFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductPUIDFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:337:2: (iv_ruleProductPUIDFeature= ruleProductPUIDFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:338:2: iv_ruleProductPUIDFeature= ruleProductPUIDFeature EOF
            {
             newCompositeNode(grammarAccess.getProductPUIDFeatureRule()); 
            pushFollow(FOLLOW_ruleProductPUIDFeature_in_entryRuleProductPUIDFeature669);
            iv_ruleProductPUIDFeature=ruleProductPUIDFeature();

            state._fsp--;

             current =iv_ruleProductPUIDFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProductPUIDFeature679); 

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
    // $ANTLR end "entryRuleProductPUIDFeature"


    // $ANTLR start "ruleProductPUIDFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:345:1: ruleProductPUIDFeature returns [EObject current=null] : ( ( (lv_name_0_0= 'ProductPUIDs' ) ) otherlv_1= '=' ( (lv_values_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_INT ) ) )* ) ;
    public final EObject ruleProductPUIDFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:348:28: ( ( ( (lv_name_0_0= 'ProductPUIDs' ) ) otherlv_1= '=' ( (lv_values_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_INT ) ) )* ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:349:1: ( ( (lv_name_0_0= 'ProductPUIDs' ) ) otherlv_1= '=' ( (lv_values_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_INT ) ) )* )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:349:1: ( ( (lv_name_0_0= 'ProductPUIDs' ) ) otherlv_1= '=' ( (lv_values_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_INT ) ) )* )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:349:2: ( (lv_name_0_0= 'ProductPUIDs' ) ) otherlv_1= '=' ( (lv_values_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_INT ) ) )*
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:349:2: ( (lv_name_0_0= 'ProductPUIDs' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:350:1: (lv_name_0_0= 'ProductPUIDs' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:350:1: (lv_name_0_0= 'ProductPUIDs' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:351:3: lv_name_0_0= 'ProductPUIDs'
            {
            lv_name_0_0=(Token)match(input,15,FOLLOW_15_in_ruleProductPUIDFeature722); 

                    newLeafNode(lv_name_0_0, grammarAccess.getProductPUIDFeatureAccess().getNameProductPUIDsKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductPUIDFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "ProductPUIDs");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleProductPUIDFeature747); 

                	newLeafNode(otherlv_1, grammarAccess.getProductPUIDFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:368:1: ( (lv_values_2_0= RULE_INT ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:369:1: (lv_values_2_0= RULE_INT )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:369:1: (lv_values_2_0= RULE_INT )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:370:3: lv_values_2_0= RULE_INT
            {
            lv_values_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProductPUIDFeature764); 

            			newLeafNode(lv_values_2_0, grammarAccess.getProductPUIDFeatureAccess().getValuesINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProductPUIDFeatureRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"values",
                    		lv_values_2_0, 
                    		"INT");
            	    

            }


            }

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:386:2: (otherlv_3= ',' ( (lv_values_4_0= RULE_INT ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:386:4: otherlv_3= ',' ( (lv_values_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleProductPUIDFeature782); 

            	        	newLeafNode(otherlv_3, grammarAccess.getProductPUIDFeatureAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:390:1: ( (lv_values_4_0= RULE_INT ) )
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:391:1: (lv_values_4_0= RULE_INT )
            	    {
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:391:1: (lv_values_4_0= RULE_INT )
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:392:3: lv_values_4_0= RULE_INT
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProductPUIDFeature799); 

            	    			newLeafNode(lv_values_4_0, grammarAccess.getProductPUIDFeatureAccess().getValuesINTTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getProductPUIDFeatureRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"values",
            	            		lv_values_4_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleProductPUIDFeature"


    // $ANTLR start "entryRuleTargetGroupFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:416:1: entryRuleTargetGroupFeature returns [EObject current=null] : iv_ruleTargetGroupFeature= ruleTargetGroupFeature EOF ;
    public final EObject entryRuleTargetGroupFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetGroupFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:417:2: (iv_ruleTargetGroupFeature= ruleTargetGroupFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:418:2: iv_ruleTargetGroupFeature= ruleTargetGroupFeature EOF
            {
             newCompositeNode(grammarAccess.getTargetGroupFeatureRule()); 
            pushFollow(FOLLOW_ruleTargetGroupFeature_in_entryRuleTargetGroupFeature842);
            iv_ruleTargetGroupFeature=ruleTargetGroupFeature();

            state._fsp--;

             current =iv_ruleTargetGroupFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetGroupFeature852); 

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
    // $ANTLR end "entryRuleTargetGroupFeature"


    // $ANTLR start "ruleTargetGroupFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:425:1: ruleTargetGroupFeature returns [EObject current=null] : ( ( (lv_name_0_0= 'TargetGroup' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) ) ;
    public final EObject ruleTargetGroupFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:428:28: ( ( ( (lv_name_0_0= 'TargetGroup' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:429:1: ( ( (lv_name_0_0= 'TargetGroup' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:429:1: ( ( (lv_name_0_0= 'TargetGroup' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:429:2: ( (lv_name_0_0= 'TargetGroup' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:429:2: ( (lv_name_0_0= 'TargetGroup' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:430:1: (lv_name_0_0= 'TargetGroup' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:430:1: (lv_name_0_0= 'TargetGroup' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:431:3: lv_name_0_0= 'TargetGroup'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_17_in_ruleTargetGroupFeature895); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTargetGroupFeatureAccess().getNameTargetGroupKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTargetGroupFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "TargetGroup");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleTargetGroupFeature920); 

                	newLeafNode(otherlv_1, grammarAccess.getTargetGroupFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:448:1: ( (lv_value_2_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:449:1: (lv_value_2_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:449:1: (lv_value_2_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:450:3: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTargetGroupFeature937); 

            			newLeafNode(lv_value_2_0, grammarAccess.getTargetGroupFeatureAccess().getValueIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTargetGroupFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleTargetGroupFeature"


    // $ANTLR start "entryRuleDrive"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:474:1: entryRuleDrive returns [EObject current=null] : iv_ruleDrive= ruleDrive EOF ;
    public final EObject entryRuleDrive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrive = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:475:2: (iv_ruleDrive= ruleDrive EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:476:2: iv_ruleDrive= ruleDrive EOF
            {
             newCompositeNode(grammarAccess.getDriveRule()); 
            pushFollow(FOLLOW_ruleDrive_in_entryRuleDrive978);
            iv_ruleDrive=ruleDrive();

            state._fsp--;

             current =iv_ruleDrive; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDrive988); 

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
    // $ANTLR end "entryRuleDrive"


    // $ANTLR start "ruleDrive"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:483:1: ruleDrive returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_typeFeature_2_0= ruleTypeFeature ) ) ( (lv_sizeFeature_3_0= ruleSizeFeature ) ) ( (lv_speedFeature_4_0= ruleSpeedFeature ) ) ( (lv_formFeature_5_0= ruleFormFeature ) ) otherlv_6= '}' ) ;
    public final EObject ruleDrive() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_typeFeature_2_0 = null;

        EObject lv_sizeFeature_3_0 = null;

        EObject lv_speedFeature_4_0 = null;

        EObject lv_formFeature_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:486:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_typeFeature_2_0= ruleTypeFeature ) ) ( (lv_sizeFeature_3_0= ruleSizeFeature ) ) ( (lv_speedFeature_4_0= ruleSpeedFeature ) ) ( (lv_formFeature_5_0= ruleFormFeature ) ) otherlv_6= '}' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:487:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_typeFeature_2_0= ruleTypeFeature ) ) ( (lv_sizeFeature_3_0= ruleSizeFeature ) ) ( (lv_speedFeature_4_0= ruleSpeedFeature ) ) ( (lv_formFeature_5_0= ruleFormFeature ) ) otherlv_6= '}' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:487:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_typeFeature_2_0= ruleTypeFeature ) ) ( (lv_sizeFeature_3_0= ruleSizeFeature ) ) ( (lv_speedFeature_4_0= ruleSpeedFeature ) ) ( (lv_formFeature_5_0= ruleFormFeature ) ) otherlv_6= '}' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:487:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_typeFeature_2_0= ruleTypeFeature ) ) ( (lv_sizeFeature_3_0= ruleSizeFeature ) ) ( (lv_speedFeature_4_0= ruleSpeedFeature ) ) ( (lv_formFeature_5_0= ruleFormFeature ) ) otherlv_6= '}'
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:487:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:488:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:488:1: (lv_name_0_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:489:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDrive1030); 

            			newLeafNode(lv_name_0_0, grammarAccess.getDriveAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDriveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleDrive1047); 

                	newLeafNode(otherlv_1, grammarAccess.getDriveAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:509:1: ( (lv_typeFeature_2_0= ruleTypeFeature ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:510:1: (lv_typeFeature_2_0= ruleTypeFeature )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:510:1: (lv_typeFeature_2_0= ruleTypeFeature )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:511:3: lv_typeFeature_2_0= ruleTypeFeature
            {
             
            	        newCompositeNode(grammarAccess.getDriveAccess().getTypeFeatureTypeFeatureParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeFeature_in_ruleDrive1068);
            lv_typeFeature_2_0=ruleTypeFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDriveRule());
            	        }
                   		set(
                   			current, 
                   			"typeFeature",
                    		lv_typeFeature_2_0, 
                    		"TypeFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:527:2: ( (lv_sizeFeature_3_0= ruleSizeFeature ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:528:1: (lv_sizeFeature_3_0= ruleSizeFeature )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:528:1: (lv_sizeFeature_3_0= ruleSizeFeature )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:529:3: lv_sizeFeature_3_0= ruleSizeFeature
            {
             
            	        newCompositeNode(grammarAccess.getDriveAccess().getSizeFeatureSizeFeatureParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSizeFeature_in_ruleDrive1089);
            lv_sizeFeature_3_0=ruleSizeFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDriveRule());
            	        }
                   		set(
                   			current, 
                   			"sizeFeature",
                    		lv_sizeFeature_3_0, 
                    		"SizeFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:545:2: ( (lv_speedFeature_4_0= ruleSpeedFeature ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:546:1: (lv_speedFeature_4_0= ruleSpeedFeature )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:546:1: (lv_speedFeature_4_0= ruleSpeedFeature )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:547:3: lv_speedFeature_4_0= ruleSpeedFeature
            {
             
            	        newCompositeNode(grammarAccess.getDriveAccess().getSpeedFeatureSpeedFeatureParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSpeedFeature_in_ruleDrive1110);
            lv_speedFeature_4_0=ruleSpeedFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDriveRule());
            	        }
                   		set(
                   			current, 
                   			"speedFeature",
                    		lv_speedFeature_4_0, 
                    		"SpeedFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:563:2: ( (lv_formFeature_5_0= ruleFormFeature ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:564:1: (lv_formFeature_5_0= ruleFormFeature )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:564:1: (lv_formFeature_5_0= ruleFormFeature )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:565:3: lv_formFeature_5_0= ruleFormFeature
            {
             
            	        newCompositeNode(grammarAccess.getDriveAccess().getFormFeatureFormFeatureParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleFormFeature_in_ruleDrive1131);
            lv_formFeature_5_0=ruleFormFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDriveRule());
            	        }
                   		set(
                   			current, 
                   			"formFeature",
                    		lv_formFeature_5_0, 
                    		"FormFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleDrive1143); 

                	newLeafNode(otherlv_6, grammarAccess.getDriveAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleDrive"


    // $ANTLR start "entryRuleFormFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:593:1: entryRuleFormFeature returns [EObject current=null] : iv_ruleFormFeature= ruleFormFeature EOF ;
    public final EObject entryRuleFormFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:594:2: (iv_ruleFormFeature= ruleFormFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:595:2: iv_ruleFormFeature= ruleFormFeature EOF
            {
             newCompositeNode(grammarAccess.getFormFeatureRule()); 
            pushFollow(FOLLOW_ruleFormFeature_in_entryRuleFormFeature1179);
            iv_ruleFormFeature=ruleFormFeature();

            state._fsp--;

             current =iv_ruleFormFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormFeature1189); 

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
    // $ANTLR end "entryRuleFormFeature"


    // $ANTLR start "ruleFormFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:602:1: ruleFormFeature returns [EObject current=null] : ( ( (lv_name_0_0= 'formFactor' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFormFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:605:28: ( ( ( (lv_name_0_0= 'formFactor' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:606:1: ( ( (lv_name_0_0= 'formFactor' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:606:1: ( ( (lv_name_0_0= 'formFactor' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:606:2: ( (lv_name_0_0= 'formFactor' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:606:2: ( (lv_name_0_0= 'formFactor' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:607:1: (lv_name_0_0= 'formFactor' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:607:1: (lv_name_0_0= 'formFactor' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:608:3: lv_name_0_0= 'formFactor'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_18_in_ruleFormFeature1232); 

                    newLeafNode(lv_name_0_0, grammarAccess.getFormFeatureAccess().getNameFormFactorKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFormFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "formFactor");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleFormFeature1257); 

                	newLeafNode(otherlv_1, grammarAccess.getFormFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:625:1: ( (lv_value_2_0= RULE_INT ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:626:1: (lv_value_2_0= RULE_INT )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:626:1: (lv_value_2_0= RULE_INT )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:627:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFormFeature1274); 

            			newLeafNode(lv_value_2_0, grammarAccess.getFormFeatureAccess().getValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFormFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"INT");
            	    

            }


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
    // $ANTLR end "ruleFormFeature"


    // $ANTLR start "entryRuleSpeedFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:651:1: entryRuleSpeedFeature returns [EObject current=null] : iv_ruleSpeedFeature= ruleSpeedFeature EOF ;
    public final EObject entryRuleSpeedFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeedFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:652:2: (iv_ruleSpeedFeature= ruleSpeedFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:653:2: iv_ruleSpeedFeature= ruleSpeedFeature EOF
            {
             newCompositeNode(grammarAccess.getSpeedFeatureRule()); 
            pushFollow(FOLLOW_ruleSpeedFeature_in_entryRuleSpeedFeature1315);
            iv_ruleSpeedFeature=ruleSpeedFeature();

            state._fsp--;

             current =iv_ruleSpeedFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpeedFeature1325); 

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
    // $ANTLR end "entryRuleSpeedFeature"


    // $ANTLR start "ruleSpeedFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:660:1: ruleSpeedFeature returns [EObject current=null] : ( ( (lv_name_0_0= 'speed' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleSpeedFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:663:28: ( ( ( (lv_name_0_0= 'speed' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:664:1: ( ( (lv_name_0_0= 'speed' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:664:1: ( ( (lv_name_0_0= 'speed' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:664:2: ( (lv_name_0_0= 'speed' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:664:2: ( (lv_name_0_0= 'speed' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:665:1: (lv_name_0_0= 'speed' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:665:1: (lv_name_0_0= 'speed' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:666:3: lv_name_0_0= 'speed'
            {
            lv_name_0_0=(Token)match(input,19,FOLLOW_19_in_ruleSpeedFeature1368); 

                    newLeafNode(lv_name_0_0, grammarAccess.getSpeedFeatureAccess().getNameSpeedKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpeedFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "speed");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSpeedFeature1393); 

                	newLeafNode(otherlv_1, grammarAccess.getSpeedFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:683:1: ( (lv_value_2_0= ruleDOUBLE ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:684:1: (lv_value_2_0= ruleDOUBLE )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:684:1: (lv_value_2_0= ruleDOUBLE )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:685:3: lv_value_2_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getSpeedFeatureAccess().getValueDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleSpeedFeature1414);
            lv_value_2_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSpeedFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleSpeedFeature"


    // $ANTLR start "entryRuleSizeFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:709:1: entryRuleSizeFeature returns [EObject current=null] : iv_ruleSizeFeature= ruleSizeFeature EOF ;
    public final EObject entryRuleSizeFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSizeFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:710:2: (iv_ruleSizeFeature= ruleSizeFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:711:2: iv_ruleSizeFeature= ruleSizeFeature EOF
            {
             newCompositeNode(grammarAccess.getSizeFeatureRule()); 
            pushFollow(FOLLOW_ruleSizeFeature_in_entryRuleSizeFeature1450);
            iv_ruleSizeFeature=ruleSizeFeature();

            state._fsp--;

             current =iv_ruleSizeFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSizeFeature1460); 

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
    // $ANTLR end "entryRuleSizeFeature"


    // $ANTLR start "ruleSizeFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:718:1: ruleSizeFeature returns [EObject current=null] : ( ( (lv_name_0_0= 'size' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSizeFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:721:28: ( ( ( (lv_name_0_0= 'size' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:722:1: ( ( (lv_name_0_0= 'size' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:722:1: ( ( (lv_name_0_0= 'size' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:722:2: ( (lv_name_0_0= 'size' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:722:2: ( (lv_name_0_0= 'size' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:723:1: (lv_name_0_0= 'size' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:723:1: (lv_name_0_0= 'size' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:724:3: lv_name_0_0= 'size'
            {
            lv_name_0_0=(Token)match(input,20,FOLLOW_20_in_ruleSizeFeature1503); 

                    newLeafNode(lv_name_0_0, grammarAccess.getSizeFeatureAccess().getNameSizeKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSizeFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "size");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSizeFeature1528); 

                	newLeafNode(otherlv_1, grammarAccess.getSizeFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:741:1: ( (lv_value_2_0= RULE_INT ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:742:1: (lv_value_2_0= RULE_INT )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:742:1: (lv_value_2_0= RULE_INT )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:743:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSizeFeature1545); 

            			newLeafNode(lv_value_2_0, grammarAccess.getSizeFeatureAccess().getValueINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSizeFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"INT");
            	    

            }


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
    // $ANTLR end "ruleSizeFeature"


    // $ANTLR start "entryRuleTypeFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:767:1: entryRuleTypeFeature returns [EObject current=null] : iv_ruleTypeFeature= ruleTypeFeature EOF ;
    public final EObject entryRuleTypeFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:768:2: (iv_ruleTypeFeature= ruleTypeFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:769:2: iv_ruleTypeFeature= ruleTypeFeature EOF
            {
             newCompositeNode(grammarAccess.getTypeFeatureRule()); 
            pushFollow(FOLLOW_ruleTypeFeature_in_entryRuleTypeFeature1586);
            iv_ruleTypeFeature=ruleTypeFeature();

            state._fsp--;

             current =iv_ruleTypeFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeFeature1596); 

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
    // $ANTLR end "entryRuleTypeFeature"


    // $ANTLR start "ruleTypeFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:776:1: ruleTypeFeature returns [EObject current=null] : ( ( (lv_name_0_0= 'type' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTypeFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:779:28: ( ( ( (lv_name_0_0= 'type' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:780:1: ( ( (lv_name_0_0= 'type' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:780:1: ( ( (lv_name_0_0= 'type' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:780:2: ( (lv_name_0_0= 'type' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:780:2: ( (lv_name_0_0= 'type' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:781:1: (lv_name_0_0= 'type' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:781:1: (lv_name_0_0= 'type' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:782:3: lv_name_0_0= 'type'
            {
            lv_name_0_0=(Token)match(input,21,FOLLOW_21_in_ruleTypeFeature1639); 

                    newLeafNode(lv_name_0_0, grammarAccess.getTypeFeatureAccess().getNameTypeKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "type");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleTypeFeature1664); 

                	newLeafNode(otherlv_1, grammarAccess.getTypeFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:799:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:800:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:800:1: (lv_value_2_0= RULE_STRING )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:801:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeFeature1681); 

            			newLeafNode(lv_value_2_0, grammarAccess.getTypeFeatureAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


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
    // $ANTLR end "ruleTypeFeature"


    // $ANTLR start "entryRuleCable"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:825:1: entryRuleCable returns [EObject current=null] : iv_ruleCable= ruleCable EOF ;
    public final EObject entryRuleCable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCable = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:826:2: (iv_ruleCable= ruleCable EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:827:2: iv_ruleCable= ruleCable EOF
            {
             newCompositeNode(grammarAccess.getCableRule()); 
            pushFollow(FOLLOW_ruleCable_in_entryRuleCable1722);
            iv_ruleCable=ruleCable();

            state._fsp--;

             current =iv_ruleCable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCable1732); 

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
    // $ANTLR end "entryRuleCable"


    // $ANTLR start "ruleCable"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:834:1: ruleCable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_colorFeature_2_0= ruleColorFeature ) ) ( (lv_networkFeature_3_0= ruleNetWorkFeature ) ) ( (lv_lengthFeature_4_0= ruleLengthFeature ) ) otherlv_5= '}' ) ;
    public final EObject ruleCable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_colorFeature_2_0 = null;

        EObject lv_networkFeature_3_0 = null;

        EObject lv_lengthFeature_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:837:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_colorFeature_2_0= ruleColorFeature ) ) ( (lv_networkFeature_3_0= ruleNetWorkFeature ) ) ( (lv_lengthFeature_4_0= ruleLengthFeature ) ) otherlv_5= '}' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:838:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_colorFeature_2_0= ruleColorFeature ) ) ( (lv_networkFeature_3_0= ruleNetWorkFeature ) ) ( (lv_lengthFeature_4_0= ruleLengthFeature ) ) otherlv_5= '}' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:838:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_colorFeature_2_0= ruleColorFeature ) ) ( (lv_networkFeature_3_0= ruleNetWorkFeature ) ) ( (lv_lengthFeature_4_0= ruleLengthFeature ) ) otherlv_5= '}' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:838:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_colorFeature_2_0= ruleColorFeature ) ) ( (lv_networkFeature_3_0= ruleNetWorkFeature ) ) ( (lv_lengthFeature_4_0= ruleLengthFeature ) ) otherlv_5= '}'
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:838:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:839:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:839:1: (lv_name_0_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:840:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCable1774); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCableAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleCable1791); 

                	newLeafNode(otherlv_1, grammarAccess.getCableAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:860:1: ( (lv_colorFeature_2_0= ruleColorFeature ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:861:1: (lv_colorFeature_2_0= ruleColorFeature )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:861:1: (lv_colorFeature_2_0= ruleColorFeature )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:862:3: lv_colorFeature_2_0= ruleColorFeature
            {
             
            	        newCompositeNode(grammarAccess.getCableAccess().getColorFeatureColorFeatureParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleColorFeature_in_ruleCable1812);
            lv_colorFeature_2_0=ruleColorFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCableRule());
            	        }
                   		set(
                   			current, 
                   			"colorFeature",
                    		lv_colorFeature_2_0, 
                    		"ColorFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:878:2: ( (lv_networkFeature_3_0= ruleNetWorkFeature ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:879:1: (lv_networkFeature_3_0= ruleNetWorkFeature )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:879:1: (lv_networkFeature_3_0= ruleNetWorkFeature )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:880:3: lv_networkFeature_3_0= ruleNetWorkFeature
            {
             
            	        newCompositeNode(grammarAccess.getCableAccess().getNetworkFeatureNetWorkFeatureParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleNetWorkFeature_in_ruleCable1833);
            lv_networkFeature_3_0=ruleNetWorkFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCableRule());
            	        }
                   		set(
                   			current, 
                   			"networkFeature",
                    		lv_networkFeature_3_0, 
                    		"NetWorkFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:896:2: ( (lv_lengthFeature_4_0= ruleLengthFeature ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:897:1: (lv_lengthFeature_4_0= ruleLengthFeature )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:897:1: (lv_lengthFeature_4_0= ruleLengthFeature )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:898:3: lv_lengthFeature_4_0= ruleLengthFeature
            {
             
            	        newCompositeNode(grammarAccess.getCableAccess().getLengthFeatureLengthFeatureParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleLengthFeature_in_ruleCable1854);
            lv_lengthFeature_4_0=ruleLengthFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCableRule());
            	        }
                   		set(
                   			current, 
                   			"lengthFeature",
                    		lv_lengthFeature_4_0, 
                    		"LengthFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleCable1866); 

                	newLeafNode(otherlv_5, grammarAccess.getCableAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleCable"


    // $ANTLR start "entryRulePriceRule"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:926:1: entryRulePriceRule returns [EObject current=null] : iv_rulePriceRule= rulePriceRule EOF ;
    public final EObject entryRulePriceRule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriceRule = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:927:2: (iv_rulePriceRule= rulePriceRule EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:928:2: iv_rulePriceRule= rulePriceRule EOF
            {
             newCompositeNode(grammarAccess.getPriceRuleRule()); 
            pushFollow(FOLLOW_rulePriceRule_in_entryRulePriceRule1902);
            iv_rulePriceRule=rulePriceRule();

            state._fsp--;

             current =iv_rulePriceRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePriceRule1912); 

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
    // $ANTLR end "entryRulePriceRule"


    // $ANTLR start "rulePriceRule"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:935:1: rulePriceRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
    public final EObject rulePriceRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:938:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:939:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:939:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:939:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_rulePriceRule1949); 

                	newLeafNode(otherlv_0, grammarAccess.getPriceRuleAccess().getRuleKeyword_0());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:943:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:944:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:944:1: (lv_name_1_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:945:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePriceRule1966); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPriceRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPriceRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:961:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:961:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulePriceRule1984); 

                        	newLeafNode(otherlv_2, grammarAccess.getPriceRuleAccess().getExtendsKeyword_2_0());
                        
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:965:1: ( ( ruleQualifiedName ) )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:966:1: ( ruleQualifiedName )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:966:1: ( ruleQualifiedName )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:967:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPriceRuleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPriceRuleAccess().getSuperTypeMinMaxCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePriceRule2007);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,11,FOLLOW_11_in_rulePriceRule2021); 

                	newLeafNode(otherlv_4, grammarAccess.getPriceRuleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:984:1: ( (lv_features_5_0= ruleFeature ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:985:1: (lv_features_5_0= ruleFeature )
            	    {
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:985:1: (lv_features_5_0= ruleFeature )
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:986:3: lv_features_5_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPriceRuleAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_rulePriceRule2042);
            	    lv_features_5_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPriceRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_rulePriceRule2055); 

                	newLeafNode(otherlv_6, grammarAccess.getPriceRuleAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "rulePriceRule"


    // $ANTLR start "entryRuleEntity"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1014:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1015:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1016:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity2091);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity2101); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1023:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'puid' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1026:28: ( (otherlv_0= 'puid' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1027:1: (otherlv_0= 'puid' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1027:1: (otherlv_0= 'puid' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1027:3: otherlv_0= 'puid' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleEntity2138); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getPuidKeyword_0());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1031:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1032:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1032:1: (lv_name_1_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1033:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity2155); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1049:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1049:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleEntity2173); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                        
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1053:1: ( ( ruleQualifiedName ) )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1054:1: ( ruleQualifiedName )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1054:1: ( ruleQualifiedName )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1055:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getSuperTypeSuperEntityCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntity2196);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleEntity2210); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1072:1: ( (lv_features_5_0= ruleFeature ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1073:1: (lv_features_5_0= ruleFeature )
            	    {
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1073:1: (lv_features_5_0= ruleFeature )
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1074:3: lv_features_5_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity2231);
            	    lv_features_5_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleEntity2244); 

                	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1102:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1103:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1104:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2281);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2292); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1111:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1114:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1115:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1115:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1115:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2332); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1122:1: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1123:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_ruleQualifiedName2351); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2366); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1143:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1144:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1145:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature2413);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature2423); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1152:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1155:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1156:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1156:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1156:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1156:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1157:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1157:1: (lv_name_0_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1158:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature2465); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleFeature2482); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1178:1: ( (lv_value_2_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1179:1: (lv_value_2_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1179:1: (lv_value_2_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1180:3: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature2499); 

            			newLeafNode(lv_value_2_0, grammarAccess.getFeatureAccess().getValueIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleFeature2516); 

                	newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getSemicolonKeyword_3());
                

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


    // $ANTLR start "entryRuleLengthFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1208:1: entryRuleLengthFeature returns [EObject current=null] : iv_ruleLengthFeature= ruleLengthFeature EOF ;
    public final EObject entryRuleLengthFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLengthFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1209:2: (iv_ruleLengthFeature= ruleLengthFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1210:2: iv_ruleLengthFeature= ruleLengthFeature EOF
            {
             newCompositeNode(grammarAccess.getLengthFeatureRule()); 
            pushFollow(FOLLOW_ruleLengthFeature_in_entryRuleLengthFeature2552);
            iv_ruleLengthFeature=ruleLengthFeature();

            state._fsp--;

             current =iv_ruleLengthFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLengthFeature2562); 

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
    // $ANTLR end "entryRuleLengthFeature"


    // $ANTLR start "ruleLengthFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1217:1: ruleLengthFeature returns [EObject current=null] : ( ( (lv_name_0_0= 'length' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) otherlv_3= ';' ) ;
    public final EObject ruleLengthFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1220:28: ( ( ( (lv_name_0_0= 'length' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) otherlv_3= ';' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1221:1: ( ( (lv_name_0_0= 'length' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) otherlv_3= ';' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1221:1: ( ( (lv_name_0_0= 'length' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) otherlv_3= ';' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1221:2: ( (lv_name_0_0= 'length' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) otherlv_3= ';'
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1221:2: ( (lv_name_0_0= 'length' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1222:1: (lv_name_0_0= 'length' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1222:1: (lv_name_0_0= 'length' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1223:3: lv_name_0_0= 'length'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_27_in_ruleLengthFeature2605); 

                    newLeafNode(lv_name_0_0, grammarAccess.getLengthFeatureAccess().getNameLengthKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLengthFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "length");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleLengthFeature2630); 

                	newLeafNode(otherlv_1, grammarAccess.getLengthFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1240:1: ( (lv_value_2_0= ruleDOUBLE ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1241:1: (lv_value_2_0= ruleDOUBLE )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1241:1: (lv_value_2_0= ruleDOUBLE )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1242:3: lv_value_2_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLengthFeatureAccess().getValueDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleLengthFeature2651);
            lv_value_2_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLengthFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"DOUBLE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleLengthFeature2663); 

                	newLeafNode(otherlv_3, grammarAccess.getLengthFeatureAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleLengthFeature"


    // $ANTLR start "entryRuleDOUBLE"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1270:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1271:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1272:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE2700);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE2711); 

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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1279:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1282:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1283:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1283:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1283:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE2751); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,25,FOLLOW_25_in_ruleDOUBLE2769); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE2784); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleNetWorkFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1311:1: entryRuleNetWorkFeature returns [EObject current=null] : iv_ruleNetWorkFeature= ruleNetWorkFeature EOF ;
    public final EObject entryRuleNetWorkFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetWorkFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1312:2: (iv_ruleNetWorkFeature= ruleNetWorkFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1313:2: iv_ruleNetWorkFeature= ruleNetWorkFeature EOF
            {
             newCompositeNode(grammarAccess.getNetWorkFeatureRule()); 
            pushFollow(FOLLOW_ruleNetWorkFeature_in_entryRuleNetWorkFeature2829);
            iv_ruleNetWorkFeature=ruleNetWorkFeature();

            state._fsp--;

             current =iv_ruleNetWorkFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNetWorkFeature2839); 

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
    // $ANTLR end "entryRuleNetWorkFeature"


    // $ANTLR start "ruleNetWorkFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1320:1: ruleNetWorkFeature returns [EObject current=null] : ( ( (lv_name_0_0= 'network' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleNetWorkFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1323:28: ( ( ( (lv_name_0_0= 'network' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1324:1: ( ( (lv_name_0_0= 'network' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1324:1: ( ( (lv_name_0_0= 'network' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1324:2: ( (lv_name_0_0= 'network' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1324:2: ( (lv_name_0_0= 'network' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1325:1: (lv_name_0_0= 'network' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1325:1: (lv_name_0_0= 'network' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1326:3: lv_name_0_0= 'network'
            {
            lv_name_0_0=(Token)match(input,28,FOLLOW_28_in_ruleNetWorkFeature2882); 

                    newLeafNode(lv_name_0_0, grammarAccess.getNetWorkFeatureAccess().getNameNetworkKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNetWorkFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "network");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleNetWorkFeature2907); 

                	newLeafNode(otherlv_1, grammarAccess.getNetWorkFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1343:1: ( (lv_value_2_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1344:1: (lv_value_2_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1344:1: (lv_value_2_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1345:3: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNetWorkFeature2924); 

            			newLeafNode(lv_value_2_0, grammarAccess.getNetWorkFeatureAccess().getValueIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNetWorkFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleNetWorkFeature2941); 

                	newLeafNode(otherlv_3, grammarAccess.getNetWorkFeatureAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleNetWorkFeature"


    // $ANTLR start "entryRuleColorFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1373:1: entryRuleColorFeature returns [EObject current=null] : iv_ruleColorFeature= ruleColorFeature EOF ;
    public final EObject entryRuleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1374:2: (iv_ruleColorFeature= ruleColorFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1375:2: iv_ruleColorFeature= ruleColorFeature EOF
            {
             newCompositeNode(grammarAccess.getColorFeatureRule()); 
            pushFollow(FOLLOW_ruleColorFeature_in_entryRuleColorFeature2977);
            iv_ruleColorFeature=ruleColorFeature();

            state._fsp--;

             current =iv_ruleColorFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorFeature2987); 

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
    // $ANTLR end "entryRuleColorFeature"


    // $ANTLR start "ruleColorFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1382:1: ruleColorFeature returns [EObject current=null] : ( ( (lv_name_0_0= 'color' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) otherlv_3= ';' ) ;
    public final EObject ruleColorFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1385:28: ( ( ( (lv_name_0_0= 'color' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) otherlv_3= ';' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1386:1: ( ( (lv_name_0_0= 'color' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) otherlv_3= ';' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1386:1: ( ( (lv_name_0_0= 'color' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) otherlv_3= ';' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1386:2: ( (lv_name_0_0= 'color' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) otherlv_3= ';'
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1386:2: ( (lv_name_0_0= 'color' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1387:1: (lv_name_0_0= 'color' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1387:1: (lv_name_0_0= 'color' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1388:3: lv_name_0_0= 'color'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_29_in_ruleColorFeature3030); 

                    newLeafNode(lv_name_0_0, grammarAccess.getColorFeatureAccess().getNameColorKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "color");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleColorFeature3055); 

                	newLeafNode(otherlv_1, grammarAccess.getColorFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1405:1: ( (lv_value_2_0= ruleColor ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1406:1: (lv_value_2_0= ruleColor )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1406:1: (lv_value_2_0= ruleColor )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1407:3: lv_value_2_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getColorFeatureAccess().getValueColorEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleColorFeature3076);
            lv_value_2_0=ruleColor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColorFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Color");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleColorFeature3088); 

                	newLeafNode(otherlv_3, grammarAccess.getColorFeatureAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleColorFeature"


    // $ANTLR start "entryRuleSuperEntity"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1435:1: entryRuleSuperEntity returns [EObject current=null] : iv_ruleSuperEntity= ruleSuperEntity EOF ;
    public final EObject entryRuleSuperEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperEntity = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1436:2: (iv_ruleSuperEntity= ruleSuperEntity EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1437:2: iv_ruleSuperEntity= ruleSuperEntity EOF
            {
             newCompositeNode(grammarAccess.getSuperEntityRule()); 
            pushFollow(FOLLOW_ruleSuperEntity_in_entryRuleSuperEntity3124);
            iv_ruleSuperEntity=ruleSuperEntity();

            state._fsp--;

             current =iv_ruleSuperEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuperEntity3134); 

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
    // $ANTLR end "entryRuleSuperEntity"


    // $ANTLR start "ruleSuperEntity"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1444:1: ruleSuperEntity returns [EObject current=null] : (this_Cable_0= ruleCable | this_Drive_1= ruleDrive ) ;
    public final EObject ruleSuperEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Cable_0 = null;

        EObject this_Drive_1 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1447:28: ( (this_Cable_0= ruleCable | this_Drive_1= ruleDrive ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1448:1: (this_Cable_0= ruleCable | this_Drive_1= ruleDrive )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1448:1: (this_Cable_0= ruleCable | this_Drive_1= ruleDrive )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==11) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==21) ) {
                        alt9=2;
                    }
                    else if ( (LA9_2==29) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1449:5: this_Cable_0= ruleCable
                    {
                     
                            newCompositeNode(grammarAccess.getSuperEntityAccess().getCableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCable_in_ruleSuperEntity3181);
                    this_Cable_0=ruleCable();

                    state._fsp--;

                     
                            current = this_Cable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1459:5: this_Drive_1= ruleDrive
                    {
                     
                            newCompositeNode(grammarAccess.getSuperEntityAccess().getDriveParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDrive_in_ruleSuperEntity3208);
                    this_Drive_1=ruleDrive();

                    state._fsp--;

                     
                            current = this_Drive_1; 
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
    // $ANTLR end "ruleSuperEntity"


    // $ANTLR start "ruleColor"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1475:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Black' ) | (enumLiteral_2= 'White' ) | (enumLiteral_3= 'Grey' ) | (enumLiteral_4= 'Green' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1477:28: ( ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Black' ) | (enumLiteral_2= 'White' ) | (enumLiteral_3= 'Grey' ) | (enumLiteral_4= 'Green' ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1478:1: ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Black' ) | (enumLiteral_2= 'White' ) | (enumLiteral_3= 'Grey' ) | (enumLiteral_4= 'Green' ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1478:1: ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Black' ) | (enumLiteral_2= 'White' ) | (enumLiteral_3= 'Grey' ) | (enumLiteral_4= 'Green' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            case 33:
                {
                alt10=4;
                }
                break;
            case 34:
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
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1478:2: (enumLiteral_0= 'Red' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1478:2: (enumLiteral_0= 'Red' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1478:4: enumLiteral_0= 'Red'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_30_in_ruleColor3257); 

                            current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1484:6: (enumLiteral_1= 'Black' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1484:6: (enumLiteral_1= 'Black' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1484:8: enumLiteral_1= 'Black'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_31_in_ruleColor3274); 

                            current = grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1490:6: (enumLiteral_2= 'White' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1490:6: (enumLiteral_2= 'White' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1490:8: enumLiteral_2= 'White'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_32_in_ruleColor3291); 

                            current = grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1496:6: (enumLiteral_3= 'Grey' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1496:6: (enumLiteral_3= 'Grey' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1496:8: enumLiteral_3= 'Grey'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_33_in_ruleColor3308); 

                            current = grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1502:6: (enumLiteral_4= 'Green' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1502:6: (enumLiteral_4= 'Green' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:1502:8: enumLiteral_4= 'Green'
                    {
                    enumLiteral_4=(Token)match(input,34,FOLLOW_34_in_ruleColor3325); 

                            current = grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_4()); 
                        

                    }


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
    // $ANTLR end "ruleColor"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAml_in_entryRuleAml81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAml91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElements_in_ruleAml140 = new BitSet(new long[]{0x0000000001400012L});
    public static final BitSet FOLLOW_ruleAbstractElements_in_entryRuleAbstractElements180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElements190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleAbstractElements237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePriceRule_in_ruleAbstractElements264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperEntity_in_ruleAbstractElements291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinMax_in_ruleAbstractElements318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinMax_in_entryRuleMinMax353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinMax363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMinMax405 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleMinMax422 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleTargetGroupFeature_in_ruleMinMax443 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleProductPUIDFeature_in_ruleMinMax464 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleMaxFeature_in_ruleMinMax485 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMinMax497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxFeature_in_entryRuleMaxFeature533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxFeature543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleMaxFeature586 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMaxFeature611 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMaxFeature628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProductPUIDFeature_in_entryRuleProductPUIDFeature669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProductPUIDFeature679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleProductPUIDFeature722 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProductPUIDFeature747 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProductPUIDFeature764 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleProductPUIDFeature782 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProductPUIDFeature799 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleTargetGroupFeature_in_entryRuleTargetGroupFeature842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetGroupFeature852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTargetGroupFeature895 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTargetGroupFeature920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTargetGroupFeature937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDrive_in_entryRuleDrive978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDrive988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDrive1030 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleDrive1047 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleTypeFeature_in_ruleDrive1068 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleSizeFeature_in_ruleDrive1089 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleSpeedFeature_in_ruleDrive1110 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleFormFeature_in_ruleDrive1131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDrive1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormFeature_in_entryRuleFormFeature1179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormFeature1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFormFeature1232 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFormFeature1257 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFormFeature1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpeedFeature_in_entryRuleSpeedFeature1315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpeedFeature1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSpeedFeature1368 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSpeedFeature1393 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleSpeedFeature1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSizeFeature_in_entryRuleSizeFeature1450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSizeFeature1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSizeFeature1503 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSizeFeature1528 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSizeFeature1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeFeature_in_entryRuleTypeFeature1586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeFeature1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTypeFeature1639 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTypeFeature1664 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeFeature1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCable_in_entryRuleCable1722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCable1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCable1774 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleCable1791 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleColorFeature_in_ruleCable1812 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleNetWorkFeature_in_ruleCable1833 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleLengthFeature_in_ruleCable1854 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCable1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePriceRule_in_entryRulePriceRule1902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePriceRule1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePriceRule1949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePriceRule1966 = new BitSet(new long[]{0x0000000000800800L});
    public static final BitSet FOLLOW_23_in_rulePriceRule1984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePriceRule2007 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePriceRule2021 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleFeature_in_rulePriceRule2042 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_rulePriceRule2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity2091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEntity2138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity2155 = new BitSet(new long[]{0x0000000000800800L});
    public static final BitSet FOLLOW_23_in_ruleEntity2173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity2196 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleEntity2210 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity2231 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleEntity2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2332 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleQualifiedName2351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2366 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature2413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature2465 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFeature2482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature2499 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFeature2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLengthFeature_in_entryRuleLengthFeature2552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLengthFeature2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLengthFeature2605 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLengthFeature2630 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLengthFeature2651 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLengthFeature2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE2700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE2751 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDOUBLE2769 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNetWorkFeature_in_entryRuleNetWorkFeature2829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNetWorkFeature2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleNetWorkFeature2882 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNetWorkFeature2907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNetWorkFeature2924 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleNetWorkFeature2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_entryRuleColorFeature2977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorFeature2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleColorFeature3030 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleColorFeature3055 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleColorFeature3076 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleColorFeature3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperEntity_in_entryRuleSuperEntity3124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuperEntity3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCable_in_ruleSuperEntity3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDrive_in_ruleSuperEntity3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleColor3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleColor3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleColor3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleColor3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleColor3325 = new BitSet(new long[]{0x0000000000000002L});

}