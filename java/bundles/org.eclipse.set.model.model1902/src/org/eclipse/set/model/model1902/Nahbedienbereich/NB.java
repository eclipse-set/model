/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Nahbedienbereich;

import org.eclipse.set.model.model1902.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Nahbedienbereich. Teilbereich innerhalb eines ESTW-Stellbereichs, für den zeitweise die Zuständigkeit vom Fahrdienstleiter an einen örtlichen Bediener zur Durchführung von Rangierbewegungen abgegeben werden kann. Die Kommunikation zwischen Fahrdienstleiter und Bediener erfolgt über entsprechende Bedieneinrichtung(en). Mit Abgabe der Nahbedienung hat der Fahrdienstleiter auf diesen Bereich keinen Zugriff; die Verantwortung liegt beim örtlichen Bediener. Mit Rückgabe der Nahbedienung geht die Verantwortung vom Bediener wieder an den Fahrdienstleiter. Für die Rückgabe der Nahbedienung können bestimmte Voraussetzungen erforderlich sein. Für die Abgabe bzw. Rückgabe der Nahbedienung werden in der Literatur auch die Begriffe \"Einschalten\" und \"Ausschalten\" verwendet. Der Nahbedienbereich muss vom übrigen Stellwerksbereich durch Flankenschutzmaßnahmen abgegrenzt werden. Jeder Nahbedienbereich hat immer mindestens eine NB Zone. Bei einem Nahbedienbereich mit der Funktionalität eines abgesetzten \"Rangierstellwerkes\" (NB-R) können Weichen mit elektrischem Antrieb umgestellt und innerhalb des NB Fahrten mit Rangierstraßen durchgeführt werden. DB-Regelwerk Für die Planung von Nahbedienbereichen exisitert bei der DB AG kein Regelwerk.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB#getNBAllg <em>NB Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB#getNBFunktionalitaetNBR <em>NB Funktionalitaet NBR</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB()
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
	 * @see #setBezeichnung(Bezeichnung_Element_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bezeichnung_Element_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bezeichnung_Element_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>NB Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NB Allg</em>' containment reference.
	 * @see #setNBAllg(NB_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB_NBAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NB_Allg'"
	 * @generated
	 */
	NB_Allg_AttributeGroup getNBAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB#getNBAllg <em>NB Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NB Allg</em>' containment reference.
	 * @see #getNBAllg()
	 * @generated
	 */
	void setNBAllg(NB_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>NB Funktionalitaet NBR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NB Funktionalitaet NBR</em>' containment reference.
	 * @see #setNBFunktionalitaetNBR(NB_Funktionalitaet_NB_R_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB_NBFunktionalitaetNBR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NB_Funktionalitaet_NB_R'"
	 * @generated
	 */
	NB_Funktionalitaet_NB_R_AttributeGroup getNBFunktionalitaetNBR();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB#getNBFunktionalitaetNBR <em>NB Funktionalitaet NBR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NB Funktionalitaet NBR</em>' containment reference.
	 * @see #getNBFunktionalitaetNBR()
	 * @generated
	 */
	void setNBFunktionalitaetNBR(NB_Funktionalitaet_NB_R_AttributeGroup value);

} // NB
