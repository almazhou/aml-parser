/**
 */
package org.zhouxuan.example.myaml.aml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.zhouxuan.example.myaml.aml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.zhouxuan.example.myaml.aml.AmlPackage
 * @generated
 */
public class AmlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AmlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AmlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AmlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AmlSwitch<Adapter> modelSwitch =
    new AmlSwitch<Adapter>()
    {
      @Override
      public Adapter caseAml(Aml object)
      {
        return createAmlAdapter();
      }
      @Override
      public Adapter caseAbstractElements(AbstractElements object)
      {
        return createAbstractElementsAdapter();
      }
      @Override
      public Adapter caseMinMax(MinMax object)
      {
        return createMinMaxAdapter();
      }
      @Override
      public Adapter caseMaxFeature(MaxFeature object)
      {
        return createMaxFeatureAdapter();
      }
      @Override
      public Adapter caseProductPUIDFeature(ProductPUIDFeature object)
      {
        return createProductPUIDFeatureAdapter();
      }
      @Override
      public Adapter caseTargetGroupFeature(TargetGroupFeature object)
      {
        return createTargetGroupFeatureAdapter();
      }
      @Override
      public Adapter caseDrive(Drive object)
      {
        return createDriveAdapter();
      }
      @Override
      public Adapter caseFormFeature(FormFeature object)
      {
        return createFormFeatureAdapter();
      }
      @Override
      public Adapter caseSpeedFeature(SpeedFeature object)
      {
        return createSpeedFeatureAdapter();
      }
      @Override
      public Adapter caseSizeFeature(SizeFeature object)
      {
        return createSizeFeatureAdapter();
      }
      @Override
      public Adapter caseTypeFeature(TypeFeature object)
      {
        return createTypeFeatureAdapter();
      }
      @Override
      public Adapter caseCable(Cable object)
      {
        return createCableAdapter();
      }
      @Override
      public Adapter casePriceRule(PriceRule object)
      {
        return createPriceRuleAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseLengthFeature(LengthFeature object)
      {
        return createLengthFeatureAdapter();
      }
      @Override
      public Adapter caseNetWorkFeature(NetWorkFeature object)
      {
        return createNetWorkFeatureAdapter();
      }
      @Override
      public Adapter caseColorFeature(ColorFeature object)
      {
        return createColorFeatureAdapter();
      }
      @Override
      public Adapter caseSuperEntity(SuperEntity object)
      {
        return createSuperEntityAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.Aml <em>Aml</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.Aml
   * @generated
   */
  public Adapter createAmlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.AbstractElements <em>Abstract Elements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.AbstractElements
   * @generated
   */
  public Adapter createAbstractElementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.MinMax <em>Min Max</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.MinMax
   * @generated
   */
  public Adapter createMinMaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.MaxFeature <em>Max Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.MaxFeature
   * @generated
   */
  public Adapter createMaxFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.ProductPUIDFeature <em>Product PUID Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.ProductPUIDFeature
   * @generated
   */
  public Adapter createProductPUIDFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.TargetGroupFeature <em>Target Group Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.TargetGroupFeature
   * @generated
   */
  public Adapter createTargetGroupFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.Drive <em>Drive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.Drive
   * @generated
   */
  public Adapter createDriveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.FormFeature <em>Form Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.FormFeature
   * @generated
   */
  public Adapter createFormFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.SpeedFeature <em>Speed Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.SpeedFeature
   * @generated
   */
  public Adapter createSpeedFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.SizeFeature <em>Size Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.SizeFeature
   * @generated
   */
  public Adapter createSizeFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.TypeFeature <em>Type Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.TypeFeature
   * @generated
   */
  public Adapter createTypeFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.Cable <em>Cable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.Cable
   * @generated
   */
  public Adapter createCableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.PriceRule <em>Price Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.PriceRule
   * @generated
   */
  public Adapter createPriceRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.LengthFeature <em>Length Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.LengthFeature
   * @generated
   */
  public Adapter createLengthFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.NetWorkFeature <em>Net Work Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.NetWorkFeature
   * @generated
   */
  public Adapter createNetWorkFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.ColorFeature <em>Color Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.ColorFeature
   * @generated
   */
  public Adapter createColorFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.zhouxuan.example.myaml.aml.SuperEntity <em>Super Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.zhouxuan.example.myaml.aml.SuperEntity
   * @generated
   */
  public Adapter createSuperEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AmlAdapterFactory
