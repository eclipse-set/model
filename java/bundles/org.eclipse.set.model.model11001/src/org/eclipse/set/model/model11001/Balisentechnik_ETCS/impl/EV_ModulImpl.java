/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.EV_Modul;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.EV_Modul_Physisch_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.EV_Modul_Virtuell_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EV Modul</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.EV_ModulImpl#getEVModulAusgang <em>EV Modul Ausgang</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.EV_ModulImpl#getEVModulPhysisch <em>EV Modul Physisch</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.EV_ModulImpl#getEVModulVirtuell <em>EV Modul Virtuell</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EV_ModulImpl extends Basis_ObjektImpl implements EV_Modul {
	/**
	 * The cached value of the '{@link #getEVModulAusgang() <em>EV Modul Ausgang</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVModulAusgang()
	 * @generated
	 * @ordered
	 */
	protected EList<EV_Modul_Ausgang_AttributeGroup> eVModulAusgang;

	/**
	 * The cached value of the '{@link #getEVModulPhysisch() <em>EV Modul Physisch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVModulPhysisch()
	 * @generated
	 * @ordered
	 */
	protected EV_Modul_Physisch_AttributeGroup eVModulPhysisch;

	/**
	 * The cached value of the '{@link #getEVModulVirtuell() <em>EV Modul Virtuell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVModulVirtuell()
	 * @generated
	 * @ordered
	 */
	protected EV_Modul_Virtuell_AttributeGroup eVModulVirtuell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EV_ModulImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EV_Modul_Ausgang_AttributeGroup> getEVModulAusgang() {
		if (eVModulAusgang == null) {
			eVModulAusgang = new EObjectContainmentEList<EV_Modul_Ausgang_AttributeGroup>(EV_Modul_Ausgang_AttributeGroup.class, this, Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_AUSGANG);
		}
		return eVModulAusgang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EV_Modul_Physisch_AttributeGroup getEVModulPhysisch() {
		return eVModulPhysisch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEVModulPhysisch(EV_Modul_Physisch_AttributeGroup newEVModulPhysisch, NotificationChain msgs) {
		EV_Modul_Physisch_AttributeGroup oldEVModulPhysisch = eVModulPhysisch;
		eVModulPhysisch = newEVModulPhysisch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_PHYSISCH, oldEVModulPhysisch, newEVModulPhysisch);
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
	public void setEVModulPhysisch(EV_Modul_Physisch_AttributeGroup newEVModulPhysisch) {
		if (newEVModulPhysisch != eVModulPhysisch) {
			NotificationChain msgs = null;
			if (eVModulPhysisch != null)
				msgs = ((InternalEObject)eVModulPhysisch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_PHYSISCH, null, msgs);
			if (newEVModulPhysisch != null)
				msgs = ((InternalEObject)newEVModulPhysisch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_PHYSISCH, null, msgs);
			msgs = basicSetEVModulPhysisch(newEVModulPhysisch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_PHYSISCH, newEVModulPhysisch, newEVModulPhysisch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EV_Modul_Virtuell_AttributeGroup getEVModulVirtuell() {
		return eVModulVirtuell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEVModulVirtuell(EV_Modul_Virtuell_AttributeGroup newEVModulVirtuell, NotificationChain msgs) {
		EV_Modul_Virtuell_AttributeGroup oldEVModulVirtuell = eVModulVirtuell;
		eVModulVirtuell = newEVModulVirtuell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_VIRTUELL, oldEVModulVirtuell, newEVModulVirtuell);
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
	public void setEVModulVirtuell(EV_Modul_Virtuell_AttributeGroup newEVModulVirtuell) {
		if (newEVModulVirtuell != eVModulVirtuell) {
			NotificationChain msgs = null;
			if (eVModulVirtuell != null)
				msgs = ((InternalEObject)eVModulVirtuell).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_VIRTUELL, null, msgs);
			if (newEVModulVirtuell != null)
				msgs = ((InternalEObject)newEVModulVirtuell).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_VIRTUELL, null, msgs);
			msgs = basicSetEVModulVirtuell(newEVModulVirtuell, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_VIRTUELL, newEVModulVirtuell, newEVModulVirtuell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_AUSGANG:
				return ((InternalEList<?>)getEVModulAusgang()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_PHYSISCH:
				return basicSetEVModulPhysisch(null, msgs);
			case Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_VIRTUELL:
				return basicSetEVModulVirtuell(null, msgs);
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
			case Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_AUSGANG:
				return getEVModulAusgang();
			case Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_PHYSISCH:
				return getEVModulPhysisch();
			case Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_VIRTUELL:
				return getEVModulVirtuell();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_AUSGANG:
				getEVModulAusgang().clear();
				getEVModulAusgang().addAll((Collection<? extends EV_Modul_Ausgang_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_PHYSISCH:
				setEVModulPhysisch((EV_Modul_Physisch_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_VIRTUELL:
				setEVModulVirtuell((EV_Modul_Virtuell_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_AUSGANG:
				getEVModulAusgang().clear();
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_PHYSISCH:
				setEVModulPhysisch((EV_Modul_Physisch_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_VIRTUELL:
				setEVModulVirtuell((EV_Modul_Virtuell_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_AUSGANG:
				return eVModulAusgang != null && !eVModulAusgang.isEmpty();
			case Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_PHYSISCH:
				return eVModulPhysisch != null;
			case Balisentechnik_ETCSPackage.EV_MODUL__EV_MODUL_VIRTUELL:
				return eVModulVirtuell != null;
		}
		return super.eIsSet(featureID);
	}

} //EV_ModulImpl
