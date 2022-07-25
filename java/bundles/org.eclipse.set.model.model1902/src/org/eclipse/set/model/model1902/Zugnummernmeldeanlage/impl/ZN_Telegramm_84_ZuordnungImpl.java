/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_ZN_TypeClass;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.Telegramm_84_Alle_Fstr_AttributeGroup;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.Telegramm_84_Einzelne_Fstr_AttributeGroup;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.Telegramm_84_Verzicht_TypeClass;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Telegramm_84_Zuordnung;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Telegramm 84 Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_Telegramm_84_ZuordnungImpl#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_Telegramm_84_ZuordnungImpl#getTelegramm84AlleFstr <em>Telegramm84 Alle Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_Telegramm_84_ZuordnungImpl#getTelegramm84EinzelneFstr <em>Telegramm84 Einzelne Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_Telegramm_84_ZuordnungImpl#getTelegramm84Verzicht <em>Telegramm84 Verzicht</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_Telegramm_84_ZuordnungImpl extends Basis_ObjektImpl implements ZN_Telegramm_84_Zuordnung {
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
	 * The cached value of the '{@link #getTelegramm84AlleFstr() <em>Telegramm84 Alle Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegramm84AlleFstr()
	 * @generated
	 * @ordered
	 */
	protected Telegramm_84_Alle_Fstr_AttributeGroup telegramm84AlleFstr;

	/**
	 * The cached value of the '{@link #getTelegramm84EinzelneFstr() <em>Telegramm84 Einzelne Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegramm84EinzelneFstr()
	 * @generated
	 * @ordered
	 */
	protected Telegramm_84_Einzelne_Fstr_AttributeGroup telegramm84EinzelneFstr;

	/**
	 * The cached value of the '{@link #getTelegramm84Verzicht() <em>Telegramm84 Verzicht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegramm84Verzicht()
	 * @generated
	 * @ordered
	 */
	protected Telegramm_84_Verzicht_TypeClass telegramm84Verzicht;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_Telegramm_84_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_TELEGRAMM_84_ZUORDNUNG;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__IDZN, oldIDZN, newIDZN);
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
				msgs = ((InternalEObject)iDZN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__IDZN, null, msgs);
			if (newIDZN != null)
				msgs = ((InternalEObject)newIDZN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__IDZN, null, msgs);
			msgs = basicSetIDZN(newIDZN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__IDZN, newIDZN, newIDZN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_84_Alle_Fstr_AttributeGroup getTelegramm84AlleFstr() {
		return telegramm84AlleFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegramm84AlleFstr(Telegramm_84_Alle_Fstr_AttributeGroup newTelegramm84AlleFstr, NotificationChain msgs) {
		Telegramm_84_Alle_Fstr_AttributeGroup oldTelegramm84AlleFstr = telegramm84AlleFstr;
		telegramm84AlleFstr = newTelegramm84AlleFstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_ALLE_FSTR, oldTelegramm84AlleFstr, newTelegramm84AlleFstr);
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
	public void setTelegramm84AlleFstr(Telegramm_84_Alle_Fstr_AttributeGroup newTelegramm84AlleFstr) {
		if (newTelegramm84AlleFstr != telegramm84AlleFstr) {
			NotificationChain msgs = null;
			if (telegramm84AlleFstr != null)
				msgs = ((InternalEObject)telegramm84AlleFstr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_ALLE_FSTR, null, msgs);
			if (newTelegramm84AlleFstr != null)
				msgs = ((InternalEObject)newTelegramm84AlleFstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_ALLE_FSTR, null, msgs);
			msgs = basicSetTelegramm84AlleFstr(newTelegramm84AlleFstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_ALLE_FSTR, newTelegramm84AlleFstr, newTelegramm84AlleFstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_84_Einzelne_Fstr_AttributeGroup getTelegramm84EinzelneFstr() {
		return telegramm84EinzelneFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegramm84EinzelneFstr(Telegramm_84_Einzelne_Fstr_AttributeGroup newTelegramm84EinzelneFstr, NotificationChain msgs) {
		Telegramm_84_Einzelne_Fstr_AttributeGroup oldTelegramm84EinzelneFstr = telegramm84EinzelneFstr;
		telegramm84EinzelneFstr = newTelegramm84EinzelneFstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_EINZELNE_FSTR, oldTelegramm84EinzelneFstr, newTelegramm84EinzelneFstr);
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
	public void setTelegramm84EinzelneFstr(Telegramm_84_Einzelne_Fstr_AttributeGroup newTelegramm84EinzelneFstr) {
		if (newTelegramm84EinzelneFstr != telegramm84EinzelneFstr) {
			NotificationChain msgs = null;
			if (telegramm84EinzelneFstr != null)
				msgs = ((InternalEObject)telegramm84EinzelneFstr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_EINZELNE_FSTR, null, msgs);
			if (newTelegramm84EinzelneFstr != null)
				msgs = ((InternalEObject)newTelegramm84EinzelneFstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_EINZELNE_FSTR, null, msgs);
			msgs = basicSetTelegramm84EinzelneFstr(newTelegramm84EinzelneFstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_EINZELNE_FSTR, newTelegramm84EinzelneFstr, newTelegramm84EinzelneFstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_84_Verzicht_TypeClass getTelegramm84Verzicht() {
		return telegramm84Verzicht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegramm84Verzicht(Telegramm_84_Verzicht_TypeClass newTelegramm84Verzicht, NotificationChain msgs) {
		Telegramm_84_Verzicht_TypeClass oldTelegramm84Verzicht = telegramm84Verzicht;
		telegramm84Verzicht = newTelegramm84Verzicht;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_VERZICHT, oldTelegramm84Verzicht, newTelegramm84Verzicht);
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
	public void setTelegramm84Verzicht(Telegramm_84_Verzicht_TypeClass newTelegramm84Verzicht) {
		if (newTelegramm84Verzicht != telegramm84Verzicht) {
			NotificationChain msgs = null;
			if (telegramm84Verzicht != null)
				msgs = ((InternalEObject)telegramm84Verzicht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_VERZICHT, null, msgs);
			if (newTelegramm84Verzicht != null)
				msgs = ((InternalEObject)newTelegramm84Verzicht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_VERZICHT, null, msgs);
			msgs = basicSetTelegramm84Verzicht(newTelegramm84Verzicht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_VERZICHT, newTelegramm84Verzicht, newTelegramm84Verzicht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__IDZN:
				return basicSetIDZN(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_ALLE_FSTR:
				return basicSetTelegramm84AlleFstr(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_EINZELNE_FSTR:
				return basicSetTelegramm84EinzelneFstr(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_VERZICHT:
				return basicSetTelegramm84Verzicht(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__IDZN:
				return getIDZN();
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_ALLE_FSTR:
				return getTelegramm84AlleFstr();
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_EINZELNE_FSTR:
				return getTelegramm84EinzelneFstr();
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_VERZICHT:
				return getTelegramm84Verzicht();
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
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__IDZN:
				setIDZN((ID_ZN_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_ALLE_FSTR:
				setTelegramm84AlleFstr((Telegramm_84_Alle_Fstr_AttributeGroup)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_EINZELNE_FSTR:
				setTelegramm84EinzelneFstr((Telegramm_84_Einzelne_Fstr_AttributeGroup)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_VERZICHT:
				setTelegramm84Verzicht((Telegramm_84_Verzicht_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__IDZN:
				setIDZN((ID_ZN_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_ALLE_FSTR:
				setTelegramm84AlleFstr((Telegramm_84_Alle_Fstr_AttributeGroup)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_EINZELNE_FSTR:
				setTelegramm84EinzelneFstr((Telegramm_84_Einzelne_Fstr_AttributeGroup)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_VERZICHT:
				setTelegramm84Verzicht((Telegramm_84_Verzicht_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__IDZN:
				return iDZN != null;
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_ALLE_FSTR:
				return telegramm84AlleFstr != null;
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_EINZELNE_FSTR:
				return telegramm84EinzelneFstr != null;
			case ZugnummernmeldeanlagePackage.ZN_TELEGRAMM_84_ZUORDNUNG__TELEGRAMM84_VERZICHT:
				return telegramm84Verzicht != null;
		}
		return super.eIsSet(featureID);
	}

} //ZN_Telegramm_84_ZuordnungImpl
