/**
 */
package org.yazgel.snow.notation.text.snow;

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
 * @see org.yazgel.snow.notation.text.snow.SnowFactory
 * @model kind="package"
 * @generated
 */
public interface SnowPackage extends EPackage
{
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
  String eNS_URI = "http://www.yazgel.org/snow/notation/text/Snow";

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
  SnowPackage eINSTANCE = org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl.init();

  /**
   * The meta object id for the '{@link org.yazgel.snow.notation.text.snow.impl.DomainModelImpl <em>Domain Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.snow.notation.text.snow.impl.DomainModelImpl
   * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getDomainModel()
   * @generated
   */
  int DOMAIN_MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__IMPORT_SECTION = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>Domain Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.yazgel.snow.notation.text.snow.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.snow.notation.text.snow.impl.AbstractElementImpl
   * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.yazgel.snow.notation.text.snow.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.snow.notation.text.snow.impl.PackageDeclarationImpl
   * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.yazgel.snow.notation.text.snow.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.snow.notation.text.snow.impl.EntityImpl
   * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_TYPE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FEATURES = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.yazgel.snow.notation.text.snow.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.snow.notation.text.snow.impl.FeatureImpl
   * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 4;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.yazgel.snow.notation.text.snow.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.snow.notation.text.snow.impl.PropertyImpl
   * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 5;

  /**
   * The feature id for the '<em><b>Property Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__PROPERTY_ANNOTATION = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = FEATURE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.yazgel.snow.notation.text.snow.impl.PropertyAnnotationImpl <em>Property Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.snow.notation.text.snow.impl.PropertyAnnotationImpl
   * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getPropertyAnnotation()
   * @generated
   */
  int PROPERTY_ANNOTATION = 6;

  /**
   * The number of structural features of the '<em>Property Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ANNOTATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.yazgel.snow.notation.text.snow.impl.MANY_TO_MANYImpl <em>MANY TO MANY</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.snow.notation.text.snow.impl.MANY_TO_MANYImpl
   * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getMANY_TO_MANY()
   * @generated
   */
  int MANY_TO_MANY = 7;

  /**
   * The feature id for the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__MAPPED_BY = PROPERTY_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>MANY TO MANY</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_FEATURE_COUNT = PROPERTY_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.yazgel.snow.notation.text.snow.impl.ONE_TO_ONEImpl <em>ONE TO ONE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.snow.notation.text.snow.impl.ONE_TO_ONEImpl
   * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getONE_TO_ONE()
   * @generated
   */
  int ONE_TO_ONE = 8;

  /**
   * The feature id for the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__MAPPED_BY = PROPERTY_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Optional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__OPTIONAL = PROPERTY_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Orphan Removal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__ORPHAN_REMOVAL = PROPERTY_ANNOTATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>ONE TO ONE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE_FEATURE_COUNT = PROPERTY_ANNOTATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.yazgel.snow.notation.text.snow.impl.MANY_TO_ONEImpl <em>MANY TO ONE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.snow.notation.text.snow.impl.MANY_TO_ONEImpl
   * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getMANY_TO_ONE()
   * @generated
   */
  int MANY_TO_ONE = 9;

  /**
   * The feature id for the '<em><b>Optional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE__OPTIONAL = PROPERTY_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>MANY TO ONE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE_FEATURE_COUNT = PROPERTY_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.yazgel.snow.notation.text.snow.impl.ONE_TO_MANYImpl <em>ONE TO MANY</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.snow.notation.text.snow.impl.ONE_TO_MANYImpl
   * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getONE_TO_MANY()
   * @generated
   */
  int ONE_TO_MANY = 10;

  /**
   * The feature id for the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__MAPPED_BY = PROPERTY_ANNOTATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Orphan Removal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__ORPHAN_REMOVAL = PROPERTY_ANNOTATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ONE TO MANY</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY_FEATURE_COUNT = PROPERTY_ANNOTATION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.yazgel.snow.notation.text.snow.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Model</em>'.
   * @see org.yazgel.snow.notation.text.snow.DomainModel
   * @generated
   */
  EClass getDomainModel();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.snow.DomainModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.yazgel.snow.notation.text.snow.DomainModel#getName()
   * @see #getDomainModel()
   * @generated
   */
  EAttribute getDomainModel_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.yazgel.snow.notation.text.snow.DomainModel#getImportSection <em>Import Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Section</em>'.
   * @see org.yazgel.snow.notation.text.snow.DomainModel#getImportSection()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_ImportSection();

  /**
   * Returns the meta object for the containment reference list '{@link org.yazgel.snow.notation.text.snow.DomainModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.yazgel.snow.notation.text.snow.DomainModel#getElements()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Elements();

  /**
   * Returns the meta object for class '{@link org.yazgel.snow.notation.text.snow.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see org.yazgel.snow.notation.text.snow.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.snow.AbstractElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.yazgel.snow.notation.text.snow.AbstractElement#getName()
   * @see #getAbstractElement()
   * @generated
   */
  EAttribute getAbstractElement_Name();

  /**
   * Returns the meta object for class '{@link org.yazgel.snow.notation.text.snow.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see org.yazgel.snow.notation.text.snow.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.yazgel.snow.notation.text.snow.PackageDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.yazgel.snow.notation.text.snow.PackageDeclaration#getElements()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Elements();

  /**
   * Returns the meta object for class '{@link org.yazgel.snow.notation.text.snow.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.yazgel.snow.notation.text.snow.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference '{@link org.yazgel.snow.notation.text.snow.Entity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Type</em>'.
   * @see org.yazgel.snow.notation.text.snow.Entity#getSuperType()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.yazgel.snow.notation.text.snow.Entity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.yazgel.snow.notation.text.snow.Entity#getFeatures()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Features();

  /**
   * Returns the meta object for class '{@link org.yazgel.snow.notation.text.snow.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.yazgel.snow.notation.text.snow.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for class '{@link org.yazgel.snow.notation.text.snow.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.yazgel.snow.notation.text.snow.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the containment reference list '{@link org.yazgel.snow.notation.text.snow.Property#getPropertyAnnotation <em>Property Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property Annotation</em>'.
   * @see org.yazgel.snow.notation.text.snow.Property#getPropertyAnnotation()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_PropertyAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.snow.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.yazgel.snow.notation.text.snow.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.yazgel.snow.notation.text.snow.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.yazgel.snow.notation.text.snow.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Type();

  /**
   * Returns the meta object for class '{@link org.yazgel.snow.notation.text.snow.PropertyAnnotation <em>Property Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Annotation</em>'.
   * @see org.yazgel.snow.notation.text.snow.PropertyAnnotation
   * @generated
   */
  EClass getPropertyAnnotation();

  /**
   * Returns the meta object for class '{@link org.yazgel.snow.notation.text.snow.MANY_TO_MANY <em>MANY TO MANY</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MANY TO MANY</em>'.
   * @see org.yazgel.snow.notation.text.snow.MANY_TO_MANY
   * @generated
   */
  EClass getMANY_TO_MANY();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.snow.MANY_TO_MANY#getMappedBy <em>Mapped By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mapped By</em>'.
   * @see org.yazgel.snow.notation.text.snow.MANY_TO_MANY#getMappedBy()
   * @see #getMANY_TO_MANY()
   * @generated
   */
  EAttribute getMANY_TO_MANY_MappedBy();

  /**
   * Returns the meta object for class '{@link org.yazgel.snow.notation.text.snow.ONE_TO_ONE <em>ONE TO ONE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ONE TO ONE</em>'.
   * @see org.yazgel.snow.notation.text.snow.ONE_TO_ONE
   * @generated
   */
  EClass getONE_TO_ONE();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.snow.ONE_TO_ONE#getMappedBy <em>Mapped By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mapped By</em>'.
   * @see org.yazgel.snow.notation.text.snow.ONE_TO_ONE#getMappedBy()
   * @see #getONE_TO_ONE()
   * @generated
   */
  EAttribute getONE_TO_ONE_MappedBy();

  /**
   * Returns the meta object for the containment reference '{@link org.yazgel.snow.notation.text.snow.ONE_TO_ONE#getOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Optional</em>'.
   * @see org.yazgel.snow.notation.text.snow.ONE_TO_ONE#getOptional()
   * @see #getONE_TO_ONE()
   * @generated
   */
  EReference getONE_TO_ONE_Optional();

  /**
   * Returns the meta object for the containment reference '{@link org.yazgel.snow.notation.text.snow.ONE_TO_ONE#getOrphanRemoval <em>Orphan Removal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Orphan Removal</em>'.
   * @see org.yazgel.snow.notation.text.snow.ONE_TO_ONE#getOrphanRemoval()
   * @see #getONE_TO_ONE()
   * @generated
   */
  EReference getONE_TO_ONE_OrphanRemoval();

  /**
   * Returns the meta object for class '{@link org.yazgel.snow.notation.text.snow.MANY_TO_ONE <em>MANY TO ONE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MANY TO ONE</em>'.
   * @see org.yazgel.snow.notation.text.snow.MANY_TO_ONE
   * @generated
   */
  EClass getMANY_TO_ONE();

  /**
   * Returns the meta object for the containment reference '{@link org.yazgel.snow.notation.text.snow.MANY_TO_ONE#getOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Optional</em>'.
   * @see org.yazgel.snow.notation.text.snow.MANY_TO_ONE#getOptional()
   * @see #getMANY_TO_ONE()
   * @generated
   */
  EReference getMANY_TO_ONE_Optional();

  /**
   * Returns the meta object for class '{@link org.yazgel.snow.notation.text.snow.ONE_TO_MANY <em>ONE TO MANY</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ONE TO MANY</em>'.
   * @see org.yazgel.snow.notation.text.snow.ONE_TO_MANY
   * @generated
   */
  EClass getONE_TO_MANY();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.snow.notation.text.snow.ONE_TO_MANY#getMappedBy <em>Mapped By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mapped By</em>'.
   * @see org.yazgel.snow.notation.text.snow.ONE_TO_MANY#getMappedBy()
   * @see #getONE_TO_MANY()
   * @generated
   */
  EAttribute getONE_TO_MANY_MappedBy();

