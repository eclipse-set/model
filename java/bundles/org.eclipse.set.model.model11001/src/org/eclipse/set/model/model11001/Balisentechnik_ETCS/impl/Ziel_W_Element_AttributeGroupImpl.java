/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.W_Anschluss_TypeClass;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Ziel_W_Element_AttributeGroup;

import org.eclipse.set.model.model11001.Verweise.ID_W_Kr_Gsp_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ziel WElement Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Ziel_W_Element_AttributeGroupImpl#getIDZielWElement <em>ID Ziel WElement</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Ziel_W_Element_AttributeGroupImpl#getWAnschluss <em>WAnschluss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Ziel_W_Element_AttributeGroupImpl extends EObjectImpl implements Ziel_W_Element_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDZielWElement() <em>ID Ziel WElement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZielWElement()
	 * @generated
	 * @ordered
	 */
	protected ID_W_Kr_Gsp_Element_TypeClass iDZielWElement;

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
	protected Ziel_W_Element_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZiel_W_Element_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_W_Kr_Gsp_Element_TypeClass getIDZielWElement() {
		return iDZielWElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDZielWElement(ID_W_Kr_Gsp_Element_TypeClass newIDZielWElement, NotificationChain msgs) {
		ID_W_Kr_Gsp_Element_TypeClass oldIDZielWElement = iDZielWElement;
		iDZielWElement = newIDZielWElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__ID_ZIEL_WELEMENT, oldIDZielWElement, newIDZielWElement);
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
	public void setIDZielWElement(ID_W_Kr_Gsp_Element_TypeClass newIDZielWElement) {
		if (newIDZielWElement != iDZielWElement) {
			NotificationChain msgs = null;
			if (iDZielWElement != null)
				msgs = ((InternalEObject)iDZielWElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__ID_ZIEL_WELEMENT, null, msgs);
			if (newIDZielWElement != null)
				msgs = ((InternalEObject)newIDZielWElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__ID_ZIEL_WELEMENT, null, msgs);
			msgs = basicSetIDZielWElement(newIDZielWElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__ID_ZIEL_WELEMENT, newIDZielWElement, newIDZielWElement));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS, oldWAnschluss, newWAnschluss);
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
				msgs = ((InternalEObject)wAnschluss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS, null, msgs);
			if (newWAnschluss != null)
				msgs = ((InternalEObject)newWAnschluss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS, null, msgs);
			msgs = basicSetWAnschluss(newWAnschluss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS, newWAnschluss, newWAnschluss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__ID_ZIEL_WELEMENT:
				return basicSetIDZielWElement(null, msgs);
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				return basicSetWAnschluss(null, msgs);
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
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__ID_ZIEL_WELEMENT:
				return getIDZielWElement();
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				return getWAnschluss();
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
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__ID_ZIEL_WELEMENT:
				setIDZielWElement((ID_W_Kr_Gsp_Element_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				setWAnschluss((W_Anschluss_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__ID_ZIEL_WELEMENT:
				setIDZielWElement((ID_W_Kr_Gsp_Element_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				setWAnschluss((W_Anschluss_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__ID_ZIEL_WELEMENT:
				return iDZielWElement != null;
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				return wAnschluss != null;
		}
		return super.eIsSet(featureID);
	}

} //Ziel_W_Element_AttributeGroupImpl
