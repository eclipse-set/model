/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_BUE_Einschaltung_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Deckendes Signal Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Das Zuordnungsobjekt BUE_Deckendes_Signal bildet die diesbezügliche Angabe in der Signaltabelle 1 sowie in der Einschaltstreckenberechnung ab. Die Angaben in der Signaltabelle 1 sowie in der Einschaltstreckenberechnung beziehen sich auf das deckende Signal (Haupt-/LS-Signal) und nicht auf die den BÜ-Schließvorgang anstoßende Fahrstraße. DB-Regelwerk Signaltabelle 1, Zeile 33 und 34 Einschaltstreckenberechnung 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getSicherheitsabstand <em>Sicherheitsabstand</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Deckendes_Signal_Zuordnung()
 * @model extendedMetaData="name='CBUE_Deckendes_Signal_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface BUE_Deckendes_Signal_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDBUE Einschaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zu dem deckenden Signal zugehörige Einschaltung. DB-Regelwerk Signaltabelle 1 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Einschaltung</em>' containment reference.
	 * @see #setIDBUEEinschaltung(ID_BUE_Einschaltung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Deckendes_Signal_Zuordnung_IDBUEEinschaltung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Einschaltung'"
	 * @generated
	 */
	ID_BUE_Einschaltung_TypeClass getIDBUEEinschaltung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Einschaltung</em>' containment reference.
	 * @see #getIDBUEEinschaltung()
	 * @generated
	 */
	void setIDBUEEinschaltung(ID_BUE_Einschaltung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung zu dem Signal, welches den BÜ deckt (deckendes Haupt-/ LS-Signal).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' containment reference.
	 * @see #setIDSignal(ID_Signal_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Deckendes_Signal_Zuordnung_IDSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	ID_Signal_TypeClass getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getIDSignal <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal</em>' containment reference.
	 * @see #getIDSignal()
	 * @generated
	 */
	void setIDSignal(ID_Signal_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Sicherheitsabstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstand vom deckenden Signal zur BÜ-Kante. Im Gegensatz zum BÜ-Gefahrraum werden abgesetzte Fuß- und Radwege dabei berücksichtigt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sicherheitsabstand</em>' containment reference.
	 * @see #setSicherheitsabstand(Sicherheitsabstand_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Deckendes_Signal_Zuordnung_Sicherheitsabstand()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Sicherheitsabstand'"
	 * @generated
	 */
	Sicherheitsabstand_TypeClass getSicherheitsabstand();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getSicherheitsabstand <em>Sicherheitsabstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sicherheitsabstand</em>' containment reference.
	 * @see #getSicherheitsabstand()
	 * @generated
	 */
	void setSicherheitsabstand(Sicherheitsabstand_TypeClass value);

} // BUE_Deckendes_Signal_Zuordnung
