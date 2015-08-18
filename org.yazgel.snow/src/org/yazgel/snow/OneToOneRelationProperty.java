/**
 */
package org.yazgel.snow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One To One Relation Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.snow.OneToOneRelationProperty#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.yazgel.snow.OneToOneRelationProperty#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.yazgel.snow.OneToOneRelationProperty#isOrphanRemoval <em>Orphan Removal</em>}</li>
 * </ul>
 *
 * @see org.yazgel.snow.SnowPackage#getOneToOneRelationProperty()
 * @model
 * @generated
 */
public interface OneToOneRelationProperty extends RelationProperty {
	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see org.yazgel.snow.SnowPackage#getOneToOneRelationProperty_Optional()
	 * @model
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.yazgel.snow.OneToOneRelationProperty#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

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
	 * @see org.yazgel.snow.SnowPackage#getOneToOneRelationProperty_MappedBy()
	 * @model
	 * @generated
	 */
	String getMappedBy();

	/**
	 * Sets the value of the '{@link org.yazgel.snow.OneToOneRelationProperty#getMappedBy <em>Mapped By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped By</em>' attribute.
	 * @see #getMappedBy()
	 * @generated
	 */
	void setMappedBy(String value);

	/**
	 * Returns the value of the '<em><b>Orphan Removal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orphan Removal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orphan Removal</em>' attribute.
	 * @see #setOrphanRemoval(boolean)
	 * @see org.yazgel.snow.SnowPackage#getOneToOneRelationProperty_OrphanRemoval()
	 * @model
	 * @generated
	 */
	boolean isOrphanRemoval();

	/**
	 * Sets the value of the '{@link org.yazgel.snow.OneToOneRelationProperty#isOrphanRemoval <em>Orphan Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orphan Removal</em>' attribute.
	 * @see #isOrphanRemoval()
	 * @generated
	 */
	void setOrphanRemoval(boolean value);

} // OneToOneRelationProperty
