/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.model.planpro.Geodaten.GeodatenPackage;
import org.eclipse.set.model.planpro.Geodaten.Ueberhoehung;
import org.eclipse.set.model.planpro.Geodaten.Ueberhoehung_Allg_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ueberhoehung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.UeberhoehungImpl#getUeberhoehungAllg <em>Ueberhoehung Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UeberhoehungImpl extends Punkt_ObjektImpl implements Ueberhoehung {
	/**
	 * The cached value of the '{@link #getUeberhoehungAllg() <em>Ueberhoehung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUeberhoehungAllg()
	 * @generated
	 * @ordered
	 */
	protected Ueberhoehung_Allg_AttributeGroup ueberhoehungAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UeberhoehungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.UEBERHOEHUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberhoehung_Allg_AttributeGroup getUeberhoehungAllg() {
		return ueberhoehungAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUeberhoehungAllg(Ueberhoehung_Allg_AttributeGroup newUeberhoehungAllg, NotificationChain msgs) {
		Ueberhoehung_Allg_AttributeGroup oldUeberhoehungAllg = ueberhoehungAllg;
		ueberhoehungAllg = newUeberhoehungAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNG__UEBERHOEHUNG_ALLG, oldUeberhoehungAllg, newUeberhoehungAllg);
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
	public void setUeberhoehungAllg(Ueberhoehung_Allg_AttributeGroup newUeberhoehungAllg) {
		if (newUeberhoehungAllg != ueberhoehungAllg) {
			NotificationChain msgs = null;
			if (ueberhoehungAllg != null)
				msgs = ((InternalEObject)ueberhoehungAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNG__UEBERHOEHUNG_ALLG, null, msgs);
			if (newUeberhoehungAllg != null)
				msgs = ((InternalEObject)newUeberhoehungAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNG__UEBERHOEHUNG_ALLG, null, msgs);
			msgs = basicSetUeberhoehungAllg(newUeberhoehungAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNG__UEBERHOEHUNG_ALLG, newUeberhoehungAllg, newUeberhoehungAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.UEBERHOEHUNG__UEBERHOEHUNG_ALLG:
				return basicSetUeberhoehungAllg(null, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeodatenPackage.UEBERHOEHUNG__UEBERHOEHUNG_ALLG:
				return getUeberhoehungAllg();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeodatenPackage.UEBERHOEHUNG__UEBERHOEHUNG_ALLG:
				setUeberhoehungAllg((Ueberhoehung_Allg_AttributeGroup)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GeodatenPackage.UEBERHOEHUNG__UEBERHOEHUNG_ALLG:
				setUeberhoehungAllg((Ueberhoehung_Allg_AttributeGroup)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GeodatenPackage.UEBERHOEHUNG__UEBERHOEHUNG_ALLG:
				return ueberhoehungAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //UeberhoehungImpl
