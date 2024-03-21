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
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Umfahrpunkt;

import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Umfahrpunkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Umfahrpunkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_UmfahrpunktImpl#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_UmfahrpunktImpl#getIDUmfahrpunkt <em>ID Umfahrpunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_UmfahrpunktImpl extends Basis_ObjektImpl implements Fstr_Umfahrpunkt {
	/**
	 * The cached value of the '{@link #getIDFstrFahrweg() <em>ID Fstr Fahrweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrFahrweg()
	 * @generated
	 * @ordered
	 */
	protected ID_Fstr_Fahrweg_TypeClass iDFstrFahrweg;

	/**
	 * The cached value of the '{@link #getIDUmfahrpunkt() <em>ID Umfahrpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUmfahrpunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_Umfahrpunkt_TypeClass iDUmfahrpunkt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_UmfahrpunktImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_UMFAHRPUNKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_Fahrweg_TypeClass getIDFstrFahrweg() {
		return iDFstrFahrweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFstrFahrweg(ID_Fstr_Fahrweg_TypeClass newIDFstrFahrweg, NotificationChain msgs) {
		ID_Fstr_Fahrweg_TypeClass oldIDFstrFahrweg = iDFstrFahrweg;
		iDFstrFahrweg = newIDFstrFahrweg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, newIDFstrFahrweg);
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
	public void setIDFstrFahrweg(ID_Fstr_Fahrweg_TypeClass newIDFstrFahrweg) {
		if (newIDFstrFahrweg != iDFstrFahrweg) {
			NotificationChain msgs = null;
			if (iDFstrFahrweg != null)
				msgs = ((InternalEObject)iDFstrFahrweg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG, null, msgs);
			if (newIDFstrFahrweg != null)
				msgs = ((InternalEObject)newIDFstrFahrweg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG, null, msgs);
			msgs = basicSetIDFstrFahrweg(newIDFstrFahrweg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG, newIDFstrFahrweg, newIDFstrFahrweg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Umfahrpunkt_TypeClass getIDUmfahrpunkt() {
		return iDUmfahrpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDUmfahrpunkt(ID_Umfahrpunkt_TypeClass newIDUmfahrpunkt, NotificationChain msgs) {
		ID_Umfahrpunkt_TypeClass oldIDUmfahrpunkt = iDUmfahrpunkt;
		iDUmfahrpunkt = newIDUmfahrpunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT, oldIDUmfahrpunkt, newIDUmfahrpunkt);
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
	public void setIDUmfahrpunkt(ID_Umfahrpunkt_TypeClass newIDUmfahrpunkt) {
		if (newIDUmfahrpunkt != iDUmfahrpunkt) {
			NotificationChain msgs = null;
			if (iDUmfahrpunkt != null)
				msgs = ((InternalEObject)iDUmfahrpunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT, null, msgs);
			if (newIDUmfahrpunkt != null)
				msgs = ((InternalEObject)newIDUmfahrpunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT, null, msgs);
			msgs = basicSetIDUmfahrpunkt(newIDUmfahrpunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT, newIDUmfahrpunkt, newIDUmfahrpunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG:
				return basicSetIDFstrFahrweg(null, msgs);
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT:
				return basicSetIDUmfahrpunkt(null, msgs);
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
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG:
				return getIDFstrFahrweg();
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT:
				return getIDUmfahrpunkt();
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
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG:
				setIDFstrFahrweg((ID_Fstr_Fahrweg_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT:
				setIDUmfahrpunkt((ID_Umfahrpunkt_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG:
				setIDFstrFahrweg((ID_Fstr_Fahrweg_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT:
				setIDUmfahrpunkt((ID_Umfahrpunkt_TypeClass)null);
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
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG:
				return iDFstrFahrweg != null;
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT:
				return iDUmfahrpunkt != null;
		}
		return super.eIsSet(featureID);
	}

} //Fstr_UmfahrpunktImpl
