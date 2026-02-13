/**
 */
package LDP2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP2.Parametre#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see LDP2.LDP2Package#getParametre()
 * @model
 * @generated
 */
public interface Parametre extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link LDP2.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see LDP2.LDP2Package#getParametre_Parameters()
	 * @model
	 * @generated
	 */
	EList<Variable> getParameters();

} // Parametre
