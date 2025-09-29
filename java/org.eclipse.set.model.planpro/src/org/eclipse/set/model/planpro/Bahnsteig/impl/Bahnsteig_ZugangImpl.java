/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnsteig.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage;
import org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Zugang;
import org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Zugang_Allg_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_Bahnsteig_Anlage_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bahnsteig Zugang</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnsteig.impl.Bahnsteig_ZugangImpl#getBahnsteigZugangAllg <em>Bahnsteig Zugang Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnsteig.impl.Bahnsteig_ZugangImpl#getIDBahnsteigAnlage <em>ID Bahnsteig Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bahnsteig_ZugangImpl extends Punkt_ObjektImpl implements Bahnsteig_Zugang {
	/**
	 * The cached value of the '{@link #getBahnsteigZugangAllg() <em>Bahnsteig Zugang Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBahnsteigZugangAllg()
	 * @generated
	 * @ordered
	 */
	protected Bahnsteig_Zugang_Allg_AttributeGroup bahnsteigZugangAllg;

	/**
	 * The cached value of the '{@link #getIDBahnsteigAnlage() <em>ID Bahnsteig Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBahnsteigAnlage()
	 * @generated
	 * @ordered
	 */
	protected ID_Bahnsteig_Anlage_TypeClass iDBahnsteigAnlage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bahnsteig_ZugangImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnsteigPackage.Literals.BAHNSTEIG_ZUGANG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Zugang_Allg_AttributeGroup getBahnsteigZugangAllg() {
		return bahnsteigZugangAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBahnsteigZugangAllg(Bahnsteig_Zugang_Allg_AttributeGroup newBahnsteigZugangAllg, NotificationChain msgs) {
		Bahnsteig_Zugang_Allg_AttributeGroup oldBahnsteigZugangAllg = bahnsteigZugangAllg;
		bahnsteigZugangAllg = newBahnsteigZugangAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG, oldBahnsteigZugangAllg, newBahnsteigZugangAllg);
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
	public void setBahnsteigZugangAllg(Bahnsteig_Zugang_Allg_AttributeGroup newBahnsteigZugangAllg) {
		if (newBahnsteigZugangAllg != bahnsteigZugangAllg) {
			NotificationChain msgs = null;
			if (bahnsteigZugangAllg != null)
				msgs = ((InternalEObject)bahnsteigZugangAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG, null, msgs);
			if (newBahnsteigZugangAllg != null)
				msgs = ((InternalEObject)newBahnsteigZugangAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG, null, msgs);
			msgs = basicSetBahnsteigZugangAllg(newBahnsteigZugangAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG, newBahnsteigZugangAllg, newBahnsteigZugangAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bahnsteig_Anlage_TypeClass getIDBahnsteigAnlage() {
		return iDBahnsteigAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBahnsteigAnlage(ID_Bahnsteig_Anlage_TypeClass newIDBahnsteigAnlage, NotificationChain msgs) {
		ID_Bahnsteig_Anlage_TypeClass oldIDBahnsteigAnlage = iDBahnsteigAnlage;
		iDBahnsteigAnlage = newIDBahnsteigAnlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE, oldIDBahnsteigAnlage, newIDBahnsteigAnlage);
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
	public void setIDBahnsteigAnlage(ID_Bahnsteig_Anlage_TypeClass newIDBahnsteigAnlage) {
		if (newIDBahnsteigAnlage != iDBahnsteigAnlage) {
			NotificationChain msgs = null;
			if (iDBahnsteigAnlage != null)
				msgs = ((InternalEObject)iDBahnsteigAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE, null, msgs);
			if (newIDBahnsteigAnlage != null)
				msgs = ((InternalEObject)newIDBahnsteigAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE, null, msgs);
			msgs = basicSetIDBahnsteigAnlage(newIDBahnsteigAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE, newIDBahnsteigAnlage, newIDBahnsteigAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG:
				return basicSetBahnsteigZugangAllg(null, msgs);
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE:
				return basicSetIDBahnsteigAnlage(null, msgs);
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
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG:
				return getBahnsteigZugangAllg();
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE:
				return getIDBahnsteigAnlage();
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
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG:
				setBahnsteigZugangAllg((Bahnsteig_Zugang_Allg_AttributeGroup)newValue);
				return;
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE:
				setIDBahnsteigAnlage((ID_Bahnsteig_Anlage_TypeClass)newValue);
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
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG:
				setBahnsteigZugangAllg((Bahnsteig_Zugang_Allg_AttributeGroup)null);
				return;
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE:
				setIDBahnsteigAnlage((ID_Bahnsteig_Anlage_TypeClass)null);
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
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG:
				return bahnsteigZugangAllg != null;
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE:
				return iDBahnsteigAnlage != null;
		}
		return super.eIsSet(featureID);
	}

} //Bahnsteig_ZugangImpl
