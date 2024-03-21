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

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element;
import org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage;

import org.eclipse.set.model.planpro.Verweise.ID_NB_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_NB_Zone_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB Zone Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_ElementImpl#getIDNBElement <em>IDNB Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_ElementImpl#getIDNBZone <em>IDNB Zone</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_ElementImpl#getNBZoneElementAllg <em>NB Zone Element Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NB_Zone_ElementImpl extends Basis_ObjektImpl implements NB_Zone_Element {
	/**
	 * The cached value of the '{@link #getIDNBElement() <em>IDNB Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDNBElement()
	 * @generated
	 * @ordered
	 */
	protected ID_NB_Element_TypeClass iDNBElement;

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
	 * The cached value of the '{@link #getNBZoneElementAllg() <em>NB Zone Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBZoneElementAllg()
	 * @generated
	 * @ordered
	 */
	protected NB_Zone_Element_Allg_AttributeGroup nBZoneElementAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Zone_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NahbedienungPackage.Literals.NB_ZONE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_NB_Element_TypeClass getIDNBElement() {
		return iDNBElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDNBElement(ID_NB_Element_TypeClass newIDNBElement, NotificationChain msgs) {
		ID_NB_Element_TypeClass oldIDNBElement = iDNBElement;
		iDNBElement = newIDNBElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ELEMENT, oldIDNBElement, newIDNBElement);
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
	public void setIDNBElement(ID_NB_Element_TypeClass newIDNBElement) {
		if (newIDNBElement != iDNBElement) {
			NotificationChain msgs = null;
			if (iDNBElement != null)
				msgs = ((InternalEObject)iDNBElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ELEMENT, null, msgs);
			if (newIDNBElement != null)
				msgs = ((InternalEObject)newIDNBElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ELEMENT, null, msgs);
			msgs = basicSetIDNBElement(newIDNBElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ELEMENT, newIDNBElement, newIDNBElement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ZONE, oldIDNBZone, newIDNBZone);
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
				msgs = ((InternalEObject)iDNBZone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ZONE, null, msgs);
			if (newIDNBZone != null)
				msgs = ((InternalEObject)newIDNBZone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ZONE, null, msgs);
			msgs = basicSetIDNBZone(newIDNBZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ZONE, newIDNBZone, newIDNBZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Zone_Element_Allg_AttributeGroup getNBZoneElementAllg() {
		return nBZoneElementAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNBZoneElementAllg(NB_Zone_Element_Allg_AttributeGroup newNBZoneElementAllg, NotificationChain msgs) {
		NB_Zone_Element_Allg_AttributeGroup oldNBZoneElementAllg = nBZoneElementAllg;
		nBZoneElementAllg = newNBZoneElementAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG, oldNBZoneElementAllg, newNBZoneElementAllg);
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
	public void setNBZoneElementAllg(NB_Zone_Element_Allg_AttributeGroup newNBZoneElementAllg) {
		if (newNBZoneElementAllg != nBZoneElementAllg) {
			NotificationChain msgs = null;
			if (nBZoneElementAllg != null)
				msgs = ((InternalEObject)nBZoneElementAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG, null, msgs);
			if (newNBZoneElementAllg != null)
				msgs = ((InternalEObject)newNBZoneElementAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG, null, msgs);
			msgs = basicSetNBZoneElementAllg(newNBZoneElementAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG, newNBZoneElementAllg, newNBZoneElementAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ELEMENT:
				return basicSetIDNBElement(null, msgs);
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ZONE:
				return basicSetIDNBZone(null, msgs);
			case NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG:
				return basicSetNBZoneElementAllg(null, msgs);
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
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ELEMENT:
				return getIDNBElement();
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ZONE:
				return getIDNBZone();
			case NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG:
				return getNBZoneElementAllg();
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
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ELEMENT:
				setIDNBElement((ID_NB_Element_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ZONE:
				setIDNBZone((ID_NB_Zone_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG:
				setNBZoneElementAllg((NB_Zone_Element_Allg_AttributeGroup)newValue);
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
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ELEMENT:
				setIDNBElement((ID_NB_Element_TypeClass)null);
				return;
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ZONE:
				setIDNBZone((ID_NB_Zone_TypeClass)null);
				return;
			case NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG:
				setNBZoneElementAllg((NB_Zone_Element_Allg_AttributeGroup)null);
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
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ELEMENT:
				return iDNBElement != null;
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ZONE:
				return iDNBZone != null;
			case NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG:
				return nBZoneElementAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //NB_Zone_ElementImpl
