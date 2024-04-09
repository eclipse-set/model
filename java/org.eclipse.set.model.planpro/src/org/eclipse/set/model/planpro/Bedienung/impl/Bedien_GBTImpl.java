/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Bedienung.Bedien_GBT;
import org.eclipse.set.model.planpro.Bedienung.Bedien_GBT_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;

import org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Bedien_Bezirk_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien GBT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_GBTImpl#getBedienGBTAllg <em>Bedien GBT Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_GBTImpl#getIDAnhangVorgabeGBT <em>ID Anhang Vorgabe GBT</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_GBTImpl#getIDBedienBezirk <em>ID Bedien Bezirk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_GBTImpl extends Basis_ObjektImpl implements Bedien_GBT {
	/**
	 * The cached value of the '{@link #getBedienGBTAllg() <em>Bedien GBT Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienGBTAllg()
	 * @generated
	 * @ordered
	 */
	protected Bedien_GBT_Allg_AttributeGroup bedienGBTAllg;

	/**
	 * The cached value of the '{@link #getIDAnhangVorgabeGBT() <em>ID Anhang Vorgabe GBT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangVorgabeGBT()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangVorgabeGBT;

	/**
	 * The cached value of the '{@link #getIDBedienBezirk() <em>ID Bedien Bezirk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienBezirk()
	 * @generated
	 * @ordered
	 */
	protected ID_Bedien_Bezirk_TypeClass iDBedienBezirk;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_GBTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_GBT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_GBT_Allg_AttributeGroup getBedienGBTAllg() {
		return bedienGBTAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienGBTAllg(Bedien_GBT_Allg_AttributeGroup newBedienGBTAllg, NotificationChain msgs) {
		Bedien_GBT_Allg_AttributeGroup oldBedienGBTAllg = bedienGBTAllg;
		bedienGBTAllg = newBedienGBTAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG, oldBedienGBTAllg, newBedienGBTAllg);
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
	public void setBedienGBTAllg(Bedien_GBT_Allg_AttributeGroup newBedienGBTAllg) {
		if (newBedienGBTAllg != bedienGBTAllg) {
			NotificationChain msgs = null;
			if (bedienGBTAllg != null)
				msgs = ((InternalEObject)bedienGBTAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG, null, msgs);
			if (newBedienGBTAllg != null)
				msgs = ((InternalEObject)newBedienGBTAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG, null, msgs);
			msgs = basicSetBedienGBTAllg(newBedienGBTAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG, newBedienGBTAllg, newBedienGBTAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass getIDAnhangVorgabeGBT() {
		return iDAnhangVorgabeGBT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangVorgabeGBT(ID_Anhang_TypeClass newIDAnhangVorgabeGBT, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangVorgabeGBT = iDAnhangVorgabeGBT;
		iDAnhangVorgabeGBT = newIDAnhangVorgabeGBT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_GBT__ID_ANHANG_VORGABE_GBT, oldIDAnhangVorgabeGBT, newIDAnhangVorgabeGBT);
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
	public void setIDAnhangVorgabeGBT(ID_Anhang_TypeClass newIDAnhangVorgabeGBT) {
		if (newIDAnhangVorgabeGBT != iDAnhangVorgabeGBT) {
			NotificationChain msgs = null;
			if (iDAnhangVorgabeGBT != null)
				msgs = ((InternalEObject)iDAnhangVorgabeGBT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_GBT__ID_ANHANG_VORGABE_GBT, null, msgs);
			if (newIDAnhangVorgabeGBT != null)
				msgs = ((InternalEObject)newIDAnhangVorgabeGBT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_GBT__ID_ANHANG_VORGABE_GBT, null, msgs);
			msgs = basicSetIDAnhangVorgabeGBT(newIDAnhangVorgabeGBT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_GBT__ID_ANHANG_VORGABE_GBT, newIDAnhangVorgabeGBT, newIDAnhangVorgabeGBT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bedien_Bezirk_TypeClass getIDBedienBezirk() {
		return iDBedienBezirk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBedienBezirk(ID_Bedien_Bezirk_TypeClass newIDBedienBezirk, NotificationChain msgs) {
		ID_Bedien_Bezirk_TypeClass oldIDBedienBezirk = iDBedienBezirk;
		iDBedienBezirk = newIDBedienBezirk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_GBT__ID_BEDIEN_BEZIRK, oldIDBedienBezirk, newIDBedienBezirk);
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
	public void setIDBedienBezirk(ID_Bedien_Bezirk_TypeClass newIDBedienBezirk) {
		if (newIDBedienBezirk != iDBedienBezirk) {
			NotificationChain msgs = null;
			if (iDBedienBezirk != null)
				msgs = ((InternalEObject)iDBedienBezirk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_GBT__ID_BEDIEN_BEZIRK, null, msgs);
			if (newIDBedienBezirk != null)
				msgs = ((InternalEObject)newIDBedienBezirk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_GBT__ID_BEDIEN_BEZIRK, null, msgs);
			msgs = basicSetIDBedienBezirk(newIDBedienBezirk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_GBT__ID_BEDIEN_BEZIRK, newIDBedienBezirk, newIDBedienBezirk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG:
				return basicSetBedienGBTAllg(null, msgs);
			case BedienungPackage.BEDIEN_GBT__ID_ANHANG_VORGABE_GBT:
				return basicSetIDAnhangVorgabeGBT(null, msgs);
			case BedienungPackage.BEDIEN_GBT__ID_BEDIEN_BEZIRK:
				return basicSetIDBedienBezirk(null, msgs);
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
			case BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG:
				return getBedienGBTAllg();
			case BedienungPackage.BEDIEN_GBT__ID_ANHANG_VORGABE_GBT:
				return getIDAnhangVorgabeGBT();
			case BedienungPackage.BEDIEN_GBT__ID_BEDIEN_BEZIRK:
				return getIDBedienBezirk();
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
			case BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG:
				setBedienGBTAllg((Bedien_GBT_Allg_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_GBT__ID_ANHANG_VORGABE_GBT:
				setIDAnhangVorgabeGBT((ID_Anhang_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_GBT__ID_BEDIEN_BEZIRK:
				setIDBedienBezirk((ID_Bedien_Bezirk_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG:
				setBedienGBTAllg((Bedien_GBT_Allg_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_GBT__ID_ANHANG_VORGABE_GBT:
				setIDAnhangVorgabeGBT((ID_Anhang_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_GBT__ID_BEDIEN_BEZIRK:
				setIDBedienBezirk((ID_Bedien_Bezirk_TypeClass)null);
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
			case BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG:
				return bedienGBTAllg != null;
			case BedienungPackage.BEDIEN_GBT__ID_ANHANG_VORGABE_GBT:
				return iDAnhangVorgabeGBT != null;
			case BedienungPackage.BEDIEN_GBT__ID_BEDIEN_BEZIRK:
				return iDBedienBezirk != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_GBTImpl
