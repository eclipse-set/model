/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Bedienung.Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;
import org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Anrueckabschnitt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Anrueckabschnitt Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroupImpl#getBezBedAnrueckabschnitt <em>Bez Bed Anrueckabschnitt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezBedAnrueckabschnitt() <em>Bez Bed Anrueckabschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezBedAnrueckabschnitt()
	 * @generated
	 * @ordered
	 */
	protected Bez_Bed_Anrueckabschnitt_TypeClass bezBedAnrueckabschnitt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_Bed_Anrueckabschnitt_TypeClass getBezBedAnrueckabschnitt() {
		return bezBedAnrueckabschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezBedAnrueckabschnitt(Bez_Bed_Anrueckabschnitt_TypeClass newBezBedAnrueckabschnitt, NotificationChain msgs) {
		Bez_Bed_Anrueckabschnitt_TypeClass oldBezBedAnrueckabschnitt = bezBedAnrueckabschnitt;
		bezBedAnrueckabschnitt = newBezBedAnrueckabschnitt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANRUECKABSCHNITT, oldBezBedAnrueckabschnitt, newBezBedAnrueckabschnitt);
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
	public void setBezBedAnrueckabschnitt(Bez_Bed_Anrueckabschnitt_TypeClass newBezBedAnrueckabschnitt) {
		if (newBezBedAnrueckabschnitt != bezBedAnrueckabschnitt) {
			NotificationChain msgs = null;
			if (bezBedAnrueckabschnitt != null)
				msgs = ((InternalEObject)bezBedAnrueckabschnitt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANRUECKABSCHNITT, null, msgs);
			if (newBezBedAnrueckabschnitt != null)
				msgs = ((InternalEObject)newBezBedAnrueckabschnitt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANRUECKABSCHNITT, null, msgs);
			msgs = basicSetBezBedAnrueckabschnitt(newBezBedAnrueckabschnitt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANRUECKABSCHNITT, newBezBedAnrueckabschnitt, newBezBedAnrueckabschnitt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANRUECKABSCHNITT:
				return basicSetBezBedAnrueckabschnitt(null, msgs);
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
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANRUECKABSCHNITT:
				return getBezBedAnrueckabschnitt();
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
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANRUECKABSCHNITT:
				setBezBedAnrueckabschnitt((Bez_Bed_Anrueckabschnitt_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANRUECKABSCHNITT:
				setBezBedAnrueckabschnitt((Bez_Bed_Anrueckabschnitt_TypeClass)null);
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
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANRUECKABSCHNITT:
				return bezBedAnrueckabschnitt != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroupImpl
