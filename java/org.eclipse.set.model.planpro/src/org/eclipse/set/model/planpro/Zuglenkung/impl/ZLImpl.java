/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zuglenkung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_ESTW_Zentraleinheit_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZN_TypeClass;

import org.eclipse.set.model.planpro.Zuglenkung.ZL;
import org.eclipse.set.model.planpro.Zuglenkung.ZL_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Zuglenkung.ZL_ZN_AttributeGroup;
import org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.impl.ZLImpl#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.impl.ZLImpl#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.impl.ZLImpl#getZLAllg <em>ZL Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.impl.ZLImpl#getZLZN <em>ZLZN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZLImpl extends Basis_ObjektImpl implements ZL {
	/**
	 * The cached value of the '{@link #getIDESTWZentraleinheit() <em>IDESTW Zentraleinheit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDESTWZentraleinheit()
	 * @generated
	 * @ordered
	 */
	protected ID_ESTW_Zentraleinheit_TypeClass iDESTWZentraleinheit;

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
	 * The cached value of the '{@link #getZLAllg() <em>ZL Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLAllg()
	 * @generated
	 * @ordered
	 */
	protected ZL_Allg_AttributeGroup zLAllg;

	/**
	 * The cached value of the '{@link #getZLZN() <em>ZLZN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLZN()
	 * @generated
	 * @ordered
	 */
	protected ZL_ZN_AttributeGroup zLZN;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ESTW_Zentraleinheit_TypeClass getIDESTWZentraleinheit() {
		return iDESTWZentraleinheit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDESTWZentraleinheit(ID_ESTW_Zentraleinheit_TypeClass newIDESTWZentraleinheit, NotificationChain msgs) {
		ID_ESTW_Zentraleinheit_TypeClass oldIDESTWZentraleinheit = iDESTWZentraleinheit;
		iDESTWZentraleinheit = newIDESTWZentraleinheit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL__IDESTW_ZENTRALEINHEIT, oldIDESTWZentraleinheit, newIDESTWZentraleinheit);
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
	public void setIDESTWZentraleinheit(ID_ESTW_Zentraleinheit_TypeClass newIDESTWZentraleinheit) {
		if (newIDESTWZentraleinheit != iDESTWZentraleinheit) {
			NotificationChain msgs = null;
			if (iDESTWZentraleinheit != null)
				msgs = ((InternalEObject)iDESTWZentraleinheit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL__IDESTW_ZENTRALEINHEIT, null, msgs);
			if (newIDESTWZentraleinheit != null)
				msgs = ((InternalEObject)newIDESTWZentraleinheit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL__IDESTW_ZENTRALEINHEIT, null, msgs);
			msgs = basicSetIDESTWZentraleinheit(newIDESTWZentraleinheit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL__IDESTW_ZENTRALEINHEIT, newIDESTWZentraleinheit, newIDESTWZentraleinheit));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL__IDZN, oldIDZN, newIDZN);
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
				msgs = ((InternalEObject)iDZN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL__IDZN, null, msgs);
			if (newIDZN != null)
				msgs = ((InternalEObject)newIDZN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL__IDZN, null, msgs);
			msgs = basicSetIDZN(newIDZN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL__IDZN, newIDZN, newIDZN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Allg_AttributeGroup getZLAllg() {
		return zLAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLAllg(ZL_Allg_AttributeGroup newZLAllg, NotificationChain msgs) {
		ZL_Allg_AttributeGroup oldZLAllg = zLAllg;
		zLAllg = newZLAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL__ZL_ALLG, oldZLAllg, newZLAllg);
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
	public void setZLAllg(ZL_Allg_AttributeGroup newZLAllg) {
		if (newZLAllg != zLAllg) {
			NotificationChain msgs = null;
			if (zLAllg != null)
				msgs = ((InternalEObject)zLAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL__ZL_ALLG, null, msgs);
			if (newZLAllg != null)
				msgs = ((InternalEObject)newZLAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL__ZL_ALLG, null, msgs);
			msgs = basicSetZLAllg(newZLAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL__ZL_ALLG, newZLAllg, newZLAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_ZN_AttributeGroup getZLZN() {
		return zLZN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLZN(ZL_ZN_AttributeGroup newZLZN, NotificationChain msgs) {
		ZL_ZN_AttributeGroup oldZLZN = zLZN;
		zLZN = newZLZN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL__ZLZN, oldZLZN, newZLZN);
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
	public void setZLZN(ZL_ZN_AttributeGroup newZLZN) {
		if (newZLZN != zLZN) {
			NotificationChain msgs = null;
			if (zLZN != null)
				msgs = ((InternalEObject)zLZN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL__ZLZN, null, msgs);
			if (newZLZN != null)
				msgs = ((InternalEObject)newZLZN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL__ZLZN, null, msgs);
			msgs = basicSetZLZN(newZLZN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL__ZLZN, newZLZN, newZLZN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL__IDESTW_ZENTRALEINHEIT:
				return basicSetIDESTWZentraleinheit(null, msgs);
			case ZuglenkungPackage.ZL__IDZN:
				return basicSetIDZN(null, msgs);
			case ZuglenkungPackage.ZL__ZL_ALLG:
				return basicSetZLAllg(null, msgs);
			case ZuglenkungPackage.ZL__ZLZN:
				return basicSetZLZN(null, msgs);
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
			case ZuglenkungPackage.ZL__IDESTW_ZENTRALEINHEIT:
				return getIDESTWZentraleinheit();
			case ZuglenkungPackage.ZL__IDZN:
				return getIDZN();
			case ZuglenkungPackage.ZL__ZL_ALLG:
				return getZLAllg();
			case ZuglenkungPackage.ZL__ZLZN:
				return getZLZN();
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
			case ZuglenkungPackage.ZL__IDESTW_ZENTRALEINHEIT:
				setIDESTWZentraleinheit((ID_ESTW_Zentraleinheit_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL__IDZN:
				setIDZN((ID_ZN_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL__ZL_ALLG:
				setZLAllg((ZL_Allg_AttributeGroup)newValue);
				return;
			case ZuglenkungPackage.ZL__ZLZN:
				setZLZN((ZL_ZN_AttributeGroup)newValue);
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
			case ZuglenkungPackage.ZL__IDESTW_ZENTRALEINHEIT:
				setIDESTWZentraleinheit((ID_ESTW_Zentraleinheit_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL__IDZN:
				setIDZN((ID_ZN_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL__ZL_ALLG:
				setZLAllg((ZL_Allg_AttributeGroup)null);
				return;
			case ZuglenkungPackage.ZL__ZLZN:
				setZLZN((ZL_ZN_AttributeGroup)null);
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
			case ZuglenkungPackage.ZL__IDESTW_ZENTRALEINHEIT:
				return iDESTWZentraleinheit != null;
			case ZuglenkungPackage.ZL__IDZN:
				return iDZN != null;
			case ZuglenkungPackage.ZL__ZL_ALLG:
				return zLAllg != null;
			case ZuglenkungPackage.ZL__ZLZN:
				return zLZN != null;
		}
		return super.eIsSet(featureID);
	}

} //ZLImpl
