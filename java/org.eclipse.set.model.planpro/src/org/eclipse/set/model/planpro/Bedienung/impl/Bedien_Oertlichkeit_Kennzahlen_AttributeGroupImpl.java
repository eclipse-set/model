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

import org.eclipse.set.model.planpro.Bedienung.Bedien_Oertlichkeit_Kennzahlen_AttributeGroup;
import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;
import org.eclipse.set.model.planpro.Bedienung.Betriebsstellenbezeichner_TypeClass;
import org.eclipse.set.model.planpro.Bedienung.Kennzahl_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Oertlichkeit Kennzahlen Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oertlichkeit_Kennzahlen_AttributeGroupImpl#getBetriebsstellenbezeichner <em>Betriebsstellenbezeichner</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oertlichkeit_Kennzahlen_AttributeGroupImpl#getKennzahl <em>Kennzahl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Oertlichkeit_Kennzahlen_AttributeGroupImpl extends EObjectImpl implements Bedien_Oertlichkeit_Kennzahlen_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBetriebsstellenbezeichner() <em>Betriebsstellenbezeichner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetriebsstellenbezeichner()
	 * @generated
	 * @ordered
	 */
	protected Betriebsstellenbezeichner_TypeClass betriebsstellenbezeichner;

	/**
	 * The cached value of the '{@link #getKennzahl() <em>Kennzahl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennzahl()
	 * @generated
	 * @ordered
	 */
	protected Kennzahl_TypeClass kennzahl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Oertlichkeit_Kennzahlen_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Betriebsstellenbezeichner_TypeClass getBetriebsstellenbezeichner() {
		return betriebsstellenbezeichner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBetriebsstellenbezeichner(Betriebsstellenbezeichner_TypeClass newBetriebsstellenbezeichner, NotificationChain msgs) {
		Betriebsstellenbezeichner_TypeClass oldBetriebsstellenbezeichner = betriebsstellenbezeichner;
		betriebsstellenbezeichner = newBetriebsstellenbezeichner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__BETRIEBSSTELLENBEZEICHNER, oldBetriebsstellenbezeichner, newBetriebsstellenbezeichner);
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
	public void setBetriebsstellenbezeichner(Betriebsstellenbezeichner_TypeClass newBetriebsstellenbezeichner) {
		if (newBetriebsstellenbezeichner != betriebsstellenbezeichner) {
			NotificationChain msgs = null;
			if (betriebsstellenbezeichner != null)
				msgs = ((InternalEObject)betriebsstellenbezeichner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__BETRIEBSSTELLENBEZEICHNER, null, msgs);
			if (newBetriebsstellenbezeichner != null)
				msgs = ((InternalEObject)newBetriebsstellenbezeichner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__BETRIEBSSTELLENBEZEICHNER, null, msgs);
			msgs = basicSetBetriebsstellenbezeichner(newBetriebsstellenbezeichner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__BETRIEBSSTELLENBEZEICHNER, newBetriebsstellenbezeichner, newBetriebsstellenbezeichner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kennzahl_TypeClass getKennzahl() {
		return kennzahl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKennzahl(Kennzahl_TypeClass newKennzahl, NotificationChain msgs) {
		Kennzahl_TypeClass oldKennzahl = kennzahl;
		kennzahl = newKennzahl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__KENNZAHL, oldKennzahl, newKennzahl);
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
	public void setKennzahl(Kennzahl_TypeClass newKennzahl) {
		if (newKennzahl != kennzahl) {
			NotificationChain msgs = null;
			if (kennzahl != null)
				msgs = ((InternalEObject)kennzahl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__KENNZAHL, null, msgs);
			if (newKennzahl != null)
				msgs = ((InternalEObject)newKennzahl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__KENNZAHL, null, msgs);
			msgs = basicSetKennzahl(newKennzahl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__KENNZAHL, newKennzahl, newKennzahl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__BETRIEBSSTELLENBEZEICHNER:
				return basicSetBetriebsstellenbezeichner(null, msgs);
			case BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__KENNZAHL:
				return basicSetKennzahl(null, msgs);
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
			case BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__BETRIEBSSTELLENBEZEICHNER:
				return getBetriebsstellenbezeichner();
			case BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__KENNZAHL:
				return getKennzahl();
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
			case BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__BETRIEBSSTELLENBEZEICHNER:
				setBetriebsstellenbezeichner((Betriebsstellenbezeichner_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__KENNZAHL:
				setKennzahl((Kennzahl_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__BETRIEBSSTELLENBEZEICHNER:
				setBetriebsstellenbezeichner((Betriebsstellenbezeichner_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__KENNZAHL:
				setKennzahl((Kennzahl_TypeClass)null);
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
			case BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__BETRIEBSSTELLENBEZEICHNER:
				return betriebsstellenbezeichner != null;
			case BedienungPackage.BEDIEN_OERTLICHKEIT_KENNZAHLEN_ATTRIBUTE_GROUP__KENNZAHL:
				return kennzahl != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedien_Oertlichkeit_Kennzahlen_AttributeGroupImpl
