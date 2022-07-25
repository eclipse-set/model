/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Nahbedienbereich.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Nahbedienbereich.NB_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Nahbedienbereich.NB_Art_TypeClass;
import org.eclipse.set.model.model1902.Nahbedienbereich.NB_Bezeichnung_TypeClass;
import org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.impl.NB_Allg_AttributeGroupImpl#getNBArt <em>NB Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.impl.NB_Allg_AttributeGroupImpl#getNBBezeichnung <em>NB Bezeichnung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NB_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements NB_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getNBArt() <em>NB Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBArt()
	 * @generated
	 * @ordered
	 */
	protected NB_Art_TypeClass nBArt;

	/**
	 * The cached value of the '{@link #getNBBezeichnung() <em>NB Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected NB_Bezeichnung_TypeClass nBBezeichnung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NahbedienbereichPackage.Literals.NB_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Art_TypeClass getNBArt() {
		return nBArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNBArt(NB_Art_TypeClass newNBArt, NotificationChain msgs) {
		NB_Art_TypeClass oldNBArt = nBArt;
		nBArt = newNBArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_ART, oldNBArt, newNBArt);
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
	public void setNBArt(NB_Art_TypeClass newNBArt) {
		if (newNBArt != nBArt) {
			NotificationChain msgs = null;
			if (nBArt != null)
				msgs = ((InternalEObject)nBArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_ART, null, msgs);
			if (newNBArt != null)
				msgs = ((InternalEObject)newNBArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_ART, null, msgs);
			msgs = basicSetNBArt(newNBArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_ART, newNBArt, newNBArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Bezeichnung_TypeClass getNBBezeichnung() {
		return nBBezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNBBezeichnung(NB_Bezeichnung_TypeClass newNBBezeichnung, NotificationChain msgs) {
		NB_Bezeichnung_TypeClass oldNBBezeichnung = nBBezeichnung;
		nBBezeichnung = newNBBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_BEZEICHNUNG, oldNBBezeichnung, newNBBezeichnung);
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
	public void setNBBezeichnung(NB_Bezeichnung_TypeClass newNBBezeichnung) {
		if (newNBBezeichnung != nBBezeichnung) {
			NotificationChain msgs = null;
			if (nBBezeichnung != null)
				msgs = ((InternalEObject)nBBezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_BEZEICHNUNG, null, msgs);
			if (newNBBezeichnung != null)
				msgs = ((InternalEObject)newNBBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_BEZEICHNUNG, null, msgs);
			msgs = basicSetNBBezeichnung(newNBBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_BEZEICHNUNG, newNBBezeichnung, newNBBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_ART:
				return basicSetNBArt(null, msgs);
			case NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_BEZEICHNUNG:
				return basicSetNBBezeichnung(null, msgs);
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
			case NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_ART:
				return getNBArt();
			case NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_BEZEICHNUNG:
				return getNBBezeichnung();
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
			case NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_ART:
				setNBArt((NB_Art_TypeClass)newValue);
				return;
			case NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_BEZEICHNUNG:
				setNBBezeichnung((NB_Bezeichnung_TypeClass)newValue);
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
			case NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_ART:
				setNBArt((NB_Art_TypeClass)null);
				return;
			case NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_BEZEICHNUNG:
				setNBBezeichnung((NB_Bezeichnung_TypeClass)null);
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
			case NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_ART:
				return nBArt != null;
			case NahbedienbereichPackage.NB_ALLG_ATTRIBUTE_GROUP__NB_BEZEICHNUNG:
				return nBBezeichnung != null;
		}
		return super.eIsSet(featureID);
	}

} //NB_Allg_AttributeGroupImpl
