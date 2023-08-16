/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.PZB.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.PZB.PZBPackage;
import org.eclipse.set.model.model11001.PZB.PZB_Zuordnung_Signal;

import org.eclipse.set.model.model11001.Verweise.ID_PZB_Element_Zuordnung_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PZB Zuordnung Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Zuordnung_SignalImpl#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Zuordnung_SignalImpl#getIDSignal <em>ID Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PZB_Zuordnung_SignalImpl extends Basis_ObjektImpl implements PZB_Zuordnung_Signal {
	/**
	 * The cached value of the '{@link #getIDPZBElementZuordnung() <em>IDPZB Element Zuordnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDPZBElementZuordnung()
	 * @generated
	 * @ordered
	 */
	protected ID_PZB_Element_Zuordnung_TypeClass iDPZBElementZuordnung;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Zuordnung_SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PZBPackage.Literals.PZB_ZUORDNUNG_SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_PZB_Element_Zuordnung_TypeClass getIDPZBElementZuordnung() {
		return iDPZBElementZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDPZBElementZuordnung(ID_PZB_Element_Zuordnung_TypeClass newIDPZBElementZuordnung, NotificationChain msgs) {
		ID_PZB_Element_Zuordnung_TypeClass oldIDPZBElementZuordnung = iDPZBElementZuordnung;
		iDPZBElementZuordnung = newIDPZBElementZuordnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG, oldIDPZBElementZuordnung, newIDPZBElementZuordnung);
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
	public void setIDPZBElementZuordnung(ID_PZB_Element_Zuordnung_TypeClass newIDPZBElementZuordnung) {
		if (newIDPZBElementZuordnung != iDPZBElementZuordnung) {
			NotificationChain msgs = null;
			if (iDPZBElementZuordnung != null)
				msgs = ((InternalEObject)iDPZBElementZuordnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG, null, msgs);
			if (newIDPZBElementZuordnung != null)
				msgs = ((InternalEObject)newIDPZBElementZuordnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG, null, msgs);
			msgs = basicSetIDPZBElementZuordnung(newIDPZBElementZuordnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG, newIDPZBElementZuordnung, newIDPZBElementZuordnung));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL, oldIDSignal, newIDSignal);
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
				msgs = ((InternalEObject)iDSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL, null, msgs);
			if (newIDSignal != null)
				msgs = ((InternalEObject)newIDSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL, null, msgs);
			msgs = basicSetIDSignal(newIDSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL, newIDSignal, newIDSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG:
				return basicSetIDPZBElementZuordnung(null, msgs);
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL:
				return basicSetIDSignal(null, msgs);
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
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG:
				return getIDPZBElementZuordnung();
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL:
				return getIDSignal();
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
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG:
				setIDPZBElementZuordnung((ID_PZB_Element_Zuordnung_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL:
				setIDSignal((ID_Signal_TypeClass)newValue);
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
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG:
				setIDPZBElementZuordnung((ID_PZB_Element_Zuordnung_TypeClass)null);
				return;
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL:
				setIDSignal((ID_Signal_TypeClass)null);
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
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG:
				return iDPZBElementZuordnung != null;
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL:
				return iDSignal != null;
		}
		return super.eIsSet(featureID);
	}

} //PZB_Zuordnung_SignalImpl
