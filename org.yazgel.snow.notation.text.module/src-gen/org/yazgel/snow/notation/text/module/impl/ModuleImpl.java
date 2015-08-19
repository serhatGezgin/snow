/**
 */
package org.yazgel.snow.notation.text.module.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.yazgel.snow.notation.text.module.DBConnectorDependency;
import org.yazgel.snow.notation.text.module.Jdbc;
import org.yazgel.snow.notation.text.module.Module;
import org.yazgel.snow.notation.text.module.ModulePackage;

import org.yazgel.snow.notation.text.snow.DomainModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yazgel.snow.notation.text.module.impl.ModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.impl.ModuleImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.impl.ModuleImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.impl.ModuleImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.impl.ModuleImpl#getJdbc <em>Jdbc</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.impl.ModuleImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.impl.ModuleImpl#getDomainModel <em>Domain Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements Module
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getJdbc() <em>Jdbc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJdbc()
   * @generated
   * @ordered
   */
  protected Jdbc jdbc;

  /**
   * The cached value of the '{@link #getConnector() <em>Connector</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnector()
   * @generated
   * @ordered
   */
  protected DBConnectorDependency connector;

  /**
   * The cached value of the '{@link #getDomainModel() <em>Domain Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainModel()
   * @generated
   * @ordered
   */
  protected DomainModel domainModel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleImpl()
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
    return ModulePackage.Literals.MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGroupId()
  {
    return groupId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupId(String newGroupId)
  {
    String oldGroupId = groupId;
    groupId = newGroupId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODULE__GROUP_ID, oldGroupId, groupId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArtifactId()
  {
    return artifactId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtifactId(String newArtifactId)
  {
    String oldArtifactId = artifactId;
    artifactId = newArtifactId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODULE__ARTIFACT_ID, oldArtifactId, artifactId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODULE__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jdbc getJdbc()
  {
    if (jdbc != null && jdbc.eIsProxy())
    {
      InternalEObject oldJdbc = (InternalEObject)jdbc;
      jdbc = (Jdbc)eResolveProxy(oldJdbc);
      if (jdbc != oldJdbc)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.MODULE__JDBC, oldJdbc, jdbc));
      }
    }
    return jdbc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jdbc basicGetJdbc()
  {
    return jdbc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJdbc(Jdbc newJdbc)
  {
    Jdbc oldJdbc = jdbc;
    jdbc = newJdbc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODULE__JDBC, oldJdbc, jdbc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DBConnectorDependency getConnector()
  {
    if (connector != null && connector.eIsProxy())
    {
      InternalEObject oldConnector = (InternalEObject)connector;
      connector = (DBConnectorDependency)eResolveProxy(oldConnector);
      if (connector != oldConnector)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.MODULE__CONNECTOR, oldConnector, connector));
      }
    }
    return connector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DBConnectorDependency basicGetConnector()
  {
    return connector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConnector(DBConnectorDependency newConnector)
  {
    DBConnectorDependency oldConnector = connector;
    connector = newConnector;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODULE__CONNECTOR, oldConnector, connector));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModel getDomainModel()
  {
    if (domainModel != null && domainModel.eIsProxy())
    {
      InternalEObject oldDomainModel = (InternalEObject)domainModel;
      domainModel = (DomainModel)eResolveProxy(oldDomainModel);
      if (domainModel != oldDomainModel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.MODULE__DOMAIN_MODEL, oldDomainModel, domainModel));
      }
    }
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModel basicGetDomainModel()
  {
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomainModel(DomainModel newDomainModel)
  {
    DomainModel oldDomainModel = domainModel;
    domainModel = newDomainModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.MODULE__DOMAIN_MODEL, oldDomainModel, domainModel));
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
      case ModulePackage.MODULE__NAME:
        return getName();
      case ModulePackage.MODULE__GROUP_ID:
        return getGroupId();
      case ModulePackage.MODULE__ARTIFACT_ID:
        return getArtifactId();
      case ModulePackage.MODULE__VERSION:
        return getVersion();
      case ModulePackage.MODULE__JDBC:
        if (resolve) return getJdbc();
        return basicGetJdbc();
      case ModulePackage.MODULE__CONNECTOR:
        if (resolve) return getConnector();
        return basicGetConnector();
      case ModulePackage.MODULE__DOMAIN_MODEL:
        if (resolve) return getDomainModel();
        return basicGetDomainModel();
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
      case ModulePackage.MODULE__NAME:
        setName((String)newValue);
        return;
      case ModulePackage.MODULE__GROUP_ID:
        setGroupId((String)newValue);
        return;
      case ModulePackage.MODULE__ARTIFACT_ID:
        setArtifactId((String)newValue);
        return;
      case ModulePackage.MODULE__VERSION:
        setVersion((String)newValue);
        return;
      case ModulePackage.MODULE__JDBC:
        setJdbc((Jdbc)newValue);
        return;
      case ModulePackage.MODULE__CONNECTOR:
        setConnector((DBConnectorDependency)newValue);
        return;
      case ModulePackage.MODULE__DOMAIN_MODEL:
        setDomainModel((DomainModel)newValue);
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
      case ModulePackage.MODULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModulePackage.MODULE__GROUP_ID:
        setGroupId(GROUP_ID_EDEFAULT);
        return;
      case ModulePackage.MODULE__ARTIFACT_ID:
        setArtifactId(ARTIFACT_ID_EDEFAULT);
        return;
      case ModulePackage.MODULE__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case ModulePackage.MODULE__JDBC:
        setJdbc((Jdbc)null);
        return;
      case ModulePackage.MODULE__CONNECTOR:
        setConnector((DBConnectorDependency)null);
        return;
      case ModulePackage.MODULE__DOMAIN_MODEL:
        setDomainModel((DomainModel)null);
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
      case ModulePackage.MODULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModulePackage.MODULE__GROUP_ID:
        return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
      case ModulePackage.MODULE__ARTIFACT_ID:
        return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
      case ModulePackage.MODULE__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case ModulePackage.MODULE__JDBC:
        return jdbc != null;
      case ModulePackage.MODULE__CONNECTOR:
        return connector != null;
      case ModulePackage.MODULE__DOMAIN_MODEL:
        return domainModel != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", groupId: ");
    result.append(groupId);
    result.append(", artifactId: ");
    result.append(artifactId);
    result.append(", version: ");
    result.append(version);
    result.append(')');
    return result.toString();
  }

} //ModuleImpl
