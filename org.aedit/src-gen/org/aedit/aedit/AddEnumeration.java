/**
 * generated by Xtext 2.12.0
 */
package org.aedit.aedit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.AddEnumeration#getEnumName <em>Enum Name</em>}</li>
 *   <li>{@link org.aedit.aedit.AddEnumeration#getSymbols <em>Symbols</em>}</li>
 * </ul>
 *
 * @see org.aedit.aedit.AeditPackage#getAddEnumeration()
 * @model
 * @generated
 */
public interface AddEnumeration extends Add
{
  /**
   * Returns the value of the '<em><b>Enum Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Name</em>' attribute.
   * @see #setEnumName(String)
   * @see org.aedit.aedit.AeditPackage#getAddEnumeration_EnumName()
   * @model
   * @generated
   */
  String getEnumName();

  /**
   * Sets the value of the '{@link org.aedit.aedit.AddEnumeration#getEnumName <em>Enum Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum Name</em>' attribute.
   * @see #getEnumName()
   * @generated
   */
  void setEnumName(String value);

  /**
   * Returns the value of the '<em><b>Symbols</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbols</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbols</em>' attribute list.
   * @see org.aedit.aedit.AeditPackage#getAddEnumeration_Symbols()
   * @model unique="false"
   * @generated
   */
  EList<String> getSymbols();

} // AddEnumeration
