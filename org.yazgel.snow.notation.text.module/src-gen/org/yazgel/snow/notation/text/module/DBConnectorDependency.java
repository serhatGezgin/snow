/**
 */
package org.yazgel.snow.notation.text.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB Connector Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.snow.notation.text.module.DBConnectorDependency#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.DBConnectorDependency#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.DBConnectorDependency#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.snow.notation.text.module.ModulePackage#getDBConnectorDependency()
 * @model
 * @generated
 */
public interface DBConnectorDependency extends Feature
{
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
   * @see org.yazgel.snow.notation.text.module.ModulePackage#getDBConnectorDependency_GroupId()
   * @model
   * @generated
   */
  String getGroupId();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.module.DBConnectorDependency#getGroupId <em>Group Id</em>}' attribute.
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
   * @see org.yazgel.snow.notation.text.module.ModulePackage#getDBConnectorDependency_ArtifactId()
   * @model
   * @generated
   */
  String getArtifactId();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.module.DBConnectorDependency#getArtifactId <em>Artifact Id</em>}' attribute.
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
   * @see org.yazgel.snow.notation.text.module.ModulePackage#getDBConnectorDependency_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.module.DBConnectorDependency#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

} // DBConnectorDependency
