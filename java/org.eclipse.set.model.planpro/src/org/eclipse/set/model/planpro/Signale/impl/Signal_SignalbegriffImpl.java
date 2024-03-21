/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass;

import org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff;
import org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Signale.SignalePackage;

import org.eclipse.set.model.planpro.Verweise.ID_Signal_Rahmen_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Signalbegriff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_SignalbegriffImpl#getIDSignalRahmen <em>ID Signal Rahmen</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_SignalbegriffImpl#getSignalSignalbegriffAllg <em>Signal Signalbegriff Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_SignalbegriffImpl#getSignalbegriffID <em>Signalbegriff ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_SignalbegriffImpl extends Basis_ObjektImpl implements Signal_Signalbegriff {
	/**
	 * The cached value of the '{@link #getIDSignalRahmen() <em>ID Signal Rahmen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalRahmen()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_Rahmen_TypeClass iDSignalRahmen;

	/**
	 * The cached value of the '{@link #getSignalSignalbegriffAllg() <em>Signal Signalbegriff Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalSignalbegriffAllg()
	 * @generated
	 * @ordered
	 */
	protected Signal_Signalbegriff_Allg_AttributeGroup signalSignalbegriffAllg;

	/**
	 * The cached value of the '{@link #getSignalbegriffID() <em>Signalbegriff ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalbegriffID()
	 * @generated
	 * @ordered
	 */
	protected Signalbegriff_ID_TypeClass signalbegriffID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_SignalbegriffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_Rahmen_TypeClass getIDSignalRahmen() {
		return iDSignalRahmen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSignalRahmen(ID_Signal_Rahmen_TypeClass newIDSignalRahmen, NotificationChain msgs) {
		ID_Signal_Rahmen_TypeClass oldIDSignalRahmen = iDSignalRahmen;
		iDSignalRahmen = newIDSignalRahmen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN, oldIDSignalRahmen, newIDSignalRahmen);
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
	public void setIDSignalRahmen(ID_Signal_Rahmen_TypeClass newIDSignalRahmen) {
		if (newIDSignalRahmen != iDSignalRahmen) {
			NotificationChain msgs = null;
			if (iDSignalRahmen != null)
				msgs = ((InternalEObject)iDSignalRahmen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN, null, msgs);
			if (newIDSignalRahmen != null)
				msgs = ((InternalEObject)newIDSignalRahmen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN, null, msgs);
			msgs = basicSetIDSignalRahmen(newIDSignalRahmen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN, newIDSignalRahmen, newIDSignalRahmen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Signalbegriff_Allg_AttributeGroup getSignalSignalbegriffAllg() {
		return signalSignalbegriffAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalSignalbegriffAllg(Signal_Signalbegriff_Allg_AttributeGroup newSignalSignalbegriffAllg, NotificationChain msgs) {
		Signal_Signalbegriff_Allg_AttributeGroup oldSignalSignalbegriffAllg = signalSignalbegriffAllg;
		signalSignalbegriffAllg = newSignalSignalbegriffAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG, oldSignalSignalbegriffAllg, newSignalSignalbegriffAllg);
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
	public void setSignalSignalbegriffAllg(Signal_Signalbegriff_Allg_AttributeGroup newSignalSignalbegriffAllg) {
		if (newSignalSignalbegriffAllg != signalSignalbegriffAllg) {
			NotificationChain msgs = null;
			if (signalSignalbegriffAllg != null)
				msgs = ((InternalEObject)signalSignalbegriffAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG, null, msgs);
			if (newSignalSignalbegriffAllg != null)
				msgs = ((InternalEObject)newSignalSignalbegriffAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG, null, msgs);
			msgs = basicSetSignalSignalbegriffAllg(newSignalSignalbegriffAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG, newSignalSignalbegriffAllg, newSignalSignalbegriffAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalbegriff_ID_TypeClass getSignalbegriffID() {
		return signalbegriffID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalbegriffID(Signalbegriff_ID_TypeClass newSignalbegriffID, NotificationChain msgs) {
		Signalbegriff_ID_TypeClass oldSignalbegriffID = signalbegriffID;
		signalbegriffID = newSignalbegriffID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID, oldSignalbegriffID, newSignalbegriffID);
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
	public void setSignalbegriffID(Signalbegriff_ID_TypeClass newSignalbegriffID) {
		if (newSignalbegriffID != signalbegriffID) {
			NotificationChain msgs = null;
			if (signalbegriffID != null)
				msgs = ((InternalEObject)signalbegriffID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID, null, msgs);
			if (newSignalbegriffID != null)
				msgs = ((InternalEObject)newSignalbegriffID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID, null, msgs);
			msgs = basicSetSignalbegriffID(newSignalbegriffID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID, newSignalbegriffID, newSignalbegriffID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN:
				return basicSetIDSignalRahmen(null, msgs);
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG:
				return basicSetSignalSignalbegriffAllg(null, msgs);
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID:
				return basicSetSignalbegriffID(null, msgs);
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
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN:
				return getIDSignalRahmen();
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG:
				return getSignalSignalbegriffAllg();
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID:
				return getSignalbegriffID();
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
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN:
				setIDSignalRahmen((ID_Signal_Rahmen_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG:
				setSignalSignalbegriffAllg((Signal_Signalbegriff_Allg_AttributeGroup)newValue);
				return;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID:
				setSignalbegriffID((Signalbegriff_ID_TypeClass)newValue);
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
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN:
				setIDSignalRahmen((ID_Signal_Rahmen_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG:
				setSignalSignalbegriffAllg((Signal_Signalbegriff_Allg_AttributeGroup)null);
				return;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID:
				setSignalbegriffID((Signalbegriff_ID_TypeClass)null);
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
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN:
				return iDSignalRahmen != null;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG:
				return signalSignalbegriffAllg != null;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID:
				return signalbegriffID != null;
		}
		return super.eIsSet(featureID);
	}

} //Signal_SignalbegriffImpl
