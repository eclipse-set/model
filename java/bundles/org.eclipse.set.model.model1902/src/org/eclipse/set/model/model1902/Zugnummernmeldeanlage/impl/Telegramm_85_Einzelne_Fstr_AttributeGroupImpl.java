/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Verweise.ID_Fstr_Zug_Rangier_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_ZLV_Bus_TypeClass;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.Telegramm_85_Einzelne_Fstr_AttributeGroup;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telegramm 85 Einzelne Fstr Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.Telegramm_85_Einzelne_Fstr_AttributeGroupImpl#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.Telegramm_85_Einzelne_Fstr_AttributeGroupImpl#getIDZLVBus <em>IDZLV Bus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Telegramm_85_Einzelne_Fstr_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Telegramm_85_Einzelne_Fstr_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDFstrZugRangier() <em>ID Fstr Zug Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrZugRangier()
	 * @generated
	 * @ordered
	 */
	protected ID_Fstr_Zug_Rangier_TypeClass iDFstrZugRangier;

	/**
	 * The cached value of the '{@link #getIDZLVBus() <em>IDZLV Bus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLVBus()
	 * @generated
	 * @ordered
	 */
	protected ID_ZLV_Bus_TypeClass iDZLVBus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Telegramm_85_Einzelne_Fstr_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_Zug_Rangier_TypeClass getIDFstrZugRangier() {
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass newIDFstrZugRangier, NotificationChain msgs) {
		ID_Fstr_Zug_Rangier_TypeClass oldIDFstrZugRangier = iDFstrZugRangier;
		iDFstrZugRangier = newIDFstrZugRangier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, newIDFstrZugRangier);
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
	public void setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass newIDFstrZugRangier) {
		if (newIDFstrZugRangier != iDFstrZugRangier) {
			NotificationChain msgs = null;
			if (iDFstrZugRangier != null)
				msgs = ((InternalEObject)iDFstrZugRangier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER, null, msgs);
			if (newIDFstrZugRangier != null)
				msgs = ((InternalEObject)newIDFstrZugRangier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER, null, msgs);
			msgs = basicSetIDFstrZugRangier(newIDFstrZugRangier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER, newIDFstrZugRangier, newIDFstrZugRangier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZLV_Bus_TypeClass getIDZLVBus() {
		return iDZLVBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZLVBus(ID_ZLV_Bus_TypeClass newIDZLVBus, NotificationChain msgs) {
		ID_ZLV_Bus_TypeClass oldIDZLVBus = iDZLVBus;
		iDZLVBus = newIDZLVBus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS, oldIDZLVBus, newIDZLVBus);
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
	public void setIDZLVBus(ID_ZLV_Bus_TypeClass newIDZLVBus) {
		if (newIDZLVBus != iDZLVBus) {
			NotificationChain msgs = null;
			if (iDZLVBus != null)
				msgs = ((InternalEObject)iDZLVBus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS, null, msgs);
			if (newIDZLVBus != null)
				msgs = ((InternalEObject)newIDZLVBus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS, null, msgs);
			msgs = basicSetIDZLVBus(newIDZLVBus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS, newIDZLVBus, newIDZLVBus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				return basicSetIDFstrZugRangier(null, msgs);
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				return basicSetIDZLVBus(null, msgs);
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				return getIDFstrZugRangier();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				return getIDZLVBus();
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((ID_Fstr_Zug_Rangier_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				setIDZLVBus((ID_ZLV_Bus_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((ID_Fstr_Zug_Rangier_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				setIDZLVBus((ID_ZLV_Bus_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				return iDFstrZugRangier != null;
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				return iDZLVBus != null;
		}
		return super.eIsSet(featureID);
	}

} //Telegramm_85_Einzelne_Fstr_AttributeGroupImpl
