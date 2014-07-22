/**
 */
package org.zhouxuan.example.myaml.aml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.zhouxuan.example.myaml.aml.AmlPackage
 * @generated
 */
public interface AmlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AmlFactory eINSTANCE = org.zhouxuan.example.myaml.aml.impl.AmlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Aml</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aml</em>'.
   * @generated
   */
  Aml createAml();

  /**
   * Returns a new object of class '<em>Abstract Elements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Elements</em>'.
   * @generated
   */
  AbstractElements createAbstractElements();

  /**
   * Returns a new object of class '<em>Min Max</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Min Max</em>'.
   * @generated
   */
  MinMax createMinMax();

  /**
   * Returns a new object of class '<em>Max Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Max Feature</em>'.
   * @generated
   */
  MaxFeature createMaxFeature();

  /**
   * Returns a new object of class '<em>Product PUID Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product PUID Feature</em>'.
   * @generated
   */
  ProductPUIDFeature createProductPUIDFeature();

  /**
   * Returns a new object of class '<em>Target Group Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Target Group Feature</em>'.
   * @generated
   */
  TargetGroupFeature createTargetGroupFeature();

  /**
   * Returns a new object of class '<em>Drive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drive</em>'.
   * @generated
   */
  Drive createDrive();

  /**
   * Returns a new object of class '<em>Form Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Form Feature</em>'.
   * @generated
   */
  FormFeature createFormFeature();

  /**
   * Returns a new object of class '<em>Speed Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Speed Feature</em>'.
   * @generated
   */
  SpeedFeature createSpeedFeature();

  /**
   * Returns a new object of class '<em>Size Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Size Feature</em>'.
   * @generated
   */
  SizeFeature createSizeFeature();

  /**
   * Returns a new object of class '<em>Type Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Feature</em>'.
   * @generated
   */
  TypeFeature createTypeFeature();

  /**
   * Returns a new object of class '<em>Cable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cable</em>'.
   * @generated
   */
  Cable createCable();

  /**
   * Returns a new object of class '<em>Price Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Price Rule</em>'.
   * @generated
   */
  PriceRule createPriceRule();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Length Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Length Feature</em>'.
   * @generated
   */
  LengthFeature createLengthFeature();

  /**
   * Returns a new object of class '<em>Net Work Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Net Work Feature</em>'.
   * @generated
   */
  NetWorkFeature createNetWorkFeature();

  /**
   * Returns a new object of class '<em>Color Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color Feature</em>'.
   * @generated
   */
  ColorFeature createColorFeature();

  /**
   * Returns a new object of class '<em>Super Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Super Entity</em>'.
   * @generated
   */
  SuperEntity createSuperEntity();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AmlPackage getAmlPackage();

} //AmlFactory
