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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup;
import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_Anhang_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Kreuzungsplan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_KreuzungsplanImpl#getBUEKreuzungsplanKoordinaten <em>BUE Kreuzungsplan Koordinaten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_KreuzungsplanImpl#getIDAnhangKreuzungsplan <em>ID Anhang Kreuzungsplan</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_KreuzungsplanImpl#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_KreuzungsplanImpl extends Basis_ObjektImpl implements BUE_Kreuzungsplan {
	/**
	 * The cached value of the '{@link #getBUEKreuzungsplanKoordinaten() <em>BUE Kreuzungsplan Koordinaten</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEKreuzungsplanKoordinaten()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Kreuzungsplan_Koordinaten_AttributeGroup> bUEKreuzungsplanKoordinaten;

	/**
	 * The cached value of the '{@link #getIDAnhangKreuzungsplan() <em>ID Anhang Kreuzungsplan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangKreuzungsplan()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_ohne_Proxy_TypeClass iDAnhangKreuzungsplan;

	/**
	 * The cached value of the '{@link #getIDBUEAnlage() <em>IDBUE Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUEAnlage()
	 * @generated
	 * @ordered
	 */
	protected ID_BUE_Anlage_ohne_Proxy_TypeClass iDBUEAnlage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_KreuzungsplanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Kreuzungsplan();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Kreuzungsplan_Koordinaten_AttributeGroup> getBUEKreuzungsplanKoordinaten() {
		if (bUEKreuzungsplanKoordinaten == null) {
			bUEKreuzungsplanKoordinaten = new EObjectContainmentEList<BUE_Kreuzungsplan_Koordinaten_AttributeGroup>(BUE_Kreuzungsplan_Koordinaten_AttributeGroup.class, this, BahnuebergangPackage.BUE_KREUZUNGSPLAN__BUE_KREUZUNGSPLAN_KOORDINATEN);
		}
		return bUEKreuzungsplanKoordinaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_ohne_Proxy_TypeClass getIDAnhangKreuzungsplan() {
		return iDAnhangKreuzungsplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangKreuzungsplan(ID_Anhang_ohne_Proxy_TypeClass newIDAnhangKreuzungsplan, NotificationChain msgs) {
		ID_Anhang_ohne_Proxy_TypeClass oldIDAnhangKreuzungsplan = iDAnhangKreuzungsplan;
		iDAnhangKreuzungsplan = newIDAnhangKreuzungsplan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN, oldIDAnhangKreuzungsplan, newIDAnhangKreuzungsplan);
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
	public void setIDAnhangKreuzungsplan(ID_Anhang_ohne_Proxy_TypeClass newIDAnhangKreuzungsplan) {
		if (newIDAnhangKreuzungsplan != iDAnhangKreuzungsplan) {
			NotificationChain msgs = null;
			if (iDAnhangKreuzungsplan != null)
				msgs = ((InternalEObject)iDAnhangKreuzungsplan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN, null, msgs);
			if (newIDAnhangKreuzungsplan != null)
				msgs = ((InternalEObject)newIDAnhangKreuzungsplan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN, null, msgs);
			msgs = basicSetIDAnhangKreuzungsplan(newIDAnhangKreuzungsplan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN, newIDAnhangKreuzungsplan, newIDAnhangKreuzungsplan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_BUE_Anlage_ohne_Proxy_TypeClass getIDBUEAnlage() {
		return iDBUEAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBUEAnlage(ID_BUE_Anlage_ohne_Proxy_TypeClass newIDBUEAnlage, NotificationChain msgs) {
		ID_BUE_Anlage_ohne_Proxy_TypeClass oldIDBUEAnlage = iDBUEAnlage;
		iDBUEAnlage = newIDBUEAnlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_KREUZUNGSPLAN__IDBUE_ANLAGE, oldIDBUEAnlage, newIDBUEAnlage);
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
	public void setIDBUEAnlage(ID_BUE_Anlage_ohne_Proxy_TypeClass newIDBUEAnlage) {
		if (newIDBUEAnlage != iDBUEAnlage) {
			NotificationChain msgs = null;
			if (iDBUEAnlage != null)
				msgs = ((InternalEObject)iDBUEAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_KREUZUNGSPLAN__IDBUE_ANLAGE, null, msgs);
			if (newIDBUEAnlage != null)
				msgs = ((InternalEObject)newIDBUEAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_KREUZUNGSPLAN__IDBUE_ANLAGE, null, msgs);
			msgs = basicSetIDBUEAnlage(newIDBUEAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_KREUZUNGSPLAN__IDBUE_ANLAGE, newIDBUEAnlage, newIDBUEAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__BUE_KREUZUNGSPLAN_KOORDINATEN:
				return ((InternalEList<?>)getBUEKreuzungsplanKoordinaten()).basicRemove(otherEnd, msgs);
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN:
				return basicSetIDAnhangKreuzungsplan(null, msgs);
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__IDBUE_ANLAGE:
				return basicSetIDBUEAnlage(null, msgs);
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
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__BUE_KREUZUNGSPLAN_KOORDINATEN:
				return getBUEKreuzungsplanKoordinaten();
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN:
				return getIDAnhangKreuzungsplan();
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__IDBUE_ANLAGE:
				return getIDBUEAnlage();
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
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__BUE_KREUZUNGSPLAN_KOORDINATEN:
				getBUEKreuzungsplanKoordinaten().clear();
				getBUEKreuzungsplanKoordinaten().addAll((Collection<? extends BUE_Kreuzungsplan_Koordinaten_AttributeGroup>)newValue);
				return;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN:
				setIDAnhangKreuzungsplan((ID_Anhang_ohne_Proxy_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__IDBUE_ANLAGE:
				setIDBUEAnlage((ID_BUE_Anlage_ohne_Proxy_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__BUE_KREUZUNGSPLAN_KOORDINATEN:
				getBUEKreuzungsplanKoordinaten().clear();
				return;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN:
				setIDAnhangKreuzungsplan((ID_Anhang_ohne_Proxy_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__IDBUE_ANLAGE:
				setIDBUEAnlage((ID_BUE_Anlage_ohne_Proxy_TypeClass)null);
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
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__BUE_KREUZUNGSPLAN_KOORDINATEN:
				return bUEKreuzungsplanKoordinaten != null && !bUEKreuzungsplanKoordinaten.isEmpty();
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN:
				return iDAnhangKreuzungsplan != null;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__IDBUE_ANLAGE:
				return iDBUEAnlage != null;
		}
		return super.eIsSet(featureID);
	}

} //BUE_KreuzungsplanImpl
