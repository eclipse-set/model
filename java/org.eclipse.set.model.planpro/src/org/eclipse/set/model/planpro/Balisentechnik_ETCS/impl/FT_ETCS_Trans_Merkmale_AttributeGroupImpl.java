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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Merkmale_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Paket_41_AttributeGroup;
import org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_ETCS_Trans_Paket_N_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FT ETCS Trans Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ETCS_Trans_Merkmale_AttributeGroupImpl#getFTETCSTransPaket41 <em>FTETCS Trans Paket41</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.FT_ETCS_Trans_Merkmale_AttributeGroupImpl#getFTETCSTransPaketN <em>FTETCS Trans Paket N</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FT_ETCS_Trans_Merkmale_AttributeGroupImpl extends EObjectImpl implements FT_ETCS_Trans_Merkmale_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFTETCSTransPaket41() <em>FTETCS Trans Paket41</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTETCSTransPaket41()
	 * @generated
	 * @ordered
	 */
	protected EList<FT_ETCS_Trans_Paket_41_AttributeGroup> fTETCSTransPaket41;

	/**
	 * The cached value of the '{@link #getFTETCSTransPaketN() <em>FTETCS Trans Paket N</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTETCSTransPaketN()
	 * @generated
	 * @ordered
	 */
	protected EList<FT_ETCS_Trans_Paket_N_AttributeGroup> fTETCSTransPaketN;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FT_ETCS_Trans_Merkmale_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getFT_ETCS_Trans_Merkmale_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FT_ETCS_Trans_Paket_41_AttributeGroup> getFTETCSTransPaket41() {
		if (fTETCSTransPaket41 == null) {
			fTETCSTransPaket41 = new EObjectContainmentEList<FT_ETCS_Trans_Paket_41_AttributeGroup>(FT_ETCS_Trans_Paket_41_AttributeGroup.class, this, Balisentechnik_ETCSPackage.FT_ETCS_TRANS_MERKMALE_ATTRIBUTE_GROUP__FTETCS_TRANS_PAKET41);
		}
		return fTETCSTransPaket41;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FT_ETCS_Trans_Paket_N_AttributeGroup> getFTETCSTransPaketN() {
		if (fTETCSTransPaketN == null) {
			fTETCSTransPaketN = new EObjectContainmentEList<FT_ETCS_Trans_Paket_N_AttributeGroup>(FT_ETCS_Trans_Paket_N_AttributeGroup.class, this, Balisentechnik_ETCSPackage.FT_ETCS_TRANS_MERKMALE_ATTRIBUTE_GROUP__FTETCS_TRANS_PAKET_N);
		}
		return fTETCSTransPaketN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_MERKMALE_ATTRIBUTE_GROUP__FTETCS_TRANS_PAKET41:
				return ((InternalEList<?>)getFTETCSTransPaket41()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_MERKMALE_ATTRIBUTE_GROUP__FTETCS_TRANS_PAKET_N:
				return ((InternalEList<?>)getFTETCSTransPaketN()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_MERKMALE_ATTRIBUTE_GROUP__FTETCS_TRANS_PAKET41:
				return getFTETCSTransPaket41();
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_MERKMALE_ATTRIBUTE_GROUP__FTETCS_TRANS_PAKET_N:
				return getFTETCSTransPaketN();
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
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_MERKMALE_ATTRIBUTE_GROUP__FTETCS_TRANS_PAKET41:
				getFTETCSTransPaket41().clear();
				getFTETCSTransPaket41().addAll((Collection<? extends FT_ETCS_Trans_Paket_41_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_MERKMALE_ATTRIBUTE_GROUP__FTETCS_TRANS_PAKET_N:
				getFTETCSTransPaketN().clear();
				getFTETCSTransPaketN().addAll((Collection<? extends FT_ETCS_Trans_Paket_N_AttributeGroup>)newValue);
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
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_MERKMALE_ATTRIBUTE_GROUP__FTETCS_TRANS_PAKET41:
				getFTETCSTransPaket41().clear();
				return;
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_MERKMALE_ATTRIBUTE_GROUP__FTETCS_TRANS_PAKET_N:
				getFTETCSTransPaketN().clear();
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
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_MERKMALE_ATTRIBUTE_GROUP__FTETCS_TRANS_PAKET41:
				return fTETCSTransPaket41 != null && !fTETCSTransPaket41.isEmpty();
			case Balisentechnik_ETCSPackage.FT_ETCS_TRANS_MERKMALE_ATTRIBUTE_GROUP__FTETCS_TRANS_PAKET_N:
				return fTETCSTransPaketN != null && !fTETCSTransPaketN.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //FT_ETCS_Trans_Merkmale_AttributeGroupImpl
