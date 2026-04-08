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

import org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Hl1;
import org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Package;

import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hl1</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Hl1Impl extends Signalbegriff_ID_TypeClassImpl implements Hl1 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hl1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Signalbegriffe_Ril_301Package.eINSTANCE.getHl1();
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
		return "ein grünes Licht";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGeltungsbereichDS() {
		return false;
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
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKurzbezeichnungDV() {
		return "Hl 1";
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

} //Hl1Impl
