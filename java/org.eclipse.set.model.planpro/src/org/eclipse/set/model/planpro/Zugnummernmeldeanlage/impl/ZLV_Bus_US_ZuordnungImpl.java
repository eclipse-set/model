/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZN_Unterstation_TypeClass;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Zuordnung_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZLV Bus US Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZLV_Bus_US_ZuordnungImpl#getIDZLVBus <em>IDZLV Bus</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZLV_Bus_US_ZuordnungImpl#getIDZNUnterstation <em>IDZN Unterstation</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZLV_Bus_US_ZuordnungImpl#getZLVBusUSZuordnungTelegramm <em>ZLV Bus US Zuordnung Telegramm</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZLV_Bus_US_ZuordnungImpl#getZLVBusZuordnungAllg <em>ZLV Bus Zuordnung Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZLV_Bus_US_ZuordnungImpl extends Basis_ObjektImpl implements ZLV_Bus_US_Zuordnung {
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
	 * The cached value of the '{@link #getIDZNUnterstation() <em>IDZN Unterstation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZNUnterstation()
	 * @generated
	 * @ordered
	 */
	protected ID_ZN_Unterstation_TypeClass iDZNUnterstation;

	/**
	 * The cached value of the '{@link #getZLVBusUSZuordnungTelegramm() <em>ZLV Bus US Zuordnung Telegramm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLVBusUSZuordnungTelegramm()
	 * @generated
	 * @ordered
	 */
	protected ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup zLVBusUSZuordnungTelegramm;

	/**
	 * The cached value of the '{@link #getZLVBusZuordnungAllg() <em>ZLV Bus Zuordnung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLVBusZuordnungAllg()
	 * @generated
	 * @ordered
	 */
	protected ZLV_Bus_Zuordnung_Allg_AttributeGroup zLVBusZuordnungAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZLV_Bus_US_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_US_ZUORDNUNG;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZLV_BUS, oldIDZLVBus, newIDZLVBus);
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
				msgs = ((InternalEObject)iDZLVBus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZLV_BUS, null, msgs);
			if (newIDZLVBus != null)
				msgs = ((InternalEObject)newIDZLVBus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZLV_BUS, null, msgs);
			msgs = basicSetIDZLVBus(newIDZLVBus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZLV_BUS, newIDZLVBus, newIDZLVBus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZN_Unterstation_TypeClass getIDZNUnterstation() {
		return iDZNUnterstation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZNUnterstation(ID_ZN_Unterstation_TypeClass newIDZNUnterstation, NotificationChain msgs) {
		ID_ZN_Unterstation_TypeClass oldIDZNUnterstation = iDZNUnterstation;
		iDZNUnterstation = newIDZNUnterstation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZN_UNTERSTATION, oldIDZNUnterstation, newIDZNUnterstation);
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
	public void setIDZNUnterstation(ID_ZN_Unterstation_TypeClass newIDZNUnterstation) {
		if (newIDZNUnterstation != iDZNUnterstation) {
			NotificationChain msgs = null;
			if (iDZNUnterstation != null)
				msgs = ((InternalEObject)iDZNUnterstation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZN_UNTERSTATION, null, msgs);
			if (newIDZNUnterstation != null)
				msgs = ((InternalEObject)newIDZNUnterstation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZN_UNTERSTATION, null, msgs);
			msgs = basicSetIDZNUnterstation(newIDZNUnterstation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZN_UNTERSTATION, newIDZNUnterstation, newIDZNUnterstation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup getZLVBusUSZuordnungTelegramm() {
		return zLVBusUSZuordnungTelegramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLVBusUSZuordnungTelegramm(ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup newZLVBusUSZuordnungTelegramm, NotificationChain msgs) {
		ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup oldZLVBusUSZuordnungTelegramm = zLVBusUSZuordnungTelegramm;
		zLVBusUSZuordnungTelegramm = newZLVBusUSZuordnungTelegramm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM, oldZLVBusUSZuordnungTelegramm, newZLVBusUSZuordnungTelegramm);
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
	public void setZLVBusUSZuordnungTelegramm(ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup newZLVBusUSZuordnungTelegramm) {
		if (newZLVBusUSZuordnungTelegramm != zLVBusUSZuordnungTelegramm) {
			NotificationChain msgs = null;
			if (zLVBusUSZuordnungTelegramm != null)
				msgs = ((InternalEObject)zLVBusUSZuordnungTelegramm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM, null, msgs);
			if (newZLVBusUSZuordnungTelegramm != null)
				msgs = ((InternalEObject)newZLVBusUSZuordnungTelegramm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM, null, msgs);
			msgs = basicSetZLVBusUSZuordnungTelegramm(newZLVBusUSZuordnungTelegramm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM, newZLVBusUSZuordnungTelegramm, newZLVBusUSZuordnungTelegramm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus_Zuordnung_Allg_AttributeGroup getZLVBusZuordnungAllg() {
		return zLVBusZuordnungAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLVBusZuordnungAllg(ZLV_Bus_Zuordnung_Allg_AttributeGroup newZLVBusZuordnungAllg, NotificationChain msgs) {
		ZLV_Bus_Zuordnung_Allg_AttributeGroup oldZLVBusZuordnungAllg = zLVBusZuordnungAllg;
		zLVBusZuordnungAllg = newZLVBusZuordnungAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG, oldZLVBusZuordnungAllg, newZLVBusZuordnungAllg);
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
	public void setZLVBusZuordnungAllg(ZLV_Bus_Zuordnung_Allg_AttributeGroup newZLVBusZuordnungAllg) {
		if (newZLVBusZuordnungAllg != zLVBusZuordnungAllg) {
			NotificationChain msgs = null;
			if (zLVBusZuordnungAllg != null)
				msgs = ((InternalEObject)zLVBusZuordnungAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG, null, msgs);
			if (newZLVBusZuordnungAllg != null)
				msgs = ((InternalEObject)newZLVBusZuordnungAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG, null, msgs);
			msgs = basicSetZLVBusZuordnungAllg(newZLVBusZuordnungAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG, newZLVBusZuordnungAllg, newZLVBusZuordnungAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZLV_BUS:
				return basicSetIDZLVBus(null, msgs);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZN_UNTERSTATION:
				return basicSetIDZNUnterstation(null, msgs);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM:
				return basicSetZLVBusUSZuordnungTelegramm(null, msgs);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG:
				return basicSetZLVBusZuordnungAllg(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZLV_BUS:
				return getIDZLVBus();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZN_UNTERSTATION:
				return getIDZNUnterstation();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM:
				return getZLVBusUSZuordnungTelegramm();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG:
				return getZLVBusZuordnungAllg();
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZLV_BUS:
				setIDZLVBus((ID_ZLV_Bus_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZN_UNTERSTATION:
				setIDZNUnterstation((ID_ZN_Unterstation_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM:
				setZLVBusUSZuordnungTelegramm((ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG:
				setZLVBusZuordnungAllg((ZLV_Bus_Zuordnung_Allg_AttributeGroup)newValue);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZLV_BUS:
				setIDZLVBus((ID_ZLV_Bus_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZN_UNTERSTATION:
				setIDZNUnterstation((ID_ZN_Unterstation_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM:
				setZLVBusUSZuordnungTelegramm((ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup)null);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG:
				setZLVBusZuordnungAllg((ZLV_Bus_Zuordnung_Allg_AttributeGroup)null);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZLV_BUS:
				return iDZLVBus != null;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZN_UNTERSTATION:
				return iDZNUnterstation != null;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM:
				return zLVBusUSZuordnungTelegramm != null;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG:
				return zLVBusZuordnungAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZLV_Bus_US_ZuordnungImpl
