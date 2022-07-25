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

import org.eclipse.set.model.model1902.Basisobjekte.Anhang;
import org.eclipse.set.model.model1902.Basisobjekte.Anhang_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anhang</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.impl.AnhangImpl#getAnhangAllg <em>Anhang Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnhangImpl extends Ur_ObjektImpl implements Anhang {
	/**
	 * The cached value of the '{@link #getAnhangAllg() <em>Anhang Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnhangAllg()
	 * @generated
	 * @ordered
	 */
	protected Anhang_Allg_AttributeGroup anhangAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnhangImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisobjektePackage.Literals.ANHANG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang_Allg_AttributeGroup getAnhangAllg() {
		return anhangAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnhangAllg(Anhang_Allg_AttributeGroup newAnhangAllg, NotificationChain msgs) {
		Anhang_Allg_AttributeGroup oldAnhangAllg = anhangAllg;
		anhangAllg = newAnhangAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.ANHANG__ANHANG_ALLG, oldAnhangAllg, newAnhangAllg);
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
	public void setAnhangAllg(Anhang_Allg_AttributeGroup newAnhangAllg) {
		if (newAnhangAllg != anhangAllg) {
			NotificationChain msgs = null;
			if (anhangAllg != null)
				msgs = ((InternalEObject)anhangAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.ANHANG__ANHANG_ALLG, null, msgs);
			if (newAnhangAllg != null)
				msgs = ((InternalEObject)newAnhangAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.ANHANG__ANHANG_ALLG, null, msgs);
			msgs = basicSetAnhangAllg(newAnhangAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.ANHANG__ANHANG_ALLG, newAnhangAllg, newAnhangAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisobjektePackage.ANHANG__ANHANG_ALLG:
				return basicSetAnhangAllg(null, msgs);
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
			case BasisobjektePackage.ANHANG__ANHANG_ALLG:
				return getAnhangAllg();
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
			case BasisobjektePackage.ANHANG__ANHANG_ALLG:
				setAnhangAllg((Anhang_Allg_AttributeGroup)newValue);
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
			case BasisobjektePackage.ANHANG__ANHANG_ALLG:
				setAnhangAllg((Anhang_Allg_AttributeGroup)null);
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
			case BasisobjektePackage.ANHANG__ANHANG_ALLG:
				return anhangAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //AnhangImpl
