/**
 */
package org.zhouxuan.example.myaml.aml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Super Names</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.zhouxuan.example.myaml.aml.AmlPackage#getSuperNames()
 * @model
 * @generated
 */
public enum SuperNames implements Enumerator
{
  /**
   * The '<em><b>Cable</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CABLE_VALUE
   * @generated
   * @ordered
   */
  CABLE(0, "Cable", "Cable"),

  /**
   * The '<em><b>Driver</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DRIVER_VALUE
   * @generated
   * @ordered
   */
  DRIVER(1, "Driver", "Driver"),

  /**
   * The '<em><b>Max Min</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAX_MIN_VALUE
   * @generated
   * @ordered
   */
  MAX_MIN(2, "MaxMin", "MaxMin");

  /**
   * The '<em><b>Cable</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cable</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CABLE
   * @model name="Cable"
   * @generated
   * @ordered
   */
  public static final int CABLE_VALUE = 0;

  /**
   * The '<em><b>Driver</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Driver</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DRIVER
   * @model name="Driver"
   * @generated
   * @ordered
   */
  public static final int DRIVER_VALUE = 1;

  /**
   * The '<em><b>Max Min</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Max Min</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAX_MIN
   * @model name="MaxMin"
   * @generated
   * @ordered
   */
  public static final int MAX_MIN_VALUE = 2;

  /**
   * An array of all the '<em><b>Super Names</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SuperNames[] VALUES_ARRAY =
    new SuperNames[]
    {
      CABLE,
      DRIVER,
      MAX_MIN,
    };

  /**
   * A public read-only list of all the '<em><b>Super Names</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SuperNames> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Super Names</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SuperNames get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SuperNames result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Super Names</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SuperNames getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SuperNames result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Super Names</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SuperNames get(int value)
  {
    switch (value)
    {
      case CABLE_VALUE: return CABLE;
      case DRIVER_VALUE: return DRIVER;
      case MAX_MIN_VALUE: return MAX_MIN;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private SuperNames(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //SuperNames
