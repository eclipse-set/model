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

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Geodaten.GEO_Knoten;
import org.eclipse.set.model.planpro.Geodaten.GEO_PAD_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.GeodatenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GEO Knoten</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.GEO_KnotenImpl#getGEOPAD <em>GEOPAD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GEO_KnotenImpl extends Basis_ObjektImpl implements GEO_Knoten {
	/**
	 * The cached value of the '{@link #getGEOPAD() <em>GEOPAD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEOPAD()
	 * @generated
	 * @ordered
	 */
	protected GEO_PAD_TypeClass gEOPAD;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GEO_KnotenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.GEO_KNOTEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_PAD_TypeClass getGEOPAD() {
		return gEOPAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGEOPAD(GEO_PAD_TypeClass newGEOPAD, NotificationChain msgs) {
		GEO_PAD_TypeClass oldGEOPAD = gEOPAD;
		gEOPAD = newGEOPAD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KNOTEN__GEOPAD, oldGEOPAD, newGEOPAD);
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
	public void setGEOPAD(GEO_PAD_TypeClass newGEOPAD) {
		if (newGEOPAD != gEOPAD) {
			NotificationChain msgs = null;
			if (gEOPAD != null)
				msgs = ((InternalEObject)gEOPAD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KNOTEN__GEOPAD, null, msgs);
			if (newGEOPAD != null)
				msgs = ((InternalEObject)newGEOPAD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KNOTEN__GEOPAD, null, msgs);
			msgs = basicSetGEOPAD(newGEOPAD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KNOTEN__GEOPAD, newGEOPAD, newGEOPAD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.GEO_KNOTEN__GEOPAD:
				return basicSetGEOPAD(null, msgs);
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
			case GeodatenPackage.GEO_KNOTEN__GEOPAD:
				return getGEOPAD();
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
			case GeodatenPackage.GEO_KNOTEN__GEOPAD:
				setGEOPAD((GEO_PAD_TypeClass)newValue);
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
			case GeodatenPackage.GEO_KNOTEN__GEOPAD:
				setGEOPAD((GEO_PAD_TypeClass)null);
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
			case GeodatenPackage.GEO_KNOTEN__GEOPAD:
				return gEOPAD != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //GEO_KnotenImpl
