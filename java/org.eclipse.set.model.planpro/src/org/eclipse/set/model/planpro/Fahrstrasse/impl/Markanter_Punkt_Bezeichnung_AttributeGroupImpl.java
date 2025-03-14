/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Fahrstrasse.Bezeichnung_Markanter_Punkt_TypeClass;
import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.planpro.Fahrstrasse.Markanter_Punkt_Bezeichnung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Markanter Punkt Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Markanter_Punkt_Bezeichnung_AttributeGroupImpl#getBezeichnungMarkanterPunkt <em>Bezeichnung Markanter Punkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Markanter_Punkt_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Markanter_Punkt_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungMarkanterPunkt() <em>Bezeichnung Markanter Punkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungMarkanterPunkt()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Markanter_Punkt_TypeClass bezeichnungMarkanterPunkt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Markanter_Punkt_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Markanter_Punkt_TypeClass getBezeichnungMarkanterPunkt() {
		return bezeichnungMarkanterPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungMarkanterPunkt(Bezeichnung_Markanter_Punkt_TypeClass newBezeichnungMarkanterPunkt, NotificationChain msgs) {
		Bezeichnung_Markanter_Punkt_TypeClass oldBezeichnungMarkanterPunkt = bezeichnungMarkanterPunkt;
		bezeichnungMarkanterPunkt = newBezeichnungMarkanterPunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_MARKANTER_PUNKT, oldBezeichnungMarkanterPunkt, newBezeichnungMarkanterPunkt);
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
	public void setBezeichnungMarkanterPunkt(Bezeichnung_Markanter_Punkt_TypeClass newBezeichnungMarkanterPunkt) {
		if (newBezeichnungMarkanterPunkt != bezeichnungMarkanterPunkt) {
			NotificationChain msgs = null;
			if (bezeichnungMarkanterPunkt != null)
				msgs = ((InternalEObject)bezeichnungMarkanterPunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_MARKANTER_PUNKT, null, msgs);
			if (newBezeichnungMarkanterPunkt != null)
				msgs = ((InternalEObject)newBezeichnungMarkanterPunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_MARKANTER_PUNKT, null, msgs);
			msgs = basicSetBezeichnungMarkanterPunkt(newBezeichnungMarkanterPunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_MARKANTER_PUNKT, newBezeichnungMarkanterPunkt, newBezeichnungMarkanterPunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_MARKANTER_PUNKT:
				return basicSetBezeichnungMarkanterPunkt(null, msgs);
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
			case FahrstrassePackage.MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_MARKANTER_PUNKT:
				return getBezeichnungMarkanterPunkt();
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
			case FahrstrassePackage.MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_MARKANTER_PUNKT:
				setBezeichnungMarkanterPunkt((Bezeichnung_Markanter_Punkt_TypeClass)newValue);
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
			case FahrstrassePackage.MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_MARKANTER_PUNKT:
				setBezeichnungMarkanterPunkt((Bezeichnung_Markanter_Punkt_TypeClass)null);
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
			case FahrstrassePackage.MARKANTER_PUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_MARKANTER_PUNKT:
				return bezeichnungMarkanterPunkt != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Markanter_Punkt_Bezeichnung_AttributeGroupImpl
