/**
 */
package LDP2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudo Etat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP2.PseudoEtat#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see LDP2.LDP2Package#getPseudoEtat()
 * @model
 * @generated
 */
public interface PseudoEtat extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(ElementProcessus)
	 * @see LDP2.LDP2Package#getPseudoEtat_Reference()
	 * @model required="true"
	 * @generated
	 */
	ElementProcessus getReference();

	/**
	 * Sets the value of the '{@link LDP2.PseudoEtat#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ElementProcessus value);

} // PseudoEtat
