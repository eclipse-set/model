/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Gleis;

import org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gleis Bezeichnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Träger der betrieblichen Bezeichnung eines Gleises. Ein Gleis erhält dann eine Bezeichnung, wenn es für die betriebliche Nutzung benötigt wird. Topologische Knoten (z. B. Weichen) unterbrechen nicht die Gleisbezeichnung. Für die durchgehenden Hauptgleise in einem Bahnhof wird das Bereichsobjekt für das Gleis in der Regel von einem Einfahrsignal bis zum Einfahrsignal der Gegenrichtung modelliert. Wenn das Gleis hinsichtlich der betrieblichen Bezeichnung geteilt ist (z.B. Gleis 1 und Gleis 21) sind getrennte Bereichsobjekte für diese Gleise anzulegen. Weitere Bezeichnungen von Bahnhofsgleisen werden in der Regel zwischen topologischen Knoten gebildet, wobei auch weitere Knoten enthalten sein können. Gleise, die aus betrieblicher Sicht keine Bezeichnung benötigen (z. B. Gleisverbindungen), erhalten keine Gleisbezeichnung. Streckengleise werden in der Regel zwischen den Bahnhofsgrenzen (ggf. auch andere Zugmeldestellen) durchgehend bezeichnet. Die Klammersetzung der Bezeichnung von Streckengleisen ist Bestandteil der Bezeichnung das Steckengleises.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Gleis.Gleis_Bezeichnung#getBezeichnung <em>Bezeichnung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Gleis.GleisPackage#getGleis_Bezeichnung()
 * @model extendedMetaData="name='CGleis_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Gleis_Bezeichnung extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Gleis_Bezeichnung_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Gleis.GleisPackage#getGleis_Bezeichnung_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Gleis_Bezeichnung_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Bezeichnung#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Gleis_Bezeichnung_Bezeichnung_AttributeGroup value);

} // Gleis_Bezeichnung
