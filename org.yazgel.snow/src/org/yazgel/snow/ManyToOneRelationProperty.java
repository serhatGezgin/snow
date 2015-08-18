/**
 */
package org.yazgel.snow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Many To One Relation Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.snow.ManyToOneRelationProperty#isOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @see org.yazgel.snow.SnowPackage#getManyToOneRelationProperty()
 * @model
 * @generated
 */
public interface ManyToOneRelationProperty extends RelationProperty {
	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see org.yazgel.snow.SnowPackage#getManyToOneRelationProperty_Optional()
	 * @model default="true"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.yazgel.snow.ManyToOneRelationProperty#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

} // ManyToOneRelationProperty
