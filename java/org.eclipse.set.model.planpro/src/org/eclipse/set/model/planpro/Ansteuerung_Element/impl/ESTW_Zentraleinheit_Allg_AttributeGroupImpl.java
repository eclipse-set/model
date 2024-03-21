/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ansteuerung_Element.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Bauart_TypeClass;
import org.eclipse.set.model.planpro.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Hersteller_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESTW Zentraleinheit Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.ESTW_Zentraleinheit_Allg_AttributeGroupImpl#getBauart <em>Bauart</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.ESTW_Zentraleinheit_Allg_AttributeGroupImpl#getHersteller <em>Hersteller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESTW_Zentraleinheit_Allg_AttributeGroupImpl extends EObjectImpl implements ESTW_Zentraleinheit_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBauart() <em>Bauart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBauart()
	 * @generated
	 * @ordered
	 */
	protected Bauart_TypeClass bauart;

	/**
	 * The cached value of the '{@link #getHersteller() <em>Hersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHersteller()
	 * @generated
	 * @ordered
	 */
	protected Hersteller_TypeClass hersteller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESTW_Zentraleinheit_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bauart_TypeClass getBauart() {
		return bauart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBauart(Bauart_TypeClass newBauart, NotificationChain msgs) {
		Bauart_TypeClass oldBauart = bauart;
		bauart = newBauart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART, oldBauart, newBauart);
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
	public void setBauart(Bauart_TypeClass newBauart) {
		if (newBauart != bauart) {
			NotificationChain msgs = null;
			if (bauart != null)
				msgs = ((InternalEObject)bauart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART, null, msgs);
			if (newBauart != null)
				msgs = ((InternalEObject)newBauart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART, null, msgs);
			msgs = basicSetBauart(newBauart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART, newBauart, newBauart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hersteller_TypeClass getHersteller() {
		return hersteller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHersteller(Hersteller_TypeClass newHersteller, NotificationChain msgs) {
		Hersteller_TypeClass oldHersteller = hersteller;
		hersteller = newHersteller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER, oldHersteller, newHersteller);
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
	public void setHersteller(Hersteller_TypeClass newHersteller) {
		if (newHersteller != hersteller) {
			NotificationChain msgs = null;
			if (hersteller != null)
				msgs = ((InternalEObject)hersteller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			if (newHersteller != null)
				msgs = ((InternalEObject)newHersteller).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			msgs = basicSetHersteller(newHersteller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER, newHersteller, newHersteller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART:
				return basicSetBauart(null, msgs);
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return basicSetHersteller(null, msgs);
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART:
				return getBauart();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return getHersteller();
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART:
				setBauart((Bauart_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)newValue);
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART:
				setBauart((Bauart_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)null);
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART:
				return bauart != null;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
				return hersteller != null;
		}
		return super.eIsSet(featureID);
	}

} //ESTW_Zentraleinheit_Allg_AttributeGroupImpl
