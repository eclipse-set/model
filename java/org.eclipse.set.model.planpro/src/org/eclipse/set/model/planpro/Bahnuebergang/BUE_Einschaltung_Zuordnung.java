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

import org.eclipse.set.model.planpro.Verweise.ID_BUE_Einschaltung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_BUE_Gleisbezogener_Gefahrraum_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Einschaltung Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Logisches Objekt zur Zuordnung zwischen BUE Einschaltung und zugehörigem BUE Gleisbezogener Gefahrraum. Im Regelfall wirkt eine BUE_Einschaltung direkt auf einen gleisbezogenen Gefahrraum; das Zuordnungsobjekt wäre nicht erforderlich. Liegt jedoch zwischen BUE_Einschaltung und dem BÜ eine Weichenverbindung, wird eine Zuordnung der BUE_Einschaltung auf mehrere gleisbezogene Gefahrräume notwendig. Diese Verbindung stellt das Zuordnungsobjekt her. Zur Vereinheitlichung wurde auf eine Choice zwischen direktem Verweis von BUE_Einschaltung auf BUE_Gleisbezogener_Gefahrraum und den Verweisen durch das Zuordnungsobjekt verzichtet. DB-Regelwerk Dieser Anwendungsfall ist im Regelwerk der DB AG nicht explizit beschrieben.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Einschaltung_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Einschaltung_Zuordnung#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Einschaltung_Zuordnung()
 * @model extendedMetaData="name='CBUE_Einschaltung_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface BUE_Einschaltung_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDBUE Einschaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf denjenigen Einschaltpunkt, der die Einschaltung des betreffenden BUE Gleisbezogener Gefahrraum bewirkt. DB-Regelwerk Einschaltstreckenberechnung 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Einschaltung</em>' containment reference.
	 * @see #setIDBUEEinschaltung(ID_BUE_Einschaltung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Einschaltung_Zuordnung_IDBUEEinschaltung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Einschaltung'"
	 * @generated
	 */
	ID_BUE_Einschaltung_TypeClass getIDBUEEinschaltung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Einschaltung_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Einschaltung</em>' containment reference.
	 * @see #getIDBUEEinschaltung()
	 * @generated
	 */
	void setIDBUEEinschaltung(ID_BUE_Einschaltung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDBUE Gleisbez Gefahrraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den zugehörigen Gefahrraum, auf den sich die BUE_Einschaltung - gleisbezogen - bezieht. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Gleisbez Gefahrraum</em>' containment reference.
	 * @see #setIDBUEGleisbezGefahrraum(ID_BUE_Gleisbezogener_Gefahrraum_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Einschaltung_Zuordnung_IDBUEGleisbezGefahrraum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Gleisbez_Gefahrraum'"
	 * @generated
	 */
	ID_BUE_Gleisbezogener_Gefahrraum_TypeClass getIDBUEGleisbezGefahrraum();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Einschaltung_Zuordnung#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Gleisbez Gefahrraum</em>' containment reference.
	 * @see #getIDBUEGleisbezGefahrraum()
	 * @generated
	 */
	void setIDBUEGleisbezGefahrraum(ID_BUE_Gleisbezogener_Gefahrraum_TypeClass value);

} // BUE_Einschaltung_Zuordnung
