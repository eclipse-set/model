/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Stellwerk_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZN_Unterstation_TypeClass;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZNImpl#getIDAnhangZNPlanBedienraum <em>ID Anhang ZN Plan Bedienraum</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZNImpl#getIDAnhangZNPlanRechnerraum <em>ID Anhang ZN Plan Rechnerraum</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZNImpl#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZNImpl#getIDStellwerk <em>ID Stellwerk</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZNImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZNImpl#getIDZNUnterstation <em>IDZN Unterstation</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZNImpl#getZNAllg <em>ZN Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZNImpl extends Basis_ObjektImpl implements ZN {
	/**
	 * The cached value of the '{@link #getIDAnhangZNPlanBedienraum() <em>ID Anhang ZN Plan Bedienraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangZNPlanBedienraum()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangZNPlanBedienraum;

	/**
	 * The cached value of the '{@link #getIDAnhangZNPlanRechnerraum() <em>ID Anhang ZN Plan Rechnerraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangZNPlanRechnerraum()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangZNPlanRechnerraum;

	/**
	 * The cached value of the '{@link #getIDOertlichkeit() <em>ID Oertlichkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeit()
	 * @generated
	 * @ordered
	 */
	protected ID_Oertlichkeit_TypeClass iDOertlichkeit;

	/**
	 * The cached value of the '{@link #getIDStellwerk() <em>ID Stellwerk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStellwerk()
	 * @generated
	 * @ordered
	 */
	protected ID_Stellwerk_TypeClass iDStellwerk;

	/**
	 * The cached value of the '{@link #getIDUnterbringung() <em>ID Unterbringung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUnterbringung()
	 * @generated
	 * @ordered
	 */
	protected ID_Unterbringung_TypeClass iDUnterbringung;

	/**
	 * The cached value of the '{@link #getIDZNUnterstation() <em>IDZN Unterstation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZNUnterstation()
	 * @generated
	 * @ordered
	 */
	protected ID_ZN_Unterstation_TypeClass iDZNUnterstation;

	/**
	 * The cached value of the '{@link #getZNAllg() <em>ZN Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNAllg()
	 * @generated
	 * @ordered
	 */
	protected ZN_Allg_AttributeGroup zNAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass getIDAnhangZNPlanBedienraum() {
		return iDAnhangZNPlanBedienraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangZNPlanBedienraum(ID_Anhang_TypeClass newIDAnhangZNPlanBedienraum, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangZNPlanBedienraum = iDAnhangZNPlanBedienraum;
		iDAnhangZNPlanBedienraum = newIDAnhangZNPlanBedienraum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_BEDIENRAUM, oldIDAnhangZNPlanBedienraum, newIDAnhangZNPlanBedienraum);
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
	public void setIDAnhangZNPlanBedienraum(ID_Anhang_TypeClass newIDAnhangZNPlanBedienraum) {
		if (newIDAnhangZNPlanBedienraum != iDAnhangZNPlanBedienraum) {
			NotificationChain msgs = null;
			if (iDAnhangZNPlanBedienraum != null)
				msgs = ((InternalEObject)iDAnhangZNPlanBedienraum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_BEDIENRAUM, null, msgs);
			if (newIDAnhangZNPlanBedienraum != null)
				msgs = ((InternalEObject)newIDAnhangZNPlanBedienraum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_BEDIENRAUM, null, msgs);
			msgs = basicSetIDAnhangZNPlanBedienraum(newIDAnhangZNPlanBedienraum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_BEDIENRAUM, newIDAnhangZNPlanBedienraum, newIDAnhangZNPlanBedienraum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass getIDAnhangZNPlanRechnerraum() {
		return iDAnhangZNPlanRechnerraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangZNPlanRechnerraum(ID_Anhang_TypeClass newIDAnhangZNPlanRechnerraum, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangZNPlanRechnerraum = iDAnhangZNPlanRechnerraum;
		iDAnhangZNPlanRechnerraum = newIDAnhangZNPlanRechnerraum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_RECHNERRAUM, oldIDAnhangZNPlanRechnerraum, newIDAnhangZNPlanRechnerraum);
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
	public void setIDAnhangZNPlanRechnerraum(ID_Anhang_TypeClass newIDAnhangZNPlanRechnerraum) {
		if (newIDAnhangZNPlanRechnerraum != iDAnhangZNPlanRechnerraum) {
			NotificationChain msgs = null;
			if (iDAnhangZNPlanRechnerraum != null)
				msgs = ((InternalEObject)iDAnhangZNPlanRechnerraum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_RECHNERRAUM, null, msgs);
			if (newIDAnhangZNPlanRechnerraum != null)
				msgs = ((InternalEObject)newIDAnhangZNPlanRechnerraum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_RECHNERRAUM, null, msgs);
			msgs = basicSetIDAnhangZNPlanRechnerraum(newIDAnhangZNPlanRechnerraum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_RECHNERRAUM, newIDAnhangZNPlanRechnerraum, newIDAnhangZNPlanRechnerraum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Oertlichkeit_TypeClass getIDOertlichkeit() {
		return iDOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDOertlichkeit(ID_Oertlichkeit_TypeClass newIDOertlichkeit, NotificationChain msgs) {
		ID_Oertlichkeit_TypeClass oldIDOertlichkeit = iDOertlichkeit;
		iDOertlichkeit = newIDOertlichkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ID_OERTLICHKEIT, oldIDOertlichkeit, newIDOertlichkeit);
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
	public void setIDOertlichkeit(ID_Oertlichkeit_TypeClass newIDOertlichkeit) {
		if (newIDOertlichkeit != iDOertlichkeit) {
			NotificationChain msgs = null;
			if (iDOertlichkeit != null)
				msgs = ((InternalEObject)iDOertlichkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN__ID_OERTLICHKEIT, null, msgs);
			if (newIDOertlichkeit != null)
				msgs = ((InternalEObject)newIDOertlichkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN__ID_OERTLICHKEIT, null, msgs);
			msgs = basicSetIDOertlichkeit(newIDOertlichkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ID_OERTLICHKEIT, newIDOertlichkeit, newIDOertlichkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Stellwerk_TypeClass getIDStellwerk() {
		return iDStellwerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDStellwerk(ID_Stellwerk_TypeClass newIDStellwerk, NotificationChain msgs) {
		ID_Stellwerk_TypeClass oldIDStellwerk = iDStellwerk;
		iDStellwerk = newIDStellwerk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ID_STELLWERK, oldIDStellwerk, newIDStellwerk);
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
	public void setIDStellwerk(ID_Stellwerk_TypeClass newIDStellwerk) {
		if (newIDStellwerk != iDStellwerk) {
			NotificationChain msgs = null;
			if (iDStellwerk != null)
				msgs = ((InternalEObject)iDStellwerk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN__ID_STELLWERK, null, msgs);
			if (newIDStellwerk != null)
				msgs = ((InternalEObject)newIDStellwerk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN__ID_STELLWERK, null, msgs);
			msgs = basicSetIDStellwerk(newIDStellwerk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ID_STELLWERK, newIDStellwerk, newIDStellwerk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Unterbringung_TypeClass getIDUnterbringung() {
		return iDUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDUnterbringung(ID_Unterbringung_TypeClass newIDUnterbringung, NotificationChain msgs) {
		ID_Unterbringung_TypeClass oldIDUnterbringung = iDUnterbringung;
		iDUnterbringung = newIDUnterbringung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ID_UNTERBRINGUNG, oldIDUnterbringung, newIDUnterbringung);
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
	public void setIDUnterbringung(ID_Unterbringung_TypeClass newIDUnterbringung) {
		if (newIDUnterbringung != iDUnterbringung) {
			NotificationChain msgs = null;
			if (iDUnterbringung != null)
				msgs = ((InternalEObject)iDUnterbringung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN__ID_UNTERBRINGUNG, null, msgs);
			if (newIDUnterbringung != null)
				msgs = ((InternalEObject)newIDUnterbringung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN__ID_UNTERBRINGUNG, null, msgs);
			msgs = basicSetIDUnterbringung(newIDUnterbringung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ID_UNTERBRINGUNG, newIDUnterbringung, newIDUnterbringung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZN_Unterstation_TypeClass getIDZNUnterstation() {
		return iDZNUnterstation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZNUnterstation(ID_ZN_Unterstation_TypeClass newIDZNUnterstation, NotificationChain msgs) {
		ID_ZN_Unterstation_TypeClass oldIDZNUnterstation = iDZNUnterstation;
		iDZNUnterstation = newIDZNUnterstation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__IDZN_UNTERSTATION, oldIDZNUnterstation, newIDZNUnterstation);
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
	public void setIDZNUnterstation(ID_ZN_Unterstation_TypeClass newIDZNUnterstation) {
		if (newIDZNUnterstation != iDZNUnterstation) {
			NotificationChain msgs = null;
			if (iDZNUnterstation != null)
				msgs = ((InternalEObject)iDZNUnterstation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN__IDZN_UNTERSTATION, null, msgs);
			if (newIDZNUnterstation != null)
				msgs = ((InternalEObject)newIDZNUnterstation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN__IDZN_UNTERSTATION, null, msgs);
			msgs = basicSetIDZNUnterstation(newIDZNUnterstation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__IDZN_UNTERSTATION, newIDZNUnterstation, newIDZNUnterstation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Allg_AttributeGroup getZNAllg() {
		return zNAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNAllg(ZN_Allg_AttributeGroup newZNAllg, NotificationChain msgs) {
		ZN_Allg_AttributeGroup oldZNAllg = zNAllg;
		zNAllg = newZNAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ZN_ALLG, oldZNAllg, newZNAllg);
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
	public void setZNAllg(ZN_Allg_AttributeGroup newZNAllg) {
		if (newZNAllg != zNAllg) {
			NotificationChain msgs = null;
			if (zNAllg != null)
				msgs = ((InternalEObject)zNAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN__ZN_ALLG, null, msgs);
			if (newZNAllg != null)
				msgs = ((InternalEObject)newZNAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN__ZN_ALLG, null, msgs);
			msgs = basicSetZNAllg(newZNAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ZN_ALLG, newZNAllg, newZNAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_BEDIENRAUM:
				return basicSetIDAnhangZNPlanBedienraum(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_RECHNERRAUM:
				return basicSetIDAnhangZNPlanRechnerraum(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN__ID_OERTLICHKEIT:
				return basicSetIDOertlichkeit(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN__ID_STELLWERK:
				return basicSetIDStellwerk(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN__ID_UNTERBRINGUNG:
				return basicSetIDUnterbringung(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN__IDZN_UNTERSTATION:
				return basicSetIDZNUnterstation(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN__ZN_ALLG:
				return basicSetZNAllg(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_BEDIENRAUM:
				return getIDAnhangZNPlanBedienraum();
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_RECHNERRAUM:
				return getIDAnhangZNPlanRechnerraum();
			case ZugnummernmeldeanlagePackage.ZN__ID_OERTLICHKEIT:
				return getIDOertlichkeit();
			case ZugnummernmeldeanlagePackage.ZN__ID_STELLWERK:
				return getIDStellwerk();
			case ZugnummernmeldeanlagePackage.ZN__ID_UNTERBRINGUNG:
				return getIDUnterbringung();
			case ZugnummernmeldeanlagePackage.ZN__IDZN_UNTERSTATION:
				return getIDZNUnterstation();
			case ZugnummernmeldeanlagePackage.ZN__ZN_ALLG:
				return getZNAllg();
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
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_BEDIENRAUM:
				setIDAnhangZNPlanBedienraum((ID_Anhang_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_RECHNERRAUM:
				setIDAnhangZNPlanRechnerraum((ID_Anhang_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN__ID_OERTLICHKEIT:
				setIDOertlichkeit((ID_Oertlichkeit_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN__ID_STELLWERK:
				setIDStellwerk((ID_Stellwerk_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN__IDZN_UNTERSTATION:
				setIDZNUnterstation((ID_ZN_Unterstation_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN__ZN_ALLG:
				setZNAllg((ZN_Allg_AttributeGroup)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_BEDIENRAUM:
				setIDAnhangZNPlanBedienraum((ID_Anhang_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_RECHNERRAUM:
				setIDAnhangZNPlanRechnerraum((ID_Anhang_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN__ID_OERTLICHKEIT:
				setIDOertlichkeit((ID_Oertlichkeit_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN__ID_STELLWERK:
				setIDStellwerk((ID_Stellwerk_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN__ID_UNTERBRINGUNG:
				setIDUnterbringung((ID_Unterbringung_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN__IDZN_UNTERSTATION:
				setIDZNUnterstation((ID_ZN_Unterstation_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN__ZN_ALLG:
				setZNAllg((ZN_Allg_AttributeGroup)null);
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
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_BEDIENRAUM:
				return iDAnhangZNPlanBedienraum != null;
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_RECHNERRAUM:
				return iDAnhangZNPlanRechnerraum != null;
			case ZugnummernmeldeanlagePackage.ZN__ID_OERTLICHKEIT:
				return iDOertlichkeit != null;
			case ZugnummernmeldeanlagePackage.ZN__ID_STELLWERK:
				return iDStellwerk != null;
			case ZugnummernmeldeanlagePackage.ZN__ID_UNTERBRINGUNG:
				return iDUnterbringung != null;
			case ZugnummernmeldeanlagePackage.ZN__IDZN_UNTERSTATION:
				return iDZNUnterstation != null;
			case ZugnummernmeldeanlagePackage.ZN__ZN_ALLG:
				return zNAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //ZNImpl
