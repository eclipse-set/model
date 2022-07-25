/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Nahbedienbereich.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Nahbedienbereich.NB;
import org.eclipse.set.model.model1902.Nahbedienbereich.NB_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Nahbedienbereich.NB_Funktionalitaet_NB_R_AttributeGroup;
import org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.impl.NBImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.impl.NBImpl#getNBAllg <em>NB Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.impl.NBImpl#getNBFunktionalitaetNBR <em>NB Funktionalitaet NBR</em>}</li>
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
	protected Bezeichnung_Element_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getNBAllg() <em>NB Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBAllg()
	 * @generated
	 * @ordered
	 */
	protected NB_Allg_AttributeGroup nBAllg;

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
		return NahbedienbereichPackage.Literals.NB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Element_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bezeichnung_Element_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bezeichnung_Element_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienbereichPackage.NB__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bezeichnung_Element_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienbereichPackage.NB__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienbereichPackage.NB__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienbereichPackage.NB__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Allg_AttributeGroup getNBAllg() {
		return nBAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNBAllg(NB_Allg_AttributeGroup newNBAllg, NotificationChain msgs) {
		NB_Allg_AttributeGroup oldNBAllg = nBAllg;
		nBAllg = newNBAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienbereichPackage.NB__NB_ALLG, oldNBAllg, newNBAllg);
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
	public void setNBAllg(NB_Allg_AttributeGroup newNBAllg) {
		if (newNBAllg != nBAllg) {
			NotificationChain msgs = null;
			if (nBAllg != null)
				msgs = ((InternalEObject)nBAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienbereichPackage.NB__NB_ALLG, null, msgs);
			if (newNBAllg != null)
				msgs = ((InternalEObject)newNBAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienbereichPackage.NB__NB_ALLG, null, msgs);
			msgs = basicSetNBAllg(newNBAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienbereichPackage.NB__NB_ALLG, newNBAllg, newNBAllg));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienbereichPackage.NB__NB_FUNKTIONALITAET_NBR, oldNBFunktionalitaetNBR, newNBFunktionalitaetNBR);
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
				msgs = ((InternalEObject)nBFunktionalitaetNBR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienbereichPackage.NB__NB_FUNKTIONALITAET_NBR, null, msgs);
			if (newNBFunktionalitaetNBR != null)
				msgs = ((InternalEObject)newNBFunktionalitaetNBR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienbereichPackage.NB__NB_FUNKTIONALITAET_NBR, null, msgs);
			msgs = basicSetNBFunktionalitaetNBR(newNBFunktionalitaetNBR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienbereichPackage.NB__NB_FUNKTIONALITAET_NBR, newNBFunktionalitaetNBR, newNBFunktionalitaetNBR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienbereichPackage.NB__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case NahbedienbereichPackage.NB__NB_ALLG:
				return basicSetNBAllg(null, msgs);
			case NahbedienbereichPackage.NB__NB_FUNKTIONALITAET_NBR:
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
			case NahbedienbereichPackage.NB__BEZEICHNUNG:
				return getBezeichnung();
			case NahbedienbereichPackage.NB__NB_ALLG:
				return getNBAllg();
			case NahbedienbereichPackage.NB__NB_FUNKTIONALITAET_NBR:
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
			case NahbedienbereichPackage.NB__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)newValue);
				return;
			case NahbedienbereichPackage.NB__NB_ALLG:
				setNBAllg((NB_Allg_AttributeGroup)newValue);
				return;
			case NahbedienbereichPackage.NB__NB_FUNKTIONALITAET_NBR:
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
			case NahbedienbereichPackage.NB__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)null);
				return;
			case NahbedienbereichPackage.NB__NB_ALLG:
				setNBAllg((NB_Allg_AttributeGroup)null);
				return;
			case NahbedienbereichPackage.NB__NB_FUNKTIONALITAET_NBR:
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
			case NahbedienbereichPackage.NB__BEZEICHNUNG:
				return bezeichnung != null;
			case NahbedienbereichPackage.NB__NB_ALLG:
				return nBAllg != null;
			case NahbedienbereichPackage.NB__NB_FUNKTIONALITAET_NBR:
				return nBFunktionalitaetNBR != null;
		}
		return super.eIsSet(featureID);
	}

} //NBImpl
