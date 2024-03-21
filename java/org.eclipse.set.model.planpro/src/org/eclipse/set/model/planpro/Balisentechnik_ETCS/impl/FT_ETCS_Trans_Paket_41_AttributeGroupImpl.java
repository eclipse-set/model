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
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.D_LEVELTR_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Paket_41_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.L_ACKLEVELTR_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.M_LEVELTR_TypeClass;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.NID_STM_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FT ETCS Trans Paket 41 Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ETCS_Trans_Paket_41_AttributeGroupImpl#getDLEVELTR <em>DLEVELTR</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ETCS_Trans_Paket_41_AttributeGroupImpl#getLACKLEVELTR <em>LACKLEVELTR</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ETCS_Trans_Paket_41_AttributeGroupImpl#getMLEVELTR <em>MLEVELTR</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ETCS_Trans_Paket_41_AttributeGroupImpl#getNIDSTM <em>NIDSTM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FT_ETCS_Trans_Paket_41_AttributeGroupImpl extends EObjectImpl implements FT_ETCS_Trans_Paket_41_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDLEVELTR() <em>DLEVELTR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLEVELTR()
	 * @generated
	 * @ordered
	 */
	protected D_LEVELTR_TypeClass dLEVELTR;

	/**
	 * The cached value of the '{@link #getLACKLEVELTR() <em>LACKLEVELTR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLACKLEVELTR()
	 * @generated
	 * @ordered
	 */
	protected L_ACKLEVELTR_TypeClass lACKLEVELTR;

	/**
	 * The cached value of the '{@link #getMLEVELTR() <em>MLEVELTR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLEVELTR()
	 * @generated
	 * @ordered
	 */
	protected M_LEVELTR_TypeClass mLEVELTR;

	/**
	 * The cached value of the '{@link #getNIDSTM() <em>NIDSTM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNIDSTM()
	 * @generated
	 * @ordered
	 */
	protected NID_STM_TypeClass nIDSTM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FT_ETCS_Trans_Paket_41_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getFT_ETCS_Trans_Paket_41_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public D_LEVELTR_TypeClass getDLEVELTR() {
		return dLEVELTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDLEVELTR(D_LEVELTR_TypeClass newDLEVELTR, NotificationChain msgs) {
		D_LEVELTR_TypeClass oldDLEVELTR = dLEVELTR;
		dLEVELTR = newDLEVELTR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__DLEVELTR, oldDLEVELTR, newDLEVELTR);
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
	public void setDLEVELTR(D_LEVELTR_TypeClass newDLEVELTR) {
		if (newDLEVELTR != dLEVELTR) {
			NotificationChain msgs = null;
			if (dLEVELTR != null)
				msgs = ((InternalEObject)dLEVELTR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__DLEVELTR, null, msgs);
			if (newDLEVELTR != null)
				msgs = ((InternalEObject)newDLEVELTR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__DLEVELTR, null, msgs);
			msgs = basicSetDLEVELTR(newDLEVELTR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__DLEVELTR, newDLEVELTR, newDLEVELTR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public L_ACKLEVELTR_TypeClass getLACKLEVELTR() {
		return lACKLEVELTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLACKLEVELTR(L_ACKLEVELTR_TypeClass newLACKLEVELTR, NotificationChain msgs) {
		L_ACKLEVELTR_TypeClass oldLACKLEVELTR = lACKLEVELTR;
		lACKLEVELTR = newLACKLEVELTR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__LACKLEVELTR, oldLACKLEVELTR, newLACKLEVELTR);
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
	public void setLACKLEVELTR(L_ACKLEVELTR_TypeClass newLACKLEVELTR) {
		if (newLACKLEVELTR != lACKLEVELTR) {
			NotificationChain msgs = null;
			if (lACKLEVELTR != null)
				msgs = ((InternalEObject)lACKLEVELTR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__LACKLEVELTR, null, msgs);
			if (newLACKLEVELTR != null)
				msgs = ((InternalEObject)newLACKLEVELTR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__LACKLEVELTR, null, msgs);
			msgs = basicSetLACKLEVELTR(newLACKLEVELTR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__LACKLEVELTR, newLACKLEVELTR, newLACKLEVELTR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public M_LEVELTR_TypeClass getMLEVELTR() {
		return mLEVELTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLEVELTR(M_LEVELTR_TypeClass newMLEVELTR, NotificationChain msgs) {
		M_LEVELTR_TypeClass oldMLEVELTR = mLEVELTR;
		mLEVELTR = newMLEVELTR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__MLEVELTR, oldMLEVELTR, newMLEVELTR);
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
	public void setMLEVELTR(M_LEVELTR_TypeClass newMLEVELTR) {
		if (newMLEVELTR != mLEVELTR) {
			NotificationChain msgs = null;
			if (mLEVELTR != null)
				msgs = ((InternalEObject)mLEVELTR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__MLEVELTR, null, msgs);
			if (newMLEVELTR != null)
				msgs = ((InternalEObject)newMLEVELTR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__MLEVELTR, null, msgs);
			msgs = basicSetMLEVELTR(newMLEVELTR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__MLEVELTR, newMLEVELTR, newMLEVELTR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NID_STM_TypeClass getNIDSTM() {
		return nIDSTM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNIDSTM(NID_STM_TypeClass newNIDSTM, NotificationChain msgs) {
		NID_STM_TypeClass oldNIDSTM = nIDSTM;
		nIDSTM = newNIDSTM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__NIDSTM, oldNIDSTM, newNIDSTM);
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
	public void setNIDSTM(NID_STM_TypeClass newNIDSTM) {
		if (newNIDSTM != nIDSTM) {
			NotificationChain msgs = null;
			if (nIDSTM != null)
				msgs = ((InternalEObject)nIDSTM).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__NIDSTM, null, msgs);
			if (newNIDSTM != null)
				msgs = ((InternalEObject)newNIDSTM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__NIDSTM, null, msgs);
			msgs = basicSetNIDSTM(newNIDSTM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__NIDSTM, newNIDSTM, newNIDSTM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__DLEVELTR:
				return basicSetDLEVELTR(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__LACKLEVELTR:
				return basicSetLACKLEVELTR(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__MLEVELTR:
				return basicSetMLEVELTR(null, msgs);
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__NIDSTM:
				return basicSetNIDSTM(null, msgs);
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
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__DLEVELTR:
				return getDLEVELTR();
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__LACKLEVELTR:
				return getLACKLEVELTR();
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__MLEVELTR:
				return getMLEVELTR();
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__NIDSTM:
				return getNIDSTM();
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
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__DLEVELTR:
				setDLEVELTR((D_LEVELTR_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__LACKLEVELTR:
				setLACKLEVELTR((L_ACKLEVELTR_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__MLEVELTR:
				setMLEVELTR((M_LEVELTR_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__NIDSTM:
				setNIDSTM((NID_STM_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__DLEVELTR:
				setDLEVELTR((D_LEVELTR_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__LACKLEVELTR:
				setLACKLEVELTR((L_ACKLEVELTR_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__MLEVELTR:
				setMLEVELTR((M_LEVELTR_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__NIDSTM:
				setNIDSTM((NID_STM_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__DLEVELTR:
				return dLEVELTR != null;
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__LACKLEVELTR:
				return lACKLEVELTR != null;
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__MLEVELTR:
				return mLEVELTR != null;
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_PAKET_41_ATTRIBUTE_GROUP__NIDSTM:
				return nIDSTM != null;
		}
		return super.eIsSet(featureID);
	}

} //FT_ETCS_Trans_Paket_41_AttributeGroupImpl
