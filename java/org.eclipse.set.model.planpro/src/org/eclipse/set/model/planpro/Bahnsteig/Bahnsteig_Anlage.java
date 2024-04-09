/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnsteig;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bahnsteig Anlage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parallel zum Gleis gelegenes Element des Tiefbaus mit befestigter Oberfläche zum Zwecke des Zugangs der Reisenden von bzw. zu den Zügen. Ein Bahnsteig kann eine oder mehrere Bahnsteigkanten besitzen. Mehr als zwei Bahnsteigkanten können dazugehören, wenn z. B. an einen Mittelbahnsteig noch ein Zungenbahnsteig anschließt. DB-Regelwerk Ril 813.0201 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Anlage#getBezeichnung <em>Bezeichnung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage#getBahnsteig_Anlage()
 * @model extendedMetaData="name='CBahnsteig_Anlage' kind='elementOnly'"
 * @generated
 */
public interface Bahnsteig_Anlage extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bahnsteig_Anlage_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage#getBahnsteig_Anlage_Bezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bahnsteig_Anlage_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Anlage#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bahnsteig_Anlage_Bezeichnung_AttributeGroup value);

} // Bahnsteig_Anlage
