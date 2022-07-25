/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model1902.Basisobjekte.Anhang;
import org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Akteur Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basisattributgruppe zur Zuordnung von Akteur-spezifischen Daten in Abhängigkeit von der ausgeführten Rolle während der Lebensdauer einer Planung Einzel. Die Attributgruppe enthält allgemeine Attribute, die rollenspezifisch unterschiedliche Bedeutungen haben. DB-Regelwerk Schriftfeldeinträge gemäß Ril 819.0103.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Akteur_Zuordnung#getAnhangDokumentation <em>Anhang Dokumentation</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Akteur_Zuordnung#getDatum <em>Datum</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Akteur_Zuordnung#getHandelnder <em>Handelnder</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Akteur_Zuordnung#getIdentRolle <em>Ident Rolle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getAkteur_Zuordnung()
 * @model extendedMetaData="name='CAkteur_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface Akteur_Zuordnung extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Anhang Dokumentation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Basisobjekte.Anhang}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anhang zur Dokumentation des Abschlusses der Handlung.\n\nIn Planung_E_Abnahme:\nDokumentation der Abnahme (Abnahmeniederschrift gemäß VV BAU-STE 4.6, Anhang 4.5/4.6).\n\nIn Planung_E_Erstellung:\nBeinhaltet das zur Planung gehörende Planverzeichnis, welches als *.pdf der Planung angehangen wird.\nDB-Regelwerk: Ril 809.0701 Abs. 7 (5) und (7).\n\nIn Planung_E_Freigabe:\nDokumentation der Freigabe durch Bvb.\n\nIn Planung_E_Genehmigung:\nDokumentation der Genehmigung durch AG/Bh/Bhv.\n\nIn Planung_E_Gleichstellung:\nBestätigung der Gleichstellung (Grundlagen und Bestätigung der tatsächlichen Ausführung).\n\nIn Planung_E_Pruefung:\nZur Planung gehörender Planprüfbericht, welcher als *.pdf der Planung angehängt wird.\nDB-Regelwerk: Bisher ohne eindeutige Darstellung.\n\nIn Planung_E_Qualitaetspruefung:\nBestätigung der Qualitätsprüfung (Bestätigung der tatsächlichen Ausführung).\n\nIn Planung_E_Sonstige:\nDokumentation einer sonstigen Handlung.\n\nIn Planung_E_Uebernahme:\nBestätigung der Übernahme (Grundlagen und Bestätigung der tatsächlichen Ausführung).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anhang Dokumentation</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getAkteur_Zuordnung_AnhangDokumentation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Anhang_Dokumentation'"
	 * @generated
	 */
	EList<Anhang> getAnhangDokumentation();

	/**
	 * Returns the value of the '<em><b>Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum des Abschlusses des Arbeitsauftrags durch den Handelnden.\nDie Bedeutung des Datums erschließt sich aus der Bezeichnung der Attributgruppe, in der das ~ verwendet wird.\n\nin Planung_E_Abnahme:\nDatum der Abnahmeprüfung gemäß Abnahmeprüfbericht.\nDB-Regelwerk\nSchriftfeldeintrag gemäß Ril 819.0103, Feld 23.3 Spalte \"Abnahme\".\n\nin Planung_E_Erstellung:\nKonkretes Datum der Erstellung der Planung/Projektinitialisierung bzw. deren Ausgabe.\nErgänzende Beschreibung zum Umgang im PlanPro-Planungsprozess\nDas Ausgabedatum und die laufende Nummer der Ausgabe werden separat abgespeichert, auch bei informativen Auslieferungen von Planungsdaten. \nDB-Regelwerk\nSchriftfeldeintrag gemäß Ril 819.0103 Feld 20 bzw. 23.\n\nin Planung_E_Freigabe:\nDatum der Freigabe der Planung durch den Bvb; (gemäß VV BAU-STE 4.6, Anhang 3.5, Feld \"Freigabe der Ausführungsunterlagen (Bvb)\").\nDB-Regelwerk\nSchriftfeldeintrag gemäß Ril 819.0103, Feld 6 Zeile \"Freigegeben\".\n\nin Planung_E_Genehmigung:\nDatum der Genehmigung der Planung zur Bauausführung durch die EdB (gemäß VV BAU-STE 4.6, Anhang 3.5, Feld \"Genehmigung zur Bauausführung\").\nDB-Regelwerk\n\nin Planung_E_Gleichstellung:\nDatum der Gleichstellung.\nDB-Regelwerk\nBisher ohne eindeutige Abbildung.\n\nin Planung_E_Pruefung:\nDatum der Prüfung der Planungsdaten (heutige Begriffsbezeichnung: Planprüfung);\nDB-Regelwerk\nSchriftfeldeintrag gemäß Ril 819.0103, Feld 6 \"Erstellungs-, Prüf- und Freigabedatum\", Zeile \"geprüft\" bzw. Feld 23, Spalte \"geprüft\".\n\nin Planung_E_Qualitaetspruefung:\nDatum der internen Qualitätsprüfung (gemäß VV BAU-STE 4.6, Anhang 3.5, Feld \"Qualitätssicherung\").\nDB-Regelwerk\nBisher keine eindeutige Abbildung\n\nin Planung_E_Uebernahme:\nDatum der Übereinstimmungsbescheinigung durch den Übernehmenden\nDB-Regelwerk\nSchriftfeldeintrag gemäß Ril 819.0103, Feld 23.3 Spalte \"Übernommen\" bei Neuerstellung bzw. Änderung von Anlagen.\n\nin Planung_E_Sonstige:\nDatum der Ausführung einer sonstigen Handlung.\nDB-Regelwerk\nBisher keine eindeutige Abbildung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datum</em>' containment reference.
	 * @see #setDatum(Datum_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getAkteur_Zuordnung_Datum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Datum'"
	 * @generated
	 */
	Datum_TypeClass getDatum();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Akteur_Zuordnung#getDatum <em>Datum</em>}' containment reference.
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
	 * Direkteinbindung des zugeordneten Akteurs.\n\nin Planung_E_Abnahme: Abnehmender.\nDB-Regelwerk\nRil 819.0103 Schriftfeld, Feld 23.3 Name des Abnahmeprüfers in Spalte \"Abnahme\".\n\nin Planung_E_Erstellung: Ersteller der Planungsdaten oder Projektinitialisierungsdaten.\nDB-Regelwerk\nSchriftfeldeintrag gemäß Ril 819.0103, Feld 7 bzw. 23.\n\nin Planung_E_Freigabe: Freigebender der Einzelplanung.\nEr gibt die fachtechnisch geprüfte Planung (heute: Ausführungsunterlagen) frei (gemäß VV BAU-STE 4.6, Anhang 3.5 Feld \"Freigabe der Ausführungsunterlagen (Bvb)\" sowie Ril 819.0103 Schriftfeld, Feld 7 Zeile \"Freigegeben\").\nDB-Regelwerk\nSchriftfeldeintrag gemäß Ril 819.0103, Feld 7 Zeile \"Freigegeben\".\n\nin Planung_E_Genehmigung: Genehmigender der Eisenbahnen des Bundes. Er genehmigt die Planung (heute: Ausführungsunterlagen) zur Ausführung genehmigt.\n(gemäß VV BAU-STE 4.6, Anhang 3.5 Feld \"Genehmigung zur Bauausführung\").\nDB-Regelwerk\nBisher ohne eindeutige Abbildung im Schriftfeld gemäß Ril 819.0103.\n\nin Planung_E_Gleichstellung: Gleichstellender der Planungsdaten.\nDB Regelwerk\nBisher ohne eindeutige Abbildung.\n\nin Planung_E_Pruefung: Pruefer der Einzelplanung\nDB-Regelwerk\nSchriftfeldeintrag gemäß Ril 819.0103, Feld 7 \"Nachname des Erstellers, Planprüfers und des Verantwortlichen für die Freigabe der Unterlage\", Zeile \"geprüft\".\n\nin Planung_E_Qualitaetspruefung: Qualitaetspruefer der Planungsdaten.\nFirmeninterner Qualitätsprüfer der Planungsdaten gemäß VV BAU-STE 4.6, Anhang 3.5 Planverzeichnis, Feld „Qualitätssicherung (Planerstellung intern geprüft)\nDB-Regelwerk\nBisher ohne eindeutige Abbildung im Schriftfeld gemäß Ril 819.0103.\n\nIn Planung_E_Sonstige: Akteur einer sonstigen Handlung.\nDB-Regelwerk\nBisher keine eindeutige Abbildung.\n\nin Planung_E_Uebernahme: Übernehmender, der für die korrekte Übernahme von Braun-/Pink-Einträgen in die Planungsdaten verantwortlich ist. \nDer Übernahmeverantwortliche bestätigt die Übereinstimmung der Bestandsdokumentation mit den örtlich geprüften Bestandsplänen bei der Erstellung der Bestandsdaten (heute: Bestandspläne) nach Ril 885. \nDB-Regelwerk\nSchriftfeldeintrag gemäß Ril 819.0103, Feld 23.3 Spalte \"Übernommen\" bei Neuerstellung bzw. Änderung von Anlagen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handelnder</em>' containment reference.
	 * @see #setHandelnder(Akteur)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getAkteur_Zuordnung_Handelnder()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Handelnder'"
	 * @generated
	 */
	Akteur getHandelnder();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Akteur_Zuordnung#getHandelnder <em>Handelnder</em>}' containment reference.
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
	 * Eindeutige Identifizierung des unter „Handelnder“ definierten Akteurs.\nDie konkrete Bedeutung erschließt sich aus der Bezeichnung der Attributgruppe, in der ~ verwendet wird.\n\nin Planung_E_Abnahme:\nNummer des Abnahmeprüfers.\nErgänzende Beschreibung zum heutigen Planungsprozess\nEntspricht Zulassungsnummer des Abnahmeprüfers gemäß Ril 809.0701 Abs. 5 „Anerkennungsverfahren“.\nDB-Regelwerk\nBisher keine Abbildung als Schriftfeldeintrag gemäß Ril 819.0103.\n\nin Planung_E_Pruefung:\nNummer des Prüfers.\nErgänzende Beschreibung zum heutigen Planungsprozess\nBei einem vom EBA zertifizierten Prüfer entspricht die Eintragung ~ der Prüf-Nr./EBA-ID-Nr. des Planprüfers gemäß 2ziffrig/2ziffrig/4ziffriger Eintragung im Planverzeichnis \n(gemäß VV BAU-STE 4.6, Anhang 3.5).\nDB-Regelwerk\nBisher keine eindeutige Abbildung.\n\nin Planung_E_Sonstige:\nSonstige Identifizierungsnummer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ident Rolle</em>' containment reference.
	 * @see #setIdentRolle(Ident_Rolle_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getAkteur_Zuordnung_IdentRolle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ident_Rolle'"
	 * @generated
	 */
	Ident_Rolle_TypeClass getIdentRolle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Akteur_Zuordnung#getIdentRolle <em>Ident Rolle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ident Rolle</em>' containment reference.
	 * @see #getIdentRolle()
	 * @generated
	 */
	void setIdentRolle(Ident_Rolle_TypeClass value);

} // Akteur_Zuordnung
