/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Bahnuebergang.BUE_Einschaltung;
import org.eclipse.set.model.model11001.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup;
import org.eclipse.set.model.model11001.Bahnuebergang.BUE_Funktionsueberwachung_TypeClass;
import org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Einschaltung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.BUE_EinschaltungImpl#getBUEEinschaltungHp <em>BUE Einschaltung Hp</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.BUE_EinschaltungImpl#getBUEFunktionsueberwachung <em>BUE Funktionsueberwachung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_EinschaltungImpl extends Basis_ObjektImpl implements BUE_Einschaltung {
	/**
	 * The cached value of the '{@link #getBUEEinschaltungHp() <em>BUE Einschaltung Hp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEEinschaltungHp()
	 * @generated
	 * @ordered
	 */
	protected BUE_Einschaltung_Hp_AttributeGroup bUEEinschaltungHp;

	/**
	 * The cached value of the '{@link #getBUEFunktionsueberwachung() <em>BUE Funktionsueberwachung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEFunktionsueberwachung()
	 * @generated
	 * @ordered
	 */
	protected BUE_Funktionsueberwachung_TypeClass bUEFunktionsueberwachung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_EinschaltungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Einschaltung();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Einschaltung_Hp_AttributeGroup getBUEEinschaltungHp() {
		return bUEEinschaltungHp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUEEinschaltungHp(BUE_Einschaltung_Hp_AttributeGroup newBUEEinschaltungHp, NotificationChain msgs) {
		BUE_Einschaltung_Hp_AttributeGroup oldBUEEinschaltungHp = bUEEinschaltungHp;
		bUEEinschaltungHp = newBUEEinschaltungHp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_EINSCHALTUNG_HP, oldBUEEinschaltungHp, newBUEEinschaltungHp);
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
	public void setBUEEinschaltungHp(BUE_Einschaltung_Hp_AttributeGroup newBUEEinschaltungHp) {
		if (newBUEEinschaltungHp != bUEEinschaltungHp) {
			NotificationChain msgs = null;
			if (bUEEinschaltungHp != null)
				msgs = ((InternalEObject)bUEEinschaltungHp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_EINSCHALTUNG_HP, null, msgs);
			if (newBUEEinschaltungHp != null)
				msgs = ((InternalEObject)newBUEEinschaltungHp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_EINSCHALTUNG_HP, null, msgs);
			msgs = basicSetBUEEinschaltungHp(newBUEEinschaltungHp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_EINSCHALTUNG_HP, newBUEEinschaltungHp, newBUEEinschaltungHp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Funktionsueberwachung_TypeClass getBUEFunktionsueberwachung() {
		return bUEFunktionsueberwachung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUEFunktionsueberwachung(BUE_Funktionsueberwachung_TypeClass newBUEFunktionsueberwachung, NotificationChain msgs) {
		BUE_Funktionsueberwachung_TypeClass oldBUEFunktionsueberwachung = bUEFunktionsueberwachung;
		bUEFunktionsueberwachung = newBUEFunktionsueberwachung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_FUNKTIONSUEBERWACHUNG, oldBUEFunktionsueberwachung, newBUEFunktionsueberwachung);
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
	public void setBUEFunktionsueberwachung(BUE_Funktionsueberwachung_TypeClass newBUEFunktionsueberwachung) {
		if (newBUEFunktionsueberwachung != bUEFunktionsueberwachung) {
			NotificationChain msgs = null;
			if (bUEFunktionsueberwachung != null)
				msgs = ((InternalEObject)bUEFunktionsueberwachung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_FUNKTIONSUEBERWACHUNG, null, msgs);
			if (newBUEFunktionsueberwachung != null)
				msgs = ((InternalEObject)newBUEFunktionsueberwachung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_FUNKTIONSUEBERWACHUNG, null, msgs);
			msgs = basicSetBUEFunktionsueberwachung(newBUEFunktionsueberwachung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_FUNKTIONSUEBERWACHUNG, newBUEFunktionsueberwachung, newBUEFunktionsueberwachung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_EINSCHALTUNG_HP:
				return basicSetBUEEinschaltungHp(null, msgs);
			case BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_FUNKTIONSUEBERWACHUNG:
				return basicSetBUEFunktionsueberwachung(null, msgs);
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
			case BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_EINSCHALTUNG_HP:
				return getBUEEinschaltungHp();
			case BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_FUNKTIONSUEBERWACHUNG:
				return getBUEFunktionsueberwachung();
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
			case BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_EINSCHALTUNG_HP:
				setBUEEinschaltungHp((BUE_Einschaltung_Hp_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_FUNKTIONSUEBERWACHUNG:
				setBUEFunktionsueberwachung((BUE_Funktionsueberwachung_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_EINSCHALTUNG_HP:
				setBUEEinschaltungHp((BUE_Einschaltung_Hp_AttributeGroup)null);
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_FUNKTIONSUEBERWACHUNG:
				setBUEFunktionsueberwachung((BUE_Funktionsueberwachung_TypeClass)null);
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
			case BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_EINSCHALTUNG_HP:
				return bUEEinschaltungHp != null;
			case BahnuebergangPackage.BUE_EINSCHALTUNG__BUE_FUNKTIONSUEBERWACHUNG:
				return bUEFunktionsueberwachung != null;
		}
		return super.eIsSet(featureID);
	}

} //BUE_EinschaltungImpl
