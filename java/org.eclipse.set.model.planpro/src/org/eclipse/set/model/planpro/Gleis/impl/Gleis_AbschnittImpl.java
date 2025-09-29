/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Gleis.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Bereich_ObjektImpl;

import org.eclipse.set.model.planpro.Gleis.Geschwindigkeit_TypeClass;
import org.eclipse.set.model.planpro.Gleis.GleisPackage;
import org.eclipse.set.model.planpro.Gleis.Gleis_Abschnitt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gleis Abschnitt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_AbschnittImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_AbschnittImpl#getGeschwindigkeit <em>Geschwindigkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Gleis_AbschnittImpl extends Bereich_ObjektImpl implements Gleis_Abschnitt {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Element_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getGeschwindigkeit() <em>Geschwindigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschwindigkeit()
	 * @generated
	 * @ordered
	 */
	protected Geschwindigkeit_TypeClass geschwindigkeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gleis_AbschnittImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GleisPackage.Literals.GLEIS_ABSCHNITT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Element_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bezeichnung_Element_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bezeichnung_Element_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_ABSCHNITT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bezeichnung_Element_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_ABSCHNITT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_ABSCHNITT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_ABSCHNITT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geschwindigkeit_TypeClass getGeschwindigkeit() {
		return geschwindigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeschwindigkeit(Geschwindigkeit_TypeClass newGeschwindigkeit, NotificationChain msgs) {
		Geschwindigkeit_TypeClass oldGeschwindigkeit = geschwindigkeit;
		geschwindigkeit = newGeschwindigkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_ABSCHNITT__GESCHWINDIGKEIT, oldGeschwindigkeit, newGeschwindigkeit);
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
	public void setGeschwindigkeit(Geschwindigkeit_TypeClass newGeschwindigkeit) {
		if (newGeschwindigkeit != geschwindigkeit) {
			NotificationChain msgs = null;
			if (geschwindigkeit != null)
				msgs = ((InternalEObject)geschwindigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_ABSCHNITT__GESCHWINDIGKEIT, null, msgs);
			if (newGeschwindigkeit != null)
				msgs = ((InternalEObject)newGeschwindigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_ABSCHNITT__GESCHWINDIGKEIT, null, msgs);
			msgs = basicSetGeschwindigkeit(newGeschwindigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_ABSCHNITT__GESCHWINDIGKEIT, newGeschwindigkeit, newGeschwindigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GleisPackage.GLEIS_ABSCHNITT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case GleisPackage.GLEIS_ABSCHNITT__GESCHWINDIGKEIT:
				return basicSetGeschwindigkeit(null, msgs);
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
			case GleisPackage.GLEIS_ABSCHNITT__BEZEICHNUNG:
				return getBezeichnung();
			case GleisPackage.GLEIS_ABSCHNITT__GESCHWINDIGKEIT:
				return getGeschwindigkeit();
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
			case GleisPackage.GLEIS_ABSCHNITT__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)newValue);
				return;
			case GleisPackage.GLEIS_ABSCHNITT__GESCHWINDIGKEIT:
				setGeschwindigkeit((Geschwindigkeit_TypeClass)newValue);
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
			case GleisPackage.GLEIS_ABSCHNITT__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)null);
				return;
			case GleisPackage.GLEIS_ABSCHNITT__GESCHWINDIGKEIT:
				setGeschwindigkeit((Geschwindigkeit_TypeClass)null);
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
			case GleisPackage.GLEIS_ABSCHNITT__BEZEICHNUNG:
				return bezeichnung != null;
			case GleisPackage.GLEIS_ABSCHNITT__GESCHWINDIGKEIT:
				return geschwindigkeit != null;
		}
		return super.eIsSet(featureID);
	}

} //Gleis_AbschnittImpl
