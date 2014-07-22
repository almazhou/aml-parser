/**
 */
package org.zhouxuan.example.myaml.aml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.zhouxuan.example.myaml.aml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmlFactoryImpl extends EFactoryImpl implements AmlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AmlFactory init()
  {
    try
    {
      AmlFactory theAmlFactory = (AmlFactory)EPackage.Registry.INSTANCE.getEFactory(AmlPackage.eNS_URI);
      if (theAmlFactory != null)
      {
        return theAmlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AmlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AmlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AmlPackage.AML: return createAml();
      case AmlPackage.ABSTRACT_ELEMENTS: return createAbstractElements();
      case AmlPackage.MIN_MAX: return createMinMax();
      case AmlPackage.MAX_FEATURE: return createMaxFeature();
      case AmlPackage.PRODUCT_PUID_FEATURE: return createProductPUIDFeature();
      case AmlPackage.TARGET_GROUP_FEATURE: return createTargetGroupFeature();
      case AmlPackage.DRIVE: return createDrive();
      case AmlPackage.FORM_FEATURE: return createFormFeature();
      case AmlPackage.SPEED_FEATURE: return createSpeedFeature();
      case AmlPackage.SIZE_FEATURE: return createSizeFeature();
      case AmlPackage.TYPE_FEATURE: return createTypeFeature();
      case AmlPackage.CABLE: return createCable();
      case AmlPackage.PRICE_RULE: return createPriceRule();
      case AmlPackage.ENTITY: return createEntity();
      case AmlPackage.FEATURE: return createFeature();
      case AmlPackage.LENGTH_FEATURE: return createLengthFeature();
      case AmlPackage.NET_WORK_FEATURE: return createNetWorkFeature();
      case AmlPackage.COLOR_FEATURE: return createColorFeature();
      case AmlPackage.SUPER_ENTITY: return createSuperEntity();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AmlPackage.COLOR:
        return createColorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AmlPackage.COLOR:
        return convertColorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aml createAml()
  {
    AmlImpl aml = new AmlImpl();
    return aml;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElements createAbstractElements()
  {
    AbstractElementsImpl abstractElements = new AbstractElementsImpl();
    return abstractElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinMax createMinMax()
  {
    MinMaxImpl minMax = new MinMaxImpl();
    return minMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxFeature createMaxFeature()
  {
    MaxFeatureImpl maxFeature = new MaxFeatureImpl();
    return maxFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductPUIDFeature createProductPUIDFeature()
  {
    ProductPUIDFeatureImpl productPUIDFeature = new ProductPUIDFeatureImpl();
    return productPUIDFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetGroupFeature createTargetGroupFeature()
  {
    TargetGroupFeatureImpl targetGroupFeature = new TargetGroupFeatureImpl();
    return targetGroupFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Drive createDrive()
  {
    DriveImpl drive = new DriveImpl();
    return drive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormFeature createFormFeature()
  {
    FormFeatureImpl formFeature = new FormFeatureImpl();
    return formFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpeedFeature createSpeedFeature()
  {
    SpeedFeatureImpl speedFeature = new SpeedFeatureImpl();
    return speedFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeFeature createSizeFeature()
  {
    SizeFeatureImpl sizeFeature = new SizeFeatureImpl();
    return sizeFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeFeature createTypeFeature()
  {
    TypeFeatureImpl typeFeature = new TypeFeatureImpl();
    return typeFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cable createCable()
  {
    CableImpl cable = new CableImpl();
    return cable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PriceRule createPriceRule()
  {
    PriceRuleImpl priceRule = new PriceRuleImpl();
    return priceRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LengthFeature createLengthFeature()
  {
    LengthFeatureImpl lengthFeature = new LengthFeatureImpl();
    return lengthFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetWorkFeature createNetWorkFeature()
  {
    NetWorkFeatureImpl netWorkFeature = new NetWorkFeatureImpl();
    return netWorkFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorFeature createColorFeature()
  {
    ColorFeatureImpl colorFeature = new ColorFeatureImpl();
    return colorFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperEntity createSuperEntity()
  {
    SuperEntityImpl superEntity = new SuperEntityImpl();
    return superEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColorFromString(EDataType eDataType, String initialValue)
  {
    Color result = Color.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AmlPackage getAmlPackage()
  {
    return (AmlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AmlPackage getPackage()
  {
    return AmlPackage.eINSTANCE;
  }

} //AmlFactoryImpl
