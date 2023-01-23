/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.ATO.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.ATO.ATOPackage;
import org.eclipse.set.model.model11001.ATO.ATO_Timing_Point;
import org.eclipse.set.model.model11001.ATO.ATO_Timing_Point_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.ATO.ATO_Timing_Point_Bezeichnung_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.model.model11001.Verweise.ID_Signal_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATO Timing Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.ATO.impl.ATO_Timing_PointImpl#getATOTimingPointAllg <em>ATO Timing Point Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.ATO.impl.ATO_Timing_PointImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.ATO.impl.ATO_Timing_PointImpl#getIDSignal <em>ID Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ATO_Timing_PointImpl extends Punkt_ObjektImpl implements ATO_Timing_Point {
	/**
	 * The cached value of the '{@link #getATOTimingPointAllg() <em>ATO Timing Point Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATOTimingPointAllg()
	 * @generated
	 * @ordered
	 */
	protected ATO_Timing_Point_Allg_AttributeGroup aTOTimingPointAllg;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected ATO_Timing_Point_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDSignal() <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignal()
	 * @generated
	 * @ordered
	 */
	protected ID_Signal_ohne_Proxy_TypeClass iDSignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATO_Timing_PointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ATOPackage.Literals.ATO_TIMING_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATO_Timing_Point_Allg_AttributeGroup getATOTimingPointAllg() {
		return aTOTimingPointAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATOTimingPointAllg(ATO_Timing_Point_Allg_AttributeGroup newATOTimingPointAllg, NotificationChain msgs) {
		ATO_Timing_Point_Allg_AttributeGroup oldATOTimingPointAllg = aTOTimingPointAllg;
		aTOTimingPointAllg = newATOTimingPointAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG, oldATOTimingPointAllg, newATOTimingPointAllg);
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
	public void setATOTimingPointAllg(ATO_Timing_Point_Allg_AttributeGroup newATOTimingPointAllg) {
		if (newATOTimingPointAllg != aTOTimingPointAllg) {
			NotificationChain msgs = null;
			if (aTOTimingPointAllg != null)
				msgs = ((InternalEObject)aTOTimingPointAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG, null, msgs);
			if (newATOTimingPointAllg != null)
				msgs = ((InternalEObject)newATOTimingPointAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG, null, msgs);
			msgs = basicSetATOTimingPointAllg(newATOTimingPointAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG, newATOTimingPointAllg, newATOTimingPointAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATO_Timing_Point_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(ATO_Timing_Point_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		ATO_Timing_Point_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(ATO_Timing_Point_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Signal_ohne_Proxy_TypeClass getIDSignal() {
		return iDSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDSignal(ID_Signal_ohne_Proxy_TypeClass newIDSignal, NotificationChain msgs) {
		ID_Signal_ohne_Proxy_TypeClass oldIDSignal = iDSignal;
		iDSignal = newIDSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT__ID_SIGNAL, oldIDSignal, newIDSignal);
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
	public void setIDSignal(ID_Signal_ohne_Proxy_TypeClass newIDSignal) {
		if (newIDSignal != iDSignal) {
			NotificationChain msgs = null;
			if (iDSignal != null)
				msgs = ((InternalEObject)iDSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT__ID_SIGNAL, null, msgs);
			if (newIDSignal != null)
				msgs = ((InternalEObject)newIDSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT__ID_SIGNAL, null, msgs);
			msgs = basicSetIDSignal(newIDSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT__ID_SIGNAL, newIDSignal, newIDSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG:
				return basicSetATOTimingPointAllg(null, msgs);
			case ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case ATOPackage.ATO_TIMING_POINT__ID_SIGNAL:
				return basicSetIDSignal(null, msgs);
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
			case ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG:
				return getATOTimingPointAllg();
			case ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG:
				return getBezeichnung();
			case ATOPackage.ATO_TIMING_POINT__ID_SIGNAL:
				return getIDSignal();
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
			case ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG:
				setATOTimingPointAllg((ATO_Timing_Point_Allg_AttributeGroup)newValue);
				return;
			case ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG:
				setBezeichnung((ATO_Timing_Point_Bezeichnung_AttributeGroup)newValue);
				return;
			case ATOPackage.ATO_TIMING_POINT__ID_SIGNAL:
				setIDSignal((ID_Signal_ohne_Proxy_TypeClass)newValue);
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
			case ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG:
				setATOTimingPointAllg((ATO_Timing_Point_Allg_AttributeGroup)null);
				return;
			case ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG:
				setBezeichnung((ATO_Timing_Point_Bezeichnung_AttributeGroup)null);
				return;
			case ATOPackage.ATO_TIMING_POINT__ID_SIGNAL:
				setIDSignal((ID_Signal_ohne_Proxy_TypeClass)null);
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
			case ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG:
				return aTOTimingPointAllg != null;
			case ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG:
				return bezeichnung != null;
			case ATOPackage.ATO_TIMING_POINT__ID_SIGNAL:
				return iDSignal != null;
		}
		return super.eIsSet(featureID);
	}

} //ATO_Timing_PointImpl
