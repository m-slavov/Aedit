/**
 * generated by Xtext 2.21.0
 */
package org.aedit.aedit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.PrimitiveTypeField#getType <em>Type</em>}</li>
 *   <li>{@link org.aedit.aedit.PrimitiveTypeField#getNameAnnotations <em>Name Annotations</em>}</li>
 *   <li>{@link org.aedit.aedit.PrimitiveTypeField#getVarName <em>Var Name</em>}</li>
 *   <li>{@link org.aedit.aedit.PrimitiveTypeField#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.aedit.aedit.AeditPackage#getPrimitiveTypeField()
 * @model
 * @generated
 */
public interface PrimitiveTypeField extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(PrimitiveType)
   * @see org.aedit.aedit.AeditPackage#getPrimitiveTypeField_Type()
   * @model containment="true"
   * @generated
   */
  PrimitiveType getType();

  /**
   * Sets the value of the '{@link org.aedit.aedit.PrimitiveTypeField#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(PrimitiveType value);

  /**
   * Returns the value of the '<em><b>Name Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.aedit.aedit.Annotation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Annotations</em>' containment reference list.
   * @see org.aedit.aedit.AeditPackage#getPrimitiveTypeField_NameAnnotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getNameAnnotations();

  /**
   * Returns the value of the '<em><b>Var Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Name</em>' attribute.
   * @see #setVarName(String)
   * @see org.aedit.aedit.AeditPackage#getPrimitiveTypeField_VarName()
   * @model
   * @generated
   */
  String getVarName();

  /**
   * Sets the value of the '{@link org.aedit.aedit.PrimitiveTypeField#getVarName <em>Var Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name</em>' attribute.
   * @see #getVarName()
   * @generated
   */
  void setVarName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Value)
   * @see org.aedit.aedit.AeditPackage#getPrimitiveTypeField_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link org.aedit.aedit.PrimitiveTypeField#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

} // PrimitiveTypeField
