/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ansteuerung_Element.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Bezeichnung_TSO_TypeClass;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Technik_Standort_Bezeichnung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technik Standort Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.Technik_Standort_Bezeichnung_AttributeGroupImpl#getBezeichnungTSO <em>Bezeichnung TSO</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Technik_Standort_Bezeichnung_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Technik_Standort_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungTSO() <em>Bezeichnung TSO</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungTSO()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_TSO_TypeClass bezeichnungTSO;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Technik_Standort_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.TECHNIK_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_TSO_TypeClass getBezeichnungTSO() {
		return bezeichnungTSO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungTSO(Bezeichnung_TSO_TypeClass newBezeichnungTSO, NotificationChain msgs) {
		Bezeichnung_TSO_TypeClass oldBezeichnungTSO = bezeichnungTSO;
		bezeichnungTSO = newBezeichnungTSO;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TECHNIK_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_TSO, oldBezeichnungTSO, newBezeichnungTSO);
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
	public void setBezeichnungTSO(Bezeichnung_TSO_TypeClass newBezeichnungTSO) {
		if (newBezeichnungTSO != bezeichnungTSO) {
			NotificationChain msgs = null;
			if (bezeichnungTSO != null)
				msgs = ((InternalEObject)bezeichnungTSO).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TECHNIK_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_TSO, null, msgs);
			if (newBezeichnungTSO != null)
				msgs = ((InternalEObject)newBezeichnungTSO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TECHNIK_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_TSO, null, msgs);
			msgs = basicSetBezeichnungTSO(newBezeichnungTSO, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TECHNIK_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_TSO, newBezeichnungTSO, newBezeichnungTSO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_TSO:
				return basicSetBezeichnungTSO(null, msgs);
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
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_TSO:
				return getBezeichnungTSO();
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
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_TSO:
				setBezeichnungTSO((Bezeichnung_TSO_TypeClass)newValue);
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
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_TSO:
				setBezeichnungTSO((Bezeichnung_TSO_TypeClass)null);
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
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_TSO:
				return bezeichnungTSO != null;
		}
		return super.eIsSet(featureID);
	}

} //Technik_Standort_Bezeichnung_AttributeGroupImpl
