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

import org.eclipse.set.model.planpro.Ortung.FMA_Anlage_Kaskade_AttributeGroup;
import org.eclipse.set.model.planpro.Ortung.FMA_Kaskade_Bezeichnung_TypeClass;
import org.eclipse.set.model.planpro.Ortung.FMA_Kaskade_Einzelauswertung_TypeClass;
import org.eclipse.set.model.planpro.Ortung.OrtungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMA Anlage Kaskade Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_Anlage_Kaskade_AttributeGroupImpl#getFMAKaskadeBezeichnung <em>FMA Kaskade Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Ortung.impl.FMA_Anlage_Kaskade_AttributeGroupImpl#getFMAKaskadeEinzelauswertung <em>FMA Kaskade Einzelauswertung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMA_Anlage_Kaskade_AttributeGroupImpl extends EObjectImpl implements FMA_Anlage_Kaskade_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFMAKaskadeBezeichnung() <em>FMA Kaskade Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAKaskadeBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected FMA_Kaskade_Bezeichnung_TypeClass fMAKaskadeBezeichnung;

	/**
	 * The cached value of the '{@link #getFMAKaskadeEinzelauswertung() <em>FMA Kaskade Einzelauswertung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAKaskadeEinzelauswertung()
	 * @generated
	 * @ordered
	 */
	protected FMA_Kaskade_Einzelauswertung_TypeClass fMAKaskadeEinzelauswertung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMA_Anlage_Kaskade_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrtungPackage.Literals.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Kaskade_Bezeichnung_TypeClass getFMAKaskadeBezeichnung() {
		return fMAKaskadeBezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAKaskadeBezeichnung(FMA_Kaskade_Bezeichnung_TypeClass newFMAKaskadeBezeichnung, NotificationChain msgs) {
		FMA_Kaskade_Bezeichnung_TypeClass oldFMAKaskadeBezeichnung = fMAKaskadeBezeichnung;
		fMAKaskadeBezeichnung = newFMAKaskadeBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_BEZEICHNUNG, oldFMAKaskadeBezeichnung, newFMAKaskadeBezeichnung);
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
	public void setFMAKaskadeBezeichnung(FMA_Kaskade_Bezeichnung_TypeClass newFMAKaskadeBezeichnung) {
		if (newFMAKaskadeBezeichnung != fMAKaskadeBezeichnung) {
			NotificationChain msgs = null;
			if (fMAKaskadeBezeichnung != null)
				msgs = ((InternalEObject)fMAKaskadeBezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_BEZEICHNUNG, null, msgs);
			if (newFMAKaskadeBezeichnung != null)
				msgs = ((InternalEObject)newFMAKaskadeBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_BEZEICHNUNG, null, msgs);
			msgs = basicSetFMAKaskadeBezeichnung(newFMAKaskadeBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_BEZEICHNUNG, newFMAKaskadeBezeichnung, newFMAKaskadeBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Kaskade_Einzelauswertung_TypeClass getFMAKaskadeEinzelauswertung() {
		return fMAKaskadeEinzelauswertung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAKaskadeEinzelauswertung(FMA_Kaskade_Einzelauswertung_TypeClass newFMAKaskadeEinzelauswertung, NotificationChain msgs) {
		FMA_Kaskade_Einzelauswertung_TypeClass oldFMAKaskadeEinzelauswertung = fMAKaskadeEinzelauswertung;
		fMAKaskadeEinzelauswertung = newFMAKaskadeEinzelauswertung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_EINZELAUSWERTUNG, oldFMAKaskadeEinzelauswertung, newFMAKaskadeEinzelauswertung);
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
	public void setFMAKaskadeEinzelauswertung(FMA_Kaskade_Einzelauswertung_TypeClass newFMAKaskadeEinzelauswertung) {
		if (newFMAKaskadeEinzelauswertung != fMAKaskadeEinzelauswertung) {
			NotificationChain msgs = null;
			if (fMAKaskadeEinzelauswertung != null)
				msgs = ((InternalEObject)fMAKaskadeEinzelauswertung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_EINZELAUSWERTUNG, null, msgs);
			if (newFMAKaskadeEinzelauswertung != null)
				msgs = ((InternalEObject)newFMAKaskadeEinzelauswertung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_EINZELAUSWERTUNG, null, msgs);
			msgs = basicSetFMAKaskadeEinzelauswertung(newFMAKaskadeEinzelauswertung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_EINZELAUSWERTUNG, newFMAKaskadeEinzelauswertung, newFMAKaskadeEinzelauswertung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_BEZEICHNUNG:
				return basicSetFMAKaskadeBezeichnung(null, msgs);
			case OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_EINZELAUSWERTUNG:
				return basicSetFMAKaskadeEinzelauswertung(null, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_BEZEICHNUNG:
				return getFMAKaskadeBezeichnung();
			case OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_EINZELAUSWERTUNG:
				return getFMAKaskadeEinzelauswertung();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_BEZEICHNUNG:
				setFMAKaskadeBezeichnung((FMA_Kaskade_Bezeichnung_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_EINZELAUSWERTUNG:
				setFMAKaskadeEinzelauswertung((FMA_Kaskade_Einzelauswertung_TypeClass)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_BEZEICHNUNG:
				setFMAKaskadeBezeichnung((FMA_Kaskade_Bezeichnung_TypeClass)null);
				return;
			case OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_EINZELAUSWERTUNG:
				setFMAKaskadeEinzelauswertung((FMA_Kaskade_Einzelauswertung_TypeClass)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_BEZEICHNUNG:
				return fMAKaskadeBezeichnung != null;
			case OrtungPackage.FMA_ANLAGE_KASKADE_ATTRIBUTE_GROUP__FMA_KASKADE_EINZELAUSWERTUNG:
				return fMAKaskadeEinzelauswertung != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //FMA_Anlage_Kaskade_AttributeGroupImpl
