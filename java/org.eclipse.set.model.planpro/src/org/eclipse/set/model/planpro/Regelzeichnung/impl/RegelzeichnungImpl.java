/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Regelzeichnung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Regelzeichnung.Regelzeichnung;
import org.eclipse.set.model.planpro.Regelzeichnung.RegelzeichnungPackage;
import org.eclipse.set.model.planpro.Regelzeichnung.Regelzeichnung_Allg_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regelzeichnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Regelzeichnung.impl.RegelzeichnungImpl#getRegelzeichnungAllg <em>Regelzeichnung Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegelzeichnungImpl extends Basis_ObjektImpl implements Regelzeichnung {
	/**
	 * The cached value of the '{@link #getRegelzeichnungAllg() <em>Regelzeichnung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegelzeichnungAllg()
	 * @generated
	 * @ordered
	 */
	protected Regelzeichnung_Allg_AttributeGroup regelzeichnungAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegelzeichnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RegelzeichnungPackage.Literals.REGELZEICHNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Regelzeichnung_Allg_AttributeGroup getRegelzeichnungAllg() {
		return regelzeichnungAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegelzeichnungAllg(Regelzeichnung_Allg_AttributeGroup newRegelzeichnungAllg, NotificationChain msgs) {
		Regelzeichnung_Allg_AttributeGroup oldRegelzeichnungAllg = regelzeichnungAllg;
		regelzeichnungAllg = newRegelzeichnungAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG__REGELZEICHNUNG_ALLG, oldRegelzeichnungAllg, newRegelzeichnungAllg);
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
	public void setRegelzeichnungAllg(Regelzeichnung_Allg_AttributeGroup newRegelzeichnungAllg) {
		if (newRegelzeichnungAllg != regelzeichnungAllg) {
			NotificationChain msgs = null;
			if (regelzeichnungAllg != null)
				msgs = ((InternalEObject)regelzeichnungAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG__REGELZEICHNUNG_ALLG, null, msgs);
			if (newRegelzeichnungAllg != null)
				msgs = ((InternalEObject)newRegelzeichnungAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG__REGELZEICHNUNG_ALLG, null, msgs);
			msgs = basicSetRegelzeichnungAllg(newRegelzeichnungAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG__REGELZEICHNUNG_ALLG, newRegelzeichnungAllg, newRegelzeichnungAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegelzeichnungPackage.REGELZEICHNUNG__REGELZEICHNUNG_ALLG:
				return basicSetRegelzeichnungAllg(null, msgs);
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
			case RegelzeichnungPackage.REGELZEICHNUNG__REGELZEICHNUNG_ALLG:
				return getRegelzeichnungAllg();
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
			case RegelzeichnungPackage.REGELZEICHNUNG__REGELZEICHNUNG_ALLG:
				setRegelzeichnungAllg((Regelzeichnung_Allg_AttributeGroup)newValue);
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
			case RegelzeichnungPackage.REGELZEICHNUNG__REGELZEICHNUNG_ALLG:
				setRegelzeichnungAllg((Regelzeichnung_Allg_AttributeGroup)null);
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
			case RegelzeichnungPackage.REGELZEICHNUNG__REGELZEICHNUNG_ALLG:
				return regelzeichnungAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //RegelzeichnungImpl
