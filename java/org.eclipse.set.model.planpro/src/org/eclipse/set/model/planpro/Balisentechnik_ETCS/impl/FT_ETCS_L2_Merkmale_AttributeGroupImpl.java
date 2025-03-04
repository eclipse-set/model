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
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_L2_Merkmale_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_L2_Typ_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.VBC_Kennung_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.VBC_NID_C_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.VBC_Setzen_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.VBC_Timer_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FT ETCS L2 Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ETCS_L2_Merkmale_AttributeGroupImpl#getFTETCSL2Typ <em>FTETCSL2 Typ</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ETCS_L2_Merkmale_AttributeGroupImpl#getVBCKennung <em>VBC Kennung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ETCS_L2_Merkmale_AttributeGroupImpl#getVBCNIDC <em>VBCNIDC</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ETCS_L2_Merkmale_AttributeGroupImpl#getVBCSetzen <em>VBC Setzen</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ETCS_L2_Merkmale_AttributeGroupImpl#getVBCTimer <em>VBC Timer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FT_ETCS_L2_Merkmale_AttributeGroupImpl extends EObjectImpl implements FT_ETCS_L2_Merkmale_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFTETCSL2Typ() <em>FTETCSL2 Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTETCSL2Typ()
	 * @generated
	 * @ordered
	 */
	protected FT_ETCS_L2_Typ_TypeClass fTETCSL2Typ;

	/**
	 * The cached value of the '{@link #getVBCKennung() <em>VBC Kennung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVBCKennung()
	 * @generated
	 * @ordered
	 */
	protected VBC_Kennung_TypeClass vBCKennung;

	/**
	 * The cached value of the '{@link #getVBCNIDC() <em>VBCNIDC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVBCNIDC()
	 * @generated
	 * @ordered
	 */
	protected VBC_NID_C_TypeClass vBCNIDC;

	/**
	 * The cached value of the '{@link #getVBCSetzen() <em>VBC Setzen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVBCSetzen()
	 * @generated
	 * @ordered
	 */
	protected VBC_Setzen_TypeClass vBCSetzen;

	/**
	 * The cached value of the '{@link #getVBCTimer() <em>VBC Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVBCTimer()
	 * @generated
	 * @ordered
	 */
	protected VBC_Timer_TypeClass vBCTimer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FT_ETCS_L2_Merkmale_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getFT_ETCS_L2_Merkmale_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ETCS_L2_Typ_TypeClass getFTETCSL2Typ() {
		return fTETCSL2Typ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFTETCSL2Typ(FT_ETCS_L2_Typ_TypeClass newFTETCSL2Typ, NotificationChain msgs) {
		FT_ETCS_L2_Typ_TypeClass oldFTETCSL2Typ = fTETCSL2Typ;
		fTETCSL2Typ = newFTETCSL2Typ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP, oldFTETCSL2Typ, newFTETCSL2Typ);
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
	public void setFTETCSL2Typ(FT_ETCS_L2_Typ_TypeClass newFTETCSL2Typ) {
		if (newFTETCSL2Typ != fTETCSL2Typ) {
			NotificationChain msgs = null;
			if (fTETCSL2Typ != null)
				msgs = ((InternalEObject)fTETCSL2Typ).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP, null, msgs);
			if (newFTETCSL2Typ != null)
				msgs = ((InternalEObject)newFTETCSL2Typ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP, null, msgs);
			msgs = basicSetFTETCSL2Typ(newFTETCSL2Typ, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP, newFTETCSL2Typ, newFTETCSL2Typ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VBC_Kennung_TypeClass getVBCKennung() {
		return vBCKennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVBCKennung(VBC_Kennung_TypeClass newVBCKennung, NotificationChain msgs) {
		VBC_Kennung_TypeClass oldVBCKennung = vBCKennung;
		vBCKennung = newVBCKennung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_KENNUNG, oldVBCKennung, newVBCKennung);
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
	public void setVBCKennung(VBC_Kennung_TypeClass newVBCKennung) {
		if (newVBCKennung != vBCKennung) {
			NotificationChain msgs = null;
			if (vBCKennung != null)
				msgs = ((InternalEObject)vBCKennung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_KENNUNG, null, msgs);
			if (newVBCKennung != null)
				msgs = ((InternalEObject)newVBCKennung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_KENNUNG, null, msgs);
			msgs = basicSetVBCKennung(newVBCKennung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_KENNUNG, newVBCKennung, newVBCKennung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VBC_NID_C_TypeClass getVBCNIDC() {
		return vBCNIDC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVBCNIDC(VBC_NID_C_TypeClass newVBCNIDC, NotificationChain msgs) {
		VBC_NID_C_TypeClass oldVBCNIDC = vBCNIDC;
		vBCNIDC = newVBCNIDC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBCNIDC, oldVBCNIDC, newVBCNIDC);
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
	public void setVBCNIDC(VBC_NID_C_TypeClass newVBCNIDC) {
		if (newVBCNIDC != vBCNIDC) {
			NotificationChain msgs = null;
			if (vBCNIDC != null)
				msgs = ((InternalEObject)vBCNIDC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBCNIDC, null, msgs);
			if (newVBCNIDC != null)
				msgs = ((InternalEObject)newVBCNIDC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBCNIDC, null, msgs);
			msgs = basicSetVBCNIDC(newVBCNIDC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBCNIDC, newVBCNIDC, newVBCNIDC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VBC_Setzen_TypeClass getVBCSetzen() {
		return vBCSetzen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVBCSetzen(VBC_Setzen_TypeClass newVBCSetzen, NotificationChain msgs) {
		VBC_Setzen_TypeClass oldVBCSetzen = vBCSetzen;
		vBCSetzen = newVBCSetzen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_SETZEN, oldVBCSetzen, newVBCSetzen);
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
	public void setVBCSetzen(VBC_Setzen_TypeClass newVBCSetzen) {
		if (newVBCSetzen != vBCSetzen) {
			NotificationChain msgs = null;
			if (vBCSetzen != null)
				msgs = ((InternalEObject)vBCSetzen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_SETZEN, null, msgs);
			if (newVBCSetzen != null)
				msgs = ((InternalEObject)newVBCSetzen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_SETZEN, null, msgs);
			msgs = basicSetVBCSetzen(newVBCSetzen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_SETZEN, newVBCSetzen, newVBCSetzen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VBC_Timer_TypeClass getVBCTimer() {
		return vBCTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVBCTimer(VBC_Timer_TypeClass newVBCTimer, NotificationChain msgs) {
		VBC_Timer_TypeClass oldVBCTimer = vBCTimer;
		vBCTimer = newVBCTimer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_TIMER, oldVBCTimer, newVBCTimer);
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
	public void setVBCTimer(VBC_Timer_TypeClass newVBCTimer) {
		if (newVBCTimer != vBCTimer) {
			NotificationChain msgs = null;
			if (vBCTimer != null)
				msgs = ((InternalEObject)vBCTimer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_TIMER, null, msgs);
			if (newVBCTimer != null)
				msgs = ((InternalEObject)newVBCTimer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_TIMER, null, msgs);
			msgs = basicSetVBCTimer(newVBCTimer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_TIMER, newVBCTimer, newVBCTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP:
				return basicSetFTETCSL2Typ(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_KENNUNG:
				return basicSetVBCKennung(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBCNIDC:
				return basicSetVBCNIDC(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_SETZEN:
				return basicSetVBCSetzen(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_TIMER:
				return basicSetVBCTimer(null, msgs);
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
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP:
				return getFTETCSL2Typ();
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_KENNUNG:
				return getVBCKennung();
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBCNIDC:
				return getVBCNIDC();
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_SETZEN:
				return getVBCSetzen();
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_TIMER:
				return getVBCTimer();
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
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP:
				setFTETCSL2Typ((FT_ETCS_L2_Typ_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_KENNUNG:
				setVBCKennung((VBC_Kennung_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBCNIDC:
				setVBCNIDC((VBC_NID_C_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_SETZEN:
				setVBCSetzen((VBC_Setzen_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_TIMER:
				setVBCTimer((VBC_Timer_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP:
				setFTETCSL2Typ((FT_ETCS_L2_Typ_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_KENNUNG:
				setVBCKennung((VBC_Kennung_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBCNIDC:
				setVBCNIDC((VBC_NID_C_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_SETZEN:
				setVBCSetzen((VBC_Setzen_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_TIMER:
				setVBCTimer((VBC_Timer_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP:
				return fTETCSL2Typ != null;
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_KENNUNG:
				return vBCKennung != null;
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBCNIDC:
				return vBCNIDC != null;
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_SETZEN:
				return vBCSetzen != null;
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__VBC_TIMER:
				return vBCTimer != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //FT_ETCS_L2_Merkmale_AttributeGroupImpl
