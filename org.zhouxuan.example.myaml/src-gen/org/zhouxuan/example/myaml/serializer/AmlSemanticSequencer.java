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
import org.zhouxuan.example.myaml.aml.ColorFeature;
import org.zhouxuan.example.myaml.aml.Entity;
import org.zhouxuan.example.myaml.aml.Feature;
import org.zhouxuan.example.myaml.aml.LengthFeature;
import org.zhouxuan.example.myaml.aml.NetWorkFeature;
import org.zhouxuan.example.myaml.aml.SuperEntity;
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
			case AmlPackage.COLOR_FEATURE:
				if(context == grammarAccess.getColorFeatureRule()) {
					sequence_ColorFeature(context, (ColorFeature) semanticObject); 
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
			case AmlPackage.LENGTH_FEATURE:
				if(context == grammarAccess.getLengthFeatureRule()) {
					sequence_LengthFeature(context, (LengthFeature) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.NET_WORK_FEATURE:
				if(context == grammarAccess.getNetWorkFeatureRule()) {
					sequence_NetWorkFeature(context, (NetWorkFeature) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.SUPER_ENTITY:
				if(context == grammarAccess.getAbstractElementsRule() ||
				   context == grammarAccess.getSuperEntityRule()) {
					sequence_SuperEntity(context, (SuperEntity) semanticObject); 
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
	 *     (
	 *         name=ID 
	 *         superType=SuperEntity? 
	 *         colorFeature=ColorFeature 
	 *         networkFeature=NetWorkFeature 
	 *         lengthFeature=LengthFeature 
	 *         features+=Feature*
	 *     )
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
	 *     name=SuperNames
	 */
	protected void sequence_SuperEntity(EObject context, SuperEntity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.SUPER_ENTITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.SUPER_ENTITY__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSuperEntityAccess().getNameSuperNamesEnumRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
}
