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

import org.eclipse.set.model.model11001.Verweise.ID_ZL_Fstr_TypeClass;

import org.eclipse.set.model.model11001.Zuglenkung.ZL_DLP_Fstr;
import org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL DLP Fstr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_DLP_FstrImpl#getIDZLFstr <em>IDZL Fstr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_DLP_FstrImpl extends Basis_ObjektImpl implements ZL_DLP_Fstr {
	/**
	 * The cached value of the '{@link #getIDZLFstr() <em>IDZL Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLFstr()
	 * @generated
	 * @ordered
	 */
	protected ID_ZL_Fstr_TypeClass iDZLFstr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_DLP_FstrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_DLP_FSTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZL_Fstr_TypeClass getIDZLFstr() {
		return iDZLFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZLFstr(ID_ZL_Fstr_TypeClass newIDZLFstr, NotificationChain msgs) {
		ID_ZL_Fstr_TypeClass oldIDZLFstr = iDZLFstr;
		iDZLFstr = newIDZLFstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_DLP_FSTR__IDZL_FSTR, oldIDZLFstr, newIDZLFstr);
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
	public void setIDZLFstr(ID_ZL_Fstr_TypeClass newIDZLFstr) {
		if (newIDZLFstr != iDZLFstr) {
			NotificationChain msgs = null;
			if (iDZLFstr != null)
				msgs = ((InternalEObject)iDZLFstr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_DLP_FSTR__IDZL_FSTR, null, msgs);
			if (newIDZLFstr != null)
				msgs = ((InternalEObject)newIDZLFstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_DLP_FSTR__IDZL_FSTR, null, msgs);
			msgs = basicSetIDZLFstr(newIDZLFstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_DLP_FSTR__IDZL_FSTR, newIDZLFstr, newIDZLFstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_DLP_FSTR__IDZL_FSTR:
				return basicSetIDZLFstr(null, msgs);
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
			case ZuglenkungPackage.ZL_DLP_FSTR__IDZL_FSTR:
				return getIDZLFstr();
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
			case ZuglenkungPackage.ZL_DLP_FSTR__IDZL_FSTR:
				setIDZLFstr((ID_ZL_Fstr_TypeClass)newValue);
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
			case ZuglenkungPackage.ZL_DLP_FSTR__IDZL_FSTR:
				setIDZLFstr((ID_ZL_Fstr_TypeClass)null);
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
			case ZuglenkungPackage.ZL_DLP_FSTR__IDZL_FSTR:
				return iDZLFstr != null;
		}
		return super.eIsSet(featureID);
	}

} //ZL_DLP_FstrImpl
