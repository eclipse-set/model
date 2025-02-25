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

import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Bauart_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Buestra_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Mit_GFR_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Sicherungsart_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Strasse_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Technik_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Anlage Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Anlage_Allg_AttributeGroupImpl#getBUEBauart <em>BUE Bauart</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Anlage_Allg_AttributeGroupImpl#getBUEBuestra <em>BUE Buestra</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Anlage_Allg_AttributeGroupImpl#getBUEMitGFR <em>BUE Mit GFR</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Anlage_Allg_AttributeGroupImpl#getBUESicherungsart <em>BUE Sicherungsart</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Anlage_Allg_AttributeGroupImpl#getBUEStrasse <em>BUE Strasse</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Anlage_Allg_AttributeGroupImpl#getBUETechnik <em>BUE Technik</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Anlage_Allg_AttributeGroupImpl extends EObjectImpl implements BUE_Anlage_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBUEBauart() <em>BUE Bauart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEBauart()
	 * @generated
	 * @ordered
	 */
	protected BUE_Bauart_TypeClass bUEBauart;

	/**
	 * The cached value of the '{@link #getBUEBuestra() <em>BUE Buestra</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEBuestra()
	 * @generated
	 * @ordered
	 */
	protected BUE_Buestra_TypeClass bUEBuestra;

	/**
	 * The cached value of the '{@link #getBUEMitGFR() <em>BUE Mit GFR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEMitGFR()
	 * @generated
	 * @ordered
	 */
	protected BUE_Mit_GFR_TypeClass bUEMitGFR;

	/**
	 * The cached value of the '{@link #getBUESicherungsart() <em>BUE Sicherungsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUESicherungsart()
	 * @generated
	 * @ordered
	 */
	protected BUE_Sicherungsart_TypeClass bUESicherungsart;

	/**
	 * The cached value of the '{@link #getBUEStrasse() <em>BUE Strasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEStrasse()
	 * @generated
	 * @ordered
	 */
	protected BUE_Strasse_TypeClass bUEStrasse;

	/**
	 * The cached value of the '{@link #getBUETechnik() <em>BUE Technik</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUETechnik()
	 * @generated
	 * @ordered
	 */
	protected BUE_Technik_TypeClass bUETechnik;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Anlage_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Anlage_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Bauart_TypeClass getBUEBauart() {
		return bUEBauart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUEBauart(BUE_Bauart_TypeClass newBUEBauart, NotificationChain msgs) {
		BUE_Bauart_TypeClass oldBUEBauart = bUEBauart;
		bUEBauart = newBUEBauart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BAUART, oldBUEBauart, newBUEBauart);
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
	public void setBUEBauart(BUE_Bauart_TypeClass newBUEBauart) {
		if (newBUEBauart != bUEBauart) {
			NotificationChain msgs = null;
			if (bUEBauart != null)
				msgs = ((InternalEObject)bUEBauart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BAUART, null, msgs);
			if (newBUEBauart != null)
				msgs = ((InternalEObject)newBUEBauart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BAUART, null, msgs);
			msgs = basicSetBUEBauart(newBUEBauart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BAUART, newBUEBauart, newBUEBauart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Buestra_TypeClass getBUEBuestra() {
		return bUEBuestra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUEBuestra(BUE_Buestra_TypeClass newBUEBuestra, NotificationChain msgs) {
		BUE_Buestra_TypeClass oldBUEBuestra = bUEBuestra;
		bUEBuestra = newBUEBuestra;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BUESTRA, oldBUEBuestra, newBUEBuestra);
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
	public void setBUEBuestra(BUE_Buestra_TypeClass newBUEBuestra) {
		if (newBUEBuestra != bUEBuestra) {
			NotificationChain msgs = null;
			if (bUEBuestra != null)
				msgs = ((InternalEObject)bUEBuestra).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BUESTRA, null, msgs);
			if (newBUEBuestra != null)
				msgs = ((InternalEObject)newBUEBuestra).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BUESTRA, null, msgs);
			msgs = basicSetBUEBuestra(newBUEBuestra, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BUESTRA, newBUEBuestra, newBUEBuestra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Mit_GFR_TypeClass getBUEMitGFR() {
		return bUEMitGFR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUEMitGFR(BUE_Mit_GFR_TypeClass newBUEMitGFR, NotificationChain msgs) {
		BUE_Mit_GFR_TypeClass oldBUEMitGFR = bUEMitGFR;
		bUEMitGFR = newBUEMitGFR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_MIT_GFR, oldBUEMitGFR, newBUEMitGFR);
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
	public void setBUEMitGFR(BUE_Mit_GFR_TypeClass newBUEMitGFR) {
		if (newBUEMitGFR != bUEMitGFR) {
			NotificationChain msgs = null;
			if (bUEMitGFR != null)
				msgs = ((InternalEObject)bUEMitGFR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_MIT_GFR, null, msgs);
			if (newBUEMitGFR != null)
				msgs = ((InternalEObject)newBUEMitGFR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_MIT_GFR, null, msgs);
			msgs = basicSetBUEMitGFR(newBUEMitGFR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_MIT_GFR, newBUEMitGFR, newBUEMitGFR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Sicherungsart_TypeClass getBUESicherungsart() {
		return bUESicherungsart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUESicherungsart(BUE_Sicherungsart_TypeClass newBUESicherungsart, NotificationChain msgs) {
		BUE_Sicherungsart_TypeClass oldBUESicherungsart = bUESicherungsart;
		bUESicherungsart = newBUESicherungsart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSART, oldBUESicherungsart, newBUESicherungsart);
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
	public void setBUESicherungsart(BUE_Sicherungsart_TypeClass newBUESicherungsart) {
		if (newBUESicherungsart != bUESicherungsart) {
			NotificationChain msgs = null;
			if (bUESicherungsart != null)
				msgs = ((InternalEObject)bUESicherungsart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSART, null, msgs);
			if (newBUESicherungsart != null)
				msgs = ((InternalEObject)newBUESicherungsart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSART, null, msgs);
			msgs = basicSetBUESicherungsart(newBUESicherungsart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSART, newBUESicherungsart, newBUESicherungsart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Strasse_TypeClass getBUEStrasse() {
		return bUEStrasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUEStrasse(BUE_Strasse_TypeClass newBUEStrasse, NotificationChain msgs) {
		BUE_Strasse_TypeClass oldBUEStrasse = bUEStrasse;
		bUEStrasse = newBUEStrasse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_STRASSE, oldBUEStrasse, newBUEStrasse);
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
	public void setBUEStrasse(BUE_Strasse_TypeClass newBUEStrasse) {
		if (newBUEStrasse != bUEStrasse) {
			NotificationChain msgs = null;
			if (bUEStrasse != null)
				msgs = ((InternalEObject)bUEStrasse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_STRASSE, null, msgs);
			if (newBUEStrasse != null)
				msgs = ((InternalEObject)newBUEStrasse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_STRASSE, null, msgs);
			msgs = basicSetBUEStrasse(newBUEStrasse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_STRASSE, newBUEStrasse, newBUEStrasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Technik_TypeClass getBUETechnik() {
		return bUETechnik;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUETechnik(BUE_Technik_TypeClass newBUETechnik, NotificationChain msgs) {
		BUE_Technik_TypeClass oldBUETechnik = bUETechnik;
		bUETechnik = newBUETechnik;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_TECHNIK, oldBUETechnik, newBUETechnik);
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
	public void setBUETechnik(BUE_Technik_TypeClass newBUETechnik) {
		if (newBUETechnik != bUETechnik) {
			NotificationChain msgs = null;
			if (bUETechnik != null)
				msgs = ((InternalEObject)bUETechnik).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_TECHNIK, null, msgs);
			if (newBUETechnik != null)
				msgs = ((InternalEObject)newBUETechnik).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_TECHNIK, null, msgs);
			msgs = basicSetBUETechnik(newBUETechnik, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_TECHNIK, newBUETechnik, newBUETechnik));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BAUART:
				return basicSetBUEBauart(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BUESTRA:
				return basicSetBUEBuestra(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_MIT_GFR:
				return basicSetBUEMitGFR(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSART:
				return basicSetBUESicherungsart(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_STRASSE:
				return basicSetBUEStrasse(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_TECHNIK:
				return basicSetBUETechnik(null, msgs);
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
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BAUART:
				return getBUEBauart();
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BUESTRA:
				return getBUEBuestra();
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_MIT_GFR:
				return getBUEMitGFR();
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSART:
				return getBUESicherungsart();
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_STRASSE:
				return getBUEStrasse();
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_TECHNIK:
				return getBUETechnik();
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
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BAUART:
				setBUEBauart((BUE_Bauart_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BUESTRA:
				setBUEBuestra((BUE_Buestra_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_MIT_GFR:
				setBUEMitGFR((BUE_Mit_GFR_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSART:
				setBUESicherungsart((BUE_Sicherungsart_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_STRASSE:
				setBUEStrasse((BUE_Strasse_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_TECHNIK:
				setBUETechnik((BUE_Technik_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BAUART:
				setBUEBauart((BUE_Bauart_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BUESTRA:
				setBUEBuestra((BUE_Buestra_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_MIT_GFR:
				setBUEMitGFR((BUE_Mit_GFR_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSART:
				setBUESicherungsart((BUE_Sicherungsart_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_STRASSE:
				setBUEStrasse((BUE_Strasse_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_TECHNIK:
				setBUETechnik((BUE_Technik_TypeClass)null);
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
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BAUART:
				return bUEBauart != null;
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_BUESTRA:
				return bUEBuestra != null;
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_MIT_GFR:
				return bUEMitGFR != null;
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_SICHERUNGSART:
				return bUESicherungsart != null;
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_STRASSE:
				return bUEStrasse != null;
			case BahnuebergangPackage.BUE_ANLAGE_ALLG_ATTRIBUTE_GROUP__BUE_TECHNIK:
				return bUETechnik != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //BUE_Anlage_Allg_AttributeGroupImpl
