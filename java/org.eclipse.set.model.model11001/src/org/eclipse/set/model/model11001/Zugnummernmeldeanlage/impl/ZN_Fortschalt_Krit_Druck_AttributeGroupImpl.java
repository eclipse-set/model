/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Ausfahrdruck_Gegengleis_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Ausfahrdruck_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Durchfahrdruck_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Einfahrdruck_Gegengleis_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Einfahrdruck_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Meldedruck_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Fortschalt Krit Druck Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_Fortschalt_Krit_Druck_AttributeGroupImpl#getAusfahrdruck <em>Ausfahrdruck</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_Fortschalt_Krit_Druck_AttributeGroupImpl#getAusfahrdruckGegengleis <em>Ausfahrdruck Gegengleis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_Fortschalt_Krit_Druck_AttributeGroupImpl#getDurchfahrdruck <em>Durchfahrdruck</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_Fortschalt_Krit_Druck_AttributeGroupImpl#getEinfahrdruck <em>Einfahrdruck</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_Fortschalt_Krit_Druck_AttributeGroupImpl#getEinfahrdruckGegengleis <em>Einfahrdruck Gegengleis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_Fortschalt_Krit_Druck_AttributeGroupImpl#getMeldedruck <em>Meldedruck</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_Fortschalt_Krit_Druck_AttributeGroupImpl extends EObjectImpl implements ZN_Fortschalt_Krit_Druck_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAusfahrdruck() <em>Ausfahrdruck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAusfahrdruck()
	 * @generated
	 * @ordered
	 */
	protected Ausfahrdruck_TypeClass ausfahrdruck;

	/**
	 * The cached value of the '{@link #getAusfahrdruckGegengleis() <em>Ausfahrdruck Gegengleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAusfahrdruckGegengleis()
	 * @generated
	 * @ordered
	 */
	protected Ausfahrdruck_Gegengleis_TypeClass ausfahrdruckGegengleis;

	/**
	 * The cached value of the '{@link #getDurchfahrdruck() <em>Durchfahrdruck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurchfahrdruck()
	 * @generated
	 * @ordered
	 */
	protected Durchfahrdruck_TypeClass durchfahrdruck;

	/**
	 * The cached value of the '{@link #getEinfahrdruck() <em>Einfahrdruck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinfahrdruck()
	 * @generated
	 * @ordered
	 */
	protected Einfahrdruck_TypeClass einfahrdruck;

	/**
	 * The cached value of the '{@link #getEinfahrdruckGegengleis() <em>Einfahrdruck Gegengleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinfahrdruckGegengleis()
	 * @generated
	 * @ordered
	 */
	protected Einfahrdruck_Gegengleis_TypeClass einfahrdruckGegengleis;

	/**
	 * The cached value of the '{@link #getMeldedruck() <em>Meldedruck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeldedruck()
	 * @generated
	 * @ordered
	 */
	protected Meldedruck_TypeClass meldedruck;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_Fortschalt_Krit_Druck_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ausfahrdruck_TypeClass getAusfahrdruck() {
		return ausfahrdruck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAusfahrdruck(Ausfahrdruck_TypeClass newAusfahrdruck, NotificationChain msgs) {
		Ausfahrdruck_TypeClass oldAusfahrdruck = ausfahrdruck;
		ausfahrdruck = newAusfahrdruck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK, oldAusfahrdruck, newAusfahrdruck);
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
	public void setAusfahrdruck(Ausfahrdruck_TypeClass newAusfahrdruck) {
		if (newAusfahrdruck != ausfahrdruck) {
			NotificationChain msgs = null;
			if (ausfahrdruck != null)
				msgs = ((InternalEObject)ausfahrdruck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK, null, msgs);
			if (newAusfahrdruck != null)
				msgs = ((InternalEObject)newAusfahrdruck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK, null, msgs);
			msgs = basicSetAusfahrdruck(newAusfahrdruck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK, newAusfahrdruck, newAusfahrdruck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ausfahrdruck_Gegengleis_TypeClass getAusfahrdruckGegengleis() {
		return ausfahrdruckGegengleis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAusfahrdruckGegengleis(Ausfahrdruck_Gegengleis_TypeClass newAusfahrdruckGegengleis, NotificationChain msgs) {
		Ausfahrdruck_Gegengleis_TypeClass oldAusfahrdruckGegengleis = ausfahrdruckGegengleis;
		ausfahrdruckGegengleis = newAusfahrdruckGegengleis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK_GEGENGLEIS, oldAusfahrdruckGegengleis, newAusfahrdruckGegengleis);
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
	public void setAusfahrdruckGegengleis(Ausfahrdruck_Gegengleis_TypeClass newAusfahrdruckGegengleis) {
		if (newAusfahrdruckGegengleis != ausfahrdruckGegengleis) {
			NotificationChain msgs = null;
			if (ausfahrdruckGegengleis != null)
				msgs = ((InternalEObject)ausfahrdruckGegengleis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK_GEGENGLEIS, null, msgs);
			if (newAusfahrdruckGegengleis != null)
				msgs = ((InternalEObject)newAusfahrdruckGegengleis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK_GEGENGLEIS, null, msgs);
			msgs = basicSetAusfahrdruckGegengleis(newAusfahrdruckGegengleis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK_GEGENGLEIS, newAusfahrdruckGegengleis, newAusfahrdruckGegengleis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Durchfahrdruck_TypeClass getDurchfahrdruck() {
		return durchfahrdruck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurchfahrdruck(Durchfahrdruck_TypeClass newDurchfahrdruck, NotificationChain msgs) {
		Durchfahrdruck_TypeClass oldDurchfahrdruck = durchfahrdruck;
		durchfahrdruck = newDurchfahrdruck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__DURCHFAHRDRUCK, oldDurchfahrdruck, newDurchfahrdruck);
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
	public void setDurchfahrdruck(Durchfahrdruck_TypeClass newDurchfahrdruck) {
		if (newDurchfahrdruck != durchfahrdruck) {
			NotificationChain msgs = null;
			if (durchfahrdruck != null)
				msgs = ((InternalEObject)durchfahrdruck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__DURCHFAHRDRUCK, null, msgs);
			if (newDurchfahrdruck != null)
				msgs = ((InternalEObject)newDurchfahrdruck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__DURCHFAHRDRUCK, null, msgs);
			msgs = basicSetDurchfahrdruck(newDurchfahrdruck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__DURCHFAHRDRUCK, newDurchfahrdruck, newDurchfahrdruck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einfahrdruck_TypeClass getEinfahrdruck() {
		return einfahrdruck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinfahrdruck(Einfahrdruck_TypeClass newEinfahrdruck, NotificationChain msgs) {
		Einfahrdruck_TypeClass oldEinfahrdruck = einfahrdruck;
		einfahrdruck = newEinfahrdruck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK, oldEinfahrdruck, newEinfahrdruck);
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
	public void setEinfahrdruck(Einfahrdruck_TypeClass newEinfahrdruck) {
		if (newEinfahrdruck != einfahrdruck) {
			NotificationChain msgs = null;
			if (einfahrdruck != null)
				msgs = ((InternalEObject)einfahrdruck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK, null, msgs);
			if (newEinfahrdruck != null)
				msgs = ((InternalEObject)newEinfahrdruck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK, null, msgs);
			msgs = basicSetEinfahrdruck(newEinfahrdruck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK, newEinfahrdruck, newEinfahrdruck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einfahrdruck_Gegengleis_TypeClass getEinfahrdruckGegengleis() {
		return einfahrdruckGegengleis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinfahrdruckGegengleis(Einfahrdruck_Gegengleis_TypeClass newEinfahrdruckGegengleis, NotificationChain msgs) {
		Einfahrdruck_Gegengleis_TypeClass oldEinfahrdruckGegengleis = einfahrdruckGegengleis;
		einfahrdruckGegengleis = newEinfahrdruckGegengleis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK_GEGENGLEIS, oldEinfahrdruckGegengleis, newEinfahrdruckGegengleis);
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
	public void setEinfahrdruckGegengleis(Einfahrdruck_Gegengleis_TypeClass newEinfahrdruckGegengleis) {
		if (newEinfahrdruckGegengleis != einfahrdruckGegengleis) {
			NotificationChain msgs = null;
			if (einfahrdruckGegengleis != null)
				msgs = ((InternalEObject)einfahrdruckGegengleis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK_GEGENGLEIS, null, msgs);
			if (newEinfahrdruckGegengleis != null)
				msgs = ((InternalEObject)newEinfahrdruckGegengleis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK_GEGENGLEIS, null, msgs);
			msgs = basicSetEinfahrdruckGegengleis(newEinfahrdruckGegengleis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK_GEGENGLEIS, newEinfahrdruckGegengleis, newEinfahrdruckGegengleis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Meldedruck_TypeClass getMeldedruck() {
		return meldedruck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeldedruck(Meldedruck_TypeClass newMeldedruck, NotificationChain msgs) {
		Meldedruck_TypeClass oldMeldedruck = meldedruck;
		meldedruck = newMeldedruck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__MELDEDRUCK, oldMeldedruck, newMeldedruck);
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
	public void setMeldedruck(Meldedruck_TypeClass newMeldedruck) {
		if (newMeldedruck != meldedruck) {
			NotificationChain msgs = null;
			if (meldedruck != null)
				msgs = ((InternalEObject)meldedruck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__MELDEDRUCK, null, msgs);
			if (newMeldedruck != null)
				msgs = ((InternalEObject)newMeldedruck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__MELDEDRUCK, null, msgs);
			msgs = basicSetMeldedruck(newMeldedruck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__MELDEDRUCK, newMeldedruck, newMeldedruck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK:
				return basicSetAusfahrdruck(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK_GEGENGLEIS:
				return basicSetAusfahrdruckGegengleis(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__DURCHFAHRDRUCK:
				return basicSetDurchfahrdruck(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK:
				return basicSetEinfahrdruck(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK_GEGENGLEIS:
				return basicSetEinfahrdruckGegengleis(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__MELDEDRUCK:
				return basicSetMeldedruck(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK:
				return getAusfahrdruck();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK_GEGENGLEIS:
				return getAusfahrdruckGegengleis();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__DURCHFAHRDRUCK:
				return getDurchfahrdruck();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK:
				return getEinfahrdruck();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK_GEGENGLEIS:
				return getEinfahrdruckGegengleis();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__MELDEDRUCK:
				return getMeldedruck();
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK:
				setAusfahrdruck((Ausfahrdruck_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK_GEGENGLEIS:
				setAusfahrdruckGegengleis((Ausfahrdruck_Gegengleis_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__DURCHFAHRDRUCK:
				setDurchfahrdruck((Durchfahrdruck_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK:
				setEinfahrdruck((Einfahrdruck_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK_GEGENGLEIS:
				setEinfahrdruckGegengleis((Einfahrdruck_Gegengleis_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__MELDEDRUCK:
				setMeldedruck((Meldedruck_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK:
				setAusfahrdruck((Ausfahrdruck_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK_GEGENGLEIS:
				setAusfahrdruckGegengleis((Ausfahrdruck_Gegengleis_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__DURCHFAHRDRUCK:
				setDurchfahrdruck((Durchfahrdruck_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK:
				setEinfahrdruck((Einfahrdruck_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK_GEGENGLEIS:
				setEinfahrdruckGegengleis((Einfahrdruck_Gegengleis_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__MELDEDRUCK:
				setMeldedruck((Meldedruck_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK:
				return ausfahrdruck != null;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__AUSFAHRDRUCK_GEGENGLEIS:
				return ausfahrdruckGegengleis != null;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__DURCHFAHRDRUCK:
				return durchfahrdruck != null;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK:
				return einfahrdruck != null;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__EINFAHRDRUCK_GEGENGLEIS:
				return einfahrdruckGegengleis != null;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_DRUCK_ATTRIBUTE_GROUP__MELDEDRUCK:
				return meldedruck != null;
		}
		return super.eIsSet(featureID);
	}

} //ZN_Fortschalt_Krit_Druck_AttributeGroupImpl
