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

import org.eclipse.set.model.model1902.Verweise.ID_ESTW_Zentraleinheit_TypeClass;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_ZBS;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_ZBS_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN ZBS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_ZBSImpl#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_ZBSImpl#getZNZBSAllg <em>ZNZBS Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_ZBSImpl extends Basis_ObjektImpl implements ZN_ZBS {
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
	 * The cached value of the '{@link #getZNZBSAllg() <em>ZNZBS Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNZBSAllg()
	 * @generated
	 * @ordered
	 */
	protected ZN_ZBS_Allg_AttributeGroup zNZBSAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_ZBSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_ZBS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT, oldIDESTWZentraleinheit, newIDESTWZentraleinheit);
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
				msgs = ((InternalEObject)iDESTWZentraleinheit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT, null, msgs);
			if (newIDESTWZentraleinheit != null)
				msgs = ((InternalEObject)newIDESTWZentraleinheit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT, null, msgs);
			msgs = basicSetIDESTWZentraleinheit(newIDESTWZentraleinheit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT, newIDESTWZentraleinheit, newIDESTWZentraleinheit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_ZBS_Allg_AttributeGroup getZNZBSAllg() {
		return zNZBSAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNZBSAllg(ZN_ZBS_Allg_AttributeGroup newZNZBSAllg, NotificationChain msgs) {
		ZN_ZBS_Allg_AttributeGroup oldZNZBSAllg = zNZBSAllg;
		zNZBSAllg = newZNZBSAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG, oldZNZBSAllg, newZNZBSAllg);
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
	public void setZNZBSAllg(ZN_ZBS_Allg_AttributeGroup newZNZBSAllg) {
		if (newZNZBSAllg != zNZBSAllg) {
			NotificationChain msgs = null;
			if (zNZBSAllg != null)
				msgs = ((InternalEObject)zNZBSAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG, null, msgs);
			if (newZNZBSAllg != null)
				msgs = ((InternalEObject)newZNZBSAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG, null, msgs);
			msgs = basicSetZNZBSAllg(newZNZBSAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG, newZNZBSAllg, newZNZBSAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT:
				return basicSetIDESTWZentraleinheit(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG:
				return basicSetZNZBSAllg(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT:
				return getIDESTWZentraleinheit();
			case ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG:
				return getZNZBSAllg();
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
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT:
				setIDESTWZentraleinheit((ID_ESTW_Zentraleinheit_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG:
				setZNZBSAllg((ZN_ZBS_Allg_AttributeGroup)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT:
				setIDESTWZentraleinheit((ID_ESTW_Zentraleinheit_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG:
				setZNZBSAllg((ZN_ZBS_Allg_AttributeGroup)null);
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
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT:
				return iDESTWZentraleinheit != null;
			case ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG:
				return zNZBSAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //ZN_ZBSImpl
