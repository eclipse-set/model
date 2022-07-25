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

import org.eclipse.set.model.model1902.Nahbedienbereich.NB_Verhaeltnis_Besonders_TypeClass;
import org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Bezeichnung_TypeClass;
import org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage;
import org.eclipse.set.model.model1902.Nahbedienbereich.Rang_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB Zone Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.impl.NB_Zone_Allg_AttributeGroupImpl#getNBVerhaeltnisBesonders <em>NB Verhaeltnis Besonders</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.impl.NB_Zone_Allg_AttributeGroupImpl#getNBZoneBezeichnung <em>NB Zone Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.impl.NB_Zone_Allg_AttributeGroupImpl#getRang <em>Rang</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NB_Zone_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements NB_Zone_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getNBVerhaeltnisBesonders() <em>NB Verhaeltnis Besonders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBVerhaeltnisBesonders()
	 * @generated
	 * @ordered
	 */
	protected NB_Verhaeltnis_Besonders_TypeClass nBVerhaeltnisBesonders;

	/**
	 * The cached value of the '{@link #getNBZoneBezeichnung() <em>NB Zone Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBZoneBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected NB_Zone_Bezeichnung_TypeClass nBZoneBezeichnung;

	/**
	 * The cached value of the '{@link #getRang() <em>Rang</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRang()
	 * @generated
	 * @ordered
	 */
	protected Rang_TypeClass rang;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Zone_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NahbedienbereichPackage.Literals.NB_ZONE_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Verhaeltnis_Besonders_TypeClass getNBVerhaeltnisBesonders() {
		return nBVerhaeltnisBesonders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNBVerhaeltnisBesonders(NB_Verhaeltnis_Besonders_TypeClass newNBVerhaeltnisBesonders, NotificationChain msgs) {
		NB_Verhaeltnis_Besonders_TypeClass oldNBVerhaeltnisBesonders = nBVerhaeltnisBesonders;
		nBVerhaeltnisBesonders = newNBVerhaeltnisBesonders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_VERHAELTNIS_BESONDERS, oldNBVerhaeltnisBesonders, newNBVerhaeltnisBesonders);
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
	public void setNBVerhaeltnisBesonders(NB_Verhaeltnis_Besonders_TypeClass newNBVerhaeltnisBesonders) {
		if (newNBVerhaeltnisBesonders != nBVerhaeltnisBesonders) {
			NotificationChain msgs = null;
			if (nBVerhaeltnisBesonders != null)
				msgs = ((InternalEObject)nBVerhaeltnisBesonders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_VERHAELTNIS_BESONDERS, null, msgs);
			if (newNBVerhaeltnisBesonders != null)
				msgs = ((InternalEObject)newNBVerhaeltnisBesonders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_VERHAELTNIS_BESONDERS, null, msgs);
			msgs = basicSetNBVerhaeltnisBesonders(newNBVerhaeltnisBesonders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_VERHAELTNIS_BESONDERS, newNBVerhaeltnisBesonders, newNBVerhaeltnisBesonders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Zone_Bezeichnung_TypeClass getNBZoneBezeichnung() {
		return nBZoneBezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNBZoneBezeichnung(NB_Zone_Bezeichnung_TypeClass newNBZoneBezeichnung, NotificationChain msgs) {
		NB_Zone_Bezeichnung_TypeClass oldNBZoneBezeichnung = nBZoneBezeichnung;
		nBZoneBezeichnung = newNBZoneBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_ZONE_BEZEICHNUNG, oldNBZoneBezeichnung, newNBZoneBezeichnung);
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
	public void setNBZoneBezeichnung(NB_Zone_Bezeichnung_TypeClass newNBZoneBezeichnung) {
		if (newNBZoneBezeichnung != nBZoneBezeichnung) {
			NotificationChain msgs = null;
			if (nBZoneBezeichnung != null)
				msgs = ((InternalEObject)nBZoneBezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_ZONE_BEZEICHNUNG, null, msgs);
			if (newNBZoneBezeichnung != null)
				msgs = ((InternalEObject)newNBZoneBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_ZONE_BEZEICHNUNG, null, msgs);
			msgs = basicSetNBZoneBezeichnung(newNBZoneBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_ZONE_BEZEICHNUNG, newNBZoneBezeichnung, newNBZoneBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rang_TypeClass getRang() {
		return rang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRang(Rang_TypeClass newRang, NotificationChain msgs) {
		Rang_TypeClass oldRang = rang;
		rang = newRang;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__RANG, oldRang, newRang);
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
	public void setRang(Rang_TypeClass newRang) {
		if (newRang != rang) {
			NotificationChain msgs = null;
			if (rang != null)
				msgs = ((InternalEObject)rang).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__RANG, null, msgs);
			if (newRang != null)
				msgs = ((InternalEObject)newRang).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__RANG, null, msgs);
			msgs = basicSetRang(newRang, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__RANG, newRang, newRang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_VERHAELTNIS_BESONDERS:
				return basicSetNBVerhaeltnisBesonders(null, msgs);
			case NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_ZONE_BEZEICHNUNG:
				return basicSetNBZoneBezeichnung(null, msgs);
			case NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__RANG:
				return basicSetRang(null, msgs);
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
			case NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_VERHAELTNIS_BESONDERS:
				return getNBVerhaeltnisBesonders();
			case NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_ZONE_BEZEICHNUNG:
				return getNBZoneBezeichnung();
			case NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__RANG:
				return getRang();
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
			case NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_VERHAELTNIS_BESONDERS:
				setNBVerhaeltnisBesonders((NB_Verhaeltnis_Besonders_TypeClass)newValue);
				return;
			case NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_ZONE_BEZEICHNUNG:
				setNBZoneBezeichnung((NB_Zone_Bezeichnung_TypeClass)newValue);
				return;
			case NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__RANG:
				setRang((Rang_TypeClass)newValue);
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
			case NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_VERHAELTNIS_BESONDERS:
				setNBVerhaeltnisBesonders((NB_Verhaeltnis_Besonders_TypeClass)null);
				return;
			case NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_ZONE_BEZEICHNUNG:
				setNBZoneBezeichnung((NB_Zone_Bezeichnung_TypeClass)null);
				return;
			case NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__RANG:
				setRang((Rang_TypeClass)null);
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
			case NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_VERHAELTNIS_BESONDERS:
				return nBVerhaeltnisBesonders != null;
			case NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_ZONE_BEZEICHNUNG:
				return nBZoneBezeichnung != null;
			case NahbedienbereichPackage.NB_ZONE_ALLG_ATTRIBUTE_GROUP__RANG:
				return rang != null;
		}
		return super.eIsSet(featureID);
	}

} //NB_Zone_Allg_AttributeGroupImpl
