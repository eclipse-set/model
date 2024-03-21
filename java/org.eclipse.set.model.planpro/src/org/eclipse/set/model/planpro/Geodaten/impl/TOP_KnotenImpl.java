/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Geodaten.GeodatenPackage;
import org.eclipse.set.model.planpro.Geodaten.Knotenname_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.TOP_Knoten;

import org.eclipse.set.model.planpro.Verweise.ID_GEO_Knoten_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TOP Knoten</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.TOP_KnotenImpl#getIDGEOKnoten <em>IDGEO Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.TOP_KnotenImpl#getKnotenname <em>Knotenname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TOP_KnotenImpl extends Basis_ObjektImpl implements TOP_Knoten {
	/**
	 * The cached value of the '{@link #getIDGEOKnoten() <em>IDGEO Knoten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOKnoten()
	 * @generated
	 * @ordered
	 */
	protected ID_GEO_Knoten_TypeClass iDGEOKnoten;

	/**
	 * The cached value of the '{@link #getKnotenname() <em>Knotenname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnotenname()
	 * @generated
	 * @ordered
	 */
	protected Knotenname_TypeClass knotenname;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TOP_KnotenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.TOP_KNOTEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_GEO_Knoten_TypeClass getIDGEOKnoten() {
		return iDGEOKnoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDGEOKnoten(ID_GEO_Knoten_TypeClass newIDGEOKnoten, NotificationChain msgs) {
		ID_GEO_Knoten_TypeClass oldIDGEOKnoten = iDGEOKnoten;
		iDGEOKnoten = newIDGEOKnoten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KNOTEN__IDGEO_KNOTEN, oldIDGEOKnoten, newIDGEOKnoten);
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
	public void setIDGEOKnoten(ID_GEO_Knoten_TypeClass newIDGEOKnoten) {
		if (newIDGEOKnoten != iDGEOKnoten) {
			NotificationChain msgs = null;
			if (iDGEOKnoten != null)
				msgs = ((InternalEObject)iDGEOKnoten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KNOTEN__IDGEO_KNOTEN, null, msgs);
			if (newIDGEOKnoten != null)
				msgs = ((InternalEObject)newIDGEOKnoten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KNOTEN__IDGEO_KNOTEN, null, msgs);
			msgs = basicSetIDGEOKnoten(newIDGEOKnoten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KNOTEN__IDGEO_KNOTEN, newIDGEOKnoten, newIDGEOKnoten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Knotenname_TypeClass getKnotenname() {
		return knotenname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKnotenname(Knotenname_TypeClass newKnotenname, NotificationChain msgs) {
		Knotenname_TypeClass oldKnotenname = knotenname;
		knotenname = newKnotenname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KNOTEN__KNOTENNAME, oldKnotenname, newKnotenname);
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
	public void setKnotenname(Knotenname_TypeClass newKnotenname) {
		if (newKnotenname != knotenname) {
			NotificationChain msgs = null;
			if (knotenname != null)
				msgs = ((InternalEObject)knotenname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KNOTEN__KNOTENNAME, null, msgs);
			if (newKnotenname != null)
				msgs = ((InternalEObject)newKnotenname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KNOTEN__KNOTENNAME, null, msgs);
			msgs = basicSetKnotenname(newKnotenname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KNOTEN__KNOTENNAME, newKnotenname, newKnotenname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.TOP_KNOTEN__IDGEO_KNOTEN:
				return basicSetIDGEOKnoten(null, msgs);
			case GeodatenPackage.TOP_KNOTEN__KNOTENNAME:
				return basicSetKnotenname(null, msgs);
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
			case GeodatenPackage.TOP_KNOTEN__IDGEO_KNOTEN:
				return getIDGEOKnoten();
			case GeodatenPackage.TOP_KNOTEN__KNOTENNAME:
				return getKnotenname();
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
			case GeodatenPackage.TOP_KNOTEN__IDGEO_KNOTEN:
				setIDGEOKnoten((ID_GEO_Knoten_TypeClass)newValue);
				return;
			case GeodatenPackage.TOP_KNOTEN__KNOTENNAME:
				setKnotenname((Knotenname_TypeClass)newValue);
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
			case GeodatenPackage.TOP_KNOTEN__IDGEO_KNOTEN:
				setIDGEOKnoten((ID_GEO_Knoten_TypeClass)null);
				return;
			case GeodatenPackage.TOP_KNOTEN__KNOTENNAME:
				setKnotenname((Knotenname_TypeClass)null);
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
			case GeodatenPackage.TOP_KNOTEN__IDGEO_KNOTEN:
				return iDGEOKnoten != null;
			case GeodatenPackage.TOP_KNOTEN__KNOTENNAME:
				return knotenname != null;
		}
		return super.eIsSet(featureID);
	}

} //TOP_KnotenImpl
