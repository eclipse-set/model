/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zuglenkung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Verweise.ID_ZL_TypeClass;

import org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe;
import org.eclipse.set.model.model11001.Zuglenkung.ZL_Signalgruppe_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL Signalgruppe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_SignalgruppeImpl#getIDZL <em>IDZL</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_SignalgruppeImpl#getZLSignalgruppeAllg <em>ZL Signalgruppe Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_SignalgruppeImpl extends Basis_ObjektImpl implements ZL_Signalgruppe {
	/**
	 * The cached value of the '{@link #getIDZL() <em>IDZL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZL()
	 * @generated
	 * @ordered
	 */
	protected ID_ZL_TypeClass iDZL;

	/**
	 * The cached value of the '{@link #getZLSignalgruppeAllg() <em>ZL Signalgruppe Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLSignalgruppeAllg()
	 * @generated
	 * @ordered
	 */
	protected ZL_Signalgruppe_Allg_AttributeGroup zLSignalgruppeAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_SignalgruppeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_SIGNALGRUPPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZL_TypeClass getIDZL() {
		return iDZL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZL(ID_ZL_TypeClass newIDZL, NotificationChain msgs) {
		ID_ZL_TypeClass oldIDZL = iDZL;
		iDZL = newIDZL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_SIGNALGRUPPE__IDZL, oldIDZL, newIDZL);
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
	public void setIDZL(ID_ZL_TypeClass newIDZL) {
		if (newIDZL != iDZL) {
			NotificationChain msgs = null;
			if (iDZL != null)
				msgs = ((InternalEObject)iDZL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_SIGNALGRUPPE__IDZL, null, msgs);
			if (newIDZL != null)
				msgs = ((InternalEObject)newIDZL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_SIGNALGRUPPE__IDZL, null, msgs);
			msgs = basicSetIDZL(newIDZL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_SIGNALGRUPPE__IDZL, newIDZL, newIDZL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Signalgruppe_Allg_AttributeGroup getZLSignalgruppeAllg() {
		return zLSignalgruppeAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLSignalgruppeAllg(ZL_Signalgruppe_Allg_AttributeGroup newZLSignalgruppeAllg, NotificationChain msgs) {
		ZL_Signalgruppe_Allg_AttributeGroup oldZLSignalgruppeAllg = zLSignalgruppeAllg;
		zLSignalgruppeAllg = newZLSignalgruppeAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG, oldZLSignalgruppeAllg, newZLSignalgruppeAllg);
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
	public void setZLSignalgruppeAllg(ZL_Signalgruppe_Allg_AttributeGroup newZLSignalgruppeAllg) {
		if (newZLSignalgruppeAllg != zLSignalgruppeAllg) {
			NotificationChain msgs = null;
			if (zLSignalgruppeAllg != null)
				msgs = ((InternalEObject)zLSignalgruppeAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG, null, msgs);
			if (newZLSignalgruppeAllg != null)
				msgs = ((InternalEObject)newZLSignalgruppeAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG, null, msgs);
			msgs = basicSetZLSignalgruppeAllg(newZLSignalgruppeAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG, newZLSignalgruppeAllg, newZLSignalgruppeAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__IDZL:
				return basicSetIDZL(null, msgs);
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG:
				return basicSetZLSignalgruppeAllg(null, msgs);
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__IDZL:
				return getIDZL();
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG:
				return getZLSignalgruppeAllg();
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__IDZL:
				setIDZL((ID_ZL_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG:
				setZLSignalgruppeAllg((ZL_Signalgruppe_Allg_AttributeGroup)newValue);
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__IDZL:
				setIDZL((ID_ZL_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG:
				setZLSignalgruppeAllg((ZL_Signalgruppe_Allg_AttributeGroup)null);
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__IDZL:
				return iDZL != null;
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG:
				return zLSignalgruppeAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //ZL_SignalgruppeImpl
