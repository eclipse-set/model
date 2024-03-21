/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Signal;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Signal_Signalabstand_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_Signal_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZBS Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZBS_SignalImpl#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZBS_SignalImpl#getZBSSignalSignalabstand <em>ZBS Signal Signalabstand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZBS_SignalImpl extends Basis_ObjektImpl implements ZBS_Signal {
	/**
	 * The cached value of the '{@link #getIDSignal() <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignal()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_ohne_Proxy_TypeClass iDSignal;

	/**
	 * The cached value of the '{@link #getZBSSignalSignalabstand() <em>ZBS Signal Signalabstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZBSSignalSignalabstand()
	 * @generated
	 * @ordered
	 */
	protected ZBS_Signal_Signalabstand_AttributeGroup zBSSignalSignalabstand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZBS_SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZBS_Signal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_ohne_Proxy_TypeClass getIDSignal() {
		return iDSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSignal(ID_Signal_ohne_Proxy_TypeClass newIDSignal, NotificationChain msgs) {
		ID_Signal_ohne_Proxy_TypeClass oldIDSignal = iDSignal;
		iDSignal = newIDSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SIGNAL__ID_SIGNAL, oldIDSignal, newIDSignal);
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
	public void setIDSignal(ID_Signal_ohne_Proxy_TypeClass newIDSignal) {
		if (newIDSignal != iDSignal) {
			NotificationChain msgs = null;
			if (iDSignal != null)
				msgs = ((InternalEObject)iDSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SIGNAL__ID_SIGNAL, null, msgs);
			if (newIDSignal != null)
				msgs = ((InternalEObject)newIDSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SIGNAL__ID_SIGNAL, null, msgs);
			msgs = basicSetIDSignal(newIDSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SIGNAL__ID_SIGNAL, newIDSignal, newIDSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_Signal_Signalabstand_AttributeGroup getZBSSignalSignalabstand() {
		return zBSSignalSignalabstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZBSSignalSignalabstand(ZBS_Signal_Signalabstand_AttributeGroup newZBSSignalSignalabstand, NotificationChain msgs) {
		ZBS_Signal_Signalabstand_AttributeGroup oldZBSSignalSignalabstand = zBSSignalSignalabstand;
		zBSSignalSignalabstand = newZBSSignalSignalabstand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND, oldZBSSignalSignalabstand, newZBSSignalSignalabstand);
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
	public void setZBSSignalSignalabstand(ZBS_Signal_Signalabstand_AttributeGroup newZBSSignalSignalabstand) {
		if (newZBSSignalSignalabstand != zBSSignalSignalabstand) {
			NotificationChain msgs = null;
			if (zBSSignalSignalabstand != null)
				msgs = ((InternalEObject)zBSSignalSignalabstand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND, null, msgs);
			if (newZBSSignalSignalabstand != null)
				msgs = ((InternalEObject)newZBSSignalSignalabstand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND, null, msgs);
			msgs = basicSetZBSSignalSignalabstand(newZBSSignalSignalabstand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND, newZBSSignalSignalabstand, newZBSSignalSignalabstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ID_SIGNAL:
				return basicSetIDSignal(null, msgs);
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND:
				return basicSetZBSSignalSignalabstand(null, msgs);
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
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ID_SIGNAL:
				return getIDSignal();
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND:
				return getZBSSignalSignalabstand();
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
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ID_SIGNAL:
				setIDSignal((ID_Signal_ohne_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND:
				setZBSSignalSignalabstand((ZBS_Signal_Signalabstand_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ID_SIGNAL:
				setIDSignal((ID_Signal_ohne_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND:
				setZBSSignalSignalabstand((ZBS_Signal_Signalabstand_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ID_SIGNAL:
				return iDSignal != null;
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND:
				return zBSSignalSignalabstand != null;
		}
		return super.eIsSet(featureID);
	}

} //ZBS_SignalImpl
