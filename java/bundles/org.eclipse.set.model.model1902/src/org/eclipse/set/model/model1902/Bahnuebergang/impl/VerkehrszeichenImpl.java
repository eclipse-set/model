/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen;
import org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup;
import org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup;
import org.eclipse.set.model.model1902.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verkehrszeichen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.VerkehrszeichenImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.VerkehrszeichenImpl#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.VerkehrszeichenImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.VerkehrszeichenImpl#getVerkehrszeichenAllg <em>Verkehrszeichen Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.VerkehrszeichenImpl#getVerkehrszeichenAndreaskreuz <em>Verkehrszeichen Andreaskreuz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.VerkehrszeichenImpl#getVerkehrszeichenLz <em>Verkehrszeichen Lz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.VerkehrszeichenImpl#getVzSperrstrecke <em>Vz Sperrstrecke</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerkehrszeichenImpl extends Basis_ObjektImpl implements Verkehrszeichen {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Verkehrszeichen_Bezeichnung_AttributeGroup bezeichnung;

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
	 * The cached value of the '{@link #getIDUnterbringung() <em>ID Unterbringung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUnterbringung()
	 * @generated
	 * @ordered
	 */
	protected ID_Unterbringung_ohne_Proxy_TypeClass iDUnterbringung;

	/**
	 * The cached value of the '{@link #getVerkehrszeichenAllg() <em>Verkehrszeichen Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerkehrszeichenAllg()
	 * @generated
	 * @ordered
	 */
	protected Verkehrszeichen_Allg_AttributeGroup verkehrszeichenAllg;

	/**
	 * The cached value of the '{@link #getVerkehrszeichenAndreaskreuz() <em>Verkehrszeichen Andreaskreuz</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerkehrszeichenAndreaskreuz()
	 * @generated
	 * @ordered
	 */
	protected EList<Verkehrszeichen_Andreaskreuz_AttributeGroup> verkehrszeichenAndreaskreuz;

	/**
	 * The cached value of the '{@link #getVerkehrszeichenLz() <em>Verkehrszeichen Lz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerkehrszeichenLz()
	 * @generated
	 * @ordered
	 */
	protected Verkehrszeichen_Lz_AttributeGroup verkehrszeichenLz;

	/**
	 * The cached value of the '{@link #getVzSperrstrecke() <em>Vz Sperrstrecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVzSperrstrecke()
	 * @generated
	 * @ordered
	 */
	protected Vz_Sperrstrecke_AttributeGroup vzSperrstrecke;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerkehrszeichenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getVerkehrszeichen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verkehrszeichen_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Verkehrszeichen_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Verkehrszeichen_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Verkehrszeichen_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG, newBezeichnung, newBezeichnung));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__IDBUE_ANLAGE, oldIDBUEAnlage, newIDBUEAnlage);
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
				msgs = ((InternalEObject)iDBUEAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__IDBUE_ANLAGE, null, msgs);
			if (newIDBUEAnlage != null)
				msgs = ((InternalEObject)newIDBUEAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__IDBUE_ANLAGE, null, msgs);
			msgs = basicSetIDBUEAnlage(newIDBUEAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__IDBUE_ANLAGE, newIDBUEAnlage, newIDBUEAnlage));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__ID_UNTERBRINGUNG, oldIDUnterbringung, newIDUnterbringung);
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
				msgs = ((InternalEObject)iDUnterbringung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__ID_UNTERBRINGUNG, null, msgs);
			if (newIDUnterbringung != null)
				msgs = ((InternalEObject)newIDUnterbringung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__ID_UNTERBRINGUNG, null, msgs);
			msgs = basicSetIDUnterbringung(newIDUnterbringung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__ID_UNTERBRINGUNG, newIDUnterbringung, newIDUnterbringung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verkehrszeichen_Allg_AttributeGroup getVerkehrszeichenAllg() {
		return verkehrszeichenAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerkehrszeichenAllg(Verkehrszeichen_Allg_AttributeGroup newVerkehrszeichenAllg, NotificationChain msgs) {
		Verkehrszeichen_Allg_AttributeGroup oldVerkehrszeichenAllg = verkehrszeichenAllg;
		verkehrszeichenAllg = newVerkehrszeichenAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG, oldVerkehrszeichenAllg, newVerkehrszeichenAllg);
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
	public void setVerkehrszeichenAllg(Verkehrszeichen_Allg_AttributeGroup newVerkehrszeichenAllg) {
		if (newVerkehrszeichenAllg != verkehrszeichenAllg) {
			NotificationChain msgs = null;
			if (verkehrszeichenAllg != null)
				msgs = ((InternalEObject)verkehrszeichenAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG, null, msgs);
			if (newVerkehrszeichenAllg != null)
				msgs = ((InternalEObject)newVerkehrszeichenAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG, null, msgs);
			msgs = basicSetVerkehrszeichenAllg(newVerkehrszeichenAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG, newVerkehrszeichenAllg, newVerkehrszeichenAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Verkehrszeichen_Andreaskreuz_AttributeGroup> getVerkehrszeichenAndreaskreuz() {
		if (verkehrszeichenAndreaskreuz == null) {
			verkehrszeichenAndreaskreuz = new EObjectContainmentEList<Verkehrszeichen_Andreaskreuz_AttributeGroup>(Verkehrszeichen_Andreaskreuz_AttributeGroup.class, this, BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ANDREASKREUZ);
		}
		return verkehrszeichenAndreaskreuz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verkehrszeichen_Lz_AttributeGroup getVerkehrszeichenLz() {
		return verkehrszeichenLz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerkehrszeichenLz(Verkehrszeichen_Lz_AttributeGroup newVerkehrszeichenLz, NotificationChain msgs) {
		Verkehrszeichen_Lz_AttributeGroup oldVerkehrszeichenLz = verkehrszeichenLz;
		verkehrszeichenLz = newVerkehrszeichenLz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ, oldVerkehrszeichenLz, newVerkehrszeichenLz);
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
	public void setVerkehrszeichenLz(Verkehrszeichen_Lz_AttributeGroup newVerkehrszeichenLz) {
		if (newVerkehrszeichenLz != verkehrszeichenLz) {
			NotificationChain msgs = null;
			if (verkehrszeichenLz != null)
				msgs = ((InternalEObject)verkehrszeichenLz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ, null, msgs);
			if (newVerkehrszeichenLz != null)
				msgs = ((InternalEObject)newVerkehrszeichenLz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ, null, msgs);
			msgs = basicSetVerkehrszeichenLz(newVerkehrszeichenLz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ, newVerkehrszeichenLz, newVerkehrszeichenLz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vz_Sperrstrecke_AttributeGroup getVzSperrstrecke() {
		return vzSperrstrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVzSperrstrecke(Vz_Sperrstrecke_AttributeGroup newVzSperrstrecke, NotificationChain msgs) {
		Vz_Sperrstrecke_AttributeGroup oldVzSperrstrecke = vzSperrstrecke;
		vzSperrstrecke = newVzSperrstrecke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE, oldVzSperrstrecke, newVzSperrstrecke);
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
	public void setVzSperrstrecke(Vz_Sperrstrecke_AttributeGroup newVzSperrstrecke) {
		if (newVzSperrstrecke != vzSperrstrecke) {
			NotificationChain msgs = null;
			if (vzSperrstrecke != null)
				msgs = ((InternalEObject)vzSperrstrecke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE, null, msgs);
			if (newVzSperrstrecke != null)
				msgs = ((InternalEObject)newVzSperrstrecke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE, null, msgs);
			msgs = basicSetVzSperrstrecke(newVzSperrstrecke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE, newVzSperrstrecke, newVzSperrstrecke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN__IDBUE_ANLAGE:
				return basicSetIDBUEAnlage(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN__ID_UNTERBRINGUNG:
				return basicSetIDUnterbringung(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG:
				return basicSetVerkehrszeichenAllg(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ANDREASKREUZ:
				return ((InternalEList<?>)getVerkehrszeichenAndreaskreuz()).basicRemove(otherEnd, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ:
				return basicSetVerkehrszeichenLz(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE:
				return basicSetVzSperrstrecke(null, msgs);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG:
				return getBezeichnung();
			case BahnuebergangPackage.VERKEHRSZEICHEN__IDBUE_ANLAGE:
				return getIDBUEAnlage();
			case BahnuebergangPackage.VERKEHRSZEICHEN__ID_UNTERBRINGUNG:
				return getIDUnterbringung();
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG:
				return getVerkehrszeichenAllg();
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ANDREASKREUZ:
				return getVerkehrszeichenAndreaskreuz();
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ:
				return getVerkehrszeichenLz();
			case BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE:
				return getVzSperrstrecke();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG:
				setBezeichnung((Verkehrszeichen_Bezeichnung_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__IDBUE_ANLAGE:
				setIDBUEAnlage((ID_BUE_Anlage_ohne_Proxy_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_ohne_Proxy_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG:
				setVerkehrszeichenAllg((Verkehrszeichen_Allg_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ANDREASKREUZ:
				getVerkehrszeichenAndreaskreuz().clear();
				getVerkehrszeichenAndreaskreuz().addAll((Collection<? extends Verkehrszeichen_Andreaskreuz_AttributeGroup>)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ:
				setVerkehrszeichenLz((Verkehrszeichen_Lz_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE:
				setVzSperrstrecke((Vz_Sperrstrecke_AttributeGroup)newValue);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG:
				setBezeichnung((Verkehrszeichen_Bezeichnung_AttributeGroup)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__IDBUE_ANLAGE:
				setIDBUEAnlage((ID_BUE_Anlage_ohne_Proxy_TypeClass)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_ohne_Proxy_TypeClass)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG:
				setVerkehrszeichenAllg((Verkehrszeichen_Allg_AttributeGroup)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ANDREASKREUZ:
				getVerkehrszeichenAndreaskreuz().clear();
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ:
				setVerkehrszeichenLz((Verkehrszeichen_Lz_AttributeGroup)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE:
				setVzSperrstrecke((Vz_Sperrstrecke_AttributeGroup)null);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG:
				return bezeichnung != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN__IDBUE_ANLAGE:
				return iDBUEAnlage != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN__ID_UNTERBRINGUNG:
				return iDUnterbringung != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG:
				return verkehrszeichenAllg != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ANDREASKREUZ:
				return verkehrszeichenAndreaskreuz != null && !verkehrszeichenAndreaskreuz.isEmpty();
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ:
				return verkehrszeichenLz != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE:
				return vzSperrstrecke != null;
		}
		return super.eIsSet(featureID);
	}

} //VerkehrszeichenImpl
