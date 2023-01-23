/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Verweise.ID_Element_TypeClass;

import org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Element_Lage_TypeClass;
import org.eclipse.set.model.model11001.Weichen_und_Gleissperren.GZ_Freimeldung_R_AttributeGroup;
import org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GZ Freimeldung RAttribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.GZ_Freimeldung_R_AttributeGroupImpl#getElementLage <em>Element Lage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.GZ_Freimeldung_R_AttributeGroupImpl#getIDElement <em>ID Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GZ_Freimeldung_R_AttributeGroupImpl extends EObjectImpl implements GZ_Freimeldung_R_AttributeGroup {
	/**
	 * The cached value of the '{@link #getElementLage() <em>Element Lage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementLage()
	 * @generated
	 * @ordered
	 */
	protected Element_Lage_TypeClass elementLage;

	/**
	 * The cached value of the '{@link #getIDElement() <em>ID Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDElement()
	 * @generated
	 * @ordered
	 */
	protected ID_Element_TypeClass iDElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GZ_Freimeldung_R_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Weichen_und_GleissperrenPackage.Literals.GZ_FREIMELDUNG_RATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element_Lage_TypeClass getElementLage() {
		return elementLage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementLage(Element_Lage_TypeClass newElementLage, NotificationChain msgs) {
		Element_Lage_TypeClass oldElementLage = elementLage;
		elementLage = newElementLage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ELEMENT_LAGE, oldElementLage, newElementLage);
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
	public void setElementLage(Element_Lage_TypeClass newElementLage) {
		if (newElementLage != elementLage) {
			NotificationChain msgs = null;
			if (elementLage != null)
				msgs = ((InternalEObject)elementLage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ELEMENT_LAGE, null, msgs);
			if (newElementLage != null)
				msgs = ((InternalEObject)newElementLage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ELEMENT_LAGE, null, msgs);
			msgs = basicSetElementLage(newElementLage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ELEMENT_LAGE, newElementLage, newElementLage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Element_TypeClass getIDElement() {
		return iDElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDElement(ID_Element_TypeClass newIDElement, NotificationChain msgs) {
		ID_Element_TypeClass oldIDElement = iDElement;
		iDElement = newIDElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ID_ELEMENT, oldIDElement, newIDElement);
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
	public void setIDElement(ID_Element_TypeClass newIDElement) {
		if (newIDElement != iDElement) {
			NotificationChain msgs = null;
			if (iDElement != null)
				msgs = ((InternalEObject)iDElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ID_ELEMENT, null, msgs);
			if (newIDElement != null)
				msgs = ((InternalEObject)newIDElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ID_ELEMENT, null, msgs);
			msgs = basicSetIDElement(newIDElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ID_ELEMENT, newIDElement, newIDElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ELEMENT_LAGE:
				return basicSetElementLage(null, msgs);
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ID_ELEMENT:
				return basicSetIDElement(null, msgs);
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
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ELEMENT_LAGE:
				return getElementLage();
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ID_ELEMENT:
				return getIDElement();
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
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ELEMENT_LAGE:
				setElementLage((Element_Lage_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ID_ELEMENT:
				setIDElement((ID_Element_TypeClass)newValue);
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
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ELEMENT_LAGE:
				setElementLage((Element_Lage_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ID_ELEMENT:
				setIDElement((ID_Element_TypeClass)null);
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
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ELEMENT_LAGE:
				return elementLage != null;
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_RATTRIBUTE_GROUP__ID_ELEMENT:
				return iDElement != null;
		}
		return super.eIsSet(featureID);
	}

} //GZ_Freimeldung_R_AttributeGroupImpl
