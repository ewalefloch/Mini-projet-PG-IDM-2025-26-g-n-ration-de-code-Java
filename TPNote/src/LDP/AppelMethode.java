/**
 */
package LDP;

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
 *   <li>{@link LDP.AppelMethode#getObjetAppele <em>Objet Appele</em>}</li>
 *   <li>{@link LDP.AppelMethode#getParametre <em>Parametre</em>}</li>
 *   <li>{@link LDP.AppelMethode#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getAppelMethode()
 * @model
 * @generated
 */
public interface AppelMethode extends Action {
	/**
	 * Returns the value of the '<em><b>Resultat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultat</em>' reference.
	 * @see #setResultat(VariablePrimitif)
	 * @see LDP.LDPPackage#getAppelMethode_Resultat()
	 * @model
	 * @generated
	 */
	VariablePrimitif getResultat();

	/**
	 * Sets the value of the '{@link LDP.AppelMethode#getResultat <em>Resultat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resultat</em>' reference.
	 * @see #getResultat()
	 * @generated
	 */
	void setResultat(VariablePrimitif value);

	/**
	 * Returns the value of the '<em><b>Objet Appele</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objet Appele</em>' reference.
	 * @see #setObjetAppele(Objet)
	 * @see LDP.LDPPackage#getAppelMethode_ObjetAppele()
	 * @model required="true"
	 * @generated
	 */
	Objet getObjetAppele();

	/**
	 * Sets the value of the '{@link LDP.AppelMethode#getObjetAppele <em>Objet Appele</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objet Appele</em>' reference.
	 * @see #getObjetAppele()
	 * @generated
	 */
	void setObjetAppele(Objet value);

	/**
	 * Returns the value of the '<em><b>Parametre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametre</em>' containment reference.
	 * @see #setParametre(Parametre)
	 * @see LDP.LDPPackage#getAppelMethode_Parametre()
	 * @model containment="true"
	 * @generated
	 */
	Parametre getParametre();

	/**
	 * Sets the value of the '{@link LDP.AppelMethode#getParametre <em>Parametre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parametre</em>' containment reference.
	 * @see #getParametre()
	 * @generated
	 */
	void setParametre(Parametre value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(Method)
	 * @see LDP.LDPPackage#getAppelMethode_Method()
	 * @model required="true"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link LDP.AppelMethode#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

} // AppelMethode
