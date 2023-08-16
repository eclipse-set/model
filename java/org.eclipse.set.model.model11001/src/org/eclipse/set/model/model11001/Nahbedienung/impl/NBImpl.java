/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Nahbedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Nahbedienung.NB;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Art_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup;
import org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.impl.NBImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.impl.NBImpl#getNBArt <em>NB Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.impl.NBImpl#getNBFunktionalitaetNBR <em>NB Funktionalitaet NBR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NBImpl extends Basis_ObjektImpl implements NB {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected NB_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getNBArt() <em>NB Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBArt()
	 * @generated
	 * @ordered
	 */
	protected NB_Art_TypeClass nBArt;

	/**
	 * The cached value of the '{@link #getNBFunktionalitaetNBR() <em>NB Funktionalitaet NBR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBFunktionalitaetNBR()
	 * @generated
	 * @ordered
	 */
	protected NB_Funktionalitaet_NB_R_AttributeGroup nBFunktionalitaetNBR;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NahbedienungPackage.Literals.NB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(NB_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		NB_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(NB_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Art_TypeClass getNBArt() {
		return nBArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNBArt(NB_Art_TypeClass newNBArt, NotificationChain msgs) {
		NB_Art_TypeClass oldNBArt = nBArt;
		nBArt = newNBArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB__NB_ART, oldNBArt, newNBArt);
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
	public void setNBArt(NB_Art_TypeClass newNBArt) {
		if (newNBArt != nBArt) {
			NotificationChain msgs = null;
			if (nBArt != null)
				msgs = ((InternalEObject)nBArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB__NB_ART, null, msgs);
			if (newNBArt != null)
				msgs = ((InternalEObject)newNBArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB__NB_ART, null, msgs);
			msgs = basicSetNBArt(newNBArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB__NB_ART, newNBArt, newNBArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Funktionalitaet_NB_R_AttributeGroup getNBFunktionalitaetNBR() {
		return nBFunktionalitaetNBR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNBFunktionalitaetNBR(NB_Funktionalitaet_NB_R_AttributeGroup newNBFunktionalitaetNBR, NotificationChain msgs) {
		NB_Funktionalitaet_NB_R_AttributeGroup oldNBFunktionalitaetNBR = nBFunktionalitaetNBR;
		nBFunktionalitaetNBR = newNBFunktionalitaetNBR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB__NB_FUNKTIONALITAET_NBR, oldNBFunktionalitaetNBR, newNBFunktionalitaetNBR);
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
	public void setNBFunktionalitaetNBR(NB_Funktionalitaet_NB_R_AttributeGroup newNBFunktionalitaetNBR) {
		if (newNBFunktionalitaetNBR != nBFunktionalitaetNBR) {
			NotificationChain msgs = null;
			if (nBFunktionalitaetNBR != null)
				msgs = ((InternalEObject)nBFunktionalitaetNBR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB__NB_FUNKTIONALITAET_NBR, null, msgs);
			if (newNBFunktionalitaetNBR != null)
				msgs = ((InternalEObject)newNBFunktionalitaetNBR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB__NB_FUNKTIONALITAET_NBR, null, msgs);
			msgs = basicSetNBFunktionalitaetNBR(newNBFunktionalitaetNBR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB__NB_FUNKTIONALITAET_NBR, newNBFunktionalitaetNBR, newNBFunktionalitaetNBR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienungPackage.NB__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case NahbedienungPackage.NB__NB_ART:
				return basicSetNBArt(null, msgs);
			case NahbedienungPackage.NB__NB_FUNKTIONALITAET_NBR:
				return basicSetNBFunktionalitaetNBR(null, msgs);
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
			case NahbedienungPackage.NB__BEZEICHNUNG:
				return getBezeichnung();
			case NahbedienungPackage.NB__NB_ART:
				return getNBArt();
			case NahbedienungPackage.NB__NB_FUNKTIONALITAET_NBR:
				return getNBFunktionalitaetNBR();
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
			case NahbedienungPackage.NB__BEZEICHNUNG:
				setBezeichnung((NB_Bezeichnung_AttributeGroup)newValue);
				return;
			case NahbedienungPackage.NB__NB_ART:
				setNBArt((NB_Art_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB__NB_FUNKTIONALITAET_NBR:
				setNBFunktionalitaetNBR((NB_Funktionalitaet_NB_R_AttributeGroup)newValue);
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
			case NahbedienungPackage.NB__BEZEICHNUNG:
				setBezeichnung((NB_Bezeichnung_AttributeGroup)null);
				return;
			case NahbedienungPackage.NB__NB_ART:
				setNBArt((NB_Art_TypeClass)null);
				return;
			case NahbedienungPackage.NB__NB_FUNKTIONALITAET_NBR:
				setNBFunktionalitaetNBR((NB_Funktionalitaet_NB_R_AttributeGroup)null);
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
			case NahbedienungPackage.NB__BEZEICHNUNG:
				return bezeichnung != null;
			case NahbedienungPackage.NB__NB_ART:
				return nBArt != null;
			case NahbedienungPackage.NB__NB_FUNKTIONALITAET_NBR:
				return nBFunktionalitaetNBR != null;
		}
		return super.eIsSet(featureID);
	}

} //NBImpl
