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
   * Returns a new object of class '<em>Lenght Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lenght Feature</em>'.
   * @generated
   */
  LenghtFeature createLenghtFeature();

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
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AmlPackage getAmlPackage();

} //AmlFactory
