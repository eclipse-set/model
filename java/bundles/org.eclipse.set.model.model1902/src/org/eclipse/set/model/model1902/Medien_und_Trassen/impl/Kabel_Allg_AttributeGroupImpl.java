/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Medien_und_Trassen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Medien_und_Trassen.Ader_Durchmesser_TypeClass;
import org.eclipse.set.model.model1902.Medien_und_Trassen.Ader_Querschnitt_TypeClass;
import org.eclipse.set.model.model1902.Medien_und_Trassen.Ader_Reserve_TypeClass;
import org.eclipse.set.model.model1902.Medien_und_Trassen.Anzahl_Verseilelemente_TypeClass;
import org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Art_TypeClass;
import org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Laenge_TypeClass;
import org.eclipse.set.model.model1902.Medien_und_Trassen.Kabel_Typ_TypeClass;
import org.eclipse.set.model.model1902.Medien_und_Trassen.Medien_und_TrassenPackage;
import org.eclipse.set.model.model1902.Medien_und_Trassen.Verseilart_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kabel Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Medien_und_Trassen.impl.Kabel_Allg_AttributeGroupImpl#getAderReserve <em>Ader Reserve</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Medien_und_Trassen.impl.Kabel_Allg_AttributeGroupImpl#getAnzahlVerseilelemente <em>Anzahl Verseilelemente</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Medien_und_Trassen.impl.Kabel_Allg_AttributeGroupImpl#getKabelArt <em>Kabel Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Medien_und_Trassen.impl.Kabel_Allg_AttributeGroupImpl#getKabelLaenge <em>Kabel Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Medien_und_Trassen.impl.Kabel_Allg_AttributeGroupImpl#getKabelTyp <em>Kabel Typ</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Medien_und_Trassen.impl.Kabel_Allg_AttributeGroupImpl#getVerseilart <em>Verseilart</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Medien_und_Trassen.impl.Kabel_Allg_AttributeGroupImpl#getAderDurchmesser <em>Ader Durchmesser</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Medien_und_Trassen.impl.Kabel_Allg_AttributeGroupImpl#getAderQuerschnitt <em>Ader Querschnitt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Kabel_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Kabel_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAderReserve() <em>Ader Reserve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAderReserve()
	 * @generated
	 * @ordered
	 */
	protected Ader_Reserve_TypeClass aderReserve;

	/**
	 * The cached value of the '{@link #getAnzahlVerseilelemente() <em>Anzahl Verseilelemente</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlVerseilelemente()
	 * @generated
	 * @ordered
	 */
	protected Anzahl_Verseilelemente_TypeClass anzahlVerseilelemente;

	/**
	 * The cached value of the '{@link #getKabelArt() <em>Kabel Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabelArt()
	 * @generated
	 * @ordered
	 */
	protected Kabel_Art_TypeClass kabelArt;

	/**
	 * The cached value of the '{@link #getKabelLaenge() <em>Kabel Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabelLaenge()
	 * @generated
	 * @ordered
	 */
	protected Kabel_Laenge_TypeClass kabelLaenge;

	/**
	 * The cached value of the '{@link #getKabelTyp() <em>Kabel Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabelTyp()
	 * @generated
	 * @ordered
	 */
	protected Kabel_Typ_TypeClass kabelTyp;

	/**
	 * The cached value of the '{@link #getVerseilart() <em>Verseilart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerseilart()
	 * @generated
	 * @ordered
	 */
	protected Verseilart_TypeClass verseilart;

	/**
	 * The cached value of the '{@link #getAderDurchmesser() <em>Ader Durchmesser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAderDurchmesser()
	 * @generated
	 * @ordered
	 */
	protected Ader_Durchmesser_TypeClass aderDurchmesser;

	/**
	 * The cached value of the '{@link #getAderQuerschnitt() <em>Ader Querschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAderQuerschnitt()
	 * @generated
	 * @ordered
	 */
	protected Ader_Querschnitt_TypeClass aderQuerschnitt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Kabel_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Medien_und_TrassenPackage.Literals.KABEL_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ader_Reserve_TypeClass getAderReserve() {
		return aderReserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAderReserve(Ader_Reserve_TypeClass newAderReserve, NotificationChain msgs) {
		Ader_Reserve_TypeClass oldAderReserve = aderReserve;
		aderReserve = newAderReserve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_RESERVE, oldAderReserve, newAderReserve);
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
	public void setAderReserve(Ader_Reserve_TypeClass newAderReserve) {
		if (newAderReserve != aderReserve) {
			NotificationChain msgs = null;
			if (aderReserve != null)
				msgs = ((InternalEObject)aderReserve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_RESERVE, null, msgs);
			if (newAderReserve != null)
				msgs = ((InternalEObject)newAderReserve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_RESERVE, null, msgs);
			msgs = basicSetAderReserve(newAderReserve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_RESERVE, newAderReserve, newAderReserve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anzahl_Verseilelemente_TypeClass getAnzahlVerseilelemente() {
		return anzahlVerseilelemente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnzahlVerseilelemente(Anzahl_Verseilelemente_TypeClass newAnzahlVerseilelemente, NotificationChain msgs) {
		Anzahl_Verseilelemente_TypeClass oldAnzahlVerseilelemente = anzahlVerseilelemente;
		anzahlVerseilelemente = newAnzahlVerseilelemente;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE, oldAnzahlVerseilelemente, newAnzahlVerseilelemente);
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
	public void setAnzahlVerseilelemente(Anzahl_Verseilelemente_TypeClass newAnzahlVerseilelemente) {
		if (newAnzahlVerseilelemente != anzahlVerseilelemente) {
			NotificationChain msgs = null;
			if (anzahlVerseilelemente != null)
				msgs = ((InternalEObject)anzahlVerseilelemente).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE, null, msgs);
			if (newAnzahlVerseilelemente != null)
				msgs = ((InternalEObject)newAnzahlVerseilelemente).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE, null, msgs);
			msgs = basicSetAnzahlVerseilelemente(newAnzahlVerseilelemente, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE, newAnzahlVerseilelemente, newAnzahlVerseilelemente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Art_TypeClass getKabelArt() {
		return kabelArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKabelArt(Kabel_Art_TypeClass newKabelArt, NotificationChain msgs) {
		Kabel_Art_TypeClass oldKabelArt = kabelArt;
		kabelArt = newKabelArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART, oldKabelArt, newKabelArt);
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
	public void setKabelArt(Kabel_Art_TypeClass newKabelArt) {
		if (newKabelArt != kabelArt) {
			NotificationChain msgs = null;
			if (kabelArt != null)
				msgs = ((InternalEObject)kabelArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART, null, msgs);
			if (newKabelArt != null)
				msgs = ((InternalEObject)newKabelArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART, null, msgs);
			msgs = basicSetKabelArt(newKabelArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART, newKabelArt, newKabelArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Laenge_TypeClass getKabelLaenge() {
		return kabelLaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKabelLaenge(Kabel_Laenge_TypeClass newKabelLaenge, NotificationChain msgs) {
		Kabel_Laenge_TypeClass oldKabelLaenge = kabelLaenge;
		kabelLaenge = newKabelLaenge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE, oldKabelLaenge, newKabelLaenge);
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
	public void setKabelLaenge(Kabel_Laenge_TypeClass newKabelLaenge) {
		if (newKabelLaenge != kabelLaenge) {
			NotificationChain msgs = null;
			if (kabelLaenge != null)
				msgs = ((InternalEObject)kabelLaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE, null, msgs);
			if (newKabelLaenge != null)
				msgs = ((InternalEObject)newKabelLaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE, null, msgs);
			msgs = basicSetKabelLaenge(newKabelLaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE, newKabelLaenge, newKabelLaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Typ_TypeClass getKabelTyp() {
		return kabelTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKabelTyp(Kabel_Typ_TypeClass newKabelTyp, NotificationChain msgs) {
		Kabel_Typ_TypeClass oldKabelTyp = kabelTyp;
		kabelTyp = newKabelTyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP, oldKabelTyp, newKabelTyp);
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
	public void setKabelTyp(Kabel_Typ_TypeClass newKabelTyp) {
		if (newKabelTyp != kabelTyp) {
			NotificationChain msgs = null;
			if (kabelTyp != null)
				msgs = ((InternalEObject)kabelTyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP, null, msgs);
			if (newKabelTyp != null)
				msgs = ((InternalEObject)newKabelTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP, null, msgs);
			msgs = basicSetKabelTyp(newKabelTyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP, newKabelTyp, newKabelTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verseilart_TypeClass getVerseilart() {
		return verseilart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerseilart(Verseilart_TypeClass newVerseilart, NotificationChain msgs) {
		Verseilart_TypeClass oldVerseilart = verseilart;
		verseilart = newVerseilart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__VERSEILART, oldVerseilart, newVerseilart);
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
	public void setVerseilart(Verseilart_TypeClass newVerseilart) {
		if (newVerseilart != verseilart) {
			NotificationChain msgs = null;
			if (verseilart != null)
				msgs = ((InternalEObject)verseilart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__VERSEILART, null, msgs);
			if (newVerseilart != null)
				msgs = ((InternalEObject)newVerseilart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__VERSEILART, null, msgs);
			msgs = basicSetVerseilart(newVerseilart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__VERSEILART, newVerseilart, newVerseilart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ader_Durchmesser_TypeClass getAderDurchmesser() {
		return aderDurchmesser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAderDurchmesser(Ader_Durchmesser_TypeClass newAderDurchmesser, NotificationChain msgs) {
		Ader_Durchmesser_TypeClass oldAderDurchmesser = aderDurchmesser;
		aderDurchmesser = newAderDurchmesser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_DURCHMESSER, oldAderDurchmesser, newAderDurchmesser);
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
	public void setAderDurchmesser(Ader_Durchmesser_TypeClass newAderDurchmesser) {
		if (newAderDurchmesser != aderDurchmesser) {
			NotificationChain msgs = null;
			if (aderDurchmesser != null)
				msgs = ((InternalEObject)aderDurchmesser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_DURCHMESSER, null, msgs);
			if (newAderDurchmesser != null)
				msgs = ((InternalEObject)newAderDurchmesser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_DURCHMESSER, null, msgs);
			msgs = basicSetAderDurchmesser(newAderDurchmesser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_DURCHMESSER, newAderDurchmesser, newAderDurchmesser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ader_Querschnitt_TypeClass getAderQuerschnitt() {
		return aderQuerschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAderQuerschnitt(Ader_Querschnitt_TypeClass newAderQuerschnitt, NotificationChain msgs) {
		Ader_Querschnitt_TypeClass oldAderQuerschnitt = aderQuerschnitt;
		aderQuerschnitt = newAderQuerschnitt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_QUERSCHNITT, oldAderQuerschnitt, newAderQuerschnitt);
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
	public void setAderQuerschnitt(Ader_Querschnitt_TypeClass newAderQuerschnitt) {
		if (newAderQuerschnitt != aderQuerschnitt) {
			NotificationChain msgs = null;
			if (aderQuerschnitt != null)
				msgs = ((InternalEObject)aderQuerschnitt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_QUERSCHNITT, null, msgs);
			if (newAderQuerschnitt != null)
				msgs = ((InternalEObject)newAderQuerschnitt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_QUERSCHNITT, null, msgs);
			msgs = basicSetAderQuerschnitt(newAderQuerschnitt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_QUERSCHNITT, newAderQuerschnitt, newAderQuerschnitt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_RESERVE:
				return basicSetAderReserve(null, msgs);
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE:
				return basicSetAnzahlVerseilelemente(null, msgs);
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART:
				return basicSetKabelArt(null, msgs);
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE:
				return basicSetKabelLaenge(null, msgs);
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP:
				return basicSetKabelTyp(null, msgs);
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__VERSEILART:
				return basicSetVerseilart(null, msgs);
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_DURCHMESSER:
				return basicSetAderDurchmesser(null, msgs);
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_QUERSCHNITT:
				return basicSetAderQuerschnitt(null, msgs);
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
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_RESERVE:
				return getAderReserve();
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE:
				return getAnzahlVerseilelemente();
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART:
				return getKabelArt();
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE:
				return getKabelLaenge();
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP:
				return getKabelTyp();
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__VERSEILART:
				return getVerseilart();
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_DURCHMESSER:
				return getAderDurchmesser();
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_QUERSCHNITT:
				return getAderQuerschnitt();
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
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_RESERVE:
				setAderReserve((Ader_Reserve_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE:
				setAnzahlVerseilelemente((Anzahl_Verseilelemente_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART:
				setKabelArt((Kabel_Art_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE:
				setKabelLaenge((Kabel_Laenge_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP:
				setKabelTyp((Kabel_Typ_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__VERSEILART:
				setVerseilart((Verseilart_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_DURCHMESSER:
				setAderDurchmesser((Ader_Durchmesser_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_QUERSCHNITT:
				setAderQuerschnitt((Ader_Querschnitt_TypeClass)newValue);
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
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_RESERVE:
				setAderReserve((Ader_Reserve_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE:
				setAnzahlVerseilelemente((Anzahl_Verseilelemente_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART:
				setKabelArt((Kabel_Art_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE:
				setKabelLaenge((Kabel_Laenge_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP:
				setKabelTyp((Kabel_Typ_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__VERSEILART:
				setVerseilart((Verseilart_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_DURCHMESSER:
				setAderDurchmesser((Ader_Durchmesser_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_QUERSCHNITT:
				setAderQuerschnitt((Ader_Querschnitt_TypeClass)null);
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
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_RESERVE:
				return aderReserve != null;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE:
				return anzahlVerseilelemente != null;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART:
				return kabelArt != null;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE:
				return kabelLaenge != null;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP:
				return kabelTyp != null;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__VERSEILART:
				return verseilart != null;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_DURCHMESSER:
				return aderDurchmesser != null;
			case Medien_und_TrassenPackage.KABEL_ALLG_ATTRIBUTE_GROUP__ADER_QUERSCHNITT:
				return aderQuerschnitt != null;
		}
		return super.eIsSet(featureID);
	}

} //Kabel_Allg_AttributeGroupImpl
