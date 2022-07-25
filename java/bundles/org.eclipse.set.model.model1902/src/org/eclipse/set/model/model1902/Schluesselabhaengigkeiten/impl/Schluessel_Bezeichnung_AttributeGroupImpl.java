/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Bezeichnung_Schluessel_TypeClass;
import org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schluessel Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.impl.Schluessel_Bezeichnung_AttributeGroupImpl#getBezeichnungSchluessel <em>Bezeichnung Schluessel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Schluessel_Bezeichnung_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Schluessel_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungSchluessel() <em>Bezeichnung Schluessel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungSchluessel()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Schluessel_TypeClass bezeichnungSchluessel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schluessel_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchluesselabhaengigkeitenPackage.Literals.SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Schluessel_TypeClass getBezeichnungSchluessel() {
		return bezeichnungSchluessel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungSchluessel(Bezeichnung_Schluessel_TypeClass newBezeichnungSchluessel, NotificationChain msgs) {
		Bezeichnung_Schluessel_TypeClass oldBezeichnungSchluessel = bezeichnungSchluessel;
		bezeichnungSchluessel = newBezeichnungSchluessel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLUESSEL, oldBezeichnungSchluessel, newBezeichnungSchluessel);
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
	public void setBezeichnungSchluessel(Bezeichnung_Schluessel_TypeClass newBezeichnungSchluessel) {
		if (newBezeichnungSchluessel != bezeichnungSchluessel) {
			NotificationChain msgs = null;
			if (bezeichnungSchluessel != null)
				msgs = ((InternalEObject)bezeichnungSchluessel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLUESSEL, null, msgs);
			if (newBezeichnungSchluessel != null)
				msgs = ((InternalEObject)newBezeichnungSchluessel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLUESSEL, null, msgs);
			msgs = basicSetBezeichnungSchluessel(newBezeichnungSchluessel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLUESSEL, newBezeichnungSchluessel, newBezeichnungSchluessel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLUESSEL:
				return basicSetBezeichnungSchluessel(null, msgs);
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
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLUESSEL:
				return getBezeichnungSchluessel();
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
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLUESSEL:
				setBezeichnungSchluessel((Bezeichnung_Schluessel_TypeClass)newValue);
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
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLUESSEL:
				setBezeichnungSchluessel((Bezeichnung_Schluessel_TypeClass)null);
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
			case SchluesselabhaengigkeitenPackage.SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLUESSEL:
				return bezeichnungSchluessel != null;
		}
		return super.eIsSet(featureID);
	}

} //Schluessel_Bezeichnung_AttributeGroupImpl
