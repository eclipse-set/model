/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang;

import org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Kante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Gleisbezogene Abbildung der BÜ-Kante zur Berechnung des Sicherheitsabstands bei Hp-gedeckten Bahnübergängen. Es ist nur eine punktförmige Verortung auf einer Gleiskante anzugeben.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kante#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Kante()
 * @model extendedMetaData="name='CBUE_Kante' kind='elementOnly'"
 * @generated
 */
public interface BUE_Kante extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige BÜ-Anlage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Anlage</em>' containment reference.
	 * @see #setIDBUEAnlage(ID_BUE_Anlage_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Kante_IDBUEAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Anlage'"
	 * @generated
	 */
	ID_BUE_Anlage_ohne_Proxy_TypeClass getIDBUEAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Kante#getIDBUEAnlage <em>IDBUE Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Anlage</em>' containment reference.
	 * @see #getIDBUEAnlage()
	 * @generated
	 */
	void setIDBUEAnlage(ID_BUE_Anlage_ohne_Proxy_TypeClass value);

} // BUE_Kante
