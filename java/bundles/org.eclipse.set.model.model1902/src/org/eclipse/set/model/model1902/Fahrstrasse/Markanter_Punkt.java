/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Fahrstrasse;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Block_Element_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Markante_Stelle_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markanter Punkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Punkt in der Örtlichkeit, der eindeutig aufzufinden und beschreibbar ist. Hauptsächlicher Anwendungsfall ist die Definition des Gefahrpunktes oder des Endes eines Durchrutschweges. Auch der PZB-Gefahrpunkt wird damit verortet. Die eindeutige Auffindbarkeit dient der Freimeldung durch Hinsehen in der Rückfallebene. Wegen schlechter Erkennbarkeit soll eine Gleisfreimeldegrenze nur ausnahmsweise als markanter Punkt genutzt werden, wenn sich in vertretbarer Entfernung kein anderer Punkt finden lässt. Antennen von Zugbeeinflussungen (z. B. PZB-Gleismagnet) gelten nicht als markanter Punkt. Das Ende des Durchrutschweges muss nicht mit einer Freimeldegrenze zusammenfallen. Ein weiterer Anwendungsfall ist die Verortung von Freimeldegrenzen als Hilfestellung für deren Montage. Markante Punkte sind: Signal (insbesondere Haupt- und Sperrsignal, Grenzzeichen, Schutzhaltsignal), Weichenspitze (W Kr Gsp Komponente), Gleissperre (W Kr Gsp Komponente), Kante des Gefahrraums an BÜ (Sonstiger Punkt), Besondere Objekte, z. B. an Deckungsstellen (derzeit noch nicht modelliert), Gleisfreimeldegrenze (nur ausnahmsweise), Beginn eines Bahnsteigs (Sonstiger Punkt), Zugschluss bzw. -spitze (Sonstiger Punkt), Sonstige Punkte (Sonstiger Punkt). DB-Regelwerk Ende Durchrutschweg: Durchrutschwegtabelle, Spalte 2: \"bis\"; Gefahrpunkt: Gefahrpunkttabelle, Spalte 2: \"maßgebender Gefahrpunkt\"; Verortung Gleisfreimeldegrenze: Bemaßungsangabe im sicherungstechnischen Lageplan und Achszählpunkttabelle, Spalte 17: \"Bezugspunkt\". 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Markanter_Punkt#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Markanter_Punkt#getIDDWegErlaubnisabhaengig <em>IDD Weg Erlaubnisabhaengig</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Markanter_Punkt#getIDMarkanteStelle <em>ID Markante Stelle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getMarkanter_Punkt()
 * @model extendedMetaData="name='CMarkanter_Punkt' kind='elementOnly'"
 * @generated
 */
public interface Markanter_Punkt extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Markanter_Punkt_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getMarkanter_Punkt_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Markanter_Punkt_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Markanter_Punkt#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Markanter_Punkt_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDD Weg Erlaubnisabhaengig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abhängigkeit aller DWege - mit diesem Markanten Punkt als Ziel - von der Stellung der Erlaubnis der Block Anlage, an dessen Ende sich das verlinkte Block Element befindet. Der DWeg ist nur einstellbar, wenn die Erlaubnis vom Block Element Richtung Strecke zeigt. DB-Regelwerk Streckenblocktabelle, Spalte 11: \"D-Weg erlaubnisabhängig\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDD Weg Erlaubnisabhaengig</em>' containment reference.
	 * @see #setIDDWegErlaubnisabhaengig(ID_Block_Element_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getMarkanter_Punkt_IDDWegErlaubnisabhaengig()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_DWeg_Erlaubnisabhaengig'"
	 * @generated
	 */
	ID_Block_Element_TypeClass getIDDWegErlaubnisabhaengig();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Markanter_Punkt#getIDDWegErlaubnisabhaengig <em>IDD Weg Erlaubnisabhaengig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDD Weg Erlaubnisabhaengig</em>' containment reference.
	 * @see #getIDDWegErlaubnisabhaengig()
	 * @generated
	 */
	void setIDDWegErlaubnisabhaengig(ID_Block_Element_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Markante Stelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Punkt Objekt, das als Markanter Punkt dient. DB-Regelwerk siehe Markanter Punkt
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Markante Stelle</em>' containment reference.
	 * @see #setIDMarkanteStelle(ID_Markante_Stelle_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getMarkanter_Punkt_IDMarkanteStelle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Markante_Stelle'"
	 * @generated
	 */
	ID_Markante_Stelle_TypeClass getIDMarkanteStelle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Markanter_Punkt#getIDMarkanteStelle <em>ID Markante Stelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Markante Stelle</em>' containment reference.
	 * @see #getIDMarkanteStelle()
	 * @generated
	 */
	void setIDMarkanteStelle(ID_Markante_Stelle_TypeClass value);

} // Markanter_Punkt
