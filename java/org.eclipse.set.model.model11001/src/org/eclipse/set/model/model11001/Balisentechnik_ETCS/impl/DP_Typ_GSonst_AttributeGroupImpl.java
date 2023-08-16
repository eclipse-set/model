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

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Anwendung_Sonst_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_Typ_GSonst_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_Typ_Sonst_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DP Typ GSonst Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.DP_Typ_GSonst_AttributeGroupImpl#getAnwendungSonst <em>Anwendung Sonst</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.DP_Typ_GSonst_AttributeGroupImpl#getDPTypSonst <em>DP Typ Sonst</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DP_Typ_GSonst_AttributeGroupImpl extends EObjectImpl implements DP_Typ_GSonst_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAnwendungSonst() <em>Anwendung Sonst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnwendungSonst()
	 * @generated
	 * @ordered
	 */
	protected Anwendung_Sonst_TypeClass anwendungSonst;

	/**
	 * The cached value of the '{@link #getDPTypSonst() <em>DP Typ Sonst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTypSonst()
	 * @generated
	 * @ordered
	 */
	protected DP_Typ_Sonst_TypeClass dPTypSonst;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DP_Typ_GSonst_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDP_Typ_GSonst_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anwendung_Sonst_TypeClass getAnwendungSonst() {
		return anwendungSonst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnwendungSonst(Anwendung_Sonst_TypeClass newAnwendungSonst, NotificationChain msgs) {
		Anwendung_Sonst_TypeClass oldAnwendungSonst = anwendungSonst;
		anwendungSonst = newAnwendungSonst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__ANWENDUNG_SONST, oldAnwendungSonst, newAnwendungSonst);
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
	public void setAnwendungSonst(Anwendung_Sonst_TypeClass newAnwendungSonst) {
		if (newAnwendungSonst != anwendungSonst) {
			NotificationChain msgs = null;
			if (anwendungSonst != null)
				msgs = ((InternalEObject)anwendungSonst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__ANWENDUNG_SONST, null, msgs);
			if (newAnwendungSonst != null)
				msgs = ((InternalEObject)newAnwendungSonst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__ANWENDUNG_SONST, null, msgs);
			msgs = basicSetAnwendungSonst(newAnwendungSonst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__ANWENDUNG_SONST, newAnwendungSonst, newAnwendungSonst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_Sonst_TypeClass getDPTypSonst() {
		return dPTypSonst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPTypSonst(DP_Typ_Sonst_TypeClass newDPTypSonst, NotificationChain msgs) {
		DP_Typ_Sonst_TypeClass oldDPTypSonst = dPTypSonst;
		dPTypSonst = newDPTypSonst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__DP_TYP_SONST, oldDPTypSonst, newDPTypSonst);
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
	public void setDPTypSonst(DP_Typ_Sonst_TypeClass newDPTypSonst) {
		if (newDPTypSonst != dPTypSonst) {
			NotificationChain msgs = null;
			if (dPTypSonst != null)
				msgs = ((InternalEObject)dPTypSonst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__DP_TYP_SONST, null, msgs);
			if (newDPTypSonst != null)
				msgs = ((InternalEObject)newDPTypSonst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__DP_TYP_SONST, null, msgs);
			msgs = basicSetDPTypSonst(newDPTypSonst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__DP_TYP_SONST, newDPTypSonst, newDPTypSonst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__ANWENDUNG_SONST:
				return basicSetAnwendungSonst(null, msgs);
			case Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__DP_TYP_SONST:
				return basicSetDPTypSonst(null, msgs);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__ANWENDUNG_SONST:
				return getAnwendungSonst();
			case Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__DP_TYP_SONST:
				return getDPTypSonst();
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
			case Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__ANWENDUNG_SONST:
				setAnwendungSonst((Anwendung_Sonst_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__DP_TYP_SONST:
				setDPTypSonst((DP_Typ_Sonst_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__ANWENDUNG_SONST:
				setAnwendungSonst((Anwendung_Sonst_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__DP_TYP_SONST:
				setDPTypSonst((DP_Typ_Sonst_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__ANWENDUNG_SONST:
				return anwendungSonst != null;
			case Balisentechnik_ETCSPackage.DP_TYP_GSONST_ATTRIBUTE_GROUP__DP_TYP_SONST:
				return dPTypSonst != null;
		}
		return super.eIsSet(featureID);
	}

} //DP_Typ_GSonst_AttributeGroupImpl
