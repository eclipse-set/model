/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Ur_ObjektImpl;

import org.eclipse.set.model.model1902.PlanPro.Ausgabe_Fachdaten;
import org.eclipse.set.model.model1902.PlanPro.LST_Zustand;
import org.eclipse.set.model.model1902.PlanPro.PlanProPackage;
import org.eclipse.set.model.model1902.PlanPro.Untergewerk_Art_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ausgabe Fachdaten</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Ausgabe_FachdatenImpl#getLSTZustandStart <em>LST Zustand Start</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Ausgabe_FachdatenImpl#getLSTZustandZiel <em>LST Zustand Ziel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Ausgabe_FachdatenImpl#getUntergewerkArt <em>Untergewerk Art</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Ausgabe_FachdatenImpl extends Ur_ObjektImpl implements Ausgabe_Fachdaten {
	/**
	 * The cached value of the '{@link #getLSTZustandStart() <em>LST Zustand Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLSTZustandStart()
	 * @generated
	 * @ordered
	 */
	protected LST_Zustand lSTZustandStart;

	/**
	 * The cached value of the '{@link #getLSTZustandZiel() <em>LST Zustand Ziel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLSTZustandZiel()
	 * @generated
	 * @ordered
	 */
	protected LST_Zustand lSTZustandZiel;

	/**
	 * The cached value of the '{@link #getUntergewerkArt() <em>Untergewerk Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntergewerkArt()
	 * @generated
	 * @ordered
	 */
	protected Untergewerk_Art_TypeClass untergewerkArt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ausgabe_FachdatenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getAusgabe_Fachdaten();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LST_Zustand getLSTZustandStart() {
		return lSTZustandStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLSTZustandStart(LST_Zustand newLSTZustandStart, NotificationChain msgs) {
		LST_Zustand oldLSTZustandStart = lSTZustandStart;
		lSTZustandStart = newLSTZustandStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_START, oldLSTZustandStart, newLSTZustandStart);
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
	public void setLSTZustandStart(LST_Zustand newLSTZustandStart) {
		if (newLSTZustandStart != lSTZustandStart) {
			NotificationChain msgs = null;
			if (lSTZustandStart != null)
				msgs = ((InternalEObject)lSTZustandStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_START, null, msgs);
			if (newLSTZustandStart != null)
				msgs = ((InternalEObject)newLSTZustandStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_START, null, msgs);
			msgs = basicSetLSTZustandStart(newLSTZustandStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_START, newLSTZustandStart, newLSTZustandStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LST_Zustand getLSTZustandZiel() {
		return lSTZustandZiel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLSTZustandZiel(LST_Zustand newLSTZustandZiel, NotificationChain msgs) {
		LST_Zustand oldLSTZustandZiel = lSTZustandZiel;
		lSTZustandZiel = newLSTZustandZiel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_ZIEL, oldLSTZustandZiel, newLSTZustandZiel);
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
	public void setLSTZustandZiel(LST_Zustand newLSTZustandZiel) {
		if (newLSTZustandZiel != lSTZustandZiel) {
			NotificationChain msgs = null;
			if (lSTZustandZiel != null)
				msgs = ((InternalEObject)lSTZustandZiel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_ZIEL, null, msgs);
			if (newLSTZustandZiel != null)
				msgs = ((InternalEObject)newLSTZustandZiel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_ZIEL, null, msgs);
			msgs = basicSetLSTZustandZiel(newLSTZustandZiel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_ZIEL, newLSTZustandZiel, newLSTZustandZiel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Untergewerk_Art_TypeClass getUntergewerkArt() {
		return untergewerkArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUntergewerkArt(Untergewerk_Art_TypeClass newUntergewerkArt, NotificationChain msgs) {
		Untergewerk_Art_TypeClass oldUntergewerkArt = untergewerkArt;
		untergewerkArt = newUntergewerkArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.AUSGABE_FACHDATEN__UNTERGEWERK_ART, oldUntergewerkArt, newUntergewerkArt);
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
	public void setUntergewerkArt(Untergewerk_Art_TypeClass newUntergewerkArt) {
		if (newUntergewerkArt != untergewerkArt) {
			NotificationChain msgs = null;
			if (untergewerkArt != null)
				msgs = ((InternalEObject)untergewerkArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AUSGABE_FACHDATEN__UNTERGEWERK_ART, null, msgs);
			if (newUntergewerkArt != null)
				msgs = ((InternalEObject)newUntergewerkArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AUSGABE_FACHDATEN__UNTERGEWERK_ART, null, msgs);
			msgs = basicSetUntergewerkArt(newUntergewerkArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.AUSGABE_FACHDATEN__UNTERGEWERK_ART, newUntergewerkArt, newUntergewerkArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_START:
				return basicSetLSTZustandStart(null, msgs);
			case PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_ZIEL:
				return basicSetLSTZustandZiel(null, msgs);
			case PlanProPackage.AUSGABE_FACHDATEN__UNTERGEWERK_ART:
				return basicSetUntergewerkArt(null, msgs);
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
			case PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_START:
				return getLSTZustandStart();
			case PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_ZIEL:
				return getLSTZustandZiel();
			case PlanProPackage.AUSGABE_FACHDATEN__UNTERGEWERK_ART:
				return getUntergewerkArt();
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
			case PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_START:
				setLSTZustandStart((LST_Zustand)newValue);
				return;
			case PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_ZIEL:
				setLSTZustandZiel((LST_Zustand)newValue);
				return;
			case PlanProPackage.AUSGABE_FACHDATEN__UNTERGEWERK_ART:
				setUntergewerkArt((Untergewerk_Art_TypeClass)newValue);
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
			case PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_START:
				setLSTZustandStart((LST_Zustand)null);
				return;
			case PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_ZIEL:
				setLSTZustandZiel((LST_Zustand)null);
				return;
			case PlanProPackage.AUSGABE_FACHDATEN__UNTERGEWERK_ART:
				setUntergewerkArt((Untergewerk_Art_TypeClass)null);
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
			case PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_START:
				return lSTZustandStart != null;
			case PlanProPackage.AUSGABE_FACHDATEN__LST_ZUSTAND_ZIEL:
				return lSTZustandZiel != null;
			case PlanProPackage.AUSGABE_FACHDATEN__UNTERGEWERK_ART:
				return untergewerkArt != null;
		}
		return super.eIsSet(featureID);
	}

} //Ausgabe_FachdatenImpl
