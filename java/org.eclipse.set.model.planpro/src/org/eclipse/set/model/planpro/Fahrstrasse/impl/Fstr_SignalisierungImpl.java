/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_Signalisierung;

import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Zug_Rangier_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_Signalbegriff_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Signalisierung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_SignalisierungImpl#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_SignalisierungImpl#getIDSignalSignalbegriff <em>ID Signal Signalbegriff</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_SignalisierungImpl#getIDSignalSignalbegriffZiel <em>ID Signal Signalbegriff Ziel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_SignalisierungImpl extends Basis_ObjektImpl implements Fstr_Signalisierung {
	/**
	 * The cached value of the '{@link #getIDFstrZugRangier() <em>ID Fstr Zug Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrZugRangier()
	 * @generated
	 * @ordered
	 */
	protected ID_Fstr_Zug_Rangier_TypeClass iDFstrZugRangier;

	/**
	 * The cached value of the '{@link #getIDSignalSignalbegriff() <em>ID Signal Signalbegriff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalSignalbegriff()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_Signalbegriff_TypeClass iDSignalSignalbegriff;

	/**
	 * The cached value of the '{@link #getIDSignalSignalbegriffZiel() <em>ID Signal Signalbegriff Ziel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalSignalbegriffZiel()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_Signalbegriff_TypeClass iDSignalSignalbegriffZiel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_SignalisierungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_SIGNALISIERUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_Zug_Rangier_TypeClass getIDFstrZugRangier() {
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass newIDFstrZugRangier, NotificationChain msgs) {
		ID_Fstr_Zug_Rangier_TypeClass oldIDFstrZugRangier = iDFstrZugRangier;
		iDFstrZugRangier = newIDFstrZugRangier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, newIDFstrZugRangier);
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
	public void setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass newIDFstrZugRangier) {
		if (newIDFstrZugRangier != iDFstrZugRangier) {
			NotificationChain msgs = null;
			if (iDFstrZugRangier != null)
				msgs = ((InternalEObject)iDFstrZugRangier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER, null, msgs);
			if (newIDFstrZugRangier != null)
				msgs = ((InternalEObject)newIDFstrZugRangier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER, null, msgs);
			msgs = basicSetIDFstrZugRangier(newIDFstrZugRangier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER, newIDFstrZugRangier, newIDFstrZugRangier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_Signalbegriff_TypeClass getIDSignalSignalbegriff() {
		return iDSignalSignalbegriff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSignalSignalbegriff(ID_Signal_Signalbegriff_TypeClass newIDSignalSignalbegriff, NotificationChain msgs) {
		ID_Signal_Signalbegriff_TypeClass oldIDSignalSignalbegriff = iDSignalSignalbegriff;
		iDSignalSignalbegriff = newIDSignalSignalbegriff;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF, oldIDSignalSignalbegriff, newIDSignalSignalbegriff);
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
	public void setIDSignalSignalbegriff(ID_Signal_Signalbegriff_TypeClass newIDSignalSignalbegriff) {
		if (newIDSignalSignalbegriff != iDSignalSignalbegriff) {
			NotificationChain msgs = null;
			if (iDSignalSignalbegriff != null)
				msgs = ((InternalEObject)iDSignalSignalbegriff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF, null, msgs);
			if (newIDSignalSignalbegriff != null)
				msgs = ((InternalEObject)newIDSignalSignalbegriff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF, null, msgs);
			msgs = basicSetIDSignalSignalbegriff(newIDSignalSignalbegriff, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF, newIDSignalSignalbegriff, newIDSignalSignalbegriff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_Signalbegriff_TypeClass getIDSignalSignalbegriffZiel() {
		return iDSignalSignalbegriffZiel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSignalSignalbegriffZiel(ID_Signal_Signalbegriff_TypeClass newIDSignalSignalbegriffZiel, NotificationChain msgs) {
		ID_Signal_Signalbegriff_TypeClass oldIDSignalSignalbegriffZiel = iDSignalSignalbegriffZiel;
		iDSignalSignalbegriffZiel = newIDSignalSignalbegriffZiel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL, oldIDSignalSignalbegriffZiel, newIDSignalSignalbegriffZiel);
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
	public void setIDSignalSignalbegriffZiel(ID_Signal_Signalbegriff_TypeClass newIDSignalSignalbegriffZiel) {
		if (newIDSignalSignalbegriffZiel != iDSignalSignalbegriffZiel) {
			NotificationChain msgs = null;
			if (iDSignalSignalbegriffZiel != null)
				msgs = ((InternalEObject)iDSignalSignalbegriffZiel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL, null, msgs);
			if (newIDSignalSignalbegriffZiel != null)
				msgs = ((InternalEObject)newIDSignalSignalbegriffZiel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL, null, msgs);
			msgs = basicSetIDSignalSignalbegriffZiel(newIDSignalSignalbegriffZiel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL, newIDSignalSignalbegriffZiel, newIDSignalSignalbegriffZiel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER:
				return basicSetIDFstrZugRangier(null, msgs);
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF:
				return basicSetIDSignalSignalbegriff(null, msgs);
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL:
				return basicSetIDSignalSignalbegriffZiel(null, msgs);
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
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER:
				return getIDFstrZugRangier();
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF:
				return getIDSignalSignalbegriff();
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL:
				return getIDSignalSignalbegriffZiel();
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
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((ID_Fstr_Zug_Rangier_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF:
				setIDSignalSignalbegriff((ID_Signal_Signalbegriff_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL:
				setIDSignalSignalbegriffZiel((ID_Signal_Signalbegriff_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((ID_Fstr_Zug_Rangier_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF:
				setIDSignalSignalbegriff((ID_Signal_Signalbegriff_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL:
				setIDSignalSignalbegriffZiel((ID_Signal_Signalbegriff_TypeClass)null);
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
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER:
				return iDFstrZugRangier != null;
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF:
				return iDSignalSignalbegriff != null;
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL:
				return iDSignalSignalbegriffZiel != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fstr_SignalisierungImpl
