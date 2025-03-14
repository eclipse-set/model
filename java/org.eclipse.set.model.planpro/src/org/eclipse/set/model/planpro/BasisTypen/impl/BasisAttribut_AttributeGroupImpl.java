/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.BasisTypen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;
import org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage;
import org.eclipse.set.model.planpro.BasisTypen.ID_Bearbeitungsvermerk_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basis Attribut Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.BasisTypen.impl.BasisAttribut_AttributeGroupImpl#getIDBearbeitungsvermerk <em>ID Bearbeitungsvermerk</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BasisAttribut_AttributeGroupImpl extends EObjectImpl implements BasisAttribut_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDBearbeitungsvermerk() <em>ID Bearbeitungsvermerk</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBearbeitungsvermerk()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Bearbeitungsvermerk_TypeClass> iDBearbeitungsvermerk;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasisAttribut_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisTypenPackage.Literals.BASIS_ATTRIBUT_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Bearbeitungsvermerk_TypeClass> getIDBearbeitungsvermerk() {
		if (iDBearbeitungsvermerk == null) {
			iDBearbeitungsvermerk = new EObjectContainmentEList<ID_Bearbeitungsvermerk_TypeClass>(ID_Bearbeitungsvermerk_TypeClass.class, this, BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK);
		}
		return iDBearbeitungsvermerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK:
				return ((InternalEList<?>)getIDBearbeitungsvermerk()).basicRemove(otherEnd, msgs);
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
			case BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK:
				return getIDBearbeitungsvermerk();
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
			case BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK:
				getIDBearbeitungsvermerk().clear();
				getIDBearbeitungsvermerk().addAll((Collection<? extends ID_Bearbeitungsvermerk_TypeClass>)newValue);
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
			case BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK:
				getIDBearbeitungsvermerk().clear();
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
			case BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK:
				return iDBearbeitungsvermerk != null && !iDBearbeitungsvermerk.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //BasisAttribut_AttributeGroupImpl
