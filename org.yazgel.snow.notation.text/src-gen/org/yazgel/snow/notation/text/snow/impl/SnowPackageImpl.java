/**
 */
package org.yazgel.snow.notation.text.snow.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipse.xtext.xtype.XtypePackage;

import org.yazgel.snow.notation.text.snow.AbstractElement;
import org.yazgel.snow.notation.text.snow.DomainModel;
import org.yazgel.snow.notation.text.snow.Entity;
import org.yazgel.snow.notation.text.snow.Feature;
import org.yazgel.snow.notation.text.snow.PackageDeclaration;
import org.yazgel.snow.notation.text.snow.Property;
import org.yazgel.snow.notation.text.snow.PropertyAnnotation;
import org.yazgel.snow.notation.text.snow.SnowFactory;
import org.yazgel.snow.notation.text.snow.SnowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SnowPackageImpl extends EPackageImpl implements SnowPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageDeclarationEClass = null;

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
  private EClass featureEClass = null;

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
  private EClass propertyAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass manY_TO_MANYEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass onE_TO_ONEEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass manY_TO_ONEEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass onE_TO_MANYEClass = null;

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
   * @see org.yazgel.snow.notation.text.snow.SnowPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SnowPackageImpl()
  {
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
  public static SnowPackage init()
  {
    if (isInited) return (SnowPackage)EPackage.Registry.INSTANCE.getEPackage(SnowPackage.eNS_URI);

    // Obtain or create and register package
    SnowPackageImpl theSnowPackage = (SnowPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SnowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SnowPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XbasePackage.eINSTANCE.eClass();
    XtypePackage.eINSTANCE.eClass();

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
  public EClass getDomainModel()
  {
    return domainModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainModel_Name()
  {
    return (EAttribute)domainModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainModel_ImportSection()
  {
    return (EReference)domainModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainModel_Elements()
  {
    return (EReference)domainModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractElement()
  {
    return abstractElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractElement_Name()
  {
    return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageDeclaration()
  {
    return packageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDeclaration_Elements()
  {
    return (EReference)packageDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_SuperType()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Features()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_PropertyAnnotation()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Name()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Type()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyAnnotation()
  {
    return propertyAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMANY_TO_MANY()
  {
    return manY_TO_MANYEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMANY_TO_MANY_MappedBy()
  {
    return (EAttribute)manY_TO_MANYEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getONE_TO_ONE()
  {
    return onE_TO_ONEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getONE_TO_ONE_MappedBy()
  {
    return (EAttribute)onE_TO_ONEEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getONE_TO_ONE_Optional()
  {
    return (EReference)onE_TO_ONEEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getONE_TO_ONE_OrphanRemoval()
  {
    return (EReference)onE_TO_ONEEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMANY_TO_ONE()
  {
    return manY_TO_ONEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMANY_TO_ONE_Optional()
  {
    return (EReference)manY_TO_ONEEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getONE_TO_MANY()
  {
    return onE_TO_MANYEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getONE_TO_MANY_MappedBy()
  {
    return (EAttribute)onE_TO_MANYEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getONE_TO_MANY_OrphanRemoval()
  {
    return (EReference)onE_TO_MANYEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SnowFactory getSnowFactory()
  {
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    domainModelEClass = createEClass(DOMAIN_MODEL);
    createEAttribute(domainModelEClass, DOMAIN_MODEL__NAME);
    createEReference(domainModelEClass, DOMAIN_MODEL__IMPORT_SECTION);
    createEReference(domainModelEClass, DOMAIN_MODEL__ELEMENTS);

    abstractElementEClass = createEClass(ABSTRACT_ELEMENT);
    createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__NAME);

    packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
    createEReference(packageDeclarationEClass, PACKAGE_DECLARATION__ELEMENTS);

    entityEClass = createEClass(ENTITY);
    createEReference(entityEClass, ENTITY__SUPER_TYPE);
    createEReference(entityEClass, ENTITY__FEATURES);

    featureEClass = createEClass(FEATURE);

    propertyEClass = createEClass(PROPERTY);
    createEReference(propertyEClass, PROPERTY__PROPERTY_ANNOTATION);
    createEAttribute(propertyEClass, PROPERTY__NAME);
    createEReference(propertyEClass, PROPERTY__TYPE);

    propertyAnnotationEClass = createEClass(PROPERTY_ANNOTATION);

    manY_TO_MANYEClass = createEClass(MANY_TO_MANY);
    createEAttribute(manY_TO_MANYEClass, MANY_TO_MANY__MAPPED_BY);

    onE_TO_ONEEClass = createEClass(ONE_TO_ONE);
    createEAttribute(onE_TO_ONEEClass, ONE_TO_ONE__MAPPED_BY);
    createEReference(onE_TO_ONEEClass, ONE_TO_ONE__OPTIONAL);
    createEReference(onE_TO_ONEEClass, ONE_TO_ONE__ORPHAN_REMOVAL);

    manY_TO_ONEEClass = createEClass(MANY_TO_ONE);
    createEReference(manY_TO_ONEEClass, MANY_TO_ONE__OPTIONAL);

    onE_TO_MANYEClass = createEClass(ONE_TO_MANY);
    createEAttribute(onE_TO_MANYEClass, ONE_TO_MANY__MAPPED_BY);
    createEReference(onE_TO_MANYEClass, ONE_TO_MANY__ORPHAN_REMOVAL);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    packageDeclarationEClass.getESuperTypes().add(this.getAbstractElement());
    entityEClass.getESuperTypes().add(this.getAbstractElement());
    propertyEClass.getESuperTypes().add(this.getFeature());
    manY_TO_MANYEClass.getESuperTypes().add(this.getPropertyAnnotation());
    onE_TO_ONEEClass.getESuperTypes().add(this.getPropertyAnnotation());
    manY_TO_ONEEClass.getESuperTypes().add(this.getPropertyAnnotation());
    onE_TO_MANYEClass.getESuperTypes().add(this.getPropertyAnnotation());

    // Initialize classes and features; add operations and parameters
    initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainModel_ImportSection(), theXtypePackage.getXImportSection(), null, "importSection", null, 0, 1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainModel_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDeclarationEClass, PackageDeclaration.class, "PackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackageDeclaration_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntity_SuperType(), theTypesPackage.getJvmParameterizedTypeReference(), null, "superType", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_Features(), this.getFeature(), null, "features", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProperty_PropertyAnnotation(), this.getPropertyAnnotation(), null, "propertyAnnotation", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyAnnotationEClass, PropertyAnnotation.class, "PropertyAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(manY_TO_MANYEClass, org.yazgel.snow.notation.text.snow.MANY_TO_MANY.class, "MANY_TO_MANY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMANY_TO_MANY_MappedBy(), ecorePackage.getEString(), "mappedBy", null, 0, 1, org.yazgel.snow.notation.text.snow.MANY_TO_MANY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(onE_TO_ONEEClass, org.yazgel.snow.notation.text.snow.ONE_TO_ONE.class, "ONE_TO_ONE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getONE_TO_ONE_MappedBy(), ecorePackage.getEString(), "mappedBy", null, 0, 1, org.yazgel.snow.notation.text.snow.ONE_TO_ONE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getONE_TO_ONE_Optional(), theXbasePackage.getXExpression(), null, "optional", null, 0, 1, org.yazgel.snow.notation.text.snow.ONE_TO_ONE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getONE_TO_ONE_OrphanRemoval(), theXbasePackage.getXExpression(), null, "orphanRemoval", null, 0, 1, org.yazgel.snow.notation.text.snow.ONE_TO_ONE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(manY_TO_ONEEClass, org.yazgel.snow.notation.text.snow.MANY_TO_ONE.class, "MANY_TO_ONE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMANY_TO_ONE_Optional(), theXbasePackage.getXExpression(), null, "optional", null, 0, 1, org.yazgel.snow.notation.text.snow.MANY_TO_ONE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(onE_TO_MANYEClass, org.yazgel.snow.notation.text.snow.ONE_TO_MANY.class, "ONE_TO_MANY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getONE_TO_MANY_MappedBy(), ecorePackage.getEString(), "mappedBy", null, 0, 1, org.yazgel.snow.notation.text.snow.ONE_TO_MANY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getONE_TO_MANY_OrphanRemoval(), theXbasePackage.getXExpression(), null, "orphanRemoval", null, 0, 1, org.yazgel.snow.notation.text.snow.ONE_TO_MANY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SnowPackageImpl
