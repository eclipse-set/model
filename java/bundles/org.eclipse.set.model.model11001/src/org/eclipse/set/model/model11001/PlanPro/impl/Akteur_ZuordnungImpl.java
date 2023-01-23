/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.PlanPro.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model11001.Basisobjekte.Anhang;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Ur_ObjektImpl;

import org.eclipse.set.model.model11001.PlanPro.Akteur;
import org.eclipse.set.model.model11001.PlanPro.Akteur_Zuordnung;
import org.eclipse.set.model.model11001.PlanPro.Datum_TypeClass;
import org.eclipse.set.model.model11001.PlanPro.Ident_Rolle_TypeClass;
import org.eclipse.set.model.model11001.PlanPro.PlanProPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Akteur Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.PlanPro.impl.Akteur_ZuordnungImpl#getAnhangDokumentation <em>Anhang Dokumentation</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PlanPro.impl.Akteur_ZuordnungImpl#getDatum <em>Datum</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PlanPro.impl.Akteur_ZuordnungImpl#getHandelnder <em>Handelnder</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PlanPro.impl.Akteur_ZuordnungImpl#getIdentRolle <em>Ident Rolle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Akteur_ZuordnungImpl extends Ur_ObjektImpl implements Akteur_Zuordnung {
	/**
	 * The cached value of the '{@link #getAnhangDokumentation() <em>Anhang Dokumentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnhangDokumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Anhang> anhangDokumentation;

	/**
	 * The cached value of the '{@link #getDatum() <em>Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatum()
	 * @generated
	 * @ordered
	 */
	protected Datum_TypeClass datum;

	/**
	 * The cached value of the '{@link #getHandelnder() <em>Handelnder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandelnder()
	 * @generated
	 * @ordered
	 */
	protected Akteur handelnder;

	/**
	 * The cached value of the '{@link #getIdentRolle() <em>Ident Rolle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentRolle()
	 * @generated
	 * @ordered
	 */
	protected Ident_Rolle_TypeClass identRolle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Akteur_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getAkteur_Zuordnung();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Anhang> getAnhangDokumentation() {
		if (anhangDokumentation == null) {
			anhangDokumentation = new EObjectContainmentEList<Anhang>(Anhang.class, this, PlanProPackage.AKTEUR_ZUORDNUNG__ANHANG_DOKUMENTATION);
		}
		return anhangDokumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datum_TypeClass getDatum() {
		return datum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatum(Datum_TypeClass newDatum, NotificationChain msgs) {
		Datum_TypeClass oldDatum = datum;
		datum = newDatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.AKTEUR_ZUORDNUNG__DATUM, oldDatum, newDatum);
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
	public void setDatum(Datum_TypeClass newDatum) {
		if (newDatum != datum) {
			NotificationChain msgs = null;
			if (datum != null)
				msgs = ((InternalEObject)datum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AKTEUR_ZUORDNUNG__DATUM, null, msgs);
			if (newDatum != null)
				msgs = ((InternalEObject)newDatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AKTEUR_ZUORDNUNG__DATUM, null, msgs);
			msgs = basicSetDatum(newDatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.AKTEUR_ZUORDNUNG__DATUM, newDatum, newDatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Akteur getHandelnder() {
		return handelnder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHandelnder(Akteur newHandelnder, NotificationChain msgs) {
		Akteur oldHandelnder = handelnder;
		handelnder = newHandelnder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.AKTEUR_ZUORDNUNG__HANDELNDER, oldHandelnder, newHandelnder);
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
	public void setHandelnder(Akteur newHandelnder) {
		if (newHandelnder != handelnder) {
			NotificationChain msgs = null;
			if (handelnder != null)
				msgs = ((InternalEObject)handelnder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AKTEUR_ZUORDNUNG__HANDELNDER, null, msgs);
			if (newHandelnder != null)
				msgs = ((InternalEObject)newHandelnder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AKTEUR_ZUORDNUNG__HANDELNDER, null, msgs);
			msgs = basicSetHandelnder(newHandelnder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.AKTEUR_ZUORDNUNG__HANDELNDER, newHandelnder, newHandelnder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ident_Rolle_TypeClass getIdentRolle() {
		return identRolle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentRolle(Ident_Rolle_TypeClass newIdentRolle, NotificationChain msgs) {
		Ident_Rolle_TypeClass oldIdentRolle = identRolle;
		identRolle = newIdentRolle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.AKTEUR_ZUORDNUNG__IDENT_ROLLE, oldIdentRolle, newIdentRolle);
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
	public void setIdentRolle(Ident_Rolle_TypeClass newIdentRolle) {
		if (newIdentRolle != identRolle) {
			NotificationChain msgs = null;
			if (identRolle != null)
				msgs = ((InternalEObject)identRolle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AKTEUR_ZUORDNUNG__IDENT_ROLLE, null, msgs);
			if (newIdentRolle != null)
				msgs = ((InternalEObject)newIdentRolle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AKTEUR_ZUORDNUNG__IDENT_ROLLE, null, msgs);
			msgs = basicSetIdentRolle(newIdentRolle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.AKTEUR_ZUORDNUNG__IDENT_ROLLE, newIdentRolle, newIdentRolle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.AKTEUR_ZUORDNUNG__ANHANG_DOKUMENTATION:
				return ((InternalEList<?>)getAnhangDokumentation()).basicRemove(otherEnd, msgs);
			case PlanProPackage.AKTEUR_ZUORDNUNG__DATUM:
				return basicSetDatum(null, msgs);
			case PlanProPackage.AKTEUR_ZUORDNUNG__HANDELNDER:
				return basicSetHandelnder(null, msgs);
			case PlanProPackage.AKTEUR_ZUORDNUNG__IDENT_ROLLE:
				return basicSetIdentRolle(null, msgs);
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
			case PlanProPackage.AKTEUR_ZUORDNUNG__ANHANG_DOKUMENTATION:
				return getAnhangDokumentation();
			case PlanProPackage.AKTEUR_ZUORDNUNG__DATUM:
				return getDatum();
			case PlanProPackage.AKTEUR_ZUORDNUNG__HANDELNDER:
				return getHandelnder();
			case PlanProPackage.AKTEUR_ZUORDNUNG__IDENT_ROLLE:
				return getIdentRolle();
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
			case PlanProPackage.AKTEUR_ZUORDNUNG__ANHANG_DOKUMENTATION:
				getAnhangDokumentation().clear();
				getAnhangDokumentation().addAll((Collection<? extends Anhang>)newValue);
				return;
			case PlanProPackage.AKTEUR_ZUORDNUNG__DATUM:
				setDatum((Datum_TypeClass)newValue);
				return;
			case PlanProPackage.AKTEUR_ZUORDNUNG__HANDELNDER:
				setHandelnder((Akteur)newValue);
				return;
			case PlanProPackage.AKTEUR_ZUORDNUNG__IDENT_ROLLE:
				setIdentRolle((Ident_Rolle_TypeClass)newValue);
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
			case PlanProPackage.AKTEUR_ZUORDNUNG__ANHANG_DOKUMENTATION:
				getAnhangDokumentation().clear();
				return;
			case PlanProPackage.AKTEUR_ZUORDNUNG__DATUM:
				setDatum((Datum_TypeClass)null);
				return;
			case PlanProPackage.AKTEUR_ZUORDNUNG__HANDELNDER:
				setHandelnder((Akteur)null);
				return;
			case PlanProPackage.AKTEUR_ZUORDNUNG__IDENT_ROLLE:
				setIdentRolle((Ident_Rolle_TypeClass)null);
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
			case PlanProPackage.AKTEUR_ZUORDNUNG__ANHANG_DOKUMENTATION:
				return anhangDokumentation != null && !anhangDokumentation.isEmpty();
			case PlanProPackage.AKTEUR_ZUORDNUNG__DATUM:
				return datum != null;
			case PlanProPackage.AKTEUR_ZUORDNUNG__HANDELNDER:
				return handelnder != null;
			case PlanProPackage.AKTEUR_ZUORDNUNG__IDENT_ROLLE:
				return identRolle != null;
		}
		return super.eIsSet(featureID);
	}

} //Akteur_ZuordnungImpl
