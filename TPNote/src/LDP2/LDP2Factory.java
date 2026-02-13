/**
 */
package LDP2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see LDP2.LDP2Package
 * @generated
 */
public interface LDP2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LDP2Factory eINSTANCE = LDP2.impl.LDP2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Processus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processus</em>'.
	 * @generated
	 */
	Processus createProcessus();

	/**
	 * Returns a new object of class '<em>Activite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activite</em>'.
	 * @generated
	 */
	Activite createActivite();

	/**
	 * Returns a new object of class '<em>Pseudo Etat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pseudo Etat</em>'.
	 * @generated
	 */
	PseudoEtat createPseudoEtat();

	/**
	 * Returns a new object of class '<em>Debut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Debut</em>'.
	 * @generated
	 */
	Debut createDebut();

	/**
	 * Returns a new object of class '<em>Fin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin</em>'.
	 * @generated
	 */
	Fin createFin();

	/**
	 * Returns a new object of class '<em>Creation Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creation Var</em>'.
	 * @generated
	 */
	CreationVar createCreationVar();

	/**
	 * Returns a new object of class '<em>Instance Obj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Obj</em>'.
	 * @generated
	 */
	InstanceObj createInstanceObj();

	/**
	 * Returns a new object of class '<em>Appel Methode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appel Methode</em>'.
	 * @generated
	 */
	AppelMethode createAppelMethode();

	/**
	 * Returns a new object of class '<em>Fourche</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fourche</em>'.
	 * @generated
	 */
	Fourche createFourche();

	/**
	 * Returns a new object of class '<em>Jonction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jonction</em>'.
	 * @generated
	 */
	Jonction createJonction();

	/**
	 * Returns a new object of class '<em>Variable Primitif</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Primitif</em>'.
	 * @generated
	 */
	VariablePrimitif createVariablePrimitif();

	/**
	 * Returns a new object of class '<em>Objet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objet</em>'.
	 * @generated
	 */
	Objet createObjet();

	/**
	 * Returns a new object of class '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method</em>'.
	 * @generated
	 */
	Method createMethod();

	/**
	 * Returns a new object of class '<em>Parametre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parametre</em>'.
	 * @generated
	 */
	Parametre createParametre();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LDP2Package getLDP2Package();

} //LDP2Factory
