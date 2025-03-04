/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.planpro.Bahnuebergang.Bez_Schrankenantrieb_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Schrankenantrieb_Bezeichnung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schrankenantrieb Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Schrankenantrieb_Bezeichnung_AttributeGroupImpl#getBezSchrankenantrieb <em>Bez Schrankenantrieb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Schrankenantrieb_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Schrankenantrieb_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezSchrankenantrieb() <em>Bez Schrankenantrieb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezSchrankenantrieb()
	 * @generated
	 * @ordered
	 */
	protected Bez_Schrankenantrieb_TypeClass bezSchrankenantrieb;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schrankenantrieb_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getSchrankenantrieb_Bezeichnung_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_Schrankenantrieb_TypeClass getBezSchrankenantrieb() {
		return bezSchrankenantrieb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezSchrankenantrieb(Bez_Schrankenantrieb_TypeClass newBezSchrankenantrieb, NotificationChain msgs) {
		Bez_Schrankenantrieb_TypeClass oldBezSchrankenantrieb = bezSchrankenantrieb;
		bezSchrankenantrieb = newBezSchrankenantrieb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHRANKENANTRIEB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_SCHRANKENANTRIEB, oldBezSchrankenantrieb, newBezSchrankenantrieb);
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
	public void setBezSchrankenantrieb(Bez_Schrankenantrieb_TypeClass newBezSchrankenantrieb) {
		if (newBezSchrankenantrieb != bezSchrankenantrieb) {
			NotificationChain msgs = null;
			if (bezSchrankenantrieb != null)
				msgs = ((InternalEObject)bezSchrankenantrieb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHRANKENANTRIEB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_SCHRANKENANTRIEB, null, msgs);
			if (newBezSchrankenantrieb != null)
				msgs = ((InternalEObject)newBezSchrankenantrieb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHRANKENANTRIEB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_SCHRANKENANTRIEB, null, msgs);
			msgs = basicSetBezSchrankenantrieb(newBezSchrankenantrieb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHRANKENANTRIEB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_SCHRANKENANTRIEB, newBezSchrankenantrieb, newBezSchrankenantrieb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.SCHRANKENANTRIEB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_SCHRANKENANTRIEB:
				return basicSetBezSchrankenantrieb(null, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BahnuebergangPackage.SCHRANKENANTRIEB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_SCHRANKENANTRIEB:
				return getBezSchrankenantrieb();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BahnuebergangPackage.SCHRANKENANTRIEB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_SCHRANKENANTRIEB:
				setBezSchrankenantrieb((Bez_Schrankenantrieb_TypeClass)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BahnuebergangPackage.SCHRANKENANTRIEB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_SCHRANKENANTRIEB:
				setBezSchrankenantrieb((Bez_Schrankenantrieb_TypeClass)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BahnuebergangPackage.SCHRANKENANTRIEB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_SCHRANKENANTRIEB:
				return bezSchrankenantrieb != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Schrankenantrieb_Bezeichnung_AttributeGroupImpl
