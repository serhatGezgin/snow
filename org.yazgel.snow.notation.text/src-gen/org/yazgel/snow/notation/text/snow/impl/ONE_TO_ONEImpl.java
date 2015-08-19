/**
 */
package org.yazgel.snow.notation.text.snow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.XExpression;

import org.yazgel.snow.notation.text.snow.ONE_TO_ONE;
import org.yazgel.snow.notation.text.snow.SnowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ONE TO ONE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.snow.notation.text.snow.impl.ONE_TO_ONEImpl#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.snow.impl.ONE_TO_ONEImpl#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.snow.impl.ONE_TO_ONEImpl#getOrphanRemoval <em>Orphan Removal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ONE_TO_ONEImpl extends PropertyAnnotationImpl implements ONE_TO_ONE
{
  /**
   * The default value of the '{@link #getMappedBy() <em>Mapped By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedBy()
   * @generated
   * @ordered
   */
  protected static final String MAPPED_BY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMappedBy() <em>Mapped By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedBy()
   * @generated
   * @ordered
   */
  protected String mappedBy = MAPPED_BY_EDEFAULT;

  /**
   * The cached value of the '{@link #getOptional() <em>Optional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptional()
   * @generated
   * @ordered
   */
  protected XExpression optional;

  /**
   * The cached value of the '{@link #getOrphanRemoval() <em>Orphan Removal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrphanRemoval()
   * @generated
   * @ordered
   */
  protected XExpression orphanRemoval;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ONE_TO_ONEImpl()
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
    return SnowPackage.Literals.ONE_TO_ONE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMappedBy()
  {
    return mappedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMappedBy(String newMappedBy)
  {
    String oldMappedBy = mappedBy;
    mappedBy = newMappedBy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SnowPackage.ONE_TO_ONE__MAPPED_BY, oldMappedBy, mappedBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getOptional()
  {
    return optional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOptional(XExpression newOptional, NotificationChain msgs)
  {
    XExpression oldOptional = optional;
    optional = newOptional;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SnowPackage.ONE_TO_ONE__OPTIONAL, oldOptional, newOptional);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptional(XExpression newOptional)
  {
    if (newOptional != optional)
    {
      NotificationChain msgs = null;
      if (optional != null)
        msgs = ((InternalEObject)optional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SnowPackage.ONE_TO_ONE__OPTIONAL, null, msgs);
      if (newOptional != null)
        msgs = ((InternalEObject)newOptional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SnowPackage.ONE_TO_ONE__OPTIONAL, null, msgs);
      msgs = basicSetOptional(newOptional, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SnowPackage.ONE_TO_ONE__OPTIONAL, newOptional, newOptional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getOrphanRemoval()
  {
    return orphanRemoval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrphanRemoval(XExpression newOrphanRemoval, NotificationChain msgs)
  {
    XExpression oldOrphanRemoval = orphanRemoval;
    orphanRemoval = newOrphanRemoval;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SnowPackage.ONE_TO_ONE__ORPHAN_REMOVAL, oldOrphanRemoval, newOrphanRemoval);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrphanRemoval(XExpression newOrphanRemoval)
  {
    if (newOrphanRemoval != orphanRemoval)
    {
      NotificationChain msgs = null;
      if (orphanRemoval != null)
        msgs = ((InternalEObject)orphanRemoval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SnowPackage.ONE_TO_ONE__ORPHAN_REMOVAL, null, msgs);
      if (newOrphanRemoval != null)
        msgs = ((InternalEObject)newOrphanRemoval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SnowPackage.ONE_TO_ONE__ORPHAN_REMOVAL, null, msgs);
      msgs = basicSetOrphanRemoval(newOrphanRemoval, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SnowPackage.ONE_TO_ONE__ORPHAN_REMOVAL, newOrphanRemoval, newOrphanRemoval));
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
      case SnowPackage.ONE_TO_ONE__OPTIONAL:
        return basicSetOptional(null, msgs);
      case SnowPackage.ONE_TO_ONE__ORPHAN_REMOVAL:
        return basicSetOrphanRemoval(null, msgs);
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
      case SnowPackage.ONE_TO_ONE__MAPPED_BY:
        return getMappedBy();
      case SnowPackage.ONE_TO_ONE__OPTIONAL:
        return getOptional();
      case SnowPackage.ONE_TO_ONE__ORPHAN_REMOVAL:
        return getOrphanRemoval();
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
      case SnowPackage.ONE_TO_ONE__MAPPED_BY:
        setMappedBy((String)newValue);
        return;
      case SnowPackage.ONE_TO_ONE__OPTIONAL:
        setOptional((XExpression)newValue);
        return;
      case SnowPackage.ONE_TO_ONE__ORPHAN_REMOVAL:
        setOrphanRemoval((XExpression)newValue);
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
      case SnowPackage.ONE_TO_ONE__MAPPED_BY:
        setMappedBy(MAPPED_BY_EDEFAULT);
        return;
      case SnowPackage.ONE_TO_ONE__OPTIONAL:
        setOptional((XExpression)null);
        return;
      case SnowPackage.ONE_TO_ONE__ORPHAN_REMOVAL:
        setOrphanRemoval((XExpression)null);
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
      case SnowPackage.ONE_TO_ONE__MAPPED_BY:
        return MAPPED_BY_EDEFAULT == null ? mappedBy != null : !MAPPED_BY_EDEFAULT.equals(mappedBy);
      case SnowPackage.ONE_TO_ONE__OPTIONAL:
        return optional != null;
      case SnowPackage.ONE_TO_ONE__ORPHAN_REMOVAL:
        return orphanRemoval != null;
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
    result.append(" (mappedBy: ");
    result.append(mappedBy);
    result.append(')');
    return result.toString();
  }

} //ONE_TO_ONEImpl
