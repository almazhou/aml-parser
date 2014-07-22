/**
 */
package org.zhouxuan.example.myaml.aml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.zhouxuan.example.myaml.aml.AmlPackage;
import org.zhouxuan.example.myaml.aml.MaxFeature;
import org.zhouxuan.example.myaml.aml.MinMax;
import org.zhouxuan.example.myaml.aml.ProductPUIDFeature;
import org.zhouxuan.example.myaml.aml.TargetGroupFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min Max</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.zhouxuan.example.myaml.aml.impl.MinMaxImpl#getTargetGroupFeature <em>Target Group Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.impl.MinMaxImpl#getProductPuidsFeature <em>Product Puids Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.impl.MinMaxImpl#getMaxFeature <em>Max Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MinMaxImpl extends AbstractElementsImpl implements MinMax
{
  /**
   * The cached value of the '{@link #getTargetGroupFeature() <em>Target Group Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetGroupFeature()
   * @generated
   * @ordered
   */
  protected TargetGroupFeature targetGroupFeature;

  /**
   * The cached value of the '{@link #getProductPuidsFeature() <em>Product Puids Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductPuidsFeature()
   * @generated
   * @ordered
   */
  protected ProductPUIDFeature productPuidsFeature;

  /**
   * The cached value of the '{@link #getMaxFeature() <em>Max Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxFeature()
   * @generated
   * @ordered
   */
  protected MaxFeature maxFeature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MinMaxImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AmlPackage.Literals.MIN_MAX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetGroupFeature getTargetGroupFeature()
  {
    return targetGroupFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetGroupFeature(TargetGroupFeature newTargetGroupFeature, NotificationChain msgs)
  {
    TargetGroupFeature oldTargetGroupFeature = targetGroupFeature;
    targetGroupFeature = newTargetGroupFeature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.MIN_MAX__TARGET_GROUP_FEATURE, oldTargetGroupFeature, newTargetGroupFeature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetGroupFeature(TargetGroupFeature newTargetGroupFeature)
  {
    if (newTargetGroupFeature != targetGroupFeature)
    {
      NotificationChain msgs = null;
      if (targetGroupFeature != null)
        msgs = ((InternalEObject)targetGroupFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.MIN_MAX__TARGET_GROUP_FEATURE, null, msgs);
      if (newTargetGroupFeature != null)
        msgs = ((InternalEObject)newTargetGroupFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.MIN_MAX__TARGET_GROUP_FEATURE, null, msgs);
      msgs = basicSetTargetGroupFeature(newTargetGroupFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.MIN_MAX__TARGET_GROUP_FEATURE, newTargetGroupFeature, newTargetGroupFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductPUIDFeature getProductPuidsFeature()
  {
    return productPuidsFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProductPuidsFeature(ProductPUIDFeature newProductPuidsFeature, NotificationChain msgs)
  {
    ProductPUIDFeature oldProductPuidsFeature = productPuidsFeature;
    productPuidsFeature = newProductPuidsFeature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.MIN_MAX__PRODUCT_PUIDS_FEATURE, oldProductPuidsFeature, newProductPuidsFeature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProductPuidsFeature(ProductPUIDFeature newProductPuidsFeature)
  {
    if (newProductPuidsFeature != productPuidsFeature)
    {
      NotificationChain msgs = null;
      if (productPuidsFeature != null)
        msgs = ((InternalEObject)productPuidsFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.MIN_MAX__PRODUCT_PUIDS_FEATURE, null, msgs);
      if (newProductPuidsFeature != null)
        msgs = ((InternalEObject)newProductPuidsFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.MIN_MAX__PRODUCT_PUIDS_FEATURE, null, msgs);
      msgs = basicSetProductPuidsFeature(newProductPuidsFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.MIN_MAX__PRODUCT_PUIDS_FEATURE, newProductPuidsFeature, newProductPuidsFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxFeature getMaxFeature()
  {
    return maxFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaxFeature(MaxFeature newMaxFeature, NotificationChain msgs)
  {
    MaxFeature oldMaxFeature = maxFeature;
    maxFeature = newMaxFeature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.MIN_MAX__MAX_FEATURE, oldMaxFeature, newMaxFeature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxFeature(MaxFeature newMaxFeature)
  {
    if (newMaxFeature != maxFeature)
    {
      NotificationChain msgs = null;
      if (maxFeature != null)
        msgs = ((InternalEObject)maxFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.MIN_MAX__MAX_FEATURE, null, msgs);
      if (newMaxFeature != null)
        msgs = ((InternalEObject)newMaxFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.MIN_MAX__MAX_FEATURE, null, msgs);
      msgs = basicSetMaxFeature(newMaxFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.MIN_MAX__MAX_FEATURE, newMaxFeature, newMaxFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AmlPackage.MIN_MAX__TARGET_GROUP_FEATURE:
        return basicSetTargetGroupFeature(null, msgs);
      case AmlPackage.MIN_MAX__PRODUCT_PUIDS_FEATURE:
        return basicSetProductPuidsFeature(null, msgs);
      case AmlPackage.MIN_MAX__MAX_FEATURE:
        return basicSetMaxFeature(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AmlPackage.MIN_MAX__TARGET_GROUP_FEATURE:
        return getTargetGroupFeature();
      case AmlPackage.MIN_MAX__PRODUCT_PUIDS_FEATURE:
        return getProductPuidsFeature();
      case AmlPackage.MIN_MAX__MAX_FEATURE:
        return getMaxFeature();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AmlPackage.MIN_MAX__TARGET_GROUP_FEATURE:
        setTargetGroupFeature((TargetGroupFeature)newValue);
        return;
      case AmlPackage.MIN_MAX__PRODUCT_PUIDS_FEATURE:
        setProductPuidsFeature((ProductPUIDFeature)newValue);
        return;
      case AmlPackage.MIN_MAX__MAX_FEATURE:
        setMaxFeature((MaxFeature)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AmlPackage.MIN_MAX__TARGET_GROUP_FEATURE:
        setTargetGroupFeature((TargetGroupFeature)null);
        return;
      case AmlPackage.MIN_MAX__PRODUCT_PUIDS_FEATURE:
        setProductPuidsFeature((ProductPUIDFeature)null);
        return;
      case AmlPackage.MIN_MAX__MAX_FEATURE:
        setMaxFeature((MaxFeature)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AmlPackage.MIN_MAX__TARGET_GROUP_FEATURE:
        return targetGroupFeature != null;
      case AmlPackage.MIN_MAX__PRODUCT_PUIDS_FEATURE:
        return productPuidsFeature != null;
      case AmlPackage.MIN_MAX__MAX_FEATURE:
        return maxFeature != null;
    }
    return super.eIsSet(featureID);
  }

} //MinMaxImpl
