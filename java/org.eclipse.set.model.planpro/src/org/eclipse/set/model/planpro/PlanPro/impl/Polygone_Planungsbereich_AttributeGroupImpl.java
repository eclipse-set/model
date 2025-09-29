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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.PlanPro.Koordinatensystem_PB_TypeClass;
import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;
import org.eclipse.set.model.planpro.PlanPro.Polygone_Planungsbereich_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.Polygonzug_Planungsbereich_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygone Planungsbereich Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Polygone_Planungsbereich_AttributeGroupImpl#getKoordinatensystemPB <em>Koordinatensystem PB</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Polygone_Planungsbereich_AttributeGroupImpl#getPolygonzugPlanungsbereich <em>Polygonzug Planungsbereich</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Polygone_Planungsbereich_AttributeGroupImpl extends EObjectImpl implements Polygone_Planungsbereich_AttributeGroup {
	/**
	 * The cached value of the '{@link #getKoordinatensystemPB() <em>Koordinatensystem PB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKoordinatensystemPB()
	 * @generated
	 * @ordered
	 */
	protected Koordinatensystem_PB_TypeClass koordinatensystemPB;

	/**
	 * The cached value of the '{@link #getPolygonzugPlanungsbereich() <em>Polygonzug Planungsbereich</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonzugPlanungsbereich()
	 * @generated
	 * @ordered
	 */
	protected EList<Polygonzug_Planungsbereich_TypeClass> polygonzugPlanungsbereich;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Polygone_Planungsbereich_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getPolygone_Planungsbereich_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Koordinatensystem_PB_TypeClass getKoordinatensystemPB() {
		return koordinatensystemPB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKoordinatensystemPB(Koordinatensystem_PB_TypeClass newKoordinatensystemPB, NotificationChain msgs) {
		Koordinatensystem_PB_TypeClass oldKoordinatensystemPB = koordinatensystemPB;
		koordinatensystemPB = newKoordinatensystemPB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_PB, oldKoordinatensystemPB, newKoordinatensystemPB);
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
	public void setKoordinatensystemPB(Koordinatensystem_PB_TypeClass newKoordinatensystemPB) {
		if (newKoordinatensystemPB != koordinatensystemPB) {
			NotificationChain msgs = null;
			if (koordinatensystemPB != null)
				msgs = ((InternalEObject)koordinatensystemPB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_PB, null, msgs);
			if (newKoordinatensystemPB != null)
				msgs = ((InternalEObject)newKoordinatensystemPB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_PB, null, msgs);
			msgs = basicSetKoordinatensystemPB(newKoordinatensystemPB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_PB, newKoordinatensystemPB, newKoordinatensystemPB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Polygonzug_Planungsbereich_TypeClass> getPolygonzugPlanungsbereich() {
		if (polygonzugPlanungsbereich == null) {
			polygonzugPlanungsbereich = new EObjectContainmentEList<Polygonzug_Planungsbereich_TypeClass>(Polygonzug_Planungsbereich_TypeClass.class, this, PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__POLYGONZUG_PLANUNGSBEREICH);
		}
		return polygonzugPlanungsbereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_PB:
				return basicSetKoordinatensystemPB(null, msgs);
			case PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__POLYGONZUG_PLANUNGSBEREICH:
				return ((InternalEList<?>)getPolygonzugPlanungsbereich()).basicRemove(otherEnd, msgs);
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
			case PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_PB:
				return getKoordinatensystemPB();
			case PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__POLYGONZUG_PLANUNGSBEREICH:
				return getPolygonzugPlanungsbereich();
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
			case PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_PB:
				setKoordinatensystemPB((Koordinatensystem_PB_TypeClass)newValue);
				return;
			case PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__POLYGONZUG_PLANUNGSBEREICH:
				getPolygonzugPlanungsbereich().clear();
				getPolygonzugPlanungsbereich().addAll((Collection<? extends Polygonzug_Planungsbereich_TypeClass>)newValue);
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
			case PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_PB:
				setKoordinatensystemPB((Koordinatensystem_PB_TypeClass)null);
				return;
			case PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__POLYGONZUG_PLANUNGSBEREICH:
				getPolygonzugPlanungsbereich().clear();
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
			case PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_PB:
				return koordinatensystemPB != null;
			case PlanProPackage.POLYGONE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__POLYGONZUG_PLANUNGSBEREICH:
				return polygonzugPlanungsbereich != null && !polygonzugPlanungsbereich.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Polygone_Planungsbereich_AttributeGroupImpl
