package org.zhouxuan.example.myaml.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.zhouxuan.example.myaml.aml.Aml;
import org.zhouxuan.example.myaml.aml.AmlPackage;
import org.zhouxuan.example.myaml.aml.Cable;
import org.zhouxuan.example.myaml.aml.ColorFeature;
import org.zhouxuan.example.myaml.aml.Drive;
import org.zhouxuan.example.myaml.aml.Entity;
import org.zhouxuan.example.myaml.aml.Feature;
import org.zhouxuan.example.myaml.aml.FormFeature;
import org.zhouxuan.example.myaml.aml.LengthFeature;
import org.zhouxuan.example.myaml.aml.MaxFeature;
import org.zhouxuan.example.myaml.aml.MinMax;
import org.zhouxuan.example.myaml.aml.NetWorkFeature;
import org.zhouxuan.example.myaml.aml.PriceRule;
import org.zhouxuan.example.myaml.aml.ProductPUIDFeature;
import org.zhouxuan.example.myaml.aml.SizeFeature;
import org.zhouxuan.example.myaml.aml.SpeedFeature;
import org.zhouxuan.example.myaml.aml.TargetGroupFeature;
import org.zhouxuan.example.myaml.aml.TypeFeature;
import org.zhouxuan.example.myaml.services.AmlGrammarAccess;

