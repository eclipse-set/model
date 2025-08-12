/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnsteig.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage;
import org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Zugang_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Zugang_Art_TypeClass;
import org.eclipse.set.model.planpro.Bahnsteig.Hauptzugang_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bahnsteig Zugang Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnsteig.impl.Bahnsteig_Zugang_Allg_AttributeGroupImpl#getBahnsteigZugangArt <em>Bahnsteig Zugang Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnsteig.impl.Bahnsteig_Zugang_Allg_AttributeGroupImpl#getHauptzugang <em>Hauptzugang</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bahnsteig_Zugang_Allg_AttributeGroupImpl extends EObjectImpl implements Bahnsteig_Zugang_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBahnsteigZugangArt() <em>Bahnsteig Zugang Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBahnsteigZugangArt()
	 * @generated
	 * @ordered
	 */
	protected Bahnsteig_Zugang_Art_TypeClass bahnsteigZugangArt;

	/**
	 * The cached value of the '{@link #getHauptzugang() <em>Hauptzugang</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauptzugang()
	 * @generated
	 * @ordered
	 */
	protected Hauptzugang_TypeClass hauptzugang;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bahnsteig_Zugang_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnsteigPackage.Literals.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Zugang_Art_TypeClass getBahnsteigZugangArt() {
		return bahnsteigZugangArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBahnsteigZugangArt(Bahnsteig_Zugang_Art_TypeClass newBahnsteigZugangArt, NotificationChain msgs) {
		Bahnsteig_Zugang_Art_TypeClass oldBahnsteigZugangArt = bahnsteigZugangArt;
		bahnsteigZugangArt = newBahnsteigZugangArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG_ART, oldBahnsteigZugangArt, newBahnsteigZugangArt);
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
	public void setBahnsteigZugangArt(Bahnsteig_Zugang_Art_TypeClass newBahnsteigZugangArt) {
		if (newBahnsteigZugangArt != bahnsteigZugangArt) {
			NotificationChain msgs = null;
			if (bahnsteigZugangArt != null)
				msgs = ((InternalEObject)bahnsteigZugangArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG_ART, null, msgs);
			if (newBahnsteigZugangArt != null)
				msgs = ((InternalEObject)newBahnsteigZugangArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG_ART, null, msgs);
			msgs = basicSetBahnsteigZugangArt(newBahnsteigZugangArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG_ART, newBahnsteigZugangArt, newBahnsteigZugangArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hauptzugang_TypeClass getHauptzugang() {
		return hauptzugang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHauptzugang(Hauptzugang_TypeClass newHauptzugang, NotificationChain msgs) {
		Hauptzugang_TypeClass oldHauptzugang = hauptzugang;
		hauptzugang = newHauptzugang;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__HAUPTZUGANG, oldHauptzugang, newHauptzugang);
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
	public void setHauptzugang(Hauptzugang_TypeClass newHauptzugang) {
		if (newHauptzugang != hauptzugang) {
			NotificationChain msgs = null;
			if (hauptzugang != null)
				msgs = ((InternalEObject)hauptzugang).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__HAUPTZUGANG, null, msgs);
			if (newHauptzugang != null)
				msgs = ((InternalEObject)newHauptzugang).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__HAUPTZUGANG, null, msgs);
			msgs = basicSetHauptzugang(newHauptzugang, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__HAUPTZUGANG, newHauptzugang, newHauptzugang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG_ART:
				return basicSetBahnsteigZugangArt(null, msgs);
			case BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__HAUPTZUGANG:
				return basicSetHauptzugang(null, msgs);
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
			case BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG_ART:
				return getBahnsteigZugangArt();
			case BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__HAUPTZUGANG:
				return getHauptzugang();
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
			case BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG_ART:
				setBahnsteigZugangArt((Bahnsteig_Zugang_Art_TypeClass)newValue);
				return;
			case BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__HAUPTZUGANG:
				setHauptzugang((Hauptzugang_TypeClass)newValue);
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
			case BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG_ART:
				setBahnsteigZugangArt((Bahnsteig_Zugang_Art_TypeClass)null);
				return;
			case BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__HAUPTZUGANG:
				setHauptzugang((Hauptzugang_TypeClass)null);
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
			case BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG_ART:
				return bahnsteigZugangArt != null;
			case BahnsteigPackage.BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__HAUPTZUGANG:
				return hauptzugang != null;
		}
		return super.eIsSet(featureID);
	}

} //Bahnsteig_Zugang_Allg_AttributeGroupImpl
