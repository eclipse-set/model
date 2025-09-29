/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Nahbedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Nahbedienung.Freie_Stellbarkeit_TypeClass;
import org.eclipse.set.model.planpro.Nahbedienung.NB_Rueckgabevoraussetzung_TypeClass;
import org.eclipse.set.model.planpro.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage;
import org.eclipse.set.model.planpro.Nahbedienung.W_Gsp_Lage_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB Zone Element Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Element_Allg_AttributeGroupImpl#getFreieStellbarkeit <em>Freie Stellbarkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Element_Allg_AttributeGroupImpl#getNBRueckgabevoraussetzung <em>NB Rueckgabevoraussetzung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Zone_Element_Allg_AttributeGroupImpl#getWGspLage <em>WGsp Lage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NB_Zone_Element_Allg_AttributeGroupImpl extends EObjectImpl implements NB_Zone_Element_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFreieStellbarkeit() <em>Freie Stellbarkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreieStellbarkeit()
	 * @generated
	 * @ordered
	 */
	protected Freie_Stellbarkeit_TypeClass freieStellbarkeit;

	/**
	 * The cached value of the '{@link #getNBRueckgabevoraussetzung() <em>NB Rueckgabevoraussetzung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBRueckgabevoraussetzung()
	 * @generated
	 * @ordered
	 */
	protected NB_Rueckgabevoraussetzung_TypeClass nBRueckgabevoraussetzung;

	/**
	 * The cached value of the '{@link #getWGspLage() <em>WGsp Lage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWGspLage()
	 * @generated
	 * @ordered
	 */
	protected W_Gsp_Lage_TypeClass wGspLage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Zone_Element_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NahbedienungPackage.Literals.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Freie_Stellbarkeit_TypeClass getFreieStellbarkeit() {
		return freieStellbarkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFreieStellbarkeit(Freie_Stellbarkeit_TypeClass newFreieStellbarkeit, NotificationChain msgs) {
		Freie_Stellbarkeit_TypeClass oldFreieStellbarkeit = freieStellbarkeit;
		freieStellbarkeit = newFreieStellbarkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__FREIE_STELLBARKEIT, oldFreieStellbarkeit, newFreieStellbarkeit);
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
	public void setFreieStellbarkeit(Freie_Stellbarkeit_TypeClass newFreieStellbarkeit) {
		if (newFreieStellbarkeit != freieStellbarkeit) {
			NotificationChain msgs = null;
			if (freieStellbarkeit != null)
				msgs = ((InternalEObject)freieStellbarkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__FREIE_STELLBARKEIT, null, msgs);
			if (newFreieStellbarkeit != null)
				msgs = ((InternalEObject)newFreieStellbarkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__FREIE_STELLBARKEIT, null, msgs);
			msgs = basicSetFreieStellbarkeit(newFreieStellbarkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__FREIE_STELLBARKEIT, newFreieStellbarkeit, newFreieStellbarkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Rueckgabevoraussetzung_TypeClass getNBRueckgabevoraussetzung() {
		return nBRueckgabevoraussetzung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNBRueckgabevoraussetzung(NB_Rueckgabevoraussetzung_TypeClass newNBRueckgabevoraussetzung, NotificationChain msgs) {
		NB_Rueckgabevoraussetzung_TypeClass oldNBRueckgabevoraussetzung = nBRueckgabevoraussetzung;
		nBRueckgabevoraussetzung = newNBRueckgabevoraussetzung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__NB_RUECKGABEVORAUSSETZUNG, oldNBRueckgabevoraussetzung, newNBRueckgabevoraussetzung);
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
	public void setNBRueckgabevoraussetzung(NB_Rueckgabevoraussetzung_TypeClass newNBRueckgabevoraussetzung) {
		if (newNBRueckgabevoraussetzung != nBRueckgabevoraussetzung) {
			NotificationChain msgs = null;
			if (nBRueckgabevoraussetzung != null)
				msgs = ((InternalEObject)nBRueckgabevoraussetzung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__NB_RUECKGABEVORAUSSETZUNG, null, msgs);
			if (newNBRueckgabevoraussetzung != null)
				msgs = ((InternalEObject)newNBRueckgabevoraussetzung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__NB_RUECKGABEVORAUSSETZUNG, null, msgs);
			msgs = basicSetNBRueckgabevoraussetzung(newNBRueckgabevoraussetzung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__NB_RUECKGABEVORAUSSETZUNG, newNBRueckgabevoraussetzung, newNBRueckgabevoraussetzung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Gsp_Lage_TypeClass getWGspLage() {
		return wGspLage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWGspLage(W_Gsp_Lage_TypeClass newWGspLage, NotificationChain msgs) {
		W_Gsp_Lage_TypeClass oldWGspLage = wGspLage;
		wGspLage = newWGspLage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__WGSP_LAGE, oldWGspLage, newWGspLage);
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
	public void setWGspLage(W_Gsp_Lage_TypeClass newWGspLage) {
		if (newWGspLage != wGspLage) {
			NotificationChain msgs = null;
			if (wGspLage != null)
				msgs = ((InternalEObject)wGspLage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__WGSP_LAGE, null, msgs);
			if (newWGspLage != null)
				msgs = ((InternalEObject)newWGspLage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__WGSP_LAGE, null, msgs);
			msgs = basicSetWGspLage(newWGspLage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__WGSP_LAGE, newWGspLage, newWGspLage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__FREIE_STELLBARKEIT:
				return basicSetFreieStellbarkeit(null, msgs);
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__NB_RUECKGABEVORAUSSETZUNG:
				return basicSetNBRueckgabevoraussetzung(null, msgs);
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__WGSP_LAGE:
				return basicSetWGspLage(null, msgs);
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
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__FREIE_STELLBARKEIT:
				return getFreieStellbarkeit();
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__NB_RUECKGABEVORAUSSETZUNG:
				return getNBRueckgabevoraussetzung();
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__WGSP_LAGE:
				return getWGspLage();
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
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__FREIE_STELLBARKEIT:
				setFreieStellbarkeit((Freie_Stellbarkeit_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__NB_RUECKGABEVORAUSSETZUNG:
				setNBRueckgabevoraussetzung((NB_Rueckgabevoraussetzung_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__WGSP_LAGE:
				setWGspLage((W_Gsp_Lage_TypeClass)newValue);
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
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__FREIE_STELLBARKEIT:
				setFreieStellbarkeit((Freie_Stellbarkeit_TypeClass)null);
				return;
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__NB_RUECKGABEVORAUSSETZUNG:
				setNBRueckgabevoraussetzung((NB_Rueckgabevoraussetzung_TypeClass)null);
				return;
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__WGSP_LAGE:
				setWGspLage((W_Gsp_Lage_TypeClass)null);
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
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__FREIE_STELLBARKEIT:
				return freieStellbarkeit != null;
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__NB_RUECKGABEVORAUSSETZUNG:
				return nBRueckgabevoraussetzung != null;
			case NahbedienungPackage.NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__WGSP_LAGE:
				return wGspLage != null;
		}
		return super.eIsSet(featureID);
	}

} //NB_Zone_Element_Allg_AttributeGroupImpl
