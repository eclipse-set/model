/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model11001.Fahrstrasse.Element_Verschluss_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_DWeg_W_Kr;

import org.eclipse.set.model.model11001.Verweise.ID_Fstr_DWeg_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_W_Kr_Gsp_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr DWeg WKr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.impl.Fstr_DWeg_W_KrImpl#getElementVerschluss <em>Element Verschluss</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.impl.Fstr_DWeg_W_KrImpl#getIDFstrDWeg <em>ID Fstr DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.impl.Fstr_DWeg_W_KrImpl#getIDWKrGspElement <em>IDW Kr Gsp Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_DWeg_W_KrImpl extends Basis_ObjektImpl implements Fstr_DWeg_W_Kr {
	/**
	 * The cached value of the '{@link #getElementVerschluss() <em>Element Verschluss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementVerschluss()
	 * @generated
	 * @ordered
	 */
	protected Element_Verschluss_TypeClass elementVerschluss;

	/**
	 * The cached value of the '{@link #getIDFstrDWeg() <em>ID Fstr DWeg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrDWeg()
	 * @generated
	 * @ordered
	 */
	protected ID_Fstr_DWeg_TypeClass iDFstrDWeg;

	/**
	 * The cached value of the '{@link #getIDWKrGspElement() <em>IDW Kr Gsp Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDWKrGspElement()
	 * @generated
	 * @ordered
	 */
	protected ID_W_Kr_Gsp_Element_TypeClass iDWKrGspElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_DWeg_W_KrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_DWEG_WKR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element_Verschluss_TypeClass getElementVerschluss() {
		return elementVerschluss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementVerschluss(Element_Verschluss_TypeClass newElementVerschluss, NotificationChain msgs) {
		Element_Verschluss_TypeClass oldElementVerschluss = elementVerschluss;
		elementVerschluss = newElementVerschluss;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS, oldElementVerschluss, newElementVerschluss);
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
	public void setElementVerschluss(Element_Verschluss_TypeClass newElementVerschluss) {
		if (newElementVerschluss != elementVerschluss) {
			NotificationChain msgs = null;
			if (elementVerschluss != null)
				msgs = ((InternalEObject)elementVerschluss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS, null, msgs);
			if (newElementVerschluss != null)
				msgs = ((InternalEObject)newElementVerschluss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS, null, msgs);
			msgs = basicSetElementVerschluss(newElementVerschluss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS, newElementVerschluss, newElementVerschluss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fstr_DWeg_TypeClass getIDFstrDWeg() {
		return iDFstrDWeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFstrDWeg(ID_Fstr_DWeg_TypeClass newIDFstrDWeg, NotificationChain msgs) {
		ID_Fstr_DWeg_TypeClass oldIDFstrDWeg = iDFstrDWeg;
		iDFstrDWeg = newIDFstrDWeg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_WKR__ID_FSTR_DWEG, oldIDFstrDWeg, newIDFstrDWeg);
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
	public void setIDFstrDWeg(ID_Fstr_DWeg_TypeClass newIDFstrDWeg) {
		if (newIDFstrDWeg != iDFstrDWeg) {
			NotificationChain msgs = null;
			if (iDFstrDWeg != null)
				msgs = ((InternalEObject)iDFstrDWeg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_WKR__ID_FSTR_DWEG, null, msgs);
			if (newIDFstrDWeg != null)
				msgs = ((InternalEObject)newIDFstrDWeg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_WKR__ID_FSTR_DWEG, null, msgs);
			msgs = basicSetIDFstrDWeg(newIDFstrDWeg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_WKR__ID_FSTR_DWEG, newIDFstrDWeg, newIDFstrDWeg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_W_Kr_Gsp_Element_TypeClass getIDWKrGspElement() {
		return iDWKrGspElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDWKrGspElement(ID_W_Kr_Gsp_Element_TypeClass newIDWKrGspElement, NotificationChain msgs) {
		ID_W_Kr_Gsp_Element_TypeClass oldIDWKrGspElement = iDWKrGspElement;
		iDWKrGspElement = newIDWKrGspElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT, oldIDWKrGspElement, newIDWKrGspElement);
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
	public void setIDWKrGspElement(ID_W_Kr_Gsp_Element_TypeClass newIDWKrGspElement) {
		if (newIDWKrGspElement != iDWKrGspElement) {
			NotificationChain msgs = null;
			if (iDWKrGspElement != null)
				msgs = ((InternalEObject)iDWKrGspElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT, null, msgs);
			if (newIDWKrGspElement != null)
				msgs = ((InternalEObject)newIDWKrGspElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT, null, msgs);
			msgs = basicSetIDWKrGspElement(newIDWKrGspElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT, newIDWKrGspElement, newIDWKrGspElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS:
				return basicSetElementVerschluss(null, msgs);
			case FahrstrassePackage.FSTR_DWEG_WKR__ID_FSTR_DWEG:
				return basicSetIDFstrDWeg(null, msgs);
			case FahrstrassePackage.FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT:
				return basicSetIDWKrGspElement(null, msgs);
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
			case FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS:
				return getElementVerschluss();
			case FahrstrassePackage.FSTR_DWEG_WKR__ID_FSTR_DWEG:
				return getIDFstrDWeg();
			case FahrstrassePackage.FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT:
				return getIDWKrGspElement();
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
			case FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS:
				setElementVerschluss((Element_Verschluss_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG_WKR__ID_FSTR_DWEG:
				setIDFstrDWeg((ID_Fstr_DWeg_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT:
				setIDWKrGspElement((ID_W_Kr_Gsp_Element_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS:
				setElementVerschluss((Element_Verschluss_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_DWEG_WKR__ID_FSTR_DWEG:
				setIDFstrDWeg((ID_Fstr_DWeg_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT:
				setIDWKrGspElement((ID_W_Kr_Gsp_Element_TypeClass)null);
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
			case FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS:
				return elementVerschluss != null;
			case FahrstrassePackage.FSTR_DWEG_WKR__ID_FSTR_DWEG:
				return iDFstrDWeg != null;
			case FahrstrassePackage.FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT:
				return iDWKrGspElement != null;
		}
		return super.eIsSet(featureID);
	}

} //Fstr_DWeg_W_KrImpl
