/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_ZN_Anzeigefeld_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_ZN_TypeClass;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Akustik;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Akustik_Anzeigefeld_AttributeGroup;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Akustik</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_AkustikImpl#getZNAkustikAnzeigefeld <em>ZN Akustik Anzeigefeld</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_AkustikImpl#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_AkustikImpl#getIDZNAnzeigefeld <em>IDZN Anzeigefeld</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_AkustikImpl extends Basis_ObjektImpl implements ZN_Akustik {
	/**
	 * The cached value of the '{@link #getZNAkustikAnzeigefeld() <em>ZN Akustik Anzeigefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNAkustikAnzeigefeld()
	 * @generated
	 * @ordered
	 */
	protected ZN_Akustik_Anzeigefeld_AttributeGroup zNAkustikAnzeigefeld;

	/**
	 * The cached value of the '{@link #getIDZN() <em>IDZN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZN()
	 * @generated
	 * @ordered
	 */
	protected ID_ZN_TypeClass iDZN;

	/**
	 * The cached value of the '{@link #getIDZNAnzeigefeld() <em>IDZN Anzeigefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZNAnzeigefeld()
	 * @generated
	 * @ordered
	 */
	protected ID_ZN_Anzeigefeld_TypeClass iDZNAnzeigefeld;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_AkustikImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_AKUSTIK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Akustik_Anzeigefeld_AttributeGroup getZNAkustikAnzeigefeld() {
		return zNAkustikAnzeigefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNAkustikAnzeigefeld(ZN_Akustik_Anzeigefeld_AttributeGroup newZNAkustikAnzeigefeld, NotificationChain msgs) {
		ZN_Akustik_Anzeigefeld_AttributeGroup oldZNAkustikAnzeigefeld = zNAkustikAnzeigefeld;
		zNAkustikAnzeigefeld = newZNAkustikAnzeigefeld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD, oldZNAkustikAnzeigefeld, newZNAkustikAnzeigefeld);
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
	public void setZNAkustikAnzeigefeld(ZN_Akustik_Anzeigefeld_AttributeGroup newZNAkustikAnzeigefeld) {
		if (newZNAkustikAnzeigefeld != zNAkustikAnzeigefeld) {
			NotificationChain msgs = null;
			if (zNAkustikAnzeigefeld != null)
				msgs = ((InternalEObject)zNAkustikAnzeigefeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD, null, msgs);
			if (newZNAkustikAnzeigefeld != null)
				msgs = ((InternalEObject)newZNAkustikAnzeigefeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD, null, msgs);
			msgs = basicSetZNAkustikAnzeigefeld(newZNAkustikAnzeigefeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD, newZNAkustikAnzeigefeld, newZNAkustikAnzeigefeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZN_TypeClass getIDZN() {
		return iDZN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZN(ID_ZN_TypeClass newIDZN, NotificationChain msgs) {
		ID_ZN_TypeClass oldIDZN = iDZN;
		iDZN = newIDZN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN, oldIDZN, newIDZN);
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
	public void setIDZN(ID_ZN_TypeClass newIDZN) {
		if (newIDZN != iDZN) {
			NotificationChain msgs = null;
			if (iDZN != null)
				msgs = ((InternalEObject)iDZN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN, null, msgs);
			if (newIDZN != null)
				msgs = ((InternalEObject)newIDZN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN, null, msgs);
			msgs = basicSetIDZN(newIDZN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN, newIDZN, newIDZN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZN_Anzeigefeld_TypeClass getIDZNAnzeigefeld() {
		return iDZNAnzeigefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZNAnzeigefeld(ID_ZN_Anzeigefeld_TypeClass newIDZNAnzeigefeld, NotificationChain msgs) {
		ID_ZN_Anzeigefeld_TypeClass oldIDZNAnzeigefeld = iDZNAnzeigefeld;
		iDZNAnzeigefeld = newIDZNAnzeigefeld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN_ANZEIGEFELD, oldIDZNAnzeigefeld, newIDZNAnzeigefeld);
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
	public void setIDZNAnzeigefeld(ID_ZN_Anzeigefeld_TypeClass newIDZNAnzeigefeld) {
		if (newIDZNAnzeigefeld != iDZNAnzeigefeld) {
			NotificationChain msgs = null;
			if (iDZNAnzeigefeld != null)
				msgs = ((InternalEObject)iDZNAnzeigefeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN_ANZEIGEFELD, null, msgs);
			if (newIDZNAnzeigefeld != null)
				msgs = ((InternalEObject)newIDZNAnzeigefeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN_ANZEIGEFELD, null, msgs);
			msgs = basicSetIDZNAnzeigefeld(newIDZNAnzeigefeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN_ANZEIGEFELD, newIDZNAnzeigefeld, newIDZNAnzeigefeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD:
				return basicSetZNAkustikAnzeigefeld(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN:
				return basicSetIDZN(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN_ANZEIGEFELD:
				return basicSetIDZNAnzeigefeld(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD:
				return getZNAkustikAnzeigefeld();
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN:
				return getIDZN();
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN_ANZEIGEFELD:
				return getIDZNAnzeigefeld();
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
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD:
				setZNAkustikAnzeigefeld((ZN_Akustik_Anzeigefeld_AttributeGroup)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN:
				setIDZN((ID_ZN_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN_ANZEIGEFELD:
				setIDZNAnzeigefeld((ID_ZN_Anzeigefeld_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD:
				setZNAkustikAnzeigefeld((ZN_Akustik_Anzeigefeld_AttributeGroup)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN:
				setIDZN((ID_ZN_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN_ANZEIGEFELD:
				setIDZNAnzeigefeld((ID_ZN_Anzeigefeld_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD:
				return zNAkustikAnzeigefeld != null;
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN:
				return iDZN != null;
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN_ANZEIGEFELD:
				return iDZNAnzeigefeld != null;
		}
		return super.eIsSet(featureID);
	}

} //ZN_AkustikImpl
