/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bgrenze_RBC_Wechsel_AttributeGroup;

import org.eclipse.set.model.model1902.Verweise.ID_RBC_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB Bgrenze RBC Wechsel Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_Bgrenze_RBC_Wechsel_AttributeGroupImpl#getBgrenzeRBCWechselBTSKette <em>Bgrenze RBC Wechsel BTS Kette</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_Bgrenze_RBC_Wechsel_AttributeGroupImpl#getIDRBCNachGrenze <em>IDRBC Nach Grenze</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_Bgrenze_RBC_Wechsel_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZUB_Bgrenze_RBC_Wechsel_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBgrenzeRBCWechselBTSKette() <em>Bgrenze RBC Wechsel BTS Kette</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgrenzeRBCWechselBTSKette()
	 * @generated
	 * @ordered
	 */
	protected EList<Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup> bgrenzeRBCWechselBTSKette;

	/**
	 * The cached value of the '{@link #getIDRBCNachGrenze() <em>IDRBC Nach Grenze</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRBCNachGrenze()
	 * @generated
	 * @ordered
	 */
	protected ID_RBC_TypeClass iDRBCNachGrenze;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZUB_Bgrenze_RBC_Wechsel_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bgrenze_RBC_Wechsel_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup> getBgrenzeRBCWechselBTSKette() {
		if (bgrenzeRBCWechselBTSKette == null) {
			bgrenzeRBCWechselBTSKette = new EObjectContainmentEList<Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup>(Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup.class, this, Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__BGRENZE_RBC_WECHSEL_BTS_KETTE);
		}
		return bgrenzeRBCWechselBTSKette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_RBC_TypeClass getIDRBCNachGrenze() {
		return iDRBCNachGrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDRBCNachGrenze(ID_RBC_TypeClass newIDRBCNachGrenze, NotificationChain msgs) {
		ID_RBC_TypeClass oldIDRBCNachGrenze = iDRBCNachGrenze;
		iDRBCNachGrenze = newIDRBCNachGrenze;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE, oldIDRBCNachGrenze, newIDRBCNachGrenze);
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
	public void setIDRBCNachGrenze(ID_RBC_TypeClass newIDRBCNachGrenze) {
		if (newIDRBCNachGrenze != iDRBCNachGrenze) {
			NotificationChain msgs = null;
			if (iDRBCNachGrenze != null)
				msgs = ((InternalEObject)iDRBCNachGrenze).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE, null, msgs);
			if (newIDRBCNachGrenze != null)
				msgs = ((InternalEObject)newIDRBCNachGrenze).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE, null, msgs);
			msgs = basicSetIDRBCNachGrenze(newIDRBCNachGrenze, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE, newIDRBCNachGrenze, newIDRBCNachGrenze));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__BGRENZE_RBC_WECHSEL_BTS_KETTE:
				return ((InternalEList<?>)getBgrenzeRBCWechselBTSKette()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				return basicSetIDRBCNachGrenze(null, msgs);
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
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__BGRENZE_RBC_WECHSEL_BTS_KETTE:
				return getBgrenzeRBCWechselBTSKette();
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				return getIDRBCNachGrenze();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__BGRENZE_RBC_WECHSEL_BTS_KETTE:
				getBgrenzeRBCWechselBTSKette().clear();
				getBgrenzeRBCWechselBTSKette().addAll((Collection<? extends Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				setIDRBCNachGrenze((ID_RBC_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__BGRENZE_RBC_WECHSEL_BTS_KETTE:
				getBgrenzeRBCWechselBTSKette().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				setIDRBCNachGrenze((ID_RBC_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__BGRENZE_RBC_WECHSEL_BTS_KETTE:
				return bgrenzeRBCWechselBTSKette != null && !bgrenzeRBCWechselBTSKette.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				return iDRBCNachGrenze != null;
		}
		return super.eIsSet(featureID);
	}

} //ZUB_Bgrenze_RBC_Wechsel_AttributeGroupImpl
