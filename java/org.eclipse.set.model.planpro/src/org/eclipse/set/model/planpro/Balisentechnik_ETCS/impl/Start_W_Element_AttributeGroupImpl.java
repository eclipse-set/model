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
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Start_W_Element_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.W_Anschluss_TypeClass;

import org.eclipse.set.model.planpro.Verweise.ID_W_Kr_Gsp_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start WElement Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Start_W_Element_AttributeGroupImpl#getIDStartWElement <em>ID Start WElement</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Start_W_Element_AttributeGroupImpl#getWAnschluss <em>WAnschluss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Start_W_Element_AttributeGroupImpl extends EObjectImpl implements Start_W_Element_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDStartWElement() <em>ID Start WElement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStartWElement()
	 * @generated
	 * @ordered
	 */
	protected ID_W_Kr_Gsp_Element_TypeClass iDStartWElement;

	/**
	 * The cached value of the '{@link #getWAnschluss() <em>WAnschluss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWAnschluss()
	 * @generated
	 * @ordered
	 */
	protected W_Anschluss_TypeClass wAnschluss;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Start_W_Element_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getStart_W_Element_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_W_Kr_Gsp_Element_TypeClass getIDStartWElement() {
		return iDStartWElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDStartWElement(ID_W_Kr_Gsp_Element_TypeClass newIDStartWElement, NotificationChain msgs) {
		ID_W_Kr_Gsp_Element_TypeClass oldIDStartWElement = iDStartWElement;
		iDStartWElement = newIDStartWElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__ID_START_WELEMENT, oldIDStartWElement, newIDStartWElement);
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
	public void setIDStartWElement(ID_W_Kr_Gsp_Element_TypeClass newIDStartWElement) {
		if (newIDStartWElement != iDStartWElement) {
			NotificationChain msgs = null;
			if (iDStartWElement != null)
				msgs = ((InternalEObject)iDStartWElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__ID_START_WELEMENT, null, msgs);
			if (newIDStartWElement != null)
				msgs = ((InternalEObject)newIDStartWElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__ID_START_WELEMENT, null, msgs);
			msgs = basicSetIDStartWElement(newIDStartWElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__ID_START_WELEMENT, newIDStartWElement, newIDStartWElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Anschluss_TypeClass getWAnschluss() {
		return wAnschluss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWAnschluss(W_Anschluss_TypeClass newWAnschluss, NotificationChain msgs) {
		W_Anschluss_TypeClass oldWAnschluss = wAnschluss;
		wAnschluss = newWAnschluss;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS, oldWAnschluss, newWAnschluss);
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
	public void setWAnschluss(W_Anschluss_TypeClass newWAnschluss) {
		if (newWAnschluss != wAnschluss) {
			NotificationChain msgs = null;
			if (wAnschluss != null)
				msgs = ((InternalEObject)wAnschluss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS, null, msgs);
			if (newWAnschluss != null)
				msgs = ((InternalEObject)newWAnschluss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS, null, msgs);
			msgs = basicSetWAnschluss(newWAnschluss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS, newWAnschluss, newWAnschluss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__ID_START_WELEMENT:
				return basicSetIDStartWElement(null, msgs);
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				return basicSetWAnschluss(null, msgs);
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
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__ID_START_WELEMENT:
				return getIDStartWElement();
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				return getWAnschluss();
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
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__ID_START_WELEMENT:
				setIDStartWElement((ID_W_Kr_Gsp_Element_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				setWAnschluss((W_Anschluss_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__ID_START_WELEMENT:
				setIDStartWElement((ID_W_Kr_Gsp_Element_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				setWAnschluss((W_Anschluss_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__ID_START_WELEMENT:
				return iDStartWElement != null;
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				return wAnschluss != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Start_W_Element_AttributeGroupImpl
