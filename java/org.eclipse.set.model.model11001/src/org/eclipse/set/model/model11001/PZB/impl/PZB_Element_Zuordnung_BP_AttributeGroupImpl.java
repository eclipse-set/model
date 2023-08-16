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

import org.eclipse.set.model.model11001.PZB.INA_Gefahrstelle_AttributeGroup;
import org.eclipse.set.model.model11001.PZB.PZBPackage;
import org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_BP_AttributeGroup;
import org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_INA_AttributeGroup;
import org.eclipse.set.model.model11001.PZB.Wirksamkeit_TypeClass;

import org.eclipse.set.model.model11001.Verweise.ID_PZB_Element_Bezugspunkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PZB Element Zuordnung BP Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Element_Zuordnung_BP_AttributeGroupImpl#getIDPZBElementBezugspunkt <em>IDPZB Element Bezugspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Element_Zuordnung_BP_AttributeGroupImpl#getINAGefahrstelle <em>INA Gefahrstelle</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Element_Zuordnung_BP_AttributeGroupImpl#getPZBElementZuordnungINA <em>PZB Element Zuordnung INA</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Element_Zuordnung_BP_AttributeGroupImpl#getWirksamkeit <em>Wirksamkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PZB_Element_Zuordnung_BP_AttributeGroupImpl extends EObjectImpl implements PZB_Element_Zuordnung_BP_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDPZBElementBezugspunkt() <em>IDPZB Element Bezugspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDPZBElementBezugspunkt()
	 * @generated
	 * @ordered
	 */
	protected ID_PZB_Element_Bezugspunkt_TypeClass iDPZBElementBezugspunkt;

	/**
	 * The cached value of the '{@link #getINAGefahrstelle() <em>INA Gefahrstelle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINAGefahrstelle()
	 * @generated
	 * @ordered
	 */
	protected EList<INA_Gefahrstelle_AttributeGroup> iNAGefahrstelle;

	/**
	 * The cached value of the '{@link #getPZBElementZuordnungINA() <em>PZB Element Zuordnung INA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPZBElementZuordnungINA()
	 * @generated
	 * @ordered
	 */
	protected PZB_Element_Zuordnung_INA_AttributeGroup pZBElementZuordnungINA;

	/**
	 * The cached value of the '{@link #getWirksamkeit() <em>Wirksamkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWirksamkeit()
	 * @generated
	 * @ordered
	 */
	protected Wirksamkeit_TypeClass wirksamkeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Element_Zuordnung_BP_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_PZB_Element_Bezugspunkt_TypeClass getIDPZBElementBezugspunkt() {
		return iDPZBElementBezugspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDPZBElementBezugspunkt(ID_PZB_Element_Bezugspunkt_TypeClass newIDPZBElementBezugspunkt, NotificationChain msgs) {
		ID_PZB_Element_Bezugspunkt_TypeClass oldIDPZBElementBezugspunkt = iDPZBElementBezugspunkt;
		iDPZBElementBezugspunkt = newIDPZBElementBezugspunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__IDPZB_ELEMENT_BEZUGSPUNKT, oldIDPZBElementBezugspunkt, newIDPZBElementBezugspunkt);
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
	public void setIDPZBElementBezugspunkt(ID_PZB_Element_Bezugspunkt_TypeClass newIDPZBElementBezugspunkt) {
		if (newIDPZBElementBezugspunkt != iDPZBElementBezugspunkt) {
			NotificationChain msgs = null;
			if (iDPZBElementBezugspunkt != null)
				msgs = ((InternalEObject)iDPZBElementBezugspunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__IDPZB_ELEMENT_BEZUGSPUNKT, null, msgs);
			if (newIDPZBElementBezugspunkt != null)
				msgs = ((InternalEObject)newIDPZBElementBezugspunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__IDPZB_ELEMENT_BEZUGSPUNKT, null, msgs);
			msgs = basicSetIDPZBElementBezugspunkt(newIDPZBElementBezugspunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__IDPZB_ELEMENT_BEZUGSPUNKT, newIDPZBElementBezugspunkt, newIDPZBElementBezugspunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<INA_Gefahrstelle_AttributeGroup> getINAGefahrstelle() {
		if (iNAGefahrstelle == null) {
			iNAGefahrstelle = new EObjectContainmentEList<INA_Gefahrstelle_AttributeGroup>(INA_Gefahrstelle_AttributeGroup.class, this, PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__INA_GEFAHRSTELLE);
		}
		return iNAGefahrstelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Element_Zuordnung_INA_AttributeGroup getPZBElementZuordnungINA() {
		return pZBElementZuordnungINA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPZBElementZuordnungINA(PZB_Element_Zuordnung_INA_AttributeGroup newPZBElementZuordnungINA, NotificationChain msgs) {
		PZB_Element_Zuordnung_INA_AttributeGroup oldPZBElementZuordnungINA = pZBElementZuordnungINA;
		pZBElementZuordnungINA = newPZBElementZuordnungINA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG_INA, oldPZBElementZuordnungINA, newPZBElementZuordnungINA);
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
	public void setPZBElementZuordnungINA(PZB_Element_Zuordnung_INA_AttributeGroup newPZBElementZuordnungINA) {
		if (newPZBElementZuordnungINA != pZBElementZuordnungINA) {
			NotificationChain msgs = null;
			if (pZBElementZuordnungINA != null)
				msgs = ((InternalEObject)pZBElementZuordnungINA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG_INA, null, msgs);
			if (newPZBElementZuordnungINA != null)
				msgs = ((InternalEObject)newPZBElementZuordnungINA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG_INA, null, msgs);
			msgs = basicSetPZBElementZuordnungINA(newPZBElementZuordnungINA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG_INA, newPZBElementZuordnungINA, newPZBElementZuordnungINA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wirksamkeit_TypeClass getWirksamkeit() {
		return wirksamkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWirksamkeit(Wirksamkeit_TypeClass newWirksamkeit, NotificationChain msgs) {
		Wirksamkeit_TypeClass oldWirksamkeit = wirksamkeit;
		wirksamkeit = newWirksamkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__WIRKSAMKEIT, oldWirksamkeit, newWirksamkeit);
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
	public void setWirksamkeit(Wirksamkeit_TypeClass newWirksamkeit) {
		if (newWirksamkeit != wirksamkeit) {
			NotificationChain msgs = null;
			if (wirksamkeit != null)
				msgs = ((InternalEObject)wirksamkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__WIRKSAMKEIT, null, msgs);
			if (newWirksamkeit != null)
				msgs = ((InternalEObject)newWirksamkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__WIRKSAMKEIT, null, msgs);
			msgs = basicSetWirksamkeit(newWirksamkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__WIRKSAMKEIT, newWirksamkeit, newWirksamkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__IDPZB_ELEMENT_BEZUGSPUNKT:
				return basicSetIDPZBElementBezugspunkt(null, msgs);
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__INA_GEFAHRSTELLE:
				return ((InternalEList<?>)getINAGefahrstelle()).basicRemove(otherEnd, msgs);
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG_INA:
				return basicSetPZBElementZuordnungINA(null, msgs);
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__WIRKSAMKEIT:
				return basicSetWirksamkeit(null, msgs);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__IDPZB_ELEMENT_BEZUGSPUNKT:
				return getIDPZBElementBezugspunkt();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__INA_GEFAHRSTELLE:
				return getINAGefahrstelle();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG_INA:
				return getPZBElementZuordnungINA();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__WIRKSAMKEIT:
				return getWirksamkeit();
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__IDPZB_ELEMENT_BEZUGSPUNKT:
				setIDPZBElementBezugspunkt((ID_PZB_Element_Bezugspunkt_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__INA_GEFAHRSTELLE:
				getINAGefahrstelle().clear();
				getINAGefahrstelle().addAll((Collection<? extends INA_Gefahrstelle_AttributeGroup>)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG_INA:
				setPZBElementZuordnungINA((PZB_Element_Zuordnung_INA_AttributeGroup)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__WIRKSAMKEIT:
				setWirksamkeit((Wirksamkeit_TypeClass)newValue);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__IDPZB_ELEMENT_BEZUGSPUNKT:
				setIDPZBElementBezugspunkt((ID_PZB_Element_Bezugspunkt_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__INA_GEFAHRSTELLE:
				getINAGefahrstelle().clear();
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG_INA:
				setPZBElementZuordnungINA((PZB_Element_Zuordnung_INA_AttributeGroup)null);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__WIRKSAMKEIT:
				setWirksamkeit((Wirksamkeit_TypeClass)null);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__IDPZB_ELEMENT_BEZUGSPUNKT:
				return iDPZBElementBezugspunkt != null;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__INA_GEFAHRSTELLE:
				return iNAGefahrstelle != null && !iNAGefahrstelle.isEmpty();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG_INA:
				return pZBElementZuordnungINA != null;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__WIRKSAMKEIT:
				return wirksamkeit != null;
		}
		return super.eIsSet(featureID);
	}

} //PZB_Element_Zuordnung_BP_AttributeGroupImpl
