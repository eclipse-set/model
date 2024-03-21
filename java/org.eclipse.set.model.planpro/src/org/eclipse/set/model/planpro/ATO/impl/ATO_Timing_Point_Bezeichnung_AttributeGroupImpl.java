/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.ATO.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.ATO.ATOPackage;
import org.eclipse.set.model.planpro.ATO.ATO_Timing_Point_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.ATO.Bezeichnung_ATO_TP_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATO Timing Point Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.ATO.impl.ATO_Timing_Point_Bezeichnung_AttributeGroupImpl#getBezeichnungATOTP <em>Bezeichnung ATOTP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ATO_Timing_Point_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements ATO_Timing_Point_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungATOTP() <em>Bezeichnung ATOTP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungATOTP()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_ATO_TP_TypeClass bezeichnungATOTP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATO_Timing_Point_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ATOPackage.Literals.ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_ATO_TP_TypeClass getBezeichnungATOTP() {
		return bezeichnungATOTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungATOTP(Bezeichnung_ATO_TP_TypeClass newBezeichnungATOTP, NotificationChain msgs) {
		Bezeichnung_ATO_TP_TypeClass oldBezeichnungATOTP = bezeichnungATOTP;
		bezeichnungATOTP = newBezeichnungATOTP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ATOTP, oldBezeichnungATOTP, newBezeichnungATOTP);
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
	public void setBezeichnungATOTP(Bezeichnung_ATO_TP_TypeClass newBezeichnungATOTP) {
		if (newBezeichnungATOTP != bezeichnungATOTP) {
			NotificationChain msgs = null;
			if (bezeichnungATOTP != null)
				msgs = ((InternalEObject)bezeichnungATOTP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ATOTP, null, msgs);
			if (newBezeichnungATOTP != null)
				msgs = ((InternalEObject)newBezeichnungATOTP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ATOTP, null, msgs);
			msgs = basicSetBezeichnungATOTP(newBezeichnungATOTP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ATOTP, newBezeichnungATOTP, newBezeichnungATOTP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATOPackage.ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ATOTP:
				return basicSetBezeichnungATOTP(null, msgs);
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
			case ATOPackage.ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ATOTP:
				return getBezeichnungATOTP();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ATOPackage.ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ATOTP:
				setBezeichnungATOTP((Bezeichnung_ATO_TP_TypeClass)newValue);
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
			case ATOPackage.ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ATOTP:
				setBezeichnungATOTP((Bezeichnung_ATO_TP_TypeClass)null);
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
			case ATOPackage.ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ATOTP:
				return bezeichnungATOTP != null;
		}
		return super.eIsSet(featureID);
	}

} //ATO_Timing_Point_Bezeichnung_AttributeGroupImpl
