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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Bahnuebergang.Abstand_Gehweg_Fahrbahn_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.model1902.Bahnuebergang.Hersteller_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.Schaltgruppe_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schrankenantrieb Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Schrankenantrieb_Allg_AttributeGroupImpl#getAbstandGehwegFahrbahn <em>Abstand Gehweg Fahrbahn</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Schrankenantrieb_Allg_AttributeGroupImpl#getHersteller <em>Hersteller</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.Schrankenantrieb_Allg_AttributeGroupImpl#getSchaltgruppe <em>Schaltgruppe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Schrankenantrieb_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Schrankenantrieb_Allg_AttributeGroup {
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
	 * The cached value of the '{@link #getHersteller() <em>Hersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHersteller()
	 * @generated
	 * @ordered
	 */
	protected Hersteller_TypeClass hersteller;

	/**
	 * The cached value of the '{@link #getSchaltgruppe() <em>Schaltgruppe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchaltgruppe()
	 * @generated
	 * @ordered
	 */
	protected Schaltgruppe_TypeClass schaltgruppe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schrankenantrieb_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getSchrankenantrieb_Allg_AttributeGroup();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN, oldAbstandGehwegFahrbahn, newAbstandGehwegFahrbahn);
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
				msgs = ((InternalEObject)abstandGehwegFahrbahn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN, null, msgs);
			if (newAbstandGehwegFahrbahn != null)
				msgs = ((InternalEObject)newAbstandGehwegFahrbahn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN, null, msgs);
			msgs = basicSetAbstandGehwegFahrbahn(newAbstandGehwegFahrbahn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN, newAbstandGehwegFahrbahn, newAbstandGehwegFahrbahn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hersteller_TypeClass getHersteller() {
		return hersteller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHersteller(Hersteller_TypeClass newHersteller, NotificationChain msgs) {
		Hersteller_TypeClass oldHersteller = hersteller;
		hersteller = newHersteller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__HERSTELLER, oldHersteller, newHersteller);
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
	public void setHersteller(Hersteller_TypeClass newHersteller) {
		if (newHersteller != hersteller) {
			NotificationChain msgs = null;
			if (hersteller != null)
				msgs = ((InternalEObject)hersteller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			if (newHersteller != null)
				msgs = ((InternalEObject)newHersteller).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			msgs = basicSetHersteller(newHersteller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__HERSTELLER, newHersteller, newHersteller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schaltgruppe_TypeClass getSchaltgruppe() {
		return schaltgruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchaltgruppe(Schaltgruppe_TypeClass newSchaltgruppe, NotificationChain msgs) {
		Schaltgruppe_TypeClass oldSchaltgruppe = schaltgruppe;
		schaltgruppe = newSchaltgruppe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__SCHALTGRUPPE, oldSchaltgruppe, newSchaltgruppe);
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
	public void setSchaltgruppe(Schaltgruppe_TypeClass newSchaltgruppe) {
		if (newSchaltgruppe != schaltgruppe) {
			NotificationChain msgs = null;
			if (schaltgruppe != null)
				msgs = ((InternalEObject)schaltgruppe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__SCHALTGRUPPE, null, msgs);
			if (newSchaltgruppe != null)
				msgs = ((InternalEObject)newSchaltgruppe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__SCHALTGRUPPE, null, msgs);
			msgs = basicSetSchaltgruppe(newSchaltgruppe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__SCHALTGRUPPE, newSchaltgruppe, newSchaltgruppe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN:
				return basicSetAbstandGehwegFahrbahn(null, msgs);
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return basicSetHersteller(null, msgs);
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__SCHALTGRUPPE:
				return basicSetSchaltgruppe(null, msgs);
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
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN:
				return getAbstandGehwegFahrbahn();
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return getHersteller();
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__SCHALTGRUPPE:
				return getSchaltgruppe();
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
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN:
				setAbstandGehwegFahrbahn((Abstand_Gehweg_Fahrbahn_TypeClass)newValue);
				return;
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)newValue);
				return;
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__SCHALTGRUPPE:
				setSchaltgruppe((Schaltgruppe_TypeClass)newValue);
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
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN:
				setAbstandGehwegFahrbahn((Abstand_Gehweg_Fahrbahn_TypeClass)null);
				return;
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)null);
				return;
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__SCHALTGRUPPE:
				setSchaltgruppe((Schaltgruppe_TypeClass)null);
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
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__ABSTAND_GEHWEG_FAHRBAHN:
				return abstandGehwegFahrbahn != null;
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return hersteller != null;
			case BahnuebergangPackage.SCHRANKENANTRIEB_ALLG_ATTRIBUTE_GROUP__SCHALTGRUPPE:
				return schaltgruppe != null;
		}
		return super.eIsSet(featureID);
	}

} //Schrankenantrieb_Allg_AttributeGroupImpl
