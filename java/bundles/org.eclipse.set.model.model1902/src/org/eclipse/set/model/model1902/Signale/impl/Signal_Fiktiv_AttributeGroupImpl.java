/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Signale.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model1902.Signale.Auto_Einstellung_TypeClass;
import org.eclipse.set.model.model1902.Signale.Fiktives_Signal_Funktion_TypeClass;
import org.eclipse.set.model.model1902.Signale.Signal_Fiktiv_AttributeGroup;
import org.eclipse.set.model.model1902.Signale.SignalePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Fiktiv Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Fiktiv_AttributeGroupImpl#getAutoEinstellung <em>Auto Einstellung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.impl.Signal_Fiktiv_AttributeGroupImpl#getFiktivesSignalFunktion <em>Fiktives Signal Funktion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_Fiktiv_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Signal_Fiktiv_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAutoEinstellung() <em>Auto Einstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoEinstellung()
	 * @generated
	 * @ordered
	 */
	protected Auto_Einstellung_TypeClass autoEinstellung;

	/**
	 * The cached value of the '{@link #getFiktivesSignalFunktion() <em>Fiktives Signal Funktion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiktivesSignalFunktion()
	 * @generated
	 * @ordered
	 */
	protected EList<Fiktives_Signal_Funktion_TypeClass> fiktivesSignalFunktion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_Fiktiv_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_FIKTIV_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Auto_Einstellung_TypeClass getAutoEinstellung() {
		return autoEinstellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutoEinstellung(Auto_Einstellung_TypeClass newAutoEinstellung, NotificationChain msgs) {
		Auto_Einstellung_TypeClass oldAutoEinstellung = autoEinstellung;
		autoEinstellung = newAutoEinstellung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG, oldAutoEinstellung, newAutoEinstellung);
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
	public void setAutoEinstellung(Auto_Einstellung_TypeClass newAutoEinstellung) {
		if (newAutoEinstellung != autoEinstellung) {
			NotificationChain msgs = null;
			if (autoEinstellung != null)
				msgs = ((InternalEObject)autoEinstellung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG, null, msgs);
			if (newAutoEinstellung != null)
				msgs = ((InternalEObject)newAutoEinstellung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG, null, msgs);
			msgs = basicSetAutoEinstellung(newAutoEinstellung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG, newAutoEinstellung, newAutoEinstellung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fiktives_Signal_Funktion_TypeClass> getFiktivesSignalFunktion() {
		if (fiktivesSignalFunktion == null) {
			fiktivesSignalFunktion = new EObjectContainmentEList<Fiktives_Signal_Funktion_TypeClass>(Fiktives_Signal_Funktion_TypeClass.class, this, SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP__FIKTIVES_SIGNAL_FUNKTION);
		}
		return fiktivesSignalFunktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG:
				return basicSetAutoEinstellung(null, msgs);
			case SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP__FIKTIVES_SIGNAL_FUNKTION:
				return ((InternalEList<?>)getFiktivesSignalFunktion()).basicRemove(otherEnd, msgs);
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
			case SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG:
				return getAutoEinstellung();
			case SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP__FIKTIVES_SIGNAL_FUNKTION:
				return getFiktivesSignalFunktion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG:
				setAutoEinstellung((Auto_Einstellung_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP__FIKTIVES_SIGNAL_FUNKTION:
				getFiktivesSignalFunktion().clear();
				getFiktivesSignalFunktion().addAll((Collection<? extends Fiktives_Signal_Funktion_TypeClass>)newValue);
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
			case SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG:
				setAutoEinstellung((Auto_Einstellung_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP__FIKTIVES_SIGNAL_FUNKTION:
				getFiktivesSignalFunktion().clear();
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
			case SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP__AUTO_EINSTELLUNG:
				return autoEinstellung != null;
			case SignalePackage.SIGNAL_FIKTIV_ATTRIBUTE_GROUP__FIKTIVES_SIGNAL_FUNKTION:
				return fiktivesSignalFunktion != null && !fiktivesSignalFunktion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Signal_Fiktiv_AttributeGroupImpl
