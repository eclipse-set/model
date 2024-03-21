/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Gleis.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Bereich_ObjektImpl;

import org.eclipse.set.model.planpro.Gleis.GleisPackage;
import org.eclipse.set.model.planpro.Gleis.Gleis_Lichtraum;
import org.eclipse.set.model.planpro.Gleis.Lichtraumprofil_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gleis Lichtraum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_LichtraumImpl#getLichtraumprofil <em>Lichtraumprofil</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Gleis_LichtraumImpl extends Bereich_ObjektImpl implements Gleis_Lichtraum {
	/**
	 * The cached value of the '{@link #getLichtraumprofil() <em>Lichtraumprofil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLichtraumprofil()
	 * @generated
	 * @ordered
	 */
	protected Lichtraumprofil_TypeClass lichtraumprofil;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gleis_LichtraumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GleisPackage.Literals.GLEIS_LICHTRAUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lichtraumprofil_TypeClass getLichtraumprofil() {
		return lichtraumprofil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLichtraumprofil(Lichtraumprofil_TypeClass newLichtraumprofil, NotificationChain msgs) {
		Lichtraumprofil_TypeClass oldLichtraumprofil = lichtraumprofil;
		lichtraumprofil = newLichtraumprofil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_LICHTRAUM__LICHTRAUMPROFIL, oldLichtraumprofil, newLichtraumprofil);
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
	public void setLichtraumprofil(Lichtraumprofil_TypeClass newLichtraumprofil) {
		if (newLichtraumprofil != lichtraumprofil) {
			NotificationChain msgs = null;
			if (lichtraumprofil != null)
				msgs = ((InternalEObject)lichtraumprofil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_LICHTRAUM__LICHTRAUMPROFIL, null, msgs);
			if (newLichtraumprofil != null)
				msgs = ((InternalEObject)newLichtraumprofil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_LICHTRAUM__LICHTRAUMPROFIL, null, msgs);
			msgs = basicSetLichtraumprofil(newLichtraumprofil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_LICHTRAUM__LICHTRAUMPROFIL, newLichtraumprofil, newLichtraumprofil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GleisPackage.GLEIS_LICHTRAUM__LICHTRAUMPROFIL:
				return basicSetLichtraumprofil(null, msgs);
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
			case GleisPackage.GLEIS_LICHTRAUM__LICHTRAUMPROFIL:
				return getLichtraumprofil();
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
			case GleisPackage.GLEIS_LICHTRAUM__LICHTRAUMPROFIL:
				setLichtraumprofil((Lichtraumprofil_TypeClass)newValue);
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
			case GleisPackage.GLEIS_LICHTRAUM__LICHTRAUMPROFIL:
				setLichtraumprofil((Lichtraumprofil_TypeClass)null);
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
			case GleisPackage.GLEIS_LICHTRAUM__LICHTRAUMPROFIL:
				return lichtraumprofil != null;
		}
		return super.eIsSet(featureID);
	}

} //Gleis_LichtraumImpl
