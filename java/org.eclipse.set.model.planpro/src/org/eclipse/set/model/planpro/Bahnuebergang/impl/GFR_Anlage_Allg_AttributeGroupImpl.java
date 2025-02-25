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

import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Sicherungszeit_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.planpro.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Bahnuebergang.GFR_Art_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.GFR_Typ_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Hersteller_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GFR Anlage Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.GFR_Anlage_Allg_AttributeGroupImpl#getBUESicherungszeit <em>BUE Sicherungszeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.GFR_Anlage_Allg_AttributeGroupImpl#getGFRArt <em>GFR Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.GFR_Anlage_Allg_AttributeGroupImpl#getGFRTyp <em>GFR Typ</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.GFR_Anlage_Allg_AttributeGroupImpl#getHersteller <em>Hersteller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GFR_Anlage_Allg_AttributeGroupImpl extends EObjectImpl implements GFR_Anlage_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBUESicherungszeit() <em>BUE Sicherungszeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUESicherungszeit()
	 * @generated
	 * @ordered
	 */
	protected BUE_Sicherungszeit_TypeClass bUESicherungszeit;

	/**
	 * The cached value of the '{@link #getGFRArt() <em>GFR Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGFRArt()
	 * @generated
	 * @ordered
	 */
	protected GFR_Art_TypeClass gFRArt;

	/**
	 * The cached value of the '{@link #getGFRTyp() <em>GFR Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGFRTyp()
	 * @generated
	 * @ordered
	 */
	protected GFR_Typ_TypeClass gFRTyp;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GFR_Anlage_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getGFR_Anlage_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Sicherungszeit_TypeClass getBUESicherungszeit() {
		return bUESicherungszeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUESicherungszeit(BUE_Sicherungszeit_TypeClass newBUESicherungszeit, NotificationChain msgs) {
		BUE_Sicherungszeit_TypeClass oldBUESicherungszeit = bUESicherungszeit;
		bUESicherungszeit = newBUESicherungszeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSZEIT, oldBUESicherungszeit, newBUESicherungszeit);
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
	public void setBUESicherungszeit(BUE_Sicherungszeit_TypeClass newBUESicherungszeit) {
		if (newBUESicherungszeit != bUESicherungszeit) {
			NotificationChain msgs = null;
			if (bUESicherungszeit != null)
				msgs = ((InternalEObject)bUESicherungszeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSZEIT, null, msgs);
			if (newBUESicherungszeit != null)
				msgs = ((InternalEObject)newBUESicherungszeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSZEIT, null, msgs);
			msgs = basicSetBUESicherungszeit(newBUESicherungszeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSZEIT, newBUESicherungszeit, newBUESicherungszeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Art_TypeClass getGFRArt() {
		return gFRArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGFRArt(GFR_Art_TypeClass newGFRArt, NotificationChain msgs) {
		GFR_Art_TypeClass oldGFRArt = gFRArt;
		gFRArt = newGFRArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_ART, oldGFRArt, newGFRArt);
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
	public void setGFRArt(GFR_Art_TypeClass newGFRArt) {
		if (newGFRArt != gFRArt) {
			NotificationChain msgs = null;
			if (gFRArt != null)
				msgs = ((InternalEObject)gFRArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_ART, null, msgs);
			if (newGFRArt != null)
				msgs = ((InternalEObject)newGFRArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_ART, null, msgs);
			msgs = basicSetGFRArt(newGFRArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_ART, newGFRArt, newGFRArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Typ_TypeClass getGFRTyp() {
		return gFRTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGFRTyp(GFR_Typ_TypeClass newGFRTyp, NotificationChain msgs) {
		GFR_Typ_TypeClass oldGFRTyp = gFRTyp;
		gFRTyp = newGFRTyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_TYP, oldGFRTyp, newGFRTyp);
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
	public void setGFRTyp(GFR_Typ_TypeClass newGFRTyp) {
		if (newGFRTyp != gFRTyp) {
			NotificationChain msgs = null;
			if (gFRTyp != null)
				msgs = ((InternalEObject)gFRTyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_TYP, null, msgs);
			if (newGFRTyp != null)
				msgs = ((InternalEObject)newGFRTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_TYP, null, msgs);
			msgs = basicSetGFRTyp(newGFRTyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_TYP, newGFRTyp, newGFRTyp));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__HERSTELLER, oldHersteller, newHersteller);
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
				msgs = ((InternalEObject)hersteller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			if (newHersteller != null)
				msgs = ((InternalEObject)newHersteller).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			msgs = basicSetHersteller(newHersteller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__HERSTELLER, newHersteller, newHersteller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSZEIT:
				return basicSetBUESicherungszeit(null, msgs);
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_ART:
				return basicSetGFRArt(null, msgs);
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_TYP:
				return basicSetGFRTyp(null, msgs);
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return basicSetHersteller(null, msgs);
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
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSZEIT:
				return getBUESicherungszeit();
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_ART:
				return getGFRArt();
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_TYP:
				return getGFRTyp();
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return getHersteller();
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
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSZEIT:
				setBUESicherungszeit((BUE_Sicherungszeit_TypeClass)newValue);
				return;
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_ART:
				setGFRArt((GFR_Art_TypeClass)newValue);
				return;
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_TYP:
				setGFRTyp((GFR_Typ_TypeClass)newValue);
				return;
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)newValue);
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
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSZEIT:
				setBUESicherungszeit((BUE_Sicherungszeit_TypeClass)null);
				return;
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_ART:
				setGFRArt((GFR_Art_TypeClass)null);
				return;
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_TYP:
				setGFRTyp((GFR_Typ_TypeClass)null);
				return;
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)null);
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
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSZEIT:
				return bUESicherungszeit != null;
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_ART:
				return gFRArt != null;
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__GFR_TYP:
				return gFRTyp != null;
			case BahnuebergangPackage.GFR_ANLAGE_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return hersteller != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //GFR_Anlage_Allg_AttributeGroupImpl
