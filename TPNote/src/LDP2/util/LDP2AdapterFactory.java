/**
 */
package LDP2.util;

import LDP2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see LDP2.LDP2Package
 * @generated
 */
public class LDP2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LDP2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDP2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LDP2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LDP2Switch<Adapter> modelSwitch =
		new LDP2Switch<Adapter>() {
			@Override
			public Adapter caseProcessus(Processus object) {
				return createProcessusAdapter();
			}
			@Override
			public Adapter caseActivite(Activite object) {
				return createActiviteAdapter();
			}
			@Override
			public Adapter casePseudoEtat(PseudoEtat object) {
				return createPseudoEtatAdapter();
			}
			@Override
			public Adapter caseDebut(Debut object) {
				return createDebutAdapter();
			}
			@Override
			public Adapter caseFin(Fin object) {
				return createFinAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseCreationVar(CreationVar object) {
				return createCreationVarAdapter();
			}
			@Override
			public Adapter caseInstanceObj(InstanceObj object) {
				return createInstanceObjAdapter();
			}
			@Override
			public Adapter caseAppelMethode(AppelMethode object) {
				return createAppelMethodeAdapter();
			}
			@Override
			public Adapter caseElementProcessus(ElementProcessus object) {
				return createElementProcessusAdapter();
			}
			@Override
			public Adapter caseFourche(Fourche object) {
				return createFourcheAdapter();
			}
			@Override
			public Adapter caseJonction(Jonction object) {
				return createJonctionAdapter();
			}
			@Override
			public Adapter caseVariablePrimitif(VariablePrimitif object) {
				return createVariablePrimitifAdapter();
			}
			@Override
			public Adapter caseObjet(Objet object) {
				return createObjetAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter caseParametre(Parametre object) {
				return createParametreAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link LDP2.Processus <em>Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP2.Processus
	 * @generated
	 */
	public Adapter createProcessusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP2.Activite <em>Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP2.Activite
	 * @generated
	 */
	public Adapter createActiviteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP2.PseudoEtat <em>Pseudo Etat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP2.PseudoEtat
	 * @generated
	 */
	public Adapter createPseudoEtatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP2.Debut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP2.Debut
	 * @generated
	 */
	public Adapter createDebutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP2.Fin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP2.Fin
	 * @generated
	 */
	public Adapter createFinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP2.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP2.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP2.CreationVar <em>Creation Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP2.CreationVar
	 * @generated
	 */
	public Adapter createCreationVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP2.InstanceObj <em>Instance Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP2.InstanceObj
	 * @generated
	 */
	public Adapter createInstanceObjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP2.AppelMethode <em>Appel Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP2.AppelMethode
	 * @generated
	 */
	public Adapter createAppelMethodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP2.ElementProcessus <em>Element Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP2.ElementProcessus
	 * @generated
	 */
	public Adapter createElementProcessusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP2.Fourche <em>Fourche</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP2.Fourche
	 * @generated
	 */
	public Adapter createFourcheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP2.Jonction <em>Jonction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP2.Jonction
	 * @generated
	 */
	public Adapter createJonctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP2.VariablePrimitif <em>Variable Primitif</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP2.VariablePrimitif
	 * @generated
	 */
	public Adapter createVariablePrimitifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP2.Objet <em>Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP2.Objet
	 * @generated
	 */
	public Adapter createObjetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP2.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP2.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP2.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP2.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDP2.Parametre <em>Parametre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDP2.Parametre
	 * @generated
	 */
	public Adapter createParametreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LDP2AdapterFactory
