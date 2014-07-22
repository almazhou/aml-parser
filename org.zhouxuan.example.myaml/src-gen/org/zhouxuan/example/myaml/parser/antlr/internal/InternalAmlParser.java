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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'puid'", "'extends'", "'{'", "'}'", "'='", "';'", "'length'", "'.'", "'network'", "'color'", "'Red'", "'Black'", "'White'", "'Grey'", "'Green'"
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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:83:1: ruleAml returns [EObject current=null] : ( (lv_elements_0_0= ruleEntity ) )* ;
    public final EObject ruleAml() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:87:28: ( ( (lv_elements_0_0= ruleEntity ) )* )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:88:1: ( (lv_elements_0_0= ruleEntity ) )*
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:88:1: ( (lv_elements_0_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:89:1: (lv_elements_0_0= ruleEntity )
            	    {
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:89:1: (lv_elements_0_0= ruleEntity )
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:90:3: lv_elements_0_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAmlAccess().getElementsEntityParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleAml140);
            	    lv_elements_0_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAmlRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"Entity");
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


    // $ANTLR start "entryRuleEntity"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:117:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:118:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:119:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity180);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity190); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:126:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'puid' ( (lv_name_1_0= RULE_INT ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_colorFeature_5_0= ruleColorFeature ) ) ( (lv_networkFeature_6_0= ruleNetWorkFeature ) ) ( (lv_lengthFeature_7_0= ruleLengthFeature ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject lv_colorFeature_5_0 = null;

        EObject lv_networkFeature_6_0 = null;

        EObject lv_lengthFeature_7_0 = null;

        EObject lv_features_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:129:28: ( (otherlv_0= 'puid' ( (lv_name_1_0= RULE_INT ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_colorFeature_5_0= ruleColorFeature ) ) ( (lv_networkFeature_6_0= ruleNetWorkFeature ) ) ( (lv_lengthFeature_7_0= ruleLengthFeature ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:130:1: (otherlv_0= 'puid' ( (lv_name_1_0= RULE_INT ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_colorFeature_5_0= ruleColorFeature ) ) ( (lv_networkFeature_6_0= ruleNetWorkFeature ) ) ( (lv_lengthFeature_7_0= ruleLengthFeature ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:130:1: (otherlv_0= 'puid' ( (lv_name_1_0= RULE_INT ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_colorFeature_5_0= ruleColorFeature ) ) ( (lv_networkFeature_6_0= ruleNetWorkFeature ) ) ( (lv_lengthFeature_7_0= ruleLengthFeature ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:130:3: otherlv_0= 'puid' ( (lv_name_1_0= RULE_INT ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_colorFeature_5_0= ruleColorFeature ) ) ( (lv_networkFeature_6_0= ruleNetWorkFeature ) ) ( (lv_lengthFeature_7_0= ruleLengthFeature ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleEntity227); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getPuidKeyword_0());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:134:1: ( (lv_name_1_0= RULE_INT ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:135:1: (lv_name_1_0= RULE_INT )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:135:1: (lv_name_1_0= RULE_INT )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:136:3: lv_name_1_0= RULE_INT
            {
            lv_name_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEntity244); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"INT");
            	    

            }


            }

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:152:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:152:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity262); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                        
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:156:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:157:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:157:1: (otherlv_3= RULE_ID )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:158:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity282); 

                    		newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleEntity296); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:173:1: ( (lv_colorFeature_5_0= ruleColorFeature ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:174:1: (lv_colorFeature_5_0= ruleColorFeature )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:174:1: (lv_colorFeature_5_0= ruleColorFeature )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:175:3: lv_colorFeature_5_0= ruleColorFeature
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getColorFeatureColorFeatureParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleColorFeature_in_ruleEntity317);
            lv_colorFeature_5_0=ruleColorFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	        }
                   		set(
                   			current, 
                   			"colorFeature",
                    		lv_colorFeature_5_0, 
                    		"ColorFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:191:2: ( (lv_networkFeature_6_0= ruleNetWorkFeature ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:192:1: (lv_networkFeature_6_0= ruleNetWorkFeature )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:192:1: (lv_networkFeature_6_0= ruleNetWorkFeature )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:193:3: lv_networkFeature_6_0= ruleNetWorkFeature
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getNetworkFeatureNetWorkFeatureParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleNetWorkFeature_in_ruleEntity338);
            lv_networkFeature_6_0=ruleNetWorkFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	        }
                   		set(
                   			current, 
                   			"networkFeature",
                    		lv_networkFeature_6_0, 
                    		"NetWorkFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:209:2: ( (lv_lengthFeature_7_0= ruleLengthFeature ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:210:1: (lv_lengthFeature_7_0= ruleLengthFeature )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:210:1: (lv_lengthFeature_7_0= ruleLengthFeature )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:211:3: lv_lengthFeature_7_0= ruleLengthFeature
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getLengthFeatureLengthFeatureParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleLengthFeature_in_ruleEntity359);
            lv_lengthFeature_7_0=ruleLengthFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	        }
                   		set(
                   			current, 
                   			"lengthFeature",
                    		lv_lengthFeature_7_0, 
                    		"LengthFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:227:2: ( (lv_features_8_0= ruleFeature ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:228:1: (lv_features_8_0= ruleFeature )
            	    {
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:228:1: (lv_features_8_0= ruleFeature )
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:229:3: lv_features_8_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity380);
            	    lv_features_8_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_8_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleEntity393); 

                	newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8());
                

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


    // $ANTLR start "entryRuleFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:257:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:258:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:259:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature429);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature439); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:266:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:269:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:270:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:270:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:270:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:270:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:271:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:271:1: (lv_name_0_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:272:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature481); 

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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleFeature498); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:292:1: ( (lv_value_2_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:293:1: (lv_value_2_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:293:1: (lv_value_2_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:294:3: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature515); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleFeature532); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:322:1: entryRuleLengthFeature returns [EObject current=null] : iv_ruleLengthFeature= ruleLengthFeature EOF ;
    public final EObject entryRuleLengthFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLengthFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:323:2: (iv_ruleLengthFeature= ruleLengthFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:324:2: iv_ruleLengthFeature= ruleLengthFeature EOF
            {
             newCompositeNode(grammarAccess.getLengthFeatureRule()); 
            pushFollow(FOLLOW_ruleLengthFeature_in_entryRuleLengthFeature568);
            iv_ruleLengthFeature=ruleLengthFeature();

            state._fsp--;

             current =iv_ruleLengthFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLengthFeature578); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:331:1: ruleLengthFeature returns [EObject current=null] : ( ( (lv_name_0_0= 'length' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) otherlv_3= ';' ) ;
    public final EObject ruleLengthFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:334:28: ( ( ( (lv_name_0_0= 'length' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) otherlv_3= ';' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:335:1: ( ( (lv_name_0_0= 'length' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) otherlv_3= ';' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:335:1: ( ( (lv_name_0_0= 'length' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) otherlv_3= ';' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:335:2: ( (lv_name_0_0= 'length' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) otherlv_3= ';'
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:335:2: ( (lv_name_0_0= 'length' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:336:1: (lv_name_0_0= 'length' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:336:1: (lv_name_0_0= 'length' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:337:3: lv_name_0_0= 'length'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_17_in_ruleLengthFeature621); 

                    newLeafNode(lv_name_0_0, grammarAccess.getLengthFeatureAccess().getNameLengthKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLengthFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "length");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleLengthFeature646); 

                	newLeafNode(otherlv_1, grammarAccess.getLengthFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:354:1: ( (lv_value_2_0= ruleDOUBLE ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:355:1: (lv_value_2_0= ruleDOUBLE )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:355:1: (lv_value_2_0= ruleDOUBLE )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:356:3: lv_value_2_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLengthFeatureAccess().getValueDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleLengthFeature667);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleLengthFeature679); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:384:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:385:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:386:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE716);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE727); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:393:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:396:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:397:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:397:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:397:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE767); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,18,FOLLOW_18_in_ruleDOUBLE785); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE800); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:425:1: entryRuleNetWorkFeature returns [EObject current=null] : iv_ruleNetWorkFeature= ruleNetWorkFeature EOF ;
    public final EObject entryRuleNetWorkFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetWorkFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:426:2: (iv_ruleNetWorkFeature= ruleNetWorkFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:427:2: iv_ruleNetWorkFeature= ruleNetWorkFeature EOF
            {
             newCompositeNode(grammarAccess.getNetWorkFeatureRule()); 
            pushFollow(FOLLOW_ruleNetWorkFeature_in_entryRuleNetWorkFeature845);
            iv_ruleNetWorkFeature=ruleNetWorkFeature();

            state._fsp--;

             current =iv_ruleNetWorkFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNetWorkFeature855); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:434:1: ruleNetWorkFeature returns [EObject current=null] : ( ( (lv_name_0_0= 'network' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleNetWorkFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:437:28: ( ( ( (lv_name_0_0= 'network' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:438:1: ( ( (lv_name_0_0= 'network' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:438:1: ( ( (lv_name_0_0= 'network' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:438:2: ( (lv_name_0_0= 'network' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:438:2: ( (lv_name_0_0= 'network' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:439:1: (lv_name_0_0= 'network' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:439:1: (lv_name_0_0= 'network' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:440:3: lv_name_0_0= 'network'
            {
            lv_name_0_0=(Token)match(input,19,FOLLOW_19_in_ruleNetWorkFeature898); 

                    newLeafNode(lv_name_0_0, grammarAccess.getNetWorkFeatureAccess().getNameNetworkKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNetWorkFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "network");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleNetWorkFeature923); 

                	newLeafNode(otherlv_1, grammarAccess.getNetWorkFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:457:1: ( (lv_value_2_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:458:1: (lv_value_2_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:458:1: (lv_value_2_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:459:3: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNetWorkFeature940); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleNetWorkFeature957); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:487:1: entryRuleColorFeature returns [EObject current=null] : iv_ruleColorFeature= ruleColorFeature EOF ;
    public final EObject entryRuleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:488:2: (iv_ruleColorFeature= ruleColorFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:489:2: iv_ruleColorFeature= ruleColorFeature EOF
            {
             newCompositeNode(grammarAccess.getColorFeatureRule()); 
            pushFollow(FOLLOW_ruleColorFeature_in_entryRuleColorFeature993);
            iv_ruleColorFeature=ruleColorFeature();

            state._fsp--;

             current =iv_ruleColorFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorFeature1003); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:496:1: ruleColorFeature returns [EObject current=null] : ( ( (lv_name_0_0= 'color' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) otherlv_3= ';' ) ;
    public final EObject ruleColorFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:499:28: ( ( ( (lv_name_0_0= 'color' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) otherlv_3= ';' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:500:1: ( ( (lv_name_0_0= 'color' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) otherlv_3= ';' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:500:1: ( ( (lv_name_0_0= 'color' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) otherlv_3= ';' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:500:2: ( (lv_name_0_0= 'color' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) otherlv_3= ';'
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:500:2: ( (lv_name_0_0= 'color' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:501:1: (lv_name_0_0= 'color' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:501:1: (lv_name_0_0= 'color' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:502:3: lv_name_0_0= 'color'
            {
            lv_name_0_0=(Token)match(input,20,FOLLOW_20_in_ruleColorFeature1046); 

                    newLeafNode(lv_name_0_0, grammarAccess.getColorFeatureAccess().getNameColorKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "color");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleColorFeature1071); 

                	newLeafNode(otherlv_1, grammarAccess.getColorFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:519:1: ( (lv_value_2_0= ruleColor ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:520:1: (lv_value_2_0= ruleColor )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:520:1: (lv_value_2_0= ruleColor )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:521:3: lv_value_2_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getColorFeatureAccess().getValueColorEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleColorFeature1092);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleColorFeature1104); 

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


    // $ANTLR start "ruleColor"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:549:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Black' ) | (enumLiteral_2= 'White' ) | (enumLiteral_3= 'Grey' ) | (enumLiteral_4= 'Green' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:551:28: ( ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Black' ) | (enumLiteral_2= 'White' ) | (enumLiteral_3= 'Grey' ) | (enumLiteral_4= 'Green' ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:552:1: ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Black' ) | (enumLiteral_2= 'White' ) | (enumLiteral_3= 'Grey' ) | (enumLiteral_4= 'Green' ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:552:1: ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Black' ) | (enumLiteral_2= 'White' ) | (enumLiteral_3= 'Grey' ) | (enumLiteral_4= 'Green' ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 24:
                {
                alt4=4;
                }
                break;
            case 25:
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
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:552:2: (enumLiteral_0= 'Red' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:552:2: (enumLiteral_0= 'Red' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:552:4: enumLiteral_0= 'Red'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleColor1154); 

                            current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:558:6: (enumLiteral_1= 'Black' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:558:6: (enumLiteral_1= 'Black' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:558:8: enumLiteral_1= 'Black'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleColor1171); 

                            current = grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:564:6: (enumLiteral_2= 'White' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:564:6: (enumLiteral_2= 'White' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:564:8: enumLiteral_2= 'White'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_23_in_ruleColor1188); 

                            current = grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:570:6: (enumLiteral_3= 'Grey' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:570:6: (enumLiteral_3= 'Grey' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:570:8: enumLiteral_3= 'Grey'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_24_in_ruleColor1205); 

                            current = grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:576:6: (enumLiteral_4= 'Green' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:576:6: (enumLiteral_4= 'Green' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:576:8: enumLiteral_4= 'Green'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_25_in_ruleColor1222); 

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
    public static final BitSet FOLLOW_ruleEntity_in_ruleAml140 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEntity227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEntity244 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleEntity262 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity282 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity296 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleColorFeature_in_ruleEntity317 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleNetWorkFeature_in_ruleEntity338 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleLengthFeature_in_ruleEntity359 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity380 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14_in_ruleEntity393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature481 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFeature498 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature515 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFeature532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLengthFeature_in_entryRuleLengthFeature568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLengthFeature578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleLengthFeature621 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLengthFeature646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLengthFeature667 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLengthFeature679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE767 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDOUBLE785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNetWorkFeature_in_entryRuleNetWorkFeature845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNetWorkFeature855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNetWorkFeature898 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNetWorkFeature923 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNetWorkFeature940 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNetWorkFeature957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_entryRuleColorFeature993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorFeature1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleColorFeature1046 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleColorFeature1071 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleColorFeature1092 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleColorFeature1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleColor1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleColor1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleColor1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleColor1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleColor1222 = new BitSet(new long[]{0x0000000000000002L});

}