/**
 */
package org.yazgel.snow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.snow.ComplexProperty#getRelationType <em>Relation Type</em>}</li>
 *   <li>{@link org.yazgel.snow.ComplexProperty#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.yazgel.snow.ComplexProperty#getMappedBy <em>Mapped By</em>}</li>
 * </ul>
 *
 * @see org.yazgel.snow.SnowPackage#getComplexProperty()
 * @model
 * @generated
 */
public interface ComplexProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Relation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.yazgel.snow.RelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Type</em>' attribute.
	 * @see org.yazgel.snow.RelationType
	 * @see #setRelationType(RelationType)
	 * @see org.yazgel.snow.SnowPackage#getComplexProperty_RelationType()
	 * @model
	 * @generated
	 */
	RelationType getRelationType();

	/**
	 * Sets the value of the '{@link org.yazgel.snow.ComplexProperty#getRelationType <em>Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Type</em>' attribute.
	 * @see org.yazgel.snow.RelationType
	 * @see #getRelationType()
	 * @generated
	 */
	void setRelationType(RelationType value);

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
	 * @see org.yazgel.snow.SnowPackage#getComplexProperty_Optional()
	 * @model default="true"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.yazgel.snow.ComplexProperty#isOptional <em>Optional</em>}' attribute.
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
	 * @see org.yazgel.snow.SnowPackage#getComplexProperty_MappedBy()
	 * @model
	 * @generated
	 */
	String getMappedBy();

	/**
	 * Sets the value of the '{@link org.yazgel.snow.ComplexProperty#getMappedBy <em>Mapped By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped By</em>' attribute.
	 * @see #getMappedBy()
	 * @generated
	 */
	void setMappedBy(String value);

} // ComplexProperty
