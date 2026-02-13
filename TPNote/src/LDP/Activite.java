/**
 */
package LDP;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.Activite#getName <em>Name</em>}</li>
 *   <li>{@link LDP.Activite#getSuivante <em>Suivante</em>}</li>
 *   <li>{@link LDP.Activite#getPrecedente <em>Precedente</em>}</li>
 *   <li>{@link LDP.Activite#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getActivite()
 * @model
 * @generated
 */
public interface Activite extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see LDP.LDPPackage#getActivite_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link LDP.Activite#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Suivante</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LDP.Activite#getPrecedente <em>Precedente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suivante</em>' reference.
	 * @see #setSuivante(Activite)
	 * @see LDP.LDPPackage#getActivite_Suivante()
	 * @see LDP.Activite#getPrecedente
	 * @model opposite="precedente"
	 * @generated
	 */
	Activite getSuivante();

	/**
	 * Sets the value of the '{@link LDP.Activite#getSuivante <em>Suivante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suivante</em>' reference.
	 * @see #getSuivante()
	 * @generated
	 */
	void setSuivante(Activite value);

	/**
	 * Returns the value of the '<em><b>Precedente</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link LDP.Activite#getSuivante <em>Suivante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedente</em>' reference.
	 * @see #setPrecedente(Activite)
	 * @see LDP.LDPPackage#getActivite_Precedente()
	 * @see LDP.Activite#getSuivante
	 * @model opposite="suivante"
	 * @generated
	 */
	Activite getPrecedente();

	/**
	 * Sets the value of the '{@link LDP.Activite#getPrecedente <em>Precedente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedente</em>' reference.
	 * @see #getPrecedente()
	 * @generated
	 */
	void setPrecedente(Activite value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link LDP.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see LDP.LDPPackage#getActivite_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model actRequired="true"
	 * @generated
	 */
	boolean pasDansSuivant(Activite act);

} // Activite
