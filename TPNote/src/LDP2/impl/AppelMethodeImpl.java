/**
 */
package LDP2.impl;

import LDP2.AppelMethode;
import LDP2.LDP2Package;

import LDP2.Method;
import LDP2.Objet;
import LDP2.Parametre;
import LDP2.Variable;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appel Methode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP2.impl.AppelMethodeImpl#getResultat <em>Resultat</em>}</li>
 *   <li>{@link LDP2.impl.AppelMethodeImpl#getObjetAppele <em>Objet Appele</em>}</li>
 *   <li>{@link LDP2.impl.AppelMethodeImpl#getParametre <em>Parametre</em>}</li>
 *   <li>{@link LDP2.impl.AppelMethodeImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppelMethodeImpl extends ActionImpl implements AppelMethode {
	/**
	 * The cached value of the '{@link #getResultat() <em>Resultat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultat()
	 * @generated
	 * @ordered
	 */
	protected Variable resultat;

	/**
	 * The cached value of the '{@link #getObjetAppele() <em>Objet Appele</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetAppele()
	 * @generated
	 * @ordered
	 */
	protected Objet objetAppele;

	/**
	 * The cached value of the '{@link #getParametre() <em>Parametre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametre()
	 * @generated
	 * @ordered
	 */
	protected Parametre parametre;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Method method;

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
		return LDP2Package.Literals.APPEL_METHODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getResultat() {
		if (resultat != null && resultat.eIsProxy()) {
			InternalEObject oldResultat = (InternalEObject)resultat;
			resultat = (Variable)eResolveProxy(oldResultat);
			if (resultat != oldResultat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LDP2Package.APPEL_METHODE__RESULTAT, oldResultat, resultat));
			}
		}
		return resultat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetResultat() {
		return resultat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultat(Variable newResultat) {
		Variable oldResultat = resultat;
		resultat = newResultat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDP2Package.APPEL_METHODE__RESULTAT, oldResultat, resultat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Objet getObjetAppele() {
		if (objetAppele != null && objetAppele.eIsProxy()) {
			InternalEObject oldObjetAppele = (InternalEObject)objetAppele;
			objetAppele = (Objet)eResolveProxy(oldObjetAppele);
			if (objetAppele != oldObjetAppele) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LDP2Package.APPEL_METHODE__OBJET_APPELE, oldObjetAppele, objetAppele));
			}
		}
		return objetAppele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objet basicGetObjetAppele() {
		return objetAppele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjetAppele(Objet newObjetAppele) {
		Objet oldObjetAppele = objetAppele;
		objetAppele = newObjetAppele;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDP2Package.APPEL_METHODE__OBJET_APPELE, oldObjetAppele, objetAppele));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parametre getParametre() {
		return parametre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParametre(Parametre newParametre, NotificationChain msgs) {
		Parametre oldParametre = parametre;
		parametre = newParametre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDP2Package.APPEL_METHODE__PARAMETRE, oldParametre, newParametre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParametre(Parametre newParametre) {
		if (newParametre != parametre) {
			NotificationChain msgs = null;
			if (parametre != null)
				msgs = ((InternalEObject)parametre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LDP2Package.APPEL_METHODE__PARAMETRE, null, msgs);
			if (newParametre != null)
				msgs = ((InternalEObject)newParametre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LDP2Package.APPEL_METHODE__PARAMETRE, null, msgs);
			msgs = basicSetParametre(newParametre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDP2Package.APPEL_METHODE__PARAMETRE, newParametre, newParametre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Method getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject)method;
			method = (Method)eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LDP2Package.APPEL_METHODE__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(Method newMethod) {
		Method oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDP2Package.APPEL_METHODE__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LDP2Package.APPEL_METHODE__PARAMETRE:
				return basicSetParametre(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LDP2Package.APPEL_METHODE__RESULTAT:
				if (resolve) return getResultat();
				return basicGetResultat();
			case LDP2Package.APPEL_METHODE__OBJET_APPELE:
				if (resolve) return getObjetAppele();
				return basicGetObjetAppele();
			case LDP2Package.APPEL_METHODE__PARAMETRE:
				return getParametre();
			case LDP2Package.APPEL_METHODE__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
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
			case LDP2Package.APPEL_METHODE__RESULTAT:
				setResultat((Variable)newValue);
				return;
			case LDP2Package.APPEL_METHODE__OBJET_APPELE:
				setObjetAppele((Objet)newValue);
				return;
			case LDP2Package.APPEL_METHODE__PARAMETRE:
				setParametre((Parametre)newValue);
				return;
			case LDP2Package.APPEL_METHODE__METHOD:
				setMethod((Method)newValue);
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
			case LDP2Package.APPEL_METHODE__RESULTAT:
				setResultat((Variable)null);
				return;
			case LDP2Package.APPEL_METHODE__OBJET_APPELE:
				setObjetAppele((Objet)null);
				return;
			case LDP2Package.APPEL_METHODE__PARAMETRE:
				setParametre((Parametre)null);
				return;
			case LDP2Package.APPEL_METHODE__METHOD:
				setMethod((Method)null);
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
			case LDP2Package.APPEL_METHODE__RESULTAT:
				return resultat != null;
			case LDP2Package.APPEL_METHODE__OBJET_APPELE:
				return objetAppele != null;
			case LDP2Package.APPEL_METHODE__PARAMETRE:
				return parametre != null;
			case LDP2Package.APPEL_METHODE__METHOD:
				return method != null;
		}
		return super.eIsSet(featureID);
	}

} //AppelMethodeImpl
