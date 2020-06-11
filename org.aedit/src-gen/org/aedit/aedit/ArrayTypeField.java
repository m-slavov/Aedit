/**
 * generated by Xtext 2.21.0
 */
package org.aedit.aedit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.ArrayTypeField#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.aedit.aedit.AeditPackage#getArrayTypeField()
 * @model
 * @generated
 */
public interface ArrayTypeField extends Types
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(AnnotatedTypes)
   * @see org.aedit.aedit.AeditPackage#getArrayTypeField_Type()
   * @model containment="true"
   * @generated
   */
  AnnotatedTypes getType();

  /**
   * Sets the value of the '{@link org.aedit.aedit.ArrayTypeField#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AnnotatedTypes value);

} // ArrayTypeField