/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.planpro.Basisobjekte.Anhang;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Akteur Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basisattributgruppe zur Zuordnung von Akteur-spezifischen Daten in Abhängigkeit von der ausgeführten Rolle während der Lebensdauer einer Planung Einzel. Die Attributgruppe enthält allgemeine Attribute, die rollenspezifisch unterschiedliche Bedeutungen haben. DB-Regelwerk Schriftfeldeinträge gemäß Ril 886.0102.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Akteur_Zuordnung#getAnhangDokumentation <em>Anhang Dokumentation</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Akteur_Zuordnung#getDatum <em>Datum</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Akteur_Zuordnung#getHandelnder <em>Handelnder</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Akteur_Zuordnung#getIdentRolle <em>Ident Rolle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getAkteur_Zuordnung()
 * @model extendedMetaData="name='CAkteur_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface Akteur_Zuordnung extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Anhang Dokumentation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Basisobjekte.Anhang}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anhang zur Dokumentation des Abschlusses der Handlung.
	 * 
	 * In Planung_E_Abnahme:
	 * Dokumentation der Abnahme (Abnahmeniederschrift gemäß VV BAU-STE 4.6, Anhang 4.5/4.6).
	 * 
	 * In Planung_E_Erstellung:
	 * Beinhaltet das zur Planung gehörende Planverzeichnis, welches als *.pdf der Planung angehangen wird.
	 * DB-Regelwerk: Ril 809.0701 Abs. 7 (5) und (7).
	 * 
	 * In Planung_E_Freigabe:
	 * Dokumentation der Freigabe durch Bvb.
	 * 
	 * In Planung_E_Genehmigung:
	 * Dokumentation der Genehmigung durch AG/Bh/Bhv.
	 * 
	 * In Planung_E_Gleichstellung:
	 * Bestätigung der Gleichstellung (Grundlagen und Bestätigung der tatsächlichen Ausführung).
	 * 
	 * In Planung_E_Pruefung:
	 * Zur Planung gehörender Planprüfbericht, welcher als *.pdf der Planung angehängt wird.
	 * DB-Regelwerk: Bisher ohne eindeutige Darstellung.
	 * 
	 * In Planung_E_Qualitaetspruefung:
	 * Bestätigung der Qualitätsprüfung (Bestätigung der tatsächlichen Ausführung).
	 * 
	 * In Planung_E_Sonstige:
	 * Dokumentation einer sonstigen Handlung.
	 * 
	 * In Planung_E_Uebernahme:
	 * Bestätigung der Übernahme (Grundlagen und Bestätigung der tatsächlichen Ausführung).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anhang Dokumentation</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getAkteur_Zuordnung_AnhangDokumentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Anhang_Dokumentation'"
	 * @generated
	 */
	EList<Anhang> getAnhangDokumentation();

	/**
	 * Returns the value of the '<em><b>Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum des Abschlusses des Arbeitsauftrags durch den Handelnden.
	 * Die Bedeutung des Datums erschließt sich aus der Bezeichnung der Attributgruppe, in der das ~ verwendet wird.
	 * 
	 * in Planung_E_Abnahme:
	 * Datum der Abnahmeprüfung gemäß Abnahmeprüfbericht.
	 * DB-Regelwerk
	 * Schriftfeldeintrag gemäß Ril 886.0102, Feld 23.3 Spalte \"Abnahme\".
	 * 
	 * in Planung_E_Erstellung:
	 * Konkretes Datum der Erstellung der Planung/Projektinitialisierung bzw. deren Ausgabe.
	 * Ergänzende Beschreibung zum Umgang im PlanPro-Planungsprozess
	 * Das Ausgabedatum und die laufende Nummer der Ausgabe werden separat abgespeichert, auch bei informativen Auslieferungen von Planungsdaten. 
	 * DB-Regelwerk
	 * Schriftfeldeintrag gemäß Ril 886.0102 Feld 20 bzw. 23.
	 * 
	 * in Planung_E_Freigabe:
	 * Datum der Freigabe der Planung durch den Bvb; (gemäß VV BAU-STE 4.6, Anhang 3.5, Feld \"Freigabe der Ausführungsunterlagen (Bvb)\").
	 * DB-Regelwerk
	 * Schriftfeldeintrag gemäß Ril 886.0102, Feld 6 Zeile \"Freigegeben\".
	 * 
	 * in Planung_E_Genehmigung:
	 * Datum der Genehmigung der Planung zur Bauausführung durch die EdB (gemäß VV BAU-STE 4.6, Anhang 3.5, Feld \"Genehmigung zur Bauausführung\").
	 * DB-Regelwerk
	 * 
	 * in Planung_E_Gleichstellung:
	 * Datum der Gleichstellung.
	 * DB-Regelwerk
	 * Bisher ohne eindeutige Abbildung.
	 * 
	 * in Planung_E_Pruefung:
	 * Datum der Prüfung der Planungsdaten (heutige Begriffsbezeichnung: Planprüfung);
	 * DB-Regelwerk
	 * Schriftfeldeintrag gemäß Ril 886.0102, Feld 6 \"Erstellungs-, Prüf- und Freigabedatum\", Zeile \"geprüft\" bzw. Feld 23, Spalte \"geprüft\".
	 * 
	 * in Planung_E_Qualitaetspruefung:
	 * Datum der internen Qualitätsprüfung (gemäß VV BAU-STE 4.6, Anhang 3.5, Feld \"Qualitätssicherung\").
	 * DB-Regelwerk
	 * Bisher keine eindeutige Abbildung
	 * 
	 * in Planung_E_Uebernahme:
	 * Datum der Übereinstimmungsbescheinigung durch den Übernehmenden
	 * DB-Regelwerk
	 * Schriftfeldeintrag gemäß Ril 886.0102, Feld 23.3 Spalte \"Übernommen\" bei Neuerstellung bzw. Änderung von Anlagen.
	 * 
	 * in Planung_E_Sonstige:
	 * Datum der Ausführung einer sonstigen Handlung.
	 * DB-Regelwerk
	 * Bisher keine eindeutige Abbildung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datum</em>' containment reference.
	 * @see #setDatum(Datum_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getAkteur_Zuordnung_Datum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Datum'"
	 * @generated
	 */
	Datum_TypeClass getDatum();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Akteur_Zuordnung#getDatum <em>Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum</em>' containment reference.
	 * @see #getDatum()
	 * @generated
	 */
	void setDatum(Datum_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Handelnder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Direkteinbindung des zugeordneten Akteurs.
	 * 
	 * in Planung_E_Abnahme: Abnehmender.
	 * DB-Regelwerk
	 * Ril 886.0102 Schriftfeld, Feld 23.3 Name des Abnahmeprüfers in Spalte \"Abnahme\".
	 * 
	 * in Planung_E_Erstellung: Ersteller der Planungsdaten oder Projektinitialisierungsdaten.
	 * DB-Regelwerk
	 * Schriftfeldeintrag gemäß Ril 886.0102, Feld 7 bzw. 23.
	 * 
	 * in Planung_E_Freigabe: Freigebender der Einzelplanung.
	 * Er gibt die fachtechnisch geprüfte Planung (heute: Ausführungsunterlagen) frei (gemäß VV BAU-STE 4.6, Anhang 3.5 Feld \"Freigabe der Ausführungsunterlagen (Bvb)\" sowie Ril 819.0103 Schriftfeld, Feld 7 Zeile \"Freigegeben\").
	 * DB-Regelwerk
	 * Schriftfeldeintrag gemäß Ril 886.0102, Feld 7 Zeile \"Freigegeben\".
	 * 
	 * in Planung_E_Genehmigung: Genehmigender der Eisenbahnen des Bundes. Er genehmigt die Planung (heute: Ausführungsunterlagen) zur Ausführung genehmigt.
	 * (gemäß VV BAU-STE 4.6, Anhang 3.5 Feld \"Genehmigung zur Bauausführung\").
	 * DB-Regelwerk
	 * Bisher ohne eindeutige Abbildung im Schriftfeld gemäß Ril 886.0102.
	 * 
	 * in Planung_E_Gleichstellung: Gleichstellender der Planungsdaten.
	 * DB Regelwerk
	 * Bisher ohne eindeutige Abbildung.
	 * 
	 * in Planung_E_Pruefung: Pruefer der Einzelplanung
	 * DB-Regelwerk
	 * Schriftfeldeintrag gemäß Ril 886.0102, Feld 7 \"Nachname des Erstellers, Planprüfers und des Verantwortlichen für die Freigabe der Unterlage\", Zeile \"geprüft\".
	 * 
	 * in Planung_E_Qualitaetspruefung: Qualitaetspruefer der Planungsdaten.
	 * Firmeninterner Qualitätsprüfer der Planungsdaten gemäß VV BAU-STE 4.6, Anhang 3.5 Planverzeichnis, Feld „Qualitätssicherung (Planerstellung intern geprüft)
	 * DB-Regelwerk
	 * Bisher ohne eindeutige Abbildung im Schriftfeld gemäß Ril 886.0102.
	 * 
	 * In Planung_E_Sonstige: Akteur einer sonstigen Handlung.
	 * DB-Regelwerk
	 * Bisher keine eindeutige Abbildung.
	 * 
	 * in Planung_E_Uebernahme: Übernehmender, der für die korrekte Übernahme von Braun-/Pink-Einträgen in die Planungsdaten verantwortlich ist. 
	 * Der Übernahmeverantwortliche bestätigt die Übereinstimmung der Bestandsdokumentation mit den örtlich geprüften Bestandsplänen bei der Erstellung der Bestandsdaten (heute: Bestandspläne) nach Ril 885. 
	 * DB-Regelwerk
	 * Schriftfeldeintrag gemäß Ril 886.0102, Feld 23.3 Spalte \"Übernommen\" bei Neuerstellung bzw. Änderung von Anlagen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handelnder</em>' containment reference.
	 * @see #setHandelnder(Akteur)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getAkteur_Zuordnung_Handelnder()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Handelnder'"
	 * @generated
	 */
	Akteur getHandelnder();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Akteur_Zuordnung#getHandelnder <em>Handelnder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handelnder</em>' containment reference.
	 * @see #getHandelnder()
	 * @generated
	 */
	void setHandelnder(Akteur value);

	/**
	 * Returns the value of the '<em><b>Ident Rolle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eindeutige Identifizierung des unter „Handelnder“ definierten Akteurs.
	 * Die konkrete Bedeutung erschließt sich aus der Bezeichnung der Attributgruppe, in der ~ verwendet wird.
	 * 
	 * in Planung_E_Abnahme:
	 * Nummer des Abnahmeprüfers.
	 * Ergänzende Beschreibung zum heutigen Planungsprozess
	 * Entspricht Zulassungsnummer des Abnahmeprüfers gemäß Ril 809.0701 Abs. 5 „Anerkennungsverfahren“.
	 * DB-Regelwerk
	 * Bisher keine Abbildung als Schriftfeldeintrag gemäß Ril 886.0102.
	 * 
	 * in Planung_E_Pruefung:
	 * Nummer des Prüfers.
	 * Ergänzende Beschreibung zum heutigen Planungsprozess
	 * Bei einem vom EBA zertifizierten Prüfer entspricht die Eintragung ~ der Prüf-Nr./EBA-ID-Nr. des Planprüfers gemäß 2ziffrig/2ziffrig/4ziffriger Eintragung im Planverzeichnis 
	 * (gemäß VV BAU-STE 4.6, Anhang 3.5).
	 * DB-Regelwerk
	 * Bisher keine eindeutige Abbildung.
	 * 
	 * in Planung_E_Sonstige:
	 * Sonstige Identifizierungsnummer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ident Rolle</em>' containment reference.
	 * @see #setIdentRolle(Ident_Rolle_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getAkteur_Zuordnung_IdentRolle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ident_Rolle'"
	 * @generated
	 */
	Ident_Rolle_TypeClass getIdentRolle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Akteur_Zuordnung#getIdentRolle <em>Ident Rolle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ident Rolle</em>' containment reference.
	 * @see #getIdentRolle()
	 * @generated
	 */
	void setIdentRolle(Ident_Rolle_TypeClass value);

} // Akteur_Zuordnung
