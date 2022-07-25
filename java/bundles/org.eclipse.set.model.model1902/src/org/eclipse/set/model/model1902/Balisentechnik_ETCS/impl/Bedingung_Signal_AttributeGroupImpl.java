/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bedingung_Signal_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Verwendung_Als_Rueckfall_TypeClass;

import org.eclipse.set.model.model1902.Verweise.ID_Signal_Signalbegriff_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedingung Signal Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Bedingung_Signal_AttributeGroupImpl#getIDSignalSignalbegriff <em>ID Signal Signalbegriff</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Bedingung_Signal_AttributeGroupImpl#getVerwendungAlsRueckfall <em>Verwendung Als Rueckfall</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedingung_Signal_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Bedingung_Signal_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDSignalSignalbegriff() <em>ID Signal Signalbegriff</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalSignalbegriff()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Signal_Signalbegriff_TypeClass> iDSignalSignalbegriff;

	/**
	 * The cached value of the '{@link #getVerwendungAlsRueckfall() <em>Verwendung Als Rueckfall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerwendungAlsRueckfall()
	 * @generated
	 * @ordered
	 */
	protected Verwendung_Als_Rueckfall_TypeClass verwendungAlsRueckfall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedingung_Signal_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBedingung_Signal_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Signal_Signalbegriff_TypeClass> getIDSignalSignalbegriff() {
		if (iDSignalSignalbegriff == null) {
			iDSignalSignalbegriff = new EObjectContainmentEList<ID_Signal_Signalbegriff_TypeClass>(ID_Signal_Signalbegriff_TypeClass.class, this, Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__ID_SIGNAL_SIGNALBEGRIFF);
		}
		return iDSignalSignalbegriff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verwendung_Als_Rueckfall_TypeClass getVerwendungAlsRueckfall() {
		return verwendungAlsRueckfall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerwendungAlsRueckfall(Verwendung_Als_Rueckfall_TypeClass newVerwendungAlsRueckfall, NotificationChain msgs) {
		Verwendung_Als_Rueckfall_TypeClass oldVerwendungAlsRueckfall = verwendungAlsRueckfall;
		verwendungAlsRueckfall = newVerwendungAlsRueckfall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL, oldVerwendungAlsRueckfall, newVerwendungAlsRueckfall);
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
	public void setVerwendungAlsRueckfall(Verwendung_Als_Rueckfall_TypeClass newVerwendungAlsRueckfall) {
		if (newVerwendungAlsRueckfall != verwendungAlsRueckfall) {
			NotificationChain msgs = null;
			if (verwendungAlsRueckfall != null)
				msgs = ((InternalEObject)verwendungAlsRueckfall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL, null, msgs);
			if (newVerwendungAlsRueckfall != null)
				msgs = ((InternalEObject)newVerwendungAlsRueckfall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL, null, msgs);
			msgs = basicSetVerwendungAlsRueckfall(newVerwendungAlsRueckfall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL, newVerwendungAlsRueckfall, newVerwendungAlsRueckfall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__ID_SIGNAL_SIGNALBEGRIFF:
				return ((InternalEList<?>)getIDSignalSignalbegriff()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL:
				return basicSetVerwendungAlsRueckfall(null, msgs);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__ID_SIGNAL_SIGNALBEGRIFF:
				return getIDSignalSignalbegriff();
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL:
				return getVerwendungAlsRueckfall();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__ID_SIGNAL_SIGNALBEGRIFF:
				getIDSignalSignalbegriff().clear();
				getIDSignalSignalbegriff().addAll((Collection<? extends ID_Signal_Signalbegriff_TypeClass>)newValue);
				return;
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL:
				setVerwendungAlsRueckfall((Verwendung_Als_Rueckfall_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__ID_SIGNAL_SIGNALBEGRIFF:
				getIDSignalSignalbegriff().clear();
				return;
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL:
				setVerwendungAlsRueckfall((Verwendung_Als_Rueckfall_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__ID_SIGNAL_SIGNALBEGRIFF:
				return iDSignalSignalbegriff != null && !iDSignalSignalbegriff.isEmpty();
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL:
				return verwendungAlsRueckfall != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedingung_Signal_AttributeGroupImpl
