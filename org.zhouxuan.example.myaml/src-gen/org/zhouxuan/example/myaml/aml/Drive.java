/**
 */
package org.zhouxuan.example.myaml.aml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.zhouxuan.example.myaml.aml.Drive#getTypeFeature <em>Type Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.Drive#getSizeFeature <em>Size Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.Drive#getSpeedFeature <em>Speed Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.Drive#getFormFeature <em>Form Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.zhouxuan.example.myaml.aml.AmlPackage#getDrive()
 * @model
 * @generated
 */
public interface Drive extends SuperEntity
{
  /**
   * Returns the value of the '<em><b>Type Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Feature</em>' containment reference.
   * @see #setTypeFeature(TypeFeature)
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getDrive_TypeFeature()
   * @model containment="true"
   * @generated
   */
  TypeFeature getTypeFeature();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.Drive#getTypeFeature <em>Type Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Feature</em>' containment reference.
   * @see #getTypeFeature()
   * @generated
   */
  void setTypeFeature(TypeFeature value);

  /**
   * Returns the value of the '<em><b>Size Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size Feature</em>' containment reference.
   * @see #setSizeFeature(SizeFeature)
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getDrive_SizeFeature()
   * @model containment="true"
   * @generated
   */
  SizeFeature getSizeFeature();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.Drive#getSizeFeature <em>Size Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size Feature</em>' containment reference.
   * @see #getSizeFeature()
   * @generated
   */
  void setSizeFeature(SizeFeature value);

  /**
   * Returns the value of the '<em><b>Speed Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Speed Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Speed Feature</em>' containment reference.
   * @see #setSpeedFeature(SpeedFeature)
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getDrive_SpeedFeature()
   * @model containment="true"
   * @generated
   */
  SpeedFeature getSpeedFeature();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.Drive#getSpeedFeature <em>Speed Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Speed Feature</em>' containment reference.
   * @see #getSpeedFeature()
   * @generated
   */
  void setSpeedFeature(SpeedFeature value);

  /**
   * Returns the value of the '<em><b>Form Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Form Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Form Feature</em>' containment reference.
   * @see #setFormFeature(FormFeature)
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getDrive_FormFeature()
   * @model containment="true"
   * @generated
   */
  FormFeature getFormFeature();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.Drive#getFormFeature <em>Form Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Form Feature</em>' containment reference.
   * @see #getFormFeature()
   * @generated
   */
  void setFormFeature(FormFeature value);

} // Drive
