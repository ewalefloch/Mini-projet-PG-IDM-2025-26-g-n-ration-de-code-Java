/**
 */
package LDP2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see LDP2.LDP2Factory
 * @model kind="package"
 * @generated
 */
public interface LDP2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LDP2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://LDPSequence/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "LDP2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LDP2Package eINSTANCE = LDP2.impl.LDP2PackageImpl.init();

	/**
	 * The meta object id for the '{@link LDP2.impl.ProcessusImpl <em>Processus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP2.impl.ProcessusImpl
	 * @see LDP2.impl.LDP2PackageImpl#getProcessus()
	 * @generated
	 */
	int PROCESSUS = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__ELEMENTS = 0;

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
	 * The feature id for the '<em><b>Element Courante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__ELEMENT_COURANTE = 3;

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
	 * The meta object id for the '{@link LDP2.impl.ElementProcessusImpl <em>Element Processus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP2.impl.ElementProcessusImpl
	 * @see LDP2.impl.LDP2PackageImpl#getElementProcessus()
	 * @generated
	 */
	int ELEMENT_PROCESSUS = 9;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROCESSUS__NOM = 0;

	/**
	 * The feature id for the '<em><b>Suivantes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROCESSUS__SUIVANTES = 1;

	/**
	 * The feature id for the '<em><b>Precedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROCESSUS__PRECEDENTS = 2;

	/**
	 * The number of structural features of the '<em>Element Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROCESSUS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROCESSUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDP2.impl.ActiviteImpl <em>Activite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP2.impl.ActiviteImpl
	 * @see LDP2.impl.LDP2PackageImpl#getActivite()
	 * @generated
	 */
	int ACTIVITE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__NOM = ELEMENT_PROCESSUS__NOM;

	/**
	 * The feature id for the '<em><b>Suivantes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__SUIVANTES = ELEMENT_PROCESSUS__SUIVANTES;

	/**
	 * The feature id for the '<em><b>Precedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__PRECEDENTS = ELEMENT_PROCESSUS__PRECEDENTS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__ACTIONS = ELEMENT_PROCESSUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE_FEATURE_COUNT = ELEMENT_PROCESSUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE_OPERATION_COUNT = ELEMENT_PROCESSUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP2.impl.PseudoEtatImpl <em>Pseudo Etat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP2.impl.PseudoEtatImpl
	 * @see LDP2.impl.LDP2PackageImpl#getPseudoEtat()
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
	 * The meta object id for the '{@link LDP2.impl.DebutImpl <em>Debut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP2.impl.DebutImpl
	 * @see LDP2.impl.LDP2PackageImpl#getDebut()
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
	 * The meta object id for the '{@link LDP2.impl.FinImpl <em>Fin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP2.impl.FinImpl
	 * @see LDP2.impl.LDP2PackageImpl#getFin()
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
	 * The meta object id for the '{@link LDP2.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP2.impl.ActionImpl
	 * @see LDP2.impl.LDP2PackageImpl#getAction()
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
	 * The meta object id for the '{@link LDP2.impl.CreationVarImpl <em>Creation Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP2.impl.CreationVarImpl
	 * @see LDP2.impl.LDP2PackageImpl#getCreationVar()
	 * @generated
	 */
	int CREATION_VAR = 6;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_VAR__NOM = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_VAR__TYPE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_VAR__VALEUR = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Creation Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_VAR_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Creation Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_VAR_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP2.impl.InstanceObjImpl <em>Instance Obj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP2.impl.InstanceObjImpl
	 * @see LDP2.impl.LDP2PackageImpl#getInstanceObj()
	 * @generated
	 */
	int INSTANCE_OBJ = 7;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJ__NOM = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJ__CLASSE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Obj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJ_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instance Obj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OBJ_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP2.impl.AppelMethodeImpl <em>Appel Methode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP2.impl.AppelMethodeImpl
	 * @see LDP2.impl.LDP2PackageImpl#getAppelMethode()
	 * @generated
	 */
	int APPEL_METHODE = 8;

	/**
	 * The feature id for the '<em><b>Resultat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_METHODE__RESULTAT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nom Methode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_METHODE__NOM_METHODE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Objet Appele</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_METHODE__OBJET_APPELE = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parametres</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEL_METHODE__PARAMETRES = ACTION_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link LDP2.impl.FourcheImpl <em>Fourche</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP2.impl.FourcheImpl
	 * @see LDP2.impl.LDP2PackageImpl#getFourche()
	 * @generated
	 */
	int FOURCHE = 10;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOURCHE__NOM = ELEMENT_PROCESSUS__NOM;

	/**
	 * The feature id for the '<em><b>Suivantes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOURCHE__SUIVANTES = ELEMENT_PROCESSUS__SUIVANTES;

	/**
	 * The feature id for the '<em><b>Precedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOURCHE__PRECEDENTS = ELEMENT_PROCESSUS__PRECEDENTS;

	/**
	 * The number of structural features of the '<em>Fourche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOURCHE_FEATURE_COUNT = ELEMENT_PROCESSUS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fourche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOURCHE_OPERATION_COUNT = ELEMENT_PROCESSUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDP2.impl.JonctionImpl <em>Jonction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP2.impl.JonctionImpl
	 * @see LDP2.impl.LDP2PackageImpl#getJonction()
	 * @generated
	 */
	int JONCTION = 11;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JONCTION__NOM = ELEMENT_PROCESSUS__NOM;

	/**
	 * The feature id for the '<em><b>Suivantes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JONCTION__SUIVANTES = ELEMENT_PROCESSUS__SUIVANTES;

	/**
	 * The feature id for the '<em><b>Precedents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JONCTION__PRECEDENTS = ELEMENT_PROCESSUS__PRECEDENTS;

	/**
	 * The number of structural features of the '<em>Jonction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JONCTION_FEATURE_COUNT = ELEMENT_PROCESSUS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Jonction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JONCTION_OPERATION_COUNT = ELEMENT_PROCESSUS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link LDP2.Processus <em>Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processus</em>'.
	 * @see LDP2.Processus
	 * @generated
	 */
	EClass getProcessus();

	/**
	 * Returns the meta object for the containment reference list '{@link LDP2.Processus#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see LDP2.Processus#getElements()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link LDP2.Processus#getDebut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Debut</em>'.
	 * @see LDP2.Processus#getDebut()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Debut();

	/**
	 * Returns the meta object for the containment reference '{@link LDP2.Processus#getFin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fin</em>'.
	 * @see LDP2.Processus#getFin()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Fin();

	/**
	 * Returns the meta object for the reference '{@link LDP2.Processus#getElementCourante <em>Element Courante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Courante</em>'.
	 * @see LDP2.Processus#getElementCourante()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_ElementCourante();

	/**
	 * Returns the meta object for class '{@link LDP2.Activite <em>Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activite</em>'.
	 * @see LDP2.Activite
	 * @generated
	 */
	EClass getActivite();

	/**
	 * Returns the meta object for the containment reference list '{@link LDP2.Activite#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see LDP2.Activite#getActions()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_Actions();

	/**
	 * Returns the meta object for class '{@link LDP2.PseudoEtat <em>Pseudo Etat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudo Etat</em>'.
	 * @see LDP2.PseudoEtat
	 * @generated
	 */
	EClass getPseudoEtat();

	/**
	 * Returns the meta object for the reference '{@link LDP2.PseudoEtat#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see LDP2.PseudoEtat#getReference()
	 * @see #getPseudoEtat()
	 * @generated
	 */
	EReference getPseudoEtat_Reference();

	/**
	 * Returns the meta object for class '{@link LDP2.Debut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Debut</em>'.
	 * @see LDP2.Debut
	 * @generated
	 */
	EClass getDebut();

	/**
	 * Returns the meta object for class '{@link LDP2.Fin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin</em>'.
	 * @see LDP2.Fin
	 * @generated
	 */
	EClass getFin();

	/**
	 * Returns the meta object for class '{@link LDP2.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see LDP2.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link LDP2.CreationVar <em>Creation Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation Var</em>'.
	 * @see LDP2.CreationVar
	 * @generated
	 */
	EClass getCreationVar();

	/**
	 * Returns the meta object for the attribute '{@link LDP2.CreationVar#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LDP2.CreationVar#getNom()
	 * @see #getCreationVar()
	 * @generated
	 */
	EAttribute getCreationVar_Nom();

	/**
	 * Returns the meta object for the attribute '{@link LDP2.CreationVar#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see LDP2.CreationVar#getType()
	 * @see #getCreationVar()
	 * @generated
	 */
	EAttribute getCreationVar_Type();

	/**
	 * Returns the meta object for the attribute '{@link LDP2.CreationVar#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see LDP2.CreationVar#getValeur()
	 * @see #getCreationVar()
	 * @generated
	 */
	EAttribute getCreationVar_Valeur();

	/**
	 * Returns the meta object for class '{@link LDP2.InstanceObj <em>Instance Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Obj</em>'.
	 * @see LDP2.InstanceObj
	 * @generated
	 */
	EClass getInstanceObj();

	/**
	 * Returns the meta object for the attribute '{@link LDP2.InstanceObj#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LDP2.InstanceObj#getNom()
	 * @see #getInstanceObj()
	 * @generated
	 */
	EAttribute getInstanceObj_Nom();

	/**
	 * Returns the meta object for the attribute '{@link LDP2.InstanceObj#getClasse <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classe</em>'.
	 * @see LDP2.InstanceObj#getClasse()
	 * @see #getInstanceObj()
	 * @generated
	 */
	EAttribute getInstanceObj_Classe();

	/**
	 * Returns the meta object for class '{@link LDP2.AppelMethode <em>Appel Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appel Methode</em>'.
	 * @see LDP2.AppelMethode
	 * @generated
	 */
	EClass getAppelMethode();

	/**
	 * Returns the meta object for the attribute '{@link LDP2.AppelMethode#getResultat <em>Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resultat</em>'.
	 * @see LDP2.AppelMethode#getResultat()
	 * @see #getAppelMethode()
	 * @generated
	 */
	EAttribute getAppelMethode_Resultat();

	/**
	 * Returns the meta object for the attribute '{@link LDP2.AppelMethode#getNomMethode <em>Nom Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Methode</em>'.
	 * @see LDP2.AppelMethode#getNomMethode()
	 * @see #getAppelMethode()
	 * @generated
	 */
	EAttribute getAppelMethode_NomMethode();

	/**
	 * Returns the meta object for the attribute '{@link LDP2.AppelMethode#getObjetAppele <em>Objet Appele</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objet Appele</em>'.
	 * @see LDP2.AppelMethode#getObjetAppele()
	 * @see #getAppelMethode()
	 * @generated
	 */
	EAttribute getAppelMethode_ObjetAppele();

	/**
	 * Returns the meta object for the attribute list '{@link LDP2.AppelMethode#getParametres <em>Parametres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parametres</em>'.
	 * @see LDP2.AppelMethode#getParametres()
	 * @see #getAppelMethode()
	 * @generated
	 */
	EAttribute getAppelMethode_Parametres();

	/**
	 * Returns the meta object for class '{@link LDP2.ElementProcessus <em>Element Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Processus</em>'.
	 * @see LDP2.ElementProcessus
	 * @generated
	 */
	EClass getElementProcessus();

	/**
	 * Returns the meta object for the attribute '{@link LDP2.ElementProcessus#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see LDP2.ElementProcessus#getNom()
	 * @see #getElementProcessus()
	 * @generated
	 */
	EAttribute getElementProcessus_Nom();

	/**
	 * Returns the meta object for the reference list '{@link LDP2.ElementProcessus#getSuivantes <em>Suivantes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Suivantes</em>'.
	 * @see LDP2.ElementProcessus#getSuivantes()
	 * @see #getElementProcessus()
	 * @generated
	 */
	EReference getElementProcessus_Suivantes();

	/**
	 * Returns the meta object for the reference list '{@link LDP2.ElementProcessus#getPrecedents <em>Precedents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Precedents</em>'.
	 * @see LDP2.ElementProcessus#getPrecedents()
	 * @see #getElementProcessus()
	 * @generated
	 */
	EReference getElementProcessus_Precedents();

	/**
	 * Returns the meta object for class '{@link LDP2.Fourche <em>Fourche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fourche</em>'.
	 * @see LDP2.Fourche
	 * @generated
	 */
	EClass getFourche();

	/**
	 * Returns the meta object for class '{@link LDP2.Jonction <em>Jonction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jonction</em>'.
	 * @see LDP2.Jonction
	 * @generated
	 */
	EClass getJonction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LDP2Factory getLDP2Factory();

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
		 * The meta object literal for the '{@link LDP2.impl.ProcessusImpl <em>Processus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP2.impl.ProcessusImpl
		 * @see LDP2.impl.LDP2PackageImpl#getProcessus()
		 * @generated
		 */
		EClass PROCESSUS = eINSTANCE.getProcessus();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__ELEMENTS = eINSTANCE.getProcessus_Elements();

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
		 * The meta object literal for the '<em><b>Element Courante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__ELEMENT_COURANTE = eINSTANCE.getProcessus_ElementCourante();

		/**
		 * The meta object literal for the '{@link LDP2.impl.ActiviteImpl <em>Activite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP2.impl.ActiviteImpl
		 * @see LDP2.impl.LDP2PackageImpl#getActivite()
		 * @generated
		 */
		EClass ACTIVITE = eINSTANCE.getActivite();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITE__ACTIONS = eINSTANCE.getActivite_Actions();

		/**
		 * The meta object literal for the '{@link LDP2.impl.PseudoEtatImpl <em>Pseudo Etat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP2.impl.PseudoEtatImpl
		 * @see LDP2.impl.LDP2PackageImpl#getPseudoEtat()
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
		 * The meta object literal for the '{@link LDP2.impl.DebutImpl <em>Debut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP2.impl.DebutImpl
		 * @see LDP2.impl.LDP2PackageImpl#getDebut()
		 * @generated
		 */
		EClass DEBUT = eINSTANCE.getDebut();

		/**
		 * The meta object literal for the '{@link LDP2.impl.FinImpl <em>Fin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP2.impl.FinImpl
		 * @see LDP2.impl.LDP2PackageImpl#getFin()
		 * @generated
		 */
		EClass FIN = eINSTANCE.getFin();

		/**
		 * The meta object literal for the '{@link LDP2.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP2.impl.ActionImpl
		 * @see LDP2.impl.LDP2PackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link LDP2.impl.CreationVarImpl <em>Creation Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP2.impl.CreationVarImpl
		 * @see LDP2.impl.LDP2PackageImpl#getCreationVar()
		 * @generated
		 */
		EClass CREATION_VAR = eINSTANCE.getCreationVar();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION_VAR__NOM = eINSTANCE.getCreationVar_Nom();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION_VAR__TYPE = eINSTANCE.getCreationVar_Type();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATION_VAR__VALEUR = eINSTANCE.getCreationVar_Valeur();

		/**
		 * The meta object literal for the '{@link LDP2.impl.InstanceObjImpl <em>Instance Obj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP2.impl.InstanceObjImpl
		 * @see LDP2.impl.LDP2PackageImpl#getInstanceObj()
		 * @generated
		 */
		EClass INSTANCE_OBJ = eINSTANCE.getInstanceObj();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_OBJ__NOM = eINSTANCE.getInstanceObj_Nom();

		/**
		 * The meta object literal for the '<em><b>Classe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_OBJ__CLASSE = eINSTANCE.getInstanceObj_Classe();

		/**
		 * The meta object literal for the '{@link LDP2.impl.AppelMethodeImpl <em>Appel Methode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP2.impl.AppelMethodeImpl
		 * @see LDP2.impl.LDP2PackageImpl#getAppelMethode()
		 * @generated
		 */
		EClass APPEL_METHODE = eINSTANCE.getAppelMethode();

		/**
		 * The meta object literal for the '<em><b>Resultat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEL_METHODE__RESULTAT = eINSTANCE.getAppelMethode_Resultat();

		/**
		 * The meta object literal for the '<em><b>Nom Methode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEL_METHODE__NOM_METHODE = eINSTANCE.getAppelMethode_NomMethode();

		/**
		 * The meta object literal for the '<em><b>Objet Appele</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEL_METHODE__OBJET_APPELE = eINSTANCE.getAppelMethode_ObjetAppele();

		/**
		 * The meta object literal for the '<em><b>Parametres</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEL_METHODE__PARAMETRES = eINSTANCE.getAppelMethode_Parametres();

		/**
		 * The meta object literal for the '{@link LDP2.impl.ElementProcessusImpl <em>Element Processus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP2.impl.ElementProcessusImpl
		 * @see LDP2.impl.LDP2PackageImpl#getElementProcessus()
		 * @generated
		 */
		EClass ELEMENT_PROCESSUS = eINSTANCE.getElementProcessus();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_PROCESSUS__NOM = eINSTANCE.getElementProcessus_Nom();

		/**
		 * The meta object literal for the '<em><b>Suivantes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_PROCESSUS__SUIVANTES = eINSTANCE.getElementProcessus_Suivantes();

		/**
		 * The meta object literal for the '<em><b>Precedents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_PROCESSUS__PRECEDENTS = eINSTANCE.getElementProcessus_Precedents();

		/**
		 * The meta object literal for the '{@link LDP2.impl.FourcheImpl <em>Fourche</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP2.impl.FourcheImpl
		 * @see LDP2.impl.LDP2PackageImpl#getFourche()
		 * @generated
		 */
		EClass FOURCHE = eINSTANCE.getFourche();

		/**
		 * The meta object literal for the '{@link LDP2.impl.JonctionImpl <em>Jonction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP2.impl.JonctionImpl
		 * @see LDP2.impl.LDP2PackageImpl#getJonction()
		 * @generated
		 */
		EClass JONCTION = eINSTANCE.getJonction();

	}

} //LDP2Package
