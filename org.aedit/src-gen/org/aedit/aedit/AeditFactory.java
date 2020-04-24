/**
 * generated by Xtext 2.12.0
 */
package org.aedit.aedit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.aedit.aedit.AeditPackage
 * @generated
 */
public interface AeditFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AeditFactory eINSTANCE = org.aedit.aedit.impl.AeditFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Feature Map</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Map</em>'.
   * @generated
   */
  FeatureMap createFeatureMap();

  /**
   * Returns a new object of class '<em>Rule Map</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Map</em>'.
   * @generated
   */
  RuleMap createRuleMap();

  /**
   * Returns a new object of class '<em>Rule Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Declaration</em>'.
   * @generated
   */
  RuleDeclaration createRuleDeclaration();

  /**
   * Returns a new object of class '<em>Generic Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Rule</em>'.
   * @generated
   */
  GenericRule createGenericRule();

  /**
   * Returns a new object of class '<em>Schema Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schema Rule</em>'.
   * @generated
   */
  SchemaRule createSchemaRule();

  /**
   * Returns a new object of class '<em>Enum Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Rule</em>'.
   * @generated
   */
  EnumRule createEnumRule();

  /**
   * Returns a new object of class '<em>Change Schema</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Change Schema</em>'.
   * @generated
   */
  ChangeSchema createChangeSchema();

  /**
   * Returns a new object of class '<em>Change Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Change Enum</em>'.
   * @generated
   */
  ChangeEnum createChangeEnum();

  /**
   * Returns a new object of class '<em>Add</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add</em>'.
   * @generated
   */
  Add createAdd();

  /**
   * Returns a new object of class '<em>Add Record</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Record</em>'.
   * @generated
   */
  AddRecord createAddRecord();

  /**
   * Returns a new object of class '<em>Add Enumeration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Enumeration</em>'.
   * @generated
   */
  AddEnumeration createAddEnumeration();

  /**
   * Returns a new object of class '<em>Add Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Variable</em>'.
   * @generated
   */
  AddVariable createAddVariable();

  /**
   * Returns a new object of class '<em>Add Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Enum</em>'.
   * @generated
   */
  AddEnum createAddEnum();

  /**
   * Returns a new object of class '<em>Remove Schema</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove Schema</em>'.
   * @generated
   */
  RemoveSchema createRemoveSchema();

  /**
   * Returns a new object of class '<em>Remove Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove Variable</em>'.
   * @generated
   */
  RemoveVariable createRemoveVariable();

  /**
   * Returns a new object of class '<em>Remove Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove Enum</em>'.
   * @generated
   */
  RemoveEnum createRemoveEnum();

  /**
   * Returns a new object of class '<em>Rename Schema</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rename Schema</em>'.
   * @generated
   */
  RenameSchema createRenameSchema();

  /**
   * Returns a new object of class '<em>Rename Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rename Variable</em>'.
   * @generated
   */
  RenameVariable createRenameVariable();

  /**
   * Returns a new object of class '<em>Rename Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rename Enum</em>'.
   * @generated
   */
  RenameEnum createRenameEnum();

  /**
   * Returns a new object of class '<em>Change Def Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Change Def Value</em>'.
   * @generated
   */
  ChangeDefValue createChangeDefValue();

  /**
   * Returns a new object of class '<em>Change Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Change Type</em>'.
   * @generated
   */
  ChangeType createChangeType();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>Float Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Value</em>'.
   * @generated
   */
  FloatValue createFloatValue();

  /**
   * Returns a new object of class '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Value</em>'.
   * @generated
   */
  StringValue createStringValue();

  /**
   * Returns a new object of class '<em>Int Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Value</em>'.
   * @generated
   */
  IntValue createIntValue();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AeditPackage getAeditPackage();

} //AeditFactory