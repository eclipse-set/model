/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Vorzugslage_Automatik_TypeClass;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Stellart_TypeClass;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WKr Gsp Element Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.W_Kr_Gsp_Element_Allg_AttributeGroupImpl#getVorzugslageAutomatik <em>Vorzugslage Automatik</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.W_Kr_Gsp_Element_Allg_AttributeGroupImpl#getWKrGspStellart <em>WKr Gsp Stellart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class W_Kr_Gsp_Element_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements W_Kr_Gsp_Element_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getVorzugslageAutomatik() <em>Vorzugslage Automatik</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVorzugslageAutomatik()
	 * @generated
	 * @ordered
	 */
	protected Vorzugslage_Automatik_TypeClass vorzugslageAutomatik;

	/**
	 * The cached value of the '{@link #getWKrGspStellart() <em>WKr Gsp Stellart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWKrGspStellart()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Gsp_Stellart_TypeClass wKrGspStellart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected W_Kr_Gsp_Element_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Weichen_und_GleissperrenPackage.Literals.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vorzugslage_Automatik_TypeClass getVorzugslageAutomatik() {
		return vorzugslageAutomatik;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVorzugslageAutomatik(Vorzugslage_Automatik_TypeClass newVorzugslageAutomatik, NotificationChain msgs) {
		Vorzugslage_Automatik_TypeClass oldVorzugslageAutomatik = vorzugslageAutomatik;
		vorzugslageAutomatik = newVorzugslageAutomatik;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORZUGSLAGE_AUTOMATIK, oldVorzugslageAutomatik, newVorzugslageAutomatik);
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
	public void setVorzugslageAutomatik(Vorzugslage_Automatik_TypeClass newVorzugslageAutomatik) {
		if (newVorzugslageAutomatik != vorzugslageAutomatik) {
			NotificationChain msgs = null;
			if (vorzugslageAutomatik != null)
				msgs = ((InternalEObject)vorzugslageAutomatik).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORZUGSLAGE_AUTOMATIK, null, msgs);
			if (newVorzugslageAutomatik != null)
				msgs = ((InternalEObject)newVorzugslageAutomatik).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORZUGSLAGE_AUTOMATIK, null, msgs);
			msgs = basicSetVorzugslageAutomatik(newVorzugslageAutomatik, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORZUGSLAGE_AUTOMATIK, newVorzugslageAutomatik, newVorzugslageAutomatik));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Gsp_Stellart_TypeClass getWKrGspStellart() {
		return wKrGspStellart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWKrGspStellart(W_Kr_Gsp_Stellart_TypeClass newWKrGspStellart, NotificationChain msgs) {
		W_Kr_Gsp_Stellart_TypeClass oldWKrGspStellart = wKrGspStellart;
		wKrGspStellart = newWKrGspStellart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__WKR_GSP_STELLART, oldWKrGspStellart, newWKrGspStellart);
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
	public void setWKrGspStellart(W_Kr_Gsp_Stellart_TypeClass newWKrGspStellart) {
		if (newWKrGspStellart != wKrGspStellart) {
			NotificationChain msgs = null;
			if (wKrGspStellart != null)
				msgs = ((InternalEObject)wKrGspStellart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__WKR_GSP_STELLART, null, msgs);
			if (newWKrGspStellart != null)
				msgs = ((InternalEObject)newWKrGspStellart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__WKR_GSP_STELLART, null, msgs);
			msgs = basicSetWKrGspStellart(newWKrGspStellart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__WKR_GSP_STELLART, newWKrGspStellart, newWKrGspStellart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORZUGSLAGE_AUTOMATIK:
				return basicSetVorzugslageAutomatik(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__WKR_GSP_STELLART:
				return basicSetWKrGspStellart(null, msgs);
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
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORZUGSLAGE_AUTOMATIK:
				return getVorzugslageAutomatik();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__WKR_GSP_STELLART:
				return getWKrGspStellart();
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
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORZUGSLAGE_AUTOMATIK:
				setVorzugslageAutomatik((Vorzugslage_Automatik_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__WKR_GSP_STELLART:
				setWKrGspStellart((W_Kr_Gsp_Stellart_TypeClass)newValue);
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
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORZUGSLAGE_AUTOMATIK:
				setVorzugslageAutomatik((Vorzugslage_Automatik_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__WKR_GSP_STELLART:
				setWKrGspStellart((W_Kr_Gsp_Stellart_TypeClass)null);
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
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORZUGSLAGE_AUTOMATIK:
				return vorzugslageAutomatik != null;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT_ALLG_ATTRIBUTE_GROUP__WKR_GSP_STELLART:
				return wKrGspStellart != null;
		}
		return super.eIsSet(featureID);
	}

} //W_Kr_Gsp_Element_Allg_AttributeGroupImpl
