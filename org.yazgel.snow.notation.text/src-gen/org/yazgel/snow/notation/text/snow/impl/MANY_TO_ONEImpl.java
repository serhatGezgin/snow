/**
 */
package org.yazgel.snow.notation.text.snow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.XExpression;

import org.yazgel.snow.notation.text.snow.MANY_TO_ONE;
import org.yazgel.snow.notation.text.snow.SnowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MANY TO ONE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.snow.notation.text.snow.impl.MANY_TO_ONEImpl#getOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MANY_TO_ONEImpl extends PropertyAnnotationImpl implements MANY_TO_ONE
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MANY_TO_ONEImpl()
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
    return SnowPackage.Literals.MANY_TO_ONE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SnowPackage.MANY_TO_ONE__OPTIONAL, oldOptional, newOptional);
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
        msgs = ((InternalEObject)optional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SnowPackage.MANY_TO_ONE__OPTIONAL, null, msgs);
      if (newOptional != null)
        msgs = ((InternalEObject)newOptional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SnowPackage.MANY_TO_ONE__OPTIONAL, null, msgs);
      msgs = basicSetOptional(newOptional, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SnowPackage.MANY_TO_ONE__OPTIONAL, newOptional, newOptional));
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
      case SnowPackage.MANY_TO_ONE__OPTIONAL:
        return basicSetOptional(null, msgs);
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
      case SnowPackage.MANY_TO_ONE__OPTIONAL:
        return getOptional();
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
      case SnowPackage.MANY_TO_ONE__OPTIONAL:
        setOptional((XExpression)newValue);
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
      case SnowPackage.MANY_TO_ONE__OPTIONAL:
        setOptional((XExpression)null);
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
      case SnowPackage.MANY_TO_ONE__OPTIONAL:
        return optional != null;
    }
    return super.eIsSet(featureID);
  }

} //MANY_TO_ONEImpl
