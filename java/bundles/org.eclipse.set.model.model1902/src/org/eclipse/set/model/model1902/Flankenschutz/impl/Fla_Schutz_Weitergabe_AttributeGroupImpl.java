/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Flankenschutz.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup;
import org.eclipse.set.model.model1902.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.model.model1902.Verweise.ID_Fla_Schutz_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fla Schutz Weitergabe Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Flankenschutz.impl.Fla_Schutz_Weitergabe_AttributeGroupImpl#getIDFlaWeitergabeL <em>ID Fla Weitergabe L</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Flankenschutz.impl.Fla_Schutz_Weitergabe_AttributeGroupImpl#getIDFlaWeitergabeR <em>ID Fla Weitergabe R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fla_Schutz_Weitergabe_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Fla_Schutz_Weitergabe_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDFlaWeitergabeL() <em>ID Fla Weitergabe L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFlaWeitergabeL()
	 * @generated
	 * @ordered
	 */
	protected ID_Fla_Schutz_TypeClass iDFlaWeitergabeL;

	/**
	 * The cached value of the '{@link #getIDFlaWeitergabeR() <em>ID Fla Weitergabe R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFlaWeitergabeR()
	 * @generated
	 * @ordered
	 */
	protected ID_Fla_Schutz_TypeClass iDFlaWeitergabeR;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fla_Schutz_Weitergabe_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlankenschutzPackage.Literals.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fla_Schutz_TypeClass getIDFlaWeitergabeL() {
		return iDFlaWeitergabeL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFlaWeitergabeL(ID_Fla_Schutz_TypeClass newIDFlaWeitergabeL, NotificationChain msgs) {
		ID_Fla_Schutz_TypeClass oldIDFlaWeitergabeL = iDFlaWeitergabeL;
		iDFlaWeitergabeL = newIDFlaWeitergabeL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L, oldIDFlaWeitergabeL, newIDFlaWeitergabeL);
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
	public void setIDFlaWeitergabeL(ID_Fla_Schutz_TypeClass newIDFlaWeitergabeL) {
		if (newIDFlaWeitergabeL != iDFlaWeitergabeL) {
			NotificationChain msgs = null;
			if (iDFlaWeitergabeL != null)
				msgs = ((InternalEObject)iDFlaWeitergabeL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L, null, msgs);
			if (newIDFlaWeitergabeL != null)
				msgs = ((InternalEObject)newIDFlaWeitergabeL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L, null, msgs);
			msgs = basicSetIDFlaWeitergabeL(newIDFlaWeitergabeL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L, newIDFlaWeitergabeL, newIDFlaWeitergabeL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Fla_Schutz_TypeClass getIDFlaWeitergabeR() {
		return iDFlaWeitergabeR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDFlaWeitergabeR(ID_Fla_Schutz_TypeClass newIDFlaWeitergabeR, NotificationChain msgs) {
		ID_Fla_Schutz_TypeClass oldIDFlaWeitergabeR = iDFlaWeitergabeR;
		iDFlaWeitergabeR = newIDFlaWeitergabeR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R, oldIDFlaWeitergabeR, newIDFlaWeitergabeR);
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
	public void setIDFlaWeitergabeR(ID_Fla_Schutz_TypeClass newIDFlaWeitergabeR) {
		if (newIDFlaWeitergabeR != iDFlaWeitergabeR) {
			NotificationChain msgs = null;
			if (iDFlaWeitergabeR != null)
				msgs = ((InternalEObject)iDFlaWeitergabeR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R, null, msgs);
			if (newIDFlaWeitergabeR != null)
				msgs = ((InternalEObject)newIDFlaWeitergabeR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R, null, msgs);
			msgs = basicSetIDFlaWeitergabeR(newIDFlaWeitergabeR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R, newIDFlaWeitergabeR, newIDFlaWeitergabeR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L:
				return basicSetIDFlaWeitergabeL(null, msgs);
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R:
				return basicSetIDFlaWeitergabeR(null, msgs);
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
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L:
				return getIDFlaWeitergabeL();
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R:
				return getIDFlaWeitergabeR();
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
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L:
				setIDFlaWeitergabeL((ID_Fla_Schutz_TypeClass)newValue);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R:
				setIDFlaWeitergabeR((ID_Fla_Schutz_TypeClass)newValue);
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
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L:
				setIDFlaWeitergabeL((ID_Fla_Schutz_TypeClass)null);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R:
				setIDFlaWeitergabeR((ID_Fla_Schutz_TypeClass)null);
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
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L:
				return iDFlaWeitergabeL != null;
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R:
				return iDFlaWeitergabeR != null;
		}
		return super.eIsSet(featureID);
	}

} //Fla_Schutz_Weitergabe_AttributeGroupImpl
