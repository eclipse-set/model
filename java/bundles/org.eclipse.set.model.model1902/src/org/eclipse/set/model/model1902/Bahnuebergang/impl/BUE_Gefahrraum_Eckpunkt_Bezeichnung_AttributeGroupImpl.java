/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.model1902.Bahnuebergang.Bezeichnung_BUE_GFR_Eckpunkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Gefahrraum Eckpunkt Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroupImpl#getBezeichnungBUEGFREckpunkt <em>Bezeichnung BUEGFR Eckpunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroupImpl extends MinimalEObjectImpl.Container implements BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungBUEGFREckpunkt() <em>Bezeichnung BUEGFR Eckpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungBUEGFREckpunkt()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_BUE_GFR_Eckpunkt_TypeClass bezeichnungBUEGFREckpunkt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_BUE_GFR_Eckpunkt_TypeClass getBezeichnungBUEGFREckpunkt() {
		return bezeichnungBUEGFREckpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungBUEGFREckpunkt(Bezeichnung_BUE_GFR_Eckpunkt_TypeClass newBezeichnungBUEGFREckpunkt, NotificationChain msgs) {
		Bezeichnung_BUE_GFR_Eckpunkt_TypeClass oldBezeichnungBUEGFREckpunkt = bezeichnungBUEGFREckpunkt;
		bezeichnungBUEGFREckpunkt = newBezeichnungBUEGFREckpunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BUEGFR_ECKPUNKT, oldBezeichnungBUEGFREckpunkt, newBezeichnungBUEGFREckpunkt);
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
	public void setBezeichnungBUEGFREckpunkt(Bezeichnung_BUE_GFR_Eckpunkt_TypeClass newBezeichnungBUEGFREckpunkt) {
		if (newBezeichnungBUEGFREckpunkt != bezeichnungBUEGFREckpunkt) {
			NotificationChain msgs = null;
			if (bezeichnungBUEGFREckpunkt != null)
				msgs = ((InternalEObject)bezeichnungBUEGFREckpunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BUEGFR_ECKPUNKT, null, msgs);
			if (newBezeichnungBUEGFREckpunkt != null)
				msgs = ((InternalEObject)newBezeichnungBUEGFREckpunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BUEGFR_ECKPUNKT, null, msgs);
			msgs = basicSetBezeichnungBUEGFREckpunkt(newBezeichnungBUEGFREckpunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BUEGFR_ECKPUNKT, newBezeichnungBUEGFREckpunkt, newBezeichnungBUEGFREckpunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BUEGFR_ECKPUNKT:
				return basicSetBezeichnungBUEGFREckpunkt(null, msgs);
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
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BUEGFR_ECKPUNKT:
				return getBezeichnungBUEGFREckpunkt();
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
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BUEGFR_ECKPUNKT:
				setBezeichnungBUEGFREckpunkt((Bezeichnung_BUE_GFR_Eckpunkt_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BUEGFR_ECKPUNKT:
				setBezeichnungBUEGFREckpunkt((Bezeichnung_BUE_GFR_Eckpunkt_TypeClass)null);
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
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BUEGFR_ECKPUNKT:
				return bezeichnungBUEGFREckpunkt != null;
		}
		return super.eIsSet(featureID);
	}

} //BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroupImpl
