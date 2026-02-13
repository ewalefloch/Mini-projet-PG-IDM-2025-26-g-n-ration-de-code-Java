/**
 */
package LDP2.impl;

import LDP2.InstanceObj;
import LDP2.LDP2Package;

import LDP2.Objet;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Obj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP2.impl.InstanceObjImpl#getObjet <em>Objet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceObjImpl extends ActionImpl implements InstanceObj {
	/**
	 * The cached value of the '{@link #getObjet() <em>Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjet()
	 * @generated
	 * @ordered
	 */
	protected Objet objet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceObjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDP2Package.Literals.INSTANCE_OBJ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Objet getObjet() {
		return objet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjet(Objet newObjet, NotificationChain msgs) {
		Objet oldObjet = objet;
		objet = newObjet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDP2Package.INSTANCE_OBJ__OBJET, oldObjet, newObjet);
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
	public void setObjet(Objet newObjet) {
		if (newObjet != objet) {
			NotificationChain msgs = null;
			if (objet != null)
				msgs = ((InternalEObject)objet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LDP2Package.INSTANCE_OBJ__OBJET, null, msgs);
			if (newObjet != null)
				msgs = ((InternalEObject)newObjet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LDP2Package.INSTANCE_OBJ__OBJET, null, msgs);
			msgs = basicSetObjet(newObjet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDP2Package.INSTANCE_OBJ__OBJET, newObjet, newObjet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LDP2Package.INSTANCE_OBJ__OBJET:
				return basicSetObjet(null, msgs);
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
			case LDP2Package.INSTANCE_OBJ__OBJET:
				return getObjet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LDP2Package.INSTANCE_OBJ__OBJET:
				setObjet((Objet)newValue);
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
			case LDP2Package.INSTANCE_OBJ__OBJET:
				setObjet((Objet)null);
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
			case LDP2Package.INSTANCE_OBJ__OBJET:
				return objet != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceObjImpl
