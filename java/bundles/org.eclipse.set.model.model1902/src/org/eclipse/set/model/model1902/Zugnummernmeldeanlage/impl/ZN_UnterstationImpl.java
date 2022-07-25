/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Verweise.ID_GEO_Punkt_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Strecke_Punkt_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_ZN_ZBS_TypeClass;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Unterstation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_UnterstationImpl#getIDGEOPunkt <em>IDGEO Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_UnterstationImpl#getIDStreckePunkt <em>ID Strecke Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_UnterstationImpl#getIDZNZBS <em>IDZNZBS</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZN_UnterstationImpl#getZNUnterstationAllg <em>ZN Unterstation Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_UnterstationImpl extends Basis_ObjektImpl implements ZN_Unterstation {
	/**
	 * The cached value of the '{@link #getIDGEOPunkt() <em>IDGEO Punkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOPunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_GEO_Punkt_TypeClass iDGEOPunkt;

	/**
	 * The cached value of the '{@link #getIDStreckePunkt() <em>ID Strecke Punkt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStreckePunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Strecke_Punkt_TypeClass> iDStreckePunkt;

	/**
	 * The cached value of the '{@link #getIDZNZBS() <em>IDZNZBS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZNZBS()
	 * @generated
	 * @ordered
	 */
	protected ID_ZN_ZBS_TypeClass iDZNZBS;

	/**
	 * The cached value of the '{@link #getZNUnterstationAllg() <em>ZN Unterstation Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNUnterstationAllg()
	 * @generated
	 * @ordered
	 */
	protected ZN_Unterstation_Allg_AttributeGroup zNUnterstationAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_UnterstationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_UNTERSTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_GEO_Punkt_TypeClass getIDGEOPunkt() {
		return iDGEOPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDGEOPunkt(ID_GEO_Punkt_TypeClass newIDGEOPunkt, NotificationChain msgs) {
		ID_GEO_Punkt_TypeClass oldIDGEOPunkt = iDGEOPunkt;
		iDGEOPunkt = newIDGEOPunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDGEO_PUNKT, oldIDGEOPunkt, newIDGEOPunkt);
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
	public void setIDGEOPunkt(ID_GEO_Punkt_TypeClass newIDGEOPunkt) {
		if (newIDGEOPunkt != iDGEOPunkt) {
			NotificationChain msgs = null;
			if (iDGEOPunkt != null)
				msgs = ((InternalEObject)iDGEOPunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDGEO_PUNKT, null, msgs);
			if (newIDGEOPunkt != null)
				msgs = ((InternalEObject)newIDGEOPunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDGEO_PUNKT, null, msgs);
			msgs = basicSetIDGEOPunkt(newIDGEOPunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDGEO_PUNKT, newIDGEOPunkt, newIDGEOPunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Strecke_Punkt_TypeClass> getIDStreckePunkt() {
		if (iDStreckePunkt == null) {
			iDStreckePunkt = new EObjectContainmentEList<ID_Strecke_Punkt_TypeClass>(ID_Strecke_Punkt_TypeClass.class, this, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ID_STRECKE_PUNKT);
		}
		return iDStreckePunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_ZN_ZBS_TypeClass getIDZNZBS() {
		return iDZNZBS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZNZBS(ID_ZN_ZBS_TypeClass newIDZNZBS, NotificationChain msgs) {
		ID_ZN_ZBS_TypeClass oldIDZNZBS = iDZNZBS;
		iDZNZBS = newIDZNZBS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS, oldIDZNZBS, newIDZNZBS);
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
	public void setIDZNZBS(ID_ZN_ZBS_TypeClass newIDZNZBS) {
		if (newIDZNZBS != iDZNZBS) {
			NotificationChain msgs = null;
			if (iDZNZBS != null)
				msgs = ((InternalEObject)iDZNZBS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS, null, msgs);
			if (newIDZNZBS != null)
				msgs = ((InternalEObject)newIDZNZBS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS, null, msgs);
			msgs = basicSetIDZNZBS(newIDZNZBS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS, newIDZNZBS, newIDZNZBS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Unterstation_Allg_AttributeGroup getZNUnterstationAllg() {
		return zNUnterstationAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNUnterstationAllg(ZN_Unterstation_Allg_AttributeGroup newZNUnterstationAllg, NotificationChain msgs) {
		ZN_Unterstation_Allg_AttributeGroup oldZNUnterstationAllg = zNUnterstationAllg;
		zNUnterstationAllg = newZNUnterstationAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG, oldZNUnterstationAllg, newZNUnterstationAllg);
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
	public void setZNUnterstationAllg(ZN_Unterstation_Allg_AttributeGroup newZNUnterstationAllg) {
		if (newZNUnterstationAllg != zNUnterstationAllg) {
			NotificationChain msgs = null;
			if (zNUnterstationAllg != null)
				msgs = ((InternalEObject)zNUnterstationAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG, null, msgs);
			if (newZNUnterstationAllg != null)
				msgs = ((InternalEObject)newZNUnterstationAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG, null, msgs);
			msgs = basicSetZNUnterstationAllg(newZNUnterstationAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG, newZNUnterstationAllg, newZNUnterstationAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDGEO_PUNKT:
				return basicSetIDGEOPunkt(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ID_STRECKE_PUNKT:
				return ((InternalEList<?>)getIDStreckePunkt()).basicRemove(otherEnd, msgs);
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS:
				return basicSetIDZNZBS(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG:
				return basicSetZNUnterstationAllg(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDGEO_PUNKT:
				return getIDGEOPunkt();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ID_STRECKE_PUNKT:
				return getIDStreckePunkt();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS:
				return getIDZNZBS();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG:
				return getZNUnterstationAllg();
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDGEO_PUNKT:
				setIDGEOPunkt((ID_GEO_Punkt_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ID_STRECKE_PUNKT:
				getIDStreckePunkt().clear();
				getIDStreckePunkt().addAll((Collection<? extends ID_Strecke_Punkt_TypeClass>)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS:
				setIDZNZBS((ID_ZN_ZBS_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG:
				setZNUnterstationAllg((ZN_Unterstation_Allg_AttributeGroup)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDGEO_PUNKT:
				setIDGEOPunkt((ID_GEO_Punkt_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ID_STRECKE_PUNKT:
				getIDStreckePunkt().clear();
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS:
				setIDZNZBS((ID_ZN_ZBS_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG:
				setZNUnterstationAllg((ZN_Unterstation_Allg_AttributeGroup)null);
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDGEO_PUNKT:
				return iDGEOPunkt != null;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ID_STRECKE_PUNKT:
				return iDStreckePunkt != null && !iDStreckePunkt.isEmpty();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS:
				return iDZNZBS != null;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG:
				return zNUnterstationAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //ZN_UnterstationImpl
