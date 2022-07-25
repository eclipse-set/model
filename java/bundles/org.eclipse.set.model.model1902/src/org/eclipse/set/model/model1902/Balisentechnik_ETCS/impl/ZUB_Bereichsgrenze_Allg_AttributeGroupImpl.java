/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

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

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.System_Vor_Grenze_Besonders_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.System_Vor_Grenze_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Allg_AttributeGroup;

import org.eclipse.set.model.model1902.Verweise.ID_Element_Grenze_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_RBC_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB Bereichsgrenze Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Allg_AttributeGroupImpl#getIDElementGrenze <em>ID Element Grenze</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Allg_AttributeGroupImpl#getIDRBCVorGrenze <em>IDRBC Vor Grenze</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Allg_AttributeGroupImpl#getSystemVorGrenze <em>System Vor Grenze</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Allg_AttributeGroupImpl#getSystemVorGrenzeBesonders <em>System Vor Grenze Besonders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_Bereichsgrenze_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZUB_Bereichsgrenze_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDElementGrenze() <em>ID Element Grenze</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDElementGrenze()
	 * @generated
	 * @ordered
	 */
	protected ID_Element_Grenze_TypeClass iDElementGrenze;

	/**
	 * The cached value of the '{@link #getIDRBCVorGrenze() <em>IDRBC Vor Grenze</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRBCVorGrenze()
	 * @generated
	 * @ordered
	 */
	protected ID_RBC_TypeClass iDRBCVorGrenze;

	/**
	 * The cached value of the '{@link #getSystemVorGrenze() <em>System Vor Grenze</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemVorGrenze()
	 * @generated
	 * @ordered
	 */
	protected EList<System_Vor_Grenze_TypeClass> systemVorGrenze;

	/**
	 * The cached value of the '{@link #getSystemVorGrenzeBesonders() <em>System Vor Grenze Besonders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemVorGrenzeBesonders()
	 * @generated
	 * @ordered
	 */
	protected EList<System_Vor_Grenze_Besonders_TypeClass> systemVorGrenzeBesonders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZUB_Bereichsgrenze_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Element_Grenze_TypeClass getIDElementGrenze() {
		return iDElementGrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDElementGrenze(ID_Element_Grenze_TypeClass newIDElementGrenze, NotificationChain msgs) {
		ID_Element_Grenze_TypeClass oldIDElementGrenze = iDElementGrenze;
		iDElementGrenze = newIDElementGrenze;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__ID_ELEMENT_GRENZE, oldIDElementGrenze, newIDElementGrenze);
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
	public void setIDElementGrenze(ID_Element_Grenze_TypeClass newIDElementGrenze) {
		if (newIDElementGrenze != iDElementGrenze) {
			NotificationChain msgs = null;
			if (iDElementGrenze != null)
				msgs = ((InternalEObject)iDElementGrenze).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__ID_ELEMENT_GRENZE, null, msgs);
			if (newIDElementGrenze != null)
				msgs = ((InternalEObject)newIDElementGrenze).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__ID_ELEMENT_GRENZE, null, msgs);
			msgs = basicSetIDElementGrenze(newIDElementGrenze, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__ID_ELEMENT_GRENZE, newIDElementGrenze, newIDElementGrenze));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_RBC_TypeClass getIDRBCVorGrenze() {
		return iDRBCVorGrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDRBCVorGrenze(ID_RBC_TypeClass newIDRBCVorGrenze, NotificationChain msgs) {
		ID_RBC_TypeClass oldIDRBCVorGrenze = iDRBCVorGrenze;
		iDRBCVorGrenze = newIDRBCVorGrenze;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__IDRBC_VOR_GRENZE, oldIDRBCVorGrenze, newIDRBCVorGrenze);
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
	public void setIDRBCVorGrenze(ID_RBC_TypeClass newIDRBCVorGrenze) {
		if (newIDRBCVorGrenze != iDRBCVorGrenze) {
			NotificationChain msgs = null;
			if (iDRBCVorGrenze != null)
				msgs = ((InternalEObject)iDRBCVorGrenze).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__IDRBC_VOR_GRENZE, null, msgs);
			if (newIDRBCVorGrenze != null)
				msgs = ((InternalEObject)newIDRBCVorGrenze).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__IDRBC_VOR_GRENZE, null, msgs);
			msgs = basicSetIDRBCVorGrenze(newIDRBCVorGrenze, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__IDRBC_VOR_GRENZE, newIDRBCVorGrenze, newIDRBCVorGrenze));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<System_Vor_Grenze_TypeClass> getSystemVorGrenze() {
		if (systemVorGrenze == null) {
			systemVorGrenze = new EObjectContainmentEList<System_Vor_Grenze_TypeClass>(System_Vor_Grenze_TypeClass.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE);
		}
		return systemVorGrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<System_Vor_Grenze_Besonders_TypeClass> getSystemVorGrenzeBesonders() {
		if (systemVorGrenzeBesonders == null) {
			systemVorGrenzeBesonders = new EObjectContainmentEList<System_Vor_Grenze_Besonders_TypeClass>(System_Vor_Grenze_Besonders_TypeClass.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE_BESONDERS);
		}
		return systemVorGrenzeBesonders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__ID_ELEMENT_GRENZE:
				return basicSetIDElementGrenze(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__IDRBC_VOR_GRENZE:
				return basicSetIDRBCVorGrenze(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE:
				return ((InternalEList<?>)getSystemVorGrenze()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE_BESONDERS:
				return ((InternalEList<?>)getSystemVorGrenzeBesonders()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__ID_ELEMENT_GRENZE:
				return getIDElementGrenze();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__IDRBC_VOR_GRENZE:
				return getIDRBCVorGrenze();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE:
				return getSystemVorGrenze();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE_BESONDERS:
				return getSystemVorGrenzeBesonders();
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__ID_ELEMENT_GRENZE:
				setIDElementGrenze((ID_Element_Grenze_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__IDRBC_VOR_GRENZE:
				setIDRBCVorGrenze((ID_RBC_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE:
				getSystemVorGrenze().clear();
				getSystemVorGrenze().addAll((Collection<? extends System_Vor_Grenze_TypeClass>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE_BESONDERS:
				getSystemVorGrenzeBesonders().clear();
				getSystemVorGrenzeBesonders().addAll((Collection<? extends System_Vor_Grenze_Besonders_TypeClass>)newValue);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__ID_ELEMENT_GRENZE:
				setIDElementGrenze((ID_Element_Grenze_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__IDRBC_VOR_GRENZE:
				setIDRBCVorGrenze((ID_RBC_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE:
				getSystemVorGrenze().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE_BESONDERS:
				getSystemVorGrenzeBesonders().clear();
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__ID_ELEMENT_GRENZE:
				return iDElementGrenze != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__IDRBC_VOR_GRENZE:
				return iDRBCVorGrenze != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE:
				return systemVorGrenze != null && !systemVorGrenze.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE_BESONDERS:
				return systemVorGrenzeBesonders != null && !systemVorGrenzeBesonders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ZUB_Bereichsgrenze_Allg_AttributeGroupImpl
