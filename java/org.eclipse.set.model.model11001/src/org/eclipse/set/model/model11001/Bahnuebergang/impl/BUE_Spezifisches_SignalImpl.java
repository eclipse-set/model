/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Bahnuebergang.BUE_Spezifisches_Signal;
import org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Verweise.ID_BUE_Anlage_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_BUE_Einschaltung_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Spezifisches Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.BUE_Spezifisches_SignalImpl#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.BUE_Spezifisches_SignalImpl#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.BUE_Spezifisches_SignalImpl#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Spezifisches_SignalImpl extends Basis_ObjektImpl implements BUE_Spezifisches_Signal {
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
	 * The cached value of the '{@link #getIDBUEAnlage() <em>IDBUE Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUEAnlage()
	 * @generated
	 * @ordered
	 */
	protected ID_BUE_Anlage_TypeClass iDBUEAnlage;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Spezifisches_SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Spezifisches_Signal();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__ID_SIGNAL, oldIDSignal, newIDSignal);
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
				msgs = ((InternalEObject)iDSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__ID_SIGNAL, null, msgs);
			if (newIDSignal != null)
				msgs = ((InternalEObject)newIDSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__ID_SIGNAL, null, msgs);
			msgs = basicSetIDSignal(newIDSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__ID_SIGNAL, newIDSignal, newIDSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_BUE_Anlage_TypeClass getIDBUEAnlage() {
		return iDBUEAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBUEAnlage(ID_BUE_Anlage_TypeClass newIDBUEAnlage, NotificationChain msgs) {
		ID_BUE_Anlage_TypeClass oldIDBUEAnlage = iDBUEAnlage;
		iDBUEAnlage = newIDBUEAnlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_ANLAGE, oldIDBUEAnlage, newIDBUEAnlage);
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
	public void setIDBUEAnlage(ID_BUE_Anlage_TypeClass newIDBUEAnlage) {
		if (newIDBUEAnlage != iDBUEAnlage) {
			NotificationChain msgs = null;
			if (iDBUEAnlage != null)
				msgs = ((InternalEObject)iDBUEAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_ANLAGE, null, msgs);
			if (newIDBUEAnlage != null)
				msgs = ((InternalEObject)newIDBUEAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_ANLAGE, null, msgs);
			msgs = basicSetIDBUEAnlage(newIDBUEAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_ANLAGE, newIDBUEAnlage, newIDBUEAnlage));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_EINSCHALTUNG, oldIDBUEEinschaltung, newIDBUEEinschaltung);
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
				msgs = ((InternalEObject)iDBUEEinschaltung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_EINSCHALTUNG, null, msgs);
			if (newIDBUEEinschaltung != null)
				msgs = ((InternalEObject)newIDBUEEinschaltung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_EINSCHALTUNG, null, msgs);
			msgs = basicSetIDBUEEinschaltung(newIDBUEEinschaltung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_EINSCHALTUNG, newIDBUEEinschaltung, newIDBUEEinschaltung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__ID_SIGNAL:
				return basicSetIDSignal(null, msgs);
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_ANLAGE:
				return basicSetIDBUEAnlage(null, msgs);
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_EINSCHALTUNG:
				return basicSetIDBUEEinschaltung(null, msgs);
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
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__ID_SIGNAL:
				return getIDSignal();
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_ANLAGE:
				return getIDBUEAnlage();
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_EINSCHALTUNG:
				return getIDBUEEinschaltung();
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
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__ID_SIGNAL:
				setIDSignal((ID_Signal_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_ANLAGE:
				setIDBUEAnlage((ID_BUE_Anlage_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_EINSCHALTUNG:
				setIDBUEEinschaltung((ID_BUE_Einschaltung_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__ID_SIGNAL:
				setIDSignal((ID_Signal_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_ANLAGE:
				setIDBUEAnlage((ID_BUE_Anlage_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_EINSCHALTUNG:
				setIDBUEEinschaltung((ID_BUE_Einschaltung_TypeClass)null);
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
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__ID_SIGNAL:
				return iDSignal != null;
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_ANLAGE:
				return iDBUEAnlage != null;
			case BahnuebergangPackage.BUE_SPEZIFISCHES_SIGNAL__IDBUE_EINSCHALTUNG:
				return iDBUEEinschaltung != null;
		}
		return super.eIsSet(featureID);
	}

} //BUE_Spezifisches_SignalImpl
