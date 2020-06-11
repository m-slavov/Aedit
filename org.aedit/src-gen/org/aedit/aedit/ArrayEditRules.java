/**
 * generated by Xtext 2.21.0
 */
package org.aedit.aedit;

import avroclipse.avroIDL.Field;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Edit Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.ArrayEditRules#getArray <em>Array</em>}</li>
 * </ul>
 *
 * @see org.aedit.aedit.AeditPackage#getArrayEditRules()
 * @model
 * @generated
 */
public interface ArrayEditRules extends SchemaRule
{
  /**
   * Returns the value of the '<em><b>Array</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' reference.
   * @see #setArray(Field)
   * @see org.aedit.aedit.AeditPackage#getArrayEditRules_Array()
   * @model
   * @generated
   */
  Field getArray();

  /**
   * Sets the value of the '{@link org.aedit.aedit.ArrayEditRules#getArray <em>Array</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' reference.
   * @see #getArray()
   * @generated
   */
  void setArray(Field value);

} // ArrayEditRules
