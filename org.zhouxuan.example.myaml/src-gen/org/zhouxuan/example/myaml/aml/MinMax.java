/**
 */
package org.zhouxuan.example.myaml.aml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Max</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.zhouxuan.example.myaml.aml.MinMax#getTargetGroupFeature <em>Target Group Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.MinMax#getProductPuidsFeature <em>Product Puids Feature</em>}</li>
 *   <li>{@link org.zhouxuan.example.myaml.aml.MinMax#getMaxFeature <em>Max Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.zhouxuan.example.myaml.aml.AmlPackage#getMinMax()
 * @model
 * @generated
 */
public interface MinMax extends AbstractElements
{
  /**
   * Returns the value of the '<em><b>Target Group Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Group Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Group Feature</em>' containment reference.
   * @see #setTargetGroupFeature(TargetGroupFeature)
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getMinMax_TargetGroupFeature()
   * @model containment="true"
   * @generated
   */
  TargetGroupFeature getTargetGroupFeature();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.MinMax#getTargetGroupFeature <em>Target Group Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Group Feature</em>' containment reference.
   * @see #getTargetGroupFeature()
   * @generated
   */
  void setTargetGroupFeature(TargetGroupFeature value);

  /**
   * Returns the value of the '<em><b>Product Puids Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Product Puids Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product Puids Feature</em>' containment reference.
   * @see #setProductPuidsFeature(ProductPUIDFeature)
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getMinMax_ProductPuidsFeature()
   * @model containment="true"
   * @generated
   */
  ProductPUIDFeature getProductPuidsFeature();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.MinMax#getProductPuidsFeature <em>Product Puids Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Product Puids Feature</em>' containment reference.
   * @see #getProductPuidsFeature()
   * @generated
   */
  void setProductPuidsFeature(ProductPUIDFeature value);

  /**
   * Returns the value of the '<em><b>Max Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Feature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Feature</em>' containment reference.
   * @see #setMaxFeature(MaxFeature)
   * @see org.zhouxuan.example.myaml.aml.AmlPackage#getMinMax_MaxFeature()
   * @model containment="true"
   * @generated
   */
  MaxFeature getMaxFeature();

  /**
   * Sets the value of the '{@link org.zhouxuan.example.myaml.aml.MinMax#getMaxFeature <em>Max Feature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Feature</em>' containment reference.
   * @see #getMaxFeature()
   * @generated
   */
  void setMaxFeature(MaxFeature value);

} // MinMax
