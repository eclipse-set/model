/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Bedienung.Bedien_Einricht_Oertl_Bez_TypeClass;
import org.eclipse.set.model.model11001.Bedienung.Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Bedienung.BedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Einrichtung Oertlich Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.impl.Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupImpl#getBedienEinrichtOertlBez <em>Bedien Einricht Oertl Bez</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBedienEinrichtOertlBez() <em>Bedien Einricht Oertl Bez</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienEinrichtOertlBez()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Einricht_Oertl_Bez_TypeClass bedienEinrichtOertlBez;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Einricht_Oertl_Bez_TypeClass getBedienEinrichtOertlBez() {
		return bedienEinrichtOertlBez;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienEinrichtOertlBez(Bedien_Einricht_Oertl_Bez_TypeClass newBedienEinrichtOertlBez, NotificationChain msgs) {
		Bedien_Einricht_Oertl_Bez_TypeClass oldBedienEinrichtOertlBez = bedienEinrichtOertlBez;
		bedienEinrichtOertlBez = newBedienEinrichtOertlBez;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_OERTL_BEZ, oldBedienEinrichtOertlBez, newBedienEinrichtOertlBez);
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
	public void setBedienEinrichtOertlBez(Bedien_Einricht_Oertl_Bez_TypeClass newBedienEinrichtOertlBez) {
		if (newBedienEinrichtOertlBez != bedienEinrichtOertlBez) {
			NotificationChain msgs = null;
			if (bedienEinrichtOertlBez != null)
				msgs = ((InternalEObject)bedienEinrichtOertlBez).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_OERTL_BEZ, null, msgs);
			if (newBedienEinrichtOertlBez != null)
				msgs = ((InternalEObject)newBedienEinrichtOertlBez).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_OERTL_BEZ, null, msgs);
			msgs = basicSetBedienEinrichtOertlBez(newBedienEinrichtOertlBez, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_OERTL_BEZ, newBedienEinrichtOertlBez, newBedienEinrichtOertlBez));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_OERTL_BEZ:
				return basicSetBedienEinrichtOertlBez(null, msgs);
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
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_OERTL_BEZ:
				return getBedienEinrichtOertlBez();
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
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_OERTL_BEZ:
				setBedienEinrichtOertlBez((Bedien_Einricht_Oertl_Bez_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_OERTL_BEZ:
				setBedienEinrichtOertlBez((Bedien_Einricht_Oertl_Bez_TypeClass)null);
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
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH_BEZEICHNUNG_ATTRIBUTE_GROUP__BEDIEN_EINRICHT_OERTL_BEZ:
				return bedienEinrichtOertlBez != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroupImpl
