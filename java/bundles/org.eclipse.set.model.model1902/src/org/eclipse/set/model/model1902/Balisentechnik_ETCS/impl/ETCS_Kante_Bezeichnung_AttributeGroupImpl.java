/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bezeichnung_ETCS_Kante_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Kante_Bezeichnung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETCS Kante Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.ETCS_Kante_Bezeichnung_AttributeGroupImpl#getBezeichnungETCSKante <em>Bezeichnung ETCS Kante</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETCS_Kante_Bezeichnung_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ETCS_Kante_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungETCSKante() <em>Bezeichnung ETCS Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungETCSKante()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_ETCS_Kante_TypeClass bezeichnungETCSKante;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETCS_Kante_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Kante_Bezeichnung_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_ETCS_Kante_TypeClass getBezeichnungETCSKante() {
		return bezeichnungETCSKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungETCSKante(Bezeichnung_ETCS_Kante_TypeClass newBezeichnungETCSKante, NotificationChain msgs) {
		Bezeichnung_ETCS_Kante_TypeClass oldBezeichnungETCSKante = bezeichnungETCSKante;
		bezeichnungETCSKante = newBezeichnungETCSKante;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ETCS_KANTE, oldBezeichnungETCSKante, newBezeichnungETCSKante);
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
	public void setBezeichnungETCSKante(Bezeichnung_ETCS_Kante_TypeClass newBezeichnungETCSKante) {
		if (newBezeichnungETCSKante != bezeichnungETCSKante) {
			NotificationChain msgs = null;
			if (bezeichnungETCSKante != null)
				msgs = ((InternalEObject)bezeichnungETCSKante).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ETCS_KANTE, null, msgs);
			if (newBezeichnungETCSKante != null)
				msgs = ((InternalEObject)newBezeichnungETCSKante).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ETCS_KANTE, null, msgs);
			msgs = basicSetBezeichnungETCSKante(newBezeichnungETCSKante, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ETCS_KANTE, newBezeichnungETCSKante, newBezeichnungETCSKante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ETCS_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ETCS_KANTE:
				return basicSetBezeichnungETCSKante(null, msgs);
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
			case Balisentechnik_ETCSPackage.ETCS_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ETCS_KANTE:
				return getBezeichnungETCSKante();
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
			case Balisentechnik_ETCSPackage.ETCS_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ETCS_KANTE:
				setBezeichnungETCSKante((Bezeichnung_ETCS_Kante_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ETCS_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ETCS_KANTE:
				setBezeichnungETCSKante((Bezeichnung_ETCS_Kante_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ETCS_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ETCS_KANTE:
				return bezeichnungETCSKante != null;
		}
		return super.eIsSet(featureID);
	}

} //ETCS_Kante_Bezeichnung_AttributeGroupImpl
