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

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Anwendungssystem_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_SE_Ausruestung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB SE Ausruestung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_SE_Ausruestung_AttributeGroupImpl#getAnwendungssystem <em>Anwendungssystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_SE_Ausruestung_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZUB_SE_Ausruestung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAnwendungssystem() <em>Anwendungssystem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnwendungssystem()
	 * @generated
	 * @ordered
	 */
	protected EList<Anwendungssystem_TypeClass> anwendungssystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZUB_SE_Ausruestung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZUB_SE_Ausruestung_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Anwendungssystem_TypeClass> getAnwendungssystem() {
		if (anwendungssystem == null) {
			anwendungssystem = new EObjectContainmentEList<Anwendungssystem_TypeClass>(Anwendungssystem_TypeClass.class, this, Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP__ANWENDUNGSSYSTEM);
		}
		return anwendungssystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP__ANWENDUNGSSYSTEM:
				return ((InternalEList<?>)getAnwendungssystem()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP__ANWENDUNGSSYSTEM:
				return getAnwendungssystem();
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
			case Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP__ANWENDUNGSSYSTEM:
				getAnwendungssystem().clear();
				getAnwendungssystem().addAll((Collection<? extends Anwendungssystem_TypeClass>)newValue);
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
			case Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP__ANWENDUNGSSYSTEM:
				getAnwendungssystem().clear();
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
			case Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP__ANWENDUNGSSYSTEM:
				return anwendungssystem != null && !anwendungssystem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZUB_SE_Ausruestung_AttributeGroupImpl
