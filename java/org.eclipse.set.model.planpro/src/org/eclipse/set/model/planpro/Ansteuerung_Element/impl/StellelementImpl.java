/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ansteuerung_Element.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Stellelement;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_Aussenelementansteuerung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stellelement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.StellelementImpl#getIDEnergie <em>ID Energie</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.StellelementImpl#getIDInformation <em>ID Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StellelementImpl extends Basis_ObjektImpl implements Stellelement {
	/**
	 * The cached value of the '{@link #getIDEnergie() <em>ID Energie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDEnergie()
	 * @generated
	 * @ordered
	 */
	protected ID_Aussenelementansteuerung_TypeClass iDEnergie;

	/**
	 * The cached value of the '{@link #getIDInformation() <em>ID Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDInformation()
	 * @generated
	 * @ordered
	 */
	protected ID_Aussenelementansteuerung_TypeClass iDInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StellelementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.STELLELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Aussenelementansteuerung_TypeClass getIDEnergie() {
		return iDEnergie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDEnergie(ID_Aussenelementansteuerung_TypeClass newIDEnergie, NotificationChain msgs) {
		ID_Aussenelementansteuerung_TypeClass oldIDEnergie = iDEnergie;
		iDEnergie = newIDEnergie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELLELEMENT__ID_ENERGIE, oldIDEnergie, newIDEnergie);
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
	public void setIDEnergie(ID_Aussenelementansteuerung_TypeClass newIDEnergie) {
		if (newIDEnergie != iDEnergie) {
			NotificationChain msgs = null;
			if (iDEnergie != null)
				msgs = ((InternalEObject)iDEnergie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.STELLELEMENT__ID_ENERGIE, null, msgs);
			if (newIDEnergie != null)
				msgs = ((InternalEObject)newIDEnergie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.STELLELEMENT__ID_ENERGIE, null, msgs);
			msgs = basicSetIDEnergie(newIDEnergie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELLELEMENT__ID_ENERGIE, newIDEnergie, newIDEnergie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Aussenelementansteuerung_TypeClass getIDInformation() {
		return iDInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDInformation(ID_Aussenelementansteuerung_TypeClass newIDInformation, NotificationChain msgs) {
		ID_Aussenelementansteuerung_TypeClass oldIDInformation = iDInformation;
		iDInformation = newIDInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELLELEMENT__ID_INFORMATION, oldIDInformation, newIDInformation);
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
	public void setIDInformation(ID_Aussenelementansteuerung_TypeClass newIDInformation) {
		if (newIDInformation != iDInformation) {
			NotificationChain msgs = null;
			if (iDInformation != null)
				msgs = ((InternalEObject)iDInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.STELLELEMENT__ID_INFORMATION, null, msgs);
			if (newIDInformation != null)
				msgs = ((InternalEObject)newIDInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.STELLELEMENT__ID_INFORMATION, null, msgs);
			msgs = basicSetIDInformation(newIDInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELLELEMENT__ID_INFORMATION, newIDInformation, newIDInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_ENERGIE:
				return basicSetIDEnergie(null, msgs);
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_INFORMATION:
				return basicSetIDInformation(null, msgs);
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
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_ENERGIE:
				return getIDEnergie();
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_INFORMATION:
				return getIDInformation();
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
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_ENERGIE:
				setIDEnergie((ID_Aussenelementansteuerung_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_INFORMATION:
				setIDInformation((ID_Aussenelementansteuerung_TypeClass)newValue);
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
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_ENERGIE:
				setIDEnergie((ID_Aussenelementansteuerung_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_INFORMATION:
				setIDInformation((ID_Aussenelementansteuerung_TypeClass)null);
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
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_ENERGIE:
				return iDEnergie != null;
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_INFORMATION:
				return iDInformation != null;
		}
		return super.eIsSet(featureID);
	}

} //StellelementImpl
