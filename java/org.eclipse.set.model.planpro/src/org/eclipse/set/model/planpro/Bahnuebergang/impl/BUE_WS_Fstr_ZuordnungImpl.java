/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Bahnuebergang.BUE_WS_Fstr_Zuordnung;
import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_BUE_Einschaltung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Zug_Rangier_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE WS Fstr Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_WS_Fstr_ZuordnungImpl#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_WS_Fstr_ZuordnungImpl#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_WS_Fstr_ZuordnungImpl extends Basis_ObjektImpl implements BUE_WS_Fstr_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDBUEEinschaltung() <em>IDBUE Einschaltung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUEEinschaltung()
	 * @generated
	 * @ordered
	 */
	protected ID_BUE_Einschaltung_TypeClass iDBUEEinschaltung;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_WS_Fstr_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_WS_Fstr_Zuordnung();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_BUE_Einschaltung_TypeClass getIDBUEEinschaltung() {
		return iDBUEEinschaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBUEEinschaltung(ID_BUE_Einschaltung_TypeClass newIDBUEEinschaltung, NotificationChain msgs) {
		ID_BUE_Einschaltung_TypeClass oldIDBUEEinschaltung = iDBUEEinschaltung;
		iDBUEEinschaltung = newIDBUEEinschaltung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__IDBUE_EINSCHALTUNG, oldIDBUEEinschaltung, newIDBUEEinschaltung);
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
	public void setIDBUEEinschaltung(ID_BUE_Einschaltung_TypeClass newIDBUEEinschaltung) {
		if (newIDBUEEinschaltung != iDBUEEinschaltung) {
			NotificationChain msgs = null;
			if (iDBUEEinschaltung != null)
				msgs = ((InternalEObject)iDBUEEinschaltung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__IDBUE_EINSCHALTUNG, null, msgs);
			if (newIDBUEEinschaltung != null)
				msgs = ((InternalEObject)newIDBUEEinschaltung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__IDBUE_EINSCHALTUNG, null, msgs);
			msgs = basicSetIDBUEEinschaltung(newIDBUEEinschaltung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__IDBUE_EINSCHALTUNG, newIDBUEEinschaltung, newIDBUEEinschaltung));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, newIDFstrZugRangier);
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
				msgs = ((InternalEObject)iDFstrZugRangier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, null, msgs);
			if (newIDFstrZugRangier != null)
				msgs = ((InternalEObject)newIDFstrZugRangier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, null, msgs);
			msgs = basicSetIDFstrZugRangier(newIDFstrZugRangier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, newIDFstrZugRangier, newIDFstrZugRangier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				return basicSetIDBUEEinschaltung(null, msgs);
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				return basicSetIDFstrZugRangier(null, msgs);
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
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				return getIDBUEEinschaltung();
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				return getIDFstrZugRangier();
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
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				setIDBUEEinschaltung((ID_BUE_Einschaltung_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((ID_Fstr_Zug_Rangier_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				setIDBUEEinschaltung((ID_BUE_Einschaltung_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((ID_Fstr_Zug_Rangier_TypeClass)null);
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
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				return iDBUEEinschaltung != null;
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				return iDFstrZugRangier != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //BUE_WS_Fstr_ZuordnungImpl
