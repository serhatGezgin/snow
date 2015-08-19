/**
 */
package org.yazgel.snow.notation.text.module;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.yazgel.snow.notation.text.module.ModuleFactory
 * @model kind="package"
 * @generated
 */
public interface ModulePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "module";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.yazgel.org/snow/notation/text/Module";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "module";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModulePackage eINSTANCE = org.yazgel.snow.notation.text.module.impl.ModulePackageImpl.init();

  /**
   * The meta object id for the '{@link org.yazgel.snow.notation.text.module.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.snow.notation.text.module.impl.ModelImpl
   * @see org.yazgel.snow.notation.text.module.impl.ModulePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FEATURES = 0;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MODULE = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.yazgel.snow.notation.text.module.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.snow.notation.text.module.impl.ModuleImpl
   * @see org.yazgel.snow.notation.text.module.impl.ModulePackageImpl#getModule()
   * @generated
   */
  int MODULE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__GROUP_ID = 1;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__ARTIFACT_ID = 2;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__VERSION = 3;

  /**
   * The feature id for the '<em><b>Jdbc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__JDBC = 4;

  /**
   * The feature id for the '<em><b>Connector</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__CONNECTOR = 5;

  /**
   * The feature id for the '<em><b>Domain Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__DOMAIN_MODEL = 6;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.yazgel.snow.notation.text.module.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.snow.notation.text.module.impl.FeatureImpl
   * @see org.yazgel.snow.notation.text.module.impl.ModulePackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.yazgel.snow.notation.text.module.impl.DBConnectorDependencyImpl <em>DB Connector Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.snow.notation.text.module.impl.DBConnectorDependencyImpl
   * @see org.yazgel.snow.notation.text.module.impl.ModulePackageImpl#getDBConnectorDependency()
   * @generated
   */
  int DB_CONNECTOR_DEPENDENCY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_CONNECTOR_DEPENDENCY__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_CONNECTOR_DEPENDENCY__GROUP_ID = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_CONNECTOR_DEPENDENCY__ARTIFACT_ID = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_CONNECTOR_DEPENDENCY__VERSION = FEATURE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>DB Connector Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_CONNECTOR_DEPENDENCY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.yazgel.snow.notation.text.module.impl.JdbcImpl <em>Jdbc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.snow.notation.text.module.impl.JdbcImpl
   * @see org.yazgel.snow.notation.text.module.impl.ModulePackageImpl#getJdbc()
   * @generated
   */
  int JDBC = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>User</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC__USER = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC__PASSWORD = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC__URL = FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Driver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC__DRIVER = FEATURE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Jdbc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 4;


  /**
   * Returns the meta object for class '{@link org.yazgel.snow.notation.text.module.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.yazgel.snow.notation.text.module.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.yazgel.snow.notation.text.module.Model#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.yazgel.snow.notation.text.module.Model#getFeatures()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Features();

  /**
   * Returns the meta object for the containment reference '{@link org.yazgel.snow.notation.text.module.Model#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Module</em>'.
   * @see org.yazgel.snow.notation.text.module.Model#getModule()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Module();

  /**
   * Returns the meta object for class '{@link org.yazgel.snow.notation.text.module.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see org.yazgel.snow.notation.text.module.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.module.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.yazgel.snow.notation.text.module.Module#getName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Name();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.module.Module#getGroupId <em>Group Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Id</em>'.
   * @see org.yazgel.snow.notation.text.module.Module#getGroupId()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_GroupId();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.module.Module#getArtifactId <em>Artifact Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artifact Id</em>'.
   * @see org.yazgel.snow.notation.text.module.Module#getArtifactId()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_ArtifactId();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.module.Module#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.yazgel.snow.notation.text.module.Module#getVersion()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Version();

  /**
   * Returns the meta object for the reference '{@link org.yazgel.snow.notation.text.module.Module#getJdbc <em>Jdbc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Jdbc</em>'.
   * @see org.yazgel.snow.notation.text.module.Module#getJdbc()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Jdbc();

  /**
   * Returns the meta object for the reference '{@link org.yazgel.snow.notation.text.module.Module#getConnector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Connector</em>'.
   * @see org.yazgel.snow.notation.text.module.Module#getConnector()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Connector();

  /**
   * Returns the meta object for the reference '{@link org.yazgel.snow.notation.text.module.Module#getDomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Domain Model</em>'.
   * @see org.yazgel.snow.notation.text.module.Module#getDomainModel()
   * @see #getModule()
   * @generated
   */
  EReference getModule_DomainModel();

  /**
   * Returns the meta object for class '{@link org.yazgel.snow.notation.text.module.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.yazgel.snow.notation.text.module.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.module.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.yazgel.snow.notation.text.module.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for class '{@link org.yazgel.snow.notation.text.module.DBConnectorDependency <em>DB Connector Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DB Connector Dependency</em>'.
   * @see org.yazgel.snow.notation.text.module.DBConnectorDependency
   * @generated
   */
  EClass getDBConnectorDependency();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.module.DBConnectorDependency#getGroupId <em>Group Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Id</em>'.
   * @see org.yazgel.snow.notation.text.module.DBConnectorDependency#getGroupId()
   * @see #getDBConnectorDependency()
   * @generated
   */
  EAttribute getDBConnectorDependency_GroupId();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.module.DBConnectorDependency#getArtifactId <em>Artifact Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artifact Id</em>'.
   * @see org.yazgel.snow.notation.text.module.DBConnectorDependency#getArtifactId()
   * @see #getDBConnectorDependency()
   * @generated
   */
  EAttribute getDBConnectorDependency_ArtifactId();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.module.DBConnectorDependency#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.yazgel.snow.notation.text.module.DBConnectorDependency#getVersion()
   * @see #getDBConnectorDependency()
   * @generated
   */
  EAttribute getDBConnectorDependency_Version();

  /**
   * Returns the meta object for class '{@link org.yazgel.snow.notation.text.module.Jdbc <em>Jdbc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jdbc</em>'.
   * @see org.yazgel.snow.notation.text.module.Jdbc
   * @generated
   */
  EClass getJdbc();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.module.Jdbc#getUser <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>User</em>'.
   * @see org.yazgel.snow.notation.text.module.Jdbc#getUser()
   * @see #getJdbc()
   * @generated
   */
  EAttribute getJdbc_User();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.module.Jdbc#getPassword <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Password</em>'.
   * @see org.yazgel.snow.notation.text.module.Jdbc#getPassword()
   * @see #getJdbc()
   * @generated
   */
  EAttribute getJdbc_Password();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.module.Jdbc#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.yazgel.snow.notation.text.module.Jdbc#getUrl()
   * @see #getJdbc()
   * @generated
   */
  EAttribute getJdbc_Url();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.module.Jdbc#getDriver <em>Driver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Driver</em>'.
   * @see org.yazgel.snow.notation.text.module.Jdbc#getDriver()
   * @see #getJdbc()
   * @generated
   */
  EAttribute getJdbc_Driver();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ModuleFactory getModuleFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.yazgel.snow.notation.text.module.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.snow.notation.text.module.impl.ModelImpl
     * @see org.yazgel.snow.notation.text.module.impl.ModulePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FEATURES = eINSTANCE.getModel_Features();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MODULE = eINSTANCE.getModel_Module();

    /**
     * The meta object literal for the '{@link org.yazgel.snow.notation.text.module.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.snow.notation.text.module.impl.ModuleImpl
     * @see org.yazgel.snow.notation.text.module.impl.ModulePackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__GROUP_ID = eINSTANCE.getModule_GroupId();

    /**
     * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__ARTIFACT_ID = eINSTANCE.getModule_ArtifactId();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__VERSION = eINSTANCE.getModule_Version();

    /**
     * The meta object literal for the '<em><b>Jdbc</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__JDBC = eINSTANCE.getModule_Jdbc();

    /**
     * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__CONNECTOR = eINSTANCE.getModule_Connector();

    /**
     * The meta object literal for the '<em><b>Domain Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__DOMAIN_MODEL = eINSTANCE.getModule_DomainModel();

    /**
     * The meta object literal for the '{@link org.yazgel.snow.notation.text.module.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.snow.notation.text.module.impl.FeatureImpl
     * @see org.yazgel.snow.notation.text.module.impl.ModulePackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '{@link org.yazgel.snow.notation.text.module.impl.DBConnectorDependencyImpl <em>DB Connector Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.snow.notation.text.module.impl.DBConnectorDependencyImpl
     * @see org.yazgel.snow.notation.text.module.impl.ModulePackageImpl#getDBConnectorDependency()
     * @generated
     */
    EClass DB_CONNECTOR_DEPENDENCY = eINSTANCE.getDBConnectorDependency();

    /**
     * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DB_CONNECTOR_DEPENDENCY__GROUP_ID = eINSTANCE.getDBConnectorDependency_GroupId();

    /**
     * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DB_CONNECTOR_DEPENDENCY__ARTIFACT_ID = eINSTANCE.getDBConnectorDependency_ArtifactId();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DB_CONNECTOR_DEPENDENCY__VERSION = eINSTANCE.getDBConnectorDependency_Version();

    /**
     * The meta object literal for the '{@link org.yazgel.snow.notation.text.module.impl.JdbcImpl <em>Jdbc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.snow.notation.text.module.impl.JdbcImpl
     * @see org.yazgel.snow.notation.text.module.impl.ModulePackageImpl#getJdbc()
     * @generated
     */
    EClass JDBC = eINSTANCE.getJdbc();

    /**
     * The meta object literal for the '<em><b>User</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JDBC__USER = eINSTANCE.getJdbc_User();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JDBC__PASSWORD = eINSTANCE.getJdbc_Password();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JDBC__URL = eINSTANCE.getJdbc_Url();

    /**
     * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JDBC__DRIVER = eINSTANCE.getJdbc_Driver();

  }

} //ModulePackage
