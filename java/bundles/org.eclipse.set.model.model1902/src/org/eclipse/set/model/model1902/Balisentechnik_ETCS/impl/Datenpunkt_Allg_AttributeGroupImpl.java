/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Anwendungssystem_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Ausrichtung_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Datenpunkt_Beschreibung_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Datenpunkt_Laenge_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Sonstige_Standortangabe_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Standortangabe_Balisenschild_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datenpunkt Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Datenpunkt_Allg_AttributeGroupImpl#getAnwendungssystem <em>Anwendungssystem</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Datenpunkt_Allg_AttributeGroupImpl#getAusrichtung <em>Ausrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Datenpunkt_Allg_AttributeGroupImpl#getDatenpunktBeschreibung <em>Datenpunkt Beschreibung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Datenpunkt_Allg_AttributeGroupImpl#getDatenpunktLaenge <em>Datenpunkt Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Datenpunkt_Allg_AttributeGroupImpl#getSonstigeStandortangabe <em>Sonstige Standortangabe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Datenpunkt_Allg_AttributeGroupImpl#getStandortangabeBalisenschild <em>Standortangabe Balisenschild</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Datenpunkt_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Datenpunkt_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAnwendungssystem() <em>Anwendungssystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnwendungssystem()
	 * @generated
	 * @ordered
	 */
	protected Anwendungssystem_TypeClass anwendungssystem;

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
	 * The cached value of the '{@link #getDatenpunktBeschreibung() <em>Datenpunkt Beschreibung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenpunktBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected Datenpunkt_Beschreibung_TypeClass datenpunktBeschreibung;

	/**
	 * The cached value of the '{@link #getDatenpunktLaenge() <em>Datenpunkt Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenpunktLaenge()
	 * @generated
	 * @ordered
	 */
	protected Datenpunkt_Laenge_TypeClass datenpunktLaenge;

	/**
	 * The cached value of the '{@link #getSonstigeStandortangabe() <em>Sonstige Standortangabe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSonstigeStandortangabe()
	 * @generated
	 * @ordered
	 */
	protected Sonstige_Standortangabe_TypeClass sonstigeStandortangabe;

	/**
	 * The cached value of the '{@link #getStandortangabeBalisenschild() <em>Standortangabe Balisenschild</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandortangabeBalisenschild()
	 * @generated
	 * @ordered
	 */
	protected Standortangabe_Balisenschild_TypeClass standortangabeBalisenschild;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Datenpunkt_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anwendungssystem_TypeClass getAnwendungssystem() {
		return anwendungssystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnwendungssystem(Anwendungssystem_TypeClass newAnwendungssystem, NotificationChain msgs) {
		Anwendungssystem_TypeClass oldAnwendungssystem = anwendungssystem;
		anwendungssystem = newAnwendungssystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__ANWENDUNGSSYSTEM, oldAnwendungssystem, newAnwendungssystem);
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
	public void setAnwendungssystem(Anwendungssystem_TypeClass newAnwendungssystem) {
		if (newAnwendungssystem != anwendungssystem) {
			NotificationChain msgs = null;
			if (anwendungssystem != null)
				msgs = ((InternalEObject)anwendungssystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__ANWENDUNGSSYSTEM, null, msgs);
			if (newAnwendungssystem != null)
				msgs = ((InternalEObject)newAnwendungssystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__ANWENDUNGSSYSTEM, null, msgs);
			msgs = basicSetAnwendungssystem(newAnwendungssystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__ANWENDUNGSSYSTEM, newAnwendungssystem, newAnwendungssystem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG, oldAusrichtung, newAusrichtung);
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
				msgs = ((InternalEObject)ausrichtung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG, null, msgs);
			if (newAusrichtung != null)
				msgs = ((InternalEObject)newAusrichtung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG, null, msgs);
			msgs = basicSetAusrichtung(newAusrichtung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG, newAusrichtung, newAusrichtung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datenpunkt_Beschreibung_TypeClass getDatenpunktBeschreibung() {
		return datenpunktBeschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatenpunktBeschreibung(Datenpunkt_Beschreibung_TypeClass newDatenpunktBeschreibung, NotificationChain msgs) {
		Datenpunkt_Beschreibung_TypeClass oldDatenpunktBeschreibung = datenpunktBeschreibung;
		datenpunktBeschreibung = newDatenpunktBeschreibung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_BESCHREIBUNG, oldDatenpunktBeschreibung, newDatenpunktBeschreibung);
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
	public void setDatenpunktBeschreibung(Datenpunkt_Beschreibung_TypeClass newDatenpunktBeschreibung) {
		if (newDatenpunktBeschreibung != datenpunktBeschreibung) {
			NotificationChain msgs = null;
			if (datenpunktBeschreibung != null)
				msgs = ((InternalEObject)datenpunktBeschreibung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_BESCHREIBUNG, null, msgs);
			if (newDatenpunktBeschreibung != null)
				msgs = ((InternalEObject)newDatenpunktBeschreibung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_BESCHREIBUNG, null, msgs);
			msgs = basicSetDatenpunktBeschreibung(newDatenpunktBeschreibung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_BESCHREIBUNG, newDatenpunktBeschreibung, newDatenpunktBeschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datenpunkt_Laenge_TypeClass getDatenpunktLaenge() {
		return datenpunktLaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatenpunktLaenge(Datenpunkt_Laenge_TypeClass newDatenpunktLaenge, NotificationChain msgs) {
		Datenpunkt_Laenge_TypeClass oldDatenpunktLaenge = datenpunktLaenge;
		datenpunktLaenge = newDatenpunktLaenge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_LAENGE, oldDatenpunktLaenge, newDatenpunktLaenge);
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
	public void setDatenpunktLaenge(Datenpunkt_Laenge_TypeClass newDatenpunktLaenge) {
		if (newDatenpunktLaenge != datenpunktLaenge) {
			NotificationChain msgs = null;
			if (datenpunktLaenge != null)
				msgs = ((InternalEObject)datenpunktLaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_LAENGE, null, msgs);
			if (newDatenpunktLaenge != null)
				msgs = ((InternalEObject)newDatenpunktLaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_LAENGE, null, msgs);
			msgs = basicSetDatenpunktLaenge(newDatenpunktLaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_LAENGE, newDatenpunktLaenge, newDatenpunktLaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sonstige_Standortangabe_TypeClass getSonstigeStandortangabe() {
		return sonstigeStandortangabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSonstigeStandortangabe(Sonstige_Standortangabe_TypeClass newSonstigeStandortangabe, NotificationChain msgs) {
		Sonstige_Standortangabe_TypeClass oldSonstigeStandortangabe = sonstigeStandortangabe;
		sonstigeStandortangabe = newSonstigeStandortangabe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__SONSTIGE_STANDORTANGABE, oldSonstigeStandortangabe, newSonstigeStandortangabe);
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
	public void setSonstigeStandortangabe(Sonstige_Standortangabe_TypeClass newSonstigeStandortangabe) {
		if (newSonstigeStandortangabe != sonstigeStandortangabe) {
			NotificationChain msgs = null;
			if (sonstigeStandortangabe != null)
				msgs = ((InternalEObject)sonstigeStandortangabe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__SONSTIGE_STANDORTANGABE, null, msgs);
			if (newSonstigeStandortangabe != null)
				msgs = ((InternalEObject)newSonstigeStandortangabe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__SONSTIGE_STANDORTANGABE, null, msgs);
			msgs = basicSetSonstigeStandortangabe(newSonstigeStandortangabe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__SONSTIGE_STANDORTANGABE, newSonstigeStandortangabe, newSonstigeStandortangabe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Standortangabe_Balisenschild_TypeClass getStandortangabeBalisenschild() {
		return standortangabeBalisenschild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandortangabeBalisenschild(Standortangabe_Balisenschild_TypeClass newStandortangabeBalisenschild, NotificationChain msgs) {
		Standortangabe_Balisenschild_TypeClass oldStandortangabeBalisenschild = standortangabeBalisenschild;
		standortangabeBalisenschild = newStandortangabeBalisenschild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__STANDORTANGABE_BALISENSCHILD, oldStandortangabeBalisenschild, newStandortangabeBalisenschild);
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
	public void setStandortangabeBalisenschild(Standortangabe_Balisenschild_TypeClass newStandortangabeBalisenschild) {
		if (newStandortangabeBalisenschild != standortangabeBalisenschild) {
			NotificationChain msgs = null;
			if (standortangabeBalisenschild != null)
				msgs = ((InternalEObject)standortangabeBalisenschild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__STANDORTANGABE_BALISENSCHILD, null, msgs);
			if (newStandortangabeBalisenschild != null)
				msgs = ((InternalEObject)newStandortangabeBalisenschild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__STANDORTANGABE_BALISENSCHILD, null, msgs);
			msgs = basicSetStandortangabeBalisenschild(newStandortangabeBalisenschild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__STANDORTANGABE_BALISENSCHILD, newStandortangabeBalisenschild, newStandortangabeBalisenschild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__ANWENDUNGSSYSTEM:
				return basicSetAnwendungssystem(null, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG:
				return basicSetAusrichtung(null, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_BESCHREIBUNG:
				return basicSetDatenpunktBeschreibung(null, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_LAENGE:
				return basicSetDatenpunktLaenge(null, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__SONSTIGE_STANDORTANGABE:
				return basicSetSonstigeStandortangabe(null, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__STANDORTANGABE_BALISENSCHILD:
				return basicSetStandortangabeBalisenschild(null, msgs);
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
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__ANWENDUNGSSYSTEM:
				return getAnwendungssystem();
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG:
				return getAusrichtung();
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_BESCHREIBUNG:
				return getDatenpunktBeschreibung();
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_LAENGE:
				return getDatenpunktLaenge();
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__SONSTIGE_STANDORTANGABE:
				return getSonstigeStandortangabe();
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__STANDORTANGABE_BALISENSCHILD:
				return getStandortangabeBalisenschild();
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
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__ANWENDUNGSSYSTEM:
				setAnwendungssystem((Anwendungssystem_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG:
				setAusrichtung((Ausrichtung_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_BESCHREIBUNG:
				setDatenpunktBeschreibung((Datenpunkt_Beschreibung_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_LAENGE:
				setDatenpunktLaenge((Datenpunkt_Laenge_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__SONSTIGE_STANDORTANGABE:
				setSonstigeStandortangabe((Sonstige_Standortangabe_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__STANDORTANGABE_BALISENSCHILD:
				setStandortangabeBalisenschild((Standortangabe_Balisenschild_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__ANWENDUNGSSYSTEM:
				setAnwendungssystem((Anwendungssystem_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG:
				setAusrichtung((Ausrichtung_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_BESCHREIBUNG:
				setDatenpunktBeschreibung((Datenpunkt_Beschreibung_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_LAENGE:
				setDatenpunktLaenge((Datenpunkt_Laenge_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__SONSTIGE_STANDORTANGABE:
				setSonstigeStandortangabe((Sonstige_Standortangabe_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__STANDORTANGABE_BALISENSCHILD:
				setStandortangabeBalisenschild((Standortangabe_Balisenschild_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__ANWENDUNGSSYSTEM:
				return anwendungssystem != null;
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__AUSRICHTUNG:
				return ausrichtung != null;
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_BESCHREIBUNG:
				return datenpunktBeschreibung != null;
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__DATENPUNKT_LAENGE:
				return datenpunktLaenge != null;
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__SONSTIGE_STANDORTANGABE:
				return sonstigeStandortangabe != null;
			case Balisentechnik_ETCSPackage.DATENPUNKT_ALLG_ATTRIBUTE_GROUP__STANDORTANGABE_BALISENSCHILD:
				return standortangabeBalisenschild != null;
		}
		return super.eIsSet(featureID);
	}

} //Datenpunkt_Allg_AttributeGroupImpl
