/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Anlage_Bezeichnung_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_LEU_Bezug_Funktional_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Anlage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.LEU_AnlageImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.LEU_AnlageImpl#getIDLEUBezugspunkt <em>IDLEU Bezugspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.LEU_AnlageImpl#getLEUAnlageAllg <em>LEU Anlage Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_AnlageImpl extends Basis_ObjektImpl implements LEU_Anlage {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected LEU_Anlage_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDLEUBezugspunkt() <em>IDLEU Bezugspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDLEUBezugspunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_LEU_Bezug_Funktional_TypeClass iDLEUBezugspunkt;

	/**
	 * The cached value of the '{@link #getLEUAnlageAllg() <em>LEU Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUAnlageAllg()
	 * @generated
	 * @ordered
	 */
	protected LEU_Anlage_Allg_AttributeGroup lEUAnlageAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_AnlageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Anlage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Anlage_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(LEU_Anlage_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		LEU_Anlage_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(LEU_Anlage_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_LEU_Bezug_Funktional_TypeClass getIDLEUBezugspunkt() {
		return iDLEUBezugspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDLEUBezugspunkt(ID_LEU_Bezug_Funktional_TypeClass newIDLEUBezugspunkt, NotificationChain msgs) {
		ID_LEU_Bezug_Funktional_TypeClass oldIDLEUBezugspunkt = iDLEUBezugspunkt;
		iDLEUBezugspunkt = newIDLEUBezugspunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_ANLAGE__IDLEU_BEZUGSPUNKT, oldIDLEUBezugspunkt, newIDLEUBezugspunkt);
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
	public void setIDLEUBezugspunkt(ID_LEU_Bezug_Funktional_TypeClass newIDLEUBezugspunkt) {
		if (newIDLEUBezugspunkt != iDLEUBezugspunkt) {
			NotificationChain msgs = null;
			if (iDLEUBezugspunkt != null)
				msgs = ((InternalEObject)iDLEUBezugspunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_ANLAGE__IDLEU_BEZUGSPUNKT, null, msgs);
			if (newIDLEUBezugspunkt != null)
				msgs = ((InternalEObject)newIDLEUBezugspunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_ANLAGE__IDLEU_BEZUGSPUNKT, null, msgs);
			msgs = basicSetIDLEUBezugspunkt(newIDLEUBezugspunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_ANLAGE__IDLEU_BEZUGSPUNKT, newIDLEUBezugspunkt, newIDLEUBezugspunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Anlage_Allg_AttributeGroup getLEUAnlageAllg() {
		return lEUAnlageAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLEUAnlageAllg(LEU_Anlage_Allg_AttributeGroup newLEUAnlageAllg, NotificationChain msgs) {
		LEU_Anlage_Allg_AttributeGroup oldLEUAnlageAllg = lEUAnlageAllg;
		lEUAnlageAllg = newLEUAnlageAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_ANLAGE__LEU_ANLAGE_ALLG, oldLEUAnlageAllg, newLEUAnlageAllg);
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
	public void setLEUAnlageAllg(LEU_Anlage_Allg_AttributeGroup newLEUAnlageAllg) {
		if (newLEUAnlageAllg != lEUAnlageAllg) {
			NotificationChain msgs = null;
			if (lEUAnlageAllg != null)
				msgs = ((InternalEObject)lEUAnlageAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_ANLAGE__LEU_ANLAGE_ALLG, null, msgs);
			if (newLEUAnlageAllg != null)
				msgs = ((InternalEObject)newLEUAnlageAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_ANLAGE__LEU_ANLAGE_ALLG, null, msgs);
			msgs = basicSetLEUAnlageAllg(newLEUAnlageAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_ANLAGE__LEU_ANLAGE_ALLG, newLEUAnlageAllg, newLEUAnlageAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__IDLEU_BEZUGSPUNKT:
				return basicSetIDLEUBezugspunkt(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__LEU_ANLAGE_ALLG:
				return basicSetLEUAnlageAllg(null, msgs);
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
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG:
				return getBezeichnung();
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__IDLEU_BEZUGSPUNKT:
				return getIDLEUBezugspunkt();
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__LEU_ANLAGE_ALLG:
				return getLEUAnlageAllg();
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
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG:
				setBezeichnung((LEU_Anlage_Bezeichnung_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__IDLEU_BEZUGSPUNKT:
				setIDLEUBezugspunkt((ID_LEU_Bezug_Funktional_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__LEU_ANLAGE_ALLG:
				setLEUAnlageAllg((LEU_Anlage_Allg_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG:
				setBezeichnung((LEU_Anlage_Bezeichnung_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__IDLEU_BEZUGSPUNKT:
				setIDLEUBezugspunkt((ID_LEU_Bezug_Funktional_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__LEU_ANLAGE_ALLG:
				setLEUAnlageAllg((LEU_Anlage_Allg_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG:
				return bezeichnung != null;
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__IDLEU_BEZUGSPUNKT:
				return iDLEUBezugspunkt != null;
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__LEU_ANLAGE_ALLG:
				return lEUAnlageAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //LEU_AnlageImpl
