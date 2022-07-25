/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Bahnuebergang.BUE_Bedien_Anzeige_Element;
import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Bedien Anzeige Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.BUE_Bedien_Anzeige_ElementImpl#getBUEBedienAnzElementAllg <em>BUE Bedien Anz Element Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Bedien_Anzeige_ElementImpl extends Basis_ObjektImpl implements BUE_Bedien_Anzeige_Element {
	/**
	 * The cached value of the '{@link #getBUEBedienAnzElementAllg() <em>BUE Bedien Anz Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEBedienAnzElementAllg()
	 * @generated
	 * @ordered
	 */
	protected BUE_Bedien_Anz_Element_Allg_AttributeGroup bUEBedienAnzElementAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Bedien_Anzeige_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Bedien_Anzeige_Element();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Bedien_Anz_Element_Allg_AttributeGroup getBUEBedienAnzElementAllg() {
		return bUEBedienAnzElementAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUEBedienAnzElementAllg(BUE_Bedien_Anz_Element_Allg_AttributeGroup newBUEBedienAnzElementAllg, NotificationChain msgs) {
		BUE_Bedien_Anz_Element_Allg_AttributeGroup oldBUEBedienAnzElementAllg = bUEBedienAnzElementAllg;
		bUEBedienAnzElementAllg = newBUEBedienAnzElementAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_BEDIEN_ANZEIGE_ELEMENT__BUE_BEDIEN_ANZ_ELEMENT_ALLG, oldBUEBedienAnzElementAllg, newBUEBedienAnzElementAllg);
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
	public void setBUEBedienAnzElementAllg(BUE_Bedien_Anz_Element_Allg_AttributeGroup newBUEBedienAnzElementAllg) {
		if (newBUEBedienAnzElementAllg != bUEBedienAnzElementAllg) {
			NotificationChain msgs = null;
			if (bUEBedienAnzElementAllg != null)
				msgs = ((InternalEObject)bUEBedienAnzElementAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_BEDIEN_ANZEIGE_ELEMENT__BUE_BEDIEN_ANZ_ELEMENT_ALLG, null, msgs);
			if (newBUEBedienAnzElementAllg != null)
				msgs = ((InternalEObject)newBUEBedienAnzElementAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_BEDIEN_ANZEIGE_ELEMENT__BUE_BEDIEN_ANZ_ELEMENT_ALLG, null, msgs);
			msgs = basicSetBUEBedienAnzElementAllg(newBUEBedienAnzElementAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_BEDIEN_ANZEIGE_ELEMENT__BUE_BEDIEN_ANZ_ELEMENT_ALLG, newBUEBedienAnzElementAllg, newBUEBedienAnzElementAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_BEDIEN_ANZEIGE_ELEMENT__BUE_BEDIEN_ANZ_ELEMENT_ALLG:
				return basicSetBUEBedienAnzElementAllg(null, msgs);
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
			case BahnuebergangPackage.BUE_BEDIEN_ANZEIGE_ELEMENT__BUE_BEDIEN_ANZ_ELEMENT_ALLG:
				return getBUEBedienAnzElementAllg();
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
			case BahnuebergangPackage.BUE_BEDIEN_ANZEIGE_ELEMENT__BUE_BEDIEN_ANZ_ELEMENT_ALLG:
				setBUEBedienAnzElementAllg((BUE_Bedien_Anz_Element_Allg_AttributeGroup)newValue);
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
			case BahnuebergangPackage.BUE_BEDIEN_ANZEIGE_ELEMENT__BUE_BEDIEN_ANZ_ELEMENT_ALLG:
				setBUEBedienAnzElementAllg((BUE_Bedien_Anz_Element_Allg_AttributeGroup)null);
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
			case BahnuebergangPackage.BUE_BEDIEN_ANZEIGE_ELEMENT__BUE_BEDIEN_ANZ_ELEMENT_ALLG:
				return bUEBedienAnzElementAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //BUE_Bedien_Anzeige_ElementImpl
