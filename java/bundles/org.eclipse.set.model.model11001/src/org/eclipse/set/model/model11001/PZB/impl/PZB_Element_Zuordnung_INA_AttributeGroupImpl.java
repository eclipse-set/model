/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.PZB.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model11001.PZB.PZBPackage;
import org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_INA_AttributeGroup;

import org.eclipse.set.model.model11001.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Bahnsteig_Kante_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PZB Element Zuordnung INA Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Element_Zuordnung_INA_AttributeGroupImpl#getIDAnhangINA <em>ID Anhang INA</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Element_Zuordnung_INA_AttributeGroupImpl#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PZB_Element_Zuordnung_INA_AttributeGroupImpl extends EObjectImpl implements PZB_Element_Zuordnung_INA_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDAnhangINA() <em>ID Anhang INA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangINA()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Anhang_TypeClass> iDAnhangINA;

	/**
	 * The cached value of the '{@link #getIDBahnsteigKante() <em>ID Bahnsteig Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBahnsteigKante()
	 * @generated
	 * @ordered
	 */
	protected ID_Bahnsteig_Kante_TypeClass iDBahnsteigKante;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Element_Zuordnung_INA_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Anhang_TypeClass> getIDAnhangINA() {
		if (iDAnhangINA == null) {
			iDAnhangINA = new EObjectContainmentEList<ID_Anhang_TypeClass>(ID_Anhang_TypeClass.class, this, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA);
		}
		return iDAnhangINA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Bahnsteig_Kante_TypeClass getIDBahnsteigKante() {
		return iDBahnsteigKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDBahnsteigKante(ID_Bahnsteig_Kante_TypeClass newIDBahnsteigKante, NotificationChain msgs) {
		ID_Bahnsteig_Kante_TypeClass oldIDBahnsteigKante = iDBahnsteigKante;
		iDBahnsteigKante = newIDBahnsteigKante;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE, oldIDBahnsteigKante, newIDBahnsteigKante);
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
	public void setIDBahnsteigKante(ID_Bahnsteig_Kante_TypeClass newIDBahnsteigKante) {
		if (newIDBahnsteigKante != iDBahnsteigKante) {
			NotificationChain msgs = null;
			if (iDBahnsteigKante != null)
				msgs = ((InternalEObject)iDBahnsteigKante).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE, null, msgs);
			if (newIDBahnsteigKante != null)
				msgs = ((InternalEObject)newIDBahnsteigKante).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE, null, msgs);
			msgs = basicSetIDBahnsteigKante(newIDBahnsteigKante, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE, newIDBahnsteigKante, newIDBahnsteigKante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA:
				return ((InternalEList<?>)getIDAnhangINA()).basicRemove(otherEnd, msgs);
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE:
				return basicSetIDBahnsteigKante(null, msgs);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA:
				return getIDAnhangINA();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE:
				return getIDBahnsteigKante();
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA:
				getIDAnhangINA().clear();
				getIDAnhangINA().addAll((Collection<? extends ID_Anhang_TypeClass>)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE:
				setIDBahnsteigKante((ID_Bahnsteig_Kante_TypeClass)newValue);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA:
				getIDAnhangINA().clear();
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE:
				setIDBahnsteigKante((ID_Bahnsteig_Kante_TypeClass)null);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA:
				return iDAnhangINA != null && !iDAnhangINA.isEmpty();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE:
				return iDBahnsteigKante != null;
		}
		return super.eIsSet(featureID);
	}

} //PZB_Element_Zuordnung_INA_AttributeGroupImpl
