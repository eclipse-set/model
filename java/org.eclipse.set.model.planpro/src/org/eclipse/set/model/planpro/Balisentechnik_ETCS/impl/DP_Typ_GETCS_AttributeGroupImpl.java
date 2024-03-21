/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_ATO_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_ETCS_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GETCS_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Verkuerzter_Abstand_TypeClass;

import org.eclipse.set.model.planpro.Verweise.ID_DP_Bezug_Funktional_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DP Typ GETCS Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DP_Typ_GETCS_AttributeGroupImpl#getDPATO <em>DPATO</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DP_Typ_GETCS_AttributeGroupImpl#getDPTypETCS <em>DP Typ ETCS</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DP_Typ_GETCS_AttributeGroupImpl#getIDDPBezugFunktional <em>IDDP Bezug Funktional</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DP_Typ_GETCS_AttributeGroupImpl#getVerkuerzterAbstand <em>Verkuerzter Abstand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DP_Typ_GETCS_AttributeGroupImpl extends EObjectImpl implements DP_Typ_GETCS_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDPATO() <em>DPATO</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPATO()
	 * @generated
	 * @ordered
	 */
	protected DP_ATO_TypeClass dPATO;

	/**
	 * The cached value of the '{@link #getDPTypETCS() <em>DP Typ ETCS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTypETCS()
	 * @generated
	 * @ordered
	 */
	protected DP_Typ_ETCS_TypeClass dPTypETCS;

	/**
	 * The cached value of the '{@link #getIDDPBezugFunktional() <em>IDDP Bezug Funktional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDDPBezugFunktional()
	 * @generated
	 * @ordered
	 */
	protected ID_DP_Bezug_Funktional_TypeClass iDDPBezugFunktional;

	/**
	 * The cached value of the '{@link #getVerkuerzterAbstand() <em>Verkuerzter Abstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerkuerzterAbstand()
	 * @generated
	 * @ordered
	 */
	protected Verkuerzter_Abstand_TypeClass verkuerzterAbstand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DP_Typ_GETCS_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDP_Typ_GETCS_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_ATO_TypeClass getDPATO() {
		return dPATO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPATO(DP_ATO_TypeClass newDPATO, NotificationChain msgs) {
		DP_ATO_TypeClass oldDPATO = dPATO;
		dPATO = newDPATO;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DPATO, oldDPATO, newDPATO);
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
	public void setDPATO(DP_ATO_TypeClass newDPATO) {
		if (newDPATO != dPATO) {
			NotificationChain msgs = null;
			if (dPATO != null)
				msgs = ((InternalEObject)dPATO).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DPATO, null, msgs);
			if (newDPATO != null)
				msgs = ((InternalEObject)newDPATO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DPATO, null, msgs);
			msgs = basicSetDPATO(newDPATO, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DPATO, newDPATO, newDPATO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_ETCS_TypeClass getDPTypETCS() {
		return dPTypETCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPTypETCS(DP_Typ_ETCS_TypeClass newDPTypETCS, NotificationChain msgs) {
		DP_Typ_ETCS_TypeClass oldDPTypETCS = dPTypETCS;
		dPTypETCS = newDPTypETCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DP_TYP_ETCS, oldDPTypETCS, newDPTypETCS);
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
	public void setDPTypETCS(DP_Typ_ETCS_TypeClass newDPTypETCS) {
		if (newDPTypETCS != dPTypETCS) {
			NotificationChain msgs = null;
			if (dPTypETCS != null)
				msgs = ((InternalEObject)dPTypETCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DP_TYP_ETCS, null, msgs);
			if (newDPTypETCS != null)
				msgs = ((InternalEObject)newDPTypETCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DP_TYP_ETCS, null, msgs);
			msgs = basicSetDPTypETCS(newDPTypETCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DP_TYP_ETCS, newDPTypETCS, newDPTypETCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_DP_Bezug_Funktional_TypeClass getIDDPBezugFunktional() {
		return iDDPBezugFunktional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDDPBezugFunktional(ID_DP_Bezug_Funktional_TypeClass newIDDPBezugFunktional, NotificationChain msgs) {
		ID_DP_Bezug_Funktional_TypeClass oldIDDPBezugFunktional = iDDPBezugFunktional;
		iDDPBezugFunktional = newIDDPBezugFunktional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__IDDP_BEZUG_FUNKTIONAL, oldIDDPBezugFunktional, newIDDPBezugFunktional);
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
	public void setIDDPBezugFunktional(ID_DP_Bezug_Funktional_TypeClass newIDDPBezugFunktional) {
		if (newIDDPBezugFunktional != iDDPBezugFunktional) {
			NotificationChain msgs = null;
			if (iDDPBezugFunktional != null)
				msgs = ((InternalEObject)iDDPBezugFunktional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__IDDP_BEZUG_FUNKTIONAL, null, msgs);
			if (newIDDPBezugFunktional != null)
				msgs = ((InternalEObject)newIDDPBezugFunktional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__IDDP_BEZUG_FUNKTIONAL, null, msgs);
			msgs = basicSetIDDPBezugFunktional(newIDDPBezugFunktional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__IDDP_BEZUG_FUNKTIONAL, newIDDPBezugFunktional, newIDDPBezugFunktional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verkuerzter_Abstand_TypeClass getVerkuerzterAbstand() {
		return verkuerzterAbstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerkuerzterAbstand(Verkuerzter_Abstand_TypeClass newVerkuerzterAbstand, NotificationChain msgs) {
		Verkuerzter_Abstand_TypeClass oldVerkuerzterAbstand = verkuerzterAbstand;
		verkuerzterAbstand = newVerkuerzterAbstand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__VERKUERZTER_ABSTAND, oldVerkuerzterAbstand, newVerkuerzterAbstand);
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
	public void setVerkuerzterAbstand(Verkuerzter_Abstand_TypeClass newVerkuerzterAbstand) {
		if (newVerkuerzterAbstand != verkuerzterAbstand) {
			NotificationChain msgs = null;
			if (verkuerzterAbstand != null)
				msgs = ((InternalEObject)verkuerzterAbstand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__VERKUERZTER_ABSTAND, null, msgs);
			if (newVerkuerzterAbstand != null)
				msgs = ((InternalEObject)newVerkuerzterAbstand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__VERKUERZTER_ABSTAND, null, msgs);
			msgs = basicSetVerkuerzterAbstand(newVerkuerzterAbstand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__VERKUERZTER_ABSTAND, newVerkuerzterAbstand, newVerkuerzterAbstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DPATO:
				return basicSetDPATO(null, msgs);
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DP_TYP_ETCS:
				return basicSetDPTypETCS(null, msgs);
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__IDDP_BEZUG_FUNKTIONAL:
				return basicSetIDDPBezugFunktional(null, msgs);
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__VERKUERZTER_ABSTAND:
				return basicSetVerkuerzterAbstand(null, msgs);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DPATO:
				return getDPATO();
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DP_TYP_ETCS:
				return getDPTypETCS();
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__IDDP_BEZUG_FUNKTIONAL:
				return getIDDPBezugFunktional();
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__VERKUERZTER_ABSTAND:
				return getVerkuerzterAbstand();
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
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DPATO:
				setDPATO((DP_ATO_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DP_TYP_ETCS:
				setDPTypETCS((DP_Typ_ETCS_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__IDDP_BEZUG_FUNKTIONAL:
				setIDDPBezugFunktional((ID_DP_Bezug_Funktional_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__VERKUERZTER_ABSTAND:
				setVerkuerzterAbstand((Verkuerzter_Abstand_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DPATO:
				setDPATO((DP_ATO_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DP_TYP_ETCS:
				setDPTypETCS((DP_Typ_ETCS_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__IDDP_BEZUG_FUNKTIONAL:
				setIDDPBezugFunktional((ID_DP_Bezug_Funktional_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__VERKUERZTER_ABSTAND:
				setVerkuerzterAbstand((Verkuerzter_Abstand_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DPATO:
				return dPATO != null;
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DP_TYP_ETCS:
				return dPTypETCS != null;
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__IDDP_BEZUG_FUNKTIONAL:
				return iDDPBezugFunktional != null;
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__VERKUERZTER_ABSTAND:
				return verkuerzterAbstand != null;
		}
		return super.eIsSet(featureID);
	}

} //DP_Typ_GETCS_AttributeGroupImpl
