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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Anwendungssystem_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Baseline_System_Version_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_SE_Ausruestung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB SE Ausruestung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZUB_SE_Ausruestung_AttributeGroupImpl#getAnwendungssystem <em>Anwendungssystem</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZUB_SE_Ausruestung_AttributeGroupImpl#getBaselineSystemVersion <em>Baseline System Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_SE_Ausruestung_AttributeGroupImpl extends EObjectImpl implements ZUB_SE_Ausruestung_AttributeGroup {
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
	 * The cached value of the '{@link #getBaselineSystemVersion() <em>Baseline System Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaselineSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected Baseline_System_Version_TypeClass baselineSystemVersion;

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
	public Baseline_System_Version_TypeClass getBaselineSystemVersion() {
		return baselineSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaselineSystemVersion(Baseline_System_Version_TypeClass newBaselineSystemVersion, NotificationChain msgs) {
		Baseline_System_Version_TypeClass oldBaselineSystemVersion = baselineSystemVersion;
		baselineSystemVersion = newBaselineSystemVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION, oldBaselineSystemVersion, newBaselineSystemVersion);
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
	public void setBaselineSystemVersion(Baseline_System_Version_TypeClass newBaselineSystemVersion) {
		if (newBaselineSystemVersion != baselineSystemVersion) {
			NotificationChain msgs = null;
			if (baselineSystemVersion != null)
				msgs = ((InternalEObject)baselineSystemVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION, null, msgs);
			if (newBaselineSystemVersion != null)
				msgs = ((InternalEObject)newBaselineSystemVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION, null, msgs);
			msgs = basicSetBaselineSystemVersion(newBaselineSystemVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION, newBaselineSystemVersion, newBaselineSystemVersion));
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
			case Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION:
				return basicSetBaselineSystemVersion(null, msgs);
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
			case Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION:
				return getBaselineSystemVersion();
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
			case Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION:
				setBaselineSystemVersion((Baseline_System_Version_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION:
				setBaselineSystemVersion((Baseline_System_Version_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ZUB_SE_AUSRUESTUNG_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION:
				return baselineSystemVersion != null;
		}
		return super.eIsSet(featureID);
	}

} //ZUB_SE_Ausruestung_AttributeGroupImpl
