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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Bahnuebergang.Akustik_Fussgaenger_TypeClass;
import org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.model11001.Bahnuebergang.Kontrastblende_TypeClass;
import org.eclipse.set.model.model11001.Bahnuebergang.Optik_Durchmesser_TypeClass;
import org.eclipse.set.model.model11001.Bahnuebergang.Optik_Symbolmaske_TypeClass;
import org.eclipse.set.model.model11001.Bahnuebergang.Schaltgruppe_TypeClass;
import org.eclipse.set.model.model11001.Bahnuebergang.Tragkopf_Verstellbar_TypeClass;
import org.eclipse.set.model.model11001.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup;
import org.eclipse.set.model.model11001.Bahnuebergang.Vorgeschaltet_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verkehrszeichen Lz Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.Verkehrszeichen_Lz_AttributeGroupImpl#getAkustikFussgaenger <em>Akustik Fussgaenger</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.Verkehrszeichen_Lz_AttributeGroupImpl#getKontrastblende <em>Kontrastblende</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.Verkehrszeichen_Lz_AttributeGroupImpl#getOptikDurchmesser <em>Optik Durchmesser</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.Verkehrszeichen_Lz_AttributeGroupImpl#getOptikSymbolmaske <em>Optik Symbolmaske</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.Verkehrszeichen_Lz_AttributeGroupImpl#getSchaltgruppe <em>Schaltgruppe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.Verkehrszeichen_Lz_AttributeGroupImpl#getTragkopfVerstellbar <em>Tragkopf Verstellbar</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.impl.Verkehrszeichen_Lz_AttributeGroupImpl#getVorgeschaltet <em>Vorgeschaltet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Verkehrszeichen_Lz_AttributeGroupImpl extends EObjectImpl implements Verkehrszeichen_Lz_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAkustikFussgaenger() <em>Akustik Fussgaenger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAkustikFussgaenger()
	 * @generated
	 * @ordered
	 */
	protected Akustik_Fussgaenger_TypeClass akustikFussgaenger;

	/**
	 * The cached value of the '{@link #getKontrastblende() <em>Kontrastblende</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontrastblende()
	 * @generated
	 * @ordered
	 */
	protected Kontrastblende_TypeClass kontrastblende;

	/**
	 * The cached value of the '{@link #getOptikDurchmesser() <em>Optik Durchmesser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptikDurchmesser()
	 * @generated
	 * @ordered
	 */
	protected Optik_Durchmesser_TypeClass optikDurchmesser;

	/**
	 * The cached value of the '{@link #getOptikSymbolmaske() <em>Optik Symbolmaske</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptikSymbolmaske()
	 * @generated
	 * @ordered
	 */
	protected Optik_Symbolmaske_TypeClass optikSymbolmaske;

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
	 * The cached value of the '{@link #getTragkopfVerstellbar() <em>Tragkopf Verstellbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTragkopfVerstellbar()
	 * @generated
	 * @ordered
	 */
	protected Tragkopf_Verstellbar_TypeClass tragkopfVerstellbar;

	/**
	 * The cached value of the '{@link #getVorgeschaltet() <em>Vorgeschaltet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorgeschaltet()
	 * @generated
	 * @ordered
	 */
	protected Vorgeschaltet_TypeClass vorgeschaltet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Verkehrszeichen_Lz_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getVerkehrszeichen_Lz_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Akustik_Fussgaenger_TypeClass getAkustikFussgaenger() {
		return akustikFussgaenger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAkustikFussgaenger(Akustik_Fussgaenger_TypeClass newAkustikFussgaenger, NotificationChain msgs) {
		Akustik_Fussgaenger_TypeClass oldAkustikFussgaenger = akustikFussgaenger;
		akustikFussgaenger = newAkustikFussgaenger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__AKUSTIK_FUSSGAENGER, oldAkustikFussgaenger, newAkustikFussgaenger);
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
	public void setAkustikFussgaenger(Akustik_Fussgaenger_TypeClass newAkustikFussgaenger) {
		if (newAkustikFussgaenger != akustikFussgaenger) {
			NotificationChain msgs = null;
			if (akustikFussgaenger != null)
				msgs = ((InternalEObject)akustikFussgaenger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__AKUSTIK_FUSSGAENGER, null, msgs);
			if (newAkustikFussgaenger != null)
				msgs = ((InternalEObject)newAkustikFussgaenger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__AKUSTIK_FUSSGAENGER, null, msgs);
			msgs = basicSetAkustikFussgaenger(newAkustikFussgaenger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__AKUSTIK_FUSSGAENGER, newAkustikFussgaenger, newAkustikFussgaenger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kontrastblende_TypeClass getKontrastblende() {
		return kontrastblende;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKontrastblende(Kontrastblende_TypeClass newKontrastblende, NotificationChain msgs) {
		Kontrastblende_TypeClass oldKontrastblende = kontrastblende;
		kontrastblende = newKontrastblende;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__KONTRASTBLENDE, oldKontrastblende, newKontrastblende);
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
	public void setKontrastblende(Kontrastblende_TypeClass newKontrastblende) {
		if (newKontrastblende != kontrastblende) {
			NotificationChain msgs = null;
			if (kontrastblende != null)
				msgs = ((InternalEObject)kontrastblende).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__KONTRASTBLENDE, null, msgs);
			if (newKontrastblende != null)
				msgs = ((InternalEObject)newKontrastblende).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__KONTRASTBLENDE, null, msgs);
			msgs = basicSetKontrastblende(newKontrastblende, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__KONTRASTBLENDE, newKontrastblende, newKontrastblende));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Optik_Durchmesser_TypeClass getOptikDurchmesser() {
		return optikDurchmesser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptikDurchmesser(Optik_Durchmesser_TypeClass newOptikDurchmesser, NotificationChain msgs) {
		Optik_Durchmesser_TypeClass oldOptikDurchmesser = optikDurchmesser;
		optikDurchmesser = newOptikDurchmesser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_DURCHMESSER, oldOptikDurchmesser, newOptikDurchmesser);
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
	public void setOptikDurchmesser(Optik_Durchmesser_TypeClass newOptikDurchmesser) {
		if (newOptikDurchmesser != optikDurchmesser) {
			NotificationChain msgs = null;
			if (optikDurchmesser != null)
				msgs = ((InternalEObject)optikDurchmesser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_DURCHMESSER, null, msgs);
			if (newOptikDurchmesser != null)
				msgs = ((InternalEObject)newOptikDurchmesser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_DURCHMESSER, null, msgs);
			msgs = basicSetOptikDurchmesser(newOptikDurchmesser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_DURCHMESSER, newOptikDurchmesser, newOptikDurchmesser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Optik_Symbolmaske_TypeClass getOptikSymbolmaske() {
		return optikSymbolmaske;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptikSymbolmaske(Optik_Symbolmaske_TypeClass newOptikSymbolmaske, NotificationChain msgs) {
		Optik_Symbolmaske_TypeClass oldOptikSymbolmaske = optikSymbolmaske;
		optikSymbolmaske = newOptikSymbolmaske;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_SYMBOLMASKE, oldOptikSymbolmaske, newOptikSymbolmaske);
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
	public void setOptikSymbolmaske(Optik_Symbolmaske_TypeClass newOptikSymbolmaske) {
		if (newOptikSymbolmaske != optikSymbolmaske) {
			NotificationChain msgs = null;
			if (optikSymbolmaske != null)
				msgs = ((InternalEObject)optikSymbolmaske).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_SYMBOLMASKE, null, msgs);
			if (newOptikSymbolmaske != null)
				msgs = ((InternalEObject)newOptikSymbolmaske).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_SYMBOLMASKE, null, msgs);
			msgs = basicSetOptikSymbolmaske(newOptikSymbolmaske, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_SYMBOLMASKE, newOptikSymbolmaske, newOptikSymbolmaske));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__SCHALTGRUPPE, oldSchaltgruppe, newSchaltgruppe);
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
				msgs = ((InternalEObject)schaltgruppe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__SCHALTGRUPPE, null, msgs);
			if (newSchaltgruppe != null)
				msgs = ((InternalEObject)newSchaltgruppe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__SCHALTGRUPPE, null, msgs);
			msgs = basicSetSchaltgruppe(newSchaltgruppe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__SCHALTGRUPPE, newSchaltgruppe, newSchaltgruppe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tragkopf_Verstellbar_TypeClass getTragkopfVerstellbar() {
		return tragkopfVerstellbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTragkopfVerstellbar(Tragkopf_Verstellbar_TypeClass newTragkopfVerstellbar, NotificationChain msgs) {
		Tragkopf_Verstellbar_TypeClass oldTragkopfVerstellbar = tragkopfVerstellbar;
		tragkopfVerstellbar = newTragkopfVerstellbar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__TRAGKOPF_VERSTELLBAR, oldTragkopfVerstellbar, newTragkopfVerstellbar);
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
	public void setTragkopfVerstellbar(Tragkopf_Verstellbar_TypeClass newTragkopfVerstellbar) {
		if (newTragkopfVerstellbar != tragkopfVerstellbar) {
			NotificationChain msgs = null;
			if (tragkopfVerstellbar != null)
				msgs = ((InternalEObject)tragkopfVerstellbar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__TRAGKOPF_VERSTELLBAR, null, msgs);
			if (newTragkopfVerstellbar != null)
				msgs = ((InternalEObject)newTragkopfVerstellbar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__TRAGKOPF_VERSTELLBAR, null, msgs);
			msgs = basicSetTragkopfVerstellbar(newTragkopfVerstellbar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__TRAGKOPF_VERSTELLBAR, newTragkopfVerstellbar, newTragkopfVerstellbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vorgeschaltet_TypeClass getVorgeschaltet() {
		return vorgeschaltet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVorgeschaltet(Vorgeschaltet_TypeClass newVorgeschaltet, NotificationChain msgs) {
		Vorgeschaltet_TypeClass oldVorgeschaltet = vorgeschaltet;
		vorgeschaltet = newVorgeschaltet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__VORGESCHALTET, oldVorgeschaltet, newVorgeschaltet);
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
	public void setVorgeschaltet(Vorgeschaltet_TypeClass newVorgeschaltet) {
		if (newVorgeschaltet != vorgeschaltet) {
			NotificationChain msgs = null;
			if (vorgeschaltet != null)
				msgs = ((InternalEObject)vorgeschaltet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__VORGESCHALTET, null, msgs);
			if (newVorgeschaltet != null)
				msgs = ((InternalEObject)newVorgeschaltet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__VORGESCHALTET, null, msgs);
			msgs = basicSetVorgeschaltet(newVorgeschaltet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__VORGESCHALTET, newVorgeschaltet, newVorgeschaltet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__AKUSTIK_FUSSGAENGER:
				return basicSetAkustikFussgaenger(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__KONTRASTBLENDE:
				return basicSetKontrastblende(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_DURCHMESSER:
				return basicSetOptikDurchmesser(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_SYMBOLMASKE:
				return basicSetOptikSymbolmaske(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__SCHALTGRUPPE:
				return basicSetSchaltgruppe(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__TRAGKOPF_VERSTELLBAR:
				return basicSetTragkopfVerstellbar(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__VORGESCHALTET:
				return basicSetVorgeschaltet(null, msgs);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__AKUSTIK_FUSSGAENGER:
				return getAkustikFussgaenger();
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__KONTRASTBLENDE:
				return getKontrastblende();
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_DURCHMESSER:
				return getOptikDurchmesser();
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_SYMBOLMASKE:
				return getOptikSymbolmaske();
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__SCHALTGRUPPE:
				return getSchaltgruppe();
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__TRAGKOPF_VERSTELLBAR:
				return getTragkopfVerstellbar();
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__VORGESCHALTET:
				return getVorgeschaltet();
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
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__AKUSTIK_FUSSGAENGER:
				setAkustikFussgaenger((Akustik_Fussgaenger_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__KONTRASTBLENDE:
				setKontrastblende((Kontrastblende_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_DURCHMESSER:
				setOptikDurchmesser((Optik_Durchmesser_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_SYMBOLMASKE:
				setOptikSymbolmaske((Optik_Symbolmaske_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__SCHALTGRUPPE:
				setSchaltgruppe((Schaltgruppe_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__TRAGKOPF_VERSTELLBAR:
				setTragkopfVerstellbar((Tragkopf_Verstellbar_TypeClass)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__VORGESCHALTET:
				setVorgeschaltet((Vorgeschaltet_TypeClass)newValue);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__AKUSTIK_FUSSGAENGER:
				setAkustikFussgaenger((Akustik_Fussgaenger_TypeClass)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__KONTRASTBLENDE:
				setKontrastblende((Kontrastblende_TypeClass)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_DURCHMESSER:
				setOptikDurchmesser((Optik_Durchmesser_TypeClass)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_SYMBOLMASKE:
				setOptikSymbolmaske((Optik_Symbolmaske_TypeClass)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__SCHALTGRUPPE:
				setSchaltgruppe((Schaltgruppe_TypeClass)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__TRAGKOPF_VERSTELLBAR:
				setTragkopfVerstellbar((Tragkopf_Verstellbar_TypeClass)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__VORGESCHALTET:
				setVorgeschaltet((Vorgeschaltet_TypeClass)null);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__AKUSTIK_FUSSGAENGER:
				return akustikFussgaenger != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__KONTRASTBLENDE:
				return kontrastblende != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_DURCHMESSER:
				return optikDurchmesser != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__OPTIK_SYMBOLMASKE:
				return optikSymbolmaske != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__SCHALTGRUPPE:
				return schaltgruppe != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__TRAGKOPF_VERSTELLBAR:
				return tragkopfVerstellbar != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN_LZ_ATTRIBUTE_GROUP__VORGESCHALTET:
				return vorgeschaltet != null;
		}
		return super.eIsSet(featureID);
	}

} //Verkehrszeichen_Lz_AttributeGroupImpl
