/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Layoutinformationen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Layoutinformationen.Bezeichnung_Lageplan_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lageplan Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_Bezeichnung_AttributeGroupImpl#getBezeichnungLageplan <em>Bezeichnung Lageplan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Lageplan_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Lageplan_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungLageplan() <em>Bezeichnung Lageplan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungLageplan()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Lageplan_TypeClass bezeichnungLageplan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lageplan_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutinformationenPackage.Literals.LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Lageplan_TypeClass getBezeichnungLageplan() {
		return bezeichnungLageplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungLageplan(Bezeichnung_Lageplan_TypeClass newBezeichnungLageplan, NotificationChain msgs) {
		Bezeichnung_Lageplan_TypeClass oldBezeichnungLageplan = bezeichnungLageplan;
		bezeichnungLageplan = newBezeichnungLageplan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN, oldBezeichnungLageplan, newBezeichnungLageplan);
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
	public void setBezeichnungLageplan(Bezeichnung_Lageplan_TypeClass newBezeichnungLageplan) {
		if (newBezeichnungLageplan != bezeichnungLageplan) {
			NotificationChain msgs = null;
			if (bezeichnungLageplan != null)
				msgs = ((InternalEObject)bezeichnungLageplan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN, null, msgs);
			if (newBezeichnungLageplan != null)
				msgs = ((InternalEObject)newBezeichnungLageplan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN, null, msgs);
			msgs = basicSetBezeichnungLageplan(newBezeichnungLageplan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN, newBezeichnungLageplan, newBezeichnungLageplan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutinformationenPackage.LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN:
				return basicSetBezeichnungLageplan(null, msgs);
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
			case LayoutinformationenPackage.LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN:
				return getBezeichnungLageplan();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LayoutinformationenPackage.LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN:
				setBezeichnungLageplan((Bezeichnung_Lageplan_TypeClass)newValue);
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
			case LayoutinformationenPackage.LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN:
				setBezeichnungLageplan((Bezeichnung_Lageplan_TypeClass)null);
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
			case LayoutinformationenPackage.LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN:
				return bezeichnungLageplan != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Lageplan_Bezeichnung_AttributeGroupImpl
