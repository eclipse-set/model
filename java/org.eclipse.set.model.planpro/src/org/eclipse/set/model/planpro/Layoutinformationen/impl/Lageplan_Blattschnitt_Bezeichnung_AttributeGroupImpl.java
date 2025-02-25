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

import org.eclipse.set.model.planpro.Layoutinformationen.Bez_Lageplan_Blattschnitt_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lageplan Blattschnitt Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_Blattschnitt_Bezeichnung_AttributeGroupImpl#getBezLageplanBlattschnitt <em>Bez Lageplan Blattschnitt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Lageplan_Blattschnitt_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Lageplan_Blattschnitt_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezLageplanBlattschnitt() <em>Bez Lageplan Blattschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezLageplanBlattschnitt()
	 * @generated
	 * @ordered
	 */
	protected Bez_Lageplan_Blattschnitt_TypeClass bezLageplanBlattschnitt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lageplan_Blattschnitt_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutinformationenPackage.Literals.LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_Lageplan_Blattschnitt_TypeClass getBezLageplanBlattschnitt() {
		return bezLageplanBlattschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezLageplanBlattschnitt(Bez_Lageplan_Blattschnitt_TypeClass newBezLageplanBlattschnitt, NotificationChain msgs) {
		Bez_Lageplan_Blattschnitt_TypeClass oldBezLageplanBlattschnitt = bezLageplanBlattschnitt;
		bezLageplanBlattschnitt = newBezLageplanBlattschnitt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_LAGEPLAN_BLATTSCHNITT, oldBezLageplanBlattschnitt, newBezLageplanBlattschnitt);
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
	public void setBezLageplanBlattschnitt(Bez_Lageplan_Blattschnitt_TypeClass newBezLageplanBlattschnitt) {
		if (newBezLageplanBlattschnitt != bezLageplanBlattschnitt) {
			NotificationChain msgs = null;
			if (bezLageplanBlattschnitt != null)
				msgs = ((InternalEObject)bezLageplanBlattschnitt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_LAGEPLAN_BLATTSCHNITT, null, msgs);
			if (newBezLageplanBlattschnitt != null)
				msgs = ((InternalEObject)newBezLageplanBlattschnitt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_LAGEPLAN_BLATTSCHNITT, null, msgs);
			msgs = basicSetBezLageplanBlattschnitt(newBezLageplanBlattschnitt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_LAGEPLAN_BLATTSCHNITT, newBezLageplanBlattschnitt, newBezLageplanBlattschnitt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_LAGEPLAN_BLATTSCHNITT:
				return basicSetBezLageplanBlattschnitt(null, msgs);
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
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_LAGEPLAN_BLATTSCHNITT:
				return getBezLageplanBlattschnitt();
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
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_LAGEPLAN_BLATTSCHNITT:
				setBezLageplanBlattschnitt((Bez_Lageplan_Blattschnitt_TypeClass)newValue);
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
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_LAGEPLAN_BLATTSCHNITT:
				setBezLageplanBlattschnitt((Bez_Lageplan_Blattschnitt_TypeClass)null);
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
			case LayoutinformationenPackage.LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_LAGEPLAN_BLATTSCHNITT:
				return bezLageplanBlattschnitt != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Lageplan_Blattschnitt_Bezeichnung_AttributeGroupImpl
