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
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Nichthaltfall;

import org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Nichthaltfall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_NichthaltfallImpl#getIDFMAAnlage <em>IDFMA Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_NichthaltfallImpl#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_NichthaltfallImpl extends Basis_ObjektImpl implements Fstr_Nichthaltfall {
	/**
	 * The cached value of the '{@link #getIDFMAAnlage() <em>IDFMA Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFMAAnlage()
	 * @generated
	 * @ordered
	 */
	protected ID_FMA_Anlage_TypeClass iDFMAAnlage;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_NichthaltfallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_NICHTHALTFALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_FMA_Anlage_TypeClass getIDFMAAnlage() {
		return iDFMAAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFMAAnlage(ID_FMA_Anlage_TypeClass newIDFMAAnlage, NotificationChain msgs) {
		ID_FMA_Anlage_TypeClass oldIDFMAAnlage = iDFMAAnlage;
		iDFMAAnlage = newIDFMAAnlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_NICHTHALTFALL__IDFMA_ANLAGE, oldIDFMAAnlage, newIDFMAAnlage);
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
	public void setIDFMAAnlage(ID_FMA_Anlage_TypeClass newIDFMAAnlage) {
		if (newIDFMAAnlage != iDFMAAnlage) {
			NotificationChain msgs = null;
			if (iDFMAAnlage != null)
				msgs = ((InternalEObject)iDFMAAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_NICHTHALTFALL__IDFMA_ANLAGE, null, msgs);
			if (newIDFMAAnlage != null)
				msgs = ((InternalEObject)newIDFMAAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_NICHTHALTFALL__IDFMA_ANLAGE, null, msgs);
			msgs = basicSetIDFMAAnlage(newIDFMAAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_NICHTHALTFALL__IDFMA_ANLAGE, newIDFMAAnlage, newIDFMAAnlage));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, newIDFstrFahrweg);
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
				msgs = ((InternalEObject)iDFstrFahrweg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG, null, msgs);
			if (newIDFstrFahrweg != null)
				msgs = ((InternalEObject)newIDFstrFahrweg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG, null, msgs);
			msgs = basicSetIDFstrFahrweg(newIDFstrFahrweg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG, newIDFstrFahrweg, newIDFstrFahrweg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_NICHTHALTFALL__IDFMA_ANLAGE:
				return basicSetIDFMAAnlage(null, msgs);
			case FahrstrassePackage.FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG:
				return basicSetIDFstrFahrweg(null, msgs);
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
			case FahrstrassePackage.FSTR_NICHTHALTFALL__IDFMA_ANLAGE:
				return getIDFMAAnlage();
			case FahrstrassePackage.FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG:
				return getIDFstrFahrweg();
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
			case FahrstrassePackage.FSTR_NICHTHALTFALL__IDFMA_ANLAGE:
				setIDFMAAnlage((ID_FMA_Anlage_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG:
				setIDFstrFahrweg((ID_Fstr_Fahrweg_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_NICHTHALTFALL__IDFMA_ANLAGE:
				setIDFMAAnlage((ID_FMA_Anlage_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG:
				setIDFstrFahrweg((ID_Fstr_Fahrweg_TypeClass)null);
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
			case FahrstrassePackage.FSTR_NICHTHALTFALL__IDFMA_ANLAGE:
				return iDFMAAnlage != null;
			case FahrstrassePackage.FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG:
				return iDFstrFahrweg != null;
		}
		return super.eIsSet(featureID);
	}

} //Fstr_NichthaltfallImpl
