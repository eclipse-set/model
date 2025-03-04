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
import org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt;
import org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt_Allg_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hoehenpunkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.HoehenpunktImpl#getHoehenpunktAllg <em>Hoehenpunkt Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HoehenpunktImpl extends Punkt_ObjektImpl implements Hoehenpunkt {
	/**
	 * The cached value of the '{@link #getHoehenpunktAllg() <em>Hoehenpunkt Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoehenpunktAllg()
	 * @generated
	 * @ordered
	 */
	protected Hoehenpunkt_Allg_AttributeGroup hoehenpunktAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HoehenpunktImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.HOEHENPUNKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehenpunkt_Allg_AttributeGroup getHoehenpunktAllg() {
		return hoehenpunktAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHoehenpunktAllg(Hoehenpunkt_Allg_AttributeGroup newHoehenpunktAllg, NotificationChain msgs) {
		Hoehenpunkt_Allg_AttributeGroup oldHoehenpunktAllg = hoehenpunktAllg;
		hoehenpunktAllg = newHoehenpunktAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENPUNKT__HOEHENPUNKT_ALLG, oldHoehenpunktAllg, newHoehenpunktAllg);
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
	public void setHoehenpunktAllg(Hoehenpunkt_Allg_AttributeGroup newHoehenpunktAllg) {
		if (newHoehenpunktAllg != hoehenpunktAllg) {
			NotificationChain msgs = null;
			if (hoehenpunktAllg != null)
				msgs = ((InternalEObject)hoehenpunktAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENPUNKT__HOEHENPUNKT_ALLG, null, msgs);
			if (newHoehenpunktAllg != null)
				msgs = ((InternalEObject)newHoehenpunktAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENPUNKT__HOEHENPUNKT_ALLG, null, msgs);
			msgs = basicSetHoehenpunktAllg(newHoehenpunktAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENPUNKT__HOEHENPUNKT_ALLG, newHoehenpunktAllg, newHoehenpunktAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.HOEHENPUNKT__HOEHENPUNKT_ALLG:
				return basicSetHoehenpunktAllg(null, msgs);
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
			case GeodatenPackage.HOEHENPUNKT__HOEHENPUNKT_ALLG:
				return getHoehenpunktAllg();
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
			case GeodatenPackage.HOEHENPUNKT__HOEHENPUNKT_ALLG:
				setHoehenpunktAllg((Hoehenpunkt_Allg_AttributeGroup)newValue);
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
			case GeodatenPackage.HOEHENPUNKT__HOEHENPUNKT_ALLG:
				setHoehenpunktAllg((Hoehenpunkt_Allg_AttributeGroup)null);
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
			case GeodatenPackage.HOEHENPUNKT__HOEHENPUNKT_ALLG:
				return hoehenpunktAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //HoehenpunktImpl
