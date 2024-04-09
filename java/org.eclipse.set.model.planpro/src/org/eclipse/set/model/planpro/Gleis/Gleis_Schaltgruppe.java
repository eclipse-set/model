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

import org.eclipse.set.model.planpro.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gleis Schaltgruppe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Einzeln schaltbarer Abschnitt einer Fahrleitungsanlage, der mit Fahrstrom versorgt wird. Das Objekt wird vom Grundsatz dem Übersichtsplan mit Schaltanweisung (Ebsü) des elektrotechnischen Dienstes entnommen. Zur Beschreibung von Fahrleitungsschaltgruppen in der ESTW-Logik zum Zwecke der Merkhinweiseingabe für Befahrbarkeitssperren sind die betroffenen Gleisabschnitte zu beachten. Die Grenzen einer Schaltgruppe müssen nicht mit den Grenzen der Gleisabschnitte übereinstimmen. Wenn ein angeschnittener Gleisabschnitt vorhanden ist, wird dieser in der Befahrbarkeitssperre berücksichtigt. Die Schaltgruppen können sich dann auch überlagern. In der Regel sollten Überlagerungen von Schaltgruppen vermieden werden, indem ein Gleisabschnitt nur einer Schaltgruppe zugeordnet wird. Zwischen Bereichen verschiedener Schaltgruppen können aus vorgenanntem Grund auch Lücken sein. Für Schaltgruppen, die verschiedenen Fahrstromsystemen zugeordnet werden können (Systemwechselstellen), ist für jedes Fahrstromsystem je eine Instanz mit gleichem Elementnamen und gleichen Bereichsgrenzen anzulegen. Die Zuordnung der Schaltgruppen zu den Gleisabschnitten erfolgt über die topologischen Kanten als ein Bereichsobjekt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Gleis.Gleis_Schaltgruppe#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Gleis.Gleis_Schaltgruppe#getFahrstrom <em>Fahrstrom</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Gleis.GleisPackage#getGleis_Schaltgruppe()
 * @model extendedMetaData="name='CGleis_Schaltgruppe' kind='elementOnly'"
 * @generated
 */
public interface Gleis_Schaltgruppe extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bezeichnung_Element_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Gleis.GleisPackage#getGleis_Schaltgruppe_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bezeichnung_Element_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Schaltgruppe#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bezeichnung_Element_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Fahrstrom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des für die Schaltgruppe verwendeten Fahrstromsystems. Falls als ENUM-Wert \"sonstige\" angegeben wird, ist das Fahrstromsystem mittels eines Bearbeitungsvermerks gesondert zu erläutern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fahrstrom</em>' containment reference.
	 * @see #setFahrstrom(Fahrstrom_TypeClass)
	 * @see org.eclipse.set.model.planpro.Gleis.GleisPackage#getGleis_Schaltgruppe_Fahrstrom()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fahrstrom'"
	 * @generated
	 */
	Fahrstrom_TypeClass getFahrstrom();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Schaltgruppe#getFahrstrom <em>Fahrstrom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fahrstrom</em>' containment reference.
	 * @see #getFahrstrom()
	 * @generated
	 */
	void setFahrstrom(Fahrstrom_TypeClass value);

} // Gleis_Schaltgruppe
