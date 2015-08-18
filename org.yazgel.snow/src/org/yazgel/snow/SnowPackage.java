/**
 */
package org.yazgel.snow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.yazgel.snow.SnowFactory
 * @model kind="package"
 * @generated
 */
public interface SnowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "snow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://yazgel.org/snow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "snow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SnowPackage eINSTANCE = org.yazgel.snow.impl.SnowPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.yazgel.snow.impl.PersistenceModelImpl <em>Persistence Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.snow.impl.PersistenceModelImpl
	 * @see org.yazgel.snow.impl.SnowPackageImpl#getPersistenceModel()
	 * @generated
	 */
	int PERSISTENCE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MODEL__GROUP_ID = 0;

	/**
	 * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MODEL__ARTIFACT_ID = 1;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MODEL__ENTITIES = 2;

	/**
	 * The feature id for the '<em><b>Output Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MODEL__OUTPUT_FOLDER = 3;

	/**
	 * The feature id for the '<em><b>Jdbc Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MODEL__JDBC_DRIVER = 4;

	/**
	 * The feature id for the '<em><b>Jdbc Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MODEL__JDBC_URL = 5;

	/**
	 * The feature id for the '<em><b>Jdbc User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MODEL__JDBC_USER = 6;

	/**
	 * The feature id for the '<em><b>Jdbc Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MODEL__JDBC_PASSWORD = 7;

	/**
	 * The feature id for the '<em><b>Db Connector Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MODEL__DB_CONNECTOR_DEPENDENCY = 8;

	/**
	 * The number of structural features of the '<em>Persistence Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MODEL_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Persistence Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yazgel.snow.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.snow.impl.EntityImpl
	 * @see org.yazgel.snow.impl.SnowPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__TABLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yazgel.snow.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.snow.impl.PropertyImpl
	 * @see org.yazgel.snow.impl.SnowPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yazgel.snow.impl.RelationPropertyImpl <em>Relation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.snow.impl.RelationPropertyImpl
	 * @see org.yazgel.snow.impl.SnowPackageImpl#getRelationProperty()
	 * @generated
	 */
	int RELATION_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_PROPERTY__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_PROPERTY__TYPE = PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_PROPERTY__CASCADE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_PROPERTY__FETCH = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.snow.impl.OneToManyRelationPropertyImpl <em>One To Many Relation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.snow.impl.OneToManyRelationPropertyImpl
	 * @see org.yazgel.snow.impl.SnowPackageImpl#getOneToManyRelationProperty()
	 * @generated
	 */
	int ONE_TO_MANY_RELATION_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_RELATION_PROPERTY__NAME = RELATION_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_RELATION_PROPERTY__TYPE = RELATION_PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_RELATION_PROPERTY__CASCADE = RELATION_PROPERTY__CASCADE;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_RELATION_PROPERTY__FETCH = RELATION_PROPERTY__FETCH;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_RELATION_PROPERTY__MAPPED_BY = RELATION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orphan Removal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_RELATION_PROPERTY__ORPHAN_REMOVAL = RELATION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>One To Many Relation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_RELATION_PROPERTY_FEATURE_COUNT = RELATION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>One To Many Relation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_RELATION_PROPERTY_OPERATION_COUNT = RELATION_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.snow.impl.ManyToOneRelationPropertyImpl <em>Many To One Relation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.snow.impl.ManyToOneRelationPropertyImpl
	 * @see org.yazgel.snow.impl.SnowPackageImpl#getManyToOneRelationProperty()
	 * @generated
	 */
	int MANY_TO_ONE_RELATION_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_RELATION_PROPERTY__NAME = RELATION_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_RELATION_PROPERTY__TYPE = RELATION_PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_RELATION_PROPERTY__CASCADE = RELATION_PROPERTY__CASCADE;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_RELATION_PROPERTY__FETCH = RELATION_PROPERTY__FETCH;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_RELATION_PROPERTY__OPTIONAL = RELATION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Many To One Relation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_RELATION_PROPERTY_FEATURE_COUNT = RELATION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Many To One Relation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_RELATION_PROPERTY_OPERATION_COUNT = RELATION_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.snow.impl.OneToOneRelationPropertyImpl <em>One To One Relation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.snow.impl.OneToOneRelationPropertyImpl
	 * @see org.yazgel.snow.impl.SnowPackageImpl#getOneToOneRelationProperty()
	 * @generated
	 */
	int ONE_TO_ONE_RELATION_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_RELATION_PROPERTY__NAME = RELATION_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_RELATION_PROPERTY__TYPE = RELATION_PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_RELATION_PROPERTY__CASCADE = RELATION_PROPERTY__CASCADE;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_RELATION_PROPERTY__FETCH = RELATION_PROPERTY__FETCH;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_RELATION_PROPERTY__OPTIONAL = RELATION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_RELATION_PROPERTY__MAPPED_BY = RELATION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orphan Removal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_RELATION_PROPERTY__ORPHAN_REMOVAL = RELATION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>One To One Relation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_RELATION_PROPERTY_FEATURE_COUNT = RELATION_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>One To One Relation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_RELATION_PROPERTY_OPERATION_COUNT = RELATION_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.snow.impl.ManyToManyRelationPropertyImpl <em>Many To Many Relation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.snow.impl.ManyToManyRelationPropertyImpl
	 * @see org.yazgel.snow.impl.SnowPackageImpl#getManyToManyRelationProperty()
	 * @generated
	 */
	int MANY_TO_MANY_RELATION_PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_RELATION_PROPERTY__NAME = RELATION_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_RELATION_PROPERTY__TYPE = RELATION_PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Cascade</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_RELATION_PROPERTY__CASCADE = RELATION_PROPERTY__CASCADE;

	/**
	 * The feature id for the '<em><b>Fetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_RELATION_PROPERTY__FETCH = RELATION_PROPERTY__FETCH;

	/**
	 * The feature id for the '<em><b>Mapped By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_RELATION_PROPERTY__MAPPED_BY = RELATION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Many To Many Relation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_RELATION_PROPERTY_FEATURE_COUNT = RELATION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Many To Many Relation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_RELATION_PROPERTY_OPERATION_COUNT = RELATION_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yazgel.snow.FetchType <em>Fetch Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.snow.FetchType
	 * @see org.yazgel.snow.impl.SnowPackageImpl#getFetchType()
	 * @generated
	 */
	int FETCH_TYPE = 8;

	/**
	 * The meta object id for the '{@link org.yazgel.snow.CascadeType <em>Cascade Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yazgel.snow.CascadeType
	 * @see org.yazgel.snow.impl.SnowPackageImpl#getCascadeType()
	 * @generated
	 */
	int CASCADE_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link org.yazgel.snow.PersistenceModel <em>Persistence Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Model</em>'.
	 * @see org.yazgel.snow.PersistenceModel
	 * @generated
	 */
	EClass getPersistenceModel();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.PersistenceModel#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.yazgel.snow.PersistenceModel#getGroupId()
	 * @see #getPersistenceModel()
	 * @generated
	 */
	EAttribute getPersistenceModel_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.PersistenceModel#getArtifactId <em>Artifact Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Id</em>'.
	 * @see org.yazgel.snow.PersistenceModel#getArtifactId()
	 * @see #getPersistenceModel()
	 * @generated
	 */
	EAttribute getPersistenceModel_ArtifactId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.snow.PersistenceModel#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see org.yazgel.snow.PersistenceModel#getEntities()
	 * @see #getPersistenceModel()
	 * @generated
	 */
	EReference getPersistenceModel_Entities();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.PersistenceModel#getOutputFolder <em>Output Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Folder</em>'.
	 * @see org.yazgel.snow.PersistenceModel#getOutputFolder()
	 * @see #getPersistenceModel()
	 * @generated
	 */
	EAttribute getPersistenceModel_OutputFolder();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.PersistenceModel#getJdbcDriver <em>Jdbc Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Driver</em>'.
	 * @see org.yazgel.snow.PersistenceModel#getJdbcDriver()
	 * @see #getPersistenceModel()
	 * @generated
	 */
	EAttribute getPersistenceModel_JdbcDriver();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.PersistenceModel#getJdbcUrl <em>Jdbc Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Url</em>'.
	 * @see org.yazgel.snow.PersistenceModel#getJdbcUrl()
	 * @see #getPersistenceModel()
	 * @generated
	 */
	EAttribute getPersistenceModel_JdbcUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.PersistenceModel#getJdbcUser <em>Jdbc User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc User</em>'.
	 * @see org.yazgel.snow.PersistenceModel#getJdbcUser()
	 * @see #getPersistenceModel()
	 * @generated
	 */
	EAttribute getPersistenceModel_JdbcUser();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.PersistenceModel#getJdbcPassword <em>Jdbc Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Password</em>'.
	 * @see org.yazgel.snow.PersistenceModel#getJdbcPassword()
	 * @see #getPersistenceModel()
	 * @generated
	 */
	EAttribute getPersistenceModel_JdbcPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.PersistenceModel#getDbConnectorDependency <em>Db Connector Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Connector Dependency</em>'.
	 * @see org.yazgel.snow.PersistenceModel#getDbConnectorDependency()
	 * @see #getPersistenceModel()
	 * @generated
	 */
	EAttribute getPersistenceModel_DbConnectorDependency();

	/**
	 * Returns the meta object for class '{@link org.yazgel.snow.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.yazgel.snow.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.yazgel.snow.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.Entity#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.yazgel.snow.Entity#getTableName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_TableName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yazgel.snow.Entity#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.yazgel.snow.Entity#getProperties()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Properties();

	/**
	 * Returns the meta object for class '{@link org.yazgel.snow.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.yazgel.snow.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.yazgel.snow.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.yazgel.snow.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for class '{@link org.yazgel.snow.RelationProperty <em>Relation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Property</em>'.
	 * @see org.yazgel.snow.RelationProperty
	 * @generated
	 */
	EClass getRelationProperty();

	/**
	 * Returns the meta object for the attribute list '{@link org.yazgel.snow.RelationProperty#getCascade <em>Cascade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cascade</em>'.
	 * @see org.yazgel.snow.RelationProperty#getCascade()
	 * @see #getRelationProperty()
	 * @generated
	 */
	EAttribute getRelationProperty_Cascade();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.RelationProperty#getFetch <em>Fetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch</em>'.
	 * @see org.yazgel.snow.RelationProperty#getFetch()
	 * @see #getRelationProperty()
	 * @generated
	 */
	EAttribute getRelationProperty_Fetch();

	/**
	 * Returns the meta object for class '{@link org.yazgel.snow.OneToManyRelationProperty <em>One To Many Relation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To Many Relation Property</em>'.
	 * @see org.yazgel.snow.OneToManyRelationProperty
	 * @generated
	 */
	EClass getOneToManyRelationProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.OneToManyRelationProperty#getMappedBy <em>Mapped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped By</em>'.
	 * @see org.yazgel.snow.OneToManyRelationProperty#getMappedBy()
	 * @see #getOneToManyRelationProperty()
	 * @generated
	 */
	EAttribute getOneToManyRelationProperty_MappedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.OneToManyRelationProperty#isOrphanRemoval <em>Orphan Removal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orphan Removal</em>'.
	 * @see org.yazgel.snow.OneToManyRelationProperty#isOrphanRemoval()
	 * @see #getOneToManyRelationProperty()
	 * @generated
	 */
	EAttribute getOneToManyRelationProperty_OrphanRemoval();

	/**
	 * Returns the meta object for class '{@link org.yazgel.snow.ManyToOneRelationProperty <em>Many To One Relation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To One Relation Property</em>'.
	 * @see org.yazgel.snow.ManyToOneRelationProperty
	 * @generated
	 */
	EClass getManyToOneRelationProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.ManyToOneRelationProperty#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.yazgel.snow.ManyToOneRelationProperty#isOptional()
	 * @see #getManyToOneRelationProperty()
	 * @generated
	 */
	EAttribute getManyToOneRelationProperty_Optional();

	/**
	 * Returns the meta object for class '{@link org.yazgel.snow.OneToOneRelationProperty <em>One To One Relation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To One Relation Property</em>'.
	 * @see org.yazgel.snow.OneToOneRelationProperty
	 * @generated
	 */
	EClass getOneToOneRelationProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.OneToOneRelationProperty#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.yazgel.snow.OneToOneRelationProperty#isOptional()
	 * @see #getOneToOneRelationProperty()
	 * @generated
	 */
	EAttribute getOneToOneRelationProperty_Optional();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.OneToOneRelationProperty#getMappedBy <em>Mapped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped By</em>'.
	 * @see org.yazgel.snow.OneToOneRelationProperty#getMappedBy()
	 * @see #getOneToOneRelationProperty()
	 * @generated
	 */
	EAttribute getOneToOneRelationProperty_MappedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.OneToOneRelationProperty#isOrphanRemoval <em>Orphan Removal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orphan Removal</em>'.
	 * @see org.yazgel.snow.OneToOneRelationProperty#isOrphanRemoval()
	 * @see #getOneToOneRelationProperty()
	 * @generated
	 */
	EAttribute getOneToOneRelationProperty_OrphanRemoval();

	/**
	 * Returns the meta object for class '{@link org.yazgel.snow.ManyToManyRelationProperty <em>Many To Many Relation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To Many Relation Property</em>'.
	 * @see org.yazgel.snow.ManyToManyRelationProperty
	 * @generated
	 */
	EClass getManyToManyRelationProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.yazgel.snow.ManyToManyRelationProperty#getMappedBy <em>Mapped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped By</em>'.
	 * @see org.yazgel.snow.ManyToManyRelationProperty#getMappedBy()
	 * @see #getManyToManyRelationProperty()
	 * @generated
	 */
	EAttribute getManyToManyRelationProperty_MappedBy();

	/**
	 * Returns the meta object for enum '{@link org.yazgel.snow.FetchType <em>Fetch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fetch Type</em>'.
	 * @see org.yazgel.snow.FetchType
	 * @generated
	 */
	EEnum getFetchType();

	/**
	 * Returns the meta object for enum '{@link org.yazgel.snow.CascadeType <em>Cascade Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cascade Type</em>'.
	 * @see org.yazgel.snow.CascadeType
	 * @generated
	 */
	EEnum getCascadeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SnowFactory getSnowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.yazgel.snow.impl.PersistenceModelImpl <em>Persistence Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.snow.impl.PersistenceModelImpl
		 * @see org.yazgel.snow.impl.SnowPackageImpl#getPersistenceModel()
		 * @generated
		 */
		EClass PERSISTENCE_MODEL = eINSTANCE.getPersistenceModel();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_MODEL__GROUP_ID = eINSTANCE.getPersistenceModel_GroupId();

		/**
		 * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_MODEL__ARTIFACT_ID = eINSTANCE.getPersistenceModel_ArtifactId();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE_MODEL__ENTITIES = eINSTANCE.getPersistenceModel_Entities();

		/**
		 * The meta object literal for the '<em><b>Output Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_MODEL__OUTPUT_FOLDER = eINSTANCE.getPersistenceModel_OutputFolder();

		/**
		 * The meta object literal for the '<em><b>Jdbc Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_MODEL__JDBC_DRIVER = eINSTANCE.getPersistenceModel_JdbcDriver();

		/**
		 * The meta object literal for the '<em><b>Jdbc Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_MODEL__JDBC_URL = eINSTANCE.getPersistenceModel_JdbcUrl();

		/**
		 * The meta object literal for the '<em><b>Jdbc User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_MODEL__JDBC_USER = eINSTANCE.getPersistenceModel_JdbcUser();

		/**
		 * The meta object literal for the '<em><b>Jdbc Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_MODEL__JDBC_PASSWORD = eINSTANCE.getPersistenceModel_JdbcPassword();

		/**
		 * The meta object literal for the '<em><b>Db Connector Dependency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_MODEL__DB_CONNECTOR_DEPENDENCY = eINSTANCE.getPersistenceModel_DbConnectorDependency();

		/**
		 * The meta object literal for the '{@link org.yazgel.snow.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.snow.impl.EntityImpl
		 * @see org.yazgel.snow.impl.SnowPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__TABLE_NAME = eINSTANCE.getEntity_TableName();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__PROPERTIES = eINSTANCE.getEntity_Properties();

		/**
		 * The meta object literal for the '{@link org.yazgel.snow.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.snow.impl.PropertyImpl
		 * @see org.yazgel.snow.impl.SnowPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '{@link org.yazgel.snow.impl.RelationPropertyImpl <em>Relation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.snow.impl.RelationPropertyImpl
		 * @see org.yazgel.snow.impl.SnowPackageImpl#getRelationProperty()
		 * @generated
		 */
		EClass RELATION_PROPERTY = eINSTANCE.getRelationProperty();

		/**
		 * The meta object literal for the '<em><b>Cascade</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_PROPERTY__CASCADE = eINSTANCE.getRelationProperty_Cascade();

		/**
		 * The meta object literal for the '<em><b>Fetch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_PROPERTY__FETCH = eINSTANCE.getRelationProperty_Fetch();

		/**
		 * The meta object literal for the '{@link org.yazgel.snow.impl.OneToManyRelationPropertyImpl <em>One To Many Relation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.snow.impl.OneToManyRelationPropertyImpl
		 * @see org.yazgel.snow.impl.SnowPackageImpl#getOneToManyRelationProperty()
		 * @generated
		 */
		EClass ONE_TO_MANY_RELATION_PROPERTY = eINSTANCE.getOneToManyRelationProperty();

		/**
		 * The meta object literal for the '<em><b>Mapped By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_TO_MANY_RELATION_PROPERTY__MAPPED_BY = eINSTANCE.getOneToManyRelationProperty_MappedBy();

		/**
		 * The meta object literal for the '<em><b>Orphan Removal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_TO_MANY_RELATION_PROPERTY__ORPHAN_REMOVAL = eINSTANCE.getOneToManyRelationProperty_OrphanRemoval();

		/**
		 * The meta object literal for the '{@link org.yazgel.snow.impl.ManyToOneRelationPropertyImpl <em>Many To One Relation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.snow.impl.ManyToOneRelationPropertyImpl
		 * @see org.yazgel.snow.impl.SnowPackageImpl#getManyToOneRelationProperty()
		 * @generated
		 */
		EClass MANY_TO_ONE_RELATION_PROPERTY = eINSTANCE.getManyToOneRelationProperty();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TO_ONE_RELATION_PROPERTY__OPTIONAL = eINSTANCE.getManyToOneRelationProperty_Optional();

		/**
		 * The meta object literal for the '{@link org.yazgel.snow.impl.OneToOneRelationPropertyImpl <em>One To One Relation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.snow.impl.OneToOneRelationPropertyImpl
		 * @see org.yazgel.snow.impl.SnowPackageImpl#getOneToOneRelationProperty()
		 * @generated
		 */
		EClass ONE_TO_ONE_RELATION_PROPERTY = eINSTANCE.getOneToOneRelationProperty();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_TO_ONE_RELATION_PROPERTY__OPTIONAL = eINSTANCE.getOneToOneRelationProperty_Optional();

		/**
		 * The meta object literal for the '<em><b>Mapped By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_TO_ONE_RELATION_PROPERTY__MAPPED_BY = eINSTANCE.getOneToOneRelationProperty_MappedBy();

		/**
		 * The meta object literal for the '<em><b>Orphan Removal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_TO_ONE_RELATION_PROPERTY__ORPHAN_REMOVAL = eINSTANCE.getOneToOneRelationProperty_OrphanRemoval();

		/**
		 * The meta object literal for the '{@link org.yazgel.snow.impl.ManyToManyRelationPropertyImpl <em>Many To Many Relation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.snow.impl.ManyToManyRelationPropertyImpl
		 * @see org.yazgel.snow.impl.SnowPackageImpl#getManyToManyRelationProperty()
		 * @generated
		 */
		EClass MANY_TO_MANY_RELATION_PROPERTY = eINSTANCE.getManyToManyRelationProperty();

		/**
		 * The meta object literal for the '<em><b>Mapped By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TO_MANY_RELATION_PROPERTY__MAPPED_BY = eINSTANCE.getManyToManyRelationProperty_MappedBy();

		/**
		 * The meta object literal for the '{@link org.yazgel.snow.FetchType <em>Fetch Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.snow.FetchType
		 * @see org.yazgel.snow.impl.SnowPackageImpl#getFetchType()
		 * @generated
		 */
		EEnum FETCH_TYPE = eINSTANCE.getFetchType();

		/**
		 * The meta object literal for the '{@link org.yazgel.snow.CascadeType <em>Cascade Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yazgel.snow.CascadeType
		 * @see org.yazgel.snow.impl.SnowPackageImpl#getCascadeType()
		 * @generated
		 */
		EEnum CASCADE_TYPE = eINSTANCE.getCascadeType();

	}

} //SnowPackage
