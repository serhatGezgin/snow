/**
 */
package org.yazgel.snow.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yazgel.snow.CascadeType;
import org.yazgel.snow.Entity;
import org.yazgel.snow.FetchType;
import org.yazgel.snow.ManyToManyRelationProperty;
import org.yazgel.snow.ManyToOneRelationProperty;
import org.yazgel.snow.OneToManyRelationProperty;
import org.yazgel.snow.OneToOneRelationProperty;
import org.yazgel.snow.PersistenceModel;
import org.yazgel.snow.Property;
import org.yazgel.snow.RelationProperty;
import org.yazgel.snow.SnowFactory;
import org.yazgel.snow.SnowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SnowPackageImpl extends EPackageImpl implements SnowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneToManyRelationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manyToOneRelationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneToOneRelationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manyToManyRelationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fetchTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cascadeTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.yazgel.snow.SnowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SnowPackageImpl() {
		super(eNS_URI, SnowFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SnowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SnowPackage init() {
		if (isInited) return (SnowPackage)EPackage.Registry.INSTANCE.getEPackage(SnowPackage.eNS_URI);

		// Obtain or create and register package
		SnowPackageImpl theSnowPackage = (SnowPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SnowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SnowPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSnowPackage.createPackageContents();

		// Initialize created meta-data
		theSnowPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSnowPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SnowPackage.eNS_URI, theSnowPackage);
		return theSnowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceModel() {
		return persistenceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceModel_GroupId() {
		return (EAttribute)persistenceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceModel_ArtifactId() {
		return (EAttribute)persistenceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceModel_Entities() {
		return (EReference)persistenceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceModel_OutputFolder() {
		return (EAttribute)persistenceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceModel_JdbcDriver() {
		return (EAttribute)persistenceModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceModel_JdbcUrl() {
		return (EAttribute)persistenceModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceModel_JdbcUser() {
		return (EAttribute)persistenceModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceModel_JdbcPassword() {
		return (EAttribute)persistenceModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceModel_DbConnectorDependency() {
		return (EAttribute)persistenceModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Name() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_TableName() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Properties() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Type() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationProperty() {
		return relationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationProperty_Cascade() {
		return (EAttribute)relationPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationProperty_Fetch() {
		return (EAttribute)relationPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneToManyRelationProperty() {
		return oneToManyRelationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToManyRelationProperty_MappedBy() {
		return (EAttribute)oneToManyRelationPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToManyRelationProperty_OrphanRemoval() {
		return (EAttribute)oneToManyRelationPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManyToOneRelationProperty() {
		return manyToOneRelationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToOneRelationProperty_Optional() {
		return (EAttribute)manyToOneRelationPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneToOneRelationProperty() {
		return oneToOneRelationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOneRelationProperty_Optional() {
		return (EAttribute)oneToOneRelationPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOneRelationProperty_MappedBy() {
		return (EAttribute)oneToOneRelationPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneToOneRelationProperty_OrphanRemoval() {
		return (EAttribute)oneToOneRelationPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManyToManyRelationProperty() {
		return manyToManyRelationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManyToManyRelationProperty_MappedBy() {
		return (EAttribute)manyToManyRelationPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFetchType() {
		return fetchTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCascadeType() {
		return cascadeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnowFactory getSnowFactory() {
		return (SnowFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		persistenceModelEClass = createEClass(PERSISTENCE_MODEL);
		createEAttribute(persistenceModelEClass, PERSISTENCE_MODEL__GROUP_ID);
		createEAttribute(persistenceModelEClass, PERSISTENCE_MODEL__ARTIFACT_ID);
		createEReference(persistenceModelEClass, PERSISTENCE_MODEL__ENTITIES);
		createEAttribute(persistenceModelEClass, PERSISTENCE_MODEL__OUTPUT_FOLDER);
		createEAttribute(persistenceModelEClass, PERSISTENCE_MODEL__JDBC_DRIVER);
		createEAttribute(persistenceModelEClass, PERSISTENCE_MODEL__JDBC_URL);
		createEAttribute(persistenceModelEClass, PERSISTENCE_MODEL__JDBC_USER);
		createEAttribute(persistenceModelEClass, PERSISTENCE_MODEL__JDBC_PASSWORD);
		createEAttribute(persistenceModelEClass, PERSISTENCE_MODEL__DB_CONNECTOR_DEPENDENCY);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__NAME);
		createEAttribute(entityEClass, ENTITY__TABLE_NAME);
		createEReference(entityEClass, ENTITY__PROPERTIES);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__TYPE);

		relationPropertyEClass = createEClass(RELATION_PROPERTY);
		createEAttribute(relationPropertyEClass, RELATION_PROPERTY__CASCADE);
		createEAttribute(relationPropertyEClass, RELATION_PROPERTY__FETCH);

		oneToManyRelationPropertyEClass = createEClass(ONE_TO_MANY_RELATION_PROPERTY);
		createEAttribute(oneToManyRelationPropertyEClass, ONE_TO_MANY_RELATION_PROPERTY__MAPPED_BY);
		createEAttribute(oneToManyRelationPropertyEClass, ONE_TO_MANY_RELATION_PROPERTY__ORPHAN_REMOVAL);

		manyToOneRelationPropertyEClass = createEClass(MANY_TO_ONE_RELATION_PROPERTY);
		createEAttribute(manyToOneRelationPropertyEClass, MANY_TO_ONE_RELATION_PROPERTY__OPTIONAL);

		oneToOneRelationPropertyEClass = createEClass(ONE_TO_ONE_RELATION_PROPERTY);
		createEAttribute(oneToOneRelationPropertyEClass, ONE_TO_ONE_RELATION_PROPERTY__OPTIONAL);
		createEAttribute(oneToOneRelationPropertyEClass, ONE_TO_ONE_RELATION_PROPERTY__MAPPED_BY);
		createEAttribute(oneToOneRelationPropertyEClass, ONE_TO_ONE_RELATION_PROPERTY__ORPHAN_REMOVAL);

		manyToManyRelationPropertyEClass = createEClass(MANY_TO_MANY_RELATION_PROPERTY);
		createEAttribute(manyToManyRelationPropertyEClass, MANY_TO_MANY_RELATION_PROPERTY__MAPPED_BY);

		// Create enums
		fetchTypeEEnum = createEEnum(FETCH_TYPE);
		cascadeTypeEEnum = createEEnum(CASCADE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		relationPropertyEClass.getESuperTypes().add(this.getProperty());
		oneToManyRelationPropertyEClass.getESuperTypes().add(this.getRelationProperty());
		manyToOneRelationPropertyEClass.getESuperTypes().add(this.getRelationProperty());
		oneToOneRelationPropertyEClass.getESuperTypes().add(this.getRelationProperty());
		manyToManyRelationPropertyEClass.getESuperTypes().add(this.getRelationProperty());

		// Initialize classes, features, and operations; add parameters
		initEClass(persistenceModelEClass, PersistenceModel.class, "PersistenceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistenceModel_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, PersistenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceModel_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 0, 1, PersistenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersistenceModel_Entities(), this.getEntity(), null, "entities", null, 0, -1, PersistenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceModel_OutputFolder(), ecorePackage.getEString(), "outputFolder", null, 0, 1, PersistenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceModel_JdbcDriver(), ecorePackage.getEString(), "jdbcDriver", null, 0, 1, PersistenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceModel_JdbcUrl(), ecorePackage.getEString(), "jdbcUrl", null, 0, 1, PersistenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceModel_JdbcUser(), ecorePackage.getEString(), "jdbcUser", null, 0, 1, PersistenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceModel_JdbcPassword(), ecorePackage.getEString(), "jdbcPassword", null, 0, 1, PersistenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceModel_DbConnectorDependency(), ecorePackage.getEString(), "dbConnectorDependency", null, 0, 1, PersistenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Properties(), this.getProperty(), null, "properties", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Type(), ecorePackage.getEString(), "type", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationPropertyEClass, RelationProperty.class, "RelationProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationProperty_Cascade(), this.getCascadeType(), "cascade", null, 0, -1, RelationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationProperty_Fetch(), this.getFetchType(), "fetch", null, 0, 1, RelationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneToManyRelationPropertyEClass, OneToManyRelationProperty.class, "OneToManyRelationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOneToManyRelationProperty_MappedBy(), ecorePackage.getEString(), "mappedBy", null, 0, 1, OneToManyRelationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToManyRelationProperty_OrphanRemoval(), ecorePackage.getEBoolean(), "orphanRemoval", null, 0, 1, OneToManyRelationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manyToOneRelationPropertyEClass, ManyToOneRelationProperty.class, "ManyToOneRelationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManyToOneRelationProperty_Optional(), ecorePackage.getEBoolean(), "optional", "true", 0, 1, ManyToOneRelationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneToOneRelationPropertyEClass, OneToOneRelationProperty.class, "OneToOneRelationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOneToOneRelationProperty_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, OneToOneRelationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToOneRelationProperty_MappedBy(), ecorePackage.getEString(), "mappedBy", null, 0, 1, OneToOneRelationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneToOneRelationProperty_OrphanRemoval(), ecorePackage.getEBoolean(), "orphanRemoval", null, 0, 1, OneToOneRelationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manyToManyRelationPropertyEClass, ManyToManyRelationProperty.class, "ManyToManyRelationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManyToManyRelationProperty_MappedBy(), ecorePackage.getEString(), "mappedBy", null, 0, 1, ManyToManyRelationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fetchTypeEEnum, FetchType.class, "FetchType");
		addEEnumLiteral(fetchTypeEEnum, FetchType.EAGER);
		addEEnumLiteral(fetchTypeEEnum, FetchType.LAZY);

		initEEnum(cascadeTypeEEnum, CascadeType.class, "CascadeType");
		addEEnumLiteral(cascadeTypeEEnum, CascadeType.ALL);
		addEEnumLiteral(cascadeTypeEEnum, CascadeType.DETACH);
		addEEnumLiteral(cascadeTypeEEnum, CascadeType.MERGE);
		addEEnumLiteral(cascadeTypeEEnum, CascadeType.PERSIST);
		addEEnumLiteral(cascadeTypeEEnum, CascadeType.REFRESH);
		addEEnumLiteral(cascadeTypeEEnum, CascadeType.REMOVE);

		// Create resource
		createResource(eNS_URI);
	}

} //SnowPackageImpl
