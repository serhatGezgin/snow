/**
 */
package org.yazgel.snow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yazgel.snow.OneToManyRelationProperty;
import org.yazgel.snow.SnowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One To Many Relation Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.snow.impl.OneToManyRelationPropertyImpl#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.yazgel.snow.impl.OneToManyRelationPropertyImpl#isOrphanRemoval <em>Orphan Removal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OneToManyRelationPropertyImpl extends RelationPropertyImpl implements OneToManyRelationProperty {
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
	 * The default value of the '{@link #isOrphanRemoval() <em>Orphan Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrphanRemoval()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORPHAN_REMOVAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrphanRemoval() <em>Orphan Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrphanRemoval()
	 * @generated
	 * @ordered
	 */
	protected boolean orphanRemoval = ORPHAN_REMOVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneToManyRelationPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SnowPackage.Literals.ONE_TO_MANY_RELATION_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMappedBy() {
		return mappedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedBy(String newMappedBy) {
		String oldMappedBy = mappedBy;
		mappedBy = newMappedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnowPackage.ONE_TO_MANY_RELATION_PROPERTY__MAPPED_BY, oldMappedBy, mappedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrphanRemoval() {
		return orphanRemoval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrphanRemoval(boolean newOrphanRemoval) {
		boolean oldOrphanRemoval = orphanRemoval;
		orphanRemoval = newOrphanRemoval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnowPackage.ONE_TO_MANY_RELATION_PROPERTY__ORPHAN_REMOVAL, oldOrphanRemoval, orphanRemoval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SnowPackage.ONE_TO_MANY_RELATION_PROPERTY__MAPPED_BY:
				return getMappedBy();
			case SnowPackage.ONE_TO_MANY_RELATION_PROPERTY__ORPHAN_REMOVAL:
				return isOrphanRemoval();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SnowPackage.ONE_TO_MANY_RELATION_PROPERTY__MAPPED_BY:
				setMappedBy((String)newValue);
				return;
			case SnowPackage.ONE_TO_MANY_RELATION_PROPERTY__ORPHAN_REMOVAL:
				setOrphanRemoval((Boolean)newValue);
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
			case SnowPackage.ONE_TO_MANY_RELATION_PROPERTY__MAPPED_BY:
				setMappedBy(MAPPED_BY_EDEFAULT);
				return;
			case SnowPackage.ONE_TO_MANY_RELATION_PROPERTY__ORPHAN_REMOVAL:
				setOrphanRemoval(ORPHAN_REMOVAL_EDEFAULT);
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
			case SnowPackage.ONE_TO_MANY_RELATION_PROPERTY__MAPPED_BY:
				return MAPPED_BY_EDEFAULT == null ? mappedBy != null : !MAPPED_BY_EDEFAULT.equals(mappedBy);
			case SnowPackage.ONE_TO_MANY_RELATION_PROPERTY__ORPHAN_REMOVAL:
				return orphanRemoval != ORPHAN_REMOVAL_EDEFAULT;
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
		result.append(" (mappedBy: ");
		result.append(mappedBy);
		result.append(", orphanRemoval: ");
		result.append(orphanRemoval);
		result.append(')');
		return result.toString();
	}

} //OneToManyRelationPropertyImpl
