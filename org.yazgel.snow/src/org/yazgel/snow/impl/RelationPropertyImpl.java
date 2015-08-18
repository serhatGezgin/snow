/**
 */
package org.yazgel.snow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.yazgel.snow.CascadeType;
import org.yazgel.snow.FetchType;
import org.yazgel.snow.RelationProperty;
import org.yazgel.snow.SnowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.snow.impl.RelationPropertyImpl#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.yazgel.snow.impl.RelationPropertyImpl#getFetch <em>Fetch</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RelationPropertyImpl extends PropertyImpl implements RelationProperty {
	/**
	 * The cached value of the '{@link #getCascade() <em>Cascade</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade()
	 * @generated
	 * @ordered
	 */
	protected EList<CascadeType> cascade;

	/**
	 * The default value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected static final FetchType FETCH_EDEFAULT = FetchType.EAGER;

	/**
	 * The cached value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected FetchType fetch = FETCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SnowPackage.Literals.RELATION_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CascadeType> getCascade() {
		if (cascade == null) {
			cascade = new EDataTypeUniqueEList<CascadeType>(CascadeType.class, this, SnowPackage.RELATION_PROPERTY__CASCADE);
		}
		return cascade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetchType getFetch() {
		return fetch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFetch(FetchType newFetch) {
		FetchType oldFetch = fetch;
		fetch = newFetch == null ? FETCH_EDEFAULT : newFetch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnowPackage.RELATION_PROPERTY__FETCH, oldFetch, fetch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SnowPackage.RELATION_PROPERTY__CASCADE:
				return getCascade();
			case SnowPackage.RELATION_PROPERTY__FETCH:
				return getFetch();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SnowPackage.RELATION_PROPERTY__CASCADE:
				getCascade().clear();
				getCascade().addAll((Collection<? extends CascadeType>)newValue);
				return;
			case SnowPackage.RELATION_PROPERTY__FETCH:
				setFetch((FetchType)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SnowPackage.RELATION_PROPERTY__CASCADE:
				getCascade().clear();
				return;
			case SnowPackage.RELATION_PROPERTY__FETCH:
				setFetch(FETCH_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SnowPackage.RELATION_PROPERTY__CASCADE:
				return cascade != null && !cascade.isEmpty();
			case SnowPackage.RELATION_PROPERTY__FETCH:
				return fetch != FETCH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cascade: ");
		result.append(cascade);
		result.append(", fetch: ");
		result.append(fetch);
		result.append(')');
		return result.toString();
	}

} //RelationPropertyImpl
