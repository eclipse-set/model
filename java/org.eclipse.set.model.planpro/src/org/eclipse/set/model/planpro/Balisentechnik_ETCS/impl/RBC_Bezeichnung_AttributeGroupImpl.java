/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bezeichnung_RBC_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.RBC_Bezeichnung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RBC Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.RBC_Bezeichnung_AttributeGroupImpl#getBezeichnungRBC <em>Bezeichnung RBC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RBC_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements RBC_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungRBC() <em>Bezeichnung RBC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungRBC()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_RBC_TypeClass bezeichnungRBC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RBC_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getRBC_Bezeichnung_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_RBC_TypeClass getBezeichnungRBC() {
		return bezeichnungRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungRBC(Bezeichnung_RBC_TypeClass newBezeichnungRBC, NotificationChain msgs) {
		Bezeichnung_RBC_TypeClass oldBezeichnungRBC = bezeichnungRBC;
		bezeichnungRBC = newBezeichnungRBC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.RBC_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_RBC, oldBezeichnungRBC, newBezeichnungRBC);
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
	public void setBezeichnungRBC(Bezeichnung_RBC_TypeClass newBezeichnungRBC) {
		if (newBezeichnungRBC != bezeichnungRBC) {
			NotificationChain msgs = null;
			if (bezeichnungRBC != null)
				msgs = ((InternalEObject)bezeichnungRBC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.RBC_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_RBC, null, msgs);
			if (newBezeichnungRBC != null)
				msgs = ((InternalEObject)newBezeichnungRBC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.RBC_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_RBC, null, msgs);
			msgs = basicSetBezeichnungRBC(newBezeichnungRBC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.RBC_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_RBC, newBezeichnungRBC, newBezeichnungRBC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.RBC_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_RBC:
				return basicSetBezeichnungRBC(null, msgs);
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
			case Balisentechnik_ETCSPackage.RBC_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_RBC:
				return getBezeichnungRBC();
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
			case Balisentechnik_ETCSPackage.RBC_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_RBC:
				setBezeichnungRBC((Bezeichnung_RBC_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.RBC_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_RBC:
				setBezeichnungRBC((Bezeichnung_RBC_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.RBC_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_RBC:
				return bezeichnungRBC != null;
		}
		return super.eIsSet(featureID);
	}

} //RBC_Bezeichnung_AttributeGroupImpl
