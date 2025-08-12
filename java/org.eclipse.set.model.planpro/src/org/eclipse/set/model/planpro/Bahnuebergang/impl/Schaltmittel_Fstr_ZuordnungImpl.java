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

import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.planpro.Bahnuebergang.Schaltmittel_Fstr_Zuordnung;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_BUE_WS_Fstr_Zuordnung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Schaltmittel_Zuordnung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schaltmittel Fstr Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Schaltmittel_Fstr_ZuordnungImpl#getIDBUEWSFstrZuordnung <em>IDBUEWS Fstr Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Schaltmittel_Fstr_ZuordnungImpl#getIDSchaltmittelZuordnung <em>ID Schaltmittel Zuordnung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Schaltmittel_Fstr_ZuordnungImpl extends Basis_ObjektImpl implements Schaltmittel_Fstr_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDBUEWSFstrZuordnung() <em>IDBUEWS Fstr Zuordnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUEWSFstrZuordnung()
	 * @generated
	 * @ordered
	 */
	protected ID_BUE_WS_Fstr_Zuordnung_TypeClass iDBUEWSFstrZuordnung;

	/**
	 * The cached value of the '{@link #getIDSchaltmittelZuordnung() <em>ID Schaltmittel Zuordnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSchaltmittelZuordnung()
	 * @generated
	 * @ordered
	 */
	protected ID_Schaltmittel_Zuordnung_TypeClass iDSchaltmittelZuordnung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schaltmittel_Fstr_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getSchaltmittel_Fstr_Zuordnung();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_BUE_WS_Fstr_Zuordnung_TypeClass getIDBUEWSFstrZuordnung() {
		return iDBUEWSFstrZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBUEWSFstrZuordnung(ID_BUE_WS_Fstr_Zuordnung_TypeClass newIDBUEWSFstrZuordnung, NotificationChain msgs) {
		ID_BUE_WS_Fstr_Zuordnung_TypeClass oldIDBUEWSFstrZuordnung = iDBUEWSFstrZuordnung;
		iDBUEWSFstrZuordnung = newIDBUEWSFstrZuordnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__IDBUEWS_FSTR_ZUORDNUNG, oldIDBUEWSFstrZuordnung, newIDBUEWSFstrZuordnung);
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
	public void setIDBUEWSFstrZuordnung(ID_BUE_WS_Fstr_Zuordnung_TypeClass newIDBUEWSFstrZuordnung) {
		if (newIDBUEWSFstrZuordnung != iDBUEWSFstrZuordnung) {
			NotificationChain msgs = null;
			if (iDBUEWSFstrZuordnung != null)
				msgs = ((InternalEObject)iDBUEWSFstrZuordnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__IDBUEWS_FSTR_ZUORDNUNG, null, msgs);
			if (newIDBUEWSFstrZuordnung != null)
				msgs = ((InternalEObject)newIDBUEWSFstrZuordnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__IDBUEWS_FSTR_ZUORDNUNG, null, msgs);
			msgs = basicSetIDBUEWSFstrZuordnung(newIDBUEWSFstrZuordnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__IDBUEWS_FSTR_ZUORDNUNG, newIDBUEWSFstrZuordnung, newIDBUEWSFstrZuordnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Schaltmittel_Zuordnung_TypeClass getIDSchaltmittelZuordnung() {
		return iDSchaltmittelZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSchaltmittelZuordnung(ID_Schaltmittel_Zuordnung_TypeClass newIDSchaltmittelZuordnung, NotificationChain msgs) {
		ID_Schaltmittel_Zuordnung_TypeClass oldIDSchaltmittelZuordnung = iDSchaltmittelZuordnung;
		iDSchaltmittelZuordnung = newIDSchaltmittelZuordnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__ID_SCHALTMITTEL_ZUORDNUNG, oldIDSchaltmittelZuordnung, newIDSchaltmittelZuordnung);
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
	public void setIDSchaltmittelZuordnung(ID_Schaltmittel_Zuordnung_TypeClass newIDSchaltmittelZuordnung) {
		if (newIDSchaltmittelZuordnung != iDSchaltmittelZuordnung) {
			NotificationChain msgs = null;
			if (iDSchaltmittelZuordnung != null)
				msgs = ((InternalEObject)iDSchaltmittelZuordnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__ID_SCHALTMITTEL_ZUORDNUNG, null, msgs);
			if (newIDSchaltmittelZuordnung != null)
				msgs = ((InternalEObject)newIDSchaltmittelZuordnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__ID_SCHALTMITTEL_ZUORDNUNG, null, msgs);
			msgs = basicSetIDSchaltmittelZuordnung(newIDSchaltmittelZuordnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__ID_SCHALTMITTEL_ZUORDNUNG, newIDSchaltmittelZuordnung, newIDSchaltmittelZuordnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__IDBUEWS_FSTR_ZUORDNUNG:
				return basicSetIDBUEWSFstrZuordnung(null, msgs);
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__ID_SCHALTMITTEL_ZUORDNUNG:
				return basicSetIDSchaltmittelZuordnung(null, msgs);
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
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__IDBUEWS_FSTR_ZUORDNUNG:
				return getIDBUEWSFstrZuordnung();
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__ID_SCHALTMITTEL_ZUORDNUNG:
				return getIDSchaltmittelZuordnung();
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
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__IDBUEWS_FSTR_ZUORDNUNG:
				setIDBUEWSFstrZuordnung((ID_BUE_WS_Fstr_Zuordnung_TypeClass)newValue);
				return;
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__ID_SCHALTMITTEL_ZUORDNUNG:
				setIDSchaltmittelZuordnung((ID_Schaltmittel_Zuordnung_TypeClass)newValue);
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
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__IDBUEWS_FSTR_ZUORDNUNG:
				setIDBUEWSFstrZuordnung((ID_BUE_WS_Fstr_Zuordnung_TypeClass)null);
				return;
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__ID_SCHALTMITTEL_ZUORDNUNG:
				setIDSchaltmittelZuordnung((ID_Schaltmittel_Zuordnung_TypeClass)null);
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
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__IDBUEWS_FSTR_ZUORDNUNG:
				return iDBUEWSFstrZuordnung != null;
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__ID_SCHALTMITTEL_ZUORDNUNG:
				return iDSchaltmittelZuordnung != null;
		}
		return super.eIsSet(featureID);
	}

} //Schaltmittel_Fstr_ZuordnungImpl
