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

import org.eclipse.set.model.planpro.PlanPro.Ausgabe_Fachdaten;
import org.eclipse.set.model.planpro.PlanPro.Fachdaten_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fachdaten Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Fachdaten_AttributeGroupImpl#getAusgabeFachdaten <em>Ausgabe Fachdaten</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fachdaten_AttributeGroupImpl extends EObjectImpl implements Fachdaten_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAusgabeFachdaten() <em>Ausgabe Fachdaten</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAusgabeFachdaten()
	 * @generated
	 * @ordered
	 */
	protected EList<Ausgabe_Fachdaten> ausgabeFachdaten;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fachdaten_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getFachdaten_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ausgabe_Fachdaten> getAusgabeFachdaten() {
		if (ausgabeFachdaten == null) {
			ausgabeFachdaten = new EObjectContainmentEList<Ausgabe_Fachdaten>(Ausgabe_Fachdaten.class, this, PlanProPackage.FACHDATEN_ATTRIBUTE_GROUP__AUSGABE_FACHDATEN);
		}
		return ausgabeFachdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.FACHDATEN_ATTRIBUTE_GROUP__AUSGABE_FACHDATEN:
				return ((InternalEList<?>)getAusgabeFachdaten()).basicRemove(otherEnd, msgs);
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
			case PlanProPackage.FACHDATEN_ATTRIBUTE_GROUP__AUSGABE_FACHDATEN:
				return getAusgabeFachdaten();
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
			case PlanProPackage.FACHDATEN_ATTRIBUTE_GROUP__AUSGABE_FACHDATEN:
				getAusgabeFachdaten().clear();
				getAusgabeFachdaten().addAll((Collection<? extends Ausgabe_Fachdaten>)newValue);
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
			case PlanProPackage.FACHDATEN_ATTRIBUTE_GROUP__AUSGABE_FACHDATEN:
				getAusgabeFachdaten().clear();
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
			case PlanProPackage.FACHDATEN_ATTRIBUTE_GROUP__AUSGABE_FACHDATEN:
				return ausgabeFachdaten != null && !ausgabeFachdaten.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fachdaten_AttributeGroupImpl
