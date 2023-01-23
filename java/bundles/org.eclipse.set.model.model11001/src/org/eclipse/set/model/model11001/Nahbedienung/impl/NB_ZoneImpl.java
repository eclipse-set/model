/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Nahbedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Nahbedienung.NB_Zone;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage;

import org.eclipse.set.model.model11001.Verweise.ID_NB_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_NB_Zone_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.impl.NB_ZoneImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.impl.NB_ZoneImpl#getIDNB <em>IDNB</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.impl.NB_ZoneImpl#getIDNBZone <em>IDNB Zone</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.impl.NB_ZoneImpl#getNBZoneAllg <em>NB Zone Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NB_ZoneImpl extends Basis_ObjektImpl implements NB_Zone {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected NB_Zone_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDNB() <em>IDNB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDNB()
	 * @generated
	 * @ordered
	 */
	protected ID_NB_TypeClass iDNB;

	/**
	 * The cached value of the '{@link #getIDNBZone() <em>IDNB Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDNBZone()
	 * @generated
	 * @ordered
	 */
	protected ID_NB_Zone_TypeClass iDNBZone;

	/**
	 * The cached value of the '{@link #getNBZoneAllg() <em>NB Zone Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBZoneAllg()
	 * @generated
	 * @ordered
	 */
	protected NB_Zone_Allg_AttributeGroup nBZoneAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_ZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NahbedienungPackage.Literals.NB_ZONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Zone_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(NB_Zone_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		NB_Zone_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(NB_Zone_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_NB_TypeClass getIDNB() {
		return iDNB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDNB(ID_NB_TypeClass newIDNB, NotificationChain msgs) {
		ID_NB_TypeClass oldIDNB = iDNB;
		iDNB = newIDNB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE__IDNB, oldIDNB, newIDNB);
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
	public void setIDNB(ID_NB_TypeClass newIDNB) {
		if (newIDNB != iDNB) {
			NotificationChain msgs = null;
			if (iDNB != null)
				msgs = ((InternalEObject)iDNB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE__IDNB, null, msgs);
			if (newIDNB != null)
				msgs = ((InternalEObject)newIDNB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE__IDNB, null, msgs);
			msgs = basicSetIDNB(newIDNB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE__IDNB, newIDNB, newIDNB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_NB_Zone_TypeClass getIDNBZone() {
		return iDNBZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDNBZone(ID_NB_Zone_TypeClass newIDNBZone, NotificationChain msgs) {
		ID_NB_Zone_TypeClass oldIDNBZone = iDNBZone;
		iDNBZone = newIDNBZone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE__IDNB_ZONE, oldIDNBZone, newIDNBZone);
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
	public void setIDNBZone(ID_NB_Zone_TypeClass newIDNBZone) {
		if (newIDNBZone != iDNBZone) {
			NotificationChain msgs = null;
			if (iDNBZone != null)
				msgs = ((InternalEObject)iDNBZone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE__IDNB_ZONE, null, msgs);
			if (newIDNBZone != null)
				msgs = ((InternalEObject)newIDNBZone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE__IDNB_ZONE, null, msgs);
			msgs = basicSetIDNBZone(newIDNBZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE__IDNB_ZONE, newIDNBZone, newIDNBZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Zone_Allg_AttributeGroup getNBZoneAllg() {
		return nBZoneAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNBZoneAllg(NB_Zone_Allg_AttributeGroup newNBZoneAllg, NotificationChain msgs) {
		NB_Zone_Allg_AttributeGroup oldNBZoneAllg = nBZoneAllg;
		nBZoneAllg = newNBZoneAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG, oldNBZoneAllg, newNBZoneAllg);
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
	public void setNBZoneAllg(NB_Zone_Allg_AttributeGroup newNBZoneAllg) {
		if (newNBZoneAllg != nBZoneAllg) {
			NotificationChain msgs = null;
			if (nBZoneAllg != null)
				msgs = ((InternalEObject)nBZoneAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG, null, msgs);
			if (newNBZoneAllg != null)
				msgs = ((InternalEObject)newNBZoneAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG, null, msgs);
			msgs = basicSetNBZoneAllg(newNBZoneAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG, newNBZoneAllg, newNBZoneAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienungPackage.NB_ZONE__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case NahbedienungPackage.NB_ZONE__IDNB:
				return basicSetIDNB(null, msgs);
			case NahbedienungPackage.NB_ZONE__IDNB_ZONE:
				return basicSetIDNBZone(null, msgs);
			case NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG:
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
			case NahbedienungPackage.NB_ZONE__BEZEICHNUNG:
				return getBezeichnung();
			case NahbedienungPackage.NB_ZONE__IDNB:
				return getIDNB();
			case NahbedienungPackage.NB_ZONE__IDNB_ZONE:
				return getIDNBZone();
			case NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG:
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
			case NahbedienungPackage.NB_ZONE__BEZEICHNUNG:
				setBezeichnung((NB_Zone_Bezeichnung_AttributeGroup)newValue);
				return;
			case NahbedienungPackage.NB_ZONE__IDNB:
				setIDNB((ID_NB_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_ZONE__IDNB_ZONE:
				setIDNBZone((ID_NB_Zone_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG:
				setNBZoneAllg((NB_Zone_Allg_AttributeGroup)newValue);
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
			case NahbedienungPackage.NB_ZONE__BEZEICHNUNG:
				setBezeichnung((NB_Zone_Bezeichnung_AttributeGroup)null);
				return;
			case NahbedienungPackage.NB_ZONE__IDNB:
				setIDNB((ID_NB_TypeClass)null);
				return;
			case NahbedienungPackage.NB_ZONE__IDNB_ZONE:
				setIDNBZone((ID_NB_Zone_TypeClass)null);
				return;
			case NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG:
				setNBZoneAllg((NB_Zone_Allg_AttributeGroup)null);
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
			case NahbedienungPackage.NB_ZONE__BEZEICHNUNG:
				return bezeichnung != null;
			case NahbedienungPackage.NB_ZONE__IDNB:
				return iDNB != null;
			case NahbedienungPackage.NB_ZONE__IDNB_ZONE:
				return iDNBZone != null;
			case NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG:
				return nBZoneAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //NB_ZoneImpl
