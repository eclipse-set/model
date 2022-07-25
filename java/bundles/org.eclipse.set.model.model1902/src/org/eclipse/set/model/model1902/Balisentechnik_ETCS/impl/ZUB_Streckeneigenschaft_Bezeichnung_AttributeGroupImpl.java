/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bezeichnung_ZUB_SE_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB Streckeneigenschaft Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroupImpl#getBezeichnungZUBSE <em>Bezeichnung ZUBSE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungZUBSE() <em>Bezeichnung ZUBSE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungZUBSE()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_ZUB_SE_TypeClass bezeichnungZUBSE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_ZUB_SE_TypeClass getBezeichnungZUBSE() {
		return bezeichnungZUBSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungZUBSE(Bezeichnung_ZUB_SE_TypeClass newBezeichnungZUBSE, NotificationChain msgs) {
		Bezeichnung_ZUB_SE_TypeClass oldBezeichnungZUBSE = bezeichnungZUBSE;
		bezeichnungZUBSE = newBezeichnungZUBSE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUBSE, oldBezeichnungZUBSE, newBezeichnungZUBSE);
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
	public void setBezeichnungZUBSE(Bezeichnung_ZUB_SE_TypeClass newBezeichnungZUBSE) {
		if (newBezeichnungZUBSE != bezeichnungZUBSE) {
			NotificationChain msgs = null;
			if (bezeichnungZUBSE != null)
				msgs = ((InternalEObject)bezeichnungZUBSE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUBSE, null, msgs);
			if (newBezeichnungZUBSE != null)
				msgs = ((InternalEObject)newBezeichnungZUBSE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUBSE, null, msgs);
			msgs = basicSetBezeichnungZUBSE(newBezeichnungZUBSE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUBSE, newBezeichnungZUBSE, newBezeichnungZUBSE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUBSE:
				return basicSetBezeichnungZUBSE(null, msgs);
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
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUBSE:
				return getBezeichnungZUBSE();
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
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUBSE:
				setBezeichnungZUBSE((Bezeichnung_ZUB_SE_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUBSE:
				setBezeichnungZUBSE((Bezeichnung_ZUB_SE_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ZUB_STRECKENEIGENSCHAFT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ZUBSE:
				return bezeichnungZUBSE != null;
		}
		return super.eIsSet(featureID);
	}

} //ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroupImpl
