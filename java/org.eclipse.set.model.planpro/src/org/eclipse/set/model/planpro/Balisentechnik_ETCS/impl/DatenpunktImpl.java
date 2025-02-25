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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Bezug_Funktional_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_ETCS_Adresse_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Telegramm_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Einmesspunkt_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.LEU_Steuernde_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.model.planpro.Verweise.ID_RBC_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datenpunkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DatenpunktImpl#getDatenpunktAllg <em>Datenpunkt Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DatenpunktImpl#getDatenpunktEinmesspunkt <em>Datenpunkt Einmesspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DatenpunktImpl#getDPBezugFunktional <em>DP Bezug Funktional</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DatenpunktImpl#getDPETCSAdresse <em>DPETCS Adresse</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DatenpunktImpl#getDPTyp <em>DP Typ</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DatenpunktImpl#getIDRBC <em>IDRBC</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DatenpunktImpl#getLEUSteuernde <em>LEU Steuernde</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DatenpunktImpl#getDPTelegramm <em>DP Telegramm</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.DatenpunktImpl#getDPTelegrammESG <em>DP Telegramm ESG</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatenpunktImpl extends Punkt_ObjektImpl implements Datenpunkt {
	/**
	 * The cached value of the '{@link #getDatenpunktAllg() <em>Datenpunkt Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenpunktAllg()
	 * @generated
	 * @ordered
	 */
	protected Datenpunkt_Allg_AttributeGroup datenpunktAllg;

	/**
	 * The cached value of the '{@link #getDatenpunktEinmesspunkt() <em>Datenpunkt Einmesspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenpunktEinmesspunkt()
	 * @generated
	 * @ordered
	 */
	protected Datenpunkt_Einmesspunkt_AttributeGroup datenpunktEinmesspunkt;

	/**
	 * The cached value of the '{@link #getDPBezugFunktional() <em>DP Bezug Funktional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPBezugFunktional()
	 * @generated
	 * @ordered
	 */
	protected DP_Bezug_Funktional_AttributeGroup dPBezugFunktional;

	/**
	 * The cached value of the '{@link #getDPETCSAdresse() <em>DPETCS Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPETCSAdresse()
	 * @generated
	 * @ordered
	 */
	protected DP_ETCS_Adresse_AttributeGroup dPETCSAdresse;

	/**
	 * The cached value of the '{@link #getDPTyp() <em>DP Typ</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTyp()
	 * @generated
	 * @ordered
	 */
	protected EList<DP_Typ_AttributeGroup> dPTyp;

	/**
	 * The cached value of the '{@link #getIDRBC() <em>IDRBC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<ID_RBC_TypeClass> iDRBC;

	/**
	 * The cached value of the '{@link #getLEUSteuernde() <em>LEU Steuernde</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUSteuernde()
	 * @generated
	 * @ordered
	 */
	protected LEU_Steuernde_AttributeGroup lEUSteuernde;

	/**
	 * The cached value of the '{@link #getDPTelegramm() <em>DP Telegramm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTelegramm()
	 * @generated
	 * @ordered
	 */
	protected EList<DP_Telegramm_AttributeGroup> dPTelegramm;

	/**
	 * The cached value of the '{@link #getDPTelegrammESG() <em>DP Telegramm ESG</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTelegrammESG()
	 * @generated
	 * @ordered
	 */
	protected EList<DP_Telegramm_ESG_AttributeGroup> dPTelegrammESG;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatenpunktImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datenpunkt_Allg_AttributeGroup getDatenpunktAllg() {
		return datenpunktAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatenpunktAllg(Datenpunkt_Allg_AttributeGroup newDatenpunktAllg, NotificationChain msgs) {
		Datenpunkt_Allg_AttributeGroup oldDatenpunktAllg = datenpunktAllg;
		datenpunktAllg = newDatenpunktAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_ALLG, oldDatenpunktAllg, newDatenpunktAllg);
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
	public void setDatenpunktAllg(Datenpunkt_Allg_AttributeGroup newDatenpunktAllg) {
		if (newDatenpunktAllg != datenpunktAllg) {
			NotificationChain msgs = null;
			if (datenpunktAllg != null)
				msgs = ((InternalEObject)datenpunktAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_ALLG, null, msgs);
			if (newDatenpunktAllg != null)
				msgs = ((InternalEObject)newDatenpunktAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_ALLG, null, msgs);
			msgs = basicSetDatenpunktAllg(newDatenpunktAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_ALLG, newDatenpunktAllg, newDatenpunktAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datenpunkt_Einmesspunkt_AttributeGroup getDatenpunktEinmesspunkt() {
		return datenpunktEinmesspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatenpunktEinmesspunkt(Datenpunkt_Einmesspunkt_AttributeGroup newDatenpunktEinmesspunkt, NotificationChain msgs) {
		Datenpunkt_Einmesspunkt_AttributeGroup oldDatenpunktEinmesspunkt = datenpunktEinmesspunkt;
		datenpunktEinmesspunkt = newDatenpunktEinmesspunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_EINMESSPUNKT, oldDatenpunktEinmesspunkt, newDatenpunktEinmesspunkt);
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
	public void setDatenpunktEinmesspunkt(Datenpunkt_Einmesspunkt_AttributeGroup newDatenpunktEinmesspunkt) {
		if (newDatenpunktEinmesspunkt != datenpunktEinmesspunkt) {
			NotificationChain msgs = null;
			if (datenpunktEinmesspunkt != null)
				msgs = ((InternalEObject)datenpunktEinmesspunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_EINMESSPUNKT, null, msgs);
			if (newDatenpunktEinmesspunkt != null)
				msgs = ((InternalEObject)newDatenpunktEinmesspunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_EINMESSPUNKT, null, msgs);
			msgs = basicSetDatenpunktEinmesspunkt(newDatenpunktEinmesspunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_EINMESSPUNKT, newDatenpunktEinmesspunkt, newDatenpunktEinmesspunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Bezug_Funktional_AttributeGroup getDPBezugFunktional() {
		return dPBezugFunktional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPBezugFunktional(DP_Bezug_Funktional_AttributeGroup newDPBezugFunktional, NotificationChain msgs) {
		DP_Bezug_Funktional_AttributeGroup oldDPBezugFunktional = dPBezugFunktional;
		dPBezugFunktional = newDPBezugFunktional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT__DP_BEZUG_FUNKTIONAL, oldDPBezugFunktional, newDPBezugFunktional);
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
	public void setDPBezugFunktional(DP_Bezug_Funktional_AttributeGroup newDPBezugFunktional) {
		if (newDPBezugFunktional != dPBezugFunktional) {
			NotificationChain msgs = null;
			if (dPBezugFunktional != null)
				msgs = ((InternalEObject)dPBezugFunktional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT__DP_BEZUG_FUNKTIONAL, null, msgs);
			if (newDPBezugFunktional != null)
				msgs = ((InternalEObject)newDPBezugFunktional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT__DP_BEZUG_FUNKTIONAL, null, msgs);
			msgs = basicSetDPBezugFunktional(newDPBezugFunktional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT__DP_BEZUG_FUNKTIONAL, newDPBezugFunktional, newDPBezugFunktional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_ETCS_Adresse_AttributeGroup getDPETCSAdresse() {
		return dPETCSAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPETCSAdresse(DP_ETCS_Adresse_AttributeGroup newDPETCSAdresse, NotificationChain msgs) {
		DP_ETCS_Adresse_AttributeGroup oldDPETCSAdresse = dPETCSAdresse;
		dPETCSAdresse = newDPETCSAdresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT__DPETCS_ADRESSE, oldDPETCSAdresse, newDPETCSAdresse);
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
	public void setDPETCSAdresse(DP_ETCS_Adresse_AttributeGroup newDPETCSAdresse) {
		if (newDPETCSAdresse != dPETCSAdresse) {
			NotificationChain msgs = null;
			if (dPETCSAdresse != null)
				msgs = ((InternalEObject)dPETCSAdresse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT__DPETCS_ADRESSE, null, msgs);
			if (newDPETCSAdresse != null)
				msgs = ((InternalEObject)newDPETCSAdresse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT__DPETCS_ADRESSE, null, msgs);
			msgs = basicSetDPETCSAdresse(newDPETCSAdresse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT__DPETCS_ADRESSE, newDPETCSAdresse, newDPETCSAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DP_Typ_AttributeGroup> getDPTyp() {
		if (dPTyp == null) {
			dPTyp = new EObjectContainmentEList<DP_Typ_AttributeGroup>(DP_Typ_AttributeGroup.class, this, Balisentechnik_ETCSPackage.DATENPUNKT__DP_TYP);
		}
		return dPTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ID_RBC_TypeClass> getIDRBC() {
		if (iDRBC == null) {
			iDRBC = new EObjectContainmentEList<ID_RBC_TypeClass>(ID_RBC_TypeClass.class, this, Balisentechnik_ETCSPackage.DATENPUNKT__IDRBC);
		}
		return iDRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Steuernde_AttributeGroup getLEUSteuernde() {
		return lEUSteuernde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLEUSteuernde(LEU_Steuernde_AttributeGroup newLEUSteuernde, NotificationChain msgs) {
		LEU_Steuernde_AttributeGroup oldLEUSteuernde = lEUSteuernde;
		lEUSteuernde = newLEUSteuernde;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT__LEU_STEUERNDE, oldLEUSteuernde, newLEUSteuernde);
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
	public void setLEUSteuernde(LEU_Steuernde_AttributeGroup newLEUSteuernde) {
		if (newLEUSteuernde != lEUSteuernde) {
			NotificationChain msgs = null;
			if (lEUSteuernde != null)
				msgs = ((InternalEObject)lEUSteuernde).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT__LEU_STEUERNDE, null, msgs);
			if (newLEUSteuernde != null)
				msgs = ((InternalEObject)newLEUSteuernde).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT__LEU_STEUERNDE, null, msgs);
			msgs = basicSetLEUSteuernde(newLEUSteuernde, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT__LEU_STEUERNDE, newLEUSteuernde, newLEUSteuernde));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DP_Telegramm_AttributeGroup> getDPTelegramm() {
		if (dPTelegramm == null) {
			dPTelegramm = new EObjectContainmentEList<DP_Telegramm_AttributeGroup>(DP_Telegramm_AttributeGroup.class, this, Balisentechnik_ETCSPackage.DATENPUNKT__DP_TELEGRAMM);
		}
		return dPTelegramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DP_Telegramm_ESG_AttributeGroup> getDPTelegrammESG() {
		if (dPTelegrammESG == null) {
			dPTelegrammESG = new EObjectContainmentEList<DP_Telegramm_ESG_AttributeGroup>(DP_Telegramm_ESG_AttributeGroup.class, this, Balisentechnik_ETCSPackage.DATENPUNKT__DP_TELEGRAMM_ESG);
		}
		return dPTelegrammESG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_ALLG:
				return basicSetDatenpunktAllg(null, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_EINMESSPUNKT:
				return basicSetDatenpunktEinmesspunkt(null, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_BEZUG_FUNKTIONAL:
				return basicSetDPBezugFunktional(null, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT__DPETCS_ADRESSE:
				return basicSetDPETCSAdresse(null, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TYP:
				return ((InternalEList<?>)getDPTyp()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT__IDRBC:
				return ((InternalEList<?>)getIDRBC()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT__LEU_STEUERNDE:
				return basicSetLEUSteuernde(null, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TELEGRAMM:
				return ((InternalEList<?>)getDPTelegramm()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TELEGRAMM_ESG:
				return ((InternalEList<?>)getDPTelegrammESG()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_ALLG:
				return getDatenpunktAllg();
			case Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_EINMESSPUNKT:
				return getDatenpunktEinmesspunkt();
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_BEZUG_FUNKTIONAL:
				return getDPBezugFunktional();
			case Balisentechnik_ETCSPackage.DATENPUNKT__DPETCS_ADRESSE:
				return getDPETCSAdresse();
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TYP:
				return getDPTyp();
			case Balisentechnik_ETCSPackage.DATENPUNKT__IDRBC:
				return getIDRBC();
			case Balisentechnik_ETCSPackage.DATENPUNKT__LEU_STEUERNDE:
				return getLEUSteuernde();
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TELEGRAMM:
				return getDPTelegramm();
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TELEGRAMM_ESG:
				return getDPTelegrammESG();
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
			case Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_ALLG:
				setDatenpunktAllg((Datenpunkt_Allg_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_EINMESSPUNKT:
				setDatenpunktEinmesspunkt((Datenpunkt_Einmesspunkt_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_BEZUG_FUNKTIONAL:
				setDPBezugFunktional((DP_Bezug_Funktional_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT__DPETCS_ADRESSE:
				setDPETCSAdresse((DP_ETCS_Adresse_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TYP:
				getDPTyp().clear();
				getDPTyp().addAll((Collection<? extends DP_Typ_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT__IDRBC:
				getIDRBC().clear();
				getIDRBC().addAll((Collection<? extends ID_RBC_TypeClass>)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT__LEU_STEUERNDE:
				setLEUSteuernde((LEU_Steuernde_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TELEGRAMM:
				getDPTelegramm().clear();
				getDPTelegramm().addAll((Collection<? extends DP_Telegramm_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TELEGRAMM_ESG:
				getDPTelegrammESG().clear();
				getDPTelegrammESG().addAll((Collection<? extends DP_Telegramm_ESG_AttributeGroup>)newValue);
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
			case Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_ALLG:
				setDatenpunktAllg((Datenpunkt_Allg_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_EINMESSPUNKT:
				setDatenpunktEinmesspunkt((Datenpunkt_Einmesspunkt_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_BEZUG_FUNKTIONAL:
				setDPBezugFunktional((DP_Bezug_Funktional_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT__DPETCS_ADRESSE:
				setDPETCSAdresse((DP_ETCS_Adresse_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TYP:
				getDPTyp().clear();
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT__IDRBC:
				getIDRBC().clear();
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT__LEU_STEUERNDE:
				setLEUSteuernde((LEU_Steuernde_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TELEGRAMM:
				getDPTelegramm().clear();
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TELEGRAMM_ESG:
				getDPTelegrammESG().clear();
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
			case Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_ALLG:
				return datenpunktAllg != null;
			case Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_EINMESSPUNKT:
				return datenpunktEinmesspunkt != null;
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_BEZUG_FUNKTIONAL:
				return dPBezugFunktional != null;
			case Balisentechnik_ETCSPackage.DATENPUNKT__DPETCS_ADRESSE:
				return dPETCSAdresse != null;
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TYP:
				return dPTyp != null && !dPTyp.isEmpty();
			case Balisentechnik_ETCSPackage.DATENPUNKT__IDRBC:
				return iDRBC != null && !iDRBC.isEmpty();
			case Balisentechnik_ETCSPackage.DATENPUNKT__LEU_STEUERNDE:
				return lEUSteuernde != null;
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TELEGRAMM:
				return dPTelegramm != null && !dPTelegramm.isEmpty();
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TELEGRAMM_ESG:
				return dPTelegrammESG != null && !dPTelegrammESG.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //DatenpunktImpl
