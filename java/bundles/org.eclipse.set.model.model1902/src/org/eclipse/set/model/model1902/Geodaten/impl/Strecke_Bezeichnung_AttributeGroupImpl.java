/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Geodaten.Bezeichnung_Strecke_TypeClass;
import org.eclipse.set.model.model1902.Geodaten.GeodatenPackage;
import org.eclipse.set.model.model1902.Geodaten.Strecke_Bezeichnung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strecke Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.Strecke_Bezeichnung_AttributeGroupImpl#getBezeichnungStrecke <em>Bezeichnung Strecke</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Strecke_Bezeichnung_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Strecke_Bezeichnung_AttributeGroup {
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
			case GeodatenPackage.STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_STRECKE:
				return getBezeichnungStrecke();
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
			case GeodatenPackage.STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_STRECKE:
				setBezeichnungStrecke((Bezeichnung_Strecke_TypeClass)newValue);
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
			case GeodatenPackage.STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_STRECKE:
				setBezeichnungStrecke((Bezeichnung_Strecke_TypeClass)null);
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
			case GeodatenPackage.STRECKE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_STRECKE:
				return bezeichnungStrecke != null;
		}
		return super.eIsSet(featureID);
	}

} //Strecke_Bezeichnung_AttributeGroupImpl
