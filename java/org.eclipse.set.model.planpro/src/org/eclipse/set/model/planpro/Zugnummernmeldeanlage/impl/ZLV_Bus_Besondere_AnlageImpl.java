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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_ohne_Proxy_TypeClass;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Unterstation_Nr_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZLV Bus Besondere Anlage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZLV_Bus_Besondere_AnlageImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZLV_Bus_Besondere_AnlageImpl#getIDZLVBus <em>IDZLV Bus</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZLV_Bus_Besondere_AnlageImpl#getUnterstationNr <em>Unterstation Nr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZLV_Bus_Besondere_AnlageImpl extends Basis_ObjektImpl implements ZLV_Bus_Besondere_Anlage {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDZLVBus() <em>IDZLV Bus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLVBus()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_ZLV_Bus_ohne_Proxy_TypeClass> iDZLVBus;

	/**
	 * The cached value of the '{@link #getUnterstationNr() <em>Unterstation Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterstationNr()
	 * @generated
	 * @ordered
	 */
	protected Unterstation_Nr_TypeClass unterstationNr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZLV_Bus_Besondere_AnlageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_BESONDERE_ANLAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_ZLV_Bus_ohne_Proxy_TypeClass> getIDZLVBus() {
		if (iDZLVBus == null) {
			iDZLVBus = new EObjectContainmentEList<ID_ZLV_Bus_ohne_Proxy_TypeClass>(ID_ZLV_Bus_ohne_Proxy_TypeClass.class, this, ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__IDZLV_BUS);
		}
		return iDZLVBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unterstation_Nr_TypeClass getUnterstationNr() {
		return unterstationNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnterstationNr(Unterstation_Nr_TypeClass newUnterstationNr, NotificationChain msgs) {
		Unterstation_Nr_TypeClass oldUnterstationNr = unterstationNr;
		unterstationNr = newUnterstationNr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__UNTERSTATION_NR, oldUnterstationNr, newUnterstationNr);
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
	public void setUnterstationNr(Unterstation_Nr_TypeClass newUnterstationNr) {
		if (newUnterstationNr != unterstationNr) {
			NotificationChain msgs = null;
			if (unterstationNr != null)
				msgs = ((InternalEObject)unterstationNr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__UNTERSTATION_NR, null, msgs);
			if (newUnterstationNr != null)
				msgs = ((InternalEObject)newUnterstationNr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__UNTERSTATION_NR, null, msgs);
			msgs = basicSetUnterstationNr(newUnterstationNr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__UNTERSTATION_NR, newUnterstationNr, newUnterstationNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__IDZLV_BUS:
				return ((InternalEList<?>)getIDZLVBus()).basicRemove(otherEnd, msgs);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__UNTERSTATION_NR:
				return basicSetUnterstationNr(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__BEZEICHNUNG:
				return getBezeichnung();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__IDZLV_BUS:
				return getIDZLVBus();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__UNTERSTATION_NR:
				return getUnterstationNr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__BEZEICHNUNG:
				setBezeichnung((ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__IDZLV_BUS:
				getIDZLVBus().clear();
				getIDZLVBus().addAll((Collection<? extends ID_ZLV_Bus_ohne_Proxy_TypeClass>)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__UNTERSTATION_NR:
				setUnterstationNr((Unterstation_Nr_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__BEZEICHNUNG:
				setBezeichnung((ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup)null);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__IDZLV_BUS:
				getIDZLVBus().clear();
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__UNTERSTATION_NR:
				setUnterstationNr((Unterstation_Nr_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__BEZEICHNUNG:
				return bezeichnung != null;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__IDZLV_BUS:
				return iDZLVBus != null && !iDZLVBus.isEmpty();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_BESONDERE_ANLAGE__UNTERSTATION_NR:
				return unterstationNr != null;
		}
		return super.eIsSet(featureID);
	}

} //ZLV_Bus_Besondere_AnlageImpl
