/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Gleis.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Bereich_ObjektImpl;

import org.eclipse.set.model.planpro.Gleis.GleisPackage;
import org.eclipse.set.model.planpro.Gleis.Gleis_Art;
import org.eclipse.set.model.planpro.Gleis.Gleisart_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gleis Art</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_ArtImpl#getGleisart <em>Gleisart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Gleis_ArtImpl extends Bereich_ObjektImpl implements Gleis_Art {
	/**
	 * The cached value of the '{@link #getGleisart() <em>Gleisart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGleisart()
	 * @generated
	 * @ordered
	 */
	protected Gleisart_TypeClass gleisart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gleis_ArtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GleisPackage.Literals.GLEIS_ART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleisart_TypeClass getGleisart() {
		return gleisart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGleisart(Gleisart_TypeClass newGleisart, NotificationChain msgs) {
		Gleisart_TypeClass oldGleisart = gleisart;
		gleisart = newGleisart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_ART__GLEISART, oldGleisart, newGleisart);
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
	public void setGleisart(Gleisart_TypeClass newGleisart) {
		if (newGleisart != gleisart) {
			NotificationChain msgs = null;
			if (gleisart != null)
				msgs = ((InternalEObject)gleisart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_ART__GLEISART, null, msgs);
			if (newGleisart != null)
				msgs = ((InternalEObject)newGleisart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_ART__GLEISART, null, msgs);
			msgs = basicSetGleisart(newGleisart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_ART__GLEISART, newGleisart, newGleisart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GleisPackage.GLEIS_ART__GLEISART:
				return basicSetGleisart(null, msgs);
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
			case GleisPackage.GLEIS_ART__GLEISART:
				return getGleisart();
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
			case GleisPackage.GLEIS_ART__GLEISART:
				setGleisart((Gleisart_TypeClass)newValue);
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
			case GleisPackage.GLEIS_ART__GLEISART:
				setGleisart((Gleisart_TypeClass)null);
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
			case GleisPackage.GLEIS_ART__GLEISART:
				return gleisart != null;
		}
		return super.eIsSet(featureID);
	}

} //Gleis_ArtImpl
