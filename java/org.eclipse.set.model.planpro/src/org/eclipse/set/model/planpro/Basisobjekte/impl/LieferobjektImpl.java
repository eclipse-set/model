/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Basisobjekte.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.model.planpro.Basisobjekte.Beschreibung_TypeClass;
import org.eclipse.set.model.planpro.Basisobjekte.LO_Ersatz_TypeClass;
import org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup;
import org.eclipse.set.model.planpro.Basisobjekte.Lieferobjekt;

import org.eclipse.set.model.planpro.Verweise.ID_GEO_Punkt_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_LO_Einbau_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lieferobjekt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LieferobjektImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LieferobjektImpl#getIDGEOPunkt <em>IDGEO Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LieferobjektImpl#getIDLOEinbau <em>IDLO Einbau</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LieferobjektImpl#getLOErsatz <em>LO Ersatz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.impl.LieferobjektImpl#getLOMaterial <em>LO Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LieferobjektImpl extends Basis_ObjektImpl implements Lieferobjekt {
	/**
	 * The cached value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected Beschreibung_TypeClass beschreibung;

	/**
	 * The cached value of the '{@link #getIDGEOPunkt() <em>IDGEO Punkt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOPunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_GEO_Punkt_ohne_Proxy_TypeClass> iDGEOPunkt;

	/**
	 * The cached value of the '{@link #getIDLOEinbau() <em>IDLO Einbau</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDLOEinbau()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_LO_Einbau_TypeClass> iDLOEinbau;

	/**
	 * The cached value of the '{@link #getLOErsatz() <em>LO Ersatz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOErsatz()
	 * @generated
	 * @ordered
	 */
	protected LO_Ersatz_TypeClass lOErsatz;

	/**
	 * The cached value of the '{@link #getLOMaterial() <em>LO Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOMaterial()
	 * @generated
	 * @ordered
	 */
	protected LO_Material_AttributeGroup lOMaterial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LieferobjektImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisobjektePackage.Literals.LIEFEROBJEKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Beschreibung_TypeClass getBeschreibung() {
		return beschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeschreibung(Beschreibung_TypeClass newBeschreibung, NotificationChain msgs) {
		Beschreibung_TypeClass oldBeschreibung = beschreibung;
		beschreibung = newBeschreibung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LIEFEROBJEKT__BESCHREIBUNG, oldBeschreibung, newBeschreibung);
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
	public void setBeschreibung(Beschreibung_TypeClass newBeschreibung) {
		if (newBeschreibung != beschreibung) {
			NotificationChain msgs = null;
			if (beschreibung != null)
				msgs = ((InternalEObject)beschreibung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LIEFEROBJEKT__BESCHREIBUNG, null, msgs);
			if (newBeschreibung != null)
				msgs = ((InternalEObject)newBeschreibung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LIEFEROBJEKT__BESCHREIBUNG, null, msgs);
			msgs = basicSetBeschreibung(newBeschreibung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LIEFEROBJEKT__BESCHREIBUNG, newBeschreibung, newBeschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_GEO_Punkt_ohne_Proxy_TypeClass> getIDGEOPunkt() {
		if (iDGEOPunkt == null) {
			iDGEOPunkt = new EObjectContainmentEList<ID_GEO_Punkt_ohne_Proxy_TypeClass>(ID_GEO_Punkt_ohne_Proxy_TypeClass.class, this, BasisobjektePackage.LIEFEROBJEKT__IDGEO_PUNKT);
		}
		return iDGEOPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_LO_Einbau_TypeClass> getIDLOEinbau() {
		if (iDLOEinbau == null) {
			iDLOEinbau = new EObjectContainmentEList<ID_LO_Einbau_TypeClass>(ID_LO_Einbau_TypeClass.class, this, BasisobjektePackage.LIEFEROBJEKT__IDLO_EINBAU);
		}
		return iDLOEinbau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LO_Ersatz_TypeClass getLOErsatz() {
		return lOErsatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLOErsatz(LO_Ersatz_TypeClass newLOErsatz, NotificationChain msgs) {
		LO_Ersatz_TypeClass oldLOErsatz = lOErsatz;
		lOErsatz = newLOErsatz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LIEFEROBJEKT__LO_ERSATZ, oldLOErsatz, newLOErsatz);
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
	public void setLOErsatz(LO_Ersatz_TypeClass newLOErsatz) {
		if (newLOErsatz != lOErsatz) {
			NotificationChain msgs = null;
			if (lOErsatz != null)
				msgs = ((InternalEObject)lOErsatz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LIEFEROBJEKT__LO_ERSATZ, null, msgs);
			if (newLOErsatz != null)
				msgs = ((InternalEObject)newLOErsatz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LIEFEROBJEKT__LO_ERSATZ, null, msgs);
			msgs = basicSetLOErsatz(newLOErsatz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LIEFEROBJEKT__LO_ERSATZ, newLOErsatz, newLOErsatz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LO_Material_AttributeGroup getLOMaterial() {
		return lOMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLOMaterial(LO_Material_AttributeGroup newLOMaterial, NotificationChain msgs) {
		LO_Material_AttributeGroup oldLOMaterial = lOMaterial;
		lOMaterial = newLOMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LIEFEROBJEKT__LO_MATERIAL, oldLOMaterial, newLOMaterial);
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
	public void setLOMaterial(LO_Material_AttributeGroup newLOMaterial) {
		if (newLOMaterial != lOMaterial) {
			NotificationChain msgs = null;
			if (lOMaterial != null)
				msgs = ((InternalEObject)lOMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LIEFEROBJEKT__LO_MATERIAL, null, msgs);
			if (newLOMaterial != null)
				msgs = ((InternalEObject)newLOMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.LIEFEROBJEKT__LO_MATERIAL, null, msgs);
			msgs = basicSetLOMaterial(newLOMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.LIEFEROBJEKT__LO_MATERIAL, newLOMaterial, newLOMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisobjektePackage.LIEFEROBJEKT__BESCHREIBUNG:
				return basicSetBeschreibung(null, msgs);
			case BasisobjektePackage.LIEFEROBJEKT__IDGEO_PUNKT:
				return ((InternalEList<?>)getIDGEOPunkt()).basicRemove(otherEnd, msgs);
			case BasisobjektePackage.LIEFEROBJEKT__IDLO_EINBAU:
				return ((InternalEList<?>)getIDLOEinbau()).basicRemove(otherEnd, msgs);
			case BasisobjektePackage.LIEFEROBJEKT__LO_ERSATZ:
				return basicSetLOErsatz(null, msgs);
			case BasisobjektePackage.LIEFEROBJEKT__LO_MATERIAL:
				return basicSetLOMaterial(null, msgs);
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
			case BasisobjektePackage.LIEFEROBJEKT__BESCHREIBUNG:
				return getBeschreibung();
			case BasisobjektePackage.LIEFEROBJEKT__IDGEO_PUNKT:
				return getIDGEOPunkt();
			case BasisobjektePackage.LIEFEROBJEKT__IDLO_EINBAU:
				return getIDLOEinbau();
			case BasisobjektePackage.LIEFEROBJEKT__LO_ERSATZ:
				return getLOErsatz();
			case BasisobjektePackage.LIEFEROBJEKT__LO_MATERIAL:
				return getLOMaterial();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
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
			case BasisobjektePackage.LIEFEROBJEKT__BESCHREIBUNG:
				setBeschreibung((Beschreibung_TypeClass)newValue);
				return;
			case BasisobjektePackage.LIEFEROBJEKT__IDGEO_PUNKT:
				getIDGEOPunkt().clear();
				getIDGEOPunkt().addAll((Collection<? extends ID_GEO_Punkt_ohne_Proxy_TypeClass>)newValue);
				return;
			case BasisobjektePackage.LIEFEROBJEKT__IDLO_EINBAU:
				getIDLOEinbau().clear();
				getIDLOEinbau().addAll((Collection<? extends ID_LO_Einbau_TypeClass>)newValue);
				return;
			case BasisobjektePackage.LIEFEROBJEKT__LO_ERSATZ:
				setLOErsatz((LO_Ersatz_TypeClass)newValue);
				return;
			case BasisobjektePackage.LIEFEROBJEKT__LO_MATERIAL:
				setLOMaterial((LO_Material_AttributeGroup)newValue);
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
			case BasisobjektePackage.LIEFEROBJEKT__BESCHREIBUNG:
				setBeschreibung((Beschreibung_TypeClass)null);
				return;
			case BasisobjektePackage.LIEFEROBJEKT__IDGEO_PUNKT:
				getIDGEOPunkt().clear();
				return;
			case BasisobjektePackage.LIEFEROBJEKT__IDLO_EINBAU:
				getIDLOEinbau().clear();
				return;
			case BasisobjektePackage.LIEFEROBJEKT__LO_ERSATZ:
				setLOErsatz((LO_Ersatz_TypeClass)null);
				return;
			case BasisobjektePackage.LIEFEROBJEKT__LO_MATERIAL:
				setLOMaterial((LO_Material_AttributeGroup)null);
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
			case BasisobjektePackage.LIEFEROBJEKT__BESCHREIBUNG:
				return beschreibung != null;
			case BasisobjektePackage.LIEFEROBJEKT__IDGEO_PUNKT:
				return iDGEOPunkt != null && !iDGEOPunkt.isEmpty();
			case BasisobjektePackage.LIEFEROBJEKT__IDLO_EINBAU:
				return iDLOEinbau != null && !iDLOEinbau.isEmpty();
			case BasisobjektePackage.LIEFEROBJEKT__LO_ERSATZ:
				return lOErsatz != null;
			case BasisobjektePackage.LIEFEROBJEKT__LO_MATERIAL:
				return lOMaterial != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //LieferobjektImpl
