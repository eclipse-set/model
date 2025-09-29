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

import org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Allg_TypeClass;
import org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Reihenfolgezwang_AttributeGroup;
import org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB Zone Reihenfolgezwang Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Reihenfolgezwang_AttributeGroupImpl#getNBZoneAllg <em>NB Zone Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NB_Zone_Reihenfolgezwang_AttributeGroupImpl extends EObjectImpl implements NB_Zone_Reihenfolgezwang_AttributeGroup {
	/**
	 * The cached value of the '{@link #getNBZoneAllg() <em>NB Zone Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBZoneAllg()
	 * @generated
	 * @ordered
	 */
	protected NB_Zone_Allg_TypeClass nBZoneAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Zone_Reihenfolgezwang_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NahbedienungPackage.Literals.NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Zone_Allg_TypeClass getNBZoneAllg() {
		return nBZoneAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNBZoneAllg(NB_Zone_Allg_TypeClass newNBZoneAllg, NotificationChain msgs) {
		NB_Zone_Allg_TypeClass oldNBZoneAllg = nBZoneAllg;
		nBZoneAllg = newNBZoneAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP__NB_ZONE_ALLG, oldNBZoneAllg, newNBZoneAllg);
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
	public void setNBZoneAllg(NB_Zone_Allg_TypeClass newNBZoneAllg) {
		if (newNBZoneAllg != nBZoneAllg) {
			NotificationChain msgs = null;
			if (nBZoneAllg != null)
				msgs = ((InternalEObject)nBZoneAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP__NB_ZONE_ALLG, null, msgs);
			if (newNBZoneAllg != null)
				msgs = ((InternalEObject)newNBZoneAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP__NB_ZONE_ALLG, null, msgs);
			msgs = basicSetNBZoneAllg(newNBZoneAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP__NB_ZONE_ALLG, newNBZoneAllg, newNBZoneAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienungPackage.NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP__NB_ZONE_ALLG:
				return basicSetNBZoneAllg(null, msgs);
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
			case NahbedienungPackage.NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP__NB_ZONE_ALLG:
				return getNBZoneAllg();
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
			case NahbedienungPackage.NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP__NB_ZONE_ALLG:
				setNBZoneAllg((NB_Zone_Allg_TypeClass)newValue);
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
			case NahbedienungPackage.NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP__NB_ZONE_ALLG:
				setNBZoneAllg((NB_Zone_Allg_TypeClass)null);
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
			case NahbedienungPackage.NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP__NB_ZONE_ALLG:
				return nBZoneAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //NB_Zone_Reihenfolgezwang_AttributeGroupImpl
