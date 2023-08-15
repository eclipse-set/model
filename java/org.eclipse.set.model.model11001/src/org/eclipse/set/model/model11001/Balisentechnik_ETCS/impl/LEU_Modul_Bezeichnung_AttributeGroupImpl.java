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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Modulnummer_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Modul Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.LEU_Modul_Bezeichnung_AttributeGroupImpl#getModulnummer <em>Modulnummer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_Modul_Bezeichnung_AttributeGroupImpl extends EObjectImpl implements LEU_Modul_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getModulnummer() <em>Modulnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulnummer()
	 * @generated
	 * @ordered
	 */
	protected Modulnummer_TypeClass modulnummer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_Modul_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Modul_Bezeichnung_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modulnummer_TypeClass getModulnummer() {
		return modulnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModulnummer(Modulnummer_TypeClass newModulnummer, NotificationChain msgs) {
		Modulnummer_TypeClass oldModulnummer = modulnummer;
		modulnummer = newModulnummer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_BEZEICHNUNG_ATTRIBUTE_GROUP__MODULNUMMER, oldModulnummer, newModulnummer);
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
	public void setModulnummer(Modulnummer_TypeClass newModulnummer) {
		if (newModulnummer != modulnummer) {
			NotificationChain msgs = null;
			if (modulnummer != null)
				msgs = ((InternalEObject)modulnummer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_BEZEICHNUNG_ATTRIBUTE_GROUP__MODULNUMMER, null, msgs);
			if (newModulnummer != null)
				msgs = ((InternalEObject)newModulnummer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_BEZEICHNUNG_ATTRIBUTE_GROUP__MODULNUMMER, null, msgs);
			msgs = basicSetModulnummer(newModulnummer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_BEZEICHNUNG_ATTRIBUTE_GROUP__MODULNUMMER, newModulnummer, newModulnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_MODUL_BEZEICHNUNG_ATTRIBUTE_GROUP__MODULNUMMER:
				return basicSetModulnummer(null, msgs);
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
			case Balisentechnik_ETCSPackage.LEU_MODUL_BEZEICHNUNG_ATTRIBUTE_GROUP__MODULNUMMER:
				return getModulnummer();
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
			case Balisentechnik_ETCSPackage.LEU_MODUL_BEZEICHNUNG_ATTRIBUTE_GROUP__MODULNUMMER:
				setModulnummer((Modulnummer_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.LEU_MODUL_BEZEICHNUNG_ATTRIBUTE_GROUP__MODULNUMMER:
				setModulnummer((Modulnummer_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.LEU_MODUL_BEZEICHNUNG_ATTRIBUTE_GROUP__MODULNUMMER:
				return modulnummer != null;
		}
		return super.eIsSet(featureID);
	}

} //LEU_Modul_Bezeichnung_AttributeGroupImpl
