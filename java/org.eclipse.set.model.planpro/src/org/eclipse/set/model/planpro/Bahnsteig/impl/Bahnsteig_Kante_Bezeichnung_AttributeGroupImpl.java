/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnsteig.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage;
import org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Kante_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Bahnsteig.Bezeichnung_Bahnsteig_Kante_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bahnsteig Kante Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnsteig.impl.Bahnsteig_Kante_Bezeichnung_AttributeGroupImpl#getBezeichnungBahnsteigKante <em>Bezeichnung Bahnsteig Kante</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bahnsteig_Kante_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Bahnsteig_Kante_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungBahnsteigKante() <em>Bezeichnung Bahnsteig Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungBahnsteigKante()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Bahnsteig_Kante_TypeClass bezeichnungBahnsteigKante;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bahnsteig_Kante_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnsteigPackage.Literals.BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Bahnsteig_Kante_TypeClass getBezeichnungBahnsteigKante() {
		return bezeichnungBahnsteigKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungBahnsteigKante(Bezeichnung_Bahnsteig_Kante_TypeClass newBezeichnungBahnsteigKante, NotificationChain msgs) {
		Bezeichnung_Bahnsteig_Kante_TypeClass oldBezeichnungBahnsteigKante = bezeichnungBahnsteigKante;
		bezeichnungBahnsteigKante = newBezeichnungBahnsteigKante;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_KANTE, oldBezeichnungBahnsteigKante, newBezeichnungBahnsteigKante);
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
	public void setBezeichnungBahnsteigKante(Bezeichnung_Bahnsteig_Kante_TypeClass newBezeichnungBahnsteigKante) {
		if (newBezeichnungBahnsteigKante != bezeichnungBahnsteigKante) {
			NotificationChain msgs = null;
			if (bezeichnungBahnsteigKante != null)
				msgs = ((InternalEObject)bezeichnungBahnsteigKante).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_KANTE, null, msgs);
			if (newBezeichnungBahnsteigKante != null)
				msgs = ((InternalEObject)newBezeichnungBahnsteigKante).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_KANTE, null, msgs);
			msgs = basicSetBezeichnungBahnsteigKante(newBezeichnungBahnsteigKante, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_KANTE, newBezeichnungBahnsteigKante, newBezeichnungBahnsteigKante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnsteigPackage.BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_KANTE:
				return basicSetBezeichnungBahnsteigKante(null, msgs);
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
			case BahnsteigPackage.BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_KANTE:
				return getBezeichnungBahnsteigKante();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BahnsteigPackage.BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_KANTE:
				setBezeichnungBahnsteigKante((Bezeichnung_Bahnsteig_Kante_TypeClass)newValue);
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
			case BahnsteigPackage.BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_KANTE:
				setBezeichnungBahnsteigKante((Bezeichnung_Bahnsteig_Kante_TypeClass)null);
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
			case BahnsteigPackage.BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_KANTE:
				return bezeichnungBahnsteigKante != null;
		}
		return super.eIsSet(featureID);
	}

} //Bahnsteig_Kante_Bezeichnung_AttributeGroupImpl
