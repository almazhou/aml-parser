/*
* generated by Xtext
*/
grammar InternalAml;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.zhouxuan.example.myaml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleAml
entryRuleAml returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	:
	{ newCompositeNode(grammarAccess.getAmlRule()); }
	 iv_ruleAml=ruleAml 
	 { $current=$iv_ruleAml.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Aml
ruleAml returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getAmlAccess().getElementsAbstractElementsParserRuleCall_0()); 
	    }
		lv_elements_0_0=ruleAbstractElements		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAmlRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_0_0, 
        		"AbstractElements");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRuleAbstractElements
entryRuleAbstractElements returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractElementsRule()); }
	 iv_ruleAbstractElements=ruleAbstractElements 
	 { $current=$iv_ruleAbstractElements.current; } 
	 EOF 
;

// Rule AbstractElements
ruleAbstractElements returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractElementsAccess().getEntityParserRuleCall_0()); 
    }
    this_Entity_0=ruleEntity
    { 
        $current = $this_Entity_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractElementsAccess().getPriceRuleParserRuleCall_1()); 
    }
    this_PriceRule_1=rulePriceRule
    { 
        $current = $this_PriceRule_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractElementsAccess().getSuperEntityParserRuleCall_2()); 
    }
    this_SuperEntity_2=ruleSuperEntity
    { 
        $current = $this_SuperEntity_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractElementsAccess().getMinMaxParserRuleCall_3()); 
    }
    this_MinMax_3=ruleMinMax
    { 
        $current = $this_MinMax_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMinMax
entryRuleMinMax returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMinMaxRule()); }
	 iv_ruleMinMax=ruleMinMax 
	 { $current=$iv_ruleMinMax.current; } 
	 EOF 
;

// Rule MinMax
ruleMinMax returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getMinMaxAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMinMaxRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMinMaxAccess().getLeftCurlyBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMinMaxAccess().getTargetGroupFeatureTargetGroupFeatureParserRuleCall_2_0()); 
	    }
		lv_targetGroupFeature_2_0=ruleTargetGroupFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMinMaxRule());
	        }
       		set(
       			$current, 
       			"targetGroupFeature",
        		lv_targetGroupFeature_2_0, 
        		"TargetGroupFeature");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMinMaxAccess().getProductPuidsFeatureProductPUIDFeatureParserRuleCall_3_0()); 
	    }
		lv_productPuidsFeature_3_0=ruleProductPUIDFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMinMaxRule());
	        }
       		set(
       			$current, 
       			"productPuidsFeature",
        		lv_productPuidsFeature_3_0, 
        		"ProductPUIDFeature");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMinMaxAccess().getMaxFeatureMaxFeatureParserRuleCall_4_0()); 
	    }
		lv_maxFeature_4_0=ruleMaxFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMinMaxRule());
	        }
       		set(
       			$current, 
       			"maxFeature",
        		lv_maxFeature_4_0, 
        		"MaxFeature");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMinMaxAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleMaxFeature
entryRuleMaxFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMaxFeatureRule()); }
	 iv_ruleMaxFeature=ruleMaxFeature 
	 { $current=$iv_ruleMaxFeature.current; } 
	 EOF 
;

// Rule MaxFeature
ruleMaxFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=	'Max' 
    {
        newLeafNode(lv_name_0_0, grammarAccess.getMaxFeatureAccess().getNameMaxKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMaxFeatureRule());
	        }
       		setWithLastConsumed($current, "name", lv_name_0_0, "Max");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMaxFeatureAccess().getEqualsSignKeyword_1());
    }
(
(
		lv_value_2_0=RULE_INT
		{
			newLeafNode(lv_value_2_0, grammarAccess.getMaxFeatureAccess().getValueINTTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMaxFeatureRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"INT");
	    }

)
))
;





// Entry rule entryRuleProductPUIDFeature
entryRuleProductPUIDFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProductPUIDFeatureRule()); }
	 iv_ruleProductPUIDFeature=ruleProductPUIDFeature 
	 { $current=$iv_ruleProductPUIDFeature.current; } 
	 EOF 
;

// Rule ProductPUIDFeature
ruleProductPUIDFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=	'ProductPUIDs' 
    {
        newLeafNode(lv_name_0_0, grammarAccess.getProductPUIDFeatureAccess().getNameProductPUIDsKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getProductPUIDFeatureRule());
	        }
       		setWithLastConsumed($current, "name", lv_name_0_0, "ProductPUIDs");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getProductPUIDFeatureAccess().getEqualsSignKeyword_1());
    }
