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

import org.eclipse.set.model.planpro.Ortung.FMA_Anschluss_Bezeichnung_TypeClass;
import org.eclipse.set.model.planpro.Ortung.FMA_Anschluss_Speiserichtung_TypeClass;
import org.eclipse.set.model.planpro.Ortung.FMA_Element_Anschluss_AttributeGroup;
import org.eclipse.set.model.planpro.Ortung.OrtungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMA Element Anschluss Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_Element_Anschluss_AttributeGroupImpl#getFMAAnschlussBezeichnung <em>FMA Anschluss Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_Element_Anschluss_AttributeGroupImpl#getFMAAnschlussSpeiserichtung <em>FMA Anschluss Speiserichtung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMA_Element_Anschluss_AttributeGroupImpl extends EObjectImpl implements FMA_Element_Anschluss_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFMAAnschlussBezeichnung() <em>FMA Anschluss Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAAnschlussBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected FMA_Anschluss_Bezeichnung_TypeClass fMAAnschlussBezeichnung;

	/**
	 * The cached value of the '{@link #getFMAAnschlussSpeiserichtung() <em>FMA Anschluss Speiserichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAAnschlussSpeiserichtung()
	 * @generated
	 * @ordered
	 */
	protected FMA_Anschluss_Speiserichtung_TypeClass fMAAnschlussSpeiserichtung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMA_Element_Anschluss_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrtungPackage.Literals.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anschluss_Bezeichnung_TypeClass getFMAAnschlussBezeichnung() {
		return fMAAnschlussBezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAAnschlussBezeichnung(FMA_Anschluss_Bezeichnung_TypeClass newFMAAnschlussBezeichnung, NotificationChain msgs) {
		FMA_Anschluss_Bezeichnung_TypeClass oldFMAAnschlussBezeichnung = fMAAnschlussBezeichnung;
		fMAAnschlussBezeichnung = newFMAAnschlussBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_BEZEICHNUNG, oldFMAAnschlussBezeichnung, newFMAAnschlussBezeichnung);
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
	public void setFMAAnschlussBezeichnung(FMA_Anschluss_Bezeichnung_TypeClass newFMAAnschlussBezeichnung) {
		if (newFMAAnschlussBezeichnung != fMAAnschlussBezeichnung) {
			NotificationChain msgs = null;
			if (fMAAnschlussBezeichnung != null)
				msgs = ((InternalEObject)fMAAnschlussBezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_BEZEICHNUNG, null, msgs);
			if (newFMAAnschlussBezeichnung != null)
				msgs = ((InternalEObject)newFMAAnschlussBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_BEZEICHNUNG, null, msgs);
			msgs = basicSetFMAAnschlussBezeichnung(newFMAAnschlussBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_BEZEICHNUNG, newFMAAnschlussBezeichnung, newFMAAnschlussBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anschluss_Speiserichtung_TypeClass getFMAAnschlussSpeiserichtung() {
		return fMAAnschlussSpeiserichtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAAnschlussSpeiserichtung(FMA_Anschluss_Speiserichtung_TypeClass newFMAAnschlussSpeiserichtung, NotificationChain msgs) {
		FMA_Anschluss_Speiserichtung_TypeClass oldFMAAnschlussSpeiserichtung = fMAAnschlussSpeiserichtung;
		fMAAnschlussSpeiserichtung = newFMAAnschlussSpeiserichtung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_SPEISERICHTUNG, oldFMAAnschlussSpeiserichtung, newFMAAnschlussSpeiserichtung);
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
	public void setFMAAnschlussSpeiserichtung(FMA_Anschluss_Speiserichtung_TypeClass newFMAAnschlussSpeiserichtung) {
		if (newFMAAnschlussSpeiserichtung != fMAAnschlussSpeiserichtung) {
			NotificationChain msgs = null;
			if (fMAAnschlussSpeiserichtung != null)
				msgs = ((InternalEObject)fMAAnschlussSpeiserichtung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_SPEISERICHTUNG, null, msgs);
			if (newFMAAnschlussSpeiserichtung != null)
				msgs = ((InternalEObject)newFMAAnschlussSpeiserichtung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_SPEISERICHTUNG, null, msgs);
			msgs = basicSetFMAAnschlussSpeiserichtung(newFMAAnschlussSpeiserichtung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_SPEISERICHTUNG, newFMAAnschlussSpeiserichtung, newFMAAnschlussSpeiserichtung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_BEZEICHNUNG:
				return basicSetFMAAnschlussBezeichnung(null, msgs);
			case OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_SPEISERICHTUNG:
				return basicSetFMAAnschlussSpeiserichtung(null, msgs);
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
			case OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_BEZEICHNUNG:
				return getFMAAnschlussBezeichnung();
			case OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_SPEISERICHTUNG:
				return getFMAAnschlussSpeiserichtung();
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
			case OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_BEZEICHNUNG:
				setFMAAnschlussBezeichnung((FMA_Anschluss_Bezeichnung_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_SPEISERICHTUNG:
				setFMAAnschlussSpeiserichtung((FMA_Anschluss_Speiserichtung_TypeClass)newValue);
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
			case OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_BEZEICHNUNG:
				setFMAAnschlussBezeichnung((FMA_Anschluss_Bezeichnung_TypeClass)null);
				return;
			case OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_SPEISERICHTUNG:
				setFMAAnschlussSpeiserichtung((FMA_Anschluss_Speiserichtung_TypeClass)null);
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
			case OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_BEZEICHNUNG:
				return fMAAnschlussBezeichnung != null;
			case OrtungPackage.FMA_ELEMENT_ANSCHLUSS_ATTRIBUTE_GROUP__FMA_ANSCHLUSS_SPEISERICHTUNG:
				return fMAAnschlussSpeiserichtung != null;
		}
		return super.eIsSet(featureID);
	}

} //FMA_Element_Anschluss_AttributeGroupImpl
