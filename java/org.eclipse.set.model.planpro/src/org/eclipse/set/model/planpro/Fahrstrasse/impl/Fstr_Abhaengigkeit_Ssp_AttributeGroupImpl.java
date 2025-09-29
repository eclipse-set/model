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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Fahrstrasse.Aufloesung_Ssp_Zielgleis_TypeClass;
import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup;

import org.eclipse.set.model.planpro.Verweise.ID_Schluesselsperre_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Abhaengigkeit Ssp Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Abhaengigkeit_Ssp_AttributeGroupImpl#getAufloesungSspZielgleis <em>Aufloesung Ssp Zielgleis</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_Abhaengigkeit_Ssp_AttributeGroupImpl#getIDSchluesselsperre <em>ID Schluesselsperre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_Abhaengigkeit_Ssp_AttributeGroupImpl extends EObjectImpl implements Fstr_Abhaengigkeit_Ssp_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAufloesungSspZielgleis() <em>Aufloesung Ssp Zielgleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufloesungSspZielgleis()
	 * @generated
	 * @ordered
	 */
	protected Aufloesung_Ssp_Zielgleis_TypeClass aufloesungSspZielgleis;

	/**
	 * The cached value of the '{@link #getIDSchluesselsperre() <em>ID Schluesselsperre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSchluesselsperre()
	 * @generated
	 * @ordered
	 */
	protected ID_Schluesselsperre_TypeClass iDSchluesselsperre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_Abhaengigkeit_Ssp_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aufloesung_Ssp_Zielgleis_TypeClass getAufloesungSspZielgleis() {
		return aufloesungSspZielgleis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAufloesungSspZielgleis(Aufloesung_Ssp_Zielgleis_TypeClass newAufloesungSspZielgleis, NotificationChain msgs) {
		Aufloesung_Ssp_Zielgleis_TypeClass oldAufloesungSspZielgleis = aufloesungSspZielgleis;
		aufloesungSspZielgleis = newAufloesungSspZielgleis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS, oldAufloesungSspZielgleis, newAufloesungSspZielgleis);
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
	public void setAufloesungSspZielgleis(Aufloesung_Ssp_Zielgleis_TypeClass newAufloesungSspZielgleis) {
		if (newAufloesungSspZielgleis != aufloesungSspZielgleis) {
			NotificationChain msgs = null;
			if (aufloesungSspZielgleis != null)
				msgs = ((InternalEObject)aufloesungSspZielgleis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS, null, msgs);
			if (newAufloesungSspZielgleis != null)
				msgs = ((InternalEObject)newAufloesungSspZielgleis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS, null, msgs);
			msgs = basicSetAufloesungSspZielgleis(newAufloesungSspZielgleis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS, newAufloesungSspZielgleis, newAufloesungSspZielgleis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Schluesselsperre_TypeClass getIDSchluesselsperre() {
		return iDSchluesselsperre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSchluesselsperre(ID_Schluesselsperre_TypeClass newIDSchluesselsperre, NotificationChain msgs) {
		ID_Schluesselsperre_TypeClass oldIDSchluesselsperre = iDSchluesselsperre;
		iDSchluesselsperre = newIDSchluesselsperre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE, oldIDSchluesselsperre, newIDSchluesselsperre);
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
	public void setIDSchluesselsperre(ID_Schluesselsperre_TypeClass newIDSchluesselsperre) {
		if (newIDSchluesselsperre != iDSchluesselsperre) {
			NotificationChain msgs = null;
			if (iDSchluesselsperre != null)
				msgs = ((InternalEObject)iDSchluesselsperre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE, null, msgs);
			if (newIDSchluesselsperre != null)
				msgs = ((InternalEObject)newIDSchluesselsperre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE, null, msgs);
			msgs = basicSetIDSchluesselsperre(newIDSchluesselsperre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE, newIDSchluesselsperre, newIDSchluesselsperre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS:
				return basicSetAufloesungSspZielgleis(null, msgs);
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE:
				return basicSetIDSchluesselsperre(null, msgs);
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
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS:
				return getAufloesungSspZielgleis();
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE:
				return getIDSchluesselsperre();
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
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS:
				setAufloesungSspZielgleis((Aufloesung_Ssp_Zielgleis_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE:
				setIDSchluesselsperre((ID_Schluesselsperre_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS:
				setAufloesungSspZielgleis((Aufloesung_Ssp_Zielgleis_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE:
				setIDSchluesselsperre((ID_Schluesselsperre_TypeClass)null);
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
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS:
				return aufloesungSspZielgleis != null;
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE:
				return iDSchluesselsperre != null;
		}
		return super.eIsSet(featureID);
	}

} //Fstr_Abhaengigkeit_Ssp_AttributeGroupImpl
