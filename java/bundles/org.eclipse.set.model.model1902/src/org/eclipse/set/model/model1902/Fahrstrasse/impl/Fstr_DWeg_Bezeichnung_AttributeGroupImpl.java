/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Fahrstrasse.Bezeichnung_Fstr_DWeg_TypeClass;
import org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Bezeichnung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr DWeg Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.impl.Fstr_DWeg_Bezeichnung_AttributeGroupImpl#getBezeichnungFstrDWeg <em>Bezeichnung Fstr DWeg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_DWeg_Bezeichnung_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Fstr_DWeg_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungFstrDWeg() <em>Bezeichnung Fstr DWeg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungFstrDWeg()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Fstr_DWeg_TypeClass bezeichnungFstrDWeg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_DWeg_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Fstr_DWeg_TypeClass getBezeichnungFstrDWeg() {
		return bezeichnungFstrDWeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungFstrDWeg(Bezeichnung_Fstr_DWeg_TypeClass newBezeichnungFstrDWeg, NotificationChain msgs) {
		Bezeichnung_Fstr_DWeg_TypeClass oldBezeichnungFstrDWeg = bezeichnungFstrDWeg;
		bezeichnungFstrDWeg = newBezeichnungFstrDWeg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_FSTR_DWEG, oldBezeichnungFstrDWeg, newBezeichnungFstrDWeg);
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
	public void setBezeichnungFstrDWeg(Bezeichnung_Fstr_DWeg_TypeClass newBezeichnungFstrDWeg) {
		if (newBezeichnungFstrDWeg != bezeichnungFstrDWeg) {
			NotificationChain msgs = null;
			if (bezeichnungFstrDWeg != null)
				msgs = ((InternalEObject)bezeichnungFstrDWeg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_FSTR_DWEG, null, msgs);
			if (newBezeichnungFstrDWeg != null)
				msgs = ((InternalEObject)newBezeichnungFstrDWeg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_FSTR_DWEG, null, msgs);
			msgs = basicSetBezeichnungFstrDWeg(newBezeichnungFstrDWeg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_FSTR_DWEG, newBezeichnungFstrDWeg, newBezeichnungFstrDWeg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_FSTR_DWEG:
				return basicSetBezeichnungFstrDWeg(null, msgs);
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
			case FahrstrassePackage.FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_FSTR_DWEG:
				return getBezeichnungFstrDWeg();
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
			case FahrstrassePackage.FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_FSTR_DWEG:
				setBezeichnungFstrDWeg((Bezeichnung_Fstr_DWeg_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_FSTR_DWEG:
				setBezeichnungFstrDWeg((Bezeichnung_Fstr_DWeg_TypeClass)null);
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
			case FahrstrassePackage.FSTR_DWEG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_FSTR_DWEG:
				return bezeichnungFstrDWeg != null;
		}
		return super.eIsSet(featureID);
	}

} //Fstr_DWeg_Bezeichnung_AttributeGroupImpl
