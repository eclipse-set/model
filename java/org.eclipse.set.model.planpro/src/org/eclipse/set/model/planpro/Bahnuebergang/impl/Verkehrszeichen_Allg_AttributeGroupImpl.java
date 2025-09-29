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

import org.eclipse.set.model.planpro.Bahnuebergang.Abstand_Gehweg_Fahrbahn_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Ausrichtung_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Ausrichtung_Winkel_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.planpro.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verkehrszeichen Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Verkehrszeichen_Allg_AttributeGroupImpl#getAbstandGehwegFahrbahn <em>Abstand Gehweg Fahrbahn</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Verkehrszeichen_Allg_AttributeGroupImpl#getAusrichtung <em>Ausrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.Verkehrszeichen_Allg_AttributeGroupImpl#getAusrichtungWinkel <em>Ausrichtung Winkel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Verkehrszeichen_Allg_AttributeGroupImpl extends EObjectImpl implements Verkehrszeichen_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAbstandGehwegFahrbahn() <em>Abstand Gehweg Fahrbahn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstandGehwegFahrbahn()
	 * @generated
	 * @ordered
	 */
	protected Abstand_Gehweg_Fahrbahn_TypeClass abstandGehwegFahrbahn;

	/**
	 * The cached value of the '{@link #getAusrichtung() <em>Ausrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAusrichtung()
	 * @generated
	 * @ordered
	 */
	protected Ausrichtung_TypeClass ausrichtung;

	/**
	 * The cached value of the '{@link #getAusrichtungWinkel() <em>Ausrichtung Winkel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAusrichtungWinkel()
	 * @generated
	 * @ordered
	 */
	protected Ausrichtung_Winkel_TypeClass ausrichtungWinkel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Verkehrszeichen_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Gehweg_Fahrbahn_TypeClass getAbstandGehwegFahrbahn() {
		return abstandGehwegFahrbahn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstandGehwegFahrbahn(Abstand_Gehweg_Fahrbahn_TypeClass newAbstandGehwegFahrbahn, NotificationChain msgs) {
		Abstand_Gehweg_Fahrbahn_TypeClass oldAbstandGehwegFahrbahn = abstandGehwegFahrbahn;
		abstandGehwegFahrbahn = newAbstandGehwegFahrbahn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN, oldAbstandGehwegFahrbahn, newAbstandGehwegFahrbahn);
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
	public void setAbstandGehwegFahrbahn(Abstand_Gehweg_Fahrbahn_TypeClass newAbstandGehwegFahrbahn) {
		if (newAbstandGehwegFahrbahn != abstandGehwegFahrbahn) {
			NotificationChain msgs = null;
			if (abstandGehwegFahrbahn != null)
				msgs = ((InternalEObject)abstandGehwegFahrbahn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN, null, msgs);
			if (newAbstandGehwegFahrbahn != null)
				msgs = ((InternalEObject)newAbstandGehwegFahrbahn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN, null, msgs);
			msgs = basicSetAbstandGehwegFahrbahn(newAbstandGehwegFahrbahn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN, newAbstandGehwegFahrbahn, newAbstandGehwegFahrbahn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ausrichtung_TypeClass getAusrichtung() {
		return ausrichtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAusrichtung(Ausrichtung_TypeClass newAusrichtung, NotificationChain msgs) {
		Ausrichtung_TypeClass oldAusrichtung = ausrichtung;
		ausrichtung = newAusrichtung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG, oldAusrichtung, newAusrichtung);
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
	public void setAusrichtung(Ausrichtung_TypeClass newAusrichtung) {
		if (newAusrichtung != ausrichtung) {
			NotificationChain msgs = null;
			if (ausrichtung != null)
				msgs = ((InternalEObject)ausrichtung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG, null, msgs);
			if (newAusrichtung != null)
				msgs = ((InternalEObject)newAusrichtung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG, null, msgs);
			msgs = basicSetAusrichtung(newAusrichtung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG, newAusrichtung, newAusrichtung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ausrichtung_Winkel_TypeClass getAusrichtungWinkel() {
		return ausrichtungWinkel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAusrichtungWinkel(Ausrichtung_Winkel_TypeClass newAusrichtungWinkel, NotificationChain msgs) {
		Ausrichtung_Winkel_TypeClass oldAusrichtungWinkel = ausrichtungWinkel;
		ausrichtungWinkel = newAusrichtungWinkel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL, oldAusrichtungWinkel, newAusrichtungWinkel);
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
	public void setAusrichtungWinkel(Ausrichtung_Winkel_TypeClass newAusrichtungWinkel) {
		if (newAusrichtungWinkel != ausrichtungWinkel) {
			NotificationChain msgs = null;
			if (ausrichtungWinkel != null)
				msgs = ((InternalEObject)ausrichtungWinkel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL, null, msgs);
			if (newAusrichtungWinkel != null)
				msgs = ((InternalEObject)newAusrichtungWinkel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL, null, msgs);
			msgs = basicSetAusrichtungWinkel(newAusrichtungWinkel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL, newAusrichtungWinkel, newAusrichtungWinkel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN:
				return basicSetAbstandGehwegFahrbahn(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG:
				return basicSetAusrichtung(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL:
				return basicSetAusrichtungWinkel(null, msgs);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN:
				return getAbstandGehwegFahrbahn();
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG:
				return getAusrichtung();
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL:
				return getAusrichtungWinkel();
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
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN:
				setAbstandGehwegFahrbahn((Abstand_Gehweg_Fahrbahn_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG:
				setAusrichtung((Ausrichtung_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL:
				setAusrichtungWinkel((Ausrichtung_Winkel_TypeClass)newValue);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN:
				setAbstandGehwegFahrbahn((Abstand_Gehweg_Fahrbahn_TypeClass)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG:
				setAusrichtung((Ausrichtung_TypeClass)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL:
				setAusrichtungWinkel((Ausrichtung_Winkel_TypeClass)null);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN:
				return abstandGehwegFahrbahn != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG:
				return ausrichtung != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL:
				return ausrichtungWinkel != null;
		}
		return super.eIsSet(featureID);
	}

} //Verkehrszeichen_Allg_AttributeGroupImpl
