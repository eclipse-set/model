/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.planpro.Fahrstrasse.Sonstiger_Punkt;

import org.eclipse.set.model.planpro.Verweise.ID_Beginn_Bereich_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sonstiger Punkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Sonstiger_PunktImpl#getIDBeginnBereich <em>ID Beginn Bereich</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Sonstiger_PunktImpl extends Punkt_ObjektImpl implements Sonstiger_Punkt {
	/**
	 * The cached value of the '{@link #getIDBeginnBereich() <em>ID Beginn Bereich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBeginnBereich()
	 * @generated
	 * @ordered
	 */
	protected ID_Beginn_Bereich_TypeClass iDBeginnBereich;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sonstiger_PunktImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.SONSTIGER_PUNKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Beginn_Bereich_TypeClass getIDBeginnBereich() {
		return iDBeginnBereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBeginnBereich(ID_Beginn_Bereich_TypeClass newIDBeginnBereich, NotificationChain msgs) {
		ID_Beginn_Bereich_TypeClass oldIDBeginnBereich = iDBeginnBereich;
		iDBeginnBereich = newIDBeginnBereich;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.SONSTIGER_PUNKT__ID_BEGINN_BEREICH, oldIDBeginnBereich, newIDBeginnBereich);
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
	public void setIDBeginnBereich(ID_Beginn_Bereich_TypeClass newIDBeginnBereich) {
		if (newIDBeginnBereich != iDBeginnBereich) {
			NotificationChain msgs = null;
			if (iDBeginnBereich != null)
				msgs = ((InternalEObject)iDBeginnBereich).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.SONSTIGER_PUNKT__ID_BEGINN_BEREICH, null, msgs);
			if (newIDBeginnBereich != null)
				msgs = ((InternalEObject)newIDBeginnBereich).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.SONSTIGER_PUNKT__ID_BEGINN_BEREICH, null, msgs);
			msgs = basicSetIDBeginnBereich(newIDBeginnBereich, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.SONSTIGER_PUNKT__ID_BEGINN_BEREICH, newIDBeginnBereich, newIDBeginnBereich));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.SONSTIGER_PUNKT__ID_BEGINN_BEREICH:
				return basicSetIDBeginnBereich(null, msgs);
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
			case FahrstrassePackage.SONSTIGER_PUNKT__ID_BEGINN_BEREICH:
				return getIDBeginnBereich();
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
			case FahrstrassePackage.SONSTIGER_PUNKT__ID_BEGINN_BEREICH:
				setIDBeginnBereich((ID_Beginn_Bereich_TypeClass)newValue);
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
			case FahrstrassePackage.SONSTIGER_PUNKT__ID_BEGINN_BEREICH:
				setIDBeginnBereich((ID_Beginn_Bereich_TypeClass)null);
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
			case FahrstrassePackage.SONSTIGER_PUNKT__ID_BEGINN_BEREICH:
				return iDBeginnBereich != null;
		}
		return super.eIsSet(featureID);
	}

} //Sonstiger_PunktImpl
