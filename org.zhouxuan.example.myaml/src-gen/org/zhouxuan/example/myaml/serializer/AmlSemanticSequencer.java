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
import org.zhouxuan.example.myaml.aml.LenghtFeature;
import org.zhouxuan.example.myaml.aml.NetWorkFeature;
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
				if(context == grammarAccess.getColorFeatureRule() ||
				   context == grammarAccess.getFeatureRule()) {
					sequence_ColorFeature(context, (ColorFeature) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.LENGHT_FEATURE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getLenghtFeatureRule()) {
					sequence_LenghtFeature(context, (LenghtFeature) semanticObject); 
					return; 
				}
				else break;
			case AmlPackage.NET_WORK_FEATURE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getNetWorkFeatureRule()) {
					sequence_NetWorkFeature(context, (NetWorkFeature) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     elements+=Entity*
	 */
	protected void sequence_Aml(EObject context, Aml semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=Color)
	 */
	protected void sequence_ColorFeature(EObject context, ColorFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.FEATURE__NAME));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.COLOR_FEATURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.COLOR_FEATURE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColorFeatureAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getColorFeatureAccess().getValueColorEnumRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=INT superType=[Entity|ID]? features+=Feature*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=DOUBLE)
	 */
	protected void sequence_LenghtFeature(EObject context, LenghtFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.FEATURE__NAME));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.LENGHT_FEATURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.LENGHT_FEATURE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLenghtFeatureAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLenghtFeatureAccess().getValueDOUBLEParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=ID)
	 */
	protected void sequence_NetWorkFeature(EObject context, NetWorkFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.FEATURE__NAME));
			if(transientValues.isValueTransient(semanticObject, AmlPackage.Literals.NET_WORK_FEATURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmlPackage.Literals.NET_WORK_FEATURE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNetWorkFeatureAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNetWorkFeatureAccess().getValueIDTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
}
