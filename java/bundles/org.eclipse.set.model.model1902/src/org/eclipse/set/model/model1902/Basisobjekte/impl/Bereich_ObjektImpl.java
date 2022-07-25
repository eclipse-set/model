/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Basisobjekte.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.model.model1902.Basisobjekte.Bereich_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bereich Objekt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.impl.Bereich_ObjektImpl#getBereichObjektTeilbereich <em>Bereich Objekt Teilbereich</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Bereich_ObjektImpl extends Basis_ObjektImpl implements Bereich_Objekt {
	/**
	 * The cached value of the '{@link #getBereichObjektTeilbereich() <em>Bereich Objekt Teilbereich</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBereichObjektTeilbereich()
	 * @generated
	 * @ordered
	 */
	protected EList<Bereich_Objekt_Teilbereich_AttributeGroup> bereichObjektTeilbereich;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bereich_ObjektImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisobjektePackage.Literals.BEREICH_OBJEKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bereich_Objekt_Teilbereich_AttributeGroup> getBereichObjektTeilbereich() {
		if (bereichObjektTeilbereich == null) {
			bereichObjektTeilbereich = new EObjectContainmentEList<Bereich_Objekt_Teilbereich_AttributeGroup>(Bereich_Objekt_Teilbereich_AttributeGroup.class, this, BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH);
		}
		return bereichObjektTeilbereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH:
				return ((InternalEList<?>)getBereichObjektTeilbereich()).basicRemove(otherEnd, msgs);
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
			case BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH:
				return getBereichObjektTeilbereich();
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
			case BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH:
				getBereichObjektTeilbereich().clear();
				getBereichObjektTeilbereich().addAll((Collection<? extends Bereich_Objekt_Teilbereich_AttributeGroup>)newValue);
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
			case BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH:
				getBereichObjektTeilbereich().clear();
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
			case BasisobjektePackage.BEREICH_OBJEKT__BEREICH_OBJEKT_TEILBEREICH:
				return bereichObjektTeilbereich != null && !bereichObjektTeilbereich.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Bereich_ObjektImpl
