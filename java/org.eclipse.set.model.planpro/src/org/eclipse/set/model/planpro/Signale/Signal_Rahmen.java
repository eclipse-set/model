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

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_Befestigung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Rahmen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Fiktive Signale haben keinen Signalrahmen, da sie keinen Signalbegriff zeigen können. Ein oder mehrere Signalrahmen bilden ein Signal. Die Gruppierung von Signalbegriffen innerhalb eines Signals zu Signalrahmen wird anhand der konstruktiven Gestaltung vorgenommen, z.B. werden alle Signalbegriffe des Hauptsignalschirms oder alle Signalbegriffe eines Zusatzanzeigers jeweils zu einem Signalrahmen zusammengefasst. Kann die Anzahl oder Art der Signalbegriffe eines Signalrahmens in Abhängigkeit vom betrieblichen Zustand geändert werden, so wird dieser als schaltbar bezeichnet, andernfalls als fest. Im LST-Datenmodell ist diese Eigenschaft als Attribut zu den Signalbegriffen definiert; ein Signalrahmen ist danach genau dann schaltbar, wenn mindestens eines der enthaltenen Signalbegriffe schaltbar ist. Typische schaltbare Signalrahmen sind der Signalschirm eines Mehrabschnittssignals, das Lichtsignal eines Zusatzanzeigers und das Form- oder Lichtsignal eines Weichensignals. Typische feste Signalrahmen sind das Mastschild eines Hauptsignals, das Formsignal eines Zusatzanzeigers und die Haltetafel. Über den Signalrahmen erfolgt, sofern dies geplant ist, die Zuordnung von Signalbegriffen eines nachgeordneten Signals zu einem anderen Signal ohne Bezug zur Fahrstraße, siehe dazu ID Signal Nachordnung Ausführliche Beschreibung s. Modellierung Signal. DB-Regelwerk Planungsdaten: im bisherigen PT1 ohne eindeutige Darstellung. In der Regel aus den Angaben in der Signaltabelle 1 zu erkennen. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getIDRegelzeichnung <em>ID Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getIDSignalBefestigung <em>ID Signal Befestigung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getIDSignalNachordnung <em>ID Signal Nachordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getRahmenArt <em>Rahmen Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getRahmenHoehe <em>Rahmen Hoehe</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Rahmen()
 * @model extendedMetaData="name='CSignal_Rahmen' kind='elementOnly'"
 * @generated
 */
public interface Signal_Rahmen extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Regelzeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf eine Regelzeichnung, sofern diese nur den Signalrahmen abbildet (z. B. Vorsignaltafel).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Regelzeichnung</em>' containment reference.
	 * @see #setIDRegelzeichnung(ID_Regelzeichnung_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Rahmen_IDRegelzeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Regelzeichnung'"
	 * @generated
	 */
	ID_Regelzeichnung_ohne_Proxy_TypeClass getIDRegelzeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getIDRegelzeichnung <em>ID Regelzeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Regelzeichnung</em>' containment reference.
	 * @see #getIDRegelzeichnung()
	 * @generated
	 */
	void setIDRegelzeichnung(ID_Regelzeichnung_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das zugehörige Objekt Signal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' containment reference.
	 * @see #setIDSignal(ID_Signal_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Rahmen_IDSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	ID_Signal_TypeClass getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getIDSignal <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal</em>' containment reference.
	 * @see #getIDSignal()
	 * @generated
	 */
	void setIDSignal(ID_Signal_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Signal Befestigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein zugehöriges Objekt Signal Befestigung. Zur Anwendung siehe Modellierung Signal. DB-Regelwerk Im bisherigen PT1 keine eindeutige Darstellung, oft aus den Einträgen in der Signaltabelle1, Zeilen 4-6, 10, 13 und 24-28 zu erkennen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal Befestigung</em>' containment reference.
	 * @see #setIDSignalBefestigung(ID_Signal_Befestigung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Rahmen_IDSignalBefestigung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Signal_Befestigung'"
	 * @generated
	 */
	ID_Signal_Befestigung_TypeClass getIDSignalBefestigung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getIDSignalBefestigung <em>ID Signal Befestigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal Befestigung</em>' containment reference.
	 * @see #getIDSignalBefestigung()
	 * @generated
	 */
	void setIDSignalBefestigung(ID_Signal_Befestigung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Signal Nachordnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung von nachgeordneten Signalen. Die Zuordnung von Signalbegriffen eines nachgeordneten Signals zu einem anderen Signal ohne Bezug zur Fahrstraße, wie bei Signalfahrtanzeigern, Signalhaltmeldern, Zugabfertigungssignalen Zp 9/10, erfolgt über ID_Signal_Nachordnung. Signalbegriffe nachgeordneter Signale, die dabei n (n\u0026gt;1) Signalen zugeordnet sind, erhalten n logische Signalrahmen mit den jeweils zutreffenden (ggf. identischen) Signalbegriffen, die je nach Hersteller mit n physischen Signalanzeigern (Signal_Befestigungen) oder gemeinsam in einem physischen Signalanzeiger realisiert werden. Zur ausführlichen Beschreibung der Modellierung eines Signals s. Modellierung Signal. DB-Regelwerk Sicherungstechnischer Lageplan, BÜ-Lageplan; oft als Bestandteil der Bezeichnung des Signals 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal Nachordnung</em>' containment reference.
	 * @see #setIDSignalNachordnung(ID_Signal_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Rahmen_IDSignalNachordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Signal_Nachordnung'"
	 * @generated
	 */
	ID_Signal_TypeClass getIDSignalNachordnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getIDSignalNachordnung <em>ID Signal Nachordnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal Nachordnung</em>' containment reference.
	 * @see #getIDSignalNachordnung()
	 * @generated
	 */
	void setIDSignalNachordnung(ID_Signal_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Rahmen Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung des Signalrahmens, um auch ohne Regelzeichnung die grundsätzliche Art erkennen zu können. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk Im bisherigen PT 1 keine eindeutige Darstellung, in der Regel aus den Einträgen in der Signaltabelle1 zu erkennen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rahmen Art</em>' containment reference.
	 * @see #setRahmenArt(Rahmen_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Rahmen_RahmenArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Rahmen_Art'"
	 * @generated
	 */
	Rahmen_Art_TypeClass getRahmenArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getRahmenArt <em>Rahmen Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rahmen Art</em>' containment reference.
	 * @see #getRahmenArt()
	 * @generated
	 */
	void setRahmenArt(Rahmen_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Rahmen Hoehe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Höhe des Rahmen-Mittelpunkts über Schienenoberkante (SO). Die Angabe ist für die Zusammenstellung von Bauteilgruppen im BIM-Kontext relevant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rahmen Hoehe</em>' containment reference.
	 * @see #setRahmenHoehe(Rahmen_Hoehe_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Rahmen_RahmenHoehe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Rahmen_Hoehe'"
	 * @generated
	 */
	Rahmen_Hoehe_TypeClass getRahmenHoehe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Rahmen#getRahmenHoehe <em>Rahmen Hoehe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rahmen Hoehe</em>' containment reference.
	 * @see #getRahmenHoehe()
	 * @generated
	 */
	void setRahmenHoehe(Rahmen_Hoehe_TypeClass value);

} // Signal_Rahmen
