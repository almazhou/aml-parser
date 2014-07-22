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
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.AbstractElementsImpl <em>Abstract Elements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.AbstractElementsImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getAbstractElements()
   * @generated
   */
  int ABSTRACT_ELEMENTS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENTS__NAME = 0;

  /**
   * The number of structural features of the '<em>Abstract Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.MinMaxImpl <em>Min Max</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.MinMaxImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getMinMax()
   * @generated
   */
  int MIN_MAX = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_MAX__NAME = ABSTRACT_ELEMENTS__NAME;

  /**
   * The feature id for the '<em><b>Target Group Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_MAX__TARGET_GROUP_FEATURE = ABSTRACT_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Product Puids Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_MAX__PRODUCT_PUIDS_FEATURE = ABSTRACT_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_MAX__MAX_FEATURE = ABSTRACT_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Min Max</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_MAX_FEATURE_COUNT = ABSTRACT_ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.MaxFeatureImpl <em>Max Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.MaxFeatureImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getMaxFeature()
   * @generated
   */
  int MAX_FEATURE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_FEATURE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Max Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.ProductPUIDFeatureImpl <em>Product PUID Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.ProductPUIDFeatureImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getProductPUIDFeature()
   * @generated
   */
  int PRODUCT_PUID_FEATURE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_PUID_FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_PUID_FEATURE__VALUES = 1;

  /**
   * The number of structural features of the '<em>Product PUID Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_PUID_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.TargetGroupFeatureImpl <em>Target Group Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.TargetGroupFeatureImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getTargetGroupFeature()
   * @generated
   */
  int TARGET_GROUP_FEATURE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_GROUP_FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_GROUP_FEATURE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Target Group Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_GROUP_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.SuperEntityImpl <em>Super Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.SuperEntityImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getSuperEntity()
   * @generated
   */
  int SUPER_ENTITY = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_ENTITY__NAME = ABSTRACT_ELEMENTS__NAME;

  /**
   * The number of structural features of the '<em>Super Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_ENTITY_FEATURE_COUNT = ABSTRACT_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.DriveImpl <em>Drive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.DriveImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getDrive()
   * @generated
   */
  int DRIVE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVE__NAME = SUPER_ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Type Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVE__TYPE_FEATURE = SUPER_ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Size Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVE__SIZE_FEATURE = SUPER_ENTITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Speed Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVE__SPEED_FEATURE = SUPER_ENTITY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Form Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVE__FORM_FEATURE = SUPER_ENTITY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Drive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRIVE_FEATURE_COUNT = SUPER_ENTITY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.FormFeatureImpl <em>Form Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.FormFeatureImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getFormFeature()
   * @generated
   */
  int FORM_FEATURE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FEATURE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Form Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.SpeedFeatureImpl <em>Speed Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.SpeedFeatureImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getSpeedFeature()
   * @generated
   */
  int SPEED_FEATURE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEED_FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEED_FEATURE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Speed Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEED_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.SizeFeatureImpl <em>Size Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.SizeFeatureImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getSizeFeature()
   * @generated
   */
  int SIZE_FEATURE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FEATURE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Size Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.TypeFeatureImpl <em>Type Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.TypeFeatureImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getTypeFeature()
   * @generated
   */
  int TYPE_FEATURE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Type Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.CableImpl <em>Cable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.CableImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getCable()
   * @generated
   */
  int CABLE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CABLE__NAME = SUPER_ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Color Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CABLE__COLOR_FEATURE = SUPER_ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Network Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CABLE__NETWORK_FEATURE = SUPER_ENTITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Length Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CABLE__LENGTH_FEATURE = SUPER_ENTITY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Cable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CABLE_FEATURE_COUNT = SUPER_ENTITY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.PriceRuleImpl <em>Price Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.PriceRuleImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getPriceRule()
   * @generated
   */
  int PRICE_RULE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRICE_RULE__NAME = ABSTRACT_ELEMENTS__NAME;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRICE_RULE__SUPER_TYPE = ABSTRACT_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRICE_RULE__FEATURES = ABSTRACT_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Price Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRICE_RULE_FEATURE_COUNT = ABSTRACT_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.EntityImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = ABSTRACT_ELEMENTS__NAME;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_TYPE = ABSTRACT_ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FEATURES = ABSTRACT_ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = ABSTRACT_ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.zhouxuan.example.myaml.aml.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.zhouxuan.example.myaml.aml.impl.FeatureImpl
   * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 14;

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
  int LENGTH_FEATURE = 15;

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
  int NET_WORK_FEATURE = 16;

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
  int COLOR_FEATURE = 17;

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
  int COLOR = 19;


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
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.AbstractElements <em>Abstract Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Elements</em>'.
   * @see org.zhouxuan.example.myaml.aml.AbstractElements
   * @generated
   */
  EClass getAbstractElements();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.AbstractElements#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.zhouxuan.example.myaml.aml.AbstractElements#getName()
   * @see #getAbstractElements()
   * @generated
   */
  EAttribute getAbstractElements_Name();

  /**
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.MinMax <em>Min Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Min Max</em>'.
   * @see org.zhouxuan.example.myaml.aml.MinMax
   * @generated
   */
  EClass getMinMax();

  /**
   * Returns the meta object for the containment reference '{@link org.zhouxuan.example.myaml.aml.MinMax#getTargetGroupFeature <em>Target Group Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Group Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.MinMax#getTargetGroupFeature()
   * @see #getMinMax()
   * @generated
   */
  EReference getMinMax_TargetGroupFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.zhouxuan.example.myaml.aml.MinMax#getProductPuidsFeature <em>Product Puids Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Product Puids Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.MinMax#getProductPuidsFeature()
   * @see #getMinMax()
   * @generated
   */
  EReference getMinMax_ProductPuidsFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.zhouxuan.example.myaml.aml.MinMax#getMaxFeature <em>Max Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.MinMax#getMaxFeature()
   * @see #getMinMax()
   * @generated
   */
  EReference getMinMax_MaxFeature();

  /**
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.MaxFeature <em>Max Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Max Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.MaxFeature
   * @generated
   */
  EClass getMaxFeature();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.MaxFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.zhouxuan.example.myaml.aml.MaxFeature#getName()
   * @see #getMaxFeature()
   * @generated
   */
  EAttribute getMaxFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.MaxFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.zhouxuan.example.myaml.aml.MaxFeature#getValue()
   * @see #getMaxFeature()
   * @generated
   */
  EAttribute getMaxFeature_Value();

  /**
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.ProductPUIDFeature <em>Product PUID Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Product PUID Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.ProductPUIDFeature
   * @generated
   */
  EClass getProductPUIDFeature();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.ProductPUIDFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.zhouxuan.example.myaml.aml.ProductPUIDFeature#getName()
   * @see #getProductPUIDFeature()
   * @generated
   */
  EAttribute getProductPUIDFeature_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.zhouxuan.example.myaml.aml.ProductPUIDFeature#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.zhouxuan.example.myaml.aml.ProductPUIDFeature#getValues()
   * @see #getProductPUIDFeature()
   * @generated
   */
  EAttribute getProductPUIDFeature_Values();

  /**
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.TargetGroupFeature <em>Target Group Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target Group Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.TargetGroupFeature
   * @generated
   */
  EClass getTargetGroupFeature();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.TargetGroupFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.zhouxuan.example.myaml.aml.TargetGroupFeature#getName()
   * @see #getTargetGroupFeature()
   * @generated
   */
  EAttribute getTargetGroupFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.TargetGroupFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.zhouxuan.example.myaml.aml.TargetGroupFeature#getValue()
   * @see #getTargetGroupFeature()
   * @generated
   */
  EAttribute getTargetGroupFeature_Value();

  /**
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.Drive <em>Drive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drive</em>'.
   * @see org.zhouxuan.example.myaml.aml.Drive
   * @generated
   */
  EClass getDrive();

  /**
   * Returns the meta object for the containment reference '{@link org.zhouxuan.example.myaml.aml.Drive#getTypeFeature <em>Type Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.Drive#getTypeFeature()
   * @see #getDrive()
   * @generated
   */
  EReference getDrive_TypeFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.zhouxuan.example.myaml.aml.Drive#getSizeFeature <em>Size Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.Drive#getSizeFeature()
   * @see #getDrive()
   * @generated
   */
  EReference getDrive_SizeFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.zhouxuan.example.myaml.aml.Drive#getSpeedFeature <em>Speed Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Speed Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.Drive#getSpeedFeature()
   * @see #getDrive()
   * @generated
   */
  EReference getDrive_SpeedFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.zhouxuan.example.myaml.aml.Drive#getFormFeature <em>Form Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Form Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.Drive#getFormFeature()
   * @see #getDrive()
   * @generated
   */
  EReference getDrive_FormFeature();

  /**
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.FormFeature <em>Form Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.FormFeature
   * @generated
   */
  EClass getFormFeature();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.FormFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.zhouxuan.example.myaml.aml.FormFeature#getName()
   * @see #getFormFeature()
   * @generated
   */
  EAttribute getFormFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.FormFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.zhouxuan.example.myaml.aml.FormFeature#getValue()
   * @see #getFormFeature()
   * @generated
   */
  EAttribute getFormFeature_Value();

  /**
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.SpeedFeature <em>Speed Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Speed Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.SpeedFeature
   * @generated
   */
  EClass getSpeedFeature();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.SpeedFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.zhouxuan.example.myaml.aml.SpeedFeature#getName()
   * @see #getSpeedFeature()
   * @generated
   */
  EAttribute getSpeedFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.SpeedFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.zhouxuan.example.myaml.aml.SpeedFeature#getValue()
   * @see #getSpeedFeature()
   * @generated
   */
  EAttribute getSpeedFeature_Value();

  /**
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.SizeFeature <em>Size Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.SizeFeature
   * @generated
   */
  EClass getSizeFeature();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.SizeFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.zhouxuan.example.myaml.aml.SizeFeature#getName()
   * @see #getSizeFeature()
   * @generated
   */
  EAttribute getSizeFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.SizeFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.zhouxuan.example.myaml.aml.SizeFeature#getValue()
   * @see #getSizeFeature()
   * @generated
   */
  EAttribute getSizeFeature_Value();

  /**
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.TypeFeature <em>Type Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.TypeFeature
   * @generated
   */
  EClass getTypeFeature();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.TypeFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.zhouxuan.example.myaml.aml.TypeFeature#getName()
   * @see #getTypeFeature()
   * @generated
   */
  EAttribute getTypeFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.zhouxuan.example.myaml.aml.TypeFeature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.zhouxuan.example.myaml.aml.TypeFeature#getValue()
   * @see #getTypeFeature()
   * @generated
   */
  EAttribute getTypeFeature_Value();

  /**
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.Cable <em>Cable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cable</em>'.
   * @see org.zhouxuan.example.myaml.aml.Cable
   * @generated
   */
  EClass getCable();

  /**
   * Returns the meta object for the containment reference '{@link org.zhouxuan.example.myaml.aml.Cable#getColorFeature <em>Color Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.Cable#getColorFeature()
   * @see #getCable()
   * @generated
   */
  EReference getCable_ColorFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.zhouxuan.example.myaml.aml.Cable#getNetworkFeature <em>Network Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Network Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.Cable#getNetworkFeature()
   * @see #getCable()
   * @generated
   */
  EReference getCable_NetworkFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.zhouxuan.example.myaml.aml.Cable#getLengthFeature <em>Length Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Length Feature</em>'.
   * @see org.zhouxuan.example.myaml.aml.Cable#getLengthFeature()
   * @see #getCable()
   * @generated
   */
  EReference getCable_LengthFeature();

  /**
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.PriceRule <em>Price Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Price Rule</em>'.
   * @see org.zhouxuan.example.myaml.aml.PriceRule
   * @generated
   */
  EClass getPriceRule();

  /**
   * Returns the meta object for the reference '{@link org.zhouxuan.example.myaml.aml.PriceRule#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.zhouxuan.example.myaml.aml.PriceRule#getSuperType()
   * @see #getPriceRule()
   * @generated
   */
  EReference getPriceRule_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.zhouxuan.example.myaml.aml.PriceRule#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.zhouxuan.example.myaml.aml.PriceRule#getFeatures()
   * @see #getPriceRule()
   * @generated
   */
  EReference getPriceRule_Features();

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
   * Returns the meta object for class '{@link org.zhouxuan.example.myaml.aml.SuperEntity <em>Super Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Super Entity</em>'.
   * @see org.zhouxuan.example.myaml.aml.SuperEntity
   * @generated
   */
  EClass getSuperEntity();

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
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.AbstractElementsImpl <em>Abstract Elements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.AbstractElementsImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getAbstractElements()
     * @generated
     */
    EClass ABSTRACT_ELEMENTS = eINSTANCE.getAbstractElements();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ELEMENTS__NAME = eINSTANCE.getAbstractElements_Name();

    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.MinMaxImpl <em>Min Max</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.MinMaxImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getMinMax()
     * @generated
     */
    EClass MIN_MAX = eINSTANCE.getMinMax();

    /**
     * The meta object literal for the '<em><b>Target Group Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIN_MAX__TARGET_GROUP_FEATURE = eINSTANCE.getMinMax_TargetGroupFeature();

    /**
     * The meta object literal for the '<em><b>Product Puids Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIN_MAX__PRODUCT_PUIDS_FEATURE = eINSTANCE.getMinMax_ProductPuidsFeature();

    /**
     * The meta object literal for the '<em><b>Max Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIN_MAX__MAX_FEATURE = eINSTANCE.getMinMax_MaxFeature();

    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.MaxFeatureImpl <em>Max Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.MaxFeatureImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getMaxFeature()
     * @generated
     */
    EClass MAX_FEATURE = eINSTANCE.getMaxFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAX_FEATURE__NAME = eINSTANCE.getMaxFeature_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAX_FEATURE__VALUE = eINSTANCE.getMaxFeature_Value();

    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.ProductPUIDFeatureImpl <em>Product PUID Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.ProductPUIDFeatureImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getProductPUIDFeature()
     * @generated
     */
    EClass PRODUCT_PUID_FEATURE = eINSTANCE.getProductPUIDFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT_PUID_FEATURE__NAME = eINSTANCE.getProductPUIDFeature_Name();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT_PUID_FEATURE__VALUES = eINSTANCE.getProductPUIDFeature_Values();

    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.TargetGroupFeatureImpl <em>Target Group Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.TargetGroupFeatureImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getTargetGroupFeature()
     * @generated
     */
    EClass TARGET_GROUP_FEATURE = eINSTANCE.getTargetGroupFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET_GROUP_FEATURE__NAME = eINSTANCE.getTargetGroupFeature_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET_GROUP_FEATURE__VALUE = eINSTANCE.getTargetGroupFeature_Value();

    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.DriveImpl <em>Drive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.DriveImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getDrive()
     * @generated
     */
    EClass DRIVE = eINSTANCE.getDrive();

    /**
     * The meta object literal for the '<em><b>Type Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DRIVE__TYPE_FEATURE = eINSTANCE.getDrive_TypeFeature();

    /**
     * The meta object literal for the '<em><b>Size Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DRIVE__SIZE_FEATURE = eINSTANCE.getDrive_SizeFeature();

    /**
     * The meta object literal for the '<em><b>Speed Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DRIVE__SPEED_FEATURE = eINSTANCE.getDrive_SpeedFeature();

    /**
     * The meta object literal for the '<em><b>Form Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DRIVE__FORM_FEATURE = eINSTANCE.getDrive_FormFeature();

    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.FormFeatureImpl <em>Form Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.FormFeatureImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getFormFeature()
     * @generated
     */
    EClass FORM_FEATURE = eINSTANCE.getFormFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_FEATURE__NAME = eINSTANCE.getFormFeature_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_FEATURE__VALUE = eINSTANCE.getFormFeature_Value();

    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.SpeedFeatureImpl <em>Speed Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.SpeedFeatureImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getSpeedFeature()
     * @generated
     */
    EClass SPEED_FEATURE = eINSTANCE.getSpeedFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPEED_FEATURE__NAME = eINSTANCE.getSpeedFeature_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPEED_FEATURE__VALUE = eINSTANCE.getSpeedFeature_Value();

    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.SizeFeatureImpl <em>Size Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.SizeFeatureImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getSizeFeature()
     * @generated
     */
    EClass SIZE_FEATURE = eINSTANCE.getSizeFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE_FEATURE__NAME = eINSTANCE.getSizeFeature_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE_FEATURE__VALUE = eINSTANCE.getSizeFeature_Value();

    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.TypeFeatureImpl <em>Type Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.TypeFeatureImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getTypeFeature()
     * @generated
     */
    EClass TYPE_FEATURE = eINSTANCE.getTypeFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FEATURE__NAME = eINSTANCE.getTypeFeature_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FEATURE__VALUE = eINSTANCE.getTypeFeature_Value();

    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.CableImpl <em>Cable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.CableImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getCable()
     * @generated
     */
    EClass CABLE = eINSTANCE.getCable();

    /**
     * The meta object literal for the '<em><b>Color Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CABLE__COLOR_FEATURE = eINSTANCE.getCable_ColorFeature();

    /**
     * The meta object literal for the '<em><b>Network Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CABLE__NETWORK_FEATURE = eINSTANCE.getCable_NetworkFeature();

    /**
     * The meta object literal for the '<em><b>Length Feature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CABLE__LENGTH_FEATURE = eINSTANCE.getCable_LengthFeature();

    /**
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.PriceRuleImpl <em>Price Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.PriceRuleImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getPriceRule()
     * @generated
     */
    EClass PRICE_RULE = eINSTANCE.getPriceRule();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRICE_RULE__SUPER_TYPE = eINSTANCE.getPriceRule_SuperType();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRICE_RULE__FEATURES = eINSTANCE.getPriceRule_Features();

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
     * The meta object literal for the '{@link org.zhouxuan.example.myaml.aml.impl.SuperEntityImpl <em>Super Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.zhouxuan.example.myaml.aml.impl.SuperEntityImpl
     * @see org.zhouxuan.example.myaml.aml.impl.AmlPackageImpl#getSuperEntity()
     * @generated
     */
    EClass SUPER_ENTITY = eINSTANCE.getSuperEntity();

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
