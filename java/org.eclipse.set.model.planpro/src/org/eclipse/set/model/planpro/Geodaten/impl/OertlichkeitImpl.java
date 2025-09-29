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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.model.planpro.Geodaten.GeodatenPackage;
import org.eclipse.set.model.planpro.Geodaten.Oertlichkeit;
import org.eclipse.set.model.planpro.Geodaten.Oertlichkeit_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup;

import org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Strecke_Punkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oertlichkeit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.OertlichkeitImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.OertlichkeitImpl#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.OertlichkeitImpl#getIDOertlichkeitAwanstBedient <em>ID Oertlichkeit Awanst Bedient</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.OertlichkeitImpl#getIDStreckePunkt <em>ID Strecke Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.impl.OertlichkeitImpl#getOertlichkeitAllg <em>Oertlichkeit Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OertlichkeitImpl extends Basis_ObjektImpl implements Oertlichkeit {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDOertlichkeit() <em>ID Oertlichkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeit()
	 * @generated
	 * @ordered
	 */
	protected ID_Oertlichkeit_TypeClass iDOertlichkeit;

	/**
	 * The cached value of the '{@link #getIDOertlichkeitAwanstBedient() <em>ID Oertlichkeit Awanst Bedient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeitAwanstBedient()
	 * @generated
	 * @ordered
	 */
	protected ID_Oertlichkeit_TypeClass iDOertlichkeitAwanstBedient;

	/**
	 * The cached value of the '{@link #getIDStreckePunkt() <em>ID Strecke Punkt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStreckePunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_Strecke_Punkt_TypeClass> iDStreckePunkt;

	/**
	 * The cached value of the '{@link #getOertlichkeitAllg() <em>Oertlichkeit Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOertlichkeitAllg()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit_Allg_AttributeGroup oertlichkeitAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OertlichkeitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.OERTLICHKEIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Oertlichkeit_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Oertlichkeit_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Oertlichkeit_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Oertlichkeit_TypeClass getIDOertlichkeit() {
		return iDOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDOertlichkeit(ID_Oertlichkeit_TypeClass newIDOertlichkeit, NotificationChain msgs) {
		ID_Oertlichkeit_TypeClass oldIDOertlichkeit = iDOertlichkeit;
		iDOertlichkeit = newIDOertlichkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT, oldIDOertlichkeit, newIDOertlichkeit);
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
	public void setIDOertlichkeit(ID_Oertlichkeit_TypeClass newIDOertlichkeit) {
		if (newIDOertlichkeit != iDOertlichkeit) {
			NotificationChain msgs = null;
			if (iDOertlichkeit != null)
				msgs = ((InternalEObject)iDOertlichkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT, null, msgs);
			if (newIDOertlichkeit != null)
				msgs = ((InternalEObject)newIDOertlichkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT, null, msgs);
			msgs = basicSetIDOertlichkeit(newIDOertlichkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT, newIDOertlichkeit, newIDOertlichkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ID_Oertlichkeit_TypeClass getIDOertlichkeitAwanstBedient() {
		return iDOertlichkeitAwanstBedient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIDOertlichkeitAwanstBedient(ID_Oertlichkeit_TypeClass newIDOertlichkeitAwanstBedient, NotificationChain msgs) {
		ID_Oertlichkeit_TypeClass oldIDOertlichkeitAwanstBedient = iDOertlichkeitAwanstBedient;
		iDOertlichkeitAwanstBedient = newIDOertlichkeitAwanstBedient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT, oldIDOertlichkeitAwanstBedient, newIDOertlichkeitAwanstBedient);
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
	public void setIDOertlichkeitAwanstBedient(ID_Oertlichkeit_TypeClass newIDOertlichkeitAwanstBedient) {
		if (newIDOertlichkeitAwanstBedient != iDOertlichkeitAwanstBedient) {
			NotificationChain msgs = null;
			if (iDOertlichkeitAwanstBedient != null)
				msgs = ((InternalEObject)iDOertlichkeitAwanstBedient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT, null, msgs);
			if (newIDOertlichkeitAwanstBedient != null)
				msgs = ((InternalEObject)newIDOertlichkeitAwanstBedient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT, null, msgs);
			msgs = basicSetIDOertlichkeitAwanstBedient(newIDOertlichkeitAwanstBedient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT, newIDOertlichkeitAwanstBedient, newIDOertlichkeitAwanstBedient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_Strecke_Punkt_TypeClass> getIDStreckePunkt() {
		if (iDStreckePunkt == null) {
			iDStreckePunkt = new EObjectContainmentEList<ID_Strecke_Punkt_TypeClass>(ID_Strecke_Punkt_TypeClass.class, this, GeodatenPackage.OERTLICHKEIT__ID_STRECKE_PUNKT);
		}
		return iDStreckePunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Allg_AttributeGroup getOertlichkeitAllg() {
		return oertlichkeitAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOertlichkeitAllg(Oertlichkeit_Allg_AttributeGroup newOertlichkeitAllg, NotificationChain msgs) {
		Oertlichkeit_Allg_AttributeGroup oldOertlichkeitAllg = oertlichkeitAllg;
		oertlichkeitAllg = newOertlichkeitAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG, oldOertlichkeitAllg, newOertlichkeitAllg);
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
	public void setOertlichkeitAllg(Oertlichkeit_Allg_AttributeGroup newOertlichkeitAllg) {
		if (newOertlichkeitAllg != oertlichkeitAllg) {
			NotificationChain msgs = null;
			if (oertlichkeitAllg != null)
				msgs = ((InternalEObject)oertlichkeitAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG, null, msgs);
			if (newOertlichkeitAllg != null)
				msgs = ((InternalEObject)newOertlichkeitAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG, null, msgs);
			msgs = basicSetOertlichkeitAllg(newOertlichkeitAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG, newOertlichkeitAllg, newOertlichkeitAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT:
				return basicSetIDOertlichkeit(null, msgs);
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT:
				return basicSetIDOertlichkeitAwanstBedient(null, msgs);
			case GeodatenPackage.OERTLICHKEIT__ID_STRECKE_PUNKT:
				return ((InternalEList<?>)getIDStreckePunkt()).basicRemove(otherEnd, msgs);
			case GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG:
				return basicSetOertlichkeitAllg(null, msgs);
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
			case GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG:
				return getBezeichnung();
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT:
				return getIDOertlichkeit();
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT:
				return getIDOertlichkeitAwanstBedient();
			case GeodatenPackage.OERTLICHKEIT__ID_STRECKE_PUNKT:
				return getIDStreckePunkt();
			case GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG:
				return getOertlichkeitAllg();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG:
				setBezeichnung((Oertlichkeit_Bezeichnung_AttributeGroup)newValue);
				return;
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT:
				setIDOertlichkeit((ID_Oertlichkeit_TypeClass)newValue);
				return;
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT:
				setIDOertlichkeitAwanstBedient((ID_Oertlichkeit_TypeClass)newValue);
				return;
			case GeodatenPackage.OERTLICHKEIT__ID_STRECKE_PUNKT:
				getIDStreckePunkt().clear();
				getIDStreckePunkt().addAll((Collection<? extends ID_Strecke_Punkt_TypeClass>)newValue);
				return;
			case GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG:
				setOertlichkeitAllg((Oertlichkeit_Allg_AttributeGroup)newValue);
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
			case GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG:
				setBezeichnung((Oertlichkeit_Bezeichnung_AttributeGroup)null);
				return;
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT:
				setIDOertlichkeit((ID_Oertlichkeit_TypeClass)null);
				return;
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT:
				setIDOertlichkeitAwanstBedient((ID_Oertlichkeit_TypeClass)null);
				return;
			case GeodatenPackage.OERTLICHKEIT__ID_STRECKE_PUNKT:
				getIDStreckePunkt().clear();
				return;
			case GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG:
				setOertlichkeitAllg((Oertlichkeit_Allg_AttributeGroup)null);
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
			case GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG:
				return bezeichnung != null;
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT:
				return iDOertlichkeit != null;
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT:
				return iDOertlichkeitAwanstBedient != null;
			case GeodatenPackage.OERTLICHKEIT__ID_STRECKE_PUNKT:
				return iDStreckePunkt != null && !iDStreckePunkt.isEmpty();
			case GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG:
				return oertlichkeitAllg != null;
		}
		return super.eIsSet(featureID);
	}

} //OertlichkeitImpl
