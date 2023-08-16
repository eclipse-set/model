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

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Abstand_Einmesspunkt_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Datenpunkt_Einmesspunkt_AttributeGroup;

import org.eclipse.set.model.model11001.Verweise.ID_Markanter_Punkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datenpunkt Einmesspunkt Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Datenpunkt_Einmesspunkt_AttributeGroupImpl#getAbstandEinmesspunkt <em>Abstand Einmesspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Datenpunkt_Einmesspunkt_AttributeGroupImpl#getIDEinmesspunkt <em>ID Einmesspunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Datenpunkt_Einmesspunkt_AttributeGroupImpl extends EObjectImpl implements Datenpunkt_Einmesspunkt_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAbstandEinmesspunkt() <em>Abstand Einmesspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstandEinmesspunkt()
	 * @generated
	 * @ordered
	 */
	protected Abstand_Einmesspunkt_TypeClass abstandEinmesspunkt;

	/**
	 * The cached value of the '{@link #getIDEinmesspunkt() <em>ID Einmesspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDEinmesspunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_Markanter_Punkt_TypeClass iDEinmesspunkt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Datenpunkt_Einmesspunkt_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Einmesspunkt_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Einmesspunkt_TypeClass getAbstandEinmesspunkt() {
		return abstandEinmesspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstandEinmesspunkt(Abstand_Einmesspunkt_TypeClass newAbstandEinmesspunkt, NotificationChain msgs) {
		Abstand_Einmesspunkt_TypeClass oldAbstandEinmesspunkt = abstandEinmesspunkt;
		abstandEinmesspunkt = newAbstandEinmesspunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT, oldAbstandEinmesspunkt, newAbstandEinmesspunkt);
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
	public void setAbstandEinmesspunkt(Abstand_Einmesspunkt_TypeClass newAbstandEinmesspunkt) {
		if (newAbstandEinmesspunkt != abstandEinmesspunkt) {
			NotificationChain msgs = null;
			if (abstandEinmesspunkt != null)
				msgs = ((InternalEObject)abstandEinmesspunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT, null, msgs);
			if (newAbstandEinmesspunkt != null)
				msgs = ((InternalEObject)newAbstandEinmesspunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT, null, msgs);
			msgs = basicSetAbstandEinmesspunkt(newAbstandEinmesspunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT, newAbstandEinmesspunkt, newAbstandEinmesspunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Markanter_Punkt_TypeClass getIDEinmesspunkt() {
		return iDEinmesspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDEinmesspunkt(ID_Markanter_Punkt_TypeClass newIDEinmesspunkt, NotificationChain msgs) {
		ID_Markanter_Punkt_TypeClass oldIDEinmesspunkt = iDEinmesspunkt;
		iDEinmesspunkt = newIDEinmesspunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ID_EINMESSPUNKT, oldIDEinmesspunkt, newIDEinmesspunkt);
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
	public void setIDEinmesspunkt(ID_Markanter_Punkt_TypeClass newIDEinmesspunkt) {
		if (newIDEinmesspunkt != iDEinmesspunkt) {
			NotificationChain msgs = null;
			if (iDEinmesspunkt != null)
				msgs = ((InternalEObject)iDEinmesspunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ID_EINMESSPUNKT, null, msgs);
			if (newIDEinmesspunkt != null)
				msgs = ((InternalEObject)newIDEinmesspunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ID_EINMESSPUNKT, null, msgs);
			msgs = basicSetIDEinmesspunkt(newIDEinmesspunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ID_EINMESSPUNKT, newIDEinmesspunkt, newIDEinmesspunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT:
				return basicSetAbstandEinmesspunkt(null, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ID_EINMESSPUNKT:
				return basicSetIDEinmesspunkt(null, msgs);
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
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT:
				return getAbstandEinmesspunkt();
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ID_EINMESSPUNKT:
				return getIDEinmesspunkt();
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
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT:
				setAbstandEinmesspunkt((Abstand_Einmesspunkt_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ID_EINMESSPUNKT:
				setIDEinmesspunkt((ID_Markanter_Punkt_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT:
				setAbstandEinmesspunkt((Abstand_Einmesspunkt_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ID_EINMESSPUNKT:
				setIDEinmesspunkt((ID_Markanter_Punkt_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT:
				return abstandEinmesspunkt != null;
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ID_EINMESSPUNKT:
				return iDEinmesspunkt != null;
		}
		return super.eIsSet(featureID);
	}

} //Datenpunkt_Einmesspunkt_AttributeGroupImpl
