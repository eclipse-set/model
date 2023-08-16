/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Anzeigetext_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Einzeldatei_Art_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Konfigurationskennung_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Verwendung_TypeClass;

import org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup;

import org.eclipse.set.model.model11001.Verweise.ID_Binaerdaten_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prog Datei Einzel Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Prog_Datei_Einzel_AttributeGroupImpl#getAnzeigetext <em>Anzeigetext</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Prog_Datei_Einzel_AttributeGroupImpl#getEinzeldateiArt <em>Einzeldatei Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Prog_Datei_Einzel_AttributeGroupImpl#getIDBinaerdatei <em>ID Binaerdatei</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Prog_Datei_Einzel_AttributeGroupImpl#getKonfigurationskennung <em>Konfigurationskennung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Prog_Datei_Einzel_AttributeGroupImpl#getPruefmerkmaleBinaerdatei <em>Pruefmerkmale Binaerdatei</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Prog_Datei_Einzel_AttributeGroupImpl#getPruefmerkmaleProgKomponente <em>Pruefmerkmale Prog Komponente</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Prog_Datei_Einzel_AttributeGroupImpl#getVerwendung <em>Verwendung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Prog_Datei_Einzel_AttributeGroupImpl extends EObjectImpl implements Prog_Datei_Einzel_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAnzeigetext() <em>Anzeigetext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzeigetext()
	 * @generated
	 * @ordered
	 */
	protected Anzeigetext_TypeClass anzeigetext;

	/**
	 * The cached value of the '{@link #getEinzeldateiArt() <em>Einzeldatei Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinzeldateiArt()
	 * @generated
	 * @ordered
	 */
	protected Einzeldatei_Art_TypeClass einzeldateiArt;

	/**
	 * The cached value of the '{@link #getIDBinaerdatei() <em>ID Binaerdatei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBinaerdatei()
	 * @generated
	 * @ordered
	 */
	protected ID_Binaerdaten_ohne_Proxy_TypeClass iDBinaerdatei;

	/**
	 * The cached value of the '{@link #getKonfigurationskennung() <em>Konfigurationskennung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKonfigurationskennung()
	 * @generated
	 * @ordered
	 */
	protected Konfigurationskennung_TypeClass konfigurationskennung;

	/**
	 * The cached value of the '{@link #getPruefmerkmaleBinaerdatei() <em>Pruefmerkmale Binaerdatei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruefmerkmaleBinaerdatei()
	 * @generated
	 * @ordered
	 */
	protected Pruefmerkmale_Daten_AttributeGroup pruefmerkmaleBinaerdatei;

	/**
	 * The cached value of the '{@link #getPruefmerkmaleProgKomponente() <em>Pruefmerkmale Prog Komponente</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruefmerkmaleProgKomponente()
	 * @generated
	 * @ordered
	 */
	protected EList<Pruefmerkmale_Daten_AttributeGroup> pruefmerkmaleProgKomponente;

	/**
	 * The cached value of the '{@link #getVerwendung() <em>Verwendung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerwendung()
	 * @generated
	 * @ordered
	 */
	protected Verwendung_TypeClass verwendung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Prog_Datei_Einzel_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getProg_Datei_Einzel_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anzeigetext_TypeClass getAnzeigetext() {
		return anzeigetext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnzeigetext(Anzeigetext_TypeClass newAnzeigetext, NotificationChain msgs) {
		Anzeigetext_TypeClass oldAnzeigetext = anzeigetext;
		anzeigetext = newAnzeigetext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT, oldAnzeigetext, newAnzeigetext);
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
	public void setAnzeigetext(Anzeigetext_TypeClass newAnzeigetext) {
		if (newAnzeigetext != anzeigetext) {
			NotificationChain msgs = null;
			if (anzeigetext != null)
				msgs = ((InternalEObject)anzeigetext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT, null, msgs);
			if (newAnzeigetext != null)
				msgs = ((InternalEObject)newAnzeigetext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT, null, msgs);
			msgs = basicSetAnzeigetext(newAnzeigetext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT, newAnzeigetext, newAnzeigetext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einzeldatei_Art_TypeClass getEinzeldateiArt() {
		return einzeldateiArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinzeldateiArt(Einzeldatei_Art_TypeClass newEinzeldateiArt, NotificationChain msgs) {
		Einzeldatei_Art_TypeClass oldEinzeldateiArt = einzeldateiArt;
		einzeldateiArt = newEinzeldateiArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART, oldEinzeldateiArt, newEinzeldateiArt);
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
	public void setEinzeldateiArt(Einzeldatei_Art_TypeClass newEinzeldateiArt) {
		if (newEinzeldateiArt != einzeldateiArt) {
			NotificationChain msgs = null;
			if (einzeldateiArt != null)
				msgs = ((InternalEObject)einzeldateiArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART, null, msgs);
			if (newEinzeldateiArt != null)
				msgs = ((InternalEObject)newEinzeldateiArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART, null, msgs);
			msgs = basicSetEinzeldateiArt(newEinzeldateiArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART, newEinzeldateiArt, newEinzeldateiArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Binaerdaten_ohne_Proxy_TypeClass getIDBinaerdatei() {
		return iDBinaerdatei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBinaerdatei(ID_Binaerdaten_ohne_Proxy_TypeClass newIDBinaerdatei, NotificationChain msgs) {
		ID_Binaerdaten_ohne_Proxy_TypeClass oldIDBinaerdatei = iDBinaerdatei;
		iDBinaerdatei = newIDBinaerdatei;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ID_BINAERDATEI, oldIDBinaerdatei, newIDBinaerdatei);
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
	public void setIDBinaerdatei(ID_Binaerdaten_ohne_Proxy_TypeClass newIDBinaerdatei) {
		if (newIDBinaerdatei != iDBinaerdatei) {
			NotificationChain msgs = null;
			if (iDBinaerdatei != null)
				msgs = ((InternalEObject)iDBinaerdatei).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ID_BINAERDATEI, null, msgs);
			if (newIDBinaerdatei != null)
				msgs = ((InternalEObject)newIDBinaerdatei).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ID_BINAERDATEI, null, msgs);
			msgs = basicSetIDBinaerdatei(newIDBinaerdatei, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ID_BINAERDATEI, newIDBinaerdatei, newIDBinaerdatei));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Konfigurationskennung_TypeClass getKonfigurationskennung() {
		return konfigurationskennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKonfigurationskennung(Konfigurationskennung_TypeClass newKonfigurationskennung, NotificationChain msgs) {
		Konfigurationskennung_TypeClass oldKonfigurationskennung = konfigurationskennung;
		konfigurationskennung = newKonfigurationskennung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG, oldKonfigurationskennung, newKonfigurationskennung);
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
	public void setKonfigurationskennung(Konfigurationskennung_TypeClass newKonfigurationskennung) {
		if (newKonfigurationskennung != konfigurationskennung) {
			NotificationChain msgs = null;
			if (konfigurationskennung != null)
				msgs = ((InternalEObject)konfigurationskennung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG, null, msgs);
			if (newKonfigurationskennung != null)
				msgs = ((InternalEObject)newKonfigurationskennung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG, null, msgs);
			msgs = basicSetKonfigurationskennung(newKonfigurationskennung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG, newKonfigurationskennung, newKonfigurationskennung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pruefmerkmale_Daten_AttributeGroup getPruefmerkmaleBinaerdatei() {
		return pruefmerkmaleBinaerdatei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPruefmerkmaleBinaerdatei(Pruefmerkmale_Daten_AttributeGroup newPruefmerkmaleBinaerdatei, NotificationChain msgs) {
		Pruefmerkmale_Daten_AttributeGroup oldPruefmerkmaleBinaerdatei = pruefmerkmaleBinaerdatei;
		pruefmerkmaleBinaerdatei = newPruefmerkmaleBinaerdatei;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI, oldPruefmerkmaleBinaerdatei, newPruefmerkmaleBinaerdatei);
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
	public void setPruefmerkmaleBinaerdatei(Pruefmerkmale_Daten_AttributeGroup newPruefmerkmaleBinaerdatei) {
		if (newPruefmerkmaleBinaerdatei != pruefmerkmaleBinaerdatei) {
			NotificationChain msgs = null;
			if (pruefmerkmaleBinaerdatei != null)
				msgs = ((InternalEObject)pruefmerkmaleBinaerdatei).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI, null, msgs);
			if (newPruefmerkmaleBinaerdatei != null)
				msgs = ((InternalEObject)newPruefmerkmaleBinaerdatei).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI, null, msgs);
			msgs = basicSetPruefmerkmaleBinaerdatei(newPruefmerkmaleBinaerdatei, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI, newPruefmerkmaleBinaerdatei, newPruefmerkmaleBinaerdatei));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pruefmerkmale_Daten_AttributeGroup> getPruefmerkmaleProgKomponente() {
		if (pruefmerkmaleProgKomponente == null) {
			pruefmerkmaleProgKomponente = new EObjectContainmentEList<Pruefmerkmale_Daten_AttributeGroup>(Pruefmerkmale_Daten_AttributeGroup.class, this, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__PRUEFMERKMALE_PROG_KOMPONENTE);
		}
		return pruefmerkmaleProgKomponente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verwendung_TypeClass getVerwendung() {
		return verwendung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerwendung(Verwendung_TypeClass newVerwendung, NotificationChain msgs) {
		Verwendung_TypeClass oldVerwendung = verwendung;
		verwendung = newVerwendung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG, oldVerwendung, newVerwendung);
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
	public void setVerwendung(Verwendung_TypeClass newVerwendung) {
		if (newVerwendung != verwendung) {
			NotificationChain msgs = null;
			if (verwendung != null)
				msgs = ((InternalEObject)verwendung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG, null, msgs);
			if (newVerwendung != null)
				msgs = ((InternalEObject)newVerwendung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG, null, msgs);
			msgs = basicSetVerwendung(newVerwendung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG, newVerwendung, newVerwendung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT:
				return basicSetAnzeigetext(null, msgs);
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART:
				return basicSetEinzeldateiArt(null, msgs);
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ID_BINAERDATEI:
				return basicSetIDBinaerdatei(null, msgs);
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG:
				return basicSetKonfigurationskennung(null, msgs);
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI:
				return basicSetPruefmerkmaleBinaerdatei(null, msgs);
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__PRUEFMERKMALE_PROG_KOMPONENTE:
				return ((InternalEList<?>)getPruefmerkmaleProgKomponente()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG:
				return basicSetVerwendung(null, msgs);
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
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT:
				return getAnzeigetext();
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART:
				return getEinzeldateiArt();
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ID_BINAERDATEI:
				return getIDBinaerdatei();
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG:
				return getKonfigurationskennung();
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI:
				return getPruefmerkmaleBinaerdatei();
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__PRUEFMERKMALE_PROG_KOMPONENTE:
				return getPruefmerkmaleProgKomponente();
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG:
				return getVerwendung();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT:
				setAnzeigetext((Anzeigetext_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART:
				setEinzeldateiArt((Einzeldatei_Art_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ID_BINAERDATEI:
				setIDBinaerdatei((ID_Binaerdaten_ohne_Proxy_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG:
				setKonfigurationskennung((Konfigurationskennung_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI:
				setPruefmerkmaleBinaerdatei((Pruefmerkmale_Daten_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__PRUEFMERKMALE_PROG_KOMPONENTE:
				getPruefmerkmaleProgKomponente().clear();
				getPruefmerkmaleProgKomponente().addAll((Collection<? extends Pruefmerkmale_Daten_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG:
				setVerwendung((Verwendung_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT:
				setAnzeigetext((Anzeigetext_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART:
				setEinzeldateiArt((Einzeldatei_Art_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ID_BINAERDATEI:
				setIDBinaerdatei((ID_Binaerdaten_ohne_Proxy_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG:
				setKonfigurationskennung((Konfigurationskennung_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI:
				setPruefmerkmaleBinaerdatei((Pruefmerkmale_Daten_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__PRUEFMERKMALE_PROG_KOMPONENTE:
				getPruefmerkmaleProgKomponente().clear();
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG:
				setVerwendung((Verwendung_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT:
				return anzeigetext != null;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART:
				return einzeldateiArt != null;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ID_BINAERDATEI:
				return iDBinaerdatei != null;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG:
				return konfigurationskennung != null;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI:
				return pruefmerkmaleBinaerdatei != null;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__PRUEFMERKMALE_PROG_KOMPONENTE:
				return pruefmerkmaleProgKomponente != null && !pruefmerkmaleProgKomponente.isEmpty();
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG:
				return verwendung != null;
		}
		return super.eIsSet(featureID);
	}

} //Prog_Datei_Einzel_AttributeGroupImpl
