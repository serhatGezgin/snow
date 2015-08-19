/**
 */
package org.yazgel.snow.notation.text.snow;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ONE TO ONE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.snow.notation.text.snow.ONE_TO_ONE#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.snow.ONE_TO_ONE#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.yazgel.snow.notation.text.snow.ONE_TO_ONE#getOrphanRemoval <em>Orphan Removal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.snow.notation.text.snow.SnowPackage#getONE_TO_ONE()
 * @model
 * @generated
 */
public interface ONE_TO_ONE extends PropertyAnnotation
{
  /**
   * Returns the value of the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped By</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped By</em>' attribute.
   * @see #setMappedBy(String)
   * @see org.yazgel.snow.notation.text.snow.SnowPackage#getONE_TO_ONE_MappedBy()
   * @model
   * @generated
   */
  String getMappedBy();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.snow.ONE_TO_ONE#getMappedBy <em>Mapped By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped By</em>' attribute.
   * @see #getMappedBy()
   * @generated
   */
  void setMappedBy(String value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' containment reference.
   * @see #setOptional(XExpression)
   * @see org.yazgel.snow.notation.text.snow.SnowPackage#getONE_TO_ONE_Optional()
   * @model containment="true"
   * @generated
   */
  XExpression getOptional();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.snow.ONE_TO_ONE#getOptional <em>Optional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' containment reference.
   * @see #getOptional()
   * @generated
   */
  void setOptional(XExpression value);

  /**
   * Returns the value of the '<em><b>Orphan Removal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orphan Removal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orphan Removal</em>' containment reference.
   * @see #setOrphanRemoval(XExpression)
   * @see org.yazgel.snow.notation.text.snow.SnowPackage#getONE_TO_ONE_OrphanRemoval()
   * @model containment="true"
   * @generated
   */
  XExpression getOrphanRemoval();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.snow.ONE_TO_ONE#getOrphanRemoval <em>Orphan Removal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orphan Removal</em>' containment reference.
   * @see #getOrphanRemoval()
   * @generated
   */
  void setOrphanRemoval(XExpression value);

} // ONE_TO_ONE
