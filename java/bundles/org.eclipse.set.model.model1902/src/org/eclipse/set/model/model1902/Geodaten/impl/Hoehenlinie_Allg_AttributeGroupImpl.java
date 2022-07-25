/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Geodaten.GeodatenPackage;
import org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Form_TypeClass;
import org.eclipse.set.model.model1902.Geodaten.Hoehenlinie_Laenge_TypeClass;
import org.eclipse.set.model.model1902.Geodaten.Plan_Quelle_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hoehenlinie Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.Hoehenlinie_Allg_AttributeGroupImpl#getHoehenlinieForm <em>Hoehenlinie Form</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.Hoehenlinie_Allg_AttributeGroupImpl#getHoehenlinieLaenge <em>Hoehenlinie Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.Hoehenlinie_Allg_AttributeGroupImpl#getPlanQuelle <em>Plan Quelle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Hoehenlinie_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Hoehenlinie_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getHoehenlinieForm() <em>Hoehenlinie Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoehenlinieForm()
	 * @generated
	 * @ordered
	 */
	protected Hoehenlinie_Form_TypeClass hoehenlinieForm;

	/**
	 * The cached value of the '{@link #getHoehenlinieLaenge() <em>Hoehenlinie Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoehenlinieLaenge()
	 * @generated
	 * @ordered
	 */
	protected Hoehenlinie_Laenge_TypeClass hoehenlinieLaenge;

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
	protected Hoehenlinie_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehenlinie_Form_TypeClass getHoehenlinieForm() {
		return hoehenlinieForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHoehenlinieForm(Hoehenlinie_Form_TypeClass newHoehenlinieForm, NotificationChain msgs) {
		Hoehenlinie_Form_TypeClass oldHoehenlinieForm = hoehenlinieForm;
		hoehenlinieForm = newHoehenlinieForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_FORM, oldHoehenlinieForm, newHoehenlinieForm);
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
	public void setHoehenlinieForm(Hoehenlinie_Form_TypeClass newHoehenlinieForm) {
		if (newHoehenlinieForm != hoehenlinieForm) {
			NotificationChain msgs = null;
			if (hoehenlinieForm != null)
				msgs = ((InternalEObject)hoehenlinieForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_FORM, null, msgs);
			if (newHoehenlinieForm != null)
				msgs = ((InternalEObject)newHoehenlinieForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_FORM, null, msgs);
			msgs = basicSetHoehenlinieForm(newHoehenlinieForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_FORM, newHoehenlinieForm, newHoehenlinieForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehenlinie_Laenge_TypeClass getHoehenlinieLaenge() {
		return hoehenlinieLaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHoehenlinieLaenge(Hoehenlinie_Laenge_TypeClass newHoehenlinieLaenge, NotificationChain msgs) {
		Hoehenlinie_Laenge_TypeClass oldHoehenlinieLaenge = hoehenlinieLaenge;
		hoehenlinieLaenge = newHoehenlinieLaenge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_LAENGE, oldHoehenlinieLaenge, newHoehenlinieLaenge);
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
	public void setHoehenlinieLaenge(Hoehenlinie_Laenge_TypeClass newHoehenlinieLaenge) {
		if (newHoehenlinieLaenge != hoehenlinieLaenge) {
			NotificationChain msgs = null;
			if (hoehenlinieLaenge != null)
				msgs = ((InternalEObject)hoehenlinieLaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_LAENGE, null, msgs);
			if (newHoehenlinieLaenge != null)
				msgs = ((InternalEObject)newHoehenlinieLaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_LAENGE, null, msgs);
			msgs = basicSetHoehenlinieLaenge(newHoehenlinieLaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_LAENGE, newHoehenlinieLaenge, newHoehenlinieLaenge));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, oldPlanQuelle, newPlanQuelle);
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
				msgs = ((InternalEObject)planQuelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, null, msgs);
			if (newPlanQuelle != null)
				msgs = ((InternalEObject)newPlanQuelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, null, msgs);
			msgs = basicSetPlanQuelle(newPlanQuelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, newPlanQuelle, newPlanQuelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_FORM:
				return basicSetHoehenlinieForm(null, msgs);
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_LAENGE:
				return basicSetHoehenlinieLaenge(null, msgs);
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
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
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_FORM:
				return getHoehenlinieForm();
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_LAENGE:
				return getHoehenlinieLaenge();
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
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
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_FORM:
				setHoehenlinieForm((Hoehenlinie_Form_TypeClass)newValue);
				return;
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_LAENGE:
				setHoehenlinieLaenge((Hoehenlinie_Laenge_TypeClass)newValue);
				return;
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
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
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_FORM:
				setHoehenlinieForm((Hoehenlinie_Form_TypeClass)null);
				return;
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_LAENGE:
				setHoehenlinieLaenge((Hoehenlinie_Laenge_TypeClass)null);
				return;
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
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
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_FORM:
				return hoehenlinieForm != null;
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__HOEHENLINIE_LAENGE:
				return hoehenlinieLaenge != null;
			case GeodatenPackage.HOEHENLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return planQuelle != null;
		}
		return super.eIsSet(featureID);
	}

} //Hoehenlinie_Allg_AttributeGroupImpl
