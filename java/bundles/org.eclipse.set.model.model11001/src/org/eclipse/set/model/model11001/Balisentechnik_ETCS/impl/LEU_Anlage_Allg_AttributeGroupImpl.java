/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Anlage_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Anlage_Art_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Leistungsbedarf_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Anlage Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.LEU_Anlage_Allg_AttributeGroupImpl#getLeistungsbedarf <em>Leistungsbedarf</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.LEU_Anlage_Allg_AttributeGroupImpl#getLEUAnlageArt <em>LEU Anlage Art</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_Anlage_Allg_AttributeGroupImpl extends EObjectImpl implements LEU_Anlage_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getLeistungsbedarf() <em>Leistungsbedarf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeistungsbedarf()
	 * @generated
	 * @ordered
	 */
	protected Leistungsbedarf_TypeClass leistungsbedarf;

	/**
	 * The cached value of the '{@link #getLEUAnlageArt() <em>LEU Anlage Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUAnlageArt()
	 * @generated
	 * @ordered
	 */
	protected LEU_Anlage_Art_TypeClass lEUAnlageArt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_Anlage_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Anlage_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Leistungsbedarf_TypeClass getLeistungsbedarf() {
		return leistungsbedarf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeistungsbedarf(Leistungsbedarf_TypeClass newLeistungsbedarf, NotificationChain msgs) {
		Leistungsbedarf_TypeClass oldLeistungsbedarf = leistungsbedarf;
		leistungsbedarf = newLeistungsbedarf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEISTUNGSBEDARF, oldLeistungsbedarf, newLeistungsbedarf);
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
	public void setLeistungsbedarf(Leistungsbedarf_TypeClass newLeistungsbedarf) {
		if (newLeistungsbedarf != leistungsbedarf) {
			NotificationChain msgs = null;
			if (leistungsbedarf != null)
				msgs = ((InternalEObject)leistungsbedarf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEISTUNGSBEDARF, null, msgs);
			if (newLeistungsbedarf != null)
				msgs = ((InternalEObject)newLeistungsbedarf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEISTUNGSBEDARF, null, msgs);
			msgs = basicSetLeistungsbedarf(newLeistungsbedarf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEISTUNGSBEDARF, newLeistungsbedarf, newLeistungsbedarf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Anlage_Art_TypeClass getLEUAnlageArt() {
		return lEUAnlageArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLEUAnlageArt(LEU_Anlage_Art_TypeClass newLEUAnlageArt, NotificationChain msgs) {
		LEU_Anlage_Art_TypeClass oldLEUAnlageArt = lEUAnlageArt;
		lEUAnlageArt = newLEUAnlageArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEU_ANLAGE_ART, oldLEUAnlageArt, newLEUAnlageArt);
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
	public void setLEUAnlageArt(LEU_Anlage_Art_TypeClass newLEUAnlageArt) {
		if (newLEUAnlageArt != lEUAnlageArt) {
			NotificationChain msgs = null;
			if (lEUAnlageArt != null)
				msgs = ((InternalEObject)lEUAnlageArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEU_ANLAGE_ART, null, msgs);
			if (newLEUAnlageArt != null)
				msgs = ((InternalEObject)newLEUAnlageArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEU_ANLAGE_ART, null, msgs);
			msgs = basicSetLEUAnlageArt(newLEUAnlageArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEU_ANLAGE_ART, newLEUAnlageArt, newLEUAnlageArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEISTUNGSBEDARF:
				return basicSetLeistungsbedarf(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEU_ANLAGE_ART:
				return basicSetLEUAnlageArt(null, msgs);
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
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEISTUNGSBEDARF:
				return getLeistungsbedarf();
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEU_ANLAGE_ART:
				return getLEUAnlageArt();
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
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEISTUNGSBEDARF:
				setLeistungsbedarf((Leistungsbedarf_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEU_ANLAGE_ART:
				setLEUAnlageArt((LEU_Anlage_Art_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEISTUNGSBEDARF:
				setLeistungsbedarf((Leistungsbedarf_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEU_ANLAGE_ART:
				setLEUAnlageArt((LEU_Anlage_Art_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEISTUNGSBEDARF:
				return leistungsbedarf != null;
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_ALLG_ATTRIBUTE_GROUP__LEU_ANLAGE_ART:
				return lEUAnlageArt != null;
		}
		return super.eIsSet(featureID);
	}

} //LEU_Anlage_Allg_AttributeGroupImpl