(
(
		lv_values_2_0=RULE_INT
		{
			newLeafNode(lv_values_2_0, grammarAccess.getProductPUIDFeatureAccess().getValuesINTTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getProductPUIDFeatureRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"values",
        		lv_values_2_0, 
        		"INT");
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getProductPUIDFeatureAccess().getCommaKeyword_3_0());
    }
(
(
		lv_values_4_0=RULE_INT
		{
			newLeafNode(lv_values_4_0, grammarAccess.getProductPUIDFeatureAccess().getValuesINTTerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getProductPUIDFeatureRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"values",
        		lv_values_4_0, 
        		"INT");
	    }

)
))*)
;





// Entry rule entryRuleTargetGroupFeature
entryRuleTargetGroupFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTargetGroupFeatureRule()); }
	 iv_ruleTargetGroupFeature=ruleTargetGroupFeature 
	 { $current=$iv_ruleTargetGroupFeature.current; } 
	 EOF 
;

// Rule TargetGroupFeature
ruleTargetGroupFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=	'TargetGroup' 
    {
        newLeafNode(lv_name_0_0, grammarAccess.getTargetGroupFeatureAccess().getNameTargetGroupKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTargetGroupFeatureRule());
	        }
       		setWithLastConsumed($current, "name", lv_name_0_0, "TargetGroup");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTargetGroupFeatureAccess().getEqualsSignKeyword_1());
    }
(
(
		lv_value_2_0=RULE_ID
		{
			newLeafNode(lv_value_2_0, grammarAccess.getTargetGroupFeatureAccess().getValueIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTargetGroupFeatureRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleDrive
entryRuleDrive returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDriveRule()); }
	 iv_ruleDrive=ruleDrive 
	 { $current=$iv_ruleDrive.current; } 
	 EOF 
;

// Rule Drive
ruleDrive returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getDriveAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDriveRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDriveAccess().getLeftCurlyBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDriveAccess().getTypeFeatureTypeFeatureParserRuleCall_2_0()); 
	    }
		lv_typeFeature_2_0=ruleTypeFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDriveRule());
	        }
       		set(
       			$current, 
       			"typeFeature",
        		lv_typeFeature_2_0, 
        		"TypeFeature");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDriveAccess().getSizeFeatureSizeFeatureParserRuleCall_3_0()); 
	    }
		lv_sizeFeature_3_0=ruleSizeFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDriveRule());
	        }
       		set(
       			$current, 
       			"sizeFeature",
        		lv_sizeFeature_3_0, 
        		"SizeFeature");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDriveAccess().getSpeedFeatureSpeedFeatureParserRuleCall_4_0()); 
	    }
		lv_speedFeature_4_0=ruleSpeedFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDriveRule());
	        }
       		set(
       			$current, 
       			"speedFeature",
        		lv_speedFeature_4_0, 
        		"SpeedFeature");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDriveAccess().getFormFeatureFormFeatureParserRuleCall_5_0()); 
	    }
		lv_formFeature_5_0=ruleFormFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDriveRule());
	        }
       		set(
       			$current, 
       			"formFeature",
        		lv_formFeature_5_0, 
        		"FormFeature");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getDriveAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleFormFeature
entryRuleFormFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFormFeatureRule()); }
	 iv_ruleFormFeature=ruleFormFeature 
	 { $current=$iv_ruleFormFeature.current; } 
	 EOF 
;

// Rule FormFeature
ruleFormFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=	'formFactor' 
    {
        newLeafNode(lv_name_0_0, grammarAccess.getFormFeatureAccess().getNameFormFactorKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFormFeatureRule());
	        }
       		setWithLastConsumed($current, "name", lv_name_0_0, "formFactor");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFormFeatureAccess().getEqualsSignKeyword_1());
    }
(
(
		lv_value_2_0=RULE_INT
		{
			newLeafNode(lv_value_2_0, grammarAccess.getFormFeatureAccess().getValueINTTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFormFeatureRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"INT");
	    }

)
))
;





// Entry rule entryRuleSpeedFeature
entryRuleSpeedFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSpeedFeatureRule()); }
	 iv_ruleSpeedFeature=ruleSpeedFeature 
	 { $current=$iv_ruleSpeedFeature.current; } 
	 EOF 
;

