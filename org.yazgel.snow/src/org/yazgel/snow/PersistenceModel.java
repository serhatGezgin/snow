/**
 */
package org.yazgel.snow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistence Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.snow.PersistenceModel#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.yazgel.snow.PersistenceModel#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link org.yazgel.snow.PersistenceModel#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.yazgel.snow.PersistenceModel#getOutputFolder <em>Output Folder</em>}</li>
 *   <li>{@link org.yazgel.snow.PersistenceModel#getJdbcDriver <em>Jdbc Driver</em>}</li>
 *   <li>{@link org.yazgel.snow.PersistenceModel#getJdbcUrl <em>Jdbc Url</em>}</li>
 *   <li>{@link org.yazgel.snow.PersistenceModel#getJdbcUser <em>Jdbc User</em>}</li>
 *   <li>{@link org.yazgel.snow.PersistenceModel#getJdbcPassword <em>Jdbc Password</em>}</li>
 *   <li>{@link org.yazgel.snow.PersistenceModel#getDbConnectorDependency <em>Db Connector Dependency</em>}</li>
 * </ul>
 *
 * @see org.yazgel.snow.SnowPackage#getPersistenceModel()
 * @model
 * @generated
 */
public interface PersistenceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see org.yazgel.snow.SnowPackage#getPersistenceModel_GroupId()
	 * @model
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link org.yazgel.snow.PersistenceModel#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Id</em>' attribute.
	 * @see #setArtifactId(String)
	 * @see org.yazgel.snow.SnowPackage#getPersistenceModel_ArtifactId()
	 * @model
	 * @generated
	 */
	String getArtifactId();

	/**
	 * Sets the value of the '{@link org.yazgel.snow.PersistenceModel#getArtifactId <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Id</em>' attribute.
	 * @see #getArtifactId()
	 * @generated
	 */
	void setArtifactId(String value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link org.yazgel.snow.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see org.yazgel.snow.SnowPackage#getPersistenceModel_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Output Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Folder</em>' attribute.
	 * @see #setOutputFolder(String)
	 * @see org.yazgel.snow.SnowPackage#getPersistenceModel_OutputFolder()
	 * @model
	 * @generated
	 */
	String getOutputFolder();

	/**
	 * Sets the value of the '{@link org.yazgel.snow.PersistenceModel#getOutputFolder <em>Output Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Folder</em>' attribute.
	 * @see #getOutputFolder()
	 * @generated
	 */
	void setOutputFolder(String value);

	/**
	 * Returns the value of the '<em><b>Jdbc Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc Driver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc Driver</em>' attribute.
	 * @see #setJdbcDriver(String)
	 * @see org.yazgel.snow.SnowPackage#getPersistenceModel_JdbcDriver()
	 * @model
	 * @generated
	 */
	String getJdbcDriver();

	/**
	 * Sets the value of the '{@link org.yazgel.snow.PersistenceModel#getJdbcDriver <em>Jdbc Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc Driver</em>' attribute.
	 * @see #getJdbcDriver()
	 * @generated
	 */
	void setJdbcDriver(String value);

	/**
	 * Returns the value of the '<em><b>Jdbc Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc Url</em>' attribute.
	 * @see #setJdbcUrl(String)
	 * @see org.yazgel.snow.SnowPackage#getPersistenceModel_JdbcUrl()
	 * @model
	 * @generated
	 */
	String getJdbcUrl();

	/**
	 * Sets the value of the '{@link org.yazgel.snow.PersistenceModel#getJdbcUrl <em>Jdbc Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc Url</em>' attribute.
	 * @see #getJdbcUrl()
	 * @generated
	 */
	void setJdbcUrl(String value);

	/**
	 * Returns the value of the '<em><b>Jdbc User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc User</em>' attribute.
	 * @see #setJdbcUser(String)
	 * @see org.yazgel.snow.SnowPackage#getPersistenceModel_JdbcUser()
	 * @model
	 * @generated
	 */
	String getJdbcUser();

	/**
	 * Sets the value of the '{@link org.yazgel.snow.PersistenceModel#getJdbcUser <em>Jdbc User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc User</em>' attribute.
	 * @see #getJdbcUser()
	 * @generated
	 */
	void setJdbcUser(String value);

	/**
	 * Returns the value of the '<em><b>Jdbc Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc Password</em>' attribute.
	 * @see #setJdbcPassword(String)
	 * @see org.yazgel.snow.SnowPackage#getPersistenceModel_JdbcPassword()
	 * @model
	 * @generated
	 */
	String getJdbcPassword();

	/**
	 * Sets the value of the '{@link org.yazgel.snow.PersistenceModel#getJdbcPassword <em>Jdbc Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc Password</em>' attribute.
	 * @see #getJdbcPassword()
	 * @generated
	 */
	void setJdbcPassword(String value);

	/**
	 * Returns the value of the '<em><b>Db Connector Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Connector Dependency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Connector Dependency</em>' attribute.
	 * @see #setDbConnectorDependency(String)
	 * @see org.yazgel.snow.SnowPackage#getPersistenceModel_DbConnectorDependency()
	 * @model
	 * @generated
	 */
	String getDbConnectorDependency();

	/**
	 * Sets the value of the '{@link org.yazgel.snow.PersistenceModel#getDbConnectorDependency <em>Db Connector Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Connector Dependency</em>' attribute.
	 * @see #getDbConnectorDependency()
	 * @generated
	 */
	void setDbConnectorDependency(String value);

} // PersistenceModel
