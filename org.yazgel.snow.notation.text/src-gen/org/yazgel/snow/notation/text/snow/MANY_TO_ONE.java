/**
 */
package org.yazgel.snow.notation.text.snow;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MANY TO ONE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.snow.notation.text.snow.MANY_TO_ONE#getOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.snow.notation.text.snow.SnowPackage#getMANY_TO_ONE()
 * @model
 * @generated
 */
public interface MANY_TO_ONE extends PropertyAnnotation
{
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
   * @see org.yazgel.snow.notation.text.snow.SnowPackage#getMANY_TO_ONE_Optional()
   * @model containment="true"
   * @generated
   */
  XExpression getOptional();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.snow.MANY_TO_ONE#getOptional <em>Optional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' containment reference.
   * @see #getOptional()
   * @generated
   */
  void setOptional(XExpression value);

} // MANY_TO_ONE
