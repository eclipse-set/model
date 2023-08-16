/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zuglenkung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Zuglenkung.GK_TypeClass;
import org.eclipse.set.model.model11001.Zuglenkung.Tv_GK_TypeClass;
import org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup;
import org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL Fstr Anstoss GK Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Anstoss_GK_AttributeGroupImpl#getGK <em>GK</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.impl.ZL_Fstr_Anstoss_GK_AttributeGroupImpl#getTvGK <em>Tv GK</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_Fstr_Anstoss_GK_AttributeGroupImpl extends EObjectImpl implements ZL_Fstr_Anstoss_GK_AttributeGroup {
	/**
	 * The cached value of the '{@link #getGK() <em>GK</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGK()
	 * @generated
	 * @ordered
	 */
	protected GK_TypeClass gK;

	/**
	 * The cached value of the '{@link #getTvGK() <em>Tv GK</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTvGK()
	 * @generated
	 * @ordered
	 */
	protected Tv_GK_TypeClass tvGK;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_Fstr_Anstoss_GK_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GK_TypeClass getGK() {
		return gK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGK(GK_TypeClass newGK, NotificationChain msgs) {
		GK_TypeClass oldGK = gK;
		gK = newGK;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__GK, oldGK, newGK);
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
	public void setGK(GK_TypeClass newGK) {
		if (newGK != gK) {
			NotificationChain msgs = null;
			if (gK != null)
				msgs = ((InternalEObject)gK).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__GK, null, msgs);
			if (newGK != null)
				msgs = ((InternalEObject)newGK).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__GK, null, msgs);
			msgs = basicSetGK(newGK, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__GK, newGK, newGK));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tv_GK_TypeClass getTvGK() {
		return tvGK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTvGK(Tv_GK_TypeClass newTvGK, NotificationChain msgs) {
		Tv_GK_TypeClass oldTvGK = tvGK;
		tvGK = newTvGK;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__TV_GK, oldTvGK, newTvGK);
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
	public void setTvGK(Tv_GK_TypeClass newTvGK) {
		if (newTvGK != tvGK) {
			NotificationChain msgs = null;
			if (tvGK != null)
				msgs = ((InternalEObject)tvGK).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__TV_GK, null, msgs);
			if (newTvGK != null)
				msgs = ((InternalEObject)newTvGK).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__TV_GK, null, msgs);
			msgs = basicSetTvGK(newTvGK, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__TV_GK, newTvGK, newTvGK));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__GK:
				return basicSetGK(null, msgs);
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__TV_GK:
				return basicSetTvGK(null, msgs);
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
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__GK:
				return getGK();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__TV_GK:
				return getTvGK();
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
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__GK:
				setGK((GK_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__TV_GK:
				setTvGK((Tv_GK_TypeClass)newValue);
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
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__GK:
				setGK((GK_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__TV_GK:
				setTvGK((Tv_GK_TypeClass)null);
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
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__GK:
				return gK != null;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__TV_GK:
				return tvGK != null;
		}
		return super.eIsSet(featureID);
	}

} //ZL_Fstr_Anstoss_GK_AttributeGroupImpl
