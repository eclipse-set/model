/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_Nr_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZLV Bus Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZLV_Bus_Bezeichnung_AttributeGroupImpl#getZLVBusNr <em>ZLV Bus Nr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZLV_Bus_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements ZLV_Bus_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getZLVBusNr() <em>ZLV Bus Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLVBusNr()
	 * @generated
	 * @ordered
	 */
	protected ZLV_Bus_Nr_TypeClass zLVBusNr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZLV_Bus_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus_Nr_TypeClass getZLVBusNr() {
		return zLVBusNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLVBusNr(ZLV_Bus_Nr_TypeClass newZLVBusNr, NotificationChain msgs) {
		ZLV_Bus_Nr_TypeClass oldZLVBusNr = zLVBusNr;
		zLVBusNr = newZLVBusNr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_BEZEICHNUNG_ATTRIBUTE_GROUP__ZLV_BUS_NR, oldZLVBusNr, newZLVBusNr);
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
	public void setZLVBusNr(ZLV_Bus_Nr_TypeClass newZLVBusNr) {
		if (newZLVBusNr != zLVBusNr) {
			NotificationChain msgs = null;
			if (zLVBusNr != null)
				msgs = ((InternalEObject)zLVBusNr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_BEZEICHNUNG_ATTRIBUTE_GROUP__ZLV_BUS_NR, null, msgs);
			if (newZLVBusNr != null)
				msgs = ((InternalEObject)newZLVBusNr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_BEZEICHNUNG_ATTRIBUTE_GROUP__ZLV_BUS_NR, null, msgs);
			msgs = basicSetZLVBusNr(newZLVBusNr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_BEZEICHNUNG_ATTRIBUTE_GROUP__ZLV_BUS_NR, newZLVBusNr, newZLVBusNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BEZEICHNUNG_ATTRIBUTE_GROUP__ZLV_BUS_NR:
				return basicSetZLVBusNr(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BEZEICHNUNG_ATTRIBUTE_GROUP__ZLV_BUS_NR:
				return getZLVBusNr();
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BEZEICHNUNG_ATTRIBUTE_GROUP__ZLV_BUS_NR:
				setZLVBusNr((ZLV_Bus_Nr_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BEZEICHNUNG_ATTRIBUTE_GROUP__ZLV_BUS_NR:
				setZLVBusNr((ZLV_Bus_Nr_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BEZEICHNUNG_ATTRIBUTE_GROUP__ZLV_BUS_NR:
				return zLVBusNr != null;
		}
		return super.eIsSet(featureID);
	}

} //ZLV_Bus_Bezeichnung_AttributeGroupImpl
