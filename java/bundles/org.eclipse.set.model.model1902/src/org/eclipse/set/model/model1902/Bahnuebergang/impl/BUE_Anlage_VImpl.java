/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Anlage V</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_VImpl#getBUEAnlageVAllg <em>BUE Anlage VAllg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Anlage_VImpl#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Anlage_VImpl extends Basis_ObjektImpl implements BUE_Anlage_V {
	/**
	 * The cached value of the '{@link #getBUEAnlageVAllg() <em>BUE Anlage VAllg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEAnlageVAllg()
	 * @generated
	 * @ordered
	 */
	protected BUE_Anlage_V_Allg_AttributeGroup bUEAnlageVAllg;

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
	protected BUE_Anlage_VImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Anlage_V();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Anlage_V_Allg_AttributeGroup getBUEAnlageVAllg() {
		return bUEAnlageVAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUEAnlageVAllg(BUE_Anlage_V_Allg_AttributeGroup newBUEAnlageVAllg, NotificationChain msgs) {
		BUE_Anlage_V_Allg_AttributeGroup oldBUEAnlageVAllg = bUEAnlageVAllg;
		bUEAnlageVAllg = newBUEAnlageVAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG, oldBUEAnlageVAllg, newBUEAnlageVAllg);
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
	public void setBUEAnlageVAllg(BUE_Anlage_V_Allg_AttributeGroup newBUEAnlageVAllg) {
		if (newBUEAnlageVAllg != bUEAnlageVAllg) {
			NotificationChain msgs = null;
			if (bUEAnlageVAllg != null)
				msgs = ((InternalEObject)bUEAnlageVAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG, null, msgs);
			if (newBUEAnlageVAllg != null)
				msgs = ((InternalEObject)newBUEAnlageVAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG, null, msgs);
			msgs = basicSetBUEAnlageVAllg(newBUEAnlageVAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG, newBUEAnlageVAllg, newBUEAnlageVAllg));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_V__IDBUE_ANLAGE, oldIDBUEAnlage, newIDBUEAnlage);
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
				msgs = ((InternalEObject)iDBUEAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_V__IDBUE_ANLAGE, null, msgs);
			if (newIDBUEAnlage != null)
				msgs = ((InternalEObject)newIDBUEAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_V__IDBUE_ANLAGE, null, msgs);
			msgs = basicSetIDBUEAnlage(newIDBUEAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_V__IDBUE_ANLAGE, newIDBUEAnlage, newIDBUEAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG:
				return basicSetBUEAnlageVAllg(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE_V__IDBUE_ANLAGE:
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
			case BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG:
				return getBUEAnlageVAllg();
			case BahnuebergangPackage.BUE_ANLAGE_V__IDBUE_ANLAGE:
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
			case BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG:
				setBUEAnlageVAllg((BUE_Anlage_V_Allg_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_V__IDBUE_ANLAGE:
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
			case BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG:
				setBUEAnlageVAllg((BUE_Anlage_V_Allg_AttributeGroup)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_V__IDBUE_ANLAGE:
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
			case BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG:
				return bUEAnlageVAllg != null;
			case BahnuebergangPackage.BUE_ANLAGE_V__IDBUE_ANLAGE:
				return iDBUEAnlage != null;
		}
		return super.eIsSet(featureID);
	}

} //BUE_Anlage_VImpl
