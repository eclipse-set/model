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

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Bezeichnung_Sk_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schlosskombination_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schlosskombination Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.impl.Schlosskombination_Bezeichnung_AttributeGroupImpl#getBezeichnungSk <em>Bezeichnung Sk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Schlosskombination_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Schlosskombination_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungSk() <em>Bezeichnung Sk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungSk()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Sk_TypeClass bezeichnungSk;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schlosskombination_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchluesselabhaengigkeitenPackage.Literals.SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Sk_TypeClass getBezeichnungSk() {
		return bezeichnungSk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungSk(Bezeichnung_Sk_TypeClass newBezeichnungSk, NotificationChain msgs) {
		Bezeichnung_Sk_TypeClass oldBezeichnungSk = bezeichnungSk;
		bezeichnungSk = newBezeichnungSk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SK, oldBezeichnungSk, newBezeichnungSk);
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
	public void setBezeichnungSk(Bezeichnung_Sk_TypeClass newBezeichnungSk) {
		if (newBezeichnungSk != bezeichnungSk) {
			NotificationChain msgs = null;
			if (bezeichnungSk != null)
				msgs = ((InternalEObject)bezeichnungSk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SK, null, msgs);
			if (newBezeichnungSk != null)
				msgs = ((InternalEObject)newBezeichnungSk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SK, null, msgs);
			msgs = basicSetBezeichnungSk(newBezeichnungSk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SK, newBezeichnungSk, newBezeichnungSk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchluesselabhaengigkeitenPackage.SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SK:
				return basicSetBezeichnungSk(null, msgs);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SK:
				return getBezeichnungSk();
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
			case SchluesselabhaengigkeitenPackage.SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SK:
				setBezeichnungSk((Bezeichnung_Sk_TypeClass)newValue);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SK:
				setBezeichnungSk((Bezeichnung_Sk_TypeClass)null);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SK:
				return bezeichnungSk != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Schlosskombination_Bezeichnung_AttributeGroupImpl
