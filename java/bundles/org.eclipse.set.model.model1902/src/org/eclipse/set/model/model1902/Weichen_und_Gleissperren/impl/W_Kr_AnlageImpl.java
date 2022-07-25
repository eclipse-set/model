/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Signal_TypeClass;

import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Anlage;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WKr Anlage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.W_Kr_AnlageImpl#getIDAnhangDWS <em>ID Anhang DWS</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.W_Kr_AnlageImpl#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.W_Kr_AnlageImpl#getWKrAnlageAllg <em>WKr Anlage Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class W_Kr_AnlageImpl extends Basis_ObjektImpl implements W_Kr_Anlage {
	/**
	 * The cached value of the '{@link #getIDAnhangDWS() <em>ID Anhang DWS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangDWS()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangDWS;

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
	 * The cached value of the '{@link #getWKrAnlageAllg() <em>WKr Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWKrAnlageAllg()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Anlage_Allg_AttributeGroup wKrAnlageAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected W_Kr_AnlageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Weichen_und_GleissperrenPackage.Literals.WKR_ANLAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass getIDAnhangDWS() {
		return iDAnhangDWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangDWS(ID_Anhang_TypeClass newIDAnhangDWS, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangDWS = iDAnhangDWS;
		iDAnhangDWS = newIDAnhangDWS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_ANHANG_DWS, oldIDAnhangDWS, newIDAnhangDWS);
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
	public void setIDAnhangDWS(ID_Anhang_TypeClass newIDAnhangDWS) {
		if (newIDAnhangDWS != iDAnhangDWS) {
			NotificationChain msgs = null;
			if (iDAnhangDWS != null)
				msgs = ((InternalEObject)iDAnhangDWS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_ANHANG_DWS, null, msgs);
			if (newIDAnhangDWS != null)
				msgs = ((InternalEObject)newIDAnhangDWS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_ANHANG_DWS, null, msgs);
			msgs = basicSetIDAnhangDWS(newIDAnhangDWS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_ANHANG_DWS, newIDAnhangDWS, newIDAnhangDWS));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_SIGNAL, oldIDSignal, newIDSignal);
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
				msgs = ((InternalEObject)iDSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_SIGNAL, null, msgs);
			if (newIDSignal != null)
				msgs = ((InternalEObject)newIDSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_SIGNAL, null, msgs);
			msgs = basicSetIDSignal(newIDSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_SIGNAL, newIDSignal, newIDSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Anlage_Allg_AttributeGroup getWKrAnlageAllg() {
		return wKrAnlageAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWKrAnlageAllg(W_Kr_Anlage_Allg_AttributeGroup newWKrAnlageAllg, NotificationChain msgs) {
		W_Kr_Anlage_Allg_AttributeGroup oldWKrAnlageAllg = wKrAnlageAllg;
		wKrAnlageAllg = newWKrAnlageAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG, oldWKrAnlageAllg, newWKrAnlageAllg);
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
	public void setWKrAnlageAllg(W_Kr_Anlage_Allg_AttributeGroup newWKrAnlageAllg) {
		if (newWKrAnlageAllg != wKrAnlageAllg) {
			NotificationChain msgs = null;
			if (wKrAnlageAllg != null)
				msgs = ((InternalEObject)wKrAnlageAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG, null, msgs);
			if (newWKrAnlageAllg != null)
				msgs = ((InternalEObject)newWKrAnlageAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG, null, msgs);
			msgs = basicSetWKrAnlageAllg(newWKrAnlageAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG, newWKrAnlageAllg, newWKrAnlageAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_ANHANG_DWS:
				return basicSetIDAnhangDWS(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_SIGNAL:
				return basicSetIDSignal(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG:
				return basicSetWKrAnlageAllg(null, msgs);
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
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_ANHANG_DWS:
				return getIDAnhangDWS();
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_SIGNAL:
				return getIDSignal();
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG:
				return getWKrAnlageAllg();
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
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_ANHANG_DWS:
				setIDAnhangDWS((ID_Anhang_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_SIGNAL:
				setIDSignal((ID_Signal_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG:
				setWKrAnlageAllg((W_Kr_Anlage_Allg_AttributeGroup)newValue);
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
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_ANHANG_DWS:
				setIDAnhangDWS((ID_Anhang_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_SIGNAL:
				setIDSignal((ID_Signal_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG:
				setWKrAnlageAllg((W_Kr_Anlage_Allg_AttributeGroup)null);
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
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_ANHANG_DWS:
				return iDAnhangDWS != null;
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_SIGNAL:
				return iDSignal != null;
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG:
				return wKrAnlageAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //W_Kr_AnlageImpl
