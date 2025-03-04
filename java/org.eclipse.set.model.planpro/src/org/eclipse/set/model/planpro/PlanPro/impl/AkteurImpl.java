/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Ur_ObjektImpl;

import org.eclipse.set.model.planpro.PlanPro.Akteur;
import org.eclipse.set.model.planpro.PlanPro.Akteur_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.Organisation;
import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Akteur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.AkteurImpl#getAkteurAllg <em>Akteur Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.AkteurImpl#getKontaktdaten <em>Kontaktdaten</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AkteurImpl extends Ur_ObjektImpl implements Akteur {
	/**
	 * The cached value of the '{@link #getAkteurAllg() <em>Akteur Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAkteurAllg()
	 * @generated
	 * @ordered
	 */
	protected Akteur_Allg_AttributeGroup akteurAllg;

	/**
	 * The cached value of the '{@link #getKontaktdaten() <em>Kontaktdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontaktdaten()
	 * @generated
	 * @ordered
	 */
	protected Organisation kontaktdaten;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AkteurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getAkteur();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Akteur_Allg_AttributeGroup getAkteurAllg() {
		return akteurAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAkteurAllg(Akteur_Allg_AttributeGroup newAkteurAllg, NotificationChain msgs) {
		Akteur_Allg_AttributeGroup oldAkteurAllg = akteurAllg;
		akteurAllg = newAkteurAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.AKTEUR__AKTEUR_ALLG, oldAkteurAllg, newAkteurAllg);
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
	public void setAkteurAllg(Akteur_Allg_AttributeGroup newAkteurAllg) {
		if (newAkteurAllg != akteurAllg) {
			NotificationChain msgs = null;
			if (akteurAllg != null)
				msgs = ((InternalEObject)akteurAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AKTEUR__AKTEUR_ALLG, null, msgs);
			if (newAkteurAllg != null)
				msgs = ((InternalEObject)newAkteurAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AKTEUR__AKTEUR_ALLG, null, msgs);
			msgs = basicSetAkteurAllg(newAkteurAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.AKTEUR__AKTEUR_ALLG, newAkteurAllg, newAkteurAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Organisation getKontaktdaten() {
		return kontaktdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKontaktdaten(Organisation newKontaktdaten, NotificationChain msgs) {
		Organisation oldKontaktdaten = kontaktdaten;
		kontaktdaten = newKontaktdaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.AKTEUR__KONTAKTDATEN, oldKontaktdaten, newKontaktdaten);
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
	public void setKontaktdaten(Organisation newKontaktdaten) {
		if (newKontaktdaten != kontaktdaten) {
			NotificationChain msgs = null;
			if (kontaktdaten != null)
				msgs = ((InternalEObject)kontaktdaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AKTEUR__KONTAKTDATEN, null, msgs);
			if (newKontaktdaten != null)
				msgs = ((InternalEObject)newKontaktdaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AKTEUR__KONTAKTDATEN, null, msgs);
			msgs = basicSetKontaktdaten(newKontaktdaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.AKTEUR__KONTAKTDATEN, newKontaktdaten, newKontaktdaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.AKTEUR__AKTEUR_ALLG:
				return basicSetAkteurAllg(null, msgs);
			case PlanProPackage.AKTEUR__KONTAKTDATEN:
				return basicSetKontaktdaten(null, msgs);
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
			case PlanProPackage.AKTEUR__AKTEUR_ALLG:
				return getAkteurAllg();
			case PlanProPackage.AKTEUR__KONTAKTDATEN:
				return getKontaktdaten();
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
			case PlanProPackage.AKTEUR__AKTEUR_ALLG:
				setAkteurAllg((Akteur_Allg_AttributeGroup)newValue);
				return;
			case PlanProPackage.AKTEUR__KONTAKTDATEN:
				setKontaktdaten((Organisation)newValue);
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
			case PlanProPackage.AKTEUR__AKTEUR_ALLG:
				setAkteurAllg((Akteur_Allg_AttributeGroup)null);
				return;
			case PlanProPackage.AKTEUR__KONTAKTDATEN:
				setKontaktdaten((Organisation)null);
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
			case PlanProPackage.AKTEUR__AKTEUR_ALLG:
				return akteurAllg != null;
			case PlanProPackage.AKTEUR__KONTAKTDATEN:
				return kontaktdaten != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //AkteurImpl
