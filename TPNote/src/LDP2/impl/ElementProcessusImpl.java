/**
 */
package LDP2.impl;

import LDP2.ElementProcessus;
import LDP2.LDP2Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Processus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP2.impl.ElementProcessusImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link LDP2.impl.ElementProcessusImpl#getSuivantes <em>Suivantes</em>}</li>
 *   <li>{@link LDP2.impl.ElementProcessusImpl#getPrecedents <em>Precedents</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementProcessusImpl extends MinimalEObjectImpl.Container implements ElementProcessus {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuivantes() <em>Suivantes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuivantes()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementProcessus> suivantes;

	/**
	 * The cached value of the '{@link #getPrecedents() <em>Precedents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedents()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementProcessus> precedents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementProcessusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDP2Package.Literals.ELEMENT_PROCESSUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDP2Package.ELEMENT_PROCESSUS__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementProcessus> getSuivantes() {
		if (suivantes == null) {
			suivantes = new EObjectWithInverseResolvingEList.ManyInverse<ElementProcessus>(ElementProcessus.class, this, LDP2Package.ELEMENT_PROCESSUS__SUIVANTES, LDP2Package.ELEMENT_PROCESSUS__PRECEDENTS);
		}
		return suivantes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementProcessus> getPrecedents() {
		if (precedents == null) {
			precedents = new EObjectWithInverseResolvingEList.ManyInverse<ElementProcessus>(ElementProcessus.class, this, LDP2Package.ELEMENT_PROCESSUS__PRECEDENTS, LDP2Package.ELEMENT_PROCESSUS__SUIVANTES);
		}
		return precedents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LDP2Package.ELEMENT_PROCESSUS__SUIVANTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuivantes()).basicAdd(otherEnd, msgs);
			case LDP2Package.ELEMENT_PROCESSUS__PRECEDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrecedents()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LDP2Package.ELEMENT_PROCESSUS__SUIVANTES:
				return ((InternalEList<?>)getSuivantes()).basicRemove(otherEnd, msgs);
			case LDP2Package.ELEMENT_PROCESSUS__PRECEDENTS:
				return ((InternalEList<?>)getPrecedents()).basicRemove(otherEnd, msgs);
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
			case LDP2Package.ELEMENT_PROCESSUS__NOM:
				return getNom();
			case LDP2Package.ELEMENT_PROCESSUS__SUIVANTES:
				return getSuivantes();
			case LDP2Package.ELEMENT_PROCESSUS__PRECEDENTS:
				return getPrecedents();
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
			case LDP2Package.ELEMENT_PROCESSUS__NOM:
				setNom((String)newValue);
				return;
			case LDP2Package.ELEMENT_PROCESSUS__SUIVANTES:
				getSuivantes().clear();
				getSuivantes().addAll((Collection<? extends ElementProcessus>)newValue);
				return;
			case LDP2Package.ELEMENT_PROCESSUS__PRECEDENTS:
				getPrecedents().clear();
				getPrecedents().addAll((Collection<? extends ElementProcessus>)newValue);
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
			case LDP2Package.ELEMENT_PROCESSUS__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case LDP2Package.ELEMENT_PROCESSUS__SUIVANTES:
				getSuivantes().clear();
				return;
			case LDP2Package.ELEMENT_PROCESSUS__PRECEDENTS:
				getPrecedents().clear();
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
			case LDP2Package.ELEMENT_PROCESSUS__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case LDP2Package.ELEMENT_PROCESSUS__SUIVANTES:
				return suivantes != null && !suivantes.isEmpty();
			case LDP2Package.ELEMENT_PROCESSUS__PRECEDENTS:
				return precedents != null && !precedents.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //ElementProcessusImpl