  /**
   * Returns the meta object for the containment reference '{@link org.yazgel.snow.notation.text.snow.ONE_TO_MANY#getOrphanRemoval <em>Orphan Removal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Orphan Removal</em>'.
   * @see org.yazgel.snow.notation.text.snow.ONE_TO_MANY#getOrphanRemoval()
   * @see #getONE_TO_MANY()
   * @generated
   */
  EReference getONE_TO_MANY_OrphanRemoval();

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
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.yazgel.snow.notation.text.snow.impl.DomainModelImpl <em>Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.snow.notation.text.snow.impl.DomainModelImpl
     * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getDomainModel()
     * @generated
     */
    EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_MODEL__NAME = eINSTANCE.getDomainModel_Name();

    /**
     * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__IMPORT_SECTION = eINSTANCE.getDomainModel_ImportSection();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__ELEMENTS = eINSTANCE.getDomainModel_Elements();

    /**
     * The meta object literal for the '{@link org.yazgel.snow.notation.text.snow.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.snow.notation.text.snow.impl.AbstractElementImpl
     * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ELEMENT__NAME = eINSTANCE.getAbstractElement_Name();

    /**
     * The meta object literal for the '{@link org.yazgel.snow.notation.text.snow.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.snow.notation.text.snow.impl.PackageDeclarationImpl
     * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__ELEMENTS = eINSTANCE.getPackageDeclaration_Elements();

    /**
     * The meta object literal for the '{@link org.yazgel.snow.notation.text.snow.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.snow.notation.text.snow.impl.EntityImpl
     * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

    /**
     * The meta object literal for the '{@link org.yazgel.snow.notation.text.snow.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.snow.notation.text.snow.impl.FeatureImpl
     * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '{@link org.yazgel.snow.notation.text.snow.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.snow.notation.text.snow.impl.PropertyImpl
     * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Property Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__PROPERTY_ANNOTATION = eINSTANCE.getProperty_PropertyAnnotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

    /**
     * The meta object literal for the '{@link org.yazgel.snow.notation.text.snow.impl.PropertyAnnotationImpl <em>Property Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.snow.notation.text.snow.impl.PropertyAnnotationImpl
     * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getPropertyAnnotation()
     * @generated
     */
    EClass PROPERTY_ANNOTATION = eINSTANCE.getPropertyAnnotation();

    /**
     * The meta object literal for the '{@link org.yazgel.snow.notation.text.snow.impl.MANY_TO_MANYImpl <em>MANY TO MANY</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.snow.notation.text.snow.impl.MANY_TO_MANYImpl
     * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getMANY_TO_MANY()
     * @generated
     */
    EClass MANY_TO_MANY = eINSTANCE.getMANY_TO_MANY();

    /**
     * The meta object literal for the '<em><b>Mapped By</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANY_TO_MANY__MAPPED_BY = eINSTANCE.getMANY_TO_MANY_MappedBy();

    /**
     * The meta object literal for the '{@link org.yazgel.snow.notation.text.snow.impl.ONE_TO_ONEImpl <em>ONE TO ONE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.snow.notation.text.snow.impl.ONE_TO_ONEImpl
     * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getONE_TO_ONE()
     * @generated
     */
    EClass ONE_TO_ONE = eINSTANCE.getONE_TO_ONE();

    /**
     * The meta object literal for the '<em><b>Mapped By</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONE_TO_ONE__MAPPED_BY = eINSTANCE.getONE_TO_ONE_MappedBy();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_TO_ONE__OPTIONAL = eINSTANCE.getONE_TO_ONE_Optional();

    /**
     * The meta object literal for the '<em><b>Orphan Removal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_TO_ONE__ORPHAN_REMOVAL = eINSTANCE.getONE_TO_ONE_OrphanRemoval();

    /**
     * The meta object literal for the '{@link org.yazgel.snow.notation.text.snow.impl.MANY_TO_ONEImpl <em>MANY TO ONE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.snow.notation.text.snow.impl.MANY_TO_ONEImpl
     * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getMANY_TO_ONE()
     * @generated
     */
    EClass MANY_TO_ONE = eINSTANCE.getMANY_TO_ONE();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MANY_TO_ONE__OPTIONAL = eINSTANCE.getMANY_TO_ONE_Optional();

    /**
     * The meta object literal for the '{@link org.yazgel.snow.notation.text.snow.impl.ONE_TO_MANYImpl <em>ONE TO MANY</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.snow.notation.text.snow.impl.ONE_TO_MANYImpl
     * @see org.yazgel.snow.notation.text.snow.impl.SnowPackageImpl#getONE_TO_MANY()
     * @generated
     */
    EClass ONE_TO_MANY = eINSTANCE.getONE_TO_MANY();

    /**
     * The meta object literal for the '<em><b>Mapped By</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONE_TO_MANY__MAPPED_BY = eINSTANCE.getONE_TO_MANY_MappedBy();

    /**
     * The meta object literal for the '<em><b>Orphan Removal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONE_TO_MANY__ORPHAN_REMOVAL = eINSTANCE.getONE_TO_MANY_OrphanRemoval();

  }

} //SnowPackage
