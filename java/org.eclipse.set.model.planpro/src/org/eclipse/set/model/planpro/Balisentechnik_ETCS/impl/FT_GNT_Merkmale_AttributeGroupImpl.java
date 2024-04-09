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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Delta_VGES_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Delta_VLES_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Delta_VZES_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_GNT_Punktart_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.LLA_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Neigung_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.SBE_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.STZ_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.VGR_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.VLA_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.VZ_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZLA_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FT GNT Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_GNT_Merkmale_AttributeGroupImpl#getDeltaVGES <em>Delta VGES</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_GNT_Merkmale_AttributeGroupImpl#getDeltaVLES <em>Delta VLES</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_GNT_Merkmale_AttributeGroupImpl#getDeltaVZES <em>Delta VZES</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_GNT_Merkmale_AttributeGroupImpl#getFTGNTPunktart <em>FTGNT Punktart</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_GNT_Merkmale_AttributeGroupImpl#getLLA <em>LLA</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_GNT_Merkmale_AttributeGroupImpl#getNeigung <em>Neigung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_GNT_Merkmale_AttributeGroupImpl#getSBE <em>SBE</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_GNT_Merkmale_AttributeGroupImpl#getSTZ <em>STZ</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_GNT_Merkmale_AttributeGroupImpl#getVGR <em>VGR</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_GNT_Merkmale_AttributeGroupImpl#getVLA <em>VLA</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_GNT_Merkmale_AttributeGroupImpl#getVZ <em>VZ</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_GNT_Merkmale_AttributeGroupImpl#getZLA <em>ZLA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FT_GNT_Merkmale_AttributeGroupImpl extends EObjectImpl implements FT_GNT_Merkmale_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDeltaVGES() <em>Delta VGES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaVGES()
	 * @generated
	 * @ordered
	 */
	protected Delta_VGES_TypeClass deltaVGES;

	/**
	 * The cached value of the '{@link #getDeltaVLES() <em>Delta VLES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaVLES()
	 * @generated
	 * @ordered
	 */
	protected Delta_VLES_TypeClass deltaVLES;

	/**
	 * The cached value of the '{@link #getDeltaVZES() <em>Delta VZES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaVZES()
	 * @generated
	 * @ordered
	 */
	protected Delta_VZES_TypeClass deltaVZES;

	/**
	 * The cached value of the '{@link #getFTGNTPunktart() <em>FTGNT Punktart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTGNTPunktart()
	 * @generated
	 * @ordered
	 */
	protected FT_GNT_Punktart_TypeClass fTGNTPunktart;

	/**
	 * The cached value of the '{@link #getLLA() <em>LLA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLLA()
	 * @generated
	 * @ordered
	 */
	protected LLA_TypeClass lLA;

	/**
	 * The cached value of the '{@link #getNeigung() <em>Neigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeigung()
	 * @generated
	 * @ordered
	 */
	protected Neigung_TypeClass neigung;

	/**
	 * The cached value of the '{@link #getSBE() <em>SBE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSBE()
	 * @generated
	 * @ordered
	 */
	protected SBE_TypeClass sBE;

	/**
	 * The cached value of the '{@link #getSTZ() <em>STZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTZ()
	 * @generated
	 * @ordered
	 */
	protected STZ_TypeClass sTZ;

	/**
	 * The cached value of the '{@link #getVGR() <em>VGR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVGR()
	 * @generated
	 * @ordered
	 */
	protected VGR_TypeClass vGR;

	/**
	 * The cached value of the '{@link #getVLA() <em>VLA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVLA()
	 * @generated
	 * @ordered
	 */
	protected VLA_TypeClass vLA;

	/**
	 * The cached value of the '{@link #getVZ() <em>VZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVZ()
	 * @generated
	 * @ordered
	 */
	protected VZ_TypeClass vZ;

	/**
	 * The cached value of the '{@link #getZLA() <em>ZLA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLA()
	 * @generated
	 * @ordered
	 */
	protected ZLA_TypeClass zLA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FT_GNT_Merkmale_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getFT_GNT_Merkmale_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delta_VGES_TypeClass getDeltaVGES() {
		return deltaVGES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaVGES(Delta_VGES_TypeClass newDeltaVGES, NotificationChain msgs) {
		Delta_VGES_TypeClass oldDeltaVGES = deltaVGES;
		deltaVGES = newDeltaVGES;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VGES, oldDeltaVGES, newDeltaVGES);
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
	public void setDeltaVGES(Delta_VGES_TypeClass newDeltaVGES) {
		if (newDeltaVGES != deltaVGES) {
			NotificationChain msgs = null;
			if (deltaVGES != null)
				msgs = ((InternalEObject)deltaVGES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VGES, null, msgs);
			if (newDeltaVGES != null)
				msgs = ((InternalEObject)newDeltaVGES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VGES, null, msgs);
			msgs = basicSetDeltaVGES(newDeltaVGES, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VGES, newDeltaVGES, newDeltaVGES));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delta_VLES_TypeClass getDeltaVLES() {
		return deltaVLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaVLES(Delta_VLES_TypeClass newDeltaVLES, NotificationChain msgs) {
		Delta_VLES_TypeClass oldDeltaVLES = deltaVLES;
		deltaVLES = newDeltaVLES;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VLES, oldDeltaVLES, newDeltaVLES);
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
	public void setDeltaVLES(Delta_VLES_TypeClass newDeltaVLES) {
		if (newDeltaVLES != deltaVLES) {
			NotificationChain msgs = null;
			if (deltaVLES != null)
				msgs = ((InternalEObject)deltaVLES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VLES, null, msgs);
			if (newDeltaVLES != null)
				msgs = ((InternalEObject)newDeltaVLES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VLES, null, msgs);
			msgs = basicSetDeltaVLES(newDeltaVLES, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VLES, newDeltaVLES, newDeltaVLES));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delta_VZES_TypeClass getDeltaVZES() {
		return deltaVZES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaVZES(Delta_VZES_TypeClass newDeltaVZES, NotificationChain msgs) {
		Delta_VZES_TypeClass oldDeltaVZES = deltaVZES;
		deltaVZES = newDeltaVZES;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VZES, oldDeltaVZES, newDeltaVZES);
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
	public void setDeltaVZES(Delta_VZES_TypeClass newDeltaVZES) {
		if (newDeltaVZES != deltaVZES) {
			NotificationChain msgs = null;
			if (deltaVZES != null)
				msgs = ((InternalEObject)deltaVZES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VZES, null, msgs);
			if (newDeltaVZES != null)
				msgs = ((InternalEObject)newDeltaVZES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VZES, null, msgs);
			msgs = basicSetDeltaVZES(newDeltaVZES, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VZES, newDeltaVZES, newDeltaVZES));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_GNT_Punktart_TypeClass getFTGNTPunktart() {
		return fTGNTPunktart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFTGNTPunktart(FT_GNT_Punktart_TypeClass newFTGNTPunktart, NotificationChain msgs) {
		FT_GNT_Punktart_TypeClass oldFTGNTPunktart = fTGNTPunktart;
		fTGNTPunktart = newFTGNTPunktart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__FTGNT_PUNKTART, oldFTGNTPunktart, newFTGNTPunktart);
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
	public void setFTGNTPunktart(FT_GNT_Punktart_TypeClass newFTGNTPunktart) {
		if (newFTGNTPunktart != fTGNTPunktart) {
			NotificationChain msgs = null;
			if (fTGNTPunktart != null)
				msgs = ((InternalEObject)fTGNTPunktart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__FTGNT_PUNKTART, null, msgs);
			if (newFTGNTPunktart != null)
				msgs = ((InternalEObject)newFTGNTPunktart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__FTGNT_PUNKTART, null, msgs);
			msgs = basicSetFTGNTPunktart(newFTGNTPunktart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__FTGNT_PUNKTART, newFTGNTPunktart, newFTGNTPunktart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LLA_TypeClass getLLA() {
		return lLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLLA(LLA_TypeClass newLLA, NotificationChain msgs) {
		LLA_TypeClass oldLLA = lLA;
		lLA = newLLA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__LLA, oldLLA, newLLA);
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
	public void setLLA(LLA_TypeClass newLLA) {
		if (newLLA != lLA) {
			NotificationChain msgs = null;
			if (lLA != null)
				msgs = ((InternalEObject)lLA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__LLA, null, msgs);
			if (newLLA != null)
				msgs = ((InternalEObject)newLLA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__LLA, null, msgs);
			msgs = basicSetLLA(newLLA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__LLA, newLLA, newLLA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Neigung_TypeClass getNeigung() {
		return neigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeigung(Neigung_TypeClass newNeigung, NotificationChain msgs) {
		Neigung_TypeClass oldNeigung = neigung;
		neigung = newNeigung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__NEIGUNG, oldNeigung, newNeigung);
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
	public void setNeigung(Neigung_TypeClass newNeigung) {
		if (newNeigung != neigung) {
			NotificationChain msgs = null;
			if (neigung != null)
				msgs = ((InternalEObject)neigung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__NEIGUNG, null, msgs);
			if (newNeigung != null)
				msgs = ((InternalEObject)newNeigung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__NEIGUNG, null, msgs);
			msgs = basicSetNeigung(newNeigung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__NEIGUNG, newNeigung, newNeigung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SBE_TypeClass getSBE() {
		return sBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSBE(SBE_TypeClass newSBE, NotificationChain msgs) {
		SBE_TypeClass oldSBE = sBE;
		sBE = newSBE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__SBE, oldSBE, newSBE);
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
	public void setSBE(SBE_TypeClass newSBE) {
		if (newSBE != sBE) {
			NotificationChain msgs = null;
			if (sBE != null)
				msgs = ((InternalEObject)sBE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__SBE, null, msgs);
			if (newSBE != null)
				msgs = ((InternalEObject)newSBE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__SBE, null, msgs);
			msgs = basicSetSBE(newSBE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__SBE, newSBE, newSBE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public STZ_TypeClass getSTZ() {
		return sTZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTZ(STZ_TypeClass newSTZ, NotificationChain msgs) {
		STZ_TypeClass oldSTZ = sTZ;
		sTZ = newSTZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__STZ, oldSTZ, newSTZ);
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
	public void setSTZ(STZ_TypeClass newSTZ) {
		if (newSTZ != sTZ) {
			NotificationChain msgs = null;
			if (sTZ != null)
				msgs = ((InternalEObject)sTZ).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__STZ, null, msgs);
			if (newSTZ != null)
				msgs = ((InternalEObject)newSTZ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__STZ, null, msgs);
			msgs = basicSetSTZ(newSTZ, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__STZ, newSTZ, newSTZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VGR_TypeClass getVGR() {
		return vGR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVGR(VGR_TypeClass newVGR, NotificationChain msgs) {
		VGR_TypeClass oldVGR = vGR;
		vGR = newVGR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VGR, oldVGR, newVGR);
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
	public void setVGR(VGR_TypeClass newVGR) {
		if (newVGR != vGR) {
			NotificationChain msgs = null;
			if (vGR != null)
				msgs = ((InternalEObject)vGR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VGR, null, msgs);
			if (newVGR != null)
				msgs = ((InternalEObject)newVGR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VGR, null, msgs);
			msgs = basicSetVGR(newVGR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VGR, newVGR, newVGR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VLA_TypeClass getVLA() {
		return vLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVLA(VLA_TypeClass newVLA, NotificationChain msgs) {
		VLA_TypeClass oldVLA = vLA;
		vLA = newVLA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VLA, oldVLA, newVLA);
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
	public void setVLA(VLA_TypeClass newVLA) {
		if (newVLA != vLA) {
			NotificationChain msgs = null;
			if (vLA != null)
				msgs = ((InternalEObject)vLA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VLA, null, msgs);
			if (newVLA != null)
				msgs = ((InternalEObject)newVLA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VLA, null, msgs);
			msgs = basicSetVLA(newVLA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VLA, newVLA, newVLA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VZ_TypeClass getVZ() {
		return vZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVZ(VZ_TypeClass newVZ, NotificationChain msgs) {
		VZ_TypeClass oldVZ = vZ;
		vZ = newVZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VZ, oldVZ, newVZ);
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
	public void setVZ(VZ_TypeClass newVZ) {
		if (newVZ != vZ) {
			NotificationChain msgs = null;
			if (vZ != null)
				msgs = ((InternalEObject)vZ).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VZ, null, msgs);
			if (newVZ != null)
				msgs = ((InternalEObject)newVZ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VZ, null, msgs);
			msgs = basicSetVZ(newVZ, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VZ, newVZ, newVZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLA_TypeClass getZLA() {
		return zLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLA(ZLA_TypeClass newZLA, NotificationChain msgs) {
		ZLA_TypeClass oldZLA = zLA;
		zLA = newZLA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__ZLA, oldZLA, newZLA);
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
	public void setZLA(ZLA_TypeClass newZLA) {
		if (newZLA != zLA) {
			NotificationChain msgs = null;
			if (zLA != null)
				msgs = ((InternalEObject)zLA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__ZLA, null, msgs);
			if (newZLA != null)
				msgs = ((InternalEObject)newZLA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__ZLA, null, msgs);
			msgs = basicSetZLA(newZLA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__ZLA, newZLA, newZLA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VGES:
				return basicSetDeltaVGES(null, msgs);
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VLES:
				return basicSetDeltaVLES(null, msgs);
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VZES:
				return basicSetDeltaVZES(null, msgs);
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__FTGNT_PUNKTART:
				return basicSetFTGNTPunktart(null, msgs);
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__LLA:
				return basicSetLLA(null, msgs);
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__NEIGUNG:
				return basicSetNeigung(null, msgs);
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__SBE:
				return basicSetSBE(null, msgs);
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__STZ:
				return basicSetSTZ(null, msgs);
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VGR:
				return basicSetVGR(null, msgs);
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VLA:
				return basicSetVLA(null, msgs);
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VZ:
				return basicSetVZ(null, msgs);
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__ZLA:
				return basicSetZLA(null, msgs);
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
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VGES:
				return getDeltaVGES();
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VLES:
				return getDeltaVLES();
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VZES:
				return getDeltaVZES();
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__FTGNT_PUNKTART:
				return getFTGNTPunktart();
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__LLA:
				return getLLA();
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__NEIGUNG:
				return getNeigung();
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__SBE:
				return getSBE();
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__STZ:
				return getSTZ();
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VGR:
				return getVGR();
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VLA:
				return getVLA();
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VZ:
				return getVZ();
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__ZLA:
				return getZLA();
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
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VGES:
				setDeltaVGES((Delta_VGES_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VLES:
				setDeltaVLES((Delta_VLES_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VZES:
				setDeltaVZES((Delta_VZES_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__FTGNT_PUNKTART:
				setFTGNTPunktart((FT_GNT_Punktart_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__LLA:
				setLLA((LLA_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__NEIGUNG:
				setNeigung((Neigung_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__SBE:
				setSBE((SBE_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__STZ:
				setSTZ((STZ_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VGR:
				setVGR((VGR_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VLA:
				setVLA((VLA_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VZ:
				setVZ((VZ_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__ZLA:
				setZLA((ZLA_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VGES:
				setDeltaVGES((Delta_VGES_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VLES:
				setDeltaVLES((Delta_VLES_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VZES:
				setDeltaVZES((Delta_VZES_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__FTGNT_PUNKTART:
				setFTGNTPunktart((FT_GNT_Punktart_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__LLA:
				setLLA((LLA_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__NEIGUNG:
				setNeigung((Neigung_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__SBE:
				setSBE((SBE_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__STZ:
				setSTZ((STZ_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VGR:
				setVGR((VGR_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VLA:
				setVLA((VLA_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VZ:
				setVZ((VZ_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__ZLA:
				setZLA((ZLA_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VGES:
				return deltaVGES != null;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VLES:
				return deltaVLES != null;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__DELTA_VZES:
				return deltaVZES != null;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__FTGNT_PUNKTART:
				return fTGNTPunktart != null;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__LLA:
				return lLA != null;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__NEIGUNG:
				return neigung != null;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__SBE:
				return sBE != null;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__STZ:
				return sTZ != null;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VGR:
				return vGR != null;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VLA:
				return vLA != null;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__VZ:
				return vZ != null;
			case Balisentechnik_ETCSPackage.FT_GNT_MERKMALE_ATTRIBUTE_GROUP__ZLA:
				return zLA != null;
		}
		return super.eIsSet(featureID);
	}

} //FT_GNT_Merkmale_AttributeGroupImpl
