/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Geodaten.GEO_Form_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GEO_KAD_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GEO_Kante_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Geodaten.GEO_Laenge_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GEO_Radius_A_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GEO_Radius_B_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GEO_Richtungswinkel_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GeodatenPackage;
import org.eclipse.set.model.model11001.Geodaten.Plan_Quelle_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GEO Kante Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.impl.GEO_Kante_Allg_AttributeGroupImpl#getGEOForm <em>GEO Form</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.impl.GEO_Kante_Allg_AttributeGroupImpl#getGEOKAD <em>GEOKAD</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.impl.GEO_Kante_Allg_AttributeGroupImpl#getGEOLaenge <em>GEO Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.impl.GEO_Kante_Allg_AttributeGroupImpl#getGEORadiusA <em>GEO Radius A</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.impl.GEO_Kante_Allg_AttributeGroupImpl#getGEORadiusB <em>GEO Radius B</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.impl.GEO_Kante_Allg_AttributeGroupImpl#getGEORichtungswinkel <em>GEO Richtungswinkel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.impl.GEO_Kante_Allg_AttributeGroupImpl#getPlanQuelle <em>Plan Quelle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GEO_Kante_Allg_AttributeGroupImpl extends EObjectImpl implements GEO_Kante_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getGEOForm() <em>GEO Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEOForm()
	 * @generated
	 * @ordered
	 */
	protected GEO_Form_TypeClass gEOForm;

	/**
	 * The cached value of the '{@link #getGEOKAD() <em>GEOKAD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEOKAD()
	 * @generated
	 * @ordered
	 */
	protected GEO_KAD_TypeClass gEOKAD;

	/**
	 * The cached value of the '{@link #getGEOLaenge() <em>GEO Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEOLaenge()
	 * @generated
	 * @ordered
	 */
	protected GEO_Laenge_TypeClass gEOLaenge;

	/**
	 * The cached value of the '{@link #getGEORadiusA() <em>GEO Radius A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEORadiusA()
	 * @generated
	 * @ordered
	 */
	protected GEO_Radius_A_TypeClass gEORadiusA;

	/**
	 * The cached value of the '{@link #getGEORadiusB() <em>GEO Radius B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEORadiusB()
	 * @generated
	 * @ordered
	 */
	protected GEO_Radius_B_TypeClass gEORadiusB;

	/**
	 * The cached value of the '{@link #getGEORichtungswinkel() <em>GEO Richtungswinkel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEORichtungswinkel()
	 * @generated
	 * @ordered
	 */
	protected GEO_Richtungswinkel_TypeClass gEORichtungswinkel;

	/**
	 * The cached value of the '{@link #getPlanQuelle() <em>Plan Quelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanQuelle()
	 * @generated
	 * @ordered
	 */
	protected Plan_Quelle_TypeClass planQuelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GEO_Kante_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.GEO_KANTE_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Form_TypeClass getGEOForm() {
		return gEOForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGEOForm(GEO_Form_TypeClass newGEOForm, NotificationChain msgs) {
		GEO_Form_TypeClass oldGEOForm = gEOForm;
		gEOForm = newGEOForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_FORM, oldGEOForm, newGEOForm);
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
	public void setGEOForm(GEO_Form_TypeClass newGEOForm) {
		if (newGEOForm != gEOForm) {
			NotificationChain msgs = null;
			if (gEOForm != null)
				msgs = ((InternalEObject)gEOForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_FORM, null, msgs);
			if (newGEOForm != null)
				msgs = ((InternalEObject)newGEOForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_FORM, null, msgs);
			msgs = basicSetGEOForm(newGEOForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_FORM, newGEOForm, newGEOForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_KAD_TypeClass getGEOKAD() {
		return gEOKAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGEOKAD(GEO_KAD_TypeClass newGEOKAD, NotificationChain msgs) {
		GEO_KAD_TypeClass oldGEOKAD = gEOKAD;
		gEOKAD = newGEOKAD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEOKAD, oldGEOKAD, newGEOKAD);
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
	public void setGEOKAD(GEO_KAD_TypeClass newGEOKAD) {
		if (newGEOKAD != gEOKAD) {
			NotificationChain msgs = null;
			if (gEOKAD != null)
				msgs = ((InternalEObject)gEOKAD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEOKAD, null, msgs);
			if (newGEOKAD != null)
				msgs = ((InternalEObject)newGEOKAD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEOKAD, null, msgs);
			msgs = basicSetGEOKAD(newGEOKAD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEOKAD, newGEOKAD, newGEOKAD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Laenge_TypeClass getGEOLaenge() {
		return gEOLaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGEOLaenge(GEO_Laenge_TypeClass newGEOLaenge, NotificationChain msgs) {
		GEO_Laenge_TypeClass oldGEOLaenge = gEOLaenge;
		gEOLaenge = newGEOLaenge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_LAENGE, oldGEOLaenge, newGEOLaenge);
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
	public void setGEOLaenge(GEO_Laenge_TypeClass newGEOLaenge) {
		if (newGEOLaenge != gEOLaenge) {
			NotificationChain msgs = null;
			if (gEOLaenge != null)
				msgs = ((InternalEObject)gEOLaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_LAENGE, null, msgs);
			if (newGEOLaenge != null)
				msgs = ((InternalEObject)newGEOLaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_LAENGE, null, msgs);
			msgs = basicSetGEOLaenge(newGEOLaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_LAENGE, newGEOLaenge, newGEOLaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Radius_A_TypeClass getGEORadiusA() {
		return gEORadiusA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGEORadiusA(GEO_Radius_A_TypeClass newGEORadiusA, NotificationChain msgs) {
		GEO_Radius_A_TypeClass oldGEORadiusA = gEORadiusA;
		gEORadiusA = newGEORadiusA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_A, oldGEORadiusA, newGEORadiusA);
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
	public void setGEORadiusA(GEO_Radius_A_TypeClass newGEORadiusA) {
		if (newGEORadiusA != gEORadiusA) {
			NotificationChain msgs = null;
			if (gEORadiusA != null)
				msgs = ((InternalEObject)gEORadiusA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_A, null, msgs);
			if (newGEORadiusA != null)
				msgs = ((InternalEObject)newGEORadiusA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_A, null, msgs);
			msgs = basicSetGEORadiusA(newGEORadiusA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_A, newGEORadiusA, newGEORadiusA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Radius_B_TypeClass getGEORadiusB() {
		return gEORadiusB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGEORadiusB(GEO_Radius_B_TypeClass newGEORadiusB, NotificationChain msgs) {
		GEO_Radius_B_TypeClass oldGEORadiusB = gEORadiusB;
		gEORadiusB = newGEORadiusB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_B, oldGEORadiusB, newGEORadiusB);
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
	public void setGEORadiusB(GEO_Radius_B_TypeClass newGEORadiusB) {
		if (newGEORadiusB != gEORadiusB) {
			NotificationChain msgs = null;
			if (gEORadiusB != null)
				msgs = ((InternalEObject)gEORadiusB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_B, null, msgs);
			if (newGEORadiusB != null)
				msgs = ((InternalEObject)newGEORadiusB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_B, null, msgs);
			msgs = basicSetGEORadiusB(newGEORadiusB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_B, newGEORadiusB, newGEORadiusB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Richtungswinkel_TypeClass getGEORichtungswinkel() {
		return gEORichtungswinkel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGEORichtungswinkel(GEO_Richtungswinkel_TypeClass newGEORichtungswinkel, NotificationChain msgs) {
		GEO_Richtungswinkel_TypeClass oldGEORichtungswinkel = gEORichtungswinkel;
		gEORichtungswinkel = newGEORichtungswinkel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RICHTUNGSWINKEL, oldGEORichtungswinkel, newGEORichtungswinkel);
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
	public void setGEORichtungswinkel(GEO_Richtungswinkel_TypeClass newGEORichtungswinkel) {
		if (newGEORichtungswinkel != gEORichtungswinkel) {
			NotificationChain msgs = null;
			if (gEORichtungswinkel != null)
				msgs = ((InternalEObject)gEORichtungswinkel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RICHTUNGSWINKEL, null, msgs);
			if (newGEORichtungswinkel != null)
				msgs = ((InternalEObject)newGEORichtungswinkel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RICHTUNGSWINKEL, null, msgs);
			msgs = basicSetGEORichtungswinkel(newGEORichtungswinkel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RICHTUNGSWINKEL, newGEORichtungswinkel, newGEORichtungswinkel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Plan_Quelle_TypeClass getPlanQuelle() {
		return planQuelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanQuelle(Plan_Quelle_TypeClass newPlanQuelle, NotificationChain msgs) {
		Plan_Quelle_TypeClass oldPlanQuelle = planQuelle;
		planQuelle = newPlanQuelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, oldPlanQuelle, newPlanQuelle);
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
	public void setPlanQuelle(Plan_Quelle_TypeClass newPlanQuelle) {
		if (newPlanQuelle != planQuelle) {
			NotificationChain msgs = null;
			if (planQuelle != null)
				msgs = ((InternalEObject)planQuelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, null, msgs);
			if (newPlanQuelle != null)
				msgs = ((InternalEObject)newPlanQuelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, null, msgs);
			msgs = basicSetPlanQuelle(newPlanQuelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, newPlanQuelle, newPlanQuelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_FORM:
				return basicSetGEOForm(null, msgs);
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEOKAD:
				return basicSetGEOKAD(null, msgs);
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_LAENGE:
				return basicSetGEOLaenge(null, msgs);
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_A:
				return basicSetGEORadiusA(null, msgs);
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_B:
				return basicSetGEORadiusB(null, msgs);
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RICHTUNGSWINKEL:
				return basicSetGEORichtungswinkel(null, msgs);
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return basicSetPlanQuelle(null, msgs);
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
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_FORM:
				return getGEOForm();
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEOKAD:
				return getGEOKAD();
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_LAENGE:
				return getGEOLaenge();
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_A:
				return getGEORadiusA();
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_B:
				return getGEORadiusB();
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RICHTUNGSWINKEL:
				return getGEORichtungswinkel();
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return getPlanQuelle();
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
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_FORM:
				setGEOForm((GEO_Form_TypeClass)newValue);
				return;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEOKAD:
				setGEOKAD((GEO_KAD_TypeClass)newValue);
				return;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_LAENGE:
				setGEOLaenge((GEO_Laenge_TypeClass)newValue);
				return;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_A:
				setGEORadiusA((GEO_Radius_A_TypeClass)newValue);
				return;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_B:
				setGEORadiusB((GEO_Radius_B_TypeClass)newValue);
				return;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RICHTUNGSWINKEL:
				setGEORichtungswinkel((GEO_Richtungswinkel_TypeClass)newValue);
				return;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				setPlanQuelle((Plan_Quelle_TypeClass)newValue);
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
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_FORM:
				setGEOForm((GEO_Form_TypeClass)null);
				return;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEOKAD:
				setGEOKAD((GEO_KAD_TypeClass)null);
				return;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_LAENGE:
				setGEOLaenge((GEO_Laenge_TypeClass)null);
				return;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_A:
				setGEORadiusA((GEO_Radius_A_TypeClass)null);
				return;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_B:
				setGEORadiusB((GEO_Radius_B_TypeClass)null);
				return;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RICHTUNGSWINKEL:
				setGEORichtungswinkel((GEO_Richtungswinkel_TypeClass)null);
				return;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				setPlanQuelle((Plan_Quelle_TypeClass)null);
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
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_FORM:
				return gEOForm != null;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEOKAD:
				return gEOKAD != null;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_LAENGE:
				return gEOLaenge != null;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_A:
				return gEORadiusA != null;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RADIUS_B:
				return gEORadiusB != null;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__GEO_RICHTUNGSWINKEL:
				return gEORichtungswinkel != null;
			case GeodatenPackage.GEO_KANTE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return planQuelle != null;
		}
		return super.eIsSet(featureID);
	}

} //GEO_Kante_Allg_AttributeGroupImpl
