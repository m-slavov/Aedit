/**
 * generated by Xtext 2.21.0
 */
package org.aedit.aedit.impl;

import java.util.Collection;

import org.aedit.aedit.AeditPackage;
import org.aedit.aedit.Feature;
import org.aedit.aedit.FeatureMap;
import org.aedit.aedit.Model;
import org.aedit.aedit.RuleDeclaration;
import org.aedit.aedit.RuleMap;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aedit.aedit.impl.ModelImpl#getRuleDeclarations <em>Rule Declarations</em>}</li>
 *   <li>{@link org.aedit.aedit.impl.ModelImpl#getRuleMaps <em>Rule Maps</em>}</li>
 *   <li>{@link org.aedit.aedit.impl.ModelImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.aedit.aedit.impl.ModelImpl#getFeatureMaps <em>Feature Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getRuleDeclarations() <em>Rule Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleDeclarations()
   * @generated
   * @ordered
   */
  protected EList<RuleDeclaration> ruleDeclarations;

  /**
   * The cached value of the '{@link #getRuleMaps() <em>Rule Maps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleMaps()
   * @generated
   * @ordered
   */
  protected EList<RuleMap> ruleMaps;

  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<Feature> features;

  /**
   * The cached value of the '{@link #getFeatureMaps() <em>Feature Maps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureMaps()
   * @generated
   * @ordered
   */
  protected EList<FeatureMap> featureMaps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return AeditPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<RuleDeclaration> getRuleDeclarations()
  {
    if (ruleDeclarations == null)
    {
      ruleDeclarations = new EObjectContainmentEList<RuleDeclaration>(RuleDeclaration.class, this, AeditPackage.MODEL__RULE_DECLARATIONS);
    }
    return ruleDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<RuleMap> getRuleMaps()
  {
    if (ruleMaps == null)
    {
      ruleMaps = new EObjectContainmentEList<RuleMap>(RuleMap.class, this, AeditPackage.MODEL__RULE_MAPS);
    }
    return ruleMaps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Feature> getFeatures()
  {
    if (features == null)
    {
      features = new EObjectContainmentEList<Feature>(Feature.class, this, AeditPackage.MODEL__FEATURES);
    }
    return features;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FeatureMap> getFeatureMaps()
  {
    if (featureMaps == null)
    {
      featureMaps = new EObjectContainmentEList<FeatureMap>(FeatureMap.class, this, AeditPackage.MODEL__FEATURE_MAPS);
    }
    return featureMaps;
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
      case AeditPackage.MODEL__RULE_DECLARATIONS:
        return ((InternalEList<?>)getRuleDeclarations()).basicRemove(otherEnd, msgs);
      case AeditPackage.MODEL__RULE_MAPS:
        return ((InternalEList<?>)getRuleMaps()).basicRemove(otherEnd, msgs);
      case AeditPackage.MODEL__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
      case AeditPackage.MODEL__FEATURE_MAPS:
        return ((InternalEList<?>)getFeatureMaps()).basicRemove(otherEnd, msgs);
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
      case AeditPackage.MODEL__RULE_DECLARATIONS:
        return getRuleDeclarations();
      case AeditPackage.MODEL__RULE_MAPS:
        return getRuleMaps();
      case AeditPackage.MODEL__FEATURES:
        return getFeatures();
      case AeditPackage.MODEL__FEATURE_MAPS:
        return getFeatureMaps();
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
      case AeditPackage.MODEL__RULE_DECLARATIONS:
        getRuleDeclarations().clear();
        getRuleDeclarations().addAll((Collection<? extends RuleDeclaration>)newValue);
        return;
      case AeditPackage.MODEL__RULE_MAPS:
        getRuleMaps().clear();
        getRuleMaps().addAll((Collection<? extends RuleMap>)newValue);
        return;
      case AeditPackage.MODEL__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends Feature>)newValue);
        return;
      case AeditPackage.MODEL__FEATURE_MAPS:
        getFeatureMaps().clear();
        getFeatureMaps().addAll((Collection<? extends FeatureMap>)newValue);
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
      case AeditPackage.MODEL__RULE_DECLARATIONS:
        getRuleDeclarations().clear();
        return;
      case AeditPackage.MODEL__RULE_MAPS:
        getRuleMaps().clear();
        return;
      case AeditPackage.MODEL__FEATURES:
        getFeatures().clear();
        return;
      case AeditPackage.MODEL__FEATURE_MAPS:
        getFeatureMaps().clear();
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
      case AeditPackage.MODEL__RULE_DECLARATIONS:
        return ruleDeclarations != null && !ruleDeclarations.isEmpty();
      case AeditPackage.MODEL__RULE_MAPS:
        return ruleMaps != null && !ruleMaps.isEmpty();
      case AeditPackage.MODEL__FEATURES:
        return features != null && !features.isEmpty();
      case AeditPackage.MODEL__FEATURE_MAPS:
        return featureMaps != null && !featureMaps.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
