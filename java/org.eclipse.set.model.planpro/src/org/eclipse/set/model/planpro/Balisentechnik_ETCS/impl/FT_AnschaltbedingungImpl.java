/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Besondere_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_PZB_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Signal_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Sonstige_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bedingung_Weiche_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Anschaltbedingung;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FT Anschaltbedingung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_AnschaltbedingungImpl#getBedingungBesondere <em>Bedingung Besondere</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_AnschaltbedingungImpl#getBedingungPZB <em>Bedingung PZB</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_AnschaltbedingungImpl#getBedingungSignal <em>Bedingung Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_AnschaltbedingungImpl#getBedingungSonstige <em>Bedingung Sonstige</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_AnschaltbedingungImpl#getBedingungWeiche <em>Bedingung Weiche</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FT_AnschaltbedingungImpl extends Basis_ObjektImpl implements FT_Anschaltbedingung {
	/**
	 * The cached value of the '{@link #getBedingungBesondere() <em>Bedingung Besondere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedingungBesondere()
	 * @generated
	 * @ordered
	 */
	protected Bedingung_Besondere_AttributeGroup bedingungBesondere;

	/**
	 * The cached value of the '{@link #getBedingungPZB() <em>Bedingung PZB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedingungPZB()
	 * @generated
	 * @ordered
	 */
	protected Bedingung_PZB_AttributeGroup bedingungPZB;

	/**
	 * The cached value of the '{@link #getBedingungSignal() <em>Bedingung Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedingungSignal()
	 * @generated
	 * @ordered
	 */
	protected Bedingung_Signal_AttributeGroup bedingungSignal;

	/**
	 * The cached value of the '{@link #getBedingungSonstige() <em>Bedingung Sonstige</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedingungSonstige()
	 * @generated
	 * @ordered
	 */
	protected Bedingung_Sonstige_AttributeGroup bedingungSonstige;

	/**
	 * The cached value of the '{@link #getBedingungWeiche() <em>Bedingung Weiche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedingungWeiche()
	 * @generated
	 * @ordered
	 */
	protected Bedingung_Weiche_AttributeGroup bedingungWeiche;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FT_AnschaltbedingungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getFT_Anschaltbedingung();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedingung_Besondere_AttributeGroup getBedingungBesondere() {
		return bedingungBesondere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedingungBesondere(Bedingung_Besondere_AttributeGroup newBedingungBesondere, NotificationChain msgs) {
		Bedingung_Besondere_AttributeGroup oldBedingungBesondere = bedingungBesondere;
		bedingungBesondere = newBedingungBesondere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_BESONDERE, oldBedingungBesondere, newBedingungBesondere);
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
	public void setBedingungBesondere(Bedingung_Besondere_AttributeGroup newBedingungBesondere) {
		if (newBedingungBesondere != bedingungBesondere) {
			NotificationChain msgs = null;
			if (bedingungBesondere != null)
				msgs = ((InternalEObject)bedingungBesondere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_BESONDERE, null, msgs);
			if (newBedingungBesondere != null)
				msgs = ((InternalEObject)newBedingungBesondere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_BESONDERE, null, msgs);
			msgs = basicSetBedingungBesondere(newBedingungBesondere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_BESONDERE, newBedingungBesondere, newBedingungBesondere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedingung_PZB_AttributeGroup getBedingungPZB() {
		return bedingungPZB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedingungPZB(Bedingung_PZB_AttributeGroup newBedingungPZB, NotificationChain msgs) {
		Bedingung_PZB_AttributeGroup oldBedingungPZB = bedingungPZB;
		bedingungPZB = newBedingungPZB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_PZB, oldBedingungPZB, newBedingungPZB);
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
	public void setBedingungPZB(Bedingung_PZB_AttributeGroup newBedingungPZB) {
		if (newBedingungPZB != bedingungPZB) {
			NotificationChain msgs = null;
			if (bedingungPZB != null)
				msgs = ((InternalEObject)bedingungPZB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_PZB, null, msgs);
			if (newBedingungPZB != null)
				msgs = ((InternalEObject)newBedingungPZB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_PZB, null, msgs);
			msgs = basicSetBedingungPZB(newBedingungPZB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_PZB, newBedingungPZB, newBedingungPZB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedingung_Signal_AttributeGroup getBedingungSignal() {
		return bedingungSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedingungSignal(Bedingung_Signal_AttributeGroup newBedingungSignal, NotificationChain msgs) {
		Bedingung_Signal_AttributeGroup oldBedingungSignal = bedingungSignal;
		bedingungSignal = newBedingungSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SIGNAL, oldBedingungSignal, newBedingungSignal);
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
	public void setBedingungSignal(Bedingung_Signal_AttributeGroup newBedingungSignal) {
		if (newBedingungSignal != bedingungSignal) {
			NotificationChain msgs = null;
			if (bedingungSignal != null)
				msgs = ((InternalEObject)bedingungSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SIGNAL, null, msgs);
			if (newBedingungSignal != null)
				msgs = ((InternalEObject)newBedingungSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SIGNAL, null, msgs);
			msgs = basicSetBedingungSignal(newBedingungSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SIGNAL, newBedingungSignal, newBedingungSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedingung_Sonstige_AttributeGroup getBedingungSonstige() {
		return bedingungSonstige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedingungSonstige(Bedingung_Sonstige_AttributeGroup newBedingungSonstige, NotificationChain msgs) {
		Bedingung_Sonstige_AttributeGroup oldBedingungSonstige = bedingungSonstige;
		bedingungSonstige = newBedingungSonstige;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SONSTIGE, oldBedingungSonstige, newBedingungSonstige);
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
	public void setBedingungSonstige(Bedingung_Sonstige_AttributeGroup newBedingungSonstige) {
		if (newBedingungSonstige != bedingungSonstige) {
			NotificationChain msgs = null;
			if (bedingungSonstige != null)
				msgs = ((InternalEObject)bedingungSonstige).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SONSTIGE, null, msgs);
			if (newBedingungSonstige != null)
				msgs = ((InternalEObject)newBedingungSonstige).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SONSTIGE, null, msgs);
			msgs = basicSetBedingungSonstige(newBedingungSonstige, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SONSTIGE, newBedingungSonstige, newBedingungSonstige));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedingung_Weiche_AttributeGroup getBedingungWeiche() {
		return bedingungWeiche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedingungWeiche(Bedingung_Weiche_AttributeGroup newBedingungWeiche, NotificationChain msgs) {
		Bedingung_Weiche_AttributeGroup oldBedingungWeiche = bedingungWeiche;
		bedingungWeiche = newBedingungWeiche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_WEICHE, oldBedingungWeiche, newBedingungWeiche);
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
	public void setBedingungWeiche(Bedingung_Weiche_AttributeGroup newBedingungWeiche) {
		if (newBedingungWeiche != bedingungWeiche) {
			NotificationChain msgs = null;
			if (bedingungWeiche != null)
				msgs = ((InternalEObject)bedingungWeiche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_WEICHE, null, msgs);
			if (newBedingungWeiche != null)
				msgs = ((InternalEObject)newBedingungWeiche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_WEICHE, null, msgs);
			msgs = basicSetBedingungWeiche(newBedingungWeiche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_WEICHE, newBedingungWeiche, newBedingungWeiche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_BESONDERE:
				return basicSetBedingungBesondere(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_PZB:
				return basicSetBedingungPZB(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SIGNAL:
				return basicSetBedingungSignal(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SONSTIGE:
				return basicSetBedingungSonstige(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_WEICHE:
				return basicSetBedingungWeiche(null, msgs);
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
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_BESONDERE:
				return getBedingungBesondere();
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_PZB:
				return getBedingungPZB();
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SIGNAL:
				return getBedingungSignal();
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SONSTIGE:
				return getBedingungSonstige();
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_WEICHE:
				return getBedingungWeiche();
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
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_BESONDERE:
				setBedingungBesondere((Bedingung_Besondere_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_PZB:
				setBedingungPZB((Bedingung_PZB_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SIGNAL:
				setBedingungSignal((Bedingung_Signal_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SONSTIGE:
				setBedingungSonstige((Bedingung_Sonstige_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_WEICHE:
				setBedingungWeiche((Bedingung_Weiche_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_BESONDERE:
				setBedingungBesondere((Bedingung_Besondere_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_PZB:
				setBedingungPZB((Bedingung_PZB_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SIGNAL:
				setBedingungSignal((Bedingung_Signal_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SONSTIGE:
				setBedingungSonstige((Bedingung_Sonstige_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_WEICHE:
				setBedingungWeiche((Bedingung_Weiche_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_BESONDERE:
				return bedingungBesondere != null;
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_PZB:
				return bedingungPZB != null;
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SIGNAL:
				return bedingungSignal != null;
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_SONSTIGE:
				return bedingungSonstige != null;
			case Balisentechnik_ETCSPackage.FT_ANSCHALTBEDINGUNG__BEDINGUNG_WEICHE:
				return bedingungWeiche != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //FT_AnschaltbedingungImpl
