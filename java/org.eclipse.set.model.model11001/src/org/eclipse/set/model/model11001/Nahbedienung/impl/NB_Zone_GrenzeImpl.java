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

import org.eclipse.set.model.model11001.Nahbedienung.NB_Grenze_Art_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Grenze;
import org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage;

import org.eclipse.set.model.model11001.Verweise.ID_Markanter_Punkt_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_NB_Zone_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB Zone Grenze</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.impl.NB_Zone_GrenzeImpl#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.impl.NB_Zone_GrenzeImpl#getIDNBZone <em>IDNB Zone</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.impl.NB_Zone_GrenzeImpl#getNBGrenzeArt <em>NB Grenze Art</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NB_Zone_GrenzeImpl extends Basis_ObjektImpl implements NB_Zone_Grenze {
	/**
	 * The cached value of the '{@link #getIDMarkanterPunkt() <em>ID Markanter Punkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDMarkanterPunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_Markanter_Punkt_TypeClass iDMarkanterPunkt;

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
	 * The cached value of the '{@link #getNBGrenzeArt() <em>NB Grenze Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBGrenzeArt()
	 * @generated
	 * @ordered
	 */
	protected NB_Grenze_Art_TypeClass nBGrenzeArt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Zone_GrenzeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NahbedienungPackage.Literals.NB_ZONE_GRENZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Markanter_Punkt_TypeClass getIDMarkanterPunkt() {
		return iDMarkanterPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDMarkanterPunkt(ID_Markanter_Punkt_TypeClass newIDMarkanterPunkt, NotificationChain msgs) {
		ID_Markanter_Punkt_TypeClass oldIDMarkanterPunkt = iDMarkanterPunkt;
		iDMarkanterPunkt = newIDMarkanterPunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_GRENZE__ID_MARKANTER_PUNKT, oldIDMarkanterPunkt, newIDMarkanterPunkt);
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
	public void setIDMarkanterPunkt(ID_Markanter_Punkt_TypeClass newIDMarkanterPunkt) {
		if (newIDMarkanterPunkt != iDMarkanterPunkt) {
			NotificationChain msgs = null;
			if (iDMarkanterPunkt != null)
				msgs = ((InternalEObject)iDMarkanterPunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_GRENZE__ID_MARKANTER_PUNKT, null, msgs);
			if (newIDMarkanterPunkt != null)
				msgs = ((InternalEObject)newIDMarkanterPunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_GRENZE__ID_MARKANTER_PUNKT, null, msgs);
			msgs = basicSetIDMarkanterPunkt(newIDMarkanterPunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_GRENZE__ID_MARKANTER_PUNKT, newIDMarkanterPunkt, newIDMarkanterPunkt));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_GRENZE__IDNB_ZONE, oldIDNBZone, newIDNBZone);
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
				msgs = ((InternalEObject)iDNBZone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_GRENZE__IDNB_ZONE, null, msgs);
			if (newIDNBZone != null)
				msgs = ((InternalEObject)newIDNBZone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_GRENZE__IDNB_ZONE, null, msgs);
			msgs = basicSetIDNBZone(newIDNBZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_GRENZE__IDNB_ZONE, newIDNBZone, newIDNBZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Grenze_Art_TypeClass getNBGrenzeArt() {
		return nBGrenzeArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNBGrenzeArt(NB_Grenze_Art_TypeClass newNBGrenzeArt, NotificationChain msgs) {
		NB_Grenze_Art_TypeClass oldNBGrenzeArt = nBGrenzeArt;
		nBGrenzeArt = newNBGrenzeArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART, oldNBGrenzeArt, newNBGrenzeArt);
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
	public void setNBGrenzeArt(NB_Grenze_Art_TypeClass newNBGrenzeArt) {
		if (newNBGrenzeArt != nBGrenzeArt) {
			NotificationChain msgs = null;
			if (nBGrenzeArt != null)
				msgs = ((InternalEObject)nBGrenzeArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART, null, msgs);
			if (newNBGrenzeArt != null)
				msgs = ((InternalEObject)newNBGrenzeArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART, null, msgs);
			msgs = basicSetNBGrenzeArt(newNBGrenzeArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART, newNBGrenzeArt, newNBGrenzeArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienungPackage.NB_ZONE_GRENZE__ID_MARKANTER_PUNKT:
				return basicSetIDMarkanterPunkt(null, msgs);
			case NahbedienungPackage.NB_ZONE_GRENZE__IDNB_ZONE:
				return basicSetIDNBZone(null, msgs);
			case NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART:
				return basicSetNBGrenzeArt(null, msgs);
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
			case NahbedienungPackage.NB_ZONE_GRENZE__ID_MARKANTER_PUNKT:
				return getIDMarkanterPunkt();
			case NahbedienungPackage.NB_ZONE_GRENZE__IDNB_ZONE:
				return getIDNBZone();
			case NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART:
				return getNBGrenzeArt();
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
			case NahbedienungPackage.NB_ZONE_GRENZE__ID_MARKANTER_PUNKT:
				setIDMarkanterPunkt((ID_Markanter_Punkt_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_ZONE_GRENZE__IDNB_ZONE:
				setIDNBZone((ID_NB_Zone_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART:
				setNBGrenzeArt((NB_Grenze_Art_TypeClass)newValue);
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
			case NahbedienungPackage.NB_ZONE_GRENZE__ID_MARKANTER_PUNKT:
				setIDMarkanterPunkt((ID_Markanter_Punkt_TypeClass)null);
				return;
			case NahbedienungPackage.NB_ZONE_GRENZE__IDNB_ZONE:
				setIDNBZone((ID_NB_Zone_TypeClass)null);
				return;
			case NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART:
				setNBGrenzeArt((NB_Grenze_Art_TypeClass)null);
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
			case NahbedienungPackage.NB_ZONE_GRENZE__ID_MARKANTER_PUNKT:
				return iDMarkanterPunkt != null;
			case NahbedienungPackage.NB_ZONE_GRENZE__IDNB_ZONE:
				return iDNBZone != null;
			case NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART:
				return nBGrenzeArt != null;
		}
		return super.eIsSet(featureID);
	}

} //NB_Zone_GrenzeImpl
