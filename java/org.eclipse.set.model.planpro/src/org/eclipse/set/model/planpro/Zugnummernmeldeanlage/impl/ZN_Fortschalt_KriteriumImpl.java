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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZN_TypeClass;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Schalt_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Fortschalt Kriterium</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Fortschalt_KriteriumImpl#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Fortschalt_KriteriumImpl#getIDZNFortschaltKritStart <em>IDZN Fortschalt Krit Start</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Fortschalt_KriteriumImpl#getIDZNFortschaltKritZiel <em>IDZN Fortschalt Krit Ziel</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Fortschalt_KriteriumImpl#getZNFortschaltKritDruck <em>ZN Fortschalt Krit Druck</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZN_Fortschalt_KriteriumImpl#getZNFortschaltKritSchalt <em>ZN Fortschalt Krit Schalt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_Fortschalt_KriteriumImpl extends Basis_ObjektImpl implements ZN_Fortschalt_Kriterium {
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
	 * The cached value of the '{@link #getIDZNFortschaltKritStart() <em>IDZN Fortschalt Krit Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZNFortschaltKritStart()
	 * @generated
	 * @ordered
	 */
	protected ID_ZN_Anzeigefeld_TypeClass iDZNFortschaltKritStart;

	/**
	 * The cached value of the '{@link #getIDZNFortschaltKritZiel() <em>IDZN Fortschalt Krit Ziel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZNFortschaltKritZiel()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_ZN_Anzeigefeld_TypeClass> iDZNFortschaltKritZiel;

	/**
	 * The cached value of the '{@link #getZNFortschaltKritDruck() <em>ZN Fortschalt Krit Druck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNFortschaltKritDruck()
	 * @generated
	 * @ordered
	 */
	protected ZN_Fortschalt_Krit_Druck_AttributeGroup zNFortschaltKritDruck;

	/**
	 * The cached value of the '{@link #getZNFortschaltKritSchalt() <em>ZN Fortschalt Krit Schalt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNFortschaltKritSchalt()
	 * @generated
	 * @ordered
	 */
	protected EList<ZN_Fortschalt_Krit_Schalt_AttributeGroup> zNFortschaltKritSchalt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_Fortschalt_KriteriumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRITERIUM;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN, oldIDZN, newIDZN);
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
				msgs = ((InternalEObject)iDZN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN, null, msgs);
			if (newIDZN != null)
				msgs = ((InternalEObject)newIDZN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN, null, msgs);
			msgs = basicSetIDZN(newIDZN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN, newIDZN, newIDZN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZN_Anzeigefeld_TypeClass getIDZNFortschaltKritStart() {
		return iDZNFortschaltKritStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZNFortschaltKritStart(ID_ZN_Anzeigefeld_TypeClass newIDZNFortschaltKritStart, NotificationChain msgs) {
		ID_ZN_Anzeigefeld_TypeClass oldIDZNFortschaltKritStart = iDZNFortschaltKritStart;
		iDZNFortschaltKritStart = newIDZNFortschaltKritStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START, oldIDZNFortschaltKritStart, newIDZNFortschaltKritStart);
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
	public void setIDZNFortschaltKritStart(ID_ZN_Anzeigefeld_TypeClass newIDZNFortschaltKritStart) {
		if (newIDZNFortschaltKritStart != iDZNFortschaltKritStart) {
			NotificationChain msgs = null;
			if (iDZNFortschaltKritStart != null)
				msgs = ((InternalEObject)iDZNFortschaltKritStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START, null, msgs);
			if (newIDZNFortschaltKritStart != null)
				msgs = ((InternalEObject)newIDZNFortschaltKritStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START, null, msgs);
			msgs = basicSetIDZNFortschaltKritStart(newIDZNFortschaltKritStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START, newIDZNFortschaltKritStart, newIDZNFortschaltKritStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_ZN_Anzeigefeld_TypeClass> getIDZNFortschaltKritZiel() {
		if (iDZNFortschaltKritZiel == null) {
			iDZNFortschaltKritZiel = new EObjectContainmentEList<ID_ZN_Anzeigefeld_TypeClass>(ID_ZN_Anzeigefeld_TypeClass.class, this, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_ZIEL);
		}
		return iDZNFortschaltKritZiel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Fortschalt_Krit_Druck_AttributeGroup getZNFortschaltKritDruck() {
		return zNFortschaltKritDruck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNFortschaltKritDruck(ZN_Fortschalt_Krit_Druck_AttributeGroup newZNFortschaltKritDruck, NotificationChain msgs) {
		ZN_Fortschalt_Krit_Druck_AttributeGroup oldZNFortschaltKritDruck = zNFortschaltKritDruck;
		zNFortschaltKritDruck = newZNFortschaltKritDruck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK, oldZNFortschaltKritDruck, newZNFortschaltKritDruck);
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
	public void setZNFortschaltKritDruck(ZN_Fortschalt_Krit_Druck_AttributeGroup newZNFortschaltKritDruck) {
		if (newZNFortschaltKritDruck != zNFortschaltKritDruck) {
			NotificationChain msgs = null;
			if (zNFortschaltKritDruck != null)
				msgs = ((InternalEObject)zNFortschaltKritDruck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK, null, msgs);
			if (newZNFortschaltKritDruck != null)
				msgs = ((InternalEObject)newZNFortschaltKritDruck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK, null, msgs);
			msgs = basicSetZNFortschaltKritDruck(newZNFortschaltKritDruck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK, newZNFortschaltKritDruck, newZNFortschaltKritDruck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZN_Fortschalt_Krit_Schalt_AttributeGroup> getZNFortschaltKritSchalt() {
		if (zNFortschaltKritSchalt == null) {
			zNFortschaltKritSchalt = new EObjectContainmentEList<ZN_Fortschalt_Krit_Schalt_AttributeGroup>(ZN_Fortschalt_Krit_Schalt_AttributeGroup.class, this, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_SCHALT);
		}
		return zNFortschaltKritSchalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN:
				return basicSetIDZN(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START:
				return basicSetIDZNFortschaltKritStart(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_ZIEL:
				return ((InternalEList<?>)getIDZNFortschaltKritZiel()).basicRemove(otherEnd, msgs);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK:
				return basicSetZNFortschaltKritDruck(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_SCHALT:
				return ((InternalEList<?>)getZNFortschaltKritSchalt()).basicRemove(otherEnd, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN:
				return getIDZN();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START:
				return getIDZNFortschaltKritStart();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_ZIEL:
				return getIDZNFortschaltKritZiel();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK:
				return getZNFortschaltKritDruck();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_SCHALT:
				return getZNFortschaltKritSchalt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN:
				setIDZN((ID_ZN_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START:
				setIDZNFortschaltKritStart((ID_ZN_Anzeigefeld_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_ZIEL:
				getIDZNFortschaltKritZiel().clear();
				getIDZNFortschaltKritZiel().addAll((Collection<? extends ID_ZN_Anzeigefeld_TypeClass>)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK:
				setZNFortschaltKritDruck((ZN_Fortschalt_Krit_Druck_AttributeGroup)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_SCHALT:
				getZNFortschaltKritSchalt().clear();
				getZNFortschaltKritSchalt().addAll((Collection<? extends ZN_Fortschalt_Krit_Schalt_AttributeGroup>)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN:
				setIDZN((ID_ZN_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START:
				setIDZNFortschaltKritStart((ID_ZN_Anzeigefeld_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_ZIEL:
				getIDZNFortschaltKritZiel().clear();
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK:
				setZNFortschaltKritDruck((ZN_Fortschalt_Krit_Druck_AttributeGroup)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_SCHALT:
				getZNFortschaltKritSchalt().clear();
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN:
				return iDZN != null;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START:
				return iDZNFortschaltKritStart != null;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_ZIEL:
				return iDZNFortschaltKritZiel != null && !iDZNFortschaltKritZiel.isEmpty();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK:
				return zNFortschaltKritDruck != null;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_SCHALT:
				return zNFortschaltKritSchalt != null && !zNFortschaltKritSchalt.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZN_Fortschalt_KriteriumImpl
