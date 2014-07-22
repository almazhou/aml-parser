/**
 */
package org.zhouxuan.example.myaml.aml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.zhouxuan.example.myaml.aml.Cable#getColorFeature <em>Color Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.Cable#getNetworkFeature <em>Network Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.Cable#getLengthFeature <em>Length Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.zhouxuan.example.myaml.aml.AmlPackage#getCable()
 * @model
 * @generated
 */
public interface Cable extends SuperEntity
{
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
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getCable_ColorFeature()
   * @model containment="true"
   * @generated
   */
  ColorFeature getColorFeature();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.Cable#getColorFeature <em>Color Feature</em>}' containment reference.
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
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getCable_NetworkFeature()
   * @model containment="true"
   * @generated
   */
  NetWorkFeature getNetworkFeature();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.Cable#getNetworkFeature <em>Network Feature</em>}' containment reference.
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
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getCable_LengthFeature()
   * @model containment="true"
   * @generated
   */
  LengthFeature getLengthFeature();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.Cable#getLengthFeature <em>Length Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length Feature</em>' containment reference.
   * @see #getLengthFeature()
   * @generated
   */
  void setLengthFeature(LengthFeature value);

} // Cable
