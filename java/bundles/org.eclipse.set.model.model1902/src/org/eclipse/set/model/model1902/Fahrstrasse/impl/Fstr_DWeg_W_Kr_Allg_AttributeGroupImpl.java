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

import org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr DWeg WKr Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.impl.Fstr_DWeg_W_Kr_Allg_AttributeGroupImpl#getFstrDWegWKr <em>Fstr DWeg WKr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_DWeg_W_Kr_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Fstr_DWeg_W_Kr_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFstrDWegWKr() <em>Fstr DWeg WKr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrDWegWKr()
	 * @generated
	 * @ordered
	 */
	protected Fstr_DWeg_W_Kr_TypeClass fstrDWegWKr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_DWeg_W_Kr_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_DWEG_WKR_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_DWeg_W_Kr_TypeClass getFstrDWegWKr() {
		return fstrDWegWKr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrDWegWKr(Fstr_DWeg_W_Kr_TypeClass newFstrDWegWKr, NotificationChain msgs) {
		Fstr_DWeg_W_Kr_TypeClass oldFstrDWegWKr = fstrDWegWKr;
		fstrDWegWKr = newFstrDWegWKr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_WKR_ALLG_ATTRIBUTE_GROUP__FSTR_DWEG_WKR, oldFstrDWegWKr, newFstrDWegWKr);
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
	public void setFstrDWegWKr(Fstr_DWeg_W_Kr_TypeClass newFstrDWegWKr) {
		if (newFstrDWegWKr != fstrDWegWKr) {
			NotificationChain msgs = null;
			if (fstrDWegWKr != null)
				msgs = ((InternalEObject)fstrDWegWKr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_WKR_ALLG_ATTRIBUTE_GROUP__FSTR_DWEG_WKR, null, msgs);
			if (newFstrDWegWKr != null)
				msgs = ((InternalEObject)newFstrDWegWKr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_WKR_ALLG_ATTRIBUTE_GROUP__FSTR_DWEG_WKR, null, msgs);
			msgs = basicSetFstrDWegWKr(newFstrDWegWKr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_WKR_ALLG_ATTRIBUTE_GROUP__FSTR_DWEG_WKR, newFstrDWegWKr, newFstrDWegWKr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_DWEG_WKR_ALLG_ATTRIBUTE_GROUP__FSTR_DWEG_WKR:
				return basicSetFstrDWegWKr(null, msgs);
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
			case FahrstrassePackage.FSTR_DWEG_WKR_ALLG_ATTRIBUTE_GROUP__FSTR_DWEG_WKR:
				return getFstrDWegWKr();
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
			case FahrstrassePackage.FSTR_DWEG_WKR_ALLG_ATTRIBUTE_GROUP__FSTR_DWEG_WKR:
				setFstrDWegWKr((Fstr_DWeg_W_Kr_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_DWEG_WKR_ALLG_ATTRIBUTE_GROUP__FSTR_DWEG_WKR:
				setFstrDWegWKr((Fstr_DWeg_W_Kr_TypeClass)null);
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
			case FahrstrassePackage.FSTR_DWEG_WKR_ALLG_ATTRIBUTE_GROUP__FSTR_DWEG_WKR:
				return fstrDWegWKr != null;
		}
		return super.eIsSet(featureID);
	}

} //Fstr_DWeg_W_Kr_Allg_AttributeGroupImpl
