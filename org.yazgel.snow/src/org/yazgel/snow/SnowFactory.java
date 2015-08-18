/**
 */
package org.yazgel.snow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.yazgel.snow.SnowPackage
 * @generated
 */
public interface SnowFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SnowFactory eINSTANCE = org.yazgel.snow.impl.SnowFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Persistence Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persistence Model</em>'.
	 * @generated
	 */
	PersistenceModel createPersistenceModel();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>One To Many Relation Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One To Many Relation Property</em>'.
	 * @generated
	 */
	OneToManyRelationProperty createOneToManyRelationProperty();

	/**
	 * Returns a new object of class '<em>Many To One Relation Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Many To One Relation Property</em>'.
	 * @generated
	 */
	ManyToOneRelationProperty createManyToOneRelationProperty();

	/**
	 * Returns a new object of class '<em>One To One Relation Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One To One Relation Property</em>'.
	 * @generated
	 */
	OneToOneRelationProperty createOneToOneRelationProperty();

	/**
	 * Returns a new object of class '<em>Many To Many Relation Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Many To Many Relation Property</em>'.
	 * @generated
	 */
	ManyToManyRelationProperty createManyToManyRelationProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SnowPackage getSnowPackage();

} //SnowFactory
