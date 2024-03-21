/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Anschlussnummer_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.Unterstation_Nr_TypeClass;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Zuordnung_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZLV Bus Zuordnung Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZLV_Bus_Zuordnung_Allg_AttributeGroupImpl#getAnschlussnummer <em>Anschlussnummer</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZLV_Bus_Zuordnung_Allg_AttributeGroupImpl#getUnterstationNr <em>Unterstation Nr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZLV_Bus_Zuordnung_Allg_AttributeGroupImpl extends EObjectImpl implements ZLV_Bus_Zuordnung_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAnschlussnummer() <em>Anschlussnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschlussnummer()
	 * @generated
	 * @ordered
	 */
	protected Anschlussnummer_TypeClass anschlussnummer;

	/**
	 * The cached value of the '{@link #getUnterstationNr() <em>Unterstation Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterstationNr()
	 * @generated
	 * @ordered
	 */
	protected Unterstation_Nr_TypeClass unterstationNr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZLV_Bus_Zuordnung_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anschlussnummer_TypeClass getAnschlussnummer() {
		return anschlussnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschlussnummer(Anschlussnummer_TypeClass newAnschlussnummer, NotificationChain msgs) {
		Anschlussnummer_TypeClass oldAnschlussnummer = anschlussnummer;
		anschlussnummer = newAnschlussnummer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__ANSCHLUSSNUMMER, oldAnschlussnummer, newAnschlussnummer);
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
	public void setAnschlussnummer(Anschlussnummer_TypeClass newAnschlussnummer) {
		if (newAnschlussnummer != anschlussnummer) {
			NotificationChain msgs = null;
			if (anschlussnummer != null)
				msgs = ((InternalEObject)anschlussnummer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__ANSCHLUSSNUMMER, null, msgs);
			if (newAnschlussnummer != null)
				msgs = ((InternalEObject)newAnschlussnummer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__ANSCHLUSSNUMMER, null, msgs);
			msgs = basicSetAnschlussnummer(newAnschlussnummer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__ANSCHLUSSNUMMER, newAnschlussnummer, newAnschlussnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unterstation_Nr_TypeClass getUnterstationNr() {
		return unterstationNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnterstationNr(Unterstation_Nr_TypeClass newUnterstationNr, NotificationChain msgs) {
		Unterstation_Nr_TypeClass oldUnterstationNr = unterstationNr;
		unterstationNr = newUnterstationNr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_NR, oldUnterstationNr, newUnterstationNr);
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
	public void setUnterstationNr(Unterstation_Nr_TypeClass newUnterstationNr) {
		if (newUnterstationNr != unterstationNr) {
			NotificationChain msgs = null;
			if (unterstationNr != null)
				msgs = ((InternalEObject)unterstationNr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_NR, null, msgs);
			if (newUnterstationNr != null)
				msgs = ((InternalEObject)newUnterstationNr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_NR, null, msgs);
			msgs = basicSetUnterstationNr(newUnterstationNr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_NR, newUnterstationNr, newUnterstationNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__ANSCHLUSSNUMMER:
				return basicSetAnschlussnummer(null, msgs);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_NR:
				return basicSetUnterstationNr(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__ANSCHLUSSNUMMER:
				return getAnschlussnummer();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_NR:
				return getUnterstationNr();
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__ANSCHLUSSNUMMER:
				setAnschlussnummer((Anschlussnummer_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_NR:
				setUnterstationNr((Unterstation_Nr_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__ANSCHLUSSNUMMER:
				setAnschlussnummer((Anschlussnummer_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_NR:
				setUnterstationNr((Unterstation_Nr_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__ANSCHLUSSNUMMER:
				return anschlussnummer != null;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_ZUORDNUNG_ALLG_ATTRIBUTE_GROUP__UNTERSTATION_NR:
				return unterstationNr != null;
		}
		return super.eIsSet(featureID);
	}

} //ZLV_Bus_Zuordnung_Allg_AttributeGroupImpl
