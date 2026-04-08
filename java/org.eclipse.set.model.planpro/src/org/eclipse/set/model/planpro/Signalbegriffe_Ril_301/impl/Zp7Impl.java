/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Package;
import org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Zp7;

import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zp7</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Zp7Impl extends Signalbegriff_ID_TypeClassImpl implements Zp7 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Zp7Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Signalbegriffe_Ril_301Package.eINSTANCE.getZp7();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBeleuchtbar() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeschreibung() {
		return "zwei weiße Lichter senkrecht übereinander";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGeltungsbereichDS() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGeltungsbereichDV() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGeltungsbereichSBahnB() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGeltungsbereichSBahnHH() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKurzbezeichnungDS() {
		return "Zp 7";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKurzbezeichnungDV() {
		return "Zp 7";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSchaltbar() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isZusatzMoeglich() {
		return false;
	}

} //Zp7Impl
