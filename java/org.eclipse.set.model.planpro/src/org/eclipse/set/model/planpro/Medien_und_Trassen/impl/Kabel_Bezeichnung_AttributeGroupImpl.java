/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Medien_und_Trassen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Medien_und_Trassen.Bezeichnung_Kabel_TypeClass;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kabel Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.Kabel_Bezeichnung_AttributeGroupImpl#getBezeichnungKabel <em>Bezeichnung Kabel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Kabel_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Kabel_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungKabel() <em>Bezeichnung Kabel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungKabel()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Kabel_TypeClass bezeichnungKabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Kabel_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Medien_und_TrassenPackage.Literals.KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Kabel_TypeClass getBezeichnungKabel() {
		return bezeichnungKabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungKabel(Bezeichnung_Kabel_TypeClass newBezeichnungKabel, NotificationChain msgs) {
		Bezeichnung_Kabel_TypeClass oldBezeichnungKabel = bezeichnungKabel;
		bezeichnungKabel = newBezeichnungKabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL, oldBezeichnungKabel, newBezeichnungKabel);
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
	public void setBezeichnungKabel(Bezeichnung_Kabel_TypeClass newBezeichnungKabel) {
		if (newBezeichnungKabel != bezeichnungKabel) {
			NotificationChain msgs = null;
			if (bezeichnungKabel != null)
				msgs = ((InternalEObject)bezeichnungKabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL, null, msgs);
			if (newBezeichnungKabel != null)
				msgs = ((InternalEObject)newBezeichnungKabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL, null, msgs);
			msgs = basicSetBezeichnungKabel(newBezeichnungKabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL, newBezeichnungKabel, newBezeichnungKabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Medien_und_TrassenPackage.KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL:
				return basicSetBezeichnungKabel(null, msgs);
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
			case Medien_und_TrassenPackage.KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL:
				return getBezeichnungKabel();
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
			case Medien_und_TrassenPackage.KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL:
				setBezeichnungKabel((Bezeichnung_Kabel_TypeClass)newValue);
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
			case Medien_und_TrassenPackage.KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL:
				setBezeichnungKabel((Bezeichnung_Kabel_TypeClass)null);
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
			case Medien_und_TrassenPackage.KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL:
				return bezeichnungKabel != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Kabel_Bezeichnung_AttributeGroupImpl
