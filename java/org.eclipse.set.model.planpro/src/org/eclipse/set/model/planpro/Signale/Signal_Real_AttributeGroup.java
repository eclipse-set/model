/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Real Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getDunkelschaltung <em>Dunkelschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getFunktionOhneSignal <em>Funktion Ohne Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getGeltungsbereich <em>Geltungsbereich</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalBefestigungsart <em>Signal Befestigungsart</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalFunktion <em>Signal Funktion</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalRealAktiv <em>Signal Real Aktiv</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalRealAktivSchirm <em>Signal Real Aktiv Schirm</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalsichtErreichbar <em>Signalsicht Erreichbar</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalsichtMindest <em>Signalsicht Mindest</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalsichtSoll <em>Signalsicht Soll</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Real_AttributeGroup()
 * @model extendedMetaData="name='CSignal_Real' kind='elementOnly'"
 * @generated
 */
public interface Signal_Real_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Dunkelschaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zusatzangabe, ob ein Schirm-Signal dunkel geschaltet werden kann. Die Dunkelschaltung ist z. B. bei Strecken mit LZB-geführten Zugfahrten und bei Schnittstellen zu SIL 2 - ESTW relevant. Die Angabe ist bei Haupt- und Vorsignalen erforderlich, nicht jedoch für Sperrsignale. Wertzuordnung: true - Signal muss dunkel geschaltet werden können, false - Signal muss nicht dunkel geschaltet werden können. DB-Regelwerk Planungsdaten: Signaltabelle 1, Zeile 40
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dunkelschaltung</em>' containment reference.
	 * @see #setDunkelschaltung(Dunkelschaltung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Real_AttributeGroup_Dunkelschaltung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Dunkelschaltung'"
	 * @generated
	 */
	Dunkelschaltung_TypeClass getDunkelschaltung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getDunkelschaltung <em>Dunkelschaltung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dunkelschaltung</em>' containment reference.
	 * @see #getDunkelschaltung()
	 * @generated
	 */
	void setDunkelschaltung(Dunkelschaltung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Funktion Ohne Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe zusätzlicher Fahrstraßenfunktionen ohne Signal (RS = Rangierstraßenfunktion ohne Signal zur Anwendung bei Hauptsignalen ohne Ls-Anteil, ZS = Zugstraßenfunktion ohne Signal zur Anwendung bei Ls-Signalen).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Funktion Ohne Signal</em>' containment reference.
	 * @see #setFunktionOhneSignal(Funktion_Ohne_Signal_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Real_AttributeGroup_FunktionOhneSignal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Funktion_Ohne_Signal'"
	 * @generated
	 */
	Funktion_Ohne_Signal_TypeClass getFunktionOhneSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getFunktionOhneSignal <em>Funktion Ohne Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funktion Ohne Signal</em>' containment reference.
	 * @see #getFunktionOhneSignal()
	 * @generated
	 */
	void setFunktionOhneSignal(Funktion_Ohne_Signal_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Geltungsbereich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geltungsbereich, dem das Signal zugeordnet wird (DS/DV). Die Angabe wird zunächst nur zur Unterscheidung Sh 1/Ra 12 vorgesehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geltungsbereich</em>' containment reference.
	 * @see #setGeltungsbereich(Geltungsbereich_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Real_AttributeGroup_Geltungsbereich()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Geltungsbereich'"
	 * @generated
	 */
	Geltungsbereich_TypeClass getGeltungsbereich();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getGeltungsbereich <em>Geltungsbereich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geltungsbereich</em>' containment reference.
	 * @see #getGeltungsbereich()
	 * @generated
	 */
	void setGeltungsbereich(Geltungsbereich_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Signal Befestigungsart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grundsätzliche Art der Befestigung eines Signals. Einzelne Elemente des Signals (z. B. ein zum Hauptsignal gehörendes, nicht am Hauptsignalmast angebrachtes Zusatzsignal) können von der grundsätzlichen Befestigungsart abweichen, die exakte Konstruktion des Gesamtsignals ist im Modell in den Instanzen des Objekts Signal Befestigung dargestellt. DB-Regelwerk Signaltabelle 1, Zeile 12 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Befestigungsart</em>' containment reference.
	 * @see #setSignalBefestigungsart(Signal_Befestigungsart_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Real_AttributeGroup_SignalBefestigungsart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Signal_Befestigungsart'"
	 * @generated
	 */
	Signal_Befestigungsart_TypeClass getSignalBefestigungsart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalBefestigungsart <em>Signal Befestigungsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Befestigungsart</em>' containment reference.
	 * @see #getSignalBefestigungsart()
	 * @generated
	 */
	void setSignalBefestigungsart(Signal_Befestigungsart_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Signal Funktion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der betrieblichen Funktion eines Aktiven Signals für Zugfahrten. Aktive Signale sind Signale, an denen mindestens ein Signalbegriff schaltbar ist. Hauptsignale und Mehrabschnittssignale werden dabei detailliert in Einfahr-, Ausfahr-, Zwischen-, Nachrück-, Block-, Deckungs-, Zugdeckungs- oder Gruppensignale bzw. Kombinationen aus diesen betrieblichen Funktionen unterteilt. Von den anderen aktiven Signalen wird nur noch das Zugzielsignal (z.B. hohes Sperrsignal als Zielsignal bei Zugfahrten) mit einem eigenen Attribut hervorgehoben, alle weiteren Aktiven Signale werden unter \"andere\" zusammengefasst. DB-Regelwerk 301, 819.20, Planungsdaten: im bisherigen PT 1 nur bei Signalen im Geltungsbereich der Ril 819.20, Tabelle für Signalabstände und Schutzstrecken, sonst ohne eindeutige Darstellung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Funktion</em>' containment reference.
	 * @see #setSignalFunktion(Signal_Funktion_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Real_AttributeGroup_SignalFunktion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Signal_Funktion'"
	 * @generated
	 */
	Signal_Funktion_TypeClass getSignalFunktion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalFunktion <em>Signal Funktion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Funktion</em>' containment reference.
	 * @see #getSignalFunktion()
	 * @generated
	 */
	void setSignalFunktion(Signal_Funktion_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Signal Real Aktiv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Real Aktiv</em>' containment reference.
	 * @see #setSignalRealAktiv(Signal_Real_Aktiv_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Real_AttributeGroup_SignalRealAktiv()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signal_Real_Aktiv'"
	 * @generated
	 */
	Signal_Real_Aktiv_AttributeGroup getSignalRealAktiv();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalRealAktiv <em>Signal Real Aktiv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Real Aktiv</em>' containment reference.
	 * @see #getSignalRealAktiv()
	 * @generated
	 */
	void setSignalRealAktiv(Signal_Real_Aktiv_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Signal Real Aktiv Schirm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Real Aktiv Schirm</em>' containment reference.
	 * @see #setSignalRealAktivSchirm(Signal_Real_Aktiv_Schirm_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Real_AttributeGroup_SignalRealAktivSchirm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signal_Real_Aktiv_Schirm'"
	 * @generated
	 */
	Signal_Real_Aktiv_Schirm_AttributeGroup getSignalRealAktivSchirm();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalRealAktivSchirm <em>Signal Real Aktiv Schirm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Real Aktiv Schirm</em>' containment reference.
	 * @see #getSignalRealAktivSchirm()
	 * @generated
	 */
	void setSignalRealAktivSchirm(Signal_Real_Aktiv_Schirm_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Signalsicht Erreichbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tatsächlich erreichbare Signalsicht innerhalb der Sollsignalsicht. Die Signalsicht beschreibt die Entfernung, ab der ein Aktives Signal eindeutig erkennbar sein soll (Sollsignalsicht) bzw. muss (Mindestsignalsicht), so dass vom Triebfahrzeugführer grundsätzliche Handlungsweisen daraus ableitbar sind. Die erreichbare Signalsicht darf unter bestimmten Voraussetzungen kleiner als die Sollsignalsicht, jedoch nur mit besonderen Maßnahmen kleiner als die Mindestsignalsicht sein. Die Signalsicht ist an das gesamte Signal gekoppelt, das bedeutet jedoch nicht, dass jeder Signalbegriff von Beginn der Signalsicht an vollständig gelesen werden muss - die Festlegungen dafür finden sich in den zugehörigen detaillierten Regelzeichnungen oder anderen Zulassungsdokumenten. DB-Regelwerk 819.02, 819.03, Planungsdaten: im bisherigen PT1 ohne eindeutige Darstellung, ergänzt die Einträge in Zeile 7 der Signaltabelle 1 um den Wert der am konkreten Ort erreichbaren Signalsicht 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signalsicht Erreichbar</em>' containment reference.
	 * @see #setSignalsichtErreichbar(Signalsicht_Erreichbar_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Real_AttributeGroup_SignalsichtErreichbar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signalsicht_Erreichbar'"
	 * @generated
	 */
	Signalsicht_Erreichbar_TypeClass getSignalsichtErreichbar();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalsichtErreichbar <em>Signalsicht Erreichbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalsicht Erreichbar</em>' containment reference.
	 * @see #getSignalsichtErreichbar()
	 * @generated
	 */
	void setSignalsichtErreichbar(Signalsicht_Erreichbar_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Signalsicht Mindest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mindestsignalsicht gemäß örtlich zugelassener Geschwindigkeit vor dem Signal nach 6,75 s-Regel. Die Signalsicht beschreibt die Entfernung, ab der ein Aktives Signal eindeutig erkennbar sein soll (Sollsignalsicht) bzw. muss (Mindestsignalsicht), so dass vom Triebfahrzeugführer grundsätzliche Handlungsweisen daraus ableitbar sind. Die erreichbare Signalsicht darf nur mit zusätzlichen Maßnahmen kleiner als die Mindestsignalsicht sein. Die Signalsicht ist an das gesamte Signal gekoppelt, das bedeutet jedoch nicht, dass jeder Signalbegriff von Beginn der Signalsicht an vollständig gelesen werden muss - die Festlegungen dafür finden sich in den zugehörigen detaillierten Regelzeichnungen oder anderen Zulassungsdokumenten. DB-Regelwerk 819.02, 819.03, Planungsdaten: entspricht dem zweiten (eingeklammerten) Eintrag in Zeile 7 der Signaltabelle 1. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signalsicht Mindest</em>' containment reference.
	 * @see #setSignalsichtMindest(Signalsicht_Mindest_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Real_AttributeGroup_SignalsichtMindest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signalsicht_Mindest'"
	 * @generated
	 */
	Signalsicht_Mindest_TypeClass getSignalsichtMindest();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalsichtMindest <em>Signalsicht Mindest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalsicht Mindest</em>' containment reference.
	 * @see #getSignalsichtMindest()
	 * @generated
	 */
	void setSignalsichtMindest(Signalsicht_Mindest_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Signalsicht Soll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sollsignalsicht gemäß örtlich zugelassener Geschwindigkeit vor dem Signal. Die Signalsicht beschreibt die Entfernung, ab der ein Aktives Signal eindeutig erkennbar sein soll (Sollsignalsicht) bzw. muss (Mindestsignalsicht), so dass vom Triebfahrzeugführer grundsätzliche Handlungsweisen daraus ableitbar sind. Die erreichbare Signalsicht darf unter bestimmten Voraussetzungen kleiner als die Sollsignalsicht sein. Die Signalsicht ist an das gesamte Signal gekoppelt, das bedeutet jedoch nicht, dass jeder Signalbegriff von Beginn der Signalsicht an vollständig gelesen werden muss - die Festlegungen dafür finden sich in den zugehörigen detaillierten Regelzeichnungen oder anderen Zulassungsdokumenten. DB-Regelwerk 819.02, 819.03, Planungsdaten: entspricht dem ersten Eintrag in Zeile 7 der Signaltabelle 1. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signalsicht Soll</em>' containment reference.
	 * @see #setSignalsichtSoll(Signalsicht_Soll_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Real_AttributeGroup_SignalsichtSoll()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signalsicht_Soll'"
	 * @generated
	 */
	Signalsicht_Soll_TypeClass getSignalsichtSoll();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Real_AttributeGroup#getSignalsichtSoll <em>Signalsicht Soll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalsicht Soll</em>' containment reference.
	 * @see #getSignalsichtSoll()
	 * @generated
	 */
	void setSignalsichtSoll(Signalsicht_Soll_TypeClass value);

} // Signal_Real_AttributeGroup
