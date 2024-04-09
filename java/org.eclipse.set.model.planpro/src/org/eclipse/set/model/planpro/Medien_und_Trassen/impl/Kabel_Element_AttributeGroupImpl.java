/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Medien_und_Trassen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Medien_und_Trassen.Ader_Durchmesser_TypeClass;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Ader_Querschnitt_TypeClass;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Ader_Reserve_TypeClass;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Anzahl_Verseilelemente_TypeClass;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Element_AttributeGroup;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage;
import org.eclipse.set.model.planpro.Medien_und_Trassen.Verseilart_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kabel Element Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.Kabel_Element_AttributeGroupImpl#getAderReserve <em>Ader Reserve</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.Kabel_Element_AttributeGroupImpl#getAnzahlVerseilelemente <em>Anzahl Verseilelemente</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.Kabel_Element_AttributeGroupImpl#getVerseilart <em>Verseilart</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.Kabel_Element_AttributeGroupImpl#getAderDurchmesser <em>Ader Durchmesser</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.impl.Kabel_Element_AttributeGroupImpl#getAderQuerschnitt <em>Ader Querschnitt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Kabel_Element_AttributeGroupImpl extends EObjectImpl implements Kabel_Element_AttributeGroup {
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
	protected Kabel_Element_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Medien_und_TrassenPackage.Literals.KABEL_ELEMENT_ATTRIBUTE_GROUP;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_RESERVE, oldAderReserve, newAderReserve);
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
				msgs = ((InternalEObject)aderReserve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_RESERVE, null, msgs);
			if (newAderReserve != null)
				msgs = ((InternalEObject)newAderReserve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_RESERVE, null, msgs);
			msgs = basicSetAderReserve(newAderReserve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_RESERVE, newAderReserve, newAderReserve));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE, oldAnzahlVerseilelemente, newAnzahlVerseilelemente);
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
				msgs = ((InternalEObject)anzahlVerseilelemente).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE, null, msgs);
			if (newAnzahlVerseilelemente != null)
				msgs = ((InternalEObject)newAnzahlVerseilelemente).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE, null, msgs);
			msgs = basicSetAnzahlVerseilelemente(newAnzahlVerseilelemente, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE, newAnzahlVerseilelemente, newAnzahlVerseilelemente));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__VERSEILART, oldVerseilart, newVerseilart);
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
				msgs = ((InternalEObject)verseilart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__VERSEILART, null, msgs);
			if (newVerseilart != null)
				msgs = ((InternalEObject)newVerseilart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__VERSEILART, null, msgs);
			msgs = basicSetVerseilart(newVerseilart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__VERSEILART, newVerseilart, newVerseilart));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_DURCHMESSER, oldAderDurchmesser, newAderDurchmesser);
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
				msgs = ((InternalEObject)aderDurchmesser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_DURCHMESSER, null, msgs);
			if (newAderDurchmesser != null)
				msgs = ((InternalEObject)newAderDurchmesser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_DURCHMESSER, null, msgs);
			msgs = basicSetAderDurchmesser(newAderDurchmesser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_DURCHMESSER, newAderDurchmesser, newAderDurchmesser));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_QUERSCHNITT, oldAderQuerschnitt, newAderQuerschnitt);
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
				msgs = ((InternalEObject)aderQuerschnitt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_QUERSCHNITT, null, msgs);
			if (newAderQuerschnitt != null)
				msgs = ((InternalEObject)newAderQuerschnitt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_QUERSCHNITT, null, msgs);
			msgs = basicSetAderQuerschnitt(newAderQuerschnitt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_QUERSCHNITT, newAderQuerschnitt, newAderQuerschnitt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_RESERVE:
				return basicSetAderReserve(null, msgs);
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE:
				return basicSetAnzahlVerseilelemente(null, msgs);
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__VERSEILART:
				return basicSetVerseilart(null, msgs);
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_DURCHMESSER:
				return basicSetAderDurchmesser(null, msgs);
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_QUERSCHNITT:
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
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_RESERVE:
				return getAderReserve();
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE:
				return getAnzahlVerseilelemente();
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__VERSEILART:
				return getVerseilart();
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_DURCHMESSER:
				return getAderDurchmesser();
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_QUERSCHNITT:
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
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_RESERVE:
				setAderReserve((Ader_Reserve_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE:
				setAnzahlVerseilelemente((Anzahl_Verseilelemente_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__VERSEILART:
				setVerseilart((Verseilart_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_DURCHMESSER:
				setAderDurchmesser((Ader_Durchmesser_TypeClass)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_QUERSCHNITT:
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
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_RESERVE:
				setAderReserve((Ader_Reserve_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE:
				setAnzahlVerseilelemente((Anzahl_Verseilelemente_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__VERSEILART:
				setVerseilart((Verseilart_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_DURCHMESSER:
				setAderDurchmesser((Ader_Durchmesser_TypeClass)null);
				return;
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_QUERSCHNITT:
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
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_RESERVE:
				return aderReserve != null;
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE:
				return anzahlVerseilelemente != null;
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__VERSEILART:
				return verseilart != null;
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_DURCHMESSER:
				return aderDurchmesser != null;
			case Medien_und_TrassenPackage.KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_QUERSCHNITT:
				return aderQuerschnitt != null;
		}
		return super.eIsSet(featureID);
	}

} //Kabel_Element_AttributeGroupImpl
