/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Virtuell_AttributeGroup;

import org.eclipse.set.model.planpro.Verweise.ID_Quellelement_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EV Modul Virtuell Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.EV_Modul_Virtuell_AttributeGroupImpl#getIDQuellelement <em>ID Quellelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EV_Modul_Virtuell_AttributeGroupImpl extends EObjectImpl implements EV_Modul_Virtuell_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDQuellelement() <em>ID Quellelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDQuellelement()
	 * @generated
	 * @ordered
	 */
	protected ID_Quellelement_TypeClass iDQuellelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EV_Modul_Virtuell_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul_Virtuell_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Quellelement_TypeClass getIDQuellelement() {
		return iDQuellelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDQuellelement(ID_Quellelement_TypeClass newIDQuellelement, NotificationChain msgs) {
		ID_Quellelement_TypeClass oldIDQuellelement = iDQuellelement;
		iDQuellelement = newIDQuellelement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP__ID_QUELLELEMENT, oldIDQuellelement, newIDQuellelement);
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
	public void setIDQuellelement(ID_Quellelement_TypeClass newIDQuellelement) {
		if (newIDQuellelement != iDQuellelement) {
			NotificationChain msgs = null;
			if (iDQuellelement != null)
				msgs = ((InternalEObject)iDQuellelement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP__ID_QUELLELEMENT, null, msgs);
			if (newIDQuellelement != null)
				msgs = ((InternalEObject)newIDQuellelement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP__ID_QUELLELEMENT, null, msgs);
			msgs = basicSetIDQuellelement(newIDQuellelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP__ID_QUELLELEMENT, newIDQuellelement, newIDQuellelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP__ID_QUELLELEMENT:
				return basicSetIDQuellelement(null, msgs);
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
			case Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP__ID_QUELLELEMENT:
				return getIDQuellelement();
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
			case Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP__ID_QUELLELEMENT:
				setIDQuellelement((ID_Quellelement_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP__ID_QUELLELEMENT:
				setIDQuellelement((ID_Quellelement_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP__ID_QUELLELEMENT:
				return iDQuellelement != null;
		}
		return super.eIsSet(featureID);
	}

} //EV_Modul_Virtuell_AttributeGroupImpl
