/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_PZB_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Wirksam_TypeClass;

import org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedingung PZB Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Bedingung_PZB_AttributeGroupImpl#getIDPZBElement <em>IDPZB Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Bedingung_PZB_AttributeGroupImpl#getWirksam <em>Wirksam</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedingung_PZB_AttributeGroupImpl extends EObjectImpl implements Bedingung_PZB_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDPZBElement() <em>IDPZB Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDPZBElement()
	 * @generated
	 * @ordered
	 */
	protected ID_PZB_Element_TypeClass iDPZBElement;

	/**
	 * The cached value of the '{@link #getWirksam() <em>Wirksam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWirksam()
	 * @generated
	 * @ordered
	 */
	protected Wirksam_TypeClass wirksam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedingung_PZB_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBedingung_PZB_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_PZB_Element_TypeClass getIDPZBElement() {
		return iDPZBElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDPZBElement(ID_PZB_Element_TypeClass newIDPZBElement, NotificationChain msgs) {
		ID_PZB_Element_TypeClass oldIDPZBElement = iDPZBElement;
		iDPZBElement = newIDPZBElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__IDPZB_ELEMENT, oldIDPZBElement, newIDPZBElement);
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
	public void setIDPZBElement(ID_PZB_Element_TypeClass newIDPZBElement) {
		if (newIDPZBElement != iDPZBElement) {
			NotificationChain msgs = null;
			if (iDPZBElement != null)
				msgs = ((InternalEObject)iDPZBElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__IDPZB_ELEMENT, null, msgs);
			if (newIDPZBElement != null)
				msgs = ((InternalEObject)newIDPZBElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__IDPZB_ELEMENT, null, msgs);
			msgs = basicSetIDPZBElement(newIDPZBElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__IDPZB_ELEMENT, newIDPZBElement, newIDPZBElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wirksam_TypeClass getWirksam() {
		return wirksam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWirksam(Wirksam_TypeClass newWirksam, NotificationChain msgs) {
		Wirksam_TypeClass oldWirksam = wirksam;
		wirksam = newWirksam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM, oldWirksam, newWirksam);
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
	public void setWirksam(Wirksam_TypeClass newWirksam) {
		if (newWirksam != wirksam) {
			NotificationChain msgs = null;
			if (wirksam != null)
				msgs = ((InternalEObject)wirksam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM, null, msgs);
			if (newWirksam != null)
				msgs = ((InternalEObject)newWirksam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM, null, msgs);
			msgs = basicSetWirksam(newWirksam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM, newWirksam, newWirksam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__IDPZB_ELEMENT:
				return basicSetIDPZBElement(null, msgs);
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM:
				return basicSetWirksam(null, msgs);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__IDPZB_ELEMENT:
				return getIDPZBElement();
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM:
				return getWirksam();
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__IDPZB_ELEMENT:
				setIDPZBElement((ID_PZB_Element_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM:
				setWirksam((Wirksam_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__IDPZB_ELEMENT:
				setIDPZBElement((ID_PZB_Element_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM:
				setWirksam((Wirksam_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__IDPZB_ELEMENT:
				return iDPZBElement != null;
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM:
				return wirksam != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedingung_PZB_AttributeGroupImpl
