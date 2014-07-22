/**
 */
package org.zhouxuan.example.myaml.aml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net Work Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.zhouxuan.example.myaml.aml.NetWorkFeature#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.zhouxuan.example.myaml.aml.AmlPackage#getNetWorkFeature()
 * @model
 * @generated
 */
public interface NetWorkFeature extends Feature
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getNetWorkFeature_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.NetWorkFeature#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // NetWorkFeature
