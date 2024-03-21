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
import org.eclipse.set.model.planpro.Geodaten.Ueberhoehungslinie;
import org.eclipse.set.model.planpro.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup;

import org.eclipse.set.model.planpro.Verweise.ID_Ueberhoehung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ueberhoehungslinie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.UeberhoehungslinieImpl#getIDUeberhoehungA <em>ID Ueberhoehung A</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.UeberhoehungslinieImpl#getIDUeberhoehungB <em>ID Ueberhoehung B</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.UeberhoehungslinieImpl#getUeberhoehungslinieAllg <em>Ueberhoehungslinie Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UeberhoehungslinieImpl extends Basis_ObjektImpl implements Ueberhoehungslinie {
	/**
	 * The cached value of the '{@link #getIDUeberhoehungA() <em>ID Ueberhoehung A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUeberhoehungA()
	 * @generated
	 * @ordered
	 */
	protected ID_Ueberhoehung_TypeClass iDUeberhoehungA;

	/**
	 * The cached value of the '{@link #getIDUeberhoehungB() <em>ID Ueberhoehung B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUeberhoehungB()
	 * @generated
	 * @ordered
	 */
	protected ID_Ueberhoehung_TypeClass iDUeberhoehungB;

	/**
	 * The cached value of the '{@link #getUeberhoehungslinieAllg() <em>Ueberhoehungslinie Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUeberhoehungslinieAllg()
	 * @generated
	 * @ordered
	 */
	protected Ueberhoehungslinie_Allg_AttributeGroup ueberhoehungslinieAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UeberhoehungslinieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.UEBERHOEHUNGSLINIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Ueberhoehung_TypeClass getIDUeberhoehungA() {
		return iDUeberhoehungA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDUeberhoehungA(ID_Ueberhoehung_TypeClass newIDUeberhoehungA, NotificationChain msgs) {
		ID_Ueberhoehung_TypeClass oldIDUeberhoehungA = iDUeberhoehungA;
		iDUeberhoehungA = newIDUeberhoehungA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A, oldIDUeberhoehungA, newIDUeberhoehungA);
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
	public void setIDUeberhoehungA(ID_Ueberhoehung_TypeClass newIDUeberhoehungA) {
		if (newIDUeberhoehungA != iDUeberhoehungA) {
			NotificationChain msgs = null;
			if (iDUeberhoehungA != null)
				msgs = ((InternalEObject)iDUeberhoehungA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A, null, msgs);
			if (newIDUeberhoehungA != null)
				msgs = ((InternalEObject)newIDUeberhoehungA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A, null, msgs);
			msgs = basicSetIDUeberhoehungA(newIDUeberhoehungA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A, newIDUeberhoehungA, newIDUeberhoehungA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Ueberhoehung_TypeClass getIDUeberhoehungB() {
		return iDUeberhoehungB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDUeberhoehungB(ID_Ueberhoehung_TypeClass newIDUeberhoehungB, NotificationChain msgs) {
		ID_Ueberhoehung_TypeClass oldIDUeberhoehungB = iDUeberhoehungB;
		iDUeberhoehungB = newIDUeberhoehungB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B, oldIDUeberhoehungB, newIDUeberhoehungB);
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
	public void setIDUeberhoehungB(ID_Ueberhoehung_TypeClass newIDUeberhoehungB) {
		if (newIDUeberhoehungB != iDUeberhoehungB) {
			NotificationChain msgs = null;
			if (iDUeberhoehungB != null)
				msgs = ((InternalEObject)iDUeberhoehungB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B, null, msgs);
			if (newIDUeberhoehungB != null)
				msgs = ((InternalEObject)newIDUeberhoehungB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B, null, msgs);
			msgs = basicSetIDUeberhoehungB(newIDUeberhoehungB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B, newIDUeberhoehungB, newIDUeberhoehungB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberhoehungslinie_Allg_AttributeGroup getUeberhoehungslinieAllg() {
		return ueberhoehungslinieAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUeberhoehungslinieAllg(Ueberhoehungslinie_Allg_AttributeGroup newUeberhoehungslinieAllg, NotificationChain msgs) {
		Ueberhoehungslinie_Allg_AttributeGroup oldUeberhoehungslinieAllg = ueberhoehungslinieAllg;
		ueberhoehungslinieAllg = newUeberhoehungslinieAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG, oldUeberhoehungslinieAllg, newUeberhoehungslinieAllg);
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
	public void setUeberhoehungslinieAllg(Ueberhoehungslinie_Allg_AttributeGroup newUeberhoehungslinieAllg) {
		if (newUeberhoehungslinieAllg != ueberhoehungslinieAllg) {
			NotificationChain msgs = null;
			if (ueberhoehungslinieAllg != null)
				msgs = ((InternalEObject)ueberhoehungslinieAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG, null, msgs);
			if (newUeberhoehungslinieAllg != null)
				msgs = ((InternalEObject)newUeberhoehungslinieAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG, null, msgs);
			msgs = basicSetUeberhoehungslinieAllg(newUeberhoehungslinieAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG, newUeberhoehungslinieAllg, newUeberhoehungslinieAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A:
				return basicSetIDUeberhoehungA(null, msgs);
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B:
				return basicSetIDUeberhoehungB(null, msgs);
			case GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG:
				return basicSetUeberhoehungslinieAllg(null, msgs);
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
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A:
				return getIDUeberhoehungA();
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B:
				return getIDUeberhoehungB();
			case GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG:
				return getUeberhoehungslinieAllg();
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
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A:
				setIDUeberhoehungA((ID_Ueberhoehung_TypeClass)newValue);
				return;
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B:
				setIDUeberhoehungB((ID_Ueberhoehung_TypeClass)newValue);
				return;
			case GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG:
				setUeberhoehungslinieAllg((Ueberhoehungslinie_Allg_AttributeGroup)newValue);
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
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A:
				setIDUeberhoehungA((ID_Ueberhoehung_TypeClass)null);
				return;
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B:
				setIDUeberhoehungB((ID_Ueberhoehung_TypeClass)null);
				return;
			case GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG:
				setUeberhoehungslinieAllg((Ueberhoehungslinie_Allg_AttributeGroup)null);
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
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A:
				return iDUeberhoehungA != null;
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B:
				return iDUeberhoehungB != null;
			case GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG:
				return ueberhoehungslinieAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //UeberhoehungslinieImpl
