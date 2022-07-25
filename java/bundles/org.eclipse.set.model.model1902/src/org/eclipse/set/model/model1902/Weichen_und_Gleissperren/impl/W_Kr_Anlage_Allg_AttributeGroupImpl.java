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

import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Isolierfall_TypeClass;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Art_TypeClass;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Grundform_TypeClass;
import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WKr Anlage Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.W_Kr_Anlage_Allg_AttributeGroupImpl#getIsolierfall <em>Isolierfall</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.W_Kr_Anlage_Allg_AttributeGroupImpl#getWKrArt <em>WKr Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.W_Kr_Anlage_Allg_AttributeGroupImpl#getWKrGrundform <em>WKr Grundform</em>}</li>
 * </ul>
 *
 * @generated
 */
public class W_Kr_Anlage_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements W_Kr_Anlage_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIsolierfall() <em>Isolierfall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolierfall()
	 * @generated
	 * @ordered
	 */
	protected Isolierfall_TypeClass isolierfall;

	/**
	 * The cached value of the '{@link #getWKrArt() <em>WKr Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWKrArt()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Art_TypeClass wKrArt;

	/**
	 * The cached value of the '{@link #getWKrGrundform() <em>WKr Grundform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWKrGrundform()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Grundform_TypeClass wKrGrundform;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected W_Kr_Anlage_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Weichen_und_GleissperrenPackage.Literals.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Isolierfall_TypeClass getIsolierfall() {
		return isolierfall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsolierfall(Isolierfall_TypeClass newIsolierfall, NotificationChain msgs) {
		Isolierfall_TypeClass oldIsolierfall = isolierfall;
		isolierfall = newIsolierfall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__ISOLIERFALL, oldIsolierfall, newIsolierfall);
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
	public void setIsolierfall(Isolierfall_TypeClass newIsolierfall) {
		if (newIsolierfall != isolierfall) {
			NotificationChain msgs = null;
			if (isolierfall != null)
				msgs = ((InternalEObject)isolierfall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__ISOLIERFALL, null, msgs);
			if (newIsolierfall != null)
				msgs = ((InternalEObject)newIsolierfall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__ISOLIERFALL, null, msgs);
			msgs = basicSetIsolierfall(newIsolierfall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__ISOLIERFALL, newIsolierfall, newIsolierfall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Art_TypeClass getWKrArt() {
		return wKrArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWKrArt(W_Kr_Art_TypeClass newWKrArt, NotificationChain msgs) {
		W_Kr_Art_TypeClass oldWKrArt = wKrArt;
		wKrArt = newWKrArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_ART, oldWKrArt, newWKrArt);
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
	public void setWKrArt(W_Kr_Art_TypeClass newWKrArt) {
		if (newWKrArt != wKrArt) {
			NotificationChain msgs = null;
			if (wKrArt != null)
				msgs = ((InternalEObject)wKrArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_ART, null, msgs);
			if (newWKrArt != null)
				msgs = ((InternalEObject)newWKrArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_ART, null, msgs);
			msgs = basicSetWKrArt(newWKrArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_ART, newWKrArt, newWKrArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Grundform_TypeClass getWKrGrundform() {
		return wKrGrundform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWKrGrundform(W_Kr_Grundform_TypeClass newWKrGrundform, NotificationChain msgs) {
		W_Kr_Grundform_TypeClass oldWKrGrundform = wKrGrundform;
		wKrGrundform = newWKrGrundform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_GRUNDFORM, oldWKrGrundform, newWKrGrundform);
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
	public void setWKrGrundform(W_Kr_Grundform_TypeClass newWKrGrundform) {
		if (newWKrGrundform != wKrGrundform) {
			NotificationChain msgs = null;
			if (wKrGrundform != null)
				msgs = ((InternalEObject)wKrGrundform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_GRUNDFORM, null, msgs);
			if (newWKrGrundform != null)
				msgs = ((InternalEObject)newWKrGrundform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_GRUNDFORM, null, msgs);
			msgs = basicSetWKrGrundform(newWKrGrundform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_GRUNDFORM, newWKrGrundform, newWKrGrundform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__ISOLIERFALL:
				return basicSetIsolierfall(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_ART:
				return basicSetWKrArt(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_GRUNDFORM:
				return basicSetWKrGrundform(null, msgs);
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
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__ISOLIERFALL:
				return getIsolierfall();
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_ART:
				return getWKrArt();
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_GRUNDFORM:
				return getWKrGrundform();
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
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__ISOLIERFALL:
				setIsolierfall((Isolierfall_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_ART:
				setWKrArt((W_Kr_Art_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_GRUNDFORM:
				setWKrGrundform((W_Kr_Grundform_TypeClass)newValue);
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
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__ISOLIERFALL:
				setIsolierfall((Isolierfall_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_ART:
				setWKrArt((W_Kr_Art_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_GRUNDFORM:
				setWKrGrundform((W_Kr_Grundform_TypeClass)null);
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
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__ISOLIERFALL:
				return isolierfall != null;
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_ART:
				return wKrArt != null;
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE_ALLG_ATTRIBUTE_GROUP__WKR_GRUNDFORM:
				return wKrGrundform != null;
		}
		return super.eIsSet(featureID);
	}

} //W_Kr_Anlage_Allg_AttributeGroupImpl
