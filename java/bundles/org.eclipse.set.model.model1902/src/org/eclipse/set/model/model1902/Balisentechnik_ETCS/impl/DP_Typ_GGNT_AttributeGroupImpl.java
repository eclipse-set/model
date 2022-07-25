/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GGNT_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GNT_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DP Typ GGNT Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.DP_Typ_GGNT_AttributeGroupImpl#getTCDPTypGNT <em>TCDP Typ GNT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DP_Typ_GGNT_AttributeGroupImpl extends MinimalEObjectImpl.Container implements DP_Typ_GGNT_AttributeGroup {
	/**
	 * The cached value of the '{@link #getTCDPTypGNT() <em>TCDP Typ GNT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCDPTypGNT()
	 * @generated
	 * @ordered
	 */
	protected DP_Typ_GNT_TypeClass tCDPTypGNT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DP_Typ_GGNT_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDP_Typ_GGNT_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_GNT_TypeClass getTCDPTypGNT() {
		return tCDPTypGNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCDPTypGNT(DP_Typ_GNT_TypeClass newTCDPTypGNT, NotificationChain msgs) {
		DP_Typ_GNT_TypeClass oldTCDPTypGNT = tCDPTypGNT;
		tCDPTypGNT = newTCDPTypGNT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__TCDP_TYP_GNT, oldTCDPTypGNT, newTCDPTypGNT);
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
	public void setTCDPTypGNT(DP_Typ_GNT_TypeClass newTCDPTypGNT) {
		if (newTCDPTypGNT != tCDPTypGNT) {
			NotificationChain msgs = null;
			if (tCDPTypGNT != null)
				msgs = ((InternalEObject)tCDPTypGNT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__TCDP_TYP_GNT, null, msgs);
			if (newTCDPTypGNT != null)
				msgs = ((InternalEObject)newTCDPTypGNT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__TCDP_TYP_GNT, null, msgs);
			msgs = basicSetTCDPTypGNT(newTCDPTypGNT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__TCDP_TYP_GNT, newTCDPTypGNT, newTCDPTypGNT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__TCDP_TYP_GNT:
				return basicSetTCDPTypGNT(null, msgs);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__TCDP_TYP_GNT:
				return getTCDPTypGNT();
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
			case Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__TCDP_TYP_GNT:
				setTCDPTypGNT((DP_Typ_GNT_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__TCDP_TYP_GNT:
				setTCDPTypGNT((DP_Typ_GNT_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__TCDP_TYP_GNT:
				return tCDPTypGNT != null;
		}
		return super.eIsSet(featureID);
	}

} //DP_Typ_GGNT_AttributeGroupImpl
