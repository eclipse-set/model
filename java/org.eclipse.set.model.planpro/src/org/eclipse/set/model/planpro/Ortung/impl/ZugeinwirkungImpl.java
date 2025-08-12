/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ortung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.model.planpro.Ortung.OrtungPackage;
import org.eclipse.set.model.planpro.Ortung.Zugeinwirkung;
import org.eclipse.set.model.planpro.Ortung.Zugeinwirkung_Allg_AttributeGroup;

import org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zugeinwirkung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.ZugeinwirkungImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.ZugeinwirkungImpl#getIDBezugspunkt <em>ID Bezugspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.ZugeinwirkungImpl#getZugeinwirkungAllg <em>Zugeinwirkung Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZugeinwirkungImpl extends Punkt_ObjektImpl implements Zugeinwirkung {
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
	 * The cached value of the '{@link #getIDBezugspunkt() <em>ID Bezugspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBezugspunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_Markanter_Punkt_TypeClass iDBezugspunkt;

	/**
	 * The cached value of the '{@link #getZugeinwirkungAllg() <em>Zugeinwirkung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZugeinwirkungAllg()
	 * @generated
	 * @ordered
	 */
	protected Zugeinwirkung_Allg_AttributeGroup zugeinwirkungAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZugeinwirkungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrtungPackage.Literals.ZUGEINWIRKUNG;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.ZUGEINWIRKUNG__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.ZUGEINWIRKUNG__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.ZUGEINWIRKUNG__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.ZUGEINWIRKUNG__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Markanter_Punkt_TypeClass getIDBezugspunkt() {
		return iDBezugspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBezugspunkt(ID_Markanter_Punkt_TypeClass newIDBezugspunkt, NotificationChain msgs) {
		ID_Markanter_Punkt_TypeClass oldIDBezugspunkt = iDBezugspunkt;
		iDBezugspunkt = newIDBezugspunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.ZUGEINWIRKUNG__ID_BEZUGSPUNKT, oldIDBezugspunkt, newIDBezugspunkt);
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
	public void setIDBezugspunkt(ID_Markanter_Punkt_TypeClass newIDBezugspunkt) {
		if (newIDBezugspunkt != iDBezugspunkt) {
			NotificationChain msgs = null;
			if (iDBezugspunkt != null)
				msgs = ((InternalEObject)iDBezugspunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.ZUGEINWIRKUNG__ID_BEZUGSPUNKT, null, msgs);
			if (newIDBezugspunkt != null)
				msgs = ((InternalEObject)newIDBezugspunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.ZUGEINWIRKUNG__ID_BEZUGSPUNKT, null, msgs);
			msgs = basicSetIDBezugspunkt(newIDBezugspunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.ZUGEINWIRKUNG__ID_BEZUGSPUNKT, newIDBezugspunkt, newIDBezugspunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zugeinwirkung_Allg_AttributeGroup getZugeinwirkungAllg() {
		return zugeinwirkungAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZugeinwirkungAllg(Zugeinwirkung_Allg_AttributeGroup newZugeinwirkungAllg, NotificationChain msgs) {
		Zugeinwirkung_Allg_AttributeGroup oldZugeinwirkungAllg = zugeinwirkungAllg;
		zugeinwirkungAllg = newZugeinwirkungAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.ZUGEINWIRKUNG__ZUGEINWIRKUNG_ALLG, oldZugeinwirkungAllg, newZugeinwirkungAllg);
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
	public void setZugeinwirkungAllg(Zugeinwirkung_Allg_AttributeGroup newZugeinwirkungAllg) {
		if (newZugeinwirkungAllg != zugeinwirkungAllg) {
			NotificationChain msgs = null;
			if (zugeinwirkungAllg != null)
				msgs = ((InternalEObject)zugeinwirkungAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.ZUGEINWIRKUNG__ZUGEINWIRKUNG_ALLG, null, msgs);
			if (newZugeinwirkungAllg != null)
				msgs = ((InternalEObject)newZugeinwirkungAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.ZUGEINWIRKUNG__ZUGEINWIRKUNG_ALLG, null, msgs);
			msgs = basicSetZugeinwirkungAllg(newZugeinwirkungAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.ZUGEINWIRKUNG__ZUGEINWIRKUNG_ALLG, newZugeinwirkungAllg, newZugeinwirkungAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrtungPackage.ZUGEINWIRKUNG__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case OrtungPackage.ZUGEINWIRKUNG__ID_BEZUGSPUNKT:
				return basicSetIDBezugspunkt(null, msgs);
			case OrtungPackage.ZUGEINWIRKUNG__ZUGEINWIRKUNG_ALLG:
				return basicSetZugeinwirkungAllg(null, msgs);
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
			case OrtungPackage.ZUGEINWIRKUNG__BEZEICHNUNG:
				return getBezeichnung();
			case OrtungPackage.ZUGEINWIRKUNG__ID_BEZUGSPUNKT:
				return getIDBezugspunkt();
			case OrtungPackage.ZUGEINWIRKUNG__ZUGEINWIRKUNG_ALLG:
				return getZugeinwirkungAllg();
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
			case OrtungPackage.ZUGEINWIRKUNG__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)newValue);
				return;
			case OrtungPackage.ZUGEINWIRKUNG__ID_BEZUGSPUNKT:
				setIDBezugspunkt((ID_Markanter_Punkt_TypeClass)newValue);
				return;
			case OrtungPackage.ZUGEINWIRKUNG__ZUGEINWIRKUNG_ALLG:
				setZugeinwirkungAllg((Zugeinwirkung_Allg_AttributeGroup)newValue);
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
			case OrtungPackage.ZUGEINWIRKUNG__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)null);
				return;
			case OrtungPackage.ZUGEINWIRKUNG__ID_BEZUGSPUNKT:
				setIDBezugspunkt((ID_Markanter_Punkt_TypeClass)null);
				return;
			case OrtungPackage.ZUGEINWIRKUNG__ZUGEINWIRKUNG_ALLG:
				setZugeinwirkungAllg((Zugeinwirkung_Allg_AttributeGroup)null);
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
			case OrtungPackage.ZUGEINWIRKUNG__BEZEICHNUNG:
				return bezeichnung != null;
			case OrtungPackage.ZUGEINWIRKUNG__ID_BEZUGSPUNKT:
				return iDBezugspunkt != null;
			case OrtungPackage.ZUGEINWIRKUNG__ZUGEINWIRKUNG_ALLG:
				return zugeinwirkungAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //ZugeinwirkungImpl
