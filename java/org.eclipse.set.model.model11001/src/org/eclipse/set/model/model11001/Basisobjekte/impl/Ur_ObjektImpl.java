/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Basisobjekte.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.model.model11001.Basisobjekte.Identitaet_TypeClass;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ur Objekt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.impl.Ur_ObjektImpl#getIdentitaet <em>Identitaet</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Ur_ObjektImpl extends EObjectImpl implements Ur_Objekt {
	/**
	 * The cached value of the '{@link #getIdentitaet() <em>Identitaet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentitaet()
	 * @generated
	 * @ordered
	 */
	protected Identitaet_TypeClass identitaet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ur_ObjektImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisobjektePackage.Literals.UR_OBJEKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identitaet_TypeClass getIdentitaet() {
		return identitaet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentitaet(Identitaet_TypeClass newIdentitaet, NotificationChain msgs) {
		Identitaet_TypeClass oldIdentitaet = identitaet;
		identitaet = newIdentitaet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.UR_OBJEKT__IDENTITAET, oldIdentitaet, newIdentitaet);
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
	public void setIdentitaet(Identitaet_TypeClass newIdentitaet) {
		if (newIdentitaet != identitaet) {
			NotificationChain msgs = null;
			if (identitaet != null)
				msgs = ((InternalEObject)identitaet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.UR_OBJEKT__IDENTITAET, null, msgs);
			if (newIdentitaet != null)
				msgs = ((InternalEObject)newIdentitaet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.UR_OBJEKT__IDENTITAET, null, msgs);
			msgs = basicSetIdentitaet(newIdentitaet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.UR_OBJEKT__IDENTITAET, newIdentitaet, newIdentitaet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisobjektePackage.UR_OBJEKT__IDENTITAET:
				return basicSetIdentitaet(null, msgs);
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
			case BasisobjektePackage.UR_OBJEKT__IDENTITAET:
				return getIdentitaet();
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
			case BasisobjektePackage.UR_OBJEKT__IDENTITAET:
				setIdentitaet((Identitaet_TypeClass)newValue);
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
			case BasisobjektePackage.UR_OBJEKT__IDENTITAET:
				setIdentitaet((Identitaet_TypeClass)null);
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
			case BasisobjektePackage.UR_OBJEKT__IDENTITAET:
				return identitaet != null;
		}
		return super.eIsSet(featureID);
	}

} //Ur_ObjektImpl
