/**
 */
package LDP2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP2.Processus#getElements <em>Elements</em>}</li>
 *   <li>{@link LDP2.Processus#getDebut <em>Debut</em>}</li>
 *   <li>{@link LDP2.Processus#getFin <em>Fin</em>}</li>
 *   <li>{@link LDP2.Processus#getElementCourante <em>Element Courante</em>}</li>
 * </ul>
 *
 * @see LDP2.LDP2Package#getProcessus()
 * @model
 * @generated
 */
public interface Processus extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link LDP2.ElementProcessus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see LDP2.LDP2Package#getProcessus_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ElementProcessus> getElements();

	/**
	 * Returns the value of the '<em><b>Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut</em>' containment reference.
	 * @see #setDebut(Debut)
	 * @see LDP2.LDP2Package#getProcessus_Debut()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Debut getDebut();

	/**
	 * Sets the value of the '{@link LDP2.Processus#getDebut <em>Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut</em>' containment reference.
	 * @see #getDebut()
	 * @generated
	 */
	void setDebut(Debut value);

	/**
	 * Returns the value of the '<em><b>Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin</em>' containment reference.
	 * @see #setFin(Fin)
	 * @see LDP2.LDP2Package#getProcessus_Fin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Fin getFin();

	/**
	 * Sets the value of the '{@link LDP2.Processus#getFin <em>Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin</em>' containment reference.
	 * @see #getFin()
	 * @generated
	 */
	void setFin(Fin value);

	/**
	 * Returns the value of the '<em><b>Element Courante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Courante</em>' reference.
	 * @see #setElementCourante(ElementProcessus)
	 * @see LDP2.LDP2Package#getProcessus_ElementCourante()
	 * @model
	 * @generated
	 */
	ElementProcessus getElementCourante();

	/**
	 * Sets the value of the '{@link LDP2.Processus#getElementCourante <em>Element Courante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Courante</em>' reference.
	 * @see #getElementCourante()
	 * @generated
	 */
	void setElementCourante(ElementProcessus value);

} // Processus
