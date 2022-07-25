/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB Bereichsgrenze Nach Ohne Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroupImpl#getBgrenzeNachOhneBedEinstieg <em>Bgrenze Nach Ohne Bed Einstieg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBgrenzeNachOhneBedEinstieg() <em>Bgrenze Nach Ohne Bed Einstieg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgrenzeNachOhneBedEinstieg()
	 * @generated
	 * @ordered
	 */
	protected EList<Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup> bgrenzeNachOhneBedEinstieg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup> getBgrenzeNachOhneBedEinstieg() {
		if (bgrenzeNachOhneBedEinstieg == null) {
			bgrenzeNachOhneBedEinstieg = new EObjectContainmentEList<Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup>(Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_OHNE_ATTRIBUTE_GROUP__BGRENZE_NACH_OHNE_BED_EINSTIEG);
		}
		return bgrenzeNachOhneBedEinstieg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_OHNE_ATTRIBUTE_GROUP__BGRENZE_NACH_OHNE_BED_EINSTIEG:
				return ((InternalEList<?>)getBgrenzeNachOhneBedEinstieg()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_OHNE_ATTRIBUTE_GROUP__BGRENZE_NACH_OHNE_BED_EINSTIEG:
				return getBgrenzeNachOhneBedEinstieg();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_OHNE_ATTRIBUTE_GROUP__BGRENZE_NACH_OHNE_BED_EINSTIEG:
				getBgrenzeNachOhneBedEinstieg().clear();
				getBgrenzeNachOhneBedEinstieg().addAll((Collection<? extends Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup>)newValue);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_OHNE_ATTRIBUTE_GROUP__BGRENZE_NACH_OHNE_BED_EINSTIEG:
				getBgrenzeNachOhneBedEinstieg().clear();
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_OHNE_ATTRIBUTE_GROUP__BGRENZE_NACH_OHNE_BED_EINSTIEG:
				return bgrenzeNachOhneBedEinstieg != null && !bgrenzeNachOhneBedEinstieg.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroupImpl
