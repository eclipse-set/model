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

import org.eclipse.set.model.model1902.Zuglenkung.Signalgruppe_Bezeichner_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL Signalgruppe Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.impl.ZL_Signalgruppe_Allg_AttributeGroupImpl#getSignalgruppeBezeichner <em>Signalgruppe Bezeichner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_Signalgruppe_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZL_Signalgruppe_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getSignalgruppeBezeichner() <em>Signalgruppe Bezeichner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalgruppeBezeichner()
	 * @generated
	 * @ordered
	 */
	protected Signalgruppe_Bezeichner_TypeClass signalgruppeBezeichner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_Signalgruppe_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalgruppe_Bezeichner_TypeClass getSignalgruppeBezeichner() {
		return signalgruppeBezeichner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalgruppeBezeichner(Signalgruppe_Bezeichner_TypeClass newSignalgruppeBezeichner, NotificationChain msgs) {
		Signalgruppe_Bezeichner_TypeClass oldSignalgruppeBezeichner = signalgruppeBezeichner;
		signalgruppeBezeichner = newSignalgruppeBezeichner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP__SIGNALGRUPPE_BEZEICHNER, oldSignalgruppeBezeichner, newSignalgruppeBezeichner);
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
	public void setSignalgruppeBezeichner(Signalgruppe_Bezeichner_TypeClass newSignalgruppeBezeichner) {
		if (newSignalgruppeBezeichner != signalgruppeBezeichner) {
			NotificationChain msgs = null;
			if (signalgruppeBezeichner != null)
				msgs = ((InternalEObject)signalgruppeBezeichner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP__SIGNALGRUPPE_BEZEICHNER, null, msgs);
			if (newSignalgruppeBezeichner != null)
				msgs = ((InternalEObject)newSignalgruppeBezeichner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP__SIGNALGRUPPE_BEZEICHNER, null, msgs);
			msgs = basicSetSignalgruppeBezeichner(newSignalgruppeBezeichner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP__SIGNALGRUPPE_BEZEICHNER, newSignalgruppeBezeichner, newSignalgruppeBezeichner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP__SIGNALGRUPPE_BEZEICHNER:
				return basicSetSignalgruppeBezeichner(null, msgs);
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP__SIGNALGRUPPE_BEZEICHNER:
				return getSignalgruppeBezeichner();
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP__SIGNALGRUPPE_BEZEICHNER:
				setSignalgruppeBezeichner((Signalgruppe_Bezeichner_TypeClass)newValue);
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP__SIGNALGRUPPE_BEZEICHNER:
				setSignalgruppeBezeichner((Signalgruppe_Bezeichner_TypeClass)null);
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP__SIGNALGRUPPE_BEZEICHNER:
				return signalgruppeBezeichner != null;
		}
		return super.eIsSet(featureID);
	}

} //ZL_Signalgruppe_Allg_AttributeGroupImpl
