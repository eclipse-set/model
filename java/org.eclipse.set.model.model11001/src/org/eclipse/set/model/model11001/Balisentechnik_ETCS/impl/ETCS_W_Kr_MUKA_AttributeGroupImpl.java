/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_W_Kr_MUKA_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Gruppen_ID_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Untergruppen_ID_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETCS WKr MUKA Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.ETCS_W_Kr_MUKA_AttributeGroupImpl#getGruppenID <em>Gruppen ID</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.ETCS_W_Kr_MUKA_AttributeGroupImpl#getUntergruppenID <em>Untergruppen ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETCS_W_Kr_MUKA_AttributeGroupImpl extends EObjectImpl implements ETCS_W_Kr_MUKA_AttributeGroup {
	/**
	 * The cached value of the '{@link #getGruppenID() <em>Gruppen ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGruppenID()
	 * @generated
	 * @ordered
	 */
	protected Gruppen_ID_TypeClass gruppenID;

	/**
	 * The cached value of the '{@link #getUntergruppenID() <em>Untergruppen ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntergruppenID()
	 * @generated
	 * @ordered
	 */
	protected Untergruppen_ID_TypeClass untergruppenID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETCS_W_Kr_MUKA_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getETCS_W_Kr_MUKA_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gruppen_ID_TypeClass getGruppenID() {
		return gruppenID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGruppenID(Gruppen_ID_TypeClass newGruppenID, NotificationChain msgs) {
		Gruppen_ID_TypeClass oldGruppenID = gruppenID;
		gruppenID = newGruppenID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__GRUPPEN_ID, oldGruppenID, newGruppenID);
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
	public void setGruppenID(Gruppen_ID_TypeClass newGruppenID) {
		if (newGruppenID != gruppenID) {
			NotificationChain msgs = null;
			if (gruppenID != null)
				msgs = ((InternalEObject)gruppenID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__GRUPPEN_ID, null, msgs);
			if (newGruppenID != null)
				msgs = ((InternalEObject)newGruppenID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__GRUPPEN_ID, null, msgs);
			msgs = basicSetGruppenID(newGruppenID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__GRUPPEN_ID, newGruppenID, newGruppenID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Untergruppen_ID_TypeClass getUntergruppenID() {
		return untergruppenID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUntergruppenID(Untergruppen_ID_TypeClass newUntergruppenID, NotificationChain msgs) {
		Untergruppen_ID_TypeClass oldUntergruppenID = untergruppenID;
		untergruppenID = newUntergruppenID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID, oldUntergruppenID, newUntergruppenID);
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
	public void setUntergruppenID(Untergruppen_ID_TypeClass newUntergruppenID) {
		if (newUntergruppenID != untergruppenID) {
			NotificationChain msgs = null;
			if (untergruppenID != null)
				msgs = ((InternalEObject)untergruppenID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID, null, msgs);
			if (newUntergruppenID != null)
				msgs = ((InternalEObject)newUntergruppenID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID, null, msgs);
			msgs = basicSetUntergruppenID(newUntergruppenID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID, newUntergruppenID, newUntergruppenID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__GRUPPEN_ID:
				return basicSetGruppenID(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID:
				return basicSetUntergruppenID(null, msgs);
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
			case Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__GRUPPEN_ID:
				return getGruppenID();
			case Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID:
				return getUntergruppenID();
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
			case Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__GRUPPEN_ID:
				setGruppenID((Gruppen_ID_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID:
				setUntergruppenID((Untergruppen_ID_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__GRUPPEN_ID:
				setGruppenID((Gruppen_ID_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID:
				setUntergruppenID((Untergruppen_ID_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__GRUPPEN_ID:
				return gruppenID != null;
			case Balisentechnik_ETCSPackage.ETCS_WKR_MUKA_ATTRIBUTE_GROUP__UNTERGRUPPEN_ID:
				return untergruppenID != null;
		}
		return super.eIsSet(featureID);
	}

} //ETCS_W_Kr_MUKA_AttributeGroupImpl
