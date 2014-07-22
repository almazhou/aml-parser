/**
 */
package org.zhouxuan.example.myaml.aml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.zhouxuan.example.myaml.aml.AmlPackage;
import org.zhouxuan.example.myaml.aml.Drive;
import org.zhouxuan.example.myaml.aml.FormFeature;
import org.zhouxuan.example.myaml.aml.SizeFeature;
import org.zhouxuan.example.myaml.aml.SpeedFeature;
import org.zhouxuan.example.myaml.aml.TypeFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.zhouxuan.example.myaml.aml.impl.DriveImpl#getTypeFeature <em>Type Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.impl.DriveImpl#getSizeFeature <em>Size Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.impl.DriveImpl#getSpeedFeature <em>Speed Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.impl.DriveImpl#getFormFeature <em>Form Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DriveImpl extends SuperEntityImpl implements Drive
{
  /**
   * The cached value of the '{@link #getTypeFeature() <em>Type Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeFeature()
   * @generated
   * @ordered
   */
  protected TypeFeature typeFeature;

  /**
   * The cached value of the '{@link #getSizeFeature() <em>Size Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSizeFeature()
   * @generated
   * @ordered
   */
  protected SizeFeature sizeFeature;

  /**
   * The cached value of the '{@link #getSpeedFeature() <em>Speed Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpeedFeature()
   * @generated
   * @ordered
   */
  protected SpeedFeature speedFeature;

  /**
   * The cached value of the '{@link #getFormFeature() <em>Form Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormFeature()
   * @generated
   * @ordered
   */
  protected FormFeature formFeature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DriveImpl()
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
    return AmlPackage.Literals.DRIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeFeature getTypeFeature()
  {
    return typeFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeFeature(TypeFeature newTypeFeature, NotificationChain msgs)
  {
    TypeFeature oldTypeFeature = typeFeature;
    typeFeature = newTypeFeature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.DRIVE__TYPE_FEATURE, oldTypeFeature, newTypeFeature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeFeature(TypeFeature newTypeFeature)
  {
    if (newTypeFeature != typeFeature)
    {
      NotificationChain msgs = null;
      if (typeFeature != null)
        msgs = ((InternalEObject)typeFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.DRIVE__TYPE_FEATURE, null, msgs);
      if (newTypeFeature != null)
        msgs = ((InternalEObject)newTypeFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.DRIVE__TYPE_FEATURE, null, msgs);
      msgs = basicSetTypeFeature(newTypeFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.DRIVE__TYPE_FEATURE, newTypeFeature, newTypeFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeFeature getSizeFeature()
  {
    return sizeFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSizeFeature(SizeFeature newSizeFeature, NotificationChain msgs)
  {
    SizeFeature oldSizeFeature = sizeFeature;
    sizeFeature = newSizeFeature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.DRIVE__SIZE_FEATURE, oldSizeFeature, newSizeFeature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSizeFeature(SizeFeature newSizeFeature)
  {
    if (newSizeFeature != sizeFeature)
    {
      NotificationChain msgs = null;
      if (sizeFeature != null)
        msgs = ((InternalEObject)sizeFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.DRIVE__SIZE_FEATURE, null, msgs);
      if (newSizeFeature != null)
        msgs = ((InternalEObject)newSizeFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.DRIVE__SIZE_FEATURE, null, msgs);
      msgs = basicSetSizeFeature(newSizeFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.DRIVE__SIZE_FEATURE, newSizeFeature, newSizeFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpeedFeature getSpeedFeature()
  {
    return speedFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpeedFeature(SpeedFeature newSpeedFeature, NotificationChain msgs)
  {
    SpeedFeature oldSpeedFeature = speedFeature;
    speedFeature = newSpeedFeature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.DRIVE__SPEED_FEATURE, oldSpeedFeature, newSpeedFeature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpeedFeature(SpeedFeature newSpeedFeature)
  {
    if (newSpeedFeature != speedFeature)
    {
      NotificationChain msgs = null;
      if (speedFeature != null)
        msgs = ((InternalEObject)speedFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.DRIVE__SPEED_FEATURE, null, msgs);
      if (newSpeedFeature != null)
        msgs = ((InternalEObject)newSpeedFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.DRIVE__SPEED_FEATURE, null, msgs);
      msgs = basicSetSpeedFeature(newSpeedFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.DRIVE__SPEED_FEATURE, newSpeedFeature, newSpeedFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormFeature getFormFeature()
  {
    return formFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormFeature(FormFeature newFormFeature, NotificationChain msgs)
  {
    FormFeature oldFormFeature = formFeature;
    formFeature = newFormFeature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.DRIVE__FORM_FEATURE, oldFormFeature, newFormFeature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormFeature(FormFeature newFormFeature)
  {
    if (newFormFeature != formFeature)
    {
      NotificationChain msgs = null;
      if (formFeature != null)
        msgs = ((InternalEObject)formFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.DRIVE__FORM_FEATURE, null, msgs);
      if (newFormFeature != null)
        msgs = ((InternalEObject)newFormFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.DRIVE__FORM_FEATURE, null, msgs);
      msgs = basicSetFormFeature(newFormFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.DRIVE__FORM_FEATURE, newFormFeature, newFormFeature));
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
      case AmlPackage.DRIVE__TYPE_FEATURE:
        return basicSetTypeFeature(null, msgs);
      case AmlPackage.DRIVE__SIZE_FEATURE:
        return basicSetSizeFeature(null, msgs);
      case AmlPackage.DRIVE__SPEED_FEATURE:
        return basicSetSpeedFeature(null, msgs);
      case AmlPackage.DRIVE__FORM_FEATURE:
        return basicSetFormFeature(null, msgs);
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
      case AmlPackage.DRIVE__TYPE_FEATURE:
        return getTypeFeature();
      case AmlPackage.DRIVE__SIZE_FEATURE:
        return getSizeFeature();
      case AmlPackage.DRIVE__SPEED_FEATURE:
        return getSpeedFeature();
      case AmlPackage.DRIVE__FORM_FEATURE:
        return getFormFeature();
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
      case AmlPackage.DRIVE__TYPE_FEATURE:
        setTypeFeature((TypeFeature)newValue);
        return;
      case AmlPackage.DRIVE__SIZE_FEATURE:
        setSizeFeature((SizeFeature)newValue);
        return;
      case AmlPackage.DRIVE__SPEED_FEATURE:
        setSpeedFeature((SpeedFeature)newValue);
        return;
      case AmlPackage.DRIVE__FORM_FEATURE:
        setFormFeature((FormFeature)newValue);
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
      case AmlPackage.DRIVE__TYPE_FEATURE:
        setTypeFeature((TypeFeature)null);
        return;
      case AmlPackage.DRIVE__SIZE_FEATURE:
        setSizeFeature((SizeFeature)null);
        return;
      case AmlPackage.DRIVE__SPEED_FEATURE:
        setSpeedFeature((SpeedFeature)null);
        return;
      case AmlPackage.DRIVE__FORM_FEATURE:
        setFormFeature((FormFeature)null);
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
      case AmlPackage.DRIVE__TYPE_FEATURE:
        return typeFeature != null;
      case AmlPackage.DRIVE__SIZE_FEATURE:
        return sizeFeature != null;
      case AmlPackage.DRIVE__SPEED_FEATURE:
        return speedFeature != null;
      case AmlPackage.DRIVE__FORM_FEATURE:
        return formFeature != null;
    }
    return super.eIsSet(featureID);
  }

} //DriveImpl
