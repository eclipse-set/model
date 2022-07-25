/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.model.model1902.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.model1902.Geodaten.GEO_Punkt;
import org.eclipse.set.model.model1902.Geodaten.GEO_Punkt_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Geodaten.GeodatenPackage;

import org.eclipse.set.model.model1902.Verweise.ID_GEO_Knoten_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GEO Punkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_PunktImpl#getGEOPunktAllg <em>GEO Punkt Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.impl.GEO_PunktImpl#getIDGEOKnoten <em>IDGEO Knoten</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GEO_PunktImpl extends Basis_ObjektImpl implements GEO_Punkt {
	/**
	 * The cached value of the '{@link #getGEOPunktAllg() <em>GEO Punkt Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEOPunktAllg()
	 * @generated
	 * @ordered
	 */
	protected GEO_Punkt_Allg_AttributeGroup gEOPunktAllg;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GEO_PunktImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.GEO_PUNKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Punkt_Allg_AttributeGroup getGEOPunktAllg() {
		return gEOPunktAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGEOPunktAllg(GEO_Punkt_Allg_AttributeGroup newGEOPunktAllg, NotificationChain msgs) {
		GEO_Punkt_Allg_AttributeGroup oldGEOPunktAllg = gEOPunktAllg;
		gEOPunktAllg = newGEOPunktAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG, oldGEOPunktAllg, newGEOPunktAllg);
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
	public void setGEOPunktAllg(GEO_Punkt_Allg_AttributeGroup newGEOPunktAllg) {
		if (newGEOPunktAllg != gEOPunktAllg) {
			NotificationChain msgs = null;
			if (gEOPunktAllg != null)
				msgs = ((InternalEObject)gEOPunktAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG, null, msgs);
			if (newGEOPunktAllg != null)
				msgs = ((InternalEObject)newGEOPunktAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG, null, msgs);
			msgs = basicSetGEOPunktAllg(newGEOPunktAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG, newGEOPunktAllg, newGEOPunktAllg));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT__IDGEO_KNOTEN, oldIDGEOKnoten, newIDGEOKnoten);
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
				msgs = ((InternalEObject)iDGEOKnoten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT__IDGEO_KNOTEN, null, msgs);
			if (newIDGEOKnoten != null)
				msgs = ((InternalEObject)newIDGEOKnoten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT__IDGEO_KNOTEN, null, msgs);
			msgs = basicSetIDGEOKnoten(newIDGEOKnoten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT__IDGEO_KNOTEN, newIDGEOKnoten, newIDGEOKnoten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG:
				return basicSetGEOPunktAllg(null, msgs);
			case GeodatenPackage.GEO_PUNKT__IDGEO_KNOTEN:
				return basicSetIDGEOKnoten(null, msgs);
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
			case GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG:
				return getGEOPunktAllg();
			case GeodatenPackage.GEO_PUNKT__IDGEO_KNOTEN:
				return getIDGEOKnoten();
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
			case GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG:
				setGEOPunktAllg((GEO_Punkt_Allg_AttributeGroup)newValue);
				return;
			case GeodatenPackage.GEO_PUNKT__IDGEO_KNOTEN:
				setIDGEOKnoten((ID_GEO_Knoten_TypeClass)newValue);
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
			case GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG:
				setGEOPunktAllg((GEO_Punkt_Allg_AttributeGroup)null);
				return;
			case GeodatenPackage.GEO_PUNKT__IDGEO_KNOTEN:
				setIDGEOKnoten((ID_GEO_Knoten_TypeClass)null);
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
			case GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG:
				return gEOPunktAllg != null;
			case GeodatenPackage.GEO_PUNKT__IDGEO_KNOTEN:
				return iDGEOKnoten != null;
		}
		return super.eIsSet(featureID);
	}

} //GEO_PunktImpl
