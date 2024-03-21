/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Bezeichnung_Schloss_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schloss Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.impl.Schloss_Bezeichnung_AttributeGroupImpl#getBezeichnungSchloss <em>Bezeichnung Schloss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Schloss_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Schloss_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungSchloss() <em>Bezeichnung Schloss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungSchloss()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Schloss_TypeClass bezeichnungSchloss;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schloss_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchluesselabhaengigkeitenPackage.Literals.SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Schloss_TypeClass getBezeichnungSchloss() {
		return bezeichnungSchloss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungSchloss(Bezeichnung_Schloss_TypeClass newBezeichnungSchloss, NotificationChain msgs) {
		Bezeichnung_Schloss_TypeClass oldBezeichnungSchloss = bezeichnungSchloss;
		bezeichnungSchloss = newBezeichnungSchloss;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLOSS, oldBezeichnungSchloss, newBezeichnungSchloss);
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
	public void setBezeichnungSchloss(Bezeichnung_Schloss_TypeClass newBezeichnungSchloss) {
		if (newBezeichnungSchloss != bezeichnungSchloss) {
			NotificationChain msgs = null;
			if (bezeichnungSchloss != null)
				msgs = ((InternalEObject)bezeichnungSchloss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLOSS, null, msgs);
			if (newBezeichnungSchloss != null)
				msgs = ((InternalEObject)newBezeichnungSchloss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLOSS, null, msgs);
			msgs = basicSetBezeichnungSchloss(newBezeichnungSchloss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLOSS, newBezeichnungSchloss, newBezeichnungSchloss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchluesselabhaengigkeitenPackage.SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLOSS:
				return basicSetBezeichnungSchloss(null, msgs);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLOSS:
				return getBezeichnungSchloss();
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLOSS:
				setBezeichnungSchloss((Bezeichnung_Schloss_TypeClass)newValue);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLOSS:
				setBezeichnungSchloss((Bezeichnung_Schloss_TypeClass)null);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLOSS:
				return bezeichnungSchloss != null;
		}
		return super.eIsSet(featureID);
	}

} //Schloss_Bezeichnung_AttributeGroupImpl
