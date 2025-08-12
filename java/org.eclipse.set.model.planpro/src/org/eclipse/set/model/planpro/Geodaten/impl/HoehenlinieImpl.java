/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Geodaten.GeodatenPackage;
import org.eclipse.set.model.planpro.Geodaten.Hoehenlinie;
import org.eclipse.set.model.planpro.Geodaten.Hoehenlinie_Allg_AttributeGroup;

import org.eclipse.set.model.planpro.Verweise.ID_Hoehenpunkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hoehenlinie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.HoehenlinieImpl#getHoehenlinieAllg <em>Hoehenlinie Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.HoehenlinieImpl#getIDHoehenpunktA <em>ID Hoehenpunkt A</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.HoehenlinieImpl#getIDHoehenpunktB <em>ID Hoehenpunkt B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HoehenlinieImpl extends Basis_ObjektImpl implements Hoehenlinie {
	/**
	 * The cached value of the '{@link #getHoehenlinieAllg() <em>Hoehenlinie Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoehenlinieAllg()
	 * @generated
	 * @ordered
	 */
	protected Hoehenlinie_Allg_AttributeGroup hoehenlinieAllg;

	/**
	 * The cached value of the '{@link #getIDHoehenpunktA() <em>ID Hoehenpunkt A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDHoehenpunktA()
	 * @generated
	 * @ordered
	 */
	protected ID_Hoehenpunkt_TypeClass iDHoehenpunktA;

	/**
	 * The cached value of the '{@link #getIDHoehenpunktB() <em>ID Hoehenpunkt B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDHoehenpunktB()
	 * @generated
	 * @ordered
	 */
	protected ID_Hoehenpunkt_TypeClass iDHoehenpunktB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HoehenlinieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.HOEHENLINIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehenlinie_Allg_AttributeGroup getHoehenlinieAllg() {
		return hoehenlinieAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHoehenlinieAllg(Hoehenlinie_Allg_AttributeGroup newHoehenlinieAllg, NotificationChain msgs) {
		Hoehenlinie_Allg_AttributeGroup oldHoehenlinieAllg = hoehenlinieAllg;
		hoehenlinieAllg = newHoehenlinieAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG, oldHoehenlinieAllg, newHoehenlinieAllg);
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
	public void setHoehenlinieAllg(Hoehenlinie_Allg_AttributeGroup newHoehenlinieAllg) {
		if (newHoehenlinieAllg != hoehenlinieAllg) {
			NotificationChain msgs = null;
			if (hoehenlinieAllg != null)
				msgs = ((InternalEObject)hoehenlinieAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG, null, msgs);
			if (newHoehenlinieAllg != null)
				msgs = ((InternalEObject)newHoehenlinieAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG, null, msgs);
			msgs = basicSetHoehenlinieAllg(newHoehenlinieAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG, newHoehenlinieAllg, newHoehenlinieAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Hoehenpunkt_TypeClass getIDHoehenpunktA() {
		return iDHoehenpunktA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDHoehenpunktA(ID_Hoehenpunkt_TypeClass newIDHoehenpunktA, NotificationChain msgs) {
		ID_Hoehenpunkt_TypeClass oldIDHoehenpunktA = iDHoehenpunktA;
		iDHoehenpunktA = newIDHoehenpunktA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_A, oldIDHoehenpunktA, newIDHoehenpunktA);
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
	public void setIDHoehenpunktA(ID_Hoehenpunkt_TypeClass newIDHoehenpunktA) {
		if (newIDHoehenpunktA != iDHoehenpunktA) {
			NotificationChain msgs = null;
			if (iDHoehenpunktA != null)
				msgs = ((InternalEObject)iDHoehenpunktA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_A, null, msgs);
			if (newIDHoehenpunktA != null)
				msgs = ((InternalEObject)newIDHoehenpunktA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_A, null, msgs);
			msgs = basicSetIDHoehenpunktA(newIDHoehenpunktA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_A, newIDHoehenpunktA, newIDHoehenpunktA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Hoehenpunkt_TypeClass getIDHoehenpunktB() {
		return iDHoehenpunktB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDHoehenpunktB(ID_Hoehenpunkt_TypeClass newIDHoehenpunktB, NotificationChain msgs) {
		ID_Hoehenpunkt_TypeClass oldIDHoehenpunktB = iDHoehenpunktB;
		iDHoehenpunktB = newIDHoehenpunktB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_B, oldIDHoehenpunktB, newIDHoehenpunktB);
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
	public void setIDHoehenpunktB(ID_Hoehenpunkt_TypeClass newIDHoehenpunktB) {
		if (newIDHoehenpunktB != iDHoehenpunktB) {
			NotificationChain msgs = null;
			if (iDHoehenpunktB != null)
				msgs = ((InternalEObject)iDHoehenpunktB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_B, null, msgs);
			if (newIDHoehenpunktB != null)
				msgs = ((InternalEObject)newIDHoehenpunktB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_B, null, msgs);
			msgs = basicSetIDHoehenpunktB(newIDHoehenpunktB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_B, newIDHoehenpunktB, newIDHoehenpunktB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG:
				return basicSetHoehenlinieAllg(null, msgs);
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_A:
				return basicSetIDHoehenpunktA(null, msgs);
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_B:
				return basicSetIDHoehenpunktB(null, msgs);
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
			case GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG:
				return getHoehenlinieAllg();
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_A:
				return getIDHoehenpunktA();
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_B:
				return getIDHoehenpunktB();
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
			case GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG:
				setHoehenlinieAllg((Hoehenlinie_Allg_AttributeGroup)newValue);
				return;
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_A:
				setIDHoehenpunktA((ID_Hoehenpunkt_TypeClass)newValue);
				return;
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_B:
				setIDHoehenpunktB((ID_Hoehenpunkt_TypeClass)newValue);
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
			case GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG:
				setHoehenlinieAllg((Hoehenlinie_Allg_AttributeGroup)null);
				return;
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_A:
				setIDHoehenpunktA((ID_Hoehenpunkt_TypeClass)null);
				return;
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_B:
				setIDHoehenpunktB((ID_Hoehenpunkt_TypeClass)null);
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
			case GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG:
				return hoehenlinieAllg != null;
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_A:
				return iDHoehenpunktA != null;
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_B:
				return iDHoehenpunktB != null;
		}
		return super.eIsSet(featureID);
	}

} //HoehenlinieImpl
