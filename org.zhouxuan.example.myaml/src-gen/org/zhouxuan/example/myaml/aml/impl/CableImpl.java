/**
 */
package org.zhouxuan.example.myaml.aml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.zhouxuan.example.myaml.aml.AmlPackage;
import org.zhouxuan.example.myaml.aml.Cable;
import org.zhouxuan.example.myaml.aml.ColorFeature;
import org.zhouxuan.example.myaml.aml.LengthFeature;
import org.zhouxuan.example.myaml.aml.NetWorkFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.zhouxuan.example.myaml.aml.impl.CableImpl#getColorFeature <em>Color Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.impl.CableImpl#getNetworkFeature <em>Network Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.impl.CableImpl#getLengthFeature <em>Length Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CableImpl extends SuperEntityImpl implements Cable
{
  /**
   * The cached value of the '{@link #getColorFeature() <em>Color Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColorFeature()
   * @generated
   * @ordered
   */
  protected ColorFeature colorFeature;

  /**
   * The cached value of the '{@link #getNetworkFeature() <em>Network Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNetworkFeature()
   * @generated
   * @ordered
   */
  protected NetWorkFeature networkFeature;

  /**
   * The cached value of the '{@link #getLengthFeature() <em>Length Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLengthFeature()
   * @generated
   * @ordered
   */
  protected LengthFeature lengthFeature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CableImpl()
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
    return AmlPackage.Literals.CABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorFeature getColorFeature()
  {
    return colorFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColorFeature(ColorFeature newColorFeature, NotificationChain msgs)
  {
    ColorFeature oldColorFeature = colorFeature;
    colorFeature = newColorFeature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.CABLE__COLOR_FEATURE, oldColorFeature, newColorFeature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColorFeature(ColorFeature newColorFeature)
  {
    if (newColorFeature != colorFeature)
    {
      NotificationChain msgs = null;
      if (colorFeature != null)
        msgs = ((InternalEObject)colorFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.CABLE__COLOR_FEATURE, null, msgs);
      if (newColorFeature != null)
        msgs = ((InternalEObject)newColorFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.CABLE__COLOR_FEATURE, null, msgs);
      msgs = basicSetColorFeature(newColorFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.CABLE__COLOR_FEATURE, newColorFeature, newColorFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetWorkFeature getNetworkFeature()
  {
    return networkFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNetworkFeature(NetWorkFeature newNetworkFeature, NotificationChain msgs)
  {
    NetWorkFeature oldNetworkFeature = networkFeature;
    networkFeature = newNetworkFeature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.CABLE__NETWORK_FEATURE, oldNetworkFeature, newNetworkFeature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNetworkFeature(NetWorkFeature newNetworkFeature)
  {
    if (newNetworkFeature != networkFeature)
    {
      NotificationChain msgs = null;
      if (networkFeature != null)
        msgs = ((InternalEObject)networkFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.CABLE__NETWORK_FEATURE, null, msgs);
      if (newNetworkFeature != null)
        msgs = ((InternalEObject)newNetworkFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.CABLE__NETWORK_FEATURE, null, msgs);
      msgs = basicSetNetworkFeature(newNetworkFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.CABLE__NETWORK_FEATURE, newNetworkFeature, newNetworkFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LengthFeature getLengthFeature()
  {
    return lengthFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLengthFeature(LengthFeature newLengthFeature, NotificationChain msgs)
  {
    LengthFeature oldLengthFeature = lengthFeature;
    lengthFeature = newLengthFeature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.CABLE__LENGTH_FEATURE, oldLengthFeature, newLengthFeature);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLengthFeature(LengthFeature newLengthFeature)
  {
    if (newLengthFeature != lengthFeature)
    {
      NotificationChain msgs = null;
      if (lengthFeature != null)
        msgs = ((InternalEObject)lengthFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.CABLE__LENGTH_FEATURE, null, msgs);
      if (newLengthFeature != null)
        msgs = ((InternalEObject)newLengthFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.CABLE__LENGTH_FEATURE, null, msgs);
      msgs = basicSetLengthFeature(newLengthFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.CABLE__LENGTH_FEATURE, newLengthFeature, newLengthFeature));
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
      case AmlPackage.CABLE__COLOR_FEATURE:
        return basicSetColorFeature(null, msgs);
      case AmlPackage.CABLE__NETWORK_FEATURE:
        return basicSetNetworkFeature(null, msgs);
      case AmlPackage.CABLE__LENGTH_FEATURE:
        return basicSetLengthFeature(null, msgs);
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
      case AmlPackage.CABLE__COLOR_FEATURE:
        return getColorFeature();
      case AmlPackage.CABLE__NETWORK_FEATURE:
        return getNetworkFeature();
      case AmlPackage.CABLE__LENGTH_FEATURE:
        return getLengthFeature();
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
      case AmlPackage.CABLE__COLOR_FEATURE:
        setColorFeature((ColorFeature)newValue);
        return;
      case AmlPackage.CABLE__NETWORK_FEATURE:
        setNetworkFeature((NetWorkFeature)newValue);
        return;
      case AmlPackage.CABLE__LENGTH_FEATURE:
        setLengthFeature((LengthFeature)newValue);
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
      case AmlPackage.CABLE__COLOR_FEATURE:
        setColorFeature((ColorFeature)null);
        return;
      case AmlPackage.CABLE__NETWORK_FEATURE:
        setNetworkFeature((NetWorkFeature)null);
        return;
      case AmlPackage.CABLE__LENGTH_FEATURE:
        setLengthFeature((LengthFeature)null);
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
      case AmlPackage.CABLE__COLOR_FEATURE:
        return colorFeature != null;
      case AmlPackage.CABLE__NETWORK_FEATURE:
        return networkFeature != null;
      case AmlPackage.CABLE__LENGTH_FEATURE:
        return lengthFeature != null;
    }
    return super.eIsSet(featureID);
  }

} //CableImpl
