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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'puid'", "'extends'", "'{'", "'}'", "'='", "';'", "'length'", "'.'", "'network'", "'color'", "'Cable'", "'Driver'", "'MaxMin'", "'Red'", "'Black'", "'White'", "'Grey'", "'Green'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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

                if ( (LA1_0==11||(LA1_0>=21 && LA1_0<=23)) ) {
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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:126:1: ruleAbstractElements returns [EObject current=null] : (this_Entity_0= ruleEntity | this_SuperEntity_1= ruleSuperEntity ) ;
    public final EObject ruleAbstractElements() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_SuperEntity_1 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:129:28: ( (this_Entity_0= ruleEntity | this_SuperEntity_1= ruleSuperEntity ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:130:1: (this_Entity_0= ruleEntity | this_SuperEntity_1= ruleSuperEntity )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:130:1: (this_Entity_0= ruleEntity | this_SuperEntity_1= ruleSuperEntity )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=21 && LA2_0<=23)) ) {
                alt2=2;
            }
            else {
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
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:141:5: this_SuperEntity_1= ruleSuperEntity
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementsAccess().getSuperEntityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSuperEntity_in_ruleAbstractElements264);
                    this_SuperEntity_1=ruleSuperEntity();

                    state._fsp--;

                     
                            current = this_SuperEntity_1; 
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


    // $ANTLR start "entryRuleSuperEntity"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:157:1: entryRuleSuperEntity returns [EObject current=null] : iv_ruleSuperEntity= ruleSuperEntity EOF ;
    public final EObject entryRuleSuperEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperEntity = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:158:2: (iv_ruleSuperEntity= ruleSuperEntity EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:159:2: iv_ruleSuperEntity= ruleSuperEntity EOF
            {
             newCompositeNode(grammarAccess.getSuperEntityRule()); 
            pushFollow(FOLLOW_ruleSuperEntity_in_entryRuleSuperEntity299);
            iv_ruleSuperEntity=ruleSuperEntity();

            state._fsp--;

             current =iv_ruleSuperEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuperEntity309); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:166:1: ruleSuperEntity returns [EObject current=null] : ( (lv_name_0_0= ruleSuperNames ) ) ;
    public final EObject ruleSuperEntity() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:169:28: ( ( (lv_name_0_0= ruleSuperNames ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:170:1: ( (lv_name_0_0= ruleSuperNames ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:170:1: ( (lv_name_0_0= ruleSuperNames ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:171:1: (lv_name_0_0= ruleSuperNames )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:171:1: (lv_name_0_0= ruleSuperNames )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:172:3: lv_name_0_0= ruleSuperNames
            {
             
            	        newCompositeNode(grammarAccess.getSuperEntityAccess().getNameSuperNamesEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleSuperNames_in_ruleSuperEntity354);
            lv_name_0_0=ruleSuperNames();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSuperEntityRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"SuperNames");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleSuperEntity"


    // $ANTLR start "entryRuleEntity"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:196:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:197:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:198:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity389);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity399); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:205:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'puid' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleSuperEntity ) ) )? otherlv_4= '{' ( (lv_colorFeature_5_0= ruleColorFeature ) ) ( (lv_networkFeature_6_0= ruleNetWorkFeature ) ) ( (lv_lengthFeature_7_0= ruleLengthFeature ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject lv_superType_3_0 = null;

        EObject lv_colorFeature_5_0 = null;

        EObject lv_networkFeature_6_0 = null;

        EObject lv_lengthFeature_7_0 = null;

        EObject lv_features_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:208:28: ( (otherlv_0= 'puid' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleSuperEntity ) ) )? otherlv_4= '{' ( (lv_colorFeature_5_0= ruleColorFeature ) ) ( (lv_networkFeature_6_0= ruleNetWorkFeature ) ) ( (lv_lengthFeature_7_0= ruleLengthFeature ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:209:1: (otherlv_0= 'puid' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleSuperEntity ) ) )? otherlv_4= '{' ( (lv_colorFeature_5_0= ruleColorFeature ) ) ( (lv_networkFeature_6_0= ruleNetWorkFeature ) ) ( (lv_lengthFeature_7_0= ruleLengthFeature ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:209:1: (otherlv_0= 'puid' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleSuperEntity ) ) )? otherlv_4= '{' ( (lv_colorFeature_5_0= ruleColorFeature ) ) ( (lv_networkFeature_6_0= ruleNetWorkFeature ) ) ( (lv_lengthFeature_7_0= ruleLengthFeature ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:209:3: otherlv_0= 'puid' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (lv_superType_3_0= ruleSuperEntity ) ) )? otherlv_4= '{' ( (lv_colorFeature_5_0= ruleColorFeature ) ) ( (lv_networkFeature_6_0= ruleNetWorkFeature ) ) ( (lv_lengthFeature_7_0= ruleLengthFeature ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleEntity436); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getPuidKeyword_0());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:213:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:214:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:214:1: (lv_name_1_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:215:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity453); 

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

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:231:2: (otherlv_2= 'extends' ( (lv_superType_3_0= ruleSuperEntity ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:231:4: otherlv_2= 'extends' ( (lv_superType_3_0= ruleSuperEntity ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity471); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                        
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:235:1: ( (lv_superType_3_0= ruleSuperEntity ) )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:236:1: (lv_superType_3_0= ruleSuperEntity )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:236:1: (lv_superType_3_0= ruleSuperEntity )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:237:3: lv_superType_3_0= ruleSuperEntity
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getSuperTypeSuperEntityParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSuperEntity_in_ruleEntity492);
                    lv_superType_3_0=ruleSuperEntity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		set(
                           			current, 
                           			"superType",
                            		lv_superType_3_0, 
                            		"SuperEntity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleEntity506); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:257:1: ( (lv_colorFeature_5_0= ruleColorFeature ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:258:1: (lv_colorFeature_5_0= ruleColorFeature )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:258:1: (lv_colorFeature_5_0= ruleColorFeature )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:259:3: lv_colorFeature_5_0= ruleColorFeature
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getColorFeatureColorFeatureParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleColorFeature_in_ruleEntity527);
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

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:275:2: ( (lv_networkFeature_6_0= ruleNetWorkFeature ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:276:1: (lv_networkFeature_6_0= ruleNetWorkFeature )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:276:1: (lv_networkFeature_6_0= ruleNetWorkFeature )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:277:3: lv_networkFeature_6_0= ruleNetWorkFeature
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getNetworkFeatureNetWorkFeatureParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleNetWorkFeature_in_ruleEntity548);
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

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:293:2: ( (lv_lengthFeature_7_0= ruleLengthFeature ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:294:1: (lv_lengthFeature_7_0= ruleLengthFeature )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:294:1: (lv_lengthFeature_7_0= ruleLengthFeature )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:295:3: lv_lengthFeature_7_0= ruleLengthFeature
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getLengthFeatureLengthFeatureParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleLengthFeature_in_ruleEntity569);
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

            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:311:2: ( (lv_features_8_0= ruleFeature ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:312:1: (lv_features_8_0= ruleFeature )
            	    {
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:312:1: (lv_features_8_0= ruleFeature )
            	    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:313:3: lv_features_8_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity590);
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
            	    break loop4;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleEntity603); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:341:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:342:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:343:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature639);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature649); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:350:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:353:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:354:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:354:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:354:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:354:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:355:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:355:1: (lv_name_0_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:356:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature691); 

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

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleFeature708); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:376:1: ( (lv_value_2_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:377:1: (lv_value_2_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:377:1: (lv_value_2_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:378:3: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature725); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleFeature742); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:406:1: entryRuleLengthFeature returns [EObject current=null] : iv_ruleLengthFeature= ruleLengthFeature EOF ;
    public final EObject entryRuleLengthFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLengthFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:407:2: (iv_ruleLengthFeature= ruleLengthFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:408:2: iv_ruleLengthFeature= ruleLengthFeature EOF
            {
             newCompositeNode(grammarAccess.getLengthFeatureRule()); 
            pushFollow(FOLLOW_ruleLengthFeature_in_entryRuleLengthFeature778);
            iv_ruleLengthFeature=ruleLengthFeature();

            state._fsp--;

             current =iv_ruleLengthFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLengthFeature788); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:415:1: ruleLengthFeature returns [EObject current=null] : ( ( (lv_name_0_0= 'length' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) otherlv_3= ';' ) ;
    public final EObject ruleLengthFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:418:28: ( ( ( (lv_name_0_0= 'length' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) otherlv_3= ';' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:419:1: ( ( (lv_name_0_0= 'length' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) otherlv_3= ';' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:419:1: ( ( (lv_name_0_0= 'length' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) otherlv_3= ';' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:419:2: ( (lv_name_0_0= 'length' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleDOUBLE ) ) otherlv_3= ';'
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:419:2: ( (lv_name_0_0= 'length' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:420:1: (lv_name_0_0= 'length' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:420:1: (lv_name_0_0= 'length' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:421:3: lv_name_0_0= 'length'
            {
            lv_name_0_0=(Token)match(input,17,FOLLOW_17_in_ruleLengthFeature831); 

                    newLeafNode(lv_name_0_0, grammarAccess.getLengthFeatureAccess().getNameLengthKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLengthFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "length");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleLengthFeature856); 

                	newLeafNode(otherlv_1, grammarAccess.getLengthFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:438:1: ( (lv_value_2_0= ruleDOUBLE ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:439:1: (lv_value_2_0= ruleDOUBLE )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:439:1: (lv_value_2_0= ruleDOUBLE )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:440:3: lv_value_2_0= ruleDOUBLE
            {
             
            	        newCompositeNode(grammarAccess.getLengthFeatureAccess().getValueDOUBLEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDOUBLE_in_ruleLengthFeature877);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleLengthFeature889); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:468:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:469:2: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:470:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE926);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOUBLE937); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:477:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:480:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:481:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:481:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:481:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE977); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,18,FOLLOW_18_in_ruleDOUBLE995); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDOUBLE1010); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:509:1: entryRuleNetWorkFeature returns [EObject current=null] : iv_ruleNetWorkFeature= ruleNetWorkFeature EOF ;
    public final EObject entryRuleNetWorkFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetWorkFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:510:2: (iv_ruleNetWorkFeature= ruleNetWorkFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:511:2: iv_ruleNetWorkFeature= ruleNetWorkFeature EOF
            {
             newCompositeNode(grammarAccess.getNetWorkFeatureRule()); 
            pushFollow(FOLLOW_ruleNetWorkFeature_in_entryRuleNetWorkFeature1055);
            iv_ruleNetWorkFeature=ruleNetWorkFeature();

            state._fsp--;

             current =iv_ruleNetWorkFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNetWorkFeature1065); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:518:1: ruleNetWorkFeature returns [EObject current=null] : ( ( (lv_name_0_0= 'network' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleNetWorkFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:521:28: ( ( ( (lv_name_0_0= 'network' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:522:1: ( ( (lv_name_0_0= 'network' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:522:1: ( ( (lv_name_0_0= 'network' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:522:2: ( (lv_name_0_0= 'network' ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:522:2: ( (lv_name_0_0= 'network' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:523:1: (lv_name_0_0= 'network' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:523:1: (lv_name_0_0= 'network' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:524:3: lv_name_0_0= 'network'
            {
            lv_name_0_0=(Token)match(input,19,FOLLOW_19_in_ruleNetWorkFeature1108); 

                    newLeafNode(lv_name_0_0, grammarAccess.getNetWorkFeatureAccess().getNameNetworkKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNetWorkFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "network");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleNetWorkFeature1133); 

                	newLeafNode(otherlv_1, grammarAccess.getNetWorkFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:541:1: ( (lv_value_2_0= RULE_ID ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:542:1: (lv_value_2_0= RULE_ID )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:542:1: (lv_value_2_0= RULE_ID )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:543:3: lv_value_2_0= RULE_ID
            {
            lv_value_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNetWorkFeature1150); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleNetWorkFeature1167); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:571:1: entryRuleColorFeature returns [EObject current=null] : iv_ruleColorFeature= ruleColorFeature EOF ;
    public final EObject entryRuleColorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorFeature = null;


        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:572:2: (iv_ruleColorFeature= ruleColorFeature EOF )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:573:2: iv_ruleColorFeature= ruleColorFeature EOF
            {
             newCompositeNode(grammarAccess.getColorFeatureRule()); 
            pushFollow(FOLLOW_ruleColorFeature_in_entryRuleColorFeature1203);
            iv_ruleColorFeature=ruleColorFeature();

            state._fsp--;

             current =iv_ruleColorFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColorFeature1213); 

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
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:580:1: ruleColorFeature returns [EObject current=null] : ( ( (lv_name_0_0= 'color' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) otherlv_3= ';' ) ;
    public final EObject ruleColorFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:583:28: ( ( ( (lv_name_0_0= 'color' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) otherlv_3= ';' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:584:1: ( ( (lv_name_0_0= 'color' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) otherlv_3= ';' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:584:1: ( ( (lv_name_0_0= 'color' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) otherlv_3= ';' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:584:2: ( (lv_name_0_0= 'color' ) ) otherlv_1= '=' ( (lv_value_2_0= ruleColor ) ) otherlv_3= ';'
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:584:2: ( (lv_name_0_0= 'color' ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:585:1: (lv_name_0_0= 'color' )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:585:1: (lv_name_0_0= 'color' )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:586:3: lv_name_0_0= 'color'
            {
            lv_name_0_0=(Token)match(input,20,FOLLOW_20_in_ruleColorFeature1256); 

                    newLeafNode(lv_name_0_0, grammarAccess.getColorFeatureAccess().getNameColorKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorFeatureRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_0_0, "color");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleColorFeature1281); 

                	newLeafNode(otherlv_1, grammarAccess.getColorFeatureAccess().getEqualsSignKeyword_1());
                
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:603:1: ( (lv_value_2_0= ruleColor ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:604:1: (lv_value_2_0= ruleColor )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:604:1: (lv_value_2_0= ruleColor )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:605:3: lv_value_2_0= ruleColor
            {
             
            	        newCompositeNode(grammarAccess.getColorFeatureAccess().getValueColorEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleColor_in_ruleColorFeature1302);
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleColorFeature1314); 

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


    // $ANTLR start "ruleSuperNames"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:633:1: ruleSuperNames returns [Enumerator current=null] : ( (enumLiteral_0= 'Cable' ) | (enumLiteral_1= 'Driver' ) | (enumLiteral_2= 'MaxMin' ) ) ;
    public final Enumerator ruleSuperNames() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:635:28: ( ( (enumLiteral_0= 'Cable' ) | (enumLiteral_1= 'Driver' ) | (enumLiteral_2= 'MaxMin' ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:636:1: ( (enumLiteral_0= 'Cable' ) | (enumLiteral_1= 'Driver' ) | (enumLiteral_2= 'MaxMin' ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:636:1: ( (enumLiteral_0= 'Cable' ) | (enumLiteral_1= 'Driver' ) | (enumLiteral_2= 'MaxMin' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:636:2: (enumLiteral_0= 'Cable' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:636:2: (enumLiteral_0= 'Cable' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:636:4: enumLiteral_0= 'Cable'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleSuperNames1364); 

                            current = grammarAccess.getSuperNamesAccess().getCableEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSuperNamesAccess().getCableEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:642:6: (enumLiteral_1= 'Driver' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:642:6: (enumLiteral_1= 'Driver' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:642:8: enumLiteral_1= 'Driver'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleSuperNames1381); 

                            current = grammarAccess.getSuperNamesAccess().getDriverEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSuperNamesAccess().getDriverEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:648:6: (enumLiteral_2= 'MaxMin' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:648:6: (enumLiteral_2= 'MaxMin' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:648:8: enumLiteral_2= 'MaxMin'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_23_in_ruleSuperNames1398); 

                            current = grammarAccess.getSuperNamesAccess().getMaxMinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSuperNamesAccess().getMaxMinEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleSuperNames"


    // $ANTLR start "ruleColor"
    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:658:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Black' ) | (enumLiteral_2= 'White' ) | (enumLiteral_3= 'Grey' ) | (enumLiteral_4= 'Green' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:660:28: ( ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Black' ) | (enumLiteral_2= 'White' ) | (enumLiteral_3= 'Grey' ) | (enumLiteral_4= 'Green' ) ) )
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:661:1: ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Black' ) | (enumLiteral_2= 'White' ) | (enumLiteral_3= 'Grey' ) | (enumLiteral_4= 'Green' ) )
            {
            // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:661:1: ( (enumLiteral_0= 'Red' ) | (enumLiteral_1= 'Black' ) | (enumLiteral_2= 'White' ) | (enumLiteral_3= 'Grey' ) | (enumLiteral_4= 'Green' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            case 28:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:661:2: (enumLiteral_0= 'Red' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:661:2: (enumLiteral_0= 'Red' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:661:4: enumLiteral_0= 'Red'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_24_in_ruleColor1443); 

                            current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:667:6: (enumLiteral_1= 'Black' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:667:6: (enumLiteral_1= 'Black' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:667:8: enumLiteral_1= 'Black'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleColor1460); 

                            current = grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:673:6: (enumLiteral_2= 'White' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:673:6: (enumLiteral_2= 'White' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:673:8: enumLiteral_2= 'White'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_26_in_ruleColor1477); 

                            current = grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:679:6: (enumLiteral_3= 'Grey' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:679:6: (enumLiteral_3= 'Grey' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:679:8: enumLiteral_3= 'Grey'
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_27_in_ruleColor1494); 

                            current = grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:685:6: (enumLiteral_4= 'Green' )
                    {
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:685:6: (enumLiteral_4= 'Green' )
                    // ../org.zhouxuan.example.myaml/src-gen/org/zhouxuan/example/myaml/parser/antlr/internal/InternalAml.g:685:8: enumLiteral_4= 'Green'
                    {
                    enumLiteral_4=(Token)match(input,28,FOLLOW_28_in_ruleColor1511); 

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
    public static final BitSet FOLLOW_ruleAbstractElements_in_ruleAml140 = new BitSet(new long[]{0x0000000000E00802L});
    public static final BitSet FOLLOW_ruleAbstractElements_in_entryRuleAbstractElements180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElements190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleAbstractElements237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperEntity_in_ruleAbstractElements264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperEntity_in_entryRuleSuperEntity299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuperEntity309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperNames_in_ruleSuperEntity354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEntity436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity453 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleEntity471 = new BitSet(new long[]{0x0000000000E02800L});
    public static final BitSet FOLLOW_ruleSuperEntity_in_ruleEntity492 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity506 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleColorFeature_in_ruleEntity527 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleNetWorkFeature_in_ruleEntity548 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleLengthFeature_in_ruleEntity569 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity590 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleEntity603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature691 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFeature708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature725 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFeature742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLengthFeature_in_entryRuleLengthFeature778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLengthFeature788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleLengthFeature831 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLengthFeature856 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_ruleLengthFeature877 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLengthFeature889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOUBLE_in_entryRuleDOUBLE926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOUBLE937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE977 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDOUBLE995 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDOUBLE1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNetWorkFeature_in_entryRuleNetWorkFeature1055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNetWorkFeature1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNetWorkFeature1108 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNetWorkFeature1133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNetWorkFeature1150 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNetWorkFeature1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColorFeature_in_entryRuleColorFeature1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColorFeature1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleColorFeature1256 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleColorFeature1281 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleColorFeature1302 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleColorFeature1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSuperNames1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSuperNames1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSuperNames1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleColor1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleColor1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleColor1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleColor1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleColor1511 = new BitSet(new long[]{0x0000000000000002L});

}