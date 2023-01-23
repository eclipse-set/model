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

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZLV Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZLV_BusImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZLV_BusImpl#getZLVBusAllg <em>ZLV Bus Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZLV_BusImpl extends Basis_ObjektImpl implements ZLV_Bus {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected ZLV_Bus_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getZLVBusAllg() <em>ZLV Bus Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLVBusAllg()
	 * @generated
	 * @ordered
	 */
	protected ZLV_Bus_Allg_AttributeGroup zLVBusAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZLV_BusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZLV_BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(ZLV_Bus_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		ZLV_Bus_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(ZLV_Bus_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus_Allg_AttributeGroup getZLVBusAllg() {
		return zLVBusAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLVBusAllg(ZLV_Bus_Allg_AttributeGroup newZLVBusAllg, NotificationChain msgs) {
		ZLV_Bus_Allg_AttributeGroup oldZLVBusAllg = zLVBusAllg;
		zLVBusAllg = newZLVBusAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG, oldZLVBusAllg, newZLVBusAllg);
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
	public void setZLVBusAllg(ZLV_Bus_Allg_AttributeGroup newZLVBusAllg) {
		if (newZLVBusAllg != zLVBusAllg) {
			NotificationChain msgs = null;
			if (zLVBusAllg != null)
				msgs = ((InternalEObject)zLVBusAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG, null, msgs);
			if (newZLVBusAllg != null)
				msgs = ((InternalEObject)newZLVBusAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG, null, msgs);
			msgs = basicSetZLVBusAllg(newZLVBusAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG, newZLVBusAllg, newZLVBusAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZLV_BUS__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG:
				return basicSetZLVBusAllg(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS__BEZEICHNUNG:
				return getBezeichnung();
			case ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG:
				return getZLVBusAllg();
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS__BEZEICHNUNG:
				setBezeichnung((ZLV_Bus_Bezeichnung_AttributeGroup)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG:
				setZLVBusAllg((ZLV_Bus_Allg_AttributeGroup)newValue);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS__BEZEICHNUNG:
				setBezeichnung((ZLV_Bus_Bezeichnung_AttributeGroup)null);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG:
				setZLVBusAllg((ZLV_Bus_Allg_AttributeGroup)null);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS__BEZEICHNUNG:
				return bezeichnung != null;
			case ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG:
				return zLVBusAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //ZLV_BusImpl
