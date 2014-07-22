/**
 */
package org.zhouxuan.example.myaml.aml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.zhouxuan.example.myaml.aml.ColorFeature#getName <em>Name</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.ColorFeature#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.zhouxuan.example.myaml.aml.AmlPackage#getColorFeature()
 * @model
 * @generated
 */
public interface ColorFeature extends EObject
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
   * @see #setName(String)
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getColorFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.ColorFeature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.zhouxuan.example.myaml.aml.Color}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.zhouxuan.example.myaml.aml.Color
   * @see #setValue(Color)
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getColorFeature_Value()
   * @model
   * @generated
   */
  Color getValue();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.ColorFeature#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.zhouxuan.example.myaml.aml.Color
   * @see #getValue()
   * @generated
   */
  void setValue(Color value);

} // ColorFeature
