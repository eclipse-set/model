/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ansteuerung_Element.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Bezeichnung_ESTW_ZE_TypeClass;
import org.eclipse.set.model.planpro.Ansteuerung_Element.ESTW_Zentraleinheit_Bezeichnung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESTW Zentraleinheit Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.ESTW_Zentraleinheit_Bezeichnung_AttributeGroupImpl#getBezeichnungESTWZE <em>Bezeichnung ESTWZE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESTW_Zentraleinheit_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements ESTW_Zentraleinheit_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungESTWZE() <em>Bezeichnung ESTWZE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungESTWZE()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_ESTW_ZE_TypeClass bezeichnungESTWZE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESTW_Zentraleinheit_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_ESTW_ZE_TypeClass getBezeichnungESTWZE() {
		return bezeichnungESTWZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungESTWZE(Bezeichnung_ESTW_ZE_TypeClass newBezeichnungESTWZE, NotificationChain msgs) {
		Bezeichnung_ESTW_ZE_TypeClass oldBezeichnungESTWZE = bezeichnungESTWZE;
		bezeichnungESTWZE = newBezeichnungESTWZE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ESTWZE, oldBezeichnungESTWZE, newBezeichnungESTWZE);
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
	public void setBezeichnungESTWZE(Bezeichnung_ESTW_ZE_TypeClass newBezeichnungESTWZE) {
		if (newBezeichnungESTWZE != bezeichnungESTWZE) {
			NotificationChain msgs = null;
			if (bezeichnungESTWZE != null)
				msgs = ((InternalEObject)bezeichnungESTWZE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ESTWZE, null, msgs);
			if (newBezeichnungESTWZE != null)
				msgs = ((InternalEObject)newBezeichnungESTWZE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ESTWZE, null, msgs);
			msgs = basicSetBezeichnungESTWZE(newBezeichnungESTWZE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ESTWZE, newBezeichnungESTWZE, newBezeichnungESTWZE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ESTWZE:
				return basicSetBezeichnungESTWZE(null, msgs);
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ESTWZE:
				return getBezeichnungESTWZE();
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ESTWZE:
				setBezeichnungESTWZE((Bezeichnung_ESTW_ZE_TypeClass)newValue);
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ESTWZE:
				setBezeichnungESTWZE((Bezeichnung_ESTW_ZE_TypeClass)null);
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ESTWZE:
				return bezeichnungESTWZE != null;
		}
		return super.eIsSet(featureID);
	}

} //ESTW_Zentraleinheit_Bezeichnung_AttributeGroupImpl
