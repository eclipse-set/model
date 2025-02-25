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
import org.eclipse.set.model.planpro.Gleis.Gleis_Fahrbahn;
import org.eclipse.set.model.planpro.Gleis.Konstruktion_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gleis Fahrbahn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_FahrbahnImpl#getKonstruktion <em>Konstruktion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Gleis_FahrbahnImpl extends Bereich_ObjektImpl implements Gleis_Fahrbahn {
	/**
	 * The cached value of the '{@link #getKonstruktion() <em>Konstruktion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKonstruktion()
	 * @generated
	 * @ordered
	 */
	protected Konstruktion_TypeClass konstruktion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gleis_FahrbahnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GleisPackage.Literals.GLEIS_FAHRBAHN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Konstruktion_TypeClass getKonstruktion() {
		return konstruktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKonstruktion(Konstruktion_TypeClass newKonstruktion, NotificationChain msgs) {
		Konstruktion_TypeClass oldKonstruktion = konstruktion;
		konstruktion = newKonstruktion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_FAHRBAHN__KONSTRUKTION, oldKonstruktion, newKonstruktion);
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
	public void setKonstruktion(Konstruktion_TypeClass newKonstruktion) {
		if (newKonstruktion != konstruktion) {
			NotificationChain msgs = null;
			if (konstruktion != null)
				msgs = ((InternalEObject)konstruktion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_FAHRBAHN__KONSTRUKTION, null, msgs);
			if (newKonstruktion != null)
				msgs = ((InternalEObject)newKonstruktion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_FAHRBAHN__KONSTRUKTION, null, msgs);
			msgs = basicSetKonstruktion(newKonstruktion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_FAHRBAHN__KONSTRUKTION, newKonstruktion, newKonstruktion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GleisPackage.GLEIS_FAHRBAHN__KONSTRUKTION:
				return basicSetKonstruktion(null, msgs);
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
			case GleisPackage.GLEIS_FAHRBAHN__KONSTRUKTION:
				return getKonstruktion();
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
			case GleisPackage.GLEIS_FAHRBAHN__KONSTRUKTION:
				setKonstruktion((Konstruktion_TypeClass)newValue);
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
			case GleisPackage.GLEIS_FAHRBAHN__KONSTRUKTION:
				setKonstruktion((Konstruktion_TypeClass)null);
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
			case GleisPackage.GLEIS_FAHRBAHN__KONSTRUKTION:
				return konstruktion != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Gleis_FahrbahnImpl
