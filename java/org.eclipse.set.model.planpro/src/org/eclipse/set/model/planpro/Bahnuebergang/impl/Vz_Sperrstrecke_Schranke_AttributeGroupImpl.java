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
import org.eclipse.set.model.planpro.Bahnuebergang.Raeumstrecke_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Teilsperrstrecke_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Vz_Sperrstrecke_Schranke_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vz Sperrstrecke Schranke Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Vz_Sperrstrecke_Schranke_AttributeGroupImpl#getRaeumstrecke <em>Raeumstrecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Vz_Sperrstrecke_Schranke_AttributeGroupImpl#getTeilsperrstrecke <em>Teilsperrstrecke</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Vz_Sperrstrecke_Schranke_AttributeGroupImpl extends EObjectImpl implements Vz_Sperrstrecke_Schranke_AttributeGroup {
	/**
	 * The cached value of the '{@link #getRaeumstrecke() <em>Raeumstrecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaeumstrecke()
	 * @generated
	 * @ordered
	 */
	protected Raeumstrecke_TypeClass raeumstrecke;

	/**
	 * The cached value of the '{@link #getTeilsperrstrecke() <em>Teilsperrstrecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeilsperrstrecke()
	 * @generated
	 * @ordered
	 */
	protected Teilsperrstrecke_TypeClass teilsperrstrecke;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vz_Sperrstrecke_Schranke_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getVz_Sperrstrecke_Schranke_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Raeumstrecke_TypeClass getRaeumstrecke() {
		return raeumstrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRaeumstrecke(Raeumstrecke_TypeClass newRaeumstrecke, NotificationChain msgs) {
		Raeumstrecke_TypeClass oldRaeumstrecke = raeumstrecke;
		raeumstrecke = newRaeumstrecke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__RAEUMSTRECKE, oldRaeumstrecke, newRaeumstrecke);
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
	public void setRaeumstrecke(Raeumstrecke_TypeClass newRaeumstrecke) {
		if (newRaeumstrecke != raeumstrecke) {
			NotificationChain msgs = null;
			if (raeumstrecke != null)
				msgs = ((InternalEObject)raeumstrecke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__RAEUMSTRECKE, null, msgs);
			if (newRaeumstrecke != null)
				msgs = ((InternalEObject)newRaeumstrecke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__RAEUMSTRECKE, null, msgs);
			msgs = basicSetRaeumstrecke(newRaeumstrecke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__RAEUMSTRECKE, newRaeumstrecke, newRaeumstrecke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Teilsperrstrecke_TypeClass getTeilsperrstrecke() {
		return teilsperrstrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeilsperrstrecke(Teilsperrstrecke_TypeClass newTeilsperrstrecke, NotificationChain msgs) {
		Teilsperrstrecke_TypeClass oldTeilsperrstrecke = teilsperrstrecke;
		teilsperrstrecke = newTeilsperrstrecke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__TEILSPERRSTRECKE, oldTeilsperrstrecke, newTeilsperrstrecke);
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
	public void setTeilsperrstrecke(Teilsperrstrecke_TypeClass newTeilsperrstrecke) {
		if (newTeilsperrstrecke != teilsperrstrecke) {
			NotificationChain msgs = null;
			if (teilsperrstrecke != null)
				msgs = ((InternalEObject)teilsperrstrecke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__TEILSPERRSTRECKE, null, msgs);
			if (newTeilsperrstrecke != null)
				msgs = ((InternalEObject)newTeilsperrstrecke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__TEILSPERRSTRECKE, null, msgs);
			msgs = basicSetTeilsperrstrecke(newTeilsperrstrecke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__TEILSPERRSTRECKE, newTeilsperrstrecke, newTeilsperrstrecke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__RAEUMSTRECKE:
				return basicSetRaeumstrecke(null, msgs);
			case BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__TEILSPERRSTRECKE:
				return basicSetTeilsperrstrecke(null, msgs);
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
			case BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__RAEUMSTRECKE:
				return getRaeumstrecke();
			case BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__TEILSPERRSTRECKE:
				return getTeilsperrstrecke();
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
			case BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__RAEUMSTRECKE:
				setRaeumstrecke((Raeumstrecke_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__TEILSPERRSTRECKE:
				setTeilsperrstrecke((Teilsperrstrecke_TypeClass)newValue);
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
			case BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__RAEUMSTRECKE:
				setRaeumstrecke((Raeumstrecke_TypeClass)null);
				return;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__TEILSPERRSTRECKE:
				setTeilsperrstrecke((Teilsperrstrecke_TypeClass)null);
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
			case BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__RAEUMSTRECKE:
				return raeumstrecke != null;
			case BahnuebergangPackage.VZ_SPERRSTRECKE_SCHRANKE_ATTRIBUTE_GROUP__TEILSPERRSTRECKE:
				return teilsperrstrecke != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Vz_Sperrstrecke_Schranke_AttributeGroupImpl
