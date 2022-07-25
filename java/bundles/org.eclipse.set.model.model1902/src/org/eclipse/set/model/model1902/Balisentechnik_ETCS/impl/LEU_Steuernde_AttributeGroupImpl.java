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
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Ausgang_Nr_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Steuernde_AttributeGroup;

import org.eclipse.set.model.model1902.Verweise.ID_LEU_Anlage_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Steuernde Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.LEU_Steuernde_AttributeGroupImpl#getIDLEUAnlage <em>IDLEU Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.LEU_Steuernde_AttributeGroupImpl#getLEUAusgangNr <em>LEU Ausgang Nr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_Steuernde_AttributeGroupImpl extends MinimalEObjectImpl.Container implements LEU_Steuernde_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDLEUAnlage() <em>IDLEU Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDLEUAnlage()
	 * @generated
	 * @ordered
	 */
	protected ID_LEU_Anlage_TypeClass iDLEUAnlage;

	/**
	 * The cached value of the '{@link #getLEUAusgangNr() <em>LEU Ausgang Nr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUAusgangNr()
	 * @generated
	 * @ordered
	 */
	protected EList<LEU_Ausgang_Nr_TypeClass> lEUAusgangNr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_Steuernde_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Steuernde_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_LEU_Anlage_TypeClass getIDLEUAnlage() {
		return iDLEUAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDLEUAnlage(ID_LEU_Anlage_TypeClass newIDLEUAnlage, NotificationChain msgs) {
		ID_LEU_Anlage_TypeClass oldIDLEUAnlage = iDLEUAnlage;
		iDLEUAnlage = newIDLEUAnlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__IDLEU_ANLAGE, oldIDLEUAnlage, newIDLEUAnlage);
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
	public void setIDLEUAnlage(ID_LEU_Anlage_TypeClass newIDLEUAnlage) {
		if (newIDLEUAnlage != iDLEUAnlage) {
			NotificationChain msgs = null;
			if (iDLEUAnlage != null)
				msgs = ((InternalEObject)iDLEUAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__IDLEU_ANLAGE, null, msgs);
			if (newIDLEUAnlage != null)
				msgs = ((InternalEObject)newIDLEUAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__IDLEU_ANLAGE, null, msgs);
			msgs = basicSetIDLEUAnlage(newIDLEUAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__IDLEU_ANLAGE, newIDLEUAnlage, newIDLEUAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LEU_Ausgang_Nr_TypeClass> getLEUAusgangNr() {
		if (lEUAusgangNr == null) {
			lEUAusgangNr = new EObjectContainmentEList<LEU_Ausgang_Nr_TypeClass>(LEU_Ausgang_Nr_TypeClass.class, this, Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__LEU_AUSGANG_NR);
		}
		return lEUAusgangNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__IDLEU_ANLAGE:
				return basicSetIDLEUAnlage(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				return ((InternalEList<?>)getLEUAusgangNr()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__IDLEU_ANLAGE:
				return getIDLEUAnlage();
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				return getLEUAusgangNr();
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
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__IDLEU_ANLAGE:
				setIDLEUAnlage((ID_LEU_Anlage_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				getLEUAusgangNr().clear();
				getLEUAusgangNr().addAll((Collection<? extends LEU_Ausgang_Nr_TypeClass>)newValue);
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
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__IDLEU_ANLAGE:
				setIDLEUAnlage((ID_LEU_Anlage_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				getLEUAusgangNr().clear();
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
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__IDLEU_ANLAGE:
				return iDLEUAnlage != null;
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				return lEUAusgangNr != null && !lEUAusgangNr.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LEU_Steuernde_AttributeGroupImpl