// Rule SpeedFeature
ruleSpeedFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=	'speed' 
    {
        newLeafNode(lv_name_0_0, grammarAccess.getSpeedFeatureAccess().getNameSpeedKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSpeedFeatureRule());
	        }
       		setWithLastConsumed($current, "name", lv_name_0_0, "speed");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSpeedFeatureAccess().getEqualsSignKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSpeedFeatureAccess().getValueDOUBLEParserRuleCall_2_0()); 
	    }
		lv_value_2_0=ruleDOUBLE		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSpeedFeatureRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"DOUBLE");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleSizeFeature
entryRuleSizeFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSizeFeatureRule()); }
	 iv_ruleSizeFeature=ruleSizeFeature 
	 { $current=$iv_ruleSizeFeature.current; } 
	 EOF 
;

// Rule SizeFeature
ruleSizeFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=	'size' 
    {
        newLeafNode(lv_name_0_0, grammarAccess.getSizeFeatureAccess().getNameSizeKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSizeFeatureRule());
	        }
       		setWithLastConsumed($current, "name", lv_name_0_0, "size");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSizeFeatureAccess().getEqualsSignKeyword_1());
    }
(
(
		lv_value_2_0=RULE_INT
		{
			newLeafNode(lv_value_2_0, grammarAccess.getSizeFeatureAccess().getValueINTTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSizeFeatureRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"INT");
	    }

)
))
;





// Entry rule entryRuleTypeFeature
entryRuleTypeFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeFeatureRule()); }
	 iv_ruleTypeFeature=ruleTypeFeature 
	 { $current=$iv_ruleTypeFeature.current; } 
	 EOF 
;

// Rule TypeFeature
ruleTypeFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=	'type' 
    {
        newLeafNode(lv_name_0_0, grammarAccess.getTypeFeatureAccess().getNameTypeKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeFeatureRule());
	        }
       		setWithLastConsumed($current, "name", lv_name_0_0, "type");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTypeFeatureAccess().getEqualsSignKeyword_1());
    }
(
(
		lv_value_2_0=RULE_STRING
		{
			newLeafNode(lv_value_2_0, grammarAccess.getTypeFeatureAccess().getValueSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeFeatureRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleCable
entryRuleCable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCableRule()); }
	 iv_ruleCable=ruleCable 
	 { $current=$iv_ruleCable.current; } 
	 EOF 
;

// Rule Cable
ruleCable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getCableAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCableRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCableAccess().getLeftCurlyBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCableAccess().getColorFeatureColorFeatureParserRuleCall_2_0()); 
	    }
		lv_colorFeature_2_0=ruleColorFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCableRule());
	        }
       		set(
       			$current, 
       			"colorFeature",
        		lv_colorFeature_2_0, 
        		"ColorFeature");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getCableAccess().getNetworkFeatureNetWorkFeatureParserRuleCall_3_0()); 
	    }
		lv_networkFeature_3_0=ruleNetWorkFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCableRule());
	        }
       		set(
       			$current, 
       			"networkFeature",
        		lv_networkFeature_3_0, 
        		"NetWorkFeature");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getCableAccess().getLengthFeatureLengthFeatureParserRuleCall_4_0()); 
	    }
		lv_lengthFeature_4_0=ruleLengthFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCableRule());
	        }
       		set(
       			$current, 
       			"lengthFeature",
        		lv_lengthFeature_4_0, 
        		"LengthFeature");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getCableAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRulePriceRule
entryRulePriceRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPriceRuleRule()); }
	 iv_rulePriceRule=rulePriceRule 
	 { $current=$iv_rulePriceRule.current; } 
	 EOF 
;

// Rule PriceRule
rulePriceRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='rule' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPriceRuleAccess().getRuleKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getPriceRuleAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPriceRuleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='extends' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPriceRuleAccess().getExtendsKeyword_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPriceRuleRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getPriceRuleAccess().getSuperTypeMinMaxCrossReference_2_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPriceRuleAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPriceRuleAccess().getFeaturesFeatureParserRuleCall_4_0()); 
	    }
		lv_features_5_0=ruleFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPriceRuleRule());
	        }
       		add(
       			$current, 
       			"features",
        		lv_features_5_0, 
        		"Feature");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getPriceRuleAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	 iv_ruleEntity=ruleEntity 
	 { $current=$iv_ruleEntity.current; } 
	 EOF 
;

