/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.BasisTypen.impl.BasisAttribut_AttributeGroupImpl;

import org.eclipse.set.model.model11001.Fahrstrasse.ENUMRangierGegenfahrtausschluss;
import org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.model11001.Fahrstrasse.Rangier_Gegenfahrtausschluss_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rangier Gegenfahrtausschluss Type Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.impl.Rangier_Gegenfahrtausschluss_TypeClassImpl#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Rangier_Gegenfahrtausschluss_TypeClassImpl extends BasisAttribut_AttributeGroupImpl implements Rangier_Gegenfahrtausschluss_TypeClass {
	/**
	 * The default value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected static final ENUMRangierGegenfahrtausschluss WERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected ENUMRangierGegenfahrtausschluss wert = WERT_EDEFAULT;

	/**
	 * This is true if the Wert attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wertESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rangier_Gegenfahrtausschluss_TypeClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ENUMRangierGegenfahrtausschluss getWert() {
		return wert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWert(ENUMRangierGegenfahrtausschluss newWert) {
		ENUMRangierGegenfahrtausschluss oldWert = wert;
		wert = newWert;
		boolean oldWertESet = wertESet;
		wertESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS__WERT, oldWert, wert, !oldWertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWert() {
		ENUMRangierGegenfahrtausschluss oldWert = wert;
		boolean oldWertESet = wertESet;
		wert = WERT_EDEFAULT;
		wertESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS__WERT, oldWert, WERT_EDEFAULT, oldWertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWert() {
		return wertESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FahrstrassePackage.RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS__WERT:
				return getWert();
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
			case FahrstrassePackage.RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS__WERT:
				setWert((ENUMRangierGegenfahrtausschluss)newValue);
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
			case FahrstrassePackage.RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS__WERT:
				unsetWert();
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
			case FahrstrassePackage.RANGIER_GEGENFAHRTAUSSCHLUSS_TYPE_CLASS__WERT:
				return isSetWert();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (wert: ");
		if (wertESet) result.append(wert); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //Rangier_Gegenfahrtausschluss_TypeClassImpl
