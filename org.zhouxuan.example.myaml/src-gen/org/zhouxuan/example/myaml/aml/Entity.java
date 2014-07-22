/**
 */
package org.zhouxuan.example.myaml.aml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.zhouxuan.example.myaml.aml.Entity#getName <em>Name</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.Entity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.Entity#getColorFeature <em>Color Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.Entity#getNetworkFeature <em>Network Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.Entity#getLengthFeature <em>Length Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.Entity#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.zhouxuan.example.myaml.aml.AmlPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(int)
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getEntity_Name()
   * @model
   * @generated
   */
  int getName();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(int value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Entity)
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getEntity_SuperType()
   * @model
   * @generated
   */
  Entity getSuperType();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.Entity#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Entity value);

  /**
   * Returns the value of the '<em><b>Color Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color Feature</em>' containment reference.
   * @see #setColorFeature(ColorFeature)
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getEntity_ColorFeature()
   * @model containment="true"
   * @generated
   */
  ColorFeature getColorFeature();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.Entity#getColorFeature <em>Color Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color Feature</em>' containment reference.
   * @see #getColorFeature()
   * @generated
   */
  void setColorFeature(ColorFeature value);

  /**
   * Returns the value of the '<em><b>Network Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Network Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Network Feature</em>' containment reference.
   * @see #setNetworkFeature(NetWorkFeature)
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getEntity_NetworkFeature()
   * @model containment="true"
   * @generated
   */
  NetWorkFeature getNetworkFeature();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.Entity#getNetworkFeature <em>Network Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Network Feature</em>' containment reference.
   * @see #getNetworkFeature()
   * @generated
   */
  void setNetworkFeature(NetWorkFeature value);

  /**
   * Returns the value of the '<em><b>Length Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length Feature</em>' containment reference.
   * @see #setLengthFeature(LengthFeature)
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getEntity_LengthFeature()
   * @model containment="true"
   * @generated
   */
  LengthFeature getLengthFeature();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.Entity#getLengthFeature <em>Length Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length Feature</em>' containment reference.
   * @see #getLengthFeature()
   * @generated
   */
  void setLengthFeature(LengthFeature value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.zhouxuan.example.myaml.aml.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getEntity_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // Entity
