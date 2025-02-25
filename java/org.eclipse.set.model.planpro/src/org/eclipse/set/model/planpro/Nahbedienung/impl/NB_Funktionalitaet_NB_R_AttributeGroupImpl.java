/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Nahbedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Nahbedienung.AWU_TypeClass;
import org.eclipse.set.model.planpro.Nahbedienung.FA_FAE_TypeClass;
import org.eclipse.set.model.planpro.Nahbedienung.F_ST_Z_TypeClass;
import org.eclipse.set.model.planpro.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup;
import org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage;
import org.eclipse.set.model.planpro.Nahbedienung.SBUE_TypeClass;
import org.eclipse.set.model.planpro.Nahbedienung.SLE_SLS_TypeClass;
import org.eclipse.set.model.planpro.Nahbedienung.WHU_TypeClass;
import org.eclipse.set.model.planpro.Nahbedienung.WUS_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB Funktionalitaet NB RAttribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Funktionalitaet_NB_R_AttributeGroupImpl#getAWU <em>AWU</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Funktionalitaet_NB_R_AttributeGroupImpl#getFSTZ <em>FSTZ</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Funktionalitaet_NB_R_AttributeGroupImpl#getFAFAE <em>FAFAE</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Funktionalitaet_NB_R_AttributeGroupImpl#getSBUE <em>SBUE</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Funktionalitaet_NB_R_AttributeGroupImpl#getSLESLS <em>SLESLS</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Funktionalitaet_NB_R_AttributeGroupImpl#getWHU <em>WHU</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.impl.NB_Funktionalitaet_NB_R_AttributeGroupImpl#getWUS <em>WUS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NB_Funktionalitaet_NB_R_AttributeGroupImpl extends EObjectImpl implements NB_Funktionalitaet_NB_R_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAWU() <em>AWU</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAWU()
	 * @generated
	 * @ordered
	 */
	protected AWU_TypeClass aWU;

	/**
	 * The cached value of the '{@link #getFSTZ() <em>FSTZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFSTZ()
	 * @generated
	 * @ordered
	 */
	protected F_ST_Z_TypeClass fSTZ;

	/**
	 * The cached value of the '{@link #getFAFAE() <em>FAFAE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFAFAE()
	 * @generated
	 * @ordered
	 */
	protected FA_FAE_TypeClass fAFAE;

	/**
	 * The cached value of the '{@link #getSBUE() <em>SBUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSBUE()
	 * @generated
	 * @ordered
	 */
	protected SBUE_TypeClass sBUE;

	/**
	 * The cached value of the '{@link #getSLESLS() <em>SLESLS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSLESLS()
	 * @generated
	 * @ordered
	 */
	protected SLE_SLS_TypeClass sLESLS;

	/**
	 * The cached value of the '{@link #getWHU() <em>WHU</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWHU()
	 * @generated
	 * @ordered
	 */
	protected WHU_TypeClass wHU;

	/**
	 * The cached value of the '{@link #getWUS() <em>WUS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWUS()
	 * @generated
	 * @ordered
	 */
	protected WUS_TypeClass wUS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Funktionalitaet_NB_R_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NahbedienungPackage.Literals.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AWU_TypeClass getAWU() {
		return aWU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAWU(AWU_TypeClass newAWU, NotificationChain msgs) {
		AWU_TypeClass oldAWU = aWU;
		aWU = newAWU;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__AWU, oldAWU, newAWU);
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
	public void setAWU(AWU_TypeClass newAWU) {
		if (newAWU != aWU) {
			NotificationChain msgs = null;
			if (aWU != null)
				msgs = ((InternalEObject)aWU).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__AWU, null, msgs);
			if (newAWU != null)
				msgs = ((InternalEObject)newAWU).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__AWU, null, msgs);
			msgs = basicSetAWU(newAWU, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__AWU, newAWU, newAWU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public F_ST_Z_TypeClass getFSTZ() {
		return fSTZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFSTZ(F_ST_Z_TypeClass newFSTZ, NotificationChain msgs) {
		F_ST_Z_TypeClass oldFSTZ = fSTZ;
		fSTZ = newFSTZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FSTZ, oldFSTZ, newFSTZ);
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
	public void setFSTZ(F_ST_Z_TypeClass newFSTZ) {
		if (newFSTZ != fSTZ) {
			NotificationChain msgs = null;
			if (fSTZ != null)
				msgs = ((InternalEObject)fSTZ).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FSTZ, null, msgs);
			if (newFSTZ != null)
				msgs = ((InternalEObject)newFSTZ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FSTZ, null, msgs);
			msgs = basicSetFSTZ(newFSTZ, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FSTZ, newFSTZ, newFSTZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FA_FAE_TypeClass getFAFAE() {
		return fAFAE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFAFAE(FA_FAE_TypeClass newFAFAE, NotificationChain msgs) {
		FA_FAE_TypeClass oldFAFAE = fAFAE;
		fAFAE = newFAFAE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FAFAE, oldFAFAE, newFAFAE);
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
	public void setFAFAE(FA_FAE_TypeClass newFAFAE) {
		if (newFAFAE != fAFAE) {
			NotificationChain msgs = null;
			if (fAFAE != null)
				msgs = ((InternalEObject)fAFAE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FAFAE, null, msgs);
			if (newFAFAE != null)
				msgs = ((InternalEObject)newFAFAE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FAFAE, null, msgs);
			msgs = basicSetFAFAE(newFAFAE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FAFAE, newFAFAE, newFAFAE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SBUE_TypeClass getSBUE() {
		return sBUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSBUE(SBUE_TypeClass newSBUE, NotificationChain msgs) {
		SBUE_TypeClass oldSBUE = sBUE;
		sBUE = newSBUE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SBUE, oldSBUE, newSBUE);
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
	public void setSBUE(SBUE_TypeClass newSBUE) {
		if (newSBUE != sBUE) {
			NotificationChain msgs = null;
			if (sBUE != null)
				msgs = ((InternalEObject)sBUE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SBUE, null, msgs);
			if (newSBUE != null)
				msgs = ((InternalEObject)newSBUE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SBUE, null, msgs);
			msgs = basicSetSBUE(newSBUE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SBUE, newSBUE, newSBUE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SLE_SLS_TypeClass getSLESLS() {
		return sLESLS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSLESLS(SLE_SLS_TypeClass newSLESLS, NotificationChain msgs) {
		SLE_SLS_TypeClass oldSLESLS = sLESLS;
		sLESLS = newSLESLS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SLESLS, oldSLESLS, newSLESLS);
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
	public void setSLESLS(SLE_SLS_TypeClass newSLESLS) {
		if (newSLESLS != sLESLS) {
			NotificationChain msgs = null;
			if (sLESLS != null)
				msgs = ((InternalEObject)sLESLS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SLESLS, null, msgs);
			if (newSLESLS != null)
				msgs = ((InternalEObject)newSLESLS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SLESLS, null, msgs);
			msgs = basicSetSLESLS(newSLESLS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SLESLS, newSLESLS, newSLESLS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WHU_TypeClass getWHU() {
		return wHU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWHU(WHU_TypeClass newWHU, NotificationChain msgs) {
		WHU_TypeClass oldWHU = wHU;
		wHU = newWHU;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WHU, oldWHU, newWHU);
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
	public void setWHU(WHU_TypeClass newWHU) {
		if (newWHU != wHU) {
			NotificationChain msgs = null;
			if (wHU != null)
				msgs = ((InternalEObject)wHU).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WHU, null, msgs);
			if (newWHU != null)
				msgs = ((InternalEObject)newWHU).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WHU, null, msgs);
			msgs = basicSetWHU(newWHU, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WHU, newWHU, newWHU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WUS_TypeClass getWUS() {
		return wUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWUS(WUS_TypeClass newWUS, NotificationChain msgs) {
		WUS_TypeClass oldWUS = wUS;
		wUS = newWUS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WUS, oldWUS, newWUS);
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
	public void setWUS(WUS_TypeClass newWUS) {
		if (newWUS != wUS) {
			NotificationChain msgs = null;
			if (wUS != null)
				msgs = ((InternalEObject)wUS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WUS, null, msgs);
			if (newWUS != null)
				msgs = ((InternalEObject)newWUS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WUS, null, msgs);
			msgs = basicSetWUS(newWUS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WUS, newWUS, newWUS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__AWU:
				return basicSetAWU(null, msgs);
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FSTZ:
				return basicSetFSTZ(null, msgs);
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FAFAE:
				return basicSetFAFAE(null, msgs);
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SBUE:
				return basicSetSBUE(null, msgs);
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SLESLS:
				return basicSetSLESLS(null, msgs);
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WHU:
				return basicSetWHU(null, msgs);
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WUS:
				return basicSetWUS(null, msgs);
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
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__AWU:
				return getAWU();
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FSTZ:
				return getFSTZ();
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FAFAE:
				return getFAFAE();
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SBUE:
				return getSBUE();
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SLESLS:
				return getSLESLS();
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WHU:
				return getWHU();
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WUS:
				return getWUS();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__AWU:
				setAWU((AWU_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FSTZ:
				setFSTZ((F_ST_Z_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FAFAE:
				setFAFAE((FA_FAE_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SBUE:
				setSBUE((SBUE_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SLESLS:
				setSLESLS((SLE_SLS_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WHU:
				setWHU((WHU_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WUS:
				setWUS((WUS_TypeClass)newValue);
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
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__AWU:
				setAWU((AWU_TypeClass)null);
				return;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FSTZ:
				setFSTZ((F_ST_Z_TypeClass)null);
				return;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FAFAE:
				setFAFAE((FA_FAE_TypeClass)null);
				return;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SBUE:
				setSBUE((SBUE_TypeClass)null);
				return;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SLESLS:
				setSLESLS((SLE_SLS_TypeClass)null);
				return;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WHU:
				setWHU((WHU_TypeClass)null);
				return;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WUS:
				setWUS((WUS_TypeClass)null);
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
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__AWU:
				return aWU != null;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FSTZ:
				return fSTZ != null;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FAFAE:
				return fAFAE != null;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SBUE:
				return sBUE != null;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SLESLS:
				return sLESLS != null;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WHU:
				return wHU != null;
			case NahbedienungPackage.NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WUS:
				return wUS != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //NB_Funktionalitaet_NB_R_AttributeGroupImpl
