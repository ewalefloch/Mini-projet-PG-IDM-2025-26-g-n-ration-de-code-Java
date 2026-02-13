/**
 */
package LDP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Obj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.InstanceObj#getNom <em>Nom</em>}</li>
 *   <li>{@link LDP.InstanceObj#getClasse <em>Classe</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getInstanceObj()
 * @model
 * @generated
 */
public interface InstanceObj extends Action {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see LDP.LDPPackage#getInstanceObj_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link LDP.InstanceObj#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Classe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe</em>' attribute.
	 * @see #setClasse(String)
	 * @see LDP.LDPPackage#getInstanceObj_Classe()
	 * @model
	 * @generated
	 */
	String getClasse();

	/**
	 * Sets the value of the '{@link LDP.InstanceObj#getClasse <em>Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classe</em>' attribute.
	 * @see #getClasse()
	 * @generated
	 */
	void setClasse(String value);

} // InstanceObj
