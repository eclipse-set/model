/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.W_Lage_TypeClass;

import org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bgrenze Nach Ohne Bed Einstieg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroupImpl#getIDWElement <em>IDW Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroupImpl#getWLage <em>WLage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroupImpl extends EObjectImpl implements Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDWElement() <em>IDW Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDWElement()
	 * @generated
	 * @ordered
	 */
	protected ID_W_Kr_Gsp_Element_TypeClass iDWElement;

	/**
	 * The cached value of the '{@link #getWLage() <em>WLage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWLage()
	 * @generated
	 * @ordered
	 */
	protected W_Lage_TypeClass wLage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_W_Kr_Gsp_Element_TypeClass getIDWElement() {
		return iDWElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDWElement(ID_W_Kr_Gsp_Element_TypeClass newIDWElement, NotificationChain msgs) {
		ID_W_Kr_Gsp_Element_TypeClass oldIDWElement = iDWElement;
		iDWElement = newIDWElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__IDW_ELEMENT, oldIDWElement, newIDWElement);
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
	public void setIDWElement(ID_W_Kr_Gsp_Element_TypeClass newIDWElement) {
		if (newIDWElement != iDWElement) {
			NotificationChain msgs = null;
			if (iDWElement != null)
				msgs = ((InternalEObject)iDWElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__IDW_ELEMENT, null, msgs);
			if (newIDWElement != null)
				msgs = ((InternalEObject)newIDWElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__IDW_ELEMENT, null, msgs);
			msgs = basicSetIDWElement(newIDWElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__IDW_ELEMENT, newIDWElement, newIDWElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Lage_TypeClass getWLage() {
		return wLage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWLage(W_Lage_TypeClass newWLage, NotificationChain msgs) {
		W_Lage_TypeClass oldWLage = wLage;
		wLage = newWLage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE, oldWLage, newWLage);
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
	public void setWLage(W_Lage_TypeClass newWLage) {
		if (newWLage != wLage) {
			NotificationChain msgs = null;
			if (wLage != null)
				msgs = ((InternalEObject)wLage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE, null, msgs);
			if (newWLage != null)
				msgs = ((InternalEObject)newWLage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE, null, msgs);
			msgs = basicSetWLage(newWLage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE, newWLage, newWLage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__IDW_ELEMENT:
				return basicSetIDWElement(null, msgs);
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE:
				return basicSetWLage(null, msgs);
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
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__IDW_ELEMENT:
				return getIDWElement();
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE:
				return getWLage();
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
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__IDW_ELEMENT:
				setIDWElement((ID_W_Kr_Gsp_Element_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE:
				setWLage((W_Lage_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__IDW_ELEMENT:
				setIDWElement((ID_W_Kr_Gsp_Element_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE:
				setWLage((W_Lage_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__IDW_ELEMENT:
				return iDWElement != null;
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_OHNE_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE:
				return wLage != null;
		}
		return super.eIsSet(featureID);
	}

} //Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroupImpl
