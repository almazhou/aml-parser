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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'puid'", "'extends'", "'{'", "'}'", "'='", "'.'", "'Red'", "'Black'", "'White'", "'Grey'", "'Green'"
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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:126:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'puid' ( (lv_name_1_0= RULE_INT ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:129:28: ( (otherlv_0= 'puid' ( (lv_name_1_0= RULE_INT ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:130:1: (otherlv_0= 'puid' ( (lv_name_1_0= RULE_INT ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:130:1: (otherlv_0= 'puid' ( (lv_name_1_0= RULE_INT ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:130:3: otherlv_0= 'puid' ( (lv_name_1_0= RULE_INT ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
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
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:173:1: ( (lv_features_5_0= ruleFeature ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:174:1: (lv_features_5_0= ruleFeature )
            	    {
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:174:1: (lv_features_5_0= ruleFeature )
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:175:3: lv_features_5_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity317);
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
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleEntity330); 

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


    // $ANTLR start "entryRuleFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:203:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:204:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:205:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature366);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature376); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:212:1: ruleFeature returns [EObject current=null] : (this_ColorFeature_0= ruleColorFeature | this_NetWorkFeature_1= ruleNetWorkFeature | this_LenghtFeature_2= ruleLenghtFeature ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_ColorFeature_0 = null;

        EObject this_NetWorkFeature_1 = null;

        EObject this_LenghtFeature_2 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:215:28: ( (this_ColorFeature_0= ruleColorFeature | this_NetWorkFeature_1= ruleNetWorkFeature | this_LenghtFeature_2= ruleLenghtFeature ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:216:1: (this_ColorFeature_0= ruleColorFeature | this_NetWorkFeature_1= ruleNetWorkFeature | this_LenghtFeature_2= ruleLenghtFeature )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:216:1: (this_ColorFeature_0= ruleColorFeature | this_NetWorkFeature_1= ruleNetWorkFeature | this_LenghtFeature_2= ruleLenghtFeature )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==15) ) {
                    switch ( input.LA(3) ) {
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        {
                        alt4=1;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt4=3;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt4=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:217:5: this_ColorFeature_0= ruleColorFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getColorFeatureParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleColorFeature_in_ruleFeature423);
                    this_ColorFeature_0=ruleColorFeature();

                    state._fsp--;

                     
                            current = this_ColorFeature_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:227:5: this_NetWorkFeature_1= ruleNetWorkFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getNetWorkFeatureParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNetWorkFeature_in_ruleFeature450);
                    this_NetWorkFeature_1=ruleNetWorkFeature();

                    state._fsp--;

                     
                            current = this_NetWorkFeature_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:237:5: this_LenghtFeature_2= ruleLenghtFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getLenghtFeatureParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLenghtFeature_in_ruleFeature477);
                    this_LenghtFeature_2=ruleLenghtFeature();

                    state._fsp--;

                     
                            current = this_LenghtFeature_2; 
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleLenghtFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:253:1: entryRuleLenghtFeature returns [EObject current=null] : iv_ruleLenghtFeature= ruleLenghtFeature EOF ;
    public final EObject entryRuleLenghtFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLenghtFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:254:2: (iv_ruleLenghtFeature= ruleLenghtFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:255:2: iv_ruleLenghtFeature= ruleLenghtFeature EOF
            {
             newCompositeNode(grammarAccess.getLenghtFeatureRule()); 
            pushFollow(FOLLOW_ruleLenghtFeature_in_entryRuleLenghtFeature512);
            iv_ruleLenghtFeature=ruleLenghtFeature();

            state._fsp--;

             current =iv_ruleLenghtFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLenghtFeature522); 

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
    // $ANTLR end "entryRuleLenghtFeature"


    // $ANTLR start "ruleLenghtFeature"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:262:1: ruleLenghtFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleLenghtFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:265:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:266:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:266:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:266:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:266:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:267:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:267:1: (lv_name_0_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:268:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLenghtFeature564); 

            			newLeafNode(lv_name_0_0, grammarAccess.getLenghtFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLenghtFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleLenghtFeature581); 

                	newLeafNode(otherlv_1, grammarAccess.getLenghtFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:288:1: ( (lv_value_2_0= ruleDOUBLE ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:289:1: (lv_value_2_0= ruleDOUBLE )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:289:1: (lv_value_2_0= ruleDOUBLE )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:290:3: lv_value_2_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLenghtFeatureAccess().getValueDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleLenghtFeature602);
            lv_value_2_0=ruleDOUBLE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLenghtFeatureRule());
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
    // $ANTLR end "ruleLenghtFeature"


    // $ANTLR start "entryRuleDOUBLE"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:314:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:315:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:316:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE639);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE650); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:323:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:326:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:327:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:327:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:327:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE690); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,16,FOLLOW_16_in_ruleDOUBLE708); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE723); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:355:1: entryRuleNetWorkFeature returns [EObject current=null] : iv_ruleNetWorkFeature= ruleNetWorkFeature EOF ;
    public final EObject entryRuleNetWorkFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetWorkFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:356:2: (iv_ruleNetWorkFeature= ruleNetWorkFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:357:2: iv_ruleNetWorkFeature= ruleNetWorkFeature EOF
            {
             newCompositeNode(grammarAccess.getNetWorkFeatureRule()); 
            pushFollow(FOLLOW_ruleNetWorkFeature_in_entryRuleNetWorkFeature768);
            iv_ruleNetWorkFeature=ruleNetWorkFeature();

            state._fsp--;

             current =iv_ruleNetWorkFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNetWorkFeature778); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:364:1: ruleNetWorkFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) ) ;
    public final EObject ruleNetWorkFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:367:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:368:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:368:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:368:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:368:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:369:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:369:1: (lv_name_0_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:370:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNetWorkFeature820); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNetWorkFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNetWorkFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleNetWorkFeature837); 

                	newLeafNode(otherlv_1, grammarAccess.getNetWorkFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:390:1: ( (lv_value_2_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:391:1: (lv_value_2_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:391:1: (lv_value_2_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:392:3: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNetWorkFeature854); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:416:1: entryRuleColorFeature returns [EObject current=null] : iv_ruleColorFeature= ruleColorFeature EOF ;
    public final EObject entryRuleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:417:2: (iv_ruleColorFeature= ruleColorFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:418:2: iv_ruleColorFeature= ruleColorFeature EOF
            {
             newCompositeNode(grammarAccess.getColorFeatureRule()); 
            pushFollow(FOLLOW_ruleColorFeature_in_entryRuleColorFeature895);
            iv_ruleColorFeature=ruleColorFeature();

            state._fsp--;

             current =iv_ruleColorFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorFeature905); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:425:1: ruleColorFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) ) ;
    public final EObject ruleColorFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:428:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:429:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:429:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:429:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:429:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:430:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:430:1: (lv_name_0_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:431:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColorFeature947); 

            			newLeafNode(lv_name_0_0, grammarAccess.getColorFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleColorFeature964); 

                	newLeafNode(otherlv_1, grammarAccess.getColorFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:451:1: ( (lv_value_2_0= ruleColor ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:452:1: (lv_value_2_0= ruleColor )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:452:1: (lv_value_2_0= ruleColor )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:453:3: lv_value_2_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getColorFeatureAccess().getValueColorEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleColorFeature985);
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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:477:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Black' ) | (enumLiteral_2= 'White' ) | (enumLiteral_3= 'Grey' ) | (enumLiteral_4= 'Green' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:479:28: ( ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Black' ) | (enumLiteral_2= 'White' ) | (enumLiteral_3= 'Grey' ) | (enumLiteral_4= 'Green' ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:480:1: ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Black' ) | (enumLiteral_2= 'White' ) | (enumLiteral_3= 'Grey' ) | (enumLiteral_4= 'Green' ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:480:1: ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Black' ) | (enumLiteral_2= 'White' ) | (enumLiteral_3= 'Grey' ) | (enumLiteral_4= 'Green' ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            case 21:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:480:2: (enumLiteral_0= 'Red' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:480:2: (enumLiteral_0= 'Red' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:480:4: enumLiteral_0= 'Red'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_17_in_ruleColor1035); 

                            current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:486:6: (enumLiteral_1= 'Black' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:486:6: (enumLiteral_1= 'Black' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:486:8: enumLiteral_1= 'Black'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_18_in_ruleColor1052); 

                            current = grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:492:6: (enumLiteral_2= 'White' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:492:6: (enumLiteral_2= 'White' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:492:8: enumLiteral_2= 'White'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_19_in_ruleColor1069); 

                            current = grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:498:6: (enumLiteral_3= 'Grey' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:498:6: (enumLiteral_3= 'Grey' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:498:8: enumLiteral_3= 'Grey'
                    {
                    enumLiteral_3=(Token)match(input,20,FOLLOW_20_in_ruleColor1086); 

                            current = grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:504:6: (enumLiteral_4= 'Green' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:504:6: (enumLiteral_4= 'Green' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:504:8: enumLiteral_4= 'Green'
                    {
                    enumLiteral_4=(Token)match(input,21,FOLLOW_21_in_ruleColor1103); 

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
    public static final BitSet FOLLOW_13_in_ruleEntity296 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity317 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14_in_ruleEntity330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_ruleFeature423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNetWorkFeature_in_ruleFeature450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLenghtFeature_in_ruleFeature477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLenghtFeature_in_entryRuleLenghtFeature512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLenghtFeature522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLenghtFeature564 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLenghtFeature581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLenghtFeature602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE690 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDOUBLE708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNetWorkFeature_in_entryRuleNetWorkFeature768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNetWorkFeature778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNetWorkFeature820 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNetWorkFeature837 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNetWorkFeature854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_entryRuleColorFeature895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorFeature905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColorFeature947 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleColorFeature964 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleColorFeature985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleColor1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleColor1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleColor1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleColor1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleColor1103 = new BitSet(new long[]{0x0000000000000002L});

}