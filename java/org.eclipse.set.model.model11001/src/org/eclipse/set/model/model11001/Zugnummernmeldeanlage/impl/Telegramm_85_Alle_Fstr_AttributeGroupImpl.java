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

import org.eclipse.set.model.model11001.Verweise.ID_ZLV_Bus_TypeClass;

import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Telegramm_85_Alle_Fstr_AttributeGroup;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Telegramm_85_Fuer_Alle_Fstr_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telegramm 85 Alle Fstr Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.Telegramm_85_Alle_Fstr_AttributeGroupImpl#getIDZLVBus <em>IDZLV Bus</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.Telegramm_85_Alle_Fstr_AttributeGroupImpl#getTelegramm85FuerAlleFstr <em>Telegramm85 Fuer Alle Fstr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Telegramm_85_Alle_Fstr_AttributeGroupImpl extends EObjectImpl implements Telegramm_85_Alle_Fstr_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDZLVBus() <em>IDZLV Bus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLVBus()
	 * @generated
	 * @ordered
	 */
	protected ID_ZLV_Bus_TypeClass iDZLVBus;

	/**
	 * The cached value of the '{@link #getTelegramm85FuerAlleFstr() <em>Telegramm85 Fuer Alle Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegramm85FuerAlleFstr()
	 * @generated
	 * @ordered
	 */
	protected Telegramm_85_Fuer_Alle_Fstr_TypeClass telegramm85FuerAlleFstr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Telegramm_85_Alle_Fstr_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZLV_Bus_TypeClass getIDZLVBus() {
		return iDZLVBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZLVBus(ID_ZLV_Bus_TypeClass newIDZLVBus, NotificationChain msgs) {
		ID_ZLV_Bus_TypeClass oldIDZLVBus = iDZLVBus;
		iDZLVBus = newIDZLVBus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS, oldIDZLVBus, newIDZLVBus);
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
	public void setIDZLVBus(ID_ZLV_Bus_TypeClass newIDZLVBus) {
		if (newIDZLVBus != iDZLVBus) {
			NotificationChain msgs = null;
			if (iDZLVBus != null)
				msgs = ((InternalEObject)iDZLVBus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS, null, msgs);
			if (newIDZLVBus != null)
				msgs = ((InternalEObject)newIDZLVBus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS, null, msgs);
			msgs = basicSetIDZLVBus(newIDZLVBus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS, newIDZLVBus, newIDZLVBus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_85_Fuer_Alle_Fstr_TypeClass getTelegramm85FuerAlleFstr() {
		return telegramm85FuerAlleFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegramm85FuerAlleFstr(Telegramm_85_Fuer_Alle_Fstr_TypeClass newTelegramm85FuerAlleFstr, NotificationChain msgs) {
		Telegramm_85_Fuer_Alle_Fstr_TypeClass oldTelegramm85FuerAlleFstr = telegramm85FuerAlleFstr;
		telegramm85FuerAlleFstr = newTelegramm85FuerAlleFstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR, oldTelegramm85FuerAlleFstr, newTelegramm85FuerAlleFstr);
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
	public void setTelegramm85FuerAlleFstr(Telegramm_85_Fuer_Alle_Fstr_TypeClass newTelegramm85FuerAlleFstr) {
		if (newTelegramm85FuerAlleFstr != telegramm85FuerAlleFstr) {
			NotificationChain msgs = null;
			if (telegramm85FuerAlleFstr != null)
				msgs = ((InternalEObject)telegramm85FuerAlleFstr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR, null, msgs);
			if (newTelegramm85FuerAlleFstr != null)
				msgs = ((InternalEObject)newTelegramm85FuerAlleFstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR, null, msgs);
			msgs = basicSetTelegramm85FuerAlleFstr(newTelegramm85FuerAlleFstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR, newTelegramm85FuerAlleFstr, newTelegramm85FuerAlleFstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				return basicSetIDZLVBus(null, msgs);
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR:
				return basicSetTelegramm85FuerAlleFstr(null, msgs);
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				return getIDZLVBus();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR:
				return getTelegramm85FuerAlleFstr();
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				setIDZLVBus((ID_ZLV_Bus_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR:
				setTelegramm85FuerAlleFstr((Telegramm_85_Fuer_Alle_Fstr_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				setIDZLVBus((ID_ZLV_Bus_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR:
				setTelegramm85FuerAlleFstr((Telegramm_85_Fuer_Alle_Fstr_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				return iDZLVBus != null;
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR:
				return telegramm85FuerAlleFstr != null;
		}
		return super.eIsSet(featureID);
	}

} //Telegramm_85_Alle_Fstr_AttributeGroupImpl
