/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.PlanPro.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model11001.Basisobjekte.Anhang;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Ur_ObjektImpl;

import org.eclipse.set.model.model11001.PlanPro.Container_AttributeGroup;
import org.eclipse.set.model.model11001.PlanPro.LST_Zustand;
import org.eclipse.set.model.model11001.PlanPro.PlanProPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LST Zustand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.PlanPro.impl.LST_ZustandImpl#getAnhangLSTZustand <em>Anhang LST Zustand</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PlanPro.impl.LST_ZustandImpl#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LST_ZustandImpl extends Ur_ObjektImpl implements LST_Zustand {
	/**
	 * The cached value of the '{@link #getAnhangLSTZustand() <em>Anhang LST Zustand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnhangLSTZustand()
	 * @generated
	 * @ordered
	 */
	protected EList<Anhang> anhangLSTZustand;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected Container_AttributeGroup container;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LST_ZustandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getLST_Zustand();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Anhang> getAnhangLSTZustand() {
		if (anhangLSTZustand == null) {
			anhangLSTZustand = new EObjectContainmentEList<Anhang>(Anhang.class, this, PlanProPackage.LST_ZUSTAND__ANHANG_LST_ZUSTAND);
		}
		return anhangLSTZustand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Container_AttributeGroup getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Container_AttributeGroup newContainer, NotificationChain msgs) {
		Container_AttributeGroup oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.LST_ZUSTAND__CONTAINER, oldContainer, newContainer);
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
	public void setContainer(Container_AttributeGroup newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject)container).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.LST_ZUSTAND__CONTAINER, null, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.LST_ZUSTAND__CONTAINER, null, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.LST_ZUSTAND__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.LST_ZUSTAND__ANHANG_LST_ZUSTAND:
				return ((InternalEList<?>)getAnhangLSTZustand()).basicRemove(otherEnd, msgs);
			case PlanProPackage.LST_ZUSTAND__CONTAINER:
				return basicSetContainer(null, msgs);
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
			case PlanProPackage.LST_ZUSTAND__ANHANG_LST_ZUSTAND:
				return getAnhangLSTZustand();
			case PlanProPackage.LST_ZUSTAND__CONTAINER:
				return getContainer();
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
			case PlanProPackage.LST_ZUSTAND__ANHANG_LST_ZUSTAND:
				getAnhangLSTZustand().clear();
				getAnhangLSTZustand().addAll((Collection<? extends Anhang>)newValue);
				return;
			case PlanProPackage.LST_ZUSTAND__CONTAINER:
				setContainer((Container_AttributeGroup)newValue);
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
			case PlanProPackage.LST_ZUSTAND__ANHANG_LST_ZUSTAND:
				getAnhangLSTZustand().clear();
				return;
			case PlanProPackage.LST_ZUSTAND__CONTAINER:
				setContainer((Container_AttributeGroup)null);
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
			case PlanProPackage.LST_ZUSTAND__ANHANG_LST_ZUSTAND:
				return anhangLSTZustand != null && !anhangLSTZustand.isEmpty();
			case PlanProPackage.LST_ZUSTAND__CONTAINER:
				return container != null;
		}
		return super.eIsSet(featureID);
	}

} //LST_ZustandImpl
