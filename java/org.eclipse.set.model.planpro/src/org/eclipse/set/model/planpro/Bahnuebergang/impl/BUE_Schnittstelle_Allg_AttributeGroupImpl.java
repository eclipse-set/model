/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Nachlaufzeit_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Bahnuebergang.BUE_Vorlaufzeit_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.model.planpro.Bahnuebergang.Hp_Ersatzstecker_TypeClass;
import org.eclipse.set.model.planpro.Bahnuebergang.LFUE_Impuls_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Schnittstelle Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Schnittstelle_Allg_AttributeGroupImpl#getBUENachlaufzeit <em>BUE Nachlaufzeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Schnittstelle_Allg_AttributeGroupImpl#getBUEVorlaufzeit <em>BUE Vorlaufzeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Schnittstelle_Allg_AttributeGroupImpl#getHpErsatzstecker <em>Hp Ersatzstecker</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.impl.BUE_Schnittstelle_Allg_AttributeGroupImpl#getLFUEImpuls <em>LFUE Impuls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Schnittstelle_Allg_AttributeGroupImpl extends EObjectImpl implements BUE_Schnittstelle_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBUENachlaufzeit() <em>BUE Nachlaufzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUENachlaufzeit()
	 * @generated
	 * @ordered
	 */
	protected BUE_Nachlaufzeit_TypeClass bUENachlaufzeit;

	/**
	 * The cached value of the '{@link #getBUEVorlaufzeit() <em>BUE Vorlaufzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEVorlaufzeit()
	 * @generated
	 * @ordered
	 */
	protected BUE_Vorlaufzeit_TypeClass bUEVorlaufzeit;

	/**
	 * The cached value of the '{@link #getHpErsatzstecker() <em>Hp Ersatzstecker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHpErsatzstecker()
	 * @generated
	 * @ordered
	 */
	protected Hp_Ersatzstecker_TypeClass hpErsatzstecker;

	/**
	 * The cached value of the '{@link #getLFUEImpuls() <em>LFUE Impuls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLFUEImpuls()
	 * @generated
	 * @ordered
	 */
	protected LFUE_Impuls_TypeClass lFUEImpuls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Schnittstelle_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Schnittstelle_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Nachlaufzeit_TypeClass getBUENachlaufzeit() {
		return bUENachlaufzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUENachlaufzeit(BUE_Nachlaufzeit_TypeClass newBUENachlaufzeit, NotificationChain msgs) {
		BUE_Nachlaufzeit_TypeClass oldBUENachlaufzeit = bUENachlaufzeit;
		bUENachlaufzeit = newBUENachlaufzeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_NACHLAUFZEIT, oldBUENachlaufzeit, newBUENachlaufzeit);
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
	public void setBUENachlaufzeit(BUE_Nachlaufzeit_TypeClass newBUENachlaufzeit) {
		if (newBUENachlaufzeit != bUENachlaufzeit) {
			NotificationChain msgs = null;
			if (bUENachlaufzeit != null)
				msgs = ((InternalEObject)bUENachlaufzeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_NACHLAUFZEIT, null, msgs);
			if (newBUENachlaufzeit != null)
				msgs = ((InternalEObject)newBUENachlaufzeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_NACHLAUFZEIT, null, msgs);
			msgs = basicSetBUENachlaufzeit(newBUENachlaufzeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_NACHLAUFZEIT, newBUENachlaufzeit, newBUENachlaufzeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Vorlaufzeit_TypeClass getBUEVorlaufzeit() {
		return bUEVorlaufzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUEVorlaufzeit(BUE_Vorlaufzeit_TypeClass newBUEVorlaufzeit, NotificationChain msgs) {
		BUE_Vorlaufzeit_TypeClass oldBUEVorlaufzeit = bUEVorlaufzeit;
		bUEVorlaufzeit = newBUEVorlaufzeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_VORLAUFZEIT, oldBUEVorlaufzeit, newBUEVorlaufzeit);
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
	public void setBUEVorlaufzeit(BUE_Vorlaufzeit_TypeClass newBUEVorlaufzeit) {
		if (newBUEVorlaufzeit != bUEVorlaufzeit) {
			NotificationChain msgs = null;
			if (bUEVorlaufzeit != null)
				msgs = ((InternalEObject)bUEVorlaufzeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_VORLAUFZEIT, null, msgs);
			if (newBUEVorlaufzeit != null)
				msgs = ((InternalEObject)newBUEVorlaufzeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_VORLAUFZEIT, null, msgs);
			msgs = basicSetBUEVorlaufzeit(newBUEVorlaufzeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_VORLAUFZEIT, newBUEVorlaufzeit, newBUEVorlaufzeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hp_Ersatzstecker_TypeClass getHpErsatzstecker() {
		return hpErsatzstecker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHpErsatzstecker(Hp_Ersatzstecker_TypeClass newHpErsatzstecker, NotificationChain msgs) {
		Hp_Ersatzstecker_TypeClass oldHpErsatzstecker = hpErsatzstecker;
		hpErsatzstecker = newHpErsatzstecker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__HP_ERSATZSTECKER, oldHpErsatzstecker, newHpErsatzstecker);
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
	public void setHpErsatzstecker(Hp_Ersatzstecker_TypeClass newHpErsatzstecker) {
		if (newHpErsatzstecker != hpErsatzstecker) {
			NotificationChain msgs = null;
			if (hpErsatzstecker != null)
				msgs = ((InternalEObject)hpErsatzstecker).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__HP_ERSATZSTECKER, null, msgs);
			if (newHpErsatzstecker != null)
				msgs = ((InternalEObject)newHpErsatzstecker).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__HP_ERSATZSTECKER, null, msgs);
			msgs = basicSetHpErsatzstecker(newHpErsatzstecker, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__HP_ERSATZSTECKER, newHpErsatzstecker, newHpErsatzstecker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LFUE_Impuls_TypeClass getLFUEImpuls() {
		return lFUEImpuls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLFUEImpuls(LFUE_Impuls_TypeClass newLFUEImpuls, NotificationChain msgs) {
		LFUE_Impuls_TypeClass oldLFUEImpuls = lFUEImpuls;
		lFUEImpuls = newLFUEImpuls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__LFUE_IMPULS, oldLFUEImpuls, newLFUEImpuls);
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
	public void setLFUEImpuls(LFUE_Impuls_TypeClass newLFUEImpuls) {
		if (newLFUEImpuls != lFUEImpuls) {
			NotificationChain msgs = null;
			if (lFUEImpuls != null)
				msgs = ((InternalEObject)lFUEImpuls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__LFUE_IMPULS, null, msgs);
			if (newLFUEImpuls != null)
				msgs = ((InternalEObject)newLFUEImpuls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__LFUE_IMPULS, null, msgs);
			msgs = basicSetLFUEImpuls(newLFUEImpuls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__LFUE_IMPULS, newLFUEImpuls, newLFUEImpuls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_NACHLAUFZEIT:
				return basicSetBUENachlaufzeit(null, msgs);
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_VORLAUFZEIT:
				return basicSetBUEVorlaufzeit(null, msgs);
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__HP_ERSATZSTECKER:
				return basicSetHpErsatzstecker(null, msgs);
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__LFUE_IMPULS:
				return basicSetLFUEImpuls(null, msgs);
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
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_NACHLAUFZEIT:
				return getBUENachlaufzeit();
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_VORLAUFZEIT:
				return getBUEVorlaufzeit();
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__HP_ERSATZSTECKER:
				return getHpErsatzstecker();
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__LFUE_IMPULS:
				return getLFUEImpuls();
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
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_NACHLAUFZEIT:
				setBUENachlaufzeit((BUE_Nachlaufzeit_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_VORLAUFZEIT:
				setBUEVorlaufzeit((BUE_Vorlaufzeit_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__HP_ERSATZSTECKER:
				setHpErsatzstecker((Hp_Ersatzstecker_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__LFUE_IMPULS:
				setLFUEImpuls((LFUE_Impuls_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_NACHLAUFZEIT:
				setBUENachlaufzeit((BUE_Nachlaufzeit_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_VORLAUFZEIT:
				setBUEVorlaufzeit((BUE_Vorlaufzeit_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__HP_ERSATZSTECKER:
				setHpErsatzstecker((Hp_Ersatzstecker_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__LFUE_IMPULS:
				setLFUEImpuls((LFUE_Impuls_TypeClass)null);
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
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_NACHLAUFZEIT:
				return bUENachlaufzeit != null;
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__BUE_VORLAUFZEIT:
				return bUEVorlaufzeit != null;
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__HP_ERSATZSTECKER:
				return hpErsatzstecker != null;
			case BahnuebergangPackage.BUE_SCHNITTSTELLE_ALLG_ATTRIBUTE_GROUP__LFUE_IMPULS:
				return lFUEImpuls != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //BUE_Schnittstelle_Allg_AttributeGroupImpl
