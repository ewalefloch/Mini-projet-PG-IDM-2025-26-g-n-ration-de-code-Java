/**
 */
package LDP.impl;

import LDP.AppelMethode;
import LDP.LDPPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appel Methode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP.impl.AppelMethodeImpl#getResultat <em>Resultat</em>}</li>
 *   <li>{@link LDP.impl.AppelMethodeImpl#getNomMethode <em>Nom Methode</em>}</li>
 *   <li>{@link LDP.impl.AppelMethodeImpl#getObjetAppele <em>Objet Appele</em>}</li>
 *   <li>{@link LDP.impl.AppelMethodeImpl#getParametres <em>Parametres</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppelMethodeImpl extends ActionImpl implements AppelMethode {
	/**
	 * The default value of the '{@link #getResultat() <em>Resultat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultat()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULTAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultat() <em>Resultat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultat()
	 * @generated
	 * @ordered
	 */
	protected String resultat = RESULTAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomMethode() <em>Nom Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomMethode()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_METHODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomMethode() <em>Nom Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomMethode()
	 * @generated
	 * @ordered
	 */
	protected String nomMethode = NOM_METHODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjetAppele() <em>Objet Appele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetAppele()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJET_APPELE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjetAppele() <em>Objet Appele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetAppele()
	 * @generated
	 * @ordered
	 */
	protected String objetAppele = OBJET_APPELE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParametres() <em>Parametres</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametres()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parametres;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppelMethodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPPackage.Literals.APPEL_METHODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResultat() {
		return resultat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultat(String newResultat) {
		String oldResultat = resultat;
		resultat = newResultat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.APPEL_METHODE__RESULTAT, oldResultat, resultat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNomMethode() {
		return nomMethode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNomMethode(String newNomMethode) {
		String oldNomMethode = nomMethode;
		nomMethode = newNomMethode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.APPEL_METHODE__NOM_METHODE, oldNomMethode, nomMethode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObjetAppele() {
		return objetAppele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjetAppele(String newObjetAppele) {
		String oldObjetAppele = objetAppele;
		objetAppele = newObjetAppele;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.APPEL_METHODE__OBJET_APPELE, oldObjetAppele, objetAppele));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getParametres() {
		if (parametres == null) {
			parametres = new EDataTypeUniqueEList<String>(String.class, this, LDPPackage.APPEL_METHODE__PARAMETRES);
		}
		return parametres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LDPPackage.APPEL_METHODE__RESULTAT:
				return getResultat();
			case LDPPackage.APPEL_METHODE__NOM_METHODE:
				return getNomMethode();
			case LDPPackage.APPEL_METHODE__OBJET_APPELE:
				return getObjetAppele();
			case LDPPackage.APPEL_METHODE__PARAMETRES:
				return getParametres();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LDPPackage.APPEL_METHODE__RESULTAT:
				setResultat((String)newValue);
				return;
			case LDPPackage.APPEL_METHODE__NOM_METHODE:
				setNomMethode((String)newValue);
				return;
			case LDPPackage.APPEL_METHODE__OBJET_APPELE:
				setObjetAppele((String)newValue);
				return;
			case LDPPackage.APPEL_METHODE__PARAMETRES:
				getParametres().clear();
				getParametres().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LDPPackage.APPEL_METHODE__RESULTAT:
				setResultat(RESULTAT_EDEFAULT);
				return;
			case LDPPackage.APPEL_METHODE__NOM_METHODE:
				setNomMethode(NOM_METHODE_EDEFAULT);
				return;
			case LDPPackage.APPEL_METHODE__OBJET_APPELE:
				setObjetAppele(OBJET_APPELE_EDEFAULT);
				return;
			case LDPPackage.APPEL_METHODE__PARAMETRES:
				getParametres().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LDPPackage.APPEL_METHODE__RESULTAT:
				return RESULTAT_EDEFAULT == null ? resultat != null : !RESULTAT_EDEFAULT.equals(resultat);
			case LDPPackage.APPEL_METHODE__NOM_METHODE:
				return NOM_METHODE_EDEFAULT == null ? nomMethode != null : !NOM_METHODE_EDEFAULT.equals(nomMethode);
			case LDPPackage.APPEL_METHODE__OBJET_APPELE:
				return OBJET_APPELE_EDEFAULT == null ? objetAppele != null : !OBJET_APPELE_EDEFAULT.equals(objetAppele);
			case LDPPackage.APPEL_METHODE__PARAMETRES:
				return parametres != null && !parametres.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (resultat: ");
		result.append(resultat);
		result.append(", nomMethode: ");
		result.append(nomMethode);
		result.append(", objetAppele: ");
		result.append(objetAppele);
		result.append(", parametres: ");
		result.append(parametres);
		result.append(')');
		return result.toString();
	}

} //AppelMethodeImpl
