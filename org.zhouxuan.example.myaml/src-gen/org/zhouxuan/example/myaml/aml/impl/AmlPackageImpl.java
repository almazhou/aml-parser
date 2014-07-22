/**
 */
package org.zhouxuan.example.myaml.aml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.zhouxuan.example.myaml.aml.AbstractElements;
import org.zhouxuan.example.myaml.aml.Aml;
import org.zhouxuan.example.myaml.aml.AmlFactory;
import org.zhouxuan.example.myaml.aml.AmlPackage;
import org.zhouxuan.example.myaml.aml.Cable;
import org.zhouxuan.example.myaml.aml.Color;
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
import org.zhouxuan.example.myaml.aml.SuperEntity;
import org.zhouxuan.example.myaml.aml.TargetGroupFeature;
import org.zhouxuan.example.myaml.aml.TypeFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmlPackageImpl extends EPackageImpl implements AmlPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass amlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minMaxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maxFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productPUIDFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass targetGroupFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass driveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass speedFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizeFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass priceRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lengthFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass netWorkFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass superEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum colorEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AmlPackageImpl()
  {
    super(eNS_URI, AmlFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AmlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AmlPackage init()
  {
    if (isInited) return (AmlPackage)EPackage.Registry.INSTANCE.getEPackage(AmlPackage.eNS_URI);

    // Obtain or create and register package
    AmlPackageImpl theAmlPackage = (AmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AmlPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theAmlPackage.createPackageContents();

    // Initialize created meta-data
    theAmlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAmlPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AmlPackage.eNS_URI, theAmlPackage);
    return theAmlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAml()
  {
    return amlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAml_Elements()
  {
    return (EReference)amlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractElements()
  {
    return abstractElementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractElements_Name()
  {
    return (EAttribute)abstractElementsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinMax()
  {
    return minMaxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMinMax_TargetGroupFeature()
  {
    return (EReference)minMaxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMinMax_ProductPuidsFeature()
  {
    return (EReference)minMaxEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMinMax_MaxFeature()
  {
    return (EReference)minMaxEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaxFeature()
  {
    return maxFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMaxFeature_Name()
  {
    return (EAttribute)maxFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMaxFeature_Value()
  {
    return (EAttribute)maxFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProductPUIDFeature()
  {
    return productPUIDFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProductPUIDFeature_Name()
  {
    return (EAttribute)productPUIDFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProductPUIDFeature_Values()
  {
    return (EAttribute)productPUIDFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTargetGroupFeature()
  {
    return targetGroupFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTargetGroupFeature_Name()
  {
    return (EAttribute)targetGroupFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTargetGroupFeature_Value()
  {
    return (EAttribute)targetGroupFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDrive()
  {
    return driveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDrive_TypeFeature()
  {
    return (EReference)driveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDrive_SizeFeature()
  {
    return (EReference)driveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDrive_SpeedFeature()
  {
    return (EReference)driveEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDrive_FormFeature()
  {
    return (EReference)driveEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormFeature()
  {
    return formFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormFeature_Name()
  {
    return (EAttribute)formFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormFeature_Value()
  {
    return (EAttribute)formFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpeedFeature()
  {
    return speedFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpeedFeature_Name()
  {
    return (EAttribute)speedFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpeedFeature_Value()
  {
    return (EAttribute)speedFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSizeFeature()
  {
    return sizeFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSizeFeature_Name()
  {
    return (EAttribute)sizeFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSizeFeature_Value()
  {
    return (EAttribute)sizeFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeFeature()
  {
    return typeFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeFeature_Name()
  {
    return (EAttribute)typeFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeFeature_Value()
  {
    return (EAttribute)typeFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCable()
  {
    return cableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCable_ColorFeature()
  {
    return (EReference)cableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCable_NetworkFeature()
  {
    return (EReference)cableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCable_LengthFeature()
  {
    return (EReference)cableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPriceRule()
  {
    return priceRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPriceRule_SuperType()
  {
    return (EReference)priceRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPriceRule_Features()
  {
    return (EReference)priceRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_SuperType()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Features()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Name()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Value()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLengthFeature()
  {
    return lengthFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLengthFeature_Name()
  {
    return (EAttribute)lengthFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLengthFeature_Value()
  {
    return (EAttribute)lengthFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNetWorkFeature()
  {
    return netWorkFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetWorkFeature_Name()
  {
    return (EAttribute)netWorkFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetWorkFeature_Value()
  {
    return (EAttribute)netWorkFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorFeature()
  {
    return colorFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorFeature_Name()
  {
    return (EAttribute)colorFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorFeature_Value()
  {
    return (EAttribute)colorFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSuperEntity()
  {
    return superEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColor()
  {
    return colorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AmlFactory getAmlFactory()
  {
    return (AmlFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    amlEClass = createEClass(AML);
    createEReference(amlEClass, AML__ELEMENTS);

    abstractElementsEClass = createEClass(ABSTRACT_ELEMENTS);
    createEAttribute(abstractElementsEClass, ABSTRACT_ELEMENTS__NAME);

    minMaxEClass = createEClass(MIN_MAX);
    createEReference(minMaxEClass, MIN_MAX__TARGET_GROUP_FEATURE);
    createEReference(minMaxEClass, MIN_MAX__PRODUCT_PUIDS_FEATURE);
    createEReference(minMaxEClass, MIN_MAX__MAX_FEATURE);

    maxFeatureEClass = createEClass(MAX_FEATURE);
    createEAttribute(maxFeatureEClass, MAX_FEATURE__NAME);
    createEAttribute(maxFeatureEClass, MAX_FEATURE__VALUE);

    productPUIDFeatureEClass = createEClass(PRODUCT_PUID_FEATURE);
    createEAttribute(productPUIDFeatureEClass, PRODUCT_PUID_FEATURE__NAME);
    createEAttribute(productPUIDFeatureEClass, PRODUCT_PUID_FEATURE__VALUES);

    targetGroupFeatureEClass = createEClass(TARGET_GROUP_FEATURE);
    createEAttribute(targetGroupFeatureEClass, TARGET_GROUP_FEATURE__NAME);
    createEAttribute(targetGroupFeatureEClass, TARGET_GROUP_FEATURE__VALUE);

    driveEClass = createEClass(DRIVE);
    createEReference(driveEClass, DRIVE__TYPE_FEATURE);
    createEReference(driveEClass, DRIVE__SIZE_FEATURE);
    createEReference(driveEClass, DRIVE__SPEED_FEATURE);
    createEReference(driveEClass, DRIVE__FORM_FEATURE);

    formFeatureEClass = createEClass(FORM_FEATURE);
    createEAttribute(formFeatureEClass, FORM_FEATURE__NAME);
    createEAttribute(formFeatureEClass, FORM_FEATURE__VALUE);

    speedFeatureEClass = createEClass(SPEED_FEATURE);
    createEAttribute(speedFeatureEClass, SPEED_FEATURE__NAME);
    createEAttribute(speedFeatureEClass, SPEED_FEATURE__VALUE);

    sizeFeatureEClass = createEClass(SIZE_FEATURE);
    createEAttribute(sizeFeatureEClass, SIZE_FEATURE__NAME);
    createEAttribute(sizeFeatureEClass, SIZE_FEATURE__VALUE);

    typeFeatureEClass = createEClass(TYPE_FEATURE);
    createEAttribute(typeFeatureEClass, TYPE_FEATURE__NAME);
    createEAttribute(typeFeatureEClass, TYPE_FEATURE__VALUE);

    cableEClass = createEClass(CABLE);
    createEReference(cableEClass, CABLE__COLOR_FEATURE);
    createEReference(cableEClass, CABLE__NETWORK_FEATURE);
    createEReference(cableEClass, CABLE__LENGTH_FEATURE);

    priceRuleEClass = createEClass(PRICE_RULE);
    createEReference(priceRuleEClass, PRICE_RULE__SUPER_TYPE);
    createEReference(priceRuleEClass, PRICE_RULE__FEATURES);

    entityEClass = createEClass(ENTITY);
    createEReference(entityEClass, ENTITY__SUPER_TYPE);
    createEReference(entityEClass, ENTITY__FEATURES);

    featureEClass = createEClass(FEATURE);
    createEAttribute(featureEClass, FEATURE__NAME);
    createEAttribute(featureEClass, FEATURE__VALUE);

    lengthFeatureEClass = createEClass(LENGTH_FEATURE);
    createEAttribute(lengthFeatureEClass, LENGTH_FEATURE__NAME);
    createEAttribute(lengthFeatureEClass, LENGTH_FEATURE__VALUE);

    netWorkFeatureEClass = createEClass(NET_WORK_FEATURE);
    createEAttribute(netWorkFeatureEClass, NET_WORK_FEATURE__NAME);
    createEAttribute(netWorkFeatureEClass, NET_WORK_FEATURE__VALUE);

    colorFeatureEClass = createEClass(COLOR_FEATURE);
    createEAttribute(colorFeatureEClass, COLOR_FEATURE__NAME);
    createEAttribute(colorFeatureEClass, COLOR_FEATURE__VALUE);

    superEntityEClass = createEClass(SUPER_ENTITY);

    // Create enums
    colorEEnum = createEEnum(COLOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    minMaxEClass.getESuperTypes().add(this.getAbstractElements());
    driveEClass.getESuperTypes().add(this.getSuperEntity());
    cableEClass.getESuperTypes().add(this.getSuperEntity());
    priceRuleEClass.getESuperTypes().add(this.getAbstractElements());
    entityEClass.getESuperTypes().add(this.getAbstractElements());
    superEntityEClass.getESuperTypes().add(this.getAbstractElements());

    // Initialize classes and features; add operations and parameters
    initEClass(amlEClass, Aml.class, "Aml", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAml_Elements(), this.getAbstractElements(), null, "elements", null, 0, -1, Aml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractElementsEClass, AbstractElements.class, "AbstractElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractElements_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(minMaxEClass, MinMax.class, "MinMax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMinMax_TargetGroupFeature(), this.getTargetGroupFeature(), null, "targetGroupFeature", null, 0, 1, MinMax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMinMax_ProductPuidsFeature(), this.getProductPUIDFeature(), null, "productPuidsFeature", null, 0, 1, MinMax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMinMax_MaxFeature(), this.getMaxFeature(), null, "maxFeature", null, 0, 1, MinMax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(maxFeatureEClass, MaxFeature.class, "MaxFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMaxFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, MaxFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMaxFeature_Value(), ecorePackage.getEInt(), "value", null, 0, 1, MaxFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productPUIDFeatureEClass, ProductPUIDFeature.class, "ProductPUIDFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProductPUIDFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProductPUIDFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProductPUIDFeature_Values(), ecorePackage.getEInt(), "values", null, 0, -1, ProductPUIDFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(targetGroupFeatureEClass, TargetGroupFeature.class, "TargetGroupFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTargetGroupFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, TargetGroupFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTargetGroupFeature_Value(), ecorePackage.getEString(), "value", null, 0, 1, TargetGroupFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(driveEClass, Drive.class, "Drive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDrive_TypeFeature(), this.getTypeFeature(), null, "typeFeature", null, 0, 1, Drive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDrive_SizeFeature(), this.getSizeFeature(), null, "sizeFeature", null, 0, 1, Drive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDrive_SpeedFeature(), this.getSpeedFeature(), null, "speedFeature", null, 0, 1, Drive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDrive_FormFeature(), this.getFormFeature(), null, "formFeature", null, 0, 1, Drive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formFeatureEClass, FormFeature.class, "FormFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFormFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFormFeature_Value(), ecorePackage.getEInt(), "value", null, 0, 1, FormFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(speedFeatureEClass, SpeedFeature.class, "SpeedFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpeedFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, SpeedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSpeedFeature_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, SpeedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sizeFeatureEClass, SizeFeature.class, "SizeFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSizeFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, SizeFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSizeFeature_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SizeFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeFeatureEClass, TypeFeature.class, "TypeFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, TypeFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeFeature_Value(), ecorePackage.getEString(), "value", null, 0, 1, TypeFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cableEClass, Cable.class, "Cable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCable_ColorFeature(), this.getColorFeature(), null, "colorFeature", null, 0, 1, Cable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCable_NetworkFeature(), this.getNetWorkFeature(), null, "networkFeature", null, 0, 1, Cable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCable_LengthFeature(), this.getLengthFeature(), null, "lengthFeature", null, 0, 1, Cable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(priceRuleEClass, PriceRule.class, "PriceRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPriceRule_SuperType(), this.getMinMax(), null, "superType", null, 0, 1, PriceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPriceRule_Features(), this.getFeature(), null, "features", null, 0, -1, PriceRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntity_SuperType(), this.getSuperEntity(), null, "superType", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_Features(), this.getFeature(), null, "features", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_Value(), ecorePackage.getEString(), "value", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lengthFeatureEClass, LengthFeature.class, "LengthFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLengthFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, LengthFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLengthFeature_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, LengthFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(netWorkFeatureEClass, NetWorkFeature.class, "NetWorkFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNetWorkFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, NetWorkFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNetWorkFeature_Value(), ecorePackage.getEString(), "value", null, 0, 1, NetWorkFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorFeatureEClass, ColorFeature.class, "ColorFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColorFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, ColorFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColorFeature_Value(), this.getColor(), "value", null, 0, 1, ColorFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(superEntityEClass, SuperEntity.class, "SuperEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(colorEEnum, Color.class, "Color");
    addEEnumLiteral(colorEEnum, Color.RED);
    addEEnumLiteral(colorEEnum, Color.BLACK);
    addEEnumLiteral(colorEEnum, Color.WHITE);
    addEEnumLiteral(colorEEnum, Color.GREY);
    addEEnumLiteral(colorEEnum, Color.GREEN);

    // Create resource
    createResource(eNS_URI);
  }

} //AmlPackageImpl
