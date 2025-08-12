/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zuglenkung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_Signal_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZL_Signalgruppe_TypeClass;

import org.eclipse.set.model.planpro.Zuglenkung.ZL_Signalgruppe_Zuordnung;
import org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL Signalgruppe Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.impl.ZL_Signalgruppe_ZuordnungImpl#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.impl.ZL_Signalgruppe_ZuordnungImpl#getIDZLSignalgruppe <em>IDZL Signalgruppe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_Signalgruppe_ZuordnungImpl extends Basis_ObjektImpl implements ZL_Signalgruppe_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDSignal() <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignal()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_TypeClass iDSignal;

	/**
	 * The cached value of the '{@link #getIDZLSignalgruppe() <em>IDZL Signalgruppe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLSignalgruppe()
	 * @generated
	 * @ordered
	 */
	protected ID_ZL_Signalgruppe_TypeClass iDZLSignalgruppe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_Signalgruppe_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_SIGNALGRUPPE_ZUORDNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_TypeClass getIDSignal() {
		return iDSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSignal(ID_Signal_TypeClass newIDSignal, NotificationChain msgs) {
		ID_Signal_TypeClass oldIDSignal = iDSignal;
		iDSignal = newIDSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL, oldIDSignal, newIDSignal);
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
	public void setIDSignal(ID_Signal_TypeClass newIDSignal) {
		if (newIDSignal != iDSignal) {
			NotificationChain msgs = null;
			if (iDSignal != null)
				msgs = ((InternalEObject)iDSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL, null, msgs);
			if (newIDSignal != null)
				msgs = ((InternalEObject)newIDSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL, null, msgs);
			msgs = basicSetIDSignal(newIDSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL, newIDSignal, newIDSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZL_Signalgruppe_TypeClass getIDZLSignalgruppe() {
		return iDZLSignalgruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZLSignalgruppe(ID_ZL_Signalgruppe_TypeClass newIDZLSignalgruppe, NotificationChain msgs) {
		ID_ZL_Signalgruppe_TypeClass oldIDZLSignalgruppe = iDZLSignalgruppe;
		iDZLSignalgruppe = newIDZLSignalgruppe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE, oldIDZLSignalgruppe, newIDZLSignalgruppe);
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
	public void setIDZLSignalgruppe(ID_ZL_Signalgruppe_TypeClass newIDZLSignalgruppe) {
		if (newIDZLSignalgruppe != iDZLSignalgruppe) {
			NotificationChain msgs = null;
			if (iDZLSignalgruppe != null)
				msgs = ((InternalEObject)iDZLSignalgruppe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE, null, msgs);
			if (newIDZLSignalgruppe != null)
				msgs = ((InternalEObject)newIDZLSignalgruppe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE, null, msgs);
			msgs = basicSetIDZLSignalgruppe(newIDZLSignalgruppe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE, newIDZLSignalgruppe, newIDZLSignalgruppe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL:
				return basicSetIDSignal(null, msgs);
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE:
				return basicSetIDZLSignalgruppe(null, msgs);
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL:
				return getIDSignal();
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE:
				return getIDZLSignalgruppe();
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL:
				setIDSignal((ID_Signal_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE:
				setIDZLSignalgruppe((ID_ZL_Signalgruppe_TypeClass)newValue);
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL:
				setIDSignal((ID_Signal_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE:
				setIDZLSignalgruppe((ID_ZL_Signalgruppe_TypeClass)null);
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL:
				return iDSignal != null;
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE:
				return iDZLSignalgruppe != null;
		}
		return super.eIsSet(featureID);
	}

} //ZL_Signalgruppe_ZuordnungImpl
