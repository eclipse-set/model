/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Bedienung.Bedien_Anzeige_Element_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.BedienungPackage;
import org.eclipse.set.model.model1902.Bedienung.Bez_Bed_Anzeige_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Anzeige Element Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Anzeige_Element_Bezeichnung_AttributeGroupImpl#getBezBedAnzeigeElement <em>Bez Bed Anzeige Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Anzeige_Element_Bezeichnung_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Bedien_Anzeige_Element_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezBedAnzeigeElement() <em>Bez Bed Anzeige Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezBedAnzeigeElement()
	 * @generated
	 * @ordered
	 */
	protected Bez_Bed_Anzeige_Element_TypeClass bezBedAnzeigeElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Anzeige_Element_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_Bed_Anzeige_Element_TypeClass getBezBedAnzeigeElement() {
		return bezBedAnzeigeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezBedAnzeigeElement(Bez_Bed_Anzeige_Element_TypeClass newBezBedAnzeigeElement, NotificationChain msgs) {
		Bez_Bed_Anzeige_Element_TypeClass oldBezBedAnzeigeElement = bezBedAnzeigeElement;
		bezBedAnzeigeElement = newBezBedAnzeigeElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANZEIGE_ELEMENT, oldBezBedAnzeigeElement, newBezBedAnzeigeElement);
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
	public void setBezBedAnzeigeElement(Bez_Bed_Anzeige_Element_TypeClass newBezBedAnzeigeElement) {
		if (newBezBedAnzeigeElement != bezBedAnzeigeElement) {
			NotificationChain msgs = null;
			if (bezBedAnzeigeElement != null)
				msgs = ((InternalEObject)bezBedAnzeigeElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANZEIGE_ELEMENT, null, msgs);
			if (newBezBedAnzeigeElement != null)
				msgs = ((InternalEObject)newBezBedAnzeigeElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANZEIGE_ELEMENT, null, msgs);
			msgs = basicSetBezBedAnzeigeElement(newBezBedAnzeigeElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANZEIGE_ELEMENT, newBezBedAnzeigeElement, newBezBedAnzeigeElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANZEIGE_ELEMENT:
				return basicSetBezBedAnzeigeElement(null, msgs);
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANZEIGE_ELEMENT:
				return getBezBedAnzeigeElement();
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANZEIGE_ELEMENT:
				setBezBedAnzeigeElement((Bez_Bed_Anzeige_Element_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANZEIGE_ELEMENT:
				setBezBedAnzeigeElement((Bez_Bed_Anzeige_Element_TypeClass)null);
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANZEIGE_ELEMENT:
				return bezBedAnzeigeElement != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_Anzeige_Element_Bezeichnung_AttributeGroupImpl
