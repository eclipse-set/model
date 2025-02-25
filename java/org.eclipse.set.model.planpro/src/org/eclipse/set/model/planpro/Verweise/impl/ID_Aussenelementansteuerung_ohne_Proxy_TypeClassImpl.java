/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Verweise.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Aussenelementansteuerung;
import org.eclipse.set.model.planpro.BasisTypen.impl.Zeiger_TypeClassImpl;

import org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.VerweisePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ID Aussenelementansteuerung ohne Proxy Type Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Aussenelementansteuerung_ohne_Proxy_TypeClassImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Verweise.impl.ID_Aussenelementansteuerung_ohne_Proxy_TypeClassImpl#isInvalidReference <em>Invalid Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ID_Aussenelementansteuerung_ohne_Proxy_TypeClassImpl extends Zeiger_TypeClassImpl implements ID_Aussenelementansteuerung_ohne_Proxy_TypeClass {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Aussenelementansteuerung value;
	/**
	 * The default value of the '{@link #isInvalidReference() <em>Invalid Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvalidReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVALID_REFERENCE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isInvalidReference() <em>Invalid Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvalidReference()
	 * @generated
	 * @ordered
	 */
	protected boolean invalidReference = INVALID_REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ID_Aussenelementansteuerung_ohne_Proxy_TypeClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VerweisePackage.Literals.ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aussenelementansteuerung getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (Aussenelementansteuerung)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VerweisePackage.ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aussenelementansteuerung basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Aussenelementansteuerung newValue) {
		Aussenelementansteuerung oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerweisePackage.ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInvalidReference() {
		return invalidReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvalidReference(boolean newInvalidReference) {
		boolean oldInvalidReference = invalidReference;
		invalidReference = newInvalidReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerweisePackage.ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE, oldInvalidReference, invalidReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VerweisePackage.ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case VerweisePackage.ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE:
				return isInvalidReference();
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
			case VerweisePackage.ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__VALUE:
				setValue((Aussenelementansteuerung)newValue);
				return;
			case VerweisePackage.ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE:
				setInvalidReference((Boolean)newValue);
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
			case VerweisePackage.ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__VALUE:
				setValue((Aussenelementansteuerung)null);
				return;
			case VerweisePackage.ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE:
				setInvalidReference(INVALID_REFERENCE_EDEFAULT);
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
			case VerweisePackage.ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__VALUE:
				return value != null;
			case VerweisePackage.ID_AUSSENELEMENTANSTEUERUNG_OHNE_PROXY_TYPE_CLASS__INVALID_REFERENCE:
				return invalidReference != INVALID_REFERENCE_EDEFAULT;
			default:
				return super.eIsSet(featureID);
		}
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
		result.append(" (invalidReference: ");
		result.append(invalidReference);
		result.append(')');
		return result.toString();
	}

} //ID_Aussenelementansteuerung_ohne_Proxy_TypeClassImpl
