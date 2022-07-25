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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Kante;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Kante_Bezeichnung_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_ETCS_Knoten_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_RBC_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_TOP_Kante_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETCS Kante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ETCS_KanteImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ETCS_KanteImpl#getIDETCSKnotenA <em>IDETCS Knoten A</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ETCS_KanteImpl#getIDETCSKnotenB <em>IDETCS Knoten B</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ETCS_KanteImpl#getIDRBC <em>IDRBC</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ETCS_KanteImpl#getIDTOPKante <em>IDTOP Kante</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETCS_KanteImpl extends Basis_ObjektImpl implements ETCS_Kante {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Kante_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDETCSKnotenA() <em>IDETCS Knoten A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDETCSKnotenA()
	 * @generated
	 * @ordered
	 */
	protected ID_ETCS_Knoten_ohne_Proxy_TypeClass iDETCSKnotenA;

	/**
	 * The cached value of the '{@link #getIDETCSKnotenB() <em>IDETCS Knoten B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDETCSKnotenB()
	 * @generated
	 * @ordered
	 */
	protected ID_ETCS_Knoten_ohne_Proxy_TypeClass iDETCSKnotenB;

	/**
	 * The cached value of the '{@link #getIDRBC() <em>IDRBC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_RBC_TypeClass> iDRBC;

	/**
	 * The cached value of the '{@link #getIDTOPKante() <em>IDTOP Kante</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDTOPKante()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_TOP_Kante_ohne_Proxy_TypeClass> iDTOPKante;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETCS_KanteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Kante();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Kante_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(ETCS_Kante_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		ETCS_Kante_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(ETCS_Kante_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ETCS_Knoten_ohne_Proxy_TypeClass getIDETCSKnotenA() {
		return iDETCSKnotenA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDETCSKnotenA(ID_ETCS_Knoten_ohne_Proxy_TypeClass newIDETCSKnotenA, NotificationChain msgs) {
		ID_ETCS_Knoten_ohne_Proxy_TypeClass oldIDETCSKnotenA = iDETCSKnotenA;
		iDETCSKnotenA = newIDETCSKnotenA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_A, oldIDETCSKnotenA, newIDETCSKnotenA);
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
	public void setIDETCSKnotenA(ID_ETCS_Knoten_ohne_Proxy_TypeClass newIDETCSKnotenA) {
		if (newIDETCSKnotenA != iDETCSKnotenA) {
			NotificationChain msgs = null;
			if (iDETCSKnotenA != null)
				msgs = ((InternalEObject)iDETCSKnotenA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_A, null, msgs);
			if (newIDETCSKnotenA != null)
				msgs = ((InternalEObject)newIDETCSKnotenA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_A, null, msgs);
			msgs = basicSetIDETCSKnotenA(newIDETCSKnotenA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_A, newIDETCSKnotenA, newIDETCSKnotenA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ETCS_Knoten_ohne_Proxy_TypeClass getIDETCSKnotenB() {
		return iDETCSKnotenB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDETCSKnotenB(ID_ETCS_Knoten_ohne_Proxy_TypeClass newIDETCSKnotenB, NotificationChain msgs) {
		ID_ETCS_Knoten_ohne_Proxy_TypeClass oldIDETCSKnotenB = iDETCSKnotenB;
		iDETCSKnotenB = newIDETCSKnotenB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_B, oldIDETCSKnotenB, newIDETCSKnotenB);
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
	public void setIDETCSKnotenB(ID_ETCS_Knoten_ohne_Proxy_TypeClass newIDETCSKnotenB) {
		if (newIDETCSKnotenB != iDETCSKnotenB) {
			NotificationChain msgs = null;
			if (iDETCSKnotenB != null)
				msgs = ((InternalEObject)iDETCSKnotenB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_B, null, msgs);
			if (newIDETCSKnotenB != null)
				msgs = ((InternalEObject)newIDETCSKnotenB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_B, null, msgs);
			msgs = basicSetIDETCSKnotenB(newIDETCSKnotenB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_B, newIDETCSKnotenB, newIDETCSKnotenB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_RBC_TypeClass> getIDRBC() {
		if (iDRBC == null) {
			iDRBC = new EObjectContainmentEList<ID_RBC_TypeClass>(ID_RBC_TypeClass.class, this, Balisentechnik_ETCSPackage.ETCS_KANTE__IDRBC);
		}
		return iDRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_TOP_Kante_ohne_Proxy_TypeClass> getIDTOPKante() {
		if (iDTOPKante == null) {
			iDTOPKante = new EObjectContainmentEList<ID_TOP_Kante_ohne_Proxy_TypeClass>(ID_TOP_Kante_ohne_Proxy_TypeClass.class, this, Balisentechnik_ETCSPackage.ETCS_KANTE__IDTOP_KANTE);
		}
		return iDTOPKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_A:
				return basicSetIDETCSKnotenA(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_B:
				return basicSetIDETCSKnotenB(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDRBC:
				return ((InternalEList<?>)getIDRBC()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDTOP_KANTE:
				return ((InternalEList<?>)getIDTOPKante()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG:
				return getBezeichnung();
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_A:
				return getIDETCSKnotenA();
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_B:
				return getIDETCSKnotenB();
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDRBC:
				return getIDRBC();
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDTOP_KANTE:
				return getIDTOPKante();
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
			case Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG:
				setBezeichnung((ETCS_Kante_Bezeichnung_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_A:
				setIDETCSKnotenA((ID_ETCS_Knoten_ohne_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_B:
				setIDETCSKnotenB((ID_ETCS_Knoten_ohne_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDRBC:
				getIDRBC().clear();
				getIDRBC().addAll((Collection<? extends ID_RBC_TypeClass>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDTOP_KANTE:
				getIDTOPKante().clear();
				getIDTOPKante().addAll((Collection<? extends ID_TOP_Kante_ohne_Proxy_TypeClass>)newValue);
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
			case Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG:
				setBezeichnung((ETCS_Kante_Bezeichnung_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_A:
				setIDETCSKnotenA((ID_ETCS_Knoten_ohne_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_B:
				setIDETCSKnotenB((ID_ETCS_Knoten_ohne_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDRBC:
				getIDRBC().clear();
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDTOP_KANTE:
				getIDTOPKante().clear();
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
			case Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG:
				return bezeichnung != null;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_A:
				return iDETCSKnotenA != null;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_B:
				return iDETCSKnotenB != null;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDRBC:
				return iDRBC != null && !iDRBC.isEmpty();
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDTOP_KANTE:
				return iDTOPKante != null && !iDTOPKante.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ETCS_KanteImpl
