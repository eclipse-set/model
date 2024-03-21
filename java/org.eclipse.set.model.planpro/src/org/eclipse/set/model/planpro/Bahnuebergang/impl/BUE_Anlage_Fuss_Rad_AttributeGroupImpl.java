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

import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_Fuss_Rad_AttributeGroup;
import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.planpro.Bahnuebergang.Fuss_Radweg_Art_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Fuss_Radweg_Seite_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Anlage Fuss Rad Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Anlage_Fuss_Rad_AttributeGroupImpl#getFussRadwegArt <em>Fuss Radweg Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Anlage_Fuss_Rad_AttributeGroupImpl#getFussRadwegSeite <em>Fuss Radweg Seite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Anlage_Fuss_Rad_AttributeGroupImpl extends EObjectImpl implements BUE_Anlage_Fuss_Rad_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFussRadwegArt() <em>Fuss Radweg Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFussRadwegArt()
	 * @generated
	 * @ordered
	 */
	protected Fuss_Radweg_Art_TypeClass fussRadwegArt;

	/**
	 * The cached value of the '{@link #getFussRadwegSeite() <em>Fuss Radweg Seite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFussRadwegSeite()
	 * @generated
	 * @ordered
	 */
	protected Fuss_Radweg_Seite_TypeClass fussRadwegSeite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Anlage_Fuss_Rad_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Anlage_Fuss_Rad_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fuss_Radweg_Art_TypeClass getFussRadwegArt() {
		return fussRadwegArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFussRadwegArt(Fuss_Radweg_Art_TypeClass newFussRadwegArt, NotificationChain msgs) {
		Fuss_Radweg_Art_TypeClass oldFussRadwegArt = fussRadwegArt;
		fussRadwegArt = newFussRadwegArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_ART, oldFussRadwegArt, newFussRadwegArt);
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
	public void setFussRadwegArt(Fuss_Radweg_Art_TypeClass newFussRadwegArt) {
		if (newFussRadwegArt != fussRadwegArt) {
			NotificationChain msgs = null;
			if (fussRadwegArt != null)
				msgs = ((InternalEObject)fussRadwegArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_ART, null, msgs);
			if (newFussRadwegArt != null)
				msgs = ((InternalEObject)newFussRadwegArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_ART, null, msgs);
			msgs = basicSetFussRadwegArt(newFussRadwegArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_ART, newFussRadwegArt, newFussRadwegArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fuss_Radweg_Seite_TypeClass getFussRadwegSeite() {
		return fussRadwegSeite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFussRadwegSeite(Fuss_Radweg_Seite_TypeClass newFussRadwegSeite, NotificationChain msgs) {
		Fuss_Radweg_Seite_TypeClass oldFussRadwegSeite = fussRadwegSeite;
		fussRadwegSeite = newFussRadwegSeite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_SEITE, oldFussRadwegSeite, newFussRadwegSeite);
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
	public void setFussRadwegSeite(Fuss_Radweg_Seite_TypeClass newFussRadwegSeite) {
		if (newFussRadwegSeite != fussRadwegSeite) {
			NotificationChain msgs = null;
			if (fussRadwegSeite != null)
				msgs = ((InternalEObject)fussRadwegSeite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_SEITE, null, msgs);
			if (newFussRadwegSeite != null)
				msgs = ((InternalEObject)newFussRadwegSeite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_SEITE, null, msgs);
			msgs = basicSetFussRadwegSeite(newFussRadwegSeite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_SEITE, newFussRadwegSeite, newFussRadwegSeite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_ART:
				return basicSetFussRadwegArt(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_SEITE:
				return basicSetFussRadwegSeite(null, msgs);
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
			case BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_ART:
				return getFussRadwegArt();
			case BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_SEITE:
				return getFussRadwegSeite();
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
			case BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_ART:
				setFussRadwegArt((Fuss_Radweg_Art_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_SEITE:
				setFussRadwegSeite((Fuss_Radweg_Seite_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_ART:
				setFussRadwegArt((Fuss_Radweg_Art_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_SEITE:
				setFussRadwegSeite((Fuss_Radweg_Seite_TypeClass)null);
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
			case BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_ART:
				return fussRadwegArt != null;
			case BahnuebergangPackage.BUE_ANLAGE_FUSS_RAD_ATTRIBUTE_GROUP__FUSS_RADWEG_SEITE:
				return fussRadwegSeite != null;
		}
		return super.eIsSet(featureID);
	}

} //BUE_Anlage_Fuss_Rad_AttributeGroupImpl
