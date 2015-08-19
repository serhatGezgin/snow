/**
 */
package org.yazgel.snow.notation.text.module.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.yazgel.snow.notation.text.module.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleFactoryImpl extends EFactoryImpl implements ModuleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ModuleFactory init()
  {
    try
    {
      ModuleFactory theModuleFactory = (ModuleFactory)EPackage.Registry.INSTANCE.getEFactory(ModulePackage.eNS_URI);
      if (theModuleFactory != null)
      {
        return theModuleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ModuleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ModulePackage.MODEL: return createModel();
      case ModulePackage.MODULE: return createModule();
      case ModulePackage.FEATURE: return createFeature();
      case ModulePackage.DB_CONNECTOR_DEPENDENCY: return createDBConnectorDependency();
      case ModulePackage.JDBC: return createJdbc();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DBConnectorDependency createDBConnectorDependency()
  {
    DBConnectorDependencyImpl dbConnectorDependency = new DBConnectorDependencyImpl();
    return dbConnectorDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jdbc createJdbc()
  {
    JdbcImpl jdbc = new JdbcImpl();
    return jdbc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModulePackage getModulePackage()
  {
    return (ModulePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ModulePackage getPackage()
  {
    return ModulePackage.eINSTANCE;
  }

} //ModuleFactoryImpl
