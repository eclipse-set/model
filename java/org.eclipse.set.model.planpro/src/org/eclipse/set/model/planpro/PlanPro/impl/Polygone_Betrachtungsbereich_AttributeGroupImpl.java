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

import org.eclipse.set.model.planpro.PlanPro.Koordinatensystem_BB_TypeClass;
import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;
import org.eclipse.set.model.planpro.PlanPro.Polygone_Betrachtungsbereich_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.Polygonzug_Betrachtungsbereich_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygone Betrachtungsbereich Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Polygone_Betrachtungsbereich_AttributeGroupImpl#getKoordinatensystemBB <em>Koordinatensystem BB</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Polygone_Betrachtungsbereich_AttributeGroupImpl#getPolygonzugBetrachtungsbereich <em>Polygonzug Betrachtungsbereich</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Polygone_Betrachtungsbereich_AttributeGroupImpl extends EObjectImpl implements Polygone_Betrachtungsbereich_AttributeGroup {
	/**
	 * The cached value of the '{@link #getKoordinatensystemBB() <em>Koordinatensystem BB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKoordinatensystemBB()
	 * @generated
	 * @ordered
	 */
	protected Koordinatensystem_BB_TypeClass koordinatensystemBB;

	/**
	 * The cached value of the '{@link #getPolygonzugBetrachtungsbereich() <em>Polygonzug Betrachtungsbereich</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonzugBetrachtungsbereich()
	 * @generated
	 * @ordered
	 */
	protected EList<Polygonzug_Betrachtungsbereich_TypeClass> polygonzugBetrachtungsbereich;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Polygone_Betrachtungsbereich_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getPolygone_Betrachtungsbereich_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Koordinatensystem_BB_TypeClass getKoordinatensystemBB() {
		return koordinatensystemBB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKoordinatensystemBB(Koordinatensystem_BB_TypeClass newKoordinatensystemBB, NotificationChain msgs) {
		Koordinatensystem_BB_TypeClass oldKoordinatensystemBB = koordinatensystemBB;
		koordinatensystemBB = newKoordinatensystemBB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_BB, oldKoordinatensystemBB, newKoordinatensystemBB);
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
	public void setKoordinatensystemBB(Koordinatensystem_BB_TypeClass newKoordinatensystemBB) {
		if (newKoordinatensystemBB != koordinatensystemBB) {
			NotificationChain msgs = null;
			if (koordinatensystemBB != null)
				msgs = ((InternalEObject)koordinatensystemBB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_BB, null, msgs);
			if (newKoordinatensystemBB != null)
				msgs = ((InternalEObject)newKoordinatensystemBB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_BB, null, msgs);
			msgs = basicSetKoordinatensystemBB(newKoordinatensystemBB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_BB, newKoordinatensystemBB, newKoordinatensystemBB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Polygonzug_Betrachtungsbereich_TypeClass> getPolygonzugBetrachtungsbereich() {
		if (polygonzugBetrachtungsbereich == null) {
			polygonzugBetrachtungsbereich = new EObjectContainmentEList<Polygonzug_Betrachtungsbereich_TypeClass>(Polygonzug_Betrachtungsbereich_TypeClass.class, this, PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP__POLYGONZUG_BETRACHTUNGSBEREICH);
		}
		return polygonzugBetrachtungsbereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_BB:
				return basicSetKoordinatensystemBB(null, msgs);
			case PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP__POLYGONZUG_BETRACHTUNGSBEREICH:
				return ((InternalEList<?>)getPolygonzugBetrachtungsbereich()).basicRemove(otherEnd, msgs);
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
			case PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_BB:
				return getKoordinatensystemBB();
			case PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP__POLYGONZUG_BETRACHTUNGSBEREICH:
				return getPolygonzugBetrachtungsbereich();
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
			case PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_BB:
				setKoordinatensystemBB((Koordinatensystem_BB_TypeClass)newValue);
				return;
			case PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP__POLYGONZUG_BETRACHTUNGSBEREICH:
				getPolygonzugBetrachtungsbereich().clear();
				getPolygonzugBetrachtungsbereich().addAll((Collection<? extends Polygonzug_Betrachtungsbereich_TypeClass>)newValue);
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
			case PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_BB:
				setKoordinatensystemBB((Koordinatensystem_BB_TypeClass)null);
				return;
			case PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP__POLYGONZUG_BETRACHTUNGSBEREICH:
				getPolygonzugBetrachtungsbereich().clear();
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
			case PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP__KOORDINATENSYSTEM_BB:
				return koordinatensystemBB != null;
			case PlanProPackage.POLYGONE_BETRACHTUNGSBEREICH_ATTRIBUTE_GROUP__POLYGONZUG_BETRACHTUNGSBEREICH:
				return polygonzugBetrachtungsbereich != null && !polygonzugBetrachtungsbereich.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Polygone_Betrachtungsbereich_AttributeGroupImpl
