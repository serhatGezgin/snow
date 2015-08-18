/**
 */
package org.yazgel.snow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Many To Many Relation Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.snow.ManyToManyRelationProperty#getMappedBy <em>Mapped By</em>}</li>
 * </ul>
 *
 * @see org.yazgel.snow.SnowPackage#getManyToManyRelationProperty()
 * @model
 * @generated
 */
public interface ManyToManyRelationProperty extends RelationProperty {
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
	 * @see org.yazgel.snow.SnowPackage#getManyToManyRelationProperty_MappedBy()
	 * @model
	 * @generated
	 */
	String getMappedBy();

	/**
	 * Sets the value of the '{@link org.yazgel.snow.ManyToManyRelationProperty#getMappedBy <em>Mapped By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped By</em>' attribute.
	 * @see #getMappedBy()
	 * @generated
	 */
	void setMappedBy(String value);

} // ManyToManyRelationProperty
