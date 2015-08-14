/**
 */
package org.yazgel.snow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.yazgel.snow.Entity;
import org.yazgel.snow.PersistenceModel;
import org.yazgel.snow.SnowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistence Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.snow.impl.PersistenceModelImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.yazgel.snow.impl.PersistenceModelImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link org.yazgel.snow.impl.PersistenceModelImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.yazgel.snow.impl.PersistenceModelImpl#getOutputFolder <em>Output Folder</em>}</li>
 *   <li>{@link org.yazgel.snow.impl.PersistenceModelImpl#getJdbcDriver <em>Jdbc Driver</em>}</li>
 *   <li>{@link org.yazgel.snow.impl.PersistenceModelImpl#getJdbcUrl <em>Jdbc Url</em>}</li>
 *   <li>{@link org.yazgel.snow.impl.PersistenceModelImpl#getJdbcUser <em>Jdbc User</em>}</li>
 *   <li>{@link org.yazgel.snow.impl.PersistenceModelImpl#getJdbcPassword <em>Jdbc Password</em>}</li>
 *   <li>{@link org.yazgel.snow.impl.PersistenceModelImpl#getDbConnectorDependency <em>Db Connector Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersistenceModelImpl extends MinimalEObjectImpl.Container implements PersistenceModel {
	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactId()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactId()
	 * @generated
	 * @ordered
	 */
	protected String artifactId = ARTIFACT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The default value of the '{@link #getOutputFolder() <em>Output Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputFolder() <em>Output Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFolder()
	 * @generated
	 * @ordered
	 */
	protected String outputFolder = OUTPUT_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getJdbcDriver() <em>Jdbc Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcDriver()
	 * @generated
	 * @ordered
	 */
	protected static final String JDBC_DRIVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJdbcDriver() <em>Jdbc Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcDriver()
	 * @generated
	 * @ordered
	 */
	protected String jdbcDriver = JDBC_DRIVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getJdbcUrl() <em>Jdbc Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String JDBC_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJdbcUrl() <em>Jdbc Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUrl()
	 * @generated
	 * @ordered
	 */
	protected String jdbcUrl = JDBC_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getJdbcUser() <em>Jdbc User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUser()
	 * @generated
	 * @ordered
	 */
	protected static final String JDBC_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJdbcUser() <em>Jdbc User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUser()
	 * @generated
	 * @ordered
	 */
	protected String jdbcUser = JDBC_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getJdbcPassword() <em>Jdbc Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String JDBC_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJdbcPassword() <em>Jdbc Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcPassword()
	 * @generated
	 * @ordered
	 */
	protected String jdbcPassword = JDBC_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbConnectorDependency() <em>Db Connector Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbConnectorDependency()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_CONNECTOR_DEPENDENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbConnectorDependency() <em>Db Connector Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbConnectorDependency()
	 * @generated
	 * @ordered
	 */
	protected String dbConnectorDependency = DB_CONNECTOR_DEPENDENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SnowPackage.Literals.PERSISTENCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnowPackage.PERSISTENCE_MODEL__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtifactId() {
		return artifactId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactId(String newArtifactId) {
		String oldArtifactId = artifactId;
		artifactId = newArtifactId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnowPackage.PERSISTENCE_MODEL__ARTIFACT_ID, oldArtifactId, artifactId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, SnowPackage.PERSISTENCE_MODEL__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputFolder() {
		return outputFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputFolder(String newOutputFolder) {
		String oldOutputFolder = outputFolder;
		outputFolder = newOutputFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnowPackage.PERSISTENCE_MODEL__OUTPUT_FOLDER, oldOutputFolder, outputFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJdbcDriver() {
		return jdbcDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJdbcDriver(String newJdbcDriver) {
		String oldJdbcDriver = jdbcDriver;
		jdbcDriver = newJdbcDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnowPackage.PERSISTENCE_MODEL__JDBC_DRIVER, oldJdbcDriver, jdbcDriver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJdbcUrl() {
		return jdbcUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJdbcUrl(String newJdbcUrl) {
		String oldJdbcUrl = jdbcUrl;
		jdbcUrl = newJdbcUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnowPackage.PERSISTENCE_MODEL__JDBC_URL, oldJdbcUrl, jdbcUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJdbcUser() {
		return jdbcUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJdbcUser(String newJdbcUser) {
		String oldJdbcUser = jdbcUser;
		jdbcUser = newJdbcUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnowPackage.PERSISTENCE_MODEL__JDBC_USER, oldJdbcUser, jdbcUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJdbcPassword() {
		return jdbcPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJdbcPassword(String newJdbcPassword) {
		String oldJdbcPassword = jdbcPassword;
		jdbcPassword = newJdbcPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnowPackage.PERSISTENCE_MODEL__JDBC_PASSWORD, oldJdbcPassword, jdbcPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbConnectorDependency() {
		return dbConnectorDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbConnectorDependency(String newDbConnectorDependency) {
		String oldDbConnectorDependency = dbConnectorDependency;
		dbConnectorDependency = newDbConnectorDependency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SnowPackage.PERSISTENCE_MODEL__DB_CONNECTOR_DEPENDENCY, oldDbConnectorDependency, dbConnectorDependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SnowPackage.PERSISTENCE_MODEL__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SnowPackage.PERSISTENCE_MODEL__GROUP_ID:
				return getGroupId();
			case SnowPackage.PERSISTENCE_MODEL__ARTIFACT_ID:
				return getArtifactId();
			case SnowPackage.PERSISTENCE_MODEL__ENTITIES:
				return getEntities();
			case SnowPackage.PERSISTENCE_MODEL__OUTPUT_FOLDER:
				return getOutputFolder();
			case SnowPackage.PERSISTENCE_MODEL__JDBC_DRIVER:
				return getJdbcDriver();
			case SnowPackage.PERSISTENCE_MODEL__JDBC_URL:
				return getJdbcUrl();
			case SnowPackage.PERSISTENCE_MODEL__JDBC_USER:
				return getJdbcUser();
			case SnowPackage.PERSISTENCE_MODEL__JDBC_PASSWORD:
				return getJdbcPassword();
			case SnowPackage.PERSISTENCE_MODEL__DB_CONNECTOR_DEPENDENCY:
				return getDbConnectorDependency();
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
			case SnowPackage.PERSISTENCE_MODEL__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case SnowPackage.PERSISTENCE_MODEL__ARTIFACT_ID:
				setArtifactId((String)newValue);
				return;
			case SnowPackage.PERSISTENCE_MODEL__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case SnowPackage.PERSISTENCE_MODEL__OUTPUT_FOLDER:
				setOutputFolder((String)newValue);
				return;
			case SnowPackage.PERSISTENCE_MODEL__JDBC_DRIVER:
				setJdbcDriver((String)newValue);
				return;
			case SnowPackage.PERSISTENCE_MODEL__JDBC_URL:
				setJdbcUrl((String)newValue);
				return;
			case SnowPackage.PERSISTENCE_MODEL__JDBC_USER:
				setJdbcUser((String)newValue);
				return;
			case SnowPackage.PERSISTENCE_MODEL__JDBC_PASSWORD:
				setJdbcPassword((String)newValue);
				return;
			case SnowPackage.PERSISTENCE_MODEL__DB_CONNECTOR_DEPENDENCY:
				setDbConnectorDependency((String)newValue);
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
			case SnowPackage.PERSISTENCE_MODEL__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case SnowPackage.PERSISTENCE_MODEL__ARTIFACT_ID:
				setArtifactId(ARTIFACT_ID_EDEFAULT);
				return;
			case SnowPackage.PERSISTENCE_MODEL__ENTITIES:
				getEntities().clear();
				return;
			case SnowPackage.PERSISTENCE_MODEL__OUTPUT_FOLDER:
				setOutputFolder(OUTPUT_FOLDER_EDEFAULT);
				return;
			case SnowPackage.PERSISTENCE_MODEL__JDBC_DRIVER:
				setJdbcDriver(JDBC_DRIVER_EDEFAULT);
				return;
			case SnowPackage.PERSISTENCE_MODEL__JDBC_URL:
				setJdbcUrl(JDBC_URL_EDEFAULT);
				return;
			case SnowPackage.PERSISTENCE_MODEL__JDBC_USER:
				setJdbcUser(JDBC_USER_EDEFAULT);
				return;
			case SnowPackage.PERSISTENCE_MODEL__JDBC_PASSWORD:
				setJdbcPassword(JDBC_PASSWORD_EDEFAULT);
				return;
			case SnowPackage.PERSISTENCE_MODEL__DB_CONNECTOR_DEPENDENCY:
				setDbConnectorDependency(DB_CONNECTOR_DEPENDENCY_EDEFAULT);
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
			case SnowPackage.PERSISTENCE_MODEL__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case SnowPackage.PERSISTENCE_MODEL__ARTIFACT_ID:
				return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
			case SnowPackage.PERSISTENCE_MODEL__ENTITIES:
				return entities != null && !entities.isEmpty();
			case SnowPackage.PERSISTENCE_MODEL__OUTPUT_FOLDER:
				return OUTPUT_FOLDER_EDEFAULT == null ? outputFolder != null : !OUTPUT_FOLDER_EDEFAULT.equals(outputFolder);
			case SnowPackage.PERSISTENCE_MODEL__JDBC_DRIVER:
				return JDBC_DRIVER_EDEFAULT == null ? jdbcDriver != null : !JDBC_DRIVER_EDEFAULT.equals(jdbcDriver);
			case SnowPackage.PERSISTENCE_MODEL__JDBC_URL:
				return JDBC_URL_EDEFAULT == null ? jdbcUrl != null : !JDBC_URL_EDEFAULT.equals(jdbcUrl);
			case SnowPackage.PERSISTENCE_MODEL__JDBC_USER:
				return JDBC_USER_EDEFAULT == null ? jdbcUser != null : !JDBC_USER_EDEFAULT.equals(jdbcUser);
			case SnowPackage.PERSISTENCE_MODEL__JDBC_PASSWORD:
				return JDBC_PASSWORD_EDEFAULT == null ? jdbcPassword != null : !JDBC_PASSWORD_EDEFAULT.equals(jdbcPassword);
			case SnowPackage.PERSISTENCE_MODEL__DB_CONNECTOR_DEPENDENCY:
				return DB_CONNECTOR_DEPENDENCY_EDEFAULT == null ? dbConnectorDependency != null : !DB_CONNECTOR_DEPENDENCY_EDEFAULT.equals(dbConnectorDependency);
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
		result.append(" (groupId: ");
		result.append(groupId);
		result.append(", artifactId: ");
		result.append(artifactId);
		result.append(", outputFolder: ");
		result.append(outputFolder);
		result.append(", jdbcDriver: ");
		result.append(jdbcDriver);
		result.append(", jdbcUrl: ");
		result.append(jdbcUrl);
		result.append(", jdbcUser: ");
		result.append(jdbcUser);
		result.append(", jdbcPassword: ");
		result.append(jdbcPassword);
		result.append(", dbConnectorDependency: ");
		result.append(dbConnectorDependency);
		result.append(')');
		return result.toString();
	}

} //PersistenceModelImpl
