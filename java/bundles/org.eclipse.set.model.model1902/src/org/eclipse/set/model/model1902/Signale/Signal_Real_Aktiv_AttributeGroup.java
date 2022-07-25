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

import org.eclipse.set.model.model1902.Verweise.ID_Stellelement_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Real Aktiv Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup#getAutoEinstellung <em>Auto Einstellung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup#getIDStellelement <em>ID Stellelement</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup#getSignalFunktion <em>Signal Funktion</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup#getSignalsichtErreichbar <em>Signalsicht Erreichbar</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup#getSignalsichtMindest <em>Signalsicht Mindest</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup#getSignalsichtSoll <em>Signalsicht Soll</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup#getSonstigeZulaessigeAnordnung <em>Sonstige Zulaessige Anordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup#getTunnelsignal <em>Tunnelsignal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_Aktiv_AttributeGroup()
 * @model extendedMetaData="name='CSignal_Real_Aktiv' kind='elementOnly'"
 * @generated
 */
public interface Signal_Real_Aktiv_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Auto Einstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zusätzliche Angabe zu Aktiven Signalen, die sich selbsttätig stellen können. Dabei wird unterschieden zwischen Signalen mit Signalselbststellbetrieb (Sb) und in der Zuglenkung (ZL). DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung, mittelbar aus Angaben in der Zugstraßentabelle zu erkennen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Einstellung</em>' containment reference.
	 * @see #setAutoEinstellung(Auto_Einstellung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_Aktiv_AttributeGroup_AutoEinstellung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Auto_Einstellung'"
	 * @generated
	 */
	Auto_Einstellung_TypeClass getAutoEinstellung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup#getAutoEinstellung <em>Auto Einstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Einstellung</em>' containment reference.
	 * @see #getAutoEinstellung()
	 * @generated
	 */
	void setAutoEinstellung(Auto_Einstellung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Stellelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Objekt Stellelement zur Zusammenfassung von Eigenschaften der Objekte BUE Schnittstelle, PZB Element, Schluesselsperre, Signal, W Kr Gsp Element. Das Stellelement enthält Informationen über den energetischen und logischen Anschluss der Objekte. Für das PZB Element ist der Verweis nur zu füllen, wenn das PZB_Element eine GÜ ist. DB-Regelwerk Bisher ohne eindeutige Darstellung 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Stellelement</em>' containment reference.
	 * @see #setIDStellelement(ID_Stellelement_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_Aktiv_AttributeGroup_IDStellelement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Stellelement'"
	 * @generated
	 */
	ID_Stellelement_TypeClass getIDStellelement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup#getIDStellelement <em>ID Stellelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Stellelement</em>' containment reference.
	 * @see #getIDStellelement()
	 * @generated
	 */
	void setIDStellelement(ID_Stellelement_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Signal Funktion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der betrieblichen Funktion eines Aktiven Signals für Zugfahrten. Aktive Signale sind Signale, an denen mindestens ein Signalbegriff schaltbar ist. Hauptsignale und Mehrabschnittssignale werden dabei detailliert in Einfahr-, Ausfahr-, Zwischen-, Nachrück-, Block-, Deckungs-, Zugdeckungs- oder Gruppensignale bzw. Kombinationen aus diesen betrieblichen Funktionen unterteilt. Von den anderen aktiven Signalen wird nur noch das Zugzielsignal (z.B. hohes Sperrsignal als Zielsignal bei Zugfahrten) mit einem eigenen Attribut hervorgehoben, alle weiteren Aktiven Signale werden unter \"andere\" zusammengefasst. DB-Regelwerk 301, 819.20, Planungsdaten: im bisherigen PT 1 nur bei Signalen im Geltungsbereich der Ril 819.20, Tabelle für Signalabstände und Schutzstrecken, sonst ohne eindeutige Darstellung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Funktion</em>' containment reference.
	 * @see #setSignalFunktion(Signal_Funktion_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_Aktiv_AttributeGroup_SignalFunktion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Signal_Funktion'"
	 * @generated
	 */
	Signal_Funktion_TypeClass getSignalFunktion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup#getSignalFunktion <em>Signal Funktion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Funktion</em>' containment reference.
	 * @see #getSignalFunktion()
	 * @generated
	 */
	void setSignalFunktion(Signal_Funktion_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Signalsicht Erreichbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tatsächlich erreichbare Signalsicht innerhalb der Sollsignalsicht. Die Signalsicht beschreibt die Entfernung, ab der ein Aktives Signal eindeutig erkennbar sein soll (Sollsignalsicht) bzw. muss (Mindestsignalsicht), so dass vom Triebfahrzeugführer grundsätzliche Handlungsweisen daraus ableitbar sind. Die erreichbare Signalsicht darf unter bestimmten Voraussetzungen kleiner als die Sollsignalsicht, jedoch nur mit besonderen Maßnahmen kleiner als die Mindestsignalsicht sein. Die Signalsicht ist an das gesamte Signal gekoppelt, das bedeutet jedoch nicht, dass jeder Signalbegriff von Beginn der Signalsicht an vollständig gelesen werden muss - die Festlegungen dafür finden sich in den zugehörigen detaillierten Regelzeichnungen oder anderen Zulassungsdokumenten. DB-Regelwerk 819.02, 819.03, Planungsdaten: im bisherigen PT1 ohne eindeutige Darstellung, ergänzt die Einträge in Zeile 7 der Signaltabelle 1 um den Wert der am konkreten Ort erreichbaren Signalsicht 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signalsicht Erreichbar</em>' containment reference.
	 * @see #setSignalsichtErreichbar(Signalsicht_Erreichbar_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_Aktiv_AttributeGroup_SignalsichtErreichbar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signalsicht_Erreichbar'"
	 * @generated
	 */
	Signalsicht_Erreichbar_TypeClass getSignalsichtErreichbar();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup#getSignalsichtErreichbar <em>Signalsicht Erreichbar</em>}' containment reference.
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
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_Aktiv_AttributeGroup_SignalsichtMindest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signalsicht_Mindest'"
	 * @generated
	 */
	Signalsicht_Mindest_TypeClass getSignalsichtMindest();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup#getSignalsichtMindest <em>Signalsicht Mindest</em>}' containment reference.
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
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_Aktiv_AttributeGroup_SignalsichtSoll()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signalsicht_Soll'"
	 * @generated
	 */
	Signalsicht_Soll_TypeClass getSignalsichtSoll();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup#getSignalsichtSoll <em>Signalsicht Soll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalsicht Soll</em>' containment reference.
	 * @see #getSignalsichtSoll()
	 * @generated
	 */
	void setSignalsichtSoll(Signalsicht_Soll_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Sonstige Zulaessige Anordnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anordnung von Aktiven Signalen bei mehreren parallelen Strecken oder beim Zusammenlauf von Strecken. DB-Regelwerk 819.0202 A03, Planungsdaten: Signaltabelle 1, Zeile 2. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sonstige Zulaessige Anordnung</em>' containment reference.
	 * @see #setSonstigeZulaessigeAnordnung(Sonstige_Zulaessige_Anordnung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_Aktiv_AttributeGroup_SonstigeZulaessigeAnordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Sonstige_Zulaessige_Anordnung'"
	 * @generated
	 */
	Sonstige_Zulaessige_Anordnung_TypeClass getSonstigeZulaessigeAnordnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup#getSonstigeZulaessigeAnordnung <em>Sonstige Zulaessige Anordnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sonstige Zulaessige Anordnung</em>' containment reference.
	 * @see #getSonstigeZulaessigeAnordnung()
	 * @generated
	 */
	void setSonstigeZulaessigeAnordnung(Sonstige_Zulaessige_Anordnung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Tunnelsignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enthält zusätzliche Angaben zu Aktiven Signalen mit schaltbaren Signalbegriffen bezüglich der Nachtschaltung. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tunnelsignal</em>' containment reference.
	 * @see #setTunnelsignal(Tunnelsignal_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_Aktiv_AttributeGroup_Tunnelsignal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Tunnelsignal'"
	 * @generated
	 */
	Tunnelsignal_TypeClass getTunnelsignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_Aktiv_AttributeGroup#getTunnelsignal <em>Tunnelsignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tunnelsignal</em>' containment reference.
	 * @see #getTunnelsignal()
	 * @generated
	 */
	void setTunnelsignal(Tunnelsignal_TypeClass value);

} // Signal_Real_Aktiv_AttributeGroup
