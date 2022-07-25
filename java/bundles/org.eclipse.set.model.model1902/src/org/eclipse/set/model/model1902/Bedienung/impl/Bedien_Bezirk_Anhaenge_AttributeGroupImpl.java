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

import org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup;
import org.eclipse.set.model.model1902.Bedienung.BedienungPackage;

import org.eclipse.set.model.model1902.Verweise.ID_Anhang_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Bezirk Anhaenge Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Bezirk_Anhaenge_AttributeGroupImpl#getIDAnhangAnbindungIB2 <em>ID Anhang Anbindung IB2</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Bezirk_Anhaenge_AttributeGroupImpl#getIDAnhangAnbindungIB3 <em>ID Anhang Anbindung IB3</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.impl.Bedien_Bezirk_Anhaenge_AttributeGroupImpl#getIDAnhangSteuerbezUebersicht <em>ID Anhang Steuerbez Uebersicht</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Bezirk_Anhaenge_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Bedien_Bezirk_Anhaenge_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDAnhangAnbindungIB2() <em>ID Anhang Anbindung IB2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangAnbindungIB2()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangAnbindungIB2;

	/**
	 * The cached value of the '{@link #getIDAnhangAnbindungIB3() <em>ID Anhang Anbindung IB3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangAnbindungIB3()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangAnbindungIB3;

	/**
	 * The cached value of the '{@link #getIDAnhangSteuerbezUebersicht() <em>ID Anhang Steuerbez Uebersicht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangSteuerbezUebersicht()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangSteuerbezUebersicht;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Bezirk_Anhaenge_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass getIDAnhangAnbindungIB2() {
		return iDAnhangAnbindungIB2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangAnbindungIB2(ID_Anhang_TypeClass newIDAnhangAnbindungIB2, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangAnbindungIB2 = iDAnhangAnbindungIB2;
		iDAnhangAnbindungIB2 = newIDAnhangAnbindungIB2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2, oldIDAnhangAnbindungIB2, newIDAnhangAnbindungIB2);
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
	public void setIDAnhangAnbindungIB2(ID_Anhang_TypeClass newIDAnhangAnbindungIB2) {
		if (newIDAnhangAnbindungIB2 != iDAnhangAnbindungIB2) {
			NotificationChain msgs = null;
			if (iDAnhangAnbindungIB2 != null)
				msgs = ((InternalEObject)iDAnhangAnbindungIB2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2, null, msgs);
			if (newIDAnhangAnbindungIB2 != null)
				msgs = ((InternalEObject)newIDAnhangAnbindungIB2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2, null, msgs);
			msgs = basicSetIDAnhangAnbindungIB2(newIDAnhangAnbindungIB2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2, newIDAnhangAnbindungIB2, newIDAnhangAnbindungIB2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass getIDAnhangAnbindungIB3() {
		return iDAnhangAnbindungIB3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangAnbindungIB3(ID_Anhang_TypeClass newIDAnhangAnbindungIB3, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangAnbindungIB3 = iDAnhangAnbindungIB3;
		iDAnhangAnbindungIB3 = newIDAnhangAnbindungIB3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3, oldIDAnhangAnbindungIB3, newIDAnhangAnbindungIB3);
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
	public void setIDAnhangAnbindungIB3(ID_Anhang_TypeClass newIDAnhangAnbindungIB3) {
		if (newIDAnhangAnbindungIB3 != iDAnhangAnbindungIB3) {
			NotificationChain msgs = null;
			if (iDAnhangAnbindungIB3 != null)
				msgs = ((InternalEObject)iDAnhangAnbindungIB3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3, null, msgs);
			if (newIDAnhangAnbindungIB3 != null)
				msgs = ((InternalEObject)newIDAnhangAnbindungIB3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3, null, msgs);
			msgs = basicSetIDAnhangAnbindungIB3(newIDAnhangAnbindungIB3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3, newIDAnhangAnbindungIB3, newIDAnhangAnbindungIB3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass getIDAnhangSteuerbezUebersicht() {
		return iDAnhangSteuerbezUebersicht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangSteuerbezUebersicht(ID_Anhang_TypeClass newIDAnhangSteuerbezUebersicht, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangSteuerbezUebersicht = iDAnhangSteuerbezUebersicht;
		iDAnhangSteuerbezUebersicht = newIDAnhangSteuerbezUebersicht;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT, oldIDAnhangSteuerbezUebersicht, newIDAnhangSteuerbezUebersicht);
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
	public void setIDAnhangSteuerbezUebersicht(ID_Anhang_TypeClass newIDAnhangSteuerbezUebersicht) {
		if (newIDAnhangSteuerbezUebersicht != iDAnhangSteuerbezUebersicht) {
			NotificationChain msgs = null;
			if (iDAnhangSteuerbezUebersicht != null)
				msgs = ((InternalEObject)iDAnhangSteuerbezUebersicht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT, null, msgs);
			if (newIDAnhangSteuerbezUebersicht != null)
				msgs = ((InternalEObject)newIDAnhangSteuerbezUebersicht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT, null, msgs);
			msgs = basicSetIDAnhangSteuerbezUebersicht(newIDAnhangSteuerbezUebersicht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT, newIDAnhangSteuerbezUebersicht, newIDAnhangSteuerbezUebersicht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2:
				return basicSetIDAnhangAnbindungIB2(null, msgs);
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3:
				return basicSetIDAnhangAnbindungIB3(null, msgs);
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT:
				return basicSetIDAnhangSteuerbezUebersicht(null, msgs);
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
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2:
				return getIDAnhangAnbindungIB2();
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3:
				return getIDAnhangAnbindungIB3();
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT:
				return getIDAnhangSteuerbezUebersicht();
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
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2:
				setIDAnhangAnbindungIB2((ID_Anhang_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3:
				setIDAnhangAnbindungIB3((ID_Anhang_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT:
				setIDAnhangSteuerbezUebersicht((ID_Anhang_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2:
				setIDAnhangAnbindungIB2((ID_Anhang_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3:
				setIDAnhangAnbindungIB3((ID_Anhang_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT:
				setIDAnhangSteuerbezUebersicht((ID_Anhang_TypeClass)null);
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
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2:
				return iDAnhangAnbindungIB2 != null;
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3:
				return iDAnhangAnbindungIB3 != null;
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT:
				return iDAnhangSteuerbezUebersicht != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_Bezirk_Anhaenge_AttributeGroupImpl
