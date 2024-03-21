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

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_BUE_Gleisbezogener_Gefahrraum_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Ausschaltung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Logisches Objekt, das alle Informationen zur Ausschaltung eines Bahnübergangs enthält. Über den Verweis auf BUE Gleisbezogener Gefahrraum findet eine Verortung am zugehörigen Gleis statt, für das der Ausschaltkontakt angeordnet wird. Der Ausschaltkontakt selbst ist über das Objekt Schaltmittel Zuordnung abgebildet. Für die BUE_Ausschaltung ist, in Fahrtrichtung Ausschaltkontakt weg vom BÜ gesehen, die RÜCKGELEGENE Grenze von BUE Gleisbezogener Gefahrraum für die Verortung maßgebend. Die Gefahrraum-Grenze liegt damit in Fahrtrichtung VOR dem Ausschaltkontakt. DB-Regelwerk 815.0032 4 (3) Die Planung der Ausschaltung erfolgt entsprechend der Projektierungshinweise der konkreten BÜ-Technik. Seitens der Ril 815 gibt es dazu keine konkreten Vorgaben. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Ausschaltung#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Ausschaltung()
 * @model extendedMetaData="name='CBUE_Ausschaltung' kind='elementOnly'"
 * @generated
 */
public interface BUE_Ausschaltung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDBUE Gleisbez Gefahrraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den zugehörigen Gefahrraum, auf den sich die Ausschaltung – gleisbezogen - bezieht. Ist bei der Planung von technisch gesicherten BÜ zu befüllen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Gleisbez Gefahrraum</em>' containment reference.
	 * @see #setIDBUEGleisbezGefahrraum(ID_BUE_Gleisbezogener_Gefahrraum_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Ausschaltung_IDBUEGleisbezGefahrraum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Gleisbez_Gefahrraum'"
	 * @generated
	 */
	ID_BUE_Gleisbezogener_Gefahrraum_TypeClass getIDBUEGleisbezGefahrraum();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Ausschaltung#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Gleisbez Gefahrraum</em>' containment reference.
	 * @see #getIDBUEGleisbezGefahrraum()
	 * @generated
	 */
	void setIDBUEGleisbezGefahrraum(ID_BUE_Gleisbezogener_Gefahrraum_TypeClass value);

} // BUE_Ausschaltung
