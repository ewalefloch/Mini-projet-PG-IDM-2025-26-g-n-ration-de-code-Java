/**
 */
package LDP.impl;

import LDP.*;

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
public class LDPFactoryImpl extends EFactoryImpl implements LDPFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LDPFactory init() {
		try {
			LDPFactory theLDPFactory = (LDPFactory)EPackage.Registry.INSTANCE.getEFactory(LDPPackage.eNS_URI);
			if (theLDPFactory != null) {
				return theLDPFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LDPFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDPFactoryImpl() {
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
			case LDPPackage.PROCESSUS: return createProcessus();
			case LDPPackage.ACTIVITE: return createActivite();
			case LDPPackage.PSEUDO_ETAT: return createPseudoEtat();
			case LDPPackage.DEBUT: return createDebut();
			case LDPPackage.FIN: return createFin();
			case LDPPackage.CREATION_VAR: return createCreationVar();
			case LDPPackage.INSTANCE_OBJ: return createInstanceObj();
			case LDPPackage.APPEL_METHODE: return createAppelMethode();
			case LDPPackage.VARIABLE_PRIMITIF: return createVariablePrimitif();
			case LDPPackage.OBJET: return createObjet();
			case LDPPackage.METHOD: return createMethod();
			case LDPPackage.PARAMETRE: return createParametre();
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
	public VariablePrimitif createVariablePrimitif() {
		VariablePrimitifImpl variablePrimitif = new VariablePrimitifImpl();
		return variablePrimitif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Objet createObjet() {
		ObjetImpl objet = new ObjetImpl();
		return objet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parametre createParametre() {
		ParametreImpl parametre = new ParametreImpl();
		return parametre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LDPPackage getLDPPackage() {
		return (LDPPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LDPPackage getPackage() {
		return LDPPackage.eINSTANCE;
	}

} //LDPFactoryImpl
