/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Geodaten.Anzeigegefuehrt_ES_Kategorie_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.GeodatenPackage;
import org.eclipse.set.model.model11001.Geodaten.Geschwindigkeit_TypeClass;
import org.eclipse.set.model.model11001.Geodaten.Geschwindigkeitsprofil_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Geodaten.V_Profil_Art_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geschwindigkeitsprofil Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.impl.Geschwindigkeitsprofil_Allg_AttributeGroupImpl#getAnzeigegefuehrtESKategorie <em>Anzeigegefuehrt ES Kategorie</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.impl.Geschwindigkeitsprofil_Allg_AttributeGroupImpl#getGeschwindigkeit <em>Geschwindigkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.impl.Geschwindigkeitsprofil_Allg_AttributeGroupImpl#getVProfilArt <em>VProfil Art</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Geschwindigkeitsprofil_Allg_AttributeGroupImpl extends EObjectImpl implements Geschwindigkeitsprofil_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAnzeigegefuehrtESKategorie() <em>Anzeigegefuehrt ES Kategorie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzeigegefuehrtESKategorie()
	 * @generated
	 * @ordered
	 */
	protected Anzeigegefuehrt_ES_Kategorie_TypeClass anzeigegefuehrtESKategorie;

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
	public Anzeigegefuehrt_ES_Kategorie_TypeClass getAnzeigegefuehrtESKategorie() {
		return anzeigegefuehrtESKategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnzeigegefuehrtESKategorie(Anzeigegefuehrt_ES_Kategorie_TypeClass newAnzeigegefuehrtESKategorie, NotificationChain msgs) {
		Anzeigegefuehrt_ES_Kategorie_TypeClass oldAnzeigegefuehrtESKategorie = anzeigegefuehrtESKategorie;
		anzeigegefuehrtESKategorie = newAnzeigegefuehrtESKategorie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__ANZEIGEGEFUEHRT_ES_KATEGORIE, oldAnzeigegefuehrtESKategorie, newAnzeigegefuehrtESKategorie);
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
	public void setAnzeigegefuehrtESKategorie(Anzeigegefuehrt_ES_Kategorie_TypeClass newAnzeigegefuehrtESKategorie) {
		if (newAnzeigegefuehrtESKategorie != anzeigegefuehrtESKategorie) {
			NotificationChain msgs = null;
			if (anzeigegefuehrtESKategorie != null)
				msgs = ((InternalEObject)anzeigegefuehrtESKategorie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__ANZEIGEGEFUEHRT_ES_KATEGORIE, null, msgs);
			if (newAnzeigegefuehrtESKategorie != null)
				msgs = ((InternalEObject)newAnzeigegefuehrtESKategorie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__ANZEIGEGEFUEHRT_ES_KATEGORIE, null, msgs);
			msgs = basicSetAnzeigegefuehrtESKategorie(newAnzeigegefuehrtESKategorie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__ANZEIGEGEFUEHRT_ES_KATEGORIE, newAnzeigegefuehrtESKategorie, newAnzeigegefuehrtESKategorie));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__ANZEIGEGEFUEHRT_ES_KATEGORIE:
				return basicSetAnzeigegefuehrtESKategorie(null, msgs);
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT:
				return basicSetGeschwindigkeit(null, msgs);
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__VPROFIL_ART:
				return basicSetVProfilArt(null, msgs);
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
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__ANZEIGEGEFUEHRT_ES_KATEGORIE:
				return getAnzeigegefuehrtESKategorie();
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT:
				return getGeschwindigkeit();
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__VPROFIL_ART:
				return getVProfilArt();
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
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__ANZEIGEGEFUEHRT_ES_KATEGORIE:
				setAnzeigegefuehrtESKategorie((Anzeigegefuehrt_ES_Kategorie_TypeClass)newValue);
				return;
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT:
				setGeschwindigkeit((Geschwindigkeit_TypeClass)newValue);
				return;
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__VPROFIL_ART:
				setVProfilArt((V_Profil_Art_TypeClass)newValue);
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
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__ANZEIGEGEFUEHRT_ES_KATEGORIE:
				setAnzeigegefuehrtESKategorie((Anzeigegefuehrt_ES_Kategorie_TypeClass)null);
				return;
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT:
				setGeschwindigkeit((Geschwindigkeit_TypeClass)null);
				return;
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__VPROFIL_ART:
				setVProfilArt((V_Profil_Art_TypeClass)null);
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
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__ANZEIGEGEFUEHRT_ES_KATEGORIE:
				return anzeigegefuehrtESKategorie != null;
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__GESCHWINDIGKEIT:
				return geschwindigkeit != null;
			case GeodatenPackage.GESCHWINDIGKEITSPROFIL_ALLG_ATTRIBUTE_GROUP__VPROFIL_ART:
				return vProfilArt != null;
		}
		return super.eIsSet(featureID);
	}

} //Geschwindigkeitsprofil_Allg_AttributeGroupImpl
