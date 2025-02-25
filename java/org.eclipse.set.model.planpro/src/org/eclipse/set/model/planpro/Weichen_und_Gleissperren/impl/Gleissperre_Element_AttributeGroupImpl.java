/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Weichen_und_Gleissperren.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Gleissperre_Betriebsart_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Gleissperre_Element_AttributeGroup;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Gleissperre_Vorzugslage_TypeClass;
import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gleissperre Element Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.impl.Gleissperre_Element_AttributeGroupImpl#getGleissperreBetriebsart <em>Gleissperre Betriebsart</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.impl.Gleissperre_Element_AttributeGroupImpl#getGleissperreVorzugslage <em>Gleissperre Vorzugslage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Gleissperre_Element_AttributeGroupImpl extends EObjectImpl implements Gleissperre_Element_AttributeGroup {
	/**
	 * The cached value of the '{@link #getGleissperreBetriebsart() <em>Gleissperre Betriebsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGleissperreBetriebsart()
	 * @generated
	 * @ordered
	 */
	protected Gleissperre_Betriebsart_TypeClass gleissperreBetriebsart;

	/**
	 * The cached value of the '{@link #getGleissperreVorzugslage() <em>Gleissperre Vorzugslage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGleissperreVorzugslage()
	 * @generated
	 * @ordered
	 */
	protected Gleissperre_Vorzugslage_TypeClass gleissperreVorzugslage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gleissperre_Element_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Weichen_und_GleissperrenPackage.Literals.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleissperre_Betriebsart_TypeClass getGleissperreBetriebsart() {
		return gleissperreBetriebsart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGleissperreBetriebsart(Gleissperre_Betriebsart_TypeClass newGleissperreBetriebsart, NotificationChain msgs) {
		Gleissperre_Betriebsart_TypeClass oldGleissperreBetriebsart = gleissperreBetriebsart;
		gleissperreBetriebsart = newGleissperreBetriebsart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_BETRIEBSART, oldGleissperreBetriebsart, newGleissperreBetriebsart);
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
	public void setGleissperreBetriebsart(Gleissperre_Betriebsart_TypeClass newGleissperreBetriebsart) {
		if (newGleissperreBetriebsart != gleissperreBetriebsart) {
			NotificationChain msgs = null;
			if (gleissperreBetriebsart != null)
				msgs = ((InternalEObject)gleissperreBetriebsart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_BETRIEBSART, null, msgs);
			if (newGleissperreBetriebsart != null)
				msgs = ((InternalEObject)newGleissperreBetriebsart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_BETRIEBSART, null, msgs);
			msgs = basicSetGleissperreBetriebsart(newGleissperreBetriebsart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_BETRIEBSART, newGleissperreBetriebsart, newGleissperreBetriebsart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleissperre_Vorzugslage_TypeClass getGleissperreVorzugslage() {
		return gleissperreVorzugslage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGleissperreVorzugslage(Gleissperre_Vorzugslage_TypeClass newGleissperreVorzugslage, NotificationChain msgs) {
		Gleissperre_Vorzugslage_TypeClass oldGleissperreVorzugslage = gleissperreVorzugslage;
		gleissperreVorzugslage = newGleissperreVorzugslage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_VORZUGSLAGE, oldGleissperreVorzugslage, newGleissperreVorzugslage);
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
	public void setGleissperreVorzugslage(Gleissperre_Vorzugslage_TypeClass newGleissperreVorzugslage) {
		if (newGleissperreVorzugslage != gleissperreVorzugslage) {
			NotificationChain msgs = null;
			if (gleissperreVorzugslage != null)
				msgs = ((InternalEObject)gleissperreVorzugslage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_VORZUGSLAGE, null, msgs);
			if (newGleissperreVorzugslage != null)
				msgs = ((InternalEObject)newGleissperreVorzugslage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_VORZUGSLAGE, null, msgs);
			msgs = basicSetGleissperreVorzugslage(newGleissperreVorzugslage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_VORZUGSLAGE, newGleissperreVorzugslage, newGleissperreVorzugslage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_BETRIEBSART:
				return basicSetGleissperreBetriebsart(null, msgs);
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_VORZUGSLAGE:
				return basicSetGleissperreVorzugslage(null, msgs);
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
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_BETRIEBSART:
				return getGleissperreBetriebsart();
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_VORZUGSLAGE:
				return getGleissperreVorzugslage();
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
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_BETRIEBSART:
				setGleissperreBetriebsart((Gleissperre_Betriebsart_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_VORZUGSLAGE:
				setGleissperreVorzugslage((Gleissperre_Vorzugslage_TypeClass)newValue);
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
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_BETRIEBSART:
				setGleissperreBetriebsart((Gleissperre_Betriebsart_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_VORZUGSLAGE:
				setGleissperreVorzugslage((Gleissperre_Vorzugslage_TypeClass)null);
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
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_BETRIEBSART:
				return gleissperreBetriebsart != null;
			case Weichen_und_GleissperrenPackage.GLEISSPERRE_ELEMENT_ATTRIBUTE_GROUP__GLEISSPERRE_VORZUGSLAGE:
				return gleissperreVorzugslage != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Gleissperre_Element_AttributeGroupImpl
