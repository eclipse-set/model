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

import org.eclipse.set.model.planpro.Ansteuerung_Element.AEA_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Aussenelementansteuerung_Art_TypeClass;
import org.eclipse.set.model.planpro.Ansteuerung_Element.Bauart_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AEA Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.AEA_Allg_AttributeGroupImpl#getAussenelementansteuerungArt <em>Aussenelementansteuerung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ansteuerung_Element.impl.AEA_Allg_AttributeGroupImpl#getBauart <em>Bauart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AEA_Allg_AttributeGroupImpl extends EObjectImpl implements AEA_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAussenelementansteuerungArt() <em>Aussenelementansteuerung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAussenelementansteuerungArt()
	 * @generated
	 * @ordered
	 */
	protected Aussenelementansteuerung_Art_TypeClass aussenelementansteuerungArt;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AEA_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.AEA_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aussenelementansteuerung_Art_TypeClass getAussenelementansteuerungArt() {
		return aussenelementansteuerungArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAussenelementansteuerungArt(Aussenelementansteuerung_Art_TypeClass newAussenelementansteuerungArt, NotificationChain msgs) {
		Aussenelementansteuerung_Art_TypeClass oldAussenelementansteuerungArt = aussenelementansteuerungArt;
		aussenelementansteuerungArt = newAussenelementansteuerungArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__AUSSENELEMENTANSTEUERUNG_ART, oldAussenelementansteuerungArt, newAussenelementansteuerungArt);
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
	public void setAussenelementansteuerungArt(Aussenelementansteuerung_Art_TypeClass newAussenelementansteuerungArt) {
		if (newAussenelementansteuerungArt != aussenelementansteuerungArt) {
			NotificationChain msgs = null;
			if (aussenelementansteuerungArt != null)
				msgs = ((InternalEObject)aussenelementansteuerungArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__AUSSENELEMENTANSTEUERUNG_ART, null, msgs);
			if (newAussenelementansteuerungArt != null)
				msgs = ((InternalEObject)newAussenelementansteuerungArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__AUSSENELEMENTANSTEUERUNG_ART, null, msgs);
			msgs = basicSetAussenelementansteuerungArt(newAussenelementansteuerungArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__AUSSENELEMENTANSTEUERUNG_ART, newAussenelementansteuerungArt, newAussenelementansteuerungArt));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__BAUART, oldBauart, newBauart);
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
				msgs = ((InternalEObject)bauart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__BAUART, null, msgs);
			if (newBauart != null)
				msgs = ((InternalEObject)newBauart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__BAUART, null, msgs);
			msgs = basicSetBauart(newBauart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__BAUART, newBauart, newBauart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__AUSSENELEMENTANSTEUERUNG_ART:
				return basicSetAussenelementansteuerungArt(null, msgs);
			case Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__BAUART:
				return basicSetBauart(null, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__AUSSENELEMENTANSTEUERUNG_ART:
				return getAussenelementansteuerungArt();
			case Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__BAUART:
				return getBauart();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__AUSSENELEMENTANSTEUERUNG_ART:
				setAussenelementansteuerungArt((Aussenelementansteuerung_Art_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__BAUART:
				setBauart((Bauart_TypeClass)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__AUSSENELEMENTANSTEUERUNG_ART:
				setAussenelementansteuerungArt((Aussenelementansteuerung_Art_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__BAUART:
				setBauart((Bauart_TypeClass)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__AUSSENELEMENTANSTEUERUNG_ART:
				return aussenelementansteuerungArt != null;
			case Ansteuerung_ElementPackage.AEA_ALLG_ATTRIBUTE_GROUP__BAUART:
				return bauart != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //AEA_Allg_AttributeGroupImpl
