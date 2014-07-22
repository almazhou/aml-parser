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
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FEATURES = 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 3;

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
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.LenghtFeatureImpl <em>Lenght Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.LenghtFeatureImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getLenghtFeature()
   * @generated
   */
  int LENGHT_FEATURE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGHT_FEATURE__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGHT_FEATURE__VALUE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Lenght Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGHT_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

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
  int NET_WORK_FEATURE__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_WORK_FEATURE__VALUE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Net Work Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_WORK_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

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
  int COLOR_FEATURE__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE__VALUE = FEATURE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Color Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

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
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.LenghtFeature <em>Lenght Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lenght Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.LenghtFeature
   * @generated
   */
  EClass getLenghtFeature();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.LenghtFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.zhouxuan.example.myaml.aml.LenghtFeature#getValue()
   * @see #getLenghtFeature()
   * @generated
   */
  EAttribute getLenghtFeature_Value();

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
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.LenghtFeatureImpl <em>Lenght Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.LenghtFeatureImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getLenghtFeature()
     * @generated
     */
    EClass LENGHT_FEATURE = eINSTANCE.getLenghtFeature();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LENGHT_FEATURE__VALUE = eINSTANCE.getLenghtFeature_Value();

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
