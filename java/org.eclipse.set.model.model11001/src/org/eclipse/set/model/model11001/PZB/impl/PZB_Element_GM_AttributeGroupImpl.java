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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.PZB.PZBPackage;
import org.eclipse.set.model.model11001.PZB.PZB_Abstand_GM_TypeClass;
import org.eclipse.set.model.model11001.PZB.PZB_Element_GM_AttributeGroup;
import org.eclipse.set.model.model11001.PZB.PZB_INA_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PZB Element GM Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Element_GM_AttributeGroupImpl#getPZBAbstandGM <em>PZB Abstand GM</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.impl.PZB_Element_GM_AttributeGroupImpl#getPZBINA <em>PZBINA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PZB_Element_GM_AttributeGroupImpl extends EObjectImpl implements PZB_Element_GM_AttributeGroup {
	/**
	 * The cached value of the '{@link #getPZBAbstandGM() <em>PZB Abstand GM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPZBAbstandGM()
	 * @generated
	 * @ordered
	 */
	protected PZB_Abstand_GM_TypeClass pZBAbstandGM;

	/**
	 * The cached value of the '{@link #getPZBINA() <em>PZBINA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPZBINA()
	 * @generated
	 * @ordered
	 */
	protected PZB_INA_TypeClass pZBINA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Element_GM_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PZBPackage.Literals.PZB_ELEMENT_GM_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Abstand_GM_TypeClass getPZBAbstandGM() {
		return pZBAbstandGM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPZBAbstandGM(PZB_Abstand_GM_TypeClass newPZBAbstandGM, NotificationChain msgs) {
		PZB_Abstand_GM_TypeClass oldPZBAbstandGM = pZBAbstandGM;
		pZBAbstandGM = newPZBAbstandGM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZB_ABSTAND_GM, oldPZBAbstandGM, newPZBAbstandGM);
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
	public void setPZBAbstandGM(PZB_Abstand_GM_TypeClass newPZBAbstandGM) {
		if (newPZBAbstandGM != pZBAbstandGM) {
			NotificationChain msgs = null;
			if (pZBAbstandGM != null)
				msgs = ((InternalEObject)pZBAbstandGM).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZB_ABSTAND_GM, null, msgs);
			if (newPZBAbstandGM != null)
				msgs = ((InternalEObject)newPZBAbstandGM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZB_ABSTAND_GM, null, msgs);
			msgs = basicSetPZBAbstandGM(newPZBAbstandGM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZB_ABSTAND_GM, newPZBAbstandGM, newPZBAbstandGM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_INA_TypeClass getPZBINA() {
		return pZBINA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPZBINA(PZB_INA_TypeClass newPZBINA, NotificationChain msgs) {
		PZB_INA_TypeClass oldPZBINA = pZBINA;
		pZBINA = newPZBINA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZBINA, oldPZBINA, newPZBINA);
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
	public void setPZBINA(PZB_INA_TypeClass newPZBINA) {
		if (newPZBINA != pZBINA) {
			NotificationChain msgs = null;
			if (pZBINA != null)
				msgs = ((InternalEObject)pZBINA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZBINA, null, msgs);
			if (newPZBINA != null)
				msgs = ((InternalEObject)newPZBINA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZBINA, null, msgs);
			msgs = basicSetPZBINA(newPZBINA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZBINA, newPZBINA, newPZBINA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZB_ABSTAND_GM:
				return basicSetPZBAbstandGM(null, msgs);
			case PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZBINA:
				return basicSetPZBINA(null, msgs);
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
			case PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZB_ABSTAND_GM:
				return getPZBAbstandGM();
			case PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZBINA:
				return getPZBINA();
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
			case PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZB_ABSTAND_GM:
				setPZBAbstandGM((PZB_Abstand_GM_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZBINA:
				setPZBINA((PZB_INA_TypeClass)newValue);
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
			case PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZB_ABSTAND_GM:
				setPZBAbstandGM((PZB_Abstand_GM_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZBINA:
				setPZBINA((PZB_INA_TypeClass)null);
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
			case PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZB_ABSTAND_GM:
				return pZBAbstandGM != null;
			case PZBPackage.PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZBINA:
				return pZBINA != null;
		}
		return super.eIsSet(featureID);
	}

} //PZB_Element_GM_AttributeGroupImpl
