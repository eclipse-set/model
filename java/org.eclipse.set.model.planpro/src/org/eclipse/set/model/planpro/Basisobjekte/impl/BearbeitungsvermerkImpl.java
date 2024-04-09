/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Basisobjekte.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk;
import org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup;

import org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bearbeitungsvermerk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.impl.BearbeitungsvermerkImpl#getBearbeitungsvermerkAllg <em>Bearbeitungsvermerk Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.impl.BearbeitungsvermerkImpl#getIDAnhang <em>ID Anhang</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BearbeitungsvermerkImpl extends Ur_ObjektImpl implements Bearbeitungsvermerk {
	/**
	 * The cached value of the '{@link #getBearbeitungsvermerkAllg() <em>Bearbeitungsvermerk Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearbeitungsvermerkAllg()
	 * @generated
	 * @ordered
	 */
	protected Bearbeitungsvermerk_Allg_AttributeGroup bearbeitungsvermerkAllg;

	/**
	 * The cached value of the '{@link #getIDAnhang() <em>ID Anhang</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhang()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Anhang_TypeClass> iDAnhang;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BearbeitungsvermerkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisobjektePackage.Literals.BEARBEITUNGSVERMERK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bearbeitungsvermerk_Allg_AttributeGroup getBearbeitungsvermerkAllg() {
		return bearbeitungsvermerkAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBearbeitungsvermerkAllg(Bearbeitungsvermerk_Allg_AttributeGroup newBearbeitungsvermerkAllg, NotificationChain msgs) {
		Bearbeitungsvermerk_Allg_AttributeGroup oldBearbeitungsvermerkAllg = bearbeitungsvermerkAllg;
		bearbeitungsvermerkAllg = newBearbeitungsvermerkAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG, oldBearbeitungsvermerkAllg, newBearbeitungsvermerkAllg);
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
	public void setBearbeitungsvermerkAllg(Bearbeitungsvermerk_Allg_AttributeGroup newBearbeitungsvermerkAllg) {
		if (newBearbeitungsvermerkAllg != bearbeitungsvermerkAllg) {
			NotificationChain msgs = null;
			if (bearbeitungsvermerkAllg != null)
				msgs = ((InternalEObject)bearbeitungsvermerkAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG, null, msgs);
			if (newBearbeitungsvermerkAllg != null)
				msgs = ((InternalEObject)newBearbeitungsvermerkAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG, null, msgs);
			msgs = basicSetBearbeitungsvermerkAllg(newBearbeitungsvermerkAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG, newBearbeitungsvermerkAllg, newBearbeitungsvermerkAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Anhang_TypeClass> getIDAnhang() {
		if (iDAnhang == null) {
			iDAnhang = new EObjectContainmentEList<ID_Anhang_TypeClass>(ID_Anhang_TypeClass.class, this, BasisobjektePackage.BEARBEITUNGSVERMERK__ID_ANHANG);
		}
		return iDAnhang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG:
				return basicSetBearbeitungsvermerkAllg(null, msgs);
			case BasisobjektePackage.BEARBEITUNGSVERMERK__ID_ANHANG:
				return ((InternalEList<?>)getIDAnhang()).basicRemove(otherEnd, msgs);
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
			case BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG:
				return getBearbeitungsvermerkAllg();
			case BasisobjektePackage.BEARBEITUNGSVERMERK__ID_ANHANG:
				return getIDAnhang();
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
			case BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG:
				setBearbeitungsvermerkAllg((Bearbeitungsvermerk_Allg_AttributeGroup)newValue);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK__ID_ANHANG:
				getIDAnhang().clear();
				getIDAnhang().addAll((Collection<? extends ID_Anhang_TypeClass>)newValue);
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
			case BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG:
				setBearbeitungsvermerkAllg((Bearbeitungsvermerk_Allg_AttributeGroup)null);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK__ID_ANHANG:
				getIDAnhang().clear();
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
			case BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG:
				return bearbeitungsvermerkAllg != null;
			case BasisobjektePackage.BEARBEITUNGSVERMERK__ID_ANHANG:
				return iDAnhang != null && !iDAnhang.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BearbeitungsvermerkImpl
