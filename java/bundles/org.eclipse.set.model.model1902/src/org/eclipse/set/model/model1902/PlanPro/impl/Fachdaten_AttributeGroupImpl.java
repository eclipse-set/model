/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.PlanPro.Ausgabe_Fachdaten;
import org.eclipse.set.model.model1902.PlanPro.Fachdaten_AttributeGroup;
import org.eclipse.set.model.model1902.PlanPro.PlanProPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fachdaten Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Fachdaten_AttributeGroupImpl#getAusgabeFachdaten <em>Ausgabe Fachdaten</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fachdaten_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Fachdaten_AttributeGroup {
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
			case PlanProPackage.FACHDATEN_ATTRIBUTE_GROUP__AUSGABE_FACHDATEN:
				return getAusgabeFachdaten();
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
			case PlanProPackage.FACHDATEN_ATTRIBUTE_GROUP__AUSGABE_FACHDATEN:
				getAusgabeFachdaten().clear();
				getAusgabeFachdaten().addAll((Collection<? extends Ausgabe_Fachdaten>)newValue);
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
			case PlanProPackage.FACHDATEN_ATTRIBUTE_GROUP__AUSGABE_FACHDATEN:
				getAusgabeFachdaten().clear();
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
			case PlanProPackage.FACHDATEN_ATTRIBUTE_GROUP__AUSGABE_FACHDATEN:
				return ausgabeFachdaten != null && !ausgabeFachdaten.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Fachdaten_AttributeGroupImpl
