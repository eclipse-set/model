/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.PlanPro.Objektmanagement_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;
import org.eclipse.set.model.planpro.PlanPro.Planung_Projekt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objektmanagement Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Objektmanagement_AttributeGroupImpl#getLSTPlanungProjekt <em>LST Planung Projekt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Objektmanagement_AttributeGroupImpl extends EObjectImpl implements Objektmanagement_AttributeGroup {
	/**
	 * The cached value of the '{@link #getLSTPlanungProjekt() <em>LST Planung Projekt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLSTPlanungProjekt()
	 * @generated
	 * @ordered
	 */
	protected EList<Planung_Projekt> lSTPlanungProjekt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Objektmanagement_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getObjektmanagement_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Planung_Projekt> getLSTPlanungProjekt() {
		if (lSTPlanungProjekt == null) {
			lSTPlanungProjekt = new EObjectContainmentEList<Planung_Projekt>(Planung_Projekt.class, this, PlanProPackage.OBJEKTMANAGEMENT_ATTRIBUTE_GROUP__LST_PLANUNG_PROJEKT);
		}
		return lSTPlanungProjekt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.OBJEKTMANAGEMENT_ATTRIBUTE_GROUP__LST_PLANUNG_PROJEKT:
				return ((InternalEList<?>)getLSTPlanungProjekt()).basicRemove(otherEnd, msgs);
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
			case PlanProPackage.OBJEKTMANAGEMENT_ATTRIBUTE_GROUP__LST_PLANUNG_PROJEKT:
				return getLSTPlanungProjekt();
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
			case PlanProPackage.OBJEKTMANAGEMENT_ATTRIBUTE_GROUP__LST_PLANUNG_PROJEKT:
				getLSTPlanungProjekt().clear();
				getLSTPlanungProjekt().addAll((Collection<? extends Planung_Projekt>)newValue);
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
			case PlanProPackage.OBJEKTMANAGEMENT_ATTRIBUTE_GROUP__LST_PLANUNG_PROJEKT:
				getLSTPlanungProjekt().clear();
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
			case PlanProPackage.OBJEKTMANAGEMENT_ATTRIBUTE_GROUP__LST_PLANUNG_PROJEKT:
				return lSTPlanungProjekt != null && !lSTPlanungProjekt.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Objektmanagement_AttributeGroupImpl
