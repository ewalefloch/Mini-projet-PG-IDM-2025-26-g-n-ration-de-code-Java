/**
 */
package LDP;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.Method#getNomMethode <em>Nom Methode</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom Methode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Methode</em>' attribute.
	 * @see #setNomMethode(String)
	 * @see LDP.LDPPackage#getMethod_NomMethode()
	 * @model required="true"
	 * @generated
	 */
	String getNomMethode();

	/**
	 * Sets the value of the '{@link LDP.Method#getNomMethode <em>Nom Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Methode</em>' attribute.
	 * @see #getNomMethode()
	 * @generated
	 */
	void setNomMethode(String value);

} // Method
