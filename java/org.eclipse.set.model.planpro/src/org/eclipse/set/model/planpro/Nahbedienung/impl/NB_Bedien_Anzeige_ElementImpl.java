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

import org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Element;
import org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup;
import org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage;

import org.eclipse.set.model.planpro.Verweise.ID_Bedien_Anzeige_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_NB_Zone_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB Bedien Anzeige Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bedien_Anzeige_ElementImpl#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bedien_Anzeige_ElementImpl#getIDNBZone <em>IDNB Zone</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bedien_Anzeige_ElementImpl#getNBBedienAnzeigeFunktionen <em>NB Bedien Anzeige Funktionen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NB_Bedien_Anzeige_ElementImpl extends Basis_ObjektImpl implements NB_Bedien_Anzeige_Element {
	/**
	 * The cached value of the '{@link #getIDBedienAnzeigeElement() <em>ID Bedien Anzeige Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienAnzeigeElement()
	 * @generated
	 * @ordered
	 */
	protected ID_Bedien_Anzeige_Element_TypeClass iDBedienAnzeigeElement;

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
	 * The cached value of the '{@link #getNBBedienAnzeigeFunktionen() <em>NB Bedien Anzeige Funktionen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBBedienAnzeigeFunktionen()
	 * @generated
	 * @ordered
	 */
	protected NB_Bedien_Anzeige_Funktionen_AttributeGroup nBBedienAnzeigeFunktionen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Bedien_Anzeige_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NahbedienungPackage.Literals.NB_BEDIEN_ANZEIGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bedien_Anzeige_Element_TypeClass getIDBedienAnzeigeElement() {
		return iDBedienAnzeigeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBedienAnzeigeElement(ID_Bedien_Anzeige_Element_TypeClass newIDBedienAnzeigeElement, NotificationChain msgs) {
		ID_Bedien_Anzeige_Element_TypeClass oldIDBedienAnzeigeElement = iDBedienAnzeigeElement;
		iDBedienAnzeigeElement = newIDBedienAnzeigeElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT, oldIDBedienAnzeigeElement, newIDBedienAnzeigeElement);
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
	public void setIDBedienAnzeigeElement(ID_Bedien_Anzeige_Element_TypeClass newIDBedienAnzeigeElement) {
		if (newIDBedienAnzeigeElement != iDBedienAnzeigeElement) {
			NotificationChain msgs = null;
			if (iDBedienAnzeigeElement != null)
				msgs = ((InternalEObject)iDBedienAnzeigeElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT, null, msgs);
			if (newIDBedienAnzeigeElement != null)
				msgs = ((InternalEObject)newIDBedienAnzeigeElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT, null, msgs);
			msgs = basicSetIDBedienAnzeigeElement(newIDBedienAnzeigeElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT, newIDBedienAnzeigeElement, newIDBedienAnzeigeElement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE, oldIDNBZone, newIDNBZone);
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
				msgs = ((InternalEObject)iDNBZone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE, null, msgs);
			if (newIDNBZone != null)
				msgs = ((InternalEObject)newIDNBZone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE, null, msgs);
			msgs = basicSetIDNBZone(newIDNBZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE, newIDNBZone, newIDNBZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Bedien_Anzeige_Funktionen_AttributeGroup getNBBedienAnzeigeFunktionen() {
		return nBBedienAnzeigeFunktionen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNBBedienAnzeigeFunktionen(NB_Bedien_Anzeige_Funktionen_AttributeGroup newNBBedienAnzeigeFunktionen, NotificationChain msgs) {
		NB_Bedien_Anzeige_Funktionen_AttributeGroup oldNBBedienAnzeigeFunktionen = nBBedienAnzeigeFunktionen;
		nBBedienAnzeigeFunktionen = newNBBedienAnzeigeFunktionen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN, oldNBBedienAnzeigeFunktionen, newNBBedienAnzeigeFunktionen);
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
	public void setNBBedienAnzeigeFunktionen(NB_Bedien_Anzeige_Funktionen_AttributeGroup newNBBedienAnzeigeFunktionen) {
		if (newNBBedienAnzeigeFunktionen != nBBedienAnzeigeFunktionen) {
			NotificationChain msgs = null;
			if (nBBedienAnzeigeFunktionen != null)
				msgs = ((InternalEObject)nBBedienAnzeigeFunktionen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN, null, msgs);
			if (newNBBedienAnzeigeFunktionen != null)
				msgs = ((InternalEObject)newNBBedienAnzeigeFunktionen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN, null, msgs);
			msgs = basicSetNBBedienAnzeigeFunktionen(newNBBedienAnzeigeFunktionen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN, newNBBedienAnzeigeFunktionen, newNBBedienAnzeigeFunktionen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT:
				return basicSetIDBedienAnzeigeElement(null, msgs);
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE:
				return basicSetIDNBZone(null, msgs);
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN:
				return basicSetNBBedienAnzeigeFunktionen(null, msgs);
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
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT:
				return getIDBedienAnzeigeElement();
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE:
				return getIDNBZone();
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN:
				return getNBBedienAnzeigeFunktionen();
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
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT:
				setIDBedienAnzeigeElement((ID_Bedien_Anzeige_Element_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE:
				setIDNBZone((ID_NB_Zone_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN:
				setNBBedienAnzeigeFunktionen((NB_Bedien_Anzeige_Funktionen_AttributeGroup)newValue);
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
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT:
				setIDBedienAnzeigeElement((ID_Bedien_Anzeige_Element_TypeClass)null);
				return;
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE:
				setIDNBZone((ID_NB_Zone_TypeClass)null);
				return;
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN:
				setNBBedienAnzeigeFunktionen((NB_Bedien_Anzeige_Funktionen_AttributeGroup)null);
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
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT:
				return iDBedienAnzeigeElement != null;
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE:
				return iDNBZone != null;
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN:
				return nBBedienAnzeigeFunktionen != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //NB_Bedien_Anzeige_ElementImpl
