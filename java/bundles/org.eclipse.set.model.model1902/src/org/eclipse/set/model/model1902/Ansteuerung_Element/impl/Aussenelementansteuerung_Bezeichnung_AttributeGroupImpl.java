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
import org.eclipse.set.model.model1902.Ansteuerung_Element.Aussenelementansteuerung_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Bezeichnung_AEA_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aussenelementansteuerung Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.Aussenelementansteuerung_Bezeichnung_AttributeGroupImpl#getBezeichnungAEA <em>Bezeichnung AEA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Aussenelementansteuerung_Bezeichnung_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Aussenelementansteuerung_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungAEA() <em>Bezeichnung AEA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungAEA()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_AEA_TypeClass bezeichnungAEA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Aussenelementansteuerung_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.AUSSENELEMENTANSTEUERUNG_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_AEA_TypeClass getBezeichnungAEA() {
		return bezeichnungAEA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungAEA(Bezeichnung_AEA_TypeClass newBezeichnungAEA, NotificationChain msgs) {
		Bezeichnung_AEA_TypeClass oldBezeichnungAEA = bezeichnungAEA;
		bezeichnungAEA = newBezeichnungAEA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_AEA, oldBezeichnungAEA, newBezeichnungAEA);
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
	public void setBezeichnungAEA(Bezeichnung_AEA_TypeClass newBezeichnungAEA) {
		if (newBezeichnungAEA != bezeichnungAEA) {
			NotificationChain msgs = null;
			if (bezeichnungAEA != null)
				msgs = ((InternalEObject)bezeichnungAEA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_AEA, null, msgs);
			if (newBezeichnungAEA != null)
				msgs = ((InternalEObject)newBezeichnungAEA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_AEA, null, msgs);
			msgs = basicSetBezeichnungAEA(newBezeichnungAEA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_AEA, newBezeichnungAEA, newBezeichnungAEA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_AEA:
				return basicSetBezeichnungAEA(null, msgs);
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
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_AEA:
				return getBezeichnungAEA();
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
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_AEA:
				setBezeichnungAEA((Bezeichnung_AEA_TypeClass)newValue);
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
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_AEA:
				setBezeichnungAEA((Bezeichnung_AEA_TypeClass)null);
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
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_AEA:
				return bezeichnungAEA != null;
		}
		return super.eIsSet(featureID);
	}

} //Aussenelementansteuerung_Bezeichnung_AttributeGroupImpl
