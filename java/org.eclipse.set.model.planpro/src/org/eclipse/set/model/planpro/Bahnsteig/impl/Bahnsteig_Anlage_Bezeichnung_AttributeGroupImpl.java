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
import org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Anlage_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Bahnsteig.Bezeichnung_Bahnsteig_Anlage_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bahnsteig Anlage Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnsteig.impl.Bahnsteig_Anlage_Bezeichnung_AttributeGroupImpl#getBezeichnungBahnsteigAnlage <em>Bezeichnung Bahnsteig Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bahnsteig_Anlage_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Bahnsteig_Anlage_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungBahnsteigAnlage() <em>Bezeichnung Bahnsteig Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungBahnsteigAnlage()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Bahnsteig_Anlage_TypeClass bezeichnungBahnsteigAnlage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bahnsteig_Anlage_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnsteigPackage.Literals.BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Bahnsteig_Anlage_TypeClass getBezeichnungBahnsteigAnlage() {
		return bezeichnungBahnsteigAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungBahnsteigAnlage(Bezeichnung_Bahnsteig_Anlage_TypeClass newBezeichnungBahnsteigAnlage, NotificationChain msgs) {
		Bezeichnung_Bahnsteig_Anlage_TypeClass oldBezeichnungBahnsteigAnlage = bezeichnungBahnsteigAnlage;
		bezeichnungBahnsteigAnlage = newBezeichnungBahnsteigAnlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_ANLAGE, oldBezeichnungBahnsteigAnlage, newBezeichnungBahnsteigAnlage);
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
	public void setBezeichnungBahnsteigAnlage(Bezeichnung_Bahnsteig_Anlage_TypeClass newBezeichnungBahnsteigAnlage) {
		if (newBezeichnungBahnsteigAnlage != bezeichnungBahnsteigAnlage) {
			NotificationChain msgs = null;
			if (bezeichnungBahnsteigAnlage != null)
				msgs = ((InternalEObject)bezeichnungBahnsteigAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_ANLAGE, null, msgs);
			if (newBezeichnungBahnsteigAnlage != null)
				msgs = ((InternalEObject)newBezeichnungBahnsteigAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_ANLAGE, null, msgs);
			msgs = basicSetBezeichnungBahnsteigAnlage(newBezeichnungBahnsteigAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_ANLAGE, newBezeichnungBahnsteigAnlage, newBezeichnungBahnsteigAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnsteigPackage.BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_ANLAGE:
				return basicSetBezeichnungBahnsteigAnlage(null, msgs);
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
			case BahnsteigPackage.BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_ANLAGE:
				return getBezeichnungBahnsteigAnlage();
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
			case BahnsteigPackage.BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_ANLAGE:
				setBezeichnungBahnsteigAnlage((Bezeichnung_Bahnsteig_Anlage_TypeClass)newValue);
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
			case BahnsteigPackage.BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_ANLAGE:
				setBezeichnungBahnsteigAnlage((Bezeichnung_Bahnsteig_Anlage_TypeClass)null);
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
			case BahnsteigPackage.BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_ANLAGE:
				return bezeichnungBahnsteigAnlage != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bahnsteig_Anlage_Bezeichnung_AttributeGroupImpl
