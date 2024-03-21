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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Ausgang_Nr_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Max_Unterbrechungszeit_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Nennleistung_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Spannung_Art_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Spannung_Toleranz_Obere_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Spannung_Toleranz_Untere_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EV Modul Ausgang Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.EV_Modul_Ausgang_AttributeGroupImpl#getAusgangNr <em>Ausgang Nr</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.EV_Modul_Ausgang_AttributeGroupImpl#getMaxUnterbrechungszeit <em>Max Unterbrechungszeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.EV_Modul_Ausgang_AttributeGroupImpl#getNennleistung <em>Nennleistung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.EV_Modul_Ausgang_AttributeGroupImpl#getSpannungArt <em>Spannung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.EV_Modul_Ausgang_AttributeGroupImpl#getSpannungToleranzObere <em>Spannung Toleranz Obere</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.EV_Modul_Ausgang_AttributeGroupImpl#getSpannungToleranzUntere <em>Spannung Toleranz Untere</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EV_Modul_Ausgang_AttributeGroupImpl extends EObjectImpl implements EV_Modul_Ausgang_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAusgangNr() <em>Ausgang Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAusgangNr()
	 * @generated
	 * @ordered
	 */
	protected Ausgang_Nr_TypeClass ausgangNr;

	/**
	 * The cached value of the '{@link #getMaxUnterbrechungszeit() <em>Max Unterbrechungszeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnterbrechungszeit()
	 * @generated
	 * @ordered
	 */
	protected Max_Unterbrechungszeit_TypeClass maxUnterbrechungszeit;

	/**
	 * The cached value of the '{@link #getNennleistung() <em>Nennleistung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNennleistung()
	 * @generated
	 * @ordered
	 */
	protected Nennleistung_TypeClass nennleistung;

	/**
	 * The cached value of the '{@link #getSpannungArt() <em>Spannung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpannungArt()
	 * @generated
	 * @ordered
	 */
	protected Spannung_Art_TypeClass spannungArt;

	/**
	 * The cached value of the '{@link #getSpannungToleranzObere() <em>Spannung Toleranz Obere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpannungToleranzObere()
	 * @generated
	 * @ordered
	 */
	protected Spannung_Toleranz_Obere_TypeClass spannungToleranzObere;

	/**
	 * The cached value of the '{@link #getSpannungToleranzUntere() <em>Spannung Toleranz Untere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpannungToleranzUntere()
	 * @generated
	 * @ordered
	 */
	protected Spannung_Toleranz_Untere_TypeClass spannungToleranzUntere;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EV_Modul_Ausgang_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul_Ausgang_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ausgang_Nr_TypeClass getAusgangNr() {
		return ausgangNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAusgangNr(Ausgang_Nr_TypeClass newAusgangNr, NotificationChain msgs) {
		Ausgang_Nr_TypeClass oldAusgangNr = ausgangNr;
		ausgangNr = newAusgangNr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__AUSGANG_NR, oldAusgangNr, newAusgangNr);
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
	public void setAusgangNr(Ausgang_Nr_TypeClass newAusgangNr) {
		if (newAusgangNr != ausgangNr) {
			NotificationChain msgs = null;
			if (ausgangNr != null)
				msgs = ((InternalEObject)ausgangNr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__AUSGANG_NR, null, msgs);
			if (newAusgangNr != null)
				msgs = ((InternalEObject)newAusgangNr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__AUSGANG_NR, null, msgs);
			msgs = basicSetAusgangNr(newAusgangNr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__AUSGANG_NR, newAusgangNr, newAusgangNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Max_Unterbrechungszeit_TypeClass getMaxUnterbrechungszeit() {
		return maxUnterbrechungszeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxUnterbrechungszeit(Max_Unterbrechungszeit_TypeClass newMaxUnterbrechungszeit, NotificationChain msgs) {
		Max_Unterbrechungszeit_TypeClass oldMaxUnterbrechungszeit = maxUnterbrechungszeit;
		maxUnterbrechungszeit = newMaxUnterbrechungszeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__MAX_UNTERBRECHUNGSZEIT, oldMaxUnterbrechungszeit, newMaxUnterbrechungszeit);
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
	public void setMaxUnterbrechungszeit(Max_Unterbrechungszeit_TypeClass newMaxUnterbrechungszeit) {
		if (newMaxUnterbrechungszeit != maxUnterbrechungszeit) {
			NotificationChain msgs = null;
			if (maxUnterbrechungszeit != null)
				msgs = ((InternalEObject)maxUnterbrechungszeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__MAX_UNTERBRECHUNGSZEIT, null, msgs);
			if (newMaxUnterbrechungszeit != null)
				msgs = ((InternalEObject)newMaxUnterbrechungszeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__MAX_UNTERBRECHUNGSZEIT, null, msgs);
			msgs = basicSetMaxUnterbrechungszeit(newMaxUnterbrechungszeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__MAX_UNTERBRECHUNGSZEIT, newMaxUnterbrechungszeit, newMaxUnterbrechungszeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nennleistung_TypeClass getNennleistung() {
		return nennleistung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNennleistung(Nennleistung_TypeClass newNennleistung, NotificationChain msgs) {
		Nennleistung_TypeClass oldNennleistung = nennleistung;
		nennleistung = newNennleistung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__NENNLEISTUNG, oldNennleistung, newNennleistung);
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
	public void setNennleistung(Nennleistung_TypeClass newNennleistung) {
		if (newNennleistung != nennleistung) {
			NotificationChain msgs = null;
			if (nennleistung != null)
				msgs = ((InternalEObject)nennleistung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__NENNLEISTUNG, null, msgs);
			if (newNennleistung != null)
				msgs = ((InternalEObject)newNennleistung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__NENNLEISTUNG, null, msgs);
			msgs = basicSetNennleistung(newNennleistung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__NENNLEISTUNG, newNennleistung, newNennleistung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Spannung_Art_TypeClass getSpannungArt() {
		return spannungArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpannungArt(Spannung_Art_TypeClass newSpannungArt, NotificationChain msgs) {
		Spannung_Art_TypeClass oldSpannungArt = spannungArt;
		spannungArt = newSpannungArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_ART, oldSpannungArt, newSpannungArt);
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
	public void setSpannungArt(Spannung_Art_TypeClass newSpannungArt) {
		if (newSpannungArt != spannungArt) {
			NotificationChain msgs = null;
			if (spannungArt != null)
				msgs = ((InternalEObject)spannungArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_ART, null, msgs);
			if (newSpannungArt != null)
				msgs = ((InternalEObject)newSpannungArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_ART, null, msgs);
			msgs = basicSetSpannungArt(newSpannungArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_ART, newSpannungArt, newSpannungArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Spannung_Toleranz_Obere_TypeClass getSpannungToleranzObere() {
		return spannungToleranzObere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpannungToleranzObere(Spannung_Toleranz_Obere_TypeClass newSpannungToleranzObere, NotificationChain msgs) {
		Spannung_Toleranz_Obere_TypeClass oldSpannungToleranzObere = spannungToleranzObere;
		spannungToleranzObere = newSpannungToleranzObere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_OBERE, oldSpannungToleranzObere, newSpannungToleranzObere);
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
	public void setSpannungToleranzObere(Spannung_Toleranz_Obere_TypeClass newSpannungToleranzObere) {
		if (newSpannungToleranzObere != spannungToleranzObere) {
			NotificationChain msgs = null;
			if (spannungToleranzObere != null)
				msgs = ((InternalEObject)spannungToleranzObere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_OBERE, null, msgs);
			if (newSpannungToleranzObere != null)
				msgs = ((InternalEObject)newSpannungToleranzObere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_OBERE, null, msgs);
			msgs = basicSetSpannungToleranzObere(newSpannungToleranzObere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_OBERE, newSpannungToleranzObere, newSpannungToleranzObere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Spannung_Toleranz_Untere_TypeClass getSpannungToleranzUntere() {
		return spannungToleranzUntere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpannungToleranzUntere(Spannung_Toleranz_Untere_TypeClass newSpannungToleranzUntere, NotificationChain msgs) {
		Spannung_Toleranz_Untere_TypeClass oldSpannungToleranzUntere = spannungToleranzUntere;
		spannungToleranzUntere = newSpannungToleranzUntere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_UNTERE, oldSpannungToleranzUntere, newSpannungToleranzUntere);
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
	public void setSpannungToleranzUntere(Spannung_Toleranz_Untere_TypeClass newSpannungToleranzUntere) {
		if (newSpannungToleranzUntere != spannungToleranzUntere) {
			NotificationChain msgs = null;
			if (spannungToleranzUntere != null)
				msgs = ((InternalEObject)spannungToleranzUntere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_UNTERE, null, msgs);
			if (newSpannungToleranzUntere != null)
				msgs = ((InternalEObject)newSpannungToleranzUntere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_UNTERE, null, msgs);
			msgs = basicSetSpannungToleranzUntere(newSpannungToleranzUntere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_UNTERE, newSpannungToleranzUntere, newSpannungToleranzUntere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__AUSGANG_NR:
				return basicSetAusgangNr(null, msgs);
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__MAX_UNTERBRECHUNGSZEIT:
				return basicSetMaxUnterbrechungszeit(null, msgs);
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__NENNLEISTUNG:
				return basicSetNennleistung(null, msgs);
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_ART:
				return basicSetSpannungArt(null, msgs);
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_OBERE:
				return basicSetSpannungToleranzObere(null, msgs);
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_UNTERE:
				return basicSetSpannungToleranzUntere(null, msgs);
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
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__AUSGANG_NR:
				return getAusgangNr();
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__MAX_UNTERBRECHUNGSZEIT:
				return getMaxUnterbrechungszeit();
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__NENNLEISTUNG:
				return getNennleistung();
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_ART:
				return getSpannungArt();
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_OBERE:
				return getSpannungToleranzObere();
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_UNTERE:
				return getSpannungToleranzUntere();
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
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__AUSGANG_NR:
				setAusgangNr((Ausgang_Nr_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__MAX_UNTERBRECHUNGSZEIT:
				setMaxUnterbrechungszeit((Max_Unterbrechungszeit_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__NENNLEISTUNG:
				setNennleistung((Nennleistung_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_ART:
				setSpannungArt((Spannung_Art_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_OBERE:
				setSpannungToleranzObere((Spannung_Toleranz_Obere_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_UNTERE:
				setSpannungToleranzUntere((Spannung_Toleranz_Untere_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__AUSGANG_NR:
				setAusgangNr((Ausgang_Nr_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__MAX_UNTERBRECHUNGSZEIT:
				setMaxUnterbrechungszeit((Max_Unterbrechungszeit_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__NENNLEISTUNG:
				setNennleistung((Nennleistung_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_ART:
				setSpannungArt((Spannung_Art_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_OBERE:
				setSpannungToleranzObere((Spannung_Toleranz_Obere_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_UNTERE:
				setSpannungToleranzUntere((Spannung_Toleranz_Untere_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__AUSGANG_NR:
				return ausgangNr != null;
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__MAX_UNTERBRECHUNGSZEIT:
				return maxUnterbrechungszeit != null;
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__NENNLEISTUNG:
				return nennleistung != null;
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_ART:
				return spannungArt != null;
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_OBERE:
				return spannungToleranzObere != null;
			case Balisentechnik_ETCSPackage.EV_MODUL_AUSGANG_ATTRIBUTE_GROUP__SPANNUNG_TOLERANZ_UNTERE:
				return spannungToleranzUntere != null;
		}
		return super.eIsSet(featureID);
	}

} //EV_Modul_Ausgang_AttributeGroupImpl
