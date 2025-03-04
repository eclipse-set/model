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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Geodaten.GEO_PAD_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.GeodatenPackage;
import org.eclipse.set.model.planpro.Geodaten.HSystem_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt_Datum_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt_Hoehe_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.Neigung_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.Plan_Quelle_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hoehenpunkt Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.Hoehenpunkt_Allg_AttributeGroupImpl#getGEOPAD <em>GEOPAD</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.Hoehenpunkt_Allg_AttributeGroupImpl#getHoehenpunktDatum <em>Hoehenpunkt Datum</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.Hoehenpunkt_Allg_AttributeGroupImpl#getHoehenpunktHoehe <em>Hoehenpunkt Hoehe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.Hoehenpunkt_Allg_AttributeGroupImpl#getHSystem <em>HSystem</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.Hoehenpunkt_Allg_AttributeGroupImpl#getNeigung <em>Neigung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.Hoehenpunkt_Allg_AttributeGroupImpl#getPlanQuelle <em>Plan Quelle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Hoehenpunkt_Allg_AttributeGroupImpl extends EObjectImpl implements Hoehenpunkt_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getGEOPAD() <em>GEOPAD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEOPAD()
	 * @generated
	 * @ordered
	 */
	protected GEO_PAD_TypeClass gEOPAD;

	/**
	 * The cached value of the '{@link #getHoehenpunktDatum() <em>Hoehenpunkt Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoehenpunktDatum()
	 * @generated
	 * @ordered
	 */
	protected Hoehenpunkt_Datum_TypeClass hoehenpunktDatum;

	/**
	 * The cached value of the '{@link #getHoehenpunktHoehe() <em>Hoehenpunkt Hoehe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoehenpunktHoehe()
	 * @generated
	 * @ordered
	 */
	protected Hoehenpunkt_Hoehe_TypeClass hoehenpunktHoehe;

	/**
	 * The cached value of the '{@link #getHSystem() <em>HSystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHSystem()
	 * @generated
	 * @ordered
	 */
	protected HSystem_TypeClass hSystem;

	/**
	 * The cached value of the '{@link #getNeigung() <em>Neigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeigung()
	 * @generated
	 * @ordered
	 */
	protected Neigung_TypeClass neigung;

	/**
	 * The cached value of the '{@link #getPlanQuelle() <em>Plan Quelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanQuelle()
	 * @generated
	 * @ordered
	 */
	protected Plan_Quelle_TypeClass planQuelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hoehenpunkt_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_PAD_TypeClass getGEOPAD() {
		return gEOPAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGEOPAD(GEO_PAD_TypeClass newGEOPAD, NotificationChain msgs) {
		GEO_PAD_TypeClass oldGEOPAD = gEOPAD;
		gEOPAD = newGEOPAD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__GEOPAD, oldGEOPAD, newGEOPAD);
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
	public void setGEOPAD(GEO_PAD_TypeClass newGEOPAD) {
		if (newGEOPAD != gEOPAD) {
			NotificationChain msgs = null;
			if (gEOPAD != null)
				msgs = ((InternalEObject)gEOPAD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__GEOPAD, null, msgs);
			if (newGEOPAD != null)
				msgs = ((InternalEObject)newGEOPAD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__GEOPAD, null, msgs);
			msgs = basicSetGEOPAD(newGEOPAD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__GEOPAD, newGEOPAD, newGEOPAD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehenpunkt_Datum_TypeClass getHoehenpunktDatum() {
		return hoehenpunktDatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHoehenpunktDatum(Hoehenpunkt_Datum_TypeClass newHoehenpunktDatum, NotificationChain msgs) {
		Hoehenpunkt_Datum_TypeClass oldHoehenpunktDatum = hoehenpunktDatum;
		hoehenpunktDatum = newHoehenpunktDatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_DATUM, oldHoehenpunktDatum, newHoehenpunktDatum);
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
	public void setHoehenpunktDatum(Hoehenpunkt_Datum_TypeClass newHoehenpunktDatum) {
		if (newHoehenpunktDatum != hoehenpunktDatum) {
			NotificationChain msgs = null;
			if (hoehenpunktDatum != null)
				msgs = ((InternalEObject)hoehenpunktDatum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_DATUM, null, msgs);
			if (newHoehenpunktDatum != null)
				msgs = ((InternalEObject)newHoehenpunktDatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_DATUM, null, msgs);
			msgs = basicSetHoehenpunktDatum(newHoehenpunktDatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_DATUM, newHoehenpunktDatum, newHoehenpunktDatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehenpunkt_Hoehe_TypeClass getHoehenpunktHoehe() {
		return hoehenpunktHoehe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHoehenpunktHoehe(Hoehenpunkt_Hoehe_TypeClass newHoehenpunktHoehe, NotificationChain msgs) {
		Hoehenpunkt_Hoehe_TypeClass oldHoehenpunktHoehe = hoehenpunktHoehe;
		hoehenpunktHoehe = newHoehenpunktHoehe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_HOEHE, oldHoehenpunktHoehe, newHoehenpunktHoehe);
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
	public void setHoehenpunktHoehe(Hoehenpunkt_Hoehe_TypeClass newHoehenpunktHoehe) {
		if (newHoehenpunktHoehe != hoehenpunktHoehe) {
			NotificationChain msgs = null;
			if (hoehenpunktHoehe != null)
				msgs = ((InternalEObject)hoehenpunktHoehe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_HOEHE, null, msgs);
			if (newHoehenpunktHoehe != null)
				msgs = ((InternalEObject)newHoehenpunktHoehe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_HOEHE, null, msgs);
			msgs = basicSetHoehenpunktHoehe(newHoehenpunktHoehe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_HOEHE, newHoehenpunktHoehe, newHoehenpunktHoehe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HSystem_TypeClass getHSystem() {
		return hSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHSystem(HSystem_TypeClass newHSystem, NotificationChain msgs) {
		HSystem_TypeClass oldHSystem = hSystem;
		hSystem = newHSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HSYSTEM, oldHSystem, newHSystem);
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
	public void setHSystem(HSystem_TypeClass newHSystem) {
		if (newHSystem != hSystem) {
			NotificationChain msgs = null;
			if (hSystem != null)
				msgs = ((InternalEObject)hSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HSYSTEM, null, msgs);
			if (newHSystem != null)
				msgs = ((InternalEObject)newHSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HSYSTEM, null, msgs);
			msgs = basicSetHSystem(newHSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HSYSTEM, newHSystem, newHSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Neigung_TypeClass getNeigung() {
		return neigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeigung(Neigung_TypeClass newNeigung, NotificationChain msgs) {
		Neigung_TypeClass oldNeigung = neigung;
		neigung = newNeigung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__NEIGUNG, oldNeigung, newNeigung);
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
	public void setNeigung(Neigung_TypeClass newNeigung) {
		if (newNeigung != neigung) {
			NotificationChain msgs = null;
			if (neigung != null)
				msgs = ((InternalEObject)neigung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__NEIGUNG, null, msgs);
			if (newNeigung != null)
				msgs = ((InternalEObject)newNeigung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__NEIGUNG, null, msgs);
			msgs = basicSetNeigung(newNeigung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__NEIGUNG, newNeigung, newNeigung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Plan_Quelle_TypeClass getPlanQuelle() {
		return planQuelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanQuelle(Plan_Quelle_TypeClass newPlanQuelle, NotificationChain msgs) {
		Plan_Quelle_TypeClass oldPlanQuelle = planQuelle;
		planQuelle = newPlanQuelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, oldPlanQuelle, newPlanQuelle);
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
	public void setPlanQuelle(Plan_Quelle_TypeClass newPlanQuelle) {
		if (newPlanQuelle != planQuelle) {
			NotificationChain msgs = null;
			if (planQuelle != null)
				msgs = ((InternalEObject)planQuelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, null, msgs);
			if (newPlanQuelle != null)
				msgs = ((InternalEObject)newPlanQuelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, null, msgs);
			msgs = basicSetPlanQuelle(newPlanQuelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, newPlanQuelle, newPlanQuelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__GEOPAD:
				return basicSetGEOPAD(null, msgs);
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_DATUM:
				return basicSetHoehenpunktDatum(null, msgs);
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_HOEHE:
				return basicSetHoehenpunktHoehe(null, msgs);
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HSYSTEM:
				return basicSetHSystem(null, msgs);
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__NEIGUNG:
				return basicSetNeigung(null, msgs);
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return basicSetPlanQuelle(null, msgs);
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
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__GEOPAD:
				return getGEOPAD();
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_DATUM:
				return getHoehenpunktDatum();
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_HOEHE:
				return getHoehenpunktHoehe();
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HSYSTEM:
				return getHSystem();
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__NEIGUNG:
				return getNeigung();
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return getPlanQuelle();
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
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__GEOPAD:
				setGEOPAD((GEO_PAD_TypeClass)newValue);
				return;
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_DATUM:
				setHoehenpunktDatum((Hoehenpunkt_Datum_TypeClass)newValue);
				return;
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_HOEHE:
				setHoehenpunktHoehe((Hoehenpunkt_Hoehe_TypeClass)newValue);
				return;
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HSYSTEM:
				setHSystem((HSystem_TypeClass)newValue);
				return;
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__NEIGUNG:
				setNeigung((Neigung_TypeClass)newValue);
				return;
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				setPlanQuelle((Plan_Quelle_TypeClass)newValue);
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
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__GEOPAD:
				setGEOPAD((GEO_PAD_TypeClass)null);
				return;
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_DATUM:
				setHoehenpunktDatum((Hoehenpunkt_Datum_TypeClass)null);
				return;
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_HOEHE:
				setHoehenpunktHoehe((Hoehenpunkt_Hoehe_TypeClass)null);
				return;
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HSYSTEM:
				setHSystem((HSystem_TypeClass)null);
				return;
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__NEIGUNG:
				setNeigung((Neigung_TypeClass)null);
				return;
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				setPlanQuelle((Plan_Quelle_TypeClass)null);
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
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__GEOPAD:
				return gEOPAD != null;
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_DATUM:
				return hoehenpunktDatum != null;
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HOEHENPUNKT_HOEHE:
				return hoehenpunktHoehe != null;
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__HSYSTEM:
				return hSystem != null;
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__NEIGUNG:
				return neigung != null;
			case GeodatenPackage.HOEHENPUNKT_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return planQuelle != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Hoehenpunkt_Allg_AttributeGroupImpl
