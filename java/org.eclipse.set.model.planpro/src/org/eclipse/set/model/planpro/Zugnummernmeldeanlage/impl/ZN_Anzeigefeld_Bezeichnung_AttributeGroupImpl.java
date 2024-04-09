/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_A_Bedienbezeichner_Frei_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_A_Bezeichner_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Anzeigefeld Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Anzeigefeld_Bezeichnung_AttributeGroupImpl#getZNABedienbezeichnerFrei <em>ZNA Bedienbezeichner Frei</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Anzeigefeld_Bezeichnung_AttributeGroupImpl#getZNABezeichner <em>ZNA Bezeichner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_Anzeigefeld_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements ZN_Anzeigefeld_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getZNABedienbezeichnerFrei() <em>ZNA Bedienbezeichner Frei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNABedienbezeichnerFrei()
	 * @generated
	 * @ordered
	 */
	protected ZN_A_Bedienbezeichner_Frei_TypeClass zNABedienbezeichnerFrei;

	/**
	 * The cached value of the '{@link #getZNABezeichner() <em>ZNA Bezeichner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNABezeichner()
	 * @generated
	 * @ordered
	 */
	protected ZN_A_Bezeichner_TypeClass zNABezeichner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_Anzeigefeld_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_A_Bedienbezeichner_Frei_TypeClass getZNABedienbezeichnerFrei() {
		return zNABedienbezeichnerFrei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNABedienbezeichnerFrei(ZN_A_Bedienbezeichner_Frei_TypeClass newZNABedienbezeichnerFrei, NotificationChain msgs) {
		ZN_A_Bedienbezeichner_Frei_TypeClass oldZNABedienbezeichnerFrei = zNABedienbezeichnerFrei;
		zNABedienbezeichnerFrei = newZNABedienbezeichnerFrei;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEDIENBEZEICHNER_FREI, oldZNABedienbezeichnerFrei, newZNABedienbezeichnerFrei);
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
	public void setZNABedienbezeichnerFrei(ZN_A_Bedienbezeichner_Frei_TypeClass newZNABedienbezeichnerFrei) {
		if (newZNABedienbezeichnerFrei != zNABedienbezeichnerFrei) {
			NotificationChain msgs = null;
			if (zNABedienbezeichnerFrei != null)
				msgs = ((InternalEObject)zNABedienbezeichnerFrei).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEDIENBEZEICHNER_FREI, null, msgs);
			if (newZNABedienbezeichnerFrei != null)
				msgs = ((InternalEObject)newZNABedienbezeichnerFrei).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEDIENBEZEICHNER_FREI, null, msgs);
			msgs = basicSetZNABedienbezeichnerFrei(newZNABedienbezeichnerFrei, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEDIENBEZEICHNER_FREI, newZNABedienbezeichnerFrei, newZNABedienbezeichnerFrei));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_A_Bezeichner_TypeClass getZNABezeichner() {
		return zNABezeichner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNABezeichner(ZN_A_Bezeichner_TypeClass newZNABezeichner, NotificationChain msgs) {
		ZN_A_Bezeichner_TypeClass oldZNABezeichner = zNABezeichner;
		zNABezeichner = newZNABezeichner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEZEICHNER, oldZNABezeichner, newZNABezeichner);
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
	public void setZNABezeichner(ZN_A_Bezeichner_TypeClass newZNABezeichner) {
		if (newZNABezeichner != zNABezeichner) {
			NotificationChain msgs = null;
			if (zNABezeichner != null)
				msgs = ((InternalEObject)zNABezeichner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEZEICHNER, null, msgs);
			if (newZNABezeichner != null)
				msgs = ((InternalEObject)newZNABezeichner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEZEICHNER, null, msgs);
			msgs = basicSetZNABezeichner(newZNABezeichner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEZEICHNER, newZNABezeichner, newZNABezeichner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEDIENBEZEICHNER_FREI:
				return basicSetZNABedienbezeichnerFrei(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEZEICHNER:
				return basicSetZNABezeichner(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEDIENBEZEICHNER_FREI:
				return getZNABedienbezeichnerFrei();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEZEICHNER:
				return getZNABezeichner();
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
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEDIENBEZEICHNER_FREI:
				setZNABedienbezeichnerFrei((ZN_A_Bedienbezeichner_Frei_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEZEICHNER:
				setZNABezeichner((ZN_A_Bezeichner_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEDIENBEZEICHNER_FREI:
				setZNABedienbezeichnerFrei((ZN_A_Bedienbezeichner_Frei_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEZEICHNER:
				setZNABezeichner((ZN_A_Bezeichner_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEDIENBEZEICHNER_FREI:
				return zNABedienbezeichnerFrei != null;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_BEZEICHNUNG_ATTRIBUTE_GROUP__ZNA_BEZEICHNER:
				return zNABezeichner != null;
		}
		return super.eIsSet(featureID);
	}

} //ZN_Anzeigefeld_Bezeichnung_AttributeGroupImpl
