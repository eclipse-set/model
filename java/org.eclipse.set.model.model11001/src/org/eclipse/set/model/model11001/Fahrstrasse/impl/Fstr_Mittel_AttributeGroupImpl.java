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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Mittel_Art_TypeClass;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Mittel_AttributeGroup;
import org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Mittel_V_Aufwertung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Mittel Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.impl.Fstr_Mittel_AttributeGroupImpl#getFstrMittelArt <em>Fstr Mittel Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.impl.Fstr_Mittel_AttributeGroupImpl#getFstrMittelVAufwertung <em>Fstr Mittel VAufwertung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_Mittel_AttributeGroupImpl extends EObjectImpl implements Fstr_Mittel_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFstrMittelArt() <em>Fstr Mittel Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrMittelArt()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Mittel_Art_TypeClass fstrMittelArt;

	/**
	 * The cached value of the '{@link #getFstrMittelVAufwertung() <em>Fstr Mittel VAufwertung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrMittelVAufwertung()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Mittel_V_Aufwertung_TypeClass fstrMittelVAufwertung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_Mittel_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_MITTEL_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Mittel_Art_TypeClass getFstrMittelArt() {
		return fstrMittelArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrMittelArt(Fstr_Mittel_Art_TypeClass newFstrMittelArt, NotificationChain msgs) {
		Fstr_Mittel_Art_TypeClass oldFstrMittelArt = fstrMittelArt;
		fstrMittelArt = newFstrMittelArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_ART, oldFstrMittelArt, newFstrMittelArt);
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
	public void setFstrMittelArt(Fstr_Mittel_Art_TypeClass newFstrMittelArt) {
		if (newFstrMittelArt != fstrMittelArt) {
			NotificationChain msgs = null;
			if (fstrMittelArt != null)
				msgs = ((InternalEObject)fstrMittelArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_ART, null, msgs);
			if (newFstrMittelArt != null)
				msgs = ((InternalEObject)newFstrMittelArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_ART, null, msgs);
			msgs = basicSetFstrMittelArt(newFstrMittelArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_ART, newFstrMittelArt, newFstrMittelArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Mittel_V_Aufwertung_TypeClass getFstrMittelVAufwertung() {
		return fstrMittelVAufwertung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrMittelVAufwertung(Fstr_Mittel_V_Aufwertung_TypeClass newFstrMittelVAufwertung, NotificationChain msgs) {
		Fstr_Mittel_V_Aufwertung_TypeClass oldFstrMittelVAufwertung = fstrMittelVAufwertung;
		fstrMittelVAufwertung = newFstrMittelVAufwertung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_VAUFWERTUNG, oldFstrMittelVAufwertung, newFstrMittelVAufwertung);
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
	public void setFstrMittelVAufwertung(Fstr_Mittel_V_Aufwertung_TypeClass newFstrMittelVAufwertung) {
		if (newFstrMittelVAufwertung != fstrMittelVAufwertung) {
			NotificationChain msgs = null;
			if (fstrMittelVAufwertung != null)
				msgs = ((InternalEObject)fstrMittelVAufwertung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_VAUFWERTUNG, null, msgs);
			if (newFstrMittelVAufwertung != null)
				msgs = ((InternalEObject)newFstrMittelVAufwertung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_VAUFWERTUNG, null, msgs);
			msgs = basicSetFstrMittelVAufwertung(newFstrMittelVAufwertung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_VAUFWERTUNG, newFstrMittelVAufwertung, newFstrMittelVAufwertung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_ART:
				return basicSetFstrMittelArt(null, msgs);
			case FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_VAUFWERTUNG:
				return basicSetFstrMittelVAufwertung(null, msgs);
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
			case FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_ART:
				return getFstrMittelArt();
			case FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_VAUFWERTUNG:
				return getFstrMittelVAufwertung();
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
			case FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_ART:
				setFstrMittelArt((Fstr_Mittel_Art_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_VAUFWERTUNG:
				setFstrMittelVAufwertung((Fstr_Mittel_V_Aufwertung_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_ART:
				setFstrMittelArt((Fstr_Mittel_Art_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_VAUFWERTUNG:
				setFstrMittelVAufwertung((Fstr_Mittel_V_Aufwertung_TypeClass)null);
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
			case FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_ART:
				return fstrMittelArt != null;
			case FahrstrassePackage.FSTR_MITTEL_ATTRIBUTE_GROUP__FSTR_MITTEL_VAUFWERTUNG:
				return fstrMittelVAufwertung != null;
		}
		return super.eIsSet(featureID);
	}

} //Fstr_Mittel_AttributeGroupImpl
