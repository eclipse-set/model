/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.ATO.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.ATO.ATOPackage;
import org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.ATO.NID_SP_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATO Segment Profile Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.ATO.impl.ATO_Segment_Profile_Bezeichnung_AttributeGroupImpl#getNIDSP <em>NIDSP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ATO_Segment_Profile_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements ATO_Segment_Profile_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getNIDSP() <em>NIDSP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNIDSP()
	 * @generated
	 * @ordered
	 */
	protected NID_SP_TypeClass nIDSP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATO_Segment_Profile_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ATOPackage.Literals.ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NID_SP_TypeClass getNIDSP() {
		return nIDSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNIDSP(NID_SP_TypeClass newNIDSP, NotificationChain msgs) {
		NID_SP_TypeClass oldNIDSP = nIDSP;
		nIDSP = newNIDSP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP__NIDSP, oldNIDSP, newNIDSP);
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
	public void setNIDSP(NID_SP_TypeClass newNIDSP) {
		if (newNIDSP != nIDSP) {
			NotificationChain msgs = null;
			if (nIDSP != null)
				msgs = ((InternalEObject)nIDSP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP__NIDSP, null, msgs);
			if (newNIDSP != null)
				msgs = ((InternalEObject)newNIDSP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP__NIDSP, null, msgs);
			msgs = basicSetNIDSP(newNIDSP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP__NIDSP, newNIDSP, newNIDSP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATOPackage.ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP__NIDSP:
				return basicSetNIDSP(null, msgs);
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
			case ATOPackage.ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP__NIDSP:
				return getNIDSP();
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
			case ATOPackage.ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP__NIDSP:
				setNIDSP((NID_SP_TypeClass)newValue);
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
			case ATOPackage.ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP__NIDSP:
				setNIDSP((NID_SP_TypeClass)null);
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
			case ATOPackage.ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP__NIDSP:
				return nIDSP != null;
		}
		return super.eIsSet(featureID);
	}

} //ATO_Segment_Profile_Bezeichnung_AttributeGroupImpl
