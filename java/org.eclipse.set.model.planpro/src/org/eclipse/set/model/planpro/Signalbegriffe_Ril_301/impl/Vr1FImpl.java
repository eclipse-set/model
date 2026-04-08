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
import org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Vr1F;

import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriff_ID_TypeClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vr1 F</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Vr1FImpl extends Signalbegriff_ID_TypeClassImpl implements Vr1F {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vr1FImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Signalbegriffe_Ril_301Package.eINSTANCE.getVr1F();
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
		return "Tageszeichen: Die runde Scheibe liegt waagerecht. Wo ein Flügel vorhanden ist, zeigt er senkrecht nach unten. Nachtzeichen: Zwei grüne Lichter nach rechts steigend.";
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
		return "Vr 1";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKurzbezeichnungDV() {
		return "Vr 1";
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

} //Vr1FImpl
