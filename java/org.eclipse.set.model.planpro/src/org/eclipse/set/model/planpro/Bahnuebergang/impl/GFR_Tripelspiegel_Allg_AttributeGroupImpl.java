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
import org.eclipse.set.model.planpro.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Bahnuebergang.Montagehoehe_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Pegel_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Winkel_Alpha_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GFR Tripelspiegel Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.GFR_Tripelspiegel_Allg_AttributeGroupImpl#getMontagehoehe <em>Montagehoehe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.GFR_Tripelspiegel_Allg_AttributeGroupImpl#getPegel <em>Pegel</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.GFR_Tripelspiegel_Allg_AttributeGroupImpl#getWinkelAlpha <em>Winkel Alpha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GFR_Tripelspiegel_Allg_AttributeGroupImpl extends EObjectImpl implements GFR_Tripelspiegel_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getMontagehoehe() <em>Montagehoehe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMontagehoehe()
	 * @generated
	 * @ordered
	 */
	protected Montagehoehe_TypeClass montagehoehe;

	/**
	 * The cached value of the '{@link #getPegel() <em>Pegel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPegel()
	 * @generated
	 * @ordered
	 */
	protected Pegel_TypeClass pegel;

	/**
	 * The cached value of the '{@link #getWinkelAlpha() <em>Winkel Alpha</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinkelAlpha()
	 * @generated
	 * @ordered
	 */
	protected Winkel_Alpha_TypeClass winkelAlpha;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GFR_Tripelspiegel_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getGFR_Tripelspiegel_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Montagehoehe_TypeClass getMontagehoehe() {
		return montagehoehe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMontagehoehe(Montagehoehe_TypeClass newMontagehoehe, NotificationChain msgs) {
		Montagehoehe_TypeClass oldMontagehoehe = montagehoehe;
		montagehoehe = newMontagehoehe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__MONTAGEHOEHE, oldMontagehoehe, newMontagehoehe);
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
	public void setMontagehoehe(Montagehoehe_TypeClass newMontagehoehe) {
		if (newMontagehoehe != montagehoehe) {
			NotificationChain msgs = null;
			if (montagehoehe != null)
				msgs = ((InternalEObject)montagehoehe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__MONTAGEHOEHE, null, msgs);
			if (newMontagehoehe != null)
				msgs = ((InternalEObject)newMontagehoehe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__MONTAGEHOEHE, null, msgs);
			msgs = basicSetMontagehoehe(newMontagehoehe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__MONTAGEHOEHE, newMontagehoehe, newMontagehoehe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pegel_TypeClass getPegel() {
		return pegel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPegel(Pegel_TypeClass newPegel, NotificationChain msgs) {
		Pegel_TypeClass oldPegel = pegel;
		pegel = newPegel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__PEGEL, oldPegel, newPegel);
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
	public void setPegel(Pegel_TypeClass newPegel) {
		if (newPegel != pegel) {
			NotificationChain msgs = null;
			if (pegel != null)
				msgs = ((InternalEObject)pegel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__PEGEL, null, msgs);
			if (newPegel != null)
				msgs = ((InternalEObject)newPegel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__PEGEL, null, msgs);
			msgs = basicSetPegel(newPegel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__PEGEL, newPegel, newPegel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Winkel_Alpha_TypeClass getWinkelAlpha() {
		return winkelAlpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWinkelAlpha(Winkel_Alpha_TypeClass newWinkelAlpha, NotificationChain msgs) {
		Winkel_Alpha_TypeClass oldWinkelAlpha = winkelAlpha;
		winkelAlpha = newWinkelAlpha;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__WINKEL_ALPHA, oldWinkelAlpha, newWinkelAlpha);
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
	public void setWinkelAlpha(Winkel_Alpha_TypeClass newWinkelAlpha) {
		if (newWinkelAlpha != winkelAlpha) {
			NotificationChain msgs = null;
			if (winkelAlpha != null)
				msgs = ((InternalEObject)winkelAlpha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__WINKEL_ALPHA, null, msgs);
			if (newWinkelAlpha != null)
				msgs = ((InternalEObject)newWinkelAlpha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__WINKEL_ALPHA, null, msgs);
			msgs = basicSetWinkelAlpha(newWinkelAlpha, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__WINKEL_ALPHA, newWinkelAlpha, newWinkelAlpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__MONTAGEHOEHE:
				return basicSetMontagehoehe(null, msgs);
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__PEGEL:
				return basicSetPegel(null, msgs);
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__WINKEL_ALPHA:
				return basicSetWinkelAlpha(null, msgs);
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
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__MONTAGEHOEHE:
				return getMontagehoehe();
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__PEGEL:
				return getPegel();
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__WINKEL_ALPHA:
				return getWinkelAlpha();
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
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__MONTAGEHOEHE:
				setMontagehoehe((Montagehoehe_TypeClass)newValue);
				return;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__PEGEL:
				setPegel((Pegel_TypeClass)newValue);
				return;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__WINKEL_ALPHA:
				setWinkelAlpha((Winkel_Alpha_TypeClass)newValue);
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
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__MONTAGEHOEHE:
				setMontagehoehe((Montagehoehe_TypeClass)null);
				return;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__PEGEL:
				setPegel((Pegel_TypeClass)null);
				return;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__WINKEL_ALPHA:
				setWinkelAlpha((Winkel_Alpha_TypeClass)null);
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
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__MONTAGEHOEHE:
				return montagehoehe != null;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__PEGEL:
				return pegel != null;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL_ALLG_ATTRIBUTE_GROUP__WINKEL_ALPHA:
				return winkelAlpha != null;
		}
		return super.eIsSet(featureID);
	}

} //GFR_Tripelspiegel_Allg_AttributeGroupImpl
