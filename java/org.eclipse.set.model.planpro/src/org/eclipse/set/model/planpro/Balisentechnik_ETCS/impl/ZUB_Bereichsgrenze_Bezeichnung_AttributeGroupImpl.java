/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bez_ZUB_Bereichsgrenze_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB Bereichsgrenze Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Bezeichnung_AttributeGroupImpl#getBezZUBBereichsgrenze <em>Bez ZUB Bereichsgrenze</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_Bereichsgrenze_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezZUBBereichsgrenze() <em>Bez ZUB Bereichsgrenze</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezZUBBereichsgrenze()
	 * @generated
	 * @ordered
	 */
	protected Bez_ZUB_Bereichsgrenze_TypeClass bezZUBBereichsgrenze;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZUB_Bereichsgrenze_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Bezeichnung_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_ZUB_Bereichsgrenze_TypeClass getBezZUBBereichsgrenze() {
		return bezZUBBereichsgrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezZUBBereichsgrenze(Bez_ZUB_Bereichsgrenze_TypeClass newBezZUBBereichsgrenze, NotificationChain msgs) {
		Bez_ZUB_Bereichsgrenze_TypeClass oldBezZUBBereichsgrenze = bezZUBBereichsgrenze;
		bezZUBBereichsgrenze = newBezZUBBereichsgrenze;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_ZUB_BEREICHSGRENZE, oldBezZUBBereichsgrenze, newBezZUBBereichsgrenze);
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
	public void setBezZUBBereichsgrenze(Bez_ZUB_Bereichsgrenze_TypeClass newBezZUBBereichsgrenze) {
		if (newBezZUBBereichsgrenze != bezZUBBereichsgrenze) {
			NotificationChain msgs = null;
			if (bezZUBBereichsgrenze != null)
				msgs = ((InternalEObject)bezZUBBereichsgrenze).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_ZUB_BEREICHSGRENZE, null, msgs);
			if (newBezZUBBereichsgrenze != null)
				msgs = ((InternalEObject)newBezZUBBereichsgrenze).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_ZUB_BEREICHSGRENZE, null, msgs);
			msgs = basicSetBezZUBBereichsgrenze(newBezZUBBereichsgrenze, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_ZUB_BEREICHSGRENZE, newBezZUBBereichsgrenze, newBezZUBBereichsgrenze));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_ZUB_BEREICHSGRENZE:
				return basicSetBezZUBBereichsgrenze(null, msgs);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_ZUB_BEREICHSGRENZE:
				return getBezZUBBereichsgrenze();
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_ZUB_BEREICHSGRENZE:
				setBezZUBBereichsgrenze((Bez_ZUB_Bereichsgrenze_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_ZUB_BEREICHSGRENZE:
				setBezZUBBereichsgrenze((Bez_ZUB_Bereichsgrenze_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_ZUB_BEREICHSGRENZE:
				return bezZUBBereichsgrenze != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZUB_Bereichsgrenze_Bezeichnung_AttributeGroupImpl
