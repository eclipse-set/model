/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Fahrstrasse.DWeg_Vorzug_TypeClass;
import org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup;

import org.eclipse.set.model.model1902.Verweise.ID_Fstr_DWeg_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Zug DWeg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.impl.Fstr_Zug_DWeg_AttributeGroupImpl#getDWegVorzug <em>DWeg Vorzug</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.impl.Fstr_Zug_DWeg_AttributeGroupImpl#getIDFstrDWeg <em>ID Fstr DWeg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_Zug_DWeg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Fstr_Zug_DWeg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDWegVorzug() <em>DWeg Vorzug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDWegVorzug()
	 * @generated
	 * @ordered
	 */
	protected DWeg_Vorzug_TypeClass dWegVorzug;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_Zug_DWeg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DWeg_Vorzug_TypeClass getDWegVorzug() {
		return dWegVorzug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDWegVorzug(DWeg_Vorzug_TypeClass newDWegVorzug, NotificationChain msgs) {
		DWeg_Vorzug_TypeClass oldDWegVorzug = dWegVorzug;
		dWegVorzug = newDWegVorzug;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__DWEG_VORZUG, oldDWegVorzug, newDWegVorzug);
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
	public void setDWegVorzug(DWeg_Vorzug_TypeClass newDWegVorzug) {
		if (newDWegVorzug != dWegVorzug) {
			NotificationChain msgs = null;
			if (dWegVorzug != null)
				msgs = ((InternalEObject)dWegVorzug).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__DWEG_VORZUG, null, msgs);
			if (newDWegVorzug != null)
				msgs = ((InternalEObject)newDWegVorzug).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__DWEG_VORZUG, null, msgs);
			msgs = basicSetDWegVorzug(newDWegVorzug, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__DWEG_VORZUG, newDWegVorzug, newDWegVorzug));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__ID_FSTR_DWEG, oldIDFstrDWeg, newIDFstrDWeg);
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
				msgs = ((InternalEObject)iDFstrDWeg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__ID_FSTR_DWEG, null, msgs);
			if (newIDFstrDWeg != null)
				msgs = ((InternalEObject)newIDFstrDWeg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__ID_FSTR_DWEG, null, msgs);
			msgs = basicSetIDFstrDWeg(newIDFstrDWeg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__ID_FSTR_DWEG, newIDFstrDWeg, newIDFstrDWeg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__DWEG_VORZUG:
				return basicSetDWegVorzug(null, msgs);
			case FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__ID_FSTR_DWEG:
				return basicSetIDFstrDWeg(null, msgs);
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
			case FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__DWEG_VORZUG:
				return getDWegVorzug();
			case FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__ID_FSTR_DWEG:
				return getIDFstrDWeg();
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
			case FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__DWEG_VORZUG:
				setDWegVorzug((DWeg_Vorzug_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__ID_FSTR_DWEG:
				setIDFstrDWeg((ID_Fstr_DWeg_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__DWEG_VORZUG:
				setDWegVorzug((DWeg_Vorzug_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__ID_FSTR_DWEG:
				setIDFstrDWeg((ID_Fstr_DWeg_TypeClass)null);
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
			case FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__DWEG_VORZUG:
				return dWegVorzug != null;
			case FahrstrassePackage.FSTR_ZUG_DWEG_ATTRIBUTE_GROUP__ID_FSTR_DWEG:
				return iDFstrDWeg != null;
		}
		return super.eIsSet(featureID);
	}

} //Fstr_Zug_DWeg_AttributeGroupImpl
