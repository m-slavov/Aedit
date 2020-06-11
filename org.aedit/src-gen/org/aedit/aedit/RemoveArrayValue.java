/**
 * generated by Xtext 2.21.0
 */
package org.aedit.aedit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Array Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.RemoveArrayValue#getValueToRemove <em>Value To Remove</em>}</li>
 * </ul>
 *
 * @see org.aedit.aedit.AeditPackage#getRemoveArrayValue()
 * @model
 * @generated
 */
public interface RemoveArrayValue extends ArrayEditRules
{
  /**
   * Returns the value of the '<em><b>Value To Remove</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value To Remove</em>' containment reference.
   * @see #setValueToRemove(Value)
   * @see org.aedit.aedit.AeditPackage#getRemoveArrayValue_ValueToRemove()
   * @model containment="true"
   * @generated
   */
  Value getValueToRemove();

  /**
   * Sets the value of the '{@link org.aedit.aedit.RemoveArrayValue#getValueToRemove <em>Value To Remove</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value To Remove</em>' containment reference.
   * @see #getValueToRemove()
   * @generated
   */
  void setValueToRemove(Value value);

} // RemoveArrayValue