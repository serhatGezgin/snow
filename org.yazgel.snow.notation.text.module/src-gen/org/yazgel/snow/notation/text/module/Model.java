/**
 */
package org.yazgel.snow.notation.text.module;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.snow.notation.text.module.Model#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.module.Model#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.snow.notation.text.module.ModulePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.yazgel.snow.notation.text.module.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.yazgel.snow.notation.text.module.ModulePackage#getModel_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

  /**
   * Returns the value of the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' containment reference.
   * @see #setModule(Module)
   * @see org.yazgel.snow.notation.text.module.ModulePackage#getModel_Module()
   * @model containment="true"
   * @generated
   */
  Module getModule();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.module.Model#getModule <em>Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' containment reference.
   * @see #getModule()
   * @generated
   */
  void setModule(Module value);

} // Model
