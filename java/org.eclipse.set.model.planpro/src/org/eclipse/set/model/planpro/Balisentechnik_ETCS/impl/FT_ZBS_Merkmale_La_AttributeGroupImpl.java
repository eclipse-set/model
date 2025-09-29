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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ZBS_Merkmale_La_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_La_Bereich_Distanz_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_La_Bereich_Geschwindigkeit_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_La_Bereich_Laenge_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_La_Bereich_Neigung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FT ZBS Merkmale La Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_La_AttributeGroupImpl#getZBSLaBereichDistanz <em>ZBS La Bereich Distanz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_La_AttributeGroupImpl#getZBSLaBereichGeschwindigkeit <em>ZBS La Bereich Geschwindigkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_La_AttributeGroupImpl#getZBSLaBereichLaenge <em>ZBS La Bereich Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ZBS_Merkmale_La_AttributeGroupImpl#getZBSLaBereichNeigung <em>ZBS La Bereich Neigung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FT_ZBS_Merkmale_La_AttributeGroupImpl extends EObjectImpl implements FT_ZBS_Merkmale_La_AttributeGroup {
	/**
	 * The cached value of the '{@link #getZBSLaBereichDistanz() <em>ZBS La Bereich Distanz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZBSLaBereichDistanz()
	 * @generated
	 * @ordered
	 */
	protected ZBS_La_Bereich_Distanz_TypeClass zBSLaBereichDistanz;

	/**
	 * The cached value of the '{@link #getZBSLaBereichGeschwindigkeit() <em>ZBS La Bereich Geschwindigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZBSLaBereichGeschwindigkeit()
	 * @generated
	 * @ordered
	 */
	protected ZBS_La_Bereich_Geschwindigkeit_TypeClass zBSLaBereichGeschwindigkeit;

	/**
	 * The cached value of the '{@link #getZBSLaBereichLaenge() <em>ZBS La Bereich Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZBSLaBereichLaenge()
	 * @generated
	 * @ordered
	 */
	protected ZBS_La_Bereich_Laenge_TypeClass zBSLaBereichLaenge;

	/**
	 * The cached value of the '{@link #getZBSLaBereichNeigung() <em>ZBS La Bereich Neigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZBSLaBereichNeigung()
	 * @generated
	 * @ordered
	 */
	protected ZBS_La_Bereich_Neigung_TypeClass zBSLaBereichNeigung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FT_ZBS_Merkmale_La_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getFT_ZBS_Merkmale_La_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_La_Bereich_Distanz_TypeClass getZBSLaBereichDistanz() {
		return zBSLaBereichDistanz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZBSLaBereichDistanz(ZBS_La_Bereich_Distanz_TypeClass newZBSLaBereichDistanz, NotificationChain msgs) {
		ZBS_La_Bereich_Distanz_TypeClass oldZBSLaBereichDistanz = zBSLaBereichDistanz;
		zBSLaBereichDistanz = newZBSLaBereichDistanz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_DISTANZ, oldZBSLaBereichDistanz, newZBSLaBereichDistanz);
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
	public void setZBSLaBereichDistanz(ZBS_La_Bereich_Distanz_TypeClass newZBSLaBereichDistanz) {
		if (newZBSLaBereichDistanz != zBSLaBereichDistanz) {
			NotificationChain msgs = null;
			if (zBSLaBereichDistanz != null)
				msgs = ((InternalEObject)zBSLaBereichDistanz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_DISTANZ, null, msgs);
			if (newZBSLaBereichDistanz != null)
				msgs = ((InternalEObject)newZBSLaBereichDistanz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_DISTANZ, null, msgs);
			msgs = basicSetZBSLaBereichDistanz(newZBSLaBereichDistanz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_DISTANZ, newZBSLaBereichDistanz, newZBSLaBereichDistanz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_La_Bereich_Geschwindigkeit_TypeClass getZBSLaBereichGeschwindigkeit() {
		return zBSLaBereichGeschwindigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZBSLaBereichGeschwindigkeit(ZBS_La_Bereich_Geschwindigkeit_TypeClass newZBSLaBereichGeschwindigkeit, NotificationChain msgs) {
		ZBS_La_Bereich_Geschwindigkeit_TypeClass oldZBSLaBereichGeschwindigkeit = zBSLaBereichGeschwindigkeit;
		zBSLaBereichGeschwindigkeit = newZBSLaBereichGeschwindigkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_GESCHWINDIGKEIT, oldZBSLaBereichGeschwindigkeit, newZBSLaBereichGeschwindigkeit);
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
	public void setZBSLaBereichGeschwindigkeit(ZBS_La_Bereich_Geschwindigkeit_TypeClass newZBSLaBereichGeschwindigkeit) {
		if (newZBSLaBereichGeschwindigkeit != zBSLaBereichGeschwindigkeit) {
			NotificationChain msgs = null;
			if (zBSLaBereichGeschwindigkeit != null)
				msgs = ((InternalEObject)zBSLaBereichGeschwindigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_GESCHWINDIGKEIT, null, msgs);
			if (newZBSLaBereichGeschwindigkeit != null)
				msgs = ((InternalEObject)newZBSLaBereichGeschwindigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_GESCHWINDIGKEIT, null, msgs);
			msgs = basicSetZBSLaBereichGeschwindigkeit(newZBSLaBereichGeschwindigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_GESCHWINDIGKEIT, newZBSLaBereichGeschwindigkeit, newZBSLaBereichGeschwindigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_La_Bereich_Laenge_TypeClass getZBSLaBereichLaenge() {
		return zBSLaBereichLaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZBSLaBereichLaenge(ZBS_La_Bereich_Laenge_TypeClass newZBSLaBereichLaenge, NotificationChain msgs) {
		ZBS_La_Bereich_Laenge_TypeClass oldZBSLaBereichLaenge = zBSLaBereichLaenge;
		zBSLaBereichLaenge = newZBSLaBereichLaenge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_LAENGE, oldZBSLaBereichLaenge, newZBSLaBereichLaenge);
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
	public void setZBSLaBereichLaenge(ZBS_La_Bereich_Laenge_TypeClass newZBSLaBereichLaenge) {
		if (newZBSLaBereichLaenge != zBSLaBereichLaenge) {
			NotificationChain msgs = null;
			if (zBSLaBereichLaenge != null)
				msgs = ((InternalEObject)zBSLaBereichLaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_LAENGE, null, msgs);
			if (newZBSLaBereichLaenge != null)
				msgs = ((InternalEObject)newZBSLaBereichLaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_LAENGE, null, msgs);
			msgs = basicSetZBSLaBereichLaenge(newZBSLaBereichLaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_LAENGE, newZBSLaBereichLaenge, newZBSLaBereichLaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_La_Bereich_Neigung_TypeClass getZBSLaBereichNeigung() {
		return zBSLaBereichNeigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZBSLaBereichNeigung(ZBS_La_Bereich_Neigung_TypeClass newZBSLaBereichNeigung, NotificationChain msgs) {
		ZBS_La_Bereich_Neigung_TypeClass oldZBSLaBereichNeigung = zBSLaBereichNeigung;
		zBSLaBereichNeigung = newZBSLaBereichNeigung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_NEIGUNG, oldZBSLaBereichNeigung, newZBSLaBereichNeigung);
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
	public void setZBSLaBereichNeigung(ZBS_La_Bereich_Neigung_TypeClass newZBSLaBereichNeigung) {
		if (newZBSLaBereichNeigung != zBSLaBereichNeigung) {
			NotificationChain msgs = null;
			if (zBSLaBereichNeigung != null)
				msgs = ((InternalEObject)zBSLaBereichNeigung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_NEIGUNG, null, msgs);
			if (newZBSLaBereichNeigung != null)
				msgs = ((InternalEObject)newZBSLaBereichNeigung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_NEIGUNG, null, msgs);
			msgs = basicSetZBSLaBereichNeigung(newZBSLaBereichNeigung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_NEIGUNG, newZBSLaBereichNeigung, newZBSLaBereichNeigung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_DISTANZ:
				return basicSetZBSLaBereichDistanz(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_GESCHWINDIGKEIT:
				return basicSetZBSLaBereichGeschwindigkeit(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_LAENGE:
				return basicSetZBSLaBereichLaenge(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_NEIGUNG:
				return basicSetZBSLaBereichNeigung(null, msgs);
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
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_DISTANZ:
				return getZBSLaBereichDistanz();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_GESCHWINDIGKEIT:
				return getZBSLaBereichGeschwindigkeit();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_LAENGE:
				return getZBSLaBereichLaenge();
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_NEIGUNG:
				return getZBSLaBereichNeigung();
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
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_DISTANZ:
				setZBSLaBereichDistanz((ZBS_La_Bereich_Distanz_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_GESCHWINDIGKEIT:
				setZBSLaBereichGeschwindigkeit((ZBS_La_Bereich_Geschwindigkeit_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_LAENGE:
				setZBSLaBereichLaenge((ZBS_La_Bereich_Laenge_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_NEIGUNG:
				setZBSLaBereichNeigung((ZBS_La_Bereich_Neigung_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_DISTANZ:
				setZBSLaBereichDistanz((ZBS_La_Bereich_Distanz_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_GESCHWINDIGKEIT:
				setZBSLaBereichGeschwindigkeit((ZBS_La_Bereich_Geschwindigkeit_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_LAENGE:
				setZBSLaBereichLaenge((ZBS_La_Bereich_Laenge_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_NEIGUNG:
				setZBSLaBereichNeigung((ZBS_La_Bereich_Neigung_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_DISTANZ:
				return zBSLaBereichDistanz != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_GESCHWINDIGKEIT:
				return zBSLaBereichGeschwindigkeit != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_LAENGE:
				return zBSLaBereichLaenge != null;
			case Balisentechnik_ETCSPackage.FT_ZBS_MERKMALE_LA_ATTRIBUTE_GROUP__ZBS_LA_BEREICH_NEIGUNG:
				return zBSLaBereichNeigung != null;
		}
		return super.eIsSet(featureID);
	}

} //FT_ZBS_Merkmale_La_AttributeGroupImpl
