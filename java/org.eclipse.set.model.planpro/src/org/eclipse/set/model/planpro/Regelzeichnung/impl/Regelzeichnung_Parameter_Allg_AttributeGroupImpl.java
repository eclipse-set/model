/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Regelzeichnung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Regelzeichnung.RZ_Parameter_Name_TypeClass;
import org.eclipse.set.model.planpro.Regelzeichnung.RZ_Parameter_Wert_TypeClass;
import org.eclipse.set.model.planpro.Regelzeichnung.RegelzeichnungPackage;
import org.eclipse.set.model.planpro.Regelzeichnung.Regelzeichnung_Parameter_Allg_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regelzeichnung Parameter Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Regelzeichnung.impl.Regelzeichnung_Parameter_Allg_AttributeGroupImpl#getRZParameterName <em>RZ Parameter Name</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Regelzeichnung.impl.Regelzeichnung_Parameter_Allg_AttributeGroupImpl#getRZParameterWert <em>RZ Parameter Wert</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Regelzeichnung_Parameter_Allg_AttributeGroupImpl extends EObjectImpl implements Regelzeichnung_Parameter_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getRZParameterName() <em>RZ Parameter Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRZParameterName()
	 * @generated
	 * @ordered
	 */
	protected RZ_Parameter_Name_TypeClass rZParameterName;

	/**
	 * The cached value of the '{@link #getRZParameterWert() <em>RZ Parameter Wert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRZParameterWert()
	 * @generated
	 * @ordered
	 */
	protected RZ_Parameter_Wert_TypeClass rZParameterWert;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Regelzeichnung_Parameter_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RegelzeichnungPackage.Literals.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RZ_Parameter_Name_TypeClass getRZParameterName() {
		return rZParameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRZParameterName(RZ_Parameter_Name_TypeClass newRZParameterName, NotificationChain msgs) {
		RZ_Parameter_Name_TypeClass oldRZParameterName = rZParameterName;
		rZParameterName = newRZParameterName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_NAME, oldRZParameterName, newRZParameterName);
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
	public void setRZParameterName(RZ_Parameter_Name_TypeClass newRZParameterName) {
		if (newRZParameterName != rZParameterName) {
			NotificationChain msgs = null;
			if (rZParameterName != null)
				msgs = ((InternalEObject)rZParameterName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_NAME, null, msgs);
			if (newRZParameterName != null)
				msgs = ((InternalEObject)newRZParameterName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_NAME, null, msgs);
			msgs = basicSetRZParameterName(newRZParameterName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_NAME, newRZParameterName, newRZParameterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RZ_Parameter_Wert_TypeClass getRZParameterWert() {
		return rZParameterWert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRZParameterWert(RZ_Parameter_Wert_TypeClass newRZParameterWert, NotificationChain msgs) {
		RZ_Parameter_Wert_TypeClass oldRZParameterWert = rZParameterWert;
		rZParameterWert = newRZParameterWert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_WERT, oldRZParameterWert, newRZParameterWert);
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
	public void setRZParameterWert(RZ_Parameter_Wert_TypeClass newRZParameterWert) {
		if (newRZParameterWert != rZParameterWert) {
			NotificationChain msgs = null;
			if (rZParameterWert != null)
				msgs = ((InternalEObject)rZParameterWert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_WERT, null, msgs);
			if (newRZParameterWert != null)
				msgs = ((InternalEObject)newRZParameterWert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_WERT, null, msgs);
			msgs = basicSetRZParameterWert(newRZParameterWert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_WERT, newRZParameterWert, newRZParameterWert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_NAME:
				return basicSetRZParameterName(null, msgs);
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_WERT:
				return basicSetRZParameterWert(null, msgs);
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
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_NAME:
				return getRZParameterName();
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_WERT:
				return getRZParameterWert();
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
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_NAME:
				setRZParameterName((RZ_Parameter_Name_TypeClass)newValue);
				return;
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_WERT:
				setRZParameterWert((RZ_Parameter_Wert_TypeClass)newValue);
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
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_NAME:
				setRZParameterName((RZ_Parameter_Name_TypeClass)null);
				return;
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_WERT:
				setRZParameterWert((RZ_Parameter_Wert_TypeClass)null);
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
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_NAME:
				return rZParameterName != null;
			case RegelzeichnungPackage.REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_WERT:
				return rZParameterWert != null;
		}
		return super.eIsSet(featureID);
	}

} //Regelzeichnung_Parameter_Allg_AttributeGroupImpl
