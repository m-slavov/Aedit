/**
 * generated by Xtext 2.21.0
 */
package org.aedit.aedit;

import avroclipse.avroIDL.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Annotation To Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.AddAnnotationToSchema#getSchemaType <em>Schema Type</em>}</li>
 *   <li>{@link org.aedit.aedit.AddAnnotationToSchema#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.aedit.aedit.AddAnnotationToSchema#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see org.aedit.aedit.AeditPackage#getAddAnnotationToSchema()
 * @model
 * @generated
 */
public interface AddAnnotationToSchema extends GenericRule
{
  /**
   * Returns the value of the '<em><b>Schema Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema Type</em>' attribute.
   * @see #setSchemaType(String)
   * @see org.aedit.aedit.AeditPackage#getAddAnnotationToSchema_SchemaType()
   * @model
   * @generated
   */
  String getSchemaType();

  /**
   * Sets the value of the '{@link org.aedit.aedit.AddAnnotationToSchema#getSchemaType <em>Schema Type</em>}' attribute.
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
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema</em>' reference.
   * @see #setSchema(Type)
   * @see org.aedit.aedit.AeditPackage#getAddAnnotationToSchema_Schema()
   * @model
   * @generated
   */
  Type getSchema();

  /**
   * Sets the value of the '{@link org.aedit.aedit.AddAnnotationToSchema#getSchema <em>Schema</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema</em>' reference.
   * @see #getSchema()
   * @generated
   */
  void setSchema(Type value);

  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(Annotation)
   * @see org.aedit.aedit.AeditPackage#getAddAnnotationToSchema_Annotation()
   * @model containment="true"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link org.aedit.aedit.AddAnnotationToSchema#getAnnotation <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' containment reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(Annotation value);

} // AddAnnotationToSchema
