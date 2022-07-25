/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Basisobjekte.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.model.model1902.Basisobjekte.LST_Objekt_Art_TypeClass;
import org.eclipse.set.model.model1902.Basisobjekte.Proxy_Objekt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy Objekt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.impl.Proxy_ObjektImpl#getLSTObjektArt <em>LST Objekt Art</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Proxy_ObjektImpl extends Ur_ObjektImpl implements Proxy_Objekt {
	/**
	 * The cached value of the '{@link #getLSTObjektArt() <em>LST Objekt Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLSTObjektArt()
	 * @generated
	 * @ordered
	 */
	protected LST_Objekt_Art_TypeClass lSTObjektArt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Proxy_ObjektImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisobjektePackage.Literals.PROXY_OBJEKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LST_Objekt_Art_TypeClass getLSTObjektArt() {
		return lSTObjektArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLSTObjektArt(LST_Objekt_Art_TypeClass newLSTObjektArt, NotificationChain msgs) {
		LST_Objekt_Art_TypeClass oldLSTObjektArt = lSTObjektArt;
		lSTObjektArt = newLSTObjektArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.PROXY_OBJEKT__LST_OBJEKT_ART, oldLSTObjektArt, newLSTObjektArt);
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
	public void setLSTObjektArt(LST_Objekt_Art_TypeClass newLSTObjektArt) {
		if (newLSTObjektArt != lSTObjektArt) {
			NotificationChain msgs = null;
			if (lSTObjektArt != null)
				msgs = ((InternalEObject)lSTObjektArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.PROXY_OBJEKT__LST_OBJEKT_ART, null, msgs);
			if (newLSTObjektArt != null)
				msgs = ((InternalEObject)newLSTObjektArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.PROXY_OBJEKT__LST_OBJEKT_ART, null, msgs);
			msgs = basicSetLSTObjektArt(newLSTObjektArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.PROXY_OBJEKT__LST_OBJEKT_ART, newLSTObjektArt, newLSTObjektArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisobjektePackage.PROXY_OBJEKT__LST_OBJEKT_ART:
				return basicSetLSTObjektArt(null, msgs);
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
			case BasisobjektePackage.PROXY_OBJEKT__LST_OBJEKT_ART:
				return getLSTObjektArt();
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
			case BasisobjektePackage.PROXY_OBJEKT__LST_OBJEKT_ART:
				setLSTObjektArt((LST_Objekt_Art_TypeClass)newValue);
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
			case BasisobjektePackage.PROXY_OBJEKT__LST_OBJEKT_ART:
				setLSTObjektArt((LST_Objekt_Art_TypeClass)null);
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
			case BasisobjektePackage.PROXY_OBJEKT__LST_OBJEKT_ART:
				return lSTObjektArt != null;
		}
		return super.eIsSet(featureID);
	}

} //Proxy_ObjektImpl
