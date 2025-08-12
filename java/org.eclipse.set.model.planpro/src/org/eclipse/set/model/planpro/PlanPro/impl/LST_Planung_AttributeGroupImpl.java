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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.PlanPro.Fachdaten_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.LST_Planung_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.Objektmanagement_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LST Planung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.LST_Planung_AttributeGroupImpl#getFachdaten <em>Fachdaten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.LST_Planung_AttributeGroupImpl#getObjektmanagement <em>Objektmanagement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LST_Planung_AttributeGroupImpl extends EObjectImpl implements LST_Planung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFachdaten() <em>Fachdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFachdaten()
	 * @generated
	 * @ordered
	 */
	protected Fachdaten_AttributeGroup fachdaten;

	/**
	 * The cached value of the '{@link #getObjektmanagement() <em>Objektmanagement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjektmanagement()
	 * @generated
	 * @ordered
	 */
	protected Objektmanagement_AttributeGroup objektmanagement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LST_Planung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getLST_Planung_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fachdaten_AttributeGroup getFachdaten() {
		return fachdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFachdaten(Fachdaten_AttributeGroup newFachdaten, NotificationChain msgs) {
		Fachdaten_AttributeGroup oldFachdaten = fachdaten;
		fachdaten = newFachdaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__FACHDATEN, oldFachdaten, newFachdaten);
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
	public void setFachdaten(Fachdaten_AttributeGroup newFachdaten) {
		if (newFachdaten != fachdaten) {
			NotificationChain msgs = null;
			if (fachdaten != null)
				msgs = ((InternalEObject)fachdaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__FACHDATEN, null, msgs);
			if (newFachdaten != null)
				msgs = ((InternalEObject)newFachdaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__FACHDATEN, null, msgs);
			msgs = basicSetFachdaten(newFachdaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__FACHDATEN, newFachdaten, newFachdaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Objektmanagement_AttributeGroup getObjektmanagement() {
		return objektmanagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjektmanagement(Objektmanagement_AttributeGroup newObjektmanagement, NotificationChain msgs) {
		Objektmanagement_AttributeGroup oldObjektmanagement = objektmanagement;
		objektmanagement = newObjektmanagement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__OBJEKTMANAGEMENT, oldObjektmanagement, newObjektmanagement);
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
	public void setObjektmanagement(Objektmanagement_AttributeGroup newObjektmanagement) {
		if (newObjektmanagement != objektmanagement) {
			NotificationChain msgs = null;
			if (objektmanagement != null)
				msgs = ((InternalEObject)objektmanagement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__OBJEKTMANAGEMENT, null, msgs);
			if (newObjektmanagement != null)
				msgs = ((InternalEObject)newObjektmanagement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__OBJEKTMANAGEMENT, null, msgs);
			msgs = basicSetObjektmanagement(newObjektmanagement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__OBJEKTMANAGEMENT, newObjektmanagement, newObjektmanagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__FACHDATEN:
				return basicSetFachdaten(null, msgs);
			case PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__OBJEKTMANAGEMENT:
				return basicSetObjektmanagement(null, msgs);
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
			case PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__FACHDATEN:
				return getFachdaten();
			case PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__OBJEKTMANAGEMENT:
				return getObjektmanagement();
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
			case PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__FACHDATEN:
				setFachdaten((Fachdaten_AttributeGroup)newValue);
				return;
			case PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__OBJEKTMANAGEMENT:
				setObjektmanagement((Objektmanagement_AttributeGroup)newValue);
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
			case PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__FACHDATEN:
				setFachdaten((Fachdaten_AttributeGroup)null);
				return;
			case PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__OBJEKTMANAGEMENT:
				setObjektmanagement((Objektmanagement_AttributeGroup)null);
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
			case PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__FACHDATEN:
				return fachdaten != null;
			case PlanProPackage.LST_PLANUNG_ATTRIBUTE_GROUP__OBJEKTMANAGEMENT:
				return objektmanagement != null;
		}
		return super.eIsSet(featureID);
	}

} //LST_Planung_AttributeGroupImpl
