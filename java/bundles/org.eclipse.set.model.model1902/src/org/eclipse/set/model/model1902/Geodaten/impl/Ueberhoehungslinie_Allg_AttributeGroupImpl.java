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
import org.eclipse.set.model.model1902.Geodaten.Plan_Quelle_TypeClass;
import org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Form_TypeClass;
import org.eclipse.set.model.model1902.Geodaten.Ueberhoehungslinie_Laenge_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ueberhoehungslinie Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehungslinie_Allg_AttributeGroupImpl#getPlanQuelle <em>Plan Quelle</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehungslinie_Allg_AttributeGroupImpl#getUeberhoehungslinieForm <em>Ueberhoehungslinie Form</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.Ueberhoehungslinie_Allg_AttributeGroupImpl#getUeberhoehungslinieLaenge <em>Ueberhoehungslinie Laenge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Ueberhoehungslinie_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Ueberhoehungslinie_Allg_AttributeGroup {
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
	 * The cached value of the '{@link #getUeberhoehungslinieForm() <em>Ueberhoehungslinie Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUeberhoehungslinieForm()
	 * @generated
	 * @ordered
	 */
	protected Ueberhoehungslinie_Form_TypeClass ueberhoehungslinieForm;

	/**
	 * The cached value of the '{@link #getUeberhoehungslinieLaenge() <em>Ueberhoehungslinie Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUeberhoehungslinieLaenge()
	 * @generated
	 * @ordered
	 */
	protected Ueberhoehungslinie_Laenge_TypeClass ueberhoehungslinieLaenge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ueberhoehungslinie_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, oldPlanQuelle, newPlanQuelle);
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
				msgs = ((InternalEObject)planQuelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, null, msgs);
			if (newPlanQuelle != null)
				msgs = ((InternalEObject)newPlanQuelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, null, msgs);
			msgs = basicSetPlanQuelle(newPlanQuelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE, newPlanQuelle, newPlanQuelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberhoehungslinie_Form_TypeClass getUeberhoehungslinieForm() {
		return ueberhoehungslinieForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUeberhoehungslinieForm(Ueberhoehungslinie_Form_TypeClass newUeberhoehungslinieForm, NotificationChain msgs) {
		Ueberhoehungslinie_Form_TypeClass oldUeberhoehungslinieForm = ueberhoehungslinieForm;
		ueberhoehungslinieForm = newUeberhoehungslinieForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_FORM, oldUeberhoehungslinieForm, newUeberhoehungslinieForm);
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
	public void setUeberhoehungslinieForm(Ueberhoehungslinie_Form_TypeClass newUeberhoehungslinieForm) {
		if (newUeberhoehungslinieForm != ueberhoehungslinieForm) {
			NotificationChain msgs = null;
			if (ueberhoehungslinieForm != null)
				msgs = ((InternalEObject)ueberhoehungslinieForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_FORM, null, msgs);
			if (newUeberhoehungslinieForm != null)
				msgs = ((InternalEObject)newUeberhoehungslinieForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_FORM, null, msgs);
			msgs = basicSetUeberhoehungslinieForm(newUeberhoehungslinieForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_FORM, newUeberhoehungslinieForm, newUeberhoehungslinieForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberhoehungslinie_Laenge_TypeClass getUeberhoehungslinieLaenge() {
		return ueberhoehungslinieLaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUeberhoehungslinieLaenge(Ueberhoehungslinie_Laenge_TypeClass newUeberhoehungslinieLaenge, NotificationChain msgs) {
		Ueberhoehungslinie_Laenge_TypeClass oldUeberhoehungslinieLaenge = ueberhoehungslinieLaenge;
		ueberhoehungslinieLaenge = newUeberhoehungslinieLaenge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_LAENGE, oldUeberhoehungslinieLaenge, newUeberhoehungslinieLaenge);
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
	public void setUeberhoehungslinieLaenge(Ueberhoehungslinie_Laenge_TypeClass newUeberhoehungslinieLaenge) {
		if (newUeberhoehungslinieLaenge != ueberhoehungslinieLaenge) {
			NotificationChain msgs = null;
			if (ueberhoehungslinieLaenge != null)
				msgs = ((InternalEObject)ueberhoehungslinieLaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_LAENGE, null, msgs);
			if (newUeberhoehungslinieLaenge != null)
				msgs = ((InternalEObject)newUeberhoehungslinieLaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_LAENGE, null, msgs);
			msgs = basicSetUeberhoehungslinieLaenge(newUeberhoehungslinieLaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_LAENGE, newUeberhoehungslinieLaenge, newUeberhoehungslinieLaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return basicSetPlanQuelle(null, msgs);
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_FORM:
				return basicSetUeberhoehungslinieForm(null, msgs);
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_LAENGE:
				return basicSetUeberhoehungslinieLaenge(null, msgs);
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
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return getPlanQuelle();
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_FORM:
				return getUeberhoehungslinieForm();
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_LAENGE:
				return getUeberhoehungslinieLaenge();
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
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				setPlanQuelle((Plan_Quelle_TypeClass)newValue);
				return;
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_FORM:
				setUeberhoehungslinieForm((Ueberhoehungslinie_Form_TypeClass)newValue);
				return;
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_LAENGE:
				setUeberhoehungslinieLaenge((Ueberhoehungslinie_Laenge_TypeClass)newValue);
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
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				setPlanQuelle((Plan_Quelle_TypeClass)null);
				return;
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_FORM:
				setUeberhoehungslinieForm((Ueberhoehungslinie_Form_TypeClass)null);
				return;
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_LAENGE:
				setUeberhoehungslinieLaenge((Ueberhoehungslinie_Laenge_TypeClass)null);
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
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__PLAN_QUELLE:
				return planQuelle != null;
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_FORM:
				return ueberhoehungslinieForm != null;
			case GeodatenPackage.UEBERHOEHUNGSLINIE_ALLG_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE_LAENGE:
				return ueberhoehungslinieLaenge != null;
		}
		return super.eIsSet(featureID);
	}

} //Ueberhoehungslinie_Allg_AttributeGroupImpl
