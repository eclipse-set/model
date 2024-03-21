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
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Laenge_Soll_Mind_150_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Massgebende_Neigung_Mind_150_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.V_Frei_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Schutzstrecke_Allg_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZBS Schutzstrecke Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZBS_Schutzstrecke_Allg_AttributeGroupImpl#getLaengeSollMind150 <em>Laenge Soll Mind150</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZBS_Schutzstrecke_Allg_AttributeGroupImpl#getMassgebendeNeigungMind150 <em>Massgebende Neigung Mind150</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.ZBS_Schutzstrecke_Allg_AttributeGroupImpl#getVFrei <em>VFrei</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZBS_Schutzstrecke_Allg_AttributeGroupImpl extends EObjectImpl implements ZBS_Schutzstrecke_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getLaengeSollMind150() <em>Laenge Soll Mind150</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaengeSollMind150()
	 * @generated
	 * @ordered
	 */
	protected Laenge_Soll_Mind_150_TypeClass laengeSollMind150;

	/**
	 * The cached value of the '{@link #getMassgebendeNeigungMind150() <em>Massgebende Neigung Mind150</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassgebendeNeigungMind150()
	 * @generated
	 * @ordered
	 */
	protected Massgebende_Neigung_Mind_150_TypeClass massgebendeNeigungMind150;

	/**
	 * The cached value of the '{@link #getVFrei() <em>VFrei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVFrei()
	 * @generated
	 * @ordered
	 */
	protected V_Frei_TypeClass vFrei;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZBS_Schutzstrecke_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZBS_Schutzstrecke_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Laenge_Soll_Mind_150_TypeClass getLaengeSollMind150() {
		return laengeSollMind150;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaengeSollMind150(Laenge_Soll_Mind_150_TypeClass newLaengeSollMind150, NotificationChain msgs) {
		Laenge_Soll_Mind_150_TypeClass oldLaengeSollMind150 = laengeSollMind150;
		laengeSollMind150 = newLaengeSollMind150;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL_MIND150, oldLaengeSollMind150, newLaengeSollMind150);
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
	public void setLaengeSollMind150(Laenge_Soll_Mind_150_TypeClass newLaengeSollMind150) {
		if (newLaengeSollMind150 != laengeSollMind150) {
			NotificationChain msgs = null;
			if (laengeSollMind150 != null)
				msgs = ((InternalEObject)laengeSollMind150).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL_MIND150, null, msgs);
			if (newLaengeSollMind150 != null)
				msgs = ((InternalEObject)newLaengeSollMind150).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL_MIND150, null, msgs);
			msgs = basicSetLaengeSollMind150(newLaengeSollMind150, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL_MIND150, newLaengeSollMind150, newLaengeSollMind150));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Massgebende_Neigung_Mind_150_TypeClass getMassgebendeNeigungMind150() {
		return massgebendeNeigungMind150;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassgebendeNeigungMind150(Massgebende_Neigung_Mind_150_TypeClass newMassgebendeNeigungMind150, NotificationChain msgs) {
		Massgebende_Neigung_Mind_150_TypeClass oldMassgebendeNeigungMind150 = massgebendeNeigungMind150;
		massgebendeNeigungMind150 = newMassgebendeNeigungMind150;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND150, oldMassgebendeNeigungMind150, newMassgebendeNeigungMind150);
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
	public void setMassgebendeNeigungMind150(Massgebende_Neigung_Mind_150_TypeClass newMassgebendeNeigungMind150) {
		if (newMassgebendeNeigungMind150 != massgebendeNeigungMind150) {
			NotificationChain msgs = null;
			if (massgebendeNeigungMind150 != null)
				msgs = ((InternalEObject)massgebendeNeigungMind150).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND150, null, msgs);
			if (newMassgebendeNeigungMind150 != null)
				msgs = ((InternalEObject)newMassgebendeNeigungMind150).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND150, null, msgs);
			msgs = basicSetMassgebendeNeigungMind150(newMassgebendeNeigungMind150, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND150, newMassgebendeNeigungMind150, newMassgebendeNeigungMind150));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public V_Frei_TypeClass getVFrei() {
		return vFrei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVFrei(V_Frei_TypeClass newVFrei, NotificationChain msgs) {
		V_Frei_TypeClass oldVFrei = vFrei;
		vFrei = newVFrei;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__VFREI, oldVFrei, newVFrei);
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
	public void setVFrei(V_Frei_TypeClass newVFrei) {
		if (newVFrei != vFrei) {
			NotificationChain msgs = null;
			if (vFrei != null)
				msgs = ((InternalEObject)vFrei).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__VFREI, null, msgs);
			if (newVFrei != null)
				msgs = ((InternalEObject)newVFrei).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__VFREI, null, msgs);
			msgs = basicSetVFrei(newVFrei, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__VFREI, newVFrei, newVFrei));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL_MIND150:
				return basicSetLaengeSollMind150(null, msgs);
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND150:
				return basicSetMassgebendeNeigungMind150(null, msgs);
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__VFREI:
				return basicSetVFrei(null, msgs);
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
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL_MIND150:
				return getLaengeSollMind150();
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND150:
				return getMassgebendeNeigungMind150();
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__VFREI:
				return getVFrei();
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
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL_MIND150:
				setLaengeSollMind150((Laenge_Soll_Mind_150_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND150:
				setMassgebendeNeigungMind150((Massgebende_Neigung_Mind_150_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__VFREI:
				setVFrei((V_Frei_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL_MIND150:
				setLaengeSollMind150((Laenge_Soll_Mind_150_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND150:
				setMassgebendeNeigungMind150((Massgebende_Neigung_Mind_150_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__VFREI:
				setVFrei((V_Frei_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__LAENGE_SOLL_MIND150:
				return laengeSollMind150 != null;
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__MASSGEBENDE_NEIGUNG_MIND150:
				return massgebendeNeigungMind150 != null;
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE_ALLG_ATTRIBUTE_GROUP__VFREI:
				return vFrei != null;
		}
		return super.eIsSet(featureID);
	}

} //ZBS_Schutzstrecke_Allg_AttributeGroupImpl
