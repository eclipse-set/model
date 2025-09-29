/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit;
import org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit_Kennzahlen_AttributeGroup;
import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;

import org.eclipse.set.model.planpro.Verweise.ID_Bedien_Bezirk_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Oertlichkeit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_OertlichkeitImpl#getBedienOertlichkeitKennzahlen <em>Bedien Oertlichkeit Kennzahlen</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_OertlichkeitImpl#getIDBedienBezirk <em>ID Bedien Bezirk</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_OertlichkeitImpl#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_OertlichkeitImpl extends Basis_ObjektImpl implements Bedien_Oertlichkeit {
	/**
	 * The cached value of the '{@link #getBedienOertlichkeitKennzahlen() <em>Bedien Oertlichkeit Kennzahlen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienOertlichkeitKennzahlen()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Oertlichkeit_Kennzahlen_AttributeGroup bedienOertlichkeitKennzahlen;

	/**
	 * The cached value of the '{@link #getIDBedienBezirk() <em>ID Bedien Bezirk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienBezirk()
	 * @generated
	 * @ordered
	 */
	protected ID_Bedien_Bezirk_TypeClass iDBedienBezirk;

	/**
	 * The cached value of the '{@link #getIDOertlichkeit() <em>ID Oertlichkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeit()
	 * @generated
	 * @ordered
	 */
	protected ID_Oertlichkeit_Proxy_TypeClass iDOertlichkeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_OertlichkeitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_OERTLICHKEIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Oertlichkeit_Kennzahlen_AttributeGroup getBedienOertlichkeitKennzahlen() {
		return bedienOertlichkeitKennzahlen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienOertlichkeitKennzahlen(Bedien_Oertlichkeit_Kennzahlen_AttributeGroup newBedienOertlichkeitKennzahlen, NotificationChain msgs) {
		Bedien_Oertlichkeit_Kennzahlen_AttributeGroup oldBedienOertlichkeitKennzahlen = bedienOertlichkeitKennzahlen;
		bedienOertlichkeitKennzahlen = newBedienOertlichkeitKennzahlen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN, oldBedienOertlichkeitKennzahlen, newBedienOertlichkeitKennzahlen);
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
	public void setBedienOertlichkeitKennzahlen(Bedien_Oertlichkeit_Kennzahlen_AttributeGroup newBedienOertlichkeitKennzahlen) {
		if (newBedienOertlichkeitKennzahlen != bedienOertlichkeitKennzahlen) {
			NotificationChain msgs = null;
			if (bedienOertlichkeitKennzahlen != null)
				msgs = ((InternalEObject)bedienOertlichkeitKennzahlen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN, null, msgs);
			if (newBedienOertlichkeitKennzahlen != null)
				msgs = ((InternalEObject)newBedienOertlichkeitKennzahlen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN, null, msgs);
			msgs = basicSetBedienOertlichkeitKennzahlen(newBedienOertlichkeitKennzahlen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN, newBedienOertlichkeitKennzahlen, newBedienOertlichkeitKennzahlen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bedien_Bezirk_TypeClass getIDBedienBezirk() {
		return iDBedienBezirk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBedienBezirk(ID_Bedien_Bezirk_TypeClass newIDBedienBezirk, NotificationChain msgs) {
		ID_Bedien_Bezirk_TypeClass oldIDBedienBezirk = iDBedienBezirk;
		iDBedienBezirk = newIDBedienBezirk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK, oldIDBedienBezirk, newIDBedienBezirk);
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
	public void setIDBedienBezirk(ID_Bedien_Bezirk_TypeClass newIDBedienBezirk) {
		if (newIDBedienBezirk != iDBedienBezirk) {
			NotificationChain msgs = null;
			if (iDBedienBezirk != null)
				msgs = ((InternalEObject)iDBedienBezirk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK, null, msgs);
			if (newIDBedienBezirk != null)
				msgs = ((InternalEObject)newIDBedienBezirk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK, null, msgs);
			msgs = basicSetIDBedienBezirk(newIDBedienBezirk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK, newIDBedienBezirk, newIDBedienBezirk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Oertlichkeit_Proxy_TypeClass getIDOertlichkeit() {
		return iDOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDOertlichkeit(ID_Oertlichkeit_Proxy_TypeClass newIDOertlichkeit, NotificationChain msgs) {
		ID_Oertlichkeit_Proxy_TypeClass oldIDOertlichkeit = iDOertlichkeit;
		iDOertlichkeit = newIDOertlichkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT, oldIDOertlichkeit, newIDOertlichkeit);
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
	public void setIDOertlichkeit(ID_Oertlichkeit_Proxy_TypeClass newIDOertlichkeit) {
		if (newIDOertlichkeit != iDOertlichkeit) {
			NotificationChain msgs = null;
			if (iDOertlichkeit != null)
				msgs = ((InternalEObject)iDOertlichkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT, null, msgs);
			if (newIDOertlichkeit != null)
				msgs = ((InternalEObject)newIDOertlichkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT, null, msgs);
			msgs = basicSetIDOertlichkeit(newIDOertlichkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT, newIDOertlichkeit, newIDOertlichkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN:
				return basicSetBedienOertlichkeitKennzahlen(null, msgs);
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK:
				return basicSetIDBedienBezirk(null, msgs);
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT:
				return basicSetIDOertlichkeit(null, msgs);
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
			case BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN:
				return getBedienOertlichkeitKennzahlen();
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK:
				return getIDBedienBezirk();
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT:
				return getIDOertlichkeit();
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
			case BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN:
				setBedienOertlichkeitKennzahlen((Bedien_Oertlichkeit_Kennzahlen_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK:
				setIDBedienBezirk((ID_Bedien_Bezirk_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT:
				setIDOertlichkeit((ID_Oertlichkeit_Proxy_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN:
				setBedienOertlichkeitKennzahlen((Bedien_Oertlichkeit_Kennzahlen_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK:
				setIDBedienBezirk((ID_Bedien_Bezirk_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT:
				setIDOertlichkeit((ID_Oertlichkeit_Proxy_TypeClass)null);
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
			case BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN:
				return bedienOertlichkeitKennzahlen != null;
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK:
				return iDBedienBezirk != null;
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT:
				return iDOertlichkeit != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_OertlichkeitImpl
