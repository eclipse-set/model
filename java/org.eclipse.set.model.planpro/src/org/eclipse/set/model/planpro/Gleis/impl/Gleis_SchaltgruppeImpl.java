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

import org.eclipse.set.model.planpro.Gleis.Fahrstrom_TypeClass;
import org.eclipse.set.model.planpro.Gleis.GleisPackage;
import org.eclipse.set.model.planpro.Gleis.Gleis_Schaltgruppe;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gleis Schaltgruppe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_SchaltgruppeImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Gleis.impl.Gleis_SchaltgruppeImpl#getFahrstrom <em>Fahrstrom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Gleis_SchaltgruppeImpl extends Bereich_ObjektImpl implements Gleis_Schaltgruppe {
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
	 * The cached value of the '{@link #getFahrstrom() <em>Fahrstrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFahrstrom()
	 * @generated
	 * @ordered
	 */
	protected Fahrstrom_TypeClass fahrstrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gleis_SchaltgruppeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GleisPackage.Literals.GLEIS_SCHALTGRUPPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_SCHALTGRUPPE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_SCHALTGRUPPE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_SCHALTGRUPPE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_SCHALTGRUPPE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fahrstrom_TypeClass getFahrstrom() {
		return fahrstrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFahrstrom(Fahrstrom_TypeClass newFahrstrom, NotificationChain msgs) {
		Fahrstrom_TypeClass oldFahrstrom = fahrstrom;
		fahrstrom = newFahrstrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_SCHALTGRUPPE__FAHRSTROM, oldFahrstrom, newFahrstrom);
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
	public void setFahrstrom(Fahrstrom_TypeClass newFahrstrom) {
		if (newFahrstrom != fahrstrom) {
			NotificationChain msgs = null;
			if (fahrstrom != null)
				msgs = ((InternalEObject)fahrstrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_SCHALTGRUPPE__FAHRSTROM, null, msgs);
			if (newFahrstrom != null)
				msgs = ((InternalEObject)newFahrstrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_SCHALTGRUPPE__FAHRSTROM, null, msgs);
			msgs = basicSetFahrstrom(newFahrstrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_SCHALTGRUPPE__FAHRSTROM, newFahrstrom, newFahrstrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GleisPackage.GLEIS_SCHALTGRUPPE__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case GleisPackage.GLEIS_SCHALTGRUPPE__FAHRSTROM:
				return basicSetFahrstrom(null, msgs);
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
			case GleisPackage.GLEIS_SCHALTGRUPPE__BEZEICHNUNG:
				return getBezeichnung();
			case GleisPackage.GLEIS_SCHALTGRUPPE__FAHRSTROM:
				return getFahrstrom();
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
			case GleisPackage.GLEIS_SCHALTGRUPPE__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)newValue);
				return;
			case GleisPackage.GLEIS_SCHALTGRUPPE__FAHRSTROM:
				setFahrstrom((Fahrstrom_TypeClass)newValue);
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
			case GleisPackage.GLEIS_SCHALTGRUPPE__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)null);
				return;
			case GleisPackage.GLEIS_SCHALTGRUPPE__FAHRSTROM:
				setFahrstrom((Fahrstrom_TypeClass)null);
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
			case GleisPackage.GLEIS_SCHALTGRUPPE__BEZEICHNUNG:
				return bezeichnung != null;
			case GleisPackage.GLEIS_SCHALTGRUPPE__FAHRSTROM:
				return fahrstrom != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Gleis_SchaltgruppeImpl
