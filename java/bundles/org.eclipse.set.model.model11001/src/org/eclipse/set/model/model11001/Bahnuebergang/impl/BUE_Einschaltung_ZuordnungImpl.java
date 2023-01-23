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

import org.eclipse.set.model.model11001.Bahnuebergang.BUE_Einschaltung_Zuordnung;
import org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Verweise.ID_BUE_Einschaltung_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_BUE_Gleisbezogener_Gefahrraum_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Einschaltung Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.BUE_Einschaltung_ZuordnungImpl#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.BUE_Einschaltung_ZuordnungImpl#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Einschaltung_ZuordnungImpl extends Basis_ObjektImpl implements BUE_Einschaltung_Zuordnung {
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
	 * The cached value of the '{@link #getIDBUEGleisbezGefahrraum() <em>IDBUE Gleisbez Gefahrraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUEGleisbezGefahrraum()
	 * @generated
	 * @ordered
	 */
	protected ID_BUE_Gleisbezogener_Gefahrraum_TypeClass iDBUEGleisbezGefahrraum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Einschaltung_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Einschaltung_Zuordnung();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_EINSCHALTUNG, oldIDBUEEinschaltung, newIDBUEEinschaltung);
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
				msgs = ((InternalEObject)iDBUEEinschaltung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_EINSCHALTUNG, null, msgs);
			if (newIDBUEEinschaltung != null)
				msgs = ((InternalEObject)newIDBUEEinschaltung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_EINSCHALTUNG, null, msgs);
			msgs = basicSetIDBUEEinschaltung(newIDBUEEinschaltung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_EINSCHALTUNG, newIDBUEEinschaltung, newIDBUEEinschaltung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_BUE_Gleisbezogener_Gefahrraum_TypeClass getIDBUEGleisbezGefahrraum() {
		return iDBUEGleisbezGefahrraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBUEGleisbezGefahrraum(ID_BUE_Gleisbezogener_Gefahrraum_TypeClass newIDBUEGleisbezGefahrraum, NotificationChain msgs) {
		ID_BUE_Gleisbezogener_Gefahrraum_TypeClass oldIDBUEGleisbezGefahrraum = iDBUEGleisbezGefahrraum;
		iDBUEGleisbezGefahrraum = newIDBUEGleisbezGefahrraum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_GLEISBEZ_GEFAHRRAUM, oldIDBUEGleisbezGefahrraum, newIDBUEGleisbezGefahrraum);
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
	public void setIDBUEGleisbezGefahrraum(ID_BUE_Gleisbezogener_Gefahrraum_TypeClass newIDBUEGleisbezGefahrraum) {
		if (newIDBUEGleisbezGefahrraum != iDBUEGleisbezGefahrraum) {
			NotificationChain msgs = null;
			if (iDBUEGleisbezGefahrraum != null)
				msgs = ((InternalEObject)iDBUEGleisbezGefahrraum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_GLEISBEZ_GEFAHRRAUM, null, msgs);
			if (newIDBUEGleisbezGefahrraum != null)
				msgs = ((InternalEObject)newIDBUEGleisbezGefahrraum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_GLEISBEZ_GEFAHRRAUM, null, msgs);
			msgs = basicSetIDBUEGleisbezGefahrraum(newIDBUEGleisbezGefahrraum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_GLEISBEZ_GEFAHRRAUM, newIDBUEGleisbezGefahrraum, newIDBUEGleisbezGefahrraum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				return basicSetIDBUEEinschaltung(null, msgs);
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				return basicSetIDBUEGleisbezGefahrraum(null, msgs);
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
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				return getIDBUEEinschaltung();
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				return getIDBUEGleisbezGefahrraum();
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
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				setIDBUEEinschaltung((ID_BUE_Einschaltung_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				setIDBUEGleisbezGefahrraum((ID_BUE_Gleisbezogener_Gefahrraum_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				setIDBUEEinschaltung((ID_BUE_Einschaltung_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				setIDBUEGleisbezGefahrraum((ID_BUE_Gleisbezogener_Gefahrraum_TypeClass)null);
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
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				return iDBUEEinschaltung != null;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				return iDBUEGleisbezGefahrraum != null;
		}
		return super.eIsSet(featureID);
	}

} //BUE_Einschaltung_ZuordnungImpl
