/**
 */
package org.zhouxuan.example.myaml.aml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.zhouxuan.example.myaml.aml.AmlPackage;
import org.zhouxuan.example.myaml.aml.ColorFeature;
import org.zhouxuan.example.myaml.aml.Entity;
import org.zhouxuan.example.myaml.aml.Feature;
import org.zhouxuan.example.myaml.aml.LengthFeature;
import org.zhouxuan.example.myaml.aml.NetWorkFeature;
import org.zhouxuan.example.myaml.aml.SuperEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.zhouxuan.example.myaml.aml.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.impl.EntityImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.impl.EntityImpl#getColorFeature <em>Color Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.impl.EntityImpl#getNetworkFeature <em>Network Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.impl.EntityImpl#getLengthFeature <em>Length Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.impl.EntityImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends AbstractElementsImpl implements Entity
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected SuperEntity superType;

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
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<Feature> features;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
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
    return AmlPackage.Literals.ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperEntity getSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperType(SuperEntity newSuperType, NotificationChain msgs)
  {
    SuperEntity oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.ENTITY__SUPER_TYPE, oldSuperType, newSuperType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(SuperEntity newSuperType)
  {
    if (newSuperType != superType)
    {
      NotificationChain msgs = null;
      if (superType != null)
        msgs = ((InternalEObject)superType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.ENTITY__SUPER_TYPE, null, msgs);
      if (newSuperType != null)
        msgs = ((InternalEObject)newSuperType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.ENTITY__SUPER_TYPE, null, msgs);
      msgs = basicSetSuperType(newSuperType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.ENTITY__SUPER_TYPE, newSuperType, newSuperType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.ENTITY__COLOR_FEATURE, oldColorFeature, newColorFeature);
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
        msgs = ((InternalEObject)colorFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.ENTITY__COLOR_FEATURE, null, msgs);
      if (newColorFeature != null)
        msgs = ((InternalEObject)newColorFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.ENTITY__COLOR_FEATURE, null, msgs);
      msgs = basicSetColorFeature(newColorFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.ENTITY__COLOR_FEATURE, newColorFeature, newColorFeature));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.ENTITY__NETWORK_FEATURE, oldNetworkFeature, newNetworkFeature);
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
        msgs = ((InternalEObject)networkFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.ENTITY__NETWORK_FEATURE, null, msgs);
      if (newNetworkFeature != null)
        msgs = ((InternalEObject)newNetworkFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.ENTITY__NETWORK_FEATURE, null, msgs);
      msgs = basicSetNetworkFeature(newNetworkFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.ENTITY__NETWORK_FEATURE, newNetworkFeature, newNetworkFeature));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.ENTITY__LENGTH_FEATURE, oldLengthFeature, newLengthFeature);
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
        msgs = ((InternalEObject)lengthFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.ENTITY__LENGTH_FEATURE, null, msgs);
      if (newLengthFeature != null)
        msgs = ((InternalEObject)newLengthFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.ENTITY__LENGTH_FEATURE, null, msgs);
      msgs = basicSetLengthFeature(newLengthFeature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.ENTITY__LENGTH_FEATURE, newLengthFeature, newLengthFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getFeatures()
  {
    if (features == null)
    {
      features = new EObjectContainmentEList<Feature>(Feature.class, this, AmlPackage.ENTITY__FEATURES);
    }
    return features;
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
      case AmlPackage.ENTITY__SUPER_TYPE:
        return basicSetSuperType(null, msgs);
      case AmlPackage.ENTITY__COLOR_FEATURE:
        return basicSetColorFeature(null, msgs);
      case AmlPackage.ENTITY__NETWORK_FEATURE:
        return basicSetNetworkFeature(null, msgs);
      case AmlPackage.ENTITY__LENGTH_FEATURE:
        return basicSetLengthFeature(null, msgs);
      case AmlPackage.ENTITY__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
      case AmlPackage.ENTITY__NAME:
        return getName();
      case AmlPackage.ENTITY__SUPER_TYPE:
        return getSuperType();
      case AmlPackage.ENTITY__COLOR_FEATURE:
        return getColorFeature();
      case AmlPackage.ENTITY__NETWORK_FEATURE:
        return getNetworkFeature();
      case AmlPackage.ENTITY__LENGTH_FEATURE:
        return getLengthFeature();
      case AmlPackage.ENTITY__FEATURES:
        return getFeatures();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AmlPackage.ENTITY__NAME:
        setName((String)newValue);
        return;
      case AmlPackage.ENTITY__SUPER_TYPE:
        setSuperType((SuperEntity)newValue);
        return;
      case AmlPackage.ENTITY__COLOR_FEATURE:
        setColorFeature((ColorFeature)newValue);
        return;
      case AmlPackage.ENTITY__NETWORK_FEATURE:
        setNetworkFeature((NetWorkFeature)newValue);
        return;
      case AmlPackage.ENTITY__LENGTH_FEATURE:
        setLengthFeature((LengthFeature)newValue);
        return;
      case AmlPackage.ENTITY__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends Feature>)newValue);
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
      case AmlPackage.ENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AmlPackage.ENTITY__SUPER_TYPE:
        setSuperType((SuperEntity)null);
        return;
      case AmlPackage.ENTITY__COLOR_FEATURE:
        setColorFeature((ColorFeature)null);
        return;
      case AmlPackage.ENTITY__NETWORK_FEATURE:
        setNetworkFeature((NetWorkFeature)null);
        return;
      case AmlPackage.ENTITY__LENGTH_FEATURE:
        setLengthFeature((LengthFeature)null);
        return;
      case AmlPackage.ENTITY__FEATURES:
        getFeatures().clear();
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
      case AmlPackage.ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AmlPackage.ENTITY__SUPER_TYPE:
        return superType != null;
      case AmlPackage.ENTITY__COLOR_FEATURE:
        return colorFeature != null;
      case AmlPackage.ENTITY__NETWORK_FEATURE:
        return networkFeature != null;
      case AmlPackage.ENTITY__LENGTH_FEATURE:
        return lengthFeature != null;
      case AmlPackage.ENTITY__FEATURES:
        return features != null && !features.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EntityImpl
