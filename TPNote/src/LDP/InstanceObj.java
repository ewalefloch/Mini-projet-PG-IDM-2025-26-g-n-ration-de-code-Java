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
 *   <li>{@link LDP.InstanceObj#getObjet <em>Objet</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getInstanceObj()
 * @model
 * @generated
 */
public interface InstanceObj extends Action {
	/**
	 * Returns the value of the '<em><b>Objet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objet</em>' containment reference.
	 * @see #setObjet(Objet)
	 * @see LDP.LDPPackage#getInstanceObj_Objet()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Objet getObjet();

	/**
	 * Sets the value of the '{@link LDP.InstanceObj#getObjet <em>Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objet</em>' containment reference.
	 * @see #getObjet()
	 * @generated
	 */
	void setObjet(Objet value);

} // InstanceObj
