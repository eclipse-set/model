/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Ur_ObjektImpl;

import org.eclipse.set.model.model1902.PlanPro.LST_Planung_AttributeGroup;
import org.eclipse.set.model.model1902.PlanPro.LST_Zustand;
import org.eclipse.set.model.model1902.PlanPro.PlanProPackage;
import org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle;
import org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle_Allg_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Pro Schnittstelle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.PlanPro_SchnittstelleImpl#getPlanProSchnittstelleAllg <em>Plan Pro Schnittstelle Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.PlanPro_SchnittstelleImpl#getLSTPlanung <em>LST Planung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.PlanPro_SchnittstelleImpl#getLSTZustand <em>LST Zustand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanPro_SchnittstelleImpl extends Ur_ObjektImpl implements PlanPro_Schnittstelle {
	/**
	 * The cached value of the '{@link #getPlanProSchnittstelleAllg() <em>Plan Pro Schnittstelle Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanProSchnittstelleAllg()
	 * @generated
	 * @ordered
	 */
	protected PlanPro_Schnittstelle_Allg_AttributeGroup planProSchnittstelleAllg;

	/**
	 * The cached value of the '{@link #getLSTPlanung() <em>LST Planung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLSTPlanung()
	 * @generated
	 * @ordered
	 */
	protected LST_Planung_AttributeGroup lSTPlanung;

	/**
	 * The cached value of the '{@link #getLSTZustand() <em>LST Zustand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLSTZustand()
	 * @generated
	 * @ordered
	 */
	protected LST_Zustand lSTZustand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanPro_SchnittstelleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getPlanPro_Schnittstelle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanPro_Schnittstelle_Allg_AttributeGroup getPlanProSchnittstelleAllg() {
		return planProSchnittstelleAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanProSchnittstelleAllg(PlanPro_Schnittstelle_Allg_AttributeGroup newPlanProSchnittstelleAllg, NotificationChain msgs) {
		PlanPro_Schnittstelle_Allg_AttributeGroup oldPlanProSchnittstelleAllg = planProSchnittstelleAllg;
		planProSchnittstelleAllg = newPlanProSchnittstelleAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG, oldPlanProSchnittstelleAllg, newPlanProSchnittstelleAllg);
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
	public void setPlanProSchnittstelleAllg(PlanPro_Schnittstelle_Allg_AttributeGroup newPlanProSchnittstelleAllg) {
		if (newPlanProSchnittstelleAllg != planProSchnittstelleAllg) {
			NotificationChain msgs = null;
			if (planProSchnittstelleAllg != null)
				msgs = ((InternalEObject)planProSchnittstelleAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG, null, msgs);
			if (newPlanProSchnittstelleAllg != null)
				msgs = ((InternalEObject)newPlanProSchnittstelleAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG, null, msgs);
			msgs = basicSetPlanProSchnittstelleAllg(newPlanProSchnittstelleAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG, newPlanProSchnittstelleAllg, newPlanProSchnittstelleAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LST_Planung_AttributeGroup getLSTPlanung() {
		return lSTPlanung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLSTPlanung(LST_Planung_AttributeGroup newLSTPlanung, NotificationChain msgs) {
		LST_Planung_AttributeGroup oldLSTPlanung = lSTPlanung;
		lSTPlanung = newLSTPlanung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG, oldLSTPlanung, newLSTPlanung);
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
	public void setLSTPlanung(LST_Planung_AttributeGroup newLSTPlanung) {
		if (newLSTPlanung != lSTPlanung) {
			NotificationChain msgs = null;
			if (lSTPlanung != null)
				msgs = ((InternalEObject)lSTPlanung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG, null, msgs);
			if (newLSTPlanung != null)
				msgs = ((InternalEObject)newLSTPlanung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG, null, msgs);
			msgs = basicSetLSTPlanung(newLSTPlanung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG, newLSTPlanung, newLSTPlanung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LST_Zustand getLSTZustand() {
		return lSTZustand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLSTZustand(LST_Zustand newLSTZustand, NotificationChain msgs) {
		LST_Zustand oldLSTZustand = lSTZustand;
		lSTZustand = newLSTZustand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND, oldLSTZustand, newLSTZustand);
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
	public void setLSTZustand(LST_Zustand newLSTZustand) {
		if (newLSTZustand != lSTZustand) {
			NotificationChain msgs = null;
			if (lSTZustand != null)
				msgs = ((InternalEObject)lSTZustand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND, null, msgs);
			if (newLSTZustand != null)
				msgs = ((InternalEObject)newLSTZustand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND, null, msgs);
			msgs = basicSetLSTZustand(newLSTZustand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND, newLSTZustand, newLSTZustand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG:
				return basicSetPlanProSchnittstelleAllg(null, msgs);
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG:
				return basicSetLSTPlanung(null, msgs);
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND:
				return basicSetLSTZustand(null, msgs);
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
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG:
				return getPlanProSchnittstelleAllg();
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG:
				return getLSTPlanung();
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND:
				return getLSTZustand();
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
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG:
				setPlanProSchnittstelleAllg((PlanPro_Schnittstelle_Allg_AttributeGroup)newValue);
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG:
				setLSTPlanung((LST_Planung_AttributeGroup)newValue);
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND:
				setLSTZustand((LST_Zustand)newValue);
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
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG:
				setPlanProSchnittstelleAllg((PlanPro_Schnittstelle_Allg_AttributeGroup)null);
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG:
				setLSTPlanung((LST_Planung_AttributeGroup)null);
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND:
				setLSTZustand((LST_Zustand)null);
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
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG:
				return planProSchnittstelleAllg != null;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG:
				return lSTPlanung != null;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND:
				return lSTZustand != null;
		}
		return super.eIsSet(featureID);
	}

} //PlanPro_SchnittstelleImpl
