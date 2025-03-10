/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Geodaten.Bezeichnung_Strecke_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.GeodatenPackage;
import org.eclipse.set.model.planpro.Geodaten.Strecke_Bezeichnung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strecke Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.Strecke_Bezeichnung_AttributeGroupImpl#getBezeichnungStrecke <em>Bezeichnung Strecke</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Strecke_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Strecke_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungStrecke() <em>Bezeichnung Strecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungStrecke()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Strecke_TypeClass bezeichnungStrecke;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Strecke_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Strecke_TypeClass getBezeichnungStrecke() {
		return bezeichnungStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungStrecke(Bezeichnung_Strecke_TypeClass newBezeichnungStrecke, NotificationChain msgs) {
		Bezeichnung_Strecke_TypeClass oldBezeichnungStrecke = bezeichnungStrecke;
		bezeichnungStrecke = newBezeichnungStrecke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_STRECKE, oldBezeichnungStrecke, newBezeichnungStrecke);
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
	public void setBezeichnungStrecke(Bezeichnung_Strecke_TypeClass newBezeichnungStrecke) {
		if (newBezeichnungStrecke != bezeichnungStrecke) {
			NotificationChain msgs = null;
			if (bezeichnungStrecke != null)
				msgs = ((InternalEObject)bezeichnungStrecke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_STRECKE, null, msgs);
			if (newBezeichnungStrecke != null)
				msgs = ((InternalEObject)newBezeichnungStrecke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_STRECKE, null, msgs);
			msgs = basicSetBezeichnungStrecke(newBezeichnungStrecke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_STRECKE, newBezeichnungStrecke, newBezeichnungStrecke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_STRECKE:
				return basicSetBezeichnungStrecke(null, msgs);
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
			case GeodatenPackage.STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_STRECKE:
				return getBezeichnungStrecke();
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
			case GeodatenPackage.STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_STRECKE:
				setBezeichnungStrecke((Bezeichnung_Strecke_TypeClass)newValue);
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
			case GeodatenPackage.STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_STRECKE:
				setBezeichnungStrecke((Bezeichnung_Strecke_TypeClass)null);
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
			case GeodatenPackage.STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_STRECKE:
				return bezeichnungStrecke != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Strecke_Bezeichnung_AttributeGroupImpl
