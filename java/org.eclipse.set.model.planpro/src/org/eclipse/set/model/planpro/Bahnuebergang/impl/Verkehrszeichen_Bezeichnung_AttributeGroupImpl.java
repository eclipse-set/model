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
import org.eclipse.set.model.planpro.Bahnuebergang.Bezeichnung_Verkehrszeichen_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Bezeichnung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verkehrszeichen Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Verkehrszeichen_Bezeichnung_AttributeGroupImpl#getBezeichnungVerkehrszeichen <em>Bezeichnung Verkehrszeichen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Verkehrszeichen_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Verkehrszeichen_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungVerkehrszeichen() <em>Bezeichnung Verkehrszeichen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungVerkehrszeichen()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Verkehrszeichen_TypeClass bezeichnungVerkehrszeichen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Verkehrszeichen_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_Bezeichnung_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Verkehrszeichen_TypeClass getBezeichnungVerkehrszeichen() {
		return bezeichnungVerkehrszeichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungVerkehrszeichen(Bezeichnung_Verkehrszeichen_TypeClass newBezeichnungVerkehrszeichen, NotificationChain msgs) {
		Bezeichnung_Verkehrszeichen_TypeClass oldBezeichnungVerkehrszeichen = bezeichnungVerkehrszeichen;
		bezeichnungVerkehrszeichen = newBezeichnungVerkehrszeichen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_VERKEHRSZEICHEN, oldBezeichnungVerkehrszeichen, newBezeichnungVerkehrszeichen);
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
	public void setBezeichnungVerkehrszeichen(Bezeichnung_Verkehrszeichen_TypeClass newBezeichnungVerkehrszeichen) {
		if (newBezeichnungVerkehrszeichen != bezeichnungVerkehrszeichen) {
			NotificationChain msgs = null;
			if (bezeichnungVerkehrszeichen != null)
				msgs = ((InternalEObject)bezeichnungVerkehrszeichen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_VERKEHRSZEICHEN, null, msgs);
			if (newBezeichnungVerkehrszeichen != null)
				msgs = ((InternalEObject)newBezeichnungVerkehrszeichen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_VERKEHRSZEICHEN, null, msgs);
			msgs = basicSetBezeichnungVerkehrszeichen(newBezeichnungVerkehrszeichen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_VERKEHRSZEICHEN, newBezeichnungVerkehrszeichen, newBezeichnungVerkehrszeichen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.VERKEHRSZEICHEN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_VERKEHRSZEICHEN:
				return basicSetBezeichnungVerkehrszeichen(null, msgs);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_VERKEHRSZEICHEN:
				return getBezeichnungVerkehrszeichen();
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
			case BahnuebergangPackage.VERKEHRSZEICHEN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_VERKEHRSZEICHEN:
				setBezeichnungVerkehrszeichen((Bezeichnung_Verkehrszeichen_TypeClass)newValue);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_VERKEHRSZEICHEN:
				setBezeichnungVerkehrszeichen((Bezeichnung_Verkehrszeichen_TypeClass)null);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_VERKEHRSZEICHEN:
				return bezeichnungVerkehrszeichen != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Verkehrszeichen_Bezeichnung_AttributeGroupImpl
