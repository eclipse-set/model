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

import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kante;
import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Kante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_KanteImpl#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_KanteImpl extends Punkt_ObjektImpl implements BUE_Kante {
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
	protected BUE_KanteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Kante();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_KANTE__IDBUE_ANLAGE, oldIDBUEAnlage, newIDBUEAnlage);
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
				msgs = ((InternalEObject)iDBUEAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_KANTE__IDBUE_ANLAGE, null, msgs);
			if (newIDBUEAnlage != null)
				msgs = ((InternalEObject)newIDBUEAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_KANTE__IDBUE_ANLAGE, null, msgs);
			msgs = basicSetIDBUEAnlage(newIDBUEAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_KANTE__IDBUE_ANLAGE, newIDBUEAnlage, newIDBUEAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_KANTE__IDBUE_ANLAGE:
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
			case BahnuebergangPackage.BUE_KANTE__IDBUE_ANLAGE:
				return getIDBUEAnlage();
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
			case BahnuebergangPackage.BUE_KANTE__IDBUE_ANLAGE:
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
			case BahnuebergangPackage.BUE_KANTE__IDBUE_ANLAGE:
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
			case BahnuebergangPackage.BUE_KANTE__IDBUE_ANLAGE:
				return iDBUEAnlage != null;
		}
		return super.eIsSet(featureID);
	}

} //BUE_KanteImpl
