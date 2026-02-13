/**
 */
package LDP;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see LDP.LDPFactory
 * @model kind="package"
 * @generated
 */
public interface LDPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LDP";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://LDP/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "LDP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LDPPackage eINSTANCE = LDP.impl.LDPPackageImpl.init();

	/**
	 * The meta object id for the '{@link LDP.impl.ProcessusImpl <em>Processus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.ProcessusImpl
	 * @see LDP.impl.LDPPackageImpl#getProcessus()
	 * @generated
	 */
	int PROCESSUS = 0;

	/**
	 * The feature id for the '<em><b>Activites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__ACTIVITES = 0;

	/**
	 * The feature id for the '<em><b>Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__DEBUT = 1;

	/**
	 * The feature id for the '<em><b>Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__FIN = 2;

	/**
	 * The feature id for the '<em><b>Activite Courante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__ACTIVITE_COURANTE = 3;

	/**
	 * The number of structural features of the '<em>Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDP.impl.ActiviteImpl <em>Activite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.ActiviteImpl
	 * @see LDP.impl.LDPPackageImpl#getActivite()
	 * @generated
	 */
	int ACTIVITE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Suivante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__SUIVANTE = 1;

	/**
	 * The feature id for the '<em><b>Precedente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__PRECEDENTE = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__ACTION = 3;

	/**
	 * The number of structural features of the '<em>Activite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Pas Dans Suivant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE___PAS_DANS_SUIVANT__ACTIVITE = 0;

	/**
	 * The number of operations of the '<em>Activite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link LDP.impl.PseudoEtatImpl <em>Pseudo Etat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.PseudoEtatImpl
	 * @see LDP.impl.LDPPackageImpl#getPseudoEtat()
	 * @generated
	 */
	int PSEUDO_ETAT = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_ETAT__REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Pseudo Etat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_ETAT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pseudo Etat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_ETAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDP.impl.DebutImpl <em>Debut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.DebutImpl
	 * @see LDP.impl.LDPPackageImpl#getDebut()
	 * @generated
	 */
	int DEBUT = 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT__REFERENCE = PSEUDO_ETAT__REFERENCE;

	/**
	 * The number of structural features of the '<em>Debut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT_FEATURE_COUNT = PSEUDO_ETAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Debut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT_OPERATION_COUNT = PSEUDO_ETAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.impl.FinImpl <em>Fin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.FinImpl
	 * @see LDP.impl.LDPPackageImpl#getFin()
	 * @generated
	 */
	int FIN = 4;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN__REFERENCE = PSEUDO_ETAT__REFERENCE;

	/**
	 * The number of structural features of the '<em>Fin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_FEATURE_COUNT = PSEUDO_ETAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_OPERATION_COUNT = PSEUDO_ETAT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link LDP.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.ActionImpl
	 * @see LDP.impl.LDPPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 5;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDP.impl.CreationVarImpl <em>Creation Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.CreationVarImpl
	 * @see LDP.impl.LDPPackageImpl#getCreationVar()
	 * @generated
	 */
	int CREATION_VAR = 6;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_VAR__VAR = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Creation Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_VAR_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Creation Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_VAR_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.impl.InstanceObjImpl <em>Instance Obj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.InstanceObjImpl
	 * @see LDP.impl.LDPPackageImpl#getInstanceObj()
	 * @generated
	 */
	int INSTANCE_OBJ = 7;

	/**
	 * The feature id for the '<em><b>Objet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJ__OBJET = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Obj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJ_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instance Obj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJ_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.impl.AppelMethodeImpl <em>Appel Methode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.AppelMethodeImpl
	 * @see LDP.impl.LDPPackageImpl#getAppelMethode()
	 * @generated
	 */
	int APPEL_METHODE = 8;

	/**
	 * The feature id for the '<em><b>Resultat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_METHODE__RESULTAT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objet Appele</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_METHODE__OBJET_APPELE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parametre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_METHODE__PARAMETRE = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_METHODE__METHOD = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Appel Methode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_METHODE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Appel Methode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_METHODE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link LDP.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.VariableImpl
	 * @see LDP.impl.LDPPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDP.impl.VariablePrimitifImpl <em>Variable Primitif</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.VariablePrimitifImpl
	 * @see LDP.impl.LDPPackageImpl#getVariablePrimitif()
	 * @generated
	 */
	int VARIABLE_PRIMITIF = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_PRIMITIF__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_PRIMITIF__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_PRIMITIF__VALEUR = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Primitif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_PRIMITIF_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Primitif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_PRIMITIF_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.impl.ObjetImpl <em>Objet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.ObjetImpl
	 * @see LDP.impl.LDPPackageImpl#getObjet()
	 * @generated
	 */
	int OBJET = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET__METHODS = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Objet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Objet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJET_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.MethodImpl
	 * @see LDP.impl.LDPPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 12;

	/**
	 * The feature id for the '<em><b>Nom Methode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NOM_METHODE = 0;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDP.impl.ParametreImpl <em>Parametre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.ParametreImpl
	 * @see LDP.impl.LDPPackageImpl#getParametre()
	 * @generated
	 */
	int PARAMETRE = 13;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRE__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Parametre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parametre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link LDP.Processus <em>Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processus</em>'.
	 * @see LDP.Processus
	 * @generated
	 */
	EClass getProcessus();

	/**
	 * Returns the meta object for the containment reference list '{@link LDP.Processus#getActivites <em>Activites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activites</em>'.
	 * @see LDP.Processus#getActivites()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Activites();

	/**
	 * Returns the meta object for the containment reference '{@link LDP.Processus#getDebut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Debut</em>'.
	 * @see LDP.Processus#getDebut()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Debut();

	/**
	 * Returns the meta object for the containment reference '{@link LDP.Processus#getFin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fin</em>'.
	 * @see LDP.Processus#getFin()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Fin();

	/**
	 * Returns the meta object for the reference '{@link LDP.Processus#getActiviteCourante <em>Activite Courante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activite Courante</em>'.
	 * @see LDP.Processus#getActiviteCourante()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_ActiviteCourante();

	/**
	 * Returns the meta object for class '{@link LDP.Activite <em>Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activite</em>'.
	 * @see LDP.Activite
	 * @generated
	 */
	EClass getActivite();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Activite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see LDP.Activite#getName()
	 * @see #getActivite()
	 * @generated
	 */
	EAttribute getActivite_Name();

	/**
	 * Returns the meta object for the reference '{@link LDP.Activite#getSuivante <em>Suivante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Suivante</em>'.
	 * @see LDP.Activite#getSuivante()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_Suivante();

	/**
	 * Returns the meta object for the reference '{@link LDP.Activite#getPrecedente <em>Precedente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precedente</em>'.
	 * @see LDP.Activite#getPrecedente()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_Precedente();

	/**
	 * Returns the meta object for the containment reference list '{@link LDP.Activite#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see LDP.Activite#getAction()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_Action();

	/**
	 * Returns the meta object for the '{@link LDP.Activite#pasDansSuivant(LDP.Activite) <em>Pas Dans Suivant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pas Dans Suivant</em>' operation.
	 * @see LDP.Activite#pasDansSuivant(LDP.Activite)
	 * @generated
	 */
	EOperation getActivite__PasDansSuivant__Activite();

	/**
	 * Returns the meta object for class '{@link LDP.PseudoEtat <em>Pseudo Etat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudo Etat</em>'.
	 * @see LDP.PseudoEtat
	 * @generated
	 */
	EClass getPseudoEtat();

	/**
	 * Returns the meta object for the reference '{@link LDP.PseudoEtat#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see LDP.PseudoEtat#getReference()
	 * @see #getPseudoEtat()
	 * @generated
	 */
	EReference getPseudoEtat_Reference();

	/**
	 * Returns the meta object for class '{@link LDP.Debut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Debut</em>'.
	 * @see LDP.Debut
	 * @generated
	 */
	EClass getDebut();

	/**
	 * Returns the meta object for class '{@link LDP.Fin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin</em>'.
	 * @see LDP.Fin
	 * @generated
	 */
	EClass getFin();

	/**
	 * Returns the meta object for class '{@link LDP.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see LDP.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link LDP.CreationVar <em>Creation Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation Var</em>'.
	 * @see LDP.CreationVar
	 * @generated
	 */
	EClass getCreationVar();

	/**
	 * Returns the meta object for the containment reference '{@link LDP.CreationVar#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var</em>'.
	 * @see LDP.CreationVar#getVar()
	 * @see #getCreationVar()
	 * @generated
	 */
	EReference getCreationVar_Var();

	/**
	 * Returns the meta object for class '{@link LDP.InstanceObj <em>Instance Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Obj</em>'.
	 * @see LDP.InstanceObj
	 * @generated
	 */
	EClass getInstanceObj();

	/**
	 * Returns the meta object for the containment reference '{@link LDP.InstanceObj#getObjet <em>Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Objet</em>'.
	 * @see LDP.InstanceObj#getObjet()
	 * @see #getInstanceObj()
	 * @generated
	 */
	EReference getInstanceObj_Objet();

	/**
	 * Returns the meta object for class '{@link LDP.AppelMethode <em>Appel Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appel Methode</em>'.
	 * @see LDP.AppelMethode
	 * @generated
	 */
	EClass getAppelMethode();

	/**
	 * Returns the meta object for the reference '{@link LDP.AppelMethode#getResultat <em>Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resultat</em>'.
	 * @see LDP.AppelMethode#getResultat()
	 * @see #getAppelMethode()
	 * @generated
	 */
	EReference getAppelMethode_Resultat();

	/**
	 * Returns the meta object for the reference '{@link LDP.AppelMethode#getObjetAppele <em>Objet Appele</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objet Appele</em>'.
	 * @see LDP.AppelMethode#getObjetAppele()
	 * @see #getAppelMethode()
	 * @generated
	 */
	EReference getAppelMethode_ObjetAppele();

	/**
	 * Returns the meta object for the containment reference '{@link LDP.AppelMethode#getParametre <em>Parametre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parametre</em>'.
	 * @see LDP.AppelMethode#getParametre()
	 * @see #getAppelMethode()
	 * @generated
	 */
	EReference getAppelMethode_Parametre();

	/**
	 * Returns the meta object for the reference '{@link LDP.AppelMethode#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see LDP.AppelMethode#getMethod()
	 * @see #getAppelMethode()
	 * @generated
	 */
	EReference getAppelMethode_Method();

	/**
	 * Returns the meta object for class '{@link LDP.VariablePrimitif <em>Variable Primitif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Primitif</em>'.
	 * @see LDP.VariablePrimitif
	 * @generated
	 */
	EClass getVariablePrimitif();

	/**
	 * Returns the meta object for the attribute '{@link LDP.VariablePrimitif#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see LDP.VariablePrimitif#getValeur()
	 * @see #getVariablePrimitif()
	 * @generated
	 */
	EAttribute getVariablePrimitif_Valeur();

	/**
	 * Returns the meta object for class '{@link LDP.Objet <em>Objet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objet</em>'.
	 * @see LDP.Objet
	 * @generated
	 */
	EClass getObjet();

	/**
	 * Returns the meta object for the containment reference list '{@link LDP.Objet#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see LDP.Objet#getMethods()
	 * @see #getObjet()
	 * @generated
	 */
	EReference getObjet_Methods();

	/**
	 * Returns the meta object for class '{@link LDP.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see LDP.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see LDP.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see LDP.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for class '{@link LDP.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see LDP.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Method#getNomMethode <em>Nom Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Methode</em>'.
	 * @see LDP.Method#getNomMethode()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_NomMethode();

	/**
	 * Returns the meta object for class '{@link LDP.Parametre <em>Parametre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametre</em>'.
	 * @see LDP.Parametre
	 * @generated
	 */
	EClass getParametre();

	/**
	 * Returns the meta object for the reference list '{@link LDP.Parametre#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see LDP.Parametre#getParameters()
	 * @see #getParametre()
	 * @generated
	 */
	EReference getParametre_Parameters();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LDPFactory getLDPFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link LDP.impl.ProcessusImpl <em>Processus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.ProcessusImpl
		 * @see LDP.impl.LDPPackageImpl#getProcessus()
		 * @generated
		 */
		EClass PROCESSUS = eINSTANCE.getProcessus();

		/**
		 * The meta object literal for the '<em><b>Activites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__ACTIVITES = eINSTANCE.getProcessus_Activites();

		/**
		 * The meta object literal for the '<em><b>Debut</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__DEBUT = eINSTANCE.getProcessus_Debut();

		/**
		 * The meta object literal for the '<em><b>Fin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__FIN = eINSTANCE.getProcessus_Fin();

		/**
		 * The meta object literal for the '<em><b>Activite Courante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__ACTIVITE_COURANTE = eINSTANCE.getProcessus_ActiviteCourante();

		/**
		 * The meta object literal for the '{@link LDP.impl.ActiviteImpl <em>Activite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.ActiviteImpl
		 * @see LDP.impl.LDPPackageImpl#getActivite()
		 * @generated
		 */
		EClass ACTIVITE = eINSTANCE.getActivite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITE__NAME = eINSTANCE.getActivite_Name();

		/**
		 * The meta object literal for the '<em><b>Suivante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITE__SUIVANTE = eINSTANCE.getActivite_Suivante();

		/**
		 * The meta object literal for the '<em><b>Precedente</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITE__PRECEDENTE = eINSTANCE.getActivite_Precedente();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITE__ACTION = eINSTANCE.getActivite_Action();

		/**
		 * The meta object literal for the '<em><b>Pas Dans Suivant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITE___PAS_DANS_SUIVANT__ACTIVITE = eINSTANCE.getActivite__PasDansSuivant__Activite();

		/**
		 * The meta object literal for the '{@link LDP.impl.PseudoEtatImpl <em>Pseudo Etat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.PseudoEtatImpl
		 * @see LDP.impl.LDPPackageImpl#getPseudoEtat()
		 * @generated
		 */
		EClass PSEUDO_ETAT = eINSTANCE.getPseudoEtat();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSEUDO_ETAT__REFERENCE = eINSTANCE.getPseudoEtat_Reference();

		/**
		 * The meta object literal for the '{@link LDP.impl.DebutImpl <em>Debut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.DebutImpl
		 * @see LDP.impl.LDPPackageImpl#getDebut()
		 * @generated
		 */
		EClass DEBUT = eINSTANCE.getDebut();

		/**
		 * The meta object literal for the '{@link LDP.impl.FinImpl <em>Fin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.FinImpl
		 * @see LDP.impl.LDPPackageImpl#getFin()
		 * @generated
		 */
		EClass FIN = eINSTANCE.getFin();

		/**
		 * The meta object literal for the '{@link LDP.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.ActionImpl
		 * @see LDP.impl.LDPPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link LDP.impl.CreationVarImpl <em>Creation Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.CreationVarImpl
		 * @see LDP.impl.LDPPackageImpl#getCreationVar()
		 * @generated
		 */
		EClass CREATION_VAR = eINSTANCE.getCreationVar();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATION_VAR__VAR = eINSTANCE.getCreationVar_Var();

		/**
		 * The meta object literal for the '{@link LDP.impl.InstanceObjImpl <em>Instance Obj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.InstanceObjImpl
		 * @see LDP.impl.LDPPackageImpl#getInstanceObj()
		 * @generated
		 */
		EClass INSTANCE_OBJ = eINSTANCE.getInstanceObj();

		/**
		 * The meta object literal for the '<em><b>Objet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_OBJ__OBJET = eINSTANCE.getInstanceObj_Objet();

		/**
		 * The meta object literal for the '{@link LDP.impl.AppelMethodeImpl <em>Appel Methode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.AppelMethodeImpl
		 * @see LDP.impl.LDPPackageImpl#getAppelMethode()
		 * @generated
		 */
		EClass APPEL_METHODE = eINSTANCE.getAppelMethode();

		/**
		 * The meta object literal for the '<em><b>Resultat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEL_METHODE__RESULTAT = eINSTANCE.getAppelMethode_Resultat();

		/**
		 * The meta object literal for the '<em><b>Objet Appele</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEL_METHODE__OBJET_APPELE = eINSTANCE.getAppelMethode_ObjetAppele();

		/**
		 * The meta object literal for the '<em><b>Parametre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEL_METHODE__PARAMETRE = eINSTANCE.getAppelMethode_Parametre();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEL_METHODE__METHOD = eINSTANCE.getAppelMethode_Method();

		/**
		 * The meta object literal for the '{@link LDP.impl.VariablePrimitifImpl <em>Variable Primitif</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.VariablePrimitifImpl
		 * @see LDP.impl.LDPPackageImpl#getVariablePrimitif()
		 * @generated
		 */
		EClass VARIABLE_PRIMITIF = eINSTANCE.getVariablePrimitif();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_PRIMITIF__VALEUR = eINSTANCE.getVariablePrimitif_Valeur();

		/**
		 * The meta object literal for the '{@link LDP.impl.ObjetImpl <em>Objet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.ObjetImpl
		 * @see LDP.impl.LDPPackageImpl#getObjet()
		 * @generated
		 */
		EClass OBJET = eINSTANCE.getObjet();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJET__METHODS = eINSTANCE.getObjet_Methods();

		/**
		 * The meta object literal for the '{@link LDP.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.VariableImpl
		 * @see LDP.impl.LDPPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link LDP.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.MethodImpl
		 * @see LDP.impl.LDPPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Nom Methode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NOM_METHODE = eINSTANCE.getMethod_NomMethode();

		/**
		 * The meta object literal for the '{@link LDP.impl.ParametreImpl <em>Parametre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.ParametreImpl
		 * @see LDP.impl.LDPPackageImpl#getParametre()
		 * @generated
		 */
		EClass PARAMETRE = eINSTANCE.getParametre();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRE__PARAMETERS = eINSTANCE.getParametre_Parameters();

	}

} //LDPPackage
