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
import org.eclipse.set.model.planpro.Geodaten.Strecke_Meter_TypeClass;
import org.eclipse.set.model.planpro.Geodaten.Strecke_Punkt;

import org.eclipse.set.model.planpro.Verweise.ID_GEO_Knoten_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Strecke_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strecke Punkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.Strecke_PunktImpl#getIDGEOKnoten <em>IDGEO Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.Strecke_PunktImpl#getIDStrecke <em>ID Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.Strecke_PunktImpl#getStreckeMeter <em>Strecke Meter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Strecke_PunktImpl extends Basis_ObjektImpl implements Strecke_Punkt {
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
	 * The cached value of the '{@link #getIDStrecke() <em>ID Strecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStrecke()
	 * @generated
	 * @ordered
	 */
	protected ID_Strecke_TypeClass iDStrecke;

	/**
	 * The cached value of the '{@link #getStreckeMeter() <em>Strecke Meter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreckeMeter()
	 * @generated
	 * @ordered
	 */
	protected Strecke_Meter_TypeClass streckeMeter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Strecke_PunktImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.STRECKE_PUNKT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.STRECKE_PUNKT__IDGEO_KNOTEN, oldIDGEOKnoten, newIDGEOKnoten);
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
				msgs = ((InternalEObject)iDGEOKnoten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.STRECKE_PUNKT__IDGEO_KNOTEN, null, msgs);
			if (newIDGEOKnoten != null)
				msgs = ((InternalEObject)newIDGEOKnoten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.STRECKE_PUNKT__IDGEO_KNOTEN, null, msgs);
			msgs = basicSetIDGEOKnoten(newIDGEOKnoten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.STRECKE_PUNKT__IDGEO_KNOTEN, newIDGEOKnoten, newIDGEOKnoten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Strecke_TypeClass getIDStrecke() {
		return iDStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDStrecke(ID_Strecke_TypeClass newIDStrecke, NotificationChain msgs) {
		ID_Strecke_TypeClass oldIDStrecke = iDStrecke;
		iDStrecke = newIDStrecke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.STRECKE_PUNKT__ID_STRECKE, oldIDStrecke, newIDStrecke);
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
	public void setIDStrecke(ID_Strecke_TypeClass newIDStrecke) {
		if (newIDStrecke != iDStrecke) {
			NotificationChain msgs = null;
			if (iDStrecke != null)
				msgs = ((InternalEObject)iDStrecke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.STRECKE_PUNKT__ID_STRECKE, null, msgs);
			if (newIDStrecke != null)
				msgs = ((InternalEObject)newIDStrecke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.STRECKE_PUNKT__ID_STRECKE, null, msgs);
			msgs = basicSetIDStrecke(newIDStrecke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.STRECKE_PUNKT__ID_STRECKE, newIDStrecke, newIDStrecke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke_Meter_TypeClass getStreckeMeter() {
		return streckeMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreckeMeter(Strecke_Meter_TypeClass newStreckeMeter, NotificationChain msgs) {
		Strecke_Meter_TypeClass oldStreckeMeter = streckeMeter;
		streckeMeter = newStreckeMeter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.STRECKE_PUNKT__STRECKE_METER, oldStreckeMeter, newStreckeMeter);
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
	public void setStreckeMeter(Strecke_Meter_TypeClass newStreckeMeter) {
		if (newStreckeMeter != streckeMeter) {
			NotificationChain msgs = null;
			if (streckeMeter != null)
				msgs = ((InternalEObject)streckeMeter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.STRECKE_PUNKT__STRECKE_METER, null, msgs);
			if (newStreckeMeter != null)
				msgs = ((InternalEObject)newStreckeMeter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.STRECKE_PUNKT__STRECKE_METER, null, msgs);
			msgs = basicSetStreckeMeter(newStreckeMeter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.STRECKE_PUNKT__STRECKE_METER, newStreckeMeter, newStreckeMeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.STRECKE_PUNKT__IDGEO_KNOTEN:
				return basicSetIDGEOKnoten(null, msgs);
			case GeodatenPackage.STRECKE_PUNKT__ID_STRECKE:
				return basicSetIDStrecke(null, msgs);
			case GeodatenPackage.STRECKE_PUNKT__STRECKE_METER:
				return basicSetStreckeMeter(null, msgs);
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
			case GeodatenPackage.STRECKE_PUNKT__IDGEO_KNOTEN:
				return getIDGEOKnoten();
			case GeodatenPackage.STRECKE_PUNKT__ID_STRECKE:
				return getIDStrecke();
			case GeodatenPackage.STRECKE_PUNKT__STRECKE_METER:
				return getStreckeMeter();
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
			case GeodatenPackage.STRECKE_PUNKT__IDGEO_KNOTEN:
				setIDGEOKnoten((ID_GEO_Knoten_TypeClass)newValue);
				return;
			case GeodatenPackage.STRECKE_PUNKT__ID_STRECKE:
				setIDStrecke((ID_Strecke_TypeClass)newValue);
				return;
			case GeodatenPackage.STRECKE_PUNKT__STRECKE_METER:
				setStreckeMeter((Strecke_Meter_TypeClass)newValue);
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
			case GeodatenPackage.STRECKE_PUNKT__IDGEO_KNOTEN:
				setIDGEOKnoten((ID_GEO_Knoten_TypeClass)null);
				return;
			case GeodatenPackage.STRECKE_PUNKT__ID_STRECKE:
				setIDStrecke((ID_Strecke_TypeClass)null);
				return;
			case GeodatenPackage.STRECKE_PUNKT__STRECKE_METER:
				setStreckeMeter((Strecke_Meter_TypeClass)null);
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
			case GeodatenPackage.STRECKE_PUNKT__IDGEO_KNOTEN:
				return iDGEOKnoten != null;
			case GeodatenPackage.STRECKE_PUNKT__ID_STRECKE:
				return iDStrecke != null;
			case GeodatenPackage.STRECKE_PUNKT__STRECKE_METER:
				return streckeMeter != null;
		}
		return super.eIsSet(featureID);
	}

} //Strecke_PunktImpl
