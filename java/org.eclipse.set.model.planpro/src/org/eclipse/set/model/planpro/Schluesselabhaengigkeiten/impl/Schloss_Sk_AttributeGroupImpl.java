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

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Hauptschloss_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

import org.eclipse.set.model.planpro.Verweise.ID_Schlosskombination_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schloss Sk Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.impl.Schloss_Sk_AttributeGroupImpl#getHauptschloss <em>Hauptschloss</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.impl.Schloss_Sk_AttributeGroupImpl#getIDSchlosskombination <em>ID Schlosskombination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Schloss_Sk_AttributeGroupImpl extends EObjectImpl implements Schloss_Sk_AttributeGroup {
	/**
	 * The cached value of the '{@link #getHauptschloss() <em>Hauptschloss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauptschloss()
	 * @generated
	 * @ordered
	 */
	protected Hauptschloss_TypeClass hauptschloss;

	/**
	 * The cached value of the '{@link #getIDSchlosskombination() <em>ID Schlosskombination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSchlosskombination()
	 * @generated
	 * @ordered
	 */
	protected ID_Schlosskombination_TypeClass iDSchlosskombination;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schloss_Sk_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchluesselabhaengigkeitenPackage.Literals.SCHLOSS_SK_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hauptschloss_TypeClass getHauptschloss() {
		return hauptschloss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHauptschloss(Hauptschloss_TypeClass newHauptschloss, NotificationChain msgs) {
		Hauptschloss_TypeClass oldHauptschloss = hauptschloss;
		hauptschloss = newHauptschloss;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS, oldHauptschloss, newHauptschloss);
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
	public void setHauptschloss(Hauptschloss_TypeClass newHauptschloss) {
		if (newHauptschloss != hauptschloss) {
			NotificationChain msgs = null;
			if (hauptschloss != null)
				msgs = ((InternalEObject)hauptschloss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS, null, msgs);
			if (newHauptschloss != null)
				msgs = ((InternalEObject)newHauptschloss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS, null, msgs);
			msgs = basicSetHauptschloss(newHauptschloss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS, newHauptschloss, newHauptschloss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Schlosskombination_TypeClass getIDSchlosskombination() {
		return iDSchlosskombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSchlosskombination(ID_Schlosskombination_TypeClass newIDSchlosskombination, NotificationChain msgs) {
		ID_Schlosskombination_TypeClass oldIDSchlosskombination = iDSchlosskombination;
		iDSchlosskombination = newIDSchlosskombination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION, oldIDSchlosskombination, newIDSchlosskombination);
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
	public void setIDSchlosskombination(ID_Schlosskombination_TypeClass newIDSchlosskombination) {
		if (newIDSchlosskombination != iDSchlosskombination) {
			NotificationChain msgs = null;
			if (iDSchlosskombination != null)
				msgs = ((InternalEObject)iDSchlosskombination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION, null, msgs);
			if (newIDSchlosskombination != null)
				msgs = ((InternalEObject)newIDSchlosskombination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION, null, msgs);
			msgs = basicSetIDSchlosskombination(newIDSchlosskombination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION, newIDSchlosskombination, newIDSchlosskombination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS:
				return basicSetHauptschloss(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION:
				return basicSetIDSchlosskombination(null, msgs);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS:
				return getHauptschloss();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION:
				return getIDSchlosskombination();
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS:
				setHauptschloss((Hauptschloss_TypeClass)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION:
				setIDSchlosskombination((ID_Schlosskombination_TypeClass)newValue);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS:
				setHauptschloss((Hauptschloss_TypeClass)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION:
				setIDSchlosskombination((ID_Schlosskombination_TypeClass)null);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS:
				return hauptschloss != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION:
				return iDSchlosskombination != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Schloss_Sk_AttributeGroupImpl
