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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Ur_ObjektImpl;

import org.eclipse.set.model.planpro.PlanPro.Fuehrende_Oertlichkeit_TypeClass;
import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;
import org.eclipse.set.model.planpro.PlanPro.Planung_Einzel;
import org.eclipse.set.model.planpro.PlanPro.Planung_G_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.Planung_G_Fuehrende_Strecke_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.Planung_G_Schriftfeld_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.Planung_Gruppe;
import org.eclipse.set.model.planpro.PlanPro.Polygone_Betrachtungsbereich_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.Polygone_Planungsbereich_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planung Gruppe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_GruppeImpl#getFuehrendeOertlichkeit <em>Fuehrende Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_GruppeImpl#getLSTPlanungEinzel <em>LST Planung Einzel</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_GruppeImpl#getPlanungGAllg <em>Planung GAllg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_GruppeImpl#getPlanungGFuehrendeStrecke <em>Planung GFuehrende Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_GruppeImpl#getPlanungGSchriftfeld <em>Planung GSchriftfeld</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_GruppeImpl#getPolygoneBetrachtungsbereich <em>Polygone Betrachtungsbereich</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.impl.Planung_GruppeImpl#getPolygonePlanungsbereich <em>Polygone Planungsbereich</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Planung_GruppeImpl extends Ur_ObjektImpl implements Planung_Gruppe {
	/**
	 * The cached value of the '{@link #getFuehrendeOertlichkeit() <em>Fuehrende Oertlichkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuehrendeOertlichkeit()
	 * @generated
	 * @ordered
	 */
	protected Fuehrende_Oertlichkeit_TypeClass fuehrendeOertlichkeit;

	/**
	 * The cached value of the '{@link #getLSTPlanungEinzel() <em>LST Planung Einzel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLSTPlanungEinzel()
	 * @generated
	 * @ordered
	 */
	protected Planung_Einzel lSTPlanungEinzel;

	/**
	 * The cached value of the '{@link #getPlanungGAllg() <em>Planung GAllg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungGAllg()
	 * @generated
	 * @ordered
	 */
	protected Planung_G_Allg_AttributeGroup planungGAllg;

	/**
	 * The cached value of the '{@link #getPlanungGFuehrendeStrecke() <em>Planung GFuehrende Strecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungGFuehrendeStrecke()
	 * @generated
	 * @ordered
	 */
	protected Planung_G_Fuehrende_Strecke_AttributeGroup planungGFuehrendeStrecke;

	/**
	 * The cached value of the '{@link #getPlanungGSchriftfeld() <em>Planung GSchriftfeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungGSchriftfeld()
	 * @generated
	 * @ordered
	 */
	protected Planung_G_Schriftfeld_AttributeGroup planungGSchriftfeld;

	/**
	 * The cached value of the '{@link #getPolygoneBetrachtungsbereich() <em>Polygone Betrachtungsbereich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygoneBetrachtungsbereich()
	 * @generated
	 * @ordered
	 */
	protected Polygone_Betrachtungsbereich_AttributeGroup polygoneBetrachtungsbereich;

	/**
	 * The cached value of the '{@link #getPolygonePlanungsbereich() <em>Polygone Planungsbereich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonePlanungsbereich()
	 * @generated
	 * @ordered
	 */
	protected Polygone_Planungsbereich_AttributeGroup polygonePlanungsbereich;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Planung_GruppeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getPlanung_Gruppe();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fuehrende_Oertlichkeit_TypeClass getFuehrendeOertlichkeit() {
		return fuehrendeOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuehrendeOertlichkeit(Fuehrende_Oertlichkeit_TypeClass newFuehrendeOertlichkeit, NotificationChain msgs) {
		Fuehrende_Oertlichkeit_TypeClass oldFuehrendeOertlichkeit = fuehrendeOertlichkeit;
		fuehrendeOertlichkeit = newFuehrendeOertlichkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GRUPPE__FUEHRENDE_OERTLICHKEIT, oldFuehrendeOertlichkeit, newFuehrendeOertlichkeit);
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
	public void setFuehrendeOertlichkeit(Fuehrende_Oertlichkeit_TypeClass newFuehrendeOertlichkeit) {
		if (newFuehrendeOertlichkeit != fuehrendeOertlichkeit) {
			NotificationChain msgs = null;
			if (fuehrendeOertlichkeit != null)
				msgs = ((InternalEObject)fuehrendeOertlichkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GRUPPE__FUEHRENDE_OERTLICHKEIT, null, msgs);
			if (newFuehrendeOertlichkeit != null)
				msgs = ((InternalEObject)newFuehrendeOertlichkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GRUPPE__FUEHRENDE_OERTLICHKEIT, null, msgs);
			msgs = basicSetFuehrendeOertlichkeit(newFuehrendeOertlichkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GRUPPE__FUEHRENDE_OERTLICHKEIT, newFuehrendeOertlichkeit, newFuehrendeOertlichkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_Einzel getLSTPlanungEinzel() {
		return lSTPlanungEinzel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLSTPlanungEinzel(Planung_Einzel newLSTPlanungEinzel, NotificationChain msgs) {
		Planung_Einzel oldLSTPlanungEinzel = lSTPlanungEinzel;
		lSTPlanungEinzel = newLSTPlanungEinzel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GRUPPE__LST_PLANUNG_EINZEL, oldLSTPlanungEinzel, newLSTPlanungEinzel);
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
	public void setLSTPlanungEinzel(Planung_Einzel newLSTPlanungEinzel) {
		if (newLSTPlanungEinzel != lSTPlanungEinzel) {
			NotificationChain msgs = null;
			if (lSTPlanungEinzel != null)
				msgs = ((InternalEObject)lSTPlanungEinzel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GRUPPE__LST_PLANUNG_EINZEL, null, msgs);
			if (newLSTPlanungEinzel != null)
				msgs = ((InternalEObject)newLSTPlanungEinzel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GRUPPE__LST_PLANUNG_EINZEL, null, msgs);
			msgs = basicSetLSTPlanungEinzel(newLSTPlanungEinzel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GRUPPE__LST_PLANUNG_EINZEL, newLSTPlanungEinzel, newLSTPlanungEinzel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_G_Allg_AttributeGroup getPlanungGAllg() {
		return planungGAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanungGAllg(Planung_G_Allg_AttributeGroup newPlanungGAllg, NotificationChain msgs) {
		Planung_G_Allg_AttributeGroup oldPlanungGAllg = planungGAllg;
		planungGAllg = newPlanungGAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GALLG, oldPlanungGAllg, newPlanungGAllg);
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
	public void setPlanungGAllg(Planung_G_Allg_AttributeGroup newPlanungGAllg) {
		if (newPlanungGAllg != planungGAllg) {
			NotificationChain msgs = null;
			if (planungGAllg != null)
				msgs = ((InternalEObject)planungGAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GALLG, null, msgs);
			if (newPlanungGAllg != null)
				msgs = ((InternalEObject)newPlanungGAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GALLG, null, msgs);
			msgs = basicSetPlanungGAllg(newPlanungGAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GALLG, newPlanungGAllg, newPlanungGAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_G_Fuehrende_Strecke_AttributeGroup getPlanungGFuehrendeStrecke() {
		return planungGFuehrendeStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanungGFuehrendeStrecke(Planung_G_Fuehrende_Strecke_AttributeGroup newPlanungGFuehrendeStrecke, NotificationChain msgs) {
		Planung_G_Fuehrende_Strecke_AttributeGroup oldPlanungGFuehrendeStrecke = planungGFuehrendeStrecke;
		planungGFuehrendeStrecke = newPlanungGFuehrendeStrecke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GFUEHRENDE_STRECKE, oldPlanungGFuehrendeStrecke, newPlanungGFuehrendeStrecke);
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
	public void setPlanungGFuehrendeStrecke(Planung_G_Fuehrende_Strecke_AttributeGroup newPlanungGFuehrendeStrecke) {
		if (newPlanungGFuehrendeStrecke != planungGFuehrendeStrecke) {
			NotificationChain msgs = null;
			if (planungGFuehrendeStrecke != null)
				msgs = ((InternalEObject)planungGFuehrendeStrecke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GFUEHRENDE_STRECKE, null, msgs);
			if (newPlanungGFuehrendeStrecke != null)
				msgs = ((InternalEObject)newPlanungGFuehrendeStrecke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GFUEHRENDE_STRECKE, null, msgs);
			msgs = basicSetPlanungGFuehrendeStrecke(newPlanungGFuehrendeStrecke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GFUEHRENDE_STRECKE, newPlanungGFuehrendeStrecke, newPlanungGFuehrendeStrecke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_G_Schriftfeld_AttributeGroup getPlanungGSchriftfeld() {
		return planungGSchriftfeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanungGSchriftfeld(Planung_G_Schriftfeld_AttributeGroup newPlanungGSchriftfeld, NotificationChain msgs) {
		Planung_G_Schriftfeld_AttributeGroup oldPlanungGSchriftfeld = planungGSchriftfeld;
		planungGSchriftfeld = newPlanungGSchriftfeld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GSCHRIFTFELD, oldPlanungGSchriftfeld, newPlanungGSchriftfeld);
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
	public void setPlanungGSchriftfeld(Planung_G_Schriftfeld_AttributeGroup newPlanungGSchriftfeld) {
		if (newPlanungGSchriftfeld != planungGSchriftfeld) {
			NotificationChain msgs = null;
			if (planungGSchriftfeld != null)
				msgs = ((InternalEObject)planungGSchriftfeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GSCHRIFTFELD, null, msgs);
			if (newPlanungGSchriftfeld != null)
				msgs = ((InternalEObject)newPlanungGSchriftfeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GSCHRIFTFELD, null, msgs);
			msgs = basicSetPlanungGSchriftfeld(newPlanungGSchriftfeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GSCHRIFTFELD, newPlanungGSchriftfeld, newPlanungGSchriftfeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Polygone_Betrachtungsbereich_AttributeGroup getPolygoneBetrachtungsbereich() {
		return polygoneBetrachtungsbereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygoneBetrachtungsbereich(Polygone_Betrachtungsbereich_AttributeGroup newPolygoneBetrachtungsbereich, NotificationChain msgs) {
		Polygone_Betrachtungsbereich_AttributeGroup oldPolygoneBetrachtungsbereich = polygoneBetrachtungsbereich;
		polygoneBetrachtungsbereich = newPolygoneBetrachtungsbereich;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GRUPPE__POLYGONE_BETRACHTUNGSBEREICH, oldPolygoneBetrachtungsbereich, newPolygoneBetrachtungsbereich);
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
	public void setPolygoneBetrachtungsbereich(Polygone_Betrachtungsbereich_AttributeGroup newPolygoneBetrachtungsbereich) {
		if (newPolygoneBetrachtungsbereich != polygoneBetrachtungsbereich) {
			NotificationChain msgs = null;
			if (polygoneBetrachtungsbereich != null)
				msgs = ((InternalEObject)polygoneBetrachtungsbereich).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GRUPPE__POLYGONE_BETRACHTUNGSBEREICH, null, msgs);
			if (newPolygoneBetrachtungsbereich != null)
				msgs = ((InternalEObject)newPolygoneBetrachtungsbereich).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GRUPPE__POLYGONE_BETRACHTUNGSBEREICH, null, msgs);
			msgs = basicSetPolygoneBetrachtungsbereich(newPolygoneBetrachtungsbereich, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GRUPPE__POLYGONE_BETRACHTUNGSBEREICH, newPolygoneBetrachtungsbereich, newPolygoneBetrachtungsbereich));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Polygone_Planungsbereich_AttributeGroup getPolygonePlanungsbereich() {
		return polygonePlanungsbereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygonePlanungsbereich(Polygone_Planungsbereich_AttributeGroup newPolygonePlanungsbereich, NotificationChain msgs) {
		Polygone_Planungsbereich_AttributeGroup oldPolygonePlanungsbereich = polygonePlanungsbereich;
		polygonePlanungsbereich = newPolygonePlanungsbereich;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GRUPPE__POLYGONE_PLANUNGSBEREICH, oldPolygonePlanungsbereich, newPolygonePlanungsbereich);
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
	public void setPolygonePlanungsbereich(Polygone_Planungsbereich_AttributeGroup newPolygonePlanungsbereich) {
		if (newPolygonePlanungsbereich != polygonePlanungsbereich) {
			NotificationChain msgs = null;
			if (polygonePlanungsbereich != null)
				msgs = ((InternalEObject)polygonePlanungsbereich).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GRUPPE__POLYGONE_PLANUNGSBEREICH, null, msgs);
			if (newPolygonePlanungsbereich != null)
				msgs = ((InternalEObject)newPolygonePlanungsbereich).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_GRUPPE__POLYGONE_PLANUNGSBEREICH, null, msgs);
			msgs = basicSetPolygonePlanungsbereich(newPolygonePlanungsbereich, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_GRUPPE__POLYGONE_PLANUNGSBEREICH, newPolygonePlanungsbereich, newPolygonePlanungsbereich));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.PLANUNG_GRUPPE__FUEHRENDE_OERTLICHKEIT:
				return basicSetFuehrendeOertlichkeit(null, msgs);
			case PlanProPackage.PLANUNG_GRUPPE__LST_PLANUNG_EINZEL:
				return basicSetLSTPlanungEinzel(null, msgs);
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GALLG:
				return basicSetPlanungGAllg(null, msgs);
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GFUEHRENDE_STRECKE:
				return basicSetPlanungGFuehrendeStrecke(null, msgs);
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GSCHRIFTFELD:
				return basicSetPlanungGSchriftfeld(null, msgs);
			case PlanProPackage.PLANUNG_GRUPPE__POLYGONE_BETRACHTUNGSBEREICH:
				return basicSetPolygoneBetrachtungsbereich(null, msgs);
			case PlanProPackage.PLANUNG_GRUPPE__POLYGONE_PLANUNGSBEREICH:
				return basicSetPolygonePlanungsbereich(null, msgs);
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
			case PlanProPackage.PLANUNG_GRUPPE__FUEHRENDE_OERTLICHKEIT:
				return getFuehrendeOertlichkeit();
			case PlanProPackage.PLANUNG_GRUPPE__LST_PLANUNG_EINZEL:
				return getLSTPlanungEinzel();
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GALLG:
				return getPlanungGAllg();
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GFUEHRENDE_STRECKE:
				return getPlanungGFuehrendeStrecke();
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GSCHRIFTFELD:
				return getPlanungGSchriftfeld();
			case PlanProPackage.PLANUNG_GRUPPE__POLYGONE_BETRACHTUNGSBEREICH:
				return getPolygoneBetrachtungsbereich();
			case PlanProPackage.PLANUNG_GRUPPE__POLYGONE_PLANUNGSBEREICH:
				return getPolygonePlanungsbereich();
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
			case PlanProPackage.PLANUNG_GRUPPE__FUEHRENDE_OERTLICHKEIT:
				setFuehrendeOertlichkeit((Fuehrende_Oertlichkeit_TypeClass)newValue);
				return;
			case PlanProPackage.PLANUNG_GRUPPE__LST_PLANUNG_EINZEL:
				setLSTPlanungEinzel((Planung_Einzel)newValue);
				return;
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GALLG:
				setPlanungGAllg((Planung_G_Allg_AttributeGroup)newValue);
				return;
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GFUEHRENDE_STRECKE:
				setPlanungGFuehrendeStrecke((Planung_G_Fuehrende_Strecke_AttributeGroup)newValue);
				return;
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GSCHRIFTFELD:
				setPlanungGSchriftfeld((Planung_G_Schriftfeld_AttributeGroup)newValue);
				return;
			case PlanProPackage.PLANUNG_GRUPPE__POLYGONE_BETRACHTUNGSBEREICH:
				setPolygoneBetrachtungsbereich((Polygone_Betrachtungsbereich_AttributeGroup)newValue);
				return;
			case PlanProPackage.PLANUNG_GRUPPE__POLYGONE_PLANUNGSBEREICH:
				setPolygonePlanungsbereich((Polygone_Planungsbereich_AttributeGroup)newValue);
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
			case PlanProPackage.PLANUNG_GRUPPE__FUEHRENDE_OERTLICHKEIT:
				setFuehrendeOertlichkeit((Fuehrende_Oertlichkeit_TypeClass)null);
				return;
			case PlanProPackage.PLANUNG_GRUPPE__LST_PLANUNG_EINZEL:
				setLSTPlanungEinzel((Planung_Einzel)null);
				return;
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GALLG:
				setPlanungGAllg((Planung_G_Allg_AttributeGroup)null);
				return;
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GFUEHRENDE_STRECKE:
				setPlanungGFuehrendeStrecke((Planung_G_Fuehrende_Strecke_AttributeGroup)null);
				return;
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GSCHRIFTFELD:
				setPlanungGSchriftfeld((Planung_G_Schriftfeld_AttributeGroup)null);
				return;
			case PlanProPackage.PLANUNG_GRUPPE__POLYGONE_BETRACHTUNGSBEREICH:
				setPolygoneBetrachtungsbereich((Polygone_Betrachtungsbereich_AttributeGroup)null);
				return;
			case PlanProPackage.PLANUNG_GRUPPE__POLYGONE_PLANUNGSBEREICH:
				setPolygonePlanungsbereich((Polygone_Planungsbereich_AttributeGroup)null);
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
			case PlanProPackage.PLANUNG_GRUPPE__FUEHRENDE_OERTLICHKEIT:
				return fuehrendeOertlichkeit != null;
			case PlanProPackage.PLANUNG_GRUPPE__LST_PLANUNG_EINZEL:
				return lSTPlanungEinzel != null;
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GALLG:
				return planungGAllg != null;
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GFUEHRENDE_STRECKE:
				return planungGFuehrendeStrecke != null;
			case PlanProPackage.PLANUNG_GRUPPE__PLANUNG_GSCHRIFTFELD:
				return planungGSchriftfeld != null;
			case PlanProPackage.PLANUNG_GRUPPE__POLYGONE_BETRACHTUNGSBEREICH:
				return polygoneBetrachtungsbereich != null;
			case PlanProPackage.PLANUNG_GRUPPE__POLYGONE_PLANUNGSBEREICH:
				return polygonePlanungsbereich != null;
		}
		return super.eIsSet(featureID);
	}

} //Planung_GruppeImpl
