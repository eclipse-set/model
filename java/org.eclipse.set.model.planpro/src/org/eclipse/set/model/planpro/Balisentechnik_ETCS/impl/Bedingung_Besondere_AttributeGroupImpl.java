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

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Art_Bedingung_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Besondere_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedingung Besondere Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Bedingung_Besondere_AttributeGroupImpl#getArtBedingung <em>Art Bedingung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedingung_Besondere_AttributeGroupImpl extends EObjectImpl implements Bedingung_Besondere_AttributeGroup {
	/**
	 * The cached value of the '{@link #getArtBedingung() <em>Art Bedingung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtBedingung()
	 * @generated
	 * @ordered
	 */
	protected Art_Bedingung_TypeClass artBedingung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedingung_Besondere_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBedingung_Besondere_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Art_Bedingung_TypeClass getArtBedingung() {
		return artBedingung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtBedingung(Art_Bedingung_TypeClass newArtBedingung, NotificationChain msgs) {
		Art_Bedingung_TypeClass oldArtBedingung = artBedingung;
		artBedingung = newArtBedingung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_BESONDERE_ATTRIBUTE_GROUP__ART_BEDINGUNG, oldArtBedingung, newArtBedingung);
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
	public void setArtBedingung(Art_Bedingung_TypeClass newArtBedingung) {
		if (newArtBedingung != artBedingung) {
			NotificationChain msgs = null;
			if (artBedingung != null)
				msgs = ((InternalEObject)artBedingung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_BESONDERE_ATTRIBUTE_GROUP__ART_BEDINGUNG, null, msgs);
			if (newArtBedingung != null)
				msgs = ((InternalEObject)newArtBedingung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_BESONDERE_ATTRIBUTE_GROUP__ART_BEDINGUNG, null, msgs);
			msgs = basicSetArtBedingung(newArtBedingung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_BESONDERE_ATTRIBUTE_GROUP__ART_BEDINGUNG, newArtBedingung, newArtBedingung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BEDINGUNG_BESONDERE_ATTRIBUTE_GROUP__ART_BEDINGUNG:
				return basicSetArtBedingung(null, msgs);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_BESONDERE_ATTRIBUTE_GROUP__ART_BEDINGUNG:
				return getArtBedingung();
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_BESONDERE_ATTRIBUTE_GROUP__ART_BEDINGUNG:
				setArtBedingung((Art_Bedingung_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_BESONDERE_ATTRIBUTE_GROUP__ART_BEDINGUNG:
				setArtBedingung((Art_Bedingung_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_BESONDERE_ATTRIBUTE_GROUP__ART_BEDINGUNG:
				return artBedingung != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedingung_Besondere_AttributeGroupImpl
