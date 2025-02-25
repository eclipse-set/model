/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Bedienung.Bedien_Anzeige_Element_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;
import org.eclipse.set.model.planpro.Bedienung.Bez_Bed_Anzeige_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Anzeige Element Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Anzeige_Element_Bezeichnung_AttributeGroupImpl#getBezBedAnzeigeElement <em>Bez Bed Anzeige Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Anzeige_Element_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Bedien_Anzeige_Element_Bezeichnung_AttributeGroup {
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANZEIGE_ELEMENT:
				return getBezBedAnzeigeElement();
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANZEIGE_ELEMENT:
				setBezBedAnzeigeElement((Bez_Bed_Anzeige_Element_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANZEIGE_ELEMENT:
				setBezBedAnzeigeElement((Bez_Bed_Anzeige_Element_TypeClass)null);
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_BED_ANZEIGE_ELEMENT:
				return bezBedAnzeigeElement != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedien_Anzeige_Element_Bezeichnung_AttributeGroupImpl
