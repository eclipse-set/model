/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Signale.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Signale.Rahmen_Art_TypeClass;
import org.eclipse.set.model.model1902.Signale.Signal_Rahmen;
import org.eclipse.set.model.model1902.Signale.SignalePackage;

import org.eclipse.set.model.model1902.Verweise.ID_Signal_Befestigung_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Rahmen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_RahmenImpl#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_RahmenImpl#getIDSignalBefestigung <em>ID Signal Befestigung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_RahmenImpl#getIDSignalNachordnung <em>ID Signal Nachordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_RahmenImpl#getRahmenArt <em>Rahmen Art</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_RahmenImpl extends Basis_ObjektImpl implements Signal_Rahmen {
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
	 * The cached value of the '{@link #getIDSignalBefestigung() <em>ID Signal Befestigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalBefestigung()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_Befestigung_TypeClass iDSignalBefestigung;

	/**
	 * The cached value of the '{@link #getIDSignalNachordnung() <em>ID Signal Nachordnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalNachordnung()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_TypeClass iDSignalNachordnung;

	/**
	 * The cached value of the '{@link #getRahmenArt() <em>Rahmen Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRahmenArt()
	 * @generated
	 * @ordered
	 */
	protected Rahmen_Art_TypeClass rahmenArt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_RahmenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_RAHMEN;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL, oldIDSignal, newIDSignal);
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
				msgs = ((InternalEObject)iDSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL, null, msgs);
			if (newIDSignal != null)
				msgs = ((InternalEObject)newIDSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL, null, msgs);
			msgs = basicSetIDSignal(newIDSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL, newIDSignal, newIDSignal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG, oldIDSignalBefestigung, newIDSignalBefestigung);
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
				msgs = ((InternalEObject)iDSignalBefestigung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG, null, msgs);
			if (newIDSignalBefestigung != null)
				msgs = ((InternalEObject)newIDSignalBefestigung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG, null, msgs);
			msgs = basicSetIDSignalBefestigung(newIDSignalBefestigung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG, newIDSignalBefestigung, newIDSignalBefestigung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_TypeClass getIDSignalNachordnung() {
		return iDSignalNachordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSignalNachordnung(ID_Signal_TypeClass newIDSignalNachordnung, NotificationChain msgs) {
		ID_Signal_TypeClass oldIDSignalNachordnung = iDSignalNachordnung;
		iDSignalNachordnung = newIDSignalNachordnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG, oldIDSignalNachordnung, newIDSignalNachordnung);
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
	public void setIDSignalNachordnung(ID_Signal_TypeClass newIDSignalNachordnung) {
		if (newIDSignalNachordnung != iDSignalNachordnung) {
			NotificationChain msgs = null;
			if (iDSignalNachordnung != null)
				msgs = ((InternalEObject)iDSignalNachordnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG, null, msgs);
			if (newIDSignalNachordnung != null)
				msgs = ((InternalEObject)newIDSignalNachordnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG, null, msgs);
			msgs = basicSetIDSignalNachordnung(newIDSignalNachordnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG, newIDSignalNachordnung, newIDSignalNachordnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rahmen_Art_TypeClass getRahmenArt() {
		return rahmenArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRahmenArt(Rahmen_Art_TypeClass newRahmenArt, NotificationChain msgs) {
		Rahmen_Art_TypeClass oldRahmenArt = rahmenArt;
		rahmenArt = newRahmenArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART, oldRahmenArt, newRahmenArt);
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
	public void setRahmenArt(Rahmen_Art_TypeClass newRahmenArt) {
		if (newRahmenArt != rahmenArt) {
			NotificationChain msgs = null;
			if (rahmenArt != null)
				msgs = ((InternalEObject)rahmenArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART, null, msgs);
			if (newRahmenArt != null)
				msgs = ((InternalEObject)newRahmenArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART, null, msgs);
			msgs = basicSetRahmenArt(newRahmenArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART, newRahmenArt, newRahmenArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL:
				return basicSetIDSignal(null, msgs);
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG:
				return basicSetIDSignalBefestigung(null, msgs);
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG:
				return basicSetIDSignalNachordnung(null, msgs);
			case SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART:
				return basicSetRahmenArt(null, msgs);
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
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL:
				return getIDSignal();
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG:
				return getIDSignalBefestigung();
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG:
				return getIDSignalNachordnung();
			case SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART:
				return getRahmenArt();
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
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL:
				setIDSignal((ID_Signal_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG:
				setIDSignalBefestigung((ID_Signal_Befestigung_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG:
				setIDSignalNachordnung((ID_Signal_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART:
				setRahmenArt((Rahmen_Art_TypeClass)newValue);
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
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL:
				setIDSignal((ID_Signal_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG:
				setIDSignalBefestigung((ID_Signal_Befestigung_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG:
				setIDSignalNachordnung((ID_Signal_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART:
				setRahmenArt((Rahmen_Art_TypeClass)null);
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
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL:
				return iDSignal != null;
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG:
				return iDSignalBefestigung != null;
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG:
				return iDSignalNachordnung != null;
			case SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART:
				return rahmenArt != null;
		}
		return super.eIsSet(featureID);
	}

} //Signal_RahmenImpl