// Rule Entity
ruleEntity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='puid' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getPuidKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='extends' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getSuperTypeSuperEntityCrossReference_2_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
	    }
		lv_features_5_0=ruleFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"features",
        		lv_features_5_0, 
        		"Feature");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	 iv_ruleFeature=ruleFeature 
	 { $current=$iv_ruleFeature.current; } 
	 EOF 
;

// Rule Feature
ruleFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFeatureRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getEqualsSignKeyword_1());
    }
(
(
		lv_value_2_0=RULE_ID
		{
			newLeafNode(lv_value_2_0, grammarAccess.getFeatureAccess().getValueIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFeatureRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"ID");
	    }

)
)	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleLengthFeature
entryRuleLengthFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLengthFeatureRule()); }
	 iv_ruleLengthFeature=ruleLengthFeature 
	 { $current=$iv_ruleLengthFeature.current; } 
	 EOF 
;

// Rule LengthFeature
ruleLengthFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=	'length' 
    {
        newLeafNode(lv_name_0_0, grammarAccess.getLengthFeatureAccess().getNameLengthKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLengthFeatureRule());
	        }
       		setWithLastConsumed($current, "name", lv_name_0_0, "length");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getLengthFeatureAccess().getEqualsSignKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLengthFeatureAccess().getValueDOUBLEParserRuleCall_2_0()); 
	    }
		lv_value_2_0=ruleDOUBLE		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLengthFeatureRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"DOUBLE");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getLengthFeatureAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleDOUBLE
entryRuleDOUBLE returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDOUBLERule()); } 
	 iv_ruleDOUBLE=ruleDOUBLE 
	 { $current=$iv_ruleDOUBLE.current.getText(); }  
	 EOF 
;

// Rule DOUBLE
ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_INT_0=RULE_INT    {
		$current.merge(this_INT_0);
    }

    { 
    newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
    }

	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 
    }
    this_INT_2=RULE_INT    {
		$current.merge(this_INT_2);
    }

    { 
    newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2()); 
    }
)
    ;





// Entry rule entryRuleNetWorkFeature
entryRuleNetWorkFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNetWorkFeatureRule()); }
	 iv_ruleNetWorkFeature=ruleNetWorkFeature 
	 { $current=$iv_ruleNetWorkFeature.current; } 
	 EOF 
;

// Rule NetWorkFeature
ruleNetWorkFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=	'network' 
    {
        newLeafNode(lv_name_0_0, grammarAccess.getNetWorkFeatureAccess().getNameNetworkKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNetWorkFeatureRule());
	        }
       		setWithLastConsumed($current, "name", lv_name_0_0, "network");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getNetWorkFeatureAccess().getEqualsSignKeyword_1());
    }
(
(
		lv_value_2_0=RULE_ID
		{
			newLeafNode(lv_value_2_0, grammarAccess.getNetWorkFeatureAccess().getValueIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNetWorkFeatureRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"ID");
	    }

)
)	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getNetWorkFeatureAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleColorFeature
entryRuleColorFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getColorFeatureRule()); }
	 iv_ruleColorFeature=ruleColorFeature 
	 { $current=$iv_ruleColorFeature.current; } 
	 EOF 
;

// Rule ColorFeature
ruleColorFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=	'color' 
    {
        newLeafNode(lv_name_0_0, grammarAccess.getColorFeatureAccess().getNameColorKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getColorFeatureRule());
	        }
       		setWithLastConsumed($current, "name", lv_name_0_0, "color");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getColorFeatureAccess().getEqualsSignKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getColorFeatureAccess().getValueColorEnumRuleCall_2_0()); 
	    }
		lv_value_2_0=ruleColor		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getColorFeatureRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"Color");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getColorFeatureAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleSuperEntity
entryRuleSuperEntity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSuperEntityRule()); }
	 iv_ruleSuperEntity=ruleSuperEntity 
	 { $current=$iv_ruleSuperEntity.current; } 
	 EOF 
;

// Rule SuperEntity
ruleSuperEntity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getSuperEntityAccess().getCableParserRuleCall_0()); 
    }
    this_Cable_0=ruleCable
    { 
        $current = $this_Cable_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSuperEntityAccess().getDriveParserRuleCall_1()); 
    }
    this_Drive_1=ruleDrive
    { 
        $current = $this_Drive_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Rule Color
ruleColor returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='Red' 
	{
        $current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='Black' 
	{
        $current = grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='White' 
	{
        $current = grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='Grey' 
	{
        $current = grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getGreyEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='Green' 
	{
        $current = grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_4()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


