/*
* generated by Xtext
*/
package org.zhouxuan.example.myaml.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class AmlGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class AmlElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Aml");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsEntityParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Aml hidden(WS, ML_COMMENT, SL_COMMENT):
		//	elements+=Entity*;
		public ParserRule getRule() { return rule; }

		//elements+=Entity*
		public Assignment getElementsAssignment() { return cElementsAssignment; }

		//Entity
		public RuleCall getElementsEntityParserRuleCall_0() { return cElementsEntityParserRuleCall_0; }
	}

	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPuidKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameINTTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeEntityCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeEntityIDTerminalRuleCall_2_1_0_1 = (RuleCall)cSuperTypeEntityCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFeaturesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFeaturesFeatureParserRuleCall_4_0 = (RuleCall)cFeaturesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Entity:
		//	"puid" name=INT ("extends" superType=[Entity])? "{" features+=Feature* "}";
		public ParserRule getRule() { return rule; }

		//"puid" name=INT ("extends" superType=[Entity])? "{" features+=Feature* "}"
		public Group getGroup() { return cGroup; }

		//"puid"
		public Keyword getPuidKeyword_0() { return cPuidKeyword_0; }

		//name=INT
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//INT
		public RuleCall getNameINTTerminalRuleCall_1_0() { return cNameINTTerminalRuleCall_1_0; }

		//("extends" superType=[Entity])?
		public Group getGroup_2() { return cGroup_2; }

		//"extends"
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }

		//superType=[Entity]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }

		//[Entity]
		public CrossReference getSuperTypeEntityCrossReference_2_1_0() { return cSuperTypeEntityCrossReference_2_1_0; }

		//ID
		public RuleCall getSuperTypeEntityIDTerminalRuleCall_2_1_0_1() { return cSuperTypeEntityIDTerminalRuleCall_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//features+=Feature*
		public Assignment getFeaturesAssignment_4() { return cFeaturesAssignment_4; }

		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_4_0() { return cFeaturesFeatureParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Feature");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cColorFeatureParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNetWorkFeatureParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cLenghtFeatureParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Feature:
		//	ColorFeature | NetWorkFeature | LenghtFeature;
		public ParserRule getRule() { return rule; }

		//ColorFeature | NetWorkFeature | LenghtFeature
		public Alternatives getAlternatives() { return cAlternatives; }

		//ColorFeature
		public RuleCall getColorFeatureParserRuleCall_0() { return cColorFeatureParserRuleCall_0; }

		//NetWorkFeature
		public RuleCall getNetWorkFeatureParserRuleCall_1() { return cNetWorkFeatureParserRuleCall_1; }

		//LenghtFeature
		public RuleCall getLenghtFeatureParserRuleCall_2() { return cLenghtFeatureParserRuleCall_2; }
	}

	public class LenghtFeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LenghtFeature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueDOUBLEParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//LenghtFeature:
		//	name=ID "=" value=DOUBLE;
		public ParserRule getRule() { return rule; }

		//name=ID "=" value=DOUBLE
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//value=DOUBLE
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//DOUBLE
		public RuleCall getValueDOUBLEParserRuleCall_2_0() { return cValueDOUBLEParserRuleCall_2_0; }
	}

	public class DOUBLEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DOUBLE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//DOUBLE returns ecore::EDouble:
		//	INT "." INT;
		public ParserRule getRule() { return rule; }

		//INT "." INT
		public Group getGroup() { return cGroup; }

		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }

		//"."
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
	}

	public class NetWorkFeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NetWorkFeature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueIDTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//NetWorkFeature:
		//	name=ID "=" value=ID;
		public ParserRule getRule() { return rule; }

		//name=ID "=" value=ID
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//value=ID
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//ID
		public RuleCall getValueIDTerminalRuleCall_2_0() { return cValueIDTerminalRuleCall_2_0; }
	}

	public class ColorFeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ColorFeature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueColorEnumRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//ColorFeature:
		//	name=ID "=" value=Color;
		public ParserRule getRule() { return rule; }

		//name=ID "=" value=Color
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//value=Color
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//Color
		public RuleCall getValueColorEnumRuleCall_2_0() { return cValueColorEnumRuleCall_2_0; }
	}
	
	
	public class ColorElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "Color");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cRedEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cRedRedKeyword_0_0 = (Keyword)cRedEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBlackEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBlackBlackKeyword_1_0 = (Keyword)cBlackEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cWhiteEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cWhiteWhiteKeyword_2_0 = (Keyword)cWhiteEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cGreyEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cGreyGreyKeyword_3_0 = (Keyword)cGreyEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cGreenEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cGreenGreenKeyword_4_0 = (Keyword)cGreenEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum Color:
		//	Red | Black | White | Grey | Green;
		public EnumRule getRule() { return rule; }

		//Red | Black | White | Grey | Green
		public Alternatives getAlternatives() { return cAlternatives; }

		//Red
		public EnumLiteralDeclaration getRedEnumLiteralDeclaration_0() { return cRedEnumLiteralDeclaration_0; }

		//"Red"
		public Keyword getRedRedKeyword_0_0() { return cRedRedKeyword_0_0; }

		//Black
		public EnumLiteralDeclaration getBlackEnumLiteralDeclaration_1() { return cBlackEnumLiteralDeclaration_1; }

		//"Black"
		public Keyword getBlackBlackKeyword_1_0() { return cBlackBlackKeyword_1_0; }

		//White
		public EnumLiteralDeclaration getWhiteEnumLiteralDeclaration_2() { return cWhiteEnumLiteralDeclaration_2; }

		//"White"
		public Keyword getWhiteWhiteKeyword_2_0() { return cWhiteWhiteKeyword_2_0; }

		//Grey
		public EnumLiteralDeclaration getGreyEnumLiteralDeclaration_3() { return cGreyEnumLiteralDeclaration_3; }

		//"Grey"
		public Keyword getGreyGreyKeyword_3_0() { return cGreyGreyKeyword_3_0; }

		//Green
		public EnumLiteralDeclaration getGreenEnumLiteralDeclaration_4() { return cGreenEnumLiteralDeclaration_4; }

		//"Green"
		public Keyword getGreenGreenKeyword_4_0() { return cGreenGreenKeyword_4_0; }
	}
	
	private AmlElements pAml;
	private EntityElements pEntity;
	private ColorElements unknownRuleColor;
	private FeatureElements pFeature;
	private LenghtFeatureElements pLenghtFeature;
	private DOUBLEElements pDOUBLE;
	private NetWorkFeatureElements pNetWorkFeature;
	private ColorFeatureElements pColorFeature;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public AmlGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.zhouxuan.example.myaml.Aml".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Aml hidden(WS, ML_COMMENT, SL_COMMENT):
	//	elements+=Entity*;
	public AmlElements getAmlAccess() {
		return (pAml != null) ? pAml : (pAml = new AmlElements());
	}
	
	public ParserRule getAmlRule() {
		return getAmlAccess().getRule();
	}

	//Entity:
	//	"puid" name=INT ("extends" superType=[Entity])? "{" features+=Feature* "}";
	public EntityElements getEntityAccess() {
		return (pEntity != null) ? pEntity : (pEntity = new EntityElements());
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}

	//enum Color:
	//	Red | Black | White | Grey | Green;
	public ColorElements getColorAccess() {
		return (unknownRuleColor != null) ? unknownRuleColor : (unknownRuleColor = new ColorElements());
	}
	
	public EnumRule getColorRule() {
		return getColorAccess().getRule();
	}

	//Feature:
	//	ColorFeature | NetWorkFeature | LenghtFeature;
	public FeatureElements getFeatureAccess() {
		return (pFeature != null) ? pFeature : (pFeature = new FeatureElements());
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}

	//LenghtFeature:
	//	name=ID "=" value=DOUBLE;
	public LenghtFeatureElements getLenghtFeatureAccess() {
		return (pLenghtFeature != null) ? pLenghtFeature : (pLenghtFeature = new LenghtFeatureElements());
	}
	
	public ParserRule getLenghtFeatureRule() {
		return getLenghtFeatureAccess().getRule();
	}

	//DOUBLE returns ecore::EDouble:
	//	INT "." INT;
	public DOUBLEElements getDOUBLEAccess() {
		return (pDOUBLE != null) ? pDOUBLE : (pDOUBLE = new DOUBLEElements());
	}
	
	public ParserRule getDOUBLERule() {
		return getDOUBLEAccess().getRule();
	}

	//NetWorkFeature:
	//	name=ID "=" value=ID;
	public NetWorkFeatureElements getNetWorkFeatureAccess() {
		return (pNetWorkFeature != null) ? pNetWorkFeature : (pNetWorkFeature = new NetWorkFeatureElements());
	}
	
	public ParserRule getNetWorkFeatureRule() {
		return getNetWorkFeatureAccess().getRule();
	}

	//ColorFeature:
	//	name=ID "=" value=Color;
	public ColorFeatureElements getColorFeatureAccess() {
		return (pColorFeature != null) ? pColorFeature : (pColorFeature = new ColorFeatureElements());
	}
	
	public ParserRule getColorFeatureRule() {
		return getColorFeatureAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
