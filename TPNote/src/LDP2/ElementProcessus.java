/**
 */
package LDP2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Processus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP2.ElementProcessus#getNom <em>Nom</em>}</li>
 *   <li>{@link LDP2.ElementProcessus#getSuivantes <em>Suivantes</em>}</li>
 *   <li>{@link LDP2.ElementProcessus#getPrecedents <em>Precedents</em>}</li>
 * </ul>
 *
 * @see LDP2.LDP2Package#getElementProcessus()
 * @model abstract="true"
 * @generated
 */
public interface ElementProcessus extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see LDP2.LDP2Package#getElementProcessus_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link LDP2.ElementProcessus#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Suivantes</b></em>' reference list.
	 * The list contents are of type {@link LDP2.ElementProcessus}.
	 * It is bidirectional and its opposite is '{@link LDP2.ElementProcessus#getPrecedents <em>Precedents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suivantes</em>' reference list.
	 * @see LDP2.LDP2Package#getElementProcessus_Suivantes()
	 * @see LDP2.ElementProcessus#getPrecedents
	 * @model opposite="precedents"
	 * @generated
	 */
	EList<ElementProcessus> getSuivantes();

	/**
	 * Returns the value of the '<em><b>Precedents</b></em>' reference list.
	 * The list contents are of type {@link LDP2.ElementProcessus}.
	 * It is bidirectional and its opposite is '{@link LDP2.ElementProcessus#getSuivantes <em>Suivantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedents</em>' reference list.
	 * @see LDP2.LDP2Package#getElementProcessus_Precedents()
	 * @see LDP2.ElementProcessus#getSuivantes
	 * @model opposite="suivantes"
	 * @generated
	 */
	EList<ElementProcessus> getPrecedents();

} // ElementProcessus
