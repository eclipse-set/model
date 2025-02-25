/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_ZN_TypeClass;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_85_Alle_Fstr_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Telegramm_85_Einzelne_Fstr_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Telegramm_85_Zuordnung;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Telegramm 85 Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Telegramm_85_ZuordnungImpl#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Telegramm_85_ZuordnungImpl#getTelegramm85AlleFstr <em>Telegramm85 Alle Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Telegramm_85_ZuordnungImpl#getTelegramm85EinzelneFstr <em>Telegramm85 Einzelne Fstr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_Telegramm_85_ZuordnungImpl extends Basis_ObjektImpl implements ZN_Telegramm_85_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDZN() <em>IDZN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZN()
	 * @generated
	 * @ordered
	 */
	protected ID_ZN_TypeClass iDZN;

	/**
	 * The cached value of the '{@link #getTelegramm85AlleFstr() <em>Telegramm85 Alle Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegramm85AlleFstr()
	 * @generated
	 * @ordered
	 */
	protected Telegramm_85_Alle_Fstr_AttributeGroup telegramm85AlleFstr;

	/**
	 * The cached value of the '{@link #getTelegramm85EinzelneFstr() <em>Telegramm85 Einzelne Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegramm85EinzelneFstr()
	 * @generated
	 * @ordered
	 */
	protected Telegramm_85_Einzelne_Fstr_AttributeGroup telegramm85EinzelneFstr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_Telegramm_85_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_TELEGRAMM_85_ZUORDNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZN_TypeClass getIDZN() {
		return iDZN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZN(ID_ZN_TypeClass newIDZN, NotificationChain msgs) {
		ID_ZN_TypeClass oldIDZN = iDZN;
		iDZN = newIDZN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__IDZN, oldIDZN, newIDZN);
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
	public void setIDZN(ID_ZN_TypeClass newIDZN) {
		if (newIDZN != iDZN) {
			NotificationChain msgs = null;
			if (iDZN != null)
				msgs = ((InternalEObject)iDZN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__IDZN, null, msgs);
			if (newIDZN != null)
				msgs = ((InternalEObject)newIDZN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__IDZN, null, msgs);
			msgs = basicSetIDZN(newIDZN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__IDZN, newIDZN, newIDZN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_85_Alle_Fstr_AttributeGroup getTelegramm85AlleFstr() {
		return telegramm85AlleFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegramm85AlleFstr(Telegramm_85_Alle_Fstr_AttributeGroup newTelegramm85AlleFstr, NotificationChain msgs) {
		Telegramm_85_Alle_Fstr_AttributeGroup oldTelegramm85AlleFstr = telegramm85AlleFstr;
		telegramm85AlleFstr = newTelegramm85AlleFstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_ALLE_FSTR, oldTelegramm85AlleFstr, newTelegramm85AlleFstr);
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
	public void setTelegramm85AlleFstr(Telegramm_85_Alle_Fstr_AttributeGroup newTelegramm85AlleFstr) {
		if (newTelegramm85AlleFstr != telegramm85AlleFstr) {
			NotificationChain msgs = null;
			if (telegramm85AlleFstr != null)
				msgs = ((InternalEObject)telegramm85AlleFstr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_ALLE_FSTR, null, msgs);
			if (newTelegramm85AlleFstr != null)
				msgs = ((InternalEObject)newTelegramm85AlleFstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_ALLE_FSTR, null, msgs);
			msgs = basicSetTelegramm85AlleFstr(newTelegramm85AlleFstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_ALLE_FSTR, newTelegramm85AlleFstr, newTelegramm85AlleFstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_85_Einzelne_Fstr_AttributeGroup getTelegramm85EinzelneFstr() {
		return telegramm85EinzelneFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegramm85EinzelneFstr(Telegramm_85_Einzelne_Fstr_AttributeGroup newTelegramm85EinzelneFstr, NotificationChain msgs) {
		Telegramm_85_Einzelne_Fstr_AttributeGroup oldTelegramm85EinzelneFstr = telegramm85EinzelneFstr;
		telegramm85EinzelneFstr = newTelegramm85EinzelneFstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_EINZELNE_FSTR, oldTelegramm85EinzelneFstr, newTelegramm85EinzelneFstr);
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
	public void setTelegramm85EinzelneFstr(Telegramm_85_Einzelne_Fstr_AttributeGroup newTelegramm85EinzelneFstr) {
		if (newTelegramm85EinzelneFstr != telegramm85EinzelneFstr) {
			NotificationChain msgs = null;
			if (telegramm85EinzelneFstr != null)
				msgs = ((InternalEObject)telegramm85EinzelneFstr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_EINZELNE_FSTR, null, msgs);
			if (newTelegramm85EinzelneFstr != null)
				msgs = ((InternalEObject)newTelegramm85EinzelneFstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_EINZELNE_FSTR, null, msgs);
			msgs = basicSetTelegramm85EinzelneFstr(newTelegramm85EinzelneFstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_EINZELNE_FSTR, newTelegramm85EinzelneFstr, newTelegramm85EinzelneFstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__IDZN:
				return basicSetIDZN(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_ALLE_FSTR:
				return basicSetTelegramm85AlleFstr(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_EINZELNE_FSTR:
				return basicSetTelegramm85EinzelneFstr(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__IDZN:
				return getIDZN();
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_ALLE_FSTR:
				return getTelegramm85AlleFstr();
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_EINZELNE_FSTR:
				return getTelegramm85EinzelneFstr();
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
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__IDZN:
				setIDZN((ID_ZN_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_ALLE_FSTR:
				setTelegramm85AlleFstr((Telegramm_85_Alle_Fstr_AttributeGroup)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_EINZELNE_FSTR:
				setTelegramm85EinzelneFstr((Telegramm_85_Einzelne_Fstr_AttributeGroup)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__IDZN:
				setIDZN((ID_ZN_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_ALLE_FSTR:
				setTelegramm85AlleFstr((Telegramm_85_Alle_Fstr_AttributeGroup)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_EINZELNE_FSTR:
				setTelegramm85EinzelneFstr((Telegramm_85_Einzelne_Fstr_AttributeGroup)null);
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
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__IDZN:
				return iDZN != null;
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_ALLE_FSTR:
				return telegramm85AlleFstr != null;
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_85_ZUORDNUNG__TELEGRAMM85_EINZELNE_FSTR:
				return telegramm85EinzelneFstr != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZN_Telegramm_85_ZuordnungImpl
