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

import org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage;
import org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Dach;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Bereich_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Kante_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bahnsteig Dach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnsteig.impl.Bahnsteig_DachImpl#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bahnsteig_DachImpl extends Bereich_ObjektImpl implements Bahnsteig_Dach {
	/**
	 * The cached value of the '{@link #getIDBahnsteigKante() <em>ID Bahnsteig Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBahnsteigKante()
	 * @generated
	 * @ordered
	 */
	protected ID_Bahnsteig_Kante_ohne_Proxy_TypeClass iDBahnsteigKante;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bahnsteig_DachImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnsteigPackage.Literals.BAHNSTEIG_DACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bahnsteig_Kante_ohne_Proxy_TypeClass getIDBahnsteigKante() {
		return iDBahnsteigKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBahnsteigKante(ID_Bahnsteig_Kante_ohne_Proxy_TypeClass newIDBahnsteigKante, NotificationChain msgs) {
		ID_Bahnsteig_Kante_ohne_Proxy_TypeClass oldIDBahnsteigKante = iDBahnsteigKante;
		iDBahnsteigKante = newIDBahnsteigKante;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE, oldIDBahnsteigKante, newIDBahnsteigKante);
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
	public void setIDBahnsteigKante(ID_Bahnsteig_Kante_ohne_Proxy_TypeClass newIDBahnsteigKante) {
		if (newIDBahnsteigKante != iDBahnsteigKante) {
			NotificationChain msgs = null;
			if (iDBahnsteigKante != null)
				msgs = ((InternalEObject)iDBahnsteigKante).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE, null, msgs);
			if (newIDBahnsteigKante != null)
				msgs = ((InternalEObject)newIDBahnsteigKante).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE, null, msgs);
			msgs = basicSetIDBahnsteigKante(newIDBahnsteigKante, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE, newIDBahnsteigKante, newIDBahnsteigKante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnsteigPackage.BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE:
				return basicSetIDBahnsteigKante(null, msgs);
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
			case BahnsteigPackage.BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE:
				return getIDBahnsteigKante();
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
			case BahnsteigPackage.BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE:
				setIDBahnsteigKante((ID_Bahnsteig_Kante_ohne_Proxy_TypeClass)newValue);
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
			case BahnsteigPackage.BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE:
				setIDBahnsteigKante((ID_Bahnsteig_Kante_ohne_Proxy_TypeClass)null);
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
			case BahnsteigPackage.BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE:
				return iDBahnsteigKante != null;
		}
		return super.eIsSet(featureID);
	}

} //Bahnsteig_DachImpl
