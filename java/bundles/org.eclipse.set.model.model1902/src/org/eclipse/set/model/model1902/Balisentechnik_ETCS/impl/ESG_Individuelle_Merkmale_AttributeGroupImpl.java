/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ESG_Ind_Erlaeuterung_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ESG_Ind_Parameter_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ESG_Ind_Parameterwert_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESG Individuelle Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ESG_Individuelle_Merkmale_AttributeGroupImpl#getESGIndErlaeuterung <em>ESG Ind Erlaeuterung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ESG_Individuelle_Merkmale_AttributeGroupImpl#getESGIndParameter <em>ESG Ind Parameter</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ESG_Individuelle_Merkmale_AttributeGroupImpl#getESGIndParameterwert <em>ESG Ind Parameterwert</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESG_Individuelle_Merkmale_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ESG_Individuelle_Merkmale_AttributeGroup {
	/**
	 * The cached value of the '{@link #getESGIndErlaeuterung() <em>ESG Ind Erlaeuterung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESGIndErlaeuterung()
	 * @generated
	 * @ordered
	 */
	protected ESG_Ind_Erlaeuterung_TypeClass eSGIndErlaeuterung;

	/**
	 * The cached value of the '{@link #getESGIndParameter() <em>ESG Ind Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESGIndParameter()
	 * @generated
	 * @ordered
	 */
	protected ESG_Ind_Parameter_TypeClass eSGIndParameter;

	/**
	 * The cached value of the '{@link #getESGIndParameterwert() <em>ESG Ind Parameterwert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESGIndParameterwert()
	 * @generated
	 * @ordered
	 */
	protected ESG_Ind_Parameterwert_TypeClass eSGIndParameterwert;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESG_Individuelle_Merkmale_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getESG_Individuelle_Merkmale_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESG_Ind_Erlaeuterung_TypeClass getESGIndErlaeuterung() {
		return eSGIndErlaeuterung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetESGIndErlaeuterung(ESG_Ind_Erlaeuterung_TypeClass newESGIndErlaeuterung, NotificationChain msgs) {
		ESG_Ind_Erlaeuterung_TypeClass oldESGIndErlaeuterung = eSGIndErlaeuterung;
		eSGIndErlaeuterung = newESGIndErlaeuterung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_ERLAEUTERUNG, oldESGIndErlaeuterung, newESGIndErlaeuterung);
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
	public void setESGIndErlaeuterung(ESG_Ind_Erlaeuterung_TypeClass newESGIndErlaeuterung) {
		if (newESGIndErlaeuterung != eSGIndErlaeuterung) {
			NotificationChain msgs = null;
			if (eSGIndErlaeuterung != null)
				msgs = ((InternalEObject)eSGIndErlaeuterung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_ERLAEUTERUNG, null, msgs);
			if (newESGIndErlaeuterung != null)
				msgs = ((InternalEObject)newESGIndErlaeuterung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_ERLAEUTERUNG, null, msgs);
			msgs = basicSetESGIndErlaeuterung(newESGIndErlaeuterung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_ERLAEUTERUNG, newESGIndErlaeuterung, newESGIndErlaeuterung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESG_Ind_Parameter_TypeClass getESGIndParameter() {
		return eSGIndParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetESGIndParameter(ESG_Ind_Parameter_TypeClass newESGIndParameter, NotificationChain msgs) {
		ESG_Ind_Parameter_TypeClass oldESGIndParameter = eSGIndParameter;
		eSGIndParameter = newESGIndParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETER, oldESGIndParameter, newESGIndParameter);
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
	public void setESGIndParameter(ESG_Ind_Parameter_TypeClass newESGIndParameter) {
		if (newESGIndParameter != eSGIndParameter) {
			NotificationChain msgs = null;
			if (eSGIndParameter != null)
				msgs = ((InternalEObject)eSGIndParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETER, null, msgs);
			if (newESGIndParameter != null)
				msgs = ((InternalEObject)newESGIndParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETER, null, msgs);
			msgs = basicSetESGIndParameter(newESGIndParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETER, newESGIndParameter, newESGIndParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESG_Ind_Parameterwert_TypeClass getESGIndParameterwert() {
		return eSGIndParameterwert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetESGIndParameterwert(ESG_Ind_Parameterwert_TypeClass newESGIndParameterwert, NotificationChain msgs) {
		ESG_Ind_Parameterwert_TypeClass oldESGIndParameterwert = eSGIndParameterwert;
		eSGIndParameterwert = newESGIndParameterwert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETERWERT, oldESGIndParameterwert, newESGIndParameterwert);
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
	public void setESGIndParameterwert(ESG_Ind_Parameterwert_TypeClass newESGIndParameterwert) {
		if (newESGIndParameterwert != eSGIndParameterwert) {
			NotificationChain msgs = null;
			if (eSGIndParameterwert != null)
				msgs = ((InternalEObject)eSGIndParameterwert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETERWERT, null, msgs);
			if (newESGIndParameterwert != null)
				msgs = ((InternalEObject)newESGIndParameterwert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETERWERT, null, msgs);
			msgs = basicSetESGIndParameterwert(newESGIndParameterwert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETERWERT, newESGIndParameterwert, newESGIndParameterwert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_ERLAEUTERUNG:
				return basicSetESGIndErlaeuterung(null, msgs);
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETER:
				return basicSetESGIndParameter(null, msgs);
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETERWERT:
				return basicSetESGIndParameterwert(null, msgs);
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
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_ERLAEUTERUNG:
				return getESGIndErlaeuterung();
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETER:
				return getESGIndParameter();
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETERWERT:
				return getESGIndParameterwert();
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
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_ERLAEUTERUNG:
				setESGIndErlaeuterung((ESG_Ind_Erlaeuterung_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETER:
				setESGIndParameter((ESG_Ind_Parameter_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETERWERT:
				setESGIndParameterwert((ESG_Ind_Parameterwert_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_ERLAEUTERUNG:
				setESGIndErlaeuterung((ESG_Ind_Erlaeuterung_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETER:
				setESGIndParameter((ESG_Ind_Parameter_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETERWERT:
				setESGIndParameterwert((ESG_Ind_Parameterwert_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_ERLAEUTERUNG:
				return eSGIndErlaeuterung != null;
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETER:
				return eSGIndParameter != null;
			case Balisentechnik_ETCSPackage.ESG_INDIVIDUELLE_MERKMALE_ATTRIBUTE_GROUP__ESG_IND_PARAMETERWERT:
				return eSGIndParameterwert != null;
		}
		return super.eIsSet(featureID);
	}

} //ESG_Individuelle_Merkmale_AttributeGroupImpl
