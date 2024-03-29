/**
 * generated by Xtext 2.21.0
 */
package org.aedit.aedit.impl;

import avroclipse.avroIDL.Type;

import org.aedit.aedit.AeditPackage;
import org.aedit.aedit.RenameSchema;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rename Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.impl.RenameSchemaImpl#getSchemaType <em>Schema Type</em>}</li>
 *   <li>{@link org.aedit.aedit.impl.RenameSchemaImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.aedit.aedit.impl.RenameSchemaImpl#getNewSchName <em>New Sch Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenameSchemaImpl extends GenericRuleImpl implements RenameSchema
{
  /**
   * The default value of the '{@link #getSchemaType() <em>Schema Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchemaType()
   * @generated
   * @ordered
   */
  protected static final String SCHEMA_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSchemaType() <em>Schema Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchemaType()
   * @generated
   * @ordered
   */
  protected String schemaType = SCHEMA_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSchema() <em>Schema</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchema()
   * @generated
   * @ordered
   */
  protected Type schema;

  /**
   * The default value of the '{@link #getNewSchName() <em>New Sch Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewSchName()
   * @generated
   * @ordered
   */
  protected static final String NEW_SCH_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNewSchName() <em>New Sch Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewSchName()
   * @generated
   * @ordered
   */
  protected String newSchName = NEW_SCH_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RenameSchemaImpl()
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
    return AeditPackage.Literals.RENAME_SCHEMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSchemaType()
  {
    return schemaType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSchemaType(String newSchemaType)
  {
    String oldSchemaType = schemaType;
    schemaType = newSchemaType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AeditPackage.RENAME_SCHEMA__SCHEMA_TYPE, oldSchemaType, schemaType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getSchema()
  {
    if (schema != null && schema.eIsProxy())
    {
      InternalEObject oldSchema = (InternalEObject)schema;
      schema = (Type)eResolveProxy(oldSchema);
      if (schema != oldSchema)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AeditPackage.RENAME_SCHEMA__SCHEMA, oldSchema, schema));
      }
    }
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetSchema()
  {
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSchema(Type newSchema)
  {
    Type oldSchema = schema;
    schema = newSchema;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AeditPackage.RENAME_SCHEMA__SCHEMA, oldSchema, schema));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNewSchName()
  {
    return newSchName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNewSchName(String newNewSchName)
  {
    String oldNewSchName = newSchName;
    newSchName = newNewSchName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AeditPackage.RENAME_SCHEMA__NEW_SCH_NAME, oldNewSchName, newSchName));
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
      case AeditPackage.RENAME_SCHEMA__SCHEMA_TYPE:
        return getSchemaType();
      case AeditPackage.RENAME_SCHEMA__SCHEMA:
        if (resolve) return getSchema();
        return basicGetSchema();
      case AeditPackage.RENAME_SCHEMA__NEW_SCH_NAME:
        return getNewSchName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AeditPackage.RENAME_SCHEMA__SCHEMA_TYPE:
        setSchemaType((String)newValue);
        return;
      case AeditPackage.RENAME_SCHEMA__SCHEMA:
        setSchema((Type)newValue);
        return;
      case AeditPackage.RENAME_SCHEMA__NEW_SCH_NAME:
        setNewSchName((String)newValue);
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
      case AeditPackage.RENAME_SCHEMA__SCHEMA_TYPE:
        setSchemaType(SCHEMA_TYPE_EDEFAULT);
        return;
      case AeditPackage.RENAME_SCHEMA__SCHEMA:
        setSchema((Type)null);
        return;
      case AeditPackage.RENAME_SCHEMA__NEW_SCH_NAME:
        setNewSchName(NEW_SCH_NAME_EDEFAULT);
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
      case AeditPackage.RENAME_SCHEMA__SCHEMA_TYPE:
        return SCHEMA_TYPE_EDEFAULT == null ? schemaType != null : !SCHEMA_TYPE_EDEFAULT.equals(schemaType);
      case AeditPackage.RENAME_SCHEMA__SCHEMA:
        return schema != null;
      case AeditPackage.RENAME_SCHEMA__NEW_SCH_NAME:
        return NEW_SCH_NAME_EDEFAULT == null ? newSchName != null : !NEW_SCH_NAME_EDEFAULT.equals(newSchName);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (schemaType: ");
    result.append(schemaType);
    result.append(", newSchName: ");
    result.append(newSchName);
    result.append(')');
    return result.toString();
  }

} //RenameSchemaImpl
