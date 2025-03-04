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

import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Ausschaltung;
import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_BUE_Gleisbezogener_Gefahrraum_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Ausschaltung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_AusschaltungImpl#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_AusschaltungImpl extends Basis_ObjektImpl implements BUE_Ausschaltung {
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
	protected BUE_AusschaltungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Ausschaltung();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_AUSSCHALTUNG__IDBUE_GLEISBEZ_GEFAHRRAUM, oldIDBUEGleisbezGefahrraum, newIDBUEGleisbezGefahrraum);
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
				msgs = ((InternalEObject)iDBUEGleisbezGefahrraum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_AUSSCHALTUNG__IDBUE_GLEISBEZ_GEFAHRRAUM, null, msgs);
			if (newIDBUEGleisbezGefahrraum != null)
				msgs = ((InternalEObject)newIDBUEGleisbezGefahrraum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_AUSSCHALTUNG__IDBUE_GLEISBEZ_GEFAHRRAUM, null, msgs);
			msgs = basicSetIDBUEGleisbezGefahrraum(newIDBUEGleisbezGefahrraum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_AUSSCHALTUNG__IDBUE_GLEISBEZ_GEFAHRRAUM, newIDBUEGleisbezGefahrraum, newIDBUEGleisbezGefahrraum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_AUSSCHALTUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				return basicSetIDBUEGleisbezGefahrraum(null, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_AUSSCHALTUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				return getIDBUEGleisbezGefahrraum();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_AUSSCHALTUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				setIDBUEGleisbezGefahrraum((ID_BUE_Gleisbezogener_Gefahrraum_TypeClass)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_AUSSCHALTUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				setIDBUEGleisbezGefahrraum((ID_BUE_Gleisbezogener_Gefahrraum_TypeClass)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_AUSSCHALTUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				return iDBUEGleisbezGefahrraum != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //BUE_AusschaltungImpl
