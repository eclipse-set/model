/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Signale.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Signale.Dunkelschaltung_TypeClass;
import org.eclipse.set.model.model11001.Signale.Funktion_Ohne_Signal_TypeClass;
import org.eclipse.set.model.model11001.Signale.Geltungsbereich_TypeClass;
import org.eclipse.set.model.model11001.Signale.Signal_Befestigungsart_TypeClass;
import org.eclipse.set.model.model11001.Signale.Signal_Funktion_TypeClass;
import org.eclipse.set.model.model11001.Signale.Signal_Real_Aktiv_AttributeGroup;
import org.eclipse.set.model.model11001.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup;
import org.eclipse.set.model.model11001.Signale.Signal_Real_AttributeGroup;
import org.eclipse.set.model.model11001.Signale.SignalePackage;
import org.eclipse.set.model.model11001.Signale.Signalsicht_Erreichbar_TypeClass;
import org.eclipse.set.model.model11001.Signale.Signalsicht_Mindest_TypeClass;
import org.eclipse.set.model.model11001.Signale.Signalsicht_Soll_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Real Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Signale.impl.Signal_Real_AttributeGroupImpl#getDunkelschaltung <em>Dunkelschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Signale.impl.Signal_Real_AttributeGroupImpl#getFunktionOhneSignal <em>Funktion Ohne Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Signale.impl.Signal_Real_AttributeGroupImpl#getGeltungsbereich <em>Geltungsbereich</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Signale.impl.Signal_Real_AttributeGroupImpl#getSignalBefestigungsart <em>Signal Befestigungsart</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Signale.impl.Signal_Real_AttributeGroupImpl#getSignalFunktion <em>Signal Funktion</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Signale.impl.Signal_Real_AttributeGroupImpl#getSignalRealAktiv <em>Signal Real Aktiv</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Signale.impl.Signal_Real_AttributeGroupImpl#getSignalRealAktivSchirm <em>Signal Real Aktiv Schirm</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Signale.impl.Signal_Real_AttributeGroupImpl#getSignalsichtErreichbar <em>Signalsicht Erreichbar</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Signale.impl.Signal_Real_AttributeGroupImpl#getSignalsichtMindest <em>Signalsicht Mindest</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Signale.impl.Signal_Real_AttributeGroupImpl#getSignalsichtSoll <em>Signalsicht Soll</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_Real_AttributeGroupImpl extends EObjectImpl implements Signal_Real_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDunkelschaltung() <em>Dunkelschaltung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDunkelschaltung()
	 * @generated
	 * @ordered
	 */
	protected Dunkelschaltung_TypeClass dunkelschaltung;

	/**
	 * The cached value of the '{@link #getFunktionOhneSignal() <em>Funktion Ohne Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunktionOhneSignal()
	 * @generated
	 * @ordered
	 */
	protected Funktion_Ohne_Signal_TypeClass funktionOhneSignal;

	/**
	 * The cached value of the '{@link #getGeltungsbereich() <em>Geltungsbereich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeltungsbereich()
	 * @generated
	 * @ordered
	 */
	protected Geltungsbereich_TypeClass geltungsbereich;

	/**
	 * The cached value of the '{@link #getSignalBefestigungsart() <em>Signal Befestigungsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalBefestigungsart()
	 * @generated
	 * @ordered
	 */
	protected Signal_Befestigungsart_TypeClass signalBefestigungsart;

	/**
	 * The cached value of the '{@link #getSignalFunktion() <em>Signal Funktion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalFunktion()
	 * @generated
	 * @ordered
	 */
	protected Signal_Funktion_TypeClass signalFunktion;

	/**
	 * The cached value of the '{@link #getSignalRealAktiv() <em>Signal Real Aktiv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalRealAktiv()
	 * @generated
	 * @ordered
	 */
	protected Signal_Real_Aktiv_AttributeGroup signalRealAktiv;

	/**
	 * The cached value of the '{@link #getSignalRealAktivSchirm() <em>Signal Real Aktiv Schirm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalRealAktivSchirm()
	 * @generated
	 * @ordered
	 */
	protected Signal_Real_Aktiv_Schirm_AttributeGroup signalRealAktivSchirm;

	/**
	 * The cached value of the '{@link #getSignalsichtErreichbar() <em>Signalsicht Erreichbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalsichtErreichbar()
	 * @generated
	 * @ordered
	 */
	protected Signalsicht_Erreichbar_TypeClass signalsichtErreichbar;

	/**
	 * The cached value of the '{@link #getSignalsichtMindest() <em>Signalsicht Mindest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalsichtMindest()
	 * @generated
	 * @ordered
	 */
	protected Signalsicht_Mindest_TypeClass signalsichtMindest;

	/**
	 * The cached value of the '{@link #getSignalsichtSoll() <em>Signalsicht Soll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalsichtSoll()
	 * @generated
	 * @ordered
	 */
	protected Signalsicht_Soll_TypeClass signalsichtSoll;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_Real_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_REAL_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dunkelschaltung_TypeClass getDunkelschaltung() {
		return dunkelschaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDunkelschaltung(Dunkelschaltung_TypeClass newDunkelschaltung, NotificationChain msgs) {
		Dunkelschaltung_TypeClass oldDunkelschaltung = dunkelschaltung;
		dunkelschaltung = newDunkelschaltung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__DUNKELSCHALTUNG, oldDunkelschaltung, newDunkelschaltung);
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
	public void setDunkelschaltung(Dunkelschaltung_TypeClass newDunkelschaltung) {
		if (newDunkelschaltung != dunkelschaltung) {
			NotificationChain msgs = null;
			if (dunkelschaltung != null)
				msgs = ((InternalEObject)dunkelschaltung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__DUNKELSCHALTUNG, null, msgs);
			if (newDunkelschaltung != null)
				msgs = ((InternalEObject)newDunkelschaltung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__DUNKELSCHALTUNG, null, msgs);
			msgs = basicSetDunkelschaltung(newDunkelschaltung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__DUNKELSCHALTUNG, newDunkelschaltung, newDunkelschaltung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Funktion_Ohne_Signal_TypeClass getFunktionOhneSignal() {
		return funktionOhneSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunktionOhneSignal(Funktion_Ohne_Signal_TypeClass newFunktionOhneSignal, NotificationChain msgs) {
		Funktion_Ohne_Signal_TypeClass oldFunktionOhneSignal = funktionOhneSignal;
		funktionOhneSignal = newFunktionOhneSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__FUNKTION_OHNE_SIGNAL, oldFunktionOhneSignal, newFunktionOhneSignal);
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
	public void setFunktionOhneSignal(Funktion_Ohne_Signal_TypeClass newFunktionOhneSignal) {
		if (newFunktionOhneSignal != funktionOhneSignal) {
			NotificationChain msgs = null;
			if (funktionOhneSignal != null)
				msgs = ((InternalEObject)funktionOhneSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__FUNKTION_OHNE_SIGNAL, null, msgs);
			if (newFunktionOhneSignal != null)
				msgs = ((InternalEObject)newFunktionOhneSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__FUNKTION_OHNE_SIGNAL, null, msgs);
			msgs = basicSetFunktionOhneSignal(newFunktionOhneSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__FUNKTION_OHNE_SIGNAL, newFunktionOhneSignal, newFunktionOhneSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geltungsbereich_TypeClass getGeltungsbereich() {
		return geltungsbereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeltungsbereich(Geltungsbereich_TypeClass newGeltungsbereich, NotificationChain msgs) {
		Geltungsbereich_TypeClass oldGeltungsbereich = geltungsbereich;
		geltungsbereich = newGeltungsbereich;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH, oldGeltungsbereich, newGeltungsbereich);
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
	public void setGeltungsbereich(Geltungsbereich_TypeClass newGeltungsbereich) {
		if (newGeltungsbereich != geltungsbereich) {
			NotificationChain msgs = null;
			if (geltungsbereich != null)
				msgs = ((InternalEObject)geltungsbereich).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH, null, msgs);
			if (newGeltungsbereich != null)
				msgs = ((InternalEObject)newGeltungsbereich).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH, null, msgs);
			msgs = basicSetGeltungsbereich(newGeltungsbereich, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH, newGeltungsbereich, newGeltungsbereich));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Befestigungsart_TypeClass getSignalBefestigungsart() {
		return signalBefestigungsart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalBefestigungsart(Signal_Befestigungsart_TypeClass newSignalBefestigungsart, NotificationChain msgs) {
		Signal_Befestigungsart_TypeClass oldSignalBefestigungsart = signalBefestigungsart;
		signalBefestigungsart = newSignalBefestigungsart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART, oldSignalBefestigungsart, newSignalBefestigungsart);
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
	public void setSignalBefestigungsart(Signal_Befestigungsart_TypeClass newSignalBefestigungsart) {
		if (newSignalBefestigungsart != signalBefestigungsart) {
			NotificationChain msgs = null;
			if (signalBefestigungsart != null)
				msgs = ((InternalEObject)signalBefestigungsart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART, null, msgs);
			if (newSignalBefestigungsart != null)
				msgs = ((InternalEObject)newSignalBefestigungsart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART, null, msgs);
			msgs = basicSetSignalBefestigungsart(newSignalBefestigungsart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART, newSignalBefestigungsart, newSignalBefestigungsart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Funktion_TypeClass getSignalFunktion() {
		return signalFunktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalFunktion(Signal_Funktion_TypeClass newSignalFunktion, NotificationChain msgs) {
		Signal_Funktion_TypeClass oldSignalFunktion = signalFunktion;
		signalFunktion = newSignalFunktion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_FUNKTION, oldSignalFunktion, newSignalFunktion);
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
	public void setSignalFunktion(Signal_Funktion_TypeClass newSignalFunktion) {
		if (newSignalFunktion != signalFunktion) {
			NotificationChain msgs = null;
			if (signalFunktion != null)
				msgs = ((InternalEObject)signalFunktion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_FUNKTION, null, msgs);
			if (newSignalFunktion != null)
				msgs = ((InternalEObject)newSignalFunktion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_FUNKTION, null, msgs);
			msgs = basicSetSignalFunktion(newSignalFunktion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_FUNKTION, newSignalFunktion, newSignalFunktion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Real_Aktiv_AttributeGroup getSignalRealAktiv() {
		return signalRealAktiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalRealAktiv(Signal_Real_Aktiv_AttributeGroup newSignalRealAktiv, NotificationChain msgs) {
		Signal_Real_Aktiv_AttributeGroup oldSignalRealAktiv = signalRealAktiv;
		signalRealAktiv = newSignalRealAktiv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV, oldSignalRealAktiv, newSignalRealAktiv);
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
	public void setSignalRealAktiv(Signal_Real_Aktiv_AttributeGroup newSignalRealAktiv) {
		if (newSignalRealAktiv != signalRealAktiv) {
			NotificationChain msgs = null;
			if (signalRealAktiv != null)
				msgs = ((InternalEObject)signalRealAktiv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV, null, msgs);
			if (newSignalRealAktiv != null)
				msgs = ((InternalEObject)newSignalRealAktiv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV, null, msgs);
			msgs = basicSetSignalRealAktiv(newSignalRealAktiv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV, newSignalRealAktiv, newSignalRealAktiv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Real_Aktiv_Schirm_AttributeGroup getSignalRealAktivSchirm() {
		return signalRealAktivSchirm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalRealAktivSchirm(Signal_Real_Aktiv_Schirm_AttributeGroup newSignalRealAktivSchirm, NotificationChain msgs) {
		Signal_Real_Aktiv_Schirm_AttributeGroup oldSignalRealAktivSchirm = signalRealAktivSchirm;
		signalRealAktivSchirm = newSignalRealAktivSchirm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM, oldSignalRealAktivSchirm, newSignalRealAktivSchirm);
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
	public void setSignalRealAktivSchirm(Signal_Real_Aktiv_Schirm_AttributeGroup newSignalRealAktivSchirm) {
		if (newSignalRealAktivSchirm != signalRealAktivSchirm) {
			NotificationChain msgs = null;
			if (signalRealAktivSchirm != null)
				msgs = ((InternalEObject)signalRealAktivSchirm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM, null, msgs);
			if (newSignalRealAktivSchirm != null)
				msgs = ((InternalEObject)newSignalRealAktivSchirm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM, null, msgs);
			msgs = basicSetSignalRealAktivSchirm(newSignalRealAktivSchirm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM, newSignalRealAktivSchirm, newSignalRealAktivSchirm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalsicht_Erreichbar_TypeClass getSignalsichtErreichbar() {
		return signalsichtErreichbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalsichtErreichbar(Signalsicht_Erreichbar_TypeClass newSignalsichtErreichbar, NotificationChain msgs) {
		Signalsicht_Erreichbar_TypeClass oldSignalsichtErreichbar = signalsichtErreichbar;
		signalsichtErreichbar = newSignalsichtErreichbar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR, oldSignalsichtErreichbar, newSignalsichtErreichbar);
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
	public void setSignalsichtErreichbar(Signalsicht_Erreichbar_TypeClass newSignalsichtErreichbar) {
		if (newSignalsichtErreichbar != signalsichtErreichbar) {
			NotificationChain msgs = null;
			if (signalsichtErreichbar != null)
				msgs = ((InternalEObject)signalsichtErreichbar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR, null, msgs);
			if (newSignalsichtErreichbar != null)
				msgs = ((InternalEObject)newSignalsichtErreichbar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR, null, msgs);
			msgs = basicSetSignalsichtErreichbar(newSignalsichtErreichbar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR, newSignalsichtErreichbar, newSignalsichtErreichbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalsicht_Mindest_TypeClass getSignalsichtMindest() {
		return signalsichtMindest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalsichtMindest(Signalsicht_Mindest_TypeClass newSignalsichtMindest, NotificationChain msgs) {
		Signalsicht_Mindest_TypeClass oldSignalsichtMindest = signalsichtMindest;
		signalsichtMindest = newSignalsichtMindest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST, oldSignalsichtMindest, newSignalsichtMindest);
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
	public void setSignalsichtMindest(Signalsicht_Mindest_TypeClass newSignalsichtMindest) {
		if (newSignalsichtMindest != signalsichtMindest) {
			NotificationChain msgs = null;
			if (signalsichtMindest != null)
				msgs = ((InternalEObject)signalsichtMindest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST, null, msgs);
			if (newSignalsichtMindest != null)
				msgs = ((InternalEObject)newSignalsichtMindest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST, null, msgs);
			msgs = basicSetSignalsichtMindest(newSignalsichtMindest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST, newSignalsichtMindest, newSignalsichtMindest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalsicht_Soll_TypeClass getSignalsichtSoll() {
		return signalsichtSoll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalsichtSoll(Signalsicht_Soll_TypeClass newSignalsichtSoll, NotificationChain msgs) {
		Signalsicht_Soll_TypeClass oldSignalsichtSoll = signalsichtSoll;
		signalsichtSoll = newSignalsichtSoll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL, oldSignalsichtSoll, newSignalsichtSoll);
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
	public void setSignalsichtSoll(Signalsicht_Soll_TypeClass newSignalsichtSoll) {
		if (newSignalsichtSoll != signalsichtSoll) {
			NotificationChain msgs = null;
			if (signalsichtSoll != null)
				msgs = ((InternalEObject)signalsichtSoll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL, null, msgs);
			if (newSignalsichtSoll != null)
				msgs = ((InternalEObject)newSignalsichtSoll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL, null, msgs);
			msgs = basicSetSignalsichtSoll(newSignalsichtSoll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL, newSignalsichtSoll, newSignalsichtSoll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__DUNKELSCHALTUNG:
				return basicSetDunkelschaltung(null, msgs);
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__FUNKTION_OHNE_SIGNAL:
				return basicSetFunktionOhneSignal(null, msgs);
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH:
				return basicSetGeltungsbereich(null, msgs);
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART:
				return basicSetSignalBefestigungsart(null, msgs);
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_FUNKTION:
				return basicSetSignalFunktion(null, msgs);
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV:
				return basicSetSignalRealAktiv(null, msgs);
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM:
				return basicSetSignalRealAktivSchirm(null, msgs);
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR:
				return basicSetSignalsichtErreichbar(null, msgs);
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST:
				return basicSetSignalsichtMindest(null, msgs);
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL:
				return basicSetSignalsichtSoll(null, msgs);
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
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__DUNKELSCHALTUNG:
				return getDunkelschaltung();
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__FUNKTION_OHNE_SIGNAL:
				return getFunktionOhneSignal();
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH:
				return getGeltungsbereich();
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART:
				return getSignalBefestigungsart();
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_FUNKTION:
				return getSignalFunktion();
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV:
				return getSignalRealAktiv();
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM:
				return getSignalRealAktivSchirm();
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR:
				return getSignalsichtErreichbar();
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST:
				return getSignalsichtMindest();
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL:
				return getSignalsichtSoll();
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
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__DUNKELSCHALTUNG:
				setDunkelschaltung((Dunkelschaltung_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__FUNKTION_OHNE_SIGNAL:
				setFunktionOhneSignal((Funktion_Ohne_Signal_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH:
				setGeltungsbereich((Geltungsbereich_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART:
				setSignalBefestigungsart((Signal_Befestigungsart_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_FUNKTION:
				setSignalFunktion((Signal_Funktion_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV:
				setSignalRealAktiv((Signal_Real_Aktiv_AttributeGroup)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM:
				setSignalRealAktivSchirm((Signal_Real_Aktiv_Schirm_AttributeGroup)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR:
				setSignalsichtErreichbar((Signalsicht_Erreichbar_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST:
				setSignalsichtMindest((Signalsicht_Mindest_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL:
				setSignalsichtSoll((Signalsicht_Soll_TypeClass)newValue);
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
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__DUNKELSCHALTUNG:
				setDunkelschaltung((Dunkelschaltung_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__FUNKTION_OHNE_SIGNAL:
				setFunktionOhneSignal((Funktion_Ohne_Signal_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH:
				setGeltungsbereich((Geltungsbereich_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART:
				setSignalBefestigungsart((Signal_Befestigungsart_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_FUNKTION:
				setSignalFunktion((Signal_Funktion_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV:
				setSignalRealAktiv((Signal_Real_Aktiv_AttributeGroup)null);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM:
				setSignalRealAktivSchirm((Signal_Real_Aktiv_Schirm_AttributeGroup)null);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR:
				setSignalsichtErreichbar((Signalsicht_Erreichbar_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST:
				setSignalsichtMindest((Signalsicht_Mindest_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL:
				setSignalsichtSoll((Signalsicht_Soll_TypeClass)null);
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
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__DUNKELSCHALTUNG:
				return dunkelschaltung != null;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__FUNKTION_OHNE_SIGNAL:
				return funktionOhneSignal != null;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__GELTUNGSBEREICH:
				return geltungsbereich != null;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNGSART:
				return signalBefestigungsart != null;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_FUNKTION:
				return signalFunktion != null;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV:
				return signalRealAktiv != null;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNAL_REAL_AKTIV_SCHIRM:
				return signalRealAktivSchirm != null;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_ERREICHBAR:
				return signalsichtErreichbar != null;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_MINDEST:
				return signalsichtMindest != null;
			case SignalePackage.SIGNAL_REAL_ATTRIBUTE_GROUP__SIGNALSICHT_SOLL:
				return signalsichtSoll != null;
		}
		return super.eIsSet(featureID);
	}

} //Signal_Real_AttributeGroupImpl
