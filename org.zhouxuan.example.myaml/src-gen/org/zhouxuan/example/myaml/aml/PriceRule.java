/**
 */
package org.zhouxuan.example.myaml.aml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Price Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.zhouxuan.example.myaml.aml.PriceRule#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.PriceRule#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.zhouxuan.example.myaml.aml.AmlPackage#getPriceRule()
 * @model
 * @generated
 */
public interface PriceRule extends AbstractElements
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(MinMax)
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getPriceRule_SuperType()
   * @model
   * @generated
   */
  MinMax getSuperType();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.PriceRule#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(MinMax value);

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
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getPriceRule_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // PriceRule
