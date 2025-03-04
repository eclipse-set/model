/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Bereich_ObjektImpl;

import org.eclipse.set.model.planpro.Geodaten.Bremsweg_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.GeodatenPackage;
import org.eclipse.set.model.planpro.Geodaten.Strecke_Bremsweg;
import org.eclipse.set.model.planpro.Geodaten.Strecke_Richtung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strecke Bremsweg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.Strecke_BremswegImpl#getBremsweg <em>Bremsweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.Strecke_BremswegImpl#getStreckeRichtung <em>Strecke Richtung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Strecke_BremswegImpl extends Bereich_ObjektImpl implements Strecke_Bremsweg {
	/**
	 * The cached value of the '{@link #getBremsweg() <em>Bremsweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBremsweg()
	 * @generated
	 * @ordered
	 */
	protected Bremsweg_TypeClass bremsweg;

	/**
	 * The cached value of the '{@link #getStreckeRichtung() <em>Strecke Richtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreckeRichtung()
	 * @generated
	 * @ordered
	 */
	protected Strecke_Richtung_TypeClass streckeRichtung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Strecke_BremswegImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.STRECKE_BREMSWEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bremsweg_TypeClass getBremsweg() {
		return bremsweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBremsweg(Bremsweg_TypeClass newBremsweg, NotificationChain msgs) {
		Bremsweg_TypeClass oldBremsweg = bremsweg;
		bremsweg = newBremsweg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.STRECKE_BREMSWEG__BREMSWEG, oldBremsweg, newBremsweg);
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
	public void setBremsweg(Bremsweg_TypeClass newBremsweg) {
		if (newBremsweg != bremsweg) {
			NotificationChain msgs = null;
			if (bremsweg != null)
				msgs = ((InternalEObject)bremsweg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.STRECKE_BREMSWEG__BREMSWEG, null, msgs);
			if (newBremsweg != null)
				msgs = ((InternalEObject)newBremsweg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.STRECKE_BREMSWEG__BREMSWEG, null, msgs);
			msgs = basicSetBremsweg(newBremsweg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.STRECKE_BREMSWEG__BREMSWEG, newBremsweg, newBremsweg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke_Richtung_TypeClass getStreckeRichtung() {
		return streckeRichtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreckeRichtung(Strecke_Richtung_TypeClass newStreckeRichtung, NotificationChain msgs) {
		Strecke_Richtung_TypeClass oldStreckeRichtung = streckeRichtung;
		streckeRichtung = newStreckeRichtung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.STRECKE_BREMSWEG__STRECKE_RICHTUNG, oldStreckeRichtung, newStreckeRichtung);
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
	public void setStreckeRichtung(Strecke_Richtung_TypeClass newStreckeRichtung) {
		if (newStreckeRichtung != streckeRichtung) {
			NotificationChain msgs = null;
			if (streckeRichtung != null)
				msgs = ((InternalEObject)streckeRichtung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.STRECKE_BREMSWEG__STRECKE_RICHTUNG, null, msgs);
			if (newStreckeRichtung != null)
				msgs = ((InternalEObject)newStreckeRichtung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.STRECKE_BREMSWEG__STRECKE_RICHTUNG, null, msgs);
			msgs = basicSetStreckeRichtung(newStreckeRichtung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.STRECKE_BREMSWEG__STRECKE_RICHTUNG, newStreckeRichtung, newStreckeRichtung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.STRECKE_BREMSWEG__BREMSWEG:
				return basicSetBremsweg(null, msgs);
			case GeodatenPackage.STRECKE_BREMSWEG__STRECKE_RICHTUNG:
				return basicSetStreckeRichtung(null, msgs);
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
			case GeodatenPackage.STRECKE_BREMSWEG__BREMSWEG:
				return getBremsweg();
			case GeodatenPackage.STRECKE_BREMSWEG__STRECKE_RICHTUNG:
				return getStreckeRichtung();
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
			case GeodatenPackage.STRECKE_BREMSWEG__BREMSWEG:
				setBremsweg((Bremsweg_TypeClass)newValue);
				return;
			case GeodatenPackage.STRECKE_BREMSWEG__STRECKE_RICHTUNG:
				setStreckeRichtung((Strecke_Richtung_TypeClass)newValue);
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
			case GeodatenPackage.STRECKE_BREMSWEG__BREMSWEG:
				setBremsweg((Bremsweg_TypeClass)null);
				return;
			case GeodatenPackage.STRECKE_BREMSWEG__STRECKE_RICHTUNG:
				setStreckeRichtung((Strecke_Richtung_TypeClass)null);
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
			case GeodatenPackage.STRECKE_BREMSWEG__BREMSWEG:
				return bremsweg != null;
			case GeodatenPackage.STRECKE_BREMSWEG__STRECKE_RICHTUNG:
				return streckeRichtung != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Strecke_BremswegImpl
