/**
 * generated by Xtext 2.12.0
 */
package org.aedit.aedit;

import org.xtext.example.org.xtext.example.avdlclipse.avdlClipse.Field;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rename Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.RenameVariable#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.aedit.aedit.RenameVariable#getNewVarName <em>New Var Name</em>}</li>
 * </ul>
 *
 * @see org.aedit.aedit.AeditPackage#getRenameVariable()
 * @model
 * @generated
 */
public interface RenameVariable extends SchemaRule
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(Field)
   * @see org.aedit.aedit.AeditPackage#getRenameVariable_Variable()
   * @model
   * @generated
   */
  Field getVariable();

  /**
   * Sets the value of the '{@link org.aedit.aedit.RenameVariable#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Field value);

  /**
   * Returns the value of the '<em><b>New Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Var Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Var Name</em>' attribute.
   * @see #setNewVarName(String)
   * @see org.aedit.aedit.AeditPackage#getRenameVariable_NewVarName()
   * @model
   * @generated
   */
  String getNewVarName();

  /**
   * Sets the value of the '{@link org.aedit.aedit.RenameVariable#getNewVarName <em>New Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Var Name</em>' attribute.
   * @see #getNewVarName()
   * @generated
   */
  void setNewVarName(String value);

} // RenameVariable
