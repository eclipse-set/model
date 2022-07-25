/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.Unterstation_Max_TypeClass;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZLV_Bus_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZLV_Bus_Nr_TypeClass;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Modem_TypeClass;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZLV Bus Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZLV_Bus_Allg_AttributeGroupImpl#getUnterstationMax <em>Unterstation Max</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZLV_Bus_Allg_AttributeGroupImpl#getZLVBusNr <em>ZLV Bus Nr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZLV_Bus_Allg_AttributeGroupImpl#getZNModem <em>ZN Modem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZLV_Bus_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZLV_Bus_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getUnterstationMax() <em>Unterstation Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterstationMax()
	 * @generated
	 * @ordered
	 */
	protected Unterstation_Max_TypeClass unterstationMax;

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
	 * The cached value of the '{@link #getZNModem() <em>ZN Modem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNModem()
	 * @generated
	 * @ordered
	 */
	protected ZN_Modem_TypeClass zNModem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZLV_Bus_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unterstation_Max_TypeClass getUnterstationMax() {
		return unterstationMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnterstationMax(Unterstation_Max_TypeClass newUnterstationMax, NotificationChain msgs) {
		Unterstation_Max_TypeClass oldUnterstationMax = unterstationMax;
		unterstationMax = newUnterstationMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_MAX, oldUnterstationMax, newUnterstationMax);
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
	public void setUnterstationMax(Unterstation_Max_TypeClass newUnterstationMax) {
		if (newUnterstationMax != unterstationMax) {
			NotificationChain msgs = null;
			if (unterstationMax != null)
				msgs = ((InternalEObject)unterstationMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_MAX, null, msgs);
			if (newUnterstationMax != null)
				msgs = ((InternalEObject)newUnterstationMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_MAX, null, msgs);
			msgs = basicSetUnterstationMax(newUnterstationMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_MAX, newUnterstationMax, newUnterstationMax));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZLV_BUS_NR, oldZLVBusNr, newZLVBusNr);
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
				msgs = ((InternalEObject)zLVBusNr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZLV_BUS_NR, null, msgs);
			if (newZLVBusNr != null)
				msgs = ((InternalEObject)newZLVBusNr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZLV_BUS_NR, null, msgs);
			msgs = basicSetZLVBusNr(newZLVBusNr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZLV_BUS_NR, newZLVBusNr, newZLVBusNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Modem_TypeClass getZNModem() {
		return zNModem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNModem(ZN_Modem_TypeClass newZNModem, NotificationChain msgs) {
		ZN_Modem_TypeClass oldZNModem = zNModem;
		zNModem = newZNModem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZN_MODEM, oldZNModem, newZNModem);
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
	public void setZNModem(ZN_Modem_TypeClass newZNModem) {
		if (newZNModem != zNModem) {
			NotificationChain msgs = null;
			if (zNModem != null)
				msgs = ((InternalEObject)zNModem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZN_MODEM, null, msgs);
			if (newZNModem != null)
				msgs = ((InternalEObject)newZNModem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZN_MODEM, null, msgs);
			msgs = basicSetZNModem(newZNModem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZN_MODEM, newZNModem, newZNModem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_MAX:
				return basicSetUnterstationMax(null, msgs);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZLV_BUS_NR:
				return basicSetZLVBusNr(null, msgs);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZN_MODEM:
				return basicSetZNModem(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_MAX:
				return getUnterstationMax();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZLV_BUS_NR:
				return getZLVBusNr();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZN_MODEM:
				return getZNModem();
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_MAX:
				setUnterstationMax((Unterstation_Max_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZLV_BUS_NR:
				setZLVBusNr((ZLV_Bus_Nr_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZN_MODEM:
				setZNModem((ZN_Modem_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_MAX:
				setUnterstationMax((Unterstation_Max_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZLV_BUS_NR:
				setZLVBusNr((ZLV_Bus_Nr_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZN_MODEM:
				setZNModem((ZN_Modem_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_MAX:
				return unterstationMax != null;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZLV_BUS_NR:
				return zLVBusNr != null;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ALLG_ATTRIBUTE_GROUP__ZN_MODEM:
				return zNModem != null;
		}
		return super.eIsSet(featureID);
	}

} //ZLV_Bus_Allg_AttributeGroupImpl
