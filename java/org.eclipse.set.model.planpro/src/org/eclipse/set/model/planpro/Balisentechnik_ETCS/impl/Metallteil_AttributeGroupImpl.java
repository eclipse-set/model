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
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Metallteil_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Metallteil_Kategorie_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Metallteil_Laenge_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metallteil Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Metallteil_AttributeGroupImpl#getMetallteilKategorie <em>Metallteil Kategorie</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Metallteil_AttributeGroupImpl#getMetallteilLaenge <em>Metallteil Laenge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Metallteil_AttributeGroupImpl extends EObjectImpl implements Metallteil_AttributeGroup {
	/**
	 * The cached value of the '{@link #getMetallteilKategorie() <em>Metallteil Kategorie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetallteilKategorie()
	 * @generated
	 * @ordered
	 */
	protected Metallteil_Kategorie_TypeClass metallteilKategorie;

	/**
	 * The cached value of the '{@link #getMetallteilLaenge() <em>Metallteil Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetallteilLaenge()
	 * @generated
	 * @ordered
	 */
	protected Metallteil_Laenge_TypeClass metallteilLaenge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Metallteil_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getMetallteil_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metallteil_Kategorie_TypeClass getMetallteilKategorie() {
		return metallteilKategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetallteilKategorie(Metallteil_Kategorie_TypeClass newMetallteilKategorie, NotificationChain msgs) {
		Metallteil_Kategorie_TypeClass oldMetallteilKategorie = metallteilKategorie;
		metallteilKategorie = newMetallteilKategorie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_KATEGORIE, oldMetallteilKategorie, newMetallteilKategorie);
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
	public void setMetallteilKategorie(Metallteil_Kategorie_TypeClass newMetallteilKategorie) {
		if (newMetallteilKategorie != metallteilKategorie) {
			NotificationChain msgs = null;
			if (metallteilKategorie != null)
				msgs = ((InternalEObject)metallteilKategorie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_KATEGORIE, null, msgs);
			if (newMetallteilKategorie != null)
				msgs = ((InternalEObject)newMetallteilKategorie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_KATEGORIE, null, msgs);
			msgs = basicSetMetallteilKategorie(newMetallteilKategorie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_KATEGORIE, newMetallteilKategorie, newMetallteilKategorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metallteil_Laenge_TypeClass getMetallteilLaenge() {
		return metallteilLaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetallteilLaenge(Metallteil_Laenge_TypeClass newMetallteilLaenge, NotificationChain msgs) {
		Metallteil_Laenge_TypeClass oldMetallteilLaenge = metallteilLaenge;
		metallteilLaenge = newMetallteilLaenge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_LAENGE, oldMetallteilLaenge, newMetallteilLaenge);
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
	public void setMetallteilLaenge(Metallteil_Laenge_TypeClass newMetallteilLaenge) {
		if (newMetallteilLaenge != metallteilLaenge) {
			NotificationChain msgs = null;
			if (metallteilLaenge != null)
				msgs = ((InternalEObject)metallteilLaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_LAENGE, null, msgs);
			if (newMetallteilLaenge != null)
				msgs = ((InternalEObject)newMetallteilLaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_LAENGE, null, msgs);
			msgs = basicSetMetallteilLaenge(newMetallteilLaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_LAENGE, newMetallteilLaenge, newMetallteilLaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_KATEGORIE:
				return basicSetMetallteilKategorie(null, msgs);
			case Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_LAENGE:
				return basicSetMetallteilLaenge(null, msgs);
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
			case Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_KATEGORIE:
				return getMetallteilKategorie();
			case Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_LAENGE:
				return getMetallteilLaenge();
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
			case Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_KATEGORIE:
				setMetallteilKategorie((Metallteil_Kategorie_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_LAENGE:
				setMetallteilLaenge((Metallteil_Laenge_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_KATEGORIE:
				setMetallteilKategorie((Metallteil_Kategorie_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_LAENGE:
				setMetallteilLaenge((Metallteil_Laenge_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_KATEGORIE:
				return metallteilKategorie != null;
			case Balisentechnik_ETCSPackage.METALLTEIL_ATTRIBUTE_GROUP__METALLTEIL_LAENGE:
				return metallteilLaenge != null;
		}
		return super.eIsSet(featureID);
	}

} //Metallteil_AttributeGroupImpl
