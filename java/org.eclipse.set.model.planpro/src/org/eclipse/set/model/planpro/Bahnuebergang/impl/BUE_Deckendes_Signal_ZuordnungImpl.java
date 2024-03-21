/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung;
import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.planpro.Bahnuebergang.Sicherheitsabstand_TypeClass;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_BUE_Einschaltung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Deckendes Signal Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Deckendes_Signal_ZuordnungImpl#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Deckendes_Signal_ZuordnungImpl#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Deckendes_Signal_ZuordnungImpl#getSicherheitsabstand <em>Sicherheitsabstand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Deckendes_Signal_ZuordnungImpl extends Basis_ObjektImpl implements BUE_Deckendes_Signal_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDBUEEinschaltung() <em>IDBUE Einschaltung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUEEinschaltung()
	 * @generated
	 * @ordered
	 */
	protected ID_BUE_Einschaltung_TypeClass iDBUEEinschaltung;

	/**
	 * The cached value of the '{@link #getIDSignal() <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignal()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_TypeClass iDSignal;

	/**
	 * The cached value of the '{@link #getSicherheitsabstand() <em>Sicherheitsabstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSicherheitsabstand()
	 * @generated
	 * @ordered
	 */
	protected Sicherheitsabstand_TypeClass sicherheitsabstand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Deckendes_Signal_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Deckendes_Signal_Zuordnung();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_BUE_Einschaltung_TypeClass getIDBUEEinschaltung() {
		return iDBUEEinschaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBUEEinschaltung(ID_BUE_Einschaltung_TypeClass newIDBUEEinschaltung, NotificationChain msgs) {
		ID_BUE_Einschaltung_TypeClass oldIDBUEEinschaltung = iDBUEEinschaltung;
		iDBUEEinschaltung = newIDBUEEinschaltung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDBUE_EINSCHALTUNG, oldIDBUEEinschaltung, newIDBUEEinschaltung);
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
	public void setIDBUEEinschaltung(ID_BUE_Einschaltung_TypeClass newIDBUEEinschaltung) {
		if (newIDBUEEinschaltung != iDBUEEinschaltung) {
			NotificationChain msgs = null;
			if (iDBUEEinschaltung != null)
				msgs = ((InternalEObject)iDBUEEinschaltung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDBUE_EINSCHALTUNG, null, msgs);
			if (newIDBUEEinschaltung != null)
				msgs = ((InternalEObject)newIDBUEEinschaltung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDBUE_EINSCHALTUNG, null, msgs);
			msgs = basicSetIDBUEEinschaltung(newIDBUEEinschaltung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDBUE_EINSCHALTUNG, newIDBUEEinschaltung, newIDBUEEinschaltung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_TypeClass getIDSignal() {
		return iDSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSignal(ID_Signal_TypeClass newIDSignal, NotificationChain msgs) {
		ID_Signal_TypeClass oldIDSignal = iDSignal;
		iDSignal = newIDSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_SIGNAL, oldIDSignal, newIDSignal);
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
	public void setIDSignal(ID_Signal_TypeClass newIDSignal) {
		if (newIDSignal != iDSignal) {
			NotificationChain msgs = null;
			if (iDSignal != null)
				msgs = ((InternalEObject)iDSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_SIGNAL, null, msgs);
			if (newIDSignal != null)
				msgs = ((InternalEObject)newIDSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_SIGNAL, null, msgs);
			msgs = basicSetIDSignal(newIDSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_SIGNAL, newIDSignal, newIDSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sicherheitsabstand_TypeClass getSicherheitsabstand() {
		return sicherheitsabstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSicherheitsabstand(Sicherheitsabstand_TypeClass newSicherheitsabstand, NotificationChain msgs) {
		Sicherheitsabstand_TypeClass oldSicherheitsabstand = sicherheitsabstand;
		sicherheitsabstand = newSicherheitsabstand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND, oldSicherheitsabstand, newSicherheitsabstand);
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
	public void setSicherheitsabstand(Sicherheitsabstand_TypeClass newSicherheitsabstand) {
		if (newSicherheitsabstand != sicherheitsabstand) {
			NotificationChain msgs = null;
			if (sicherheitsabstand != null)
				msgs = ((InternalEObject)sicherheitsabstand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND, null, msgs);
			if (newSicherheitsabstand != null)
				msgs = ((InternalEObject)newSicherheitsabstand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND, null, msgs);
			msgs = basicSetSicherheitsabstand(newSicherheitsabstand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND, newSicherheitsabstand, newSicherheitsabstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				return basicSetIDBUEEinschaltung(null, msgs);
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_SIGNAL:
				return basicSetIDSignal(null, msgs);
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND:
				return basicSetSicherheitsabstand(null, msgs);
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
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				return getIDBUEEinschaltung();
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_SIGNAL:
				return getIDSignal();
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND:
				return getSicherheitsabstand();
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
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				setIDBUEEinschaltung((ID_BUE_Einschaltung_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_SIGNAL:
				setIDSignal((ID_Signal_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND:
				setSicherheitsabstand((Sicherheitsabstand_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				setIDBUEEinschaltung((ID_BUE_Einschaltung_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_SIGNAL:
				setIDSignal((ID_Signal_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND:
				setSicherheitsabstand((Sicherheitsabstand_TypeClass)null);
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
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				return iDBUEEinschaltung != null;
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_SIGNAL:
				return iDSignal != null;
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND:
				return sicherheitsabstand != null;
		}
		return super.eIsSet(featureID);
	}

} //BUE_Deckendes_Signal_ZuordnungImpl
