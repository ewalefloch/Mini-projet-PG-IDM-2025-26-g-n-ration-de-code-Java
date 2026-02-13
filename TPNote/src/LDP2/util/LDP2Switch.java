/**
 */
package LDP2.util;

import LDP2.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see LDP2.LDP2Package
 * @generated
 */
public class LDP2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LDP2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDP2Switch() {
		if (modelPackage == null) {
			modelPackage = LDP2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LDP2Package.PROCESSUS: {
				Processus processus = (Processus)theEObject;
				T result = caseProcessus(processus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDP2Package.ACTIVITE: {
				Activite activite = (Activite)theEObject;
				T result = caseActivite(activite);
				if (result == null) result = caseElementProcessus(activite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDP2Package.PSEUDO_ETAT: {
				PseudoEtat pseudoEtat = (PseudoEtat)theEObject;
				T result = casePseudoEtat(pseudoEtat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDP2Package.DEBUT: {
				Debut debut = (Debut)theEObject;
				T result = caseDebut(debut);
				if (result == null) result = casePseudoEtat(debut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDP2Package.FIN: {
				Fin fin = (Fin)theEObject;
				T result = caseFin(fin);
				if (result == null) result = casePseudoEtat(fin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDP2Package.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDP2Package.CREATION_VAR: {
				CreationVar creationVar = (CreationVar)theEObject;
				T result = caseCreationVar(creationVar);
				if (result == null) result = caseAction(creationVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDP2Package.INSTANCE_OBJ: {
				InstanceObj instanceObj = (InstanceObj)theEObject;
				T result = caseInstanceObj(instanceObj);
				if (result == null) result = caseAction(instanceObj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDP2Package.APPEL_METHODE: {
				AppelMethode appelMethode = (AppelMethode)theEObject;
				T result = caseAppelMethode(appelMethode);
				if (result == null) result = caseAction(appelMethode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDP2Package.ELEMENT_PROCESSUS: {
				ElementProcessus elementProcessus = (ElementProcessus)theEObject;
				T result = caseElementProcessus(elementProcessus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDP2Package.FOURCHE: {
				Fourche fourche = (Fourche)theEObject;
				T result = caseFourche(fourche);
				if (result == null) result = caseElementProcessus(fourche);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDP2Package.JONCTION: {
				Jonction jonction = (Jonction)theEObject;
				T result = caseJonction(jonction);
				if (result == null) result = caseElementProcessus(jonction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessus(Processus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivite(Activite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pseudo Etat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pseudo Etat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePseudoEtat(PseudoEtat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Debut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Debut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDebut(Debut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFin(Fin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creation Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creation Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreationVar(CreationVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Obj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Obj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceObj(InstanceObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appel Methode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appel Methode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppelMethode(AppelMethode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Processus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Processus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementProcessus(ElementProcessus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fourche</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fourche</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFourche(Fourche object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jonction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jonction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJonction(Jonction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LDP2Switch
