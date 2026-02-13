/**
 */
package LDP2.impl;

import LDP2.Debut;
import LDP2.ElementProcessus;
import LDP2.Fin;
import LDP2.LDP2Package;
import LDP2.Processus;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP2.impl.ProcessusImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link LDP2.impl.ProcessusImpl#getDebut <em>Debut</em>}</li>
 *   <li>{@link LDP2.impl.ProcessusImpl#getFin <em>Fin</em>}</li>
 *   <li>{@link LDP2.impl.ProcessusImpl#getElementCourante <em>Element Courante</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessusImpl extends MinimalEObjectImpl.Container implements Processus {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementProcessus> elements;

	/**
	 * The cached value of the '{@link #getDebut() <em>Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebut()
	 * @generated
	 * @ordered
	 */
	protected Debut debut;

	/**
	 * The cached value of the '{@link #getFin() <em>Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin()
	 * @generated
	 * @ordered
	 */
	protected Fin fin;

	/**
	 * The cached value of the '{@link #getElementCourante() <em>Element Courante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementCourante()
	 * @generated
	 * @ordered
	 */
	protected ElementProcessus elementCourante;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDP2Package.Literals.PROCESSUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementProcessus> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ElementProcessus>(ElementProcessus.class, this, LDP2Package.PROCESSUS__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Debut getDebut() {
		return debut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDebut(Debut newDebut, NotificationChain msgs) {
		Debut oldDebut = debut;
		debut = newDebut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDP2Package.PROCESSUS__DEBUT, oldDebut, newDebut);
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
	public void setDebut(Debut newDebut) {
		if (newDebut != debut) {
			NotificationChain msgs = null;
			if (debut != null)
				msgs = ((InternalEObject)debut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LDP2Package.PROCESSUS__DEBUT, null, msgs);
			if (newDebut != null)
				msgs = ((InternalEObject)newDebut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LDP2Package.PROCESSUS__DEBUT, null, msgs);
			msgs = basicSetDebut(newDebut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDP2Package.PROCESSUS__DEBUT, newDebut, newDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fin getFin() {
		return fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFin(Fin newFin, NotificationChain msgs) {
		Fin oldFin = fin;
		fin = newFin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDP2Package.PROCESSUS__FIN, oldFin, newFin);
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
	public void setFin(Fin newFin) {
		if (newFin != fin) {
			NotificationChain msgs = null;
			if (fin != null)
				msgs = ((InternalEObject)fin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LDP2Package.PROCESSUS__FIN, null, msgs);
			if (newFin != null)
				msgs = ((InternalEObject)newFin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LDP2Package.PROCESSUS__FIN, null, msgs);
			msgs = basicSetFin(newFin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDP2Package.PROCESSUS__FIN, newFin, newFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementProcessus getElementCourante() {
		if (elementCourante != null && elementCourante.eIsProxy()) {
			InternalEObject oldElementCourante = (InternalEObject)elementCourante;
			elementCourante = (ElementProcessus)eResolveProxy(oldElementCourante);
			if (elementCourante != oldElementCourante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LDP2Package.PROCESSUS__ELEMENT_COURANTE, oldElementCourante, elementCourante));
			}
		}
		return elementCourante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementProcessus basicGetElementCourante() {
		return elementCourante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementCourante(ElementProcessus newElementCourante) {
		ElementProcessus oldElementCourante = elementCourante;
		elementCourante = newElementCourante;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDP2Package.PROCESSUS__ELEMENT_COURANTE, oldElementCourante, elementCourante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LDP2Package.PROCESSUS__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case LDP2Package.PROCESSUS__DEBUT:
				return basicSetDebut(null, msgs);
			case LDP2Package.PROCESSUS__FIN:
				return basicSetFin(null, msgs);
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
			case LDP2Package.PROCESSUS__ELEMENTS:
				return getElements();
			case LDP2Package.PROCESSUS__DEBUT:
				return getDebut();
			case LDP2Package.PROCESSUS__FIN:
				return getFin();
			case LDP2Package.PROCESSUS__ELEMENT_COURANTE:
				if (resolve) return getElementCourante();
				return basicGetElementCourante();
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
			case LDP2Package.PROCESSUS__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ElementProcessus>)newValue);
				return;
			case LDP2Package.PROCESSUS__DEBUT:
				setDebut((Debut)newValue);
				return;
			case LDP2Package.PROCESSUS__FIN:
				setFin((Fin)newValue);
				return;
			case LDP2Package.PROCESSUS__ELEMENT_COURANTE:
				setElementCourante((ElementProcessus)newValue);
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
			case LDP2Package.PROCESSUS__ELEMENTS:
				getElements().clear();
				return;
			case LDP2Package.PROCESSUS__DEBUT:
				setDebut((Debut)null);
				return;
			case LDP2Package.PROCESSUS__FIN:
				setFin((Fin)null);
				return;
			case LDP2Package.PROCESSUS__ELEMENT_COURANTE:
				setElementCourante((ElementProcessus)null);
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
			case LDP2Package.PROCESSUS__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case LDP2Package.PROCESSUS__DEBUT:
				return debut != null;
			case LDP2Package.PROCESSUS__FIN:
				return fin != null;
			case LDP2Package.PROCESSUS__ELEMENT_COURANTE:
				return elementCourante != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessusImpl
