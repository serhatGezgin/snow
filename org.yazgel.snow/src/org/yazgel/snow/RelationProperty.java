/**
 */
package org.yazgel.snow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.snow.RelationProperty#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.yazgel.snow.RelationProperty#getFetch <em>Fetch</em>}</li>
 * </ul>
 *
 * @see org.yazgel.snow.SnowPackage#getRelationProperty()
 * @model abstract="true"
 * @generated
 */
public interface RelationProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Cascade</b></em>' attribute list.
	 * The list contents are of type {@link org.yazgel.snow.CascadeType}.
	 * The literals are from the enumeration {@link org.yazgel.snow.CascadeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cascade</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade</em>' attribute list.
	 * @see org.yazgel.snow.CascadeType
	 * @see org.yazgel.snow.SnowPackage#getRelationProperty_Cascade()
	 * @model
	 * @generated
	 */
	EList<CascadeType> getCascade();

	/**
	 * Returns the value of the '<em><b>Fetch</b></em>' attribute.
	 * The literals are from the enumeration {@link org.yazgel.snow.FetchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fetch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fetch</em>' attribute.
	 * @see org.yazgel.snow.FetchType
	 * @see #setFetch(FetchType)
	 * @see org.yazgel.snow.SnowPackage#getRelationProperty_Fetch()
	 * @model
	 * @generated
	 */
	FetchType getFetch();

	/**
	 * Sets the value of the '{@link org.yazgel.snow.RelationProperty#getFetch <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fetch</em>' attribute.
	 * @see org.yazgel.snow.FetchType
	 * @see #getFetch()
	 * @generated
	 */
	void setFetch(FetchType value);

} // RelationProperty
