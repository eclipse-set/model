/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Ur_ObjektImpl;

import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;
import org.eclipse.set.model.planpro.PlanPro.Planung_Gruppe;
import org.eclipse.set.model.planpro.PlanPro.Planung_P_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.Planung_Projekt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planung Projekt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_ProjektImpl#getLSTPlanungGruppe <em>LST Planung Gruppe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_ProjektImpl#getPlanungPAllg <em>Planung PAllg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Planung_ProjektImpl extends Ur_ObjektImpl implements Planung_Projekt {
	/**
	 * The cached value of the '{@link #getLSTPlanungGruppe() <em>LST Planung Gruppe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLSTPlanungGruppe()
	 * @generated
	 * @ordered
	 */
	protected EList<Planung_Gruppe> lSTPlanungGruppe;

	/**
	 * The cached value of the '{@link #getPlanungPAllg() <em>Planung PAllg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungPAllg()
	 * @generated
	 * @ordered
	 */
	protected Planung_P_Allg_AttributeGroup planungPAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Planung_ProjektImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getPlanung_Projekt();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Planung_Gruppe> getLSTPlanungGruppe() {
		if (lSTPlanungGruppe == null) {
			lSTPlanungGruppe = new EObjectContainmentEList<Planung_Gruppe>(Planung_Gruppe.class, this, PlanProPackage.PLANUNG_PROJEKT__LST_PLANUNG_GRUPPE);
		}
		return lSTPlanungGruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_P_Allg_AttributeGroup getPlanungPAllg() {
		return planungPAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanungPAllg(Planung_P_Allg_AttributeGroup newPlanungPAllg, NotificationChain msgs) {
		Planung_P_Allg_AttributeGroup oldPlanungPAllg = planungPAllg;
		planungPAllg = newPlanungPAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_PROJEKT__PLANUNG_PALLG, oldPlanungPAllg, newPlanungPAllg);
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
	public void setPlanungPAllg(Planung_P_Allg_AttributeGroup newPlanungPAllg) {
		if (newPlanungPAllg != planungPAllg) {
			NotificationChain msgs = null;
			if (planungPAllg != null)
				msgs = ((InternalEObject)planungPAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_PROJEKT__PLANUNG_PALLG, null, msgs);
			if (newPlanungPAllg != null)
				msgs = ((InternalEObject)newPlanungPAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_PROJEKT__PLANUNG_PALLG, null, msgs);
			msgs = basicSetPlanungPAllg(newPlanungPAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_PROJEKT__PLANUNG_PALLG, newPlanungPAllg, newPlanungPAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.PLANUNG_PROJEKT__LST_PLANUNG_GRUPPE:
				return ((InternalEList<?>)getLSTPlanungGruppe()).basicRemove(otherEnd, msgs);
			case PlanProPackage.PLANUNG_PROJEKT__PLANUNG_PALLG:
				return basicSetPlanungPAllg(null, msgs);
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
			case PlanProPackage.PLANUNG_PROJEKT__LST_PLANUNG_GRUPPE:
				return getLSTPlanungGruppe();
			case PlanProPackage.PLANUNG_PROJEKT__PLANUNG_PALLG:
				return getPlanungPAllg();
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
			case PlanProPackage.PLANUNG_PROJEKT__LST_PLANUNG_GRUPPE:
				getLSTPlanungGruppe().clear();
				getLSTPlanungGruppe().addAll((Collection<? extends Planung_Gruppe>)newValue);
				return;
			case PlanProPackage.PLANUNG_PROJEKT__PLANUNG_PALLG:
				setPlanungPAllg((Planung_P_Allg_AttributeGroup)newValue);
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
			case PlanProPackage.PLANUNG_PROJEKT__LST_PLANUNG_GRUPPE:
				getLSTPlanungGruppe().clear();
				return;
			case PlanProPackage.PLANUNG_PROJEKT__PLANUNG_PALLG:
				setPlanungPAllg((Planung_P_Allg_AttributeGroup)null);
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
			case PlanProPackage.PLANUNG_PROJEKT__LST_PLANUNG_GRUPPE:
				return lSTPlanungGruppe != null && !lSTPlanungGruppe.isEmpty();
			case PlanProPackage.PLANUNG_PROJEKT__PLANUNG_PALLG:
				return planungPAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //Planung_ProjektImpl
