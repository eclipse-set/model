/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Handschalteinrichtung_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.planpro.Verweise.ID_Bedien_Anzeige_Element_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Handschalt_Wirkfunktion_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Bedien Anz Element Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Bedien_Anz_Element_Allg_AttributeGroupImpl#getBUEHandschalteinrichtung <em>BUE Handschalteinrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Bedien_Anz_Element_Allg_AttributeGroupImpl#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Bedien_Anz_Element_Allg_AttributeGroupImpl#getIDHandschaltWirkfunktion <em>ID Handschalt Wirkfunktion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Bedien_Anz_Element_Allg_AttributeGroupImpl extends EObjectImpl implements BUE_Bedien_Anz_Element_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBUEHandschalteinrichtung() <em>BUE Handschalteinrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEHandschalteinrichtung()
	 * @generated
	 * @ordered
	 */
	protected BUE_Handschalteinrichtung_TypeClass bUEHandschalteinrichtung;

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
	 * The cached value of the '{@link #getIDHandschaltWirkfunktion() <em>ID Handschalt Wirkfunktion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDHandschaltWirkfunktion()
	 * @generated
	 * @ordered
	 */
	protected ID_Handschalt_Wirkfunktion_TypeClass iDHandschaltWirkfunktion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Bedien_Anz_Element_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Bedien_Anz_Element_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Handschalteinrichtung_TypeClass getBUEHandschalteinrichtung() {
		return bUEHandschalteinrichtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUEHandschalteinrichtung(BUE_Handschalteinrichtung_TypeClass newBUEHandschalteinrichtung, NotificationChain msgs) {
		BUE_Handschalteinrichtung_TypeClass oldBUEHandschalteinrichtung = bUEHandschalteinrichtung;
		bUEHandschalteinrichtung = newBUEHandschalteinrichtung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG, oldBUEHandschalteinrichtung, newBUEHandschalteinrichtung);
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
	public void setBUEHandschalteinrichtung(BUE_Handschalteinrichtung_TypeClass newBUEHandschalteinrichtung) {
		if (newBUEHandschalteinrichtung != bUEHandschalteinrichtung) {
			NotificationChain msgs = null;
			if (bUEHandschalteinrichtung != null)
				msgs = ((InternalEObject)bUEHandschalteinrichtung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG, null, msgs);
			if (newBUEHandschalteinrichtung != null)
				msgs = ((InternalEObject)newBUEHandschalteinrichtung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG, null, msgs);
			msgs = basicSetBUEHandschalteinrichtung(newBUEHandschalteinrichtung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG, newBUEHandschalteinrichtung, newBUEHandschalteinrichtung));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_BEDIEN_ANZEIGE_ELEMENT, oldIDBedienAnzeigeElement, newIDBedienAnzeigeElement);
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
				msgs = ((InternalEObject)iDBedienAnzeigeElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_BEDIEN_ANZEIGE_ELEMENT, null, msgs);
			if (newIDBedienAnzeigeElement != null)
				msgs = ((InternalEObject)newIDBedienAnzeigeElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_BEDIEN_ANZEIGE_ELEMENT, null, msgs);
			msgs = basicSetIDBedienAnzeigeElement(newIDBedienAnzeigeElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_BEDIEN_ANZEIGE_ELEMENT, newIDBedienAnzeigeElement, newIDBedienAnzeigeElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Handschalt_Wirkfunktion_TypeClass getIDHandschaltWirkfunktion() {
		return iDHandschaltWirkfunktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDHandschaltWirkfunktion(ID_Handschalt_Wirkfunktion_TypeClass newIDHandschaltWirkfunktion, NotificationChain msgs) {
		ID_Handschalt_Wirkfunktion_TypeClass oldIDHandschaltWirkfunktion = iDHandschaltWirkfunktion;
		iDHandschaltWirkfunktion = newIDHandschaltWirkfunktion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_HANDSCHALT_WIRKFUNKTION, oldIDHandschaltWirkfunktion, newIDHandschaltWirkfunktion);
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
	public void setIDHandschaltWirkfunktion(ID_Handschalt_Wirkfunktion_TypeClass newIDHandschaltWirkfunktion) {
		if (newIDHandschaltWirkfunktion != iDHandschaltWirkfunktion) {
			NotificationChain msgs = null;
			if (iDHandschaltWirkfunktion != null)
				msgs = ((InternalEObject)iDHandschaltWirkfunktion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_HANDSCHALT_WIRKFUNKTION, null, msgs);
			if (newIDHandschaltWirkfunktion != null)
				msgs = ((InternalEObject)newIDHandschaltWirkfunktion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_HANDSCHALT_WIRKFUNKTION, null, msgs);
			msgs = basicSetIDHandschaltWirkfunktion(newIDHandschaltWirkfunktion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_HANDSCHALT_WIRKFUNKTION, newIDHandschaltWirkfunktion, newIDHandschaltWirkfunktion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG:
				return basicSetBUEHandschalteinrichtung(null, msgs);
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_BEDIEN_ANZEIGE_ELEMENT:
				return basicSetIDBedienAnzeigeElement(null, msgs);
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_HANDSCHALT_WIRKFUNKTION:
				return basicSetIDHandschaltWirkfunktion(null, msgs);
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
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG:
				return getBUEHandschalteinrichtung();
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_BEDIEN_ANZEIGE_ELEMENT:
				return getIDBedienAnzeigeElement();
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_HANDSCHALT_WIRKFUNKTION:
				return getIDHandschaltWirkfunktion();
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
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG:
				setBUEHandschalteinrichtung((BUE_Handschalteinrichtung_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_BEDIEN_ANZEIGE_ELEMENT:
				setIDBedienAnzeigeElement((ID_Bedien_Anzeige_Element_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_HANDSCHALT_WIRKFUNKTION:
				setIDHandschaltWirkfunktion((ID_Handschalt_Wirkfunktion_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG:
				setBUEHandschalteinrichtung((BUE_Handschalteinrichtung_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_BEDIEN_ANZEIGE_ELEMENT:
				setIDBedienAnzeigeElement((ID_Bedien_Anzeige_Element_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_HANDSCHALT_WIRKFUNKTION:
				setIDHandschaltWirkfunktion((ID_Handschalt_Wirkfunktion_TypeClass)null);
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
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG:
				return bUEHandschalteinrichtung != null;
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_BEDIEN_ANZEIGE_ELEMENT:
				return iDBedienAnzeigeElement != null;
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_HANDSCHALT_WIRKFUNKTION:
				return iDHandschaltWirkfunktion != null;
		}
		return super.eIsSet(featureID);
	}

} //BUE_Bedien_Anz_Element_Allg_AttributeGroupImpl
