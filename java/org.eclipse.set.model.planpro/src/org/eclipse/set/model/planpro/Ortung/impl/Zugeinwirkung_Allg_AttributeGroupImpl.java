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

import org.eclipse.set.model.planpro.Ortung.OrtungPackage;
import org.eclipse.set.model.planpro.Ortung.Zugeinwirkung_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Ortung.Zugeinwirkung_Art_TypeClass;
import org.eclipse.set.model.planpro.Ortung.Zugeinwirkung_Typ_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zugeinwirkung Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.Zugeinwirkung_Allg_AttributeGroupImpl#getZugeinwirkungArt <em>Zugeinwirkung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.Zugeinwirkung_Allg_AttributeGroupImpl#getZugeinwirkungTyp <em>Zugeinwirkung Typ</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Zugeinwirkung_Allg_AttributeGroupImpl extends EObjectImpl implements Zugeinwirkung_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getZugeinwirkungArt() <em>Zugeinwirkung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZugeinwirkungArt()
	 * @generated
	 * @ordered
	 */
	protected Zugeinwirkung_Art_TypeClass zugeinwirkungArt;

	/**
	 * The cached value of the '{@link #getZugeinwirkungTyp() <em>Zugeinwirkung Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZugeinwirkungTyp()
	 * @generated
	 * @ordered
	 */
	protected Zugeinwirkung_Typ_TypeClass zugeinwirkungTyp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Zugeinwirkung_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrtungPackage.Literals.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zugeinwirkung_Art_TypeClass getZugeinwirkungArt() {
		return zugeinwirkungArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZugeinwirkungArt(Zugeinwirkung_Art_TypeClass newZugeinwirkungArt, NotificationChain msgs) {
		Zugeinwirkung_Art_TypeClass oldZugeinwirkungArt = zugeinwirkungArt;
		zugeinwirkungArt = newZugeinwirkungArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_ART, oldZugeinwirkungArt, newZugeinwirkungArt);
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
	public void setZugeinwirkungArt(Zugeinwirkung_Art_TypeClass newZugeinwirkungArt) {
		if (newZugeinwirkungArt != zugeinwirkungArt) {
			NotificationChain msgs = null;
			if (zugeinwirkungArt != null)
				msgs = ((InternalEObject)zugeinwirkungArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_ART, null, msgs);
			if (newZugeinwirkungArt != null)
				msgs = ((InternalEObject)newZugeinwirkungArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_ART, null, msgs);
			msgs = basicSetZugeinwirkungArt(newZugeinwirkungArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_ART, newZugeinwirkungArt, newZugeinwirkungArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zugeinwirkung_Typ_TypeClass getZugeinwirkungTyp() {
		return zugeinwirkungTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZugeinwirkungTyp(Zugeinwirkung_Typ_TypeClass newZugeinwirkungTyp, NotificationChain msgs) {
		Zugeinwirkung_Typ_TypeClass oldZugeinwirkungTyp = zugeinwirkungTyp;
		zugeinwirkungTyp = newZugeinwirkungTyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_TYP, oldZugeinwirkungTyp, newZugeinwirkungTyp);
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
	public void setZugeinwirkungTyp(Zugeinwirkung_Typ_TypeClass newZugeinwirkungTyp) {
		if (newZugeinwirkungTyp != zugeinwirkungTyp) {
			NotificationChain msgs = null;
			if (zugeinwirkungTyp != null)
				msgs = ((InternalEObject)zugeinwirkungTyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_TYP, null, msgs);
			if (newZugeinwirkungTyp != null)
				msgs = ((InternalEObject)newZugeinwirkungTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_TYP, null, msgs);
			msgs = basicSetZugeinwirkungTyp(newZugeinwirkungTyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_TYP, newZugeinwirkungTyp, newZugeinwirkungTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_ART:
				return basicSetZugeinwirkungArt(null, msgs);
			case OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_TYP:
				return basicSetZugeinwirkungTyp(null, msgs);
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
			case OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_ART:
				return getZugeinwirkungArt();
			case OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_TYP:
				return getZugeinwirkungTyp();
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
			case OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_ART:
				setZugeinwirkungArt((Zugeinwirkung_Art_TypeClass)newValue);
				return;
			case OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_TYP:
				setZugeinwirkungTyp((Zugeinwirkung_Typ_TypeClass)newValue);
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
			case OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_ART:
				setZugeinwirkungArt((Zugeinwirkung_Art_TypeClass)null);
				return;
			case OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_TYP:
				setZugeinwirkungTyp((Zugeinwirkung_Typ_TypeClass)null);
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
			case OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_ART:
				return zugeinwirkungArt != null;
			case OrtungPackage.ZUGEINWIRKUNG_ALLG_ATTRIBUTE_GROUP__ZUGEINWIRKUNG_TYP:
				return zugeinwirkungTyp != null;
		}
		return super.eIsSet(featureID);
	}

} //Zugeinwirkung_Allg_AttributeGroupImpl
