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

import org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.El34Zusatz;
import org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Package;

import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>El34 Zusatz</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class El34ZusatzImpl extends Signalbegriff_ID_TypeClassImpl implements El34Zusatz {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected El34ZusatzImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Signalbegriffe_Ril_301Package.eINSTANCE.getEl34Zusatz();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBeleuchtbar() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeschreibung() {
		return "Zusatztafel, auf der ein weißer Kennbuchstabe gezeigt wird";
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
		return false;
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
	public String getLangbezeichnung() {
		return "Zusatztafel “Richtungsangabe“";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSchaltbar() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isZusatzMoeglich() {
		return false;
	}

} //El34ZusatzImpl
