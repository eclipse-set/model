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
import org.eclipse.set.model.planpro.Geodaten.Plan_Quelle_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.Ueberhoehung_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Geodaten.Ueberhoehung_Datum_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.Ueberhoehung_Hoehe_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ueberhoehung Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.Ueberhoehung_Allg_AttributeGroupImpl#getGEOPAD <em>GEOPAD</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.Ueberhoehung_Allg_AttributeGroupImpl#getPlanQuelle <em>Plan Quelle</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.Ueberhoehung_Allg_AttributeGroupImpl#getUeberhoehungDatum <em>Ueberhoehung Datum</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.Ueberhoehung_Allg_AttributeGroupImpl#getUeberhoehungHoehe <em>Ueberhoehung Hoehe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Ueberhoehung_Allg_AttributeGroupImpl extends EObjectImpl implements Ueberhoehung_Allg_AttributeGroup {
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
	 * The cached value of the '{@link #getPlanQuelle() <em>Plan Quelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanQuelle()
	 * @generated
	 * @ordered
	 */
	protected Plan_Quelle_TypeClass planQuelle;

	/**
	 * The cached value of the '{@link #getUeberhoehungDatum() <em>Ueberhoehung Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUeberhoehungDatum()
	 * @generated
	 * @ordered
	 */
	protected Ueberhoehung_Datum_TypeClass ueberhoehungDatum;

	/**
	 * The cached value of the '{@link #getUeberhoehungHoehe() <em>Ueberhoehung Hoehe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUeberhoehungHoehe()
	 * @generated
	 * @ordered
	 */
	protected Ueberhoehung_Hoehe_TypeClass ueberhoehungHoehe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ueberhoehung_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__GEOPAD, oldGEOPAD, newGEOPAD);
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
				msgs = ((InternalEObject)gEOPAD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__GEOPAD, null, msgs);
			if (newGEOPAD != null)
				msgs = ((InternalEObject)newGEOPAD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__GEOPAD, null, msgs);
			msgs = basicSetGEOPAD(newGEOPAD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__GEOPAD, newGEOPAD, newGEOPAD));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, oldPlanQuelle, newPlanQuelle);
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
				msgs = ((InternalEObject)planQuelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, null, msgs);
			if (newPlanQuelle != null)
				msgs = ((InternalEObject)newPlanQuelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, null, msgs);
			msgs = basicSetPlanQuelle(newPlanQuelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, newPlanQuelle, newPlanQuelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberhoehung_Datum_TypeClass getUeberhoehungDatum() {
		return ueberhoehungDatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUeberhoehungDatum(Ueberhoehung_Datum_TypeClass newUeberhoehungDatum, NotificationChain msgs) {
		Ueberhoehung_Datum_TypeClass oldUeberhoehungDatum = ueberhoehungDatum;
		ueberhoehungDatum = newUeberhoehungDatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_DATUM, oldUeberhoehungDatum, newUeberhoehungDatum);
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
	public void setUeberhoehungDatum(Ueberhoehung_Datum_TypeClass newUeberhoehungDatum) {
		if (newUeberhoehungDatum != ueberhoehungDatum) {
			NotificationChain msgs = null;
			if (ueberhoehungDatum != null)
				msgs = ((InternalEObject)ueberhoehungDatum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_DATUM, null, msgs);
			if (newUeberhoehungDatum != null)
				msgs = ((InternalEObject)newUeberhoehungDatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_DATUM, null, msgs);
			msgs = basicSetUeberhoehungDatum(newUeberhoehungDatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_DATUM, newUeberhoehungDatum, newUeberhoehungDatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberhoehung_Hoehe_TypeClass getUeberhoehungHoehe() {
		return ueberhoehungHoehe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUeberhoehungHoehe(Ueberhoehung_Hoehe_TypeClass newUeberhoehungHoehe, NotificationChain msgs) {
		Ueberhoehung_Hoehe_TypeClass oldUeberhoehungHoehe = ueberhoehungHoehe;
		ueberhoehungHoehe = newUeberhoehungHoehe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_HOEHE, oldUeberhoehungHoehe, newUeberhoehungHoehe);
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
	public void setUeberhoehungHoehe(Ueberhoehung_Hoehe_TypeClass newUeberhoehungHoehe) {
		if (newUeberhoehungHoehe != ueberhoehungHoehe) {
			NotificationChain msgs = null;
			if (ueberhoehungHoehe != null)
				msgs = ((InternalEObject)ueberhoehungHoehe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_HOEHE, null, msgs);
			if (newUeberhoehungHoehe != null)
				msgs = ((InternalEObject)newUeberhoehungHoehe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_HOEHE, null, msgs);
			msgs = basicSetUeberhoehungHoehe(newUeberhoehungHoehe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_HOEHE, newUeberhoehungHoehe, newUeberhoehungHoehe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__GEOPAD:
				return basicSetGEOPAD(null, msgs);
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return basicSetPlanQuelle(null, msgs);
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_DATUM:
				return basicSetUeberhoehungDatum(null, msgs);
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_HOEHE:
				return basicSetUeberhoehungHoehe(null, msgs);
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
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__GEOPAD:
				return getGEOPAD();
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return getPlanQuelle();
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_DATUM:
				return getUeberhoehungDatum();
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_HOEHE:
				return getUeberhoehungHoehe();
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
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__GEOPAD:
				setGEOPAD((GEO_PAD_TypeClass)newValue);
				return;
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				setPlanQuelle((Plan_Quelle_TypeClass)newValue);
				return;
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_DATUM:
				setUeberhoehungDatum((Ueberhoehung_Datum_TypeClass)newValue);
				return;
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_HOEHE:
				setUeberhoehungHoehe((Ueberhoehung_Hoehe_TypeClass)newValue);
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
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__GEOPAD:
				setGEOPAD((GEO_PAD_TypeClass)null);
				return;
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				setPlanQuelle((Plan_Quelle_TypeClass)null);
				return;
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_DATUM:
				setUeberhoehungDatum((Ueberhoehung_Datum_TypeClass)null);
				return;
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_HOEHE:
				setUeberhoehungHoehe((Ueberhoehung_Hoehe_TypeClass)null);
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
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__GEOPAD:
				return gEOPAD != null;
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return planQuelle != null;
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_DATUM:
				return ueberhoehungDatum != null;
			case GeodatenPackage.UEBERHOEHUNG_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNG_HOEHE:
				return ueberhoehungHoehe != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Ueberhoehung_Allg_AttributeGroupImpl
