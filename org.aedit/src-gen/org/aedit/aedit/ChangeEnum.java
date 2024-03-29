/**
 * generated by Xtext 2.21.0
 */
package org.aedit.aedit;

import avroclipse.avroIDL.EnumType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.ChangeEnum#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.aedit.aedit.ChangeEnum#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see org.aedit.aedit.AeditPackage#getChangeEnum()
 * @model
 * @generated
 */
public interface ChangeEnum extends GenericRule
{
  /**
   * Returns the value of the '<em><b>Schema</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema</em>' reference.
   * @see #setSchema(EnumType)
   * @see org.aedit.aedit.AeditPackage#getChangeEnum_Schema()
   * @model
   * @generated
   */
  EnumType getSchema();

  /**
   * Sets the value of the '{@link org.aedit.aedit.ChangeEnum#getSchema <em>Schema</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema</em>' reference.
   * @see #getSchema()
   * @generated
   */
  void setSchema(EnumType value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link org.aedit.aedit.EnumRule}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see org.aedit.aedit.AeditPackage#getChangeEnum_Rules()
   * @model containment="true"
   * @generated
   */
  EList<EnumRule> getRules();

} // ChangeEnum
