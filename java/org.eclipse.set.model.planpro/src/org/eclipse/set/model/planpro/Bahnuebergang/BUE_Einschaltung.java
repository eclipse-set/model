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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Einschaltung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Logisches Objekt, das alle Informationen zur Einschaltung eines Bahnübergangs (BÜ) enthält. Über den Verweis auf BUE Gleisbezogener Gefahrraum findet eine Verortung am zugehörigen Gleis statt, für das der Einschaltkontakt angeordnet wird. Der Einschaltkontakt selbst ist über das Objekt Schaltmittel Zuordnung abgebildet. Für die BUE Einschaltung ist die in Fahrtrichtung von Anrückmelder / Einschaltkontakt in Richtung BÜ die VOR der BÜ-Mitte liegende Grenze von BUE Gleisbezogener Gefahrraum maßgebend, auf dem das Objekt verortet wird. Die Gefahrraum-Grenze liegt damit in Fahrtrichtung HINTER dem Anrückmelder / Einschaltkontakt. Bei Ausbildung des Einschaltpunktes als Doppelschleife gelten hinsichtlich des maßgebenden Einschaltpunktes gemäß Einschaltstreckenberechnung folgende Unterschiede: Hersteller PintschBamag: maßgebend ist die Mitte der in Fahrtrichtung BÜ liegenden ERSTEN Schleife Hersteller Scheidt\u0026amp;Bachmann: maßgebend ist die Mitte der in Fahrtrichtung BÜ liegenden ZWEITE Schleife DB-Regelwerk 815.0033 in Verbindung mit Einschaltstreckenberechnung Die Angaben zur BÜ-Einschaltung beschränken sich gegenwärtig auf die Planungswerte mit Auswirkungen auf das Stellwerk.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Einschaltung#getBUEEinschaltungHp <em>BUE Einschaltung Hp</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Einschaltung#getBUEFunktionsueberwachung <em>BUE Funktionsueberwachung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Einschaltung()
 * @model extendedMetaData="name='CBUE_Einschaltung' kind='elementOnly'"
 * @generated
 */
public interface BUE_Einschaltung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>BUE Einschaltung Hp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BUE Einschaltung Hp</em>' containment reference.
	 * @see #setBUEEinschaltungHp(BUE_Einschaltung_Hp_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Einschaltung_BUEEinschaltungHp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Einschaltung_Hp'"
	 * @generated
	 */
	BUE_Einschaltung_Hp_AttributeGroup getBUEEinschaltungHp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Einschaltung#getBUEEinschaltungHp <em>BUE Einschaltung Hp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Einschaltung Hp</em>' containment reference.
	 * @see #getBUEEinschaltungHp()
	 * @generated
	 */
	void setBUEEinschaltungHp(BUE_Einschaltung_Hp_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>BUE Funktionsueberwachung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Funktionsüberwachung, die der Ermittlung der Einschaltung zugrunde liegt. Es wird zwischen folgenden Funktionsüberwachungen unterschieden: Hp: Der BÜ ist durch Hauptsignal(e) gedeckt. Die Fahrtstellung erfolgt erst, wenn der BÜ geschlossen ist. Fü: Der BÜ wird zugbewirkt eingeschaltet, die Überwachung erfolgt durch einen Fahrdienstleiter im Stellwerk. Dieser kann im Störungsfall eingreifen. Üs: Der BÜ wird zugbewirkt eingeschaltet und vom Triebfahrzeugführer überwacht. Der Zustand des BÜ wird diesem durch Überwachungssignale angezeigt. Es gibt keine Verbindung zum Stellwerk. Kombinationen der Funtkionsüberwachungen sind möglich. DB-Regelwerk 815.0032 1 (1) und (2) 819.1203 3 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Funktionsueberwachung</em>' containment reference.
	 * @see #setBUEFunktionsueberwachung(BUE_Funktionsueberwachung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getBUE_Einschaltung_BUEFunktionsueberwachung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BUE_Funktionsueberwachung'"
	 * @generated
	 */
	BUE_Funktionsueberwachung_TypeClass getBUEFunktionsueberwachung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.BUE_Einschaltung#getBUEFunktionsueberwachung <em>BUE Funktionsueberwachung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Funktionsueberwachung</em>' containment reference.
	 * @see #getBUEFunktionsueberwachung()
	 * @generated
	 */
	void setBUEFunktionsueberwachung(BUE_Funktionsueberwachung_TypeClass value);

} // BUE_Einschaltung
