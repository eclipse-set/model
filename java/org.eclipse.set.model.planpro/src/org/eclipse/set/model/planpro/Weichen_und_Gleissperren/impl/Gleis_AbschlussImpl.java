/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Weichen_und_Gleissperren.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Gleis_Abschluss;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Gleis_Abschluss_Art_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gleis Abschluss</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.impl.Gleis_AbschlussImpl#getGleisAbschlussArt <em>Gleis Abschluss Art</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Gleis_AbschlussImpl extends Punkt_ObjektImpl implements Gleis_Abschluss {
	/**
	 * The cached value of the '{@link #getGleisAbschlussArt() <em>Gleis Abschluss Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGleisAbschlussArt()
	 * @generated
	 * @ordered
	 */
	protected Gleis_Abschluss_Art_TypeClass gleisAbschlussArt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gleis_AbschlussImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Weichen_und_GleissperrenPackage.Literals.GLEIS_ABSCHLUSS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Abschluss_Art_TypeClass getGleisAbschlussArt() {
		return gleisAbschlussArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGleisAbschlussArt(Gleis_Abschluss_Art_TypeClass newGleisAbschlussArt, NotificationChain msgs) {
		Gleis_Abschluss_Art_TypeClass oldGleisAbschlussArt = gleisAbschlussArt;
		gleisAbschlussArt = newGleisAbschlussArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.GLEIS_ABSCHLUSS__GLEIS_ABSCHLUSS_ART, oldGleisAbschlussArt, newGleisAbschlussArt);
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
	public void setGleisAbschlussArt(Gleis_Abschluss_Art_TypeClass newGleisAbschlussArt) {
		if (newGleisAbschlussArt != gleisAbschlussArt) {
			NotificationChain msgs = null;
			if (gleisAbschlussArt != null)
				msgs = ((InternalEObject)gleisAbschlussArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.GLEIS_ABSCHLUSS__GLEIS_ABSCHLUSS_ART, null, msgs);
			if (newGleisAbschlussArt != null)
				msgs = ((InternalEObject)newGleisAbschlussArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.GLEIS_ABSCHLUSS__GLEIS_ABSCHLUSS_ART, null, msgs);
			msgs = basicSetGleisAbschlussArt(newGleisAbschlussArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.GLEIS_ABSCHLUSS__GLEIS_ABSCHLUSS_ART, newGleisAbschlussArt, newGleisAbschlussArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Weichen_und_GleissperrenPackage.GLEIS_ABSCHLUSS__GLEIS_ABSCHLUSS_ART:
				return basicSetGleisAbschlussArt(null, msgs);
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
			case Weichen_und_GleissperrenPackage.GLEIS_ABSCHLUSS__GLEIS_ABSCHLUSS_ART:
				return getGleisAbschlussArt();
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
			case Weichen_und_GleissperrenPackage.GLEIS_ABSCHLUSS__GLEIS_ABSCHLUSS_ART:
				setGleisAbschlussArt((Gleis_Abschluss_Art_TypeClass)newValue);
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
			case Weichen_und_GleissperrenPackage.GLEIS_ABSCHLUSS__GLEIS_ABSCHLUSS_ART:
				setGleisAbschlussArt((Gleis_Abschluss_Art_TypeClass)null);
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
			case Weichen_und_GleissperrenPackage.GLEIS_ABSCHLUSS__GLEIS_ABSCHLUSS_ART:
				return gleisAbschlussArt != null;
		}
		return super.eIsSet(featureID);
	}

} //Gleis_AbschlussImpl
