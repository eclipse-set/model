/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup;
import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;

import org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Oberflaeche Anhaenge Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl#getIDAnhangMonitoraufteilung <em>ID Anhang Monitoraufteilung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl#getIDAnhangRichtungssinn <em>ID Anhang Richtungssinn</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.impl.Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl#getIDAnhangVorgabeBELU <em>ID Anhang Vorgabe BELU</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl extends EObjectImpl implements Bedien_Oberflaeche_Anhaenge_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDAnhangMonitoraufteilung() <em>ID Anhang Monitoraufteilung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangMonitoraufteilung()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangMonitoraufteilung;

	/**
	 * The cached value of the '{@link #getIDAnhangRichtungssinn() <em>ID Anhang Richtungssinn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangRichtungssinn()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangRichtungssinn;

	/**
	 * The cached value of the '{@link #getIDAnhangVorgabeBELU() <em>ID Anhang Vorgabe BELU</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangVorgabeBELU()
	 * @generated
	 * @ordered
	 */
	protected ID_Anhang_TypeClass iDAnhangVorgabeBELU;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass getIDAnhangMonitoraufteilung() {
		return iDAnhangMonitoraufteilung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangMonitoraufteilung(ID_Anhang_TypeClass newIDAnhangMonitoraufteilung, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangMonitoraufteilung = iDAnhangMonitoraufteilung;
		iDAnhangMonitoraufteilung = newIDAnhangMonitoraufteilung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG, oldIDAnhangMonitoraufteilung, newIDAnhangMonitoraufteilung);
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
	public void setIDAnhangMonitoraufteilung(ID_Anhang_TypeClass newIDAnhangMonitoraufteilung) {
		if (newIDAnhangMonitoraufteilung != iDAnhangMonitoraufteilung) {
			NotificationChain msgs = null;
			if (iDAnhangMonitoraufteilung != null)
				msgs = ((InternalEObject)iDAnhangMonitoraufteilung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG, null, msgs);
			if (newIDAnhangMonitoraufteilung != null)
				msgs = ((InternalEObject)newIDAnhangMonitoraufteilung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG, null, msgs);
			msgs = basicSetIDAnhangMonitoraufteilung(newIDAnhangMonitoraufteilung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG, newIDAnhangMonitoraufteilung, newIDAnhangMonitoraufteilung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass getIDAnhangRichtungssinn() {
		return iDAnhangRichtungssinn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangRichtungssinn(ID_Anhang_TypeClass newIDAnhangRichtungssinn, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangRichtungssinn = iDAnhangRichtungssinn;
		iDAnhangRichtungssinn = newIDAnhangRichtungssinn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN, oldIDAnhangRichtungssinn, newIDAnhangRichtungssinn);
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
	public void setIDAnhangRichtungssinn(ID_Anhang_TypeClass newIDAnhangRichtungssinn) {
		if (newIDAnhangRichtungssinn != iDAnhangRichtungssinn) {
			NotificationChain msgs = null;
			if (iDAnhangRichtungssinn != null)
				msgs = ((InternalEObject)iDAnhangRichtungssinn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN, null, msgs);
			if (newIDAnhangRichtungssinn != null)
				msgs = ((InternalEObject)newIDAnhangRichtungssinn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN, null, msgs);
			msgs = basicSetIDAnhangRichtungssinn(newIDAnhangRichtungssinn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN, newIDAnhangRichtungssinn, newIDAnhangRichtungssinn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Anhang_TypeClass getIDAnhangVorgabeBELU() {
		return iDAnhangVorgabeBELU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDAnhangVorgabeBELU(ID_Anhang_TypeClass newIDAnhangVorgabeBELU, NotificationChain msgs) {
		ID_Anhang_TypeClass oldIDAnhangVorgabeBELU = iDAnhangVorgabeBELU;
		iDAnhangVorgabeBELU = newIDAnhangVorgabeBELU;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU, oldIDAnhangVorgabeBELU, newIDAnhangVorgabeBELU);
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
	public void setIDAnhangVorgabeBELU(ID_Anhang_TypeClass newIDAnhangVorgabeBELU) {
		if (newIDAnhangVorgabeBELU != iDAnhangVorgabeBELU) {
			NotificationChain msgs = null;
			if (iDAnhangVorgabeBELU != null)
				msgs = ((InternalEObject)iDAnhangVorgabeBELU).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU, null, msgs);
			if (newIDAnhangVorgabeBELU != null)
				msgs = ((InternalEObject)newIDAnhangVorgabeBELU).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU, null, msgs);
			msgs = basicSetIDAnhangVorgabeBELU(newIDAnhangVorgabeBELU, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU, newIDAnhangVorgabeBELU, newIDAnhangVorgabeBELU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG:
				return basicSetIDAnhangMonitoraufteilung(null, msgs);
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN:
				return basicSetIDAnhangRichtungssinn(null, msgs);
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU:
				return basicSetIDAnhangVorgabeBELU(null, msgs);
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG:
				return getIDAnhangMonitoraufteilung();
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN:
				return getIDAnhangRichtungssinn();
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU:
				return getIDAnhangVorgabeBELU();
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG:
				setIDAnhangMonitoraufteilung((ID_Anhang_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN:
				setIDAnhangRichtungssinn((ID_Anhang_TypeClass)newValue);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU:
				setIDAnhangVorgabeBELU((ID_Anhang_TypeClass)newValue);
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG:
				setIDAnhangMonitoraufteilung((ID_Anhang_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN:
				setIDAnhangRichtungssinn((ID_Anhang_TypeClass)null);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU:
				setIDAnhangVorgabeBELU((ID_Anhang_TypeClass)null);
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG:
				return iDAnhangMonitoraufteilung != null;
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN:
				return iDAnhangRichtungssinn != null;
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU:
				return iDAnhangVorgabeBELU != null;
		}
		return super.eIsSet(featureID);
	}

} //Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl
