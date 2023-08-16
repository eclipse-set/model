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

import org.eclipse.set.model.model11001.Bahnuebergang.BUE_Anlage;
import org.eclipse.set.model.model11001.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.model.model11001.Verweise.ID_Aussenelementansteuerung_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_BUE_Schnittstelle_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Anlage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.BUE_AnlageImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.BUE_AnlageImpl#getBUEAnlageAllg <em>BUE Anlage Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.BUE_AnlageImpl#getIDAEABUEAnschaltung <em>IDAEABUE Anschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.BUE_AnlageImpl#getIDBUESchnittstelle <em>IDBUE Schnittstelle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_AnlageImpl extends Punkt_ObjektImpl implements BUE_Anlage {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Element_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getBUEAnlageAllg() <em>BUE Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEAnlageAllg()
	 * @generated
	 * @ordered
	 */
	protected BUE_Anlage_Allg_AttributeGroup bUEAnlageAllg;

	/**
	 * The cached value of the '{@link #getIDAEABUEAnschaltung() <em>IDAEABUE Anschaltung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAEABUEAnschaltung()
	 * @generated
	 * @ordered
	 */
	protected ID_Aussenelementansteuerung_ohne_Proxy_TypeClass iDAEABUEAnschaltung;

	/**
	 * The cached value of the '{@link #getIDBUESchnittstelle() <em>IDBUE Schnittstelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUESchnittstelle()
	 * @generated
	 * @ordered
	 */
	protected ID_BUE_Schnittstelle_TypeClass iDBUESchnittstelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_AnlageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Anlage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Element_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bezeichnung_Element_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bezeichnung_Element_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bezeichnung_Element_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Anlage_Allg_AttributeGroup getBUEAnlageAllg() {
		return bUEAnlageAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUEAnlageAllg(BUE_Anlage_Allg_AttributeGroup newBUEAnlageAllg, NotificationChain msgs) {
		BUE_Anlage_Allg_AttributeGroup oldBUEAnlageAllg = bUEAnlageAllg;
		bUEAnlageAllg = newBUEAnlageAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG, oldBUEAnlageAllg, newBUEAnlageAllg);
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
	public void setBUEAnlageAllg(BUE_Anlage_Allg_AttributeGroup newBUEAnlageAllg) {
		if (newBUEAnlageAllg != bUEAnlageAllg) {
			NotificationChain msgs = null;
			if (bUEAnlageAllg != null)
				msgs = ((InternalEObject)bUEAnlageAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG, null, msgs);
			if (newBUEAnlageAllg != null)
				msgs = ((InternalEObject)newBUEAnlageAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG, null, msgs);
			msgs = basicSetBUEAnlageAllg(newBUEAnlageAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG, newBUEAnlageAllg, newBUEAnlageAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Aussenelementansteuerung_ohne_Proxy_TypeClass getIDAEABUEAnschaltung() {
		return iDAEABUEAnschaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAEABUEAnschaltung(ID_Aussenelementansteuerung_ohne_Proxy_TypeClass newIDAEABUEAnschaltung, NotificationChain msgs) {
		ID_Aussenelementansteuerung_ohne_Proxy_TypeClass oldIDAEABUEAnschaltung = iDAEABUEAnschaltung;
		iDAEABUEAnschaltung = newIDAEABUEAnschaltung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE__IDAEABUE_ANSCHALTUNG, oldIDAEABUEAnschaltung, newIDAEABUEAnschaltung);
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
	public void setIDAEABUEAnschaltung(ID_Aussenelementansteuerung_ohne_Proxy_TypeClass newIDAEABUEAnschaltung) {
		if (newIDAEABUEAnschaltung != iDAEABUEAnschaltung) {
			NotificationChain msgs = null;
			if (iDAEABUEAnschaltung != null)
				msgs = ((InternalEObject)iDAEABUEAnschaltung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE__IDAEABUE_ANSCHALTUNG, null, msgs);
			if (newIDAEABUEAnschaltung != null)
				msgs = ((InternalEObject)newIDAEABUEAnschaltung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE__IDAEABUE_ANSCHALTUNG, null, msgs);
			msgs = basicSetIDAEABUEAnschaltung(newIDAEABUEAnschaltung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE__IDAEABUE_ANSCHALTUNG, newIDAEABUEAnschaltung, newIDAEABUEAnschaltung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_BUE_Schnittstelle_TypeClass getIDBUESchnittstelle() {
		return iDBUESchnittstelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBUESchnittstelle(ID_BUE_Schnittstelle_TypeClass newIDBUESchnittstelle, NotificationChain msgs) {
		ID_BUE_Schnittstelle_TypeClass oldIDBUESchnittstelle = iDBUESchnittstelle;
		iDBUESchnittstelle = newIDBUESchnittstelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE__IDBUE_SCHNITTSTELLE, oldIDBUESchnittstelle, newIDBUESchnittstelle);
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
	public void setIDBUESchnittstelle(ID_BUE_Schnittstelle_TypeClass newIDBUESchnittstelle) {
		if (newIDBUESchnittstelle != iDBUESchnittstelle) {
			NotificationChain msgs = null;
			if (iDBUESchnittstelle != null)
				msgs = ((InternalEObject)iDBUESchnittstelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE__IDBUE_SCHNITTSTELLE, null, msgs);
			if (newIDBUESchnittstelle != null)
				msgs = ((InternalEObject)newIDBUESchnittstelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE__IDBUE_SCHNITTSTELLE, null, msgs);
			msgs = basicSetIDBUESchnittstelle(newIDBUESchnittstelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE__IDBUE_SCHNITTSTELLE, newIDBUESchnittstelle, newIDBUESchnittstelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG:
				return basicSetBUEAnlageAllg(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE__IDAEABUE_ANSCHALTUNG:
				return basicSetIDAEABUEAnschaltung(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE__IDBUE_SCHNITTSTELLE:
				return basicSetIDBUESchnittstelle(null, msgs);
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
			case BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG:
				return getBezeichnung();
			case BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG:
				return getBUEAnlageAllg();
			case BahnuebergangPackage.BUE_ANLAGE__IDAEABUE_ANSCHALTUNG:
				return getIDAEABUEAnschaltung();
			case BahnuebergangPackage.BUE_ANLAGE__IDBUE_SCHNITTSTELLE:
				return getIDBUESchnittstelle();
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
			case BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG:
				setBUEAnlageAllg((BUE_Anlage_Allg_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE__IDAEABUE_ANSCHALTUNG:
				setIDAEABUEAnschaltung((ID_Aussenelementansteuerung_ohne_Proxy_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE__IDBUE_SCHNITTSTELLE:
				setIDBUESchnittstelle((ID_BUE_Schnittstelle_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG:
				setBUEAnlageAllg((BUE_Anlage_Allg_AttributeGroup)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE__IDAEABUE_ANSCHALTUNG:
				setIDAEABUEAnschaltung((ID_Aussenelementansteuerung_ohne_Proxy_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE__IDBUE_SCHNITTSTELLE:
				setIDBUESchnittstelle((ID_BUE_Schnittstelle_TypeClass)null);
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
			case BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG:
				return bezeichnung != null;
			case BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG:
				return bUEAnlageAllg != null;
			case BahnuebergangPackage.BUE_ANLAGE__IDAEABUE_ANSCHALTUNG:
				return iDAEABUEAnschaltung != null;
			case BahnuebergangPackage.BUE_ANLAGE__IDBUE_SCHNITTSTELLE:
				return iDBUESchnittstelle != null;
		}
		return super.eIsSet(featureID);
	}

} //BUE_AnlageImpl
