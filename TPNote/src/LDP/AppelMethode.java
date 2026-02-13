/**
 */
package LDP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appel Methode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.AppelMethode#getResultat <em>Resultat</em>}</li>
 *   <li>{@link LDP.AppelMethode#getNomMethode <em>Nom Methode</em>}</li>
 *   <li>{@link LDP.AppelMethode#getObjetAppele <em>Objet Appele</em>}</li>
 *   <li>{@link LDP.AppelMethode#getParametres <em>Parametres</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getAppelMethode()
 * @model
 * @generated
 */
public interface AppelMethode extends Action {
	/**
	 * Returns the value of the '<em><b>Resultat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultat</em>' attribute.
	 * @see #setResultat(String)
	 * @see LDP.LDPPackage#getAppelMethode_Resultat()
	 * @model
	 * @generated
	 */
	String getResultat();

	/**
	 * Sets the value of the '{@link LDP.AppelMethode#getResultat <em>Resultat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resultat</em>' attribute.
	 * @see #getResultat()
	 * @generated
	 */
	void setResultat(String value);

	/**
	 * Returns the value of the '<em><b>Nom Methode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Methode</em>' attribute.
	 * @see #setNomMethode(String)
	 * @see LDP.LDPPackage#getAppelMethode_NomMethode()
	 * @model
	 * @generated
	 */
	String getNomMethode();

	/**
	 * Sets the value of the '{@link LDP.AppelMethode#getNomMethode <em>Nom Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Methode</em>' attribute.
	 * @see #getNomMethode()
	 * @generated
	 */
	void setNomMethode(String value);

	/**
	 * Returns the value of the '<em><b>Objet Appele</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objet Appele</em>' attribute.
	 * @see #setObjetAppele(String)
	 * @see LDP.LDPPackage#getAppelMethode_ObjetAppele()
	 * @model
	 * @generated
	 */
	String getObjetAppele();

	/**
	 * Sets the value of the '{@link LDP.AppelMethode#getObjetAppele <em>Objet Appele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objet Appele</em>' attribute.
	 * @see #getObjetAppele()
	 * @generated
	 */
	void setObjetAppele(String value);

	/**
	 * Returns the value of the '<em><b>Parametres</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametres</em>' attribute list.
	 * @see LDP.LDPPackage#getAppelMethode_Parametres()
	 * @model
	 * @generated
	 */
	EList<String> getParametres();

} // AppelMethode
