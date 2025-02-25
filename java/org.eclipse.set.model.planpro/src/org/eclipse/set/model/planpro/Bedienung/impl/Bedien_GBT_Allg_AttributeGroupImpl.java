/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Bedienung.Bedien_GBT_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;
import org.eclipse.set.model.planpro.Bedienung.Rueckschauzeit_TypeClass;
import org.eclipse.set.model.planpro.Bedienung.Vorschauzeit_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien GBT Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_GBT_Allg_AttributeGroupImpl#getRueckschauzeit <em>Rueckschauzeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_GBT_Allg_AttributeGroupImpl#getVorschauzeit <em>Vorschauzeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_GBT_Allg_AttributeGroupImpl extends EObjectImpl implements Bedien_GBT_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getRueckschauzeit() <em>Rueckschauzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRueckschauzeit()
	 * @generated
	 * @ordered
	 */
	protected Rueckschauzeit_TypeClass rueckschauzeit;

	/**
	 * The cached value of the '{@link #getVorschauzeit() <em>Vorschauzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorschauzeit()
	 * @generated
	 * @ordered
	 */
	protected Vorschauzeit_TypeClass vorschauzeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_GBT_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rueckschauzeit_TypeClass getRueckschauzeit() {
		return rueckschauzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRueckschauzeit(Rueckschauzeit_TypeClass newRueckschauzeit, NotificationChain msgs) {
		Rueckschauzeit_TypeClass oldRueckschauzeit = rueckschauzeit;
		rueckschauzeit = newRueckschauzeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__RUECKSCHAUZEIT, oldRueckschauzeit, newRueckschauzeit);
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
	public void setRueckschauzeit(Rueckschauzeit_TypeClass newRueckschauzeit) {
		if (newRueckschauzeit != rueckschauzeit) {
			NotificationChain msgs = null;
			if (rueckschauzeit != null)
				msgs = ((InternalEObject)rueckschauzeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__RUECKSCHAUZEIT, null, msgs);
			if (newRueckschauzeit != null)
				msgs = ((InternalEObject)newRueckschauzeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__RUECKSCHAUZEIT, null, msgs);
			msgs = basicSetRueckschauzeit(newRueckschauzeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__RUECKSCHAUZEIT, newRueckschauzeit, newRueckschauzeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vorschauzeit_TypeClass getVorschauzeit() {
		return vorschauzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVorschauzeit(Vorschauzeit_TypeClass newVorschauzeit, NotificationChain msgs) {
		Vorschauzeit_TypeClass oldVorschauzeit = vorschauzeit;
		vorschauzeit = newVorschauzeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__VORSCHAUZEIT, oldVorschauzeit, newVorschauzeit);
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
	public void setVorschauzeit(Vorschauzeit_TypeClass newVorschauzeit) {
		if (newVorschauzeit != vorschauzeit) {
			NotificationChain msgs = null;
			if (vorschauzeit != null)
				msgs = ((InternalEObject)vorschauzeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__VORSCHAUZEIT, null, msgs);
			if (newVorschauzeit != null)
				msgs = ((InternalEObject)newVorschauzeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__VORSCHAUZEIT, null, msgs);
			msgs = basicSetVorschauzeit(newVorschauzeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__VORSCHAUZEIT, newVorschauzeit, newVorschauzeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__RUECKSCHAUZEIT:
				return basicSetRueckschauzeit(null, msgs);
			case BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__VORSCHAUZEIT:
				return basicSetVorschauzeit(null, msgs);
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
			case BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__RUECKSCHAUZEIT:
				return getRueckschauzeit();
			case BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__VORSCHAUZEIT:
				return getVorschauzeit();
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
			case BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__RUECKSCHAUZEIT:
				setRueckschauzeit((Rueckschauzeit_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__VORSCHAUZEIT:
				setVorschauzeit((Vorschauzeit_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__RUECKSCHAUZEIT:
				setRueckschauzeit((Rueckschauzeit_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__VORSCHAUZEIT:
				setVorschauzeit((Vorschauzeit_TypeClass)null);
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
			case BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__RUECKSCHAUZEIT:
				return rueckschauzeit != null;
			case BedienungPackage.BEDIEN_GBT_ALLG_ATTRIBUTE_GROUP__VORSCHAUZEIT:
				return vorschauzeit != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedien_GBT_Allg_AttributeGroupImpl
