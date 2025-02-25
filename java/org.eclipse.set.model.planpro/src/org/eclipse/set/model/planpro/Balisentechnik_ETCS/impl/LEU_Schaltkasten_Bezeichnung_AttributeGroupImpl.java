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
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Schaltkasten_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Nummer_Schaltkasten_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Schaltkasten Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.LEU_Schaltkasten_Bezeichnung_AttributeGroupImpl#getNummerSchaltkasten <em>Nummer Schaltkasten</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_Schaltkasten_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements LEU_Schaltkasten_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getNummerSchaltkasten() <em>Nummer Schaltkasten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNummerSchaltkasten()
	 * @generated
	 * @ordered
	 */
	protected Nummer_Schaltkasten_TypeClass nummerSchaltkasten;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_Schaltkasten_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Schaltkasten_Bezeichnung_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nummer_Schaltkasten_TypeClass getNummerSchaltkasten() {
		return nummerSchaltkasten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNummerSchaltkasten(Nummer_Schaltkasten_TypeClass newNummerSchaltkasten, NotificationChain msgs) {
		Nummer_Schaltkasten_TypeClass oldNummerSchaltkasten = nummerSchaltkasten;
		nummerSchaltkasten = newNummerSchaltkasten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_BEZEICHNUNG_ATTRIBUTE_GROUP__NUMMER_SCHALTKASTEN, oldNummerSchaltkasten, newNummerSchaltkasten);
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
	public void setNummerSchaltkasten(Nummer_Schaltkasten_TypeClass newNummerSchaltkasten) {
		if (newNummerSchaltkasten != nummerSchaltkasten) {
			NotificationChain msgs = null;
			if (nummerSchaltkasten != null)
				msgs = ((InternalEObject)nummerSchaltkasten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_BEZEICHNUNG_ATTRIBUTE_GROUP__NUMMER_SCHALTKASTEN, null, msgs);
			if (newNummerSchaltkasten != null)
				msgs = ((InternalEObject)newNummerSchaltkasten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_BEZEICHNUNG_ATTRIBUTE_GROUP__NUMMER_SCHALTKASTEN, null, msgs);
			msgs = basicSetNummerSchaltkasten(newNummerSchaltkasten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_BEZEICHNUNG_ATTRIBUTE_GROUP__NUMMER_SCHALTKASTEN, newNummerSchaltkasten, newNummerSchaltkasten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_BEZEICHNUNG_ATTRIBUTE_GROUP__NUMMER_SCHALTKASTEN:
				return basicSetNummerSchaltkasten(null, msgs);
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
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_BEZEICHNUNG_ATTRIBUTE_GROUP__NUMMER_SCHALTKASTEN:
				return getNummerSchaltkasten();
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
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_BEZEICHNUNG_ATTRIBUTE_GROUP__NUMMER_SCHALTKASTEN:
				setNummerSchaltkasten((Nummer_Schaltkasten_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_BEZEICHNUNG_ATTRIBUTE_GROUP__NUMMER_SCHALTKASTEN:
				setNummerSchaltkasten((Nummer_Schaltkasten_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_BEZEICHNUNG_ATTRIBUTE_GROUP__NUMMER_SCHALTKASTEN:
				return nummerSchaltkasten != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //LEU_Schaltkasten_Bezeichnung_AttributeGroupImpl
