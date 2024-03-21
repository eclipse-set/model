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

import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Zug_Rangier_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZL_Fstr_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZL_TypeClass;

import org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr;
import org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL Fstr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.impl.ZL_FstrImpl#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.impl.ZL_FstrImpl#getIDZL <em>IDZL</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.impl.ZL_FstrImpl#getIDZLFstr <em>IDZL Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.impl.ZL_FstrImpl#getZLFstrAllg <em>ZL Fstr Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_FstrImpl extends Basis_ObjektImpl implements ZL_Fstr {
	/**
	 * The cached value of the '{@link #getIDFstrZugRangier() <em>ID Fstr Zug Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrZugRangier()
	 * @generated
	 * @ordered
	 */
	protected ID_Fstr_Zug_Rangier_TypeClass iDFstrZugRangier;

	/**
	 * The cached value of the '{@link #getIDZL() <em>IDZL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZL()
	 * @generated
	 * @ordered
	 */
	protected ID_ZL_TypeClass iDZL;

	/**
	 * The cached value of the '{@link #getIDZLFstr() <em>IDZL Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLFstr()
	 * @generated
	 * @ordered
	 */
	protected ID_ZL_Fstr_TypeClass iDZLFstr;

	/**
	 * The cached value of the '{@link #getZLFstrAllg() <em>ZL Fstr Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLFstrAllg()
	 * @generated
	 * @ordered
	 */
	protected ZL_Fstr_Allg_AttributeGroup zLFstrAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_FstrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_FSTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_Zug_Rangier_TypeClass getIDFstrZugRangier() {
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass newIDFstrZugRangier, NotificationChain msgs) {
		ID_Fstr_Zug_Rangier_TypeClass oldIDFstrZugRangier = iDFstrZugRangier;
		iDFstrZugRangier = newIDFstrZugRangier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, newIDFstrZugRangier);
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
	public void setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass newIDFstrZugRangier) {
		if (newIDFstrZugRangier != iDFstrZugRangier) {
			NotificationChain msgs = null;
			if (iDFstrZugRangier != null)
				msgs = ((InternalEObject)iDFstrZugRangier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR__ID_FSTR_ZUG_RANGIER, null, msgs);
			if (newIDFstrZugRangier != null)
				msgs = ((InternalEObject)newIDFstrZugRangier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR__ID_FSTR_ZUG_RANGIER, null, msgs);
			msgs = basicSetIDFstrZugRangier(newIDFstrZugRangier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR__ID_FSTR_ZUG_RANGIER, newIDFstrZugRangier, newIDFstrZugRangier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZL_TypeClass getIDZL() {
		return iDZL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZL(ID_ZL_TypeClass newIDZL, NotificationChain msgs) {
		ID_ZL_TypeClass oldIDZL = iDZL;
		iDZL = newIDZL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR__IDZL, oldIDZL, newIDZL);
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
	public void setIDZL(ID_ZL_TypeClass newIDZL) {
		if (newIDZL != iDZL) {
			NotificationChain msgs = null;
			if (iDZL != null)
				msgs = ((InternalEObject)iDZL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR__IDZL, null, msgs);
			if (newIDZL != null)
				msgs = ((InternalEObject)newIDZL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR__IDZL, null, msgs);
			msgs = basicSetIDZL(newIDZL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR__IDZL, newIDZL, newIDZL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZL_Fstr_TypeClass getIDZLFstr() {
		return iDZLFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZLFstr(ID_ZL_Fstr_TypeClass newIDZLFstr, NotificationChain msgs) {
		ID_ZL_Fstr_TypeClass oldIDZLFstr = iDZLFstr;
		iDZLFstr = newIDZLFstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR__IDZL_FSTR, oldIDZLFstr, newIDZLFstr);
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
	public void setIDZLFstr(ID_ZL_Fstr_TypeClass newIDZLFstr) {
		if (newIDZLFstr != iDZLFstr) {
			NotificationChain msgs = null;
			if (iDZLFstr != null)
				msgs = ((InternalEObject)iDZLFstr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR__IDZL_FSTR, null, msgs);
			if (newIDZLFstr != null)
				msgs = ((InternalEObject)newIDZLFstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR__IDZL_FSTR, null, msgs);
			msgs = basicSetIDZLFstr(newIDZLFstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR__IDZL_FSTR, newIDZLFstr, newIDZLFstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Fstr_Allg_AttributeGroup getZLFstrAllg() {
		return zLFstrAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLFstrAllg(ZL_Fstr_Allg_AttributeGroup newZLFstrAllg, NotificationChain msgs) {
		ZL_Fstr_Allg_AttributeGroup oldZLFstrAllg = zLFstrAllg;
		zLFstrAllg = newZLFstrAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG, oldZLFstrAllg, newZLFstrAllg);
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
	public void setZLFstrAllg(ZL_Fstr_Allg_AttributeGroup newZLFstrAllg) {
		if (newZLFstrAllg != zLFstrAllg) {
			NotificationChain msgs = null;
			if (zLFstrAllg != null)
				msgs = ((InternalEObject)zLFstrAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG, null, msgs);
			if (newZLFstrAllg != null)
				msgs = ((InternalEObject)newZLFstrAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG, null, msgs);
			msgs = basicSetZLFstrAllg(newZLFstrAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG, newZLFstrAllg, newZLFstrAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_FSTR__ID_FSTR_ZUG_RANGIER:
				return basicSetIDFstrZugRangier(null, msgs);
			case ZuglenkungPackage.ZL_FSTR__IDZL:
				return basicSetIDZL(null, msgs);
			case ZuglenkungPackage.ZL_FSTR__IDZL_FSTR:
				return basicSetIDZLFstr(null, msgs);
			case ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG:
				return basicSetZLFstrAllg(null, msgs);
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
			case ZuglenkungPackage.ZL_FSTR__ID_FSTR_ZUG_RANGIER:
				return getIDFstrZugRangier();
			case ZuglenkungPackage.ZL_FSTR__IDZL:
				return getIDZL();
			case ZuglenkungPackage.ZL_FSTR__IDZL_FSTR:
				return getIDZLFstr();
			case ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG:
				return getZLFstrAllg();
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
			case ZuglenkungPackage.ZL_FSTR__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((ID_Fstr_Zug_Rangier_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR__IDZL:
				setIDZL((ID_ZL_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR__IDZL_FSTR:
				setIDZLFstr((ID_ZL_Fstr_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG:
				setZLFstrAllg((ZL_Fstr_Allg_AttributeGroup)newValue);
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
			case ZuglenkungPackage.ZL_FSTR__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((ID_Fstr_Zug_Rangier_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_FSTR__IDZL:
				setIDZL((ID_ZL_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_FSTR__IDZL_FSTR:
				setIDZLFstr((ID_ZL_Fstr_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG:
				setZLFstrAllg((ZL_Fstr_Allg_AttributeGroup)null);
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
			case ZuglenkungPackage.ZL_FSTR__ID_FSTR_ZUG_RANGIER:
				return iDFstrZugRangier != null;
			case ZuglenkungPackage.ZL_FSTR__IDZL:
				return iDZL != null;
			case ZuglenkungPackage.ZL_FSTR__IDZL_FSTR:
				return iDZLFstr != null;
			case ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG:
				return zLFstrAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //ZL_FstrImpl
