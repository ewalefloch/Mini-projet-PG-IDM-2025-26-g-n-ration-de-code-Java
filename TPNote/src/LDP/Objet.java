/**
 */
package LDP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.Objet#getMethods <em>Methods</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getObjet()
 * @model
 * @generated
 */
public interface Objet extends Variable {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link LDP.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see LDP.LDPPackage#getObjet_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Method> getMethods();

} // Objet
