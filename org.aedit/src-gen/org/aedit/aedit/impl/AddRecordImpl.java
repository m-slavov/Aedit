/**
 * generated by Xtext 2.12.0
 */
package org.aedit.aedit.impl;

import java.util.Collection;

import org.aedit.aedit.AddRecord;
import org.aedit.aedit.AeditPackage;
import org.aedit.aedit.Field;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.impl.AddRecordImpl#getRecordName <em>Record Name</em>}</li>
 *   <li>{@link org.aedit.aedit.impl.AddRecordImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddRecordImpl extends AddImpl implements AddRecord
{
  /**
   * The default value of the '{@link #getRecordName() <em>Record Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordName()
   * @generated
   * @ordered
   */
  protected static final String RECORD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRecordName() <em>Record Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordName()
   * @generated
   * @ordered
   */
  protected String recordName = RECORD_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<Field> fields;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddRecordImpl()
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
    return AeditPackage.Literals.ADD_RECORD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRecordName()
  {
    return recordName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecordName(String newRecordName)
  {
    String oldRecordName = recordName;
    recordName = newRecordName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AeditPackage.ADD_RECORD__RECORD_NAME, oldRecordName, recordName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<Field>(Field.class, this, AeditPackage.ADD_RECORD__FIELDS);
    }
    return fields;
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
      case AeditPackage.ADD_RECORD__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
      case AeditPackage.ADD_RECORD__RECORD_NAME:
        return getRecordName();
      case AeditPackage.ADD_RECORD__FIELDS:
        return getFields();
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
      case AeditPackage.ADD_RECORD__RECORD_NAME:
        setRecordName((String)newValue);
        return;
      case AeditPackage.ADD_RECORD__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Field>)newValue);
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
      case AeditPackage.ADD_RECORD__RECORD_NAME:
        setRecordName(RECORD_NAME_EDEFAULT);
        return;
      case AeditPackage.ADD_RECORD__FIELDS:
        getFields().clear();
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
      case AeditPackage.ADD_RECORD__RECORD_NAME:
        return RECORD_NAME_EDEFAULT == null ? recordName != null : !RECORD_NAME_EDEFAULT.equals(recordName);
      case AeditPackage.ADD_RECORD__FIELDS:
        return fields != null && !fields.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (recordName: ");
    result.append(recordName);
    result.append(')');
    return result.toString();
  }

} //AddRecordImpl
