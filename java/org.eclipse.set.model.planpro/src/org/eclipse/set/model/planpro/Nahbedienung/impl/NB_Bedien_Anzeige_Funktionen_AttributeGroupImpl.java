/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Nahbedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup;
import org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage;
import org.eclipse.set.model.planpro.Nahbedienung.Taste_ANF_TypeClass;
import org.eclipse.set.model.planpro.Nahbedienung.Taste_FGT_TypeClass;
import org.eclipse.set.model.planpro.Nahbedienung.Taste_WGT_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB Bedien Anzeige Funktionen Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bedien_Anzeige_Funktionen_AttributeGroupImpl#getTasteANF <em>Taste ANF</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bedien_Anzeige_Funktionen_AttributeGroupImpl#getTasteFGT <em>Taste FGT</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Bedien_Anzeige_Funktionen_AttributeGroupImpl#getTasteWGT <em>Taste WGT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NB_Bedien_Anzeige_Funktionen_AttributeGroupImpl extends EObjectImpl implements NB_Bedien_Anzeige_Funktionen_AttributeGroup {
	/**
	 * The cached value of the '{@link #getTasteANF() <em>Taste ANF</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasteANF()
	 * @generated
	 * @ordered
	 */
	protected Taste_ANF_TypeClass tasteANF;

	/**
	 * The cached value of the '{@link #getTasteFGT() <em>Taste FGT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasteFGT()
	 * @generated
	 * @ordered
	 */
	protected Taste_FGT_TypeClass tasteFGT;

	/**
	 * The cached value of the '{@link #getTasteWGT() <em>Taste WGT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasteWGT()
	 * @generated
	 * @ordered
	 */
	protected Taste_WGT_TypeClass tasteWGT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Bedien_Anzeige_Funktionen_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NahbedienungPackage.Literals.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Taste_ANF_TypeClass getTasteANF() {
		return tasteANF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTasteANF(Taste_ANF_TypeClass newTasteANF, NotificationChain msgs) {
		Taste_ANF_TypeClass oldTasteANF = tasteANF;
		tasteANF = newTasteANF;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_ANF, oldTasteANF, newTasteANF);
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
	public void setTasteANF(Taste_ANF_TypeClass newTasteANF) {
		if (newTasteANF != tasteANF) {
			NotificationChain msgs = null;
			if (tasteANF != null)
				msgs = ((InternalEObject)tasteANF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_ANF, null, msgs);
			if (newTasteANF != null)
				msgs = ((InternalEObject)newTasteANF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_ANF, null, msgs);
			msgs = basicSetTasteANF(newTasteANF, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_ANF, newTasteANF, newTasteANF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Taste_FGT_TypeClass getTasteFGT() {
		return tasteFGT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTasteFGT(Taste_FGT_TypeClass newTasteFGT, NotificationChain msgs) {
		Taste_FGT_TypeClass oldTasteFGT = tasteFGT;
		tasteFGT = newTasteFGT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_FGT, oldTasteFGT, newTasteFGT);
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
	public void setTasteFGT(Taste_FGT_TypeClass newTasteFGT) {
		if (newTasteFGT != tasteFGT) {
			NotificationChain msgs = null;
			if (tasteFGT != null)
				msgs = ((InternalEObject)tasteFGT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_FGT, null, msgs);
			if (newTasteFGT != null)
				msgs = ((InternalEObject)newTasteFGT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_FGT, null, msgs);
			msgs = basicSetTasteFGT(newTasteFGT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_FGT, newTasteFGT, newTasteFGT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Taste_WGT_TypeClass getTasteWGT() {
		return tasteWGT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTasteWGT(Taste_WGT_TypeClass newTasteWGT, NotificationChain msgs) {
		Taste_WGT_TypeClass oldTasteWGT = tasteWGT;
		tasteWGT = newTasteWGT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_WGT, oldTasteWGT, newTasteWGT);
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
	public void setTasteWGT(Taste_WGT_TypeClass newTasteWGT) {
		if (newTasteWGT != tasteWGT) {
			NotificationChain msgs = null;
			if (tasteWGT != null)
				msgs = ((InternalEObject)tasteWGT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_WGT, null, msgs);
			if (newTasteWGT != null)
				msgs = ((InternalEObject)newTasteWGT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_WGT, null, msgs);
			msgs = basicSetTasteWGT(newTasteWGT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_WGT, newTasteWGT, newTasteWGT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_ANF:
				return basicSetTasteANF(null, msgs);
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_FGT:
				return basicSetTasteFGT(null, msgs);
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_WGT:
				return basicSetTasteWGT(null, msgs);
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
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_ANF:
				return getTasteANF();
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_FGT:
				return getTasteFGT();
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_WGT:
				return getTasteWGT();
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
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_ANF:
				setTasteANF((Taste_ANF_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_FGT:
				setTasteFGT((Taste_FGT_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_WGT:
				setTasteWGT((Taste_WGT_TypeClass)newValue);
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
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_ANF:
				setTasteANF((Taste_ANF_TypeClass)null);
				return;
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_FGT:
				setTasteFGT((Taste_FGT_TypeClass)null);
				return;
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_WGT:
				setTasteWGT((Taste_WGT_TypeClass)null);
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
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_ANF:
				return tasteANF != null;
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_FGT:
				return tasteFGT != null;
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_WGT:
				return tasteWGT != null;
		}
		return super.eIsSet(featureID);
	}

} //NB_Bedien_Anzeige_Funktionen_AttributeGroupImpl
