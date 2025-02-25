/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Layoutinformationen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Ur_ObjektImpl;

import org.eclipse.set.model.planpro.Layoutinformationen.Lageplan;
import org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Art_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage;

import org.eclipse.set.model.planpro.Verweise.ID_Lageplan_Blattschnitt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lageplan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.LageplanImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.LageplanImpl#getIDLageplanBlattschnitt <em>ID Lageplan Blattschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.impl.LageplanImpl#getLageplanArt <em>Lageplan Art</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LageplanImpl extends Ur_ObjektImpl implements Lageplan {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Lageplan_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDLageplanBlattschnitt() <em>ID Lageplan Blattschnitt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDLageplanBlattschnitt()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Lageplan_Blattschnitt_TypeClass> iDLageplanBlattschnitt;

	/**
	 * The cached value of the '{@link #getLageplanArt() <em>Lageplan Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLageplanArt()
	 * @generated
	 * @ordered
	 */
	protected Lageplan_Art_TypeClass lageplanArt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LageplanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutinformationenPackage.Literals.LAGEPLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lageplan_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Lageplan_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Lageplan_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.LAGEPLAN__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Lageplan_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.LAGEPLAN__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.LAGEPLAN__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.LAGEPLAN__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Lageplan_Blattschnitt_TypeClass> getIDLageplanBlattschnitt() {
		if (iDLageplanBlattschnitt == null) {
			iDLageplanBlattschnitt = new EObjectContainmentEList<ID_Lageplan_Blattschnitt_TypeClass>(ID_Lageplan_Blattschnitt_TypeClass.class, this, LayoutinformationenPackage.LAGEPLAN__ID_LAGEPLAN_BLATTSCHNITT);
		}
		return iDLageplanBlattschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lageplan_Art_TypeClass getLageplanArt() {
		return lageplanArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLageplanArt(Lageplan_Art_TypeClass newLageplanArt, NotificationChain msgs) {
		Lageplan_Art_TypeClass oldLageplanArt = lageplanArt;
		lageplanArt = newLageplanArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.LAGEPLAN__LAGEPLAN_ART, oldLageplanArt, newLageplanArt);
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
	public void setLageplanArt(Lageplan_Art_TypeClass newLageplanArt) {
		if (newLageplanArt != lageplanArt) {
			NotificationChain msgs = null;
			if (lageplanArt != null)
				msgs = ((InternalEObject)lageplanArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.LAGEPLAN__LAGEPLAN_ART, null, msgs);
			if (newLageplanArt != null)
				msgs = ((InternalEObject)newLageplanArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.LAGEPLAN__LAGEPLAN_ART, null, msgs);
			msgs = basicSetLageplanArt(newLageplanArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.LAGEPLAN__LAGEPLAN_ART, newLageplanArt, newLageplanArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutinformationenPackage.LAGEPLAN__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case LayoutinformationenPackage.LAGEPLAN__ID_LAGEPLAN_BLATTSCHNITT:
				return ((InternalEList<?>)getIDLageplanBlattschnitt()).basicRemove(otherEnd, msgs);
			case LayoutinformationenPackage.LAGEPLAN__LAGEPLAN_ART:
				return basicSetLageplanArt(null, msgs);
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
			case LayoutinformationenPackage.LAGEPLAN__BEZEICHNUNG:
				return getBezeichnung();
			case LayoutinformationenPackage.LAGEPLAN__ID_LAGEPLAN_BLATTSCHNITT:
				return getIDLageplanBlattschnitt();
			case LayoutinformationenPackage.LAGEPLAN__LAGEPLAN_ART:
				return getLageplanArt();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
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
			case LayoutinformationenPackage.LAGEPLAN__BEZEICHNUNG:
				setBezeichnung((Lageplan_Bezeichnung_AttributeGroup)newValue);
				return;
			case LayoutinformationenPackage.LAGEPLAN__ID_LAGEPLAN_BLATTSCHNITT:
				getIDLageplanBlattschnitt().clear();
				getIDLageplanBlattschnitt().addAll((Collection<? extends ID_Lageplan_Blattschnitt_TypeClass>)newValue);
				return;
			case LayoutinformationenPackage.LAGEPLAN__LAGEPLAN_ART:
				setLageplanArt((Lageplan_Art_TypeClass)newValue);
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
			case LayoutinformationenPackage.LAGEPLAN__BEZEICHNUNG:
				setBezeichnung((Lageplan_Bezeichnung_AttributeGroup)null);
				return;
			case LayoutinformationenPackage.LAGEPLAN__ID_LAGEPLAN_BLATTSCHNITT:
				getIDLageplanBlattschnitt().clear();
				return;
			case LayoutinformationenPackage.LAGEPLAN__LAGEPLAN_ART:
				setLageplanArt((Lageplan_Art_TypeClass)null);
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
			case LayoutinformationenPackage.LAGEPLAN__BEZEICHNUNG:
				return bezeichnung != null;
			case LayoutinformationenPackage.LAGEPLAN__ID_LAGEPLAN_BLATTSCHNITT:
				return iDLageplanBlattschnitt != null && !iDLageplanBlattschnitt.isEmpty();
			case LayoutinformationenPackage.LAGEPLAN__LAGEPLAN_ART:
				return lageplanArt != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //LageplanImpl
