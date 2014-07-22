/**
 */
package org.zhouxuan.example.myaml.aml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.zhouxuan.example.myaml.aml.AmlFactory
 * @model kind="package"
 * @generated
 */
public interface AmlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "aml";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.zhouxuan.org/example/myaml/Aml";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "aml";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AmlPackage eINSTANCE = org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl.init();

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.AmlImpl <em>Aml</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.AmlImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getAml()
   * @generated
   */
  int AML = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AML__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Aml</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AML_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.EntityImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_TYPE = 1;

  /**
   * The feature id for the '<em><b>Color Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__COLOR_FEATURE = 2;

  /**
   * The feature id for the '<em><b>Network Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NETWORK_FEATURE = 3;

  /**
   * The feature id for the '<em><b>Length Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__LENGTH_FEATURE = 4;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FEATURES = 5;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.FeatureImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.LengthFeatureImpl <em>Length Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.LengthFeatureImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getLengthFeature()
   * @generated
   */
  int LENGTH_FEATURE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_FEATURE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Length Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.NetWorkFeatureImpl <em>Net Work Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.NetWorkFeatureImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getNetWorkFeature()
   * @generated
   */
  int NET_WORK_FEATURE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_WORK_FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_WORK_FEATURE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Net Work Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_WORK_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.ColorFeatureImpl <em>Color Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.ColorFeatureImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getColorFeature()
   * @generated
   */
  int COLOR_FEATURE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Color Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.Color <em>Color</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.Color
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getColor()
   * @generated
   */
  int COLOR = 6;


  /**
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.Aml <em>Aml</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aml</em>'.
   * @see org.zhouxuan.example.myaml.aml.Aml
   * @generated
   */
  EClass getAml();

  /**
   * Returns the meta object for the containment reference list '{@link org.zhouxuan.example.myaml.aml.Aml#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.zhouxuan.example.myaml.aml.Aml#getElements()
   * @see #getAml()
   * @generated
   */
  EReference getAml_Elements();

  /**
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.zhouxuan.example.myaml.aml.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.zhouxuan.example.myaml.aml.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the reference '{@link org.zhouxuan.example.myaml.aml.Entity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.zhouxuan.example.myaml.aml.Entity#getSuperType()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperType();

  /**
   * Returns the meta object for the containment reference '{@link org.zhouxuan.example.myaml.aml.Entity#getColorFeature <em>Color Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.Entity#getColorFeature()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_ColorFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.zhouxuan.example.myaml.aml.Entity#getNetworkFeature <em>Network Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Network Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.Entity#getNetworkFeature()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_NetworkFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.zhouxuan.example.myaml.aml.Entity#getLengthFeature <em>Length Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Length Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.Entity#getLengthFeature()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_LengthFeature();

  /**
   * Returns the meta object for the containment reference list '{@link org.zhouxuan.example.myaml.aml.Entity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.zhouxuan.example.myaml.aml.Entity#getFeatures()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Features();

  /**
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.zhouxuan.example.myaml.aml.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.Feature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.zhouxuan.example.myaml.aml.Feature#getValue()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Value();

  /**
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.LengthFeature <em>Length Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Length Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.LengthFeature
   * @generated
   */
  EClass getLengthFeature();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.LengthFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.zhouxuan.example.myaml.aml.LengthFeature#getName()
   * @see #getLengthFeature()
   * @generated
   */
  EAttribute getLengthFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.LengthFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.zhouxuan.example.myaml.aml.LengthFeature#getValue()
   * @see #getLengthFeature()
   * @generated
   */
  EAttribute getLengthFeature_Value();

  /**
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.NetWorkFeature <em>Net Work Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Net Work Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.NetWorkFeature
   * @generated
   */
  EClass getNetWorkFeature();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.NetWorkFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.zhouxuan.example.myaml.aml.NetWorkFeature#getName()
   * @see #getNetWorkFeature()
   * @generated
   */
  EAttribute getNetWorkFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.NetWorkFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.zhouxuan.example.myaml.aml.NetWorkFeature#getValue()
   * @see #getNetWorkFeature()
   * @generated
   */
  EAttribute getNetWorkFeature_Value();

  /**
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.ColorFeature <em>Color Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.ColorFeature
   * @generated
   */
  EClass getColorFeature();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.ColorFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.zhouxuan.example.myaml.aml.ColorFeature#getName()
   * @see #getColorFeature()
   * @generated
   */
  EAttribute getColorFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.ColorFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.zhouxuan.example.myaml.aml.ColorFeature#getValue()
   * @see #getColorFeature()
   * @generated
   */
  EAttribute getColorFeature_Value();

  /**
   * Returns the meta object for enum '{@link org.zhouxuan.example.myaml.aml.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Color</em>'.
   * @see org.zhouxuan.example.myaml.aml.Color
   * @generated
   */
  EEnum getColor();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AmlFactory getAmlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.AmlImpl <em>Aml</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.AmlImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getAml()
     * @generated
     */
    EClass AML = eINSTANCE.getAml();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AML__ELEMENTS = eINSTANCE.getAml_Elements();

    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.EntityImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();

    /**
     * The meta object literal for the '<em><b>Color Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__COLOR_FEATURE = eINSTANCE.getEntity_ColorFeature();

    /**
     * The meta object literal for the '<em><b>Network Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__NETWORK_FEATURE = eINSTANCE.getEntity_NetworkFeature();

    /**
     * The meta object literal for the '<em><b>Length Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__LENGTH_FEATURE = eINSTANCE.getEntity_LengthFeature();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.FeatureImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__VALUE = eINSTANCE.getFeature_Value();

    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.LengthFeatureImpl <em>Length Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.LengthFeatureImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getLengthFeature()
     * @generated
     */
    EClass LENGTH_FEATURE = eINSTANCE.getLengthFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LENGTH_FEATURE__NAME = eINSTANCE.getLengthFeature_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LENGTH_FEATURE__VALUE = eINSTANCE.getLengthFeature_Value();

    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.NetWorkFeatureImpl <em>Net Work Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.NetWorkFeatureImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getNetWorkFeature()
     * @generated
     */
    EClass NET_WORK_FEATURE = eINSTANCE.getNetWorkFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NET_WORK_FEATURE__NAME = eINSTANCE.getNetWorkFeature_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NET_WORK_FEATURE__VALUE = eINSTANCE.getNetWorkFeature_Value();

    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.ColorFeatureImpl <em>Color Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.ColorFeatureImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getColorFeature()
     * @generated
     */
    EClass COLOR_FEATURE = eINSTANCE.getColorFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_FEATURE__NAME = eINSTANCE.getColorFeature_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_FEATURE__VALUE = eINSTANCE.getColorFeature_Value();

    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.Color <em>Color</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.Color
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getColor()
     * @generated
     */
    EEnum COLOR = eINSTANCE.getColor();

  }

} //AmlPackage
