/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bez_Strecke_BTS_1_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bez_Strecke_BTS_2_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bez_Strecke_BTS_3_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Km_BTS_1_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Km_BTS_2_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Km_BTS_3_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bgrenze RBC Wechsel BTS Kette Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupImpl#getBezStreckeBTS1 <em>Bez Strecke BTS1</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupImpl#getBezStreckeBTS2 <em>Bez Strecke BTS2</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupImpl#getBezStreckeBTS3 <em>Bez Strecke BTS3</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupImpl#getKmBTS1 <em>Km BTS1</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupImpl#getKmBTS2 <em>Km BTS2</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupImpl#getKmBTS3 <em>Km BTS3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupImpl extends EObjectImpl implements Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezStreckeBTS1() <em>Bez Strecke BTS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezStreckeBTS1()
	 * @generated
	 * @ordered
	 */
	protected Bez_Strecke_BTS_1_TypeClass bezStreckeBTS1;

	/**
	 * The cached value of the '{@link #getBezStreckeBTS2() <em>Bez Strecke BTS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezStreckeBTS2()
	 * @generated
	 * @ordered
	 */
	protected Bez_Strecke_BTS_2_TypeClass bezStreckeBTS2;

	/**
	 * The cached value of the '{@link #getBezStreckeBTS3() <em>Bez Strecke BTS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezStreckeBTS3()
	 * @generated
	 * @ordered
	 */
	protected Bez_Strecke_BTS_3_TypeClass bezStreckeBTS3;

	/**
	 * The cached value of the '{@link #getKmBTS1() <em>Km BTS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKmBTS1()
	 * @generated
	 * @ordered
	 */
	protected Km_BTS_1_TypeClass kmBTS1;

	/**
	 * The cached value of the '{@link #getKmBTS2() <em>Km BTS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKmBTS2()
	 * @generated
	 * @ordered
	 */
	protected Km_BTS_2_TypeClass kmBTS2;

	/**
	 * The cached value of the '{@link #getKmBTS3() <em>Km BTS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKmBTS3()
	 * @generated
	 * @ordered
	 */
	protected Km_BTS_3_TypeClass kmBTS3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_Strecke_BTS_1_TypeClass getBezStreckeBTS1() {
		return bezStreckeBTS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezStreckeBTS1(Bez_Strecke_BTS_1_TypeClass newBezStreckeBTS1, NotificationChain msgs) {
		Bez_Strecke_BTS_1_TypeClass oldBezStreckeBTS1 = bezStreckeBTS1;
		bezStreckeBTS1 = newBezStreckeBTS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS1, oldBezStreckeBTS1, newBezStreckeBTS1);
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
	public void setBezStreckeBTS1(Bez_Strecke_BTS_1_TypeClass newBezStreckeBTS1) {
		if (newBezStreckeBTS1 != bezStreckeBTS1) {
			NotificationChain msgs = null;
			if (bezStreckeBTS1 != null)
				msgs = ((InternalEObject)bezStreckeBTS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS1, null, msgs);
			if (newBezStreckeBTS1 != null)
				msgs = ((InternalEObject)newBezStreckeBTS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS1, null, msgs);
			msgs = basicSetBezStreckeBTS1(newBezStreckeBTS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS1, newBezStreckeBTS1, newBezStreckeBTS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_Strecke_BTS_2_TypeClass getBezStreckeBTS2() {
		return bezStreckeBTS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezStreckeBTS2(Bez_Strecke_BTS_2_TypeClass newBezStreckeBTS2, NotificationChain msgs) {
		Bez_Strecke_BTS_2_TypeClass oldBezStreckeBTS2 = bezStreckeBTS2;
		bezStreckeBTS2 = newBezStreckeBTS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS2, oldBezStreckeBTS2, newBezStreckeBTS2);
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
	public void setBezStreckeBTS2(Bez_Strecke_BTS_2_TypeClass newBezStreckeBTS2) {
		if (newBezStreckeBTS2 != bezStreckeBTS2) {
			NotificationChain msgs = null;
			if (bezStreckeBTS2 != null)
				msgs = ((InternalEObject)bezStreckeBTS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS2, null, msgs);
			if (newBezStreckeBTS2 != null)
				msgs = ((InternalEObject)newBezStreckeBTS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS2, null, msgs);
			msgs = basicSetBezStreckeBTS2(newBezStreckeBTS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS2, newBezStreckeBTS2, newBezStreckeBTS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_Strecke_BTS_3_TypeClass getBezStreckeBTS3() {
		return bezStreckeBTS3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezStreckeBTS3(Bez_Strecke_BTS_3_TypeClass newBezStreckeBTS3, NotificationChain msgs) {
		Bez_Strecke_BTS_3_TypeClass oldBezStreckeBTS3 = bezStreckeBTS3;
		bezStreckeBTS3 = newBezStreckeBTS3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS3, oldBezStreckeBTS3, newBezStreckeBTS3);
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
	public void setBezStreckeBTS3(Bez_Strecke_BTS_3_TypeClass newBezStreckeBTS3) {
		if (newBezStreckeBTS3 != bezStreckeBTS3) {
			NotificationChain msgs = null;
			if (bezStreckeBTS3 != null)
				msgs = ((InternalEObject)bezStreckeBTS3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS3, null, msgs);
			if (newBezStreckeBTS3 != null)
				msgs = ((InternalEObject)newBezStreckeBTS3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS3, null, msgs);
			msgs = basicSetBezStreckeBTS3(newBezStreckeBTS3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS3, newBezStreckeBTS3, newBezStreckeBTS3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Km_BTS_1_TypeClass getKmBTS1() {
		return kmBTS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKmBTS1(Km_BTS_1_TypeClass newKmBTS1, NotificationChain msgs) {
		Km_BTS_1_TypeClass oldKmBTS1 = kmBTS1;
		kmBTS1 = newKmBTS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS1, oldKmBTS1, newKmBTS1);
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
	public void setKmBTS1(Km_BTS_1_TypeClass newKmBTS1) {
		if (newKmBTS1 != kmBTS1) {
			NotificationChain msgs = null;
			if (kmBTS1 != null)
				msgs = ((InternalEObject)kmBTS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS1, null, msgs);
			if (newKmBTS1 != null)
				msgs = ((InternalEObject)newKmBTS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS1, null, msgs);
			msgs = basicSetKmBTS1(newKmBTS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS1, newKmBTS1, newKmBTS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Km_BTS_2_TypeClass getKmBTS2() {
		return kmBTS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKmBTS2(Km_BTS_2_TypeClass newKmBTS2, NotificationChain msgs) {
		Km_BTS_2_TypeClass oldKmBTS2 = kmBTS2;
		kmBTS2 = newKmBTS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS2, oldKmBTS2, newKmBTS2);
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
	public void setKmBTS2(Km_BTS_2_TypeClass newKmBTS2) {
		if (newKmBTS2 != kmBTS2) {
			NotificationChain msgs = null;
			if (kmBTS2 != null)
				msgs = ((InternalEObject)kmBTS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS2, null, msgs);
			if (newKmBTS2 != null)
				msgs = ((InternalEObject)newKmBTS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS2, null, msgs);
			msgs = basicSetKmBTS2(newKmBTS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS2, newKmBTS2, newKmBTS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Km_BTS_3_TypeClass getKmBTS3() {
		return kmBTS3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKmBTS3(Km_BTS_3_TypeClass newKmBTS3, NotificationChain msgs) {
		Km_BTS_3_TypeClass oldKmBTS3 = kmBTS3;
		kmBTS3 = newKmBTS3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS3, oldKmBTS3, newKmBTS3);
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
	public void setKmBTS3(Km_BTS_3_TypeClass newKmBTS3) {
		if (newKmBTS3 != kmBTS3) {
			NotificationChain msgs = null;
			if (kmBTS3 != null)
				msgs = ((InternalEObject)kmBTS3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS3, null, msgs);
			if (newKmBTS3 != null)
				msgs = ((InternalEObject)newKmBTS3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS3, null, msgs);
			msgs = basicSetKmBTS3(newKmBTS3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS3, newKmBTS3, newKmBTS3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS1:
				return basicSetBezStreckeBTS1(null, msgs);
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS2:
				return basicSetBezStreckeBTS2(null, msgs);
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS3:
				return basicSetBezStreckeBTS3(null, msgs);
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS1:
				return basicSetKmBTS1(null, msgs);
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS2:
				return basicSetKmBTS2(null, msgs);
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS3:
				return basicSetKmBTS3(null, msgs);
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
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS1:
				return getBezStreckeBTS1();
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS2:
				return getBezStreckeBTS2();
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS3:
				return getBezStreckeBTS3();
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS1:
				return getKmBTS1();
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS2:
				return getKmBTS2();
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS3:
				return getKmBTS3();
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
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS1:
				setBezStreckeBTS1((Bez_Strecke_BTS_1_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS2:
				setBezStreckeBTS2((Bez_Strecke_BTS_2_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS3:
				setBezStreckeBTS3((Bez_Strecke_BTS_3_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS1:
				setKmBTS1((Km_BTS_1_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS2:
				setKmBTS2((Km_BTS_2_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS3:
				setKmBTS3((Km_BTS_3_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS1:
				setBezStreckeBTS1((Bez_Strecke_BTS_1_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS2:
				setBezStreckeBTS2((Bez_Strecke_BTS_2_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS3:
				setBezStreckeBTS3((Bez_Strecke_BTS_3_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS1:
				setKmBTS1((Km_BTS_1_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS2:
				setKmBTS2((Km_BTS_2_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS3:
				setKmBTS3((Km_BTS_3_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS1:
				return bezStreckeBTS1 != null;
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS2:
				return bezStreckeBTS2 != null;
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__BEZ_STRECKE_BTS3:
				return bezStreckeBTS3 != null;
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS1:
				return kmBTS1 != null;
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS2:
				return kmBTS2 != null;
			case Balisentechnik_ETCSPackage.BGRENZE_RBC_WECHSEL_BTS_KETTE_ATTRIBUTE_GROUP__KM_BTS3:
				return kmBTS3 != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroupImpl
