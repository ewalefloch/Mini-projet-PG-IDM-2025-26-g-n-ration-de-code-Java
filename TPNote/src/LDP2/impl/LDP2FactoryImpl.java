/**
 */
package LDP2.impl;

import LDP2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LDP2FactoryImpl extends EFactoryImpl implements LDP2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LDP2Factory init() {
		try {
			LDP2Factory theLDP2Factory = (LDP2Factory)EPackage.Registry.INSTANCE.getEFactory(LDP2Package.eNS_URI);
			if (theLDP2Factory != null) {
				return theLDP2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LDP2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDP2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LDP2Package.PROCESSUS: return createProcessus();
			case LDP2Package.ACTIVITE: return createActivite();
			case LDP2Package.PSEUDO_ETAT: return createPseudoEtat();
			case LDP2Package.DEBUT: return createDebut();
			case LDP2Package.FIN: return createFin();
			case LDP2Package.CREATION_VAR: return createCreationVar();
			case LDP2Package.INSTANCE_OBJ: return createInstanceObj();
			case LDP2Package.APPEL_METHODE: return createAppelMethode();
			case LDP2Package.FOURCHE: return createFourche();
			case LDP2Package.JONCTION: return createJonction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Processus createProcessus() {
		ProcessusImpl processus = new ProcessusImpl();
		return processus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activite createActivite() {
		ActiviteImpl activite = new ActiviteImpl();
		return activite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PseudoEtat createPseudoEtat() {
		PseudoEtatImpl pseudoEtat = new PseudoEtatImpl();
		return pseudoEtat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Debut createDebut() {
		DebutImpl debut = new DebutImpl();
		return debut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fin createFin() {
		FinImpl fin = new FinImpl();
		return fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreationVar createCreationVar() {
		CreationVarImpl creationVar = new CreationVarImpl();
		return creationVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceObj createInstanceObj() {
		InstanceObjImpl instanceObj = new InstanceObjImpl();
		return instanceObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppelMethode createAppelMethode() {
		AppelMethodeImpl appelMethode = new AppelMethodeImpl();
		return appelMethode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fourche createFourche() {
		FourcheImpl fourche = new FourcheImpl();
		return fourche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Jonction createJonction() {
		JonctionImpl jonction = new JonctionImpl();
		return jonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LDP2Package getLDP2Package() {
		return (LDP2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LDP2Package getPackage() {
		return LDP2Package.eINSTANCE;
	}

} //LDP2FactoryImpl
