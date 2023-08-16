/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_Typ_GZBS_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_Typ_ZBS_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DP Typ GZBS Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.DP_Typ_GZBS_AttributeGroupImpl#getDPTypZBS <em>DP Typ ZBS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DP_Typ_GZBS_AttributeGroupImpl extends EObjectImpl implements DP_Typ_GZBS_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDPTypZBS() <em>DP Typ ZBS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTypZBS()
	 * @generated
	 * @ordered
	 */
	protected DP_Typ_ZBS_TypeClass dPTypZBS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DP_Typ_GZBS_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDP_Typ_GZBS_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_ZBS_TypeClass getDPTypZBS() {
		return dPTypZBS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPTypZBS(DP_Typ_ZBS_TypeClass newDPTypZBS, NotificationChain msgs) {
		DP_Typ_ZBS_TypeClass oldDPTypZBS = dPTypZBS;
		dPTypZBS = newDPTypZBS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GZBS_ATTRIBUTE_GROUP__DP_TYP_ZBS, oldDPTypZBS, newDPTypZBS);
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
	public void setDPTypZBS(DP_Typ_ZBS_TypeClass newDPTypZBS) {
		if (newDPTypZBS != dPTypZBS) {
			NotificationChain msgs = null;
			if (dPTypZBS != null)
				msgs = ((InternalEObject)dPTypZBS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GZBS_ATTRIBUTE_GROUP__DP_TYP_ZBS, null, msgs);
			if (newDPTypZBS != null)
				msgs = ((InternalEObject)newDPTypZBS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GZBS_ATTRIBUTE_GROUP__DP_TYP_ZBS, null, msgs);
			msgs = basicSetDPTypZBS(newDPTypZBS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GZBS_ATTRIBUTE_GROUP__DP_TYP_ZBS, newDPTypZBS, newDPTypZBS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_TYP_GZBS_ATTRIBUTE_GROUP__DP_TYP_ZBS:
				return basicSetDPTypZBS(null, msgs);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GZBS_ATTRIBUTE_GROUP__DP_TYP_ZBS:
				return getDPTypZBS();
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
			case Balisentechnik_ETCSPackage.DP_TYP_GZBS_ATTRIBUTE_GROUP__DP_TYP_ZBS:
				setDPTypZBS((DP_Typ_ZBS_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GZBS_ATTRIBUTE_GROUP__DP_TYP_ZBS:
				setDPTypZBS((DP_Typ_ZBS_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GZBS_ATTRIBUTE_GROUP__DP_TYP_ZBS:
				return dPTypZBS != null;
		}
		return super.eIsSet(featureID);
	}

} //DP_Typ_GZBS_AttributeGroupImpl
