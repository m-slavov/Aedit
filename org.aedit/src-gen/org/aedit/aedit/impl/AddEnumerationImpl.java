/**
 * generated by Xtext 2.12.0
 */
package org.aedit.aedit.impl;

import java.util.Collection;

import org.aedit.aedit.AddEnumeration;
import org.aedit.aedit.AeditPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.impl.AddEnumerationImpl#getEnumName <em>Enum Name</em>}</li>
 *   <li>{@link org.aedit.aedit.impl.AddEnumerationImpl#getSymbols <em>Symbols</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddEnumerationImpl extends AddImpl implements AddEnumeration
{
  /**
   * The default value of the '{@link #getEnumName() <em>Enum Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumName()
   * @generated
   * @ordered
   */
  protected static final String ENUM_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnumName() <em>Enum Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumName()
   * @generated
   * @ordered
   */
  protected String enumName = ENUM_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSymbols() <em>Symbols</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbols()
   * @generated
   * @ordered
   */
  protected EList<String> symbols;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddEnumerationImpl()
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
    return AeditPackage.Literals.ADD_ENUMERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnumName()
  {
    return enumName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumName(String newEnumName)
  {
    String oldEnumName = enumName;
    enumName = newEnumName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AeditPackage.ADD_ENUMERATION__ENUM_NAME, oldEnumName, enumName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSymbols()
  {
    if (symbols == null)
    {
      symbols = new EDataTypeEList<String>(String.class, this, AeditPackage.ADD_ENUMERATION__SYMBOLS);
    }
    return symbols;
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
      case AeditPackage.ADD_ENUMERATION__ENUM_NAME:
        return getEnumName();
      case AeditPackage.ADD_ENUMERATION__SYMBOLS:
        return getSymbols();
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
      case AeditPackage.ADD_ENUMERATION__ENUM_NAME:
        setEnumName((String)newValue);
        return;
      case AeditPackage.ADD_ENUMERATION__SYMBOLS:
        getSymbols().clear();
        getSymbols().addAll((Collection<? extends String>)newValue);
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
      case AeditPackage.ADD_ENUMERATION__ENUM_NAME:
        setEnumName(ENUM_NAME_EDEFAULT);
        return;
      case AeditPackage.ADD_ENUMERATION__SYMBOLS:
        getSymbols().clear();
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
      case AeditPackage.ADD_ENUMERATION__ENUM_NAME:
        return ENUM_NAME_EDEFAULT == null ? enumName != null : !ENUM_NAME_EDEFAULT.equals(enumName);
      case AeditPackage.ADD_ENUMERATION__SYMBOLS:
        return symbols != null && !symbols.isEmpty();
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
    result.append(" (enumName: ");
    result.append(enumName);
    result.append(", symbols: ");
    result.append(symbols);
    result.append(')');
    return result.toString();
  }

} //AddEnumerationImpl
