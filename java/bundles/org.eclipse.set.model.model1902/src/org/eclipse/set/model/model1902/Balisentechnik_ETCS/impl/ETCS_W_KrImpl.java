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
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_W_Kr;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_W_Kr_MUKA_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_W_Ortsgestellt_TypeClass;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_ETCS_Knoten_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_RBC_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_W_Kr_Anlage_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETCS WKr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ETCS_W_KrImpl#getIDETCSKnoten <em>IDETCS Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ETCS_W_KrImpl#getIDRBC <em>IDRBC</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ETCS_W_KrImpl#getIDWKrAnlage <em>IDW Kr Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ETCS_W_KrImpl#getETCSWKrMUKA <em>ETCSW Kr MUKA</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ETCS_W_KrImpl#getETCSWOrtsgestellt <em>ETCSW Ortsgestellt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETCS_W_KrImpl extends Basis_ObjektImpl implements ETCS_W_Kr {
	/**
	 * The cached value of the '{@link #getIDETCSKnoten() <em>IDETCS Knoten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDETCSKnoten()
	 * @generated
	 * @ordered
	 */
	protected ID_ETCS_Knoten_ohne_Proxy_TypeClass iDETCSKnoten;

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
	 * The cached value of the '{@link #getIDWKrAnlage() <em>IDW Kr Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDWKrAnlage()
	 * @generated
	 * @ordered
	 */
	protected ID_W_Kr_Anlage_ohne_Proxy_TypeClass iDWKrAnlage;

	/**
	 * The cached value of the '{@link #getETCSWKrMUKA() <em>ETCSW Kr MUKA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSWKrMUKA()
	 * @generated
	 * @ordered
	 */
	protected ETCS_W_Kr_MUKA_AttributeGroup eTCSWKrMUKA;

	/**
	 * The cached value of the '{@link #getETCSWOrtsgestellt() <em>ETCSW Ortsgestellt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSWOrtsgestellt()
	 * @generated
	 * @ordered
	 */
	protected ETCS_W_Ortsgestellt_TypeClass eTCSWOrtsgestellt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETCS_W_KrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getETCS_W_Kr();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ETCS_Knoten_ohne_Proxy_TypeClass getIDETCSKnoten() {
		return iDETCSKnoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDETCSKnoten(ID_ETCS_Knoten_ohne_Proxy_TypeClass newIDETCSKnoten, NotificationChain msgs) {
		ID_ETCS_Knoten_ohne_Proxy_TypeClass oldIDETCSKnoten = iDETCSKnoten;
		iDETCSKnoten = newIDETCSKnoten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_KNOTEN, oldIDETCSKnoten, newIDETCSKnoten);
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
	public void setIDETCSKnoten(ID_ETCS_Knoten_ohne_Proxy_TypeClass newIDETCSKnoten) {
		if (newIDETCSKnoten != iDETCSKnoten) {
			NotificationChain msgs = null;
			if (iDETCSKnoten != null)
				msgs = ((InternalEObject)iDETCSKnoten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_KNOTEN, null, msgs);
			if (newIDETCSKnoten != null)
				msgs = ((InternalEObject)newIDETCSKnoten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_KNOTEN, null, msgs);
			msgs = basicSetIDETCSKnoten(newIDETCSKnoten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_KNOTEN, newIDETCSKnoten, newIDETCSKnoten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_RBC_TypeClass> getIDRBC() {
		if (iDRBC == null) {
			iDRBC = new EObjectContainmentEList<ID_RBC_TypeClass>(ID_RBC_TypeClass.class, this, Balisentechnik_ETCSPackage.ETCS_WKR__IDRBC);
		}
		return iDRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_W_Kr_Anlage_ohne_Proxy_TypeClass getIDWKrAnlage() {
		return iDWKrAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDWKrAnlage(ID_W_Kr_Anlage_ohne_Proxy_TypeClass newIDWKrAnlage, NotificationChain msgs) {
		ID_W_Kr_Anlage_ohne_Proxy_TypeClass oldIDWKrAnlage = iDWKrAnlage;
		iDWKrAnlage = newIDWKrAnlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_WKR__IDW_KR_ANLAGE, oldIDWKrAnlage, newIDWKrAnlage);
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
	public void setIDWKrAnlage(ID_W_Kr_Anlage_ohne_Proxy_TypeClass newIDWKrAnlage) {
		if (newIDWKrAnlage != iDWKrAnlage) {
			NotificationChain msgs = null;
			if (iDWKrAnlage != null)
				msgs = ((InternalEObject)iDWKrAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_WKR__IDW_KR_ANLAGE, null, msgs);
			if (newIDWKrAnlage != null)
				msgs = ((InternalEObject)newIDWKrAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_WKR__IDW_KR_ANLAGE, null, msgs);
			msgs = basicSetIDWKrAnlage(newIDWKrAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_WKR__IDW_KR_ANLAGE, newIDWKrAnlage, newIDWKrAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_W_Kr_MUKA_AttributeGroup getETCSWKrMUKA() {
		return eTCSWKrMUKA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSWKrMUKA(ETCS_W_Kr_MUKA_AttributeGroup newETCSWKrMUKA, NotificationChain msgs) {
		ETCS_W_Kr_MUKA_AttributeGroup oldETCSWKrMUKA = eTCSWKrMUKA;
		eTCSWKrMUKA = newETCSWKrMUKA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA, oldETCSWKrMUKA, newETCSWKrMUKA);
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
	public void setETCSWKrMUKA(ETCS_W_Kr_MUKA_AttributeGroup newETCSWKrMUKA) {
		if (newETCSWKrMUKA != eTCSWKrMUKA) {
			NotificationChain msgs = null;
			if (eTCSWKrMUKA != null)
				msgs = ((InternalEObject)eTCSWKrMUKA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA, null, msgs);
			if (newETCSWKrMUKA != null)
				msgs = ((InternalEObject)newETCSWKrMUKA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA, null, msgs);
			msgs = basicSetETCSWKrMUKA(newETCSWKrMUKA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA, newETCSWKrMUKA, newETCSWKrMUKA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_W_Ortsgestellt_TypeClass getETCSWOrtsgestellt() {
		return eTCSWOrtsgestellt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSWOrtsgestellt(ETCS_W_Ortsgestellt_TypeClass newETCSWOrtsgestellt, NotificationChain msgs) {
		ETCS_W_Ortsgestellt_TypeClass oldETCSWOrtsgestellt = eTCSWOrtsgestellt;
		eTCSWOrtsgestellt = newETCSWOrtsgestellt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_ORTSGESTELLT, oldETCSWOrtsgestellt, newETCSWOrtsgestellt);
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
	public void setETCSWOrtsgestellt(ETCS_W_Ortsgestellt_TypeClass newETCSWOrtsgestellt) {
		if (newETCSWOrtsgestellt != eTCSWOrtsgestellt) {
			NotificationChain msgs = null;
			if (eTCSWOrtsgestellt != null)
				msgs = ((InternalEObject)eTCSWOrtsgestellt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_ORTSGESTELLT, null, msgs);
			if (newETCSWOrtsgestellt != null)
				msgs = ((InternalEObject)newETCSWOrtsgestellt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_ORTSGESTELLT, null, msgs);
			msgs = basicSetETCSWOrtsgestellt(newETCSWOrtsgestellt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_ORTSGESTELLT, newETCSWOrtsgestellt, newETCSWOrtsgestellt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_KNOTEN:
				return basicSetIDETCSKnoten(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDRBC:
				return ((InternalEList<?>)getIDRBC()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDW_KR_ANLAGE:
				return basicSetIDWKrAnlage(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA:
				return basicSetETCSWKrMUKA(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_ORTSGESTELLT:
				return basicSetETCSWOrtsgestellt(null, msgs);
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
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_KNOTEN:
				return getIDETCSKnoten();
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDRBC:
				return getIDRBC();
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDW_KR_ANLAGE:
				return getIDWKrAnlage();
			case Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA:
				return getETCSWKrMUKA();
			case Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_ORTSGESTELLT:
				return getETCSWOrtsgestellt();
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
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_KNOTEN:
				setIDETCSKnoten((ID_ETCS_Knoten_ohne_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDRBC:
				getIDRBC().clear();
				getIDRBC().addAll((Collection<? extends ID_RBC_TypeClass>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDW_KR_ANLAGE:
				setIDWKrAnlage((ID_W_Kr_Anlage_ohne_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA:
				setETCSWKrMUKA((ETCS_W_Kr_MUKA_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_ORTSGESTELLT:
				setETCSWOrtsgestellt((ETCS_W_Ortsgestellt_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_KNOTEN:
				setIDETCSKnoten((ID_ETCS_Knoten_ohne_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDRBC:
				getIDRBC().clear();
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDW_KR_ANLAGE:
				setIDWKrAnlage((ID_W_Kr_Anlage_ohne_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA:
				setETCSWKrMUKA((ETCS_W_Kr_MUKA_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_ORTSGESTELLT:
				setETCSWOrtsgestellt((ETCS_W_Ortsgestellt_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_KNOTEN:
				return iDETCSKnoten != null;
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDRBC:
				return iDRBC != null && !iDRBC.isEmpty();
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDW_KR_ANLAGE:
				return iDWKrAnlage != null;
			case Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA:
				return eTCSWKrMUKA != null;
			case Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_ORTSGESTELLT:
				return eTCSWOrtsgestellt != null;
		}
		return super.eIsSet(featureID);
	}

} //ETCS_W_KrImpl
