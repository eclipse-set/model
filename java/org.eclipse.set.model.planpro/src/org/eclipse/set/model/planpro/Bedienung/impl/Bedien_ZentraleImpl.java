/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale;
import org.eclipse.set.model.planpro.Bedienung.Bedien_Zentrale_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;

import org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Strecke_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Zentrale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_ZentraleImpl#getIDAnhangPlanBedienraum <em>ID Anhang Plan Bedienraum</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_ZentraleImpl#getIDAnhangPlanRechnerraum <em>ID Anhang Plan Rechnerraum</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_ZentraleImpl#getIDStrecke <em>ID Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_ZentraleImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_ZentraleImpl#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_ZentraleImpl extends Basis_ObjektImpl implements Bedien_Zentrale {
	/**
	 * The cached value of the '{@link #getIDAnhangPlanBedienraum() <em>ID Anhang Plan Bedienraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangPlanBedienraum()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangPlanBedienraum;

	/**
	 * The cached value of the '{@link #getIDAnhangPlanRechnerraum() <em>ID Anhang Plan Rechnerraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangPlanRechnerraum()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangPlanRechnerraum;

	/**
	 * The cached value of the '{@link #getIDStrecke() <em>ID Strecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStrecke()
	 * @generated
	 * @ordered
	 */
	protected ID_Strecke_TypeClass iDStrecke;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Zentrale_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDOertlichkeit() <em>ID Oertlichkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeit()
	 * @generated
	 * @ordered
	 */
	protected ID_Oertlichkeit_Proxy_TypeClass iDOertlichkeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_ZentraleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_ZENTRALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass getIDAnhangPlanBedienraum() {
		return iDAnhangPlanBedienraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangPlanBedienraum(ID_Anhang_TypeClass newIDAnhangPlanBedienraum, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangPlanBedienraum = iDAnhangPlanBedienraum;
		iDAnhangPlanBedienraum = newIDAnhangPlanBedienraum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM, oldIDAnhangPlanBedienraum, newIDAnhangPlanBedienraum);
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
	public void setIDAnhangPlanBedienraum(ID_Anhang_TypeClass newIDAnhangPlanBedienraum) {
		if (newIDAnhangPlanBedienraum != iDAnhangPlanBedienraum) {
			NotificationChain msgs = null;
			if (iDAnhangPlanBedienraum != null)
				msgs = ((InternalEObject)iDAnhangPlanBedienraum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM, null, msgs);
			if (newIDAnhangPlanBedienraum != null)
				msgs = ((InternalEObject)newIDAnhangPlanBedienraum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM, null, msgs);
			msgs = basicSetIDAnhangPlanBedienraum(newIDAnhangPlanBedienraum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM, newIDAnhangPlanBedienraum, newIDAnhangPlanBedienraum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass getIDAnhangPlanRechnerraum() {
		return iDAnhangPlanRechnerraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangPlanRechnerraum(ID_Anhang_TypeClass newIDAnhangPlanRechnerraum, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangPlanRechnerraum = iDAnhangPlanRechnerraum;
		iDAnhangPlanRechnerraum = newIDAnhangPlanRechnerraum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM, oldIDAnhangPlanRechnerraum, newIDAnhangPlanRechnerraum);
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
	public void setIDAnhangPlanRechnerraum(ID_Anhang_TypeClass newIDAnhangPlanRechnerraum) {
		if (newIDAnhangPlanRechnerraum != iDAnhangPlanRechnerraum) {
			NotificationChain msgs = null;
			if (iDAnhangPlanRechnerraum != null)
				msgs = ((InternalEObject)iDAnhangPlanRechnerraum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM, null, msgs);
			if (newIDAnhangPlanRechnerraum != null)
				msgs = ((InternalEObject)newIDAnhangPlanRechnerraum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM, null, msgs);
			msgs = basicSetIDAnhangPlanRechnerraum(newIDAnhangPlanRechnerraum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM, newIDAnhangPlanRechnerraum, newIDAnhangPlanRechnerraum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Strecke_TypeClass getIDStrecke() {
		return iDStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDStrecke(ID_Strecke_TypeClass newIDStrecke, NotificationChain msgs) {
		ID_Strecke_TypeClass oldIDStrecke = iDStrecke;
		iDStrecke = newIDStrecke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE__ID_STRECKE, oldIDStrecke, newIDStrecke);
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
	public void setIDStrecke(ID_Strecke_TypeClass newIDStrecke) {
		if (newIDStrecke != iDStrecke) {
			NotificationChain msgs = null;
			if (iDStrecke != null)
				msgs = ((InternalEObject)iDStrecke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ZENTRALE__ID_STRECKE, null, msgs);
			if (newIDStrecke != null)
				msgs = ((InternalEObject)newIDStrecke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ZENTRALE__ID_STRECKE, null, msgs);
			msgs = basicSetIDStrecke(newIDStrecke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE__ID_STRECKE, newIDStrecke, newIDStrecke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Zentrale_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bedien_Zentrale_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bedien_Zentrale_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bedien_Zentrale_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Oertlichkeit_Proxy_TypeClass getIDOertlichkeit() {
		return iDOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDOertlichkeit(ID_Oertlichkeit_Proxy_TypeClass newIDOertlichkeit, NotificationChain msgs) {
		ID_Oertlichkeit_Proxy_TypeClass oldIDOertlichkeit = iDOertlichkeit;
		iDOertlichkeit = newIDOertlichkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE__ID_OERTLICHKEIT, oldIDOertlichkeit, newIDOertlichkeit);
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
	public void setIDOertlichkeit(ID_Oertlichkeit_Proxy_TypeClass newIDOertlichkeit) {
		if (newIDOertlichkeit != iDOertlichkeit) {
			NotificationChain msgs = null;
			if (iDOertlichkeit != null)
				msgs = ((InternalEObject)iDOertlichkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ZENTRALE__ID_OERTLICHKEIT, null, msgs);
			if (newIDOertlichkeit != null)
				msgs = ((InternalEObject)newIDOertlichkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ZENTRALE__ID_OERTLICHKEIT, null, msgs);
			msgs = basicSetIDOertlichkeit(newIDOertlichkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE__ID_OERTLICHKEIT, newIDOertlichkeit, newIDOertlichkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM:
				return basicSetIDAnhangPlanBedienraum(null, msgs);
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM:
				return basicSetIDAnhangPlanRechnerraum(null, msgs);
			case BedienungPackage.BEDIEN_ZENTRALE__ID_STRECKE:
				return basicSetIDStrecke(null, msgs);
			case BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case BedienungPackage.BEDIEN_ZENTRALE__ID_OERTLICHKEIT:
				return basicSetIDOertlichkeit(null, msgs);
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
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM:
				return getIDAnhangPlanBedienraum();
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM:
				return getIDAnhangPlanRechnerraum();
			case BedienungPackage.BEDIEN_ZENTRALE__ID_STRECKE:
				return getIDStrecke();
			case BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG:
				return getBezeichnung();
			case BedienungPackage.BEDIEN_ZENTRALE__ID_OERTLICHKEIT:
				return getIDOertlichkeit();
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
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM:
				setIDAnhangPlanBedienraum((ID_Anhang_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM:
				setIDAnhangPlanRechnerraum((ID_Anhang_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_ZENTRALE__ID_STRECKE:
				setIDStrecke((ID_Strecke_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG:
				setBezeichnung((Bedien_Zentrale_Bezeichnung_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_ZENTRALE__ID_OERTLICHKEIT:
				setIDOertlichkeit((ID_Oertlichkeit_Proxy_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM:
				setIDAnhangPlanBedienraum((ID_Anhang_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM:
				setIDAnhangPlanRechnerraum((ID_Anhang_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_ZENTRALE__ID_STRECKE:
				setIDStrecke((ID_Strecke_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG:
				setBezeichnung((Bedien_Zentrale_Bezeichnung_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_ZENTRALE__ID_OERTLICHKEIT:
				setIDOertlichkeit((ID_Oertlichkeit_Proxy_TypeClass)null);
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
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM:
				return iDAnhangPlanBedienraum != null;
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM:
				return iDAnhangPlanRechnerraum != null;
			case BedienungPackage.BEDIEN_ZENTRALE__ID_STRECKE:
				return iDStrecke != null;
			case BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG:
				return bezeichnung != null;
			case BedienungPackage.BEDIEN_ZENTRALE__ID_OERTLICHKEIT:
				return iDOertlichkeit != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_ZentraleImpl
