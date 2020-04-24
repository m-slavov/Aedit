/**
 * generated by Xtext 2.12.0
 */
package org.aedit.aedit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.Model#getRuleDeclarations <em>Rule Declarations</em>}</li>
 *   <li>{@link org.aedit.aedit.Model#getRuleMaps <em>Rule Maps</em>}</li>
 *   <li>{@link org.aedit.aedit.Model#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.aedit.aedit.Model#getFeatureMaps <em>Feature Maps</em>}</li>
 * </ul>
 *
 * @see org.aedit.aedit.AeditPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Rule Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.aedit.aedit.RuleDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Declarations</em>' containment reference list.
   * @see org.aedit.aedit.AeditPackage#getModel_RuleDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<RuleDeclaration> getRuleDeclarations();

  /**
   * Returns the value of the '<em><b>Rule Maps</b></em>' containment reference list.
   * The list contents are of type {@link org.aedit.aedit.RuleMap}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Maps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Maps</em>' containment reference list.
   * @see org.aedit.aedit.AeditPackage#getModel_RuleMaps()
   * @model containment="true"
   * @generated
   */
  EList<RuleMap> getRuleMaps();

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.aedit.aedit.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.aedit.aedit.AeditPackage#getModel_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

  /**
   * Returns the value of the '<em><b>Feature Maps</b></em>' containment reference list.
   * The list contents are of type {@link org.aedit.aedit.FeatureMap}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Maps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Maps</em>' containment reference list.
   * @see org.aedit.aedit.AeditPackage#getModel_FeatureMaps()
   * @model containment="true"
   * @generated
   */
  EList<FeatureMap> getFeatureMaps();

} // Model
