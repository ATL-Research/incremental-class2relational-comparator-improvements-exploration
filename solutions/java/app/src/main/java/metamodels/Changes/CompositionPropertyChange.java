/**
 */
package metamodels.Changes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Property Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodels.Changes.CompositionPropertyChange#getNewValue <em>New Value</em>}</li>
 *   <li>{@link metamodels.Changes.CompositionPropertyChange#getOldValue <em>Old Value</em>}</li>
 * </ul>
 *
 * @see metamodels.Changes.ChangesPackage#getCompositionPropertyChange()
 * @model
 * @generated
 */
public interface CompositionPropertyChange extends CompositionChange {
	/**
	 * Returns the value of the '<em><b>New Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' containment reference.
	 * @see #setNewValue(EObject)
	 * @see metamodels.Changes.ChangesPackage#getCompositionPropertyChange_NewValue()
	 * @model containment="true"
	 * @generated
	 */
	EObject getNewValue();

	/**
	 * Sets the value of the '{@link metamodels.Changes.CompositionPropertyChange#getNewValue <em>New Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' containment reference.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(EObject value);

	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' reference.
	 * @see #setOldValue(EObject)
	 * @see metamodels.Changes.ChangesPackage#getCompositionPropertyChange_OldValue()
	 * @model
	 * @generated
	 */
	EObject getOldValue();

	/**
	 * Sets the value of the '{@link metamodels.Changes.CompositionPropertyChange#getOldValue <em>Old Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' reference.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(EObject value);

} // CompositionPropertyChange
