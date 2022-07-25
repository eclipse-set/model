/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.Akustikdauer_Anb_Ann_TypeClass;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.Akustikdauer_Sonst_TypeClass;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.Akustikdauer_Voranz_TypeClass;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Akustik_Anzeigefeld_AttributeGroup;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Akustik Anzeigefeld Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_Akustik_Anzeigefeld_AttributeGroupImpl#getAkustikdauerAnbAnn <em>Akustikdauer Anb Ann</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_Akustik_Anzeigefeld_AttributeGroupImpl#getAkustikdauerSonst <em>Akustikdauer Sonst</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_Akustik_Anzeigefeld_AttributeGroupImpl#getAkustikdauerVoranz <em>Akustikdauer Voranz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_Akustik_Anzeigefeld_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZN_Akustik_Anzeigefeld_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAkustikdauerAnbAnn() <em>Akustikdauer Anb Ann</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAkustikdauerAnbAnn()
	 * @generated
	 * @ordered
	 */
	protected Akustikdauer_Anb_Ann_TypeClass akustikdauerAnbAnn;

	/**
	 * The cached value of the '{@link #getAkustikdauerSonst() <em>Akustikdauer Sonst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAkustikdauerSonst()
	 * @generated
	 * @ordered
	 */
	protected Akustikdauer_Sonst_TypeClass akustikdauerSonst;

	/**
	 * The cached value of the '{@link #getAkustikdauerVoranz() <em>Akustikdauer Voranz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAkustikdauerVoranz()
	 * @generated
	 * @ordered
	 */
	protected Akustikdauer_Voranz_TypeClass akustikdauerVoranz;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_Akustik_Anzeigefeld_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Akustikdauer_Anb_Ann_TypeClass getAkustikdauerAnbAnn() {
		return akustikdauerAnbAnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAkustikdauerAnbAnn(Akustikdauer_Anb_Ann_TypeClass newAkustikdauerAnbAnn, NotificationChain msgs) {
		Akustikdauer_Anb_Ann_TypeClass oldAkustikdauerAnbAnn = akustikdauerAnbAnn;
		akustikdauerAnbAnn = newAkustikdauerAnbAnn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_ANB_ANN, oldAkustikdauerAnbAnn, newAkustikdauerAnbAnn);
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
	public void setAkustikdauerAnbAnn(Akustikdauer_Anb_Ann_TypeClass newAkustikdauerAnbAnn) {
		if (newAkustikdauerAnbAnn != akustikdauerAnbAnn) {
			NotificationChain msgs = null;
			if (akustikdauerAnbAnn != null)
				msgs = ((InternalEObject)akustikdauerAnbAnn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_ANB_ANN, null, msgs);
			if (newAkustikdauerAnbAnn != null)
				msgs = ((InternalEObject)newAkustikdauerAnbAnn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_ANB_ANN, null, msgs);
			msgs = basicSetAkustikdauerAnbAnn(newAkustikdauerAnbAnn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_ANB_ANN, newAkustikdauerAnbAnn, newAkustikdauerAnbAnn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Akustikdauer_Sonst_TypeClass getAkustikdauerSonst() {
		return akustikdauerSonst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAkustikdauerSonst(Akustikdauer_Sonst_TypeClass newAkustikdauerSonst, NotificationChain msgs) {
		Akustikdauer_Sonst_TypeClass oldAkustikdauerSonst = akustikdauerSonst;
		akustikdauerSonst = newAkustikdauerSonst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_SONST, oldAkustikdauerSonst, newAkustikdauerSonst);
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
	public void setAkustikdauerSonst(Akustikdauer_Sonst_TypeClass newAkustikdauerSonst) {
		if (newAkustikdauerSonst != akustikdauerSonst) {
			NotificationChain msgs = null;
			if (akustikdauerSonst != null)
				msgs = ((InternalEObject)akustikdauerSonst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_SONST, null, msgs);
			if (newAkustikdauerSonst != null)
				msgs = ((InternalEObject)newAkustikdauerSonst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_SONST, null, msgs);
			msgs = basicSetAkustikdauerSonst(newAkustikdauerSonst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_SONST, newAkustikdauerSonst, newAkustikdauerSonst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Akustikdauer_Voranz_TypeClass getAkustikdauerVoranz() {
		return akustikdauerVoranz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAkustikdauerVoranz(Akustikdauer_Voranz_TypeClass newAkustikdauerVoranz, NotificationChain msgs) {
		Akustikdauer_Voranz_TypeClass oldAkustikdauerVoranz = akustikdauerVoranz;
		akustikdauerVoranz = newAkustikdauerVoranz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_VORANZ, oldAkustikdauerVoranz, newAkustikdauerVoranz);
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
	public void setAkustikdauerVoranz(Akustikdauer_Voranz_TypeClass newAkustikdauerVoranz) {
		if (newAkustikdauerVoranz != akustikdauerVoranz) {
			NotificationChain msgs = null;
			if (akustikdauerVoranz != null)
				msgs = ((InternalEObject)akustikdauerVoranz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_VORANZ, null, msgs);
			if (newAkustikdauerVoranz != null)
				msgs = ((InternalEObject)newAkustikdauerVoranz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_VORANZ, null, msgs);
			msgs = basicSetAkustikdauerVoranz(newAkustikdauerVoranz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_VORANZ, newAkustikdauerVoranz, newAkustikdauerVoranz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_ANB_ANN:
				return basicSetAkustikdauerAnbAnn(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_SONST:
				return basicSetAkustikdauerSonst(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_VORANZ:
				return basicSetAkustikdauerVoranz(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_ANB_ANN:
				return getAkustikdauerAnbAnn();
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_SONST:
				return getAkustikdauerSonst();
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_VORANZ:
				return getAkustikdauerVoranz();
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
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_ANB_ANN:
				setAkustikdauerAnbAnn((Akustikdauer_Anb_Ann_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_SONST:
				setAkustikdauerSonst((Akustikdauer_Sonst_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_VORANZ:
				setAkustikdauerVoranz((Akustikdauer_Voranz_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_ANB_ANN:
				setAkustikdauerAnbAnn((Akustikdauer_Anb_Ann_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_SONST:
				setAkustikdauerSonst((Akustikdauer_Sonst_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_VORANZ:
				setAkustikdauerVoranz((Akustikdauer_Voranz_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_ANB_ANN:
				return akustikdauerAnbAnn != null;
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_SONST:
				return akustikdauerSonst != null;
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK_ANZEIGEFELD_ATTRIBUTE_GROUP__AKUSTIKDAUER_VORANZ:
				return akustikdauerVoranz != null;
		}
		return super.eIsSet(featureID);
	}

} //ZN_Akustik_Anzeigefeld_AttributeGroupImpl
