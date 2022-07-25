/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PZB.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.PZB.PZBPackage;
import org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung_INA_AttributeGroup;

import org.eclipse.set.model.model1902.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Bahnsteig_Kante_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Markanter_Punkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PZB Element Zuordnung INA Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.impl.PZB_Element_Zuordnung_INA_AttributeGroupImpl#getIDAnhangINA <em>ID Anhang INA</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.impl.PZB_Element_Zuordnung_INA_AttributeGroupImpl#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.impl.PZB_Element_Zuordnung_INA_AttributeGroupImpl#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PZB_Element_Zuordnung_INA_AttributeGroupImpl extends MinimalEObjectImpl.Container implements PZB_Element_Zuordnung_INA_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDAnhangINA() <em>ID Anhang INA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangINA()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangINA;

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
	 * The cached value of the '{@link #getIDMarkanterPunkt() <em>ID Markanter Punkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDMarkanterPunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_Markanter_Punkt_TypeClass iDMarkanterPunkt;

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
	public ID_Anhang_TypeClass getIDAnhangINA() {
		return iDAnhangINA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangINA(ID_Anhang_TypeClass newIDAnhangINA, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangINA = iDAnhangINA;
		iDAnhangINA = newIDAnhangINA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA, oldIDAnhangINA, newIDAnhangINA);
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
	public void setIDAnhangINA(ID_Anhang_TypeClass newIDAnhangINA) {
		if (newIDAnhangINA != iDAnhangINA) {
			NotificationChain msgs = null;
			if (iDAnhangINA != null)
				msgs = ((InternalEObject)iDAnhangINA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA, null, msgs);
			if (newIDAnhangINA != null)
				msgs = ((InternalEObject)newIDAnhangINA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA, null, msgs);
			msgs = basicSetIDAnhangINA(newIDAnhangINA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA, newIDAnhangINA, newIDAnhangINA));
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
	public ID_Markanter_Punkt_TypeClass getIDMarkanterPunkt() {
		return iDMarkanterPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDMarkanterPunkt(ID_Markanter_Punkt_TypeClass newIDMarkanterPunkt, NotificationChain msgs) {
		ID_Markanter_Punkt_TypeClass oldIDMarkanterPunkt = iDMarkanterPunkt;
		iDMarkanterPunkt = newIDMarkanterPunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT, oldIDMarkanterPunkt, newIDMarkanterPunkt);
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
	public void setIDMarkanterPunkt(ID_Markanter_Punkt_TypeClass newIDMarkanterPunkt) {
		if (newIDMarkanterPunkt != iDMarkanterPunkt) {
			NotificationChain msgs = null;
			if (iDMarkanterPunkt != null)
				msgs = ((InternalEObject)iDMarkanterPunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT, null, msgs);
			if (newIDMarkanterPunkt != null)
				msgs = ((InternalEObject)newIDMarkanterPunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT, null, msgs);
			msgs = basicSetIDMarkanterPunkt(newIDMarkanterPunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT, newIDMarkanterPunkt, newIDMarkanterPunkt));
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
				return basicSetIDAnhangINA(null, msgs);
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE:
				return basicSetIDBahnsteigKante(null, msgs);
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				return basicSetIDMarkanterPunkt(null, msgs);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				return getIDMarkanterPunkt();
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA:
				setIDAnhangINA((ID_Anhang_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE:
				setIDBahnsteigKante((ID_Bahnsteig_Kante_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				setIDMarkanterPunkt((ID_Markanter_Punkt_TypeClass)newValue);
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
				setIDAnhangINA((ID_Anhang_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE:
				setIDBahnsteigKante((ID_Bahnsteig_Kante_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				setIDMarkanterPunkt((ID_Markanter_Punkt_TypeClass)null);
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
				return iDAnhangINA != null;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE:
				return iDBahnsteigKante != null;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				return iDMarkanterPunkt != null;
		}
		return super.eIsSet(featureID);
	}

} //PZB_Element_Zuordnung_INA_AttributeGroupImpl
