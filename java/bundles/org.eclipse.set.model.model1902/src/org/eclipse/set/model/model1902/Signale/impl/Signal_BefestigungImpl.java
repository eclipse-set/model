/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Signale.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.model.model1902.Signale.Signal_Befestigung;
import org.eclipse.set.model.model1902.Signale.Signal_Befestigung_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Signale.SignalePackage;

import org.eclipse.set.model.model1902.Verweise.ID_Regelzeichnung_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Signal_Befestigung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Befestigung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_BefestigungImpl#getIDRegelzeichnung <em>ID Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_BefestigungImpl#getIDRegelzeichnungVsigTafel <em>ID Regelzeichnung Vsig Tafel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_BefestigungImpl#getIDSignalBefestigung <em>ID Signal Befestigung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_BefestigungImpl#getSignalBefestigungAllg <em>Signal Befestigung Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_BefestigungImpl extends Punkt_ObjektImpl implements Signal_Befestigung {
	/**
	 * The cached value of the '{@link #getIDRegelzeichnung() <em>ID Regelzeichnung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRegelzeichnung()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Regelzeichnung_TypeClass> iDRegelzeichnung;

	/**
	 * The cached value of the '{@link #getIDRegelzeichnungVsigTafel() <em>ID Regelzeichnung Vsig Tafel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRegelzeichnungVsigTafel()
	 * @generated
	 * @ordered
	 */
	protected ID_Regelzeichnung_TypeClass iDRegelzeichnungVsigTafel;

	/**
	 * The cached value of the '{@link #getIDSignalBefestigung() <em>ID Signal Befestigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalBefestigung()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_Befestigung_TypeClass iDSignalBefestigung;

	/**
	 * The cached value of the '{@link #getSignalBefestigungAllg() <em>Signal Befestigung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalBefestigungAllg()
	 * @generated
	 * @ordered
	 */
	protected Signal_Befestigung_Allg_AttributeGroup signalBefestigungAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_BefestigungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_BEFESTIGUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Regelzeichnung_TypeClass> getIDRegelzeichnung() {
		if (iDRegelzeichnung == null) {
			iDRegelzeichnung = new EObjectContainmentEList<ID_Regelzeichnung_TypeClass>(ID_Regelzeichnung_TypeClass.class, this, SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG);
		}
		return iDRegelzeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Regelzeichnung_TypeClass getIDRegelzeichnungVsigTafel() {
		return iDRegelzeichnungVsigTafel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDRegelzeichnungVsigTafel(ID_Regelzeichnung_TypeClass newIDRegelzeichnungVsigTafel, NotificationChain msgs) {
		ID_Regelzeichnung_TypeClass oldIDRegelzeichnungVsigTafel = iDRegelzeichnungVsigTafel;
		iDRegelzeichnungVsigTafel = newIDRegelzeichnungVsigTafel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG_VSIG_TAFEL, oldIDRegelzeichnungVsigTafel, newIDRegelzeichnungVsigTafel);
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
	public void setIDRegelzeichnungVsigTafel(ID_Regelzeichnung_TypeClass newIDRegelzeichnungVsigTafel) {
		if (newIDRegelzeichnungVsigTafel != iDRegelzeichnungVsigTafel) {
			NotificationChain msgs = null;
			if (iDRegelzeichnungVsigTafel != null)
				msgs = ((InternalEObject)iDRegelzeichnungVsigTafel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG_VSIG_TAFEL, null, msgs);
			if (newIDRegelzeichnungVsigTafel != null)
				msgs = ((InternalEObject)newIDRegelzeichnungVsigTafel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG_VSIG_TAFEL, null, msgs);
			msgs = basicSetIDRegelzeichnungVsigTafel(newIDRegelzeichnungVsigTafel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG_VSIG_TAFEL, newIDRegelzeichnungVsigTafel, newIDRegelzeichnungVsigTafel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_Befestigung_TypeClass getIDSignalBefestigung() {
		return iDSignalBefestigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSignalBefestigung(ID_Signal_Befestigung_TypeClass newIDSignalBefestigung, NotificationChain msgs) {
		ID_Signal_Befestigung_TypeClass oldIDSignalBefestigung = iDSignalBefestigung;
		iDSignalBefestigung = newIDSignalBefestigung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG, oldIDSignalBefestigung, newIDSignalBefestigung);
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
	public void setIDSignalBefestigung(ID_Signal_Befestigung_TypeClass newIDSignalBefestigung) {
		if (newIDSignalBefestigung != iDSignalBefestigung) {
			NotificationChain msgs = null;
			if (iDSignalBefestigung != null)
				msgs = ((InternalEObject)iDSignalBefestigung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG, null, msgs);
			if (newIDSignalBefestigung != null)
				msgs = ((InternalEObject)newIDSignalBefestigung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG, null, msgs);
			msgs = basicSetIDSignalBefestigung(newIDSignalBefestigung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG, newIDSignalBefestigung, newIDSignalBefestigung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Befestigung_Allg_AttributeGroup getSignalBefestigungAllg() {
		return signalBefestigungAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalBefestigungAllg(Signal_Befestigung_Allg_AttributeGroup newSignalBefestigungAllg, NotificationChain msgs) {
		Signal_Befestigung_Allg_AttributeGroup oldSignalBefestigungAllg = signalBefestigungAllg;
		signalBefestigungAllg = newSignalBefestigungAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG, oldSignalBefestigungAllg, newSignalBefestigungAllg);
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
	public void setSignalBefestigungAllg(Signal_Befestigung_Allg_AttributeGroup newSignalBefestigungAllg) {
		if (newSignalBefestigungAllg != signalBefestigungAllg) {
			NotificationChain msgs = null;
			if (signalBefestigungAllg != null)
				msgs = ((InternalEObject)signalBefestigungAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG, null, msgs);
			if (newSignalBefestigungAllg != null)
				msgs = ((InternalEObject)newSignalBefestigungAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG, null, msgs);
			msgs = basicSetSignalBefestigungAllg(newSignalBefestigungAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG, newSignalBefestigungAllg, newSignalBefestigungAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG:
				return ((InternalEList<?>)getIDRegelzeichnung()).basicRemove(otherEnd, msgs);
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG_VSIG_TAFEL:
				return basicSetIDRegelzeichnungVsigTafel(null, msgs);
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG:
				return basicSetIDSignalBefestigung(null, msgs);
			case SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG:
				return basicSetSignalBefestigungAllg(null, msgs);
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
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG:
				return getIDRegelzeichnung();
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG_VSIG_TAFEL:
				return getIDRegelzeichnungVsigTafel();
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG:
				return getIDSignalBefestigung();
			case SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG:
				return getSignalBefestigungAllg();
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
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG:
				getIDRegelzeichnung().clear();
				getIDRegelzeichnung().addAll((Collection<? extends ID_Regelzeichnung_TypeClass>)newValue);
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG_VSIG_TAFEL:
				setIDRegelzeichnungVsigTafel((ID_Regelzeichnung_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG:
				setIDSignalBefestigung((ID_Signal_Befestigung_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG:
				setSignalBefestigungAllg((Signal_Befestigung_Allg_AttributeGroup)newValue);
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
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG:
				getIDRegelzeichnung().clear();
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG_VSIG_TAFEL:
				setIDRegelzeichnungVsigTafel((ID_Regelzeichnung_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG:
				setIDSignalBefestigung((ID_Signal_Befestigung_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG:
				setSignalBefestigungAllg((Signal_Befestigung_Allg_AttributeGroup)null);
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
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG:
				return iDRegelzeichnung != null && !iDRegelzeichnung.isEmpty();
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG_VSIG_TAFEL:
				return iDRegelzeichnungVsigTafel != null;
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG:
				return iDSignalBefestigung != null;
			case SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG:
				return signalBefestigungAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //Signal_BefestigungImpl
