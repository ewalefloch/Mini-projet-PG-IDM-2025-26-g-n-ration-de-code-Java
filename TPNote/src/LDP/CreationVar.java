/**
 */
package LDP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creation Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.CreationVar#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getCreationVar()
 * @model
 * @generated
 */
public interface CreationVar extends Action {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' containment reference.
	 * @see #setVar(VariablePrimitif)
	 * @see LDP.LDPPackage#getCreationVar_Var()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VariablePrimitif getVar();

	/**
	 * Sets the value of the '{@link LDP.CreationVar#getVar <em>Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' containment reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(VariablePrimitif value);

} // CreationVar
