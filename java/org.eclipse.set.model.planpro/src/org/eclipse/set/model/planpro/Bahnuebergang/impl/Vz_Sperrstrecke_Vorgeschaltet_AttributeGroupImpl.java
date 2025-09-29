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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.planpro.Bahnuebergang.Beeinflussung_Strassenverkehr_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Raeumstrecke_DAB_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Raeumstrecke_DBK_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Raeumstrecke_DCK_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Raeumstrecke_DSK_Strich_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vz Sperrstrecke Vorgeschaltet Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroupImpl#getBeeinflussungStrassenverkehr <em>Beeinflussung Strassenverkehr</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroupImpl#getRaeumstreckeDAB <em>Raeumstrecke DAB</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroupImpl#getRaeumstreckeDBK <em>Raeumstrecke DBK</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroupImpl#getRaeumstreckeDCK <em>Raeumstrecke DCK</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Vz_Sperrstrecke_Vorgeschaltet_AttributeGroupImpl#getRaeumstreckeDSKStrich <em>Raeumstrecke DSK Strich</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Vz_Sperrstrecke_Vorgeschaltet_AttributeGroupImpl extends EObjectImpl implements Vz_Sperrstrecke_Vorgeschaltet_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBeeinflussungStrassenverkehr() <em>Beeinflussung Strassenverkehr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeeinflussungStrassenverkehr()
	 * @generated
	 * @ordered
	 */
	protected Beeinflussung_Strassenverkehr_TypeClass beeinflussungStrassenverkehr;

	/**
	 * The cached value of the '{@link #getRaeumstreckeDAB() <em>Raeumstrecke DAB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaeumstreckeDAB()
	 * @generated
	 * @ordered
	 */
	protected Raeumstrecke_DAB_TypeClass raeumstreckeDAB;

	/**
	 * The cached value of the '{@link #getRaeumstreckeDBK() <em>Raeumstrecke DBK</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaeumstreckeDBK()
	 * @generated
	 * @ordered
	 */
	protected Raeumstrecke_DBK_TypeClass raeumstreckeDBK;

	/**
	 * The cached value of the '{@link #getRaeumstreckeDCK() <em>Raeumstrecke DCK</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaeumstreckeDCK()
	 * @generated
	 * @ordered
	 */
	protected Raeumstrecke_DCK_TypeClass raeumstreckeDCK;

	/**
	 * The cached value of the '{@link #getRaeumstreckeDSKStrich() <em>Raeumstrecke DSK Strich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaeumstreckeDSKStrich()
	 * @generated
	 * @ordered
	 */
	protected Raeumstrecke_DSK_Strich_TypeClass raeumstreckeDSKStrich;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vz_Sperrstrecke_Vorgeschaltet_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getVz_Sperrstrecke_Vorgeschaltet_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Beeinflussung_Strassenverkehr_TypeClass getBeeinflussungStrassenverkehr() {
		return beeinflussungStrassenverkehr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeeinflussungStrassenverkehr(Beeinflussung_Strassenverkehr_TypeClass newBeeinflussungStrassenverkehr, NotificationChain msgs) {
		Beeinflussung_Strassenverkehr_TypeClass oldBeeinflussungStrassenverkehr = beeinflussungStrassenverkehr;
		beeinflussungStrassenverkehr = newBeeinflussungStrassenverkehr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__BEEINFLUSSUNG_STRASSENVERKEHR, oldBeeinflussungStrassenverkehr, newBeeinflussungStrassenverkehr);
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
	public void setBeeinflussungStrassenverkehr(Beeinflussung_Strassenverkehr_TypeClass newBeeinflussungStrassenverkehr) {
		if (newBeeinflussungStrassenverkehr != beeinflussungStrassenverkehr) {
			NotificationChain msgs = null;
			if (beeinflussungStrassenverkehr != null)
				msgs = ((InternalEObject)beeinflussungStrassenverkehr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__BEEINFLUSSUNG_STRASSENVERKEHR, null, msgs);
			if (newBeeinflussungStrassenverkehr != null)
				msgs = ((InternalEObject)newBeeinflussungStrassenverkehr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__BEEINFLUSSUNG_STRASSENVERKEHR, null, msgs);
			msgs = basicSetBeeinflussungStrassenverkehr(newBeeinflussungStrassenverkehr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__BEEINFLUSSUNG_STRASSENVERKEHR, newBeeinflussungStrassenverkehr, newBeeinflussungStrassenverkehr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Raeumstrecke_DAB_TypeClass getRaeumstreckeDAB() {
		return raeumstreckeDAB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRaeumstreckeDAB(Raeumstrecke_DAB_TypeClass newRaeumstreckeDAB, NotificationChain msgs) {
		Raeumstrecke_DAB_TypeClass oldRaeumstreckeDAB = raeumstreckeDAB;
		raeumstreckeDAB = newRaeumstreckeDAB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DAB, oldRaeumstreckeDAB, newRaeumstreckeDAB);
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
	public void setRaeumstreckeDAB(Raeumstrecke_DAB_TypeClass newRaeumstreckeDAB) {
		if (newRaeumstreckeDAB != raeumstreckeDAB) {
			NotificationChain msgs = null;
			if (raeumstreckeDAB != null)
				msgs = ((InternalEObject)raeumstreckeDAB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DAB, null, msgs);
			if (newRaeumstreckeDAB != null)
				msgs = ((InternalEObject)newRaeumstreckeDAB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DAB, null, msgs);
			msgs = basicSetRaeumstreckeDAB(newRaeumstreckeDAB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DAB, newRaeumstreckeDAB, newRaeumstreckeDAB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Raeumstrecke_DBK_TypeClass getRaeumstreckeDBK() {
		return raeumstreckeDBK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRaeumstreckeDBK(Raeumstrecke_DBK_TypeClass newRaeumstreckeDBK, NotificationChain msgs) {
		Raeumstrecke_DBK_TypeClass oldRaeumstreckeDBK = raeumstreckeDBK;
		raeumstreckeDBK = newRaeumstreckeDBK;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DBK, oldRaeumstreckeDBK, newRaeumstreckeDBK);
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
	public void setRaeumstreckeDBK(Raeumstrecke_DBK_TypeClass newRaeumstreckeDBK) {
		if (newRaeumstreckeDBK != raeumstreckeDBK) {
			NotificationChain msgs = null;
			if (raeumstreckeDBK != null)
				msgs = ((InternalEObject)raeumstreckeDBK).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DBK, null, msgs);
			if (newRaeumstreckeDBK != null)
				msgs = ((InternalEObject)newRaeumstreckeDBK).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DBK, null, msgs);
			msgs = basicSetRaeumstreckeDBK(newRaeumstreckeDBK, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DBK, newRaeumstreckeDBK, newRaeumstreckeDBK));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Raeumstrecke_DCK_TypeClass getRaeumstreckeDCK() {
		return raeumstreckeDCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRaeumstreckeDCK(Raeumstrecke_DCK_TypeClass newRaeumstreckeDCK, NotificationChain msgs) {
		Raeumstrecke_DCK_TypeClass oldRaeumstreckeDCK = raeumstreckeDCK;
		raeumstreckeDCK = newRaeumstreckeDCK;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DCK, oldRaeumstreckeDCK, newRaeumstreckeDCK);
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
	public void setRaeumstreckeDCK(Raeumstrecke_DCK_TypeClass newRaeumstreckeDCK) {
		if (newRaeumstreckeDCK != raeumstreckeDCK) {
			NotificationChain msgs = null;
			if (raeumstreckeDCK != null)
				msgs = ((InternalEObject)raeumstreckeDCK).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DCK, null, msgs);
			if (newRaeumstreckeDCK != null)
				msgs = ((InternalEObject)newRaeumstreckeDCK).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DCK, null, msgs);
			msgs = basicSetRaeumstreckeDCK(newRaeumstreckeDCK, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DCK, newRaeumstreckeDCK, newRaeumstreckeDCK));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Raeumstrecke_DSK_Strich_TypeClass getRaeumstreckeDSKStrich() {
		return raeumstreckeDSKStrich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRaeumstreckeDSKStrich(Raeumstrecke_DSK_Strich_TypeClass newRaeumstreckeDSKStrich, NotificationChain msgs) {
		Raeumstrecke_DSK_Strich_TypeClass oldRaeumstreckeDSKStrich = raeumstreckeDSKStrich;
		raeumstreckeDSKStrich = newRaeumstreckeDSKStrich;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DSK_STRICH, oldRaeumstreckeDSKStrich, newRaeumstreckeDSKStrich);
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
	public void setRaeumstreckeDSKStrich(Raeumstrecke_DSK_Strich_TypeClass newRaeumstreckeDSKStrich) {
		if (newRaeumstreckeDSKStrich != raeumstreckeDSKStrich) {
			NotificationChain msgs = null;
			if (raeumstreckeDSKStrich != null)
				msgs = ((InternalEObject)raeumstreckeDSKStrich).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DSK_STRICH, null, msgs);
			if (newRaeumstreckeDSKStrich != null)
				msgs = ((InternalEObject)newRaeumstreckeDSKStrich).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DSK_STRICH, null, msgs);
			msgs = basicSetRaeumstreckeDSKStrich(newRaeumstreckeDSKStrich, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DSK_STRICH, newRaeumstreckeDSKStrich, newRaeumstreckeDSKStrich));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__BEEINFLUSSUNG_STRASSENVERKEHR:
				return basicSetBeeinflussungStrassenverkehr(null, msgs);
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DAB:
				return basicSetRaeumstreckeDAB(null, msgs);
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DBK:
				return basicSetRaeumstreckeDBK(null, msgs);
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DCK:
				return basicSetRaeumstreckeDCK(null, msgs);
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DSK_STRICH:
				return basicSetRaeumstreckeDSKStrich(null, msgs);
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
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__BEEINFLUSSUNG_STRASSENVERKEHR:
				return getBeeinflussungStrassenverkehr();
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DAB:
				return getRaeumstreckeDAB();
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DBK:
				return getRaeumstreckeDBK();
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DCK:
				return getRaeumstreckeDCK();
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DSK_STRICH:
				return getRaeumstreckeDSKStrich();
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
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__BEEINFLUSSUNG_STRASSENVERKEHR:
				setBeeinflussungStrassenverkehr((Beeinflussung_Strassenverkehr_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DAB:
				setRaeumstreckeDAB((Raeumstrecke_DAB_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DBK:
				setRaeumstreckeDBK((Raeumstrecke_DBK_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DCK:
				setRaeumstreckeDCK((Raeumstrecke_DCK_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DSK_STRICH:
				setRaeumstreckeDSKStrich((Raeumstrecke_DSK_Strich_TypeClass)newValue);
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
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__BEEINFLUSSUNG_STRASSENVERKEHR:
				setBeeinflussungStrassenverkehr((Beeinflussung_Strassenverkehr_TypeClass)null);
				return;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DAB:
				setRaeumstreckeDAB((Raeumstrecke_DAB_TypeClass)null);
				return;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DBK:
				setRaeumstreckeDBK((Raeumstrecke_DBK_TypeClass)null);
				return;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DCK:
				setRaeumstreckeDCK((Raeumstrecke_DCK_TypeClass)null);
				return;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DSK_STRICH:
				setRaeumstreckeDSKStrich((Raeumstrecke_DSK_Strich_TypeClass)null);
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
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__BEEINFLUSSUNG_STRASSENVERKEHR:
				return beeinflussungStrassenverkehr != null;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DAB:
				return raeumstreckeDAB != null;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DBK:
				return raeumstreckeDBK != null;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DCK:
				return raeumstreckeDCK != null;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_VORGESCHALTET_ATTRIBUTE_GROUP__RAEUMSTRECKE_DSK_STRICH:
				return raeumstreckeDSKStrich != null;
		}
		return super.eIsSet(featureID);
	}

} //Vz_Sperrstrecke_Vorgeschaltet_AttributeGroupImpl
