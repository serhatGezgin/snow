/**
 */
package org.yazgel.snow.notation.text.snow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MANY TO MANY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yazgel.snow.notation.text.snow.MANY_TO_MANY#getMappedBy <em>Mapped By</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yazgel.snow.notation.text.snow.SnowPackage#getMANY_TO_MANY()
 * @model
 * @generated
 */
public interface MANY_TO_MANY extends PropertyAnnotation
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
   * @see org.yazgel.snow.notation.text.snow.SnowPackage#getMANY_TO_MANY_MappedBy()
   * @model
   * @generated
   */
  String getMappedBy();

  /**
   * Sets the value of the '{@link org.yazgel.snow.notation.text.snow.MANY_TO_MANY#getMappedBy <em>Mapped By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped By</em>' attribute.
   * @see #getMappedBy()
   * @generated
   */
  void setMappedBy(String value);

} // MANY_TO_MANY
