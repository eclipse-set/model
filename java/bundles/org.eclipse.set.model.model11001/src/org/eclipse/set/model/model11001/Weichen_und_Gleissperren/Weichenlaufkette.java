/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Weichen_und_Gleissperren;

import org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weichenlaufkette</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Logisches Objekt von mehreren durch Antriebe stellbaren Fahrwegelementen (Weichen, Gleissperren, sonstigen stellbaren Elementen), deren Umlauf automatisch bei einer entsprechenden Anforderung (z.B. Fahrstraße) erfolgt. Diese stellbaren Elemente können nur dann automatisch gestellt werden, wenn sie auch einer Weichenlaufkette (WLK) zugeordnet sind. Jedes stellbare Element wird genau einer WLK zugeordnet. Durch Sperren der WLK kann dieser automatische Umlauf verhindert werden. Innerhalb von Weichenlaufketten sind dabei folgende Elemente zulässig: Weichen, Gleissperren und Sonderelemente, die automatisch umlaufen sollen. Für die Bedienung von Ersatzaufträgen des Typs 2 (EE2, VE2, LE2) an Hauptsignalen müssen eine oder mehrere Weichenlaufketten gesperrt werden. Zur Reduzierung betrieblicher Behinderungen werden oftmals mehrere Weichenlaufketten in einer Betriebsstelle eingerichtet. DB-Regelwerk Die Bezeichnung der Weichenlaufkette wird gemäß Ril 819.0603 in der Form LKn (n = laufende Nummer) gebildet und in der Attributgruppe Bezeichnung abgebildet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette#getBezeichnung <em>Bezeichnung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getWeichenlaufkette()
 * @model extendedMetaData="name='CWeichenlaufkette' kind='elementOnly'"
 * @generated
 */
public interface Weichenlaufkette extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bezeichnung_Element_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getWeichenlaufkette_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bezeichnung_Element_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichenlaufkette#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bezeichnung_Element_AttributeGroup value);

} // Weichenlaufkette
