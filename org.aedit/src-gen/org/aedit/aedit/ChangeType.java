/**
 * generated by Xtext 2.21.0
 */
package org.aedit.aedit;

import avroclipse.avroIDL.Field;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.ChangeType#getField <em>Field</em>}</li>
 *   <li>{@link org.aedit.aedit.ChangeType#getNewType <em>New Type</em>}</li>
 * </ul>
 *
 * @see org.aedit.aedit.AeditPackage#getChangeType()
 * @model
 * @generated
 */
public interface ChangeType extends SchemaRule
{
  /**
   * Returns the value of the '<em><b>Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' reference.
   * @see #setField(Field)
   * @see org.aedit.aedit.AeditPackage#getChangeType_Field()
   * @model
   * @generated
   */
  Field getField();

  /**
   * Sets the value of the '{@link org.aedit.aedit.ChangeType#getField <em>Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' reference.
   * @see #getField()
   * @generated
   */
  void setField(Field value);

  /**
   * Returns the value of the '<em><b>New Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Type</em>' attribute.
   * @see #setNewType(String)
   * @see org.aedit.aedit.AeditPackage#getChangeType_NewType()
   * @model
   * @generated
   */
  String getNewType();

  /**
   * Sets the value of the '{@link org.aedit.aedit.ChangeType#getNewType <em>New Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Type</em>' attribute.
   * @see #getNewType()
   * @generated
   */
  void setNewType(String value);

} // ChangeType
