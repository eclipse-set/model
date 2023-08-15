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

import org.eclipse.set.model.model11001.Verweise.ID_Fortschaltung_Start_TypeClass;

import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Besonderes_Schaltkriterium_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Telegrammwiederholung_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Schalt_AttributeGroup;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Schaltkriterium_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Fortschalt Krit Schalt Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_Fortschalt_Krit_Schalt_AttributeGroupImpl#getBesonderesSchaltkriterium <em>Besonderes Schaltkriterium</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_Fortschalt_Krit_Schalt_AttributeGroupImpl#getIDFortschaltungStart <em>ID Fortschaltung Start</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_Fortschalt_Krit_Schalt_AttributeGroupImpl#getTelegrammwiederholung <em>Telegrammwiederholung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZN_Fortschalt_Krit_Schalt_AttributeGroupImpl#getZNSchaltkriterium <em>ZN Schaltkriterium</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_Fortschalt_Krit_Schalt_AttributeGroupImpl extends EObjectImpl implements ZN_Fortschalt_Krit_Schalt_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBesonderesSchaltkriterium() <em>Besonderes Schaltkriterium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBesonderesSchaltkriterium()
	 * @generated
	 * @ordered
	 */
	protected Besonderes_Schaltkriterium_TypeClass besonderesSchaltkriterium;

	/**
	 * The cached value of the '{@link #getIDFortschaltungStart() <em>ID Fortschaltung Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFortschaltungStart()
	 * @generated
	 * @ordered
	 */
	protected ID_Fortschaltung_Start_TypeClass iDFortschaltungStart;

	/**
	 * The cached value of the '{@link #getTelegrammwiederholung() <em>Telegrammwiederholung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegrammwiederholung()
	 * @generated
	 * @ordered
	 */
	protected Telegrammwiederholung_TypeClass telegrammwiederholung;

	/**
	 * The cached value of the '{@link #getZNSchaltkriterium() <em>ZN Schaltkriterium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNSchaltkriterium()
	 * @generated
	 * @ordered
	 */
	protected ZN_Schaltkriterium_TypeClass zNSchaltkriterium;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_Fortschalt_Krit_Schalt_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Besonderes_Schaltkriterium_TypeClass getBesonderesSchaltkriterium() {
		return besonderesSchaltkriterium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBesonderesSchaltkriterium(Besonderes_Schaltkriterium_TypeClass newBesonderesSchaltkriterium, NotificationChain msgs) {
		Besonderes_Schaltkriterium_TypeClass oldBesonderesSchaltkriterium = besonderesSchaltkriterium;
		besonderesSchaltkriterium = newBesonderesSchaltkriterium;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM, oldBesonderesSchaltkriterium, newBesonderesSchaltkriterium);
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
	public void setBesonderesSchaltkriterium(Besonderes_Schaltkriterium_TypeClass newBesonderesSchaltkriterium) {
		if (newBesonderesSchaltkriterium != besonderesSchaltkriterium) {
			NotificationChain msgs = null;
			if (besonderesSchaltkriterium != null)
				msgs = ((InternalEObject)besonderesSchaltkriterium).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM, null, msgs);
			if (newBesonderesSchaltkriterium != null)
				msgs = ((InternalEObject)newBesonderesSchaltkriterium).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM, null, msgs);
			msgs = basicSetBesonderesSchaltkriterium(newBesonderesSchaltkriterium, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM, newBesonderesSchaltkriterium, newBesonderesSchaltkriterium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fortschaltung_Start_TypeClass getIDFortschaltungStart() {
		return iDFortschaltungStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFortschaltungStart(ID_Fortschaltung_Start_TypeClass newIDFortschaltungStart, NotificationChain msgs) {
		ID_Fortschaltung_Start_TypeClass oldIDFortschaltungStart = iDFortschaltungStart;
		iDFortschaltungStart = newIDFortschaltungStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ID_FORTSCHALTUNG_START, oldIDFortschaltungStart, newIDFortschaltungStart);
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
	public void setIDFortschaltungStart(ID_Fortschaltung_Start_TypeClass newIDFortschaltungStart) {
		if (newIDFortschaltungStart != iDFortschaltungStart) {
			NotificationChain msgs = null;
			if (iDFortschaltungStart != null)
				msgs = ((InternalEObject)iDFortschaltungStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ID_FORTSCHALTUNG_START, null, msgs);
			if (newIDFortschaltungStart != null)
				msgs = ((InternalEObject)newIDFortschaltungStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ID_FORTSCHALTUNG_START, null, msgs);
			msgs = basicSetIDFortschaltungStart(newIDFortschaltungStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ID_FORTSCHALTUNG_START, newIDFortschaltungStart, newIDFortschaltungStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegrammwiederholung_TypeClass getTelegrammwiederholung() {
		return telegrammwiederholung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegrammwiederholung(Telegrammwiederholung_TypeClass newTelegrammwiederholung, NotificationChain msgs) {
		Telegrammwiederholung_TypeClass oldTelegrammwiederholung = telegrammwiederholung;
		telegrammwiederholung = newTelegrammwiederholung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG, oldTelegrammwiederholung, newTelegrammwiederholung);
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
	public void setTelegrammwiederholung(Telegrammwiederholung_TypeClass newTelegrammwiederholung) {
		if (newTelegrammwiederholung != telegrammwiederholung) {
			NotificationChain msgs = null;
			if (telegrammwiederholung != null)
				msgs = ((InternalEObject)telegrammwiederholung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG, null, msgs);
			if (newTelegrammwiederholung != null)
				msgs = ((InternalEObject)newTelegrammwiederholung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG, null, msgs);
			msgs = basicSetTelegrammwiederholung(newTelegrammwiederholung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG, newTelegrammwiederholung, newTelegrammwiederholung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Schaltkriterium_TypeClass getZNSchaltkriterium() {
		return zNSchaltkriterium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNSchaltkriterium(ZN_Schaltkriterium_TypeClass newZNSchaltkriterium, NotificationChain msgs) {
		ZN_Schaltkriterium_TypeClass oldZNSchaltkriterium = zNSchaltkriterium;
		zNSchaltkriterium = newZNSchaltkriterium;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM, oldZNSchaltkriterium, newZNSchaltkriterium);
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
	public void setZNSchaltkriterium(ZN_Schaltkriterium_TypeClass newZNSchaltkriterium) {
		if (newZNSchaltkriterium != zNSchaltkriterium) {
			NotificationChain msgs = null;
			if (zNSchaltkriterium != null)
				msgs = ((InternalEObject)zNSchaltkriterium).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM, null, msgs);
			if (newZNSchaltkriterium != null)
				msgs = ((InternalEObject)newZNSchaltkriterium).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM, null, msgs);
			msgs = basicSetZNSchaltkriterium(newZNSchaltkriterium, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM, newZNSchaltkriterium, newZNSchaltkriterium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM:
				return basicSetBesonderesSchaltkriterium(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ID_FORTSCHALTUNG_START:
				return basicSetIDFortschaltungStart(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG:
				return basicSetTelegrammwiederholung(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM:
				return basicSetZNSchaltkriterium(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM:
				return getBesonderesSchaltkriterium();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ID_FORTSCHALTUNG_START:
				return getIDFortschaltungStart();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG:
				return getTelegrammwiederholung();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM:
				return getZNSchaltkriterium();
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM:
				setBesonderesSchaltkriterium((Besonderes_Schaltkriterium_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ID_FORTSCHALTUNG_START:
				setIDFortschaltungStart((ID_Fortschaltung_Start_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG:
				setTelegrammwiederholung((Telegrammwiederholung_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM:
				setZNSchaltkriterium((ZN_Schaltkriterium_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM:
				setBesonderesSchaltkriterium((Besonderes_Schaltkriterium_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ID_FORTSCHALTUNG_START:
				setIDFortschaltungStart((ID_Fortschaltung_Start_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG:
				setTelegrammwiederholung((Telegrammwiederholung_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM:
				setZNSchaltkriterium((ZN_Schaltkriterium_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM:
				return besonderesSchaltkriterium != null;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ID_FORTSCHALTUNG_START:
				return iDFortschaltungStart != null;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG:
				return telegrammwiederholung != null;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM:
				return zNSchaltkriterium != null;
		}
		return super.eIsSet(featureID);
	}

} //ZN_Fortschalt_Krit_Schalt_AttributeGroupImpl
