/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Nahbedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Nahbedienung.Bezeichnung_NB_Zone_TypeClass;
import org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB Zone Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Bezeichnung_AttributeGroupImpl#getBezeichnungNBZone <em>Bezeichnung NB Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NB_Zone_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements NB_Zone_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungNBZone() <em>Bezeichnung NB Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungNBZone()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_NB_Zone_TypeClass bezeichnungNBZone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Zone_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NahbedienungPackage.Literals.NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_NB_Zone_TypeClass getBezeichnungNBZone() {
		return bezeichnungNBZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungNBZone(Bezeichnung_NB_Zone_TypeClass newBezeichnungNBZone, NotificationChain msgs) {
		Bezeichnung_NB_Zone_TypeClass oldBezeichnungNBZone = bezeichnungNBZone;
		bezeichnungNBZone = newBezeichnungNBZone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB_ZONE, oldBezeichnungNBZone, newBezeichnungNBZone);
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
	public void setBezeichnungNBZone(Bezeichnung_NB_Zone_TypeClass newBezeichnungNBZone) {
		if (newBezeichnungNBZone != bezeichnungNBZone) {
			NotificationChain msgs = null;
			if (bezeichnungNBZone != null)
				msgs = ((InternalEObject)bezeichnungNBZone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB_ZONE, null, msgs);
			if (newBezeichnungNBZone != null)
				msgs = ((InternalEObject)newBezeichnungNBZone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB_ZONE, null, msgs);
			msgs = basicSetBezeichnungNBZone(newBezeichnungNBZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB_ZONE, newBezeichnungNBZone, newBezeichnungNBZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienungPackage.NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB_ZONE:
				return basicSetBezeichnungNBZone(null, msgs);
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
			case NahbedienungPackage.NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB_ZONE:
				return getBezeichnungNBZone();
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
			case NahbedienungPackage.NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB_ZONE:
				setBezeichnungNBZone((Bezeichnung_NB_Zone_TypeClass)newValue);
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
			case NahbedienungPackage.NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB_ZONE:
				setBezeichnungNBZone((Bezeichnung_NB_Zone_TypeClass)null);
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
			case NahbedienungPackage.NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB_ZONE:
				return bezeichnungNBZone != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //NB_Zone_Bezeichnung_AttributeGroupImpl
