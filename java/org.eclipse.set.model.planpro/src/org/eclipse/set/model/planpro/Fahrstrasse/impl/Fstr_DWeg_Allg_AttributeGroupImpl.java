/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.planpro.Fahrstrasse.Fstr_DWeg_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Fahrstrasse.Laenge_Soll_TypeClass;
import org.eclipse.set.model.planpro.Fahrstrasse.Massgebende_Neigung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr DWeg Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_Allg_AttributeGroupImpl#getLaengeSoll <em>Laenge Soll</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Fahrstrasse.impl.Fstr_DWeg_Allg_AttributeGroupImpl#getMassgebendeNeigung <em>Massgebende Neigung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_DWeg_Allg_AttributeGroupImpl extends EObjectImpl implements Fstr_DWeg_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getLaengeSoll() <em>Laenge Soll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaengeSoll()
	 * @generated
	 * @ordered
	 */
	protected Laenge_Soll_TypeClass laengeSoll;

	/**
	 * The cached value of the '{@link #getMassgebendeNeigung() <em>Massgebende Neigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassgebendeNeigung()
	 * @generated
	 * @ordered
	 */
	protected Massgebende_Neigung_TypeClass massgebendeNeigung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_DWeg_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Laenge_Soll_TypeClass getLaengeSoll() {
		return laengeSoll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaengeSoll(Laenge_Soll_TypeClass newLaengeSoll, NotificationChain msgs) {
		Laenge_Soll_TypeClass oldLaengeSoll = laengeSoll;
		laengeSoll = newLaengeSoll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL, oldLaengeSoll, newLaengeSoll);
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
	public void setLaengeSoll(Laenge_Soll_TypeClass newLaengeSoll) {
		if (newLaengeSoll != laengeSoll) {
			NotificationChain msgs = null;
			if (laengeSoll != null)
				msgs = ((InternalEObject)laengeSoll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL, null, msgs);
			if (newLaengeSoll != null)
				msgs = ((InternalEObject)newLaengeSoll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL, null, msgs);
			msgs = basicSetLaengeSoll(newLaengeSoll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL, newLaengeSoll, newLaengeSoll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Massgebende_Neigung_TypeClass getMassgebendeNeigung() {
		return massgebendeNeigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassgebendeNeigung(Massgebende_Neigung_TypeClass newMassgebendeNeigung, NotificationChain msgs) {
		Massgebende_Neigung_TypeClass oldMassgebendeNeigung = massgebendeNeigung;
		massgebendeNeigung = newMassgebendeNeigung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG, oldMassgebendeNeigung, newMassgebendeNeigung);
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
	public void setMassgebendeNeigung(Massgebende_Neigung_TypeClass newMassgebendeNeigung) {
		if (newMassgebendeNeigung != massgebendeNeigung) {
			NotificationChain msgs = null;
			if (massgebendeNeigung != null)
				msgs = ((InternalEObject)massgebendeNeigung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG, null, msgs);
			if (newMassgebendeNeigung != null)
				msgs = ((InternalEObject)newMassgebendeNeigung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG, null, msgs);
			msgs = basicSetMassgebendeNeigung(newMassgebendeNeigung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG, newMassgebendeNeigung, newMassgebendeNeigung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL:
				return basicSetLaengeSoll(null, msgs);
			case FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG:
				return basicSetMassgebendeNeigung(null, msgs);
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
			case FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL:
				return getLaengeSoll();
			case FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG:
				return getMassgebendeNeigung();
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
			case FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL:
				setLaengeSoll((Laenge_Soll_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG:
				setMassgebendeNeigung((Massgebende_Neigung_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL:
				setLaengeSoll((Laenge_Soll_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG:
				setMassgebendeNeigung((Massgebende_Neigung_TypeClass)null);
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
			case FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL:
				return laengeSoll != null;
			case FahrstrassePackage.FSTR_DWEG_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG:
				return massgebendeNeigung != null;
		}
		return super.eIsSet(featureID);
	}

} //Fstr_DWeg_Allg_AttributeGroupImpl
