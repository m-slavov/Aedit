/**
 * generated by Xtext 2.12.0
 */
package org.aedit.aedit.impl;

import java.util.Collection;

import org.aedit.aedit.AeditPackage;
import org.aedit.aedit.ChangeEnum;
import org.aedit.aedit.EnumRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myAvdl.EnumType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.impl.ChangeEnumImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.aedit.aedit.impl.ChangeEnumImpl#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeEnumImpl extends GenericRuleImpl implements ChangeEnum
{
  /**
   * The cached value of the '{@link #getSchema() <em>Schema</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchema()
   * @generated
   * @ordered
   */
  protected EnumType schema;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<EnumRule> rules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChangeEnumImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AeditPackage.Literals.CHANGE_ENUM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumType getSchema()
  {
    if (schema != null && schema.eIsProxy())
    {
      InternalEObject oldSchema = (InternalEObject)schema;
      schema = (EnumType)eResolveProxy(oldSchema);
      if (schema != oldSchema)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AeditPackage.CHANGE_ENUM__SCHEMA, oldSchema, schema));
      }
    }
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumType basicGetSchema()
  {
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchema(EnumType newSchema)
  {
    EnumType oldSchema = schema;
    schema = newSchema;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AeditPackage.CHANGE_ENUM__SCHEMA, oldSchema, schema));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnumRule> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<EnumRule>(EnumRule.class, this, AeditPackage.CHANGE_ENUM__RULES);
    }
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AeditPackage.CHANGE_ENUM__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AeditPackage.CHANGE_ENUM__SCHEMA:
        if (resolve) return getSchema();
        return basicGetSchema();
      case AeditPackage.CHANGE_ENUM__RULES:
        return getRules();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AeditPackage.CHANGE_ENUM__SCHEMA:
        setSchema((EnumType)newValue);
        return;
      case AeditPackage.CHANGE_ENUM__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends EnumRule>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AeditPackage.CHANGE_ENUM__SCHEMA:
        setSchema((EnumType)null);
        return;
      case AeditPackage.CHANGE_ENUM__RULES:
        getRules().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AeditPackage.CHANGE_ENUM__SCHEMA:
        return schema != null;
      case AeditPackage.CHANGE_ENUM__RULES:
        return rules != null && !rules.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ChangeEnumImpl
