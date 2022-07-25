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
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_Art_TypeClass;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GESG_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GETCS_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GGNT_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GSonst_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GTrans_AttributeGroup;
import org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GZBS_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DP Typ Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.DP_Typ_AttributeGroupImpl#getDPTypArt <em>DP Typ Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.DP_Typ_AttributeGroupImpl#getDPTypGESG <em>DP Typ GESG</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.DP_Typ_AttributeGroupImpl#getDPTypGETCS <em>DP Typ GETCS</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.DP_Typ_AttributeGroupImpl#getDPTypGGNT <em>DP Typ GGNT</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.DP_Typ_AttributeGroupImpl#getDPTypGSonst <em>DP Typ GSonst</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.DP_Typ_AttributeGroupImpl#getDPTypGTrans <em>DP Typ GTrans</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.DP_Typ_AttributeGroupImpl#getDPTypGZBS <em>DP Typ GZBS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DP_Typ_AttributeGroupImpl extends MinimalEObjectImpl.Container implements DP_Typ_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDPTypArt() <em>DP Typ Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTypArt()
	 * @generated
	 * @ordered
	 */
	protected DP_Typ_Art_TypeClass dPTypArt;

	/**
	 * The cached value of the '{@link #getDPTypGESG() <em>DP Typ GESG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTypGESG()
	 * @generated
	 * @ordered
	 */
	protected DP_Typ_GESG_AttributeGroup dPTypGESG;

	/**
	 * The cached value of the '{@link #getDPTypGETCS() <em>DP Typ GETCS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTypGETCS()
	 * @generated
	 * @ordered
	 */
	protected DP_Typ_GETCS_AttributeGroup dPTypGETCS;

	/**
	 * The cached value of the '{@link #getDPTypGGNT() <em>DP Typ GGNT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTypGGNT()
	 * @generated
	 * @ordered
	 */
	protected DP_Typ_GGNT_AttributeGroup dPTypGGNT;

	/**
	 * The cached value of the '{@link #getDPTypGSonst() <em>DP Typ GSonst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTypGSonst()
	 * @generated
	 * @ordered
	 */
	protected DP_Typ_GSonst_AttributeGroup dPTypGSonst;

	/**
	 * The cached value of the '{@link #getDPTypGTrans() <em>DP Typ GTrans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTypGTrans()
	 * @generated
	 * @ordered
	 */
	protected DP_Typ_GTrans_AttributeGroup dPTypGTrans;

	/**
	 * The cached value of the '{@link #getDPTypGZBS() <em>DP Typ GZBS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTypGZBS()
	 * @generated
	 * @ordered
	 */
	protected DP_Typ_GZBS_AttributeGroup dPTypGZBS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DP_Typ_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDP_Typ_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_Art_TypeClass getDPTypArt() {
		return dPTypArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPTypArt(DP_Typ_Art_TypeClass newDPTypArt, NotificationChain msgs) {
		DP_Typ_Art_TypeClass oldDPTypArt = dPTypArt;
		dPTypArt = newDPTypArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_ART, oldDPTypArt, newDPTypArt);
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
	public void setDPTypArt(DP_Typ_Art_TypeClass newDPTypArt) {
		if (newDPTypArt != dPTypArt) {
			NotificationChain msgs = null;
			if (dPTypArt != null)
				msgs = ((InternalEObject)dPTypArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_ART, null, msgs);
			if (newDPTypArt != null)
				msgs = ((InternalEObject)newDPTypArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_ART, null, msgs);
			msgs = basicSetDPTypArt(newDPTypArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_ART, newDPTypArt, newDPTypArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_GESG_AttributeGroup getDPTypGESG() {
		return dPTypGESG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPTypGESG(DP_Typ_GESG_AttributeGroup newDPTypGESG, NotificationChain msgs) {
		DP_Typ_GESG_AttributeGroup oldDPTypGESG = dPTypGESG;
		dPTypGESG = newDPTypGESG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GESG, oldDPTypGESG, newDPTypGESG);
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
	public void setDPTypGESG(DP_Typ_GESG_AttributeGroup newDPTypGESG) {
		if (newDPTypGESG != dPTypGESG) {
			NotificationChain msgs = null;
			if (dPTypGESG != null)
				msgs = ((InternalEObject)dPTypGESG).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GESG, null, msgs);
			if (newDPTypGESG != null)
				msgs = ((InternalEObject)newDPTypGESG).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GESG, null, msgs);
			msgs = basicSetDPTypGESG(newDPTypGESG, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GESG, newDPTypGESG, newDPTypGESG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_GETCS_AttributeGroup getDPTypGETCS() {
		return dPTypGETCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPTypGETCS(DP_Typ_GETCS_AttributeGroup newDPTypGETCS, NotificationChain msgs) {
		DP_Typ_GETCS_AttributeGroup oldDPTypGETCS = dPTypGETCS;
		dPTypGETCS = newDPTypGETCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GETCS, oldDPTypGETCS, newDPTypGETCS);
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
	public void setDPTypGETCS(DP_Typ_GETCS_AttributeGroup newDPTypGETCS) {
		if (newDPTypGETCS != dPTypGETCS) {
			NotificationChain msgs = null;
			if (dPTypGETCS != null)
				msgs = ((InternalEObject)dPTypGETCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GETCS, null, msgs);
			if (newDPTypGETCS != null)
				msgs = ((InternalEObject)newDPTypGETCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GETCS, null, msgs);
			msgs = basicSetDPTypGETCS(newDPTypGETCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GETCS, newDPTypGETCS, newDPTypGETCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_GGNT_AttributeGroup getDPTypGGNT() {
		return dPTypGGNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPTypGGNT(DP_Typ_GGNT_AttributeGroup newDPTypGGNT, NotificationChain msgs) {
		DP_Typ_GGNT_AttributeGroup oldDPTypGGNT = dPTypGGNT;
		dPTypGGNT = newDPTypGGNT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GGNT, oldDPTypGGNT, newDPTypGGNT);
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
	public void setDPTypGGNT(DP_Typ_GGNT_AttributeGroup newDPTypGGNT) {
		if (newDPTypGGNT != dPTypGGNT) {
			NotificationChain msgs = null;
			if (dPTypGGNT != null)
				msgs = ((InternalEObject)dPTypGGNT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GGNT, null, msgs);
			if (newDPTypGGNT != null)
				msgs = ((InternalEObject)newDPTypGGNT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GGNT, null, msgs);
			msgs = basicSetDPTypGGNT(newDPTypGGNT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GGNT, newDPTypGGNT, newDPTypGGNT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_GSonst_AttributeGroup getDPTypGSonst() {
		return dPTypGSonst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPTypGSonst(DP_Typ_GSonst_AttributeGroup newDPTypGSonst, NotificationChain msgs) {
		DP_Typ_GSonst_AttributeGroup oldDPTypGSonst = dPTypGSonst;
		dPTypGSonst = newDPTypGSonst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GSONST, oldDPTypGSonst, newDPTypGSonst);
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
	public void setDPTypGSonst(DP_Typ_GSonst_AttributeGroup newDPTypGSonst) {
		if (newDPTypGSonst != dPTypGSonst) {
			NotificationChain msgs = null;
			if (dPTypGSonst != null)
				msgs = ((InternalEObject)dPTypGSonst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GSONST, null, msgs);
			if (newDPTypGSonst != null)
				msgs = ((InternalEObject)newDPTypGSonst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GSONST, null, msgs);
			msgs = basicSetDPTypGSonst(newDPTypGSonst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GSONST, newDPTypGSonst, newDPTypGSonst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_GTrans_AttributeGroup getDPTypGTrans() {
		return dPTypGTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPTypGTrans(DP_Typ_GTrans_AttributeGroup newDPTypGTrans, NotificationChain msgs) {
		DP_Typ_GTrans_AttributeGroup oldDPTypGTrans = dPTypGTrans;
		dPTypGTrans = newDPTypGTrans;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GTRANS, oldDPTypGTrans, newDPTypGTrans);
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
	public void setDPTypGTrans(DP_Typ_GTrans_AttributeGroup newDPTypGTrans) {
		if (newDPTypGTrans != dPTypGTrans) {
			NotificationChain msgs = null;
			if (dPTypGTrans != null)
				msgs = ((InternalEObject)dPTypGTrans).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GTRANS, null, msgs);
			if (newDPTypGTrans != null)
				msgs = ((InternalEObject)newDPTypGTrans).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GTRANS, null, msgs);
			msgs = basicSetDPTypGTrans(newDPTypGTrans, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GTRANS, newDPTypGTrans, newDPTypGTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_GZBS_AttributeGroup getDPTypGZBS() {
		return dPTypGZBS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPTypGZBS(DP_Typ_GZBS_AttributeGroup newDPTypGZBS, NotificationChain msgs) {
		DP_Typ_GZBS_AttributeGroup oldDPTypGZBS = dPTypGZBS;
		dPTypGZBS = newDPTypGZBS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GZBS, oldDPTypGZBS, newDPTypGZBS);
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
	public void setDPTypGZBS(DP_Typ_GZBS_AttributeGroup newDPTypGZBS) {
		if (newDPTypGZBS != dPTypGZBS) {
			NotificationChain msgs = null;
			if (dPTypGZBS != null)
				msgs = ((InternalEObject)dPTypGZBS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GZBS, null, msgs);
			if (newDPTypGZBS != null)
				msgs = ((InternalEObject)newDPTypGZBS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GZBS, null, msgs);
			msgs = basicSetDPTypGZBS(newDPTypGZBS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GZBS, newDPTypGZBS, newDPTypGZBS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_ART:
				return basicSetDPTypArt(null, msgs);
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GESG:
				return basicSetDPTypGESG(null, msgs);
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GETCS:
				return basicSetDPTypGETCS(null, msgs);
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GGNT:
				return basicSetDPTypGGNT(null, msgs);
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GSONST:
				return basicSetDPTypGSonst(null, msgs);
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GTRANS:
				return basicSetDPTypGTrans(null, msgs);
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GZBS:
				return basicSetDPTypGZBS(null, msgs);
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
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_ART:
				return getDPTypArt();
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GESG:
				return getDPTypGESG();
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GETCS:
				return getDPTypGETCS();
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GGNT:
				return getDPTypGGNT();
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GSONST:
				return getDPTypGSonst();
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GTRANS:
				return getDPTypGTrans();
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GZBS:
				return getDPTypGZBS();
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
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_ART:
				setDPTypArt((DP_Typ_Art_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GESG:
				setDPTypGESG((DP_Typ_GESG_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GETCS:
				setDPTypGETCS((DP_Typ_GETCS_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GGNT:
				setDPTypGGNT((DP_Typ_GGNT_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GSONST:
				setDPTypGSonst((DP_Typ_GSonst_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GTRANS:
				setDPTypGTrans((DP_Typ_GTrans_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GZBS:
				setDPTypGZBS((DP_Typ_GZBS_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_ART:
				setDPTypArt((DP_Typ_Art_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GESG:
				setDPTypGESG((DP_Typ_GESG_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GETCS:
				setDPTypGETCS((DP_Typ_GETCS_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GGNT:
				setDPTypGGNT((DP_Typ_GGNT_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GSONST:
				setDPTypGSonst((DP_Typ_GSonst_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GTRANS:
				setDPTypGTrans((DP_Typ_GTrans_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GZBS:
				setDPTypGZBS((DP_Typ_GZBS_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_ART:
				return dPTypArt != null;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GESG:
				return dPTypGESG != null;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GETCS:
				return dPTypGETCS != null;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GGNT:
				return dPTypGGNT != null;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GSONST:
				return dPTypGSonst != null;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GTRANS:
				return dPTypGTrans != null;
			case Balisentechnik_ETCSPackage.DP_TYP_ATTRIBUTE_GROUP__DP_TYP_GZBS:
				return dPTypGZBS != null;
		}
		return super.eIsSet(featureID);
	}

} //DP_Typ_AttributeGroupImpl
