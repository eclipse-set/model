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

import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gefahrraum_Eckpunkt;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Gefahrraum Eckpunkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Gefahrraum_EckpunktImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Gefahrraum_EckpunktImpl#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Gefahrraum_EckpunktImpl extends Punkt_ObjektImpl implements BUE_Gefahrraum_Eckpunkt {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDBUEAnlage() <em>IDBUE Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUEAnlage()
	 * @generated
	 * @ordered
	 */
	protected ID_BUE_Anlage_ohne_Proxy_TypeClass iDBUEAnlage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Gefahrraum_EckpunktImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Gefahrraum_Eckpunkt();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_BUE_Anlage_ohne_Proxy_TypeClass getIDBUEAnlage() {
		return iDBUEAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBUEAnlage(ID_BUE_Anlage_ohne_Proxy_TypeClass newIDBUEAnlage, NotificationChain msgs) {
		ID_BUE_Anlage_ohne_Proxy_TypeClass oldIDBUEAnlage = iDBUEAnlage;
		iDBUEAnlage = newIDBUEAnlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__IDBUE_ANLAGE, oldIDBUEAnlage, newIDBUEAnlage);
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
	public void setIDBUEAnlage(ID_BUE_Anlage_ohne_Proxy_TypeClass newIDBUEAnlage) {
		if (newIDBUEAnlage != iDBUEAnlage) {
			NotificationChain msgs = null;
			if (iDBUEAnlage != null)
				msgs = ((InternalEObject)iDBUEAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__IDBUE_ANLAGE, null, msgs);
			if (newIDBUEAnlage != null)
				msgs = ((InternalEObject)newIDBUEAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__IDBUE_ANLAGE, null, msgs);
			msgs = basicSetIDBUEAnlage(newIDBUEAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__IDBUE_ANLAGE, newIDBUEAnlage, newIDBUEAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__IDBUE_ANLAGE:
				return basicSetIDBUEAnlage(null, msgs);
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
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__BEZEICHNUNG:
				return getBezeichnung();
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__IDBUE_ANLAGE:
				return getIDBUEAnlage();
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
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__BEZEICHNUNG:
				setBezeichnung((BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__IDBUE_ANLAGE:
				setIDBUEAnlage((ID_BUE_Anlage_ohne_Proxy_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__BEZEICHNUNG:
				setBezeichnung((BUE_Gefahrraum_Eckpunkt_Bezeichnung_AttributeGroup)null);
				return;
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__IDBUE_ANLAGE:
				setIDBUEAnlage((ID_BUE_Anlage_ohne_Proxy_TypeClass)null);
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
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__BEZEICHNUNG:
				return bezeichnung != null;
			case BahnuebergangPackage.BUE_GEFAHRRAUM_ECKPUNKT__IDBUE_ANLAGE:
				return iDBUEAnlage != null;
		}
		return super.eIsSet(featureID);
	}

} //BUE_Gefahrraum_EckpunktImpl
