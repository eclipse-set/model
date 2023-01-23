/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Bedienung.Bedien_Standort_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Bedienung.BedienungPackage;
import org.eclipse.set.model.model11001.Bedienung.Bezeichnung_BSO_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Standort Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.impl.Bedien_Standort_Bezeichnung_AttributeGroupImpl#getBezeichnungBSO <em>Bezeichnung BSO</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Standort_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Bedien_Standort_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungBSO() <em>Bezeichnung BSO</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungBSO()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_BSO_TypeClass bezeichnungBSO;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Standort_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_BSO_TypeClass getBezeichnungBSO() {
		return bezeichnungBSO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungBSO(Bezeichnung_BSO_TypeClass newBezeichnungBSO, NotificationChain msgs) {
		Bezeichnung_BSO_TypeClass oldBezeichnungBSO = bezeichnungBSO;
		bezeichnungBSO = newBezeichnungBSO;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BSO, oldBezeichnungBSO, newBezeichnungBSO);
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
	public void setBezeichnungBSO(Bezeichnung_BSO_TypeClass newBezeichnungBSO) {
		if (newBezeichnungBSO != bezeichnungBSO) {
			NotificationChain msgs = null;
			if (bezeichnungBSO != null)
				msgs = ((InternalEObject)bezeichnungBSO).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BSO, null, msgs);
			if (newBezeichnungBSO != null)
				msgs = ((InternalEObject)newBezeichnungBSO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BSO, null, msgs);
			msgs = basicSetBezeichnungBSO(newBezeichnungBSO, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BSO, newBezeichnungBSO, newBezeichnungBSO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BSO:
				return basicSetBezeichnungBSO(null, msgs);
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
			case BedienungPackage.BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BSO:
				return getBezeichnungBSO();
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
			case BedienungPackage.BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BSO:
				setBezeichnungBSO((Bezeichnung_BSO_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BSO:
				setBezeichnungBSO((Bezeichnung_BSO_TypeClass)null);
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
			case BedienungPackage.BEDIEN_STANDORT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BSO:
				return bezeichnungBSO != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_Standort_Bezeichnung_AttributeGroupImpl
