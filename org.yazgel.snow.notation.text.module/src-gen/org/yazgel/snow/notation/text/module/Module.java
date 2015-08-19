/**
 */
package org.yazgel.snow.notation.text.module;

import org.eclipse.emf.ecore.EObject;

import org.yazgel.snow.notation.text.snow.DomainModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.snow.notation.text.module.Module#getName <em>Name</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.Module#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.Module#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.Module#getVersion <em>Version</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.Module#getJdbc <em>Jdbc</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.Module#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.Module#getDomainModel <em>Domain Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.snow.notation.text.module.ModulePackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.yazgel.snow.notation.text.module.ModulePackage#getModule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.module.Module#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.yazgel.snow.notation.text.module.ModulePackage#getModule_GroupId()
   * @model
   * @generated
   */
  String getGroupId();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.module.Module#getGroupId <em>Group Id</em>}' attribute.
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
   * @see org.yazgel.snow.notation.text.module.ModulePackage#getModule_ArtifactId()
   * @model
   * @generated
   */
  String getArtifactId();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.module.Module#getArtifactId <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artifact Id</em>' attribute.
   * @see #getArtifactId()
   * @generated
   */
  void setArtifactId(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.yazgel.snow.notation.text.module.ModulePackage#getModule_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.module.Module#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Jdbc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jdbc</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jdbc</em>' reference.
   * @see #setJdbc(Jdbc)
   * @see org.yazgel.snow.notation.text.module.ModulePackage#getModule_Jdbc()
   * @model
   * @generated
   */
  Jdbc getJdbc();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.module.Module#getJdbc <em>Jdbc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jdbc</em>' reference.
   * @see #getJdbc()
   * @generated
   */
  void setJdbc(Jdbc value);

  /**
   * Returns the value of the '<em><b>Connector</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connector</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connector</em>' reference.
   * @see #setConnector(DBConnectorDependency)
   * @see org.yazgel.snow.notation.text.module.ModulePackage#getModule_Connector()
   * @model
   * @generated
   */
  DBConnectorDependency getConnector();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.module.Module#getConnector <em>Connector</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connector</em>' reference.
   * @see #getConnector()
   * @generated
   */
  void setConnector(DBConnectorDependency value);

  /**
   * Returns the value of the '<em><b>Domain Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain Model</em>' reference.
   * @see #setDomainModel(DomainModel)
   * @see org.yazgel.snow.notation.text.module.ModulePackage#getModule_DomainModel()
   * @model
   * @generated
   */
  DomainModel getDomainModel();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.module.Module#getDomainModel <em>Domain Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain Model</em>' reference.
   * @see #getDomainModel()
   * @generated
   */
  void setDomainModel(DomainModel value);

} // Module
