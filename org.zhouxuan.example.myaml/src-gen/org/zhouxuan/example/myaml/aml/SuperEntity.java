/**
 */
package org.zhouxuan.example.myaml.aml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.zhouxuan.example.myaml.aml.SuperEntity#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.zhouxuan.example.myaml.aml.AmlPackage#getSuperEntity()
 * @model
 * @generated
 */
public interface SuperEntity extends AbstractElements
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The literals are from the enumeration {@link org.zhouxuan.example.myaml.aml.SuperNames}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see org.zhouxuan.example.myaml.aml.SuperNames
   * @see #setName(SuperNames)
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getSuperEntity_Name()
   * @model
   * @generated
   */
  SuperNames getName();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.SuperEntity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see org.zhouxuan.example.myaml.aml.SuperNames
   * @see #getName()
   * @generated
   */
  void setName(SuperNames value);

} // SuperEntity
