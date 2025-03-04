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

import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.planpro.Bahnuebergang.Bezeichnung_GFR_Element_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.GFR_Element_Bezeichnung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GFR Element Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.GFR_Element_Bezeichnung_AttributeGroupImpl#getBezeichnungGFRElement <em>Bezeichnung GFR Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GFR_Element_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements GFR_Element_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungGFRElement() <em>Bezeichnung GFR Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungGFRElement()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_GFR_Element_TypeClass bezeichnungGFRElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GFR_Element_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getGFR_Element_Bezeichnung_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_GFR_Element_TypeClass getBezeichnungGFRElement() {
		return bezeichnungGFRElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungGFRElement(Bezeichnung_GFR_Element_TypeClass newBezeichnungGFRElement, NotificationChain msgs) {
		Bezeichnung_GFR_Element_TypeClass oldBezeichnungGFRElement = bezeichnungGFRElement;
		bezeichnungGFRElement = newBezeichnungGFRElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_ELEMENT, oldBezeichnungGFRElement, newBezeichnungGFRElement);
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
	public void setBezeichnungGFRElement(Bezeichnung_GFR_Element_TypeClass newBezeichnungGFRElement) {
		if (newBezeichnungGFRElement != bezeichnungGFRElement) {
			NotificationChain msgs = null;
			if (bezeichnungGFRElement != null)
				msgs = ((InternalEObject)bezeichnungGFRElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_ELEMENT, null, msgs);
			if (newBezeichnungGFRElement != null)
				msgs = ((InternalEObject)newBezeichnungGFRElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_ELEMENT, null, msgs);
			msgs = basicSetBezeichnungGFRElement(newBezeichnungGFRElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_ELEMENT, newBezeichnungGFRElement, newBezeichnungGFRElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.GFR_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_ELEMENT:
				return basicSetBezeichnungGFRElement(null, msgs);
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
			case BahnuebergangPackage.GFR_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_ELEMENT:
				return getBezeichnungGFRElement();
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
			case BahnuebergangPackage.GFR_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_ELEMENT:
				setBezeichnungGFRElement((Bezeichnung_GFR_Element_TypeClass)newValue);
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
			case BahnuebergangPackage.GFR_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_ELEMENT:
				setBezeichnungGFRElement((Bezeichnung_GFR_Element_TypeClass)null);
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
			case BahnuebergangPackage.GFR_ELEMENT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_ELEMENT:
				return bezeichnungGFRElement != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //GFR_Element_Bezeichnung_AttributeGroupImpl
