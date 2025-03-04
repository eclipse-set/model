/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PZB.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.PZB.PZBPackage;
import org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung;
import org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_BP_AttributeGroup;
import org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PZB Element Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Element_ZuordnungImpl#getPZBElementZuordnungBP <em>PZB Element Zuordnung BP</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PZB.impl.PZB_Element_ZuordnungImpl#getPZBElementZuordnungFstr <em>PZB Element Zuordnung Fstr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PZB_Element_ZuordnungImpl extends Basis_ObjektImpl implements PZB_Element_Zuordnung {
	/**
	 * The cached value of the '{@link #getPZBElementZuordnungBP() <em>PZB Element Zuordnung BP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPZBElementZuordnungBP()
	 * @generated
	 * @ordered
	 */
	protected EList<PZB_Element_Zuordnung_BP_AttributeGroup> pZBElementZuordnungBP;

	/**
	 * The cached value of the '{@link #getPZBElementZuordnungFstr() <em>PZB Element Zuordnung Fstr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPZBElementZuordnungFstr()
	 * @generated
	 * @ordered
	 */
	protected EList<PZB_Element_Zuordnung_Fstr_AttributeGroup> pZBElementZuordnungFstr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Element_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PZB_Element_Zuordnung_BP_AttributeGroup> getPZBElementZuordnungBP() {
		if (pZBElementZuordnungBP == null) {
			pZBElementZuordnungBP = new EObjectContainmentEList<PZB_Element_Zuordnung_BP_AttributeGroup>(PZB_Element_Zuordnung_BP_AttributeGroup.class, this, PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_BP);
		}
		return pZBElementZuordnungBP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PZB_Element_Zuordnung_Fstr_AttributeGroup> getPZBElementZuordnungFstr() {
		if (pZBElementZuordnungFstr == null) {
			pZBElementZuordnungFstr = new EObjectContainmentEList<PZB_Element_Zuordnung_Fstr_AttributeGroup>(PZB_Element_Zuordnung_Fstr_AttributeGroup.class, this, PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_FSTR);
		}
		return pZBElementZuordnungFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_BP:
				return ((InternalEList<?>)getPZBElementZuordnungBP()).basicRemove(otherEnd, msgs);
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_FSTR:
				return ((InternalEList<?>)getPZBElementZuordnungFstr()).basicRemove(otherEnd, msgs);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_BP:
				return getPZBElementZuordnungBP();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_FSTR:
				return getPZBElementZuordnungFstr();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_BP:
				getPZBElementZuordnungBP().clear();
				getPZBElementZuordnungBP().addAll((Collection<? extends PZB_Element_Zuordnung_BP_AttributeGroup>)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_FSTR:
				getPZBElementZuordnungFstr().clear();
				getPZBElementZuordnungFstr().addAll((Collection<? extends PZB_Element_Zuordnung_Fstr_AttributeGroup>)newValue);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_BP:
				getPZBElementZuordnungBP().clear();
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_FSTR:
				getPZBElementZuordnungFstr().clear();
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_BP:
				return pZBElementZuordnungBP != null && !pZBElementZuordnungBP.isEmpty();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_FSTR:
				return pZBElementZuordnungFstr != null && !pZBElementZuordnungFstr.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //PZB_Element_ZuordnungImpl
