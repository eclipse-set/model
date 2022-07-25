/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.model.model1902.Geodaten.GeodatenPackage;
import org.eclipse.set.model.model1902.Geodaten.TP_Art_TypeClass;
import org.eclipse.set.model.model1902.Geodaten.TP_Beschreibung_TypeClass;
import org.eclipse.set.model.model1902.Geodaten.Technischer_Punkt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technischer Punkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.Technischer_PunktImpl#getTPArt <em>TP Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.Technischer_PunktImpl#getTPBeschreibung <em>TP Beschreibung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Technischer_PunktImpl extends Punkt_ObjektImpl implements Technischer_Punkt {
	/**
	 * The cached value of the '{@link #getTPArt() <em>TP Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTPArt()
	 * @generated
	 * @ordered
	 */
	protected TP_Art_TypeClass tPArt;

	/**
	 * The cached value of the '{@link #getTPBeschreibung() <em>TP Beschreibung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTPBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected TP_Beschreibung_TypeClass tPBeschreibung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Technischer_PunktImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.TECHNISCHER_PUNKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TP_Art_TypeClass getTPArt() {
		return tPArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTPArt(TP_Art_TypeClass newTPArt, NotificationChain msgs) {
		TP_Art_TypeClass oldTPArt = tPArt;
		tPArt = newTPArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.TECHNISCHER_PUNKT__TP_ART, oldTPArt, newTPArt);
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
	public void setTPArt(TP_Art_TypeClass newTPArt) {
		if (newTPArt != tPArt) {
			NotificationChain msgs = null;
			if (tPArt != null)
				msgs = ((InternalEObject)tPArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TECHNISCHER_PUNKT__TP_ART, null, msgs);
			if (newTPArt != null)
				msgs = ((InternalEObject)newTPArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TECHNISCHER_PUNKT__TP_ART, null, msgs);
			msgs = basicSetTPArt(newTPArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TECHNISCHER_PUNKT__TP_ART, newTPArt, newTPArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TP_Beschreibung_TypeClass getTPBeschreibung() {
		return tPBeschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTPBeschreibung(TP_Beschreibung_TypeClass newTPBeschreibung, NotificationChain msgs) {
		TP_Beschreibung_TypeClass oldTPBeschreibung = tPBeschreibung;
		tPBeschreibung = newTPBeschreibung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.TECHNISCHER_PUNKT__TP_BESCHREIBUNG, oldTPBeschreibung, newTPBeschreibung);
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
	public void setTPBeschreibung(TP_Beschreibung_TypeClass newTPBeschreibung) {
		if (newTPBeschreibung != tPBeschreibung) {
			NotificationChain msgs = null;
			if (tPBeschreibung != null)
				msgs = ((InternalEObject)tPBeschreibung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TECHNISCHER_PUNKT__TP_BESCHREIBUNG, null, msgs);
			if (newTPBeschreibung != null)
				msgs = ((InternalEObject)newTPBeschreibung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TECHNISCHER_PUNKT__TP_BESCHREIBUNG, null, msgs);
			msgs = basicSetTPBeschreibung(newTPBeschreibung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TECHNISCHER_PUNKT__TP_BESCHREIBUNG, newTPBeschreibung, newTPBeschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.TECHNISCHER_PUNKT__TP_ART:
				return basicSetTPArt(null, msgs);
			case GeodatenPackage.TECHNISCHER_PUNKT__TP_BESCHREIBUNG:
				return basicSetTPBeschreibung(null, msgs);
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
			case GeodatenPackage.TECHNISCHER_PUNKT__TP_ART:
				return getTPArt();
			case GeodatenPackage.TECHNISCHER_PUNKT__TP_BESCHREIBUNG:
				return getTPBeschreibung();
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
			case GeodatenPackage.TECHNISCHER_PUNKT__TP_ART:
				setTPArt((TP_Art_TypeClass)newValue);
				return;
			case GeodatenPackage.TECHNISCHER_PUNKT__TP_BESCHREIBUNG:
				setTPBeschreibung((TP_Beschreibung_TypeClass)newValue);
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
			case GeodatenPackage.TECHNISCHER_PUNKT__TP_ART:
				setTPArt((TP_Art_TypeClass)null);
				return;
			case GeodatenPackage.TECHNISCHER_PUNKT__TP_BESCHREIBUNG:
				setTPBeschreibung((TP_Beschreibung_TypeClass)null);
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
			case GeodatenPackage.TECHNISCHER_PUNKT__TP_ART:
				return tPArt != null;
			case GeodatenPackage.TECHNISCHER_PUNKT__TP_BESCHREIBUNG:
				return tPBeschreibung != null;
		}
		return super.eIsSet(featureID);
	}

} //Technischer_PunktImpl
