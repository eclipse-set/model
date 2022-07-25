/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Geodaten.GeodatenPackage;
import org.eclipse.set.model.model1902.Geodaten.Geschwindigkeit_TypeClass;
import org.eclipse.set.model.model1902.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Geodaten.V_Profil_Art_TypeClass;
import org.eclipse.set.model.model1902.Geodaten.Wirkrichtung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geschwindigkeitsprofil Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.Geschwindigkeitsprofil_Allg_AttributeGroupImpl#getGeschwindigkeit <em>Geschwindigkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.Geschwindigkeitsprofil_Allg_AttributeGroupImpl#getVProfilArt <em>VProfil Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.Geschwindigkeitsprofil_Allg_AttributeGroupImpl#getWirkrichtung <em>Wirkrichtung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Geschwindigkeitsprofil_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Geschwindigkeitsprofil_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getGeschwindigkeit() <em>Geschwindigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschwindigkeit()
	 * @generated
	 * @ordered
	 */
	protected Geschwindigkeit_TypeClass geschwindigkeit;

	/**
	 * The cached value of the '{@link #getVProfilArt() <em>VProfil Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVProfilArt()
	 * @generated
	 * @ordered
	 */
	protected V_Profil_Art_TypeClass vProfilArt;

	/**
	 * The cached value of the '{@link #getWirkrichtung() <em>Wirkrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWirkrichtung()
	 * @generated
	 * @ordered
	 */
	protected Wirkrichtung_TypeClass wirkrichtung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Geschwindigkeitsprofil_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geschwindigkeit_TypeClass getGeschwindigkeit() {
		return geschwindigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeschwindigkeit(Geschwindigkeit_TypeClass newGeschwindigkeit, NotificationChain msgs) {
		Geschwindigkeit_TypeClass oldGeschwindigkeit = geschwindigkeit;
		geschwindigkeit = newGeschwindigkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT, oldGeschwindigkeit, newGeschwindigkeit);
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
	public void setGeschwindigkeit(Geschwindigkeit_TypeClass newGeschwindigkeit) {
		if (newGeschwindigkeit != geschwindigkeit) {
			NotificationChain msgs = null;
			if (geschwindigkeit != null)
				msgs = ((InternalEObject)geschwindigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT, null, msgs);
			if (newGeschwindigkeit != null)
				msgs = ((InternalEObject)newGeschwindigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT, null, msgs);
			msgs = basicSetGeschwindigkeit(newGeschwindigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT, newGeschwindigkeit, newGeschwindigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Profil_Art_TypeClass getVProfilArt() {
		return vProfilArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVProfilArt(V_Profil_Art_TypeClass newVProfilArt, NotificationChain msgs) {
		V_Profil_Art_TypeClass oldVProfilArt = vProfilArt;
		vProfilArt = newVProfilArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__VPROFIL_ART, oldVProfilArt, newVProfilArt);
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
	public void setVProfilArt(V_Profil_Art_TypeClass newVProfilArt) {
		if (newVProfilArt != vProfilArt) {
			NotificationChain msgs = null;
			if (vProfilArt != null)
				msgs = ((InternalEObject)vProfilArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__VPROFIL_ART, null, msgs);
			if (newVProfilArt != null)
				msgs = ((InternalEObject)newVProfilArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__VPROFIL_ART, null, msgs);
			msgs = basicSetVProfilArt(newVProfilArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__VPROFIL_ART, newVProfilArt, newVProfilArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wirkrichtung_TypeClass getWirkrichtung() {
		return wirkrichtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWirkrichtung(Wirkrichtung_TypeClass newWirkrichtung, NotificationChain msgs) {
		Wirkrichtung_TypeClass oldWirkrichtung = wirkrichtung;
		wirkrichtung = newWirkrichtung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__WIRKRICHTUNG, oldWirkrichtung, newWirkrichtung);
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
	public void setWirkrichtung(Wirkrichtung_TypeClass newWirkrichtung) {
		if (newWirkrichtung != wirkrichtung) {
			NotificationChain msgs = null;
			if (wirkrichtung != null)
				msgs = ((InternalEObject)wirkrichtung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__WIRKRICHTUNG, null, msgs);
			if (newWirkrichtung != null)
				msgs = ((InternalEObject)newWirkrichtung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__WIRKRICHTUNG, null, msgs);
			msgs = basicSetWirkrichtung(newWirkrichtung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__WIRKRICHTUNG, newWirkrichtung, newWirkrichtung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT:
				return basicSetGeschwindigkeit(null, msgs);
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__VPROFIL_ART:
				return basicSetVProfilArt(null, msgs);
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__WIRKRICHTUNG:
				return basicSetWirkrichtung(null, msgs);
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
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT:
				return getGeschwindigkeit();
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__VPROFIL_ART:
				return getVProfilArt();
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__WIRKRICHTUNG:
				return getWirkrichtung();
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
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT:
				setGeschwindigkeit((Geschwindigkeit_TypeClass)newValue);
				return;
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__VPROFIL_ART:
				setVProfilArt((V_Profil_Art_TypeClass)newValue);
				return;
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__WIRKRICHTUNG:
				setWirkrichtung((Wirkrichtung_TypeClass)newValue);
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
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT:
				setGeschwindigkeit((Geschwindigkeit_TypeClass)null);
				return;
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__VPROFIL_ART:
				setVProfilArt((V_Profil_Art_TypeClass)null);
				return;
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__WIRKRICHTUNG:
				setWirkrichtung((Wirkrichtung_TypeClass)null);
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
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT:
				return geschwindigkeit != null;
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__VPROFIL_ART:
				return vProfilArt != null;
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__WIRKRICHTUNG:
				return wirkrichtung != null;
		}
		return super.eIsSet(featureID);
	}

} //Geschwindigkeitsprofil_Allg_AttributeGroupImpl
