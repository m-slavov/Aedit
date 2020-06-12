/**
 * generated by Xtext 2.21.0
 */
package org.aedit.aedit;

import avroclipse.avroIDL.Field;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Value To Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.AddValueToArray#getIndex <em>Index</em>}</li>
 *   <li>{@link org.aedit.aedit.AddValueToArray#getArray <em>Array</em>}</li>
 *   <li>{@link org.aedit.aedit.AddValueToArray#getValueToAdd <em>Value To Add</em>}</li>
 * </ul>
 *
 * @see org.aedit.aedit.AeditPackage#getAddValueToArray()
 * @model
 * @generated
 */
public interface AddValueToArray extends ArrayEditRules
{
  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(int)
   * @see org.aedit.aedit.AeditPackage#getAddValueToArray_Index()
   * @model
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link org.aedit.aedit.AddValueToArray#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' reference.
   * @see #setArray(Field)
   * @see org.aedit.aedit.AeditPackage#getAddValueToArray_Array()
   * @model
   * @generated
   */
  Field getArray();

  /**
   * Sets the value of the '{@link org.aedit.aedit.AddValueToArray#getArray <em>Array</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' reference.
   * @see #getArray()
   * @generated
   */
  void setArray(Field value);

  /**
   * Returns the value of the '<em><b>Value To Add</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value To Add</em>' containment reference.
   * @see #setValueToAdd(EObject)
   * @see org.aedit.aedit.AeditPackage#getAddValueToArray_ValueToAdd()
   * @model containment="true"
   * @generated
   */
  EObject getValueToAdd();

  /**
   * Sets the value of the '{@link org.aedit.aedit.AddValueToArray#getValueToAdd <em>Value To Add</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value To Add</em>' containment reference.
   * @see #getValueToAdd()
   * @generated
   */
  void setValueToAdd(EObject value);

} // AddValueToArray
