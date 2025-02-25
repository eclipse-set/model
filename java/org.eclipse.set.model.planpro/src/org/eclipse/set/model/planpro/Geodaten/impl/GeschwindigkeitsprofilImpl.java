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

import org.eclipse.set.model.planpro.Basisobjekte.impl.Bereich_ObjektImpl;

import org.eclipse.set.model.planpro.Geodaten.GeodatenPackage;
import org.eclipse.set.model.planpro.Geodaten.Geschwindigkeitsprofil;
import org.eclipse.set.model.planpro.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geschwindigkeitsprofil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.GeschwindigkeitsprofilImpl#getGeschwindigkeitsprofilAllg <em>Geschwindigkeitsprofil Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeschwindigkeitsprofilImpl extends Bereich_ObjektImpl implements Geschwindigkeitsprofil {
	/**
	 * The cached value of the '{@link #getGeschwindigkeitsprofilAllg() <em>Geschwindigkeitsprofil Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschwindigkeitsprofilAllg()
	 * @generated
	 * @ordered
	 */
	protected Geschwindigkeitsprofil_Allg_AttributeGroup geschwindigkeitsprofilAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeschwindigkeitsprofilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.GESCHWINDIGKEITSPROFIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geschwindigkeitsprofil_Allg_AttributeGroup getGeschwindigkeitsprofilAllg() {
		return geschwindigkeitsprofilAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeschwindigkeitsprofilAllg(Geschwindigkeitsprofil_Allg_AttributeGroup newGeschwindigkeitsprofilAllg, NotificationChain msgs) {
		Geschwindigkeitsprofil_Allg_AttributeGroup oldGeschwindigkeitsprofilAllg = geschwindigkeitsprofilAllg;
		geschwindigkeitsprofilAllg = newGeschwindigkeitsprofilAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GESCHWINDIGKEITSPROFIL__GESCHWINDIGKEITSPROFIL_ALLG, oldGeschwindigkeitsprofilAllg, newGeschwindigkeitsprofilAllg);
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
	public void setGeschwindigkeitsprofilAllg(Geschwindigkeitsprofil_Allg_AttributeGroup newGeschwindigkeitsprofilAllg) {
		if (newGeschwindigkeitsprofilAllg != geschwindigkeitsprofilAllg) {
			NotificationChain msgs = null;
			if (geschwindigkeitsprofilAllg != null)
				msgs = ((InternalEObject)geschwindigkeitsprofilAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GESCHWINDIGKEITSPROFIL__GESCHWINDIGKEITSPROFIL_ALLG, null, msgs);
			if (newGeschwindigkeitsprofilAllg != null)
				msgs = ((InternalEObject)newGeschwindigkeitsprofilAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GESCHWINDIGKEITSPROFIL__GESCHWINDIGKEITSPROFIL_ALLG, null, msgs);
			msgs = basicSetGeschwindigkeitsprofilAllg(newGeschwindigkeitsprofilAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GESCHWINDIGKEITSPROFIL__GESCHWINDIGKEITSPROFIL_ALLG, newGeschwindigkeitsprofilAllg, newGeschwindigkeitsprofilAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL__GESCHWINDIGKEITSPROFIL_ALLG:
				return basicSetGeschwindigkeitsprofilAllg(null, msgs);
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
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL__GESCHWINDIGKEITSPROFIL_ALLG:
				return getGeschwindigkeitsprofilAllg();
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
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL__GESCHWINDIGKEITSPROFIL_ALLG:
				setGeschwindigkeitsprofilAllg((Geschwindigkeitsprofil_Allg_AttributeGroup)newValue);
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
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL__GESCHWINDIGKEITSPROFIL_ALLG:
				setGeschwindigkeitsprofilAllg((Geschwindigkeitsprofil_Allg_AttributeGroup)null);
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
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL__GESCHWINDIGKEITSPROFIL_ALLG:
				return geschwindigkeitsprofilAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //GeschwindigkeitsprofilImpl
