/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zuglenkung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Zuglenkung.Lenkziffernstellen_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_ZN_AttributeGroup;
import org.eclipse.set.model.model1902.Zuglenkung.ZN_Stellen_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL ZN Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.impl.ZL_ZN_AttributeGroupImpl#getLenkziffernstellen <em>Lenkziffernstellen</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.impl.ZL_ZN_AttributeGroupImpl#getZNStellen <em>ZN Stellen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_ZN_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZL_ZN_AttributeGroup {
	/**
	 * The cached value of the '{@link #getLenkziffernstellen() <em>Lenkziffernstellen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLenkziffernstellen()
	 * @generated
	 * @ordered
	 */
	protected Lenkziffernstellen_TypeClass lenkziffernstellen;

	/**
	 * The cached value of the '{@link #getZNStellen() <em>ZN Stellen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNStellen()
	 * @generated
	 * @ordered
	 */
	protected ZN_Stellen_TypeClass zNStellen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_ZN_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_ZN_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lenkziffernstellen_TypeClass getLenkziffernstellen() {
		return lenkziffernstellen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLenkziffernstellen(Lenkziffernstellen_TypeClass newLenkziffernstellen, NotificationChain msgs) {
		Lenkziffernstellen_TypeClass oldLenkziffernstellen = lenkziffernstellen;
		lenkziffernstellen = newLenkziffernstellen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__LENKZIFFERNSTELLEN, oldLenkziffernstellen, newLenkziffernstellen);
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
	public void setLenkziffernstellen(Lenkziffernstellen_TypeClass newLenkziffernstellen) {
		if (newLenkziffernstellen != lenkziffernstellen) {
			NotificationChain msgs = null;
			if (lenkziffernstellen != null)
				msgs = ((InternalEObject)lenkziffernstellen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__LENKZIFFERNSTELLEN, null, msgs);
			if (newLenkziffernstellen != null)
				msgs = ((InternalEObject)newLenkziffernstellen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__LENKZIFFERNSTELLEN, null, msgs);
			msgs = basicSetLenkziffernstellen(newLenkziffernstellen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__LENKZIFFERNSTELLEN, newLenkziffernstellen, newLenkziffernstellen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Stellen_TypeClass getZNStellen() {
		return zNStellen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNStellen(ZN_Stellen_TypeClass newZNStellen, NotificationChain msgs) {
		ZN_Stellen_TypeClass oldZNStellen = zNStellen;
		zNStellen = newZNStellen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__ZN_STELLEN, oldZNStellen, newZNStellen);
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
	public void setZNStellen(ZN_Stellen_TypeClass newZNStellen) {
		if (newZNStellen != zNStellen) {
			NotificationChain msgs = null;
			if (zNStellen != null)
				msgs = ((InternalEObject)zNStellen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__ZN_STELLEN, null, msgs);
			if (newZNStellen != null)
				msgs = ((InternalEObject)newZNStellen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__ZN_STELLEN, null, msgs);
			msgs = basicSetZNStellen(newZNStellen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__ZN_STELLEN, newZNStellen, newZNStellen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__LENKZIFFERNSTELLEN:
				return basicSetLenkziffernstellen(null, msgs);
			case ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__ZN_STELLEN:
				return basicSetZNStellen(null, msgs);
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
			case ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__LENKZIFFERNSTELLEN:
				return getLenkziffernstellen();
			case ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__ZN_STELLEN:
				return getZNStellen();
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
			case ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__LENKZIFFERNSTELLEN:
				setLenkziffernstellen((Lenkziffernstellen_TypeClass)newValue);
				return;
			case ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__ZN_STELLEN:
				setZNStellen((ZN_Stellen_TypeClass)newValue);
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
			case ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__LENKZIFFERNSTELLEN:
				setLenkziffernstellen((Lenkziffernstellen_TypeClass)null);
				return;
			case ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__ZN_STELLEN:
				setZNStellen((ZN_Stellen_TypeClass)null);
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
			case ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__LENKZIFFERNSTELLEN:
				return lenkziffernstellen != null;
			case ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP__ZN_STELLEN:
				return zNStellen != null;
		}
		return super.eIsSet(featureID);
	}

} //ZL_ZN_AttributeGroupImpl
