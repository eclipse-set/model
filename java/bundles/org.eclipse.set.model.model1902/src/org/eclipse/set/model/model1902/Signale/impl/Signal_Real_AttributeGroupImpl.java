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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Signale.Geltungsbereich_TypeClass;
import org.eclipse.set.model.model1902.Signale.Signal_Befestigungsart_TypeClass;
import org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup;
import org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup;
import org.eclipse.set.model.model1902.Signale.Signal_Real_AttributeGroup;
import org.eclipse.set.model.model1902.Signale.SignalePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Real Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Real_AttributeGroupImpl#getGeltungsbereich <em>Geltungsbereich</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Real_AttributeGroupImpl#getSignalBefestigungsart <em>Signal Befestigungsart</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Real_AttributeGroupImpl#getSignalRealAktiv <em>Signal Real Aktiv</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Real_AttributeGroupImpl#getSignalRealAktivSchirm <em>Signal Real Aktiv Schirm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_Real_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Signal_Real_AttributeGroup {
	/**
	 * The cached value of the '{@link #getGeltungsbereich() <em>Geltungsbereich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeltungsbereich()
	 * @generated
	 * @ordered
	 */
	protected Geltungsbereich_TypeClass geltungsbereich;

	/**
	 * The cached value of the '{@link #getSignalBefestigungsart() <em>Signal Befestigungsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalBefestigungsart()
	 * @generated
	 * @ordered
	 */
	protected Signal_Befestigungsart_TypeClass signalBefestigungsart;

	/**
	 * The cached value of the '{@link #getSignalRealAktiv() <em>Signal Real Aktiv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalRealAktiv()
	 * @generated
	 * @ordered
	 */
	protected Signal_Real_Aktiv_AttributeGroup signalRealAktiv;

	/**
	 * The cached value of the '{@link #getSignalRealAktivSchirm() <em>Signal Real Aktiv Schirm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalRealAktivSchirm()
	 * @generated
	 * @ordered
	 */
	protected Signal_Real_Aktiv_Schirm_AttributeGroup signalRealAktivSchirm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_Real_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_REAL_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geltungsbereich_TypeClass getGeltungsbereich() {
		return geltungsbereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeltungsbereich(Geltungsbereich_TypeClass newGeltungsbereich, NotificationChain msgs) {
		Geltungsbereich_TypeClass oldGeltungsbereich = geltungsbereich;
		geltungsbereich = newGeltungsbereich;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH, oldGeltungsbereich, newGeltungsbereich);
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
	public void setGeltungsbereich(Geltungsbereich_TypeClass newGeltungsbereich) {
		if (newGeltungsbereich != geltungsbereich) {
			NotificationChain msgs = null;
			if (geltungsbereich != null)
				msgs = ((InternalEObject)geltungsbereich).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH, null, msgs);
			if (newGeltungsbereich != null)
				msgs = ((InternalEObject)newGeltungsbereich).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH, null, msgs);
			msgs = basicSetGeltungsbereich(newGeltungsbereich, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH, newGeltungsbereich, newGeltungsbereich));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Befestigungsart_TypeClass getSignalBefestigungsart() {
		return signalBefestigungsart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalBefestigungsart(Signal_Befestigungsart_TypeClass newSignalBefestigungsart, NotificationChain msgs) {
		Signal_Befestigungsart_TypeClass oldSignalBefestigungsart = signalBefestigungsart;
		signalBefestigungsart = newSignalBefestigungsart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART, oldSignalBefestigungsart, newSignalBefestigungsart);
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
	public void setSignalBefestigungsart(Signal_Befestigungsart_TypeClass newSignalBefestigungsart) {
		if (newSignalBefestigungsart != signalBefestigungsart) {
			NotificationChain msgs = null;
			if (signalBefestigungsart != null)
				msgs = ((InternalEObject)signalBefestigungsart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART, null, msgs);
			if (newSignalBefestigungsart != null)
				msgs = ((InternalEObject)newSignalBefestigungsart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART, null, msgs);
			msgs = basicSetSignalBefestigungsart(newSignalBefestigungsart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART, newSignalBefestigungsart, newSignalBefestigungsart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Real_Aktiv_AttributeGroup getSignalRealAktiv() {
		return signalRealAktiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalRealAktiv(Signal_Real_Aktiv_AttributeGroup newSignalRealAktiv, NotificationChain msgs) {
		Signal_Real_Aktiv_AttributeGroup oldSignalRealAktiv = signalRealAktiv;
		signalRealAktiv = newSignalRealAktiv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV, oldSignalRealAktiv, newSignalRealAktiv);
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
	public void setSignalRealAktiv(Signal_Real_Aktiv_AttributeGroup newSignalRealAktiv) {
		if (newSignalRealAktiv != signalRealAktiv) {
			NotificationChain msgs = null;
			if (signalRealAktiv != null)
				msgs = ((InternalEObject)signalRealAktiv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV, null, msgs);
			if (newSignalRealAktiv != null)
				msgs = ((InternalEObject)newSignalRealAktiv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV, null, msgs);
			msgs = basicSetSignalRealAktiv(newSignalRealAktiv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV, newSignalRealAktiv, newSignalRealAktiv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Real_Aktiv_Schirm_AttributeGroup getSignalRealAktivSchirm() {
		return signalRealAktivSchirm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalRealAktivSchirm(Signal_Real_Aktiv_Schirm_AttributeGroup newSignalRealAktivSchirm, NotificationChain msgs) {
		Signal_Real_Aktiv_Schirm_AttributeGroup oldSignalRealAktivSchirm = signalRealAktivSchirm;
		signalRealAktivSchirm = newSignalRealAktivSchirm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM, oldSignalRealAktivSchirm, newSignalRealAktivSchirm);
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
	public void setSignalRealAktivSchirm(Signal_Real_Aktiv_Schirm_AttributeGroup newSignalRealAktivSchirm) {
		if (newSignalRealAktivSchirm != signalRealAktivSchirm) {
			NotificationChain msgs = null;
			if (signalRealAktivSchirm != null)
				msgs = ((InternalEObject)signalRealAktivSchirm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM, null, msgs);
			if (newSignalRealAktivSchirm != null)
				msgs = ((InternalEObject)newSignalRealAktivSchirm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM, null, msgs);
			msgs = basicSetSignalRealAktivSchirm(newSignalRealAktivSchirm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM, newSignalRealAktivSchirm, newSignalRealAktivSchirm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH:
				return basicSetGeltungsbereich(null, msgs);
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART:
				return basicSetSignalBefestigungsart(null, msgs);
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV:
				return basicSetSignalRealAktiv(null, msgs);
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM:
				return basicSetSignalRealAktivSchirm(null, msgs);
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
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH:
				return getGeltungsbereich();
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART:
				return getSignalBefestigungsart();
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV:
				return getSignalRealAktiv();
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM:
				return getSignalRealAktivSchirm();
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
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH:
				setGeltungsbereich((Geltungsbereich_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART:
				setSignalBefestigungsart((Signal_Befestigungsart_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV:
				setSignalRealAktiv((Signal_Real_Aktiv_AttributeGroup)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM:
				setSignalRealAktivSchirm((Signal_Real_Aktiv_Schirm_AttributeGroup)newValue);
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
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH:
				setGeltungsbereich((Geltungsbereich_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART:
				setSignalBefestigungsart((Signal_Befestigungsart_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV:
				setSignalRealAktiv((Signal_Real_Aktiv_AttributeGroup)null);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM:
				setSignalRealAktivSchirm((Signal_Real_Aktiv_Schirm_AttributeGroup)null);
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
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH:
				return geltungsbereich != null;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART:
				return signalBefestigungsart != null;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV:
				return signalRealAktiv != null;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM:
				return signalRealAktivSchirm != null;
		}
		return super.eIsSet(featureID);
	}

} //Signal_Real_AttributeGroupImpl
