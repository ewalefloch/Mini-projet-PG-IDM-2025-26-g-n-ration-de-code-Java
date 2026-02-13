/**
 */
package LDP2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Primitif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP2.VariablePrimitif#getValeur <em>Valeur</em>}</li>
 * </ul>
 *
 * @see LDP2.LDP2Package#getVariablePrimitif()
 * @model
 * @generated
 */
public interface VariablePrimitif extends Variable {
	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #setValeur(String)
	 * @see LDP2.LDP2Package#getVariablePrimitif_Valeur()
	 * @model
	 * @generated
	 */
	String getValeur();

	/**
	 * Sets the value of the '{@link LDP2.VariablePrimitif#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(String value);

} // VariablePrimitif
