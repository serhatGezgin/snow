/**
 */
package org.yazgel.snow.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.yazgel.snow.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.yazgel.snow.SnowPackage
 * @generated
 */
public class SnowSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SnowPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnowSwitch() {
		if (modelPackage == null) {
			modelPackage = SnowPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SnowPackage.PERSISTENCE_MODEL: {
				PersistenceModel persistenceModel = (PersistenceModel)theEObject;
				T result = casePersistenceModel(persistenceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SnowPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SnowPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SnowPackage.RELATION_PROPERTY: {
				RelationProperty relationProperty = (RelationProperty)theEObject;
				T result = caseRelationProperty(relationProperty);
				if (result == null) result = caseProperty(relationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SnowPackage.ONE_TO_MANY_RELATION_PROPERTY: {
				OneToManyRelationProperty oneToManyRelationProperty = (OneToManyRelationProperty)theEObject;
				T result = caseOneToManyRelationProperty(oneToManyRelationProperty);
				if (result == null) result = caseRelationProperty(oneToManyRelationProperty);
				if (result == null) result = caseProperty(oneToManyRelationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SnowPackage.MANY_TO_ONE_RELATION_PROPERTY: {
				ManyToOneRelationProperty manyToOneRelationProperty = (ManyToOneRelationProperty)theEObject;
				T result = caseManyToOneRelationProperty(manyToOneRelationProperty);
				if (result == null) result = caseRelationProperty(manyToOneRelationProperty);
				if (result == null) result = caseProperty(manyToOneRelationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SnowPackage.ONE_TO_ONE_RELATION_PROPERTY: {
				OneToOneRelationProperty oneToOneRelationProperty = (OneToOneRelationProperty)theEObject;
				T result = caseOneToOneRelationProperty(oneToOneRelationProperty);
				if (result == null) result = caseRelationProperty(oneToOneRelationProperty);
				if (result == null) result = caseProperty(oneToOneRelationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SnowPackage.MANY_TO_MANY_RELATION_PROPERTY: {
				ManyToManyRelationProperty manyToManyRelationProperty = (ManyToManyRelationProperty)theEObject;
				T result = caseManyToManyRelationProperty(manyToManyRelationProperty);
				if (result == null) result = caseRelationProperty(manyToManyRelationProperty);
				if (result == null) result = caseProperty(manyToManyRelationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistenceModel(PersistenceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationProperty(RelationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One To Many Relation Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One To Many Relation Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneToManyRelationProperty(OneToManyRelationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Many To One Relation Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Many To One Relation Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManyToOneRelationProperty(ManyToOneRelationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One To One Relation Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One To One Relation Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneToOneRelationProperty(OneToOneRelationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Many To Many Relation Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Many To Many Relation Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManyToManyRelationProperty(ManyToManyRelationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SnowSwitch
