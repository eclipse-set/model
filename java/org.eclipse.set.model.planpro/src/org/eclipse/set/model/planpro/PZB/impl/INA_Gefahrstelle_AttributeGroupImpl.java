/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PZB.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.PZB.INA_Gefahrstelle_AttributeGroup;
import org.eclipse.set.model.planpro.PZB.PZBPackage;
import org.eclipse.set.model.planpro.PZB.Prioritaet_Gefahrstelle_TypeClass;

import org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>INA Gefahrstelle Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PZB.impl.INA_Gefahrstelle_AttributeGroupImpl#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PZB.impl.INA_Gefahrstelle_AttributeGroupImpl#getPrioritaetGefahrstelle <em>Prioritaet Gefahrstelle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class INA_Gefahrstelle_AttributeGroupImpl extends EObjectImpl implements INA_Gefahrstelle_AttributeGroup {
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
	 * The cached value of the '{@link #getPrioritaetGefahrstelle() <em>Prioritaet Gefahrstelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioritaetGefahrstelle()
	 * @generated
	 * @ordered
	 */
	protected Prioritaet_Gefahrstelle_TypeClass prioritaetGefahrstelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected INA_Gefahrstelle_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PZBPackage.Literals.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT, oldIDMarkanterPunkt, newIDMarkanterPunkt);
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
				msgs = ((InternalEObject)iDMarkanterPunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT, null, msgs);
			if (newIDMarkanterPunkt != null)
				msgs = ((InternalEObject)newIDMarkanterPunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT, null, msgs);
			msgs = basicSetIDMarkanterPunkt(newIDMarkanterPunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT, newIDMarkanterPunkt, newIDMarkanterPunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prioritaet_Gefahrstelle_TypeClass getPrioritaetGefahrstelle() {
		return prioritaetGefahrstelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrioritaetGefahrstelle(Prioritaet_Gefahrstelle_TypeClass newPrioritaetGefahrstelle, NotificationChain msgs) {
		Prioritaet_Gefahrstelle_TypeClass oldPrioritaetGefahrstelle = prioritaetGefahrstelle;
		prioritaetGefahrstelle = newPrioritaetGefahrstelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE, oldPrioritaetGefahrstelle, newPrioritaetGefahrstelle);
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
	public void setPrioritaetGefahrstelle(Prioritaet_Gefahrstelle_TypeClass newPrioritaetGefahrstelle) {
		if (newPrioritaetGefahrstelle != prioritaetGefahrstelle) {
			NotificationChain msgs = null;
			if (prioritaetGefahrstelle != null)
				msgs = ((InternalEObject)prioritaetGefahrstelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE, null, msgs);
			if (newPrioritaetGefahrstelle != null)
				msgs = ((InternalEObject)newPrioritaetGefahrstelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE, null, msgs);
			msgs = basicSetPrioritaetGefahrstelle(newPrioritaetGefahrstelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE, newPrioritaetGefahrstelle, newPrioritaetGefahrstelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				return basicSetIDMarkanterPunkt(null, msgs);
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE:
				return basicSetPrioritaetGefahrstelle(null, msgs);
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
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				return getIDMarkanterPunkt();
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE:
				return getPrioritaetGefahrstelle();
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
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				setIDMarkanterPunkt((ID_Markanter_Punkt_TypeClass)newValue);
				return;
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE:
				setPrioritaetGefahrstelle((Prioritaet_Gefahrstelle_TypeClass)newValue);
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
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				setIDMarkanterPunkt((ID_Markanter_Punkt_TypeClass)null);
				return;
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE:
				setPrioritaetGefahrstelle((Prioritaet_Gefahrstelle_TypeClass)null);
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
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				return iDMarkanterPunkt != null;
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE:
				return prioritaetGefahrstelle != null;
		}
		return super.eIsSet(featureID);
	}

} //INA_Gefahrstelle_AttributeGroupImpl
