/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Nahbedienung;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Nahstellbereich. Teilbereich innerhalb eines ESTW-Stellbereichs, für den zeitweise die Zuständigkeit vom Fahrdienstleiter an einen örtlichen Bediener zur Durchführung von Rangierbewegungen abgegeben werden kann. Die Kommunikation zwischen Fahrdienstleiter und Bediener erfolgt über entsprechende Bedieneinrichtung(en). Mit Abgabe der Nahbedienung hat der Fahrdienstleiter auf diesen Bereich keinen Zugriff; die Verantwortung liegt beim örtlichen Bediener. Mit Rückgabe der Nahbedienung geht die Verantwortung vom Bediener wieder an den Fahrdienstleiter. Für die Rückgabe der Nahbedienung können bestimmte Voraussetzungen erforderlich sein. Für die Abgabe bzw. Rückgabe der Nahbedienung werden in der Literatur auch die Begriffe \"Einschalten\" und \"Ausschalten\" verwendet. Der Nahstellbereich muss vom übrigen Stellwerksbereich durch Flankenschutzmaßnahmen abgegrenzt werden. Jeder Nahstellbereich hat immer mindestens eine NB Zone. Bei einem Nahstellbereich mit der Funktionalität eines abgesetzten \"Rangierstellwerkes\" (NB-R) können Weichen mit elektrischem Antrieb umgestellt und innerhalb des NB Fahrten mit Rangierstraßen durchgeführt werden. DB-Regelwerk Für die Planung von Nahstellbereichen exisitert bei der DB AG kein Regelwerk.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB#getNBArt <em>NB Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB#getNBFunktionalitaetNBR <em>NB Funktionalitaet NBR</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB()
 * @model extendedMetaData="name='CNB' kind='elementOnly'"
 * @generated
 */
public interface NB extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(NB_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	NB_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(NB_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>NB Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Festlegung der innerhalb des Nahstellbereiches möglichen Bedienhandlungen. Die Art des Nahstellbereiches (NB) entscheidet über die innerhalb des NB möglichen Funktionalitäten: G: Signale zeigen Kl/Sh1; nur ortsbediente Weichen umstellbar; BÜ-Bedienung mit Rangierschalter; W: wie G, zusätzlich Umstellung von mit Antrieben ausgerüsteter Weichen möglich; R: wie W, zusätzlich Fahren mit Rangierstraßen innerhalb des NB. In Abhängigkeit der gewählten Art des Nahstellbereiches werden Funktionalitäten und physische Ausbildung von NB Bedien Anzeige Element festgelegt. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es geht aus dem zugehörigen Lastenheft hervor, dass dem LST-Fachplaner jedoch nicht zur Verfügung steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NB Art</em>' containment reference.
	 * @see #setNBArt(NB_Art_TypeClass)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_NBArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NB_Art'"
	 * @generated
	 */
	NB_Art_TypeClass getNBArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB#getNBArt <em>NB Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NB Art</em>' containment reference.
	 * @see #getNBArt()
	 * @generated
	 */
	void setNBArt(NB_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>NB Funktionalitaet NBR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NB Funktionalitaet NBR</em>' containment reference.
	 * @see #setNBFunktionalitaetNBR(NB_Funktionalitaet_NB_R_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_NBFunktionalitaetNBR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NB_Funktionalitaet_NB_R'"
	 * @generated
	 */
	NB_Funktionalitaet_NB_R_AttributeGroup getNBFunktionalitaetNBR();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB#getNBFunktionalitaetNBR <em>NB Funktionalitaet NBR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NB Funktionalitaet NBR</em>' containment reference.
	 * @see #getNBFunktionalitaetNBR()
	 * @generated
	 */
	void setNBFunktionalitaetNBR(NB_Funktionalitaet_NB_R_AttributeGroup value);

} // NB
