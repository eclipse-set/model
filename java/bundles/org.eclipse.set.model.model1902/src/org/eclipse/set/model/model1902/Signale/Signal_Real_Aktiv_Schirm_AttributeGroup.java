/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Signale;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Real Aktiv Schirm Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getDunkelschaltung <em>Dunkelschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getRichtpunkt <em>Richtpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getRichtpunktentfernung <em>Richtpunktentfernung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getSignalArt <em>Signal Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getSignalsystem <em>Signalsystem</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getStreuscheibeArt <em>Streuscheibe Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getStreuscheibeBetriebsstellung <em>Streuscheibe Betriebsstellung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_Aktiv_Schirm_AttributeGroup()
 * @model extendedMetaData="name='CSignal_Real_Aktiv_Schirm' kind='elementOnly'"
 * @generated
 */
public interface Signal_Real_Aktiv_Schirm_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Dunkelschaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zusatzangabe, ob ein Schirm-Signal dunkel geschaltet werden kann. Die Dunkelschaltung ist z. B. bei Strecken mit LZB-geführten Zugfahrten und bei Schnittstellen zu SIL 2 - ESTW relevant. Die Angabe ist bei Haupt- und Vorsignalen erforderlich, nicht jedoch für Sperrsignale. Wertzuordnung: true - Signal muss dunkel geschaltet werden können, false - Signal muss nicht dunkel geschaltet werden können. DB-Regelwerk Planungsdaten: Signaltabelle 1, Zeile 40
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dunkelschaltung</em>' containment reference.
	 * @see #setDunkelschaltung(Dunkelschaltung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_Aktiv_Schirm_AttributeGroup_Dunkelschaltung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Dunkelschaltung'"
	 * @generated
	 */
	Dunkelschaltung_TypeClass getDunkelschaltung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getDunkelschaltung <em>Dunkelschaltung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dunkelschaltung</em>' containment reference.
	 * @see #getDunkelschaltung()
	 * @generated
	 */
	void setDunkelschaltung(Dunkelschaltung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Richtpunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Punkt, auf den das Signal in besonderen Fällen ausgerichtet werden soll. Im Allgemeinen werden Signale auf einen Punkt ausgerichtet, der sich in der Richtpunktentfernung vor dem Signal in dem Gleis befindet, dem das Signal zugeordnet ist. In diesem Fall wird das Attribut nicht befüllt. In besonderen Fällen (z.B. Gleisverzeigungen oder extreme Kurvenlagen im Annäherungsbereich zum Signal) kann es jedoch erforderlich sein, explizit einen Richtpunkt außerhalb dieses Gleises festzulegen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Richtpunkt</em>' containment reference.
	 * @see #setRichtpunkt(Richtpunkt_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_Aktiv_Schirm_AttributeGroup_Richtpunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Richtpunkt'"
	 * @generated
	 */
	Richtpunkt_TypeClass getRichtpunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getRichtpunkt <em>Richtpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Richtpunkt</em>' containment reference.
	 * @see #getRichtpunkt()
	 * @generated
	 */
	void setRichtpunkt(Richtpunkt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Richtpunktentfernung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entfernung des Ausrichtpunktes eines Schirm-Signals. Beschreibt den Schnittpunkt der Sichtachse der Signaloptiken mit dem Gleis, dem das Signal zugeordnet ist, die Angabe erfolgt in Meter. In der Regel werden dafür 500 m für Haupt- und Mehrabschnittssignale und 300 m für Vorsignale und Vorsignalwiederholer verwendet. Entsprechend der Funktion des Signals und den örtlichen Bedingungen können jedoch auch andere Werte verwendet werden. DB-Regelwerk Planungsdaten: Signaltabelle 1, Zeile 8 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Richtpunktentfernung</em>' containment reference.
	 * @see #setRichtpunktentfernung(Richtpunktentfernung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_Aktiv_Schirm_AttributeGroup_Richtpunktentfernung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Richtpunktentfernung'"
	 * @generated
	 */
	Richtpunktentfernung_TypeClass getRichtpunktentfernung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getRichtpunktentfernung <em>Richtpunktentfernung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Richtpunktentfernung</em>' containment reference.
	 * @see #getRichtpunktentfernung()
	 * @generated
	 */
	void setRichtpunktentfernung(Richtpunktentfernung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Signal Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ausbildung des Signalschirms eines Schirm-Signals im Sicherungstechnischen Lageplan und in der Außenanlage. Dieses Attribut ermöglicht bei allen Schirmsignalen (s. Modellierung Signal), die grundsätzliche Art des Signals zu erkennen, ohne die zugehörige Regelzeichnung zu lesen. Eine Ausnahme bildet der ENUM-Wert \"andere\", hier muss die Art des Signals aus der Regelzeichnung entnommen werden. Dieser Wert wird bei allen realen Signalen verwendet, die keine Schirmsignale sind. Unter Mehrabschnittssignal wird dabei jegliche Kombination eines Hauptsignal- mit einem Vorsignalbegriff verstanden, unabhängig von der konkreten technischen Ausführung. So werden auch Signale des H/V-Signalsystems, die am Mast des Hauptsignals ein Vorsignal tragen, als Mehrabschnittssignale bezeichnet. Die Einfügung der Silbe -sperr- bei Haupt- und Mehrabschnittssignalen bedeutet, dass an diesen Signalen zusätzlich ein Rangierfahrtsignal angebracht ist. Dabei ist es irrelevant, ob dies in einem eigenen Bauteil am Signal erfolgt oder ob die Optiken im Signalschirm des Haupt- oder Mehrabschnittssignalen untergebracht sind. DB-Regelwerk Planungsdaten: Sicherungstechnischer Lageplan 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Art</em>' containment reference.
	 * @see #setSignalArt(Signal_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_Aktiv_Schirm_AttributeGroup_SignalArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Signal_Art'"
	 * @generated
	 */
	Signal_Art_TypeClass getSignalArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getSignalArt <em>Signal Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Art</em>' containment reference.
	 * @see #getSignalArt()
	 * @generated
	 */
	void setSignalArt(Signal_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Signalsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zugehörigkeit eines Schirm-Signals zu einem der Signalsysteme. Dieses Attribut wird nur bei Haupt-, Vor- und Mehrabschnittssignalen sowie BÜ-Signalen belegt. DB-Regelwerk 301.0101-04, 301.0201, Planungsdaten: Sicherungstechnischer Lageplan, mittelbar aus den Angaben in den Signaltabellen 1 und 2 zu erkennen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signalsystem</em>' containment reference.
	 * @see #setSignalsystem(Signalsystem_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_Aktiv_Schirm_AttributeGroup_Signalsystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Signalsystem'"
	 * @generated
	 */
	Signalsystem_TypeClass getSignalsystem();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getSignalsystem <em>Signalsystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalsystem</em>' containment reference.
	 * @see #getSignalsystem()
	 * @generated
	 */
	void setSignalsystem(Signalsystem_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Streuscheibe Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art und Bezeichnung der Streuscheibe eines Schirm-Signals, die der Signalsichtbestimmung zugrunde liegt. DB-Regelwerk Planungsdaten: Signaltabelle 1, Zeile 9 (erster Eintrag) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Streuscheibe Art</em>' containment reference.
	 * @see #setStreuscheibeArt(Streuscheibe_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_Aktiv_Schirm_AttributeGroup_StreuscheibeArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Streuscheibe_Art'"
	 * @generated
	 */
	Streuscheibe_Art_TypeClass getStreuscheibeArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getStreuscheibeArt <em>Streuscheibe Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Streuscheibe Art</em>' containment reference.
	 * @see #getStreuscheibeArt()
	 * @generated
	 */
	void setStreuscheibeArt(Streuscheibe_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Streuscheibe Betriebsstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der Stellung der Streuscheibe eines Schirm-Signals, die der Signalsichtbestimmung zugrunde liegt. Bei der Betriebsstellung \"...gw\" ist die jeweilige Streuscheibe gewendet. DB-Regelwerk Planungsdaten: Signaltabelle 1, Zeile 9 (zweiter Eintrag) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Streuscheibe Betriebsstellung</em>' containment reference.
	 * @see #setStreuscheibeBetriebsstellung(Streuscheibe_Betriebsstellung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_Aktiv_Schirm_AttributeGroup_StreuscheibeBetriebsstellung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Streuscheibe_Betriebsstellung'"
	 * @generated
	 */
	Streuscheibe_Betriebsstellung_TypeClass getStreuscheibeBetriebsstellung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup#getStreuscheibeBetriebsstellung <em>Streuscheibe Betriebsstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Streuscheibe Betriebsstellung</em>' containment reference.
	 * @see #getStreuscheibeBetriebsstellung()
	 * @generated
	 */
	void setStreuscheibeBetriebsstellung(Streuscheibe_Betriebsstellung_TypeClass value);

} // Signal_Real_Aktiv_Schirm_AttributeGroup
