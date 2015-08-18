/**
 */
package org.yazgel.snow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.yazgel.snow.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SnowFactoryImpl extends EFactoryImpl implements SnowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SnowFactory init() {
		try {
			SnowFactory theSnowFactory = (SnowFactory)EPackage.Registry.INSTANCE.getEFactory(SnowPackage.eNS_URI);
			if (theSnowFactory != null) {
				return theSnowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SnowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SnowPackage.PERSISTENCE_MODEL: return createPersistenceModel();
			case SnowPackage.ENTITY: return createEntity();
			case SnowPackage.PROPERTY: return createProperty();
			case SnowPackage.ONE_TO_MANY_RELATION_PROPERTY: return createOneToManyRelationProperty();
			case SnowPackage.MANY_TO_ONE_RELATION_PROPERTY: return createManyToOneRelationProperty();
			case SnowPackage.ONE_TO_ONE_RELATION_PROPERTY: return createOneToOneRelationProperty();
			case SnowPackage.MANY_TO_MANY_RELATION_PROPERTY: return createManyToManyRelationProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SnowPackage.FETCH_TYPE:
				return createFetchTypeFromString(eDataType, initialValue);
			case SnowPackage.CASCADE_TYPE:
				return createCascadeTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SnowPackage.FETCH_TYPE:
				return convertFetchTypeToString(eDataType, instanceValue);
			case SnowPackage.CASCADE_TYPE:
				return convertCascadeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceModel createPersistenceModel() {
		PersistenceModelImpl persistenceModel = new PersistenceModelImpl();
		return persistenceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneToManyRelationProperty createOneToManyRelationProperty() {
		OneToManyRelationPropertyImpl oneToManyRelationProperty = new OneToManyRelationPropertyImpl();
		return oneToManyRelationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyToOneRelationProperty createManyToOneRelationProperty() {
		ManyToOneRelationPropertyImpl manyToOneRelationProperty = new ManyToOneRelationPropertyImpl();
		return manyToOneRelationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneToOneRelationProperty createOneToOneRelationProperty() {
		OneToOneRelationPropertyImpl oneToOneRelationProperty = new OneToOneRelationPropertyImpl();
		return oneToOneRelationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyToManyRelationProperty createManyToManyRelationProperty() {
		ManyToManyRelationPropertyImpl manyToManyRelationProperty = new ManyToManyRelationPropertyImpl();
		return manyToManyRelationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetchType createFetchTypeFromString(EDataType eDataType, String initialValue) {
		FetchType result = FetchType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFetchTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CascadeType createCascadeTypeFromString(EDataType eDataType, String initialValue) {
		CascadeType result = CascadeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCascadeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnowPackage getSnowPackage() {
		return (SnowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SnowPackage getPackage() {
		return SnowPackage.eINSTANCE;
	}

} //SnowFactoryImpl
