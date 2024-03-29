/**
 * generated by Xtext 2.21.0
 */
package org.aedit.aedit;

import avroclipse.avroIDL.Field;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Annotation To Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.AddAnnotationToField#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.aedit.aedit.AddAnnotationToField#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see org.aedit.aedit.AeditPackage#getAddAnnotationToField()
 * @model
 * @generated
 */
public interface AddAnnotationToField extends SchemaRule
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(Field)
   * @see org.aedit.aedit.AeditPackage#getAddAnnotationToField_Variable()
   * @model
   * @generated
   */
  Field getVariable();

  /**
   * Sets the value of the '{@link org.aedit.aedit.AddAnnotationToField#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Field value);

  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(Annotation)
   * @see org.aedit.aedit.AeditPackage#getAddAnnotationToField_Annotation()
   * @model containment="true"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link org.aedit.aedit.AddAnnotationToField#getAnnotation <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' containment reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(Annotation value);

} // AddAnnotationToField
