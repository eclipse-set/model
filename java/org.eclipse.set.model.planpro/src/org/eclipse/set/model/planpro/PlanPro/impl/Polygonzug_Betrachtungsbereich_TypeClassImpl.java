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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.BasisTypen.impl.BasisAttribut_AttributeGroupImpl;

import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;
import org.eclipse.set.model.planpro.PlanPro.Polygonzug_Betrachtungsbereich_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygonzug Betrachtungsbereich Type Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Polygonzug_Betrachtungsbereich_TypeClassImpl#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Polygonzug_Betrachtungsbereich_TypeClassImpl extends BasisAttribut_AttributeGroupImpl implements Polygonzug_Betrachtungsbereich_TypeClass {
	/**
	 * The default value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected static final String WERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected String wert = WERT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Polygonzug_Betrachtungsbereich_TypeClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getPolygonzug_Betrachtungsbereich_TypeClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWert() {
		return wert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWert(String newWert) {
		String oldWert = wert;
		wert = newWert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.POLYGONZUG_BETRACHTUNGSBEREICH_TYPE_CLASS__WERT, oldWert, wert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlanProPackage.POLYGONZUG_BETRACHTUNGSBEREICH_TYPE_CLASS__WERT:
				return getWert();
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
			case PlanProPackage.POLYGONZUG_BETRACHTUNGSBEREICH_TYPE_CLASS__WERT:
				setWert((String)newValue);
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
			case PlanProPackage.POLYGONZUG_BETRACHTUNGSBEREICH_TYPE_CLASS__WERT:
				setWert(WERT_EDEFAULT);
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
			case PlanProPackage.POLYGONZUG_BETRACHTUNGSBEREICH_TYPE_CLASS__WERT:
				return WERT_EDEFAULT == null ? wert != null : !WERT_EDEFAULT.equals(wert);
			default:
				return super.eIsSet(featureID);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (wert: ");
		result.append(wert);
		result.append(')');
		return result.toString();
	}

} //Polygonzug_Betrachtungsbereich_TypeClassImpl
