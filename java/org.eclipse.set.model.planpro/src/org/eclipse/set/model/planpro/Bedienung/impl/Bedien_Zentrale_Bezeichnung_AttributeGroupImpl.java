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

import org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;
import org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Zentrale_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Zentrale Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Zentrale_Bezeichnung_AttributeGroupImpl#getBezBedZentrale <em>Bez Bed Zentrale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Zentrale_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Bedien_Zentrale_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezBedZentrale() <em>Bez Bed Zentrale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezBedZentrale()
	 * @generated
	 * @ordered
	 */
	protected Bez_Bed_Zentrale_TypeClass bezBedZentrale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Zentrale_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_Bed_Zentrale_TypeClass getBezBedZentrale() {
		return bezBedZentrale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezBedZentrale(Bez_Bed_Zentrale_TypeClass newBezBedZentrale, NotificationChain msgs) {
		Bez_Bed_Zentrale_TypeClass oldBezBedZentrale = bezBedZentrale;
		bezBedZentrale = newBezBedZentrale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ZENTRALE, oldBezBedZentrale, newBezBedZentrale);
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
	public void setBezBedZentrale(Bez_Bed_Zentrale_TypeClass newBezBedZentrale) {
		if (newBezBedZentrale != bezBedZentrale) {
			NotificationChain msgs = null;
			if (bezBedZentrale != null)
				msgs = ((InternalEObject)bezBedZentrale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ZENTRALE, null, msgs);
			if (newBezBedZentrale != null)
				msgs = ((InternalEObject)newBezBedZentrale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ZENTRALE, null, msgs);
			msgs = basicSetBezBedZentrale(newBezBedZentrale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ZENTRALE, newBezBedZentrale, newBezBedZentrale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ZENTRALE:
				return basicSetBezBedZentrale(null, msgs);
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
			case BedienungPackage.BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ZENTRALE:
				return getBezBedZentrale();
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
			case BedienungPackage.BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ZENTRALE:
				setBezBedZentrale((Bez_Bed_Zentrale_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ZENTRALE:
				setBezBedZentrale((Bez_Bed_Zentrale_TypeClass)null);
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
			case BedienungPackage.BEDIEN_ZENTRALE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ZENTRALE:
				return bezBedZentrale != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_Zentrale_Bezeichnung_AttributeGroupImpl
