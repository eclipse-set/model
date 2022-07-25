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

import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Neigung_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element;
import org.eclipse.set.model.model1902.Bahnuebergang.GFR_Element_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Bahnuebergang.GFR_Neigung_TypeClass;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_GFR_Anlage_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GFR Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_ElementImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_ElementImpl#getIDGFRAnlage <em>IDGFR Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_ElementImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_ElementImpl#getBUENeigung <em>BUE Neigung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.GFR_ElementImpl#getGFRNeigung <em>GFR Neigung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GFR_ElementImpl extends Basis_ObjektImpl implements GFR_Element {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected GFR_Element_Bezeichnung_AttributeGroup bezeichnung;

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
	 * The cached value of the '{@link #getIDUnterbringung() <em>ID Unterbringung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUnterbringung()
	 * @generated
	 * @ordered
	 */
	protected ID_Unterbringung_ohne_Proxy_TypeClass iDUnterbringung;

	/**
	 * The cached value of the '{@link #getBUENeigung() <em>BUE Neigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUENeigung()
	 * @generated
	 * @ordered
	 */
	protected BUE_Neigung_TypeClass bUENeigung;

	/**
	 * The cached value of the '{@link #getGFRNeigung() <em>GFR Neigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGFRNeigung()
	 * @generated
	 * @ordered
	 */
	protected GFR_Neigung_TypeClass gFRNeigung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GFR_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getGFR_Element();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Element_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(GFR_Element_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		GFR_Element_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(GFR_Element_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__IDGFR_ANLAGE, oldIDGFRAnlage, newIDGFRAnlage);
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
				msgs = ((InternalEObject)iDGFRAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT__IDGFR_ANLAGE, null, msgs);
			if (newIDGFRAnlage != null)
				msgs = ((InternalEObject)newIDGFRAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT__IDGFR_ANLAGE, null, msgs);
			msgs = basicSetIDGFRAnlage(newIDGFRAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__IDGFR_ANLAGE, newIDGFRAnlage, newIDGFRAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Unterbringung_ohne_Proxy_TypeClass getIDUnterbringung() {
		return iDUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDUnterbringung(ID_Unterbringung_ohne_Proxy_TypeClass newIDUnterbringung, NotificationChain msgs) {
		ID_Unterbringung_ohne_Proxy_TypeClass oldIDUnterbringung = iDUnterbringung;
		iDUnterbringung = newIDUnterbringung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__ID_UNTERBRINGUNG, oldIDUnterbringung, newIDUnterbringung);
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
	public void setIDUnterbringung(ID_Unterbringung_ohne_Proxy_TypeClass newIDUnterbringung) {
		if (newIDUnterbringung != iDUnterbringung) {
			NotificationChain msgs = null;
			if (iDUnterbringung != null)
				msgs = ((InternalEObject)iDUnterbringung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT__ID_UNTERBRINGUNG, null, msgs);
			if (newIDUnterbringung != null)
				msgs = ((InternalEObject)newIDUnterbringung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT__ID_UNTERBRINGUNG, null, msgs);
			msgs = basicSetIDUnterbringung(newIDUnterbringung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__ID_UNTERBRINGUNG, newIDUnterbringung, newIDUnterbringung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Neigung_TypeClass getBUENeigung() {
		return bUENeigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUENeigung(BUE_Neigung_TypeClass newBUENeigung, NotificationChain msgs) {
		BUE_Neigung_TypeClass oldBUENeigung = bUENeigung;
		bUENeigung = newBUENeigung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG, oldBUENeigung, newBUENeigung);
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
	public void setBUENeigung(BUE_Neigung_TypeClass newBUENeigung) {
		if (newBUENeigung != bUENeigung) {
			NotificationChain msgs = null;
			if (bUENeigung != null)
				msgs = ((InternalEObject)bUENeigung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG, null, msgs);
			if (newBUENeigung != null)
				msgs = ((InternalEObject)newBUENeigung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG, null, msgs);
			msgs = basicSetBUENeigung(newBUENeigung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG, newBUENeigung, newBUENeigung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Neigung_TypeClass getGFRNeigung() {
		return gFRNeigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGFRNeigung(GFR_Neigung_TypeClass newGFRNeigung, NotificationChain msgs) {
		GFR_Neigung_TypeClass oldGFRNeigung = gFRNeigung;
		gFRNeigung = newGFRNeigung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG, oldGFRNeigung, newGFRNeigung);
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
	public void setGFRNeigung(GFR_Neigung_TypeClass newGFRNeigung) {
		if (newGFRNeigung != gFRNeigung) {
			NotificationChain msgs = null;
			if (gFRNeigung != null)
				msgs = ((InternalEObject)gFRNeigung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG, null, msgs);
			if (newGFRNeigung != null)
				msgs = ((InternalEObject)newGFRNeigung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG, null, msgs);
			msgs = basicSetGFRNeigung(newGFRNeigung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG, newGFRNeigung, newGFRNeigung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case BahnuebergangPackage.GFR_ELEMENT__IDGFR_ANLAGE:
				return basicSetIDGFRAnlage(null, msgs);
			case BahnuebergangPackage.GFR_ELEMENT__ID_UNTERBRINGUNG:
				return basicSetIDUnterbringung(null, msgs);
			case BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG:
				return basicSetBUENeigung(null, msgs);
			case BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG:
				return basicSetGFRNeigung(null, msgs);
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
			case BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG:
				return getBezeichnung();
			case BahnuebergangPackage.GFR_ELEMENT__IDGFR_ANLAGE:
				return getIDGFRAnlage();
			case BahnuebergangPackage.GFR_ELEMENT__ID_UNTERBRINGUNG:
				return getIDUnterbringung();
			case BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG:
				return getBUENeigung();
			case BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG:
				return getGFRNeigung();
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
			case BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG:
				setBezeichnung((GFR_Element_Bezeichnung_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.GFR_ELEMENT__IDGFR_ANLAGE:
				setIDGFRAnlage((ID_GFR_Anlage_ohne_Proxy_TypeClass)newValue);
				return;
			case BahnuebergangPackage.GFR_ELEMENT__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_ohne_Proxy_TypeClass)newValue);
				return;
			case BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG:
				setBUENeigung((BUE_Neigung_TypeClass)newValue);
				return;
			case BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG:
				setGFRNeigung((GFR_Neigung_TypeClass)newValue);
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
			case BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG:
				setBezeichnung((GFR_Element_Bezeichnung_AttributeGroup)null);
				return;
			case BahnuebergangPackage.GFR_ELEMENT__IDGFR_ANLAGE:
				setIDGFRAnlage((ID_GFR_Anlage_ohne_Proxy_TypeClass)null);
				return;
			case BahnuebergangPackage.GFR_ELEMENT__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_ohne_Proxy_TypeClass)null);
				return;
			case BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG:
				setBUENeigung((BUE_Neigung_TypeClass)null);
				return;
			case BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG:
				setGFRNeigung((GFR_Neigung_TypeClass)null);
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
			case BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG:
				return bezeichnung != null;
			case BahnuebergangPackage.GFR_ELEMENT__IDGFR_ANLAGE:
				return iDGFRAnlage != null;
			case BahnuebergangPackage.GFR_ELEMENT__ID_UNTERBRINGUNG:
				return iDUnterbringung != null;
			case BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG:
				return bUENeigung != null;
			case BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG:
				return gFRNeigung != null;
		}
		return super.eIsSet(featureID);
	}

} //GFR_ElementImpl
