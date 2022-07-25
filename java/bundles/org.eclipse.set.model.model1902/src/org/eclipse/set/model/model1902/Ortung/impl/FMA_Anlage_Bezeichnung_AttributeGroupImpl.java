/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ortung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Ortung.Bezeichnung_Kennbuchstabe_TypeClass;
import org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Ortung.OrtungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMA Anlage Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ortung.impl.FMA_Anlage_Bezeichnung_AttributeGroupImpl#getBezeichnungKennbuchstabe <em>Bezeichnung Kennbuchstabe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMA_Anlage_Bezeichnung_AttributeGroupImpl extends MinimalEObjectImpl.Container implements FMA_Anlage_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungKennbuchstabe() <em>Bezeichnung Kennbuchstabe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungKennbuchstabe()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Kennbuchstabe_TypeClass bezeichnungKennbuchstabe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMA_Anlage_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrtungPackage.Literals.FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Kennbuchstabe_TypeClass getBezeichnungKennbuchstabe() {
		return bezeichnungKennbuchstabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungKennbuchstabe(Bezeichnung_Kennbuchstabe_TypeClass newBezeichnungKennbuchstabe, NotificationChain msgs) {
		Bezeichnung_Kennbuchstabe_TypeClass oldBezeichnungKennbuchstabe = bezeichnungKennbuchstabe;
		bezeichnungKennbuchstabe = newBezeichnungKennbuchstabe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KENNBUCHSTABE, oldBezeichnungKennbuchstabe, newBezeichnungKennbuchstabe);
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
	public void setBezeichnungKennbuchstabe(Bezeichnung_Kennbuchstabe_TypeClass newBezeichnungKennbuchstabe) {
		if (newBezeichnungKennbuchstabe != bezeichnungKennbuchstabe) {
			NotificationChain msgs = null;
			if (bezeichnungKennbuchstabe != null)
				msgs = ((InternalEObject)bezeichnungKennbuchstabe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KENNBUCHSTABE, null, msgs);
			if (newBezeichnungKennbuchstabe != null)
				msgs = ((InternalEObject)newBezeichnungKennbuchstabe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KENNBUCHSTABE, null, msgs);
			msgs = basicSetBezeichnungKennbuchstabe(newBezeichnungKennbuchstabe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KENNBUCHSTABE, newBezeichnungKennbuchstabe, newBezeichnungKennbuchstabe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrtungPackage.FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KENNBUCHSTABE:
				return basicSetBezeichnungKennbuchstabe(null, msgs);
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
			case OrtungPackage.FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KENNBUCHSTABE:
				return getBezeichnungKennbuchstabe();
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
			case OrtungPackage.FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KENNBUCHSTABE:
				setBezeichnungKennbuchstabe((Bezeichnung_Kennbuchstabe_TypeClass)newValue);
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
			case OrtungPackage.FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KENNBUCHSTABE:
				setBezeichnungKennbuchstabe((Bezeichnung_Kennbuchstabe_TypeClass)null);
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
			case OrtungPackage.FMA_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KENNBUCHSTABE:
				return bezeichnungKennbuchstabe != null;
		}
		return super.eIsSet(featureID);
	}

} //FMA_Anlage_Bezeichnung_AttributeGroupImpl
