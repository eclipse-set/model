/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DWeg_Intervall_200_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DWeg_Intervall_50_200_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DWeg_Intervall_50_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal_DWeg_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETCS Signal DWeg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ETCS_Signal_DWeg_AttributeGroupImpl#getDWegIntervall200 <em>DWeg Intervall200</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ETCS_Signal_DWeg_AttributeGroupImpl#getDWegIntervall50 <em>DWeg Intervall50</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ETCS_Signal_DWeg_AttributeGroupImpl#getDWegIntervall50200 <em>DWeg Intervall50200</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETCS_Signal_DWeg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ETCS_Signal_DWeg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDWegIntervall200() <em>DWeg Intervall200</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDWegIntervall200()
	 * @generated
	 * @ordered
	 */
	protected DWeg_Intervall_200_TypeClass dWegIntervall200;

	/**
	 * The cached value of the '{@link #getDWegIntervall50() <em>DWeg Intervall50</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDWegIntervall50()
	 * @generated
	 * @ordered
	 */
	protected DWeg_Intervall_50_TypeClass dWegIntervall50;

	/**
	 * The cached value of the '{@link #getDWegIntervall50200() <em>DWeg Intervall50200</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDWegIntervall50200()
	 * @generated
	 * @ordered
	 */
	protected DWeg_Intervall_50_200_TypeClass dWegIntervall50200;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETCS_Signal_DWeg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_DWeg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DWeg_Intervall_200_TypeClass getDWegIntervall200() {
		return dWegIntervall200;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDWegIntervall200(DWeg_Intervall_200_TypeClass newDWegIntervall200, NotificationChain msgs) {
		DWeg_Intervall_200_TypeClass oldDWegIntervall200 = dWegIntervall200;
		dWegIntervall200 = newDWegIntervall200;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL200, oldDWegIntervall200, newDWegIntervall200);
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
	public void setDWegIntervall200(DWeg_Intervall_200_TypeClass newDWegIntervall200) {
		if (newDWegIntervall200 != dWegIntervall200) {
			NotificationChain msgs = null;
			if (dWegIntervall200 != null)
				msgs = ((InternalEObject)dWegIntervall200).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL200, null, msgs);
			if (newDWegIntervall200 != null)
				msgs = ((InternalEObject)newDWegIntervall200).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL200, null, msgs);
			msgs = basicSetDWegIntervall200(newDWegIntervall200, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL200, newDWegIntervall200, newDWegIntervall200));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DWeg_Intervall_50_TypeClass getDWegIntervall50() {
		return dWegIntervall50;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDWegIntervall50(DWeg_Intervall_50_TypeClass newDWegIntervall50, NotificationChain msgs) {
		DWeg_Intervall_50_TypeClass oldDWegIntervall50 = dWegIntervall50;
		dWegIntervall50 = newDWegIntervall50;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50, oldDWegIntervall50, newDWegIntervall50);
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
	public void setDWegIntervall50(DWeg_Intervall_50_TypeClass newDWegIntervall50) {
		if (newDWegIntervall50 != dWegIntervall50) {
			NotificationChain msgs = null;
			if (dWegIntervall50 != null)
				msgs = ((InternalEObject)dWegIntervall50).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50, null, msgs);
			if (newDWegIntervall50 != null)
				msgs = ((InternalEObject)newDWegIntervall50).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50, null, msgs);
			msgs = basicSetDWegIntervall50(newDWegIntervall50, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50, newDWegIntervall50, newDWegIntervall50));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DWeg_Intervall_50_200_TypeClass getDWegIntervall50200() {
		return dWegIntervall50200;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDWegIntervall50200(DWeg_Intervall_50_200_TypeClass newDWegIntervall50200, NotificationChain msgs) {
		DWeg_Intervall_50_200_TypeClass oldDWegIntervall50200 = dWegIntervall50200;
		dWegIntervall50200 = newDWegIntervall50200;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50200, oldDWegIntervall50200, newDWegIntervall50200);
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
	public void setDWegIntervall50200(DWeg_Intervall_50_200_TypeClass newDWegIntervall50200) {
		if (newDWegIntervall50200 != dWegIntervall50200) {
			NotificationChain msgs = null;
			if (dWegIntervall50200 != null)
				msgs = ((InternalEObject)dWegIntervall50200).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50200, null, msgs);
			if (newDWegIntervall50200 != null)
				msgs = ((InternalEObject)newDWegIntervall50200).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50200, null, msgs);
			msgs = basicSetDWegIntervall50200(newDWegIntervall50200, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50200, newDWegIntervall50200, newDWegIntervall50200));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL200:
				return basicSetDWegIntervall200(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50:
				return basicSetDWegIntervall50(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50200:
				return basicSetDWegIntervall50200(null, msgs);
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL200:
				return getDWegIntervall200();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50:
				return getDWegIntervall50();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50200:
				return getDWegIntervall50200();
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL200:
				setDWegIntervall200((DWeg_Intervall_200_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50:
				setDWegIntervall50((DWeg_Intervall_50_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50200:
				setDWegIntervall50200((DWeg_Intervall_50_200_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL200:
				setDWegIntervall200((DWeg_Intervall_200_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50:
				setDWegIntervall50((DWeg_Intervall_50_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50200:
				setDWegIntervall50200((DWeg_Intervall_50_200_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL200:
				return dWegIntervall200 != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50:
				return dWegIntervall50 != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL_DWEG_ATTRIBUTE_GROUP__DWEG_INTERVALL50200:
				return dWegIntervall50200 != null;
		}
		return super.eIsSet(featureID);
	}

} //ETCS_Signal_DWeg_AttributeGroupImpl
