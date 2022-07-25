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

import org.eclipse.set.model.model1902.PlanPro.LST_Objekte_Planungsbereich_AttributeGroup;
import org.eclipse.set.model.model1902.PlanPro.PlanProPackage;

import org.eclipse.set.model.model1902.Verweise.ID_Ur_Objekt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LST Objekte Planungsbereich Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.LST_Objekte_Planungsbereich_AttributeGroupImpl#getIDLSTObjektPlanungsbereich <em>IDLST Objekt Planungsbereich</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LST_Objekte_Planungsbereich_AttributeGroupImpl extends MinimalEObjectImpl.Container implements LST_Objekte_Planungsbereich_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDLSTObjektPlanungsbereich() <em>IDLST Objekt Planungsbereich</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDLSTObjektPlanungsbereich()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Ur_Objekt_TypeClass> iDLSTObjektPlanungsbereich;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LST_Objekte_Planungsbereich_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getLST_Objekte_Planungsbereich_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Ur_Objekt_TypeClass> getIDLSTObjektPlanungsbereich() {
		if (iDLSTObjektPlanungsbereich == null) {
			iDLSTObjektPlanungsbereich = new EObjectContainmentEList<ID_Ur_Objekt_TypeClass>(ID_Ur_Objekt_TypeClass.class, this, PlanProPackage.LST_OBJEKTE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__IDLST_OBJEKT_PLANUNGSBEREICH);
		}
		return iDLSTObjektPlanungsbereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.LST_OBJEKTE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__IDLST_OBJEKT_PLANUNGSBEREICH:
				return ((InternalEList<?>)getIDLSTObjektPlanungsbereich()).basicRemove(otherEnd, msgs);
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
			case PlanProPackage.LST_OBJEKTE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__IDLST_OBJEKT_PLANUNGSBEREICH:
				return getIDLSTObjektPlanungsbereich();
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
			case PlanProPackage.LST_OBJEKTE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__IDLST_OBJEKT_PLANUNGSBEREICH:
				getIDLSTObjektPlanungsbereich().clear();
				getIDLSTObjektPlanungsbereich().addAll((Collection<? extends ID_Ur_Objekt_TypeClass>)newValue);
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
			case PlanProPackage.LST_OBJEKTE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__IDLST_OBJEKT_PLANUNGSBEREICH:
				getIDLSTObjektPlanungsbereich().clear();
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
			case PlanProPackage.LST_OBJEKTE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__IDLST_OBJEKT_PLANUNGSBEREICH:
				return iDLSTObjektPlanungsbereich != null && !iDLSTObjektPlanungsbereich.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LST_Objekte_Planungsbereich_AttributeGroupImpl
