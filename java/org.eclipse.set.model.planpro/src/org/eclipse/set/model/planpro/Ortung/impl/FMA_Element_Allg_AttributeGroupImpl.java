/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Ortung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Ortung.FMA_Element_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Ortung.FMA_Element_Art_TypeClass;
import org.eclipse.set.model.planpro.Ortung.FMA_Element_Seilanzahl_TypeClass;
import org.eclipse.set.model.planpro.Ortung.FMA_Element_Seiltyp_TypeClass;
import org.eclipse.set.model.planpro.Ortung.OrtungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMA Element Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_Element_Allg_AttributeGroupImpl#getFMAElementArt <em>FMA Element Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_Element_Allg_AttributeGroupImpl#getFMAElementSeilanzahl <em>FMA Element Seilanzahl</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_Element_Allg_AttributeGroupImpl#getFMAElementSeiltyp <em>FMA Element Seiltyp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMA_Element_Allg_AttributeGroupImpl extends EObjectImpl implements FMA_Element_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFMAElementArt() <em>FMA Element Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAElementArt()
	 * @generated
	 * @ordered
	 */
	protected FMA_Element_Art_TypeClass fMAElementArt;

	/**
	 * The cached value of the '{@link #getFMAElementSeilanzahl() <em>FMA Element Seilanzahl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAElementSeilanzahl()
	 * @generated
	 * @ordered
	 */
	protected FMA_Element_Seilanzahl_TypeClass fMAElementSeilanzahl;

	/**
	 * The cached value of the '{@link #getFMAElementSeiltyp() <em>FMA Element Seiltyp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAElementSeiltyp()
	 * @generated
	 * @ordered
	 */
	protected FMA_Element_Seiltyp_TypeClass fMAElementSeiltyp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMA_Element_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrtungPackage.Literals.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Element_Art_TypeClass getFMAElementArt() {
		return fMAElementArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAElementArt(FMA_Element_Art_TypeClass newFMAElementArt, NotificationChain msgs) {
		FMA_Element_Art_TypeClass oldFMAElementArt = fMAElementArt;
		fMAElementArt = newFMAElementArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_ART, oldFMAElementArt, newFMAElementArt);
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
	public void setFMAElementArt(FMA_Element_Art_TypeClass newFMAElementArt) {
		if (newFMAElementArt != fMAElementArt) {
			NotificationChain msgs = null;
			if (fMAElementArt != null)
				msgs = ((InternalEObject)fMAElementArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_ART, null, msgs);
			if (newFMAElementArt != null)
				msgs = ((InternalEObject)newFMAElementArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_ART, null, msgs);
			msgs = basicSetFMAElementArt(newFMAElementArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_ART, newFMAElementArt, newFMAElementArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Element_Seilanzahl_TypeClass getFMAElementSeilanzahl() {
		return fMAElementSeilanzahl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAElementSeilanzahl(FMA_Element_Seilanzahl_TypeClass newFMAElementSeilanzahl, NotificationChain msgs) {
		FMA_Element_Seilanzahl_TypeClass oldFMAElementSeilanzahl = fMAElementSeilanzahl;
		fMAElementSeilanzahl = newFMAElementSeilanzahl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILANZAHL, oldFMAElementSeilanzahl, newFMAElementSeilanzahl);
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
	public void setFMAElementSeilanzahl(FMA_Element_Seilanzahl_TypeClass newFMAElementSeilanzahl) {
		if (newFMAElementSeilanzahl != fMAElementSeilanzahl) {
			NotificationChain msgs = null;
			if (fMAElementSeilanzahl != null)
				msgs = ((InternalEObject)fMAElementSeilanzahl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILANZAHL, null, msgs);
			if (newFMAElementSeilanzahl != null)
				msgs = ((InternalEObject)newFMAElementSeilanzahl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILANZAHL, null, msgs);
			msgs = basicSetFMAElementSeilanzahl(newFMAElementSeilanzahl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILANZAHL, newFMAElementSeilanzahl, newFMAElementSeilanzahl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Element_Seiltyp_TypeClass getFMAElementSeiltyp() {
		return fMAElementSeiltyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAElementSeiltyp(FMA_Element_Seiltyp_TypeClass newFMAElementSeiltyp, NotificationChain msgs) {
		FMA_Element_Seiltyp_TypeClass oldFMAElementSeiltyp = fMAElementSeiltyp;
		fMAElementSeiltyp = newFMAElementSeiltyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILTYP, oldFMAElementSeiltyp, newFMAElementSeiltyp);
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
	public void setFMAElementSeiltyp(FMA_Element_Seiltyp_TypeClass newFMAElementSeiltyp) {
		if (newFMAElementSeiltyp != fMAElementSeiltyp) {
			NotificationChain msgs = null;
			if (fMAElementSeiltyp != null)
				msgs = ((InternalEObject)fMAElementSeiltyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILTYP, null, msgs);
			if (newFMAElementSeiltyp != null)
				msgs = ((InternalEObject)newFMAElementSeiltyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILTYP, null, msgs);
			msgs = basicSetFMAElementSeiltyp(newFMAElementSeiltyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILTYP, newFMAElementSeiltyp, newFMAElementSeiltyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_ART:
				return basicSetFMAElementArt(null, msgs);
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILANZAHL:
				return basicSetFMAElementSeilanzahl(null, msgs);
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILTYP:
				return basicSetFMAElementSeiltyp(null, msgs);
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
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_ART:
				return getFMAElementArt();
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILANZAHL:
				return getFMAElementSeilanzahl();
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILTYP:
				return getFMAElementSeiltyp();
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
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_ART:
				setFMAElementArt((FMA_Element_Art_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILANZAHL:
				setFMAElementSeilanzahl((FMA_Element_Seilanzahl_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILTYP:
				setFMAElementSeiltyp((FMA_Element_Seiltyp_TypeClass)newValue);
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
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_ART:
				setFMAElementArt((FMA_Element_Art_TypeClass)null);
				return;
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILANZAHL:
				setFMAElementSeilanzahl((FMA_Element_Seilanzahl_TypeClass)null);
				return;
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILTYP:
				setFMAElementSeiltyp((FMA_Element_Seiltyp_TypeClass)null);
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
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_ART:
				return fMAElementArt != null;
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILANZAHL:
				return fMAElementSeilanzahl != null;
			case OrtungPackage.FMA_ELEMENT_ALLG_ATTRIBUTE_GROUP__FMA_ELEMENT_SEILTYP:
				return fMAElementSeiltyp != null;
		}
		return super.eIsSet(featureID);
	}

} //FMA_Element_Allg_AttributeGroupImpl
