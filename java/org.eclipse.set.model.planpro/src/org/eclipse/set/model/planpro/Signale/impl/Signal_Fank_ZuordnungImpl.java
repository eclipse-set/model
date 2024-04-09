/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Signale.Signal_Fank_Zuordnung;
import org.eclipse.set.model.planpro.Signale.SignalePackage;

import org.eclipse.set.model.planpro.Verweise.ID_Signal_Fank_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_Start_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Fank Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Fank_ZuordnungImpl#getIDSignalFank <em>ID Signal Fank</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.impl.Signal_Fank_ZuordnungImpl#getIDSignalStart <em>ID Signal Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_Fank_ZuordnungImpl extends Basis_ObjektImpl implements Signal_Fank_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDSignalFank() <em>ID Signal Fank</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalFank()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Signal_Fank_TypeClass> iDSignalFank;

	/**
	 * The cached value of the '{@link #getIDSignalStart() <em>ID Signal Start</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalStart()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Signal_Start_TypeClass> iDSignalStart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_Fank_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_FANK_ZUORDNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Signal_Fank_TypeClass> getIDSignalFank() {
		if (iDSignalFank == null) {
			iDSignalFank = new EObjectContainmentEList<ID_Signal_Fank_TypeClass>(ID_Signal_Fank_TypeClass.class, this, SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_FANK);
		}
		return iDSignalFank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Signal_Start_TypeClass> getIDSignalStart() {
		if (iDSignalStart == null) {
			iDSignalStart = new EObjectContainmentEList<ID_Signal_Start_TypeClass>(ID_Signal_Start_TypeClass.class, this, SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_START);
		}
		return iDSignalStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_FANK:
				return ((InternalEList<?>)getIDSignalFank()).basicRemove(otherEnd, msgs);
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_START:
				return ((InternalEList<?>)getIDSignalStart()).basicRemove(otherEnd, msgs);
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
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_FANK:
				return getIDSignalFank();
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_START:
				return getIDSignalStart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_FANK:
				getIDSignalFank().clear();
				getIDSignalFank().addAll((Collection<? extends ID_Signal_Fank_TypeClass>)newValue);
				return;
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_START:
				getIDSignalStart().clear();
				getIDSignalStart().addAll((Collection<? extends ID_Signal_Start_TypeClass>)newValue);
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
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_FANK:
				getIDSignalFank().clear();
				return;
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_START:
				getIDSignalStart().clear();
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
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_FANK:
				return iDSignalFank != null && !iDSignalFank.isEmpty();
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_START:
				return iDSignalStart != null && !iDSignalStart.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Signal_Fank_ZuordnungImpl
