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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.PlanPro.Akteur_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.PlanPro.Name_Akteur_10_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Name_Akteur_5_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.Name_Akteur_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.PlanProPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Akteur Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Akteur_Allg_AttributeGroupImpl#getNameAkteur <em>Name Akteur</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Akteur_Allg_AttributeGroupImpl#getNameAkteur10 <em>Name Akteur10</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.impl.Akteur_Allg_AttributeGroupImpl#getNameAkteur5 <em>Name Akteur5</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Akteur_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Akteur_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getNameAkteur() <em>Name Akteur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameAkteur()
	 * @generated
	 * @ordered
	 */
	protected Name_Akteur_TypeClass nameAkteur;

	/**
	 * The cached value of the '{@link #getNameAkteur10() <em>Name Akteur10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameAkteur10()
	 * @generated
	 * @ordered
	 */
	protected Name_Akteur_10_TypeClass nameAkteur10;

	/**
	 * The cached value of the '{@link #getNameAkteur5() <em>Name Akteur5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameAkteur5()
	 * @generated
	 * @ordered
	 */
	protected Name_Akteur_5_TypeClass nameAkteur5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Akteur_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getAkteur_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Name_Akteur_TypeClass getNameAkteur() {
		return nameAkteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameAkteur(Name_Akteur_TypeClass newNameAkteur, NotificationChain msgs) {
		Name_Akteur_TypeClass oldNameAkteur = nameAkteur;
		nameAkteur = newNameAkteur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR, oldNameAkteur, newNameAkteur);
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
	public void setNameAkteur(Name_Akteur_TypeClass newNameAkteur) {
		if (newNameAkteur != nameAkteur) {
			NotificationChain msgs = null;
			if (nameAkteur != null)
				msgs = ((InternalEObject)nameAkteur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR, null, msgs);
			if (newNameAkteur != null)
				msgs = ((InternalEObject)newNameAkteur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR, null, msgs);
			msgs = basicSetNameAkteur(newNameAkteur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR, newNameAkteur, newNameAkteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Name_Akteur_10_TypeClass getNameAkteur10() {
		return nameAkteur10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameAkteur10(Name_Akteur_10_TypeClass newNameAkteur10, NotificationChain msgs) {
		Name_Akteur_10_TypeClass oldNameAkteur10 = nameAkteur10;
		nameAkteur10 = newNameAkteur10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR10, oldNameAkteur10, newNameAkteur10);
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
	public void setNameAkteur10(Name_Akteur_10_TypeClass newNameAkteur10) {
		if (newNameAkteur10 != nameAkteur10) {
			NotificationChain msgs = null;
			if (nameAkteur10 != null)
				msgs = ((InternalEObject)nameAkteur10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR10, null, msgs);
			if (newNameAkteur10 != null)
				msgs = ((InternalEObject)newNameAkteur10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR10, null, msgs);
			msgs = basicSetNameAkteur10(newNameAkteur10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR10, newNameAkteur10, newNameAkteur10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Name_Akteur_5_TypeClass getNameAkteur5() {
		return nameAkteur5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameAkteur5(Name_Akteur_5_TypeClass newNameAkteur5, NotificationChain msgs) {
		Name_Akteur_5_TypeClass oldNameAkteur5 = nameAkteur5;
		nameAkteur5 = newNameAkteur5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR5, oldNameAkteur5, newNameAkteur5);
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
	public void setNameAkteur5(Name_Akteur_5_TypeClass newNameAkteur5) {
		if (newNameAkteur5 != nameAkteur5) {
			NotificationChain msgs = null;
			if (nameAkteur5 != null)
				msgs = ((InternalEObject)nameAkteur5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR5, null, msgs);
			if (newNameAkteur5 != null)
				msgs = ((InternalEObject)newNameAkteur5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR5, null, msgs);
			msgs = basicSetNameAkteur5(newNameAkteur5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR5, newNameAkteur5, newNameAkteur5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR:
				return basicSetNameAkteur(null, msgs);
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR10:
				return basicSetNameAkteur10(null, msgs);
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR5:
				return basicSetNameAkteur5(null, msgs);
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
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR:
				return getNameAkteur();
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR10:
				return getNameAkteur10();
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR5:
				return getNameAkteur5();
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
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR:
				setNameAkteur((Name_Akteur_TypeClass)newValue);
				return;
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR10:
				setNameAkteur10((Name_Akteur_10_TypeClass)newValue);
				return;
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR5:
				setNameAkteur5((Name_Akteur_5_TypeClass)newValue);
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
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR:
				setNameAkteur((Name_Akteur_TypeClass)null);
				return;
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR10:
				setNameAkteur10((Name_Akteur_10_TypeClass)null);
				return;
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR5:
				setNameAkteur5((Name_Akteur_5_TypeClass)null);
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
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR:
				return nameAkteur != null;
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR10:
				return nameAkteur10 != null;
			case PlanProPackage.AKTEUR_ALLG_ATTRIBUTE_GROUP__NAME_AKTEUR5:
				return nameAkteur5 != null;
		}
		return super.eIsSet(featureID);
	}

} //Akteur_Allg_AttributeGroupImpl
