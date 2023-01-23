/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Medien_und_Trassen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Medien_und_Trassen.Bezeichnung_Kabel_Verteilpunkt_TypeClass;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Medien_und_TrassenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kabel Verteilpunkt Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Kabel_Verteilpunkt_Bezeichnung_AttributeGroupImpl#getBezeichnungKabelVerteilpunkt <em>Bezeichnung Kabel Verteilpunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Kabel_Verteilpunkt_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements Kabel_Verteilpunkt_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungKabelVerteilpunkt() <em>Bezeichnung Kabel Verteilpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungKabelVerteilpunkt()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Kabel_Verteilpunkt_TypeClass bezeichnungKabelVerteilpunkt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Kabel_Verteilpunkt_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Medien_und_TrassenPackage.Literals.KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Kabel_Verteilpunkt_TypeClass getBezeichnungKabelVerteilpunkt() {
		return bezeichnungKabelVerteilpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungKabelVerteilpunkt(Bezeichnung_Kabel_Verteilpunkt_TypeClass newBezeichnungKabelVerteilpunkt, NotificationChain msgs) {
		Bezeichnung_Kabel_Verteilpunkt_TypeClass oldBezeichnungKabelVerteilpunkt = bezeichnungKabelVerteilpunkt;
		bezeichnungKabelVerteilpunkt = newBezeichnungKabelVerteilpunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL_VERTEILPUNKT, oldBezeichnungKabelVerteilpunkt, newBezeichnungKabelVerteilpunkt);
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
	public void setBezeichnungKabelVerteilpunkt(Bezeichnung_Kabel_Verteilpunkt_TypeClass newBezeichnungKabelVerteilpunkt) {
		if (newBezeichnungKabelVerteilpunkt != bezeichnungKabelVerteilpunkt) {
			NotificationChain msgs = null;
			if (bezeichnungKabelVerteilpunkt != null)
				msgs = ((InternalEObject)bezeichnungKabelVerteilpunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL_VERTEILPUNKT, null, msgs);
			if (newBezeichnungKabelVerteilpunkt != null)
				msgs = ((InternalEObject)newBezeichnungKabelVerteilpunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL_VERTEILPUNKT, null, msgs);
			msgs = basicSetBezeichnungKabelVerteilpunkt(newBezeichnungKabelVerteilpunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL_VERTEILPUNKT, newBezeichnungKabelVerteilpunkt, newBezeichnungKabelVerteilpunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL_VERTEILPUNKT:
				return basicSetBezeichnungKabelVerteilpunkt(null, msgs);
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
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL_VERTEILPUNKT:
				return getBezeichnungKabelVerteilpunkt();
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
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL_VERTEILPUNKT:
				setBezeichnungKabelVerteilpunkt((Bezeichnung_Kabel_Verteilpunkt_TypeClass)newValue);
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
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL_VERTEILPUNKT:
				setBezeichnungKabelVerteilpunkt((Bezeichnung_Kabel_Verteilpunkt_TypeClass)null);
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
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL_VERTEILPUNKT:
				return bezeichnungKabelVerteilpunkt != null;
		}
		return super.eIsSet(featureID);
	}

} //Kabel_Verteilpunkt_Bezeichnung_AttributeGroupImpl
