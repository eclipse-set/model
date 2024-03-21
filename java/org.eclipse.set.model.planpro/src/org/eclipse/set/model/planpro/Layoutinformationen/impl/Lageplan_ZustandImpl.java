/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Layoutinformationen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Ur_ObjektImpl;

import org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Zustand;
import org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage;
import org.eclipse.set.model.planpro.Layoutinformationen.Referenz_LST_Zustand_TypeClass;

import org.eclipse.set.model.planpro.Verweise.ID_Lageplan_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lageplan Zustand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_ZustandImpl#getIDLageplan <em>ID Lageplan</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.Lageplan_ZustandImpl#getReferenzLSTZustand <em>Referenz LST Zustand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Lageplan_ZustandImpl extends Ur_ObjektImpl implements Lageplan_Zustand {
	/**
	 * The cached value of the '{@link #getIDLageplan() <em>ID Lageplan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDLageplan()
	 * @generated
	 * @ordered
	 */
	protected ID_Lageplan_TypeClass iDLageplan;

	/**
	 * The cached value of the '{@link #getReferenzLSTZustand() <em>Referenz LST Zustand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenzLSTZustand()
	 * @generated
	 * @ordered
	 */
	protected EList<Referenz_LST_Zustand_TypeClass> referenzLSTZustand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lageplan_ZustandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutinformationenPackage.Literals.LAGEPLAN_ZUSTAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Lageplan_TypeClass getIDLageplan() {
		return iDLageplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDLageplan(ID_Lageplan_TypeClass newIDLageplan, NotificationChain msgs) {
		ID_Lageplan_TypeClass oldIDLageplan = iDLageplan;
		iDLageplan = newIDLageplan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.LAGEPLAN_ZUSTAND__ID_LAGEPLAN, oldIDLageplan, newIDLageplan);
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
	public void setIDLageplan(ID_Lageplan_TypeClass newIDLageplan) {
		if (newIDLageplan != iDLageplan) {
			NotificationChain msgs = null;
			if (iDLageplan != null)
				msgs = ((InternalEObject)iDLageplan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.LAGEPLAN_ZUSTAND__ID_LAGEPLAN, null, msgs);
			if (newIDLageplan != null)
				msgs = ((InternalEObject)newIDLageplan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.LAGEPLAN_ZUSTAND__ID_LAGEPLAN, null, msgs);
			msgs = basicSetIDLageplan(newIDLageplan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.LAGEPLAN_ZUSTAND__ID_LAGEPLAN, newIDLageplan, newIDLageplan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Referenz_LST_Zustand_TypeClass> getReferenzLSTZustand() {
		if (referenzLSTZustand == null) {
			referenzLSTZustand = new EObjectContainmentEList<Referenz_LST_Zustand_TypeClass>(Referenz_LST_Zustand_TypeClass.class, this, LayoutinformationenPackage.LAGEPLAN_ZUSTAND__REFERENZ_LST_ZUSTAND);
		}
		return referenzLSTZustand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__ID_LAGEPLAN:
				return basicSetIDLageplan(null, msgs);
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__REFERENZ_LST_ZUSTAND:
				return ((InternalEList<?>)getReferenzLSTZustand()).basicRemove(otherEnd, msgs);
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
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__ID_LAGEPLAN:
				return getIDLageplan();
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__REFERENZ_LST_ZUSTAND:
				return getReferenzLSTZustand();
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
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__ID_LAGEPLAN:
				setIDLageplan((ID_Lageplan_TypeClass)newValue);
				return;
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__REFERENZ_LST_ZUSTAND:
				getReferenzLSTZustand().clear();
				getReferenzLSTZustand().addAll((Collection<? extends Referenz_LST_Zustand_TypeClass>)newValue);
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
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__ID_LAGEPLAN:
				setIDLageplan((ID_Lageplan_TypeClass)null);
				return;
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__REFERENZ_LST_ZUSTAND:
				getReferenzLSTZustand().clear();
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
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__ID_LAGEPLAN:
				return iDLageplan != null;
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__REFERENZ_LST_ZUSTAND:
				return referenzLSTZustand != null && !referenzLSTZustand.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Lageplan_ZustandImpl
