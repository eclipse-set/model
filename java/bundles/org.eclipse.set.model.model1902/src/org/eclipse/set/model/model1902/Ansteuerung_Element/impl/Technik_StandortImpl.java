/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ansteuerung_Element.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.model1902.Ansteuerung_Element.TSO_IP_Adressblock_AttributeGroup;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Technik_Standort;
import org.eclipse.set.model.model1902.Ansteuerung_Element.Technik_Standort_Bezeichnung_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_Bedien_Standort_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technik Standort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.Technik_StandortImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.Technik_StandortImpl#getIDBedienStandort <em>ID Bedien Standort</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.Technik_StandortImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ansteuerung_Element.impl.Technik_StandortImpl#getTSOIPAdressblock <em>TSOIP Adressblock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Technik_StandortImpl extends Basis_ObjektImpl implements Technik_Standort {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Technik_Standort_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDBedienStandort() <em>ID Bedien Standort</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienStandort()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Bedien_Standort_TypeClass> iDBedienStandort;

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
	 * The cached value of the '{@link #getTSOIPAdressblock() <em>TSOIP Adressblock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSOIPAdressblock()
	 * @generated
	 * @ordered
	 */
	protected TSO_IP_Adressblock_AttributeGroup tSOIPAdressblock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Technik_StandortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.TECHNIK_STANDORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technik_Standort_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Technik_Standort_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Technik_Standort_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Technik_Standort_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Bedien_Standort_TypeClass> getIDBedienStandort() {
		if (iDBedienStandort == null) {
			iDBedienStandort = new EObjectContainmentEList<ID_Bedien_Standort_TypeClass>(ID_Bedien_Standort_TypeClass.class, this, Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_BEDIEN_STANDORT);
		}
		return iDBedienStandort;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_UNTERBRINGUNG, oldIDUnterbringung, newIDUnterbringung);
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
				msgs = ((InternalEObject)iDUnterbringung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_UNTERBRINGUNG, null, msgs);
			if (newIDUnterbringung != null)
				msgs = ((InternalEObject)newIDUnterbringung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_UNTERBRINGUNG, null, msgs);
			msgs = basicSetIDUnterbringung(newIDUnterbringung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_UNTERBRINGUNG, newIDUnterbringung, newIDUnterbringung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSO_IP_Adressblock_AttributeGroup getTSOIPAdressblock() {
		return tSOIPAdressblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTSOIPAdressblock(TSO_IP_Adressblock_AttributeGroup newTSOIPAdressblock, NotificationChain msgs) {
		TSO_IP_Adressblock_AttributeGroup oldTSOIPAdressblock = tSOIPAdressblock;
		tSOIPAdressblock = newTSOIPAdressblock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK, oldTSOIPAdressblock, newTSOIPAdressblock);
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
	public void setTSOIPAdressblock(TSO_IP_Adressblock_AttributeGroup newTSOIPAdressblock) {
		if (newTSOIPAdressblock != tSOIPAdressblock) {
			NotificationChain msgs = null;
			if (tSOIPAdressblock != null)
				msgs = ((InternalEObject)tSOIPAdressblock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK, null, msgs);
			if (newTSOIPAdressblock != null)
				msgs = ((InternalEObject)newTSOIPAdressblock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK, null, msgs);
			msgs = basicSetTSOIPAdressblock(newTSOIPAdressblock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK, newTSOIPAdressblock, newTSOIPAdressblock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_BEDIEN_STANDORT:
				return ((InternalEList<?>)getIDBedienStandort()).basicRemove(otherEnd, msgs);
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_UNTERBRINGUNG:
				return basicSetIDUnterbringung(null, msgs);
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK:
				return basicSetTSOIPAdressblock(null, msgs);
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
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG:
				return getBezeichnung();
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_BEDIEN_STANDORT:
				return getIDBedienStandort();
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_UNTERBRINGUNG:
				return getIDUnterbringung();
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK:
				return getTSOIPAdressblock();
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
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG:
				setBezeichnung((Technik_Standort_Bezeichnung_AttributeGroup)newValue);
				return;
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_BEDIEN_STANDORT:
				getIDBedienStandort().clear();
				getIDBedienStandort().addAll((Collection<? extends ID_Bedien_Standort_TypeClass>)newValue);
				return;
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK:
				setTSOIPAdressblock((TSO_IP_Adressblock_AttributeGroup)newValue);
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
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG:
				setBezeichnung((Technik_Standort_Bezeichnung_AttributeGroup)null);
				return;
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_BEDIEN_STANDORT:
				getIDBedienStandort().clear();
				return;
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK:
				setTSOIPAdressblock((TSO_IP_Adressblock_AttributeGroup)null);
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
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG:
				return bezeichnung != null;
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_BEDIEN_STANDORT:
				return iDBedienStandort != null && !iDBedienStandort.isEmpty();
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_UNTERBRINGUNG:
				return iDUnterbringung != null;
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK:
				return tSOIPAdressblock != null;
		}
		return super.eIsSet(featureID);
	}

} //Technik_StandortImpl
