/**
 */
package org.yazgel.snow.notation.text.snow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.yazgel.snow.notation.text.snow.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SnowFactoryImpl extends EFactoryImpl implements SnowFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SnowFactory init()
  {
    try
    {
      SnowFactory theSnowFactory = (SnowFactory)EPackage.Registry.INSTANCE.getEFactory(SnowPackage.eNS_URI);
      if (theSnowFactory != null)
      {
        return theSnowFactory;
      }
    }
    catch (Exception exception)
    {
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
  public SnowFactoryImpl()
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
      case SnowPackage.DOMAIN_MODEL: return createDomainModel();
      case SnowPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case SnowPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case SnowPackage.ENTITY: return createEntity();
      case SnowPackage.FEATURE: return createFeature();
      case SnowPackage.PROPERTY: return createProperty();
      case SnowPackage.PROPERTY_ANNOTATION: return createPropertyAnnotation();
      case SnowPackage.MANY_TO_MANY: return createMANY_TO_MANY();
      case SnowPackage.ONE_TO_ONE: return createONE_TO_ONE();
      case SnowPackage.MANY_TO_ONE: return createMANY_TO_ONE();
      case SnowPackage.ONE_TO_MANY: return createONE_TO_MANY();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModel createDomainModel()
  {
    DomainModelImpl domainModel = new DomainModelImpl();
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
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
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyAnnotation createPropertyAnnotation()
  {
    PropertyAnnotationImpl propertyAnnotation = new PropertyAnnotationImpl();
    return propertyAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MANY_TO_MANY createMANY_TO_MANY()
  {
    MANY_TO_MANYImpl manY_TO_MANY = new MANY_TO_MANYImpl();
    return manY_TO_MANY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ONE_TO_ONE createONE_TO_ONE()
  {
    ONE_TO_ONEImpl onE_TO_ONE = new ONE_TO_ONEImpl();
    return onE_TO_ONE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MANY_TO_ONE createMANY_TO_ONE()
  {
    MANY_TO_ONEImpl manY_TO_ONE = new MANY_TO_ONEImpl();
    return manY_TO_ONE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ONE_TO_MANY createONE_TO_MANY()
  {
    ONE_TO_MANYImpl onE_TO_MANY = new ONE_TO_MANYImpl();
    return onE_TO_MANY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SnowPackage getSnowPackage()
  {
    return (SnowPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SnowPackage getPackage()
  {
    return SnowPackage.eINSTANCE;
  }

} //SnowFactoryImpl
