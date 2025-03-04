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

import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup;
import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.planpro.Bahnuebergang.Einschaltverz_Errechnet_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Einschaltverz_Gewaehlt_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Haltezeit_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Kurzzugschaltung_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Signalverz_Errechnet_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Signalverz_Gewaehlt_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.Teilvorgabezeit_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Einschaltung Hp Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Einschaltung_Hp_AttributeGroupImpl#getEinschaltverzErrechnet <em>Einschaltverz Errechnet</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Einschaltung_Hp_AttributeGroupImpl#getEinschaltverzGewaehlt <em>Einschaltverz Gewaehlt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Einschaltung_Hp_AttributeGroupImpl#getHaltezeit <em>Haltezeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Einschaltung_Hp_AttributeGroupImpl#getKurzzugschaltung <em>Kurzzugschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Einschaltung_Hp_AttributeGroupImpl#getSignalverzErrechnet <em>Signalverz Errechnet</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Einschaltung_Hp_AttributeGroupImpl#getSignalverzGewaehlt <em>Signalverz Gewaehlt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Einschaltung_Hp_AttributeGroupImpl#getTeilvorgabezeit <em>Teilvorgabezeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Einschaltung_Hp_AttributeGroupImpl extends EObjectImpl implements BUE_Einschaltung_Hp_AttributeGroup {
	/**
	 * The cached value of the '{@link #getEinschaltverzErrechnet() <em>Einschaltverz Errechnet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinschaltverzErrechnet()
	 * @generated
	 * @ordered
	 */
	protected Einschaltverz_Errechnet_TypeClass einschaltverzErrechnet;

	/**
	 * The cached value of the '{@link #getEinschaltverzGewaehlt() <em>Einschaltverz Gewaehlt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinschaltverzGewaehlt()
	 * @generated
	 * @ordered
	 */
	protected Einschaltverz_Gewaehlt_TypeClass einschaltverzGewaehlt;

	/**
	 * The cached value of the '{@link #getHaltezeit() <em>Haltezeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaltezeit()
	 * @generated
	 * @ordered
	 */
	protected Haltezeit_TypeClass haltezeit;

	/**
	 * The cached value of the '{@link #getKurzzugschaltung() <em>Kurzzugschaltung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKurzzugschaltung()
	 * @generated
	 * @ordered
	 */
	protected Kurzzugschaltung_TypeClass kurzzugschaltung;

	/**
	 * The cached value of the '{@link #getSignalverzErrechnet() <em>Signalverz Errechnet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalverzErrechnet()
	 * @generated
	 * @ordered
	 */
	protected Signalverz_Errechnet_TypeClass signalverzErrechnet;

	/**
	 * The cached value of the '{@link #getSignalverzGewaehlt() <em>Signalverz Gewaehlt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalverzGewaehlt()
	 * @generated
	 * @ordered
	 */
	protected Signalverz_Gewaehlt_TypeClass signalverzGewaehlt;

	/**
	 * The cached value of the '{@link #getTeilvorgabezeit() <em>Teilvorgabezeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeilvorgabezeit()
	 * @generated
	 * @ordered
	 */
	protected Teilvorgabezeit_TypeClass teilvorgabezeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Einschaltung_Hp_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Einschaltung_Hp_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einschaltverz_Errechnet_TypeClass getEinschaltverzErrechnet() {
		return einschaltverzErrechnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinschaltverzErrechnet(Einschaltverz_Errechnet_TypeClass newEinschaltverzErrechnet, NotificationChain msgs) {
		Einschaltverz_Errechnet_TypeClass oldEinschaltverzErrechnet = einschaltverzErrechnet;
		einschaltverzErrechnet = newEinschaltverzErrechnet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_ERRECHNET, oldEinschaltverzErrechnet, newEinschaltverzErrechnet);
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
	public void setEinschaltverzErrechnet(Einschaltverz_Errechnet_TypeClass newEinschaltverzErrechnet) {
		if (newEinschaltverzErrechnet != einschaltverzErrechnet) {
			NotificationChain msgs = null;
			if (einschaltverzErrechnet != null)
				msgs = ((InternalEObject)einschaltverzErrechnet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_ERRECHNET, null, msgs);
			if (newEinschaltverzErrechnet != null)
				msgs = ((InternalEObject)newEinschaltverzErrechnet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_ERRECHNET, null, msgs);
			msgs = basicSetEinschaltverzErrechnet(newEinschaltverzErrechnet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_ERRECHNET, newEinschaltverzErrechnet, newEinschaltverzErrechnet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einschaltverz_Gewaehlt_TypeClass getEinschaltverzGewaehlt() {
		return einschaltverzGewaehlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinschaltverzGewaehlt(Einschaltverz_Gewaehlt_TypeClass newEinschaltverzGewaehlt, NotificationChain msgs) {
		Einschaltverz_Gewaehlt_TypeClass oldEinschaltverzGewaehlt = einschaltverzGewaehlt;
		einschaltverzGewaehlt = newEinschaltverzGewaehlt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_GEWAEHLT, oldEinschaltverzGewaehlt, newEinschaltverzGewaehlt);
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
	public void setEinschaltverzGewaehlt(Einschaltverz_Gewaehlt_TypeClass newEinschaltverzGewaehlt) {
		if (newEinschaltverzGewaehlt != einschaltverzGewaehlt) {
			NotificationChain msgs = null;
			if (einschaltverzGewaehlt != null)
				msgs = ((InternalEObject)einschaltverzGewaehlt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_GEWAEHLT, null, msgs);
			if (newEinschaltverzGewaehlt != null)
				msgs = ((InternalEObject)newEinschaltverzGewaehlt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_GEWAEHLT, null, msgs);
			msgs = basicSetEinschaltverzGewaehlt(newEinschaltverzGewaehlt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_GEWAEHLT, newEinschaltverzGewaehlt, newEinschaltverzGewaehlt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Haltezeit_TypeClass getHaltezeit() {
		return haltezeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHaltezeit(Haltezeit_TypeClass newHaltezeit, NotificationChain msgs) {
		Haltezeit_TypeClass oldHaltezeit = haltezeit;
		haltezeit = newHaltezeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__HALTEZEIT, oldHaltezeit, newHaltezeit);
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
	public void setHaltezeit(Haltezeit_TypeClass newHaltezeit) {
		if (newHaltezeit != haltezeit) {
			NotificationChain msgs = null;
			if (haltezeit != null)
				msgs = ((InternalEObject)haltezeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__HALTEZEIT, null, msgs);
			if (newHaltezeit != null)
				msgs = ((InternalEObject)newHaltezeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__HALTEZEIT, null, msgs);
			msgs = basicSetHaltezeit(newHaltezeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__HALTEZEIT, newHaltezeit, newHaltezeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kurzzugschaltung_TypeClass getKurzzugschaltung() {
		return kurzzugschaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKurzzugschaltung(Kurzzugschaltung_TypeClass newKurzzugschaltung, NotificationChain msgs) {
		Kurzzugschaltung_TypeClass oldKurzzugschaltung = kurzzugschaltung;
		kurzzugschaltung = newKurzzugschaltung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__KURZZUGSCHALTUNG, oldKurzzugschaltung, newKurzzugschaltung);
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
	public void setKurzzugschaltung(Kurzzugschaltung_TypeClass newKurzzugschaltung) {
		if (newKurzzugschaltung != kurzzugschaltung) {
			NotificationChain msgs = null;
			if (kurzzugschaltung != null)
				msgs = ((InternalEObject)kurzzugschaltung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__KURZZUGSCHALTUNG, null, msgs);
			if (newKurzzugschaltung != null)
				msgs = ((InternalEObject)newKurzzugschaltung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__KURZZUGSCHALTUNG, null, msgs);
			msgs = basicSetKurzzugschaltung(newKurzzugschaltung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__KURZZUGSCHALTUNG, newKurzzugschaltung, newKurzzugschaltung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalverz_Errechnet_TypeClass getSignalverzErrechnet() {
		return signalverzErrechnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalverzErrechnet(Signalverz_Errechnet_TypeClass newSignalverzErrechnet, NotificationChain msgs) {
		Signalverz_Errechnet_TypeClass oldSignalverzErrechnet = signalverzErrechnet;
		signalverzErrechnet = newSignalverzErrechnet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_ERRECHNET, oldSignalverzErrechnet, newSignalverzErrechnet);
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
	public void setSignalverzErrechnet(Signalverz_Errechnet_TypeClass newSignalverzErrechnet) {
		if (newSignalverzErrechnet != signalverzErrechnet) {
			NotificationChain msgs = null;
			if (signalverzErrechnet != null)
				msgs = ((InternalEObject)signalverzErrechnet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_ERRECHNET, null, msgs);
			if (newSignalverzErrechnet != null)
				msgs = ((InternalEObject)newSignalverzErrechnet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_ERRECHNET, null, msgs);
			msgs = basicSetSignalverzErrechnet(newSignalverzErrechnet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_ERRECHNET, newSignalverzErrechnet, newSignalverzErrechnet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalverz_Gewaehlt_TypeClass getSignalverzGewaehlt() {
		return signalverzGewaehlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalverzGewaehlt(Signalverz_Gewaehlt_TypeClass newSignalverzGewaehlt, NotificationChain msgs) {
		Signalverz_Gewaehlt_TypeClass oldSignalverzGewaehlt = signalverzGewaehlt;
		signalverzGewaehlt = newSignalverzGewaehlt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_GEWAEHLT, oldSignalverzGewaehlt, newSignalverzGewaehlt);
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
	public void setSignalverzGewaehlt(Signalverz_Gewaehlt_TypeClass newSignalverzGewaehlt) {
		if (newSignalverzGewaehlt != signalverzGewaehlt) {
			NotificationChain msgs = null;
			if (signalverzGewaehlt != null)
				msgs = ((InternalEObject)signalverzGewaehlt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_GEWAEHLT, null, msgs);
			if (newSignalverzGewaehlt != null)
				msgs = ((InternalEObject)newSignalverzGewaehlt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_GEWAEHLT, null, msgs);
			msgs = basicSetSignalverzGewaehlt(newSignalverzGewaehlt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_GEWAEHLT, newSignalverzGewaehlt, newSignalverzGewaehlt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Teilvorgabezeit_TypeClass getTeilvorgabezeit() {
		return teilvorgabezeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeilvorgabezeit(Teilvorgabezeit_TypeClass newTeilvorgabezeit, NotificationChain msgs) {
		Teilvorgabezeit_TypeClass oldTeilvorgabezeit = teilvorgabezeit;
		teilvorgabezeit = newTeilvorgabezeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__TEILVORGABEZEIT, oldTeilvorgabezeit, newTeilvorgabezeit);
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
	public void setTeilvorgabezeit(Teilvorgabezeit_TypeClass newTeilvorgabezeit) {
		if (newTeilvorgabezeit != teilvorgabezeit) {
			NotificationChain msgs = null;
			if (teilvorgabezeit != null)
				msgs = ((InternalEObject)teilvorgabezeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__TEILVORGABEZEIT, null, msgs);
			if (newTeilvorgabezeit != null)
				msgs = ((InternalEObject)newTeilvorgabezeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__TEILVORGABEZEIT, null, msgs);
			msgs = basicSetTeilvorgabezeit(newTeilvorgabezeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__TEILVORGABEZEIT, newTeilvorgabezeit, newTeilvorgabezeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_ERRECHNET:
				return basicSetEinschaltverzErrechnet(null, msgs);
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_GEWAEHLT:
				return basicSetEinschaltverzGewaehlt(null, msgs);
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__HALTEZEIT:
				return basicSetHaltezeit(null, msgs);
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__KURZZUGSCHALTUNG:
				return basicSetKurzzugschaltung(null, msgs);
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_ERRECHNET:
				return basicSetSignalverzErrechnet(null, msgs);
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_GEWAEHLT:
				return basicSetSignalverzGewaehlt(null, msgs);
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__TEILVORGABEZEIT:
				return basicSetTeilvorgabezeit(null, msgs);
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
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_ERRECHNET:
				return getEinschaltverzErrechnet();
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_GEWAEHLT:
				return getEinschaltverzGewaehlt();
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__HALTEZEIT:
				return getHaltezeit();
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__KURZZUGSCHALTUNG:
				return getKurzzugschaltung();
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_ERRECHNET:
				return getSignalverzErrechnet();
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_GEWAEHLT:
				return getSignalverzGewaehlt();
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__TEILVORGABEZEIT:
				return getTeilvorgabezeit();
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
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_ERRECHNET:
				setEinschaltverzErrechnet((Einschaltverz_Errechnet_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_GEWAEHLT:
				setEinschaltverzGewaehlt((Einschaltverz_Gewaehlt_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__HALTEZEIT:
				setHaltezeit((Haltezeit_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__KURZZUGSCHALTUNG:
				setKurzzugschaltung((Kurzzugschaltung_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_ERRECHNET:
				setSignalverzErrechnet((Signalverz_Errechnet_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_GEWAEHLT:
				setSignalverzGewaehlt((Signalverz_Gewaehlt_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__TEILVORGABEZEIT:
				setTeilvorgabezeit((Teilvorgabezeit_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_ERRECHNET:
				setEinschaltverzErrechnet((Einschaltverz_Errechnet_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_GEWAEHLT:
				setEinschaltverzGewaehlt((Einschaltverz_Gewaehlt_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__HALTEZEIT:
				setHaltezeit((Haltezeit_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__KURZZUGSCHALTUNG:
				setKurzzugschaltung((Kurzzugschaltung_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_ERRECHNET:
				setSignalverzErrechnet((Signalverz_Errechnet_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_GEWAEHLT:
				setSignalverzGewaehlt((Signalverz_Gewaehlt_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__TEILVORGABEZEIT:
				setTeilvorgabezeit((Teilvorgabezeit_TypeClass)null);
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
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_ERRECHNET:
				return einschaltverzErrechnet != null;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__EINSCHALTVERZ_GEWAEHLT:
				return einschaltverzGewaehlt != null;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__HALTEZEIT:
				return haltezeit != null;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__KURZZUGSCHALTUNG:
				return kurzzugschaltung != null;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_ERRECHNET:
				return signalverzErrechnet != null;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__SIGNALVERZ_GEWAEHLT:
				return signalverzGewaehlt != null;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_HP_ATTRIBUTE_GROUP__TEILVORGABEZEIT:
				return teilvorgabezeit != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //BUE_Einschaltung_Hp_AttributeGroupImpl
