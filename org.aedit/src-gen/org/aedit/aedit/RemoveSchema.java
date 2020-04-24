/**
 * generated by Xtext 2.12.0
 */
package org.aedit.aedit;

import org.xtext.example.mydsl.myAvdl.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.RemoveSchema#getSchemaType <em>Schema Type</em>}</li>
 *   <li>{@link org.aedit.aedit.RemoveSchema#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see org.aedit.aedit.AeditPackage#getRemoveSchema()
 * @model
 * @generated
 */
public interface RemoveSchema extends GenericRule
{
  /**
   * Returns the value of the '<em><b>Schema Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema Type</em>' attribute.
   * @see #setSchemaType(String)
   * @see org.aedit.aedit.AeditPackage#getRemoveSchema_SchemaType()
   * @model
   * @generated
   */
  String getSchemaType();

  /**
   * Sets the value of the '{@link org.aedit.aedit.RemoveSchema#getSchemaType <em>Schema Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema Type</em>' attribute.
   * @see #getSchemaType()
   * @generated
   */
  void setSchemaType(String value);

  /**
   * Returns the value of the '<em><b>Schema</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema</em>' reference.
   * @see #setSchema(Type)
   * @see org.aedit.aedit.AeditPackage#getRemoveSchema_Schema()
   * @model
   * @generated
   */
  Type getSchema();

  /**
   * Sets the value of the '{@link org.aedit.aedit.RemoveSchema#getSchema <em>Schema</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema</em>' reference.
   * @see #getSchema()
   * @generated
   */
  void setSchema(Type value);

} // RemoveSchema
