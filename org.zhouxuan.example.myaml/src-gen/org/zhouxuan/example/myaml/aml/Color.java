/**
 */
package org.zhouxuan.example.myaml.aml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.zhouxuan.example.myaml.aml.AmlPackage#getColor()
 * @model
 * @generated
 */
public enum Color implements Enumerator
{
  /**
   * The '<em><b>Red</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RED_VALUE
   * @generated
   * @ordered
   */
  RED(0, "Red", "Red"),

  /**
   * The '<em><b>Black</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BLACK_VALUE
   * @generated
   * @ordered
   */
  BLACK(1, "Black", "Black"),

  /**
   * The '<em><b>White</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WHITE_VALUE
   * @generated
   * @ordered
   */
  WHITE(2, "White", "White"),

  /**
   * The '<em><b>Grey</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREY_VALUE
   * @generated
   * @ordered
   */
  GREY(3, "Grey", "Grey"),

  /**
   * The '<em><b>Green</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GREEN_VALUE
   * @generated
   * @ordered
   */
  GREEN(4, "Green", "Green");

  /**
   * The '<em><b>Red</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Red</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RED
   * @model name="Red"
   * @generated
   * @ordered
   */
  public static final int RED_VALUE = 0;

  /**
   * The '<em><b>Black</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Black</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BLACK
   * @model name="Black"
   * @generated
   * @ordered
   */
  public static final int BLACK_VALUE = 1;

  /**
   * The '<em><b>White</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>White</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WHITE
   * @model name="White"
   * @generated
   * @ordered
   */
  public static final int WHITE_VALUE = 2;

  /**
   * The '<em><b>Grey</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Grey</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GREY
   * @model name="Grey"
   * @generated
   * @ordered
   */
  public static final int GREY_VALUE = 3;

  /**
   * The '<em><b>Green</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Green</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GREEN
   * @model name="Green"
   * @generated
   * @ordered
   */
  public static final int GREEN_VALUE = 4;

  /**
   * An array of all the '<em><b>Color</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Color[] VALUES_ARRAY =
    new Color[]
    {
      RED,
      BLACK,
      WHITE,
      GREY,
      GREEN,
    };

  /**
   * A public read-only list of all the '<em><b>Color</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Color> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Color</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Color get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Color result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Color</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Color getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Color result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Color</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Color get(int value)
  {
    switch (value)
    {
      case RED_VALUE: return RED;
      case BLACK_VALUE: return BLACK;
      case WHITE_VALUE: return WHITE;
      case GREY_VALUE: return GREY;
      case GREEN_VALUE: return GREEN;
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
  private Color(int value, String name, String literal)
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
  
} //Color