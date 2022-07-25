/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Bedienung.Bedien_Einricht_Oertlich_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Einrichtung_Oertlich;
import org.eclipse.set.model.model1902.Bedienung.Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.BedienungPackage;

import org.eclipse.set.model.model1902.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Aussenelementansteuerung_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Einrichtung Oertlich</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Einrichtung_OertlichImpl#getBedienEinrichtOertlichAllg <em>Bedien Einricht Oertlich Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Einrichtung_OertlichImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Einrichtung_OertlichImpl#getIDAnhangBenutzeroberflaeche <em>ID Anhang Benutzeroberflaeche</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Einrichtung_OertlichImpl#getIDAussenelementansteuerung <em>ID Aussenelementansteuerung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Einrichtung_OertlichImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Einrichtung_OertlichImpl extends Basis_ObjektImpl implements Bedien_Einrichtung_Oertlich {
	/**
	 * The cached value of the '{@link #getBedienEinrichtOertlichAllg() <em>Bedien Einricht Oertlich Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienEinrichtOertlichAllg()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Einricht_Oertlich_Allg_AttributeGroup bedienEinrichtOertlichAllg;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDAnhangBenutzeroberflaeche() <em>ID Anhang Benutzeroberflaeche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangBenutzeroberflaeche()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangBenutzeroberflaeche;

	/**
	 * The cached value of the '{@link #getIDAussenelementansteuerung() <em>ID Aussenelementansteuerung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAussenelementansteuerung()
	 * @generated
	 * @ordered
	 */
	protected ID_Aussenelementansteuerung_TypeClass iDAussenelementansteuerung;

	/**
	 * The cached value of the '{@link #getIDUnterbringung() <em>ID Unterbringung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUnterbringung()
	 * @generated
	 * @ordered
	 */
	protected ID_Unterbringung_TypeClass iDUnterbringung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Einrichtung_OertlichImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_EINRICHTUNG_OERTLICH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Einricht_Oertlich_Allg_AttributeGroup getBedienEinrichtOertlichAllg() {
		return bedienEinrichtOertlichAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienEinrichtOertlichAllg(Bedien_Einricht_Oertlich_Allg_AttributeGroup newBedienEinrichtOertlichAllg, NotificationChain msgs) {
		Bedien_Einricht_Oertlich_Allg_AttributeGroup oldBedienEinrichtOertlichAllg = bedienEinrichtOertlichAllg;
		bedienEinrichtOertlichAllg = newBedienEinrichtOertlichAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG, oldBedienEinrichtOertlichAllg, newBedienEinrichtOertlichAllg);
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
	public void setBedienEinrichtOertlichAllg(Bedien_Einricht_Oertlich_Allg_AttributeGroup newBedienEinrichtOertlichAllg) {
		if (newBedienEinrichtOertlichAllg != bedienEinrichtOertlichAllg) {
			NotificationChain msgs = null;
			if (bedienEinrichtOertlichAllg != null)
				msgs = ((InternalEObject)bedienEinrichtOertlichAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG, null, msgs);
			if (newBedienEinrichtOertlichAllg != null)
				msgs = ((InternalEObject)newBedienEinrichtOertlichAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG, null, msgs);
			msgs = basicSetBedienEinrichtOertlichAllg(newBedienEinrichtOertlichAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG, newBedienEinrichtOertlichAllg, newBedienEinrichtOertlichAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass getIDAnhangBenutzeroberflaeche() {
		return iDAnhangBenutzeroberflaeche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangBenutzeroberflaeche(ID_Anhang_TypeClass newIDAnhangBenutzeroberflaeche, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangBenutzeroberflaeche = iDAnhangBenutzeroberflaeche;
		iDAnhangBenutzeroberflaeche = newIDAnhangBenutzeroberflaeche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE, oldIDAnhangBenutzeroberflaeche, newIDAnhangBenutzeroberflaeche);
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
	public void setIDAnhangBenutzeroberflaeche(ID_Anhang_TypeClass newIDAnhangBenutzeroberflaeche) {
		if (newIDAnhangBenutzeroberflaeche != iDAnhangBenutzeroberflaeche) {
			NotificationChain msgs = null;
			if (iDAnhangBenutzeroberflaeche != null)
				msgs = ((InternalEObject)iDAnhangBenutzeroberflaeche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE, null, msgs);
			if (newIDAnhangBenutzeroberflaeche != null)
				msgs = ((InternalEObject)newIDAnhangBenutzeroberflaeche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE, null, msgs);
			msgs = basicSetIDAnhangBenutzeroberflaeche(newIDAnhangBenutzeroberflaeche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE, newIDAnhangBenutzeroberflaeche, newIDAnhangBenutzeroberflaeche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Aussenelementansteuerung_TypeClass getIDAussenelementansteuerung() {
		return iDAussenelementansteuerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAussenelementansteuerung(ID_Aussenelementansteuerung_TypeClass newIDAussenelementansteuerung, NotificationChain msgs) {
		ID_Aussenelementansteuerung_TypeClass oldIDAussenelementansteuerung = iDAussenelementansteuerung;
		iDAussenelementansteuerung = newIDAussenelementansteuerung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG, oldIDAussenelementansteuerung, newIDAussenelementansteuerung);
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
	public void setIDAussenelementansteuerung(ID_Aussenelementansteuerung_TypeClass newIDAussenelementansteuerung) {
		if (newIDAussenelementansteuerung != iDAussenelementansteuerung) {
			NotificationChain msgs = null;
			if (iDAussenelementansteuerung != null)
				msgs = ((InternalEObject)iDAussenelementansteuerung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG, null, msgs);
			if (newIDAussenelementansteuerung != null)
				msgs = ((InternalEObject)newIDAussenelementansteuerung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG, null, msgs);
			msgs = basicSetIDAussenelementansteuerung(newIDAussenelementansteuerung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG, newIDAussenelementansteuerung, newIDAussenelementansteuerung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Unterbringung_TypeClass getIDUnterbringung() {
		return iDUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDUnterbringung(ID_Unterbringung_TypeClass newIDUnterbringung, NotificationChain msgs) {
		ID_Unterbringung_TypeClass oldIDUnterbringung = iDUnterbringung;
		iDUnterbringung = newIDUnterbringung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG, oldIDUnterbringung, newIDUnterbringung);
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
	public void setIDUnterbringung(ID_Unterbringung_TypeClass newIDUnterbringung) {
		if (newIDUnterbringung != iDUnterbringung) {
			NotificationChain msgs = null;
			if (iDUnterbringung != null)
				msgs = ((InternalEObject)iDUnterbringung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG, null, msgs);
			if (newIDUnterbringung != null)
				msgs = ((InternalEObject)newIDUnterbringung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG, null, msgs);
			msgs = basicSetIDUnterbringung(newIDUnterbringung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG, newIDUnterbringung, newIDUnterbringung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG:
				return basicSetBedienEinrichtOertlichAllg(null, msgs);
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE:
				return basicSetIDAnhangBenutzeroberflaeche(null, msgs);
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG:
				return basicSetIDAussenelementansteuerung(null, msgs);
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG:
				return basicSetIDUnterbringung(null, msgs);
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
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG:
				return getBedienEinrichtOertlichAllg();
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG:
				return getBezeichnung();
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE:
				return getIDAnhangBenutzeroberflaeche();
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG:
				return getIDAussenelementansteuerung();
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG:
				return getIDUnterbringung();
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
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG:
				setBedienEinrichtOertlichAllg((Bedien_Einricht_Oertlich_Allg_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG:
				setBezeichnung((Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE:
				setIDAnhangBenutzeroberflaeche((ID_Anhang_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG:
				setIDAussenelementansteuerung((ID_Aussenelementansteuerung_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG:
				setBedienEinrichtOertlichAllg((Bedien_Einricht_Oertlich_Allg_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG:
				setBezeichnung((Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE:
				setIDAnhangBenutzeroberflaeche((ID_Anhang_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG:
				setIDAussenelementansteuerung((ID_Aussenelementansteuerung_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_TypeClass)null);
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
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG:
				return bedienEinrichtOertlichAllg != null;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG:
				return bezeichnung != null;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE:
				return iDAnhangBenutzeroberflaeche != null;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG:
				return iDAussenelementansteuerung != null;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG:
				return iDUnterbringung != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_Einrichtung_OertlichImpl
