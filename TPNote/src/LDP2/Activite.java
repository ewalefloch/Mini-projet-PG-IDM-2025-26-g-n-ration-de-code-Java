/**
 */
package LDP2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP2.Activite#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see LDP2.LDP2Package#getActivite()
 * @model
 * @generated
 */
public interface Activite extends ElementProcessus {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link LDP2.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see LDP2.LDP2Package#getActivite_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Activite
