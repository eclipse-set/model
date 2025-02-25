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
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup;

import org.eclipse.set.model.planpro.Verweise.ID_Bedien_Anzeige_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Abhaengigkeit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_AbhaengigkeitImpl#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_AbhaengigkeitImpl#getFstrAbhaengigkeitSsp <em>Fstr Abhaengigkeit Ssp</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_AbhaengigkeitImpl#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_AbhaengigkeitImpl extends Basis_ObjektImpl implements Fstr_Abhaengigkeit {
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
	 * The cached value of the '{@link #getFstrAbhaengigkeitSsp() <em>Fstr Abhaengigkeit Ssp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrAbhaengigkeitSsp()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Abhaengigkeit_Ssp_AttributeGroup fstrAbhaengigkeitSsp;

	/**
	 * The cached value of the '{@link #getIDBedienAnzeigeElement() <em>ID Bedien Anzeige Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienAnzeigeElement()
	 * @generated
	 * @ordered
	 */
	protected ID_Bedien_Anzeige_Element_TypeClass iDBedienAnzeigeElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_AbhaengigkeitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_ABHAENGIGKEIT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, newIDFstrFahrweg);
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
				msgs = ((InternalEObject)iDFstrFahrweg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG, null, msgs);
			if (newIDFstrFahrweg != null)
				msgs = ((InternalEObject)newIDFstrFahrweg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG, null, msgs);
			msgs = basicSetIDFstrFahrweg(newIDFstrFahrweg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG, newIDFstrFahrweg, newIDFstrFahrweg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Abhaengigkeit_Ssp_AttributeGroup getFstrAbhaengigkeitSsp() {
		return fstrAbhaengigkeitSsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrAbhaengigkeitSsp(Fstr_Abhaengigkeit_Ssp_AttributeGroup newFstrAbhaengigkeitSsp, NotificationChain msgs) {
		Fstr_Abhaengigkeit_Ssp_AttributeGroup oldFstrAbhaengigkeitSsp = fstrAbhaengigkeitSsp;
		fstrAbhaengigkeitSsp = newFstrAbhaengigkeitSsp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP, oldFstrAbhaengigkeitSsp, newFstrAbhaengigkeitSsp);
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
	public void setFstrAbhaengigkeitSsp(Fstr_Abhaengigkeit_Ssp_AttributeGroup newFstrAbhaengigkeitSsp) {
		if (newFstrAbhaengigkeitSsp != fstrAbhaengigkeitSsp) {
			NotificationChain msgs = null;
			if (fstrAbhaengigkeitSsp != null)
				msgs = ((InternalEObject)fstrAbhaengigkeitSsp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP, null, msgs);
			if (newFstrAbhaengigkeitSsp != null)
				msgs = ((InternalEObject)newFstrAbhaengigkeitSsp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP, null, msgs);
			msgs = basicSetFstrAbhaengigkeitSsp(newFstrAbhaengigkeitSsp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP, newFstrAbhaengigkeitSsp, newFstrAbhaengigkeitSsp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bedien_Anzeige_Element_TypeClass getIDBedienAnzeigeElement() {
		return iDBedienAnzeigeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBedienAnzeigeElement(ID_Bedien_Anzeige_Element_TypeClass newIDBedienAnzeigeElement, NotificationChain msgs) {
		ID_Bedien_Anzeige_Element_TypeClass oldIDBedienAnzeigeElement = iDBedienAnzeigeElement;
		iDBedienAnzeigeElement = newIDBedienAnzeigeElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT, oldIDBedienAnzeigeElement, newIDBedienAnzeigeElement);
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
	public void setIDBedienAnzeigeElement(ID_Bedien_Anzeige_Element_TypeClass newIDBedienAnzeigeElement) {
		if (newIDBedienAnzeigeElement != iDBedienAnzeigeElement) {
			NotificationChain msgs = null;
			if (iDBedienAnzeigeElement != null)
				msgs = ((InternalEObject)iDBedienAnzeigeElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT, null, msgs);
			if (newIDBedienAnzeigeElement != null)
				msgs = ((InternalEObject)newIDBedienAnzeigeElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT, null, msgs);
			msgs = basicSetIDBedienAnzeigeElement(newIDBedienAnzeigeElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT, newIDBedienAnzeigeElement, newIDBedienAnzeigeElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG:
				return basicSetIDFstrFahrweg(null, msgs);
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP:
				return basicSetFstrAbhaengigkeitSsp(null, msgs);
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT:
				return basicSetIDBedienAnzeigeElement(null, msgs);
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
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG:
				return getIDFstrFahrweg();
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP:
				return getFstrAbhaengigkeitSsp();
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT:
				return getIDBedienAnzeigeElement();
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
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG:
				setIDFstrFahrweg((ID_Fstr_Fahrweg_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP:
				setFstrAbhaengigkeitSsp((Fstr_Abhaengigkeit_Ssp_AttributeGroup)newValue);
				return;
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT:
				setIDBedienAnzeigeElement((ID_Bedien_Anzeige_Element_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG:
				setIDFstrFahrweg((ID_Fstr_Fahrweg_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP:
				setFstrAbhaengigkeitSsp((Fstr_Abhaengigkeit_Ssp_AttributeGroup)null);
				return;
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT:
				setIDBedienAnzeigeElement((ID_Bedien_Anzeige_Element_TypeClass)null);
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
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG:
				return iDFstrFahrweg != null;
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP:
				return fstrAbhaengigkeitSsp != null;
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT:
				return iDBedienAnzeigeElement != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fstr_AbhaengigkeitImpl
