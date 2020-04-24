/**
 * generated by Xtext 2.12.0
 */
package org.aedit.aedit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.AddRecord#getRecordName <em>Record Name</em>}</li>
 *   <li>{@link org.aedit.aedit.AddRecord#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see org.aedit.aedit.AeditPackage#getAddRecord()
 * @model
 * @generated
 */
public interface AddRecord extends Add
{
  /**
   * Returns the value of the '<em><b>Record Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Name</em>' attribute.
   * @see #setRecordName(String)
   * @see org.aedit.aedit.AeditPackage#getAddRecord_RecordName()
   * @model
   * @generated
   */
  String getRecordName();

  /**
   * Sets the value of the '{@link org.aedit.aedit.AddRecord#getRecordName <em>Record Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Name</em>' attribute.
   * @see #getRecordName()
   * @generated
   */
  void setRecordName(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.aedit.aedit.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.aedit.aedit.AeditPackage#getAddRecord_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // AddRecord
