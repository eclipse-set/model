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

import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Telegramm_02_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Telegramm_03_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Telegramm_04_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Telegramm_10_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Telegramm_21_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.Telegramm_30_TypeClass;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup;
import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZLV Bus US Zuordnung Telegramm Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroupImpl#getTelegramm02 <em>Telegramm02</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroupImpl#getTelegramm03 <em>Telegramm03</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroupImpl#getTelegramm04 <em>Telegramm04</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroupImpl#getTelegramm10 <em>Telegramm10</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroupImpl#getTelegramm21 <em>Telegramm21</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroupImpl#getTelegramm30 <em>Telegramm30</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroupImpl extends EObjectImpl implements ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup {
	/**
	 * The cached value of the '{@link #getTelegramm02() <em>Telegramm02</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegramm02()
	 * @generated
	 * @ordered
	 */
	protected Telegramm_02_TypeClass telegramm02;

	/**
	 * The cached value of the '{@link #getTelegramm03() <em>Telegramm03</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegramm03()
	 * @generated
	 * @ordered
	 */
	protected Telegramm_03_TypeClass telegramm03;

	/**
	 * The cached value of the '{@link #getTelegramm04() <em>Telegramm04</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegramm04()
	 * @generated
	 * @ordered
	 */
	protected Telegramm_04_TypeClass telegramm04;

	/**
	 * The cached value of the '{@link #getTelegramm10() <em>Telegramm10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegramm10()
	 * @generated
	 * @ordered
	 */
	protected Telegramm_10_TypeClass telegramm10;

	/**
	 * The cached value of the '{@link #getTelegramm21() <em>Telegramm21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegramm21()
	 * @generated
	 * @ordered
	 */
	protected Telegramm_21_TypeClass telegramm21;

	/**
	 * The cached value of the '{@link #getTelegramm30() <em>Telegramm30</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegramm30()
	 * @generated
	 * @ordered
	 */
	protected Telegramm_30_TypeClass telegramm30;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_02_TypeClass getTelegramm02() {
		return telegramm02;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegramm02(Telegramm_02_TypeClass newTelegramm02, NotificationChain msgs) {
		Telegramm_02_TypeClass oldTelegramm02 = telegramm02;
		telegramm02 = newTelegramm02;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM02, oldTelegramm02, newTelegramm02);
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
	public void setTelegramm02(Telegramm_02_TypeClass newTelegramm02) {
		if (newTelegramm02 != telegramm02) {
			NotificationChain msgs = null;
			if (telegramm02 != null)
				msgs = ((InternalEObject)telegramm02).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM02, null, msgs);
			if (newTelegramm02 != null)
				msgs = ((InternalEObject)newTelegramm02).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM02, null, msgs);
			msgs = basicSetTelegramm02(newTelegramm02, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM02, newTelegramm02, newTelegramm02));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_03_TypeClass getTelegramm03() {
		return telegramm03;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegramm03(Telegramm_03_TypeClass newTelegramm03, NotificationChain msgs) {
		Telegramm_03_TypeClass oldTelegramm03 = telegramm03;
		telegramm03 = newTelegramm03;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM03, oldTelegramm03, newTelegramm03);
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
	public void setTelegramm03(Telegramm_03_TypeClass newTelegramm03) {
		if (newTelegramm03 != telegramm03) {
			NotificationChain msgs = null;
			if (telegramm03 != null)
				msgs = ((InternalEObject)telegramm03).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM03, null, msgs);
			if (newTelegramm03 != null)
				msgs = ((InternalEObject)newTelegramm03).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM03, null, msgs);
			msgs = basicSetTelegramm03(newTelegramm03, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM03, newTelegramm03, newTelegramm03));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_04_TypeClass getTelegramm04() {
		return telegramm04;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegramm04(Telegramm_04_TypeClass newTelegramm04, NotificationChain msgs) {
		Telegramm_04_TypeClass oldTelegramm04 = telegramm04;
		telegramm04 = newTelegramm04;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM04, oldTelegramm04, newTelegramm04);
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
	public void setTelegramm04(Telegramm_04_TypeClass newTelegramm04) {
		if (newTelegramm04 != telegramm04) {
			NotificationChain msgs = null;
			if (telegramm04 != null)
				msgs = ((InternalEObject)telegramm04).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM04, null, msgs);
			if (newTelegramm04 != null)
				msgs = ((InternalEObject)newTelegramm04).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM04, null, msgs);
			msgs = basicSetTelegramm04(newTelegramm04, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM04, newTelegramm04, newTelegramm04));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_10_TypeClass getTelegramm10() {
		return telegramm10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegramm10(Telegramm_10_TypeClass newTelegramm10, NotificationChain msgs) {
		Telegramm_10_TypeClass oldTelegramm10 = telegramm10;
		telegramm10 = newTelegramm10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM10, oldTelegramm10, newTelegramm10);
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
	public void setTelegramm10(Telegramm_10_TypeClass newTelegramm10) {
		if (newTelegramm10 != telegramm10) {
			NotificationChain msgs = null;
			if (telegramm10 != null)
				msgs = ((InternalEObject)telegramm10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM10, null, msgs);
			if (newTelegramm10 != null)
				msgs = ((InternalEObject)newTelegramm10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM10, null, msgs);
			msgs = basicSetTelegramm10(newTelegramm10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM10, newTelegramm10, newTelegramm10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_21_TypeClass getTelegramm21() {
		return telegramm21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegramm21(Telegramm_21_TypeClass newTelegramm21, NotificationChain msgs) {
		Telegramm_21_TypeClass oldTelegramm21 = telegramm21;
		telegramm21 = newTelegramm21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM21, oldTelegramm21, newTelegramm21);
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
	public void setTelegramm21(Telegramm_21_TypeClass newTelegramm21) {
		if (newTelegramm21 != telegramm21) {
			NotificationChain msgs = null;
			if (telegramm21 != null)
				msgs = ((InternalEObject)telegramm21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM21, null, msgs);
			if (newTelegramm21 != null)
				msgs = ((InternalEObject)newTelegramm21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM21, null, msgs);
			msgs = basicSetTelegramm21(newTelegramm21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM21, newTelegramm21, newTelegramm21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_30_TypeClass getTelegramm30() {
		return telegramm30;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegramm30(Telegramm_30_TypeClass newTelegramm30, NotificationChain msgs) {
		Telegramm_30_TypeClass oldTelegramm30 = telegramm30;
		telegramm30 = newTelegramm30;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM30, oldTelegramm30, newTelegramm30);
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
	public void setTelegramm30(Telegramm_30_TypeClass newTelegramm30) {
		if (newTelegramm30 != telegramm30) {
			NotificationChain msgs = null;
			if (telegramm30 != null)
				msgs = ((InternalEObject)telegramm30).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM30, null, msgs);
			if (newTelegramm30 != null)
				msgs = ((InternalEObject)newTelegramm30).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM30, null, msgs);
			msgs = basicSetTelegramm30(newTelegramm30, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM30, newTelegramm30, newTelegramm30));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM02:
				return basicSetTelegramm02(null, msgs);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM03:
				return basicSetTelegramm03(null, msgs);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM04:
				return basicSetTelegramm04(null, msgs);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM10:
				return basicSetTelegramm10(null, msgs);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM21:
				return basicSetTelegramm21(null, msgs);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM30:
				return basicSetTelegramm30(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM02:
				return getTelegramm02();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM03:
				return getTelegramm03();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM04:
				return getTelegramm04();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM10:
				return getTelegramm10();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM21:
				return getTelegramm21();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM30:
				return getTelegramm30();
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM02:
				setTelegramm02((Telegramm_02_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM03:
				setTelegramm03((Telegramm_03_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM04:
				setTelegramm04((Telegramm_04_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM10:
				setTelegramm10((Telegramm_10_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM21:
				setTelegramm21((Telegramm_21_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM30:
				setTelegramm30((Telegramm_30_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM02:
				setTelegramm02((Telegramm_02_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM03:
				setTelegramm03((Telegramm_03_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM04:
				setTelegramm04((Telegramm_04_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM10:
				setTelegramm10((Telegramm_10_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM21:
				setTelegramm21((Telegramm_21_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM30:
				setTelegramm30((Telegramm_30_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM02:
				return telegramm02 != null;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM03:
				return telegramm03 != null;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM04:
				return telegramm04 != null;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM10:
				return telegramm10 != null;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM21:
				return telegramm21 != null;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG_TELEGRAMM_ATTRIBUTE_GROUP__TELEGRAMM30:
				return telegramm30 != null;
		}
		return super.eIsSet(featureID);
	}

} //ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroupImpl
