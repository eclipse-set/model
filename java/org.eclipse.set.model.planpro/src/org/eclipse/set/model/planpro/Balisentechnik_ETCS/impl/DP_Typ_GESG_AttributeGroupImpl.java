/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_ESG_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GESG_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Verlinkt_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Lfd_Nr_Am_Bezugspunkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DP Typ GESG Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DP_Typ_GESG_AttributeGroupImpl#getDPTypESG <em>DP Typ ESG</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DP_Typ_GESG_AttributeGroupImpl#getDPVerlinkt <em>DP Verlinkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DP_Typ_GESG_AttributeGroupImpl#getLfdNrAmBezugspunkt <em>Lfd Nr Am Bezugspunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DP_Typ_GESG_AttributeGroupImpl extends EObjectImpl implements DP_Typ_GESG_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDPTypESG() <em>DP Typ ESG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTypESG()
	 * @generated
	 * @ordered
	 */
	protected DP_Typ_ESG_TypeClass dPTypESG;

	/**
	 * The cached value of the '{@link #getDPVerlinkt() <em>DP Verlinkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPVerlinkt()
	 * @generated
	 * @ordered
	 */
	protected DP_Verlinkt_TypeClass dPVerlinkt;

	/**
	 * The cached value of the '{@link #getLfdNrAmBezugspunkt() <em>Lfd Nr Am Bezugspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLfdNrAmBezugspunkt()
	 * @generated
	 * @ordered
	 */
	protected Lfd_Nr_Am_Bezugspunkt_TypeClass lfdNrAmBezugspunkt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DP_Typ_GESG_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDP_Typ_GESG_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_ESG_TypeClass getDPTypESG() {
		return dPTypESG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPTypESG(DP_Typ_ESG_TypeClass newDPTypESG, NotificationChain msgs) {
		DP_Typ_ESG_TypeClass oldDPTypESG = dPTypESG;
		dPTypESG = newDPTypESG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG, oldDPTypESG, newDPTypESG);
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
	public void setDPTypESG(DP_Typ_ESG_TypeClass newDPTypESG) {
		if (newDPTypESG != dPTypESG) {
			NotificationChain msgs = null;
			if (dPTypESG != null)
				msgs = ((InternalEObject)dPTypESG).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG, null, msgs);
			if (newDPTypESG != null)
				msgs = ((InternalEObject)newDPTypESG).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG, null, msgs);
			msgs = basicSetDPTypESG(newDPTypESG, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG, newDPTypESG, newDPTypESG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Verlinkt_TypeClass getDPVerlinkt() {
		return dPVerlinkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPVerlinkt(DP_Verlinkt_TypeClass newDPVerlinkt, NotificationChain msgs) {
		DP_Verlinkt_TypeClass oldDPVerlinkt = dPVerlinkt;
		dPVerlinkt = newDPVerlinkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_VERLINKT, oldDPVerlinkt, newDPVerlinkt);
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
	public void setDPVerlinkt(DP_Verlinkt_TypeClass newDPVerlinkt) {
		if (newDPVerlinkt != dPVerlinkt) {
			NotificationChain msgs = null;
			if (dPVerlinkt != null)
				msgs = ((InternalEObject)dPVerlinkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_VERLINKT, null, msgs);
			if (newDPVerlinkt != null)
				msgs = ((InternalEObject)newDPVerlinkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_VERLINKT, null, msgs);
			msgs = basicSetDPVerlinkt(newDPVerlinkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_VERLINKT, newDPVerlinkt, newDPVerlinkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lfd_Nr_Am_Bezugspunkt_TypeClass getLfdNrAmBezugspunkt() {
		return lfdNrAmBezugspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLfdNrAmBezugspunkt(Lfd_Nr_Am_Bezugspunkt_TypeClass newLfdNrAmBezugspunkt, NotificationChain msgs) {
		Lfd_Nr_Am_Bezugspunkt_TypeClass oldLfdNrAmBezugspunkt = lfdNrAmBezugspunkt;
		lfdNrAmBezugspunkt = newLfdNrAmBezugspunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT, oldLfdNrAmBezugspunkt, newLfdNrAmBezugspunkt);
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
	public void setLfdNrAmBezugspunkt(Lfd_Nr_Am_Bezugspunkt_TypeClass newLfdNrAmBezugspunkt) {
		if (newLfdNrAmBezugspunkt != lfdNrAmBezugspunkt) {
			NotificationChain msgs = null;
			if (lfdNrAmBezugspunkt != null)
				msgs = ((InternalEObject)lfdNrAmBezugspunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT, null, msgs);
			if (newLfdNrAmBezugspunkt != null)
				msgs = ((InternalEObject)newLfdNrAmBezugspunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT, null, msgs);
			msgs = basicSetLfdNrAmBezugspunkt(newLfdNrAmBezugspunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT, newLfdNrAmBezugspunkt, newLfdNrAmBezugspunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG:
				return basicSetDPTypESG(null, msgs);
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_VERLINKT:
				return basicSetDPVerlinkt(null, msgs);
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT:
				return basicSetLfdNrAmBezugspunkt(null, msgs);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG:
				return getDPTypESG();
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_VERLINKT:
				return getDPVerlinkt();
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT:
				return getLfdNrAmBezugspunkt();
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
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG:
				setDPTypESG((DP_Typ_ESG_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_VERLINKT:
				setDPVerlinkt((DP_Verlinkt_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT:
				setLfdNrAmBezugspunkt((Lfd_Nr_Am_Bezugspunkt_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG:
				setDPTypESG((DP_Typ_ESG_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_VERLINKT:
				setDPVerlinkt((DP_Verlinkt_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT:
				setLfdNrAmBezugspunkt((Lfd_Nr_Am_Bezugspunkt_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_TYP_ESG:
				return dPTypESG != null;
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__DP_VERLINKT:
				return dPVerlinkt != null;
			case Balisentechnik_ETCSPackage.DP_TYP_GESG_ATTRIBUTE_GROUP__LFD_NR_AM_BEZUGSPUNKT:
				return lfdNrAmBezugspunkt != null;
		}
		return super.eIsSet(featureID);
	}

} //DP_Typ_GESG_AttributeGroupImpl
