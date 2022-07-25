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

import org.eclipse.set.model.model1902.Bahnuebergang.Ausrichtung_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.Ausrichtung_Winkel_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.model1902.Bahnuebergang.Baumprofil_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.Gitterbehang_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.Lagerung_Art_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.Lieferlaenge_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.Montage_Ausgleichsgewichte_TypeClass;
import org.eclipse.set.model.model1902.Bahnuebergang.SA_Schrankenbaum_AttributeGroup;
import org.eclipse.set.model.model1902.Bahnuebergang.Sperrlaenge_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SA Schrankenbaum Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.SA_Schrankenbaum_AttributeGroupImpl#getAusrichtung <em>Ausrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.SA_Schrankenbaum_AttributeGroupImpl#getAusrichtungWinkel <em>Ausrichtung Winkel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.SA_Schrankenbaum_AttributeGroupImpl#getBaumprofil <em>Baumprofil</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.SA_Schrankenbaum_AttributeGroupImpl#getGitterbehang <em>Gitterbehang</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.SA_Schrankenbaum_AttributeGroupImpl#getLagerungArt <em>Lagerung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.SA_Schrankenbaum_AttributeGroupImpl#getLieferlaenge <em>Lieferlaenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.SA_Schrankenbaum_AttributeGroupImpl#getMontageAusgleichsgewichte <em>Montage Ausgleichsgewichte</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.impl.SA_Schrankenbaum_AttributeGroupImpl#getSperrlaenge <em>Sperrlaenge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SA_Schrankenbaum_AttributeGroupImpl extends MinimalEObjectImpl.Container implements SA_Schrankenbaum_AttributeGroup {
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
	 * The cached value of the '{@link #getBaumprofil() <em>Baumprofil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaumprofil()
	 * @generated
	 * @ordered
	 */
	protected Baumprofil_TypeClass baumprofil;

	/**
	 * The cached value of the '{@link #getGitterbehang() <em>Gitterbehang</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGitterbehang()
	 * @generated
	 * @ordered
	 */
	protected Gitterbehang_TypeClass gitterbehang;

	/**
	 * The cached value of the '{@link #getLagerungArt() <em>Lagerung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLagerungArt()
	 * @generated
	 * @ordered
	 */
	protected Lagerung_Art_TypeClass lagerungArt;

	/**
	 * The cached value of the '{@link #getLieferlaenge() <em>Lieferlaenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieferlaenge()
	 * @generated
	 * @ordered
	 */
	protected Lieferlaenge_TypeClass lieferlaenge;

	/**
	 * The cached value of the '{@link #getMontageAusgleichsgewichte() <em>Montage Ausgleichsgewichte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMontageAusgleichsgewichte()
	 * @generated
	 * @ordered
	 */
	protected Montage_Ausgleichsgewichte_TypeClass montageAusgleichsgewichte;

	/**
	 * The cached value of the '{@link #getSperrlaenge() <em>Sperrlaenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSperrlaenge()
	 * @generated
	 * @ordered
	 */
	protected Sperrlaenge_TypeClass sperrlaenge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SA_Schrankenbaum_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getSA_Schrankenbaum_AttributeGroup();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG, oldAusrichtung, newAusrichtung);
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
				msgs = ((InternalEObject)ausrichtung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG, null, msgs);
			if (newAusrichtung != null)
				msgs = ((InternalEObject)newAusrichtung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG, null, msgs);
			msgs = basicSetAusrichtung(newAusrichtung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG, newAusrichtung, newAusrichtung));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL, oldAusrichtungWinkel, newAusrichtungWinkel);
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
				msgs = ((InternalEObject)ausrichtungWinkel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL, null, msgs);
			if (newAusrichtungWinkel != null)
				msgs = ((InternalEObject)newAusrichtungWinkel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL, null, msgs);
			msgs = basicSetAusrichtungWinkel(newAusrichtungWinkel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL, newAusrichtungWinkel, newAusrichtungWinkel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Baumprofil_TypeClass getBaumprofil() {
		return baumprofil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaumprofil(Baumprofil_TypeClass newBaumprofil, NotificationChain msgs) {
		Baumprofil_TypeClass oldBaumprofil = baumprofil;
		baumprofil = newBaumprofil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__BAUMPROFIL, oldBaumprofil, newBaumprofil);
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
	public void setBaumprofil(Baumprofil_TypeClass newBaumprofil) {
		if (newBaumprofil != baumprofil) {
			NotificationChain msgs = null;
			if (baumprofil != null)
				msgs = ((InternalEObject)baumprofil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__BAUMPROFIL, null, msgs);
			if (newBaumprofil != null)
				msgs = ((InternalEObject)newBaumprofil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__BAUMPROFIL, null, msgs);
			msgs = basicSetBaumprofil(newBaumprofil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__BAUMPROFIL, newBaumprofil, newBaumprofil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gitterbehang_TypeClass getGitterbehang() {
		return gitterbehang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGitterbehang(Gitterbehang_TypeClass newGitterbehang, NotificationChain msgs) {
		Gitterbehang_TypeClass oldGitterbehang = gitterbehang;
		gitterbehang = newGitterbehang;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__GITTERBEHANG, oldGitterbehang, newGitterbehang);
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
	public void setGitterbehang(Gitterbehang_TypeClass newGitterbehang) {
		if (newGitterbehang != gitterbehang) {
			NotificationChain msgs = null;
			if (gitterbehang != null)
				msgs = ((InternalEObject)gitterbehang).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__GITTERBEHANG, null, msgs);
			if (newGitterbehang != null)
				msgs = ((InternalEObject)newGitterbehang).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__GITTERBEHANG, null, msgs);
			msgs = basicSetGitterbehang(newGitterbehang, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__GITTERBEHANG, newGitterbehang, newGitterbehang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lagerung_Art_TypeClass getLagerungArt() {
		return lagerungArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLagerungArt(Lagerung_Art_TypeClass newLagerungArt, NotificationChain msgs) {
		Lagerung_Art_TypeClass oldLagerungArt = lagerungArt;
		lagerungArt = newLagerungArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LAGERUNG_ART, oldLagerungArt, newLagerungArt);
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
	public void setLagerungArt(Lagerung_Art_TypeClass newLagerungArt) {
		if (newLagerungArt != lagerungArt) {
			NotificationChain msgs = null;
			if (lagerungArt != null)
				msgs = ((InternalEObject)lagerungArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LAGERUNG_ART, null, msgs);
			if (newLagerungArt != null)
				msgs = ((InternalEObject)newLagerungArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LAGERUNG_ART, null, msgs);
			msgs = basicSetLagerungArt(newLagerungArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LAGERUNG_ART, newLagerungArt, newLagerungArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lieferlaenge_TypeClass getLieferlaenge() {
		return lieferlaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLieferlaenge(Lieferlaenge_TypeClass newLieferlaenge, NotificationChain msgs) {
		Lieferlaenge_TypeClass oldLieferlaenge = lieferlaenge;
		lieferlaenge = newLieferlaenge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LIEFERLAENGE, oldLieferlaenge, newLieferlaenge);
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
	public void setLieferlaenge(Lieferlaenge_TypeClass newLieferlaenge) {
		if (newLieferlaenge != lieferlaenge) {
			NotificationChain msgs = null;
			if (lieferlaenge != null)
				msgs = ((InternalEObject)lieferlaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LIEFERLAENGE, null, msgs);
			if (newLieferlaenge != null)
				msgs = ((InternalEObject)newLieferlaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LIEFERLAENGE, null, msgs);
			msgs = basicSetLieferlaenge(newLieferlaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LIEFERLAENGE, newLieferlaenge, newLieferlaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Montage_Ausgleichsgewichte_TypeClass getMontageAusgleichsgewichte() {
		return montageAusgleichsgewichte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMontageAusgleichsgewichte(Montage_Ausgleichsgewichte_TypeClass newMontageAusgleichsgewichte, NotificationChain msgs) {
		Montage_Ausgleichsgewichte_TypeClass oldMontageAusgleichsgewichte = montageAusgleichsgewichte;
		montageAusgleichsgewichte = newMontageAusgleichsgewichte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__MONTAGE_AUSGLEICHSGEWICHTE, oldMontageAusgleichsgewichte, newMontageAusgleichsgewichte);
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
	public void setMontageAusgleichsgewichte(Montage_Ausgleichsgewichte_TypeClass newMontageAusgleichsgewichte) {
		if (newMontageAusgleichsgewichte != montageAusgleichsgewichte) {
			NotificationChain msgs = null;
			if (montageAusgleichsgewichte != null)
				msgs = ((InternalEObject)montageAusgleichsgewichte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__MONTAGE_AUSGLEICHSGEWICHTE, null, msgs);
			if (newMontageAusgleichsgewichte != null)
				msgs = ((InternalEObject)newMontageAusgleichsgewichte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__MONTAGE_AUSGLEICHSGEWICHTE, null, msgs);
			msgs = basicSetMontageAusgleichsgewichte(newMontageAusgleichsgewichte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__MONTAGE_AUSGLEICHSGEWICHTE, newMontageAusgleichsgewichte, newMontageAusgleichsgewichte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sperrlaenge_TypeClass getSperrlaenge() {
		return sperrlaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSperrlaenge(Sperrlaenge_TypeClass newSperrlaenge, NotificationChain msgs) {
		Sperrlaenge_TypeClass oldSperrlaenge = sperrlaenge;
		sperrlaenge = newSperrlaenge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__SPERRLAENGE, oldSperrlaenge, newSperrlaenge);
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
	public void setSperrlaenge(Sperrlaenge_TypeClass newSperrlaenge) {
		if (newSperrlaenge != sperrlaenge) {
			NotificationChain msgs = null;
			if (sperrlaenge != null)
				msgs = ((InternalEObject)sperrlaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__SPERRLAENGE, null, msgs);
			if (newSperrlaenge != null)
				msgs = ((InternalEObject)newSperrlaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__SPERRLAENGE, null, msgs);
			msgs = basicSetSperrlaenge(newSperrlaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__SPERRLAENGE, newSperrlaenge, newSperrlaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG:
				return basicSetAusrichtung(null, msgs);
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL:
				return basicSetAusrichtungWinkel(null, msgs);
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__BAUMPROFIL:
				return basicSetBaumprofil(null, msgs);
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__GITTERBEHANG:
				return basicSetGitterbehang(null, msgs);
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LAGERUNG_ART:
				return basicSetLagerungArt(null, msgs);
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LIEFERLAENGE:
				return basicSetLieferlaenge(null, msgs);
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__MONTAGE_AUSGLEICHSGEWICHTE:
				return basicSetMontageAusgleichsgewichte(null, msgs);
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__SPERRLAENGE:
				return basicSetSperrlaenge(null, msgs);
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
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG:
				return getAusrichtung();
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL:
				return getAusrichtungWinkel();
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__BAUMPROFIL:
				return getBaumprofil();
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__GITTERBEHANG:
				return getGitterbehang();
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LAGERUNG_ART:
				return getLagerungArt();
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LIEFERLAENGE:
				return getLieferlaenge();
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__MONTAGE_AUSGLEICHSGEWICHTE:
				return getMontageAusgleichsgewichte();
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__SPERRLAENGE:
				return getSperrlaenge();
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
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG:
				setAusrichtung((Ausrichtung_TypeClass)newValue);
				return;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL:
				setAusrichtungWinkel((Ausrichtung_Winkel_TypeClass)newValue);
				return;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__BAUMPROFIL:
				setBaumprofil((Baumprofil_TypeClass)newValue);
				return;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__GITTERBEHANG:
				setGitterbehang((Gitterbehang_TypeClass)newValue);
				return;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LAGERUNG_ART:
				setLagerungArt((Lagerung_Art_TypeClass)newValue);
				return;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LIEFERLAENGE:
				setLieferlaenge((Lieferlaenge_TypeClass)newValue);
				return;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__MONTAGE_AUSGLEICHSGEWICHTE:
				setMontageAusgleichsgewichte((Montage_Ausgleichsgewichte_TypeClass)newValue);
				return;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__SPERRLAENGE:
				setSperrlaenge((Sperrlaenge_TypeClass)newValue);
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
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG:
				setAusrichtung((Ausrichtung_TypeClass)null);
				return;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL:
				setAusrichtungWinkel((Ausrichtung_Winkel_TypeClass)null);
				return;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__BAUMPROFIL:
				setBaumprofil((Baumprofil_TypeClass)null);
				return;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__GITTERBEHANG:
				setGitterbehang((Gitterbehang_TypeClass)null);
				return;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LAGERUNG_ART:
				setLagerungArt((Lagerung_Art_TypeClass)null);
				return;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LIEFERLAENGE:
				setLieferlaenge((Lieferlaenge_TypeClass)null);
				return;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__MONTAGE_AUSGLEICHSGEWICHTE:
				setMontageAusgleichsgewichte((Montage_Ausgleichsgewichte_TypeClass)null);
				return;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__SPERRLAENGE:
				setSperrlaenge((Sperrlaenge_TypeClass)null);
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
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG:
				return ausrichtung != null;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__AUSRICHTUNG_WINKEL:
				return ausrichtungWinkel != null;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__BAUMPROFIL:
				return baumprofil != null;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__GITTERBEHANG:
				return gitterbehang != null;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LAGERUNG_ART:
				return lagerungArt != null;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__LIEFERLAENGE:
				return lieferlaenge != null;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__MONTAGE_AUSGLEICHSGEWICHTE:
				return montageAusgleichsgewichte != null;
			case BahnuebergangPackage.SA_SCHRANKENBAUM_ATTRIBUTE_GROUP__SPERRLAENGE:
				return sperrlaenge != null;
		}
		return super.eIsSet(featureID);
	}

} //SA_Schrankenbaum_AttributeGroupImpl
