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

import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.planpro.Bahnuebergang.GFR_Tripelspiegel;
import org.eclipse.set.model.planpro.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Bahnuebergang.GFR_Tripelspiegel_Bezeichnung_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_GFR_Anlage_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GFR Tripelspiegel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.GFR_TripelspiegelImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.GFR_TripelspiegelImpl#getGFRTripelspiegelAllg <em>GFR Tripelspiegel Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.GFR_TripelspiegelImpl#getIDGFRAnlage <em>IDGFR Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GFR_TripelspiegelImpl extends Punkt_ObjektImpl implements GFR_Tripelspiegel {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected GFR_Tripelspiegel_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getGFRTripelspiegelAllg() <em>GFR Tripelspiegel Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGFRTripelspiegelAllg()
	 * @generated
	 * @ordered
	 */
	protected GFR_Tripelspiegel_Allg_AttributeGroup gFRTripelspiegelAllg;

	/**
	 * The cached value of the '{@link #getIDGFRAnlage() <em>IDGFR Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGFRAnlage()
	 * @generated
	 * @ordered
	 */
	protected ID_GFR_Anlage_ohne_Proxy_TypeClass iDGFRAnlage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GFR_TripelspiegelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getGFR_Tripelspiegel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Tripelspiegel_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(GFR_Tripelspiegel_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		GFR_Tripelspiegel_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(GFR_Tripelspiegel_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Tripelspiegel_Allg_AttributeGroup getGFRTripelspiegelAllg() {
		return gFRTripelspiegelAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGFRTripelspiegelAllg(GFR_Tripelspiegel_Allg_AttributeGroup newGFRTripelspiegelAllg, NotificationChain msgs) {
		GFR_Tripelspiegel_Allg_AttributeGroup oldGFRTripelspiegelAllg = gFRTripelspiegelAllg;
		gFRTripelspiegelAllg = newGFRTripelspiegelAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG, oldGFRTripelspiegelAllg, newGFRTripelspiegelAllg);
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
	public void setGFRTripelspiegelAllg(GFR_Tripelspiegel_Allg_AttributeGroup newGFRTripelspiegelAllg) {
		if (newGFRTripelspiegelAllg != gFRTripelspiegelAllg) {
			NotificationChain msgs = null;
			if (gFRTripelspiegelAllg != null)
				msgs = ((InternalEObject)gFRTripelspiegelAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG, null, msgs);
			if (newGFRTripelspiegelAllg != null)
				msgs = ((InternalEObject)newGFRTripelspiegelAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG, null, msgs);
			msgs = basicSetGFRTripelspiegelAllg(newGFRTripelspiegelAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG, newGFRTripelspiegelAllg, newGFRTripelspiegelAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_GFR_Anlage_ohne_Proxy_TypeClass getIDGFRAnlage() {
		return iDGFRAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDGFRAnlage(ID_GFR_Anlage_ohne_Proxy_TypeClass newIDGFRAnlage, NotificationChain msgs) {
		ID_GFR_Anlage_ohne_Proxy_TypeClass oldIDGFRAnlage = iDGFRAnlage;
		iDGFRAnlage = newIDGFRAnlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL__IDGFR_ANLAGE, oldIDGFRAnlage, newIDGFRAnlage);
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
	public void setIDGFRAnlage(ID_GFR_Anlage_ohne_Proxy_TypeClass newIDGFRAnlage) {
		if (newIDGFRAnlage != iDGFRAnlage) {
			NotificationChain msgs = null;
			if (iDGFRAnlage != null)
				msgs = ((InternalEObject)iDGFRAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL__IDGFR_ANLAGE, null, msgs);
			if (newIDGFRAnlage != null)
				msgs = ((InternalEObject)newIDGFRAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL__IDGFR_ANLAGE, null, msgs);
			msgs = basicSetIDGFRAnlage(newIDGFRAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL__IDGFR_ANLAGE, newIDGFRAnlage, newIDGFRAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG:
				return basicSetGFRTripelspiegelAllg(null, msgs);
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__IDGFR_ANLAGE:
				return basicSetIDGFRAnlage(null, msgs);
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
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG:
				return getBezeichnung();
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG:
				return getGFRTripelspiegelAllg();
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__IDGFR_ANLAGE:
				return getIDGFRAnlage();
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
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG:
				setBezeichnung((GFR_Tripelspiegel_Bezeichnung_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG:
				setGFRTripelspiegelAllg((GFR_Tripelspiegel_Allg_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__IDGFR_ANLAGE:
				setIDGFRAnlage((ID_GFR_Anlage_ohne_Proxy_TypeClass)newValue);
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
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG:
				setBezeichnung((GFR_Tripelspiegel_Bezeichnung_AttributeGroup)null);
				return;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG:
				setGFRTripelspiegelAllg((GFR_Tripelspiegel_Allg_AttributeGroup)null);
				return;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__IDGFR_ANLAGE:
				setIDGFRAnlage((ID_GFR_Anlage_ohne_Proxy_TypeClass)null);
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
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG:
				return bezeichnung != null;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG:
				return gFRTripelspiegelAllg != null;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__IDGFR_ANLAGE:
				return iDGFRAnlage != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //GFR_TripelspiegelImpl
