/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Basisobjekte.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup;
import org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Punkt Objekt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_ObjektImpl#getPunktObjektStrecke <em>Punkt Objekt Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_ObjektImpl#getPunktObjektTOPKante <em>Punkt Objekt TOP Kante</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Punkt_ObjektImpl extends Basis_ObjektImpl implements Punkt_Objekt {
	/**
	 * The cached value of the '{@link #getPunktObjektStrecke() <em>Punkt Objekt Strecke</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPunktObjektStrecke()
	 * @generated
	 * @ordered
	 */
	protected EList<Punkt_Objekt_Strecke_AttributeGroup> punktObjektStrecke;

	/**
	 * The cached value of the '{@link #getPunktObjektTOPKante() <em>Punkt Objekt TOP Kante</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPunktObjektTOPKante()
	 * @generated
	 * @ordered
	 */
	protected EList<Punkt_Objekt_TOP_Kante_AttributeGroup> punktObjektTOPKante;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Punkt_ObjektImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisobjektePackage.Literals.PUNKT_OBJEKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Punkt_Objekt_Strecke_AttributeGroup> getPunktObjektStrecke() {
		if (punktObjektStrecke == null) {
			punktObjektStrecke = new EObjectContainmentEList<Punkt_Objekt_Strecke_AttributeGroup>(Punkt_Objekt_Strecke_AttributeGroup.class, this, BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE);
		}
		return punktObjektStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Punkt_Objekt_TOP_Kante_AttributeGroup> getPunktObjektTOPKante() {
		if (punktObjektTOPKante == null) {
			punktObjektTOPKante = new EObjectContainmentEList<Punkt_Objekt_TOP_Kante_AttributeGroup>(Punkt_Objekt_TOP_Kante_AttributeGroup.class, this, BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE);
		}
		return punktObjektTOPKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE:
				return ((InternalEList<?>)getPunktObjektStrecke()).basicRemove(otherEnd, msgs);
			case BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE:
				return ((InternalEList<?>)getPunktObjektTOPKante()).basicRemove(otherEnd, msgs);
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
			case BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE:
				return getPunktObjektStrecke();
			case BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE:
				return getPunktObjektTOPKante();
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
			case BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE:
				getPunktObjektStrecke().clear();
				getPunktObjektStrecke().addAll((Collection<? extends Punkt_Objekt_Strecke_AttributeGroup>)newValue);
				return;
			case BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE:
				getPunktObjektTOPKante().clear();
				getPunktObjektTOPKante().addAll((Collection<? extends Punkt_Objekt_TOP_Kante_AttributeGroup>)newValue);
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
			case BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE:
				getPunktObjektStrecke().clear();
				return;
			case BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE:
				getPunktObjektTOPKante().clear();
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
			case BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_STRECKE:
				return punktObjektStrecke != null && !punktObjektStrecke.isEmpty();
			case BasisobjektePackage.PUNKT_OBJEKT__PUNKT_OBJEKT_TOP_KANTE:
				return punktObjektTOPKante != null && !punktObjektTOPKante.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Punkt_ObjektImpl
