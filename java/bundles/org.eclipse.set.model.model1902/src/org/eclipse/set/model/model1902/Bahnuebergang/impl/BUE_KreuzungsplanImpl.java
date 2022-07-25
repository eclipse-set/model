/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup;
import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_Anhang_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Kreuzungsplan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_KreuzungsplanImpl#getBUEKreuzungsplanKoordinaten <em>BUE Kreuzungsplan Koordinaten</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_KreuzungsplanImpl#getIDAnhangKreuzungsplan <em>ID Anhang Kreuzungsplan</em>}</li>
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__BUE_KREUZUNGSPLAN_KOORDINATEN:
				return ((InternalEList<?>)getBUEKreuzungsplanKoordinaten()).basicRemove(otherEnd, msgs);
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN:
				return basicSetIDAnhangKreuzungsplan(null, msgs);
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
		}
		return super.eIsSet(featureID);
	}

} //BUE_KreuzungsplanImpl
