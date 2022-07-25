/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Bezug_Betrieblich_Art_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Bezug_Betrieblich_AttributeGroup;

import org.eclipse.set.model.model1902.Verweise.ID_DP_Bezugspunkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DP Bezug Betrieblich Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.DP_Bezug_Betrieblich_AttributeGroupImpl#getDPBezugBetrieblichArt <em>DP Bezug Betrieblich Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.DP_Bezug_Betrieblich_AttributeGroupImpl#getIDDPBezugspunkt <em>IDDP Bezugspunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DP_Bezug_Betrieblich_AttributeGroupImpl extends MinimalEObjectImpl.Container implements DP_Bezug_Betrieblich_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDPBezugBetrieblichArt() <em>DP Bezug Betrieblich Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPBezugBetrieblichArt()
	 * @generated
	 * @ordered
	 */
	protected DP_Bezug_Betrieblich_Art_TypeClass dPBezugBetrieblichArt;

	/**
	 * The cached value of the '{@link #getIDDPBezugspunkt() <em>IDDP Bezugspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDDPBezugspunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_DP_Bezugspunkt_TypeClass iDDPBezugspunkt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DP_Bezug_Betrieblich_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDP_Bezug_Betrieblich_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Bezug_Betrieblich_Art_TypeClass getDPBezugBetrieblichArt() {
		return dPBezugBetrieblichArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPBezugBetrieblichArt(DP_Bezug_Betrieblich_Art_TypeClass newDPBezugBetrieblichArt, NotificationChain msgs) {
		DP_Bezug_Betrieblich_Art_TypeClass oldDPBezugBetrieblichArt = dPBezugBetrieblichArt;
		dPBezugBetrieblichArt = newDPBezugBetrieblichArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART, oldDPBezugBetrieblichArt, newDPBezugBetrieblichArt);
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
	public void setDPBezugBetrieblichArt(DP_Bezug_Betrieblich_Art_TypeClass newDPBezugBetrieblichArt) {
		if (newDPBezugBetrieblichArt != dPBezugBetrieblichArt) {
			NotificationChain msgs = null;
			if (dPBezugBetrieblichArt != null)
				msgs = ((InternalEObject)dPBezugBetrieblichArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART, null, msgs);
			if (newDPBezugBetrieblichArt != null)
				msgs = ((InternalEObject)newDPBezugBetrieblichArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART, null, msgs);
			msgs = basicSetDPBezugBetrieblichArt(newDPBezugBetrieblichArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART, newDPBezugBetrieblichArt, newDPBezugBetrieblichArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_DP_Bezugspunkt_TypeClass getIDDPBezugspunkt() {
		return iDDPBezugspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDDPBezugspunkt(ID_DP_Bezugspunkt_TypeClass newIDDPBezugspunkt, NotificationChain msgs) {
		ID_DP_Bezugspunkt_TypeClass oldIDDPBezugspunkt = iDDPBezugspunkt;
		iDDPBezugspunkt = newIDDPBezugspunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__IDDP_BEZUGSPUNKT, oldIDDPBezugspunkt, newIDDPBezugspunkt);
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
	public void setIDDPBezugspunkt(ID_DP_Bezugspunkt_TypeClass newIDDPBezugspunkt) {
		if (newIDDPBezugspunkt != iDDPBezugspunkt) {
			NotificationChain msgs = null;
			if (iDDPBezugspunkt != null)
				msgs = ((InternalEObject)iDDPBezugspunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__IDDP_BEZUGSPUNKT, null, msgs);
			if (newIDDPBezugspunkt != null)
				msgs = ((InternalEObject)newIDDPBezugspunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__IDDP_BEZUGSPUNKT, null, msgs);
			msgs = basicSetIDDPBezugspunkt(newIDDPBezugspunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__IDDP_BEZUGSPUNKT, newIDDPBezugspunkt, newIDDPBezugspunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART:
				return basicSetDPBezugBetrieblichArt(null, msgs);
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__IDDP_BEZUGSPUNKT:
				return basicSetIDDPBezugspunkt(null, msgs);
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
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART:
				return getDPBezugBetrieblichArt();
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__IDDP_BEZUGSPUNKT:
				return getIDDPBezugspunkt();
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
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART:
				setDPBezugBetrieblichArt((DP_Bezug_Betrieblich_Art_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__IDDP_BEZUGSPUNKT:
				setIDDPBezugspunkt((ID_DP_Bezugspunkt_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART:
				setDPBezugBetrieblichArt((DP_Bezug_Betrieblich_Art_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__IDDP_BEZUGSPUNKT:
				setIDDPBezugspunkt((ID_DP_Bezugspunkt_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART:
				return dPBezugBetrieblichArt != null;
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__IDDP_BEZUGSPUNKT:
				return iDDPBezugspunkt != null;
		}
		return super.eIsSet(featureID);
	}

} //DP_Bezug_Betrieblich_AttributeGroupImpl
