/**
 */
package org.yazgel.snow.notation.text.snow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.snow.notation.text.snow.Property#getPropertyAnnotation <em>Property Annotation</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.snow.Property#getName <em>Name</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.snow.Property#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.snow.notation.text.snow.SnowPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Feature
{
  /**
   * Returns the value of the '<em><b>Property Annotation</b></em>' containment reference list.
   * The list contents are of type {@link org.yazgel.snow.notation.text.snow.PropertyAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Annotation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Annotation</em>' containment reference list.
   * @see org.yazgel.snow.notation.text.snow.SnowPackage#getProperty_PropertyAnnotation()
   * @model containment="true"
   * @generated
   */
  EList<PropertyAnnotation> getPropertyAnnotation();

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
   * @see org.yazgel.snow.notation.text.snow.SnowPackage#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.snow.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JvmTypeReference)
   * @see org.yazgel.snow.notation.text.snow.SnowPackage#getProperty_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.snow.Property#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

} // Property
