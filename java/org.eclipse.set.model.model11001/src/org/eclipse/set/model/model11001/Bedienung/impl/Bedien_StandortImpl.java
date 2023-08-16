/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Bedienung.BSO_IP_Adressblock_AttributeGroup;
import org.eclipse.set.model.model11001.Bedienung.Bedien_Standort;
import org.eclipse.set.model.model11001.Bedienung.Bedien_Standort_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Bedienung.BedienungPackage;

import org.eclipse.set.model.model11001.Verweise.ID_Unterbringung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Standort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.impl.Bedien_StandortImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.impl.Bedien_StandortImpl#getBSOIPAdressblock <em>BSOIP Adressblock</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.impl.Bedien_StandortImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_StandortImpl extends Basis_ObjektImpl implements Bedien_Standort {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Standort_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getBSOIPAdressblock() <em>BSOIP Adressblock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBSOIPAdressblock()
	 * @generated
	 * @ordered
	 */
	protected BSO_IP_Adressblock_AttributeGroup bSOIPAdressblock;

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
	protected Bedien_StandortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_STANDORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Standort_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bedien_Standort_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bedien_Standort_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_STANDORT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bedien_Standort_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_STANDORT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_STANDORT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_STANDORT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BSO_IP_Adressblock_AttributeGroup getBSOIPAdressblock() {
		return bSOIPAdressblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBSOIPAdressblock(BSO_IP_Adressblock_AttributeGroup newBSOIPAdressblock, NotificationChain msgs) {
		BSO_IP_Adressblock_AttributeGroup oldBSOIPAdressblock = bSOIPAdressblock;
		bSOIPAdressblock = newBSOIPAdressblock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_STANDORT__BSOIP_ADRESSBLOCK, oldBSOIPAdressblock, newBSOIPAdressblock);
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
	public void setBSOIPAdressblock(BSO_IP_Adressblock_AttributeGroup newBSOIPAdressblock) {
		if (newBSOIPAdressblock != bSOIPAdressblock) {
			NotificationChain msgs = null;
			if (bSOIPAdressblock != null)
				msgs = ((InternalEObject)bSOIPAdressblock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_STANDORT__BSOIP_ADRESSBLOCK, null, msgs);
			if (newBSOIPAdressblock != null)
				msgs = ((InternalEObject)newBSOIPAdressblock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_STANDORT__BSOIP_ADRESSBLOCK, null, msgs);
			msgs = basicSetBSOIPAdressblock(newBSOIPAdressblock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_STANDORT__BSOIP_ADRESSBLOCK, newBSOIPAdressblock, newBSOIPAdressblock));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_STANDORT__ID_UNTERBRINGUNG, oldIDUnterbringung, newIDUnterbringung);
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
				msgs = ((InternalEObject)iDUnterbringung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_STANDORT__ID_UNTERBRINGUNG, null, msgs);
			if (newIDUnterbringung != null)
				msgs = ((InternalEObject)newIDUnterbringung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_STANDORT__ID_UNTERBRINGUNG, null, msgs);
			msgs = basicSetIDUnterbringung(newIDUnterbringung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_STANDORT__ID_UNTERBRINGUNG, newIDUnterbringung, newIDUnterbringung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_STANDORT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case BedienungPackage.BEDIEN_STANDORT__BSOIP_ADRESSBLOCK:
				return basicSetBSOIPAdressblock(null, msgs);
			case BedienungPackage.BEDIEN_STANDORT__ID_UNTERBRINGUNG:
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
			case BedienungPackage.BEDIEN_STANDORT__BEZEICHNUNG:
				return getBezeichnung();
			case BedienungPackage.BEDIEN_STANDORT__BSOIP_ADRESSBLOCK:
				return getBSOIPAdressblock();
			case BedienungPackage.BEDIEN_STANDORT__ID_UNTERBRINGUNG:
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
			case BedienungPackage.BEDIEN_STANDORT__BEZEICHNUNG:
				setBezeichnung((Bedien_Standort_Bezeichnung_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_STANDORT__BSOIP_ADRESSBLOCK:
				setBSOIPAdressblock((BSO_IP_Adressblock_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_STANDORT__ID_UNTERBRINGUNG:
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
			case BedienungPackage.BEDIEN_STANDORT__BEZEICHNUNG:
				setBezeichnung((Bedien_Standort_Bezeichnung_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_STANDORT__BSOIP_ADRESSBLOCK:
				setBSOIPAdressblock((BSO_IP_Adressblock_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_STANDORT__ID_UNTERBRINGUNG:
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
			case BedienungPackage.BEDIEN_STANDORT__BEZEICHNUNG:
				return bezeichnung != null;
			case BedienungPackage.BEDIEN_STANDORT__BSOIP_ADRESSBLOCK:
				return bSOIPAdressblock != null;
			case BedienungPackage.BEDIEN_STANDORT__ID_UNTERBRINGUNG:
				return iDUnterbringung != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_StandortImpl
