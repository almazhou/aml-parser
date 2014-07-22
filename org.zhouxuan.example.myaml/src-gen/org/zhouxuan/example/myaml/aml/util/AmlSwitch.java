/**
 */
package org.zhouxuan.example.myaml.aml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.zhouxuan.example.myaml.aml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.zhouxuan.example.myaml.aml.AmlPackage
 * @generated
 */
public class AmlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AmlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AmlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AmlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AmlPackage.AML:
      {
        Aml aml = (Aml)theEObject;
        T result = caseAml(aml);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.ABSTRACT_ELEMENTS:
      {
        AbstractElements abstractElements = (AbstractElements)theEObject;
        T result = caseAbstractElements(abstractElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.MIN_MAX:
      {
        MinMax minMax = (MinMax)theEObject;
        T result = caseMinMax(minMax);
        if (result == null) result = caseAbstractElements(minMax);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.MAX_FEATURE:
      {
        MaxFeature maxFeature = (MaxFeature)theEObject;
        T result = caseMaxFeature(maxFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.PRODUCT_PUID_FEATURE:
      {
        ProductPUIDFeature productPUIDFeature = (ProductPUIDFeature)theEObject;
        T result = caseProductPUIDFeature(productPUIDFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.TARGET_GROUP_FEATURE:
      {
        TargetGroupFeature targetGroupFeature = (TargetGroupFeature)theEObject;
        T result = caseTargetGroupFeature(targetGroupFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.DRIVE:
      {
        Drive drive = (Drive)theEObject;
        T result = caseDrive(drive);
        if (result == null) result = caseSuperEntity(drive);
        if (result == null) result = caseAbstractElements(drive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.FORM_FEATURE:
      {
        FormFeature formFeature = (FormFeature)theEObject;
        T result = caseFormFeature(formFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.SPEED_FEATURE:
      {
        SpeedFeature speedFeature = (SpeedFeature)theEObject;
        T result = caseSpeedFeature(speedFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.SIZE_FEATURE:
      {
        SizeFeature sizeFeature = (SizeFeature)theEObject;
        T result = caseSizeFeature(sizeFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.TYPE_FEATURE:
      {
        TypeFeature typeFeature = (TypeFeature)theEObject;
        T result = caseTypeFeature(typeFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.CABLE:
      {
        Cable cable = (Cable)theEObject;
        T result = caseCable(cable);
        if (result == null) result = caseSuperEntity(cable);
        if (result == null) result = caseAbstractElements(cable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.PRICE_RULE:
      {
        PriceRule priceRule = (PriceRule)theEObject;
        T result = casePriceRule(priceRule);
        if (result == null) result = caseAbstractElements(priceRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = caseAbstractElements(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.FEATURE:
      {
        Feature feature = (Feature)theEObject;
        T result = caseFeature(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.LENGTH_FEATURE:
      {
        LengthFeature lengthFeature = (LengthFeature)theEObject;
        T result = caseLengthFeature(lengthFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.NET_WORK_FEATURE:
      {
        NetWorkFeature netWorkFeature = (NetWorkFeature)theEObject;
        T result = caseNetWorkFeature(netWorkFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.COLOR_FEATURE:
      {
        ColorFeature colorFeature = (ColorFeature)theEObject;
        T result = caseColorFeature(colorFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AmlPackage.SUPER_ENTITY:
      {
        SuperEntity superEntity = (SuperEntity)theEObject;
        T result = caseSuperEntity(superEntity);
        if (result == null) result = caseAbstractElements(superEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aml</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aml</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAml(Aml object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElements(AbstractElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Min Max</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Min Max</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinMax(MinMax object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Max Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Max Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaxFeature(MaxFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Product PUID Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Product PUID Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProductPUIDFeature(ProductPUIDFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target Group Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target Group Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTargetGroupFeature(TargetGroupFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDrive(Drive object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Form Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormFeature(FormFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Speed Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Speed Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpeedFeature(SpeedFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSizeFeature(SizeFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeFeature(TypeFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCable(Cable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Price Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Price Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePriceRule(PriceRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Length Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Length Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLengthFeature(LengthFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Net Work Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Net Work Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNetWorkFeature(NetWorkFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorFeature(ColorFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Super Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Super Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuperEntity(SuperEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AmlSwitch
