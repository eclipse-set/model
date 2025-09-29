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

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Aneinander_Bedienstring_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Aneinander</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_AneinanderImpl#getFstrAneinanderBedienstring <em>Fstr Aneinander Bedienstring</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_AneinanderImpl extends Basis_ObjektImpl implements Fstr_Aneinander {
	/**
	 * The cached value of the '{@link #getFstrAneinanderBedienstring() <em>Fstr Aneinander Bedienstring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrAneinanderBedienstring()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Aneinander_Bedienstring_TypeClass fstrAneinanderBedienstring;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_AneinanderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_ANEINANDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Aneinander_Bedienstring_TypeClass getFstrAneinanderBedienstring() {
		return fstrAneinanderBedienstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrAneinanderBedienstring(Fstr_Aneinander_Bedienstring_TypeClass newFstrAneinanderBedienstring, NotificationChain msgs) {
		Fstr_Aneinander_Bedienstring_TypeClass oldFstrAneinanderBedienstring = fstrAneinanderBedienstring;
		fstrAneinanderBedienstring = newFstrAneinanderBedienstring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ANEINANDER__FSTR_ANEINANDER_BEDIENSTRING, oldFstrAneinanderBedienstring, newFstrAneinanderBedienstring);
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
	public void setFstrAneinanderBedienstring(Fstr_Aneinander_Bedienstring_TypeClass newFstrAneinanderBedienstring) {
		if (newFstrAneinanderBedienstring != fstrAneinanderBedienstring) {
			NotificationChain msgs = null;
			if (fstrAneinanderBedienstring != null)
				msgs = ((InternalEObject)fstrAneinanderBedienstring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ANEINANDER__FSTR_ANEINANDER_BEDIENSTRING, null, msgs);
			if (newFstrAneinanderBedienstring != null)
				msgs = ((InternalEObject)newFstrAneinanderBedienstring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ANEINANDER__FSTR_ANEINANDER_BEDIENSTRING, null, msgs);
			msgs = basicSetFstrAneinanderBedienstring(newFstrAneinanderBedienstring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ANEINANDER__FSTR_ANEINANDER_BEDIENSTRING, newFstrAneinanderBedienstring, newFstrAneinanderBedienstring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_ANEINANDER__FSTR_ANEINANDER_BEDIENSTRING:
				return basicSetFstrAneinanderBedienstring(null, msgs);
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
			case FahrstrassePackage.FSTR_ANEINANDER__FSTR_ANEINANDER_BEDIENSTRING:
				return getFstrAneinanderBedienstring();
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
			case FahrstrassePackage.FSTR_ANEINANDER__FSTR_ANEINANDER_BEDIENSTRING:
				setFstrAneinanderBedienstring((Fstr_Aneinander_Bedienstring_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_ANEINANDER__FSTR_ANEINANDER_BEDIENSTRING:
				setFstrAneinanderBedienstring((Fstr_Aneinander_Bedienstring_TypeClass)null);
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
			case FahrstrassePackage.FSTR_ANEINANDER__FSTR_ANEINANDER_BEDIENSTRING:
				return fstrAneinanderBedienstring != null;
		}
		return super.eIsSet(featureID);
	}

} //Fstr_AneinanderImpl
