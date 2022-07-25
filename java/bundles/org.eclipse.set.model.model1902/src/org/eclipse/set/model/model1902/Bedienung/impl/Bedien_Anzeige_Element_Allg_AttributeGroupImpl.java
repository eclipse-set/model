/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.BedienungPackage;
import org.eclipse.set.model.model1902.Bedienung.Melder_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Schalter_TypeClass;
import org.eclipse.set.model.model1902.Bedienung.Taste_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Anzeige Element Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Anzeige_Element_Allg_AttributeGroupImpl#getMelder <em>Melder</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Anzeige_Element_Allg_AttributeGroupImpl#getSchalter <em>Schalter</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Anzeige_Element_Allg_AttributeGroupImpl#getTaste <em>Taste</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Anzeige_Element_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Bedien_Anzeige_Element_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getMelder() <em>Melder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMelder()
	 * @generated
	 * @ordered
	 */
	protected Melder_TypeClass melder;

	/**
	 * The cached value of the '{@link #getSchalter() <em>Schalter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchalter()
	 * @generated
	 * @ordered
	 */
	protected Schalter_TypeClass schalter;

	/**
	 * The cached value of the '{@link #getTaste() <em>Taste</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaste()
	 * @generated
	 * @ordered
	 */
	protected Taste_TypeClass taste;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Anzeige_Element_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Melder_TypeClass getMelder() {
		return melder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMelder(Melder_TypeClass newMelder, NotificationChain msgs) {
		Melder_TypeClass oldMelder = melder;
		melder = newMelder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__MELDER, oldMelder, newMelder);
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
	public void setMelder(Melder_TypeClass newMelder) {
		if (newMelder != melder) {
			NotificationChain msgs = null;
			if (melder != null)
				msgs = ((InternalEObject)melder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__MELDER, null, msgs);
			if (newMelder != null)
				msgs = ((InternalEObject)newMelder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__MELDER, null, msgs);
			msgs = basicSetMelder(newMelder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__MELDER, newMelder, newMelder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schalter_TypeClass getSchalter() {
		return schalter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchalter(Schalter_TypeClass newSchalter, NotificationChain msgs) {
		Schalter_TypeClass oldSchalter = schalter;
		schalter = newSchalter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__SCHALTER, oldSchalter, newSchalter);
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
	public void setSchalter(Schalter_TypeClass newSchalter) {
		if (newSchalter != schalter) {
			NotificationChain msgs = null;
			if (schalter != null)
				msgs = ((InternalEObject)schalter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__SCHALTER, null, msgs);
			if (newSchalter != null)
				msgs = ((InternalEObject)newSchalter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__SCHALTER, null, msgs);
			msgs = basicSetSchalter(newSchalter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__SCHALTER, newSchalter, newSchalter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Taste_TypeClass getTaste() {
		return taste;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaste(Taste_TypeClass newTaste, NotificationChain msgs) {
		Taste_TypeClass oldTaste = taste;
		taste = newTaste;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__TASTE, oldTaste, newTaste);
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
	public void setTaste(Taste_TypeClass newTaste) {
		if (newTaste != taste) {
			NotificationChain msgs = null;
			if (taste != null)
				msgs = ((InternalEObject)taste).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__TASTE, null, msgs);
			if (newTaste != null)
				msgs = ((InternalEObject)newTaste).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__TASTE, null, msgs);
			msgs = basicSetTaste(newTaste, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__TASTE, newTaste, newTaste));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__MELDER:
				return basicSetMelder(null, msgs);
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__SCHALTER:
				return basicSetSchalter(null, msgs);
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__TASTE:
				return basicSetTaste(null, msgs);
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__MELDER:
				return getMelder();
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__SCHALTER:
				return getSchalter();
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__TASTE:
				return getTaste();
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__MELDER:
				setMelder((Melder_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__SCHALTER:
				setSchalter((Schalter_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__TASTE:
				setTaste((Taste_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__MELDER:
				setMelder((Melder_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__SCHALTER:
				setSchalter((Schalter_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__TASTE:
				setTaste((Taste_TypeClass)null);
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__MELDER:
				return melder != null;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__SCHALTER:
				return schalter != null;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT_ALLG_ATTRIBUTE_GROUP__TASTE:
				return taste != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_Anzeige_Element_Allg_AttributeGroupImpl
