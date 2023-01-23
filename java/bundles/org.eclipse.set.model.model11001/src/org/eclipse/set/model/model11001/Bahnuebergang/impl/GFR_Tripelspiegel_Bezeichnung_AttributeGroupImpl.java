/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.model11001.Bahnuebergang.Bezeichnung_GFR_Tripelspiegel_TypeClass;
import org.eclipse.set.model.model11001.Bahnuebergang.GFR_Tripelspiegel_Bezeichnung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GFR Tripelspiegel Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.GFR_Tripelspiegel_Bezeichnung_AttributeGroupImpl#getBezeichnungGFRTripelspiegel <em>Bezeichnung GFR Tripelspiegel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GFR_Tripelspiegel_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements GFR_Tripelspiegel_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungGFRTripelspiegel() <em>Bezeichnung GFR Tripelspiegel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungGFRTripelspiegel()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_GFR_Tripelspiegel_TypeClass bezeichnungGFRTripelspiegel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GFR_Tripelspiegel_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getGFR_Tripelspiegel_Bezeichnung_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_GFR_Tripelspiegel_TypeClass getBezeichnungGFRTripelspiegel() {
		return bezeichnungGFRTripelspiegel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungGFRTripelspiegel(Bezeichnung_GFR_Tripelspiegel_TypeClass newBezeichnungGFRTripelspiegel, NotificationChain msgs) {
		Bezeichnung_GFR_Tripelspiegel_TypeClass oldBezeichnungGFRTripelspiegel = bezeichnungGFRTripelspiegel;
		bezeichnungGFRTripelspiegel = newBezeichnungGFRTripelspiegel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_TRIPELSPIEGEL, oldBezeichnungGFRTripelspiegel, newBezeichnungGFRTripelspiegel);
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
	public void setBezeichnungGFRTripelspiegel(Bezeichnung_GFR_Tripelspiegel_TypeClass newBezeichnungGFRTripelspiegel) {
		if (newBezeichnungGFRTripelspiegel != bezeichnungGFRTripelspiegel) {
			NotificationChain msgs = null;
			if (bezeichnungGFRTripelspiegel != null)
				msgs = ((InternalEObject)bezeichnungGFRTripelspiegel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_TRIPELSPIEGEL, null, msgs);
			if (newBezeichnungGFRTripelspiegel != null)
				msgs = ((InternalEObject)newBezeichnungGFRTripelspiegel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_TRIPELSPIEGEL, null, msgs);
			msgs = basicSetBezeichnungGFRTripelspiegel(newBezeichnungGFRTripelspiegel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_TRIPELSPIEGEL, newBezeichnungGFRTripelspiegel, newBezeichnungGFRTripelspiegel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_TRIPELSPIEGEL:
				return basicSetBezeichnungGFRTripelspiegel(null, msgs);
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
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_TRIPELSPIEGEL:
				return getBezeichnungGFRTripelspiegel();
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
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_TRIPELSPIEGEL:
				setBezeichnungGFRTripelspiegel((Bezeichnung_GFR_Tripelspiegel_TypeClass)newValue);
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
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_TRIPELSPIEGEL:
				setBezeichnungGFRTripelspiegel((Bezeichnung_GFR_Tripelspiegel_TypeClass)null);
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
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_GFR_TRIPELSPIEGEL:
				return bezeichnungGFRTripelspiegel != null;
		}
		return super.eIsSet(featureID);
	}

} //GFR_Tripelspiegel_Bezeichnung_AttributeGroupImpl