@SuppressWarnings("all")
public class AmlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AmlGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AmlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AmlPackage.AML:
				if(context == grammarAccess.getAmlRule()) {
					sequence_Aml(context, (Aml) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.CABLE:
				if(context == grammarAccess.getAbstractElementsRule() ||
				   context == grammarAccess.getCableRule() ||
				   context == grammarAccess.getSuperEntityRule()) {
					sequence_Cable(context, (Cable) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.COLOR_FEATURE:
				if(context == grammarAccess.getColorFeatureRule()) {
					sequence_ColorFeature(context, (ColorFeature) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.DRIVE:
				if(context == grammarAccess.getAbstractElementsRule() ||
				   context == grammarAccess.getDriveRule() ||
				   context == grammarAccess.getSuperEntityRule()) {
					sequence_Drive(context, (Drive) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.ENTITY:
				if(context == grammarAccess.getAbstractElementsRule() ||
				   context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.FEATURE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature(context, (Feature) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.FORM_FEATURE:
				if(context == grammarAccess.getFormFeatureRule()) {
					sequence_FormFeature(context, (FormFeature) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.LENGTH_FEATURE:
				if(context == grammarAccess.getLengthFeatureRule()) {
					sequence_LengthFeature(context, (LengthFeature) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.MAX_FEATURE:
				if(context == grammarAccess.getMaxFeatureRule()) {
					sequence_MaxFeature(context, (MaxFeature) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.MIN_MAX:
				if(context == grammarAccess.getAbstractElementsRule() ||
				   context == grammarAccess.getMinMaxRule()) {
					sequence_MinMax(context, (MinMax) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.NET_WORK_FEATURE:
				if(context == grammarAccess.getNetWorkFeatureRule()) {
					sequence_NetWorkFeature(context, (NetWorkFeature) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.PRICE_RULE:
				if(context == grammarAccess.getAbstractElementsRule() ||
				   context == grammarAccess.getPriceRuleRule()) {
					sequence_PriceRule(context, (PriceRule) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.PRODUCT_PUID_FEATURE:
				if(context == grammarAccess.getProductPUIDFeatureRule()) {
					sequence_ProductPUIDFeature(context, (ProductPUIDFeature) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.SIZE_FEATURE:
				if(context == grammarAccess.getSizeFeatureRule()) {
					sequence_SizeFeature(context, (SizeFeature) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.SPEED_FEATURE:
				if(context == grammarAccess.getSpeedFeatureRule()) {
					sequence_SpeedFeature(context, (SpeedFeature) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.TARGET_GROUP_FEATURE:
				if(context == grammarAccess.getTargetGroupFeatureRule()) {
					sequence_TargetGroupFeature(context, (TargetGroupFeature) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.TYPE_FEATURE:
				if(context == grammarAccess.getTypeFeatureRule()) {
					sequence_TypeFeature(context, (TypeFeature) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     elements+=AbstractElements*
	 */
	protected void sequence_Aml(EObject context, Aml semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID colorFeature=ColorFeature networkFeature=NetWorkFeature lengthFeature=LengthFeature)
	 */
	protected void sequence_Cable(EObject context, Cable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.ABSTRACT_ELEMENTS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.ABSTRACT_ELEMENTS__NAME));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.CABLE__COLOR_FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.CABLE__COLOR_FEATURE));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.CABLE__NETWORK_FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.CABLE__NETWORK_FEATURE));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.CABLE__LENGTH_FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.CABLE__LENGTH_FEATURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCableAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCableAccess().getColorFeatureColorFeatureParserRuleCall_2_0(), semanticObject.getColorFeature());
		feeder.accept(grammarAccess.getCableAccess().getNetworkFeatureNetWorkFeatureParserRuleCall_3_0(), semanticObject.getNetworkFeature());
		feeder.accept(grammarAccess.getCableAccess().getLengthFeatureLengthFeatureParserRuleCall_4_0(), semanticObject.getLengthFeature());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='color' value=Color)
	 */
	protected void sequence_ColorFeature(EObject context, ColorFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.COLOR_FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.COLOR_FEATURE__NAME));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.COLOR_FEATURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.COLOR_FEATURE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColorFeatureAccess().getNameColorKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getColorFeatureAccess().getValueColorEnumRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID typeFeature=TypeFeature sizeFeature=SizeFeature speedFeature=SpeedFeature formFeature=FormFeature)
	 */
	protected void sequence_Drive(EObject context, Drive semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.ABSTRACT_ELEMENTS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.ABSTRACT_ELEMENTS__NAME));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.DRIVE__TYPE_FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.DRIVE__TYPE_FEATURE));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.DRIVE__SIZE_FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.DRIVE__SIZE_FEATURE));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.DRIVE__SPEED_FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.DRIVE__SPEED_FEATURE));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.DRIVE__FORM_FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.DRIVE__FORM_FEATURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDriveAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDriveAccess().getTypeFeatureTypeFeatureParserRuleCall_2_0(), semanticObject.getTypeFeature());
		feeder.accept(grammarAccess.getDriveAccess().getSizeFeatureSizeFeatureParserRuleCall_3_0(), semanticObject.getSizeFeature());
		feeder.accept(grammarAccess.getDriveAccess().getSpeedFeatureSpeedFeatureParserRuleCall_4_0(), semanticObject.getSpeedFeature());
		feeder.accept(grammarAccess.getDriveAccess().getFormFeatureFormFeatureParserRuleCall_5_0(), semanticObject.getFormFeature());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superType=[SuperEntity|QualifiedName]? features+=Feature*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=ID)
	 */
	protected void sequence_Feature(EObject context, Feature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.FEATURE__NAME));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.FEATURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.FEATURE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFeatureAccess().getValueIDTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='formFactor' value=INT)
	 */
	protected void sequence_FormFeature(EObject context, FormFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.FORM_FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.FORM_FEATURE__NAME));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.FORM_FEATURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.FORM_FEATURE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFormFeatureAccess().getNameFormFactorKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFormFeatureAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='length' value=DOUBLE)
	 */
	protected void sequence_LengthFeature(EObject context, LengthFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.LENGTH_FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.LENGTH_FEATURE__NAME));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.LENGTH_FEATURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.LENGTH_FEATURE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLengthFeatureAccess().getNameLengthKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLengthFeatureAccess().getValueDOUBLEParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='Max' value=INT)
	 */
	protected void sequence_MaxFeature(EObject context, MaxFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.MAX_FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.MAX_FEATURE__NAME));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.MAX_FEATURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.MAX_FEATURE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMaxFeatureAccess().getNameMaxKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMaxFeatureAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID targetGroupFeature=TargetGroupFeature productPuidsFeature=ProductPUIDFeature maxFeature=MaxFeature)
	 */
	protected void sequence_MinMax(EObject context, MinMax semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.ABSTRACT_ELEMENTS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.ABSTRACT_ELEMENTS__NAME));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.MIN_MAX__TARGET_GROUP_FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.MIN_MAX__TARGET_GROUP_FEATURE));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.MIN_MAX__PRODUCT_PUIDS_FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.MIN_MAX__PRODUCT_PUIDS_FEATURE));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.MIN_MAX__MAX_FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.MIN_MAX__MAX_FEATURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMinMaxAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMinMaxAccess().getTargetGroupFeatureTargetGroupFeatureParserRuleCall_2_0(), semanticObject.getTargetGroupFeature());
		feeder.accept(grammarAccess.getMinMaxAccess().getProductPuidsFeatureProductPUIDFeatureParserRuleCall_3_0(), semanticObject.getProductPuidsFeature());
		feeder.accept(grammarAccess.getMinMaxAccess().getMaxFeatureMaxFeatureParserRuleCall_4_0(), semanticObject.getMaxFeature());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='network' value=ID)
	 */
	protected void sequence_NetWorkFeature(EObject context, NetWorkFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.NET_WORK_FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.NET_WORK_FEATURE__NAME));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.NET_WORK_FEATURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.NET_WORK_FEATURE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNetWorkFeatureAccess().getNameNetworkKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNetWorkFeatureAccess().getValueIDTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superType=[MinMax|QualifiedName]? features+=Feature*)
	 */
	protected void sequence_PriceRule(EObject context, PriceRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='ProductPUIDs' values+=INT values+=INT*)
	 */
	protected void sequence_ProductPUIDFeature(EObject context, ProductPUIDFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='size' value=INT)
	 */
	protected void sequence_SizeFeature(EObject context, SizeFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.SIZE_FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.SIZE_FEATURE__NAME));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.SIZE_FEATURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.SIZE_FEATURE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSizeFeatureAccess().getNameSizeKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSizeFeatureAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='speed' value=DOUBLE)
	 */
	protected void sequence_SpeedFeature(EObject context, SpeedFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.SPEED_FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.SPEED_FEATURE__NAME));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.SPEED_FEATURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.SPEED_FEATURE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSpeedFeatureAccess().getNameSpeedKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSpeedFeatureAccess().getValueDOUBLEParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='TargetGroup' value=ID)
	 */
	protected void sequence_TargetGroupFeature(EObject context, TargetGroupFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.TARGET_GROUP_FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.TARGET_GROUP_FEATURE__NAME));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.TARGET_GROUP_FEATURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.TARGET_GROUP_FEATURE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTargetGroupFeatureAccess().getNameTargetGroupKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTargetGroupFeatureAccess().getValueIDTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='type' value=STRING)
	 */
	protected void sequence_TypeFeature(EObject context, TypeFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.TYPE_FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.TYPE_FEATURE__NAME));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.TYPE_FEATURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.TYPE_FEATURE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeFeatureAccess().getNameTypeKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTypeFeatureAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
}
