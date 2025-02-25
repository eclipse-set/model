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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Signale.Richtpunkt_TypeClass;
import org.eclipse.set.model.planpro.Signale.Richtpunktentfernung_TypeClass;
import org.eclipse.set.model.planpro.Signale.Signal_Art_TypeClass;
import org.eclipse.set.model.planpro.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup;
import org.eclipse.set.model.planpro.Signale.SignalePackage;
import org.eclipse.set.model.planpro.Signale.Signalsystem_TypeClass;
import org.eclipse.set.model.planpro.Signale.Streuscheibe_Art_TypeClass;
import org.eclipse.set.model.planpro.Signale.Streuscheibe_Betriebsstellung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Real Aktiv Schirm Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Real_Aktiv_Schirm_AttributeGroupImpl#getRichtpunkt <em>Richtpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Real_Aktiv_Schirm_AttributeGroupImpl#getRichtpunktentfernung <em>Richtpunktentfernung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Real_Aktiv_Schirm_AttributeGroupImpl#getSignalArt <em>Signal Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Real_Aktiv_Schirm_AttributeGroupImpl#getSignalsystem <em>Signalsystem</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Real_Aktiv_Schirm_AttributeGroupImpl#getStreuscheibeArt <em>Streuscheibe Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Real_Aktiv_Schirm_AttributeGroupImpl#getStreuscheibeBetriebsstellung <em>Streuscheibe Betriebsstellung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_Real_Aktiv_Schirm_AttributeGroupImpl extends EObjectImpl implements Signal_Real_Aktiv_Schirm_AttributeGroup {
	/**
	 * The cached value of the '{@link #getRichtpunkt() <em>Richtpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRichtpunkt()
	 * @generated
	 * @ordered
	 */
	protected Richtpunkt_TypeClass richtpunkt;

	/**
	 * The cached value of the '{@link #getRichtpunktentfernung() <em>Richtpunktentfernung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRichtpunktentfernung()
	 * @generated
	 * @ordered
	 */
	protected Richtpunktentfernung_TypeClass richtpunktentfernung;

	/**
	 * The cached value of the '{@link #getSignalArt() <em>Signal Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalArt()
	 * @generated
	 * @ordered
	 */
	protected Signal_Art_TypeClass signalArt;

	/**
	 * The cached value of the '{@link #getSignalsystem() <em>Signalsystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalsystem()
	 * @generated
	 * @ordered
	 */
	protected Signalsystem_TypeClass signalsystem;

	/**
	 * The cached value of the '{@link #getStreuscheibeArt() <em>Streuscheibe Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreuscheibeArt()
	 * @generated
	 * @ordered
	 */
	protected Streuscheibe_Art_TypeClass streuscheibeArt;

	/**
	 * The cached value of the '{@link #getStreuscheibeBetriebsstellung() <em>Streuscheibe Betriebsstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreuscheibeBetriebsstellung()
	 * @generated
	 * @ordered
	 */
	protected Streuscheibe_Betriebsstellung_TypeClass streuscheibeBetriebsstellung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_Real_Aktiv_Schirm_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Richtpunkt_TypeClass getRichtpunkt() {
		return richtpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRichtpunkt(Richtpunkt_TypeClass newRichtpunkt, NotificationChain msgs) {
		Richtpunkt_TypeClass oldRichtpunkt = richtpunkt;
		richtpunkt = newRichtpunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKT, oldRichtpunkt, newRichtpunkt);
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
	public void setRichtpunkt(Richtpunkt_TypeClass newRichtpunkt) {
		if (newRichtpunkt != richtpunkt) {
			NotificationChain msgs = null;
			if (richtpunkt != null)
				msgs = ((InternalEObject)richtpunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKT, null, msgs);
			if (newRichtpunkt != null)
				msgs = ((InternalEObject)newRichtpunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKT, null, msgs);
			msgs = basicSetRichtpunkt(newRichtpunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKT, newRichtpunkt, newRichtpunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Richtpunktentfernung_TypeClass getRichtpunktentfernung() {
		return richtpunktentfernung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRichtpunktentfernung(Richtpunktentfernung_TypeClass newRichtpunktentfernung, NotificationChain msgs) {
		Richtpunktentfernung_TypeClass oldRichtpunktentfernung = richtpunktentfernung;
		richtpunktentfernung = newRichtpunktentfernung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKTENTFERNUNG, oldRichtpunktentfernung, newRichtpunktentfernung);
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
	public void setRichtpunktentfernung(Richtpunktentfernung_TypeClass newRichtpunktentfernung) {
		if (newRichtpunktentfernung != richtpunktentfernung) {
			NotificationChain msgs = null;
			if (richtpunktentfernung != null)
				msgs = ((InternalEObject)richtpunktentfernung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKTENTFERNUNG, null, msgs);
			if (newRichtpunktentfernung != null)
				msgs = ((InternalEObject)newRichtpunktentfernung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKTENTFERNUNG, null, msgs);
			msgs = basicSetRichtpunktentfernung(newRichtpunktentfernung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKTENTFERNUNG, newRichtpunktentfernung, newRichtpunktentfernung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Art_TypeClass getSignalArt() {
		return signalArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalArt(Signal_Art_TypeClass newSignalArt, NotificationChain msgs) {
		Signal_Art_TypeClass oldSignalArt = signalArt;
		signalArt = newSignalArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNAL_ART, oldSignalArt, newSignalArt);
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
	public void setSignalArt(Signal_Art_TypeClass newSignalArt) {
		if (newSignalArt != signalArt) {
			NotificationChain msgs = null;
			if (signalArt != null)
				msgs = ((InternalEObject)signalArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNAL_ART, null, msgs);
			if (newSignalArt != null)
				msgs = ((InternalEObject)newSignalArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNAL_ART, null, msgs);
			msgs = basicSetSignalArt(newSignalArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNAL_ART, newSignalArt, newSignalArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalsystem_TypeClass getSignalsystem() {
		return signalsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalsystem(Signalsystem_TypeClass newSignalsystem, NotificationChain msgs) {
		Signalsystem_TypeClass oldSignalsystem = signalsystem;
		signalsystem = newSignalsystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNALSYSTEM, oldSignalsystem, newSignalsystem);
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
	public void setSignalsystem(Signalsystem_TypeClass newSignalsystem) {
		if (newSignalsystem != signalsystem) {
			NotificationChain msgs = null;
			if (signalsystem != null)
				msgs = ((InternalEObject)signalsystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNALSYSTEM, null, msgs);
			if (newSignalsystem != null)
				msgs = ((InternalEObject)newSignalsystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNALSYSTEM, null, msgs);
			msgs = basicSetSignalsystem(newSignalsystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNALSYSTEM, newSignalsystem, newSignalsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Streuscheibe_Art_TypeClass getStreuscheibeArt() {
		return streuscheibeArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreuscheibeArt(Streuscheibe_Art_TypeClass newStreuscheibeArt, NotificationChain msgs) {
		Streuscheibe_Art_TypeClass oldStreuscheibeArt = streuscheibeArt;
		streuscheibeArt = newStreuscheibeArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_ART, oldStreuscheibeArt, newStreuscheibeArt);
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
	public void setStreuscheibeArt(Streuscheibe_Art_TypeClass newStreuscheibeArt) {
		if (newStreuscheibeArt != streuscheibeArt) {
			NotificationChain msgs = null;
			if (streuscheibeArt != null)
				msgs = ((InternalEObject)streuscheibeArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_ART, null, msgs);
			if (newStreuscheibeArt != null)
				msgs = ((InternalEObject)newStreuscheibeArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_ART, null, msgs);
			msgs = basicSetStreuscheibeArt(newStreuscheibeArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_ART, newStreuscheibeArt, newStreuscheibeArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Streuscheibe_Betriebsstellung_TypeClass getStreuscheibeBetriebsstellung() {
		return streuscheibeBetriebsstellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreuscheibeBetriebsstellung(Streuscheibe_Betriebsstellung_TypeClass newStreuscheibeBetriebsstellung, NotificationChain msgs) {
		Streuscheibe_Betriebsstellung_TypeClass oldStreuscheibeBetriebsstellung = streuscheibeBetriebsstellung;
		streuscheibeBetriebsstellung = newStreuscheibeBetriebsstellung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_BETRIEBSSTELLUNG, oldStreuscheibeBetriebsstellung, newStreuscheibeBetriebsstellung);
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
	public void setStreuscheibeBetriebsstellung(Streuscheibe_Betriebsstellung_TypeClass newStreuscheibeBetriebsstellung) {
		if (newStreuscheibeBetriebsstellung != streuscheibeBetriebsstellung) {
			NotificationChain msgs = null;
			if (streuscheibeBetriebsstellung != null)
				msgs = ((InternalEObject)streuscheibeBetriebsstellung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_BETRIEBSSTELLUNG, null, msgs);
			if (newStreuscheibeBetriebsstellung != null)
				msgs = ((InternalEObject)newStreuscheibeBetriebsstellung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_BETRIEBSSTELLUNG, null, msgs);
			msgs = basicSetStreuscheibeBetriebsstellung(newStreuscheibeBetriebsstellung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_BETRIEBSSTELLUNG, newStreuscheibeBetriebsstellung, newStreuscheibeBetriebsstellung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKT:
				return basicSetRichtpunkt(null, msgs);
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKTENTFERNUNG:
				return basicSetRichtpunktentfernung(null, msgs);
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNAL_ART:
				return basicSetSignalArt(null, msgs);
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNALSYSTEM:
				return basicSetSignalsystem(null, msgs);
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_ART:
				return basicSetStreuscheibeArt(null, msgs);
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_BETRIEBSSTELLUNG:
				return basicSetStreuscheibeBetriebsstellung(null, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKT:
				return getRichtpunkt();
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKTENTFERNUNG:
				return getRichtpunktentfernung();
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNAL_ART:
				return getSignalArt();
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNALSYSTEM:
				return getSignalsystem();
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_ART:
				return getStreuscheibeArt();
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_BETRIEBSSTELLUNG:
				return getStreuscheibeBetriebsstellung();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKT:
				setRichtpunkt((Richtpunkt_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKTENTFERNUNG:
				setRichtpunktentfernung((Richtpunktentfernung_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNAL_ART:
				setSignalArt((Signal_Art_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNALSYSTEM:
				setSignalsystem((Signalsystem_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_ART:
				setStreuscheibeArt((Streuscheibe_Art_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_BETRIEBSSTELLUNG:
				setStreuscheibeBetriebsstellung((Streuscheibe_Betriebsstellung_TypeClass)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKT:
				setRichtpunkt((Richtpunkt_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKTENTFERNUNG:
				setRichtpunktentfernung((Richtpunktentfernung_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNAL_ART:
				setSignalArt((Signal_Art_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNALSYSTEM:
				setSignalsystem((Signalsystem_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_ART:
				setStreuscheibeArt((Streuscheibe_Art_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_BETRIEBSSTELLUNG:
				setStreuscheibeBetriebsstellung((Streuscheibe_Betriebsstellung_TypeClass)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKT:
				return richtpunkt != null;
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__RICHTPUNKTENTFERNUNG:
				return richtpunktentfernung != null;
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNAL_ART:
				return signalArt != null;
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__SIGNALSYSTEM:
				return signalsystem != null;
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_ART:
				return streuscheibeArt != null;
			case SignalePackage.SIGNAL_REAL_AKTIV_SCHIRM_ATTRIBUTE_GROUP__STREUSCHEIBE_BETRIEBSSTELLUNG:
				return streuscheibeBetriebsstellung != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Signal_Real_Aktiv_Schirm_AttributeGroupImpl
