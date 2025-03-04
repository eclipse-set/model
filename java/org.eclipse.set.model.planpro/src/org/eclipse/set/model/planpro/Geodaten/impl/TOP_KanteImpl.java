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
import org.eclipse.set.model.planpro.Geodaten.TOP_Kante;
import org.eclipse.set.model.planpro.Geodaten.TOP_Kante_Allg_AttributeGroup;

import org.eclipse.set.model.planpro.Verweise.ID_TOP_Knoten_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TOP Kante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.TOP_KanteImpl#getIDTOPKnotenA <em>IDTOP Knoten A</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.TOP_KanteImpl#getIDTOPKnotenB <em>IDTOP Knoten B</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.TOP_KanteImpl#getTOPKanteAllg <em>TOP Kante Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TOP_KanteImpl extends Basis_ObjektImpl implements TOP_Kante {
	/**
	 * The cached value of the '{@link #getIDTOPKnotenA() <em>IDTOP Knoten A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDTOPKnotenA()
	 * @generated
	 * @ordered
	 */
	protected ID_TOP_Knoten_TypeClass iDTOPKnotenA;

	/**
	 * The cached value of the '{@link #getIDTOPKnotenB() <em>IDTOP Knoten B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDTOPKnotenB()
	 * @generated
	 * @ordered
	 */
	protected ID_TOP_Knoten_TypeClass iDTOPKnotenB;

	/**
	 * The cached value of the '{@link #getTOPKanteAllg() <em>TOP Kante Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOPKanteAllg()
	 * @generated
	 * @ordered
	 */
	protected TOP_Kante_Allg_AttributeGroup tOPKanteAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TOP_KanteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.TOP_KANTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_TOP_Knoten_TypeClass getIDTOPKnotenA() {
		return iDTOPKnotenA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDTOPKnotenA(ID_TOP_Knoten_TypeClass newIDTOPKnotenA, NotificationChain msgs) {
		ID_TOP_Knoten_TypeClass oldIDTOPKnotenA = iDTOPKnotenA;
		iDTOPKnotenA = newIDTOPKnotenA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_A, oldIDTOPKnotenA, newIDTOPKnotenA);
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
	public void setIDTOPKnotenA(ID_TOP_Knoten_TypeClass newIDTOPKnotenA) {
		if (newIDTOPKnotenA != iDTOPKnotenA) {
			NotificationChain msgs = null;
			if (iDTOPKnotenA != null)
				msgs = ((InternalEObject)iDTOPKnotenA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_A, null, msgs);
			if (newIDTOPKnotenA != null)
				msgs = ((InternalEObject)newIDTOPKnotenA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_A, null, msgs);
			msgs = basicSetIDTOPKnotenA(newIDTOPKnotenA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_A, newIDTOPKnotenA, newIDTOPKnotenA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_TOP_Knoten_TypeClass getIDTOPKnotenB() {
		return iDTOPKnotenB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDTOPKnotenB(ID_TOP_Knoten_TypeClass newIDTOPKnotenB, NotificationChain msgs) {
		ID_TOP_Knoten_TypeClass oldIDTOPKnotenB = iDTOPKnotenB;
		iDTOPKnotenB = newIDTOPKnotenB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_B, oldIDTOPKnotenB, newIDTOPKnotenB);
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
	public void setIDTOPKnotenB(ID_TOP_Knoten_TypeClass newIDTOPKnotenB) {
		if (newIDTOPKnotenB != iDTOPKnotenB) {
			NotificationChain msgs = null;
			if (iDTOPKnotenB != null)
				msgs = ((InternalEObject)iDTOPKnotenB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_B, null, msgs);
			if (newIDTOPKnotenB != null)
				msgs = ((InternalEObject)newIDTOPKnotenB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_B, null, msgs);
			msgs = basicSetIDTOPKnotenB(newIDTOPKnotenB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_B, newIDTOPKnotenB, newIDTOPKnotenB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOP_Kante_Allg_AttributeGroup getTOPKanteAllg() {
		return tOPKanteAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTOPKanteAllg(TOP_Kante_Allg_AttributeGroup newTOPKanteAllg, NotificationChain msgs) {
		TOP_Kante_Allg_AttributeGroup oldTOPKanteAllg = tOPKanteAllg;
		tOPKanteAllg = newTOPKanteAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG, oldTOPKanteAllg, newTOPKanteAllg);
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
	public void setTOPKanteAllg(TOP_Kante_Allg_AttributeGroup newTOPKanteAllg) {
		if (newTOPKanteAllg != tOPKanteAllg) {
			NotificationChain msgs = null;
			if (tOPKanteAllg != null)
				msgs = ((InternalEObject)tOPKanteAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG, null, msgs);
			if (newTOPKanteAllg != null)
				msgs = ((InternalEObject)newTOPKanteAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG, null, msgs);
			msgs = basicSetTOPKanteAllg(newTOPKanteAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG, newTOPKanteAllg, newTOPKanteAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_A:
				return basicSetIDTOPKnotenA(null, msgs);
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_B:
				return basicSetIDTOPKnotenB(null, msgs);
			case GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG:
				return basicSetTOPKanteAllg(null, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_A:
				return getIDTOPKnotenA();
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_B:
				return getIDTOPKnotenB();
			case GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG:
				return getTOPKanteAllg();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_A:
				setIDTOPKnotenA((ID_TOP_Knoten_TypeClass)newValue);
				return;
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_B:
				setIDTOPKnotenB((ID_TOP_Knoten_TypeClass)newValue);
				return;
			case GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG:
				setTOPKanteAllg((TOP_Kante_Allg_AttributeGroup)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_A:
				setIDTOPKnotenA((ID_TOP_Knoten_TypeClass)null);
				return;
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_B:
				setIDTOPKnotenB((ID_TOP_Knoten_TypeClass)null);
				return;
			case GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG:
				setTOPKanteAllg((TOP_Kante_Allg_AttributeGroup)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_A:
				return iDTOPKnotenA != null;
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_B:
				return iDTOPKnotenB != null;
			case GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG:
				return tOPKanteAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //TOP_KanteImpl
